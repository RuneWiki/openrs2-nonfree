import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public static int anInt6906;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public static int anInt6907;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method5772() {
		try {
			if (Static140.anInt2527 == 1) {
				@Pc(15) int local15 = Static143.aClass6_Sub19_Sub4_7.method7707();
				if (local15 > 0 && Static143.aClass6_Sub19_Sub4_7.method7709()) {
					local15 -= Static221.anInt3764;
					if (local15 < 0) {
						local15 = 0;
					}
					Static143.aClass6_Sub19_Sub4_7.method7739(local15);
				} else {
					Static143.aClass6_Sub19_Sub4_7.method7702();
					Static143.aClass6_Sub19_Sub4_7.method7729();
					Static485.aClass152_1 = null;
					Static224.aClass6_Sub46_1 = null;
					if (Static466.aClass251_130 == null) {
						Static140.anInt2527 = 0;
					} else {
						Static140.anInt2527 = 2;
					}
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static143.aClass6_Sub19_Sub4_7.method7702();
			Static224.aClass6_Sub46_1 = null;
			Static485.aClass152_1 = null;
			Static466.aClass251_130 = null;
			Static140.anInt2527 = 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V")
	public static void method5774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static480.aClass6_Sub37_Sub1_1.anInt6047 != 0 && arg2 != 0 && Static231.anInt3927 < 50 && arg1 != -1) {
			Static103.aClass172Array7[Static231.anInt3927++] = new Class172((byte) 1, arg1, arg2, arg0, arg3, arg4);
		}
	}
}
