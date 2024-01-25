import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	public static int anInt5990;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!tj;")
	public static Class193 aClass193_97;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Lclient!vq;")
	public static Class47 aClass47_10;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public static int anInt5991 = 20;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	public static int anInt5994 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5092(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
	public static void method5094() {
		Static29.anInt638 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static67.anInt1776; local3++) {
			@Pc(8) Class183 local8 = Static183.aClass183Array2[local3];
			@Pc(12) int local12;
			if (Static134.anIntArray269 != null) {
				for (local12 = 0; local12 < Static134.anIntArray269.length; local12++) {
					if (Static134.anIntArray269[local12] != -1000000 && (local8.anInt5661 <= Static134.anIntArray269[local12] || local8.anInt5654 <= Static134.anIntArray269[local12]) && (local8.anInt5656 <= Static304.anIntArray467[local12] || local8.anInt5663 <= Static304.anIntArray467[local12]) && (local8.anInt5656 >= Static69.anIntArray100[local12] || local8.anInt5663 >= Static69.anIntArray100[local12]) && (local8.anInt5653 <= Static128.anIntArray264[local12] || local8.anInt5666 <= Static128.anIntArray264[local12]) && (local8.anInt5653 >= Static317.anIntArray479[local12] || local8.anInt5666 >= Static317.anIntArray479[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt5651 == 1) {
				local12 = local8.anInt5674 + Static328.anInt6272 - Static61.anInt1578;
				if (local12 >= 0 && local12 <= Static328.anInt6272 + Static328.anInt6272) {
					local110 = local8.anInt5668 + Static328.anInt6272 - Static246.anInt5043;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5657 + Static328.anInt6272 - Static246.anInt5043;
					if (local121 > Static328.anInt6272 + Static328.anInt6272) {
						local121 = Static328.anInt6272 + Static328.anInt6272;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static339.aBooleanArrayArray2[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static39.anInt1025 - local8.anInt5656;
						if (local153 > 32) {
							local8.anInt5659 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5659 = 2;
							local153 = -local153;
						}
						local8.anInt5669 = (local8.anInt5653 - Static357.anInt6822 << 8) / local153;
						local8.anInt5673 = (local8.anInt5666 - Static357.anInt6822 << 8) / local153;
						local8.anInt5658 = (local8.anInt5661 - Static23.anInt463 << 8) / local153;
						local8.anInt5670 = (local8.anInt5654 - Static23.anInt463 << 8) / local153;
						Static118.aClass183Array1[Static29.anInt638++] = local8;
					}
				}
			} else if (local8.anInt5651 == 2) {
				local12 = local8.anInt5668 + Static328.anInt6272 - Static246.anInt5043;
				if (local12 >= 0 && local12 <= Static328.anInt6272 + Static328.anInt6272) {
					local110 = local8.anInt5674 + Static328.anInt6272 - Static61.anInt1578;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5664 + Static328.anInt6272 - Static61.anInt1578;
					if (local121 > Static328.anInt6272 + Static328.anInt6272) {
						local121 = Static328.anInt6272 + Static328.anInt6272;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static339.aBooleanArrayArray2[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static357.anInt6822 - local8.anInt5653;
						if (local153 > 32) {
							local8.anInt5659 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5659 = 4;
							local153 = -local153;
						}
						local8.anInt5665 = (local8.anInt5656 - Static39.anInt1025 << 8) / local153;
						local8.anInt5671 = (local8.anInt5663 - Static39.anInt1025 << 8) / local153;
						local8.anInt5658 = (local8.anInt5661 - Static23.anInt463 << 8) / local153;
						local8.anInt5670 = (local8.anInt5654 - Static23.anInt463 << 8) / local153;
						Static118.aClass183Array1[Static29.anInt638++] = local8;
					}
				}
			} else if (local8.anInt5651 == 4) {
				local12 = local8.anInt5661 - Static23.anInt463;
				if (local12 > 128) {
					local110 = local8.anInt5668 + Static328.anInt6272 - Static246.anInt5043;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5657 + Static328.anInt6272 - Static246.anInt5043;
					if (local121 > Static328.anInt6272 + Static328.anInt6272) {
						local121 = Static328.anInt6272 + Static328.anInt6272;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt5674 + Static328.anInt6272 - Static61.anInt1578;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt5664 + Static328.anInt6272 - Static61.anInt1578;
						if (local153 > Static328.anInt6272 + Static328.anInt6272) {
							local153 = Static328.anInt6272 + Static328.anInt6272;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static339.aBooleanArrayArray2[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt5659 = 5;
							local8.anInt5665 = (local8.anInt5656 - Static39.anInt1025 << 8) / local12;
							local8.anInt5671 = (local8.anInt5663 - Static39.anInt1025 << 8) / local12;
							local8.anInt5669 = (local8.anInt5653 - Static357.anInt6822 << 8) / local12;
							local8.anInt5673 = (local8.anInt5666 - Static357.anInt6822 << 8) / local12;
							Static118.aClass183Array1[Static29.anInt638++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)V")
	public static void method5095(@OriginalArg(0) int arg0) {
		if (arg0 == Static139.anInt3199) {
			return;
		}
		if (Static139.anInt3199 == 0) {
			Static268.method4616();
		}
		if (arg0 == 40) {
			Static146.method2548();
		}
		if (arg0 != 40 && Static70.aClass114_2 != null) {
			Static70.aClass114_2.method3165();
			Static70.aClass114_2 = null;
		}
		if (Static139.anInt3199 == 25 || Static139.anInt3199 == 28) {
			Static149.aClass193_69.anInt5952 = 2;
			Static167.aClass193_60.anInt5952 = 2;
			Static349.aClass193_109.anInt5952 = 2;
			Static351.aClass193_110.anInt5952 = 2;
			Static203.aClass193_73.anInt5952 = 2;
			Static132.aClass193_47.anInt5952 = 2;
			Static301.aClass193_94.anInt5952 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static295.anInt5715 = 0;
			Static232.anInt4673 = 1;
			Static306.anInt5906 = 0;
			Static256.anInt5173 = 0;
			Static178.anInt3770 = 1;
			Static354.method5641(true);
			Static149.aClass193_69.anInt5952 = 1;
			Static167.aClass193_60.anInt5952 = 1;
			Static349.aClass193_109.anInt5952 = 1;
			Static351.aClass193_110.anInt5952 = 1;
			Static203.aClass193_73.anInt5952 = 1;
			Static132.aClass193_47.anInt5952 = 1;
			Static301.aClass193_94.anInt5952 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static328.method5311();
		}
		if (arg0 == 5) {
			Static90.method2190(Static274.aClass47_9, Static316.aClass193_99);
		} else {
			Static302.method4960();
		}
		@Pc(148) boolean local148 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(165) boolean local165 = Static139.anInt3199 == 5 || Static139.anInt3199 == 10 || Static139.anInt3199 == 28;
		if (local165 != local148) {
			if (local148) {
				Static206.anInt4321 = Static316.anInt6130;
				if (Static26.anInt577 == 0) {
					Static19.method320();
				} else {
					Static218.method3957(Static39.aClass193_11, 255, Static316.anInt6130);
				}
				Static147.aClass13_3.method290(false);
			} else {
				Static19.method320();
				Static147.aClass13_3.method290(true);
				if (Static146.aClass166_2 != null) {
					Static146.aClass166_2.method4497();
					Static146.aClass166_2 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static274.aClass47_9.method2664();
		}
		Static139.anInt3199 = arg0;
	}
}
