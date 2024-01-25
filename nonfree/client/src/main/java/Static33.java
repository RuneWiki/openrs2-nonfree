import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array5;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "Lclient!jj;")
	public static Class108 aClass108_3 = new Class108(64);

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "Ljava/lang/String;")
	public static final String aString25 = "yellow:";

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIII)I")
	public static int method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
	public static void method509() {
		Static223.aClass70_74.method1399();
	}
}
