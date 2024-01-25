import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!ui;")
	public static final Class339 aClass339_9 = new Class339();

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_34 = new Class102(64);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!l;Z)V")
	public static void method5145(@OriginalArg(0) Class4_Sub1_Sub2_Sub1_Sub2 arg0) {
		@Pc(11) Class3_Sub22 local11 = (Class3_Sub22) Static613.aClass280_47.method7107((long) arg0.anInt5759);
		if (local11 == null) {
			return;
		}
		if (local11.aClass3_Sub7_Sub3_1 != null) {
			Static204.aClass3_Sub7_Sub1_1.method1621(local11.aClass3_Sub7_Sub3_1);
			local11.aClass3_Sub7_Sub3_1 = null;
		}
		local11.method8769();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public static void method5147(@OriginalArg(1) int arg0) {
		Static561.anInt9391 = arg0;
		Static632.anInt10105 = -1;
		Static632.anInt10105 = -1;
		Static509.method7605();
	}
}
