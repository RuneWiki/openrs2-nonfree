import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "Lclient!oh;")
	public static Class237 aClass237_151;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!hu;")
	public static Class21 aClass21_34;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Z")
	public static final boolean aBoolean761 = true;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
	public static int anInt10680 = 1;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Lclient!cl;")
	public static Class57 method8615(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static96.aClass57Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BILclient!ig;)V")
	public static void method8617(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (Static289.aClass235_4 == null) {
			return;
		}
		try {
			Static289.aClass235_4.method6166(0L);
			Static289.aClass235_4.method6175(arg0, 24, arg1.aByteArray107);
		} catch (@Pc(18) Exception local18) {
		}
	}
}
