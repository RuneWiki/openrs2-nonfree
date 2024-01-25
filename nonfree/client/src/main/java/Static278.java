import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!ks;")
	public static Class109 aClass109_3;

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
	public static int anInt4571;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "Lclient!kt;")
	public static Class141 aClass141_8;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_69 = new Class134("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_70 = new Class134("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_135 = new Class102(5, 7);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!dk;III)Lclient!qq;")
	public static Class205 method3725(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method1126(arg1, 0);
		return local9 == null ? null : new Class205(local9);
	}
}
