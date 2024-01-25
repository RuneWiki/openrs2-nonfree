import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!ip;")
	public static Class170 aClass170_18;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public static final int anInt2968 = 1406;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_10 = new Class265(64);

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_116 = new Class196(93, 9);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!sf;)V")
	public static void method2639(@OriginalArg(0) Class41_Sub1 arg0) {
		Static267.aClass143_6.H(arg0.anInt10366, arg0.anInt10370 + (arg0.method8652() >> 1), arg0.anInt10367, Static600.anIntArray554);
		arg0.anInt10363 = Static600.anIntArray554[0];
		arg0.anInt10365 = Static600.anIntArray554[1];
		arg0.anInt10369 = Static600.anIntArray554[2];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!or;B)Z")
	public static boolean method2644(@OriginalArg(0) Class262 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean558) {
			return false;
		} else if (!arg0.method6490(Static407.anInterface23_2)) {
			return false;
		} else if (Static194.aClass335_45.method7766((long) arg0.anInt7641) == null) {
			return Static599.aClass335_44.method7766((long) arg0.anInt7615) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!g;Lclient!ha;)I")
	public static int method2649(@OriginalArg(1) Class123 arg0, @OriginalArg(2) Class143 arg1) {
		if (arg0.anInt2862 != -1) {
			return arg0.anInt2862;
		}
		if (arg0.anInt2868 != -1) {
			@Pc(24) Class331 local24 = arg1.anInterface3_11.method8501(arg0.anInt2868);
			if (!local24.aBoolean660) {
				return local24.aShort102;
			}
		}
		return arg0.anInt2869;
	}
}
