import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	public static int anInt872 = 0;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_20 = new Class268(34, 12);

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
	public static int anInt873 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIZ)V")
	public static void method826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class274 local9 = Static476.aClass274ArrayArray4[arg1][arg0];
		Static608.method8500(local9 == null ? Static337.aClass274_2 : local9, arg2);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBIIIILjava/lang/String;I)V")
	public static void method827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class20_Sub10 local7 = new Class20_Sub10();
		local7.anInt8737 = arg4;
		local7.anInt8738 = arg3 + Static113.anInt2243;
		local7.anInt8739 = arg0;
		local7.aString100 = arg5;
		local7.anInt8735 = arg1;
		local7.anInt8736 = arg6;
		local7.anInt8744 = arg2;
		Static78.aClass81_1.method2119(local7);
	}
}
