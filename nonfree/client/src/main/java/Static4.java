import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "Lclient!pt;")
	public static final Class230 aClass230_2 = new Class230(64);

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_5 = new Class305(14, 8);

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_4 = new Class45("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)Z")
	public static boolean method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static379.aByteArrayArrayArray13[1][arg1][arg0] & 0x2) != 0;
	}
}
