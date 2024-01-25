import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	private int anInt5596;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	private int anInt5602;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!vq;")
	private Class344 aClass344_1;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "Lclient!dd;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
	private int anInt5606;

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
	private int anInt5619;

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "Z")
	private boolean aBoolean482;

	@OriginalMember(owner = "client!kb", name = "jb", descriptor = "Lclient!vq;")
	private Class344 aClass344_2;

	@OriginalMember(owner = "client!kb", name = "sb", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!kb", name = "vb", descriptor = "I")
	private int anInt5630;

	@OriginalMember(owner = "client!kb", name = "Db", descriptor = "I")
	private int anInt5635;

	@OriginalMember(owner = "client!kb", name = "Fb", descriptor = "I")
	private int anInt5637;

	@OriginalMember(owner = "client!kb", name = "Jb", descriptor = "Lclient!vq;")
	private Class344 aClass344_3;

	@OriginalMember(owner = "client!kb", name = "Lb", descriptor = "Z")
	private boolean aBoolean484;

	@OriginalMember(owner = "client!kb", name = "Tb", descriptor = "Lclient!fc;")
	private final Class15_Sub2 aClass15_Sub2_8;

	@OriginalMember(owner = "client!kb", name = "ec", descriptor = "I")
	private int anInt5651;

	@OriginalMember(owner = "client!kb", name = "ic", descriptor = "I")
	private int anInt5654;

	@OriginalMember(owner = "client!kb", name = "pc", descriptor = "Lclient!vq;")
	private Class344 aClass344_4;

	@OriginalMember(owner = "client!kb", name = "xc", descriptor = "Lclient!hk;")
	private Class143 aClass143_1;

	@OriginalMember(owner = "client!kb", name = "Bc", descriptor = "I")
	private int anInt5663;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
	private int anInt5607;

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
	private int anInt5615;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
	private int anInt5612;

	@OriginalMember(owner = "client!kb", name = "xb", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!kb", name = "mb", descriptor = "I")
	private int anInt5624;

	@OriginalMember(owner = "client!kb", name = "pb", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[I")
	private int[] anIntArray335;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[Lclient!rea;")
	private Class280[] aClass280Array4;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[Lclient!gi;")
	private Class121[] aClass121Array4;

	@OriginalMember(owner = "client!kb", name = "fc", descriptor = "I")
	private int anInt5652;

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "[Lclient!ho;")
	private Class145[] aClass145Array1;

	@OriginalMember(owner = "client!kb", name = "bc", descriptor = "[Lclient!fba;")
	private Class95[] aClass95Array1;

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!kb", name = "yb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!kb", name = "tc", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!kb", name = "Qb", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!kb", name = "hc", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!kb", name = "Zb", descriptor = "[F")
	private float[] aFloatArray45;

	@OriginalMember(owner = "client!kb", name = "ub", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!kb", name = "yc", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!kb", name = "ab", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!kb", name = "Ub", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!kb", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!kb", name = "wc", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!kb", name = "rc", descriptor = "[F")
	private float[] aFloatArray46;

	@OriginalMember(owner = "client!kb", name = "uc", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!kb", name = "Pb", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!kb", name = "Xb", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!kb", name = "Ac", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "[I")
	private int[] anIntArray334;

	@OriginalMember(owner = "client!kb", name = "Bb", descriptor = "[I")
	private int[] anIntArray339;

	@OriginalMember(owner = "client!kb", name = "Vb", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!kb", name = "qc", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!fc;Lclient!fca;IIII)V")
	public Class21_Sub2(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_11;
		@Pc(15) int[] local15 = new int[arg1.anInt3177];
		this.anIntArray336 = new int[arg1.anInt3172 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt3177; local24++) {
			if ((arg1.aByteArray47 == null || arg1.aByteArray47[local24] != 2) && (arg1.aShortArray52 == null || arg1.aShortArray52[local24] == -1 || !local11.method3088(arg1.aShortArray52[local24] & 0xFFFF).aBoolean493)) {
				local15[this.anInt5607++] = local24;
				this.anIntArray336[arg1.aShortArray48[local24]]++;
				this.anIntArray336[arg1.aShortArray53[local24]]++;
				this.anIntArray336[arg1.aShortArray49[local24]]++;
			}
		}
		this.anInt5615 = this.anInt5607;
		@Pc(115) long[] local115 = new long[this.anInt5607];
		@Pc(124) boolean local124 = (this.anInt5654 & 0x100) != 0;
		@Pc(136) int local136;
		@Pc(147) int local147;
		@Pc(282) int local282;
		label496: for (@Pc(126) int local126 = 0; local126 < this.anInt5607; local126++) {
			@Pc(132) int local132 = local15[local126];
			@Pc(134) Class178 local134 = null;
			local136 = 0;
			@Pc(138) byte local138 = 0;
			@Pc(140) byte local140 = 0;
			@Pc(142) byte local142 = 0;
			if (arg1.aClass275Array1 != null) {
				for (local147 = 0; local147 < arg1.aClass275Array1.length; local147++) {
					@Pc(154) Class275 local154 = arg1.aClass275Array1[local147];
					if (local154.anInt8401 == local132) {
						@Pc(167) Class198 local167 = Static53.method1292(local154.anInt8402);
						if (local167.aBoolean514) {
							local115[local126] = Long.MAX_VALUE;
							this.anInt5615--;
							continue label496;
						}
					}
				}
			}
			@Pc(194) short local194 = -1;
			if (arg1.aShortArray52 != null) {
				local194 = arg1.aShortArray52[local132];
				if (local194 != -1) {
					local134 = local11.method3088(local194 & 0xFFFF);
					local140 = local134.aByte54;
					local142 = local134.aByte58;
				}
			}
			@Pc(238) boolean local238 = arg1.aByteArray43 != null && arg1.aByteArray43[local132] != 0 || local134 != null && !local134.aBoolean489;
			if ((local124 || local238) && arg1.aByteArray41 != null) {
				local136 += arg1.aByteArray41[local132] << 17;
			}
			if (local238) {
				local136 += 65536;
			}
			local136 += (local140 & 0xFF) << 8;
			local136 += local142 & 0xFF;
			local282 = local138 + ((local194 & 0xFFFF) << 16);
			@Pc(288) int local288 = local282 + (local126 & 0xFFFF);
			local115[local126] = (long) local288 + ((long) local136 << 32);
		}
		Static545.method7995(local115, local15);
		this.anInt5612 = arg1.anInt3170;
		this.anIntArray338 = arg1.anIntArray200;
		this.anInt5624 = arg1.anInt3172;
		this.aShortArray79 = arg1.aShortArray51;
		this.anIntArray337 = arg1.anIntArray202;
		this.anIntArray335 = arg1.anIntArray198;
		@Pc(335) Class264[] local335 = new Class264[this.anInt5624];
		this.aClass280Array4 = arg1.aClass280Array2;
		this.aClass121Array4 = arg1.aClass121Array2;
		@Pc(363) int local363;
		@Pc(377) int local377;
		if (arg1.aClass275Array1 != null) {
			this.anInt5652 = arg1.aClass275Array1.length;
			this.aClass145Array1 = new Class145[this.anInt5652];
			this.aClass95Array1 = new Class95[this.anInt5652];
			for (local363 = 0; local363 < this.anInt5652; local363++) {
				@Pc(370) Class275 local370 = arg1.aClass275Array1[local363];
				@Pc(375) Class198 local375 = Static53.method1292(local370.anInt8402);
				local377 = -1;
				for (@Pc(379) int local379 = 0; local379 < this.anInt5607; local379++) {
					if (local15[local379] == local370.anInt8401) {
						local377 = local379;
						break;
					}
				}
				if (local377 == -1) {
					throw new RuntimeException();
				}
				local147 = Static331.anIntArray442[arg1.aShortArray56[local370.anInt8401] & 0xFFFF] & 0xFFFFFF;
				local147 |= 255 - (arg1.aByteArray43 == null ? 0 : arg1.aByteArray43[local370.anInt8401]) << 24;
				this.aClass95Array1[local363] = new Class95(local377, arg1.aShortArray48[local370.anInt8401], arg1.aShortArray53[local370.anInt8401], arg1.aShortArray49[local370.anInt8401], local375.anInt6034, local375.anInt6039, local375.anInt6035, local375.anInt6036, local375.anInt6037, local375.aBoolean514, local375.aBoolean513, local370.anInt8398);
				this.aClass145Array1[local363] = new Class145(local147);
			}
		}
		local363 = this.anInt5607 * 3;
		this.aShortArray78 = new short[local363];
		this.aShortArray81 = new short[this.anInt5607];
		this.aShortArray84 = new short[local363];
		this.aShort54 = (short) arg3;
		this.aShortArray83 = new short[local363];
		this.aByteArray67 = new byte[this.anInt5607];
		this.aFloatArray45 = new float[local363];
		this.aShortArray80 = new short[local363];
		this.aShortArray87 = new short[this.anInt5607];
		this.aShortArray77 = new short[local363];
		this.aShort55 = (short) arg4;
		if (arg1.aShortArray55 != null) {
			this.lb = new short[this.anInt5607];
		}
		this.aShortArray86 = new short[this.anInt5607];
		this.aFloatArray46 = new float[local363];
		this.aShortArray85 = new short[this.anInt5607];
		this.aShortArray82 = new short[local363];
		this.aShortArray76 = new short[this.anInt5607];
		this.aByteArray68 = new byte[local363];
		Static293.aLongArray10 = new long[local363];
		local136 = 0;
		for (local282 = 0; local282 < arg1.anInt3172; local282++) {
			local377 = this.anIntArray336[local282];
			this.anIntArray336[local282] = local136;
			local136 += local377;
			local335[local282] = new Class264();
		}
		this.anIntArray336[arg1.anInt3172] = local136;
		@Pc(622) int[] local622 = null;
		@Pc(624) int[] local624 = null;
		@Pc(626) int[] local626 = null;
		@Pc(628) float[][] local628 = null;
		@Pc(646) int[] local646;
		@Pc(654) int local654;
		@Pc(693) int local693;
		@Pc(699) int local699;
		@Pc(713) int local713;
		@Pc(715) int local715;
		@Pc(751) int local751;
		@Pc(756) int local756;
		@Pc(923) float local923;
		@Pc(915) float local915;
		@Pc(931) float local931;
		if (arg1.aByteArray42 != null) {
			@Pc(634) int local634 = arg1.anInt3183;
			@Pc(637) int[] local637 = new int[local634];
			@Pc(640) int[] local640 = new int[local634];
			@Pc(643) int[] local643 = new int[local634];
			local646 = new int[local634];
			@Pc(649) int[] local649 = new int[local634];
			@Pc(652) int[] local652 = new int[local634];
			for (local654 = 0; local654 < local634; local654++) {
				local637[local654] = Integer.MAX_VALUE;
				local640[local654] = -2147483647;
				local643[local654] = Integer.MAX_VALUE;
				local646[local654] = -2147483647;
				local649[local654] = Integer.MAX_VALUE;
				local652[local654] = -2147483647;
			}
			local622 = new int[local634];
			for (local693 = 0; local693 < this.anInt5607; local693++) {
				local699 = local15[local693];
				if (arg1.aByteArray42[local699] != -1) {
					local713 = arg1.aByteArray42[local699] & 0xFF;
					for (local715 = 0; local715 < 3; local715++) {
						@Pc(727) short local727;
						if (local715 == 0) {
							local727 = arg1.aShortArray48[local699];
						} else if (local715 == 1) {
							local727 = arg1.aShortArray53[local699];
						} else {
							local727 = arg1.aShortArray49[local699];
						}
						local751 = arg1.anIntArray202[local727];
						local756 = arg1.anIntArray198[local727];
						@Pc(761) int local761 = arg1.anIntArray200[local727];
						if (local751 < local637[local713]) {
							local637[local713] = local751;
						}
						if (local640[local713] < local751) {
							local640[local713] = local751;
						}
						if (local643[local713] > local756) {
							local643[local713] = local756;
						}
						if (local646[local713] < local756) {
							local646[local713] = local756;
						}
						if (local649[local713] > local761) {
							local649[local713] = local761;
						}
						if (local761 > local652[local713]) {
							local652[local713] = local761;
						}
					}
				}
			}
			local624 = new int[local634];
			local628 = new float[local634][];
			local626 = new int[local634];
			for (local699 = 0; local699 < local634; local699++) {
				@Pc(858) byte local858 = arg1.aByteArray44[local699];
				if (local858 > 0) {
					local622[local699] = (local640[local699] + local637[local699]) / 2;
					local624[local699] = (local643[local699] + local646[local699]) / 2;
					local626[local699] = (local652[local699] + local649[local699]) / 2;
					if (local858 == 1) {
						local756 = arg1.anIntArray197[local699];
						local915 = 64.0F / (float) arg1.anIntArray194[local699];
						if (local756 == 0) {
							local923 = 1.0F;
							local931 = 1.0F;
						} else if (local756 > 0) {
							local923 = 1.0F;
							local931 = (float) local756 / 1024.0F;
						} else {
							local923 = (float) -local756 / 1024.0F;
							local931 = 1.0F;
						}
					} else if (local858 == 2) {
						local915 = 64.0F / (float) arg1.anIntArray194[local699];
						local923 = 64.0F / (float) arg1.anIntArray197[local699];
						local931 = 64.0F / (float) arg1.anIntArray201[local699];
					} else {
						local923 = (float) arg1.anIntArray197[local699] / 1024.0F;
						local931 = (float) arg1.anIntArray201[local699] / 1024.0F;
						local915 = (float) arg1.anIntArray194[local699] / 1024.0F;
					}
					local628[local699] = Static286.method8373(arg1.aShortArray50[local699], local931, arg1.aByteArray46[local699] & 0xFF, local915, arg1.aShortArray54[local699], arg1.aShortArray57[local699], local923);
				}
			}
		}
		@Pc(1036) Class319[] local1036 = new Class319[arg1.anInt3177];
		@Pc(1055) short local1055;
		@Pc(1066) int local1066;
		@Pc(1077) int local1077;
		for (@Pc(1038) int local1038 = 0; local1038 < arg1.anInt3177; local1038++) {
			@Pc(1045) short local1045 = arg1.aShortArray48[local1038];
			@Pc(1050) short local1050 = arg1.aShortArray53[local1038];
			local1055 = arg1.aShortArray49[local1038];
			local1066 = this.anIntArray337[local1050] - this.anIntArray337[local1045];
			local1077 = this.anIntArray335[local1050] - this.anIntArray335[local1045];
			local654 = this.anIntArray338[local1050] - this.anIntArray338[local1045];
			local693 = this.anIntArray337[local1055] - this.anIntArray337[local1045];
			local699 = this.anIntArray335[local1055] - this.anIntArray335[local1045];
			local713 = this.anIntArray338[local1055] - this.anIntArray338[local1045];
			local715 = local713 * local1077 - local699 * local654;
			@Pc(1138) int local1138 = local693 * local654 - local1066 * local713;
			for (local751 = local1066 * local699 - local693 * local1077; local715 > 8192 || local1138 > 8192 || local751 > 8192 || local715 < -8192 || local1138 < -8192 || local751 < -8192; local751 >>= 0x1) {
				local715 >>= 0x1;
				local1138 >>= 0x1;
			}
			local756 = (int) Math.sqrt((double) (local751 * local751 + local715 * local715 + local1138 * local1138));
			if (local756 <= 0) {
				local756 = 1;
			}
			local751 = local751 * 256 / local756;
			local715 = local715 * 256 / local756;
			local1138 = local1138 * 256 / local756;
			@Pc(1234) byte local1234 = arg1.aByteArray47 == null ? 0 : arg1.aByteArray47[local1038];
			if (local1234 == 0) {
				@Pc(1240) Class264 local1240 = local335[local1045];
				local1240.anInt8196++;
				local1240.anInt8198 += local715;
				local1240.anInt8201 += local1138;
				local1240.anInt8195 += local751;
				@Pc(1268) Class264 local1268 = local335[local1050];
				local1268.anInt8196++;
				local1268.anInt8195 += local751;
				local1268.anInt8198 += local715;
				local1268.anInt8201 += local1138;
				@Pc(1296) Class264 local1296 = local335[local1055];
				local1296.anInt8196++;
				local1296.anInt8198 += local715;
				local1296.anInt8195 += local751;
				local1296.anInt8201 += local1138;
			} else if (local1234 == 1) {
				@Pc(1333) Class319 local1333 = local1036[local1038] = new Class319();
				local1333.anInt9464 = local1138;
				local1333.anInt9463 = local751;
				local1333.anInt9467 = local715;
			}
		}
		@Pc(1355) int local1355;
		for (@Pc(1349) int local1349 = 0; local1349 < this.anInt5607; local1349++) {
			local1355 = local15[local1349];
			@Pc(1362) int local1362 = arg1.aShortArray56[local1355] & 0xFFFF;
			@Pc(1367) short local1367;
			if (arg1.aShortArray52 == null) {
				local1367 = -1;
			} else {
				local1367 = arg1.aShortArray52[local1355];
			}
			if (arg1.aByteArray42 == null) {
				local1077 = -1;
			} else {
				local1077 = arg1.aByteArray42[local1355];
			}
			if (arg1.aByteArray43 == null) {
				local654 = 0;
			} else {
				local654 = arg1.aByteArray43[local1355] & 0xFF;
			}
			@Pc(1402) float local1402 = 0.0F;
			@Pc(1404) float local1404 = 0.0F;
			@Pc(1406) float local1406 = 0.0F;
			local923 = 0.0F;
			local915 = 0.0F;
			local931 = 0.0F;
			@Pc(1414) byte local1414 = 0;
			@Pc(1416) byte local1416 = 0;
			@Pc(1418) int local1418 = 0;
			@Pc(1453) byte local1453;
			@Pc(1470) short local1470;
			@Pc(2216) short local2216;
			@Pc(2221) short local2221;
			if (local1367 != -1) {
				if (local1077 == -1) {
					local931 = 0.0F;
					local1406 = 1.0F;
					local923 = 1.0F;
					local1416 = 2;
					local915 = 0.0F;
					local1414 = 1;
					local1402 = 0.0F;
					local1404 = 1.0F;
				} else {
					local1077 &= 0xFF;
					local1453 = arg1.aByteArray44[local1077];
					@Pc(1460) short local1460;
					@Pc(1465) short local1465;
					@Pc(1499) float local1499;
					@Pc(1510) float local1510;
					@Pc(1589) float local1589;
					@Pc(2022) float local2022;
					@Pc(2030) float local2030;
					@Pc(2038) float local2038;
					@Pc(2061) float local2061;
					@Pc(2084) float local2084;
					@Pc(2107) float local2107;
					if (local1453 == 0) {
						local1460 = arg1.aShortArray48[local1355];
						local1465 = arg1.aShortArray53[local1355];
						local1470 = arg1.aShortArray49[local1355];
						local2216 = arg1.aShortArray50[local1077];
						local2221 = arg1.aShortArray57[local1077];
						@Pc(2226) short local2226 = arg1.aShortArray54[local1077];
						@Pc(2232) float local2232 = (float) arg1.anIntArray202[local2216];
						@Pc(2238) float local2238 = (float) arg1.anIntArray198[local2216];
						local1499 = arg1.anIntArray200[local2216];
						local1510 = (float) arg1.anIntArray202[local2221] - local2232;
						local1589 = (float) arg1.anIntArray198[local2221] - local2238;
						@Pc(2269) float local2269 = (float) arg1.anIntArray200[local2221] - local1499;
						@Pc(2278) float local2278 = (float) arg1.anIntArray202[local2226] - local2232;
						@Pc(2287) float local2287 = (float) arg1.anIntArray198[local2226] - local2238;
						@Pc(2295) float local2295 = (float) arg1.anIntArray200[local2226] - local1499;
						@Pc(2304) float local2304 = (float) arg1.anIntArray202[local1460] - local2232;
						@Pc(2313) float local2313 = (float) arg1.anIntArray198[local1460] - local2238;
						@Pc(2321) float local2321 = (float) arg1.anIntArray200[local1460] - local1499;
						@Pc(2329) float local2329 = (float) arg1.anIntArray202[local1465] - local2232;
						@Pc(2337) float local2337 = (float) arg1.anIntArray198[local1465] - local2238;
						local2022 = (float) arg1.anIntArray200[local1465] - local1499;
						local2030 = (float) arg1.anIntArray202[local1470] - local2232;
						local2038 = (float) arg1.anIntArray198[local1470] - local2238;
						local2061 = (float) arg1.anIntArray200[local1470] - local1499;
						local2084 = local2295 * local1589 - local2269 * local2287;
						local2107 = local2269 * local2278 - local2295 * local1510;
						@Pc(2397) float local2397 = local2287 * local1510 - local2278 * local1589;
						@Pc(2406) float local2406 = local2397 * local2287 - local2107 * local2295;
						@Pc(2415) float local2415 = local2084 * local2295 - local2278 * local2397;
						@Pc(2423) float local2423 = local2107 * local2278 - local2287 * local2084;
						@Pc(2437) float local2437 = 1.0F / (local1589 * local2415 + local2406 * local1510 + local2423 * local2269);
						local1406 = (local2406 * local2329 + local2337 * local2415 + local2423 * local2022) * local2437;
						local915 = local2437 * (local2415 * local2038 + local2030 * local2406 + local2423 * local2061);
						local1402 = (local2321 * local2423 + local2304 * local2406 + local2415 * local2313) * local2437;
						@Pc(2487) float local2487 = local1510 * local2107 - local2084 * local1589;
						@Pc(2496) float local2496 = local2397 * local1589 - local2269 * local2107;
						@Pc(2505) float local2505 = local2084 * local2269 - local2397 * local1510;
						@Pc(2519) float local2519 = 1.0F / (local2487 * local2295 + local2278 * local2496 + local2287 * local2505);
						local1404 = local2519 * (local2313 * local2505 + local2304 * local2496 + local2321 * local2487);
						local931 = local2519 * (local2505 * local2038 + local2496 * local2030 + local2061 * local2487);
						local923 = (local2496 * local2329 + local2337 * local2505 + local2487 * local2022) * local2519;
					} else {
						local1460 = arg1.aShortArray48[local1355];
						local1465 = arg1.aShortArray53[local1355];
						local1470 = arg1.aShortArray49[local1355];
						@Pc(1474) int local1474 = local622[local1077];
						@Pc(1478) int local1478 = local624[local1077];
						@Pc(1482) int local1482 = local626[local1077];
						@Pc(1486) float[] local1486 = local628[local1077];
						@Pc(1491) byte local1491 = arg1.aByteArray45[local1077];
						local1499 = (float) arg1.anIntArray199[local1077] / 256.0F;
						if (local1453 == 1) {
							local1510 = (float) arg1.anIntArray201[local1077] / 1024.0F;
							Static226.method3872(arg1.anIntArray200[local1460], local1482, arg1.anIntArray202[local1460], local1491, arg1.anIntArray198[local1460], local1510, local1499, local1486, local1474, local1478);
							local1404 = Static198.aFloat58;
							local1402 = Static24.aFloat11;
							Static226.method3872(arg1.anIntArray200[local1465], local1482, arg1.anIntArray202[local1465], local1491, arg1.anIntArray198[local1465], local1510, local1499, local1486, local1474, local1478);
							local923 = Static198.aFloat58;
							local1406 = Static24.aFloat11;
							Static226.method3872(arg1.anIntArray200[local1470], local1482, arg1.anIntArray202[local1470], local1491, arg1.anIntArray198[local1470], local1510, local1499, local1486, local1474, local1478);
							local931 = Static198.aFloat58;
							local915 = Static24.aFloat11;
							local1589 = local1510 / 2.0F;
							if ((local1491 & 0x1) == 0) {
								if (local1406 - local1402 > local1589) {
									local1414 = 1;
									local1406 -= local1510;
								} else if (local1402 - local1406 > local1589) {
									local1406 += local1510;
									local1414 = 2;
								}
								if (local1589 < local915 - local1402) {
									local915 -= local1510;
									local1416 = 1;
								} else if (local1589 < local1402 - local915) {
									local1416 = 2;
									local915 += local1510;
								}
							} else {
								if (local1589 < local923 - local1404) {
									local923 -= local1510;
									local1414 = 1;
								} else if (local1589 < local1404 - local923) {
									local1414 = 2;
									local923 += local1510;
								}
								if (local931 - local1404 > local1589) {
									local1416 = 1;
									local931 -= local1510;
								} else if (local1589 < local1404 - local931) {
									local931 += local1510;
									local1416 = 2;
								}
							}
						} else if (local1453 == 2) {
							local1510 = (float) arg1.anIntArray196[local1077] / 256.0F;
							local1589 = (float) arg1.anIntArray195[local1077] / 256.0F;
							@Pc(1934) int local1934 = arg1.anIntArray202[local1465] - arg1.anIntArray202[local1460];
							@Pc(1945) int local1945 = arg1.anIntArray198[local1465] - arg1.anIntArray198[local1460];
							@Pc(1956) int local1956 = arg1.anIntArray200[local1465] - arg1.anIntArray200[local1460];
							@Pc(1966) int local1966 = arg1.anIntArray202[local1470] - arg1.anIntArray202[local1460];
							@Pc(1976) int local1976 = arg1.anIntArray198[local1470] - arg1.anIntArray198[local1460];
							@Pc(1987) int local1987 = arg1.anIntArray200[local1470] - arg1.anIntArray200[local1460];
							@Pc(1996) int local1996 = local1987 * local1945 - local1956 * local1976;
							@Pc(2005) int local2005 = local1966 * local1956 - local1934 * local1987;
							@Pc(2014) int local2014 = local1934 * local1976 - local1945 * local1966;
							local2022 = 64.0F / (float) arg1.anIntArray197[local1077];
							local2030 = 64.0F / (float) arg1.anIntArray194[local1077];
							local2038 = 64.0F / (float) arg1.anIntArray201[local1077];
							local2061 = (local1486[2] * (float) local2014 + local1486[1] * (float) local2005 + local1486[0] * (float) local1996) / local2022;
							local2084 = ((float) local2014 * local1486[5] + (float) local2005 * local1486[4] + local1486[3] * (float) local1996) / local2030;
							local2107 = (local1486[8] * (float) local2014 + (float) local2005 * local1486[7] + (float) local1996 * local1486[6]) / local2038;
							local1418 = Static499.method7535(local2084, local2061, local2107);
							Static364.method6004(arg1.anIntArray200[local1460], local1589, local1478, local1499, local1510, arg1.anIntArray198[local1460], local1486, local1418, local1482, local1474, local1491, arg1.anIntArray202[local1460]);
							local1404 = Static523.aFloat186;
							local1402 = Static367.aFloat152;
							Static364.method6004(arg1.anIntArray200[local1465], local1589, local1478, local1499, local1510, arg1.anIntArray198[local1465], local1486, local1418, local1482, local1474, local1491, arg1.anIntArray202[local1465]);
							local923 = Static523.aFloat186;
							local1406 = Static367.aFloat152;
							Static364.method6004(arg1.anIntArray200[local1470], local1589, local1478, local1499, local1510, arg1.anIntArray198[local1470], local1486, local1418, local1482, local1474, local1491, arg1.anIntArray202[local1470]);
							local931 = Static523.aFloat186;
							local915 = Static367.aFloat152;
						} else if (local1453 == 3) {
							Static205.method3405(arg1.anIntArray198[local1460], arg1.anIntArray200[local1460], local1474, local1499, local1478, local1486, arg1.anIntArray202[local1460], local1491, local1482);
							local1402 = Static509.aFloat185;
							local1404 = Static204.aFloat59;
							Static205.method3405(arg1.anIntArray198[local1465], arg1.anIntArray200[local1465], local1474, local1499, local1478, local1486, arg1.anIntArray202[local1465], local1491, local1482);
							local1406 = Static509.aFloat185;
							local923 = Static204.aFloat59;
							Static205.method3405(arg1.anIntArray198[local1470], arg1.anIntArray200[local1470], local1474, local1499, local1478, local1486, arg1.anIntArray202[local1470], local1491, local1482);
							local931 = Static204.aFloat59;
							local915 = Static509.aFloat185;
							if ((local1491 & 0x1) == 0) {
								if (local1406 - local1402 > 0.5F) {
									local1414 = 1;
									local1406--;
								} else if (local1402 - local1406 > 0.5F) {
									local1406++;
									local1414 = 2;
								}
								if (local915 - local1402 > 0.5F) {
									local1416 = 1;
									local915--;
								} else if (local1402 - local915 > 0.5F) {
									local915++;
									local1416 = 2;
								}
							} else {
								if (local931 - local1404 > 0.5F) {
									local931--;
									local1416 = 1;
								} else if (local1404 - local931 > 0.5F) {
									local1416 = 2;
									local931++;
								}
								if (local923 - local1404 > 0.5F) {
									local923--;
									local1414 = 1;
								} else if (local1404 - local923 > 0.5F) {
									local923++;
									local1414 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray47 == null) {
				local1453 = 0;
			} else {
				local1453 = arg1.aByteArray47[local1355];
			}
			if (local1453 == 0) {
				@Pc(2726) long local2726 = (long) (local1077 << 2) + ((long) (local1418 << 24) + (long) (local1362 << 8) + (long) local654 << 32);
				local1470 = arg1.aShortArray48[local1355];
				local2216 = arg1.aShortArray53[local1355];
				local2221 = arg1.aShortArray49[local1355];
				@Pc(2745) Class264 local2745 = local335[local1470];
				this.aShortArray81[local1349] = this.method4658(local2726, local1349, arg1, local2745.anInt8196, local1470, local1402, local1404, local2745.anInt8198, local2745.anInt8195, local2745.anInt8201);
				@Pc(2770) Class264 local2770 = local335[local2216];
				this.aShortArray85[local1349] = this.method4658((long) local1414 + local2726, local1349, arg1, local2770.anInt8196, local2216, local1406, local923, local2770.anInt8198, local2770.anInt8195, local2770.anInt8201);
				@Pc(2798) Class264 local2798 = local335[local2221];
				this.aShortArray76[local1349] = this.method4658(local2726 + (long) local1416, local1349, arg1, local2798.anInt8196, local2221, local915, local931, local2798.anInt8198, local2798.anInt8195, local2798.anInt8201);
			} else if (local1453 == 1) {
				@Pc(2582) Class319 local2582 = local1036[local1355];
				@Pc(2627) long local2627 = ((long) local654 + (long) (local1362 << 8) + (long) (local1418 << 24) << 32) + (long) ((local1077 << 2) + ((local2582.anInt9467 <= 0 ? 2048 : 1024) + (local2582.anInt9464 + 256 << 12)) + (local2582.anInt9463 + 256 << 22));
				this.aShortArray81[local1349] = this.method4658(local2627, local1349, arg1, 0, arg1.aShortArray48[local1355], local1402, local1404, local2582.anInt9467, local2582.anInt9463, local2582.anInt9464);
				this.aShortArray85[local1349] = this.method4658((long) local1414 + local2627, local1349, arg1, 0, arg1.aShortArray53[local1355], local1406, local923, local2582.anInt9467, local2582.anInt9463, local2582.anInt9464);
				this.aShortArray76[local1349] = this.method4658(local2627 + (long) local1416, local1349, arg1, 0, arg1.aShortArray49[local1355], local915, local931, local2582.anInt9467, local2582.anInt9463, local2582.anInt9464);
			}
			if (arg1.aShortArray52 == null) {
				this.aShortArray87[local1349] = -1;
			} else {
				this.aShortArray87[local1349] = arg1.aShortArray52[local1355];
			}
			if (arg1.aByteArray43 != null) {
				this.aByteArray67[local1349] = arg1.aByteArray43[local1355];
			}
			if (arg1.aShortArray55 != null) {
				this.lb[local1349] = arg1.aShortArray55[local1355];
			}
			this.aShortArray86[local1349] = arg1.aShortArray56[local1355];
		}
		if (this.anInt5615 > 0) {
			local1355 = 1;
			local1055 = this.aShortArray87[0];
			for (local1066 = 0; local1066 < this.anInt5615; local1066++) {
				@Pc(2898) short local2898 = this.aShortArray87[local1066];
				if (local2898 != local1055) {
					local1355++;
					local1055 = local2898;
				}
			}
			this.anIntArray341 = new int[local1355 + 1];
			this.anIntArray334 = new int[local1355];
			this.anIntArray339 = new int[local1355];
			this.anIntArray341[0] = 0;
			local1077 = this.anInt5602;
			@Pc(2933) short local2933 = 0;
			local1355 = 0;
			local1055 = this.aShortArray87[0];
			for (local693 = 0; local693 < this.anInt5615; local693++) {
				@Pc(2949) short local2949 = this.aShortArray87[local693];
				if (local1055 != local2949) {
					this.anIntArray334[local1355] = local1077;
					this.anIntArray339[local1355] = local2933 + 1 - local1077;
					local1355++;
					this.anIntArray341[local1355] = local693;
					local2933 = 0;
					local1077 = this.anInt5602;
					local1055 = local2949;
				}
				@Pc(2989) short local2989 = this.aShortArray81[local693];
				if (local2989 < local1077) {
					local1077 = local2989;
				}
				if (local2989 > local2933) {
					local2933 = local2989;
				}
				local2989 = this.aShortArray85[local693];
				if (local2933 < local2989) {
					local2933 = local2989;
				}
				if (local2989 < local1077) {
					local1077 = local2989;
				}
				local2989 = this.aShortArray76[local693];
				if (local2933 < local2989) {
					local2933 = local2989;
				}
				if (local2989 < local1077) {
					local1077 = local2989;
				}
			}
			this.anIntArray334[local1355] = local1077;
			this.anIntArray339[local1355] = local2933 + 1 - local1077;
			local1355++;
			this.anIntArray341[local1355] = this.anInt5615;
		}
		Static293.aLongArray10 = null;
		this.aShortArray83 = Static272.method4720(this.anInt5602, this.aShortArray83);
		this.aShortArray82 = Static272.method4720(this.anInt5602, this.aShortArray82);
		this.aShortArray77 = Static272.method4720(this.anInt5602, this.aShortArray77);
		this.aShortArray80 = Static272.method4720(this.anInt5602, this.aShortArray80);
		this.aShortArray78 = Static272.method4720(this.anInt5602, this.aShortArray78);
		this.aByteArray68 = Static212.method3725(this.anInt5602, this.aByteArray68);
		this.aFloatArray45 = Static523.method7754(this.aFloatArray45, this.anInt5602);
		this.aFloatArray46 = Static523.method7754(this.aFloatArray46, this.anInt5602);
		if (arg1.anIntArray193 != null && Static293.method4982(arg2, this.anInt5651)) {
			this.anIntArrayArray43 = arg1.method2784(false);
		}
		if (arg1.aClass275Array1 != null && Static308.method5146(this.anInt5651, arg2)) {
			this.anIntArrayArray44 = arg1.method2780();
		}
		if (arg1.anIntArray203 != null && Static445.method6952(arg2, this.anInt5651)) {
			local1355 = 0;
			local646 = new int[256];
			for (local1066 = 0; local1066 < this.anInt5607; local1066++) {
				local1077 = arg1.anIntArray203[local15[local1066]];
				if (local1077 >= 0) {
					@Pc(3193) int local3193 = local646[local1077]++;
					if (local1355 < local1077) {
						local1355 = local1077;
					}
				}
			}
			this.anIntArrayArray42 = new int[local1355 + 1][];
			for (local1077 = 0; local1077 <= local1355; local1077++) {
				this.anIntArrayArray42[local1077] = new int[local646[local1077]];
				local646[local1077] = 0;
			}
			for (local654 = 0; local654 < this.anInt5607; local654++) {
				local693 = arg1.anIntArray203[local15[local654]];
				if (local693 >= 0) {
					this.anIntArrayArray42[local693][local646[local693]++] = local654;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!fc;IIZZ)V")
	public Class21_Sub2(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5615 = 0;
		this.anInt5602 = 0;
		this.anInt5607 = 0;
		this.anInt5624 = 0;
		this.aBoolean482 = true;
		this.aBoolean483 = false;
		this.anInt5612 = 0;
		this.aBoolean484 = false;
		this.aBoolean484 = arg4;
		this.anInt5654 = arg1;
		this.anInt5651 = arg2;
		this.aClass15_Sub2_8 = arg0;
		if (arg3 || Static2.method178(this.anInt5651, this.anInt5654)) {
			this.aClass344_2 = new Class344(Static132.method5408(this.anInt5651, this.anInt5654));
		}
		if (arg3 || Static202.method3383(this.anInt5651, this.anInt5654)) {
			this.aClass344_4 = new Class344(Static286.method8366(this.anInt5651, this.anInt5654));
		}
		if (arg3 || Static351.method5860(this.anInt5654, this.anInt5651)) {
			this.aClass344_1 = new Class344(Static141.method2863(this.anInt5651, this.anInt5654));
		}
		if (arg3 || Static89.method2060(this.anInt5651, this.anInt5654)) {
			this.aClass344_3 = new Class344(Static480.method7350(this.anInt5654, this.anInt5651));
		}
		if (arg3 || Static213.method3730(this.anInt5651, this.anInt5654)) {
			this.aClass58_1 = new Class58(Static577.method8260(this.anInt5654, this.anInt5651));
		}
	}

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5624; local7++) {
			if (arg0 != 0) {
				this.anIntArray337[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray335[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray338[local7] += arg2;
			}
		}
		this.method4645();
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	private void method4641() {
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = 32767;
		@Pc(16) int local16 = 32767;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = -32768;
		@Pc(22) int local22 = -32768;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt5624; local28++) {
			@Pc(35) int local35 = this.anIntArray337[local28];
			@Pc(40) int local40 = this.anIntArray335[local28];
			if (local40 > local20) {
				local20 = local40;
			}
			if (local18 < local35) {
				local18 = local35;
			}
			if (local35 < local12) {
				local12 = local35;
			}
			if (local14 > local40) {
				local14 = local40;
			}
			@Pc(73) int local73 = this.anIntArray338[local28];
			if (local16 > local73) {
				local16 = local73;
			}
			if (local22 < local73) {
				local22 = local73;
			}
			@Pc(95) int local95 = local73 * local73 + local35 * local35;
			if (local95 > local24) {
				local24 = local95;
			}
			local95 = local35 * local35 + local73 * local73 + local40 * local40;
			if (local95 > local26) {
				local26 = local95;
			}
		}
		this.anInt5635 = local14;
		this.anInt5619 = local18;
		this.anInt5663 = local22;
		this.anInt5606 = local16;
		this.anInt5596 = local12;
		this.anInt5637 = local20;
		this.anInt5630 = (int) (Math.sqrt((double) local24) + 0.99D);
		Math.sqrt((double) local26);
		this.aBoolean483 = true;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	private void method4642() {
		if (!this.aBoolean482) {
			return;
		}
		this.aBoolean482 = false;
		if (this.aClass121Array4 == null && this.aClass280Array4 == null && this.aClass95Array1 == null) {
			if (this.anIntArray337 != null && !Static273.method4778(this.anInt5651, this.anInt5654)) {
				if (this.aClass344_2 == null || this.aClass344_2.method8135()) {
					if (!this.aBoolean483) {
						this.method4641();
					}
					this.anIntArray337 = null;
				} else {
					this.aBoolean482 = true;
				}
			}
			if (this.anIntArray335 != null && !Static378.method8292(this.anInt5654, this.anInt5651)) {
				if (this.aClass344_2 == null || this.aClass344_2.method8135()) {
					if (!this.aBoolean483) {
						this.method4641();
					}
					this.anIntArray335 = null;
				} else {
					this.aBoolean482 = true;
				}
			}
			if (this.anIntArray338 != null && !Static494.method7021(this.anInt5651, this.anInt5654)) {
				if (this.aClass344_2 == null || this.aClass344_2.method8135()) {
					if (!this.aBoolean483) {
						this.method4641();
					}
					this.anIntArray338 = null;
				} else {
					this.aBoolean482 = true;
				}
			}
		}
		if (this.aShortArray84 != null && this.anIntArray337 == null && this.anIntArray335 == null && this.anIntArray338 == null) {
			this.aShortArray84 = null;
			this.anIntArray336 = null;
		}
		if (this.aByteArray68 != null && !Static252.method4536(this.anInt5651, this.anInt5654)) {
			label197: {
				label196: {
					@Pc(167) boolean local167;
					if ((this.anInt5651 & 0x37) == 0) {
						if (this.aClass344_1 == null || this.aClass344_1.method8135()) {
							break label196;
						}
						local167 = false;
					} else {
						if (this.aClass344_3 == null || this.aClass344_3.method8135()) {
							break label196;
						}
						local167 = false;
					}
					if (!local167) {
						this.aBoolean482 = true;
						break label197;
					}
				}
				this.aByteArray68 = null;
				this.aShortArray77 = this.aShortArray80 = this.aShortArray78 = null;
			}
		}
		if (this.aShortArray86 != null && !Static335.method5786(this.anInt5654, this.anInt5651)) {
			if (this.aClass344_1 == null || this.aClass344_1.method8135()) {
				this.aShortArray86 = null;
			} else {
				this.aBoolean482 = true;
			}
		}
		if (this.aByteArray67 != null && !Static264.method7032(this.anInt5651, this.anInt5654)) {
			if (this.aClass344_1 == null || this.aClass344_1.method8135()) {
				this.aByteArray67 = null;
			} else {
				this.aBoolean482 = true;
			}
		}
		if (this.aFloatArray45 != null && !Static124.method2508(this.anInt5651, this.anInt5654)) {
			if (this.aClass344_4 == null || this.aClass344_4.method8135()) {
				this.aFloatArray45 = this.aFloatArray46 = null;
			} else {
				this.aBoolean482 = true;
			}
		}
		if (this.aShortArray87 != null && !Static9.method345(this.anInt5651, this.anInt5654)) {
			if (this.aClass344_1 == null || this.aClass344_1.method8135()) {
				this.aShortArray87 = null;
			} else {
				this.aBoolean482 = true;
			}
		}
		if (this.aShortArray81 != null && !Static125.method2515(this.anInt5651, this.anInt5654)) {
			if ((this.aClass58_1 == null || this.aClass58_1.method1879()) && (this.aClass344_1 == null || this.aClass344_1.method8135())) {
				this.aShortArray81 = this.aShortArray85 = this.aShortArray76 = null;
			} else {
				this.aBoolean482 = true;
			}
		}
		if (this.aShortArray83 != null) {
			if (this.aClass344_2 == null || this.aClass344_2.method8135()) {
				this.aShortArray83 = null;
			} else {
				this.aBoolean482 = true;
			}
		}
		if (this.aShortArray82 != null) {
			if (this.aClass344_1 == null || this.aClass344_1.method8135()) {
				this.aShortArray82 = null;
			} else {
				this.aBoolean482 = true;
			}
		}
		if (this.anIntArrayArray42 != null && !Static445.method6952(this.anInt5654, this.anInt5651)) {
			this.anIntArrayArray42 = null;
			this.lb = null;
		}
		if (this.anIntArrayArray43 != null && !Static293.method4982(this.anInt5654, this.anInt5651)) {
			this.aShortArray79 = null;
			this.anIntArrayArray43 = null;
		}
		if (this.anIntArrayArray44 != null && !Static308.method5146(this.anInt5651, this.anInt5654)) {
			this.anIntArrayArray44 = null;
		}
		if (this.anIntArray341 != null && (this.anInt5654 & 0x800) == 0 && (this.anInt5654 & 0x40000) == 0) {
			this.anIntArray341 = null;
			this.anIntArray334 = null;
			this.anIntArray339 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static569.anInt10061 = 0;
			Static289.anInt6781 = 0;
			Static172.anInt8688 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt5624; local17++) {
				Static289.anInt6781 += this.anIntArray337[local17];
				Static172.anInt8688 += this.anIntArray335[local17];
				local15++;
				Static569.anInt10061 += this.anIntArray338[local17];
			}
			if (local15 <= 0) {
				Static289.anInt6781 = arg1;
				Static569.anInt10061 = arg3;
				Static172.anInt8688 = arg2;
			} else {
				Static569.anInt10061 = arg3 + Static569.anInt10061 / local15;
				Static172.anInt8688 = arg2 + Static172.anInt8688 / local15;
				Static289.anInt6781 = Static289.anInt6781 / local15 + arg1;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt5624; local15++) {
				this.anIntArray337[local15] += arg1;
				this.anIntArray335[local15] += arg2;
				this.anIntArray338[local15] += arg3;
			}
		} else {
			@Pc(161) int local161;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt5624; local15++) {
					this.anIntArray337[local15] -= Static289.anInt6781;
					this.anIntArray335[local15] -= Static172.anInt8688;
					this.anIntArray338[local15] -= Static569.anInt10061;
					if (arg3 != 0) {
						local17 = Class2_Sub3.anIntArray620[arg3];
						local161 = Class2_Sub3.anIntArray621[arg3];
						local180 = this.anIntArray335[local15] * local17 + this.anIntArray337[local15] * local161 + 16383 >> 14;
						this.anIntArray335[local15] = this.anIntArray335[local15] * local161 + 16383 - local17 * this.anIntArray337[local15] >> 14;
						this.anIntArray337[local15] = local180;
					}
					if (arg1 != 0) {
						local17 = Class2_Sub3.anIntArray620[arg1];
						local161 = Class2_Sub3.anIntArray621[arg1];
						local180 = local161 * this.anIntArray335[local15] + 16383 - this.anIntArray338[local15] * local17 >> 14;
						this.anIntArray338[local15] = this.anIntArray335[local15] * local17 + local161 * this.anIntArray338[local15] + 16383 >> 14;
						this.anIntArray335[local15] = local180;
					}
					if (arg2 != 0) {
						local17 = Class2_Sub3.anIntArray620[arg2];
						local161 = Class2_Sub3.anIntArray621[arg2];
						local180 = this.anIntArray337[local15] * local161 + this.anIntArray338[local15] * local17 + 16383 >> 14;
						this.anIntArray338[local15] = this.anIntArray338[local15] * local161 + 16383 - local17 * this.anIntArray337[local15] >> 14;
						this.anIntArray337[local15] = local180;
					}
					this.anIntArray337[local15] += Static289.anInt6781;
					this.anIntArray335[local15] += Static172.anInt8688;
					this.anIntArray338[local15] += Static569.anInt10061;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt5624; local15++) {
					this.anIntArray337[local15] -= Static289.anInt6781;
					this.anIntArray335[local15] -= Static172.anInt8688;
					this.anIntArray338[local15] -= Static569.anInt10061;
					this.anIntArray337[local15] = arg1 * this.anIntArray337[local15] / 128;
					this.anIntArray335[local15] = this.anIntArray335[local15] * arg2 / 128;
					this.anIntArray338[local15] = this.anIntArray338[local15] * arg3 / 128;
					this.anIntArray337[local15] += Static289.anInt6781;
					this.anIntArray335[local15] += Static172.anInt8688;
					this.anIntArray338[local15] += Static569.anInt10061;
				}
			} else {
				@Pc(508) Class95 local508;
				@Pc(513) Class145 local513;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt5607; local15++) {
						local17 = arg1 * 8 + (this.aByteArray67[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray67[local15] = (byte) local17;
					}
					if (this.aClass95Array1 != null) {
						for (local17 = 0; local17 < this.anInt5652; local17++) {
							local508 = this.aClass95Array1[local17];
							local513 = this.aClass145Array1[local17];
							local513.anInt3880 = local513.anInt3880 & 0xFFFFFF | 255 - (this.aByteArray67[local508.anInt2936] & 0xFF) << 24;
						}
					}
					this.method4651();
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt5607; local15++) {
						local17 = this.aShortArray86[local15] & 0xFFFF;
						local161 = local17 >> 10 & 0x3F;
						local180 = local17 >> 7 & 0x7;
						@Pc(575) int local575 = arg1 + local161 & 0x3F;
						local180 += arg2 / 4;
						@Pc(585) int local585 = local17 & 0x7F;
						local585 += arg3;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						if (local585 < 0) {
							local585 = 0;
						} else if (local585 > 127) {
							local585 = 127;
						}
						this.aShortArray86[local15] = (short) (local575 << 10 | local180 << 7 | local585);
					}
					if (this.aClass95Array1 != null) {
						for (local17 = 0; local17 < this.anInt5652; local17++) {
							local508 = this.aClass95Array1[local17];
							local513 = this.aClass145Array1[local17];
							local513.anInt3880 = Static331.anIntArray442[this.aShortArray86[local508.anInt2936] & 0xFFFF] & 0xFFFFFF | local513.anInt3880 & 0xFF000000;
						}
					}
					this.method4651();
				} else {
					@Pc(695) Class145 local695;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt5652; local15++) {
							local695 = this.aClass145Array1[local15];
							local695.anInt3879 += arg2;
							local695.anInt3876 += arg1;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt5652; local15++) {
							local695 = this.aClass145Array1[local15];
							local695.anInt3872 = local695.anInt3872 * arg2 >> 7;
							local695.anInt3882 = local695.anInt3882 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt5652; local15++) {
							local695 = this.aClass145Array1[local15];
							local695.anInt3878 = arg1 + local695.anInt3878 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!q;Lclient!ht;I)V")
	@Override
	public void method7145(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5602 == 0) {
			return;
		}
		@Pc(16) Class255_Sub3 local16 = this.aClass15_Sub2_8.aClass255_Sub3_16;
		@Pc(19) Class255_Sub3 local19 = (Class255_Sub3) arg0;
		if (!this.aBoolean483) {
			this.method4641();
		}
		Static303.aFloat121 = local19.aFloat191 * local16.aFloat192 + local19.aFloat190 * local16.aFloat191 + local19.aFloat196 * local16.aFloat193;
		Static191.aFloat56 = local16.aFloat194 + local16.aFloat191 * local19.aFloat197 + local16.aFloat193 * local19.aFloat195 + local19.aFloat194 * local16.aFloat192;
		@Pc(72) float local72 = Static191.aFloat56 + Static303.aFloat121 * (float) this.anInt5635;
		@Pc(80) float local80 = Static191.aFloat56 + (float) this.anInt5637 * Static303.aFloat121;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local96 = local80 - (float) this.anInt5630;
			local90 = local72 + (float) this.anInt5630;
		} else {
			local90 = local80 + (float) this.anInt5630;
			local96 = local72 - (float) this.anInt5630;
		}
		if (local96 >= this.aClass15_Sub2_8.aFloat138 || (float) this.aClass15_Sub2_8.anInt6556 >= local90) {
			return;
		}
		Static376.aFloat153 = local19.aFloat190 * local16.aFloat196 + local16.aFloat198 * local19.aFloat196 + local19.aFloat191 * local16.aFloat199;
		Static90.aFloat24 = local16.aFloat196 * local19.aFloat197 + local16.aFloat198 * local19.aFloat195 + local19.aFloat194 * local16.aFloat199 + local16.aFloat195;
		@Pc(172) float local172 = (float) this.anInt5635 * Static376.aFloat153 + Static90.aFloat24;
		@Pc(180) float local180 = Static90.aFloat24 + Static376.aFloat153 * (float) this.anInt5637;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local180 < local172) {
			local195 = (local172 + (float) this.anInt5630) * (float) this.aClass15_Sub2_8.anInt6545;
			local207 = (float) this.aClass15_Sub2_8.anInt6545 * ((float) -this.anInt5630 + local180);
		} else {
			local207 = (local172 - (float) this.anInt5630) * (float) this.aClass15_Sub2_8.anInt6545;
			local195 = ((float) this.anInt5630 + local180) * (float) this.aClass15_Sub2_8.anInt6545;
		}
		if (local207 / local90 >= this.aClass15_Sub2_8.aFloat132 || local195 / local90 <= this.aClass15_Sub2_8.aFloat133) {
			return;
		}
		Static459.aFloat178 = local19.aFloat195 * local16.aFloat200 + local19.aFloat197 * local16.aFloat190 + local19.aFloat194 * local16.aFloat201 + local16.aFloat197;
		Static81.aFloat21 = local16.aFloat190 * local19.aFloat190 + local16.aFloat200 * local19.aFloat196 + local19.aFloat191 * local16.aFloat201;
		@Pc(296) float local296 = Static459.aFloat178 + (float) this.anInt5635 * Static81.aFloat21;
		@Pc(304) float local304 = Static81.aFloat21 * (float) this.anInt5637 + Static459.aFloat178;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local296 > local304) {
			local331 = ((float) -this.anInt5630 + local304) * (float) this.aClass15_Sub2_8.anInt6529;
			local319 = (local296 + (float) this.anInt5630) * (float) this.aClass15_Sub2_8.anInt6529;
		} else {
			local319 = (float) this.aClass15_Sub2_8.anInt6529 * (local304 + (float) this.anInt5630);
			local331 = ((float) -this.anInt5630 + local296) * (float) this.aClass15_Sub2_8.anInt6529;
		}
		if (local331 / local90 >= this.aClass15_Sub2_8.aFloat129 || this.aClass15_Sub2_8.aFloat135 >= local319 / local90) {
			return;
		}
		if (arg1 != null || this.aClass95Array1 != null) {
			Static335.aFloat151 = local16.aFloat199 * local19.aFloat192 + local16.aFloat198 * local19.aFloat199 + local19.aFloat201 * local16.aFloat196;
			Static436.aFloat175 = local16.aFloat201 * local19.aFloat193 + local19.aFloat198 * local16.aFloat200 + local19.aFloat200 * local16.aFloat190;
			Static504.aFloat183 = local16.aFloat201 * local19.aFloat192 + local16.aFloat190 * local19.aFloat201 + local19.aFloat199 * local16.aFloat200;
			Static474.aFloat180 = local16.aFloat196 * local19.aFloat200 + local19.aFloat198 * local16.aFloat198 + local16.aFloat199 * local19.aFloat193;
			Static178.aFloat54 = local16.aFloat193 * local19.aFloat199 + local16.aFloat191 * local19.aFloat201 + local16.aFloat192 * local19.aFloat192;
			Static389.aFloat156 = local16.aFloat191 * local19.aFloat200 + local16.aFloat193 * local19.aFloat198 + local19.aFloat193 * local16.aFloat192;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.anInt5596 + this.anInt5619 >> 1;
			@Pc(509) int local509 = this.anInt5663 + this.anInt5606 >> 1;
			@Pc(528) int local528 = (int) (Static335.aFloat151 * (float) local509 + Static90.aFloat24 + Static474.aFloat180 * (float) local501 + (float) this.anInt5635 * Static376.aFloat153);
			@Pc(547) int local547 = (int) (Static81.aFloat21 * (float) this.anInt5635 + (float) local501 * Static436.aFloat175 + Static459.aFloat178 + Static504.aFloat183 * (float) local509);
			@Pc(566) int local566 = (int) (Static191.aFloat56 + Static389.aFloat156 * (float) local501 + Static303.aFloat121 * (float) this.anInt5635 + Static178.aFloat54 * (float) local509);
			if (local566 >= this.aClass15_Sub2_8.anInt6556) {
				arg1.anInt3937 = this.aClass15_Sub2_8.anInt6536 + local547 * this.aClass15_Sub2_8.anInt6529 / local566;
				arg1.anInt3936 = this.aClass15_Sub2_8.anInt6543 + local528 * this.aClass15_Sub2_8.anInt6545 / local566;
			} else {
				local491 = true;
			}
			@Pc(625) int local625 = (int) ((float) this.anInt5637 * Static376.aFloat153 + Static474.aFloat180 * (float) local501 + Static90.aFloat24 + (float) local509 * Static335.aFloat151);
			@Pc(644) int local644 = (int) (Static81.aFloat21 * (float) this.anInt5637 + Static436.aFloat175 * (float) local501 + Static459.aFloat178 + Static504.aFloat183 * (float) local509);
			@Pc(663) int local663 = (int) (Static178.aFloat54 * (float) local509 + Static303.aFloat121 * (float) this.anInt5637 + Static389.aFloat156 * (float) local501 + Static191.aFloat56);
			if (local663 >= this.aClass15_Sub2_8.anInt6556) {
				arg1.anInt3935 = this.aClass15_Sub2_8.anInt6529 * local644 / local663 + this.aClass15_Sub2_8.anInt6536;
				arg1.anInt3938 = this.aClass15_Sub2_8.anInt6543 + this.aClass15_Sub2_8.anInt6545 * local625 / local663;
			} else {
				local491 = true;
			}
			if (local491) {
				if (local566 < this.aClass15_Sub2_8.anInt6556 && this.aClass15_Sub2_8.anInt6556 > local663) {
					local493 = false;
				} else {
					@Pc(746) int local746;
					@Pc(757) int local757;
					@Pc(767) int local767;
					if (local566 < this.aClass15_Sub2_8.anInt6556) {
						local746 = (local663 - this.aClass15_Sub2_8.anInt6556 << 16) / (local663 - local566);
						local757 = local625 + (local746 * (local625 - local528) >> 16);
						arg1.anInt3936 = this.aClass15_Sub2_8.anInt6545 * local757 / this.aClass15_Sub2_8.anInt6556 + this.aClass15_Sub2_8.anInt6543;
						local767 = local644 + ((local644 - local547) * local746 >> 16);
						arg1.anInt3937 = this.aClass15_Sub2_8.anInt6536 + this.aClass15_Sub2_8.anInt6529 * local767 / this.aClass15_Sub2_8.anInt6556;
					} else if (this.aClass15_Sub2_8.anInt6556 > local663) {
						local746 = (local566 - this.aClass15_Sub2_8.anInt6556 << 16) / (local566 - local663);
						local757 = local528 + (local746 * (local528 - local625) >> 16);
						local767 = (local746 * (local547 - local644) >> 16) + local547;
						arg1.anInt3936 = this.aClass15_Sub2_8.anInt6543 + this.aClass15_Sub2_8.anInt6545 * local757 / this.aClass15_Sub2_8.anInt6556;
						arg1.anInt3937 = this.aClass15_Sub2_8.anInt6536 + local767 * this.aClass15_Sub2_8.anInt6529 / this.aClass15_Sub2_8.anInt6556;
					}
				}
			}
			if (local493) {
				if (local566 <= local663) {
					arg1.anInt3934 = this.aClass15_Sub2_8.anInt6543 + this.aClass15_Sub2_8.anInt6545 * (local625 - -this.anInt5630) / local663 - arg1.anInt3938;
				} else {
					arg1.anInt3934 = this.aClass15_Sub2_8.anInt6545 * (local528 + this.anInt5630) / local566 + this.aClass15_Sub2_8.anInt6543 - arg1.anInt3936;
				}
				arg1.aBoolean304 = true;
			}
		}
		this.aClass15_Sub2_8.method5486();
		this.aClass15_Sub2_8.method5411(local19);
		this.method4654();
		this.method4652();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!fw;)V")
	private void method4643(@OriginalArg(1) Class3_Sub4_Sub2_Sub2 arg0) {
		if (Static185.anIntArray262.length < this.anInt5602) {
			Static185.anIntArray262 = new int[this.anInt5602];
			Static591.anIntArray676 = new int[this.anInt5602];
		}
		@Pc(47) int local47;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5624; local20++) {
			local47 = (this.anIntArray337[local20] - (this.anIntArray335[local20] * this.aClass15_Sub2_8.anInt6525 >> 8) >> this.aClass15_Sub2_8.anInt6526) - arg0.anInt3347;
			@Pc(72) int local72 = (this.anIntArray338[local20] - (this.aClass15_Sub2_8.anInt6527 * this.anIntArray335[local20] >> 8) >> this.aClass15_Sub2_8.anInt6526) - arg0.anInt3343;
			@Pc(77) int local77 = this.anIntArray336[local20];
			@Pc(84) int local84 = this.anIntArray336[local20 + 1];
			for (@Pc(86) int local86 = local77; local86 < local84; local86++) {
				local95 = this.aShortArray84[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static185.anIntArray262[local95] = local47;
				Static591.anIntArray676[local95] = local72;
			}
		}
		for (local47 = 0; local47 < this.anInt5615; local47++) {
			if (this.aByteArray67 == null || this.aByteArray67[local47] <= 128) {
				@Pc(147) short local147 = this.aShortArray81[local47];
				@Pc(152) short local152 = this.aShortArray85[local47];
				@Pc(157) short local157 = this.aShortArray76[local47];
				local95 = Static185.anIntArray262[local147];
				@Pc(165) int local165 = Static185.anIntArray262[local152];
				@Pc(169) int local169 = Static185.anIntArray262[local157];
				@Pc(173) int local173 = Static591.anIntArray676[local147];
				@Pc(177) int local177 = Static591.anIntArray676[local152];
				@Pc(181) int local181 = Static591.anIntArray676[local157];
				if ((local177 - local181) * (-local165 + local95) - (local169 - local165) * (local177 - local173) > 0) {
					arg0.method2950(local173, local177, local169, local181, local95, local165);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt5654;
	}

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray43 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5612; local12++) {
			this.anIntArray337[local12] <<= 0x4;
			this.anIntArray335[local12] <<= 0x4;
			this.anIntArray338[local12] <<= 0x4;
		}
		Static172.anInt8688 = 0;
		Static289.anInt6781 = 0;
		Static569.anInt10061 = 0;
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	private void method4645() {
		if (this.aClass344_2 != null) {
			this.aClass344_2.aBoolean833 = false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class255_Sub3 local8 = (Class255_Sub3) arg2;
		@Pc(12) Class255_Sub3 local12 = this.aClass15_Sub2_8.aClass255_Sub3_16;
		@Pc(33) float local33 = local12.aFloat195 + local12.aFloat196 * local8.aFloat197 + local8.aFloat195 * local12.aFloat198 + local12.aFloat199 * local8.aFloat194;
		@Pc(54) float local54 = local12.aFloat190 * local8.aFloat197 + local12.aFloat200 * local8.aFloat195 + local12.aFloat201 * local8.aFloat194 + local12.aFloat197;
		Static81.aFloat21 = local8.aFloat196 * local12.aFloat200 + local8.aFloat190 * local12.aFloat190 + local12.aFloat201 * local8.aFloat191;
		Static303.aFloat121 = local8.aFloat191 * local12.aFloat192 + local8.aFloat196 * local12.aFloat193 + local8.aFloat190 * local12.aFloat191;
		Static376.aFloat153 = local12.aFloat198 * local8.aFloat196 + local12.aFloat196 * local8.aFloat190 + local8.aFloat191 * local12.aFloat199;
		Static389.aFloat156 = local12.aFloat191 * local8.aFloat200 + local8.aFloat198 * local12.aFloat193 + local8.aFloat193 * local12.aFloat192;
		Static474.aFloat180 = local12.aFloat199 * local8.aFloat193 + local12.aFloat196 * local8.aFloat200 + local12.aFloat198 * local8.aFloat198;
		Static504.aFloat183 = local12.aFloat201 * local8.aFloat192 + local12.aFloat200 * local8.aFloat199 + local8.aFloat201 * local12.aFloat190;
		Static178.aFloat54 = local12.aFloat191 * local8.aFloat201 + local12.aFloat193 * local8.aFloat199 + local12.aFloat192 * local8.aFloat192;
		Static436.aFloat175 = local12.aFloat190 * local8.aFloat200 + local8.aFloat198 * local12.aFloat200 + local8.aFloat193 * local12.aFloat201;
		@Pc(219) float local219 = local12.aFloat194 + local12.aFloat192 * local8.aFloat194 + local8.aFloat195 * local12.aFloat193 + local12.aFloat191 * local8.aFloat197;
		Static335.aFloat151 = local8.aFloat199 * local12.aFloat198 + local8.aFloat201 * local12.aFloat196 + local8.aFloat192 * local12.aFloat199;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass15_Sub2_8.anInt6545;
		@Pc(255) int local255 = this.aClass15_Sub2_8.anInt6529;
		if (!this.aBoolean483) {
			this.method4641();
		}
		Static15.anIntArray8[0] = this.anInt5596;
		Static160.anIntArray220[0] = this.anInt5635;
		Static592.anIntArray677[0] = this.anInt5606;
		Static15.anIntArray8[1] = this.anInt5619;
		Static160.anIntArray220[1] = this.anInt5635;
		Static15.anIntArray8[2] = this.anInt5596;
		Static592.anIntArray677[1] = this.anInt5606;
		Static160.anIntArray220[2] = this.anInt5637;
		Static15.anIntArray8[3] = this.anInt5619;
		Static592.anIntArray677[2] = this.anInt5606;
		Static160.anIntArray220[3] = this.anInt5637;
		Static592.anIntArray677[3] = this.anInt5606;
		Static15.anIntArray8[4] = this.anInt5596;
		Static160.anIntArray220[4] = this.anInt5635;
		Static15.anIntArray8[5] = this.anInt5619;
		Static592.anIntArray677[4] = this.anInt5663;
		Static160.anIntArray220[5] = this.anInt5635;
		Static15.anIntArray8[6] = this.anInt5596;
		Static592.anIntArray677[5] = this.anInt5663;
		Static160.anIntArray220[6] = this.anInt5637;
		Static592.anIntArray677[6] = this.anInt5663;
		Static15.anIntArray8[7] = this.anInt5619;
		Static160.anIntArray220[7] = this.anInt5637;
		Static592.anIntArray677[7] = this.anInt5663;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(400) float local400;
		@Pc(390) float local390;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static160.anIntArray220[local383];
			local395 = Static592.anIntArray677[local383];
			local400 = Static15.anIntArray8[local383];
			local414 = local400 * Static474.aFloat180 + Static376.aFloat153 * local390 + Static335.aFloat151 * local395 + local33;
			local428 = local219 + local400 * Static389.aFloat156 + local390 * Static303.aFloat121 + Static178.aFloat54 * local395;
			local442 = local54 + Static504.aFloat183 * local395 + Static81.aFloat21 * local390 + local400 * Static436.aFloat175;
			if (local428 >= (float) this.aClass15_Sub2_8.anInt6556) {
				@Pc(461) float local461 = (float) this.aClass15_Sub2_8.anInt6543 + local414 * (float) local251 / local428;
				@Pc(473) float local473 = (float) this.aClass15_Sub2_8.anInt6536 + local442 * (float) local255 / local428;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				if (local245 > local473) {
					local245 = local473;
				}
				local239 = true;
				if (local247 < local473) {
					local247 = local473;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt5602 > Static185.anIntArray262.length) {
				Static185.anIntArray262 = new int[this.anInt5602];
				Static591.anIntArray676 = new int[this.anInt5602];
			}
			@Pc(622) int local622;
			for (@Pc(548) int local548 = 0; local548 < this.anInt5624; local548++) {
				local390 = this.anIntArray335[local548];
				local400 = this.anIntArray337[local548];
				local395 = this.anIntArray338[local548];
				local428 = local219 + local390 * Static303.aFloat121 + local400 * Static389.aFloat156 + Static178.aFloat54 * local395;
				local414 = local395 * Static335.aFloat151 + Static474.aFloat180 * local400 + Static376.aFloat153 * local390 + local33;
				local442 = local54 + Static81.aFloat21 * local390 + local400 * Static436.aFloat175 + local395 * Static504.aFloat183;
				@Pc(629) int local629;
				@Pc(631) int local631;
				@Pc(640) int local640;
				if ((float) this.aClass15_Sub2_8.anInt6556 <= local428) {
					local622 = (int) ((float) local251 * local414 / local428 + (float) this.aClass15_Sub2_8.anInt6543);
					local629 = (int) ((float) local255 * local442 / local428 + (float) this.aClass15_Sub2_8.anInt6536);
					local631 = this.anIntArray336[local548];
					local640 = this.anIntArray336[local548 + 1];
					for (@Pc(698) int local698 = local631; local698 < local640; local698++) {
						@Pc(707) int local707 = this.aShortArray84[local698] - 1;
						if (local707 == -1) {
							break;
						}
						Static185.anIntArray262[local707] = local622;
						Static591.anIntArray676[local707] = local629;
					}
				} else {
					local622 = this.anIntArray336[local548];
					local629 = this.anIntArray336[local548 + 1];
					for (local631 = local622; local631 < local629; local631++) {
						local640 = this.aShortArray84[local631] - 1;
						if (local640 == -1) {
							break;
						}
						Static185.anIntArray262[this.aShortArray84[local631] - 1] = -999999;
					}
				}
			}
			for (local622 = 0; local622 < this.anInt5607; local622++) {
				if (Static185.anIntArray262[this.aShortArray81[local622]] != -999999 && Static185.anIntArray262[this.aShortArray85[local622]] != -999999 && Static185.anIntArray262[this.aShortArray76[local622]] != -999999 && this.method4647(arg0, Static185.anIntArray262[this.aShortArray81[local622]], Static185.anIntArray262[this.aShortArray85[local622]], Static185.anIntArray262[this.aShortArray76[local622]], Static591.anIntArray676[this.aShortArray76[local622]], arg1, Static591.anIntArray676[this.aShortArray81[local622]], Static591.anIntArray676[this.aShortArray85[local622]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7143(@OriginalArg(0) Class255 arg0) {
		@Pc(8) Class255_Sub3 local8 = (Class255_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass121Array4 != null) {
			for (local13 = 0; local13 < this.aClass121Array4.length; local13++) {
				@Pc(20) Class121 local20 = this.aClass121Array4[local13];
				@Pc(22) Class121 local22 = local20;
				if (local20.aClass121_1 != null) {
					local22 = local20.aClass121_1;
				}
				local22.anInt3501 = (int) (local8.aFloat196 * (float) this.anIntArray335[local20.anInt3496] + local8.aFloat198 * (float) this.anIntArray337[local20.anInt3496] + (float) this.anIntArray338[local20.anInt3496] * local8.aFloat199 + local8.aFloat195);
				local22.anInt3503 = (int) (local8.aFloat197 + local8.aFloat200 * (float) this.anIntArray337[local20.anInt3496] + (float) this.anIntArray335[local20.anInt3496] * local8.aFloat190 + (float) this.anIntArray338[local20.anInt3496] * local8.aFloat201);
				local22.anInt3497 = (int) (local8.aFloat194 + (float) this.anIntArray338[local20.anInt3496] * local8.aFloat192 + local8.aFloat193 * (float) this.anIntArray337[local20.anInt3496] + local8.aFloat191 * (float) this.anIntArray335[local20.anInt3496]);
				local22.anInt3511 = (int) (local8.aFloat198 * (float) this.anIntArray337[local20.anInt3505] + local8.aFloat196 * (float) this.anIntArray335[local20.anInt3505] + local8.aFloat199 * (float) this.anIntArray338[local20.anInt3505] + local8.aFloat195);
				local22.anInt3509 = (int) ((float) this.anIntArray338[local20.anInt3505] * local8.aFloat201 + (float) this.anIntArray337[local20.anInt3505] * local8.aFloat200 + local8.aFloat190 * (float) this.anIntArray335[local20.anInt3505] + local8.aFloat197);
				local22.anInt3506 = (int) (local8.aFloat194 + (float) this.anIntArray337[local20.anInt3505] * local8.aFloat193 + local8.aFloat191 * (float) this.anIntArray335[local20.anInt3505] + (float) this.anIntArray338[local20.anInt3505] * local8.aFloat192);
				local22.anInt3498 = (int) (local8.aFloat195 + (float) this.anIntArray338[local20.anInt3508] * local8.aFloat199 + local8.aFloat198 * (float) this.anIntArray337[local20.anInt3508] + local8.aFloat196 * (float) this.anIntArray335[local20.anInt3508]);
				local22.anInt3502 = (int) ((float) this.anIntArray337[local20.anInt3508] * local8.aFloat200 + (float) this.anIntArray335[local20.anInt3508] * local8.aFloat190 + local8.aFloat201 * (float) this.anIntArray338[local20.anInt3508] + local8.aFloat197);
				local22.anInt3499 = (int) (local8.aFloat193 * (float) this.anIntArray337[local20.anInt3508] + (float) this.anIntArray335[local20.anInt3508] * local8.aFloat191 + (float) this.anIntArray338[local20.anInt3508] * local8.aFloat192 + local8.aFloat194);
			}
		}
		if (this.aClass280Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass280Array4.length; local13++) {
			@Pc(365) Class280 local365 = this.aClass280Array4[local13];
			@Pc(367) Class280 local367 = local365;
			if (local365.aClass280_2 != null) {
				local367 = local365.aClass280_2;
			}
			if (local365.aClass255_7 == null) {
				local365.aClass255_7 = local8.method8170();
			} else {
				local365.aClass255_7.la(local8);
			}
			local367.anInt8550 = (int) (local8.aFloat195 + (float) this.anIntArray337[local365.anInt8557] * local8.aFloat198 + local8.aFloat196 * (float) this.anIntArray335[local365.anInt8557] + (float) this.anIntArray338[local365.anInt8557] * local8.aFloat199);
			local367.anInt8552 = (int) (local8.aFloat197 + (float) this.anIntArray337[local365.anInt8557] * local8.aFloat200 + (float) this.anIntArray335[local365.anInt8557] * local8.aFloat190 + (float) this.anIntArray338[local365.anInt8557] * local8.aFloat201);
			local367.anInt8555 = (int) (local8.aFloat192 * (float) this.anIntArray338[local365.anInt8557] + (float) this.anIntArray337[local365.anInt8557] * local8.aFloat193 + (float) this.anIntArray335[local365.anInt8557] * local8.aFloat191 + local8.aFloat194);
		}
	}

	@OriginalMember(owner = "client!kb", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort55 = (short) arg0;
		this.method4645();
		this.method4648();
	}

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort55;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Z")
	private boolean method4646() {
		if (this.aClass58_1.aBoolean154) {
			return true;
		}
		if (this.aClass58_1.anInterface20_1 == null) {
			this.aClass58_1.anInterface20_1 = this.aClass15_Sub2_8.method5489(this.aBoolean484);
		}
		@Pc(28) Interface20 local28 = this.aClass58_1.anInterface20_1;
		local28.method6240(this.anInt5615 * 6);
		@Pc(40) Buffer local40 = local28.method6243();
		if (local40 != null) {
			@Pc(56) Stream local56 = this.aClass15_Sub2_8.method5409(local40);
			@Pc(60) int local60;
			if (Stream.b()) {
				for (local60 = 0; local60 < this.anInt5615; local60++) {
					local56.f(this.aShortArray81[local60]);
					local56.f(this.aShortArray85[local60]);
					local56.f(this.aShortArray76[local60]);
				}
			} else {
				for (local60 = 0; local60 < this.anInt5615; local60++) {
					local56.d(this.aShortArray81[local60]);
					local56.d(this.aShortArray85[local60]);
					local56.d(this.aShortArray76[local60]);
				}
			}
			local56.a();
			if (local28.method6241()) {
				this.aClass58_1.anInterface20_2 = local28;
				this.aClass58_1.aBoolean154 = true;
				this.aBoolean482 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class2_Sub3.anIntArray620[arg0];
		@Pc(13) int local13 = Class2_Sub3.anIntArray621[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5624; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray337[local15] + local9 * this.anIntArray338[local15] >> 14;
			this.anIntArray338[local15] = this.anIntArray338[local15] * local13 - local9 * this.anIntArray337[local15] >> 14;
			this.anIntArray337[local15] = local33;
		}
		this.method4645();
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!q;Lclient!ht;II)V")
	@Override
	public void method7133(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5602 == 0) {
			return;
		}
		@Pc(13) Class255_Sub3 local13 = this.aClass15_Sub2_8.aClass255_Sub3_16;
		@Pc(16) Class255_Sub3 local16 = (Class255_Sub3) arg0;
		if (!this.aBoolean483) {
			this.method4641();
		}
		Static303.aFloat121 = local13.aFloat191 * local16.aFloat190 + local13.aFloat193 * local16.aFloat196 + local16.aFloat191 * local13.aFloat192;
		Static191.aFloat56 = local13.aFloat194 + local13.aFloat191 * local16.aFloat197 + local16.aFloat195 * local13.aFloat193 + local16.aFloat194 * local13.aFloat192;
		@Pc(69) float local69 = (float) this.anInt5635 * Static303.aFloat121 + Static191.aFloat56;
		@Pc(77) float local77 = Static303.aFloat121 * (float) this.anInt5637 + Static191.aFloat56;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local69 > local77) {
			local87 = local77 - (float) this.anInt5630;
			local93 = (float) this.anInt5630 + local69;
		} else {
			local87 = local69 - (float) this.anInt5630;
			local93 = (float) this.anInt5630 + local77;
		}
		if (this.aClass15_Sub2_8.aFloat127 <= local87 || local93 <= (float) this.aClass15_Sub2_8.anInt6556) {
			return;
		}
		Static90.aFloat24 = local16.aFloat194 * local13.aFloat199 + local13.aFloat196 * local16.aFloat197 + local13.aFloat198 * local16.aFloat195 + local13.aFloat195;
		Static376.aFloat153 = local13.aFloat196 * local16.aFloat190 + local16.aFloat196 * local13.aFloat198 + local16.aFloat191 * local13.aFloat199;
		@Pc(169) float local169 = Static90.aFloat24 + Static376.aFloat153 * (float) this.anInt5635;
		@Pc(177) float local177 = (float) this.anInt5637 * Static376.aFloat153 + Static90.aFloat24;
		@Pc(204) float local204;
		@Pc(192) float local192;
		if (local177 < local169) {
			local204 = ((float) -this.anInt5630 + local177) * (float) this.aClass15_Sub2_8.anInt6545;
			local192 = (local169 + (float) this.anInt5630) * (float) this.aClass15_Sub2_8.anInt6545;
		} else {
			local192 = (float) this.aClass15_Sub2_8.anInt6545 * (local177 + (float) this.anInt5630);
			local204 = ((float) -this.anInt5630 + local169) * (float) this.aClass15_Sub2_8.anInt6545;
		}
		if (this.aClass15_Sub2_8.aFloat132 <= local204 / (float) arg2 || local192 / (float) arg2 <= this.aClass15_Sub2_8.aFloat133) {
			return;
		}
		Static459.aFloat178 = local16.aFloat195 * local13.aFloat200 + local16.aFloat197 * local13.aFloat190 + local16.aFloat194 * local13.aFloat201 + local13.aFloat197;
		Static81.aFloat21 = local13.aFloat201 * local16.aFloat191 + local16.aFloat190 * local13.aFloat190 + local13.aFloat200 * local16.aFloat196;
		@Pc(296) float local296 = (float) this.anInt5635 * Static81.aFloat21 + Static459.aFloat178;
		@Pc(304) float local304 = Static459.aFloat178 + (float) this.anInt5637 * Static81.aFloat21;
		@Pc(319) float local319;
		@Pc(330) float local330;
		if (local304 < local296) {
			local319 = (float) this.aClass15_Sub2_8.anInt6529 * ((float) -this.anInt5630 + local304);
			local330 = (float) this.aClass15_Sub2_8.anInt6529 * ((float) this.anInt5630 + local296);
		} else {
			local319 = (float) this.aClass15_Sub2_8.anInt6529 * (local296 - (float) this.anInt5630);
			local330 = (float) this.aClass15_Sub2_8.anInt6529 * ((float) this.anInt5630 + local304);
		}
		if (this.aClass15_Sub2_8.aFloat129 <= local319 / (float) arg2 || this.aClass15_Sub2_8.aFloat135 >= local330 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass95Array1 != null) {
			Static178.aFloat54 = local13.aFloat192 * local16.aFloat192 + local13.aFloat191 * local16.aFloat201 + local16.aFloat199 * local13.aFloat193;
			Static504.aFloat183 = local16.aFloat201 * local13.aFloat190 + local16.aFloat199 * local13.aFloat200 + local16.aFloat192 * local13.aFloat201;
			Static335.aFloat151 = local16.aFloat199 * local13.aFloat198 + local16.aFloat201 * local13.aFloat196 + local13.aFloat199 * local16.aFloat192;
			Static474.aFloat180 = local13.aFloat199 * local16.aFloat193 + local13.aFloat198 * local16.aFloat198 + local13.aFloat196 * local16.aFloat200;
			Static389.aFloat156 = local16.aFloat193 * local13.aFloat192 + local16.aFloat198 * local13.aFloat193 + local13.aFloat191 * local16.aFloat200;
			Static436.aFloat175 = local13.aFloat201 * local16.aFloat193 + local13.aFloat190 * local16.aFloat200 + local13.aFloat200 * local16.aFloat198;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.anInt5619 + this.anInt5596 >> 1;
			@Pc(506) int local506 = this.anInt5663 + this.anInt5606 >> 1;
			@Pc(525) int local525 = (int) ((float) local506 * Static335.aFloat151 + (float) this.anInt5635 * Static376.aFloat153 + Static474.aFloat180 * (float) local498 + Static90.aFloat24);
			@Pc(544) int local544 = (int) ((float) local506 * Static504.aFloat183 + (float) local498 * Static436.aFloat175 + Static459.aFloat178 + Static81.aFloat21 * (float) this.anInt5635);
			@Pc(563) int local563 = (int) (Static303.aFloat121 * (float) this.anInt5635 + (float) local498 * Static389.aFloat156 + Static191.aFloat56 + Static178.aFloat54 * (float) local506);
			@Pc(582) int local582 = (int) ((float) local506 * Static335.aFloat151 + (float) local498 * Static474.aFloat180 + Static90.aFloat24 + (float) this.anInt5637 * Static376.aFloat153);
			@Pc(601) int local601 = (int) ((float) this.anInt5637 * Static81.aFloat21 + Static459.aFloat178 + (float) local498 * Static436.aFloat175 + Static504.aFloat183 * (float) local506);
			arg1.anInt3935 = this.aClass15_Sub2_8.anInt6536 + local601 * this.aClass15_Sub2_8.anInt6529 / arg2;
			@Pc(633) int local633 = (int) (Static303.aFloat121 * (float) this.anInt5637 + Static389.aFloat156 * (float) local498 + Static191.aFloat56 + (float) local506 * Static178.aFloat54);
			arg1.anInt3938 = this.aClass15_Sub2_8.anInt6543 + local582 * this.aClass15_Sub2_8.anInt6545 / arg2;
			arg1.anInt3936 = this.aClass15_Sub2_8.anInt6543 + local525 * this.aClass15_Sub2_8.anInt6545 / arg2;
			arg1.anInt3937 = local544 * this.aClass15_Sub2_8.anInt6529 / arg2 + this.aClass15_Sub2_8.anInt6536;
			if (this.aClass15_Sub2_8.anInt6556 > local563 && this.aClass15_Sub2_8.anInt6556 > local633) {
				arg1.aBoolean304 = true;
				arg1.anInt3934 = (this.anInt5630 + local525) * this.aClass15_Sub2_8.anInt6545 / arg2 + this.aClass15_Sub2_8.anInt6543 - arg1.anInt3936;
			}
		}
		this.aClass15_Sub2_8.method5366((float) arg2);
		this.aClass15_Sub2_8.method5397();
		this.aClass15_Sub2_8.method5411(local16);
		this.method4654();
		this.method4652();
	}

	@OriginalMember(owner = "client!kb", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean483) {
			this.method4641();
		}
		return this.anInt5637;
	}

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class3_Sub4_Sub2 Z(@OriginalArg(0) Class3_Sub4_Sub2 arg0) {
		if (this.anInt5602 == 0) {
			return null;
		}
		if (!this.aBoolean483) {
			this.method4641();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass15_Sub2_8.anInt6525 > 0) {
			local40 = this.anInt5596 - (this.anInt5637 * this.aClass15_Sub2_8.anInt6525 >> 8) >> this.aClass15_Sub2_8.anInt6526;
			local57 = this.anInt5619 - (this.aClass15_Sub2_8.anInt6525 * this.anInt5635 >> 8) >> this.aClass15_Sub2_8.anInt6526;
		} else {
			local40 = this.anInt5596 - (this.aClass15_Sub2_8.anInt6525 * this.anInt5635 >> 8) >> this.aClass15_Sub2_8.anInt6526;
			local57 = this.anInt5619 - (this.anInt5637 * this.aClass15_Sub2_8.anInt6525 >> 8) >> this.aClass15_Sub2_8.anInt6526;
		}
		@Pc(117) int local117;
		@Pc(134) int local134;
		if (this.aClass15_Sub2_8.anInt6527 > 0) {
			local117 = this.anInt5606 - (this.aClass15_Sub2_8.anInt6527 * this.anInt5637 >> 8) >> this.aClass15_Sub2_8.anInt6526;
			local134 = this.anInt5663 - (this.anInt5635 * this.aClass15_Sub2_8.anInt6527 >> 8) >> this.aClass15_Sub2_8.anInt6526;
		} else {
			local117 = this.anInt5606 - (this.aClass15_Sub2_8.anInt6527 * this.anInt5635 >> 8) >> this.aClass15_Sub2_8.anInt6526;
			local134 = this.anInt5663 - (this.anInt5637 * this.aClass15_Sub2_8.anInt6527 >> 8) >> this.aClass15_Sub2_8.anInt6526;
		}
		@Pc(176) int local176 = local57 + 1 - local40;
		@Pc(183) int local183 = local134 + 1 - local117;
		@Pc(186) Class3_Sub4_Sub2_Sub2 local186 = (Class3_Sub4_Sub2_Sub2) arg0;
		@Pc(196) Class3_Sub4_Sub2_Sub2 local196;
		if (local186 != null && local186.method2948(local183, local176)) {
			local196 = local186;
			local186.method2947();
		} else {
			local196 = new Class3_Sub4_Sub2_Sub2(this.aClass15_Sub2_8, local176, local183);
		}
		local196.method2951(local117, local134, local57, local40);
		this.method4643(local196);
		return local196;
	}

	@OriginalMember(owner = "client!kb", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass15_Sub2_8.anInterface4_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5607; local11++) {
			if (arg0 == this.aShortArray87[local11]) {
				this.aShortArray87[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class178 local48 = local9.method3088(arg0 & 0xFFFF);
			local37 = local48.aByte57;
			local35 = local48.aByte52;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class178 local69 = local9.method3088(arg1 & 0xFFFF);
			local56 = local69.aByte52;
			local58 = local69.aByte57;
		}
		if (!(local58 != local37 | local35 != local56)) {
			return;
		}
		if (this.aClass95Array1 != null) {
			for (@Pc(98) int local98 = 0; local98 < this.anInt5652; local98++) {
				@Pc(105) Class95 local105 = this.aClass95Array1[local98];
				@Pc(110) Class145 local110 = this.aClass145Array1[local98];
				local110.anInt3880 = local110.anInt3880 & 0xFF000000 | Static331.anIntArray442[this.aShortArray86[local105.anInt2936] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4651();
	}

	@OriginalMember(owner = "client!kb", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean483) {
			this.method4641();
		}
		@Pc(16) int local16 = this.anInt5596 + arg4;
		@Pc(21) int local21 = this.anInt5619 + arg4;
		@Pc(26) int local26 = this.anInt5606 + arg6;
		@Pc(31) int local31 = this.anInt5663 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt10458 + local21 >> arg2.anInt10463 >= arg2.anInt10461 || local26 < 0 || arg2.anInt10459 <= arg2.anInt10458 + local31 >> arg2.anInt10463)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt10458 + local21 >> arg3.anInt10463 >= arg3.anInt10461 || local26 < 0 || arg3.anInt10459 <= arg3.anInt10458 + local31 >> arg3.anInt10463) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10463;
			local21 = local21 + arg2.anInt10458 - 1 >> arg2.anInt10463;
			local26 >>= arg2.anInt10463;
			local31 = arg2.anInt10458 + local31 - 1 >> arg2.anInt10463;
			if (arg5 == arg2.JA(local16, local26) && arg5 == arg2.JA(local21, local26) && arg2.JA(local16, local31) == arg5 && arg2.JA(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(199) int local199;
		if (arg0 == 1) {
			for (local199 = 0; local199 < this.anInt5624; local199++) {
				this.anIntArray335[local199] = this.anIntArray335[local199] + arg2.sa(this.anIntArray337[local199] + arg4, arg6 + this.anIntArray338[local199]) - arg5;
			}
		} else {
			@Pc(246) int local246;
			@Pc(257) int local257;
			if (arg0 == 2) {
				local199 = this.anInt5635;
				if (local199 == 0) {
					return;
				}
				for (local246 = 0; local246 < this.anInt5624; local246++) {
					local257 = (this.anIntArray335[local246] << 16) / local199;
					if (local257 < arg1) {
						this.anIntArray335[local246] -= -((arg2.sa(this.anIntArray337[local246] + arg4, this.anIntArray338[local246] - -arg6) - arg5) * (-local257 + arg1) / arg1);
					}
				}
			} else {
				@Pc(394) int local394;
				if (arg0 == 3) {
					local199 = (arg1 & 0xFF) * 4;
					local246 = (arg1 >> 8 & 0xFF) * 4;
					local257 = (arg1 >> 16 & 0xFF) << 6;
					local394 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local199 >> 1) < 0 || arg2.anInt10458 + arg4 + (local199 >> 1) >= arg2.anInt10461 << arg2.anInt10463 || arg6 - (local246 >> 1) < 0 || (local246 >> 1) + (arg6 + arg2.anInt10458) >= arg2.anInt10459 << arg2.anInt10463) {
						return;
					}
					this.method7139(arg4, local257, local394, local199, local246, arg6, arg2, arg5);
				} else if (arg0 == 4) {
					local199 = this.anInt5637 - this.anInt5635;
					for (local246 = 0; local246 < this.anInt5624; local246++) {
						this.anIntArray335[local246] = this.anIntArray335[local246] + arg3.sa(arg4 + this.anIntArray337[local246], this.anIntArray338[local246] - -arg6) + local199 - arg5;
					}
				} else if (arg0 == 5) {
					local199 = this.anInt5637 - this.anInt5635;
					for (local246 = 0; local246 < this.anInt5624; local246++) {
						local257 = this.anIntArray337[local246] + arg4;
						local394 = arg6 + this.anIntArray338[local246];
						@Pc(399) int local399 = arg2.sa(local257, local394);
						@Pc(404) int local404 = arg3.sa(local257, local394);
						@Pc(409) int local409 = local399 - local404;
						this.anIntArray335[local246] = local399 + ((this.anIntArray335[local246] << 8) / local199 * local409 >> 8) - arg5;
					}
				}
			}
		}
		this.method4645();
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIIIIIII)Z")
	private boolean method4647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg6 && arg7 > arg5 && arg5 < arg4) {
			return false;
		} else if (arg5 > arg6 && arg5 > arg7 && arg4 < arg5) {
			return false;
		} else if (arg0 < arg1 && arg0 < arg2 && arg3 > arg0) {
			return false;
		} else {
			return arg0 <= arg1 || arg0 <= arg2 || arg0 <= arg3;
		}
	}

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean483) {
			this.method4641();
		}
		return this.anInt5663;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class21 method7131(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(34) Class21_Sub2 local34;
		@Pc(33) Class21_Sub2 local33;
		if (arg0 == 1) {
			local33 = this.aClass15_Sub2_8.aClass21_Sub2_22;
			local34 = this.aClass15_Sub2_8.aClass21_Sub2_23;
		} else if (arg0 == 2) {
			local33 = this.aClass15_Sub2_8.aClass21_Sub2_21;
			local34 = this.aClass15_Sub2_8.aClass21_Sub2_29;
		} else if (arg0 == 3) {
			local34 = this.aClass15_Sub2_8.aClass21_Sub2_30;
			local33 = this.aClass15_Sub2_8.aClass21_Sub2_28;
		} else if (arg0 == 4) {
			local33 = this.aClass15_Sub2_8.aClass21_Sub2_25;
			local34 = this.aClass15_Sub2_8.aClass21_Sub2_24;
		} else if (arg0 == 5) {
			local33 = this.aClass15_Sub2_8.aClass21_Sub2_27;
			local34 = this.aClass15_Sub2_8.aClass21_Sub2_26;
		} else {
			local34 = local33 = new Class21_Sub2(this.aClass15_Sub2_8, 0, 0, true, false);
		}
		return this.method4656(local34, arg1, local33, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean483) {
			this.method4641();
		}
		return this.anInt5619;
	}

	@OriginalMember(owner = "client!kb", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean483) {
			this.method4641();
		}
		return this.anInt5596;
	}

	@OriginalMember(owner = "client!kb", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class2_Sub3.anIntArray620[arg0];
		@Pc(13) int local13 = Class2_Sub3.anIntArray621[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5624; local15++) {
			@Pc(34) int local34 = this.anIntArray335[local15] * local13 - local9 * this.anIntArray338[local15] >> 14;
			this.anIntArray338[local15] = this.anIntArray338[local15] * local13 + local9 * this.anIntArray335[local15] >> 14;
			this.anIntArray335[local15] = local34;
		}
		this.method4645();
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
	private void method4648() {
		if ((this.anInt5651 & 0x37) == 0) {
			if (this.aClass344_1 != null) {
				this.aClass344_1.aBoolean833 = false;
			}
		} else if (this.aClass344_3 != null) {
			this.aClass344_3.aBoolean833 = false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean483) {
			this.method4641();
		}
		return this.anInt5630;
	}

	@OriginalMember(owner = "client!kb", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean483) {
			this.method4641();
		}
		return this.anInt5635;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()V")
	@Override
	public void method7142() {
		if (this.anInt5602 > 0 && this.anInt5615 > 0) {
			this.method4653();
			this.method4646();
			this.method4642();
		}
	}

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class2_Sub3.anIntArray620[arg0];
		@Pc(13) int local13 = Class2_Sub3.anIntArray621[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5624; local15++) {
			local33 = local9 * this.anIntArray338[local15] + this.anIntArray337[local15] * local13 >> 14;
			this.anIntArray338[local15] = local13 * this.anIntArray338[local15] - this.anIntArray337[local15] * local9 >> 14;
			this.anIntArray337[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5602; local33++) {
			@Pc(84) int local84 = this.aShortArray78[local33] * local9 + this.aShortArray77[local33] * local13 >> 14;
			this.aShortArray78[local33] = (short) (this.aShortArray78[local33] * local13 - local9 * this.aShortArray77[local33] >> 14);
			this.aShortArray77[local33] = (short) local84;
		}
		this.method4645();
		this.method4648();
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!kb", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean483) {
			this.method4641();
		}
		return this.anInt5606;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7147(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class21_Sub2 local8 = (Class21_Sub2) arg0;
		if (this.anInt5607 == 0 || local8.anInt5607 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt5624;
		@Pc(24) int[] local24 = local8.anIntArray337;
		@Pc(27) int[] local27 = local8.anIntArray335;
		@Pc(30) int[] local30 = local8.anIntArray338;
		@Pc(33) short[] local33 = local8.aShortArray77;
		@Pc(36) short[] local36 = local8.aShortArray80;
		@Pc(39) short[] local39 = local8.aShortArray78;
		@Pc(42) byte[] local42 = local8.aByteArray68;
		@Pc(51) short[] local51;
		@Pc(53) short[] local53;
		@Pc(47) short[] local47;
		@Pc(49) byte[] local49;
		if (this.aClass143_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local47 = this.aClass143_1.aShortArray63;
			local51 = this.aClass143_1.aShortArray65;
			local53 = this.aClass143_1.aShortArray64;
			local49 = this.aClass143_1.aByteArray55;
		}
		@Pc(82) short[] local82;
		@Pc(78) short[] local78;
		@Pc(90) short[] local90;
		@Pc(86) byte[] local86;
		if (local8.aClass143_1 == null) {
			local90 = null;
			local78 = null;
			local86 = null;
			local82 = null;
		} else {
			local78 = local8.aClass143_1.aShortArray64;
			local82 = local8.aClass143_1.aShortArray65;
			local86 = local8.aClass143_1.aByteArray55;
			local90 = local8.aClass143_1.aShortArray63;
		}
		@Pc(103) int[] local103 = local8.anIntArray336;
		@Pc(106) short[] local106 = local8.aShortArray84;
		if (!local8.aBoolean483) {
			local8.method4641();
		}
		@Pc(115) int local115 = local8.anInt5635;
		@Pc(118) int local118 = local8.anInt5637;
		@Pc(121) int local121 = local8.anInt5596;
		@Pc(124) int local124 = local8.anInt5619;
		@Pc(127) int local127 = local8.anInt5606;
		@Pc(130) int local130 = local8.anInt5663;
		for (@Pc(132) int local132 = 0; local132 < this.anInt5624; local132++) {
			@Pc(142) int local142 = this.anIntArray335[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(166) int local166 = this.anIntArray337[local132] - arg1;
				if (local166 >= local121 && local166 <= local124) {
					@Pc(181) int local181 = this.anIntArray338[local132] - arg3;
					if (local127 <= local181 && local130 >= local181) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray336[local132];
						@Pc(211) int local211 = this.anIntArray336[local132 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray84[local213] - 1;
							if (local199 == -1 || this.aByteArray68[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local21; local243++) {
								if (local166 == local24[local243] && local181 == local30[local243] && local142 == local27[local243]) {
									@Pc(270) int local270 = -1;
									local211 = local103[local243 + 1];
									local204 = local103[local243];
									for (@Pc(282) int local282 = local204; local282 < local211; local282++) {
										local270 = local106[local282] - 1;
										if (local270 == -1 || local42[local270] != 0) {
											break;
										}
									}
									if (local270 != -1) {
										if (local51 == null) {
											this.aClass143_1 = new Class143();
											local51 = this.aClass143_1.aShortArray65 = Static423.method6762(this.aShortArray77);
											local53 = this.aClass143_1.aShortArray64 = Static423.method6762(this.aShortArray80);
											local47 = this.aClass143_1.aShortArray63 = Static423.method6762(this.aShortArray78);
											local49 = this.aClass143_1.aByteArray55 = Static121.method3341(this.aByteArray68);
										}
										if (local82 == null) {
											@Pc(360) Class143 local360 = local8.aClass143_1 = new Class143();
											local82 = local360.aShortArray65 = Static423.method6762(local33);
											local78 = local360.aShortArray64 = Static423.method6762(local36);
											local90 = local360.aShortArray63 = Static423.method6762(local39);
											local86 = local360.aByteArray55 = Static121.method3341(local42);
										}
										@Pc(393) short local393 = this.aShortArray77[local199];
										@Pc(398) short local398 = this.aShortArray80[local199];
										@Pc(403) short local403 = this.aShortArray78[local199];
										@Pc(408) byte local408 = this.aByteArray68[local199];
										local211 = local103[local243 + 1];
										local204 = local103[local243];
										@Pc(428) int local428;
										for (@Pc(420) int local420 = local204; local420 < local211; local420++) {
											local428 = local106[local420] - 1;
											if (local428 == -1) {
												break;
											}
											if (local86[local428] != 0) {
												local82[local428] += local393;
												local78[local428] += local398;
												local90[local428] += local403;
												local86[local428] += local408;
											}
										}
										local403 = local39[local270];
										local408 = local42[local270];
										local398 = local36[local270];
										local211 = this.anIntArray336[local132 + 1];
										local393 = local33[local270];
										local204 = this.anIntArray336[local132];
										for (local428 = local204; local428 < local211; local428++) {
											@Pc(517) int local517 = this.aShortArray84[local428] - 1;
											if (local517 == -1) {
												break;
											}
											if (local49[local517] != 0) {
												local51[local517] += local393;
												local53[local517] += local398;
												local47[local517] += local403;
												local49[local517] += local408;
											}
										}
										local8.method4648();
										this.method4648();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.aShort54 = (short) arg0;
		this.method4651();
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()[Lclient!gi;")
	@Override
	public Class121[] method7138() {
		return this.aClass121Array4;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V")
	private void method4649() {
		if (this.aClass58_1 != null) {
			this.aClass58_1.aBoolean154 = false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
	private void method4651() {
		if (this.aClass344_1 != null) {
			this.aClass344_1.aBoolean833 = false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5607; local3++) {
			if (arg0 == this.aShortArray86[local3]) {
				this.aShortArray86[local3] = arg1;
			}
		}
		if (this.aClass95Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5652; local34++) {
				@Pc(41) Class95 local41 = this.aClass95Array1[local34];
				@Pc(46) Class145 local46 = this.aClass145Array1[local34];
				local46.anInt3880 = local46.anInt3880 & 0xFF000000 | Static331.anIntArray442[this.aShortArray86[local41.anInt2936] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4651();
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	private void method4652() {
		if (this.aClass95Array1 == null) {
			return;
		}
		@Pc(12) float local12 = this.aClass15_Sub2_8.method5382();
		@Pc(16) float local16 = this.aClass15_Sub2_8.method5438();
		this.aClass15_Sub2_8.method5336(false);
		this.aClass15_Sub2_8.method5403(false);
		this.aClass15_Sub2_8.method5444(1, Static531.aClass85_5);
		this.aClass15_Sub2_8.method5488(Static531.aClass85_5, 1);
		for (@Pc(39) int local39 = 0; local39 < this.anInt5652; local39++) {
			@Pc(46) Class95 local46 = this.aClass95Array1[local39];
			@Pc(51) Class145 local51 = this.aClass145Array1[local39];
			if (!local46.aBoolean227 || !this.aClass15_Sub2_8.method5325()) {
				@Pc(80) float local80 = (float) (this.anIntArray337[local46.anInt2943] + this.anIntArray337[local46.anInt2944] + this.anIntArray337[local46.anInt2937]) * 0.3333333F;
				@Pc(101) float local101 = (float) (this.anIntArray335[local46.anInt2944] + this.anIntArray335[local46.anInt2943] + this.anIntArray335[local46.anInt2937]) * 0.3333333F;
				@Pc(122) float local122 = (float) (this.anIntArray338[local46.anInt2937] + this.anIntArray338[local46.anInt2944] + this.anIntArray338[local46.anInt2943]) * 0.3333333F;
				@Pc(136) float local136 = Static90.aFloat24 + Static474.aFloat180 * local80 + Static376.aFloat153 * local101 + Static335.aFloat151 * local122;
				@Pc(150) float local150 = local122 * Static504.aFloat183 + Static81.aFloat21 * local101 + local80 * Static436.aFloat175 + Static459.aFloat178;
				@Pc(164) float local164 = local122 * Static178.aFloat54 + local80 * Static389.aFloat156 + Static303.aFloat121 * local101 + Static191.aFloat56;
				@Pc(169) Class255_Sub3 local169 = this.aClass15_Sub2_8.method5431();
				local169.method8025((float) local51.anInt3876 + local136, local51.anInt3872 * local46.aShort37 >> 7, local46.aShort36 * local51.anInt3882 >> 7, local51.anInt3878, local150 + (float) local51.anInt3879, local164);
				local169.method8032(this.aClass15_Sub2_8.aClass255_Sub3_17);
				this.aClass15_Sub2_8.method5445();
				this.aClass15_Sub2_8.ka(local16, local12 - (float) local46.anInt2939 * 1.5F);
				@Pc(224) int local224 = local51.anInt3880;
				this.aClass15_Sub2_8.method5359(false, false, local46.aShort35);
				this.aClass15_Sub2_8.method5460(local46.aByte27);
				this.aClass15_Sub2_8.method5487(local224);
				this.aClass15_Sub2_8.method5466();
			}
		}
		this.aClass15_Sub2_8.method5488(Static457.aClass85_4, 1);
		this.aClass15_Sub2_8.method5444(1, Static457.aClass85_4);
		this.aClass15_Sub2_8.ka(local16, local12);
		this.aClass15_Sub2_8.method5336(true);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)Z")
	private boolean method4653() {
		@Pc(13) boolean local13 = !this.aClass344_1.aBoolean833;
		@Pc(26) boolean local26 = (this.anInt5651 & 0x37) != 0 && !this.aClass344_3.aBoolean833;
		@Pc(34) boolean local34 = !this.aClass344_2.aBoolean833;
		@Pc(42) boolean local42 = !this.aClass344_4.aBoolean833;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface2 local73;
		@Pc(91) Buffer local91;
		if (local34) {
			if (this.aClass344_2.anInterface2_11 == null) {
				this.aClass344_2.anInterface2_11 = this.aClass15_Sub2_8.method5383(this.aBoolean484);
			}
			local73 = this.aClass344_2.anInterface2_11;
			local73.method5805(12, this.anInt5602 * 12);
			local91 = local73.method6243();
			if (local91 == null) {
				local54 = false;
			} else {
				this.aClass15_Sub2_8.aNativeInterface3.copyPositions(this.anIntArray337, this.anIntArray335, this.anIntArray338, this.aShortArray83, 0, 12, this.anInt5602, local91.getAddress());
				if (local73.method6241()) {
					this.aClass344_2.anInterface2_12 = local73;
					this.aClass344_2.aBoolean833 = true;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(206) short[] local206;
		@Pc(212) short[] local212;
		@Pc(215) short[] local215;
		@Pc(209) byte[] local209;
		if (local13) {
			if (this.aClass344_1.anInterface2_11 == null) {
				this.aClass344_1.anInterface2_11 = this.aClass15_Sub2_8.method5383(this.aBoolean484);
			}
			local73 = this.aClass344_1.anInterface2_11;
			local73.method5805(4, this.anInt5602 * 4);
			local91 = local73.method6243();
			if (local91 == null) {
				local54 = false;
			} else {
				if ((this.anInt5651 & 0x37) == 0) {
					if (this.aClass143_1 == null) {
						local206 = this.aShortArray77;
						local209 = this.aByteArray68;
						local212 = this.aShortArray80;
						local215 = this.aShortArray78;
					} else {
						local212 = this.aClass143_1.aShortArray64;
						local215 = this.aClass143_1.aShortArray63;
						local209 = this.aClass143_1.aByteArray55;
						local206 = this.aClass143_1.aShortArray65;
					}
					this.aClass15_Sub2_8.aNativeInterface3.copyLighting(this.aShortArray86, this.aByteArray67, this.aShortArray87, local206, local212, local215, local209, this.aShort54, this.aShort55, this.aShortArray82, 0, 4, this.anInt5602, local91.getAddress());
				} else {
					this.aClass15_Sub2_8.aNativeInterface3.copyColours(this.aShortArray86, this.aByteArray67, this.aShortArray87, this.aShort54, this.aShortArray82, 0, 4, this.anInt5602, local91.getAddress());
				}
				if (local73.method6241()) {
					this.aClass344_1.anInterface2_12 = local73;
					this.aClass344_1.aBoolean833 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass344_3.anInterface2_11 == null) {
				this.aClass344_3.anInterface2_11 = this.aClass15_Sub2_8.method5383(this.aBoolean484);
			}
			local73 = this.aClass344_3.anInterface2_11;
			local73.method5805(12, this.anInt5602 * 12);
			local91 = local73.method6243();
			if (local91 == null) {
				local54 = false;
			} else {
				if (this.aClass143_1 == null) {
					local212 = this.aShortArray80;
					local206 = this.aShortArray77;
					local215 = this.aShortArray78;
					local209 = this.aByteArray68;
				} else {
					local212 = this.aClass143_1.aShortArray64;
					local215 = this.aClass143_1.aShortArray63;
					local209 = this.aClass143_1.aByteArray55;
					local206 = this.aClass143_1.aShortArray65;
				}
				this.aClass15_Sub2_8.aNativeInterface3.copyNormals(local206, local212, local215, local209, 3.0F / (float) this.aShort55, 3.0F / (float) (this.aShort55 + this.aShort55 / 2), 0, 12, this.anInt5602, local91.getAddress());
				if (local73.method6241()) {
					this.aClass344_3.aBoolean833 = true;
					this.aClass344_3.anInterface2_12 = local73;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass344_4.anInterface2_11 == null) {
				this.aClass344_4.anInterface2_11 = this.aClass15_Sub2_8.method5383(this.aBoolean484);
			}
			local73 = this.aClass344_4.anInterface2_11;
			local73.method5805(8, this.anInt5602 * 8);
			local91 = local73.method6243();
			if (local91 == null) {
				local54 = false;
			} else {
				this.aClass15_Sub2_8.aNativeInterface3.copyTexCoords(this.aFloatArray45, this.aFloatArray46, 0, 8, this.anInt5602, local91.getAddress());
				if (local73.method6241()) {
					this.aClass344_4.anInterface2_12 = local73;
					this.aClass344_4.aBoolean833 = true;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!kb", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		if (this.aClass344_2 != null) {
			this.aClass344_2.aBoolean834 = Static132.method5408(this.anInt5651, arg0);
		}
		if (this.aClass344_4 != null) {
			this.aClass344_4.aBoolean834 = Static286.method8366(this.anInt5651, arg0);
		}
		if (this.aClass344_1 != null) {
			this.aClass344_1.aBoolean834 = Static141.method2863(this.anInt5651, arg0);
		}
		if (this.aClass344_3 != null) {
			this.aClass344_3.aBoolean834 = Static480.method7350(arg0, this.anInt5651);
		}
		this.anInt5654 = arg0;
		if (this.aClass143_1 != null && (this.anInt5654 & 0x10000) == 0) {
			this.aShortArray80 = this.aClass143_1.aShortArray64;
			this.aByteArray68 = this.aClass143_1.aByteArray55;
			this.aShortArray78 = this.aClass143_1.aShortArray63;
			this.aShortArray77 = this.aClass143_1.aShortArray65;
			this.aClass143_1 = null;
		}
		this.aBoolean482 = true;
		this.method4642();
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V")
	private void method4654() {
		if (this.anInt5615 == 0) {
			return;
		}
		if (this.method4653() && this.method4646()) {
			this.aClass15_Sub2_8.method5376(0, this.aClass344_2.anInterface2_12);
			this.aClass15_Sub2_8.method5376(1, this.aClass344_1.anInterface2_12);
			this.aClass15_Sub2_8.method5376(2, this.aClass344_4.anInterface2_12);
			@Pc(53) boolean local53;
			if ((this.anInt5651 & 0x37) == 0) {
				this.aClass15_Sub2_8.method5403(false);
				local53 = false;
				this.aClass15_Sub2_8.method5391(this.aClass15_Sub2_8.aClass142_17);
			} else {
				this.aClass15_Sub2_8.method5403(true);
				local53 = true;
				this.aClass15_Sub2_8.method5376(3, this.aClass344_3.anInterface2_12);
				this.aClass15_Sub2_8.method5391(this.aClass15_Sub2_8.aClass142_18);
			}
			for (@Pc(86) int local86 = 0; local86 < this.anIntArray334.length; local86++) {
				@Pc(93) int local93 = this.anIntArray341[local86];
				@Pc(100) int local100 = this.anIntArray341[local86 + 1];
				@Pc(107) int local107 = this.aShortArray87[local93] & 0xFFFF;
				if (local107 == 65535) {
					local107 = -1;
				}
				this.aClass15_Sub2_8.method5359(local53, true, local107);
				this.aClass15_Sub2_8.method5375(this.anIntArray334[local86], Static18.aClass32_2, local93 * 3, local100 - local93, this.anIntArray339[local86], this.aClass58_1.anInterface20_2);
			}
		}
		this.method4642();
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)V")
	public void method4655() {
		if (this.aClass344_2 != null) {
			this.aClass344_2.method8134();
		}
		if (this.aClass344_4 != null) {
			this.aClass344_4.method8134();
		}
		if (this.aClass344_1 != null) {
			this.aClass344_1.method8134();
		}
		if (this.aClass344_3 != null) {
			this.aClass344_3.method8134();
		}
		if (this.aClass58_1 != null) {
			this.aClass58_1.method1880();
		}
	}

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort54;
	}

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class2_Sub3.anIntArray620[arg0];
		@Pc(13) int local13 = Class2_Sub3.anIntArray621[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5624; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray335[local15] + local13 * this.anIntArray337[local15] >> 14;
			this.anIntArray335[local15] = local13 * this.anIntArray335[local15] - local9 * this.anIntArray337[local15] >> 14;
			this.anIntArray337[local15] = local34;
		}
		this.method4645();
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!kb;ILclient!kb;ZZZ)Lclient!ba;")
	private Class21 method4656(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21_Sub2 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt5652 = this.anInt5652;
		arg0.aShort55 = this.aShort55;
		arg0.aShort54 = this.aShort54;
		arg0.anInt5654 = arg1;
		arg0.anInt5602 = this.anInt5602;
		arg0.anInt5607 = this.anInt5607;
		arg0.anInt5615 = this.anInt5615;
		arg0.anInt5624 = this.anInt5624;
		arg0.anInt5651 = this.anInt5651;
		arg0.anInt5612 = this.anInt5612;
		@Pc(50) boolean local50 = Static102.method2184(arg1, this.anInt5651);
		@Pc(56) boolean local56 = Static109.method2277(this.anInt5651, arg1);
		@Pc(62) boolean local62 = Static14.method423(arg1, this.anInt5651);
		@Pc(68) boolean local68 = local62 | local50 | local56;
		@Pc(191) int local191;
		if (local68) {
			if (!local50) {
				arg0.anIntArray337 = this.anIntArray337;
			} else if (arg2.anIntArray337 == null || this.anInt5612 > arg2.anIntArray337.length) {
				arg0.anIntArray337 = arg2.anIntArray337 = new int[this.anInt5612];
			} else {
				arg0.anIntArray337 = arg2.anIntArray337;
			}
			if (!local56) {
				arg0.anIntArray335 = this.anIntArray335;
			} else if (arg2.anIntArray335 == null || this.anInt5612 > arg2.anIntArray335.length) {
				arg0.anIntArray335 = arg2.anIntArray335 = new int[this.anInt5612];
			} else {
				arg0.anIntArray335 = arg2.anIntArray335;
			}
			if (!local62) {
				arg0.anIntArray338 = this.anIntArray338;
			} else if (arg2.anIntArray338 == null || this.anInt5612 > arg2.anIntArray338.length) {
				arg0.anIntArray338 = arg2.anIntArray338 = new int[this.anInt5612];
			} else {
				arg0.anIntArray338 = arg2.anIntArray338;
			}
			for (local191 = 0; local191 < this.anInt5612; local191++) {
				if (local50) {
					arg0.anIntArray337[local191] = this.anIntArray337[local191];
				}
				if (local56) {
					arg0.anIntArray335[local191] = this.anIntArray335[local191];
				}
				if (local62) {
					arg0.anIntArray338[local191] = this.anIntArray338[local191];
				}
			}
		} else {
			arg0.anIntArray338 = this.anIntArray338;
			arg0.anIntArray337 = this.anIntArray337;
			arg0.anIntArray335 = this.anIntArray335;
		}
		if (Static132.method5408(this.anInt5651, arg1)) {
			arg0.aClass344_2 = arg2.aClass344_2;
			arg0.aClass344_2.anInterface2_12 = this.aClass344_2.anInterface2_12;
			arg0.aClass344_2.aBoolean834 = true;
			arg0.aClass344_2.aBoolean833 = this.aClass344_2.aBoolean833;
		} else if (Static2.method178(this.anInt5651, arg1)) {
			arg0.aClass344_2 = this.aClass344_2;
		} else {
			arg0.aClass344_2 = null;
		}
		if (Static474.method7272(this.anInt5651, arg1)) {
			if (arg2.aShortArray86 == null || this.anInt5607 > arg2.aShortArray86.length) {
				arg0.aShortArray86 = arg2.aShortArray86 = new short[this.anInt5607];
			} else {
				arg0.aShortArray86 = arg2.aShortArray86;
			}
			for (local191 = 0; local191 < this.anInt5607; local191++) {
				arg0.aShortArray86[local191] = this.aShortArray86[local191];
			}
		} else {
			arg0.aShortArray86 = this.aShortArray86;
		}
		if (Static335.method5787(arg1, this.anInt5651)) {
			if (arg2.aByteArray67 == null || arg2.aByteArray67.length < this.anInt5607) {
				arg0.aByteArray67 = arg2.aByteArray67 = new byte[this.anInt5607];
			} else {
				arg0.aByteArray67 = arg2.aByteArray67;
			}
			for (local191 = 0; local191 < this.anInt5607; local191++) {
				arg0.aByteArray67[local191] = this.aByteArray67[local191];
			}
		} else {
			arg0.aByteArray67 = this.aByteArray67;
		}
		if (Static141.method2863(this.anInt5651, arg1)) {
			arg0.aClass344_1 = arg2.aClass344_1;
			arg0.aClass344_1.aBoolean834 = true;
			arg0.aClass344_1.anInterface2_12 = this.aClass344_1.anInterface2_12;
			arg0.aClass344_1.aBoolean833 = this.aClass344_1.aBoolean833;
		} else if (Static351.method5860(arg1, this.anInt5651)) {
			arg0.aClass344_1 = this.aClass344_1;
		} else {
			arg0.aClass344_1 = null;
		}
		@Pc(516) int local516;
		if (Static196.method3327(this.anInt5651, arg1)) {
			if (arg2.aShortArray77 == null || arg2.aShortArray77.length < this.anInt5602) {
				local191 = this.anInt5602;
				arg0.aShortArray77 = arg2.aShortArray77 = new short[local191];
				arg0.aShortArray80 = arg2.aShortArray80 = new short[local191];
				arg0.aShortArray78 = arg2.aShortArray78 = new short[local191];
			} else {
				arg0.aShortArray78 = arg2.aShortArray78;
				arg0.aShortArray77 = arg2.aShortArray77;
				arg0.aShortArray80 = arg2.aShortArray80;
			}
			if (this.aClass143_1 == null) {
				arg0.aClass143_1 = null;
				for (local191 = 0; local191 < this.anInt5602; local191++) {
					arg0.aShortArray77[local191] = this.aShortArray77[local191];
					arg0.aShortArray80[local191] = this.aShortArray80[local191];
					arg0.aShortArray78[local191] = this.aShortArray78[local191];
				}
			} else {
				if (arg2.aClass143_1 == null) {
					arg2.aClass143_1 = new Class143();
				}
				@Pc(500) Class143 local500 = arg0.aClass143_1 = arg2.aClass143_1;
				if (local500.aShortArray65 == null || this.anInt5602 > local500.aShortArray65.length) {
					local516 = this.anInt5602;
					local500.aShortArray63 = new short[local516];
					local500.aByteArray55 = new byte[local516];
					local500.aShortArray64 = new short[local516];
					local500.aShortArray65 = new short[local516];
				}
				for (local516 = 0; local516 < this.anInt5602; local516++) {
					arg0.aShortArray77[local516] = this.aShortArray77[local516];
					arg0.aShortArray80[local516] = this.aShortArray80[local516];
					arg0.aShortArray78[local516] = this.aShortArray78[local516];
					local500.aShortArray65[local516] = this.aClass143_1.aShortArray65[local516];
					local500.aShortArray64[local516] = this.aClass143_1.aShortArray64[local516];
					local500.aShortArray63[local516] = this.aClass143_1.aShortArray63[local516];
					local500.aByteArray55[local516] = this.aClass143_1.aByteArray55[local516];
				}
			}
			arg0.aByteArray68 = this.aByteArray68;
		} else {
			arg0.aShortArray77 = this.aShortArray77;
			arg0.aClass143_1 = this.aClass143_1;
			arg0.aByteArray68 = this.aByteArray68;
			arg0.aShortArray80 = this.aShortArray80;
			arg0.aShortArray78 = this.aShortArray78;
		}
		if (Static480.method7350(arg1, this.anInt5651)) {
			arg0.aClass344_3 = arg2.aClass344_3;
			arg0.aClass344_3.aBoolean833 = this.aClass344_3.aBoolean833;
			arg0.aClass344_3.anInterface2_12 = this.aClass344_3.anInterface2_12;
			arg0.aClass344_3.aBoolean834 = true;
		} else if (Static89.method2060(this.anInt5651, arg1)) {
			arg0.aClass344_3 = this.aClass344_3;
		} else {
			arg0.aClass344_3 = null;
		}
		if (Static480.method7351(this.anInt5651, arg1)) {
			if (arg2.aFloatArray45 == null || arg2.aFloatArray45.length < this.anInt5607) {
				local191 = this.anInt5602;
				arg0.aFloatArray46 = arg2.aFloatArray46 = new float[local191];
				arg0.aFloatArray45 = arg2.aFloatArray45 = new float[local191];
			} else {
				arg0.aFloatArray45 = arg2.aFloatArray45;
				arg0.aFloatArray46 = arg2.aFloatArray46;
			}
			for (local191 = 0; local191 < this.anInt5602; local191++) {
				arg0.aFloatArray45[local191] = this.aFloatArray45[local191];
				arg0.aFloatArray46[local191] = this.aFloatArray46[local191];
			}
		} else {
			arg0.aFloatArray45 = this.aFloatArray45;
			arg0.aFloatArray46 = this.aFloatArray46;
		}
		if (Static286.method8366(this.anInt5651, arg1)) {
			arg0.aClass344_4 = arg2.aClass344_4;
			arg0.aClass344_4.anInterface2_12 = this.aClass344_4.anInterface2_12;
			arg0.aClass344_4.aBoolean834 = true;
			arg0.aClass344_4.aBoolean833 = this.aClass344_4.aBoolean833;
		} else if (Static202.method3383(this.anInt5651, arg1)) {
			arg0.aClass344_4 = this.aClass344_4;
		} else {
			arg0.aClass344_4 = null;
		}
		if (Static434.method6852(this.anInt5651, arg1)) {
			if (arg2.aShortArray81 == null || arg2.aShortArray81.length < this.anInt5607) {
				local191 = this.anInt5607;
				arg0.aShortArray85 = arg2.aShortArray85 = new short[local191];
				arg0.aShortArray81 = arg2.aShortArray81 = new short[local191];
				arg0.aShortArray76 = arg2.aShortArray76 = new short[local191];
			} else {
				arg0.aShortArray85 = arg2.aShortArray85;
				arg0.aShortArray81 = arg2.aShortArray81;
				arg0.aShortArray76 = arg2.aShortArray76;
			}
			for (local191 = 0; local191 < this.anInt5607; local191++) {
				arg0.aShortArray81[local191] = this.aShortArray81[local191];
				arg0.aShortArray85[local191] = this.aShortArray85[local191];
				arg0.aShortArray76[local191] = this.aShortArray76[local191];
			}
		} else {
			arg0.aShortArray76 = this.aShortArray76;
			arg0.aShortArray85 = this.aShortArray85;
			arg0.aShortArray81 = this.aShortArray81;
		}
		if (Static577.method8260(arg1, this.anInt5651)) {
			arg0.aClass58_1 = arg2.aClass58_1;
			arg0.aClass58_1.aBoolean155 = true;
			arg0.aClass58_1.aBoolean154 = this.aClass58_1.aBoolean154;
			arg0.aClass58_1.anInterface20_2 = this.aClass58_1.anInterface20_2;
		} else if (Static213.method3730(this.anInt5651, arg1)) {
			arg0.aClass58_1 = this.aClass58_1;
		} else {
			arg0.aClass58_1 = null;
		}
		if (Static449.method7006(this.anInt5651, arg1)) {
			if (arg2.aShortArray87 == null || this.anInt5607 > arg2.aShortArray87.length) {
				local191 = this.anInt5607;
				arg0.aShortArray87 = arg2.aShortArray87 = new short[local191];
			} else {
				arg0.aShortArray87 = arg2.aShortArray87;
			}
			for (local191 = 0; local191 < this.anInt5607; local191++) {
				arg0.aShortArray87[local191] = this.aShortArray87[local191];
			}
		} else {
			arg0.aShortArray87 = this.aShortArray87;
		}
		if (!Static467.method7183(arg1, this.anInt5651)) {
			arg0.aClass145Array1 = this.aClass145Array1;
		} else if (arg2.aClass145Array1 == null || this.anInt5652 > arg2.aClass145Array1.length) {
			local191 = this.anInt5652;
			arg0.aClass145Array1 = arg2.aClass145Array1 = new Class145[local191];
			for (local516 = 0; local516 < this.anInt5652; local516++) {
				arg0.aClass145Array1[local516] = this.aClass145Array1[local516].method3351();
			}
		} else {
			arg0.aClass145Array1 = arg2.aClass145Array1;
			for (local191 = 0; local191 < this.anInt5652; local191++) {
				arg0.aClass145Array1[local191].method3348(this.aClass145Array1[local191]);
			}
		}
		arg0.anIntArrayArray43 = this.anIntArrayArray43;
		arg0.anIntArray339 = this.anIntArray339;
		arg0.aClass280Array4 = this.aClass280Array4;
		arg0.anIntArrayArray42 = this.anIntArrayArray42;
		arg0.aShortArray79 = this.aShortArray79;
		arg0.anIntArray341 = this.anIntArray341;
		arg0.anIntArray334 = this.anIntArray334;
		if (this.aBoolean483) {
			arg0.aBoolean483 = true;
			arg0.anInt5596 = this.anInt5596;
			arg0.anInt5619 = this.anInt5619;
			arg0.anInt5635 = this.anInt5635;
			arg0.anInt5630 = this.anInt5630;
			arg0.anInt5637 = this.anInt5637;
			arg0.anInt5606 = this.anInt5606;
			arg0.anInt5663 = this.anInt5663;
		} else {
			arg0.aBoolean483 = false;
		}
		arg0.aShortArray82 = this.aShortArray82;
		arg0.aClass121Array4 = this.aClass121Array4;
		arg0.aClass95Array1 = this.aClass95Array1;
		arg0.aShortArray83 = this.aShortArray83;
		arg0.lb = this.lb;
		arg0.aShortArray84 = this.aShortArray84;
		arg0.anIntArray336 = this.anIntArray336;
		arg0.anIntArrayArray44 = this.anIntArrayArray44;
		return arg0;
	}

	@OriginalMember(owner = "client!kb", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static172.anInt8688 = 0;
			Static289.anInt6781 = 0;
			Static569.anInt10061 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray43.length > local38) {
					local52 = this.anIntArrayArray43[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray79 == null || (this.aShortArray79[local60] & arg6) != 0) {
							Static289.anInt6781 += this.anIntArray337[local60];
							Static172.anInt8688 += this.anIntArray335[local60];
							local30++;
							Static569.anInt10061 += this.anIntArray338[local60];
						}
					}
				}
			}
			if (local30 > 0) {
				Static569.anInt10061 = Static569.anInt10061 / local30 + arg4;
				Static172.anInt8688 = arg3 + Static172.anInt8688 / local30;
				Static119.aBoolean215 = true;
				Static289.anInt6781 = arg2 + Static289.anInt6781 / local30;
			} else {
				Static172.anInt8688 = arg3;
				Static289.anInt6781 = arg2;
				Static569.anInt10061 = arg4;
			}
			return;
		}
		@Pc(255) int[] local255;
		@Pc(257) int local257;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg3 * arg7[1] + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg2 * arg7[3] + arg7[4] * arg3 + 8192 >> 14;
				local38 = arg7[6] * arg2 + arg7[7] * arg3 + arg4 * arg7[8] + 8192 >> 14;
				arg2 = local30;
				arg4 = local38;
				arg3 = local32;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray43.length) {
					local255 = this.anIntArrayArray43[local32];
					for (local257 = 0; local257 < local255.length; local257++) {
						local54 = local255[local257];
						if (this.aShortArray79 == null || (this.aShortArray79[local54] & arg6) != 0) {
							this.anIntArray337[local54] += arg2;
							this.anIntArray335[local54] += arg3;
							this.anIntArray338[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(386) int local386;
		@Pc(409) int local409;
		@Pc(436) int local436;
		@Pc(467) int local467;
		@Pc(471) int local471;
		@Pc(475) int local475;
		@Pc(479) int local479;
		@Pc(487) int local487;
		@Pc(495) int local495;
		@Pc(649) int local649;
		@Pc(674) int local674;
		@Pc(678) int local678;
		@Pc(686) int local686;
		@Pc(691) int local691;
		@Pc(695) int local695;
		@Pc(699) int local699;
		@Pc(701) int local701;
		@Pc(831) int[] local831;
		@Pc(833) int local833;
		@Pc(837) int local837;
		@Pc(841) int local841;
		@Pc(843) int local843;
		@Pc(970) int local970;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray43.length) {
						local255 = this.anIntArrayArray43[local32];
						for (local257 = 0; local257 < local255.length; local257++) {
							local54 = local255[local257];
							if (this.aShortArray79 == null || (this.aShortArray79[local54] & arg6) != 0) {
								this.anIntArray337[local54] -= Static289.anInt6781;
								this.anIntArray335[local54] -= Static172.anInt8688;
								this.anIntArray338[local54] -= Static569.anInt10061;
								if (arg4 != 0) {
									local60 = Class2_Sub3.anIntArray620[arg4];
									local386 = Class2_Sub3.anIntArray621[arg4];
									local409 = local386 * this.anIntArray337[local54] + this.anIntArray335[local54] * local60 + 16383 >> 14;
									this.anIntArray335[local54] = local386 * this.anIntArray335[local54] + 16383 - local60 * this.anIntArray337[local54] >> 14;
									this.anIntArray337[local54] = local409;
								}
								if (arg2 != 0) {
									local60 = Class2_Sub3.anIntArray620[arg2];
									local386 = Class2_Sub3.anIntArray621[arg2];
									local409 = local386 * this.anIntArray335[local54] + 16383 - this.anIntArray338[local54] * local60 >> 14;
									this.anIntArray338[local54] = this.anIntArray338[local54] * local386 + local60 * this.anIntArray335[local54] + 16383 >> 14;
									this.anIntArray335[local54] = local409;
								}
								if (arg3 != 0) {
									local60 = Class2_Sub3.anIntArray620[arg3];
									local386 = Class2_Sub3.anIntArray621[arg3];
									local409 = local386 * this.anIntArray337[local54] + local60 * this.anIntArray338[local54] + 16383 >> 14;
									this.anIntArray338[local54] = local386 * this.anIntArray338[local54] + 16383 - local60 * this.anIntArray337[local54] >> 14;
									this.anIntArray337[local54] = local409;
								}
								this.anIntArray337[local54] += Static289.anInt6781;
								this.anIntArray335[local54] += Static172.anInt8688;
								this.anIntArray338[local54] += Static569.anInt10061;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray43.length > local38) {
							local52 = this.anIntArrayArray43[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray79 == null || (this.aShortArray79[local60] & arg6) != 0) {
									local386 = this.anIntArray336[local60];
									local409 = this.anIntArray336[local60 + 1];
									for (local436 = local386; local436 < local409; local436++) {
										local467 = this.aShortArray84[local436] - 1;
										if (local467 == -1) {
											break;
										}
										if (arg4 != 0) {
											local471 = Class2_Sub3.anIntArray620[arg4];
											local475 = Class2_Sub3.anIntArray621[arg4];
											local479 = local471 * this.aShortArray80[local467] + local475 * this.aShortArray77[local467] + 16383 >> 14;
											this.aShortArray80[local467] = (short) (this.aShortArray80[local467] * local475 + 16383 - local471 * this.aShortArray77[local467] >> 14);
											this.aShortArray77[local467] = (short) local479;
										}
										if (arg2 != 0) {
											local471 = Class2_Sub3.anIntArray620[arg2];
											local475 = Class2_Sub3.anIntArray621[arg2];
											local479 = local475 * this.aShortArray80[local467] + 16383 - local471 * this.aShortArray78[local467] >> 14;
											this.aShortArray78[local467] = (short) (this.aShortArray78[local467] * local475 + this.aShortArray80[local467] * local471 + 16383 >> 14);
											this.aShortArray80[local467] = (short) local479;
										}
										if (arg3 != 0) {
											local471 = Class2_Sub3.anIntArray620[arg3];
											local475 = Class2_Sub3.anIntArray621[arg3];
											local479 = local475 * this.aShortArray77[local467] + this.aShortArray78[local467] * local471 + 16383 >> 14;
											this.aShortArray78[local467] = (short) (this.aShortArray78[local467] * local475 + 16383 - this.aShortArray77[local467] * local471 >> 14);
											this.aShortArray77[local467] = (short) local479;
										}
									}
								}
							}
						}
					}
					this.method4648();
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local257 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static119.aBoolean215) {
					local386 = arg7[6] * Static569.anInt10061 + arg7[0] * Static289.anInt6781 + arg7[3] * Static172.anInt8688 + 8192 >> 14;
					local409 = Static289.anInt6781 * arg7[1] + arg7[4] * Static172.anInt8688 + Static569.anInt10061 * arg7[7] + 8192 >> 14;
					local386 += local257;
					local436 = Static289.anInt6781 * arg7[2] + arg7[5] * Static172.anInt8688 + Static569.anInt10061 * arg7[8] + 8192 >> 14;
					local409 += local54;
					Static289.anInt6781 = local386;
					local436 += local60;
					Static172.anInt8688 = local409;
					Static119.aBoolean215 = false;
					Static569.anInt10061 = local436;
				}
				@Pc(455) int[] local455 = new int[9];
				local409 = Class2_Sub3.anIntArray621[arg2];
				local436 = Class2_Sub3.anIntArray620[arg2];
				local467 = Class2_Sub3.anIntArray621[arg3];
				local471 = Class2_Sub3.anIntArray620[arg3];
				local475 = Class2_Sub3.anIntArray621[arg4];
				local479 = Class2_Sub3.anIntArray620[arg4];
				local487 = local475 * local436 + 8192 >> 14;
				local495 = local479 * local436 + 8192 >> 14;
				local455[5] = -local436;
				local455[7] = local487 * local467 + local471 * local479 + 8192 >> 14;
				local455[3] = local409 * local479 + 8192 >> 14;
				local455[4] = local475 * local409 + 8192 >> 14;
				local455[1] = local479 * -local467 + local471 * local487 + 8192 >> 14;
				local455[2] = local409 * local471 + 8192 >> 14;
				local455[6] = local475 * -local471 + local495 * local467 + 8192 >> 14;
				local455[0] = local495 * local471 + local467 * local475 + 8192 >> 14;
				local455[8] = local467 * local409 + 8192 >> 14;
				@Pc(624) int local624 = local455[1] * -Static172.anInt8688 + -Static289.anInt6781 * local455[0] + local455[2] * -Static569.anInt10061 + 8192 >> 14;
				local649 = -Static289.anInt6781 * local455[3] + -Static172.anInt8688 * local455[4] + -Static569.anInt10061 * local455[5] + 8192 >> 14;
				local674 = local455[8] * -Static569.anInt10061 + -Static172.anInt8688 * local455[7] + -Static289.anInt6781 * local455[6] + 8192 >> 14;
				local678 = local624 + Static289.anInt6781;
				@Pc(682) int local682 = local649 + Static172.anInt8688;
				local686 = local674 + Static569.anInt10061;
				@Pc(689) int[] local689 = new int[9];
				for (local691 = 0; local691 < 3; local691++) {
					for (local695 = 0; local695 < 3; local695++) {
						local699 = 0;
						for (local701 = 0; local701 < 3; local701++) {
							local699 += arg7[local701 + local695 * 3] * local455[local691 * 3 + local701];
						}
						local689[local691 * 3 + local695] = local699 + 8192 >> 14;
					}
				}
				local695 = local455[2] * local60 + local257 * local455[0] + local54 * local455[1] + 8192 >> 14;
				local699 = local455[5] * local60 + local455[3] * local257 + local54 * local455[4] + 8192 >> 14;
				local695 += local678;
				local699 += local682;
				local701 = local60 * local455[8] + local455[7] * local54 + local455[6] * local257 + 8192 >> 14;
				local701 += local686;
				local831 = new int[9];
				for (local833 = 0; local833 < 3; local833++) {
					for (local837 = 0; local837 < 3; local837++) {
						local841 = 0;
						for (local843 = 0; local843 < 3; local843++) {
							local841 += local689[local837 + local843 * 3] * arg7[local843 + local833 * 3];
						}
						local831[local837 + local833 * 3] = local841 + 8192 >> 14;
					}
				}
				local837 = local701 * arg7[2] + local699 * arg7[1] + local695 * arg7[0] + 8192 >> 14;
				local841 = local699 * arg7[4] + local695 * arg7[3] + local701 * arg7[5] + 8192 >> 14;
				local841 += local32;
				local843 = local699 * arg7[7] + local695 * arg7[6] + arg7[8] * local701 + 8192 >> 14;
				local837 += local30;
				local843 += local38;
				for (local970 = 0; local970 < local8; local970++) {
					@Pc(976) int local976 = arg1[local970];
					if (this.anIntArrayArray43.length > local976) {
						@Pc(990) int[] local990 = this.anIntArrayArray43[local976];
						for (@Pc(992) int local992 = 0; local992 < local990.length; local992++) {
							@Pc(998) int local998 = local990[local992];
							if (this.aShortArray79 == null || (arg6 & this.aShortArray79[local998]) != 0) {
								@Pc(1043) int local1043 = local831[2] * this.anIntArray338[local998] + local831[0] * this.anIntArray337[local998] + local831[1] * this.anIntArray335[local998] + 8192 >> 14;
								@Pc(1074) int local1074 = local831[5] * this.anIntArray338[local998] + this.anIntArray337[local998] * local831[3] + this.anIntArray335[local998] * local831[4] + 8192 >> 14;
								@Pc(1105) int local1105 = this.anIntArray338[local998] * local831[8] + local831[7] * this.anIntArray335[local998] + local831[6] * this.anIntArray337[local998] + 8192 >> 14;
								@Pc(1109) int local1109 = local1074 + local841;
								@Pc(1113) int local1113 = local1043 + local837;
								this.anIntArray337[local998] = local1113;
								@Pc(1122) int local1122 = local1105 + local843;
								this.anIntArray335[local998] = local1109;
								this.anIntArray338[local998] = local1122;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2594) Class145 local2594;
			@Pc(2473) boolean local2473;
			@Pc(2589) Class95 local2589;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					local2473 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray42.length) {
							local52 = this.anIntArrayArray42[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.lb == null || (this.lb[local60] & arg6) != 0) {
									local386 = arg2 * 8 + (this.aByteArray67[local60] & 0xFF);
									if (local386 < 0) {
										local386 = 0;
									} else if (local386 > 255) {
										local386 = 255;
									}
									this.aByteArray67[local60] = (byte) local386;
								}
							}
							local2473 |= local52.length > 0;
						}
					}
					if (local2473) {
						if (this.aClass95Array1 != null) {
							for (local38 = 0; local38 < this.anInt5652; local38++) {
								local2589 = this.aClass95Array1[local38];
								local2594 = this.aClass145Array1[local38];
								local2594.anInt3880 = 255 - (this.aByteArray67[local2589.anInt2936] & 0xFF) << 24 | local2594.anInt3880 & 0xFFFFFF;
							}
						}
						this.method4651();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray42 != null) {
					local2473 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray42.length) {
							local52 = this.anIntArrayArray42[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.lb == null || (arg6 & this.lb[local60]) != 0) {
									local386 = this.aShortArray86[local60] & 0xFFFF;
									local409 = local386 >> 10 & 0x3F;
									local436 = local386 >> 7 & 0x7;
									local467 = local386 & 0x7F;
									@Pc(2698) int local2698 = arg2 + local409 & 0x3F;
									local436 += arg3 / 4;
									local467 += arg4;
									if (local436 < 0) {
										local436 = 0;
									} else if (local436 > 7) {
										local436 = 7;
									}
									if (local467 < 0) {
										local467 = 0;
									} else if (local467 > 127) {
										local467 = 127;
									}
									this.aShortArray86[local60] = (short) (local467 | local436 << 7 | local2698 << 10);
								}
							}
							local2473 |= local52.length > 0;
						}
					}
					if (local2473) {
						if (this.aClass95Array1 != null) {
							for (local38 = 0; local38 < this.anInt5652; local38++) {
								local2589 = this.aClass95Array1[local38];
								local2594 = this.aClass145Array1[local38];
								local2594.anInt3880 = Static331.anIntArray442[this.aShortArray86[local2589.anInt2936] & 0xFFFF] & 0xFFFFFF | local2594.anInt3880 & 0xFF000000;
							}
						}
						this.method4651();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray44 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray44.length > local32) {
							local255 = this.anIntArrayArray44[local32];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2594 = this.aClass145Array1[local255[local257]];
								local2594.anInt3876 += arg2;
								local2594.anInt3879 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray44 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray44.length > local32) {
							local255 = this.anIntArrayArray44[local32];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2594 = this.aClass145Array1[local255[local257]];
								local2594.anInt3872 = local2594.anInt3872 * arg3 >> 7;
								local2594.anInt3882 = local2594.anInt3882 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray44.length) {
						local255 = this.anIntArrayArray44[local32];
						for (local257 = 0; local257 < local255.length; local257++) {
							local2594 = this.aClass145Array1[local255[local257]];
							local2594.anInt3878 = arg2 + local2594.anInt3878 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray43.length > local32) {
					local255 = this.anIntArrayArray43[local32];
					for (local257 = 0; local257 < local255.length; local257++) {
						local54 = local255[local257];
						if (this.aShortArray79 == null || (arg6 & this.aShortArray79[local54]) != 0) {
							this.anIntArray337[local54] -= Static289.anInt6781;
							this.anIntArray335[local54] -= Static172.anInt8688;
							this.anIntArray338[local54] -= Static569.anInt10061;
							this.anIntArray337[local54] = arg2 * this.anIntArray337[local54] >> 7;
							this.anIntArray335[local54] = arg3 * this.anIntArray335[local54] >> 7;
							this.anIntArray338[local54] = arg4 * this.anIntArray338[local54] >> 7;
							this.anIntArray337[local54] += Static289.anInt6781;
							this.anIntArray335[local54] += Static172.anInt8688;
							this.anIntArray338[local54] += Static569.anInt10061;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local257 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static119.aBoolean215) {
				local386 = Static172.anInt8688 * arg7[3] + Static289.anInt6781 * arg7[0] + arg7[6] * Static569.anInt10061 + 8192 >> 14;
				local409 = Static569.anInt10061 * arg7[7] + Static289.anInt6781 * arg7[1] + Static172.anInt8688 * arg7[4] + 8192 >> 14;
				local386 += local257;
				local409 += local54;
				local436 = arg7[8] * Static569.anInt10061 + arg7[2] * Static289.anInt6781 + Static172.anInt8688 * arg7[5] + 8192 >> 14;
				Static289.anInt6781 = local386;
				Static172.anInt8688 = local409;
				local436 += local60;
				Static119.aBoolean215 = false;
				Static569.anInt10061 = local436;
			}
			local386 = arg2 << 15 >> 7;
			local409 = arg3 << 15 >> 7;
			local436 = arg4 << 15 >> 7;
			local467 = -Static289.anInt6781 * local386 + 8192 >> 14;
			local471 = local409 * -Static172.anInt8688 + 8192 >> 14;
			local475 = -Static569.anInt10061 * local436 + 8192 >> 14;
			local479 = Static289.anInt6781 + local467;
			local487 = Static172.anInt8688 + local471;
			local495 = local475 + Static569.anInt10061;
			@Pc(1875) int[] local1875 = new int[] { arg7[0] * local386 + 8192 >> 14, local386 * arg7[3] + 8192 >> 14, arg7[6] * local386 + 8192 >> 14, local409 * arg7[1] + 8192 >> 14, arg7[4] * local409 + 8192 >> 14, local409 * arg7[7] + 8192 >> 14, arg7[2] * local436 + 8192 >> 14, arg7[5] * local436 + 8192 >> 14, arg7[8] * local436 + 8192 >> 14 };
			local649 = local386 * local257 + 8192 >> 14;
			local674 = local54 * local409 + 8192 >> 14;
			local678 = local436 * local60 + 8192 >> 14;
			@Pc(2011) int local2011 = local649 + local479;
			@Pc(2015) int local2015 = local674 + local487;
			@Pc(2019) int local2019 = local678 + local495;
			@Pc(2022) int[] local2022 = new int[9];
			@Pc(2028) int local2028;
			for (local686 = 0; local686 < 3; local686++) {
				for (local2028 = 0; local2028 < 3; local2028++) {
					local691 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local691 += arg7[local686 * 3 + local695] * local1875[local2028 + local695 * 3];
					}
					local2022[local686 * 3 + local2028] = local691 + 8192 >> 14;
				}
			}
			local2028 = arg7[1] * local2015 + arg7[0] * local2011 + arg7[2] * local2019 + 8192 >> 14;
			local691 = arg7[4] * local2015 + arg7[3] * local2011 + arg7[5] * local2019 + 8192 >> 14;
			local695 = arg7[7] * local2015 + local2011 * arg7[6] + arg7[8] * local2019 + 8192 >> 14;
			local2028 += local30;
			local691 += local32;
			local695 += local38;
			for (local699 = 0; local699 < local8; local699++) {
				local701 = arg1[local699];
				if (local701 < this.anIntArrayArray43.length) {
					local831 = this.anIntArrayArray43[local701];
					for (local833 = 0; local833 < local831.length; local833++) {
						local837 = local831[local833];
						if (this.aShortArray79 == null || (arg6 & this.aShortArray79[local837]) != 0) {
							local841 = local2022[2] * this.anIntArray338[local837] + local2022[1] * this.anIntArray335[local837] + this.anIntArray337[local837] * local2022[0] + 8192 >> 14;
							local843 = local2022[5] * this.anIntArray338[local837] + this.anIntArray337[local837] * local2022[3] + this.anIntArray335[local837] * local2022[4] + 8192 >> 14;
							@Pc(2263) int local2263 = local843 + local691;
							@Pc(2267) int local2267 = local841 + local2028;
							local970 = this.anIntArray338[local837] * local2022[8] + this.anIntArray337[local837] * local2022[6] + this.anIntArray335[local837] * local2022[7] + 8192 >> 14;
							this.anIntArray337[local837] = local2267;
							@Pc(2307) int local2307 = local970 + local695;
							this.anIntArray335[local837] = local2263;
							this.anIntArray338[local837] = local2307;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JILclient!fca;IIFIFIII)S")
	private short method4658(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray336[arg4];
		@Pc(17) int local17 = this.anIntArray336[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray84[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static293.aLongArray10[local21] == arg0) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray84[local19] = (short) (this.anInt5602 + 1);
		Static293.aLongArray10[local19] = arg0;
		this.aShortArray82[this.anInt5602] = (short) arg1;
		this.aShortArray83[this.anInt5602] = (short) arg4;
		this.aShortArray77[this.anInt5602] = (short) arg7;
		this.aShortArray80[this.anInt5602] = (short) arg9;
		this.aShortArray78[this.anInt5602] = (short) arg8;
		this.aByteArray68[this.anInt5602] = (byte) arg3;
		this.aFloatArray45[this.anInt5602] = arg5;
		this.aFloatArray46[this.anInt5602] = arg6;
		return (short) this.anInt5602++;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()[Lclient!rea;")
	@Override
	public Class280[] method7135() {
		return this.aClass280Array4;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5607; local3++) {
			local12 = this.aShortArray86[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray86[local3] = (short) (local28 | local18 << 10 | local24 << 7);
		}
		if (this.aClass95Array1 != null) {
			for (local12 = 0; local12 < this.anInt5652; local12++) {
				@Pc(108) Class95 local108 = this.aClass95Array1[local12];
				@Pc(113) Class145 local113 = this.aClass145Array1[local12];
				local113.anInt3880 = local113.anInt3880 & 0xFF000000 | Static331.anIntArray442[this.aShortArray86[local108.anInt2936] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4651();
	}

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5624; local3++) {
			this.anIntArray338[local3] = -this.anIntArray338[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5602; local25++) {
			this.aShortArray78[local25] = (short) -this.aShortArray78[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt5607; local44++) {
			@Pc(51) short local51 = this.aShortArray81[local44];
			this.aShortArray81[local44] = this.aShortArray76[local44];
			this.aShortArray76[local44] = local51;
		}
		this.method4645();
		this.method4648();
		this.method4649();
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()Z")
	@Override
	public boolean method7134() {
		if (this.aShortArray87 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray87.length; local12++) {
			if (this.aShortArray87[local12] != -1 && !this.aClass15_Sub2_8.anInterface4_11.method3090(this.aShortArray87[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
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
			Static289.anInt6781 = 0;
			Static569.anInt10061 = 0;
			local31 = 0;
			Static172.anInt8688 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray43.length) {
					local51 = this.anIntArrayArray43[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static289.anInt6781 += this.anIntArray337[local59];
						Static172.anInt8688 += this.anIntArray335[local59];
						Static569.anInt10061 += this.anIntArray338[local59];
						local31++;
					}
				}
			}
			if (local31 > 0) {
				Static289.anInt6781 = Static289.anInt6781 / local31 + local17;
				Static569.anInt10061 = local21 + Static569.anInt10061 / local31;
				Static172.anInt8688 = Static172.anInt8688 / local31 + local25;
			} else {
				Static172.anInt8688 = local25;
				Static289.anInt6781 = local17;
				Static569.anInt10061 = local21;
			}
			return;
		}
		@Pc(163) int[] local163;
		@Pc(165) int local165;
		if (arg0 == 1) {
			local25 = arg3 << 4;
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray43.length) {
					local163 = this.anIntArrayArray43[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local53 = local163[local165];
						this.anIntArray337[local53] += local17;
						this.anIntArray335[local53] += local25;
						this.anIntArray338[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(286) int local286;
		@Pc(304) int local304;
		@Pc(760) int local760;
		@Pc(769) int local769;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray43.length) {
					local163 = this.anIntArrayArray43[local35];
					if ((arg5 & 0x1) == 0) {
						for (local165 = 0; local165 < local163.length; local165++) {
							local53 = local163[local165];
							this.anIntArray337[local53] -= Static289.anInt6781;
							this.anIntArray335[local53] -= Static172.anInt8688;
							this.anIntArray338[local53] -= Static569.anInt10061;
							if (arg4 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg4];
								local286 = Class2_Sub3.anIntArray621[arg4];
								local304 = local286 * this.anIntArray337[local53] + this.anIntArray335[local53] * local59 + 16383 >> 14;
								this.anIntArray335[local53] = local286 * this.anIntArray335[local53] + 16383 - this.anIntArray337[local53] * local59 >> 14;
								this.anIntArray337[local53] = local304;
							}
							if (arg2 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg2];
								local286 = Class2_Sub3.anIntArray621[arg2];
								local304 = local286 * this.anIntArray335[local53] + 16383 - local59 * this.anIntArray338[local53] >> 14;
								this.anIntArray338[local53] = this.anIntArray335[local53] * local59 + this.anIntArray338[local53] * local286 + 16383 >> 14;
								this.anIntArray335[local53] = local304;
							}
							if (arg3 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg3];
								local286 = Class2_Sub3.anIntArray621[arg3];
								local304 = local59 * this.anIntArray338[local53] + this.anIntArray337[local53] * local286 + 16383 >> 14;
								this.anIntArray338[local53] = this.anIntArray338[local53] * local286 + 16383 - this.anIntArray337[local53] * local59 >> 14;
								this.anIntArray337[local53] = local304;
							}
							this.anIntArray337[local53] += Static289.anInt6781;
							this.anIntArray335[local53] += Static172.anInt8688;
							this.anIntArray338[local53] += Static569.anInt10061;
						}
					} else {
						for (local165 = 0; local165 < local163.length; local165++) {
							local53 = local163[local165];
							this.anIntArray337[local53] -= Static289.anInt6781;
							this.anIntArray335[local53] -= Static172.anInt8688;
							this.anIntArray338[local53] -= Static569.anInt10061;
							if (arg2 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg2];
								local286 = Class2_Sub3.anIntArray621[arg2];
								local304 = this.anIntArray335[local53] * local286 + 16383 - this.anIntArray338[local53] * local59 >> 14;
								this.anIntArray338[local53] = this.anIntArray338[local53] * local286 + local59 * this.anIntArray335[local53] + 16383 >> 14;
								this.anIntArray335[local53] = local304;
							}
							if (arg4 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg4];
								local286 = Class2_Sub3.anIntArray621[arg4];
								local304 = this.anIntArray337[local53] * local286 + this.anIntArray335[local53] * local59 + 16383 >> 14;
								this.anIntArray335[local53] = this.anIntArray335[local53] * local286 + 16383 - this.anIntArray337[local53] * local59 >> 14;
								this.anIntArray337[local53] = local304;
							}
							if (arg3 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg3];
								local286 = Class2_Sub3.anIntArray621[arg3];
								local304 = this.anIntArray338[local53] * local59 + local286 * this.anIntArray337[local53] + 16383 >> 14;
								this.anIntArray338[local53] = this.anIntArray338[local53] * local286 + 16383 - local59 * this.anIntArray337[local53] >> 14;
								this.anIntArray337[local53] = local304;
							}
							this.anIntArray337[local53] += Static289.anInt6781;
							this.anIntArray335[local53] += Static172.anInt8688;
							this.anIntArray338[local53] += Static569.anInt10061;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray43.length > local41) {
						local51 = this.anIntArrayArray43[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local286 = this.anIntArray336[local59];
							local304 = this.anIntArray336[local59 + 1];
							for (local760 = local286; local760 < local304; local760++) {
								local769 = this.aShortArray84[local760] - 1;
								if (local769 == -1) {
									break;
								}
								@Pc(779) int local779;
								@Pc(783) int local783;
								@Pc(801) int local801;
								if (arg4 != 0) {
									local779 = Class2_Sub3.anIntArray620[arg4];
									local783 = Class2_Sub3.anIntArray621[arg4];
									local801 = this.aShortArray77[local769] * local783 + this.aShortArray80[local769] * local779 + 16383 >> 14;
									this.aShortArray80[local769] = (short) (this.aShortArray80[local769] * local783 + 16383 - local779 * this.aShortArray77[local769] >> 14);
									this.aShortArray77[local769] = (short) local801;
								}
								if (arg2 != 0) {
									local779 = Class2_Sub3.anIntArray620[arg2];
									local783 = Class2_Sub3.anIntArray621[arg2];
									local801 = this.aShortArray80[local769] * local783 + 16383 - local779 * this.aShortArray78[local769] >> 14;
									this.aShortArray78[local769] = (short) (local783 * this.aShortArray78[local769] + local779 * this.aShortArray80[local769] + 16383 >> 14);
									this.aShortArray80[local769] = (short) local801;
								}
								if (arg3 != 0) {
									local779 = Class2_Sub3.anIntArray620[arg3];
									local783 = Class2_Sub3.anIntArray621[arg3];
									local801 = local779 * this.aShortArray78[local769] + this.aShortArray77[local769] * local783 + 16383 >> 14;
									this.aShortArray78[local769] = (short) (local783 * this.aShortArray78[local769] + 16383 - local779 * this.aShortArray77[local769] >> 14);
									this.aShortArray77[local769] = (short) local801;
								}
							}
						}
					}
				}
				this.method4648();
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray43.length > local35) {
					local163 = this.anIntArrayArray43[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local53 = local163[local165];
						this.anIntArray337[local53] -= Static289.anInt6781;
						this.anIntArray335[local53] -= Static172.anInt8688;
						this.anIntArray338[local53] -= Static569.anInt10061;
						this.anIntArray337[local53] = this.anIntArray337[local53] * arg2 >> 7;
						this.anIntArray335[local53] = arg3 * this.anIntArray335[local53] >> 7;
						this.anIntArray338[local53] = arg4 * this.anIntArray338[local53] >> 7;
						this.anIntArray337[local53] += Static289.anInt6781;
						this.anIntArray335[local53] += Static172.anInt8688;
						this.anIntArray338[local53] += Static569.anInt10061;
					}
				}
			}
		} else {
			@Pc(1219) Class145 local1219;
			@Pc(1110) boolean local1110;
			@Pc(1214) Class95 local1214;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					local1110 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray42.length > local41) {
							local51 = this.anIntArrayArray42[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local286 = arg2 * 8 + (this.aByteArray67[local59] & 0xFF);
								if (local286 < 0) {
									local286 = 0;
								} else if (local286 > 255) {
									local286 = 255;
								}
								this.aByteArray67[local59] = (byte) local286;
							}
							local1110 |= local51.length > 0;
						}
					}
					if (local1110) {
						if (this.aClass95Array1 != null) {
							for (local41 = 0; local41 < this.anInt5652; local41++) {
								local1214 = this.aClass95Array1[local41];
								local1219 = this.aClass145Array1[local41];
								local1219.anInt3880 = local1219.anInt3880 & 0xFFFFFF | 255 - (this.aByteArray67[local1214.anInt2936] & 0xFF) << 24;
							}
						}
						this.method4651();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray42 != null) {
					local1110 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray42.length) {
							local51 = this.anIntArrayArray42[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local286 = this.aShortArray86[local59] & 0xFFFF;
								local304 = local286 >> 10 & 0x3F;
								local760 = local286 >> 7 & 0x7;
								local760 += arg3 / 4;
								local769 = local286 & 0x7F;
								@Pc(1320) int local1320 = arg2 + local304 & 0x3F;
								if (local760 < 0) {
									local760 = 0;
								} else if (local760 > 7) {
									local760 = 7;
								}
								local769 += arg4;
								if (local769 < 0) {
									local769 = 0;
								} else if (local769 > 127) {
									local769 = 127;
								}
								this.aShortArray86[local59] = (short) (local769 | local1320 << 10 | local760 << 7);
							}
							local1110 |= local51.length > 0;
						}
					}
					if (local1110) {
						if (this.aClass95Array1 != null) {
							for (local41 = 0; local41 < this.anInt5652; local41++) {
								local1214 = this.aClass95Array1[local41];
								local1219 = this.aClass145Array1[local41];
								local1219.anInt3880 = local1219.anInt3880 & 0xFF000000 | Static331.anIntArray442[this.aShortArray86[local1214.anInt2936] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method4651();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray44 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray44.length) {
							local163 = this.anIntArrayArray44[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1219 = this.aClass145Array1[local163[local165]];
								local1219.anInt3876 += arg2;
								local1219.anInt3879 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray44 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray44.length > local35) {
							local163 = this.anIntArrayArray44[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1219 = this.aClass145Array1[local163[local165]];
								local1219.anInt3872 = local1219.anInt3872 * arg3 >> 7;
								local1219.anInt3882 = arg2 * local1219.anInt3882 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray44.length) {
						local163 = this.anIntArrayArray44[local35];
						for (local165 = 0; local165 < local163.length; local165++) {
							local1219 = this.aClass145Array1[local163[local165]];
							local1219.anInt3878 = local1219.anInt3878 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5612; local3++) {
			this.anIntArray337[local3] = this.anIntArray337[local3] + 7 >> 4;
			this.anIntArray335[local3] = this.anIntArray335[local3] + 7 >> 4;
			this.anIntArray338[local3] = this.anIntArray338[local3] + 7 >> 4;
		}
		this.method4645();
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5624; local7++) {
			if (arg0 != 128) {
				this.anIntArray337[local7] = arg0 * this.anIntArray337[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray335[local7] = arg1 * this.anIntArray335[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray338[local7] = arg2 * this.anIntArray338[local7] >> 7;
			}
		}
		this.method4645();
		this.aBoolean483 = false;
	}
}
