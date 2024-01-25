import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method7332(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg0.indexOf(arg1); local13 != -1; local13 = arg0.indexOf(arg1, local13 + arg2.length())) {
			arg0 = arg0.substring(0, local13) + arg2 + arg0.substring(arg1.length() + local13);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "(I)[Lclient!baa;")
	public static Class28[] method7333() {
		return new Class28[] { Static370.aClass28_17, Static67.aClass28_3, Static35.aClass28_1, Static285.aClass28_16, Static45.aClass28_2, Static291.aClass28_9, Static79.aClass28_4, Static398.aClass28_22, Static440.aClass28_19, Static315.aClass28_21, Static560.aClass28_23, Static191.aClass28_7, Static140.aClass28_6, Static122.aClass28_5 };
	}
}
