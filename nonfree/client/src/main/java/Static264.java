import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!so", name = "d", descriptor = "[I")
	public static int[] anIntArray496 = new int[25];

	@OriginalMember(owner = "client!so", name = "f", descriptor = "[I")
	public static int[] anIntArray497 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method4157(@OriginalArg(1) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local4];
		for (@Pc(18) int local18 = 0; local18 < local4; local18++) {
			@Pc(29) char local29 = arg0.charAt(local18);
			if (local29 > '\u0000' && local29 < '\u0080' || !(local29 < ' ' || local29 > 'ÿ')) {
				local11[local18] = (byte) local29;
			} else if (local29 == '€') {
				local11[local18] = -128;
			} else if (local29 == '‚') {
				local11[local18] = -126;
			} else if (local29 == 'ƒ') {
				local11[local18] = -125;
			} else if (local29 == '„') {
				local11[local18] = -124;
			} else if (local29 == '…') {
				local11[local18] = -123;
			} else if (local29 == '†') {
				local11[local18] = -122;
			} else if (local29 == '‡') {
				local11[local18] = -121;
			} else if (local29 == 'ˆ') {
				local11[local18] = -120;
			} else if (local29 == '‰') {
				local11[local18] = -119;
			} else if (local29 == 'Š') {
				local11[local18] = -118;
			} else if (local29 == '‹') {
				local11[local18] = -117;
			} else if (local29 == 'Œ') {
				local11[local18] = -116;
			} else if (local29 == 'Ž') {
				local11[local18] = -114;
			} else if (local29 == '‘') {
				local11[local18] = -111;
			} else if (local29 == '’') {
				local11[local18] = -110;
			} else if (local29 == '“') {
				local11[local18] = -109;
			} else if (local29 == '”') {
				local11[local18] = -108;
			} else if (local29 == '•') {
				local11[local18] = -107;
			} else if (local29 == '–') {
				local11[local18] = -106;
			} else if (local29 == '—') {
				local11[local18] = -105;
			} else if (local29 == '˜') {
				local11[local18] = -104;
			} else if (local29 == '™') {
				local11[local18] = -103;
			} else if (local29 == 'š') {
				local11[local18] = -102;
			} else if (local29 == '›') {
				local11[local18] = -101;
			} else if (local29 == 'œ') {
				local11[local18] = -100;
			} else if (local29 == 'ž') {
				local11[local18] = -98;
			} else if (local29 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	public static void method4158() {
		Static237.aClass2_Sub8_Sub5_5 = null;
		Static134.aClass2_Sub8_Sub1Array5 = null;
		Static46.aClass2_Sub8_Sub1Array1 = null;
		Static206.aClass2_Sub8_Sub5_Sub1_1 = null;
		Static60.aClass2_Sub8_Sub1Array2 = null;
		Static273.aClass2_Sub8_Sub1Array10 = null;
		Static108.aClass2_Sub8_Sub1Array4 = null;
		Static92.aClass2_Sub8_Sub5_2 = null;
		Static190.aClass93Array6 = null;
		Static9.aClass93Array5 = null;
		Static229.aClass2_Sub8_Sub1_11 = null;
		Static69.aClass2_Sub8_Sub5_4 = null;
		Static205.aClass2_Sub8_Sub1Array7 = null;
		Static258.aClass2_Sub8_Sub1Array9 = null;
		Static142.aClass2_Sub8_Sub1Array6 = null;
		Static241.aClass2_Sub8_Sub1Array8 = null;
		Static86.aClass2_Sub8_Sub1Array3 = null;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([I[II[ILclient!th;)V")
	public static void method4159(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class15_Sub2_Sub2 arg3) {
		for (@Pc(15) int local15 = 0; local15 < arg2.length; local15++) {
			@Pc(23) int local23 = arg2[local15];
			@Pc(27) int local27 = arg1[local15];
			@Pc(31) int local31 = arg0[local15];
			@Pc(33) int local33 = 0;
			while (local27 != 0 && local33 < arg3.aClass62Array3.length) {
				if ((local27 & 0x1) != 0) {
					if (local23 == -1) {
						arg3.aClass62Array3[local33] = null;
					} else {
						@Pc(68) Class112 local68 = Static208.method3496(local23);
						@Pc(71) int local71 = local68.anInt3857;
						@Pc(76) Class62 local76 = arg3.aClass62Array3[local33];
						if (local76 != null) {
							if (local76.anInt2286 == local23) {
								if (local71 == 0) {
									local76 = arg3.aClass62Array3[local33] = null;
								} else if (local71 == 1) {
									local76.anInt2287 = 0;
									local76.anInt2283 = 0;
									local76.anInt2284 = local31;
									local76.anInt2285 = 1;
									local76.anInt2282 = 0;
									Static28.method558(arg3 == Static22.aClass15_Sub2_Sub2_1, local68, 0, arg3.anInt5358, arg3.anInt5371);
								} else if (local71 == 2) {
									local76.anInt2283 = 0;
								}
							} else if (local68.anInt3870 >= Static208.method3496(local76.anInt2286).anInt3870) {
								local76 = arg3.aClass62Array3[local33] = null;
							}
						}
						if (local76 == null) {
							local76 = arg3.aClass62Array3[local33] = new Class62();
							local76.anInt2282 = 0;
							local76.anInt2284 = local31;
							local76.anInt2283 = 0;
							local76.anInt2287 = 0;
							local76.anInt2286 = local23;
							local76.anInt2285 = 1;
							Static28.method558(Static22.aClass15_Sub2_Sub2_1 == arg3, local68, 0, arg3.anInt5358, arg3.anInt5371);
						}
					}
				}
				local33++;
				local27 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([BI)[B")
	public static byte[] method4161(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub16 local8 = new Class2_Sub16(arg0);
		@Pc(18) int local18 = local8.method2146();
		@Pc(22) int local22 = local8.method2145();
		if (local22 < 0 || Static242.anInt4823 != 0 && Static242.anInt4823 < local22) {
			throw new RuntimeException();
		} else if (local18 == 0) {
			@Pc(42) byte[] local42 = new byte[local22];
			local8.method2135(local42, local22);
			return local42;
		} else {
			@Pc(54) int local54 = local8.method2145();
			if (local54 < 0 || Static242.anInt4823 != 0 && local54 > Static242.anInt4823) {
				throw new RuntimeException();
			}
			@Pc(74) byte[] local74 = new byte[local54];
			if (local18 == 1) {
				Static177.method3177(local74, local54, arg0, local22);
			} else {
				Static48.aClass29_1.method738(local74, local8);
			}
			return local74;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Z")
	public static boolean method4162() {
		@Pc(11) Class142 local11 = Static88.aClass142_1;
		synchronized (Static88.aClass142_1) {
			if (Static12.anInt252 == Static144.anInt3138) {
				return false;
			} else {
				Static21.anInt465 = Static191.anIntArray400[Static12.anInt252];
				Static305.aChar3 = Static199.aCharArray7[Static12.anInt252];
				Static12.anInt252 = Static12.anInt252 + 1 & 0x7F;
				return true;
			}
		}
	}
}
