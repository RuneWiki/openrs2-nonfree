import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "Lclient!fo;")
	public static Class82 aClass82_30;

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_13 = new Class227();

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_90 = new Class103(54, 8);

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "[I")
	public static final int[] anIntArray140 = new int[4096];

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIZIII)I")
	public static int method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(21) int local21 = arg1;
			arg1 = arg0;
			arg0 = local21;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 7 + 1 - arg3 - arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg5;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(III)V")
	public static void method1728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static359.aClass169ArrayArrayArray5[0][arg1][arg2] != null && Static359.aClass169ArrayArrayArray5[0][arg1][arg2].aClass169_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static359.aClass169ArrayArrayArray5[local22][arg1][arg2] == null) {
				@Pc(46) Class169 local46 = Static359.aClass169ArrayArrayArray5[local22][arg1][arg2] = new Class169(local22, arg1, arg2);
				if (local20) {
					local46.aByte81++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)V")
	public static void method1729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class1_Sub5_Sub11 local12 = Static188.method2688(arg1, 9);
		local12.method2661();
		local12.anInt3213 = arg2;
		local12.anInt3212 = arg0;
	}
}
