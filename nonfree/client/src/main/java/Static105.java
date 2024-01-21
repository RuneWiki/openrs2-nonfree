import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array10;

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "Lclient!h;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_1483 = Static72.method1077("hitmarks");

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Z")
	public static boolean aBoolean97 = true;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "Lclient!u;")
	private static Class74 aClass74_1486 = Static72.method1077("Report abuse");

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_1484 = aClass74_1486;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "Lclient!u;")
	private static Class74 aClass74_1485 = Static72.method1077("Take");

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
	public static final int anInt2316 = 0;

	@OriginalMember(owner = "client!sa", name = "J", descriptor = "Lclient!u;")
	public static Class74 aClass74_1487 = Static72.method1077("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "Lclient!u;")
	private static Class74 aClass74_1490 = Static72.method1077("Enter name:");

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "Lclient!u;")
	public static Class74 aClass74_1488 = aClass74_1490;

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
	public static int anInt2321 = 0;

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "Lclient!u;")
	public static Class74 aClass74_1489 = aClass74_1485;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method1591(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	public static void method1592() {
		aClass2_Sub2_Sub1_Sub2Array10 = null;
		aClass74_1490 = null;
		aClass74_1484 = null;
		aClass74_1483 = null;
		aClass31_1 = null;
		aClass74_1489 = null;
		aClass74_1488 = null;
		aClass74_1486 = null;
		aClass74_1487 = null;
		aClass74_1485 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ[BIIIII[Lclient!ob;I)V")
	public static void method1593(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class55[] arg7, @OriginalArg(9) int arg8) {
		for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
			for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
				if (arg8 + local21 > 0 && arg8 + local21 < 103 && arg2 + local25 > 0 && arg2 + local25 < 103) {
					arg7[arg5].anIntArrayArray18[local21 + arg8][local25 + arg2] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(91) Class2_Sub10 local91 = new Class2_Sub10(arg1);
		for (@Pc(93) int local93 = 0; local93 < 4; local93++) {
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
					if (arg0 == local93 && arg6 <= local97 && arg6 + 8 > local97 && arg3 <= local101 && arg3 + 8 > local101) {
						Static126.method1925(0, Static4.method28(local101 & 0x7, arg4, local97 & 0x7) + arg2, arg4, 0, arg5, local91, arg8 + Static41.method667(arg4, local97 & 0x7, local101 & 0x7));
					} else {
						Static126.method1925(0, -1, 0, 0, 0, local91, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIILclient!g;Lclient!g;)Lclient!ua;")
	public static Class2_Sub2_Sub16 method1595(@OriginalArg(1) int arg0, @OriginalArg(3) Class26 arg1, @OriginalArg(4) Class26 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) int[] local17 = arg2.method1352(arg0);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(29) byte[] local29 = arg2.method1368(arg0, local17[local19]);
			if (local29 == null) {
				local7 = false;
			} else {
				@Pc(49) int local49 = (local29[0] & 0xFF) << 8 | local29[1] & 0xFF;
				@Pc(69) byte[] local69 = arg1.method1368(local49, 0);
				if (local69 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub2_Sub16(arg2, arg1, arg0, false);
		} catch (@Pc(95) Exception local95) {
			return null;
		}
	}
}
