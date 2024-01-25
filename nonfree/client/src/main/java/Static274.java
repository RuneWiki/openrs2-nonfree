import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
	public static int anInt4386;

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "Lclient!cda;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_159 = new Class288(45, 1);

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_59 = new Class179(80, 3);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)I")
	public static int method3801() {
		return Static491.anInt8078 == 1 ? Static589.anInt9580 : 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(JI)V")
	public static void method3802(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}
}
