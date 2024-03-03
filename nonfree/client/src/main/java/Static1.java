import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!ro;")
	public static Class206 aClass206_1;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 17)
	public static void method2() {
		@Pc(8) int local8 = Static196.aByteArrayArray7.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static196.aByteArrayArray7[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Class39.anInt1253; local25++) {
					if (Class177_Sub1.anIntArray334[local25] == Static268.anIntArray372[local10]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Class177_Sub1.anIntArray334[Class39.anInt1253] = Static268.anIntArray372[local10];
					local23 = Class39.anInt1253++;
				}
				@Pc(65) Class2_Sub4 local65 = new Class2_Sub4(Static196.aByteArrayArray7[local10]);
				@Pc(67) int local67 = 0;
				while (Static196.aByteArrayArray7[local10].length > local65.anInt5289 && local67 < 511 && Class117.anInt3183 < 1023) {
					@Pc(88) int local88 = local23 | local67++ << 6;
					@Pc(92) int local92 = local65.method4830();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = local102 + (Static268.anIntArray372[local10] >> 8) * 64 - Static154.anInt3136;
					@Pc(132) int local132 = local106 + (Static268.anIntArray372[local10] & 0xFF) * 64 - Static139.anInt2716;
					@Pc(139) Class71 local139 = Static6.aClass219_1.method5571(local65.method4830());
					if (Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local88] == null && (local139.aByte16 & 0x1) > 0 && Class2_Sub6.anInt1114 == local96 && local119 >= 0 && local119 + local139.anInt2038 < Class241.anInt7020 && local132 >= 0 && local132 + local139.anInt2038 < OutputStream_Sub1.anInt4442) {
						Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local88] = new Class11_Sub5_Sub2_Sub2();
						Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local88].anInt4610 = local88;
						@Pc(187) Class11_Sub5_Sub2_Sub2 local187 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local88];
						Class149.anIntArray230[Class117.anInt3183++] = local88;
						local187.anInt4601 = Class83.anInt2345;
						local187.method4343(local139);
						local187.method4323(local187.aClass71_1.anInt2038);
						local187.anInt4596 = local187.aClass71_1.anInt2041 << 3;
						if (local187.anInt4596 == 0) {
							local187.method4331(0);
						} else {
							local187.method4331(local187.aClass71_1.aByte17 + 4 << 11 & 0x3863);
						}
						local187.method4340(local187.method4329(), local96, local119, true, local132);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIZBLjava/lang/String;IILjava/lang/String;IJ)V", line = 117)
	public static void method3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9) {
		if (!Class243.aBoolean477 && Class2_Sub3_Sub24.anInt4949 < 500) {
			@Pc(16) int local16 = arg8 == -1 ? Class77.anInt2216 : arg8;
			@Pc(30) Class2_Sub5 local30 = new Class2_Sub5(arg4, arg7, local16, arg6, arg0, arg9, arg5, arg2, arg1, arg3);
			Class92.aClass135_19.method3541(local30);
			Class2_Sub3_Sub24.anInt4949++;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!nb;ZIIIII)V", line = 136)
	public static void method4(@OriginalArg(0) Class157 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Class2_Sub2_Sub13.anInt4496 >= 50 || (arg0 == null || arg0.anIntArrayArray33 == null || arg0.anIntArrayArray33.length <= arg5 || arg0.anIntArrayArray33[arg5] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray33[arg5][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray33[arg5].length > 1) {
			local65 = (int) ((double) arg0.anIntArrayArray33[arg5].length * Math.random());
			if (local65 > 0) {
				local40 = arg0.anIntArrayArray33[arg5][local65];
			}
		}
		@Pc(78) int local78 = local36 & 0x1F;
		if (local78 == 0) {
			if (arg1) {
				Static28.method939(local46, 255, 0, local40);
			}
		} else if (Static203.aClass177_Sub1_2.anInt4872 != 0) {
			Class11_Sub5_Sub3.anIntArray321[Class2_Sub2_Sub13.anInt4496] = local40;
			Class2_Sub3_Sub34.anIntArray419[Class2_Sub2_Sub13.anInt4496] = local46;
			Class162.anIntArray283[Class2_Sub2_Sub13.anInt4496] = 0;
			Class119.aClass247Array2[Class2_Sub2_Sub13.anInt4496] = null;
			Class156.anIntArray256[Class2_Sub2_Sub13.anInt4496] = 255;
			local65 = (arg3 - 64) / 128;
			@Pc(136) int local136 = (arg4 - 64) / 128;
			Class115.anIntArray188[Class2_Sub2_Sub13.anInt4496] = local78 + (local136 << 8) + (arg2 << 24) + (local65 << 16);
			Class2_Sub2_Sub13.anInt4496++;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qg;I)V", line = 198)
	public static void method5(@OriginalArg(0) Class2_Sub4_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method4870();
		@Pc(20) int local20;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < Class28.anInt751; local14++) {
			local20 = Class64.anIntArray121[local14];
			if ((Class30.aByteArray7[local20] & 0x1) == 0) {
				if (local7 > 0) {
					Class30.aByteArray7[local20] = (byte) (Class30.aByteArray7[local20] | 0x2);
					local7--;
				} else {
					local48 = arg0.method4869(1);
					if (local48 == 0) {
						local7 = Static93.method2163(arg0);
						Class30.aByteArray7[local20] = (byte) (Class30.aByteArray7[local20] | 0x2);
					} else {
						Static7.method6465(arg0, local20);
					}
				}
			}
		}
		arg0.method4866();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4870();
		@Pc(126) int local126;
		for (local20 = 0; local20 < Class28.anInt751; local20++) {
			local48 = Class64.anIntArray121[local20];
			if ((Class30.aByteArray7[local48] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Class30.aByteArray7[local48] = (byte) (Class30.aByteArray7[local48] | 0x2);
				} else {
					local126 = arg0.method4869(1);
					if (local126 == 0) {
						local7 = Static93.method2163(arg0);
						Class30.aByteArray7[local48] = (byte) (Class30.aByteArray7[local48] | 0x2);
					} else {
						Static7.method6465(arg0, local48);
					}
				}
			}
		}
		arg0.method4866();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4870();
		@Pc(210) int local210;
		for (local48 = 0; local48 < Class133.anInt3543; local48++) {
			local126 = Class2_Sub26_Sub1.anIntArray284[local48];
			if ((Class30.aByteArray7[local126] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Class30.aByteArray7[local126] = (byte) (Class30.aByteArray7[local126] | 0x2);
				} else {
					local210 = arg0.method4869(1);
					if (local210 == 0) {
						local7 = Static93.method2163(arg0);
						Class30.aByteArray7[local126] = (byte) (Class30.aByteArray7[local126] | 0x2);
					} else if (Static360.method6034(arg0, local126)) {
						Class30.aByteArray7[local126] = (byte) (Class30.aByteArray7[local126] | 0x2);
					}
				}
			}
		}
		arg0.method4866();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4870();
		for (local126 = 0; local126 < Class133.anInt3543; local126++) {
			local210 = Class2_Sub26_Sub1.anIntArray284[local126];
			if ((Class30.aByteArray7[local210] & 0x1) == 0) {
				if (local7 > 0) {
					Class30.aByteArray7[local210] = (byte) (Class30.aByteArray7[local210] | 0x2);
					local7--;
				} else {
					@Pc(301) int local301 = arg0.method4869(1);
					if (local301 == 0) {
						local7 = Static93.method2163(arg0);
						Class30.aByteArray7[local210] = (byte) (Class30.aByteArray7[local210] | 0x2);
					} else if (Static360.method6034(arg0, local210)) {
						Class30.aByteArray7[local210] = (byte) (Class30.aByteArray7[local210] | 0x2);
					}
				}
			}
		}
		arg0.method4866();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Class28.anInt751 = 0;
		Class133.anInt3543 = 0;
		for (local210 = 1; local210 < 2048; local210++) {
			Class30.aByteArray7[local210] = (byte) (Class30.aByteArray7[local210] >> 1);
			@Pc(366) Class11_Sub5_Sub2_Sub1 local366 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local210];
			if (local366 == null) {
				Class2_Sub26_Sub1.anIntArray284[Class133.anInt3543++] = local210;
			} else {
				Class64.anIntArray121[Class28.anInt751++] = local210;
			}
		}
	}
}
