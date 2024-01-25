import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!jia", name = "x", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_6 = new Class271(4, 1, 1, 1);

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V")
	public static void method4303() {
		Static258.aClass78Array32 = null;
		if (Static558.aBoolean680 && Static501.method7132() != 1) {
			Static464.method6724(Static360.method5510(), 0, Static538.anInt8985 == 3 || Static538.anInt8985 == 7, Static329.method8198(), 0);
		}
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (Static558.aBoolean680) {
			local37 = Static257.method4233();
			local39 = Static290.method4545();
		}
		Static572.method7866(local37, Static387.anInt6978, local39 + Static585.anInt9606, local39, local39, local37 + Static571.anInt9399, local37, -1);
		if (Static258.aClass78Array32 != null) {
			Static330.method3635(Static571.anInt9399 + local37, Static258.aClass78Array32, Static585.anInt9606 + local39, Static217.aClass78_7.anInt1969, true, local39, -1412584499, Static419.anInt7640, Static52.anInt10195, local37);
			Static258.aClass78Array32 = null;
		}
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(B)V")
	public static void method4304() {
		Static376.anInt6732 = -1;
		Static610.aClass20_35 = null;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "([BB)Z")
	public static boolean method4305(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub34 local8 = new Class2_Sub34(arg0);
		@Pc(12) int local12 = local8.method6904();
		if (local12 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local8.method6904() == 1;
		if (local33) {
			Static550.method7656(local8);
		}
		Static387.method5830(local8);
		return true;
	}
}
