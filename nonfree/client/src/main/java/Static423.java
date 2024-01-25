import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
	public static int[] anIntArray585;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_119 = new Class231("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method5786() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static234.anInt3949; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static371.anInt6492; local18++) {
				if (Static34.method565(local18, local14, local12, Static175.aClass36ArrayArrayArray1, true)) {
					local12++;
				}
				if (local12 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public static void method5788() {
		if (Static204.anInt3501 < 0) {
			Static32.anInt7619 = -1;
			Static204.anInt3501 = 0;
			Static227.anInt3810 = -1;
		}
		if (Static204.anInt3501 > Static5.anInt6725) {
			Static227.anInt3810 = -1;
			Static204.anInt3501 = Static5.anInt6725;
			Static32.anInt7619 = -1;
		}
		if (Static180.anInt3183 < 0) {
			Static180.anInt3183 = 0;
			Static32.anInt7619 = -1;
			Static227.anInt3810 = -1;
		}
		if (Static5.anInt6726 < Static180.anInt3183) {
			Static32.anInt7619 = -1;
			Static180.anInt3183 = Static5.anInt6726;
			Static227.anInt3810 = -1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!kb;")
	public static Class2_Sub10 method5789(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class2_Sub10_Sub1");
			@Pc(15) Class2_Sub10 local15 = (Class2_Sub10) local11.getDeclaredConstructor().newInstance();
			local15.method4868(arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class2_Sub10_Sub2 local28 = new Class2_Sub10_Sub2();
			local28.method4868(arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method5791(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			local8[local17] = local17 + ": ";
			if (arg0 != null && arg0[local17] != null) {
				local8[local17] = local8[local17] + arg0[local17];
			}
		}
		return local8;
	}
}
