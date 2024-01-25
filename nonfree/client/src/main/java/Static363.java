import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!ru", name = "w", descriptor = "[I")
	public static int[] anIntArray512;

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!ru", name = "y", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_122 = new Class266(0, 2, 2, 1);

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
	public static void method5196() {
		Static380.aClass91_46.method2582();
		for (@Pc(15) Class4_Sub14 local15 = (Class4_Sub14) Static289.aClass91_31.method2584(); local15 != null; local15 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
			if (local15.anInt2132 < 1000) {
				local15.method6330();
				Static380.aClass91_46.method2587(local15);
			}
		}
		Static380.aClass91_46.method2576(Static289.aClass91_31);
		@Pc(45) int local45 = -1;
		@Pc(54) Class4_Sub15 local54 = (Class4_Sub15) Static296.aClass91_50.method2584();
		if (local54 != null) {
			local45 = local54.method5048();
		}
		if (!Static87.aBoolean142) {
			if (local45 == 0 && (Static80.anInt1921 == 1 && Static352.anInt6233 > 2 || Static145.method2647())) {
				local45 = 2;
			}
			if (local45 == 2 && Static352.anInt6233 > 0 && local54 != null) {
				if (Static65.aClass240_4 == null && Static128.anInt3397 == 0) {
					Static224.method3826(local54.method5050(), local54.method5049());
				} else {
					Static120.anInt2509 = 2;
				}
			}
			if (local45 == 0 && Static352.anInt6233 > 0) {
				Static275.method4379();
			}
			if (Static65.aClass240_4 == null && Static128.anInt3397 == 0) {
				Static120.anInt2509 = 0;
				Static146.aClass4_Sub14_2 = null;
				return;
			}
			return;
		}
		@Pc(139) int local139;
		@Pc(143) int local143;
		if (local45 == -1) {
			local139 = Static329.aClass95_1.method5170();
			local143 = Static329.aClass95_1.method5175();
			if (local139 < Static22.anInt426 - 10 || Static177.anInt3637 + Static22.anInt426 + 10 < local139 || local143 < Static223.anInt4455 - 10 || Static153.anInt3164 + Static223.anInt4455 + 10 < local143) {
				Static459.method5986();
			}
		}
		if (local45 != 0) {
			return;
		}
		local139 = Static22.anInt426;
		local143 = Static223.anInt4455;
		@Pc(177) int local177 = Static177.anInt3637;
		@Pc(181) int local181 = local54.method5049();
		@Pc(185) int local185 = local54.method5050();
		@Pc(187) int local187 = -1;
		@Pc(205) int local205;
		for (@Pc(189) int local189 = 0; local189 < Static352.anInt6233; local189++) {
			if (Static314.aBoolean588) {
				local205 = (Static352.anInt6233 - local189 - 1) * 16 + local143 + 33;
				if (local181 > local139 && local181 < local177 + local139 && local205 - 13 < local185 && local205 + 4 > local185) {
					local187 = local189;
				}
			} else {
				local205 = (Static352.anInt6233 - local189 - 1) * 16 + local143 + 31;
				if (local139 < local181 && local139 + local177 > local181 && local185 > local205 - 13 && local185 < local205 + 3) {
					local187 = local189;
				}
			}
		}
		if (local187 != -1) {
			local205 = 0;
			@Pc(298) Class222 local298 = new Class222(Static289.aClass91_31);
			for (@Pc(305) Class4_Sub14 local305 = (Class4_Sub14) local298.method5130(); local305 != null; local305 = (Class4_Sub14) local298.method5128()) {
				if (local205 == local187) {
					Static91.method1816(local181, local185, local305);
				}
				local205++;
			}
		}
		Static459.method5986();
	}
}
