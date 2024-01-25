import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "Lclient!mh;")
	public static final Class225 aClass225_12 = new Class225(9, 2);

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_42 = new Class154(17, 8);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIII)I")
	public static int method2576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg2;
			arg2 = local16;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg4;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg1;
		} else {
			return 1 + 7 - arg2 - arg4;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BLclient!gk;)Ljava/lang/String;")
	public static String method2577(@OriginalArg(1) Class2_Sub7 arg0) {
		return Static514.method6641(arg0);
	}
}
