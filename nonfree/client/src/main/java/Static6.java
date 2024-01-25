import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "Lclient!je;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_1 = new Class254();

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!vg;")
	public static Class250 aClass250_1 = null;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!dh;)Lclient!eg;")
	public static Class63_Sub1 method101(@OriginalArg(1) Class1_Sub11 arg0) {
		return new Class63_Sub1(arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4493(), arg0.method4463());
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZ)Z")
	public static boolean method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method104(@OriginalArg(0) Class128 arg0) {
		if (Static19.anInt396 < 2 && !Static360.aBoolean498 || Static68.aClass250_2 != null) {
			return;
		}
		@Pc(42) String local42;
		if (Static360.aBoolean498 && Static19.anInt396 < 2) {
			local42 = Static149.aString68 + Static9.aClass151_11.method3122(Static188.anInt3028) + Static419.aString58 + " ->";
		} else if (Static314.aBoolean419 && Static321.aClass31_4.method3798(81) && Static19.anInt396 > 2) {
			local42 = Static258.method3272((Class1_Sub45) Static50.aClass254_8.aClass1_249.aClass1_261.aClass1_261);
		} else {
			@Pc(63) Class1_Sub45 local63 = (Class1_Sub45) Static50.aClass254_8.aClass1_249.aClass1_261;
			local42 = Static258.method3272(local63);
			@Pc(69) int[] local69 = null;
			if (Static97.method1391(local63.anInt7398)) {
				local69 = Static227.aClass65_2.method1327((int) local63.aLong225).anIntArray87;
			} else if (local63.anInt7396 != -1) {
				local69 = Static227.aClass65_2.method1327(local63.anInt7396).anIntArray87;
			} else if (Static109.method1524(local63.anInt7398)) {
				@Pc(89) Class20_Sub3_Sub3_Sub2 local89 = Static98.aClass20_Sub3_Sub3_Sub2Array1[(int) local63.aLong225];
				if (local89 != null) {
					@Pc(94) Class246 local94 = local89.aClass246_1;
					if (local94.anIntArray459 != null) {
						local94 = local94.method5255(Static364.aClass259_1);
					}
					if (local94 != null) {
						local69 = local94.anIntArray455;
					}
				}
			} else if (Static29.method506(local63.anInt7398)) {
				@Pc(132) Class141 local132;
				if (local63.anInt7398 == 1006) {
					local132 = Static259.aClass95_3.method1821((int) local63.aLong225);
				} else {
					local132 = Static259.aClass95_3.method1821((int) (local63.aLong225 >>> 32 & 0x7FFFFFFFL));
				}
				if (local132.anIntArray184 != null) {
					local132 = local132.method2832(Static364.aClass259_1);
				}
				if (local132 != null) {
					local69 = local132.anIntArray187;
				}
			}
			if (local69 != null) {
				local42 = local42 + Static108.method1518(local69);
			}
		}
		if (Static19.anInt396 > 2) {
			local42 = local42 + "<col=ffffff> / " + (Static19.anInt396 - 2) + Static135.aClass151_77.method3122(Static188.anInt3028);
		}
		if (Static384.aClass250_12 != null) {
			@Pc(221) Class16 local221 = Static384.aClass250_12.method5350(arg0);
			if (local221 == null) {
				local221 = Static227.aClass16_1;
			}
			local221.method5491(Static352.anIntArray345, Static429.anInt7121, Static218.anInt5622, Static384.aClass250_12.anInt6973, Static384.aClass250_12.anInt7007, Static419.anIntArray454, Static214.aClass49Array147, Static384.aClass250_12.anInt7041, Static384.aClass250_12.anInt6997, Static130.anInt2250, Static384.aClass250_12.anInt6987, local42, Static411.aRandom1, Static384.aClass250_12.anInt7029);
			Static113.method1580(Static352.anIntArray345[0], Static352.anIntArray345[3], Static352.anIntArray345[1], Static352.anIntArray345[2]);
		} else if (Static307.aClass250_10 != null && Static357.aClass6_4 == Static455.aClass6_5) {
			@Pc(286) int local286 = Static227.aClass16_1.method5483(Static419.anIntArray454, Static218.anInt5622, Static107.anInt1912 + 16, local42, Static23.anInt495 + 4, Static411.aRandom1, Static214.aClass49Array147);
			Static113.method1580(Static23.anInt495 + 4, 16, Static107.anInt1912, local286 + aClass122_1.method2464(local42));
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)Z")
	public static boolean method105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static62.method968(arg1, arg0) | Static455.method5635(arg1, arg0) | Static156.method2193(arg1, arg0)) & Static133.method1795(arg0, arg1);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILclient!wt;)Lclient!mo;")
	public static Class1_Sub3_Sub12 method107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class268 arg2) {
		@Pc(10) int local10 = arg2.anInt7415 | arg0 << 8;
		@Pc(19) Class1_Sub3_Sub12 local19 = (Class1_Sub3_Sub12) Static270.aClass240_3.method5015((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static143.aClass113_48.method2273(Static143.aClass113_48.method2279(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 8 | arg2.anInt7415;
			local19 = (Class1_Sub3_Sub12) Static270.aClass240_3.method5015((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static143.aClass113_48.method2273(Static143.aClass113_48.method2279(local10));
			if (local31 == null) {
				local10 = arg2.anInt7415 | 0xFFFF00;
				local19 = (Class1_Sub3_Sub12) Static270.aClass240_3.method5015((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static143.aClass113_48.method2273(Static143.aClass113_48.method2279(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static337.method1433(local31);
					local19.aClass268_86 = arg2;
					Static270.aClass240_3.method5021(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static337.method1433(local31);
				local19.aClass268_86 = arg2;
				Static270.aClass240_3.method5021(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static337.method1433(local31);
			local19.aClass268_86 = arg2;
			Static270.aClass240_3.method5021(local19, (long) local10 << 16);
			return local19;
		}
	}
}
