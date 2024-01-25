import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "Lclient!ln;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method195() {
		for (@Pc(12) Class4_Sub14 local12 = (Class4_Sub14) Static289.aClass91_31.method2584(); local12 != null; local12 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
			if (Static112.method2197(local12.anInt2132)) {
				Static368.method5235(local12);
			}
		}
		if (Static352.anInt6233 == 1) {
			Static459.method5986();
			return;
		}
		Static227.method3863(Static22.anInt426, Static177.anInt3637, Static153.anInt3164, Static223.anInt4455);
		@Pc(58) int local58 = Static296.aClass84_10.method2381(Static311.aClass21_95.method362(Static168.anInt3290));
		for (@Pc(65) Class4_Sub14 local65 = (Class4_Sub14) Static289.aClass91_31.method2584(); local65 != null; local65 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
			@Pc(73) int local73 = Static85.method1761(local65);
			if (local73 > local58) {
				local58 = local73;
			}
		}
		Static177.anInt3637 = local58 + 8;
		Static153.anInt3164 = Static352.anInt6233 * 16 + (Static314.aBoolean588 ? 26 : 22);
	}
}
