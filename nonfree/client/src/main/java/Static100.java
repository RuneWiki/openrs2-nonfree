import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!m", name = "kb", descriptor = "Lclient!ga;")
	public static Class30 aClass30_35;

	@OriginalMember(owner = "client!m", name = "nb", descriptor = "I")
	public static int anInt2566;

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_990 = Static169.method2903(")2");

	@OriginalMember(owner = "client!m", name = "jb", descriptor = "Lclient!n;")
	public static Class56 aClass56_9 = new Class56();

	@OriginalMember(owner = "client!m", name = "lb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_991 = Static169.method2903("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!m", name = "mb", descriptor = "[I")
	public static int[] anIntArray321 = new int[5];

	@OriginalMember(owner = "client!m", name = "pb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_992 = Static169.method2903(" <col=ffff00>");

	@OriginalMember(owner = "client!m", name = "sb", descriptor = "I")
	public static int anInt2570 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BIIIIIII)V")
	public static void method1706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (Static8.aBoolean17 && arg1 != Static85.anInt2267) {
			return;
		}
		@Pc(33) int local33 = 0;
		if (arg3 == 0) {
			local33 = Static123.aClass80_1.method2664(arg1, arg2, arg0);
		}
		if (arg3 == 1) {
			local33 = Static123.aClass80_1.method2678(arg1, arg2, arg0);
		}
		if (arg3 == 2) {
			local33 = Static123.aClass80_1.method2688(arg1, arg2, arg0);
		}
		if (arg3 == 3) {
			local33 = Static123.aClass80_1.method2687(arg1, arg2, arg0);
		}
		@Pc(84) int local84;
		if (local33 != 0) {
			local84 = Static123.aClass80_1.method2676(arg1, arg2, arg0, local33);
			@Pc(88) int local88 = local84 & 0x1F;
			@Pc(94) int local94 = local84 >> 6 & 0x3;
			@Pc(100) int local100 = local33 >> 14 & 0x7FFF;
			@Pc(114) Class1_Sub1_Sub3 local114;
			if (arg3 == 0) {
				Static123.aClass80_1.method2679(arg1, arg2, arg0);
				local114 = Static84.method3155(local100);
				if (local114.anInt644 != 0) {
					Static132.aClass69Array3[arg1].method2399(arg2, arg0, local94, local88, local114.aBoolean27);
				}
			}
			if (arg3 == 1) {
				Static123.aClass80_1.method2663(arg1, arg2, arg0);
			}
			if (arg3 == 2) {
				Static123.aClass80_1.method2685(arg1, arg2, arg0);
				local114 = Static84.method3155(local100);
				if (arg2 + local114.anInt656 > 103 || arg0 + local114.anInt656 > 103 || local114.anInt657 + arg2 > 103 || arg0 + local114.anInt657 > 103) {
					return;
				}
				if (local114.anInt644 != 0) {
					Static132.aClass69Array3[arg1].method2408(local114.anInt657, arg0, local94, local114.anInt656, arg2, local114.aBoolean27);
				}
			}
			if (arg3 == 3) {
				Static123.aClass80_1.method2662(arg1, arg2, arg0);
				local114 = Static84.method3155(local100);
				if (local114.anInt644 == 1) {
					Static132.aClass69Array3[arg1].method2406(arg2, arg0);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		local84 = arg1;
		if (arg1 < 3 && (Static12.aByteArrayArrayArray11[1][arg2][arg0] & 0x2) == 2) {
			local84 = arg1 + 1;
		}
		Static153.method2614(arg4, arg6, arg0, arg2, arg5, local84, Static132.aClass69Array3[arg1], arg1, Static123.aClass80_1);
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	public static void method1707() {
		anIntArray321 = null;
		aClass23_990 = null;
		aClass56_9 = null;
		aClass30_35 = null;
		aClass23_992 = null;
		aClass23_991 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIZIZ)Lclient!ig;")
	public static Class30_Sub1 method1709(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class27 local10 = null;
		if (Static120.aClass21_5 != null) {
			local10 = new Class27(arg2, Static120.aClass21_5, Static94.aClass21Array1[arg2], 1000000);
		}
		return new Class30_Sub1(local10, Static87.aClass27_3, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!jg;)Lclient!ed;")
	public static Class23 method1710(@OriginalArg(1) Class1_Sub8 arg0) {
		return Static120.method2103(arg0);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ga;II)Lclient!bh;")
	public static Class1_Sub5 method1711(@OriginalArg(0) Class30 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method1298(arg1);
		return local16 == null ? null : new Class1_Sub5(local16);
	}
}
