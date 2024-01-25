import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
	public static int anInt5680;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
	public static int anInt5681;

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
	public static int anInt5683;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "[I")
	public static final int[] anIntArray556 = new int[3];

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "Lclient!ha;")
	public static final Class10_Sub8_Sub2 aClass10_Sub8_Sub2_2 = new Class10_Sub8_Sub2(5000);

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
	public static final int anInt5682 = 1403;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
	public static void method4522(@OriginalArg(0) int arg0) {
		@Pc(14) Class10_Sub1_Sub17 local14 = Static154.method2630(8, arg0);
		local14.method5346();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)Lclient!je;")
	public static Class127 method4523(@OriginalArg(1) int arg0) {
		@Pc(13) Class127[] local13 = Static153.method2606();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (arg0 == local13[local15].anInt3831) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)Lclient!ne;")
	public static Class24_Sub1 method4524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass24_Sub1_1;
	}
}
