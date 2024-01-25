import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
	private int anInt2565;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "Lclient!qw;")
	private Class294 aClass294_1;

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
	private int anInt2579;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Z")
	private boolean aBoolean182;

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!ff", name = "pb", descriptor = "I")
	private int anInt2599;

	@OriginalMember(owner = "client!ff", name = "Eb", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_5;

	@OriginalMember(owner = "client!ff", name = "Nb", descriptor = "Lclient!he;")
	private Class148 aClass148_1;

	@OriginalMember(owner = "client!ff", name = "Vb", descriptor = "I")
	private int anInt2617;

	@OriginalMember(owner = "client!ff", name = "Wb", descriptor = "I")
	private int anInt2618;

	@OriginalMember(owner = "client!ff", name = "Xb", descriptor = "Lclient!he;")
	private Class148 aClass148_2;

	@OriginalMember(owner = "client!ff", name = "cc", descriptor = "Lclient!he;")
	private Class148 aClass148_3;

	@OriginalMember(owner = "client!ff", name = "ec", descriptor = "I")
	private int anInt2623;

	@OriginalMember(owner = "client!ff", name = "jc", descriptor = "I")
	private int anInt2626;

	@OriginalMember(owner = "client!ff", name = "tc", descriptor = "I")
	private int anInt2634;

	@OriginalMember(owner = "client!ff", name = "yc", descriptor = "I")
	private int anInt2637;

	@OriginalMember(owner = "client!ff", name = "Cc", descriptor = "Lclient!he;")
	private Class148 aClass148_4;

	@OriginalMember(owner = "client!ff", name = "Fc", descriptor = "Z")
	private boolean aBoolean184;

	@OriginalMember(owner = "client!ff", name = "Ic", descriptor = "I")
	private int anInt2641;

	@OriginalMember(owner = "client!ff", name = "Kc", descriptor = "Lclient!vj;")
	private Class375 aClass375_1;

	@OriginalMember(owner = "client!ff", name = "Rb", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!ff", name = "qc", descriptor = "I")
	private int anInt2632;

	@OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
	private int anInt2591;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "client!ff", name = "gc", descriptor = "Z")
	private boolean aBoolean183;

	@OriginalMember(owner = "client!ff", name = "pc", descriptor = "I")
	private int anInt2631;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ff", name = "Gc", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!ff", name = "lc", descriptor = "I")
	private int anInt2628;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!ff", name = "ic", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!ff", name = "Bc", descriptor = "[Lclient!nha;")
	private Class244[] aClass244Array1;

	@OriginalMember(owner = "client!ff", name = "wb", descriptor = "[Lclient!rf;")
	private Class303[] aClass303Array1;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "I")
	private int anInt2593;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "[Lclient!eka;")
	private Class98[] aClass98Array1;

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "[Lclient!lk;")
	private Class222[] aClass222Array1;

	@OriginalMember(owner = "client!ff", name = "Jc", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!ff", name = "Yb", descriptor = "[F")
	private float[] aFloatArray10;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ff", name = "zb", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "[F")
	private float[] aFloatArray9;

	@OriginalMember(owner = "client!ff", name = "sb", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!ff", name = "nc", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!ff", name = "Ec", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!ff", name = "Ub", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!ff", name = "Mb", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ff", name = "Ab", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!ff", name = "sc", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!ff", name = "Tb", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!ff", name = "tb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ff", name = "xc", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!ff", name = "uc", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!ff", name = "Hc", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!ff", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ff", name = "Pb", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!wk;Lclient!hm;IIII)V")
	public Class114_Sub1(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface3 local11 = arg0.anInterface3_11;
		@Pc(15) int[] local15 = new int[arg1.anInt3706];
		this.anIntArray132 = new int[arg1.anInt3707 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt3706; local24++) {
			if (arg1.aByteArray37 == null || arg1.aByteArray37[local24] != 2) {
				if (arg1.aShortArray58 != null && arg1.aShortArray58[local24] != -1) {
					@Pc(56) Class331 local56 = local11.method8501(arg1.aShortArray58[local24] & 0xFFFF);
					if (((this.anInt2641 & 0x40) == 0 || !local56.aBoolean660) && local56.aBoolean658) {
						continue;
					}
				}
				local15[this.anInt2632++] = local24;
				this.anIntArray132[arg1.aShortArray56[local24]]++;
				this.anIntArray132[arg1.aShortArray57[local24]]++;
				this.anIntArray132[arg1.aShortArray51[local24]]++;
			}
		}
		this.anInt2591 = this.anInt2632;
		@Pc(129) long[] local129 = new long[this.anInt2632];
		@Pc(138) boolean local138 = (this.anInt2599 & 0x100) != 0;
		@Pc(150) int local150;
		@Pc(163) int local163;
		@Pc(319) int local319;
		for (@Pc(140) int local140 = 0; local140 < this.anInt2632; local140++) {
			@Pc(146) int local146 = local15[local140];
			@Pc(148) Class331 local148 = null;
			local150 = 0;
			@Pc(152) byte local152 = 0;
			@Pc(154) byte local154 = 0;
			@Pc(156) byte local156 = 0;
			if (arg1.aClass261Array1 != null) {
				@Pc(161) boolean local161 = false;
				for (local163 = 0; local163 < arg1.aClass261Array1.length; local163++) {
					@Pc(170) Class261 local170 = arg1.aClass261Array1[local163];
					if (local146 == local170.anInt7575) {
						@Pc(179) Class75 local179 = Static504.method7253(local170.anInt7579);
						if (local179.aBoolean119) {
							local161 = true;
						}
						if (local179.anInt1735 != -1) {
							@Pc(195) Class331 local195 = local11.method8501(local179.anInt1735);
							if (local195.anInt9140 == 2) {
								this.aBoolean181 = true;
							}
						}
					}
				}
				if (local161) {
					local129[local140] = Long.MAX_VALUE;
					this.anInt2591--;
					continue;
				}
			}
			@Pc(226) short local226 = -1;
			if (arg1.aShortArray58 != null) {
				local226 = arg1.aShortArray58[local146];
				if (local226 != -1) {
					local148 = local11.method8501(local226 & 0xFFFF);
					if ((this.anInt2641 & 0x40) != 0 && local148.aBoolean660) {
						local226 = -1;
						local148 = null;
					} else {
						local156 = local148.aByte114;
						local154 = local148.aByte117;
					}
				}
			}
			@Pc(281) boolean local281 = arg1.aByteArray34 != null && arg1.aByteArray34[local146] != 0 || local148 != null && local148.anInt9140 != 0;
			if ((local138 || local281) && arg1.aByteArray35 != null) {
				local150 += arg1.aByteArray35[local146] << 17;
			}
			if (local281) {
				local150 += 65536;
			}
			local150 += (local154 & 0xFF) << 8;
			local319 = local152 + ((local226 & 0xFFFF) << 16);
			local150 += local156 & 0xFF;
			@Pc(331) int local331 = local319 + (local140 & 0xFFFF);
			local129[local140] = (long) local331 + ((long) local150 << 32);
			this.aBoolean181 |= local281;
			this.aBoolean183 |= local148 != null && (local148.aByte116 != 0 || local148.aByte113 != 0);
		}
		Static43.method609(local15, local129);
		this.anInt2631 = arg1.anInt3707;
		this.aShortArray18 = arg1.aShortArray52;
		this.anIntArray135 = arg1.anIntArray223;
		this.anInt2628 = arg1.anInt3708;
		this.anIntArray130 = arg1.anIntArray231;
		this.anIntArray133 = arg1.anIntArray227;
		this.aClass244Array1 = arg1.aClass244Array3;
		@Pc(414) Class256[] local414 = new Class256[this.anInt2631];
		this.aClass303Array1 = arg1.aClass303Array3;
		@Pc(438) int local438;
		@Pc(452) int local452;
		@Pc(491) int local491;
		if (arg1.aClass261Array1 != null) {
			this.anInt2593 = arg1.aClass261Array1.length;
			this.aClass98Array1 = new Class98[this.anInt2593];
			this.aClass222Array1 = new Class222[this.anInt2593];
			for (local438 = 0; local438 < this.anInt2593; local438++) {
				@Pc(445) Class261 local445 = arg1.aClass261Array1[local438];
				@Pc(450) Class75 local450 = Static504.method7253(local445.anInt7579);
				local452 = -1;
				for (@Pc(454) int local454 = 0; local454 < this.anInt2632; local454++) {
					if (local445.anInt7575 == local15[local454]) {
						local452 = local454;
						break;
					}
				}
				if (local452 == -1) {
					throw new RuntimeException();
				}
				local491 = Static6.anIntArray6[arg1.aShortArray55[local445.anInt7575] & 0xFFFF] & 0xFFFFFF;
				@Pc(508) int local508 = local491 | 255 - (arg1.aByteArray34 == null ? 0 : arg1.aByteArray34[local445.anInt7575]) << 24;
				this.aClass222Array1[local438] = new Class222(local452, arg1.aShortArray56[local445.anInt7575], arg1.aShortArray57[local445.anInt7575], arg1.aShortArray51[local445.anInt7575], local450.anInt1730, local450.anInt1728, local450.anInt1735, local450.anInt1731, local450.anInt1736, local450.aBoolean119, local450.aBoolean117, local445.anInt7577);
				this.aClass98Array1[local438] = new Class98(local508);
			}
		}
		local438 = this.anInt2632 * 3;
		this.aShortArray27 = new short[this.anInt2632];
		Static368.aLongArray15 = new long[local438];
		this.aFloatArray10 = new float[local438];
		this.aShortArray17 = new short[local438];
		this.aShortArray20 = new short[this.anInt2632];
		this.aFloatArray9 = new float[local438];
		this.aByteArray17 = new byte[this.anInt2632];
		this.aShortArray16 = new short[this.anInt2632];
		this.aShort28 = (short) arg3;
		this.aShortArray23 = new short[local438];
		this.aShortArray26 = new short[this.anInt2632];
		this.aShortArray22 = new short[local438];
		this.aShortArray15 = new short[local438];
		this.aByteArray18 = new byte[local438];
		if (arg1.aShortArray49 != null) {
			this.aShortArray21 = new short[this.anInt2632];
		}
		this.aShortArray24 = new short[local438];
		this.aShort29 = (short) arg4;
		this.aShortArray19 = new short[local438];
		this.aShortArray25 = new short[this.anInt2632];
		local150 = 0;
		for (local319 = 0; local319 < arg1.anInt3707; local319++) {
			local452 = this.anIntArray132[local319];
			this.anIntArray132[local319] = local150;
			local150 += local452;
			local414[local319] = new Class256();
		}
		this.anIntArray132[arg1.anInt3707] = local150;
		@Pc(694) Class308 local694 = Static221.method3127(this.anInt2632, local15, arg1);
		@Pc(698) Class355[] local698 = new Class355[arg1.anInt3706];
		@Pc(739) int local739;
		@Pc(750) int local750;
		@Pc(761) int local761;
		@Pc(717) short local717;
		@Pc(728) int local728;
		for (local491 = 0; local491 < arg1.anInt3706; local491++) {
			@Pc(707) short local707 = arg1.aShortArray56[local491];
			@Pc(712) short local712 = arg1.aShortArray57[local491];
			local717 = arg1.aShortArray51[local491];
			local728 = this.anIntArray133[local712] - this.anIntArray133[local707];
			local739 = this.anIntArray130[local712] - this.anIntArray130[local707];
			local750 = this.anIntArray135[local712] - this.anIntArray135[local707];
			local761 = this.anIntArray133[local717] - this.anIntArray133[local707];
			@Pc(772) int local772 = this.anIntArray130[local717] - this.anIntArray130[local707];
			@Pc(783) int local783 = this.anIntArray135[local717] - this.anIntArray135[local707];
			@Pc(792) int local792 = local739 * local783 - local772 * local750;
			@Pc(801) int local801 = local761 * local750 - local728 * local783;
			@Pc(810) int local810 = local772 * local728 - local739 * local761;
			while (local792 > 8192 || local801 > 8192 || local810 > 8192 || local792 < -8192 || local801 < -8192 || local810 < -8192) {
				local801 >>= 0x1;
				local810 >>= 0x1;
				local792 >>= 0x1;
			}
			@Pc(864) int local864 = (int) Math.sqrt((double) (local801 * local801 + local792 * local792 + local810 * local810));
			if (local864 <= 0) {
				local864 = 1;
			}
			local810 = local810 * 256 / local864;
			local792 = local792 * 256 / local864;
			local801 = local801 * 256 / local864;
			@Pc(899) byte local899 = arg1.aByteArray37 == null ? 0 : arg1.aByteArray37[local491];
			if (local899 == 0) {
				@Pc(932) Class256 local932 = local414[local707];
				local932.anInt7528 += local792;
				local932.anInt7530++;
				local932.anInt7523 += local801;
				local932.anInt7526 += local810;
				@Pc(960) Class256 local960 = local414[local712];
				local960.anInt7528 += local792;
				local960.anInt7530++;
				local960.anInt7526 += local810;
				local960.anInt7523 += local801;
				@Pc(988) Class256 local988 = local414[local717];
				local988.anInt7523 += local801;
				local988.anInt7528 += local792;
				local988.anInt7526 += local810;
				local988.anInt7530++;
			} else if (local899 == 1) {
				@Pc(917) Class355 local917 = local698[local491] = new Class355();
				local917.anInt9723 = local792;
				local917.anInt9727 = local810;
				local917.anInt9718 = local801;
			}
		}
		@Pc(1025) int local1025;
		@Pc(1068) short local1068;
		for (local163 = 0; local163 < this.anInt2632; local163++) {
			local1025 = local15[local163];
			@Pc(1032) int local1032 = arg1.aShortArray55[local1025] & 0xFFFF;
			if (arg1.aByteArray36 == null) {
				local728 = -1;
			} else {
				local728 = arg1.aByteArray36[local1025];
			}
			if (arg1.aByteArray34 == null) {
				local739 = 0;
			} else {
				local739 = arg1.aByteArray34[local1025] & 0xFF;
			}
			local1068 = arg1.aShortArray58 == null ? -1 : arg1.aShortArray58[local1025];
			if (local1068 != -1 && (this.anInt2641 & 0x40) != 0) {
				@Pc(1087) Class331 local1087 = local11.method8501(local1068 & 0xFFFF);
				if (local1087.aBoolean660) {
					local1068 = -1;
				}
			}
			@Pc(1094) float local1094 = 0.0F;
			@Pc(1096) float local1096 = 0.0F;
			@Pc(1098) float local1098 = 0.0F;
			@Pc(1100) float local1100 = 0.0F;
			@Pc(1102) float local1102 = 0.0F;
			@Pc(1104) float local1104 = 0.0F;
			@Pc(1106) byte local1106 = 0;
			@Pc(1108) byte local1108 = 0;
			@Pc(1110) int local1110 = 0;
			@Pc(1143) byte local1143;
			@Pc(1163) short local1163;
			@Pc(1168) short local1168;
			@Pc(1173) short local1173;
			if (local1068 != -1) {
				if (local728 == -1) {
					local1108 = 2;
					local1096 = 1.0F;
					local1102 = 0.0F;
					local1094 = 0.0F;
					local1104 = 0.0F;
					local1100 = 1.0F;
					local1106 = 1;
					local1098 = 1.0F;
				} else {
					local728 &= 0xFF;
					local1143 = arg1.aByteArray33[local728];
					@Pc(1153) short local1153;
					@Pc(1158) short local1158;
					@Pc(1196) float local1196;
					@Pc(1205) float local1205;
					@Pc(1214) float local1214;
					@Pc(1298) float local1298;
					@Pc(1306) float local1306;
					@Pc(1314) float local1314;
					@Pc(1323) float local1323;
					@Pc(1332) float local1332;
					@Pc(1341) float local1341;
					if (local1143 == 0) {
						local1153 = arg1.aShortArray56[local1025];
						local1158 = arg1.aShortArray57[local1025];
						local1163 = arg1.aShortArray51[local1025];
						local1168 = arg1.aShortArray50[local728];
						local1173 = arg1.aShortArray53[local728];
						@Pc(1178) short local1178 = arg1.aShortArray54[local728];
						@Pc(1184) float local1184 = (float) arg1.anIntArray227[local1168];
						@Pc(1190) float local1190 = (float) arg1.anIntArray231[local1168];
						local1196 = (float) arg1.anIntArray223[local1168];
						local1205 = (float) arg1.anIntArray227[local1173] - local1184;
						local1214 = (float) arg1.anIntArray231[local1173] - local1190;
						@Pc(1223) float local1223 = (float) arg1.anIntArray223[local1173] - local1196;
						@Pc(1231) float local1231 = (float) arg1.anIntArray227[local1178] - local1184;
						@Pc(1240) float local1240 = (float) arg1.anIntArray231[local1178] - local1190;
						@Pc(1249) float local1249 = (float) arg1.anIntArray223[local1178] - local1196;
						@Pc(1257) float local1257 = (float) arg1.anIntArray227[local1153] - local1184;
						@Pc(1265) float local1265 = (float) arg1.anIntArray231[local1153] - local1190;
						@Pc(1273) float local1273 = (float) arg1.anIntArray223[local1153] - local1196;
						@Pc(1281) float local1281 = (float) arg1.anIntArray227[local1158] - local1184;
						@Pc(1289) float local1289 = (float) arg1.anIntArray231[local1158] - local1190;
						local1298 = (float) arg1.anIntArray223[local1158] - local1196;
						local1306 = (float) arg1.anIntArray227[local1163] - local1184;
						local1314 = (float) arg1.anIntArray231[local1163] - local1190;
						local1323 = (float) arg1.anIntArray223[local1163] - local1196;
						local1332 = local1214 * local1249 - local1240 * local1223;
						local1341 = local1223 * local1231 - local1249 * local1205;
						@Pc(1350) float local1350 = local1240 * local1205 - local1231 * local1214;
						@Pc(1359) float local1359 = local1240 * local1350 - local1249 * local1341;
						@Pc(1368) float local1368 = local1332 * local1249 - local1350 * local1231;
						@Pc(1377) float local1377 = local1341 * local1231 - local1240 * local1332;
						@Pc(1391) float local1391 = 1.0F / (local1359 * local1205 + local1214 * local1368 + local1377 * local1223);
						local1102 = local1391 * (local1314 * local1368 + local1306 * local1359 + local1323 * local1377);
						local1098 = (local1368 * local1289 + local1359 * local1281 + local1298 * local1377) * local1391;
						local1094 = (local1265 * local1368 + local1359 * local1257 + local1377 * local1273) * local1391;
						@Pc(1442) float local1442 = local1205 * local1341 - local1332 * local1214;
						@Pc(1451) float local1451 = local1332 * local1223 - local1350 * local1205;
						@Pc(1459) float local1459 = local1214 * local1350 - local1341 * local1223;
						@Pc(1473) float local1473 = 1.0F / (local1240 * local1451 + local1231 * local1459 + local1249 * local1442);
						local1100 = local1473 * (local1281 * local1459 + local1451 * local1289 + local1298 * local1442);
						local1104 = local1473 * (local1451 * local1314 + local1306 * local1459 + local1442 * local1323);
						local1096 = local1473 * (local1442 * local1273 + local1257 * local1459 + local1265 * local1451);
					} else {
						local1153 = arg1.aShortArray56[local1025];
						local1158 = arg1.aShortArray57[local1025];
						local1163 = arg1.aShortArray51[local1025];
						@Pc(1537) int local1537 = local694.anIntArray468[local728];
						@Pc(1542) int local1542 = local694.anIntArray469[local728];
						@Pc(1547) int local1547 = local694.anIntArray470[local728];
						@Pc(1552) float[] local1552 = local694.aFloatArrayArray14[local728];
						@Pc(1557) byte local1557 = arg1.aByteArray32[local728];
						local1196 = (float) arg1.anIntArray221[local728] / 256.0F;
						if (local1143 == 1) {
							local1205 = (float) arg1.anIntArray224[local728] / 1024.0F;
							Static538.method7457(local1205, local1557, arg1.anIntArray231[local1153], arg1.anIntArray223[local1153], local1542, local1552, arg1.anIntArray227[local1153], local1196, local1537, Static72.aFloatArray66, local1547);
							local1096 = Static72.aFloatArray66[1];
							local1094 = Static72.aFloatArray66[0];
							Static538.method7457(local1205, local1557, arg1.anIntArray231[local1158], arg1.anIntArray223[local1158], local1542, local1552, arg1.anIntArray227[local1158], local1196, local1537, Static72.aFloatArray66, local1547);
							local1100 = Static72.aFloatArray66[1];
							local1098 = Static72.aFloatArray66[0];
							Static538.method7457(local1205, local1557, arg1.anIntArray231[local1163], arg1.anIntArray223[local1163], local1542, local1552, arg1.anIntArray227[local1163], local1196, local1537, Static72.aFloatArray66, local1547);
							local1104 = Static72.aFloatArray66[1];
							local1102 = Static72.aFloatArray66[0];
							local1214 = local1205 / 2.0F;
							if ((local1557 & 0x1) == 0) {
								if (local1098 - local1094 > local1214) {
									local1098 -= local1205;
									local1106 = 1;
								} else if (local1214 < local1094 - local1098) {
									local1098 += local1205;
									local1106 = 2;
								}
								if (local1214 < local1102 - local1094) {
									local1102 -= local1205;
									local1108 = 1;
								} else if (local1214 < local1094 - local1102) {
									local1102 += local1205;
									local1108 = 2;
								}
							} else {
								if (local1104 - local1096 > local1214) {
									local1108 = 1;
									local1104 -= local1205;
								} else if (local1214 < local1096 - local1104) {
									local1108 = 2;
									local1104 += local1205;
								}
								if (local1100 - local1096 > local1214) {
									local1106 = 1;
									local1100 -= local1205;
								} else if (local1096 - local1100 > local1214) {
									local1106 = 2;
									local1100 += local1205;
								}
							}
						} else if (local1143 == 2) {
							local1205 = (float) arg1.anIntArray228[local728] / 256.0F;
							local1214 = (float) arg1.anIntArray220[local728] / 256.0F;
							@Pc(1810) int local1810 = arg1.anIntArray227[local1158] - arg1.anIntArray227[local1153];
							@Pc(1821) int local1821 = arg1.anIntArray231[local1158] - arg1.anIntArray231[local1153];
							@Pc(1832) int local1832 = arg1.anIntArray223[local1158] - arg1.anIntArray223[local1153];
							@Pc(1842) int local1842 = arg1.anIntArray227[local1163] - arg1.anIntArray227[local1153];
							@Pc(1853) int local1853 = arg1.anIntArray231[local1163] - arg1.anIntArray231[local1153];
							@Pc(1864) int local1864 = arg1.anIntArray223[local1163] - arg1.anIntArray223[local1153];
							@Pc(1873) int local1873 = local1821 * local1864 - local1832 * local1853;
							@Pc(1882) int local1882 = local1832 * local1842 - local1864 * local1810;
							@Pc(1891) int local1891 = local1810 * local1853 - local1842 * local1821;
							local1298 = 64.0F / (float) arg1.anIntArray229[local728];
							local1306 = 64.0F / (float) arg1.anIntArray230[local728];
							local1314 = 64.0F / (float) arg1.anIntArray224[local728];
							local1323 = ((float) local1873 * local1552[0] + (float) local1882 * local1552[1] + local1552[2] * (float) local1891) / local1298;
							local1332 = ((float) local1882 * local1552[4] + local1552[3] * (float) local1873 + local1552[5] * (float) local1891) / local1306;
							local1341 = (local1552[6] * (float) local1873 + (float) local1882 * local1552[7] + (float) local1891 * local1552[8]) / local1314;
							local1110 = Static621.method8306(local1341, local1332, local1323);
							Static474.method7008(local1547, Static72.aFloatArray66, local1214, local1557, local1542, local1110, local1205, local1196, local1552, arg1.anIntArray227[local1153], arg1.anIntArray231[local1153], arg1.anIntArray223[local1153], local1537);
							local1094 = Static72.aFloatArray66[0];
							local1096 = Static72.aFloatArray66[1];
							Static474.method7008(local1547, Static72.aFloatArray66, local1214, local1557, local1542, local1110, local1205, local1196, local1552, arg1.anIntArray227[local1158], arg1.anIntArray231[local1158], arg1.anIntArray223[local1158], local1537);
							local1098 = Static72.aFloatArray66[0];
							local1100 = Static72.aFloatArray66[1];
							Static474.method7008(local1547, Static72.aFloatArray66, local1214, local1557, local1542, local1110, local1205, local1196, local1552, arg1.anIntArray227[local1163], arg1.anIntArray231[local1163], arg1.anIntArray223[local1163], local1537);
							local1102 = Static72.aFloatArray66[0];
							local1104 = Static72.aFloatArray66[1];
						} else if (local1143 == 3) {
							Static69.method985(local1542, local1196, Static72.aFloatArray66, arg1.anIntArray227[local1153], local1547, arg1.anIntArray223[local1153], local1537, arg1.anIntArray231[local1153], local1552, local1557);
							local1096 = Static72.aFloatArray66[1];
							local1094 = Static72.aFloatArray66[0];
							Static69.method985(local1542, local1196, Static72.aFloatArray66, arg1.anIntArray227[local1158], local1547, arg1.anIntArray223[local1158], local1537, arg1.anIntArray231[local1158], local1552, local1557);
							local1100 = Static72.aFloatArray66[1];
							local1098 = Static72.aFloatArray66[0];
							Static69.method985(local1542, local1196, Static72.aFloatArray66, arg1.anIntArray227[local1163], local1547, arg1.anIntArray223[local1163], local1537, arg1.anIntArray231[local1163], local1552, local1557);
							local1104 = Static72.aFloatArray66[1];
							local1102 = Static72.aFloatArray66[0];
							if ((local1557 & 0x1) == 0) {
								if (local1102 - local1094 > 0.5F) {
									local1108 = 1;
									local1102--;
								} else if (local1094 - local1102 > 0.5F) {
									local1102++;
									local1108 = 2;
								}
								if (local1098 - local1094 > 0.5F) {
									local1106 = 1;
									local1098--;
								} else if (local1094 - local1098 > 0.5F) {
									local1098++;
									local1106 = 2;
								}
							} else {
								if (local1100 - local1096 > 0.5F) {
									local1100--;
									local1106 = 1;
								} else if (local1096 - local1100 > 0.5F) {
									local1100++;
									local1106 = 2;
								}
								if (local1104 - local1096 > 0.5F) {
									local1104--;
									local1108 = 1;
								} else if (local1096 - local1104 > 0.5F) {
									local1108 = 2;
									local1104++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray37 == null) {
				local1143 = 0;
			} else {
				local1143 = arg1.aByteArray37[local1025];
			}
			if (local1143 == 0) {
				@Pc(2340) long local2340 = (long) (local728 << 2) + ((long) (local1032 << 8) + (long) (local1110 << 24) + (long) local739 << 32);
				local1163 = arg1.aShortArray56[local1025];
				local1168 = arg1.aShortArray57[local1025];
				local1173 = arg1.aShortArray51[local1025];
				@Pc(2359) Class256 local2359 = local414[local1163];
				this.aShortArray20[local163] = this.method2365(local163, local2359.anInt7523, local1163, local1094, local2359.anInt7526, arg1, local1096, local2359.anInt7530, local2359.anInt7528, local2340);
				@Pc(2384) Class256 local2384 = local414[local1168];
				this.aShortArray26[local163] = this.method2365(local163, local2384.anInt7523, local1168, local1098, local2384.anInt7526, arg1, local1100, local2384.anInt7530, local2384.anInt7528, local2340 + (long) local1106);
				@Pc(2412) Class256 local2412 = local414[local1173];
				this.aShortArray25[local163] = this.method2365(local163, local2412.anInt7523, local1173, local1102, local2412.anInt7526, arg1, local1104, local2412.anInt7530, local2412.anInt7528, (long) local1108 + local2340);
			} else if (local1143 == 1) {
				@Pc(2447) Class355 local2447 = local698[local1025];
				@Pc(2492) long local2492 = (long) ((local2447.anInt9727 + 256 << 22) + (local728 << 2) + (local2447.anInt9723 > 0 ? 1024 : 2048) + (local2447.anInt9718 + 256 << 12)) + ((long) local739 + (long) (local1110 << 24) + (long) (local1032 << 8) << 32);
				this.aShortArray20[local163] = this.method2365(local163, local2447.anInt9718, arg1.aShortArray56[local1025], local1094, local2447.anInt9727, arg1, local1096, 0, local2447.anInt9723, local2492);
				this.aShortArray26[local163] = this.method2365(local163, local2447.anInt9718, arg1.aShortArray57[local1025], local1098, local2447.anInt9727, arg1, local1100, 0, local2447.anInt9723, local2492 + (long) local1106);
				this.aShortArray25[local163] = this.method2365(local163, local2447.anInt9718, arg1.aShortArray51[local1025], local1102, local2447.anInt9727, arg1, local1104, 0, local2447.anInt9723, local2492 + (long) local1108);
			}
			if (arg1.aByteArray34 != null) {
				this.aByteArray17[local163] = arg1.aByteArray34[local1025];
			}
			if (arg1.aShortArray49 != null) {
				this.aShortArray21[local163] = arg1.aShortArray49[local1025];
			}
			this.aShortArray16[local163] = arg1.aShortArray55[local1025];
			this.aShortArray27[local163] = local1068;
		}
		if (this.anInt2591 > 0) {
			local1025 = 1;
			local717 = this.aShortArray27[0];
			for (local728 = 0; local728 < this.anInt2591; local728++) {
				@Pc(2630) short local2630 = this.aShortArray27[local728];
				if (local2630 != local717) {
					local1025++;
					local717 = local2630;
				}
			}
			this.anIntArray134 = new int[local1025];
			this.anIntArray131 = new int[local1025 + 1];
			this.anIntArray136 = new int[local1025];
			this.anIntArray131[0] = 0;
			local739 = this.anInt2579;
			local1068 = 0;
			local717 = this.aShortArray27[0];
			local1025 = 0;
			for (local761 = 0; local761 < this.anInt2591; local761++) {
				@Pc(2689) short local2689 = this.aShortArray27[local761];
				if (local717 != local2689) {
					this.anIntArray134[local1025] = local739;
					this.anIntArray136[local1025] = local1068 + 1 - local739;
					local1025++;
					this.anIntArray131[local1025] = local761;
					local717 = local2689;
					local739 = this.anInt2579;
					local1068 = 0;
				}
				@Pc(2729) short local2729 = this.aShortArray20[local761];
				if (local2729 > local1068) {
					local1068 = local2729;
				}
				if (local739 > local2729) {
					local739 = local2729;
				}
				local2729 = this.aShortArray26[local761];
				if (local739 > local2729) {
					local739 = local2729;
				}
				if (local1068 < local2729) {
					local1068 = local2729;
				}
				local2729 = this.aShortArray25[local761];
				if (local739 > local2729) {
					local739 = local2729;
				}
				if (local2729 > local1068) {
					local1068 = local2729;
				}
			}
			this.anIntArray134[local1025] = local739;
			this.anIntArray136[local1025] = local1068 + 1 - local739;
			local1025++;
			this.anIntArray131[local1025] = this.anInt2591;
		}
		Static368.aLongArray15 = null;
		this.aShortArray15 = Static192.method2761(this.aShortArray15, this.anInt2579);
		this.aShortArray17 = Static192.method2761(this.aShortArray17, this.anInt2579);
		this.aShortArray24 = Static192.method2761(this.aShortArray24, this.anInt2579);
		this.aShortArray22 = Static192.method2761(this.aShortArray22, this.anInt2579);
		this.aShortArray19 = Static192.method2761(this.aShortArray19, this.anInt2579);
		this.aByteArray18 = Static266.method3770(this.anInt2579, this.aByteArray18);
		this.aFloatArray9 = Static465.method6885(this.anInt2579, this.aFloatArray9);
		this.aFloatArray10 = Static465.method6885(this.anInt2579, this.aFloatArray10);
		if (arg1.anIntArray226 != null && Static299.method4070(this.anInt2641, arg2)) {
			this.anIntArrayArray23 = arg1.method3281(false);
		}
		if (arg1.aClass261Array1 != null && Static167.method2462(this.anInt2641, arg2)) {
			this.anIntArrayArray22 = arg1.method3279();
		}
		if (arg1.anIntArray225 != null && Static598.method8099(this.anInt2641, arg2)) {
			local1025 = 0;
			@Pc(2921) int[] local2921 = new int[256];
			for (local728 = 0; local728 < this.anInt2632; local728++) {
				local739 = arg1.anIntArray225[local15[local728]];
				if (local739 >= 0) {
					if (local1025 < local739) {
						local1025 = local739;
					}
					@Pc(2947) int local2947 = local2921[local739]++;
				}
			}
			this.anIntArrayArray24 = new int[local1025 + 1][];
			for (local739 = 0; local739 <= local1025; local739++) {
				this.anIntArrayArray24[local739] = new int[local2921[local739]];
				local2921[local739] = 0;
			}
			for (local750 = 0; local750 < this.anInt2632; local750++) {
				local761 = arg1.anIntArray225[local15[local750]];
				if (local761 >= 0) {
					this.anIntArrayArray24[local761][local2921[local761]++] = local750;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!wk;IIZZ)V")
	public Class114_Sub1(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2579 = 0;
		this.aBoolean181 = false;
		this.aBoolean180 = true;
		this.anInt2591 = 0;
		this.anInt2628 = 0;
		this.anInt2631 = 0;
		this.aBoolean182 = false;
		this.aBoolean183 = false;
		this.anInt2632 = 0;
		this.aBoolean184 = false;
		this.anInt2641 = arg2;
		this.aClass143_Sub1_5 = arg0;
		this.anInt2599 = arg1;
		this.aBoolean184 = arg4;
		if (arg3 || Static221.method3131(this.anInt2641, this.anInt2599)) {
			this.aClass148_1 = new Class148(Static512.method7321(this.anInt2641, this.anInt2599));
		}
		if (arg3 || Static416.method6121(this.anInt2599, this.anInt2641)) {
			this.aClass148_4 = new Class148(Static235.method3368(this.anInt2599, this.anInt2641));
		}
		if (arg3 || Static166.method2455(this.anInt2599, this.anInt2641)) {
			this.aClass148_2 = new Class148(Static394.method5729(this.anInt2641, this.anInt2599));
		}
		if (arg3 || Static476.method7022(this.anInt2599, this.anInt2641)) {
			this.aClass148_3 = new Class148(Static536.method7429(this.anInt2641, this.anInt2599));
		}
		if (arg3 || Static359.method4146(this.anInt2599, this.anInt2641)) {
			this.aClass294_1 = new Class294(Static304.method4153(this.anInt2641, this.anInt2599));
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	private void method2350() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2631; local27++) {
			@Pc(34) int local34 = this.anIntArray133[local27];
			@Pc(39) int local39 = this.anIntArray130[local27];
			@Pc(44) int local44 = this.anIntArray135[local27];
			if (local39 < local9) {
				local9 = local39;
			}
			if (local13 < local34) {
				local13 = local34;
			}
			if (local7 > local34) {
				local7 = local34;
			}
			if (local15 < local39) {
				local15 = local39;
			}
			if (local11 > local44) {
				local11 = local44;
			}
			if (local17 < local44) {
				local17 = local44;
			}
			@Pc(94) int local94 = local34 * local34 + local44 * local44;
			if (local23 < local94) {
				local23 = local94;
			}
			local94 = local44 * local44 + local34 * local34 + local39 * local39;
			if (local94 > local25) {
				local25 = local94;
			}
		}
		this.anInt2623 = local15;
		this.anInt2618 = local17;
		this.lb = local13;
		this.anInt2637 = local11;
		this.anInt2626 = local7;
		this.anInt2565 = local9;
		this.anInt2634 = (int) (Math.sqrt((double) local23) + 0.99D);
		this.anInt2617 = (int) (Math.sqrt((double) local25) + 0.99D);
		this.aBoolean182 = true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z")
	private boolean method2351() {
		@Pc(18) boolean local18 = !this.aClass148_2.aBoolean246;
		@Pc(34) boolean local34 = (this.anInt2641 & 0x37) != 0 && !this.aClass148_3.aBoolean246;
		@Pc(42) boolean local42 = !this.aClass148_1.aBoolean246;
		@Pc(50) boolean local50 = !this.aClass148_4.aBoolean246;
		if (!local42 && !local18 && !local34 && !local50) {
			return true;
		}
		@Pc(62) boolean local62 = true;
		@Pc(81) Interface6 local81;
		@Pc(95) Buffer local95;
		if (local42) {
			if (this.aClass148_1.anInterface6_3 == null) {
				this.aClass148_1.anInterface6_3 = this.aClass143_Sub1_5.method6373(this.aBoolean184);
			}
			local81 = this.aClass148_1.anInterface6_3;
			local81.method3123(this.anInt2579 * 12, 12);
			local95 = local81.method3120();
			if (local95 == null) {
				local62 = false;
			} else {
				this.aClass143_Sub1_5.aNativeInterface3.copyPositions(this.anIntArray133, this.anIntArray130, this.anIntArray135, this.aShortArray15, 0, 12, this.anInt2579, local95.getAddress());
				if (local81.method3121()) {
					this.aClass148_1.anInterface6_2 = local81;
					this.aClass148_1.aBoolean246 = true;
				} else {
					local62 = false;
				}
			}
		}
		@Pc(184) short[] local184;
		@Pc(190) short[] local190;
		@Pc(193) short[] local193;
		@Pc(187) byte[] local187;
		if (local18) {
			if (this.aClass148_2.anInterface6_3 == null) {
				this.aClass148_2.anInterface6_3 = this.aClass143_Sub1_5.method6373(this.aBoolean184);
			}
			local81 = this.aClass148_2.anInterface6_3;
			local81.method3123(this.anInt2579 * 4, 4);
			local95 = local81.method3120();
			if (local95 == null) {
				local62 = false;
			} else {
				if ((this.anInt2641 & 0x37) == 0) {
					if (this.aClass375_1 == null) {
						local184 = this.aShortArray24;
						local187 = this.aByteArray18;
						local190 = this.aShortArray22;
						local193 = this.aShortArray19;
					} else {
						local193 = this.aClass375_1.aShortArray131;
						local184 = this.aClass375_1.aShortArray129;
						local187 = this.aClass375_1.aByteArray102;
						local190 = this.aClass375_1.aShortArray130;
					}
					this.aClass143_Sub1_5.aNativeInterface3.copyLighting(this.aShortArray16, this.aByteArray17, this.aShortArray27, local184, local190, local193, local187, this.aShort28, this.aShort29, this.aShortArray17, 0, 4, this.anInt2579, local95.getAddress());
				} else {
					this.aClass143_Sub1_5.aNativeInterface3.copyColours(this.aShortArray16, this.aByteArray17, this.aShortArray27, this.aShort28, this.aShortArray17, 0, 4, this.anInt2579, local95.getAddress());
				}
				if (local81.method3121()) {
					this.aClass148_2.aBoolean246 = true;
					this.aClass148_2.anInterface6_2 = local81;
				} else {
					local62 = false;
				}
			}
		}
		if (local34) {
			if (this.aClass148_3.anInterface6_3 == null) {
				this.aClass148_3.anInterface6_3 = this.aClass143_Sub1_5.method6373(this.aBoolean184);
			}
			local81 = this.aClass148_3.anInterface6_3;
			local81.method3123(this.anInt2579 * 12, 12);
			local95 = local81.method3120();
			if (local95 == null) {
				local62 = false;
			} else {
				if (this.aClass375_1 == null) {
					local190 = this.aShortArray22;
					local187 = this.aByteArray18;
					local184 = this.aShortArray24;
					local193 = this.aShortArray19;
				} else {
					local187 = this.aClass375_1.aByteArray102;
					local184 = this.aClass375_1.aShortArray129;
					local190 = this.aClass375_1.aShortArray130;
					local193 = this.aClass375_1.aShortArray131;
				}
				this.aClass143_Sub1_5.aNativeInterface3.copyNormals(local184, local190, local193, local187, 3.0F / (float) this.aShort29, 3.0F / (float) (this.aShort29 + this.aShort29 / 2), 0, 12, this.anInt2579, local95.getAddress());
				if (local81.method3121()) {
					this.aClass148_3.anInterface6_2 = local81;
					this.aClass148_3.aBoolean246 = true;
				} else {
					local62 = false;
				}
			}
		}
		if (local50) {
			if (this.aClass148_4.anInterface6_3 == null) {
				this.aClass148_4.anInterface6_3 = this.aClass143_Sub1_5.method6373(this.aBoolean184);
			}
			local81 = this.aClass148_4.anInterface6_3;
			local81.method3123(this.anInt2579 * 8, 8);
			local95 = local81.method3120();
			if (local95 == null) {
				local62 = false;
			} else {
				this.aClass143_Sub1_5.aNativeInterface3.copyTexCoords(this.aFloatArray9, this.aFloatArray10, 0, 8, this.anInt2579, local95.getAddress());
				if (local81.method3121()) {
					this.aClass148_4.aBoolean246 = true;
					this.aClass148_4.anInterface6_2 = local81;
				} else {
					local62 = false;
				}
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()[Lclient!nha;")
	@Override
	public Class244[] method8790() {
		return this.aClass244Array1;
	}

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class242.anIntArray384[arg0];
		@Pc(13) int local13 = Class242.anIntArray383[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2631; local15++) {
			local33 = this.anIntArray133[local15] * local13 + local9 * this.anIntArray135[local15] >> 14;
			this.anIntArray135[local15] = local13 * this.anIntArray135[local15] - this.anIntArray133[local15] * local9 >> 14;
			this.anIntArray133[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt2579; local33++) {
			@Pc(87) int local87 = local13 * this.aShortArray24[local33] + local9 * this.aShortArray19[local33] >> 14;
			this.aShortArray19[local33] = (short) (local13 * this.aShortArray19[local33] - this.aShortArray24[local33] * local9 >> 14);
			this.aShortArray24[local33] = (short) local87;
		}
		this.method2352();
		this.method2361();
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	private void method2352() {
		if (this.aClass148_1 != null) {
			this.aClass148_1.aBoolean246 = false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	private void method2353() {
		if (this.aClass222Array1 == null) {
			return;
		}
		this.aClass143_Sub1_5.C(!this.aBoolean181);
		this.aClass143_Sub1_5.method6288(false);
		this.aClass143_Sub1_5.method6290(Static85.aClass90_1, 1);
		this.aClass143_Sub1_5.method6391(1, Static85.aClass90_1);
		for (@Pc(34) int local34 = 0; local34 < this.anInt2593; local34++) {
			@Pc(41) Class222 local41 = this.aClass222Array1[local34];
			@Pc(46) Class98 local46 = this.aClass98Array1[local34];
			if (!local41.aBoolean453 || !this.aClass143_Sub1_5.method6224()) {
				@Pc(75) float local75 = (float) (this.anIntArray133[local41.anInt6181] + this.anIntArray133[local41.anInt6180] + this.anIntArray133[local41.anInt6176]) * 0.3333333F;
				@Pc(96) float local96 = (float) (this.anIntArray130[local41.anInt6176] + this.anIntArray130[local41.anInt6180] + this.anIntArray130[local41.anInt6181]) * 0.3333333F;
				@Pc(117) float local117 = (float) (this.anIntArray135[local41.anInt6180] + this.anIntArray135[local41.anInt6181] + this.anIntArray135[local41.anInt6176]) * 0.3333333F;
				@Pc(131) float local131 = local96 * Static361.aFloat120 + Static49.aFloat9 * local75 + Static12.aFloat199 * local117 + Static520.aFloat162;
				@Pc(145) float local145 = Static637.aFloat195 + local96 * Static543.aFloat168 + Static425.aFloat145 * local75 + local117 * Static71.aFloat28;
				@Pc(159) float local159 = local117 * Static34.aFloat6 + local96 * Static203.aFloat52 + Static515.aFloat56 * local75 + Static347.aFloat119;
				@Pc(180) float local180 = (float) (1.0D / Math.sqrt((double) (local131 * local131 + local145 * local145 + local159 * local159))) * (float) local41.anInt6179;
				@Pc(185) Class56_Sub2 local185 = this.aClass143_Sub1_5.method6349();
				local185.method6814(local145 + (float) local46.anInt2263 - local145 * local180, -(local159 * local180) + local159, local131 + (float) local46.anInt2256 - local180 * local131, local46.anInt2255 * local41.aShort83 >> 7, local41.aShort84 * local46.anInt2264 >> 7, local46.anInt2258);
				local185.method6819(this.aClass143_Sub1_5.aClass56_Sub2_17);
				this.aClass143_Sub1_5.method6356();
				@Pc(242) int local242 = local46.anInt2257;
				this.aClass143_Sub1_5.method6312(false, false, local41.aShort82);
				this.aClass143_Sub1_5.method6321(local41.aByte82);
				this.aClass143_Sub1_5.method6293(local242);
				this.aClass143_Sub1_5.method6352();
			}
		}
		this.aClass143_Sub1_5.method6391(1, Static85.aClass90_2);
		this.aClass143_Sub1_5.method6290(Static85.aClass90_2, 1);
		this.aClass143_Sub1_5.C(true);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()V")
	@Override
	protected void method8793() {
	}

	@OriginalMember(owner = "client!ff", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class242.anIntArray384[arg0];
		@Pc(13) int local13 = Class242.anIntArray383[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2631; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray133[local15] + local9 * this.anIntArray130[local15] >> 14;
			this.anIntArray130[local15] = this.anIntArray130[local15] * local13 - local9 * this.anIntArray133[local15] >> 14;
			this.anIntArray133[local15] = local33;
		}
		this.method2352();
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ff", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort29;
	}

	@OriginalMember(owner = "client!ff", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass143_Sub1_5.anInterface3_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt2632; local11++) {
			if (arg0 == this.aShortArray27[local11]) {
				this.aShortArray27[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class331 local44 = local9.method8501(arg0 & 0xFFFF);
			local31 = local44.aByte118;
			local33 = local44.aByte115;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(65) Class331 local65 = local9.method8501(arg1 & 0xFFFF);
			local52 = local65.aByte118;
			local54 = local65.aByte115;
			if (local65.aByte116 != 0 || local65.aByte113 != 0) {
				this.aBoolean183 = true;
			}
		}
		if (!(local31 != local52 | local33 != local54)) {
			return;
		}
		if (this.aClass222Array1 != null) {
			for (@Pc(113) int local113 = 0; local113 < this.anInt2593; local113++) {
				@Pc(120) Class222 local120 = this.aClass222Array1[local113];
				@Pc(125) Class98 local125 = this.aClass98Array1[local113];
				local125.anInt2257 = Static6.anIntArray6[this.aShortArray16[local120.anInt6182] & 0xFFFF] & 0xFFFFFF | local125.anInt2257 & 0xFF000000;
			}
		}
		this.method2360();
	}

	@OriginalMember(owner = "client!ff", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2628; local7++) {
			this.anIntArray133[local7] = this.anIntArray133[local7] + 7 >> 4;
			this.anIntArray130[local7] = this.anIntArray130[local7] + 7 >> 4;
			this.anIntArray135[local7] = this.anIntArray135[local7] + 7 >> 4;
		}
		this.method2352();
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!eh;)V")
	@Override
	public void method8811(@OriginalArg(0) Class56 arg0) {
		@Pc(8) Class56_Sub2 local8 = (Class56_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass244Array1 != null) {
			for (local13 = 0; local13 < this.aClass244Array1.length; local13++) {
				@Pc(20) Class244 local20 = this.aClass244Array1[local13];
				@Pc(22) Class244 local22 = local20;
				if (local20.aClass244_1 != null) {
					local22 = local20.aClass244_1;
				}
				local22.anInt6818 = (int) (local8.aFloat159 + (float) this.anIntArray135[local20.anInt6819] * local8.aFloat151 + (float) this.anIntArray133[local20.anInt6819] * local8.aFloat148 + (float) this.anIntArray130[local20.anInt6819] * local8.aFloat158);
				local22.anInt6823 = (int) (local8.aFloat157 * (float) this.anIntArray135[local20.anInt6819] + local8.aFloat156 * (float) this.anIntArray133[local20.anInt6819] + local8.aFloat149 * (float) this.anIntArray130[local20.anInt6819] + local8.aFloat152);
				local22.anInt6820 = (int) (local8.aFloat155 * (float) this.anIntArray135[local20.anInt6819] + (float) this.anIntArray130[local20.anInt6819] * local8.aFloat154 + (float) this.anIntArray133[local20.anInt6819] * local8.aFloat150 + local8.aFloat153);
				local22.anInt6812 = (int) (local8.aFloat159 + local8.aFloat158 * (float) this.anIntArray130[local20.anInt6816] + local8.aFloat148 * (float) this.anIntArray133[local20.anInt6816] + local8.aFloat151 * (float) this.anIntArray135[local20.anInt6816]);
				local22.anInt6811 = (int) ((float) this.anIntArray135[local20.anInt6816] * local8.aFloat157 + (float) this.anIntArray133[local20.anInt6816] * local8.aFloat156 + local8.aFloat149 * (float) this.anIntArray130[local20.anInt6816] + local8.aFloat152);
				local22.anInt6809 = (int) ((float) this.anIntArray130[local20.anInt6816] * local8.aFloat154 + (float) this.anIntArray133[local20.anInt6816] * local8.aFloat150 + local8.aFloat155 * (float) this.anIntArray135[local20.anInt6816] + local8.aFloat153);
				local22.anInt6807 = (int) ((float) this.anIntArray135[local20.anInt6817] * local8.aFloat151 + (float) this.anIntArray130[local20.anInt6817] * local8.aFloat158 + (float) this.anIntArray133[local20.anInt6817] * local8.aFloat148 + local8.aFloat159);
				local22.anInt6810 = (int) ((float) this.anIntArray130[local20.anInt6817] * local8.aFloat149 + local8.aFloat156 * (float) this.anIntArray133[local20.anInt6817] + local8.aFloat157 * (float) this.anIntArray135[local20.anInt6817] + local8.aFloat152);
				local22.anInt6813 = (int) (local8.aFloat153 + (float) this.anIntArray135[local20.anInt6817] * local8.aFloat155 + local8.aFloat154 * (float) this.anIntArray130[local20.anInt6817] + (float) this.anIntArray133[local20.anInt6817] * local8.aFloat150);
			}
		}
		if (this.aClass303Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass303Array1.length; local13++) {
			@Pc(365) Class303 local365 = this.aClass303Array1[local13];
			@Pc(367) Class303 local367 = local365;
			if (local365.aClass303_1 != null) {
				local367 = local365.aClass303_1;
			}
			if (local365.aClass56_12 == null) {
				local365.aClass56_12 = local8.method8394();
			} else {
				local365.aClass56_12.method8393(local8);
			}
			local367.anInt8518 = (int) (local8.aFloat159 + (float) this.anIntArray135[local365.anInt8513] * local8.aFloat151 + (float) this.anIntArray130[local365.anInt8513] * local8.aFloat158 + local8.aFloat148 * (float) this.anIntArray133[local365.anInt8513]);
			local367.anInt8520 = (int) (local8.aFloat152 + local8.aFloat156 * (float) this.anIntArray133[local365.anInt8513] + (float) this.anIntArray130[local365.anInt8513] * local8.aFloat149 + (float) this.anIntArray135[local365.anInt8513] * local8.aFloat157);
			local367.anInt8517 = (int) ((float) this.anIntArray135[local365.anInt8513] * local8.aFloat155 + local8.aFloat150 * (float) this.anIntArray133[local365.anInt8513] + (float) this.anIntArray130[local365.anInt8513] * local8.aFloat154 + local8.aFloat153);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8809(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static67.anInt1032 = 0;
			Static586.anInt9626 = 0;
			Static513.anInt8662 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray23.length > local41) {
					local51 = this.anIntArrayArray23[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static513.anInt8662 += this.anIntArray133[local59];
						Static586.anInt9626 += this.anIntArray130[local59];
						Static67.anInt1032 += this.anIntArray135[local59];
						local33++;
					}
				}
			}
			if (local33 > 0) {
				Static513.anInt8662 = Static513.anInt8662 / local33 + local17;
				Static67.anInt1032 = local21 + Static67.anInt1032 / local33;
				Static586.anInt9626 = Static586.anInt9626 / local33 + local25;
			} else {
				Static67.anInt1032 = local21;
				Static513.anInt8662 = local17;
				Static586.anInt9626 = local25;
			}
			return;
		}
		@Pc(163) int[] local163;
		@Pc(165) int local165;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local17 = arg2 << 4;
			local25 = arg3 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray23.length) {
					local163 = this.anIntArrayArray23[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local53 = local163[local165];
						this.anIntArray133[local53] += local17;
						this.anIntArray130[local53] += local25;
						this.anIntArray135[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(275) int local275;
		@Pc(294) int local294;
		@Pc(751) int local751;
		@Pc(760) int local760;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray23.length > local35) {
					local163 = this.anIntArrayArray23[local35];
					if ((arg5 & 0x1) == 0) {
						for (local165 = 0; local165 < local163.length; local165++) {
							local53 = local163[local165];
							this.anIntArray133[local53] -= Static513.anInt8662;
							this.anIntArray130[local53] -= Static586.anInt9626;
							this.anIntArray135[local53] -= Static67.anInt1032;
							if (arg4 != 0) {
								local59 = Class242.anIntArray384[arg4];
								local275 = Class242.anIntArray383[arg4];
								local294 = this.anIntArray130[local53] * local59 + this.anIntArray133[local53] * local275 + 16383 >> 14;
								this.anIntArray130[local53] = this.anIntArray130[local53] * local275 + 16383 - local59 * this.anIntArray133[local53] >> 14;
								this.anIntArray133[local53] = local294;
							}
							if (arg2 != 0) {
								local59 = Class242.anIntArray384[arg2];
								local275 = Class242.anIntArray383[arg2];
								local294 = this.anIntArray130[local53] * local275 + 16383 - local59 * this.anIntArray135[local53] >> 14;
								this.anIntArray135[local53] = this.anIntArray130[local53] * local59 + this.anIntArray135[local53] * local275 + 16383 >> 14;
								this.anIntArray130[local53] = local294;
							}
							if (arg3 != 0) {
								local59 = Class242.anIntArray384[arg3];
								local275 = Class242.anIntArray383[arg3];
								local294 = this.anIntArray133[local53] * local275 + local59 * this.anIntArray135[local53] + 16383 >> 14;
								this.anIntArray135[local53] = local275 * this.anIntArray135[local53] + 16383 - local59 * this.anIntArray133[local53] >> 14;
								this.anIntArray133[local53] = local294;
							}
							this.anIntArray133[local53] += Static513.anInt8662;
							this.anIntArray130[local53] += Static586.anInt9626;
							this.anIntArray135[local53] += Static67.anInt1032;
						}
					} else {
						for (local165 = 0; local165 < local163.length; local165++) {
							local53 = local163[local165];
							this.anIntArray133[local53] -= Static513.anInt8662;
							this.anIntArray130[local53] -= Static586.anInt9626;
							this.anIntArray135[local53] -= Static67.anInt1032;
							if (arg2 != 0) {
								local59 = Class242.anIntArray384[arg2];
								local275 = Class242.anIntArray383[arg2];
								local294 = local275 * this.anIntArray130[local53] + 16383 - local59 * this.anIntArray135[local53] >> 14;
								this.anIntArray135[local53] = local59 * this.anIntArray130[local53] + local275 * this.anIntArray135[local53] + 16383 >> 14;
								this.anIntArray130[local53] = local294;
							}
							if (arg4 != 0) {
								local59 = Class242.anIntArray384[arg4];
								local275 = Class242.anIntArray383[arg4];
								local294 = local275 * this.anIntArray133[local53] + local59 * this.anIntArray130[local53] + 16383 >> 14;
								this.anIntArray130[local53] = this.anIntArray130[local53] * local275 + 16383 - this.anIntArray133[local53] * local59 >> 14;
								this.anIntArray133[local53] = local294;
							}
							if (arg3 != 0) {
								local59 = Class242.anIntArray384[arg3];
								local275 = Class242.anIntArray383[arg3];
								local294 = this.anIntArray133[local53] * local275 + this.anIntArray135[local53] * local59 + 16383 >> 14;
								this.anIntArray135[local53] = local275 * this.anIntArray135[local53] + 16383 - local59 * this.anIntArray133[local53] >> 14;
								this.anIntArray133[local53] = local294;
							}
							this.anIntArray133[local53] += Static513.anInt8662;
							this.anIntArray130[local53] += Static586.anInt9626;
							this.anIntArray135[local53] += Static67.anInt1032;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray23.length) {
						local51 = this.anIntArrayArray23[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local275 = this.anIntArray132[local59];
							local294 = this.anIntArray132[local59 + 1];
							for (local751 = local275; local751 < local294; local751++) {
								local760 = this.aShortArray23[local751] - 1;
								if (local760 == -1) {
									break;
								}
								@Pc(769) int local769;
								@Pc(773) int local773;
								@Pc(791) int local791;
								if (arg4 != 0) {
									local769 = Class242.anIntArray384[arg4];
									local773 = Class242.anIntArray383[arg4];
									local791 = this.aShortArray22[local760] * local769 + this.aShortArray24[local760] * local773 + 16383 >> 14;
									this.aShortArray22[local760] = (short) (local773 * this.aShortArray22[local760] + 16383 - local769 * this.aShortArray24[local760] >> 14);
									this.aShortArray24[local760] = (short) local791;
								}
								if (arg2 != 0) {
									local769 = Class242.anIntArray384[arg2];
									local773 = Class242.anIntArray383[arg2];
									local791 = local773 * this.aShortArray22[local760] + 16383 - this.aShortArray19[local760] * local769 >> 14;
									this.aShortArray19[local760] = (short) (this.aShortArray19[local760] * local773 + this.aShortArray22[local760] * local769 + 16383 >> 14);
									this.aShortArray22[local760] = (short) local791;
								}
								if (arg3 != 0) {
									local769 = Class242.anIntArray384[arg3];
									local773 = Class242.anIntArray383[arg3];
									local791 = this.aShortArray24[local760] * local773 + local769 * this.aShortArray19[local760] + 16383 >> 14;
									this.aShortArray19[local760] = (short) (this.aShortArray19[local760] * local773 + 16383 - local769 * this.aShortArray24[local760] >> 14);
									this.aShortArray24[local760] = (short) local791;
								}
							}
						}
					}
				}
				this.method2361();
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray23.length > local35) {
					local163 = this.anIntArrayArray23[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local53 = local163[local165];
						this.anIntArray133[local53] -= Static513.anInt8662;
						this.anIntArray130[local53] -= Static586.anInt9626;
						this.anIntArray135[local53] -= Static67.anInt1032;
						this.anIntArray133[local53] = arg2 * this.anIntArray133[local53] >> 7;
						this.anIntArray130[local53] = this.anIntArray130[local53] * arg3 >> 7;
						this.anIntArray135[local53] = arg4 * this.anIntArray135[local53] >> 7;
						this.anIntArray133[local53] += Static513.anInt8662;
						this.anIntArray130[local53] += Static586.anInt9626;
						this.anIntArray135[local53] += Static67.anInt1032;
					}
				}
			}
		} else {
			@Pc(1195) Class98 local1195;
			@Pc(1090) boolean local1090;
			@Pc(1190) Class222 local1190;
			if (arg0 == 5) {
				if (this.anIntArrayArray24 != null) {
					local1090 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray24.length) {
							local51 = this.anIntArrayArray24[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local275 = (this.aByteArray17[local59] & 0xFF) + (arg2 * 8);
								if (local275 < 0) {
									local275 = 0;
								} else if (local275 > 255) {
									local275 = 255;
								}
								this.aByteArray17[local59] = (byte) local275;
							}
							local1090 |= local51.length > 0;
						}
					}
					if (local1090) {
						if (this.aClass222Array1 != null) {
							for (local41 = 0; local41 < this.anInt2593; local41++) {
								local1190 = this.aClass222Array1[local41];
								local1195 = this.aClass98Array1[local41];
								local1195.anInt2257 = 255 - (this.aByteArray17[local1190.anInt6182] & 0xFF) << 24 | local1195.anInt2257 & 0xFFFFFF;
							}
						}
						this.method2360();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray24 != null) {
					local1090 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray24.length) {
							local51 = this.anIntArrayArray24[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local275 = this.aShortArray16[local59] & 0xFFFF;
								local294 = local275 >> 10 & 0x3F;
								local751 = local275 >> 7 & 0x7;
								local751 += arg3 / 4;
								local760 = local275 & 0x7F;
								@Pc(1300) int local1300 = arg2 + local294 & 0x3F;
								if (local751 < 0) {
									local751 = 0;
								} else if (local751 > 7) {
									local751 = 7;
								}
								local760 += arg4;
								if (local760 < 0) {
									local760 = 0;
								} else if (local760 > 127) {
									local760 = 127;
								}
								this.aShortArray16[local59] = (short) (local751 << 7 | local1300 << 10 | local760);
							}
							local1090 |= local51.length > 0;
						}
					}
					if (local1090) {
						if (this.aClass222Array1 != null) {
							for (local41 = 0; local41 < this.anInt2593; local41++) {
								local1190 = this.aClass222Array1[local41];
								local1195 = this.aClass98Array1[local41];
								local1195.anInt2257 = local1195.anInt2257 & 0xFF000000 | Static6.anIntArray6[this.aShortArray16[local1190.anInt6182] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method2360();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray22 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray22.length > local35) {
							local163 = this.anIntArrayArray22[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1195 = this.aClass98Array1[local163[local165]];
								local1195.anInt2256 += arg2;
								local1195.anInt2263 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray22 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray22.length) {
							local163 = this.anIntArrayArray22[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1195 = this.aClass98Array1[local163[local165]];
								local1195.anInt2255 = local1195.anInt2255 * arg3 >> 7;
								local1195.anInt2264 = arg2 * local1195.anInt2264 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray22 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray22.length) {
						local163 = this.anIntArrayArray22[local35];
						for (local165 = 0; local165 < local163.length; local165++) {
							local1195 = this.aClass98Array1[local163[local165]];
							local1195.anInt2258 = arg2 + local1195.anInt2258 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean182) {
			this.method2350();
		}
		return this.anInt2623;
	}

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static586.anInt9626 = 0;
			local29 = 0;
			Static67.anInt1032 = 0;
			Static513.anInt8662 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray23.length) {
					local55 = this.anIntArrayArray23[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray18 == null || (this.aShortArray18[local63] & arg6) != 0) {
							Static513.anInt8662 += this.anIntArray133[local63];
							Static586.anInt9626 += this.anIntArray130[local63];
							local29++;
							Static67.anInt1032 += this.anIntArray135[local63];
						}
					}
				}
			}
			if (local29 <= 0) {
				Static513.anInt8662 = arg2;
				Static586.anInt9626 = arg3;
				Static67.anInt1032 = arg4;
			} else {
				Static42.aBoolean28 = true;
				Static586.anInt9626 = arg3 + Static586.anInt9626 / local29;
				Static513.anInt8662 = Static513.anInt8662 / local29 + arg2;
				Static67.anInt1032 = Static67.anInt1032 / local29 + arg4;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[2] * arg4 + arg3 * arg7[1] + arg2 * arg7[0] + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg2 * arg7[3] + arg7[5] * arg4 + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg7[7] * arg3 + arg2 * arg7[6] + 8192 >> 14;
				arg3 = local35;
				arg4 = local41;
				arg2 = local29;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray23.length) {
					local253 = this.anIntArrayArray23[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray18 == null || (this.aShortArray18[local57] & arg6) != 0) {
							this.anIntArray133[local57] += arg2;
							this.anIntArray130[local57] += arg3;
							this.anIntArray135[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(383) int local383;
		@Pc(405) int local405;
		@Pc(435) int local435;
		@Pc(462) int local462;
		@Pc(466) int local466;
		@Pc(470) int local470;
		@Pc(474) int local474;
		@Pc(482) int local482;
		@Pc(490) int local490;
		@Pc(645) int local645;
		@Pc(671) int local671;
		@Pc(675) int local675;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(696) int local696;
		@Pc(698) int local698;
		@Pc(829) int[] local829;
		@Pc(831) int local831;
		@Pc(835) int local835;
		@Pc(839) int local839;
		@Pc(841) int local841;
		@Pc(969) int local969;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray23.length > local35) {
						local253 = this.anIntArrayArray23[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local57 = local253[local255];
							if (this.aShortArray18 == null || (arg6 & this.aShortArray18[local57]) != 0) {
								this.anIntArray133[local57] -= Static513.anInt8662;
								this.anIntArray130[local57] -= Static586.anInt9626;
								this.anIntArray135[local57] -= Static67.anInt1032;
								if (arg4 != 0) {
									local63 = Class242.anIntArray384[arg4];
									local383 = Class242.anIntArray383[arg4];
									local405 = this.anIntArray130[local57] * local63 + local383 * this.anIntArray133[local57] + 16383 >> 14;
									this.anIntArray130[local57] = this.anIntArray130[local57] * local383 + 16383 - this.anIntArray133[local57] * local63 >> 14;
									this.anIntArray133[local57] = local405;
								}
								if (arg2 != 0) {
									local63 = Class242.anIntArray384[arg2];
									local383 = Class242.anIntArray383[arg2];
									local405 = local383 * this.anIntArray130[local57] + 16383 - this.anIntArray135[local57] * local63 >> 14;
									this.anIntArray135[local57] = local63 * this.anIntArray130[local57] + this.anIntArray135[local57] * local383 + 16383 >> 14;
									this.anIntArray130[local57] = local405;
								}
								if (arg3 != 0) {
									local63 = Class242.anIntArray384[arg3];
									local383 = Class242.anIntArray383[arg3];
									local405 = this.anIntArray135[local57] * local63 + this.anIntArray133[local57] * local383 + 16383 >> 14;
									this.anIntArray135[local57] = local383 * this.anIntArray135[local57] + 16383 - this.anIntArray133[local57] * local63 >> 14;
									this.anIntArray133[local57] = local405;
								}
								this.anIntArray133[local57] += Static513.anInt8662;
								this.anIntArray130[local57] += Static586.anInt9626;
								this.anIntArray135[local57] += Static67.anInt1032;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray23.length) {
							local55 = this.anIntArrayArray23[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray18 == null || (this.aShortArray18[local63] & arg6) != 0) {
									local383 = this.anIntArray132[local63];
									local405 = this.anIntArray132[local63 + 1];
									for (local435 = local383; local435 < local405; local435++) {
										local462 = this.aShortArray23[local435] - 1;
										if (local462 == -1) {
											break;
										}
										if (arg4 != 0) {
											local466 = Class242.anIntArray384[arg4];
											local470 = Class242.anIntArray383[arg4];
											local474 = local466 * this.aShortArray22[local462] + this.aShortArray24[local462] * local470 + 16383 >> 14;
											this.aShortArray22[local462] = (short) (local470 * this.aShortArray22[local462] + 16383 - this.aShortArray24[local462] * local466 >> 14);
											this.aShortArray24[local462] = (short) local474;
										}
										if (arg2 != 0) {
											local466 = Class242.anIntArray384[arg2];
											local470 = Class242.anIntArray383[arg2];
											local474 = local470 * this.aShortArray22[local462] + 16383 - local466 * this.aShortArray19[local462] >> 14;
											this.aShortArray19[local462] = (short) (this.aShortArray19[local462] * local470 + local466 * this.aShortArray22[local462] + 16383 >> 14);
											this.aShortArray22[local462] = (short) local474;
										}
										if (arg3 != 0) {
											local466 = Class242.anIntArray384[arg3];
											local470 = Class242.anIntArray383[arg3];
											local474 = this.aShortArray24[local462] * local470 + this.aShortArray19[local462] * local466 + 16383 >> 14;
											this.aShortArray19[local462] = (short) (this.aShortArray19[local462] * local470 + 16383 - local466 * this.aShortArray24[local462] >> 14);
											this.aShortArray24[local462] = (short) local474;
										}
									}
								}
							}
						}
					}
					this.method2361();
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static42.aBoolean28) {
					local383 = arg7[0] * Static513.anInt8662 + arg7[3] * Static586.anInt9626 + Static67.anInt1032 * arg7[6] + 8192 >> 14;
					local405 = Static67.anInt1032 * arg7[7] + arg7[4] * Static586.anInt9626 + Static513.anInt8662 * arg7[1] + 8192 >> 14;
					local383 += local255;
					local405 += local57;
					local435 = arg7[5] * Static586.anInt9626 + arg7[2] * Static513.anInt8662 + Static67.anInt1032 * arg7[8] + 8192 >> 14;
					Static586.anInt9626 = local405;
					local435 += local63;
					Static513.anInt8662 = local383;
					Static67.anInt1032 = local435;
					Static42.aBoolean28 = false;
				}
				@Pc(450) int[] local450 = new int[9];
				local405 = Class242.anIntArray383[arg2];
				local435 = Class242.anIntArray384[arg2];
				local462 = Class242.anIntArray383[arg3];
				local466 = Class242.anIntArray384[arg3];
				local470 = Class242.anIntArray383[arg4];
				local474 = Class242.anIntArray384[arg4];
				local482 = local435 * local470 + 8192 >> 14;
				local490 = local435 * local474 + 8192 >> 14;
				local450[6] = local470 * -local466 + local462 * local490 + 8192 >> 14;
				local450[0] = local490 * local466 + local470 * local462 + 8192 >> 14;
				local450[5] = -local435;
				local450[4] = local405 * local470 + 8192 >> 14;
				local450[7] = local482 * local462 + local474 * local466 + 8192 >> 14;
				local450[1] = local466 * local482 + local474 * -local462 + 8192 >> 14;
				local450[2] = local405 * local466 + 8192 >> 14;
				local450[3] = local405 * local474 + 8192 >> 14;
				local450[8] = local405 * local462 + 8192 >> 14;
				@Pc(620) int local620 = -Static513.anInt8662 * local450[0] + -Static586.anInt9626 * local450[1] + local450[2] * -Static67.anInt1032 + 8192 >> 14;
				local645 = -Static586.anInt9626 * local450[4] + -Static513.anInt8662 * local450[3] + -Static67.anInt1032 * local450[5] + 8192 >> 14;
				local671 = -Static67.anInt1032 * local450[8] + -Static513.anInt8662 * local450[6] + -Static586.anInt9626 * local450[7] + 8192 >> 14;
				local675 = Static513.anInt8662 + local620;
				@Pc(679) int local679 = Static586.anInt9626 + local645;
				local683 = local671 + Static67.anInt1032;
				@Pc(686) int[] local686 = new int[9];
				for (local688 = 0; local688 < 3; local688++) {
					for (local692 = 0; local692 < 3; local692++) {
						local696 = 0;
						for (local698 = 0; local698 < 3; local698++) {
							local696 += local450[local698 + local688 * 3] * arg7[local698 + local692 * 3];
						}
						local686[local692 + local688 * 3] = local696 + 8192 >> 14;
					}
				}
				local692 = local450[2] * local63 + local450[0] * local255 + local57 * local450[1] + 8192 >> 14;
				local696 = local255 * local450[3] + local57 * local450[4] + local450[5] * local63 + 8192 >> 14;
				local698 = local255 * local450[6] + local450[7] * local57 + local450[8] * local63 + 8192 >> 14;
				local696 += local679;
				local692 += local675;
				local698 += local683;
				local829 = new int[9];
				for (local831 = 0; local831 < 3; local831++) {
					for (local835 = 0; local835 < 3; local835++) {
						local839 = 0;
						for (local841 = 0; local841 < 3; local841++) {
							local839 += local686[local841 * 3 + local835] * arg7[local841 + local831 * 3];
						}
						local829[local831 * 3 + local835] = local839 + 8192 >> 14;
					}
				}
				local835 = arg7[2] * local698 + local692 * arg7[0] + local696 * arg7[1] + 8192 >> 14;
				local839 = arg7[5] * local698 + arg7[3] * local692 + arg7[4] * local696 + 8192 >> 14;
				local839 += local35;
				local841 = arg7[8] * local698 + arg7[6] * local692 + arg7[7] * local696 + 8192 >> 14;
				local835 += local29;
				local841 += local41;
				for (local969 = 0; local969 < local8; local969++) {
					@Pc(975) int local975 = arg1[local969];
					if (this.anIntArrayArray23.length > local975) {
						@Pc(985) int[] local985 = this.anIntArrayArray23[local975];
						for (@Pc(987) int local987 = 0; local987 < local985.length; local987++) {
							@Pc(993) int local993 = local985[local987];
							if (this.aShortArray18 == null || (arg6 & this.aShortArray18[local993]) != 0) {
								@Pc(1035) int local1035 = this.anIntArray130[local993] * local829[1] + this.anIntArray133[local993] * local829[0] + this.anIntArray135[local993] * local829[2] + 8192 >> 14;
								@Pc(1067) int local1067 = this.anIntArray133[local993] * local829[3] + this.anIntArray130[local993] * local829[4] + local829[5] * this.anIntArray135[local993] + 8192 >> 14;
								@Pc(1071) int local1071 = local1067 + local839;
								@Pc(1103) int local1103 = local829[8] * this.anIntArray135[local993] + local829[6] * this.anIntArray133[local993] + this.anIntArray130[local993] * local829[7] + 8192 >> 14;
								@Pc(1107) int local1107 = local1035 + local835;
								this.anIntArray133[local993] = local1107;
								@Pc(1116) int local1116 = local1103 + local841;
								this.anIntArray130[local993] = local1071;
								this.anIntArray135[local993] = local1116;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2593) Class98 local2593;
			@Pc(2483) boolean local2483;
			@Pc(2588) Class222 local2588;
			if (arg0 == 5) {
				if (this.anIntArrayArray24 != null) {
					local2483 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray24.length > local41) {
							local55 = this.anIntArrayArray24[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local63]) != 0) {
									local383 = arg2 * 8 + (this.aByteArray17[local63] & 0xFF);
									if (local383 < 0) {
										local383 = 0;
									} else if (local383 > 255) {
										local383 = 255;
									}
									this.aByteArray17[local63] = (byte) local383;
								}
							}
							local2483 |= local55.length > 0;
						}
					}
					if (local2483) {
						if (this.aClass222Array1 != null) {
							for (local41 = 0; local41 < this.anInt2593; local41++) {
								local2588 = this.aClass222Array1[local41];
								local2593 = this.aClass98Array1[local41];
								local2593.anInt2257 = 255 - (this.aByteArray17[local2588.anInt6182] & 0xFF) << 24 | local2593.anInt2257 & 0xFFFFFF;
							}
						}
						this.method2360();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray24 != null) {
					local2483 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray24.length > local41) {
							local55 = this.anIntArrayArray24[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray21 == null || (this.aShortArray21[local63] & arg6) != 0) {
									local383 = this.aShortArray16[local63] & 0xFFFF;
									local405 = local383 >> 10 & 0x3F;
									local435 = local383 >> 7 & 0x7;
									local435 += arg3 / 4;
									local462 = local383 & 0x7F;
									@Pc(2701) int local2701 = arg2 + local405 & 0x3F;
									if (local435 < 0) {
										local435 = 0;
									} else if (local435 > 7) {
										local435 = 7;
									}
									local462 += arg4;
									if (local462 < 0) {
										local462 = 0;
									} else if (local462 > 127) {
										local462 = 127;
									}
									this.aShortArray16[local63] = (short) (local435 << 7 | local2701 << 10 | local462);
								}
							}
							local2483 |= local55.length > 0;
						}
					}
					if (local2483) {
						if (this.aClass222Array1 != null) {
							for (local41 = 0; local41 < this.anInt2593; local41++) {
								local2588 = this.aClass222Array1[local41];
								local2593 = this.aClass98Array1[local41];
								local2593.anInt2257 = local2593.anInt2257 & 0xFF000000 | Static6.anIntArray6[this.aShortArray16[local2588.anInt6182] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method2360();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray22 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray22.length > local35) {
							local253 = this.anIntArrayArray22[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2593 = this.aClass98Array1[local253[local255]];
								local2593.anInt2256 += arg2;
								local2593.anInt2263 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray22 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray22.length) {
							local253 = this.anIntArrayArray22[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2593 = this.aClass98Array1[local253[local255]];
								local2593.anInt2264 = arg2 * local2593.anInt2264 >> 7;
								local2593.anInt2255 = arg3 * local2593.anInt2255 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray22 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray22.length) {
						local253 = this.anIntArrayArray22[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local2593 = this.aClass98Array1[local253[local255]];
							local2593.anInt2258 = local2593.anInt2258 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray23.length) {
					local253 = this.anIntArrayArray23[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray18 == null || (this.aShortArray18[local57] & arg6) != 0) {
							this.anIntArray133[local57] -= Static513.anInt8662;
							this.anIntArray130[local57] -= Static586.anInt9626;
							this.anIntArray135[local57] -= Static67.anInt1032;
							this.anIntArray133[local57] = arg2 * this.anIntArray133[local57] >> 7;
							this.anIntArray130[local57] = this.anIntArray130[local57] * arg3 >> 7;
							this.anIntArray135[local57] = this.anIntArray135[local57] * arg4 >> 7;
							this.anIntArray133[local57] += Static513.anInt8662;
							this.anIntArray130[local57] += Static586.anInt9626;
							this.anIntArray135[local57] += Static67.anInt1032;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static42.aBoolean28) {
				local383 = arg7[0] * Static513.anInt8662 + Static586.anInt9626 * arg7[3] + arg7[6] * Static67.anInt1032 + 8192 >> 14;
				local405 = Static513.anInt8662 * arg7[1] + arg7[4] * Static586.anInt9626 + arg7[7] * Static67.anInt1032 + 8192 >> 14;
				local405 += local57;
				local435 = arg7[8] * Static67.anInt1032 + Static513.anInt8662 * arg7[2] + Static586.anInt9626 * arg7[5] + 8192 >> 14;
				local383 += local255;
				local435 += local63;
				Static586.anInt9626 = local405;
				Static513.anInt8662 = local383;
				Static42.aBoolean28 = false;
				Static67.anInt1032 = local435;
			}
			local383 = arg2 << 15 >> 7;
			local405 = arg3 << 15 >> 7;
			local435 = arg4 << 15 >> 7;
			local462 = -Static513.anInt8662 * local383 + 8192 >> 14;
			local466 = local405 * -Static586.anInt9626 + 8192 >> 14;
			local470 = local435 * -Static67.anInt1032 + 8192 >> 14;
			local474 = local462 + Static513.anInt8662;
			local482 = Static586.anInt9626 + local466;
			local490 = Static67.anInt1032 + local470;
			@Pc(2013) int[] local2013 = new int[] { arg7[0] * local383 + 8192 >> 14, local383 * arg7[3] + 8192 >> 14, arg7[6] * local383 + 8192 >> 14, arg7[1] * local405 + 8192 >> 14, local405 * arg7[4] + 8192 >> 14, arg7[7] * local405 + 8192 >> 14, local435 * arg7[2] + 8192 >> 14, local435 * arg7[5] + 8192 >> 14, local435 * arg7[8] + 8192 >> 14 };
			local645 = local383 * local255 + 8192 >> 14;
			local671 = local57 * local405 + 8192 >> 14;
			@Pc(2141) int local2141 = local671 + local482;
			local675 = local435 * local63 + 8192 >> 14;
			@Pc(2153) int local2153 = local645 + local474;
			@Pc(2157) int local2157 = local675 + local490;
			@Pc(2160) int[] local2160 = new int[9];
			@Pc(2166) int local2166;
			for (local683 = 0; local683 < 3; local683++) {
				for (local2166 = 0; local2166 < 3; local2166++) {
					local688 = 0;
					for (local692 = 0; local692 < 3; local692++) {
						local688 += arg7[local683 * 3 + local692] * local2013[local692 * 3 + local2166];
					}
					local2160[local683 * 3 + local2166] = local688 + 8192 >> 14;
				}
			}
			local2166 = local2157 * arg7[2] + local2153 * arg7[0] + arg7[1] * local2141 + 8192 >> 14;
			local688 = arg7[5] * local2157 + local2141 * arg7[4] + arg7[3] * local2153 + 8192 >> 14;
			local692 = local2157 * arg7[8] + arg7[7] * local2141 + local2153 * arg7[6] + 8192 >> 14;
			local688 += local35;
			local2166 += local29;
			local692 += local41;
			for (local696 = 0; local696 < local8; local696++) {
				local698 = arg1[local696];
				if (this.anIntArrayArray23.length > local698) {
					local829 = this.anIntArrayArray23[local698];
					for (local831 = 0; local831 < local829.length; local831++) {
						local835 = local829[local831];
						if (this.aShortArray18 == null || (this.aShortArray18[local835] & arg6) != 0) {
							local839 = this.anIntArray135[local835] * local2160[2] + this.anIntArray130[local835] * local2160[1] + local2160[0] * this.anIntArray133[local835] + 8192 >> 14;
							local841 = this.anIntArray135[local835] * local2160[5] + local2160[3] * this.anIntArray133[local835] + local2160[4] * this.anIntArray130[local835] + 8192 >> 14;
							@Pc(2408) int local2408 = local841 + local688;
							@Pc(2412) int local2412 = local839 + local2166;
							local969 = this.anIntArray133[local835] * local2160[6] + this.anIntArray130[local835] * local2160[7] + this.anIntArray135[local835] * local2160[8] + 8192 >> 14;
							this.anIntArray133[local835] = local2412;
							@Pc(2453) int local2453 = local969 + local692;
							this.anIntArray130[local835] = local2408;
							this.anIntArray135[local835] = local2453;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean182) {
			this.method2350();
		}
		return this.anInt2617;
	}

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean183;
	}

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static586.anInt9626 = 0;
			Static67.anInt1032 = 0;
			local16 = 0;
			Static513.anInt8662 = 0;
			for (local20 = 0; local20 < this.anInt2631; local20++) {
				Static513.anInt8662 += this.anIntArray133[local20];
				Static586.anInt9626 += this.anIntArray130[local20];
				Static67.anInt1032 += this.anIntArray135[local20];
				local16++;
			}
			if (local16 <= 0) {
				Static513.anInt8662 = arg1;
				Static67.anInt1032 = arg3;
				Static586.anInt9626 = arg2;
			} else {
				Static67.anInt1032 = arg3 + Static67.anInt1032 / local16;
				Static586.anInt9626 = Static586.anInt9626 / local16 + arg2;
				Static513.anInt8662 = arg1 + Static513.anInt8662 / local16;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt2631; local16++) {
				this.anIntArray133[local16] += arg1;
				this.anIntArray130[local16] += arg2;
				this.anIntArray135[local16] += arg3;
			}
		} else {
			@Pc(168) int local168;
			@Pc(186) int local186;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt2631; local16++) {
					this.anIntArray133[local16] -= Static513.anInt8662;
					this.anIntArray130[local16] -= Static586.anInt9626;
					this.anIntArray135[local16] -= Static67.anInt1032;
					if (arg3 != 0) {
						local20 = Class242.anIntArray384[arg3];
						local168 = Class242.anIntArray383[arg3];
						local186 = this.anIntArray133[local16] * local168 + local20 * this.anIntArray130[local16] + 16383 >> 14;
						this.anIntArray130[local16] = this.anIntArray130[local16] * local168 + 16383 - this.anIntArray133[local16] * local20 >> 14;
						this.anIntArray133[local16] = local186;
					}
					if (arg1 != 0) {
						local20 = Class242.anIntArray384[arg1];
						local168 = Class242.anIntArray383[arg1];
						local186 = local168 * this.anIntArray130[local16] + 16383 - local20 * this.anIntArray135[local16] >> 14;
						this.anIntArray135[local16] = this.anIntArray135[local16] * local168 + local20 * this.anIntArray130[local16] + 16383 >> 14;
						this.anIntArray130[local16] = local186;
					}
					if (arg2 != 0) {
						local20 = Class242.anIntArray384[arg2];
						local168 = Class242.anIntArray383[arg2];
						local186 = local168 * this.anIntArray133[local16] + this.anIntArray135[local16] * local20 + 16383 >> 14;
						this.anIntArray135[local16] = this.anIntArray135[local16] * local168 + 16383 - this.anIntArray133[local16] * local20 >> 14;
						this.anIntArray133[local16] = local186;
					}
					this.anIntArray133[local16] += Static513.anInt8662;
					this.anIntArray130[local16] += Static586.anInt9626;
					this.anIntArray135[local16] += Static67.anInt1032;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt2631; local16++) {
					this.anIntArray133[local16] -= Static513.anInt8662;
					this.anIntArray130[local16] -= Static586.anInt9626;
					this.anIntArray135[local16] -= Static67.anInt1032;
					this.anIntArray133[local16] = arg1 * this.anIntArray133[local16] / 128;
					this.anIntArray130[local16] = arg2 * this.anIntArray130[local16] / 128;
					this.anIntArray135[local16] = this.anIntArray135[local16] * arg3 / 128;
					this.anIntArray133[local16] += Static513.anInt8662;
					this.anIntArray130[local16] += Static586.anInt9626;
					this.anIntArray135[local16] += Static67.anInt1032;
				}
			} else {
				@Pc(517) Class222 local517;
				@Pc(522) Class98 local522;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt2632; local16++) {
						local20 = arg1 * 8 + (this.aByteArray17[local16] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray17[local16] = (byte) local20;
					}
					if (this.aClass222Array1 != null) {
						for (local20 = 0; local20 < this.anInt2593; local20++) {
							local517 = this.aClass222Array1[local20];
							local522 = this.aClass98Array1[local20];
							local522.anInt2257 = local522.anInt2257 & 0xFFFFFF | 255 - (this.aByteArray17[local517.anInt6182] & 0xFF) << 24;
						}
					}
					this.method2360();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt2632; local16++) {
						local20 = this.aShortArray16[local16] & 0xFFFF;
						local168 = local20 >> 10 & 0x3F;
						local186 = local20 >> 7 & 0x7;
						@Pc(586) int local586 = local20 & 0x7F;
						@Pc(593) int local593 = local168 + arg1 & 0x3F;
						local186 += arg2 / 4;
						if (local186 < 0) {
							local186 = 0;
						} else if (local186 > 7) {
							local186 = 7;
						}
						local586 += arg3;
						if (local586 < 0) {
							local586 = 0;
						} else if (local586 > 127) {
							local586 = 127;
						}
						this.aShortArray16[local16] = (short) (local586 | local593 << 10 | local186 << 7);
					}
					if (this.aClass222Array1 != null) {
						for (local20 = 0; local20 < this.anInt2593; local20++) {
							local517 = this.aClass222Array1[local20];
							local522 = this.aClass98Array1[local20];
							local522.anInt2257 = local522.anInt2257 & 0xFF000000 | Static6.anIntArray6[this.aShortArray16[local517.anInt6182] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method2360();
				} else {
					@Pc(700) Class98 local700;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt2593; local16++) {
							local700 = this.aClass98Array1[local16];
							local700.anInt2256 += arg1;
							local700.anInt2263 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt2593; local16++) {
							local700 = this.aClass98Array1[local16];
							local700.anInt2264 = arg1 * local700.anInt2264 >> 7;
							local700.anInt2255 = arg2 * local700.anInt2255 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt2593; local16++) {
							local700 = this.aClass98Array1[local16];
							local700.anInt2258 = arg1 + local700.anInt2258 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2631; local7++) {
			if (arg0 != 0) {
				this.anIntArray133[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray130[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray135[local7] += arg2;
			}
		}
		this.method2352();
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8791(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class114_Sub1 local8 = (Class114_Sub1) arg0;
		if (this.anInt2632 == 0 || local8.anInt2632 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt2631;
		@Pc(27) int[] local27 = local8.anIntArray133;
		@Pc(30) int[] local30 = local8.anIntArray130;
		@Pc(33) int[] local33 = local8.anIntArray135;
		@Pc(36) short[] local36 = local8.aShortArray24;
		@Pc(39) short[] local39 = local8.aShortArray22;
		@Pc(42) short[] local42 = local8.aShortArray19;
		@Pc(45) byte[] local45 = local8.aByteArray18;
		@Pc(56) short[] local56;
		@Pc(64) short[] local64;
		@Pc(52) short[] local52;
		@Pc(60) byte[] local60;
		if (this.aClass375_1 == null) {
			local64 = null;
			local60 = null;
			local52 = null;
			local56 = null;
		} else {
			local52 = this.aClass375_1.aShortArray131;
			local56 = this.aClass375_1.aShortArray129;
			local60 = this.aClass375_1.aByteArray102;
			local64 = this.aClass375_1.aShortArray130;
		}
		@Pc(89) short[] local89;
		@Pc(93) short[] local93;
		@Pc(81) short[] local81;
		@Pc(85) byte[] local85;
		if (local8.aClass375_1 == null) {
			local85 = null;
			local81 = null;
			local93 = null;
			local89 = null;
		} else {
			local81 = local8.aClass375_1.aShortArray131;
			local85 = local8.aClass375_1.aByteArray102;
			local89 = local8.aClass375_1.aShortArray129;
			local93 = local8.aClass375_1.aShortArray130;
		}
		@Pc(106) int[] local106 = local8.anIntArray132;
		@Pc(109) short[] local109 = local8.aShortArray23;
		if (!local8.aBoolean182) {
			local8.method2350();
		}
		@Pc(118) int local118 = local8.anInt2565;
		@Pc(121) int local121 = local8.anInt2623;
		@Pc(124) int local124 = local8.anInt2626;
		@Pc(127) int local127 = local8.lb;
		@Pc(130) int local130 = local8.anInt2637;
		@Pc(133) int local133 = local8.anInt2618;
		for (@Pc(135) int local135 = 0; local135 < this.anInt2631; local135++) {
			@Pc(145) int local145 = this.anIntArray130[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(168) int local168 = this.anIntArray133[local135] - arg1;
				if (local168 >= local124 && local168 <= local127) {
					@Pc(187) int local187 = this.anIntArray135[local135] - arg3;
					if (local187 >= local130 && local133 >= local187) {
						@Pc(197) int local197 = -1;
						@Pc(202) int local202 = this.anIntArray132[local135];
						@Pc(209) int local209 = this.anIntArray132[local135 + 1];
						for (@Pc(211) int local211 = local202; local211 < local209; local211++) {
							local197 = this.aShortArray23[local211] - 1;
							if (local197 == -1 || this.aByteArray18[local197] != 0) {
								break;
							}
						}
						if (local197 != -1) {
							for (@Pc(244) int local244 = 0; local244 < local24; local244++) {
								if (local168 == local27[local244] && local33[local244] == local187 && local145 == local30[local244]) {
									local202 = local106[local244];
									@Pc(271) int local271 = -1;
									local209 = local106[local244 + 1];
									for (@Pc(279) int local279 = local202; local279 < local209; local279++) {
										local271 = local109[local279] - 1;
										if (local271 == -1 || local45[local271] != 0) {
											break;
										}
									}
									if (local271 != -1) {
										if (local56 == null) {
											this.aClass375_1 = new Class375();
											local56 = this.aClass375_1.aShortArray129 = Static500.method7244(this.aShortArray24);
											local64 = this.aClass375_1.aShortArray130 = Static500.method7244(this.aShortArray22);
											local52 = this.aClass375_1.aShortArray131 = Static500.method7244(this.aShortArray19);
											local60 = this.aClass375_1.aByteArray102 = Static507.method7311(this.aByteArray18);
										}
										if (local89 == null) {
											@Pc(360) Class375 local360 = local8.aClass375_1 = new Class375();
											local89 = local360.aShortArray129 = Static500.method7244(local36);
											local93 = local360.aShortArray130 = Static500.method7244(local39);
											local81 = local360.aShortArray131 = Static500.method7244(local42);
											local85 = local360.aByteArray102 = Static507.method7311(local45);
										}
										@Pc(393) short local393 = this.aShortArray24[local197];
										@Pc(398) short local398 = this.aShortArray22[local197];
										@Pc(403) short local403 = this.aShortArray19[local197];
										local202 = local106[local244];
										local209 = local106[local244 + 1];
										@Pc(418) byte local418 = this.aByteArray18[local197];
										@Pc(428) int local428;
										for (@Pc(420) int local420 = local202; local420 < local209; local420++) {
											local428 = local109[local420] - 1;
											if (local428 == -1) {
												break;
											}
											if (local85[local428] != 0) {
												local89[local428] += local393;
												local93[local428] += local398;
												local81[local428] += local403;
												local85[local428] += local418;
											}
										}
										local202 = this.anIntArray132[local135];
										local398 = local39[local271];
										local393 = local36[local271];
										local209 = this.anIntArray132[local135 + 1];
										local418 = local45[local271];
										local403 = local42[local271];
										for (local428 = local202; local428 < local209; local428++) {
											@Pc(513) int local513 = this.aShortArray23[local428] - 1;
											if (local513 == -1) {
												break;
											}
											if (local60[local513] != 0) {
												local56[local513] += local393;
												local64[local513] += local398;
												local52[local513] += local403;
												local60[local513] += local418;
											}
										}
										local8.method2361();
										this.method2361();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class242.anIntArray384[arg0];
		@Pc(13) int local13 = Class242.anIntArray383[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2631; local15++) {
			@Pc(33) int local33 = this.anIntArray135[local15] * local9 + this.anIntArray133[local15] * local13 >> 14;
			this.anIntArray135[local15] = local13 * this.anIntArray135[local15] - this.anIntArray133[local15] * local9 >> 14;
			this.anIntArray133[local15] = local33;
		}
		this.method2352();
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
	private void method2354() {
		if (this.anInt2591 == 0) {
			return;
		}
		if (this.method2351() && this.method2358()) {
			this.aClass143_Sub1_5.method6325(0, this.aClass148_1.anInterface6_2);
			this.aClass143_Sub1_5.method6325(1, this.aClass148_2.anInterface6_2);
			this.aClass143_Sub1_5.method6325(2, this.aClass148_4.anInterface6_2);
			@Pc(60) boolean local60;
			if ((this.anInt2641 & 0x37) == 0) {
				local60 = false;
				this.aClass143_Sub1_5.method6288(false);
				this.aClass143_Sub1_5.method6333(this.aClass143_Sub1_5.aClass48_23);
			} else {
				this.aClass143_Sub1_5.method6288(true);
				local60 = true;
				this.aClass143_Sub1_5.method6325(3, this.aClass148_3.anInterface6_2);
				this.aClass143_Sub1_5.method6333(this.aClass143_Sub1_5.aClass48_21);
			}
			for (@Pc(98) int local98 = 0; local98 < this.anIntArray134.length; local98++) {
				@Pc(105) int local105 = this.anIntArray131[local98];
				@Pc(112) int local112 = this.anIntArray131[local98 + 1];
				@Pc(119) int local119 = this.aShortArray27[local105] & 0xFFFF;
				if (local119 == 65535) {
					local119 = -1;
				}
				this.aClass143_Sub1_5.method6312(true, local60, local119);
				this.aClass143_Sub1_5.method6367(Static536.aClass323_4, this.anIntArray134[local98], this.aClass294_1.anInterface16_7, local105 * 3, this.anIntArray136[local98], local112 - local105);
			}
		}
		this.method2363();
	}

	@OriginalMember(owner = "client!ff", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean182) {
			this.method2350();
		}
		return this.anInt2565;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "()V")
	@Override
	public void method8799() {
		if (this.anInt2579 > 0 && this.anInt2591 > 0) {
			this.method2351();
			this.method2358();
			this.method2363();
		}
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
	public void method2357() {
		if (this.aClass148_1 != null) {
			this.aClass148_1.method3091();
		}
		if (this.aClass148_4 != null) {
			this.aClass148_4.method3091();
		}
		if (this.aClass148_2 != null) {
			this.aClass148_2.method3091();
		}
		if (this.aClass148_3 != null) {
			this.aClass148_3.method3091();
		}
		if (this.aClass294_1 != null) {
			this.aClass294_1.method7174();
		}
	}

	@OriginalMember(owner = "client!ff", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean182) {
			this.method2350();
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!ff", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean182) {
			this.method2350();
		}
		return this.anInt2637;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class114 method8810(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class114_Sub1 local18;
		@Pc(22) Class114_Sub1 local22;
		if (arg0 == 1) {
			local22 = this.aClass143_Sub1_5.aClass114_Sub1_22;
			local18 = this.aClass143_Sub1_5.aClass114_Sub1_30;
		} else if (arg0 == 2) {
			local18 = this.aClass143_Sub1_5.aClass114_Sub1_23;
			local22 = this.aClass143_Sub1_5.aClass114_Sub1_28;
		} else if (arg0 == 3) {
			local18 = this.aClass143_Sub1_5.aClass114_Sub1_24;
			local22 = this.aClass143_Sub1_5.aClass114_Sub1_27;
		} else if (arg0 == 4) {
			local22 = this.aClass143_Sub1_5.aClass114_Sub1_25;
			local18 = this.aClass143_Sub1_5.aClass114_Sub1_21;
		} else if (arg0 == 5) {
			local18 = this.aClass143_Sub1_5.aClass114_Sub1_29;
			local22 = this.aClass143_Sub1_5.aClass114_Sub1_26;
		} else {
			local18 = local22 = new Class114_Sub1(this.aClass143_Sub1_5, 0, 0, true, false);
		}
		return this.method2364(arg0 != 0, arg2, local18, arg1, local22);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)Z")
	private boolean method2358() {
		if (this.aClass294_1.aBoolean610) {
			return true;
		}
		if (this.aClass294_1.anInterface16_8 == null) {
			this.aClass294_1.anInterface16_8 = this.aClass143_Sub1_5.method6279(this.aBoolean184);
		}
		@Pc(28) Interface16 local28 = this.aClass294_1.anInterface16_8;
		local28.method7863(this.anInt2591 * 6);
		@Pc(40) Buffer local40 = local28.method7864();
		if (local40 != null) {
			@Pc(48) Stream local48 = this.aClass143_Sub1_5.method6361(local40);
			@Pc(52) int local52;
			if (Stream.a()) {
				for (local52 = 0; local52 < this.anInt2591; local52++) {
					local48.b(this.aShortArray20[local52]);
					local48.b(this.aShortArray26[local52]);
					local48.b(this.aShortArray25[local52]);
				}
			} else {
				for (local52 = 0; local52 < this.anInt2591; local52++) {
					local48.f(this.aShortArray20[local52]);
					local48.f(this.aShortArray26[local52]);
					local48.f(this.aShortArray25[local52]);
				}
			}
			local48.c();
			if (local28.method7862()) {
				this.aBoolean180 = true;
				this.aClass294_1.aBoolean610 = true;
				this.aClass294_1.anInterface16_7 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!eh;ZI)Z")
	@Override
	public boolean method8795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method2366(-1, arg3, arg2, arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!eh;ZII)Z")
	@Override
	public boolean method8798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method2366(arg5, arg3, arg2, arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass148_1 != null) {
			this.aClass148_1.aBoolean247 = Static512.method7321(this.anInt2641, arg0);
		}
		if (this.aClass148_4 != null) {
			this.aClass148_4.aBoolean247 = Static235.method3368(arg0, this.anInt2641);
		}
		if (this.aClass148_2 != null) {
			this.aClass148_2.aBoolean247 = Static394.method5729(this.anInt2641, arg0);
		}
		if (this.aClass148_3 != null) {
			this.aClass148_3.aBoolean247 = Static536.method7429(this.anInt2641, arg0);
		}
		this.anInt2599 = arg0;
		if (this.aClass375_1 != null && (this.anInt2599 & 0x10000) == 0) {
			this.aByteArray18 = this.aClass375_1.aByteArray102;
			this.aShortArray24 = this.aClass375_1.aShortArray129;
			this.aShortArray19 = this.aClass375_1.aShortArray131;
			this.aShortArray22 = this.aClass375_1.aShortArray130;
			this.aClass375_1 = null;
		}
		this.aBoolean180 = true;
		this.method2363();
	}

	@OriginalMember(owner = "client!ff", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub2_Sub7 ba(@OriginalArg(0) Class5_Sub2_Sub7 arg0) {
		if (this.anInt2579 == 0) {
			return null;
		}
		if (!this.aBoolean182) {
			this.method2350();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass143_Sub1_5.anInt7380 > 0) {
			local43 = this.anInt2626 - (this.aClass143_Sub1_5.anInt7380 * this.anInt2623 >> 8) >> this.aClass143_Sub1_5.anInt7392;
			local59 = this.lb - (this.aClass143_Sub1_5.anInt7380 * this.anInt2565 >> 8) >> this.aClass143_Sub1_5.anInt7392;
		} else {
			local43 = this.anInt2626 - (this.aClass143_Sub1_5.anInt7380 * this.anInt2565 >> 8) >> this.aClass143_Sub1_5.anInt7392;
			local59 = this.lb - (this.aClass143_Sub1_5.anInt7380 * this.anInt2623 >> 8) >> this.aClass143_Sub1_5.anInt7392;
		}
		@Pc(118) int local118;
		@Pc(135) int local135;
		if (this.aClass143_Sub1_5.anInt7387 > 0) {
			local118 = this.anInt2637 - (this.anInt2623 * this.aClass143_Sub1_5.anInt7387 >> 8) >> this.aClass143_Sub1_5.anInt7392;
			local135 = this.anInt2618 - (this.anInt2565 * this.aClass143_Sub1_5.anInt7387 >> 8) >> this.aClass143_Sub1_5.anInt7392;
		} else {
			local118 = this.anInt2637 - (this.aClass143_Sub1_5.anInt7387 * this.anInt2565 >> 8) >> this.aClass143_Sub1_5.anInt7392;
			local135 = this.anInt2618 - (this.aClass143_Sub1_5.anInt7387 * this.anInt2623 >> 8) >> this.aClass143_Sub1_5.anInt7392;
		}
		@Pc(178) int local178 = local59 + 1 - local43;
		@Pc(185) int local185 = local135 + 1 - local118;
		@Pc(188) Class5_Sub2_Sub7_Sub1 local188 = (Class5_Sub2_Sub7_Sub1) arg0;
		@Pc(198) Class5_Sub2_Sub7_Sub1 local198;
		if (local188 != null && local188.method2719(local185, local178)) {
			local198 = local188;
			local188.method2715();
		} else {
			local198 = new Class5_Sub2_Sub7_Sub1(this.aClass143_Sub1_5, local178, local185);
		}
		local198.method2718(local118, local135, local59, local43);
		this.method2359(local198);
		return local198;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!gg;)V")
	private void method2359(@OriginalArg(1) Class5_Sub2_Sub7_Sub1 arg0) {
		if (this.anInt2579 > Static450.anIntArray437.length) {
			Static178.anIntArray168 = new int[this.anInt2579];
			Static450.anIntArray437 = new int[this.anInt2579];
		}
		@Pc(51) int local51;
		@Pc(90) int local90;
		@Pc(99) int local99;
		for (@Pc(24) int local24 = 0; local24 < this.anInt2631; local24++) {
			local51 = (this.anIntArray133[local24] - (this.anIntArray130[local24] * this.aClass143_Sub1_5.anInt7380 >> 8) >> this.aClass143_Sub1_5.anInt7392) - arg0.anInt3076;
			@Pc(76) int local76 = (this.anIntArray135[local24] - (this.anIntArray130[local24] * this.aClass143_Sub1_5.anInt7387 >> 8) >> this.aClass143_Sub1_5.anInt7392) - arg0.anInt3075;
			@Pc(81) int local81 = this.anIntArray132[local24];
			@Pc(88) int local88 = this.anIntArray132[local24 + 1];
			for (local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray23[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static450.anIntArray437[local99] = local51;
				Static178.anIntArray168[local99] = local76;
			}
		}
		for (local51 = 0; local51 < this.anInt2591; local51++) {
			if (this.aByteArray17 == null || this.aByteArray17[local51] <= 128) {
				@Pc(140) short local140 = this.aShortArray20[local51];
				@Pc(145) short local145 = this.aShortArray26[local51];
				@Pc(150) short local150 = this.aShortArray25[local51];
				local90 = Static450.anIntArray437[local140];
				local99 = Static450.anIntArray437[local145];
				@Pc(162) int local162 = Static450.anIntArray437[local150];
				@Pc(166) int local166 = Static178.anIntArray168[local140];
				@Pc(170) int local170 = Static178.anIntArray168[local145];
				@Pc(174) int local174 = Static178.anIntArray168[local150];
				if ((local170 - local174) * (local90 - local99) - (local170 - local166) * (local162 - local99) > 0) {
					arg0.method2720(local174, local99, local170, local166, local162, local90);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean181;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)V")
	private void method2360() {
		if (this.aClass148_2 != null) {
			this.aClass148_2.aBoolean246 = false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
	private void method2361() {
		if ((this.anInt2641 & 0x37) == 0) {
			if (this.aClass148_2 != null) {
				this.aClass148_2.aBoolean246 = false;
			}
		} else if (this.aClass148_3 != null) {
			this.aClass148_3.aBoolean246 = false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!eh;Lclient!sp;II)V")
	@Override
	public void method8807(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class41_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2579 == 0) {
			return;
		}
		@Pc(16) Class56_Sub2 local16 = this.aClass143_Sub1_5.aClass56_Sub2_16;
		if (!this.aBoolean182) {
			this.method2350();
		}
		@Pc(25) Class56_Sub2 local25 = (Class56_Sub2) arg0;
		Static347.aFloat119 = local16.aFloat153 + local16.aFloat150 * local25.aFloat159 + local25.aFloat152 * local16.aFloat154 + local16.aFloat155 * local25.aFloat153;
		Static203.aFloat52 = local25.aFloat154 * local16.aFloat155 + local16.aFloat154 * local25.aFloat149 + local25.aFloat158 * local16.aFloat150;
		@Pc(72) float local72 = Static347.aFloat119 + (float) this.anInt2565 * Static203.aFloat52;
		@Pc(80) float local80 = Static347.aFloat119 + Static203.aFloat52 * (float) this.anInt2623;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.anInt2634 + local72;
			local96 = local80 - (float) this.anInt2634;
		} else {
			local90 = (float) this.anInt2634 + local80;
			local96 = (float) -this.anInt2634 + local72;
		}
		if (local96 >= this.aClass143_Sub1_5.aFloat137 || (float) this.aClass143_Sub1_5.anInt7413 >= local90) {
			return;
		}
		Static520.aFloat162 = local16.aFloat159 + local16.aFloat151 * local25.aFloat153 + local25.aFloat152 * local16.aFloat158 + local16.aFloat148 * local25.aFloat159;
		Static361.aFloat120 = local16.aFloat151 * local25.aFloat154 + local16.aFloat158 * local25.aFloat149 + local25.aFloat158 * local16.aFloat148;
		@Pc(173) float local173 = (float) this.anInt2565 * Static361.aFloat120 + Static520.aFloat162;
		@Pc(181) float local181 = Static361.aFloat120 * (float) this.anInt2623 + Static520.aFloat162;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local181 < local173) {
			local196 = (float) this.aClass143_Sub1_5.anInt7403 * ((float) this.anInt2634 + local173);
			local207 = (float) this.aClass143_Sub1_5.anInt7403 * (local181 - (float) this.anInt2634);
		} else {
			local207 = ((float) -this.anInt2634 + local173) * (float) this.aClass143_Sub1_5.anInt7403;
			local196 = (local181 + (float) this.anInt2634) * (float) this.aClass143_Sub1_5.anInt7403;
		}
		if (local207 / (float) arg2 >= this.aClass143_Sub1_5.aFloat138 || local196 / (float) arg2 <= this.aClass143_Sub1_5.aFloat139) {
			return;
		}
		Static543.aFloat168 = local25.aFloat154 * local16.aFloat157 + local25.aFloat158 * local16.aFloat156 + local25.aFloat149 * local16.aFloat149;
		Static637.aFloat195 = local16.aFloat152 + local25.aFloat152 * local16.aFloat149 + local25.aFloat159 * local16.aFloat156 + local25.aFloat153 * local16.aFloat157;
		@Pc(299) float local299 = Static543.aFloat168 * (float) this.anInt2565 + Static637.aFloat195;
		@Pc(307) float local307 = Static637.aFloat195 + Static543.aFloat168 * (float) this.anInt2623;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local299 > local307) {
			local323 = (float) this.aClass143_Sub1_5.anInt7389 * ((float) -this.anInt2634 + local307);
			local334 = ((float) this.anInt2634 + local299) * (float) this.aClass143_Sub1_5.anInt7389;
		} else {
			local323 = (float) this.aClass143_Sub1_5.anInt7389 * ((float) -this.anInt2634 + local299);
			local334 = (local307 + (float) this.anInt2634) * (float) this.aClass143_Sub1_5.anInt7389;
		}
		if (local323 / (float) arg2 >= this.aClass143_Sub1_5.aFloat133 || this.aClass143_Sub1_5.aFloat131 >= local334 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass222Array1 != null) {
			Static71.aFloat28 = local25.aFloat155 * local16.aFloat157 + local25.aFloat151 * local16.aFloat156 + local25.aFloat157 * local16.aFloat149;
			Static49.aFloat9 = local16.aFloat151 * local25.aFloat150 + local16.aFloat158 * local25.aFloat156 + local16.aFloat148 * local25.aFloat148;
			Static12.aFloat199 = local25.aFloat155 * local16.aFloat151 + local16.aFloat148 * local25.aFloat151 + local25.aFloat157 * local16.aFloat158;
			Static34.aFloat6 = local16.aFloat155 * local25.aFloat155 + local25.aFloat151 * local16.aFloat150 + local16.aFloat154 * local25.aFloat157;
			Static425.aFloat145 = local25.aFloat150 * local16.aFloat157 + local25.aFloat156 * local16.aFloat149 + local25.aFloat148 * local16.aFloat156;
			Static515.aFloat56 = local16.aFloat155 * local25.aFloat150 + local16.aFloat150 * local25.aFloat148 + local16.aFloat154 * local25.aFloat156;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.lb + this.anInt2626 >> 1;
			@Pc(511) int local511 = this.anInt2637 + this.anInt2618 >> 1;
			@Pc(530) int local530 = (int) (Static12.aFloat199 * (float) local511 + (float) this.anInt2565 * Static361.aFloat120 + Static520.aFloat162 + Static49.aFloat9 * (float) local502);
			@Pc(549) int local549 = (int) (Static71.aFloat28 * (float) local511 + (float) this.anInt2565 * Static543.aFloat168 + Static637.aFloat195 + (float) local502 * Static425.aFloat145);
			@Pc(568) int local568 = (int) (Static203.aFloat52 * (float) this.anInt2565 + Static347.aFloat119 + Static515.aFloat56 * (float) local502 + Static34.aFloat6 * (float) local511);
			@Pc(587) int local587 = (int) ((float) local511 * Static12.aFloat199 + Static361.aFloat120 * (float) this.anInt2623 + Static520.aFloat162 + Static49.aFloat9 * (float) local502);
			@Pc(606) int local606 = (int) (Static71.aFloat28 * (float) local511 + Static543.aFloat168 * (float) this.anInt2623 + (float) local502 * Static425.aFloat145 + Static637.aFloat195);
			@Pc(625) int local625 = (int) (Static347.aFloat119 + Static515.aFloat56 * (float) local502 + (float) this.anInt2623 * Static203.aFloat52 + (float) local511 * Static34.aFloat6);
			arg1.anInt8965 = this.aClass143_Sub1_5.anInt7411 + local530 * this.aClass143_Sub1_5.anInt7403 / arg2;
			arg1.anInt8963 = this.aClass143_Sub1_5.anInt7408 + local606 * this.aClass143_Sub1_5.anInt7389 / arg2;
			arg1.anInt8964 = this.aClass143_Sub1_5.anInt7411 + this.aClass143_Sub1_5.anInt7403 * local587 / arg2;
			arg1.anInt8966 = local549 * this.aClass143_Sub1_5.anInt7389 / arg2 + this.aClass143_Sub1_5.anInt7408;
			if (local568 >= this.aClass143_Sub1_5.anInt7413 || local625 >= this.aClass143_Sub1_5.anInt7413) {
				arg1.anInt8962 = (local530 + this.anInt2634) * this.aClass143_Sub1_5.anInt7403 / arg2 + this.aClass143_Sub1_5.anInt7411 - arg1.anInt8965;
				arg1.aBoolean648 = true;
			}
		}
		this.aClass143_Sub1_5.method6354((float) arg2);
		this.aClass143_Sub1_5.method6347();
		this.aClass143_Sub1_5.method6350(local25);
		this.method2354();
		this.method2353();
	}

	@OriginalMember(owner = "client!ff", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort28;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIBIIII)Z")
	private boolean method2362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > arg5 && arg6 > arg5 && arg3 > arg5) {
			return false;
		} else if (arg5 > arg4 && arg6 < arg5 && arg5 > arg3) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg0 && arg1 > arg2) {
			return false;
		} else {
			return arg7 >= arg2 || arg2 <= arg0 || arg1 >= arg2;
		}
	}

	@OriginalMember(owner = "client!ff", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean182) {
			this.method2350();
		}
		return this.anInt2634;
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V")
	private void method2363() {
		if (!this.aBoolean180) {
			return;
		}
		this.aBoolean180 = false;
		if (this.aClass244Array1 == null && this.aClass303Array1 == null && this.aClass222Array1 == null) {
			if (this.anIntArray133 != null && !Static600.method8107(this.anInt2599, this.anInt2641)) {
				if (this.aClass148_1 == null || this.aClass148_1.method3092()) {
					if (!this.aBoolean182) {
						this.method2350();
					}
					this.anIntArray133 = null;
				} else {
					this.aBoolean180 = true;
				}
			}
			if (this.anIntArray130 != null && !Static15.method251(this.anInt2599, this.anInt2641)) {
				if (this.aClass148_1 == null || this.aClass148_1.method3092()) {
					if (!this.aBoolean182) {
						this.method2350();
					}
					this.anIntArray130 = null;
				} else {
					this.aBoolean180 = true;
				}
			}
			if (this.anIntArray135 != null && !Static321.method4950(this.anInt2641, this.anInt2599)) {
				if (this.aClass148_1 == null || this.aClass148_1.method3092()) {
					if (!this.aBoolean182) {
						this.method2350();
					}
					this.anIntArray135 = null;
				} else {
					this.aBoolean180 = true;
				}
			}
		}
		if (this.aShortArray23 != null && this.anIntArray133 == null && this.anIntArray130 == null && this.anIntArray135 == null) {
			this.anIntArray132 = null;
			this.aShortArray23 = null;
		}
		if (this.aByteArray18 != null && !Static241.method3457(this.anInt2599, this.anInt2641)) {
			label197: {
				label196: {
					@Pc(161) boolean local161;
					if ((this.anInt2641 & 0x37) == 0) {
						if (this.aClass148_2 == null || this.aClass148_2.method3092()) {
							break label196;
						}
						local161 = false;
					} else {
						if (this.aClass148_3 == null || this.aClass148_3.method3092()) {
							break label196;
						}
						local161 = false;
					}
					if (!local161) {
						this.aBoolean180 = true;
						break label197;
					}
				}
				this.aByteArray18 = null;
				this.aShortArray24 = this.aShortArray22 = this.aShortArray19 = null;
			}
		}
		if (this.aShortArray16 != null && !Static400.method5875(this.anInt2599, this.anInt2641)) {
			if (this.aClass148_2 == null || this.aClass148_2.method3092()) {
				this.aShortArray16 = null;
			} else {
				this.aBoolean180 = true;
			}
		}
		if (this.aByteArray17 != null && !Static271.method3795(this.anInt2641, this.anInt2599)) {
			if (this.aClass148_2 == null || this.aClass148_2.method3092()) {
				this.aByteArray17 = null;
			} else {
				this.aBoolean180 = true;
			}
		}
		if (this.aFloatArray9 != null && !Static67.method959(this.anInt2599, this.anInt2641)) {
			if (this.aClass148_4 == null || this.aClass148_4.method3092()) {
				this.aFloatArray9 = this.aFloatArray10 = null;
			} else {
				this.aBoolean180 = true;
			}
		}
		if (this.aShortArray27 != null && !Static178.method2613(this.anInt2599, this.anInt2641)) {
			if (this.aClass148_2 == null || this.aClass148_2.method3092()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean180 = true;
			}
		}
		if (this.aShortArray20 != null && !Static556.method7638(this.anInt2641, this.anInt2599)) {
			if ((this.aClass294_1 == null || this.aClass294_1.method7176()) && (this.aClass148_2 == null || this.aClass148_2.method3092())) {
				this.aShortArray20 = this.aShortArray26 = this.aShortArray25 = null;
			} else {
				this.aBoolean180 = true;
			}
		}
		if (this.aShortArray15 != null) {
			if (this.aClass148_1 == null || this.aClass148_1.method3092()) {
				this.aShortArray15 = null;
			} else {
				this.aBoolean180 = true;
			}
		}
		if (this.aShortArray17 != null) {
			if (this.aClass148_2 == null || this.aClass148_2.method3092()) {
				this.aShortArray17 = null;
			} else {
				this.aBoolean180 = true;
			}
		}
		if (this.anIntArrayArray24 != null && !Static598.method8099(this.anInt2641, this.anInt2599)) {
			this.anIntArrayArray24 = null;
			this.aShortArray21 = null;
		}
		if (this.anIntArrayArray23 != null && !Static299.method4070(this.anInt2641, this.anInt2599)) {
			this.aShortArray18 = null;
			this.anIntArrayArray23 = null;
		}
		if (this.anIntArrayArray22 != null && !Static167.method2462(this.anInt2641, this.anInt2599)) {
			this.anIntArrayArray22 = null;
		}
		if (this.anIntArray131 != null && (this.anInt2599 & 0x800) == 0 && (this.anInt2599 & 0x40000) == 0) {
			this.anIntArray131 = null;
			this.anIntArray136 = null;
			this.anIntArray134 = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZLclient!ff;BILclient!ff;)Lclient!ka;")
	private Class114 method2364(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class114_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class114_Sub1 arg4) {
		arg2.anInt2591 = this.anInt2591;
		arg2.anInt2632 = this.anInt2632;
		if ((arg3 & 0x100) == 0) {
			arg2.aBoolean181 = this.aBoolean181;
		} else {
			arg2.aBoolean181 = true;
		}
		arg2.anInt2599 = arg3;
		arg2.anInt2628 = this.anInt2628;
		arg2.anInt2641 = this.anInt2641;
		arg2.anInt2579 = this.anInt2579;
		arg2.anInt2631 = this.anInt2631;
		arg2.aBoolean183 = this.aBoolean183;
		arg2.anInt2593 = this.anInt2593;
		arg2.aShort29 = this.aShort29;
		arg2.aShort28 = this.aShort28;
		@Pc(76) boolean local76 = Static279.method3859(this.anInt2641, arg3);
		@Pc(82) boolean local82 = Static588.method8006(arg3, this.anInt2641);
		@Pc(88) boolean local88 = Static278.method3851(arg3, this.anInt2641);
		@Pc(94) boolean local94 = local88 | local82 | local76;
		@Pc(213) int local213;
		if (local94) {
			if (!local76) {
				arg2.anIntArray133 = this.anIntArray133;
			} else if (arg4.anIntArray133 == null || this.anInt2628 > arg4.anIntArray133.length) {
				arg2.anIntArray133 = arg4.anIntArray133 = new int[this.anInt2628];
			} else {
				arg2.anIntArray133 = arg4.anIntArray133;
			}
			if (!local82) {
				arg2.anIntArray130 = this.anIntArray130;
			} else if (arg4.anIntArray130 == null || arg4.anIntArray130.length < this.anInt2628) {
				arg2.anIntArray130 = arg4.anIntArray130 = new int[this.anInt2628];
			} else {
				arg2.anIntArray130 = arg4.anIntArray130;
			}
			if (!local88) {
				arg2.anIntArray135 = this.anIntArray135;
			} else if (arg4.anIntArray135 == null || arg4.anIntArray135.length < this.anInt2628) {
				arg2.anIntArray135 = arg4.anIntArray135 = new int[this.anInt2628];
			} else {
				arg2.anIntArray135 = arg4.anIntArray135;
			}
			for (local213 = 0; local213 < this.anInt2628; local213++) {
				if (local76) {
					arg2.anIntArray133[local213] = this.anIntArray133[local213];
				}
				if (local82) {
					arg2.anIntArray130[local213] = this.anIntArray130[local213];
				}
				if (local88) {
					arg2.anIntArray135[local213] = this.anIntArray135[local213];
				}
			}
		} else {
			arg2.anIntArray130 = this.anIntArray130;
			arg2.anIntArray133 = this.anIntArray133;
			arg2.anIntArray135 = this.anIntArray135;
		}
		if (Static512.method7321(this.anInt2641, arg3)) {
			arg2.aClass148_1 = arg4.aClass148_1;
			arg2.aClass148_1.aBoolean247 = true;
			arg2.aClass148_1.aBoolean246 = this.aClass148_1.aBoolean246;
			arg2.aClass148_1.anInterface6_2 = this.aClass148_1.anInterface6_2;
		} else if (Static221.method3131(this.anInt2641, arg3)) {
			arg2.aClass148_1 = this.aClass148_1;
		} else {
			arg2.aClass148_1 = null;
		}
		if (Static467.method6899(this.anInt2641, arg3)) {
			if (arg4.aShortArray16 == null || arg4.aShortArray16.length < this.anInt2632) {
				arg2.aShortArray16 = arg4.aShortArray16 = new short[this.anInt2632];
			} else {
				arg2.aShortArray16 = arg4.aShortArray16;
			}
			for (local213 = 0; local213 < this.anInt2632; local213++) {
				arg2.aShortArray16[local213] = this.aShortArray16[local213];
			}
		} else {
			arg2.aShortArray16 = this.aShortArray16;
		}
		if (Static260.method3619(arg3, this.anInt2641)) {
			if (arg4.aByteArray17 == null || this.anInt2632 > arg4.aByteArray17.length) {
				arg2.aByteArray17 = arg4.aByteArray17 = new byte[this.anInt2632];
			} else {
				arg2.aByteArray17 = arg4.aByteArray17;
			}
			for (local213 = 0; local213 < this.anInt2632; local213++) {
				arg2.aByteArray17[local213] = this.aByteArray17[local213];
			}
		} else {
			arg2.aByteArray17 = this.aByteArray17;
		}
		if (Static394.method5729(this.anInt2641, arg3)) {
			arg2.aClass148_2 = arg4.aClass148_2;
			arg2.aClass148_2.anInterface6_2 = this.aClass148_2.anInterface6_2;
			arg2.aClass148_2.aBoolean247 = true;
			arg2.aClass148_2.aBoolean246 = this.aClass148_2.aBoolean246;
		} else if (Static166.method2455(arg3, this.anInt2641)) {
			arg2.aClass148_2 = this.aClass148_2;
		} else {
			arg2.aClass148_2 = null;
		}
		@Pc(572) int local572;
		if (Static56.method840(this.anInt2641, arg3)) {
			if (arg4.aShortArray24 == null || arg4.aShortArray24.length < this.anInt2579) {
				local213 = this.anInt2579;
				arg2.aShortArray24 = arg4.aShortArray24 = new short[local213];
				arg2.aShortArray19 = arg4.aShortArray19 = new short[local213];
				arg2.aShortArray22 = arg4.aShortArray22 = new short[local213];
			} else {
				arg2.aShortArray22 = arg4.aShortArray22;
				arg2.aShortArray19 = arg4.aShortArray19;
				arg2.aShortArray24 = arg4.aShortArray24;
			}
			if (this.aClass375_1 == null) {
				arg2.aClass375_1 = null;
				for (local213 = 0; local213 < this.anInt2579; local213++) {
					arg2.aShortArray24[local213] = this.aShortArray24[local213];
					arg2.aShortArray22[local213] = this.aShortArray22[local213];
					arg2.aShortArray19[local213] = this.aShortArray19[local213];
				}
			} else {
				if (arg4.aClass375_1 == null) {
					arg4.aClass375_1 = new Class375();
				}
				@Pc(560) Class375 local560 = arg2.aClass375_1 = arg4.aClass375_1;
				if (local560.aShortArray129 == null || local560.aShortArray129.length < this.anInt2579) {
					local572 = this.anInt2579;
					local560.aShortArray131 = new short[local572];
					local560.aShortArray130 = new short[local572];
					local560.aShortArray129 = new short[local572];
					local560.aByteArray102 = new byte[local572];
				}
				for (local572 = 0; local572 < this.anInt2579; local572++) {
					arg2.aShortArray24[local572] = this.aShortArray24[local572];
					arg2.aShortArray22[local572] = this.aShortArray22[local572];
					arg2.aShortArray19[local572] = this.aShortArray19[local572];
					local560.aShortArray129[local572] = this.aClass375_1.aShortArray129[local572];
					local560.aShortArray130[local572] = this.aClass375_1.aShortArray130[local572];
					local560.aShortArray131[local572] = this.aClass375_1.aShortArray131[local572];
					local560.aByteArray102[local572] = this.aClass375_1.aByteArray102[local572];
				}
			}
			arg2.aByteArray18 = this.aByteArray18;
		} else {
			arg2.aShortArray19 = this.aShortArray19;
			arg2.aShortArray24 = this.aShortArray24;
			arg2.aByteArray18 = this.aByteArray18;
			arg2.aShortArray22 = this.aShortArray22;
			arg2.aClass375_1 = this.aClass375_1;
		}
		if (Static536.method7429(this.anInt2641, arg3)) {
			arg2.aClass148_3 = arg4.aClass148_3;
			arg2.aClass148_3.aBoolean246 = this.aClass148_3.aBoolean246;
			arg2.aClass148_3.anInterface6_2 = this.aClass148_3.anInterface6_2;
			arg2.aClass148_3.aBoolean247 = true;
		} else if (Static476.method7022(arg3, this.anInt2641)) {
			arg2.aClass148_3 = this.aClass148_3;
		} else {
			arg2.aClass148_3 = null;
		}
		if (Static443.method6611(arg3, this.anInt2641)) {
			if (arg4.aFloatArray9 == null || this.anInt2632 > arg4.aFloatArray9.length) {
				local213 = this.anInt2579;
				arg2.aFloatArray10 = arg4.aFloatArray10 = new float[local213];
				arg2.aFloatArray9 = arg4.aFloatArray9 = new float[local213];
			} else {
				arg2.aFloatArray10 = arg4.aFloatArray10;
				arg2.aFloatArray9 = arg4.aFloatArray9;
			}
			for (local213 = 0; local213 < this.anInt2579; local213++) {
				arg2.aFloatArray9[local213] = this.aFloatArray9[local213];
				arg2.aFloatArray10[local213] = this.aFloatArray10[local213];
			}
		} else {
			arg2.aFloatArray10 = this.aFloatArray10;
			arg2.aFloatArray9 = this.aFloatArray9;
		}
		if (Static235.method3368(arg3, this.anInt2641)) {
			arg2.aClass148_4 = arg4.aClass148_4;
			arg2.aClass148_4.aBoolean246 = this.aClass148_4.aBoolean246;
			arg2.aClass148_4.anInterface6_2 = this.aClass148_4.anInterface6_2;
			arg2.aClass148_4.aBoolean247 = true;
		} else if (Static416.method6121(arg3, this.anInt2641)) {
			arg2.aClass148_4 = this.aClass148_4;
		} else {
			arg2.aClass148_4 = null;
		}
		if (Static234.method3349(this.anInt2641, arg3)) {
			if (arg4.aShortArray20 == null || this.anInt2632 > arg4.aShortArray20.length) {
				local213 = this.anInt2632;
				arg2.aShortArray26 = arg4.aShortArray26 = new short[local213];
				arg2.aShortArray25 = arg4.aShortArray25 = new short[local213];
				arg2.aShortArray20 = arg4.aShortArray20 = new short[local213];
			} else {
				arg2.aShortArray20 = arg4.aShortArray20;
				arg2.aShortArray25 = arg4.aShortArray25;
				arg2.aShortArray26 = arg4.aShortArray26;
			}
			for (local213 = 0; local213 < this.anInt2632; local213++) {
				arg2.aShortArray20[local213] = this.aShortArray20[local213];
				arg2.aShortArray26[local213] = this.aShortArray26[local213];
				arg2.aShortArray25[local213] = this.aShortArray25[local213];
			}
		} else {
			arg2.aShortArray20 = this.aShortArray20;
			arg2.aShortArray25 = this.aShortArray25;
			arg2.aShortArray26 = this.aShortArray26;
		}
		if (Static304.method4153(this.anInt2641, arg3)) {
			arg2.aClass294_1 = arg4.aClass294_1;
			arg2.aClass294_1.aBoolean610 = this.aClass294_1.aBoolean610;
			arg2.aClass294_1.aBoolean611 = true;
			arg2.aClass294_1.anInterface16_7 = this.aClass294_1.anInterface16_7;
		} else if (Static359.method4146(arg3, this.anInt2641)) {
			arg2.aClass294_1 = this.aClass294_1;
		} else {
			arg2.aClass294_1 = null;
		}
		if (Static622.method7592(arg3, this.anInt2641)) {
			if (arg4.aShortArray27 == null || arg4.aShortArray27.length < this.anInt2632) {
				local213 = this.anInt2632;
				arg2.aShortArray27 = arg4.aShortArray27 = new short[local213];
			} else {
				arg2.aShortArray27 = arg4.aShortArray27;
			}
			for (local213 = 0; local213 < this.anInt2632; local213++) {
				arg2.aShortArray27[local213] = this.aShortArray27[local213];
			}
		} else {
			arg2.aShortArray27 = this.aShortArray27;
		}
		if (!Static484.method7069(arg3, this.anInt2641)) {
			arg2.aClass98Array1 = this.aClass98Array1;
		} else if (arg4.aClass98Array1 == null || this.anInt2593 > arg4.aClass98Array1.length) {
			local213 = this.anInt2593;
			arg2.aClass98Array1 = arg4.aClass98Array1 = new Class98[local213];
			for (local572 = 0; local572 < this.anInt2593; local572++) {
				arg2.aClass98Array1[local572] = this.aClass98Array1[local572].method2038();
			}
		} else {
			arg2.aClass98Array1 = arg4.aClass98Array1;
			for (local213 = 0; local213 < this.anInt2593; local213++) {
				arg2.aClass98Array1[local213].method2037(this.aClass98Array1[local213]);
			}
		}
		arg2.aShortArray21 = this.aShortArray21;
		arg2.aShortArray18 = this.aShortArray18;
		arg2.aClass303Array1 = this.aClass303Array1;
		if (this.aBoolean182) {
			arg2.aBoolean182 = true;
			arg2.anInt2626 = this.anInt2626;
			arg2.anInt2565 = this.anInt2565;
			arg2.anInt2618 = this.anInt2618;
			arg2.anInt2637 = this.anInt2637;
			arg2.anInt2623 = this.anInt2623;
			arg2.lb = this.lb;
			arg2.anInt2634 = this.anInt2634;
			arg2.anInt2617 = this.anInt2617;
		} else {
			arg2.aBoolean182 = false;
		}
		arg2.anIntArrayArray23 = this.anIntArrayArray23;
		arg2.aClass222Array1 = this.aClass222Array1;
		arg2.aClass244Array1 = this.aClass244Array1;
		arg2.anIntArray132 = this.anIntArray132;
		arg2.aShortArray17 = this.aShortArray17;
		arg2.anIntArray131 = this.anIntArray131;
		arg2.anIntArray134 = this.anIntArray134;
		arg2.anIntArrayArray22 = this.anIntArrayArray22;
		arg2.aShortArray15 = this.aShortArray15;
		arg2.aShortArray23 = this.aShortArray23;
		arg2.anIntArrayArray24 = this.anIntArrayArray24;
		arg2.anIntArray136 = this.anIntArray136;
		return arg2;
	}

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean182) {
			this.method2350();
		}
		return this.anInt2626;
	}

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2631; local7++) {
			if (arg0 != 128) {
				this.anIntArray133[local7] = arg0 * this.anIntArray133[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray130[local7] = arg1 * this.anIntArray130[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray135[local7] = arg2 * this.anIntArray135[local7] >> 7;
			}
		}
		this.method2352();
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "()Z")
	@Override
	public boolean method8796() {
		if (this.aShortArray27 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray27.length; local12++) {
			if (this.aShortArray27[local12] != -1 && !this.aClass143_Sub1_5.anInterface3_11.method8500(this.aShortArray27[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIFIILclient!hm;FIIJ)S")
	private short method2365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class156 arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9) {
		@Pc(10) int local10 = this.anIntArray132[arg2];
		@Pc(17) int local17 = this.anIntArray132[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray23[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static368.aLongArray15[local21] == arg9) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray23[local19] = (short) (this.anInt2579 + 1);
		Static368.aLongArray15[local19] = arg9;
		this.aShortArray17[this.anInt2579] = (short) arg0;
		this.aShortArray15[this.anInt2579] = (short) arg2;
		this.aShortArray24[this.anInt2579] = (short) arg8;
		this.aShortArray22[this.anInt2579] = (short) arg1;
		this.aShortArray19[this.anInt2579] = (short) arg4;
		this.aByteArray18[this.anInt2579] = (byte) arg7;
		this.aFloatArray9[this.anInt2579] = arg3;
		this.aFloatArray10[this.anInt2579] = arg6;
		return (short) this.anInt2579++;
	}

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort28 = (short) arg0;
		this.method2360();
	}

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean182) {
			this.method2350();
		}
		@Pc(16) int local16 = this.anInt2626 + arg4;
		@Pc(21) int local21 = arg4 + this.lb;
		@Pc(26) int local26 = this.anInt2637 + arg6;
		@Pc(32) int local32 = arg6 + this.anInt2618;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt10541 <= local21 + arg2.anInt10540 >> arg2.anInt10547 || local26 < 0 || arg2.anInt10540 + local32 >> arg2.anInt10547 >= arg2.anInt10545)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt10541 <= local21 + arg3.anInt10540 >> arg3.anInt10547 || local26 < 0 || arg3.anInt10540 + local32 >> arg3.anInt10547 >= arg3.anInt10545) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10547;
			local21 = local21 + arg2.anInt10540 - 1 >> arg2.anInt10547;
			local26 >>= arg2.anInt10547;
			local32 = local32 + arg2.anInt10540 - 1 >> arg2.anInt10547;
			if (arg2.method8749(local16, local26) == arg5 && arg2.method8749(local21, local26) == arg5 && arg2.method8749(local16, local32) == arg5 && arg2.method8749(local21, local32) == arg5) {
				return;
			}
		}
		@Pc(207) int local207;
		if (arg0 == 1) {
			for (local207 = 0; local207 < this.anInt2631; local207++) {
				this.anIntArray130[local207] += arg2.method8753(arg4 + this.anIntArray133[local207], this.anIntArray135[local207] - -arg6) - arg5;
			}
		} else {
			@Pc(268) int local268;
			@Pc(328) int local328;
			if (arg0 == 2) {
				local207 = this.anInt2565;
				if (local207 == 0) {
					return;
				}
				for (local268 = 0; local268 < this.anInt2631; local268++) {
					local328 = (this.anIntArray130[local268] << 16) / local207;
					if (arg1 > local328) {
						this.anIntArray130[local268] -= -((arg2.method8753(arg4 + this.anIntArray133[local268], arg6 + this.anIntArray135[local268]) - arg5) * (-local328 + arg1) / arg1);
					}
				}
			} else {
				@Pc(336) int local336;
				if (arg0 == 3) {
					local207 = (arg1 & 0xFF) * 4;
					local268 = (arg1 >> 8 & 0xFF) * 4;
					local328 = (arg1 >> 16 & 0xFF) << 6;
					local336 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local207 >> 1) < 0 || arg2.anInt10541 << arg2.anInt10547 <= (local207 >> 1) + arg4 + arg2.anInt10540 || arg6 - (local268 >> 1) < 0 || arg2.anInt10540 + arg6 + (local268 >> 1) >= arg2.anInt10545 << arg2.anInt10547) {
						return;
					}
					this.method8797(local328, local336, local207, arg6, arg2, arg5, local268, arg4);
				} else if (arg0 == 4) {
					local207 = this.anInt2623 - this.anInt2565;
					for (local268 = 0; local268 < this.anInt2631; local268++) {
						this.anIntArray130[local268] += arg3.method8753(arg4 + this.anIntArray133[local268], arg6 + this.anIntArray135[local268]) + local207 - arg5;
					}
				} else if (arg0 == 5) {
					local207 = this.anInt2623 - this.anInt2565;
					for (local268 = 0; local268 < this.anInt2631; local268++) {
						local328 = this.anIntArray133[local268] + arg4;
						local336 = this.anIntArray135[local268] + arg6;
						@Pc(342) int local342 = arg2.method8753(local328, local336);
						@Pc(348) int local348 = arg3.method8753(local328, local336);
						@Pc(355) int local355 = local342 - local348 - arg1;
						this.anIntArray130[local268] = ((this.anIntArray130[local268] << 8) / local207 * local355 >> 8) + (local342 - arg5);
					}
				}
			}
		}
		this.method2352();
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZLclient!eh;IZII)Z")
	private boolean method2366(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class56_Sub2 local8 = (Class56_Sub2) arg2;
		@Pc(12) Class56_Sub2 local12 = this.aClass143_Sub1_5.aClass56_Sub2_16;
		@Pc(33) float local33 = local12.aFloat159 + local8.aFloat153 * local12.aFloat151 + local8.aFloat152 * local12.aFloat158 + local12.aFloat148 * local8.aFloat159;
		@Pc(54) float local54 = local12.aFloat152 + local12.aFloat157 * local8.aFloat153 + local12.aFloat156 * local8.aFloat159 + local8.aFloat152 * local12.aFloat149;
		Static49.aFloat9 = local12.aFloat158 * local8.aFloat156 + local12.aFloat148 * local8.aFloat148 + local12.aFloat151 * local8.aFloat150;
		@Pc(93) float local93 = local12.aFloat154 * local8.aFloat152 + local8.aFloat159 * local12.aFloat150 + local8.aFloat153 * local12.aFloat155 + local12.aFloat153;
		Static34.aFloat6 = local12.aFloat154 * local8.aFloat157 + local8.aFloat151 * local12.aFloat150 + local8.aFloat155 * local12.aFloat155;
		Static543.aFloat168 = local8.aFloat158 * local12.aFloat156 + local12.aFloat149 * local8.aFloat149 + local8.aFloat154 * local12.aFloat157;
		Static12.aFloat199 = local12.aFloat148 * local8.aFloat151 + local12.aFloat158 * local8.aFloat157 + local8.aFloat155 * local12.aFloat151;
		Static71.aFloat28 = local8.aFloat151 * local12.aFloat156 + local8.aFloat157 * local12.aFloat149 + local12.aFloat157 * local8.aFloat155;
		Static203.aFloat52 = local8.aFloat158 * local12.aFloat150 + local12.aFloat154 * local8.aFloat149 + local12.aFloat155 * local8.aFloat154;
		Static515.aFloat56 = local8.aFloat150 * local12.aFloat155 + local8.aFloat148 * local12.aFloat150 + local12.aFloat154 * local8.aFloat156;
		Static361.aFloat120 = local8.aFloat154 * local12.aFloat151 + local8.aFloat158 * local12.aFloat148 + local12.aFloat158 * local8.aFloat149;
		Static425.aFloat145 = local8.aFloat148 * local12.aFloat156 + local8.aFloat156 * local12.aFloat149 + local8.aFloat150 * local12.aFloat157;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass143_Sub1_5.anInt7403;
		@Pc(255) int local255 = this.aClass143_Sub1_5.anInt7389;
		if (!this.aBoolean182) {
			this.method2350();
		}
		@Pc(270) int local270 = this.lb - this.anInt2626 >> 1;
		@Pc(279) int local279 = this.anInt2623 - this.anInt2565 >> 1;
		@Pc(288) int local288 = this.anInt2618 - this.anInt2637 >> 1;
		@Pc(293) int local293 = local270 + this.anInt2626;
		@Pc(298) int local298 = local279 + this.anInt2565;
		@Pc(303) int local303 = this.anInt2637 + local288;
		@Pc(310) int local310 = local293 - (local270 << arg4);
		@Pc(317) int local317 = local298 - (local279 << arg4);
		@Pc(330) int local330 = local303 - (local288 << arg4);
		@Pc(336) int local336 = local293 + (local270 << arg4);
		@Pc(342) int local342 = (local279 << arg4) + local298;
		@Pc(348) int local348 = local303 + (local288 << arg4);
		Static527.anIntArray480[0] = local310;
		Static113.anIntArray105[0] = local317;
		Static402.anIntArray388[0] = local330;
		Static527.anIntArray480[1] = local336;
		Static113.anIntArray105[1] = local317;
		Static527.anIntArray480[2] = local310;
		Static402.anIntArray388[1] = local330;
		Static113.anIntArray105[2] = local342;
		Static402.anIntArray388[2] = local330;
		Static527.anIntArray480[3] = local336;
		Static113.anIntArray105[3] = local342;
		Static402.anIntArray388[3] = local330;
		Static527.anIntArray480[4] = local310;
		Static113.anIntArray105[4] = local317;
		Static527.anIntArray480[5] = local336;
		Static402.anIntArray388[4] = local348;
		Static113.anIntArray105[5] = local317;
		Static402.anIntArray388[5] = local348;
		Static527.anIntArray480[6] = local310;
		Static113.anIntArray105[6] = local342;
		Static527.anIntArray480[7] = local336;
		Static402.anIntArray388[6] = local348;
		Static113.anIntArray105[7] = local342;
		Static402.anIntArray388[7] = local348;
		@Pc(477) float local477;
		@Pc(491) float local491;
		@Pc(505) float local505;
		@Pc(453) float local453;
		@Pc(458) float local458;
		@Pc(463) float local463;
		for (@Pc(446) int local446 = 0; local446 < 8; local446++) {
			local453 = (float) Static527.anIntArray480[local446];
			local458 = (float) Static113.anIntArray105[local446];
			local463 = (float) Static402.anIntArray388[local446];
			local477 = local463 * Static12.aFloat199 + local458 * Static361.aFloat120 + local453 * Static49.aFloat9 + local33;
			local491 = Static543.aFloat168 * local458 + local453 * Static425.aFloat145 + Static71.aFloat28 * local463 + local54;
			local505 = local93 + local463 * Static34.aFloat6 + local453 * Static515.aFloat56 + Static203.aFloat52 * local458;
			if ((float) this.aClass143_Sub1_5.anInt7413 <= local505) {
				if (arg0 > 0) {
					local505 = (float) arg0;
				}
				@Pc(532) float local532 = local477 * (float) local251 / local505 + (float) this.aClass143_Sub1_5.anInt7411;
				@Pc(544) float local544 = (float) this.aClass143_Sub1_5.anInt7408 + (float) local255 * local491 / local505;
				if (local241 > local532) {
					local241 = local532;
				}
				if (local532 > local243) {
					local243 = local532;
				}
				if (local245 > local544) {
					local245 = local544;
				}
				if (local544 > local247) {
					local247 = local544;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg5 > local241 && (float) arg5 < local243 && local245 < (float) arg3 && (float) arg3 < local247) {
			if (arg1) {
				return true;
			}
			if (this.anInt2579 > Static450.anIntArray437.length) {
				Static178.anIntArray168 = new int[this.anInt2579];
				Static450.anIntArray437 = new int[this.anInt2579];
			}
			@Pc(689) int local689;
			for (@Pc(615) int local615 = 0; local615 < this.anInt2631; local615++) {
				local463 = (float) this.anIntArray135[local615];
				local458 = (float) this.anIntArray130[local615];
				local453 = (float) this.anIntArray133[local615];
				local505 = local93 + local463 * Static34.aFloat6 + Static515.aFloat56 * local453 + local458 * Static203.aFloat52;
				local491 = local54 + local453 * Static425.aFloat145 + local458 * Static543.aFloat168 + local463 * Static71.aFloat28;
				local477 = local33 + local458 * Static361.aFloat120 + Static49.aFloat9 * local453 + local463 * Static12.aFloat199;
				@Pc(696) int local696;
				@Pc(698) int local698;
				@Pc(707) int local707;
				if (local505 >= (float) this.aClass143_Sub1_5.anInt7413) {
					if (arg0 > 0) {
						local505 = (float) arg0;
					}
					local689 = (int) ((float) local251 * local477 / local505 + (float) this.aClass143_Sub1_5.anInt7411);
					local696 = (int) (local491 * (float) local255 / local505 + (float) this.aClass143_Sub1_5.anInt7408);
					local698 = this.anIntArray132[local615];
					local707 = this.anIntArray132[local615 + 1];
					for (@Pc(775) int local775 = local698; local775 < local707; local775++) {
						@Pc(784) int local784 = this.aShortArray23[local775] - 1;
						if (local784 == -1) {
							break;
						}
						Static450.anIntArray437[local784] = local689;
						Static178.anIntArray168[local784] = local696;
					}
				} else {
					local689 = this.anIntArray132[local615];
					local696 = this.anIntArray132[local615 + 1];
					for (local698 = local689; local698 < local696; local698++) {
						local707 = this.aShortArray23[local698] - 1;
						if (local707 == -1) {
							break;
						}
						Static450.anIntArray437[this.aShortArray23[local698] - 1] = -999999;
					}
				}
			}
			for (local689 = 0; local689 < this.anInt2632; local689++) {
				if (Static450.anIntArray437[this.aShortArray20[local689]] != -999999 && Static450.anIntArray437[this.aShortArray26[local689]] != -999999 && Static450.anIntArray437[this.aShortArray25[local689]] != -999999 && this.method2362(Static450.anIntArray437[this.aShortArray26[local689]], Static450.anIntArray437[this.aShortArray25[local689]], arg5, Static178.anIntArray168[this.aShortArray25[local689]], Static178.anIntArray168[this.aShortArray20[local689]], arg3, Static178.anIntArray168[this.aShortArray26[local689]], Static450.anIntArray437[this.aShortArray20[local689]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ff", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort29 = (short) arg0;
		this.method2352();
		this.method2361();
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
	private void method2367() {
		if (this.aClass294_1 != null) {
			this.aClass294_1.aBoolean610 = false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2632; local7++) {
			local16 = this.aShortArray16[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 -= -((arg1 - local28) * arg3 >> 7);
			}
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(62) int local62 = local16 & 0x7F;
			if (arg2 != -1) {
				local62 += arg3 * (arg2 - local62) >> 7;
			}
			this.aShortArray16[local7] = (short) (local22 << 10 | local28 << 7 | local62);
		}
		if (this.aClass222Array1 != null) {
			for (local16 = 0; local16 < this.anInt2593; local16++) {
				@Pc(112) Class222 local112 = this.aClass222Array1[local16];
				@Pc(117) Class98 local117 = this.aClass98Array1[local16];
				local117.anInt2257 = Static6.anIntArray6[this.aShortArray16[local112.anInt6182] & 0xFFFF] & 0xFFFFFF | local117.anInt2257 & 0xFF000000;
			}
		}
		this.method2360();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!eh;Lclient!sp;I)V")
	@Override
	public void method8801(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class41_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2579 == 0) {
			return;
		}
		@Pc(16) Class56_Sub2 local16 = this.aClass143_Sub1_5.aClass56_Sub2_16;
		if (!this.aBoolean182) {
			this.method2350();
		}
		@Pc(25) Class56_Sub2 local25 = (Class56_Sub2) arg0;
		Static347.aFloat119 = local16.aFloat153 + local16.aFloat155 * local25.aFloat153 + local25.aFloat152 * local16.aFloat154 + local25.aFloat159 * local16.aFloat150;
		Static203.aFloat52 = local25.aFloat154 * local16.aFloat155 + local16.aFloat154 * local25.aFloat149 + local25.aFloat158 * local16.aFloat150;
		@Pc(72) float local72 = Static347.aFloat119 + Static203.aFloat52 * (float) this.anInt2565;
		@Pc(80) float local80 = Static347.aFloat119 + Static203.aFloat52 * (float) this.anInt2623;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = local72 + (float) this.anInt2634;
			local97 = local80 - (float) this.anInt2634;
		} else {
			local90 = local80 + (float) this.anInt2634;
			local97 = (float) -this.anInt2634 + local72;
		}
		if (this.aClass143_Sub1_5.bf <= local97 || local90 <= (float) this.aClass143_Sub1_5.anInt7413) {
			return;
		}
		Static520.aFloat162 = local25.aFloat153 * local16.aFloat151 + local25.aFloat159 * local16.aFloat148 + local25.aFloat152 * local16.aFloat158 + local16.aFloat159;
		Static361.aFloat120 = local25.aFloat154 * local16.aFloat151 + local25.aFloat158 * local16.aFloat148 + local25.aFloat149 * local16.aFloat158;
		@Pc(173) float local173 = Static520.aFloat162 + Static361.aFloat120 * (float) this.anInt2565;
		@Pc(181) float local181 = (float) this.anInt2623 * Static361.aFloat120 + Static520.aFloat162;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local173 > local181) {
			local208 = (float) this.aClass143_Sub1_5.anInt7403 * ((float) this.anInt2634 + local173);
			local197 = (float) this.aClass143_Sub1_5.anInt7403 * (local181 - (float) this.anInt2634);
		} else {
			local197 = (float) this.aClass143_Sub1_5.anInt7403 * ((float) -this.anInt2634 + local173);
			local208 = (float) this.aClass143_Sub1_5.anInt7403 * (local181 + (float) this.anInt2634);
		}
		if (this.aClass143_Sub1_5.aFloat138 <= local197 / local90 || local208 / local90 <= this.aClass143_Sub1_5.aFloat139) {
			return;
		}
		Static543.aFloat168 = local16.aFloat157 * local25.aFloat154 + local25.aFloat149 * local16.aFloat149 + local25.aFloat158 * local16.aFloat156;
		Static637.aFloat195 = local16.aFloat152 + local25.aFloat159 * local16.aFloat156 + local25.aFloat152 * local16.aFloat149 + local25.aFloat153 * local16.aFloat157;
		@Pc(297) float local297 = Static543.aFloat168 * (float) this.anInt2565 + Static637.aFloat195;
		@Pc(305) float local305 = Static637.aFloat195 + Static543.aFloat168 * (float) this.anInt2623;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local305 < local297) {
			local320 = (float) this.aClass143_Sub1_5.anInt7389 * (local305 - (float) this.anInt2634);
			local331 = ((float) this.anInt2634 + local297) * (float) this.aClass143_Sub1_5.anInt7389;
		} else {
			local320 = (local297 - (float) this.anInt2634) * (float) this.aClass143_Sub1_5.anInt7389;
			local331 = (local305 + (float) this.anInt2634) * (float) this.aClass143_Sub1_5.anInt7389;
		}
		if (local320 / local90 >= this.aClass143_Sub1_5.aFloat133 || local331 / local90 <= this.aClass143_Sub1_5.aFloat131) {
			return;
		}
		if (arg1 != null || this.aClass222Array1 != null) {
			Static71.aFloat28 = local16.aFloat157 * local25.aFloat155 + local25.aFloat157 * local16.aFloat149 + local16.aFloat156 * local25.aFloat151;
			Static34.aFloat6 = local16.aFloat150 * local25.aFloat151 + local16.aFloat154 * local25.aFloat157 + local16.aFloat155 * local25.aFloat155;
			Static515.aFloat56 = local25.aFloat150 * local16.aFloat155 + local16.aFloat154 * local25.aFloat156 + local25.aFloat148 * local16.aFloat150;
			Static49.aFloat9 = local25.aFloat156 * local16.aFloat158 + local25.aFloat148 * local16.aFloat148 + local25.aFloat150 * local16.aFloat151;
			Static12.aFloat199 = local16.aFloat151 * local25.aFloat155 + local16.aFloat148 * local25.aFloat151 + local25.aFloat157 * local16.aFloat158;
			Static425.aFloat145 = local16.aFloat156 * local25.aFloat148 + local25.aFloat156 * local16.aFloat149 + local25.aFloat150 * local16.aFloat157;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.lb + this.anInt2626 >> 1;
			@Pc(508) int local508 = this.anInt2618 + this.anInt2637 >> 1;
			@Pc(527) int local527 = (int) (Static520.aFloat162 + (float) local500 * Static49.aFloat9 + Static361.aFloat120 * (float) this.anInt2565 + Static12.aFloat199 * (float) local508);
			@Pc(546) int local546 = (int) ((float) local508 * Static71.aFloat28 + Static425.aFloat145 * (float) local500 + Static637.aFloat195 + (float) this.anInt2565 * Static543.aFloat168);
			@Pc(565) int local565 = (int) (Static34.aFloat6 * (float) local508 + (float) this.anInt2565 * Static203.aFloat52 + (float) local500 * Static515.aFloat56 + Static347.aFloat119);
			if (local565 < this.aClass143_Sub1_5.anInt7413) {
				local490 = true;
			} else {
				arg1.anInt8965 = this.aClass143_Sub1_5.anInt7403 * local527 / local565 + this.aClass143_Sub1_5.anInt7411;
				arg1.anInt8966 = this.aClass143_Sub1_5.anInt7389 * local546 / local565 + this.aClass143_Sub1_5.anInt7408;
			}
			@Pc(619) int local619 = (int) (Static361.aFloat120 * (float) this.anInt2623 + Static520.aFloat162 + (float) local500 * Static49.aFloat9 + (float) local508 * Static12.aFloat199);
			@Pc(638) int local638 = (int) (Static71.aFloat28 * (float) local508 + Static637.aFloat195 + Static425.aFloat145 * (float) local500 + (float) this.anInt2623 * Static543.aFloat168);
			@Pc(657) int local657 = (int) ((float) this.anInt2623 * Static203.aFloat52 + Static515.aFloat56 * (float) local500 + Static347.aFloat119 + Static34.aFloat6 * (float) local508);
			if (local657 < this.aClass143_Sub1_5.anInt7413) {
				local490 = true;
			} else {
				arg1.anInt8964 = this.aClass143_Sub1_5.anInt7403 * local619 / local657 + this.aClass143_Sub1_5.anInt7411;
				arg1.anInt8963 = this.aClass143_Sub1_5.anInt7408 + local638 * this.aClass143_Sub1_5.anInt7389 / local657;
			}
			if (local490) {
				if (local565 < this.aClass143_Sub1_5.anInt7413 && local657 < this.aClass143_Sub1_5.anInt7413) {
					local492 = false;
				} else {
					@Pc(744) int local744;
					@Pc(755) int local755;
					@Pc(781) int local781;
					if (this.aClass143_Sub1_5.anInt7413 > local565) {
						local744 = (local657 - this.aClass143_Sub1_5.anInt7413 << 16) / (local657 - local565);
						local755 = (local744 * (local619 - local527) >> 16) + local619;
						arg1.anInt8965 = this.aClass143_Sub1_5.anInt7403 * local755 / this.aClass143_Sub1_5.anInt7413 + this.aClass143_Sub1_5.anInt7411;
						local781 = (local744 * (local638 - local546) >> 16) + local638;
						arg1.anInt8966 = this.aClass143_Sub1_5.anInt7389 * local781 / this.aClass143_Sub1_5.anInt7413 + this.aClass143_Sub1_5.anInt7408;
					} else if (local657 < this.aClass143_Sub1_5.anInt7413) {
						local744 = (local565 - this.aClass143_Sub1_5.anInt7413 << 16) / (local565 - local657);
						local755 = (local744 * (local527 - local619) >> 16) + local527;
						local781 = local546 + ((local546 - local638) * local744 >> 16);
						arg1.anInt8965 = this.aClass143_Sub1_5.anInt7403 * local755 / this.aClass143_Sub1_5.anInt7413 + this.aClass143_Sub1_5.anInt7411;
						arg1.anInt8966 = local781 * this.aClass143_Sub1_5.anInt7389 / this.aClass143_Sub1_5.anInt7413 + this.aClass143_Sub1_5.anInt7408;
					}
				}
			}
			if (local492) {
				if (local565 > local657) {
					arg1.anInt8962 = this.aClass143_Sub1_5.anInt7403 * (local527 + this.anInt2634) / local565 + this.aClass143_Sub1_5.anInt7411 - arg1.anInt8965;
				} else {
					arg1.anInt8962 = this.aClass143_Sub1_5.anInt7411 + (this.anInt2634 + local619) * this.aClass143_Sub1_5.anInt7403 / local657 - arg1.anInt8964;
				}
				arg1.aBoolean648 = true;
			}
		}
		this.aClass143_Sub1_5.method6365();
		this.aClass143_Sub1_5.method6350(local25);
		this.method2354();
		this.method2353();
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "()V")
	@Override
	protected void method8805() {
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!eh;IZ)V")
	@Override
	public void method8789(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray18 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2631; local14++) {
			if ((arg1 & this.aShortArray18[local14]) != 0) {
				if (arg2) {
					arg0.method8397(this.anIntArray133[local14], this.anIntArray130[local14], this.anIntArray135[local14], local12);
				} else {
					arg0.method8389(this.anIntArray133[local14], this.anIntArray130[local14], this.anIntArray135[local14], local12);
				}
				this.anIntArray133[local14] = local12[0];
				this.anIntArray130[local14] = local12[1];
				this.anIntArray135[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2632; local7++) {
			if (this.aShortArray16[local7] == arg0) {
				this.aShortArray16[local7] = arg1;
			}
		}
		if (this.aClass222Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt2593; local34++) {
				@Pc(41) Class222 local41 = this.aClass222Array1[local34];
				@Pc(46) Class98 local46 = this.aClass98Array1[local34];
				local46.anInt2257 = local46.anInt2257 & 0xFF000000 | Static6.anIntArray6[this.aShortArray16[local41.anInt6182] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method2360();
	}

	@OriginalMember(owner = "client!ff", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray23 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt2628; local12++) {
			this.anIntArray133[local12] <<= 0x4;
			this.anIntArray130[local12] <<= 0x4;
			this.anIntArray135[local12] <<= 0x4;
		}
		Static513.anInt8662 = 0;
		Static586.anInt9626 = 0;
		Static67.anInt1032 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt2599;
	}

	@OriginalMember(owner = "client!ff", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class242.anIntArray384[arg0];
		@Pc(13) int local13 = Class242.anIntArray383[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2631; local15++) {
			@Pc(34) int local34 = this.anIntArray130[local15] * local13 - local9 * this.anIntArray135[local15] >> 14;
			this.anIntArray135[local15] = this.anIntArray135[local15] * local13 + this.anIntArray130[local15] * local9 >> 14;
			this.anIntArray130[local15] = local34;
		}
		this.method2352();
		this.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean182) {
			this.method2350();
		}
		return this.anInt2618;
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "()[Lclient!rf;")
	@Override
	public Class303[] method8806() {
		return this.aClass303Array1;
	}

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2631; local7++) {
			this.anIntArray135[local7] = -this.anIntArray135[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt2579; local29++) {
			this.aShortArray19[local29] = (short) -this.aShortArray19[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt2632; local48++) {
			@Pc(55) short local55 = this.aShortArray20[local48];
			this.aShortArray20[local48] = this.aShortArray25[local48];
			this.aShortArray25[local48] = local55;
		}
		this.method2352();
		this.method2361();
		this.method2367();
		this.aBoolean182 = false;
	}
}
