import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Z")
	public static boolean aBoolean50;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_483 = Static14.method2017("(X");

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!kc;")
	private static Class36 aClass36_485 = Static14.method2017("flash3:");

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!kc;")
	public static Class36 aClass36_484 = aClass36_485;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
	public static int anInt935 = -1;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "Lclient!kc;")
	public static Class36 aClass36_486 = Static14.method2017("leuchten3:");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
	public static int method724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(24) int local24 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local24;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)I")
	public static int method725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub13 local15 = (Class2_Sub13) Static66.aClass31_3.method905((long) arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 >= 0 && local15.anIntArray248.length > arg0) {
			return local15.anIntArray248[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	public static void method726() {
		aClass36_485 = null;
		aByteArrayArrayArray5 = null;
		aClass36_483 = null;
		aClass36_486 = null;
		aLongArray4 = null;
		aClass36_484 = null;
	}
}
