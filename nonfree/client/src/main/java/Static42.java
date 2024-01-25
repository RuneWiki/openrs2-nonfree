import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_35 = new Class92(18, 2);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!gk;I)V")
	public static void method926(@OriginalArg(0) Class75_Sub2 arg0) {
		@Pc(16) byte[] local16;
		if (Static363.anObject10 == null) {
			@Pc(9) Class67_Sub2_Sub1 local9 = new Class67_Sub2_Sub1();
			local16 = local9.method4690();
			Static363.anObject10 = Static17.method517(local16);
		}
		if (Static52.anObject3 == null) {
			@Pc(27) Class67_Sub1_Sub1 local27 = new Class67_Sub1_Sub1();
			local16 = local27.method1675();
			Static52.anObject3 = Static17.method517(local16);
		}
		@Pc(50) Class55 local50 = arg0.aClass55_1;
		if (local50.method1360() && Static212.anObject4 == null) {
			@Pc(72) byte[] local72 = Static12.method403(0.5F, 0.6F, 16.0F, 4.0F, new Class10_Sub1(419684), 4.0F);
			Static212.anObject4 = Static17.method517(local72);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!fs;ZLclient!qa;)I")
	public static int method928(@OriginalArg(0) Class81 arg0, @OriginalArg(2) Class75 arg1) {
		if (arg0.anInt2627 != -1) {
			return arg0.anInt2627;
		}
		if (arg0.anInt2618 != -1) {
			@Pc(24) Class62 local24 = arg1.anInterface7_6.method2131(arg1.method2617() ? arg0.anInt2618 : arg0.anInt2622);
			if (!local24.aBoolean143) {
				return local24.aShort52;
			}
		}
		return arg0.anInt2631;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
	public static void method929() {
		@Pc(8) int local8 = Static123.aClass21_Sub1_1.method790(Static347.anInt6318);
		if (local8 == 0) {
			Static344.aByteArrayArrayArray16 = null;
			Static64.method1272(0);
		} else if (local8 == 1) {
			Static22.method609((byte) 0);
			Static64.method1272(512);
			if (Static325.aByteArrayArrayArray15 != null) {
				Static152.method2702();
			}
		} else {
			Static22.method609((byte) (Static164.anInt3507 - 4 & 0xFF));
			Static64.method1272(2);
		}
		Static268.anInt5011 = Static124.anInt2688;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!gf;)V")
	public static void method930(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		@Pc(13) int local13 = arg0.anInt6123 - Static290.anInt5325;
		@Pc(24) int local24 = arg0.anInt6065 * 128 + arg0.method4831() * 64;
		@Pc(36) int local36 = arg0.anInt6061 * 128 + arg0.method4831() * 64;
		arg0.anInt6055 += (local36 - arg0.anInt6055) / local13;
		arg0.anInt6134 = 0;
		arg0.anInt6053 += (local24 - arg0.anInt6053) / local13;
		if (arg0.anInt6089 == 0) {
			arg0.method4830(8192);
		}
		if (arg0.anInt6089 == 1) {
			arg0.method4830(12288);
		}
		if (arg0.anInt6089 == 2) {
			arg0.method4830(0);
		}
		if (arg0.anInt6089 == 3) {
			arg0.method4830(4096);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IFIFIIIF)[F")
	public static float[] method932(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[8] = local17;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[7] = 0.0F;
		local6[2] = local25;
		local6[3] = 0.0F;
		local6[5] = 0.0F;
		local6[4] = 1.0F;
		local6[6] = -local25;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg5 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(82) float local82 = 1.0F - local76;
		@Pc(92) float local92 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(103) float local103 = (float) Math.sqrt((double) (arg4 * arg4 + arg0 * arg0));
		if (local103 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local103 != 0.0F) {
				local78 = (float) arg0 / local103;
				local71 = (float) -arg4 / local103;
			}
			local69[3] = -local78 * local92;
			local69[4] = local76;
			local69[0] = local76 + local82 * local71 * local71;
			local69[1] = local92 * local78;
			local69[7] = -local71 * local92;
			local69[6] = local78 * local71 * local82;
			local69[5] = local71 * local92;
			local69[8] = local76 + local82 * local78 * local78;
			local69[2] = local71 * local78 * local82;
			local9[0] = local69[3] * local6[1] + local6[0] * local69[0] + local69[6] * local6[2];
			local9[1] = local69[7] * local6[2] + local69[1] * local6[0] + local6[1] * local69[4];
			local9[2] = local69[8] * local6[2] + local69[2] * local6[0] + local69[5] * local6[1];
			local9[3] = local69[0] * local6[3] + local69[3] * local6[4] + local6[5] * local69[6];
			local9[4] = local69[1] * local6[3] + local6[4] * local69[4] + local6[5] * local69[7];
			local9[6] = local6[8] * local69[6] + local69[3] * local6[7] + local69[0] * local6[6];
			local9[5] = local69[5] * local6[4] + local69[2] * local6[3] + local69[8] * local6[5];
			local9[7] = local69[1] * local6[6] + local69[4] * local6[7] + local69[7] * local6[8];
			local9[8] = local69[8] * local6[8] + local6[6] * local69[2] + local6[7] * local69[5];
		}
		local9[6] *= arg3;
		local9[0] *= arg1;
		local9[2] *= arg1;
		local9[4] *= arg6;
		local9[3] *= arg6;
		local9[8] *= arg3;
		local9[5] *= arg6;
		local9[1] *= arg1;
		local9[7] *= arg3;
		return local9;
	}
}
