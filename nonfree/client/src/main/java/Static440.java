import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_147 = new Class126(104, 6);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!kka;II)V")
	public static void method6409(@OriginalArg(0) Class3_Sub17_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method4905(1) == 1;
		if (local15) {
			Static294.anIntArray233[Static519.anInt8681++] = arg1;
		}
		@Pc(32) int local32 = arg0.method4905(2);
		@Pc(36) Class23_Sub2_Sub1_Sub2_Sub1 local36 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[arg1];
		if (local32 != 0) {
			@Pc(155) int local155;
			@Pc(160) int local160;
			@Pc(165) int local165;
			if (local32 == 1) {
				local155 = arg0.method4905(3);
				local160 = local36.anIntArray659[0];
				local165 = local36.anIntArray660[0];
				if (local155 == 0) {
					local160--;
					local165--;
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
					local165++;
					local160++;
				}
				if (local15) {
					local36.aBoolean257 = true;
					local36.anInt3281 = local160;
					local36.anInt3257 = local165;
				} else {
					local36.method2908(local160, Static460.aByteArray73[arg1], local165);
				}
			} else if (local32 == 2) {
				local155 = arg0.method4905(4);
				local160 = local36.anIntArray659[0];
				local165 = local36.anIntArray660[0];
				if (local155 == 0) {
					local160 -= 2;
					local165 -= 2;
				} else if (local155 == 1) {
					local160--;
					local165 -= 2;
				} else if (local155 == 2) {
					local165 -= 2;
				} else if (local155 == 3) {
					local160++;
					local165 -= 2;
				} else if (local155 == 4) {
					local160 += 2;
					local165 -= 2;
				} else if (local155 == 5) {
					local160 -= 2;
					local165--;
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
					local160 += 2;
					local165++;
				} else if (local155 == 11) {
					local165 += 2;
					local160 -= 2;
				} else if (local155 == 12) {
					local160--;
					local165 += 2;
				} else if (local155 == 13) {
					local165 += 2;
				} else if (local155 == 14) {
					local160++;
					local165 += 2;
				} else if (local155 == 15) {
					local165 += 2;
					local160 += 2;
				}
				if (local15) {
					local36.anInt3281 = local160;
					local36.aBoolean257 = true;
					local36.anInt3257 = local165;
				} else {
					local36.method2908(local160, Static460.aByteArray73[arg1], local165);
				}
			} else {
				local155 = arg0.method4905(1);
				@Pc(426) int local426;
				@Pc(434) int local434;
				@Pc(448) int local448;
				@Pc(455) int local455;
				if (local155 == 0) {
					local160 = arg0.method4905(12);
					local165 = local160 >> 10;
					local426 = local160 >> 5 & 0x1F;
					if (local426 > 15) {
						local426 -= 32;
					}
					local434 = local160 & 0x1F;
					if (local434 > 15) {
						local434 -= 32;
					}
					local448 = local36.anIntArray659[0] + local426;
					local455 = local434 + local36.anIntArray660[0];
					if (local15) {
						local36.aBoolean257 = true;
						local36.anInt3257 = local455;
						local36.anInt3281 = local448;
					} else {
						local36.method2908(local448, Static460.aByteArray73[arg1], local455);
					}
					local36.aByte142 = local36.aByte143 = (byte) (local36.aByte142 + local165 & 0x3);
					if (Static190.method3051(local455, local448)) {
						local36.aByte143++;
					}
					if (Static251.anInt4687 == arg1) {
						if (Static576.anInt9136 != local36.aByte142) {
							Static674.aBoolean763 = true;
						}
						Static576.anInt9136 = local36.aByte142;
					}
				} else {
					local160 = arg0.method4905(30);
					local165 = local160 >> 28;
					local426 = local160 >> 14 & 0x3FFF;
					local434 = local160 & 0x3FFF;
					local448 = (Static417.anInt7047 + local36.anIntArray659[0] + local426 & 0x3FFF) - Static417.anInt7047;
					local455 = (local434 + Static347.anInt7851 + local36.anIntArray660[0] & 0x3FFF) - Static347.anInt7851;
					if (local15) {
						local36.aBoolean257 = true;
						local36.anInt3257 = local455;
						local36.anInt3281 = local448;
					} else {
						local36.method2908(local448, Static460.aByteArray73[arg1], local455);
					}
					local36.aByte142 = local36.aByte143 = (byte) (local36.aByte142 + local165 & 0x3);
					if (Static190.method3051(local455, local448)) {
						local36.aByte143++;
					}
					if (Static251.anInt4687 == arg1) {
						Static576.anInt9136 = local36.aByte142;
					}
				}
			}
		} else if (local15) {
			local36.aBoolean257 = false;
		} else if (arg1 == Static251.anInt4687) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(67) Class210 local67 = Static622.aClass210Array1[arg1] = new Class210();
			local67.anInt5738 = (Static417.anInt7047 + local36.anIntArray659[0] >> 6 << 14) + (local36.aByte142 << 28) + (local36.anIntArray660[0] + Static347.anInt7851 >> 6);
			if (local36.anInt3262 == -1) {
				local67.anInt5740 = local36.aClass314_7.method7395();
			} else {
				local67.anInt5740 = local36.anInt3262;
			}
			local67.aBoolean450 = local36.aBoolean262;
			local67.aBoolean451 = local36.aBoolean261;
			local67.anInt5737 = local36.anInt10178;
			if (local36.anInt3268 > 0) {
				Static532.method7413(local36);
			}
			Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method4905(1) != 0) {
				Static587.method7887(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLclient!cda;Lclient!ha;)I")
	public static int method6411(@OriginalArg(1) Class55 arg0, @OriginalArg(2) Class16 arg1) {
		if (arg0.anInt1613 != -1) {
			return arg0.anInt1613;
		}
		if (arg0.anInt1621 != -1) {
			@Pc(23) Class342 local23 = arg1.anInterface5_12.method5193(arg0.anInt1621);
			if (!local23.aBoolean693) {
				return local23.aShort117;
			}
		}
		return arg0.anInt1618;
	}
}
