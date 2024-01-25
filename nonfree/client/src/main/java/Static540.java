import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_9 = new Class129(3, 2);

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)V")
	public static void method7633() {
		for (@Pc(10) Class9_Sub3 local10 = (Class9_Sub3) Static27.aClass234_1.method6094(); local10 != null; local10 = (Class9_Sub3) Static27.aClass234_1.method6094()) {
			Static529.method5796(local10);
		}
		@Pc(39) int local39;
		@Pc(38) int local38;
		if (Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 1) {
			local38 = 3;
			local39 = 0;
		} else {
			local38 = Static213.anInt4581;
			local39 = Static213.anInt4581;
		}
		Static75.method2149();
		for (@Pc(48) int local48 = local39; local48 <= local38; local48++) {
			Static75.method2136();
			Static75.method2140(local48);
			Static75.method2145(local48);
		}
		Static75.method2148();
		Static75.method2150();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)Z")
	public static boolean method7635(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class6_Sub5_Sub9 local15 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local15 != null; local15 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
			if (Static74.method2090(local15.anInt3240) && (long) arg0 == local15.aLong78) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	public static void method7636() {
		Static523.method7458();
	}
}
