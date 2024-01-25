import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!km", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "I")
	public static int anInt5508;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "Lclient!tca;")
	public static Class337 aClass337_2;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_71 = new Class241(47, 1);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lclient!u;")
	public static Class352 method5019(@OriginalArg(0) int arg0) {
		@Pc(8) Class352[] local8 = Static326.method5116();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class352 local16 = local8[local10];
			if (local16.anInt9529 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()V")
	public static void method5020() {
		Static667.aClass284_3 = Static667.aClass284_2;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)I")
	public static int method5021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(26) double local26 = local17 + Math.random() * (local10 - local17);
		return (int) (Math.pow(2.0D, local26) + 0.5D);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IFIFFIII)[F")
	public static float[] method5023(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[8] = local17;
		local6[6] = -local25;
		local6[2] = local25;
		local6[1] = (float) 0;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg6 / 32767.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(94) float local94 = 1.0F - local79;
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg5 * arg5 + arg0 * arg0));
		if (local106 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local72 = (float) -arg0 / local106;
				local74 = (float) arg5 / local106;
			}
			local70[0] = local72 * local72 * local94 + local79;
			local70[1] = local74 * local89;
			local70[7] = -local72 * local89;
			local70[4] = local79;
			local70[3] = local89 * -local74;
			local70[2] = local74 * local72 * local94;
			local70[8] = local94 * local74 * local74 + local79;
			local70[6] = local74 * local72 * local94;
			local70[5] = local89 * local72;
			local9[0] = local6[2] * local70[6] + local70[3] * local6[1] + local6[0] * local70[0];
			local9[1] = local70[1] * local6[0] + local70[4] * local6[1] + local6[2] * local70[7];
			local9[2] = local70[2] * local6[0] + local6[1] * local70[5] + local6[2] * local70[8];
			local9[3] = local6[4] * local70[3] + local6[3] * local70[0] + local6[5] * local70[6];
			local9[4] = local70[7] * local6[5] + local70[1] * local6[3] + local70[4] * local6[4];
			local9[6] = local70[0] * local6[6] + local6[7] * local70[3] + local70[6] * local6[8];
			local9[5] = local70[8] * local6[5] + local6[3] * local70[2] + local6[4] * local70[5];
			local9[7] = local70[7] * local6[8] + local70[1] * local6[6] + local6[7] * local70[4];
			local9[8] = local70[2] * local6[6] + local70[5] * local6[7] + local6[8] * local70[8];
		}
		local9[0] *= arg4;
		local9[8] *= arg3;
		local9[2] *= arg4;
		local9[3] *= arg1;
		local9[1] *= arg4;
		local9[5] *= arg1;
		local9[4] *= arg1;
		local9[7] *= arg3;
		local9[6] *= arg3;
		return local9;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!qo;IIII)V")
	public static void method5024(@OriginalArg(0) Class60_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class396 local9 = arg0.method4417(27750);
		@Pc(12) Class104 local12 = arg0.aClass104_7;
		@Pc(29) int local29 = arg0.anInt4868 - arg0.aClass258_7.anInt7153 & 0x3FFF;
		if (arg2 == -1) {
			if (local29 == 0 && arg0.anInt4872 <= 25) {
				if (!arg0.aBoolean369 || !local9.method8964(local12.method9032())) {
					local12.method9035(local9.method8960());
					arg0.aBoolean369 = local12.method9030();
				}
			} else if (arg1 < 0 && local9.anInt10415 != -1) {
				local12.method9035(local9.anInt10415);
				arg0.aBoolean369 = false;
			} else if (arg1 > 0 && local9.anInt10398 != -1) {
				local12.method9035(local9.anInt10398);
				arg0.aBoolean369 = false;
			} else if (!arg0.aBoolean369 || !local9.method8964(local12.method9032())) {
				local12.method9035(local9.method8960());
				arg0.aBoolean369 = arg0.aClass104_7.method9030();
			}
		} else if (arg0.anInt4858 != -1 && (local29 >= 10240 || local29 <= 2048)) {
			@Pc(303) int local303 = Static608.anIntArray624[arg3] - arg0.aClass258_7.anInt7153 & 0x3FFF;
			if (arg2 == 2 && local9.anInt10407 != -1) {
				if (local303 > 2048 && local303 <= 6144 && local9.anInt10421 != -1) {
					local12.method9035(local9.anInt10421);
				} else if (local303 >= 10240 && local303 < 14336 && local9.anInt10430 != -1) {
					local12.method9035(local9.anInt10430);
				} else if (local303 <= 6144 || local303 >= 10240 || local9.anInt10410 == -1) {
					local12.method9035(local9.anInt10407);
				} else {
					local12.method9035(local9.anInt10410);
				}
			} else if (arg2 == 0 && local9.anInt10423 != -1) {
				if (local303 > 2048 && local303 <= 6144 && local9.anInt10388 != -1) {
					local12.method9035(local9.anInt10388);
				} else if (local303 >= 10240 && local303 < 14336 && local9.anInt10399 != -1) {
					local12.method9035(local9.anInt10399);
				} else if (local303 <= 6144 || local303 >= 10240 || local9.anInt10422 == -1) {
					local12.method9035(local9.anInt10423);
				} else {
					local12.method9035(local9.anInt10422);
				}
			} else if (local303 > 2048 && local303 <= 6144 && local9.anInt10395 != -1) {
				local12.method9035(local9.anInt10395);
			} else if (local303 >= 10240 && local303 < 14336 && local9.anInt10418 != -1) {
				local12.method9035(local9.anInt10418);
			} else if (local303 <= 6144 || local303 >= 10240 || local9.anInt10409 == -1) {
				local12.method9035(local9.anInt10434);
			} else {
				local12.method9035(local9.anInt10409);
			}
			arg0.aBoolean369 = false;
		} else if (local29 == 0 && arg0.anInt4872 <= 25) {
			if (arg2 == 2 && local9.anInt10407 != -1) {
				local12.method9035(local9.anInt10407);
			} else if (arg2 == 0 && local9.anInt10423 != -1) {
				local12.method9035(local9.anInt10423);
			} else {
				local12.method9035(local9.anInt10434);
			}
			arg0.aBoolean369 = false;
		} else {
			if (arg2 == 2 && local9.anInt10407 != -1) {
				if (arg1 < 0 && local9.anInt10389 != -1) {
					local12.method9035(local9.anInt10389);
				} else if (arg1 <= 0 || local9.anInt10419 == -1) {
					local12.method9035(local9.anInt10407);
				} else {
					local12.method9035(local9.anInt10419);
				}
			} else if (arg2 == 0 && local9.anInt10423 != -1) {
				if (arg1 < 0 && local9.anInt10420 != -1) {
					local12.method9035(local9.anInt10420);
				} else if (arg1 <= 0 || local9.anInt10403 == -1) {
					local12.method9035(local9.anInt10423);
				} else {
					local12.method9035(local9.anInt10403);
				}
			} else if (arg1 < 0 && local9.anInt10406 != -1) {
				local12.method9035(local9.anInt10406);
			} else if (arg1 <= 0 || local9.anInt10400 == -1) {
				local12.method9035(local9.anInt10434);
			} else {
				local12.method9035(local9.anInt10400);
			}
			arg0.aBoolean369 = false;
		}
	}
}
