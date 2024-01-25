import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!he", name = "m", descriptor = "Lclient!ei;")
	public static final Class91 aClass91_1 = new Class91();

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method3191() {
		if (Static432.aClass246Array1 == null) {
			Static432.aClass246Array1 = Static393.method5072();
			Static6.aClass246_1 = Static432.aClass246Array1[0];
			Static293.aLong139 = Static429.method5935();
		}
		if (Static31.aClass353_3 == null) {
			Static614.method8042();
		}
		@Pc(23) Class246 local23 = Static6.aClass246_1;
		@Pc(31) int local31 = Static232.method3348();
		if (local23 == Static6.aClass246_1) {
			Static531.aString101 = Static6.aClass246_1.aClass179_64.method4066(Static164.anInt2984);
			if (Static6.aClass246_1.aBoolean442) {
				Static638.anInt10024 = local31 * (Static6.aClass246_1.anInt5770 - Static6.aClass246_1.anInt5774) / 100 + Static6.aClass246_1.anInt5774;
			}
			if (Static6.aClass246_1.aBoolean443) {
				Static531.aString101 = Static531.aString101 + Static638.anInt10024 + "%";
			}
		} else if (Static393.aClass246_22 == Static6.aClass246_1) {
			Static31.aClass353_3 = null;
			Static53.method1256(3);
		} else {
			Static531.aString101 = local23.aClass179_63.method4066(Static164.anInt2984);
			if (Static6.aClass246_1.aBoolean443) {
				Static531.aString101 = Static531.aString101 + local23.anInt5770 + "%";
			}
			Static638.anInt10024 = local23.anInt5770;
			if (Static6.aClass246_1.aBoolean442 || local23.aBoolean442) {
				Static293.aLong139 = Static429.method5935();
			}
		}
		if (Static31.aClass353_3 == null) {
			return;
		}
		Static31.aClass353_3.method7677(Static6.aClass246_1, Static293.aLong139, Static638.anInt10024, Static531.aString101);
		if (Static238.anInterface22Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static437.anInt10171 + 1; local130 < Static238.anInterface22Array1.length; local130++) {
			if (Static238.anInterface22Array1[local130].method8777() >= 100 && Static437.anInt10171 == local130 - 1 && Static656.anInt10356 >= 1 && Static31.aClass353_3.method7683()) {
				try {
					Static238.anInterface22Array1[local130].method8781();
				} catch (@Pc(162) Exception local162) {
					Static238.anInterface22Array1 = null;
					return;
				}
				Static31.aClass353_3.method7678(Static238.anInterface22Array1[local130]);
				Static437.anInt10171++;
				if (Static238.anInterface22Array1.length - 1 <= Static437.anInt10171 && Static238.anInterface22Array1.length > 1) {
					Static437.anInt10171 = Static84.aClass128_1.method2870() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)I")
	public static int method3192(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local13 += 16;
		}
		if (arg0 >= 256) {
			local13 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local13 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local13 += 2;
		}
		if (arg0 >= 1) {
			local13++;
			arg0 >>>= 0x1;
		}
		return arg0 + local13;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!fg;I)V")
	public static void method3193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		Static258.aClass113ArrayArray1[arg1][arg0] = arg2;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!eda;)V")
	public static void method3194(@OriginalArg(0) Class85 arg0) {
		if (Static355.anInt5402 >= 65535) {
			return;
		}
		@Pc(6) Class4_Sub29 local6 = arg0.aClass4_Sub29_2;
		Static217.aClass85Array1[Static355.anInt5402] = arg0;
		Static17.aBooleanArray2[Static355.anInt5402] = false;
		Static355.anInt5402++;
		@Pc(21) int local21 = arg0.anInt2270;
		if (arg0.aBoolean152) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2270;
		if (arg0.aBoolean153) {
			local29 = Static539.anInt8345 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method7628() + Static85.anInt1770 - local6.method7632() >> Static273.anInt4424;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method7628() + local6.method7632() - Static85.anInt1770 >> Static273.anInt4424;
			if (local73 >= Static245.anInt7888) {
				local73 = Static245.anInt7888 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray34[local41++];
				@Pc(105) int local105 = (local6.method7627() + Static85.anInt1770 - local6.method7632() >> Static273.anInt4424) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static51.anInt1108) {
					local113 = Static51.anInt1108 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static432.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static432.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static355.anInt5402;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static432.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static355.anInt5402 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static432.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static355.anInt5402 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static432.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static355.anInt5402 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!iaa;)V")
	public static void method3195(@OriginalArg(1) Class3_Sub1_Sub2_Sub2_Sub1 arg0) {
		@Pc(19) Class4_Sub23 local19 = (Class4_Sub23) Static124.aClass66_10.method1994((long) arg0.anInt9961);
		if (local19 == null) {
			Static245.method6857((Class3_Sub1_Sub2_Sub2_Sub2) null, arg0, arg0.aByte141, arg0.anIntArray694[0], (Class342) null, 0, arg0.anIntArray693[0]);
		} else {
			local19.method3688();
		}
	}
}
