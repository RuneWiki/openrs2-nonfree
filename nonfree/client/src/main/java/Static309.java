import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "Lclient!uf;")
	public static Class174 aClass174_3;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
	public static int anInt6195;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	public static int anInt6184 = 0;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "Lclient!vj;")
	public static Class1_Sub30 aClass1_Sub30_2 = new Class1_Sub30(0, -1);

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "[C")
	public static char[] aCharArray7 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	public static int anInt6194 = 2;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString442 = "glow2:";

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "[S")
	public static short[] aShortArray100 = new short[256];

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "J")
	public static long aLong239 = 0L;

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
	public static int anInt6196 = 0;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "[S")
	public static short[] aShortArray101 = new short[] { 39, 19, 8, 3, 15, 1, 26, 51 };

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4686(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(15) int local15 = arg2.indexOf(arg1); local15 != -1; local15 = arg2.indexOf(arg1, arg0.length() + local15)) {
			arg2 = arg2.substring(0, local15) + arg0 + arg2.substring(local15 + arg1.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([[FILclient!fn;[[II[[F[III[[FLclient!wb;)V")
	public static void method4687(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) Class189 arg9) {
		@Pc(19) int[] local19 = new int[arg6.length / 2];
		for (@Pc(25) int local25 = 0; local25 < local19.length; local25++) {
			@Pc(35) int local35 = arg6[local25 + local25];
			@Pc(43) int local43 = arg6[local25 + local25 + 1];
			@Pc(72) int local72;
			if (arg1 == 1) {
				local72 = local35;
				local35 = local43;
				local43 = 128 - local72;
			} else if (arg1 == 2) {
				local43 = 128 - local43;
				local35 = 128 - local35;
			} else if (arg1 == 3) {
				local72 = local35;
				local35 = 128 - local43;
				local43 = local72;
			}
			@Pc(100) float local100;
			@Pc(112) float local112;
			@Pc(106) float local106;
			if (local35 == 0 && local43 == 0) {
				local100 = arg8[arg7][arg4];
				local106 = arg0[arg7][arg4];
				local112 = arg5[arg7][arg4];
			} else if (local35 == 128 && local43 == 0) {
				local100 = arg8[arg7 + 1][arg4];
				local106 = arg0[arg7 + 1][arg4];
				local112 = arg5[arg7 + 1][arg4];
			} else if (local35 == 128 && local43 == 128) {
				local106 = arg0[arg7 + 1][arg4 + 1];
				local112 = arg5[arg7 + 1][arg4 + 1];
				local100 = arg8[arg7 + 1][arg4 + 1];
			} else if (local35 == 0 && local43 == 128) {
				local112 = arg5[arg7][arg4 + 1];
				local106 = arg0[arg7][arg4 + 1];
				local100 = arg8[arg7][arg4 + 1];
			} else {
				local106 = arg0[arg7][arg4];
				local100 = arg8[arg7][arg4];
				@Pc(180) float local180 = (float) local35 / 128.0F;
				local112 = arg5[arg7][arg4];
				@Pc(200) float local200 = local100 + local180 * (arg8[arg7 + 1][arg4] - local100);
				@Pc(215) float local215 = local106 + local180 * (arg0[arg7 + 1][arg4] - local106);
				@Pc(220) float local220 = (float) local43 / 128.0F;
				@Pc(228) float local228 = arg0[arg7][arg4 + 1];
				@Pc(245) float local245 = local228 + (arg0[arg7 + 1][arg4 + 1] - local228) * local180;
				@Pc(260) float local260 = local112 + local180 * (arg5[arg7 + 1][arg4] - local112);
				local106 = local215 + local220 * (local245 - local215);
				@Pc(276) float local276 = arg5[arg7][arg4 + 1];
				@Pc(284) float local284 = arg8[arg7][arg4 + 1];
				@Pc(301) float local301 = local276 + (arg5[arg7 + 1][arg4 + 1] - local276) * local180;
				local112 = local260 + local220 * (local301 - local260);
				@Pc(326) float local326 = local284 + (arg8[arg7 + 1][arg4 + 1] - local284) * local180;
				local100 = local200 + (local326 - local200) * local220;
			}
			@Pc(399) int local399 = local35 + (arg7 << 7);
			@Pc(407) int local407 = Static108.method1779(arg4, arg3, local35, local43, arg7);
			@Pc(413) int local413 = local43 + (arg4 << 7);
			local19[local25] = arg9.method4643(arg2, local399, local407, local413, local106, local100, local112);
		}
		arg9.method4641(local19);
	}
}
