import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static168 {

	@OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
	public static int anInt3372;

	@OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
	public static int anInt3376;

	@OriginalMember(owner = "client!kk", name = "Z", descriptor = "I")
	public static int anInt3377;

	@OriginalMember(owner = "client!kk", name = "bb", descriptor = "I")
	public static int anInt3379;

	@OriginalMember(owner = "client!kk", name = "W", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_78 = new Class85("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!kk", name = "ab", descriptor = "I")
	public static int anInt3378 = 0;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I")
	public static int method3063(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V")
	public static void method3064() {
		Static233.aClass190_26.method5472();
		Static183.aClass212_6.method5942();
		Static50.aClass212_1.method5942();
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)V")
	public static void method3066() {
		if (Static150.anInt2940 == 5) {
			Static150.anInt2940 = 6;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)V")
	public static void method3067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static170.anInt3417 = arg2;
		Static119.anInt3763 = arg1;
		Static164.anInt3268 = arg0;
	}
}
