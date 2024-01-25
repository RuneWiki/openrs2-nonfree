import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "Lclient!ih;")
	public static Class116 aClass116_24;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_105 = new Class92(39, 15);

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_71 = new Class267("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIB)I")
	public static int method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local15 * arg1;
		} else {
			return local15;
		}
	}
}
