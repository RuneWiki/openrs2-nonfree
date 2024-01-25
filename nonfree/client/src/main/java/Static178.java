import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "[I")
	public static final int[] anIntArray180 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIZ)I")
	public static int method3226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class4_Sub18 local8 = Static72.method6564(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && local8.anIntArray143.length > arg0) {
			return local8.anIntArray143[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZLclient!dc;)V")
	public static void method3227(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11_Sub1 arg1) {
		@Pc(15) boolean local15 = arg1.method1530(1) == 1;
		if (local15) {
			Static493.anIntArray483[Static70.anInt1211++] = arg0;
		}
		@Pc(30) int local30 = arg1.method1530(2);
		@Pc(38) Class1_Sub4_Sub2_Sub1_Sub2 local38 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[arg0];
		if (local30 != 0) {
			@Pc(157) int local157;
			@Pc(162) int local162;
			@Pc(167) int local167;
			if (local30 == 1) {
				local157 = arg1.method1530(3);
				local162 = local38.anIntArray463[0];
				local167 = local38.anIntArray462[0];
				if (local157 == 0) {
					local167--;
					local162--;
				} else if (local157 == 1) {
					local167--;
				} else if (local157 == 2) {
					local167--;
					local162++;
				} else if (local157 == 3) {
					local162--;
				} else if (local157 == 4) {
					local162++;
				} else if (local157 == 5) {
					local162--;
					local167++;
				} else if (local157 == 6) {
					local167++;
				} else if (local157 == 7) {
					local162++;
					local167++;
				}
				if (local15) {
					local38.aBoolean595 = true;
					local38.anInt8455 = local162;
					local38.anInt8450 = local167;
				} else {
					local38.method6944(local167, local162, Static278.aByteArray67[arg0]);
				}
			} else if (local30 == 2) {
				local157 = arg1.method1530(4);
				local162 = local38.anIntArray463[0];
				local167 = local38.anIntArray462[0];
				if (local157 == 0) {
					local167 -= 2;
					local162 -= 2;
				} else if (local157 == 1) {
					local167 -= 2;
					local162--;
				} else if (local157 == 2) {
					local167 -= 2;
				} else if (local157 == 3) {
					local167 -= 2;
					local162++;
				} else if (local157 == 4) {
					local162 += 2;
					local167 -= 2;
				} else if (local157 == 5) {
					local162 -= 2;
					local167--;
				} else if (local157 == 6) {
					local167--;
					local162 += 2;
				} else if (local157 == 7) {
					local162 -= 2;
				} else if (local157 == 8) {
					local162 += 2;
				} else if (local157 == 9) {
					local162 -= 2;
					local167++;
				} else if (local157 == 10) {
					local167++;
					local162 += 2;
				} else if (local157 == 11) {
					local167 += 2;
					local162 -= 2;
				} else if (local157 == 12) {
					local162--;
					local167 += 2;
				} else if (local157 == 13) {
					local167 += 2;
				} else if (local157 == 14) {
					local162++;
					local167 += 2;
				} else if (local157 == 15) {
					local167 += 2;
					local162 += 2;
				}
				if (local15) {
					local38.aBoolean595 = true;
					local38.anInt8455 = local162;
					local38.anInt8450 = local167;
				} else {
					local38.method6944(local167, local162, Static278.aByteArray67[arg0]);
				}
			} else {
				local157 = arg1.method1530(1);
				@Pc(434) int local434;
				@Pc(444) int local444;
				@Pc(457) int local457;
				@Pc(464) int local464;
				if (local157 == 0) {
					local162 = arg1.method1530(12);
					local167 = local162 >> 10;
					local434 = local162 >> 5 & 0x1F;
					if (local434 > 15) {
						local434 -= 32;
					}
					local444 = local162 & 0x1F;
					if (local444 > 15) {
						local444 -= 32;
					}
					local457 = local38.anIntArray463[0] + local434;
					local464 = local444 + local38.anIntArray462[0];
					if (local15) {
						local38.anInt8450 = local464;
						local38.aBoolean595 = true;
						local38.anInt8455 = local457;
					} else {
						local38.method6944(local464, local457, Static278.aByteArray67[arg0]);
					}
					local38.aByte126 = local38.aByte127 = (byte) (local167 + local38.aByte126 & 0x3);
					if (Static310.method5267(local457, local464)) {
						local38.aByte127++;
					}
					if (arg0 == Static411.anInt7797) {
						Static13.anInt231 = local38.aByte126;
					}
				} else {
					local162 = arg1.method1530(30);
					local167 = local162 >> 28;
					local434 = local162 >> 14 & 0x3FFF;
					local444 = local162 & 0x3FFF;
					local457 = (local434 + Static552.anInt9805 + local38.anIntArray463[0] & 0x3FFF) - Static552.anInt9805;
					local464 = (local38.anIntArray462[0] + Static254.anInt4667 + local444 & 0x3FFF) - Static254.anInt4667;
					if (local15) {
						local38.anInt8450 = local464;
						local38.anInt8455 = local457;
						local38.aBoolean595 = true;
					} else {
						local38.method6944(local464, local457, Static278.aByteArray67[arg0]);
					}
					local38.aByte126 = local38.aByte127 = (byte) (local38.aByte126 + local167 & 0x3);
					if (Static310.method5267(local457, local464)) {
						local38.aByte127++;
					}
					if (arg0 == Static411.anInt7797) {
						Static13.anInt231 = local38.aByte126;
					}
				}
			}
		} else if (local15) {
			local38.aBoolean595 = false;
		} else if (Static411.anInt7797 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(69) Class41 local69 = Static61.aClass41Array1[arg0] = new Class41();
			local69.anInt765 = (local38.anIntArray463[0] + Static552.anInt9805 >> 6 << 14) + ((local38.aByte126 << 28) + (local38.anIntArray462[0] + Static254.anInt4667 >> 6));
			if (local38.anInt8461 == -1) {
				local69.anInt764 = local38.aClass229_7.method5582();
			} else {
				local69.anInt764 = local38.anInt8461;
			}
			local69.anInt762 = local38.anInt8405;
			local69.aBoolean37 = local38.aBoolean594;
			if (local38.anInt8454 > 0) {
				Static397.method6281(local38);
			}
			Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[arg0] = null;
			if (arg1.method1530(1) != 0) {
				Static52.method682(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)V")
	public static void method3228(@OriginalArg(0) int arg0) {
		if (!Static478.method7175(arg0)) {
			return;
		}
		@Pc(22) Class225[] local22 = Static343.aClass225ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class225 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt6541 = 0;
				local30.anInt6512 = 0;
				local30.anInt6530 = 1;
			}
		}
	}
}
