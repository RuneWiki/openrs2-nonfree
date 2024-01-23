import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!lo", name = "C", descriptor = "I")
	public static int anInt3300;

	@OriginalMember(owner = "client!lo", name = "I", descriptor = "[Lclient!wb;")
	public static Class4_Sub2_Sub4[] aClass4_Sub2_Sub4Array9;

	@OriginalMember(owner = "client!lo", name = "y", descriptor = "Lclient!tm;")
	public static Class163 aClass163_24 = new Class163(16);

	@OriginalMember(owner = "client!lo", name = "A", descriptor = "Lclient!ul;")
	public static Class172 aClass172_29 = new Class172(64);

	@OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
	public static int anInt3301 = 0;

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "[I")
	public static int[] anIntArray270 = new int[50];

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V")
	public static void method2600() {
		Static175.aClass172_32.method4346();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!cg;Lclient!co;BLclient!cg;Lclient!cg;)Z")
	public static boolean method2601(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class4_Sub6_Sub2 arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) Class22 arg3) {
		Static262.aClass22_90 = arg0;
		Static228.aClass4_Sub6_Sub2_2 = arg1;
		Static297.aClass22_92 = arg2;
		Static261.aClass22_89 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)Lclient!wa;")
	public static Class182 method2602(@OriginalArg(0) int arg0) {
		@Pc(10) Class182 local10 = (Class182) Static121.aClass172_21.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static242.aClass22_80.method665(33, arg0);
		local10 = new Class182();
		if (local28 != null) {
			local10.method4595(new Class4_Sub24(local28), arg0);
		}
		Static121.aClass172_21.method4345(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZII)V")
	public static void method2603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) int local23 = Static279.anInt5471 * arg0 >> 8;
		if (arg1 == -1 && !Static64.aBoolean80) {
			Static268.method4234();
		} else if (arg1 != -1 && (arg1 != Static111.anInt2209 || !Static191.method3154()) && local23 != 0 && !Static64.aBoolean80) {
			Static257.method4008(local23, Static145.aClass22_101, arg1);
		}
		Static111.anInt2209 = arg1;
	}
}
