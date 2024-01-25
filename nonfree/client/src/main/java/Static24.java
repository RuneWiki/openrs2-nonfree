import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bk", name = "T", descriptor = "Lclient!ra;")
	public static Class170 aClass170_37;

	@OriginalMember(owner = "client!bk", name = "D", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[50][];

	@OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
	public static int anInt2003 = 0;

	@OriginalMember(owner = "client!bk", name = "db", descriptor = "I")
	public static int anInt2023 = -1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!sa;)V")
	public static void method1833(@OriginalArg(0) Class25_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort76; local2 <= arg0.aShort73; local2++) {
			for (@Pc(6) int local6 = arg0.aShort75; local6 <= arg0.aShort74; local6++) {
				@Pc(16) Class51 local16 = Static138.aClass51ArrayArrayArray1[arg0.aByte62][local2][local6];
				if (local16 != null) {
					@Pc(21) Class103 local21 = local16.aClass103_1;
					@Pc(23) Class103 local23 = null;
					while (local21 != null) {
						if (local21.aClass25_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass103_1 = local21.aClass103_2;
							} else {
								local23.aClass103_2 = local21.aClass103_2;
							}
							local21.method2889();
							break;
						}
						local23 = local21;
						local21 = local21.aClass103_2;
					}
					local16.aByte12 = 0;
					for (@Pc(56) Class103 local56 = local16.aClass103_1; local56 != null; local56 = local56.aClass103_2) {
						local16.aByte12 = (byte) (local16.aByte12 | local56.anInt3088);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(B)V")
	public static void method1838() {
		if (Static186.aFloat99 > Static186.aFloat98) {
			Static186.aFloat98 = (float) ((double) Static186.aFloat98 + (double) Static186.aFloat98 / 30.0D);
			if (Static186.aFloat98 > Static186.aFloat99) {
				Static186.aFloat98 = Static186.aFloat99;
			}
			Static228.method3919();
			Static186.anInt6003 = (int) Static186.aFloat98 >> 1;
			Static186.aByteArrayArrayArray28 = Static180.method3328(Static186.anInt6003);
		} else if (Static186.aFloat98 > Static186.aFloat99) {
			Static186.aFloat98 = (float) ((double) Static186.aFloat98 - (double) Static186.aFloat98 / 30.0D);
			if (Static186.aFloat99 > Static186.aFloat98) {
				Static186.aFloat98 = Static186.aFloat99;
			}
			Static228.method3919();
			Static186.anInt6003 = (int) Static186.aFloat98 >> 1;
			Static186.aByteArrayArrayArray28 = Static180.method3328(Static186.anInt6003);
		}
		if (Static321.anInt6091 != -1 && Static55.anInt1337 != -1) {
			@Pc(85) int local85 = Static321.anInt6091 - Static180.anInt3602;
			if (local85 < 2 || local85 > 2) {
				local85 >>= 0x4;
			}
			@Pc(100) int local100 = Static55.anInt1337 - Static9.anInt302;
			if (local100 < 2 || local100 > 2) {
				local100 >>= 0x4;
			}
			Static180.anInt3602 += local85;
			Static9.anInt302 += local100;
			if (local85 == 0 && local100 == 0) {
				Static55.anInt1337 = -1;
				Static321.anInt6091 = -1;
			}
			Static228.method3919();
		}
		if (Static210.anInt5623 <= 0) {
			Static303.anInt5838 = -1;
			Static274.anInt5377 = -1;
		} else {
			Static31.anInt823--;
			if (Static31.anInt823 == 0) {
				Static31.anInt823 = 100;
				Static210.anInt5623--;
			}
		}
		if (!Static226.aBoolean329 || Static99.aClass211_8 == null) {
			return;
		}
		for (@Pc(167) Class5_Sub31 local167 = (Class5_Sub31) Static99.aClass211_8.method5608(); local167 != null; local167 = (Class5_Sub31) Static99.aClass211_8.method5603()) {
			@Pc(175) Class121 local175 = Static299.method5085(local167.aClass5_Sub18_1.anInt2293);
			if (Static302.anInt5825 == 0 && local167.method3700(Static270.anInt5171, Static274.anInt5378)) {
				if (local175.aStringArray24 != null) {
					if (local175.aStringArray24[4] != null) {
						Static345.method5684(1006, local175.aStringArray24[4], local175.aString211, -1, local175.anInt3575, 0, (long) local167.aClass5_Sub18_1.anInt2293);
					}
					if (local175.aStringArray24[3] != null) {
						Static345.method5684(1003, local175.aStringArray24[3], local175.aString211, -1, local175.anInt3575, 0, (long) local167.aClass5_Sub18_1.anInt2293);
					}
					if (local175.aStringArray24[2] != null) {
						Static345.method5684(1008, local175.aStringArray24[2], local175.aString211, -1, local175.anInt3575, 0, (long) local167.aClass5_Sub18_1.anInt2293);
					}
					if (local175.aStringArray24[1] != null) {
						Static345.method5684(1010, local175.aStringArray24[1], local175.aString211, -1, local175.anInt3575, 0, (long) local167.aClass5_Sub18_1.anInt2293);
					}
					if (local175.aStringArray24[0] != null) {
						Static345.method5684(1011, local175.aStringArray24[0], local175.aString211, -1, local175.anInt3575, 0, (long) local167.aClass5_Sub18_1.anInt2293);
					}
				}
				if (!local167.aClass5_Sub18_1.aBoolean148) {
					local167.aClass5_Sub18_1.aBoolean148 = true;
					Static223.method3894(15, local167.aClass5_Sub18_1.anInt2293, local175.anInt3575);
				}
				if (local167.aClass5_Sub18_1.aBoolean148) {
					Static223.method3894(17, local167.aClass5_Sub18_1.anInt2293, local175.anInt3575);
				}
			} else if (local167.aClass5_Sub18_1.aBoolean148) {
				local167.aClass5_Sub18_1.aBoolean148 = false;
				Static223.method3894(16, local167.aClass5_Sub18_1.anInt2293, local175.anInt3575);
			}
		}
	}
}
