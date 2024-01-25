import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Lclient!jj;")
	public static Class128_Sub1 aClass128_Sub1_1;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "[S")
	public static final short[] aShortArray85 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
	public static void method5309() {
		@Pc(9) int local9 = (int) ((double) Static135.anInt2314 * 34.46D);
		local9 <<= 0x0;
		if (Static276.aClass109_10.method4712()) {
			local9 += 128;
		}
		Static276.aClass109_10.JA(50, local9);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public static void method5311() {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(12) Class100 local12 = Static119.aClass138_7.method3216("2");
			while (local12.anInt2365 == 0) {
				Static67.method1189(1L);
			}
			if (local12.anInt2365 == 1) {
				local7 = (Class133) local12.anObject4;
				@Pc(38) byte[] local38 = new byte[(int) local7.method3022()];
				@Pc(53) int local53;
				for (@Pc(40) int local40 = 0; local40 < local38.length; local40 += local53) {
					local53 = local7.method3024(local38, local38.length - local40, local40);
					if (local53 == -1) {
						throw new IOException("EOF");
					}
				}
				Static107.method1656(new Class1_Sub1(local38));
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local7 != null) {
				local7.method3023();
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!ss;I)V")
	public static void method5312(@OriginalArg(0) int arg0, @OriginalArg(2) Class219 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray28 != null) {
			@Pc(13) Class1_Sub6 local13 = new Class1_Sub6();
			local13.anObjectArray3 = arg1.anObjectArray28;
			local13.aClass219_4 = arg1;
			Static104.method1608(local13);
		}
		Static304.anInt5407 = arg1.anInt6345;
		Static14.anInt338 = arg1.anInt6421;
		Static107.anInt1974 = arg1.anInt6422;
		Static333.anInt5795 = arg0;
		Static370.anInt6307 = arg1.anInt6380;
		Static138.aBoolean128 = true;
		Static246.anInt4394 = arg1.anInt6376;
		Static323.anInt5670 = arg2;
		Static355.method4895(arg1);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIZIFIII)[[I")
	public static int[][] method5313(@OriginalArg(5) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub3_Sub15 local13 = new Class1_Sub3_Sub15();
		local13.anInt2454 = 3;
		local13.anInt2451 = 4;
		local13.anInt2449 = (int) (arg0 * 4096.0F);
		local13.aBoolean132 = false;
		local13.anInt2450 = 8;
		local13.method6074();
		Static214.method3259(256, 64);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local13.method2163(local48, local9[local48]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!pk;BI)V")
	public static void method5314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub29 local15 = (Class1_Sub29) Static205.aClass266_32.method6000(); local15 != null; local15 = (Class1_Sub29) Static205.aClass266_32.method5994()) {
			if (local15.anInt4367 == arg0 && local15.anInt4373 == arg3 << 7 && local15.anInt4374 == arg1 << 7 && local15.aClass182_1.anInt5478 == arg2.anInt5478) {
				if (local15.aClass1_Sub7_Sub4_3 != null) {
					Static38.aClass1_Sub7_Sub1_1.method3979(local15.aClass1_Sub7_Sub4_3);
					local15.aClass1_Sub7_Sub4_3 = null;
				}
				if (local15.aClass1_Sub7_Sub4_2 != null) {
					Static38.aClass1_Sub7_Sub1_1.method3979(local15.aClass1_Sub7_Sub4_2);
					local15.aClass1_Sub7_Sub4_2 = null;
				}
				local15.method6071();
				return;
			}
		}
	}
}
