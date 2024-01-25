import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static212 {

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_198 = new Class305(57, 0);

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
	public static int anInt4238 = 0;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)Z")
	public static boolean method3935(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public static void method3937() {
		if (Static455.aClass4_11.method7223()) {
			Static455.aClass4_11.method7188(Static312.aCanvas12);
			Static52.method4309();
			Static455.aClass4_11.method7217(Static312.aCanvas12);
			Static455.aClass4_11.method7174(Static312.aCanvas12);
		} else {
			Static124.method2356(Static449.anInt7876);
		}
		Static402.method6385();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
	public static void method3940(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static465.aBoolean589 = arg0;
		Static309.aString140 = arg1;
		Static150.aString62 = arg2;
		if (!Static465.aBoolean589 && Static434.anInt7518 != 3 && (Static309.aString140.equals("") || Static150.aString62.equals(""))) {
			Static47.method5114(3);
			return;
		}
		Static107.aBoolean189 = false;
		if (Static434.anInt7518 != 1) {
			Static433.anInt7516 = -1;
			Static481.anInt6920 = 0;
		}
		Static47.method5114(-3);
		Static20.anInt418 = 0;
		Static121.anInt2498 = 1;
		Static249.anInt4801 = 0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method3943(@OriginalArg(0) File arg0) {
		return Static63.method1566((int) arg0.length(), arg0);
	}
}
