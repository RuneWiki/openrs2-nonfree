import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	public static int anInt3764;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "Lclient!hh;")
	public static Class109 aClass109_55;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "[[B")
	public static final byte[][] aByteArrayArray16 = new byte[1000][];

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[128][128];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg5) {
			Static26.method379(arg1, arg6, arg4, arg0, arg2, arg3);
		} else if (arg4 - arg1 >= Static47.anInt762 && arg4 + arg1 <= Static60.anInt1086 && arg3 - arg5 >= Static357.anInt6537 && arg3 + arg5 <= Static85.anInt1517) {
			Static141.method2265(arg5, arg1, arg2, arg6, arg3, arg0, arg4);
		} else {
			Static309.method4239(arg2, arg1, arg0, arg3, arg6, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z")
	public static boolean method3169() {
		return Static25.anInt424 == 0 ? Static398.aClass1_Sub5_Sub4_4.method4449() : true;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZLjava/lang/String;Lclient!oa;)V")
	public static void method3170(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class4 arg2) {
		@Pc(28) int local28 = Static64.aClass62_3.method1153(null, arg1, 250);
		@Pc(37) int local37 = Static64.aClass62_3.method1149(250, arg1, null) * 13;
		Static447.aClass121_11.NA(6, 6, local28 + 4 + 4, 4 + 4 + local37, -16777216, 0);
		Static447.aClass121_11.method4639(6, 6, local28 + 4 + 4, local37 + 4 + 4, -1, 0);
		arg2.method5843(null, local28, local37, null, -1, 0, null, arg1, 0, 10, 1, -1, 10);
		Static176.method2836(6, 6, local28 + 4 + 4, local37 + 8);
		if (arg0) {
			Static447.aClass121_11.method4602();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
	public static void method3171() {
		Static45.aClass78Array3 = null;
		Static283.aClass78Array7 = null;
		Static407.aClass78Array13 = null;
		Static418.aClass78_23 = null;
		Static343.aClass78Array10 = null;
		Static449.aClass78Array15 = null;
		Static312.aClass78Array9 = null;
		Static228.aClass78Array5 = null;
		Static201.aClass78Array4 = null;
		Static199.aClass4_4 = null;
		Static397.aClass78Array12 = null;
		Static365.aClass78Array11 = null;
		Static237.aClass4_5 = null;
		Static209.aClass4_6 = null;
		Static55.aClass78_6 = null;
		Static298.aClass78Array8 = null;
		Static272.aClass78Array6 = null;
		Static33.aClass78Array2 = null;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)I")
	public static int method3172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local15 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local15;
		} else {
			return local15;
		}
	}
}
