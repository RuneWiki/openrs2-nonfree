import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!hd", name = "vb", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array9;

	@OriginalMember(owner = "client!hd", name = "wb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!hd", name = "zb", descriptor = "Lclient!dd;")
	public static Class16 aClass16_7;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!rc;")
	public static Class66 aClass66_8 = new Class66(64);

	@OriginalMember(owner = "client!hd", name = "Ab", descriptor = "Lclient!ea;")
	public static Class18 aClass18_456 = Static8.method128("(U2");

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method1222() {
		aClass18Array9 = null;
		aClass18_456 = null;
		aClass16_7 = null;
		aByteArrayArrayArray3 = null;
		aClass66_8 = null;
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)Lclient!oe;")
	public static Class50 method1232() {
		try {
			return (Class50) Class.forName("Class50_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class50_Sub1();
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(II)Lclient!cd;")
	public static Class1_Sub1_Sub6 method1242(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub6 local10 = (Class1_Sub1_Sub6) Static96.aClass66_10.method2599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static95.aClass16_12.method2254(arg0, 14);
		local10 = new Class1_Sub1_Sub6();
		if (local25 != null) {
			local10.method368(new Class1_Sub6(local25));
		}
		Static96.aClass66_10.method2597((long) arg0, local10);
		return local10;
	}
}
