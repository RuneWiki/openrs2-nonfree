import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "[S")
	public static short[] aShortArray8 = new short[256];

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
	public static final int[] anIntArray63 = new int[32];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public static void method598() {
		if (Static121.anInt6774 == 10) {
			Static181.method3326(28);
		}
		if (Static121.anInt6774 == 30) {
			Static181.method3326(25);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method599() {
		for (@Pc(15) Class2_Sub7_Sub7 local15 = (Class2_Sub7_Sub7) Static248.aClass238_25.method5795(); local15 != null; local15 = (Class2_Sub7_Sub7) Static248.aClass238_25.method5799()) {
			@Pc(20) Class1_Sub2_Sub6 local20 = local15.aClass1_Sub2_Sub6_1;
			if (local20.aBoolean481) {
				local15.method6130();
				local20.method5904();
			} else if (local20.anInt6806 <= Static339.anInt6265) {
				local20.method5900(Static278.anInt5166);
				if (local20.aBoolean481) {
					local15.method6130();
				} else {
					Static233.method4185(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
	public static void method601(@OriginalArg(0) int arg0) {
		Static385.anInt7009 = arg0;
		Static46.aClass41_63.method825();
	}
}
