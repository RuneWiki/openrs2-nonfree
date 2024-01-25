import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIIIILclient!js;)Ljava/awt/Frame;")
	public static Frame method5099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class131 arg3) {
		if (!arg3.method3051()) {
			return null;
		}
		@Pc(20) Class82[] local20 = Static92.method1554(arg3);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt2298 == arg0 && local20[local28].anInt2301 == arg1 && (!local26 || arg2 < local20[local28].anInt2303)) {
				arg2 = local20[local28].anInt2303;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(90) Class128 local90 = arg3.method3043(arg0, arg2, arg1);
		while (local90.anInt3727 == 0) {
			Static443.method5991(10L);
		}
		@Pc(111) Frame local111 = (Frame) local90.anObject4;
		if (local111 == null) {
			return null;
		} else if (local90.anInt3727 == 2) {
			Static9.method189(local111, arg3);
			return null;
		} else {
			return local111;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method5100(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg2.indexOf(arg0); local13 != -1; local13 = arg2.indexOf(arg0, arg1.length() + local13)) {
			arg2 = arg2.substring(0, local13) + arg1 + arg2.substring(arg0.length() + local13);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(IB)V")
	public static void method5101(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub2 local12 = Static15.method236(arg0, 3);
		local12.method435();
	}
}
