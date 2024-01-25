import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!pea", name = "o", descriptor = "I")
	private int anInt7035;

	@OriginalMember(owner = "client!pea", name = "v", descriptor = "I")
	private int anInt7040;

	@OriginalMember(owner = "client!pea", name = "D", descriptor = "Lclient!cq;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!pea", name = "F", descriptor = "Lclient!kga;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "client!pea", name = "S", descriptor = "I")
	private int anInt7057;

	@OriginalMember(owner = "client!pea", name = "V", descriptor = "Lclient!vd;")
	private Class344 aClass344_1;

	@OriginalMember(owner = "client!pea", name = "Z", descriptor = "I")
	private int anInt7062;

	@OriginalMember(owner = "client!pea", name = "bb", descriptor = "I")
	private int anInt7063;

	@OriginalMember(owner = "client!pea", name = "ib", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_14;

	@OriginalMember(owner = "client!pea", name = "qb", descriptor = "I")
	private int anInt7072;

	@OriginalMember(owner = "client!pea", name = "sb", descriptor = "Z")
	private boolean aBoolean540;

	@OriginalMember(owner = "client!pea", name = "ub", descriptor = "I")
	private int anInt7074;

	@OriginalMember(owner = "client!pea", name = "wb", descriptor = "Lclient!cq;")
	private Class47 aClass47_2;

	@OriginalMember(owner = "client!pea", name = "Cb", descriptor = "I")
	private int anInt7080;

	@OriginalMember(owner = "client!pea", name = "Gb", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!pea", name = "Pb", descriptor = "Lclient!cq;")
	private Class47 aClass47_3;

	@OriginalMember(owner = "client!pea", name = "Zb", descriptor = "I")
	private int anInt7092;

	@OriginalMember(owner = "client!pea", name = "nc", descriptor = "Z")
	private boolean aBoolean543;

	@OriginalMember(owner = "client!pea", name = "pc", descriptor = "Lclient!cq;")
	private Class47 aClass47_4;

	@OriginalMember(owner = "client!pea", name = "xc", descriptor = "I")
	private int anInt7105;

	@OriginalMember(owner = "client!pea", name = "Dc", descriptor = "I")
	private int anInt7111;

	@OriginalMember(owner = "client!pea", name = "u", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!pea", name = "fc", descriptor = "I")
	private int anInt7097;

	@OriginalMember(owner = "client!pea", name = "cc", descriptor = "I")
	private int anInt7094;

	@OriginalMember(owner = "client!pea", name = "jc", descriptor = "Z")
	private boolean aBoolean542;

	@OriginalMember(owner = "client!pea", name = "tb", descriptor = "I")
	private int anInt7073;

	@OriginalMember(owner = "client!pea", name = "wc", descriptor = "[I")
	private int[] anIntArray419;

	@OriginalMember(owner = "client!pea", name = "oc", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!pea", name = "X", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!pea", name = "cb", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!pea", name = "U", descriptor = "I")
	private int anInt7059;

	@OriginalMember(owner = "client!pea", name = "C", descriptor = "[Lclient!lp;")
	private Class212[] aClass212Array3;

	@OriginalMember(owner = "client!pea", name = "Rb", descriptor = "[Lclient!ns;")
	private Class244[] aClass244Array3;

	@OriginalMember(owner = "client!pea", name = "M", descriptor = "I")
	private int anInt7051;

	@OriginalMember(owner = "client!pea", name = "t", descriptor = "[Lclient!lda;")
	private Class201[] aClass201Array1;

	@OriginalMember(owner = "client!pea", name = "G", descriptor = "[Lclient!fda;")
	private Class95[] aClass95Array1;

	@OriginalMember(owner = "client!pea", name = "sc", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!pea", name = "vc", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!pea", name = "Gc", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!pea", name = "bc", descriptor = "[F")
	private float[] aFloatArray61;

	@OriginalMember(owner = "client!pea", name = "Hb", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!pea", name = "fb", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!pea", name = "Xb", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!pea", name = "H", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!pea", name = "Nb", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!pea", name = "Db", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!pea", name = "y", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!pea", name = "ab", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!pea", name = "Bb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!pea", name = "Sb", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!pea", name = "Hc", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!pea", name = "rb", descriptor = "[F")
	private float[] aFloatArray60;

	@OriginalMember(owner = "client!pea", name = "kb", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!pea", name = "Fb", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!pea", name = "rc", descriptor = "[I")
	private int[] anIntArray418;

	@OriginalMember(owner = "client!pea", name = "Yb", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!pea", name = "gb", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!pea", name = "kc", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!pea", name = "gc", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!pea", name = "Jb", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!nv;Lclient!nba;IIII)V")
	public Class52_Sub2(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface9 local11 = arg0.anInterface9_13;
		this.anIntArray413 = new int[arg1.anInt6260 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt6268];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt6268; local24++) {
			if ((arg1.aByteArray61 == null || arg1.aByteArray61[local24] != 2) && (arg1.aShortArray51 == null || arg1.aShortArray51[local24] == -1 || !local11.method947(arg1.aShortArray51[local24] & 0xFFFF).aBoolean34)) {
				local22[this.anInt7097++] = local24;
				this.anIntArray413[arg1.aShortArray55[local24]]++;
				this.anIntArray413[arg1.aShortArray61[local24]]++;
				this.anIntArray413[arg1.aShortArray52[local24]]++;
			}
		}
		this.anInt7094 = this.anInt7097;
		@Pc(114) long[] local114 = new long[this.anInt7097];
		@Pc(126) boolean local126 = (this.anInt7057 & 0x100) != 0;
		@Pc(138) int local138;
		@Pc(301) int local301;
		for (@Pc(128) int local128 = 0; local128 < this.anInt7097; local128++) {
			@Pc(134) int local134 = local22[local128];
			@Pc(136) Class17 local136 = null;
			local138 = 0;
			@Pc(140) byte local140 = 0;
			@Pc(142) byte local142 = 0;
			@Pc(144) byte local144 = 0;
			if (arg1.aClass362Array1 != null) {
				@Pc(149) boolean local149 = false;
				for (@Pc(151) int local151 = 0; local151 < arg1.aClass362Array1.length; local151++) {
					@Pc(158) Class362 local158 = arg1.aClass362Array1[local151];
					if (local158.anInt9627 == local134) {
						@Pc(167) Class299 local167 = Static540.method7344(local158.anInt9626);
						if (local167.aBoolean608) {
							local149 = true;
						}
						if (local167.anInt7984 != -1) {
							@Pc(183) Class17 local183 = local11.method947(local167.anInt7984);
							if (local183.aBoolean27) {
								this.aBoolean542 = true;
							}
						}
					}
				}
				if (local149) {
					local114[local128] = Long.MAX_VALUE;
					this.anInt7094--;
					continue;
				}
			}
			@Pc(215) short local215 = -1;
			if (arg1.aShortArray51 != null) {
				local215 = arg1.aShortArray51[local134];
				if (local215 != -1) {
					local136 = local11.method947(local215 & 0xFFFF);
					local144 = local136.aByte20;
					local142 = local136.aByte22;
				}
			}
			@Pc(263) boolean local263 = arg1.aByteArray62 != null && arg1.aByteArray62[local134] != 0 || local136 != null && local136.aBoolean27 | !local136.aBoolean25;
			if ((local126 || local263) && arg1.aByteArray60 != null) {
				local138 += arg1.aByteArray60[local134] << 17;
			}
			if (local263) {
				local138 += 65536;
			}
			local138 += (local142 & 0xFF) << 8;
			local301 = local140 + ((local215 & 0xFFFF) << 16);
			local138 += local144 & 0xFF;
			@Pc(313) int local313 = local301 + (local128 & 0xFFFF);
			local114[local128] = (long) local313 + ((long) local138 << 32);
			this.aBoolean542 |= local263;
		}
		Static575.method7747(local22, local114);
		this.anInt7073 = arg1.anInt6260;
		this.anIntArray419 = arg1.anIntArray372;
		this.anIntArray417 = arg1.anIntArray366;
		this.aShortArray77 = arg1.aShortArray53;
		this.anIntArray414 = arg1.anIntArray375;
		this.anInt7059 = arg1.anInt6251;
		this.aClass212Array3 = arg1.aClass212Array1;
		this.aClass244Array3 = arg1.aClass244Array1;
		@Pc(374) Class108[] local374 = new Class108[this.anInt7073];
		@Pc(394) int local394;
		@Pc(408) int local408;
		if (arg1.aClass362Array1 != null) {
			this.anInt7051 = arg1.aClass362Array1.length;
			this.aClass201Array1 = new Class201[this.anInt7051];
			this.aClass95Array1 = new Class95[this.anInt7051];
			for (local394 = 0; local394 < this.anInt7051; local394++) {
				@Pc(401) Class362 local401 = arg1.aClass362Array1[local394];
				@Pc(406) Class299 local406 = Static540.method7344(local401.anInt9626);
				local408 = -1;
				for (@Pc(410) int local410 = 0; local410 < this.anInt7097; local410++) {
					if (local401.anInt9627 == local22[local410]) {
						local408 = local410;
						break;
					}
				}
				if (local408 == -1) {
					throw new RuntimeException();
				}
				@Pc(446) int local446 = Static226.anIntArray212[arg1.aShortArray59[local401.anInt9627] & 0xFFFF] & 0xFFFFFF;
				@Pc(464) int local464 = local446 | 255 - (arg1.aByteArray62 == null ? 0 : arg1.aByteArray62[local401.anInt9627]) << 24;
				this.aClass95Array1[local394] = new Class95(local408, arg1.aShortArray55[local401.anInt9627], arg1.aShortArray61[local401.anInt9627], arg1.aShortArray52[local401.anInt9627], local406.anInt7990, local406.anInt7991, local406.anInt7984, local406.anInt7988, local406.anInt7989, local406.aBoolean608, local406.aBoolean607, local401.anInt9629);
				this.aClass201Array1[local394] = new Class201(local464);
			}
		}
		local394 = this.anInt7097 * 3;
		this.aShortArray85 = new short[local394];
		if (arg1.aShortArray56 != null) {
			this.aShortArray86 = new short[this.anInt7097];
		}
		this.aShortArray87 = new short[local394];
		this.aFloatArray61 = new float[local394];
		this.aShortArray83 = new short[this.anInt7097];
		this.aShortArray79 = new short[local394];
		this.aByteArray70 = new byte[local394];
		this.aByteArray69 = new byte[this.anInt7097];
		this.aShortArray84 = new short[this.anInt7097];
		this.aShortArray82 = new short[local394];
		this.aShortArray76 = new short[this.anInt7097];
		this.aShortArray78 = new short[local394];
		this.aShortArray81 = new short[local394];
		Static170.aLongArray5 = new long[local394];
		this.aShort80 = (short) arg4;
		this.aShortArray88 = new short[this.anInt7097];
		this.aFloatArray60 = new float[local394];
		this.aShortArray80 = new short[this.anInt7097];
		this.aShort79 = (short) arg3;
		local138 = 0;
		for (local301 = 0; local301 < arg1.anInt6260; local301++) {
			local408 = this.anIntArray413[local301];
			this.anIntArray413[local301] = local138;
			local138 += local408;
			local374[local301] = new Class108();
		}
		this.anIntArray413[arg1.anInt6260] = local138;
		@Pc(649) int[] local649 = null;
		@Pc(651) int[] local651 = null;
		@Pc(653) int[] local653 = null;
		@Pc(655) float[][] local655 = null;
		@Pc(673) int[] local673;
		@Pc(681) int local681;
		@Pc(726) int local726;
		@Pc(732) int local732;
		@Pc(745) int local745;
		@Pc(747) int local747;
		@Pc(780) int local780;
		@Pc(785) int local785;
		@Pc(959) float local959;
		@Pc(951) float local951;
		@Pc(943) float local943;
		if (arg1.aByteArray64 != null) {
			@Pc(661) int local661 = arg1.anInt6267;
			@Pc(664) int[] local664 = new int[local661];
			@Pc(667) int[] local667 = new int[local661];
			@Pc(670) int[] local670 = new int[local661];
			local673 = new int[local661];
			@Pc(676) int[] local676 = new int[local661];
			@Pc(679) int[] local679 = new int[local661];
			for (local681 = 0; local681 < local661; local681++) {
				local664[local681] = Integer.MAX_VALUE;
				local667[local681] = -2147483647;
				local670[local681] = Integer.MAX_VALUE;
				local673[local681] = -2147483647;
				local676[local681] = Integer.MAX_VALUE;
				local679[local681] = -2147483647;
			}
			local653 = new int[local661];
			local655 = new float[local661][];
			local649 = new int[local661];
			for (local726 = 0; local726 < this.anInt7097; local726++) {
				local732 = local22[local726];
				if (arg1.aByteArray64[local732] != -1) {
					local745 = arg1.aByteArray64[local732] & 0xFF;
					for (local747 = 0; local747 < 3; local747++) {
						@Pc(761) short local761;
						if (local747 == 0) {
							local761 = arg1.aShortArray55[local732];
						} else if (local747 == 1) {
							local761 = arg1.aShortArray61[local732];
						} else {
							local761 = arg1.aShortArray52[local732];
						}
						local780 = arg1.anIntArray372[local761];
						local785 = arg1.anIntArray375[local761];
						@Pc(790) int local790 = arg1.anIntArray366[local761];
						if (local780 < local664[local745]) {
							local664[local745] = local780;
						}
						if (local667[local745] < local780) {
							local667[local745] = local780;
						}
						if (local670[local745] > local785) {
							local670[local745] = local785;
						}
						if (local785 > local673[local745]) {
							local673[local745] = local785;
						}
						if (local676[local745] > local790) {
							local676[local745] = local790;
						}
						if (local679[local745] < local790) {
							local679[local745] = local790;
						}
					}
				}
			}
			local651 = new int[local661];
			for (local732 = 0; local732 < local661; local732++) {
				@Pc(889) byte local889 = arg1.aByteArray59[local732];
				if (local889 > 0) {
					local649[local732] = (local664[local732] + local667[local732]) / 2;
					local651[local732] = (local670[local732] + local673[local732]) / 2;
					local653[local732] = (local676[local732] + local679[local732]) / 2;
					if (local889 == 1) {
						local785 = arg1.anIntArray374[local732];
						local951 = 64.0F / (float) arg1.anIntArray369[local732];
						if (local785 == 0) {
							local943 = 1.0F;
							local959 = 1.0F;
						} else if (local785 <= 0) {
							local959 = (float) -local785 / 1024.0F;
							local943 = 1.0F;
						} else {
							local943 = (float) local785 / 1024.0F;
							local959 = 1.0F;
						}
					} else if (local889 == 2) {
						local943 = 64.0F / (float) arg1.anIntArray373[local732];
						local951 = 64.0F / (float) arg1.anIntArray369[local732];
						local959 = 64.0F / (float) arg1.anIntArray374[local732];
					} else {
						local959 = (float) arg1.anIntArray374[local732] / 1024.0F;
						local951 = (float) arg1.anIntArray369[local732] / 1024.0F;
						local943 = (float) arg1.anIntArray373[local732] / 1024.0F;
					}
					local655[local732] = Static237.method3501(arg1.aByteArray63[local732] & 0xFF, arg1.aShortArray54[local732], arg1.aShortArray58[local732], local951, local959, local943, arg1.aShortArray57[local732]);
				}
			}
		}
		@Pc(1064) Class203[] local1064 = new Class203[arg1.anInt6268];
		@Pc(1083) short local1083;
		@Pc(1094) int local1094;
		@Pc(1105) int local1105;
		for (@Pc(1066) int local1066 = 0; local1066 < arg1.anInt6268; local1066++) {
			@Pc(1073) short local1073 = arg1.aShortArray55[local1066];
			@Pc(1078) short local1078 = arg1.aShortArray61[local1066];
			local1083 = arg1.aShortArray52[local1066];
			local1094 = this.anIntArray419[local1078] - this.anIntArray419[local1073];
			local1105 = this.anIntArray414[local1078] - this.anIntArray414[local1073];
			local681 = this.anIntArray417[local1078] - this.anIntArray417[local1073];
			local726 = this.anIntArray419[local1083] - this.anIntArray419[local1073];
			local732 = this.anIntArray414[local1083] - this.anIntArray414[local1073];
			local745 = this.anIntArray417[local1083] - this.anIntArray417[local1073];
			local747 = local745 * local1105 - local681 * local732;
			@Pc(1163) int local1163 = local681 * local726 - local745 * local1094;
			local780 = local732 * local1094 - local726 * local1105;
			while (local747 > 8192 || local1163 > 8192 || local780 > 8192 || local747 < -8192 || local1163 < -8192 || local780 < -8192) {
				local1163 >>= 0x1;
				local780 >>= 0x1;
				local747 >>= 0x1;
			}
			local785 = (int) Math.sqrt((double) (local780 * local780 + local1163 * local1163 + local747 * local747));
			if (local785 <= 0) {
				local785 = 1;
			}
			local747 = local747 * 256 / local785;
			local1163 = local1163 * 256 / local785;
			local780 = local780 * 256 / local785;
			@Pc(1264) byte local1264 = arg1.aByteArray61 == null ? 0 : arg1.aByteArray61[local1066];
			if (local1264 == 0) {
				@Pc(1292) Class108 local1292 = local374[local1073];
				local1292.anInt2837++;
				local1292.anInt2833 += local747;
				local1292.anInt2835 += local1163;
				local1292.anInt2832 += local780;
				@Pc(1320) Class108 local1320 = local374[local1078];
				local1320.anInt2833 += local747;
				local1320.anInt2832 += local780;
				local1320.anInt2835 += local1163;
				local1320.anInt2837++;
				@Pc(1348) Class108 local1348 = local374[local1083];
				local1348.anInt2837++;
				local1348.anInt2832 += local780;
				local1348.anInt2835 += local1163;
				local1348.anInt2833 += local747;
			} else if (local1264 == 1) {
				@Pc(1277) Class203 local1277 = local1064[local1066] = new Class203();
				local1277.anInt5285 = local780;
				local1277.anInt5282 = local1163;
				local1277.anInt5283 = local747;
			}
		}
		@Pc(1389) int local1389;
		for (@Pc(1383) int local1383 = 0; local1383 < this.anInt7097; local1383++) {
			local1389 = local22[local1383];
			@Pc(1396) int local1396 = arg1.aShortArray59[local1389] & 0xFFFF;
			@Pc(1404) short local1404;
			if (arg1.aShortArray51 == null) {
				local1404 = -1;
			} else {
				local1404 = arg1.aShortArray51[local1389];
			}
			if (arg1.aByteArray64 == null) {
				local1105 = -1;
			} else {
				local1105 = arg1.aByteArray64[local1389];
			}
			if (arg1.aByteArray62 == null) {
				local681 = 0;
			} else {
				local681 = arg1.aByteArray62[local1389] & 0xFF;
			}
			@Pc(1436) float local1436 = 0.0F;
			@Pc(1438) float local1438 = 0.0F;
			@Pc(1440) float local1440 = 0.0F;
			local959 = 0.0F;
			local951 = 0.0F;
			local943 = 0.0F;
			@Pc(1448) byte local1448 = 0;
			@Pc(1450) byte local1450 = 0;
			@Pc(1452) int local1452 = 0;
			@Pc(1486) byte local1486;
			@Pc(1506) short local1506;
			@Pc(1511) short local1511;
			@Pc(1516) short local1516;
			if (local1404 != -1) {
				if (local1105 == -1) {
					local1438 = 1.0F;
					local1448 = 1;
					local1450 = 2;
					local1440 = 1.0F;
					local951 = 0.0F;
					local943 = 0.0F;
					local1436 = 0.0F;
					local959 = 1.0F;
				} else {
					local1105 &= 0xFF;
					local1486 = arg1.aByteArray59[local1105];
					@Pc(1496) short local1496;
					@Pc(1501) short local1501;
					@Pc(1539) float local1539;
					@Pc(1548) float local1548;
					@Pc(1556) float local1556;
					@Pc(1639) float local1639;
					@Pc(1648) float local1648;
					@Pc(1657) float local1657;
					@Pc(1666) float local1666;
					@Pc(1675) float local1675;
					@Pc(1684) float local1684;
					if (local1486 == 0) {
						local1496 = arg1.aShortArray55[local1389];
						local1501 = arg1.aShortArray61[local1389];
						local1506 = arg1.aShortArray52[local1389];
						local1511 = arg1.aShortArray57[local1105];
						local1516 = arg1.aShortArray58[local1105];
						@Pc(1521) short local1521 = arg1.aShortArray54[local1105];
						@Pc(1527) float local1527 = (float) arg1.anIntArray372[local1511];
						@Pc(1533) float local1533 = (float) arg1.anIntArray375[local1511];
						local1539 = arg1.anIntArray366[local1511];
						local1548 = (float) arg1.anIntArray372[local1516] - local1527;
						local1556 = (float) arg1.anIntArray375[local1516] - local1533;
						@Pc(1564) float local1564 = (float) arg1.anIntArray366[local1516] - local1539;
						@Pc(1572) float local1572 = (float) arg1.anIntArray372[local1521] - local1527;
						@Pc(1580) float local1580 = (float) arg1.anIntArray375[local1521] - local1533;
						@Pc(1588) float local1588 = (float) arg1.anIntArray366[local1521] - local1539;
						@Pc(1597) float local1597 = (float) arg1.anIntArray372[local1496] - local1527;
						@Pc(1605) float local1605 = (float) arg1.anIntArray375[local1496] - local1533;
						@Pc(1613) float local1613 = (float) arg1.anIntArray366[local1496] - local1539;
						@Pc(1622) float local1622 = (float) arg1.anIntArray372[local1501] - local1527;
						@Pc(1630) float local1630 = (float) arg1.anIntArray375[local1501] - local1533;
						local1639 = (float) arg1.anIntArray366[local1501] - local1539;
						local1648 = (float) arg1.anIntArray372[local1506] - local1527;
						local1657 = (float) arg1.anIntArray375[local1506] - local1533;
						local1666 = (float) arg1.anIntArray366[local1506] - local1539;
						local1675 = local1588 * local1556 - local1564 * local1580;
						local1684 = local1572 * local1564 - local1588 * local1548;
						@Pc(1692) float local1692 = local1548 * local1580 - local1556 * local1572;
						@Pc(1701) float local1701 = local1692 * local1580 - local1684 * local1588;
						@Pc(1709) float local1709 = local1675 * local1588 - local1692 * local1572;
						@Pc(1718) float local1718 = local1684 * local1572 - local1675 * local1580;
						@Pc(1732) float local1732 = 1.0F / (local1718 * local1564 + local1701 * local1548 + local1709 * local1556);
						local1436 = (local1613 * local1718 + local1701 * local1597 + local1605 * local1709) * local1732;
						local951 = local1732 * (local1648 * local1701 + local1709 * local1657 + local1718 * local1666);
						local1440 = (local1639 * local1718 + local1630 * local1709 + local1701 * local1622) * local1732;
						@Pc(1783) float local1783 = local1692 * local1556 - local1564 * local1684;
						@Pc(1791) float local1791 = local1684 * local1548 - local1675 * local1556;
						@Pc(1799) float local1799 = local1675 * local1564 - local1692 * local1548;
						@Pc(1813) float local1813 = 1.0F / (local1580 * local1799 + local1572 * local1783 + local1588 * local1791);
						local943 = (local1666 * local1791 + local1783 * local1648 + local1657 * local1799) * local1813;
						local1438 = (local1783 * local1597 + local1605 * local1799 + local1791 * local1613) * local1813;
						local959 = local1813 * (local1639 * local1791 + local1783 * local1622 + local1630 * local1799);
					} else {
						local1496 = arg1.aShortArray55[local1389];
						local1501 = arg1.aShortArray61[local1389];
						local1506 = arg1.aShortArray52[local1389];
						@Pc(1876) int local1876 = local649[local1105];
						@Pc(1880) int local1880 = local651[local1105];
						@Pc(1884) int local1884 = local653[local1105];
						@Pc(1888) float[] local1888 = local655[local1105];
						@Pc(1893) byte local1893 = arg1.aByteArray58[local1105];
						local1539 = (float) arg1.anIntArray368[local1105] / 256.0F;
						if (local1486 == 1) {
							local1548 = (float) arg1.anIntArray373[local1105] / 1024.0F;
							Static412.method5876(local1880, arg1.anIntArray372[local1496], local1539, arg1.anIntArray375[local1496], local1888, local1548, local1884, arg1.anIntArray366[local1496], local1893, local1876);
							local1438 = Static106.aFloat41;
							local1436 = Static70.aFloat37;
							Static412.method5876(local1880, arg1.anIntArray372[local1501], local1539, arg1.anIntArray375[local1501], local1888, local1548, local1884, arg1.anIntArray366[local1501], local1893, local1876);
							local1440 = Static70.aFloat37;
							local959 = Static106.aFloat41;
							Static412.method5876(local1880, arg1.anIntArray372[local1506], local1539, arg1.anIntArray375[local1506], local1888, local1548, local1884, arg1.anIntArray366[local1506], local1893, local1876);
							local951 = Static70.aFloat37;
							local943 = Static106.aFloat41;
							local1556 = local1548 / 2.0F;
							if ((local1893 & 0x1) == 0) {
								if (local1440 - local1436 > local1556) {
									local1448 = 1;
									local1440 -= local1548;
								} else if (local1436 - local1440 > local1556) {
									local1440 += local1548;
									local1448 = 2;
								}
								if (local1556 < local951 - local1436) {
									local1450 = 1;
									local951 -= local1548;
								} else if (local1436 - local951 > local1556) {
									local951 += local1548;
									local1450 = 2;
								}
							} else {
								if (local943 - local1438 > local1556) {
									local1450 = 1;
									local943 -= local1548;
								} else if (local1438 - local943 > local1556) {
									local1450 = 2;
									local943 += local1548;
								}
								if (local1556 < local959 - local1438) {
									local959 -= local1548;
									local1448 = 1;
								} else if (local1438 - local959 > local1556) {
									local1448 = 2;
									local959 += local1548;
								}
							}
						} else if (local1486 == 2) {
							local1548 = (float) arg1.anIntArray365[local1105] / 256.0F;
							local1556 = (float) arg1.anIntArray371[local1105] / 256.0F;
							@Pc(2333) int local2333 = arg1.anIntArray372[local1501] - arg1.anIntArray372[local1496];
							@Pc(2344) int local2344 = arg1.anIntArray375[local1501] - arg1.anIntArray375[local1496];
							@Pc(2355) int local2355 = arg1.anIntArray366[local1501] - arg1.anIntArray366[local1496];
							@Pc(2365) int local2365 = arg1.anIntArray372[local1506] - arg1.anIntArray372[local1496];
							@Pc(2376) int local2376 = arg1.anIntArray375[local1506] - arg1.anIntArray375[local1496];
							@Pc(2387) int local2387 = arg1.anIntArray366[local1506] - arg1.anIntArray366[local1496];
							@Pc(2396) int local2396 = local2387 * local2344 - local2355 * local2376;
							@Pc(2405) int local2405 = local2355 * local2365 - local2333 * local2387;
							@Pc(2414) int local2414 = local2333 * local2376 - local2365 * local2344;
							local1639 = 64.0F / (float) arg1.anIntArray374[local1105];
							local1648 = 64.0F / (float) arg1.anIntArray369[local1105];
							local1657 = 64.0F / (float) arg1.anIntArray373[local1105];
							local1666 = ((float) local2405 * local1888[1] + local1888[0] * (float) local2396 + local1888[2] * (float) local2414) / local1639;
							local1675 = (local1888[5] * (float) local2414 + local1888[3] * (float) local2396 + (float) local2405 * local1888[4]) / local1648;
							local1684 = (local1888[8] * (float) local2414 + (float) local2405 * local1888[7] + local1888[6] * (float) local2396) / local1657;
							local1452 = Static142.method2418(local1675, local1666, local1684);
							Static376.method1508(local1888, local1539, arg1.anIntArray375[local1496], local1548, local1556, arg1.anIntArray372[local1496], local1884, local1876, local1893, local1452, local1880, arg1.anIntArray366[local1496]);
							local1438 = Static379.aFloat180;
							local1436 = Static390.aFloat238;
							Static376.method1508(local1888, local1539, arg1.anIntArray375[local1501], local1548, local1556, arg1.anIntArray372[local1501], local1884, local1876, local1893, local1452, local1880, arg1.anIntArray366[local1501]);
							local1440 = Static390.aFloat238;
							local959 = Static379.aFloat180;
							Static376.method1508(local1888, local1539, arg1.anIntArray375[local1506], local1548, local1556, arg1.anIntArray372[local1506], local1884, local1876, local1893, local1452, local1880, arg1.anIntArray366[local1506]);
							local951 = Static390.aFloat238;
							local943 = Static379.aFloat180;
						} else if (local1486 == 3) {
							Static586.method7843(local1876, local1884, local1888, arg1.anIntArray372[local1496], local1539, local1880, local1893, arg1.anIntArray375[local1496], arg1.anIntArray366[local1496]);
							local1438 = Static482.aFloat205;
							local1436 = Static271.aFloat132;
							Static586.method7843(local1876, local1884, local1888, arg1.anIntArray372[local1501], local1539, local1880, local1893, arg1.anIntArray375[local1501], arg1.anIntArray366[local1501]);
							local1440 = Static271.aFloat132;
							local959 = Static482.aFloat205;
							Static586.method7843(local1876, local1884, local1888, arg1.anIntArray372[local1506], local1539, local1880, local1893, arg1.anIntArray375[local1506], arg1.anIntArray366[local1506]);
							local951 = Static271.aFloat132;
							local943 = Static482.aFloat205;
							if ((local1893 & 0x1) == 0) {
								if (local951 - local1436 > 0.5F) {
									local1450 = 1;
									local951--;
								} else if (local1436 - local951 > 0.5F) {
									local1450 = 2;
									local951++;
								}
								if (local1440 - local1436 > 0.5F) {
									local1440--;
									local1448 = 1;
								} else if (local1436 - local1440 > 0.5F) {
									local1440++;
									local1448 = 2;
								}
							} else {
								if (local943 - local1438 > 0.5F) {
									local1450 = 1;
									local943--;
								} else if (local1438 - local943 > 0.5F) {
									local943++;
									local1450 = 2;
								}
								if (local959 - local1438 > 0.5F) {
									local1448 = 1;
									local959--;
								} else if (local1438 - local959 > 0.5F) {
									local1448 = 2;
									local959++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray61 == null) {
				local1486 = 0;
			} else {
				local1486 = arg1.aByteArray61[local1389];
			}
			if (local1486 == 0) {
				@Pc(2631) long local2631 = ((long) local681 + (long) (local1396 << 8) + (long) (local1452 << 24) << 32) + (long) (local1105 << 2);
				local1506 = arg1.aShortArray55[local1389];
				local1511 = arg1.aShortArray61[local1389];
				local1516 = arg1.aShortArray52[local1389];
				@Pc(2650) Class108 local2650 = local374[local1506];
				this.aShortArray80[local1383] = this.method5701(local1383, local1506, local1436, local2650.anInt2835, local2650.anInt2832, local2631, local2650.anInt2833, arg1, local1438, local2650.anInt2837);
				@Pc(2675) Class108 local2675 = local374[local1511];
				this.aShortArray84[local1383] = this.method5701(local1383, local1511, local1440, local2675.anInt2835, local2675.anInt2832, (long) local1448 + local2631, local2675.anInt2833, arg1, local959, local2675.anInt2837);
				@Pc(2703) Class108 local2703 = local374[local1516];
				this.aShortArray76[local1383] = this.method5701(local1383, local1516, local951, local2703.anInt2835, local2703.anInt2832, local2631 + (long) local1450, local2703.anInt2833, arg1, local943, local2703.anInt2837);
			} else if (local1486 == 1) {
				@Pc(2736) Class203 local2736 = local1064[local1389];
				@Pc(2783) long local2783 = ((long) local681 + (long) (local1452 << 24) + (long) (local1396 << 8) << 32) + (long) ((local1105 << 2) - (-(local2736.anInt5283 <= 0 ? 2048 : 1024) - (local2736.anInt5282 + 256 << 12) - (local2736.anInt5285 - -256 << 22)));
				this.aShortArray80[local1383] = this.method5701(local1383, arg1.aShortArray55[local1389], local1436, local2736.anInt5282, local2736.anInt5285, local2783, local2736.anInt5283, arg1, local1438, 0);
				this.aShortArray84[local1383] = this.method5701(local1383, arg1.aShortArray61[local1389], local1440, local2736.anInt5282, local2736.anInt5285, (long) local1448 + local2783, local2736.anInt5283, arg1, local959, 0);
				this.aShortArray76[local1383] = this.method5701(local1383, arg1.aShortArray52[local1389], local951, local2736.anInt5282, local2736.anInt5285, (long) local1450 + local2783, local2736.anInt5283, arg1, local943, 0);
			}
			if (arg1.aShortArray51 == null) {
				this.aShortArray83[local1383] = -1;
			} else {
				this.aShortArray83[local1383] = arg1.aShortArray51[local1389];
			}
			if (arg1.aByteArray62 != null) {
				this.aByteArray69[local1383] = arg1.aByteArray62[local1389];
			}
			if (arg1.aShortArray56 != null) {
				this.aShortArray86[local1383] = arg1.aShortArray56[local1389];
			}
			this.aShortArray88[local1383] = arg1.aShortArray59[local1389];
		}
		if (this.anInt7094 > 0) {
			local1389 = 1;
			local1083 = this.aShortArray83[0];
			for (local1094 = 0; local1094 < this.anInt7094; local1094++) {
				@Pc(2933) short local2933 = this.aShortArray83[local1094];
				if (local1083 != local2933) {
					local1083 = local2933;
					local1389++;
				}
			}
			this.anIntArray418 = new int[local1389 + 1];
			this.anIntArray416 = new int[local1389];
			this.anIntArray415 = new int[local1389];
			this.anIntArray418[0] = 0;
			local1105 = this.anInt7105;
			local1083 = this.aShortArray83[0];
			@Pc(2977) short local2977 = 0;
			local1389 = 0;
			for (local726 = 0; local726 < this.anInt7094; local726++) {
				@Pc(2988) short local2988 = this.aShortArray83[local726];
				if (local1083 != local2988) {
					this.anIntArray416[local1389] = local1105;
					this.anIntArray415[local1389] = local2977 + 1 - local1105;
					local1389++;
					this.anIntArray418[local1389] = local726;
					local1105 = this.anInt7105;
					local1083 = local2988;
					local2977 = 0;
				}
				@Pc(3024) short local3024 = this.aShortArray80[local726];
				if (local1105 > local3024) {
					local1105 = local3024;
				}
				if (local2977 < local3024) {
					local2977 = local3024;
				}
				local3024 = this.aShortArray84[local726];
				if (local3024 < local1105) {
					local1105 = local3024;
				}
				if (local3024 > local2977) {
					local2977 = local3024;
				}
				local3024 = this.aShortArray76[local726];
				if (local3024 > local2977) {
					local2977 = local3024;
				}
				if (local3024 < local1105) {
					local1105 = local3024;
				}
			}
			this.anIntArray416[local1389] = local1105;
			this.anIntArray415[local1389] = local2977 + 1 - local1105;
			local1389++;
			this.anIntArray418[local1389] = this.anInt7094;
		}
		Static170.aLongArray5 = null;
		this.aShortArray78 = Static354.method5273(this.anInt7105, this.aShortArray78);
		this.aShortArray81 = Static354.method5273(this.anInt7105, this.aShortArray81);
		this.aShortArray82 = Static354.method5273(this.anInt7105, this.aShortArray82);
		this.aShortArray85 = Static354.method5273(this.anInt7105, this.aShortArray85);
		this.aShortArray79 = Static354.method5273(this.anInt7105, this.aShortArray79);
		this.aByteArray70 = Static104.method1486(this.anInt7105, this.aByteArray70);
		this.aFloatArray61 = Static482.method6677(this.aFloatArray61, this.anInt7105);
		this.aFloatArray60 = Static482.method6677(this.aFloatArray60, this.anInt7105);
		if (arg1.anIntArray367 != null && Static328.method4856(arg2, this.anInt7062)) {
			this.anIntArrayArray40 = arg1.method5070(false);
		}
		if (arg1.aClass362Array1 != null && Static314.method4674(arg2, this.anInt7062)) {
			this.anIntArrayArray39 = arg1.method5076();
		}
		if (arg1.anIntArray370 != null && Static137.method2396(arg2, this.anInt7062)) {
			local1389 = 0;
			local673 = new int[256];
			for (local1094 = 0; local1094 < this.anInt7097; local1094++) {
				local1105 = arg1.anIntArray370[local22[local1094]];
				if (local1105 >= 0) {
					@Pc(3225) int local3225 = local673[local1105]++;
					if (local1105 > local1389) {
						local1389 = local1105;
					}
				}
			}
			this.anIntArrayArray38 = new int[local1389 + 1][];
			for (local1105 = 0; local1105 <= local1389; local1105++) {
				this.anIntArrayArray38[local1105] = new int[local673[local1105]];
				local673[local1105] = 0;
			}
			for (local681 = 0; local681 < this.anInt7097; local681++) {
				local726 = arg1.anIntArray370[local22[local681]];
				if (local726 >= 0) {
					this.anIntArrayArray38[local726][local673[local726]++] = local681;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!nv;IIZZ)V")
	public Class52_Sub2(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7059 = 0;
		this.anInt7073 = 0;
		this.anInt7097 = 0;
		this.anInt7094 = 0;
		this.aBoolean541 = true;
		this.aBoolean542 = false;
		this.aBoolean543 = false;
		this.anInt7105 = 0;
		this.aBoolean540 = false;
		this.aBoolean540 = arg4;
		this.aClass78_Sub1_14 = arg0;
		this.anInt7062 = arg2;
		this.anInt7057 = arg1;
		if (arg3 || Static351.method5244(this.anInt7057, this.anInt7062)) {
			this.aClass47_4 = new Class47(Static48.method6683(this.anInt7062, this.anInt7057));
		}
		if (arg3 || Static64.method1033(this.anInt7057, this.anInt7062)) {
			this.aClass47_3 = new Class47(Static177.method7120(this.anInt7062, this.anInt7057));
		}
		if (arg3 || Static82.method1352(this.anInt7062, this.anInt7057)) {
			this.aClass47_1 = new Class47(Static391.method5620(this.anInt7062, this.anInt7057));
		}
		if (arg3 || Static333.method4913(this.anInt7062, this.anInt7057)) {
			this.aClass47_2 = new Class47(Static110.method1522(this.anInt7057, this.anInt7062));
		}
		if (arg3 || Static105.method6466(this.anInt7062, this.anInt7057)) {
			this.aClass190_1 = new Class190(Static145.method2449(this.anInt7062, this.anInt7057));
		}
	}

	@OriginalMember(owner = "client!pea", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean543) {
			this.method5710();
		}
		return this.anInt7072;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7414(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class52_Sub2 local8 = (Class52_Sub2) arg0;
		if (this.anInt7097 == 0 || local8.anInt7097 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7073;
		@Pc(24) int[] local24 = local8.anIntArray419;
		@Pc(27) int[] local27 = local8.anIntArray414;
		@Pc(30) int[] local30 = local8.anIntArray417;
		@Pc(33) short[] local33 = local8.aShortArray82;
		@Pc(36) short[] local36 = local8.aShortArray85;
		@Pc(39) short[] local39 = local8.aShortArray79;
		@Pc(42) byte[] local42 = local8.aByteArray70;
		@Pc(53) short[] local53;
		@Pc(57) short[] local57;
		@Pc(61) short[] local61;
		@Pc(49) byte[] local49;
		if (this.aClass344_1 == null) {
			local53 = null;
			local49 = null;
			local61 = null;
			local57 = null;
		} else {
			local49 = this.aClass344_1.aByteArray92;
			local53 = this.aClass344_1.aShortArray134;
			local57 = this.aClass344_1.aShortArray135;
			local61 = this.aClass344_1.aShortArray133;
		}
		@Pc(90) short[] local90;
		@Pc(86) short[] local86;
		@Pc(82) short[] local82;
		@Pc(78) byte[] local78;
		if (local8.aClass344_1 == null) {
			local82 = null;
			local78 = null;
			local86 = null;
			local90 = null;
		} else {
			local78 = local8.aClass344_1.aByteArray92;
			local82 = local8.aClass344_1.aShortArray133;
			local86 = local8.aClass344_1.aShortArray135;
			local90 = local8.aClass344_1.aShortArray134;
		}
		@Pc(103) int[] local103 = local8.anIntArray413;
		@Pc(106) short[] local106 = local8.aShortArray87;
		if (!local8.aBoolean543) {
			local8.method5710();
		}
		@Pc(115) int local115 = local8.anInt7074;
		@Pc(118) int local118 = local8.anInt7035;
		@Pc(121) int local121 = local8.anInt7092;
		@Pc(124) int local124 = local8.anInt7072;
		@Pc(127) int local127 = local8.anInt7040;
		@Pc(130) int local130 = local8.anInt7111;
		for (@Pc(132) int local132 = 0; local132 < this.anInt7073; local132++) {
			@Pc(142) int local142 = this.anIntArray414[local132] - arg2;
			if (local142 >= local115 && local142 <= local118) {
				@Pc(162) int local162 = this.anIntArray419[local132] - arg1;
				if (local162 >= local121 && local162 <= local124) {
					@Pc(181) int local181 = this.anIntArray417[local132] - arg3;
					if (local181 >= local127 && local130 >= local181) {
						@Pc(195) int local195 = -1;
						@Pc(200) int local200 = this.anIntArray413[local132];
						@Pc(207) int local207 = this.anIntArray413[local132 + 1];
						for (@Pc(209) int local209 = local200; local209 < local207; local209++) {
							local195 = this.aShortArray87[local209] - 1;
							if (local195 == -1 || this.aByteArray70[local195] != 0) {
								break;
							}
						}
						if (local195 != -1) {
							for (@Pc(242) int local242 = 0; local242 < local21; local242++) {
								if (local24[local242] == local162 && local181 == local30[local242] && local27[local242] == local142) {
									@Pc(273) int local273 = -1;
									local207 = local103[local242 + 1];
									local200 = local103[local242];
									for (@Pc(285) int local285 = local200; local285 < local207; local285++) {
										local273 = local106[local285] - 1;
										if (local273 == -1 || local42[local273] != 0) {
											break;
										}
									}
									if (local273 != -1) {
										if (local53 == null) {
											this.aClass344_1 = new Class344();
											local53 = this.aClass344_1.aShortArray134 = Static58.method974(this.aShortArray82);
											local57 = this.aClass344_1.aShortArray135 = Static58.method974(this.aShortArray85);
											local61 = this.aClass344_1.aShortArray133 = Static58.method974(this.aShortArray79);
											local49 = this.aClass344_1.aByteArray92 = Static477.method6641(this.aByteArray70);
										}
										if (local90 == null) {
											@Pc(369) Class344 local369 = local8.aClass344_1 = new Class344();
											local90 = local369.aShortArray134 = Static58.method974(local33);
											local86 = local369.aShortArray135 = Static58.method974(local36);
											local82 = local369.aShortArray133 = Static58.method974(local39);
											local78 = local369.aByteArray92 = Static477.method6641(local42);
										}
										@Pc(402) short local402 = this.aShortArray82[local195];
										@Pc(407) short local407 = this.aShortArray85[local195];
										@Pc(412) short local412 = this.aShortArray79[local195];
										local207 = local103[local242 + 1];
										local200 = local103[local242];
										@Pc(427) byte local427 = this.aByteArray70[local195];
										@Pc(437) int local437;
										for (@Pc(429) int local429 = local200; local429 < local207; local429++) {
											local437 = local106[local429] - 1;
											if (local437 == -1) {
												break;
											}
											if (local78[local437] != 0) {
												local90[local437] += local402;
												local86[local437] += local407;
												local82[local437] += local412;
												local78[local437] += local427;
											}
										}
										local200 = this.anIntArray413[local132];
										local207 = this.anIntArray413[local132 + 1];
										local427 = local42[local273];
										local407 = local36[local273];
										local412 = local39[local273];
										local402 = local33[local273];
										for (local437 = local200; local437 < local207; local437++) {
											@Pc(522) int local522 = this.aShortArray87[local437] - 1;
											if (local522 == -1) {
												break;
											}
											if (local49[local522] != 0) {
												local53[local522] += local402;
												local57[local522] += local407;
												local61[local522] += local412;
												local49[local522] += local427;
											}
										}
										local8.method5711();
										this.method5711();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7073; local7++) {
			if (arg0 != 128) {
				this.anIntArray419[local7] = arg0 * this.anIntArray419[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray414[local7] = arg1 * this.anIntArray414[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray417[local7] = this.anIntArray417[local7] * arg2 >> 7;
			}
		}
		this.method5708();
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZZLclient!pea;ILclient!pea;)Lclient!da;")
	private Class52 method5696(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class52_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class52_Sub2 arg4) {
		arg4.aShort79 = this.aShort79;
		arg4.anInt7097 = this.anInt7097;
		arg4.anInt7057 = arg3;
		arg4.aShort80 = this.aShort80;
		arg4.anInt7059 = this.anInt7059;
		arg4.anInt7094 = this.anInt7094;
		arg4.anInt7105 = this.anInt7105;
		if ((arg3 & 0x100) == 0) {
			arg4.aBoolean542 = this.aBoolean542;
		} else {
			arg4.aBoolean542 = true;
		}
		arg4.anInt7062 = this.anInt7062;
		arg4.anInt7051 = this.anInt7051;
		arg4.anInt7073 = this.anInt7073;
		@Pc(65) boolean local65 = Static594.method7982(arg3, this.anInt7062);
		@Pc(71) boolean local71 = Static349.method5204(arg3, this.anInt7062);
		@Pc(77) boolean local77 = Static508.method7110(arg3, this.anInt7062);
		@Pc(83) boolean local83 = local71 | local65 | local77;
		@Pc(194) int local194;
		if (local83) {
			if (!local65) {
				arg4.anIntArray419 = this.anIntArray419;
			} else if (arg2.anIntArray419 == null || this.anInt7059 > arg2.anIntArray419.length) {
				arg4.anIntArray419 = arg2.anIntArray419 = new int[this.anInt7059];
			} else {
				arg4.anIntArray419 = arg2.anIntArray419;
			}
			if (!local71) {
				arg4.anIntArray414 = this.anIntArray414;
			} else if (arg2.anIntArray414 == null || this.anInt7059 > arg2.anIntArray414.length) {
				arg4.anIntArray414 = arg2.anIntArray414 = new int[this.anInt7059];
			} else {
				arg4.anIntArray414 = arg2.anIntArray414;
			}
			if (!local77) {
				arg4.anIntArray417 = this.anIntArray417;
			} else if (arg2.anIntArray417 == null || this.anInt7059 > arg2.anIntArray417.length) {
				arg4.anIntArray417 = arg2.anIntArray417 = new int[this.anInt7059];
			} else {
				arg4.anIntArray417 = arg2.anIntArray417;
			}
			for (local194 = 0; local194 < this.anInt7059; local194++) {
				if (local65) {
					arg4.anIntArray419[local194] = this.anIntArray419[local194];
				}
				if (local71) {
					arg4.anIntArray414[local194] = this.anIntArray414[local194];
				}
				if (local77) {
					arg4.anIntArray417[local194] = this.anIntArray417[local194];
				}
			}
		} else {
			arg4.anIntArray419 = this.anIntArray419;
			arg4.anIntArray417 = this.anIntArray417;
			arg4.anIntArray414 = this.anIntArray414;
		}
		if (Static48.method6683(this.anInt7062, arg3)) {
			arg4.aClass47_4 = arg2.aClass47_4;
			arg4.aClass47_4.anInterface23_2 = this.aClass47_4.anInterface23_2;
			arg4.aClass47_4.aBoolean86 = this.aClass47_4.aBoolean86;
			arg4.aClass47_4.aBoolean85 = true;
		} else if (Static351.method5244(arg3, this.anInt7062)) {
			arg4.aClass47_4 = this.aClass47_4;
		} else {
			arg4.aClass47_4 = null;
		}
		if (Static146.method2463(arg3, this.anInt7062)) {
			if (arg2.aShortArray88 == null || arg2.aShortArray88.length < this.anInt7097) {
				arg4.aShortArray88 = arg2.aShortArray88 = new short[this.anInt7097];
			} else {
				arg4.aShortArray88 = arg2.aShortArray88;
			}
			for (local194 = 0; local194 < this.anInt7097; local194++) {
				arg4.aShortArray88[local194] = this.aShortArray88[local194];
			}
		} else {
			arg4.aShortArray88 = this.aShortArray88;
		}
		if (Static433.method3811(arg3, this.anInt7062)) {
			if (arg2.aByteArray69 == null || this.anInt7097 > arg2.aByteArray69.length) {
				arg4.aByteArray69 = arg2.aByteArray69 = new byte[this.anInt7097];
			} else {
				arg4.aByteArray69 = arg2.aByteArray69;
			}
			for (local194 = 0; local194 < this.anInt7097; local194++) {
				arg4.aByteArray69[local194] = this.aByteArray69[local194];
			}
		} else {
			arg4.aByteArray69 = this.aByteArray69;
		}
		if (Static391.method5620(this.anInt7062, arg3)) {
			arg4.aClass47_1 = arg2.aClass47_1;
			arg4.aClass47_1.anInterface23_2 = this.aClass47_1.anInterface23_2;
			arg4.aClass47_1.aBoolean86 = this.aClass47_1.aBoolean86;
			arg4.aClass47_1.aBoolean85 = true;
		} else if (Static82.method1352(this.anInt7062, arg3)) {
			arg4.aClass47_1 = this.aClass47_1;
		} else {
			arg4.aClass47_1 = null;
		}
		@Pc(583) int local583;
		if (Static185.method3006(arg3, this.anInt7062)) {
			if (arg2.aShortArray82 == null || arg2.aShortArray82.length < this.anInt7105) {
				local194 = this.anInt7105;
				arg4.aShortArray85 = arg2.aShortArray85 = new short[local194];
				arg4.aShortArray79 = arg2.aShortArray79 = new short[local194];
				arg4.aShortArray82 = arg2.aShortArray82 = new short[local194];
			} else {
				arg4.aShortArray82 = arg2.aShortArray82;
				arg4.aShortArray85 = arg2.aShortArray85;
				arg4.aShortArray79 = arg2.aShortArray79;
			}
			if (this.aClass344_1 == null) {
				arg4.aClass344_1 = null;
				for (local194 = 0; local194 < this.anInt7105; local194++) {
					arg4.aShortArray82[local194] = this.aShortArray82[local194];
					arg4.aShortArray85[local194] = this.aShortArray85[local194];
					arg4.aShortArray79[local194] = this.aShortArray79[local194];
				}
			} else {
				if (arg2.aClass344_1 == null) {
					arg2.aClass344_1 = new Class344();
				}
				@Pc(571) Class344 local571 = arg4.aClass344_1 = arg2.aClass344_1;
				if (local571.aShortArray134 == null || this.anInt7105 > local571.aShortArray134.length) {
					local583 = this.anInt7105;
					local571.aByteArray92 = new byte[local583];
					local571.aShortArray134 = new short[local583];
					local571.aShortArray135 = new short[local583];
					local571.aShortArray133 = new short[local583];
				}
				for (local583 = 0; local583 < this.anInt7105; local583++) {
					arg4.aShortArray82[local583] = this.aShortArray82[local583];
					arg4.aShortArray85[local583] = this.aShortArray85[local583];
					arg4.aShortArray79[local583] = this.aShortArray79[local583];
					local571.aShortArray134[local583] = this.aClass344_1.aShortArray134[local583];
					local571.aShortArray135[local583] = this.aClass344_1.aShortArray135[local583];
					local571.aShortArray133[local583] = this.aClass344_1.aShortArray133[local583];
					local571.aByteArray92[local583] = this.aClass344_1.aByteArray92[local583];
				}
			}
			arg4.aByteArray70 = this.aByteArray70;
		} else {
			arg4.aShortArray79 = this.aShortArray79;
			arg4.aClass344_1 = this.aClass344_1;
			arg4.aByteArray70 = this.aByteArray70;
			arg4.aShortArray82 = this.aShortArray82;
			arg4.aShortArray85 = this.aShortArray85;
		}
		if (Static110.method1522(arg3, this.anInt7062)) {
			arg4.aClass47_2 = arg2.aClass47_2;
			arg4.aClass47_2.aBoolean86 = this.aClass47_2.aBoolean86;
			arg4.aClass47_2.aBoolean85 = true;
			arg4.aClass47_2.anInterface23_2 = this.aClass47_2.anInterface23_2;
		} else if (Static333.method4913(this.anInt7062, arg3)) {
			arg4.aClass47_2 = this.aClass47_2;
		} else {
			arg4.aClass47_2 = null;
		}
		if (Static346.method5151(this.anInt7062, arg3)) {
			if (arg2.aFloatArray61 == null || arg2.aFloatArray61.length < this.anInt7097) {
				local194 = this.anInt7105;
				arg4.aFloatArray60 = arg2.aFloatArray60 = new float[local194];
				arg4.aFloatArray61 = arg2.aFloatArray61 = new float[local194];
			} else {
				arg4.aFloatArray61 = arg2.aFloatArray61;
				arg4.aFloatArray60 = arg2.aFloatArray60;
			}
			for (local194 = 0; local194 < this.anInt7105; local194++) {
				arg4.aFloatArray61[local194] = this.aFloatArray61[local194];
				arg4.aFloatArray60[local194] = this.aFloatArray60[local194];
			}
		} else {
			arg4.aFloatArray60 = this.aFloatArray60;
			arg4.aFloatArray61 = this.aFloatArray61;
		}
		if (Static177.method7120(this.anInt7062, arg3)) {
			arg4.aClass47_3 = arg2.aClass47_3;
			arg4.aClass47_3.anInterface23_2 = this.aClass47_3.anInterface23_2;
			arg4.aClass47_3.aBoolean85 = true;
			arg4.aClass47_3.aBoolean86 = this.aClass47_3.aBoolean86;
		} else if (Static64.method1033(arg3, this.anInt7062)) {
			arg4.aClass47_3 = this.aClass47_3;
		} else {
			arg4.aClass47_3 = null;
		}
		if (Static10.method241(this.anInt7062, arg3)) {
			if (arg2.aShortArray80 == null || arg2.aShortArray80.length < this.anInt7097) {
				local194 = this.anInt7097;
				arg4.aShortArray76 = arg2.aShortArray76 = new short[local194];
				arg4.aShortArray84 = arg2.aShortArray84 = new short[local194];
				arg4.aShortArray80 = arg2.aShortArray80 = new short[local194];
			} else {
				arg4.aShortArray84 = arg2.aShortArray84;
				arg4.aShortArray80 = arg2.aShortArray80;
				arg4.aShortArray76 = arg2.aShortArray76;
			}
			for (local194 = 0; local194 < this.anInt7097; local194++) {
				arg4.aShortArray80[local194] = this.aShortArray80[local194];
				arg4.aShortArray84[local194] = this.aShortArray84[local194];
				arg4.aShortArray76[local194] = this.aShortArray76[local194];
			}
		} else {
			arg4.aShortArray76 = this.aShortArray76;
			arg4.aShortArray80 = this.aShortArray80;
			arg4.aShortArray84 = this.aShortArray84;
		}
		if (Static145.method2449(this.anInt7062, arg3)) {
			arg4.aClass190_1 = arg2.aClass190_1;
			arg4.aClass190_1.aBoolean371 = this.aClass190_1.aBoolean371;
			arg4.aClass190_1.aBoolean370 = true;
			arg4.aClass190_1.anInterface13_4 = this.aClass190_1.anInterface13_4;
		} else if (Static105.method6466(this.anInt7062, arg3)) {
			arg4.aClass190_1 = this.aClass190_1;
		} else {
			arg4.aClass190_1 = null;
		}
		if (Static442.method6236(arg3, this.anInt7062)) {
			if (arg2.aShortArray83 == null || this.anInt7097 > arg2.aShortArray83.length) {
				local194 = this.anInt7097;
				arg4.aShortArray83 = arg2.aShortArray83 = new short[local194];
			} else {
				arg4.aShortArray83 = arg2.aShortArray83;
			}
			for (local194 = 0; local194 < this.anInt7097; local194++) {
				arg4.aShortArray83[local194] = this.aShortArray83[local194];
			}
		} else {
			arg4.aShortArray83 = this.aShortArray83;
		}
		if (!Static371.method5424(this.anInt7062, arg3)) {
			arg4.aClass201Array1 = this.aClass201Array1;
		} else if (arg2.aClass201Array1 == null || arg2.aClass201Array1.length < this.anInt7051) {
			local194 = this.anInt7051;
			arg4.aClass201Array1 = arg2.aClass201Array1 = new Class201[local194];
			for (local583 = 0; local583 < this.anInt7051; local583++) {
				arg4.aClass201Array1[local583] = this.aClass201Array1[local583].method4343();
			}
		} else {
			arg4.aClass201Array1 = arg2.aClass201Array1;
			for (local194 = 0; local194 < this.anInt7051; local194++) {
				arg4.aClass201Array1[local194].method4341(this.aClass201Array1[local194]);
			}
		}
		arg4.aShortArray81 = this.aShortArray81;
		arg4.aClass95Array1 = this.aClass95Array1;
		arg4.aShortArray78 = this.aShortArray78;
		arg4.anIntArray413 = this.anIntArray413;
		arg4.anIntArray418 = this.anIntArray418;
		arg4.anIntArray415 = this.anIntArray415;
		arg4.anIntArray416 = this.anIntArray416;
		arg4.anIntArrayArray39 = this.anIntArrayArray39;
		arg4.aShortArray77 = this.aShortArray77;
		arg4.anIntArrayArray40 = this.anIntArrayArray40;
		arg4.aClass244Array3 = this.aClass244Array3;
		arg4.anIntArrayArray38 = this.anIntArrayArray38;
		if (this.aBoolean543) {
			arg4.anInt7040 = this.anInt7040;
			arg4.anInt7072 = this.anInt7072;
			arg4.anInt7074 = this.anInt7074;
			arg4.anInt7080 = this.anInt7080;
			arg4.anInt7092 = this.anInt7092;
			arg4.anInt7035 = this.anInt7035;
			arg4.anInt7063 = this.anInt7063;
			arg4.aBoolean543 = true;
			arg4.anInt7111 = this.anInt7111;
		} else {
			arg4.aBoolean543 = false;
		}
		arg4.aClass212Array3 = this.aClass212Array3;
		arg4.aShortArray87 = this.aShortArray87;
		arg4.aShortArray86 = this.aShortArray86;
		return arg4;
	}

	@OriginalMember(owner = "client!pea", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean543) {
			this.method5710();
		}
		@Pc(16) int local16 = this.anInt7092 + arg4;
		@Pc(21) int local21 = this.anInt7072 + arg4;
		@Pc(26) int local26 = this.anInt7040 + arg6;
		@Pc(31) int local31 = this.anInt7111 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8065 <= arg2.anInt8060 + local21 >> arg2.anInt8066 || local26 < 0 || arg2.anInt8058 <= local31 + arg2.anInt8060 >> arg2.anInt8066)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt8060 >> arg3.anInt8066 >= arg3.anInt8065 || local26 < 0 || arg3.anInt8058 <= arg3.anInt8060 + local31 >> arg3.anInt8066) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8066;
			local21 = arg2.anInt8060 + local21 - 1 >> arg2.anInt8066;
			local26 >>= arg2.anInt8066;
			local31 = arg2.anInt8060 + local31 - 1 >> arg2.anInt8066;
			if (arg5 == arg2.method6481(local26, local16) && arg2.method6481(local26, local21) == arg5 && arg2.method6481(local31, local16) == arg5 && arg2.method6481(local31, local21) == arg5) {
				return;
			}
		}
		@Pc(197) int local197;
		if (arg0 == 1) {
			for (local197 = 0; local197 < this.anInt7073; local197++) {
				this.anIntArray414[local197] = this.anIntArray414[local197] + arg2.method6480(this.anIntArray417[local197] - -arg6, this.anIntArray419[local197] - -arg4) - arg5;
			}
		} else {
			@Pc(256) int local256;
			@Pc(267) int local267;
			if (arg0 == 2) {
				local197 = this.anInt7074;
				if (local197 == 0) {
					return;
				}
				for (local256 = 0; local256 < this.anInt7073; local256++) {
					local267 = (this.anIntArray414[local256] << 16) / local197;
					if (local267 < arg1) {
						this.anIntArray414[local256] -= -((arg1 - local267) * (arg2.method6480(this.anIntArray417[local256] + arg6, this.anIntArray419[local256] + arg4) + -arg5) / arg1);
					}
				}
			} else {
				@Pc(351) int local351;
				if (arg0 == 3) {
					local197 = (arg1 & 0xFF) * 4;
					local256 = (arg1 >> 8 & 0xFF) * 4;
					local267 = (arg1 >> 16 & 0xFF) << 6;
					local351 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local197 >> 1) < 0 || arg2.anInt8065 << arg2.anInt8066 <= arg4 + (local197 >> 1) + arg2.anInt8060 || arg6 - (local256 >> 1) < 0 || arg2.anInt8058 << arg2.anInt8066 <= arg6 + (local256 >> 1) + arg2.anInt8060) {
						return;
					}
					this.method7401(arg4, local256, local267, arg6, arg5, local197, local351, arg2);
				} else if (arg0 == 4) {
					local197 = this.anInt7035 - this.anInt7074;
					for (local256 = 0; local256 < this.anInt7073; local256++) {
						this.anIntArray414[local256] += arg3.method6480(arg6 + this.anIntArray417[local256], arg4 + this.anIntArray419[local256]) + local197 - arg5;
					}
				} else if (arg0 == 5) {
					local197 = this.anInt7035 - this.anInt7074;
					for (local256 = 0; local256 < this.anInt7073; local256++) {
						local267 = arg4 + this.anIntArray419[local256];
						local351 = arg6 + this.anIntArray417[local256];
						@Pc(466) int local466 = arg2.method6480(local351, local267);
						@Pc(472) int local472 = arg3.method6480(local351, local267);
						@Pc(480) int local480 = local466 - local472 - arg1;
						this.anIntArray414[local256] = ((this.anIntArray414[local256] << 8) / local197 * local480 >> 8) - (arg5 - local466);
					}
				}
			}
		}
		this.method5708();
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(Z)Z")
	private boolean method5697() {
		if (this.aClass190_1.aBoolean371) {
			return true;
		}
		if (this.aClass190_1.anInterface13_3 == null) {
			this.aClass190_1.anInterface13_3 = this.aClass78_Sub1_14.method6980(this.aBoolean540);
		}
		@Pc(28) Interface13 local28 = this.aClass190_1.anInterface13_3;
		local28.method5600(this.anInt7094 * 6);
		@Pc(40) Buffer local40 = local28.method5603();
		if (local40 != null) {
			@Pc(48) Stream local48 = this.aClass78_Sub1_14.method6925(local40);
			@Pc(52) int local52;
			if (Stream.b()) {
				for (local52 = 0; local52 < this.anInt7094; local52++) {
					local48.b(this.aShortArray80[local52]);
					local48.b(this.aShortArray84[local52]);
					local48.b(this.aShortArray76[local52]);
				}
			} else {
				for (local52 = 0; local52 < this.anInt7094; local52++) {
					local48.c(this.aShortArray80[local52]);
					local48.c(this.aShortArray84[local52]);
					local48.c(this.aShortArray76[local52]);
				}
			}
			local48.a();
			if (local28.method5602()) {
				this.aClass190_1.anInterface13_4 = local28;
				this.aClass190_1.aBoolean371 = true;
				this.aBoolean541 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pea", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class85_Sub8.anIntArray426[arg0];
		@Pc(13) int local13 = Class85_Sub8.anIntArray427[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7073; local15++) {
			@Pc(34) int local34 = this.anIntArray414[local15] * local13 - this.anIntArray417[local15] * local9 >> 14;
			this.anIntArray417[local15] = local13 * this.anIntArray417[local15] + this.anIntArray414[local15] * local9 >> 14;
			this.anIntArray414[local15] = local34;
		}
		this.method5708();
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pea", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean543) {
			this.method5710();
		}
		return this.anInt7035;
	}

	@OriginalMember(owner = "client!pea", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort80 = (short) arg0;
		this.method5708();
		this.method5711();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZLclient!q;BII)Z")
	private boolean method5698(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) Class34_Sub1 local14 = (Class34_Sub1) arg2;
		@Pc(18) Class34_Sub1 local18 = this.aClass78_Sub1_14.aClass34_Sub1_16;
		@Pc(39) float local39 = local18.aFloat18 + local14.aFloat20 * local18.aFloat14 + local14.aFloat18 * local18.aFloat17 + local18.aFloat16 * local14.aFloat19;
		@Pc(60) float local60 = local14.aFloat20 * local18.aFloat23 + local14.aFloat18 * local18.aFloat21 + local18.aFloat15 * local14.aFloat19 + local18.aFloat19;
		@Pc(81) float local81 = local18.aFloat20 + local14.aFloat18 * local18.aFloat13 + local18.aFloat22 * local14.aFloat19 + local14.aFloat20 * local18.aFloat24;
		Static265.aFloat127 = local14.aFloat21 * local18.aFloat15 + local18.aFloat21 * local14.aFloat17 + local14.aFloat13 * local18.aFloat23;
		Static129.aFloat77 = local18.aFloat22 * local14.aFloat15 + local14.aFloat16 * local18.aFloat13 + local14.aFloat22 * local18.aFloat24;
		Static184.aFloat94 = local18.aFloat14 * local14.aFloat13 + local18.aFloat17 * local14.aFloat17 + local14.aFloat21 * local18.aFloat16;
		Static100.aFloat40 = local14.aFloat24 * local18.aFloat24 + local18.aFloat22 * local14.aFloat23 + local18.aFloat13 * local14.aFloat14;
		Static386.aFloat183 = local14.aFloat22 * local18.aFloat23 + local14.aFloat16 * local18.aFloat21 + local14.aFloat15 * local18.aFloat15;
		Static566.aFloat237 = local18.aFloat14 * local14.aFloat24 + local14.aFloat14 * local18.aFloat17 + local18.aFloat16 * local14.aFloat23;
		Static172.aFloat91 = local14.aFloat13 * local18.aFloat24 + local14.aFloat17 * local18.aFloat13 + local14.aFloat21 * local18.aFloat22;
		Static268.aFloat129 = local14.aFloat23 * local18.aFloat15 + local18.aFloat21 * local14.aFloat14 + local14.aFloat24 * local18.aFloat23;
		Static299.aFloat156 = local14.aFloat22 * local18.aFloat14 + local18.aFloat16 * local14.aFloat15 + local18.aFloat17 * local14.aFloat16;
		@Pc(245) boolean local245 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass78_Sub1_14.anInt8590;
		@Pc(261) int local261 = this.aClass78_Sub1_14.anInt8567;
		if (!this.aBoolean543) {
			this.method5710();
		}
		Static469.anIntArray512[0] = this.anInt7092;
		Static8.anIntArray356[0] = this.anInt7074;
		Static235.anIntArray223[0] = this.anInt7040;
		Static469.anIntArray512[1] = this.anInt7072;
		Static8.anIntArray356[1] = this.anInt7074;
		Static235.anIntArray223[1] = this.anInt7040;
		Static469.anIntArray512[2] = this.anInt7092;
		Static8.anIntArray356[2] = this.anInt7035;
		Static469.anIntArray512[3] = this.anInt7072;
		Static235.anIntArray223[2] = this.anInt7040;
		Static8.anIntArray356[3] = this.anInt7035;
		Static235.anIntArray223[3] = this.anInt7040;
		Static469.anIntArray512[4] = this.anInt7092;
		Static8.anIntArray356[4] = this.anInt7074;
		Static235.anIntArray223[4] = this.anInt7111;
		Static469.anIntArray512[5] = this.anInt7072;
		Static8.anIntArray356[5] = this.anInt7074;
		Static235.anIntArray223[5] = this.anInt7111;
		Static469.anIntArray512[6] = this.anInt7092;
		Static8.anIntArray356[6] = this.anInt7035;
		Static235.anIntArray223[6] = this.anInt7111;
		Static469.anIntArray512[7] = this.anInt7072;
		Static8.anIntArray356[7] = this.anInt7035;
		Static235.anIntArray223[7] = this.anInt7111;
		@Pc(434) float local434;
		@Pc(420) float local420;
		@Pc(448) float local448;
		@Pc(406) float local406;
		@Pc(401) float local401;
		@Pc(396) float local396;
		for (@Pc(389) int local389 = 0; local389 < 8; local389++) {
			local396 = Static235.anIntArray223[local389];
			local401 = Static8.anIntArray356[local389];
			local406 = Static469.anIntArray512[local389];
			local420 = local60 + local406 * Static265.aFloat127 + local401 * Static386.aFloat183 + local396 * Static268.aFloat129;
			local434 = Static566.aFloat237 * local396 + local406 * Static184.aFloat94 + Static299.aFloat156 * local401 + local39;
			local448 = local81 + local396 * Static100.aFloat40 + local406 * Static172.aFloat91 + Static129.aFloat77 * local401;
			if (local448 >= (float) this.aClass78_Sub1_14.anInt8591) {
				if (arg4 > 0) {
					local448 = arg4;
				}
				@Pc(472) float local472 = local434 * (float) local257 / local448 + (float) this.aClass78_Sub1_14.anInt8589;
				@Pc(484) float local484 = (float) local261 * local420 / local448 + (float) this.aClass78_Sub1_14.anInt8588;
				if (local247 > local472) {
					local247 = local472;
				}
				if (local472 > local249) {
					local249 = local472;
				}
				if (local484 > local253) {
					local253 = local484;
				}
				if (local251 > local484) {
					local251 = local484;
				}
				local245 = true;
			}
		}
		if (local245 && (float) arg3 > local247 && (float) arg3 < local249 && local251 < (float) arg0 && local253 > (float) arg0) {
			if (arg1) {
				return true;
			}
			if (this.anInt7105 > Static76.anIntArray381.length) {
				Static76.anIntArray381 = new int[this.anInt7105];
				Static159.anIntArray139 = new int[this.anInt7105];
			}
			@Pc(642) int local642;
			for (@Pc(555) int local555 = 0; local555 < this.anInt7073; local555++) {
				local401 = this.anIntArray414[local555];
				local396 = this.anIntArray417[local555];
				local406 = this.anIntArray419[local555];
				local420 = local60 + Static268.aFloat129 * local396 + local406 * Static265.aFloat127 + Static386.aFloat183 * local401;
				local448 = Static100.aFloat40 * local396 + Static172.aFloat91 * local406 + local401 * Static129.aFloat77 + local81;
				local434 = local39 + Static184.aFloat94 * local406 + Static299.aFloat156 * local401 + local396 * Static566.aFloat237;
				@Pc(655) int local655;
				@Pc(660) int local660;
				@Pc(667) int local667;
				if (local448 >= (float) this.aClass78_Sub1_14.anInt8591) {
					if (arg4 > 0) {
						local448 = arg4;
					}
					local642 = (int) ((float) this.aClass78_Sub1_14.anInt8589 + (float) local257 * local434 / local448);
					local655 = (int) ((float) this.aClass78_Sub1_14.anInt8588 + (float) local261 * local420 / local448);
					local660 = this.anIntArray413[local555];
					local667 = this.anIntArray413[local555 + 1];
					for (@Pc(669) int local669 = local660; local669 < local667; local669++) {
						@Pc(678) int local678 = this.aShortArray87[local669] - 1;
						if (local678 == -1) {
							break;
						}
						Static76.anIntArray381[local678] = local642;
						Static159.anIntArray139[local678] = local655;
					}
				} else {
					local642 = this.anIntArray413[local555];
					local655 = this.anIntArray413[local555 + 1];
					for (local660 = local642; local660 < local655; local660++) {
						local667 = this.aShortArray87[local660] - 1;
						if (local667 == -1) {
							break;
						}
						Static76.anIntArray381[this.aShortArray87[local660] - 1] = -999999;
					}
				}
			}
			for (local642 = 0; local642 < this.anInt7097; local642++) {
				if (Static76.anIntArray381[this.aShortArray80[local642]] != -999999 && Static76.anIntArray381[this.aShortArray84[local642]] != -999999 && Static76.anIntArray381[this.aShortArray76[local642]] != -999999 && this.method5707(arg3, Static76.anIntArray381[this.aShortArray76[local642]], arg0, Static159.anIntArray139[this.aShortArray80[local642]], Static76.anIntArray381[this.aShortArray80[local642]], Static159.anIntArray139[this.aShortArray76[local642]], Static76.anIntArray381[this.aShortArray84[local642]], Static159.anIntArray139[this.aShortArray84[local642]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V")
	private void method5699() {
		if (this.anInt7094 == 0) {
			return;
		}
		if (this.method5713() && this.method5697()) {
			this.aClass78_Sub1_14.method6965(this.aClass47_4.anInterface23_2, 0);
			this.aClass78_Sub1_14.method6965(this.aClass47_1.anInterface23_2, 1);
			this.aClass78_Sub1_14.method6965(this.aClass47_3.anInterface23_2, 2);
			@Pc(57) boolean local57;
			if ((this.anInt7062 & 0x37) == 0) {
				local57 = false;
				this.aClass78_Sub1_14.method6949(false);
				this.aClass78_Sub1_14.method6941(this.aClass78_Sub1_14.aClass185_17);
			} else {
				this.aClass78_Sub1_14.method6949(true);
				local57 = true;
				this.aClass78_Sub1_14.method6965(this.aClass47_2.anInterface23_2, 3);
				this.aClass78_Sub1_14.method6941(this.aClass78_Sub1_14.aClass185_20);
			}
			for (@Pc(97) int local97 = 0; local97 < this.anIntArray416.length; local97++) {
				@Pc(104) int local104 = this.anIntArray418[local97];
				@Pc(111) int local111 = this.anIntArray418[local97 + 1];
				@Pc(118) int local118 = this.aShortArray83[local104] & 0xFFFF;
				if (local118 == 65535) {
					local118 = -1;
				}
				this.aClass78_Sub1_14.method6948(local57, true, local118);
				this.aClass78_Sub1_14.method6947(Static302.aClass77_5, this.anIntArray415[local97], this.anIntArray416[local97], local111 - local104, local104 * 3, this.aClass190_1.anInterface13_4);
			}
		}
		this.method5702();
	}

	@OriginalMember(owner = "client!pea", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean543) {
			this.method5710();
		}
		return this.anInt7063;
	}

	@OriginalMember(owner = "client!pea", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub8_Sub4 S(@OriginalArg(0) Class1_Sub8_Sub4 arg0) {
		if (this.anInt7105 == 0) {
			return null;
		}
		if (!this.aBoolean543) {
			this.method5710();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass78_Sub1_14.anInt8574 > 0) {
			local40 = this.anInt7092 - (this.anInt7035 * this.aClass78_Sub1_14.anInt8574 >> 8) >> this.aClass78_Sub1_14.anInt8562;
			local57 = this.anInt7072 - (this.aClass78_Sub1_14.anInt8574 * this.anInt7074 >> 8) >> this.aClass78_Sub1_14.anInt8562;
		} else {
			local40 = this.anInt7092 - (this.aClass78_Sub1_14.anInt8574 * this.anInt7074 >> 8) >> this.aClass78_Sub1_14.anInt8562;
			local57 = this.anInt7072 - (this.aClass78_Sub1_14.anInt8574 * this.anInt7035 >> 8) >> this.aClass78_Sub1_14.anInt8562;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass78_Sub1_14.anInt8579 > 0) {
			local113 = this.anInt7040 - (this.aClass78_Sub1_14.anInt8579 * this.anInt7035 >> 8) >> this.aClass78_Sub1_14.anInt8562;
			local130 = this.anInt7111 - (this.anInt7074 * this.aClass78_Sub1_14.anInt8579 >> 8) >> this.aClass78_Sub1_14.anInt8562;
		} else {
			local113 = this.anInt7040 - (this.aClass78_Sub1_14.anInt8579 * this.anInt7074 >> 8) >> this.aClass78_Sub1_14.anInt8562;
			local130 = this.anInt7111 - (this.aClass78_Sub1_14.anInt8579 * this.anInt7035 >> 8) >> this.aClass78_Sub1_14.anInt8562;
		}
		@Pc(173) int local173 = local57 + 1 - local40;
		@Pc(180) int local180 = local130 + 1 - local113;
		@Pc(183) Class1_Sub8_Sub4_Sub2 local183 = (Class1_Sub8_Sub4_Sub2) arg0;
		@Pc(199) Class1_Sub8_Sub4_Sub2 local199;
		if (local183 != null && local183.method7718(local180, local173)) {
			local199 = local183;
			local183.method7723();
		} else {
			local199 = new Class1_Sub8_Sub4_Sub2(this.aClass78_Sub1_14, local173, local180);
		}
		local199.method7717(local113, local57, local130, local40);
		this.method5705(local199);
		return local199;
	}

	@OriginalMember(owner = "client!pea", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class85_Sub8.anIntArray426[arg0];
		@Pc(13) int local13 = Class85_Sub8.anIntArray427[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7073; local15++) {
			@Pc(33) int local33 = this.anIntArray419[local15] * local13 + local9 * this.anIntArray414[local15] >> 14;
			this.anIntArray414[local15] = local13 * this.anIntArray414[local15] - local9 * this.anIntArray419[local15] >> 14;
			this.anIntArray419[local15] = local33;
		}
		this.method5708();
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7391(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
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
			Static524.anInt1391 = 0;
			Static536.anInt8992 = 0;
			local31 = 0;
			Static173.anInt3245 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray40.length > local41) {
					local51 = this.anIntArrayArray40[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static173.anInt3245 += this.anIntArray419[local59];
						Static524.anInt1391 += this.anIntArray414[local59];
						local31++;
						Static536.anInt8992 += this.anIntArray417[local59];
					}
				}
			}
			if (local31 <= 0) {
				Static536.anInt8992 = local25;
				Static524.anInt1391 = local17;
				Static173.anInt3245 = local21;
			} else {
				Static173.anInt3245 = Static173.anInt3245 / local31 + local21;
				Static524.anInt1391 = local17 + Static524.anInt1391 / local31;
				Static536.anInt8992 = Static536.anInt8992 / local31 + local25;
			}
			return;
		}
		@Pc(166) int[] local166;
		@Pc(168) int local168;
		if (arg0 == 1) {
			local25 = arg4 << 4;
			local17 = arg3 << 4;
			local21 = arg2 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray40.length) {
					local166 = this.anIntArrayArray40[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local53 = local166[local168];
						this.anIntArray419[local53] += local21;
						this.anIntArray414[local53] += local17;
						this.anIntArray417[local53] += local25;
					}
				}
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(307) int local307;
		@Pc(763) int local763;
		@Pc(772) int local772;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray40.length > local35) {
					local166 = this.anIntArrayArray40[local35];
					if ((arg5 & 0x1) == 0) {
						for (local168 = 0; local168 < local166.length; local168++) {
							local53 = local166[local168];
							this.anIntArray419[local53] -= Static173.anInt3245;
							this.anIntArray414[local53] -= Static524.anInt1391;
							this.anIntArray417[local53] -= Static536.anInt8992;
							if (arg4 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg4];
								local288 = Class85_Sub8.anIntArray427[arg4];
								local307 = local288 * this.anIntArray419[local53] + this.anIntArray414[local53] * local59 + 16383 >> 14;
								this.anIntArray414[local53] = this.anIntArray414[local53] * local288 + 16383 - local59 * this.anIntArray419[local53] >> 14;
								this.anIntArray419[local53] = local307;
							}
							if (arg2 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg2];
								local288 = Class85_Sub8.anIntArray427[arg2];
								local307 = local288 * this.anIntArray414[local53] + 16383 - local59 * this.anIntArray417[local53] >> 14;
								this.anIntArray417[local53] = this.anIntArray414[local53] * local59 + local288 * this.anIntArray417[local53] + 16383 >> 14;
								this.anIntArray414[local53] = local307;
							}
							if (arg3 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg3];
								local288 = Class85_Sub8.anIntArray427[arg3];
								local307 = local59 * this.anIntArray417[local53] + this.anIntArray419[local53] * local288 + 16383 >> 14;
								this.anIntArray417[local53] = local288 * this.anIntArray417[local53] + 16383 - local59 * this.anIntArray419[local53] >> 14;
								this.anIntArray419[local53] = local307;
							}
							this.anIntArray419[local53] += Static173.anInt3245;
							this.anIntArray414[local53] += Static524.anInt1391;
							this.anIntArray417[local53] += Static536.anInt8992;
						}
					} else {
						for (local168 = 0; local168 < local166.length; local168++) {
							local53 = local166[local168];
							this.anIntArray419[local53] -= Static173.anInt3245;
							this.anIntArray414[local53] -= Static524.anInt1391;
							this.anIntArray417[local53] -= Static536.anInt8992;
							if (arg2 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg2];
								local288 = Class85_Sub8.anIntArray427[arg2];
								local307 = this.anIntArray414[local53] * local288 + 16383 - this.anIntArray417[local53] * local59 >> 14;
								this.anIntArray417[local53] = this.anIntArray417[local53] * local288 + local59 * this.anIntArray414[local53] + 16383 >> 14;
								this.anIntArray414[local53] = local307;
							}
							if (arg4 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg4];
								local288 = Class85_Sub8.anIntArray427[arg4];
								local307 = this.anIntArray419[local53] * local288 + this.anIntArray414[local53] * local59 + 16383 >> 14;
								this.anIntArray414[local53] = this.anIntArray414[local53] * local288 + 16383 - this.anIntArray419[local53] * local59 >> 14;
								this.anIntArray419[local53] = local307;
							}
							if (arg3 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg3];
								local288 = Class85_Sub8.anIntArray427[arg3];
								local307 = local288 * this.anIntArray419[local53] + this.anIntArray417[local53] * local59 + 16383 >> 14;
								this.anIntArray417[local53] = this.anIntArray417[local53] * local288 + 16383 - this.anIntArray419[local53] * local59 >> 14;
								this.anIntArray419[local53] = local307;
							}
							this.anIntArray419[local53] += Static173.anInt3245;
							this.anIntArray414[local53] += Static524.anInt1391;
							this.anIntArray417[local53] += Static536.anInt8992;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray40.length) {
						local51 = this.anIntArrayArray40[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local288 = this.anIntArray413[local59];
							local307 = this.anIntArray413[local59 + 1];
							for (local763 = local288; local763 < local307; local763++) {
								local772 = this.aShortArray87[local763] - 1;
								if (local772 == -1) {
									break;
								}
								@Pc(781) int local781;
								@Pc(785) int local785;
								@Pc(803) int local803;
								if (arg4 != 0) {
									local781 = Class85_Sub8.anIntArray426[arg4];
									local785 = Class85_Sub8.anIntArray427[arg4];
									local803 = this.aShortArray82[local772] * local785 + local781 * this.aShortArray85[local772] + 16383 >> 14;
									this.aShortArray85[local772] = (short) (this.aShortArray85[local772] * local785 + 16383 - local781 * this.aShortArray82[local772] >> 14);
									this.aShortArray82[local772] = (short) local803;
								}
								if (arg2 != 0) {
									local781 = Class85_Sub8.anIntArray426[arg2];
									local785 = Class85_Sub8.anIntArray427[arg2];
									local803 = this.aShortArray85[local772] * local785 + 16383 - this.aShortArray79[local772] * local781 >> 14;
									this.aShortArray79[local772] = (short) (local785 * this.aShortArray79[local772] + local781 * this.aShortArray85[local772] + 16383 >> 14);
									this.aShortArray85[local772] = (short) local803;
								}
								if (arg3 != 0) {
									local781 = Class85_Sub8.anIntArray426[arg3];
									local785 = Class85_Sub8.anIntArray427[arg3];
									local803 = local785 * this.aShortArray82[local772] + local781 * this.aShortArray79[local772] + 16383 >> 14;
									this.aShortArray79[local772] = (short) (local785 * this.aShortArray79[local772] + 16383 - this.aShortArray82[local772] * local781 >> 14);
									this.aShortArray82[local772] = (short) local803;
								}
							}
						}
					}
				}
				this.method5711();
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray40.length) {
					local166 = this.anIntArrayArray40[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local53 = local166[local168];
						this.anIntArray419[local53] -= Static173.anInt3245;
						this.anIntArray414[local53] -= Static524.anInt1391;
						this.anIntArray417[local53] -= Static536.anInt8992;
						this.anIntArray419[local53] = this.anIntArray419[local53] * arg2 >> 7;
						this.anIntArray414[local53] = this.anIntArray414[local53] * arg3 >> 7;
						this.anIntArray417[local53] = this.anIntArray417[local53] * arg4 >> 7;
						this.anIntArray419[local53] += Static173.anInt3245;
						this.anIntArray414[local53] += Static524.anInt1391;
						this.anIntArray417[local53] += Static536.anInt8992;
					}
				}
			}
		} else {
			@Pc(1198) Class201 local1198;
			@Pc(1106) boolean local1106;
			@Pc(1193) Class95 local1193;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					local1106 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray38.length > local41) {
							local51 = this.anIntArrayArray38[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local288 = (this.aByteArray69[local59] & 0xFF) + (arg2 * 8);
								if (local288 < 0) {
									local288 = 0;
								} else if (local288 > 255) {
									local288 = 255;
								}
								this.aByteArray69[local59] = (byte) local288;
							}
							local1106 |= local51.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass95Array1 != null) {
							for (local41 = 0; local41 < this.anInt7051; local41++) {
								local1193 = this.aClass95Array1[local41];
								local1198 = this.aClass201Array1[local41];
								local1198.anInt5270 = 255 - (this.aByteArray69[local1193.anInt2665] & 0xFF) << 24 | local1198.anInt5270 & 0xFFFFFF;
							}
						}
						this.method5709();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray38 != null) {
					local1106 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray38.length > local41) {
							local51 = this.anIntArrayArray38[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local288 = this.aShortArray88[local59] & 0xFFFF;
								local307 = local288 >> 10 & 0x3F;
								local763 = local288 >> 7 & 0x7;
								local763 += arg3 / 4;
								@Pc(1291) int local1291 = arg2 + local307 & 0x3F;
								local772 = local288 & 0x7F;
								local772 += arg4;
								if (local763 < 0) {
									local763 = 0;
								} else if (local763 > 7) {
									local763 = 7;
								}
								if (local772 < 0) {
									local772 = 0;
								} else if (local772 > 127) {
									local772 = 127;
								}
								this.aShortArray88[local59] = (short) (local763 << 7 | local1291 << 10 | local772);
							}
							local1106 |= local51.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass95Array1 != null) {
							for (local41 = 0; local41 < this.anInt7051; local41++) {
								local1193 = this.aClass95Array1[local41];
								local1198 = this.aClass201Array1[local41];
								local1198.anInt5270 = local1198.anInt5270 & 0xFF000000 | Static226.anIntArray212[this.aShortArray88[local1193.anInt2665] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method5709();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray39 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray39.length > local35) {
							local166 = this.anIntArrayArray39[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1198 = this.aClass201Array1[local166[local168]];
								local1198.anInt5268 += arg2;
								local1198.anInt5266 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray39 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray39.length) {
							local166 = this.anIntArrayArray39[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1198 = this.aClass201Array1[local166[local168]];
								local1198.anInt5272 = arg2 * local1198.anInt5272 >> 7;
								local1198.anInt5274 = arg3 * local1198.anInt5274 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray39.length) {
						local166 = this.anIntArrayArray39[local35];
						for (local168 = 0; local168 < local166.length; local168++) {
							local1198 = this.aClass201Array1[local166[local168]];
							local1198.anInt5267 = arg2 + local1198.anInt5267 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean543) {
			this.method5710();
		}
		return this.anInt7040;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIFIIJIILclient!nba;FI)S")
	private short method5701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class231 arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray413[arg1];
		@Pc(17) int local17 = this.anIntArray413[arg1 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray87[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg5 == Static170.aLongArray5[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray87[local19] = (short) (this.anInt7105 + 1);
		Static170.aLongArray5[local19] = arg5;
		this.aShortArray81[this.anInt7105] = (short) arg0;
		this.aShortArray78[this.anInt7105] = (short) arg1;
		this.aShortArray82[this.anInt7105] = (short) arg6;
		this.aShortArray85[this.anInt7105] = (short) arg3;
		this.aShortArray79[this.anInt7105] = (short) arg4;
		this.aByteArray70[this.anInt7105] = (byte) arg9;
		this.aFloatArray61[this.anInt7105] = arg2;
		this.aFloatArray60[this.anInt7105] = arg8;
		return (short) this.anInt7105++;
	}

	@OriginalMember(owner = "client!pea", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean543) {
			this.method5710();
		}
		return this.anInt7080;
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(Z)V")
	private void method5702() {
		if (!this.aBoolean541) {
			return;
		}
		this.aBoolean541 = false;
		if (this.aClass244Array3 == null && this.aClass212Array3 == null && this.aClass95Array1 == null) {
			if (this.anIntArray419 != null && !Static178.method2823(this.anInt7057, this.anInt7062)) {
				if (this.aClass47_4 == null || this.aClass47_4.method1165()) {
					if (!this.aBoolean543) {
						this.method5710();
					}
					this.anIntArray419 = null;
				} else {
					this.aBoolean541 = true;
				}
			}
			if (this.anIntArray414 != null && !Static528.method7272(this.anInt7057, this.anInt7062)) {
				if (this.aClass47_4 == null || this.aClass47_4.method1165()) {
					if (!this.aBoolean543) {
						this.method5710();
					}
					this.anIntArray414 = null;
				} else {
					this.aBoolean541 = true;
				}
			}
			if (this.anIntArray417 != null && !Static56.method958(this.anInt7062, this.anInt7057)) {
				if (this.aClass47_4 == null || this.aClass47_4.method1165()) {
					if (!this.aBoolean543) {
						this.method5710();
					}
					this.anIntArray417 = null;
				} else {
					this.aBoolean541 = true;
				}
			}
		}
		if (this.aShortArray87 != null && this.anIntArray419 == null && this.anIntArray414 == null && this.anIntArray417 == null) {
			this.aShortArray87 = null;
			this.anIntArray413 = null;
		}
		if (this.aByteArray70 != null && !Static82.method1355(this.anInt7062, this.anInt7057)) {
			label195: {
				label194: {
					@Pc(166) boolean local166;
					if ((this.anInt7062 & 0x37) == 0) {
						if (this.aClass47_1 == null || this.aClass47_1.method1165()) {
							break label194;
						}
						local166 = false;
					} else {
						if (this.aClass47_2 == null || this.aClass47_2.method1165()) {
							break label194;
						}
						local166 = false;
					}
					if (!local166) {
						this.aBoolean541 = true;
						break label195;
					}
				}
				this.aShortArray82 = this.aShortArray85 = this.aShortArray79 = null;
				this.aByteArray70 = null;
			}
		}
		if (this.aShortArray88 != null && !Static510.method7145(this.anInt7062, this.anInt7057)) {
			if (this.aClass47_1 == null || this.aClass47_1.method1165()) {
				this.aShortArray88 = null;
			} else {
				this.aBoolean541 = true;
			}
		}
		if (this.aByteArray69 != null && !Static563.method7617(this.anInt7062, this.anInt7057)) {
			if (this.aClass47_1 == null || this.aClass47_1.method1165()) {
				this.aByteArray69 = null;
			} else {
				this.aBoolean541 = true;
			}
		}
		if (this.aFloatArray61 != null && !Static238.method2519(this.anInt7062, this.anInt7057)) {
			if (this.aClass47_3 == null || this.aClass47_3.method1165()) {
				this.aFloatArray61 = this.aFloatArray60 = null;
			} else {
				this.aBoolean541 = true;
			}
		}
		if (this.aShortArray83 != null && !Static306.method3922(this.anInt7057, this.anInt7062)) {
			if (this.aClass47_1 == null || this.aClass47_1.method1165()) {
				this.aShortArray83 = null;
			} else {
				this.aBoolean541 = true;
			}
		}
		if (this.aShortArray80 != null && !Static191.method3055(this.anInt7057, this.anInt7062)) {
			if ((this.aClass190_1 == null || this.aClass190_1.method3933()) && (this.aClass47_1 == null || this.aClass47_1.method1165())) {
				this.aShortArray80 = this.aShortArray84 = this.aShortArray76 = null;
			} else {
				this.aBoolean541 = true;
			}
		}
		if (this.aShortArray78 != null) {
			if (this.aClass47_4 == null || this.aClass47_4.method1165()) {
				this.aShortArray78 = null;
			} else {
				this.aBoolean541 = true;
			}
		}
		if (this.aShortArray81 != null) {
			if (this.aClass47_1 == null || this.aClass47_1.method1165()) {
				this.aShortArray81 = null;
			} else {
				this.aBoolean541 = true;
			}
		}
		if (this.anIntArrayArray38 != null && !Static137.method2396(this.anInt7057, this.anInt7062)) {
			this.anIntArrayArray38 = null;
			this.aShortArray86 = null;
		}
		if (this.anIntArrayArray40 != null && !Static328.method4856(this.anInt7057, this.anInt7062)) {
			this.anIntArrayArray40 = null;
			this.aShortArray77 = null;
		}
		if (this.anIntArrayArray39 != null && !Static314.method4674(this.anInt7057, this.anInt7062)) {
			this.anIntArrayArray39 = null;
		}
		if (this.anIntArray418 != null && (this.anInt7057 & 0x800) == 0 && (this.anInt7057 & 0x40000) == 0) {
			this.anIntArray418 = null;
			this.anIntArray415 = null;
			this.anIntArray416 = null;
		}
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "()[Lclient!ns;")
	@Override
	public Class244[] method7404() {
		return this.aClass244Array3;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5698(arg1, arg3, arg2, arg0, arg4);
	}

	@OriginalMember(owner = "client!pea", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort79 = (short) arg0;
		this.method5709();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!q;Lclient!et;I)V")
	@Override
	public void method7413(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class11_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7105 == 0) {
			return;
		}
		@Pc(13) Class34_Sub1 local13 = this.aClass78_Sub1_14.aClass34_Sub1_16;
		@Pc(16) Class34_Sub1 local16 = (Class34_Sub1) arg0;
		if (!this.aBoolean543) {
			this.method5710();
		}
		Static578.aFloat240 = local16.aFloat18 * local13.aFloat13 + local13.aFloat22 * local16.aFloat19 + local16.aFloat20 * local13.aFloat24 + local13.aFloat20;
		Static129.aFloat77 = local16.aFloat16 * local13.aFloat13 + local16.aFloat15 * local13.aFloat22 + local16.aFloat22 * local13.aFloat24;
		@Pc(69) float local69 = Static578.aFloat240 + (float) this.anInt7074 * Static129.aFloat77;
		@Pc(77) float local77 = Static129.aFloat77 * (float) this.anInt7035 + Static578.aFloat240;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = local77 - (float) this.anInt7080;
			local93 = local69 + (float) this.anInt7080;
		} else {
			local93 = local77 + (float) this.anInt7080;
			local87 = (float) -this.anInt7080 + local69;
		}
		if (this.aClass78_Sub1_14.aFloat216 <= local87 || local93 <= (float) this.aClass78_Sub1_14.anInt8591) {
			return;
		}
		Static299.aFloat156 = local16.aFloat22 * local13.aFloat14 + local16.aFloat16 * local13.aFloat17 + local16.aFloat15 * local13.aFloat16;
		Static294.aFloat133 = local13.aFloat18 + local13.aFloat14 * local16.aFloat20 + local13.aFloat17 * local16.aFloat18 + local16.aFloat19 * local13.aFloat16;
		@Pc(170) float local170 = (float) this.anInt7074 * Static299.aFloat156 + Static294.aFloat133;
		@Pc(178) float local178 = Static299.aFloat156 * (float) this.anInt7035 + Static294.aFloat133;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local178 < local170) {
			local193 = (float) this.aClass78_Sub1_14.anInt8590 * (local178 - (float) this.anInt7080);
			local204 = (float) this.aClass78_Sub1_14.anInt8590 * ((float) this.anInt7080 + local170);
		} else {
			local193 = (local170 - (float) this.anInt7080) * (float) this.aClass78_Sub1_14.anInt8590;
			local204 = ((float) this.anInt7080 + local178) * (float) this.aClass78_Sub1_14.anInt8590;
		}
		if (this.aClass78_Sub1_14.aFloat211 <= local193 / local93 || local204 / local93 <= this.aClass78_Sub1_14.aFloat210) {
			return;
		}
		Static313.aFloat157 = local13.aFloat15 * local16.aFloat19 + local16.aFloat18 * local13.aFloat21 + local16.aFloat20 * local13.aFloat23 + local13.aFloat19;
		Static386.aFloat183 = local16.aFloat22 * local13.aFloat23 + local13.aFloat15 * local16.aFloat15 + local16.aFloat16 * local13.aFloat21;
		@Pc(293) float local293 = Static313.aFloat157 + (float) this.anInt7074 * Static386.aFloat183;
		@Pc(301) float local301 = Static313.aFloat157 + Static386.aFloat183 * (float) this.anInt7035;
		@Pc(327) float local327;
		@Pc(316) float local316;
		if (local301 < local293) {
			local316 = (float) this.aClass78_Sub1_14.anInt8567 * (local293 + (float) this.anInt7080);
			local327 = (local301 - (float) this.anInt7080) * (float) this.aClass78_Sub1_14.anInt8567;
		} else {
			local316 = (float) this.aClass78_Sub1_14.anInt8567 * (local301 + (float) this.anInt7080);
			local327 = (float) this.aClass78_Sub1_14.anInt8567 * (local293 - (float) this.anInt7080);
		}
		if (this.aClass78_Sub1_14.aFloat212 <= local327 / local93 || this.aClass78_Sub1_14.aFloat224 >= local316 / local93) {
			return;
		}
		if (arg1 != null || this.aClass95Array1 != null) {
			Static172.aFloat91 = local16.aFloat13 * local13.aFloat24 + local13.aFloat13 * local16.aFloat17 + local16.aFloat21 * local13.aFloat22;
			Static566.aFloat237 = local16.aFloat24 * local13.aFloat14 + local13.aFloat17 * local16.aFloat14 + local16.aFloat23 * local13.aFloat16;
			Static184.aFloat94 = local13.aFloat16 * local16.aFloat21 + local16.aFloat17 * local13.aFloat17 + local16.aFloat13 * local13.aFloat14;
			Static100.aFloat40 = local13.aFloat22 * local16.aFloat23 + local13.aFloat13 * local16.aFloat14 + local13.aFloat24 * local16.aFloat24;
			Static268.aFloat129 = local13.aFloat21 * local16.aFloat14 + local13.aFloat15 * local16.aFloat23 + local16.aFloat24 * local13.aFloat23;
			Static265.aFloat127 = local16.aFloat13 * local13.aFloat23 + local13.aFloat21 * local16.aFloat17 + local16.aFloat21 * local13.aFloat15;
		}
		if (arg1 != null) {
			@Pc(486) boolean local486 = false;
			@Pc(488) boolean local488 = true;
			@Pc(497) int local497 = this.anInt7092 + this.anInt7072 >> 1;
			@Pc(505) int local505 = this.anInt7111 + this.anInt7040 >> 1;
			@Pc(524) int local524 = (int) ((float) local505 * Static566.aFloat237 + Static294.aFloat133 + Static184.aFloat94 * (float) local497 + Static299.aFloat156 * (float) this.anInt7074);
			@Pc(543) int local543 = (int) (Static268.aFloat129 * (float) local505 + Static313.aFloat157 + (float) local497 * Static265.aFloat127 + (float) this.anInt7074 * Static386.aFloat183);
			@Pc(562) int local562 = (int) ((float) this.anInt7074 * Static129.aFloat77 + Static578.aFloat240 + Static172.aFloat91 * (float) local497 + (float) local505 * Static100.aFloat40);
			if (this.aClass78_Sub1_14.anInt8591 <= local562) {
				arg1.anInt2556 = local524 * this.aClass78_Sub1_14.anInt8590 / local562 + this.aClass78_Sub1_14.anInt8589;
				arg1.anInt2554 = this.aClass78_Sub1_14.anInt8588 + this.aClass78_Sub1_14.anInt8567 * local543 / local562;
			} else {
				local486 = true;
			}
			@Pc(620) int local620 = (int) ((float) this.anInt7035 * Static299.aFloat156 + (float) local497 * Static184.aFloat94 + Static294.aFloat133 + (float) local505 * Static566.aFloat237);
			@Pc(639) int local639 = (int) (Static313.aFloat157 + (float) local497 * Static265.aFloat127 + (float) this.anInt7035 * Static386.aFloat183 + Static268.aFloat129 * (float) local505);
			@Pc(658) int local658 = (int) ((float) local505 * Static100.aFloat40 + (float) this.anInt7035 * Static129.aFloat77 + Static578.aFloat240 + (float) local497 * Static172.aFloat91);
			if (local658 < this.aClass78_Sub1_14.anInt8591) {
				local486 = true;
			} else {
				arg1.anInt2557 = local639 * this.aClass78_Sub1_14.anInt8567 / local658 + this.aClass78_Sub1_14.anInt8588;
				arg1.anInt2558 = this.aClass78_Sub1_14.anInt8589 + local620 * this.aClass78_Sub1_14.anInt8590 / local658;
			}
			if (local486) {
				if (this.aClass78_Sub1_14.anInt8591 > local562 && local658 < this.aClass78_Sub1_14.anInt8591) {
					local488 = false;
				} else {
					@Pc(731) int local731;
					@Pc(742) int local742;
					@Pc(753) int local753;
					if (this.aClass78_Sub1_14.anInt8591 > local562) {
						local731 = (local658 - this.aClass78_Sub1_14.anInt8591 << 16) / (local658 - local562);
						local742 = ((local620 - local524) * local731 >> 16) + local620;
						local753 = ((local639 - local543) * local731 >> 16) + local639;
						arg1.anInt2556 = this.aClass78_Sub1_14.anInt8589 + this.aClass78_Sub1_14.anInt8590 * local742 / this.aClass78_Sub1_14.anInt8591;
						arg1.anInt2554 = this.aClass78_Sub1_14.anInt8588 + local753 * this.aClass78_Sub1_14.anInt8567 / this.aClass78_Sub1_14.anInt8591;
					} else if (local658 < this.aClass78_Sub1_14.anInt8591) {
						local731 = (local562 - this.aClass78_Sub1_14.anInt8591 << 16) / (local562 - local658);
						local742 = ((local524 - local620) * local731 >> 16) + local524;
						arg1.anInt2556 = this.aClass78_Sub1_14.anInt8589 + this.aClass78_Sub1_14.anInt8590 * local742 / this.aClass78_Sub1_14.anInt8591;
						local753 = (local731 * (local543 - local639) >> 16) + local543;
						arg1.anInt2554 = local753 * this.aClass78_Sub1_14.anInt8567 / this.aClass78_Sub1_14.anInt8591 + this.aClass78_Sub1_14.anInt8588;
					}
				}
			}
			if (local488) {
				arg1.aBoolean195 = true;
				if (local562 > local658) {
					arg1.anInt2555 = this.aClass78_Sub1_14.anInt8589 + (this.anInt7080 + local524) * this.aClass78_Sub1_14.anInt8590 / local562 - arg1.anInt2556;
				} else {
					arg1.anInt2555 = this.aClass78_Sub1_14.anInt8589 + this.aClass78_Sub1_14.anInt8590 * (this.anInt7080 + local620) / local658 - arg1.anInt2558;
				}
			}
		}
		this.aClass78_Sub1_14.method6939();
		this.aClass78_Sub1_14.method6876(local16);
		this.method5699();
		this.method5712();
	}

	@OriginalMember(owner = "client!pea", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray40 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7059; local12++) {
			this.anIntArray419[local12] <<= 0x4;
			this.anIntArray414[local12] <<= 0x4;
			this.anIntArray417[local12] <<= 0x4;
		}
		Static173.anInt3245 = 0;
		Static536.anInt8992 = 0;
		Static524.anInt1391 = 0;
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "()V")
	@Override
	public void method7397() {
		if (this.anInt7105 > 0 && this.anInt7094 > 0) {
			this.method5713();
			this.method5697();
			this.method5702();
		}
	}

	@OriginalMember(owner = "client!pea", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7073; local7++) {
			if (arg0 != 0) {
				this.anIntArray419[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray414[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray417[local7] += arg2;
			}
		}
		this.method5708();
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pea", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static173.anInt3245 = 0;
			Static524.anInt1391 = 0;
			Static536.anInt8992 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray40.length > local41) {
					local55 = this.anIntArrayArray40[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray77 == null || (this.aShortArray77[local63] & arg6) != 0) {
							Static173.anInt3245 += this.anIntArray419[local63];
							Static524.anInt1391 += this.anIntArray414[local63];
							Static536.anInt8992 += this.anIntArray417[local63];
							local33++;
						}
					}
				}
			}
			if (local33 > 0) {
				Static524.anInt1391 = Static524.anInt1391 / local33 + arg3;
				Static551.aBoolean688 = true;
				Static173.anInt3245 = Static173.anInt3245 / local33 + arg2;
				Static536.anInt8992 = Static536.anInt8992 / local33 + arg4;
			} else {
				Static173.anInt3245 = arg2;
				Static536.anInt8992 = arg4;
				Static524.anInt1391 = arg3;
			}
			return;
		}
		@Pc(255) int[] local255;
		@Pc(257) int local257;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg4 * arg7[2] + arg7[1] * arg3 + arg2 * arg7[0] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg3 * arg7[4] + arg2 * arg7[3] + 8192 >> 14;
				local41 = arg4 * arg7[8] + arg2 * arg7[6] + arg3 * arg7[7] + 8192 >> 14;
				arg4 = local41;
				arg3 = local35;
				arg2 = local33;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray40.length) {
					local255 = this.anIntArrayArray40[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray77 == null || (this.aShortArray77[local57] & arg6) != 0) {
							this.anIntArray419[local57] += arg2;
							this.anIntArray414[local57] += arg3;
							this.anIntArray417[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(397) int local397;
		@Pc(415) int local415;
		@Pc(648) int local648;
		@Pc(657) int local657;
		@Pc(669) int local669;
		@Pc(673) int local673;
		@Pc(691) int local691;
		@Pc(1021) int local1021;
		@Pc(1029) int local1029;
		@Pc(1185) int local1185;
		@Pc(1211) int local1211;
		@Pc(1215) int local1215;
		@Pc(1223) int local1223;
		@Pc(1228) int local1228;
		@Pc(1232) int local1232;
		@Pc(1236) int local1236;
		@Pc(1238) int local1238;
		@Pc(1370) int[] local1370;
		@Pc(1372) int local1372;
		@Pc(1376) int local1376;
		@Pc(1380) int local1380;
		@Pc(1382) int local1382;
		@Pc(1512) int local1512;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray40.length > local35) {
						local255 = this.anIntArrayArray40[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local57 = local255[local257];
							if (this.aShortArray77 == null || (arg6 & this.aShortArray77[local57]) != 0) {
								this.anIntArray419[local57] -= Static173.anInt3245;
								this.anIntArray414[local57] -= Static524.anInt1391;
								this.anIntArray417[local57] -= Static536.anInt8992;
								if (arg4 != 0) {
									local63 = Class85_Sub8.anIntArray426[arg4];
									local397 = Class85_Sub8.anIntArray427[arg4];
									local415 = this.anIntArray414[local57] * local63 + this.anIntArray419[local57] * local397 + 16383 >> 14;
									this.anIntArray414[local57] = local397 * this.anIntArray414[local57] + 16383 - local63 * this.anIntArray419[local57] >> 14;
									this.anIntArray419[local57] = local415;
								}
								if (arg2 != 0) {
									local63 = Class85_Sub8.anIntArray426[arg2];
									local397 = Class85_Sub8.anIntArray427[arg2];
									local415 = local397 * this.anIntArray414[local57] + 16383 - local63 * this.anIntArray417[local57] >> 14;
									this.anIntArray417[local57] = this.anIntArray417[local57] * local397 + this.anIntArray414[local57] * local63 + 16383 >> 14;
									this.anIntArray414[local57] = local415;
								}
								if (arg3 != 0) {
									local63 = Class85_Sub8.anIntArray426[arg3];
									local397 = Class85_Sub8.anIntArray427[arg3];
									local415 = local63 * this.anIntArray417[local57] + this.anIntArray419[local57] * local397 + 16383 >> 14;
									this.anIntArray417[local57] = this.anIntArray417[local57] * local397 + 16383 - this.anIntArray419[local57] * local63 >> 14;
									this.anIntArray419[local57] = local415;
								}
								this.anIntArray419[local57] += Static173.anInt3245;
								this.anIntArray414[local57] += Static524.anInt1391;
								this.anIntArray417[local57] += Static536.anInt8992;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray40.length > local41) {
							local55 = this.anIntArrayArray40[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray77 == null || (this.aShortArray77[local63] & arg6) != 0) {
									local397 = this.anIntArray413[local63];
									local415 = this.anIntArray413[local63 + 1];
									for (local648 = local397; local648 < local415; local648++) {
										local657 = this.aShortArray87[local648] - 1;
										if (local657 == -1) {
											break;
										}
										if (arg4 != 0) {
											local669 = Class85_Sub8.anIntArray426[arg4];
											local673 = Class85_Sub8.anIntArray427[arg4];
											local691 = this.aShortArray85[local657] * local669 + local673 * this.aShortArray82[local657] + 16383 >> 14;
											this.aShortArray85[local657] = (short) (this.aShortArray85[local657] * local673 + 16383 - this.aShortArray82[local657] * local669 >> 14);
											this.aShortArray82[local657] = (short) local691;
										}
										if (arg2 != 0) {
											local669 = Class85_Sub8.anIntArray426[arg2];
											local673 = Class85_Sub8.anIntArray427[arg2];
											local691 = this.aShortArray85[local657] * local673 + 16383 - this.aShortArray79[local657] * local669 >> 14;
											this.aShortArray79[local657] = (short) (local669 * this.aShortArray85[local657] + local673 * this.aShortArray79[local657] + 16383 >> 14);
											this.aShortArray85[local657] = (short) local691;
										}
										if (arg3 != 0) {
											local669 = Class85_Sub8.anIntArray426[arg3];
											local673 = Class85_Sub8.anIntArray427[arg3];
											local691 = local669 * this.aShortArray79[local657] + local673 * this.aShortArray82[local657] + 16383 >> 14;
											this.aShortArray79[local657] = (short) (local673 * this.aShortArray79[local657] + 16383 - this.aShortArray82[local657] * local669 >> 14);
											this.aShortArray82[local657] = (short) local691;
										}
									}
								}
							}
						}
					}
					this.method5711();
					return;
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local257 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static551.aBoolean688) {
					local397 = arg7[6] * Static536.anInt8992 + Static173.anInt3245 * arg7[0] + Static524.anInt1391 * arg7[3] + 8192 >> 14;
					local415 = arg7[7] * Static536.anInt8992 + Static173.anInt3245 * arg7[1] + arg7[4] * Static524.anInt1391 + 8192 >> 14;
					local648 = arg7[2] * Static173.anInt3245 + arg7[5] * Static524.anInt1391 + Static536.anInt8992 * arg7[8] + 8192 >> 14;
					local415 += local57;
					local397 += local257;
					local648 += local63;
					Static524.anInt1391 = local415;
					Static173.anInt3245 = local397;
					Static551.aBoolean688 = false;
					Static536.anInt8992 = local648;
				}
				@Pc(989) int[] local989 = new int[9];
				local415 = Class85_Sub8.anIntArray427[arg2];
				local648 = Class85_Sub8.anIntArray426[arg2];
				local657 = Class85_Sub8.anIntArray427[arg3];
				local669 = Class85_Sub8.anIntArray426[arg3];
				local673 = Class85_Sub8.anIntArray427[arg4];
				local691 = Class85_Sub8.anIntArray426[arg4];
				local1021 = local673 * local648 + 8192 >> 14;
				local1029 = local648 * local691 + 8192 >> 14;
				local989[7] = local669 * local691 + local657 * local1021 + 8192 >> 14;
				local989[2] = local669 * local415 + 8192 >> 14;
				local989[1] = -local657 * local691 + local669 * local1021 + 8192 >> 14;
				local989[4] = local415 * local673 + 8192 >> 14;
				local989[5] = -local648;
				local989[6] = local1029 * local657 + -local669 * local673 + 8192 >> 14;
				local989[0] = local657 * local673 + local1029 * local669 + 8192 >> 14;
				local989[8] = local415 * local657 + 8192 >> 14;
				local989[3] = local691 * local415 + 8192 >> 14;
				@Pc(1159) int local1159 = -Static173.anInt3245 * local989[0] + -Static524.anInt1391 * local989[1] + local989[2] * -Static536.anInt8992 + 8192 >> 14;
				local1185 = local989[5] * -Static536.anInt8992 + local989[3] * -Static173.anInt3245 + local989[4] * -Static524.anInt1391 + 8192 >> 14;
				local1211 = -Static173.anInt3245 * local989[6] + local989[7] * -Static524.anInt1391 + local989[8] * -Static536.anInt8992 + 8192 >> 14;
				local1215 = Static173.anInt3245 + local1159;
				@Pc(1219) int local1219 = Static524.anInt1391 + local1185;
				local1223 = Static536.anInt8992 + local1211;
				@Pc(1226) int[] local1226 = new int[9];
				for (local1228 = 0; local1228 < 3; local1228++) {
					for (local1232 = 0; local1232 < 3; local1232++) {
						local1236 = 0;
						for (local1238 = 0; local1238 < 3; local1238++) {
							local1236 += arg7[local1232 * 3 + local1238] * local989[local1228 * 3 + local1238];
						}
						local1226[local1228 * 3 + local1232] = local1236 + 8192 >> 14;
					}
				}
				local1232 = local989[2] * local63 + local989[0] * local257 + local57 * local989[1] + 8192 >> 14;
				local1236 = local63 * local989[5] + local257 * local989[3] + local57 * local989[4] + 8192 >> 14;
				local1236 += local1219;
				local1238 = local989[8] * local63 + local57 * local989[7] + local257 * local989[6] + 8192 >> 14;
				local1232 += local1215;
				local1238 += local1223;
				local1370 = new int[9];
				for (local1372 = 0; local1372 < 3; local1372++) {
					for (local1376 = 0; local1376 < 3; local1376++) {
						local1380 = 0;
						for (local1382 = 0; local1382 < 3; local1382++) {
							local1380 += arg7[local1372 * 3 + local1382] * local1226[local1382 * 3 + local1376];
						}
						local1370[local1376 + local1372 * 3] = local1380 + 8192 >> 14;
					}
				}
				local1376 = local1238 * arg7[2] + local1232 * arg7[0] + arg7[1] * local1236 + 8192 >> 14;
				local1380 = arg7[5] * local1238 + arg7[3] * local1232 + arg7[4] * local1236 + 8192 >> 14;
				local1380 += local35;
				local1376 += local33;
				local1382 = arg7[6] * local1232 + arg7[7] * local1236 + arg7[8] * local1238 + 8192 >> 14;
				local1382 += local41;
				for (local1512 = 0; local1512 < local8; local1512++) {
					@Pc(1518) int local1518 = arg1[local1512];
					if (this.anIntArrayArray40.length > local1518) {
						@Pc(1528) int[] local1528 = this.anIntArrayArray40[local1518];
						for (@Pc(1530) int local1530 = 0; local1530 < local1528.length; local1530++) {
							@Pc(1536) int local1536 = local1528[local1530];
							if (this.aShortArray77 == null || (arg6 & this.aShortArray77[local1536]) != 0) {
								@Pc(1577) int local1577 = local1370[1] * this.anIntArray414[local1536] + local1370[0] * this.anIntArray419[local1536] + this.anIntArray417[local1536] * local1370[2] + 8192 >> 14;
								@Pc(1609) int local1609 = local1370[5] * this.anIntArray417[local1536] + local1370[3] * this.anIntArray419[local1536] + local1370[4] * this.anIntArray414[local1536] + 8192 >> 14;
								@Pc(1641) int local1641 = this.anIntArray414[local1536] * local1370[7] + local1370[6] * this.anIntArray419[local1536] + local1370[8] * this.anIntArray417[local1536] + 8192 >> 14;
								@Pc(1645) int local1645 = local1609 + local1380;
								@Pc(1649) int local1649 = local1577 + local1376;
								this.anIntArray419[local1536] = local1649;
								@Pc(1658) int local1658 = local1641 + local1382;
								this.anIntArray414[local1536] = local1645;
								this.anIntArray417[local1536] = local1658;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2585) Class201 local2585;
			@Pc(2476) boolean local2476;
			@Pc(2580) Class95 local2580;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					local2476 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray38.length > local41) {
							local55 = this.anIntArrayArray38[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray86 == null || (arg6 & this.aShortArray86[local63]) != 0) {
									local397 = arg2 * 8 + (this.aByteArray69[local63] & 0xFF);
									if (local397 < 0) {
										local397 = 0;
									} else if (local397 > 255) {
										local397 = 255;
									}
									this.aByteArray69[local63] = (byte) local397;
								}
							}
							local2476 |= local55.length > 0;
						}
					}
					if (local2476) {
						if (this.aClass95Array1 != null) {
							for (local41 = 0; local41 < this.anInt7051; local41++) {
								local2580 = this.aClass95Array1[local41];
								local2585 = this.aClass201Array1[local41];
								local2585.anInt5270 = local2585.anInt5270 & 0xFFFFFF | 255 - (this.aByteArray69[local2580.anInt2665] & 0xFF) << 24;
							}
						}
						this.method5709();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray38 != null) {
					local2476 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray38.length > local41) {
							local55 = this.anIntArrayArray38[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray86 == null || (this.aShortArray86[local63] & arg6) != 0) {
									local397 = this.aShortArray88[local63] & 0xFFFF;
									local415 = local397 >> 10 & 0x3F;
									local648 = local397 >> 7 & 0x7;
									@Pc(2685) int local2685 = arg2 + local415 & 0x3F;
									local657 = local397 & 0x7F;
									local648 += arg3 / 4;
									local657 += arg4;
									if (local648 < 0) {
										local648 = 0;
									} else if (local648 > 7) {
										local648 = 7;
									}
									if (local657 < 0) {
										local657 = 0;
									} else if (local657 > 127) {
										local657 = 127;
									}
									this.aShortArray88[local63] = (short) (local648 << 7 | local2685 << 10 | local657);
								}
							}
							local2476 |= local55.length > 0;
						}
					}
					if (local2476) {
						if (this.aClass95Array1 != null) {
							for (local41 = 0; local41 < this.anInt7051; local41++) {
								local2580 = this.aClass95Array1[local41];
								local2585 = this.aClass201Array1[local41];
								local2585.anInt5270 = Static226.anIntArray212[this.aShortArray88[local2580.anInt2665] & 0xFFFF] & 0xFFFFFF | local2585.anInt5270 & 0xFF000000;
							}
						}
						this.method5709();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray39 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray39.length > local35) {
							local255 = this.anIntArrayArray39[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2585 = this.aClass201Array1[local255[local257]];
								local2585.anInt5266 += arg3;
								local2585.anInt5268 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray39 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray39.length > local35) {
							local255 = this.anIntArrayArray39[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2585 = this.aClass201Array1[local255[local257]];
								local2585.anInt5272 = local2585.anInt5272 * arg2 >> 7;
								local2585.anInt5274 = arg3 * local2585.anInt5274 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray39.length > local35) {
						local255 = this.anIntArrayArray39[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local2585 = this.aClass201Array1[local255[local257]];
							local2585.anInt5267 = local2585.anInt5267 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray40.length) {
					local255 = this.anIntArrayArray40[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray77 == null || (arg6 & this.aShortArray77[local57]) != 0) {
							this.anIntArray419[local57] -= Static173.anInt3245;
							this.anIntArray414[local57] -= Static524.anInt1391;
							this.anIntArray417[local57] -= Static536.anInt8992;
							this.anIntArray419[local57] = this.anIntArray419[local57] * arg2 >> 7;
							this.anIntArray414[local57] = arg3 * this.anIntArray414[local57] >> 7;
							this.anIntArray417[local57] = this.anIntArray417[local57] * arg4 >> 7;
							this.anIntArray419[local57] += Static173.anInt3245;
							this.anIntArray414[local57] += Static524.anInt1391;
							this.anIntArray417[local57] += Static536.anInt8992;
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
			if (Static551.aBoolean688) {
				local397 = Static536.anInt8992 * arg7[6] + Static524.anInt1391 * arg7[3] + arg7[0] * Static173.anInt3245 + 8192 >> 14;
				local415 = arg7[4] * Static524.anInt1391 + arg7[1] * Static173.anInt3245 + arg7[7] * Static536.anInt8992 + 8192 >> 14;
				local397 += local257;
				local648 = Static173.anInt3245 * arg7[2] + arg7[5] * Static524.anInt1391 + arg7[8] * Static536.anInt8992 + 8192 >> 14;
				local415 += local57;
				local648 += local63;
				Static173.anInt3245 = local397;
				Static524.anInt1391 = local415;
				Static551.aBoolean688 = false;
				Static536.anInt8992 = local648;
			}
			local397 = arg2 << 15 >> 7;
			local415 = arg3 << 15 >> 7;
			local648 = arg4 << 15 >> 7;
			local657 = local397 * -Static173.anInt3245 + 8192 >> 14;
			local669 = local415 * -Static524.anInt1391 + 8192 >> 14;
			local673 = local648 * -Static536.anInt8992 + 8192 >> 14;
			local691 = local657 + Static173.anInt3245;
			local1021 = Static524.anInt1391 + local669;
			local1029 = local673 + Static536.anInt8992;
			@Pc(2007) int[] local2007 = new int[] { arg7[0] * local397 + 8192 >> 14, arg7[3] * local397 + 8192 >> 14, arg7[6] * local397 + 8192 >> 14, arg7[1] * local415 + 8192 >> 14, arg7[4] * local415 + 8192 >> 14, local415 * arg7[7] + 8192 >> 14, arg7[2] * local648 + 8192 >> 14, local648 * arg7[5] + 8192 >> 14, arg7[8] * local648 + 8192 >> 14 };
			local1185 = local257 * local397 + 8192 >> 14;
			local1211 = local415 * local57 + 8192 >> 14;
			@Pc(2135) int local2135 = local1185 + local691;
			local1215 = local63 * local648 + 8192 >> 14;
			@Pc(2147) int local2147 = local1211 + local1021;
			@Pc(2151) int local2151 = local1215 + local1029;
			@Pc(2154) int[] local2154 = new int[9];
			@Pc(2160) int local2160;
			for (local1223 = 0; local1223 < 3; local1223++) {
				for (local2160 = 0; local2160 < 3; local2160++) {
					local1228 = 0;
					for (local1232 = 0; local1232 < 3; local1232++) {
						local1228 += arg7[local1223 * 3 + local1232] * local2007[local1232 * 3 + local2160];
					}
					local2154[local2160 + local1223 * 3] = local1228 + 8192 >> 14;
				}
			}
			local2160 = arg7[0] * local2135 + arg7[1] * local2147 + local2151 * arg7[2] + 8192 >> 14;
			local1228 = local2151 * arg7[5] + arg7[4] * local2147 + arg7[3] * local2135 + 8192 >> 14;
			local1228 += local35;
			local2160 += local33;
			local1232 = arg7[8] * local2151 + arg7[6] * local2135 + local2147 * arg7[7] + 8192 >> 14;
			local1232 += local41;
			for (local1236 = 0; local1236 < local8; local1236++) {
				local1238 = arg1[local1236];
				if (this.anIntArrayArray40.length > local1238) {
					local1370 = this.anIntArrayArray40[local1238];
					for (local1372 = 0; local1372 < local1370.length; local1372++) {
						local1376 = local1370[local1372];
						if (this.aShortArray77 == null || (this.aShortArray77[local1376] & arg6) != 0) {
							local1380 = this.anIntArray414[local1376] * local2154[1] + local2154[0] * this.anIntArray419[local1376] + local2154[2] * this.anIntArray417[local1376] + 8192 >> 14;
							local1382 = this.anIntArray417[local1376] * local2154[5] + local2154[3] * this.anIntArray419[local1376] + local2154[4] * this.anIntArray414[local1376] + 8192 >> 14;
							local1512 = this.anIntArray414[local1376] * local2154[7] + local2154[6] * this.anIntArray419[local1376] + local2154[8] * this.anIntArray417[local1376] + 8192 >> 14;
							@Pc(2429) int local2429 = local1380 + local2160;
							@Pc(2433) int local2433 = local1382 + local1228;
							this.anIntArray419[local1376] = local2429;
							@Pc(2442) int local2442 = local1512 + local1232;
							this.anIntArray414[local1376] = local2433;
							this.anIntArray417[local1376] = local2442;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7059; local3++) {
			this.anIntArray419[local3] = this.anIntArray419[local3] + 7 >> 4;
			this.anIntArray414[local3] = this.anIntArray414[local3] + 7 >> 4;
			this.anIntArray417[local3] = this.anIntArray417[local3] + 7 >> 4;
		}
		this.method5708();
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pea", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class85_Sub8.anIntArray426[arg0];
		@Pc(13) int local13 = Class85_Sub8.anIntArray427[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7073; local15++) {
			local33 = this.anIntArray419[local15] * local13 + this.anIntArray417[local15] * local9 >> 14;
			this.anIntArray417[local15] = local13 * this.anIntArray417[local15] - local9 * this.anIntArray419[local15] >> 14;
			this.anIntArray419[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7105; local33++) {
			@Pc(83) int local83 = this.aShortArray82[local33] * local13 + local9 * this.aShortArray79[local33] >> 14;
			this.aShortArray79[local33] = (short) (local13 * this.aShortArray79[local33] - local9 * this.aShortArray82[local33] >> 14);
			this.aShortArray82[local33] = (short) local83;
		}
		this.method5708();
		this.method5711();
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7097; local7++) {
			if (this.aShortArray88[local7] == arg0) {
				this.aShortArray88[local7] = arg1;
			}
		}
		if (this.aClass95Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt7051; local30++) {
				@Pc(37) Class95 local37 = this.aClass95Array1[local30];
				@Pc(42) Class201 local42 = this.aClass201Array1[local30];
				local42.anInt5270 = Static226.anIntArray212[this.aShortArray88[local37.anInt2665] & 0xFFFF] & 0xFFFFFF | local42.anInt5270 & 0xFF000000;
			}
		}
		this.method5709();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
	public void method5704() {
		if (this.aClass47_4 != null) {
			this.aClass47_4.method1169();
		}
		if (this.aClass47_3 != null) {
			this.aClass47_3.method1169();
		}
		if (this.aClass47_1 != null) {
			this.aClass47_1.method1169();
		}
		if (this.aClass47_2 != null) {
			this.aClass47_2.method1169();
		}
		if (this.aClass190_1 != null) {
			this.aClass190_1.method3932();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7403(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray77 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7073; local14++) {
			if ((this.aShortArray77[local14] & arg1) != 0) {
				if (arg2) {
					arg0.B(this.anIntArray419[local14], this.anIntArray414[local14], this.anIntArray417[local14], local12);
				} else {
					arg0.method6216(this.anIntArray419[local14], this.anIntArray414[local14], this.anIntArray417[local14], local12);
				}
				this.anIntArray419[local14] = local12[0];
				this.anIntArray414[local14] = local12[1];
				this.anIntArray417[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean543) {
			this.method5710();
		}
		return this.anInt7074;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILclient!wb;)V")
	private void method5705(@OriginalArg(1) Class1_Sub8_Sub4_Sub2 arg0) {
		if (Static76.anIntArray381.length < this.anInt7105) {
			Static159.anIntArray139 = new int[this.anInt7105];
			Static76.anIntArray381 = new int[this.anInt7105];
		}
		@Pc(52) int local52;
		@Pc(91) int local91;
		@Pc(100) int local100;
		for (@Pc(24) int local24 = 0; local24 < this.anInt7073; local24++) {
			local52 = (this.anIntArray419[local24] - (this.aClass78_Sub1_14.anInt8574 * this.anIntArray414[local24] >> 8) >> this.aClass78_Sub1_14.anInt8562) - arg0.anInt9485;
			@Pc(77) int local77 = (this.anIntArray417[local24] - (this.anIntArray414[local24] * this.aClass78_Sub1_14.anInt8579 >> 8) >> this.aClass78_Sub1_14.anInt8562) - arg0.anInt9482;
			@Pc(82) int local82 = this.anIntArray413[local24];
			@Pc(89) int local89 = this.anIntArray413[local24 + 1];
			for (local91 = local82; local91 < local89; local91++) {
				local100 = this.aShortArray87[local91] - 1;
				if (local100 == -1) {
					break;
				}
				Static76.anIntArray381[local100] = local52;
				Static159.anIntArray139[local100] = local77;
			}
		}
		for (local52 = 0; local52 < this.anInt7094; local52++) {
			if (this.aByteArray69 == null || this.aByteArray69[local52] <= 128) {
				@Pc(138) short local138 = this.aShortArray80[local52];
				@Pc(143) short local143 = this.aShortArray84[local52];
				@Pc(148) short local148 = this.aShortArray76[local52];
				local91 = Static76.anIntArray381[local138];
				local100 = Static76.anIntArray381[local143];
				@Pc(160) int local160 = Static76.anIntArray381[local148];
				@Pc(164) int local164 = Static159.anIntArray139[local138];
				@Pc(168) int local168 = Static159.anIntArray139[local143];
				@Pc(172) int local172 = Static159.anIntArray139[local148];
				if (-((local168 - local164) * (local160 - local100)) + (local168 - local172) * (-local100 + local91) > 0) {
					arg0.method7720(local172, local168, local100, local160, local164, local91);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "()V")
	@Override
	protected void method7399() {
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!q;Lclient!et;II)V")
	@Override
	public void method7405(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class11_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7105 == 0) {
			return;
		}
		@Pc(13) Class34_Sub1 local13 = this.aClass78_Sub1_14.aClass34_Sub1_16;
		if (!this.aBoolean543) {
			this.method5710();
		}
		@Pc(22) Class34_Sub1 local22 = (Class34_Sub1) arg0;
		Static129.aFloat77 = local13.aFloat24 * local22.aFloat22 + local13.aFloat13 * local22.aFloat16 + local22.aFloat15 * local13.aFloat22;
		Static578.aFloat240 = local13.aFloat20 + local22.aFloat18 * local13.aFloat13 + local13.aFloat22 * local22.aFloat19 + local22.aFloat20 * local13.aFloat24;
		@Pc(69) float local69 = Static129.aFloat77 * (float) this.anInt7074 + Static578.aFloat240;
		@Pc(77) float local77 = Static578.aFloat240 + (float) this.anInt7035 * Static129.aFloat77;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local93 = local77 - (float) this.anInt7080;
			local87 = (float) this.anInt7080 + local69;
		} else {
			local87 = (float) this.anInt7080 + local77;
			local93 = local69 - (float) this.anInt7080;
		}
		if (local93 >= this.aClass78_Sub1_14.aFloat222 || local87 <= (float) this.aClass78_Sub1_14.anInt8591) {
			return;
		}
		Static294.aFloat133 = local13.aFloat14 * local22.aFloat20 + local13.aFloat17 * local22.aFloat18 + local13.aFloat16 * local22.aFloat19 + local13.aFloat18;
		Static299.aFloat156 = local22.aFloat22 * local13.aFloat14 + local13.aFloat16 * local22.aFloat15 + local13.aFloat17 * local22.aFloat16;
		@Pc(169) float local169 = Static299.aFloat156 * (float) this.anInt7074 + Static294.aFloat133;
		@Pc(177) float local177 = (float) this.anInt7035 * Static299.aFloat156 + Static294.aFloat133;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local169 > local177) {
			local204 = (float) this.aClass78_Sub1_14.anInt8590 * (local169 + (float) this.anInt7080);
			local193 = (float) this.aClass78_Sub1_14.anInt8590 * ((float) -this.anInt7080 + local177);
		} else {
			local193 = ((float) -this.anInt7080 + local169) * (float) this.aClass78_Sub1_14.anInt8590;
			local204 = (local177 + (float) this.anInt7080) * (float) this.aClass78_Sub1_14.anInt8590;
		}
		if (local193 / (float) arg2 >= this.aClass78_Sub1_14.aFloat211 || local204 / (float) arg2 <= this.aClass78_Sub1_14.aFloat210) {
			return;
		}
		Static386.aFloat183 = local22.aFloat16 * local13.aFloat21 + local22.aFloat15 * local13.aFloat15 + local22.aFloat22 * local13.aFloat23;
		Static313.aFloat157 = local22.aFloat20 * local13.aFloat23 + local13.aFloat21 * local22.aFloat18 + local13.aFloat15 * local22.aFloat19 + local13.aFloat19;
		@Pc(296) float local296 = Static386.aFloat183 * (float) this.anInt7074 + Static313.aFloat157;
		@Pc(304) float local304 = Static313.aFloat157 + (float) this.anInt7035 * Static386.aFloat183;
		@Pc(319) float local319;
		@Pc(330) float local330;
		if (local296 > local304) {
			local319 = (float) this.aClass78_Sub1_14.anInt8567 * (local304 - (float) this.anInt7080);
			local330 = ((float) this.anInt7080 + local296) * (float) this.aClass78_Sub1_14.anInt8567;
		} else {
			local319 = (float) this.aClass78_Sub1_14.anInt8567 * (local296 - (float) this.anInt7080);
			local330 = (local304 + (float) this.anInt7080) * (float) this.aClass78_Sub1_14.anInt8567;
		}
		if (local319 / (float) arg2 >= this.aClass78_Sub1_14.aFloat212 || this.aClass78_Sub1_14.aFloat224 >= local330 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass95Array1 != null) {
			Static268.aFloat129 = local13.aFloat23 * local22.aFloat24 + local22.aFloat14 * local13.aFloat21 + local22.aFloat23 * local13.aFloat15;
			Static566.aFloat237 = local22.aFloat24 * local13.aFloat14 + local13.aFloat17 * local22.aFloat14 + local22.aFloat23 * local13.aFloat16;
			Static172.aFloat91 = local22.aFloat13 * local13.aFloat24 + local13.aFloat13 * local22.aFloat17 + local22.aFloat21 * local13.aFloat22;
			Static184.aFloat94 = local22.aFloat13 * local13.aFloat14 + local22.aFloat21 * local13.aFloat16 + local13.aFloat17 * local22.aFloat17;
			Static100.aFloat40 = local13.aFloat22 * local22.aFloat23 + local22.aFloat14 * local13.aFloat13 + local22.aFloat24 * local13.aFloat24;
			Static265.aFloat127 = local22.aFloat13 * local13.aFloat23 + local22.aFloat17 * local13.aFloat21 + local13.aFloat15 * local22.aFloat21;
		}
		if (arg1 != null) {
			@Pc(497) int local497 = this.anInt7072 + this.anInt7092 >> 1;
			@Pc(505) int local505 = this.anInt7111 + this.anInt7040 >> 1;
			@Pc(524) int local524 = (int) (Static566.aFloat237 * (float) local505 + Static299.aFloat156 * (float) this.anInt7074 + Static294.aFloat133 + (float) local497 * Static184.aFloat94);
			@Pc(543) int local543 = (int) (Static268.aFloat129 * (float) local505 + Static386.aFloat183 * (float) this.anInt7074 + Static265.aFloat127 * (float) local497 + Static313.aFloat157);
			@Pc(562) int local562 = (int) (Static100.aFloat40 * (float) local505 + (float) local497 * Static172.aFloat91 + Static578.aFloat240 + Static129.aFloat77 * (float) this.anInt7074);
			@Pc(581) int local581 = (int) ((float) local497 * Static184.aFloat94 + Static294.aFloat133 + Static299.aFloat156 * (float) this.anInt7035 + (float) local505 * Static566.aFloat237);
			@Pc(600) int local600 = (int) ((float) this.anInt7035 * Static386.aFloat183 + (float) local497 * Static265.aFloat127 + Static313.aFloat157 + (float) local505 * Static268.aFloat129);
			@Pc(619) int local619 = (int) ((float) local505 * Static100.aFloat40 + Static578.aFloat240 + (float) local497 * Static172.aFloat91 + Static129.aFloat77 * (float) this.anInt7035);
			arg1.anInt2554 = this.aClass78_Sub1_14.anInt8567 * local543 / arg2 + this.aClass78_Sub1_14.anInt8588;
			arg1.anInt2556 = this.aClass78_Sub1_14.anInt8589 + this.aClass78_Sub1_14.anInt8590 * local524 / arg2;
			arg1.anInt2558 = this.aClass78_Sub1_14.anInt8589 + local581 * this.aClass78_Sub1_14.anInt8590 / arg2;
			arg1.anInt2557 = this.aClass78_Sub1_14.anInt8588 + this.aClass78_Sub1_14.anInt8567 * local600 / arg2;
			if (local562 >= this.aClass78_Sub1_14.anInt8591 || this.aClass78_Sub1_14.anInt8591 <= local619) {
				arg1.anInt2555 = (this.anInt7080 + local524) * this.aClass78_Sub1_14.anInt8590 / arg2 + this.aClass78_Sub1_14.anInt8589 - arg1.anInt2556;
				arg1.aBoolean195 = true;
			}
		}
		this.aClass78_Sub1_14.method6976((float) arg2);
		this.aClass78_Sub1_14.method6969();
		this.aClass78_Sub1_14.method6876(local22);
		this.method5699();
		this.method5712();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7097; local7++) {
			local16 = this.aShortArray88[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 -= -(arg3 * (arg1 - local28) >> 7);
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray88[local7] = (short) (local22 << 10 | local28 << 7 | local32);
		}
		if (this.aClass95Array1 != null) {
			for (local16 = 0; local16 < this.anInt7051; local16++) {
				@Pc(106) Class95 local106 = this.aClass95Array1[local16];
				@Pc(111) Class201 local111 = this.aClass201Array1[local16];
				local111.anInt5270 = Static226.anIntArray212[this.aShortArray88[local106.anInt2665] & 0xFFFF] & 0xFFFFFF | local111.anInt5270 & 0xFF000000;
			}
		}
		this.method5709();
	}

	@OriginalMember(owner = "client!pea", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass47_4 != null) {
			this.aClass47_4.aBoolean85 = Static48.method6683(this.anInt7062, arg0);
		}
		if (this.aClass47_3 != null) {
			this.aClass47_3.aBoolean85 = Static177.method7120(this.anInt7062, arg0);
		}
		if (this.aClass47_1 != null) {
			this.aClass47_1.aBoolean85 = Static391.method5620(this.anInt7062, arg0);
		}
		if (this.aClass47_2 != null) {
			this.aClass47_2.aBoolean85 = Static110.method1522(arg0, this.anInt7062);
		}
		this.anInt7057 = arg0;
		if (this.aClass344_1 != null && (this.anInt7057 & 0x10000) == 0) {
			this.aShortArray79 = this.aClass344_1.aShortArray133;
			this.aShortArray85 = this.aClass344_1.aShortArray135;
			this.aByteArray70 = this.aClass344_1.aByteArray92;
			this.aShortArray82 = this.aClass344_1.aShortArray134;
			this.aClass344_1 = null;
		}
		this.aBoolean541 = true;
		this.method5702();
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(B)V")
	private void method5706() {
		if (this.aClass190_1 != null) {
			this.aClass190_1.aBoolean371 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean543) {
			this.method5710();
		}
		return this.anInt7092;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIBIIIIII)Z")
	private boolean method5707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > arg2 && arg2 < arg7 && arg2 < arg5) {
			return false;
		} else if (arg2 > arg3 && arg2 > arg7 && arg5 < arg2) {
			return false;
		} else if (arg0 < arg4 && arg0 < arg6 && arg0 < arg1) {
			return false;
		} else {
			return arg0 <= arg4 || arg0 <= arg6 || arg1 >= arg0;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7410(@OriginalArg(0) Class34 arg0) {
		@Pc(8) Class34_Sub1 local8 = (Class34_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass244Array3 != null) {
			for (local13 = 0; local13 < this.aClass244Array3.length; local13++) {
				@Pc(20) Class244 local20 = this.aClass244Array3[local13];
				@Pc(22) Class244 local22 = local20;
				if (local20.aClass244_2 != null) {
					local22 = local20.aClass244_2;
				}
				local22.anInt6536 = (int) (local8.aFloat18 + (float) this.anIntArray417[local20.anInt6527] * local8.aFloat14 + (float) this.anIntArray419[local20.anInt6527] * local8.aFloat17 + local8.aFloat16 * (float) this.anIntArray414[local20.anInt6527]);
				local22.anInt6534 = (int) ((float) this.anIntArray419[local20.anInt6527] * local8.aFloat21 + local8.aFloat15 * (float) this.anIntArray414[local20.anInt6527] + (float) this.anIntArray417[local20.anInt6527] * local8.aFloat23 + local8.aFloat19);
				local22.anInt6537 = (int) (local8.aFloat20 + (float) this.anIntArray417[local20.anInt6527] * local8.aFloat24 + local8.aFloat13 * (float) this.anIntArray419[local20.anInt6527] + (float) this.anIntArray414[local20.anInt6527] * local8.aFloat22);
				local22.anInt6525 = (int) (local8.aFloat18 + local8.aFloat14 * (float) this.anIntArray417[local20.anInt6532] + (float) this.anIntArray414[local20.anInt6532] * local8.aFloat16 + local8.aFloat17 * (float) this.anIntArray419[local20.anInt6532]);
				local22.anInt6529 = (int) (local8.aFloat19 + (float) this.anIntArray419[local20.anInt6532] * local8.aFloat21 + local8.aFloat15 * (float) this.anIntArray414[local20.anInt6532] + local8.aFloat23 * (float) this.anIntArray417[local20.anInt6532]);
				local22.anInt6533 = (int) (local8.aFloat13 * (float) this.anIntArray419[local20.anInt6532] + local8.aFloat22 * (float) this.anIntArray414[local20.anInt6532] + (float) this.anIntArray417[local20.anInt6532] * local8.aFloat24 + local8.aFloat20);
				local22.anInt6531 = (int) (local8.aFloat17 * (float) this.anIntArray419[local20.anInt6530] + local8.aFloat16 * (float) this.anIntArray414[local20.anInt6530] + local8.aFloat14 * (float) this.anIntArray417[local20.anInt6530] + local8.aFloat18);
				local22.anInt6524 = (int) (local8.aFloat23 * (float) this.anIntArray417[local20.anInt6530] + (float) this.anIntArray414[local20.anInt6530] * local8.aFloat15 + local8.aFloat21 * (float) this.anIntArray419[local20.anInt6530] + local8.aFloat19);
				local22.anInt6535 = (int) (local8.aFloat24 * (float) this.anIntArray417[local20.anInt6530] + (float) this.anIntArray419[local20.anInt6530] * local8.aFloat13 + local8.aFloat22 * (float) this.anIntArray414[local20.anInt6530] + local8.aFloat20);
			}
		}
		if (this.aClass212Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass212Array3.length; local13++) {
			@Pc(365) Class212 local365 = this.aClass212Array3[local13];
			@Pc(367) Class212 local367 = local365;
			if (local365.aClass212_1 != null) {
				local367 = local365.aClass212_1;
			}
			if (local365.aClass34_4 == null) {
				local365.aClass34_4 = local8.method6215();
			} else {
				local365.aClass34_4.M(local8);
			}
			local367.anInt5651 = (int) ((float) this.anIntArray417[local365.anInt5656] * local8.aFloat14 + (float) this.anIntArray419[local365.anInt5656] * local8.aFloat17 + (float) this.anIntArray414[local365.anInt5656] * local8.aFloat16 + local8.aFloat18);
			local367.anInt5653 = (int) (local8.aFloat19 + local8.aFloat23 * (float) this.anIntArray417[local365.anInt5656] + (float) this.anIntArray419[local365.anInt5656] * local8.aFloat21 + (float) this.anIntArray414[local365.anInt5656] * local8.aFloat15);
			local367.anInt5655 = (int) (local8.aFloat20 + (float) this.anIntArray417[local365.anInt5656] * local8.aFloat24 + (float) this.anIntArray419[local365.anInt5656] * local8.aFloat13 + (float) this.anIntArray414[local365.anInt5656] * local8.aFloat22);
		}
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(I)V")
	private void method5708() {
		if (this.aClass47_4 != null) {
			this.aClass47_4.aBoolean86 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "()[Lclient!lp;")
	@Override
	public Class212[] method7395() {
		return this.aClass212Array3;
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(I)V")
	private void method5709() {
		if (this.aClass47_1 != null) {
			this.aClass47_1.aBoolean86 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort80;
	}

	@OriginalMember(owner = "client!pea", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class85_Sub8.anIntArray426[arg0];
		@Pc(13) int local13 = Class85_Sub8.anIntArray427[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7073; local15++) {
			@Pc(33) int local33 = this.anIntArray419[local15] * local13 + this.anIntArray417[local15] * local9 >> 14;
			this.anIntArray417[local15] = local13 * this.anIntArray417[local15] - local9 * this.anIntArray419[local15] >> 14;
			this.anIntArray419[local15] = local33;
		}
		this.method5708();
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "()Z")
	@Override
	public boolean method7409() {
		if (this.aShortArray83 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray83.length; local12++) {
			if (this.aShortArray83[local12] != -1 && !this.aClass78_Sub1_14.anInterface9_13.method949(this.aShortArray83[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static173.anInt3245 = 0;
			Static524.anInt1391 = 0;
			local16 = 0;
			Static536.anInt8992 = 0;
			for (local20 = 0; local20 < this.anInt7073; local20++) {
				Static173.anInt3245 += this.anIntArray419[local20];
				Static524.anInt1391 += this.anIntArray414[local20];
				local16++;
				Static536.anInt8992 += this.anIntArray417[local20];
			}
			if (local16 > 0) {
				Static524.anInt1391 = arg2 + Static524.anInt1391 / local16;
				Static536.anInt8992 = Static536.anInt8992 / local16 + arg3;
				Static173.anInt3245 = Static173.anInt3245 / local16 + arg1;
			} else {
				Static524.anInt1391 = arg2;
				Static536.anInt8992 = arg3;
				Static173.anInt3245 = arg1;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt7073; local16++) {
				this.anIntArray419[local16] += arg1;
				this.anIntArray414[local16] += arg2;
				this.anIntArray417[local16] += arg3;
			}
		} else {
			@Pc(165) int local165;
			@Pc(183) int local183;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt7073; local16++) {
					this.anIntArray419[local16] -= Static173.anInt3245;
					this.anIntArray414[local16] -= Static524.anInt1391;
					this.anIntArray417[local16] -= Static536.anInt8992;
					if (arg3 != 0) {
						local20 = Class85_Sub8.anIntArray426[arg3];
						local165 = Class85_Sub8.anIntArray427[arg3];
						local183 = this.anIntArray414[local16] * local20 + this.anIntArray419[local16] * local165 + 16383 >> 14;
						this.anIntArray414[local16] = this.anIntArray414[local16] * local165 + 16383 - local20 * this.anIntArray419[local16] >> 14;
						this.anIntArray419[local16] = local183;
					}
					if (arg1 != 0) {
						local20 = Class85_Sub8.anIntArray426[arg1];
						local165 = Class85_Sub8.anIntArray427[arg1];
						local183 = local165 * this.anIntArray414[local16] + 16383 - local20 * this.anIntArray417[local16] >> 14;
						this.anIntArray417[local16] = this.anIntArray414[local16] * local20 + this.anIntArray417[local16] * local165 + 16383 >> 14;
						this.anIntArray414[local16] = local183;
					}
					if (arg2 != 0) {
						local20 = Class85_Sub8.anIntArray426[arg2];
						local165 = Class85_Sub8.anIntArray427[arg2];
						local183 = local20 * this.anIntArray417[local16] + this.anIntArray419[local16] * local165 + 16383 >> 14;
						this.anIntArray417[local16] = this.anIntArray417[local16] * local165 + 16383 - this.anIntArray419[local16] * local20 >> 14;
						this.anIntArray419[local16] = local183;
					}
					this.anIntArray419[local16] += Static173.anInt3245;
					this.anIntArray414[local16] += Static524.anInt1391;
					this.anIntArray417[local16] += Static536.anInt8992;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt7073; local16++) {
					this.anIntArray419[local16] -= Static173.anInt3245;
					this.anIntArray414[local16] -= Static524.anInt1391;
					this.anIntArray417[local16] -= Static536.anInt8992;
					this.anIntArray419[local16] = arg1 * this.anIntArray419[local16] / 128;
					this.anIntArray414[local16] = arg2 * this.anIntArray414[local16] / 128;
					this.anIntArray417[local16] = arg3 * this.anIntArray417[local16] / 128;
					this.anIntArray419[local16] += Static173.anInt3245;
					this.anIntArray414[local16] += Static524.anInt1391;
					this.anIntArray417[local16] += Static536.anInt8992;
				}
			} else {
				@Pc(518) Class95 local518;
				@Pc(523) Class201 local523;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt7097; local16++) {
						local20 = (this.aByteArray69[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray69[local16] = (byte) local20;
					}
					if (this.aClass95Array1 != null) {
						for (local20 = 0; local20 < this.anInt7051; local20++) {
							local518 = this.aClass95Array1[local20];
							local523 = this.aClass201Array1[local20];
							local523.anInt5270 = local523.anInt5270 & 0xFFFFFF | 255 - (this.aByteArray69[local518.anInt2665] & 0xFF) << 24;
						}
					}
					this.method5709();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt7097; local16++) {
						local20 = this.aShortArray88[local16] & 0xFFFF;
						local165 = local20 >> 10 & 0x3F;
						local183 = local20 >> 7 & 0x7;
						@Pc(585) int local585 = local20 & 0x7F;
						local183 += arg2 / 4;
						@Pc(597) int local597 = local165 + arg1 & 0x3F;
						local585 += arg3;
						if (local183 < 0) {
							local183 = 0;
						} else if (local183 > 7) {
							local183 = 7;
						}
						if (local585 < 0) {
							local585 = 0;
						} else if (local585 > 127) {
							local585 = 127;
						}
						this.aShortArray88[local16] = (short) (local585 | local597 << 10 | local183 << 7);
					}
					if (this.aClass95Array1 != null) {
						for (local20 = 0; local20 < this.anInt7051; local20++) {
							local518 = this.aClass95Array1[local20];
							local523 = this.aClass201Array1[local20];
							local523.anInt5270 = local523.anInt5270 & 0xFF000000 | Static226.anIntArray212[this.aShortArray88[local518.anInt2665] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5709();
				} else {
					@Pc(712) Class201 local712;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt7051; local16++) {
							local712 = this.aClass201Array1[local16];
							local712.anInt5266 += arg2;
							local712.anInt5268 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt7051; local16++) {
							local712 = this.aClass201Array1[local16];
							local712.anInt5274 = local712.anInt5274 * arg2 >> 7;
							local712.anInt5272 = local712.anInt5272 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt7051; local16++) {
							local712 = this.aClass201Array1[local16];
							local712.anInt5267 = arg1 + local712.anInt5267 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "(I)V")
	private void method5710() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt7073; local31++) {
			@Pc(38) int local38 = this.anIntArray419[local31];
			@Pc(43) int local43 = this.anIntArray414[local31];
			if (local9 > local43) {
				local9 = local43;
			}
			if (local43 > local15) {
				local15 = local43;
			}
			if (local13 < local38) {
				local13 = local38;
			}
			if (local7 > local38) {
				local7 = local38;
			}
			@Pc(84) int local84 = this.anIntArray417[local31];
			if (local11 > local84) {
				local11 = local84;
			}
			if (local17 < local84) {
				local17 = local84;
			}
			@Pc(106) int local106 = local38 * local38 + local84 * local84;
			if (local106 > local27) {
				local27 = local106;
			}
			local106 = local38 * local38 + local84 * local84 + local43 * local43;
			if (local106 > local29) {
				local29 = local106;
			}
		}
		this.anInt7040 = local11;
		this.anInt7072 = local13;
		this.anInt7035 = local15;
		this.anInt7111 = local17;
		this.anInt7074 = local9;
		this.anInt7092 = local7;
		this.anInt7080 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.anInt7063 = (int) (Math.sqrt((double) local29) + 0.99D);
		this.aBoolean543 = true;
	}

	@OriginalMember(owner = "client!pea", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort79;
	}

	@OriginalMember(owner = "client!pea", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean542;
	}

	@OriginalMember(owner = "client!pea", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7073; local7++) {
			this.anIntArray417[local7] = -this.anIntArray417[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7105; local29++) {
			this.aShortArray79[local29] = (short) -this.aShortArray79[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt7097; local48++) {
			@Pc(55) short local55 = this.aShortArray80[local48];
			this.aShortArray80[local48] = this.aShortArray76[local48];
			this.aShortArray76[local48] = local55;
		}
		this.method5708();
		this.method5711();
		this.method5706();
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pea", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt7057;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "()V")
	@Override
	protected void method7393() {
	}

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "(I)V")
	private void method5711() {
		if ((this.anInt7062 & 0x37) == 0) {
			if (this.aClass47_1 != null) {
				this.aClass47_1.aBoolean86 = false;
			}
		} else if (this.aClass47_2 != null) {
			this.aClass47_2.aBoolean86 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3) {
		return this.method5698(arg1, arg3, arg2, arg0, -1);
	}

	@OriginalMember(owner = "client!pea", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface9 local9 = this.aClass78_Sub1_14.anInterface9_13;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7097; local11++) {
			if (this.aShortArray83[local11] == arg0) {
				this.aShortArray83[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class17 local47 = local9.method947(arg0 & 0xFFFF);
			local37 = local47.aByte17;
			local35 = local47.aByte21;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class17 local67 = local9.method947(arg1 & 0xFFFF);
			local55 = local67.aByte21;
			local57 = local67.aByte17;
		}
		if (!(local55 != local35 | local57 != local37)) {
			return;
		}
		if (this.aClass95Array1 != null) {
			for (@Pc(100) int local100 = 0; local100 < this.anInt7051; local100++) {
				@Pc(107) Class95 local107 = this.aClass95Array1[local100];
				@Pc(112) Class201 local112 = this.aClass201Array1[local100];
				local112.anInt5270 = local112.anInt5270 & 0xFF000000 | Static226.anIntArray212[this.aShortArray88[local107.anInt2665] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5709();
	}

	@OriginalMember(owner = "client!pea", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean543) {
			this.method5710();
		}
		return this.anInt7111;
	}

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "(I)V")
	private void method5712() {
		if (this.aClass95Array1 == null) {
			return;
		}
		this.aClass78_Sub1_14.ZA(!this.aBoolean542);
		this.aClass78_Sub1_14.method6949(false);
		this.aClass78_Sub1_14.method6975(Static276.aClass148_4, 1);
		this.aClass78_Sub1_14.method6903(1, Static276.aClass148_4);
		for (@Pc(36) int local36 = 0; local36 < this.anInt7051; local36++) {
			@Pc(43) Class95 local43 = this.aClass95Array1[local36];
			@Pc(48) Class201 local48 = this.aClass201Array1[local36];
			if (!local43.aBoolean202 || !this.aClass78_Sub1_14.method6802()) {
				@Pc(76) float local76 = (float) (this.anIntArray419[local43.anInt2661] + this.anIntArray419[local43.anInt2664] + this.anIntArray419[local43.anInt2662]) * 0.3333333F;
				@Pc(97) float local97 = (float) (this.anIntArray414[local43.anInt2662] + this.anIntArray414[local43.anInt2664] + this.anIntArray414[local43.anInt2661]) * 0.3333333F;
				@Pc(118) float local118 = (float) (this.anIntArray417[local43.anInt2662] + this.anIntArray417[local43.anInt2664] + this.anIntArray417[local43.anInt2661]) * 0.3333333F;
				@Pc(132) float local132 = Static294.aFloat133 + local118 * Static566.aFloat237 + local76 * Static184.aFloat94 + local97 * Static299.aFloat156;
				@Pc(146) float local146 = Static268.aFloat129 * local118 + Static265.aFloat127 * local76 + local97 * Static386.aFloat183 + Static313.aFloat157;
				@Pc(160) float local160 = Static578.aFloat240 + Static129.aFloat77 * local97 + Static172.aFloat91 * local76 + Static100.aFloat40 * local118;
				@Pc(165) Class34_Sub1 local165 = this.aClass78_Sub1_14.method6904();
				local165.method902((float) local48.anInt5268 + local132, local48.anInt5272 * local43.aShort32 >> 7, local48.anInt5274 * local43.aShort30 >> 7, local48.anInt5267, (float) local48.anInt5266 + local146, (float) -local43.anInt2663 + local160);
				local165.method889(this.aClass78_Sub1_14.aClass34_Sub1_17);
				this.aClass78_Sub1_14.method6895();
				@Pc(215) int local215 = local48.anInt5270;
				this.aClass78_Sub1_14.method6948(false, false, local43.aShort31);
				this.aClass78_Sub1_14.method6913(local43.aByte31);
				this.aClass78_Sub1_14.method6917(local215);
				this.aClass78_Sub1_14.method6870();
			}
		}
		this.aClass78_Sub1_14.method6903(1, Static226.aClass148_3);
		this.aClass78_Sub1_14.method6975(Static226.aClass148_3, 1);
		this.aClass78_Sub1_14.ZA(true);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class52 method7412(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class52_Sub2 local16;
		@Pc(12) Class52_Sub2 local12;
		if (arg0 == 1) {
			local12 = this.aClass78_Sub1_14.aClass52_Sub2_28;
			local16 = this.aClass78_Sub1_14.aClass52_Sub2_21;
		} else if (arg0 == 2) {
			local12 = this.aClass78_Sub1_14.aClass52_Sub2_27;
			local16 = this.aClass78_Sub1_14.aClass52_Sub2_22;
		} else if (arg0 == 3) {
			local16 = this.aClass78_Sub1_14.aClass52_Sub2_25;
			local12 = this.aClass78_Sub1_14.aClass52_Sub2_29;
		} else if (arg0 == 4) {
			local16 = this.aClass78_Sub1_14.aClass52_Sub2_24;
			local12 = this.aClass78_Sub1_14.aClass52_Sub2_30;
		} else if (arg0 == 5) {
			local16 = this.aClass78_Sub1_14.aClass52_Sub2_26;
			local12 = this.aClass78_Sub1_14.aClass52_Sub2_23;
		} else {
			local16 = local12 = new Class52_Sub2(this.aClass78_Sub1_14, 0, 0, true, false);
		}
		return this.method5696(arg0 != 0, arg2, local12, arg1, local16);
	}

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "(I)Z")
	private boolean method5713() {
		@Pc(13) boolean local13 = !this.aClass47_1.aBoolean86;
		@Pc(26) boolean local26 = (this.anInt7062 & 0x37) != 0 && !this.aClass47_2.aBoolean86;
		@Pc(34) boolean local34 = !this.aClass47_4.aBoolean86;
		@Pc(50) boolean local50 = !this.aClass47_3.aBoolean86;
		if (!local34 && !local13 && !local26 && !local50) {
			return true;
		}
		@Pc(62) boolean local62 = true;
		@Pc(81) Interface23 local81;
		@Pc(95) Buffer local95;
		if (local34) {
			if (this.aClass47_4.anInterface23_3 == null) {
				this.aClass47_4.anInterface23_3 = this.aClass78_Sub1_14.method6927(this.aBoolean540);
			}
			local81 = this.aClass47_4.anInterface23_3;
			local81.method5569(this.anInt7105 * 12, 12);
			local95 = local81.method5570();
			if (local95 == null) {
				local62 = false;
			} else {
				this.aClass78_Sub1_14.aNativeInterface3.copyPositions(this.anIntArray419, this.anIntArray414, this.anIntArray417, this.aShortArray78, 0, 12, this.anInt7105, local95.getAddress());
				if (local81.method5572()) {
					this.aClass47_4.aBoolean86 = true;
					this.aClass47_4.anInterface23_2 = local81;
				} else {
					local62 = false;
				}
			}
		}
		@Pc(190) short[] local190;
		@Pc(193) short[] local193;
		@Pc(187) short[] local187;
		@Pc(184) byte[] local184;
		if (local13) {
			if (this.aClass47_1.anInterface23_3 == null) {
				this.aClass47_1.anInterface23_3 = this.aClass78_Sub1_14.method6927(this.aBoolean540);
			}
			local81 = this.aClass47_1.anInterface23_3;
			local81.method5569(this.anInt7105 * 4, 4);
			local95 = local81.method5570();
			if (local95 == null) {
				local62 = false;
			} else {
				if ((this.anInt7062 & 0x37) == 0) {
					if (this.aClass344_1 == null) {
						local184 = this.aByteArray70;
						local187 = this.aShortArray79;
						local190 = this.aShortArray82;
						local193 = this.aShortArray85;
					} else {
						local187 = this.aClass344_1.aShortArray133;
						local190 = this.aClass344_1.aShortArray134;
						local184 = this.aClass344_1.aByteArray92;
						local193 = this.aClass344_1.aShortArray135;
					}
					this.aClass78_Sub1_14.aNativeInterface3.copyLighting(this.aShortArray88, this.aByteArray69, this.aShortArray83, local190, local193, local187, local184, this.aShort79, this.aShort80, this.aShortArray81, 0, 4, this.anInt7105, local95.getAddress());
				} else {
					this.aClass78_Sub1_14.aNativeInterface3.copyColours(this.aShortArray88, this.aByteArray69, this.aShortArray83, this.aShort79, this.aShortArray81, 0, 4, this.anInt7105, local95.getAddress());
				}
				if (local81.method5572()) {
					this.aClass47_1.aBoolean86 = true;
					this.aClass47_1.anInterface23_2 = local81;
				} else {
					local62 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass47_2.anInterface23_3 == null) {
				this.aClass47_2.anInterface23_3 = this.aClass78_Sub1_14.method6927(this.aBoolean540);
			}
			local81 = this.aClass47_2.anInterface23_3;
			local81.method5569(this.anInt7105 * 12, 12);
			local95 = local81.method5570();
			if (local95 == null) {
				local62 = false;
			} else {
				if (this.aClass344_1 == null) {
					local187 = this.aShortArray79;
					local193 = this.aShortArray85;
					local184 = this.aByteArray70;
					local190 = this.aShortArray82;
				} else {
					local187 = this.aClass344_1.aShortArray133;
					local193 = this.aClass344_1.aShortArray135;
					local184 = this.aClass344_1.aByteArray92;
					local190 = this.aClass344_1.aShortArray134;
				}
				this.aClass78_Sub1_14.aNativeInterface3.copyNormals(local190, local193, local187, local184, 3.0F / (float) this.aShort80, 3.0F / (float) (this.aShort80 / 2 + this.aShort80), 0, 12, this.anInt7105, local95.getAddress());
				if (local81.method5572()) {
					this.aClass47_2.aBoolean86 = true;
					this.aClass47_2.anInterface23_2 = local81;
				} else {
					local62 = false;
				}
			}
		}
		if (local50) {
			if (this.aClass47_3.anInterface23_3 == null) {
				this.aClass47_3.anInterface23_3 = this.aClass78_Sub1_14.method6927(this.aBoolean540);
			}
			local81 = this.aClass47_3.anInterface23_3;
			local81.method5569(this.anInt7105 * 8, 8);
			local95 = local81.method5570();
			if (local95 == null) {
				local62 = false;
			} else {
				this.aClass78_Sub1_14.aNativeInterface3.copyTexCoords(this.aFloatArray61, this.aFloatArray60, 0, 8, this.anInt7105, local95.getAddress());
				if (local81.method5572()) {
					this.aClass47_3.anInterface23_2 = local81;
					this.aClass47_3.aBoolean86 = true;
				} else {
					local62 = false;
				}
			}
		}
		return local62;
	}
}
