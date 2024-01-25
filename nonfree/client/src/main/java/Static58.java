import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!kha;")
	public static Class181 aClass181_9;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_17 = new Class218(95, 10);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
	public static void method1278(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static244.aByteArrayArrayArray10 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[II[JI)V")
	public static void method1280(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(25) int local25 = (arg3 + arg1) / 2;
		@Pc(27) int local27 = arg1;
		@Pc(31) long local31 = arg2[local25];
		arg2[local25] = arg2[arg3];
		arg2[arg3] = local31;
		@Pc(45) int local45 = arg0[local25];
		arg0[local25] = arg0[arg3];
		arg0[arg3] = local45;
		@Pc(63) int local63 = local31 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg1; local65 < arg3; local65++) {
			if ((long) (local65 & local63) + local31 > arg2[local65]) {
				@Pc(82) long local82 = arg2[local65];
				arg2[local65] = arg2[local27];
				arg2[local27] = local82;
				@Pc(96) int local96 = arg0[local65];
				arg0[local65] = arg0[local27];
				arg0[local27++] = local96;
			}
		}
		arg2[arg3] = arg2[local27];
		arg2[local27] = local31;
		arg0[arg3] = arg0[local27];
		arg0[local27] = local45;
		method1280(arg0, arg1, arg2, local27 - 1);
		method1280(arg0, local27 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method1281() {
		if (Static322.anInt6492 == -1 || Static518.anInt10102 == -1) {
			return;
		}
		@Pc(30) int local30 = ((Static369.anInt7035 - Static408.anInt7676) * Static39.anInt722 >> 16) + Static408.anInt7676;
		Static39.anInt722 += local30;
		if (Static39.anInt722 < 65535) {
			Static197.aBoolean393 = false;
			Static445.aBoolean687 = false;
		} else {
			Static39.anInt722 = 65535;
			if (Static197.aBoolean393) {
				Static445.aBoolean687 = false;
			} else {
				Static445.aBoolean687 = true;
			}
			Static197.aBoolean393 = true;
		}
		@Pc(62) float local62 = (float) Static39.anInt722 / 65535.0F;
		@Pc(65) float[] local65 = new float[3];
		@Pc(69) int local69 = Static357.anInt3906 * 2;
		@Pc(95) int local95;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(141) int local141;
		@Pc(150) int local150;
		@Pc(168) int local168;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(83) int local83 = Static360.anIntArrayArrayArray4[Static322.anInt6492][local69][local71] * 3;
			local95 = Static360.anIntArrayArrayArray4[Static322.anInt6492][local69 + 1][local71] * 3;
			local129 = (Static360.anIntArrayArrayArray4[Static322.anInt6492][local69 + 2][local71] + Static360.anIntArrayArrayArray4[Static322.anInt6492][local69 + 2][local71] - Static360.anIntArrayArrayArray4[Static322.anInt6492][local69 + 3][local71]) * 3;
			local137 = Static360.anIntArrayArrayArray4[Static322.anInt6492][local69][local71];
			local141 = local95 - local83;
			local150 = local83 + local129 - local95 * 2;
			local168 = Static360.anIntArrayArrayArray4[Static322.anInt6492][local69 + 2][local71] + local95 - local129 - local137;
			local65[local71] = ((float) local141 + local62 * ((float) local168 * local62 + (float) local150)) * local62 + (float) local137;
		}
		Static465.anInt8425 = (int) local65[0] - Static446.anInt8090 * 512;
		Static289.anInt5908 = (int) local65[2] - Static124.anInt3150 * 512;
		Static641.anInt10516 = (int) local65[1] * -1;
		@Pc(223) float[] local223 = new float[3];
		local95 = Static345.anInt6776 * 2;
		for (local129 = 0; local129 < 3; local129++) {
			local137 = Static360.anIntArrayArrayArray4[Static518.anInt10102][local95][local129] * 3;
			local141 = Static360.anIntArrayArrayArray4[Static518.anInt10102][local95 + 1][local129] * 3;
			local150 = (Static360.anIntArrayArrayArray4[Static518.anInt10102][local95 + 2][local129] + Static360.anIntArrayArrayArray4[Static518.anInt10102][local95 + 2][local129] - Static360.anIntArrayArrayArray4[Static518.anInt10102][local95 + 3][local129]) * 3;
			local168 = Static360.anIntArrayArrayArray4[Static518.anInt10102][local95][local129];
			@Pc(299) int local299 = local141 - local137;
			@Pc(309) int local309 = local137 + local150 - local141 * 2;
			@Pc(328) int local328 = Static360.anIntArrayArrayArray4[Static518.anInt10102][local95 + 2][local129] + local141 - local150 - local168;
			local223[local129] = (float) local168 + local62 * (((float) local309 + local62 * (float) local328) * local62 + (float) local299);
		}
		@Pc(361) float local361 = local223[0] - local65[0];
		@Pc(372) float local372 = -1.0F * (local223[1] - local65[1]);
		@Pc(380) float local380 = local223[2] - local65[2];
		@Pc(390) double local390 = Math.sqrt((double) (local380 * local380 + local361 * local361));
		Static299.anInt8877 = (int) (Math.atan2((double) local372, local390) * 2607.5945876176133D) & 0x3FFF;
		Static166.anInt3989 = (int) (-Math.atan2((double) local361, (double) local380) * 2607.5945876176133D) & 0x3FFF;
		Static136.anInt3505 = (Static39.anInt722 * (Static360.anIntArrayArrayArray4[Static322.anInt6492][local69 + 2][3] - Static360.anIntArrayArrayArray4[Static322.anInt6492][local69][3]) >> 16) + Static360.anIntArrayArrayArray4[Static322.anInt6492][local69][3];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
	public static void method1282() {
		for (@Pc(1) int local1 = 0; local1 < Static185.anInt4396; local1++) {
			@Pc(6) Class2_Sub3_Sub1 local6 = Static113.aClass2_Sub3_Sub1Array3[local1];
			Static634.method8595(local6, true);
			Static113.aClass2_Sub3_Sub1Array3[local1] = null;
		}
		Static185.anInt4396 = 0;
	}
}
