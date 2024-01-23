import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!sc", name = "fb", descriptor = "Lclient!tj;")
	public static Class103 aClass103_2;

	@OriginalMember(owner = "client!sc", name = "gb", descriptor = "Lclient!fh;")
	public static Class58 aClass58_88;

	@OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
	public static int anInt4745 = 0;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26 = null;

	@OriginalMember(owner = "client!sc", name = "jb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27 = new String[500];

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
	public static void method3953() {
		Static131.aClass26_25.method515();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static void method3954(@OriginalArg(1) boolean arg0) {
		Static16.method763();
		if (Static169.anInt3304 != 30 && Static169.anInt3304 != 25) {
			return;
		}
		Static102.anInt2142++;
		if (Static102.anInt2142 < 50 && !arg0) {
			return;
		}
		Static102.anInt2142 = 0;
		if (!Static40.aBoolean38 && Static134.aClass52_7 != null) {
			Static110.aClass4_Sub10_Sub1_1.method4687(137);
			try {
				Static134.aClass52_7.method1107(Static110.aClass4_Sub10_Sub1_1.aByteArray71, Static110.aClass4_Sub10_Sub1_1.anInt5713);
				Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
			} catch (@Pc(52) IOException local52) {
				Static40.aBoolean38 = true;
			}
		}
		Static16.method763();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)C")
	public static char method3956(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Z")
	public static boolean method3957(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!fd;I)Lclient!gg;")
	public static Class11_Sub3 method3958(@OriginalArg(0) Class4_Sub10 arg0) {
		return new Class11_Sub3(arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4655(), arg0.method4655(), arg0.method4666());
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!fd;I)Lclient!de;")
	public static Class11_Sub2 method3959(@OriginalArg(0) Class4_Sub10 arg0) {
		return new Class11_Sub2(arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4655(), arg0.method4666());
	}
}
