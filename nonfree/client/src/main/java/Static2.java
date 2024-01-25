import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "I")
	public static int anInt25 = -1;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "[I")
	public static final int[] anIntArray1 = new int[8];

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILclient!oa;Z)Lclient!iaa;")
	public static Class139 method57(@OriginalArg(0) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static540.anIntArray254 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static540.anIntArray254.length; local15++) {
				if (Static540.anIntArray254[local15] == arg0) {
					return Static510.aClass139Array1[local15];
				}
			}
		}
		@Pc(42) Class139 local42 = (Class139) Static100.aClass136_22.method3473((long) arg0);
		if (local42 != null) {
			if (arg2 && local42.aClass327_5 == null) {
				@Pc(63) Class327 local63 = Static18.method427(arg0, Static1.aClass251_127);
				if (local63 == null) {
					return null;
				}
				local42.aClass327_5 = local63;
			}
			return local42;
		}
		@Pc(76) Class140[] local76 = Static604.method3618(Static400.aClass251_96, arg0);
		if (local76 == null) {
			return null;
		}
		@Pc(85) Class327 local85 = Static18.method427(arg0, Static1.aClass251_127);
		if (local85 == null) {
			return null;
		}
		if (arg2) {
			local42 = new Class139(arg1.method6854(local85, local76), local85);
		} else {
			local42 = new Class139(arg1.method6854(local85, local76));
		}
		Static100.aClass136_22.method3482((long) arg0, local42);
		return local42;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method59(@OriginalArg(0) String arg0) {
		if (Class33.aString36.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class33.aString36.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class33.aString36.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZIII)I")
	public static int method65(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V")
	public static void method66(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static468.anInt8036 != -1) {
				Static438.method6243(Static468.anInt8036);
			}
			for (@Pc(15) Class6_Sub11 local15 = (Class6_Sub11) Static224.aClass128_23.method3265(); local15 != null; local15 = (Class6_Sub11) Static224.aClass128_23.method3273()) {
				if (!local15.method7803()) {
					local15 = (Class6_Sub11) Static224.aClass128_23.method3265();
					if (local15 == null) {
						break;
					}
				}
				Static145.method2815(false, true, local15);
			}
			Static468.anInt8036 = -1;
			Static224.aClass128_23 = new Class128(8);
			Static163.method2979();
			Static468.anInt8036 = Static532.anInt8836;
			Static396.method7542(false);
			Static415.method7746();
			Static446.method6318(Static468.anInt8036);
		}
		Static301.aBoolean392 = false;
		Static528.aString99 = "";
		Static216.aString30 = "";
		Static497.method6753();
		Static245.anInt4901 = -1;
		Static57.method1223(Static375.anInt6611);
		Static328.aClass4_Sub1_Sub1_Sub2_2 = new Class4_Sub1_Sub1_Sub2();
		Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] = Static473.anInt8075 / 2;
		Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 = Static165.anInt6749 * 512 / 2;
		Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 = Static473.anInt8075 * 512 / 2;
		Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0] = Static165.anInt6749 / 2;
		Static322.anInt5904 = 0;
		Static371.anInt6572 = 0;
		if (Static346.anInt6215 == 2) {
			Static371.anInt6572 = Static526.anInt8805 << 9;
			Static322.anInt5904 = Static109.anInt2112 << 9;
		} else {
			Static542.method7334();
		}
		Static425.method6109();
	}
}
