import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_30 = new Class12(76, -2);

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_31 = new Class12(96, 8);

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public static int anInt456 = 0;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "F")
	public static float aFloat5 = 1.0F;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
	public static void method381() {
		Static397.anInt7107 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static208.anInt3763; local3++) {
			@Pc(8) Class41 local8 = Static264.aClass41Array2[local3];
			@Pc(12) int local12;
			if (Static353.anIntArray470 != null) {
				for (local12 = 0; local12 < Static353.anIntArray470.length; local12++) {
					if (Static353.anIntArray470[local12] != -1000000 && (local8.anInt766 <= Static353.anIntArray470[local12] || local8.anInt761 <= Static353.anIntArray470[local12]) && (local8.anInt757 <= Static164.anIntArray222[local12] || local8.anInt765 <= Static164.anIntArray222[local12]) && (local8.anInt757 >= Static375.anIntArray572[local12] || local8.anInt765 >= Static375.anIntArray572[local12]) && (local8.anInt763 <= Static94.anIntArray91[local12] || local8.anInt755 <= Static94.anIntArray91[local12]) && (local8.anInt763 >= Static148.anIntArray548[local12] || local8.anInt755 >= Static148.anIntArray548[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt754 == 1) {
				local12 = local8.anInt753 + Static370.anInt7659 - Static59.anInt1066;
				if (local12 >= 0 && local12 <= Static370.anInt7659 + Static370.anInt7659) {
					local110 = local8.anInt758 + Static370.anInt7659 - Static161.anInt2868;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static370.anInt7659 + Static370.anInt7659) {
						continue;
					}
					local128 = local8.anInt749 + Static370.anInt7659 - Static161.anInt2868;
					if (local128 > Static370.anInt7659 + Static370.anInt7659) {
						local128 = Static370.anInt7659 + Static370.anInt7659;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static6.aBooleanArrayArray3[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static81.anInt1480 - local8.anInt757;
						if (local164 > Static348.anInt6361) {
							local8.anInt747 = 1;
						} else {
							if (local164 >= -Static348.anInt6361) {
								continue;
							}
							local8.anInt747 = 2;
							local164 = -local164;
						}
						local8.anInt759 = (local8.anInt763 - Static150.anInt2703 << 8) / local164;
						local8.anInt756 = (local8.anInt755 - Static150.anInt2703 << 8) / local164;
						local8.anInt751 = (local8.anInt766 - Static374.anInt6749 << 8) / local164;
						local8.anInt767 = (local8.anInt761 - Static374.anInt6749 << 8) / local164;
						Static201.aClass41Array1[Static397.anInt7107++] = local8;
					}
				}
			} else if (local8.anInt754 == 2) {
				local12 = local8.anInt758 + Static370.anInt7659 - Static161.anInt2868;
				if (local12 >= 0 && local12 <= Static370.anInt7659 + Static370.anInt7659) {
					local110 = local8.anInt753 + Static370.anInt7659 - Static59.anInt1066;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static370.anInt7659 + Static370.anInt7659) {
						continue;
					}
					local128 = local8.anInt768 + Static370.anInt7659 - Static59.anInt1066;
					if (local128 > Static370.anInt7659 + Static370.anInt7659) {
						local128 = Static370.anInt7659 + Static370.anInt7659;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static6.aBooleanArrayArray3[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static150.anInt2703 - local8.anInt763;
						if (local164 > Static348.anInt6361) {
							local8.anInt747 = 3;
						} else {
							if (local164 >= -Static348.anInt6361) {
								continue;
							}
							local8.anInt747 = 4;
							local164 = -local164;
						}
						local8.anInt750 = (local8.anInt757 - Static81.anInt1480 << 8) / local164;
						local8.anInt748 = (local8.anInt765 - Static81.anInt1480 << 8) / local164;
						local8.anInt751 = (local8.anInt766 - Static374.anInt6749 << 8) / local164;
						local8.anInt767 = (local8.anInt761 - Static374.anInt6749 << 8) / local164;
						Static201.aClass41Array1[Static397.anInt7107++] = local8;
					}
				}
			} else if (local8.anInt754 == 4) {
				local12 = local8.anInt766 - Static374.anInt6749;
				if (local12 > Static442.anInt7686) {
					local110 = local8.anInt758 + Static370.anInt7659 - Static161.anInt2868;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static370.anInt7659 + Static370.anInt7659) {
						continue;
					}
					local128 = local8.anInt749 + Static370.anInt7659 - Static161.anInt2868;
					if (local128 > Static370.anInt7659 + Static370.anInt7659) {
						local128 = Static370.anInt7659 + Static370.anInt7659;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt753 + Static370.anInt7659 - Static59.anInt1066;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static370.anInt7659 + Static370.anInt7659) {
						continue;
					}
					local164 = local8.anInt768 + Static370.anInt7659 - Static59.anInt1066;
					if (local164 > Static370.anInt7659 + Static370.anInt7659) {
						local164 = Static370.anInt7659 + Static370.anInt7659;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static6.aBooleanArrayArray3[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt747 = 5;
						local8.anInt750 = (local8.anInt757 - Static81.anInt1480 << 8) / local12;
						local8.anInt748 = (local8.anInt765 - Static81.anInt1480 << 8) / local12;
						local8.anInt759 = (local8.anInt763 - Static150.anInt2703 << 8) / local12;
						local8.anInt756 = (local8.anInt755 - Static150.anInt2703 << 8) / local12;
						Static201.aClass41Array1[Static397.anInt7107++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZI)Z")
	public static boolean method383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static44.method582(arg0, arg1) | (arg0 & 0x800) != 0 || Static153.method3783(arg0, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)V")
	public static void method386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1_Sub1 local15 = Static190.method3007(arg0, 12);
		local15.method32();
		local15.anInt35 = arg1;
	}
}
