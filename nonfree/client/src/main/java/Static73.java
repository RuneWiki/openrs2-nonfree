import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!kaa;")
	public static Class196 aClass196_5;

	// $FF: synthetic field
	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Ljava/lang/Class;")
	public static Class aClass8;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_35 = new Class381(41, 4);

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "J")
	public static long aLong53 = 0L;

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mj;)Lclient!ep;")
	public static Class5_Sub18 method1209(@OriginalArg(0) Class238 arg0) {
		@Pc(13) Class5_Sub18 local13 = (Class5_Sub18) Static268.aClass306_19.method6943(((long) arg0.anInt5971 << 32) + (long) arg0.anInt5986);
		return local13 == null ? arg0.aClass5_Sub18_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1210(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static274.anInt4921;
		@Pc(3) int[] local3 = Static605.anIntArray544;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static438.anInt7239; local5++) {
			@Pc(15) Class4_Sub1_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) Static558.anIntArray500[local5 - local1])).aClass4_Sub1_Sub1_Sub2_Sub2_1;
			}
			if (local15.aByte139 == arg0 && local15.anInt6838 >= 0) {
				@Pc(41) int local41 = local15.method5932();
				if ((local41 & 0x1) == 0) {
					if ((local15.anInt9805 & 0x1FF) != 0 || (local15.anInt9803 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9805 & 0x1FF) != 256 || (local15.anInt9803 & 0x1FF) != 256) {
					continue;
				}
				@Pc(85) int local85;
				@Pc(90) int local90;
				@Pc(127) int local127;
				if (local41 == 1) {
					local85 = local15.anInt9805 >> 9;
					local90 = local15.anInt9803 >> 9;
					if (local15.anInt6838 > Static109.anIntArrayArray62[local85][local90]) {
						Static109.anIntArrayArray62[local85][local90] = local15.anInt6838;
						Static615.anIntArrayArray58[local85][local90] = 1;
					} else if (local15.anInt6838 == Static109.anIntArrayArray62[local85][local90]) {
						local127 = Static615.anIntArrayArray58[local85][local90]++;
					}
				} else {
					local85 = (local41 - 1) * 256 + 60;
					local90 = local15.anInt9805 - local85 >> 9;
					@Pc(154) int local154 = local15.anInt9803 - local85 >> 9;
					@Pc(161) int local161 = local15.anInt9805 + local85 >> 9;
					@Pc(168) int local168 = local15.anInt9803 + local85 >> 9;
					for (@Pc(170) int local170 = local90; local170 <= local161; local170++) {
						for (@Pc(173) int local173 = local154; local173 <= local168; local173++) {
							if (local15.anInt6838 > Static109.anIntArrayArray62[local170][local173]) {
								Static109.anIntArrayArray62[local170][local173] = local15.anInt6838;
								Static615.anIntArrayArray58[local170][local173] = 1;
							} else if (local15.anInt6838 == Static109.anIntArrayArray62[local170][local173]) {
								local127 = Static615.anIntArrayArray58[local170][local173]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1211() {
		Static667.anInt10783 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static438.anInt7239; local3++) {
			@Pc(14) Class4_Sub1_Sub1_Sub2_Sub2 local14 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) Static558.anIntArray500[local3])).aClass4_Sub1_Sub1_Sub2_Sub2_1;
			if (local14.aBoolean455 && local14.method5927() != -1) {
				@Pc(34) int local34 = (local14.method5932() - 1) * 256 + 252;
				@Pc(41) int local41 = local14.anInt9805 - local34 >> 9;
				@Pc(48) int local48 = local14.anInt9803 - local34 >> 9;
				@Pc(55) Class4_Sub1_Sub1_Sub2 local55 = Static98.method1526(local48, local14.aByte139, local41);
				if (local55 != null) {
					@Pc(60) int local60 = local55.anInt6843;
					if (local55 instanceof Class4_Sub1_Sub1_Sub2_Sub2) {
						local60 += 2048;
					}
					if (local55.anInt6874 == 0 && local55.method5927() != -1) {
						Static84.anIntArray74[Static667.anInt10783] = local60;
						Static177.anIntArray154[Static667.anInt10783] = local60;
						Static667.anInt10783++;
						local55.anInt6874++;
					}
					Static84.anIntArray74[Static667.anInt10783] = local60;
					Static177.anIntArray154[Static667.anInt10783] = local14.anInt6843 + 2048;
					Static667.anInt10783++;
					local55.anInt6874++;
				}
			}
		}
		Static579.method7772(0, Static177.anIntArray154, Static84.anIntArray74, Static667.anInt10783 - 1);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1212(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static274.anInt4921;
		@Pc(3) int[] local3 = Static605.anIntArray544;
		@Pc(12) int local12 = Static561.aBoolean583 ? local1 : local1 + Static438.anInt7239;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(24) Class4_Sub1_Sub1_Sub2 local24;
			if (local14 < local1) {
				local24 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local3[local14]];
			} else {
				local24 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) Static558.anIntArray500[local14 - local1])).aClass4_Sub1_Sub1_Sub2_Sub2_1;
			}
			if (local24.aByte139 == arg0) {
				local24.anInt6874 = 0;
				if (local24.anInt6838 < 0) {
					local24.aBoolean455 = false;
				} else {
					@Pc(58) int local58 = local24.method5932();
					if ((local58 & 0x1) == 0) {
						if ((local24.anInt9805 & 0x1FF) != 0 || (local24.anInt9803 & 0x1FF) != 0) {
							local24.aBoolean455 = false;
							continue;
						}
					} else if ((local24.anInt9805 & 0x1FF) != 256 || (local24.anInt9803 & 0x1FF) != 256) {
						local24.aBoolean455 = false;
						continue;
					}
					@Pc(108) int local108;
					@Pc(113) int local113;
					@Pc(139) int local139;
					if (local58 == 1) {
						local108 = local24.anInt9805 >> 9;
						local113 = local24.anInt9803 >> 9;
						if (local24.anInt6838 != Static109.anIntArrayArray62[local108][local113]) {
							local24.aBoolean455 = true;
							continue;
						}
						if (Static615.anIntArrayArray58[local108][local113] > 1) {
							local139 = Static615.anIntArrayArray58[local108][local113]--;
							local24.aBoolean455 = true;
							continue;
						}
					} else {
						local108 = (local58 - 1) * 256 + 252;
						local113 = local24.anInt9805 - local108 >> 9;
						@Pc(169) int local169 = local24.anInt9803 - local108 >> 9;
						@Pc(176) int local176 = local24.anInt9805 + local108 >> 9;
						@Pc(183) int local183 = local24.anInt9803 + local108 >> 9;
						if (!Static471.method6671(local24.anInt6838, local183, local169, local176, local113)) {
							for (@Pc(194) int local194 = local113; local194 <= local176; local194++) {
								for (@Pc(197) int local197 = local169; local197 <= local183; local197++) {
									if (local24.anInt6838 == Static109.anIntArrayArray62[local194][local197]) {
										local139 = Static615.anIntArrayArray58[local194][local197]--;
									}
								}
							}
							local24.aBoolean455 = true;
							continue;
						}
					}
					local24.aBoolean455 = false;
					local24.anInt9797 = Static461.method6500(local24.anInt9805, local24.aByte139, local24.anInt9803);
					Static686.method2955(local24, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1214() {
		@Pc(1) int local1 = Static274.anInt4921;
		@Pc(3) int[] local3 = Static605.anIntArray544;
		@Pc(8) int local8 = Static577.aClass5_Sub19_25.aClass17_Sub22_1.method7242();
		@Pc(30) boolean local30 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(103) int local103;
		for (@Pc(32) int local32 = 0; local32 < local1; local32++) {
			@Pc(39) Class4_Sub1_Sub1_Sub2_Sub1 local39 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local3[local32]];
			if (!local39.method4088()) {
				local39.anInt6838 = -1;
			} else if (local39.aBoolean300) {
				local39.anInt6838 = -1;
			} else {
				local39.method7575();
				if (local39.aShort104 >= 0 && local39.aShort105 >= 0 && local39.aShort103 < Static271.anInt4910 && local39.aShort102 < Static613.anInt9909) {
					local39.aBoolean301 = local39.aBoolean456 ? local30 : false;
					if (local39 == Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4) {
						local39.anInt6838 = Integer.MAX_VALUE;
					} else {
						local103 = 0;
						if (!local39.aBoolean455) {
							local103++;
						}
						if (local39.anInt6850 > Static565.anInt8921) {
							local103 += 2;
						}
						local103 += 5 - local39.method5932() << 2;
						if (local39.aBoolean303 || local39.aBoolean304) {
							local103 += 512;
						} else {
							if (Static583.anInt9389 == 0) {
								local103 += 32;
							} else {
								local103 += 128;
							}
							local103 += 256;
						}
						local39.anInt6838 = local103 + 1;
					}
				} else {
					local39.anInt6838 = -1;
				}
			}
		}
		for (@Pc(155) int local155 = 0; local155 < Static438.anInt7239; local155++) {
			@Pc(166) Class4_Sub1_Sub1_Sub2_Sub2 local166 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) Static558.anIntArray500[local155])).aClass4_Sub1_Sub1_Sub2_Sub2_1;
			if (local166.method5942() && local166.aClass105_1.method2612(Static23.aClass247_1)) {
				local166.method7575();
				if (local166.aShort104 >= 0 && local166.aShort105 >= 0 && local166.aShort103 < Static271.anInt4910 && local166.aShort102 < Static613.anInt9909) {
					@Pc(213) int local213 = 0;
					if (!local166.aBoolean455) {
						local213++;
					}
					if (local166.anInt6850 > Static565.anInt8921) {
						local213 += 2;
					}
					local213 += 5 - local166.method5932() << 2;
					if (Static583.anInt9389 == 0) {
						if (local166.aClass105_1.aBoolean209) {
							local213 += 64;
						} else {
							local213 += 128;
						}
					} else if (Static583.anInt9389 == 1) {
						if (local166.aClass105_1.aBoolean209) {
							local213 += 32;
						} else {
							local213 += 64;
						}
					}
					if (local166.aClass105_1.aBoolean205) {
						local213 += 1024;
					} else if (!local166.aClass105_1.aBoolean208) {
						local213 += 256;
					}
					local166.anInt6838 = local213 + 1;
				} else {
					local166.anInt6838 = -1;
				}
			} else {
				local166.anInt6838 = -1;
			}
		}
		for (local103 = 0; local103 < Static8.aClass212Array1.length; local103++) {
			@Pc(292) Class212 local292 = Static8.aClass212Array1[local103];
			if (local292 != null) {
				if (local292.anInt5367 == 1) {
					@Pc(308) Class5_Sub9 local308 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local292.anInt5376);
					if (local308 != null) {
						@Pc(313) Class4_Sub1_Sub1_Sub2_Sub2 local313 = local308.aClass4_Sub1_Sub1_Sub2_Sub2_1;
						if (local313.anInt6838 >= 0) {
							local313.anInt6838 += 2048;
						}
					}
				} else if (local292.anInt5367 == 10) {
					@Pc(333) Class4_Sub1_Sub1_Sub2_Sub1 local333 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local292.anInt5376];
					if (local333 != null && local333 != Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 && local333.anInt6838 >= 0) {
						local333.anInt6838 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1215() {
		@Pc(1) int local1 = Static274.anInt4921;
		@Pc(3) int[] local3 = Static605.anIntArray544;
		@Pc(12) int local12 = Static561.aBoolean583 ? local1 : local1 + Static438.anInt7239;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(24) Class4_Sub1_Sub1_Sub2 local24;
			if (local14 < local1) {
				local24 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local3[local14]];
			} else {
				local24 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) Static558.anIntArray500[local14 - local1])).aClass4_Sub1_Sub1_Sub2_Sub2_1;
			}
			if (local24.anInt6838 >= 0) {
				@Pc(44) int local44 = local24.method5932();
				if ((local44 & 0x1) == 0) {
					if ((local24.anInt9805 & 0x1FF) == 0 && (local24.anInt9803 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local24.anInt9805 & 0x1FF) == 256 && (local24.anInt9803 & 0x1FF) == 256) {
					continue;
				}
				local24.anInt9797 = Static461.method6500(local24.anInt9805, local24.aByte139, local24.anInt9803);
				Static686.method2955(local24, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method1219(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(19) char local19 = arg0.charAt(local13);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				local11[local13] = (byte) local19;
			} else if (local19 == '€') {
				local11[local13] = -128;
			} else if (local19 == '‚') {
				local11[local13] = -126;
			} else if (local19 == 'ƒ') {
				local11[local13] = -125;
			} else if (local19 == '„') {
				local11[local13] = -124;
			} else if (local19 == '…') {
				local11[local13] = -123;
			} else if (local19 == '†') {
				local11[local13] = -122;
			} else if (local19 == '‡') {
				local11[local13] = -121;
			} else if (local19 == 'ˆ') {
				local11[local13] = -120;
			} else if (local19 == '‰') {
				local11[local13] = -119;
			} else if (local19 == 'Š') {
				local11[local13] = -118;
			} else if (local19 == '‹') {
				local11[local13] = -117;
			} else if (local19 == 'Œ') {
				local11[local13] = -116;
			} else if (local19 == 'Ž') {
				local11[local13] = -114;
			} else if (local19 == '‘') {
				local11[local13] = -111;
			} else if (local19 == '’') {
				local11[local13] = -110;
			} else if (local19 == '“') {
				local11[local13] = -109;
			} else if (local19 == '”') {
				local11[local13] = -108;
			} else if (local19 == '•') {
				local11[local13] = -107;
			} else if (local19 == '–') {
				local11[local13] = -106;
			} else if (local19 == '—') {
				local11[local13] = -105;
			} else if (local19 == '˜') {
				local11[local13] = -104;
			} else if (local19 == '™') {
				local11[local13] = -103;
			} else if (local19 == 'š') {
				local11[local13] = -102;
			} else if (local19 == '›') {
				local11[local13] = -101;
			} else if (local19 == 'œ') {
				local11[local13] = -100;
			} else if (local19 == 'ž') {
				local11[local13] = -98;
			} else if (local19 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!mj;IIIIIIIIIII)V")
	public static void method1221(@OriginalArg(0) Class238[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label850: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class238 local6 = arg0[local1];
			if (local6 != null && local6.anInt5963 == arg1) {
				@Pc(19) int local19 = local6.anInt6028 + arg6;
				@Pc(24) int local24 = local6.anInt5989 + arg7;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(36) int local36;
				@Pc(42) int local42;
				@Pc(47) int local47;
				if (local6.anInt5976 == 2) {
					local30 = arg2;
					local32 = arg3;
					local34 = arg4;
					local36 = arg5;
				} else {
					local42 = local19 + local6.anInt5985;
					local47 = local24 + local6.anInt5973;
					if (local6.anInt5976 == 9) {
						local42++;
						local47++;
					}
					local30 = local19 > arg2 ? local19 : arg2;
					local32 = local24 > arg3 ? local24 : arg3;
					local34 = local42 < arg4 ? local42 : arg4;
					local36 = local47 < arg5 ? local47 : arg5;
				}
				if (local6.anInt5976 == 0 || local6.aBoolean409 || method1209(local6).anInt2210 != 0 || local6 == Static230.aClass238_4 || local6.anInt5962 == Static236.anInt4067 || local6.anInt5962 == Static201.anInt3623) {
					if (!method1224(local6)) {
						local42 = 0;
						local47 = 0;
						if (Static377.aBoolean419) {
							local42 = Static194.method8971();
							local47 = Static5.method9220();
						}
						if (local6 == Static388.aClass238_11 && Static317.method4846(Static388.aClass238_11) != null) {
							Static56.aBoolean79 = true;
							Static147.anInt2911 = local19;
							Static522.anInt8283 = local24;
						}
						if (local6.aBoolean411 || local30 < local34 && local32 < local36) {
							if (local6.aBoolean397 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								for (@Pc(208) Class5_Sub24 local208 = (Class5_Sub24) Static196.aClass20_11.method378(); local208 != null; local208 = (Class5_Sub24) Static196.aClass20_11.method366()) {
									if (local208.aBoolean274) {
										local208.method9222();
										local208.aClass238_6.aBoolean402 = false;
									}
								}
								if (Static20.anInt292 == 0) {
									Static388.aClass238_11 = null;
									Static230.aClass238_4 = null;
								}
								Static195.anInt3567 = 0;
								Static173.aBoolean682 = false;
								Static51.aBoolean73 = false;
								if (!Static490.aBoolean536) {
									Static395.method5813();
								}
							}
							@Pc(286) boolean local286;
							if (Static300.aClass164_1.method4999() + local42 >= local30 && Static300.aClass164_1.method5000() + local47 >= local32 && Static300.aClass164_1.method4999() + local42 < local34 && Static300.aClass164_1.method5000() + local47 < local36) {
								local286 = true;
							} else {
								local286 = false;
							}
							if (!Static421.aBoolean472 && local286) {
								if (local6.anInt5940 >= 0) {
									Static586.anInt9462 = local6.anInt5940;
								} else if (local6.aBoolean397) {
									Static586.anInt9462 = -1;
								}
							}
							if (!Static490.aBoolean536 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								Static358.method5235(arg10 - local19, local6, arg11 - local24);
							}
							@Pc(347) boolean local347 = false;
							if (Static300.aClass164_1.method5002() && local286) {
								local347 = true;
							}
							@Pc(359) boolean local359 = false;
							@Pc(364) Class5_Sub10 local364 = (Class5_Sub10) Static433.aClass20_37.method378();
							if (local364 != null && local364.method7046() == 0 && local364.method7039() + local42 >= local30 && local364.method7042() + local47 >= local32 && local364.method7039() + local42 < local34 && local364.method7042() + local47 < local36) {
								local359 = true;
							}
							@Pc(420) int local420;
							@Pc(586) int local586;
							if (local6.aByteArray64 != null && !Static112.method1657()) {
								for (local420 = 0; local420 < local6.aByteArray64.length; local420++) {
									if (Static53.aClass297_1.method6737(local6.aByteArray64[local420])) {
										if (local6.anIntArray356 == null || Static565.anInt8921 >= local6.anIntArray356[local420]) {
											@Pc(457) byte local457 = local6.aByteArray65[local420];
											if (local457 == 0 || ((local457 & 0x8) == 0 || !Static53.aClass297_1.method6737(86) && !Static53.aClass297_1.method6737(82) && !Static53.aClass297_1.method6737(81)) && ((local457 & 0x2) == 0 || Static53.aClass297_1.method6737(86)) && ((local457 & 0x1) == 0 || Static53.aClass297_1.method6737(82)) && ((local457 & 0x4) == 0 || Static53.aClass297_1.method6737(81))) {
												if (local420 < 10) {
													Static504.method6987(local420 + 1, "", local6.anInt5971, -1);
												} else if (local420 == 10) {
													Static55.method973();
													@Pc(549) Class5_Sub18 local549 = method1209(local6);
													Static137.method2548(local6, local549.anInt2204, local549.method1972());
													Static570.aString102 = Static70.method1151(local6);
													if (Static570.aString102 == null) {
														Static570.aString102 = "Null";
													}
													Static47.aString9 = local6.aString69 + "<col=ffffff>";
												}
												local586 = local6.anIntArray349[local420];
												if (local6.anIntArray356 == null) {
													local6.anIntArray356 = new int[local6.aByteArray64.length];
												}
												if (local586 == 0) {
													local6.anIntArray356[local420] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray356[local420] = Static565.anInt8921 + local586;
												}
											}
										}
									} else if (local6.anIntArray356 != null) {
										local6.anIntArray356[local420] = 0;
									}
								}
							}
							if (local359) {
								Static650.method8982(local6, local47 + local364.method7042() - local24, local42 + local364.method7039() - local19);
							}
							if (Static388.aClass238_11 != null && Static388.aClass238_11 != local6 && local286 && method1209(local6).method1974()) {
								Static397.aClass238_12 = local6;
							}
							if (local6 == Static230.aClass238_4) {
								Static129.aBoolean146 = true;
								Static583.anInt9374 = local19;
								Static269.anInt4798 = local24;
							}
							if (local6.aBoolean409 || local6.anInt5962 != 0) {
								@Pc(700) Class5_Sub24 local700;
								if (local286 && Static381.anInt6412 != 0 && local6.anObjectArray22 != null) {
									local700 = new Class5_Sub24();
									local700.aBoolean274 = true;
									local700.aClass238_6 = local6;
									local700.anInt4053 = Static381.anInt6412;
									local700.anObjectArray2 = local6.anObjectArray22;
									Static196.aClass20_11.method370(local700);
								}
								if (Static388.aClass238_11 != null || Static490.aBoolean536 || local6.anInt5962 != Static301.anInt5209 && Static195.anInt3567 > 0) {
									local359 = false;
									local347 = false;
									local286 = false;
								}
								@Pc(899) int local899;
								if (local6.anInt5962 != 0) {
									if (local6.anInt5962 == Static138.anInt2744 || local6.anInt5962 == Static573.anInt8990) {
										Static326.aClass238_7 = local6;
										if (Static572.aClass173_1 != null) {
											Static572.aClass173_1.method3972(local6.anInt5973, Static273.aClass100_6);
										}
										if (local6.anInt5962 == Static138.anInt2744) {
											if (Static490.aBoolean536 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
												continue;
											}
											Static143.method2619(Static273.aClass100_6, arg8, arg9);
											@Pc(807) Class4_Sub3 local807 = (Class4_Sub3) Static605.aClass387_8.method9018();
											while (true) {
												if (local807 == null) {
													continue label850;
												}
												if (arg10 >= local807.anInt960 && arg10 < local807.anInt963 && arg11 >= local807.anInt961 && arg11 < local807.anInt962) {
													Static395.method5813();
													Static493.method6907(local807.aClass4_Sub1_Sub1_Sub2_1);
												}
												local807 = (Class4_Sub3) Static605.aClass387_8.method9016();
											}
										}
									}
									@Pc(941) int local941;
									if (local6.anInt5962 == Static236.anInt4067) {
										if (local6.method5323(Static273.aClass100_6) == null || Static215.anInt3739 != 0 && Static215.anInt3739 != 3 || Static490.aBoolean536 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
											continue;
										}
										local420 = arg10 - local19;
										local899 = arg11 - local24;
										local586 = local6.anIntArray352[local899];
										if (local420 < local586 || local420 > local586 + local6.anIntArray353[local899]) {
											continue;
										}
										local420 -= local6.anInt5985 / 2;
										local899 -= local6.anInt5973 / 2;
										if (Static426.anInt7111 == 4) {
											local941 = (int) Static243.aFloat117 & 0x3FFF;
										} else {
											local941 = (int) Static243.aFloat117 + Static271.anInt4907 & 0x3FFF;
										}
										@Pc(953) int local953 = Class42.anIntArray51[local941];
										@Pc(957) int local957 = Class42.anIntArray52[local941];
										if (Static426.anInt7111 != 4) {
											local953 = local953 * (Static283.anInt5029 + 256) >> 8;
											local957 = local957 * (Static283.anInt5029 + 256) >> 8;
										}
										@Pc(986) int local986 = local899 * local953 + local420 * local957 >> 14;
										@Pc(996) int local996 = local899 * local957 - local420 * local953 >> 14;
										@Pc(1007) int local1007;
										@Pc(1015) int local1015;
										if (Static426.anInt7111 == 4) {
											local1007 = (Static488.anInt7900 >> 9) + (local986 >> 2);
											local1015 = (Static334.anInt9969 >> 9) - (local996 >> 2);
										} else {
											@Pc(1024) int local1024 = (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932() - 1) * 256;
											local1007 = (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 - local1024 >> 9) + (local986 >> 2);
											local1015 = (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 - local1024 >> 9) - (local996 >> 2);
										}
										if (Static421.aBoolean472 && (Static326.anInt4132 & 0x40) != 0) {
											@Pc(1059) Class238 local1059 = Static333.method5035(Static516.anInt8202, Static14.anInt171);
											if (local1059 == null) {
												Static55.method973();
											} else {
												Static467.method6573(local1007, 15, local6.anInt5990, Static462.anInt7482, " ->", Static570.aString102, 1L, (long) (local6.anInt5986 << 0 | local6.anInt5971), local1015, true, false, true);
											}
											continue;
										}
										if (Static536.aClass290_6 == Static532.aClass290_5) {
											Static467.method6573(local1007, 51, -1, -1, "", Static184.aClass131_28.method3168(Static375.anInt7800), 1L, 0L, local1015, true, false, true);
										}
										Static467.method6573(local1007, 10, -1, Static363.anInt5922, "", Static422.aString82, 1L, 0L, local1015, true, false, true);
										continue;
									}
									if (local6.anInt5962 == Static301.anInt5209) {
										Static605.aClass238_15 = local6;
										if (local286) {
											Static173.aBoolean682 = true;
										}
										if (local359) {
											local420 = (int) ((double) (local42 + local364.method7039() - local19 - local6.anInt5985 / 2) * 2.0D / (double) Static491.aFloat23);
											local899 = (int) -((double) (local47 + local364.method7042() - local24 - local6.anInt5973 / 2) * 2.0D / (double) Static491.aFloat23);
											local586 = Static124.anInt2052 + local420 + Static491.anInt622;
											local941 = Static381.anInt6410 + local899 + Static491.anInt617;
											@Pc(1199) Class5_Sub1_Sub16 local1199 = Static6.method98();
											if (local1199 == null) {
												continue;
											}
											@Pc(1204) int[] local1204 = new int[3];
											local1199.method6485(local586, local1204, local941);
											if (local1204 != null) {
												if (Static53.aClass297_1.method6737(82) && Static296.anInt5190 > 0) {
													Static543.method7446(local1204[0], local1204[2], local1204[1]);
													continue;
												}
												Static51.aBoolean73 = true;
												Static34.anInt514 = local1204[0];
												Static302.anInt5230 = local1204[1];
												Static91.anInt6734 = local1204[2];
											}
											Static195.anInt3567 = 1;
											Static579.aBoolean604 = false;
											Static412.anInt6980 = Static300.aClass164_1.method4999();
											Static501.anInt8061 = Static300.aClass164_1.method5000();
											continue;
										}
										if (local347 && Static195.anInt3567 > 0) {
											if (Static195.anInt3567 == 1 && (Static412.anInt6980 != Static300.aClass164_1.method4999() || Static501.anInt8061 != Static300.aClass164_1.method5000())) {
												Static638.anInt10402 = Static124.anInt2052;
												Static537.anInt8567 = Static381.anInt6410;
												Static195.anInt3567 = 2;
											}
											if (Static195.anInt3567 == 2) {
												Static579.aBoolean604 = true;
												Static6.method93(Static638.anInt10402 + (int) ((double) (Static412.anInt6980 - Static300.aClass164_1.method4999()) * 2.0D / (double) Static491.aFloat24));
												Static315.method4834(Static537.anInt8567 - (int) ((double) (Static501.anInt8061 - Static300.aClass164_1.method5000()) * 2.0D / (double) Static491.aFloat24));
											}
											continue;
										}
										if (Static195.anInt3567 > 0 && !Static579.aBoolean604) {
											if ((Static446.anInt7312 == 1 || Static308.method4795()) && Static651.anInt10662 > 2) {
												Static470.method6647(Static412.anInt6980, Static501.anInt8061);
											} else if (Static56.method977()) {
												Static470.method6647(Static412.anInt6980, Static501.anInt8061);
											}
										}
										Static195.anInt3567 = 0;
										continue;
									}
									if (local6.anInt5962 == Static283.anInt5030) {
										if (local347) {
											Static501.method6964(local6.anInt5973, local6.anInt5985, local47 + Static300.aClass164_1.method5000() - local24, local42 + Static300.aClass164_1.method4999() - local19);
										}
										continue;
									}
									if (local6.anInt5962 == Static201.anInt3623) {
										Static391.method5779(local24, local6, local19);
										continue;
									}
								}
								if (!local6.aBoolean405 && local359) {
									local6.aBoolean405 = true;
									if (local6.anObjectArray9 != null) {
										local700 = new Class5_Sub24();
										local700.aBoolean274 = true;
										local700.aClass238_6 = local6;
										local700.anInt4054 = local42 + local364.method7039() - local19;
										local700.anInt4053 = local47 + local364.method7042() - local24;
										local700.anObjectArray2 = local6.anObjectArray9;
										Static196.aClass20_11.method370(local700);
									}
								}
								if (local6.aBoolean405 && local347 && local6.anObjectArray10 != null) {
									local700 = new Class5_Sub24();
									local700.aBoolean274 = true;
									local700.aClass238_6 = local6;
									local700.anInt4054 = local42 + Static300.aClass164_1.method4999() - local19;
									local700.anInt4053 = local47 + Static300.aClass164_1.method5000() - local24;
									local700.anObjectArray2 = local6.anObjectArray10;
									Static196.aClass20_11.method370(local700);
								}
								if (local6.aBoolean405 && !local347) {
									local6.aBoolean405 = false;
									if (local6.anObjectArray13 != null) {
										local700 = new Class5_Sub24();
										local700.aBoolean274 = true;
										local700.aClass238_6 = local6;
										local700.anInt4054 = local42 + Static300.aClass164_1.method4999() - local19;
										local700.anInt4053 = local47 + Static300.aClass164_1.method5000() - local24;
										local700.anObjectArray2 = local6.anObjectArray13;
										Static350.aClass20_27.method370(local700);
									}
								}
								if (local347 && local6.anObjectArray14 != null) {
									local700 = new Class5_Sub24();
									local700.aBoolean274 = true;
									local700.aClass238_6 = local6;
									local700.anInt4054 = local42 + Static300.aClass164_1.method4999() - local19;
									local700.anInt4053 = local47 + Static300.aClass164_1.method5000() - local24;
									local700.anObjectArray2 = local6.anObjectArray14;
									Static196.aClass20_11.method370(local700);
								}
								if (!local6.aBoolean402 && local286) {
									local6.aBoolean402 = true;
									if (local6.anObjectArray25 != null) {
										local700 = new Class5_Sub24();
										local700.aBoolean274 = true;
										local700.aClass238_6 = local6;
										local700.anInt4054 = local42 + Static300.aClass164_1.method4999() - local19;
										local700.anInt4053 = local47 + Static300.aClass164_1.method5000() - local24;
										local700.anObjectArray2 = local6.anObjectArray25;
										Static196.aClass20_11.method370(local700);
									}
								}
								if (local6.aBoolean402 && local286 && local6.anObjectArray27 != null) {
									local700 = new Class5_Sub24();
									local700.aBoolean274 = true;
									local700.aClass238_6 = local6;
									local700.anInt4054 = local42 + Static300.aClass164_1.method4999() - local19;
									local700.anInt4053 = local47 + Static300.aClass164_1.method5000() - local24;
									local700.anObjectArray2 = local6.anObjectArray27;
									Static196.aClass20_11.method370(local700);
								}
								if (local6.aBoolean402 && !local286) {
									local6.aBoolean402 = false;
									if (local6.anObjectArray28 != null) {
										local700 = new Class5_Sub24();
										local700.aBoolean274 = true;
										local700.aClass238_6 = local6;
										local700.anInt4054 = local42 + Static300.aClass164_1.method4999() - local19;
										local700.anInt4053 = local47 + Static300.aClass164_1.method5000() - local24;
										local700.anObjectArray2 = local6.anObjectArray28;
										Static350.aClass20_27.method370(local700);
									}
								}
								if (local6.anObjectArray3 != null) {
									local700 = new Class5_Sub24();
									local700.aClass238_6 = local6;
									local700.anObjectArray2 = local6.anObjectArray3;
									Static669.aClass20_74.method370(local700);
								}
								@Pc(1838) Class5_Sub24 local1838;
								if (local6.anObjectArray30 != null && Static425.anInt7106 > local6.anInt6012) {
									if (local6.anIntArray347 == null || Static425.anInt7106 - local6.anInt6012 > 32) {
										local700 = new Class5_Sub24();
										local700.aClass238_6 = local6;
										local700.anObjectArray2 = local6.anObjectArray30;
										Static196.aClass20_11.method370(local700);
									} else {
										label737: for (local420 = local6.anInt6012; local420 < Static425.anInt7106; local420++) {
											local899 = Static253.anIntArray251[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray347.length; local586++) {
												if (local6.anIntArray347[local586] == local899) {
													local1838 = new Class5_Sub24();
													local1838.aClass238_6 = local6;
													local1838.anObjectArray2 = local6.anObjectArray30;
													Static196.aClass20_11.method370(local1838);
													break label737;
												}
											}
										}
									}
									local6.anInt6012 = Static425.anInt7106;
								}
								if (local6.anObjectArray26 != null && Static120.anInt1959 > local6.anInt5956) {
									if (local6.anIntArray348 == null || Static120.anInt1959 - local6.anInt5956 > 32) {
										local700 = new Class5_Sub24();
										local700.aClass238_6 = local6;
										local700.anObjectArray2 = local6.anObjectArray26;
										Static196.aClass20_11.method370(local700);
									} else {
										label713: for (local420 = local6.anInt5956; local420 < Static120.anInt1959; local420++) {
											local899 = Static632.anIntArray584[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray348.length; local586++) {
												if (local6.anIntArray348[local586] == local899) {
													local1838 = new Class5_Sub24();
													local1838.aClass238_6 = local6;
													local1838.anObjectArray2 = local6.anObjectArray26;
													Static196.aClass20_11.method370(local1838);
													break label713;
												}
											}
										}
									}
									local6.anInt5956 = Static120.anInt1959;
								}
								if (local6.anObjectArray15 != null && Static484.anInt7864 > local6.anInt6004) {
									if (local6.anIntArray350 == null || Static484.anInt7864 - local6.anInt6004 > 32) {
										local700 = new Class5_Sub24();
										local700.aClass238_6 = local6;
										local700.anObjectArray2 = local6.anObjectArray15;
										Static196.aClass20_11.method370(local700);
									} else {
										label689: for (local420 = local6.anInt6004; local420 < Static484.anInt7864; local420++) {
											local899 = Static591.anIntArray534[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray350.length; local586++) {
												if (local6.anIntArray350[local586] == local899) {
													local1838 = new Class5_Sub24();
													local1838.aClass238_6 = local6;
													local1838.anObjectArray2 = local6.anObjectArray15;
													Static196.aClass20_11.method370(local1838);
													break label689;
												}
											}
										}
									}
									local6.anInt6004 = Static484.anInt7864;
								}
								if (local6.anObjectArray24 != null && Static611.anInt9860 > local6.anInt5987) {
									if (local6.anIntArray351 == null || Static611.anInt9860 - local6.anInt5987 > 32) {
										local700 = new Class5_Sub24();
										local700.aClass238_6 = local6;
										local700.anObjectArray2 = local6.anObjectArray24;
										Static196.aClass20_11.method370(local700);
									} else {
										label665: for (local420 = local6.anInt5987; local420 < Static611.anInt9860; local420++) {
											local899 = Static505.anIntArray465[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray351.length; local586++) {
												if (local6.anIntArray351[local586] == local899) {
													local1838 = new Class5_Sub24();
													local1838.aClass238_6 = local6;
													local1838.anObjectArray2 = local6.anObjectArray24;
													Static196.aClass20_11.method370(local1838);
													break label665;
												}
											}
										}
									}
									local6.anInt5987 = Static611.anInt9860;
								}
								if (local6.anObjectArray17 != null && Static63.anInt1063 > local6.anInt5955) {
									if (local6.anIntArray355 == null || Static63.anInt1063 - local6.anInt5955 > 32) {
										local700 = new Class5_Sub24();
										local700.aClass238_6 = local6;
										local700.anObjectArray2 = local6.anObjectArray17;
										Static196.aClass20_11.method370(local700);
									} else {
										label641: for (local420 = local6.anInt5955; local420 < Static63.anInt1063; local420++) {
											local899 = Static189.anIntArray163[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray355.length; local586++) {
												if (local6.anIntArray355[local586] == local899) {
													local1838 = new Class5_Sub24();
													local1838.aClass238_6 = local6;
													local1838.anObjectArray2 = local6.anObjectArray17;
													Static196.aClass20_11.method370(local1838);
													break label641;
												}
											}
										}
									}
									local6.anInt5955 = Static63.anInt1063;
								}
								if (local6.anObjectArray20 != null && Static209.anInt3703 > local6.anInt6003) {
									if (local6.anIntArray354 == null || Static209.anInt3703 - local6.anInt6003 > 32) {
										local700 = new Class5_Sub24();
										local700.aClass238_6 = local6;
										local700.anObjectArray2 = local6.anObjectArray20;
										Static196.aClass20_11.method370(local700);
									} else {
										label617: for (local420 = local6.anInt6003; local420 < Static209.anInt3703; local420++) {
											local899 = Static246.anIntArray218[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray354.length; local586++) {
												if (local6.anIntArray354[local586] == local899) {
													local1838 = new Class5_Sub24();
													local1838.aClass238_6 = local6;
													local1838.anObjectArray2 = local6.anObjectArray20;
													Static196.aClass20_11.method370(local1838);
													break label617;
												}
											}
										}
									}
									local6.anInt6003 = Static209.anInt3703;
								}
								if (Static27.anInt365 > local6.anInt5966 && local6.anObjectArray4 != null) {
									local700 = new Class5_Sub24();
									local700.aClass238_6 = local6;
									local700.anObjectArray2 = local6.anObjectArray4;
									Static196.aClass20_11.method370(local700);
								}
								if (Static98.anInt1628 > local6.anInt5966 && local6.anObjectArray36 != null) {
									local700 = new Class5_Sub24();
									local700.aClass238_6 = local6;
									local700.anObjectArray2 = local6.anObjectArray36;
									Static196.aClass20_11.method370(local700);
								}
								if (Static300.anInt5207 > local6.anInt5966 && local6.anObjectArray8 != null) {
									local700 = new Class5_Sub24();
									local700.aClass238_6 = local6;
									local700.anObjectArray2 = local6.anObjectArray8;
									Static196.aClass20_11.method370(local700);
								}
								if (Static46.anInt759 > local6.anInt5966 && local6.anObjectArray34 != null) {
									local700 = new Class5_Sub24();
									local700.aClass238_6 = local6;
									local700.anObjectArray2 = local6.anObjectArray34;
									Static196.aClass20_11.method370(local700);
								}
								if (Static648.anInt10598 > local6.anInt5966 && local6.anObjectArray11 != null) {
									local700 = new Class5_Sub24();
									local700.aClass238_6 = local6;
									local700.anObjectArray2 = local6.anObjectArray11;
									Static196.aClass20_11.method370(local700);
								}
								if (Static156.anInt3035 > local6.anInt5966 && local6.anObjectArray5 != null) {
									local700 = new Class5_Sub24();
									local700.aClass238_6 = local6;
									local700.anObjectArray2 = local6.anObjectArray5;
									Static196.aClass20_11.method370(local700);
								}
								if (Static476.anInt7745 > local6.anInt5966 && local6.anObjectArray6 != null) {
									local700 = new Class5_Sub24();
									local700.aClass238_6 = local6;
									local700.anObjectArray2 = local6.anObjectArray6;
									Static196.aClass20_11.method370(local700);
								}
								local6.anInt5966 = Static55.anInt959;
								if (local6.anObjectArray19 != null) {
									for (local420 = 0; local420 < Static479.anInt7781; local420++) {
										@Pc(2498) Class5_Sub24 local2498 = new Class5_Sub24();
										local2498.aClass238_6 = local6;
										local2498.anInt4050 = Static154.anInterface23Array1[local420].method4633();
										local2498.anInt4051 = Static154.anInterface23Array1[local420].method4634();
										local2498.anObjectArray2 = local6.anObjectArray19;
										Static196.aClass20_11.method370(local2498);
									}
								}
								if (Static131.aBoolean148 && local6.anObjectArray12 != null) {
									local700 = new Class5_Sub24();
									local700.aClass238_6 = local6;
									local700.anObjectArray2 = local6.anObjectArray12;
									Static196.aClass20_11.method370(local700);
								}
							}
							if (local6.anInt5976 == 5 && local6.anInt6020 != -1) {
								local6.method5316(Static332.aClass161_1, Static635.aClass356_1).method3972(local6.anInt5973, Static273.aClass100_6);
							}
							Static100.method1536(local6);
							if (local6.anInt5976 == 0) {
								method1221(arg0, local6.anInt5971, local30, local32, local34, local36, local19 - local6.anInt5951, local24 - local6.anInt5953, arg8, arg9, arg10, arg11);
								if (local6.aClass238Array2 != null) {
									method1221(local6.aClass238Array2, local6.anInt5971, local30, local32, local34, local36, local19 - local6.anInt5951, local24 - local6.anInt5953, arg8, arg9, arg10, arg11);
								}
								@Pc(2636) Class5_Sub38 local2636 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local6.anInt5971);
								if (local2636 != null) {
									if (Static536.aClass290_6 == Static82.aClass290_1 && local2636.anInt6419 == 0 && !Static490.aBoolean536 && local286 && !Static628.aBoolean710) {
										Static395.method5813();
									}
									Static96.method9162(local36, local32, local2636.anInt6418, arg8, local19, arg10, local34, local24, local30, arg11, arg9);
								}
							}
						}
					}
				} else if (local30 < local34 && local32 < local36) {
					Static100.method1536(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Z")
	public static boolean method1223() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static626.aHashtable15.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static626.aHashtable15.get(local17));
		}
		try {
			@Pc(32) Class local32 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(37) Class local37 = Class.forName("java.lang.ClassLoader");
			if (-13055 != -13055) {
				method1227((Class238) null);
			}
			@Pc(53) Field local53 = local37.getDeclaredField("nativeLibraries");
			@Pc(65) Method local65 = local32.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local65.invoke(local53, Boolean.TRUE);
			try {
				local12 = Static626.aHashtable15.keys();
				while (local12.hasMoreElements()) {
					@Pc(84) String local84 = (String) local12.nextElement();
					try {
						@Pc(89) File local89 = (File) Static96.aHashtable19.get(local84);
						@Pc(94) Class local94 = (Class) Static626.aHashtable15.get(local84);
						@Pc(100) Vector local100 = (Vector) local53.get(local94.getClassLoader());
						for (@Pc(102) int local102 = 0; local100.size() > local102; local102++) {
							try {
								@Pc(108) Object local108 = local100.elementAt(local102);
								@Pc(115) Field local115 = local108.getClass().getDeclaredField("name");
								local65.invoke(local115, Boolean.TRUE);
								try {
									@Pc(130) String local130 = (String) local115.get(local108);
									if (local130 != null && local130.equalsIgnoreCase(local89.getCanonicalPath())) {
										@Pc(146) Field local146 = local108.getClass().getDeclaredField("handle");
										@Pc(155) Method local155 = local108.getClass().getDeclaredMethod("finalize");
										local65.invoke(local146, Boolean.TRUE);
										local65.invoke(local155, Boolean.TRUE);
										try {
											local155.invoke(local108);
											local146.set(local108, Integer.valueOf(0));
											local9.remove(local84);
										} catch (@Pc(194) Throwable local194) {
										}
										local65.invoke(local155, Boolean.FALSE);
										local65.invoke(local146, Boolean.FALSE);
									}
								} catch (@Pc(216) Throwable local216) {
								}
								local65.invoke(local115, Boolean.FALSE);
							} catch (@Pc(228) Throwable local228) {
							}
						}
					} catch (@Pc(242) Throwable local242) {
					}
				}
			} catch (@Pc(248) Throwable local248) {
			}
			local65.invoke(local53, Boolean.FALSE);
		} catch (@Pc(260) Throwable local260) {
		}
		Static626.aHashtable15 = local9;
		return Static626.aHashtable15.isEmpty();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mj;)Z")
	public static boolean method1224(@OriginalArg(0) Class238 arg0) {
		if (Static628.aBoolean710) {
			if (method1209(arg0).anInt2210 != 0) {
				return false;
			}
			if (arg0.anInt5976 == 0) {
				return false;
			}
		}
		return arg0.aBoolean404;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1225() {
		for (@Pc(1) int local1 = 0; local1 < Static271.anInt4910; local1++) {
			@Pc(6) int[] local6 = Static109.anIntArrayArray62[local1];
			for (@Pc(8) int local8 = 0; local8 < Static613.anInt9909; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mj;)Lclient!mj;")
	public static Class238 method1227(@OriginalArg(0) Class238 arg0) {
		@Pc(4) int local4 = method1209(arg0).method1976();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			arg0 = Static305.method4761(arg0.anInt5963);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
