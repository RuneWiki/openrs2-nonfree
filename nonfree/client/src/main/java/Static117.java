import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!ha;")
	public static Class137 aClass137_46;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "F")
	public static float aFloat269 = 0.0F;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)I")
	public static int method9144() {
		return Static453.anInt7941 == 1 ? Static497.anInt10443 : Static503.anInt8861;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZ)I")
	public static int method9146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class14_Sub50 local10 = Static250.method3683(arg0, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray698.length; local23++) {
				if (local10.anIntArray699[local23] == arg1) {
					local21 += local10.anIntArray698[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
	public static int method9147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static454.method6574(arg1 - 1, arg0 - 1) + Static454.method6574(arg1 + 1, arg0 + -1) + Static454.method6574(arg1 - 1, arg0 + 1) + Static454.method6574(arg1 + 1, arg0 - -1);
		@Pc(73) int local73 = Static454.method6574(arg1 - 1, arg0) + Static454.method6574(arg1 + 1, arg0) + Static454.method6574(arg1, arg0 + -1) + Static454.method6574(arg1, arg0 + 1);
		@Pc(78) int local78 = Static454.method6574(arg1, arg0);
		return local78 / 4 + local73 / 8 + local42 / 16;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)Z")
	public static boolean method9148() {
		try {
			if (Static507.anInt8961 == 2) {
				if (Static114.aClass14_Sub51_1 == null) {
					Static114.aClass14_Sub51_1 = Static686.method8458(Static478.aClass386_105, Static27.anInt690, Static445.anInt6142);
					if (Static114.aClass14_Sub51_1 == null) {
						return false;
					}
				}
				if (Static433.aClass129_2 == null) {
					Static433.aClass129_2 = new Class129(Static613.aClass386_127, Static627.aClass386_133);
				}
				@Pc(36) Class14_Sub5_Sub2 local36 = Static558.aClass14_Sub5_Sub2_2;
				if (Static628.aClass14_Sub5_Sub2_4 != null) {
					local36 = Static628.aClass14_Sub5_Sub2_4;
				}
				if (local36.method3900(Static437.aClass386_99, Static433.aClass129_2, Static114.aClass14_Sub51_1)) {
					Static558.aClass14_Sub5_Sub2_2 = local36;
					Static558.aClass14_Sub5_Sub2_2.method3898();
					@Pc(66) int local66;
					if (Static613.anInt10339 <= 0) {
						Static507.anInt8961 = 0;
						Static558.aClass14_Sub5_Sub2_2.method3904(Static352.anInt6508);
						for (local66 = 0; local66 < Static76.anIntArray127.length; local66++) {
							Static558.aClass14_Sub5_Sub2_2.method3894(local66, Static76.anIntArray127[local66]);
							Static76.anIntArray127[local66] = 255;
						}
					} else {
						Static507.anInt8961 = 3;
						Static558.aClass14_Sub5_Sub2_2.method3904(Static352.anInt6508 < Static613.anInt10339 ? Static352.anInt6508 : Static613.anInt10339);
						for (local66 = 0; local66 < Static76.anIntArray127.length; local66++) {
							Static558.aClass14_Sub5_Sub2_2.method3894(local66, Static76.anIntArray127[local66]);
							Static76.anIntArray127[local66] = 255;
						}
					}
					if (Static628.aClass14_Sub5_Sub2_4 == null) {
						if (Static77.aLong42 <= 0L) {
							Static558.aClass14_Sub5_Sub2_2.method3895(Static114.aClass14_Sub51_1, Static348.aBoolean440);
						} else {
							Static558.aClass14_Sub5_Sub2_2.method3907(Static114.aClass14_Sub51_1, Static77.aLong42, Static348.aBoolean440);
						}
					}
					if (Static43.aClass112_1 != null) {
						Static43.aClass112_1.method5376(Static558.aClass14_Sub5_Sub2_2);
					}
					Static114.aClass14_Sub51_1 = null;
					Static478.aClass386_105 = null;
					Static77.aLong42 = 0L;
					Static628.aClass14_Sub5_Sub2_4 = null;
					Static433.aClass129_2 = null;
					return true;
				}
			}
		} catch (@Pc(168) Exception local168) {
			local168.printStackTrace();
			Static558.aClass14_Sub5_Sub2_2.method3899();
			Static507.anInt8961 = 0;
			Static628.aClass14_Sub5_Sub2_4 = null;
			Static478.aClass386_105 = null;
			Static433.aClass129_2 = null;
			Static114.aClass14_Sub51_1 = null;
		}
		return false;
	}
}
