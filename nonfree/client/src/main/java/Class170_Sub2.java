import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class170_Sub2 extends Class170 {

	@OriginalMember(owner = "client!pea", name = "bb", descriptor = "I")
	private int anInt7723;

	@OriginalMember(owner = "client!pea", name = "zb", descriptor = "I")
	private int anInt7724;

	@OriginalMember(owner = "client!pea", name = "cc", descriptor = "I")
	private int anInt7727;

	@OriginalMember(owner = "client!pea", name = "Mb", descriptor = "Z")
	private boolean aBoolean520;

	@OriginalMember(owner = "client!pea", name = "sb", descriptor = "Lclient!nm;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!pea", name = "Z", descriptor = "Lclient!hd;")
	private Class152 aClass152_1;

	@OriginalMember(owner = "client!pea", name = "N", descriptor = "I")
	private int anInt7738;

	@OriginalMember(owner = "client!pea", name = "Gb", descriptor = "I")
	private int anInt7741;

	@OriginalMember(owner = "client!pea", name = "pb", descriptor = "I")
	private int anInt7750;

	@OriginalMember(owner = "client!pea", name = "gb", descriptor = "Lclient!hd;")
	private Class152 aClass152_2;

	@OriginalMember(owner = "client!pea", name = "s", descriptor = "Lclient!hd;")
	private Class152 aClass152_3;

	@OriginalMember(owner = "client!pea", name = "Bc", descriptor = "I")
	private int anInt7758;

	@OriginalMember(owner = "client!pea", name = "Qb", descriptor = "Lclient!hd;")
	private Class152 aClass152_4;

	@OriginalMember(owner = "client!pea", name = "R", descriptor = "Lclient!ida;")
	private Class174 aClass174_1;

	@OriginalMember(owner = "client!pea", name = "nc", descriptor = "Z")
	private boolean aBoolean523;

	@OriginalMember(owner = "client!pea", name = "tc", descriptor = "I")
	private int anInt7787;

	@OriginalMember(owner = "client!pea", name = "Dc", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_16;

	@OriginalMember(owner = "client!pea", name = "Yb", descriptor = "I")
	private int anInt7797;

	@OriginalMember(owner = "client!pea", name = "Lb", descriptor = "Z")
	private boolean aBoolean524;

	@OriginalMember(owner = "client!pea", name = "Rb", descriptor = "I")
	private int anInt7799;

	@OriginalMember(owner = "client!pea", name = "rc", descriptor = "I")
	private int anInt7801;

	@OriginalMember(owner = "client!pea", name = "W", descriptor = "[I")
	private int[] anIntArray575;

	@OriginalMember(owner = "client!pea", name = "Oc", descriptor = "I")
	private int anInt7789;

	@OriginalMember(owner = "client!pea", name = "vb", descriptor = "I")
	private int anInt7782;

	@OriginalMember(owner = "client!pea", name = "u", descriptor = "Z")
	private boolean aBoolean521;

	@OriginalMember(owner = "client!pea", name = "Q", descriptor = "Z")
	private boolean aBoolean522;

	@OriginalMember(owner = "client!pea", name = "Wb", descriptor = "I")
	private int anInt7739;

	@OriginalMember(owner = "client!pea", name = "zc", descriptor = "[I")
	private int[] anIntArray571;

	@OriginalMember(owner = "client!pea", name = "w", descriptor = "[I")
	private int[] anIntArray569;

	@OriginalMember(owner = "client!pea", name = "X", descriptor = "[I")
	private int[] anIntArray573;

	@OriginalMember(owner = "client!pea", name = "fc", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!pea", name = "Ic", descriptor = "I")
	private int anInt7796;

	@OriginalMember(owner = "client!pea", name = "Jc", descriptor = "[Lclient!lk;")
	private Class232[] aClass232Array4;

	@OriginalMember(owner = "client!pea", name = "Ub", descriptor = "[Lclient!ip;")
	private Class184[] aClass184Array4;

	@OriginalMember(owner = "client!pea", name = "ac", descriptor = "I")
	private int anInt7735;

	@OriginalMember(owner = "client!pea", name = "n", descriptor = "[Lclient!qf;")
	private Class306[] aClass306Array1;

	@OriginalMember(owner = "client!pea", name = "yc", descriptor = "[Lclient!dw;")
	private Class83[] aClass83Array1;

	@OriginalMember(owner = "client!pea", name = "gc", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!pea", name = "eb", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!pea", name = "Bb", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!pea", name = "Kb", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!pea", name = "ub", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!pea", name = "Vb", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!pea", name = "Ob", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!pea", name = "tb", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!pea", name = "qc", descriptor = "[F")
	private float[] aFloatArray54;

	@OriginalMember(owner = "client!pea", name = "jc", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!pea", name = "Ib", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!pea", name = "kc", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!pea", name = "v", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!pea", name = "mc", descriptor = "[F")
	private float[] aFloatArray55;

	@OriginalMember(owner = "client!pea", name = "uc", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!pea", name = "q", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!pea", name = "cb", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!pea", name = "lb", descriptor = "S")
	private short lb;

	@OriginalMember(owner = "client!pea", name = "Hc", descriptor = "[I")
	private int[] anIntArray572;

	@OriginalMember(owner = "client!pea", name = "Kc", descriptor = "[I")
	private int[] anIntArray568;

	@OriginalMember(owner = "client!pea", name = "sc", descriptor = "[I")
	private int[] anIntArray570;

	@OriginalMember(owner = "client!pea", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!pea", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!pea", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!jca;Lclient!gt;IIII)V")
	public Class170_Sub2(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_14;
		this.anIntArray575 = new int[arg1.anInt3636 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt3646];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt3646; local24++) {
			if (arg1.aByteArray29 == null || arg1.aByteArray29[local24] != 2) {
				if (arg1.aShortArray38 != null && arg1.aShortArray38[local24] != -1) {
					@Pc(65) Class406 local65 = local11.method5761(arg1.aShortArray38[local24] & 0xFFFF);
					if (((this.anInt7727 & 0x40) == 0 || !local65.aBoolean761) && local65.aBoolean765) {
						continue;
					}
				}
				local22[this.anInt7789++] = local24;
				this.anIntArray575[arg1.aShortArray30[local24]]++;
				this.anIntArray575[arg1.aShortArray33[local24]]++;
				this.anIntArray575[arg1.aShortArray36[local24]]++;
			}
		}
		this.anInt7782 = this.anInt7789;
		@Pc(149) long[] local149 = new long[this.anInt7789];
		@Pc(164) boolean local164 = (this.anInt7724 & 0x100) != 0;
		@Pc(178) int local178;
		@Pc(191) int local191;
		@Pc(370) int local370;
		for (@Pc(166) int local166 = 0; local166 < this.anInt7789; local166++) {
			@Pc(174) int local174 = local22[local166];
			@Pc(176) Class406 local176 = null;
			local178 = 0;
			@Pc(180) byte local180 = 0;
			@Pc(182) byte local182 = 0;
			@Pc(184) byte local184 = 0;
			if (arg1.aClass60Array1 != null) {
				@Pc(189) boolean local189 = false;
				for (local191 = 0; local191 < arg1.aClass60Array1.length; local191++) {
					@Pc(198) Class60 local198 = arg1.aClass60Array1[local191];
					if (local198.anInt2027 == local174) {
						@Pc(207) Class343 local207 = Static692.method9171(local198.anInt2032);
						if (local207.aBoolean605) {
							local189 = true;
						}
						if (local207.anInt9034 != -1) {
							@Pc(223) Class406 local223 = local11.method5761(local207.anInt9034);
							if (local223.anInt11143 == 2) {
								this.aBoolean521 = true;
							}
						}
					}
				}
				if (local189) {
					local149[local166] = Long.MAX_VALUE;
					this.anInt7782--;
					continue;
				}
			}
			@Pc(258) short local258 = -1;
			if (arg1.aShortArray38 != null) {
				local258 = arg1.aShortArray38[local174];
				if (local258 != -1) {
					local176 = local11.method5761(local258 & 0xFFFF);
					if ((this.anInt7727 & 0x40) != 0 && local176.aBoolean761) {
						local176 = null;
						local258 = -1;
					} else {
						local184 = local176.aByte147;
						local182 = local176.aByte149;
					}
				}
			}
			@Pc(322) boolean local322 = arg1.aByteArray27 != null && arg1.aByteArray27[local174] != 0 || local176 != null && local176.anInt11143 != 0;
			if ((local164 || local322) && arg1.aByteArray28 != null) {
				local178 += arg1.aByteArray28[local174] << 17;
			}
			if (local322) {
				local178 += 65536;
			}
			local178 += (local182 & 0xFF) << 8;
			local178 += local184 & 0xFF;
			local370 = local180 + ((local258 & 0xFFFF) << 16);
			@Pc(376) int local376 = local370 + (local166 & 0xFFFF);
			local149[local166] = (long) local376 + ((long) local178 << 32);
			this.aBoolean521 |= local322;
			this.aBoolean522 |= local176 != null && (local176.aByte145 != 0 || local176.aByte150 != 0);
		}
		Static695.method6729(local22, local149);
		this.anInt7739 = arg1.anInt3636;
		this.anIntArray571 = arg1.anIntArray257;
		this.anIntArray569 = arg1.anIntArray251;
		this.anIntArray573 = arg1.anIntArray253;
		this.aShortArray112 = arg1.aShortArray32;
		this.anInt7796 = arg1.anInt3635;
		@Pc(460) Class194[] local460 = new Class194[this.anInt7739];
		this.aClass232Array4 = arg1.aClass232Array1;
		this.aClass184Array4 = arg1.aClass184Array1;
		@Pc(488) int local488;
		@Pc(504) int local504;
		@Pc(551) int local551;
		if (arg1.aClass60Array1 != null) {
			this.anInt7735 = arg1.aClass60Array1.length;
			this.aClass306Array1 = new Class306[this.anInt7735];
			this.aClass83Array1 = new Class83[this.anInt7735];
			for (local488 = 0; local488 < this.anInt7735; local488++) {
				@Pc(497) Class60 local497 = arg1.aClass60Array1[local488];
				@Pc(502) Class343 local502 = Static692.method9171(local497.anInt2032);
				local504 = -1;
				for (@Pc(506) int local506 = 0; local506 < this.anInt7789; local506++) {
					if (local497.anInt2027 == local22[local506]) {
						local504 = local506;
						break;
					}
				}
				if (local504 == -1) {
					throw new RuntimeException();
				}
				local551 = Static537.anIntArray601[arg1.aShortArray35[local497.anInt2027] & 0xFFFF] & 0xFFFFFF;
				@Pc(570) int local570 = local551 | 255 - (arg1.aByteArray27 == null ? 0 : arg1.aByteArray27[local497.anInt2027]) << 24;
				this.aClass83Array1[local488] = new Class83(local504, arg1.aShortArray30[local497.anInt2027], arg1.aShortArray33[local497.anInt2027], arg1.aShortArray36[local497.anInt2027], local502.anInt9031, local502.anInt9033, local502.anInt9034, local502.anInt9030, local502.anInt9028, local502.aBoolean605, local502.aBoolean604, local497.anInt2033);
				this.aClass306Array1[local488] = new Class306(local570);
			}
		}
		local488 = this.anInt7789 * 3;
		this.aShortArray110 = new short[local488];
		this.aShortArray105 = new short[this.anInt7789];
		this.aShortArray109 = new short[this.anInt7789];
		this.aShort84 = (short) arg4;
		if (arg1.aShortArray29 != null) {
			this.aShortArray107 = new short[this.anInt7789];
		}
		this.aShortArray108 = new short[this.anInt7789];
		this.aShortArray115 = new short[local488];
		this.aShortArray104 = new short[this.anInt7789];
		this.aFloatArray54 = new float[local488];
		this.aShortArray111 = new short[local488];
		this.aShortArray116 = new short[local488];
		Static128.aLongArray3 = new long[local488];
		this.aShortArray113 = new short[local488];
		this.aShortArray106 = new short[this.anInt7789];
		this.aFloatArray55 = new float[local488];
		this.aByteArray78 = new byte[local488];
		this.aShortArray114 = new short[local488];
		this.aByteArray77 = new byte[this.anInt7789];
		this.lb = (short) arg3;
		local178 = 0;
		for (local370 = 0; local370 < arg1.anInt3636; local370++) {
			local504 = this.anIntArray575[local370];
			this.anIntArray575[local370] = local178;
			local460[local370] = new Class194();
			local178 += local504;
		}
		this.anIntArray575[arg1.anInt3636] = local178;
		@Pc(768) Class384 local768 = Static131.method2342(arg1, local22, this.anInt7789);
		@Pc(772) Class351[] local772 = new Class351[arg1.anInt3646];
		@Pc(815) int local815;
		@Pc(826) int local826;
		@Pc(836) int local836;
		@Pc(793) short local793;
		@Pc(804) int local804;
		for (local551 = 0; local551 < arg1.anInt3646; local551++) {
			@Pc(783) short local783 = arg1.aShortArray30[local551];
			@Pc(788) short local788 = arg1.aShortArray33[local551];
			local793 = arg1.aShortArray36[local551];
			local804 = this.anIntArray573[local788] - this.anIntArray573[local783];
			local815 = this.anIntArray571[local788] - this.anIntArray571[local783];
			local826 = this.anIntArray569[local788] - this.anIntArray569[local783];
			local836 = this.anIntArray573[local793] - this.anIntArray573[local783];
			@Pc(846) int local846 = this.anIntArray571[local793] - this.anIntArray571[local783];
			@Pc(857) int local857 = this.anIntArray569[local793] - this.anIntArray569[local783];
			@Pc(866) int local866 = local857 * local815 - local826 * local846;
			@Pc(875) int local875 = local836 * local826 - local804 * local857;
			@Pc(884) int local884 = local804 * local846 - local836 * local815;
			while (local866 > 8192 || local875 > 8192 || local884 > 8192 || local866 < -8192 || local875 < -8192 || local884 < -8192) {
				local875 >>= 0x1;
				local884 >>= 0x1;
				local866 >>= 0x1;
			}
			@Pc(945) int local945 = (int) Math.sqrt((double) (local866 * local866 + local875 * local875 + local884 * local884));
			if (local945 <= 0) {
				local945 = 1;
			}
			local884 = local884 * 256 / local945;
			local875 = local875 * 256 / local945;
			local866 = local866 * 256 / local945;
			@Pc(978) byte local978 = arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local551];
			if (local978 == 0) {
				@Pc(984) Class194 local984 = local460[local783];
				local984.anInt5067 += local884;
				local984.anInt5063++;
				local984.anInt5065 += local875;
				local984.anInt5062 += local866;
				@Pc(1012) Class194 local1012 = local460[local788];
				local1012.anInt5062 += local866;
				local1012.anInt5063++;
				local1012.anInt5067 += local884;
				local1012.anInt5065 += local875;
				@Pc(1040) Class194 local1040 = local460[local793];
				local1040.anInt5063++;
				local1040.anInt5065 += local875;
				local1040.anInt5067 += local884;
				local1040.anInt5062 += local866;
			} else if (local978 == 1) {
				@Pc(1079) Class351 local1079 = local772[local551] = new Class351();
				local1079.anInt9199 = local884;
				local1079.anInt9198 = local875;
				local1079.anInt9200 = local866;
			}
		}
		@Pc(1109) int local1109;
		@Pc(1153) short local1153;
		for (local191 = 0; local191 < this.anInt7789; local191++) {
			local1109 = local22[local191];
			@Pc(1116) int local1116 = arg1.aShortArray35[local1109] & 0xFFFF;
			if (arg1.aByteArray30 == null) {
				local804 = -1;
			} else {
				local804 = arg1.aByteArray30[local1109];
			}
			if (arg1.aByteArray27 == null) {
				local815 = 0;
			} else {
				local815 = arg1.aByteArray27[local1109] & 0xFF;
			}
			local1153 = arg1.aShortArray38 == null ? -1 : arg1.aShortArray38[local1109];
			if (local1153 != -1 && (this.anInt7727 & 0x40) != 0) {
				@Pc(1171) Class406 local1171 = local11.method5761(local1153 & 0xFFFF);
				if (local1171.aBoolean761) {
					local1153 = -1;
				}
			}
			@Pc(1178) float local1178 = 0.0F;
			@Pc(1180) float local1180 = 0.0F;
			@Pc(1182) float local1182 = 0.0F;
			@Pc(1184) float local1184 = 0.0F;
			@Pc(1186) float local1186 = 0.0F;
			@Pc(1188) float local1188 = 0.0F;
			@Pc(1190) byte local1190 = 0;
			@Pc(1192) byte local1192 = 0;
			@Pc(1194) int local1194 = 0;
			@Pc(1212) byte local1212;
			@Pc(1232) short local1232;
			@Pc(2057) short local2057;
			@Pc(2062) short local2062;
			if (local1153 != -1) {
				if (local804 == -1) {
					local1178 = 0.0F;
					local1188 = 0.0F;
					local1186 = 0.0F;
					local1182 = 1.0F;
					local1190 = 1;
					local1184 = 1.0F;
					local1180 = 1.0F;
					local1192 = 2;
				} else {
					local804 &= 0xFF;
					local1212 = arg1.aByteArray31[local804];
					@Pc(1222) short local1222;
					@Pc(1227) short local1227;
					@Pc(1265) float local1265;
					@Pc(1278) float local1278;
					@Pc(1372) float local1372;
					@Pc(1625) float local1625;
					@Pc(1633) float local1633;
					@Pc(1641) float local1641;
					@Pc(1664) float local1664;
					@Pc(1687) float local1687;
					@Pc(1710) float local1710;
					if (local1212 == 0) {
						local1222 = arg1.aShortArray30[local1109];
						local1227 = arg1.aShortArray33[local1109];
						local1232 = arg1.aShortArray36[local1109];
						local2057 = arg1.aShortArray37[local804];
						local2062 = arg1.aShortArray31[local804];
						@Pc(2067) short local2067 = arg1.aShortArray34[local804];
						@Pc(2073) float local2073 = (float) arg1.anIntArray253[local2057];
						@Pc(2079) float local2079 = (float) arg1.anIntArray257[local2057];
						local1265 = (float) arg1.anIntArray251[local2057];
						local1278 = (float) arg1.anIntArray253[local2062] - local2073;
						local1372 = (float) arg1.anIntArray257[local2062] - local2079;
						@Pc(2110) float local2110 = (float) arg1.anIntArray251[local2062] - local1265;
						@Pc(2118) float local2118 = (float) arg1.anIntArray253[local2067] - local2073;
						@Pc(2127) float local2127 = (float) arg1.anIntArray257[local2067] - local2079;
						@Pc(2135) float local2135 = (float) arg1.anIntArray251[local2067] - local1265;
						@Pc(2144) float local2144 = (float) arg1.anIntArray253[local1222] - local2073;
						@Pc(2153) float local2153 = (float) arg1.anIntArray257[local1222] - local2079;
						@Pc(2162) float local2162 = (float) arg1.anIntArray251[local1222] - local1265;
						@Pc(2170) float local2170 = (float) arg1.anIntArray253[local1227] - local2073;
						@Pc(2179) float local2179 = (float) arg1.anIntArray257[local1227] - local2079;
						local1625 = (float) arg1.anIntArray251[local1227] - local1265;
						local1633 = (float) arg1.anIntArray253[local1232] - local2073;
						local1641 = (float) arg1.anIntArray257[local1232] - local2079;
						local1664 = (float) arg1.anIntArray251[local1232] - local1265;
						local1687 = local2135 * local1372 - local2127 * local2110;
						local1710 = local2118 * local2110 - local1278 * local2135;
						@Pc(2238) float local2238 = local1278 * local2127 - local1372 * local2118;
						@Pc(2246) float local2246 = local2127 * local2238 - local2135 * local1710;
						@Pc(2254) float local2254 = local1687 * local2135 - local2238 * local2118;
						@Pc(2263) float local2263 = local1710 * local2118 - local1687 * local2127;
						@Pc(2277) float local2277 = 1.0F / (local2263 * local2110 + local2254 * local1372 + local2246 * local1278);
						local1182 = (local2263 * local1625 + local2179 * local2254 + local2170 * local2246) * local2277;
						local1178 = (local2153 * local2254 + local2144 * local2246 + local2263 * local2162) * local2277;
						local1186 = (local1664 * local2263 + local1641 * local2254 + local2246 * local1633) * local2277;
						@Pc(2327) float local2327 = local2238 * local1372 - local1710 * local2110;
						@Pc(2335) float local2335 = local1710 * local1278 - local1372 * local1687;
						@Pc(2343) float local2343 = local1687 * local2110 - local2238 * local1278;
						@Pc(2357) float local2357 = 1.0F / (local2118 * local2327 + local2343 * local2127 + local2135 * local2335);
						local1188 = (local2327 * local1633 + local2343 * local1641 + local2335 * local1664) * local2357;
						local1180 = (local2343 * local2153 + local2327 * local2144 + local2335 * local2162) * local2357;
						local1184 = local2357 * (local2335 * local1625 + local2343 * local2179 + local2327 * local2170);
					} else {
						local1222 = arg1.aShortArray30[local1109];
						local1227 = arg1.aShortArray33[local1109];
						local1232 = arg1.aShortArray36[local1109];
						@Pc(1237) int local1237 = local768.anIntArray755[local804];
						@Pc(1242) int local1242 = local768.anIntArray756[local804];
						@Pc(1247) int local1247 = local768.anIntArray757[local804];
						@Pc(1252) float[] local1252 = local768.aFloatArrayArray15[local804];
						@Pc(1257) byte local1257 = arg1.aByteArray33[local804];
						local1265 = (float) arg1.anIntArray261[local804] / 256.0F;
						if (local1212 == 1) {
							local1278 = (float) arg1.anIntArray255[local804] / 1024.0F;
							Static158.method2582(local1252, arg1.anIntArray257[local1222], arg1.anIntArray253[local1222], local1237, arg1.anIntArray251[local1222], local1278, local1265, local1242, Static69.aFloatArray9, local1257, local1247);
							local1178 = Static69.aFloatArray9[0];
							local1180 = Static69.aFloatArray9[1];
							Static158.method2582(local1252, arg1.anIntArray257[local1227], arg1.anIntArray253[local1227], local1237, arg1.anIntArray251[local1227], local1278, local1265, local1242, Static69.aFloatArray9, local1257, local1247);
							local1184 = Static69.aFloatArray9[1];
							local1182 = Static69.aFloatArray9[0];
							Static158.method2582(local1252, arg1.anIntArray257[local1232], arg1.anIntArray253[local1232], local1237, arg1.anIntArray251[local1232], local1278, local1265, local1242, Static69.aFloatArray9, local1257, local1247);
							local1186 = Static69.aFloatArray9[0];
							local1188 = Static69.aFloatArray9[1];
							local1372 = local1278 / 2.0F;
							if ((local1257 & 0x1) == 0) {
								if (local1372 < local1182 - local1178) {
									local1190 = 1;
									local1182 -= local1278;
								} else if (local1372 < local1178 - local1182) {
									local1182 += local1278;
									local1190 = 2;
								}
								if (local1372 < local1186 - local1178) {
									local1186 -= local1278;
									local1192 = 1;
								} else if (local1178 - local1186 > local1372) {
									local1186 += local1278;
									local1192 = 2;
								}
							} else {
								if (local1372 < local1188 - local1180) {
									local1192 = 1;
									local1188 -= local1278;
								} else if (local1372 < local1180 - local1188) {
									local1188 += local1278;
									local1192 = 2;
								}
								if (local1184 - local1180 > local1372) {
									local1190 = 1;
									local1184 -= local1278;
								} else if (local1180 - local1184 > local1372) {
									local1184 += local1278;
									local1190 = 2;
								}
							}
						} else if (local1212 == 2) {
							local1278 = (float) arg1.anIntArray260[local804] / 256.0F;
							local1372 = (float) arg1.anIntArray256[local804] / 256.0F;
							@Pc(1536) int local1536 = arg1.anIntArray253[local1227] - arg1.anIntArray253[local1222];
							@Pc(1547) int local1547 = arg1.anIntArray257[local1227] - arg1.anIntArray257[local1222];
							@Pc(1558) int local1558 = arg1.anIntArray251[local1227] - arg1.anIntArray251[local1222];
							@Pc(1569) int local1569 = arg1.anIntArray253[local1232] - arg1.anIntArray253[local1222];
							@Pc(1580) int local1580 = arg1.anIntArray257[local1232] - arg1.anIntArray257[local1222];
							@Pc(1591) int local1591 = arg1.anIntArray251[local1232] - arg1.anIntArray251[local1222];
							@Pc(1600) int local1600 = local1547 * local1591 - local1580 * local1558;
							@Pc(1609) int local1609 = local1558 * local1569 - local1591 * local1536;
							@Pc(1617) int local1617 = local1536 * local1580 - local1569 * local1547;
							local1625 = 64.0F / (float) arg1.anIntArray252[local804];
							local1633 = 64.0F / (float) arg1.anIntArray254[local804];
							local1641 = 64.0F / (float) arg1.anIntArray255[local804];
							local1664 = (local1252[2] * (float) local1617 + local1252[1] * (float) local1609 + (float) local1600 * local1252[0]) / local1625;
							local1687 = ((float) local1609 * local1252[4] + local1252[3] * (float) local1600 + local1252[5] * (float) local1617) / local1633;
							local1710 = (local1252[8] * (float) local1617 + (float) local1609 * local1252[7] + local1252[6] * (float) local1600) / local1641;
							local1194 = Static257.method3552(local1687, local1710, local1664);
							Static43.method1173(local1252, Static69.aFloatArray9, local1278, local1194, local1265, local1237, local1242, arg1.anIntArray257[local1222], arg1.anIntArray253[local1222], local1247, local1372, arg1.anIntArray251[local1222], local1257);
							local1180 = Static69.aFloatArray9[1];
							local1178 = Static69.aFloatArray9[0];
							Static43.method1173(local1252, Static69.aFloatArray9, local1278, local1194, local1265, local1237, local1242, arg1.anIntArray257[local1227], arg1.anIntArray253[local1227], local1247, local1372, arg1.anIntArray251[local1227], local1257);
							local1184 = Static69.aFloatArray9[1];
							local1182 = Static69.aFloatArray9[0];
							Static43.method1173(local1252, Static69.aFloatArray9, local1278, local1194, local1265, local1237, local1242, arg1.anIntArray257[local1232], arg1.anIntArray253[local1232], local1247, local1372, arg1.anIntArray251[local1232], local1257);
							local1188 = Static69.aFloatArray9[1];
							local1186 = Static69.aFloatArray9[0];
						} else if (local1212 == 3) {
							Static387.method5219(arg1.anIntArray251[local1222], local1265, local1257, local1252, local1237, arg1.anIntArray253[local1222], arg1.anIntArray257[local1222], Static69.aFloatArray9, local1242, local1247);
							local1178 = Static69.aFloatArray9[0];
							local1180 = Static69.aFloatArray9[1];
							Static387.method5219(arg1.anIntArray251[local1227], local1265, local1257, local1252, local1237, arg1.anIntArray253[local1227], arg1.anIntArray257[local1227], Static69.aFloatArray9, local1242, local1247);
							local1184 = Static69.aFloatArray9[1];
							local1182 = Static69.aFloatArray9[0];
							Static387.method5219(arg1.anIntArray251[local1232], local1265, local1257, local1252, local1237, arg1.anIntArray253[local1232], arg1.anIntArray257[local1232], Static69.aFloatArray9, local1242, local1247);
							local1188 = Static69.aFloatArray9[1];
							local1186 = Static69.aFloatArray9[0];
							if ((local1257 & 0x1) == 0) {
								if (local1186 - local1178 > 0.5F) {
									local1192 = 1;
									local1186--;
								} else if (local1178 - local1186 > 0.5F) {
									local1192 = 2;
									local1186++;
								}
								if (local1182 - local1178 > 0.5F) {
									local1190 = 1;
									local1182--;
								} else if (local1178 - local1182 > 0.5F) {
									local1190 = 2;
									local1182++;
								}
							} else {
								if (local1184 - local1180 > 0.5F) {
									local1190 = 1;
									local1184--;
								} else if (local1180 - local1184 > 0.5F) {
									local1190 = 2;
									local1184++;
								}
								if (local1188 - local1180 > 0.5F) {
									local1188--;
									local1192 = 1;
								} else if (local1180 - local1188 > 0.5F) {
									local1192 = 2;
									local1188++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray29 == null) {
				local1212 = 0;
			} else {
				local1212 = arg1.aByteArray29[local1109];
			}
			if (local1212 == 0) {
				@Pc(2454) long local2454 = (long) (local804 << 2) + ((long) (local1194 << 24) + (long) (local1116 << 8) + (long) local815 << 32);
				local1232 = arg1.aShortArray30[local1109];
				local2057 = arg1.aShortArray33[local1109];
				local2062 = arg1.aShortArray36[local1109];
				@Pc(2473) Class194 local2473 = local460[local1232];
				this.aShortArray108[local191] = this.method6702(local2473.anInt5063, arg1, local1178, local2473.anInt5065, local2473.anInt5062, local2473.anInt5067, local1180, local1232, local2454, local191);
				@Pc(2498) Class194 local2498 = local460[local2057];
				this.aShortArray106[local191] = this.method6702(local2498.anInt5063, arg1, local1182, local2498.anInt5065, local2498.anInt5062, local2498.anInt5067, local1184, local2057, local2454 + (long) local1190, local191);
				@Pc(2526) Class194 local2526 = local460[local2062];
				this.aShortArray109[local191] = this.method6702(local2526.anInt5063, arg1, local1186, local2526.anInt5065, local2526.anInt5062, local2526.anInt5067, local1188, local2062, local2454 + (long) local1192, local191);
			} else if (local1212 == 1) {
				@Pc(2561) Class351 local2561 = local772[local1109];
				@Pc(2609) long local2609 = ((long) (local1194 << 24) + (long) (local1116 << 8) + (long) local815 << 32) + (long) ((local2561.anInt9199 + 256 << 22) + (local2561.anInt9200 > 0 ? 1024 : 2048) + ((local804 << 2) - -(local2561.anInt9198 + 256 << 12)));
				this.aShortArray108[local191] = this.method6702(0, arg1, local1178, local2561.anInt9198, local2561.anInt9200, local2561.anInt9199, local1180, arg1.aShortArray30[local1109], local2609, local191);
				this.aShortArray106[local191] = this.method6702(0, arg1, local1182, local2561.anInt9198, local2561.anInt9200, local2561.anInt9199, local1184, arg1.aShortArray33[local1109], local2609 + (long) local1190, local191);
				this.aShortArray109[local191] = this.method6702(0, arg1, local1186, local2561.anInt9198, local2561.anInt9200, local2561.anInt9199, local1188, arg1.aShortArray36[local1109], (long) local1192 + local2609, local191);
			}
			if (arg1.aByteArray27 != null) {
				this.aByteArray77[local191] = arg1.aByteArray27[local1109];
			}
			if (arg1.aShortArray29 != null) {
				this.aShortArray107[local191] = arg1.aShortArray29[local1109];
			}
			this.aShortArray104[local191] = arg1.aShortArray35[local1109];
			this.aShortArray105[local191] = local1153;
		}
		if (this.anInt7782 > 0) {
			local1109 = 1;
			local793 = this.aShortArray105[0];
			for (local804 = 0; local804 < this.anInt7782; local804++) {
				@Pc(2751) short local2751 = this.aShortArray105[local804];
				if (local793 != local2751) {
					local793 = local2751;
					local1109++;
				}
			}
			this.anIntArray572 = new int[local1109];
			this.anIntArray568 = new int[local1109 + 1];
			this.anIntArray570 = new int[local1109];
			this.anIntArray568[0] = 0;
			local815 = this.anInt7787;
			local1153 = 0;
			local1109 = 0;
			local793 = this.aShortArray105[0];
			for (local836 = 0; local836 < this.anInt7782; local836++) {
				@Pc(2806) short local2806 = this.aShortArray105[local836];
				if (local2806 != local793) {
					this.anIntArray572[local1109] = local815;
					this.anIntArray570[local1109] = local1153 + 1 - local815;
					local1109++;
					this.anIntArray568[local1109] = local836;
					local1153 = 0;
					local793 = local2806;
					local815 = this.anInt7787;
				}
				@Pc(2846) short local2846 = this.aShortArray108[local836];
				if (local815 > local2846) {
					local815 = local2846;
				}
				if (local1153 < local2846) {
					local1153 = local2846;
				}
				local2846 = this.aShortArray106[local836];
				if (local1153 < local2846) {
					local1153 = local2846;
				}
				if (local2846 < local815) {
					local815 = local2846;
				}
				local2846 = this.aShortArray109[local836];
				if (local2846 < local815) {
					local815 = local2846;
				}
				if (local2846 > local1153) {
					local1153 = local2846;
				}
			}
			this.anIntArray572[local1109] = local815;
			this.anIntArray570[local1109] = local1153 + 1 - local815;
			local1109++;
			this.anIntArray568[local1109] = this.anInt7782;
		}
		Static128.aLongArray3 = null;
		this.aShortArray111 = Static142.method2418(this.anInt7787, this.aShortArray111);
		this.aShortArray115 = Static142.method2418(this.anInt7787, this.aShortArray115);
		this.aShortArray110 = Static142.method2418(this.anInt7787, this.aShortArray110);
		this.aShortArray113 = Static142.method2418(this.anInt7787, this.aShortArray113);
		this.aShortArray114 = Static142.method2418(this.anInt7787, this.aShortArray114);
		this.aByteArray78 = Static531.method7071(this.aByteArray78, this.anInt7787);
		this.aFloatArray54 = Static289.method4039(this.aFloatArray54, this.anInt7787);
		this.aFloatArray55 = Static289.method4039(this.aFloatArray55, this.anInt7787);
		if (arg1.anIntArray259 != null && Static321.method4686(arg2, this.anInt7727)) {
			this.anIntArrayArray40 = arg1.method3293(false);
		}
		if (arg1.aClass60Array1 != null && Static272.method6407(arg2, this.anInt7727)) {
			this.anIntArrayArray39 = arg1.method3294();
		}
		if (arg1.anIntArray258 != null && Static478.method5098(arg2, this.anInt7727)) {
			local1109 = 0;
			@Pc(3047) int[] local3047 = new int[256];
			for (local804 = 0; local804 < this.anInt7789; local804++) {
				local815 = arg1.anIntArray258[local22[local804]];
				if (local815 >= 0) {
					@Pc(3064) int local3064 = local3047[local815]++;
					if (local1109 < local815) {
						local1109 = local815;
					}
				}
			}
			this.anIntArrayArray38 = new int[local1109 + 1][];
			for (local815 = 0; local815 <= local1109; local815++) {
				this.anIntArrayArray38[local815] = new int[local3047[local815]];
				local3047[local815] = 0;
			}
			for (local826 = 0; local826 < this.anInt7789; local826++) {
				local836 = arg1.anIntArray258[local22[local826]];
				if (local836 >= 0) {
					this.anIntArrayArray38[local836][local3047[local836]++] = local826;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!jca;IIZZ)V")
	public Class170_Sub2(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean520 = false;
		this.aBoolean521 = false;
		this.anInt7782 = 0;
		this.anInt7789 = 0;
		this.aBoolean524 = true;
		this.aBoolean522 = false;
		this.anInt7796 = 0;
		this.anInt7787 = 0;
		this.anInt7739 = 0;
		this.aBoolean523 = false;
		this.aClass22_Sub2_16 = arg0;
		this.anInt7727 = arg2;
		this.anInt7724 = arg1;
		this.aBoolean523 = arg4;
		if (arg3 || Static336.method4834(this.anInt7727, this.anInt7724)) {
			this.aClass152_1 = new Class152(Static493.method6693(this.anInt7724, this.anInt7727));
		}
		if (arg3 || Static289.method4043(this.anInt7724, this.anInt7727)) {
			this.aClass152_4 = new Class152(Static507.method6897(this.anInt7724, this.anInt7727));
		}
		if (arg3 || Static106.method2118(this.anInt7724, this.anInt7727)) {
			this.aClass152_2 = new Class152(Static148.method2490(this.anInt7727, this.anInt7724));
		}
		if (arg3 || Static145.method2457(this.anInt7724, this.anInt7727)) {
			this.aClass152_3 = new Class152(Static280.method3949(this.anInt7724, this.anInt7727));
		}
		if (arg3 || Static493.method6689(this.anInt7724, this.anInt7727)) {
			this.aClass174_1 = new Class174(Static459.method6218(this.anInt7724, this.anInt7727));
		}
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "()[B")
	@Override
	public byte[] method8366() {
		return this.aByteArray77;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8355(@OriginalArg(0) Class170 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class170_Sub2 local8 = (Class170_Sub2) arg0;
		if (this.anInt7789 == 0 || local8.anInt7789 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7739;
		@Pc(24) int[] local24 = local8.anIntArray573;
		@Pc(27) int[] local27 = local8.anIntArray571;
		@Pc(30) int[] local30 = local8.anIntArray569;
		@Pc(33) short[] local33 = local8.aShortArray110;
		@Pc(36) short[] local36 = local8.aShortArray113;
		@Pc(39) short[] local39 = local8.aShortArray114;
		@Pc(42) byte[] local42 = local8.aByteArray78;
		@Pc(49) short[] local49;
		@Pc(51) short[] local51;
		@Pc(47) short[] local47;
		@Pc(53) byte[] local53;
		if (this.aClass267_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local51 = this.aClass267_1.aShortArray81;
			local49 = this.aClass267_1.aShortArray82;
			local47 = this.aClass267_1.aShortArray83;
			local53 = this.aClass267_1.aByteArray63;
		}
		@Pc(78) short[] local78;
		@Pc(90) short[] local90;
		@Pc(86) short[] local86;
		@Pc(82) byte[] local82;
		if (local8.aClass267_1 == null) {
			local86 = null;
			local78 = null;
			local90 = null;
			local82 = null;
		} else {
			local78 = local8.aClass267_1.aShortArray82;
			local82 = local8.aClass267_1.aByteArray63;
			local86 = local8.aClass267_1.aShortArray83;
			local90 = local8.aClass267_1.aShortArray81;
		}
		@Pc(103) int[] local103 = local8.anIntArray575;
		@Pc(106) short[] local106 = local8.aShortArray116;
		if (!local8.aBoolean520) {
			local8.method6692();
		}
		@Pc(117) int local117 = local8.anInt7801;
		@Pc(120) int local120 = local8.anInt7799;
		@Pc(123) int local123 = local8.anInt7741;
		@Pc(126) int local126 = local8.anInt7738;
		@Pc(129) int local129 = local8.anInt7723;
		@Pc(132) int local132 = local8.anInt7750;
		for (@Pc(134) int local134 = 0; local134 < this.anInt7739; local134++) {
			@Pc(144) int local144 = this.anIntArray571[local134] - arg2;
			if (local117 <= local144 && local144 <= local120) {
				@Pc(168) int local168 = this.anIntArray573[local134] - arg1;
				if (local168 >= local123 && local126 >= local168) {
					@Pc(196) int local196 = this.anIntArray569[local134] - arg3;
					if (local196 >= local129 && local132 >= local196) {
						@Pc(214) int local214 = -1;
						@Pc(219) int local219 = this.anIntArray575[local134];
						@Pc(226) int local226 = this.anIntArray575[local134 + 1];
						for (@Pc(228) int local228 = local219; local228 < local226; local228++) {
							local214 = this.aShortArray116[local228] - 1;
							if (local214 == -1 || this.aByteArray78[local214] != 0) {
								break;
							}
						}
						if (local214 != -1) {
							for (@Pc(270) int local270 = 0; local270 < local21; local270++) {
								if (local24[local270] == local168 && local196 == local30[local270] && local27[local270] == local144) {
									@Pc(299) int local299 = -1;
									local226 = local103[local270 + 1];
									local219 = local103[local270];
									for (@Pc(311) int local311 = local219; local311 < local226; local311++) {
										local299 = local106[local311] - 1;
										if (local299 == -1 || local42[local299] != 0) {
											break;
										}
									}
									if (local299 != -1) {
										if (local49 == null) {
											this.aClass267_1 = new Class267();
											local49 = this.aClass267_1.aShortArray82 = Static638.method8410(this.aShortArray110);
											local51 = this.aClass267_1.aShortArray81 = Static638.method8410(this.aShortArray113);
											local47 = this.aClass267_1.aShortArray83 = Static638.method8410(this.aShortArray114);
											local53 = this.aClass267_1.aByteArray63 = Static532.method7079(this.aByteArray78);
										}
										if (local78 == null) {
											@Pc(402) Class267 local402 = local8.aClass267_1 = new Class267();
											local78 = local402.aShortArray82 = Static638.method8410(local33);
											local90 = local402.aShortArray81 = Static638.method8410(local36);
											local86 = local402.aShortArray83 = Static638.method8410(local39);
											local82 = local402.aByteArray63 = Static532.method7079(local42);
										}
										@Pc(435) short local435 = this.aShortArray110[local214];
										@Pc(440) short local440 = this.aShortArray113[local214];
										@Pc(445) short local445 = this.aShortArray114[local214];
										@Pc(450) byte local450 = this.aByteArray78[local214];
										local219 = local103[local270];
										local226 = local103[local270 + 1];
										@Pc(470) int local470;
										for (@Pc(462) int local462 = local219; local462 < local226; local462++) {
											local470 = local106[local462] - 1;
											if (local470 == -1) {
												break;
											}
											if (local82[local470] != 0) {
												local78[local470] += local435;
												local90[local470] += local440;
												local86[local470] += local445;
												local82[local470] += local450;
											}
										}
										local440 = local36[local299];
										local226 = this.anIntArray575[local134 + 1];
										local445 = local39[local299];
										local450 = local42[local299];
										local435 = local33[local299];
										local219 = this.anIntArray575[local134];
										for (local470 = local219; local470 < local226; local470++) {
											@Pc(562) int local562 = this.aShortArray116[local470] - 1;
											if (local562 == -1) {
												break;
											}
											if (local53[local562] != 0) {
												local49[local562] += local435;
												local51[local562] += local440;
												local47[local562] += local445;
												local53[local562] += local450;
											}
										}
										local8.method6687();
										this.method6687();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(B)V")
	private void method6681() {
		if (this.aClass83Array1 == null) {
			return;
		}
		this.aClass22_Sub2_16.C(!this.aBoolean521);
		this.aClass22_Sub2_16.method8927(false);
		this.aClass22_Sub2_16.method8962(Static547.aClass392_3, 1);
		this.aClass22_Sub2_16.method8897(Static547.aClass392_3, 1);
		for (@Pc(39) int local39 = 0; local39 < this.anInt7735; local39++) {
			@Pc(48) Class83 local48 = this.aClass83Array1[local39];
			@Pc(53) Class306 local53 = this.aClass306Array1[local39];
			if (!local48.aBoolean165 || !this.aClass22_Sub2_16.method9332()) {
				@Pc(83) float local83 = (float) (this.anIntArray573[local48.anInt2533] + this.anIntArray573[local48.anInt2534] + this.anIntArray573[local48.anInt2530]) * 0.3333333F;
				@Pc(104) float local104 = (float) (this.anIntArray571[local48.anInt2530] + this.anIntArray571[local48.anInt2534] + this.anIntArray571[local48.anInt2533]) * 0.3333333F;
				@Pc(125) float local125 = (float) (this.anIntArray569[local48.anInt2530] + this.anIntArray569[local48.anInt2534] + this.anIntArray569[local48.anInt2533]) * 0.3333333F;
				@Pc(139) float local139 = Static61.aFloat37 + local104 * Static598.aFloat139 + Static366.aFloat99 * local83 + Static437.aFloat106 * local125;
				@Pc(153) float local153 = Static408.aFloat101 + local104 * Static516.aFloat126 + Static173.aFloat176 * local83 + local125 * Static592.aFloat138;
				@Pc(167) float local167 = Static372.aFloat100 * local125 + local104 * Static603.aFloat140 + local83 * Static565.aFloat134 + Static356.aFloat98;
				@Pc(188) float local188 = (float) (1.0D / Math.sqrt((double) (local167 * local167 + local153 * local153 + local139 * local139))) * (float) local48.anInt2532;
				@Pc(193) Class58_Sub2 local193 = this.aClass22_Sub2_16.method8965();
				local193.method6111(local139 + (float) local53.anInt8174 - local139 * local188, local53.anInt8172 * local48.aShort42 >> 7, local167 - local188 * local167, local153 + (float) local53.anInt8171 - local153 * local188, local53.anInt8168, local48.aShort44 * local53.anInt8167 >> 7);
				local193.method6100(this.aClass22_Sub2_16.aClass58_Sub2_17);
				this.aClass22_Sub2_16.method8926();
				@Pc(249) int local249 = local53.anInt8173;
				this.aClass22_Sub2_16.method8979(false, false, local48.aShort43);
				this.aClass22_Sub2_16.method8978(local48.aByte50);
				this.aClass22_Sub2_16.method8930(local249);
				this.aClass22_Sub2_16.method8951();
			}
		}
		this.aClass22_Sub2_16.method8897(Static671.aClass392_4, 1);
		this.aClass22_Sub2_16.method8962(Static671.aClass392_4, 1);
		this.aClass22_Sub2_16.C(true);
	}

	@OriginalMember(owner = "client!pea", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort84;
	}

	@OriginalMember(owner = "client!pea", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7739; local7++) {
			if (arg0 != 0) {
				this.anIntArray573[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray571[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray569[local7] += arg2;
			}
		}
		this.method6688();
		this.aBoolean520 = false;
	}

	@OriginalMember(owner = "client!pea", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static31.anInt1090 = 0;
			Static321.anInt5165 = 0;
			Static342.anInt5489 = 0;
			for (local17 = 0; local17 < this.anInt7739; local17++) {
				Static342.anInt5489 += this.anIntArray573[local17];
				Static31.anInt1090 += this.anIntArray571[local17];
				local9++;
				Static321.anInt5165 += this.anIntArray569[local17];
			}
			if (local9 <= 0) {
				Static342.anInt5489 = arg1;
				Static31.anInt1090 = arg2;
				Static321.anInt5165 = arg3;
			} else {
				Static31.anInt1090 = Static31.anInt1090 / local9 + arg2;
				Static342.anInt5489 = Static342.anInt5489 / local9 + arg1;
				Static321.anInt5165 = arg3 + Static321.anInt5165 / local9;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt7739; local9++) {
				this.anIntArray573[local9] += arg1;
				this.anIntArray571[local9] += arg2;
				this.anIntArray569[local9] += arg3;
			}
		} else {
			@Pc(177) int local177;
			@Pc(195) int local195;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt7739; local9++) {
					this.anIntArray573[local9] -= Static342.anInt5489;
					this.anIntArray571[local9] -= Static31.anInt1090;
					this.anIntArray569[local9] -= Static321.anInt5165;
					if (arg3 != 0) {
						local17 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
						local177 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
						local195 = this.anIntArray571[local9] * local17 + local177 * this.anIntArray573[local9] + 16383 >> 14;
						this.anIntArray571[local9] = local177 * this.anIntArray571[local9] + 16383 - this.anIntArray573[local9] * local17 >> 14;
						this.anIntArray573[local9] = local195;
					}
					if (arg1 != 0) {
						local17 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg1];
						local177 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg1];
						local195 = this.anIntArray571[local9] * local177 + 16383 - this.anIntArray569[local9] * local17 >> 14;
						this.anIntArray569[local9] = local17 * this.anIntArray571[local9] + local177 * this.anIntArray569[local9] + 16383 >> 14;
						this.anIntArray571[local9] = local195;
					}
					if (arg2 != 0) {
						local17 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
						local177 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
						local195 = local177 * this.anIntArray573[local9] + this.anIntArray569[local9] * local17 + 16383 >> 14;
						this.anIntArray569[local9] = this.anIntArray569[local9] * local177 + 16383 - this.anIntArray573[local9] * local17 >> 14;
						this.anIntArray573[local9] = local195;
					}
					this.anIntArray573[local9] += Static342.anInt5489;
					this.anIntArray571[local9] += Static31.anInt1090;
					this.anIntArray569[local9] += Static321.anInt5165;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt7739; local9++) {
					this.anIntArray573[local9] -= Static342.anInt5489;
					this.anIntArray571[local9] -= Static31.anInt1090;
					this.anIntArray569[local9] -= Static321.anInt5165;
					this.anIntArray573[local9] = this.anIntArray573[local9] * arg1 / 128;
					this.anIntArray571[local9] = this.anIntArray571[local9] * arg2 / 128;
					this.anIntArray569[local9] = this.anIntArray569[local9] * arg3 / 128;
					this.anIntArray573[local9] += Static342.anInt5489;
					this.anIntArray571[local9] += Static31.anInt1090;
					this.anIntArray569[local9] += Static321.anInt5165;
				}
			} else {
				@Pc(540) Class83 local540;
				@Pc(545) Class306 local545;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt7789; local9++) {
						local17 = arg1 * 8 + (this.aByteArray77[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray77[local9] = (byte) local17;
					}
					if (this.aClass83Array1 != null) {
						for (local17 = 0; local17 < this.anInt7735; local17++) {
							local540 = this.aClass83Array1[local17];
							local545 = this.aClass306Array1[local17];
							local545.anInt8173 = local545.anInt8173 & 0xFFFFFF | 255 - (this.aByteArray77[local540.anInt2535] & 0xFF) << 24;
						}
					}
					this.method6696();
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt7789; local9++) {
						local17 = this.aShortArray104[local9] & 0xFFFF;
						local177 = local17 >> 10 & 0x3F;
						local195 = local17 >> 7 & 0x7;
						@Pc(608) int local608 = local17 & 0x7F;
						local195 += arg2 / 4;
						@Pc(620) int local620 = local177 + arg1 & 0x3F;
						local608 += arg3;
						if (local195 < 0) {
							local195 = 0;
						} else if (local195 > 7) {
							local195 = 7;
						}
						if (local608 < 0) {
							local608 = 0;
						} else if (local608 > 127) {
							local608 = 127;
						}
						this.aShortArray104[local9] = (short) (local195 << 7 | local620 << 10 | local608);
					}
					if (this.aClass83Array1 != null) {
						for (local17 = 0; local17 < this.anInt7735; local17++) {
							local540 = this.aClass83Array1[local17];
							local545 = this.aClass306Array1[local17];
							local545.anInt8173 = Static537.anIntArray601[this.aShortArray104[local540.anInt2535] & 0xFFFF] & 0xFFFFFF | local545.anInt8173 & 0xFF000000;
						}
					}
					this.method6696();
				} else {
					@Pc(732) Class306 local732;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt7735; local9++) {
							local732 = this.aClass306Array1[local9];
							local732.anInt8174 += arg1;
							local732.anInt8171 += arg2;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt7735; local9++) {
							local732 = this.aClass306Array1[local9];
							local732.anInt8172 = arg2 * local732.anInt8172 >> 7;
							local732.anInt8167 = local732.anInt8167 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt7735; local9++) {
							local732 = this.aClass306Array1[local9];
							local732.anInt8168 = arg1 + local732.anInt8168 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLclient!pea;ZILclient!pea;Z)Lclient!ka;")
	private Class170 method6682(@OriginalArg(1) Class170_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class170_Sub2 arg3, @OriginalArg(5) boolean arg4) {
		arg3.aShort84 = this.aShort84;
		arg3.anInt7789 = this.anInt7789;
		arg3.anInt7735 = this.anInt7735;
		arg3.anInt7724 = arg2;
		arg3.lb = this.lb;
		if ((arg2 & 0x100) == 0) {
			arg3.aBoolean521 = this.aBoolean521;
		} else {
			arg3.aBoolean521 = true;
		}
		arg3.aBoolean522 = this.aBoolean522;
		arg3.anInt7727 = this.anInt7727;
		arg3.anInt7796 = this.anInt7796;
		arg3.anInt7782 = this.anInt7782;
		arg3.anInt7787 = this.anInt7787;
		arg3.anInt7739 = this.anInt7739;
		@Pc(71) boolean local71 = Static284.method4011(this.anInt7727, arg2);
		@Pc(77) boolean local77 = Static601.method7730(arg2, this.anInt7727);
		@Pc(83) boolean local83 = Static407.method5470(arg2, this.anInt7727);
		@Pc(89) boolean local89 = local71 | local77 | local83;
		@Pc(230) int local230;
		if (local89) {
			if (!local71) {
				arg3.anIntArray573 = this.anIntArray573;
			} else if (arg0.anIntArray573 == null || arg0.anIntArray573.length < this.anInt7796) {
				arg3.anIntArray573 = arg0.anIntArray573 = new int[this.anInt7796];
			} else {
				arg3.anIntArray573 = arg0.anIntArray573;
			}
			if (!local77) {
				arg3.anIntArray571 = this.anIntArray571;
			} else if (arg0.anIntArray571 == null || this.anInt7796 > arg0.anIntArray571.length) {
				arg3.anIntArray571 = arg0.anIntArray571 = new int[this.anInt7796];
			} else {
				arg3.anIntArray571 = arg0.anIntArray571;
			}
			if (!local83) {
				arg3.anIntArray569 = this.anIntArray569;
			} else if (arg0.anIntArray569 == null || arg0.anIntArray569.length < this.anInt7796) {
				arg3.anIntArray569 = arg0.anIntArray569 = new int[this.anInt7796];
			} else {
				arg3.anIntArray569 = arg0.anIntArray569;
			}
			for (local230 = 0; local230 < this.anInt7796; local230++) {
				if (local71) {
					arg3.anIntArray573[local230] = this.anIntArray573[local230];
				}
				if (local77) {
					arg3.anIntArray571[local230] = this.anIntArray571[local230];
				}
				if (local83) {
					arg3.anIntArray569[local230] = this.anIntArray569[local230];
				}
			}
		} else {
			arg3.anIntArray571 = this.anIntArray571;
			arg3.anIntArray569 = this.anIntArray569;
			arg3.anIntArray573 = this.anIntArray573;
		}
		if (Static493.method6693(arg2, this.anInt7727)) {
			arg3.aClass152_1 = arg0.aClass152_1;
			arg3.aClass152_1.aBoolean235 = this.aClass152_1.aBoolean235;
			arg3.aClass152_1.aBoolean234 = true;
			arg3.aClass152_1.anInterface14_2 = this.aClass152_1.anInterface14_2;
		} else if (Static336.method4834(this.anInt7727, arg2)) {
			arg3.aClass152_1 = this.aClass152_1;
		} else {
			arg3.aClass152_1 = null;
		}
		if (Static524.method7014(arg2, this.anInt7727)) {
			if (arg0.aShortArray104 == null || arg0.aShortArray104.length < this.anInt7789) {
				arg3.aShortArray104 = arg0.aShortArray104 = new short[this.anInt7789];
			} else {
				arg3.aShortArray104 = arg0.aShortArray104;
			}
			for (local230 = 0; local230 < this.anInt7789; local230++) {
				arg3.aShortArray104[local230] = this.aShortArray104[local230];
			}
		} else {
			arg3.aShortArray104 = this.aShortArray104;
		}
		if (Static261.method3654(arg2, this.anInt7727)) {
			if (arg0.aByteArray77 == null || this.anInt7789 > arg0.aByteArray77.length) {
				arg3.aByteArray77 = arg0.aByteArray77 = new byte[this.anInt7789];
			} else {
				arg3.aByteArray77 = arg0.aByteArray77;
			}
			for (local230 = 0; local230 < this.anInt7789; local230++) {
				arg3.aByteArray77[local230] = this.aByteArray77[local230];
			}
		} else {
			arg3.aByteArray77 = this.aByteArray77;
		}
		if (Static148.method2490(this.anInt7727, arg2)) {
			arg3.aClass152_2 = arg0.aClass152_2;
			arg3.aClass152_2.anInterface14_2 = this.aClass152_2.anInterface14_2;
			arg3.aClass152_2.aBoolean235 = this.aClass152_2.aBoolean235;
			arg3.aClass152_2.aBoolean234 = true;
		} else if (Static106.method2118(arg2, this.anInt7727)) {
			arg3.aClass152_2 = this.aClass152_2;
		} else {
			arg3.aClass152_2 = null;
		}
		@Pc(637) int local637;
		if (Static47.method1236(arg2, this.anInt7727)) {
			if (arg0.aShortArray110 == null || this.anInt7787 > arg0.aShortArray110.length) {
				local230 = this.anInt7787;
				arg3.aShortArray110 = arg0.aShortArray110 = new short[local230];
				arg3.aShortArray114 = arg0.aShortArray114 = new short[local230];
				arg3.aShortArray113 = arg0.aShortArray113 = new short[local230];
			} else {
				arg3.aShortArray110 = arg0.aShortArray110;
				arg3.aShortArray114 = arg0.aShortArray114;
				arg3.aShortArray113 = arg0.aShortArray113;
			}
			if (this.aClass267_1 == null) {
				arg3.aClass267_1 = null;
				for (local230 = 0; local230 < this.anInt7787; local230++) {
					arg3.aShortArray110[local230] = this.aShortArray110[local230];
					arg3.aShortArray113[local230] = this.aShortArray113[local230];
					arg3.aShortArray114[local230] = this.aShortArray114[local230];
				}
			} else {
				if (arg0.aClass267_1 == null) {
					arg0.aClass267_1 = new Class267();
				}
				@Pc(623) Class267 local623 = arg3.aClass267_1 = arg0.aClass267_1;
				if (local623.aShortArray82 == null || local623.aShortArray82.length < this.anInt7787) {
					local637 = this.anInt7787;
					local623.aShortArray81 = new short[local637];
					local623.aByteArray63 = new byte[local637];
					local623.aShortArray82 = new short[local637];
					local623.aShortArray83 = new short[local637];
				}
				for (local637 = 0; local637 < this.anInt7787; local637++) {
					arg3.aShortArray110[local637] = this.aShortArray110[local637];
					arg3.aShortArray113[local637] = this.aShortArray113[local637];
					arg3.aShortArray114[local637] = this.aShortArray114[local637];
					local623.aShortArray82[local637] = this.aClass267_1.aShortArray82[local637];
					local623.aShortArray81[local637] = this.aClass267_1.aShortArray81[local637];
					local623.aShortArray83[local637] = this.aClass267_1.aShortArray83[local637];
					local623.aByteArray63[local637] = this.aClass267_1.aByteArray63[local637];
				}
			}
			arg3.aByteArray78 = this.aByteArray78;
		} else {
			arg3.aClass267_1 = this.aClass267_1;
			arg3.aShortArray110 = this.aShortArray110;
			arg3.aByteArray78 = this.aByteArray78;
			arg3.aShortArray114 = this.aShortArray114;
			arg3.aShortArray113 = this.aShortArray113;
		}
		if (Static280.method3949(arg2, this.anInt7727)) {
			arg3.aClass152_3 = arg0.aClass152_3;
			arg3.aClass152_3.aBoolean234 = true;
			arg3.aClass152_3.anInterface14_2 = this.aClass152_3.anInterface14_2;
			arg3.aClass152_3.aBoolean235 = this.aClass152_3.aBoolean235;
		} else if (Static145.method2457(arg2, this.anInt7727)) {
			arg3.aClass152_3 = this.aClass152_3;
		} else {
			arg3.aClass152_3 = null;
		}
		if (Static66.method1493(this.anInt7727, arg2)) {
			if (arg0.aFloatArray54 == null || arg0.aFloatArray54.length < this.anInt7789) {
				local230 = this.anInt7787;
				arg3.aFloatArray54 = arg0.aFloatArray54 = new float[local230];
				arg3.aFloatArray55 = arg0.aFloatArray55 = new float[local230];
			} else {
				arg3.aFloatArray54 = arg0.aFloatArray54;
				arg3.aFloatArray55 = arg0.aFloatArray55;
			}
			for (local230 = 0; local230 < this.anInt7787; local230++) {
				arg3.aFloatArray54[local230] = this.aFloatArray54[local230];
				arg3.aFloatArray55[local230] = this.aFloatArray55[local230];
			}
		} else {
			arg3.aFloatArray54 = this.aFloatArray54;
			arg3.aFloatArray55 = this.aFloatArray55;
		}
		if (Static507.method6897(arg2, this.anInt7727)) {
			arg3.aClass152_4 = arg0.aClass152_4;
			arg3.aClass152_4.anInterface14_2 = this.aClass152_4.anInterface14_2;
			arg3.aClass152_4.aBoolean234 = true;
			arg3.aClass152_4.aBoolean235 = this.aClass152_4.aBoolean235;
		} else if (Static289.method4043(arg2, this.anInt7727)) {
			arg3.aClass152_4 = this.aClass152_4;
		} else {
			arg3.aClass152_4 = null;
		}
		if (Static541.method7183(this.anInt7727, arg2)) {
			if (arg0.aShortArray108 == null || this.anInt7789 > arg0.aShortArray108.length) {
				local230 = this.anInt7789;
				arg3.aShortArray109 = arg0.aShortArray109 = new short[local230];
				arg3.aShortArray108 = arg0.aShortArray108 = new short[local230];
				arg3.aShortArray106 = arg0.aShortArray106 = new short[local230];
			} else {
				arg3.aShortArray106 = arg0.aShortArray106;
				arg3.aShortArray108 = arg0.aShortArray108;
				arg3.aShortArray109 = arg0.aShortArray109;
			}
			for (local230 = 0; local230 < this.anInt7789; local230++) {
				arg3.aShortArray108[local230] = this.aShortArray108[local230];
				arg3.aShortArray106[local230] = this.aShortArray106[local230];
				arg3.aShortArray109[local230] = this.aShortArray109[local230];
			}
		} else {
			arg3.aShortArray106 = this.aShortArray106;
			arg3.aShortArray108 = this.aShortArray108;
			arg3.aShortArray109 = this.aShortArray109;
		}
		if (Static459.method6218(arg2, this.anInt7727)) {
			arg3.aClass174_1 = arg0.aClass174_1;
			arg3.aClass174_1.aBoolean280 = this.aClass174_1.aBoolean280;
			arg3.aClass174_1.anInterface11_2 = this.aClass174_1.anInterface11_2;
			arg3.aClass174_1.aBoolean279 = true;
		} else if (Static493.method6689(arg2, this.anInt7727)) {
			arg3.aClass174_1 = this.aClass174_1;
		} else {
			arg3.aClass174_1 = null;
		}
		if (Static119.method5521(arg2, this.anInt7727)) {
			if (arg0.aShortArray105 == null || this.anInt7789 > arg0.aShortArray105.length) {
				local637 = this.anInt7789;
				arg3.aShortArray105 = arg0.aShortArray105 = new short[local637];
			} else {
				arg3.aShortArray105 = arg0.aShortArray105;
			}
			for (local637 = 0; local637 < this.anInt7789; local637++) {
				arg3.aShortArray105[local637] = this.aShortArray105[local637];
			}
		} else {
			arg3.aShortArray105 = this.aShortArray105;
		}
		if (!Static123.method2282(arg2, this.anInt7727)) {
			arg3.aClass306Array1 = this.aClass306Array1;
		} else if (arg0.aClass306Array1 == null || this.anInt7735 > arg0.aClass306Array1.length) {
			local637 = this.anInt7735;
			arg3.aClass306Array1 = arg0.aClass306Array1 = new Class306[local637];
			for (@Pc(1287) int local1287 = 0; local1287 < this.anInt7735; local1287++) {
				arg3.aClass306Array1[local1287] = this.aClass306Array1[local1287].method6991();
			}
		} else {
			arg3.aClass306Array1 = arg0.aClass306Array1;
			for (local637 = 0; local637 < this.anInt7735; local637++) {
				arg3.aClass306Array1[local637].method6993(this.aClass306Array1[local637]);
			}
		}
		arg3.aClass184Array4 = this.aClass184Array4;
		arg3.aShortArray115 = this.aShortArray115;
		arg3.aShortArray107 = this.aShortArray107;
		arg3.aClass83Array1 = this.aClass83Array1;
		arg3.anIntArray575 = this.anIntArray575;
		arg3.aClass232Array4 = this.aClass232Array4;
		arg3.anIntArray568 = this.anIntArray568;
		arg3.aShortArray112 = this.aShortArray112;
		arg3.anIntArrayArray40 = this.anIntArrayArray40;
		arg3.aShortArray116 = this.aShortArray116;
		arg3.aShortArray111 = this.aShortArray111;
		arg3.anIntArrayArray38 = this.anIntArrayArray38;
		arg3.anIntArray570 = this.anIntArray570;
		if (this.aBoolean520) {
			arg3.anInt7758 = this.anInt7758;
			arg3.anInt7738 = this.anInt7738;
			arg3.anInt7750 = this.anInt7750;
			arg3.anInt7797 = this.anInt7797;
			arg3.aBoolean520 = true;
			arg3.anInt7741 = this.anInt7741;
			arg3.anInt7801 = this.anInt7801;
			arg3.anInt7799 = this.anInt7799;
			arg3.anInt7723 = this.anInt7723;
		} else {
			arg3.aBoolean520 = false;
		}
		arg3.anIntArray572 = this.anIntArray572;
		arg3.anIntArrayArray39 = this.anIntArrayArray39;
		return arg3;
	}

	@OriginalMember(owner = "client!pea", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7739; local7++) {
			if (arg0 != 128) {
				this.anIntArray573[local7] = arg0 * this.anIntArray573[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray571[local7] = this.anIntArray571[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray569[local7] = arg2 * this.anIntArray569[local7] >> 7;
			}
		}
		this.method6688();
		this.aBoolean520 = false;
	}

	@OriginalMember(owner = "client!pea", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7739; local3++) {
			this.anIntArray569[local3] = -this.anIntArray569[local3];
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt7787; local31++) {
			this.aShortArray114[local31] = (short) -this.aShortArray114[local31];
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt7789; local58++) {
			@Pc(69) short local69 = this.aShortArray108[local58];
			this.aShortArray108[local58] = this.aShortArray109[local58];
			this.aShortArray109[local58] = local69;
		}
		this.method6688();
		this.method6687();
		this.method6695();
		this.aBoolean520 = false;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIZILclient!cl;II)Z")
	private boolean method6684(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class58 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class58_Sub2 local8 = (Class58_Sub2) arg3;
		@Pc(12) Class58_Sub2 local12 = this.aClass22_Sub2_16.aClass58_Sub2_16;
		@Pc(33) float local33 = local12.aFloat108 + local12.aFloat110 * local8.aFloat111 + local8.aFloat108 * local12.aFloat120 + local12.aFloat112 * local8.aFloat116;
		@Pc(54) float local54 = local12.aFloat116 + local8.aFloat111 * local12.aFloat119 + local8.aFloat108 * local12.aFloat117 + local12.aFloat109 * local8.aFloat116;
		Static372.aFloat100 = local8.aFloat114 * local12.aFloat114 + local8.aFloat110 * local12.aFloat115 + local8.aFloat119 * local12.aFloat113;
		Static173.aFloat176 = local12.aFloat119 * local8.aFloat115 + local12.aFloat117 * local8.aFloat120 + local8.aFloat117 * local12.aFloat109;
		@Pc(117) float local117 = local12.aFloat111 + local8.aFloat108 * local12.aFloat115 + local8.aFloat116 * local12.aFloat113 + local12.aFloat114 * local8.aFloat111;
		Static565.aFloat134 = local12.aFloat114 * local8.aFloat115 + local12.aFloat115 * local8.aFloat120 + local12.aFloat113 * local8.aFloat117;
		Static592.aFloat138 = local12.aFloat119 * local8.aFloat114 + local12.aFloat109 * local8.aFloat119 + local8.aFloat110 * local12.aFloat117;
		Static598.aFloat139 = local8.aFloat109 * local12.aFloat112 + local8.aFloat112 * local12.aFloat120 + local12.aFloat110 * local8.aFloat113;
		Static437.aFloat106 = local8.aFloat110 * local12.aFloat120 + local8.aFloat119 * local12.aFloat112 + local8.aFloat114 * local12.aFloat110;
		Static516.aFloat126 = local12.aFloat119 * local8.aFloat113 + local12.aFloat117 * local8.aFloat112 + local12.aFloat109 * local8.aFloat109;
		Static603.aFloat140 = local12.aFloat114 * local8.aFloat113 + local8.aFloat112 * local12.aFloat115 + local8.aFloat109 * local12.aFloat113;
		Static366.aFloat99 = local12.aFloat110 * local8.aFloat115 + local8.aFloat120 * local12.aFloat120 + local8.aFloat117 * local12.aFloat112;
		@Pc(245) boolean local245 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass22_Sub2_16.anInt10455;
		@Pc(261) int local261 = this.aClass22_Sub2_16.anInt10463;
		if (!this.aBoolean520) {
			this.method6692();
		}
		@Pc(278) int local278 = this.anInt7738 - this.anInt7741 >> 1;
		@Pc(287) int local287 = this.anInt7799 - this.anInt7801 >> 1;
		@Pc(295) int local295 = this.anInt7750 - this.anInt7723 >> 1;
		@Pc(300) int local300 = local278 + this.anInt7741;
		@Pc(306) int local306 = this.anInt7801 + local287;
		@Pc(311) int local311 = local295 + this.anInt7723;
		@Pc(318) int local318 = local300 - (local278 << arg4);
		@Pc(324) int local324 = local306 - (local287 << arg4);
		@Pc(331) int local331 = local311 - (local295 << arg4);
		@Pc(337) int local337 = (local278 << arg4) + local300;
		@Pc(343) int local343 = (local287 << arg4) + local306;
		@Pc(350) int local350 = local311 + (local295 << arg4);
		Static560.anIntArray779[0] = local318;
		Static369.anIntArray414[0] = local324;
		Static560.anIntArray779[1] = local337;
		Static722.anIntArray794[0] = local331;
		Static369.anIntArray414[1] = local324;
		Static560.anIntArray779[2] = local318;
		Static722.anIntArray794[1] = local331;
		Static369.anIntArray414[2] = local343;
		Static560.anIntArray779[3] = local337;
		Static722.anIntArray794[2] = local331;
		Static369.anIntArray414[3] = local343;
		Static560.anIntArray779[4] = local318;
		Static722.anIntArray794[3] = local331;
		Static369.anIntArray414[4] = local324;
		Static722.anIntArray794[4] = local350;
		Static560.anIntArray779[5] = local337;
		Static369.anIntArray414[5] = local324;
		Static722.anIntArray794[5] = local350;
		Static560.anIntArray779[6] = local318;
		Static369.anIntArray414[6] = local343;
		Static560.anIntArray779[7] = local337;
		Static722.anIntArray794[6] = local350;
		Static369.anIntArray414[7] = local343;
		Static722.anIntArray794[7] = local350;
		@Pc(481) float local481;
		@Pc(495) float local495;
		@Pc(509) float local509;
		@Pc(462) float local462;
		@Pc(467) float local467;
		@Pc(457) float local457;
		for (@Pc(448) int local448 = 0; local448 < 8; local448++) {
			local457 = (float) Static722.anIntArray794[local448];
			local462 = (float) Static560.anIntArray779[local448];
			local467 = (float) Static369.anIntArray414[local448];
			local481 = local457 * Static437.aFloat106 + Static598.aFloat139 * local467 + Static366.aFloat99 * local462 + local33;
			local495 = local54 + local462 * Static173.aFloat176 + Static516.aFloat126 * local467 + Static592.aFloat138 * local457;
			local509 = local117 + Static565.aFloat134 * local462 + Static603.aFloat140 * local467 + local457 * Static372.aFloat100;
			if (local509 >= (float) this.aClass22_Sub2_16.anInt10464) {
				if (arg5 > 0) {
					local509 = (float) arg5;
				}
				@Pc(535) float local535 = (float) this.aClass22_Sub2_16.anInt10461 + local481 * (float) local257 / local509;
				@Pc(547) float local547 = (float) this.aClass22_Sub2_16.anInt10474 + local495 * (float) local261 / local509;
				if (local535 < local247) {
					local247 = local535;
				}
				if (local535 > local249) {
					local249 = local535;
				}
				if (local547 < local251) {
					local251 = local547;
				}
				if (local547 > local253) {
					local253 = local547;
				}
				local245 = true;
			}
		}
		if (local245 && (float) arg2 > local247 && (float) arg2 < local249 && local251 < (float) arg0 && local253 > (float) arg0) {
			if (arg1) {
				return true;
			}
			if (this.anInt7787 > Static285.anIntArray335.length) {
				Static285.anIntArray335 = new int[this.anInt7787];
				Static205.anIntArray236 = new int[this.anInt7787];
			}
			@Pc(726) int local726;
			for (@Pc(635) int local635 = 0; local635 < this.anInt7739; local635++) {
				local467 = (float) this.anIntArray571[local635];
				local457 = (float) this.anIntArray569[local635];
				local462 = (float) this.anIntArray573[local635];
				local509 = local117 + Static603.aFloat140 * local467 + Static565.aFloat134 * local462 + Static372.aFloat100 * local457;
				local495 = local462 * Static173.aFloat176 + local467 * Static516.aFloat126 + Static592.aFloat138 * local457 + local54;
				local481 = Static437.aFloat106 * local457 + local467 * Static598.aFloat139 + Static366.aFloat99 * local462 + local33;
				@Pc(739) int local739;
				@Pc(744) int local744;
				@Pc(751) int local751;
				if (local509 >= (float) this.aClass22_Sub2_16.anInt10464) {
					if (arg5 > 0) {
						local509 = (float) arg5;
					}
					local726 = (int) ((float) local257 * local481 / local509 + (float) this.aClass22_Sub2_16.anInt10461);
					local739 = (int) ((float) this.aClass22_Sub2_16.anInt10474 + (float) local261 * local495 / local509);
					local744 = this.anIntArray575[local635];
					local751 = this.anIntArray575[local635 + 1];
					for (@Pc(753) int local753 = local744; local753 < local751; local753++) {
						@Pc(762) int local762 = this.aShortArray116[local753] - 1;
						if (local762 == -1) {
							break;
						}
						Static285.anIntArray335[local762] = local726;
						Static205.anIntArray236[local762] = local739;
					}
				} else {
					local726 = this.anIntArray575[local635];
					local739 = this.anIntArray575[local635 + 1];
					for (local744 = local726; local744 < local739; local744++) {
						local751 = this.aShortArray116[local744] - 1;
						if (local751 == -1) {
							break;
						}
						Static285.anIntArray335[this.aShortArray116[local744] - 1] = -999999;
					}
				}
			}
			for (local726 = 0; local726 < this.anInt7789; local726++) {
				if (Static285.anIntArray335[this.aShortArray108[local726]] != -999999 && Static285.anIntArray335[this.aShortArray106[local726]] != -999999 && Static285.anIntArray335[this.aShortArray109[local726]] != -999999 && this.method6686(arg0, Static285.anIntArray335[this.aShortArray106[local726]], -1125433918, Static285.anIntArray335[this.aShortArray108[local726]], Static205.anIntArray236[this.aShortArray108[local726]], Static285.anIntArray335[this.aShortArray109[local726]], Static205.anIntArray236[this.aShortArray106[local726]], Static205.anIntArray236[this.aShortArray109[local726]], arg2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8347(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(43) int local43;
		@Pc(53) int[] local53;
		@Pc(55) int local55;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static342.anInt5489 = 0;
			local29 = 0;
			Static321.anInt5165 = 0;
			Static31.anInt1090 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray40.length) {
					local53 = this.anIntArrayArray40[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						Static342.anInt5489 += this.anIntArray573[local61];
						Static31.anInt1090 += this.anIntArray571[local61];
						Static321.anInt5165 += this.anIntArray569[local61];
						local29++;
					}
				}
			}
			if (local29 > 0) {
				Static342.anInt5489 = local17 + Static342.anInt5489 / local29;
				Static321.anInt5165 = local21 + Static321.anInt5165 / local29;
				Static31.anInt1090 = local25 + Static31.anInt1090 / local29;
			} else {
				Static342.anInt5489 = local17;
				Static31.anInt1090 = local25;
				Static321.anInt5165 = local21;
			}
			return;
		}
		@Pc(168) int[] local168;
		@Pc(170) int local170;
		if (arg0 == 1) {
			local25 = arg3 << 4;
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray40.length) {
					local168 = this.anIntArrayArray40[local35];
					for (local170 = 0; local170 < local168.length; local170++) {
						local55 = local168[local170];
						this.anIntArray573[local55] += local17;
						this.anIntArray571[local55] += local25;
						this.anIntArray569[local55] += local21;
					}
				}
			}
			return;
		}
		@Pc(289) int local289;
		@Pc(307) int local307;
		@Pc(774) int local774;
		@Pc(783) int local783;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray40.length) {
					local168 = this.anIntArrayArray40[local35];
					if ((arg5 & 0x1) == 0) {
						for (local170 = 0; local170 < local168.length; local170++) {
							local55 = local168[local170];
							this.anIntArray573[local55] -= Static342.anInt5489;
							this.anIntArray571[local55] -= Static31.anInt1090;
							this.anIntArray569[local55] -= Static321.anInt5165;
							if (arg4 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
								local289 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
								local307 = local289 * this.anIntArray573[local55] + local61 * this.anIntArray571[local55] + 16383 >> 14;
								this.anIntArray571[local55] = this.anIntArray571[local55] * local289 + 16383 - this.anIntArray573[local55] * local61 >> 14;
								this.anIntArray573[local55] = local307;
							}
							if (arg2 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
								local289 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
								local307 = local289 * this.anIntArray571[local55] + 16383 - local61 * this.anIntArray569[local55] >> 14;
								this.anIntArray569[local55] = this.anIntArray569[local55] * local289 + this.anIntArray571[local55] * local61 + 16383 >> 14;
								this.anIntArray571[local55] = local307;
							}
							if (arg3 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
								local289 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
								local307 = local289 * this.anIntArray573[local55] + local61 * this.anIntArray569[local55] + 16383 >> 14;
								this.anIntArray569[local55] = this.anIntArray569[local55] * local289 + 16383 - local61 * this.anIntArray573[local55] >> 14;
								this.anIntArray573[local55] = local307;
							}
							this.anIntArray573[local55] += Static342.anInt5489;
							this.anIntArray571[local55] += Static31.anInt1090;
							this.anIntArray569[local55] += Static321.anInt5165;
						}
					} else {
						for (local170 = 0; local170 < local168.length; local170++) {
							local55 = local168[local170];
							this.anIntArray573[local55] -= Static342.anInt5489;
							this.anIntArray571[local55] -= Static31.anInt1090;
							this.anIntArray569[local55] -= Static321.anInt5165;
							if (arg2 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
								local289 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
								local307 = this.anIntArray571[local55] * local289 + 16383 - this.anIntArray569[local55] * local61 >> 14;
								this.anIntArray569[local55] = local289 * this.anIntArray569[local55] + local61 * this.anIntArray571[local55] + 16383 >> 14;
								this.anIntArray571[local55] = local307;
							}
							if (arg4 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
								local289 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
								local307 = this.anIntArray571[local55] * local61 + this.anIntArray573[local55] * local289 + 16383 >> 14;
								this.anIntArray571[local55] = local289 * this.anIntArray571[local55] + 16383 - local61 * this.anIntArray573[local55] >> 14;
								this.anIntArray573[local55] = local307;
							}
							if (arg3 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
								local289 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
								local307 = local61 * this.anIntArray569[local55] + local289 * this.anIntArray573[local55] + 16383 >> 14;
								this.anIntArray569[local55] = this.anIntArray569[local55] * local289 + 16383 - this.anIntArray573[local55] * local61 >> 14;
								this.anIntArray573[local55] = local307;
							}
							this.anIntArray573[local55] += Static342.anInt5489;
							this.anIntArray571[local55] += Static31.anInt1090;
							this.anIntArray569[local55] += Static321.anInt5165;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (this.anIntArrayArray40.length > local43) {
						local53 = this.anIntArrayArray40[local43];
						for (local55 = 0; local55 < local53.length; local55++) {
							local61 = local53[local55];
							local289 = this.anIntArray575[local61];
							local307 = this.anIntArray575[local61 + 1];
							for (local774 = local289; local774 < local307; local774++) {
								local783 = this.aShortArray116[local774] - 1;
								if (local783 == -1) {
									break;
								}
								@Pc(798) int local798;
								@Pc(802) int local802;
								@Pc(821) int local821;
								if (arg4 != 0) {
									local798 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
									local802 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
									local821 = local798 * this.aShortArray113[local783] + local802 * this.aShortArray110[local783] + 16383 >> 14;
									this.aShortArray113[local783] = (short) (this.aShortArray113[local783] * local802 + 16383 - this.aShortArray110[local783] * local798 >> 14);
									this.aShortArray110[local783] = (short) local821;
								}
								if (arg2 != 0) {
									local798 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
									local802 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
									local821 = local802 * this.aShortArray113[local783] + 16383 - this.aShortArray114[local783] * local798 >> 14;
									this.aShortArray114[local783] = (short) (local798 * this.aShortArray113[local783] + this.aShortArray114[local783] * local802 + 16383 >> 14);
									this.aShortArray113[local783] = (short) local821;
								}
								if (arg3 != 0) {
									local798 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
									local802 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
									local821 = this.aShortArray114[local783] * local798 + this.aShortArray110[local783] * local802 + 16383 >> 14;
									this.aShortArray114[local783] = (short) (this.aShortArray114[local783] * local802 + 16383 - local798 * this.aShortArray110[local783] >> 14);
									this.aShortArray110[local783] = (short) local821;
								}
							}
						}
					}
				}
				this.method6687();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray40.length) {
					local168 = this.anIntArrayArray40[local35];
					for (local170 = 0; local170 < local168.length; local170++) {
						local55 = local168[local170];
						this.anIntArray573[local55] -= Static342.anInt5489;
						this.anIntArray571[local55] -= Static31.anInt1090;
						this.anIntArray569[local55] -= Static321.anInt5165;
						this.anIntArray573[local55] = arg2 * this.anIntArray573[local55] >> 7;
						this.anIntArray571[local55] = this.anIntArray571[local55] * arg3 >> 7;
						this.anIntArray569[local55] = arg4 * this.anIntArray569[local55] >> 7;
						this.anIntArray573[local55] += Static342.anInt5489;
						this.anIntArray571[local55] += Static31.anInt1090;
						this.anIntArray569[local55] += Static321.anInt5165;
					}
				}
			}
		} else {
			@Pc(1266) Class306 local1266;
			@Pc(1152) boolean local1152;
			@Pc(1261) Class83 local1261;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					local1152 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray38.length > local43) {
							local53 = this.anIntArrayArray38[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local289 = arg2 * 8 + (this.aByteArray77[local61] & 0xFF);
								if (local289 < 0) {
									local289 = 0;
								} else if (local289 > 255) {
									local289 = 255;
								}
								this.aByteArray77[local61] = (byte) local289;
							}
							local1152 |= local53.length > 0;
						}
					}
					if (local1152) {
						if (this.aClass83Array1 != null) {
							for (local43 = 0; local43 < this.anInt7735; local43++) {
								local1261 = this.aClass83Array1[local43];
								local1266 = this.aClass306Array1[local43];
								local1266.anInt8173 = 255 - (this.aByteArray77[local1261.anInt2535] & 0xFF) << 24 | local1266.anInt8173 & 0xFFFFFF;
							}
						}
						this.method6696();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray38 != null) {
					local1152 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray38.length > local43) {
							local53 = this.anIntArrayArray38[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local289 = this.aShortArray104[local61] & 0xFFFF;
								local307 = local289 >> 10 & 0x3F;
								local774 = local289 >> 7 & 0x7;
								@Pc(1372) int local1372 = local307 + arg2 & 0x3F;
								local783 = local289 & 0x7F;
								local774 += arg3 / 4;
								if (local774 < 0) {
									local774 = 0;
								} else if (local774 > 7) {
									local774 = 7;
								}
								local783 += arg4;
								if (local783 < 0) {
									local783 = 0;
								} else if (local783 > 127) {
									local783 = 127;
								}
								this.aShortArray104[local61] = (short) (local1372 << 10 | local774 << 7 | local783);
							}
							local1152 |= local53.length > 0;
						}
					}
					if (local1152) {
						if (this.aClass83Array1 != null) {
							for (local43 = 0; local43 < this.anInt7735; local43++) {
								local1261 = this.aClass83Array1[local43];
								local1266 = this.aClass306Array1[local43];
								local1266.anInt8173 = local1266.anInt8173 & 0xFF000000 | Static537.anIntArray601[this.aShortArray104[local1261.anInt2535] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6696();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray39 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray39.length) {
							local168 = this.anIntArrayArray39[local35];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1266 = this.aClass306Array1[local168[local170]];
								local1266.anInt8174 += arg2;
								local1266.anInt8171 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray39 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray39.length > local35) {
							local168 = this.anIntArrayArray39[local35];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1266 = this.aClass306Array1[local168[local170]];
								local1266.anInt8167 = local1266.anInt8167 * arg2 >> 7;
								local1266.anInt8172 = local1266.anInt8172 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray39.length) {
						local168 = this.anIntArrayArray39[local35];
						for (local170 = 0; local170 < local168.length; local170++) {
							local1266 = this.aClass306Array1[local168[local170]];
							local1266.anInt8168 = local1266.anInt8168 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean520) {
			this.method6692();
		}
		return this.anInt7799;
	}

	@OriginalMember(owner = "client!pea", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean520) {
			this.method6692();
		}
		return this.anInt7801;
	}

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "(I)Z")
	private boolean method6685() {
		@Pc(25) boolean local25 = !this.aClass152_2.aBoolean235;
		@Pc(41) boolean local41 = (this.anInt7727 & 0x37) != 0 && !this.aClass152_3.aBoolean235;
		@Pc(50) boolean local50 = !this.aClass152_1.aBoolean235;
		@Pc(59) boolean local59 = !this.aClass152_4.aBoolean235;
		if (!local50 && !local25 && !local41 && !local59) {
			return true;
		}
		@Pc(78) boolean local78 = true;
		@Pc(107) Interface14 local107;
		@Pc(121) Buffer local121;
		if (local50) {
			if (this.aShortArray111 == null) {
				return true;
			}
			if (this.aClass152_1.anInterface14_3 == null) {
				this.aClass152_1.anInterface14_3 = this.aClass22_Sub2_16.method8937(this.aBoolean523);
			}
			local107 = this.aClass152_1.anInterface14_3;
			local107.method6767(12, this.anInt7787 * 12);
			local121 = local107.method6764();
			if (local121 == null) {
				local78 = false;
			} else {
				this.aClass22_Sub2_16.aNativeInterface3.copyPositions(this.anIntArray573, this.anIntArray571, this.anIntArray569, this.aShortArray111, 0, 12, this.anInt7787, local121.getAddress());
				if (local107.method6766()) {
					this.aClass152_1.anInterface14_2 = local107;
					this.aClass152_1.aBoolean235 = true;
				} else {
					local78 = false;
				}
			}
		}
		@Pc(231) short[] local231;
		@Pc(222) short[] local222;
		@Pc(228) short[] local228;
		@Pc(225) byte[] local225;
		if (local25) {
			if (this.aClass152_2.anInterface14_3 == null) {
				this.aClass152_2.anInterface14_3 = this.aClass22_Sub2_16.method8937(this.aBoolean523);
			}
			local107 = this.aClass152_2.anInterface14_3;
			local107.method6767(4, this.anInt7787 * 4);
			local121 = local107.method6764();
			if (local121 == null) {
				local78 = false;
			} else {
				if ((this.anInt7727 & 0x37) == 0) {
					if (this.aClass267_1 == null) {
						local222 = this.aShortArray113;
						local225 = this.aByteArray78;
						local228 = this.aShortArray114;
						local231 = this.aShortArray110;
					} else {
						local222 = this.aClass267_1.aShortArray81;
						local231 = this.aClass267_1.aShortArray82;
						local228 = this.aClass267_1.aShortArray83;
						local225 = this.aClass267_1.aByteArray63;
					}
					this.aClass22_Sub2_16.aNativeInterface3.copyLighting(this.aShortArray104, this.aByteArray77, this.aShortArray105, local231, local222, local228, local225, this.lb, this.aShort84, this.aShortArray115, 0, 4, this.anInt7787, local121.getAddress());
				} else {
					this.aClass22_Sub2_16.aNativeInterface3.copyColours(this.aShortArray104, this.aByteArray77, this.aShortArray105, this.lb, this.aShortArray115, 0, 4, this.anInt7787, local121.getAddress());
				}
				if (local107.method6766()) {
					this.aClass152_2.anInterface14_2 = local107;
					this.aClass152_2.aBoolean235 = true;
				} else {
					local78 = false;
				}
			}
		}
		if (local41) {
			if (this.aClass152_3.anInterface14_3 == null) {
				this.aClass152_3.anInterface14_3 = this.aClass22_Sub2_16.method8937(this.aBoolean523);
			}
			local107 = this.aClass152_3.anInterface14_3;
			local107.method6767(12, this.anInt7787 * 12);
			local121 = local107.method6764();
			if (local121 == null) {
				local78 = false;
			} else {
				if (this.aClass267_1 == null) {
					local222 = this.aShortArray113;
					local225 = this.aByteArray78;
					local231 = this.aShortArray110;
					local228 = this.aShortArray114;
				} else {
					local228 = this.aClass267_1.aShortArray83;
					local225 = this.aClass267_1.aByteArray63;
					local222 = this.aClass267_1.aShortArray81;
					local231 = this.aClass267_1.aShortArray82;
				}
				this.aClass22_Sub2_16.aNativeInterface3.copyNormals(local231, local222, local228, local225, 3.0F / (float) this.aShort84, 3.0F / (float) (this.aShort84 / 2 + this.aShort84), 0, 12, this.anInt7787, local121.getAddress());
				if (local107.method6766()) {
					this.aClass152_3.anInterface14_2 = local107;
					this.aClass152_3.aBoolean235 = true;
				} else {
					local78 = false;
				}
			}
		}
		if (local59) {
			if (this.aClass152_4.anInterface14_3 == null) {
				this.aClass152_4.anInterface14_3 = this.aClass22_Sub2_16.method8937(this.aBoolean523);
			}
			local107 = this.aClass152_4.anInterface14_3;
			local107.method6767(8, this.anInt7787 * 8);
			local121 = local107.method6764();
			if (local121 == null) {
				local78 = false;
			} else {
				this.aClass22_Sub2_16.aNativeInterface3.copyTexCoords(this.aFloatArray54, this.aFloatArray55, 0, 8, this.anInt7787, local121.getAddress());
				if (local107.method6766()) {
					this.aClass152_4.anInterface14_2 = local107;
					this.aClass152_4.aBoolean235 = true;
				} else {
					local78 = false;
				}
			}
		}
		return local78;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B[B)V")
	@Override
	public void method8363(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(9) int local9;
		if (arg1 == null) {
			for (local9 = 0; local9 < this.anInt7789; local9++) {
				this.aByteArray77[local9] = arg0;
			}
		} else {
			for (local9 = 0; local9 < this.anInt7789; local9++) {
				@Pc(53) int local53 = 255 - (255 - (arg0 & 0xFF)) * (255 - (arg1[local9] & 0xFF)) / 255;
				this.aByteArray77[local9] = (byte) local53;
			}
		}
		this.method6696();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 > arg0 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg4 < arg0 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			if (arg2 != -1125433918) {
				this.aShortArray108 = null;
			}
			if (arg3 > arg8 && arg8 < arg1 && arg8 < arg5) {
				return false;
			} else {
				return arg3 >= arg8 || arg1 >= arg8 || arg8 <= arg5;
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.lb;
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "(I)V")
	private void method6687() {
		if ((this.anInt7727 & 0x37) != 0) {
			if (this.aClass152_3 == null) {
				return;
			}
			this.aClass152_3.aBoolean235 = false;
		} else if (this.aClass152_2 != null) {
			this.aClass152_2.aBoolean235 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "(I)V")
	private void method6688() {
		if (this.aClass152_1 != null) {
			this.aClass152_1.aBoolean235 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass152_1 != null) {
			this.aClass152_1.aBoolean234 = Static493.method6693(arg0, this.anInt7727);
		}
		if (this.aClass152_4 != null) {
			this.aClass152_4.aBoolean234 = Static507.method6897(arg0, this.anInt7727);
		}
		if (this.aClass152_2 != null) {
			this.aClass152_2.aBoolean234 = Static148.method2490(this.anInt7727, arg0);
		}
		if (this.aClass152_3 != null) {
			this.aClass152_3.aBoolean234 = Static280.method3949(arg0, this.anInt7727);
		}
		this.anInt7724 = arg0;
		if (this.aClass267_1 != null && (this.anInt7724 & 0x10000) == 0) {
			this.aShortArray110 = this.aClass267_1.aShortArray82;
			this.aShortArray113 = this.aClass267_1.aShortArray81;
			this.aByteArray78 = this.aClass267_1.aByteArray63;
			this.aShortArray114 = this.aClass267_1.aShortArray83;
			this.aClass267_1 = null;
		}
		this.aBoolean524 = true;
		this.method6700();
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(I)V")
	private void method6690() {
		if (this.anInt7782 == 0) {
			return;
		}
		if (this.method6685() && this.method6699()) {
			this.aClass22_Sub2_16.method8912(this.aClass152_1.anInterface14_2, 0);
			this.aClass22_Sub2_16.method8912(this.aClass152_2.anInterface14_2, 1);
			this.aClass22_Sub2_16.method8912(this.aClass152_4.anInterface14_2, 2);
			@Pc(63) boolean local63;
			if ((this.anInt7727 & 0x37) == 0) {
				local63 = false;
				this.aClass22_Sub2_16.method8927(false);
				this.aClass22_Sub2_16.method8894(this.aClass22_Sub2_16.aClass36_19);
			} else {
				local63 = true;
				this.aClass22_Sub2_16.method8927(true);
				this.aClass22_Sub2_16.method8912(this.aClass152_3.anInterface14_2, 3);
				this.aClass22_Sub2_16.method8894(this.aClass22_Sub2_16.aClass36_18);
			}
			for (@Pc(103) int local103 = 0; local103 < this.anIntArray572.length; local103++) {
				@Pc(110) int local110 = this.anIntArray568[local103];
				@Pc(117) int local117 = this.anIntArray568[local103 + 1];
				@Pc(124) int local124 = this.aShortArray105[local110] & 0xFFFF;
				if (local124 == 65535) {
					local124 = -1;
				}
				this.aClass22_Sub2_16.method8979(true, local63, local124);
				this.aClass22_Sub2_16.method8861(Static492.aClass234_6, this.anIntArray572[local103], local117 - local110, this.anIntArray570[local103], local110 * 3, this.aClass174_1.anInterface11_2);
			}
		}
		this.method6700();
	}

	@OriginalMember(owner = "client!pea", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt7724;
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "()[Lclient!ip;")
	@Override
	public Class184[] method8354() {
		return this.aClass184Array4;
	}

	@OriginalMember(owner = "client!pea", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7796; local7++) {
			this.anIntArray573[local7] = this.anIntArray573[local7] + 7 >> 4;
			this.anIntArray571[local7] = this.anIntArray571[local7] + 7 >> 4;
			this.anIntArray569[local7] = this.anIntArray569[local7] + 7 >> 4;
		}
		this.method6688();
		this.aBoolean520 = false;
	}

	@OriginalMember(owner = "client!pea", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean520) {
			this.method6692();
		}
		return this.anInt7797;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7739; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray569[local15] + local13 * this.anIntArray573[local15] >> 14;
			this.anIntArray569[local15] = this.anIntArray569[local15] * local13 - this.anIntArray573[local15] * local9 >> 14;
			this.anIntArray573[local15] = local33;
		}
		this.method6688();
		this.aBoolean520 = false;
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "(B)V")
	private void method6692() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(19) int local19 = 32767;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt7739; local31++) {
			@Pc(40) int local40 = this.anIntArray573[local31];
			@Pc(45) int local45 = this.anIntArray571[local31];
			if (local45 > local23) {
				local23 = local45;
			}
			if (local21 < local40) {
				local21 = local40;
			}
			if (local40 < local7) {
				local7 = local40;
			}
			if (local45 < local9) {
				local9 = local45;
			}
			@Pc(82) int local82 = this.anIntArray569[local31];
			if (local82 > local25) {
				local25 = local82;
			}
			if (local19 > local82) {
				local19 = local82;
			}
			@Pc(104) int local104 = local82 * local82 + local40 * local40;
			if (local27 < local104) {
				local27 = local104;
			}
			local104 = local45 * local45 + local40 * local40 + local82 * local82;
			if (local104 > local29) {
				local29 = local104;
			}
		}
		this.anInt7738 = local21;
		this.anInt7799 = local23;
		this.anInt7723 = local19;
		this.anInt7801 = local9;
		this.anInt7741 = local7;
		this.anInt7750 = local25;
		this.anInt7797 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.anInt7758 = (int) (Math.sqrt((double) local29) + 0.99D);
		this.aBoolean520 = true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public void method8357(@OriginalArg(0) Class58 arg0) {
		@Pc(8) Class58_Sub2 local8 = (Class58_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass184Array4 != null) {
			for (local13 = 0; local13 < this.aClass184Array4.length; local13++) {
				@Pc(20) Class184 local20 = this.aClass184Array4[local13];
				@Pc(22) Class184 local22 = local20;
				if (local20.aClass184_1 != null) {
					local22 = local20.aClass184_1;
				}
				local22.anInt4429 = (int) (local8.aFloat108 + local8.aFloat120 * (float) this.anIntArray573[local20.anInt4428] + local8.aFloat112 * (float) this.anIntArray571[local20.anInt4428] + local8.aFloat110 * (float) this.anIntArray569[local20.anInt4428]);
				local22.anInt4427 = (int) ((float) this.anIntArray573[local20.anInt4428] * local8.aFloat117 + (float) this.anIntArray571[local20.anInt4428] * local8.aFloat109 + local8.aFloat119 * (float) this.anIntArray569[local20.anInt4428] + local8.aFloat116);
				local22.anInt4424 = (int) ((float) this.anIntArray573[local20.anInt4428] * local8.aFloat115 + (float) this.anIntArray571[local20.anInt4428] * local8.aFloat113 + (float) this.anIntArray569[local20.anInt4428] * local8.aFloat114 + local8.aFloat111);
				local22.anInt4435 = (int) ((float) this.anIntArray569[local20.anInt4426] * local8.aFloat110 + local8.aFloat112 * (float) this.anIntArray571[local20.anInt4426] + (float) this.anIntArray573[local20.anInt4426] * local8.aFloat120 + local8.aFloat108);
				local22.anInt4440 = (int) (local8.aFloat116 + (float) this.anIntArray569[local20.anInt4426] * local8.aFloat119 + local8.aFloat109 * (float) this.anIntArray571[local20.anInt4426] + local8.aFloat117 * (float) this.anIntArray573[local20.anInt4426]);
				local22.anInt4434 = (int) (local8.aFloat114 * (float) this.anIntArray569[local20.anInt4426] + local8.aFloat113 * (float) this.anIntArray571[local20.anInt4426] + (float) this.anIntArray573[local20.anInt4426] * local8.aFloat115 + local8.aFloat111);
				local22.anInt4430 = (int) (local8.aFloat108 + (float) this.anIntArray573[local20.anInt4439] * local8.aFloat120 + local8.aFloat112 * (float) this.anIntArray571[local20.anInt4439] + local8.aFloat110 * (float) this.anIntArray569[local20.anInt4439]);
				local22.anInt4438 = (int) (local8.aFloat116 + (float) this.anIntArray573[local20.anInt4439] * local8.aFloat117 + local8.aFloat109 * (float) this.anIntArray571[local20.anInt4439] + (float) this.anIntArray569[local20.anInt4439] * local8.aFloat119);
				local22.anInt4431 = (int) (local8.aFloat114 * (float) this.anIntArray569[local20.anInt4439] + (float) this.anIntArray571[local20.anInt4439] * local8.aFloat113 + (float) this.anIntArray573[local20.anInt4439] * local8.aFloat115 + local8.aFloat111);
			}
		}
		if (this.aClass232Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass232Array4.length; local13++) {
			@Pc(367) Class232 local367 = this.aClass232Array4[local13];
			@Pc(369) Class232 local369 = local367;
			if (local367.aClass232_1 != null) {
				local369 = local367.aClass232_1;
			}
			if (local367.aClass58_4 == null) {
				local367.aClass58_4 = local8.method9522();
			} else {
				local367.aClass58_4.method9516(local8);
			}
			local369.anInt5884 = (int) (local8.aFloat108 + (float) this.anIntArray571[local367.anInt5881] * local8.aFloat112 + local8.aFloat120 * (float) this.anIntArray573[local367.anInt5881] + local8.aFloat110 * (float) this.anIntArray569[local367.anInt5881]);
			local369.anInt5886 = (int) (local8.aFloat116 + (float) this.anIntArray573[local367.anInt5881] * local8.aFloat117 + (float) this.anIntArray571[local367.anInt5881] * local8.aFloat109 + (float) this.anIntArray569[local367.anInt5881] * local8.aFloat119);
			local369.anInt5879 = (int) (local8.aFloat113 * (float) this.anIntArray571[local367.anInt5881] + local8.aFloat115 * (float) this.anIntArray573[local367.anInt5881] + (float) this.anIntArray569[local367.anInt5881] * local8.aFloat114 + local8.aFloat111);
		}
	}

	@OriginalMember(owner = "client!pea", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.lb = (short) arg0;
		this.method6696();
	}

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean520) {
			this.method6692();
		}
		@Pc(18) int local18 = this.anInt7741 + arg4;
		@Pc(23) int local23 = arg4 + this.anInt7738;
		@Pc(29) int local29 = arg6 + this.anInt7723;
		@Pc(34) int local34 = arg6 + this.anInt7750;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || local23 + arg2.anInt10947 >> arg2.anInt10943 >= arg2.anInt10949 || local29 < 0 || arg2.anInt10946 <= arg2.anInt10947 + local34 >> arg2.anInt10943)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || arg3.anInt10947 + local23 >> arg3.anInt10943 >= arg3.anInt10949 || local29 < 0 || local34 + arg3.anInt10947 >> arg3.anInt10943 >= arg3.anInt10946) {
				return;
			}
		} else {
			local18 >>= arg2.anInt10943;
			local23 = arg2.anInt10947 + local23 - 1 >> arg2.anInt10943;
			local29 >>= arg2.anInt10943;
			local34 = local34 + arg2.anInt10947 - 1 >> arg2.anInt10943;
			if (arg5 == arg2.method9295(local29, local18) && arg2.method9295(local29, local23) == arg5 && arg5 == arg2.method9295(local34, local18) && arg2.method9295(local34, local23) == arg5) {
				return;
			}
		}
		@Pc(260) int local260;
		if (arg0 == 1) {
			for (local260 = 0; local260 < this.anInt7739; local260++) {
				this.anIntArray571[local260] = this.anIntArray571[local260] + arg2.method9294(this.anIntArray569[local260] + arg6, arg4 + this.anIntArray573[local260]) - arg5;
			}
		} else {
			@Pc(268) int local268;
			@Pc(276) int local276;
			if (arg0 == 2) {
				local260 = this.anInt7801;
				if (local260 == 0) {
					return;
				}
				for (local268 = 0; local268 < this.anInt7739; local268++) {
					local276 = (this.anIntArray571[local268] << 16) / local260;
					if (local276 < arg1) {
						this.anIntArray571[local268] -= -((arg2.method9294(this.anIntArray569[local268] + arg6, arg4 + this.anIntArray573[local268]) - arg5) * (arg1 - local276) / arg1);
					}
				}
			} else {
				@Pc(284) int local284;
				if (arg0 == 3) {
					local260 = (arg1 & 0xFF) * 4;
					local268 = (arg1 >> 8 & 0xFF) * 4;
					local276 = (arg1 >> 16 & 0xFF) << 6;
					local284 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local260 >> 1) < 0 || arg2.anInt10949 << arg2.anInt10943 <= (local260 >> 1) + arg4 + arg2.anInt10947 || arg6 - (local268 >> 1) < 0 || arg2.anInt10946 << arg2.anInt10943 <= arg2.anInt10947 + (local268 >> 1) + arg6) {
						return;
					}
					this.method8346(arg5, local276, arg4, local260, local284, arg2, local268, arg6);
				} else if (arg0 == 4) {
					local260 = this.anInt7799 - this.anInt7801;
					for (local268 = 0; local268 < this.anInt7739; local268++) {
						this.anIntArray571[local268] = local260 + this.anIntArray571[local268] + arg3.method9294(arg6 + this.anIntArray569[local268], arg4 + this.anIntArray573[local268]) - arg5;
					}
				} else if (arg0 == 5) {
					local260 = this.anInt7799 - this.anInt7801;
					for (local268 = 0; local268 < this.anInt7739; local268++) {
						local276 = this.anIntArray573[local268] + arg4;
						local284 = this.anIntArray569[local268] + arg6;
						@Pc(394) int local394 = arg2.method9294(local284, local276);
						@Pc(400) int local400 = arg3.method9294(local284, local276);
						@Pc(407) int local407 = local394 - local400 - arg1;
						this.anIntArray571[local268] = local394 + (local407 * ((this.anIntArray571[local268] << 8) / local260) >> 8) - arg5;
					}
				}
			}
		}
		this.method6688();
		this.aBoolean520 = false;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IILclient!cl;ZI)Z")
	@Override
	public boolean method8349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6684(arg1, arg3, arg0, arg2, arg4, -1);
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "()V")
	@Override
	public void method8362() {
		if (this.anInt7787 > 0 && this.anInt7782 > 0) {
			this.method6685();
			this.method6699();
			this.method6700();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!oja;I)V")
	private void method6694(@OriginalArg(0) Class3_Sub7_Sub17_Sub1 arg0) {
		if (this.anInt7787 > Static285.anIntArray335.length) {
			Static285.anIntArray335 = new int[this.anInt7787];
			Static205.anIntArray236 = new int[this.anInt7787];
		}
		@Pc(52) int local52;
		@Pc(91) int local91;
		@Pc(100) int local100;
		for (@Pc(26) int local26 = 0; local26 < this.anInt7739; local26++) {
			local52 = (this.anIntArray573[local26] - (this.anIntArray571[local26] * this.aClass22_Sub2_16.anInt10490 >> 8) >> this.aClass22_Sub2_16.anInt10462) - arg0.anInt7364;
			@Pc(77) int local77 = (this.anIntArray569[local26] - (this.aClass22_Sub2_16.anInt10486 * this.anIntArray571[local26] >> 8) >> this.aClass22_Sub2_16.anInt10462) - arg0.anInt7363;
			@Pc(82) int local82 = this.anIntArray575[local26];
			@Pc(89) int local89 = this.anIntArray575[local26 + 1];
			for (local91 = local82; local91 < local89; local91++) {
				local100 = this.aShortArray116[local91] - 1;
				if (local100 == -1) {
					break;
				}
				Static285.anIntArray335[local100] = local52;
				Static205.anIntArray236[local100] = local77;
			}
		}
		for (local52 = 0; local52 < this.anInt7782; local52++) {
			if (this.aByteArray77 == null || this.aByteArray77[local52] <= 128) {
				@Pc(151) short local151 = this.aShortArray108[local52];
				@Pc(156) short local156 = this.aShortArray106[local52];
				@Pc(161) short local161 = this.aShortArray109[local52];
				local91 = Static285.anIntArray335[local151];
				local100 = Static285.anIntArray335[local156];
				@Pc(173) int local173 = Static285.anIntArray335[local161];
				@Pc(177) int local177 = Static205.anIntArray236[local151];
				@Pc(181) int local181 = Static205.anIntArray236[local156];
				@Pc(185) int local185 = Static205.anIntArray236[local161];
				if (-((local173 - local100) * (-local177 + local181)) + (local181 - local185) * (-local100 + local91) > 0) {
					arg0.method6366(local177, local100, local173, local185, local91, local181);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!cl;IZ)V")
	@Override
	public void method8361(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray112 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7739; local15++) {
			if ((arg1 & this.aShortArray112[local15]) != 0) {
				if (arg2) {
					arg0.method9511(this.anIntArray573[local15], this.anIntArray571[local15], this.anIntArray569[local15], local13);
				} else {
					arg0.method9519(this.anIntArray573[local15], this.anIntArray571[local15], this.anIntArray569[local15], local13);
				}
				this.anIntArray573[local15] = local13[0];
				this.anIntArray571[local15] = local13[1];
				this.anIntArray569[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean520) {
			this.method6692();
		}
		return this.anInt7758;
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "()Z")
	@Override
	public boolean method8368() {
		if (this.aShortArray105 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray105.length; local13++) {
			if (this.aShortArray105[local13] != -1 && !this.aClass22_Sub2_16.anInterface4_14.method5758(this.aShortArray105[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7739; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray571[local15] + this.anIntArray573[local15] * local13 >> 14;
			this.anIntArray571[local15] = this.anIntArray571[local15] * local13 - local9 * this.anIntArray573[local15] >> 14;
			this.anIntArray573[local15] = local34;
		}
		this.method6688();
		this.aBoolean520 = false;
	}

	@OriginalMember(owner = "client!pea", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7739; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray571[local15] - local9 * this.anIntArray569[local15] >> 14;
			this.anIntArray569[local15] = this.anIntArray571[local15] * local9 + local13 * this.anIntArray569[local15] >> 14;
			this.anIntArray571[local15] = local34;
		}
		this.method6688();
		this.aBoolean520 = false;
	}

	@OriginalMember(owner = "client!pea", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean521;
	}

	@OriginalMember(owner = "client!pea", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean522;
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(I)V")
	private void method6695() {
		if (this.aClass174_1 != null) {
			this.aClass174_1.aBoolean280 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!cl;Lclient!ve;I)V")
	@Override
	public void method8360(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7787 == 0) {
			return;
		}
		@Pc(14) Class58_Sub2 local14 = this.aClass22_Sub2_16.aClass58_Sub2_16;
		if (!this.aBoolean520) {
			this.method6692();
		}
		@Pc(25) Class58_Sub2 local25 = (Class58_Sub2) arg0;
		Static603.aFloat140 = local25.aFloat112 * local14.aFloat115 + local25.aFloat109 * local14.aFloat113 + local25.aFloat113 * local14.aFloat114;
		Static356.aFloat98 = local25.aFloat116 * local14.aFloat113 + local25.aFloat108 * local14.aFloat115 + local14.aFloat114 * local25.aFloat111 + local14.aFloat111;
		@Pc(72) float local72 = Static603.aFloat140 * (float) this.anInt7801 + Static356.aFloat98;
		@Pc(80) float local80 = Static603.aFloat140 * (float) this.anInt7799 + Static356.aFloat98;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.anInt7797;
			local96 = local72 + (float) this.anInt7797;
		} else {
			local90 = local72 - (float) this.anInt7797;
			local96 = local80 + (float) this.anInt7797;
		}
		if (local90 >= this.aClass22_Sub2_16.aFloat179 || local96 <= (float) this.aClass22_Sub2_16.anInt10464) {
			return;
		}
		Static598.aFloat139 = local25.aFloat112 * local14.aFloat120 + local14.aFloat112 * local25.aFloat109 + local14.aFloat110 * local25.aFloat113;
		Static61.aFloat37 = local14.aFloat108 + local25.aFloat111 * local14.aFloat110 + local14.aFloat112 * local25.aFloat116 + local25.aFloat108 * local14.aFloat120;
		@Pc(174) float local174 = Static598.aFloat139 * (float) this.anInt7801 + Static61.aFloat37;
		@Pc(182) float local182 = (float) this.anInt7799 * Static598.aFloat139 + Static61.aFloat37;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local182 < local174) {
			local209 = (float) this.aClass22_Sub2_16.anInt10455 * (local174 + (float) this.anInt7797);
			local198 = ((float) -this.anInt7797 + local182) * (float) this.aClass22_Sub2_16.anInt10455;
		} else {
			local198 = ((float) -this.anInt7797 + local174) * (float) this.aClass22_Sub2_16.anInt10455;
			local209 = ((float) this.anInt7797 + local182) * (float) this.aClass22_Sub2_16.anInt10455;
		}
		if (local198 / local96 >= this.aClass22_Sub2_16.aFloat184 || local209 / local96 <= this.aClass22_Sub2_16.aFloat189) {
			return;
		}
		Static516.aFloat126 = local25.aFloat113 * local14.aFloat119 + local14.aFloat109 * local25.aFloat109 + local14.aFloat117 * local25.aFloat112;
		Static408.aFloat101 = local14.aFloat116 + local14.aFloat117 * local25.aFloat108 + local14.aFloat109 * local25.aFloat116 + local25.aFloat111 * local14.aFloat119;
		@Pc(301) float local301 = Static408.aFloat101 + (float) this.anInt7801 * Static516.aFloat126;
		@Pc(309) float local309 = Static408.aFloat101 + Static516.aFloat126 * (float) this.anInt7799;
		@Pc(324) float local324;
		@Pc(335) float local335;
		if (local301 > local309) {
			local324 = (float) this.aClass22_Sub2_16.anInt10463 * (local309 - (float) this.anInt7797);
			local335 = ((float) this.anInt7797 + local301) * (float) this.aClass22_Sub2_16.anInt10463;
		} else {
			local335 = (float) this.aClass22_Sub2_16.anInt10463 * (local309 + (float) this.anInt7797);
			local324 = ((float) -this.anInt7797 + local301) * (float) this.aClass22_Sub2_16.anInt10463;
		}
		if (this.aClass22_Sub2_16.aFloat193 <= local324 / local96 || local335 / local96 <= this.aClass22_Sub2_16.aFloat183) {
			return;
		}
		if (arg1 != null || this.aClass83Array1 != null) {
			Static565.aFloat134 = local25.aFloat117 * local14.aFloat113 + local25.aFloat120 * local14.aFloat115 + local14.aFloat114 * local25.aFloat115;
			Static173.aFloat176 = local25.aFloat115 * local14.aFloat119 + local14.aFloat109 * local25.aFloat117 + local14.aFloat117 * local25.aFloat120;
			Static437.aFloat106 = local14.aFloat110 * local25.aFloat114 + local25.aFloat110 * local14.aFloat120 + local25.aFloat119 * local14.aFloat112;
			Static366.aFloat99 = local14.aFloat120 * local25.aFloat120 + local25.aFloat117 * local14.aFloat112 + local25.aFloat115 * local14.aFloat110;
			Static592.aFloat138 = local25.aFloat114 * local14.aFloat119 + local14.aFloat117 * local25.aFloat110 + local14.aFloat109 * local25.aFloat119;
			Static372.aFloat100 = local25.aFloat114 * local14.aFloat114 + local25.aFloat119 * local14.aFloat113 + local25.aFloat110 * local14.aFloat115;
		}
		if (arg1 != null) {
			@Pc(501) boolean local501 = false;
			@Pc(503) boolean local503 = true;
			@Pc(511) int local511 = this.anInt7741 + this.anInt7738 >> 1;
			@Pc(519) int local519 = this.anInt7750 + this.anInt7723 >> 1;
			@Pc(538) int local538 = (int) ((float) local511 * Static366.aFloat99 + Static61.aFloat37 + Static598.aFloat139 * (float) this.anInt7801 + (float) local519 * Static437.aFloat106);
			@Pc(557) int local557 = (int) (Static516.aFloat126 * (float) this.anInt7801 + (float) local511 * Static173.aFloat176 + Static408.aFloat101 + Static592.aFloat138 * (float) local519);
			@Pc(576) int local576 = (int) ((float) local511 * Static565.aFloat134 + Static356.aFloat98 + (float) this.anInt7801 * Static603.aFloat140 + (float) local519 * Static372.aFloat100);
			if (local576 >= this.aClass22_Sub2_16.anInt10464) {
				arg1.anInt10618 = local557 * this.aClass22_Sub2_16.anInt10463 / local576 + this.aClass22_Sub2_16.anInt10474;
				arg1.anInt10619 = local538 * this.aClass22_Sub2_16.anInt10455 / local576 + this.aClass22_Sub2_16.anInt10461;
			} else {
				local501 = true;
			}
			@Pc(632) int local632 = (int) ((float) local519 * Static437.aFloat106 + Static598.aFloat139 * (float) this.anInt7799 + Static366.aFloat99 * (float) local511 + Static61.aFloat37);
			@Pc(651) int local651 = (int) ((float) local519 * Static592.aFloat138 + Static516.aFloat126 * (float) this.anInt7799 + Static173.aFloat176 * (float) local511 + Static408.aFloat101);
			@Pc(670) int local670 = (int) (Static372.aFloat100 * (float) local519 + Static603.aFloat140 * (float) this.anInt7799 + Static356.aFloat98 + Static565.aFloat134 * (float) local511);
			if (this.aClass22_Sub2_16.anInt10464 <= local670) {
				arg1.anInt10617 = this.aClass22_Sub2_16.anInt10474 + local651 * this.aClass22_Sub2_16.anInt10463 / local670;
				arg1.anInt10616 = local632 * this.aClass22_Sub2_16.anInt10455 / local670 + this.aClass22_Sub2_16.anInt10461;
			} else {
				local501 = true;
			}
			if (local501) {
				if (this.aClass22_Sub2_16.anInt10464 > local576 && this.aClass22_Sub2_16.anInt10464 > local670) {
					local503 = false;
				} else {
					@Pc(766) int local766;
					@Pc(776) int local776;
					@Pc(801) int local801;
					if (this.aClass22_Sub2_16.anInt10464 > local576) {
						local766 = (local670 - this.aClass22_Sub2_16.anInt10464 << 16) / (local670 - local576);
						local776 = local632 + ((local632 - local538) * local766 >> 16);
						local801 = local651 + ((local651 - local557) * local766 >> 16);
						arg1.anInt10619 = this.aClass22_Sub2_16.anInt10461 + this.aClass22_Sub2_16.anInt10455 * local776 / this.aClass22_Sub2_16.anInt10464;
						arg1.anInt10618 = this.aClass22_Sub2_16.anInt10463 * local801 / this.aClass22_Sub2_16.anInt10464 + this.aClass22_Sub2_16.anInt10474;
					} else if (local670 < this.aClass22_Sub2_16.anInt10464) {
						local766 = (local576 - this.aClass22_Sub2_16.anInt10464 << 16) / (local576 - local670);
						local776 = local538 + (local766 * (local538 - local632) >> 16);
						arg1.anInt10619 = local776 * this.aClass22_Sub2_16.anInt10455 / this.aClass22_Sub2_16.anInt10464 + this.aClass22_Sub2_16.anInt10461;
						local801 = ((local557 - local651) * local766 >> 16) + local557;
						arg1.anInt10618 = this.aClass22_Sub2_16.anInt10474 + this.aClass22_Sub2_16.anInt10463 * local801 / this.aClass22_Sub2_16.anInt10464;
					}
				}
			}
			if (local503) {
				if (local576 > local670) {
					arg1.anInt10620 = this.aClass22_Sub2_16.anInt10461 + (local538 + this.anInt7797) * this.aClass22_Sub2_16.anInt10455 / local576 - arg1.anInt10619;
				} else {
					arg1.anInt10620 = (this.anInt7797 + local632) * this.aClass22_Sub2_16.anInt10455 / local670 + this.aClass22_Sub2_16.anInt10461 - arg1.anInt10616;
				}
				arg1.aBoolean719 = true;
			}
		}
		this.aClass22_Sub2_16.method8923();
		this.aClass22_Sub2_16.method8878(local25);
		this.method6690();
		this.method6681();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7789; local7++) {
			local16 = this.aShortArray104[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 -= -((arg1 - local28) * arg3 >> 7);
			}
			if (arg0 != -1) {
				local22 -= -((arg0 - local22) * arg3 >> 7);
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray104[local7] = (short) (local32 | local22 << 10 | local28 << 7);
		}
		if (this.aClass83Array1 != null) {
			for (local16 = 0; local16 < this.anInt7735; local16++) {
				@Pc(115) Class83 local115 = this.aClass83Array1[local16];
				@Pc(120) Class306 local120 = this.aClass306Array1[local16];
				local120.anInt8173 = local120.anInt8173 & 0xFF000000 | Static537.anIntArray601[this.aShortArray104[local115.anInt2535] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6696();
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(B)V")
	private void method6696() {
		if (this.aClass152_2 != null) {
			this.aClass152_2.aBoolean235 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean520) {
			this.method6692();
		}
		return this.anInt7738;
	}

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "()V")
	@Override
	protected void method8370() {
	}

	@OriginalMember(owner = "client!pea", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7789; local3++) {
			if (arg0 == this.aShortArray104[local3]) {
				this.aShortArray104[local3] = arg1;
			}
		}
		if (this.aClass83Array1 != null) {
			for (@Pc(42) int local42 = 0; local42 < this.anInt7735; local42++) {
				@Pc(49) Class83 local49 = this.aClass83Array1[local42];
				@Pc(54) Class306 local54 = this.aClass306Array1[local42];
				local54.anInt8173 = local54.anInt8173 & 0xFF000000 | Static537.anIntArray601[this.aShortArray104[local49.anInt2535] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6696();
	}

	@OriginalMember(owner = "client!pea", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort84 = (short) arg0;
		this.method6688();
		this.method6687();
	}

	@OriginalMember(owner = "client!pea", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean520) {
			this.method6692();
		}
		return this.anInt7750;
	}

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7739; local15++) {
			local33 = local13 * this.anIntArray573[local15] + this.anIntArray569[local15] * local9 >> 14;
			this.anIntArray569[local15] = local13 * this.anIntArray569[local15] - this.anIntArray573[local15] * local9 >> 14;
			this.anIntArray573[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7787; local33++) {
			@Pc(89) int local89 = local13 * this.aShortArray110[local33] + local9 * this.aShortArray114[local33] >> 14;
			this.aShortArray114[local33] = (short) (this.aShortArray114[local33] * local13 - this.aShortArray110[local33] * local9 >> 14);
			this.aShortArray110[local33] = (short) local89;
		}
		this.method6688();
		this.method6687();
		this.aBoolean520 = false;
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(B)V")
	public void method6698() {
		if (this.aClass152_1 != null) {
			this.aClass152_1.method3390();
		}
		if (this.aClass152_4 != null) {
			this.aClass152_4.method3390();
		}
		if (this.aClass152_2 != null) {
			this.aClass152_2.method3390();
		}
		if (this.aClass152_3 != null) {
			this.aClass152_3.method3390();
		}
		if (this.aClass174_1 != null) {
			this.aClass174_1.method3822();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class170 method8369(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = false;
		@Pc(32) Class170_Sub2 local32;
		@Pc(24) Class170_Sub2 local24;
		if (arg0 > 0 && arg0 <= 7) {
			local5 = true;
			local24 = this.aClass22_Sub2_16.aClass170_Sub2Array6[arg0 - 1];
			local32 = this.aClass22_Sub2_16.aClass170_Sub2Array5[arg0 - 1];
		} else {
			local32 = local24 = new Class170_Sub2(this.aClass22_Sub2_16, 0, 0, true, false);
		}
		return this.method6682(local24, arg2, arg1, local32, local5);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!cl;Lclient!ve;II)V")
	@Override
	public void method8350(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7787 == 0) {
			return;
		}
		@Pc(14) Class58_Sub2 local14 = this.aClass22_Sub2_16.aClass58_Sub2_16;
		if (!this.aBoolean520) {
			this.method6692();
		}
		@Pc(25) Class58_Sub2 local25 = (Class58_Sub2) arg0;
		Static356.aFloat98 = local14.aFloat111 + local14.aFloat113 * local25.aFloat116 + local25.aFloat108 * local14.aFloat115 + local25.aFloat111 * local14.aFloat114;
		Static603.aFloat140 = local25.aFloat113 * local14.aFloat114 + local25.aFloat109 * local14.aFloat113 + local25.aFloat112 * local14.aFloat115;
		@Pc(72) float local72 = Static356.aFloat98 + (float) this.anInt7801 * Static603.aFloat140;
		@Pc(80) float local80 = Static356.aFloat98 + Static603.aFloat140 * (float) this.anInt7799;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = local72 + (float) this.anInt7797;
			local96 = local80 - (float) this.anInt7797;
		} else {
			local96 = local72 - (float) this.anInt7797;
			local90 = (float) this.anInt7797 + local80;
		}
		if (local96 >= this.aClass22_Sub2_16.aFloat180 || (float) this.aClass22_Sub2_16.anInt10464 >= local90) {
			return;
		}
		Static598.aFloat139 = local25.aFloat112 * local14.aFloat120 + local25.aFloat109 * local14.aFloat112 + local14.aFloat110 * local25.aFloat113;
		Static61.aFloat37 = local14.aFloat108 + local25.aFloat108 * local14.aFloat120 + local25.aFloat116 * local14.aFloat112 + local25.aFloat111 * local14.aFloat110;
		@Pc(174) float local174 = Static598.aFloat139 * (float) this.anInt7801 + Static61.aFloat37;
		@Pc(182) float local182 = (float) this.anInt7799 * Static598.aFloat139 + Static61.aFloat37;
		@Pc(208) float local208;
		@Pc(197) float local197;
		if (local182 < local174) {
			local197 = (float) this.aClass22_Sub2_16.anInt10455 * (local174 + (float) this.anInt7797);
			local208 = ((float) -this.anInt7797 + local182) * (float) this.aClass22_Sub2_16.anInt10455;
		} else {
			local197 = (local182 + (float) this.anInt7797) * (float) this.aClass22_Sub2_16.anInt10455;
			local208 = (float) this.aClass22_Sub2_16.anInt10455 * (local174 - (float) this.anInt7797);
		}
		if (local208 / (float) arg2 >= this.aClass22_Sub2_16.aFloat184 || local197 / (float) arg2 <= this.aClass22_Sub2_16.aFloat189) {
			return;
		}
		Static408.aFloat101 = local14.aFloat116 + local14.aFloat117 * local25.aFloat108 + local14.aFloat109 * local25.aFloat116 + local25.aFloat111 * local14.aFloat119;
		Static516.aFloat126 = local14.aFloat119 * local25.aFloat113 + local25.aFloat112 * local14.aFloat117 + local14.aFloat109 * local25.aFloat109;
		@Pc(302) float local302 = Static516.aFloat126 * (float) this.anInt7801 + Static408.aFloat101;
		@Pc(310) float local310 = Static516.aFloat126 * (float) this.anInt7799 + Static408.aFloat101;
		@Pc(325) float local325;
		@Pc(336) float local336;
		if (local302 > local310) {
			local325 = (local310 - (float) this.anInt7797) * (float) this.aClass22_Sub2_16.anInt10463;
			local336 = (float) this.aClass22_Sub2_16.anInt10463 * (local302 + (float) this.anInt7797);
		} else {
			local336 = (float) this.aClass22_Sub2_16.anInt10463 * ((float) this.anInt7797 + local310);
			local325 = (float) this.aClass22_Sub2_16.anInt10463 * ((float) -this.anInt7797 + local302);
		}
		if (this.aClass22_Sub2_16.aFloat193 <= local325 / (float) arg2 || this.aClass22_Sub2_16.aFloat183 >= local336 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass83Array1 != null) {
			Static592.aFloat138 = local25.aFloat114 * local14.aFloat119 + local14.aFloat109 * local25.aFloat119 + local14.aFloat117 * local25.aFloat110;
			Static372.aFloat100 = local25.aFloat119 * local14.aFloat113 + local25.aFloat110 * local14.aFloat115 + local14.aFloat114 * local25.aFloat114;
			Static565.aFloat134 = local14.aFloat114 * local25.aFloat115 + local14.aFloat113 * local25.aFloat117 + local25.aFloat120 * local14.aFloat115;
			Static366.aFloat99 = local14.aFloat120 * local25.aFloat120 + local14.aFloat112 * local25.aFloat117 + local14.aFloat110 * local25.aFloat115;
			Static437.aFloat106 = local14.aFloat120 * local25.aFloat110 + local25.aFloat119 * local14.aFloat112 + local14.aFloat110 * local25.aFloat114;
			Static173.aFloat176 = local25.aFloat115 * local14.aFloat119 + local25.aFloat117 * local14.aFloat109 + local14.aFloat117 * local25.aFloat120;
		}
		if (arg1 != null) {
			@Pc(510) int local510 = this.anInt7738 + this.anInt7741 >> 1;
			@Pc(518) int local518 = this.anInt7750 + this.anInt7723 >> 1;
			@Pc(537) int local537 = (int) ((float) local518 * Static437.aFloat106 + Static61.aFloat37 + Static366.aFloat99 * (float) local510 + Static598.aFloat139 * (float) this.anInt7801);
			@Pc(556) int local556 = (int) (Static592.aFloat138 * (float) local518 + Static173.aFloat176 * (float) local510 + Static408.aFloat101 + (float) this.anInt7801 * Static516.aFloat126);
			@Pc(575) int local575 = (int) ((float) this.anInt7801 * Static603.aFloat140 + Static356.aFloat98 + (float) local510 * Static565.aFloat134 + (float) local518 * Static372.aFloat100);
			@Pc(594) int local594 = (int) (Static366.aFloat99 * (float) local510 + Static61.aFloat37 + (float) this.anInt7799 * Static598.aFloat139 + Static437.aFloat106 * (float) local518);
			@Pc(613) int local613 = (int) ((float) this.anInt7799 * Static516.aFloat126 + Static408.aFloat101 + Static173.aFloat176 * (float) local510 + Static592.aFloat138 * (float) local518);
			arg1.anInt10619 = this.aClass22_Sub2_16.anInt10461 + local537 * this.aClass22_Sub2_16.anInt10455 / arg2;
			arg1.anInt10616 = this.aClass22_Sub2_16.anInt10461 + local594 * this.aClass22_Sub2_16.anInt10455 / arg2;
			arg1.anInt10618 = this.aClass22_Sub2_16.anInt10463 * local556 / arg2 + this.aClass22_Sub2_16.anInt10474;
			@Pc(672) int local672 = (int) (Static603.aFloat140 * (float) this.anInt7799 + Static565.aFloat134 * (float) local510 + Static356.aFloat98 + (float) local518 * Static372.aFloat100);
			arg1.anInt10617 = this.aClass22_Sub2_16.anInt10474 + this.aClass22_Sub2_16.anInt10463 * local613 / arg2;
			if (local575 >= this.aClass22_Sub2_16.anInt10464 || local672 >= this.aClass22_Sub2_16.anInt10464) {
				arg1.anInt10620 = this.aClass22_Sub2_16.anInt10461 + this.aClass22_Sub2_16.anInt10455 * (local537 + this.anInt7797) / arg2 - arg1.anInt10619;
				arg1.aBoolean719 = true;
			}
		}
		this.aClass22_Sub2_16.method8909((float) arg2);
		this.aClass22_Sub2_16.method8887();
		this.aClass22_Sub2_16.method8878(local25);
		this.method6690();
		this.method6681();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)Z")
	private boolean method6699() {
		if (this.aClass174_1.aBoolean280) {
			return true;
		}
		if (this.aClass174_1.anInterface11_3 == null) {
			this.aClass174_1.anInterface11_3 = this.aClass22_Sub2_16.method8916(this.aBoolean523);
		}
		@Pc(31) Interface11 local31 = this.aClass174_1.anInterface11_3;
		local31.method6757(this.anInt7782 * 6);
		@Pc(51) Buffer local51 = local31.method5367();
		if (local51 != null) {
			@Pc(59) Stream local59 = this.aClass22_Sub2_16.method8918(local51);
			@Pc(63) int local63;
			if (Stream.c()) {
				for (local63 = 0; local63 < this.anInt7782; local63++) {
					local59.d(this.aShortArray108[local63]);
					local59.d(this.aShortArray106[local63]);
					local59.d(this.aShortArray109[local63]);
				}
			} else {
				for (local63 = 0; local63 < this.anInt7782; local63++) {
					local59.a(this.aShortArray108[local63]);
					local59.a(this.aShortArray106[local63]);
					local59.a(this.aShortArray109[local63]);
				}
			}
			local59.b();
			if (local31.method5366()) {
				this.aBoolean524 = true;
				this.aClass174_1.aBoolean280 = true;
				this.aClass174_1.anInterface11_2 = local31;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pea", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean520) {
			this.method6692();
		}
		return this.anInt7723;
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "()V")
	@Override
	protected void method8365() {
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(I)V")
	private void method6700() {
		if (!this.aBoolean524) {
			return;
		}
		this.aBoolean524 = false;
		if (this.aClass184Array4 == null && this.aClass232Array4 == null && this.aClass83Array1 == null && !Static623.method8204(this.anInt7724, this.anInt7727)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			if (this.anIntArray573 != null && !Static19.method615(this.anInt7727, this.anInt7724)) {
				if (this.aClass152_1 == null || this.aClass152_1.method3393()) {
					if (!this.aBoolean520) {
						this.method6692();
					}
					local37 = true;
				} else {
					this.aBoolean524 = true;
				}
			}
			@Pc(84) boolean local84 = false;
			if (this.anIntArray571 != null && !Static161.method2612(this.anInt7727, this.anInt7724)) {
				if (this.aClass152_1 == null || this.aClass152_1.method3393()) {
					local39 = true;
					if (!this.aBoolean520) {
						this.method6692();
					}
				} else {
					this.aBoolean524 = true;
				}
			}
			if (this.anIntArray569 != null && !Static533.method7099(this.anInt7727, this.anInt7724)) {
				if (this.aClass152_1 == null || this.aClass152_1.method3393()) {
					if (!this.aBoolean520) {
						this.method6692();
					}
					local84 = true;
				} else {
					this.aBoolean524 = true;
				}
			}
			if (local37) {
				this.anIntArray573 = null;
			}
			if (local39) {
				this.anIntArray571 = null;
			}
			if (local84) {
				this.anIntArray569 = null;
			}
		}
		if (this.aShortArray116 != null && this.anIntArray573 == null && this.anIntArray571 == null && this.anIntArray569 == null) {
			this.aShortArray116 = null;
			this.anIntArray575 = null;
		}
		if (this.aByteArray78 != null && !Static72.method1582(this.anInt7724, this.anInt7727)) {
			label207: {
				label206: {
					@Pc(250) boolean local250;
					if ((this.anInt7727 & 0x37) == 0) {
						if (this.aClass152_2 == null || this.aClass152_2.method3393()) {
							break label206;
						}
						local250 = false;
					} else {
						if (this.aClass152_3 == null || this.aClass152_3.method3393()) {
							break label206;
						}
						local250 = false;
					}
					if (!local250) {
						this.aBoolean524 = true;
						break label207;
					}
				}
				this.aByteArray78 = null;
				this.aShortArray110 = this.aShortArray113 = this.aShortArray114 = null;
			}
		}
		if (this.aShortArray104 != null && !Static489.method9234(21635, this.anInt7727, this.anInt7724)) {
			if (this.aClass152_2 == null || this.aClass152_2.method3393()) {
				this.aShortArray104 = null;
			} else {
				this.aBoolean524 = true;
			}
		}
		if (this.aByteArray77 != null && !Static136.method2380(this.anInt7724, this.anInt7727)) {
			if (this.aClass152_2 == null || this.aClass152_2.method3393()) {
				this.aByteArray77 = null;
			} else {
				this.aBoolean524 = true;
			}
		}
		if (this.aFloatArray54 != null && !Static422.method5604(this.anInt7727, this.anInt7724)) {
			if (this.aClass152_4 == null || this.aClass152_4.method3393()) {
				this.aFloatArray54 = this.aFloatArray55 = null;
			} else {
				this.aBoolean524 = true;
			}
		}
		if (this.aShortArray105 != null && !Static121.method2258(this.anInt7724, this.anInt7727)) {
			if (this.aClass152_2 == null || this.aClass152_2.method3393()) {
				this.aShortArray105 = null;
			} else {
				this.aBoolean524 = true;
			}
		}
		if (this.aShortArray108 != null && !Static418.method5548(this.anInt7724, this.anInt7727)) {
			if ((this.aClass174_1 == null || this.aClass174_1.method3821()) && (this.aClass152_2 == null || this.aClass152_2.method3393())) {
				this.aShortArray108 = this.aShortArray106 = this.aShortArray109 = null;
			} else {
				this.aBoolean524 = true;
			}
		}
		if (this.aShortArray111 != null) {
			if (this.aClass152_1 == null || this.aClass152_1.method3393()) {
				this.aShortArray111 = null;
			} else {
				this.aBoolean524 = true;
			}
		}
		if (this.aShortArray115 != null) {
			if (this.aClass152_2 == null || this.aClass152_2.method3393()) {
				this.aShortArray115 = null;
			} else {
				this.aBoolean524 = true;
			}
		}
		if (this.anIntArrayArray38 != null && !Static478.method5098(this.anInt7724, this.anInt7727)) {
			this.aShortArray107 = null;
			this.anIntArrayArray38 = null;
		}
		if (this.anIntArrayArray40 != null && !Static321.method4686(this.anInt7724, this.anInt7727)) {
			this.aShortArray112 = null;
			this.anIntArrayArray40 = null;
		}
		if (this.anIntArrayArray39 != null && !Static272.method6407(this.anInt7724, this.anInt7727)) {
			this.anIntArrayArray39 = null;
		}
		if (this.anIntArray568 != null && (this.anInt7724 & 0x800) == 0 && (this.anInt7724 & 0x40000) == 0) {
			this.anIntArray572 = null;
			this.anIntArray568 = null;
			this.anIntArray570 = null;
		}
	}

	@OriginalMember(owner = "client!pea", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub7_Sub17 ba(@OriginalArg(0) Class3_Sub7_Sub17 arg0) {
		if (this.anInt7787 == 0) {
			return null;
		}
		if (!this.aBoolean520) {
			this.method6692();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass22_Sub2_16.anInt10490 <= 0) {
			local43 = this.anInt7741 - (this.aClass22_Sub2_16.anInt10490 * this.anInt7801 >> 8) >> this.aClass22_Sub2_16.anInt10462;
			local59 = this.anInt7738 - (this.aClass22_Sub2_16.anInt10490 * this.anInt7799 >> 8) >> this.aClass22_Sub2_16.anInt10462;
		} else {
			local43 = this.anInt7741 - (this.aClass22_Sub2_16.anInt10490 * this.anInt7799 >> 8) >> this.aClass22_Sub2_16.anInt10462;
			local59 = this.anInt7738 - (this.anInt7801 * this.aClass22_Sub2_16.anInt10490 >> 8) >> this.aClass22_Sub2_16.anInt10462;
		}
		@Pc(115) int local115;
		@Pc(132) int local132;
		if (this.aClass22_Sub2_16.anInt10486 > 0) {
			local115 = this.anInt7723 - (this.aClass22_Sub2_16.anInt10486 * this.anInt7799 >> 8) >> this.aClass22_Sub2_16.anInt10462;
			local132 = this.anInt7750 - (this.aClass22_Sub2_16.anInt10486 * this.anInt7801 >> 8) >> this.aClass22_Sub2_16.anInt10462;
		} else {
			local115 = this.anInt7723 - (this.aClass22_Sub2_16.anInt10486 * this.anInt7801 >> 8) >> this.aClass22_Sub2_16.anInt10462;
			local132 = this.anInt7750 - (this.aClass22_Sub2_16.anInt10486 * this.anInt7799 >> 8) >> this.aClass22_Sub2_16.anInt10462;
		}
		@Pc(174) int local174 = local59 + 1 - local43;
		@Pc(181) int local181 = local132 + 1 - local115;
		@Pc(184) Class3_Sub7_Sub17_Sub1 local184 = (Class3_Sub7_Sub17_Sub1) arg0;
		@Pc(202) Class3_Sub7_Sub17_Sub1 local202;
		if (local184 != null && local184.method6364(local174, local181)) {
			local202 = local184;
			local184.method6368();
		} else {
			local202 = new Class3_Sub7_Sub17_Sub1(this.aClass22_Sub2_16, local174, local181);
		}
		local202.method6363(local115, local43, local59, local132);
		this.method6694(local202);
		return local202;
	}

	@OriginalMember(owner = "client!pea", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray40 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt7796; local13++) {
			this.anIntArray573[local13] <<= 0x4;
			this.anIntArray571[local13] <<= 0x4;
			this.anIntArray569[local13] <<= 0x4;
		}
		Static31.anInt1090 = 0;
		Static342.anInt5489 = 0;
		Static321.anInt5165 = 0;
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "()[Lclient!lk;")
	@Override
	public Class232[] method8352() {
		return this.aClass232Array4;
	}

	@OriginalMember(owner = "client!pea", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean520) {
			this.method6692();
		}
		return this.anInt7741;
	}

	@OriginalMember(owner = "client!pea", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass22_Sub2_16.anInterface4_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7789; local11++) {
			if (this.aShortArray105[local11] == arg0) {
				this.aShortArray105[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(50) Class406 local50 = local9.method5761(arg0 & 0xFFFF);
			local37 = local50.aByte146;
			local35 = local50.aByte144;
		}
		@Pc(58) byte local58 = 0;
		@Pc(60) byte local60 = 0;
		if (arg1 != -1) {
			@Pc(70) Class406 local70 = local9.method5761(arg1 & 0xFFFF);
			local60 = local70.aByte146;
			local58 = local70.aByte144;
			if (local70.aByte145 != 0 || local70.aByte150 != 0) {
				this.aBoolean522 = true;
			}
		}
		if (!(local60 != local37 | local58 != local35)) {
			return;
		}
		if (this.aClass83Array1 != null) {
			for (@Pc(116) int local116 = 0; local116 < this.anInt7735; local116++) {
				@Pc(123) Class83 local123 = this.aClass83Array1[local116];
				@Pc(128) Class306 local128 = this.aClass306Array1[local116];
				local128.anInt8173 = local128.anInt8173 & 0xFF000000 | Static537.anIntArray601[this.aShortArray104[local123.anInt2535] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6696();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IILclient!cl;ZII)Z")
	@Override
	public boolean method8351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6684(arg1, arg3, arg0, arg2, arg4, arg5);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILclient!gt;ZFIIIFIJI)S")
	private short method6702(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray575[arg7];
		@Pc(17) int local17 = this.anIntArray575[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(30) short local30 = this.aShortArray116[local21];
			if (local30 == 0) {
				local19 = local21;
				break;
			}
			if (Static128.aLongArray3[local21] == arg8) {
				return (short) (local30 - 1);
			}
		}
		this.aShortArray116[local19] = (short) (this.anInt7787 + 1);
		Static128.aLongArray3[local19] = arg8;
		this.aShortArray115[this.anInt7787] = (short) arg9;
		if (false) {
			this.method6686(101, 108, -122, -68, 45, -71, 97, -102, 105);
		}
		this.aShortArray111[this.anInt7787] = (short) arg7;
		this.aShortArray110[this.anInt7787] = (short) arg4;
		this.aShortArray113[this.anInt7787] = (short) arg3;
		this.aShortArray114[this.anInt7787] = (short) arg5;
		this.aByteArray78[this.anInt7787] = (byte) arg0;
		this.aFloatArray54[this.anInt7787] = arg2;
		this.aFloatArray55[this.anInt7787] = arg6;
		return (short) this.anInt7787++;
	}

	@OriginalMember(owner = "client!pea", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(62) int local62;
		@Pc(40) int local40;
		@Pc(54) int[] local54;
		@Pc(56) int local56;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			local24 = 0;
			Static342.anInt5489 = 0;
			Static31.anInt1090 = 0;
			Static321.anInt5165 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (this.anIntArrayArray40.length > local40) {
					local54 = this.anIntArrayArray40[local40];
					for (local56 = 0; local56 < local54.length; local56++) {
						local62 = local54[local56];
						if (this.aShortArray112 == null || (arg6 & this.aShortArray112[local62]) != 0) {
							Static342.anInt5489 += this.anIntArray573[local62];
							Static31.anInt1090 += this.anIntArray571[local62];
							local24++;
							Static321.anInt5165 += this.anIntArray569[local62];
						}
					}
				}
			}
			if (local24 > 0) {
				Static31.anInt1090 = arg3 + Static31.anInt1090 / local24;
				Static321.anInt5165 = Static321.anInt5165 / local24 + arg4;
				Static342.anInt5489 = Static342.anInt5489 / local24 + arg2;
				Static634.aBoolean658 = true;
			} else {
				Static342.anInt5489 = arg2;
				Static31.anInt1090 = arg3;
				Static321.anInt5165 = arg4;
			}
			return;
		}
		@Pc(265) int[] local265;
		@Pc(267) int local267;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg2 * arg7[0] + arg3 * arg7[1] + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg3 * arg7[4] + arg2 * arg7[3] + arg7[5] * arg4 + 8192 >> 14;
				local40 = arg7[8] * arg4 + arg7[7] * arg3 + arg2 * arg7[6] + 8192 >> 14;
				arg2 = local24;
				arg4 = local40;
				arg3 = local32;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray40.length > local32) {
					local265 = this.anIntArrayArray40[local32];
					for (local267 = 0; local267 < local265.length; local267++) {
						local56 = local265[local267];
						if (this.aShortArray112 == null || (this.aShortArray112[local56] & arg6) != 0) {
							this.anIntArray573[local56] += arg2;
							this.anIntArray571[local56] += arg3;
							this.anIntArray569[local56] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(417) int local417;
		@Pc(435) int local435;
		@Pc(671) int local671;
		@Pc(680) int local680;
		@Pc(695) int local695;
		@Pc(699) int local699;
		@Pc(718) int local718;
		@Pc(1048) int local1048;
		@Pc(1056) int local1056;
		@Pc(1212) int local1212;
		@Pc(1238) int local1238;
		@Pc(1243) int local1243;
		@Pc(1251) int local1251;
		@Pc(1256) int local1256;
		@Pc(1260) int local1260;
		@Pc(1264) int local1264;
		@Pc(1266) int local1266;
		@Pc(1399) int[] local1399;
		@Pc(1401) int local1401;
		@Pc(1407) int local1407;
		@Pc(1411) int local1411;
		@Pc(1413) int local1413;
		@Pc(1551) int local1551;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray40.length) {
						local265 = this.anIntArrayArray40[local32];
						for (local267 = 0; local267 < local265.length; local267++) {
							local56 = local265[local267];
							if (this.aShortArray112 == null || (arg6 & this.aShortArray112[local56]) != 0) {
								this.anIntArray573[local56] -= Static342.anInt5489;
								this.anIntArray571[local56] -= Static31.anInt1090;
								this.anIntArray569[local56] -= Static321.anInt5165;
								if (arg4 != 0) {
									local62 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
									local417 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
									local435 = local417 * this.anIntArray573[local56] + local62 * this.anIntArray571[local56] + 16383 >> 14;
									this.anIntArray571[local56] = this.anIntArray571[local56] * local417 + 16383 - this.anIntArray573[local56] * local62 >> 14;
									this.anIntArray573[local56] = local435;
								}
								if (arg2 != 0) {
									local62 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
									local417 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
									local435 = local417 * this.anIntArray571[local56] + 16383 - local62 * this.anIntArray569[local56] >> 14;
									this.anIntArray569[local56] = local62 * this.anIntArray571[local56] + local417 * this.anIntArray569[local56] + 16383 >> 14;
									this.anIntArray571[local56] = local435;
								}
								if (arg3 != 0) {
									local62 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
									local417 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
									local435 = local417 * this.anIntArray573[local56] + local62 * this.anIntArray569[local56] + 16383 >> 14;
									this.anIntArray569[local56] = this.anIntArray569[local56] * local417 + 16383 - local62 * this.anIntArray573[local56] >> 14;
									this.anIntArray573[local56] = local435;
								}
								this.anIntArray573[local56] += Static342.anInt5489;
								this.anIntArray571[local56] += Static31.anInt1090;
								this.anIntArray569[local56] += Static321.anInt5165;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray40.length) {
							local54 = this.anIntArrayArray40[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								if (this.aShortArray112 == null || (this.aShortArray112[local62] & arg6) != 0) {
									local417 = this.anIntArray575[local62];
									local435 = this.anIntArray575[local62 + 1];
									for (local671 = local417; local671 < local435; local671++) {
										local680 = this.aShortArray116[local671] - 1;
										if (local680 == -1) {
											break;
										}
										if (arg4 != 0) {
											local695 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
											local699 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
											local718 = local695 * this.aShortArray113[local680] + this.aShortArray110[local680] * local699 + 16383 >> 14;
											this.aShortArray113[local680] = (short) (local699 * this.aShortArray113[local680] + 16383 - this.aShortArray110[local680] * local695 >> 14);
											this.aShortArray110[local680] = (short) local718;
										}
										if (arg2 != 0) {
											local695 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
											local699 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
											local718 = this.aShortArray113[local680] * local699 + 16383 - local695 * this.aShortArray114[local680] >> 14;
											this.aShortArray114[local680] = (short) (local695 * this.aShortArray113[local680] + this.aShortArray114[local680] * local699 + 16383 >> 14);
											this.aShortArray113[local680] = (short) local718;
										}
										if (arg3 != 0) {
											local695 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
											local699 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
											local718 = this.aShortArray110[local680] * local699 + this.aShortArray114[local680] * local695 + 16383 >> 14;
											this.aShortArray114[local680] = (short) (this.aShortArray114[local680] * local699 + 16383 - this.aShortArray110[local680] * local695 >> 14);
											this.aShortArray110[local680] = (short) local718;
										}
									}
								}
							}
						}
					}
					this.method6687();
					return;
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local40 = arg7[11] << 4;
				local267 = arg7[12] << 4;
				local56 = arg7[13] << 4;
				local62 = arg7[14] << 4;
				if (Static634.aBoolean658) {
					local417 = Static31.anInt1090 * arg7[3] + arg7[0] * Static342.anInt5489 + arg7[6] * Static321.anInt5165 + 8192 >> 14;
					local435 = Static31.anInt1090 * arg7[4] + Static342.anInt5489 * arg7[1] + Static321.anInt5165 * arg7[7] + 8192 >> 14;
					local671 = arg7[2] * Static342.anInt5489 + Static31.anInt1090 * arg7[5] + Static321.anInt5165 * arg7[8] + 8192 >> 14;
					local435 += local56;
					local417 += local267;
					Static342.anInt5489 = local417;
					Static31.anInt1090 = local435;
					local671 += local62;
					Static321.anInt5165 = local671;
					Static634.aBoolean658 = false;
				}
				@Pc(1016) int[] local1016 = new int[9];
				local435 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
				local671 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
				local680 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
				local695 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
				local699 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
				local718 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
				local1048 = local699 * local671 + 8192 >> 14;
				local1056 = local718 * local671 + 8192 >> 14;
				local1016[2] = local695 * local435 + 8192 >> 14;
				local1016[4] = local435 * local699 + 8192 >> 14;
				local1016[8] = local435 * local680 + 8192 >> 14;
				local1016[3] = local435 * local718 + 8192 >> 14;
				local1016[6] = local699 * -local695 + local680 * local1056 + 8192 >> 14;
				local1016[0] = local695 * local1056 + local699 * local680 + 8192 >> 14;
				local1016[1] = local718 * -local680 + local695 * local1048 + 8192 >> 14;
				local1016[5] = -local671;
				local1016[7] = local1048 * local680 + local718 * local695 + 8192 >> 14;
				@Pc(1187) int local1187 = -Static342.anInt5489 * local1016[0] + -Static31.anInt1090 * local1016[1] + local1016[2] * -Static321.anInt5165 + 8192 >> 14;
				local1212 = -Static321.anInt5165 * local1016[5] + -Static31.anInt1090 * local1016[4] + -Static342.anInt5489 * local1016[3] + 8192 >> 14;
				local1238 = -Static321.anInt5165 * local1016[8] + -Static342.anInt5489 * local1016[6] + local1016[7] * -Static31.anInt1090 + 8192 >> 14;
				local1243 = local1187 + Static342.anInt5489;
				@Pc(1247) int local1247 = Static31.anInt1090 + local1212;
				local1251 = local1238 + Static321.anInt5165;
				@Pc(1254) int[] local1254 = new int[9];
				for (local1256 = 0; local1256 < 3; local1256++) {
					for (local1260 = 0; local1260 < 3; local1260++) {
						local1264 = 0;
						for (local1266 = 0; local1266 < 3; local1266++) {
							local1264 += arg7[local1266 + local1260 * 3] * local1016[local1256 * 3 + local1266];
						}
						local1254[local1256 * 3 + local1260] = local1264 + 8192 >> 14;
					}
				}
				local1260 = local1016[2] * local62 + local56 * local1016[1] + local267 * local1016[0] + 8192 >> 14;
				local1264 = local56 * local1016[4] + local1016[3] * local267 + local1016[5] * local62 + 8192 >> 14;
				local1260 += local1243;
				local1264 += local1247;
				local1266 = local1016[8] * local62 + local1016[7] * local56 + local1016[6] * local267 + 8192 >> 14;
				local1266 += local1251;
				local1399 = new int[9];
				for (local1401 = 0; local1401 < 3; local1401++) {
					for (local1407 = 0; local1407 < 3; local1407++) {
						local1411 = 0;
						for (local1413 = 0; local1413 < 3; local1413++) {
							local1411 += arg7[local1401 * 3 + local1413] * local1254[local1407 + local1413 * 3];
						}
						local1399[local1407 + local1401 * 3] = local1411 + 8192 >> 14;
					}
				}
				local1407 = arg7[1] * local1264 + arg7[0] * local1260 + local1266 * arg7[2] + 8192 >> 14;
				local1411 = arg7[4] * local1264 + local1260 * arg7[3] + arg7[5] * local1266 + 8192 >> 14;
				local1413 = local1260 * arg7[6] + arg7[7] * local1264 + arg7[8] * local1266 + 8192 >> 14;
				local1407 += local24;
				local1411 += local32;
				local1413 += local40;
				for (local1551 = 0; local1551 < local8; local1551++) {
					@Pc(1559) int local1559 = arg1[local1551];
					if (this.anIntArrayArray40.length > local1559) {
						@Pc(1573) int[] local1573 = this.anIntArrayArray40[local1559];
						for (@Pc(1575) int local1575 = 0; local1575 < local1573.length; local1575++) {
							@Pc(1581) int local1581 = local1573[local1575];
							if (this.aShortArray112 == null || (arg6 & this.aShortArray112[local1581]) != 0) {
								@Pc(1627) int local1627 = local1399[2] * this.anIntArray569[local1581] + local1399[1] * this.anIntArray571[local1581] + local1399[0] * this.anIntArray573[local1581] + 8192 >> 14;
								@Pc(1658) int local1658 = this.anIntArray569[local1581] * local1399[5] + local1399[4] * this.anIntArray571[local1581] + local1399[3] * this.anIntArray573[local1581] + 8192 >> 14;
								@Pc(1662) int local1662 = local1627 + local1407;
								@Pc(1666) int local1666 = local1658 + local1411;
								@Pc(1697) int local1697 = local1399[6] * this.anIntArray573[local1581] + local1399[7] * this.anIntArray571[local1581] + local1399[8] * this.anIntArray569[local1581] + 8192 >> 14;
								@Pc(1701) int local1701 = local1697 + local1413;
								this.anIntArray573[local1581] = local1662;
								this.anIntArray571[local1581] = local1666;
								this.anIntArray569[local1581] = local1701;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2681) Class306 local2681;
			@Pc(2541) boolean local2541;
			@Pc(2676) Class83 local2676;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					local2541 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray38.length > local40) {
							local54 = this.anIntArrayArray38[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								if (this.aShortArray107 == null || (this.aShortArray107[local62] & arg6) != 0) {
									local417 = arg2 * 8 + (this.aByteArray77[local62] & 0xFF);
									if (local417 < 0) {
										local417 = 0;
									} else if (local417 > 255) {
										local417 = 255;
									}
									this.aByteArray77[local62] = (byte) local417;
								}
							}
							local2541 |= local54.length > 0;
						}
					}
					if (local2541) {
						if (this.aClass83Array1 != null) {
							for (local40 = 0; local40 < this.anInt7735; local40++) {
								local2676 = this.aClass83Array1[local40];
								local2681 = this.aClass306Array1[local40];
								local2681.anInt8173 = local2681.anInt8173 & 0xFFFFFF | 255 - (this.aByteArray77[local2676.anInt2535] & 0xFF) << 24;
							}
						}
						this.method6696();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray38 != null) {
					local2541 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray38.length > local40) {
							local54 = this.anIntArrayArray38[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								if (this.aShortArray107 == null || (arg6 & this.aShortArray107[local62]) != 0) {
									local417 = this.aShortArray104[local62] & 0xFFFF;
									local435 = local417 >> 10 & 0x3F;
									local671 = local417 >> 7 & 0x7;
									@Pc(2792) int local2792 = arg2 + local435 & 0x3F;
									local680 = local417 & 0x7F;
									local671 += arg3 / 4;
									if (local671 < 0) {
										local671 = 0;
									} else if (local671 > 7) {
										local671 = 7;
									}
									local680 += arg4;
									if (local680 < 0) {
										local680 = 0;
									} else if (local680 > 127) {
										local680 = 127;
									}
									this.aShortArray104[local62] = (short) (local671 << 7 | local2792 << 10 | local680);
								}
							}
							local2541 |= local54.length > 0;
						}
					}
					if (local2541) {
						if (this.aClass83Array1 != null) {
							for (local40 = 0; local40 < this.anInt7735; local40++) {
								local2676 = this.aClass83Array1[local40];
								local2681 = this.aClass306Array1[local40];
								local2681.anInt8173 = Static537.anIntArray601[this.aShortArray104[local2676.anInt2535] & 0xFFFF] & 0xFFFFFF | local2681.anInt8173 & 0xFF000000;
							}
						}
						this.method6696();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray39 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray39.length > local32) {
							local265 = this.anIntArrayArray39[local32];
							for (local267 = 0; local267 < local265.length; local267++) {
								local2681 = this.aClass306Array1[local265[local267]];
								local2681.anInt8174 += arg2;
								local2681.anInt8171 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray39 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray39.length) {
							local265 = this.anIntArrayArray39[local32];
							for (local267 = 0; local267 < local265.length; local267++) {
								local2681 = this.aClass306Array1[local265[local267]];
								local2681.anInt8167 = arg2 * local2681.anInt8167 >> 7;
								local2681.anInt8172 = arg3 * local2681.anInt8172 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray39.length > local32) {
						local265 = this.anIntArrayArray39[local32];
						for (local267 = 0; local267 < local265.length; local267++) {
							local2681 = this.aClass306Array1[local265[local267]];
							local2681.anInt8168 = arg2 + local2681.anInt8168 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray40.length > local32) {
					local265 = this.anIntArrayArray40[local32];
					for (local267 = 0; local267 < local265.length; local267++) {
						local56 = local265[local267];
						if (this.aShortArray112 == null || (arg6 & this.aShortArray112[local56]) != 0) {
							this.anIntArray573[local56] -= Static342.anInt5489;
							this.anIntArray571[local56] -= Static31.anInt1090;
							this.anIntArray569[local56] -= Static321.anInt5165;
							this.anIntArray573[local56] = this.anIntArray573[local56] * arg2 >> 7;
							this.anIntArray571[local56] = arg3 * this.anIntArray571[local56] >> 7;
							this.anIntArray569[local56] = arg4 * this.anIntArray569[local56] >> 7;
							this.anIntArray573[local56] += Static342.anInt5489;
							this.anIntArray571[local56] += Static31.anInt1090;
							this.anIntArray569[local56] += Static321.anInt5165;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local40 = arg7[11] << 4;
			local267 = arg7[12] << 4;
			local56 = arg7[13] << 4;
			local62 = arg7[14] << 4;
			if (Static634.aBoolean658) {
				local417 = arg7[0] * Static342.anInt5489 + arg7[3] * Static31.anInt1090 + arg7[6] * Static321.anInt5165 + 8192 >> 14;
				local435 = arg7[4] * Static31.anInt1090 + Static342.anInt5489 * arg7[1] + Static321.anInt5165 * arg7[7] + 8192 >> 14;
				local671 = arg7[8] * Static321.anInt5165 + arg7[2] * Static342.anInt5489 + arg7[5] * Static31.anInt1090 + 8192 >> 14;
				local417 += local267;
				local435 += local56;
				Static31.anInt1090 = local435;
				local671 += local62;
				Static342.anInt5489 = local417;
				Static634.aBoolean658 = false;
				Static321.anInt5165 = local671;
			}
			local417 = arg2 << 15 >> 7;
			local435 = arg3 << 15 >> 7;
			local671 = arg4 << 15 >> 7;
			local680 = -Static342.anInt5489 * local417 + 8192 >> 14;
			local695 = local435 * -Static31.anInt1090 + 8192 >> 14;
			local699 = local671 * -Static321.anInt5165 + 8192 >> 14;
			local718 = Static342.anInt5489 + local680;
			local1048 = Static31.anInt1090 + local695;
			local1056 = local699 + Static321.anInt5165;
			@Pc(1921) int[] local1921 = new int[] { arg7[0] * local417 + 8192 >> 14, arg7[3] * local417 + 8192 >> 14, arg7[6] * local417 + 8192 >> 14, arg7[1] * local435 + 8192 >> 14, local435 * arg7[4] + 8192 >> 14, local435 * arg7[7] + 8192 >> 14, arg7[2] * local671 + 8192 >> 14, local671 * arg7[5] + 8192 >> 14, arg7[8] * local671 + 8192 >> 14 };
			local1212 = local417 * local267 + 8192 >> 14;
			local1238 = local435 * local56 + 8192 >> 14;
			@Pc(2049) int local2049 = local1238 + local1048;
			local1243 = local62 * local671 + 8192 >> 14;
			@Pc(2061) int local2061 = local1212 + local718;
			@Pc(2065) int local2065 = local1243 + local1056;
			@Pc(2068) int[] local2068 = new int[9];
			@Pc(2074) int local2074;
			for (local1251 = 0; local1251 < 3; local1251++) {
				for (local2074 = 0; local2074 < 3; local2074++) {
					local1256 = 0;
					for (local1260 = 0; local1260 < 3; local1260++) {
						local1256 += local1921[local1260 * 3 + local2074] * arg7[local1251 * 3 + local1260];
					}
					local2068[local2074 + local1251 * 3] = local1256 + 8192 >> 14;
				}
			}
			local2074 = local2065 * arg7[2] + local2061 * arg7[0] + local2049 * arg7[1] + 8192 >> 14;
			local1256 = local2065 * arg7[5] + arg7[3] * local2061 + local2049 * arg7[4] + 8192 >> 14;
			local2074 += local24;
			local1260 = local2065 * arg7[8] + arg7[6] * local2061 + local2049 * arg7[7] + 8192 >> 14;
			local1256 += local32;
			local1260 += local40;
			for (local1264 = 0; local1264 < local8; local1264++) {
				local1266 = arg1[local1264];
				if (this.anIntArrayArray40.length > local1266) {
					local1399 = this.anIntArrayArray40[local1266];
					for (local1401 = 0; local1401 < local1399.length; local1401++) {
						local1407 = local1399[local1401];
						if (this.aShortArray112 == null || (arg6 & this.aShortArray112[local1407]) != 0) {
							local1411 = local2068[2] * this.anIntArray569[local1407] + this.anIntArray573[local1407] * local2068[0] + local2068[1] * this.anIntArray571[local1407] + 8192 >> 14;
							local1413 = local2068[5] * this.anIntArray569[local1407] + local2068[4] * this.anIntArray571[local1407] + local2068[3] * this.anIntArray573[local1407] + 8192 >> 14;
							@Pc(2321) int local2321 = local1411 + local2074;
							local1551 = local2068[8] * this.anIntArray569[local1407] + this.anIntArray571[local1407] * local2068[7] + local2068[6] * this.anIntArray573[local1407] + 8192 >> 14;
							@Pc(2356) int local2356 = local1413 + local1256;
							this.anIntArray573[local1407] = local2321;
							@Pc(2365) int local2365 = local1551 + local1260;
							this.anIntArray571[local1407] = local2356;
							this.anIntArray569[local1407] = local2365;
						}
					}
				}
			}
		}
	}
}
