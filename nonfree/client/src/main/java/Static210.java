import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static210 {

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "Lclient!ob;")
	public static Class262 aClass262_1;

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "J")
	public static long aLong97;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "Lclient!vba;")
	public static final Class366 aClass366_3 = new Class366();

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
	public static final int anInt3654 = 1338;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_42 = new Class171(59, 6);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)Z")
	public static boolean method3123(@OriginalArg(0) int arg0) {
		if (arg0 == 25 || arg0 == 53 || arg0 == 6 || arg0 == 60 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 4 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIB)Z")
	public static boolean method3125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
