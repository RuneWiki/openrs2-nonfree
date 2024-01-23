import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "Lclient!s;")
	public static Class100 aClass100_102;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1650 = Static64.method1101("red:");

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1655 = Static64.method1101("cyan:");

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1651 = aClass51_1655;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	public static int anInt4800 = 3;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1652 = aClass51_1650;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1653 = Static64.method1101("<col=ffffff>");

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1654 = aClass51_1655;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1656 = aClass51_1650;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1657 = Static64.method1101("null");

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
	public static void method3753() {
		Static50.anInt1202++;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public static void method3754(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static54.method933(arg0)) {
			return;
		}
		@Pc(20) Class71[] local20 = Static64.aClass71ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(28) Class71 local28 = local20[local22];
			if (local28.anObjectArray15 != null) {
				@Pc(35) Class1_Sub21 local35 = new Class1_Sub21();
				local35.anObjectArray32 = local28.anObjectArray15;
				local35.aClass71_25 = local28;
				Static71.method1260(local35, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public static void method3755() {
		@Pc(1) Object local1 = Static197.anObject6;
		synchronized (Static197.anObject6) {
			if (Static190.anInt4106 == 0) {
				Static51.aClass72_3.method2246(new Class68(), 5);
			}
			Static190.anInt4106 = 600;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
	public static void method3757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static150.anInt3286 = arg1 * Static87.anInt2017 / arg3;
		Static87.anInt2015 = arg2 * Static3.anInt75 / arg0;
		Static155.anInt3422 = -1;
		Static41.anInt977 = -1;
		Static220.method3635();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZ[Lclient!ia;[S)V")
	public static void method3759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class51[] arg2, @OriginalArg(4) short[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(20) int local20 = (arg1 + arg0) / 2;
		@Pc(24) Class51 local24 = arg2[local20];
		arg2[local20] = arg2[arg0];
		arg2[arg0] = local24;
		@Pc(38) short local38 = arg3[local20];
		arg3[local20] = arg3[arg0];
		@Pc(46) int local46 = arg1;
		arg3[arg0] = local38;
		for (@Pc(52) int local52 = arg1; local52 < arg0; local52++) {
			if (local24 == null || arg2[local52] != null && (local52 & 0x1) > arg2[local52].method1411(local24)) {
				@Pc(78) Class51 local78 = arg2[local52];
				arg2[local52] = arg2[local46];
				arg2[local46] = local78;
				@Pc(92) short local92 = arg3[local52];
				arg3[local52] = arg3[local46];
				arg3[local46++] = local92;
			}
		}
		arg2[arg0] = arg2[local46];
		arg2[local46] = local24;
		arg3[arg0] = arg3[local46];
		arg3[local46] = local38;
		method3759(local46 - 1, arg1, arg2, arg3);
		method3759(arg0, local46 + 1, arg2, arg3);
	}
}
