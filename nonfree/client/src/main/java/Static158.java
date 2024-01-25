import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fga", name = "p", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_99 = new Class196(66, 16);

	@OriginalMember(owner = "client!fga", name = "t", descriptor = "I")
	public static int anInt2662 = -1;

	@OriginalMember(owner = "client!fga", name = "w", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_100 = new Class196(33, 3);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)I")
	public static int method2384() {
		if (Static179.anInt2962 == 0) {
			Static85.aClass66_2.method1305(new Class162("jaclib"));
			if (Static85.aClass66_2.method1311().method7364() != 100) {
				return 1;
			}
			if (!((Class162) Static85.aClass66_2.method1311()).method3459()) {
				Static437.aClient1.method1249();
			}
			Static179.anInt2962 = 1;
		}
		@Pc(239) int local239;
		@Pc(257) int local257;
		@Pc(270) int local270;
		@Pc(276) int local276;
		if (Static179.anInt2962 == 1) {
			Static47.aClass66Array1 = Static85.method1309();
			Static85.aClass66_1.method1305(new Class199(Static613.aClass50_172));
			Static85.aClass66_3.method1305(new Class162("jaggl"));
			Static85.aClass66_4.method1305(new Class162("jagdx"));
			Static85.aClass66_5.method1305(new Class162("jagmisc"));
			Static85.aClass66_6.method1305(new Class162("sw3d"));
			Static85.aClass66_7.method1305(new Class162("hw3d"));
			Static85.aClass66_8.method1305(new Class162("jagtheora"));
			Static85.aClass66_9.method1305(new Class199(Static498.aClass50_149));
			Static85.aClass66_10.method1305(new Class199(Static524.aClass50_124));
			Static85.aClass66_11.method1305(new Class199(Static238.aClass50_62));
			Static85.aClass66_12.method1305(new Class199(Static207.aClass50_54));
			Static85.aClass66_13.method1305(new Class199(Static85.aClass50_23));
			Static85.aClass66_14.method1305(new Class199(Static356.aClass50_101));
			Static85.aClass66_15.method1305(new Class199(Static655.aClass50_185));
			Static85.aClass66_16.method1305(new Class199(Static125.aClass50_35));
			Static85.aClass66_17.method1305(new Class199(Static7.aClass50_5));
			Static85.aClass66_18.method1305(new Class199(Static81.aClass50_20));
			Static85.aClass66_19.method1305(new Class199(Static103.aClass50_30));
			Static85.aClass66_20.method1305(new Class199(Static335.aClass50_95));
			Static85.aClass66_21.method1305(new Class199(Static22.aClass50_6));
			Static85.aClass66_22.method1305(new Class199(Static633.aClass50_176));
			Static85.aClass66_23.method1305(new Class129(Static425.aClass50_121, "huffman"));
			Static85.aClass66_24.method1305(new Class199(Static76.aClass50_19));
			Static85.aClass66_25.method1305(new Class199(Static427.aClass50_189));
			Static85.aClass66_26.method1305(new Class199(Static253.aClass50_66));
			Static85.aClass66_27.method1305(new Class317(Static418.aClass50_119, "details"));
			for (local239 = 0; local239 < Static47.aClass66Array1.length; local239++) {
				if (Static47.aClass66Array1[local239].method1311() == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(259) Class66[] local259 = Static47.aClass66Array1;
			for (@Pc(261) int local261 = 0; local261 < local259.length; local261++) {
				@Pc(266) Class66 local266 = local259[local261];
				local270 = local266.method1304();
				local276 = local266.method1311().method7364();
				local257 += local270 * local276 / 100;
			}
			Static294.anInt8153 = local257;
			Static179.anInt2962 = 2;
		}
		if (Static47.aClass66Array1 == null) {
			return 100;
		}
		local239 = 0;
		local257 = 0;
		@Pc(312) boolean local312 = true;
		@Pc(314) Class66[] local314 = Static47.aClass66Array1;
		for (@Pc(316) int local316 = 0; local316 < local314.length; local316++) {
			@Pc(321) Class66 local321 = local314[local316];
			local276 = local321.method1304();
			@Pc(333) int local333 = local321.method1311().method7364();
			local257 += local333 * local276 / 100;
			local239 += local276;
			if (local333 < 100) {
				local312 = false;
			}
		}
		if (local312) {
			if (!((Class162) Static85.aClass66_5.method1311()).method3459()) {
				Static437.aClient1.method1262();
			}
			if (!((Class162) Static85.aClass66_8.method1311()).method3459()) {
				Static629.aBoolean735 = Static437.aClient1.method1260();
			}
			Static47.aClass66Array1 = null;
		}
		local257 -= Static294.anInt8153;
		local239 -= Static294.anInt8153;
		local270 = local239 <= 0 ? 100 : local257 * 100 / local239;
		if (!local312 && local270 > 99) {
			local270 = 99;
		}
		return local270;
	}
}
