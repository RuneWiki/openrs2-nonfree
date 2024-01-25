import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!pi", name = "Vc", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!pi", name = "Jc", descriptor = "I")
	public static int anInt4904 = 10;

	@OriginalMember(owner = "client!pi", name = "Rc", descriptor = "Lclient!hq;")
	public static Class87 aClass87_41 = new Class87(64);

	@OriginalMember(owner = "client!pi", name = "ad", descriptor = "[I")
	public static final int[] anIntArray441 = new int[64];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)I")
	public static int method4334(@OriginalArg(0) int arg0) {
		if (Static7.aClass148_1 != null) {
			Static7.aClass148_1.method4123();
			Static7.aClass148_1 = null;
		}
		Static175.anInt3795++;
		if (Static175.anInt3795 > 4) {
			Static175.anInt3795 = 0;
			Static46.anInt1505 = 0;
			return arg0;
		}
		if (Static41.anInt1308 == Static154.anInt3393) {
			Static154.anInt3393 = Static233.anInt5576;
		} else {
			Static154.anInt3393 = Static41.anInt1308;
		}
		Static46.anInt1505 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
	public static void method4335() {
		Static318.anInt6133 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static28.anInt1030; local3++) {
			@Pc(8) Class23 local8 = Static121.aClass23Array2[local3];
			@Pc(12) int local12;
			if (Static124.anIntArray253 != null) {
				for (local12 = 0; local12 < Static124.anIntArray253.length; local12++) {
					if (Static124.anIntArray253[local12] != -1000000 && (local8.anInt1016 <= Static124.anIntArray253[local12] || local8.anInt1017 <= Static124.anIntArray253[local12]) && (local8.anInt1032 <= Static75.anIntArray197[local12] || local8.anInt1022 <= Static75.anIntArray197[local12]) && (local8.anInt1032 >= Static340.anIntArray518[local12] || local8.anInt1022 >= Static340.anIntArray518[local12]) && (local8.anInt1020 <= Static341.anIntArray522[local12] || local8.anInt1021 <= Static341.anIntArray522[local12]) && (local8.anInt1020 >= Static135.anIntArray264[local12] || local8.anInt1021 >= Static135.anIntArray264[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt1028 == 1) {
				local12 = local8.anInt1026 + Static77.anInt2009 - Static318.anInt6137;
				if (local12 >= 0 && local12 <= Static77.anInt2009 + Static77.anInt2009) {
					local110 = local8.anInt1023 + Static77.anInt2009 - Static204.anInt4305;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1025 + Static77.anInt2009 - Static204.anInt4305;
					if (local121 > Static77.anInt2009 + Static77.anInt2009) {
						local121 = Static77.anInt2009 + Static77.anInt2009;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static253.aBooleanArrayArray6[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static171.anInt3695 - local8.anInt1032;
						if (local153 > 32) {
							local8.anInt1018 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt1018 = 2;
							local153 = -local153;
						}
						local8.anInt1024 = (local8.anInt1020 - Static234.anInt4778 << 8) / local153;
						local8.anInt1011 = (local8.anInt1021 - Static234.anInt4778 << 8) / local153;
						local8.anInt1027 = (local8.anInt1016 - Static167.anInt3601 << 8) / local153;
						local8.anInt1029 = (local8.anInt1017 - Static167.anInt3601 << 8) / local153;
						Static91.aClass23Array1[Static318.anInt6133++] = local8;
					}
				}
			} else if (local8.anInt1028 == 2) {
				local12 = local8.anInt1023 + Static77.anInt2009 - Static204.anInt4305;
				if (local12 >= 0 && local12 <= Static77.anInt2009 + Static77.anInt2009) {
					local110 = local8.anInt1026 + Static77.anInt2009 - Static318.anInt6137;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1012 + Static77.anInt2009 - Static318.anInt6137;
					if (local121 > Static77.anInt2009 + Static77.anInt2009) {
						local121 = Static77.anInt2009 + Static77.anInt2009;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static253.aBooleanArrayArray6[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static234.anInt4778 - local8.anInt1020;
						if (local153 > 32) {
							local8.anInt1018 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt1018 = 4;
							local153 = -local153;
						}
						local8.anInt1019 = (local8.anInt1032 - Static171.anInt3695 << 8) / local153;
						local8.anInt1013 = (local8.anInt1022 - Static171.anInt3695 << 8) / local153;
						local8.anInt1027 = (local8.anInt1016 - Static167.anInt3601 << 8) / local153;
						local8.anInt1029 = (local8.anInt1017 - Static167.anInt3601 << 8) / local153;
						Static91.aClass23Array1[Static318.anInt6133++] = local8;
					}
				}
			} else if (local8.anInt1028 == 4) {
				local12 = local8.anInt1016 - Static167.anInt3601;
				if (local12 > 128) {
					local110 = local8.anInt1023 + Static77.anInt2009 - Static204.anInt4305;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1025 + Static77.anInt2009 - Static204.anInt4305;
					if (local121 > Static77.anInt2009 + Static77.anInt2009) {
						local121 = Static77.anInt2009 + Static77.anInt2009;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt1026 + Static77.anInt2009 - Static318.anInt6137;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt1012 + Static77.anInt2009 - Static318.anInt6137;
						if (local153 > Static77.anInt2009 + Static77.anInt2009) {
							local153 = Static77.anInt2009 + Static77.anInt2009;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static253.aBooleanArrayArray6[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt1018 = 5;
							local8.anInt1019 = (local8.anInt1032 - Static171.anInt3695 << 8) / local12;
							local8.anInt1013 = (local8.anInt1022 - Static171.anInt3695 << 8) / local12;
							local8.anInt1024 = (local8.anInt1020 - Static234.anInt4778 << 8) / local12;
							local8.anInt1011 = (local8.anInt1021 - Static234.anInt4778 << 8) / local12;
							Static91.aClass23Array1[Static318.anInt6133++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)V")
	public static void method4336() {
		if (Static119.aBoolean262) {
			return;
		}
		if (Static327.aBoolean607) {
			Static75.aFloat13 = (int) Static75.aFloat13 + 191 & 0xFFFFFF80;
		} else {
			Static356.aFloat79 += (24.0F - Static356.aFloat79) / 2.0F;
		}
		Static119.aBoolean262 = true;
		Static329.aBoolean614 = true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
	public static void method4338(@OriginalArg(1) boolean arg0) {
		for (@Pc(14) Class1_Sub22 local14 = (Class1_Sub22) Static148.aClass16_14.method410(); local14 != null; local14 = (Class1_Sub22) Static148.aClass16_14.method419()) {
			if (local14.aClass1_Sub1_Sub2_2 != null) {
				Static145.aClass1_Sub1_Sub4_1.method5037(local14.aClass1_Sub1_Sub2_2);
				local14.aClass1_Sub1_Sub2_2 = null;
			}
			if (local14.aClass1_Sub1_Sub2_1 != null) {
				Static145.aClass1_Sub1_Sub4_1.method5037(local14.aClass1_Sub1_Sub2_1);
				local14.aClass1_Sub1_Sub2_1 = null;
			}
			local14.method5628();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class1_Sub22 local53 = (Class1_Sub22) Static150.aClass16_15.method410(); local53 != null; local53 = (Class1_Sub22) Static150.aClass16_15.method419()) {
			if (local53.aClass1_Sub1_Sub2_2 != null) {
				Static145.aClass1_Sub1_Sub4_1.method5037(local53.aClass1_Sub1_Sub2_2);
				local53.aClass1_Sub1_Sub2_2 = null;
			}
			local53.method5628();
		}
		for (@Pc(82) Class1_Sub22 local82 = (Class1_Sub22) Static248.aClass197_24.method5161(); local82 != null; local82 = (Class1_Sub22) Static248.aClass197_24.method5154()) {
			if (local82.aClass1_Sub1_Sub2_2 != null) {
				Static145.aClass1_Sub1_Sub4_1.method5037(local82.aClass1_Sub1_Sub2_2);
				local82.aClass1_Sub1_Sub2_2 = null;
			}
			local82.method5628();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!wo;I)V")
	public static void method4339(@OriginalArg(0) Class216 arg0) {
		Static56.aClass216_16 = arg0;
	}
}
