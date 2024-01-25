import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
	public static int anInt3633;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "Lclient!hn;")
	public static Class142 aClass142_3;

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "I")
	public static int anInt3641;

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[8];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)I")
	public static int method3242(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!n;III)V")
	public static void method3246(@OriginalArg(0) Class225 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static109.aClass225_10 = arg0;
		Static71.anInt1237 = arg1;
		Static567.anInt9950 = arg2;
	}
}
