import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
	public static int anInt7210;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BIIIIFFF)[F")
	public static float[] method6218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(14) float[] local14 = new float[9];
		@Pc(22) float local22 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(30) float local30 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[6] = -local30;
		local6[5] = 0.0F;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[8] = local22;
		local6[2] = local30;
		local6[0] = local22;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg1 / 32767.0F;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(99) float local99 = 1.0F - local83;
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg2 * arg2 + arg0 * arg0));
		if (local110 == 0.0F && local83 == 0.0F) {
			local14 = local6;
		} else {
			if (local110 != 0.0F) {
				local76 = (float) -arg2 / local110;
				local78 = (float) arg0 / local110;
			}
			local74[2] = local99 * local76 * local78;
			local74[8] = local78 * local78 * local99 + local83;
			local74[1] = local78 * local94;
			local74[7] = -local76 * local94;
			local74[4] = local83;
			local74[6] = local99 * local78 * local76;
			local74[3] = local94 * -local78;
			local74[5] = local76 * local94;
			local74[0] = local99 * local76 * local76 + local83;
			local14[0] = local6[2] * local74[6] + local74[0] * local6[0] + local74[3] * local6[1];
			local14[1] = local74[1] * local6[0] + local74[4] * local6[1] + local6[2] * local74[7];
			local14[3] = local6[5] * local74[6] + local6[3] * local74[0] + local6[4] * local74[3];
			local14[2] = local74[8] * local6[2] + local6[0] * local74[2] + local74[5] * local6[1];
			local14[4] = local6[4] * local74[4] + local74[1] * local6[3] + local74[7] * local6[5];
			local14[6] = local6[7] * local74[3] + local74[0] * local6[6] + local74[6] * local6[8];
			local14[5] = local74[8] * local6[5] + local6[3] * local74[2] + local74[5] * local6[4];
			local14[7] = local6[7] * local74[4] + local6[6] * local74[1] + local74[7] * local6[8];
			local14[8] = local74[8] * local6[8] + local6[6] * local74[2] + local74[5] * local6[7];
		}
		local14[2] *= arg5;
		local14[3] *= arg4;
		local14[7] *= arg6;
		local14[5] *= arg4;
		local14[0] *= arg5;
		local14[8] *= arg6;
		local14[6] *= arg6;
		local14[1] *= arg5;
		local14[4] *= arg4;
		return local14;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method6222(@OriginalArg(0) Class5 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static219.aBoolean285) {
			local7 = Static30.method1089();
			local9 = Static166.method2921();
		}
		Static254.method4161(Static354.anInt6787, Static625.anInt10194 + local9, arg0, Static276.anInt4979 + local7, Static452.anInt3209);
		Static460.aClass62_9.method8373(-1, -10660793, local7 + Static276.anInt4979 + 3, Static59.aClass43_24.method1598(Static325.anInt6083), Static625.anInt10194 + local9 + 14);
		@Pc(60) int local60 = local7 + Static483.aClass191_1.method6989();
		@Pc(67) int local67 = Static483.aClass191_1.method6982() + local9;
		@Pc(71) int local71;
		@Pc(88) int local88;
		if (Static392.aBoolean518) {
			local71 = 0;
			for (@Pc(76) Class3_Sub4_Sub1 local76 = (Class3_Sub4_Sub1) Static226.aClass15_3.method897(); local76 != null; local76 = (Class3_Sub4_Sub1) Static226.aClass15_3.method898()) {
				local88 = local71 * 16 + local9 + Static625.anInt10194 + 31;
				if (local76.anInt805 == 1) {
					Static17.method865(local7 + Static276.anInt4979, Static625.anInt10194 - -local9, local88, Static452.anInt3209, local67, arg0, -256, Static354.anInt6787, local60, -1, (Class3_Sub4_Sub13) local76.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66);
				} else {
					Static547.method1364(local67, -1, arg0, local60, local9 + Static625.anInt10194, Static276.anInt4979 - -local7, Static452.anInt3209, local76, -256, Static354.anInt6787, local88);
				}
				local71++;
			}
			if (Static528.aClass3_Sub4_Sub1_1 != null) {
				Static254.method4161(Static261.anInt4795, Static312.anInt5897, arg0, Static107.anInt2316, Static416.anInt7575);
				Static460.aClass62_9.method8373(-1, -10660793, Static107.anInt2316 + 3, Static528.aClass3_Sub4_Sub1_1.aString2, Static312.anInt5897 + 14);
				local71 = 0;
				for (@Pc(174) Class3_Sub4_Sub13 local174 = (Class3_Sub4_Sub13) Static528.aClass3_Sub4_Sub1_1.aClass15_1.method897(); local174 != null; local174 = (Class3_Sub4_Sub13) Static528.aClass3_Sub4_Sub1_1.aClass15_1.method898()) {
					@Pc(184) int local184 = local71 * 16 + Static312.anInt5897 + 31;
					Static17.method865(Static107.anInt2316, Static312.anInt5897, local184, Static416.anInt7575, local67, arg0, -256, Static261.anInt4795, local60, -1, local174);
					local71++;
				}
				Static363.method1644(Static312.anInt5897, Static261.anInt4795, Static107.anInt2316, Static416.anInt7575);
			}
		} else {
			local71 = 0;
			for (@Pc(221) Class3_Sub4_Sub13 local221 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local221 != null; local221 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
				local88 = local9 + Static625.anInt10194 + (Static160.anInt3142 + -1 + -local71) * 16 + 31;
				Static17.method865(Static276.anInt4979 + local7, Static625.anInt10194 + local9, local88, Static452.anInt3209, local67, arg0, -256, Static354.anInt6787, local60, -1, local221);
				local71++;
			}
		}
		Static363.method1644(local9 + Static625.anInt10194, Static354.anInt6787, Static276.anInt4979 + local7, Static452.anInt3209);
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(BI)V")
	public static void method6224(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub4_Sub12 local15 = Static556.method8018(1, arg0);
		local15.method3607();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)I")
	public static int method6225() {
		return Static449.anInt7994;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/awt/Component;Z)Lclient!pea;")
	public static Class163 method6227(@OriginalArg(0) Component arg0) {
		return new Class163_Sub1(arg0);
	}
}
