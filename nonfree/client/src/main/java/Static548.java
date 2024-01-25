import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method7957() {
		if (Static549.anInt9733 == -1 || Static51.anInt759 == -1) {
			return;
		}
		@Pc(25) int local25 = ((Static141.anInt2996 - Static415.anInt7825) * Static312.anInt6206 >> 16) + Static415.anInt7825;
		Static312.anInt6206 += local25;
		if (Static312.anInt6206 < 65535) {
			Static412.aBoolean536 = false;
			Static515.aBoolean642 = false;
		} else {
			Static312.anInt6206 = 65535;
			if (Static515.aBoolean642) {
				Static412.aBoolean536 = false;
			} else {
				Static412.aBoolean536 = true;
			}
			Static515.aBoolean642 = true;
		}
		@Pc(57) float local57 = (float) Static312.anInt6206 / 65535.0F;
		@Pc(60) float[] local60 = new float[3];
		@Pc(64) int local64 = Static318.anInt6248 * 2;
		@Pc(90) int local90;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(136) int local136;
		@Pc(145) int local145;
		@Pc(164) int local164;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			@Pc(78) int local78 = Static500.anIntArrayArrayArray20[Static549.anInt9733][local64][local66] * 3;
			local90 = Static500.anIntArrayArrayArray20[Static549.anInt9733][local64 + 1][local66] * 3;
			local123 = (Static500.anIntArrayArrayArray20[Static549.anInt9733][local64 + 2][local66] + Static500.anIntArrayArrayArray20[Static549.anInt9733][local64 + 2][local66] - Static500.anIntArrayArrayArray20[Static549.anInt9733][local64 + 3][local66]) * 3;
			local131 = Static500.anIntArrayArrayArray20[Static549.anInt9733][local64][local66];
			local136 = local90 - local78;
			local145 = local78 + local123 - local90 * 2;
			local164 = Static500.anIntArrayArrayArray20[Static549.anInt9733][local64 + 2][local66] + local90 - local123 - local131;
			local60[local66] = local57 * (local57 * ((float) local164 * local57 + (float) local145) + (float) local136) + (float) local131;
		}
		Static209.anInt3913 = (int) local60[1] * -1;
		Static24.anInt387 = (int) local60[0] - Static552.anInt9805 * 512;
		Static110.anInt2624 = (int) local60[2] - Static254.anInt4667 * 512;
		@Pc(220) float[] local220 = new float[3];
		local90 = Static247.anInt4519 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = Static500.anIntArrayArrayArray20[Static51.anInt759][local90][local123] * 3;
			local136 = Static500.anIntArrayArrayArray20[Static51.anInt759][local90 + 1][local123] * 3;
			local145 = (Static500.anIntArrayArrayArray20[Static51.anInt759][local90 + 2][local123] + Static500.anIntArrayArrayArray20[Static51.anInt759][local90 + 2][local123] - Static500.anIntArrayArrayArray20[Static51.anInt759][local90 + 3][local123]) * 3;
			local164 = Static500.anIntArrayArrayArray20[Static51.anInt759][local90][local123];
			@Pc(295) int local295 = local136 - local131;
			@Pc(305) int local305 = local131 + local145 - local136 * 2;
			@Pc(323) int local323 = local136 + Static500.anIntArrayArrayArray20[Static51.anInt759][local90 + 2][local123] - local145 - local164;
			local220[local123] = local57 * (((float) local323 * local57 + (float) local305) * local57 + (float) local295) + (float) local164;
		}
		@Pc(355) float local355 = local220[0] - local60[0];
		@Pc(366) float local366 = (local220[1] - local60[1]) * -1.0F;
		@Pc(374) float local374 = local220[2] - local60[2];
		@Pc(384) double local384 = Math.sqrt((double) (local355 * local355 + local374 * local374));
		Static232.anInt4203 = (int) (Math.atan2((double) local366, local384) * 2607.5945876176133D) & 0x3FFF;
		Static261.anInt5009 = (int) (-Math.atan2((double) local355, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static458.anInt8547 = (Static312.anInt6206 * (Static500.anIntArrayArrayArray20[Static549.anInt9733][local64 + 2][3] - Static500.anIntArrayArrayArray20[Static549.anInt9733][local64][3]) >> 16) + Static500.anIntArrayArrayArray20[Static549.anInt9733][local64][3];
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!dda;[Lclient!av;)Lclient!ka;")
	public static Class182 method7958(@OriginalArg(1) Class44_Sub2_Sub1 arg0, @OriginalArg(2) Class23[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong15 <= 0L) {
				return null;
			}
		}
		@Pc(40) long local40 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg1.length; local42++) {
			OpenGL.glAttachObjectARB(local40, arg1[local42].aLong15);
		}
		OpenGL.glLinkProgramARB(local40);
		OpenGL.glGetObjectParameterivARB(local40, 35714, Static235.anIntArray212, 0);
		if (Static235.anIntArray212[0] == 0) {
			if (Static235.anIntArray212[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local40, 35716, Static235.anIntArray212, 1);
			if (Static235.anIntArray212[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static235.anIntArray212[1]];
				OpenGL.glGetInfoLogARB(local40, Static235.anIntArray212[1], Static235.anIntArray212, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static235.anIntArray212[0] == 0) {
				for (@Pc(112) int local112 = 0; local112 < arg1.length; local112++) {
					OpenGL.glDetachObjectARB(local40, arg1[local112].aLong15);
				}
				OpenGL.glDeleteObjectARB(local40);
				return null;
			}
		}
		return new Class182(arg0, local40, arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method7959(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static493.anInt8959; local11++) {
			if (arg0.equalsIgnoreCase(Static220.aStringArray22[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public static void method7960(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static106.anInt2418 - Static132.anInt2839;
		if (local8 >= 100) {
			Static166.anInt3419 = 1;
			Static214.anInt3969 = -1;
			Static326.anInt6302 = -1;
			return;
		}
		@Pc(21) int local21 = (int) Static213.aFloat141;
		if (Static445.anInt8282 >> 8 > local21) {
			local21 = Static445.anInt8282 >> 8;
		}
		if (Static225.aBooleanArray10[4] && local21 < Static129.anIntArray133[4] + 128) {
			local21 = Static129.anIntArray133[4] + 128;
		}
		@Pc(59) int local59 = (int) Static201.aFloat128 + Static321.anInt6261 & 0x3FFF;
		Static495.method7349(arg0, Static557.anInt1156, local21, Static60.anInt983, local59, (local21 >> 3) * 3 + 600 << 2, Static501.method5641(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934, Static13.anInt231, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935) - 200);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static209.anInt3913 = (int) (local103 * (float) (Static209.anInt3913 - Static458.anInt8539) + (float) Static458.anInt8539);
		Static110.anInt2624 = (int) ((float) Static560.anInt9872 + (float) (Static110.anInt2624 - Static560.anInt9872) * local103);
		Static24.anInt387 = (int) (local103 * (float) (Static24.anInt387 - Static225.anInt4127) + (float) Static225.anInt4127);
		Static232.anInt4203 = (int) (local103 * (float) (Static232.anInt4203 - Static156.anInt3239) + (float) Static156.anInt3239);
		@Pc(154) int local154 = Static261.anInt5009 - Static158.anInt3280;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static261.anInt5009 = (int) ((float) Static158.anInt3280 + (float) local154 * local103);
		Static261.anInt5009 &= 0x3FFF;
	}
}
