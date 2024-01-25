import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_127 = new Class186(46, 0);

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "Z")
	public static boolean aBoolean568 = false;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "[I")
	public static final int[] anIntArray393 = new int[2048];

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
	public static void method6079() {
		@Pc(13) Class3_Sub48 local13 = Static89.method1200(Static130.aClass286_25, Static532.aClass400_3.aClass399_2);
		local13.aClass3_Sub28_Sub2_1.method5311(Static317.anInt5604);
		Static532.aClass400_3.method9223(local13);
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
	public static void method6081(@OriginalArg(0) int arg0) {
		Static74.anInt1137 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static509.anInt8656; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static164.anInt3059; local6++) {
				if (Static584.aClass262ArrayArrayArray2[arg0][local3][local6] == null) {
					Static584.aClass262ArrayArrayArray2[arg0][local3][local6] = new Class262(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILclient!tg;III)V")
	public static void method6085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub49 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt9910 == -1 && arg2.anIntArray548 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(29) int local29 = arg2.anInt9907 * Static713.aClass3_Sub55_31.aClass15_Sub8_2.method2888() >> 8;
		if (arg2.anInt9899 < arg3) {
			local19 = arg3 - arg2.anInt9899;
		} else if (arg2.anInt9904 > arg3) {
			local19 = arg2.anInt9904 - arg3;
		}
		if (arg4 > arg2.anInt9897) {
			local19 += arg4 - arg2.anInt9897;
		} else if (arg4 < arg2.anInt9906) {
			local19 += arg2.anInt9906 - arg4;
		}
		if (arg2.anInt9898 == 0 || local19 - 256 > arg2.anInt9898 || Static713.aClass3_Sub55_31.aClass15_Sub8_2.method2888() == 0 || arg1 != arg2.anInt9911) {
			if (arg2.aClass3_Sub22_Sub1_3 != null) {
				Static155.aClass3_Sub22_Sub4_1.method9062(arg2.aClass3_Sub22_Sub1_3);
				arg2.aClass3_Sub22_Sub1_3 = null;
				arg2.aClass3_Sub36_2 = null;
				arg2.aClass3_Sub33_Sub1_3 = null;
			}
			if (arg2.aClass3_Sub22_Sub1_4 != null) {
				Static155.aClass3_Sub22_Sub4_1.method9062(arg2.aClass3_Sub22_Sub1_4);
				arg2.aClass3_Sub36_3 = null;
				arg2.aClass3_Sub22_Sub1_4 = null;
				arg2.aClass3_Sub33_Sub1_4 = null;
			}
			return;
		}
		local19 -= 256;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(167) int local167 = arg2.anInt9898 - arg2.anInt9901;
		if (local167 < 0) {
			local167 = arg2.anInt9898;
		}
		@Pc(177) int local177 = local29;
		@Pc(188) int local188 = local19 - arg2.anInt9901;
		if (local188 > 0 && local167 > 0) {
			local177 = (local167 - local188) * local29 / local167;
		}
		Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592();
		@Pc(209) int local209 = 8192;
		@Pc(221) int local221 = (arg2.anInt9899 + arg2.anInt9904) / 2 - arg3;
		@Pc(231) int local231 = (arg2.anInt9897 + arg2.anInt9906) / 2 - arg4;
		@Pc(256) int local256;
		@Pc(273) int local273;
		if (local221 != 0 || local231 != 0) {
			local256 = -Static703.anInt10997 - (int) (Math.atan2((double) local221, (double) local231) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local256 > 8192) {
				local256 = 16384 - local256;
			}
			if (local19 <= 0) {
				local273 = 8192;
			} else if (local19 < 4096) {
				local273 = local19 * 8192 / 4096 + 8192;
			} else {
				local273 = 16384;
			}
			local209 = (16384 - local273 >> 1) + local256 * local273 / 8192;
		}
		@Pc(388) Class3_Sub22_Sub1 local388;
		if (arg2.aClass3_Sub22_Sub1_3 != null) {
			arg2.aClass3_Sub22_Sub1_3.method3906(local177);
			arg2.aClass3_Sub22_Sub1_3.method3879(local209);
		} else if (arg2.anInt9910 >= 0) {
			local256 = arg2.anInt9902 == 256 && arg2.anInt9913 == 256 ? 256 : Static699.method9151(arg2.anInt9913, arg2.anInt9902);
			if (arg2.aBoolean720) {
				if (arg2.aClass3_Sub36_2 == null) {
					arg2.aClass3_Sub36_2 = Static446.method6555(Static89.aClass221_17, arg2.anInt9910);
				}
				if (arg2.aClass3_Sub36_2 != null) {
					if (arg2.aClass3_Sub33_Sub1_3 == null) {
						arg2.aClass3_Sub33_Sub1_3 = arg2.aClass3_Sub36_2.method6550(new int[] { 22050 });
					}
					if (arg2.aClass3_Sub33_Sub1_3 != null) {
						local388 = Static727.method3896(arg2.aClass3_Sub33_Sub1_3, local256, local177 << 6, local209);
						local388.method3881(-1);
						Static155.aClass3_Sub22_Sub4_1.method9058(local388);
						arg2.aClass3_Sub22_Sub1_3 = local388;
					}
				}
			} else {
				@Pc(405) Class292 local405 = Static731.method7197(Static401.aClass221_114, arg2.anInt9910, 0);
				if (local405 != null) {
					@Pc(412) Class3_Sub33_Sub1 local412 = local405.method7195().method5801(Static68.aClass272_1);
					@Pc(420) Class3_Sub22_Sub1 local420 = Static727.method3896(local412, local256, local177 << 6, local209);
					local420.method3881(-1);
					Static155.aClass3_Sub22_Sub4_1.method9058(local420);
					arg2.aClass3_Sub22_Sub1_3 = local420;
				}
			}
		}
		if (arg2.aClass3_Sub22_Sub1_4 != null) {
			arg2.aClass3_Sub22_Sub1_4.method3906(local177);
			arg2.aClass3_Sub22_Sub1_4.method3879(local209);
			if (!arg2.aClass3_Sub22_Sub1_4.method9443()) {
				arg2.aClass3_Sub33_Sub1_4 = null;
				arg2.aClass3_Sub36_3 = null;
				arg2.aClass3_Sub22_Sub1_4 = null;
			}
		} else if (arg2.anIntArray548 != null && (arg2.anInt9905 -= arg0) <= 0) {
			local256 = arg2.anInt9902 == 256 && arg2.anInt9913 == 256 ? 256 : arg2.anInt9913 + (int) ((double) (arg2.anInt9902 - arg2.anInt9913) * Math.random());
			if (arg2.aBoolean721) {
				if (arg2.aClass3_Sub36_3 == null) {
					local273 = (int) ((double) arg2.anIntArray548.length * Math.random());
					arg2.aClass3_Sub36_3 = Static446.method6555(Static89.aClass221_17, arg2.anIntArray548[local273]);
				}
				if (arg2.aClass3_Sub36_3 != null) {
					if (arg2.aClass3_Sub33_Sub1_4 == null) {
						arg2.aClass3_Sub33_Sub1_4 = arg2.aClass3_Sub36_3.method6550(new int[] { 22050 });
					}
					if (arg2.aClass3_Sub33_Sub1_4 != null) {
						local388 = Static727.method3896(arg2.aClass3_Sub33_Sub1_4, local256, local177 << 6, local209);
						local388.method3881(0);
						Static155.aClass3_Sub22_Sub4_1.method9058(local388);
						arg2.anInt9905 = (int) ((double) (arg2.anInt9900 - arg2.anInt9912) * Math.random()) + arg2.anInt9912;
						arg2.aClass3_Sub22_Sub1_4 = local388;
						return;
					}
				}
				return;
			}
			local273 = (int) (Math.random() * (double) arg2.anIntArray548.length);
			@Pc(609) Class292 local609 = Static731.method7197(Static401.aClass221_114, arg2.anIntArray548[local273], 0);
			if (local609 != null) {
				@Pc(616) Class3_Sub33_Sub1 local616 = local609.method7195().method5801(Static68.aClass272_1);
				@Pc(624) Class3_Sub22_Sub1 local624 = Static727.method3896(local616, local256, local177 << 6, local209);
				local624.method3881(0);
				Static155.aClass3_Sub22_Sub4_1.method9058(local624);
				arg2.anInt9905 = arg2.anInt9912 + (int) ((double) (arg2.anInt9900 - arg2.anInt9912) * Math.random());
				arg2.aClass3_Sub22_Sub1_4 = local624;
				return;
			}
		}
	}
}
