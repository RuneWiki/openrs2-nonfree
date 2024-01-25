import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
	public static final int anInt8200 = 1406;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "([BB)Z")
	public static boolean method6748(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub7 local8 = new Class3_Sub7(arg0);
		@Pc(22) int local22 = local8.method6538();
		if (local22 != 2) {
			return false;
		}
		@Pc(42) boolean local42 = local8.method6538() == 1;
		if (local42) {
			Static317.method7631(local8);
		}
		Static175.method3126(local8);
		return true;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!tc;III)V")
	public static void method6749(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static360.aClass305_3 != null || Static256.aBoolean474 || (arg0 == null || Static380.method6129(arg0) == null)) {
			return;
		}
		Static360.aClass305_3 = arg0;
		Static327.aClass305_9 = Static380.method6129(arg0);
		Static354.aBoolean598 = false;
		Static337.anInt6958 = arg2;
		Static99.anInt2399 = arg1;
		Static394.anInt7571 = 0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)V")
	public static void method6750(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub4_Sub2 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class4 local8 = Static381.aClass4Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static416.anInt10065; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static223.anInt4520; local15++) {
						local1 = local8.c(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static309.anInt6172;
							@Pc(32) int local32 = local12 << Static309.anInt6172;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class4 local41 = Static381.aClass4Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.JA(local15, local12) - local41.JA(local15, local12);
									@Pc(67) int local67 = local8.JA(local15 + 1, local12) - local41.JA(local15 + 1, local12);
									@Pc(85) int local85 = local8.JA(local15 + 1, local12 + 1) - local41.JA(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.JA(local15, local12 + 1) - local41.JA(local15, local12 + 1);
									local41.aa(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
