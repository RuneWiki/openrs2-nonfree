import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	public static int anInt5744;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V", line = 3)
	public static void method5242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static78.anIntArrayArray16 != null) {
			Static78.anIntArrayArray16[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static31.aByteArrayArray4 != null) {
			Static31.aByteArrayArray4[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static291.aByteArrayArray17 != null) {
			Static291.aByteArrayArray17[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([JII[Ljava/lang/Object;I)V", line = 41)
	public static void method5246(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg3) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local25;
		@Pc(39) Object local39 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local39;
		for (@Pc(51) int local51 = arg3; local51 < arg1; local51++) {
			if (arg0[local51] < local25 + (long) (local51 & 0x1)) {
				@Pc(73) long local73 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21] = local73;
				@Pc(87) Object local87 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21++] = local87;
			}
		}
		arg0[arg1] = arg0[local21];
		arg0[local21] = local25;
		arg2[arg1] = arg2[local21];
		arg2[local21] = local39;
		method5246(arg0, local21 - 1, arg2, arg3);
		method5246(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIIII)V", line = 96)
	public static void method5247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static207.method3917(arg3)) {
			if (Static106.aClass161ArrayArray2[arg3] == null) {
				Static188.method3654(arg1, -1, Static25.aClass161ArrayArray1[arg3], arg0, arg5, arg6, arg2, arg4, arg7);
			} else {
				Static188.method3654(arg1, -1, Static106.aClass161ArrayArray2[arg3], arg0, arg5, arg6, arg2, arg4, arg7);
			}
		} else if (arg4 == -1) {
			for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
				Class2_Sub3_Sub10_Sub1.aBooleanArray59[local23] = true;
			}
		} else {
			Class2_Sub3_Sub10_Sub1.aBooleanArray59[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V", line = 137)
	public static void method5250() {
		if (Class104.anInt2714 == -1 || Class230.anInt6443 == -1) {
			return;
		}
		@Pc(29) int local29 = Class2_Sub3_Sub6.anInt1037 + (Class233.anInt6521 * (Class2_Sub2_Sub12.anInt3817 - Class2_Sub3_Sub6.anInt1037) >> 16);
		Class233.anInt6521 += local29;
		if (Class233.anInt6521 < 65535) {
			Class160.aBoolean268 = false;
			Class3.aBoolean9 = false;
		} else {
			Class233.anInt6521 = 65535;
			if (Class160.aBoolean268) {
				Class3.aBoolean9 = false;
			} else {
				Class3.aBoolean9 = true;
			}
			Class160.aBoolean268 = true;
		}
		@Pc(59) float local59 = (float) Class233.anInt6521 / 65535.0F;
		@Pc(62) float[] local62 = new float[3];
		@Pc(66) int local66 = Class197.anInt5555 * 2;
		@Pc(92) int local92;
		@Pc(124) int local124;
		@Pc(132) int local132;
		@Pc(137) int local137;
		@Pc(146) int local146;
		@Pc(164) int local164;
		for (@Pc(68) int local68 = 0; local68 < 3; local68++) {
			@Pc(80) int local80 = Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66][local68] * 3;
			local92 = Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66 + 1][local68] * 3;
			local124 = (Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66 + 2][local68] + Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66 + 2][local68] - Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66 + 3][local68]) * 3;
			local132 = Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66][local68];
			local137 = local92 - local80;
			local146 = local80 + local124 - local92 * 2;
			local164 = local92 + Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66 + 2][local68] - local124 - local132;
			local62[local68] = local59 * ((float) local137 + ((float) local146 + (float) local164 * local59) * local59) + (float) local132;
		}
		Static95.anInt3588 = (int) local62[1] * -1;
		Static127.anInt6765 = (int) local62[0] - Static154.anInt3136 * 128;
		Static197.anInt3773 = (int) local62[2] - Static139.anInt2716 * 128;
		@Pc(218) float[] local218 = new float[3];
		local92 = Class226.anInt6386 * 2;
		for (local124 = 0; local124 < 3; local124++) {
			local132 = Class2_Sub39.anIntArrayArrayArray13[Class230.anInt6443][local92][local124] * 3;
			local137 = Class2_Sub39.anIntArrayArrayArray13[Class230.anInt6443][local92 + 1][local124] * 3;
			local146 = (Class2_Sub39.anIntArrayArrayArray13[Class230.anInt6443][local92 + 2][local124] + Class2_Sub39.anIntArrayArrayArray13[Class230.anInt6443][local92 + 2][local124] - Class2_Sub39.anIntArrayArrayArray13[Class230.anInt6443][local92 + 3][local124]) * 3;
			local164 = Class2_Sub39.anIntArrayArrayArray13[Class230.anInt6443][local92][local124];
			@Pc(294) int local294 = local137 - local132;
			@Pc(303) int local303 = local146 + local132 - local137 * 2;
			@Pc(321) int local321 = local137 + Class2_Sub39.anIntArrayArrayArray13[Class230.anInt6443][local92 + 2][local124] - local164 - local146;
			local218[local124] = local59 * ((float) local294 + local59 * ((float) local303 + local59 * (float) local321)) + (float) local164;
		}
		@Pc(354) float local354 = local218[0] - local62[0];
		@Pc(365) float local365 = (local218[1] - local62[1]) * -1.0F;
		@Pc(374) float local374 = local218[2] - local62[2];
		@Pc(384) double local384 = Math.sqrt((double) (local354 * local354 + local374 * local374));
		Static244.anInt4847 = (int) (Math.atan2((double) local365, local384) * 2607.5945876176133D) & 0x3FFF;
		Static4.anInt87 = (int) (-Math.atan2((double) local354, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static319.anInt5645 = ((Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66 + 2][3] - Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66][3]) * Class233.anInt6521 >> 16) + Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714][local66][3];
	}
}
