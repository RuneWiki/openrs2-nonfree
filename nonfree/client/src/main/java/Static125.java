import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "[Lclient!ak;")
	public static Class1_Sub2_Sub1_Sub1[] aClass1_Sub2_Sub1_Sub1Array3;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
	public static int anInt3560 = 0;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1244 = Static64.method1101("www)2wtrc");

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "[J")
	public static long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	public static int anInt3564 = 0;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1245 = Static64.method1101(" (X");

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
	public static int anInt3565 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZ)V")
	public static void method2775(@OriginalArg(1) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static58.anInt1372; local7++) {
			@Pc(15) Class5_Sub1_Sub2 local15 = Static168.aClass5_Sub1_Sub2Array1[Static202.anIntArray326[local7]];
			@Pc(24) long local24 = (long) Static202.anIntArray326[local7] << 32 | 0x20000000L;
			if (local15 != null && local15.method2793() && arg0 == local15.aClass27_1.aBoolean39 && local15.aClass27_1.method593()) {
				@Pc(53) int local53 = local15.anInt3624 >> 7;
				@Pc(58) int local58 = local15.anInt3598 >> 7;
				if (local53 >= 0 && local53 < 104 && local58 >= 0 && local58 < 104) {
					if (local15.anInt3584 == 1 && (local15.anInt3624 & 0x7F) == 64 && (local15.anInt3598 & 0x7F) == 64) {
						if (Static113.anIntArrayArray11[local53][local58] == Static10.anInt217) {
							continue;
						}
						Static113.anIntArrayArray11[local53][local58] = Static10.anInt217;
					}
					if (!local15.aClass27_1.aBoolean42) {
						local24 |= Long.MIN_VALUE;
					}
					local15.anInt3577 = Static26.method2454(Static197.anInt2422, local15.anInt3584 * 64 + local15.anInt3598 - 64, (local15.anInt3584 + -1) * 64 + local15.anInt3624);
					Static178.method3022(Static197.anInt2422, local15.anInt3624, local15.anInt3598, local15.anInt3577, local15.anInt3584 * 64 + 60 - 64, local15, local15.anInt3575, local24, local15.aBoolean167);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
	public static void method2776(@OriginalArg(0) int arg0) {
		if (Static54.method933(arg0)) {
			Static46.method826(-1, Static64.aClass71ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ib;III)V")
	public static void method2779(@OriginalArg(1) Class5_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 == Static73.aClass5_Sub1_Sub1_1 || Static202.anInt4289 >= 400) {
			return;
		}
		@Pc(56) Class51 local56;
		if (arg0.anInt1946 == 0) {
			local56 = Static150.method2574(new Class51[] { arg0.aClass51_619, Static190.method3187(Static73.aClass5_Sub1_Sub1_1.anInt1941, arg0.anInt1941), aClass51_1245, Static36.aClass51_245, Static27.method511(arg0.anInt1941), Static92.aClass51_657 });
		} else {
			local56 = Static150.method2574(new Class51[] { arg0.aClass51_619, aClass51_1245, Static111.aClass51_804, Static27.method511(arg0.anInt1946), Static92.aClass51_657 });
		}
		@Pc(131) int local131;
		if (Static54.anInt1264 == 1) {
			Static151.method2611(Static150.method2574(new Class51[] { Static87.aClass51_640, Static216.aClass51_1562, local56 }), Static25.aClass51_198, arg3, arg2, (short) 33, (long) arg1);
		} else if (!Static82.aBoolean82) {
			for (local131 = 7; local131 >= 0; local131--) {
				if (Static27.aClass51Array5[local131] != null) {
					@Pc(139) short local139 = 0;
					if (Static135.anInt3032 == 0 && Static27.aClass51Array5[local131].method1401(Static86.aClass51_637)) {
						if (arg0.anInt1941 > Static73.aClass5_Sub1_Sub1_1.anInt1941) {
							local139 = 2000;
						}
						if (Static73.aClass5_Sub1_Sub1_1.anInt1945 != 0 && arg0.anInt1945 != 0) {
							if (Static73.aClass5_Sub1_Sub1_1.anInt1945 == arg0.anInt1945) {
								local139 = 2000;
							} else {
								local139 = 0;
							}
						}
					} else if (Static69.aBooleanArray9[local131]) {
						local139 = 2000;
					}
					@Pc(201) short local201 = Static116.aShortArray10[local131];
					@Pc(206) short local206 = (short) (local201 + local139);
					Static151.method2611(Static150.method2574(new Class51[] { Static42.aClass51_1653, local56 }), Static27.aClass51Array5[local131], arg3, arg2, local206, (long) arg1);
				}
			}
		} else if ((Static128.anInt4775 & 0x8) == 8) {
			Static151.method2611(Static150.method2574(new Class51[] { Static51.aClass51_374, Static216.aClass51_1562, local56 }), Static87.aClass51_641, arg3, arg2, (short) 58, (long) arg1);
		}
		for (local131 = 0; local131 < Static202.anInt4289; local131++) {
			if (Static227.aShortArray59[local131] == 3) {
				Static168.aClass51Array27[local131] = Static150.method2574(new Class51[] { Static42.aClass51_1653, local56 });
				return;
			}
		}
	}
}
