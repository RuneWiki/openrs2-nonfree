import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kia", name = "d", descriptor = "[I")
	public static int[] anIntArray349;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)I")
	public static int method5062(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static303.anInt6083 - 1; local3++) {
			if (arg0 < Static585.anIntArray616[local3] + Static324.anIntArray381[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static303.anInt6083 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!dfa;I)V")
	public static void method5063(@OriginalArg(0) Class3_Sub15_Sub1 arg0) {
		arg0.method2438();
		@Pc(10) int local10 = Static399.anInt7626;
		@Pc(20) Class2_Sub3_Sub1_Sub2_Sub2 local20 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local10] = new Class2_Sub3_Sub1_Sub2_Sub2();
		local20.anInt6289 = local10;
		@Pc(28) int local28 = arg0.method2432(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(46) int local46 = local28 >> 14 & 0x3FFF;
		local20.anIntArray378[0] = local46 - Static446.anInt8090;
		@Pc(58) int local58 = local28 & 0x3FFF;
		local20.anInt10428 = (local20.anIntArray378[0] << 9) + (local20.method5308() << 8);
		local20.anIntArray377[0] = local58 - Static124.anInt3150;
		local20.anInt10424 = (local20.anIntArray377[0] << 9) + (local20.method5308() << 8);
		Static552.anInt9440 = local20.aByte128 = local20.aByte129 = local33;
		if (Static525.method7485(local20.anIntArray377[0], local20.anIntArray378[0])) {
			local20.aByte129++;
		}
		if (Static122.aClass3_Sub15Array1[local10] != null) {
			local20.method5324(Static122.aClass3_Sub15Array1[local10]);
		}
		Static385.anInt10557 = 0;
		Static493.anIntArray555[Static385.anInt10557++] = local10;
		Static250.aByteArray60[local10] = 0;
		Static403.anInt4307 = 0;
		for (@Pc(149) int local149 = 1; local149 < 2048; local149++) {
			if (local10 != local149) {
				@Pc(163) int local163 = arg0.method2432(18);
				@Pc(167) int local167 = local163 >> 16;
				@Pc(173) int local173 = local163 >> 8 & 0xFF;
				@Pc(177) int local177 = local163 & 0xFF;
				@Pc(185) Class329 local185 = Static546.aClass329Array3[local149] = new Class329();
				local185.aBoolean805 = false;
				local185.anInt9630 = -1;
				local185.anInt9632 = 0;
				local185.anInt9633 = local177 + (local167 << 28) + (local173 << 14);
				Static39.anIntArray46[Static403.anInt4307++] = local149;
				Static250.aByteArray60[local149] = 0;
			}
		}
		arg0.method2440();
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIIII)I")
	public static int method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(14) int local14 = arg3;
			arg3 = arg2;
			arg2 = local14;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 + 1 - arg5 - arg3;
		} else {
			return 1 + 7 - arg2 - arg1;
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!ie;I)V")
	public static void method5066(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.aClass2_Sub3_9 = null;
		@Pc(12) int local12 = arg0.aClass2_Sub5Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass2_Sub5Array1[local14].aBoolean303 = false;
		}
		@Pc(32) Class375[] local32 = Class3_Sub1_Sub6_Sub1.aClass375Array1;
		synchronized (Class3_Sub1_Sub6_Sub1.aClass375Array1) {
			if (Class3_Sub1_Sub6_Sub1.aClass375Array1.length > local12 && Static605.anIntArray608[local12] < 200) {
				Class3_Sub1_Sub6_Sub1.aClass375Array1[local12].method8639(arg0);
				@Pc(55) int local55 = Static605.anIntArray608[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IZ)I")
	public static int method5067(@OriginalArg(1) boolean arg0) {
		if (Static393.anIntArray156 == null) {
			return 0;
		} else if (arg0 || Static498.aClass148Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static393.anIntArray156.length; local22++) {
				@Pc(28) int local28 = Static393.anIntArray156[local22];
				if (Static452.aClass181_87.method5040(local28)) {
					local20++;
				}
				if (Static359.aClass181_114.method5040(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static393.anIntArray156.length * 2;
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Lclient!maa;")
	public static Class2_Sub3_Sub4 method5068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class2_Sub3_Sub4 local14 = local7.aClass2_Sub3_Sub4_1;
			local7.aClass2_Sub3_Sub4_1 = null;
			Static637.method8381(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "(I)V")
	public static void method5069() {
		if (Static88.anInt2308 <= 1) {
			Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub11_1, 2);
		} else {
			Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub11_1, 4);
		}
	}
}
