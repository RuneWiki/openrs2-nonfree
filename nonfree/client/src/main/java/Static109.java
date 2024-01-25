import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "Lclient!dp;")
	public static Class53 aClass53_55;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "Lclient!mb;")
	public static Class132 aClass132_7 = null;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "Lclient!ce;")
	public static final Class31 aClass31_5 = new Class31(128);

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_16 = new Class211();

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
	public static int anInt2025 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Lclient!kf;")
	public static Class6_Sub2_Sub9 method2198(@OriginalArg(1) int arg0) {
		@Pc(10) Class70 local10 = Static336.aClass70_105;
		@Pc(19) Class6_Sub2_Sub9 local19;
		synchronized (Static336.aClass70_105) {
			local19 = (Class6_Sub2_Sub9) Static336.aClass70_105.method1396((long) arg0);
			if (local19 == null) {
				local19 = new Class6_Sub2_Sub9(arg0);
				Static336.aClass70_105.method1406(local19, (long) arg0);
			}
		}
		synchronized (local19) {
			return local19.method3164() ? local19 : null;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
	public static void method2199() {
		Static92.aClass70_30.method1397(5);
		Static134.aClass70_46.method1397(5);
	}
}
