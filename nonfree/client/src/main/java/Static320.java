import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!mq", name = "Ib", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_96 = new Class47(41, 8);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([SI)[S")
	public static short[] method5060(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static601.method2933(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "(I)Z")
	public static boolean method5062() {
		try {
			@Pc(15) Class357 local15 = new Class357();
			@Pc(20) byte[] local20 = local15.method7815(Static108.aByteArray10);
			Static146.method2820(local20);
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "(I)V")
	public static void method5065() {
		Static187.aClass136_46.method3470();
		Static509.aClass136_106.method3470();
		Static422.aClass136_81.method3470();
		Static523.aClass136_102.method3470();
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(II)I")
	public static int method5066(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
