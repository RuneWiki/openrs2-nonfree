import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)Lclient!ob;")
	public static Class260 method8573() {
		return Static188.method3527(Static37.anInt498) ? Static525.aClass260_3 : Static525.aClass260_4;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)V")
	public static void method8575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = Static228.aClass53_7.method824(Static50.aClass43_24.method596(Static601.anInt9518));
		@Pc(55) int local55;
		@Pc(33) int local33;
		if (Static84.aBoolean110) {
			for (@Pc(76) Class6_Sub2_Sub2 local76 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2071(); local76 != null; local76 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2078()) {
				if (local76.anInt618 == 1) {
					local33 = Static225.method4050((Class6_Sub2_Sub11) local76.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65);
				} else {
					local33 = Static164.method3256(local76);
				}
				if (local33 > local18) {
					local18 = local33;
				}
			}
			local55 = Static574.anInt9192 * 16 + 21;
			Static49.anInt592 = Static574.anInt9192 * 16 + (Static356.aBoolean442 ? 26 : 22);
			local18 += 8;
		} else {
			for (@Pc(25) Class6_Sub2_Sub11 local25 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local25 != null; local25 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
				local33 = Static225.method4050(local25);
				if (local33 > local18) {
					local18 = local33;
				}
			}
			local55 = Static539.anInt8776 * 16 + 21;
			local18 += 8;
			Static49.anInt592 = (Static356.aBoolean442 ? 26 : 22) + Static539.anInt8776 * 16;
		}
		@Pc(143) int local143 = arg0 - local18 / 2;
		if (local143 + local18 > Static535.anInt4128) {
			local143 = Static535.anInt4128 - local18;
		}
		if (local143 < 0) {
			local143 = 0;
		}
		local33 = arg1;
		if (Static274.anInt3226 < local55 + arg1) {
			local33 = Static274.anInt3226 - local55;
		}
		if (local33 < 0) {
			local33 = 0;
		}
		Static25.anInt354 = local143;
		Static406.anInt7073 = local18;
		Static243.anInt4678 = local33;
		Static484.aBoolean623 = true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BIILclient!lga;)Lclient!cd;")
	public static Class53 method8576(@OriginalArg(1) int arg0, @OriginalArg(3) Class223 arg1) {
		@Pc(9) byte[] local9 = arg1.method5267(0, arg0);
		return local9 == null ? null : new Class53(local9);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
	public static int method8578() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static651.aClass122_38.aBoolean281 && !Static651.aClass122_38.aBoolean282) {
			local7 = true;
			if (Static192.aClass6_Sub1_1.anInt39 < 512 && Static192.aClass6_Sub1_1.anInt39 != 0) {
				local7 = false;
			}
			if (Static174.aString36.startsWith("win")) {
				local11 = true;
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (Static363.aBoolean454) {
			local11 = false;
		}
		if (Static114.aBoolean194) {
			local7 = false;
		}
		if (Static419.aBoolean540) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static558.method7885();
		}
		@Pc(79) int local79 = -1;
		@Pc(81) int local81 = -1;
		@Pc(83) int local83 = -1;
		if (local7) {
			try {
				local79 = Static565.method7970(2, 1000);
			} catch (@Pc(92) Exception local92) {
			}
		}
		if (local11) {
			try {
				local83 = Static565.method7970(3, 1000);
				if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 3) {
					@Pc(109) Class52 local109 = Static202.aClass75_5.method6699();
					@Pc(114) long local114 = local109.aLong40 & 0xFFFFFFFFFFFFL;
					@Pc(117) int local117 = local109.anInt780;
					if (local117 == 4318) {
						local9 &= local114 >= 64425238954L;
					} else if (local117 == 4098) {
						local9 &= local114 >= 60129613779L;
					}
				}
			} catch (@Pc(163) Exception local163) {
			}
		}
		if (local9) {
			try {
				local81 = Static565.method7970(1, 1000);
			} catch (@Pc(173) Exception local173) {
			}
		}
		if (local79 == -1 && local81 == -1 && local83 == -1) {
			return Static558.method7885();
		}
		local83 = (int) ((float) local83 * 1.1F);
		local81 = (int) ((float) local81 * 1.1F);
		if (local79 > local83 && local79 > local81) {
			return Static449.method6927(local79);
		} else if (local81 >= local83) {
			return Static90.method8267(1, local81);
		} else {
			return Static90.method8267(3, local83);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Z")
	public static boolean method8579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static577.method8048(arg0, arg1) || Static584.method8153(arg0, arg1);
	}
}
