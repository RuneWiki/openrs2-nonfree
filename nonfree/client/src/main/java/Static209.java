import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	public static int anInt2669;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_43 = new Class267("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "[Lclient!qo;")
	public static final Class210[] aClass210Array2 = new Class210[4];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB)Z")
	public static boolean method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!ae;)Lclient!p;")
	public static Class189 method2239(@OriginalArg(1) Class6_Sub1 arg0) {
		@Pc(12) Class189 local12 = new Class189();
		local12.anInt5268 = arg0.method6485();
		local12.aClass6_Sub2_Sub12_1 = Static426.aClass149_2.method3356(local12.anInt5268);
		return local12;
	}
}
