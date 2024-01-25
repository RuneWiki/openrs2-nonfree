import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public static void method5535() {
		Static217.aClass85_23.method2008();
		for (@Pc(23) Class7_Sub39 local23 = (Class7_Sub39) Static237.aClass85_26.method2010(); local23 != null; local23 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
			if (local23.anInt5893 < 1000) {
				local23.method5802();
				Static217.aClass85_23.method2011(local23);
			}
		}
		Static217.aClass85_23.method2014(Static237.aClass85_26);
		@Pc(51) int local51 = -1;
		@Pc(56) Class7_Sub12 local56 = (Class7_Sub12) Static204.aClass85_37.method2010();
		if (local56 != null) {
			local51 = local56.method940();
		}
		if (!Static331.aBoolean372) {
			if (local51 == 0 && (Static72.anInt1386 == 1 && Static102.anInt2085 > 2 || Static221.method3101())) {
				local51 = 2;
			}
			if (local51 == 2 && Static102.anInt2085 > 0 && local56 != null) {
				if (Static191.aClass95_9 == null && Static168.anInt3037 == 0) {
					Static92.method1635(local56.method942(), local56.method943());
				} else {
					Static106.anInt2172 = 2;
				}
			}
			if (local51 == 0 && Static102.anInt2085 > 0) {
				Static456.method5784();
			}
			if (Static191.aClass95_9 != null || Static168.anInt3037 != 0) {
				return;
			}
			Static268.aClass7_Sub39_1 = null;
			Static106.anInt2172 = 0;
			return;
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (local51 == -1) {
			local71 = Static154.aClass50_1.method1860();
			local75 = Static154.aClass50_1.method1870();
			if (Static415.anInt6598 - 10 > local71 || Static171.anInt3077 + Static415.anInt6598 + 10 < local71 || local75 < Static351.anInt5637 - 10 || local75 > Static253.anInt4289 + Static351.anInt5637 + 10) {
				Static422.method5401();
			}
		}
		if (local51 != 0) {
			return;
		}
		local71 = Static415.anInt6598;
		local75 = Static351.anInt5637;
		@Pc(116) int local116 = Static171.anInt3077;
		@Pc(120) int local120 = local56.method942();
		@Pc(126) int local126 = local56.method943();
		@Pc(128) int local128 = -1;
		@Pc(147) int local147;
		for (@Pc(130) int local130 = 0; local130 < Static102.anInt2085; local130++) {
			if (Static425.aBoolean471) {
				local147 = (Static102.anInt2085 - local130 - 1) * 16 + local75 + 33;
				if (local120 > local71 && local120 < local71 + local116 && local126 > local147 - 13 && local147 + 4 > local126) {
					local128 = local130;
				}
			} else {
				local147 = local75 + (Static102.anInt2085 - local130 - 1) * 16 + 31;
				if (local71 < local120 && local71 + local116 > local120 && local126 > local147 - 13 && local126 < local147 + 3) {
					local128 = local130;
				}
			}
		}
		if (local128 != -1) {
			local147 = 0;
			@Pc(231) Class12 local231 = new Class12(Static237.aClass85_26);
			for (@Pc(236) Class7_Sub39 local236 = (Class7_Sub39) local231.method97(); local236 != null; local236 = (Class7_Sub39) local231.method95()) {
				if (local128 == local147) {
					Static144.method2238(local126, local236, local120);
				}
				local147++;
			}
		}
		Static422.method5401();
		return;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
	public static void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class26_Sub1 local13 = local7.aClass26_Sub1_2;
		@Pc(16) Class26_Sub1 local16 = local7.aClass26_Sub1_1;
		if (local13 != null) {
			local13.anInt7183 = local13.anInt7183 * arg3 / (0x10 << Static168.anInt3026 - 7);
			local13.anInt7186 = local13.anInt7186 * arg3 / (0x10 << Static168.anInt3026 - 7);
		}
		if (local16 != null) {
			local16.anInt7183 = local16.anInt7183 * arg3 / (0x10 << Static168.anInt3026 - 7);
			local16.anInt7186 = local16.anInt7186 * arg3 / (0x10 << Static168.anInt3026 - 7);
		}
	}
}
