import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!te", name = "E", descriptor = "Lclient!em;")
	public static final Class83 aClass83_182 = new Class83(87, 3);

	@OriginalMember(owner = "client!te", name = "K", descriptor = "I")
	public static int anInt8721 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
	public static void method7030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static185.method3004(local35, false, true);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
	public static void method7031(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static165.anInt3165 != -1) {
				Static257.method3746(Static165.anInt3165);
			}
			for (@Pc(21) Class1_Sub38 local21 = (Class1_Sub38) Static148.aClass91_6.method2278(); local21 != null; local21 = (Class1_Sub38) Static148.aClass91_6.method2276()) {
				if (!local21.method7907()) {
					local21 = (Class1_Sub38) Static148.aClass91_6.method2278();
					if (local21 == null) {
						break;
					}
				}
				Static336.method5001(true, local21, false);
			}
			Static165.anInt3165 = -1;
			Static148.aClass91_6 = new Class91(8);
			Static570.method7676();
			Static165.anInt3165 = Static80.anInt1541;
			Static209.method7201(false);
			Static506.method7088();
			Static451.method6308(Static165.anInt3165);
		}
		Static447.aBoolean596 = false;
		Static130.aString22 = "";
		Static251.aString51 = "";
		Static202.method3100();
		Static422.anInt7430 = -1;
		Static399.method5767(Static533.anInt8981);
		Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 = new Class11_Sub1_Sub1_Sub3_Sub1();
		Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 = Static458.anInt9736 * 512 / 2;
		Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0] = Static458.anInt9736 / 2;
		Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 = Static378.anInt6747 * 512 / 2;
		Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0] = Static378.anInt6747 / 2;
		Static78.anInt1534 = 0;
		Static393.anInt6978 = 0;
		if (Static358.anInt9363 == 2) {
			Static78.anInt1534 = Static123.anInt2518 << 9;
			Static393.anInt6978 = Static375.anInt6733 << 9;
		} else {
			Static527.method7267();
		}
		Static585.method7837();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)I")
	public static int method7032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg0;
			arg0 = arg5;
			arg5 = local12;
		}
		@Pc(20) int local20 = arg1 & 0x3;
		if (local20 == 0) {
			return arg2;
		} else if (local20 == 1) {
			return arg4;
		} else if (local20 == 2) {
			return 1 + 7 - arg0 - arg2;
		} else {
			return 7 + 1 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IB)V")
	public static void method7033(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg0, 3);
		local8.method4835();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II[ILclient!lj;[II)Lclient!mfa;")
	public static Class181_Sub2 method7034(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class78_Sub3 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg4; local12++) {
			@Pc(22) int local22 = arg3[local12] + arg0 * local12;
			for (@Pc(24) int local24 = 0; local24 < arg1[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class181_Sub2(arg2, arg0, arg4, local10);
	}
}
