import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	public static int anInt3371 = 0;

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "Z")
	public static volatile boolean aBoolean246 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method2891() {
		return Static253.aBoolean362 || Static165.aClass3_Sub7_Sub19_14 == null ? "" : Static165.aClass3_Sub7_Sub19_14.aString82;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	public static int method2892() {
		return 16;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JJ)J")
	public static long method2893(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lclient!ve;")
	public static Class351 method2895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static567.aClass351ArrayArrayArray4[0][arg1][arg2] != null && Static567.aClass351ArrayArrayArray4[0][arg1][arg2].aClass351_1 != null;
			if (local28 && arg0 >= Static603.anInt9778 - 1) {
				return null;
			}
			Static456.method6762(arg0, arg1, arg2);
		}
		return Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)Z")
	public static boolean method2898(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
