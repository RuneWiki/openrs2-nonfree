import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!jr", name = "J", descriptor = "Lclient!wk;")
	public static Class264 aClass264_22;

	@OriginalMember(owner = "client!jr", name = "bb", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_50 = new Class242("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!jr", name = "X", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_115 = new Class186(12, 6);

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BZ)V")
	public static void method2829() {
		Static209.method2982(Static104.aClass36_54);
		for (@Pc(23) Class4_Sub4 local23 = (Class4_Sub4) Static391.aClass196_37.method4482(); local23 != null; local23 = (Class4_Sub4) Static391.aClass196_37.method4472()) {
			if (!local23.method5857()) {
				local23 = (Class4_Sub4) Static391.aClass196_37.method4482();
				if (local23 == null) {
					break;
				}
			}
			if (local23.anInt574 == 0) {
				Static219.method3100(true, local23, true);
			}
		}
		if (Static454.aClass126_17 != null) {
			Static430.method5524(Static454.aClass126_17);
			Static454.aClass126_17 = null;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)Lclient!uf;")
	public static Class84_Sub1 method2831() {
		return Static190.aClass84_Sub1Array1.length > Static447.anInt7438 ? Static190.aClass84_Sub1Array1[Static447.anInt7438++] : null;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2835(@OriginalArg(1) String arg0) {
		Static262.method3576(arg0, "", 0, 0, "");
	}
}
