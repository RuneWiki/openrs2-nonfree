import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "Lclient!st;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
	public static int anInt7811;

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!pda", name = "u", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[4];

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)V")
	public static void method6718(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(17, arg0);
		local8.method3722();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B[Lclient!pga;)V")
	public static void method6724(@OriginalArg(1) Class32[] arg0) {
		Static78.anInt1660 = arg0.length;
		Static535.anIntArray567 = new int[Static78.anInt1660 + 10];
		Static428.aClass32Array16 = new Class32[Static78.anInt1660 + 10];
		Static655.method5831(arg0, 0, Static428.aClass32Array16, 0, Static78.anInt1660);
		for (@Pc(26) int local26 = 0; local26 < Static78.anInt1660; local26++) {
			Static535.anIntArray567[local26] = Static428.aClass32Array16[local26].method5079();
		}
		for (@Pc(53) int local53 = Static78.anInt1660; local53 < Static428.aClass32Array16.length; local53++) {
			Static535.anIntArray567[local53] = 12;
		}
	}
}
