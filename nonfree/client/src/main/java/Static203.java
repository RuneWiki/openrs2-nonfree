import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!wc;")
	public static Class110 aClass110_22 = new Class110(200);

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public static int anInt4535 = 0;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public static int anInt4536 = 0;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!qe;")
	private static Class78 aClass78_809 = Static199.method3560("Loading sprites )2 ");

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!qe;")
	public static Class78 aClass78_807 = aClass78_809;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_808 = null;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
	public static int anInt4537 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I")
	public static int method3588(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
	public static void method3590() {
		@Pc(3) int local3 = Static74.anIntArray271[Static182.anInt4232];
		@Pc(7) Class1[] local7 = Static74.aClass1ArrayArray1[Static182.anInt4232];
		Static202.anInt4521 = 0;
		label187: for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class1 local16 = local7[local11];
			@Pc(20) int local20;
			if (Static176.anIntArray667 != null) {
				for (local20 = 0; local20 < Static176.anIntArray667.length; local20++) {
					if (Static176.anIntArray667[local20] != -1000000 && (local16.anInt13 <= Static176.anIntArray667[local20] || local16.anInt19 <= Static176.anIntArray667[local20]) && (local16.anInt12 <= Static93.anIntArray364[local20] || local16.anInt5 <= Static93.anIntArray364[local20]) && (local16.anInt12 >= Static154.anIntArray577[local20] || local16.anInt5 >= Static154.anIntArray577[local20]) && (local16.anInt9 <= Static121.anIntArray795[local20] || local16.anInt1 <= Static121.anIntArray795[local20]) && (local16.anInt9 >= Static51.anIntArray146[local20] || local16.anInt1 >= Static51.anIntArray146[local20])) {
						continue label187;
					}
				}
			}
			@Pc(118) int local118;
			@Pc(129) int local129;
			@Pc(161) int local161;
			@Pc(140) boolean local140;
			if (local16.anInt18 == 1) {
				local20 = local16.anInt4 + Static125.anInt1642 - Static179.anInt4190;
				if (local20 >= 0 && local20 <= Static125.anInt1642 + Static125.anInt1642) {
					local118 = local16.anInt8 + Static125.anInt1642 - Static11.anInt312;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt16 + Static125.anInt1642 - Static11.anInt312;
					if (local129 > Static125.anInt1642 + Static125.anInt1642) {
						local129 = Static125.anInt1642 + Static125.anInt1642;
					}
					local140 = false;
					while (local118 <= local129) {
						if (Static17.aBooleanArrayArray2[local20][local118++]) {
							local140 = true;
							break;
						}
					}
					if (local140) {
						local161 = Static181.anInt4199 - local16.anInt12;
						if (local161 > 32) {
							local16.anInt11 = 1;
						} else {
							if (local161 >= -32) {
								continue;
							}
							local16.anInt11 = 2;
							local161 = -local161;
						}
						local16.anInt3 = (local16.anInt9 - Static59.anInt1039 << 8) / local161;
						local16.anInt14 = (local16.anInt1 - Static59.anInt1039 << 8) / local161;
						local16.anInt15 = (local16.anInt13 - Static53.anInt1723 << 8) / local161;
						local16.anInt2 = (local16.anInt19 - Static53.anInt1723 << 8) / local161;
						Static17.aClass1Array1[Static202.anInt4521++] = local16;
					}
				}
			} else if (local16.anInt18 == 2) {
				local20 = local16.anInt8 + Static125.anInt1642 - Static11.anInt312;
				if (local20 >= 0 && local20 <= Static125.anInt1642 + Static125.anInt1642) {
					local118 = local16.anInt4 + Static125.anInt1642 - Static179.anInt4190;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt20 + Static125.anInt1642 - Static179.anInt4190;
					if (local129 > Static125.anInt1642 + Static125.anInt1642) {
						local129 = Static125.anInt1642 + Static125.anInt1642;
					}
					local140 = false;
					while (local118 <= local129) {
						if (Static17.aBooleanArrayArray2[local118++][local20]) {
							local140 = true;
							break;
						}
					}
					if (local140) {
						local161 = Static59.anInt1039 - local16.anInt9;
						if (local161 > 32) {
							local16.anInt11 = 3;
						} else {
							if (local161 >= -32) {
								continue;
							}
							local16.anInt11 = 4;
							local161 = -local161;
						}
						local16.anInt10 = (local16.anInt12 - Static181.anInt4199 << 8) / local161;
						local16.anInt6 = (local16.anInt5 - Static181.anInt4199 << 8) / local161;
						local16.anInt15 = (local16.anInt13 - Static53.anInt1723 << 8) / local161;
						local16.anInt2 = (local16.anInt19 - Static53.anInt1723 << 8) / local161;
						Static17.aClass1Array1[Static202.anInt4521++] = local16;
					}
				}
			} else if (local16.anInt18 == 4) {
				local20 = local16.anInt13 - Static53.anInt1723;
				if (local20 > 128) {
					local118 = local16.anInt8 + Static125.anInt1642 - Static11.anInt312;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt16 + Static125.anInt1642 - Static11.anInt312;
					if (local129 > Static125.anInt1642 + Static125.anInt1642) {
						local129 = Static125.anInt1642 + Static125.anInt1642;
					}
					if (local118 <= local129) {
						@Pc(411) int local411 = local16.anInt4 + Static125.anInt1642 - Static179.anInt4190;
						if (local411 < 0) {
							local411 = 0;
						}
						local161 = local16.anInt20 + Static125.anInt1642 - Static179.anInt4190;
						if (local161 > Static125.anInt1642 + Static125.anInt1642) {
							local161 = Static125.anInt1642 + Static125.anInt1642;
						}
						@Pc(433) boolean local433 = false;
						label159: for (@Pc(435) int local435 = local411; local435 <= local161; local435++) {
							for (@Pc(438) int local438 = local118; local438 <= local129; local438++) {
								if (Static17.aBooleanArrayArray2[local435][local438]) {
									local433 = true;
									break label159;
								}
							}
						}
						if (local433) {
							local16.anInt11 = 5;
							local16.anInt10 = (local16.anInt12 - Static181.anInt4199 << 8) / local20;
							local16.anInt6 = (local16.anInt5 - Static181.anInt4199 << 8) / local20;
							local16.anInt3 = (local16.anInt9 - Static59.anInt1039 << 8) / local20;
							local16.anInt14 = (local16.anInt1 - Static59.anInt1039 << 8) / local20;
							Static17.aClass1Array1[Static202.anInt4521++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method3591() {
		Static39.aClass110_3.method3889();
		Static182.aClass53_16.method1797();
		Static154.aClass110_14.method3889();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lclient!v;")
	public static Class2_Sub3_Sub28 method3592(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub3_Sub28 local6 = (Class2_Sub3_Sub28) Static17.aClass110_1.method3891((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static100.aClass72_137.method3197(Static148.method2650(arg0), Static130.method2368(arg0));
		local6 = new Class2_Sub3_Sub28();
		if (local24 != null) {
			local6.method3683(new Class2_Sub23(local24));
		}
		Static17.aClass110_1.method3894(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!oe;)V")
	public static void method3593(@OriginalArg(1) Class72 arg0) {
		Static210.aClass72_271 = arg0;
		Static152.anInt3504 = Static210.aClass72_271.method3177(4);
	}
}
