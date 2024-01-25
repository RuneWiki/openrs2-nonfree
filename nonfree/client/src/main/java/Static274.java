import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_77 = new Class27(64, -1);

	@OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
	public static int anInt4796 = -1;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3859(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static179.method2957(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static60.anInt7169; local25++) {
			@Pc(36) String local36 = Static325.aStringArray36[local25];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static179.method2957(local36);
			if (local36 != null && local36.equals(local20)) {
				Static60.anInt7169--;
				for (@Pc(60) int local60 = local25; local60 < Static60.anInt7169; local60++) {
					Static325.aStringArray36[local60] = Static325.aStringArray36[local60 + 1];
					Static347.aStringArray40[local60] = Static347.aStringArray40[local60 + 1];
					Static9.anIntArray8[local60] = Static9.anIntArray8[local60 + 1];
					Static447.aStringArray48[local60] = Static447.aStringArray48[local60 + 1];
					Static137.anIntArray286[local60] = Static137.anIntArray286[local60 + 1];
					Static417.aBooleanArray23[local60] = Static417.aBooleanArray23[local60 + 1];
				}
				Static320.anInt5509 = Static193.anInt3856;
				Static310.method4308(Static137.aClass27_53);
				Static337.aClass10_Sub8_Sub2_2.method2458(Static119.method2056(arg0));
				Static337.aClass10_Sub8_Sub2_2.method2465(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V")
	public static void method3862() {
		@Pc(1) Class267 local1 = Static416.aClass267_78;
		synchronized (Static416.aClass267_78) {
			Static416.aClass267_78.method6007(5);
		}
		@Pc(27) Class267 local27 = Static284.aClass267_51;
		synchronized (Static284.aClass267_51) {
			Static284.aClass267_51.method6007(5);
		}
	}
}
