import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "Lclient!em;")
	public static Class83 aClass83_147;

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
	public static int anInt7226;

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "Lclient!fc;")
	public static final Class93 aClass93_5 = new Class93("WTWIP", 3);

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
	public static int anInt7222 = 0;

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "[I")
	public static final int[] anIntArray430 = new int[500];

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)Lclient!nn;")
	public static Class240 method5806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class240 local7 = new Class240();
		local7.anInt6475 = -1;
		local7.anInt6471 = arg0 + 1 + 5;
		local7.anInt6486 = arg1 + 1 + 5;
		local7.anInt6474 = -1;
		local7.anIntArrayArray34 = new int[local7.anInt6471][local7.anInt6486];
		local7.method5260();
		return local7;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!vv;III)V")
	public static void method5809(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class360 local12;
		if (arg2 < Static327.anInt5993) {
			local12 = Static568.aClass360ArrayArrayArray22[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass11_Sub1_Sub4_1 != null && local12.aClass11_Sub1_Sub4_1.method7214()) {
				arg0.method7215(local12.aClass11_Sub1_Sub4_1, 0, 0, true, Static458.aClass78_153, Static165.anInt3157);
			}
		}
		if (arg3 < Static327.anInt5993) {
			local12 = Static568.aClass360ArrayArrayArray22[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass11_Sub1_Sub4_1 != null && local12.aClass11_Sub1_Sub4_1.method7214()) {
				arg0.method7215(local12.aClass11_Sub1_Sub4_1, 0, Static165.anInt3157, true, Static458.aClass78_153, 0);
			}
		}
		if (arg2 < Static327.anInt5993 && arg3 < Static191.anInt3757) {
			local12 = Static568.aClass360ArrayArrayArray22[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass11_Sub1_Sub4_1 != null && local12.aClass11_Sub1_Sub4_1.method7214()) {
				arg0.method7215(local12.aClass11_Sub1_Sub4_1, 0, Static165.anInt3157, true, Static458.aClass78_153, Static165.anInt3157);
			}
		}
		if (arg2 < Static327.anInt5993 && arg3 > 0) {
			local12 = Static568.aClass360ArrayArrayArray22[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass11_Sub1_Sub4_1 != null && local12.aClass11_Sub1_Sub4_1.method7214()) {
				arg0.method7215(local12.aClass11_Sub1_Sub4_1, 0, -Static165.anInt3157, true, Static458.aClass78_153, Static165.anInt3157);
			}
		}
	}
}
