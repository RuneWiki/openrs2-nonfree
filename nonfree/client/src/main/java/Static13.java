import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "B", descriptor = "I")
	public static int anInt264;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_13 = new Class151("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!am", name = "y", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!am", name = "A", descriptor = "I")
	public static int anInt263 = 100;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(III)Z")
	public static boolean method206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static316.method4088(arg1, arg0) | (arg0 & 0x40000) != 0 || Static399.method5010(arg0, arg1);
	}
}
