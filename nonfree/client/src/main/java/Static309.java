import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Lclient!rg;")
	public static Class177 aClass177_21;

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "Ljava/lang/String;")
	public static final String aString236 = "wave2:";

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
	public static int anInt5945 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V")
	private static void method5202(@OriginalArg(0) int arg0) {
		Static117.anIntArray286 = new int[arg0];
		Static37.anIntArray110 = new int[arg0];
		Static210.anIntArray500 = new int[arg0];
		Static82.anIntArray192 = new int[arg0];
		Static314.anIntArray759 = new int[arg0];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!gp;IZBLclient!gp;)I")
	public static int method5203(@OriginalArg(0) Class74_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class74_Sub1 arg3) {
		@Pc(14) int local14;
		@Pc(17) int local17;
		if (arg1 == 1) {
			local14 = arg3.anInt2260;
			local17 = arg0.anInt2260;
			if (!arg2) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local17 == -1) {
					local17 = 2001;
				}
			}
			return local14 - local17;
		} else if (arg1 == 2) {
			return Static87.method1675(Static257.anInt5015, arg0.method2070().aString216, arg3.method2070().aString216);
		} else if (arg1 == 3) {
			if (arg3.aString92.equals("-")) {
				if (arg0.aString92.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString92.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static87.method1675(Static257.anInt5015, arg0.aString92, arg3.aString92);
			}
		} else if (arg1 == 4) {
			if (arg3.method2062()) {
				return arg0.method2062() ? 0 : 1;
			} else if (arg0.method2062()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg3.method2061()) {
				return arg0.method2061() ? 0 : 1;
			} else if (arg0.method2061()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg3.method2063()) {
				return arg0.method2063() ? 0 : 1;
			} else if (arg0.method2063()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg3.method2065()) {
				return arg0.method2065() ? 0 : 1;
			} else if (arg0.method2065()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local14 = arg3.anInt2266;
			local17 = arg0.anInt2266;
			if (arg2) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local17 == 1000) {
					local17 = -1;
				}
			} else {
				if (local17 == -1) {
					local17 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local14 - local17;
		} else {
			return arg3.anInt2267 - arg0.anInt2267;
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
	public static void method5204(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub2 local10 = Static42.method1000(5, arg0);
		local10.method167();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
	public static void method5205(@OriginalArg(1) int arg0) {
		@Pc(1) Class140 local1 = Static259.aClass140_132;
		synchronized (Static259.aClass140_132) {
			Static259.aClass140_132.method3819();
			Static259.aClass140_132 = new Class140(arg0);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZIZZI)V")
	public static void method5207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= arg5) {
			return;
		}
		@Pc(18) int local18 = (arg5 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) Class74_Sub1 local24 = Static296.aClass74_Sub1Array2[local18];
		Static296.aClass74_Sub1Array2[local18] = Static296.aClass74_Sub1Array2[arg5];
		Static296.aClass74_Sub1Array2[arg5] = local24;
		for (@Pc(36) int local36 = arg0; local36 < arg5; local36++) {
			if (Static2.method3249(Static296.aClass74_Sub1Array2[local36], local24, arg1, arg3, arg2, arg4) <= 0) {
				@Pc(56) Class74_Sub1 local56 = Static296.aClass74_Sub1Array2[local36];
				Static296.aClass74_Sub1Array2[local36] = Static296.aClass74_Sub1Array2[local20];
				Static296.aClass74_Sub1Array2[local20++] = local56;
			}
		}
		Static296.aClass74_Sub1Array2[arg5] = Static296.aClass74_Sub1Array2[local20];
		Static296.aClass74_Sub1Array2[local20] = local24;
		method5207(arg0, arg1, arg2, arg3, arg4, local20 - 1);
		method5207(local20 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
	public static void method5208() {
		for (@Pc(7) int local7 = 0; local7 < Static152.aClass186ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static152.aClass186ArrayArray1[local7].length; local11++) {
				Static152.aClass186ArrayArray1[local7][local11] = Static95.aClass186_1;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
	public static void method5209() {
		@Pc(8) int local8 = Static269.method4691();
		if (local8 == 0) {
			Static186.aByteArrayArrayArray8 = null;
			method5202(0);
		} else if (local8 == 1) {
			Static305.method5151((byte) 0);
			method5202(512);
			if (Static183.aByteArrayArrayArray7 != null) {
				Static279.method4820();
			}
		} else {
			Static305.method5151((byte) (Static108.anInt2197 - 4 & 0xFF));
			method5202(2);
		}
		Static129.anInt2515 = Static285.anInt5511;
	}
}
