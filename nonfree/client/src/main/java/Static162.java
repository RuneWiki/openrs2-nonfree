import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!u", name = "wc", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[4][105][105];

	@OriginalMember(owner = "client!u", name = "Ac", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1604 = Static32.method683("Hidden)2");

	@OriginalMember(owner = "client!u", name = "Bc", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1605 = Static32.method683("<col=00ff80>");

	@OriginalMember(owner = "client!u", name = "Hc", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1607 = Static32.method683("Choose Option");

	@OriginalMember(owner = "client!u", name = "Ic", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1608 = Static32.method683(" more options");

	@OriginalMember(owner = "client!u", name = "Jc", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1609 = Static32.method683("Prepared sound engine");

	@OriginalMember(owner = "client!u", name = "Kc", descriptor = "[I")
	public static int[] anIntArray322 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!u", name = "Nc", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1610 = aClass49_1607;

	@OriginalMember(owner = "client!u", name = "Pc", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1611 = Static32.method683(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!u", name = "Rc", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1612 = Static32.method683("Neuer Benutzer");

	@OriginalMember(owner = "client!u", name = "bd", descriptor = "I")
	public static int anInt3603 = 0;

	@OriginalMember(owner = "client!u", name = "cd", descriptor = "I")
	public static int anInt3604 = 0;

	@OriginalMember(owner = "client!u", name = "dd", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1613 = aClass49_1608;

	@OriginalMember(owner = "client!u", name = "jd", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1614 = aClass49_1609;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!lf;")
	public static Class49 method2742(@OriginalArg(1) int arg0) {
		@Pc(12) Class49 local12 = new Class49();
		local12.anInt2058 = 0;
		local12.aByteArray28 = new byte[arg0];
		return local12;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIII)V")
	public static void method2743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				anIntArrayArrayArray7[arg0][arg1 + local3][local7 + arg2] = 0;
			}
		}
		if (arg1 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				anIntArrayArrayArray7[arg0][arg1][arg2 + local7] = anIntArrayArrayArray7[arg0][arg1 - 1][arg2 + local7];
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				anIntArrayArrayArray7[arg0][local7 + arg1][arg2] = anIntArrayArrayArray7[arg0][arg1 + local7][arg2 - 1];
			}
		}
		if (arg1 > 0 && anIntArrayArrayArray7[arg0][arg1 - 1][arg2] != 0) {
			anIntArrayArrayArray7[arg0][arg1][arg2] = anIntArrayArrayArray7[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && anIntArrayArrayArray7[arg0][arg1][arg2 - 1] != 0) {
			anIntArrayArrayArray7[arg0][arg1][arg2] = anIntArrayArrayArray7[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && anIntArrayArrayArray7[arg0][arg1 - 1][arg2 - 1] != 0) {
			anIntArrayArrayArray7[arg0][arg1][arg2] = anIntArrayArrayArray7[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(B)V")
	public static void method2744() {
		aClass49_1614 = null;
		aClass49_1609 = null;
		aClass49_1605 = null;
		aClass49_1612 = null;
		aClass49_1608 = null;
		aClass49_1604 = null;
		aClass49_1610 = null;
		anIntArrayArrayArray7 = null;
		aClass49_1607 = null;
		anIntArray322 = null;
		aClass49_1611 = null;
		aClass49_1613 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public static void method2745() {
		@Pc(3) int local3 = Static91.anIntArray195[Static184.anInt4072];
		@Pc(7) Class76[] local7 = Static91.aClass76ArrayArray1[Static184.anInt4072];
		Static110.anInt2298 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class76 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt3092 == 1) {
				local27 = local16.anInt3112 + Static24.anInt539 - Static140.anInt3001;
				if (local27 >= 0 && local27 <= Static24.anInt539 + Static24.anInt539) {
					local42 = local16.anInt3101 + Static24.anInt539 - Static30.anInt743;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3097 + Static24.anInt539 - Static30.anInt743;
					if (local53 > Static24.anInt539 + Static24.anInt539) {
						local53 = Static24.anInt539 + Static24.anInt539;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static120.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static17.anInt2522 - local16.anInt3113;
						if (local85 > 32) {
							local16.anInt3095 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3095 = 2;
							local85 = -local85;
						}
						local16.anInt3107 = (local16.anInt3110 - Static128.anInt2775 << 8) / local85;
						local16.anInt3100 = (local16.anInt3094 - Static128.anInt2775 << 8) / local85;
						local16.anInt3096 = (local16.anInt3109 - Static156.anInt3422 << 8) / local85;
						local16.anInt3111 = (local16.anInt3106 - Static156.anInt3422 << 8) / local85;
						Static78.aClass76Array1[Static110.anInt2298++] = local16;
					}
				}
			} else if (local16.anInt3092 == 2) {
				local27 = local16.anInt3101 + Static24.anInt539 - Static30.anInt743;
				if (local27 >= 0 && local27 <= Static24.anInt539 + Static24.anInt539) {
					local42 = local16.anInt3112 + Static24.anInt539 - Static140.anInt3001;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3108 + Static24.anInt539 - Static140.anInt3001;
					if (local53 > Static24.anInt539 + Static24.anInt539) {
						local53 = Static24.anInt539 + Static24.anInt539;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static120.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static128.anInt2775 - local16.anInt3110;
						if (local85 > 32) {
							local16.anInt3095 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3095 = 4;
							local85 = -local85;
						}
						local16.anInt3104 = (local16.anInt3113 - Static17.anInt2522 << 8) / local85;
						local16.anInt3090 = (local16.anInt3103 - Static17.anInt2522 << 8) / local85;
						local16.anInt3096 = (local16.anInt3109 - Static156.anInt3422 << 8) / local85;
						local16.anInt3111 = (local16.anInt3106 - Static156.anInt3422 << 8) / local85;
						Static78.aClass76Array1[Static110.anInt2298++] = local16;
					}
				}
			} else if (local16.anInt3092 == 4) {
				local27 = local16.anInt3109 - Static156.anInt3422;
				if (local27 > 128) {
					local42 = local16.anInt3101 + Static24.anInt539 - Static30.anInt743;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3097 + Static24.anInt539 - Static30.anInt743;
					if (local53 > Static24.anInt539 + Static24.anInt539) {
						local53 = Static24.anInt539 + Static24.anInt539;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt3112 + Static24.anInt539 - Static140.anInt3001;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt3108 + Static24.anInt539 - Static140.anInt3001;
						if (local85 > Static24.anInt539 + Static24.anInt539) {
							local85 = Static24.anInt539 + Static24.anInt539;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static120.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt3095 = 5;
							local16.anInt3104 = (local16.anInt3113 - Static17.anInt2522 << 8) / local27;
							local16.anInt3090 = (local16.anInt3103 - Static17.anInt2522 << 8) / local27;
							local16.anInt3107 = (local16.anInt3110 - Static128.anInt2775 << 8) / local27;
							local16.anInt3100 = (local16.anInt3094 - Static128.anInt2775 << 8) / local27;
							Static78.aClass76Array1[Static110.anInt2298++] = local16;
						}
					}
				}
			}
		}
	}
}
