import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString22;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Lclient!gl;")
	public static final Class93 aClass93_5 = new Class93("", 15);

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_34 = new Class242("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "[I")
	public static int[] anIntArray164 = new int[1];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BILclient!ns;)Lclient!se;")
	public static Class215 method1852(@OriginalArg(1) int arg0, @OriginalArg(2) Class166 arg1) {
		@Pc(8) byte[] local8 = arg1.method3684(arg0);
		return local8 == null ? null : new Class215(local8);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public static void method1853() {
		Static378.method5136();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Z")
	public static boolean method1854() {
		try {
			if (Static142.anInt2689 == 2) {
				if (Static22.aClass4_Sub7_3 == null) {
					Static22.aClass4_Sub7_3 = Static456.method1079(Static324.aClass166_264, Static449.anInt7510, Static231.anInt4228);
					if (Static22.aClass4_Sub7_3 == null) {
						return false;
					}
				}
				if (Static303.aClass65_1 == null) {
					Static303.aClass65_1 = new Class65(Static420.aClass166_303, Static327.aClass166_228);
				}
				if (Static67.aClass4_Sub18_Sub4_2.method5782(Static200.aClass166_144, Static22.aClass4_Sub7_3, Static303.aClass65_1)) {
					Static67.aClass4_Sub18_Sub4_2.method5767();
					Static67.aClass4_Sub18_Sub4_2.method5758(Static325.anInt5778);
					Static67.aClass4_Sub18_Sub4_2.method5779(Static22.aClass4_Sub7_3, Static164.aBoolean219);
					Static303.aClass65_1 = null;
					Static22.aClass4_Sub7_3 = null;
					Static324.aClass166_264 = null;
					Static142.anInt2689 = 0;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static67.aClass4_Sub18_Sub4_2.method5765();
			Static324.aClass166_264 = null;
			Static303.aClass65_1 = null;
			Static142.anInt2689 = 0;
			Static22.aClass4_Sub7_3 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZ)V")
	public static void method1855(@OriginalArg(0) int arg0) {
		Static54.anInt7604 = arg0;
		Static86.aClass69_60.method1593();
	}
}
