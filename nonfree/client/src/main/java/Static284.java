import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!je;")
	public static Class124 aClass124_5;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_99 = new Class254(58, -1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public static void method3907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass47_Sub2_1 != null) {
			local7.aClass47_Sub2_1 = null;
		}
		if (local7.aClass47_Sub2_2 != null) {
			local7.aClass47_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIZLclient!s;)V")
	public static void method3909(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1_Sub38 arg2) {
		@Pc(13) int local13 = arg2.anInt6527;
		@Pc(17) int local17 = (int) arg2.aLong237;
		arg2.method5965();
		if (arg0) {
			Static184.method2956(local13);
		}
		Static315.method4333(local13);
		@Pc(32) Class229 local32 = Static203.method1670(local17);
		if (local32 != null) {
			Static373.method5289(local32);
		}
		Static177.method2858();
		if (!arg1 && Static246.anInt4292 != -1) {
			Static143.method2301(Static246.anInt4292, 1);
		}
		@Pc(53) Class7 local53 = new Class7(Static81.aClass51_5);
		for (@Pc(58) Class1_Sub38 local58 = (Class1_Sub38) local53.method180(); local58 != null; local58 = (Class1_Sub38) local53.method181()) {
			if (!local58.method5966()) {
				local58 = (Class1_Sub38) local53.method180();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt6524 == 3) {
				@Pc(80) int local80 = (int) local58.aLong237;
				if (local80 >>> 16 == local13) {
					method3909(true, arg1, local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZI)V")
	public static void method3910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static350.aFloat112 > Static350.aFloat113) {
			Static350.aFloat113 = (float) ((double) Static350.aFloat113 + (double) Static350.aFloat113 / 30.0D);
			if (Static350.aFloat112 < Static350.aFloat113) {
				Static350.aFloat113 = Static350.aFloat112;
			}
			Static250.method3591();
			Static350.anInt6631 = (int) Static350.aFloat113 >> 1;
			Static350.aByteArrayArrayArray17 = Static172.method2743(Static350.anInt6631);
		} else if (Static350.aFloat113 > Static350.aFloat112) {
			Static350.aFloat113 = (float) ((double) Static350.aFloat113 - (double) Static350.aFloat113 / 30.0D);
			if (Static350.aFloat113 < Static350.aFloat112) {
				Static350.aFloat113 = Static350.aFloat112;
			}
			Static250.method3591();
			Static350.anInt6631 = (int) Static350.aFloat113 >> 1;
			Static350.aByteArrayArrayArray17 = Static172.method2743(Static350.anInt6631);
		}
		if (Static150.anInt2693 != -1 && Static44.anInt680 != -1) {
			@Pc(85) int local85 = Static150.anInt2693 - Static347.anInt6358;
			if (local85 < 2 || local85 > 2) {
				local85 /= 8;
			}
			@Pc(102) int local102 = Static44.anInt680 - Static39.anInt620;
			if (local102 < 2 || local102 > 2) {
				local102 /= 8;
			}
			Static347.anInt6358 += local85;
			if (local85 == 0 && local102 == 0) {
				Static150.anInt2693 = -1;
				Static44.anInt680 = -1;
			}
			Static39.anInt620 += local102;
			Static250.method3591();
		}
		if (Static309.anInt5223 <= 0) {
			Static131.anInt2418 = -1;
			Static347.anInt6360 = -1;
		} else {
			Static203.anInt2040--;
			if (Static203.anInt2040 == 0) {
				Static309.anInt5223--;
				Static203.anInt2040 = 100;
			}
		}
		if (!Static58.aBoolean88 || Static115.aClass142_15 == null) {
			return;
		}
		for (@Pc(165) Class1_Sub41 local165 = (Class1_Sub41) Static115.aClass142_15.method3199(); local165 != null; local165 = (Class1_Sub41) Static115.aClass142_15.method3198()) {
			@Pc(174) Class52 local174 = Static350.aClass103_4.method2055(local165.aClass1_Sub8_1.anInt1168);
			if (local165.method5462(arg1, arg0)) {
				if (local174.aStringArray10 != null) {
					if (local174.aStringArray10[4] != null) {
						Static379.method5349(-1, -1, local174.aString25, local174.aStringArray10[4], local174.anInt1179, false, (long) local165.aClass1_Sub8_1.anInt1168, 1011, true, 0);
					}
					if (local174.aStringArray10[3] != null) {
						Static379.method5349(-1, -1, local174.aString25, local174.aStringArray10[3], local174.anInt1179, false, (long) local165.aClass1_Sub8_1.anInt1168, 1007, true, 0);
					}
					if (local174.aStringArray10[2] != null) {
						Static379.method5349(-1, -1, local174.aString25, local174.aStringArray10[2], local174.anInt1179, false, (long) local165.aClass1_Sub8_1.anInt1168, 1009, true, 0);
					}
					if (local174.aStringArray10[1] != null) {
						Static379.method5349(-1, -1, local174.aString25, local174.aStringArray10[1], local174.anInt1179, false, (long) local165.aClass1_Sub8_1.anInt1168, 1003, true, 0);
					}
					if (local174.aStringArray10[0] != null) {
						Static379.method5349(-1, -1, local174.aString25, local174.aStringArray10[0], local174.anInt1179, false, (long) local165.aClass1_Sub8_1.anInt1168, 1012, true, 0);
					}
				}
				if (!local165.aClass1_Sub8_1.aBoolean100) {
					local165.aClass1_Sub8_1.aBoolean100 = true;
					Static354.method5067(Static61.aClass179_2, local165.aClass1_Sub8_1.anInt1168, local174.anInt1179);
				}
				if (local165.aClass1_Sub8_1.aBoolean100) {
					Static354.method5067(Static162.aClass179_3, local165.aClass1_Sub8_1.anInt1168, local174.anInt1179);
				}
			} else if (local165.aClass1_Sub8_1.aBoolean100) {
				local165.aClass1_Sub8_1.aBoolean100 = false;
				Static354.method5067(Static56.aClass179_1, local165.aClass1_Sub8_1.anInt1168, local174.anInt1179);
			}
		}
	}
}
