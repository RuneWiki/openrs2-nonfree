import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
	public static int anInt6002;

	@OriginalMember(owner = "client!sq", name = "Y", descriptor = "[Lclient!wj;")
	public static Class219[] aClass219Array1;

	@OriginalMember(owner = "client!sq", name = "Z", descriptor = "Z")
	public static boolean aBoolean525;

	@OriginalMember(owner = "client!sq", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString226 = "Connected to update server";

	@OriginalMember(owner = "client!sq", name = "R", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!sq", name = "S", descriptor = "I")
	public static int anInt6000 = 0;

	@OriginalMember(owner = "client!sq", name = "V", descriptor = "I")
	public static int anInt6003 = 0;

	@OriginalMember(owner = "client!sq", name = "bb", descriptor = "I")
	public static int anInt6006 = 0;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIII)V")
	public static void method5044(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static165.anInt3366 = arg0;
		Static338.anInt5369 = 0;
		Static295.anInt5964 = arg1;
		Static229.anInt4777 = 0;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V")
	public static void method5045() {
		@Pc(1) Class154 local1 = Static148.aClass154_75;
		synchronized (Static148.aClass154_75) {
			Static148.aClass154_75.method4212();
		}
		local1 = Static251.aClass154_79;
		synchronized (Static251.aClass154_79) {
			Static251.aClass154_79.method4212();
		}
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(II)V")
	public static void method5046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class57 local28 = Static18.aClass57ArrayArrayArray1[local9][arg0][arg1] = Static18.aClass57ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte32--;
				for (@Pc(40) Class95 local40 = local28.aClass95_2; local40 != null; local40 = local40.aClass95_3) {
					@Pc(44) Class2_Sub2 local44 = local40.aClass2_Sub2_1;
					if (local44.aShort85 == arg0 && local44.aShort84 == arg1) {
						local44.aByte73--;
					}
				}
			}
		}
		if (Static18.aClass57ArrayArrayArray1[0][arg0][arg1] == null) {
			Static18.aClass57ArrayArrayArray1[0][arg0][arg1] = new Class57(0, arg0, arg1);
			Static18.aClass57ArrayArrayArray1[0][arg0][arg1].aByte31 = 1;
		}
		Static18.aClass57ArrayArrayArray1[0][arg0][arg1].aClass57_1 = local7;
		Static18.aClass57ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
