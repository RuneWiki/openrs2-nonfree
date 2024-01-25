import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!jq;")
	public static Class199 aClass199_3;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "Lclient!ft;")
	public static Class124 aClass124_2;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "[B")
	public static final byte[] aByteArray39 = new byte[2048];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	public static final int anInt3930 = -1;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method3550(@OriginalArg(1) String arg0) {
		if (Class21_Sub24.aString112.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class21_Sub24.aString112.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class21_Sub24.aString112.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)I")
	public static int method3551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(28) int local28 = 65536 - Class3_Sub7_Sub17_Sub1.anIntArray548[arg3 * 8192 / arg1] >> 1;
		return (arg2 * local28 >> 16) + (arg0 * (65536 - local28) >> 16);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BFFF)I")
	public static int method3552(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(13) float local13 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(23) float local23 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(33) float local33 = arg1 < 0.0F ? -arg1 : arg1;
		if (local23 > local13 && local23 > local33) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local33 > local13 && local23 < local33) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
