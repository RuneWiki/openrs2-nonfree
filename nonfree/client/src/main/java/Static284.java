import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
	public static int anInt5943 = 0;

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_95 = new Class73(57, -2);

	@OriginalMember(owner = "client!kaa", name = "o", descriptor = "[I")
	public static final int[] anIntArray265 = new int[200];

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4954(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
	public static int method4955() {
		return Static500.anInt9328;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4956(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method4958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(20) int local20 = arg4 - arg2;
		for (@Pc(22) int local22 = arg0; local22 < local9; local22++) {
			Static571.method7990(arg3, Static173.anIntArrayArray15[local22], arg5, arg1);
		}
		@Pc(41) int local41 = arg1 - arg2;
		for (@Pc(43) int local43 = arg4; local43 > local20; local43--) {
			Static571.method7990(arg3, Static173.anIntArrayArray15[local43], arg5, arg1);
		}
		@Pc(61) int local61 = arg2 + arg5;
		for (@Pc(63) int local63 = local9; local63 <= local20; local63++) {
			@Pc(69) int[] local69 = Static173.anIntArrayArray15[local63];
			Static571.method7990(arg3, local69, arg5, local61);
			Static571.method7990(arg3, local69, local41, arg1);
		}
	}
}
