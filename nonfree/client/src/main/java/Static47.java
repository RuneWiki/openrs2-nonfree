import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ej", name = "cb", descriptor = "I")
	public static int anInt1197;

	@OriginalMember(owner = "client!ej", name = "db", descriptor = "I")
	public static int anInt1198;

	@OriginalMember(owner = "client!ej", name = "eb", descriptor = "Lclient!le;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!ej", name = "W", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_501 = Static187.method3089("(R");

	@OriginalMember(owner = "client!ej", name = "X", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_502 = Static187.method3089("null");

	@OriginalMember(owner = "client!ej", name = "fb", descriptor = "[Lclient!de;")
	public static final Class8_Sub3_Sub1[] aClass8_Sub3_Sub1Array1 = new Class8_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLclient!ba;)Z")
	public static boolean method837(@OriginalArg(1) Class11 arg0) {
		if (arg0.anIntArray31 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray31.length; local17++) {
			@Pc(24) int local24 = Static142.method2098(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray28[local17];
			if (arg0.anIntArray31[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray31[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray31[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(IB)Lclient!cj;")
	public static Class1_Sub3_Sub3 method838(@OriginalArg(0) int arg0) {
		@Pc(18) Class1_Sub3_Sub3 local18 = (Class1_Sub3_Sub3) Static140.aClass47_21.method1281((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static56.aClass3_8.method3265(28, arg0);
		local18 = new Class1_Sub3_Sub3();
		if (local28 != null) {
			local18.method513(new Class1_Sub14(local28));
		}
		Static140.aClass47_21.method1273((long) arg0, local18);
		return local18;
	}
}
