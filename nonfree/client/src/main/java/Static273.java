import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "Lclient!ct;")
	public static Class30 aClass30_80;

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_179 = new Class18(10, 7);

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_184 = new Class106("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_185 = new Class106("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!at;Z)V")
	public static void method4876(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(9) int local9 = arg0.method2134();
		Static12.aClass168Array1 = new Class168[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static12.aClass168Array1[local14] = new Class168();
			Static12.aClass168Array1[local14].anInt5169 = arg0.method2134();
			Static12.aClass168Array1[local14].aString46 = arg0.method2131();
		}
		Static276.anInt5384 = arg0.method2134();
		Static43.anInt5304 = arg0.method2134();
		Static242.anInt4948 = arg0.method2134();
		Static51.aClass135_Sub1Array1 = new Class135_Sub1[Static43.anInt5304 + 1 - Static276.anInt5384];
		for (@Pc(69) int local69 = 0; local69 < Static242.anInt4948; local69++) {
			@Pc(75) int local75 = arg0.method2134();
			@Pc(83) Class135_Sub1 local83 = Static51.aClass135_Sub1Array1[local75] = new Class135_Sub1();
			local83.anInt4027 = arg0.method2132();
			local83.anInt4035 = arg0.method2140();
			local83.anInt4037 = local75 + Static276.anInt5384;
			local83.aString41 = arg0.method2131();
			local83.aString40 = arg0.method2131();
		}
		Static171.anInt3576 = arg0.method2140();
		Static12.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
	public static void method4878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Static332.aFloat62 = local11;
		Static357.aFloat76 = local3;
		if (Static50.anInt1273 == 2) {
			Static129.anInt2810 = 0;
			Static320.anInt4362 = local3;
			Static272.anInt5295 = local11;
		}
		Static177.method3440();
		Static195.aBoolean294 = true;
	}
}
