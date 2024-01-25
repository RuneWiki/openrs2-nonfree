import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "[Lclient!sb;")
	public static final Class219[] aClass219Array1 = new Class219[30];

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public static int anInt4968 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z")
	public static boolean method3889(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static321.method4319(arg0, arg1) | Static237.method3397(arg1, arg0)) & Static378.method2423(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method3890() {
		if (!Static371.aBoolean701) {
			return;
		}
		while (true) {
			while (Static22.aClass147_Sub1Array1.length > Static61.anInt1459) {
				@Pc(21) Class147_Sub1 local21 = Static22.aClass147_Sub1Array1[Static61.anInt1459];
				if (local21 != null && local21.anInt6664 == -1) {
					if (Static310.aClass1_Sub42_2 == null) {
						Static310.aClass1_Sub42_2 = Static98.aClass66_1.method1461(local21.aString73);
					}
					@Pc(44) int local44 = Static310.aClass1_Sub42_2.anInt7261;
					if (local44 == -1) {
						return;
					}
					Static310.aClass1_Sub42_2 = null;
					Static61.anInt1459++;
					local21.anInt6664 = local44;
				} else {
					Static61.anInt1459++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
	public static void method3891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass25_Sub1_2 != null) {
			local7.aClass25_Sub1_2 = null;
		}
		if (local7.aClass25_Sub1_3 != null) {
			local7.aClass25_Sub1_3 = null;
		}
	}
}
