import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
	public static int anInt1947;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!rf;")
	public static Class70 aClass70_605 = Static49.method1293("ams");

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!ge;")
	public static Class30 aClass30_8 = new Class30(32);

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!rf;")
	private static Class70 aClass70_606 = Static49.method1293("Sorry invited players only)3");

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public static int anInt1952 = 0;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!rf;")
	public static Class70 aClass70_607 = aClass70_606;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "Lclient!rf;")
	private static Class70 aClass70_612 = Static49.method1293("Loading title screen )2 ");

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Lclient!rf;")
	public static Class70 aClass70_608 = aClass70_612;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "[I")
	public static int[] anIntArray191 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Lclient!rf;")
	public static Class70 aClass70_609 = null;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!rf;")
	public static Class70 aClass70_610 = Static49.method1293("Welt");

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
	public static int anInt1956 = 0;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "Lclient!rf;")
	public static Class70 aClass70_611 = Static49.method1293("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "Lclient!rf;")
	public static Class70 aClass70_613 = Static49.method1293("::clientdrop");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public static void method1468(@OriginalArg(0) int arg0) {
		if (Static160.anInt4192 == 0) {
			Static45.aClass1_Sub8_Sub2_1.method2153(arg0);
		} else {
			Static184.anInt4567 = arg0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method1469() {
		aClass70_613 = null;
		anIntArray191 = null;
		aClass70_609 = null;
		aClass70_605 = null;
		aClass70_611 = null;
		aClass30_8 = null;
		aClass70_610 = null;
		aClass70_606 = null;
		aByteArrayArray4 = null;
		aClass70_612 = null;
		aClass70_608 = null;
		aClass70_607 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!pf;I)V")
	public static void method1471(@OriginalArg(0) Class1_Sub1_Sub1_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static57.anIntArray187.length; local7++) {
			Static57.anIntArray187[local7] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) ((double) 256 * 128.0D * Math.random());
			Static57.anIntArray187[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(71) int local71;
		for (local32 = 0; local32 < 20; local32++) {
			for (local59 = 1; local59 < 255; local59++) {
				for (local63 = 1; local63 < 127; local63++) {
					local71 = local63 + (local59 << 7);
					Static12.anIntArray27[local71] = (Static57.anIntArray187[local71 - 128] + Static57.anIntArray187[local71 + 1] + Static57.anIntArray187[local71 - 1] + Static57.anIntArray187[local71 + 128]) / 4;
				}
			}
			@Pc(115) int[] local115 = Static57.anIntArray187;
			Static57.anIntArray187 = Static12.anIntArray27;
			Static12.anIntArray27 = local115;
		}
		if (arg0 == null) {
			return;
		}
		local59 = 0;
		for (local63 = 0; local63 < arg0.anInt3507; local63++) {
			for (local71 = 0; local71 < arg0.anInt3504; local71++) {
				if (arg0.aByteArray42[local59++] != 0) {
					@Pc(150) int local150 = local71 + arg0.anInt3506 + 16;
					@Pc(157) int local157 = arg0.anInt3502 + local63 + 16;
					@Pc(163) int local163 = local150 + (local157 << 7);
					Static57.anIntArray187[local163] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (Static79.aBoolean91 && arg5 != Static56.anInt1784) {
			return;
		}
		@Pc(23) long local23 = 0L;
		if (arg1 == 0) {
			local23 = Static5.method186(arg5, arg2, arg0);
		}
		if (arg1 == 1) {
			local23 = Static69.method1573(arg5, arg2, arg0);
		}
		if (arg1 == 2) {
			local23 = Static8.method248(arg5, arg2, arg0);
		}
		if (arg1 == 3) {
			local23 = Static44.method1099(arg5, arg2, arg0);
		}
		if (local23 != 0L) {
			@Pc(74) int local74 = (int) (local23 >>> 32) & Integer.MAX_VALUE;
			@Pc(81) int local81 = (int) local23 >> 14 & 0x1F;
			@Pc(88) int local88 = (int) local23 >> 20 & 0x3;
			@Pc(101) Class1_Sub1_Sub7 local101;
			if (arg1 == 0) {
				Static149.method3065(arg5, arg2, arg0);
				local101 = Static176.method3433(local74);
				if (local101.anInt1842 != 0) {
					Static96.aClass59Array1[arg5].method2464(arg0, local88, local101.aBoolean67, local81, arg2);
				}
			}
			if (arg1 == 1) {
				Static38.method977(arg5, arg2, arg0);
			}
			if (arg1 == 2) {
				Static108.method2268(arg5, arg2, arg0);
				local101 = Static176.method3433(local74);
				if (arg2 + local101.anInt1818 > 103 || arg0 + local101.anInt1818 > 103 || arg2 + local101.anInt1813 > 103 || arg0 + local101.anInt1813 > 103) {
					return;
				}
				if (local101.anInt1842 != 0) {
					Static96.aClass59Array1[arg5].method2463(local101.anInt1813, local101.aBoolean67, local101.anInt1818, arg0, local88, arg2);
				}
			}
			if (arg1 == 3) {
				Static178.method3441(arg5, arg2, arg0);
				local101 = Static176.method3433(local74);
				if (local101.anInt1842 == 1) {
					Static96.aClass59Array1[arg5].method2465(arg2, arg0);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		@Pc(214) int local214 = arg5;
		if (arg5 < 3 && (Static20.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 2) {
			local214 = arg5 + 1;
		}
		Static67.method1548(local214, arg6, arg4, arg0, arg5, Static96.aClass59Array1[arg5], arg2, arg3);
	}
}
