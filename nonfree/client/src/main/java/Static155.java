import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "Lclient!lc;")
	public static Class98 aClass98_92;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!lc;B)V")
	public static void method2470(@OriginalArg(0) Class98 arg0) {
		Static207.aClass98_126 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method2471(@OriginalArg(0) String[] arg0) {
		@Pc(10) String[] local10 = new String[5];
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			local10[local12] = local12 + ": ";
			if (arg0 != null && arg0[local12] != null) {
				local10[local12] = local10[local12] + arg0[local12];
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lclient!mf;")
	public static Class108 method2472(@OriginalArg(0) int arg0) {
		@Pc(6) Class108 local6 = (Class108) Static231.aClass33_34.method841((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static63.aClass98_35.method2396(arg0, 34);
		local6 = new Class108();
		if (local29 != null) {
			local6.method2596(arg0, new Class4_Sub17(local29));
		}
		Static231.aClass33_34.method845(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	public static void method2473() {
		aClass98_92 = null;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V")
	public static void method2474(@OriginalArg(1) boolean arg0) {
		Static81.method3275();
		if (Static267.anInt3573 != 30 && Static267.anInt3573 != 25) {
			return;
		}
		Static89.anInt1838++;
		if (Static89.anInt1838 < 50 && !arg0) {
			return;
		}
		Static89.anInt1838 = 0;
		if (!Static126.aBoolean178 && Static259.aClass158_3 != null) {
			Static142.aClass4_Sub17_Sub1_3.method1905(6);
			try {
				Static259.aClass158_3.method3780(Static142.aClass4_Sub17_Sub1_3.aByteArray30, Static142.aClass4_Sub17_Sub1_3.anInt2400);
				Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
			} catch (@Pc(60) IOException local60) {
				Static126.aBoolean178 = true;
			}
		}
		Static81.method3275();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!wh;IZ)V")
	public static void method2475(@OriginalArg(0) Class4_Sub2_Sub12 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14;
		if (Static178.aBoolean216 || arg1) {
			local14 = Static216.anInt4287;
			@Pc(20) int local20 = local14 * 956 / 503;
			Static222.aClass4_Sub2_Sub1_7.method3462((Static111.anInt2450 - local20) / 2, 0, local20, local14);
			Static22.aClass59_1.method3790(Static111.anInt2450 / 2 - Static22.aClass59_1.anInt4748 / 2, 18);
		}
		arg0.method4179(Static124.aString78, Static111.anInt2450 / 2, Static216.anInt4287 / 2 - 26, 16777215, -1);
		local14 = Static216.anInt4287 / 2 - 18;
		if (Static178.aBoolean216) {
			Static186.method2970(Static111.anInt2450 / 2 - 152, local14, 304, 34, 9179409);
			Static186.method2970(Static111.anInt2450 / 2 - 151, local14 + 1, 302, 32, 0);
			Static186.method2968(Static111.anInt2450 / 2 - 150, local14 - -2, Static41.anInt852 * 3, 30, 9179409);
			Static186.method2968(Static111.anInt2450 / 2 + Static41.anInt852 * 3 - 150, local14 + 2, 300 - Static41.anInt852 * 3, 30, 0);
		} else {
			Static166.method2614(Static111.anInt2450 / 2 - 152, local14, 304, 34, 9179409);
			Static166.method2614(Static111.anInt2450 / 2 - 151, local14 + 1, 302, 32, 0);
			Static166.method2627(Static111.anInt2450 / 2 - 150, local14 + 2, Static41.anInt852 * 3, 30, 9179409);
			Static166.method2627(Static111.anInt2450 / 2 + Static41.anInt852 * 3 - 150, local14 + 2, 300 - Static41.anInt852 * 3, 30, 0);
		}
		arg0.method4179(Static124.aString77, Static111.anInt2450 / 2, Static216.anInt4287 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)Lclient!ge;")
	public static Class53_Sub1 method2476(@OriginalArg(0) int arg0) {
		return Static162.aBoolean205 && arg0 >= Static80.anInt1542 && arg0 <= Static200.anInt3912 ? Static148.aClass53_Sub1Array2[arg0 - Static80.anInt1542] : null;
	}
}
