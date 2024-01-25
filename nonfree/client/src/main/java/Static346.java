import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "J")
	public static long aLong168;

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
	public static int anInt6722;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "Lclient!hs;")
	public static final Class138 aClass138_4 = new Class138(3, 2);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!d;Ljava/awt/Canvas;I)Lclient!ha;")
	public static Class16 method5510(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class16_Sub3(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!uk;[III)Lclient!gea;")
	public static Class114 method5514(@OriginalArg(0) Class344 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(13) float[][] local13 = null;
		if (arg0.aByteArray95 != null) {
			@Pc(19) int local19 = arg0.anInt9910;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(25) int[] local25 = new int[local19];
			@Pc(28) int[] local28 = new int[local19];
			@Pc(31) int[] local31 = new int[local19];
			@Pc(34) int[] local34 = new int[local19];
			@Pc(37) int[] local37 = new int[local19];
			for (@Pc(39) int local39 = 0; local39 < local19; local39++) {
				local22[local39] = Integer.MAX_VALUE;
				local25[local39] = -2147483647;
				local28[local39] = Integer.MAX_VALUE;
				local31[local39] = -2147483647;
				local34[local39] = Integer.MAX_VALUE;
				local37[local39] = -2147483647;
			}
			@Pc(81) int local81;
			@Pc(138) int local138;
			for (@Pc(75) int local75 = 0; local75 < arg2; local75++) {
				local81 = arg1[local75];
				if (arg0.aByteArray95[local81] != -1) {
					@Pc(95) int local95 = arg0.aByteArray95[local81] & 0xFF;
					for (@Pc(97) int local97 = 0; local97 < 3; local97++) {
						@Pc(114) short local114;
						if (local97 == 0) {
							local114 = arg0.aShortArray131[local81];
						} else if (local97 == 1) {
							local114 = arg0.aShortArray128[local81];
						} else {
							local114 = arg0.aShortArray134[local81];
						}
						@Pc(133) int local133 = arg0.anIntArray576[local114];
						local138 = arg0.anIntArray570[local114];
						@Pc(143) int local143 = arg0.anIntArray573[local114];
						if (local133 < local22[local95]) {
							local22[local95] = local133;
						}
						if (local25[local95] < local133) {
							local25[local95] = local133;
						}
						if (local138 < local28[local95]) {
							local28[local95] = local138;
						}
						if (local31[local95] < local138) {
							local31[local95] = local138;
						}
						if (local143 < local34[local95]) {
							local34[local95] = local143;
						}
						if (local37[local95] < local143) {
							local37[local95] = local143;
						}
					}
				}
			}
			local9 = new int[local19];
			local7 = new int[local19];
			local13 = new float[local19][];
			local11 = new int[local19];
			for (local81 = 0; local81 < local19; local81++) {
				@Pc(242) byte local242 = arg0.aByteArray101[local81];
				if (local242 > 0) {
					local7[local81] = (local25[local81] + local22[local81]) / 2;
					local9[local81] = (local28[local81] + local31[local81]) / 2;
					local11[local81] = (local34[local81] + local37[local81]) / 2;
					@Pc(308) float local308;
					@Pc(299) float local299;
					@Pc(313) float local313;
					if (local242 == 1) {
						local138 = arg0.anIntArray574[local81];
						local299 = 64.0F / (float) arg0.anIntArray572[local81];
						if (local138 == 0) {
							local313 = 1.0F;
							local308 = 1.0F;
						} else if (local138 > 0) {
							local308 = 1.0F;
							local313 = (float) local138 / 1024.0F;
						} else {
							local308 = (float) -local138 / 1024.0F;
							local313 = 1.0F;
						}
					} else if (local242 == 2) {
						local308 = 64.0F / (float) arg0.anIntArray574[local81];
						local313 = 64.0F / (float) arg0.anIntArray577[local81];
						local299 = 64.0F / (float) arg0.anIntArray572[local81];
					} else {
						local308 = (float) arg0.anIntArray574[local81] / 1024.0F;
						local299 = (float) arg0.anIntArray572[local81] / 1024.0F;
						local313 = (float) arg0.anIntArray577[local81] / 1024.0F;
					}
					local13[local81] = Static35.method7919(arg0.aByteArray99[local81] & 0xFF, arg0.aShortArray130[local81], arg0.aShortArray129[local81], local299, local308, arg0.aShortArray127[local81], local313);
				}
			}
		}
		return new Class114(local7, local9, local11, local13);
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)V")
	public static void method5515() {
		Static601.anIntArray602 = null;
		Static581.anIntArray583 = null;
		Static135.anIntArray177 = null;
		Static29.anIntArray37 = null;
		Static582.aBoolean711 = false;
		Static609.anIntArray543 = null;
	}
}
