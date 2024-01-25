import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "Lclient!qg;")
	public static Class87 aClass87_7;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_29 = new Class267("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "Lclient!ts;")
	public static Class239 aClass239_4 = null;

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_113 = new Class123(106, -2);

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
	public static int anInt2218 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILclient!he;I)Lclient!fl;")
	public static Class78 method1817(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(14) byte[] local14 = arg1.method2520(0, arg0);
		return local14 == null ? null : new Class78(local14);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
	public static void method1818(@OriginalArg(1) int arg0) {
		if (arg0 == Static217.anInt3941) {
			return;
		}
		if (Static217.anInt3941 == 0) {
			Static93.method1654();
		}
		if (arg0 == 40) {
			Static293.method297();
		}
		if (arg0 != 40 && Static142.aClass73_2 != null) {
			Static142.aClass73_2.method1875();
			Static142.aClass73_2 = null;
		}
		if (Static217.anInt3941 == 25 || Static217.anInt3941 == 28) {
			Static22.aClass100_4.anInt2998 = 2;
			Static31.aClass100_6.anInt2998 = 2;
			Static289.aClass100_53.anInt2998 = 2;
			Static226.aClass100_61.anInt2998 = 2;
			Static387.aClass100_85.anInt2998 = 2;
			Static340.aClass100_68.anInt2998 = 2;
			Static75.aClass100_12.anInt2998 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static238.anInt4370 = 0;
			Static309.anInt5420 = 1;
			Static252.anInt4606 = 0;
			Static399.anInt7156 = 0;
			Static44.anInt1202 = 1;
			Static124.method2122(true);
			Static22.aClass100_4.anInt2998 = 1;
			Static31.aClass100_6.anInt2998 = 1;
			Static289.aClass100_53.anInt2998 = 1;
			Static226.aClass100_61.anInt2998 = 1;
			Static387.aClass100_85.anInt2998 = 1;
			Static340.aClass100_68.anInt2998 = 1;
			Static75.aClass100_12.anInt2998 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static404.method5968();
		}
		if (arg0 == 5) {
			Static36.method910(Static350.aClass100_69, Static126.aClass66_5);
		} else {
			Static125.method2161();
		}
		@Pc(141) boolean local141 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(160) boolean local160 = Static217.anInt3941 == 5 || Static217.anInt3941 == 10 || Static217.anInt3941 == 28;
		if (local141 != local160) {
			if (local141) {
				Static168.anInt3378 = Static188.anInt3654;
				if (Static291.aClass28_Sub1_1.anInt1033 == 0) {
					Static170.method2805();
				} else {
					Static337.method4904(Static263.aClass100_51, Static291.aClass28_Sub1_1.anInt1033, Static188.anInt3654);
				}
				Static443.aClass227_3.method5584(false);
			} else {
				Static170.method2805();
				Static443.aClass227_3.method5584(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static126.aClass66_5.method5066();
		}
		Static217.anInt3941 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZIIIIIII)V")
	public static void method1821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static253.method4330(arg2, arg3, arg5, arg0, 0, arg1, arg4);
	}
}
