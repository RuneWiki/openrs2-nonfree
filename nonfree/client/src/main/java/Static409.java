import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!af;I)V")
	public static void method5611(@OriginalArg(1) Class3_Sub4_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method333(1) == 1;
		if (local15) {
			Static135.anIntArray143[Static320.anInt5359++] = arg1;
		}
		@Pc(30) int local30 = arg0.method333(2);
		@Pc(34) Class34_Sub1_Sub1_Sub2_Sub1 local34 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(155) int local155;
			@Pc(160) int local160;
			@Pc(165) int local165;
			if (local30 == 1) {
				local155 = arg0.method333(3);
				local160 = local34.anIntArray529[0];
				local165 = local34.anIntArray528[0];
				if (local155 == 0) {
					local165--;
					local160--;
				} else if (local155 == 1) {
					local165--;
				} else if (local155 == 2) {
					local165--;
					local160++;
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
					local34.anInt1788 = local160;
					local34.anInt1804 = local165;
					local34.aBoolean143 = true;
				} else {
					local34.method1492(local160, local165, Static121.aByteArray13[arg1]);
				}
			} else if (local30 == 2) {
				local155 = arg0.method333(4);
				local160 = local34.anIntArray529[0];
				local165 = local34.anIntArray528[0];
				if (local155 == 0) {
					local160 -= 2;
					local165 -= 2;
				} else if (local155 == 1) {
					local165 -= 2;
					local160--;
				} else if (local155 == 2) {
					local165 -= 2;
				} else if (local155 == 3) {
					local165 -= 2;
					local160++;
				} else if (local155 == 4) {
					local165 -= 2;
					local160 += 2;
				} else if (local155 == 5) {
					local160 -= 2;
					local165--;
				} else if (local155 == 6) {
					local165--;
					local160 += 2;
				} else if (local155 == 7) {
					local160 -= 2;
				} else if (local155 == 8) {
					local160 += 2;
				} else if (local155 == 9) {
					local165++;
					local160 -= 2;
				} else if (local155 == 10) {
					local160 += 2;
					local165++;
				} else if (local155 == 11) {
					local165 += 2;
					local160 -= 2;
				} else if (local155 == 12) {
					local165 += 2;
					local160--;
				} else if (local155 == 13) {
					local165 += 2;
				} else if (local155 == 14) {
					local165 += 2;
					local160++;
				} else if (local155 == 15) {
					local165 += 2;
					local160 += 2;
				}
				if (local15) {
					local34.anInt1804 = local165;
					local34.anInt1788 = local160;
					local34.aBoolean143 = true;
				} else {
					local34.method1492(local160, local165, Static121.aByteArray13[arg1]);
				}
			} else {
				local155 = arg0.method333(1);
				@Pc(436) int local436;
				@Pc(444) int local444;
				@Pc(456) int local456;
				@Pc(464) int local464;
				if (local155 == 0) {
					local160 = arg0.method333(12);
					local165 = local160 >> 10;
					local436 = local160 >> 5 & 0x1F;
					if (local436 > 15) {
						local436 -= 32;
					}
					local444 = local160 & 0x1F;
					if (local444 > 15) {
						local444 -= 32;
					}
					local456 = local34.anIntArray529[0] + local436;
					local464 = local34.anIntArray528[0] + local444;
					if (local15) {
						local34.aBoolean143 = true;
						local34.anInt1788 = local456;
						local34.anInt1804 = local464;
					} else {
						local34.method1492(local456, local464, Static121.aByteArray13[arg1]);
					}
					local34.aByte132 = local34.aByte131 = (byte) (local34.aByte132 + local165 & 0x3);
					if (Static209.method3118(local456, local464)) {
						local34.aByte131++;
					}
					if (arg1 == Static291.anInt4955) {
						if (local34.aByte132 != Static570.anInt9192) {
							Static182.aBoolean246 = true;
						}
						Static570.anInt9192 = local34.aByte132;
					}
				} else {
					local160 = arg0.method333(30);
					local165 = local160 >> 28;
					local436 = local160 >> 14 & 0x3FFF;
					local444 = local160 & 0x3FFF;
					local456 = (local34.anIntArray529[0] + Static534.anInt8358 + local436 & 0x3FFF) - Static534.anInt8358;
					local464 = (Static402.anInt6661 + local34.anIntArray528[0] + local444 & 0x3FFF) - Static402.anInt6661;
					if (local15) {
						local34.anInt1788 = local456;
						local34.anInt1804 = local464;
						local34.aBoolean143 = true;
					} else {
						local34.method1492(local456, local464, Static121.aByteArray13[arg1]);
					}
					local34.aByte132 = local34.aByte131 = (byte) (local165 + local34.aByte132 & 0x3);
					if (Static209.method3118(local456, local464)) {
						local34.aByte131++;
					}
					if (arg1 == Static291.anInt4955) {
						Static570.anInt9192 = local34.aByte132;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean143 = false;
		} else if (arg1 == Static291.anInt4955) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(63) Class180 local63 = Static334.aClass180Array3[arg1] = new Class180();
			local63.anInt4734 = (local34.aByte132 << 28) + (Static534.anInt8358 + local34.anIntArray529[0] >> 6 << 14) + (Static402.anInt6661 - -local34.anIntArray528[0] >> 6);
			if (local34.anInt1799 == -1) {
				local63.anInt4735 = local34.aClass292_7.method6390();
			} else {
				local63.anInt4735 = local34.anInt1799;
			}
			local63.anInt4733 = local34.anInt9673;
			local63.aBoolean311 = local34.aBoolean146;
			local63.aBoolean312 = local34.aBoolean144;
			if (local34.anInt1787 > 0) {
				Static78.method1308(local34);
			}
			Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method333(1) != 0) {
				Static8.method118(arg0, arg1);
			}
		}
	}
}
