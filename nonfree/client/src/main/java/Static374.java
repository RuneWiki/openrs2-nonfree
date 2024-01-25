import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public static int anInt6199;

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_1 = new Class293(14, 0);

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_2 = new Class293(15, 4);

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_3 = new Class293(16, -2);

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_4 = new Class293(17, 0);

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_5 = new Class293(18, -2);

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_6 = new Class293(19, -2);

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_7 = new Class293(20, 6);

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_8 = new Class293(21, 9);

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_9 = new Class293(22, -2);

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_10 = new Class293(23, 4);

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_11 = new Class293(24, -1);

	@OriginalMember(owner = "client!ni", name = "E", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_12 = new Class293(26, 0);

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_13 = new Class293(27, 0);

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "Lclient!ql;")
	public static final Class293 aClass293_14 = new Class293(28, -2);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZIIZ)I")
	public static int method5492(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(12) Class5_Sub38 local12 = Static478.method7058(arg1, false);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local12.anIntArray364.length; local20++) {
			if (local12.anIntArray364[local20] >= 0 && Static643.aClass275_2.anInt7494 > local12.anIntArray364[local20]) {
				@Pc(47) Class255 local47 = Static643.aClass275_2.method6641(local12.anIntArray364[local20]);
				@Pc(57) int local57 = local47.method5854(arg0, Static302.aClass291_1.method6836(arg0).anInt256);
				if (arg2) {
					local18 += local12.anIntArray363[local20] * local57;
				} else {
					local18 += local57;
				}
			}
		}
		return local18;
	}
}
