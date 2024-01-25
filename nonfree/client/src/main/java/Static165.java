import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
	public static int anInt5949 = 0;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_81 = new Class179(81, 2);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5086(@OriginalArg(0) String arg0) {
		if (!Static401.aClass226_4.aBoolean416) {
			return -1;
		} else if (Static292.aHashtable3.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(25) String local25 = Static163.method2450(arg0);
			if (local25 == null) {
				return -1;
			}
			@Pc(38) String local38 = Static231.aString35 + local25;
			if (!Static281.aClass380_68.method8610("", local38)) {
				return -1;
			} else if (Static281.aClass380_68.method8641(local38)) {
				@Pc(62) byte[] local62 = Static281.aClass380_68.method8628("", local38);
				@Pc(68) File local68;
				try {
					local68 = Static306.method4189(local25);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static261.method3558(local68);
				if (local82 != null && local82.length == local62.length) {
					for (@Pc(91) int local91 = 0; local91 < local82.length; local91++) {
						if (local82[local91] != local62[local91]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static401.aClass226_4.method4847(local62, local68);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static535.method7387(local68, arg0);
				return 100;
			} else {
				return Static281.aClass380_68.method8606(local38);
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	public static void method5089() {
		if (Static343.anIntArray359 != null) {
			return;
		}
		Static343.anIntArray359 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(80) double local80;
				if (local57 < 0.5D) {
					local80 = local57 * (local50 + 1.0D);
				} else {
					local80 = local57 + local50 - local57 * local50;
				}
				@Pc(95) double local95 = local57 * 2.0D - local80;
				@Pc(99) double local99 = local39 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local39 - 0.3333333333333333D;
				if (local39 * 6.0D < 1.0D) {
					local61 = (local80 - local95) * 6.0D * local39 + local95;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local80;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local95 + (0.6666666666666666D - local39) * (local80 - local95) * 6.0D;
				} else {
					local61 = local95;
				}
				if (local113 < 0.0D) {
					local113++;
				}
				if (local99 * 6.0D < 1.0D) {
					local59 = local95 + (local80 - local95) * 6.0D * local99;
				} else if (local99 * 2.0D < 1.0D) {
					local59 = local80;
				} else if (local99 * 3.0D < 2.0D) {
					local59 = (local80 - local95) * 6.0D * (0.6666666666666666D - local99) + local95;
				} else {
					local59 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local63 = local95 + local113 * (local80 - local95) * 6.0D;
				} else if (local113 * 2.0D < 1.0D) {
					local63 = local80;
				} else if (local113 * 3.0D < 2.0D) {
					local63 = local95 + (0.6666666666666666D - local113) * (-local95 + local80) * 6.0D;
				} else {
					local63 = local95;
				}
			}
			local59 = Math.pow(local59, local19);
			local61 = Math.pow(local61, local19);
			local63 = Math.pow(local63, local19);
			@Pc(294) int local294 = (int) (local59 * 256.0D);
			@Pc(299) int local299 = (int) (local61 * 256.0D);
			@Pc(304) int local304 = (int) (local63 * 256.0D);
			@Pc(315) int local315 = local304 + (local294 << 16) + (local299 << 8);
			Static343.anIntArray359[local26] = local315;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!kc;)V")
	public static void method5090(@OriginalArg(1) Class13_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(19) Class2_Sub33 local19 = (Class2_Sub33) Static221.aClass118_18.method2595((long) arg0.anInt4582);
		if (local19 == null) {
			return;
		}
		if (local19.aClass2_Sub13_Sub2_3 != null) {
			Static586.aClass2_Sub13_Sub4_2.method7226(local19.aClass2_Sub13_Sub2_3);
			local19.aClass2_Sub13_Sub2_3 = null;
		}
		local19.method8653();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method5091(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static580.anInt9430;
		@Pc(9) int[] local9 = Static6.anIntArray9;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(26) Class13_Sub1_Sub1_Sub1_Sub2 local26 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local9[local13]];
			if (local26 != null && local26 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 && local26.aString50 != null && local26.aString50.equalsIgnoreCase(arg1)) {
				@Pc(64) Class2_Sub40 local64;
				if (arg0 == 1) {
					local64 = Static464.method6285(Static251.aClass131_1, Static431.aClass179_95);
					local64.aClass2_Sub22_Sub2_2.method8507(local9[local13]);
					local64.aClass2_Sub22_Sub2_2.method8541(0);
					Static528.method7295(local64);
				} else if (arg0 == 4) {
					local64 = Static464.method6285(Static251.aClass131_1, Static262.aClass179_72);
					local64.aClass2_Sub22_Sub2_2.method8515(0);
					local64.aClass2_Sub22_Sub2_2.method8500(local9[local13]);
					Static528.method7295(local64);
				} else if (arg0 == 5) {
					local64 = Static464.method6285(Static251.aClass131_1, Static30.aClass179_9);
					local64.aClass2_Sub22_Sub2_2.method8528(local9[local13]);
					local64.aClass2_Sub22_Sub2_2.method8541(0);
					Static528.method7295(local64);
				} else if (arg0 == 6) {
					local64 = Static464.method6285(Static251.aClass131_1, Static268.aClass179_57);
					local64.aClass2_Sub22_Sub2_2.method8507(local9[local13]);
					local64.aClass2_Sub22_Sub2_2.method8501(0);
					Static528.method7295(local64);
				} else if (arg0 == 7) {
					local64 = Static464.method6285(Static251.aClass131_1, Static200.aClass179_50);
					local64.aClass2_Sub22_Sub2_2.method8537(0);
					local64.aClass2_Sub22_Sub2_2.method8528(local9[local13]);
					Static528.method7295(local64);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static3.method8592(Static434.aClass271_21.method5972(Static483.anInt7694) + arg1);
		}
	}
}
