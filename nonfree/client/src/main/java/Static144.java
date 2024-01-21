import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!ci;")
	public static Class17 aClass17_4;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	public static int anInt2996;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_14 = new Class91();

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public static int anInt2995 = 0;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1125 = Static161.method2452("Created gameworld");

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1126 = Static161.method2452("null");

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1127 = Static161.method2452("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Lclient!ce;")
	public static final Class5_Sub6 aClass5_Sub6_2 = new Class5_Sub6(8);

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public static int anInt2997 = 1;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1128 = Static161.method2452("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1129 = aClass20_1125;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method2236(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static157.method2391(local13) : local13;
		} else if (arg1 instanceof Class68) {
			@Pc(27) Class68 local27 = (Class68) arg1;
			return local27.method2460();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ce;I)Lclient!mg;")
	public static Class54_Sub2 method2237(@OriginalArg(0) Class5_Sub6 arg0) {
		return new Class54_Sub2(arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3072(), arg0.method3072(), arg0.method3062());
	}
}
