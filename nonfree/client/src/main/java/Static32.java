import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
	public static int anInt4271;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1679 = Static120.method1824("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1680 = Static120.method1824("blinken1:");

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "Lclient!of;")
	public static final Class70 aClass70_26 = new Class70();

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1682 = Static120.method1824("slide:");

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1681 = aClass80_1682;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "[Lclient!rh;")
	public static final Class82[] aClass82Array11 = new Class82[4];

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1683 = Static120.method1824("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1684 = aClass80_1682;

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1685 = Static120.method1824(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
	public static int anInt4270 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIILclient!dd;Lclient!dd;IIIIJ)V")
	public static void method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4, @OriginalArg(5) Class3_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class92 local6 = new Class92();
		local6.aLong149 = arg10;
		local6.anInt4396 = arg1 * 128 + 64;
		local6.anInt4398 = arg2 * 128 + 64;
		local6.anInt4399 = arg3;
		local6.aClass3_Sub1_Sub5_10 = arg4;
		local6.aClass3_Sub1_Sub5_9 = arg5;
		local6.anInt4404 = arg6;
		local6.anInt4402 = arg7;
		local6.anInt4400 = arg8;
		local6.anInt4394 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static185.aClass3_Sub15ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static185.aClass3_Sub15ArrayArrayArray1[local46][arg1][arg2] = new Class3_Sub15(local46, arg1, arg2);
			}
		}
		Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass92_1 = local6;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)J")
	public static long method3055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass92_1 == null ? 0L : local7.aClass92_1.aLong149;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZBLclient!a;IIBI)V")
	public static void method3058(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) (arg5 + (arg3 << 16));
		@Pc(16) Class3_Sub1_Sub19 local16 = (Class3_Sub1_Sub19) Static95.aClass54_14.method1496(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub19) Static108.aClass54_12.method1496(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub19) Static62.aClass54_6.method1496(local10);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class3_Sub1_Sub19) Static174.aClass54_15.method1496(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class3_Sub1_Sub19();
			local16.aByte9 = arg4;
			local16.aClass1_Sub1_29 = arg1;
			local16.anInt4470 = arg2;
			if (arg0) {
				Static95.aClass54_14.method1494(local10, local16);
				Static44.anInt1015++;
			} else {
				Static143.aClass58_2.method1571(local16);
				Static62.aClass54_6.method1494(local10, local16);
				Static94.anInt2012++;
			}
		} else if (arg0) {
			local16.method3150();
			Static95.aClass54_14.method1494(local10, local16);
			Static44.anInt1015++;
			Static94.anInt2012--;
		}
	}
}
