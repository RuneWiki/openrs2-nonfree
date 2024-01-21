import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
	public static int anInt1044;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!mb;")
	private static Class45 aClass45_484 = Static63.method1251("scroll:");

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "Lclient!nd;")
	public static Class49 aClass49_2 = new Class49();

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "Lclient!mb;")
	public static Class45 aClass45_485 = Static63.method1251("huffman");

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "Lclient!mb;")
	public static Class45 aClass45_486 = aClass45_484;

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
	public static int anInt1025 = 0;

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	public static int anInt1036 = -1;

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "Lclient!mb;")
	public static Class45 aClass45_487 = Static63.method1251("title_mute");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public static void method732() {
		for (@Pc(6) Class5_Sub2_Sub4_Sub6 local6 = (Class5_Sub2_Sub4_Sub6) Static16.aClass10_3.method230(); local6 != null; local6 = (Class5_Sub2_Sub4_Sub6) Static16.aClass10_3.method233()) {
			if (local6.anInt2063 != Static8.anInt262 || local6.aBoolean98) {
				local6.method2144();
			} else if (Static3.anInt94 >= local6.anInt2079) {
				local6.method1384(Static90.anInt2533);
				if (local6.aBoolean98) {
					local6.method2144();
				} else {
					Static110.aClass34_1.method923(local6.anInt2063, local6.anInt2064, local6.anInt2073, local6.anInt2061, 60, local6, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIB)Z")
	public static boolean method740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIILclient!hb;II)V")
	public static void method747(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5_Sub9 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(33) int local33;
		if (arg5 < 0 || arg5 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local33 = arg4.method1408();
				if (local33 == 0) {
					return;
				}
				if (local33 == 1) {
					arg4.method1408();
					return;
				}
				if (local33 <= 49) {
					arg4.method1408();
				}
			}
			return;
		}
		Static48.aByteArrayArrayArray3[arg0][arg5][arg1] = 0;
		while (true) {
			local33 = arg4.method1408();
			if (local33 == 0) {
				if (arg0 == 0) {
					Static40.anIntArrayArrayArray2[0][arg5][arg1] = -Static99.method1820(arg5 + arg2 + 932731, arg1 + 556238 - -arg6) * 8;
					return;
				} else {
					Static40.anIntArrayArrayArray2[arg0][arg5][arg1] = Static40.anIntArrayArrayArray2[arg0 - 1][arg5][arg1] - 240;
					return;
				}
			}
			if (local33 == 1) {
				@Pc(129) int local129 = arg4.method1408();
				if (local129 == 1) {
					local129 = 0;
				}
				if (arg0 == 0) {
					Static40.anIntArrayArrayArray2[0][arg5][arg1] = -local129 * 8;
					return;
				}
				Static40.anIntArrayArrayArray2[arg0][arg5][arg1] = Static40.anIntArrayArrayArray2[arg0 - 1][arg5][arg1] - local129 * 8;
				return;
			}
			if (local33 <= 49) {
				Static88.aByteArrayArrayArray6[arg0][arg5][arg1] = arg4.method1447();
				Static32.aByteArrayArrayArray2[arg0][arg5][arg1] = (byte) ((local33 - 2) / 4);
				Static78.aByteArrayArrayArray5[arg0][arg5][arg1] = (byte) (local33 + arg3 - 2 & 0x3);
			} else if (local33 <= 81) {
				Static48.aByteArrayArrayArray3[arg0][arg5][arg1] = (byte) (local33 - 49);
			} else {
				Static112.aByteArrayArrayArray8[arg0][arg5][arg1] = (byte) (local33 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!sd;Lclient!sd;Lclient!sd;)V")
	public static void method751(@OriginalArg(1) Class29 arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) Class29 arg2) {
		Static105.aClass29_67 = arg2;
		Static57.aClass29_40 = arg0;
		Static114.aClass29_78 = arg1;
		Static19.aClass5_Sub2_Sub8ArrayArray1 = new Class5_Sub2_Sub8[Static57.aClass29_40.method738()][];
		Static53.aBooleanArray21 = new boolean[Static57.aClass29_40.method738()];
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(IB)Lclient!vb;")
	public static Class5_Sub2_Sub16 method752(@OriginalArg(0) int arg0) {
		@Pc(6) Class5_Sub2_Sub16 local6 = (Class5_Sub2_Sub16) Static109.aClass67_25.method1823((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static54.aClass29_37.method733(arg0, 14);
		local6 = new Class5_Sub2_Sub16();
		if (local25 != null) {
			local6.method2084(new Class5_Sub9(local25));
		}
		Static109.aClass67_25.method1818(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)I")
	public static int method754() {
		return Static48.anInt1589++;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	public static void method755() {
		if (Static11.anInt365 == 2) {
			Static64.method1260(Static61.anInt1810 * 2, Static48.anInt1592 + (Static110.anInt2891 - Static6.anInt162 << 7), (-Static78.anInt2210 + Static56.anInt1697 << 7) - -Static97.anInt2643);
			if (Static16.anInt504 > -1 && Static3.anInt94 % 20 < 10) {
				Static80.aClass5_Sub2_Sub6_Sub3Array6[0].method1781(Static16.anInt504 - 12, Static23.anInt776 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)Z")
	public static boolean method762(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	public static void method763() {
		aClass45_484 = null;
		aClass45_485 = null;
		aClass45_486 = null;
		aClass49_2 = null;
		aClass45_487 = null;
	}
}
