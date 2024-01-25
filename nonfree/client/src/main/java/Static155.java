import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ka", name = "kb", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!ka", name = "tb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
	public static int anInt2944 = -1;

	@OriginalMember(owner = "client!ka", name = "rb", descriptor = "Z")
	public static final boolean aBoolean193 = false;

	@OriginalMember(owner = "client!ka", name = "ub", descriptor = "I")
	public static int anInt2961 = -1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method2495() {
		@Pc(1) Class26 local1 = Static188.aClass26_36;
		synchronized (Static188.aClass26_36) {
			Static188.aClass26_36.method328();
		}
		local1 = Static30.aClass26_3;
		synchronized (Static30.aClass26_3) {
			Static30.aClass26_3.method328();
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method2498() {
		Static160.aClass26_54.method333();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Lclient!ui;")
	public static Class11_Sub4_Sub19 method2502(@OriginalArg(1) int arg0) {
		@Pc(10) Class11_Sub4_Sub19 local10 = (Class11_Sub4_Sub19) Static77.aClass142_12.method3874((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static212.aClass144_66.method3896(Static79.method4499(arg0), Static245.method5579(arg0));
		local10 = new Class11_Sub4_Sub19();
		if (local24 != null) {
			local10.method5330(new Class11_Sub25(local24));
		}
		Static77.aClass142_12.method3870(local10, (long) arg0);
		return local10;
	}
}
