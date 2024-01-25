import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!ca;")
	public static Class40 aClass40_6;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[Lclient!ji;")
	public static final Class6_Sub21[] aClass6_Sub21Array1 = new Class6_Sub21[2048];

	@OriginalMember(owner = "client!r", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray68 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIB)V")
	public static void method6246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static340.anInt6138 = arg0;
		Static190.anInt3955 = arg1;
		Static48.anInt1087 = arg3;
		Static42.anInt1021 = arg2;
		Static397.anInt6953 = arg4;
		if (Static397.anInt6953 >= 100) {
			@Pc(27) int local27 = Static190.anInt3955 * 512 + 256;
			@Pc(33) int local33 = Static42.anInt1021 * 512 + 256;
			@Pc(41) int local41 = Static160.method2951(local33, local27, Static97.anInt1863) - Static48.anInt1087;
			@Pc(45) int local45 = local27 - Static371.anInt6572;
			@Pc(49) int local49 = local41 - Static111.anInt2160;
			@Pc(54) int local54 = local33 - Static322.anInt5904;
			@Pc(65) int local65 = (int) Math.sqrt((double) (local54 * local54 + local45 * local45));
			Static67.anInt1407 = (int) (Math.atan2((double) local49, (double) local65) * 2607.5945876176133D) & 0x3FFF;
			Static570.anInt9340 = (int) (Math.atan2((double) local45, (double) local54) * -2607.5945876176133D) & 0x3FFF;
			if (Static67.anInt1407 < 1024) {
				Static67.anInt1407 = 1024;
			}
			Static385.anInt6775 = 0;
			if (Static67.anInt1407 > 3072) {
				Static67.anInt1407 = 3072;
			}
		}
		Static346.anInt6215 = 2;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BZ)C")
	public static char method6249(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(36) char local36 = Static422.aCharArray8[local7 - 128];
			if (local36 == '\u0000') {
				local36 = '?';
			}
			local7 = local36;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
	public static void method6253() {
		if (Static50.anIntArray51 != null) {
			return;
		}
		Static50.anIntArray51 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(36) float local36 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(45) float local45 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(47) int local47 = 0; local47 < 128; local47++) {
				@Pc(54) float local54 = (float) local47 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local36 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(76) float local76 = local64 - (float) local67;
				@Pc(82) float local82 = local54 * (1.0F - local45);
				@Pc(91) float local91 = local54 * (1.0F - local76 * local45);
				@Pc(101) float local101 = local54 * (1.0F - local45 * (1.0F - local76));
				if (local71 == 0) {
					local56 = local54;
					local58 = local101;
					local60 = local82;
				} else if (local71 == 1) {
					local56 = local91;
					local58 = local54;
					local60 = local82;
				} else if (local71 == 2) {
					local58 = local54;
					local60 = local101;
					local56 = local82;
				} else if (local71 == 3) {
					local58 = local91;
					local56 = local82;
					local60 = local54;
				} else if (local71 == 4) {
					local58 = local82;
					local56 = local101;
					local60 = local54;
				} else if (local71 == 5) {
					local58 = local82;
					local60 = local91;
					local56 = local54;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(192) int local192 = (int) (local56 * 256.0F);
				@Pc(197) int local197 = (int) (local58 * 256.0F);
				@Pc(202) int local202 = (int) (local60 * 256.0F);
				@Pc(215) int local215 = (local197 << 8) + (local192 << 16) + local202 - 16777216;
				Static50.anIntArray51[local21++] = local215;
			}
		}
	}
}
