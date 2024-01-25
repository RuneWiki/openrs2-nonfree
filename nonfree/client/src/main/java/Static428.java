import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_124 = new Class40("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "[I")
	public static final int[] anIntArray574 = new int[1000];

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "Z")
	public static boolean aBoolean536 = false;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!tk;ZI)V")
	public static void method6111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class283 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class5_Sub19 local10 = (Class5_Sub19) Static206.aClass99_39.method2526(); local10 != null; local10 = (Class5_Sub19) Static206.aClass99_39.method2519()) {
			if (local10.anInt3173 == arg3 && local10.anInt3159 == arg0 << 7 && local10.anInt3163 == arg1 << 7 && local10.aClass283_1.anInt8190 == arg2.anInt8190) {
				if (local10.aClass5_Sub15_Sub1_2 != null) {
					Static373.aClass5_Sub15_Sub2_1.method4871(local10.aClass5_Sub15_Sub1_2);
					local10.aClass5_Sub15_Sub1_2 = null;
				}
				if (local10.aClass5_Sub15_Sub1_1 != null) {
					Static373.aClass5_Sub15_Sub2_1.method4871(local10.aClass5_Sub15_Sub1_1);
					local10.aClass5_Sub15_Sub1_1 = null;
				}
				local10.method7425();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FIIIFFII)[F")
	public static float[] method6114(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(23) float local23 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(31) float local31 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[1] = 0.0F;
		local6[6] = -local31;
		local6[0] = local23;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[8] = local23;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[2] = local31;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = (float) arg1 / 32767.0F;
		@Pc(95) float local95 = -((float) Math.sqrt((double) (1.0F - local84 * local84)));
		@Pc(99) float local99 = 1.0F - local84;
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg5 * arg5 + arg2 * arg2));
		if (local110 == 0.0F && local84 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local79 = (float) arg2 / local110;
				local77 = (float) -arg5 / local110;
			}
			local75[7] = local95 * -local77;
			local75[8] = local99 * local79 * local79 + local84;
			local75[1] = local95 * local79;
			local75[6] = local99 * local79 * local77;
			local75[0] = local99 * local77 * local77 + local84;
			local75[5] = local77 * local95;
			local75[4] = local84;
			local75[2] = local99 * local77 * local79;
			local75[3] = local95 * -local79;
			local9[0] = local6[2] * local75[6] + local75[0] * local6[0] + local6[1] * local75[3];
			local9[1] = local75[7] * local6[2] + local6[1] * local75[4] + local6[0] * local75[1];
			local9[3] = local6[4] * local75[3] + local6[3] * local75[0] + local6[5] * local75[6];
			local9[2] = local75[8] * local6[2] + local75[2] * local6[0] + local75[5] * local6[1];
			local9[4] = local6[5] * local75[7] + local6[4] * local75[4] + local75[1] * local6[3];
			local9[6] = local75[3] * local6[7] + local6[6] * local75[0] + local75[6] * local6[8];
			local9[5] = local6[4] * local75[5] + local75[2] * local6[3] + local6[5] * local75[8];
			local9[7] = local6[6] * local75[1] + local6[7] * local75[4] + local75[7] * local6[8];
			local9[8] = local75[2] * local6[6] + local75[5] * local6[7] + local6[8] * local75[8];
		}
		local9[4] *= arg3;
		local9[0] *= arg0;
		local9[1] *= arg0;
		local9[7] *= arg4;
		local9[2] *= arg0;
		local9[8] *= arg4;
		local9[5] *= arg3;
		local9[3] *= arg3;
		local9[6] *= arg4;
		return local9;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)[Lclient!qba;")
	public static Class243[] method6115() {
		return new Class243[] { Static357.aClass243_1, Static357.aClass243_2, Static357.aClass243_3, Static357.aClass243_4, Static357.aClass243_5, Static357.aClass243_6, Static357.aClass243_7, Static357.aClass243_8, Static357.aClass243_9, Static357.aClass243_10, Static357.aClass243_11, Static357.aClass243_12, Static357.aClass243_13, Static357.aClass243_14 };
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!oh;ZB)V")
	public static void method6119(@OriginalArg(0) Class220 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) int local21 = arg0.anInt6635 == 0 ? arg0.anInt6627 : arg0.anInt6635;
		@Pc(30) int local30 = arg0.anInt6670 == 0 ? arg0.anInt6681 : arg0.anInt6670;
		Static229.method3772(arg0.anInt6661, arg1, local21, Static139.aClass220ArrayArray1[arg0.anInt6661 >> 16], local30);
		if (arg0.aClass220Array6 != null) {
			Static229.method3772(arg0.anInt6661, arg1, local21, arg0.aClass220Array6, local30);
		}
		@Pc(63) Class5_Sub43 local63 = (Class5_Sub43) Static307.aClass42_24.method1109((long) arg0.anInt6661);
		if (local63 != null) {
			Static393.method5729(local30, arg1, local63.anInt7801, local21);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!co;)V")
	public static void method6123(@OriginalArg(1) Class5_Sub3 arg0) {
		@Pc(9) int local9 = arg0.method4231();
		Static112.aClass195Array1 = new Class195[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static112.aClass195Array1[local14] = new Class195();
			Static112.aClass195Array1[local14].anInt5995 = arg0.method4231();
			Static112.aClass195Array1[local14].aString60 = arg0.method4211();
		}
		Static420.anInt9019 = arg0.method4231();
		Static403.anInt7216 = arg0.method4231();
		Static482.anInt8343 = arg0.method4231();
		Static315.aClass35_Sub1Array2 = new Class35_Sub1[Static403.anInt7216 + 1 - Static420.anInt9019];
		for (@Pc(62) int local62 = 0; local62 < Static482.anInt8343; local62++) {
			@Pc(68) int local68 = arg0.method4231();
			@Pc(76) Class35_Sub1 local76 = Static315.aClass35_Sub1Array2[local68] = new Class35_Sub1();
			local76.anInt996 = arg0.method4220();
			local76.anInt998 = arg0.method4230();
			local76.anInt1002 = Static420.anInt9019 + local68;
			local76.aString25 = arg0.method4211();
			local76.aString26 = arg0.method4211();
		}
		Static299.anInt5951 = arg0.method4230();
		Static86.aBoolean91 = true;
	}
}
