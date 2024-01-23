import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Lclient!kb;")
	public static Class83 aClass83_133;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString126 = "purple:";

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "[I")
	public static int[] anIntArray387 = new int[14];

	@OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
	public static int anInt4280 = -1;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public static void method3414() {
		while (true) {
			if (Static222.aClass1_Sub16_Sub1_3.method2668(Static5.anInt141) >= 11) {
				@Pc(22) int local22 = Static222.aClass1_Sub16_Sub1_3.method2670(11);
				if (local22 != 2047) {
					@Pc(27) boolean local27 = false;
					if (Static271.aClass25_Sub1_Sub1Array1[local22] == null) {
						Static271.aClass25_Sub1_Sub1Array1[local22] = new Class25_Sub1_Sub1();
						if (Static177.aClass1_Sub16Array1[local22] != null) {
							Static271.aClass25_Sub1_Sub1Array1[local22].method496(Static177.aClass1_Sub16Array1[local22]);
						}
						local27 = true;
					}
					Static39.anIntArray108[Static266.anInt5789++] = local22;
					@Pc(66) Class25_Sub1_Sub1 local66 = Static271.aClass25_Sub1_Sub1Array1[local22];
					local66.anInt1658 = Static32.anInt809;
					@Pc(76) int local76 = Static246.anIntArray551[Static222.aClass1_Sub16_Sub1_3.method2670(3)];
					if (local27) {
						local66.anInt1628 = local66.anInt1681 = local76;
					}
					@Pc(90) int local90 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
					@Pc(95) int local95 = Static222.aClass1_Sub16_Sub1_3.method2670(5);
					if (local95 > 15) {
						local95 -= 32;
					}
					@Pc(105) int local105 = Static222.aClass1_Sub16_Sub1_3.method2670(5);
					if (local105 > 15) {
						local105 -= 32;
					}
					@Pc(115) int local115 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
					if (local115 == 1) {
						Static95.anIntArray220[Static111.anInt2390++] = local22;
					}
					local66.method494(local105 + Static239.aClass25_Sub1_Sub1_2.anIntArray172[0], local95 + Static239.aClass25_Sub1_Sub1_2.anIntArray173[0], local90 == 1);
					continue;
				}
			}
			Static222.aClass1_Sub16_Sub1_3.method2666();
			return;
		}
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	public static void method3415() {
		if (Static25.aFloat19 < 128.0F) {
			Static25.aFloat19 = 128.0F;
		}
		while (Static125.aFloat97 >= 2048.0F) {
			Static125.aFloat97 -= 2048.0F;
		}
		if (Static25.aFloat19 > 383.0F) {
			Static25.aFloat19 = 383.0F;
		}
		@Pc(33) int local33 = Static148.anInt3505 >> 7;
		@Pc(37) int local37 = Static251.anInt5460 >> 7;
		@Pc(39) int local39 = 0;
		while (Static125.aFloat97 < 0.0F) {
			Static125.aFloat97 += 2048.0F;
		}
		@Pc(55) int local55 = Static220.method3905(Static148.anInt3505, Static251.anInt5460, Static145.anInt3477);
		@Pc(71) int local71;
		if (local33 > 3 && local37 > 3 && local33 < 100 && local37 < 100) {
			for (local71 = local33 - 4; local71 <= local33 + 4; local71++) {
				for (@Pc(84) int local84 = local37 - 4; local84 <= local37 + 4; local84++) {
					@Pc(91) int local91 = Static145.anInt3477;
					if (local91 < 3 && (Static126.aByteArrayArrayArray24[1][local71][local84] & 0x2) == 2) {
						local91++;
					}
					@Pc(133) int local133 = local55 + (Static75.aByteArrayArrayArray11[local91][local71][local84] & 0xFF) * 8 - Static287.anIntArrayArrayArray18[local91][local71][local84];
					if (local39 < local133) {
						local39 = local133;
					}
				}
			}
		}
		local71 = local39 * 192;
		if (local71 > 98048) {
			local71 = 98048;
		}
		if (local71 < 32768) {
			local71 = 32768;
		}
		if (Static130.anInt2885 < local71) {
			Static130.anInt2885 += (local71 - Static130.anInt2885) / 24;
		} else if (Static130.anInt2885 > local71) {
			Static130.anInt2885 += (local71 - Static130.anInt2885) / 80;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V")
	public static void method3416() {
		Static99.aClass155_17.method4364(5);
		Static285.aClass155_46.method4364(5);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLclient!c;)I")
	public static int method3418(@OriginalArg(1) Class25_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt719;
		@Pc(17) Class124 local17 = arg0.method1232();
		if (arg0.anInt1646 == local17.anInt4578) {
			local8 = arg0.anInt734;
		} else if (local17.anInt4571 == arg0.anInt1646 || local17.anInt4575 == arg0.anInt1646 || arg0.anInt1646 == local17.anInt4597 || local17.anInt4600 == arg0.anInt1646) {
			local8 = arg0.anInt729;
		} else if (local17.anInt4602 == arg0.anInt1646 || local17.anInt4580 == arg0.anInt1646 || local17.anInt4584 == arg0.anInt1646 || arg0.anInt1646 == local17.anInt4573) {
			local8 = arg0.anInt724;
		}
		return local8;
	}
}
