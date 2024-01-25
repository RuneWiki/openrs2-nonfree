import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_103 = new Class397(25, -2);

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Z")
	public static boolean aBoolean442 = false;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_67 = new Class307(50);

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_68 = new Class307(8);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method5753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg1 - arg0;
		@Pc(22) int local22 = arg0 + arg5;
		for (@Pc(24) int local24 = arg5; local24 < local22; local24++) {
			Static202.method3077(Static118.anIntArrayArray7[local24], arg6, arg2, arg4);
		}
		@Pc(48) int local48 = arg0 + arg6;
		for (@Pc(50) int local50 = arg1; local50 > local18; local50--) {
			Static202.method3077(Static118.anIntArrayArray7[local50], arg6, arg2, arg4);
		}
		@Pc(72) int local72 = arg4 - arg0;
		for (@Pc(74) int local74 = local22; local74 <= local18; local74++) {
			@Pc(82) int[] local82 = Static118.anIntArrayArray7[local74];
			Static202.method3077(local82, arg6, arg2, local48);
			Static202.method3077(local82, local48, arg3, local72);
			Static202.method3077(local82, local72, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIILclient!ha;Lclient!dga;IIIII)V")
	public static void method5754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class22 arg4, @OriginalArg(6) Class3_Sub7_Sub5 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 > arg6 && arg0 < arg8 + arg6 && arg3 - 13 < arg1 && arg3 + 3 > arg1) {
			arg10 = arg9;
		}
		@Pc(48) String local48 = Static239.method3430(arg5);
		Static561.aClass57_10.method9143(Static413.aClass178Array13, Static218.anIntArray249, arg10, local48, arg6 + 3, arg3);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Z")
	public static boolean method5756(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
