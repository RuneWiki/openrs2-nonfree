import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "Lclient!du;")
	public static Class57 aClass57_13;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
	public static int anInt4762;

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "Lclient!hv;")
	public static Class7_Sub4_Sub9 aClass7_Sub4_Sub9_4;

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
	public static int anInt4769 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!gk;I)V")
	public static void method3783(@OriginalArg(0) Class7_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static58.anInt1041; local7++) {
			@Pc(15) int local15 = arg0.method3940();
			@Pc(19) int local19 = arg0.method3943();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static335.aClass19_Sub1Array2[local15] != null) {
				Static335.aClass19_Sub1Array2[local15].anInt2214 = local19;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ok;IZ)Lclient!du;")
	public static Class57 method3784(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method3823(arg1);
		return local13 == null ? null : new Class57(local13);
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)I")
	public static int method3785() {
		return Static108.anInt2206;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBLjava/lang/String;)I")
	public static int method3787(@OriginalArg(2) String arg0) {
		return Static109.method1895(arg0, 16);
	}
}
