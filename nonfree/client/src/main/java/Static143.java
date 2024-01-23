import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString95 = "glow1:";

	@OriginalMember(owner = "client!km", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray76 = new byte[250][];

	@OriginalMember(owner = "client!km", name = "k", descriptor = "Lclient!ok;")
	public static Class116 aClass116_8 = null;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString96 = "yellow:";

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([[F[[FI[[F[[IZIFILclient!kd;III[[IIIII)I")
	public static int method2586(@OriginalArg(0) float[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class1_Sub20 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int[][] arg13, @OriginalArg(14) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16) {
		@Pc(16) int local16;
		if (arg12 == 1) {
			local16 = arg6;
			arg6 = arg11;
			arg11 = 128 - local16;
		} else if (arg12 == 2) {
			arg11 = 128 - arg11;
			arg6 = 128 - arg6;
		} else if (arg12 == 3) {
			local16 = arg6;
			arg6 = 128 - arg11;
			arg11 = local16;
		}
		@Pc(68) float local68;
		@Pc(74) float local74;
		@Pc(76) int local76;
		@Pc(62) float local62;
		if (arg6 == 0 && arg11 == 0) {
			local62 = arg3[arg2][arg8];
			local68 = arg0[arg2][arg8];
			local74 = arg1[arg2][arg8];
			local76 = arg14;
		} else if (arg6 == 128 && arg11 == 0) {
			local62 = arg3[arg2 + 1][arg8];
			local74 = arg1[arg2 + 1][arg8];
			local76 = arg16;
			local68 = arg0[arg2 + 1][arg8];
		} else if (arg6 == 128 && arg11 == 128) {
			local76 = arg10;
			local68 = arg0[arg2 + 1][arg8 + 1];
			local62 = arg3[arg2 + 1][arg8 + 1];
			local74 = arg1[arg2 + 1][arg8 + 1];
		} else if (arg6 == 0 && arg11 == 128) {
			local62 = arg3[arg2][arg8 + 1];
			local76 = arg15;
			local74 = arg1[arg2][arg8 + 1];
			local68 = arg0[arg2][arg8 + 1];
		} else {
			local74 = arg1[arg2][arg8];
			@Pc(141) float local141 = (float) arg11 / 128.0F;
			local62 = arg3[arg2][arg8];
			@Pc(155) float local155 = arg3[arg2][arg8 + 1];
			@Pc(160) float local160 = (float) arg6 / 128.0F;
			@Pc(168) float local168 = arg0[arg2][arg8 + 1];
			@Pc(184) float local184 = local168 + (arg0[arg2 + 1][arg8 + 1] - local168) * local160;
			local68 = arg0[arg2][arg8];
			@Pc(204) float local204 = local68 + (arg0[arg2 + 1][arg8] - local68) * local160;
			local68 = local204 + (local184 - local204) * local141;
			@Pc(227) float local227 = local74 + (arg1[arg2 + 1][arg8] - local74) * local160;
			@Pc(242) float local242 = local62 + (arg3[arg2 + 1][arg8] - local62) * local160;
			@Pc(259) float local259 = local155 + (arg3[arg2 + 1][arg8 + 1] - local155) * local160;
			@Pc(267) float local267 = arg1[arg2][arg8 + 1];
			local62 = local242 + (local259 - local242) * local141;
			@Pc(292) float local292 = local267 + local160 * (arg1[arg2 + 1][arg8 + 1] - local267);
			@Pc(298) int local298 = Static16.method362(arg6, arg16, arg14);
			@Pc(304) int local304 = Static16.method362(arg6, arg10, arg15);
			local76 = Static16.method362(arg11, local304, local298);
			local74 = local227 + (local292 - local227) * local141;
		}
		@Pc(386) int local386 = arg6 + (arg2 << 7);
		@Pc(393) int local393 = (arg8 << 7) + arg11;
		@Pc(401) int local401 = Static18.method376(arg13, arg8, arg6, arg11, arg2);
		return arg9.method2363(local386, local401, local393, local62, local68, local74, arg5 ? local76 & 0xFFFFFF00 : local76, arg4 == null ? 0.0F : (float) (local401 - Static18.method376(arg4, arg8, arg6, arg11, arg2)) / arg7);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method2587(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg0); local9 != -1; local9 = arg1.indexOf(arg0, local9 + arg2.length())) {
			arg1 = arg1.substring(0, local9) + arg2 + arg1.substring(local9 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIBIIIIZF)[[I")
	public static int[][] method2589(@OriginalArg(8) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub1_Sub36 local13 = new Class1_Sub1_Sub36();
		local13.anInt5634 = (int) (arg0 * 4096.0F);
		local13.anInt5643 = 3;
		local13.aBoolean298 = false;
		local13.anInt5633 = 8;
		local13.anInt5632 = 4;
		local13.method4756();
		Static254.method4235(256, 64);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local13.method4392(local9[local47], local47);
		}
		return local9;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public static void method2591() {
		Static27.aByteArrayArrayArray5 = null;
		Static182.anIntArray446 = null;
		Static271.aByteArrayArrayArray52 = null;
		Static191.anIntArray382 = null;
		Static241.aByteArrayArrayArray46 = null;
		Static225.anIntArray515 = null;
		Static8.anIntArray447 = null;
		Static64.anIntArrayArrayArray5 = null;
		Static88.aByteArrayArrayArray13 = null;
		Static220.anIntArray498 = null;
		Static117.aByteArrayArrayArray20 = null;
		Static273.anIntArray585 = null;
	}
}
