import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "D")
	public static double aDouble30;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_252 = new Class215(35, 0);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method9045(@OriginalArg(0) String arg0) {
		Static101.method2658("", 4, 0, arg0, "", "");
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V")
	public static void method9046() {
		Static127.aClass169_21.method4997(50);
		Static140.aClass169_24.method4997(50);
		Static90.aClass169_13.method4997(50);
		Static297.aClass169_34.method4997(50);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method9048(@OriginalArg(0) String arg0) {
		if (!Static487.aClass370_7.aBoolean739) {
			return -1;
		} else if (Static590.aHashtable7.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static104.method2674(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static562.aString103 + local20;
			if (!Static425.aClass157_219.method4576("", local33)) {
				return -1;
			} else if (Static425.aClass157_219.method4567(local33)) {
				@Pc(67) byte[] local67 = Static425.aClass157_219.method4545(local33, "");
				@Pc(75) File local75;
				try {
					local75 = Static53.method1776(local20);
				} catch (@Pc(77) RuntimeException local77) {
					return -1;
				}
				if (local67 == null || local75 == null) {
					return -1;
				}
				@Pc(85) boolean local85 = true;
				@Pc(91) byte[] local91 = Static90.method2492(local75);
				if (local91 != null && local67.length == local91.length) {
					for (@Pc(108) int local108 = 0; local108 < local91.length; local108++) {
						if (local91[local108] != local67[local108]) {
							local85 = false;
							break;
						}
					}
				} else {
					local85 = false;
				}
				try {
					if (!local85) {
						Static487.aClass370_7.method9077(local67, local75);
					}
				} catch (@Pc(140) Throwable local140) {
					return -1;
				}
				Static424.method6823(local75, arg0);
				return 100;
			} else {
				return Static425.aClass157_219.method4551(local33);
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!lga;Lclient!ha;Lclient!ii;)V")
	public static void method9050(@OriginalArg(1) Class2_Sub32 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class153 arg2) {
		@Pc(10) Class46 local10 = arg2.method4495(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method6210();
		if (local16 < local10.method6208()) {
			local16 = local10.method6208();
		}
		@Pc(28) int local28 = arg0.anInt6573;
		@Pc(31) int local31 = arg0.anInt6574;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(78) int local78;
		if (arg2.aString51 != null) {
			local33 = Static187.aClass239_8.method6487(arg2.aString51, null, Static626.aStringArray8, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static626.aStringArray8[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local78 = Static238.aClass66_5.method2368(local57);
				if (local78 > local35) {
					local35 = local78;
				}
			}
			local37 = local33 * Static238.aClass66_5.method2369() + Static238.aClass66_5.method2364() / 2;
		}
		local51 = local16 / 2 + arg0.anInt6573;
		@Pc(112) int local112 = arg0.anInt6574;
		if (local28 < Static303.anInt113 + local16) {
			local28 = Static303.anInt113;
			local51 = local35 / 2 + local16 / 2 + Static303.anInt113 + 10 + 5;
		} else if (Static303.anInt115 - local16 < local28) {
			local28 = Static303.anInt115 - local16;
			local51 = Static303.anInt115 - local16 / 2 - local35 / 2 - 10 - 5;
		}
		if (local31 < local16 + Static303.anInt107) {
			local31 = Static303.anInt107;
			local112 = local16 / 2 + Static303.anInt107 + 10;
		} else if (local31 > Static303.anInt112 - local16) {
			local31 = Static303.anInt112 - local16;
			local112 = Static303.anInt112 - local16 / 2 - local37 - 10;
		}
		local78 = (int) (Math.atan2((double) (local28 - arg0.anInt6573), (double) (local31 - arg0.anInt6574)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6220((float) local16 / 2.0F + (float) local28, (float) local16 / 2.0F + (float) local31, 4096, local78);
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		@Pc(256) int local256 = -2;
		@Pc(264) int local264 = -2;
		if (arg2.aString51 != null) {
			local254 = local112;
			local252 = local51 - local35 / 2 - 5;
			local264 = local33 * Static238.aClass66_5.method2369() + local112 + 3;
			local256 = local35 + local252 + 10;
			if (arg2.anInt5243 != 0) {
				arg1.method7278(local256 - local252, local252, local112, local264 - local112, arg2.anInt5243);
			}
			if (arg2.anInt5245 != 0) {
				arg1.method7271(local256 - local252, local112, arg2.anInt5245, local252, local264 - local112);
			}
			for (@Pc(333) int local333 = 0; local333 < local33; local333++) {
				@Pc(339) String local339 = Static626.aStringArray8[local333];
				if (local33 - 1 > local333) {
					local339 = local339.substring(0, local339.length() - 4);
				}
				Static238.aClass66_5.method2367(arg1, local339, local51, local112, arg2.anInt5226);
				local112 += Static238.aClass66_5.method2369();
			}
		}
		if (arg2.anInt5224 == -1 && arg2.aString51 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(390) Class2_Sub4 local390 = new Class2_Sub4(arg0);
		local390.anInt410 = local256;
		local390.anInt414 = local31 - local16;
		local390.anInt409 = local31 + local16;
		local390.anInt416 = local28 + local16;
		local390.anInt411 = local264;
		local390.anInt417 = local254;
		local390.anInt415 = local28 - local16;
		local390.anInt413 = local252;
		Static612.aClass341_69.method8528(local390);
	}
}
