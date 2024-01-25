import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!t", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString228;

	@OriginalMember(owner = "client!t", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString227 = " from your ignore list first.";

	@OriginalMember(owner = "client!t", name = "B", descriptor = "I")
	public static int anInt5793 = -1;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "I")
	public static int anInt5794 = -1;

	@OriginalMember(owner = "client!t", name = "E", descriptor = "I")
	public static int anInt5796 = 0;

	@OriginalMember(owner = "client!t", name = "H", descriptor = "I")
	public static final int anInt5798 = -13423323;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)B")
	public static byte method5049(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[Ljava/lang/Object;I)V")
	public static void method5052(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) int local24 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg3];
		arg2[arg3] = local38;
		for (@Pc(50) int local50 = arg0; local50 < arg3; local50++) {
			if ((local50 & 0x1) + local24 > arg1[local50]) {
				@Pc(65) int local65 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20] = local65;
				@Pc(79) Object local79 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20++] = local79;
			}
		}
		arg1[arg3] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg3] = arg2[local20];
		arg2[local20] = local38;
		method5052(arg0, arg1, arg2, local20 - 1);
		method5052(local20 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IC)Z")
	public static boolean method5053(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
