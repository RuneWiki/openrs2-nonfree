import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] aClass1_Sub2_Sub5_Sub1Array6;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	public static int anInt1532;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_947 = Static118.method2249("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Lclient!oc;")
	public static Class65 aClass65_943 = aClass65_947;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_944 = Static118.method2249(" weitere Optionen");

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_945 = Static118.method2249("http:)4)4");

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_946 = Static118.method2249("(Z");

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!wd;")
	public static Class97 aClass97_5 = null;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "[I")
	public static final int[] anIntArray146 = new int[256];

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "[I")
	public static final int[] anIntArray147 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_948 = Static118.method2249("Login server offline)3");

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "Lclient!oc;")
	public static Class65 aClass65_949 = aClass65_948;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!bh;ZI)V")
	public static void method1045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (Static201.aClass6_Sub4_Sub1_3 == arg2 || Static101.anInt2533 >= 400) {
			return;
		}
		@Pc(52) Class65 local52;
		if (arg2.anInt601 == 0) {
			local52 = Static109.method2004(new Class65[] { arg2.aClass65_479, Static59.method1055(arg2.anInt606, Static201.aClass6_Sub4_Sub1_3.anInt606), Static201.aClass65_2374, Static166.aClass65_2237, Static118.method2250(arg2.anInt606), Static154.aClass65_2039 });
		} else {
			local52 = Static109.method2004(new Class65[] { arg2.aClass65_479, Static201.aClass65_2374, Static142.aClass65_1986, Static118.method2250(arg2.anInt601), Static154.aClass65_2039 });
		}
		@Pc(101) int local101;
		if (Static145.anInt3438 == 1) {
			Static123.method2348(arg3, Static109.method2004(new Class65[] { Static27.aClass65_569, Static23.aClass65_509, local52 }), (short) 46, (long) arg0, Static14.aClass65_253, arg1);
		} else if (!Static138.aBoolean138) {
			for (local101 = 7; local101 >= 0; local101--) {
				if (Static196.aClass65Array61[local101] != null) {
					@Pc(111) short local111 = 0;
					if (Static64.anInt1666 == 0 && Static196.aClass65Array61[local101].method2489(Static181.aClass65_2429)) {
						if (Static201.aClass6_Sub4_Sub1_3.anInt606 < arg2.anInt606) {
							local111 = 2000;
						}
						if (Static201.aClass6_Sub4_Sub1_3.anInt613 != 0 && arg2.anInt613 != 0) {
							if (arg2.anInt613 == Static201.aClass6_Sub4_Sub1_3.anInt613) {
								local111 = 2000;
							} else {
								local111 = 0;
							}
						}
					} else if (Static61.aBooleanArray9[local101]) {
						local111 = 2000;
					}
					@Pc(169) short local169 = Static133.aShortArray51[local101];
					@Pc(178) short local178 = (short) (local169 + local111);
					Static123.method2348(arg3, Static109.method2004(new Class65[] { Static28.aClass65_594, local52 }), local178, (long) arg0, Static196.aClass65Array61[local101], arg1);
				}
			}
		} else if ((Static50.anInt1407 & 0x8) == 8) {
			Static123.method2348(arg3, Static109.method2004(new Class65[] { Static19.aClass65_481, Static23.aClass65_509, local52 }), (short) 14, (long) arg0, Static83.aClass65_1223, arg1);
		}
		for (local101 = 0; local101 < Static101.anInt2533; local101++) {
			if (Static162.aShortArray52[local101] == 42) {
				Static198.aClass65Array62[local101] = Static109.method2004(new Class65[] { Static28.aClass65_594, local52 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIILclient!wg;Lclient!wg;IIIIJLclient!ac;)V")
	public static void method1047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10, @OriginalArg(11) Class2 arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class88 local6 = new Class88();
		local6.aLong138 = arg10;
		local6.anInt4113 = arg1 * 128 + 64;
		local6.anInt4109 = arg2 * 128 + 64;
		local6.anInt4104 = arg3;
		local6.aClass6_10 = arg4;
		local6.aClass6_11 = arg5;
		local6.anInt4108 = arg6;
		local6.anInt4112 = arg7;
		local6.anInt4105 = arg8;
		local6.anInt4106 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static83.aClass1_Sub7ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static83.aClass1_Sub7ArrayArrayArray1[local46][arg1][arg2] = new Class1_Sub7(local46, arg1, arg2);
			}
		}
		Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass88_1 = local6;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Lclient!oc;")
	public static Class65 method1048(@OriginalArg(0) int arg0) {
		return Static109.method2004(new Class65[] { Static118.method2250(arg0 >> 24 & 0xFF), Static54.aClass65_2168, Static118.method2250(arg0 >> 16 & 0xFF), Static54.aClass65_2168, Static118.method2250(arg0 >> 8 & 0xFF), Static54.aClass65_2168, Static118.method2250(arg0 & 0xFF) });
	}
}
