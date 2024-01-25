import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!hw;I)V")
	public static void method1452(@OriginalArg(0) Class21_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(15) Class4_Sub43 local15 = (Class4_Sub43) Static458.aClass221_32.method5075((long) arg0.anInt4256);
		if (local15 == null) {
			return;
		}
		if (local15.aClass4_Sub21_Sub2_3 != null) {
			Static472.aClass4_Sub21_Sub3_2.method5931(local15.aClass4_Sub21_Sub2_3);
			local15.aClass4_Sub21_Sub2_3 = null;
		}
		local15.method8193();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IB)Z")
	public static boolean method1455(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
