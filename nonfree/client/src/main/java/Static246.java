import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!nq;")
	public static Class144 aClass144_85;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	public static int anInt4945;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "I")
	public static int anInt4940 = 0;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "Lclient!js;")
	public static final Class11_Sub25_Sub1 aClass11_Sub25_Sub1_3 = new Class11_Sub25_Sub1(5000);

	@OriginalMember(owner = "client!po", name = "j", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_85 = new Class117("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!po", name = "l", descriptor = "F")
	public static float aFloat51 = 0.0F;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)I")
	public static int method4313(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIBI)I")
	public static int method4314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg1 & 0xF;
		@Pc(19) int local19 = local12 < 8 ? arg2 : arg3;
		@Pc(40) int local40 = local12 < 4 ? arg3 : local12 == 12 || local12 == 14 ? arg2 : arg0;
		return ((local12 & 0x2) == 0 ? local40 : -local40) + ((local12 & 0x1) == 0 ? local19 : -local19);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)I")
	public static int method4316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static104.method1588(arg1 - 1, arg0 + -1) + Static104.method1588(arg1 + 1, arg0 - 1) + Static104.method1588(arg1 + -1, arg0 + 1) + Static104.method1588(arg1 + 1, arg0 - -1);
		@Pc(70) int local70 = Static104.method1588(arg1 - 1, arg0) + Static104.method1588(arg1 + 1, arg0) + Static104.method1588(arg1, arg0 - 1) + Static104.method1588(arg1, arg0 + 1);
		@Pc(80) int local80 = Static104.method1588(arg1, arg0);
		return local41 / 16 + local70 / 8 + local80 / 4;
	}
}
