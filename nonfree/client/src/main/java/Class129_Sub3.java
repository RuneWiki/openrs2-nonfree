import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class129_Sub3 extends Class129 {

	@OriginalMember(owner = "client!lia", name = "qb", descriptor = "I")
	private int anInt5901;

	@OriginalMember(owner = "client!lia", name = "ac", descriptor = "Lclient!via;")
	private Class377 aClass377_1;

	@OriginalMember(owner = "client!lia", name = "tc", descriptor = "I")
	private int anInt5905;

	@OriginalMember(owner = "client!lia", name = "O", descriptor = "Lclient!ii;")
	private Class174 aClass174_1;

	@OriginalMember(owner = "client!lia", name = "Zb", descriptor = "Lclient!via;")
	private Class377 aClass377_2;

	@OriginalMember(owner = "client!lia", name = "I", descriptor = "I")
	private int anInt5911;

	@OriginalMember(owner = "client!lia", name = "ob", descriptor = "I")
	private int anInt5914;

	@OriginalMember(owner = "client!lia", name = "xb", descriptor = "Z")
	private boolean aBoolean418;

	@OriginalMember(owner = "client!lia", name = "Bb", descriptor = "I")
	private int anInt5917;

	@OriginalMember(owner = "client!lia", name = "x", descriptor = "Lclient!via;")
	private Class377 aClass377_3;

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "I")
	private int anInt5922;

	@OriginalMember(owner = "client!lia", name = "w", descriptor = "Lclient!via;")
	private Class377 aClass377_4;

	@OriginalMember(owner = "client!lia", name = "P", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_13;

	@OriginalMember(owner = "client!lia", name = "S", descriptor = "I")
	private int anInt5941;

	@OriginalMember(owner = "client!lia", name = "Cc", descriptor = "Lclient!ul;")
	private Class367 aClass367_1;

	@OriginalMember(owner = "client!lia", name = "Ob", descriptor = "I")
	private int anInt5963;

	@OriginalMember(owner = "client!lia", name = "Fc", descriptor = "I")
	private int anInt5968;

	@OriginalMember(owner = "client!lia", name = "gb", descriptor = "I")
	private int anInt5969;

	@OriginalMember(owner = "client!lia", name = "Tb", descriptor = "I")
	private int anInt5971;

	@OriginalMember(owner = "client!lia", name = "H", descriptor = "Z")
	private boolean aBoolean420;

	@OriginalMember(owner = "client!lia", name = "r", descriptor = "Z")
	private boolean aBoolean422;

	@OriginalMember(owner = "client!lia", name = "Ac", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!lia", name = "Dc", descriptor = "I")
	private int anInt5925;

	@OriginalMember(owner = "client!lia", name = "X", descriptor = "I")
	private int anInt5903;

	@OriginalMember(owner = "client!lia", name = "Bc", descriptor = "Z")
	private boolean aBoolean419;

	@OriginalMember(owner = "client!lia", name = "sc", descriptor = "Z")
	private boolean aBoolean421;

	@OriginalMember(owner = "client!lia", name = "Ab", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!lia", name = "Hb", descriptor = "I")
	private int anInt5908;

	@OriginalMember(owner = "client!lia", name = "Yb", descriptor = "I")
	private int anInt5910;

	@OriginalMember(owner = "client!lia", name = "Y", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!lia", name = "Z", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!lia", name = "Rb", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!lia", name = "ec", descriptor = "[Lclient!tm;")
	private Class352[] aClass352Array5;

	@OriginalMember(owner = "client!lia", name = "u", descriptor = "[Lclient!ih;")
	private Class172[] aClass172Array5;

	@OriginalMember(owner = "client!lia", name = "v", descriptor = "I")
	private int anInt5909;

	@OriginalMember(owner = "client!lia", name = "Lb", descriptor = "[Lclient!wga;")
	private Class392[] aClass392Array1;

	@OriginalMember(owner = "client!lia", name = "Kb", descriptor = "[Lclient!og;")
	private Class268[] aClass268Array1;

	@OriginalMember(owner = "client!lia", name = "U", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!lia", name = "Mb", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!lia", name = "R", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!lia", name = "zc", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!lia", name = "hc", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!lia", name = "J", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!lia", name = "F", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!lia", name = "M", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!lia", name = "vc", descriptor = "[F")
	private float[] aFloatArray45;

	@OriginalMember(owner = "client!lia", name = "L", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!lia", name = "Ib", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!lia", name = "Nb", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!lia", name = "nb", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!lia", name = "Hc", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!lia", name = "Cb", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!lia", name = "Gc", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!lia", name = "Vb", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!lia", name = "ub", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!lia", name = "W", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!lia", name = "ic", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!lia", name = "Ub", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!lia", name = "mb", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!lia", name = "Pb", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!lia", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!he;Lclient!dea;IIII)V")
	public Class129_Sub3(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(9) Interface4 local9 = arg0.anInterface4_12;
		@Pc(13) int[] local13 = new int[arg1.anInt1750];
		this.anIntArray326 = new int[arg1.anInt1755 + 1];
		for (@Pc(22) int local22 = 0; local22 < arg1.anInt1750; local22++) {
			if (arg1.aByteArray28 == null || arg1.aByteArray28[local22] != 2) {
				if (arg1.aShortArray22 != null && arg1.aShortArray22[local22] != -1) {
					@Pc(59) Class69 local59 = local9.method8975(arg1.aShortArray22[local22] & 0xFFFF);
					if (((this.anInt5941 & 0x40) == 0 || !local59.aBoolean110) && local59.aBoolean114) {
						continue;
					}
				}
				local13[this.anInt5925++] = local22;
				this.anIntArray326[arg1.aShortArray25[local22]]++;
				this.anIntArray326[arg1.aShortArray27[local22]]++;
				this.anIntArray326[arg1.aShortArray24[local22]]++;
			}
		}
		this.anInt5903 = this.anInt5925;
		@Pc(139) long[] local139 = new long[this.anInt5925];
		@Pc(152) boolean local152 = (this.anInt5917 & 0x100) != 0;
		@Pc(163) int local163;
		@Pc(176) int local176;
		@Pc(351) int local351;
		for (@Pc(154) int local154 = 0; local154 < this.anInt5925; local154++) {
			@Pc(159) int local159 = local13[local154];
			@Pc(161) Class69 local161 = null;
			local163 = 0;
			@Pc(165) byte local165 = 0;
			@Pc(167) byte local167 = 0;
			@Pc(169) byte local169 = 0;
			if (arg1.aClass381Array1 != null) {
				@Pc(174) boolean local174 = false;
				for (local176 = 0; local176 < arg1.aClass381Array1.length; local176++) {
					@Pc(182) Class381 local182 = arg1.aClass381Array1[local176];
					if (local159 == local182.anInt10709) {
						@Pc(191) Class109 local191 = Static133.method2022(local182.anInt10711);
						if (local191.aBoolean162) {
							local174 = true;
						}
						if (local191.anInt2374 != -1) {
							@Pc(207) Class69 local207 = local9.method8975(local191.anInt2374);
							if (local207.anInt1679 == 2) {
								this.aBoolean419 = true;
							}
						}
					}
				}
				if (local174) {
					local139[local154] = Long.MAX_VALUE;
					this.anInt5903--;
					continue;
				}
			}
			@Pc(240) short local240 = -1;
			if (arg1.aShortArray22 != null) {
				local240 = arg1.aShortArray22[local159];
				if (local240 != -1) {
					local161 = local9.method8975(local240 & 0xFFFF);
					if ((this.anInt5941 & 0x40) != 0 && local161.aBoolean110) {
						local240 = -1;
						local161 = null;
					} else {
						local167 = local161.aByte19;
						local169 = local161.aByte18;
					}
				}
			}
			@Pc(309) boolean local309 = arg1.aByteArray29 != null && arg1.aByteArray29[local159] != 0 || local161 != null && local161.anInt1679 != 0;
			if ((local152 || local309) && arg1.aByteArray27 != null) {
				local163 += arg1.aByteArray27[local159] << 17;
			}
			if (local309) {
				local163 += 65536;
			}
			local163 += (local167 & 0xFF) << 8;
			local351 = local165 + ((local240 & 0xFFFF) << 16);
			local163 += local169 & 0xFF;
			@Pc(363) int local363 = local351 + (local154 & 0xFFFF);
			local139[local154] = (long) local363 + ((long) local163 << 32);
			this.aBoolean421 |= local161 != null && (local161.aByte23 != 0 || local161.aByte24 != 0);
			this.aBoolean419 |= local309;
		}
		Static10.method116(local139, local13);
		this.anIntArray330 = arg1.anIntArray99;
		this.anInt5908 = arg1.anInt1746;
		this.anInt5910 = arg1.anInt1755;
		this.aShortArray79 = arg1.aShortArray28;
		this.anIntArray325 = arg1.anIntArray93;
		this.anIntArray331 = arg1.anIntArray102;
		@Pc(437) Class110[] local437 = new Class110[this.anInt5910];
		this.aClass352Array5 = arg1.aClass352Array1;
		this.aClass172Array5 = arg1.aClass172Array1;
		@Pc(465) int local465;
		@Pc(478) int local478;
		@Pc(522) int local522;
		if (arg1.aClass381Array1 != null) {
			this.anInt5909 = arg1.aClass381Array1.length;
			this.aClass392Array1 = new Class392[this.anInt5909];
			this.aClass268Array1 = new Class268[this.anInt5909];
			for (local465 = 0; local465 < this.anInt5909; local465++) {
				@Pc(471) Class381 local471 = arg1.aClass381Array1[local465];
				@Pc(476) Class109 local476 = Static133.method2022(local471.anInt10711);
				local478 = -1;
				for (@Pc(480) int local480 = 0; local480 < this.anInt5925; local480++) {
					if (local471.anInt10709 == local13[local480]) {
						local478 = local480;
						break;
					}
				}
				if (local478 == -1) {
					throw new RuntimeException();
				}
				local522 = Static302.anIntArray299[arg1.aShortArray21[local471.anInt10709] & 0xFFFF] & 0xFFFFFF;
				@Pc(540) int local540 = local522 | 255 - (arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local471.anInt10709]) << 24;
				this.aClass268Array1[local465] = new Class268(local478, arg1.aShortArray25[local471.anInt10709], arg1.aShortArray27[local471.anInt10709], arg1.aShortArray24[local471.anInt10709], local476.anInt2368, local476.anInt2370, local476.anInt2374, local476.anInt2375, local476.anInt2373, local476.aBoolean162, local476.aBoolean163, local471.anInt10716);
				this.aClass392Array1[local465] = new Class392(local540);
			}
		}
		local465 = this.anInt5925 * 3;
		this.aShortArray75 = new short[local465];
		this.aShort65 = (short) arg4;
		if (arg1.aShortArray23 != null) {
			this.aShortArray85 = new short[this.anInt5925];
		}
		this.aShortArray86 = new short[this.anInt5925];
		this.aShortArray77 = new short[this.anInt5925];
		this.aShortArray83 = new short[local465];
		this.aByteArray70 = new byte[local465];
		this.aShort64 = (short) arg3;
		Static84.aLongArray7 = new long[local465];
		this.aFloatArray45 = new float[local465];
		this.aShortArray80 = new short[this.anInt5925];
		this.aShortArray84 = new short[local465];
		this.aByteArray71 = new byte[this.anInt5925];
		this.aShortArray76 = new short[local465];
		this.aShortArray78 = new short[local465];
		this.aShortArray87 = new short[this.anInt5925];
		this.aFloatArray44 = new float[local465];
		this.aShortArray82 = new short[this.anInt5925];
		this.aShortArray81 = new short[local465];
		local163 = 0;
		for (local351 = 0; local351 < arg1.anInt1755; local351++) {
			local478 = this.anIntArray326[local351];
			this.anIntArray326[local351] = local163;
			local163 += local478;
			local437[local351] = new Class110();
		}
		this.anIntArray326[arg1.anInt1755] = local163;
		@Pc(735) Class178 local735 = Static287.method6688(arg1, this.anInt5925, local13);
		@Pc(739) Class63[] local739 = new Class63[arg1.anInt1750];
		@Pc(779) int local779;
		@Pc(790) int local790;
		@Pc(801) int local801;
		@Pc(757) short local757;
		@Pc(768) int local768;
		for (local522 = 0; local522 < arg1.anInt1750; local522++) {
			@Pc(747) short local747 = arg1.aShortArray25[local522];
			@Pc(752) short local752 = arg1.aShortArray27[local522];
			local757 = arg1.aShortArray24[local522];
			local768 = this.anIntArray325[local752] - this.anIntArray325[local747];
			local779 = this.anIntArray331[local752] - this.anIntArray331[local747];
			local790 = this.anIntArray330[local752] - this.anIntArray330[local747];
			local801 = this.anIntArray325[local757] - this.anIntArray325[local747];
			@Pc(812) int local812 = this.anIntArray331[local757] - this.anIntArray331[local747];
			@Pc(823) int local823 = this.anIntArray330[local757] - this.anIntArray330[local747];
			@Pc(831) int local831 = local823 * local779 - local790 * local812;
			@Pc(840) int local840 = local790 * local801 - local768 * local823;
			@Pc(849) int local849 = local812 * local768 - local779 * local801;
			while (local831 > 8192 || local840 > 8192 || local849 > 8192 || local831 < -8192 || local840 < -8192 || local849 < -8192) {
				local831 >>= 0x1;
				local849 >>= 0x1;
				local840 >>= 0x1;
			}
			@Pc(907) int local907 = (int) Math.sqrt((double) (local831 * local831 + local840 * local840 + local849 * local849));
			if (local907 <= 0) {
				local907 = 1;
			}
			local831 = local831 * 256 / local907;
			local840 = local840 * 256 / local907;
			local849 = local849 * 256 / local907;
			@Pc(940) byte local940 = arg1.aByteArray28 == null ? 0 : arg1.aByteArray28[local522];
			if (local940 == 0) {
				@Pc(971) Class110 local971 = local437[local747];
				local971.anInt2378 += local849;
				local971.anInt2377 += local840;
				local971.anInt2382 += local831;
				local971.anInt2381++;
				@Pc(999) Class110 local999 = local437[local752];
				local999.anInt2382 += local831;
				local999.anInt2381++;
				local999.anInt2377 += local840;
				local999.anInt2378 += local849;
				@Pc(1027) Class110 local1027 = local437[local757];
				local1027.anInt2377 += local840;
				local1027.anInt2382 += local831;
				local1027.anInt2378 += local849;
				local1027.anInt2381++;
			} else if (local940 == 1) {
				@Pc(957) Class63 local957 = local739[local522] = new Class63();
				local957.anInt1242 = local840;
				local957.anInt1245 = local849;
				local957.anInt1244 = local831;
			}
		}
		@Pc(1063) int local1063;
		@Pc(1105) short local1105;
		for (local176 = 0; local176 < this.anInt5925; local176++) {
			local1063 = local13[local176];
			@Pc(1070) int local1070 = arg1.aShortArray21[local1063] & 0xFFFF;
			if (arg1.aByteArray30 == null) {
				local768 = -1;
			} else {
				local768 = arg1.aByteArray30[local1063];
			}
			if (arg1.aByteArray29 == null) {
				local779 = 0;
			} else {
				local779 = arg1.aByteArray29[local1063] & 0xFF;
			}
			local1105 = arg1.aShortArray22 == null ? -1 : arg1.aShortArray22[local1063];
			if (local1105 != -1 && (this.anInt5941 & 0x40) != 0) {
				@Pc(1122) Class69 local1122 = local9.method8975(local1105 & 0xFFFF);
				if (local1122.aBoolean110) {
					local1105 = -1;
				}
			}
			@Pc(1129) float local1129 = 0.0F;
			@Pc(1131) float local1131 = 0.0F;
			@Pc(1133) float local1133 = 0.0F;
			@Pc(1135) float local1135 = 0.0F;
			@Pc(1137) float local1137 = 0.0F;
			@Pc(1139) float local1139 = 0.0F;
			@Pc(1141) byte local1141 = 0;
			@Pc(1143) byte local1143 = 0;
			@Pc(1145) int local1145 = 0;
			@Pc(1164) byte local1164;
			@Pc(1181) short local1181;
			@Pc(1186) short local1186;
			@Pc(1191) short local1191;
			if (local1105 != -1) {
				if (local768 == -1) {
					local1141 = 1;
					local1137 = 0.0F;
					local1129 = 0.0F;
					local1143 = 2;
					local1139 = 0.0F;
					local1133 = 1.0F;
					local1135 = 1.0F;
					local1131 = 1.0F;
				} else {
					local768 &= 0xFF;
					local1164 = arg1.aByteArray32[local768];
					@Pc(1171) short local1171;
					@Pc(1176) short local1176;
					@Pc(1214) float local1214;
					@Pc(1223) float local1223;
					@Pc(1232) float local1232;
					@Pc(1317) float local1317;
					@Pc(1325) float local1325;
					@Pc(1334) float local1334;
					@Pc(1342) float local1342;
					@Pc(1350) float local1350;
					@Pc(1358) float local1358;
					if (local1164 == 0) {
						local1171 = arg1.aShortArray25[local1063];
						local1176 = arg1.aShortArray27[local1063];
						local1181 = arg1.aShortArray24[local1063];
						local1186 = arg1.aShortArray29[local768];
						local1191 = arg1.aShortArray30[local768];
						@Pc(1196) short local1196 = arg1.aShortArray26[local768];
						@Pc(1202) float local1202 = (float) arg1.anIntArray93[local1186];
						@Pc(1208) float local1208 = (float) arg1.anIntArray102[local1186];
						local1214 = (float) arg1.anIntArray99[local1186];
						local1223 = (float) arg1.anIntArray93[local1191] - local1202;
						local1232 = (float) arg1.anIntArray102[local1191] - local1208;
						@Pc(1240) float local1240 = (float) arg1.anIntArray99[local1191] - local1214;
						@Pc(1249) float local1249 = (float) arg1.anIntArray93[local1196] - local1202;
						@Pc(1257) float local1257 = (float) arg1.anIntArray102[local1196] - local1208;
						@Pc(1265) float local1265 = (float) arg1.anIntArray99[local1196] - local1214;
						@Pc(1274) float local1274 = (float) arg1.anIntArray93[local1171] - local1202;
						@Pc(1283) float local1283 = (float) arg1.anIntArray102[local1171] - local1208;
						@Pc(1292) float local1292 = (float) arg1.anIntArray99[local1171] - local1214;
						@Pc(1301) float local1301 = (float) arg1.anIntArray93[local1176] - local1202;
						@Pc(1309) float local1309 = (float) arg1.anIntArray102[local1176] - local1208;
						local1317 = (float) arg1.anIntArray99[local1176] - local1214;
						local1325 = (float) arg1.anIntArray93[local1181] - local1202;
						local1334 = (float) arg1.anIntArray102[local1181] - local1208;
						local1342 = (float) arg1.anIntArray99[local1181] - local1214;
						local1350 = local1265 * local1232 - local1240 * local1257;
						local1358 = local1249 * local1240 - local1223 * local1265;
						@Pc(1366) float local1366 = local1257 * local1223 - local1249 * local1232;
						@Pc(1374) float local1374 = local1366 * local1257 - local1358 * local1265;
						@Pc(1383) float local1383 = local1265 * local1350 - local1366 * local1249;
						@Pc(1392) float local1392 = local1358 * local1249 - local1257 * local1350;
						@Pc(1406) float local1406 = 1.0F / (local1240 * local1392 + local1223 * local1374 + local1383 * local1232);
						local1133 = (local1374 * local1301 + local1383 * local1309 + local1317 * local1392) * local1406;
						local1137 = local1406 * (local1392 * local1342 + local1325 * local1374 + local1334 * local1383);
						local1129 = (local1292 * local1392 + local1374 * local1274 + local1283 * local1383) * local1406;
						@Pc(1457) float local1457 = local1223 * local1358 - local1350 * local1232;
						@Pc(1465) float local1465 = local1366 * local1232 - local1240 * local1358;
						@Pc(1474) float local1474 = local1350 * local1240 - local1223 * local1366;
						@Pc(1488) float local1488 = 1.0F / (local1265 * local1457 + local1257 * local1474 + local1465 * local1249);
						local1131 = (local1292 * local1457 + local1274 * local1465 + local1474 * local1283) * local1488;
						local1135 = (local1465 * local1301 + local1309 * local1474 + local1457 * local1317) * local1488;
						local1139 = local1488 * (local1457 * local1342 + local1474 * local1334 + local1325 * local1465);
					} else {
						local1171 = arg1.aShortArray25[local1063];
						local1176 = arg1.aShortArray27[local1063];
						local1181 = arg1.aShortArray24[local1063];
						@Pc(1551) int local1551 = local735.anIntArray245[local768];
						@Pc(1556) int local1556 = local735.anIntArray246[local768];
						@Pc(1561) int local1561 = local735.anIntArray244[local768];
						@Pc(1566) float[] local1566 = local735.aFloatArrayArray5[local768];
						@Pc(1571) byte local1571 = arg1.aByteArray33[local768];
						local1214 = (float) arg1.anIntArray95[local768] / 256.0F;
						if (local1164 == 1) {
							local1223 = (float) arg1.anIntArray97[local768] / 1024.0F;
							Static584.method8113(local1556, arg1.anIntArray102[local1171], local1551, local1561, local1223, local1214, arg1.anIntArray93[local1171], local1571, local1566, Static53.aFloatArray6, arg1.anIntArray99[local1171]);
							local1129 = Static53.aFloatArray6[0];
							local1131 = Static53.aFloatArray6[1];
							Static584.method8113(local1556, arg1.anIntArray102[local1176], local1551, local1561, local1223, local1214, arg1.anIntArray93[local1176], local1571, local1566, Static53.aFloatArray6, arg1.anIntArray99[local1176]);
							local1135 = Static53.aFloatArray6[1];
							local1133 = Static53.aFloatArray6[0];
							Static584.method8113(local1556, arg1.anIntArray102[local1181], local1551, local1561, local1223, local1214, arg1.anIntArray93[local1181], local1571, local1566, Static53.aFloatArray6, arg1.anIntArray99[local1181]);
							local1137 = Static53.aFloatArray6[0];
							local1139 = Static53.aFloatArray6[1];
							local1232 = local1223 / 2.0F;
							if ((local1571 & 0x1) == 0) {
								if (local1232 < local1133 - local1129) {
									local1133 -= local1223;
									local1141 = 1;
								} else if (local1232 < local1129 - local1133) {
									local1141 = 2;
									local1133 += local1223;
								}
								if (local1232 < local1137 - local1129) {
									local1137 -= local1223;
									local1143 = 1;
								} else if (local1129 - local1137 > local1232) {
									local1137 += local1223;
									local1143 = 2;
								}
							} else {
								if (local1139 - local1131 > local1232) {
									local1143 = 1;
									local1139 -= local1223;
								} else if (local1232 < local1131 - local1139) {
									local1143 = 2;
									local1139 += local1223;
								}
								if (local1135 - local1131 > local1232) {
									local1135 -= local1223;
									local1141 = 1;
								} else if (local1131 - local1135 > local1232) {
									local1135 += local1223;
									local1141 = 2;
								}
							}
						} else if (local1164 == 2) {
							local1223 = (float) arg1.anIntArray98[local768] / 256.0F;
							local1232 = (float) arg1.anIntArray96[local768] / 256.0F;
							@Pc(1831) int local1831 = arg1.anIntArray93[local1176] - arg1.anIntArray93[local1171];
							@Pc(1842) int local1842 = arg1.anIntArray102[local1176] - arg1.anIntArray102[local1171];
							@Pc(1853) int local1853 = arg1.anIntArray99[local1176] - arg1.anIntArray99[local1171];
							@Pc(1864) int local1864 = arg1.anIntArray93[local1181] - arg1.anIntArray93[local1171];
							@Pc(1874) int local1874 = arg1.anIntArray102[local1181] - arg1.anIntArray102[local1171];
							@Pc(1885) int local1885 = arg1.anIntArray99[local1181] - arg1.anIntArray99[local1171];
							@Pc(1894) int local1894 = local1885 * local1842 - local1853 * local1874;
							@Pc(1903) int local1903 = local1853 * local1864 - local1831 * local1885;
							@Pc(1912) int local1912 = local1831 * local1874 - local1842 * local1864;
							local1317 = 64.0F / (float) arg1.anIntArray94[local768];
							local1325 = 64.0F / (float) arg1.anIntArray103[local768];
							local1334 = 64.0F / (float) arg1.anIntArray97[local768];
							local1342 = (local1566[2] * (float) local1912 + local1566[0] * (float) local1894 + local1566[1] * (float) local1903) / local1317;
							local1350 = ((float) local1912 * local1566[5] + (float) local1903 * local1566[4] + (float) local1894 * local1566[3]) / local1325;
							local1358 = ((float) local1894 * local1566[6] + local1566[7] * (float) local1903 + local1566[8] * (float) local1912) / local1334;
							local1145 = Static52.method950(local1350, local1358, local1342);
							Static528.method7839(local1566, local1551, local1571, local1561, local1214, Static53.aFloatArray6, local1556, local1145, arg1.anIntArray93[local1171], local1223, arg1.anIntArray99[local1171], arg1.anIntArray102[local1171], local1232);
							local1131 = Static53.aFloatArray6[1];
							local1129 = Static53.aFloatArray6[0];
							Static528.method7839(local1566, local1551, local1571, local1561, local1214, Static53.aFloatArray6, local1556, local1145, arg1.anIntArray93[local1176], local1223, arg1.anIntArray99[local1176], arg1.anIntArray102[local1176], local1232);
							local1135 = Static53.aFloatArray6[1];
							local1133 = Static53.aFloatArray6[0];
							Static528.method7839(local1566, local1551, local1571, local1561, local1214, Static53.aFloatArray6, local1556, local1145, arg1.anIntArray93[local1181], local1223, arg1.anIntArray99[local1181], arg1.anIntArray102[local1181], local1232);
							local1139 = Static53.aFloatArray6[1];
							local1137 = Static53.aFloatArray6[0];
						} else if (local1164 == 3) {
							Static3.method77(local1556, local1561, arg1.anIntArray99[local1171], local1566, arg1.anIntArray93[local1171], local1551, local1571, Static53.aFloatArray6, local1214, arg1.anIntArray102[local1171]);
							local1129 = Static53.aFloatArray6[0];
							local1131 = Static53.aFloatArray6[1];
							Static3.method77(local1556, local1561, arg1.anIntArray99[local1176], local1566, arg1.anIntArray93[local1176], local1551, local1571, Static53.aFloatArray6, local1214, arg1.anIntArray102[local1176]);
							local1135 = Static53.aFloatArray6[1];
							local1133 = Static53.aFloatArray6[0];
							Static3.method77(local1556, local1561, arg1.anIntArray99[local1181], local1566, arg1.anIntArray93[local1181], local1551, local1571, Static53.aFloatArray6, local1214, arg1.anIntArray102[local1181]);
							local1139 = Static53.aFloatArray6[1];
							local1137 = Static53.aFloatArray6[0];
							if ((local1571 & 0x1) == 0) {
								if (local1133 - local1129 > 0.5F) {
									local1133--;
									local1141 = 1;
								} else if (local1129 - local1133 > 0.5F) {
									local1133++;
									local1141 = 2;
								}
								if (local1137 - local1129 > 0.5F) {
									local1143 = 1;
									local1137--;
								} else if (local1129 - local1137 > 0.5F) {
									local1137++;
									local1143 = 2;
								}
							} else {
								if (local1139 - local1131 > 0.5F) {
									local1143 = 1;
									local1139--;
								} else if (local1131 - local1139 > 0.5F) {
									local1139++;
									local1143 = 2;
								}
								if (local1135 - local1131 > 0.5F) {
									local1135--;
									local1141 = 1;
								} else if (local1131 - local1135 > 0.5F) {
									local1141 = 2;
									local1135++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray28 == null) {
				local1164 = 0;
			} else {
				local1164 = arg1.aByteArray28[local1063];
			}
			if (local1164 == 0) {
				@Pc(2514) long local2514 = (long) (local768 << 2) + ((long) local779 + (long) (local1145 << 24) + (long) (local1070 << 8) << 32);
				local1181 = arg1.aShortArray25[local1063];
				local1186 = arg1.aShortArray27[local1063];
				local1191 = arg1.aShortArray24[local1063];
				@Pc(2533) Class110 local2533 = local437[local1181];
				this.aShortArray82[local176] = this.method5326(local1131, arg1, local1181, local176, local1129, local2533.anInt2378, local2533.anInt2382, local2514, local2533.anInt2381, local2533.anInt2377);
				@Pc(2558) Class110 local2558 = local437[local1186];
				this.aShortArray77[local176] = this.method5326(local1135, arg1, local1186, local176, local1133, local2558.anInt2378, local2558.anInt2382, local2514 + (long) local1141, local2558.anInt2381, local2558.anInt2377);
				@Pc(2586) Class110 local2586 = local437[local1191];
				this.aShortArray80[local176] = this.method5326(local1139, arg1, local1191, local176, local1137, local2586.anInt2378, local2586.anInt2382, local2514 + (long) local1143, local2586.anInt2381, local2586.anInt2377);
			} else if (local1164 == 1) {
				@Pc(2369) Class63 local2369 = local739[local1063];
				@Pc(2416) long local2416 = (long) ((local2369.anInt1242 + 256 << 12) + (local2369.anInt1244 <= 0 ? 2048 : 1024) + (local768 << 2) + (local2369.anInt1245 - -256 << 22)) + ((long) (local1070 << 8) + (long) (local1145 << 24) + (long) local779 << 32);
				this.aShortArray82[local176] = this.method5326(local1131, arg1, arg1.aShortArray25[local1063], local176, local1129, local2369.anInt1245, local2369.anInt1244, local2416, 0, local2369.anInt1242);
				this.aShortArray77[local176] = this.method5326(local1135, arg1, arg1.aShortArray27[local1063], local176, local1133, local2369.anInt1245, local2369.anInt1244, local2416 + (long) local1141, 0, local2369.anInt1242);
				this.aShortArray80[local176] = this.method5326(local1139, arg1, arg1.aShortArray24[local1063], local176, local1137, local2369.anInt1245, local2369.anInt1244, local2416 + (long) local1143, 0, local2369.anInt1242);
			}
			if (arg1.aByteArray29 != null) {
				this.aByteArray71[local176] = arg1.aByteArray29[local1063];
			}
			if (arg1.aShortArray23 != null) {
				this.aShortArray85[local176] = arg1.aShortArray23[local1063];
			}
			this.aShortArray86[local176] = arg1.aShortArray21[local1063];
			this.aShortArray87[local176] = local1105;
		}
		if (this.anInt5903 > 0) {
			local1063 = 1;
			local757 = this.aShortArray87[0];
			for (local768 = 0; local768 < this.anInt5903; local768++) {
				@Pc(2677) short local2677 = this.aShortArray87[local768];
				if (local757 != local2677) {
					local1063++;
					local757 = local2677;
				}
			}
			this.anIntArray328 = new int[local1063];
			this.anIntArray327 = new int[local1063];
			this.anIntArray329 = new int[local1063 + 1];
			this.anIntArray329[0] = 0;
			local779 = this.anInt5963;
			local1063 = 0;
			local1105 = 0;
			local757 = this.aShortArray87[0];
			for (local801 = 0; local801 < this.anInt5903; local801++) {
				@Pc(2731) short local2731 = this.aShortArray87[local801];
				if (local2731 != local757) {
					this.anIntArray327[local1063] = local779;
					this.anIntArray328[local1063] = local1105 + 1 - local779;
					local1063++;
					this.anIntArray329[local1063] = local801;
					local1105 = 0;
					local779 = this.anInt5963;
					local757 = local2731;
				}
				@Pc(2767) short local2767 = this.aShortArray82[local801];
				if (local1105 < local2767) {
					local1105 = local2767;
				}
				if (local779 > local2767) {
					local779 = local2767;
				}
				local2767 = this.aShortArray77[local801];
				if (local1105 < local2767) {
					local1105 = local2767;
				}
				if (local2767 < local779) {
					local779 = local2767;
				}
				local2767 = this.aShortArray80[local801];
				if (local2767 > local1105) {
					local1105 = local2767;
				}
				if (local779 > local2767) {
					local779 = local2767;
				}
			}
			this.anIntArray327[local1063] = local779;
			this.anIntArray328[local1063] = local1105 + 1 - local779;
			local1063++;
			this.anIntArray329[local1063] = this.anInt5903;
		}
		Static84.aLongArray7 = null;
		this.aShortArray81 = Static635.method8899(this.anInt5963, this.aShortArray81);
		this.aShortArray84 = Static635.method8899(this.anInt5963, this.aShortArray84);
		this.aShortArray75 = Static635.method8899(this.anInt5963, this.aShortArray75);
		this.aShortArray83 = Static635.method8899(this.anInt5963, this.aShortArray83);
		this.aShortArray76 = Static635.method8899(this.anInt5963, this.aShortArray76);
		this.aByteArray70 = Static37.method651(this.anInt5963, this.aByteArray70);
		this.aFloatArray45 = Static201.method3012(this.anInt5963, this.aFloatArray45);
		this.aFloatArray44 = Static201.method3012(this.anInt5963, this.aFloatArray44);
		if (arg1.anIntArray101 != null && Static304.method4924(arg2, this.anInt5941)) {
			this.anIntArrayArray42 = arg1.method1693(false);
		}
		if (arg1.aClass381Array1 != null && Static148.method2181(arg2, this.anInt5941)) {
			this.anIntArrayArray41 = arg1.method1682();
		}
		if (arg1.anIntArray100 != null && Static395.method6023(arg2, this.anInt5941)) {
			local1063 = 0;
			@Pc(2975) int[] local2975 = new int[256];
			for (local768 = 0; local768 < this.anInt5925; local768++) {
				local779 = arg1.anIntArray100[local13[local768]];
				if (local779 >= 0) {
					@Pc(2994) int local2994 = local2975[local779]++;
					if (local779 > local1063) {
						local1063 = local779;
					}
				}
			}
			this.anIntArrayArray40 = new int[local1063 + 1][];
			for (local779 = 0; local779 <= local1063; local779++) {
				this.anIntArrayArray40[local779] = new int[local2975[local779]];
				local2975[local779] = 0;
			}
			for (local790 = 0; local790 < this.anInt5925; local790++) {
				local801 = arg1.anIntArray100[local13[local790]];
				if (local801 >= 0) {
					this.anIntArrayArray40[local801][local2975[local801]++] = local790;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!he;IIZZ)V")
	public Class129_Sub3(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5903 = 0;
		this.anInt5925 = 0;
		this.anInt5908 = 0;
		this.aBoolean418 = false;
		this.anInt5910 = 0;
		this.aBoolean419 = false;
		this.anInt5963 = 0;
		this.aBoolean421 = false;
		this.aBoolean420 = true;
		this.aBoolean422 = false;
		this.anInt5941 = arg2;
		this.aBoolean418 = arg4;
		this.anInt5917 = arg1;
		this.aClass144_Sub1_13 = arg0;
		if (arg3 || Static512.method9099(this.anInt5917, this.anInt5941)) {
			this.aClass377_2 = new Class377(Static282.method4747(this.anInt5917, this.anInt5941));
		}
		if (arg3 || Static391.method5935(this.anInt5941, this.anInt5917)) {
			this.aClass377_1 = new Class377(Static133.method2018(-40, this.anInt5941, this.anInt5917));
		}
		if (arg3 || Static227.method3836(this.anInt5917, this.anInt5941)) {
			this.aClass377_3 = new Class377(Static190.method2832(-1, this.anInt5917, this.anInt5941));
		}
		if (arg3 || Static317.method5020(this.anInt5941, this.anInt5917)) {
			this.aClass377_4 = new Class377(Static47.method798(this.anInt5941, this.anInt5917));
		}
		if (arg3 || Static43.method710(this.anInt5917, this.anInt5941)) {
			this.aClass367_1 = new Class367(Static48.method806(this.anInt5917, this.anInt5941));
		}
	}

	@OriginalMember(owner = "client!lia", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5910; local3++) {
			this.anIntArray330[local3] = -this.anIntArray330[local3];
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt5963; local27++) {
			this.aShortArray76[local27] = (short) -this.aShortArray76[local27];
		}
		for (@Pc(50) int local50 = 0; local50 < this.anInt5925; local50++) {
			@Pc(61) short local61 = this.aShortArray82[local50];
			this.aShortArray82[local50] = this.aShortArray80[local50];
			this.aShortArray80[local50] = local61;
		}
		this.method5314();
		this.method5311();
		this.method5323();
		this.aBoolean422 = false;
	}

	@OriginalMember(owner = "client!lia", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean422) {
			this.method5321();
		}
		return this.anInt5905;
	}

	@OriginalMember(owner = "client!lia", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class141.anIntArray207[arg0];
		@Pc(13) int local13 = Class141.anIntArray208[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5910; local15++) {
			@Pc(36) int local36 = this.anIntArray331[local15] * local13 - local9 * this.anIntArray330[local15] >> 14;
			this.anIntArray330[local15] = this.anIntArray331[local15] * local9 + this.anIntArray330[local15] * local13 >> 14;
			this.anIntArray331[local15] = local36;
		}
		this.method5314();
		this.aBoolean422 = false;
	}

	@OriginalMember(owner = "client!lia", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean419;
	}

	@OriginalMember(owner = "client!lia", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort64 = (short) arg0;
		this.method5317();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!rd;Lclient!aba;II)V")
	@Override
	public void method5289(@OriginalArg(0) Class263 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5963 == 0) {
			return;
		}
		@Pc(14) Class263_Sub2 local14 = this.aClass144_Sub1_13.aClass263_Sub2_16;
		@Pc(17) Class263_Sub2 local17 = (Class263_Sub2) arg0;
		if (!this.aBoolean422) {
			this.method5321();
		}
		Static501.aFloat177 = local14.aFloat174 + local14.aFloat172 * local17.aFloat176 + local17.aFloat170 * local14.aFloat168 + local17.aFloat174 * local14.aFloat167;
		Static446.aFloat137 = local14.aFloat172 * local17.aFloat169 + local14.aFloat168 * local17.aFloat166 + local17.aFloat168 * local14.aFloat167;
		@Pc(72) float local72 = Static501.aFloat177 + (float) this.anInt5914 * Static446.aFloat137;
		@Pc(80) float local80 = Static501.aFloat177 + Static446.aFloat137 * (float) this.anInt5971;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = (float) this.anInt5968 + local72;
			local97 = local80 - (float) this.anInt5968;
		} else {
			local90 = local80 + (float) this.anInt5968;
			local97 = (float) -this.anInt5968 + local72;
		}
		if (this.aClass144_Sub1_13.aFloat90 <= local97 || local90 <= (float) this.aClass144_Sub1_13.anInt6493) {
			return;
		}
		Static2.aFloat1 = local17.aFloat168 * local14.aFloat175 + local17.aFloat169 * local14.aFloat173 + local14.aFloat169 * local17.aFloat166;
		Static669.aFloat209 = local14.aFloat175 * local17.aFloat174 + local17.aFloat176 * local14.aFloat173 + local17.aFloat170 * local14.aFloat169 + local14.aFloat176;
		@Pc(175) float local175 = (float) this.anInt5914 * Static2.aFloat1 + Static669.aFloat209;
		@Pc(183) float local183 = Static2.aFloat1 * (float) this.anInt5971 + Static669.aFloat209;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local175 > local183) {
			local198 = (float) this.aClass144_Sub1_13.anInt6509 * (local183 - (float) this.anInt5968);
			local209 = (local175 + (float) this.anInt5968) * (float) this.aClass144_Sub1_13.anInt6509;
		} else {
			local198 = (float) this.aClass144_Sub1_13.anInt6509 * (local175 - (float) this.anInt5968);
			local209 = (local183 + (float) this.anInt5968) * (float) this.aClass144_Sub1_13.anInt6509;
		}
		if (this.aClass144_Sub1_13.aFloat97 <= local198 / (float) arg2 || local209 / (float) arg2 <= this.aClass144_Sub1_13.aFloat92) {
			return;
		}
		Static455.aFloat139 = local17.aFloat174 * local14.aFloat165 + local17.aFloat170 * local14.aFloat166 + local14.aFloat171 * local17.aFloat176 + local14.aFloat170;
		Static408.aFloat107 = local14.aFloat166 * local17.aFloat166 + local14.aFloat171 * local17.aFloat169 + local14.aFloat165 * local17.aFloat168;
		@Pc(302) float local302 = Static455.aFloat139 + (float) this.anInt5914 * Static408.aFloat107;
		@Pc(310) float local310 = (float) this.anInt5971 * Static408.aFloat107 + Static455.aFloat139;
		@Pc(337) float local337;
		@Pc(325) float local325;
		if (local310 < local302) {
			local337 = (local310 - (float) this.anInt5968) * (float) this.aClass144_Sub1_13.anInt6516;
			local325 = (float) this.aClass144_Sub1_13.anInt6516 * (local302 + (float) this.anInt5968);
		} else {
			local325 = (local310 + (float) this.anInt5968) * (float) this.aClass144_Sub1_13.anInt6516;
			local337 = (float) this.aClass144_Sub1_13.anInt6516 * ((float) -this.anInt5968 + local302);
		}
		if (this.aClass144_Sub1_13.aFloat101 <= local337 / (float) arg2 || this.aClass144_Sub1_13.aFloat93 >= local325 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass268Array1 != null) {
			Static124.aFloat14 = local17.aFloat173 * local14.aFloat173 + local14.aFloat169 * local17.aFloat171 + local17.aFloat172 * local14.aFloat175;
			Static600.aFloat203 = local17.aFloat172 * local14.aFloat165 + local14.aFloat171 * local17.aFloat173 + local17.aFloat171 * local14.aFloat166;
			Static348.aFloat85 = local17.aFloat167 * local14.aFloat175 + local14.aFloat173 * local17.aFloat175 + local14.aFloat169 * local17.aFloat165;
			Static536.aFloat180 = local14.aFloat167 * local17.aFloat172 + local14.aFloat168 * local17.aFloat171 + local14.aFloat172 * local17.aFloat173;
			Static179.aFloat24 = local14.aFloat171 * local17.aFloat175 + local17.aFloat165 * local14.aFloat166 + local17.aFloat167 * local14.aFloat165;
			Static250.aFloat76 = local17.aFloat167 * local14.aFloat167 + local14.aFloat172 * local17.aFloat175 + local14.aFloat168 * local17.aFloat165;
		}
		if (arg1 != null) {
			@Pc(510) int local510 = this.anInt5905 + this.anInt5901 >> 1;
			@Pc(518) int local518 = this.anInt5969 + this.anInt5911 >> 1;
			@Pc(537) int local537 = (int) (Static348.aFloat85 * (float) local518 + Static2.aFloat1 * (float) this.anInt5914 + Static669.aFloat209 + (float) local510 * Static124.aFloat14);
			@Pc(556) int local556 = (int) (Static179.aFloat24 * (float) local518 + Static600.aFloat203 * (float) local510 + Static455.aFloat139 + (float) this.anInt5914 * Static408.aFloat107);
			@Pc(575) int local575 = (int) (Static250.aFloat76 * (float) local518 + Static501.aFloat177 + Static536.aFloat180 * (float) local510 + Static446.aFloat137 * (float) this.anInt5914);
			@Pc(594) int local594 = (int) (Static2.aFloat1 * (float) this.anInt5971 + Static669.aFloat209 + Static124.aFloat14 * (float) local510 + (float) local518 * Static348.aFloat85);
			@Pc(613) int local613 = (int) (Static408.aFloat107 * (float) this.anInt5971 + Static600.aFloat203 * (float) local510 + Static455.aFloat139 + (float) local518 * Static179.aFloat24);
			arg1.anInt28 = local537 * this.aClass144_Sub1_13.anInt6509 / arg2 + this.aClass144_Sub1_13.anInt6504;
			@Pc(645) int local645 = (int) ((float) local518 * Static250.aFloat76 + (float) this.anInt5971 * Static446.aFloat137 + Static501.aFloat177 + (float) local510 * Static536.aFloat180);
			arg1.anInt29 = this.aClass144_Sub1_13.anInt6516 * local556 / arg2 + this.aClass144_Sub1_13.anInt6492;
			arg1.anInt31 = this.aClass144_Sub1_13.anInt6504 + this.aClass144_Sub1_13.anInt6509 * local594 / arg2;
			arg1.anInt32 = this.aClass144_Sub1_13.anInt6492 + local613 * this.aClass144_Sub1_13.anInt6516 / arg2;
			if (this.aClass144_Sub1_13.anInt6493 <= local575 || this.aClass144_Sub1_13.anInt6493 <= local645) {
				arg1.anInt30 = (this.anInt5968 + local537) * this.aClass144_Sub1_13.anInt6509 / arg2 + this.aClass144_Sub1_13.anInt6504 - arg1.anInt28;
				arg1.aBoolean3 = true;
			}
		}
		this.aClass144_Sub1_13.method5766((float) arg2);
		this.aClass144_Sub1_13.method5657();
		this.aClass144_Sub1_13.method5663(local17);
		this.method5313();
		this.method5312();
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "()V")
	@Override
	protected void method5292() {
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!rd;Lclient!aba;I)V")
	@Override
	public void method5307(@OriginalArg(0) Class263 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5963 == 0) {
			return;
		}
		@Pc(17) Class263_Sub2 local17 = this.aClass144_Sub1_13.aClass263_Sub2_16;
		if (!this.aBoolean422) {
			this.method5321();
		}
		@Pc(28) Class263_Sub2 local28 = (Class263_Sub2) arg0;
		Static501.aFloat177 = local17.aFloat174 + local28.aFloat170 * local17.aFloat168 + local17.aFloat172 * local28.aFloat176 + local28.aFloat174 * local17.aFloat167;
		Static446.aFloat137 = local17.aFloat172 * local28.aFloat169 + local17.aFloat168 * local28.aFloat166 + local28.aFloat168 * local17.aFloat167;
		@Pc(75) float local75 = (float) this.anInt5914 * Static446.aFloat137 + Static501.aFloat177;
		@Pc(83) float local83 = Static446.aFloat137 * (float) this.anInt5971 + Static501.aFloat177;
		@Pc(99) float local99;
		@Pc(93) float local93;
		if (local75 > local83) {
			local93 = local75 + (float) this.anInt5968;
			local99 = (float) -this.anInt5968 + local83;
		} else {
			local93 = (float) this.anInt5968 + local83;
			local99 = local75 - (float) this.anInt5968;
		}
		if (local99 >= this.aClass144_Sub1_13.aFloat98 || (float) this.aClass144_Sub1_13.anInt6493 >= local93) {
			return;
		}
		Static669.aFloat209 = local28.aFloat176 * local17.aFloat173 + local28.aFloat170 * local17.aFloat169 + local28.aFloat174 * local17.aFloat175 + local17.aFloat176;
		Static2.aFloat1 = local17.aFloat175 * local28.aFloat168 + local28.aFloat169 * local17.aFloat173 + local28.aFloat166 * local17.aFloat169;
		@Pc(178) float local178 = Static2.aFloat1 * (float) this.anInt5914 + Static669.aFloat209;
		@Pc(186) float local186 = (float) this.anInt5971 * Static2.aFloat1 + Static669.aFloat209;
		@Pc(202) float local202;
		@Pc(213) float local213;
		if (local186 < local178) {
			local202 = ((float) -this.anInt5968 + local186) * (float) this.aClass144_Sub1_13.anInt6509;
			local213 = (local178 + (float) this.anInt5968) * (float) this.aClass144_Sub1_13.anInt6509;
		} else {
			local202 = ((float) -this.anInt5968 + local178) * (float) this.aClass144_Sub1_13.anInt6509;
			local213 = ((float) this.anInt5968 + local186) * (float) this.aClass144_Sub1_13.anInt6509;
		}
		if (local202 / local93 >= this.aClass144_Sub1_13.aFloat97 || this.aClass144_Sub1_13.aFloat92 >= local213 / local93) {
			return;
		}
		Static408.aFloat107 = local28.aFloat166 * local17.aFloat166 + local17.aFloat171 * local28.aFloat169 + local17.aFloat165 * local28.aFloat168;
		Static455.aFloat139 = local28.aFloat170 * local17.aFloat166 + local28.aFloat176 * local17.aFloat171 + local28.aFloat174 * local17.aFloat165 + local17.aFloat170;
		@Pc(305) float local305 = Static408.aFloat107 * (float) this.anInt5914 + Static455.aFloat139;
		@Pc(313) float local313 = Static455.aFloat139 + (float) this.anInt5971 * Static408.aFloat107;
		@Pc(329) float local329;
		@Pc(340) float local340;
		if (local313 < local305) {
			local329 = (float) this.aClass144_Sub1_13.anInt6516 * (local313 - (float) this.anInt5968);
			local340 = (local305 + (float) this.anInt5968) * (float) this.aClass144_Sub1_13.anInt6516;
		} else {
			local329 = (float) this.aClass144_Sub1_13.anInt6516 * ((float) -this.anInt5968 + local305);
			local340 = (float) this.aClass144_Sub1_13.anInt6516 * ((float) this.anInt5968 + local313);
		}
		if (this.aClass144_Sub1_13.aFloat101 <= local329 / local93 || local340 / local93 <= this.aClass144_Sub1_13.aFloat93) {
			return;
		}
		if (arg1 != null || this.aClass268Array1 != null) {
			Static348.aFloat85 = local17.aFloat173 * local28.aFloat175 + local17.aFloat169 * local28.aFloat165 + local17.aFloat175 * local28.aFloat167;
			Static536.aFloat180 = local17.aFloat167 * local28.aFloat172 + local28.aFloat173 * local17.aFloat172 + local17.aFloat168 * local28.aFloat171;
			Static179.aFloat24 = local28.aFloat167 * local17.aFloat165 + local17.aFloat171 * local28.aFloat175 + local17.aFloat166 * local28.aFloat165;
			Static250.aFloat76 = local28.aFloat167 * local17.aFloat167 + local28.aFloat175 * local17.aFloat172 + local17.aFloat168 * local28.aFloat165;
			Static600.aFloat203 = local28.aFloat173 * local17.aFloat171 + local17.aFloat166 * local28.aFloat171 + local17.aFloat165 * local28.aFloat172;
			Static124.aFloat14 = local17.aFloat175 * local28.aFloat172 + local17.aFloat169 * local28.aFloat171 + local17.aFloat173 * local28.aFloat173;
		}
		if (arg1 != null) {
			@Pc(505) boolean local505 = false;
			@Pc(507) boolean local507 = true;
			@Pc(516) int local516 = this.anInt5901 + this.anInt5905 >> 1;
			@Pc(524) int local524 = this.anInt5969 + this.anInt5911 >> 1;
			@Pc(543) int local543 = (int) (Static348.aFloat85 * (float) local524 + Static124.aFloat14 * (float) local516 + Static669.aFloat209 + Static2.aFloat1 * (float) this.anInt5914);
			@Pc(562) int local562 = (int) (Static455.aFloat139 + (float) local516 * Static600.aFloat203 + (float) this.anInt5914 * Static408.aFloat107 + (float) local524 * Static179.aFloat24);
			@Pc(581) int local581 = (int) ((float) this.anInt5914 * Static446.aFloat137 + Static501.aFloat177 + Static536.aFloat180 * (float) local516 + Static250.aFloat76 * (float) local524);
			if (this.aClass144_Sub1_13.anInt6493 > local581) {
				local505 = true;
			} else {
				arg1.anInt29 = this.aClass144_Sub1_13.anInt6492 + local562 * this.aClass144_Sub1_13.anInt6516 / local581;
				arg1.anInt28 = this.aClass144_Sub1_13.anInt6504 + this.aClass144_Sub1_13.anInt6509 * local543 / local581;
			}
			@Pc(643) int local643 = (int) (Static669.aFloat209 + (float) local516 * Static124.aFloat14 + (float) this.anInt5971 * Static2.aFloat1 + (float) local524 * Static348.aFloat85);
			@Pc(662) int local662 = (int) ((float) local524 * Static179.aFloat24 + Static408.aFloat107 * (float) this.anInt5971 + Static455.aFloat139 + Static600.aFloat203 * (float) local516);
			@Pc(681) int local681 = (int) (Static446.aFloat137 * (float) this.anInt5971 + (float) local516 * Static536.aFloat180 + Static501.aFloat177 + Static250.aFloat76 * (float) local524);
			if (local681 < this.aClass144_Sub1_13.anInt6493) {
				local505 = true;
			} else {
				arg1.anInt31 = this.aClass144_Sub1_13.anInt6509 * local643 / local681 + this.aClass144_Sub1_13.anInt6504;
				arg1.anInt32 = local662 * this.aClass144_Sub1_13.anInt6516 / local681 + this.aClass144_Sub1_13.anInt6492;
			}
			if (local505) {
				if (this.aClass144_Sub1_13.anInt6493 > local581 && this.aClass144_Sub1_13.anInt6493 > local681) {
					local507 = false;
				} else {
					@Pc(769) int local769;
					@Pc(780) int local780;
					@Pc(807) int local807;
					if (local581 < this.aClass144_Sub1_13.anInt6493) {
						local769 = (local681 - this.aClass144_Sub1_13.anInt6493 << 16) / (local681 - local581);
						local780 = local643 + ((local643 - local543) * local769 >> 16);
						arg1.anInt28 = this.aClass144_Sub1_13.anInt6509 * local780 / this.aClass144_Sub1_13.anInt6493 + this.aClass144_Sub1_13.anInt6504;
						local807 = local662 + ((local662 - local562) * local769 >> 16);
						arg1.anInt29 = this.aClass144_Sub1_13.anInt6492 + local807 * this.aClass144_Sub1_13.anInt6516 / this.aClass144_Sub1_13.anInt6493;
					} else if (this.aClass144_Sub1_13.anInt6493 > local681) {
						local769 = (local581 - this.aClass144_Sub1_13.anInt6493 << 16) / (local581 - local681);
						local780 = local543 + (local769 * (local543 - local643) >> 16);
						arg1.anInt28 = this.aClass144_Sub1_13.anInt6504 + local780 * this.aClass144_Sub1_13.anInt6509 / this.aClass144_Sub1_13.anInt6493;
						local807 = local562 + ((local562 - local662) * local769 >> 16);
						arg1.anInt29 = this.aClass144_Sub1_13.anInt6492 + this.aClass144_Sub1_13.anInt6516 * local807 / this.aClass144_Sub1_13.anInt6493;
					}
				}
			}
			if (local507) {
				if (local581 > local681) {
					arg1.anInt30 = this.aClass144_Sub1_13.anInt6504 + (local543 - -this.anInt5968) * this.aClass144_Sub1_13.anInt6509 / local581 - arg1.anInt28;
				} else {
					arg1.anInt30 = this.aClass144_Sub1_13.anInt6504 + (this.anInt5968 + local643) * this.aClass144_Sub1_13.anInt6509 / local681 - arg1.anInt31;
				}
				arg1.aBoolean3 = true;
			}
		}
		this.aClass144_Sub1_13.method5650();
		this.aClass144_Sub1_13.method5663(local28);
		this.method5313();
		this.method5312();
	}

	@OriginalMember(owner = "client!lia", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray42 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt5908; local13++) {
			this.anIntArray325[local13] <<= 0x4;
			this.anIntArray331[local13] <<= 0x4;
			this.anIntArray330[local13] <<= 0x4;
		}
		Static322.anInt5593 = 0;
		Static398.anInt6973 = 0;
		Static188.anInt3178 = 0;
		return true;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5303(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(9) int local9;
		if (arg1 == null) {
			for (local9 = 0; local9 < this.anInt5925; local9++) {
				this.aByteArray71[local9] = arg0;
			}
		} else {
			for (local9 = 0; local9 < this.anInt5925; local9++) {
				@Pc(54) int local54 = 255 - (255 - (arg1[local9] & 0xFF)) * (-(arg0 & 0xFF) + 255) / 255;
				this.aByteArray71[local9] = (byte) local54;
			}
		}
		this.method5317();
	}

	@OriginalMember(owner = "client!lia", name = "h", descriptor = "(I)V")
	private void method5311() {
		if ((this.anInt5941 & 0x37) == 0) {
			if (this.aClass377_3 != null) {
				this.aClass377_3.aBoolean738 = false;
			}
		} else if (this.aClass377_4 != null) {
			this.aClass377_4.aBoolean738 = false;
		}
	}

	@OriginalMember(owner = "client!lia", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass377_2 != null) {
			this.aClass377_2.aBoolean737 = Static282.method4747(arg0, this.anInt5941);
		}
		if (this.aClass377_1 != null) {
			this.aClass377_1.aBoolean737 = Static133.method2018(-44, this.anInt5941, arg0);
		}
		if (this.aClass377_3 != null) {
			this.aClass377_3.aBoolean737 = Static190.method2832(-1, arg0, this.anInt5941);
		}
		if (this.aClass377_4 != null) {
			this.aClass377_4.aBoolean737 = Static47.method798(this.anInt5941, arg0);
		}
		this.anInt5917 = arg0;
		this.aBoolean420 = true;
		if (this.aClass174_1 != null && (this.anInt5917 & 0x10000) == 0) {
			this.aShortArray75 = this.aClass174_1.aShortArray53;
			this.aShortArray83 = this.aClass174_1.aShortArray54;
			this.aShortArray76 = this.aClass174_1.aShortArray52;
			this.aByteArray70 = this.aClass174_1.aByteArray57;
			this.aClass174_1 = null;
		}
		this.method5325();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5925; local3++) {
			local14 = this.aShortArray86[local3] & 0xFFFF;
			@Pc(20) int local20 = local14 >> 10 & 0x3F;
			@Pc(26) int local26 = local14 >> 7 & 0x7;
			if (arg0 != -1) {
				local20 -= -(arg3 * (arg0 - local20) >> 7);
			}
			@Pc(46) int local46 = local14 & 0x7F;
			if (arg1 != -1) {
				local26 += (arg1 - local26) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local46 += (arg2 - local46) * arg3 >> 7;
			}
			this.aShortArray86[local3] = (short) (local26 << 7 | local20 << 10 | local46);
		}
		if (this.aClass268Array1 != null) {
			for (local14 = 0; local14 < this.anInt5909; local14++) {
				@Pc(117) Class268 local117 = this.aClass268Array1[local14];
				@Pc(122) Class392 local122 = this.aClass392Array1[local14];
				local122.anInt10998 = Static302.anIntArray299[this.aShortArray86[local117.anInt7326] & 0xFFFF] & 0xFFFFFF | local122.anInt10998 & 0xFF000000;
			}
		}
		this.method5317();
	}

	@OriginalMember(owner = "client!lia", name = "i", descriptor = "(I)V")
	private void method5312() {
		if (this.aClass268Array1 == null) {
			return;
		}
		this.aClass144_Sub1_13.C(!this.aBoolean419);
		this.aClass144_Sub1_13.method5745(false);
		this.aClass144_Sub1_13.method5740(Static216.aClass138_5, 1);
		this.aClass144_Sub1_13.method5779(1, Static216.aClass138_5);
		for (@Pc(35) int local35 = 0; local35 < this.anInt5909; local35++) {
			@Pc(44) Class268 local44 = this.aClass268Array1[local35];
			@Pc(49) Class392 local49 = this.aClass392Array1[local35];
			if (!local44.aBoolean516 || !this.aClass144_Sub1_13.method6898()) {
				@Pc(79) float local79 = (float) (this.anIntArray325[local44.anInt7329] + this.anIntArray325[local44.anInt7330] + this.anIntArray325[local44.anInt7331]) * 0.3333333F;
				@Pc(100) float local100 = (float) (this.anIntArray331[local44.anInt7330] + this.anIntArray331[local44.anInt7331] + this.anIntArray331[local44.anInt7329]) * 0.3333333F;
				@Pc(121) float local121 = (float) (this.anIntArray330[local44.anInt7329] + this.anIntArray330[local44.anInt7330] + this.anIntArray330[local44.anInt7331]) * 0.3333333F;
				@Pc(135) float local135 = Static669.aFloat209 + Static124.aFloat14 * local79 + Static2.aFloat1 * local100 + local121 * Static348.aFloat85;
				@Pc(149) float local149 = local121 * Static179.aFloat24 + local100 * Static408.aFloat107 + local79 * Static600.aFloat203 + Static455.aFloat139;
				@Pc(163) float local163 = local121 * Static250.aFloat76 + Static446.aFloat137 * local100 + Static536.aFloat180 * local79 + Static501.aFloat177;
				@Pc(184) float local184 = (float) (1.0D / Math.sqrt((double) (local163 * local163 + local135 * local135 + local149 * local149))) * (float) local44.anInt7332;
				@Pc(189) Class263_Sub2 local189 = this.aClass144_Sub1_13.method5729();
				local189.method7290(local44.aShort73 * local49.anInt11005 >> 7, local135 + (float) local49.anInt10997 - local135 * local184, local49.anInt11003, local163 - local184 * local163, local149 + (float) local49.anInt10999 - local184 * local149, local49.anInt11002 * local44.aShort75 >> 7);
				local189.method7279(this.aClass144_Sub1_13.aClass263_Sub2_17);
				this.aClass144_Sub1_13.method5645();
				@Pc(248) int local248 = local49.anInt10998;
				this.aClass144_Sub1_13.method5769(false, local44.aShort74, false);
				this.aClass144_Sub1_13.method5685(local44.aByte95);
				this.aClass144_Sub1_13.method5655(local248);
				this.aClass144_Sub1_13.method5679();
			}
		}
		this.aClass144_Sub1_13.method5779(1, Static225.aClass138_3);
		this.aClass144_Sub1_13.method5740(Static225.aClass138_3, 1);
		this.aClass144_Sub1_13.C(true);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5284(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(62) int local62;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(40) int local40;
		@Pc(54) int[] local54;
		@Pc(56) int local56;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			Static188.anInt3178 = 0;
			local26 = 0;
			Static398.anInt6973 = 0;
			Static322.anInt5593 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (local40 < this.anIntArrayArray42.length) {
					local54 = this.anIntArrayArray42[local40];
					for (local56 = 0; local56 < local54.length; local56++) {
						local62 = local54[local56];
						Static398.anInt6973 += this.anIntArray325[local62];
						Static188.anInt3178 += this.anIntArray331[local62];
						Static322.anInt5593 += this.anIntArray330[local62];
						local26++;
					}
				}
			}
			if (local26 > 0) {
				Static398.anInt6973 = Static398.anInt6973 / local26 + local14;
				Static322.anInt5593 = local22 + Static322.anInt5593 / local26;
				Static188.anInt3178 = local18 + Static188.anInt3178 / local26;
			} else {
				Static398.anInt6973 = local14;
				Static188.anInt3178 = local18;
				Static322.anInt5593 = local22;
			}
			return;
		}
		@Pc(177) int[] local177;
		@Pc(179) int local179;
		if (arg0 == 1) {
			local22 = arg4 << 4;
			local18 = arg3 << 4;
			local14 = arg2 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray42.length) {
					local177 = this.anIntArrayArray42[local32];
					for (local179 = 0; local179 < local177.length; local179++) {
						local56 = local177[local179];
						this.anIntArray325[local56] += local14;
						this.anIntArray331[local56] += local18;
						this.anIntArray330[local56] += local22;
					}
				}
			}
			return;
		}
		@Pc(299) int local299;
		@Pc(318) int local318;
		@Pc(785) int local785;
		@Pc(794) int local794;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray42.length) {
					local177 = this.anIntArrayArray42[local32];
					if ((arg5 & 0x1) == 0) {
						for (local179 = 0; local179 < local177.length; local179++) {
							local56 = local177[local179];
							this.anIntArray325[local56] -= Static398.anInt6973;
							this.anIntArray331[local56] -= Static188.anInt3178;
							this.anIntArray330[local56] -= Static322.anInt5593;
							if (arg4 != 0) {
								local62 = Class141.anIntArray207[arg4];
								local299 = Class141.anIntArray208[arg4];
								local318 = local299 * this.anIntArray325[local56] + this.anIntArray331[local56] * local62 + 16383 >> 14;
								this.anIntArray331[local56] = this.anIntArray331[local56] * local299 + 16383 - local62 * this.anIntArray325[local56] >> 14;
								this.anIntArray325[local56] = local318;
							}
							if (arg2 != 0) {
								local62 = Class141.anIntArray207[arg2];
								local299 = Class141.anIntArray208[arg2];
								local318 = this.anIntArray331[local56] * local299 + 16383 - local62 * this.anIntArray330[local56] >> 14;
								this.anIntArray330[local56] = local62 * this.anIntArray331[local56] + this.anIntArray330[local56] * local299 + 16383 >> 14;
								this.anIntArray331[local56] = local318;
							}
							if (arg3 != 0) {
								local62 = Class141.anIntArray207[arg3];
								local299 = Class141.anIntArray208[arg3];
								local318 = this.anIntArray330[local56] * local62 + local299 * this.anIntArray325[local56] + 16383 >> 14;
								this.anIntArray330[local56] = this.anIntArray330[local56] * local299 + 16383 - this.anIntArray325[local56] * local62 >> 14;
								this.anIntArray325[local56] = local318;
							}
							this.anIntArray325[local56] += Static398.anInt6973;
							this.anIntArray331[local56] += Static188.anInt3178;
							this.anIntArray330[local56] += Static322.anInt5593;
						}
					} else {
						for (local179 = 0; local179 < local177.length; local179++) {
							local56 = local177[local179];
							this.anIntArray325[local56] -= Static398.anInt6973;
							this.anIntArray331[local56] -= Static188.anInt3178;
							this.anIntArray330[local56] -= Static322.anInt5593;
							if (arg2 != 0) {
								local62 = Class141.anIntArray207[arg2];
								local299 = Class141.anIntArray208[arg2];
								local318 = local299 * this.anIntArray331[local56] + 16383 - this.anIntArray330[local56] * local62 >> 14;
								this.anIntArray330[local56] = local62 * this.anIntArray331[local56] + this.anIntArray330[local56] * local299 + 16383 >> 14;
								this.anIntArray331[local56] = local318;
							}
							if (arg4 != 0) {
								local62 = Class141.anIntArray207[arg4];
								local299 = Class141.anIntArray208[arg4];
								local318 = local62 * this.anIntArray331[local56] + this.anIntArray325[local56] * local299 + 16383 >> 14;
								this.anIntArray331[local56] = local299 * this.anIntArray331[local56] + 16383 - this.anIntArray325[local56] * local62 >> 14;
								this.anIntArray325[local56] = local318;
							}
							if (arg3 != 0) {
								local62 = Class141.anIntArray207[arg3];
								local299 = Class141.anIntArray208[arg3];
								local318 = local62 * this.anIntArray330[local56] + this.anIntArray325[local56] * local299 + 16383 >> 14;
								this.anIntArray330[local56] = this.anIntArray330[local56] * local299 + 16383 - this.anIntArray325[local56] * local62 >> 14;
								this.anIntArray325[local56] = local318;
							}
							this.anIntArray325[local56] += Static398.anInt6973;
							this.anIntArray331[local56] += Static188.anInt3178;
							this.anIntArray330[local56] += Static322.anInt5593;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local40 = arg1[local32];
					if (local40 < this.anIntArrayArray42.length) {
						local54 = this.anIntArrayArray42[local40];
						for (local56 = 0; local56 < local54.length; local56++) {
							local62 = local54[local56];
							local299 = this.anIntArray326[local62];
							local318 = this.anIntArray326[local62 + 1];
							for (local785 = local299; local785 < local318; local785++) {
								local794 = this.aShortArray78[local785] - 1;
								if (local794 == -1) {
									break;
								}
								@Pc(806) int local806;
								@Pc(810) int local810;
								@Pc(828) int local828;
								if (arg4 != 0) {
									local806 = Class141.anIntArray207[arg4];
									local810 = Class141.anIntArray208[arg4];
									local828 = local810 * this.aShortArray75[local794] + this.aShortArray83[local794] * local806 + 16383 >> 14;
									this.aShortArray83[local794] = (short) (local810 * this.aShortArray83[local794] + 16383 - this.aShortArray75[local794] * local806 >> 14);
									this.aShortArray75[local794] = (short) local828;
								}
								if (arg2 != 0) {
									local806 = Class141.anIntArray207[arg2];
									local810 = Class141.anIntArray208[arg2];
									local828 = this.aShortArray83[local794] * local810 + 16383 - this.aShortArray76[local794] * local806 >> 14;
									this.aShortArray76[local794] = (short) (local806 * this.aShortArray83[local794] + local810 * this.aShortArray76[local794] + 16383 >> 14);
									this.aShortArray83[local794] = (short) local828;
								}
								if (arg3 != 0) {
									local806 = Class141.anIntArray207[arg3];
									local810 = Class141.anIntArray208[arg3];
									local828 = local806 * this.aShortArray76[local794] + local810 * this.aShortArray75[local794] + 16383 >> 14;
									this.aShortArray76[local794] = (short) (local810 * this.aShortArray76[local794] + 16383 - this.aShortArray75[local794] * local806 >> 14);
									this.aShortArray75[local794] = (short) local828;
								}
							}
						}
					}
				}
				this.method5311();
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray42.length) {
					local177 = this.anIntArrayArray42[local32];
					for (local179 = 0; local179 < local177.length; local179++) {
						local56 = local177[local179];
						this.anIntArray325[local56] -= Static398.anInt6973;
						this.anIntArray331[local56] -= Static188.anInt3178;
						this.anIntArray330[local56] -= Static322.anInt5593;
						this.anIntArray325[local56] = arg2 * this.anIntArray325[local56] >> 7;
						this.anIntArray331[local56] = this.anIntArray331[local56] * arg3 >> 7;
						this.anIntArray330[local56] = arg4 * this.anIntArray330[local56] >> 7;
						this.anIntArray325[local56] += Static398.anInt6973;
						this.anIntArray331[local56] += Static188.anInt3178;
						this.anIntArray330[local56] += Static322.anInt5593;
					}
				}
			}
		} else {
			@Pc(1254) Class392 local1254;
			@Pc(1144) boolean local1144;
			@Pc(1249) Class268 local1249;
			if (arg0 == 5) {
				if (this.anIntArrayArray40 != null) {
					local1144 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray40.length > local40) {
							local54 = this.anIntArrayArray40[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								local299 = arg2 * 8 + (this.aByteArray71[local62] & 0xFF);
								if (local299 < 0) {
									local299 = 0;
								} else if (local299 > 255) {
									local299 = 255;
								}
								this.aByteArray71[local62] = (byte) local299;
							}
							local1144 |= local54.length > 0;
						}
					}
					if (local1144) {
						if (this.aClass268Array1 != null) {
							for (local40 = 0; local40 < this.anInt5909; local40++) {
								local1249 = this.aClass268Array1[local40];
								local1254 = this.aClass392Array1[local40];
								local1254.anInt10998 = local1254.anInt10998 & 0xFFFFFF | 255 - (this.aByteArray71[local1249.anInt7326] & 0xFF) << 24;
							}
						}
						this.method5317();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray40 != null) {
					local1144 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray40.length) {
							local54 = this.anIntArrayArray40[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								local299 = this.aShortArray86[local62] & 0xFFFF;
								local318 = local299 >> 10 & 0x3F;
								local785 = local299 >> 7 & 0x7;
								local794 = local299 & 0x7F;
								local785 += arg3 / 4;
								@Pc(1365) int local1365 = arg2 + local318 & 0x3F;
								if (local785 < 0) {
									local785 = 0;
								} else if (local785 > 7) {
									local785 = 7;
								}
								local794 += arg4;
								if (local794 < 0) {
									local794 = 0;
								} else if (local794 > 127) {
									local794 = 127;
								}
								this.aShortArray86[local62] = (short) (local785 << 7 | local1365 << 10 | local794);
							}
							local1144 |= local54.length > 0;
						}
					}
					if (local1144) {
						if (this.aClass268Array1 != null) {
							for (local40 = 0; local40 < this.anInt5909; local40++) {
								local1249 = this.aClass268Array1[local40];
								local1254 = this.aClass392Array1[local40];
								local1254.anInt10998 = Static302.anIntArray299[this.aShortArray86[local1249.anInt7326] & 0xFFFF] & 0xFFFFFF | local1254.anInt10998 & 0xFF000000;
							}
						}
						this.method5317();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray41 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray41.length > local32) {
							local177 = this.anIntArrayArray41[local32];
							for (local179 = 0; local179 < local177.length; local179++) {
								local1254 = this.aClass392Array1[local177[local179]];
								local1254.anInt10997 += arg2;
								local1254.anInt10999 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray41 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray41.length > local32) {
							local177 = this.anIntArrayArray41[local32];
							for (local179 = 0; local179 < local177.length; local179++) {
								local1254 = this.aClass392Array1[local177[local179]];
								local1254.anInt11005 = arg3 * local1254.anInt11005 >> 7;
								local1254.anInt11002 = local1254.anInt11002 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray41 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray41.length > local32) {
						local177 = this.anIntArrayArray41[local32];
						for (local179 = 0; local179 < local177.length; local179++) {
							local1254 = this.aClass392Array1[local177[local179]];
							local1254.anInt11003 = arg2 + local1254.anInt11003 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "(I)V")
	private void method5313() {
		if (this.anInt5903 == 0) {
			return;
		}
		if (this.method5322() && this.method5320()) {
			this.aClass144_Sub1_13.method5696(0, this.aClass377_2.anInterface7_17);
			this.aClass144_Sub1_13.method5696(1, this.aClass377_3.anInterface7_17);
			this.aClass144_Sub1_13.method5696(2, this.aClass377_1.anInterface7_17);
			@Pc(53) boolean local53;
			if ((this.anInt5941 & 0x37) == 0) {
				local53 = false;
				this.aClass144_Sub1_13.method5745(false);
				this.aClass144_Sub1_13.method5707(this.aClass144_Sub1_13.aClass119_18);
			} else {
				this.aClass144_Sub1_13.method5745(true);
				local53 = true;
				this.aClass144_Sub1_13.method5696(3, this.aClass377_4.anInterface7_17);
				this.aClass144_Sub1_13.method5707(this.aClass144_Sub1_13.aClass119_23);
			}
			for (@Pc(91) int local91 = 0; local91 < this.anIntArray327.length; local91++) {
				@Pc(98) int local98 = this.anIntArray329[local91];
				@Pc(105) int local105 = this.anIntArray329[local91 + 1];
				@Pc(112) int local112 = this.aShortArray87[local98] & 0xFFFF;
				if (local112 == 65535) {
					local112 = -1;
				}
				this.aClass144_Sub1_13.method5769(true, local112, local53);
				this.aClass144_Sub1_13.method5746(local105 - local98, this.anIntArray327[local91], this.aClass367_1.anInterface8_8, this.anIntArray328[local91], Static469.aClass213_46, local98 * 3);
			}
		}
		this.method5325();
	}

	@OriginalMember(owner = "client!lia", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(43) int local43;
		@Pc(53) int[] local53;
		@Pc(55) int local55;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static322.anInt5593 = 0;
			local29 = 0;
			Static188.anInt3178 = 0;
			Static398.anInt6973 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray42.length) {
					local53 = this.anIntArrayArray42[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						if (this.aShortArray79 == null || (this.aShortArray79[local61] & arg6) != 0) {
							Static398.anInt6973 += this.anIntArray325[local61];
							Static188.anInt3178 += this.anIntArray331[local61];
							local29++;
							Static322.anInt5593 += this.anIntArray330[local61];
						}
					}
				}
			}
			if (local29 <= 0) {
				Static322.anInt5593 = arg4;
				Static398.anInt6973 = arg2;
				Static188.anInt3178 = arg3;
			} else {
				Static398.anInt6973 = Static398.anInt6973 / local29 + arg2;
				Static425.aBoolean508 = true;
				Static188.anInt3178 = arg3 + Static188.anInt3178 / local29;
				Static322.anInt5593 = Static322.anInt5593 / local29 + arg4;
			}
			return;
		}
		@Pc(270) int[] local270;
		@Pc(272) int local272;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg2 * arg7[0] + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
				local43 = arg2 * arg7[6] + arg7[7] * arg3 + arg4 * arg7[8] + 8192 >> 14;
				arg3 = local35;
				arg2 = local29;
				arg4 = local43;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray42.length > local35) {
					local270 = this.anIntArrayArray42[local35];
					for (local272 = 0; local272 < local270.length; local272++) {
						local55 = local270[local272];
						if (this.aShortArray79 == null || (arg6 & this.aShortArray79[local55]) != 0) {
							this.anIntArray325[local55] += arg2;
							this.anIntArray331[local55] += arg3;
							this.anIntArray330[local55] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(404) int local404;
		@Pc(426) int local426;
		@Pc(457) int local457;
		@Pc(484) int local484;
		@Pc(488) int local488;
		@Pc(492) int local492;
		@Pc(496) int local496;
		@Pc(504) int local504;
		@Pc(512) int local512;
		@Pc(666) int local666;
		@Pc(691) int local691;
		@Pc(695) int local695;
		@Pc(704) int local704;
		@Pc(709) int local709;
		@Pc(713) int local713;
		@Pc(717) int local717;
		@Pc(719) int local719;
		@Pc(853) int[] local853;
		@Pc(855) int local855;
		@Pc(861) int local861;
		@Pc(865) int local865;
		@Pc(867) int local867;
		@Pc(1003) int local1003;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray42.length > local35) {
						local270 = this.anIntArrayArray42[local35];
						for (local272 = 0; local272 < local270.length; local272++) {
							local55 = local270[local272];
							if (this.aShortArray79 == null || (this.aShortArray79[local55] & arg6) != 0) {
								this.anIntArray325[local55] -= Static398.anInt6973;
								this.anIntArray331[local55] -= Static188.anInt3178;
								this.anIntArray330[local55] -= Static322.anInt5593;
								if (arg4 != 0) {
									local61 = Class141.anIntArray207[arg4];
									local404 = Class141.anIntArray208[arg4];
									local426 = this.anIntArray325[local55] * local404 + this.anIntArray331[local55] * local61 + 16383 >> 14;
									this.anIntArray331[local55] = local404 * this.anIntArray331[local55] + 16383 - this.anIntArray325[local55] * local61 >> 14;
									this.anIntArray325[local55] = local426;
								}
								if (arg2 != 0) {
									local61 = Class141.anIntArray207[arg2];
									local404 = Class141.anIntArray208[arg2];
									local426 = this.anIntArray331[local55] * local404 + 16383 - local61 * this.anIntArray330[local55] >> 14;
									this.anIntArray330[local55] = local404 * this.anIntArray330[local55] + local61 * this.anIntArray331[local55] + 16383 >> 14;
									this.anIntArray331[local55] = local426;
								}
								if (arg3 != 0) {
									local61 = Class141.anIntArray207[arg3];
									local404 = Class141.anIntArray208[arg3];
									local426 = this.anIntArray325[local55] * local404 + local61 * this.anIntArray330[local55] + 16383 >> 14;
									this.anIntArray330[local55] = this.anIntArray330[local55] * local404 + 16383 - local61 * this.anIntArray325[local55] >> 14;
									this.anIntArray325[local55] = local426;
								}
								this.anIntArray325[local55] += Static398.anInt6973;
								this.anIntArray331[local55] += Static188.anInt3178;
								this.anIntArray330[local55] += Static322.anInt5593;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray42.length > local43) {
							local53 = this.anIntArrayArray42[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray79 == null || (arg6 & this.aShortArray79[local61]) != 0) {
									local404 = this.anIntArray326[local61];
									local426 = this.anIntArray326[local61 + 1];
									for (local457 = local404; local457 < local426; local457++) {
										local484 = this.aShortArray78[local457] - 1;
										if (local484 == -1) {
											break;
										}
										if (arg4 != 0) {
											local488 = Class141.anIntArray207[arg4];
											local492 = Class141.anIntArray208[arg4];
											local496 = this.aShortArray83[local484] * local488 + local492 * this.aShortArray75[local484] + 16383 >> 14;
											this.aShortArray83[local484] = (short) (this.aShortArray83[local484] * local492 + 16383 - this.aShortArray75[local484] * local488 >> 14);
											this.aShortArray75[local484] = (short) local496;
										}
										if (arg2 != 0) {
											local488 = Class141.anIntArray207[arg2];
											local492 = Class141.anIntArray208[arg2];
											local496 = this.aShortArray83[local484] * local492 + 16383 - this.aShortArray76[local484] * local488 >> 14;
											this.aShortArray76[local484] = (short) (this.aShortArray83[local484] * local488 + local492 * this.aShortArray76[local484] + 16383 >> 14);
											this.aShortArray83[local484] = (short) local496;
										}
										if (arg3 != 0) {
											local488 = Class141.anIntArray207[arg3];
											local492 = Class141.anIntArray208[arg3];
											local496 = local488 * this.aShortArray76[local484] + this.aShortArray75[local484] * local492 + 16383 >> 14;
											this.aShortArray76[local484] = (short) (local492 * this.aShortArray76[local484] + 16383 - local488 * this.aShortArray75[local484] >> 14);
											this.aShortArray75[local484] = (short) local496;
										}
									}
								}
							}
						}
					}
					this.method5311();
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local43 = arg7[11] << 4;
				local272 = arg7[12] << 4;
				local55 = arg7[13] << 4;
				local61 = arg7[14] << 4;
				if (Static425.aBoolean508) {
					local404 = arg7[0] * Static398.anInt6973 + arg7[3] * Static188.anInt3178 + Static322.anInt5593 * arg7[6] + 8192 >> 14;
					local426 = Static188.anInt3178 * arg7[4] + Static398.anInt6973 * arg7[1] + arg7[7] * Static322.anInt5593 + 8192 >> 14;
					local426 += local55;
					local404 += local272;
					local457 = Static398.anInt6973 * arg7[2] + arg7[5] * Static188.anInt3178 + Static322.anInt5593 * arg7[8] + 8192 >> 14;
					local457 += local61;
					Static398.anInt6973 = local404;
					Static188.anInt3178 = local426;
					Static322.anInt5593 = local457;
					Static425.aBoolean508 = false;
				}
				@Pc(472) int[] local472 = new int[9];
				local426 = Class141.anIntArray208[arg2];
				local457 = Class141.anIntArray207[arg2];
				local484 = Class141.anIntArray208[arg3];
				local488 = Class141.anIntArray207[arg3];
				local492 = Class141.anIntArray208[arg4];
				local496 = Class141.anIntArray207[arg4];
				local504 = local492 * local457 + 8192 >> 14;
				local512 = local496 * local457 + 8192 >> 14;
				local472[1] = local504 * local488 + local496 * -local484 + 8192 >> 14;
				local472[3] = local426 * local496 + 8192 >> 14;
				local472[6] = -local488 * local492 + local484 * local512 + 8192 >> 14;
				local472[5] = -local457;
				local472[4] = local492 * local426 + 8192 >> 14;
				local472[0] = local488 * local512 + local484 * local492 + 8192 >> 14;
				local472[8] = local426 * local484 + 8192 >> 14;
				local472[7] = local504 * local484 + local496 * local488 + 8192 >> 14;
				local472[2] = local488 * local426 + 8192 >> 14;
				@Pc(641) int local641 = local472[2] * -Static322.anInt5593 + local472[1] * -Static188.anInt3178 + -Static398.anInt6973 * local472[0] + 8192 >> 14;
				local666 = -Static322.anInt5593 * local472[5] + local472[3] * -Static398.anInt6973 + local472[4] * -Static188.anInt3178 + 8192 >> 14;
				local691 = local472[8] * -Static322.anInt5593 + local472[7] * -Static188.anInt3178 + local472[6] * -Static398.anInt6973 + 8192 >> 14;
				local695 = Static398.anInt6973 + local641;
				@Pc(699) int local699 = local666 + Static188.anInt3178;
				local704 = local691 + Static322.anInt5593;
				@Pc(707) int[] local707 = new int[9];
				for (local709 = 0; local709 < 3; local709++) {
					for (local713 = 0; local713 < 3; local713++) {
						local717 = 0;
						for (local719 = 0; local719 < 3; local719++) {
							local717 += arg7[local713 * 3 + local719] * local472[local719 + local709 * 3];
						}
						local707[local713 + local709 * 3] = local717 + 8192 >> 14;
					}
				}
				local713 = local472[2] * local61 + local472[1] * local55 + local472[0] * local272 + 8192 >> 14;
				local717 = local472[3] * local272 + local55 * local472[4] + local61 * local472[5] + 8192 >> 14;
				local717 += local699;
				local713 += local695;
				local719 = local61 * local472[8] + local472[7] * local55 + local272 * local472[6] + 8192 >> 14;
				local719 += local704;
				local853 = new int[9];
				for (local855 = 0; local855 < 3; local855++) {
					for (local861 = 0; local861 < 3; local861++) {
						local865 = 0;
						for (local867 = 0; local867 < 3; local867++) {
							local865 += arg7[local867 + local855 * 3] * local707[local867 * 3 + local861];
						}
						local853[local861 + local855 * 3] = local865 + 8192 >> 14;
					}
				}
				local861 = local717 * arg7[1] + arg7[0] * local713 + arg7[2] * local719 + 8192 >> 14;
				local865 = arg7[5] * local719 + local717 * arg7[4] + arg7[3] * local713 + 8192 >> 14;
				local867 = local713 * arg7[6] + arg7[7] * local717 + arg7[8] * local719 + 8192 >> 14;
				local861 += local29;
				local865 += local35;
				local867 += local43;
				for (local1003 = 0; local1003 < local8; local1003++) {
					@Pc(1011) int local1011 = arg1[local1003];
					if (local1011 < this.anIntArrayArray42.length) {
						@Pc(1021) int[] local1021 = this.anIntArrayArray42[local1011];
						for (@Pc(1023) int local1023 = 0; local1023 < local1021.length; local1023++) {
							@Pc(1029) int local1029 = local1021[local1023];
							if (this.aShortArray79 == null || (this.aShortArray79[local1029] & arg6) != 0) {
								@Pc(1075) int local1075 = local853[1] * this.anIntArray331[local1029] + local853[0] * this.anIntArray325[local1029] + this.anIntArray330[local1029] * local853[2] + 8192 >> 14;
								@Pc(1107) int local1107 = this.anIntArray325[local1029] * local853[3] + this.anIntArray331[local1029] * local853[4] + this.anIntArray330[local1029] * local853[5] + 8192 >> 14;
								@Pc(1111) int local1111 = local1075 + local861;
								@Pc(1115) int local1115 = local1107 + local865;
								@Pc(1147) int local1147 = local853[6] * this.anIntArray325[local1029] + this.anIntArray331[local1029] * local853[7] + this.anIntArray330[local1029] * local853[8] + 8192 >> 14;
								@Pc(1151) int local1151 = local1147 + local867;
								this.anIntArray325[local1029] = local1111;
								this.anIntArray331[local1029] = local1115;
								this.anIntArray330[local1029] = local1151;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2672) Class392 local2672;
			@Pc(2544) boolean local2544;
			@Pc(2667) Class268 local2667;
			if (arg0 == 5) {
				if (this.anIntArrayArray40 != null) {
					local2544 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray40.length > local43) {
							local53 = this.anIntArrayArray40[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray85 == null || (arg6 & this.aShortArray85[local61]) != 0) {
									local404 = arg2 * 8 + (this.aByteArray71[local61] & 0xFF);
									if (local404 < 0) {
										local404 = 0;
									} else if (local404 > 255) {
										local404 = 255;
									}
									this.aByteArray71[local61] = (byte) local404;
								}
							}
							local2544 |= local53.length > 0;
						}
					}
					if (local2544) {
						if (this.aClass268Array1 != null) {
							for (local43 = 0; local43 < this.anInt5909; local43++) {
								local2667 = this.aClass268Array1[local43];
								local2672 = this.aClass392Array1[local43];
								local2672.anInt10998 = local2672.anInt10998 & 0xFFFFFF | 255 - (this.aByteArray71[local2667.anInt7326] & 0xFF) << 24;
							}
						}
						this.method5317();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray40 != null) {
					local2544 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (local43 < this.anIntArrayArray40.length) {
							local53 = this.anIntArrayArray40[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray85 == null || (this.aShortArray85[local61] & arg6) != 0) {
									local404 = this.aShortArray86[local61] & 0xFFFF;
									local426 = local404 >> 10 & 0x3F;
									local457 = local404 >> 7 & 0x7;
									local484 = local404 & 0x7F;
									local457 += arg3 / 4;
									@Pc(2800) int local2800 = arg2 + local426 & 0x3F;
									if (local457 < 0) {
										local457 = 0;
									} else if (local457 > 7) {
										local457 = 7;
									}
									local484 += arg4;
									if (local484 < 0) {
										local484 = 0;
									} else if (local484 > 127) {
										local484 = 127;
									}
									this.aShortArray86[local61] = (short) (local457 << 7 | local2800 << 10 | local484);
								}
							}
							local2544 |= local53.length > 0;
						}
					}
					if (local2544) {
						if (this.aClass268Array1 != null) {
							for (local43 = 0; local43 < this.anInt5909; local43++) {
								local2667 = this.aClass268Array1[local43];
								local2672 = this.aClass392Array1[local43];
								local2672.anInt10998 = Static302.anIntArray299[this.aShortArray86[local2667.anInt7326] & 0xFFFF] & 0xFFFFFF | local2672.anInt10998 & 0xFF000000;
							}
						}
						this.method5317();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray41 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray41.length) {
							local270 = this.anIntArrayArray41[local35];
							for (local272 = 0; local272 < local270.length; local272++) {
								local2672 = this.aClass392Array1[local270[local272]];
								local2672.anInt10999 += arg3;
								local2672.anInt10997 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray41 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray41.length) {
							local270 = this.anIntArrayArray41[local35];
							for (local272 = 0; local272 < local270.length; local272++) {
								local2672 = this.aClass392Array1[local270[local272]];
								local2672.anInt11002 = local2672.anInt11002 * arg2 >> 7;
								local2672.anInt11005 = local2672.anInt11005 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray41 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray41.length > local35) {
						local270 = this.anIntArrayArray41[local35];
						for (local272 = 0; local272 < local270.length; local272++) {
							local2672 = this.aClass392Array1[local270[local272]];
							local2672.anInt11003 = local2672.anInt11003 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray42.length > local35) {
					local270 = this.anIntArrayArray42[local35];
					for (local272 = 0; local272 < local270.length; local272++) {
						local55 = local270[local272];
						if (this.aShortArray79 == null || (arg6 & this.aShortArray79[local55]) != 0) {
							this.anIntArray325[local55] -= Static398.anInt6973;
							this.anIntArray331[local55] -= Static188.anInt3178;
							this.anIntArray330[local55] -= Static322.anInt5593;
							this.anIntArray325[local55] = arg2 * this.anIntArray325[local55] >> 7;
							this.anIntArray331[local55] = arg3 * this.anIntArray331[local55] >> 7;
							this.anIntArray330[local55] = arg4 * this.anIntArray330[local55] >> 7;
							this.anIntArray325[local55] += Static398.anInt6973;
							this.anIntArray331[local55] += Static188.anInt3178;
							this.anIntArray330[local55] += Static322.anInt5593;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local43 = arg7[11] << 4;
			local272 = arg7[12] << 4;
			local55 = arg7[13] << 4;
			local61 = arg7[14] << 4;
			if (Static425.aBoolean508) {
				local404 = Static322.anInt5593 * arg7[6] + arg7[3] * Static188.anInt3178 + Static398.anInt6973 * arg7[0] + 8192 >> 14;
				local426 = arg7[1] * Static398.anInt6973 + arg7[4] * Static188.anInt3178 + arg7[7] * Static322.anInt5593 + 8192 >> 14;
				local457 = Static322.anInt5593 * arg7[8] + Static398.anInt6973 * arg7[2] + arg7[5] * Static188.anInt3178 + 8192 >> 14;
				local404 += local272;
				local426 += local55;
				local457 += local61;
				Static398.anInt6973 = local404;
				Static188.anInt3178 = local426;
				Static425.aBoolean508 = false;
				Static322.anInt5593 = local457;
			}
			local404 = arg2 << 15 >> 7;
			local426 = arg3 << 15 >> 7;
			local457 = arg4 << 15 >> 7;
			local484 = -Static398.anInt6973 * local404 + 8192 >> 14;
			local488 = local426 * -Static188.anInt3178 + 8192 >> 14;
			local492 = local457 * -Static322.anInt5593 + 8192 >> 14;
			local496 = local484 + Static398.anInt6973;
			local504 = local488 + Static188.anInt3178;
			local512 = local492 + Static322.anInt5593;
			@Pc(1923) int[] local1923 = new int[] { arg7[0] * local404 + 8192 >> 14, arg7[3] * local404 + 8192 >> 14, arg7[6] * local404 + 8192 >> 14, local426 * arg7[1] + 8192 >> 14, local426 * arg7[4] + 8192 >> 14, arg7[7] * local426 + 8192 >> 14, local457 * arg7[2] + 8192 >> 14, arg7[5] * local457 + 8192 >> 14, local457 * arg7[8] + 8192 >> 14 };
			local666 = local404 * local272 + 8192 >> 14;
			local691 = local55 * local426 + 8192 >> 14;
			@Pc(2051) int local2051 = local691 + local504;
			@Pc(2055) int local2055 = local666 + local496;
			local695 = local61 * local457 + 8192 >> 14;
			@Pc(2067) int local2067 = local695 + local512;
			@Pc(2070) int[] local2070 = new int[9];
			@Pc(2076) int local2076;
			for (local704 = 0; local704 < 3; local704++) {
				for (local2076 = 0; local2076 < 3; local2076++) {
					local709 = 0;
					for (local713 = 0; local713 < 3; local713++) {
						local709 += local1923[local2076 + local713 * 3] * arg7[local704 * 3 + local713];
					}
					local2070[local2076 + local704 * 3] = local709 + 8192 >> 14;
				}
			}
			local2076 = arg7[2] * local2067 + local2051 * arg7[1] + local2055 * arg7[0] + 8192 >> 14;
			local709 = local2051 * arg7[4] + local2055 * arg7[3] + local2067 * arg7[5] + 8192 >> 14;
			local2076 += local29;
			local709 += local35;
			local713 = arg7[6] * local2055 + arg7[7] * local2051 + arg7[8] * local2067 + 8192 >> 14;
			local713 += local43;
			for (local717 = 0; local717 < local8; local717++) {
				local719 = arg1[local717];
				if (local719 < this.anIntArrayArray42.length) {
					local853 = this.anIntArrayArray42[local719];
					for (local855 = 0; local855 < local853.length; local855++) {
						local861 = local853[local855];
						if (this.aShortArray79 == null || (this.aShortArray79[local861] & arg6) != 0) {
							local865 = local2070[0] * this.anIntArray325[local861] + local2070[1] * this.anIntArray331[local861] + this.anIntArray330[local861] * local2070[2] + 8192 >> 14;
							local867 = local2070[3] * this.anIntArray325[local861] + this.anIntArray331[local861] * local2070[4] + this.anIntArray330[local861] * local2070[5] + 8192 >> 14;
							local1003 = this.anIntArray331[local861] * local2070[7] + local2070[6] * this.anIntArray325[local861] + local2070[8] * this.anIntArray330[local861] + 8192 >> 14;
							@Pc(2356) int local2356 = local867 + local709;
							@Pc(2360) int local2360 = local865 + local2076;
							@Pc(2364) int local2364 = local1003 + local713;
							this.anIntArray325[local861] = local2360;
							this.anIntArray331[local861] = local2356;
							this.anIntArray330[local861] = local2364;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILclient!rd;ZI)Z")
	@Override
	public boolean method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5318(arg3, arg4, arg0, -1, arg2, arg1);
	}

	@OriginalMember(owner = "client!lia", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort64;
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)V")
	private void method5314() {
		if (this.aClass377_2 != null) {
			this.aClass377_2.aBoolean738 = false;
		}
	}

	@OriginalMember(owner = "client!lia", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5910; local3++) {
			if (arg0 != 0) {
				this.anIntArray325[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray331[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray330[local3] += arg2;
			}
		}
		this.method5314();
		this.aBoolean422 = false;
	}

	@OriginalMember(owner = "client!lia", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass144_Sub1_13.anInterface4_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5925; local11++) {
			if (arg0 == this.aShortArray87[local11]) {
				this.aShortArray87[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(53) Class69 local53 = local9.method8975(arg0 & 0xFFFF);
			local41 = local53.aByte20;
			local39 = local53.aByte22;
		}
		@Pc(61) byte local61 = 0;
		@Pc(63) byte local63 = 0;
		if (arg1 != -1) {
			@Pc(74) Class69 local74 = local9.method8975(arg1 & 0xFFFF);
			local63 = local74.aByte20;
			if (local74.aByte23 != 0 || local74.aByte24 != 0) {
				this.aBoolean421 = true;
			}
			local61 = local74.aByte22;
		}
		if (!(local39 != local61 | local41 != local63)) {
			return;
		}
		if (this.aClass268Array1 != null) {
			for (@Pc(116) int local116 = 0; local116 < this.anInt5909; local116++) {
				@Pc(123) Class268 local123 = this.aClass268Array1[local116];
				@Pc(128) Class392 local128 = this.aClass392Array1[local116];
				local128.anInt10998 = local128.anInt10998 & 0xFF000000 | Static302.anIntArray299[this.aShortArray86[local123.anInt7326] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5317();
	}

	@OriginalMember(owner = "client!lia", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean422) {
			this.method5321();
		}
		return this.anInt5914;
	}

	@OriginalMember(owner = "client!lia", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class14_Sub2_Sub5 ba(@OriginalArg(0) Class14_Sub2_Sub5 arg0) {
		if (this.anInt5963 == 0) {
			return null;
		}
		if (!this.aBoolean422) {
			this.method5321();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass144_Sub1_13.anInt6515 <= 0) {
			local43 = this.anInt5901 - (this.anInt5914 * this.aClass144_Sub1_13.anInt6515 >> 8) >> this.aClass144_Sub1_13.anInt6523;
			local59 = this.anInt5905 - (this.anInt5971 * this.aClass144_Sub1_13.anInt6515 >> 8) >> this.aClass144_Sub1_13.anInt6523;
		} else {
			local43 = this.anInt5901 - (this.anInt5971 * this.aClass144_Sub1_13.anInt6515 >> 8) >> this.aClass144_Sub1_13.anInt6523;
			local59 = this.anInt5905 - (this.aClass144_Sub1_13.anInt6515 * this.anInt5914 >> 8) >> this.aClass144_Sub1_13.anInt6523;
		}
		@Pc(119) int local119;
		@Pc(136) int local136;
		if (this.aClass144_Sub1_13.anInt6529 > 0) {
			local119 = this.anInt5911 - (this.aClass144_Sub1_13.anInt6529 * this.anInt5971 >> 8) >> this.aClass144_Sub1_13.anInt6523;
			local136 = this.anInt5969 - (this.anInt5914 * this.aClass144_Sub1_13.anInt6529 >> 8) >> this.aClass144_Sub1_13.anInt6523;
		} else {
			local119 = this.anInt5911 - (this.aClass144_Sub1_13.anInt6529 * this.anInt5914 >> 8) >> this.aClass144_Sub1_13.anInt6523;
			local136 = this.anInt5969 - (this.aClass144_Sub1_13.anInt6529 * this.anInt5971 >> 8) >> this.aClass144_Sub1_13.anInt6523;
		}
		@Pc(178) int local178 = local59 + 1 - local43;
		@Pc(185) int local185 = local136 + 1 - local119;
		@Pc(188) Class14_Sub2_Sub5_Sub1 local188 = (Class14_Sub2_Sub5_Sub1) arg0;
		@Pc(206) Class14_Sub2_Sub5_Sub1 local206;
		if (local188 != null && local188.method1271(local185, local178)) {
			local206 = local188;
			local188.method1270();
		} else {
			local206 = new Class14_Sub2_Sub5_Sub1(this.aClass144_Sub1_13, local178, local185);
		}
		local206.method1269(local136, local43, local59, local119);
		this.method5328(local206);
		return local206;
	}

	@OriginalMember(owner = "client!lia", name = "f", descriptor = "(I)V")
	public void method5315() {
		if (this.aClass377_2 != null) {
			this.aClass377_2.method9076();
		}
		if (this.aClass377_1 != null) {
			this.aClass377_1.method9076();
		}
		if (this.aClass377_3 != null) {
			this.aClass377_3.method9076();
		}
		if (this.aClass377_4 != null) {
			this.aClass377_4.method9076();
		}
		if (this.aClass367_1 != null) {
			this.aClass367_1.method8724();
		}
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(Z)V")
	private void method5317() {
		if (this.aClass377_3 != null) {
			this.aClass377_3.aBoolean738 = false;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZIIILclient!rd;II)Z")
	private boolean method5318(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class263 arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class263_Sub2 local8 = (Class263_Sub2) arg4;
		@Pc(12) Class263_Sub2 local12 = this.aClass144_Sub1_13.aClass263_Sub2_16;
		@Pc(33) float local33 = local12.aFloat176 + local12.aFloat173 * local8.aFloat176 + local12.aFloat169 * local8.aFloat170 + local8.aFloat174 * local12.aFloat175;
		@Pc(54) float local54 = local12.aFloat165 * local8.aFloat174 + local8.aFloat176 * local12.aFloat171 + local8.aFloat170 * local12.aFloat166 + local12.aFloat170;
		Static600.aFloat203 = local8.aFloat173 * local12.aFloat171 + local8.aFloat171 * local12.aFloat166 + local8.aFloat172 * local12.aFloat165;
		Static348.aFloat85 = local8.aFloat175 * local12.aFloat173 + local12.aFloat169 * local8.aFloat165 + local8.aFloat167 * local12.aFloat175;
		Static446.aFloat137 = local12.aFloat167 * local8.aFloat168 + local8.aFloat166 * local12.aFloat168 + local8.aFloat169 * local12.aFloat172;
		@Pc(129) float local129 = local12.aFloat174 + local8.aFloat174 * local12.aFloat167 + local12.aFloat168 * local8.aFloat170 + local12.aFloat172 * local8.aFloat176;
		Static179.aFloat24 = local8.aFloat167 * local12.aFloat165 + local8.aFloat175 * local12.aFloat171 + local8.aFloat165 * local12.aFloat166;
		Static124.aFloat14 = local8.aFloat171 * local12.aFloat169 + local8.aFloat173 * local12.aFloat173 + local8.aFloat172 * local12.aFloat175;
		Static2.aFloat1 = local8.aFloat169 * local12.aFloat173 + local8.aFloat166 * local12.aFloat169 + local8.aFloat168 * local12.aFloat175;
		Static250.aFloat76 = local8.aFloat175 * local12.aFloat172 + local8.aFloat165 * local12.aFloat168 + local12.aFloat167 * local8.aFloat167;
		Static536.aFloat180 = local12.aFloat167 * local8.aFloat172 + local12.aFloat172 * local8.aFloat173 + local12.aFloat168 * local8.aFloat171;
		Static408.aFloat107 = local12.aFloat171 * local8.aFloat169 + local12.aFloat166 * local8.aFloat166 + local12.aFloat165 * local8.aFloat168;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass144_Sub1_13.anInt6509;
		@Pc(255) int local255 = this.aClass144_Sub1_13.anInt6516;
		if (!this.aBoolean422) {
			this.method5321();
		}
		@Pc(272) int local272 = this.anInt5905 - this.anInt5901 >> 1;
		@Pc(281) int local281 = this.anInt5971 - this.anInt5914 >> 1;
		@Pc(290) int local290 = this.anInt5969 - this.anInt5911 >> 1;
		@Pc(295) int local295 = this.anInt5901 + local272;
		@Pc(300) int local300 = this.anInt5914 + local281;
		@Pc(305) int local305 = local290 + this.anInt5911;
		@Pc(312) int local312 = local295 - (local272 << arg1);
		@Pc(318) int local318 = local300 - (local281 << arg1);
		@Pc(325) int local325 = local305 - (local290 << arg1);
		@Pc(331) int local331 = local295 + (local272 << arg1);
		@Pc(337) int local337 = (local281 << arg1) + local300;
		@Pc(343) int local343 = (local290 << arg1) + local305;
		Static60.anIntArray63[0] = local312;
		Static265.anIntArray250[0] = local318;
		Static60.anIntArray63[1] = local331;
		Static38.anIntArray33[0] = local325;
		Static265.anIntArray250[1] = local318;
		Static60.anIntArray63[2] = local312;
		Static38.anIntArray33[1] = local325;
		Static265.anIntArray250[2] = local337;
		Static60.anIntArray63[3] = local331;
		Static38.anIntArray33[2] = local325;
		Static265.anIntArray250[3] = local337;
		Static60.anIntArray63[4] = local312;
		Static38.anIntArray33[3] = local325;
		Static265.anIntArray250[4] = local318;
		Static38.anIntArray33[4] = local343;
		Static60.anIntArray63[5] = local331;
		Static265.anIntArray250[5] = local318;
		Static38.anIntArray33[5] = local343;
		Static60.anIntArray63[6] = local312;
		Static265.anIntArray250[6] = local337;
		Static60.anIntArray63[7] = local331;
		Static38.anIntArray33[6] = local343;
		Static265.anIntArray250[7] = local337;
		Static38.anIntArray33[7] = local343;
		@Pc(488) float local488;
		@Pc(474) float local474;
		@Pc(502) float local502;
		@Pc(460) float local460;
		@Pc(455) float local455;
		@Pc(450) float local450;
		for (@Pc(441) int local441 = 0; local441 < 8; local441++) {
			local450 = (float) Static38.anIntArray33[local441];
			local455 = (float) Static265.anIntArray250[local441];
			local460 = (float) Static60.anIntArray63[local441];
			local474 = local54 + Static408.aFloat107 * local455 + local460 * Static600.aFloat203 + local450 * Static179.aFloat24;
			local488 = local33 + local450 * Static348.aFloat85 + local460 * Static124.aFloat14 + local455 * Static2.aFloat1;
			local502 = local129 + Static250.aFloat76 * local450 + local455 * Static446.aFloat137 + Static536.aFloat180 * local460;
			if ((float) this.aClass144_Sub1_13.anInt6493 <= local502) {
				if (arg3 > 0) {
					local502 = (float) arg3;
				}
				@Pc(528) float local528 = (float) local251 * local488 / local502 + (float) this.aClass144_Sub1_13.anInt6504;
				if (local528 > local243) {
					local243 = local528;
				}
				if (local528 < local241) {
					local241 = local528;
				}
				@Pc(552) float local552 = (float) this.aClass144_Sub1_13.anInt6492 + (float) local255 * local474 / local502;
				if (local552 < local245) {
					local245 = local552;
				}
				if (local552 > local247) {
					local247 = local552;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg2 && local243 > (float) arg2 && (float) arg5 > local245 && local247 > (float) arg5) {
			if (arg0) {
				return true;
			}
			if (Static244.anIntArray233.length < this.anInt5963) {
				Static244.anIntArray233 = new int[this.anInt5963];
				Static129.anIntArray133 = new int[this.anInt5963];
			}
			@Pc(706) int local706;
			for (@Pc(630) int local630 = 0; local630 < this.anInt5910; local630++) {
				local455 = (float) this.anIntArray331[local630];
				local460 = (float) this.anIntArray325[local630];
				local450 = (float) this.anIntArray330[local630];
				local502 = Static250.aFloat76 * local450 + local455 * Static446.aFloat137 + local460 * Static536.aFloat180 + local129;
				local488 = Static348.aFloat85 * local450 + Static124.aFloat14 * local460 + local455 * Static2.aFloat1 + local33;
				local474 = local54 + local450 * Static179.aFloat24 + Static600.aFloat203 * local460 + local455 * Static408.aFloat107;
				@Pc(713) int local713;
				@Pc(715) int local715;
				@Pc(724) int local724;
				if (local502 >= (float) this.aClass144_Sub1_13.anInt6493) {
					if (arg3 > 0) {
						local502 = (float) arg3;
					}
					local706 = (int) ((float) this.aClass144_Sub1_13.anInt6504 + local488 * (float) local251 / local502);
					local713 = (int) (local474 * (float) local255 / local502 + (float) this.aClass144_Sub1_13.anInt6492);
					local715 = this.anIntArray326[local630];
					local724 = this.anIntArray326[local630 + 1];
					for (@Pc(801) int local801 = local715; local801 < local724; local801++) {
						@Pc(810) int local810 = this.aShortArray78[local801] - 1;
						if (local810 == -1) {
							break;
						}
						Static244.anIntArray233[local810] = local706;
						Static129.anIntArray133[local810] = local713;
					}
				} else {
					local706 = this.anIntArray326[local630];
					local713 = this.anIntArray326[local630 + 1];
					for (local715 = local706; local715 < local713; local715++) {
						local724 = this.aShortArray78[local715] - 1;
						if (local724 == -1) {
							break;
						}
						Static244.anIntArray233[this.aShortArray78[local715] - 1] = -999999;
					}
				}
			}
			for (local706 = 0; local706 < this.anInt5925; local706++) {
				if (Static244.anIntArray233[this.aShortArray82[local706]] != -999999 && Static244.anIntArray233[this.aShortArray77[local706]] != -999999 && Static244.anIntArray233[this.aShortArray80[local706]] != -999999 && this.method5324(Static244.anIntArray233[this.aShortArray80[local706]], arg5, Static129.anIntArray133[this.aShortArray77[local706]], Static129.anIntArray133[this.aShortArray82[local706]], arg2, Static129.anIntArray133[this.aShortArray80[local706]], Static244.anIntArray233[this.aShortArray77[local706]], Static244.anIntArray233[this.aShortArray82[local706]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lia", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean422) {
			this.method5321();
		}
		return this.anInt5901;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method5294(@OriginalArg(0) Class263 arg0) {
		@Pc(8) Class263_Sub2 local8 = (Class263_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass352Array5 != null) {
			for (local13 = 0; local13 < this.aClass352Array5.length; local13++) {
				@Pc(20) Class352 local20 = this.aClass352Array5[local13];
				@Pc(22) Class352 local22 = local20;
				if (local20.aClass352_2 != null) {
					local22 = local20.aClass352_2;
				}
				local22.anInt9774 = (int) (local8.aFloat169 * (float) this.anIntArray331[local20.anInt9767] + (float) this.anIntArray325[local20.anInt9767] * local8.aFloat173 + (float) this.anIntArray330[local20.anInt9767] * local8.aFloat175 + local8.aFloat176);
				local22.anInt9769 = (int) (local8.aFloat170 + local8.aFloat171 * (float) this.anIntArray325[local20.anInt9767] + local8.aFloat166 * (float) this.anIntArray331[local20.anInt9767] + local8.aFloat165 * (float) this.anIntArray330[local20.anInt9767]);
				local22.anInt9776 = (int) (local8.aFloat174 + local8.aFloat172 * (float) this.anIntArray325[local20.anInt9767] + (float) this.anIntArray331[local20.anInt9767] * local8.aFloat168 + local8.aFloat167 * (float) this.anIntArray330[local20.anInt9767]);
				local22.anInt9780 = (int) (local8.aFloat176 + local8.aFloat175 * (float) this.anIntArray330[local20.anInt9765] + local8.aFloat173 * (float) this.anIntArray325[local20.anInt9765] + (float) this.anIntArray331[local20.anInt9765] * local8.aFloat169);
				local22.anInt9778 = (int) (local8.aFloat165 * (float) this.anIntArray330[local20.anInt9765] + local8.aFloat166 * (float) this.anIntArray331[local20.anInt9765] + local8.aFloat171 * (float) this.anIntArray325[local20.anInt9765] + local8.aFloat170);
				local22.anInt9775 = (int) (local8.aFloat174 + local8.aFloat167 * (float) this.anIntArray330[local20.anInt9765] + local8.aFloat172 * (float) this.anIntArray325[local20.anInt9765] + local8.aFloat168 * (float) this.anIntArray331[local20.anInt9765]);
				local22.anInt9766 = (int) ((float) this.anIntArray330[local20.anInt9772] * local8.aFloat175 + local8.aFloat169 * (float) this.anIntArray331[local20.anInt9772] + (float) this.anIntArray325[local20.anInt9772] * local8.aFloat173 + local8.aFloat176);
				local22.anInt9768 = (int) ((float) this.anIntArray331[local20.anInt9772] * local8.aFloat166 + (float) this.anIntArray325[local20.anInt9772] * local8.aFloat171 + (float) this.anIntArray330[local20.anInt9772] * local8.aFloat165 + local8.aFloat170);
				local22.anInt9777 = (int) (local8.aFloat174 + local8.aFloat172 * (float) this.anIntArray325[local20.anInt9772] + local8.aFloat168 * (float) this.anIntArray331[local20.anInt9772] + local8.aFloat167 * (float) this.anIntArray330[local20.anInt9772]);
			}
		}
		if (this.aClass172Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass172Array5.length; local13++) {
			@Pc(367) Class172 local367 = this.aClass172Array5[local13];
			@Pc(369) Class172 local369 = local367;
			if (local367.aClass172_2 != null) {
				local369 = local367.aClass172_2;
			}
			if (local367.aClass263_3 == null) {
				local367.aClass263_3 = local8.method8434();
			} else {
				local367.aClass263_3.method8437(local8);
			}
			local369.anInt4763 = (int) (local8.aFloat176 + local8.aFloat175 * (float) this.anIntArray330[local367.anInt4761] + local8.aFloat173 * (float) this.anIntArray325[local367.anInt4761] + local8.aFloat169 * (float) this.anIntArray331[local367.anInt4761]);
			local369.anInt4756 = (int) (local8.aFloat170 + local8.aFloat171 * (float) this.anIntArray325[local367.anInt4761] + local8.aFloat166 * (float) this.anIntArray331[local367.anInt4761] + local8.aFloat165 * (float) this.anIntArray330[local367.anInt4761]);
			local369.anInt4758 = (int) (local8.aFloat174 + (float) this.anIntArray331[local367.anInt4761] * local8.aFloat168 + local8.aFloat172 * (float) this.anIntArray325[local367.anInt4761] + local8.aFloat167 * (float) this.anIntArray330[local367.anInt4761]);
		}
	}

	@OriginalMember(owner = "client!lia", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt5917;
	}

	@OriginalMember(owner = "client!lia", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean421;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILclient!rd;ZII)Z")
	@Override
	public boolean method5302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5318(arg3, arg4, arg0, arg5, arg2, arg1);
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "()[Lclient!tm;")
	@Override
	public Class352[] method5304() {
		return this.aClass352Array5;
	}

	@OriginalMember(owner = "client!lia", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class141.anIntArray207[arg0];
		@Pc(13) int local13 = Class141.anIntArray208[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5910; local15++) {
			local34 = local9 * this.anIntArray330[local15] + this.anIntArray325[local15] * local13 >> 14;
			this.anIntArray330[local15] = this.anIntArray330[local15] * local13 - local9 * this.anIntArray325[local15] >> 14;
			this.anIntArray325[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt5963; local34++) {
			@Pc(88) int local88 = this.aShortArray76[local34] * local9 + this.aShortArray75[local34] * local13 >> 14;
			this.aShortArray76[local34] = (short) (this.aShortArray76[local34] * local13 - this.aShortArray75[local34] * local9 >> 14);
			this.aShortArray75[local34] = (short) local88;
		}
		this.method5314();
		this.method5311();
		this.aBoolean422 = false;
	}

	@OriginalMember(owner = "client!lia", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort65;
	}

	@OriginalMember(owner = "client!lia", name = "g", descriptor = "()V")
	@Override
	protected void method5309() {
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5299(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class129_Sub3 local8 = (Class129_Sub3) arg0;
		if (this.anInt5925 == 0 || local8.anInt5925 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt5910;
		@Pc(27) int[] local27 = local8.anIntArray325;
		@Pc(30) int[] local30 = local8.anIntArray331;
		@Pc(33) int[] local33 = local8.anIntArray330;
		@Pc(36) short[] local36 = local8.aShortArray75;
		@Pc(39) short[] local39 = local8.aShortArray83;
		@Pc(42) short[] local42 = local8.aShortArray76;
		@Pc(45) byte[] local45 = local8.aByteArray70;
		@Pc(54) short[] local54;
		@Pc(52) short[] local52;
		@Pc(50) short[] local50;
		@Pc(56) byte[] local56;
		if (this.aClass174_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local56 = this.aClass174_1.aByteArray57;
			local50 = this.aClass174_1.aShortArray52;
			local54 = this.aClass174_1.aShortArray53;
			local52 = this.aClass174_1.aShortArray54;
		}
		@Pc(85) short[] local85;
		@Pc(81) short[] local81;
		@Pc(89) short[] local89;
		@Pc(93) byte[] local93;
		if (local8.aClass174_1 == null) {
			local93 = null;
			local81 = null;
			local89 = null;
			local85 = null;
		} else {
			local81 = local8.aClass174_1.aShortArray54;
			local85 = local8.aClass174_1.aShortArray53;
			local89 = local8.aClass174_1.aShortArray52;
			local93 = local8.aClass174_1.aByteArray57;
		}
		@Pc(106) int[] local106 = local8.anIntArray326;
		@Pc(109) short[] local109 = local8.aShortArray78;
		if (!local8.aBoolean422) {
			local8.method5321();
		}
		@Pc(120) int local120 = local8.anInt5914;
		@Pc(123) int local123 = local8.anInt5971;
		@Pc(126) int local126 = local8.anInt5901;
		@Pc(129) int local129 = local8.anInt5905;
		@Pc(132) int local132 = local8.anInt5911;
		@Pc(135) int local135 = local8.anInt5969;
		for (@Pc(137) int local137 = 0; local137 < this.anInt5910; local137++) {
			@Pc(146) int local146 = this.anIntArray331[local137] - arg2;
			if (local120 <= local146 && local146 <= local123) {
				@Pc(169) int local169 = this.anIntArray325[local137] - arg1;
				if (local169 >= local126 && local129 >= local169) {
					@Pc(192) int local192 = this.anIntArray330[local137] - arg3;
					if (local192 >= local132 && local192 <= local135) {
						@Pc(214) int local214 = -1;
						@Pc(219) int local219 = this.anIntArray326[local137];
						@Pc(226) int local226 = this.anIntArray326[local137 + 1];
						for (@Pc(228) int local228 = local219; local228 < local226; local228++) {
							local214 = this.aShortArray78[local228] - 1;
							if (local214 == -1 || this.aByteArray70[local214] != 0) {
								break;
							}
						}
						if (local214 != -1) {
							for (@Pc(267) int local267 = 0; local267 < local24; local267++) {
								if (local169 == local27[local267] && local33[local267] == local192 && local146 == local30[local267]) {
									local219 = local106[local267];
									local226 = local106[local267 + 1];
									@Pc(310) int local310 = -1;
									for (@Pc(312) int local312 = local219; local312 < local226; local312++) {
										local310 = local109[local312] - 1;
										if (local310 == -1 || local45[local310] != 0) {
											break;
										}
									}
									if (local310 != -1) {
										if (local54 == null) {
											this.aClass174_1 = new Class174();
											local54 = this.aClass174_1.aShortArray53 = Static258.method4327(this.aShortArray75);
											local52 = this.aClass174_1.aShortArray54 = Static258.method4327(this.aShortArray83);
											local50 = this.aClass174_1.aShortArray52 = Static258.method4327(this.aShortArray76);
											local56 = this.aClass174_1.aByteArray57 = Static156.method2242(this.aByteArray70);
										}
										if (local85 == null) {
											@Pc(402) Class174 local402 = local8.aClass174_1 = new Class174();
											local85 = local402.aShortArray53 = Static258.method4327(local36);
											local81 = local402.aShortArray54 = Static258.method4327(local39);
											local89 = local402.aShortArray52 = Static258.method4327(local42);
											local93 = local402.aByteArray57 = Static156.method2242(local45);
										}
										@Pc(435) short local435 = this.aShortArray75[local214];
										@Pc(440) short local440 = this.aShortArray83[local214];
										@Pc(445) short local445 = this.aShortArray76[local214];
										local226 = local106[local267 + 1];
										@Pc(456) byte local456 = this.aByteArray70[local214];
										local219 = local106[local267];
										@Pc(470) int local470;
										for (@Pc(462) int local462 = local219; local462 < local226; local462++) {
											local470 = local109[local462] - 1;
											if (local470 == -1) {
												break;
											}
											if (local93[local470] != 0) {
												local85[local470] += local435;
												local81[local470] += local440;
												local89[local470] += local445;
												local93[local470] += local456;
											}
										}
										local440 = local39[local310];
										local226 = this.anIntArray326[local137 + 1];
										local435 = local36[local310];
										local456 = local45[local310];
										local219 = this.anIntArray326[local137];
										local445 = local42[local310];
										for (local470 = local219; local470 < local226; local470++) {
											@Pc(560) int local560 = this.aShortArray78[local470] - 1;
											if (local560 == -1) {
												break;
											}
											if (local56[local560] != 0) {
												local54[local560] += local435;
												local52[local560] += local440;
												local50[local560] += local445;
												local56[local560] += local456;
											}
										}
										local8.method5311();
										this.method5311();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "g", descriptor = "(I)Z")
	private boolean method5320() {
		if (this.aClass367_1.aBoolean711) {
			return true;
		}
		if (this.aClass367_1.anInterface8_7 == null) {
			this.aClass367_1.anInterface8_7 = this.aClass144_Sub1_13.method5736(this.aBoolean418);
		}
		@Pc(31) Interface8 local31 = this.aClass367_1.anInterface8_7;
		local31.method5084(this.anInt5903 * 6);
		@Pc(51) Buffer local51 = local31.method5085();
		if (local51 != null) {
			@Pc(59) Stream local59 = this.aClass144_Sub1_13.method5747(local51);
			@Pc(63) int local63;
			if (Stream.c()) {
				for (local63 = 0; local63 < this.anInt5903; local63++) {
					local59.a(this.aShortArray82[local63]);
					local59.a(this.aShortArray77[local63]);
					local59.a(this.aShortArray80[local63]);
				}
			} else {
				for (local63 = 0; local63 < this.anInt5903; local63++) {
					local59.d(this.aShortArray82[local63]);
					local59.d(this.aShortArray77[local63]);
					local59.d(this.aShortArray80[local63]);
				}
			}
			local59.b();
			if (local31.method5081()) {
				this.aBoolean420 = true;
				this.aClass367_1.anInterface8_8 = local31;
				this.aClass367_1.aBoolean711 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Z)V")
	private void method5321() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5910; local23++) {
			@Pc(40) int local40 = this.anIntArray325[local23];
			@Pc(45) int local45 = this.anIntArray331[local23];
			if (local45 > local15) {
				local15 = local45;
			}
			if (local9 > local45) {
				local9 = local45;
			}
			if (local40 < local7) {
				local7 = local40;
			}
			@Pc(73) int local73 = this.anIntArray330[local23];
			if (local40 > local13) {
				local13 = local40;
			}
			if (local17 < local73) {
				local17 = local73;
			}
			if (local11 > local73) {
				local11 = local73;
			}
			@Pc(96) int local96 = local73 * local73 + local40 * local40;
			if (local96 > local19) {
				local19 = local96;
			}
			local96 = local45 * local45 + local73 * local73 + local40 * local40;
			if (local96 > local21) {
				local21 = local96;
			}
		}
		this.anInt5901 = local7;
		this.anInt5905 = local13;
		this.anInt5971 = local15;
		this.anInt5914 = local9;
		this.anInt5969 = local17;
		this.anInt5911 = local11;
		this.anInt5968 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt5922 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean422 = true;
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(Z)Z")
	private boolean method5322() {
		@Pc(14) boolean local14 = !this.aClass377_3.aBoolean738;
		@Pc(33) boolean local33 = (this.anInt5941 & 0x37) != 0 && !this.aClass377_4.aBoolean738;
		@Pc(42) boolean local42 = !this.aClass377_2.aBoolean738;
		@Pc(51) boolean local51 = !this.aClass377_1.aBoolean738;
		if (!local42 && !local14 && !local33 && !local51) {
			return true;
		}
		@Pc(70) boolean local70 = true;
		@Pc(99) Interface7 local99;
		@Pc(113) Buffer local113;
		if (local42) {
			if (this.aShortArray81 == null) {
				return true;
			}
			if (this.aClass377_2.anInterface7_18 == null) {
				this.aClass377_2.anInterface7_18 = this.aClass144_Sub1_13.method5780(this.aBoolean418);
			}
			local99 = this.aClass377_2.anInterface7_18;
			local99.method5841(12, this.anInt5963 * 12);
			local113 = local99.method5840();
			if (local113 == null) {
				local70 = false;
			} else {
				this.aClass144_Sub1_13.aNativeInterface3.copyPositions(this.anIntArray325, this.anIntArray331, this.anIntArray330, this.aShortArray81, 0, 12, this.anInt5963, local113.getAddress());
				if (local99.method5843()) {
					this.aClass377_2.aBoolean738 = true;
					this.aClass377_2.anInterface7_17 = local99;
				} else {
					local70 = false;
				}
			}
		}
		@Pc(242) short[] local242;
		@Pc(239) short[] local239;
		@Pc(248) short[] local248;
		@Pc(245) byte[] local245;
		if (local14) {
			if (this.aClass377_3.anInterface7_18 == null) {
				this.aClass377_3.anInterface7_18 = this.aClass144_Sub1_13.method5780(this.aBoolean418);
			}
			local99 = this.aClass377_3.anInterface7_18;
			local99.method5841(4, this.anInt5963 * 4);
			local113 = local99.method5840();
			if (local113 == null) {
				local70 = false;
			} else {
				if ((this.anInt5941 & 0x37) == 0) {
					if (this.aClass174_1 == null) {
						local239 = this.aShortArray83;
						local242 = this.aShortArray75;
						local245 = this.aByteArray70;
						local248 = this.aShortArray76;
					} else {
						local242 = this.aClass174_1.aShortArray53;
						local239 = this.aClass174_1.aShortArray54;
						local248 = this.aClass174_1.aShortArray52;
						local245 = this.aClass174_1.aByteArray57;
					}
					this.aClass144_Sub1_13.aNativeInterface3.copyLighting(this.aShortArray86, this.aByteArray71, this.aShortArray87, local242, local239, local248, local245, this.aShort64, this.aShort65, this.aShortArray84, 0, 4, this.anInt5963, local113.getAddress());
				} else {
					this.aClass144_Sub1_13.aNativeInterface3.copyColours(this.aShortArray86, this.aByteArray71, this.aShortArray87, this.aShort64, this.aShortArray84, 0, 4, this.anInt5963, local113.getAddress());
				}
				if (local99.method5843()) {
					this.aClass377_3.aBoolean738 = true;
					this.aClass377_3.anInterface7_17 = local99;
				} else {
					local70 = false;
				}
			}
		}
		if (local33) {
			if (this.aClass377_4.anInterface7_18 == null) {
				this.aClass377_4.anInterface7_18 = this.aClass144_Sub1_13.method5780(this.aBoolean418);
			}
			local99 = this.aClass377_4.anInterface7_18;
			local99.method5841(12, this.anInt5963 * 12);
			local113 = local99.method5840();
			if (local113 == null) {
				local70 = false;
			} else {
				if (this.aClass174_1 == null) {
					local248 = this.aShortArray76;
					local242 = this.aShortArray75;
					local239 = this.aShortArray83;
					local245 = this.aByteArray70;
				} else {
					local242 = this.aClass174_1.aShortArray53;
					local248 = this.aClass174_1.aShortArray52;
					local245 = this.aClass174_1.aByteArray57;
					local239 = this.aClass174_1.aShortArray54;
				}
				this.aClass144_Sub1_13.aNativeInterface3.copyNormals(local242, local239, local248, local245, 3.0F / (float) this.aShort65, 3.0F / (float) (this.aShort65 + this.aShort65 / 2), 0, 12, this.anInt5963, local113.getAddress());
				if (local99.method5843()) {
					this.aClass377_4.anInterface7_17 = local99;
					this.aClass377_4.aBoolean738 = true;
				} else {
					local70 = false;
				}
			}
		}
		if (local51) {
			if (this.aClass377_1.anInterface7_18 == null) {
				this.aClass377_1.anInterface7_18 = this.aClass144_Sub1_13.method5780(this.aBoolean418);
			}
			local99 = this.aClass377_1.anInterface7_18;
			local99.method5841(8, this.anInt5963 * 8);
			local113 = local99.method5840();
			if (local113 == null) {
				local70 = false;
			} else {
				this.aClass144_Sub1_13.aNativeInterface3.copyTexCoords(this.aFloatArray45, this.aFloatArray44, 0, 8, this.anInt5963, local113.getAddress());
				if (local99.method5843()) {
					this.aClass377_1.anInterface7_17 = local99;
					this.aClass377_1.aBoolean738 = true;
				} else {
					local70 = false;
				}
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!lia", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static398.anInt6973 = 0;
			Static322.anInt5593 = 0;
			local13 = 0;
			Static188.anInt3178 = 0;
			for (local17 = 0; local17 < this.anInt5910; local17++) {
				Static398.anInt6973 += this.anIntArray325[local17];
				Static188.anInt3178 += this.anIntArray331[local17];
				Static322.anInt5593 += this.anIntArray330[local17];
				local13++;
			}
			if (local13 <= 0) {
				Static322.anInt5593 = arg3;
				Static188.anInt3178 = arg2;
				Static398.anInt6973 = arg1;
			} else {
				Static322.anInt5593 = Static322.anInt5593 / local13 + arg3;
				Static398.anInt6973 = Static398.anInt6973 / local13 + arg1;
				Static188.anInt3178 = Static188.anInt3178 / local13 + arg2;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt5910; local13++) {
				this.anIntArray325[local13] += arg1;
				this.anIntArray331[local13] += arg2;
				this.anIntArray330[local13] += arg3;
			}
		} else {
			@Pc(175) int local175;
			@Pc(193) int local193;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt5910; local13++) {
					this.anIntArray325[local13] -= Static398.anInt6973;
					this.anIntArray331[local13] -= Static188.anInt3178;
					this.anIntArray330[local13] -= Static322.anInt5593;
					if (arg3 != 0) {
						local17 = Class141.anIntArray207[arg3];
						local175 = Class141.anIntArray208[arg3];
						local193 = local17 * this.anIntArray331[local13] + this.anIntArray325[local13] * local175 + 16383 >> 14;
						this.anIntArray331[local13] = this.anIntArray331[local13] * local175 + 16383 - this.anIntArray325[local13] * local17 >> 14;
						this.anIntArray325[local13] = local193;
					}
					if (arg1 != 0) {
						local17 = Class141.anIntArray207[arg1];
						local175 = Class141.anIntArray208[arg1];
						local193 = local175 * this.anIntArray331[local13] + 16383 - this.anIntArray330[local13] * local17 >> 14;
						this.anIntArray330[local13] = this.anIntArray331[local13] * local17 + local175 * this.anIntArray330[local13] + 16383 >> 14;
						this.anIntArray331[local13] = local193;
					}
					if (arg2 != 0) {
						local17 = Class141.anIntArray207[arg2];
						local175 = Class141.anIntArray208[arg2];
						local193 = this.anIntArray330[local13] * local17 + local175 * this.anIntArray325[local13] + 16383 >> 14;
						this.anIntArray330[local13] = local175 * this.anIntArray330[local13] + 16383 - local17 * this.anIntArray325[local13] >> 14;
						this.anIntArray325[local13] = local193;
					}
					this.anIntArray325[local13] += Static398.anInt6973;
					this.anIntArray331[local13] += Static188.anInt3178;
					this.anIntArray330[local13] += Static322.anInt5593;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt5910; local13++) {
					this.anIntArray325[local13] -= Static398.anInt6973;
					this.anIntArray331[local13] -= Static188.anInt3178;
					this.anIntArray330[local13] -= Static322.anInt5593;
					this.anIntArray325[local13] = this.anIntArray325[local13] * arg1 / 128;
					this.anIntArray331[local13] = this.anIntArray331[local13] * arg2 / 128;
					this.anIntArray330[local13] = arg3 * this.anIntArray330[local13] / 128;
					this.anIntArray325[local13] += Static398.anInt6973;
					this.anIntArray331[local13] += Static188.anInt3178;
					this.anIntArray330[local13] += Static322.anInt5593;
				}
			} else {
				@Pc(528) Class268 local528;
				@Pc(533) Class392 local533;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt5925; local13++) {
						local17 = (this.aByteArray71[local13] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray71[local13] = (byte) local17;
					}
					if (this.aClass268Array1 != null) {
						for (local17 = 0; local17 < this.anInt5909; local17++) {
							local528 = this.aClass268Array1[local17];
							local533 = this.aClass392Array1[local17];
							local533.anInt10998 = local533.anInt10998 & 0xFFFFFF | 255 - (this.aByteArray71[local528.anInt7326] & 0xFF) << 24;
						}
					}
					this.method5317();
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt5925; local13++) {
						local17 = this.aShortArray86[local13] & 0xFFFF;
						local175 = local17 >> 10 & 0x3F;
						local193 = local17 >> 7 & 0x7;
						@Pc(600) int local600 = arg1 + local175 & 0x3F;
						@Pc(604) int local604 = local17 & 0x7F;
						local193 += arg2 / 4;
						if (local193 < 0) {
							local193 = 0;
						} else if (local193 > 7) {
							local193 = 7;
						}
						local604 += arg3;
						if (local604 < 0) {
							local604 = 0;
						} else if (local604 > 127) {
							local604 = 127;
						}
						this.aShortArray86[local13] = (short) (local600 << 10 | local193 << 7 | local604);
					}
					if (this.aClass268Array1 != null) {
						for (local17 = 0; local17 < this.anInt5909; local17++) {
							local528 = this.aClass268Array1[local17];
							local533 = this.aClass392Array1[local17];
							local533.anInt10998 = Static302.anIntArray299[this.aShortArray86[local528.anInt7326] & 0xFFFF] & 0xFFFFFF | local533.anInt10998 & 0xFF000000;
						}
					}
					this.method5317();
				} else {
					@Pc(732) Class392 local732;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt5909; local13++) {
							local732 = this.aClass392Array1[local13];
							local732.anInt10999 += arg2;
							local732.anInt10997 += arg1;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt5909; local13++) {
							local732 = this.aClass392Array1[local13];
							local732.anInt11002 = arg1 * local732.anInt11002 >> 7;
							local732.anInt11005 = arg2 * local732.anInt11005 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt5909; local13++) {
							local732 = this.aClass392Array1[local13];
							local732.anInt11003 = local732.anInt11003 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) Class159 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean422) {
			this.method5321();
		}
		@Pc(18) int local18 = arg4 + this.anInt5901;
		@Pc(23) int local23 = this.anInt5905 + arg4;
		@Pc(28) int local28 = arg6 + this.anInt5911;
		@Pc(33) int local33 = this.anInt5969 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || arg2.anInt9502 + local23 >> arg2.anInt9501 >= arg2.anInt9504 || local28 < 0 || arg2.anInt9502 + local33 >> arg2.anInt9501 >= arg2.anInt9506)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || arg3.anInt9504 <= local23 + arg3.anInt9502 >> arg3.anInt9501 || local28 < 0 || arg3.anInt9506 <= arg3.anInt9502 + local33 >> arg3.anInt9501) {
				return;
			}
		} else {
			local18 >>= arg2.anInt9501;
			local23 = arg2.anInt9502 + local23 - 1 >> arg2.anInt9501;
			local28 >>= arg2.anInt9501;
			local33 = arg2.anInt9502 + local33 - 1 >> arg2.anInt9501;
			if (arg5 == arg2.method8207(local28, local18) && arg5 == arg2.method8207(local28, local23) && arg5 == arg2.method8207(local33, local18) && arg5 == arg2.method8207(local33, local23)) {
				return;
			}
		}
		@Pc(241) int local241;
		if (arg0 == 1) {
			for (local241 = 0; local241 < this.anInt5910; local241++) {
				this.anIntArray331[local241] = this.anIntArray331[local241] + arg2.method8209(this.anIntArray325[local241] + arg4, arg6 + this.anIntArray330[local241]) - arg5;
			}
		} else {
			@Pc(249) int local249;
			@Pc(257) int local257;
			if (arg0 == 2) {
				local241 = this.anInt5914;
				if (local241 == 0) {
					return;
				}
				for (local249 = 0; local249 < this.anInt5910; local249++) {
					local257 = (this.anIntArray331[local249] << 16) / local241;
					if (arg1 > local257) {
						this.anIntArray331[local249] += (arg1 - local257) * (arg2.method8209(arg4 + this.anIntArray325[local249], this.anIntArray330[local249] - -arg6) + -arg5) / arg1;
					}
				}
			} else {
				@Pc(265) int local265;
				if (arg0 == 3) {
					local241 = (arg1 & 0xFF) * 4;
					local249 = (arg1 >> 8 & 0xFF) * 4;
					local257 = (arg1 >> 16 & 0xFF) << 6;
					local265 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local241 >> 1) < 0 || (local241 >> 1) + (arg4 + arg2.anInt9502) >= arg2.anInt9504 << arg2.anInt9501 || arg6 - (local249 >> 1) < 0 || arg2.anInt9506 << arg2.anInt9501 <= arg6 + (local249 >> 1) + arg2.anInt9502) {
						return;
					}
					this.method5290(arg6, arg5, local249, local241, local257, arg4, arg2, local265);
				} else if (arg0 == 4) {
					local241 = this.anInt5971 - this.anInt5914;
					for (local249 = 0; local249 < this.anInt5910; local249++) {
						this.anIntArray331[local249] = this.anIntArray331[local249] + arg3.method8209(arg4 + this.anIntArray325[local249], this.anIntArray330[local249] + arg6) + local241 - arg5;
					}
				} else if (arg0 == 5) {
					local241 = this.anInt5971 - this.anInt5914;
					for (local249 = 0; local249 < this.anInt5910; local249++) {
						local257 = this.anIntArray325[local249] + arg4;
						local265 = arg6 + this.anIntArray330[local249];
						@Pc(376) int local376 = arg2.method8209(local257, local265);
						@Pc(382) int local382 = arg3.method8209(local257, local265);
						@Pc(389) int local389 = local376 - local382 - arg1;
						this.anIntArray331[local249] = (local389 * ((this.anIntArray331[local249] << 8) / local241) >> 8) + local376 - arg5;
					}
				}
			}
		}
		this.method5314();
		this.aBoolean422 = false;
	}

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "()[B")
	@Override
	public byte[] method5295() {
		return this.aByteArray71;
	}

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "()V")
	@Override
	public void method5300() {
		if (this.anInt5963 > 0 && this.anInt5903 > 0) {
			this.method5322();
			this.method5320();
			this.method5325();
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class141.anIntArray207[arg0];
		@Pc(13) int local13 = Class141.anIntArray208[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5910; local15++) {
			@Pc(35) int local35 = this.anIntArray325[local15] * local13 + local9 * this.anIntArray330[local15] >> 14;
			this.anIntArray330[local15] = local13 * this.anIntArray330[local15] - local9 * this.anIntArray325[local15] >> 14;
			this.anIntArray325[local15] = local35;
		}
		this.method5314();
		this.aBoolean422 = false;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class129 method5288(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class129_Sub3 local12;
		@Pc(16) Class129_Sub3 local16;
		if (arg0 == 1) {
			local12 = this.aClass144_Sub1_13.lb;
			local16 = this.aClass144_Sub1_13.aClass129_Sub3_19;
		} else if (arg0 == 2) {
			local12 = this.aClass144_Sub1_13.aClass129_Sub3_23;
			local16 = this.aClass144_Sub1_13.aClass129_Sub3_25;
		} else if (arg0 == 3) {
			local12 = this.aClass144_Sub1_13.aClass129_Sub3_20;
			local16 = this.aClass144_Sub1_13.aClass129_Sub3_24;
		} else if (arg0 == 4) {
			local12 = this.aClass144_Sub1_13.aClass129_Sub3_22;
			local16 = this.aClass144_Sub1_13.aClass129_Sub3_26;
		} else if (arg0 == 5) {
			local16 = this.aClass144_Sub1_13.aClass129_Sub3_27;
			local12 = this.aClass144_Sub1_13.aClass129_Sub3_21;
		} else {
			local12 = local16 = new Class129_Sub3(this.aClass144_Sub1_13, 0, 0, true, false);
		}
		return this.method5327(arg1, local16, arg2, arg0 != 0, local12);
	}

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "(I)V")
	private void method5323() {
		if (this.aClass367_1 != null) {
			this.aClass367_1.aBoolean711 = false;
		}
	}

	@OriginalMember(owner = "client!lia", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class141.anIntArray207[arg0];
		@Pc(13) int local13 = Class141.anIntArray208[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5910; local15++) {
			@Pc(35) int local35 = this.anIntArray325[local15] * local13 + this.anIntArray331[local15] * local9 >> 14;
			this.anIntArray331[local15] = this.anIntArray331[local15] * local13 - this.anIntArray325[local15] * local9 >> 14;
			this.anIntArray325[local15] = local35;
		}
		this.method5314();
		this.aBoolean422 = false;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg3 && arg1 < arg2 && arg1 < arg5) {
			return false;
		} else if (arg1 > arg3 && arg1 > arg2 && arg5 < arg1) {
			return false;
		} else if (arg7 > arg4 && arg4 < arg6 && arg4 < arg0) {
			return false;
		} else {
			return arg4 <= arg7 || arg6 >= arg4 || arg0 >= arg4;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!rd;IZ)V")
	@Override
	public void method5305(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray79 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5910; local15++) {
			if ((this.aShortArray79[local15] & arg1) != 0) {
				if (arg2) {
					arg0.method8448(this.anIntArray325[local15], this.anIntArray331[local15], this.anIntArray330[local15], local13);
				} else {
					arg0.method8440(this.anIntArray325[local15], this.anIntArray331[local15], this.anIntArray330[local15], local13);
				}
				this.anIntArray325[local15] = local13[0];
				this.anIntArray331[local15] = local13[1];
				this.anIntArray330[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5925; local7++) {
			if (arg0 == this.aShortArray86[local7]) {
				this.aShortArray86[local7] = arg1;
			}
		}
		if (this.aClass268Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt5909; local38++) {
				@Pc(45) Class268 local45 = this.aClass268Array1[local38];
				@Pc(50) Class392 local50 = this.aClass392Array1[local38];
				local50.anInt10998 = Static302.anIntArray299[this.aShortArray86[local45.anInt7326] & 0xFFFF] & 0xFFFFFF | local50.anInt10998 & 0xFF000000;
			}
		}
		this.method5317();
	}

	@OriginalMember(owner = "client!lia", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean422) {
			this.method5321();
		}
		return this.anInt5969;
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)V")
	private void method5325() {
		if (!this.aBoolean420) {
			return;
		}
		this.aBoolean420 = false;
		if (this.aClass352Array5 == null && this.aClass172Array5 == null && this.aClass268Array1 == null && !Static598.method8462(this.anInt5917, this.anInt5941)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			if (this.anIntArray325 != null && !Static18.method286(this.anInt5941, this.anInt5917)) {
				if (this.aClass377_2 == null || this.aClass377_2.method9077()) {
					if (!this.aBoolean422) {
						this.method5321();
					}
					local37 = true;
				} else {
					this.aBoolean420 = true;
				}
			}
			@Pc(86) boolean local86 = false;
			if (this.anIntArray331 != null && !Static36.method634(this.anInt5941, this.anInt5917)) {
				if (this.aClass377_2 == null || this.aClass377_2.method9077()) {
					if (!this.aBoolean422) {
						this.method5321();
					}
					local39 = true;
				} else {
					this.aBoolean420 = true;
				}
			}
			if (this.anIntArray330 != null && !Static531.method7863(this.anInt5917, this.anInt5941)) {
				if (this.aClass377_2 == null || this.aClass377_2.method9077()) {
					local86 = true;
					if (!this.aBoolean422) {
						this.method5321();
					}
				} else {
					this.aBoolean420 = true;
				}
			}
			if (local86) {
				this.anIntArray330 = null;
			}
			if (local37) {
				this.anIntArray325 = null;
			}
			if (local39) {
				this.anIntArray331 = null;
			}
		}
		if (this.aShortArray78 != null && this.anIntArray325 == null && this.anIntArray331 == null && this.anIntArray330 == null) {
			this.aShortArray78 = null;
			this.anIntArray326 = null;
		}
		if (this.aByteArray70 != null && !Static555.method8019(this.anInt5941, this.anInt5917)) {
			label205: {
				label204: {
					@Pc(253) boolean local253;
					if ((this.anInt5941 & 0x37) == 0) {
						if (this.aClass377_3 == null || this.aClass377_3.method9077()) {
							break label204;
						}
						local253 = false;
					} else {
						if (this.aClass377_4 == null || this.aClass377_4.method9077()) {
							break label204;
						}
						local253 = false;
					}
					if (!local253) {
						this.aBoolean420 = true;
						break label205;
					}
				}
				this.aByteArray70 = null;
				this.aShortArray75 = this.aShortArray83 = this.aShortArray76 = null;
			}
		}
		if (this.aShortArray86 != null && !Static369.method5537(this.anInt5917, this.anInt5941)) {
			if (this.aClass377_3 == null || this.aClass377_3.method9077()) {
				this.aShortArray86 = null;
			} else {
				this.aBoolean420 = true;
			}
		}
		if (this.aByteArray71 != null && !Static90.method1506(this.anInt5941, this.anInt5917)) {
			if (this.aClass377_3 == null || this.aClass377_3.method9077()) {
				this.aByteArray71 = null;
			} else {
				this.aBoolean420 = true;
			}
		}
		if (this.aFloatArray45 != null && !Static119.method1855(this.anInt5941, this.anInt5917)) {
			if (this.aClass377_1 == null || this.aClass377_1.method9077()) {
				this.aFloatArray45 = this.aFloatArray44 = null;
			} else {
				this.aBoolean420 = true;
			}
		}
		if (this.aShortArray87 != null && !Static658.method9178(this.anInt5917, this.anInt5941)) {
			if (this.aClass377_3 == null || this.aClass377_3.method9077()) {
				this.aShortArray87 = null;
			} else {
				this.aBoolean420 = true;
			}
		}
		if (this.aShortArray82 != null && !Static283.method4754(this.anInt5941, this.anInt5917)) {
			if ((this.aClass367_1 == null || this.aClass367_1.method8725()) && (this.aClass377_3 == null || this.aClass377_3.method9077())) {
				this.aShortArray82 = this.aShortArray77 = this.aShortArray80 = null;
			} else {
				this.aBoolean420 = true;
			}
		}
		if (this.aShortArray81 != null) {
			if (this.aClass377_2 == null || this.aClass377_2.method9077()) {
				this.aShortArray81 = null;
			} else {
				this.aBoolean420 = true;
			}
		}
		if (this.aShortArray84 != null) {
			if (this.aClass377_3 == null || this.aClass377_3.method9077()) {
				this.aShortArray84 = null;
			} else {
				this.aBoolean420 = true;
			}
		}
		if (this.anIntArrayArray40 != null && !Static395.method6023(this.anInt5917, this.anInt5941)) {
			this.aShortArray85 = null;
			this.anIntArrayArray40 = null;
		}
		if (this.anIntArrayArray42 != null && !Static304.method4924(this.anInt5917, this.anInt5941)) {
			this.anIntArrayArray42 = null;
			this.aShortArray79 = null;
		}
		if (this.anIntArrayArray41 != null && !Static148.method2181(this.anInt5917, this.anInt5941)) {
			this.anIntArrayArray41 = null;
		}
		if (this.anIntArray329 != null && (this.anInt5917 & 0x800) == 0 && (this.anInt5917 & 0x40000) == 0) {
			this.anIntArray329 = null;
			this.anIntArray328 = null;
			this.anIntArray327 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(FLclient!dea;IIIFIIJII)S")
	private short method5326(@OriginalArg(0) float arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(16) int local16 = this.anIntArray326[arg2];
		@Pc(23) int local23 = this.anIntArray326[arg2 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local16; local27 < local23; local27++) {
			@Pc(33) short local33 = this.aShortArray78[local27];
			if (local33 == 0) {
				local25 = local27;
				break;
			}
			if (arg7 == Static84.aLongArray7[local27]) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray78[local25] = (short) (this.anInt5963 + 1);
		Static84.aLongArray7[local25] = arg7;
		this.aShortArray84[this.anInt5963] = (short) arg3;
		this.aShortArray81[this.anInt5963] = (short) arg2;
		this.aShortArray75[this.anInt5963] = (short) arg6;
		this.aShortArray83[this.anInt5963] = (short) arg9;
		this.aShortArray76[this.anInt5963] = (short) arg5;
		this.aByteArray70[this.anInt5963] = (byte) arg8;
		this.aFloatArray45[this.anInt5963] = arg4;
		this.aFloatArray44[this.anInt5963] = arg0;
		return (short) this.anInt5963++;
	}

	@OriginalMember(owner = "client!lia", name = "f", descriptor = "()[Lclient!ih;")
	@Override
	public Class172[] method5310() {
		return this.aClass172Array5;
	}

	@OriginalMember(owner = "client!lia", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean422) {
			this.method5321();
		}
		return this.anInt5971;
	}

	@OriginalMember(owner = "client!lia", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5910; local7++) {
			if (arg0 != 128) {
				this.anIntArray325[local7] = this.anIntArray325[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray331[local7] = this.anIntArray331[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray330[local7] = arg2 * this.anIntArray330[local7] >> 7;
			}
		}
		this.method5314();
		this.aBoolean422 = false;
	}

	@OriginalMember(owner = "client!lia", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5908; local3++) {
			this.anIntArray325[local3] = this.anIntArray325[local3] + 7 >> 4;
			this.anIntArray331[local3] = this.anIntArray331[local3] + 7 >> 4;
			this.anIntArray330[local3] = this.anIntArray330[local3] + 7 >> 4;
		}
		this.method5314();
		this.aBoolean422 = false;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "()Z")
	@Override
	public boolean method5293() {
		if (this.aShortArray87 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray87.length; local13++) {
			if (this.aShortArray87[local13] != -1 && !this.aClass144_Sub1_13.anInterface4_12.method8974(this.aShortArray87[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lia", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean422) {
			this.method5321();
		}
		return this.anInt5968;
	}

	@OriginalMember(owner = "client!lia", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean422) {
			this.method5321();
		}
		return this.anInt5911;
	}

	@OriginalMember(owner = "client!lia", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort65 = (short) arg0;
		this.method5314();
		this.method5311();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILclient!lia;ZZLclient!lia;)Lclient!ka;")
	private Class129 method5327(@OriginalArg(1) int arg0, @OriginalArg(2) Class129_Sub3 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class129_Sub3 arg4) {
		if ((arg0 & 0x100) == 0) {
			arg4.aBoolean419 = this.aBoolean419;
		} else {
			arg4.aBoolean419 = true;
		}
		arg4.anInt5917 = arg0;
		arg4.anInt5941 = this.anInt5941;
		arg4.anInt5909 = this.anInt5909;
		arg4.anInt5925 = this.anInt5925;
		arg4.aShort64 = this.aShort64;
		arg4.aBoolean421 = this.aBoolean421;
		arg4.aShort65 = this.aShort65;
		arg4.anInt5910 = this.anInt5910;
		arg4.anInt5963 = this.anInt5963;
		arg4.anInt5903 = this.anInt5903;
		arg4.anInt5908 = this.anInt5908;
		@Pc(74) boolean local74 = Static218.method3768(arg0, this.anInt5941);
		@Pc(80) boolean local80 = Static221.method3810(arg0, this.anInt5941);
		@Pc(88) boolean local88 = Static24.method368(arg0, this.anInt5941);
		@Pc(94) boolean local94 = local74 | local80 | local88;
		@Pc(247) int local247;
		if (local94) {
			if (!local74) {
				arg4.anIntArray325 = this.anIntArray325;
			} else if (arg1.anIntArray325 == null || this.anInt5908 > arg1.anIntArray325.length) {
				arg4.anIntArray325 = arg1.anIntArray325 = new int[this.anInt5908];
			} else {
				arg4.anIntArray325 = arg1.anIntArray325;
			}
			if (!local80) {
				arg4.anIntArray331 = this.anIntArray331;
			} else if (arg1.anIntArray331 == null || arg1.anIntArray331.length < this.anInt5908) {
				arg4.anIntArray331 = arg1.anIntArray331 = new int[this.anInt5908];
			} else {
				arg4.anIntArray331 = arg1.anIntArray331;
			}
			if (!local88) {
				arg4.anIntArray330 = this.anIntArray330;
			} else if (arg1.anIntArray330 == null || this.anInt5908 > arg1.anIntArray330.length) {
				arg4.anIntArray330 = arg1.anIntArray330 = new int[this.anInt5908];
			} else {
				arg4.anIntArray330 = arg1.anIntArray330;
			}
			for (local247 = 0; local247 < this.anInt5908; local247++) {
				if (local74) {
					arg4.anIntArray325[local247] = this.anIntArray325[local247];
				}
				if (local80) {
					arg4.anIntArray331[local247] = this.anIntArray331[local247];
				}
				if (local88) {
					arg4.anIntArray330[local247] = this.anIntArray330[local247];
				}
			}
		} else {
			arg4.anIntArray330 = this.anIntArray330;
			arg4.anIntArray325 = this.anIntArray325;
			arg4.anIntArray331 = this.anIntArray331;
		}
		if (Static282.method4747(arg0, this.anInt5941)) {
			arg4.aClass377_2 = arg1.aClass377_2;
			arg4.aClass377_2.aBoolean738 = this.aClass377_2.aBoolean738;
			arg4.aClass377_2.aBoolean737 = true;
			arg4.aClass377_2.anInterface7_17 = this.aClass377_2.anInterface7_17;
		} else if (Static512.method9099(arg0, this.anInt5941)) {
			arg4.aClass377_2 = this.aClass377_2;
		} else {
			arg4.aClass377_2 = null;
		}
		if (Static646.method9071(arg0, this.anInt5941)) {
			if (arg1.aShortArray86 == null || this.anInt5925 > arg1.aShortArray86.length) {
				arg4.aShortArray86 = arg1.aShortArray86 = new short[this.anInt5925];
			} else {
				arg4.aShortArray86 = arg1.aShortArray86;
			}
			for (local247 = 0; local247 < this.anInt5925; local247++) {
				arg4.aShortArray86[local247] = this.aShortArray86[local247];
			}
		} else {
			arg4.aShortArray86 = this.aShortArray86;
		}
		if (Static195.method2932(this.anInt5941, arg0)) {
			if (arg1.aByteArray71 == null || this.anInt5925 > arg1.aByteArray71.length) {
				arg4.aByteArray71 = arg1.aByteArray71 = new byte[this.anInt5925];
			} else {
				arg4.aByteArray71 = arg1.aByteArray71;
			}
			for (local247 = 0; local247 < this.anInt5925; local247++) {
				arg4.aByteArray71[local247] = this.aByteArray71[local247];
			}
		} else {
			arg4.aByteArray71 = this.aByteArray71;
		}
		if (Static190.method2832(-1, arg0, this.anInt5941)) {
			arg4.aClass377_3 = arg1.aClass377_3;
			arg4.aClass377_3.aBoolean737 = true;
			arg4.aClass377_3.aBoolean738 = this.aClass377_3.aBoolean738;
			arg4.aClass377_3.anInterface7_17 = this.aClass377_3.anInterface7_17;
		} else if (Static227.method3836(arg0, this.anInt5941)) {
			arg4.aClass377_3 = this.aClass377_3;
		} else {
			arg4.aClass377_3 = null;
		}
		@Pc(682) int local682;
		if (Static238.method3986(arg0, this.anInt5941)) {
			if (arg1.aShortArray75 == null || arg1.aShortArray75.length < this.anInt5963) {
				local247 = this.anInt5963;
				arg4.aShortArray83 = arg1.aShortArray83 = new short[local247];
				arg4.aShortArray76 = arg1.aShortArray76 = new short[local247];
				arg4.aShortArray75 = arg1.aShortArray75 = new short[local247];
			} else {
				arg4.aShortArray76 = arg1.aShortArray76;
				arg4.aShortArray75 = arg1.aShortArray75;
				arg4.aShortArray83 = arg1.aShortArray83;
			}
			if (this.aClass174_1 == null) {
				arg4.aClass174_1 = null;
				for (local247 = 0; local247 < this.anInt5963; local247++) {
					arg4.aShortArray75[local247] = this.aShortArray75[local247];
					arg4.aShortArray83[local247] = this.aShortArray83[local247];
					arg4.aShortArray76[local247] = this.aShortArray76[local247];
				}
			} else {
				if (arg1.aClass174_1 == null) {
					arg1.aClass174_1 = new Class174();
				}
				@Pc(664) Class174 local664 = arg4.aClass174_1 = arg1.aClass174_1;
				if (local664.aShortArray53 == null || local664.aShortArray53.length < this.anInt5963) {
					local682 = this.anInt5963;
					local664.aShortArray54 = new short[local682];
					local664.aShortArray52 = new short[local682];
					local664.aShortArray53 = new short[local682];
					local664.aByteArray57 = new byte[local682];
				}
				for (local682 = 0; local682 < this.anInt5963; local682++) {
					arg4.aShortArray75[local682] = this.aShortArray75[local682];
					arg4.aShortArray83[local682] = this.aShortArray83[local682];
					arg4.aShortArray76[local682] = this.aShortArray76[local682];
					local664.aShortArray53[local682] = this.aClass174_1.aShortArray53[local682];
					local664.aShortArray54[local682] = this.aClass174_1.aShortArray54[local682];
					local664.aShortArray52[local682] = this.aClass174_1.aShortArray52[local682];
					local664.aByteArray57[local682] = this.aClass174_1.aByteArray57[local682];
				}
			}
			arg4.aByteArray70 = this.aByteArray70;
		} else {
			arg4.aByteArray70 = this.aByteArray70;
			arg4.aShortArray76 = this.aShortArray76;
			arg4.aShortArray83 = this.aShortArray83;
			arg4.aClass174_1 = this.aClass174_1;
			arg4.aShortArray75 = this.aShortArray75;
		}
		if (Static47.method798(this.anInt5941, arg0)) {
			arg4.aClass377_4 = arg1.aClass377_4;
			arg4.aClass377_4.aBoolean738 = this.aClass377_4.aBoolean738;
			arg4.aClass377_4.anInterface7_17 = this.aClass377_4.anInterface7_17;
			arg4.aClass377_4.aBoolean737 = true;
		} else if (Static317.method5020(this.anInt5941, arg0)) {
			arg4.aClass377_4 = this.aClass377_4;
		} else {
			arg4.aClass377_4 = null;
		}
		if (Static385.method5887(this.anInt5941, arg0)) {
			if (arg1.aFloatArray45 == null || arg1.aFloatArray45.length < this.anInt5925) {
				local247 = this.anInt5963;
				arg4.aFloatArray44 = arg1.aFloatArray44 = new float[local247];
				arg4.aFloatArray45 = arg1.aFloatArray45 = new float[local247];
			} else {
				arg4.aFloatArray45 = arg1.aFloatArray45;
				arg4.aFloatArray44 = arg1.aFloatArray44;
			}
			for (local247 = 0; local247 < this.anInt5963; local247++) {
				arg4.aFloatArray45[local247] = this.aFloatArray45[local247];
				arg4.aFloatArray44[local247] = this.aFloatArray44[local247];
			}
		} else {
			arg4.aFloatArray45 = this.aFloatArray45;
			arg4.aFloatArray44 = this.aFloatArray44;
		}
		if (Static133.method2018(-19, this.anInt5941, arg0)) {
			arg4.aClass377_1 = arg1.aClass377_1;
			arg4.aClass377_1.anInterface7_17 = this.aClass377_1.anInterface7_17;
			arg4.aClass377_1.aBoolean738 = this.aClass377_1.aBoolean738;
			arg4.aClass377_1.aBoolean737 = true;
		} else if (Static391.method5935(this.anInt5941, arg0)) {
			arg4.aClass377_1 = this.aClass377_1;
		} else {
			arg4.aClass377_1 = null;
		}
		if (Static148.method2180(this.anInt5941, arg0)) {
			if (arg1.aShortArray82 == null || arg1.aShortArray82.length < this.anInt5925) {
				local247 = this.anInt5925;
				arg4.aShortArray77 = arg1.aShortArray77 = new short[local247];
				arg4.aShortArray82 = arg1.aShortArray82 = new short[local247];
				arg4.aShortArray80 = arg1.aShortArray80 = new short[local247];
			} else {
				arg4.aShortArray77 = arg1.aShortArray77;
				arg4.aShortArray80 = arg1.aShortArray80;
				arg4.aShortArray82 = arg1.aShortArray82;
			}
			for (local247 = 0; local247 < this.anInt5925; local247++) {
				arg4.aShortArray82[local247] = this.aShortArray82[local247];
				arg4.aShortArray77[local247] = this.aShortArray77[local247];
				arg4.aShortArray80[local247] = this.aShortArray80[local247];
			}
		} else {
			arg4.aShortArray82 = this.aShortArray82;
			arg4.aShortArray80 = this.aShortArray80;
			arg4.aShortArray77 = this.aShortArray77;
		}
		if (Static48.method806(arg0, this.anInt5941)) {
			arg4.aClass367_1 = arg1.aClass367_1;
			arg4.aClass367_1.aBoolean711 = this.aClass367_1.aBoolean711;
			arg4.aClass367_1.anInterface8_8 = this.aClass367_1.anInterface8_8;
			arg4.aClass367_1.aBoolean712 = true;
		} else if (Static43.method710(arg0, this.anInt5941)) {
			arg4.aClass367_1 = this.aClass367_1;
		} else {
			arg4.aClass367_1 = null;
		}
		if (Static109.method1773(arg0, this.anInt5941)) {
			if (arg1.aShortArray87 == null || arg1.aShortArray87.length < this.anInt5925) {
				local247 = this.anInt5925;
				arg4.aShortArray87 = arg1.aShortArray87 = new short[local247];
			} else {
				arg4.aShortArray87 = arg1.aShortArray87;
			}
			for (local247 = 0; local247 < this.anInt5925; local247++) {
				arg4.aShortArray87[local247] = this.aShortArray87[local247];
			}
		} else {
			arg4.aShortArray87 = this.aShortArray87;
		}
		if (!Static188.method2826(arg0, this.anInt5941)) {
			arg4.aClass392Array1 = this.aClass392Array1;
		} else if (arg1.aClass392Array1 == null || this.anInt5909 > arg1.aClass392Array1.length) {
			local247 = this.anInt5909;
			arg4.aClass392Array1 = arg1.aClass392Array1 = new Class392[local247];
			for (local682 = 0; local682 < this.anInt5909; local682++) {
				arg4.aClass392Array1[local682] = this.aClass392Array1[local682].method9336();
			}
		} else {
			arg4.aClass392Array1 = arg1.aClass392Array1;
			for (local247 = 0; local247 < this.anInt5909; local247++) {
				arg4.aClass392Array1[local247].method9337(this.aClass392Array1[local247]);
			}
		}
		arg4.aClass352Array5 = this.aClass352Array5;
		arg4.anIntArray327 = this.anIntArray327;
		arg4.anIntArray328 = this.anIntArray328;
		arg4.aShortArray85 = this.aShortArray85;
		arg4.aShortArray84 = this.aShortArray84;
		if (this.aBoolean422) {
			arg4.anInt5971 = this.anInt5971;
			arg4.anInt5901 = this.anInt5901;
			arg4.anInt5968 = this.anInt5968;
			arg4.anInt5969 = this.anInt5969;
			arg4.aBoolean422 = true;
			arg4.anInt5911 = this.anInt5911;
			arg4.anInt5905 = this.anInt5905;
			arg4.anInt5922 = this.anInt5922;
			arg4.anInt5914 = this.anInt5914;
		} else {
			arg4.aBoolean422 = false;
		}
		arg4.aClass268Array1 = this.aClass268Array1;
		arg4.aShortArray78 = this.aShortArray78;
		arg4.anIntArray326 = this.anIntArray326;
		arg4.anIntArrayArray41 = this.anIntArrayArray41;
		arg4.aShortArray79 = this.aShortArray79;
		arg4.anIntArray329 = this.anIntArray329;
		arg4.anIntArrayArray40 = this.anIntArrayArray40;
		arg4.aShortArray81 = this.aShortArray81;
		arg4.aClass172Array5 = this.aClass172Array5;
		arg4.anIntArrayArray42 = this.anIntArrayArray42;
		return arg4;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!cka;Z)V")
	private void method5328(@OriginalArg(0) Class14_Sub2_Sub5_Sub1 arg0) {
		if (this.anInt5963 > Static244.anIntArray233.length) {
			Static244.anIntArray233 = new int[this.anInt5963];
			Static129.anIntArray133 = new int[this.anInt5963];
		}
		@Pc(53) int local53;
		@Pc(92) int local92;
		@Pc(101) int local101;
		for (@Pc(27) int local27 = 0; local27 < this.anInt5910; local27++) {
			local53 = (this.anIntArray325[local27] - (this.anIntArray331[local27] * this.aClass144_Sub1_13.anInt6515 >> 8) >> this.aClass144_Sub1_13.anInt6523) - arg0.anInt1267;
			@Pc(78) int local78 = (this.anIntArray330[local27] - (this.anIntArray331[local27] * this.aClass144_Sub1_13.anInt6529 >> 8) >> this.aClass144_Sub1_13.anInt6523) - arg0.anInt1266;
			@Pc(83) int local83 = this.anIntArray326[local27];
			@Pc(90) int local90 = this.anIntArray326[local27 + 1];
			for (local92 = local83; local92 < local90; local92++) {
				local101 = this.aShortArray78[local92] - 1;
				if (local101 == -1) {
					break;
				}
				Static244.anIntArray233[local101] = local53;
				Static129.anIntArray133[local101] = local78;
			}
		}
		for (local53 = 0; local53 < this.anInt5903; local53++) {
			if (this.aByteArray71 == null || this.aByteArray71[local53] <= 128) {
				@Pc(154) short local154 = this.aShortArray82[local53];
				@Pc(159) short local159 = this.aShortArray77[local53];
				@Pc(164) short local164 = this.aShortArray80[local53];
				local92 = Static244.anIntArray233[local154];
				local101 = Static244.anIntArray233[local159];
				@Pc(176) int local176 = Static244.anIntArray233[local164];
				@Pc(180) int local180 = Static129.anIntArray133[local154];
				@Pc(184) int local184 = Static129.anIntArray133[local159];
				@Pc(188) int local188 = Static129.anIntArray133[local164];
				if (-((local184 - local180) * (-local101 + local176)) + (local92 - local101) * (-local188 + local184) > 0) {
					arg0.method1272(local176, local92, local188, local184, local101, local180);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean422) {
			this.method5321();
		}
		return this.anInt5922;
	}
}
