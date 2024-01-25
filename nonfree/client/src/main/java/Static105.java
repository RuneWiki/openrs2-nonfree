import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!eba", name = "H", descriptor = "I")
	public static int anInt2025;

	@OriginalMember(owner = "client!eba", name = "E", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_24 = new Class136(4);

	@OriginalMember(owner = "client!eba", name = "F", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_38 = new Class73(92, 8);

	@OriginalMember(owner = "client!eba", name = "G", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_39 = new Class73(54, 14);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(CI)Z")
	public static boolean method1886(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)Z")
	public static boolean method1887(@OriginalArg(0) int arg0) {
		return arg0 == 22 || arg0 == 60 || arg0 == 1002 || arg0 == 3 || arg0 == 44;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLclient!ac;)V")
	public static void method1888(@OriginalArg(1) Class4_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(10) Class6_Sub16 local10 = (Class6_Sub16) Static427.aClass361_54.method7838(); local10 != null; local10 = (Class6_Sub16) Static427.aClass361_54.method7845()) {
			if (arg0 == local10.aClass4_Sub1_Sub1_Sub1_1) {
				if (local10.aClass6_Sub18_Sub1_3 != null) {
					Static374.aClass6_Sub18_Sub4_2.method6380(local10.aClass6_Sub18_Sub1_3);
					local10.aClass6_Sub18_Sub1_3 = null;
				}
				local10.method7804();
				return;
			}
		}
	}
}
