import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cn", name = "K", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!cn", name = "L", descriptor = "[I")
	public static final int[] anIntArray95 = new int[1];

	@OriginalMember(owner = "client!cn", name = "Z", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_43 = new Class186(96, 8);

	@OriginalMember(owner = "client!cn", name = "ab", descriptor = "[I")
	public static final int[] anIntArray96 = new int[14];

	@OriginalMember(owner = "client!cn", name = "db", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_17 = new Class242("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method1155(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static209.method2982(Static193.aClass36_134);
		Static116.aClass4_Sub30_Sub1_1.method4871(Static226.method592(arg1) + 1);
		Static116.aClass4_Sub30_Sub1_1.method4849(arg1);
		Static116.aClass4_Sub30_Sub1_1.method4881(arg0);
	}

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)[Lclient!ss;")
	public static Class223[] method1157() {
		return new Class223[] { Static58.aClass223_11, Static58.aClass223_12, Static58.aClass223_13, Static58.aClass223_14, Static58.aClass223_15, Static58.aClass223_16, Static58.aClass223_17, Static58.aClass223_18, Static58.aClass223_19, Static58.aClass223_20 };
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method1158(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static422.anInt7120 >= 100) {
			Static196.method2835(Static38.aClass242_8.method5320(Static139.anInt2670));
			return;
		}
		@Pc(24) String local24 = Static402.method1650(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static422.anInt7120; local29++) {
			@Pc(37) String local37 = Static402.method1650(Static71.aStringArray9[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static196.method2835(arg1 + Static265.aClass242_47.method5320(Static139.anInt2670));
				return;
			}
			if (Static447.aStringArray44[local29] != null) {
				local67 = Static402.method1650(Static447.aStringArray44[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static196.method2835(arg1 + Static265.aClass242_47.method5320(Static139.anInt2670));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static22.anInt6850; local97++) {
			local67 = Static402.method1650(Static291.aStringArray33[local97]);
			if (local67 != null && local67.equals(local24)) {
				Static196.method2835(Static177.aClass242_48.method5320(Static139.anInt2670) + arg1 + Static446.aClass242_103.method5320(Static139.anInt2670));
				return;
			}
			if (Static58.aStringArray28[local97] != null) {
				@Pc(140) String local140 = Static402.method1650(Static58.aStringArray28[local97]);
				if (local140 != null && local140.equals(local24)) {
					Static196.method2835(Static177.aClass242_48.method5320(Static139.anInt2670) + arg1 + Static446.aClass242_103.method5320(Static139.anInt2670));
					return;
				}
			}
		}
		if (Static402.method1650(Static375.aClass6_Sub2_Sub1_Sub1_3.aString11).equals(local24)) {
			Static196.method2835(Static98.aClass242_24.method5320(Static139.anInt2670));
		} else {
			Static209.method2982(Static99.aClass36_105);
			Static116.aClass4_Sub30_Sub1_1.method4871(Static226.method592(arg1) + 1);
			Static116.aClass4_Sub30_Sub1_1.method4849(arg1);
			Static116.aClass4_Sub30_Sub1_1.method4871(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(B)Z")
	public static boolean method1159() {
		try {
			return Static436.method5626();
		} catch (@Pc(14) IOException local14) {
			Static316.method4696();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(78) String local78 = "T2 - " + (Static375.aClass186_176 == null ? -1 : Static375.aClass186_176.method4177()) + "," + (Static430.aClass186_257 == null ? -1 : Static430.aClass186_257.method4177()) + "," + (Static404.aClass186_237 == null ? -1 : Static404.aClass186_237.method4177()) + " - " + Static106.anInt2242 + "," + (Static381.anInt6688 + Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray536[0]) + "," + (Static285.anInt5187 + Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray537[0]) + " - ";
			for (@Pc(80) int local80 = 0; local80 < Static106.anInt2242 && local80 < 50; local80++) {
				local78 = local78 + Static349.aClass4_Sub30_Sub1_2.aByteArray79[local80] + ",";
			}
			Static273.method3690(local78, local19);
			Static246.method3390();
			return true;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(FBFF)I")
	public static int method1160(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local26 > local17 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
