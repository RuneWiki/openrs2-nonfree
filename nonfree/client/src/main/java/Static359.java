import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "Z")
	public static boolean aBoolean608 = false;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I")
	public static int method5730(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)Lclient!dj;")
	public static Class2_Sub9_Sub1 method5731(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub9_Sub1 local10 = (Class2_Sub9_Sub1) Static104.aClass144_3.method4186((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static319.aClass104_165.method2756(Static335.method5457(arg0), Static212.method3991(arg0));
		local10 = new Class2_Sub9_Sub1();
		if (local24 != null) {
			local10.method1275(new Class2_Sub12(local24));
		}
		Static104.aClass144_3.method4188((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public static void method5732() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static66.anInt1177; local9++) {
			for (@Pc(18) int local18 = 0; local18 < Static12.anInt213; local18++) {
				if (Static53.method1173(Static196.aClass51ArrayArrayArray3, local7, true, local9, local18)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
