import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
	public static int[] anIntArray93;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!v;")
	public static Class3_Sub3_Sub2_Sub4_Sub1 aClass3_Sub3_Sub2_Sub4_Sub1_5;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public static int anInt1793;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	public static int anInt1794;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	public static int anInt1795 = 20;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_921 = Static193.method3027("<col=40ff00>");

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
	public static void method1309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static26.anInt554 && Static52.anInt1117 >= arg1) {
			@Pc(16) int local16 = Static130.method1827(Static200.anInt4074, arg2, Static119.anInt2428);
			@Pc(22) int local22 = Static130.method1827(Static200.anInt4074, arg0, Static119.anInt2428);
			Static57.method915(local22, arg1, arg3, local16);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	public static void method1312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass36_1 = null;
		}
	}
}
