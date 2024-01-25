import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hia", name = "i", descriptor = "Lclient!al;")
	public static Class19 aClass19_2;

	@OriginalMember(owner = "client!hia", name = "j", descriptor = "Lclient!da;")
	public static Class73 aClass73_8;

	@OriginalMember(owner = "client!hia", name = "m", descriptor = "D")
	public static double aDouble8;

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_38 = new Class305(74, 12);

	@OriginalMember(owner = "client!hia", name = "k", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_24 = new Class114();

	@OriginalMember(owner = "client!hia", name = "l", descriptor = "[I")
	public static final int[] anIntArray213 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)Lclient!aca;")
	public static Class6_Sub1 method3569() {
		return Static379.anInt6764 < Static394.aClass6_Sub1Array2.length ? Static394.aClass6_Sub1Array2[Static379.anInt6764++] : null;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIFII[FIIIF[FIFI)V")
	public static void method3570(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11, @OriginalArg(13) int arg12) {
		@Pc(9) int local9 = arg12 - arg0;
		@Pc(13) int local13 = arg6 - arg2;
		@Pc(17) int local17 = arg3 - arg10;
		@Pc(38) float local38 = arg4[2] * (float) local9 + arg4[0] * (float) local17 + arg4[1] * (float) local13;
		@Pc(63) float local63 = arg4[5] * (float) local9 + arg4[4] * (float) local13 + arg4[3] * (float) local17;
		@Pc(84) float local84 = (float) local9 * arg4[8] + (float) local17 * arg4[6] + (float) local13 * arg4[7];
		@Pc(99) float local99;
		@Pc(93) float local93;
		if (arg5 == 0) {
			local93 = arg8 + 0.5F - local84;
			local99 = local38 + arg1 + 0.5F;
		} else if (arg5 == 1) {
			local93 = local84 + arg8 + 0.5F;
			local99 = arg1 + local38 + 0.5F;
		} else if (arg5 == 2) {
			local93 = arg11 + 0.5F - local63;
			local99 = arg1 + 0.5F - local38;
		} else if (arg5 == 3) {
			local93 = arg11 + 0.5F - local63;
			local99 = local38 + arg1 + 0.5F;
		} else if (arg5 == 4) {
			local99 = arg8 + local84 + 0.5F;
			local93 = arg11 + 0.5F - local63;
		} else {
			local93 = arg11 + 0.5F - local63;
			local99 = arg8 + 0.5F - local84;
		}
		@Pc(196) float local196;
		if (arg7 == 1) {
			local196 = local99;
			local99 = -local93;
			local93 = local196;
		} else if (arg7 == 2) {
			local99 = -local99;
			local93 = -local93;
		} else if (arg7 == 3) {
			local196 = local99;
			local99 = local93;
			local93 = -local196;
		}
		arg9[0] = local99;
		arg9[1] = local93;
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V")
	public static void method3571() {
		Static258.method4026(Static172.aClass5_Sub50_14.aClass12_Sub17_1.method4523() == 1);
		Static39.aClass255_1 = Static1.method8277(22050, Static141.aCanvas7, 0, Static570.aClass268_5);
		Static261.method4087(Static326.method5068((Class5_Sub17_Sub1) null));
		Static345.aClass255_3 = Static1.method8277(2048, Static141.aCanvas7, 1, Static570.aClass268_5);
		Static245.aClass5_Sub17_Sub4_2 = new Class5_Sub17_Sub4();
		Static345.aClass255_3.method7454(Static245.aClass5_Sub17_Sub4_2);
		Static264.aClass276_2 = new Class276(22050, Static302.anInt5797);
		Static481.method6852();
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IZ)V")
	public static void method3572(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub40 local10 = (Class5_Sub40) Static133.aClass300_10.method7188((long) arg0);
		if (local10 != null) {
			local10.aClass140_Sub1_1.method7260();
			Static496.method7109(local10.aBoolean564, local10.anInt6338);
			local10.method9052();
		}
	}
}
