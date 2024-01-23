import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Lclient!jb;")
	public static Class28 aClass28_54;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Lclient!df;")
	public static Class27 aClass27_5;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "I")
	public static int anInt3118;

	@OriginalMember(owner = "client!na", name = "E", descriptor = "I")
	public static int anInt3120;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_85;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "Z")
	public static boolean aBoolean263 = false;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "Lclient!sc;")
	private static Class107 aClass107_846 = Static231.method3737("Loaded update list");

	@OriginalMember(owner = "client!na", name = "y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_845 = aClass107_846;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "[I")
	public static int[] anIntArray267 = new int[2000];

	@OriginalMember(owner = "client!na", name = "L", descriptor = "I")
	public static int anInt3122 = 0;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "I")
	public static int anInt3124 = 0;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "Lclient!sc;")
	public static Class107 aClass107_847 = Static231.method3737("Welt");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!jb;IBI)[Lclient!tg;")
	public static Class1_Sub2_Sub2[] method2352(@OriginalArg(0) Class28 arg0, @OriginalArg(3) int arg1) {
		return Static83.method1393(arg1, arg0) ? Static84.method1416() : null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
	public static void method2353() {
		Static218.aClass61_87.method1695(5);
		Static116.aClass61_47.method1695(5);
		Static95.aClass61_34.method1695(5);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIIILclient!eg;II)V")
	public static void method2354(@OriginalArg(1) int arg0, @OriginalArg(4) Class5_Sub5 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static49.method1016(arg2, arg1.anInt3021, arg0, arg1.anInt3044, arg3);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IJZI)Z")
	public static boolean method2355(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = (int) arg1 >> 14 & 0x1F;
		@Pc(15) int local15 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		if (local8 == 10 || local8 == 11 || local8 == 22) {
			@Pc(41) Class101 local41 = Static170.method2725(local15);
			@Pc(44) int local44 = local41.anInt3907;
			@Pc(57) int local57;
			@Pc(60) int local60;
			if (local22 == 0 || local22 == 2) {
				local57 = local41.anInt3922;
				local60 = local41.anInt3904;
			} else {
				local57 = local41.anInt3904;
				local60 = local41.anInt3922;
			}
			if (local22 != 0) {
				local44 = (local44 << local22 & 0xF) + (local44 >> 4 - local22);
			}
			Static119.method2054(local44, arg2, local57, arg0, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, true, local60, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
		} else {
			Static119.method2054(0, arg2, 0, arg0, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], local8 + 1, true, 0, local22, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
		}
		Static163.anInt3549 = Static20.anInt2218;
		Static118.anInt2619 = Static161.anInt3533;
		Static217.anInt4746 = 2;
		Static228.anInt4955 = 0;
		return true;
	}
}
