import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
	public static void method1414(@OriginalArg(1) boolean arg0) {
		Static139.aBoolean208 = arg0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(37) boolean local37;
		@Pc(48) int local48;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(133) int local133;
		if (!Static139.aBoolean208) {
			local18 = Static321.aClass2_Sub24_Sub2_34.method5720();
			local24 = Static321.aClass2_Sub24_Sub2_34.method5733();
			local28 = Static321.aClass2_Sub24_Sub2_34.method5753();
			local37 = Static321.aClass2_Sub24_Sub2_34.method5777() == 1;
			Static137.method1143(local24);
			local48 = (Static248.anInt4821 - Static321.aClass2_Sub24_Sub2_34.anInt6669) / 16;
			Static25.anIntArrayArray20 = new int[local48][4];
			for (local54 = 0; local54 < local48; local54++) {
				for (local58 = 0; local58 < 4; local58++) {
					Static25.anIntArrayArray20[local54][local58] = Static321.aClass2_Sub24_Sub2_34.method5776();
				}
			}
			Static132.anIntArray220 = null;
			Static42.aByteArrayArray4 = null;
			Static164.anIntArray263 = new int[local48];
			Static71.anIntArray118 = new int[local48];
			Static40.aByteArrayArray3 = new byte[local48][];
			Static227.aByteArrayArray15 = new byte[local48][];
			Static297.aByteArrayArray17 = new byte[local48][];
			Static1.anIntArray583 = new int[local48];
			Static310.anIntArray498 = new int[local48];
			Static146.aByteArrayArray12 = new byte[local48][];
			Static51.anIntArray80 = new int[local48];
			local48 = 0;
			for (local58 = (local18 - (Static89.anInt1891 >> 4)) / 8; local58 <= (local18 + (Static89.anInt1891 >> 4)) / 8; local58++) {
				for (local133 = (local28 - (Static85.anInt1839 >> 4)) / 8; local133 <= ((Static85.anInt1839 >> 4) + local28) / 8; local133++) {
					Static71.anIntArray118[local48] = (local58 << 8) + local133;
					Static1.anIntArray583[local48] = Static90.aClass83_42.method1961("m" + local58 + "_" + local133);
					Static51.anIntArray80[local48] = Static90.aClass83_42.method1961("l" + local58 + "_" + local133);
					Static164.anIntArray263[local48] = Static90.aClass83_42.method1961("um" + local58 + "_" + local133);
					Static310.anIntArray498[local48] = Static90.aClass83_42.method1961("ul" + local58 + "_" + local133);
					local48++;
				}
			}
			Static131.method2287(local37, local28, false, local18);
			return;
		}
		local18 = Static321.aClass2_Sub24_Sub2_34.method5733();
		local24 = Static321.aClass2_Sub24_Sub2_34.method5767();
		local28 = Static321.aClass2_Sub24_Sub2_34.method5767();
		local37 = Static321.aClass2_Sub24_Sub2_34.method5733() == 1;
		Static137.method1143(local18);
		Static321.aClass2_Sub24_Sub2_34.method5792();
		for (local48 = 0; local48 < 4; local48++) {
			for (local54 = 0; local54 < Static89.anInt1891 >> 3; local54++) {
				for (local58 = 0; local58 < Static85.anInt1839 >> 3; local58++) {
					local133 = Static321.aClass2_Sub24_Sub2_34.method5793(1);
					if (local133 == 1) {
						Static321.anIntArrayArrayArray9[local48][local54][local58] = Static321.aClass2_Sub24_Sub2_34.method5793(26);
					} else {
						Static321.anIntArrayArrayArray9[local48][local54][local58] = -1;
					}
				}
			}
		}
		Static321.aClass2_Sub24_Sub2_34.method5782();
		local54 = (Static248.anInt4821 - Static321.aClass2_Sub24_Sub2_34.anInt6669) / 16;
		Static25.anIntArrayArray20 = new int[local54][4];
		for (local58 = 0; local58 < local54; local58++) {
			for (local133 = 0; local133 < 4; local133++) {
				Static25.anIntArrayArray20[local58][local133] = Static321.aClass2_Sub24_Sub2_34.method5776();
			}
		}
		Static310.anIntArray498 = new int[local54];
		Static132.anIntArray220 = null;
		Static40.aByteArrayArray3 = new byte[local54][];
		Static51.anIntArray80 = new int[local54];
		Static42.aByteArrayArray4 = null;
		Static164.anIntArray263 = new int[local54];
		Static297.aByteArrayArray17 = new byte[local54][];
		Static71.anIntArray118 = new int[local54];
		Static227.aByteArrayArray15 = new byte[local54][];
		Static1.anIntArray583 = new int[local54];
		Static146.aByteArrayArray12 = new byte[local54][];
		local54 = 0;
		for (local133 = 0; local133 < 4; local133++) {
			for (@Pc(412) int local412 = 0; local412 < Static89.anInt1891 >> 3; local412++) {
				for (@Pc(416) int local416 = 0; local416 < Static85.anInt1839 >> 3; local416++) {
					@Pc(426) int local426 = Static321.anIntArrayArrayArray9[local133][local412][local416];
					if (local426 != -1) {
						@Pc(435) int local435 = local426 >> 14 & 0x3FF;
						@Pc(441) int local441 = local426 >> 3 & 0x7FF;
						@Pc(451) int local451 = (local435 / 8 << 8) + local441 / 8;
						for (@Pc(453) int local453 = 0; local453 < local54; local453++) {
							if (local451 == Static71.anIntArray118[local453]) {
								local451 = -1;
								break;
							}
						}
						if (local451 != -1) {
							Static71.anIntArray118[local54] = local451;
							@Pc(482) int local482 = local451 >> 8 & 0xFF;
							@Pc(486) int local486 = local451 & 0xFF;
							Static1.anIntArray583[local54] = Static90.aClass83_42.method1961("m" + local482 + "_" + local486);
							Static51.anIntArray80[local54] = Static90.aClass83_42.method1961("l" + local482 + "_" + local486);
							Static164.anIntArray263[local54] = Static90.aClass83_42.method1961("um" + local482 + "_" + local486);
							Static310.anIntArray498[local54] = Static90.aClass83_42.method1961("ul" + local482 + "_" + local486);
							local54++;
						}
					}
				}
			}
		}
		Static131.method2287(local37, local24, false, local28);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
	public static void method1418() {
		for (@Pc(7) int local7 = 0; local7 < Static329.aByteArrayArrayArray17.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static329.aByteArrayArrayArray17[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static329.aByteArrayArrayArray17[0][0].length; local15++) {
					Static329.aByteArrayArrayArray17[local7][local11][local15] = 0;
				}
			}
		}
	}
}
