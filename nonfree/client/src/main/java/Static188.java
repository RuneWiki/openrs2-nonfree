import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!wca;")
	public static final Class388 aClass388_16 = new Class388();

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "[I")
	public static final int[] anIntArray609 = new int[4096];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	public static void method9004() {
		Static119.aClass20_7 = new Class20();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method9006() {
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_2, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_1, 2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_2, 2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub16_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub7_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub22_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub14_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub8_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub21_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub3_1, 2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub23_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub10_1, 2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub28_1, 1);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_2, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub12_1, 2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub20_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub17_1, 0);
		Static534.method7354();
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub26_1, 0);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub1_1, 4);
		Static569.method7681();
		Static8.method134();
		Static27.aBoolean20 = true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIILclient!pba;)Z")
	public static boolean method9007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub1_Sub2 arg3) {
		if (!Static429.aBoolean478 || !Static343.aBoolean381) {
			return false;
		} else if (Static547.anInt8693 < 100) {
			return false;
		} else if (Static339.method5086(arg0, arg1, arg2)) {
			@Pc(31) int local31 = arg0 << Static314.anInt5377;
			@Pc(35) int local35 = arg2 << Static314.anInt5377;
			@Pc(45) int local45 = Static177.aClass84Array2[arg1].method7620(arg2, arg0) - 1;
			@Pc(51) int local51 = local45 + arg3.method8347();
			if (arg3.aShort67 == 1) {
				if (!Static542.method7427(local31, local31, local31, local35 + Static492.anInt7972, local35, local45, local51, local35, local51)) {
					return false;
				} else if (Static542.method7427(local31, local31, local31, Static492.anInt7972 + local35, local35 - -Static492.anInt7972, local45, local45, local35, local51)) {
					Static117.anInt1892++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort67 == 2) {
				if (!Static542.method7427(Static492.anInt7972 + local31, local31, local31, Static492.anInt7972 + local35, local35 + Static492.anInt7972, local45, local51, local35 + Static492.anInt7972, local51)) {
					return false;
				} else if (Static542.method7427(Static492.anInt7972 + local31, local31, Static492.anInt7972 + local31, Static492.anInt7972 + local35, Static492.anInt7972 + local35, local45, local51, Static492.anInt7972 + local35, local45)) {
					Static117.anInt1892++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort67 == 4) {
				if (!Static542.method7427(local31 + Static492.anInt7972, local31 - -Static492.anInt7972, Static492.anInt7972 + local31, Static492.anInt7972 + local35, local35, local45, local51, local35, local51)) {
					return false;
				} else if (Static542.method7427(local31 + Static492.anInt7972, local31 + Static492.anInt7972, Static492.anInt7972 + local31, local35 + Static492.anInt7972, local35 + Static492.anInt7972, local45, local45, local35, local51)) {
					Static117.anInt1892++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort67 == 8) {
				if (!Static542.method7427(local31 + Static492.anInt7972, local31, local31, local35, local35, local45, local51, local35, local51)) {
					return false;
				} else if (Static542.method7427(Static492.anInt7972 + local31, local31, local31 + Static492.anInt7972, local35, local35, local45, local51, local35, local45)) {
					Static117.anInt1892++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort67 == 16) {
				if (Static414.method6095(local31, Static377.anInt6337, local45, Static377.anInt6337, Static377.anInt6337 + local35, local51)) {
					Static117.anInt1892++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort67 == 32) {
				if (Static414.method6095(Static377.anInt6337 + local31, Static377.anInt6337, local45, Static377.anInt6337, Static377.anInt6337 + local35, local51)) {
					Static117.anInt1892++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort67 == 64) {
				if (Static414.method6095(Static377.anInt6337 + local31, Static377.anInt6337, local45, Static377.anInt6337, local35, local51)) {
					Static117.anInt1892++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort67 != 128) {
				return true;
			} else if (Static414.method6095(local31, Static377.anInt6337, local45, Static377.anInt6337, local35, local51)) {
				Static117.anInt1892++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void method9008() {
		if (Static381.anInt6411 == -1) {
			return;
		}
		@Pc(12) int local12 = Static300.aClass164_1.method4999();
		@Pc(16) int local16 = Static300.aClass164_1.method5000();
		@Pc(21) Class5_Sub10 local21 = (Class5_Sub10) Static433.aClass20_37.method378();
		if (local21 != null) {
			local12 = local21.method7039();
			local16 = local21.method7042();
		}
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (Static377.aBoolean419) {
			local33 = Static194.method8971();
			local35 = Static5.method9220();
		}
		Static96.method9162(Static256.anInt4629 + local35, local35, Static381.anInt6411, local12, local33, local12 + local33, local33 + Static85.anInt9921, local35, local33, local16 + local35, local16);
		if (Static605.aClass238_15 != null) {
			Static50.method918(local35 + local16, local12 - -local33);
		}
	}
}
