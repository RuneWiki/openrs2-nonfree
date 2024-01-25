import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "Z")
	public static boolean aBoolean585 = false;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "Lclient!bd;")
	public static final Class32 aClass32_54 = new Class32();

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_204 = new Class160(91, 1);

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "Lclient!fe;")
	public static final Class114 aClass114_7 = new Class114();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLclient!jc;)Lclient!tn;")
	public static Class353 method7146(@OriginalArg(1) Class14_Sub21 arg0) {
		@Pc(14) String local14 = arg0.method7703(0);
		@Pc(21) Class258 local21 = Static428.method6432()[arg0.method7695(107)];
		@Pc(28) Class205 local28 = Static43.method711()[arg0.method7695(116)];
		@Pc(32) int local32 = arg0.method7752();
		@Pc(36) int local36 = arg0.method7752();
		@Pc(40) int local40 = arg0.method7695(110);
		@Pc(44) int local44 = arg0.method7695(99);
		@Pc(48) int local48 = arg0.method7695(99);
		@Pc(52) int local52 = arg0.method7717(-1978450544);
		@Pc(56) int local56 = arg0.method7717(-1978450544);
		@Pc(60) int local60 = arg0.method7748();
		@Pc(64) int local64 = arg0.method7748();
		@Pc(68) int local68 = arg0.method7748();
		return new Class353(local14, local21, local28, local32, local36, local40, local44, local48, local52, local56, local60, local64, local68);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method7149(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (arg0.length() > 320 || !Static351.method9355()) {
			return;
		}
		Static277.aClass347_1.method8306();
		Static122.method1938();
		Static187.aString36 = arg1;
		Static314.aString72 = arg0;
		Static160.method2323(5);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)I")
	public static int method7150() {
		return Static323.anInt5607;
	}
}
