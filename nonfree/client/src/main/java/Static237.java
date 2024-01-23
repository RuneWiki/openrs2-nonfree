import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!rg", name = "Ab", descriptor = "Lclient!wm;")
	public static Class3_Sub4_Sub24 aClass3_Sub4_Sub24_7;

	@OriginalMember(owner = "client!rg", name = "Uc", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array9;

	@OriginalMember(owner = "client!rg", name = "id", descriptor = "Lclient!rn;")
	public static Class155 aClass155_97;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!rn;I)Lclient!ho;")
	public static Class3_Sub4_Sub12 method4003(@OriginalArg(1) Class155 arg0, @OriginalArg(2) int arg1) {
		return Static287.method4736(arg1, arg0) ? Static21.method348() : null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIB)V")
	public static void method4006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg3, 10);
		local8.method971();
		local8.anInt1136 = arg0;
		local8.anInt1140 = arg1;
		local8.anInt1132 = arg2;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[[IBII[[FZZI[ZLclient!mi;I[[FZIZ[[III[II[[F)V")
	public static void method4008(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) Class3_Sub21 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13, @OriginalArg(15) boolean arg14, @OriginalArg(16) int[][] arg15, @OriginalArg(17) int arg16, @OriginalArg(18) int arg17, @OriginalArg(19) int[] arg18, @OriginalArg(20) int arg19, @OriginalArg(21) float[][] arg20) {
		@Pc(11) int local11 = (arg14 ? 255 : 0) + (arg13 << 8);
		@Pc(21) int local21 = (arg19 << 8) + (arg6 ? 255 : 0);
		@Pc(35) int local35 = (arg4 << 8) + (arg7 ? 255 : 0);
		@Pc(49) int local49 = (arg12 ? 255 : 0) + (arg0 << 8);
		@Pc(55) int[] local55 = new int[arg18.length / 2];
		for (@Pc(57) int local57 = 0; local57 < local55.length; local57++) {
			@Pc(74) int local74 = arg18[local57 + local57 + 1];
			@Pc(87) int[][] local87 = arg15 == null || arg8 == null || !arg8[local57] ? arg1 : arg15;
			@Pc(93) int local93 = arg18[local57 + local57];
			local55[local57] = Static41.method566(arg2, arg15, local49, local87, arg20, arg5, false, arg16, local74, local21, arg10, local93, arg11, local35, arg9, (float) arg3, local11);
		}
		arg9.method2860(arg17, arg16, arg10, local55, null, false);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)Z")
	public static boolean method4013() {
		if (Static109.aBoolean207) {
			try {
				Static325.method4166(Static274.aClass176_4.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}
}
