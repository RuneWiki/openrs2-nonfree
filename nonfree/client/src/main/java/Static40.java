import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
	public static int anInt1288;

	@OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
	public static int anInt1283 = -1;

	@OriginalMember(owner = "client!ci", name = "L", descriptor = "[Lclient!ti;")
	public static final Class195[] aClass195Array1 = new Class195[16];

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)Z")
	public static boolean method953() {
		return Static306.anInt6046 == 0 ? Static17.aBoolean55 : true;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method956(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static264.anInt6557 >= 100) {
			Static85.method4682(Static197.aClass34_128.method1285(Static259.anInt2907));
			return;
		}
		@Pc(24) String local24 = Static293.method4939(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static264.anInt6557; local29++) {
			@Pc(37) String local37 = Static293.method4939(Static47.aStringArray15[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static85.method4682(arg1 + Static149.aClass34_106.method1285(Static259.anInt2907));
				return;
			}
			if (Static172.aStringArray34[local29] != null) {
				local67 = Static293.method4939(Static172.aStringArray34[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static85.method4682(arg1 + Static149.aClass34_106.method1285(Static259.anInt2907));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static191.anInt4095; local97++) {
			local67 = Static293.method4939(Static235.aStringArray49[local97]);
			if (local67 != null && local67.equals(local24)) {
				Static85.method4682(Static261.aClass34_44.method1285(Static259.anInt2907) + arg1 + Static274.aClass34_156.method1285(Static259.anInt2907));
				return;
			}
			if (Static58.aStringArray16[local97] != null) {
				@Pc(142) String local142 = Static293.method4939(Static58.aStringArray16[local97]);
				if (local142 != null && local142.equals(local24)) {
					Static85.method4682(Static261.aClass34_44.method1285(Static259.anInt2907) + arg1 + Static274.aClass34_156.method1285(Static259.anInt2907));
					return;
				}
			}
		}
		if (Static293.method4939(Static198.aClass17_Sub1_Sub1_Sub1_3.aString13).equals(local24)) {
			Static85.method4682(Static91.aClass34_72.method1285(Static259.anInt2907));
		} else {
			Static342.aClass1_Sub8_Sub1_7.method3229(136);
			Static342.aClass1_Sub8_Sub1_7.method4562(Static321.method5243(arg1) + 1);
			Static342.aClass1_Sub8_Sub1_7.method4531(arg1);
			Static342.aClass1_Sub8_Sub1_7.method4562(arg0 ? 1 : 0);
		}
	}
}
