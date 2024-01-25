import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean367 = false;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public static void method3606(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static327.anInt6280 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3607(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static191.anInt4095 >= 100 && !Static297.aBoolean560 || Static191.anInt4095 >= 200) {
			Static85.method4682(Static234.aClass34_139.method1285(Static259.anInt2907));
			return;
		}
		@Pc(29) String local29 = Static293.method4939(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static191.anInt4095; local34++) {
			@Pc(42) String local42 = Static293.method4939(Static235.aStringArray49[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static85.method4682(arg0 + Static166.aClass34_109.method1285(Static259.anInt2907));
				return;
			}
			if (Static58.aStringArray16[local34] != null) {
				local72 = Static293.method4939(Static58.aStringArray16[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static85.method4682(arg0 + Static166.aClass34_109.method1285(Static259.anInt2907));
					return;
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static264.anInt6557; local107++) {
			local72 = Static293.method4939(Static47.aStringArray15[local107]);
			if (local72 != null && local72.equals(local29)) {
				Static85.method4682(Static54.aClass34_38.method1285(Static259.anInt2907) + arg0 + Static249.aClass34_149.method1285(Static259.anInt2907));
				return;
			}
			if (Static172.aStringArray34[local107] != null) {
				@Pc(150) String local150 = Static293.method4939(Static172.aStringArray34[local107]);
				if (local150 != null && local150.equals(local29)) {
					Static85.method4682(Static54.aClass34_38.method1285(Static259.anInt2907) + arg0 + Static249.aClass34_149.method1285(Static259.anInt2907));
					return;
				}
			}
		}
		if (Static293.method4939(Static198.aClass17_Sub1_Sub1_Sub1_3.aString13).equals(local29)) {
			Static85.method4682(Static129.aClass34_90.method1285(Static259.anInt2907));
		} else {
			Static342.aClass1_Sub8_Sub1_7.method3229(59);
			Static342.aClass1_Sub8_Sub1_7.method4562(Static321.method5243(arg0));
			Static342.aClass1_Sub8_Sub1_7.method4531(arg0);
		}
	}
}
