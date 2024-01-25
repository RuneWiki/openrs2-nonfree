import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jv", name = "ic", descriptor = "I")
	public static int anInt4280;

	@OriginalMember(owner = "client!jv", name = "ab", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_134 = new Class202("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!jv", name = "wb", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_135 = new Class202("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

	@OriginalMember(owner = "client!jv", name = "dc", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_136 = new Class202("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!jv", name = "pc", descriptor = "J")
	public static long aLong116 = 0L;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)V")
	public static void method3690(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 14);
		local8.method6974();
	}
}
