import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!v", name = "G", descriptor = "[I")
	public static int[] anIntArray590;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!tl;")
	public static Class155 aClass155_44 = new Class155(260);

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	public static int anInt5910 = -2;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "I")
	public static int anInt5914 = 0;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "I")
	public static int anInt5923 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II[[ILclient!wh;[[FIZ[[F[I[[FLclient!mm;)V")
	public static void method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) Class103 arg9) {
		@Pc(16) int[] local16 = new int[arg7.length / 2];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(28) int local28 = arg7[local18 + local18];
			@Pc(37) int local37 = arg7[local18 + local18 + 1];
			@Pc(50) int local50;
			if (arg5 == 1) {
				local50 = local28;
				local28 = local37;
				local37 = 128 - local50;
			} else if (arg5 == 2) {
				local37 = 128 - local37;
				local28 = 128 - local28;
			} else if (arg5 == 3) {
				local50 = local28;
				local28 = 128 - local37;
				local37 = local50;
			}
			@Pc(92) float local92;
			@Pc(98) float local98;
			@Pc(104) float local104;
			if (local28 == 0 && local37 == 0) {
				local92 = arg8[arg0][arg1];
				local98 = arg6[arg0][arg1];
				local104 = arg4[arg0][arg1];
			} else if (local28 == 128 && local37 == 0) {
				local92 = arg8[arg0 + 1][arg1];
				local98 = arg6[arg0 + 1][arg1];
				local104 = arg4[arg0 + 1][arg1];
			} else if (local28 == 128 && local37 == 128) {
				local92 = arg8[arg0 + 1][arg1 + 1];
				local104 = arg4[arg0 + 1][arg1 + 1];
				local98 = arg6[arg0 + 1][arg1 + 1];
			} else if (local28 == 0 && local37 == 128) {
				local98 = arg6[arg0][arg1 + 1];
				local92 = arg8[arg0][arg1 + 1];
				local104 = arg4[arg0][arg1 + 1];
			} else {
				local92 = arg8[arg0][arg1];
				local98 = arg6[arg0][arg1];
				@Pc(207) float local207 = (float) local28 / 128.0F;
				@Pc(212) float local212 = (float) local37 / 128.0F;
				@Pc(227) float local227 = local98 + local207 * (arg6[arg0 + 1][arg1] - local98);
				@Pc(241) float local241 = local92 + (arg8[arg0 + 1][arg1] - local92) * local207;
				@Pc(249) float local249 = arg8[arg0][arg1 + 1];
				local104 = arg4[arg0][arg1];
				@Pc(263) float local263 = arg4[arg0][arg1 + 1];
				@Pc(279) float local279 = local249 + (arg8[arg0 + 1][arg1 + 1] - local249) * local207;
				local92 = local241 + local212 * (local279 - local241);
				@Pc(303) float local303 = local104 + (arg4[arg0 + 1][arg1] - local104) * local207;
				@Pc(319) float local319 = local263 + local207 * (arg4[arg0 + 1][arg1 + 1] - local263);
				local104 = local303 + (local319 - local303) * local212;
				@Pc(336) float local336 = arg6[arg0][arg1 + 1];
				@Pc(352) float local352 = local336 + (arg6[arg0 + 1][arg1 + 1] - local336) * local207;
				local98 = local227 + (local352 - local227) * local212;
			}
			@Pc(394) int local394 = Static18.method376(arg2, arg1, local28, local37, arg0);
			@Pc(401) int local401 = (arg0 << 7) + local28;
			@Pc(408) int local408 = (arg1 << 7) + local37;
			local16[local18] = arg3.method4795(arg9, local401, local394, local408, local104, local92, local98);
		}
		arg3.method4794(local16);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method4583() {
		@Pc(11) int local11 = Static186.anInt4165;
		@Pc(13) int local13 = Static54.anInt1439;
		@Pc(20) int local20 = Static105.anInt6113 - Static193.anInt4370 - local13;
		@Pc(28) int local28 = Static80.anInt1912 - Static144.anInt3368 - local11;
		if (local13 <= 0 && local20 <= 0 && local11 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(53) Container local53;
			if (Static158.aFrame2 != null) {
				local53 = Static158.aFrame2;
			} else if (Static48.aFrame1 == null) {
				local53 = Static43.aClass66_1.anApplet1;
			} else {
				local53 = Static48.aFrame1;
			}
			@Pc(63) int local63 = 0;
			@Pc(65) int local65 = 0;
			if (local53 == Static48.aFrame1) {
				@Pc(72) Insets local72 = Static48.aFrame1.getInsets();
				local63 = local72.left;
				local65 = local72.top;
			}
			@Pc(81) Graphics local81 = local53.getGraphics();
			local81.setColor(Color.black);
			if (local13 > 0) {
				local81.fillRect(local63, local65, local13, Static80.anInt1912);
			}
			if (local11 > 0) {
				local81.fillRect(local63, local65, Static105.anInt6113, local11);
			}
			if (local20 > 0) {
				local81.fillRect(local63 + Static105.anInt6113 - local20, local65, local20, Static80.anInt1912);
			}
			if (local28 > 0) {
				local81.fillRect(local63, Static80.anInt1912 + local65 - local28, Static105.anInt6113, local28);
			}
		} catch (@Pc(137) Exception local137) {
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V")
	public static void method4584(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static91.method1593(arg0)) {
			return;
		}
		@Pc(20) Class116[] local20 = Static81.aClass116ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(35) Class116 local35 = local20[local22];
			if (local35.anObjectArray28 != null) {
				@Pc(43) Class1_Sub27 local43 = new Class1_Sub27();
				local43.anObjectArray32 = local35.anObjectArray28;
				local43.aClass116_13 = local35;
				Static33.method675(2000000, local43);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)I")
	public static int method4588(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
