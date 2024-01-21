import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "I")
	public static int anInt363;

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
	public static int anInt367;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_117 = Static187.method3089("white:");

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_122 = Static187.method3089("Loading sprites )2 ");

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_118 = aClass92_122;

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_119 = aClass92_117;

	@OriginalMember(owner = "client!bb", name = "pb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_120 = Static187.method3089("mapdots");

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_121 = aClass92_117;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIBLjava/awt/Component;)Lclient!wb;")
	public static Class22 method227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class22_Sub1");
			@Pc(10) Class22 local10 = (Class22) local6.getDeclaredConstructor().newInstance();
			local10.method1662(arg1, arg2, arg0);
			return local10;
		} catch (@Pc(31) Throwable local31) {
			@Pc(35) Class22_Sub2 local35 = new Class22_Sub2();
			local35.method1662(arg1, arg2, arg0);
			return local35;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BJ)V")
	public static void method228(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static78.anInt1731 >= 100 && Static95.anInt2004 != 1 || Static78.anInt1731 >= 200) {
			Static145.method2151(Static208.aClass92_458, Static26.aClass92_268, 0);
			return;
		}
		@Pc(35) Class92 local35 = Static179.method2937(arg0).method3198();
		for (@Pc(37) int local37 = 0; local37 < Static78.anInt1731; local37++) {
			if (arg0 == Static106.aLongArray7[local37]) {
				Static145.method2151(Static208.method787(new Class92[] { local35, Static123.aClass92_1217 }), Static26.aClass92_268, 0);
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static103.anInt2229; local70++) {
			if (arg0 == Static57.aLongArray3[local70]) {
				Static145.method2151(Static208.method787(new Class92[] { Static129.aClass92_1255, local35, Static153.aClass92_1520 }), Static26.aClass92_268, 0);
				return;
			}
		}
		if (local35.method3243(Static15.aClass8_Sub3_Sub1_1.aClass92_374)) {
			Static145.method2151(Static97.aClass92_916, Static26.aClass92_268, 0);
			return;
		}
		Static27.aClass92Array5[Static78.anInt1731] = local35;
		Static106.aLongArray7[Static78.anInt1731] = arg0;
		Static33.anIntArray61[Static78.anInt1731] = 0;
		Static109.aClass92Array16[Static78.anInt1731] = Static26.aClass92_268;
		Static168.anIntArray306[Static78.anInt1731] = 0;
		Static78.anInt1731++;
		Static61.anInt1468 = Static25.anInt588;
		Static38.aClass1_Sub14_Sub1_3.method3067(143);
		Static38.aClass1_Sub14_Sub1_3.method3016(arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ka;IIIIIII)V")
	public static void method231(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(32) int local32;
		if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local32 = arg0.method3010();
				if (local32 == 0) {
					break;
				}
				if (local32 == 1) {
					arg0.method3010();
					break;
				}
				if (local32 <= 49) {
					arg0.method3010();
				}
			}
			return;
		}
		Static146.aByteArrayArrayArray33[arg6][arg2][arg3] = 0;
		while (true) {
			local32 = arg0.method3010();
			if (local32 == 0) {
				if (arg6 == 0) {
					Static156.anIntArrayArrayArray6[0][arg2][arg3] = -Static23.method444(arg5 + arg3 + 556238, arg4 + 932731 + arg2) * 8;
				} else {
					Static156.anIntArrayArrayArray6[arg6][arg2][arg3] = Static156.anIntArrayArrayArray6[arg6 - 1][arg2][arg3] - 240;
				}
				break;
			}
			if (local32 == 1) {
				@Pc(89) int local89 = arg0.method3010();
				if (local89 == 1) {
					local89 = 0;
				}
				if (arg6 == 0) {
					Static156.anIntArrayArrayArray6[0][arg2][arg3] = -local89 * 8;
				} else {
					Static156.anIntArrayArrayArray6[arg6][arg2][arg3] = Static156.anIntArrayArrayArray6[arg6 - 1][arg2][arg3] - local89 * 8;
				}
				break;
			}
			if (local32 <= 49) {
				Static87.aByteArrayArrayArray20[arg6][arg2][arg3] = arg0.method3009();
				Static183.aByteArrayArrayArray46[arg6][arg2][arg3] = (byte) ((local32 - 2) / 4);
				Static103.aByteArrayArrayArray26[arg6][arg2][arg3] = (byte) (arg1 + local32 - 2 & 0x3);
			} else if (local32 <= 81) {
				Static146.aByteArrayArrayArray33[arg6][arg2][arg3] = (byte) (local32 - 49);
			} else {
				Static191.aByteArrayArrayArray50[arg6][arg2][arg3] = (byte) (local32 - 81);
			}
		}
	}
}
