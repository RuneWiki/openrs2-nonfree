import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "Lclient!eb;")
	public static Class18 aClass18_2;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_140 = new Class265(42, -1);

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_142 = new Class209(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_143 = new Class209("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)I")
	public static int method4992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10);
	}
}
