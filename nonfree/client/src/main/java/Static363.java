import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt6158;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Lclient!ao;")
	public static Class10_Sub1_Sub2 method4867() {
		return Static143.aClass10_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public static void method4869() {
		Static168.method2797(Static361.aClass85_Sub1_1.anInt2488);
		@Pc(17) int local17 = (Static168.anInt3353 >> 3) + (Static80.anInt1679 >> 10);
		@Pc(26) int local26 = (Static50.anInt906 >> 10) + (Static72.anInt1488 >> 3);
		Static96.anInt1983 = Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 = 0;
		Static263.aClass24_Sub3_Sub2_Sub2_4.method4925(8, 8);
		Static222.anIntArray416 = new int[18];
		Static226.anIntArray421 = new int[18];
		Static144.anIntArray288 = new int[18];
		Static195.anIntArray390 = new int[18];
		Static148.aByteArrayArray21 = new byte[18][];
		Static86.aByteArrayArray13 = new byte[18][];
		Static384.anIntArray636 = new int[18];
		Static49.anIntArray72 = new int[18];
		Static372.anIntArrayArray59 = new int[18][4];
		Static164.aByteArrayArray27 = new byte[18][];
		Static378.aByteArrayArray44 = new byte[18][];
		Static236.aByteArrayArray31 = new byte[18][];
		@Pc(85) int local85 = 0;
		@Pc(105) int local105;
		for (@Pc(94) int local94 = (local17 - (Static2.anInt7 >> 4)) / 8; local94 <= (local17 + (Static2.anInt7 >> 4)) / 8; local94++) {
			for (local105 = (local26 - (Static17.anInt315 >> 4)) / 8; local105 <= ((Static17.anInt315 >> 4) + local26) / 8; local105++) {
				@Pc(114) int local114 = (local94 << 8) + local105;
				Static144.anIntArray288[local85] = local114;
				Static195.anIntArray390[local85] = Static77.aClass187_32.method4278("m" + local94 + "_" + local105);
				Static384.anIntArray636[local85] = Static77.aClass187_32.method4278("l" + local94 + "_" + local105);
				Static222.anIntArray416[local85] = Static77.aClass187_32.method4278("n" + local94 + "_" + local105);
				Static49.anIntArray72[local85] = Static77.aClass187_32.method4278("um" + local94 + "_" + local105);
				Static226.anIntArray421[local85] = Static77.aClass187_32.method4278("ul" + local94 + "_" + local105);
				if (Static222.anIntArray416[local85] == -1) {
					Static195.anIntArray390[local85] = -1;
					Static384.anIntArray636[local85] = -1;
					Static49.anIntArray72[local85] = -1;
					Static226.anIntArray421[local85] = -1;
				}
				local85++;
			}
		}
		for (local105 = local85; local105 < Static222.anIntArray416.length; local105++) {
			Static222.anIntArray416[local105] = -1;
			Static195.anIntArray390[local105] = -1;
			Static384.anIntArray636[local105] = -1;
			Static49.anIntArray72[local105] = -1;
			Static226.anIntArray421[local105] = -1;
		}
		@Pc(286) byte local286;
		if (Static358.anInt6086 == 1 || Static358.anInt6086 == 2) {
			local286 = 3;
		} else {
			local286 = 7;
		}
		Static344.method4660(false, local286, local26, local17);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[B)Lclient!md;")
	public static Class10_Sub1_Sub11 method4870(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class10_Sub1_Sub11 local9 = new Class10_Sub1_Sub11();
		@Pc(14) Class10_Sub8 local14 = new Class10_Sub8(arg0);
		local14.anInt2989 = local14.aByteArray44.length - 2;
		@Pc(25) int local25 = local14.method2485();
		@Pc(36) int local36 = local14.aByteArray44.length - local25 - 12 - 2;
		local14.anInt2989 = local36;
		@Pc(43) int local43 = local14.method2459();
		local9.anInt4479 = local14.method2485();
		local9.anInt4478 = local14.method2485();
		local9.anInt4477 = local14.method2485();
		local9.anInt4476 = local14.method2485();
		@Pc(72) int local72 = local14.method2502();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local72 > 0) {
			local9.aClass167Array1 = new Class167[local72];
			for (local83 = 0; local83 < local72; local83++) {
				local89 = local14.method2485();
				@Pc(96) Class167 local96 = new Class167(Static186.method3002(local89));
				local9.aClass167Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method2459();
					@Pc(111) int local111 = local14.method2459();
					local96.method3705(new Class10_Sub12(local111), (long) local107);
				}
			}
		}
		local14.anInt2989 = 0;
		local9.aString46 = local14.method2490();
		local9.aStringArray30 = new String[local43];
		local9.anIntArray448 = new int[local43];
		local9.anIntArray447 = new int[local43];
		local83 = 0;
		while (local14.anInt2989 < local36) {
			local89 = local14.method2485();
			if (local89 == 3) {
				local9.aStringArray30[local83] = local14.method2478().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray448[local83] = local14.method2502();
			} else {
				local9.anIntArray448[local83] = local14.method2459();
			}
			local9.anIntArray447[local83++] = local89;
		}
		return local9;
	}
}
