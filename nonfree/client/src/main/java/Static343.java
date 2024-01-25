import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!lia", name = "g", descriptor = "Lclient!mp;")
	public static final Class236 aClass236_5 = new Class236();

	@OriginalMember(owner = "client!lia", name = "h", descriptor = "Lclient!in;")
	public static final Class169 aClass169_164 = new Class169(38, 6);

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!daa;ILclient!daa;)V")
	public static void method5735(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(2) Class2_Sub1 arg1) {
		if (arg1.aClass2_Sub1_66 != null) {
			arg1.method9377();
		}
		arg1.aClass2_Sub1_67 = arg0.aClass2_Sub1_67;
		arg1.aClass2_Sub1_66 = arg0;
		arg1.aClass2_Sub1_66.aClass2_Sub1_67 = arg1;
		arg1.aClass2_Sub1_67.aClass2_Sub1_66 = arg1;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Ljava/lang/String;IB)I")
	public static int method5737(@OriginalArg(0) String arg0) {
		return Static260.method4508(arg0, 16);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(III)Z")
	public static boolean method5740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static69.method1292(arg0, arg1) || Static318.method5257(arg0, arg1);
	}
}
