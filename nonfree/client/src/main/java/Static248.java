import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
	private static int anInt1276;

	@OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
	private static int anInt1277;

	@OriginalMember(owner = "client!jl", name = "N", descriptor = "Z")
	private static boolean aBoolean72;

	@OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
	private static int anInt1278;

	@OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
	private static int anInt1279;

	@OriginalMember(owner = "client!jl", name = "Q", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!jl", name = "R", descriptor = "Z")
	private static boolean aBoolean74;

	@OriginalMember(owner = "client!jl", name = "S", descriptor = "Z")
	private static boolean aBoolean75;

	@OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
	private static int anInt1280;

	@OriginalMember(owner = "client!jl", name = "U", descriptor = "Z")
	private static boolean aBoolean76;

	@OriginalMember(owner = "client!jl", name = "V", descriptor = "Z")
	private static boolean aBoolean77;

	@OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
	private static int anInt1281;

	@OriginalMember(owner = "client!jl", name = "X", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
	public static void method1075() {
		Static71.anInt1363 = 0;
		Static345.anInt9498 = -1;
		Static258.anInt4724 = -1;
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)I")
	public static int method1081() {
		if (Static331.anInt6047 == 0) {
			Static179.aClass127_2.method2830(new Class317("jaclib"));
			if (Static179.aClass127_2.method2829().method7052() != 100) {
				return 1;
			}
			if (!((Class317) Static179.aClass127_2.method2829()).method7057()) {
				Static475.aClient1.method1083();
			}
			Static331.anInt6047 = 1;
		}
		@Pc(240) int local240;
		@Pc(259) int local259;
		@Pc(273) int local273;
		@Pc(279) int local279;
		if (Static331.anInt6047 == 1) {
			Static457.aClass127Array1 = Static179.method2826();
			Static179.aClass127_1.method2830(new Class154(Static141.aClass308_57));
			Static179.aClass127_3.method2830(new Class317("jaggl"));
			Static179.aClass127_4.method2830(new Class317("jagdx"));
			Static179.aClass127_5.method2830(new Class317("jagmisc"));
			Static179.aClass127_6.method2830(new Class317("sw3d"));
			Static179.aClass127_7.method2830(new Class317("hw3d"));
			Static179.aClass127_8.method2830(new Class154(Static461.aClass308_163));
			Static179.aClass127_9.method2830(new Class154(Static106.aClass308_41));
			Static179.aClass127_10.method2830(new Class154(Static298.aClass308_106));
			Static179.aClass127_11.method2830(new Class154(Static411.aClass308_147));
			Static179.aClass127_12.method2830(new Class154(Static379.aClass308_135));
			Static179.aClass127_13.method2830(new Class154(Static575.aClass308_192));
			Static179.aClass127_14.method2830(new Class154(Static161.aClass308_66));
			Static179.aClass127_15.method2830(new Class154(Static506.aClass308_171));
			Static179.aClass127_16.method2830(new Class154(Static231.aClass308_94));
			Static179.aClass127_17.method2830(new Class154(Static559.aClass308_187));
			Static179.aClass127_18.method2830(new Class154(Static438.aClass308_156));
			Static179.aClass127_19.method2830(new Class154(Static485.aClass308_165));
			Static179.aClass127_20.method2830(new Class154(Static584.aClass308_194));
			Static179.aClass127_21.method2830(new Class154(Static563.aClass308_188));
			Static179.aClass127_22.method2830(new Class202(Static294.aClass308_104, "huffman"));
			Static179.aClass127_23.method2830(new Class154(Static227.aClass308_91));
			Static179.aClass127_24.method2830(new Class154(Static220.aClass308_111));
			Static179.aClass127_25.method2830(new Class154(Static77.aClass308_183));
			Static179.aClass127_26.method2830(new Class103(Static193.aClass308_80, "details"));
			for (local240 = 0; local240 < Static457.aClass127Array1.length; local240++) {
				if (Static457.aClass127Array1[local240].method2829() == null) {
					throw new RuntimeException();
				}
			}
			local259 = 0;
			@Pc(261) Class127[] local261 = Static457.aClass127Array1;
			for (@Pc(263) int local263 = 0; local263 < local261.length; local263++) {
				@Pc(269) Class127 local269 = local261[local263];
				local273 = local269.method2828();
				local279 = local269.method2829().method7052();
				local259 += local273 * local279 / 100;
			}
			Static331.anInt6047 = 2;
			Static83.anInt1567 = local259;
		}
		if (Static457.aClass127Array1 == null) {
			return 100;
		}
		local240 = 0;
		local259 = 0;
		@Pc(310) boolean local310 = true;
		@Pc(312) Class127[] local312 = Static457.aClass127Array1;
		for (@Pc(319) int local319 = 0; local319 < local312.length; local319++) {
			@Pc(325) Class127 local325 = local312[local319];
			local279 = local325.method2828();
			@Pc(337) int local337 = local325.method2829().method7052();
			local240 += local279;
			if (local337 < 100) {
				local310 = false;
			}
			local259 += local337 * local279 / 100;
		}
		if (local310) {
			if (!((Class317) Static179.aClass127_5.method2829()).method7057()) {
				Static475.aClient1.method1077();
			}
			Static457.aClass127Array1 = null;
		}
		local259 -= Static83.anInt1567;
		local240 -= Static83.anInt1567;
		local273 = local240 <= 0 ? 100 : local259 * 100 / local240;
		if (!local310 && local273 > 99) {
			local273 = 99;
		}
		return local273;
	}
}
