import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "[Lclient!qda;")
	public static final Class260[] aClass260Array1 = new Class260[4];

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
	public static int anInt5562 = 0;

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
	public static int anInt5565 = 0;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILclient!lt;)V")
	public static void method4785(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub26_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method5008(1) == 1;
		if (local17) {
			Static127.anIntArray215[Static534.anInt9243++] = arg0;
		}
		@Pc(32) int local32 = arg1.method5008(2);
		@Pc(36) Class11_Sub1_Sub1_Sub2 local36 = Static239.aClass11_Sub1_Sub1_Sub2Array1[arg0];
		if (local32 != 0) {
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local32 == 1) {
				local146 = arg1.method5008(3);
				local151 = local36.anIntArray526[0];
				local156 = local36.anIntArray527[0];
				if (local146 == 0) {
					local156--;
					local151--;
				} else if (local146 == 1) {
					local156--;
				} else if (local146 == 2) {
					local151++;
					local156--;
				} else if (local146 == 3) {
					local151--;
				} else if (local146 == 4) {
					local151++;
				} else if (local146 == 5) {
					local151--;
					local156++;
				} else if (local146 == 6) {
					local156++;
				} else if (local146 == 7) {
					local151++;
					local156++;
				}
				if (local17) {
					local36.anInt7473 = local151;
					local36.anInt7468 = local156;
					local36.aBoolean550 = true;
				} else {
					local36.method6231(local156, Static425.aByteArray94[arg0], local151);
				}
			} else if (local32 == 2) {
				local146 = arg1.method5008(4);
				local151 = local36.anIntArray526[0];
				local156 = local36.anIntArray527[0];
				if (local146 == 0) {
					local151 -= 2;
					local156 -= 2;
				} else if (local146 == 1) {
					local151--;
					local156 -= 2;
				} else if (local146 == 2) {
					local156 -= 2;
				} else if (local146 == 3) {
					local156 -= 2;
					local151++;
				} else if (local146 == 4) {
					local156 -= 2;
					local151 += 2;
				} else if (local146 == 5) {
					local156--;
					local151 -= 2;
				} else if (local146 == 6) {
					local151 += 2;
					local156--;
				} else if (local146 == 7) {
					local151 -= 2;
				} else if (local146 == 8) {
					local151 += 2;
				} else if (local146 == 9) {
					local156++;
					local151 -= 2;
				} else if (local146 == 10) {
					local156++;
					local151 += 2;
				} else if (local146 == 11) {
					local151 -= 2;
					local156 += 2;
				} else if (local146 == 12) {
					local156 += 2;
					local151--;
				} else if (local146 == 13) {
					local156 += 2;
				} else if (local146 == 14) {
					local156 += 2;
					local151++;
				} else if (local146 == 15) {
					local156 += 2;
					local151 += 2;
				}
				if (local17) {
					local36.aBoolean550 = true;
					local36.anInt7468 = local156;
					local36.anInt7473 = local151;
				} else {
					local36.method6231(local156, Static425.aByteArray94[arg0], local151);
				}
			} else {
				local146 = arg1.method5008(1);
				@Pc(425) int local425;
				@Pc(433) int local433;
				@Pc(446) int local446;
				@Pc(453) int local453;
				if (local146 == 0) {
					local151 = arg1.method5008(12);
					local156 = local151 >> 10;
					local425 = local151 >> 5 & 0x1F;
					if (local425 > 15) {
						local425 -= 32;
					}
					local433 = local151 & 0x1F;
					if (local433 > 15) {
						local433 -= 32;
					}
					local446 = local425 + local36.anIntArray526[0];
					local453 = local36.anIntArray527[0] + local433;
					if (local17) {
						local36.anInt7468 = local453;
						local36.anInt7473 = local446;
						local36.aBoolean550 = true;
					} else {
						local36.method6231(local453, Static425.aByteArray94[arg0], local446);
					}
					local36.aByte77 = (byte) (local156 + local36.aByte77 & 0x3);
					if (Static412.anInt7714 == arg0) {
						Static493.anInt8836 = local36.aByte77;
					}
				} else {
					local151 = arg1.method5008(30);
					local156 = local151 >> 28;
					local425 = local151 >> 14 & 0x3FFF;
					local433 = local151 & 0x3FFF;
					local446 = (local425 + Static191.anInt4147 + local36.anIntArray526[0] & 0x3FFF) - Static191.anInt4147;
					local453 = (local433 + Static247.anInt5049 + local36.anIntArray527[0] & 0x3FFF) - Static247.anInt5049;
					if (local17) {
						local36.aBoolean550 = true;
						local36.anInt7473 = local446;
						local36.anInt7468 = local453;
					} else {
						local36.method6231(local453, Static425.aByteArray94[arg0], local446);
					}
					local36.aByte77 = (byte) (local36.aByte77 + local156 & 0x3);
					if (Static412.anInt7714 == arg0) {
						Static493.anInt8836 = local36.aByte77;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean550 = false;
		} else if (arg0 == Static412.anInt7714) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(63) Class153 local63 = Static510.aClass153Array6[arg0] = new Class153();
			local63.anInt4680 = (local36.anIntArray526[0] + Static191.anInt4147 >> 6 << 14) + (local36.aByte77 << 28) + (local36.anIntArray527[0] + Static247.anInt5049 >> 6);
			if (local36.anInt7455 == -1) {
				local63.anInt4682 = local36.aClass134_7.method3705();
			} else {
				local63.anInt4682 = local36.anInt7455;
			}
			local63.aBoolean368 = local36.aBoolean548;
			local63.anInt4679 = local36.anInt7407;
			if (local36.anInt7439 > 0) {
				Static239.method4219(local36);
			}
			Static239.aClass11_Sub1_Sub1_Sub2Array1[arg0] = null;
			if (arg1.method5008(1) != 0) {
				Static196.method3725(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(Z)V")
	public static void method4786() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static293.anInt5603 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(29) Exception local29) {
		}
	}
}
