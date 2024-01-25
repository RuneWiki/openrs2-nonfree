import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!du", name = "c", descriptor = "[I")
	public static final int[] anIntArray128 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	public static int anInt1857 = 0;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "I")
	public static final int anInt1858 = 1403;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "[I")
	public static final int[] anIntArray129 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!du", name = "l", descriptor = "F")
	public static float aFloat35 = 1.0F;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Lclient!tv;")
	public static Class233 method1644() {
		try {
			return (Class233) Class.forName("Class233_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class199 local13 = local7.aClass199_1; local13 != null; local13 = local13.aClass199_2) {
			@Pc(17) Class11_Sub5 local17 = local13.aClass11_Sub5_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort95 == arg1 && local17.aShort93 == arg2) {
				Static248.method4081(local17);
				return;
			}
		}
	}
}
