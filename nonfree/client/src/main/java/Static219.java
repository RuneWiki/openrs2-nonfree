import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
	public static int anInt4263 = -1;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_6 = new Class181(2, 6);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZ)V")
	public static void method3647(@OriginalArg(1) boolean arg0) {
		if (Static137.aClass260_1 == null) {
			Static400.method7925();
		}
		if (arg0) {
			Static137.aClass260_1.method5798();
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)I")
	public static int method3649() {
		if (Static71.anInt1682 == 0) {
			Static167.aClass118_2.method2566(new Class327("jaclib"));
			if (Static167.aClass118_2.method2559().method7282() != 100) {
				return 1;
			}
			if (!((Class327) Static167.aClass118_2.method2559()).method7283()) {
				Static550.aClient1.method1551();
			}
			Static71.anInt1682 = 1;
		}
		@Pc(226) int local226;
		@Pc(249) int local249;
		@Pc(263) int local263;
		@Pc(269) int local269;
		if (Static71.anInt1682 == 1) {
			Static527.aClass118Array1 = Static167.method2565();
			Static167.aClass118_1.method2566(new Class268(Static32.aClass111_5));
			Static167.aClass118_3.method2566(new Class327("jaggl"));
			Static167.aClass118_4.method2566(new Class327("jagdx"));
			Static167.aClass118_5.method2566(new Class327("jagmisc"));
			Static167.aClass118_6.method2566(new Class327("sw3d"));
			Static167.aClass118_7.method2566(new Class327("hw3d"));
			Static167.aClass118_8.method2566(new Class268(Static446.aClass111_105));
			Static167.aClass118_9.method2566(new Class268(Static292.aClass111_68));
			Static167.aClass118_10.method2566(new Class268(Static333.aClass111_77));
			Static167.aClass118_11.method2566(new Class268(Static331.aClass111_76));
			Static167.aClass118_12.method2566(new Class268(Static59.aClass111_109));
			Static167.aClass118_13.method2566(new Class268(Static440.aClass111_102));
			Static167.aClass118_14.method2566(new Class268(Static356.aClass111_99));
			Static167.aClass118_15.method2566(new Class268(Static351.aClass111_82));
			Static167.aClass118_16.method2566(new Class268(Static587.aClass111_127));
			Static167.aClass118_17.method2566(new Class268(Static60.aClass111_10));
			Static167.aClass118_18.method2566(new Class268(Static571.aClass111_123));
			Static167.aClass118_19.method2566(new Class268(Static363.aClass111_111));
			Static167.aClass118_20.method2566(new Class268(Static2.aClass111_1));
			Static167.aClass118_21.method2566(new Class268(Static585.aClass111_126));
			Static167.aClass118_22.method2566(new Class167(Static551.aClass111_119, "huffman"));
			Static167.aClass118_23.method2566(new Class268(Static85.aClass111_18));
			Static167.aClass118_24.method2566(new Class268(Static221.aClass111_49));
			Static167.aClass118_25.method2566(new Class268(Static530.aClass111_114));
			Static167.aClass118_26.method2566(new Class64(Static460.aClass111_108, "details"));
			for (local226 = 0; local226 < Static527.aClass118Array1.length; local226++) {
				if (Static527.aClass118Array1[local226].method2559() == null) {
					throw new RuntimeException();
				}
			}
			local249 = 0;
			@Pc(251) Class118[] local251 = Static527.aClass118Array1;
			for (@Pc(253) int local253 = 0; local253 < local251.length; local253++) {
				@Pc(259) Class118 local259 = local251[local253];
				local263 = local259.method2562();
				local269 = local259.method2559().method7282();
				local249 += local269 * local263 / 100;
			}
			Static71.anInt1682 = 2;
			Static160.anInt8862 = local249;
		}
		if (Static527.aClass118Array1 == null) {
			return 100;
		}
		local226 = 0;
		local249 = 0;
		@Pc(296) boolean local296 = true;
		@Pc(298) Class118[] local298 = Static527.aClass118Array1;
		for (@Pc(300) int local300 = 0; local300 < local298.length; local300++) {
			@Pc(306) Class118 local306 = local298[local300];
			local269 = local306.method2562();
			@Pc(316) int local316 = local306.method2559().method7282();
			local226 += local269;
			if (local316 < 100) {
				local296 = false;
			}
			local249 += local269 * local316 / 100;
		}
		if (local296) {
			if (!((Class327) Static167.aClass118_5.method2559()).method7283()) {
				Static550.aClient1.method1552();
			}
			Static527.aClass118Array1 = null;
		}
		local249 -= Static160.anInt8862;
		local226 -= Static160.anInt8862;
		local263 = local226 <= 0 ? 100 : local249 * 100 / local226;
		if (!local296 && local263 > 99) {
			local263 = 99;
		}
		return local263;
	}
}
