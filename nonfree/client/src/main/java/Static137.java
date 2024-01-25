import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!eja", name = "k", descriptor = "Z")
	public static boolean aBoolean194;

	@OriginalMember(owner = "client!eja", name = "i", descriptor = "Lclient!si;")
	public static final Class335 aClass335_10 = new Class335(8);

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "(II)I")
	public static int method2401(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local13 * local27 >> 12;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lclient!uh;I)V")
	public static void method2402(@OriginalArg(0) Class15_Sub9 arg0) {
		arg0.aClass15_Sub3_22 = null;
		@Pc(17) int local17 = arg0.aClass15_Sub6Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass15_Sub6Array1[local19].aBoolean200 = false;
		}
		@Pc(37) Class60[] local37 = Class2_Sub15_Sub7_Sub1.aClass60Array1;
		synchronized (Class2_Sub15_Sub7_Sub1.aClass60Array1) {
			if (local17 < Class2_Sub15_Sub7_Sub1.aClass60Array1.length && Static490.anIntArray442[local17] < 200) {
				Class2_Sub15_Sub7_Sub1.aClass60Array1[local17].method1551(arg0);
				@Pc(58) int local58 = Static490.anIntArray442[local17]++;
			}
		}
	}
}
