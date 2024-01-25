import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_9 = new Class225(10, 2, 2, 0);

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)I")
	public static int method3784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(III)V")
	public static void method3788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass30_Sub4_2 != null) {
			local7.aClass30_Sub4_2 = null;
		}
		if (local7.aClass30_Sub4_1 != null) {
			local7.aClass30_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public static void method3790(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static120.aClass37ArrayArrayArray1 = Static141.aClass37ArrayArrayArray2;
			Static51.aClass215Array6 = Static67.aClass215Array2;
		} else {
			Static120.aClass37ArrayArrayArray1 = Static284.aClass37ArrayArrayArray3;
			Static51.aClass215Array6 = Static155.aClass215Array5;
		}
		Static36.anInt8450 = Static120.aClass37ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V")
	public static void method3791() {
		Static332.method5312(Static45.aClass77_7);
		for (@Pc(22) Class12_Sub34 local22 = (Class12_Sub34) Static456.aClass68_67.method1923(); local22 != null; local22 = (Class12_Sub34) Static456.aClass68_67.method1920()) {
			if (!local22.method7970()) {
				local22 = (Class12_Sub34) Static456.aClass68_67.method1923();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt5829 == 0) {
				Static102.method2109(true, local22, true);
			}
		}
		if (Static188.aClass198_5 != null) {
			Static331.method5282(Static188.aClass198_5);
			Static188.aClass198_5 = null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)Z")
	public static boolean method3792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static122.method2532(arg1, arg0) || Static43.method849(arg1, arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Lclient!fi;")
	public static Class12_Sub4_Sub7 method3793() {
		return Static2.aClass12_Sub4_Sub7_2;
	}
}
