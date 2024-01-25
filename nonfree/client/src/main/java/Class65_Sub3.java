import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class65_Sub3 extends Class65 {

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	private int anInt8230;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
	private int anInt8232;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_15;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
	private int anInt8237;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "Z")
	private boolean aBoolean588;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "Z")
	private boolean aBoolean589;

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
	private int anInt8246;

	@OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
	private int anInt8248;

	@OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
	private int anInt8249;

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "Lclient!mi;")
	private Class219 aClass219_1;

	@OriginalMember(owner = "client!qh", name = "bb", descriptor = "I")
	private int anInt8252;

	@OriginalMember(owner = "client!qh", name = "ib", descriptor = "Lclient!vv;")
	private Class352 aClass352_1;

	@OriginalMember(owner = "client!qh", name = "kb", descriptor = "Lclient!ia;")
	private Class145 aClass145_1;

	@OriginalMember(owner = "client!qh", name = "lb", descriptor = "Lclient!vv;")
	private Class352 lb;

	@OriginalMember(owner = "client!qh", name = "Eb", descriptor = "I")
	private int anInt8269;

	@OriginalMember(owner = "client!qh", name = "Hb", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!qh", name = "Xb", descriptor = "I")
	private int anInt8282;

	@OriginalMember(owner = "client!qh", name = "dc", descriptor = "Lclient!vv;")
	private Class352 aClass352_2;

	@OriginalMember(owner = "client!qh", name = "nc", descriptor = "I")
	private int anInt8292;

	@OriginalMember(owner = "client!qh", name = "tc", descriptor = "I")
	private int anInt8297;

	@OriginalMember(owner = "client!qh", name = "Cc", descriptor = "Lclient!vv;")
	private Class352 aClass352_3;

	@OriginalMember(owner = "client!qh", name = "Lb", descriptor = "[I")
	private int[] anIntArray464;

	@OriginalMember(owner = "client!qh", name = "Wb", descriptor = "I")
	private int anInt8281;

	@OriginalMember(owner = "client!qh", name = "Db", descriptor = "I")
	private int anInt8268;

	@OriginalMember(owner = "client!qh", name = "Pb", descriptor = "Z")
	private boolean aBoolean591;

	@OriginalMember(owner = "client!qh", name = "Ec", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
	private int anInt8243;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "[I")
	private int[] anIntArray459;

	@OriginalMember(owner = "client!qh", name = "yc", descriptor = "I")
	private int anInt8301;

	@OriginalMember(owner = "client!qh", name = "tb", descriptor = "[I")
	private int[] anIntArray463;

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "[Lclient!kw;")
	private Class190[] aClass190Array3;

	@OriginalMember(owner = "client!qh", name = "vb", descriptor = "[Lclient!cea;")
	private Class52[] aClass52Array4;

	@OriginalMember(owner = "client!qh", name = "Gc", descriptor = "I")
	private int anInt8307;

	@OriginalMember(owner = "client!qh", name = "fb", descriptor = "[Lclient!oca;")
	private Class243[] aClass243Array1;

	@OriginalMember(owner = "client!qh", name = "Fb", descriptor = "[Lclient!uj;")
	private Class328[] aClass328Array1;

	@OriginalMember(owner = "client!qh", name = "nb", descriptor = "[F")
	private float[] aFloatArray64;

	@OriginalMember(owner = "client!qh", name = "X", descriptor = "[F")
	private float[] aFloatArray63;

	@OriginalMember(owner = "client!qh", name = "Kb", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!qh", name = "Z", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!qh", name = "jc", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!qh", name = "hc", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!qh", name = "ab", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!qh", name = "sb", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!qh", name = "kc", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!qh", name = "xb", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!qh", name = "fc", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!qh", name = "Y", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!qh", name = "db", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!qh", name = "Tb", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!qh", name = "pc", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "[I")
	private int[] anIntArray461;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!qh", name = "ac", descriptor = "[I")
	private int[] anIntArray465;

	@OriginalMember(owner = "client!qh", name = "vc", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!qh", name = "pb", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!qh", name = "qb", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!nh;Lclient!cr;IIII)V")
	public Class65_Sub3(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface7 local11 = arg0.anInterface7_12;
		this.anIntArray464 = new int[arg1.anInt1902 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt1912];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt1912; local24++) {
			if ((arg1.aByteArray10 == null || arg1.aByteArray10[local24] != 2) && (arg1.aShortArray11 == null || arg1.aShortArray11[local24] == -1 || !local11.method4460(arg1.aShortArray11[local24] & 0xFFFF).aBoolean176)) {
				local22[this.anInt8281++] = local24;
				this.anIntArray464[arg1.aShortArray19[local24]]++;
				this.anIntArray464[arg1.aShortArray18[local24]]++;
				this.anIntArray464[arg1.aShortArray15[local24]]++;
			}
		}
		this.anInt8268 = this.anInt8281;
		@Pc(117) long[] local117 = new long[this.anInt8281];
		@Pc(129) boolean local129 = (this.anInt8246 & 0x100) != 0;
		@Pc(141) int local141;
		@Pc(309) int local309;
		for (@Pc(131) int local131 = 0; local131 < this.anInt8281; local131++) {
			@Pc(137) int local137 = local22[local131];
			@Pc(139) Class69 local139 = null;
			local141 = 0;
			@Pc(143) byte local143 = 0;
			@Pc(145) byte local145 = 0;
			@Pc(147) byte local147 = 0;
			if (arg1.aClass138Array1 != null) {
				@Pc(152) boolean local152 = false;
				for (@Pc(154) int local154 = 0; local154 < arg1.aClass138Array1.length; local154++) {
					@Pc(161) Class138 local161 = arg1.aClass138Array1[local154];
					if (local161.anInt3902 == local137) {
						@Pc(174) Class74 local174 = Static16.method4958(local161.anInt3901);
						if (local174.aBoolean189) {
							local152 = true;
						}
						if (local174.anInt2384 != -1) {
							@Pc(189) Class69 local189 = local11.method4460(local174.anInt2384);
							if (local189.aBoolean180) {
								this.aBoolean591 = true;
							}
						}
					}
				}
				if (local152) {
					local117[local131] = Long.MAX_VALUE;
					this.anInt8268--;
					continue;
				}
			}
			@Pc(217) short local217 = -1;
			if (arg1.aShortArray11 != null) {
				local217 = arg1.aShortArray11[local137];
				if (local217 != -1) {
					local139 = local11.method4460(local217 & 0xFFFF);
					local147 = local139.aByte44;
					local145 = local139.aByte40;
				}
			}
			@Pc(265) boolean local265 = arg1.aByteArray12 != null && arg1.aByteArray12[local137] != 0 || local139 != null && !local139.aBoolean177 | local139.aBoolean180;
			if ((local129 || local265) && arg1.aByteArray8 != null) {
				local141 += arg1.aByteArray8[local137] << 17;
			}
			if (local265) {
				local141 += 65536;
			}
			local141 += (local145 & 0xFF) << 8;
			local141 += local147 & 0xFF;
			local309 = local143 + ((local217 & 0xFFFF) << 16);
			@Pc(315) int local315 = local309 + (local131 & 0xFFFF);
			local117[local131] = (long) local315 + ((long) local141 << 32);
			this.aBoolean591 |= local265;
		}
		Static257.method4065(local22, local117);
		this.aShortArray120 = arg1.aShortArray16;
		this.anInt8243 = arg1.anInt1902;
		this.anIntArray460 = arg1.anIntArray78;
		this.anIntArray459 = arg1.anIntArray84;
		this.anInt8301 = arg1.anInt1904;
		this.anIntArray463 = arg1.anIntArray75;
		this.aClass190Array3 = arg1.aClass190Array1;
		this.aClass52Array4 = arg1.aClass52Array1;
		@Pc(380) Class239[] local380 = new Class239[this.anInt8243];
		@Pc(400) int local400;
		@Pc(414) int local414;
		if (arg1.aClass138Array1 != null) {
			this.anInt8307 = arg1.aClass138Array1.length;
			this.aClass243Array1 = new Class243[this.anInt8307];
			this.aClass328Array1 = new Class328[this.anInt8307];
			for (local400 = 0; local400 < this.anInt8307; local400++) {
				@Pc(407) Class138 local407 = arg1.aClass138Array1[local400];
				@Pc(412) Class74 local412 = Static16.method4958(local407.anInt3901);
				local414 = -1;
				for (@Pc(416) int local416 = 0; local416 < this.anInt8281; local416++) {
					if (local22[local416] == local407.anInt3902) {
						local414 = local416;
						break;
					}
				}
				if (local414 == -1) {
					throw new RuntimeException();
				}
				@Pc(456) int local456 = Static394.anIntArray413[arg1.aShortArray14[local407.anInt3902] & 0xFFFF] & 0xFFFFFF;
				@Pc(474) int local474 = local456 | 255 - (arg1.aByteArray12 == null ? 0 : arg1.aByteArray12[local407.anInt3902]) << 24;
				this.aClass328Array1[local400] = new Class328(local414, arg1.aShortArray19[local407.anInt3902], arg1.aShortArray18[local407.anInt3902], arg1.aShortArray15[local407.anInt3902], local412.anInt2389, local412.anInt2388, local412.anInt2384, local412.anInt2383, local412.anInt2387, local412.aBoolean189, local412.aBoolean190, local407.anInt3907);
				this.aClass243Array1[local400] = new Class243(local474);
			}
		}
		local400 = this.anInt8281 * 3;
		this.aFloatArray64 = new float[local400];
		this.aFloatArray63 = new float[local400];
		this.aByteArray77 = new byte[local400];
		this.aShortArray110 = new short[this.anInt8281];
		if (arg1.aShortArray10 != null) {
			this.aShortArray118 = new short[this.anInt8281];
		}
		this.aShortArray117 = new short[local400];
		this.aShortArray111 = new short[local400];
		this.aShortArray113 = new short[this.anInt8281];
		this.aShortArray119 = new short[local400];
		this.aShort102 = (short) arg3;
		Static87.aLongArray2 = new long[local400];
		this.aShortArray114 = new short[this.anInt8281];
		this.aShortArray116 = new short[local400];
		this.aShortArray109 = new short[local400];
		this.aShortArray108 = new short[this.anInt8281];
		this.aShortArray112 = new short[this.anInt8281];
		this.aShortArray115 = new short[local400];
		this.aByteArray76 = new byte[this.anInt8281];
		this.aShort103 = (short) arg4;
		local141 = 0;
		for (local309 = 0; local309 < arg1.anInt1902; local309++) {
			local414 = this.anIntArray464[local309];
			this.anIntArray464[local309] = local141;
			local380[local309] = new Class239();
			local141 += local414;
		}
		this.anIntArray464[arg1.anInt1902] = local141;
		@Pc(659) int[] local659 = null;
		@Pc(661) int[] local661 = null;
		@Pc(663) int[] local663 = null;
		@Pc(665) float[][] local665 = null;
		@Pc(683) int[] local683;
		@Pc(691) int local691;
		@Pc(730) int local730;
		@Pc(736) int local736;
		@Pc(749) int local749;
		@Pc(751) int local751;
		@Pc(785) int local785;
		@Pc(790) int local790;
		@Pc(949) float local949;
		@Pc(965) float local965;
		@Pc(957) float local957;
		if (arg1.aByteArray13 != null) {
			@Pc(671) int local671 = arg1.anInt1899;
			@Pc(674) int[] local674 = new int[local671];
			@Pc(677) int[] local677 = new int[local671];
			@Pc(680) int[] local680 = new int[local671];
			local683 = new int[local671];
			@Pc(686) int[] local686 = new int[local671];
			@Pc(689) int[] local689 = new int[local671];
			for (local691 = 0; local691 < local671; local691++) {
				local674[local691] = Integer.MAX_VALUE;
				local677[local691] = -2147483647;
				local680[local691] = Integer.MAX_VALUE;
				local683[local691] = -2147483647;
				local686[local691] = Integer.MAX_VALUE;
				local689[local691] = -2147483647;
			}
			local661 = new int[local671];
			for (local730 = 0; local730 < this.anInt8281; local730++) {
				local736 = local22[local730];
				if (arg1.aByteArray13[local736] != -1) {
					local749 = arg1.aByteArray13[local736] & 0xFF;
					for (local751 = 0; local751 < 3; local751++) {
						@Pc(763) short local763;
						if (local751 == 0) {
							local763 = arg1.aShortArray19[local736];
						} else if (local751 == 1) {
							local763 = arg1.aShortArray18[local736];
						} else {
							local763 = arg1.aShortArray15[local736];
						}
						local785 = arg1.anIntArray78[local763];
						local790 = arg1.anIntArray75[local763];
						@Pc(795) int local795 = arg1.anIntArray84[local763];
						if (local674[local749] > local785) {
							local674[local749] = local785;
						}
						if (local677[local749] < local785) {
							local677[local749] = local785;
						}
						if (local680[local749] > local790) {
							local680[local749] = local790;
						}
						if (local790 > local683[local749]) {
							local683[local749] = local790;
						}
						if (local795 < local686[local749]) {
							local686[local749] = local795;
						}
						if (local795 > local689[local749]) {
							local689[local749] = local795;
						}
					}
				}
			}
			local659 = new int[local671];
			local663 = new int[local671];
			local665 = new float[local671][];
			for (local736 = 0; local736 < local671; local736++) {
				@Pc(892) byte local892 = arg1.aByteArray9[local736];
				if (local892 > 0) {
					local659[local736] = (local674[local736] + local677[local736]) / 2;
					local661[local736] = (local683[local736] + local680[local736]) / 2;
					local663[local736] = (local689[local736] + local686[local736]) / 2;
					if (local892 == 1) {
						local790 = arg1.anIntArray82[local736];
						local965 = 64.0F / (float) arg1.anIntArray79[local736];
						if (local790 == 0) {
							local949 = 1.0F;
							local957 = 1.0F;
						} else if (local790 <= 0) {
							local949 = (float) -local790 / 1024.0F;
							local957 = 1.0F;
						} else {
							local949 = 1.0F;
							local957 = (float) local790 / 1024.0F;
						}
					} else if (local892 == 2) {
						local949 = 64.0F / (float) arg1.anIntArray82[local736];
						local957 = 64.0F / (float) arg1.anIntArray85[local736];
						local965 = 64.0F / (float) arg1.anIntArray79[local736];
					} else {
						local949 = (float) arg1.anIntArray82[local736] / 1024.0F;
						local957 = (float) arg1.anIntArray85[local736] / 1024.0F;
						local965 = (float) arg1.anIntArray79[local736] / 1024.0F;
					}
					local665[local736] = Static325.method5026(arg1.aShortArray12[local736], local965, local957, arg1.aByteArray11[local736] & 0xFF, arg1.aShortArray17[local736], arg1.aShortArray13[local736], local949);
				}
			}
		}
		@Pc(1070) Class265[] local1070 = new Class265[arg1.anInt1912];
		@Pc(1089) short local1089;
		@Pc(1100) int local1100;
		@Pc(1111) int local1111;
		for (@Pc(1072) int local1072 = 0; local1072 < arg1.anInt1912; local1072++) {
			@Pc(1079) short local1079 = arg1.aShortArray19[local1072];
			@Pc(1084) short local1084 = arg1.aShortArray18[local1072];
			local1089 = arg1.aShortArray15[local1072];
			local1100 = this.anIntArray460[local1084] - this.anIntArray460[local1079];
			local1111 = this.anIntArray463[local1084] - this.anIntArray463[local1079];
			local691 = this.anIntArray459[local1084] - this.anIntArray459[local1079];
			local730 = this.anIntArray460[local1089] - this.anIntArray460[local1079];
			local736 = this.anIntArray463[local1089] - this.anIntArray463[local1079];
			local749 = this.anIntArray459[local1089] - this.anIntArray459[local1079];
			local751 = local749 * local1111 - local691 * local736;
			@Pc(1171) int local1171 = local730 * local691 - local749 * local1100;
			local785 = local736 * local1100 - local730 * local1111;
			while (local751 > 8192 || local1171 > 8192 || local785 > 8192 || local751 < -8192 || local1171 < -8192 || local785 < -8192) {
				local751 >>= 0x1;
				local785 >>= 0x1;
				local1171 >>= 0x1;
			}
			local790 = (int) Math.sqrt((double) (local785 * local785 + local1171 * local1171 + local751 * local751));
			if (local790 <= 0) {
				local790 = 1;
			}
			local785 = local785 * 256 / local790;
			local751 = local751 * 256 / local790;
			local1171 = local1171 * 256 / local790;
			@Pc(1270) byte local1270 = arg1.aByteArray10 == null ? 0 : arg1.aByteArray10[local1072];
			if (local1270 == 0) {
				@Pc(1279) Class239 local1279 = local380[local1079];
				local1279.anInt7005 += local785;
				local1279.anInt7006 += local1171;
				local1279.anInt7007 += local751;
				local1279.anInt7008++;
				@Pc(1307) Class239 local1307 = local380[local1084];
				local1307.anInt7006 += local1171;
				local1307.anInt7005 += local785;
				local1307.anInt7007 += local751;
				local1307.anInt7008++;
				@Pc(1335) Class239 local1335 = local380[local1089];
				local1335.anInt7005 += local785;
				local1335.anInt7006 += local1171;
				local1335.anInt7008++;
				local1335.anInt7007 += local751;
			} else if (local1270 == 1) {
				@Pc(1372) Class265 local1372 = local1070[local1072] = new Class265();
				local1372.anInt7856 = local1171;
				local1372.anInt7858 = local785;
				local1372.anInt7859 = local751;
			}
		}
		@Pc(1398) int local1398;
		for (@Pc(1392) int local1392 = 0; local1392 < this.anInt8281; local1392++) {
			local1398 = local22[local1392];
			@Pc(1405) int local1405 = arg1.aShortArray14[local1398] & 0xFFFF;
			@Pc(1413) short local1413;
			if (arg1.aShortArray11 == null) {
				local1413 = -1;
			} else {
				local1413 = arg1.aShortArray11[local1398];
			}
			if (arg1.aByteArray13 == null) {
				local1111 = -1;
			} else {
				local1111 = arg1.aByteArray13[local1398];
			}
			if (arg1.aByteArray12 == null) {
				local691 = 0;
			} else {
				local691 = arg1.aByteArray12[local1398] & 0xFF;
			}
			@Pc(1445) float local1445 = 0.0F;
			@Pc(1447) float local1447 = 0.0F;
			@Pc(1449) float local1449 = 0.0F;
			local949 = 0.0F;
			local965 = 0.0F;
			local957 = 0.0F;
			@Pc(1457) byte local1457 = 0;
			@Pc(1459) byte local1459 = 0;
			@Pc(1461) int local1461 = 0;
			@Pc(1496) byte local1496;
			@Pc(1513) short local1513;
			@Pc(1518) short local1518;
			@Pc(1523) short local1523;
			if (local1413 != -1) {
				if (local1111 == -1) {
					local949 = 1.0F;
					local1457 = 1;
					local965 = 0.0F;
					local1445 = 0.0F;
					local1459 = 2;
					local1447 = 1.0F;
					local1449 = 1.0F;
					local957 = 0.0F;
				} else {
					local1111 &= 0xFF;
					local1496 = arg1.aByteArray9[local1111];
					@Pc(1503) short local1503;
					@Pc(1508) short local1508;
					@Pc(1546) float local1546;
					@Pc(1554) float local1554;
					@Pc(1562) float local1562;
					@Pc(1647) float local1647;
					@Pc(1655) float local1655;
					@Pc(1664) float local1664;
					@Pc(1672) float local1672;
					@Pc(1680) float local1680;
					@Pc(1688) float local1688;
					if (local1496 == 0) {
						local1503 = arg1.aShortArray19[local1398];
						local1508 = arg1.aShortArray18[local1398];
						local1513 = arg1.aShortArray15[local1398];
						local1518 = arg1.aShortArray13[local1111];
						local1523 = arg1.aShortArray12[local1111];
						@Pc(1528) short local1528 = arg1.aShortArray17[local1111];
						@Pc(1534) float local1534 = (float) arg1.anIntArray78[local1518];
						@Pc(1540) float local1540 = (float) arg1.anIntArray75[local1518];
						local1546 = arg1.anIntArray84[local1518];
						local1554 = (float) arg1.anIntArray78[local1523] - local1534;
						local1562 = (float) arg1.anIntArray75[local1523] - local1540;
						@Pc(1570) float local1570 = (float) arg1.anIntArray84[local1523] - local1546;
						@Pc(1578) float local1578 = (float) arg1.anIntArray78[local1528] - local1534;
						@Pc(1586) float local1586 = (float) arg1.anIntArray75[local1528] - local1540;
						@Pc(1594) float local1594 = (float) arg1.anIntArray84[local1528] - local1546;
						@Pc(1602) float local1602 = (float) arg1.anIntArray78[local1503] - local1534;
						@Pc(1611) float local1611 = (float) arg1.anIntArray75[local1503] - local1540;
						@Pc(1620) float local1620 = (float) arg1.anIntArray84[local1503] - local1546;
						@Pc(1629) float local1629 = (float) arg1.anIntArray78[local1508] - local1534;
						@Pc(1638) float local1638 = (float) arg1.anIntArray75[local1508] - local1540;
						local1647 = (float) arg1.anIntArray84[local1508] - local1546;
						local1655 = (float) arg1.anIntArray78[local1513] - local1534;
						local1664 = (float) arg1.anIntArray75[local1513] - local1540;
						local1672 = (float) arg1.anIntArray84[local1513] - local1546;
						local1680 = local1562 * local1594 - local1570 * local1586;
						local1688 = local1570 * local1578 - local1554 * local1594;
						@Pc(1696) float local1696 = local1586 * local1554 - local1578 * local1562;
						@Pc(1705) float local1705 = local1586 * local1696 - local1688 * local1594;
						@Pc(1714) float local1714 = local1594 * local1680 - local1696 * local1578;
						@Pc(1723) float local1723 = local1688 * local1578 - local1586 * local1680;
						@Pc(1737) float local1737 = 1.0F / (local1570 * local1723 + local1562 * local1714 + local1705 * local1554);
						local1449 = local1737 * (local1723 * local1647 + local1638 * local1714 + local1629 * local1705);
						local1445 = (local1723 * local1620 + local1714 * local1611 + local1705 * local1602) * local1737;
						local965 = (local1672 * local1723 + local1714 * local1664 + local1705 * local1655) * local1737;
						@Pc(1788) float local1788 = local1688 * local1554 - local1680 * local1562;
						@Pc(1796) float local1796 = local1680 * local1570 - local1696 * local1554;
						@Pc(1804) float local1804 = local1562 * local1696 - local1688 * local1570;
						@Pc(1818) float local1818 = 1.0F / (local1788 * local1594 + local1796 * local1586 + local1804 * local1578);
						local957 = (local1672 * local1788 + local1804 * local1655 + local1796 * local1664) * local1818;
						local949 = local1818 * (local1804 * local1629 + local1638 * local1796 + local1788 * local1647);
						local1447 = (local1620 * local1788 + local1796 * local1611 + local1602 * local1804) * local1818;
					} else {
						local1503 = arg1.aShortArray19[local1398];
						local1508 = arg1.aShortArray18[local1398];
						local1513 = arg1.aShortArray15[local1398];
						@Pc(1881) int local1881 = local659[local1111];
						@Pc(1885) int local1885 = local661[local1111];
						@Pc(1889) int local1889 = local663[local1111];
						@Pc(1893) float[] local1893 = local665[local1111];
						@Pc(1898) byte local1898 = arg1.aByteArray7[local1111];
						local1546 = (float) arg1.anIntArray81[local1111] / 256.0F;
						if (local1496 == 1) {
							local1554 = (float) arg1.anIntArray85[local1111] / 1024.0F;
							Static40.method1069(local1893, arg1.anIntArray84[local1503], local1546, arg1.anIntArray78[local1503], local1889, local1898, local1554, arg1.anIntArray75[local1503], local1881, local1885);
							local1447 = Static448.aFloat198;
							local1445 = Static284.aFloat149;
							Static40.method1069(local1893, arg1.anIntArray84[local1508], local1546, arg1.anIntArray78[local1508], local1889, local1898, local1554, arg1.anIntArray75[local1508], local1881, local1885);
							local949 = Static448.aFloat198;
							local1449 = Static284.aFloat149;
							Static40.method1069(local1893, arg1.anIntArray84[local1513], local1546, arg1.anIntArray78[local1513], local1889, local1898, local1554, arg1.anIntArray75[local1513], local1881, local1885);
							local965 = Static284.aFloat149;
							local957 = Static448.aFloat198;
							local1562 = local1554 / 2.0F;
							if ((local1898 & 0x1) == 0) {
								if (local965 - local1445 > local1562) {
									local1459 = 1;
									local965 -= local1554;
								} else if (local1562 < local1445 - local965) {
									local1459 = 2;
									local965 += local1554;
								}
								if (local1562 < local1449 - local1445) {
									local1449 -= local1554;
									local1457 = 1;
								} else if (local1562 < local1445 - local1449) {
									local1449 += local1554;
									local1457 = 2;
								}
							} else {
								if (local1562 < local949 - local1447) {
									local1457 = 1;
									local949 -= local1554;
								} else if (local1447 - local949 > local1562) {
									local1457 = 2;
									local949 += local1554;
								}
								if (local957 - local1447 > local1562) {
									local1459 = 1;
									local957 -= local1554;
								} else if (local1447 - local957 > local1562) {
									local957 += local1554;
									local1459 = 2;
								}
							}
						} else if (local1496 == 2) {
							local1554 = (float) arg1.anIntArray77[local1111] / 256.0F;
							local1562 = (float) arg1.anIntArray83[local1111] / 256.0F;
							@Pc(2133) int local2133 = arg1.anIntArray78[local1508] - arg1.anIntArray78[local1503];
							@Pc(2144) int local2144 = arg1.anIntArray75[local1508] - arg1.anIntArray75[local1503];
							@Pc(2155) int local2155 = arg1.anIntArray84[local1508] - arg1.anIntArray84[local1503];
							@Pc(2166) int local2166 = arg1.anIntArray78[local1513] - arg1.anIntArray78[local1503];
							@Pc(2177) int local2177 = arg1.anIntArray75[local1513] - arg1.anIntArray75[local1503];
							@Pc(2188) int local2188 = arg1.anIntArray84[local1513] - arg1.anIntArray84[local1503];
							@Pc(2197) int local2197 = local2144 * local2188 - local2155 * local2177;
							@Pc(2206) int local2206 = local2155 * local2166 - local2133 * local2188;
							@Pc(2215) int local2215 = local2177 * local2133 - local2166 * local2144;
							local1647 = 64.0F / (float) arg1.anIntArray82[local1111];
							local1655 = 64.0F / (float) arg1.anIntArray79[local1111];
							local1664 = 64.0F / (float) arg1.anIntArray85[local1111];
							local1672 = ((float) local2197 * local1893[0] + (float) local2206 * local1893[1] + local1893[2] * (float) local2215) / local1647;
							local1680 = ((float) local2215 * local1893[5] + (float) local2197 * local1893[3] + (float) local2206 * local1893[4]) / local1655;
							local1688 = ((float) local2215 * local1893[8] + (float) local2206 * local1893[7] + (float) local2197 * local1893[6]) / local1664;
							local1461 = Static300.method4773(local1680, local1688, local1672);
							Static205.method3344(local1881, arg1.anIntArray75[local1503], local1893, local1898, arg1.anIntArray78[local1503], local1562, local1546, local1889, local1461, local1885, arg1.anIntArray84[local1503], local1554);
							local1445 = Static223.aFloat104;
							local1447 = Static17.aFloat40;
							Static205.method3344(local1881, arg1.anIntArray75[local1508], local1893, local1898, arg1.anIntArray78[local1508], local1562, local1546, local1889, local1461, local1885, arg1.anIntArray84[local1508], local1554);
							local949 = Static17.aFloat40;
							local1449 = Static223.aFloat104;
							Static205.method3344(local1881, arg1.anIntArray75[local1513], local1893, local1898, arg1.anIntArray78[local1513], local1562, local1546, local1889, local1461, local1885, arg1.anIntArray84[local1513], local1554);
							local957 = Static17.aFloat40;
							local965 = Static223.aFloat104;
						} else if (local1496 == 3) {
							Static522.method7400(local1893, local1898, local1881, local1546, arg1.anIntArray75[local1503], local1889, arg1.anIntArray78[local1503], local1885, arg1.anIntArray84[local1503]);
							local1447 = Static361.aFloat160;
							local1445 = Static155.aFloat74;
							Static522.method7400(local1893, local1898, local1881, local1546, arg1.anIntArray75[local1508], local1889, arg1.anIntArray78[local1508], local1885, arg1.anIntArray84[local1508]);
							local949 = Static361.aFloat160;
							local1449 = Static155.aFloat74;
							Static522.method7400(local1893, local1898, local1881, local1546, arg1.anIntArray75[local1513], local1889, arg1.anIntArray78[local1513], local1885, arg1.anIntArray84[local1513]);
							local965 = Static155.aFloat74;
							local957 = Static361.aFloat160;
							if ((local1898 & 0x1) == 0) {
								if (local965 - local1445 > 0.5F) {
									local1459 = 1;
									local965--;
								} else if (local1445 - local965 > 0.5F) {
									local965++;
									local1459 = 2;
								}
								if (local1449 - local1445 > 0.5F) {
									local1449--;
									local1457 = 1;
								} else if (local1445 - local1449 > 0.5F) {
									local1457 = 2;
									local1449++;
								}
							} else {
								if (local949 - local1447 > 0.5F) {
									local1457 = 1;
									local949--;
								} else if (local1447 - local949 > 0.5F) {
									local949++;
									local1457 = 2;
								}
								if (local957 - local1447 > 0.5F) {
									local957--;
									local1459 = 1;
								} else if (local1447 - local957 > 0.5F) {
									local957++;
									local1459 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray10 == null) {
				local1496 = 0;
			} else {
				local1496 = arg1.aByteArray10[local1398];
			}
			if (local1496 == 0) {
				@Pc(2765) long local2765 = ((long) local691 + (long) (local1461 << 24) + (long) (local1405 << 8) << 32) + (long) (local1111 << 2);
				local1513 = arg1.aShortArray19[local1398];
				local1518 = arg1.aShortArray18[local1398];
				local1523 = arg1.aShortArray15[local1398];
				@Pc(2784) Class239 local2784 = local380[local1513];
				this.aShortArray112[local1392] = this.method6429(local1445, local2784.anInt7007, arg1, local1513, local2784.anInt7006, local2784.anInt7008, local2765, local1447, local1392, local2784.anInt7005);
				@Pc(2809) Class239 local2809 = local380[local1518];
				this.aShortArray113[local1392] = this.method6429(local1449, local2809.anInt7007, arg1, local1518, local2809.anInt7006, local2809.anInt7008, (long) local1457 + local2765, local949, local1392, local2809.anInt7005);
				@Pc(2837) Class239 local2837 = local380[local1523];
				this.aShortArray114[local1392] = this.method6429(local965, local2837.anInt7007, arg1, local1523, local2837.anInt7006, local2837.anInt7008, (long) local1459 + local2765, local957, local1392, local2837.anInt7005);
			} else if (local1496 == 1) {
				@Pc(2622) Class265 local2622 = local1070[local1398];
				@Pc(2668) long local2668 = (long) ((local2622.anInt7856 + 256 << 12) + (local1111 << 2) + (local2622.anInt7859 <= 0 ? 2048 : 1024) + (local2622.anInt7858 + 256 << 22)) + ((long) (local1461 << 24) + (long) (local1405 << 8) + (long) local691 << 32);
				this.aShortArray112[local1392] = this.method6429(local1445, local2622.anInt7859, arg1, arg1.aShortArray19[local1398], local2622.anInt7856, 0, local2668, local1447, local1392, local2622.anInt7858);
				this.aShortArray113[local1392] = this.method6429(local1449, local2622.anInt7859, arg1, arg1.aShortArray18[local1398], local2622.anInt7856, 0, (long) local1457 + local2668, local949, local1392, local2622.anInt7858);
				this.aShortArray114[local1392] = this.method6429(local965, local2622.anInt7859, arg1, arg1.aShortArray15[local1398], local2622.anInt7856, 0, (long) local1459 + local2668, local957, local1392, local2622.anInt7858);
			}
			if (arg1.aShortArray11 == null) {
				this.aShortArray110[local1392] = -1;
			} else {
				this.aShortArray110[local1392] = arg1.aShortArray11[local1398];
			}
			if (arg1.aByteArray12 != null) {
				this.aByteArray76[local1392] = arg1.aByteArray12[local1398];
			}
			if (arg1.aShortArray10 != null) {
				this.aShortArray118[local1392] = arg1.aShortArray10[local1398];
			}
			this.aShortArray108[local1392] = arg1.aShortArray14[local1398];
		}
		if (this.anInt8268 > 0) {
			local1398 = 1;
			local1089 = this.aShortArray110[0];
			for (local1100 = 0; local1100 < this.anInt8268; local1100++) {
				@Pc(2936) short local2936 = this.aShortArray110[local1100];
				if (local1089 != local2936) {
					local1089 = local2936;
					local1398++;
				}
			}
			this.anIntArray461 = new int[local1398];
			this.anIntArray462 = new int[local1398];
			this.anIntArray465 = new int[local1398 + 1];
			this.anIntArray465[0] = 0;
			local1111 = this.anInt8297;
			local1398 = 0;
			local1089 = this.aShortArray110[0];
			@Pc(2982) short local2982 = 0;
			for (local730 = 0; local730 < this.anInt8268; local730++) {
				@Pc(2991) short local2991 = this.aShortArray110[local730];
				if (local1089 != local2991) {
					this.anIntArray461[local1398] = local1111;
					this.anIntArray462[local1398] = local2982 + 1 - local1111;
					local1398++;
					this.anIntArray465[local1398] = local730;
					local2982 = 0;
					local1089 = local2991;
					local1111 = this.anInt8297;
				}
				@Pc(3027) short local3027 = this.aShortArray112[local730];
				if (local1111 > local3027) {
					local1111 = local3027;
				}
				if (local3027 > local2982) {
					local2982 = local3027;
				}
				local3027 = this.aShortArray113[local730];
				if (local2982 < local3027) {
					local2982 = local3027;
				}
				if (local1111 > local3027) {
					local1111 = local3027;
				}
				local3027 = this.aShortArray114[local730];
				if (local3027 > local2982) {
					local2982 = local3027;
				}
				if (local3027 < local1111) {
					local1111 = local3027;
				}
			}
			this.anIntArray461[local1398] = local1111;
			this.anIntArray462[local1398] = local2982 + 1 - local1111;
			local1398++;
			this.anIntArray465[local1398] = this.anInt8268;
		}
		Static87.aLongArray2 = null;
		this.aShortArray109 = Static194.method3197(this.aShortArray109, this.anInt8297);
		this.aShortArray116 = Static194.method3197(this.aShortArray116, this.anInt8297);
		this.aShortArray117 = Static194.method3197(this.aShortArray117, this.anInt8297);
		this.aShortArray115 = Static194.method3197(this.aShortArray115, this.anInt8297);
		this.aShortArray119 = Static194.method3197(this.aShortArray119, this.anInt8297);
		this.aByteArray77 = Static80.method1712(this.anInt8297, this.aByteArray77);
		this.aFloatArray64 = Static581.method8132(this.aFloatArray64, this.anInt8297);
		this.aFloatArray63 = Static581.method8132(this.aFloatArray63, this.anInt8297);
		if (arg1.anIntArray76 != null && Static296.method4735(this.anInt8252, arg2)) {
			this.anIntArrayArray47 = arg1.method1582(false);
		}
		if (arg1.aClass138Array1 != null && Static515.method3259(this.anInt8252, arg2)) {
			this.anIntArrayArray45 = arg1.method1577();
		}
		if (arg1.anIntArray80 != null && Static176.method2924(arg2, this.anInt8252)) {
			local1398 = 0;
			local683 = new int[256];
			for (local1100 = 0; local1100 < this.anInt8281; local1100++) {
				local1111 = arg1.anIntArray80[local22[local1100]];
				if (local1111 >= 0) {
					if (local1111 > local1398) {
						local1398 = local1111;
					}
					@Pc(3236) int local3236 = local683[local1111]++;
				}
			}
			this.anIntArrayArray46 = new int[local1398 + 1][];
			for (local1111 = 0; local1111 <= local1398; local1111++) {
				this.anIntArrayArray46[local1111] = new int[local683[local1111]];
				local683[local1111] = 0;
			}
			for (local691 = 0; local691 < this.anInt8281; local691++) {
				local730 = arg1.anIntArray80[local22[local691]];
				if (local730 >= 0) {
					this.anIntArrayArray46[local730][local683[local730]++] = local691;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!nh;IIZZ)V")
	public Class65_Sub3(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8243 = 0;
		this.aBoolean589 = true;
		this.aBoolean588 = false;
		this.aBoolean590 = false;
		this.aBoolean591 = false;
		this.anInt8268 = 0;
		this.anInt8301 = 0;
		this.anInt8297 = 0;
		this.anInt8281 = 0;
		this.anInt8246 = arg1;
		this.anInt8252 = arg2;
		this.aBoolean590 = arg4;
		this.aClass7_Sub1_15 = arg0;
		if (arg3 || Static290.method4715(this.anInt8246, this.anInt8252)) {
			this.aClass352_1 = new Class352(Static363.method5477(this.anInt8246, this.anInt8252));
		}
		if (arg3 || Static315.method4962(this.anInt8252, this.anInt8246)) {
			this.aClass352_3 = new Class352(Static432.method6461(this.anInt8252, this.anInt8246));
		}
		if (arg3 || Static246.method3936(this.anInt8252, this.anInt8246)) {
			this.aClass352_2 = new Class352(Static276.method4454(this.anInt8246, this.anInt8252));
		}
		if (arg3 || Static187.method3084(this.anInt8246, this.anInt8252)) {
			this.lb = new Class352(Static371.method5564(this.anInt8246, this.anInt8252));
		}
		if (arg3 || Static173.method2882(this.anInt8246, this.anInt8252)) {
			this.aClass145_1 = new Class145(Static448.method7383(this.anInt8246, this.anInt8252));
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZILclient!qh;ZLclient!qh;)Lclient!da;")
	private Class65 method6423(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class65_Sub3 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class65_Sub3 arg4) {
		arg4.anInt8281 = this.anInt8281;
		if ((arg1 & 0x100) == 0) {
			arg4.aBoolean591 = this.aBoolean591;
		} else {
			arg4.aBoolean591 = true;
		}
		arg4.anInt8252 = this.anInt8252;
		arg4.anInt8307 = this.anInt8307;
		arg4.aShort103 = this.aShort103;
		arg4.anInt8301 = this.anInt8301;
		arg4.anInt8243 = this.anInt8243;
		arg4.anInt8268 = this.anInt8268;
		arg4.aShort102 = this.aShort102;
		arg4.anInt8297 = this.anInt8297;
		arg4.anInt8246 = arg1;
		@Pc(64) boolean local64 = Static345.method5260(this.anInt8252, arg1);
		@Pc(70) boolean local70 = Static305.method4819(this.anInt8252, arg1);
		@Pc(76) boolean local76 = Static195.method6871(this.anInt8252, arg1);
		@Pc(82) boolean local82 = local76 | local64 | local70;
		@Pc(193) int local193;
		if (local82) {
			if (!local64) {
				arg4.anIntArray460 = this.anIntArray460;
			} else if (arg2.anIntArray460 == null || this.anInt8301 > arg2.anIntArray460.length) {
				arg4.anIntArray460 = arg2.anIntArray460 = new int[this.anInt8301];
			} else {
				arg4.anIntArray460 = arg2.anIntArray460;
			}
			if (!local70) {
				arg4.anIntArray463 = this.anIntArray463;
			} else if (arg2.anIntArray463 == null || arg2.anIntArray463.length < this.anInt8301) {
				arg4.anIntArray463 = arg2.anIntArray463 = new int[this.anInt8301];
			} else {
				arg4.anIntArray463 = arg2.anIntArray463;
			}
			if (!local76) {
				arg4.anIntArray459 = this.anIntArray459;
			} else if (arg2.anIntArray459 == null || arg2.anIntArray459.length < this.anInt8301) {
				arg4.anIntArray459 = arg2.anIntArray459 = new int[this.anInt8301];
			} else {
				arg4.anIntArray459 = arg2.anIntArray459;
			}
			for (local193 = 0; local193 < this.anInt8301; local193++) {
				if (local64) {
					arg4.anIntArray460[local193] = this.anIntArray460[local193];
				}
				if (local70) {
					arg4.anIntArray463[local193] = this.anIntArray463[local193];
				}
				if (local76) {
					arg4.anIntArray459[local193] = this.anIntArray459[local193];
				}
			}
		} else {
			arg4.anIntArray463 = this.anIntArray463;
			arg4.anIntArray459 = this.anIntArray459;
			arg4.anIntArray460 = this.anIntArray460;
		}
		if (Static363.method5477(arg1, this.anInt8252)) {
			arg4.aClass352_1 = arg2.aClass352_1;
			arg4.aClass352_1.aBoolean706 = true;
			arg4.aClass352_1.anInterface24_15 = this.aClass352_1.anInterface24_15;
			arg4.aClass352_1.aBoolean705 = this.aClass352_1.aBoolean705;
		} else if (Static290.method4715(arg1, this.anInt8252)) {
			arg4.aClass352_1 = this.aClass352_1;
		} else {
			arg4.aClass352_1 = null;
		}
		if (Static249.method2740(arg1, this.anInt8252)) {
			if (arg2.aShortArray108 == null || this.anInt8281 > arg2.aShortArray108.length) {
				arg4.aShortArray108 = arg2.aShortArray108 = new short[this.anInt8281];
			} else {
				arg4.aShortArray108 = arg2.aShortArray108;
			}
			for (local193 = 0; local193 < this.anInt8281; local193++) {
				arg4.aShortArray108[local193] = this.aShortArray108[local193];
			}
		} else {
			arg4.aShortArray108 = this.aShortArray108;
		}
		if (Static494.method7140(arg1, this.anInt8252)) {
			if (arg2.aByteArray76 == null || this.anInt8281 > arg2.aByteArray76.length) {
				arg4.aByteArray76 = arg2.aByteArray76 = new byte[this.anInt8281];
			} else {
				arg4.aByteArray76 = arg2.aByteArray76;
			}
			for (local193 = 0; local193 < this.anInt8281; local193++) {
				arg4.aByteArray76[local193] = this.aByteArray76[local193];
			}
		} else {
			arg4.aByteArray76 = this.aByteArray76;
		}
		if (Static276.method4454(arg1, this.anInt8252)) {
			arg4.aClass352_2 = arg2.aClass352_2;
			arg4.aClass352_2.aBoolean706 = true;
			arg4.aClass352_2.anInterface24_15 = this.aClass352_2.anInterface24_15;
			arg4.aClass352_2.aBoolean705 = this.aClass352_2.aBoolean705;
		} else if (Static246.method3936(this.anInt8252, arg1)) {
			arg4.aClass352_2 = this.aClass352_2;
		} else {
			arg4.aClass352_2 = null;
		}
		@Pc(584) int local584;
		if (Static571.method8035(arg1, this.anInt8252)) {
			if (arg2.aShortArray117 == null || arg2.aShortArray117.length < this.anInt8297) {
				local193 = this.anInt8297;
				arg4.aShortArray119 = arg2.aShortArray119 = new short[local193];
				arg4.aShortArray115 = arg2.aShortArray115 = new short[local193];
				arg4.aShortArray117 = arg2.aShortArray117 = new short[local193];
			} else {
				arg4.aShortArray119 = arg2.aShortArray119;
				arg4.aShortArray115 = arg2.aShortArray115;
				arg4.aShortArray117 = arg2.aShortArray117;
			}
			if (this.aClass219_1 == null) {
				arg4.aClass219_1 = null;
				for (local193 = 0; local193 < this.anInt8297; local193++) {
					arg4.aShortArray117[local193] = this.aShortArray117[local193];
					arg4.aShortArray115[local193] = this.aShortArray115[local193];
					arg4.aShortArray119[local193] = this.aShortArray119[local193];
				}
			} else {
				if (arg2.aClass219_1 == null) {
					arg2.aClass219_1 = new Class219();
				}
				@Pc(572) Class219 local572 = arg4.aClass219_1 = arg2.aClass219_1;
				if (local572.aShortArray70 == null || local572.aShortArray70.length < this.anInt8297) {
					local584 = this.anInt8297;
					local572.aShortArray70 = new short[local584];
					local572.aByteArray55 = new byte[local584];
					local572.aShortArray69 = new short[local584];
					local572.aShortArray71 = new short[local584];
				}
				for (local584 = 0; local584 < this.anInt8297; local584++) {
					arg4.aShortArray117[local584] = this.aShortArray117[local584];
					arg4.aShortArray115[local584] = this.aShortArray115[local584];
					arg4.aShortArray119[local584] = this.aShortArray119[local584];
					local572.aShortArray70[local584] = this.aClass219_1.aShortArray70[local584];
					local572.aShortArray69[local584] = this.aClass219_1.aShortArray69[local584];
					local572.aShortArray71[local584] = this.aClass219_1.aShortArray71[local584];
					local572.aByteArray55[local584] = this.aClass219_1.aByteArray55[local584];
				}
			}
			arg4.aByteArray77 = this.aByteArray77;
		} else {
			arg4.aShortArray119 = this.aShortArray119;
			arg4.aClass219_1 = this.aClass219_1;
			arg4.aShortArray117 = this.aShortArray117;
			arg4.aByteArray77 = this.aByteArray77;
			arg4.aShortArray115 = this.aShortArray115;
		}
		if (Static371.method5564(arg1, this.anInt8252)) {
			arg4.lb = arg2.lb;
			arg4.lb.aBoolean706 = true;
			arg4.lb.anInterface24_15 = this.lb.anInterface24_15;
			arg4.lb.aBoolean705 = this.lb.aBoolean705;
		} else if (Static187.method3084(arg1, this.anInt8252)) {
			arg4.lb = this.lb;
		} else {
			arg4.lb = null;
		}
		if (Static155.method2652(this.anInt8252, arg1)) {
			if (arg2.aFloatArray64 == null || arg2.aFloatArray64.length < this.anInt8281) {
				local193 = this.anInt8297;
				arg4.aFloatArray64 = arg2.aFloatArray64 = new float[local193];
				arg4.aFloatArray63 = arg2.aFloatArray63 = new float[local193];
			} else {
				arg4.aFloatArray63 = arg2.aFloatArray63;
				arg4.aFloatArray64 = arg2.aFloatArray64;
			}
			for (local193 = 0; local193 < this.anInt8297; local193++) {
				arg4.aFloatArray64[local193] = this.aFloatArray64[local193];
				arg4.aFloatArray63[local193] = this.aFloatArray63[local193];
			}
		} else {
			arg4.aFloatArray64 = this.aFloatArray64;
			arg4.aFloatArray63 = this.aFloatArray63;
		}
		if (Static432.method6461(this.anInt8252, arg1)) {
			arg4.aClass352_3 = arg2.aClass352_3;
			arg4.aClass352_3.aBoolean705 = this.aClass352_3.aBoolean705;
			arg4.aClass352_3.aBoolean706 = true;
			arg4.aClass352_3.anInterface24_15 = this.aClass352_3.anInterface24_15;
		} else if (Static315.method4962(this.anInt8252, arg1)) {
			arg4.aClass352_3 = this.aClass352_3;
		} else {
			arg4.aClass352_3 = null;
		}
		if (Static190.method3138(this.anInt8252, arg1)) {
			if (arg2.aShortArray112 == null || arg2.aShortArray112.length < this.anInt8281) {
				local193 = this.anInt8281;
				arg4.aShortArray112 = arg2.aShortArray112 = new short[local193];
				arg4.aShortArray114 = arg2.aShortArray114 = new short[local193];
				arg4.aShortArray113 = arg2.aShortArray113 = new short[local193];
			} else {
				arg4.aShortArray113 = arg2.aShortArray113;
				arg4.aShortArray112 = arg2.aShortArray112;
				arg4.aShortArray114 = arg2.aShortArray114;
			}
			for (local193 = 0; local193 < this.anInt8281; local193++) {
				arg4.aShortArray112[local193] = this.aShortArray112[local193];
				arg4.aShortArray113[local193] = this.aShortArray113[local193];
				arg4.aShortArray114[local193] = this.aShortArray114[local193];
			}
		} else {
			arg4.aShortArray114 = this.aShortArray114;
			arg4.aShortArray113 = this.aShortArray113;
			arg4.aShortArray112 = this.aShortArray112;
		}
		if (Static448.method7383(arg1, this.anInt8252)) {
			arg4.aClass145_1 = arg2.aClass145_1;
			arg4.aClass145_1.anInterface6_5 = this.aClass145_1.anInterface6_5;
			arg4.aClass145_1.aBoolean305 = true;
			arg4.aClass145_1.aBoolean304 = this.aClass145_1.aBoolean304;
		} else if (Static173.method2882(arg1, this.anInt8252)) {
			arg4.aClass145_1 = this.aClass145_1;
		} else {
			arg4.aClass145_1 = null;
		}
		if (Static579.method8125(arg1, this.anInt8252)) {
			if (arg2.aShortArray110 == null || this.anInt8281 > arg2.aShortArray110.length) {
				local193 = this.anInt8281;
				arg4.aShortArray110 = arg2.aShortArray110 = new short[local193];
			} else {
				arg4.aShortArray110 = arg2.aShortArray110;
			}
			for (local193 = 0; local193 < this.anInt8281; local193++) {
				arg4.aShortArray110[local193] = this.aShortArray110[local193];
			}
		} else {
			arg4.aShortArray110 = this.aShortArray110;
		}
		if (!Static541.method7577(this.anInt8252, arg1)) {
			arg4.aClass243Array1 = this.aClass243Array1;
		} else if (arg2.aClass243Array1 == null || this.anInt8307 > arg2.aClass243Array1.length) {
			local193 = this.anInt8307;
			arg4.aClass243Array1 = arg2.aClass243Array1 = new Class243[local193];
			for (local584 = 0; local584 < this.anInt8307; local584++) {
				arg4.aClass243Array1[local584] = this.aClass243Array1[local584].method5552();
			}
		} else {
			arg4.aClass243Array1 = arg2.aClass243Array1;
			for (local193 = 0; local193 < this.anInt8307; local193++) {
				arg4.aClass243Array1[local193].method5553(this.aClass243Array1[local193]);
			}
		}
		arg4.anIntArrayArray45 = this.anIntArrayArray45;
		arg4.anIntArray464 = this.anIntArray464;
		arg4.aShortArray120 = this.aShortArray120;
		if (this.aBoolean588) {
			arg4.anInt8230 = this.anInt8230;
			arg4.anInt8248 = this.anInt8248;
			arg4.anInt8292 = this.anInt8292;
			arg4.anInt8269 = this.anInt8269;
			arg4.anInt8249 = this.anInt8249;
			arg4.anInt8282 = this.anInt8282;
			arg4.aBoolean588 = true;
			arg4.anInt8237 = this.anInt8237;
			arg4.anInt8232 = this.anInt8232;
		} else {
			arg4.aBoolean588 = false;
		}
		arg4.aShortArray118 = this.aShortArray118;
		arg4.anIntArray465 = this.anIntArray465;
		arg4.anIntArray461 = this.anIntArray461;
		arg4.aShortArray111 = this.aShortArray111;
		arg4.aShortArray116 = this.aShortArray116;
		arg4.aClass52Array4 = this.aClass52Array4;
		arg4.anIntArrayArray47 = this.anIntArrayArray47;
		arg4.anIntArrayArray46 = this.anIntArrayArray46;
		arg4.aClass190Array3 = this.aClass190Array3;
		arg4.aShortArray109 = this.aShortArray109;
		arg4.aClass328Array1 = this.aClass328Array1;
		arg4.anIntArray462 = this.anIntArray462;
		return arg4;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	private void method6424() {
		if (this.aClass352_1 != null) {
			this.aClass352_1.aBoolean705 = false;
		}
	}

	@OriginalMember(owner = "client!qh", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray420[arg0];
		@Pc(13) int local13 = Class262.anIntArray421[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8243; local15++) {
			local33 = local9 * this.anIntArray459[local15] + this.anIntArray460[local15] * local13 >> 14;
			this.anIntArray459[local15] = this.anIntArray459[local15] * local13 - this.anIntArray460[local15] * local9 >> 14;
			this.anIntArray460[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt8297; local33++) {
			@Pc(83) int local83 = local9 * this.aShortArray119[local33] + local13 * this.aShortArray117[local33] >> 14;
			this.aShortArray119[local33] = (short) (this.aShortArray119[local33] * local13 - this.aShortArray117[local33] * local9 >> 14);
			this.aShortArray117[local33] = (short) local83;
		}
		this.method6424();
		this.method6425();
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
	private void method6425() {
		if ((this.anInt8252 & 0x37) == 0) {
			if (this.aClass352_2 != null) {
				this.aClass352_2.aBoolean705 = false;
			}
		} else if (this.lb != null) {
			this.lb.aBoolean705 = false;
		}
	}

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort102 = (short) arg0;
		this.method6432();
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "()[Lclient!kw;")
	@Override
	public Class190[] method7675() {
		return this.aClass190Array3;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!q;Lclient!j;I)V")
	@Override
	public void method7679(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8297 == 0) {
			return;
		}
		@Pc(16) Class81_Sub1 local16 = this.aClass7_Sub1_15.aClass81_Sub1_16;
		@Pc(19) Class81_Sub1 local19 = (Class81_Sub1) arg0;
		if (!this.aBoolean588) {
			this.method6439();
		}
		Static362.aFloat162 = local16.aFloat65 * local19.aFloat56 + local16.aFloat58 * local19.aFloat64 + local16.aFloat54 * local19.aFloat60 + local16.aFloat56;
		Static563.aFloat204 = local16.aFloat54 * local19.aFloat57 + local16.aFloat58 * local19.aFloat55 + local19.aFloat58 * local16.aFloat65;
		@Pc(72) float local72 = Static362.aFloat162 + Static563.aFloat204 * (float) this.anInt8269;
		@Pc(80) float local80 = Static563.aFloat204 * (float) this.anInt8292 + Static362.aFloat162;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local90 = (float) -this.anInt8230 + local80;
			local96 = local72 + (float) this.anInt8230;
		} else {
			local90 = local72 - (float) this.anInt8230;
			local96 = (float) this.anInt8230 + local80;
		}
		if (local90 >= this.aClass7_Sub1_15.aFloat172 || local96 <= (float) this.aClass7_Sub1_15.anInt7356) {
			return;
		}
		Static331.aFloat205 = local16.aFloat57 * local19.aFloat55 + local19.aFloat57 * local16.aFloat59 + local19.aFloat58 * local16.aFloat62;
		Static443.aFloat189 = local16.aFloat62 * local19.aFloat56 + local19.aFloat60 * local16.aFloat59 + local19.aFloat64 * local16.aFloat57 + local16.aFloat60;
		@Pc(173) float local173 = Static443.aFloat189 + Static331.aFloat205 * (float) this.anInt8269;
		@Pc(181) float local181 = Static331.aFloat205 * (float) this.anInt8292 + Static443.aFloat189;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local181 < local173) {
			local208 = (float) this.aClass7_Sub1_15.anInt7367 * (local173 + (float) this.anInt8230);
			local197 = (float) this.aClass7_Sub1_15.anInt7367 * ((float) -this.anInt8230 + local181);
		} else {
			local197 = (float) this.aClass7_Sub1_15.anInt7367 * ((float) -this.anInt8230 + local173);
			local208 = ((float) this.anInt8230 + local181) * (float) this.aClass7_Sub1_15.anInt7367;
		}
		if (local197 / local96 >= this.aClass7_Sub1_15.aFloat166 || local208 / local96 <= this.aClass7_Sub1_15.aFloat167) {
			return;
		}
		Static282.aFloat148 = local19.aFloat58 * local16.aFloat61 + local19.aFloat57 * local16.aFloat63 + local16.aFloat55 * local19.aFloat55;
		Static414.aFloat187 = local16.aFloat64 + local16.aFloat61 * local19.aFloat56 + local16.aFloat63 * local19.aFloat60 + local16.aFloat55 * local19.aFloat64;
		@Pc(298) float local298 = Static414.aFloat187 + Static282.aFloat148 * (float) this.anInt8269;
		@Pc(306) float local306 = Static414.aFloat187 + Static282.aFloat148 * (float) this.anInt8292;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local306 < local298) {
			local321 = (float) this.aClass7_Sub1_15.anInt7352 * (local306 - (float) this.anInt8230);
			local332 = (local298 + (float) this.anInt8230) * (float) this.aClass7_Sub1_15.anInt7352;
		} else {
			local321 = (local298 - (float) this.anInt8230) * (float) this.aClass7_Sub1_15.anInt7352;
			local332 = (local306 + (float) this.anInt8230) * (float) this.aClass7_Sub1_15.anInt7352;
		}
		if (local321 / local96 >= this.aClass7_Sub1_15.aFloat179 || local332 / local96 <= this.aClass7_Sub1_15.aFloat165) {
			return;
		}
		if (arg1 != null || this.aClass328Array1 != null) {
			Static483.aFloat192 = local19.aFloat65 * local16.aFloat61 + local16.aFloat63 * local19.aFloat62 + local19.aFloat61 * local16.aFloat55;
			Static263.aFloat126 = local16.aFloat57 * local19.aFloat63 + local19.aFloat59 * local16.aFloat59 + local16.aFloat62 * local19.aFloat54;
			Static263.aFloat125 = local16.aFloat65 * local19.aFloat65 + local19.aFloat61 * local16.aFloat58 + local19.aFloat62 * local16.aFloat54;
			Static6.aFloat35 = local19.aFloat54 * local16.aFloat61 + local16.aFloat55 * local19.aFloat63 + local16.aFloat63 * local19.aFloat59;
			Static455.aFloat191 = local16.aFloat57 * local19.aFloat61 + local16.aFloat59 * local19.aFloat62 + local16.aFloat62 * local19.aFloat65;
			Static212.aFloat101 = local16.aFloat65 * local19.aFloat54 + local16.aFloat54 * local19.aFloat59 + local16.aFloat58 * local19.aFloat63;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.anInt8249 + this.anInt8282 >> 1;
			@Pc(509) int local509 = this.anInt8232 + this.anInt8237 >> 1;
			@Pc(528) int local528 = (int) (Static455.aFloat191 * (float) local509 + (float) local501 * Static263.aFloat126 + Static443.aFloat189 + (float) this.anInt8269 * Static331.aFloat205);
			@Pc(547) int local547 = (int) (Static282.aFloat148 * (float) this.anInt8269 + (float) local501 * Static6.aFloat35 + Static414.aFloat187 + (float) local509 * Static483.aFloat192);
			@Pc(566) int local566 = (int) (Static563.aFloat204 * (float) this.anInt8269 + Static362.aFloat162 + Static212.aFloat101 * (float) local501 + Static263.aFloat125 * (float) local509);
			if (this.aClass7_Sub1_15.anInt7356 <= local566) {
				arg1.anInt4887 = this.aClass7_Sub1_15.anInt7367 * local528 / local566 + this.aClass7_Sub1_15.anInt7349;
				arg1.anInt4885 = local547 * this.aClass7_Sub1_15.anInt7352 / local566 + this.aClass7_Sub1_15.anInt7360;
			} else {
				local491 = true;
			}
			@Pc(620) int local620 = (int) ((float) local509 * Static455.aFloat191 + (float) local501 * Static263.aFloat126 + Static443.aFloat189 + (float) this.anInt8292 * Static331.aFloat205);
			@Pc(639) int local639 = (int) (Static483.aFloat192 * (float) local509 + Static6.aFloat35 * (float) local501 + Static414.aFloat187 + Static282.aFloat148 * (float) this.anInt8292);
			@Pc(658) int local658 = (int) (Static362.aFloat162 + (float) local501 * Static212.aFloat101 + Static563.aFloat204 * (float) this.anInt8292 + (float) local509 * Static263.aFloat125);
			if (local658 < this.aClass7_Sub1_15.anInt7356) {
				local491 = true;
			} else {
				arg1.anInt4883 = local639 * this.aClass7_Sub1_15.anInt7352 / local658 + this.aClass7_Sub1_15.anInt7360;
				arg1.anInt4884 = this.aClass7_Sub1_15.anInt7349 + this.aClass7_Sub1_15.anInt7367 * local620 / local658;
			}
			if (local491) {
				if (this.aClass7_Sub1_15.anInt7356 > local566 && local658 < this.aClass7_Sub1_15.anInt7356) {
					local493 = false;
				} else {
					@Pc(736) int local736;
					@Pc(748) int local748;
					@Pc(760) int local760;
					if (local566 < this.aClass7_Sub1_15.anInt7356) {
						local736 = (local658 - this.aClass7_Sub1_15.anInt7356 << 16) / (local658 - local566);
						local748 = local620 + (local736 * (local620 - local528) >> 16);
						local760 = local639 + (local736 * (local639 - local547) >> 16);
						arg1.anInt4887 = this.aClass7_Sub1_15.anInt7349 + this.aClass7_Sub1_15.anInt7367 * local748 / this.aClass7_Sub1_15.anInt7356;
						arg1.anInt4885 = this.aClass7_Sub1_15.anInt7352 * local760 / this.aClass7_Sub1_15.anInt7356 + this.aClass7_Sub1_15.anInt7360;
					} else if (local658 < this.aClass7_Sub1_15.anInt7356) {
						local736 = (local566 - this.aClass7_Sub1_15.anInt7356 << 16) / (local566 - local658);
						local748 = local528 + (local736 * (local528 - local620) >> 16);
						arg1.anInt4887 = local748 * this.aClass7_Sub1_15.anInt7367 / this.aClass7_Sub1_15.anInt7356 + this.aClass7_Sub1_15.anInt7349;
						local760 = local547 + (local736 * (local547 - local639) >> 16);
						arg1.anInt4885 = this.aClass7_Sub1_15.anInt7360 + this.aClass7_Sub1_15.anInt7352 * local760 / this.aClass7_Sub1_15.anInt7356;
					}
				}
			}
			if (local493) {
				if (local566 > local658) {
					arg1.anInt4886 = (this.anInt8230 + local528) * this.aClass7_Sub1_15.anInt7367 / local566 + this.aClass7_Sub1_15.anInt7349 - arg1.anInt4887;
				} else {
					arg1.anInt4886 = this.aClass7_Sub1_15.anInt7367 * (local620 + this.anInt8230) / local658 + this.aClass7_Sub1_15.anInt7349 - arg1.anInt4884;
				}
				arg1.aBoolean341 = true;
			}
		}
		this.aClass7_Sub1_15.method5720();
		this.aClass7_Sub1_15.method5700(local19);
		this.method6437();
		this.method6436();
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "()Z")
	@Override
	public boolean method7687() {
		if (this.aShortArray110 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray110.length; local12++) {
			if (this.aShortArray110[local12] != -1 && !this.aClass7_Sub1_15.anInterface7_12.method4463(this.aShortArray110[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) boolean arg3) {
		return this.method6434(-1, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)Z")
	private boolean method6426() {
		@Pc(13) boolean local13 = !this.aClass352_2.aBoolean705;
		@Pc(37) boolean local37 = (this.anInt8252 & 0x37) != 0 && !this.lb.aBoolean705;
		@Pc(45) boolean local45 = !this.aClass352_1.aBoolean705;
		@Pc(53) boolean local53 = !this.aClass352_3.aBoolean705;
		if (!local45 && !local13 && !local37 && !local53) {
			return true;
		}
		@Pc(65) boolean local65 = true;
		@Pc(84) Interface24 local84;
		@Pc(98) Buffer local98;
		if (local45) {
			if (this.aClass352_1.anInterface24_14 == null) {
				this.aClass352_1.anInterface24_14 = this.aClass7_Sub1_15.method5704(this.aBoolean590);
			}
			local84 = this.aClass352_1.anInterface24_14;
			local84.method6549(this.anInt8297 * 12, 12);
			local98 = local84.method6550();
			if (local98 == null) {
				local65 = false;
			} else {
				this.aClass7_Sub1_15.aNativeInterface3.copyPositions(this.anIntArray460, this.anIntArray463, this.anIntArray459, this.aShortArray109, 0, 12, this.anInt8297, local98.getAddress());
				if (local84.method6551()) {
					this.aClass352_1.aBoolean705 = true;
					this.aClass352_1.anInterface24_15 = local84;
				} else {
					local65 = false;
				}
			}
		}
		@Pc(196) short[] local196;
		@Pc(192) short[] local192;
		@Pc(188) short[] local188;
		@Pc(200) byte[] local200;
		if (local13) {
			if (this.aClass352_2.anInterface24_14 == null) {
				this.aClass352_2.anInterface24_14 = this.aClass7_Sub1_15.method5704(this.aBoolean590);
			}
			local84 = this.aClass352_2.anInterface24_14;
			local84.method6549(this.anInt8297 * 4, 4);
			local98 = local84.method6550();
			if (local98 == null) {
				local65 = false;
			} else {
				if ((this.anInt8252 & 0x37) == 0) {
					if (this.aClass219_1 == null) {
						local200 = this.aByteArray77;
						local196 = this.aShortArray117;
						local188 = this.aShortArray119;
						local192 = this.aShortArray115;
					} else {
						local188 = this.aClass219_1.aShortArray71;
						local192 = this.aClass219_1.aShortArray69;
						local196 = this.aClass219_1.aShortArray70;
						local200 = this.aClass219_1.aByteArray55;
					}
					this.aClass7_Sub1_15.aNativeInterface3.copyLighting(this.aShortArray108, this.aByteArray76, this.aShortArray110, local196, local192, local188, local200, this.aShort102, this.aShort103, this.aShortArray116, 0, 4, this.anInt8297, local98.getAddress());
				} else {
					this.aClass7_Sub1_15.aNativeInterface3.copyColours(this.aShortArray108, this.aByteArray76, this.aShortArray110, this.aShort102, this.aShortArray116, 0, 4, this.anInt8297, local98.getAddress());
				}
				if (local84.method6551()) {
					this.aClass352_2.anInterface24_15 = local84;
					this.aClass352_2.aBoolean705 = true;
				} else {
					local65 = false;
				}
			}
		}
		if (local37) {
			if (this.lb.anInterface24_14 == null) {
				this.lb.anInterface24_14 = this.aClass7_Sub1_15.method5704(this.aBoolean590);
			}
			local84 = this.lb.anInterface24_14;
			local84.method6549(this.anInt8297 * 12, 12);
			local98 = local84.method6550();
			if (local98 == null) {
				local65 = false;
			} else {
				if (this.aClass219_1 == null) {
					local192 = this.aShortArray115;
					local188 = this.aShortArray119;
					local200 = this.aByteArray77;
					local196 = this.aShortArray117;
				} else {
					local192 = this.aClass219_1.aShortArray69;
					local200 = this.aClass219_1.aByteArray55;
					local196 = this.aClass219_1.aShortArray70;
					local188 = this.aClass219_1.aShortArray71;
				}
				this.aClass7_Sub1_15.aNativeInterface3.copyNormals(local196, local192, local188, local200, 3.0F / (float) this.aShort103, 3.0F / (float) (this.aShort103 / 2 + this.aShort103), 0, 12, this.anInt8297, local98.getAddress());
				if (local84.method6551()) {
					this.lb.aBoolean705 = true;
					this.lb.anInterface24_15 = local84;
				} else {
					local65 = false;
				}
			}
		}
		if (local53) {
			if (this.aClass352_3.anInterface24_14 == null) {
				this.aClass352_3.anInterface24_14 = this.aClass7_Sub1_15.method5704(this.aBoolean590);
			}
			local84 = this.aClass352_3.anInterface24_14;
			local84.method6549(this.anInt8297 * 8, 8);
			local98 = local84.method6550();
			if (local98 == null) {
				local65 = false;
			} else {
				this.aClass7_Sub1_15.aNativeInterface3.copyTexCoords(this.aFloatArray64, this.aFloatArray63, 0, 8, this.anInt8297, local98.getAddress());
				if (local84.method6551()) {
					this.aClass352_3.aBoolean705 = true;
					this.aClass352_3.anInterface24_15 = local84;
				} else {
					local65 = false;
				}
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean588) {
			this.method6439();
		}
		return this.anInt8269;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class65 method7682(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class65_Sub3 local14;
		@Pc(18) Class65_Sub3 local18;
		if (arg0 == 1) {
			local14 = this.aClass7_Sub1_15.aClass65_Sub3_21;
			local18 = this.aClass7_Sub1_15.aClass65_Sub3_23;
		} else if (arg0 == 2) {
			local18 = this.aClass7_Sub1_15.aClass65_Sub3_28;
			local14 = this.aClass7_Sub1_15.aClass65_Sub3_27;
		} else if (arg0 == 3) {
			local14 = this.aClass7_Sub1_15.aClass65_Sub3_22;
			local18 = this.aClass7_Sub1_15.aClass65_Sub3_26;
		} else if (arg0 == 4) {
			local18 = this.aClass7_Sub1_15.aClass65_Sub3_24;
			local14 = this.aClass7_Sub1_15.aClass65_Sub3_30;
		} else if (arg0 == 5) {
			local18 = this.aClass7_Sub1_15.aClass65_Sub3_25;
			local14 = this.aClass7_Sub1_15.aClass65_Sub3_29;
		} else {
			local14 = local18 = new Class65_Sub3(this.aClass7_Sub1_15, 0, 0, true, false);
		}
		return this.method6423(arg0 != 0, arg1, local18, arg2, local14);
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
	public void method6427() {
		if (this.aClass352_1 != null) {
			this.aClass352_1.method8017();
		}
		if (this.aClass352_3 != null) {
			this.aClass352_3.method8017();
		}
		if (this.aClass352_2 != null) {
			this.aClass352_2.method8017();
		}
		if (this.lb != null) {
			this.lb.method8017();
		}
		if (this.aClass145_1 != null) {
			this.aClass145_1.method3359();
		}
	}

	@OriginalMember(owner = "client!qh", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass352_1 != null) {
			this.aClass352_1.aBoolean706 = Static363.method5477(arg0, this.anInt8252);
		}
		if (this.aClass352_3 != null) {
			this.aClass352_3.aBoolean706 = Static432.method6461(this.anInt8252, arg0);
		}
		if (this.aClass352_2 != null) {
			this.aClass352_2.aBoolean706 = Static276.method4454(arg0, this.anInt8252);
		}
		if (this.lb != null) {
			this.lb.aBoolean706 = Static371.method5564(arg0, this.anInt8252);
		}
		this.anInt8246 = arg0;
		if (this.aClass219_1 != null && (this.anInt8246 & 0x10000) == 0) {
			this.aByteArray77 = this.aClass219_1.aByteArray55;
			this.aShortArray117 = this.aClass219_1.aShortArray70;
			this.aShortArray119 = this.aClass219_1.aShortArray71;
			this.aShortArray115 = this.aClass219_1.aShortArray69;
			this.aClass219_1 = null;
		}
		this.aBoolean589 = true;
		this.method6430();
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	private void method6428() {
		if (this.aClass145_1 != null) {
			this.aClass145_1.aBoolean304 = false;
		}
	}

	@OriginalMember(owner = "client!qh", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray420[arg0];
		@Pc(13) int local13 = Class262.anIntArray421[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8243; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray463[local15] - local9 * this.anIntArray459[local15] >> 14;
			this.anIntArray459[local15] = local9 * this.anIntArray463[local15] + this.anIntArray459[local15] * local13 >> 14;
			this.anIntArray463[local15] = local33;
		}
		this.method6424();
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6434(arg4, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean588) {
			this.method6439();
		}
		return this.anInt8249;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()V")
	@Override
	protected void method7671() {
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8281; local7++) {
			if (this.aShortArray108[local7] == arg0) {
				this.aShortArray108[local7] = arg1;
			}
		}
		if (this.aClass328Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt8307; local34++) {
				@Pc(41) Class328 local41 = this.aClass328Array1[local34];
				@Pc(46) Class243 local46 = this.aClass243Array1[local34];
				local46.anInt7119 = local46.anInt7119 & 0xFF000000 | Static394.anIntArray413[this.aShortArray108[local41.anInt9778] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6432();
	}

	@OriginalMember(owner = "client!qh", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8243; local7++) {
			if (arg0 != 128) {
				this.anIntArray460[local7] = this.anIntArray460[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray463[local7] = this.anIntArray463[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray459[local7] = this.anIntArray459[local7] * arg2 >> 7;
			}
		}
		this.method6424();
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(FILclient!cr;IIIIJFII)S")
	private short method6429(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray464[arg3];
		@Pc(17) int local17 = this.anIntArray464[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray111[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static87.aLongArray2[local21] == arg6) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray111[local19] = (short) (this.anInt8297 + 1);
		Static87.aLongArray2[local19] = arg6;
		this.aShortArray116[this.anInt8297] = (short) arg8;
		this.aShortArray109[this.anInt8297] = (short) arg3;
		this.aShortArray117[this.anInt8297] = (short) arg1;
		this.aShortArray115[this.anInt8297] = (short) arg4;
		this.aShortArray119[this.anInt8297] = (short) arg9;
		this.aByteArray77[this.anInt8297] = (byte) arg5;
		this.aFloatArray64[this.anInt8297] = arg0;
		this.aFloatArray63[this.anInt8297] = arg7;
		return (short) this.anInt8297++;
	}

	@OriginalMember(owner = "client!qh", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean588) {
			this.method6439();
		}
		return this.anInt8282;
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(B)V")
	private void method6430() {
		if (!this.aBoolean589) {
			return;
		}
		this.aBoolean589 = false;
		if (this.aClass190Array3 == null && this.aClass52Array4 == null && this.aClass328Array1 == null) {
			if (this.anIntArray460 != null && !Static393.method6013(this.anInt8252, this.anInt8246)) {
				if (this.aClass352_1 == null || this.aClass352_1.method8018()) {
					if (!this.aBoolean588) {
						this.method6439();
					}
					this.anIntArray460 = null;
				} else {
					this.aBoolean589 = true;
				}
			}
			if (this.anIntArray463 != null && !Static93.method1858(this.anInt8246, this.anInt8252)) {
				if (this.aClass352_1 == null || this.aClass352_1.method8018()) {
					if (!this.aBoolean588) {
						this.method6439();
					}
					this.anIntArray463 = null;
				} else {
					this.aBoolean589 = true;
				}
			}
			if (this.anIntArray459 != null && !Static516.method7352(this.anInt8246, this.anInt8252)) {
				if (this.aClass352_1 == null || this.aClass352_1.method8018()) {
					if (!this.aBoolean588) {
						this.method6439();
					}
					this.anIntArray459 = null;
				} else {
					this.aBoolean589 = true;
				}
			}
		}
		if (this.aShortArray111 != null && this.anIntArray460 == null && this.anIntArray463 == null && this.anIntArray459 == null) {
			this.aShortArray111 = null;
			this.anIntArray464 = null;
		}
		if (this.aByteArray77 != null && !Static323.method5017(this.anInt8252, this.anInt8246)) {
			label197: {
				label196: {
					@Pc(168) boolean local168;
					if ((this.anInt8252 & 0x37) == 0) {
						if (this.aClass352_2 == null || this.aClass352_2.method8018()) {
							break label196;
						}
						local168 = false;
					} else {
						if (this.lb == null || this.lb.method8018()) {
							break label196;
						}
						local168 = false;
					}
					if (!local168) {
						this.aBoolean589 = true;
						break label197;
					}
				}
				this.aShortArray117 = this.aShortArray115 = this.aShortArray119 = null;
				this.aByteArray77 = null;
			}
		}
		if (this.aShortArray108 != null && !Static264.method4155(this.anInt8252, this.anInt8246)) {
			if (this.aClass352_2 == null || this.aClass352_2.method8018()) {
				this.aShortArray108 = null;
			} else {
				this.aBoolean589 = true;
			}
		}
		if (this.aByteArray76 != null && !Static74.method1587(this.anInt8246, this.anInt8252)) {
			if (this.aClass352_2 == null || this.aClass352_2.method8018()) {
				this.aByteArray76 = null;
			} else {
				this.aBoolean589 = true;
			}
		}
		if (this.aFloatArray64 != null && !Static266.method4178(this.anInt8252, this.anInt8246)) {
			if (this.aClass352_3 == null || this.aClass352_3.method8018()) {
				this.aFloatArray64 = this.aFloatArray63 = null;
			} else {
				this.aBoolean589 = true;
			}
		}
		if (this.aShortArray110 != null && !Static157.method2658(this.anInt8252, this.anInt8246)) {
			if (this.aClass352_2 == null || this.aClass352_2.method8018()) {
				this.aShortArray110 = null;
			} else {
				this.aBoolean589 = true;
			}
		}
		if (this.aShortArray112 != null && !Static420.method6285(this.anInt8246, this.anInt8252)) {
			if ((this.aClass145_1 == null || this.aClass145_1.method3357()) && (this.aClass352_2 == null || this.aClass352_2.method8018())) {
				this.aShortArray112 = this.aShortArray113 = this.aShortArray114 = null;
			} else {
				this.aBoolean589 = true;
			}
		}
		if (this.aShortArray109 != null) {
			if (this.aClass352_1 == null || this.aClass352_1.method8018()) {
				this.aShortArray109 = null;
			} else {
				this.aBoolean589 = true;
			}
		}
		if (this.aShortArray116 != null) {
			if (this.aClass352_2 == null || this.aClass352_2.method8018()) {
				this.aShortArray116 = null;
			} else {
				this.aBoolean589 = true;
			}
		}
		if (this.anIntArrayArray46 != null && !Static176.method2924(this.anInt8246, this.anInt8252)) {
			this.anIntArrayArray46 = null;
			this.aShortArray118 = null;
		}
		if (this.anIntArrayArray47 != null && !Static296.method4735(this.anInt8252, this.anInt8246)) {
			this.aShortArray120 = null;
			this.anIntArrayArray47 = null;
		}
		if (this.anIntArrayArray45 != null && !Static515.method3259(this.anInt8252, this.anInt8246)) {
			this.anIntArrayArray45 = null;
		}
		if (this.anIntArray465 != null && (this.anInt8246 & 0x800) == 0 && (this.anInt8246 & 0x40000) == 0) {
			this.anIntArray461 = null;
			this.anIntArray462 = null;
			this.anIntArray465 = null;
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)Z")
	private boolean method6431() {
		if (this.aClass145_1.aBoolean304) {
			return true;
		}
		if (this.aClass145_1.anInterface6_4 == null) {
			this.aClass145_1.anInterface6_4 = this.aClass7_Sub1_15.method5726(this.aBoolean590);
		}
		@Pc(37) Interface6 local37 = this.aClass145_1.anInterface6_4;
		local37.method7932(this.anInt8268 * 6);
		@Pc(49) Buffer local49 = local37.method7935();
		if (local49 != null) {
			@Pc(57) Stream local57 = this.aClass7_Sub1_15.method5675(local49);
			@Pc(61) int local61;
			if (Stream.c()) {
				for (local61 = 0; local61 < this.anInt8268; local61++) {
					local57.d(this.aShortArray112[local61]);
					local57.d(this.aShortArray113[local61]);
					local57.d(this.aShortArray114[local61]);
				}
			} else {
				for (local61 = 0; local61 < this.anInt8268; local61++) {
					local57.e(this.aShortArray112[local61]);
					local57.e(this.aShortArray113[local61]);
					local57.e(this.aShortArray114[local61]);
				}
			}
			local57.a();
			if (local37.method7936()) {
				this.aClass145_1.aBoolean304 = true;
				this.aClass145_1.anInterface6_5 = local37;
				this.aBoolean589 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(B)V")
	private void method6432() {
		if (this.aClass352_2 != null) {
			this.aClass352_2.aBoolean705 = false;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt8281; local3++) {
			local12 = this.aShortArray108[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 -= -(arg3 * (arg0 - local18) >> 7);
			}
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			@Pc(56) int local56 = local12 & 0x7F;
			if (arg2 != -1) {
				local56 += arg3 * (arg2 - local56) >> 7;
			}
			this.aShortArray108[local3] = (short) (local18 << 10 | local24 << 7 | local56);
		}
		if (this.aClass328Array1 != null) {
			for (local12 = 0; local12 < this.anInt8307; local12++) {
				@Pc(105) Class328 local105 = this.aClass328Array1[local12];
				@Pc(110) Class243 local110 = this.aClass243Array1[local12];
				local110.anInt7119 = Static394.anIntArray413[this.aShortArray108[local105.anInt9778] & 0xFFFF] & 0xFFFFFF | local110.anInt7119 & 0xFF000000;
			}
		}
		this.method6432();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLclient!uda;)V")
	private void method6433(@OriginalArg(1) Class4_Sub6_Sub7_Sub2 arg0) {
		if (this.anInt8297 > Static564.anIntArray577.length) {
			Static488.anIntArray531 = new int[this.anInt8297];
			Static564.anIntArray577 = new int[this.anInt8297];
		}
		@Pc(51) int local51;
		@Pc(90) int local90;
		@Pc(99) int local99;
		for (@Pc(24) int local24 = 0; local24 < this.anInt8243; local24++) {
			local51 = (this.anIntArray460[local24] - (this.aClass7_Sub1_15.anInt7353 * this.anIntArray463[local24] >> 8) >> this.aClass7_Sub1_15.anInt7364) - arg0.anInt9669;
			@Pc(76) int local76 = (this.anIntArray459[local24] - (this.aClass7_Sub1_15.anInt7363 * this.anIntArray463[local24] >> 8) >> this.aClass7_Sub1_15.anInt7364) - arg0.anInt9674;
			@Pc(81) int local81 = this.anIntArray464[local24];
			@Pc(88) int local88 = this.anIntArray464[local24 + 1];
			for (local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray111[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static564.anIntArray577[local99] = local51;
				Static488.anIntArray531[local99] = local76;
			}
		}
		for (local51 = 0; local51 < this.anInt8268; local51++) {
			if (this.aByteArray76 == null || this.aByteArray76[local51] <= 128) {
				@Pc(143) short local143 = this.aShortArray112[local51];
				@Pc(148) short local148 = this.aShortArray113[local51];
				@Pc(153) short local153 = this.aShortArray114[local51];
				local90 = Static564.anIntArray577[local143];
				local99 = Static564.anIntArray577[local148];
				@Pc(165) int local165 = Static564.anIntArray577[local153];
				@Pc(169) int local169 = Static488.anIntArray531[local143];
				@Pc(173) int local173 = Static488.anIntArray531[local148];
				@Pc(177) int local177 = Static488.anIntArray531[local153];
				if (-((local173 - local169) * (local165 - local99)) + (local173 - local177) * (-local99 + local90) > 0) {
					arg0.method7449(local173, local177, local169, local99, local90, local165);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8243; local7++) {
			this.anIntArray459[local7] = -this.anIntArray459[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt8297; local25++) {
			this.aShortArray119[local25] = (short) -this.aShortArray119[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt8281; local48++) {
			@Pc(55) short local55 = this.aShortArray112[local48];
			this.aShortArray112[local48] = this.aShortArray114[local48];
			this.aShortArray114[local48] = local55;
		}
		this.method6424();
		this.method6425();
		this.method6428();
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!qh", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class4_Sub6_Sub7 S(@OriginalArg(0) Class4_Sub6_Sub7 arg0) {
		if (this.anInt8297 == 0) {
			return null;
		}
		if (!this.aBoolean588) {
			this.method6439();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass7_Sub1_15.anInt7353 <= 0) {
			local40 = this.anInt8282 - (this.aClass7_Sub1_15.anInt7353 * this.anInt8269 >> 8) >> this.aClass7_Sub1_15.anInt7364;
			local57 = this.anInt8249 - (this.aClass7_Sub1_15.anInt7353 * this.anInt8292 >> 8) >> this.aClass7_Sub1_15.anInt7364;
		} else {
			local40 = this.anInt8282 - (this.aClass7_Sub1_15.anInt7353 * this.anInt8292 >> 8) >> this.aClass7_Sub1_15.anInt7364;
			local57 = this.anInt8249 - (this.anInt8269 * this.aClass7_Sub1_15.anInt7353 >> 8) >> this.aClass7_Sub1_15.anInt7364;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass7_Sub1_15.anInt7363 > 0) {
			local114 = this.anInt8232 - (this.aClass7_Sub1_15.anInt7363 * this.anInt8292 >> 8) >> this.aClass7_Sub1_15.anInt7364;
			local131 = this.anInt8237 - (this.aClass7_Sub1_15.anInt7363 * this.anInt8269 >> 8) >> this.aClass7_Sub1_15.anInt7364;
		} else {
			local114 = this.anInt8232 - (this.anInt8269 * this.aClass7_Sub1_15.anInt7363 >> 8) >> this.aClass7_Sub1_15.anInt7364;
			local131 = this.anInt8237 - (this.anInt8292 * this.aClass7_Sub1_15.anInt7363 >> 8) >> this.aClass7_Sub1_15.anInt7364;
		}
		@Pc(171) int local171 = local57 + 1 - local40;
		@Pc(178) int local178 = local131 + 1 - local114;
		@Pc(181) Class4_Sub6_Sub7_Sub2 local181 = (Class4_Sub6_Sub7_Sub2) arg0;
		@Pc(191) Class4_Sub6_Sub7_Sub2 local191;
		if (local181 != null && local181.method7454(local178, local171)) {
			local191 = local181;
			local181.method7450();
		} else {
			local191 = new Class4_Sub6_Sub7_Sub2(this.aClass7_Sub1_15, local171, local178);
		}
		local191.method7448(local40, local57, local114, local131);
		this.method6433(local191);
		return local191;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZLclient!q;III)Z")
	private boolean method6434(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class81_Sub1 local8 = (Class81_Sub1) arg2;
		@Pc(12) Class81_Sub1 local12 = this.aClass7_Sub1_15.aClass81_Sub1_16;
		@Pc(33) float local33 = local12.aFloat60 + local8.aFloat64 * local12.aFloat57 + local8.aFloat60 * local12.aFloat59 + local8.aFloat56 * local12.aFloat62;
		@Pc(54) float local54 = local8.aFloat60 * local12.aFloat63 + local12.aFloat55 * local8.aFloat64 + local12.aFloat61 * local8.aFloat56 + local12.aFloat64;
		Static263.aFloat125 = local12.aFloat58 * local8.aFloat61 + local12.aFloat54 * local8.aFloat62 + local8.aFloat65 * local12.aFloat65;
		Static455.aFloat191 = local8.aFloat65 * local12.aFloat62 + local12.aFloat59 * local8.aFloat62 + local12.aFloat57 * local8.aFloat61;
		Static263.aFloat126 = local8.aFloat54 * local12.aFloat62 + local12.aFloat57 * local8.aFloat63 + local12.aFloat59 * local8.aFloat59;
		Static331.aFloat205 = local8.aFloat57 * local12.aFloat59 + local12.aFloat57 * local8.aFloat55 + local12.aFloat62 * local8.aFloat58;
		Static563.aFloat204 = local8.aFloat57 * local12.aFloat54 + local8.aFloat55 * local12.aFloat58 + local8.aFloat58 * local12.aFloat65;
		Static212.aFloat101 = local12.aFloat54 * local8.aFloat59 + local12.aFloat58 * local8.aFloat63 + local8.aFloat54 * local12.aFloat65;
		Static282.aFloat148 = local8.aFloat58 * local12.aFloat61 + local12.aFloat55 * local8.aFloat55 + local12.aFloat63 * local8.aFloat57;
		Static483.aFloat192 = local8.aFloat65 * local12.aFloat61 + local12.aFloat63 * local8.aFloat62 + local12.aFloat55 * local8.aFloat61;
		Static6.aFloat35 = local8.aFloat63 * local12.aFloat55 + local8.aFloat59 * local12.aFloat63 + local12.aFloat61 * local8.aFloat54;
		@Pc(242) float local242 = local8.aFloat60 * local12.aFloat54 + local12.aFloat58 * local8.aFloat64 + local8.aFloat56 * local12.aFloat65 + local12.aFloat56;
		@Pc(244) boolean local244 = false;
		@Pc(246) float local246 = Float.MAX_VALUE;
		@Pc(248) float local248 = -3.4028235E38F;
		@Pc(250) float local250 = Float.MAX_VALUE;
		@Pc(252) float local252 = -3.4028235E38F;
		@Pc(256) int local256 = this.aClass7_Sub1_15.anInt7367;
		@Pc(260) int local260 = this.aClass7_Sub1_15.anInt7352;
		if (!this.aBoolean588) {
			this.method6439();
		}
		Static461.anIntArray516[0] = this.anInt8282;
		Static535.anIntArray554[0] = this.anInt8269;
		Static461.anIntArray516[1] = this.anInt8249;
		Static42.anIntArray32[0] = this.anInt8232;
		Static535.anIntArray554[1] = this.anInt8269;
		Static461.anIntArray516[2] = this.anInt8282;
		Static42.anIntArray32[1] = this.anInt8232;
		Static535.anIntArray554[2] = this.anInt8292;
		Static461.anIntArray516[3] = this.anInt8249;
		Static42.anIntArray32[2] = this.anInt8232;
		Static535.anIntArray554[3] = this.anInt8292;
		Static461.anIntArray516[4] = this.anInt8282;
		Static42.anIntArray32[3] = this.anInt8232;
		Static535.anIntArray554[4] = this.anInt8269;
		Static42.anIntArray32[4] = this.anInt8237;
		Static461.anIntArray516[5] = this.anInt8249;
		Static535.anIntArray554[5] = this.anInt8269;
		Static461.anIntArray516[6] = this.anInt8282;
		Static42.anIntArray32[5] = this.anInt8237;
		Static535.anIntArray554[6] = this.anInt8292;
		Static461.anIntArray516[7] = this.anInt8249;
		Static42.anIntArray32[6] = this.anInt8237;
		Static535.anIntArray554[7] = this.anInt8292;
		Static42.anIntArray32[7] = this.anInt8237;
		@Pc(447) float local447;
		@Pc(433) float local433;
		@Pc(419) float local419;
		@Pc(400) float local400;
		@Pc(395) float local395;
		@Pc(405) float local405;
		for (@Pc(388) int local388 = 0; local388 < 8; local388++) {
			local395 = Static535.anIntArray554[local388];
			local400 = Static461.anIntArray516[local388];
			local405 = Static42.anIntArray32[local388];
			local419 = local242 + local395 * Static563.aFloat204 + local400 * Static212.aFloat101 + Static263.aFloat125 * local405;
			local433 = Static483.aFloat192 * local405 + local395 * Static282.aFloat148 + local400 * Static6.aFloat35 + local54;
			local447 = local33 + Static455.aFloat191 * local405 + Static263.aFloat126 * local400 + Static331.aFloat205 * local395;
			if (local419 >= (float) this.aClass7_Sub1_15.anInt7356) {
				if (arg0 > 0) {
					local419 = arg0;
				}
				@Pc(471) float local471 = (float) this.aClass7_Sub1_15.anInt7349 + (float) local256 * local447 / local419;
				if (local471 > local248) {
					local248 = local471;
				}
				if (local246 > local471) {
					local246 = local471;
				}
				@Pc(495) float local495 = (float) this.aClass7_Sub1_15.anInt7360 + (float) local260 * local433 / local419;
				local244 = true;
				if (local252 < local495) {
					local252 = local495;
				}
				if (local495 < local250) {
					local250 = local495;
				}
			}
		}
		if (local244 && (float) arg3 > local246 && local248 > (float) arg3 && (float) arg4 > local250 && (float) arg4 < local252) {
			if (arg1) {
				return true;
			}
			if (Static564.anIntArray577.length < this.anInt8297) {
				Static488.anIntArray531 = new int[this.anInt8297];
				Static564.anIntArray577 = new int[this.anInt8297];
			}
			@Pc(634) int local634;
			for (@Pc(560) int local560 = 0; local560 < this.anInt8243; local560++) {
				local400 = this.anIntArray460[local560];
				local405 = this.anIntArray459[local560];
				local395 = this.anIntArray463[local560];
				local433 = local405 * Static483.aFloat192 + local400 * Static6.aFloat35 + local395 * Static282.aFloat148 + local54;
				local419 = local405 * Static263.aFloat125 + Static563.aFloat204 * local395 + local400 * Static212.aFloat101 + local242;
				local447 = Static263.aFloat126 * local400 + Static331.aFloat205 * local395 + Static455.aFloat191 * local405 + local33;
				@Pc(641) int local641;
				@Pc(643) int local643;
				@Pc(652) int local652;
				if (local419 >= (float) this.aClass7_Sub1_15.anInt7356) {
					if (arg0 > 0) {
						local419 = arg0;
					}
					local634 = (int) ((float) this.aClass7_Sub1_15.anInt7349 + local447 * (float) local256 / local419);
					local641 = (int) (local433 * (float) local260 / local419 + (float) this.aClass7_Sub1_15.anInt7360);
					local643 = this.anIntArray464[local560];
					local652 = this.anIntArray464[local560 + 1];
					for (@Pc(715) int local715 = local643; local715 < local652; local715++) {
						@Pc(724) int local724 = this.aShortArray111[local715] - 1;
						if (local724 == -1) {
							break;
						}
						Static564.anIntArray577[local724] = local634;
						Static488.anIntArray531[local724] = local641;
					}
				} else {
					local634 = this.anIntArray464[local560];
					local641 = this.anIntArray464[local560 + 1];
					for (local643 = local634; local643 < local641; local643++) {
						local652 = this.aShortArray111[local643] - 1;
						if (local652 == -1) {
							break;
						}
						Static564.anIntArray577[this.aShortArray111[local643] - 1] = -999999;
					}
				}
			}
			for (local634 = 0; local634 < this.anInt8281; local634++) {
				if (Static564.anIntArray577[this.aShortArray112[local634]] != -999999 && Static564.anIntArray577[this.aShortArray113[local634]] != -999999 && Static564.anIntArray577[this.aShortArray114[local634]] != -999999 && this.method6435(Static488.anIntArray531[this.aShortArray112[local634]], Static564.anIntArray577[this.aShortArray113[local634]], arg4, Static564.anIntArray577[this.aShortArray112[local634]], Static564.anIntArray577[this.aShortArray114[local634]], arg3, Static488.anIntArray531[this.aShortArray113[local634]], Static488.anIntArray531[this.aShortArray114[local634]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray47 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8301; local12++) {
			this.anIntArray460[local12] <<= 0x4;
			this.anIntArray463[local12] <<= 0x4;
			this.anIntArray459[local12] <<= 0x4;
		}
		Static130.anInt2959 = 0;
		Static211.anInt4433 = 0;
		Static301.anInt6078 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg2 < arg0 && arg6 > arg2 && arg2 < arg7) {
			return false;
		} else if (arg2 > arg0 && arg2 > arg6 && arg2 > arg7) {
			return false;
		} else if (arg3 > arg5 && arg5 < arg1 && arg4 > arg5) {
			return false;
		} else {
			return arg3 >= arg5 || arg5 <= arg1 || arg5 <= arg4;
		}
	}

	@OriginalMember(owner = "client!qh", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static211.anInt4433 = 0;
			Static301.anInt6078 = 0;
			Static130.anInt2959 = 0;
			for (local20 = 0; local20 < this.anInt8243; local20++) {
				Static130.anInt2959 += this.anIntArray460[local20];
				Static301.anInt6078 += this.anIntArray463[local20];
				Static211.anInt4433 += this.anIntArray459[local20];
				local12++;
			}
			if (local12 > 0) {
				Static130.anInt2959 = Static130.anInt2959 / local12 + arg1;
				Static301.anInt6078 = arg2 + Static301.anInt6078 / local12;
				Static211.anInt4433 = Static211.anInt4433 / local12 + arg3;
			} else {
				Static211.anInt4433 = arg3;
				Static130.anInt2959 = arg1;
				Static301.anInt6078 = arg2;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt8243; local12++) {
				this.anIntArray460[local12] += arg1;
				this.anIntArray463[local12] += arg2;
				this.anIntArray459[local12] += arg3;
			}
		} else {
			@Pc(170) int local170;
			@Pc(188) int local188;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt8243; local12++) {
					this.anIntArray460[local12] -= Static130.anInt2959;
					this.anIntArray463[local12] -= Static301.anInt6078;
					this.anIntArray459[local12] -= Static211.anInt4433;
					if (arg3 != 0) {
						local20 = Class262.anIntArray420[arg3];
						local170 = Class262.anIntArray421[arg3];
						local188 = this.anIntArray460[local12] * local170 + local20 * this.anIntArray463[local12] + 16383 >> 14;
						this.anIntArray463[local12] = this.anIntArray463[local12] * local170 + 16383 - local20 * this.anIntArray460[local12] >> 14;
						this.anIntArray460[local12] = local188;
					}
					if (arg1 != 0) {
						local20 = Class262.anIntArray420[arg1];
						local170 = Class262.anIntArray421[arg1];
						local188 = this.anIntArray463[local12] * local170 + 16383 - this.anIntArray459[local12] * local20 >> 14;
						this.anIntArray459[local12] = local20 * this.anIntArray463[local12] + local170 * this.anIntArray459[local12] + 16383 >> 14;
						this.anIntArray463[local12] = local188;
					}
					if (arg2 != 0) {
						local20 = Class262.anIntArray420[arg2];
						local170 = Class262.anIntArray421[arg2];
						local188 = local170 * this.anIntArray460[local12] + local20 * this.anIntArray459[local12] + 16383 >> 14;
						this.anIntArray459[local12] = this.anIntArray459[local12] * local170 + 16383 - local20 * this.anIntArray460[local12] >> 14;
						this.anIntArray460[local12] = local188;
					}
					this.anIntArray460[local12] += Static130.anInt2959;
					this.anIntArray463[local12] += Static301.anInt6078;
					this.anIntArray459[local12] += Static211.anInt4433;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt8243; local12++) {
					this.anIntArray460[local12] -= Static130.anInt2959;
					this.anIntArray463[local12] -= Static301.anInt6078;
					this.anIntArray459[local12] -= Static211.anInt4433;
					this.anIntArray460[local12] = this.anIntArray460[local12] * arg1 / 128;
					this.anIntArray463[local12] = this.anIntArray463[local12] * arg2 / 128;
					this.anIntArray459[local12] = arg3 * this.anIntArray459[local12] / 128;
					this.anIntArray460[local12] += Static130.anInt2959;
					this.anIntArray463[local12] += Static301.anInt6078;
					this.anIntArray459[local12] += Static211.anInt4433;
				}
			} else {
				@Pc(517) Class328 local517;
				@Pc(522) Class243 local522;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt8281; local12++) {
						local20 = (this.aByteArray76[local12] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray76[local12] = (byte) local20;
					}
					if (this.aClass328Array1 != null) {
						for (local20 = 0; local20 < this.anInt8307; local20++) {
							local517 = this.aClass328Array1[local20];
							local522 = this.aClass243Array1[local20];
							local522.anInt7119 = 255 - (this.aByteArray76[local517.anInt9778] & 0xFF) << 24 | local522.anInt7119 & 0xFFFFFF;
						}
					}
					this.method6432();
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt8281; local12++) {
						local20 = this.aShortArray108[local12] & 0xFFFF;
						local170 = local20 >> 10 & 0x3F;
						local188 = local20 >> 7 & 0x7;
						@Pc(588) int local588 = local170 + arg1 & 0x3F;
						local188 += arg2 / 4;
						@Pc(598) int local598 = local20 & 0x7F;
						if (local188 < 0) {
							local188 = 0;
						} else if (local188 > 7) {
							local188 = 7;
						}
						local598 += arg3;
						if (local598 < 0) {
							local598 = 0;
						} else if (local598 > 127) {
							local598 = 127;
						}
						this.aShortArray108[local12] = (short) (local598 | local588 << 10 | local188 << 7);
					}
					if (this.aClass328Array1 != null) {
						for (local20 = 0; local20 < this.anInt8307; local20++) {
							local517 = this.aClass328Array1[local20];
							local522 = this.aClass243Array1[local20];
							local522.anInt7119 = local522.anInt7119 & 0xFF000000 | Static394.anIntArray413[this.aShortArray108[local517.anInt9778] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6432();
				} else {
					@Pc(704) Class243 local704;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt8307; local12++) {
							local704 = this.aClass243Array1[local12];
							local704.anInt7115 += arg2;
							local704.anInt7123 += arg1;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt8307; local12++) {
							local704 = this.aClass243Array1[local12];
							local704.anInt7114 = local704.anInt7114 * arg2 >> 7;
							local704.anInt7117 = local704.anInt7117 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt8307; local12++) {
							local704 = this.aClass243Array1[local12];
							local704.anInt7120 = local704.anInt7120 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean591;
	}

	@OriginalMember(owner = "client!qh", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort103 = (short) arg0;
		this.method6424();
		this.method6425();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7677(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class65_Sub3 local8 = (Class65_Sub3) arg0;
		if (this.anInt8281 == 0 || local8.anInt8281 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt8243;
		@Pc(24) int[] local24 = local8.anIntArray460;
		@Pc(27) int[] local27 = local8.anIntArray463;
		@Pc(30) int[] local30 = local8.anIntArray459;
		@Pc(33) short[] local33 = local8.aShortArray117;
		@Pc(36) short[] local36 = local8.aShortArray115;
		@Pc(39) short[] local39 = local8.aShortArray119;
		@Pc(42) byte[] local42 = local8.aByteArray77;
		@Pc(53) short[] local53;
		@Pc(47) short[] local47;
		@Pc(51) short[] local51;
		@Pc(49) byte[] local49;
		if (this.aClass219_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local51 = this.aClass219_1.aShortArray71;
			local49 = this.aClass219_1.aByteArray55;
			local47 = this.aClass219_1.aShortArray69;
			local53 = this.aClass219_1.aShortArray70;
		}
		@Pc(82) short[] local82;
		@Pc(78) short[] local78;
		@Pc(86) short[] local86;
		@Pc(90) byte[] local90;
		if (local8.aClass219_1 == null) {
			local82 = null;
			local90 = null;
			local78 = null;
			local86 = null;
		} else {
			local78 = local8.aClass219_1.aShortArray69;
			local82 = local8.aClass219_1.aShortArray70;
			local86 = local8.aClass219_1.aShortArray71;
			local90 = local8.aClass219_1.aByteArray55;
		}
		@Pc(103) int[] local103 = local8.anIntArray464;
		@Pc(106) short[] local106 = local8.aShortArray111;
		if (!local8.aBoolean588) {
			local8.method6439();
		}
		@Pc(115) int local115 = local8.anInt8269;
		@Pc(118) int local118 = local8.anInt8292;
		@Pc(121) int local121 = local8.anInt8282;
		@Pc(124) int local124 = local8.anInt8249;
		@Pc(127) int local127 = local8.anInt8232;
		@Pc(130) int local130 = local8.anInt8237;
		for (@Pc(132) int local132 = 0; local132 < this.anInt8243; local132++) {
			@Pc(142) int local142 = this.anIntArray463[local132] - arg2;
			if (local142 >= local115 && local142 <= local118) {
				@Pc(165) int local165 = this.anIntArray460[local132] - arg1;
				if (local165 >= local121 && local124 >= local165) {
					@Pc(189) int local189 = this.anIntArray459[local132] - arg3;
					if (local127 <= local189 && local189 <= local130) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray464[local132];
						@Pc(211) int local211 = this.anIntArray464[local132 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray111[local213] - 1;
							if (local199 == -1 || this.aByteArray77[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(244) int local244 = 0; local244 < local21; local244++) {
								if (local165 == local24[local244] && local189 == local30[local244] && local142 == local27[local244]) {
									@Pc(271) int local271 = -1;
									local211 = local103[local244 + 1];
									local204 = local103[local244];
									for (@Pc(283) int local283 = local204; local283 < local211; local283++) {
										local271 = local106[local283] - 1;
										if (local271 == -1 || local42[local271] != 0) {
											break;
										}
									}
									if (local271 != -1) {
										if (local53 == null) {
											this.aClass219_1 = new Class219();
											local53 = this.aClass219_1.aShortArray70 = Static465.method6798(this.aShortArray117);
											local47 = this.aClass219_1.aShortArray69 = Static465.method6798(this.aShortArray115);
											local51 = this.aClass219_1.aShortArray71 = Static465.method6798(this.aShortArray119);
											local49 = this.aClass219_1.aByteArray55 = Static502.method7220(this.aByteArray77);
										}
										if (local82 == null) {
											@Pc(367) Class219 local367 = local8.aClass219_1 = new Class219();
											local82 = local367.aShortArray70 = Static465.method6798(local33);
											local78 = local367.aShortArray69 = Static465.method6798(local36);
											local86 = local367.aShortArray71 = Static465.method6798(local39);
											local90 = local367.aByteArray55 = Static502.method7220(local42);
										}
										@Pc(400) short local400 = this.aShortArray117[local199];
										@Pc(405) short local405 = this.aShortArray115[local199];
										@Pc(410) short local410 = this.aShortArray119[local199];
										local204 = local103[local244];
										@Pc(419) byte local419 = this.aByteArray77[local199];
										local211 = local103[local244 + 1];
										@Pc(435) int local435;
										for (@Pc(427) int local427 = local204; local427 < local211; local427++) {
											local435 = local106[local427] - 1;
											if (local435 == -1) {
												break;
											}
											if (local90[local435] != 0) {
												local82[local435] += local400;
												local78[local435] += local405;
												local86[local435] += local410;
												local90[local435] += local419;
											}
										}
										local400 = local33[local271];
										local405 = local36[local271];
										local211 = this.anIntArray464[local132 + 1];
										local419 = local42[local271];
										local204 = this.anIntArray464[local132];
										local410 = local39[local271];
										for (local435 = local204; local435 < local211; local435++) {
											@Pc(521) int local521 = this.aShortArray111[local435] - 1;
											if (local521 == -1) {
												break;
											}
											if (local49[local521] != 0) {
												local53[local521] += local400;
												local47[local521] += local405;
												local51[local521] += local410;
												local49[local521] += local419;
											}
										}
										local8.method6425();
										this.method6425();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "()V")
	@Override
	public void method7676() {
		if (this.anInt8297 > 0 && this.anInt8268 > 0) {
			this.method6426();
			this.method6431();
			this.method6430();
		}
	}

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean588) {
			this.method6439();
		}
		return this.anInt8230;
	}

	@OriginalMember(owner = "client!qh", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) Class115 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean588) {
			this.method6439();
		}
		@Pc(16) int local16 = this.anInt8282 + arg4;
		@Pc(21) int local21 = this.anInt8249 + arg4;
		@Pc(26) int local26 = this.anInt8232 + arg6;
		@Pc(31) int local31 = this.anInt8237 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt10333 + local21 >> arg2.anInt10331 >= arg2.anInt10330 || local26 < 0 || arg2.anInt10327 <= arg2.anInt10333 + local31 >> arg2.anInt10331)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt10330 <= local21 + arg3.anInt10333 >> arg3.anInt10331 || local26 < 0 || arg3.anInt10327 <= arg3.anInt10333 + local31 >> arg3.anInt10331) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10331;
			local21 = arg2.anInt10333 + local21 - 1 >> arg2.anInt10331;
			local26 >>= arg2.anInt10331;
			local31 = arg2.anInt10333 + local31 - 1 >> arg2.anInt10331;
			if (arg5 == arg2.method8055(local26, local16) && arg5 == arg2.method8055(local26, local21) && arg5 == arg2.method8055(local31, local16) && arg2.method8055(local31, local21) == arg5) {
				return;
			}
		}
		@Pc(227) int local227;
		if (arg0 == 1) {
			for (local227 = 0; local227 < this.anInt8243; local227++) {
				this.anIntArray463[local227] = this.anIntArray463[local227] + arg2.method8064(arg4 + this.anIntArray460[local227], arg6 + this.anIntArray459[local227]) - arg5;
			}
		} else {
			@Pc(235) int local235;
			@Pc(243) int local243;
			if (arg0 == 2) {
				local227 = this.anInt8269;
				if (local227 == 0) {
					return;
				}
				for (local235 = 0; local235 < this.anInt8243; local235++) {
					local243 = (this.anIntArray463[local235] << 16) / local227;
					if (local243 < arg1) {
						this.anIntArray463[local235] -= -((arg2.method8064(arg4 + this.anIntArray460[local235], this.anIntArray459[local235] + arg6) - arg5) * (arg1 - local243) / arg1);
					}
				}
			} else {
				@Pc(251) int local251;
				if (arg0 == 3) {
					local227 = (arg1 & 0xFF) * 4;
					local235 = (arg1 >> 8 & 0xFF) * 4;
					local243 = (arg1 >> 16 & 0xFF) << 6;
					local251 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local227 >> 1) < 0 || arg2.anInt10333 + arg4 + (local227 >> 1) >= arg2.anInt10330 << arg2.anInt10331 || arg6 - (local235 >> 1) < 0 || arg2.anInt10327 << arg2.anInt10331 <= (local235 >> 1) + arg6 + arg2.anInt10333) {
						return;
					}
					this.method7672(arg2, local235, arg5, local251, local227, arg4, local243, arg6);
				} else if (arg0 == 4) {
					local227 = this.anInt8292 - this.anInt8269;
					for (local235 = 0; local235 < this.anInt8243; local235++) {
						this.anIntArray463[local235] = this.anIntArray463[local235] + arg3.method8064(arg4 + this.anIntArray460[local235], arg6 + this.anIntArray459[local235]) + local227 - arg5;
					}
				} else if (arg0 == 5) {
					local227 = this.anInt8292 - this.anInt8269;
					for (local235 = 0; local235 < this.anInt8243; local235++) {
						local243 = arg4 + this.anIntArray460[local235];
						local251 = this.anIntArray459[local235] + arg6;
						@Pc(350) int local350 = arg2.method8064(local243, local251);
						@Pc(356) int local356 = arg3.method8064(local243, local251);
						@Pc(364) int local364 = local350 - arg1 - local356;
						this.anIntArray463[local235] = (local364 * ((this.anIntArray463[local235] << 8) / local227) >> 8) + local350 - arg5;
					}
				}
			}
		}
		this.method6424();
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!qh", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean588) {
			this.method6439();
		}
		return this.anInt8232;
	}

	@OriginalMember(owner = "client!qh", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt8246;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
	@Override
	protected void method7666() {
	}

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static130.anInt2959 = 0;
			Static301.anInt6078 = 0;
			local28 = 0;
			Static211.anInt4433 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray47.length) {
					local52 = this.anIntArrayArray47[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray120 == null || (this.aShortArray120[local60] & arg6) != 0) {
							Static130.anInt2959 += this.anIntArray460[local60];
							Static301.anInt6078 += this.anIntArray463[local60];
							local28++;
							Static211.anInt4433 += this.anIntArray459[local60];
						}
					}
				}
			}
			if (local28 > 0) {
				Static130.anInt2959 = arg2 + Static130.anInt2959 / local28;
				Static247.aBoolean363 = true;
				Static301.anInt6078 = Static301.anInt6078 / local28 + arg3;
				Static211.anInt4433 = arg4 + Static211.anInt4433 / local28;
			} else {
				Static211.anInt4433 = arg4;
				Static130.anInt2959 = arg2;
				Static301.anInt6078 = arg3;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg4 * arg7[2] + arg2 * arg7[0] + arg3 * arg7[1] + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg2 * arg7[6] + arg7[7] * arg3 + 8192 >> 14;
				arg2 = local28;
				arg4 = local38;
				arg3 = local32;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray47.length > local32) {
					local246 = this.anIntArrayArray47[local32];
					for (local248 = 0; local248 < local246.length; local248++) {
						local54 = local246[local248];
						if (this.aShortArray120 == null || (arg6 & this.aShortArray120[local54]) != 0) {
							this.anIntArray460[local54] += arg2;
							this.anIntArray463[local54] += arg3;
							this.anIntArray459[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(386) int local386;
		@Pc(404) int local404;
		@Pc(641) int local641;
		@Pc(650) int local650;
		@Pc(663) int local663;
		@Pc(667) int local667;
		@Pc(686) int local686;
		@Pc(1018) int local1018;
		@Pc(1026) int local1026;
		@Pc(1181) int local1181;
		@Pc(1206) int local1206;
		@Pc(1210) int local1210;
		@Pc(1219) int local1219;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1232) int local1232;
		@Pc(1234) int local1234;
		@Pc(1367) int[] local1367;
		@Pc(1369) int local1369;
		@Pc(1373) int local1373;
		@Pc(1377) int local1377;
		@Pc(1379) int local1379;
		@Pc(1509) int local1509;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray47.length > local32) {
						local246 = this.anIntArrayArray47[local32];
						for (local248 = 0; local248 < local246.length; local248++) {
							local54 = local246[local248];
							if (this.aShortArray120 == null || (this.aShortArray120[local54] & arg6) != 0) {
								this.anIntArray460[local54] -= Static130.anInt2959;
								this.anIntArray463[local54] -= Static301.anInt6078;
								this.anIntArray459[local54] -= Static211.anInt4433;
								if (arg4 != 0) {
									local60 = Class262.anIntArray420[arg4];
									local386 = Class262.anIntArray421[arg4];
									local404 = this.anIntArray463[local54] * local60 + local386 * this.anIntArray460[local54] + 16383 >> 14;
									this.anIntArray463[local54] = local386 * this.anIntArray463[local54] + 16383 - this.anIntArray460[local54] * local60 >> 14;
									this.anIntArray460[local54] = local404;
								}
								if (arg2 != 0) {
									local60 = Class262.anIntArray420[arg2];
									local386 = Class262.anIntArray421[arg2];
									local404 = this.anIntArray463[local54] * local386 + 16383 - this.anIntArray459[local54] * local60 >> 14;
									this.anIntArray459[local54] = this.anIntArray463[local54] * local60 + local386 * this.anIntArray459[local54] + 16383 >> 14;
									this.anIntArray463[local54] = local404;
								}
								if (arg3 != 0) {
									local60 = Class262.anIntArray420[arg3];
									local386 = Class262.anIntArray421[arg3];
									local404 = this.anIntArray460[local54] * local386 + this.anIntArray459[local54] * local60 + 16383 >> 14;
									this.anIntArray459[local54] = this.anIntArray459[local54] * local386 + 16383 - local60 * this.anIntArray460[local54] >> 14;
									this.anIntArray460[local54] = local404;
								}
								this.anIntArray460[local54] += Static130.anInt2959;
								this.anIntArray463[local54] += Static301.anInt6078;
								this.anIntArray459[local54] += Static211.anInt4433;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray47.length > local38) {
							local52 = this.anIntArrayArray47[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray120 == null || (this.aShortArray120[local60] & arg6) != 0) {
									local386 = this.anIntArray464[local60];
									local404 = this.anIntArray464[local60 + 1];
									for (local641 = local386; local641 < local404; local641++) {
										local650 = this.aShortArray111[local641] - 1;
										if (local650 == -1) {
											break;
										}
										if (arg4 != 0) {
											local663 = Class262.anIntArray420[arg4];
											local667 = Class262.anIntArray421[arg4];
											local686 = this.aShortArray115[local650] * local663 + local667 * this.aShortArray117[local650] + 16383 >> 14;
											this.aShortArray115[local650] = (short) (this.aShortArray115[local650] * local667 + 16383 - local663 * this.aShortArray117[local650] >> 14);
											this.aShortArray117[local650] = (short) local686;
										}
										if (arg2 != 0) {
											local663 = Class262.anIntArray420[arg2];
											local667 = Class262.anIntArray421[arg2];
											local686 = this.aShortArray115[local650] * local667 + 16383 - local663 * this.aShortArray119[local650] >> 14;
											this.aShortArray119[local650] = (short) (this.aShortArray115[local650] * local663 + local667 * this.aShortArray119[local650] + 16383 >> 14);
											this.aShortArray115[local650] = (short) local686;
										}
										if (arg3 != 0) {
											local663 = Class262.anIntArray420[arg3];
											local667 = Class262.anIntArray421[arg3];
											local686 = this.aShortArray117[local650] * local667 + local663 * this.aShortArray119[local650] + 16383 >> 14;
											this.aShortArray119[local650] = (short) (local667 * this.aShortArray119[local650] + 16383 - local663 * this.aShortArray117[local650] >> 14);
											this.aShortArray117[local650] = (short) local686;
										}
									}
								}
							}
						}
					}
					this.method6425();
					return;
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static247.aBoolean363) {
					local386 = arg7[0] * Static130.anInt2959 + Static301.anInt6078 * arg7[3] + Static211.anInt4433 * arg7[6] + 8192 >> 14;
					local404 = arg7[4] * Static301.anInt6078 + arg7[1] * Static130.anInt2959 + arg7[7] * Static211.anInt4433 + 8192 >> 14;
					local386 += local248;
					local404 += local54;
					local641 = arg7[8] * Static211.anInt4433 + arg7[2] * Static130.anInt2959 + Static301.anInt6078 * arg7[5] + 8192 >> 14;
					local641 += local60;
					Static301.anInt6078 = local404;
					Static130.anInt2959 = local386;
					Static211.anInt4433 = local641;
					Static247.aBoolean363 = false;
				}
				@Pc(986) int[] local986 = new int[9];
				local404 = Class262.anIntArray421[arg2];
				local641 = Class262.anIntArray420[arg2];
				local650 = Class262.anIntArray421[arg3];
				local663 = Class262.anIntArray420[arg3];
				local667 = Class262.anIntArray421[arg4];
				local686 = Class262.anIntArray420[arg4];
				local1018 = local641 * local667 + 8192 >> 14;
				local1026 = local686 * local641 + 8192 >> 14;
				local986[5] = -local641;
				local986[2] = local663 * local404 + 8192 >> 14;
				local986[1] = -local650 * local686 + local1018 * local663 + 8192 >> 14;
				local986[4] = local667 * local404 + 8192 >> 14;
				local986[6] = local667 * -local663 + local650 * local1026 + 8192 >> 14;
				local986[8] = local404 * local650 + 8192 >> 14;
				local986[7] = local1018 * local650 + local663 * local686 + 8192 >> 14;
				local986[0] = local650 * local667 + local1026 * local663 + 8192 >> 14;
				local986[3] = local686 * local404 + 8192 >> 14;
				@Pc(1156) int local1156 = local986[2] * -Static211.anInt4433 + -Static130.anInt2959 * local986[0] + local986[1] * -Static301.anInt6078 + 8192 >> 14;
				local1181 = local986[5] * -Static211.anInt4433 + -Static130.anInt2959 * local986[3] + local986[4] * -Static301.anInt6078 + 8192 >> 14;
				local1206 = -Static301.anInt6078 * local986[7] + -Static130.anInt2959 * local986[6] + -Static211.anInt4433 * local986[8] + 8192 >> 14;
				local1210 = Static130.anInt2959 + local1156;
				@Pc(1214) int local1214 = Static301.anInt6078 + local1181;
				local1219 = local1206 + Static211.anInt4433;
				@Pc(1222) int[] local1222 = new int[9];
				for (local1224 = 0; local1224 < 3; local1224++) {
					for (local1228 = 0; local1228 < 3; local1228++) {
						local1232 = 0;
						for (local1234 = 0; local1234 < 3; local1234++) {
							local1232 += arg7[local1228 * 3 + local1234] * local986[local1224 * 3 + local1234];
						}
						local1222[local1224 * 3 + local1228] = local1232 + 8192 >> 14;
					}
				}
				local1228 = local54 * local986[1] + local986[0] * local248 + local60 * local986[2] + 8192 >> 14;
				local1232 = local60 * local986[5] + local986[4] * local54 + local248 * local986[3] + 8192 >> 14;
				local1234 = local986[8] * local60 + local54 * local986[7] + local248 * local986[6] + 8192 >> 14;
				local1228 += local1210;
				local1232 += local1214;
				local1234 += local1219;
				local1367 = new int[9];
				for (local1369 = 0; local1369 < 3; local1369++) {
					for (local1373 = 0; local1373 < 3; local1373++) {
						local1377 = 0;
						for (local1379 = 0; local1379 < 3; local1379++) {
							local1377 += local1222[local1379 * 3 + local1373] * arg7[local1369 * 3 + local1379];
						}
						local1367[local1373 + local1369 * 3] = local1377 + 8192 >> 14;
					}
				}
				local1373 = local1234 * arg7[2] + arg7[0] * local1228 + local1232 * arg7[1] + 8192 >> 14;
				local1377 = arg7[3] * local1228 + local1232 * arg7[4] + local1234 * arg7[5] + 8192 >> 14;
				local1377 += local32;
				local1373 += local28;
				local1379 = arg7[6] * local1228 + local1232 * arg7[7] + arg7[8] * local1234 + 8192 >> 14;
				local1379 += local38;
				for (local1509 = 0; local1509 < local8; local1509++) {
					@Pc(1515) int local1515 = arg1[local1509];
					if (local1515 < this.anIntArrayArray47.length) {
						@Pc(1529) int[] local1529 = this.anIntArrayArray47[local1515];
						for (@Pc(1531) int local1531 = 0; local1531 < local1529.length; local1531++) {
							@Pc(1537) int local1537 = local1529[local1531];
							if (this.aShortArray120 == null || (this.aShortArray120[local1537] & arg6) != 0) {
								@Pc(1579) int local1579 = this.anIntArray463[local1537] * local1367[1] + this.anIntArray460[local1537] * local1367[0] + local1367[2] * this.anIntArray459[local1537] + 8192 >> 14;
								@Pc(1611) int local1611 = local1367[4] * this.anIntArray463[local1537] + this.anIntArray460[local1537] * local1367[3] + local1367[5] * this.anIntArray459[local1537] + 8192 >> 14;
								@Pc(1643) int local1643 = local1367[7] * this.anIntArray463[local1537] + local1367[6] * this.anIntArray460[local1537] + local1367[8] * this.anIntArray459[local1537] + 8192 >> 14;
								@Pc(1647) int local1647 = local1611 + local1377;
								@Pc(1651) int local1651 = local1579 + local1373;
								this.anIntArray460[local1537] = local1651;
								@Pc(1660) int local1660 = local1643 + local1379;
								this.anIntArray463[local1537] = local1647;
								this.anIntArray459[local1537] = local1660;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2591) Class243 local2591;
			@Pc(2481) boolean local2481;
			@Pc(2586) Class328 local2586;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					local2481 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray46.length) {
							local52 = this.anIntArrayArray46[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray118 == null || (this.aShortArray118[local60] & arg6) != 0) {
									local386 = arg2 * 8 + (this.aByteArray76[local60] & 0xFF);
									if (local386 < 0) {
										local386 = 0;
									} else if (local386 > 255) {
										local386 = 255;
									}
									this.aByteArray76[local60] = (byte) local386;
								}
							}
							local2481 |= local52.length > 0;
						}
					}
					if (local2481) {
						if (this.aClass328Array1 != null) {
							for (local38 = 0; local38 < this.anInt8307; local38++) {
								local2586 = this.aClass328Array1[local38];
								local2591 = this.aClass243Array1[local38];
								local2591.anInt7119 = 255 - (this.aByteArray76[local2586.anInt9778] & 0xFF) << 24 | local2591.anInt7119 & 0xFFFFFF;
							}
						}
						this.method6432();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray46 != null) {
					local2481 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray46.length) {
							local52 = this.anIntArrayArray46[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray118 == null || (arg6 & this.aShortArray118[local60]) != 0) {
									local386 = this.aShortArray108[local60] & 0xFFFF;
									local404 = local386 >> 10 & 0x3F;
									local641 = local386 >> 7 & 0x7;
									local650 = local386 & 0x7F;
									local641 += arg3 / 4;
									@Pc(2701) int local2701 = arg2 + local404 & 0x3F;
									if (local641 < 0) {
										local641 = 0;
									} else if (local641 > 7) {
										local641 = 7;
									}
									local650 += arg4;
									if (local650 < 0) {
										local650 = 0;
									} else if (local650 > 127) {
										local650 = 127;
									}
									this.aShortArray108[local60] = (short) (local641 << 7 | local2701 << 10 | local650);
								}
							}
							local2481 |= local52.length > 0;
						}
					}
					if (local2481) {
						if (this.aClass328Array1 != null) {
							for (local38 = 0; local38 < this.anInt8307; local38++) {
								local2586 = this.aClass328Array1[local38];
								local2591 = this.aClass243Array1[local38];
								local2591.anInt7119 = local2591.anInt7119 & 0xFF000000 | Static394.anIntArray413[this.aShortArray108[local2586.anInt9778] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6432();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray45 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray45.length) {
							local246 = this.anIntArrayArray45[local32];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2591 = this.aClass243Array1[local246[local248]];
								local2591.anInt7115 += arg3;
								local2591.anInt7123 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray45 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray45.length > local32) {
							local246 = this.anIntArrayArray45[local32];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2591 = this.aClass243Array1[local246[local248]];
								local2591.anInt7117 = local2591.anInt7117 * arg2 >> 7;
								local2591.anInt7114 = local2591.anInt7114 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray45.length > local32) {
						local246 = this.anIntArrayArray45[local32];
						for (local248 = 0; local248 < local246.length; local248++) {
							local2591 = this.aClass243Array1[local246[local248]];
							local2591.anInt7120 = local2591.anInt7120 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray47.length) {
					local246 = this.anIntArrayArray47[local32];
					for (local248 = 0; local248 < local246.length; local248++) {
						local54 = local246[local248];
						if (this.aShortArray120 == null || (arg6 & this.aShortArray120[local54]) != 0) {
							this.anIntArray460[local54] -= Static130.anInt2959;
							this.anIntArray463[local54] -= Static301.anInt6078;
							this.anIntArray459[local54] -= Static211.anInt4433;
							this.anIntArray460[local54] = arg2 * this.anIntArray460[local54] >> 7;
							this.anIntArray463[local54] = arg3 * this.anIntArray463[local54] >> 7;
							this.anIntArray459[local54] = arg4 * this.anIntArray459[local54] >> 7;
							this.anIntArray460[local54] += Static130.anInt2959;
							this.anIntArray463[local54] += Static301.anInt6078;
							this.anIntArray459[local54] += Static211.anInt4433;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static247.aBoolean363) {
				local386 = arg7[3] * Static301.anInt6078 + arg7[0] * Static130.anInt2959 + arg7[6] * Static211.anInt4433 + 8192 >> 14;
				local404 = arg7[4] * Static301.anInt6078 + arg7[1] * Static130.anInt2959 + Static211.anInt4433 * arg7[7] + 8192 >> 14;
				local404 += local54;
				local641 = Static130.anInt2959 * arg7[2] + arg7[5] * Static301.anInt6078 + Static211.anInt4433 * arg7[8] + 8192 >> 14;
				local386 += local248;
				Static301.anInt6078 = local404;
				local641 += local60;
				Static130.anInt2959 = local386;
				Static211.anInt4433 = local641;
				Static247.aBoolean363 = false;
			}
			local386 = arg2 << 15 >> 7;
			local404 = arg3 << 15 >> 7;
			local641 = arg4 << 15 >> 7;
			local650 = local386 * -Static130.anInt2959 + 8192 >> 14;
			local663 = -Static301.anInt6078 * local404 + 8192 >> 14;
			local667 = local641 * -Static211.anInt4433 + 8192 >> 14;
			local686 = Static130.anInt2959 + local650;
			local1018 = local663 + Static301.anInt6078;
			local1026 = local667 + Static211.anInt4433;
			@Pc(2011) int[] local2011 = new int[] { arg7[0] * local386 + 8192 >> 14, local386 * arg7[3] + 8192 >> 14, arg7[6] * local386 + 8192 >> 14, arg7[1] * local404 + 8192 >> 14, local404 * arg7[4] + 8192 >> 14, arg7[7] * local404 + 8192 >> 14, local641 * arg7[2] + 8192 >> 14, arg7[5] * local641 + 8192 >> 14, arg7[8] * local641 + 8192 >> 14 };
			local1181 = local386 * local248 + 8192 >> 14;
			local1206 = local404 * local54 + 8192 >> 14;
			@Pc(2139) int local2139 = local1206 + local1018;
			local1210 = local60 * local641 + 8192 >> 14;
			@Pc(2151) int local2151 = local1181 + local686;
			@Pc(2155) int local2155 = local1210 + local1026;
			@Pc(2158) int[] local2158 = new int[9];
			@Pc(2164) int local2164;
			for (local1219 = 0; local1219 < 3; local1219++) {
				for (local2164 = 0; local2164 < 3; local2164++) {
					local1224 = 0;
					for (local1228 = 0; local1228 < 3; local1228++) {
						local1224 += local2011[local1228 * 3 + local2164] * arg7[local1228 + local1219 * 3];
					}
					local2158[local2164 + local1219 * 3] = local1224 + 8192 >> 14;
				}
			}
			local2164 = local2151 * arg7[0] + local2139 * arg7[1] + arg7[2] * local2155 + 8192 >> 14;
			local1224 = local2139 * arg7[4] + arg7[3] * local2151 + arg7[5] * local2155 + 8192 >> 14;
			local1224 += local32;
			local1228 = arg7[8] * local2155 + local2139 * arg7[7] + arg7[6] * local2151 + 8192 >> 14;
			local2164 += local28;
			local1228 += local38;
			for (local1232 = 0; local1232 < local8; local1232++) {
				local1234 = arg1[local1232];
				if (local1234 < this.anIntArrayArray47.length) {
					local1367 = this.anIntArrayArray47[local1234];
					for (local1369 = 0; local1369 < local1367.length; local1369++) {
						local1373 = local1367[local1369];
						if (this.aShortArray120 == null || (this.aShortArray120[local1373] & arg6) != 0) {
							local1377 = local2158[0] * this.anIntArray460[local1373] + this.anIntArray463[local1373] * local2158[1] + local2158[2] * this.anIntArray459[local1373] + 8192 >> 14;
							local1379 = local2158[3] * this.anIntArray460[local1373] + local2158[4] * this.anIntArray463[local1373] + local2158[5] * this.anIntArray459[local1373] + 8192 >> 14;
							@Pc(2401) int local2401 = local1379 + local1224;
							local1509 = this.anIntArray460[local1373] * local2158[6] + local2158[7] * this.anIntArray463[local1373] + this.anIntArray459[local1373] * local2158[8] + 8192 >> 14;
							@Pc(2438) int local2438 = local1377 + local2164;
							this.anIntArray460[local1373] = local2438;
							@Pc(2447) int local2447 = local1509 + local1228;
							this.anIntArray463[local1373] = local2401;
							this.anIntArray459[local1373] = local2447;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
	private void method6436() {
		if (this.aClass328Array1 == null) {
			return;
		}
		this.aClass7_Sub1_15.ZA(!this.aBoolean591);
		this.aClass7_Sub1_15.method5717(false);
		this.aClass7_Sub1_15.method5681(1, Static18.aClass61_1);
		this.aClass7_Sub1_15.method5713(Static18.aClass61_1, 1);
		for (@Pc(51) int local51 = 0; local51 < this.anInt8307; local51++) {
			@Pc(58) Class328 local58 = this.aClass328Array1[local51];
			@Pc(63) Class243 local63 = this.aClass243Array1[local51];
			if (!local58.aBoolean657 || !this.aClass7_Sub1_15.method7850()) {
				@Pc(91) float local91 = (float) (this.anIntArray460[local58.anInt9777] + this.anIntArray460[local58.anInt9779] + this.anIntArray460[local58.anInt9772]) * 0.3333333F;
				@Pc(112) float local112 = (float) (this.anIntArray463[local58.anInt9777] + this.anIntArray463[local58.anInt9772] + this.anIntArray463[local58.anInt9779]) * 0.3333333F;
				@Pc(134) float local134 = (float) (this.anIntArray459[local58.anInt9772] + this.anIntArray459[local58.anInt9779] + this.anIntArray459[local58.anInt9777]) * 0.3333333F;
				@Pc(148) float local148 = Static331.aFloat205 * local112 + local91 * Static263.aFloat126 + Static455.aFloat191 * local134 + Static443.aFloat189;
				@Pc(162) float local162 = Static6.aFloat35 * local91 + Static282.aFloat148 * local112 + local134 * Static483.aFloat192 + Static414.aFloat187;
				@Pc(176) float local176 = Static263.aFloat125 * local134 + local91 * Static212.aFloat101 + Static563.aFloat204 * local112 + Static362.aFloat162;
				@Pc(181) Class81_Sub1 local181 = this.aClass7_Sub1_15.method5695();
				local181.method1974(local58.aShort117 * local63.anInt7114 >> 7, (float) local63.anInt7115 + local162, local63.anInt7120, local63.anInt7117 * local58.aShort118 >> 7, (float) -local58.anInt9780 + local176, local148 + (float) local63.anInt7123);
				local181.method1978(this.aClass7_Sub1_15.aClass81_Sub1_17);
				this.aClass7_Sub1_15.method5786();
				@Pc(229) int local229 = local63.anInt7119;
				this.aClass7_Sub1_15.method5692(local58.aShort116, false, false);
				this.aClass7_Sub1_15.method5716(local58.aByte123);
				this.aClass7_Sub1_15.method5712(local229);
				this.aClass7_Sub1_15.method5769();
			}
		}
		this.aClass7_Sub1_15.method5713(Static410.aClass61_6, 1);
		this.aClass7_Sub1_15.method5681(1, Static410.aClass61_6);
		this.aClass7_Sub1_15.ZA(true);
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "()[Lclient!cea;")
	@Override
	public Class52[] method7688() {
		return this.aClass52Array4;
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(B)V")
	private void method6437() {
		if (this.anInt8268 == 0) {
			return;
		}
		if (this.method6426() && this.method6431()) {
			this.aClass7_Sub1_15.method5721(this.aClass352_1.anInterface24_15, 0);
			this.aClass7_Sub1_15.method5721(this.aClass352_2.anInterface24_15, 1);
			this.aClass7_Sub1_15.method5721(this.aClass352_3.anInterface24_15, 2);
			@Pc(64) boolean local64;
			if ((this.anInt8252 & 0x37) == 0) {
				local64 = false;
				this.aClass7_Sub1_15.method5717(false);
				this.aClass7_Sub1_15.method5754(this.aClass7_Sub1_15.aClass82_16);
			} else {
				this.aClass7_Sub1_15.method5717(true);
				local64 = true;
				this.aClass7_Sub1_15.method5721(this.lb.anInterface24_15, 3);
				this.aClass7_Sub1_15.method5754(this.aClass7_Sub1_15.aClass82_18);
			}
			for (@Pc(97) int local97 = 0; local97 < this.anIntArray461.length; local97++) {
				@Pc(104) int local104 = this.anIntArray465[local97];
				@Pc(111) int local111 = this.anIntArray465[local97 + 1];
				@Pc(118) int local118 = this.aShortArray110[local104] & 0xFFFF;
				if (local118 == 65535) {
					local118 = -1;
				}
				this.aClass7_Sub1_15.method5692(local118, true, local64);
				this.aClass7_Sub1_15.method5680(local111 - local104, local104 * 3, this.anIntArray462[local97], this.aClass145_1.anInterface6_5, Static409.aClass119_6, this.anIntArray461[local97]);
			}
		}
		this.method6430();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7668(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray120 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8243; local14++) {
			if ((this.aShortArray120[local14] & arg1) != 0) {
				if (arg2) {
					arg0.BA(this.anIntArray460[local14], this.anIntArray463[local14], this.anIntArray459[local14], local12);
				} else {
					arg0.method6591(this.anIntArray460[local14], this.anIntArray463[local14], this.anIntArray459[local14], local12);
				}
				this.anIntArray460[local14] = local12[0];
				this.anIntArray463[local14] = local12[1];
				this.anIntArray459[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray420[arg0];
		@Pc(13) int local13 = Class262.anIntArray421[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8243; local15++) {
			@Pc(33) int local33 = this.anIntArray459[local15] * local9 + local13 * this.anIntArray460[local15] >> 14;
			this.anIntArray459[local15] = local13 * this.anIntArray459[local15] - this.anIntArray460[local15] * local9 >> 14;
			this.anIntArray460[local15] = local33;
		}
		this.method6424();
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!qh", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean588) {
			this.method6439();
		}
		return this.anInt8237;
	}

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean588) {
			this.method6439();
		}
		return this.anInt8292;
	}

	@OriginalMember(owner = "client!qh", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray420[arg0];
		@Pc(13) int local13 = Class262.anIntArray421[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8243; local15++) {
			@Pc(33) int local33 = this.anIntArray460[local15] * local13 + local9 * this.anIntArray463[local15] >> 14;
			this.anIntArray463[local15] = local13 * this.anIntArray463[local15] - local9 * this.anIntArray460[local15] >> 14;
			this.anIntArray460[local15] = local33;
		}
		this.method6424();
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7665(@OriginalArg(0) Class81 arg0) {
		@Pc(8) Class81_Sub1 local8 = (Class81_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass190Array3 != null) {
			for (local13 = 0; local13 < this.aClass190Array3.length; local13++) {
				@Pc(20) Class190 local20 = this.aClass190Array3[local13];
				@Pc(22) Class190 local22 = local20;
				if (local20.aClass190_1 != null) {
					local22 = local20.aClass190_1;
				}
				local22.anInt5828 = (int) ((float) this.anIntArray463[local20.anInt5819] * local8.aFloat57 + (float) this.anIntArray460[local20.anInt5819] * local8.aFloat59 + local8.aFloat62 * (float) this.anIntArray459[local20.anInt5819] + local8.aFloat60);
				local22.anInt5820 = (int) (local8.aFloat61 * (float) this.anIntArray459[local20.anInt5819] + local8.aFloat63 * (float) this.anIntArray460[local20.anInt5819] + local8.aFloat55 * (float) this.anIntArray463[local20.anInt5819] + local8.aFloat64);
				local22.anInt5817 = (int) (local8.aFloat65 * (float) this.anIntArray459[local20.anInt5819] + (float) this.anIntArray460[local20.anInt5819] * local8.aFloat54 + (float) this.anIntArray463[local20.anInt5819] * local8.aFloat58 + local8.aFloat56);
				local22.anInt5818 = (int) ((float) this.anIntArray459[local20.anInt5824] * local8.aFloat62 + (float) this.anIntArray460[local20.anInt5824] * local8.aFloat59 + (float) this.anIntArray463[local20.anInt5824] * local8.aFloat57 + local8.aFloat60);
				local22.anInt5826 = (int) ((float) this.anIntArray460[local20.anInt5824] * local8.aFloat63 + (float) this.anIntArray463[local20.anInt5824] * local8.aFloat55 + (float) this.anIntArray459[local20.anInt5824] * local8.aFloat61 + local8.aFloat64);
				local22.anInt5815 = (int) (local8.aFloat56 + (float) this.anIntArray459[local20.anInt5824] * local8.aFloat65 + local8.aFloat54 * (float) this.anIntArray460[local20.anInt5824] + (float) this.anIntArray463[local20.anInt5824] * local8.aFloat58);
				local22.anInt5821 = (int) ((float) this.anIntArray460[local20.anInt5816] * local8.aFloat59 + local8.aFloat57 * (float) this.anIntArray463[local20.anInt5816] + (float) this.anIntArray459[local20.anInt5816] * local8.aFloat62 + local8.aFloat60);
				local22.anInt5829 = (int) (local8.aFloat64 + (float) this.anIntArray463[local20.anInt5816] * local8.aFloat55 + (float) this.anIntArray460[local20.anInt5816] * local8.aFloat63 + local8.aFloat61 * (float) this.anIntArray459[local20.anInt5816]);
				local22.anInt5814 = (int) (local8.aFloat54 * (float) this.anIntArray460[local20.anInt5816] + local8.aFloat58 * (float) this.anIntArray463[local20.anInt5816] + local8.aFloat65 * (float) this.anIntArray459[local20.anInt5816] + local8.aFloat56);
			}
		}
		if (this.aClass52Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass52Array4.length; local13++) {
			@Pc(365) Class52 local365 = this.aClass52Array4[local13];
			@Pc(367) Class52 local367 = local365;
			if (local365.aClass52_1 != null) {
				local367 = local365.aClass52_1;
			}
			if (local365.aClass81_2 == null) {
				local365.aClass81_2 = local8.method6585();
			} else {
				local365.aClass81_2.M(local8);
			}
			local367.anInt1625 = (int) (local8.aFloat57 * (float) this.anIntArray463[local365.anInt1626] + local8.aFloat59 * (float) this.anIntArray460[local365.anInt1626] + local8.aFloat62 * (float) this.anIntArray459[local365.anInt1626] + local8.aFloat60);
			local367.anInt1621 = (int) (local8.aFloat61 * (float) this.anIntArray459[local365.anInt1626] + local8.aFloat55 * (float) this.anIntArray463[local365.anInt1626] + (float) this.anIntArray460[local365.anInt1626] * local8.aFloat63 + local8.aFloat64);
			local367.anInt1622 = (int) (local8.aFloat54 * (float) this.anIntArray460[local365.anInt1626] + (float) this.anIntArray463[local365.anInt1626] * local8.aFloat58 + (float) this.anIntArray459[local365.anInt1626] * local8.aFloat65 + local8.aFloat56);
		}
	}

	@OriginalMember(owner = "client!qh", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean588) {
			this.method6439();
		}
		return this.anInt8248;
	}

	@OriginalMember(owner = "client!qh", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass7_Sub1_15.anInterface7_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt8281; local11++) {
			if (this.aShortArray110[local11] == arg0) {
				this.aShortArray110[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class69 local47 = local9.method4460(arg0 & 0xFFFF);
			local35 = local47.aByte43;
			local37 = local47.aByte46;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class69 local67 = local9.method4460(arg1 & 0xFFFF);
			local57 = local67.aByte46;
			local55 = local67.aByte43;
		}
		if (!(local35 != local55 | local57 != local37)) {
			return;
		}
		if (this.aClass328Array1 != null) {
			for (@Pc(96) int local96 = 0; local96 < this.anInt8307; local96++) {
				@Pc(103) Class328 local103 = this.aClass328Array1[local96];
				@Pc(108) Class243 local108 = this.aClass243Array1[local96];
				local108.anInt7119 = Static394.anIntArray413[this.aShortArray108[local103.anInt9778] & 0xFFFF] & 0xFFFFFF | local108.anInt7119 & 0xFF000000;
			}
		}
		this.method6432();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!q;Lclient!j;II)V")
	@Override
	public void method7686(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8297 == 0) {
			return;
		}
		@Pc(16) Class81_Sub1 local16 = this.aClass7_Sub1_15.aClass81_Sub1_16;
		if (!this.aBoolean588) {
			this.method6439();
		}
		@Pc(25) Class81_Sub1 local25 = (Class81_Sub1) arg0;
		Static362.aFloat162 = local16.aFloat65 * local25.aFloat56 + local25.aFloat64 * local16.aFloat58 + local16.aFloat54 * local25.aFloat60 + local16.aFloat56;
		Static563.aFloat204 = local25.aFloat58 * local16.aFloat65 + local16.aFloat58 * local25.aFloat55 + local16.aFloat54 * local25.aFloat57;
		@Pc(72) float local72 = Static563.aFloat204 * (float) this.anInt8269 + Static362.aFloat162;
		@Pc(80) float local80 = Static362.aFloat162 + Static563.aFloat204 * (float) this.anInt8292;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = (float) this.anInt8230 + local72;
			local96 = local80 - (float) this.anInt8230;
		} else {
			local90 = (float) this.anInt8230 + local80;
			local96 = (float) -this.anInt8230 + local72;
		}
		if (local96 >= this.aClass7_Sub1_15.aFloat169 || local90 <= (float) this.aClass7_Sub1_15.anInt7356) {
			return;
		}
		Static443.aFloat189 = local16.aFloat60 + local16.aFloat62 * local25.aFloat56 + local25.aFloat64 * local16.aFloat57 + local25.aFloat60 * local16.aFloat59;
		Static331.aFloat205 = local16.aFloat59 * local25.aFloat57 + local25.aFloat55 * local16.aFloat57 + local25.aFloat58 * local16.aFloat62;
		@Pc(173) float local173 = Static443.aFloat189 + (float) this.anInt8269 * Static331.aFloat205;
		@Pc(181) float local181 = Static443.aFloat189 + (float) this.anInt8292 * Static331.aFloat205;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local173 > local181) {
			local207 = (float) this.aClass7_Sub1_15.anInt7367 * (local181 - (float) this.anInt8230);
			local196 = (local173 + (float) this.anInt8230) * (float) this.aClass7_Sub1_15.anInt7367;
		} else {
			local196 = (float) this.aClass7_Sub1_15.anInt7367 * (local181 + (float) this.anInt8230);
			local207 = (local173 - (float) this.anInt8230) * (float) this.aClass7_Sub1_15.anInt7367;
		}
		if (local207 / (float) arg2 >= this.aClass7_Sub1_15.aFloat166 || local196 / (float) arg2 <= this.aClass7_Sub1_15.aFloat167) {
			return;
		}
		Static414.aFloat187 = local16.aFloat64 + local16.aFloat63 * local25.aFloat60 + local16.aFloat55 * local25.aFloat64 + local16.aFloat61 * local25.aFloat56;
		Static282.aFloat148 = local16.aFloat55 * local25.aFloat55 + local16.aFloat63 * local25.aFloat57 + local25.aFloat58 * local16.aFloat61;
		@Pc(298) float local298 = Static414.aFloat187 + (float) this.anInt8269 * Static282.aFloat148;
		@Pc(306) float local306 = Static414.aFloat187 + (float) this.anInt8292 * Static282.aFloat148;
		@Pc(332) float local332;
		@Pc(321) float local321;
		if (local306 < local298) {
			local321 = (float) this.aClass7_Sub1_15.anInt7352 * (local298 + (float) this.anInt8230);
			local332 = (float) this.aClass7_Sub1_15.anInt7352 * (local306 - (float) this.anInt8230);
		} else {
			local321 = ((float) this.anInt8230 + local306) * (float) this.aClass7_Sub1_15.anInt7352;
			local332 = (float) this.aClass7_Sub1_15.anInt7352 * ((float) -this.anInt8230 + local298);
		}
		if (local332 / (float) arg2 >= this.aClass7_Sub1_15.aFloat179 || this.aClass7_Sub1_15.aFloat165 >= local321 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass328Array1 != null) {
			Static212.aFloat101 = local16.aFloat54 * local25.aFloat59 + local25.aFloat63 * local16.aFloat58 + local25.aFloat54 * local16.aFloat65;
			Static455.aFloat191 = local25.aFloat65 * local16.aFloat62 + local16.aFloat57 * local25.aFloat61 + local16.aFloat59 * local25.aFloat62;
			Static263.aFloat125 = local25.aFloat61 * local16.aFloat58 + local16.aFloat54 * local25.aFloat62 + local25.aFloat65 * local16.aFloat65;
			Static483.aFloat192 = local16.aFloat63 * local25.aFloat62 + local16.aFloat55 * local25.aFloat61 + local25.aFloat65 * local16.aFloat61;
			Static263.aFloat126 = local25.aFloat59 * local16.aFloat59 + local16.aFloat57 * local25.aFloat63 + local25.aFloat54 * local16.aFloat62;
			Static6.aFloat35 = local25.aFloat54 * local16.aFloat61 + local16.aFloat63 * local25.aFloat59 + local16.aFloat55 * local25.aFloat63;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt8282 + this.anInt8249 >> 1;
			@Pc(508) int local508 = this.anInt8237 + this.anInt8232 >> 1;
			@Pc(527) int local527 = (int) (Static455.aFloat191 * (float) local508 + Static331.aFloat205 * (float) this.anInt8269 + Static263.aFloat126 * (float) local500 + Static443.aFloat189);
			@Pc(546) int local546 = (int) ((float) local508 * Static483.aFloat192 + Static414.aFloat187 + (float) local500 * Static6.aFloat35 + Static282.aFloat148 * (float) this.anInt8269);
			@Pc(565) int local565 = (int) (Static263.aFloat125 * (float) local508 + (float) this.anInt8269 * Static563.aFloat204 + Static362.aFloat162 + Static212.aFloat101 * (float) local500);
			@Pc(584) int local584 = (int) ((float) local508 * Static455.aFloat191 + Static263.aFloat126 * (float) local500 + Static443.aFloat189 + (float) this.anInt8292 * Static331.aFloat205);
			@Pc(603) int local603 = (int) (Static483.aFloat192 * (float) local508 + Static414.aFloat187 + Static6.aFloat35 * (float) local500 + Static282.aFloat148 * (float) this.anInt8292);
			arg1.anInt4887 = this.aClass7_Sub1_15.anInt7349 + local527 * this.aClass7_Sub1_15.anInt7367 / arg2;
			arg1.anInt4885 = this.aClass7_Sub1_15.anInt7360 + local546 * this.aClass7_Sub1_15.anInt7352 / arg2;
			arg1.anInt4883 = this.aClass7_Sub1_15.anInt7360 + this.aClass7_Sub1_15.anInt7352 * local603 / arg2;
			@Pc(662) int local662 = (int) (Static212.aFloat101 * (float) local500 + Static362.aFloat162 + (float) this.anInt8292 * Static563.aFloat204 + Static263.aFloat125 * (float) local508);
			arg1.anInt4884 = this.aClass7_Sub1_15.anInt7349 + this.aClass7_Sub1_15.anInt7367 * local584 / arg2;
			if (local565 >= this.aClass7_Sub1_15.anInt7356 || this.aClass7_Sub1_15.anInt7356 <= local662) {
				arg1.aBoolean341 = true;
				arg1.anInt4886 = this.aClass7_Sub1_15.anInt7349 + this.aClass7_Sub1_15.anInt7367 * (this.anInt8230 + local527) / arg2 - arg1.anInt4887;
			}
		}
		this.aClass7_Sub1_15.method5711((float) arg2);
		this.aClass7_Sub1_15.method5667();
		this.aClass7_Sub1_15.method5700(local25);
		this.method6437();
		this.method6436();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg2 << 4;
			local25 = arg4 << 4;
			Static211.anInt4433 = 0;
			Static130.anInt2959 = 0;
			Static301.anInt6078 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray47.length) {
					local51 = this.anIntArrayArray47[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static130.anInt2959 += this.anIntArray460[local59];
						Static301.anInt6078 += this.anIntArray463[local59];
						Static211.anInt4433 += this.anIntArray459[local59];
						local33++;
					}
				}
			}
			if (local33 <= 0) {
				Static130.anInt2959 = local21;
				Static211.anInt4433 = local25;
				Static301.anInt6078 = local17;
			} else {
				Static301.anInt6078 = Static301.anInt6078 / local33 + local17;
				Static130.anInt2959 = Static130.anInt2959 / local33 + local21;
				Static211.anInt4433 = local25 + Static211.anInt4433 / local33;
			}
			return;
		}
		@Pc(155) int[] local155;
		@Pc(157) int local157;
		if (arg0 == 1) {
			local17 = arg3 << 4;
			local25 = arg4 << 4;
			local21 = arg2 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray47.length) {
					local155 = this.anIntArrayArray47[local35];
					for (local157 = 0; local157 < local155.length; local157++) {
						local53 = local155[local157];
						this.anIntArray460[local53] += local21;
						this.anIntArray463[local53] += local17;
						this.anIntArray459[local53] += local25;
					}
				}
			}
			return;
		}
		@Pc(275) int local275;
		@Pc(293) int local293;
		@Pc(742) int local742;
		@Pc(751) int local751;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray47.length) {
					local155 = this.anIntArrayArray47[local35];
					if ((arg5 & 0x1) == 0) {
						for (local157 = 0; local157 < local155.length; local157++) {
							local53 = local155[local157];
							this.anIntArray460[local53] -= Static130.anInt2959;
							this.anIntArray463[local53] -= Static301.anInt6078;
							this.anIntArray459[local53] -= Static211.anInt4433;
							if (arg4 != 0) {
								local59 = Class262.anIntArray420[arg4];
								local275 = Class262.anIntArray421[arg4];
								local293 = this.anIntArray460[local53] * local275 + local59 * this.anIntArray463[local53] + 16383 >> 14;
								this.anIntArray463[local53] = this.anIntArray463[local53] * local275 + 16383 - this.anIntArray460[local53] * local59 >> 14;
								this.anIntArray460[local53] = local293;
							}
							if (arg2 != 0) {
								local59 = Class262.anIntArray420[arg2];
								local275 = Class262.anIntArray421[arg2];
								local293 = local275 * this.anIntArray463[local53] + 16383 - this.anIntArray459[local53] * local59 >> 14;
								this.anIntArray459[local53] = this.anIntArray463[local53] * local59 + local275 * this.anIntArray459[local53] + 16383 >> 14;
								this.anIntArray463[local53] = local293;
							}
							if (arg3 != 0) {
								local59 = Class262.anIntArray420[arg3];
								local275 = Class262.anIntArray421[arg3];
								local293 = local275 * this.anIntArray460[local53] + this.anIntArray459[local53] * local59 + 16383 >> 14;
								this.anIntArray459[local53] = this.anIntArray459[local53] * local275 + 16383 - this.anIntArray460[local53] * local59 >> 14;
								this.anIntArray460[local53] = local293;
							}
							this.anIntArray460[local53] += Static130.anInt2959;
							this.anIntArray463[local53] += Static301.anInt6078;
							this.anIntArray459[local53] += Static211.anInt4433;
						}
					} else {
						for (local157 = 0; local157 < local155.length; local157++) {
							local53 = local155[local157];
							this.anIntArray460[local53] -= Static130.anInt2959;
							this.anIntArray463[local53] -= Static301.anInt6078;
							this.anIntArray459[local53] -= Static211.anInt4433;
							if (arg2 != 0) {
								local59 = Class262.anIntArray420[arg2];
								local275 = Class262.anIntArray421[arg2];
								local293 = this.anIntArray463[local53] * local275 + 16383 - local59 * this.anIntArray459[local53] >> 14;
								this.anIntArray459[local53] = this.anIntArray459[local53] * local275 + local59 * this.anIntArray463[local53] + 16383 >> 14;
								this.anIntArray463[local53] = local293;
							}
							if (arg4 != 0) {
								local59 = Class262.anIntArray420[arg4];
								local275 = Class262.anIntArray421[arg4];
								local293 = local59 * this.anIntArray463[local53] + this.anIntArray460[local53] * local275 + 16383 >> 14;
								this.anIntArray463[local53] = local275 * this.anIntArray463[local53] + 16383 - local59 * this.anIntArray460[local53] >> 14;
								this.anIntArray460[local53] = local293;
							}
							if (arg3 != 0) {
								local59 = Class262.anIntArray420[arg3];
								local275 = Class262.anIntArray421[arg3];
								local293 = this.anIntArray459[local53] * local59 + local275 * this.anIntArray460[local53] + 16383 >> 14;
								this.anIntArray459[local53] = local275 * this.anIntArray459[local53] + 16383 - this.anIntArray460[local53] * local59 >> 14;
								this.anIntArray460[local53] = local293;
							}
							this.anIntArray460[local53] += Static130.anInt2959;
							this.anIntArray463[local53] += Static301.anInt6078;
							this.anIntArray459[local53] += Static211.anInt4433;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray47.length) {
						local51 = this.anIntArrayArray47[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local275 = this.anIntArray464[local59];
							local293 = this.anIntArray464[local59 + 1];
							for (local742 = local275; local742 < local293; local742++) {
								local751 = this.aShortArray111[local742] - 1;
								if (local751 == -1) {
									break;
								}
								@Pc(764) int local764;
								@Pc(768) int local768;
								@Pc(787) int local787;
								if (arg4 != 0) {
									local764 = Class262.anIntArray420[arg4];
									local768 = Class262.anIntArray421[arg4];
									local787 = this.aShortArray115[local751] * local764 + this.aShortArray117[local751] * local768 + 16383 >> 14;
									this.aShortArray115[local751] = (short) (this.aShortArray115[local751] * local768 + 16383 - local764 * this.aShortArray117[local751] >> 14);
									this.aShortArray117[local751] = (short) local787;
								}
								if (arg2 != 0) {
									local764 = Class262.anIntArray420[arg2];
									local768 = Class262.anIntArray421[arg2];
									local787 = local768 * this.aShortArray115[local751] + 16383 - this.aShortArray119[local751] * local764 >> 14;
									this.aShortArray119[local751] = (short) (local768 * this.aShortArray119[local751] + this.aShortArray115[local751] * local764 + 16383 >> 14);
									this.aShortArray115[local751] = (short) local787;
								}
								if (arg3 != 0) {
									local764 = Class262.anIntArray420[arg3];
									local768 = Class262.anIntArray421[arg3];
									local787 = this.aShortArray119[local751] * local764 + local768 * this.aShortArray117[local751] + 16383 >> 14;
									this.aShortArray119[local751] = (short) (local768 * this.aShortArray119[local751] + 16383 - this.aShortArray117[local751] * local764 >> 14);
									this.aShortArray117[local751] = (short) local787;
								}
							}
						}
					}
				}
				this.method6425();
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray47.length) {
					local155 = this.anIntArrayArray47[local35];
					for (local157 = 0; local157 < local155.length; local157++) {
						local53 = local155[local157];
						this.anIntArray460[local53] -= Static130.anInt2959;
						this.anIntArray463[local53] -= Static301.anInt6078;
						this.anIntArray459[local53] -= Static211.anInt4433;
						this.anIntArray460[local53] = arg2 * this.anIntArray460[local53] >> 7;
						this.anIntArray463[local53] = arg3 * this.anIntArray463[local53] >> 7;
						this.anIntArray459[local53] = arg4 * this.anIntArray459[local53] >> 7;
						this.anIntArray460[local53] += Static130.anInt2959;
						this.anIntArray463[local53] += Static301.anInt6078;
						this.anIntArray459[local53] += Static211.anInt4433;
					}
				}
			}
		} else {
			@Pc(1195) Class243 local1195;
			@Pc(1094) boolean local1094;
			@Pc(1190) Class328 local1190;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					local1094 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray46.length > local41) {
							local51 = this.anIntArrayArray46[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local275 = (this.aByteArray76[local59] & 0xFF) + (arg2 * 8);
								if (local275 < 0) {
									local275 = 0;
								} else if (local275 > 255) {
									local275 = 255;
								}
								this.aByteArray76[local59] = (byte) local275;
							}
							local1094 |= local51.length > 0;
						}
					}
					if (local1094) {
						if (this.aClass328Array1 != null) {
							for (local41 = 0; local41 < this.anInt8307; local41++) {
								local1190 = this.aClass328Array1[local41];
								local1195 = this.aClass243Array1[local41];
								local1195.anInt7119 = local1195.anInt7119 & 0xFFFFFF | 255 - (this.aByteArray76[local1190.anInt9778] & 0xFF) << 24;
							}
						}
						this.method6432();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray46 != null) {
					local1094 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray46.length > local41) {
							local51 = this.anIntArrayArray46[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local275 = this.aShortArray108[local59] & 0xFFFF;
								local293 = local275 >> 10 & 0x3F;
								local742 = local275 >> 7 & 0x7;
								@Pc(1285) int local1285 = arg2 + local293 & 0x3F;
								local751 = local275 & 0x7F;
								local742 += arg3 / 4;
								if (local742 < 0) {
									local742 = 0;
								} else if (local742 > 7) {
									local742 = 7;
								}
								local751 += arg4;
								if (local751 < 0) {
									local751 = 0;
								} else if (local751 > 127) {
									local751 = 127;
								}
								this.aShortArray108[local59] = (short) (local742 << 7 | local1285 << 10 | local751);
							}
							local1094 |= local51.length > 0;
						}
					}
					if (local1094) {
						if (this.aClass328Array1 != null) {
							for (local41 = 0; local41 < this.anInt8307; local41++) {
								local1190 = this.aClass328Array1[local41];
								local1195 = this.aClass243Array1[local41];
								local1195.anInt7119 = local1195.anInt7119 & 0xFF000000 | Static394.anIntArray413[this.aShortArray108[local1190.anInt9778] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6432();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray45 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray45.length > local35) {
							local155 = this.anIntArrayArray45[local35];
							for (local157 = 0; local157 < local155.length; local157++) {
								local1195 = this.aClass243Array1[local155[local157]];
								local1195.anInt7123 += arg2;
								local1195.anInt7115 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray45 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray45.length > local35) {
							local155 = this.anIntArrayArray45[local35];
							for (local157 = 0; local157 < local155.length; local157++) {
								local1195 = this.aClass243Array1[local155[local157]];
								local1195.anInt7117 = local1195.anInt7117 * arg2 >> 7;
								local1195.anInt7114 = arg3 * local1195.anInt7114 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray45.length > local35) {
						local155 = this.anIntArrayArray45[local35];
						for (local157 = 0; local157 < local155.length; local157++) {
							local1195 = this.aClass243Array1[local155[local157]];
							local1195.anInt7120 = local1195.anInt7120 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort102;
	}

	@OriginalMember(owner = "client!qh", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort103;
	}

	@OriginalMember(owner = "client!qh", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8243; local3++) {
			if (arg0 != 0) {
				this.anIntArray460[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray463[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray459[local3] += arg2;
			}
		}
		this.method6424();
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8301; local3++) {
			this.anIntArray460[local3] = this.anIntArray460[local3] + 7 >> 4;
			this.anIntArray463[local3] = this.anIntArray463[local3] + 7 >> 4;
			this.anIntArray459[local3] = this.anIntArray459[local3] + 7 >> 4;
		}
		this.method6424();
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(B)V")
	private void method6439() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt8243; local23++) {
			@Pc(30) int local30 = this.anIntArray460[local23];
			@Pc(35) int local35 = this.anIntArray463[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			@Pc(68) int local68 = this.anIntArray459[local23];
			if (local11 > local68) {
				local11 = local68;
			}
			if (local68 > local17) {
				local17 = local68;
			}
			@Pc(86) int local86 = local68 * local68 + local30 * local30;
			if (local19 < local86) {
				local19 = local86;
			}
			local86 = local30 * local30 + local68 * local68 + local35 * local35;
			if (local86 > local21) {
				local21 = local86;
			}
		}
		this.anInt8232 = local11;
		this.anInt8237 = local17;
		this.anInt8282 = local7;
		this.anInt8249 = local13;
		this.anInt8292 = local15;
		this.anInt8269 = local9;
		this.anInt8230 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt8248 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean588 = true;
	}
}
