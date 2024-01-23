import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_66;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
	public static int anInt4590;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static int anInt4583 = 0;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public static int anInt4584 = 0;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	public static int anInt4585 = 0;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public static int anInt4587 = 0;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1562 = Static64.method1101(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public static int anInt4593 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!me;)Lclient!me;")
	public static Class71 method3594(@OriginalArg(1) Class71 arg0) {
		@Pc(11) Class71 local11 = Static33.method579(arg0);
		if (local11 == null) {
			local11 = arg0.aClass71_24;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IJ)V")
	public static void method3596(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static167.aClass1_Sub16_Sub1_2.method3823(33);
			Static167.aClass1_Sub16_Sub1_2.method3786(arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!ia;ILclient!ia;ILclient!ia;)V")
	public static void method3597(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(5) Class51 arg4) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static84.anIntArray124[local3] = Static84.anIntArray124[local3 - 1];
			Static206.aClass51Array28[local3] = Static206.aClass51Array28[local3 - 1];
			Static224.aClass51Array31[local3] = Static224.aClass51Array31[local3 - 1];
			Static135.aClass51Array22[local3] = Static135.aClass51Array22[local3 - 1];
			Static44.anIntArray62[local3] = Static44.anIntArray62[local3 - 1];
		}
		Static84.anIntArray124[0] = arg2;
		Static206.aClass51Array28[0] = arg1;
		Static224.aClass51Array31[0] = arg3;
		Static135.aClass51Array22[0] = arg4;
		Static93.anInt2061++;
		Static73.anInt1666 = Static27.anInt651;
		Static44.anIntArray62[0] = arg0;
	}
}
