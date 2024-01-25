import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static375 {

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
	public static int anInt7256;

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
	public static int anInt7258;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_156 = new Class362(97, 28);

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
	public static int anInt7257 = 2;

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
	public static int anInt7259 = 0;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BI)Lclient!ie;")
	public static Class153 method6001(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static165.aClass153Array1[arg0] : null;
	}
}
