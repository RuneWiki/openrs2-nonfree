import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!o;")
	public static final Class171 aClass171_2 = new Class171("WTQA", 2);

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_55 = new Class57("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2810(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static228.aClass57_65.method1122(Static66.anInt1307) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static332.aClass57_83.method1122(Static66.anInt1307) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!dq;II)V")
	public static void method2812(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class3_Sub10 local15 = (Class3_Sub10) Static142.aClass138_17.method3051(); local15 != null; local15 = (Class3_Sub10) Static142.aClass138_17.method3050()) {
			if (arg3 == local15.anInt1604 && arg0 * 128 == local15.anInt1615 && local15.anInt1609 == arg2 * 128 && arg1.anInt1402 == local15.aClass60_1.anInt1402) {
				if (local15.aClass3_Sub8_Sub1_2 != null) {
					Static137.aClass3_Sub8_Sub2_2.method1712(local15.aClass3_Sub8_Sub1_2);
					local15.aClass3_Sub8_Sub1_2 = null;
				}
				if (local15.aClass3_Sub8_Sub1_1 != null) {
					Static137.aClass3_Sub8_Sub2_2.method1712(local15.aClass3_Sub8_Sub1_1);
					local15.aClass3_Sub8_Sub1_1 = null;
				}
				local15.method5700();
				return;
			}
		}
	}
}
