import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!dv;")
	public static Class29_Sub1 aClass29_Sub1_4;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array13;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
	public static int[] anIntArray557;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean378 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method4575() {
		if (!Static313.method4480()) {
			return;
		}
		if (Static38.aStringArray6 == null) {
			Static78.method1439();
		}
		Static333.anInt6107 = 0;
		Static6.aBoolean1 = true;
		try {
			Static431.aClipboard1 = Static271.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ap;IB)V")
	public static void method4577(@OriginalArg(0) Class1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = arg0.method321(1) == 1;
		if (local15) {
			Static17.anIntArray24[Static450.anInt7890++] = arg1;
		}
		@Pc(30) int local30 = arg0.method321(2);
		@Pc(34) Class30_Sub1_Sub1_Sub2 local34 = Static135.aClass30_Sub1_Sub1_Sub2Array1[arg1];
		if (local30 != 0) {
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local30 == 1) {
				local146 = arg0.method321(3);
				local151 = local34.anIntArray130[0];
				local156 = local34.anIntArray129[0];
				if (local146 == 0) {
					local151--;
					local156--;
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
					local156++;
					local151--;
				} else if (local146 == 6) {
					local156++;
				} else if (local146 == 7) {
					local151++;
					local156++;
				}
				if (local15) {
					local34.anInt1342 = local151;
					local34.aBoolean83 = true;
					local34.anInt1327 = local156;
				} else {
					local34.method963(Static5.aByteArray1[arg1], local156, local151);
				}
			} else if (local30 == 2) {
				local146 = arg0.method321(4);
				local151 = local34.anIntArray130[0];
				local156 = local34.anIntArray129[0];
				if (local146 == 0) {
					local156 -= 2;
					local151 -= 2;
				} else if (local146 == 1) {
					local151--;
					local156 -= 2;
				} else if (local146 == 2) {
					local156 -= 2;
				} else if (local146 == 3) {
					local151++;
					local156 -= 2;
				} else if (local146 == 4) {
					local156 -= 2;
					local151 += 2;
				} else if (local146 == 5) {
					local151 -= 2;
					local156--;
				} else if (local146 == 6) {
					local156--;
					local151 += 2;
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
					local151++;
					local156 += 2;
				} else if (local146 == 15) {
					local151 += 2;
					local156 += 2;
				}
				if (local15) {
					local34.anInt1327 = local156;
					local34.anInt1342 = local151;
					local34.aBoolean83 = true;
				} else {
					local34.method963(Static5.aByteArray1[arg1], local156, local151);
				}
			} else {
				local146 = arg0.method321(1);
				@Pc(391) int local391;
				@Pc(401) int local401;
				@Pc(414) int local414;
				@Pc(421) int local421;
				if (local146 == 0) {
					local151 = arg0.method321(12);
					local156 = local151 >> 10;
					local391 = local151 >> 5 & 0x1F;
					if (local391 > 15) {
						local391 -= 32;
					}
					local401 = local151 & 0x1F;
					if (local401 > 15) {
						local401 -= 32;
					}
					local414 = local391 + local34.anIntArray130[0];
					local421 = local401 + local34.anIntArray129[0];
					if (local15) {
						local34.anInt1327 = local421;
						local34.aBoolean83 = true;
						local34.anInt1342 = local414;
					} else {
						local34.method963(Static5.aByteArray1[arg1], local421, local414);
					}
					local34.aByte102 = (byte) (local156 + local34.aByte102 & 0x3);
					if (Static32.anInt894 == arg1) {
						Static426.anInt1486 = local34.aByte102;
					}
				} else {
					local151 = arg0.method321(30);
					local156 = local151 >> 28;
					local391 = local151 >> 14 & 0x3FFF;
					local401 = local151 & 0x3FFF;
					local414 = (local391 + Static278.anInt5374 + local34.anIntArray130[0] & 0x3FFF) - Static278.anInt5374;
					local421 = (local401 + Static380.anInt6896 + local34.anIntArray129[0] & 0x3FFF) - Static380.anInt6896;
					if (local15) {
						local34.aBoolean83 = true;
						local34.anInt1327 = local421;
						local34.anInt1342 = local414;
					} else {
						local34.method963(Static5.aByteArray1[arg1], local421, local414);
					}
					local34.aByte102 = (byte) (local156 + local34.aByte102 & 0x3);
					if (Static32.anInt894 == arg1) {
						Static426.anInt1486 = local34.aByte102;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean83 = false;
		} else if (arg1 == Static32.anInt894) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(65) Class155 local65 = Static413.aClass155Array1[arg1] = new Class155();
			local65.anInt4560 = (local34.anIntArray129[0] + Static380.anInt6896 >> 6) + (Static278.anInt5374 + local34.anIntArray130[0] >> 6 << 14) + (local34.aByte102 << 28);
			if (local34.anInt1318 == -1) {
				local65.anInt4563 = local34.aClass15_7.method327();
			} else {
				local65.anInt4563 = local34.anInt1318;
			}
			local65.aBoolean291 = local34.aBoolean85;
			local65.anInt4561 = local34.anInt1243;
			if (local34.anInt1329 > 0) {
				Static207.method3294(local34);
			}
			Static135.aClass30_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method321(1) != 0) {
				Static121.method5870(arg1, arg0);
			}
		}
	}
}
