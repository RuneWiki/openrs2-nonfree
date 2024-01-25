import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!la;")
	public static final Class136 aClass136_143 = new Class136(74, 7);

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "Lclient!of;")
	public static final Class174 aClass174_150 = new Class174("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "J")
	public static long aLong174 = 0L;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)V")
	public static void method4361(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static343.anInt5785 != -1) {
				Static292.method4190(Static343.anInt5785);
			}
			for (@Pc(18) Class3_Sub10 local18 = (Class3_Sub10) Static32.aClass140_5.method3486(); local18 != null; local18 = (Class3_Sub10) Static32.aClass140_5.method3485()) {
				if (!local18.method6287()) {
					local18 = (Class3_Sub10) Static32.aClass140_5.method3486();
					if (local18 == null) {
						break;
					}
				}
				Static87.method1538(local18, false, true);
			}
			Static343.anInt5785 = -1;
			Static32.aClass140_5 = new Class140(8);
			Static247.method5474();
			Static343.anInt5785 = Static27.anInt487;
			Static213.method3196(false);
			Static174.method2784();
			Static219.method3209(Static343.anInt5785);
		}
		Static187.aBoolean258 = true;
	}
}
