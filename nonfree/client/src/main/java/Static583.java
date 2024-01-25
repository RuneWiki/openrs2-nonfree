import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "[I")
	public static int[] anIntArray754;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "Lclient!ft;")
	public static Class5_Sub16_Sub1 aClass5_Sub16_Sub1_6;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "J")
	public static long aLong252 = 1L;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!cga;")
	public static final Class52 aClass52_6 = new Class52();

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "Lclient!vfa;")
	public static Class357 aClass357_12 = null;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILclient!ha;IIIIIILclient!fa;II)V")
	public static void method8178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class5_Sub4_Sub6 arg9, @OriginalArg(11) int arg10) {
		if (arg7 > arg10 && arg10 + arg1 > arg7 && arg8 > arg6 - 13 && arg6 + 3 > arg8) {
			arg5 = arg0;
		}
		@Pc(44) String local44 = Static320.method4984(arg9);
		Static471.aClass6_12.method7219(Static394.anIntArray545, arg5, local44, arg10 + 3, arg6, Static158.aClass44Array7);
	}
}
