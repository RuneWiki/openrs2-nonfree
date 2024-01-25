import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "Lclient!dn;")
	public static Class69 aClass69_65;

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "Lclient!il;")
	public static final Class139 aClass139_4 = new Class139("LIVE", 0);

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray84 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLclient!os;)Lclient!gl;")
	public static Class22_Sub2 method5660(@OriginalArg(1) Class1_Sub17 arg0) {
		return new Class22_Sub2(arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4486(), arg0.method4487());
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class232 local13 = local7.aClass232_2; local13 != null; local13 = local13.aClass232_3) {
			@Pc(17) Class20_Sub1 local17 = local13.aClass20_Sub1_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort124 == arg1 && local17.aShort123 == arg2) {
				Static468.method7128(local17);
				return;
			}
		}
	}
}
