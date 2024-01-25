import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "Lclient!sm;")
	public static Class227 aClass227_6;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "Z")
	public static boolean aBoolean511;

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "Lclient!vt;")
	public static Class263 aClass263_5;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
	public static int anInt7605 = 0;

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "[B")
	public static final byte[] aByteArray95 = new byte[2048];

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILclient!mn;I)Lclient!aq;")
	public static Class15 method6198(@OriginalArg(2) Class171 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method3658(arg1, 0);
		return local14 == null ? null : new Class15(local14);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!gf;IB)Lclient!aa;")
	public static Class2_Sub1_Sub1 method6199(@OriginalArg(0) int arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg1.anInt2185 | arg2 << 8;
		@Pc(24) Class2_Sub1_Sub1 local24 = (Class2_Sub1_Sub1) Static187.aClass111_2.method2310((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static436.aClass171_96.method3664(Static436.aClass171_96.method3649(local15));
		if (local36 == null) {
			local15 = arg0 + 65536 << 8 | arg1.anInt2185;
			local24 = (Class2_Sub1_Sub1) Static187.aClass111_2.method2310((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static436.aClass171_96.method3664(Static436.aClass171_96.method3649(local15));
			if (local36 == null) {
				local15 = arg1.anInt2185 | 0xFFFF00;
				local24 = (Class2_Sub1_Sub1) Static187.aClass111_2.method2310((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static436.aClass171_96.method3664(Static436.aClass171_96.method3649(local15));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static104.method1543(local36);
					local24.aClass91_1 = arg1;
					Static187.aClass111_2.method2312(local24, (long) local15 << 16);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static104.method1543(local36);
				local24.aClass91_1 = arg1;
				Static187.aClass111_2.method2312(local24, (long) local15 << 16);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static104.method1543(local36);
			local24.aClass91_1 = arg1;
			Static187.aClass111_2.method2312(local24, (long) local15 << 16);
			return local24;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	public static void method6201() {
		@Pc(8) int local8 = Static328.aByteArrayArray18.length;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			if (Static328.aByteArrayArray18[local19] != null) {
				@Pc(27) int local27 = -1;
				for (@Pc(29) int local29 = 0; local29 < Static229.anInt3812; local29++) {
					if (Static450.anIntArray635[local19] == Static393.anIntArray548[local29]) {
						local27 = local29;
						break;
					}
				}
				if (local27 == -1) {
					Static393.anIntArray548[Static229.anInt3812] = Static450.anIntArray635[local19];
					local27 = Static229.anInt3812++;
				}
				@Pc(69) Class2_Sub17 local69 = new Class2_Sub17(Static328.aByteArrayArray18[local19]);
				@Pc(71) int local71 = 0;
				while (local69.anInt7523 < Static328.aByteArrayArray18[local19].length && local71 < 511 && Static458.anInt7721 < 1023) {
					@Pc(90) int local90 = local71++ << 6 | local27;
					@Pc(94) int local94 = local69.method6148();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(122) int local122 = (Static450.anIntArray635[local19] >> 8) * 64 + local104 - Static386.anInt7205;
					@Pc(135) int local135 = (Static450.anIntArray635[local19] & 0xFF) * 64 + local108 - Static153.anInt2798;
					@Pc(142) Class82 local142 = Static227.aClass54_2.method1128(local69.method6148());
					@Pc(149) Class2_Sub34 local149 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local90);
					if (local149 == null && (local142.aByte14 & 0x1) > 0 && local98 == Static184.anInt3250 && local122 >= 0 && local142.anInt1963 + local122 < Static234.anInt3949 && local135 >= 0 && local135 + local142.anInt1963 < Static371.anInt6492) {
						@Pc(189) Class11_Sub5_Sub2_Sub2 local189 = new Class11_Sub5_Sub2_Sub2();
						local189.anInt7670 = local90;
						@Pc(197) Class2_Sub34 local197 = new Class2_Sub34(local189);
						Static400.aClass220_41.method5104(local197, (long) local90);
						Static226.aClass2_Sub34Array1[Static30.anInt548++] = local197;
						Static164.anIntArray253[Static458.anInt7721++] = local90;
						local189.anInt7634 = Static277.anInt5022;
						local189.method6235(local142);
						local189.method6229(local189.aClass82_1.anInt1963);
						local189.anInt7673 = local189.aClass82_1.anInt1974 << 3;
						local189.method6225(true, local189.aClass82_1.aByte17 + 4 << 11 & 0x3DBB);
						local189.method6233(local189.method6215(), local122, local98, local135, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([I[IZLclient!gh;[I)V")
	public static void method6202(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class11_Sub5_Sub2_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(18) int local18 = arg1[local7];
			@Pc(22) int local22 = arg3[local7];
			@Pc(26) int local26 = arg0[local7];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && arg2.aClass92Array3.length > local28) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg2.aClass92Array3[local28] = null;
					} else {
						@Pc(50) Class109 local50 = Static37.aClass80_1.method1879(local18);
						@Pc(53) int local53 = local50.anInt2788;
						@Pc(58) Class92 local58 = arg2.aClass92Array3[local28];
						if (local58 != null) {
							if (local58.anInt2199 == local18) {
								if (local53 == 0) {
									local58 = arg2.aClass92Array3[local28] = null;
								} else if (local53 == 1) {
									local58.anInt2197 = 1;
									local58.anInt2200 = 0;
									local58.anInt2198 = local26;
									local58.anInt2201 = 0;
									local58.anInt2193 = 0;
									Static245.method3411(Static127.aClass11_Sub5_Sub2_Sub1_2 == arg2, 0, local50, arg2.anInt7626, arg2.anInt7622, arg2.aByte101);
								} else if (local53 == 2) {
									local58.anInt2200 = 0;
								}
							} else if (local50.anInt2777 >= Static37.aClass80_1.method1879(local58.anInt2199).anInt2777) {
								local58 = arg2.aClass92Array3[local28] = null;
							}
						}
						if (local58 == null) {
							local58 = arg2.aClass92Array3[local28] = new Class92();
							local58.anInt2198 = local26;
							local58.anInt2197 = 1;
							local58.anInt2193 = 0;
							local58.anInt2200 = 0;
							local58.anInt2201 = 0;
							local58.anInt2199 = local18;
							Static245.method3411(arg2 == Static127.aClass11_Sub5_Sub2_Sub1_2, 0, local50, arg2.anInt7626, arg2.anInt7622, arg2.aByte101);
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}
}
