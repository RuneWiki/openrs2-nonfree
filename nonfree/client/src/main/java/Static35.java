import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
	public static int anInt6892;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "()V")
	public static void method5763() {
		Static215.anInt4742 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static336.anInt6523; local3++) {
			@Pc(8) Class175 local8 = Static133.aClass175Array2[local3];
			@Pc(12) int local12;
			if (Static32.anIntArray60 != null) {
				for (local12 = 0; local12 < Static32.anIntArray60.length; local12++) {
					if (Static32.anIntArray60[local12] != -1000000 && (local8.anInt5757 <= Static32.anIntArray60[local12] || local8.anInt5758 <= Static32.anIntArray60[local12]) && (local8.anInt5770 <= Static104.anIntArray173[local12] || local8.anInt5765 <= Static104.anIntArray173[local12]) && (local8.anInt5770 >= Static354.anIntArray520[local12] || local8.anInt5765 >= Static354.anIntArray520[local12]) && (local8.anInt5773 <= Static205.anIntArray337[local12] || local8.anInt5775 <= Static205.anIntArray337[local12]) && (local8.anInt5773 >= Static287.anIntArray452[local12] || local8.anInt5775 >= Static287.anIntArray452[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt5772 == 1) {
				local12 = local8.anInt5759 + Static26.anInt3838 - Static250.anInt5229;
				if (local12 >= 0 && local12 <= Static26.anInt3838 + Static26.anInt3838) {
					local110 = local8.anInt5764 + Static26.anInt3838 - Static328.anInt6686;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5763 + Static26.anInt3838 - Static328.anInt6686;
					if (local121 > Static26.anInt3838 + Static26.anInt3838) {
						local121 = Static26.anInt3838 + Static26.anInt3838;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static148.aBooleanArrayArray3[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static353.anInt5915 - local8.anInt5770;
						if (local153 > Static6.anInt95) {
							local8.anInt5768 = 1;
						} else {
							if (local153 >= -Static6.anInt95) {
								continue;
							}
							local8.anInt5768 = 2;
							local153 = -local153;
						}
						local8.anInt5762 = (local8.anInt5773 - Static84.anInt1566 << 8) / local153;
						local8.anInt5766 = (local8.anInt5775 - Static84.anInt1566 << 8) / local153;
						local8.anInt5761 = (local8.anInt5757 - Static83.anInt1555 << 8) / local153;
						local8.anInt5769 = (local8.anInt5758 - Static83.anInt1555 << 8) / local153;
						Static49.aClass175Array1[Static215.anInt4742++] = local8;
					}
				}
			} else if (local8.anInt5772 == 2) {
				local12 = local8.anInt5764 + Static26.anInt3838 - Static328.anInt6686;
				if (local12 >= 0 && local12 <= Static26.anInt3838 + Static26.anInt3838) {
					local110 = local8.anInt5759 + Static26.anInt3838 - Static250.anInt5229;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5771 + Static26.anInt3838 - Static250.anInt5229;
					if (local121 > Static26.anInt3838 + Static26.anInt3838) {
						local121 = Static26.anInt3838 + Static26.anInt3838;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static148.aBooleanArrayArray3[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static84.anInt1566 - local8.anInt5773;
						if (local153 > Static6.anInt95) {
							local8.anInt5768 = 3;
						} else {
							if (local153 >= -Static6.anInt95) {
								continue;
							}
							local8.anInt5768 = 4;
							local153 = -local153;
						}
						local8.anInt5760 = (local8.anInt5770 - Static353.anInt5915 << 8) / local153;
						local8.anInt5774 = (local8.anInt5765 - Static353.anInt5915 << 8) / local153;
						local8.anInt5761 = (local8.anInt5757 - Static83.anInt1555 << 8) / local153;
						local8.anInt5769 = (local8.anInt5758 - Static83.anInt1555 << 8) / local153;
						Static49.aClass175Array1[Static215.anInt4742++] = local8;
					}
				}
			} else if (local8.anInt5772 == 4) {
				local12 = local8.anInt5757 - Static83.anInt1555;
				if (local12 > Static6.anInt93) {
					local110 = local8.anInt5764 + Static26.anInt3838 - Static328.anInt6686;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5763 + Static26.anInt3838 - Static328.anInt6686;
					if (local121 > Static26.anInt3838 + Static26.anInt3838) {
						local121 = Static26.anInt3838 + Static26.anInt3838;
					}
					if (local110 <= local121) {
						@Pc(405) int local405 = local8.anInt5759 + Static26.anInt3838 - Static250.anInt5229;
						if (local405 < 0) {
							local405 = 0;
						}
						local153 = local8.anInt5771 + Static26.anInt3838 - Static250.anInt5229;
						if (local153 > Static26.anInt3838 + Static26.anInt3838) {
							local153 = Static26.anInt3838 + Static26.anInt3838;
						}
						@Pc(427) boolean local427 = false;
						label159: for (@Pc(429) int local429 = local405; local429 <= local153; local429++) {
							for (@Pc(432) int local432 = local110; local432 <= local121; local432++) {
								if (Static148.aBooleanArrayArray3[local429][local432]) {
									local427 = true;
									break label159;
								}
							}
						}
						if (local427) {
							local8.anInt5768 = 5;
							local8.anInt5760 = (local8.anInt5770 - Static353.anInt5915 << 8) / local12;
							local8.anInt5774 = (local8.anInt5765 - Static353.anInt5915 << 8) / local12;
							local8.anInt5762 = (local8.anInt5773 - Static84.anInt1566 << 8) / local12;
							local8.anInt5766 = (local8.anInt5775 - Static84.anInt1566 << 8) / local12;
							Static49.aClass175Array1[Static215.anInt4742++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5764(@OriginalArg(1) String arg0) {
		if (Static81.aStringArray8 == null) {
			Static183.method3477();
		}
		@Pc(14) String[] local14 = Static137.method2633('\n', arg0);
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			for (@Pc(25) int local25 = Static128.anInt2757; local25 > 0; local25--) {
				Static81.aStringArray8[local25] = Static81.aStringArray8[local25 - 1];
			}
			Static81.aStringArray8[0] = local14[local21];
			if (Static128.anInt2757 < Static81.aStringArray8.length - 1) {
				Static128.anInt2757++;
				if (Static250.anInt5225 > 0) {
					Static250.anInt5225++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V")
	public static void method5765() {
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			Static269.aBooleanArray29[local9] = true;
		}
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
	public static void method5768() {
		if (Static328.anInt6688 == 0) {
			return;
		}
		try {
			if (++Static168.anInt3817 > 2000) {
				if (Static129.aClass117_2 != null) {
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
				}
				if (Static353.anInt5914 >= 1) {
					Static328.anInt6688 = 0;
					Static91.anInt1783 = -5;
					return;
				}
				if (Static295.anInt5861 == Static238.anInt5092) {
					Static295.anInt5861 = Static248.anInt5205;
				} else {
					Static295.anInt5861 = Static238.anInt5092;
				}
				Static168.anInt3817 = 0;
				Static353.anInt5914++;
				Static328.anInt6688 = 1;
			}
			if (Static328.anInt6688 == 1) {
				Static145.aClass26_4 = Static62.aClass179_2.method4887(Static295.anInt5861, Static90.aString19);
				Static328.anInt6688 = 2;
			}
			@Pc(122) int local122;
			if (Static328.anInt6688 == 2) {
				if (Static145.aClass26_4.anInt484 == 2) {
					throw new IOException();
				}
				if (Static145.aClass26_4.anInt484 != 1) {
					return;
				}
				Static129.aClass117_2 = new Class117((Socket) Static145.aClass26_4.anObject1, Static62.aClass179_2);
				Static145.aClass26_4 = null;
				Static129.aClass117_2.method3279(Static197.aClass2_Sub12_Sub2_2.anInt3606, Static197.aClass2_Sub12_Sub2_2.aByteArray30);
				if (Static288.aClass88_2 != null) {
					Static288.aClass88_2.method2721();
				}
				if (Static77.aClass88_1 != null) {
					Static77.aClass88_1.method2721();
				}
				local122 = Static129.aClass117_2.method3271();
				if (Static288.aClass88_2 != null) {
					Static288.aClass88_2.method2721();
				}
				if (Static77.aClass88_1 != null) {
					Static77.aClass88_1.method2721();
				}
				if (local122 != 21) {
					Static328.anInt6688 = 0;
					Static91.anInt1783 = local122;
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
					return;
				}
				Static328.anInt6688 = 3;
			}
			if (Static328.anInt6688 == 3) {
				if (Static129.aClass117_2.method3273() < 1) {
					return;
				}
				Static103.aStringArray23 = new String[Static129.aClass117_2.method3271()];
				Static328.anInt6688 = 4;
			}
			if (Static328.anInt6688 == 4 && Static129.aClass117_2.method3273() >= Static103.aStringArray23.length * 8) {
				Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
				Static129.aClass117_2.method3274(0, Static103.aStringArray23.length * 8, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
				for (local122 = 0; local122 < Static103.aStringArray23.length; local122++) {
					Static103.aStringArray23[local122] = Static97.method1894(Static273.aClass2_Sub12_Sub2_3.method3142());
				}
				Static328.anInt6688 = 0;
				Static91.anInt1783 = 21;
				Static129.aClass117_2.method3278();
				Static129.aClass117_2 = null;
			}
		} catch (@Pc(224) IOException local224) {
			if (Static129.aClass117_2 != null) {
				Static129.aClass117_2.method3278();
				Static129.aClass117_2 = null;
			}
			if (Static353.anInt5914 < 1) {
				Static328.anInt6688 = 1;
				if (Static238.anInt5092 == Static295.anInt5861) {
					Static295.anInt5861 = Static248.anInt5205;
				} else {
					Static295.anInt5861 = Static238.anInt5092;
				}
				Static353.anInt5914++;
				Static168.anInt3817 = 0;
			} else {
				Static91.anInt1783 = -4;
				Static328.anInt6688 = 0;
			}
		}
	}
}
