import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dca", name = "R", descriptor = "Lclient!sa;")
	public static Class294 aClass294_6;

	@OriginalMember(owner = "client!dca", name = "S", descriptor = "I")
	public static int anInt1807;

	@OriginalMember(owner = "client!dca", name = "V", descriptor = "Lclient!cv;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!dca", name = "P", descriptor = "Lclient!kg;")
	public static final Class129 aClass129_1 = Static113.method1691();

	@OriginalMember(owner = "client!dca", name = "T", descriptor = "[I")
	public static final int[] anIntArray94 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(Z)I")
	public static int method1328() {
		if (Static132.anInt7160 == 0) {
			Static135.aClass107_2.method2302(new Class260("jaclib"));
			if (Static135.aClass107_2.method2299().method6597() != 100) {
				return 1;
			}
			if (!((Class260) Static135.aClass107_2.method2299()).method5997()) {
				Static413.aClient1.method1074();
			}
			Static132.anInt7160 = 1;
		}
		@Pc(226) int local226;
		@Pc(249) int local249;
		@Pc(263) int local263;
		@Pc(269) int local269;
		if (Static132.anInt7160 == 1) {
			Static499.aClass107Array1 = Static135.method2305();
			Static135.aClass107_1.method2302(new Class200(Static446.aClass259_140));
			Static135.aClass107_3.method2302(new Class260("jaggl"));
			Static135.aClass107_4.method2302(new Class260("jagdx"));
			Static135.aClass107_5.method2302(new Class260("jagmisc"));
			Static135.aClass107_6.method2302(new Class260("sw3d"));
			Static135.aClass107_7.method2302(new Class260("hw3d"));
			Static135.aClass107_8.method2302(new Class200(Static355.aClass259_114));
			Static135.aClass107_9.method2302(new Class200(Static212.aClass259_64));
			Static135.aClass107_10.method2302(new Class200(Static156.aClass259_158));
			Static135.aClass107_11.method2302(new Class200(Static216.aClass259_65));
			Static135.aClass107_12.method2302(new Class200(Static377.aClass259_123));
			Static135.aClass107_13.method2302(new Class200(Static363.aClass259_117));
			Static135.aClass107_14.method2302(new Class200(Static485.aClass259_150));
			Static135.aClass107_15.method2302(new Class200(Static287.aClass259_86));
			Static135.aClass107_16.method2302(new Class200(Static568.aClass259_167));
			Static135.aClass107_17.method2302(new Class200(Static407.aClass259_128));
			Static135.aClass107_18.method2302(new Class200(Static515.aClass259_159));
			Static135.aClass107_19.method2302(new Class200(Static535.aClass259_162));
			Static135.aClass107_20.method2302(new Class200(Static395.aClass259_127));
			Static135.aClass107_21.method2302(new Class200(Static314.aClass259_163));
			Static135.aClass107_22.method2302(new Class291(Static356.aClass259_115, "huffman"));
			Static135.aClass107_23.method2302(new Class200(Static538.aClass259_165));
			Static135.aClass107_24.method2302(new Class200(Static355.aClass259_113));
			Static135.aClass107_25.method2302(new Class200(Static72.aClass259_33));
			Static135.aClass107_26.method2302(new Class228(Static59.aClass259_29, "details"));
			for (local226 = 0; local226 < Static499.aClass107Array1.length; local226++) {
				if (Static499.aClass107Array1[local226].method2299() == null) {
					throw new RuntimeException();
				}
			}
			local249 = 0;
			@Pc(251) Class107[] local251 = Static499.aClass107Array1;
			for (@Pc(253) int local253 = 0; local253 < local251.length; local253++) {
				@Pc(259) Class107 local259 = local251[local253];
				local263 = local259.method2300();
				local269 = local259.method2299().method6597();
				local249 += local263 * local269 / 100;
			}
			Static573.anInt9321 = local249;
			Static132.anInt7160 = 2;
		}
		if (Static499.aClass107Array1 == null) {
			return 100;
		}
		local226 = 0;
		local249 = 0;
		@Pc(296) boolean local296 = true;
		@Pc(298) Class107[] local298 = Static499.aClass107Array1;
		for (@Pc(300) int local300 = 0; local300 < local298.length; local300++) {
			@Pc(306) Class107 local306 = local298[local300];
			local269 = local306.method2300();
			@Pc(316) int local316 = local306.method2299().method6597();
			local226 += local269;
			if (local316 < 100) {
				local296 = false;
			}
			local249 += local269 * local316 / 100;
		}
		if (local296) {
			if (!((Class260) Static135.aClass107_5.method2299()).method5997()) {
				Static413.aClient1.method1069();
			}
			Static499.aClass107Array1 = null;
		}
		local226 -= Static573.anInt9321;
		local249 -= Static573.anInt9321;
		local263 = local226 > 0 ? local249 * 100 / local226 : 100;
		if (!local296 && local263 > 99) {
			local263 = 99;
		}
		return local263;
	}
}
