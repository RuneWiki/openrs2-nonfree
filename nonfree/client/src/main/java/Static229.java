import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static229 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "I")
	public static int anInt4187;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	public static int anInt4189;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Lclient!vu;")
	public static final Class256 aClass256_1 = new Class256();

	@OriginalMember(owner = "client!li", name = "d", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_58 = new Class267("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	public static int anInt4188 = 0;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "[I")
	public static final int[] anIntArray299 = new int[1000];

	@OriginalMember(owner = "client!li", name = "g", descriptor = "[I")
	public static final int[] anIntArray300 = new int[13];

	@OriginalMember(owner = "client!li", name = "i", descriptor = "[I")
	public static final int[] anIntArray301 = new int[100];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I")
	public static int method3548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static203.aByteArrayArrayArray11[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static203.aByteArrayArrayArray11[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
