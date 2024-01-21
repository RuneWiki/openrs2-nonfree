import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_3;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
	public static int anInt933 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)Lclient!oc;")
	public static Class70 method723(@OriginalArg(1) int arg0) {
		return Static49.aClass70Array21[arg0].method2045() <= 0 ? Static136.aClass70Array48[arg0] : Static207.method3296(new Class70[] { Static136.aClass70Array48[arg0], Static15.aClass70_156, Static49.aClass70Array21[arg0] });
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIZ)I")
	public static int method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) Static145.aClass40_10.method1029((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local10.anIntArray62.length; local31++) {
				if (arg1 == local10.anIntArray61[local31]) {
					local29 += local10.anIntArray62[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
	public static void method727() {
		for (@Pc(7) int local7 = 0; local7 < Static134.anInt2682; local7++) {
			@Pc(13) int local13 = Static108.anIntArray130[local7];
			@Pc(17) Class26_Sub2_Sub1 local17 = Static146.aClass26_Sub2_Sub1Array1[local13];
			@Pc(21) int local21 = Static48.aClass3_Sub4_Sub1_43.method1278();
			if ((local21 & 0x1) != 0) {
				local21 += Static48.aClass3_Sub4_Sub1_43.method1278() << 8;
			}
			Static132.method1844(local13, local21, local17);
		}
	}
}
