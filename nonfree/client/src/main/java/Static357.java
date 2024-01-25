import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!or", name = "I", descriptor = "Lclient!kea;")
	public static Class161 aClass161_77;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method5594(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(27) char local27 = arg0.charAt(local13);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local11[local13] = (byte) local27;
			} else if (local27 == '€') {
				local11[local13] = -128;
			} else if (local27 == '‚') {
				local11[local13] = -126;
			} else if (local27 == 'ƒ') {
				local11[local13] = -125;
			} else if (local27 == '„') {
				local11[local13] = -124;
			} else if (local27 == '…') {
				local11[local13] = -123;
			} else if (local27 == '†') {
				local11[local13] = -122;
			} else if (local27 == '‡') {
				local11[local13] = -121;
			} else if (local27 == 'ˆ') {
				local11[local13] = -120;
			} else if (local27 == '‰') {
				local11[local13] = -119;
			} else if (local27 == 'Š') {
				local11[local13] = -118;
			} else if (local27 == '‹') {
				local11[local13] = -117;
			} else if (local27 == 'Œ') {
				local11[local13] = -116;
			} else if (local27 == 'Ž') {
				local11[local13] = -114;
			} else if (local27 == '‘') {
				local11[local13] = -111;
			} else if (local27 == '’') {
				local11[local13] = -110;
			} else if (local27 == '“') {
				local11[local13] = -109;
			} else if (local27 == '”') {
				local11[local13] = -108;
			} else if (local27 == '•') {
				local11[local13] = -107;
			} else if (local27 == '–') {
				local11[local13] = -106;
			} else if (local27 == '—') {
				local11[local13] = -105;
			} else if (local27 == '˜') {
				local11[local13] = -104;
			} else if (local27 == '™') {
				local11[local13] = -103;
			} else if (local27 == 'š') {
				local11[local13] = -102;
			} else if (local27 == '›') {
				local11[local13] = -101;
			} else if (local27 == 'œ') {
				local11[local13] = -100;
			} else if (local27 == 'ž') {
				local11[local13] = -98;
			} else if (local27 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZ[B)Ljava/lang/String;")
	public static String method5602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg0 + arg1;
		for (@Pc(22) int local22 = arg0; local22 < local20; local22++) {
			@Pc(30) int local30 = arg2[local22] & 0xFF;
			if (local30 < 128) {
				local8[local16++] = (char) local30;
			} else if (local30 >= 194) {
				@Pc(85) int local85;
				if (local30 < 224) {
					if (local22 + 1 >= local20) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local22++;
					local85 = arg2[local22] & 0xFF;
					if (local85 < 128 || local85 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local16++] = (char) ((local30 & 0x3FFFF3F) << 6 | local85 & 0xFFFFFF7F);
				} else if (local30 < 240) {
					if (local22 + 2 >= local20) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local22++;
					local85 = arg2[local22] & 0xFF;
					if (local85 < 128 || local85 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local22++;
					@Pc(156) int local156 = arg2[local22] & 0xFF;
					if (local156 < 128 || local156 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local16++] = (char) ((local85 & 0x3FFFF7F) << 6 | local30 << 12 & 0xFFF1F000 | local156 & 0xFFFFFF7F);
				} else if (local30 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local30);
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local30);
			}
		}
		return new String(local8, 0, local16);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)I")
	public static int method5606() {
		if ((double) Static55.aFloat68 == 3.0D) {
			return 37;
		} else if ((double) Static55.aFloat68 == 4.0D) {
			return 50;
		} else if ((double) Static55.aFloat68 == 6.0D) {
			return 75;
		} else if ((double) Static55.aFloat68 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method5610(@OriginalArg(1) Class5 arg0) {
		@Pc(7) int local7 = Static87.anInt1887;
		@Pc(9) int local9 = Static386.anInt7125;
		@Pc(16) int local16 = Static256.anInt5196;
		@Pc(18) int local18 = Static199.anInt4475;
		arg0.method7459(local16, local9, -10660793, local18, local7);
		arg0.method7459(local16 - 2, local9 + 1, -16777216, 16, local7 + 1);
		arg0.method7440(local18 - 19, local9 + 18, local16 - 2, -16777216, local7 + 1);
		Static294.aClass59_2.method7281(local9 + 14, Static490.aClass67_143.method1934(Static193.anInt7803), -10660793, -1, local7 + 3);
		@Pc(77) int local77 = Static35.aClass54_1.method4074();
		@Pc(81) int local81 = Static35.aClass54_1.method4071();
		@Pc(83) int local83 = 0;
		for (@Pc(88) Class3_Sub11 local88 = (Class3_Sub11) Static255.aClass71_43.method2089(); local88 != null; local88 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
			@Pc(103) int local103 = (Static179.anInt4933 - local83 - 1) * 16 + local9 + 31;
			@Pc(105) short local105 = -1;
			if (local7 < local77 && local16 + local7 > local77 && local81 > local103 - 13 && local103 + 3 > local81 && local88.aBoolean117) {
				local105 = -256;
			}
			@Pc(146) int[] local146 = null;
			if (Static95.method1856(local88.anInt1419)) {
				local146 = Static99.aClass96_7.method2508((int) local88.aLong48).anIntArray132;
			} else if (local88.anInt1422 != -1) {
				local146 = Static99.aClass96_7.method2508(local88.anInt1422).anIntArray132;
			} else if (Static153.method2639(local88.anInt1419)) {
				@Pc(179) Class3_Sub3 local179 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local88.aLong48);
				if (local179 != null) {
					@Pc(184) Class6_Sub1_Sub2_Sub2 local184 = local179.aClass6_Sub1_Sub2_Sub2_1;
					@Pc(187) Class230 local187 = local184.aClass230_1;
					if (local187.anIntArray627 != null) {
						local187 = local187.method5898(Static127.aClass215_1);
					}
					if (local187 != null) {
						local146 = local187.anIntArray629;
					}
				}
			} else if (Static359.method5619(local88.anInt1419)) {
				@Pc(225) Class242 local225;
				if (local88.anInt1419 == 1008) {
					local225 = Static454.aClass298_3.method7185((int) local88.aLong48);
				} else {
					local225 = Static454.aClass298_3.method7185((int) (local88.aLong48 >>> 32 & 0x7FFFFFFFL));
				}
				if (local225.anIntArray632 != null) {
					local225 = local225.method5975(Static127.aClass215_1);
				}
				if (local225 != null) {
					local146 = local225.anIntArray636;
				}
			}
			@Pc(258) String local258 = Static409.method6186(local88);
			if (local146 != null) {
				local258 = local258 + Static180.method3434(local146);
			}
			Static294.aClass59_2.method7269(Static525.aClass119Array16, local258, Static260.anIntArray466, local103, local105, local7 + 3);
			if (local88.aBoolean116) {
				Static35.aClass119_3.method6678(Static25.aClass53_6.method1378(local258) + local7 + 5, local103 + -12);
			}
			local83++;
		}
		Static281.method4818(Static386.anInt7125, Static256.anInt5196, Static87.anInt1887, Static199.anInt4475);
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V")
	public static void method5611() {
		for (@Pc(3) int local3 = 0; local3 < Static128.anInt2675; local3++) {
			@Pc(9) Class70 local9 = Static360.aClass70Array1[local3];
			if (local9.method2063()) {
				if (local9.aClass3_Sub9_Sub2_1 == null) {
					local9.anInt2330 = Integer.MIN_VALUE;
				} else {
					Static530.aClass3_Sub9_Sub3_2.method5653(local9.aClass3_Sub9_Sub2_1);
				}
			}
		}
	}
}
