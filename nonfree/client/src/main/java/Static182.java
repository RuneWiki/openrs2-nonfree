import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZZI)V")
	public static void method2647(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static288.anInt5046++;
			Static163.method4685();
		}
		if (arg1) {
			Static134.anInt2410++;
			Static241.method3475();
		}
	}

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "(I)V")
	public static void method2648() {
		if (Static90.aFrame1 != null) {
			return;
		}
		@Pc(20) Container local20;
		if (Static411.aFrame2 == null) {
			local20 = Static183.aClass83_2.anApplet1;
		} else {
			local20 = Static411.aFrame2;
		}
		Static187.anInt3236 = local20.getSize().width;
		Static285.anInt5014 = local20.getSize().height;
		@Pc(38) Insets local38;
		if (local20 == Static411.aFrame2) {
			local38 = Static411.aFrame2.getInsets();
			Static285.anInt5014 -= local38.bottom + local38.top;
			Static187.anInt3236 -= local38.right + local38.left;
		}
		if (Static101.method1560() == 1) {
			Static338.anInt5777 = Static252.anInt4573;
			Static69.anInt1304 = Static313.anInt5427;
			Static335.anInt5705 = (Static187.anInt3236 - Static313.anInt5427) / 2;
			Static51.anInt869 = 0;
		} else if (Static270.anInt4858 < 96 && Static14.anInt293 == 0) {
			@Pc(77) int local77 = Static187.anInt3236 <= 1024 ? Static187.anInt3236 : 1024;
			@Pc(84) int local84 = Static285.anInt5014 > 768 ? 768 : Static285.anInt5014;
			Static335.anInt5705 = (Static187.anInt3236 - local77) / 2;
			Static69.anInt1304 = local77;
			Static51.anInt869 = 0;
			Static338.anInt5777 = local84;
		} else {
			Static338.anInt5777 = Static285.anInt5014;
			Static51.anInt869 = 0;
			Static335.anInt5705 = 0;
			Static69.anInt1304 = Static187.anInt3236;
		}
		if (Static328.aClass30_10 != Static459.aClass30_13) {
			@Pc(136) boolean local136;
			if (Static69.anInt1304 < 1024 && Static338.anInt5777 < 768) {
				local136 = true;
			} else {
				local136 = false;
			}
		}
		Static392.aCanvas5.setSize(Static69.anInt1304, Static338.anInt5777);
		if (Static185.aClass34_7 != null) {
			Static185.aClass34_7.method5735(Static392.aCanvas5);
		}
		if (local20 == Static411.aFrame2) {
			local38 = Static411.aFrame2.getInsets();
			Static392.aCanvas5.setLocation(local38.left + Static335.anInt5705, Static51.anInt869 + local38.top);
		} else {
			Static392.aCanvas5.setLocation(Static335.anInt5705, Static51.anInt869);
		}
		if (Static207.anInt6026 != -1) {
			Static336.method4513(true);
		}
		Static263.method3723();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLclient!fo;)V")
	public static void method2649(@OriginalArg(1) Class82 arg0) {
		Static34.anInt596 = 0;
		Static342.anInt5862 = 0;
		Static78.aClass262_8 = new Class262();
		Static392.aClass4_Sub1_Sub2_Sub1Array2 = new Class4_Sub1_Sub2_Sub1[1024];
		Static187.method2685(arg0);
		Static311.method4239(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
	public static void method2650() {
		if (Static453.aClass136_Sub1_1.method3520(Static14.anInt293) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static49.anInt840 - 4 & 0xFF);
		@Pc(25) int local25 = Static49.anInt840 % Static296.anInt5187;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (@Pc(31) int local31 = 0; local31 < Static206.anInt3607; local31++) {
				Static41.aByteArrayArrayArray4[local27][local25][local31] = local21;
			}
		}
		if (Static265.anInt4807 == 3) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < 2; local67++) {
			Static416.anIntArray463[local67] = -1000000;
			Static318.anIntArray225[local67] = 1000000;
			Static338.anIntArray396[local67] = 0;
			Static447.anIntArray280[local67] = 1000000;
			Static437.anIntArray494[local67] = 0;
		}
		@Pc(138) int local138;
		if (Static333.anInt5693 != 1) {
			local138 = Static335.method4499(Static265.anInt4807, Static213.anInt258, Static360.anInt6145);
			if (local138 - Static391.anInt6529 >= 800 || (Static147.aByteArrayArrayArray22[Static265.anInt4807][Static213.anInt258 >> 7][Static360.anInt6145 >> 7] & 0x4) == 0) {
				return;
			}
			Static244.method3505(Static359.aClass169ArrayArrayArray5, 1, Static213.anInt258 >> 7, false, Static360.anInt6145 >> 7);
			return;
		}
		if ((Static147.aByteArrayArrayArray22[Static265.anInt4807][Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >> 7][Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >> 7] & 0x4) != 0) {
			Static244.method3505(Static359.aClass169ArrayArrayArray5, 0, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >> 7, false, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >> 7);
		}
		if (Static340.anInt5790 >= 2560) {
			return;
		}
		local138 = Static213.anInt258 >> 7;
		@Pc(142) int local142 = Static360.anInt6145 >> 7;
		@Pc(147) int local147 = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >> 7;
		@Pc(152) int local152 = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >> 7;
		@Pc(164) int local164;
		if (local138 >= local147) {
			local164 = local138 - local147;
		} else {
			local164 = local147 - local138;
		}
		@Pc(178) int local178;
		if (local142 < local152) {
			local178 = local152 - local142;
		} else {
			local178 = local142 - local152;
		}
		if ((local164 != 0 || local178 != 0) && (-Static296.anInt5187) < local164 && Static296.anInt5187 > local164 && local178 > -Static206.anInt3607 && local178 < Static206.anInt3607) {
			@Pc(258) int local258;
			@Pc(260) int local260;
			if (local178 >= local164) {
				local258 = local164 * 65536 / local178;
				local260 = 32768;
				while (local152 != local142) {
					if (local152 > local142) {
						local142++;
					} else if (local152 < local142) {
						local142--;
					}
					if ((Static147.aByteArrayArrayArray22[Static265.anInt4807][local138][local142] & 0x4) != 0) {
						Static244.method3505(Static359.aClass169ArrayArrayArray5, 1, local138, false, local142);
						return;
					}
					local260 += local258;
					if (local260 >= 65536) {
						if (local138 < local147) {
							local138++;
						} else if (local138 > local147) {
							local138--;
						}
						local260 -= 65536;
						if ((Static147.aByteArrayArrayArray22[Static265.anInt4807][local138][local142] & 0x4) != 0) {
							Static244.method3505(Static359.aClass169ArrayArrayArray5, 1, local138, false, local142);
							return;
						}
					}
				}
				return;
			}
			local258 = local178 * 65536 / local164;
			local260 = 32768;
			while (local147 != local138) {
				if (local138 < local147) {
					local138++;
				} else if (local147 < local138) {
					local138--;
				}
				if ((Static147.aByteArrayArrayArray22[Static265.anInt4807][local138][local142] & 0x4) != 0) {
					Static244.method3505(Static359.aClass169ArrayArrayArray5, 1, local138, false, local142);
					return;
				}
				local260 += local258;
				if (local260 >= 65536) {
					local260 -= 65536;
					if (local152 > local142) {
						local142++;
					} else if (local142 > local152) {
						local142--;
					}
					if ((Static147.aByteArrayArrayArray22[Static265.anInt4807][local138][local142] & 0x4) != 0) {
						Static244.method3505(Static359.aClass169ArrayArrayArray5, 1, local138, false, local142);
						return;
					}
				}
			}
			return;
		}
		Static55.method972(null, "RC: " + local138 + "," + local142 + " " + local147 + "," + local152 + " " + Static199.anInt3480 + "," + Static164.anInt2731);
		return;
	}
}
