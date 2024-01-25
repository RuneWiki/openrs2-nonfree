import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "Lclient!aa;")
	public static Class2 aClass2_26;

	@OriginalMember(owner = "client!nk", name = "T", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!nk", name = "I", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_72 = new Class21("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
	public static int anInt5058 = -2;

	@OriginalMember(owner = "client!nk", name = "Q", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_73 = new Class21("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
	public static int anInt5060 = 0;

	@OriginalMember(owner = "client!nk", name = "S", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_158 = new Class214(30, -1);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)Z")
	public static boolean method4280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)Z")
	public static boolean method4281() {
		if (Static409.aBoolean530) {
			try {
				if ((Boolean) Static476.method5363(Static390.aClass255_5.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}
}
