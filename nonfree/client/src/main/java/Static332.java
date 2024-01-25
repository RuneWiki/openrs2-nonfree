import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_60 = new Class87(64);

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
	public static int anInt6393 = 0;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "Z")
	public static boolean aBoolean626 = true;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!bg;)V")
	public static void method5393(@OriginalArg(1) Class1_Sub8 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static349.aClass190_5 != null) {
			@Pc(20) int local20;
			try {
				Static349.aClass190_5.method4929(0L);
				Static349.aClass190_5.method4930(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method4513(24, local8);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)I")
	public static int method5394(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(157) int local157 = (int) (local60 * 256.0D);
		@Pc(162) int local162 = (int) (local62 * 256.0D);
		@Pc(167) int local167 = (int) (local68 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		if (local167 > 243) {
			local162 >>= 0x4;
		} else if (local167 > 217) {
			local162 >>= 0x3;
		} else if (local167 > 192) {
			local162 >>= 0x2;
		} else if (local167 > 179) {
			local162 >>= 0x1;
		}
		return (local162 >> 5 << 7) + (((local157 >> 2 & 0x3F) << 10) + (local167 >> 1));
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
	public static void method5395() {
		Static110.method5407();
		Static113.method2453();
		Static193.method3725();
		Static73.method1690();
		Static158.method3157();
		Static236.method2132();
		Static231.method4264();
		Static256.method4617();
		Static137.method2804();
		Static127.method2621();
		Static202.method3829();
		Static214.method4112();
		Static21.method566();
		Static275.method4810();
		Static113.method2456();
		Static313.method5179();
		Static278.method4852();
		Static98.method2063();
		Static269.method4739();
		Static84.method1821();
		Static122.method2569();
		Static254.method4595();
		Static150.method3000();
		Static267.aClass87_47.method2477();
		Static147.aClass87_28.method2477();
		Static53.aClass87_13.method2477();
		Static276.aClass87_49.method2477();
		Static196.aClass87_37.method2477();
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
	public static void method5396(@OriginalArg(0) int arg0) {
		Static73.anInt1934 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static242.anInt6744; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static315.anInt6124; local6++) {
				if (Static77.aClass194ArrayArrayArray1[arg0][local3][local6] == null) {
					Static77.aClass194ArrayArrayArray1[arg0][local3][local6] = new Class194(arg0, local3, local6);
				}
			}
		}
	}
}
