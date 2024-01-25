import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static469 {

	@OriginalMember(owner = "client!qca", name = "J", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray4;

	@OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
	public static int anInt8171;

	@OriginalMember(owner = "client!qca", name = "M", descriptor = "Lclient!qp;")
	public static Class291 aClass291_1;

	@OriginalMember(owner = "client!qca", name = "G", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_253 = new Class196(82, 9);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(CI)Z")
	public static boolean method6938(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(ZB)V")
	public static void method6939(@OriginalArg(0) boolean arg0) {
		Static206.method2869(Static131.anInt2222, Static316.anInt8165, Static563.anInt9176, arg0);
	}
}
