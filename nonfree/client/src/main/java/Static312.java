import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!lw", name = "J", descriptor = "[Lclient!vh;")
	public static Class342[] aClass342Array3;

	@OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
	public static int anInt5339;

	@OriginalMember(owner = "client!lw", name = "M", descriptor = "I")
	public static int anInt5341;

	@OriginalMember(owner = "client!lw", name = "F", descriptor = "[I")
	public static final int[] anIntArray418 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)I")
	public static int method4327(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return (arg0 & 0xFF80) + local16;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BII)Z")
	public static boolean method4328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static559.method7593(arg1, arg0) | Static64.method1167(arg1, arg0)) & Static454.method6262(arg1, arg0);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!mo;)Lclient!cl;")
	public static Class56 method4329(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(12) int local12 = arg0.method5804();
		return new Class56(local12);
	}
}
