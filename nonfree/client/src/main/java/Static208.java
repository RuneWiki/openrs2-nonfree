import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
	public static int anInt4412;

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "Lclient!mf;")
	public static Class214 aClass214_7;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_71 = new Class90(7, 4);

	@OriginalMember(owner = "client!ib", name = "O", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_72 = new Class90(2, 3);

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_8 = new Class277(9, 2);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Z")
	public static boolean method3402(@OriginalArg(1) int arg0) {
		if (arg0 == 49 || arg0 == 25 || arg0 == 60 || arg0 == 18 || arg0 == 51) {
			return true;
		} else {
			return arg0 == 11 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3404(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) - (local10 - arg0.charAt(local12));
		}
		return local10;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)V")
	public static void method3406(@OriginalArg(0) int arg0) {
		Static294.anInt5990 = arg0;
		Static456.aClass167_47.method3961();
	}
}
