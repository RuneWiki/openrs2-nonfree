import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_135 = new Class252(18, 18);

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
	public static int anInt9181 = 64;

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "Z")
	public static boolean aBoolean687 = false;

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "[F")
	public static final float[] aFloatArray78 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7932(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static556.method7044(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method7933(@OriginalArg(0) String arg0) {
		@Pc(16) String local16 = Static175.method3243(Static140.method2622(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(JB)V")
	public static void method7935(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(14) InterruptedException local14) {
		}
	}
}
