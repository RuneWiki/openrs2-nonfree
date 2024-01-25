import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!vw", name = "B", descriptor = "Lclient!hj;")
	public static Class151 aClass151_220;

	@OriginalMember(owner = "client!vw", name = "L", descriptor = "I")
	public static int anInt10259;

	@OriginalMember(owner = "client!vw", name = "C", descriptor = "[I")
	public static final int[] anIntArray709 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vw", name = "H", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_221 = new Class151(32, -1);

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "(I)V")
	public static void method8677() {
		Static466.method6470();
		Static423.aBoolean517 = false;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZBZ)V")
	public static void method8679(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static296.anInt4681++;
			Static403.method3864();
		}
		if (arg1) {
			Static242.anInt4001++;
			Static367.method4849();
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IILclient!gt;III)V")
	public static void method8681(@OriginalArg(0) int arg0, @OriginalArg(2) Class141 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1 || arg0 < 1 || arg4 > Static224.anInt3557 - 2 || Static267.anInt4309 - 2 < arg0) {
			return;
		}
		if (Static267.aClass73ArrayArrayArray2 == null) {
			return;
		}
		@Pc(46) Interface20 local46 = Static378.aClass100_Sub1_2.method2472(arg2, arg4, arg3, arg0);
		if (local46 == null) {
			return;
		}
		if (local46 instanceof Class3_Sub1_Sub2_Sub4) {
			((Class3_Sub1_Sub2_Sub4) local46).method4558(arg1);
			return;
		}
		if (local46 instanceof Class3_Sub1_Sub5_Sub2) {
			((Class3_Sub1_Sub5_Sub2) local46).method6897(arg1);
			return;
		}
		if (local46 instanceof Class3_Sub1_Sub4_Sub1) {
			((Class3_Sub1_Sub4_Sub1) local46).method2404(arg1);
			return;
		}
		if (local46 instanceof Class3_Sub1_Sub3_Sub2) {
			((Class3_Sub1_Sub3_Sub2) local46).method4905(arg1);
			return;
		}
	}
}
