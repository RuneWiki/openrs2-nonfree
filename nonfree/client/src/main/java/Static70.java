import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_28 = new Class25(45, -1);

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Lclient!j;")
	public static final Class127 aClass127_1 = new Class127("RC", 1);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method1093() {
		if (Static409.anInt701 == 1 || Static409.anInt701 == 3 || Static409.anInt701 != Static23.anInt7087 && (Static409.anInt701 == 0 || Static23.anInt7087 == 0)) {
			Static458.anInt7721 = 0;
			Static30.anInt548 = 0;
			Static400.aClass220_41.method5105();
		}
		Static23.anInt7087 = Static409.anInt701;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	public static void method1095() {
		Static351.aClass181_33.method3969();
		for (@Pc(21) Class2_Sub35 local21 = (Class2_Sub35) Static93.aClass181_7.method3972(); local21 != null; local21 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
			if (local21.anInt5875 < 1000) {
				local21.method6260();
				Static351.aClass181_33.method3973(local21);
			}
		}
		Static351.aClass181_33.method3962(Static93.aClass181_7);
		@Pc(47) int local47 = -1;
		@Pc(52) Class2_Sub11 local52 = (Class2_Sub11) Static292.aClass181_26.method3972();
		if (local52 != null) {
			local47 = local52.method4364();
		}
		if (!Static45.aBoolean34) {
			if (local47 == 0 && (Static157.anInt2846 == 1 && Static377.anInt6585 > 2 || Static195.method2783())) {
				local47 = 2;
			}
			if (local47 == 2 && Static377.anInt6585 > 0 && local52 != null) {
				if (Static125.aClass93_11 == null && Static102.anInt1595 == 0) {
					Static56.method907(local52.method4368(), local52.method4365());
				} else {
					Static46.anInt754 = 2;
				}
			}
			if (local47 == 0 && Static377.anInt6585 > 0) {
				Static304.method4354();
			}
			if (Static125.aClass93_11 != null || Static102.anInt1595 != 0) {
				return;
			}
			Static122.aClass2_Sub35_1 = null;
			Static46.anInt754 = 0;
			return;
		}
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local47 == -1) {
			local67 = Static196.aClass126_1.method5366();
			local71 = Static196.aClass126_1.method5364();
			if (local67 < Static281.anInt4448 - 10 || Static204.anInt3495 + Static281.anInt4448 + 10 < local67 || local71 < Static168.anInt6340 - 10 || Static168.anInt6340 + Static407.anInt7040 + 10 < local71) {
				Static428.method5827();
			}
		}
		if (local47 != 0) {
			return;
		}
		local67 = Static281.anInt4448;
		local71 = Static168.anInt6340;
		@Pc(116) int local116 = Static204.anInt3495;
		@Pc(120) int local120 = local52.method4365();
		@Pc(124) int local124 = local52.method4368();
		@Pc(126) int local126 = -1;
		@Pc(144) int local144;
		for (@Pc(128) int local128 = 0; local128 < Static377.anInt6585; local128++) {
			if (Static237.aBoolean264) {
				local144 = local71 + (-local128 + -1 + Static377.anInt6585) * 16 + 33;
				if (local120 > local67 && local67 + local116 > local120 && local124 > local144 - 13 && local144 + 4 > local124) {
					local126 = local128;
				}
			} else {
				local144 = (Static377.anInt6585 - local128 - 1) * 16 + local71 + 31;
				if (local67 < local120 && local120 < local67 + local116 && local124 > local144 - 13 && local124 < local144 + 3) {
					local126 = local128;
				}
			}
		}
		if (local126 != -1) {
			local144 = 0;
			@Pc(231) Class42 local231 = new Class42(Static93.aClass181_7);
			for (@Pc(236) Class2_Sub35 local236 = (Class2_Sub35) local231.method904(); local236 != null; local236 = (Class2_Sub35) local231.method905()) {
				if (local126 == local144) {
					Static430.method5865(local236, local120, local124);
				}
				local144++;
			}
		}
		Static428.method5827();
		return;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z")
	public static boolean method1097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
