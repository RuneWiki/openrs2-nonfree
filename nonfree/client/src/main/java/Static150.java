import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!ng;")
	public static Class162 aClass162_2;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "[I")
	public static final int[] anIntArray328 = new int[32];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
	public static void method2268(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static302.method4522(arg0.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	public static void method2270() {
		@Pc(1) Class227 local1 = Static109.aClass227_16;
		synchronized (Static109.aClass227_16) {
			Static109.aClass227_16.method4858();
		}
		local1 = Static366.aClass227_46;
		synchronized (Static366.aClass227_46) {
			Static366.aClass227_46.method4858();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	public static void method2271() {
		Static56.anInt1158 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static287.anInt4942; local3++) {
			@Pc(8) Class5 local8 = Static120.aClass5Array1[local3];
			@Pc(12) int local12;
			if (Static336.anIntArray649 != null) {
				for (local12 = 0; local12 < Static336.anIntArray649.length; local12++) {
					if (Static336.anIntArray649[local12] != -1000000 && (local8.anInt84 <= Static336.anIntArray649[local12] || local8.anInt92 <= Static336.anIntArray649[local12]) && (local8.anInt73 <= Static212.anIntArray450[local12] || local8.anInt78 <= Static212.anIntArray450[local12]) && (local8.anInt73 >= Static262.anIntArray743[local12] || local8.anInt78 >= Static262.anIntArray743[local12]) && (local8.anInt83 <= Static325.anIntArray639[local12] || local8.anInt70 <= Static325.anIntArray639[local12]) && (local8.anInt83 >= Static119.anIntArray271[local12] || local8.anInt70 >= Static119.anIntArray271[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt82 == 1) {
				local12 = local8.anInt88 + Static32.anInt647 - Static266.anInt4625;
				if (local12 >= 0 && local12 <= Static32.anInt647 + Static32.anInt647) {
					local110 = local8.anInt80 + Static32.anInt647 - Static249.anInt4358;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt76 + Static32.anInt647 - Static249.anInt4358;
					if (local121 > Static32.anInt647 + Static32.anInt647) {
						local121 = Static32.anInt647 + Static32.anInt647;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static54.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static227.anInt4750 - local8.anInt73;
						if (local153 > Static53.anInt1114) {
							local8.anInt86 = 1;
						} else {
							if (local153 >= -Static53.anInt1114) {
								continue;
							}
							local8.anInt86 = 2;
							local153 = -local153;
						}
						local8.anInt75 = (local8.anInt83 - Static12.anInt170 << 8) / local153;
						local8.anInt81 = (local8.anInt70 - Static12.anInt170 << 8) / local153;
						local8.anInt72 = (local8.anInt84 - Static343.anInt5657 << 8) / local153;
						local8.anInt87 = (local8.anInt92 - Static343.anInt5657 << 8) / local153;
						Static146.aClass5Array2[Static56.anInt1158++] = local8;
					}
				}
			} else if (local8.anInt82 == 2) {
				local12 = local8.anInt80 + Static32.anInt647 - Static249.anInt4358;
				if (local12 >= 0 && local12 <= Static32.anInt647 + Static32.anInt647) {
					local110 = local8.anInt88 + Static32.anInt647 - Static266.anInt4625;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt89 + Static32.anInt647 - Static266.anInt4625;
					if (local121 > Static32.anInt647 + Static32.anInt647) {
						local121 = Static32.anInt647 + Static32.anInt647;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static54.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static12.anInt170 - local8.anInt83;
						if (local153 > Static53.anInt1114) {
							local8.anInt86 = 3;
						} else {
							if (local153 >= -Static53.anInt1114) {
								continue;
							}
							local8.anInt86 = 4;
							local153 = -local153;
						}
						local8.anInt71 = (local8.anInt73 - Static227.anInt4750 << 8) / local153;
						local8.anInt77 = (local8.anInt78 - Static227.anInt4750 << 8) / local153;
						local8.anInt72 = (local8.anInt84 - Static343.anInt5657 << 8) / local153;
						local8.anInt87 = (local8.anInt92 - Static343.anInt5657 << 8) / local153;
						Static146.aClass5Array2[Static56.anInt1158++] = local8;
					}
				}
			} else if (local8.anInt82 == 4) {
				local12 = local8.anInt84 - Static343.anInt5657;
				if (local12 > Static53.anInt1118) {
					local110 = local8.anInt80 + Static32.anInt647 - Static249.anInt4358;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt76 + Static32.anInt647 - Static249.anInt4358;
					if (local121 > Static32.anInt647 + Static32.anInt647) {
						local121 = Static32.anInt647 + Static32.anInt647;
					}
					if (local110 <= local121) {
						@Pc(405) int local405 = local8.anInt88 + Static32.anInt647 - Static266.anInt4625;
						if (local405 < 0) {
							local405 = 0;
						}
						local153 = local8.anInt89 + Static32.anInt647 - Static266.anInt4625;
						if (local153 > Static32.anInt647 + Static32.anInt647) {
							local153 = Static32.anInt647 + Static32.anInt647;
						}
						@Pc(427) boolean local427 = false;
						label159: for (@Pc(429) int local429 = local405; local429 <= local153; local429++) {
							for (@Pc(432) int local432 = local110; local432 <= local121; local432++) {
								if (Static54.aBooleanArrayArray1[local429][local432]) {
									local427 = true;
									break label159;
								}
							}
						}
						if (local427) {
							local8.anInt86 = 5;
							local8.anInt71 = (local8.anInt73 - Static227.anInt4750 << 8) / local12;
							local8.anInt77 = (local8.anInt78 - Static227.anInt4750 << 8) / local12;
							local8.anInt75 = (local8.anInt83 - Static12.anInt170 << 8) / local12;
							local8.anInt81 = (local8.anInt70 - Static12.anInt170 << 8) / local12;
							Static146.aClass5Array2[Static56.anInt1158++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public static void method2272() {
		if (Static47.aFrame1 != null) {
			return;
		}
		@Pc(17) Container local17;
		if (Static142.aFrame2 == null) {
			local17 = Static341.aClass162_5.anApplet1;
		} else {
			local17 = Static142.aFrame2;
		}
		Static160.anInt2899 = local17.getSize().width;
		Static278.anInt4645 = local17.getSize().height;
		@Pc(35) Insets local35;
		if (Static142.aFrame2 == local17) {
			local35 = Static142.aFrame2.getInsets();
			Static278.anInt4645 -= local35.top + local35.bottom;
			Static160.anInt2899 -= local35.right + local35.left;
		}
		if (Static254.method3903() == 1) {
			Static218.anInt3871 = Static48.anInt953;
			Static307.anInt5742 = (Static160.anInt2899 - Static275.anInt4790) / 2;
			Static155.anInt2835 = 0;
			Static136.anInt6304 = Static275.anInt4790;
		} else if (Static294.anInt5063 < 96 && Static25.anInt394 == 0) {
			@Pc(92) int local92 = Static160.anInt2899 <= 1024 ? Static160.anInt2899 : 1024;
			Static307.anInt5742 = (Static160.anInt2899 - local92) / 2;
			@Pc(105) int local105 = Static278.anInt4645 > 768 ? 768 : Static278.anInt4645;
			Static136.anInt6304 = local92;
			Static218.anInt3871 = local105;
			Static155.anInt2835 = 0;
		} else {
			Static155.anInt2835 = 0;
			Static307.anInt5742 = 0;
			Static218.anInt3871 = Static278.anInt4645;
			Static136.anInt6304 = Static160.anInt2899;
		}
		if (Static314.aClass73_5 != Static96.aClass73_2) {
			@Pc(133) boolean local133;
			if (Static136.anInt6304 < 1024 && Static218.anInt3871 < 768) {
				local133 = true;
			} else {
				local133 = false;
			}
		}
		Static177.aCanvas3.setSize(Static136.anInt6304, Static218.anInt3871);
		if (Static66.aClass164_2 != null) {
			Static66.aClass164_2.method5359();
		}
		if (local17 == Static142.aFrame2) {
			local35 = Static142.aFrame2.getInsets();
			Static177.aCanvas3.setLocation(Static307.anInt5742 + local35.left, local35.top + Static155.anInt2835);
		} else {
			Static177.aCanvas3.setLocation(Static307.anInt5742, Static155.anInt2835);
		}
		if (Static352.anInt5753 != -1) {
			Static195.method5584(true);
		}
		Static191.method2738();
	}
}
