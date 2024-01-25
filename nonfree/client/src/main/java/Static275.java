import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public static int anInt5759;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIBIII)V")
	public static void method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static292.anInt5983 <= arg4 && Static61.anInt1627 >= arg0 && Static289.anInt5872 <= arg2 && arg3 <= Static160.anInt3347) {
			Static406.method6143(arg0, arg4, arg1, arg3, arg2);
		} else {
			Static100.method1928(arg1, arg4, arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	public static void method4452() {
		@Pc(12) Class4_Sub39 local12 = Static32.method999(Static402.aClass356_1, Static462.aClass344_84);
		local12.aClass4_Sub13_Sub2_1.method7052(Static578.method8122());
		local12.aClass4_Sub13_Sub2_1.method7038(Static123.anInt9150);
		local12.aClass4_Sub13_Sub2_1.method7038(Static71.anInt1872);
		local12.aClass4_Sub13_Sub2_1.method7052(Static455.aClass4_Sub35_Sub1_1.anInt9914);
		Static50.method1166(local12);
	}
}
