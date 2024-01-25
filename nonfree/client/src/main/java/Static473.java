import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
	public static int[] anIntArray529;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	public static int anInt8493;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!us;")
	public static final Class344 aClass344_99 = new Class344(17, 4);

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_111 = new Class218(52, 2);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CI)C")
	public static char method7008(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!dfa;IB)V")
	public static void method7009(@OriginalArg(0) Class3_Sub15_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) boolean local17 = arg0.method2432(1) == 1;
		if (local17) {
			Static448.anIntArray508[Static420.anInt7818++] = arg1;
		}
		@Pc(40) int local40 = arg0.method2432(2);
		@Pc(44) Class2_Sub3_Sub1_Sub2_Sub2 local44 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[arg1];
		if (local40 != 0) {
			@Pc(159) int local159;
			@Pc(164) int local164;
			@Pc(169) int local169;
			if (local40 == 1) {
				local159 = arg0.method2432(3);
				local164 = local44.anIntArray378[0];
				local169 = local44.anIntArray377[0];
				if (local159 == 0) {
					local164--;
					local169--;
				} else if (local159 == 1) {
					local169--;
				} else if (local159 == 2) {
					local164++;
					local169--;
				} else if (local159 == 3) {
					local164--;
				} else if (local159 == 4) {
					local164++;
				} else if (local159 == 5) {
					local164--;
					local169++;
				} else if (local159 == 6) {
					local169++;
				} else if (local159 == 7) {
					local164++;
					local169++;
				}
				if (local17) {
					local44.anInt6376 = local164;
					local44.aBoolean539 = true;
					local44.anInt6359 = local169;
				} else {
					local44.method5323(local169, Static584.aByteArray98[arg1], local164);
				}
			} else if (local40 == 2) {
				local159 = arg0.method2432(4);
				local164 = local44.anIntArray378[0];
				local169 = local44.anIntArray377[0];
				if (local159 == 0) {
					local164 -= 2;
					local169 -= 2;
				} else if (local159 == 1) {
					local164--;
					local169 -= 2;
				} else if (local159 == 2) {
					local169 -= 2;
				} else if (local159 == 3) {
					local169 -= 2;
					local164++;
				} else if (local159 == 4) {
					local164 += 2;
					local169 -= 2;
				} else if (local159 == 5) {
					local169--;
					local164 -= 2;
				} else if (local159 == 6) {
					local169--;
					local164 += 2;
				} else if (local159 == 7) {
					local164 -= 2;
				} else if (local159 == 8) {
					local164 += 2;
				} else if (local159 == 9) {
					local164 -= 2;
					local169++;
				} else if (local159 == 10) {
					local164 += 2;
					local169++;
				} else if (local159 == 11) {
					local164 -= 2;
					local169 += 2;
				} else if (local159 == 12) {
					local164--;
					local169 += 2;
				} else if (local159 == 13) {
					local169 += 2;
				} else if (local159 == 14) {
					local164++;
					local169 += 2;
				} else if (local159 == 15) {
					local164 += 2;
					local169 += 2;
				}
				if (local17) {
					local44.aBoolean539 = true;
					local44.anInt6376 = local164;
					local44.anInt6359 = local169;
				} else {
					local44.method5323(local169, Static584.aByteArray98[arg1], local164);
				}
			} else {
				local159 = arg0.method2432(1);
				@Pc(431) int local431;
				@Pc(439) int local439;
				@Pc(450) int local450;
				@Pc(458) int local458;
				if (local159 == 0) {
					local164 = arg0.method2432(12);
					local169 = local164 >> 10;
					local431 = local164 >> 5 & 0x1F;
					if (local431 > 15) {
						local431 -= 32;
					}
					local439 = local164 & 0x1F;
					if (local439 > 15) {
						local439 -= 32;
					}
					local450 = local431 + local44.anIntArray378[0];
					local458 = local44.anIntArray377[0] + local439;
					if (local17) {
						local44.anInt6376 = local450;
						local44.anInt6359 = local458;
						local44.aBoolean539 = true;
					} else {
						local44.method5323(local458, Static584.aByteArray98[arg1], local450);
					}
					local44.aByte128 = local44.aByte129 = (byte) (local44.aByte128 + local169 & 0x3);
					if (Static525.method7485(local458, local450)) {
						local44.aByte129++;
					}
					if (Static399.anInt7626 == arg1) {
						if (Static552.anInt9440 != local44.aByte128) {
							Static160.aBoolean330 = true;
						}
						Static552.anInt9440 = local44.aByte128;
					}
				} else {
					local164 = arg0.method2432(30);
					local169 = local164 >> 28;
					local431 = local164 >> 14 & 0x3FFF;
					local439 = local164 & 0x3FFF;
					local450 = (local431 + Static446.anInt8090 + local44.anIntArray378[0] & 0x3FFF) - Static446.anInt8090;
					local458 = (local439 + Static124.anInt3150 + local44.anIntArray377[0] & 0x3FFF) - Static124.anInt3150;
					if (local17) {
						local44.anInt6376 = local450;
						local44.anInt6359 = local458;
						local44.aBoolean539 = true;
					} else {
						local44.method5323(local458, Static584.aByteArray98[arg1], local450);
					}
					local44.aByte128 = local44.aByte129 = (byte) (local169 + local44.aByte128 & 0x3);
					if (Static525.method7485(local458, local450)) {
						local44.aByte129++;
					}
					if (Static399.anInt7626 == arg1) {
						Static552.anInt9440 = local44.aByte128;
					}
				}
			}
		} else if (local17) {
			local44.aBoolean539 = false;
		} else if (arg1 == Static399.anInt7626) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(75) Class329 local75 = Static546.aClass329Array3[arg1] = new Class329();
			local75.anInt9633 = (local44.aByte128 << 28) - (-(local44.anIntArray378[0] + Static446.anInt8090 >> 6 << 14) - (local44.anIntArray377[0] + Static124.anInt3150 >> 6));
			if (local44.anInt6384 == -1) {
				local75.anInt9632 = local44.aClass145_7.method4535();
			} else {
				local75.anInt9632 = local44.anInt6384;
			}
			local75.anInt9630 = local44.anInt6331;
			local75.aBoolean805 = local44.aBoolean540;
			if (local44.anInt6362 > 0) {
				Static87.method2245(local44);
			}
			Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[arg1] = null;
			if (arg0.method2432(1) != 0) {
				Static630.method8539(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	public static int method7011() {
		@Pc(7) Class33 local7 = Static47.aClass33_3;
		@Pc(9) boolean local9 = false;
		if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local7 = Static322.method5439(null, null, 0, local21, 0);
			local9 = true;
		}
		@Pc(43) long local43 = Static444.method6719();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local7.method6163();
		}
		@Pc(74) int local74 = (int) (Static444.method6719() - local43);
		local7.method6209(0, 100, 100, 0, -16777216);
		if (local9) {
			local7.method6151();
		}
		return local74;
	}
}
