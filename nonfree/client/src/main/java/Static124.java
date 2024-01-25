import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!bma;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "[I")
	public static final int[] anIntArray149 = new int[1];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
	public static void method2284() {
		@Pc(7) Class288 local7 = null;
		try {
			@Pc(13) Class338 local13 = Static122.aClass47_1.method1391("");
			while (local13.anInt8934 == 0) {
				Static550.method7219(1L);
			}
			if (local13.anInt8934 == 1) {
				local7 = (Class288) local13.anObject16;
				@Pc(48) Class3_Sub2 local48 = Static580.aClass3_Sub22_24.method2420();
				local7.method6777(local48.aByteArray20, 0, local48.anInt2178);
			}
		} catch (@Pc(58) Exception local58) {
		}
		try {
			if (local7 != null) {
				local7.method6780();
			}
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;IB)I")
	public static int method2285(@OriginalArg(0) String arg0) {
		return Static603.method7743(16, arg0);
	}
}
