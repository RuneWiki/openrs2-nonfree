import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!kga", name = "ac", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_80 = new Class173(63, 3);

	@OriginalMember(owner = "client!kga", name = "td", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_13 = new Class162(4, 8);

	@OriginalMember(owner = "client!kga", name = "Sd", descriptor = "[B")
	public static final byte[] aByteArray58 = new byte[2048];

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIB)V")
	public static void method4609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = Static552.anInt9805 + arg0;
		@Pc(18) int local18 = arg1 + Static254.anInt4667;
		if (Static60.aClass53ArrayArrayArray1 == null || arg0 < 0 || arg1 < 0 || Static428.anInt8046 <= arg0 || Static119.anInt2717 <= arg1 || !Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000) && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 != arg2) {
			return;
		}
		@Pc(63) long local63 = (long) (local13 | local18 << 14 | arg2 << 28);
		@Pc(69) Class4_Sub13 local69 = (Class4_Sub13) Static251.aClass350_19.method8207(local63);
		if (local69 == null) {
			Static63.method1018(arg2, arg0, arg1);
			return;
		}
		@Pc(83) Class4_Sub20 local83 = (Class4_Sub20) local69.aClass244_19.method5963();
		if (local83 == null) {
			Static63.method1018(arg2, arg0, arg1);
			return;
		}
		@Pc(97) Class1_Sub4_Sub3_Sub1 local97 = (Class1_Sub4_Sub3_Sub1) Static63.method1018(arg2, arg0, arg1);
		if (local97 == null) {
			local97 = new Class1_Sub4_Sub3_Sub1(arg0 << 9, Static499.aClass83Array3[arg2].method7217(arg1, arg0), arg1 << 9, arg2, arg2);
		} else {
			local97.anInt4736 = local97.anInt4748 = -1;
		}
		local97.anInt4738 = local83.anInt3139;
		local97.anInt4744 = local83.anInt3138;
		label56: while (true) {
			@Pc(140) Class4_Sub20 local140 = (Class4_Sub20) local69.aClass244_19.method5965();
			if (local140 == null) {
				break;
			}
			if (local140.anInt3139 != local97.anInt4738) {
				local97.anInt4747 = local140.anInt3138;
				local97.anInt4736 = local140.anInt3139;
				while (true) {
					@Pc(161) Class4_Sub20 local161 = (Class4_Sub20) local69.aClass244_19.method5965();
					if (local161 == null) {
						break label56;
					}
					if (local161.anInt3139 != local97.anInt4738 && local161.anInt3139 != local97.anInt4736) {
						local97.anInt4737 = local161.anInt3138;
						local97.anInt4748 = local161.anInt3139;
					}
				}
			}
		}
		@Pc(209) int local209 = Static501.method5641((arg0 << 9) + 256, arg2, (arg1 << 9) + 256);
		local97.aByte127 = (byte) arg2;
		local97.anInt4735 = 0;
		local97.anInt9934 = arg0 << 9;
		local97.anInt9935 = arg1 << 9;
		local97.anInt9932 = local209;
		local97.aByte126 = (byte) arg2;
		if (Static310.method5267(arg0, arg1)) {
			local97.aByte127++;
		}
		Static511.method7458(arg2, arg0, arg1, local209, local97);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(BI)Z")
	public static boolean method4668(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILclient!qn;IIZ)V")
	public static void method4676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub36 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2.anInt8133 == -1 && arg2.anIntArray423 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		if (arg3 > arg2.anInt8119) {
			local16 = arg3 - arg2.anInt8119;
		} else if (arg3 < arg2.anInt8131) {
			local16 = arg2.anInt8131 - arg3;
		}
		@Pc(54) int local54 = Static214.aClass4_Sub19_Sub1_1.anInt3051 * arg2.anInt8122 >> 8;
		if (arg2.anInt8125 < arg0) {
			local16 += arg0 - arg2.anInt8125;
		} else if (arg0 < arg2.anInt8132) {
			local16 += arg2.anInt8132 - arg0;
		}
		if (arg2.anInt8127 == 0 || arg2.anInt8127 < local16 - 256 || Static214.aClass4_Sub19_Sub1_1.anInt3051 == 0 || arg2.anInt8123 != arg4) {
			if (arg2.aClass4_Sub7_Sub4_1 != null) {
				Static444.aClass4_Sub7_Sub1_2.method400(arg2.aClass4_Sub7_Sub4_1);
				arg2.aClass4_Sub16_Sub1_1 = null;
				arg2.aClass4_Sub7_Sub4_1 = null;
				arg2.aClass4_Sub47_2 = null;
			}
			if (arg2.aClass4_Sub7_Sub4_2 != null) {
				Static444.aClass4_Sub7_Sub1_2.method400(arg2.aClass4_Sub7_Sub4_2);
				arg2.aClass4_Sub47_1 = null;
				arg2.aClass4_Sub16_Sub1_2 = null;
				arg2.aClass4_Sub7_Sub4_2 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(148) int local148 = local54 * (arg2.anInt8127 - local16) / arg2.anInt8127;
		Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925();
		@Pc(179) int local179;
		@Pc(252) Class4_Sub7_Sub4 local252;
		if (arg2.aClass4_Sub7_Sub4_1 != null) {
			arg2.aClass4_Sub7_Sub4_1.method6444(local148);
			arg2.aClass4_Sub7_Sub4_1.method6410();
		} else if (arg2.anInt8133 >= 0) {
			local179 = arg2.anInt8121 == 256 && arg2.anInt8126 == 256 ? 256 : Static392.method6208(arg2.anInt8126, arg2.anInt8121);
			if (arg2.aBoolean564) {
				if (arg2.aClass4_Sub47_2 == null) {
					arg2.aClass4_Sub47_2 = Static527.method7632(Static112.aClass176_35, arg2.anInt8133);
				}
				if (arg2.aClass4_Sub47_2 != null) {
					if (arg2.aClass4_Sub16_Sub1_1 == null) {
						arg2.aClass4_Sub16_Sub1_1 = arg2.aClass4_Sub47_2.method7635(new int[] { 22050 });
					}
					if (arg2.aClass4_Sub16_Sub1_1 != null) {
						local252 = Static600.method6430(arg2.aClass4_Sub16_Sub1_1, local179, local148 << 6, 8192);
						local252.method6422(-1);
						Static444.aClass4_Sub7_Sub1_2.method397(local252);
						arg2.aClass4_Sub7_Sub4_1 = local252;
					}
				}
			} else {
				@Pc(188) Class321 local188 = Static602.method7590(Static399.aClass176_103, arg2.anInt8133, 0);
				if (local188 != null) {
					@Pc(195) Class4_Sub16_Sub1 local195 = local188.method7592().method2544(Static46.aClass260_1);
					@Pc(203) Class4_Sub7_Sub4 local203 = Static600.method6430(local195, local179, local148 << 6, 8192);
					local203.method6422(-1);
					Static444.aClass4_Sub7_Sub1_2.method397(local203);
					arg2.aClass4_Sub7_Sub4_1 = local203;
				}
			}
		}
		if (arg2.aClass4_Sub7_Sub4_2 != null) {
			arg2.aClass4_Sub7_Sub4_2.method6444(local148);
			arg2.aClass4_Sub7_Sub4_2.method6410();
			if (arg2.aClass4_Sub7_Sub4_2.method8381()) {
				return;
			}
			arg2.aClass4_Sub16_Sub1_2 = null;
			arg2.aClass4_Sub47_1 = null;
			arg2.aClass4_Sub7_Sub4_2 = null;
		} else if (arg2.anIntArray423 != null && (arg2.anInt8129 -= arg1) <= 0) {
			local179 = arg2.anInt8121 == 256 && arg2.anInt8126 == 256 ? 256 : arg2.anInt8126 + (int) (Math.random() * (double) (arg2.anInt8121 - arg2.anInt8126));
			@Pc(327) int local327;
			if (arg2.aBoolean565) {
				if (arg2.aClass4_Sub47_1 == null) {
					local327 = (int) ((double) arg2.anIntArray423.length * Math.random());
					arg2.aClass4_Sub47_1 = Static527.method7632(Static112.aClass176_35, arg2.anIntArray423[local327]);
				}
				if (arg2.aClass4_Sub47_1 != null) {
					if (arg2.aClass4_Sub16_Sub1_2 == null) {
						arg2.aClass4_Sub16_Sub1_2 = arg2.aClass4_Sub47_1.method7635(new int[] { 22050 });
					}
					if (arg2.aClass4_Sub16_Sub1_2 != null) {
						local252 = Static600.method6430(arg2.aClass4_Sub16_Sub1_2, local179, local148 << 6, 8192);
						local252.method6422(0);
						Static444.aClass4_Sub7_Sub1_2.method397(local252);
						arg2.aClass4_Sub7_Sub4_2 = local252;
						arg2.anInt8129 = (int) (Math.random() * (double) (arg2.anInt8134 - arg2.anInt8120)) + arg2.anInt8120;
						return;
					}
				}
				return;
			}
			local327 = (int) ((double) arg2.anIntArray423.length * Math.random());
			@Pc(405) Class321 local405 = Static602.method7590(Static399.aClass176_103, arg2.anIntArray423[local327], 0);
			if (local405 != null) {
				@Pc(412) Class4_Sub16_Sub1 local412 = local405.method7592().method2544(Static46.aClass260_1);
				@Pc(420) Class4_Sub7_Sub4 local420 = Static600.method6430(local412, local179, local148 << 6, 8192);
				local420.method6422(0);
				Static444.aClass4_Sub7_Sub1_2.method397(local420);
				arg2.anInt8129 = (int) ((double) (arg2.anInt8134 - arg2.anInt8120) * Math.random()) + arg2.anInt8120;
				arg2.aClass4_Sub7_Sub4_2 = local420;
				return;
			}
		}
	}
}
