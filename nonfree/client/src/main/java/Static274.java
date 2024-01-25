import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
	public static int anInt5655;

	@OriginalMember(owner = "client!lh", name = "O", descriptor = "Lclient!kea;")
	public static Class161 aClass161_59;

	@OriginalMember(owner = "client!lh", name = "K", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_97 = new Class133(92, -2);

	@OriginalMember(owner = "client!lh", name = "L", descriptor = "Lclient!db;")
	public static final Class57 aClass57_9 = new Class57(10, 2, 2, 0);

	@OriginalMember(owner = "client!lh", name = "N", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_98 = new Class133(42, 6);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4751(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
	public static void method4752() {
		Static298.anImage6 = null;
		Static181.aFont1 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(DI)V")
	public static void method4753(@OriginalArg(0) double arg0) {
		if (Static240.aDouble9 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static375.anIntArray625[local11] = local23 <= 255 ? local23 : 255;
		}
		Static240.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!tq;ZILclient!rt;)V")
	public static void method4754(@OriginalArg(0) Class285 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub27 arg2) {
		@Pc(9) Class3_Sub17 local9 = new Class3_Sub17();
		local9.anInt2908 = arg2.method7548();
		local9.anInt2910 = arg2.method7549();
		local9.anIntArray285 = new int[local9.anInt2908];
		local9.anIntArray284 = new int[local9.anInt2908];
		local9.aClass212Array2 = new Class212[local9.anInt2908];
		local9.aClass212Array1 = new Class212[local9.anInt2908];
		local9.anIntArray283 = new int[local9.anInt2908];
		local9.aByteArrayArrayArray17 = new byte[local9.anInt2908][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt2908; local56++) {
			try {
				@Pc(62) int local62 = arg2.method7548();
				@Pc(79) String local79;
				@Pc(83) String local83;
				@Pc(85) int local85;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local79 = arg2.method7589();
					local83 = arg2.method7589();
					local85 = 0;
					if (local62 == 1) {
						local85 = arg2.method7549();
					}
					local9.anIntArray283[local56] = local62;
					local9.anIntArray284[local56] = local85;
					local9.aClass212Array1[local56] = arg0.method7043(local83, Static456.method7272(local79));
				} else if (local62 == 3 || local62 == 4) {
					local79 = arg2.method7589();
					local83 = arg2.method7589();
					local85 = arg2.method7548();
					@Pc(140) String[] local140 = new String[local85];
					for (@Pc(142) int local142 = 0; local142 < local85; local142++) {
						local140[local142] = arg2.method7589();
					}
					@Pc(157) byte[][] local157 = new byte[local85][];
					@Pc(170) int local170;
					if (local62 == 3) {
						for (@Pc(164) int local164 = 0; local164 < local85; local164++) {
							local170 = arg2.method7549();
							local157[local164] = new byte[local170];
							arg2.method7571(local157[local164], local170);
						}
					}
					local9.anIntArray283[local56] = local62;
					@Pc(195) Class[] local195 = new Class[local85];
					for (local170 = 0; local170 < local85; local170++) {
						local195[local170] = Static456.method7272(local140[local170]);
					}
					local9.aClass212Array2[local56] = arg0.method7039(local83, Static456.method7272(local79), local195);
					local9.aByteArrayArrayArray17[local56] = local157;
				}
			} catch (@Pc(234) ClassNotFoundException local234) {
				local9.anIntArray285[local56] = -1;
			} catch (@Pc(241) SecurityException local241) {
				local9.anIntArray285[local56] = -2;
			} catch (@Pc(248) NullPointerException local248) {
				local9.anIntArray285[local56] = -3;
			} catch (@Pc(255) Exception local255) {
				local9.anIntArray285[local56] = -4;
			} catch (@Pc(262) Throwable local262) {
				local9.anIntArray285[local56] = -5;
			}
		}
		Static47.aClass71_68.method2076(local9);
	}
}
