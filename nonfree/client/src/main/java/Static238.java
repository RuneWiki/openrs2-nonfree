import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
	public static int anInt4577 = 0;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method3985(@OriginalArg(1) Class144 arg0) {
		if (Static466.aClass32_45.method589() == 0) {
			return;
		}
		@Pc(32) Class14_Sub35 local32;
		if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 0) {
			for (local32 = (Class14_Sub35) Static466.aClass32_45.method584(); local32 != null; local32 = (Class14_Sub35) Static466.aClass32_45.method577()) {
				Static252.aClass56_1.method1044(local32.anInt7316, false, local32.anInt7321, local32.anInt7322, false, arg0, local32.anInt7319, arg0, local32.aBoolean512 ? Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 : null, Static474.aClass68_9, local32.anInt7318);
				local32.method9513();
			}
			Static438.method6532();
			return;
		}
		if (Static109.aClass144_4 == null) {
			@Pc(86) Canvas local86 = new Canvas();
			local86.setSize(36, 32);
			Static109.aClass144_4 = Static11.method237(local86, 0, Static160.anInterface4_3, Static75.aClass310_17, 0);
			Static157.aClass68_1 = Static109.aClass144_4.method6958(Static584.method8114(Static191.anInt3328, Static130.aClass310_31), Static697.method6470(Static99.aClass310_23, Static191.anInt3328), true);
		}
		for (local32 = (Class14_Sub35) Static466.aClass32_45.method584(); local32 != null; local32 = (Class14_Sub35) Static466.aClass32_45.method577()) {
			Static252.aClass56_1.method1044(local32.anInt7316, false, local32.anInt7321, local32.anInt7322, false, arg0, local32.anInt7319, Static109.aClass144_4, local32.aBoolean512 ? Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass398_1 : null, Static157.aClass68_1, local32.anInt7318);
			local32.method9513();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIB)Z")
	public static boolean method3986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
