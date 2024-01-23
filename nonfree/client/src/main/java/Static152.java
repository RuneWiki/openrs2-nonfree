import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!nk;")
	public static Class121 aClass121_23;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "I")
	private static int anInt753;

	@OriginalMember(owner = "client!l", name = "P", descriptor = "I")
	private static int anInt754;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Z")
	public static boolean aBoolean35 = true;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	public static int anInt728 = 0;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "[I")
	public static int[] anIntArray42 = new int[50];

	@OriginalMember(owner = "client!l", name = "I", descriptor = "[I")
	public static int[] anIntArray43 = new int[128];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Lclient!jh;")
	public static Class1_Sub2_Sub6_Sub1 method670(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub6_Sub1 local10 = (Class1_Sub2_Sub6_Sub1) Static311.aClass187_157.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static103.aClass121_52.method3115(arg0, 0);
		local10 = new Class1_Sub2_Sub6_Sub1(local20);
		local10.method4031(Static84.aClass23Array3, null);
		Static311.aClass187_157.method4524((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	public static void method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static213.anInt4452 < arg2 || arg3 < Static98.anInt2007) {
			return;
		}
		@Pc(24) boolean local24;
		if (arg1 < Static29.anInt517) {
			arg1 = Static29.anInt517;
			local24 = false;
		} else if (arg1 <= Static11.anInt170) {
			local24 = true;
		} else {
			arg1 = Static11.anInt170;
			local24 = false;
		}
		@Pc(45) boolean local45;
		if (Static29.anInt517 > arg0) {
			local45 = false;
			arg0 = Static29.anInt517;
		} else if (Static11.anInt170 >= arg0) {
			local45 = true;
		} else {
			local45 = false;
			arg0 = Static11.anInt170;
		}
		if (Static98.anInt2007 <= arg2) {
			Static273.method4257(arg1, Static183.anIntArrayArray26[arg2++], arg4, arg0);
		} else {
			arg2 = Static98.anInt2007;
		}
		if (arg3 > Static213.anInt4452) {
			arg3 = Static213.anInt4452;
		} else {
			Static273.method4257(arg1, Static183.anIntArrayArray26[arg3--], arg4, arg0);
		}
		@Pc(102) int local102;
		if (local24 && local45) {
			for (local102 = arg2; local102 <= arg3; local102++) {
				@Pc(109) int[] local109 = Static183.anIntArrayArray26[local102];
				local109[arg1] = local109[arg0] = arg4;
			}
		} else if (local24) {
			for (local102 = arg2; local102 <= arg3; local102++) {
				Static183.anIntArrayArray26[local102][arg1] = arg4;
			}
		} else if (local45) {
			for (local102 = arg2; local102 <= arg3; local102++) {
				Static183.anIntArrayArray26[local102][arg0] = arg4;
			}
		}
	}
}
