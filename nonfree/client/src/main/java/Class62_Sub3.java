import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class62_Sub3 extends Class62 {

	@OriginalMember(owner = "client!sk", name = "F", descriptor = "Z")
	private boolean aBoolean662;

	@OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
	private int anInt8482;

	@OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
	private int anInt8483;

	@OriginalMember(owner = "client!sk", name = "ab", descriptor = "I")
	private int anInt8496;

	@OriginalMember(owner = "client!sk", name = "bb", descriptor = "Lclient!gv;")
	private Class142 aClass142_1;

	@OriginalMember(owner = "client!sk", name = "mb", descriptor = "I")
	private int anInt8503;

	@OriginalMember(owner = "client!sk", name = "nb", descriptor = "I")
	private int anInt8504;

	@OriginalMember(owner = "client!sk", name = "ob", descriptor = "I")
	private int anInt8505;

	@OriginalMember(owner = "client!sk", name = "sb", descriptor = "Lclient!gv;")
	private Class142 aClass142_2;

	@OriginalMember(owner = "client!sk", name = "zb", descriptor = "Lclient!dm;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "client!sk", name = "Ab", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_19;

	@OriginalMember(owner = "client!sk", name = "Cb", descriptor = "Lclient!gv;")
	private Class142 aClass142_3;

	@OriginalMember(owner = "client!sk", name = "Db", descriptor = "Z")
	private boolean aBoolean663;

	@OriginalMember(owner = "client!sk", name = "Tb", descriptor = "I")
	private int anInt8522;

	@OriginalMember(owner = "client!sk", name = "Vb", descriptor = "Z")
	private boolean aBoolean665;

	@OriginalMember(owner = "client!sk", name = "Wb", descriptor = "I")
	private int anInt8523;

	@OriginalMember(owner = "client!sk", name = "Xb", descriptor = "I")
	private int anInt8524;

	@OriginalMember(owner = "client!sk", name = "bc", descriptor = "I")
	private int anInt8527;

	@OriginalMember(owner = "client!sk", name = "dc", descriptor = "Lclient!gv;")
	private Class142 aClass142_4;

	@OriginalMember(owner = "client!sk", name = "qc", descriptor = "I")
	private int anInt8536;

	@OriginalMember(owner = "client!sk", name = "Jc", descriptor = "Lclient!jo;")
	private Class185 aClass185_1;

	@OriginalMember(owner = "client!sk", name = "db", descriptor = "[I")
	private int[] anIntArray579;

	@OriginalMember(owner = "client!sk", name = "kc", descriptor = "I")
	private int anInt8533;

	@OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
	private int anInt8490;

	@OriginalMember(owner = "client!sk", name = "Ec", descriptor = "Z")
	private boolean aBoolean667;

	@OriginalMember(owner = "client!sk", name = "Gb", descriptor = "Z")
	private boolean aBoolean664;

	@OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
	private int anInt8479;

	@OriginalMember(owner = "client!sk", name = "ib", descriptor = "[I")
	private int[] anIntArray580;

	@OriginalMember(owner = "client!sk", name = "rb", descriptor = "[I")
	private int[] anIntArray581;

	@OriginalMember(owner = "client!sk", name = "Kb", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
	private int anInt8489;

	@OriginalMember(owner = "client!sk", name = "nc", descriptor = "[I")
	private int[] anIntArray584;

	@OriginalMember(owner = "client!sk", name = "Zb", descriptor = "[Lclient!mk;")
	private Class235[] aClass235Array4;

	@OriginalMember(owner = "client!sk", name = "fc", descriptor = "[Lclient!ir;")
	private Class170[] aClass170Array4;

	@OriginalMember(owner = "client!sk", name = "cc", descriptor = "I")
	private int anInt8528;

	@OriginalMember(owner = "client!sk", name = "Sb", descriptor = "[Lclient!ej;")
	private Class93[] aClass93Array1;

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "[Lclient!gs;")
	private Class140[] aClass140Array1;

	@OriginalMember(owner = "client!sk", name = "xc", descriptor = "[F")
	private float[] aFloatArray62;

	@OriginalMember(owner = "client!sk", name = "yb", descriptor = "[F")
	private float[] aFloatArray61;

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!sk", name = "Ic", descriptor = "S")
	private short aShort112;

	@OriginalMember(owner = "client!sk", name = "Ib", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!sk", name = "jb", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!sk", name = "A", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!sk", name = "xb", descriptor = "S")
	private short aShort111;

	@OriginalMember(owner = "client!sk", name = "Lb", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!sk", name = "yc", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!sk", name = "Gc", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!sk", name = "W", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!sk", name = "O", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!sk", name = "Bc", descriptor = "[I")
	private int[] anIntArray585;

	@OriginalMember(owner = "client!sk", name = "mc", descriptor = "[I")
	private int[] anIntArray583;

	@OriginalMember(owner = "client!sk", name = "Ub", descriptor = "[I")
	private int[] anIntArray582;

	@OriginalMember(owner = "client!sk", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!sk", name = "lc", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!sk", name = "Bb", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!wg;Lclient!so;IIII)V")
	public Class62_Sub3(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) Class334 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface9 local11 = arg0.anInterface9_12;
		this.anIntArray579 = new int[arg1.anInt8560 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt8557];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt8557; local24++) {
			if (arg1.aByteArray89 == null || arg1.aByteArray89[local24] != 2) {
				if (arg1.aShortArray128 != null && arg1.aShortArray128[local24] != -1) {
					@Pc(56) Class130 local56 = local11.method1558(arg1.aShortArray128[local24] & 0xFFFF);
					if (((this.anInt8524 & 0x40) == 0 || !local56.aBoolean241) && local56.aBoolean238) {
						continue;
					}
				}
				local22[this.anInt8533++] = local24;
				this.anIntArray579[arg1.aShortArray125[local24]]++;
				this.anIntArray579[arg1.aShortArray132[local24]]++;
				this.anIntArray579[arg1.aShortArray130[local24]]++;
			}
		}
		this.anInt8490 = this.anInt8533;
		@Pc(125) long[] local125 = new long[this.anInt8533];
		@Pc(134) boolean local134 = (this.anInt8496 & 0x100) != 0;
		@Pc(146) int local146;
		@Pc(159) int local159;
		@Pc(326) int local326;
		for (@Pc(136) int local136 = 0; local136 < this.anInt8533; local136++) {
			@Pc(142) int local142 = local22[local136];
			@Pc(144) Class130 local144 = null;
			local146 = 0;
			@Pc(148) byte local148 = 0;
			@Pc(150) byte local150 = 0;
			@Pc(152) byte local152 = 0;
			if (arg1.aClass226Array1 != null) {
				@Pc(157) boolean local157 = false;
				for (local159 = 0; local159 < arg1.aClass226Array1.length; local159++) {
					@Pc(166) Class226 local166 = arg1.aClass226Array1[local159];
					if (local142 == local166.anInt5493) {
						@Pc(175) Class150 local175 = Static415.method5232(local166.anInt5502);
						if (local175.aBoolean261) {
							local157 = true;
						}
						if (local175.anInt3546 != -1) {
							@Pc(191) Class130 local191 = local11.method1558(local175.anInt3546);
							if (local191.anInt3119 == 2) {
								this.aBoolean667 = true;
							}
						}
					}
				}
				if (local157) {
					local125[local136] = Long.MAX_VALUE;
					this.anInt8490--;
					continue;
				}
			}
			@Pc(224) short local224 = -1;
			if (arg1.aShortArray128 != null) {
				local224 = arg1.aShortArray128[local142];
				if (local224 != -1) {
					local144 = local11.method1558(local224 & 0xFFFF);
					if ((this.anInt8524 & 0x40) != 0 && local144.aBoolean241) {
						local224 = -1;
						local144 = null;
					} else {
						local152 = local144.aByte35;
						local150 = local144.aByte39;
					}
				}
			}
			@Pc(282) boolean local282 = arg1.aByteArray86 != null && arg1.aByteArray86[local142] != 0 || local144 != null && local144.anInt3119 != 0;
			if ((local134 || local282) && arg1.aByteArray90 != null) {
				local146 += arg1.aByteArray90[local142] << 17;
			}
			if (local282) {
				local146 += 65536;
			}
			local146 += (local150 & 0xFF) << 8;
			local146 += local152 & 0xFF;
			local326 = local148 + ((local224 & 0xFFFF) << 16);
			@Pc(332) int local332 = local326 + (local136 & 0xFFFF);
			local125[local136] = ((long) local146 << 32) + (long) local332;
			this.aBoolean664 |= local144 != null && (local144.aByte34 != 0 || local144.aByte36 != 0);
			this.aBoolean667 |= local282;
		}
		Static254.method3692(local125, local22);
		this.anInt8479 = arg1.anInt8560;
		this.anIntArray580 = arg1.anIntArray596;
		this.anIntArray581 = arg1.anIntArray593;
		this.aShortArray120 = arg1.aShortArray126;
		this.anInt8489 = arg1.anInt8570;
		this.anIntArray584 = arg1.anIntArray589;
		this.aClass235Array4 = arg1.aClass235Array5;
		this.aClass170Array4 = arg1.aClass170Array5;
		@Pc(416) Class363[] local416 = new Class363[this.anInt8479];
		@Pc(436) int local436;
		@Pc(450) int local450;
		@Pc(488) int local488;
		if (arg1.aClass226Array1 != null) {
			this.anInt8528 = arg1.aClass226Array1.length;
			this.aClass93Array1 = new Class93[this.anInt8528];
			this.aClass140Array1 = new Class140[this.anInt8528];
			for (local436 = 0; local436 < this.anInt8528; local436++) {
				@Pc(443) Class226 local443 = arg1.aClass226Array1[local436];
				@Pc(448) Class150 local448 = Static415.method5232(local443.anInt5502);
				local450 = -1;
				for (@Pc(452) int local452 = 0; local452 < this.anInt8533; local452++) {
					if (local22[local452] == local443.anInt5493) {
						local450 = local452;
						break;
					}
				}
				if (local450 == -1) {
					throw new RuntimeException();
				}
				local488 = Static411.anIntArray448[arg1.aShortArray129[local443.anInt5493] & 0xFFFF] & 0xFFFFFF;
				@Pc(506) int local506 = local488 | 255 - (arg1.aByteArray86 == null ? 0 : arg1.aByteArray86[local443.anInt5493]) << 24;
				this.aClass93Array1[local436] = new Class93(local450, arg1.aShortArray125[local443.anInt5493], arg1.aShortArray132[local443.anInt5493], arg1.aShortArray130[local443.anInt5493], local448.anInt3544, local448.anInt3549, local448.anInt3546, local448.anInt3545, local448.anInt3548, local448.aBoolean261, local448.aBoolean262, local443.anInt5494);
				this.aClass140Array1[local436] = new Class140(local506);
			}
		}
		local436 = this.anInt8533 * 3;
		this.aFloatArray62 = new float[local436];
		this.aFloatArray61 = new float[local436];
		this.aShortArray115 = new short[this.anInt8533];
		this.aShort112 = (short) arg4;
		this.aShortArray119 = new short[this.anInt8533];
		this.aShortArray112 = new short[local436];
		this.aShortArray113 = new short[this.anInt8533];
		this.aShortArray118 = new short[local436];
		this.aShortArray114 = new short[local436];
		this.aShort111 = (short) arg3;
		if (arg1.aShortArray127 != null) {
			this.aShortArray121 = new short[this.anInt8533];
		}
		this.aByteArray84 = new byte[local436];
		this.aShortArray111 = new short[local436];
		this.aShortArray122 = new short[local436];
		Static655.aLongArray20 = new long[local436];
		this.aShortArray123 = new short[local436];
		this.aByteArray83 = new byte[this.anInt8533];
		this.aShortArray117 = new short[this.anInt8533];
		this.aShortArray116 = new short[this.anInt8533];
		local146 = 0;
		for (local326 = 0; local326 < arg1.anInt8560; local326++) {
			local450 = this.anIntArray579[local326];
			this.anIntArray579[local326] = local146;
			local146 += local450;
			local416[local326] = new Class363();
		}
		this.anIntArray579[arg1.anInt8560] = local146;
		@Pc(692) Class43 local692 = Static469.method6481(arg1, local22, this.anInt8533);
		@Pc(696) Class36[] local696 = new Class36[arg1.anInt8557];
		@Pc(737) int local737;
		@Pc(748) int local748;
		@Pc(759) int local759;
		@Pc(715) short local715;
		@Pc(726) int local726;
		for (local488 = 0; local488 < arg1.anInt8557; local488++) {
			@Pc(705) short local705 = arg1.aShortArray125[local488];
			@Pc(710) short local710 = arg1.aShortArray132[local488];
			local715 = arg1.aShortArray130[local488];
			local726 = this.anIntArray580[local710] - this.anIntArray580[local705];
			local737 = this.anIntArray581[local710] - this.anIntArray581[local705];
			local748 = this.anIntArray584[local710] - this.anIntArray584[local705];
			local759 = this.anIntArray580[local715] - this.anIntArray580[local705];
			@Pc(770) int local770 = this.anIntArray581[local715] - this.anIntArray581[local705];
			@Pc(781) int local781 = this.anIntArray584[local715] - this.anIntArray584[local705];
			@Pc(789) int local789 = local737 * local781 - local748 * local770;
			@Pc(797) int local797 = local759 * local748 - local781 * local726;
			@Pc(806) int local806 = local770 * local726 - local759 * local737;
			while (local789 > 8192 || local797 > 8192 || local806 > 8192 || local789 < -8192 || local797 < -8192 || local806 < -8192) {
				local789 >>= 0x1;
				local806 >>= 0x1;
				local797 >>= 0x1;
			}
			@Pc(856) int local856 = (int) Math.sqrt((double) (local806 * local806 + local789 * local789 + local797 * local797));
			if (local856 <= 0) {
				local856 = 1;
			}
			local789 = local789 * 256 / local856;
			local806 = local806 * 256 / local856;
			local797 = local797 * 256 / local856;
			@Pc(888) byte local888 = arg1.aByteArray89 == null ? 0 : arg1.aByteArray89[local488];
			if (local888 == 0) {
				@Pc(894) Class363 local894 = local416[local705];
				local894.anInt9302 += local789;
				local894.anInt9305 += local806;
				local894.anInt9303++;
				local894.anInt9304 += local797;
				@Pc(922) Class363 local922 = local416[local710];
				local922.anInt9304 += local797;
				local922.anInt9302 += local789;
				local922.anInt9303++;
				local922.anInt9305 += local806;
				@Pc(950) Class363 local950 = local416[local715];
				local950.anInt9303++;
				local950.anInt9305 += local806;
				local950.anInt9302 += local789;
				local950.anInt9304 += local797;
			} else if (local888 == 1) {
				@Pc(987) Class36 local987 = local696[local488] = new Class36();
				local987.anInt1257 = local789;
				local987.anInt1258 = local797;
				local987.anInt1259 = local806;
			}
		}
		@Pc(1009) int local1009;
		@Pc(1052) short local1052;
		for (local159 = 0; local159 < this.anInt8533; local159++) {
			local1009 = local22[local159];
			@Pc(1016) int local1016 = arg1.aShortArray129[local1009] & 0xFFFF;
			if (arg1.aByteArray87 == null) {
				local726 = -1;
			} else {
				local726 = arg1.aByteArray87[local1009];
			}
			if (arg1.aByteArray86 == null) {
				local737 = 0;
			} else {
				local737 = arg1.aByteArray86[local1009] & 0xFF;
			}
			local1052 = arg1.aShortArray128 == null ? -1 : arg1.aShortArray128[local1009];
			if (local1052 != -1 && (this.anInt8524 & 0x40) != 0) {
				@Pc(1068) Class130 local1068 = local11.method1558(local1052 & 0xFFFF);
				if (local1068.aBoolean241) {
					local1052 = -1;
				}
			}
			@Pc(1075) float local1075 = 0.0F;
			@Pc(1077) float local1077 = 0.0F;
			@Pc(1079) float local1079 = 0.0F;
			@Pc(1081) float local1081 = 0.0F;
			@Pc(1083) float local1083 = 0.0F;
			@Pc(1085) float local1085 = 0.0F;
			@Pc(1087) byte local1087 = 0;
			@Pc(1089) byte local1089 = 0;
			@Pc(1091) int local1091 = 0;
			@Pc(1107) byte local1107;
			@Pc(1127) short local1127;
			@Pc(1922) short local1922;
			@Pc(1927) short local1927;
			if (local1052 != -1) {
				if (local726 == -1) {
					local1081 = 1.0F;
					local1087 = 1;
					local1079 = 1.0F;
					local1075 = 0.0F;
					local1083 = 0.0F;
					local1085 = 0.0F;
					local1077 = 1.0F;
					local1089 = 2;
				} else {
					local726 &= 0xFF;
					local1107 = arg1.aByteArray85[local726];
					@Pc(1117) short local1117;
					@Pc(1122) short local1122;
					@Pc(1160) float local1160;
					@Pc(1173) float local1173;
					@Pc(1267) float local1267;
					@Pc(1504) float local1504;
					@Pc(1512) float local1512;
					@Pc(1520) float local1520;
					@Pc(1543) float local1543;
					@Pc(1566) float local1566;
					@Pc(1589) float local1589;
					if (local1107 == 0) {
						local1117 = arg1.aShortArray125[local1009];
						local1122 = arg1.aShortArray132[local1009];
						local1127 = arg1.aShortArray130[local1009];
						local1922 = arg1.aShortArray131[local726];
						local1927 = arg1.aShortArray133[local726];
						@Pc(1932) short local1932 = arg1.aShortArray124[local726];
						@Pc(1938) float local1938 = (float) arg1.anIntArray596[local1922];
						@Pc(1944) float local1944 = (float) arg1.anIntArray593[local1922];
						local1160 = (float) arg1.anIntArray589[local1922];
						local1173 = (float) arg1.anIntArray596[local1927] - local1938;
						local1267 = (float) arg1.anIntArray593[local1927] - local1944;
						@Pc(1975) float local1975 = (float) arg1.anIntArray589[local1927] - local1160;
						@Pc(1983) float local1983 = (float) arg1.anIntArray596[local1932] - local1938;
						@Pc(1992) float local1992 = (float) arg1.anIntArray593[local1932] - local1944;
						@Pc(2000) float local2000 = (float) arg1.anIntArray589[local1932] - local1160;
						@Pc(2008) float local2008 = (float) arg1.anIntArray596[local1117] - local1938;
						@Pc(2016) float local2016 = (float) arg1.anIntArray593[local1117] - local1944;
						@Pc(2024) float local2024 = (float) arg1.anIntArray589[local1117] - local1160;
						@Pc(2032) float local2032 = (float) arg1.anIntArray596[local1122] - local1938;
						@Pc(2040) float local2040 = (float) arg1.anIntArray593[local1122] - local1944;
						local1504 = (float) arg1.anIntArray589[local1122] - local1160;
						local1512 = (float) arg1.anIntArray596[local1127] - local1938;
						local1520 = (float) arg1.anIntArray593[local1127] - local1944;
						local1543 = (float) arg1.anIntArray589[local1127] - local1160;
						local1566 = local1267 * local2000 - local1975 * local1992;
						local1589 = local1983 * local1975 - local2000 * local1173;
						@Pc(2099) float local2099 = local1173 * local1992 - local1267 * local1983;
						@Pc(2107) float local2107 = local2099 * local1992 - local1589 * local2000;
						@Pc(2115) float local2115 = local2000 * local1566 - local2099 * local1983;
						@Pc(2124) float local2124 = local1983 * local1589 - local1992 * local1566;
						@Pc(2138) float local2138 = 1.0F / (local1975 * local2124 + local1267 * local2115 + local1173 * local2107);
						local1079 = local2138 * (local2040 * local2115 + local2032 * local2107 + local2124 * local1504);
						local1083 = local2138 * (local2115 * local1520 + local1512 * local2107 + local2124 * local1543);
						local1075 = (local2024 * local2124 + local2115 * local2016 + local2107 * local2008) * local2138;
						@Pc(2189) float local2189 = local2099 * local1267 - local1975 * local1589;
						@Pc(2197) float local2197 = local1589 * local1173 - local1267 * local1566;
						@Pc(2205) float local2205 = local1566 * local1975 - local2099 * local1173;
						@Pc(2219) float local2219 = 1.0F / (local2205 * local1992 + local1983 * local2189 + local2000 * local2197);
						local1077 = local2219 * (local2197 * local2024 + local2008 * local2189 + local2016 * local2205);
						local1081 = (local2205 * local2040 + local2032 * local2189 + local2197 * local1504) * local2219;
						local1085 = local2219 * (local1543 * local2197 + local1512 * local2189 + local2205 * local1520);
					} else {
						local1117 = arg1.aShortArray125[local1009];
						local1122 = arg1.aShortArray132[local1009];
						local1127 = arg1.aShortArray130[local1009];
						@Pc(1132) int local1132 = local692.anIntArray95[local726];
						@Pc(1137) int local1137 = local692.anIntArray94[local726];
						@Pc(1142) int local1142 = local692.anIntArray96[local726];
						@Pc(1147) float[] local1147 = local692.aFloatArrayArray8[local726];
						@Pc(1152) byte local1152 = arg1.aByteArray91[local726];
						local1160 = (float) arg1.anIntArray590[local726] / 256.0F;
						if (local1107 == 1) {
							local1173 = (float) arg1.anIntArray595[local726] / 1024.0F;
							Static242.method3575(arg1.anIntArray593[local1117], local1173, local1137, local1147, local1160, local1142, local1132, arg1.anIntArray589[local1117], Static646.aFloatArray77, local1152, arg1.anIntArray596[local1117]);
							local1077 = Static646.aFloatArray77[1];
							local1075 = Static646.aFloatArray77[0];
							Static242.method3575(arg1.anIntArray593[local1122], local1173, local1137, local1147, local1160, local1142, local1132, arg1.anIntArray589[local1122], Static646.aFloatArray77, local1152, arg1.anIntArray596[local1122]);
							local1081 = Static646.aFloatArray77[1];
							local1079 = Static646.aFloatArray77[0];
							Static242.method3575(arg1.anIntArray593[local1127], local1173, local1137, local1147, local1160, local1142, local1132, arg1.anIntArray589[local1127], Static646.aFloatArray77, local1152, arg1.anIntArray596[local1127]);
							local1085 = Static646.aFloatArray77[1];
							local1083 = Static646.aFloatArray77[0];
							local1267 = local1173 / 2.0F;
							if ((local1152 & 0x1) == 0) {
								if (local1083 - local1075 > local1267) {
									local1089 = 1;
									local1083 -= local1173;
								} else if (local1075 - local1083 > local1267) {
									local1089 = 2;
									local1083 += local1173;
								}
								if (local1267 < local1079 - local1075) {
									local1087 = 1;
									local1079 -= local1173;
								} else if (local1267 < local1075 - local1079) {
									local1087 = 2;
									local1079 += local1173;
								}
							} else {
								if (local1267 < local1085 - local1077) {
									local1085 -= local1173;
									local1089 = 1;
								} else if (local1267 < local1077 - local1085) {
									local1085 += local1173;
									local1089 = 2;
								}
								if (local1081 - local1077 > local1267) {
									local1087 = 1;
									local1081 -= local1173;
								} else if (local1077 - local1081 > local1267) {
									local1081 += local1173;
									local1087 = 2;
								}
							}
						} else if (local1107 == 2) {
							local1173 = (float) arg1.anIntArray597[local726] / 256.0F;
							local1267 = (float) arg1.anIntArray592[local726] / 256.0F;
							@Pc(1416) int local1416 = arg1.anIntArray596[local1122] - arg1.anIntArray596[local1117];
							@Pc(1426) int local1426 = arg1.anIntArray593[local1122] - arg1.anIntArray593[local1117];
							@Pc(1437) int local1437 = arg1.anIntArray589[local1122] - arg1.anIntArray589[local1117];
							@Pc(1448) int local1448 = arg1.anIntArray596[local1127] - arg1.anIntArray596[local1117];
							@Pc(1459) int local1459 = arg1.anIntArray593[local1127] - arg1.anIntArray593[local1117];
							@Pc(1470) int local1470 = arg1.anIntArray589[local1127] - arg1.anIntArray589[local1117];
							@Pc(1478) int local1478 = local1426 * local1470 - local1437 * local1459;
							@Pc(1487) int local1487 = local1448 * local1437 - local1470 * local1416;
							@Pc(1496) int local1496 = local1459 * local1416 - local1426 * local1448;
							local1504 = 64.0F / (float) arg1.anIntArray599[local726];
							local1512 = 64.0F / (float) arg1.anIntArray594[local726];
							local1520 = 64.0F / (float) arg1.anIntArray595[local726];
							local1543 = ((float) local1496 * local1147[2] + (float) local1478 * local1147[0] + (float) local1487 * local1147[1]) / local1504;
							local1566 = ((float) local1487 * local1147[4] + local1147[3] * (float) local1478 + (float) local1496 * local1147[5]) / local1512;
							local1589 = ((float) local1496 * local1147[8] + (float) local1478 * local1147[6] + local1147[7] * (float) local1487) / local1520;
							local1091 = Static126.method2247(local1566, local1543, local1589);
							Static184.method2920(local1173, arg1.anIntArray596[local1117], local1147, local1152, Static646.aFloatArray77, local1137, local1267, local1142, local1091, local1160, local1132, arg1.anIntArray593[local1117], arg1.anIntArray589[local1117]);
							local1077 = Static646.aFloatArray77[1];
							local1075 = Static646.aFloatArray77[0];
							Static184.method2920(local1173, arg1.anIntArray596[local1122], local1147, local1152, Static646.aFloatArray77, local1137, local1267, local1142, local1091, local1160, local1132, arg1.anIntArray593[local1122], arg1.anIntArray589[local1122]);
							local1079 = Static646.aFloatArray77[0];
							local1081 = Static646.aFloatArray77[1];
							Static184.method2920(local1173, arg1.anIntArray596[local1127], local1147, local1152, Static646.aFloatArray77, local1137, local1267, local1142, local1091, local1160, local1132, arg1.anIntArray593[local1127], arg1.anIntArray589[local1127]);
							local1083 = Static646.aFloatArray77[0];
							local1085 = Static646.aFloatArray77[1];
						} else if (local1107 == 3) {
							Static364.method4832(arg1.anIntArray593[local1117], local1152, local1132, local1147, Static646.aFloatArray77, local1160, local1137, local1142, arg1.anIntArray589[local1117], arg1.anIntArray596[local1117]);
							local1077 = Static646.aFloatArray77[1];
							local1075 = Static646.aFloatArray77[0];
							Static364.method4832(arg1.anIntArray593[local1122], local1152, local1132, local1147, Static646.aFloatArray77, local1160, local1137, local1142, arg1.anIntArray589[local1122], arg1.anIntArray596[local1122]);
							local1081 = Static646.aFloatArray77[1];
							local1079 = Static646.aFloatArray77[0];
							Static364.method4832(arg1.anIntArray593[local1127], local1152, local1132, local1147, Static646.aFloatArray77, local1160, local1137, local1142, arg1.anIntArray589[local1127], arg1.anIntArray596[local1127]);
							local1083 = Static646.aFloatArray77[0];
							local1085 = Static646.aFloatArray77[1];
							if ((local1152 & 0x1) == 0) {
								if (local1083 - local1075 > 0.5F) {
									local1089 = 1;
									local1083--;
								} else if (local1075 - local1083 > 0.5F) {
									local1089 = 2;
									local1083++;
								}
								if (local1079 - local1075 > 0.5F) {
									local1079--;
									local1087 = 1;
								} else if (local1075 - local1079 > 0.5F) {
									local1087 = 2;
									local1079++;
								}
							} else {
								if (local1081 - local1077 > 0.5F) {
									local1087 = 1;
									local1081--;
								} else if (local1077 - local1081 > 0.5F) {
									local1087 = 2;
									local1081++;
								}
								if (local1085 - local1077 > 0.5F) {
									local1089 = 1;
									local1085--;
								} else if (local1077 - local1085 > 0.5F) {
									local1089 = 2;
									local1085++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray89 == null) {
				local1107 = 0;
			} else {
				local1107 = arg1.aByteArray89[local1009];
			}
			if (local1107 == 0) {
				@Pc(2444) long local2444 = (long) (local726 << 2) + ((long) (local1016 << 8) + (long) (local1091 << 24) + (long) local737 << 32);
				local1127 = arg1.aShortArray125[local1009];
				local1922 = arg1.aShortArray132[local1009];
				local1927 = arg1.aShortArray130[local1009];
				@Pc(2463) Class363 local2463 = local416[local1127];
				this.aShortArray115[local159] = this.method7363(local1077, local2463.anInt9303, local2444, local1075, local159, local2463.anInt9302, local1127, local2463.anInt9304, arg1, local2463.anInt9305);
				@Pc(2488) Class363 local2488 = local416[local1922];
				this.aShortArray113[local159] = this.method7363(local1081, local2488.anInt9303, (long) local1087 + local2444, local1079, local159, local2488.anInt9302, local1922, local2488.anInt9304, arg1, local2488.anInt9305);
				@Pc(2516) Class363 local2516 = local416[local1927];
				this.aShortArray116[local159] = this.method7363(local1085, local2516.anInt9303, (long) local1089 + local2444, local1083, local159, local2516.anInt9302, local1927, local2516.anInt9304, arg1, local2516.anInt9305);
			} else if (local1107 == 1) {
				@Pc(2300) Class36 local2300 = local696[local1009];
				@Pc(2345) long local2345 = (long) ((local2300.anInt1259 + 256 << 22) + (local2300.anInt1258 + 256 << 12) + (local726 << 2) + (local2300.anInt1257 <= 0 ? 2048 : 1024)) + ((long) local737 + (long) (local1091 << 24) + (long) (local1016 << 8) << 32);
				this.aShortArray115[local159] = this.method7363(local1077, 0, local2345, local1075, local159, local2300.anInt1257, arg1.aShortArray125[local1009], local2300.anInt1258, arg1, local2300.anInt1259);
				this.aShortArray113[local159] = this.method7363(local1081, 0, local2345 + (long) local1087, local1079, local159, local2300.anInt1257, arg1.aShortArray132[local1009], local2300.anInt1258, arg1, local2300.anInt1259);
				this.aShortArray116[local159] = this.method7363(local1085, 0, (long) local1089 + local2345, local1083, local159, local2300.anInt1257, arg1.aShortArray130[local1009], local2300.anInt1258, arg1, local2300.anInt1259);
			}
			if (arg1.aByteArray86 != null) {
				this.aByteArray83[local159] = arg1.aByteArray86[local1009];
			}
			if (arg1.aShortArray127 != null) {
				this.aShortArray121[local159] = arg1.aShortArray127[local1009];
			}
			this.aShortArray119[local159] = arg1.aShortArray129[local1009];
			this.aShortArray117[local159] = local1052;
		}
		if (this.anInt8490 > 0) {
			local1009 = 1;
			local715 = this.aShortArray117[0];
			for (local726 = 0; local726 < this.anInt8490; local726++) {
				@Pc(2606) short local2606 = this.aShortArray117[local726];
				if (local715 != local2606) {
					local1009++;
					local715 = local2606;
				}
			}
			this.anIntArray585 = new int[local1009 + 1];
			this.anIntArray583 = new int[local1009];
			this.anIntArray582 = new int[local1009];
			this.anIntArray585[0] = 0;
			local737 = this.anInt8536;
			local715 = this.aShortArray117[0];
			local1009 = 0;
			local1052 = 0;
			for (local759 = 0; local759 < this.anInt8490; local759++) {
				@Pc(2661) short local2661 = this.aShortArray117[local759];
				if (local2661 != local715) {
					this.anIntArray583[local1009] = local737;
					this.anIntArray582[local1009] = local1052 + 1 - local737;
					local1009++;
					this.anIntArray585[local1009] = local759;
					local1052 = 0;
					local737 = this.anInt8536;
					local715 = local2661;
				}
				@Pc(2697) short local2697 = this.aShortArray115[local759];
				if (local2697 < local737) {
					local737 = local2697;
				}
				if (local2697 > local1052) {
					local1052 = local2697;
				}
				local2697 = this.aShortArray113[local759];
				if (local2697 < local737) {
					local737 = local2697;
				}
				if (local1052 < local2697) {
					local1052 = local2697;
				}
				local2697 = this.aShortArray116[local759];
				if (local737 > local2697) {
					local737 = local2697;
				}
				if (local1052 < local2697) {
					local1052 = local2697;
				}
			}
			this.anIntArray583[local1009] = local737;
			this.anIntArray582[local1009] = local1052 + 1 - local737;
			local1009++;
			this.anIntArray585[local1009] = this.anInt8490;
		}
		Static655.aLongArray20 = null;
		this.aShortArray114 = Static391.method5051(this.aShortArray114, this.anInt8536);
		this.aShortArray111 = Static391.method5051(this.aShortArray111, this.anInt8536);
		this.aShortArray118 = Static391.method5051(this.aShortArray118, this.anInt8536);
		this.aShortArray123 = Static391.method5051(this.aShortArray123, this.anInt8536);
		this.aShortArray112 = Static391.method5051(this.aShortArray112, this.anInt8536);
		this.aByteArray84 = Static286.method4119(this.anInt8536, this.aByteArray84);
		this.aFloatArray61 = Static594.method7815(this.anInt8536, this.aFloatArray61);
		this.aFloatArray62 = Static594.method7815(this.anInt8536, this.aFloatArray62);
		if (arg1.anIntArray591 != null && Static410.method5172(arg2, this.anInt8524)) {
			this.anIntArrayArray52 = arg1.method7392(false);
		}
		if (arg1.aClass226Array1 != null && Static453.method6389(arg2, this.anInt8524)) {
			this.anIntArrayArray54 = arg1.method7380();
		}
		if (arg1.anIntArray588 != null && Static135.method2425(this.anInt8524, arg2)) {
			local1009 = 0;
			@Pc(2893) int[] local2893 = new int[256];
			for (local726 = 0; local726 < this.anInt8533; local726++) {
				local737 = arg1.anIntArray588[local22[local726]];
				if (local737 >= 0) {
					if (local737 > local1009) {
						local1009 = local737;
					}
					@Pc(2918) int local2918 = local2893[local737]++;
				}
			}
			this.anIntArrayArray53 = new int[local1009 + 1][];
			for (local737 = 0; local737 <= local1009; local737++) {
				this.anIntArrayArray53[local737] = new int[local2893[local737]];
				local2893[local737] = 0;
			}
			for (local748 = 0; local748 < this.anInt8533; local748++) {
				local759 = arg1.anIntArray588[local22[local748]];
				if (local759 >= 0) {
					this.anIntArrayArray53[local759][local2893[local759]++] = local748;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!wg;IIZZ)V")
	public Class62_Sub3(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8479 = 0;
		this.anInt8490 = 0;
		this.anInt8489 = 0;
		this.aBoolean662 = true;
		this.aBoolean665 = false;
		this.anInt8533 = 0;
		this.aBoolean667 = false;
		this.aBoolean664 = false;
		this.anInt8536 = 0;
		this.aBoolean663 = false;
		this.anInt8496 = arg1;
		this.aClass33_Sub2_19 = arg0;
		this.anInt8524 = arg2;
		this.aBoolean665 = arg4;
		if (arg3 || Static598.method7849(this.anInt8496, this.anInt8524)) {
			this.aClass142_4 = new Class142(Static567.method7517(this.anInt8496, this.anInt8524));
		}
		if (arg3 || Static329.method4555(this.anInt8524, this.anInt8496)) {
			this.aClass142_3 = new Class142(Static52.method1026(this.anInt8524, this.anInt8496));
		}
		if (arg3 || Static483.method6619(this.anInt8524, this.anInt8496)) {
			this.aClass142_1 = new Class142(Static425.method5897(this.anInt8524, this.anInt8496));
		}
		if (arg3 || Static654.method8725(this.anInt8496, this.anInt8524)) {
			this.aClass142_2 = new Class142(Static678.method8983(this.anInt8524, this.anInt8496));
		}
		if (arg3 || Static540.method7231(this.anInt8496, this.anInt8524)) {
			this.aClass70_1 = new Class70(Static345.method4663(this.anInt8524, this.anInt8496));
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!nh;Lclient!gca;I)V")
	@Override
	public void method7335(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8536 == 0) {
			return;
		}
		@Pc(16) Class92_Sub1 local16 = this.aClass33_Sub2_19.aClass92_Sub1_16;
		if (!this.aBoolean663) {
			this.method7354();
		}
		@Pc(25) Class92_Sub1 local25 = (Class92_Sub1) arg0;
		Static293.aFloat109 = local25.aFloat41 * local16.aFloat46 + local16.aFloat48 * local25.aFloat51 + local25.aFloat40 * local16.aFloat41;
		Static210.aFloat72 = local25.aFloat44 * local16.aFloat46 + local16.aFloat41 * local25.aFloat42 + local16.aFloat48 * local25.aFloat50 + local16.aFloat44;
		@Pc(72) float local72 = Static210.aFloat72 + (float) this.anInt8483 * Static293.aFloat109;
		@Pc(80) float local80 = Static293.aFloat109 * (float) this.anInt8527 + Static210.aFloat72;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local91 = (float) -this.anInt8505 + local80;
			local97 = local72 + (float) this.anInt8505;
		} else {
			local91 = (float) -this.anInt8505 + local72;
			local97 = (float) this.anInt8505 + local80;
		}
		if (this.aClass33_Sub2_19.aFloat222 <= local91 || local97 <= (float) this.aClass33_Sub2_19.anInt9679) {
			return;
		}
		Static576.aFloat203 = local16.aFloat50 + local25.aFloat42 * local16.aFloat51 + local25.aFloat50 * local16.aFloat49 + local16.aFloat45 * local25.aFloat44;
		Static334.aFloat188 = local25.aFloat41 * local16.aFloat45 + local16.aFloat49 * local25.aFloat51 + local25.aFloat40 * local16.aFloat51;
		@Pc(174) float local174 = Static576.aFloat203 + Static334.aFloat188 * (float) this.anInt8483;
		@Pc(182) float local182 = Static334.aFloat188 * (float) this.anInt8527 + Static576.aFloat203;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local182 < local174) {
			local209 = (local182 - (float) this.anInt8505) * (float) this.aClass33_Sub2_19.anInt9663;
			local197 = (local174 + (float) this.anInt8505) * (float) this.aClass33_Sub2_19.anInt9663;
		} else {
			local197 = (float) this.aClass33_Sub2_19.anInt9663 * ((float) this.anInt8505 + local182);
			local209 = ((float) -this.anInt8505 + local174) * (float) this.aClass33_Sub2_19.anInt9663;
		}
		if (local209 / local97 >= this.aClass33_Sub2_19.aFloat219 || this.aClass33_Sub2_19.aFloat211 >= local197 / local97) {
			return;
		}
		Static587.aFloat205 = local25.aFloat40 * local16.aFloat40 + local25.aFloat51 * local16.aFloat47 + local16.aFloat43 * local25.aFloat41;
		Static133.aFloat54 = local16.aFloat47 * local25.aFloat50 + local25.aFloat42 * local16.aFloat40 + local16.aFloat43 * local25.aFloat44 + local16.aFloat42;
		@Pc(298) float local298 = Static133.aFloat54 + Static587.aFloat205 * (float) this.anInt8483;
		@Pc(306) float local306 = Static133.aFloat54 + (float) this.anInt8527 * Static587.aFloat205;
		@Pc(332) float local332;
		@Pc(321) float local321;
		if (local306 < local298) {
			local321 = (float) this.aClass33_Sub2_19.anInt9665 * ((float) this.anInt8505 + local298);
			local332 = (local306 - (float) this.anInt8505) * (float) this.aClass33_Sub2_19.anInt9665;
		} else {
			local332 = (float) this.aClass33_Sub2_19.anInt9665 * (local298 - (float) this.anInt8505);
			local321 = (float) this.aClass33_Sub2_19.anInt9665 * ((float) this.anInt8505 + local306);
		}
		if (local332 / local97 >= this.aClass33_Sub2_19.aFloat221 || local321 / local97 <= this.aClass33_Sub2_19.aFloat223) {
			return;
		}
		if (arg1 != null || this.aClass93Array1 != null) {
			Static376.aFloat122 = local25.aFloat48 * local16.aFloat45 + local25.aFloat49 * local16.aFloat49 + local25.aFloat47 * local16.aFloat51;
			Static141.aFloat57 = local16.aFloat46 * local25.aFloat48 + local25.aFloat49 * local16.aFloat48 + local25.aFloat47 * local16.aFloat41;
			Static298.aFloat201 = local25.aFloat45 * local16.aFloat49 + local16.aFloat51 * local25.aFloat43 + local25.aFloat46 * local16.aFloat45;
			Static304.aFloat232 = local25.aFloat46 * local16.aFloat43 + local16.aFloat47 * local25.aFloat45 + local16.aFloat40 * local25.aFloat43;
			Static542.aFloat198 = local25.aFloat43 * local16.aFloat41 + local16.aFloat48 * local25.aFloat45 + local25.aFloat46 * local16.aFloat46;
			Static651.aFloat233 = local16.aFloat43 * local25.aFloat48 + local16.aFloat40 * local25.aFloat47 + local16.aFloat47 * local25.aFloat49;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.anInt8482 + this.anInt8503 >> 1;
			@Pc(509) int local509 = this.anInt8522 + this.anInt8523 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static298.aFloat201 + Static376.aFloat122 * (float) local501 + Static576.aFloat203 + Static334.aFloat188 * (float) this.anInt8483);
			@Pc(547) int local547 = (int) (Static304.aFloat232 * (float) local509 + Static587.aFloat205 * (float) this.anInt8483 + Static651.aFloat233 * (float) local501 + Static133.aFloat54);
			@Pc(566) int local566 = (int) ((float) this.anInt8483 * Static293.aFloat109 + Static210.aFloat72 + Static141.aFloat57 * (float) local501 + (float) local509 * Static542.aFloat198);
			if (local566 >= this.aClass33_Sub2_19.anInt9679) {
				arg1.anInt3111 = this.aClass33_Sub2_19.anInt9676 + this.aClass33_Sub2_19.anInt9665 * local547 / local566;
				arg1.anInt3114 = this.aClass33_Sub2_19.anInt9666 + local528 * this.aClass33_Sub2_19.anInt9663 / local566;
			} else {
				local491 = true;
			}
			@Pc(625) int local625 = (int) (Static334.aFloat188 * (float) this.anInt8527 + Static576.aFloat203 + Static376.aFloat122 * (float) local501 + Static298.aFloat201 * (float) local509);
			@Pc(644) int local644 = (int) (Static304.aFloat232 * (float) local509 + (float) this.anInt8527 * Static587.aFloat205 + Static133.aFloat54 + (float) local501 * Static651.aFloat233);
			@Pc(663) int local663 = (int) (Static293.aFloat109 * (float) this.anInt8527 + Static141.aFloat57 * (float) local501 + Static210.aFloat72 + (float) local509 * Static542.aFloat198);
			if (this.aClass33_Sub2_19.anInt9679 > local663) {
				local491 = true;
			} else {
				arg1.anInt3115 = local644 * this.aClass33_Sub2_19.anInt9665 / local663 + this.aClass33_Sub2_19.anInt9676;
				arg1.anInt3113 = this.aClass33_Sub2_19.anInt9666 + local625 * this.aClass33_Sub2_19.anInt9663 / local663;
			}
			if (local491) {
				if (this.aClass33_Sub2_19.anInt9679 > local566 && local663 < this.aClass33_Sub2_19.anInt9679) {
					local493 = false;
				} else {
					@Pc(747) int local747;
					@Pc(758) int local758;
					@Pc(770) int local770;
					if (this.aClass33_Sub2_19.anInt9679 > local566) {
						local747 = (local663 - this.aClass33_Sub2_19.anInt9679 << 16) / (local663 - local566);
						local758 = local625 + (local747 * (local625 - local528) >> 16);
						arg1.anInt3114 = local758 * this.aClass33_Sub2_19.anInt9663 / this.aClass33_Sub2_19.anInt9679 + this.aClass33_Sub2_19.anInt9666;
						local770 = (local747 * (local644 - local547) >> 16) + local644;
						arg1.anInt3111 = this.aClass33_Sub2_19.anInt9676 + local770 * this.aClass33_Sub2_19.anInt9665 / this.aClass33_Sub2_19.anInt9679;
					} else if (this.aClass33_Sub2_19.anInt9679 > local663) {
						local747 = (local566 - this.aClass33_Sub2_19.anInt9679 << 16) / (local566 - local663);
						local758 = local528 + (local747 * (local528 - local625) >> 16);
						local770 = local547 + (local747 * (local547 - local644) >> 16);
						arg1.anInt3114 = this.aClass33_Sub2_19.anInt9666 + local758 * this.aClass33_Sub2_19.anInt9663 / this.aClass33_Sub2_19.anInt9679;
						arg1.anInt3111 = this.aClass33_Sub2_19.anInt9676 + local770 * this.aClass33_Sub2_19.anInt9665 / this.aClass33_Sub2_19.anInt9679;
					}
				}
			}
			if (local493) {
				arg1.aBoolean234 = true;
				if (local663 >= local566) {
					arg1.anInt3112 = this.aClass33_Sub2_19.anInt9666 + this.aClass33_Sub2_19.anInt9663 * (local625 + this.anInt8505) / local663 - arg1.anInt3113;
				} else {
					arg1.anInt3112 = this.aClass33_Sub2_19.anInt9666 + (local528 - -this.anInt8505) * this.aClass33_Sub2_19.anInt9663 / local566 - arg1.anInt3114;
				}
			}
		}
		this.aClass33_Sub2_19.method8243();
		this.aClass33_Sub2_19.method8287(local25);
		this.method7368();
		this.method7358();
	}

	@OriginalMember(owner = "client!sk", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort112 = (short) arg0;
		this.method7367();
		this.method7369();
	}

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort111 = (short) arg0;
		this.method7355();
	}

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean664;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	private void method7354() {
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt8479; local21++) {
			@Pc(30) int local30 = this.anIntArray580[local21];
			@Pc(35) int local35 = this.anIntArray581[local21];
			@Pc(40) int local40 = this.anIntArray584[local21];
			if (local35 < local7) {
				local7 = local35;
			}
			if (local30 > local11) {
				local11 = local30;
			}
			if (local35 > local13) {
				local13 = local35;
			}
			if (local30 < local5) {
				local5 = local30;
			}
			if (local40 < local9) {
				local9 = local40;
			}
			if (local15 < local40) {
				local15 = local40;
			}
			@Pc(90) int local90 = local30 * local30 + local40 * local40;
			if (local17 < local90) {
				local17 = local90;
			}
			local90 = local30 * local30 + local40 * local40 + local35 * local35;
			if (local19 < local90) {
				local19 = local90;
			}
		}
		this.anInt8483 = local7;
		this.anInt8523 = local15;
		this.anInt8503 = local5;
		this.anInt8527 = local13;
		this.anInt8482 = local11;
		this.anInt8522 = local9;
		this.anInt8505 = (int) (Math.sqrt((double) local17) + 0.99D);
		this.anInt8504 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.aBoolean663 = true;
	}

	@OriginalMember(owner = "client!sk", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean667;
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "()V")
	@Override
	protected void method7340() {
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	private void method7355() {
		if (this.aClass142_1 != null) {
			this.aClass142_1.aBoolean249 = false;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7339(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class62_Sub3 local8 = (Class62_Sub3) arg0;
		if (this.anInt8533 == 0 || local8.anInt8533 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt8479;
		@Pc(21) int[] local21 = local8.anIntArray580;
		@Pc(24) int[] local24 = local8.anIntArray581;
		@Pc(27) int[] local27 = local8.anIntArray584;
		@Pc(30) short[] local30 = local8.aShortArray118;
		@Pc(33) short[] local33 = local8.aShortArray123;
		@Pc(36) short[] local36 = local8.aShortArray112;
		@Pc(39) byte[] local39 = local8.aByteArray84;
		@Pc(50) short[] local50;
		@Pc(54) short[] local54;
		@Pc(46) short[] local46;
		@Pc(58) byte[] local58;
		if (this.aClass185_1 == null) {
			local46 = null;
			local50 = null;
			local58 = null;
			local54 = null;
		} else {
			local46 = this.aClass185_1.aShortArray64;
			local50 = this.aClass185_1.aShortArray63;
			local54 = this.aClass185_1.aShortArray62;
			local58 = this.aClass185_1.aByteArray50;
		}
		@Pc(75) short[] local75;
		@Pc(83) short[] local83;
		@Pc(87) short[] local87;
		@Pc(79) byte[] local79;
		if (local8.aClass185_1 == null) {
			local83 = null;
			local87 = null;
			local75 = null;
			local79 = null;
		} else {
			local75 = local8.aClass185_1.aShortArray63;
			local79 = local8.aClass185_1.aByteArray50;
			local83 = local8.aClass185_1.aShortArray62;
			local87 = local8.aClass185_1.aShortArray64;
		}
		@Pc(100) int[] local100 = local8.anIntArray579;
		@Pc(103) short[] local103 = local8.aShortArray122;
		if (!local8.aBoolean663) {
			local8.method7354();
		}
		@Pc(112) int local112 = local8.anInt8483;
		@Pc(115) int local115 = local8.anInt8527;
		@Pc(118) int local118 = local8.anInt8503;
		@Pc(121) int local121 = local8.anInt8482;
		@Pc(124) int local124 = local8.anInt8522;
		@Pc(127) int local127 = local8.anInt8523;
		for (@Pc(129) int local129 = 0; local129 < this.anInt8479; local129++) {
			@Pc(139) int local139 = this.anIntArray581[local129] - arg2;
			if (local139 >= local112 && local115 >= local139) {
				@Pc(163) int local163 = this.anIntArray580[local129] - arg1;
				if (local118 <= local163 && local121 >= local163) {
					@Pc(183) int local183 = this.anIntArray584[local129] - arg3;
					if (local183 >= local124 && local183 <= local127) {
						@Pc(197) int local197 = -1;
						@Pc(202) int local202 = this.anIntArray579[local129];
						@Pc(209) int local209 = this.anIntArray579[local129 + 1];
						for (@Pc(211) int local211 = local202; local211 < local209; local211++) {
							local197 = this.aShortArray122[local211] - 1;
							if (local197 == -1 || this.aByteArray84[local197] != 0) {
								break;
							}
						}
						if (local197 != -1) {
							for (@Pc(239) int local239 = 0; local239 < local18; local239++) {
								if (local163 == local21[local239] && local27[local239] == local183 && local24[local239] == local139) {
									local209 = local100[local239 + 1];
									local202 = local100[local239];
									@Pc(276) int local276 = -1;
									for (@Pc(278) int local278 = local202; local278 < local209; local278++) {
										local276 = local103[local278] - 1;
										if (local276 == -1 || local39[local276] != 0) {
											break;
										}
									}
									if (local276 != -1) {
										if (local50 == null) {
											this.aClass185_1 = new Class185();
											local50 = this.aClass185_1.aShortArray63 = Static208.method3119(this.aShortArray118);
											local54 = this.aClass185_1.aShortArray62 = Static208.method3119(this.aShortArray123);
											local46 = this.aClass185_1.aShortArray64 = Static208.method3119(this.aShortArray112);
											local58 = this.aClass185_1.aByteArray50 = Static96.method1972(this.aByteArray84);
										}
										if (local75 == null) {
											@Pc(361) Class185 local361 = local8.aClass185_1 = new Class185();
											local75 = local361.aShortArray63 = Static208.method3119(local30);
											local83 = local361.aShortArray62 = Static208.method3119(local33);
											local87 = local361.aShortArray64 = Static208.method3119(local36);
											local79 = local361.aByteArray50 = Static96.method1972(local39);
										}
										@Pc(394) short local394 = this.aShortArray118[local197];
										@Pc(399) short local399 = this.aShortArray123[local197];
										@Pc(404) short local404 = this.aShortArray112[local197];
										local209 = local100[local239 + 1];
										@Pc(415) byte local415 = this.aByteArray84[local197];
										local202 = local100[local239];
										@Pc(429) int local429;
										for (@Pc(421) int local421 = local202; local421 < local209; local421++) {
											local429 = local103[local421] - 1;
											if (local429 == -1) {
												break;
											}
											if (local79[local429] != 0) {
												local75[local429] += local394;
												local83[local429] += local399;
												local87[local429] += local404;
												local79[local429] += local415;
											}
										}
										local399 = local33[local276];
										local394 = local30[local276];
										local415 = local39[local276];
										local202 = this.anIntArray579[local129];
										local209 = this.anIntArray579[local129 + 1];
										local404 = local36[local276];
										for (local429 = local202; local429 < local209; local429++) {
											@Pc(516) int local516 = this.aShortArray122[local429] - 1;
											if (local516 == -1) {
												break;
											}
											if (local58[local516] != 0) {
												local50[local516] += local394;
												local54[local516] += local399;
												local46[local516] += local404;
												local58[local516] += local415;
											}
										}
										local8.method7369();
										this.method7369();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean663) {
			this.method7354();
		}
		return this.anInt8503;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLclient!hk;)V")
	private void method7356(@OriginalArg(1) Class4_Sub5_Sub9_Sub1 arg0) {
		if (Static400.anIntArray444.length < this.anInt8536) {
			Static112.anIntArray149 = new int[this.anInt8536];
			Static400.anIntArray444 = new int[this.anInt8536];
		}
		@Pc(46) int local46;
		@Pc(85) int local85;
		@Pc(94) int local94;
		for (@Pc(20) int local20 = 0; local20 < this.anInt8479; local20++) {
			local46 = (this.anIntArray580[local20] - (this.aClass33_Sub2_19.anInt9652 * this.anIntArray581[local20] >> 8) >> this.aClass33_Sub2_19.bf) - arg0.anInt3578;
			@Pc(71) int local71 = (this.anIntArray584[local20] - (this.anIntArray581[local20] * this.aClass33_Sub2_19.anInt9680 >> 8) >> this.aClass33_Sub2_19.bf) - arg0.anInt3582;
			@Pc(76) int local76 = this.anIntArray579[local20];
			@Pc(83) int local83 = this.anIntArray579[local20 + 1];
			for (local85 = local76; local85 < local83; local85++) {
				local94 = this.aShortArray122[local85] - 1;
				if (local94 == -1) {
					break;
				}
				Static400.anIntArray444[local94] = local46;
				Static112.anIntArray149[local94] = local71;
			}
		}
		for (local46 = 0; local46 < this.anInt8490; local46++) {
			if (this.aByteArray83 == null || this.aByteArray83[local46] <= 128) {
				@Pc(139) short local139 = this.aShortArray115[local46];
				@Pc(144) short local144 = this.aShortArray113[local46];
				@Pc(149) short local149 = this.aShortArray116[local46];
				local85 = Static400.anIntArray444[local139];
				local94 = Static400.anIntArray444[local144];
				@Pc(161) int local161 = Static400.anIntArray444[local149];
				@Pc(165) int local165 = Static112.anIntArray149[local139];
				@Pc(169) int local169 = Static112.anIntArray149[local144];
				@Pc(173) int local173 = Static112.anIntArray149[local149];
				if (-((local161 - local94) * (-local165 + local169)) + (local85 - local94) * (local169 - local173) > 0) {
					arg0.method3288(local94, local161, local165, local85, local173, local169);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!nh;Lclient!gca;II)V")
	@Override
	public void method7332(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8536 == 0) {
			return;
		}
		@Pc(16) Class92_Sub1 local16 = this.aClass33_Sub2_19.aClass92_Sub1_16;
		@Pc(19) Class92_Sub1 local19 = (Class92_Sub1) arg0;
		if (!this.aBoolean663) {
			this.method7354();
		}
		Static210.aFloat72 = local16.aFloat44 + local16.aFloat46 * local19.aFloat44 + local19.aFloat42 * local16.aFloat41 + local16.aFloat48 * local19.aFloat50;
		Static293.aFloat109 = local16.aFloat41 * local19.aFloat40 + local19.aFloat51 * local16.aFloat48 + local19.aFloat41 * local16.aFloat46;
		@Pc(72) float local72 = Static210.aFloat72 + (float) this.anInt8483 * Static293.aFloat109;
		@Pc(80) float local80 = Static210.aFloat72 + Static293.aFloat109 * (float) this.anInt8527;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local97 = (float) -this.anInt8505 + local80;
			local90 = local72 + (float) this.anInt8505;
		} else {
			local90 = local80 + (float) this.anInt8505;
			local97 = (float) -this.anInt8505 + local72;
		}
		if (local97 >= this.aClass33_Sub2_19.aFloat225 || local90 <= (float) this.aClass33_Sub2_19.anInt9679) {
			return;
		}
		Static576.aFloat203 = local16.aFloat50 + local16.aFloat51 * local19.aFloat42 + local16.aFloat49 * local19.aFloat50 + local16.aFloat45 * local19.aFloat44;
		Static334.aFloat188 = local19.aFloat41 * local16.aFloat45 + local16.aFloat51 * local19.aFloat40 + local16.aFloat49 * local19.aFloat51;
		@Pc(174) float local174 = Static576.aFloat203 + Static334.aFloat188 * (float) this.anInt8483;
		@Pc(182) float local182 = Static334.aFloat188 * (float) this.anInt8527 + Static576.aFloat203;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local182 < local174) {
			local197 = (local182 - (float) this.anInt8505) * (float) this.aClass33_Sub2_19.anInt9663;
			local208 = (float) this.aClass33_Sub2_19.anInt9663 * ((float) this.anInt8505 + local174);
		} else {
			local197 = (float) this.aClass33_Sub2_19.anInt9663 * ((float) -this.anInt8505 + local174);
			local208 = (local182 + (float) this.anInt8505) * (float) this.aClass33_Sub2_19.anInt9663;
		}
		if (local197 / (float) arg2 >= this.aClass33_Sub2_19.aFloat219 || this.aClass33_Sub2_19.aFloat211 >= local208 / (float) arg2) {
			return;
		}
		Static133.aFloat54 = local16.aFloat43 * local19.aFloat44 + local19.aFloat50 * local16.aFloat47 + local16.aFloat40 * local19.aFloat42 + local16.aFloat42;
		Static587.aFloat205 = local19.aFloat41 * local16.aFloat43 + local16.aFloat47 * local19.aFloat51 + local19.aFloat40 * local16.aFloat40;
		@Pc(300) float local300 = Static587.aFloat205 * (float) this.anInt8483 + Static133.aFloat54;
		@Pc(308) float local308 = (float) this.anInt8527 * Static587.aFloat205 + Static133.aFloat54;
		@Pc(334) float local334;
		@Pc(323) float local323;
		if (local300 > local308) {
			local323 = (local300 + (float) this.anInt8505) * (float) this.aClass33_Sub2_19.anInt9665;
			local334 = (float) this.aClass33_Sub2_19.anInt9665 * (local308 - (float) this.anInt8505);
		} else {
			local334 = ((float) -this.anInt8505 + local300) * (float) this.aClass33_Sub2_19.anInt9665;
			local323 = (float) this.aClass33_Sub2_19.anInt9665 * (local308 + (float) this.anInt8505);
		}
		if (local334 / (float) arg2 >= this.aClass33_Sub2_19.aFloat221 || this.aClass33_Sub2_19.aFloat223 >= local323 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass93Array1 != null) {
			Static304.aFloat232 = local16.aFloat43 * local19.aFloat46 + local16.aFloat40 * local19.aFloat43 + local19.aFloat45 * local16.aFloat47;
			Static376.aFloat122 = local16.aFloat45 * local19.aFloat48 + local16.aFloat51 * local19.aFloat47 + local16.aFloat49 * local19.aFloat49;
			Static298.aFloat201 = local16.aFloat51 * local19.aFloat43 + local16.aFloat49 * local19.aFloat45 + local19.aFloat46 * local16.aFloat45;
			Static542.aFloat198 = local16.aFloat48 * local19.aFloat45 + local16.aFloat41 * local19.aFloat43 + local16.aFloat46 * local19.aFloat46;
			Static651.aFloat233 = local19.aFloat48 * local16.aFloat43 + local19.aFloat49 * local16.aFloat47 + local19.aFloat47 * local16.aFloat40;
			Static141.aFloat57 = local16.aFloat48 * local19.aFloat49 + local16.aFloat41 * local19.aFloat47 + local19.aFloat48 * local16.aFloat46;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.anInt8482 + this.anInt8503 >> 1;
			@Pc(510) int local510 = this.anInt8523 + this.anInt8522 >> 1;
			@Pc(529) int local529 = (int) (Static298.aFloat201 * (float) local510 + Static576.aFloat203 + Static376.aFloat122 * (float) local502 + Static334.aFloat188 * (float) this.anInt8483);
			@Pc(548) int local548 = (int) ((float) local510 * Static304.aFloat232 + Static587.aFloat205 * (float) this.anInt8483 + Static133.aFloat54 + Static651.aFloat233 * (float) local502);
			@Pc(567) int local567 = (int) (Static293.aFloat109 * (float) this.anInt8483 + Static210.aFloat72 + (float) local502 * Static141.aFloat57 + Static542.aFloat198 * (float) local510);
			@Pc(586) int local586 = (int) (Static298.aFloat201 * (float) local510 + Static334.aFloat188 * (float) this.anInt8527 + (float) local502 * Static376.aFloat122 + Static576.aFloat203);
			@Pc(605) int local605 = (int) ((float) this.anInt8527 * Static587.aFloat205 + (float) local502 * Static651.aFloat233 + Static133.aFloat54 + Static304.aFloat232 * (float) local510);
			arg1.anInt3115 = this.aClass33_Sub2_19.anInt9676 + local605 * this.aClass33_Sub2_19.anInt9665 / arg2;
			arg1.anInt3114 = this.aClass33_Sub2_19.anInt9666 + local529 * this.aClass33_Sub2_19.anInt9663 / arg2;
			arg1.anInt3113 = this.aClass33_Sub2_19.anInt9663 * local586 / arg2 + this.aClass33_Sub2_19.anInt9666;
			@Pc(664) int local664 = (int) ((float) local502 * Static141.aFloat57 + Static210.aFloat72 + Static293.aFloat109 * (float) this.anInt8527 + (float) local510 * Static542.aFloat198);
			arg1.anInt3111 = this.aClass33_Sub2_19.anInt9676 + this.aClass33_Sub2_19.anInt9665 * local548 / arg2;
			if (this.aClass33_Sub2_19.anInt9679 <= local567 || this.aClass33_Sub2_19.anInt9679 <= local664) {
				arg1.anInt3112 = this.aClass33_Sub2_19.anInt9666 + (local529 - -this.anInt8505) * this.aClass33_Sub2_19.anInt9663 / arg2 - arg1.anInt3114;
				arg1.aBoolean234 = true;
			}
		}
		this.aClass33_Sub2_19.method8164((float) arg2);
		this.aClass33_Sub2_19.method8188();
		this.aClass33_Sub2_19.method8287(local19);
		this.method7368();
		this.method7358();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!nh;IZ)V")
	@Override
	public void method7350(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray120 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8479; local14++) {
			if ((arg1 & this.aShortArray120[local14]) != 0) {
				if (arg2) {
					arg0.method3867(this.anIntArray580[local14], this.anIntArray581[local14], this.anIntArray584[local14], local12);
				} else {
					arg0.method3862(this.anIntArray580[local14], this.anIntArray581[local14], this.anIntArray584[local14], local12);
				}
				this.anIntArray580[local14] = local12[0];
				this.anIntArray581[local14] = local12[1];
				this.anIntArray584[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class4_Sub5_Sub9 ba(@OriginalArg(0) Class4_Sub5_Sub9 arg0) {
		if (this.anInt8536 == 0) {
			return null;
		}
		if (!this.aBoolean663) {
			this.method7354();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass33_Sub2_19.anInt9652 <= 0) {
			local43 = this.anInt8503 - (this.anInt8483 * this.aClass33_Sub2_19.anInt9652 >> 8) >> this.aClass33_Sub2_19.bf;
			local59 = this.anInt8482 - (this.anInt8527 * this.aClass33_Sub2_19.anInt9652 >> 8) >> this.aClass33_Sub2_19.bf;
		} else {
			local43 = this.anInt8503 - (this.anInt8527 * this.aClass33_Sub2_19.anInt9652 >> 8) >> this.aClass33_Sub2_19.bf;
			local59 = this.anInt8482 - (this.aClass33_Sub2_19.anInt9652 * this.anInt8483 >> 8) >> this.aClass33_Sub2_19.bf;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass33_Sub2_19.anInt9680 <= 0) {
			local114 = this.anInt8522 - (this.aClass33_Sub2_19.anInt9680 * this.anInt8483 >> 8) >> this.aClass33_Sub2_19.bf;
			local131 = this.anInt8523 - (this.anInt8527 * this.aClass33_Sub2_19.anInt9680 >> 8) >> this.aClass33_Sub2_19.bf;
		} else {
			local114 = this.anInt8522 - (this.aClass33_Sub2_19.anInt9680 * this.anInt8527 >> 8) >> this.aClass33_Sub2_19.bf;
			local131 = this.anInt8523 - (this.aClass33_Sub2_19.anInt9680 * this.anInt8483 >> 8) >> this.aClass33_Sub2_19.bf;
		}
		@Pc(173) int local173 = local59 + 1 - local43;
		@Pc(179) int local179 = local131 + 1 - local114;
		@Pc(182) Class4_Sub5_Sub9_Sub1 local182 = (Class4_Sub5_Sub9_Sub1) arg0;
		@Pc(198) Class4_Sub5_Sub9_Sub1 local198;
		if (local182 != null && local182.method3290(local179, local173)) {
			local198 = local182;
			local182.method3291();
		} else {
			local198 = new Class4_Sub5_Sub9_Sub1(this.aClass33_Sub2_19, local173, local179);
		}
		local198.method3289(local43, local131, local59, local114);
		this.method7356(local198);
		return local198;
	}

	@OriginalMember(owner = "client!sk", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8489; local3++) {
			this.anIntArray580[local3] = this.anIntArray580[local3] + 7 >> 4;
			this.anIntArray581[local3] = this.anIntArray581[local3] + 7 >> 4;
			this.anIntArray584[local3] = this.anIntArray584[local3] + 7 >> 4;
		}
		this.method7367();
		this.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIB)Z")
	private boolean method7357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 < arg7 && arg2 > arg4 && arg1 > arg4) {
			return false;
		} else if (arg7 < arg4 && arg4 > arg2 && arg1 < arg4) {
			return false;
		} else if (arg3 > arg6 && arg6 < arg5 && arg6 < arg0) {
			return false;
		} else {
			return arg6 <= arg3 || arg5 >= arg6 || arg6 <= arg0;
		}
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(B)V")
	private void method7358() {
		if (this.aClass93Array1 == null) {
			return;
		}
		this.aClass33_Sub2_19.C(!this.aBoolean667);
		this.aClass33_Sub2_19.method8213(false);
		this.aClass33_Sub2_19.method8239(1, Static228.aClass230_2);
		this.aClass33_Sub2_19.method8258(Static228.aClass230_2, 1);
		for (@Pc(34) int local34 = 0; local34 < this.anInt8528; local34++) {
			@Pc(41) Class93 local41 = this.aClass93Array1[local34];
			@Pc(46) Class140 local46 = this.aClass140Array1[local34];
			if (!local41.aBoolean169 || !this.aClass33_Sub2_19.method8136()) {
				@Pc(74) float local74 = (float) (this.anIntArray580[local41.anInt2414] + this.anIntArray580[local41.anInt2413] + this.anIntArray580[local41.anInt2415]) * 0.3333333F;
				@Pc(95) float local95 = (float) (this.anIntArray581[local41.anInt2413] + this.anIntArray581[local41.anInt2415] + this.anIntArray581[local41.anInt2414]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray584[local41.anInt2413] + this.anIntArray584[local41.anInt2415] + this.anIntArray584[local41.anInt2414]) * 0.3333333F;
				@Pc(130) float local130 = local95 * Static334.aFloat188 + Static376.aFloat122 * local74 + local116 * Static298.aFloat201 + Static576.aFloat203;
				@Pc(144) float local144 = local74 * Static651.aFloat233 + Static587.aFloat205 * local95 + local116 * Static304.aFloat232 + Static133.aFloat54;
				@Pc(158) float local158 = Static210.aFloat72 + Static542.aFloat198 * local116 + Static293.aFloat109 * local95 + local74 * Static141.aFloat57;
				@Pc(179) float local179 = (float) (1.0D / Math.sqrt((double) (local144 * local144 + local130 * local130 + local158 * local158))) * (float) local41.anInt2411;
				@Pc(184) Class92_Sub1 local184 = this.aClass33_Sub2_19.method8172();
				local184.method2310(local46.anInt3315 * local41.aShort41 >> 7, local130 + (float) local46.anInt3313 - local179 * local130, local41.aShort42 * local46.anInt3310 >> 7, (float) local46.anInt3309 + local144 - local179 * local144, -(local158 * local179) + local158, local46.anInt3316);
				local184.method2293(this.aClass33_Sub2_19.aClass92_Sub1_17);
				this.aClass33_Sub2_19.method8232();
				@Pc(240) int local240 = local46.anInt3308;
				this.aClass33_Sub2_19.method8272(false, local41.aShort40, false);
				this.aClass33_Sub2_19.method8250(local41.aByte22);
				this.aClass33_Sub2_19.method8208(local240);
				this.aClass33_Sub2_19.method8236();
			}
		}
		this.aClass33_Sub2_19.method8258(Static238.aClass230_3, 1);
		this.aClass33_Sub2_19.method8239(1, Static238.aClass230_3);
		this.aClass33_Sub2_19.C(true);
	}

	@OriginalMember(owner = "client!sk", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean663) {
			this.method7354();
		}
		return this.anInt8504;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public void method7336(@OriginalArg(0) Class92 arg0) {
		@Pc(8) Class92_Sub1 local8 = (Class92_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass235Array4 != null) {
			for (local13 = 0; local13 < this.aClass235Array4.length; local13++) {
				@Pc(20) Class235 local20 = this.aClass235Array4[local13];
				@Pc(22) Class235 local22 = local20;
				if (local20.aClass235_2 != null) {
					local22 = local20.aClass235_2;
				}
				local22.anInt5628 = (int) (local8.aFloat50 + local8.aFloat45 * (float) this.anIntArray584[local20.anInt5635] + local8.aFloat49 * (float) this.anIntArray580[local20.anInt5635] + (float) this.anIntArray581[local20.anInt5635] * local8.aFloat51);
				local22.anInt5637 = (int) (local8.aFloat42 + (float) this.anIntArray584[local20.anInt5635] * local8.aFloat43 + (float) this.anIntArray581[local20.anInt5635] * local8.aFloat40 + local8.aFloat47 * (float) this.anIntArray580[local20.anInt5635]);
				local22.anInt5632 = (int) (local8.aFloat44 + (float) this.anIntArray580[local20.anInt5635] * local8.aFloat48 + local8.aFloat41 * (float) this.anIntArray581[local20.anInt5635] + local8.aFloat46 * (float) this.anIntArray584[local20.anInt5635]);
				local22.anInt5627 = (int) (local8.aFloat50 + (float) this.anIntArray584[local20.anInt5634] * local8.aFloat45 + local8.aFloat51 * (float) this.anIntArray581[local20.anInt5634] + (float) this.anIntArray580[local20.anInt5634] * local8.aFloat49);
				local22.anInt5629 = (int) (local8.aFloat47 * (float) this.anIntArray580[local20.anInt5634] + (float) this.anIntArray581[local20.anInt5634] * local8.aFloat40 + local8.aFloat43 * (float) this.anIntArray584[local20.anInt5634] + local8.aFloat42);
				local22.anInt5623 = (int) (local8.aFloat44 + (float) this.anIntArray584[local20.anInt5634] * local8.aFloat46 + local8.aFloat41 * (float) this.anIntArray581[local20.anInt5634] + (float) this.anIntArray580[local20.anInt5634] * local8.aFloat48);
				local22.anInt5624 = (int) (local8.aFloat50 + (float) this.anIntArray580[local20.anInt5631] * local8.aFloat49 + local8.aFloat51 * (float) this.anIntArray581[local20.anInt5631] + local8.aFloat45 * (float) this.anIntArray584[local20.anInt5631]);
				local22.anInt5626 = (int) (local8.aFloat43 * (float) this.anIntArray584[local20.anInt5631] + local8.aFloat47 * (float) this.anIntArray580[local20.anInt5631] + local8.aFloat40 * (float) this.anIntArray581[local20.anInt5631] + local8.aFloat42);
				local22.anInt5636 = (int) ((float) this.anIntArray584[local20.anInt5631] * local8.aFloat46 + (float) this.anIntArray581[local20.anInt5631] * local8.aFloat41 + (float) this.anIntArray580[local20.anInt5631] * local8.aFloat48 + local8.aFloat44);
			}
		}
		if (this.aClass170Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass170Array4.length; local13++) {
			@Pc(361) Class170 local361 = this.aClass170Array4[local13];
			@Pc(363) Class170 local363 = local361;
			if (local361.aClass170_2 != null) {
				local363 = local361.aClass170_2;
			}
			if (local361.aClass92_3 == null) {
				local361.aClass92_3 = local8.method3857();
			} else {
				local361.aClass92_3.method3865(local8);
			}
			local363.anInt4272 = (int) (local8.aFloat50 + local8.aFloat49 * (float) this.anIntArray580[local361.anInt4269] + local8.aFloat51 * (float) this.anIntArray581[local361.anInt4269] + local8.aFloat45 * (float) this.anIntArray584[local361.anInt4269]);
			local363.anInt4275 = (int) (local8.aFloat42 + (float) this.anIntArray580[local361.anInt4269] * local8.aFloat47 + (float) this.anIntArray581[local361.anInt4269] * local8.aFloat40 + local8.aFloat43 * (float) this.anIntArray584[local361.anInt4269]);
			local363.anInt4270 = (int) (local8.aFloat44 + (float) this.anIntArray584[local361.anInt4269] * local8.aFloat46 + local8.aFloat48 * (float) this.anIntArray580[local361.anInt4269] + local8.aFloat41 * (float) this.anIntArray581[local361.anInt4269]);
		}
	}

	@OriginalMember(owner = "client!sk", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean663) {
			this.method7354();
		}
		return this.anInt8527;
	}

	@OriginalMember(owner = "client!sk", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static440.anInt6880 = 0;
			Static317.anInt4920 = 0;
			Static290.anInt4595 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray52.length) {
					local55 = this.anIntArrayArray52[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray120 == null || (this.aShortArray120[local63] & arg6) != 0) {
							Static440.anInt6880 += this.anIntArray580[local63];
							Static290.anInt4595 += this.anIntArray581[local63];
							local33++;
							Static317.anInt4920 += this.anIntArray584[local63];
						}
					}
				}
			}
			if (local33 > 0) {
				Static622.aBoolean763 = true;
				Static317.anInt4920 = Static317.anInt4920 / local33 + arg4;
				Static290.anInt4595 = Static290.anInt4595 / local33 + arg3;
				Static440.anInt6880 = Static440.anInt6880 / local33 + arg2;
			} else {
				Static440.anInt6880 = arg2;
				Static290.anInt4595 = arg3;
				Static317.anInt4920 = arg4;
			}
			return;
		}
		@Pc(255) int[] local255;
		@Pc(257) int local257;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg7[0] * arg2 + arg3 * arg7[1] + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg2 * arg7[3] + arg3 * arg7[4] + arg4 * arg7[5] + 8192 >> 14;
				local41 = arg2 * arg7[6] + arg3 * arg7[7] + arg4 * arg7[8] + 8192 >> 14;
				arg4 = local41;
				arg3 = local35;
				arg2 = local33;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray52.length > local35) {
					local255 = this.anIntArrayArray52[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray120 == null || (this.aShortArray120[local57] & arg6) != 0) {
							this.anIntArray580[local57] += arg2;
							this.anIntArray581[local57] += arg3;
							this.anIntArray584[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(373) int local373;
		@Pc(396) int local396;
		@Pc(426) int local426;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(465) int local465;
		@Pc(473) int local473;
		@Pc(481) int local481;
		@Pc(637) int local637;
		@Pc(663) int local663;
		@Pc(667) int local667;
		@Pc(676) int local676;
		@Pc(681) int local681;
		@Pc(685) int local685;
		@Pc(689) int local689;
		@Pc(691) int local691;
		@Pc(821) int[] local821;
		@Pc(823) int local823;
		@Pc(827) int local827;
		@Pc(831) int local831;
		@Pc(833) int local833;
		@Pc(964) int local964;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray52.length > local35) {
						local255 = this.anIntArrayArray52[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local57 = local255[local257];
							if (this.aShortArray120 == null || (this.aShortArray120[local57] & arg6) != 0) {
								this.anIntArray580[local57] -= Static440.anInt6880;
								this.anIntArray581[local57] -= Static290.anInt4595;
								this.anIntArray584[local57] -= Static317.anInt4920;
								if (arg4 != 0) {
									local63 = Class4_Sub2_Sub26.anIntArray563[arg4];
									local373 = Class4_Sub2_Sub26.anIntArray562[arg4];
									local396 = this.anIntArray580[local57] * local373 + this.anIntArray581[local57] * local63 + 16383 >> 14;
									this.anIntArray581[local57] = this.anIntArray581[local57] * local373 + 16383 - local63 * this.anIntArray580[local57] >> 14;
									this.anIntArray580[local57] = local396;
								}
								if (arg2 != 0) {
									local63 = Class4_Sub2_Sub26.anIntArray563[arg2];
									local373 = Class4_Sub2_Sub26.anIntArray562[arg2];
									local396 = local373 * this.anIntArray581[local57] + 16383 - this.anIntArray584[local57] * local63 >> 14;
									this.anIntArray584[local57] = local373 * this.anIntArray584[local57] + this.anIntArray581[local57] * local63 + 16383 >> 14;
									this.anIntArray581[local57] = local396;
								}
								if (arg3 != 0) {
									local63 = Class4_Sub2_Sub26.anIntArray563[arg3];
									local373 = Class4_Sub2_Sub26.anIntArray562[arg3];
									local396 = this.anIntArray584[local57] * local63 + this.anIntArray580[local57] * local373 + 16383 >> 14;
									this.anIntArray584[local57] = local373 * this.anIntArray584[local57] + 16383 - this.anIntArray580[local57] * local63 >> 14;
									this.anIntArray580[local57] = local396;
								}
								this.anIntArray580[local57] += Static440.anInt6880;
								this.anIntArray581[local57] += Static290.anInt4595;
								this.anIntArray584[local57] += Static317.anInt4920;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray52.length) {
							local55 = this.anIntArrayArray52[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray120 == null || (this.aShortArray120[local63] & arg6) != 0) {
									local373 = this.anIntArray579[local63];
									local396 = this.anIntArray579[local63 + 1];
									for (local426 = local373; local426 < local396; local426++) {
										local453 = this.aShortArray122[local426] - 1;
										if (local453 == -1) {
											break;
										}
										if (arg4 != 0) {
											local457 = Class4_Sub2_Sub26.anIntArray563[arg4];
											local461 = Class4_Sub2_Sub26.anIntArray562[arg4];
											local465 = this.aShortArray118[local453] * local461 + this.aShortArray123[local453] * local457 + 16383 >> 14;
											this.aShortArray123[local453] = (short) (local461 * this.aShortArray123[local453] + 16383 - this.aShortArray118[local453] * local457 >> 14);
											this.aShortArray118[local453] = (short) local465;
										}
										if (arg2 != 0) {
											local457 = Class4_Sub2_Sub26.anIntArray563[arg2];
											local461 = Class4_Sub2_Sub26.anIntArray562[arg2];
											local465 = local461 * this.aShortArray123[local453] + 16383 - this.aShortArray112[local453] * local457 >> 14;
											this.aShortArray112[local453] = (short) (this.aShortArray112[local453] * local461 + this.aShortArray123[local453] * local457 + 16383 >> 14);
											this.aShortArray123[local453] = (short) local465;
										}
										if (arg3 != 0) {
											local457 = Class4_Sub2_Sub26.anIntArray563[arg3];
											local461 = Class4_Sub2_Sub26.anIntArray562[arg3];
											local465 = this.aShortArray118[local453] * local461 + this.aShortArray112[local453] * local457 + 16383 >> 14;
											this.aShortArray112[local453] = (short) (this.aShortArray112[local453] * local461 + 16383 - this.aShortArray118[local453] * local457 >> 14);
											this.aShortArray118[local453] = (short) local465;
										}
									}
								}
							}
						}
					}
					this.method7369();
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local257 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static622.aBoolean763) {
					local373 = Static317.anInt4920 * arg7[6] + arg7[0] * Static440.anInt6880 + Static290.anInt4595 * arg7[3] + 8192 >> 14;
					local396 = Static440.anInt6880 * arg7[1] + arg7[4] * Static290.anInt4595 + Static317.anInt4920 * arg7[7] + 8192 >> 14;
					local373 += local257;
					local396 += local57;
					local426 = arg7[8] * Static317.anInt4920 + Static290.anInt4595 * arg7[5] + Static440.anInt6880 * arg7[2] + 8192 >> 14;
					local426 += local63;
					Static440.anInt6880 = local373;
					Static290.anInt4595 = local396;
					Static622.aBoolean763 = false;
					Static317.anInt4920 = local426;
				}
				@Pc(441) int[] local441 = new int[9];
				local396 = Class4_Sub2_Sub26.anIntArray562[arg2];
				local426 = Class4_Sub2_Sub26.anIntArray563[arg2];
				local453 = Class4_Sub2_Sub26.anIntArray562[arg3];
				local457 = Class4_Sub2_Sub26.anIntArray563[arg3];
				local461 = Class4_Sub2_Sub26.anIntArray562[arg4];
				local465 = Class4_Sub2_Sub26.anIntArray563[arg4];
				local473 = local461 * local426 + 8192 >> 14;
				local481 = local426 * local465 + 8192 >> 14;
				local441[7] = local465 * local457 + local473 * local453 + 8192 >> 14;
				local441[6] = local461 * -local457 + local453 * local481 + 8192 >> 14;
				local441[3] = local465 * local396 + 8192 >> 14;
				local441[8] = local396 * local453 + 8192 >> 14;
				local441[4] = local396 * local461 + 8192 >> 14;
				local441[1] = local465 * -local453 + local457 * local473 + 8192 >> 14;
				local441[2] = local457 * local396 + 8192 >> 14;
				local441[5] = -local426;
				local441[0] = local481 * local457 + local453 * local461 + 8192 >> 14;
				@Pc(612) int local612 = -Static317.anInt4920 * local441[2] + local441[0] * -Static440.anInt6880 + -Static290.anInt4595 * local441[1] + 8192 >> 14;
				local637 = local441[4] * -Static290.anInt4595 + local441[3] * -Static440.anInt6880 + local441[5] * -Static317.anInt4920 + 8192 >> 14;
				local663 = local441[6] * -Static440.anInt6880 + -Static290.anInt4595 * local441[7] + -Static317.anInt4920 * local441[8] + 8192 >> 14;
				local667 = Static440.anInt6880 + local612;
				@Pc(671) int local671 = Static290.anInt4595 + local637;
				local676 = local663 + Static317.anInt4920;
				@Pc(679) int[] local679 = new int[9];
				for (local681 = 0; local681 < 3; local681++) {
					for (local685 = 0; local685 < 3; local685++) {
						local689 = 0;
						for (local691 = 0; local691 < 3; local691++) {
							local689 += local441[local691 + local681 * 3] * arg7[local691 + local685 * 3];
						}
						local679[local681 * 3 + local685] = local689 + 8192 >> 14;
					}
				}
				local685 = local57 * local441[1] + local257 * local441[0] + local441[2] * local63 + 8192 >> 14;
				local689 = local63 * local441[5] + local257 * local441[3] + local57 * local441[4] + 8192 >> 14;
				local685 += local667;
				local689 += local671;
				local691 = local441[8] * local63 + local257 * local441[6] + local57 * local441[7] + 8192 >> 14;
				local691 += local676;
				local821 = new int[9];
				for (local823 = 0; local823 < 3; local823++) {
					for (local827 = 0; local827 < 3; local827++) {
						local831 = 0;
						for (local833 = 0; local833 < 3; local833++) {
							local831 += local679[local827 + local833 * 3] * arg7[local823 * 3 + local833];
						}
						local821[local827 + local823 * 3] = local831 + 8192 >> 14;
					}
				}
				local827 = arg7[0] * local685 + local689 * arg7[1] + arg7[2] * local691 + 8192 >> 14;
				local831 = arg7[4] * local689 + local685 * arg7[3] + arg7[5] * local691 + 8192 >> 14;
				local827 += local33;
				local831 += local35;
				local833 = local685 * arg7[6] + local689 * arg7[7] + arg7[8] * local691 + 8192 >> 14;
				local833 += local41;
				for (local964 = 0; local964 < local8; local964++) {
					@Pc(970) int local970 = arg1[local964];
					if (local970 < this.anIntArrayArray52.length) {
						@Pc(984) int[] local984 = this.anIntArrayArray52[local970];
						for (@Pc(986) int local986 = 0; local986 < local984.length; local986++) {
							@Pc(992) int local992 = local984[local986];
							if (this.aShortArray120 == null || (this.aShortArray120[local992] & arg6) != 0) {
								@Pc(1037) int local1037 = this.anIntArray580[local992] * local821[0] + local821[1] * this.anIntArray581[local992] + this.anIntArray584[local992] * local821[2] + 8192 >> 14;
								@Pc(1068) int local1068 = local821[5] * this.anIntArray584[local992] + this.anIntArray581[local992] * local821[4] + this.anIntArray580[local992] * local821[3] + 8192 >> 14;
								@Pc(1099) int local1099 = local821[8] * this.anIntArray584[local992] + local821[6] * this.anIntArray580[local992] + this.anIntArray581[local992] * local821[7] + 8192 >> 14;
								@Pc(1103) int local1103 = local1068 + local831;
								@Pc(1107) int local1107 = local1037 + local827;
								this.anIntArray580[local992] = local1107;
								@Pc(1116) int local1116 = local1099 + local833;
								this.anIntArray581[local992] = local1103;
								this.anIntArray584[local992] = local1116;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2597) Class140 local2597;
			@Pc(2489) boolean local2489;
			@Pc(2592) Class93 local2592;
			if (arg0 == 5) {
				if (this.anIntArrayArray53 != null) {
					local2489 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray53.length) {
							local55 = this.anIntArrayArray53[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray121 == null || (this.aShortArray121[local63] & arg6) != 0) {
									local373 = (this.aByteArray83[local63] & 0xFF) + (arg2 * 8);
									if (local373 < 0) {
										local373 = 0;
									} else if (local373 > 255) {
										local373 = 255;
									}
									this.aByteArray83[local63] = (byte) local373;
								}
							}
							local2489 |= local55.length > 0;
						}
					}
					if (local2489) {
						if (this.aClass93Array1 != null) {
							for (local41 = 0; local41 < this.anInt8528; local41++) {
								local2592 = this.aClass93Array1[local41];
								local2597 = this.aClass140Array1[local41];
								local2597.anInt3308 = local2597.anInt3308 & 0xFFFFFF | 255 - (this.aByteArray83[local2592.anInt2412] & 0xFF) << 24;
							}
						}
						this.method7355();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray53 != null) {
					local2489 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray53.length > local41) {
							local55 = this.anIntArrayArray53[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray121 == null || (arg6 & this.aShortArray121[local63]) != 0) {
									local373 = this.aShortArray119[local63] & 0xFFFF;
									local396 = local373 >> 10 & 0x3F;
									local426 = local373 >> 7 & 0x7;
									@Pc(2700) int local2700 = local396 + arg2 & 0x3F;
									local453 = local373 & 0x7F;
									local426 += arg3 / 4;
									if (local426 < 0) {
										local426 = 0;
									} else if (local426 > 7) {
										local426 = 7;
									}
									local453 += arg4;
									if (local453 < 0) {
										local453 = 0;
									} else if (local453 > 127) {
										local453 = 127;
									}
									this.aShortArray119[local63] = (short) (local2700 << 10 | local426 << 7 | local453);
								}
							}
							local2489 |= local55.length > 0;
						}
					}
					if (local2489) {
						if (this.aClass93Array1 != null) {
							for (local41 = 0; local41 < this.anInt8528; local41++) {
								local2592 = this.aClass93Array1[local41];
								local2597 = this.aClass140Array1[local41];
								local2597.anInt3308 = local2597.anInt3308 & 0xFF000000 | Static411.anIntArray448[this.aShortArray119[local2592.anInt2412] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method7355();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray54 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray54.length) {
							local255 = this.anIntArrayArray54[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2597 = this.aClass140Array1[local255[local257]];
								local2597.anInt3313 += arg2;
								local2597.anInt3309 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray54 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray54.length > local35) {
							local255 = this.anIntArrayArray54[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2597 = this.aClass140Array1[local255[local257]];
								local2597.anInt3315 = arg3 * local2597.anInt3315 >> 7;
								local2597.anInt3310 = local2597.anInt3310 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray54 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray54.length) {
						local255 = this.anIntArrayArray54[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local2597 = this.aClass140Array1[local255[local257]];
							local2597.anInt3316 = local2597.anInt3316 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray52.length > local35) {
					local255 = this.anIntArrayArray52[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray120 == null || (this.aShortArray120[local57] & arg6) != 0) {
							this.anIntArray580[local57] -= Static440.anInt6880;
							this.anIntArray581[local57] -= Static290.anInt4595;
							this.anIntArray584[local57] -= Static317.anInt4920;
							this.anIntArray580[local57] = this.anIntArray580[local57] * arg2 >> 7;
							this.anIntArray581[local57] = this.anIntArray581[local57] * arg3 >> 7;
							this.anIntArray584[local57] = this.anIntArray584[local57] * arg4 >> 7;
							this.anIntArray580[local57] += Static440.anInt6880;
							this.anIntArray581[local57] += Static290.anInt4595;
							this.anIntArray584[local57] += Static317.anInt4920;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local257 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static622.aBoolean763) {
				local373 = arg7[6] * Static317.anInt4920 + arg7[3] * Static290.anInt4595 + Static440.anInt6880 * arg7[0] + 8192 >> 14;
				local396 = arg7[4] * Static290.anInt4595 + arg7[1] * Static440.anInt6880 + arg7[7] * Static317.anInt4920 + 8192 >> 14;
				local426 = arg7[2] * Static440.anInt6880 + arg7[5] * Static290.anInt4595 + arg7[8] * Static317.anInt4920 + 8192 >> 14;
				local373 += local257;
				local396 += local57;
				local426 += local63;
				Static440.anInt6880 = local373;
				Static290.anInt4595 = local396;
				Static317.anInt4920 = local426;
				Static622.aBoolean763 = false;
			}
			local373 = arg2 << 15 >> 7;
			local396 = arg3 << 15 >> 7;
			local426 = arg4 << 15 >> 7;
			local453 = -Static440.anInt6880 * local373 + 8192 >> 14;
			local457 = local396 * -Static290.anInt4595 + 8192 >> 14;
			local461 = -Static317.anInt4920 * local426 + 8192 >> 14;
			local465 = Static440.anInt6880 + local453;
			local473 = local457 + Static290.anInt4595;
			local481 = Static317.anInt4920 + local461;
			@Pc(2020) int[] local2020 = new int[] { local373 * arg7[0] + 8192 >> 14, local373 * arg7[3] + 8192 >> 14, arg7[6] * local373 + 8192 >> 14, local396 * arg7[1] + 8192 >> 14, local396 * arg7[4] + 8192 >> 14, local396 * arg7[7] + 8192 >> 14, local426 * arg7[2] + 8192 >> 14, arg7[5] * local426 + 8192 >> 14, local426 * arg7[8] + 8192 >> 14 };
			local637 = local257 * local373 + 8192 >> 14;
			local663 = local57 * local396 + 8192 >> 14;
			@Pc(2148) int local2148 = local637 + local465;
			local667 = local426 * local63 + 8192 >> 14;
			@Pc(2160) int local2160 = local663 + local473;
			@Pc(2164) int local2164 = local667 + local481;
			@Pc(2167) int[] local2167 = new int[9];
			@Pc(2173) int local2173;
			for (local676 = 0; local676 < 3; local676++) {
				for (local2173 = 0; local2173 < 3; local2173++) {
					local681 = 0;
					for (local685 = 0; local685 < 3; local685++) {
						local681 += arg7[local685 + local676 * 3] * local2020[local685 * 3 + local2173];
					}
					local2167[local676 * 3 + local2173] = local681 + 8192 >> 14;
				}
			}
			local2173 = arg7[2] * local2164 + arg7[0] * local2148 + local2160 * arg7[1] + 8192 >> 14;
			local681 = local2160 * arg7[4] + arg7[3] * local2148 + local2164 * arg7[5] + 8192 >> 14;
			local681 += local35;
			local685 = arg7[8] * local2164 + arg7[6] * local2148 + local2160 * arg7[7] + 8192 >> 14;
			local2173 += local33;
			local685 += local41;
			for (local689 = 0; local689 < local8; local689++) {
				local691 = arg1[local689];
				if (this.anIntArrayArray52.length > local691) {
					local821 = this.anIntArrayArray52[local691];
					for (local823 = 0; local823 < local821.length; local823++) {
						local827 = local821[local823];
						if (this.aShortArray120 == null || (this.aShortArray120[local827] & arg6) != 0) {
							local831 = this.anIntArray581[local827] * local2167[1] + local2167[0] * this.anIntArray580[local827] + this.anIntArray584[local827] * local2167[2] + 8192 >> 14;
							local833 = local2167[4] * this.anIntArray581[local827] + this.anIntArray580[local827] * local2167[3] + local2167[5] * this.anIntArray584[local827] + 8192 >> 14;
							@Pc(2413) int local2413 = local831 + local2173;
							@Pc(2417) int local2417 = local833 + local681;
							local964 = this.anIntArray584[local827] * local2167[8] + local2167[7] * this.anIntArray581[local827] + this.anIntArray580[local827] * local2167[6] + 8192 >> 14;
							this.anIntArray580[local827] = local2413;
							@Pc(2457) int local2457 = local964 + local685;
							this.anIntArray581[local827] = local2417;
							this.anIntArray584[local827] = local2457;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static317.anInt4920 = 0;
			Static290.anInt4595 = 0;
			Static440.anInt6880 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt8479; local17++) {
				Static440.anInt6880 += this.anIntArray580[local17];
				Static290.anInt4595 += this.anIntArray581[local17];
				local15++;
				Static317.anInt4920 += this.anIntArray584[local17];
			}
			if (local15 <= 0) {
				Static440.anInt6880 = arg1;
				Static317.anInt4920 = arg3;
				Static290.anInt4595 = arg2;
			} else {
				Static317.anInt4920 = arg3 + Static317.anInt4920 / local15;
				Static440.anInt6880 = arg1 + Static440.anInt6880 / local15;
				Static290.anInt4595 = arg2 + Static290.anInt4595 / local15;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt8479; local15++) {
				this.anIntArray580[local15] += arg1;
				this.anIntArray581[local15] += arg2;
				this.anIntArray584[local15] += arg3;
			}
		} else {
			@Pc(165) int local165;
			@Pc(184) int local184;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt8479; local15++) {
					this.anIntArray580[local15] -= Static440.anInt6880;
					this.anIntArray581[local15] -= Static290.anInt4595;
					this.anIntArray584[local15] -= Static317.anInt4920;
					if (arg3 != 0) {
						local17 = Class4_Sub2_Sub26.anIntArray563[arg3];
						local165 = Class4_Sub2_Sub26.anIntArray562[arg3];
						local184 = local17 * this.anIntArray581[local15] + this.anIntArray580[local15] * local165 + 16383 >> 14;
						this.anIntArray581[local15] = this.anIntArray581[local15] * local165 + 16383 - local17 * this.anIntArray580[local15] >> 14;
						this.anIntArray580[local15] = local184;
					}
					if (arg1 != 0) {
						local17 = Class4_Sub2_Sub26.anIntArray563[arg1];
						local165 = Class4_Sub2_Sub26.anIntArray562[arg1];
						local184 = local165 * this.anIntArray581[local15] + 16383 - this.anIntArray584[local15] * local17 >> 14;
						this.anIntArray584[local15] = local165 * this.anIntArray584[local15] + local17 * this.anIntArray581[local15] + 16383 >> 14;
						this.anIntArray581[local15] = local184;
					}
					if (arg2 != 0) {
						local17 = Class4_Sub2_Sub26.anIntArray563[arg2];
						local165 = Class4_Sub2_Sub26.anIntArray562[arg2];
						local184 = local17 * this.anIntArray584[local15] + local165 * this.anIntArray580[local15] + 16383 >> 14;
						this.anIntArray584[local15] = local165 * this.anIntArray584[local15] + 16383 - local17 * this.anIntArray580[local15] >> 14;
						this.anIntArray580[local15] = local184;
					}
					this.anIntArray580[local15] += Static440.anInt6880;
					this.anIntArray581[local15] += Static290.anInt4595;
					this.anIntArray584[local15] += Static317.anInt4920;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt8479; local15++) {
					this.anIntArray580[local15] -= Static440.anInt6880;
					this.anIntArray581[local15] -= Static290.anInt4595;
					this.anIntArray584[local15] -= Static317.anInt4920;
					this.anIntArray580[local15] = this.anIntArray580[local15] * arg1 / 128;
					this.anIntArray581[local15] = arg2 * this.anIntArray581[local15] / 128;
					this.anIntArray584[local15] = this.anIntArray584[local15] * arg3 / 128;
					this.anIntArray580[local15] += Static440.anInt6880;
					this.anIntArray581[local15] += Static290.anInt4595;
					this.anIntArray584[local15] += Static317.anInt4920;
				}
			} else {
				@Pc(512) Class93 local512;
				@Pc(517) Class140 local517;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt8533; local15++) {
						local17 = (this.aByteArray83[local15] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray83[local15] = (byte) local17;
					}
					if (this.aClass93Array1 != null) {
						for (local17 = 0; local17 < this.anInt8528; local17++) {
							local512 = this.aClass93Array1[local17];
							local517 = this.aClass140Array1[local17];
							local517.anInt3308 = 255 - (this.aByteArray83[local512.anInt2412] & 0xFF) << 24 | local517.anInt3308 & 0xFFFFFF;
						}
					}
					this.method7355();
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt8533; local15++) {
						local17 = this.aShortArray119[local15] & 0xFFFF;
						local165 = local17 >> 10 & 0x3F;
						local184 = local17 >> 7 & 0x7;
						@Pc(579) int local579 = local17 & 0x7F;
						@Pc(585) int local585 = arg1 + local165 & 0x3F;
						local184 += arg2 / 4;
						if (local184 < 0) {
							local184 = 0;
						} else if (local184 > 7) {
							local184 = 7;
						}
						local579 += arg3;
						if (local579 < 0) {
							local579 = 0;
						} else if (local579 > 127) {
							local579 = 127;
						}
						this.aShortArray119[local15] = (short) (local585 << 10 | local184 << 7 | local579);
					}
					if (this.aClass93Array1 != null) {
						for (local17 = 0; local17 < this.anInt8528; local17++) {
							local512 = this.aClass93Array1[local17];
							local517 = this.aClass140Array1[local17];
							local517.anInt3308 = Static411.anIntArray448[this.aShortArray119[local512.anInt2412] & 0xFFFF] & 0xFFFFFF | local517.anInt3308 & 0xFF000000;
						}
					}
					this.method7355();
				} else {
					@Pc(701) Class140 local701;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt8528; local15++) {
							local701 = this.aClass140Array1[local15];
							local701.anInt3313 += arg1;
							local701.anInt3309 += arg2;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt8528; local15++) {
							local701 = this.aClass140Array1[local15];
							local701.anInt3315 = local701.anInt3315 * arg2 >> 7;
							local701.anInt3310 = arg1 * local701.anInt3310 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt8528; local15++) {
							local701 = this.aClass140Array1[local15];
							local701.anInt3316 = local701.anInt3316 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
	private void method7359() {
		if (!this.aBoolean662) {
			return;
		}
		this.aBoolean662 = false;
		if (this.aClass235Array4 == null && this.aClass170Array4 == null && this.aClass93Array1 == null && !Static359.method4798(this.anInt8524, this.anInt8496)) {
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			if (this.anIntArray580 != null && !Static589.method7763(this.anInt8524, this.anInt8496)) {
				if (this.aClass142_4 == null || this.aClass142_4.method3088()) {
					if (!this.aBoolean663) {
						this.method7354();
					}
					local30 = true;
				} else {
					this.aBoolean662 = true;
				}
			}
			if (this.anIntArray581 != null && !Static574.method7599(this.anInt8524, this.anInt8496)) {
				if (this.aClass142_4 == null || this.aClass142_4.method3088()) {
					local32 = true;
					if (!this.aBoolean663) {
						this.method7354();
					}
				} else {
					this.aBoolean662 = true;
				}
			}
			if (this.anIntArray584 != null && !Static280.method8738(this.anInt8496, this.anInt8524)) {
				if (this.aClass142_4 == null || this.aClass142_4.method3088()) {
					if (!this.aBoolean663) {
						this.method7354();
					}
					local34 = true;
				} else {
					this.aBoolean662 = true;
				}
			}
			if (local32) {
				this.anIntArray581 = null;
			}
			if (local34) {
				this.anIntArray584 = null;
			}
			if (local30) {
				this.anIntArray580 = null;
			}
		}
		if (this.aShortArray122 != null && this.anIntArray580 == null && this.anIntArray581 == null && this.anIntArray584 == null) {
			this.anIntArray579 = null;
			this.aShortArray122 = null;
		}
		if (this.aByteArray84 != null && !Static599.method7866(this.anInt8524, this.anInt8496)) {
			label207: {
				label206: {
					@Pc(196) boolean local196;
					if ((this.anInt8524 & 0x37) == 0) {
						if (this.aClass142_1 == null || this.aClass142_1.method3088()) {
							break label206;
						}
						local196 = false;
					} else {
						if (this.aClass142_2 == null || this.aClass142_2.method3088()) {
							break label206;
						}
						local196 = false;
					}
					if (!local196) {
						this.aBoolean662 = true;
						break label207;
					}
				}
				this.aShortArray118 = this.aShortArray123 = this.aShortArray112 = null;
				this.aByteArray84 = null;
			}
		}
		if (this.aShortArray119 != null && !Static335.method4613(this.anInt8496, this.anInt8524)) {
			if (this.aClass142_1 == null || this.aClass142_1.method3088()) {
				this.aShortArray119 = null;
			} else {
				this.aBoolean662 = true;
			}
		}
		if (this.aByteArray83 != null && !Static583.method7674(this.anInt8496, this.anInt8524)) {
			if (this.aClass142_1 == null || this.aClass142_1.method3088()) {
				this.aByteArray83 = null;
			} else {
				this.aBoolean662 = true;
			}
		}
		if (this.aFloatArray61 != null && !Static568.method7523(this.anInt8524, this.anInt8496)) {
			if (this.aClass142_3 == null || this.aClass142_3.method3088()) {
				this.aFloatArray61 = this.aFloatArray62 = null;
			} else {
				this.aBoolean662 = true;
			}
		}
		if (this.aShortArray117 != null && !Static415.method5234(this.anInt8524, this.anInt8496)) {
			if (this.aClass142_1 == null || this.aClass142_1.method3088()) {
				this.aShortArray117 = null;
			} else {
				this.aBoolean662 = true;
			}
		}
		if (this.aShortArray115 != null && !Static227.method3323(this.anInt8496, this.anInt8524)) {
			if ((this.aClass70_1 == null || this.aClass70_1.method2052()) && (this.aClass142_1 == null || this.aClass142_1.method3088())) {
				this.aShortArray115 = this.aShortArray113 = this.aShortArray116 = null;
			} else {
				this.aBoolean662 = true;
			}
		}
		if (this.aShortArray114 != null) {
			if (this.aClass142_4 == null || this.aClass142_4.method3088()) {
				this.aShortArray114 = null;
			} else {
				this.aBoolean662 = true;
			}
		}
		if (this.aShortArray111 != null) {
			if (this.aClass142_1 == null || this.aClass142_1.method3088()) {
				this.aShortArray111 = null;
			} else {
				this.aBoolean662 = true;
			}
		}
		if (this.anIntArrayArray53 != null && !Static135.method2425(this.anInt8524, this.anInt8496)) {
			this.aShortArray121 = null;
			this.anIntArrayArray53 = null;
		}
		if (this.anIntArrayArray52 != null && !Static410.method5172(this.anInt8496, this.anInt8524)) {
			this.anIntArrayArray52 = null;
			this.aShortArray120 = null;
		}
		if (this.anIntArrayArray54 != null && !Static453.method6389(this.anInt8496, this.anInt8524)) {
			this.anIntArrayArray54 = null;
		}
		if (this.anIntArray585 != null && (this.anInt8496 & 0x800) == 0 && (this.anInt8496 & 0x40000) == 0) {
			this.anIntArray583 = null;
			this.anIntArray582 = null;
			this.anIntArray585 = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "()Z")
	@Override
	public boolean method7344() {
		if (this.aShortArray117 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray117.length; local12++) {
			if (this.aShortArray117[local12] != -1 && !this.aClass33_Sub2_19.anInterface9_12.method1557(this.aShortArray117[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sk", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8479; local3++) {
			if (arg0 != 0) {
				this.anIntArray580[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray581[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray584[local3] += arg2;
			}
		}
		this.method7367();
		this.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!sk;ZZLclient!sk;IZ)Lclient!ka;")
	private Class62 method7360(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class62_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt8524 = this.anInt8524;
		arg0.aBoolean664 = this.aBoolean664;
		arg0.aShort111 = this.aShort111;
		arg0.aShort112 = this.aShort112;
		arg0.anInt8496 = arg3;
		if ((arg3 & 0x100) == 0) {
			arg0.aBoolean667 = this.aBoolean667;
		} else {
			arg0.aBoolean667 = true;
		}
		arg0.anInt8490 = this.anInt8490;
		arg0.anInt8536 = this.anInt8536;
		arg0.anInt8479 = this.anInt8479;
		arg0.anInt8489 = this.anInt8489;
		arg0.anInt8533 = this.anInt8533;
		arg0.anInt8528 = this.anInt8528;
		@Pc(73) boolean local73 = Static310.method4315(arg3, this.anInt8524);
		@Pc(79) boolean local79 = Static562.method7444(this.anInt8524, arg3);
		@Pc(85) boolean local85 = Static260.method7099(this.anInt8524, arg3);
		@Pc(91) boolean local91 = local85 | local73 | local79;
		@Pc(206) int local206;
		if (local91) {
			if (!local73) {
				arg0.anIntArray580 = this.anIntArray580;
			} else if (arg2.anIntArray580 == null || arg2.anIntArray580.length < this.anInt8489) {
				arg0.anIntArray580 = arg2.anIntArray580 = new int[this.anInt8489];
			} else {
				arg0.anIntArray580 = arg2.anIntArray580;
			}
			if (!local79) {
				arg0.anIntArray581 = this.anIntArray581;
			} else if (arg2.anIntArray581 == null || arg2.anIntArray581.length < this.anInt8489) {
				arg0.anIntArray581 = arg2.anIntArray581 = new int[this.anInt8489];
			} else {
				arg0.anIntArray581 = arg2.anIntArray581;
			}
			if (!local85) {
				arg0.anIntArray584 = this.anIntArray584;
			} else if (arg2.anIntArray584 == null || arg2.anIntArray584.length < this.anInt8489) {
				arg0.anIntArray584 = arg2.anIntArray584 = new int[this.anInt8489];
			} else {
				arg0.anIntArray584 = arg2.anIntArray584;
			}
			for (local206 = 0; local206 < this.anInt8489; local206++) {
				if (local73) {
					arg0.anIntArray580[local206] = this.anIntArray580[local206];
				}
				if (local79) {
					arg0.anIntArray581[local206] = this.anIntArray581[local206];
				}
				if (local85) {
					arg0.anIntArray584[local206] = this.anIntArray584[local206];
				}
			}
		} else {
			arg0.anIntArray581 = this.anIntArray581;
			arg0.anIntArray580 = this.anIntArray580;
			arg0.anIntArray584 = this.anIntArray584;
		}
		if (Static567.method7517(arg3, this.anInt8524)) {
			arg0.aClass142_4 = arg2.aClass142_4;
			arg0.aClass142_4.aBoolean251 = true;
			arg0.aClass142_4.anInterface19_2 = this.aClass142_4.anInterface19_2;
			arg0.aClass142_4.aBoolean249 = this.aClass142_4.aBoolean249;
		} else if (Static598.method7849(arg3, this.anInt8524)) {
			arg0.aClass142_4 = this.aClass142_4;
		} else {
			arg0.aClass142_4 = null;
		}
		if (Static15.method1581(arg3, this.anInt8524)) {
			if (arg2.aShortArray119 == null || this.anInt8533 > arg2.aShortArray119.length) {
				arg0.aShortArray119 = arg2.aShortArray119 = new short[this.anInt8533];
			} else {
				arg0.aShortArray119 = arg2.aShortArray119;
			}
			for (local206 = 0; local206 < this.anInt8533; local206++) {
				arg0.aShortArray119[local206] = this.aShortArray119[local206];
			}
		} else {
			arg0.aShortArray119 = this.aShortArray119;
		}
		if (Static173.method2843(this.anInt8524, arg3)) {
			if (arg2.aByteArray83 == null || arg2.aByteArray83.length < this.anInt8533) {
				arg0.aByteArray83 = arg2.aByteArray83 = new byte[this.anInt8533];
			} else {
				arg0.aByteArray83 = arg2.aByteArray83;
			}
			for (local206 = 0; local206 < this.anInt8533; local206++) {
				arg0.aByteArray83[local206] = this.aByteArray83[local206];
			}
		} else {
			arg0.aByteArray83 = this.aByteArray83;
		}
		if (Static425.method5897(this.anInt8524, arg3)) {
			arg0.aClass142_1 = arg2.aClass142_1;
			arg0.aClass142_1.aBoolean249 = this.aClass142_1.aBoolean249;
			arg0.aClass142_1.aBoolean251 = true;
			arg0.aClass142_1.anInterface19_2 = this.aClass142_1.anInterface19_2;
		} else if (Static483.method6619(this.anInt8524, arg3)) {
			arg0.aClass142_1 = this.aClass142_1;
		} else {
			arg0.aClass142_1 = null;
		}
		@Pc(565) int local565;
		if (Static564.method7467(arg3, this.anInt8524)) {
			if (arg2.aShortArray118 == null || this.anInt8536 > arg2.aShortArray118.length) {
				local206 = this.anInt8536;
				arg0.aShortArray112 = arg2.aShortArray112 = new short[local206];
				arg0.aShortArray118 = arg2.aShortArray118 = new short[local206];
				arg0.aShortArray123 = arg2.aShortArray123 = new short[local206];
			} else {
				arg0.aShortArray123 = arg2.aShortArray123;
				arg0.aShortArray112 = arg2.aShortArray112;
				arg0.aShortArray118 = arg2.aShortArray118;
			}
			if (this.aClass185_1 == null) {
				arg0.aClass185_1 = null;
				for (local206 = 0; local206 < this.anInt8536; local206++) {
					arg0.aShortArray118[local206] = this.aShortArray118[local206];
					arg0.aShortArray123[local206] = this.aShortArray123[local206];
					arg0.aShortArray112[local206] = this.aShortArray112[local206];
				}
			} else {
				if (arg2.aClass185_1 == null) {
					arg2.aClass185_1 = new Class185();
				}
				@Pc(549) Class185 local549 = arg0.aClass185_1 = arg2.aClass185_1;
				if (local549.aShortArray63 == null || this.anInt8536 > local549.aShortArray63.length) {
					local565 = this.anInt8536;
					local549.aShortArray64 = new short[local565];
					local549.aByteArray50 = new byte[local565];
					local549.aShortArray62 = new short[local565];
					local549.aShortArray63 = new short[local565];
				}
				for (local565 = 0; local565 < this.anInt8536; local565++) {
					arg0.aShortArray118[local565] = this.aShortArray118[local565];
					arg0.aShortArray123[local565] = this.aShortArray123[local565];
					arg0.aShortArray112[local565] = this.aShortArray112[local565];
					local549.aShortArray63[local565] = this.aClass185_1.aShortArray63[local565];
					local549.aShortArray62[local565] = this.aClass185_1.aShortArray62[local565];
					local549.aShortArray64[local565] = this.aClass185_1.aShortArray64[local565];
					local549.aByteArray50[local565] = this.aClass185_1.aByteArray50[local565];
				}
			}
			arg0.aByteArray84 = this.aByteArray84;
		} else {
			arg0.aClass185_1 = this.aClass185_1;
			arg0.aByteArray84 = this.aByteArray84;
			arg0.aShortArray112 = this.aShortArray112;
			arg0.aShortArray118 = this.aShortArray118;
			arg0.aShortArray123 = this.aShortArray123;
		}
		if (Static678.method8983(this.anInt8524, arg3)) {
			arg0.aClass142_2 = arg2.aClass142_2;
			arg0.aClass142_2.aBoolean251 = true;
			arg0.aClass142_2.anInterface19_2 = this.aClass142_2.anInterface19_2;
			arg0.aClass142_2.aBoolean249 = this.aClass142_2.aBoolean249;
		} else if (Static654.method8725(arg3, this.anInt8524)) {
			arg0.aClass142_2 = this.aClass142_2;
		} else {
			arg0.aClass142_2 = null;
		}
		if (Static16.method297(this.anInt8524, arg3)) {
			if (arg2.aFloatArray61 == null || arg2.aFloatArray61.length < this.anInt8533) {
				local206 = this.anInt8536;
				arg0.aFloatArray62 = arg2.aFloatArray62 = new float[local206];
				arg0.aFloatArray61 = arg2.aFloatArray61 = new float[local206];
			} else {
				arg0.aFloatArray61 = arg2.aFloatArray61;
				arg0.aFloatArray62 = arg2.aFloatArray62;
			}
			for (local206 = 0; local206 < this.anInt8536; local206++) {
				arg0.aFloatArray61[local206] = this.aFloatArray61[local206];
				arg0.aFloatArray62[local206] = this.aFloatArray62[local206];
			}
		} else {
			arg0.aFloatArray62 = this.aFloatArray62;
			arg0.aFloatArray61 = this.aFloatArray61;
		}
		if (Static52.method1026(this.anInt8524, arg3)) {
			arg0.aClass142_3 = arg2.aClass142_3;
			arg0.aClass142_3.anInterface19_2 = this.aClass142_3.anInterface19_2;
			arg0.aClass142_3.aBoolean251 = true;
			arg0.aClass142_3.aBoolean249 = this.aClass142_3.aBoolean249;
		} else if (Static329.method4555(this.anInt8524, arg3)) {
			arg0.aClass142_3 = this.aClass142_3;
		} else {
			arg0.aClass142_3 = null;
		}
		if (Static32.method708(arg3, this.anInt8524)) {
			if (arg2.aShortArray115 == null || arg2.aShortArray115.length < this.anInt8533) {
				local206 = this.anInt8533;
				arg0.aShortArray113 = arg2.aShortArray113 = new short[local206];
				arg0.aShortArray115 = arg2.aShortArray115 = new short[local206];
				arg0.aShortArray116 = arg2.aShortArray116 = new short[local206];
			} else {
				arg0.aShortArray113 = arg2.aShortArray113;
				arg0.aShortArray115 = arg2.aShortArray115;
				arg0.aShortArray116 = arg2.aShortArray116;
			}
			for (local206 = 0; local206 < this.anInt8533; local206++) {
				arg0.aShortArray115[local206] = this.aShortArray115[local206];
				arg0.aShortArray113[local206] = this.aShortArray113[local206];
				arg0.aShortArray116[local206] = this.aShortArray116[local206];
			}
		} else {
			arg0.aShortArray116 = this.aShortArray116;
			arg0.aShortArray115 = this.aShortArray115;
			arg0.aShortArray113 = this.aShortArray113;
		}
		if (Static345.method4663(this.anInt8524, arg3)) {
			arg0.aClass70_1 = arg2.aClass70_1;
			arg0.aClass70_1.anInterface16_3 = this.aClass70_1.anInterface16_3;
			arg0.aClass70_1.aBoolean136 = this.aClass70_1.aBoolean136;
			arg0.aClass70_1.aBoolean135 = true;
		} else if (Static540.method7231(arg3, this.anInt8524)) {
			arg0.aClass70_1 = this.aClass70_1;
		} else {
			arg0.aClass70_1 = null;
		}
		if (Static36.method737(this.anInt8524, arg3)) {
			if (arg2.aShortArray117 == null || this.anInt8533 > arg2.aShortArray117.length) {
				local206 = this.anInt8533;
				arg0.aShortArray117 = arg2.aShortArray117 = new short[local206];
			} else {
				arg0.aShortArray117 = arg2.aShortArray117;
			}
			for (local206 = 0; local206 < this.anInt8533; local206++) {
				arg0.aShortArray117[local206] = this.aShortArray117[local206];
			}
		} else {
			arg0.aShortArray117 = this.aShortArray117;
		}
		if (!Static207.method8148(arg3, this.anInt8524)) {
			arg0.aClass140Array1 = this.aClass140Array1;
		} else if (arg2.aClass140Array1 == null || arg2.aClass140Array1.length < this.anInt8528) {
			local206 = this.anInt8528;
			arg0.aClass140Array1 = arg2.aClass140Array1 = new Class140[local206];
			for (local565 = 0; local565 < this.anInt8528; local565++) {
				arg0.aClass140Array1[local565] = this.aClass140Array1[local565].method3066();
			}
		} else {
			arg0.aClass140Array1 = arg2.aClass140Array1;
			for (local206 = 0; local206 < this.anInt8528; local206++) {
				arg0.aClass140Array1[local206].method3064(this.aClass140Array1[local206]);
			}
		}
		arg0.anIntArrayArray52 = this.anIntArrayArray52;
		arg0.aClass93Array1 = this.aClass93Array1;
		arg0.anIntArray582 = this.anIntArray582;
		arg0.anIntArray583 = this.anIntArray583;
		arg0.aShortArray121 = this.aShortArray121;
		arg0.aClass170Array4 = this.aClass170Array4;
		arg0.anIntArray579 = this.anIntArray579;
		arg0.aShortArray114 = this.aShortArray114;
		arg0.aShortArray120 = this.aShortArray120;
		if (this.aBoolean663) {
			arg0.anInt8527 = this.anInt8527;
			arg0.anInt8503 = this.anInt8503;
			arg0.anInt8522 = this.anInt8522;
			arg0.anInt8505 = this.anInt8505;
			arg0.aBoolean663 = true;
			arg0.anInt8504 = this.anInt8504;
			arg0.anInt8482 = this.anInt8482;
			arg0.anInt8483 = this.anInt8483;
			arg0.anInt8523 = this.anInt8523;
		} else {
			arg0.aBoolean663 = false;
		}
		arg0.aShortArray122 = this.aShortArray122;
		arg0.anIntArray585 = this.anIntArray585;
		arg0.aShortArray111 = this.aShortArray111;
		arg0.anIntArrayArray54 = this.anIntArrayArray54;
		arg0.anIntArrayArray53 = this.anIntArrayArray53;
		arg0.aClass235Array4 = this.aClass235Array4;
		return arg0;
	}

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(B)Z")
	private boolean method7361() {
		@Pc(13) boolean local13 = !this.aClass142_1.aBoolean249;
		@Pc(26) boolean local26 = (this.anInt8524 & 0x37) != 0 && !this.aClass142_2.aBoolean249;
		@Pc(34) boolean local34 = !this.aClass142_4.aBoolean249;
		@Pc(42) boolean local42 = !this.aClass142_3.aBoolean249;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(60) boolean local60 = true;
		@Pc(79) Interface19 local79;
		@Pc(93) Buffer local93;
		if (local34) {
			if (this.aClass142_4.anInterface19_1 == null) {
				this.aClass142_4.anInterface19_1 = this.aClass33_Sub2_19.method8157(this.aBoolean665);
			}
			local79 = this.aClass142_4.anInterface19_1;
			local79.method6567(this.anInt8536 * 12, 12);
			local93 = local79.method6566();
			if (local93 == null) {
				local60 = false;
			} else {
				this.aClass33_Sub2_19.aNativeInterface3.copyPositions(this.anIntArray580, this.anIntArray581, this.anIntArray584, this.aShortArray114, 0, 12, this.anInt8536, local93.getAddress());
				if (local79.method6568()) {
					this.aClass142_4.anInterface19_2 = local79;
					this.aClass142_4.aBoolean249 = true;
				} else {
					local60 = false;
				}
			}
		}
		@Pc(205) short[] local205;
		@Pc(214) short[] local214;
		@Pc(211) short[] local211;
		@Pc(208) byte[] local208;
		if (local13) {
			if (this.aClass142_1.anInterface19_1 == null) {
				this.aClass142_1.anInterface19_1 = this.aClass33_Sub2_19.method8157(this.aBoolean665);
			}
			local79 = this.aClass142_1.anInterface19_1;
			local79.method6567(this.anInt8536 * 4, 4);
			local93 = local79.method6566();
			if (local93 == null) {
				local60 = false;
			} else {
				if ((this.anInt8524 & 0x37) == 0) {
					if (this.aClass185_1 == null) {
						local205 = this.aShortArray118;
						local208 = this.aByteArray84;
						local211 = this.aShortArray112;
						local214 = this.aShortArray123;
					} else {
						local208 = this.aClass185_1.aByteArray50;
						local211 = this.aClass185_1.aShortArray64;
						local214 = this.aClass185_1.aShortArray62;
						local205 = this.aClass185_1.aShortArray63;
					}
					this.aClass33_Sub2_19.aNativeInterface3.copyLighting(this.aShortArray119, this.aByteArray83, this.aShortArray117, local205, local214, local211, local208, this.aShort111, this.aShort112, this.aShortArray111, 0, 4, this.anInt8536, local93.getAddress());
				} else {
					this.aClass33_Sub2_19.aNativeInterface3.copyColours(this.aShortArray119, this.aByteArray83, this.aShortArray117, this.aShort111, this.aShortArray111, 0, 4, this.anInt8536, local93.getAddress());
				}
				if (local79.method6568()) {
					this.aClass142_1.anInterface19_2 = local79;
					this.aClass142_1.aBoolean249 = true;
				} else {
					local60 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass142_2.anInterface19_1 == null) {
				this.aClass142_2.anInterface19_1 = this.aClass33_Sub2_19.method8157(this.aBoolean665);
			}
			local79 = this.aClass142_2.anInterface19_1;
			local79.method6567(this.anInt8536 * 12, 12);
			local93 = local79.method6566();
			if (local93 == null) {
				local60 = false;
			} else {
				if (this.aClass185_1 == null) {
					local205 = this.aShortArray118;
					local211 = this.aShortArray112;
					local208 = this.aByteArray84;
					local214 = this.aShortArray123;
				} else {
					local208 = this.aClass185_1.aByteArray50;
					local205 = this.aClass185_1.aShortArray63;
					local214 = this.aClass185_1.aShortArray62;
					local211 = this.aClass185_1.aShortArray64;
				}
				this.aClass33_Sub2_19.aNativeInterface3.copyNormals(local205, local214, local211, local208, 3.0F / (float) this.aShort112, 3.0F / (float) (this.aShort112 / 2 + this.aShort112), 0, 12, this.anInt8536, local93.getAddress());
				if (local79.method6568()) {
					this.aClass142_2.aBoolean249 = true;
					this.aClass142_2.anInterface19_2 = local79;
				} else {
					local60 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass142_3.anInterface19_1 == null) {
				this.aClass142_3.anInterface19_1 = this.aClass33_Sub2_19.method8157(this.aBoolean665);
			}
			local79 = this.aClass142_3.anInterface19_1;
			local79.method6567(this.anInt8536 * 8, 8);
			local93 = local79.method6566();
			if (local93 == null) {
				local60 = false;
			} else {
				this.aClass33_Sub2_19.aNativeInterface3.copyTexCoords(this.aFloatArray61, this.aFloatArray62, 0, 8, this.anInt8536, local93.getAddress());
				if (local79.method6568()) {
					this.aClass142_3.anInterface19_2 = local79;
					this.aClass142_3.aBoolean249 = true;
				} else {
					local60 = false;
				}
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!sk", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8479; local3++) {
			if (arg0 != 128) {
				this.anIntArray580[local3] = arg0 * this.anIntArray580[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray581[local3] = this.anIntArray581[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray584[local3] = this.anIntArray584[local3] * arg2 >> 7;
			}
		}
		this.method7367();
		this.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "()[Lclient!mk;")
	@Override
	public Class235[] method7331() {
		return this.aClass235Array4;
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(B)V")
	private void method7362() {
		if (this.aClass70_1 != null) {
			this.aClass70_1.aBoolean136 = false;
		}
	}

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean663) {
			this.method7354();
		}
		@Pc(16) int local16 = arg4 + this.anInt8503;
		@Pc(22) int local22 = arg4 + this.anInt8482;
		@Pc(27) int local27 = this.anInt8522 + arg6;
		@Pc(33) int local33 = arg6 + this.anInt8523;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8638 <= arg2.anInt8631 + local22 >> arg2.anInt8635 || local27 < 0 || local33 + arg2.anInt8631 >> arg2.anInt8635 >= arg2.anInt8630)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local22 + arg3.anInt8631 >> arg3.anInt8635 >= arg3.anInt8638 || local27 < 0 || arg3.anInt8630 <= arg3.anInt8631 + local33 >> arg3.anInt8635) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8635;
			local22 = arg2.anInt8631 + local22 - 1 >> arg2.anInt8635;
			local27 >>= arg2.anInt8635;
			local33 = local33 + arg2.anInt8631 - 1 >> arg2.anInt8635;
			if (arg2.method7450(local27, local16) == arg5 && arg2.method7450(local27, local22) == arg5 && arg2.method7450(local33, local16) == arg5 && arg5 == arg2.method7450(local33, local22)) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt8479; local195++) {
				this.anIntArray581[local195] = this.anIntArray581[local195] + arg2.method7453(this.anIntArray580[local195] - -arg4, arg6 + this.anIntArray584[local195]) - arg5;
			}
		} else {
			@Pc(260) int local260;
			@Pc(268) int local268;
			if (arg0 == 2) {
				local195 = this.anInt8483;
				if (local195 == 0) {
					return;
				}
				for (local260 = 0; local260 < this.anInt8479; local260++) {
					local268 = (this.anIntArray581[local260] << 16) / local195;
					if (arg1 > local268) {
						this.anIntArray581[local260] += (arg2.method7453(this.anIntArray580[local260] + arg4, arg6 + this.anIntArray584[local260]) - arg5) * (arg1 - local268) / arg1;
					}
				}
			} else {
				@Pc(276) int local276;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 4;
					local260 = (arg1 >> 8 & 0xFF) * 4;
					local268 = (arg1 >> 16 & 0xFF) << 6;
					local276 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg2.anInt8638 << arg2.anInt8635 <= (local195 >> 1) + arg4 + arg2.anInt8631 || arg6 - (local260 >> 1) < 0 || arg2.anInt8630 << arg2.anInt8635 <= (local260 >> 1) + arg6 + arg2.anInt8631) {
						return;
					}
					this.method7343(local276, local260, arg2, arg4, local195, local268, arg5, arg6);
				} else if (arg0 == 4) {
					local195 = this.anInt8527 - this.anInt8483;
					for (local260 = 0; local260 < this.anInt8479; local260++) {
						this.anIntArray581[local260] = this.anIntArray581[local260] + arg3.method7453(arg4 + this.anIntArray580[local260], arg6 + this.anIntArray584[local260]) + local195 - arg5;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt8527 - this.anInt8483;
					for (local260 = 0; local260 < this.anInt8479; local260++) {
						local268 = this.anIntArray580[local260] + arg4;
						local276 = arg6 + this.anIntArray584[local260];
						@Pc(380) int local380 = arg2.method7453(local268, local276);
						@Pc(386) int local386 = arg3.method7453(local268, local276);
						@Pc(394) int local394 = local380 - local386 - arg1;
						this.anIntArray581[local260] = local380 + ((this.anIntArray581[local260] << 8) / local195 * local394 >> 8) - arg5;
					}
				}
			}
		}
		this.method7367();
		this.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub2_Sub26.anIntArray563[arg0];
		@Pc(13) int local13 = Class4_Sub2_Sub26.anIntArray562[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8479; local15++) {
			@Pc(33) int local33 = this.anIntArray584[local15] * local9 + local13 * this.anIntArray580[local15] >> 14;
			this.anIntArray584[local15] = this.anIntArray584[local15] * local13 - this.anIntArray580[local15] * local9 >> 14;
			this.anIntArray580[local15] = local33;
		}
		this.method7367();
		this.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!sk", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub2_Sub26.anIntArray563[arg0];
		@Pc(13) int local13 = Class4_Sub2_Sub26.anIntArray562[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8479; local15++) {
			@Pc(34) int local34 = this.anIntArray581[local15] * local13 - this.anIntArray584[local15] * local9 >> 14;
			this.anIntArray584[local15] = this.anIntArray584[local15] * local13 + local9 * this.anIntArray581[local15] >> 14;
			this.anIntArray581[local15] = local34;
		}
		this.method7367();
		this.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!sk", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8533; local7++) {
			if (arg0 == this.aShortArray119[local7]) {
				this.aShortArray119[local7] = arg1;
			}
		}
		if (this.aClass93Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt8528; local38++) {
				@Pc(45) Class93 local45 = this.aClass93Array1[local38];
				@Pc(50) Class140 local50 = this.aClass140Array1[local38];
				local50.anInt3308 = Static411.anIntArray448[this.aShortArray119[local45.anInt2412] & 0xFFFF] & 0xFFFFFF | local50.anInt3308 & 0xFF000000;
			}
		}
		this.method7355();
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "()[Lclient!ir;")
	@Override
	public Class170[] method7333() {
		return this.aClass170Array4;
	}

	@OriginalMember(owner = "client!sk", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean663) {
			this.method7354();
		}
		return this.anInt8522;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!nh;ZII)Z")
	@Override
	public boolean method7341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method7365(arg2, arg4, arg1, arg3, arg5, arg0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(FIJFIIIIILclient!so;I)S")
	private short method7363(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class334 arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray579[arg6];
		@Pc(17) int local17 = this.anIntArray579[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray122[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg2 == Static655.aLongArray20[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray122[local19] = (short) (this.anInt8536 + 1);
		Static655.aLongArray20[local19] = arg2;
		this.aShortArray111[this.anInt8536] = (short) arg4;
		this.aShortArray114[this.anInt8536] = (short) arg6;
		this.aShortArray118[this.anInt8536] = (short) arg5;
		this.aShortArray123[this.anInt8536] = (short) arg7;
		this.aShortArray112[this.anInt8536] = (short) arg9;
		this.aByteArray84[this.anInt8536] = (byte) arg1;
		this.aFloatArray61[this.anInt8536] = arg3;
		this.aFloatArray62[this.anInt8536] = arg0;
		return (short) this.anInt8536++;
	}

	@OriginalMember(owner = "client!sk", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean663) {
			this.method7354();
		}
		return this.anInt8483;
	}

	@OriginalMember(owner = "client!sk", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean663) {
			this.method7354();
		}
		return this.anInt8482;
	}

	@OriginalMember(owner = "client!sk", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort112;
	}

	@OriginalMember(owner = "client!sk", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean663) {
			this.method7354();
		}
		return this.anInt8505;
	}

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass142_4 != null) {
			this.aClass142_4.aBoolean251 = Static567.method7517(arg0, this.anInt8524);
		}
		if (this.aClass142_3 != null) {
			this.aClass142_3.aBoolean251 = Static52.method1026(this.anInt8524, arg0);
		}
		if (this.aClass142_1 != null) {
			this.aClass142_1.aBoolean251 = Static425.method5897(this.anInt8524, arg0);
		}
		if (this.aClass142_2 != null) {
			this.aClass142_2.aBoolean251 = Static678.method8983(this.anInt8524, arg0);
		}
		this.anInt8496 = arg0;
		if (this.aClass185_1 != null && (this.anInt8496 & 0x10000) == 0) {
			this.aShortArray112 = this.aClass185_1.aShortArray64;
			this.aShortArray123 = this.aClass185_1.aShortArray62;
			this.aByteArray84 = this.aClass185_1.aByteArray50;
			this.aShortArray118 = this.aClass185_1.aShortArray63;
			this.aClass185_1 = null;
		}
		this.aBoolean662 = true;
		this.method7359();
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
	public void method7364() {
		if (this.aClass142_4 != null) {
			this.aClass142_4.method3085();
		}
		if (this.aClass142_3 != null) {
			this.aClass142_3.method3085();
		}
		if (this.aClass142_1 != null) {
			this.aClass142_1.method3085();
		}
		if (this.aClass142_2 != null) {
			this.aClass142_2.method3085();
		}
		if (this.aClass70_1 != null) {
			this.aClass70_1.method2053();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!nh;IIIZII)Z")
	private boolean method7365(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class92_Sub1 local8 = (Class92_Sub1) arg0;
		@Pc(12) Class92_Sub1 local12 = this.aClass33_Sub2_19.aClass92_Sub1_16;
		@Pc(33) float local33 = local8.aFloat44 * local12.aFloat45 + local12.aFloat49 * local8.aFloat50 + local8.aFloat42 * local12.aFloat51 + local12.aFloat50;
		@Pc(54) float local54 = local12.aFloat42 + local8.aFloat44 * local12.aFloat43 + local12.aFloat40 * local8.aFloat42 + local8.aFloat50 * local12.aFloat47;
		Static298.aFloat201 = local8.aFloat46 * local12.aFloat45 + local12.aFloat51 * local8.aFloat43 + local8.aFloat45 * local12.aFloat49;
		Static293.aFloat109 = local12.aFloat41 * local8.aFloat40 + local12.aFloat48 * local8.aFloat51 + local12.aFloat46 * local8.aFloat41;
		Static651.aFloat233 = local12.aFloat47 * local8.aFloat49 + local8.aFloat47 * local12.aFloat40 + local8.aFloat48 * local12.aFloat43;
		Static334.aFloat188 = local12.aFloat51 * local8.aFloat40 + local12.aFloat49 * local8.aFloat51 + local8.aFloat41 * local12.aFloat45;
		Static587.aFloat205 = local8.aFloat41 * local12.aFloat43 + local12.aFloat47 * local8.aFloat51 + local12.aFloat40 * local8.aFloat40;
		Static141.aFloat57 = local12.aFloat46 * local8.aFloat48 + local8.aFloat49 * local12.aFloat48 + local12.aFloat41 * local8.aFloat47;
		@Pc(183) float local183 = local12.aFloat44 + local8.aFloat42 * local12.aFloat41 + local12.aFloat48 * local8.aFloat50 + local12.aFloat46 * local8.aFloat44;
		Static304.aFloat232 = local8.aFloat46 * local12.aFloat43 + local12.aFloat47 * local8.aFloat45 + local8.aFloat43 * local12.aFloat40;
		Static376.aFloat122 = local12.aFloat51 * local8.aFloat47 + local12.aFloat49 * local8.aFloat49 + local8.aFloat48 * local12.aFloat45;
		Static542.aFloat198 = local8.aFloat43 * local12.aFloat41 + local12.aFloat48 * local8.aFloat45 + local8.aFloat46 * local12.aFloat46;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass33_Sub2_19.anInt9663;
		@Pc(255) int local255 = this.aClass33_Sub2_19.anInt9665;
		if (!this.aBoolean663) {
			this.method7354();
		}
		@Pc(270) int local270 = this.anInt8482 - this.anInt8503 >> 1;
		@Pc(279) int local279 = this.anInt8527 - this.anInt8483 >> 1;
		@Pc(287) int local287 = this.anInt8523 - this.anInt8522 >> 1;
		@Pc(292) int local292 = local270 + this.anInt8503;
		@Pc(297) int local297 = local279 + this.anInt8483;
		@Pc(303) int local303 = this.anInt8522 + local287;
		@Pc(310) int local310 = local292 - (local270 << arg1);
		@Pc(316) int local316 = local297 - (local279 << arg1);
		@Pc(323) int local323 = local303 - (local287 << arg1);
		@Pc(330) int local330 = local292 + (local270 << arg1);
		@Pc(337) int local337 = local297 + (local279 << arg1);
		Static602.anIntArray651[0] = local310;
		@Pc(354) int local354 = local303 + (local287 << arg1);
		Static65.anIntArray91[0] = local316;
		Static602.anIntArray651[1] = local330;
		Static164.anIntArray213[0] = local323;
		Static65.anIntArray91[1] = local316;
		Static602.anIntArray651[2] = local310;
		Static164.anIntArray213[1] = local323;
		Static65.anIntArray91[2] = local337;
		Static602.anIntArray651[3] = local330;
		Static164.anIntArray213[2] = local323;
		Static65.anIntArray91[3] = local337;
		Static602.anIntArray651[4] = local310;
		Static164.anIntArray213[3] = local323;
		Static65.anIntArray91[4] = local316;
		Static164.anIntArray213[4] = local354;
		Static602.anIntArray651[5] = local330;
		Static65.anIntArray91[5] = local316;
		Static602.anIntArray651[6] = local310;
		Static164.anIntArray213[5] = local354;
		Static65.anIntArray91[6] = local337;
		Static602.anIntArray651[7] = local330;
		Static164.anIntArray213[6] = local354;
		Static65.anIntArray91[7] = local337;
		Static164.anIntArray213[7] = local354;
		@Pc(493) float local493;
		@Pc(507) float local507;
		@Pc(479) float local479;
		@Pc(460) float local460;
		@Pc(465) float local465;
		@Pc(455) float local455;
		for (@Pc(448) int local448 = 0; local448 < 8; local448++) {
			local455 = (float) Static164.anIntArray213[local448];
			local460 = (float) Static602.anIntArray651[local448];
			local465 = (float) Static65.anIntArray91[local448];
			local479 = Static141.aFloat57 * local460 + local465 * Static293.aFloat109 + local455 * Static542.aFloat198 + local183;
			local493 = Static298.aFloat201 * local455 + local465 * Static334.aFloat188 + Static376.aFloat122 * local460 + local33;
			local507 = local54 + local455 * Static304.aFloat232 + local465 * Static587.aFloat205 + local460 * Static651.aFloat233;
			if (local479 >= (float) this.aClass33_Sub2_19.anInt9679) {
				if (arg4 > 0) {
					local479 = (float) arg4;
				}
				@Pc(534) float local534 = local493 * (float) local251 / local479 + (float) this.aClass33_Sub2_19.anInt9666;
				@Pc(546) float local546 = (float) local255 * local507 / local479 + (float) this.aClass33_Sub2_19.anInt9676;
				if (local243 < local534) {
					local243 = local534;
				}
				if (local241 > local534) {
					local241 = local534;
				}
				if (local546 < local245) {
					local245 = local546;
				}
				if (local546 > local247) {
					local247 = local546;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg5 > local241 && (float) arg5 < local243 && local245 < (float) arg2 && local247 > (float) arg2) {
			if (arg3) {
				return true;
			}
			if (this.anInt8536 > Static400.anIntArray444.length) {
				Static400.anIntArray444 = new int[this.anInt8536];
				Static112.anIntArray149 = new int[this.anInt8536];
			}
			@Pc(711) int local711;
			for (@Pc(621) int local621 = 0; local621 < this.anInt8479; local621++) {
				local465 = (float) this.anIntArray581[local621];
				local460 = (float) this.anIntArray580[local621];
				local455 = (float) this.anIntArray584[local621];
				local507 = local54 + local455 * Static304.aFloat232 + Static651.aFloat233 * local460 + Static587.aFloat205 * local465;
				local493 = local33 + Static298.aFloat201 * local455 + Static376.aFloat122 * local460 + Static334.aFloat188 * local465;
				local479 = local183 + local460 * Static141.aFloat57 + local465 * Static293.aFloat109 + local455 * Static542.aFloat198;
				@Pc(724) int local724;
				@Pc(729) int local729;
				@Pc(736) int local736;
				if (local479 >= (float) this.aClass33_Sub2_19.anInt9679) {
					if (arg4 > 0) {
						local479 = (float) arg4;
					}
					local711 = (int) ((float) this.aClass33_Sub2_19.anInt9666 + (float) local251 * local493 / local479);
					local724 = (int) ((float) local255 * local507 / local479 + (float) this.aClass33_Sub2_19.anInt9676);
					local729 = this.anIntArray579[local621];
					local736 = this.anIntArray579[local621 + 1];
					for (@Pc(738) int local738 = local729; local738 < local736; local738++) {
						@Pc(747) int local747 = this.aShortArray122[local738] - 1;
						if (local747 == -1) {
							break;
						}
						Static400.anIntArray444[local747] = local711;
						Static112.anIntArray149[local747] = local724;
					}
				} else {
					local711 = this.anIntArray579[local621];
					local724 = this.anIntArray579[local621 + 1];
					for (local729 = local711; local729 < local724; local729++) {
						local736 = this.aShortArray122[local729] - 1;
						if (local736 == -1) {
							break;
						}
						Static400.anIntArray444[this.aShortArray122[local729] - 1] = -999999;
					}
				}
			}
			for (local711 = 0; local711 < this.anInt8533; local711++) {
				if (Static400.anIntArray444[this.aShortArray115[local711]] != -999999 && Static400.anIntArray444[this.aShortArray113[local711]] != -999999 && Static400.anIntArray444[this.aShortArray116[local711]] != -999999 && this.method7357(Static400.anIntArray444[this.aShortArray116[local711]], Static112.anIntArray149[this.aShortArray116[local711]], Static112.anIntArray149[this.aShortArray113[local711]], Static400.anIntArray444[this.aShortArray115[local711]], arg2, Static400.anIntArray444[this.aShortArray113[local711]], arg5, Static112.anIntArray149[this.aShortArray115[local711]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sk", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray52 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8489; local12++) {
			this.anIntArray580[local12] <<= 0x4;
			this.anIntArray581[local12] <<= 0x4;
			this.anIntArray584[local12] <<= 0x4;
		}
		Static317.anInt4920 = 0;
		Static440.anInt6880 = 0;
		Static290.anInt4595 = 0;
		return true;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class62 method7329(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class62_Sub3 local12;
		@Pc(16) Class62_Sub3 local16;
		if (arg0 == 1) {
			local12 = this.aClass33_Sub2_19.aClass62_Sub3_25;
			local16 = this.aClass33_Sub2_19.aClass62_Sub3_24;
		} else if (arg0 == 2) {
			local16 = this.aClass33_Sub2_19.aClass62_Sub3_27;
			local12 = this.aClass33_Sub2_19.aClass62_Sub3_28;
		} else if (arg0 == 3) {
			local12 = this.aClass33_Sub2_19.aClass62_Sub3_23;
			local16 = this.aClass33_Sub2_19.aClass62_Sub3_22;
		} else if (arg0 == 4) {
			local12 = this.aClass33_Sub2_19.aClass62_Sub3_21;
			local16 = this.aClass33_Sub2_19.aClass62_Sub3_30;
		} else if (arg0 == 5) {
			local16 = this.aClass33_Sub2_19.aClass62_Sub3_29;
			local12 = this.aClass33_Sub2_19.aClass62_Sub3_26;
		} else {
			local12 = local16 = new Class62_Sub3(this.aClass33_Sub2_19, 0, 0, true, false);
		}
		return this.method7360(local12, arg2, local16, arg1, arg0 != 0);
	}

	@OriginalMember(owner = "client!sk", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt8496;
	}

	@OriginalMember(owner = "client!sk", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort111;
	}

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8479; local3++) {
			this.anIntArray584[local3] = -this.anIntArray584[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt8536; local29++) {
			this.aShortArray112[local29] = (short) -this.aShortArray112[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt8533; local52++) {
			@Pc(59) short local59 = this.aShortArray115[local52];
			this.aShortArray115[local52] = this.aShortArray116[local52];
			this.aShortArray116[local52] = local59;
		}
		this.method7367();
		this.method7369();
		this.method7362();
		this.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)Z")
	private boolean method7366() {
		if (this.aClass70_1.aBoolean136) {
			return true;
		}
		if (this.aClass70_1.anInterface16_2 == null) {
			this.aClass70_1.anInterface16_2 = this.aClass33_Sub2_19.method8265(this.aBoolean665);
		}
		@Pc(28) Interface16 local28 = this.aClass70_1.anInterface16_2;
		local28.method8360(this.anInt8490 * 6);
		@Pc(48) Buffer local48 = local28.method8364();
		if (local48 != null) {
			@Pc(56) Stream local56 = this.aClass33_Sub2_19.method8168(local48);
			@Pc(60) int local60;
			if (Stream.b()) {
				for (local60 = 0; local60 < this.anInt8490; local60++) {
					local56.f(this.aShortArray115[local60]);
					local56.f(this.aShortArray113[local60]);
					local56.f(this.aShortArray116[local60]);
				}
			} else {
				for (local60 = 0; local60 < this.anInt8490; local60++) {
					local56.d(this.aShortArray115[local60]);
					local56.d(this.aShortArray113[local60]);
					local56.d(this.aShortArray116[local60]);
				}
			}
			local56.c();
			if (local28.method8363()) {
				this.aClass70_1.aBoolean136 = true;
				this.aBoolean662 = true;
				this.aClass70_1.anInterface16_3 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sk", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub2_Sub26.anIntArray563[arg0];
		@Pc(13) int local13 = Class4_Sub2_Sub26.anIntArray562[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8479; local15++) {
			@Pc(33) int local33 = this.anIntArray580[local15] * local13 + local9 * this.anIntArray581[local15] >> 14;
			this.anIntArray581[local15] = local13 * this.anIntArray581[local15] - this.anIntArray580[local15] * local9 >> 14;
			this.anIntArray580[local15] = local33;
		}
		this.method7367();
		this.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	private void method7367() {
		if (this.aClass142_4 != null) {
			this.aClass142_4.aBoolean249 = false;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!nh;ZI)Z")
	@Override
	public boolean method7347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7365(arg2, arg4, arg1, arg3, -1, arg0);
	}

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "(B)V")
	private void method7368() {
		if (this.anInt8490 == 0) {
			return;
		}
		if (this.method7361() && this.method7366()) {
			this.aClass33_Sub2_19.method8175(this.aClass142_4.anInterface19_2, 0);
			this.aClass33_Sub2_19.method8175(this.aClass142_1.anInterface19_2, 1);
			this.aClass33_Sub2_19.method8175(this.aClass142_3.anInterface19_2, 2);
			@Pc(64) boolean local64;
			if ((this.anInt8524 & 0x37) == 0) {
				this.aClass33_Sub2_19.method8213(false);
				local64 = false;
				this.aClass33_Sub2_19.method8179(this.aClass33_Sub2_19.aClass247_21);
			} else {
				local64 = true;
				this.aClass33_Sub2_19.method8213(true);
				this.aClass33_Sub2_19.method8175(this.aClass142_2.anInterface19_2, 3);
				this.aClass33_Sub2_19.method8179(this.aClass33_Sub2_19.aClass247_20);
			}
			for (@Pc(97) int local97 = 0; local97 < this.anIntArray583.length; local97++) {
				@Pc(104) int local104 = this.anIntArray585[local97];
				@Pc(111) int local111 = this.anIntArray585[local97 + 1];
				@Pc(118) int local118 = this.aShortArray117[local104] & 0xFFFF;
				if (local118 == 65535) {
					local118 = -1;
				}
				this.aClass33_Sub2_19.method8272(local64, local118, true);
				this.aClass33_Sub2_19.method8279(this.aClass70_1.anInterface16_3, this.anIntArray582[local97], Static83.aClass194_13, local104 * 3, local111 - local104, this.anIntArray583[local97]);
			}
		}
		this.method7359();
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)V")
	private void method7369() {
		if ((this.anInt8524 & 0x37) != 0) {
			if (this.aClass142_2 == null) {
				return;
			}
			this.aClass142_2.aBoolean249 = false;
		} else if (this.aClass142_1 != null) {
			this.aClass142_1.aBoolean249 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "()V")
	@Override
	protected void method7345() {
	}

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub2_Sub26.anIntArray563[arg0];
		@Pc(13) int local13 = Class4_Sub2_Sub26.anIntArray562[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8479; local15++) {
			local33 = this.anIntArray580[local15] * local13 + this.anIntArray584[local15] * local9 >> 14;
			this.anIntArray584[local15] = local13 * this.anIntArray584[local15] - this.anIntArray580[local15] * local9 >> 14;
			this.anIntArray580[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt8536; local33++) {
			@Pc(84) int local84 = this.aShortArray112[local33] * local9 + this.aShortArray118[local33] * local13 >> 14;
			this.aShortArray112[local33] = (short) (local13 * this.aShortArray112[local33] - local9 * this.aShortArray118[local33] >> 14);
			this.aShortArray118[local33] = (short) local84;
		}
		this.method7367();
		this.method7369();
		this.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "()V")
	@Override
	public void method7338() {
		if (this.anInt8536 > 0 && this.anInt8490 > 0) {
			this.method7361();
			this.method7366();
			this.method7359();
		}
	}

	@OriginalMember(owner = "client!sk", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface9 local9 = this.aClass33_Sub2_19.anInterface9_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt8533; local11++) {
			if (this.aShortArray117[local11] == arg0) {
				this.aShortArray117[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class130 local48 = local9.method1558(arg0 & 0xFFFF);
			local35 = local48.aByte40;
			local37 = local48.aByte38;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class130 local68 = local9.method1558(arg1 & 0xFFFF);
			if (local68.aByte34 != 0 || local68.aByte36 != 0) {
				this.aBoolean664 = true;
			}
			local56 = local68.aByte40;
			local58 = local68.aByte38;
		}
		if (!(local56 != local35 | local37 != local58)) {
			return;
		}
		if (this.aClass93Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt8528; local109++) {
				@Pc(116) Class93 local116 = this.aClass93Array1[local109];
				@Pc(121) Class140 local121 = this.aClass140Array1[local109];
				local121.anInt3308 = Static411.anIntArray448[this.aShortArray119[local116.anInt2412] & 0xFFFF] & 0xFFFFFF | local121.anInt3308 & 0xFF000000;
			}
		}
		this.method7355();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt8533; local7++) {
			local16 = this.aShortArray119[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 -= -(arg3 * (arg1 - local28) >> 7);
			}
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(61) int local61 = local16 & 0x7F;
			if (arg2 != -1) {
				local61 += (arg2 - local61) * arg3 >> 7;
			}
			this.aShortArray119[local7] = (short) (local61 | local28 << 7 | local22 << 10);
		}
		if (this.aClass93Array1 != null) {
			for (local16 = 0; local16 < this.anInt8528; local16++) {
				@Pc(107) Class93 local107 = this.aClass93Array1[local16];
				@Pc(112) Class140 local112 = this.aClass140Array1[local16];
				local112.anInt3308 = Static411.anIntArray448[this.aShortArray119[local107.anInt2412] & 0xFFFF] & 0xFFFFFF | local112.anInt3308 & 0xFF000000;
			}
		}
		this.method7355();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7342(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
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
			local27 = 0;
			Static317.anInt4920 = 0;
			Static440.anInt6880 = 0;
			Static290.anInt4595 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray52.length) {
					local51 = this.anIntArrayArray52[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static440.anInt6880 += this.anIntArray580[local59];
						Static290.anInt4595 += this.anIntArray581[local59];
						local27++;
						Static317.anInt4920 += this.anIntArray584[local59];
					}
				}
			}
			if (local27 <= 0) {
				Static290.anInt4595 = local25;
				Static440.anInt6880 = local17;
				Static317.anInt4920 = local21;
			} else {
				Static440.anInt6880 = local17 + Static440.anInt6880 / local27;
				Static317.anInt4920 = local21 + Static317.anInt4920 / local27;
				Static290.anInt4595 = local25 + Static290.anInt4595 / local27;
			}
			return;
		}
		@Pc(153) int[] local153;
		@Pc(155) int local155;
		if (arg0 == 1) {
			local17 = arg2 << 4;
			local25 = arg3 << 4;
			local21 = arg4 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray52.length > local35) {
					local153 = this.anIntArrayArray52[local35];
					for (local155 = 0; local155 < local153.length; local155++) {
						local53 = local153[local155];
						this.anIntArray580[local53] += local17;
						this.anIntArray581[local53] += local25;
						this.anIntArray584[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(279) int local279;
		@Pc(297) int local297;
		@Pc(750) int local750;
		@Pc(759) int local759;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray52.length > local35) {
					local153 = this.anIntArrayArray52[local35];
					if ((arg5 & 0x1) == 0) {
						for (local155 = 0; local155 < local153.length; local155++) {
							local53 = local153[local155];
							this.anIntArray580[local53] -= Static440.anInt6880;
							this.anIntArray581[local53] -= Static290.anInt4595;
							this.anIntArray584[local53] -= Static317.anInt4920;
							if (arg4 != 0) {
								local59 = Class4_Sub2_Sub26.anIntArray563[arg4];
								local279 = Class4_Sub2_Sub26.anIntArray562[arg4];
								local297 = local279 * this.anIntArray580[local53] + this.anIntArray581[local53] * local59 + 16383 >> 14;
								this.anIntArray581[local53] = this.anIntArray581[local53] * local279 + 16383 - this.anIntArray580[local53] * local59 >> 14;
								this.anIntArray580[local53] = local297;
							}
							if (arg2 != 0) {
								local59 = Class4_Sub2_Sub26.anIntArray563[arg2];
								local279 = Class4_Sub2_Sub26.anIntArray562[arg2];
								local297 = this.anIntArray581[local53] * local279 + 16383 - local59 * this.anIntArray584[local53] >> 14;
								this.anIntArray584[local53] = this.anIntArray581[local53] * local59 + local279 * this.anIntArray584[local53] + 16383 >> 14;
								this.anIntArray581[local53] = local297;
							}
							if (arg3 != 0) {
								local59 = Class4_Sub2_Sub26.anIntArray563[arg3];
								local279 = Class4_Sub2_Sub26.anIntArray562[arg3];
								local297 = this.anIntArray580[local53] * local279 + local59 * this.anIntArray584[local53] + 16383 >> 14;
								this.anIntArray584[local53] = local279 * this.anIntArray584[local53] + 16383 - local59 * this.anIntArray580[local53] >> 14;
								this.anIntArray580[local53] = local297;
							}
							this.anIntArray580[local53] += Static440.anInt6880;
							this.anIntArray581[local53] += Static290.anInt4595;
							this.anIntArray584[local53] += Static317.anInt4920;
						}
					} else {
						for (local155 = 0; local155 < local153.length; local155++) {
							local53 = local153[local155];
							this.anIntArray580[local53] -= Static440.anInt6880;
							this.anIntArray581[local53] -= Static290.anInt4595;
							this.anIntArray584[local53] -= Static317.anInt4920;
							if (arg2 != 0) {
								local59 = Class4_Sub2_Sub26.anIntArray563[arg2];
								local279 = Class4_Sub2_Sub26.anIntArray562[arg2];
								local297 = this.anIntArray581[local53] * local279 + 16383 - local59 * this.anIntArray584[local53] >> 14;
								this.anIntArray584[local53] = this.anIntArray584[local53] * local279 + local59 * this.anIntArray581[local53] + 16383 >> 14;
								this.anIntArray581[local53] = local297;
							}
							if (arg4 != 0) {
								local59 = Class4_Sub2_Sub26.anIntArray563[arg4];
								local279 = Class4_Sub2_Sub26.anIntArray562[arg4];
								local297 = local279 * this.anIntArray580[local53] + this.anIntArray581[local53] * local59 + 16383 >> 14;
								this.anIntArray581[local53] = this.anIntArray581[local53] * local279 + 16383 - this.anIntArray580[local53] * local59 >> 14;
								this.anIntArray580[local53] = local297;
							}
							if (arg3 != 0) {
								local59 = Class4_Sub2_Sub26.anIntArray563[arg3];
								local279 = Class4_Sub2_Sub26.anIntArray562[arg3];
								local297 = local59 * this.anIntArray584[local53] + this.anIntArray580[local53] * local279 + 16383 >> 14;
								this.anIntArray584[local53] = this.anIntArray584[local53] * local279 + 16383 - this.anIntArray580[local53] * local59 >> 14;
								this.anIntArray580[local53] = local297;
							}
							this.anIntArray580[local53] += Static440.anInt6880;
							this.anIntArray581[local53] += Static290.anInt4595;
							this.anIntArray584[local53] += Static317.anInt4920;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray52.length > local41) {
						local51 = this.anIntArrayArray52[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local279 = this.anIntArray579[local59];
							local297 = this.anIntArray579[local59 + 1];
							for (local750 = local279; local750 < local297; local750++) {
								local759 = this.aShortArray122[local750] - 1;
								if (local759 == -1) {
									break;
								}
								@Pc(768) int local768;
								@Pc(772) int local772;
								@Pc(790) int local790;
								if (arg4 != 0) {
									local768 = Class4_Sub2_Sub26.anIntArray563[arg4];
									local772 = Class4_Sub2_Sub26.anIntArray562[arg4];
									local790 = local772 * this.aShortArray118[local759] + local768 * this.aShortArray123[local759] + 16383 >> 14;
									this.aShortArray123[local759] = (short) (local772 * this.aShortArray123[local759] + 16383 - local768 * this.aShortArray118[local759] >> 14);
									this.aShortArray118[local759] = (short) local790;
								}
								if (arg2 != 0) {
									local768 = Class4_Sub2_Sub26.anIntArray563[arg2];
									local772 = Class4_Sub2_Sub26.anIntArray562[arg2];
									local790 = this.aShortArray123[local759] * local772 + 16383 - this.aShortArray112[local759] * local768 >> 14;
									this.aShortArray112[local759] = (short) (this.aShortArray123[local759] * local768 + local772 * this.aShortArray112[local759] + 16383 >> 14);
									this.aShortArray123[local759] = (short) local790;
								}
								if (arg3 != 0) {
									local768 = Class4_Sub2_Sub26.anIntArray563[arg3];
									local772 = Class4_Sub2_Sub26.anIntArray562[arg3];
									local790 = local772 * this.aShortArray118[local759] + this.aShortArray112[local759] * local768 + 16383 >> 14;
									this.aShortArray112[local759] = (short) (this.aShortArray112[local759] * local772 + 16383 - local768 * this.aShortArray118[local759] >> 14);
									this.aShortArray118[local759] = (short) local790;
								}
							}
						}
					}
				}
				this.method7369();
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray52.length > local35) {
					local153 = this.anIntArrayArray52[local35];
					for (local155 = 0; local155 < local153.length; local155++) {
						local53 = local153[local155];
						this.anIntArray580[local53] -= Static440.anInt6880;
						this.anIntArray581[local53] -= Static290.anInt4595;
						this.anIntArray584[local53] -= Static317.anInt4920;
						this.anIntArray580[local53] = arg2 * this.anIntArray580[local53] >> 7;
						this.anIntArray581[local53] = this.anIntArray581[local53] * arg3 >> 7;
						this.anIntArray584[local53] = this.anIntArray584[local53] * arg4 >> 7;
						this.anIntArray580[local53] += Static440.anInt6880;
						this.anIntArray581[local53] += Static290.anInt4595;
						this.anIntArray584[local53] += Static317.anInt4920;
					}
				}
			}
		} else {
			@Pc(1208) Class140 local1208;
			@Pc(1105) boolean local1105;
			@Pc(1203) Class93 local1203;
			if (arg0 == 5) {
				if (this.anIntArrayArray53 != null) {
					local1105 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray53.length > local41) {
							local51 = this.anIntArrayArray53[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local279 = (this.aByteArray83[local59] & 0xFF) + (arg2 * 8);
								if (local279 < 0) {
									local279 = 0;
								} else if (local279 > 255) {
									local279 = 255;
								}
								this.aByteArray83[local59] = (byte) local279;
							}
							local1105 |= local51.length > 0;
						}
					}
					if (local1105) {
						if (this.aClass93Array1 != null) {
							for (local41 = 0; local41 < this.anInt8528; local41++) {
								local1203 = this.aClass93Array1[local41];
								local1208 = this.aClass140Array1[local41];
								local1208.anInt3308 = local1208.anInt3308 & 0xFFFFFF | 255 - (this.aByteArray83[local1203.anInt2412] & 0xFF) << 24;
							}
						}
						this.method7355();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray53 != null) {
					local1105 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray53.length > local41) {
							local51 = this.anIntArrayArray53[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local279 = this.aShortArray119[local59] & 0xFFFF;
								local297 = local279 >> 10 & 0x3F;
								local750 = local279 >> 7 & 0x7;
								local750 += arg3 / 4;
								@Pc(1311) int local1311 = local297 + arg2 & 0x3F;
								local759 = local279 & 0x7F;
								local759 += arg4;
								if (local750 < 0) {
									local750 = 0;
								} else if (local750 > 7) {
									local750 = 7;
								}
								if (local759 < 0) {
									local759 = 0;
								} else if (local759 > 127) {
									local759 = 127;
								}
								this.aShortArray119[local59] = (short) (local750 << 7 | local1311 << 10 | local759);
							}
							local1105 |= local51.length > 0;
						}
					}
					if (local1105) {
						if (this.aClass93Array1 != null) {
							for (local41 = 0; local41 < this.anInt8528; local41++) {
								local1203 = this.aClass93Array1[local41];
								local1208 = this.aClass140Array1[local41];
								local1208.anInt3308 = Static411.anIntArray448[this.aShortArray119[local1203.anInt2412] & 0xFFFF] & 0xFFFFFF | local1208.anInt3308 & 0xFF000000;
							}
						}
						this.method7355();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray54 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray54.length) {
							local153 = this.anIntArrayArray54[local35];
							for (local155 = 0; local155 < local153.length; local155++) {
								local1208 = this.aClass140Array1[local153[local155]];
								local1208.anInt3313 += arg2;
								local1208.anInt3309 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray54 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray54.length) {
							local153 = this.anIntArrayArray54[local35];
							for (local155 = 0; local155 < local153.length; local155++) {
								local1208 = this.aClass140Array1[local153[local155]];
								local1208.anInt3310 = local1208.anInt3310 * arg2 >> 7;
								local1208.anInt3315 = arg3 * local1208.anInt3315 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray54 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray54.length > local35) {
						local153 = this.anIntArrayArray54[local35];
						for (local155 = 0; local155 < local153.length; local155++) {
							local1208 = this.aClass140Array1[local153[local155]];
							local1208.anInt3316 = local1208.anInt3316 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean663) {
			this.method7354();
		}
		return this.anInt8523;
	}
}
