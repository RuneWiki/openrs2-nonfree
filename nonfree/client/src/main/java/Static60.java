import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!fe", name = "jb", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fe", name = "bb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][13][13];

	@OriginalMember(owner = "client!fe", name = "nb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_410 = Static231.method3737("http:)4)4");

	@OriginalMember(owner = "client!fe", name = "pb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_411 = Static231.method3737("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!fe", name = "rb", descriptor = "J")
	public static long aLong45 = 0L;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I")
	public static int method1155(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!oh;B)V")
	public static void method1156(@OriginalArg(0) Class1_Sub22 arg0) {
		Static29.method577(200000, arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILclient!jb;)Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1 method1157(@OriginalArg(0) int arg0, @OriginalArg(3) Class28 arg1) {
		return Static83.method1393(arg0, arg1) ? Static85.method1459() : null;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
	public static void method1158() {
		if (Static25.method453() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static157.anInt3451 - 4 & 0xFF);
		@Pc(23) int local23 = Static157.anInt3451 % 104;
		@Pc(34) int local34;
		for (@Pc(30) int local30 = 0; local30 < 4; local30++) {
			for (local34 = 0; local34 < 104; local34++) {
				Static186.aByteArrayArrayArray11[local30][local23][local34] = local19;
			}
		}
		if (Static191.anInt4237 == 3) {
			return;
		}
		for (local34 = 0; local34 < 2; local34++) {
			Static165.anIntArray226[local34] = -1000000;
			Static158.anIntArray304[local34] = 1000000;
			Static230.anIntArray381[local34] = 0;
			Static96.anIntArray211[local34] = 1000000;
			Static191.anIntArray348[local34] = 0;
		}
		@Pc(97) int local97;
		if (Static61.anInt1480 != 1) {
			local97 = Static130.method2174(Static191.anInt4237, Static29.anInt577, Static22.anInt435);
			if (local97 - Static69.anInt1578 < 800 && (Static221.aByteArrayArrayArray14[Static191.anInt4237][Static22.anInt435 >> 7][Static29.anInt577 >> 7] & 0x4) != 0) {
				Static184.method3038(Static22.anInt435 >> 7, Static174.aClass1_Sub9ArrayArrayArray2, false, 1, Static29.anInt577 >> 7);
				return;
			}
			return;
		}
		if ((Static221.aByteArrayArrayArray14[Static191.anInt4237][Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7][Static204.aClass5_Sub5_Sub1_2.anInt3044 >> 7] & 0x4) != 0) {
			Static184.method3038(Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7, Static174.aClass1_Sub9ArrayArrayArray2, false, 0, Static204.aClass5_Sub5_Sub1_2.anInt3044 >> 7);
		}
		if (Static6.anInt2981 >= 310) {
			return;
		}
		@Pc(172) int local172 = Static29.anInt577 >> 7;
		@Pc(177) int local177 = Static204.aClass5_Sub5_Sub1_2.anInt3044 >> 7;
		@Pc(182) int local182 = Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7;
		local97 = Static22.anInt435 >> 7;
		@Pc(198) int local198;
		if (local177 > local172) {
			local198 = local177 - local172;
		} else {
			local198 = local172 - local177;
		}
		@Pc(212) int local212;
		if (local97 >= local182) {
			local212 = local97 - local182;
		} else {
			local212 = local182 - local97;
		}
		@Pc(231) int local231;
		@Pc(233) int local233;
		if (local212 > local198) {
			local231 = local198 * 65536 / local212;
			local233 = 32768;
			while (local182 != local97) {
				if (local97 < local182) {
					local97++;
				} else if (local182 < local97) {
					local97--;
				}
				if ((Static221.aByteArrayArrayArray14[Static191.anInt4237][local97][local172] & 0x4) != 0) {
					Static184.method3038(local97, Static174.aClass1_Sub9ArrayArrayArray2, false, 1, local172);
					return;
				}
				local233 += local231;
				if (local233 >= 65536) {
					if (local172 < local177) {
						local172++;
					} else if (local177 < local172) {
						local172--;
					}
					local233 -= 65536;
					if ((Static221.aByteArrayArrayArray14[Static191.anInt4237][local97][local172] & 0x4) != 0) {
						Static184.method3038(local97, Static174.aClass1_Sub9ArrayArrayArray2, false, 1, local172);
						return;
					}
				}
			}
			return;
		}
		local231 = local212 * 65536 / local198;
		local233 = 32768;
		while (local172 != local177) {
			if (local172 < local177) {
				local172++;
			} else if (local177 < local172) {
				local172--;
			}
			if ((Static221.aByteArrayArrayArray14[Static191.anInt4237][local97][local172] & 0x4) != 0) {
				Static184.method3038(local97, Static174.aClass1_Sub9ArrayArrayArray2, false, 1, local172);
				return;
			}
			local233 += local231;
			if (local233 >= 65536) {
				local233 -= 65536;
				if (local97 < local182) {
					local97++;
				} else if (local97 > local182) {
					local97--;
				}
				if ((Static221.aByteArrayArrayArray14[Static191.anInt4237][local97][local172] & 0x4) != 0) {
					Static184.method3038(local97, Static174.aClass1_Sub9ArrayArrayArray2, false, 1, local172);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(JZII)Lclient!sc;")
	public static Class107 method1160(@OriginalArg(0) long arg0) {
		@Pc(26) int local26 = 1;
		for (@Pc(31) long local31 = arg0 / (long) 10; local31 != 0L; local31 /= 10) {
			local26++;
		}
		@Pc(47) int local47 = local26;
		if (arg0 < 0L) {
			local47 = local26 + 1;
		}
		@Pc(65) byte[] local65 = new byte[local47];
		if (arg0 < 0L) {
			local65[0] = 45;
		}
		for (@Pc(85) int local85 = 0; local85 < local26; local85++) {
			@Pc(93) int local93 = (int) (arg0 % (long) 10);
			if (local93 < 0) {
				local93 = -local93;
			}
			arg0 /= 10;
			if (local93 > 9) {
				local93 += 39;
			}
			local65[local47 - local85 - 1] = (byte) (local93 + 48);
		}
		@Pc(134) Class107 local134 = new Class107();
		local134.aByteArray55 = local65;
		local134.anInt4186 = local47;
		return local134;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1161(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static213.aClass87_1);
		arg0.removeFocusListener(Static213.aClass87_1);
		Static131.anInt2857 = -1;
	}
}
