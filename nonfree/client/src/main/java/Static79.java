import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fi", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString63 = "white:";

	@OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
	public static int anInt1661 = 0;

	@OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
	public static int anInt1662 = 0;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(III)I")
	public static int method1362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class4_Sub33 local6 = (Class4_Sub33) Static49.aClass163_15.method4188((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 >= 0 && local6.anIntArray464.length > arg1) {
			return local6.anIntArray464[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 < 0 || arg1 < 0 || arg5 >= 103 || arg1 >= 103) {
			return;
		}
		@Pc(46) int local46;
		if (arg3 == 0) {
			@Pc(36) Class181 local36 = Static71.method1220(arg4, arg5, arg1);
			if (local36 != null) {
				local46 = (int) (local36.aLong206 >>> 32) & Integer.MAX_VALUE;
				if (arg0 == 2) {
					local36.aClass13_9 = new Class13_Sub2(local46, 2, arg2 + 4, arg4, arg5, arg1, arg6, false, local36.aClass13_9);
					local36.aClass13_10 = new Class13_Sub2(local46, 2, arg2 + 1 & 0x3, arg4, arg5, arg1, arg6, false, local36.aClass13_10);
				} else {
					local36.aClass13_9 = new Class13_Sub2(local46, arg0, arg2, arg4, arg5, arg1, arg6, false, local36.aClass13_9);
				}
			}
		}
		if (arg3 == 1) {
			@Pc(113) Class35 local113 = Static307.method4712(arg4, arg5, arg1);
			if (local113 != null) {
				local46 = Integer.MAX_VALUE & (int) (local113.aLong48 >>> 32);
				if (arg0 == 4 || arg0 == 5) {
					local113.aClass13_2 = new Class13_Sub2(local46, 4, arg2, arg4, arg5, arg1, arg6, false, local113.aClass13_2);
				} else if (arg0 == 6) {
					local113.aClass13_2 = new Class13_Sub2(local46, 4, arg2 + 4, arg4, arg5, arg1, arg6, false, local113.aClass13_2);
				} else if (arg0 == 7) {
					local113.aClass13_2 = new Class13_Sub2(local46, 4, (arg2 + 2 & 0x3) + 4, arg4, arg5, arg1, arg6, false, local113.aClass13_2);
				} else if (arg0 == 8) {
					local113.aClass13_2 = new Class13_Sub2(local46, 4, arg2 + 4, arg4, arg5, arg1, arg6, false, local113.aClass13_2);
					local113.aClass13_1 = new Class13_Sub2(local46, 4, (arg2 + 2 & 0x3) + 4, arg4, arg5, arg1, arg6, false, local113.aClass13_1);
				}
			}
		}
		if (arg3 == 2) {
			@Pc(248) Class99 local248 = Static101.method1682(arg4, arg5, arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (local248 != null) {
				local248.aClass13_4 = new Class13_Sub2((int) (local248.aLong117 >>> 32) & Integer.MAX_VALUE, arg0, arg2, arg4, arg5, arg1, arg6, false, local248.aClass13_4);
			}
		}
		if (arg3 == 3) {
			@Pc(288) Class67 local288 = Static19.method424(arg4, arg5, arg1);
			if (local288 != null) {
				local288.aClass13_3 = new Class13_Sub2(Integer.MAX_VALUE & (int) (local288.aLong80 >>> 32), 22, arg2, arg4, arg5, arg1, arg6, false, local288.aClass13_3);
			}
		}
	}
}
