import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	public static int anInt6200;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_146 = new Class140("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5216(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static263.method4649(arg0.charAt(local12)) - local10;
		}
		return local10;
	}
}
