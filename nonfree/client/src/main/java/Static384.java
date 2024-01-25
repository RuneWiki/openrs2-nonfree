import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!th", name = "p", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array12;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_49 = new Class134(260);

	@OriginalMember(owner = "client!th", name = "y", descriptor = "[I")
	public static final int[] anIntArray568 = new int[13];

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_79 = new Class179(10, -1);

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)Lclient!kn;")
	public static Class1_Sub26 method5196() {
		if (Static168.aClass181_3 == null || Static233.aClass162_2 == null) {
			return null;
		}
		Static233.aClass162_2.method3756(Static168.aClass181_3);
		@Pc(23) Class1_Sub26 local23 = (Class1_Sub26) Static233.aClass162_2.method3754();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class202 local33 = Static168.aClass78_2.method2110(local23.anInt3922);
			return local33 != null && local33.aBoolean397 && local33.method4655(Static168.anInterface8_2) ? local23 : Static47.method860();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ui;B)V")
	public static void method5198(@OriginalArg(0) Class1_Sub42 arg0) {
		if (client.lb == null) {
			return;
		}
		@Pc(8) Interface5 local8 = null;
		if (arg0.anInt6556 == 0) {
			local8 = (Interface5) Static110.method1983(arg0.anInt6553, arg0.anInt6560, arg0.anInt6557);
		}
		if (arg0.anInt6556 == 1) {
			local8 = (Interface5) Static198.method3177(arg0.anInt6553, arg0.anInt6560, arg0.anInt6557);
		}
		if (arg0.anInt6556 == 2) {
			local8 = (Interface5) Static357.method4896(arg0.anInt6553, arg0.anInt6560, arg0.anInt6557, ig.class);
		}
		if (arg0.anInt6556 == 3) {
			local8 = (Interface5) Static393.method5258(arg0.anInt6553, arg0.anInt6560, arg0.anInt6557);
		}
		if (local8 == null) {
			arg0.anInt6555 = 0;
			arg0.anInt6550 = 0;
			arg0.anInt6561 = -1;
		} else {
			arg0.anInt6561 = local8.method5176();
			arg0.anInt6555 = local8.method5172();
			arg0.anInt6550 = local8.method5169();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Z")
	public static boolean method5199(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
