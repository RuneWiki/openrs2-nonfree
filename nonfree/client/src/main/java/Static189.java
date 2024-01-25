import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	public static int anInt3632;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
	public static int anInt3636 = 0;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "Z")
	public static boolean aBoolean272 = true;

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
	public static int anInt3643 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIIILclient!hu;I)Ljava/awt/Frame;")
	public static Frame method2796(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class114 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method2344()) {
			return null;
		}
		@Pc(20) Class155[] local20 = Static66.method1257(arg2);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg3 == local20[local28].anInt4448 && arg1 == local20[local28].anInt4445 && (!local26 || local20[local28].anInt4446 > arg0)) {
				arg0 = local20[local28].anInt4446;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(94) Class108 local94 = arg2.method2360(arg3, arg1, arg0);
		while (local94.anInt2803 == 0) {
			Static20.method1515(10L);
		}
		@Pc(109) Frame local109 = (Frame) local94.anObject4;
		if (local109 == null) {
			return null;
		} else if (local94.anInt2803 == 2) {
			Static387.method5231(arg2, local109);
			return null;
		} else {
			return local109;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLclient!ns;)V")
	public static void method2798(@OriginalArg(1) Class166 arg0) {
		Static240.aClass166_166 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2799(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
