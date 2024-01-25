import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
	public static boolean aBoolean488 = false;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZLclient!ck;)V")
	public static void method4450(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7_Sub1 arg1) {
		@Pc(13) boolean local13 = arg1.method1063(1) == 1;
		if (local13) {
			Static260.anIntArray400[Static27.anInt2361++] = arg0;
		}
		@Pc(33) int local33 = arg1.method1063(2);
		@Pc(37) Class7_Sub2_Sub3_Sub2 local37 = Static361.aClass7_Sub2_Sub3_Sub2Array1[arg0];
		if (local33 != 0) {
			@Pc(150) int local150;
			@Pc(155) int local155;
			@Pc(160) int local160;
			if (local33 == 1) {
				local150 = arg1.method1063(3);
				local155 = local37.anIntArray287[0];
				local160 = local37.anIntArray288[0];
				if (local150 == 0) {
					local155--;
					local160--;
				} else if (local150 == 1) {
					local160--;
				} else if (local150 == 2) {
					local160--;
					local155++;
				} else if (local150 == 3) {
					local155--;
				} else if (local150 == 4) {
					local155++;
				} else if (local150 == 5) {
					local155--;
					local160++;
				} else if (local150 == 6) {
					local160++;
				} else if (local150 == 7) {
					local160++;
					local155++;
				}
				if (local13) {
					local37.aBoolean381 = true;
					local37.anInt4441 = local155;
					local37.anInt4425 = local160;
				} else {
					local37.method3518(local160, local155, Static329.aByteArray76[arg0]);
				}
			} else if (local33 == 2) {
				local150 = arg1.method1063(4);
				local155 = local37.anIntArray287[0];
				local160 = local37.anIntArray288[0];
				if (local150 == 0) {
					local155 -= 2;
					local160 -= 2;
				} else if (local150 == 1) {
					local160 -= 2;
					local155--;
				} else if (local150 == 2) {
					local160 -= 2;
				} else if (local150 == 3) {
					local155++;
					local160 -= 2;
				} else if (local150 == 4) {
					local160 -= 2;
					local155 += 2;
				} else if (local150 == 5) {
					local160--;
					local155 -= 2;
				} else if (local150 == 6) {
					local160--;
					local155 += 2;
				} else if (local150 == 7) {
					local155 -= 2;
				} else if (local150 == 8) {
					local155 += 2;
				} else if (local150 == 9) {
					local160++;
					local155 -= 2;
				} else if (local150 == 10) {
					local160++;
					local155 += 2;
				} else if (local150 == 11) {
					local160 += 2;
					local155 -= 2;
				} else if (local150 == 12) {
					local155--;
					local160 += 2;
				} else if (local150 == 13) {
					local160 += 2;
				} else if (local150 == 14) {
					local155++;
					local160 += 2;
				} else if (local150 == 15) {
					local160 += 2;
					local155 += 2;
				}
				if (local13) {
					local37.aBoolean381 = true;
					local37.anInt4425 = local160;
					local37.anInt4441 = local155;
				} else {
					local37.method3518(local160, local155, Static329.aByteArray76[arg0]);
				}
			} else {
				local150 = arg1.method1063(1);
				@Pc(406) int local406;
				@Pc(414) int local414;
				@Pc(426) int local426;
				@Pc(434) int local434;
				if (local150 == 0) {
					local155 = arg1.method1063(12);
					local160 = local155 >> 10;
					local406 = local155 >> 5 & 0x1F;
					if (local406 > 15) {
						local406 -= 32;
					}
					local414 = local155 & 0x1F;
					if (local414 > 15) {
						local414 -= 32;
					}
					local426 = local37.anIntArray287[0] + local406;
					local434 = local37.anIntArray288[0] + local414;
					if (local13) {
						local37.anInt4425 = local434;
						local37.aBoolean381 = true;
						local37.anInt4441 = local426;
					} else {
						local37.method3518(local434, local426, Static329.aByteArray76[arg0]);
					}
					local37.aByte77 = (byte) (local37.aByte77 + local160 & 0x3);
					if (Static319.anInt1936 == arg0) {
						Static6.anInt93 = local37.aByte77;
					}
				} else {
					local155 = arg1.method1063(30);
					local160 = local155 >> 28;
					local406 = local155 >> 14 & 0x3FFF;
					local414 = local155 & 0x3FFF;
					local426 = (Static223.anInt7618 + local37.anIntArray287[0] + local406 & 0x3FFF) - Static223.anInt7618;
					local434 = (local414 + local37.anIntArray288[0] + Static57.anInt5085 & 0x3FFF) - Static57.anInt5085;
					if (local13) {
						local37.anInt4441 = local426;
						local37.anInt4425 = local434;
						local37.aBoolean381 = true;
					} else {
						local37.method3518(local434, local426, Static329.aByteArray76[arg0]);
					}
					local37.aByte77 = (byte) (local37.aByte77 + local160 & 0x3);
					if (arg0 == Static319.anInt1936) {
						Static6.anInt93 = local37.aByte77;
					}
				}
			}
		} else if (local13) {
			local37.aBoolean381 = false;
		} else if (arg0 == Static319.anInt1936) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(65) Class64 local65 = Static365.aClass64Array1[arg0] = new Class64();
			local65.anInt2168 = (Static57.anInt5085 + local37.anIntArray288[0] >> 6) + (local37.aByte77 << 28) + (Static223.anInt7618 + local37.anIntArray287[0] >> 6 << 14);
			if (local37.anInt4443 == -1) {
				local65.anInt2167 = local37.aClass91_7.method2048();
			} else {
				local65.anInt2167 = local37.anInt4443;
			}
			local65.aBoolean171 = local37.aBoolean380;
			local65.anInt2170 = local37.anInt4332;
			if (local37.anInt4430 > 0) {
				Static295.method4136(local37);
			}
			Static361.aClass7_Sub2_Sub3_Sub2Array1[arg0] = null;
			if (arg1.method1063(1) != 0) {
				Static119.method1945(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
	public static int method4451() {
		if ((double) Static144.aFloat58 == 3.0D) {
			return 37;
		} else if ((double) Static144.aFloat58 == 4.0D) {
			return 50;
		} else if ((double) Static144.aFloat58 == 6.0D) {
			return 75;
		} else if ((double) Static144.aFloat58 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
