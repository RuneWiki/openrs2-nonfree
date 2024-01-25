import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
	public static int anInt5560;

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
	public static int anInt5563;

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
	public static int anInt5564 = 0;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString203 = "Prepared sound engine";

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(B)V")
	public static void method4723() {
		Static65.aClass60_4 = null;
		Static155.aClass60_18 = null;
		Static159.aClass60_19 = null;
		Static264.aClass60_17 = null;
		Static204.aClass60_20 = null;
		Static69.aClass60_5 = null;
		Static100.aClass60_8 = null;
		Static315.aClass60_7 = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lclient!ik;")
	public static Class4_Sub1_Sub10 method4725(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub1_Sub10 local17 = (Class4_Sub1_Sub10) Static197.aClass15_7.method356((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(34) byte[] local34;
		if (arg0 >= 32768) {
			local34 = Static301.aClass11_133.method288(arg0 & 0x7FFF, 1);
		} else {
			local34 = Static310.aClass11_139.method288(arg0, 1);
		}
		local17 = new Class4_Sub1_Sub10();
		if (local34 != null) {
			local17.method2626(new Class4_Sub7(local34));
		}
		if (arg0 >= 32768) {
			local17.method2629();
		}
		Static197.aClass15_7.method352((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "(B)V")
	public static void method4726() {
		Static85.method1516(Static101.aCanvas8);
		Static211.method3683(Static101.aCanvas8);
		if (Static76.aClass117_1 != null) {
			Static76.aClass117_1.method3191(Static101.aCanvas8);
		}
		Static78.aClient1.method853();
		Static101.aCanvas8.setBackground(Color.black);
		Static13.anInt309 = -1;
		Static164.method3146(Static101.aCanvas8);
		Static102.method1878(Static101.aCanvas8);
		if (Static76.aClass117_1 != null) {
			Static76.aClass117_1.method3193(Static101.aCanvas8);
		}
	}
}
