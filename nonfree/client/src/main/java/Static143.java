import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "Lclient!no;")
	public static Class123 aClass123_1 = new Class123();

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "S")
	public static short aShort49 = 32767;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2543(@OriginalArg(0) int arg0) {
		return Static175.aStringArray28[arg0].length() > 0 ? Static56.aStringArray8[arg0] + Static260.aString172 + Static175.aStringArray28[arg0] : Static56.aStringArray8[arg0];
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) Class2_Sub29 local5 = null;
		for (@Pc(12) Class2_Sub29 local12 = (Class2_Sub29) Static300.aClass44_26.method1352(); local12 != null; local12 = (Class2_Sub29) Static300.aClass44_26.method1360()) {
			if (local12.anInt5692 == arg2 && local12.anInt5687 == arg1 && local12.anInt5681 == arg5 && local12.anInt5694 == arg3) {
				local5 = local12;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class2_Sub29();
			local5.anInt5692 = arg2;
			local5.anInt5681 = arg5;
			local5.anInt5694 = arg3;
			local5.anInt5687 = arg1;
			Static163.method2981(local5);
			Static300.aClass44_26.method1358(local5);
		}
		local5.anInt5690 = arg7;
		local5.anInt5685 = arg6;
		local5.anInt5683 = arg4;
		local5.anInt5682 = arg0;
		local5.anInt5693 = arg8;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public static void method2545(@OriginalArg(0) int arg0) {
		Static131.method2424();
		Static237.method3830();
		@Pc(16) int local16 = Static209.method3503(arg0).anInt5783;
		if (local16 == 0) {
			return;
		}
		@Pc(26) int local26 = Static64.anIntArray134[arg0];
		if (local16 == 5) {
			Static238.anInt5978 = local26;
		}
		if (local16 == 6) {
			Static70.anInt1778 = local26;
		}
		if (local16 == 9) {
			Static236.anInt4769 = local26;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([Ljava/lang/Object;[IIBI)V")
	public static void method2547(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if (local20 + (local46 & 0x1) > arg1[local46]) {
				@Pc(68) int local68 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local68;
				@Pc(82) Object local82 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local82;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method2547(arg0, arg1, arg2, local16 - 1);
		method2547(arg0, arg1, local16 + 1, arg3);
	}
}
