import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!laa", name = "N", descriptor = "[I")
	public static final int[] anIntArray387 = new int[256];

	@OriginalMember(owner = "client!laa", name = "O", descriptor = "F")
	public static float aFloat117 = 1024.0F;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "()V")
	public static void method4060() {
		for (@Pc(1) int local1 = 0; local1 < Static16.anInt203; local1++) {
			@Pc(6) Class8_Sub3_Sub3 local6 = Static410.aClass8_Sub3_Sub3Array1[local1];
			Static481.method6522(local6, true);
			Static410.aClass8_Sub3_Sub3Array1[local1] = null;
		}
		Static16.anInt203 = 0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method4061(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static404.method5618(arg1, arg0, local6);
			return local6;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!qaa;II)V")
	public static void method4063(@OriginalArg(0) Class1_Sub35_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method5806(1) == 1;
		if (local15) {
			Static295.anIntArray391[Static172.anInt3031++] = arg1;
		}
		@Pc(30) int local30 = arg0.method5806(2);
		@Pc(38) Class8_Sub3_Sub3_Sub1_Sub1 local38 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(155) int local155;
			@Pc(160) int local160;
			@Pc(165) int local165;
			if (local30 == 1) {
				local155 = arg0.method5806(3);
				local160 = local38.anIntArray534[0];
				local165 = local38.anIntArray533[0];
				if (local155 == 0) {
					local165--;
					local160--;
				} else if (local155 == 1) {
					local165--;
				} else if (local155 == 2) {
					local160++;
					local165--;
				} else if (local155 == 3) {
					local160--;
				} else if (local155 == 4) {
					local160++;
				} else if (local155 == 5) {
					local160--;
					local165++;
				} else if (local155 == 6) {
					local165++;
				} else if (local155 == 7) {
					local160++;
					local165++;
				}
				if (local15) {
					local38.anInt1729 = local165;
					local38.aBoolean135 = true;
					local38.anInt1749 = local160;
				} else {
					local38.method1439(Static500.aByteArray97[arg1], local160, local165);
				}
			} else if (local30 == 2) {
				local155 = arg0.method5806(4);
				local160 = local38.anIntArray534[0];
				local165 = local38.anIntArray533[0];
				if (local155 == 0) {
					local160 -= 2;
					local165 -= 2;
				} else if (local155 == 1) {
					local165 -= 2;
					local160--;
				} else if (local155 == 2) {
					local165 -= 2;
				} else if (local155 == 3) {
					local160++;
					local165 -= 2;
				} else if (local155 == 4) {
					local165 -= 2;
					local160 += 2;
				} else if (local155 == 5) {
					local165--;
					local160 -= 2;
				} else if (local155 == 6) {
					local160 += 2;
					local165--;
				} else if (local155 == 7) {
					local160 -= 2;
				} else if (local155 == 8) {
					local160 += 2;
				} else if (local155 == 9) {
					local165++;
					local160 -= 2;
				} else if (local155 == 10) {
					local165++;
					local160 += 2;
				} else if (local155 == 11) {
					local160 -= 2;
					local165 += 2;
				} else if (local155 == 12) {
					local160--;
					local165 += 2;
				} else if (local155 == 13) {
					local165 += 2;
				} else if (local155 == 14) {
					local165 += 2;
					local160++;
				} else if (local155 == 15) {
					local160 += 2;
					local165 += 2;
				}
				if (local15) {
					local38.aBoolean135 = true;
					local38.anInt1749 = local160;
					local38.anInt1729 = local165;
				} else {
					local38.method1439(Static500.aByteArray97[arg1], local160, local165);
				}
			} else {
				local155 = arg0.method5806(1);
				@Pc(430) int local430;
				@Pc(440) int local440;
				@Pc(451) int local451;
				@Pc(458) int local458;
				if (local155 == 0) {
					local160 = arg0.method5806(12);
					local165 = local160 >> 10;
					local430 = local160 >> 5 & 0x1F;
					if (local430 > 15) {
						local430 -= 32;
					}
					local440 = local160 & 0x1F;
					if (local440 > 15) {
						local440 -= 32;
					}
					local451 = local38.anIntArray534[0] + local430;
					local458 = local440 + local38.anIntArray533[0];
					if (local15) {
						local38.aBoolean135 = true;
						local38.anInt1749 = local451;
						local38.anInt1729 = local458;
					} else {
						local38.method1439(Static500.aByteArray97[arg1], local451, local458);
					}
					local38.aByte123 = local38.aByte124 = (byte) (local38.aByte123 + local165 & 0x3);
					if (Static466.method6426(local458, local451)) {
						local38.aByte124++;
					}
					if (arg1 == Static296.anInt5113) {
						Static433.anInt7592 = local38.aByte123;
					}
				} else {
					local160 = arg0.method5806(30);
					local165 = local160 >> 28;
					local430 = local160 >> 14 & 0x3FFF;
					local440 = local160 & 0x3FFF;
					local451 = (local430 + local38.anIntArray534[0] + Static541.anInt9058 & 0x3FFF) - Static541.anInt9058;
					local458 = (local440 + local38.anIntArray533[0] + Static116.anInt2289 & 0x3FFF) - Static116.anInt2289;
					if (local15) {
						local38.aBoolean135 = true;
						local38.anInt1749 = local451;
						local38.anInt1729 = local458;
					} else {
						local38.method1439(Static500.aByteArray97[arg1], local451, local458);
					}
					local38.aByte123 = local38.aByte124 = (byte) (local38.aByte123 + local165 & 0x3);
					if (Static466.method6426(local458, local451)) {
						local38.aByte124++;
					}
					if (arg1 == Static296.anInt5113) {
						Static433.anInt7592 = local38.aByte123;
					}
				}
			}
		} else if (local15) {
			local38.aBoolean135 = false;
		} else if (Static296.anInt5113 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(69) Class296 local69 = Static511.aClass296Array1[arg1] = new Class296();
			local69.anInt7951 = (Static116.anInt2289 + local38.anIntArray533[0] >> 6) + ((local38.aByte123 << 28) + (local38.anIntArray534[0] + Static541.anInt9058 >> 6 << 14));
			if (local38.anInt1728 == -1) {
				local69.anInt7949 = local38.aClass108_7.method2164();
			} else {
				local69.anInt7949 = local38.anInt1728;
			}
			local69.aBoolean612 = local38.aBoolean137;
			local69.anInt7950 = local38.anInt6781;
			if (local38.anInt1747 > 0) {
				Static572.method7711(local38);
			}
			Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[arg1] = null;
			if (arg0.method5806(1) != 0) {
				Static84.method7265(arg1, arg0);
			}
		}
	}
}
