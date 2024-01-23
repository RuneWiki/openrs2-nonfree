import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
	public static int anInt3820;

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "Lclient!wn;")
	public static Class182 aClass182_23 = new Class182();

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "Lclient!gd;")
	public static Class61 aClass61_33 = new Class61(64);

	@OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
	public static int anInt3821 = 0;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "[I")
	public static int[] anIntArray283 = new int[500];

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)I")
	public static int method2979(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 * 6 - 61440;
		@Pc(21) int local21 = (arg0 * local5 >> 12) + 40960;
		@Pc(35) int local35 = arg0 * (arg0 * arg0 >> 12) >> 12;
		return local21 * local35 >> 12;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIIBIIII)V")
	public static void method2980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class8_Sub16 local7 = new Class8_Sub16();
		local7.anInt2732 = arg8;
		local7.anInt2730 = arg11;
		local7.anInt2734 = arg10;
		local7.anInt2722 = arg7;
		local7.anInt2726 = arg2;
		local7.anInt2736 = arg5;
		local7.anInt2735 = arg1;
		local7.anInt2733 = arg6;
		local7.anInt2737 = arg9;
		local7.anInt2731 = arg3;
		local7.anInt2723 = arg4;
		local7.anInt2728 = arg0;
		Static229.aClass182_25.method4328(local7);
	}
}
