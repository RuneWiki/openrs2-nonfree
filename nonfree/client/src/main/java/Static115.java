import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_10;

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!lc;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
	public static int anInt2958 = 0;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1137 = Static169.method2903("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
	public static int anInt2962 = 0;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Lclient!td;")
	public static Class79 aClass79_18 = new Class79(50);

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1138 = Static169.method2903("(Y<)4col>");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method2042(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static70.method1251(local18) : local18;
		} else if (arg1 instanceof Class70) {
			@Pc(32) Class70 local32 = (Class70) arg1;
			return local32.method2437();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public static void method2043() {
		Static14.anInt465 = 0;
		Static104.anInt2660 = 0;
		Static135.method2316();
		Static147.method2550();
		Static46.method3123();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static14.anInt465; local17++) {
			local23 = Static42.anIntArray140[local17];
			if (Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local23].anInt1834 != Static26.anInt845) {
				Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local23].aClass1_Sub1_Sub9_1 = null;
				Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local23] = null;
			}
		}
		if (Static103.anInt2645 != Static35.aClass1_Sub8_Sub1_2.anInt1357) {
			throw new RuntimeException("gnp1 pos:" + Static35.aClass1_Sub8_Sub1_2.anInt1357 + " psize:" + Static103.anInt2645);
		}
		for (local23 = 0; local23 < Static86.anInt2307; local23++) {
			if (Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static141.anIntArray476[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static86.anInt2307);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public static void method2044() {
		aClass48_1 = null;
		aClass23_1138 = null;
		aClass30_Sub1_10 = null;
		aClass23_1137 = null;
		aClass79_18 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLjava/awt/Component;II)Lclient!qb;")
	public static Class25 method2045(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class25_Sub1");
			@Pc(10) Class25 local10 = (Class25) local6.getDeclaredConstructor().newInstance();
			local10.method2790(arg1, arg0, arg2);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class25_Sub2 local28 = new Class25_Sub2();
			local28.method2790(arg1, arg0, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!jg;IIIIII)V")
	public static void method2046(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(28) int local28;
		if (arg5 < 0 || arg5 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local28 = arg1.method861();
				if (local28 == 0) {
					break;
				}
				if (local28 == 1) {
					arg1.method861();
					break;
				}
				if (local28 <= 49) {
					arg1.method861();
				}
			}
			return;
		}
		Static12.aByteArrayArrayArray11[arg6][arg5][arg0] = 0;
		while (true) {
			local28 = arg1.method861();
			if (local28 == 0) {
				if (arg6 == 0) {
					Static141.anIntArrayArrayArray3[0][arg5][arg0] = -Static70.method1250(arg3 + arg0 + 556238, arg4 + arg5 + 932731) * 8;
				} else {
					Static141.anIntArrayArrayArray3[arg6][arg5][arg0] = Static141.anIntArrayArrayArray3[arg6 - 1][arg5][arg0] - 240;
				}
				break;
			}
			if (local28 == 1) {
				@Pc(86) int local86 = arg1.method861();
				if (local86 == 1) {
					local86 = 0;
				}
				if (arg6 == 0) {
					Static141.anIntArrayArrayArray3[0][arg5][arg0] = -local86 * 8;
				} else {
					Static141.anIntArrayArrayArray3[arg6][arg5][arg0] = Static141.anIntArrayArrayArray3[arg6 - 1][arg5][arg0] - local86 * 8;
				}
				break;
			}
			if (local28 <= 49) {
				Static74.aByteArrayArrayArray45[arg6][arg5][arg0] = arg1.method900();
				Static177.aByteArrayArrayArray104[arg6][arg5][arg0] = (byte) ((local28 - 2) / 4);
				Static36.aByteArrayArrayArray24[arg6][arg5][arg0] = (byte) (arg2 + local28 - 2 & 0x3);
			} else if (local28 <= 81) {
				Static12.aByteArrayArrayArray11[arg6][arg5][arg0] = (byte) (local28 - 49);
			} else {
				Static154.aByteArrayArrayArray91[arg6][arg5][arg0] = (byte) (local28 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLclient!tg;)V")
	public static void method2047(@OriginalArg(1) Class1_Sub1_Sub12_Sub4 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static75.anIntArray269.length; local9++) {
			Static75.anIntArray269[local9] = 0;
		}
		@Pc(48) int local48;
		for (@Pc(38) int local38 = 0; local38 < 5000; local38++) {
			local48 = (int) ((double) 256 * 128.0D * Math.random());
			Static75.anIntArray269[local48] = (int) (Math.random() * 256.0D);
		}
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(77) int local77;
		for (local48 = 0; local48 < 20; local48++) {
			for (local65 = 1; local65 < 255; local65++) {
				for (local69 = 1; local69 < 127; local69++) {
					local77 = (local65 << 7) + local69;
					Static156.anIntArray514[local77] = (Static75.anIntArray269[local77 + 128] + Static75.anIntArray269[local77 - 128] + Static75.anIntArray269[local77 - 1] + Static75.anIntArray269[local77 - -1]) / 4;
				}
			}
			@Pc(118) int[] local118 = Static75.anIntArray269;
			Static75.anIntArray269 = Static156.anIntArray514;
			Static156.anIntArray514 = local118;
		}
		if (arg0 == null) {
			return;
		}
		local65 = 0;
		for (local69 = 0; local69 < arg0.anInt3907; local69++) {
			for (local77 = 0; local77 < arg0.anInt3905; local77++) {
				if (arg0.aByteArray44[local65++] != 0) {
					@Pc(157) int local157 = local77 + arg0.anInt3904 + 16;
					@Pc(164) int local164 = arg0.anInt3906 + local69 + 16;
					@Pc(170) int local170 = local157 + (local164 << 7);
					Static75.anIntArray269[local170] = 0;
				}
			}
		}
	}
}
