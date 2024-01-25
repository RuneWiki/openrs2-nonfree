import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class145_Sub3 extends Class145 {

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Lclient!re;")
	private final Class122_Sub2 aClass122_Sub2_18;

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "Lclient!ii;")
	private Class137 aClass137_1;

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
	private int anInt8071;

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "Z")
	private boolean aBoolean567;

	@OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
	private int anInt8076;

	@OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
	private int anInt8081;

	@OriginalMember(owner = "client!uf", name = "bb", descriptor = "Lclient!kt;")
	private Class173 aClass173_1;

	@OriginalMember(owner = "client!uf", name = "ib", descriptor = "Lclient!kt;")
	private Class173 aClass173_2;

	@OriginalMember(owner = "client!uf", name = "rb", descriptor = "I")
	private int anInt8098;

	@OriginalMember(owner = "client!uf", name = "sb", descriptor = "Lclient!kt;")
	private Class173 aClass173_3;

	@OriginalMember(owner = "client!uf", name = "vb", descriptor = "I")
	private int anInt8100;

	@OriginalMember(owner = "client!uf", name = "Eb", descriptor = "I")
	private int anInt8106;

	@OriginalMember(owner = "client!uf", name = "Kb", descriptor = "Z")
	private boolean aBoolean568;

	@OriginalMember(owner = "client!uf", name = "Mb", descriptor = "I")
	private int anInt8110;

	@OriginalMember(owner = "client!uf", name = "Rb", descriptor = "I")
	private int anInt8112;

	@OriginalMember(owner = "client!uf", name = "Sb", descriptor = "Lclient!td;")
	private Class281 aClass281_1;

	@OriginalMember(owner = "client!uf", name = "Tb", descriptor = "I")
	private int anInt8113;

	@OriginalMember(owner = "client!uf", name = "Ub", descriptor = "Lclient!kt;")
	private Class173 aClass173_4;

	@OriginalMember(owner = "client!uf", name = "cc", descriptor = "I")
	private int anInt8120;

	@OriginalMember(owner = "client!uf", name = "kc", descriptor = "Z")
	private boolean aBoolean569;

	@OriginalMember(owner = "client!uf", name = "Gb", descriptor = "[I")
	private int[] anIntArray756;

	@OriginalMember(owner = "client!uf", name = "wb", descriptor = "I")
	private int anInt8101;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
	private int anInt8077;

	@OriginalMember(owner = "client!uf", name = "hb", descriptor = "[I")
	private int[] anIntArray755;

	@OriginalMember(owner = "client!uf", name = "Xb", descriptor = "I")
	private int anInt8116;

	@OriginalMember(owner = "client!uf", name = "ob", descriptor = "I")
	private int anInt8095;

	@OriginalMember(owner = "client!uf", name = "Ob", descriptor = "[I")
	private int[] anIntArray757;

	@OriginalMember(owner = "client!uf", name = "S", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!uf", name = "ab", descriptor = "[I")
	private int[] anIntArray754;

	@OriginalMember(owner = "client!uf", name = "ic", descriptor = "[Lclient!kca;")
	private Class161[] aClass161Array7;

	@OriginalMember(owner = "client!uf", name = "db", descriptor = "[Lclient!fi;")
	private Class93[] aClass93Array7;

	@OriginalMember(owner = "client!uf", name = "jc", descriptor = "I")
	private int anInt8125;

	@OriginalMember(owner = "client!uf", name = "xc", descriptor = "[Lclient!sc;")
	private Class265[] aClass265Array1;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "[Lclient!lba;")
	private Class178[] aClass178Array1;

	@OriginalMember(owner = "client!uf", name = "Qb", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!uf", name = "vc", descriptor = "[F")
	private float[] aFloatArray61;

	@OriginalMember(owner = "client!uf", name = "uc", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!uf", name = "Lb", descriptor = "S")
	private short aShort129;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!uf", name = "Db", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!uf", name = "yc", descriptor = "[S")
	private short[] aShortArray143;

	@OriginalMember(owner = "client!uf", name = "kb", descriptor = "[B")
	private byte[] aByteArray115;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!uf", name = "O", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!uf", name = "ec", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!uf", name = "jb", descriptor = "[F")
	private float[] aFloatArray60;

	@OriginalMember(owner = "client!uf", name = "ub", descriptor = "[S")
	private short[] aShortArray136;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "S")
	private short aShort128;

	@OriginalMember(owner = "client!uf", name = "cb", descriptor = "[B")
	private byte[] aByteArray114;

	@OriginalMember(owner = "client!uf", name = "Bb", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!uf", name = "zb", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!uf", name = "R", descriptor = "[I")
	private int[] anIntArray753;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "[I")
	private int[] anIntArray752;

	@OriginalMember(owner = "client!uf", name = "Ac", descriptor = "[I")
	private int[] anIntArray758;

	@OriginalMember(owner = "client!uf", name = "Nb", descriptor = "[[I")
	private int[][] anIntArrayArray108;

	@OriginalMember(owner = "client!uf", name = "Fb", descriptor = "[[I")
	private int[][] anIntArrayArray107;

	@OriginalMember(owner = "client!uf", name = "lb", descriptor = "[[I")
	private int[][] lb;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!re;Lclient!fp;IIII)V")
	public Class145_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface8 local11 = arg0.anInterface8_14;
		this.anIntArray756 = new int[arg1.anInt2715 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt2727];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt2727; local24++) {
			if ((arg1.aByteArray39 == null || arg1.aByteArray39[local24] != 2) && (arg1.aShortArray47 == null || arg1.aShortArray47[local24] == -1 || !local11.method878(arg1.aShortArray47[local24] & 0xFFFF).aBoolean448)) {
				local22[this.anInt8101++] = local24;
				this.anIntArray756[arg1.aShortArray45[local24]]++;
				this.anIntArray756[arg1.aShortArray42[local24]]++;
				this.anIntArray756[arg1.aShortArray40[local24]]++;
			}
		}
		this.anInt8077 = this.anInt8101;
		@Pc(111) long[] local111 = new long[this.anInt8101];
		@Pc(120) boolean local120 = (this.anInt8081 & 0x100) != 0;
		@Pc(132) int local132;
		@Pc(143) int local143;
		@Pc(268) int local268;
		label500: for (@Pc(122) int local122 = 0; local122 < this.anInt8101; local122++) {
			@Pc(128) int local128 = local22[local122];
			@Pc(130) Class220 local130 = null;
			local132 = 0;
			@Pc(134) byte local134 = 0;
			@Pc(136) byte local136 = 0;
			@Pc(138) byte local138 = 0;
			if (arg1.aClass208Array1 != null) {
				for (local143 = 0; local143 < arg1.aClass208Array1.length; local143++) {
					@Pc(150) Class208 local150 = arg1.aClass208Array1[local143];
					if (local150.anInt5962 == local128) {
						@Pc(163) Class125 local163 = Static177.method2903(local150.anInt5964);
						if (local163.aBoolean230) {
							local111[local122] = Long.MAX_VALUE;
							this.anInt8077--;
							continue label500;
						}
					}
				}
			}
			@Pc(186) short local186 = -1;
			if (arg1.aShortArray47 != null) {
				local186 = arg1.aShortArray47[local128];
				if (local186 != -1) {
					local130 = local11.method878(local186 & 0xFFFF);
					local136 = local130.aByte87;
					local138 = local130.aByte86;
				}
			}
			@Pc(230) boolean local230 = arg1.aByteArray33 != null && arg1.aByteArray33[local128] != 0 || local130 != null && !local130.aBoolean449;
			if ((local120 || local230) && arg1.aByteArray38 != null) {
				local132 += arg1.aByteArray38[local128] << 17;
			}
			if (local230) {
				local132 += 65536;
			}
			local132 += (local136 & 0xFF) << 8;
			local268 = local134 + ((local186 & 0xFFFF) << 16);
			local132 += local138 & 0xFF;
			@Pc(280) int local280 = local268 + (local122 & 0xFFFF);
			local111[local122] = (long) local280 + ((long) local132 << 32);
		}
		Static165.method2543(local111, local22);
		this.anIntArray755 = arg1.anIntArray261;
		this.anInt8116 = arg1.anInt2729;
		this.anInt8095 = arg1.anInt2715;
		this.anIntArray757 = arg1.anIntArray264;
		this.aShortArray135 = arg1.aShortArray43;
		this.anIntArray754 = arg1.anIntArray265;
		@Pc(331) Class188[] local331 = new Class188[this.anInt8095];
		this.aClass161Array7 = arg1.aClass161Array1;
		this.aClass93Array7 = arg1.aClass93Array1;
		@Pc(359) int local359;
		@Pc(373) int local373;
		if (arg1.aClass208Array1 != null) {
			this.anInt8125 = arg1.aClass208Array1.length;
			this.aClass265Array1 = new Class265[this.anInt8125];
			this.aClass178Array1 = new Class178[this.anInt8125];
			for (local359 = 0; local359 < this.anInt8125; local359++) {
				@Pc(366) Class208 local366 = arg1.aClass208Array1[local359];
				@Pc(371) Class125 local371 = Static177.method2903(local366.anInt5964);
				local373 = -1;
				for (@Pc(375) int local375 = 0; local375 < this.anInt8101; local375++) {
					if (local22[local375] == local366.anInt5962) {
						local373 = local375;
						break;
					}
				}
				if (local373 == -1) {
					throw new RuntimeException();
				}
				local143 = Static212.anIntArray347[arg1.aShortArray39[local366.anInt5962] & 0xFFFF] & 0xFFFFFF;
				local143 |= 255 - (arg1.aByteArray33 == null ? 0 : arg1.aByteArray33[local366.anInt5962]) << 24;
				this.aClass178Array1[local359] = new Class178(local373, arg1.aShortArray45[local366.anInt5962], arg1.aShortArray42[local366.anInt5962], arg1.aShortArray40[local366.anInt5962], local371.anInt3349, local371.anInt3354, local371.anInt3353, local371.anInt3350, local371.anInt3356, local371.aBoolean230, local371.aBoolean229, local366.anInt5963);
				this.aClass265Array1[local359] = new Class265(local143);
			}
		}
		local359 = this.anInt8101 * 3;
		this.aShortArray140 = new short[this.anInt8101];
		this.aFloatArray61 = new float[local359];
		this.aShortArray142 = new short[local359];
		this.aShortArray131 = new short[this.anInt8101];
		this.aShort129 = (short) arg4;
		this.aShortArray133 = new short[local359];
		this.aShortArray139 = new short[this.anInt8101];
		if (arg1.aShortArray41 != null) {
			this.aShortArray143 = new short[this.anInt8101];
		}
		this.aByteArray115 = new byte[this.anInt8101];
		this.aShortArray132 = new short[this.anInt8101];
		this.aShortArray134 = new short[local359];
		this.aShortArray141 = new short[this.anInt8101];
		this.aFloatArray60 = new float[local359];
		this.aShortArray136 = new short[local359];
		this.aShort128 = (short) arg3;
		this.aByteArray114 = new byte[local359];
		this.aShortArray138 = new short[local359];
		Static74.aLongArray3 = new long[local359];
		this.aShortArray137 = new short[local359];
		local132 = 0;
		for (local268 = 0; local268 < arg1.anInt2715; local268++) {
			local373 = this.anIntArray756[local268];
			this.anIntArray756[local268] = local132;
			local331[local268] = new Class188();
			local132 += local373;
		}
		this.anIntArray756[arg1.anInt2715] = local132;
		@Pc(621) int[] local621 = null;
		@Pc(623) int[] local623 = null;
		@Pc(625) int[] local625 = null;
		@Pc(627) float[][] local627 = null;
		@Pc(645) int[] local645;
		@Pc(653) int local653;
		@Pc(689) int local689;
		@Pc(695) int local695;
		@Pc(709) int local709;
		@Pc(711) int local711;
		@Pc(744) int local744;
		@Pc(749) int local749;
		@Pc(919) float local919;
		@Pc(943) float local943;
		@Pc(917) float local917;
		if (arg1.aByteArray36 != null) {
			@Pc(633) int local633 = arg1.anInt2710;
			@Pc(636) int[] local636 = new int[local633];
			@Pc(639) int[] local639 = new int[local633];
			@Pc(642) int[] local642 = new int[local633];
			local645 = new int[local633];
			@Pc(648) int[] local648 = new int[local633];
			@Pc(651) int[] local651 = new int[local633];
			for (local653 = 0; local653 < local633; local653++) {
				local636[local653] = Integer.MAX_VALUE;
				local639[local653] = -2147483647;
				local642[local653] = Integer.MAX_VALUE;
				local645[local653] = -2147483647;
				local648[local653] = Integer.MAX_VALUE;
				local651[local653] = -2147483647;
			}
			for (local689 = 0; local689 < this.anInt8101; local689++) {
				local695 = local22[local689];
				if (arg1.aByteArray36[local695] != -1) {
					local709 = arg1.aByteArray36[local695] & 0xFF;
					for (local711 = 0; local711 < 3; local711++) {
						@Pc(720) short local720;
						if (local711 == 0) {
							local720 = arg1.aShortArray45[local695];
						} else if (local711 == 1) {
							local720 = arg1.aShortArray42[local695];
						} else {
							local720 = arg1.aShortArray40[local695];
						}
						local744 = arg1.anIntArray261[local720];
						local749 = arg1.anIntArray264[local720];
						@Pc(754) int local754 = arg1.anIntArray265[local720];
						if (local636[local709] > local744) {
							local636[local709] = local744;
						}
						if (local744 > local639[local709]) {
							local639[local709] = local744;
						}
						if (local749 < local642[local709]) {
							local642[local709] = local749;
						}
						if (local645[local709] < local749) {
							local645[local709] = local749;
						}
						if (local754 < local648[local709]) {
							local648[local709] = local754;
						}
						if (local754 > local651[local709]) {
							local651[local709] = local754;
						}
					}
				}
			}
			local623 = new int[local633];
			local627 = new float[local633][];
			local625 = new int[local633];
			local621 = new int[local633];
			for (local695 = 0; local695 < local633; local695++) {
				@Pc(852) byte local852 = arg1.aByteArray37[local695];
				if (local852 > 0) {
					local621[local695] = (local636[local695] + local639[local695]) / 2;
					local623[local695] = (local645[local695] + local642[local695]) / 2;
					local625[local695] = (local648[local695] + local651[local695]) / 2;
					if (local852 == 1) {
						local749 = arg1.anIntArray266[local695];
						if (local749 == 0) {
							local919 = 1.0F;
							local917 = 1.0F;
						} else if (local749 > 0) {
							local917 = (float) local749 / 1024.0F;
							local919 = 1.0F;
						} else {
							local917 = 1.0F;
							local919 = (float) -local749 / 1024.0F;
						}
						local943 = 64.0F / (float) arg1.anIntArray267[local695];
					} else if (local852 == 2) {
						local943 = 64.0F / (float) arg1.anIntArray267[local695];
						local917 = 64.0F / (float) arg1.anIntArray260[local695];
						local919 = 64.0F / (float) arg1.anIntArray266[local695];
					} else {
						local919 = (float) arg1.anIntArray266[local695] / 1024.0F;
						local917 = (float) arg1.anIntArray260[local695] / 1024.0F;
						local943 = (float) arg1.anIntArray267[local695] / 1024.0F;
					}
					local627[local695] = Static467.method6551(arg1.aShortArray46[local695], arg1.aByteArray34[local695] & 0xFF, arg1.aShortArray44[local695], local917, local943, local919, arg1.aShortArray38[local695]);
				}
			}
		}
		@Pc(1032) Class135[] local1032 = new Class135[arg1.anInt2727];
		@Pc(1051) short local1051;
		@Pc(1062) int local1062;
		@Pc(1073) int local1073;
		for (@Pc(1034) int local1034 = 0; local1034 < arg1.anInt2727; local1034++) {
			@Pc(1041) short local1041 = arg1.aShortArray45[local1034];
			@Pc(1046) short local1046 = arg1.aShortArray42[local1034];
			local1051 = arg1.aShortArray40[local1034];
			local1062 = this.anIntArray755[local1046] - this.anIntArray755[local1041];
			local1073 = this.anIntArray757[local1046] - this.anIntArray757[local1041];
			local653 = this.anIntArray754[local1046] - this.anIntArray754[local1041];
			local689 = this.anIntArray755[local1051] - this.anIntArray755[local1041];
			local695 = this.anIntArray757[local1051] - this.anIntArray757[local1041];
			local709 = this.anIntArray754[local1051] - this.anIntArray754[local1041];
			local711 = local1073 * local709 - local695 * local653;
			@Pc(1134) int local1134 = local689 * local653 - local709 * local1062;
			local744 = local695 * local1062 - local689 * local1073;
			while (local711 > 8192 || local1134 > 8192 || local744 > 8192 || local711 < -8192 || local1134 < -8192 || local744 < -8192) {
				local1134 >>= 0x1;
				local744 >>= 0x1;
				local711 >>= 0x1;
			}
			local749 = (int) Math.sqrt((double) (local744 * local744 + local711 * local711 + local1134 * local1134));
			if (local749 <= 0) {
				local749 = 1;
			}
			local744 = local744 * 256 / local749;
			local711 = local711 * 256 / local749;
			local1134 = local1134 * 256 / local749;
			@Pc(1226) byte local1226 = arg1.aByteArray39 == null ? 0 : arg1.aByteArray39[local1034];
			if (local1226 == 0) {
				@Pc(1232) Class188 local1232 = local331[local1041];
				local1232.anInt5422 += local1134;
				local1232.anInt5424 += local711;
				local1232.anInt5425++;
				local1232.anInt5426 += local744;
				@Pc(1260) Class188 local1260 = local331[local1046];
				local1260.anInt5424 += local711;
				local1260.anInt5425++;
				local1260.anInt5422 += local1134;
				local1260.anInt5426 += local744;
				@Pc(1288) Class188 local1288 = local331[local1051];
				local1288.anInt5426 += local744;
				local1288.anInt5422 += local1134;
				local1288.anInt5425++;
				local1288.anInt5424 += local711;
			} else if (local1226 == 1) {
				@Pc(1325) Class135 local1325 = local1032[local1034] = new Class135();
				local1325.anInt4019 = local711;
				local1325.anInt4016 = local744;
				local1325.anInt4015 = local1134;
			}
		}
		@Pc(1351) int local1351;
		for (@Pc(1345) int local1345 = 0; local1345 < this.anInt8101; local1345++) {
			local1351 = local22[local1345];
			@Pc(1358) int local1358 = arg1.aShortArray39[local1351] & 0xFFFF;
			@Pc(1366) short local1366;
			if (arg1.aShortArray47 == null) {
				local1366 = -1;
			} else {
				local1366 = arg1.aShortArray47[local1351];
			}
			if (arg1.aByteArray36 == null) {
				local1073 = -1;
			} else {
				local1073 = arg1.aByteArray36[local1351];
			}
			if (arg1.aByteArray33 == null) {
				local653 = 0;
			} else {
				local653 = arg1.aByteArray33[local1351] & 0xFF;
			}
			@Pc(1398) float local1398 = 0.0F;
			@Pc(1400) float local1400 = 0.0F;
			@Pc(1402) float local1402 = 0.0F;
			local919 = 0.0F;
			local943 = 0.0F;
			local917 = 0.0F;
			@Pc(1410) byte local1410 = 0;
			@Pc(1412) byte local1412 = 0;
			@Pc(1414) int local1414 = 0;
			@Pc(1448) byte local1448;
			@Pc(1468) short local1468;
			@Pc(1473) short local1473;
			@Pc(1478) short local1478;
			if (local1366 != -1) {
				if (local1073 == -1) {
					local917 = 0.0F;
					local1398 = 0.0F;
					local1410 = 1;
					local1400 = 1.0F;
					local1402 = 1.0F;
					local1412 = 2;
					local943 = 0.0F;
					local919 = 1.0F;
				} else {
					local1073 &= 0xFF;
					local1448 = arg1.aByteArray37[local1073];
					@Pc(1458) short local1458;
					@Pc(1463) short local1463;
					@Pc(1501) float local1501;
					@Pc(1510) float local1510;
					@Pc(1519) float local1519;
					@Pc(1603) float local1603;
					@Pc(1612) float local1612;
					@Pc(1620) float local1620;
					@Pc(1628) float local1628;
					@Pc(1637) float local1637;
					@Pc(1646) float local1646;
					if (local1448 == 0) {
						local1458 = arg1.aShortArray45[local1351];
						local1463 = arg1.aShortArray42[local1351];
						local1468 = arg1.aShortArray40[local1351];
						local1473 = arg1.aShortArray38[local1073];
						local1478 = arg1.aShortArray46[local1073];
						@Pc(1483) short local1483 = arg1.aShortArray44[local1073];
						@Pc(1489) float local1489 = (float) arg1.anIntArray261[local1473];
						@Pc(1495) float local1495 = (float) arg1.anIntArray264[local1473];
						local1501 = arg1.anIntArray265[local1473];
						local1510 = (float) arg1.anIntArray261[local1478] - local1489;
						local1519 = (float) arg1.anIntArray264[local1478] - local1495;
						@Pc(1527) float local1527 = (float) arg1.anIntArray265[local1478] - local1501;
						@Pc(1535) float local1535 = (float) arg1.anIntArray261[local1483] - local1489;
						@Pc(1544) float local1544 = (float) arg1.anIntArray264[local1483] - local1495;
						@Pc(1552) float local1552 = (float) arg1.anIntArray265[local1483] - local1501;
						@Pc(1560) float local1560 = (float) arg1.anIntArray261[local1458] - local1489;
						@Pc(1569) float local1569 = (float) arg1.anIntArray264[local1458] - local1495;
						@Pc(1577) float local1577 = (float) arg1.anIntArray265[local1458] - local1501;
						@Pc(1586) float local1586 = (float) arg1.anIntArray261[local1463] - local1489;
						@Pc(1594) float local1594 = (float) arg1.anIntArray264[local1463] - local1495;
						local1603 = (float) arg1.anIntArray265[local1463] - local1501;
						local1612 = (float) arg1.anIntArray261[local1468] - local1489;
						local1620 = (float) arg1.anIntArray264[local1468] - local1495;
						local1628 = (float) arg1.anIntArray265[local1468] - local1501;
						local1637 = local1519 * local1552 - local1527 * local1544;
						local1646 = local1527 * local1535 - local1552 * local1510;
						@Pc(1655) float local1655 = local1510 * local1544 - local1535 * local1519;
						@Pc(1664) float local1664 = local1655 * local1544 - local1646 * local1552;
						@Pc(1673) float local1673 = local1637 * local1552 - local1535 * local1655;
						@Pc(1681) float local1681 = local1535 * local1646 - local1544 * local1637;
						@Pc(1695) float local1695 = 1.0F / (local1527 * local1681 + local1673 * local1519 + local1664 * local1510);
						local1398 = (local1569 * local1673 + local1560 * local1664 + local1577 * local1681) * local1695;
						local1402 = (local1673 * local1594 + local1586 * local1664 + local1681 * local1603) * local1695;
						local943 = local1695 * (local1628 * local1681 + local1664 * local1612 + local1673 * local1620);
						@Pc(1746) float local1746 = local1510 * local1646 - local1637 * local1519;
						@Pc(1754) float local1754 = local1655 * local1519 - local1646 * local1527;
						@Pc(1763) float local1763 = local1527 * local1637 - local1510 * local1655;
						@Pc(1777) float local1777 = 1.0F / (local1746 * local1552 + local1535 * local1754 + local1763 * local1544);
						local919 = local1777 * (local1746 * local1603 + local1754 * local1586 + local1594 * local1763);
						local917 = (local1612 * local1754 + local1620 * local1763 + local1746 * local1628) * local1777;
						local1400 = (local1746 * local1577 + local1754 * local1560 + local1763 * local1569) * local1777;
					} else {
						local1458 = arg1.aShortArray45[local1351];
						local1463 = arg1.aShortArray42[local1351];
						local1468 = arg1.aShortArray40[local1351];
						@Pc(1840) int local1840 = local621[local1073];
						@Pc(1844) int local1844 = local623[local1073];
						@Pc(1848) int local1848 = local625[local1073];
						@Pc(1852) float[] local1852 = local627[local1073];
						@Pc(1857) byte local1857 = arg1.aByteArray35[local1073];
						local1501 = (float) arg1.anIntArray262[local1073] / 256.0F;
						if (local1448 == 1) {
							local1510 = (float) arg1.anIntArray260[local1073] / 1024.0F;
							Static405.method7492(local1510, local1501, local1852, local1844, local1840, local1857, local1848, arg1.anIntArray265[local1458], arg1.anIntArray261[local1458], arg1.anIntArray264[local1458]);
							local1400 = Static119.aFloat25;
							local1398 = Static213.aFloat91;
							Static405.method7492(local1510, local1501, local1852, local1844, local1840, local1857, local1848, arg1.anIntArray265[local1463], arg1.anIntArray261[local1463], arg1.anIntArray264[local1463]);
							local1402 = Static213.aFloat91;
							local919 = Static119.aFloat25;
							Static405.method7492(local1510, local1501, local1852, local1844, local1840, local1857, local1848, arg1.anIntArray265[local1468], arg1.anIntArray261[local1468], arg1.anIntArray264[local1468]);
							local943 = Static213.aFloat91;
							local917 = Static119.aFloat25;
							local1519 = local1510 / 2.0F;
							if ((local1857 & 0x1) == 0) {
								if (local1519 < local943 - local1398) {
									local943 -= local1510;
									local1412 = 1;
								} else if (local1398 - local943 > local1519) {
									local1412 = 2;
									local943 += local1510;
								}
								if (local1519 < local1402 - local1398) {
									local1410 = 1;
									local1402 -= local1510;
								} else if (local1519 < local1398 - local1402) {
									local1402 += local1510;
									local1410 = 2;
								}
							} else {
								if (local919 - local1400 > local1519) {
									local919 -= local1510;
									local1410 = 1;
								} else if (local1400 - local919 > local1519) {
									local919 += local1510;
									local1410 = 2;
								}
								if (local1519 < local917 - local1400) {
									local917 -= local1510;
									local1412 = 1;
								} else if (local1519 < local1400 - local917) {
									local917 += local1510;
									local1412 = 2;
								}
							}
						} else if (local1448 == 2) {
							local1510 = (float) arg1.anIntArray268[local1073] / 256.0F;
							local1519 = (float) arg1.anIntArray263[local1073] / 256.0F;
							@Pc(2301) int local2301 = arg1.anIntArray261[local1463] - arg1.anIntArray261[local1458];
							@Pc(2311) int local2311 = arg1.anIntArray264[local1463] - arg1.anIntArray264[local1458];
							@Pc(2321) int local2321 = arg1.anIntArray265[local1463] - arg1.anIntArray265[local1458];
							@Pc(2332) int local2332 = arg1.anIntArray261[local1468] - arg1.anIntArray261[local1458];
							@Pc(2343) int local2343 = arg1.anIntArray264[local1468] - arg1.anIntArray264[local1458];
							@Pc(2354) int local2354 = arg1.anIntArray265[local1468] - arg1.anIntArray265[local1458];
							@Pc(2363) int local2363 = local2311 * local2354 - local2321 * local2343;
							@Pc(2372) int local2372 = local2332 * local2321 - local2301 * local2354;
							@Pc(2380) int local2380 = local2343 * local2301 - local2311 * local2332;
							local1603 = 64.0F / (float) arg1.anIntArray266[local1073];
							local1612 = 64.0F / (float) arg1.anIntArray267[local1073];
							local1620 = 64.0F / (float) arg1.anIntArray260[local1073];
							local1628 = ((float) local2380 * local1852[2] + (float) local2363 * local1852[0] + (float) local2372 * local1852[1]) / local1603;
							local1637 = ((float) local2380 * local1852[5] + (float) local2363 * local1852[3] + (float) local2372 * local1852[4]) / local1612;
							local1646 = ((float) local2380 * local1852[8] + (float) local2372 * local1852[7] + (float) local2363 * local1852[6]) / local1620;
							local1414 = Static202.method3485(local1646, local1628, local1637);
							Static543.method7536(arg1.anIntArray264[local1458], local1852, local1414, local1857, arg1.anIntArray261[local1458], local1840, local1510, local1848, arg1.anIntArray265[local1458], local1501, local1844, local1519);
							local1398 = Static433.aFloat145;
							local1400 = Static368.aFloat140;
							Static543.method7536(arg1.anIntArray264[local1463], local1852, local1414, local1857, arg1.anIntArray261[local1463], local1840, local1510, local1848, arg1.anIntArray265[local1463], local1501, local1844, local1519);
							local1402 = Static433.aFloat145;
							local919 = Static368.aFloat140;
							Static543.method7536(arg1.anIntArray264[local1468], local1852, local1414, local1857, arg1.anIntArray261[local1468], local1840, local1510, local1848, arg1.anIntArray265[local1468], local1501, local1844, local1519);
							local943 = Static433.aFloat145;
							local917 = Static368.aFloat140;
						} else if (local1448 == 3) {
							Static297.method4738(local1848, local1501, arg1.anIntArray265[local1458], local1840, arg1.anIntArray264[local1458], arg1.anIntArray261[local1458], local1852, local1844, local1857);
							local1400 = Static16.aFloat5;
							local1398 = Static234.aFloat98;
							Static297.method4738(local1848, local1501, arg1.anIntArray265[local1463], local1840, arg1.anIntArray264[local1463], arg1.anIntArray261[local1463], local1852, local1844, local1857);
							local919 = Static16.aFloat5;
							local1402 = Static234.aFloat98;
							Static297.method4738(local1848, local1501, arg1.anIntArray265[local1468], local1840, arg1.anIntArray264[local1468], arg1.anIntArray261[local1468], local1852, local1844, local1857);
							local943 = Static234.aFloat98;
							local917 = Static16.aFloat5;
							if ((local1857 & 0x1) == 0) {
								if (local943 - local1398 > 0.5F) {
									local1412 = 1;
									local943--;
								} else if (local1398 - local943 > 0.5F) {
									local943++;
									local1412 = 2;
								}
								if (local1402 - local1398 > 0.5F) {
									local1402--;
									local1410 = 1;
								} else if (local1398 - local1402 > 0.5F) {
									local1402++;
									local1410 = 2;
								}
							} else {
								if (local919 - local1400 > 0.5F) {
									local919--;
									local1410 = 1;
								} else if (local1400 - local919 > 0.5F) {
									local1410 = 2;
									local919++;
								}
								if (local917 - local1400 > 0.5F) {
									local917--;
									local1412 = 1;
								} else if (local1400 - local917 > 0.5F) {
									local1412 = 2;
									local917++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray39 == null) {
				local1448 = 0;
			} else {
				local1448 = arg1.aByteArray39[local1351];
			}
			if (local1448 == 0) {
				@Pc(2726) long local2726 = ((long) local653 + (long) (local1358 << 8) + (long) (local1414 << 24) << 32) + (long) (local1073 << 2);
				local1468 = arg1.aShortArray45[local1351];
				local1473 = arg1.aShortArray42[local1351];
				local1478 = arg1.aShortArray40[local1351];
				@Pc(2745) Class188 local2745 = local331[local1468];
				this.aShortArray140[local1345] = this.method6702(local1345, arg1, local1398, local2745.anInt5426, local2726, local1400, local2745.anInt5424, local2745.anInt5425, local2745.anInt5422, local1468);
				@Pc(2770) Class188 local2770 = local331[local1473];
				this.aShortArray141[local1345] = this.method6702(local1345, arg1, local1402, local2770.anInt5426, local2726 + (long) local1410, local919, local2770.anInt5424, local2770.anInt5425, local2770.anInt5422, local1473);
				@Pc(2798) Class188 local2798 = local331[local1478];
				this.aShortArray131[local1345] = this.method6702(local1345, arg1, local943, local2798.anInt5426, local2726 + (long) local1412, local917, local2798.anInt5424, local2798.anInt5425, local2798.anInt5422, local1478);
			} else if (local1448 == 1) {
				@Pc(2583) Class135 local2583 = local1032[local1351];
				@Pc(2629) long local2629 = ((long) (local1414 << 24) + (long) (local1358 << 8) + (long) local653 << 32) + (long) ((local1073 << 2) + (local2583.anInt4019 > 0 ? 1024 : 2048) + (local2583.anInt4015 + 256 << 12) + (local2583.anInt4016 + 256 << 22));
				this.aShortArray140[local1345] = this.method6702(local1345, arg1, local1398, local2583.anInt4016, local2629, local1400, local2583.anInt4019, 0, local2583.anInt4015, arg1.aShortArray45[local1351]);
				this.aShortArray141[local1345] = this.method6702(local1345, arg1, local1402, local2583.anInt4016, (long) local1410 + local2629, local919, local2583.anInt4019, 0, local2583.anInt4015, arg1.aShortArray42[local1351]);
				this.aShortArray131[local1345] = this.method6702(local1345, arg1, local943, local2583.anInt4016, (long) local1412 + local2629, local917, local2583.anInt4019, 0, local2583.anInt4015, arg1.aShortArray40[local1351]);
			}
			if (arg1.aShortArray47 == null) {
				this.aShortArray139[local1345] = -1;
			} else {
				this.aShortArray139[local1345] = arg1.aShortArray47[local1351];
			}
			if (arg1.aByteArray33 != null) {
				this.aByteArray115[local1345] = arg1.aByteArray33[local1351];
			}
			if (arg1.aShortArray41 != null) {
				this.aShortArray143[local1345] = arg1.aShortArray41[local1351];
			}
			this.aShortArray132[local1345] = arg1.aShortArray39[local1351];
		}
		if (this.anInt8077 > 0) {
			local1351 = 1;
			local1051 = this.aShortArray139[0];
			for (local1062 = 0; local1062 < this.anInt8077; local1062++) {
				@Pc(2901) short local2901 = this.aShortArray139[local1062];
				if (local2901 != local1051) {
					local1351++;
					local1051 = local2901;
				}
			}
			this.anIntArray753 = new int[local1351];
			this.anIntArray752 = new int[local1351 + 1];
			this.anIntArray758 = new int[local1351];
			this.anIntArray752[0] = 0;
			local1073 = this.anInt8113;
			local1051 = this.aShortArray139[0];
			@Pc(2945) short local2945 = 0;
			local1351 = 0;
			for (local689 = 0; local689 < this.anInt8077; local689++) {
				@Pc(2956) short local2956 = this.aShortArray139[local689];
				if (local2956 != local1051) {
					this.anIntArray758[local1351] = local1073;
					this.anIntArray753[local1351] = local2945 + 1 - local1073;
					local1351++;
					this.anIntArray752[local1351] = local689;
					local1051 = local2956;
					local1073 = this.anInt8113;
					local2945 = 0;
				}
				@Pc(2992) short local2992 = this.aShortArray140[local689];
				if (local2945 < local2992) {
					local2945 = local2992;
				}
				if (local2992 < local1073) {
					local1073 = local2992;
				}
				local2992 = this.aShortArray141[local689];
				if (local2992 < local1073) {
					local1073 = local2992;
				}
				if (local2992 > local2945) {
					local2945 = local2992;
				}
				local2992 = this.aShortArray131[local689];
				if (local2992 > local2945) {
					local2945 = local2992;
				}
				if (local1073 > local2992) {
					local1073 = local2992;
				}
			}
			this.anIntArray758[local1351] = local1073;
			this.anIntArray753[local1351] = local2945 + 1 - local1073;
			local1351++;
			this.anIntArray752[local1351] = this.anInt8077;
		}
		Static74.aLongArray3 = null;
		this.aShortArray133 = Static169.method2566(this.anInt8113, this.aShortArray133);
		this.aShortArray137 = Static169.method2566(this.anInt8113, this.aShortArray137);
		this.aShortArray142 = Static169.method2566(this.anInt8113, this.aShortArray142);
		this.aShortArray134 = Static169.method2566(this.anInt8113, this.aShortArray134);
		this.aShortArray138 = Static169.method2566(this.anInt8113, this.aShortArray138);
		this.aByteArray114 = Static474.method6597(this.aByteArray114, this.anInt8113);
		this.aFloatArray60 = Static347.method5283(this.anInt8113, this.aFloatArray60);
		this.aFloatArray61 = Static347.method5283(this.anInt8113, this.aFloatArray61);
		if (arg1.anIntArray259 != null && Static393.method5944(this.anInt8106, arg2)) {
			this.anIntArrayArray108 = arg1.method2309(false);
		}
		if (arg1.aClass208Array1 != null && Static23.method7129(this.anInt8106, arg2)) {
			this.anIntArrayArray107 = arg1.method2316();
		}
		if (arg1.anIntArray258 != null && Static352.method5305(arg2, this.anInt8106)) {
			local1351 = 0;
			local645 = new int[256];
			for (local1062 = 0; local1062 < this.anInt8101; local1062++) {
				local1073 = arg1.anIntArray258[local22[local1062]];
				if (local1073 >= 0) {
					if (local1073 > local1351) {
						local1351 = local1073;
					}
					@Pc(3209) int local3209 = local645[local1073]++;
				}
			}
			this.lb = new int[local1351 + 1][];
			for (local1073 = 0; local1073 <= local1351; local1073++) {
				this.lb[local1073] = new int[local645[local1073]];
				local645[local1073] = 0;
			}
			for (local653 = 0; local653 < this.anInt8101; local653++) {
				local689 = arg1.anIntArray258[local22[local653]];
				if (local689 >= 0) {
					this.lb[local689][local645[local689]++] = local653;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!re;IIZZ)V")
	public Class145_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8077 = 0;
		this.anInt8101 = 0;
		this.aBoolean567 = false;
		this.aBoolean568 = false;
		this.anInt8116 = 0;
		this.anInt8113 = 0;
		this.anInt8095 = 0;
		this.aBoolean569 = true;
		this.anInt8081 = arg1;
		this.aClass122_Sub2_18 = arg0;
		this.anInt8106 = arg2;
		this.aBoolean567 = arg4;
		if (arg3 || Static183.method2894(this.anInt8106, this.anInt8081)) {
			this.aClass173_2 = new Class173(Static399.method6031(this.anInt8106, this.anInt8081));
		}
		if (arg3 || Static108.method1860(this.anInt8106, this.anInt8081)) {
			this.aClass173_4 = new Class173(Static255.method4305(this.anInt8081, this.anInt8106));
		}
		if (arg3 || Static136.method2256(this.anInt8081, this.anInt8106)) {
			this.aClass173_3 = new Class173(Static210.method3585(this.anInt8081, this.anInt8106));
		}
		if (arg3 || Static441.method6336(this.anInt8106, this.anInt8081)) {
			this.aClass173_1 = new Class173(Static130.method2175(this.anInt8081, this.anInt8106));
		}
		if (arg3 || Static3.method207(this.anInt8106, this.anInt8081)) {
			this.aClass281_1 = new Class281(Static396.method5968(this.anInt8106, this.anInt8081));
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	public void method6690() {
		if (this.aClass173_2 != null) {
			this.aClass173_2.method4369();
		}
		if (this.aClass173_4 != null) {
			this.aClass173_4.method4369();
		}
		if (this.aClass173_3 != null) {
			this.aClass173_3.method4369();
		}
		if (this.aClass173_1 != null) {
			this.aClass173_1.method4369();
		}
		if (this.aClass281_1 != null) {
			this.aClass281_1.method6496();
		}
	}

	@OriginalMember(owner = "client!uf", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static368.anInt6815 = 0;
			Static389.anInt7041 = 0;
			local28 = 0;
			Static223.anInt4452 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray108.length > local38) {
					local52 = this.anIntArrayArray108[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray135 == null || (arg6 & this.aShortArray135[local60]) != 0) {
							Static389.anInt7041 += this.anIntArray755[local60];
							Static368.anInt6815 += this.anIntArray757[local60];
							Static223.anInt4452 += this.anIntArray754[local60];
							local28++;
						}
					}
				}
			}
			if (local28 > 0) {
				Static368.anInt6815 = Static368.anInt6815 / local28 + arg3;
				Static389.anInt7041 = Static389.anInt7041 / local28 + arg2;
				Static223.anInt4452 = arg4 + Static223.anInt4452 / local28;
				Static458.aBoolean556 = true;
			} else {
				Static368.anInt6815 = arg3;
				Static389.anInt7041 = arg2;
				Static223.anInt4452 = arg4;
			}
			return;
		}
		@Pc(244) int[] local244;
		@Pc(246) int local246;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[2] * arg4 + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local32 = arg3 * arg7[4] + arg2 * arg7[3] + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg2 * arg7[6] + arg3 * arg7[7] + arg7[8] * arg4 + 8192 >> 14;
				arg4 = local38;
				arg2 = local28;
				arg3 = local32;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray108.length) {
					local244 = this.anIntArrayArray108[local32];
					for (local246 = 0; local246 < local244.length; local246++) {
						local54 = local244[local246];
						if (this.aShortArray135 == null || (this.aShortArray135[local54] & arg6) != 0) {
							this.anIntArray755[local54] += arg2;
							this.anIntArray757[local54] += arg3;
							this.anIntArray754[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(388) int local388;
		@Pc(418) int local418;
		@Pc(445) int local445;
		@Pc(449) int local449;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(465) int local465;
		@Pc(473) int local473;
		@Pc(628) int local628;
		@Pc(655) int local655;
		@Pc(660) int local660;
		@Pc(668) int local668;
		@Pc(673) int local673;
		@Pc(677) int local677;
		@Pc(681) int local681;
		@Pc(683) int local683;
		@Pc(810) int[] local810;
		@Pc(812) int local812;
		@Pc(816) int local816;
		@Pc(820) int local820;
		@Pc(822) int local822;
		@Pc(951) int local951;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray108.length) {
						local244 = this.anIntArrayArray108[local32];
						for (local246 = 0; local246 < local244.length; local246++) {
							local54 = local244[local246];
							if (this.aShortArray135 == null || (this.aShortArray135[local54] & arg6) != 0) {
								this.anIntArray755[local54] -= Static389.anInt7041;
								this.anIntArray757[local54] -= Static368.anInt6815;
								this.anIntArray754[local54] -= Static223.anInt4452;
								if (arg4 != 0) {
									local60 = Class310.anIntArray827[arg4];
									local366 = Class310.anIntArray826[arg4];
									local388 = this.anIntArray755[local54] * local366 + local60 * this.anIntArray757[local54] + 16383 >> 14;
									this.anIntArray757[local54] = local366 * this.anIntArray757[local54] + 16383 - this.anIntArray755[local54] * local60 >> 14;
									this.anIntArray755[local54] = local388;
								}
								if (arg2 != 0) {
									local60 = Class310.anIntArray827[arg2];
									local366 = Class310.anIntArray826[arg2];
									local388 = this.anIntArray757[local54] * local366 + 16383 - this.anIntArray754[local54] * local60 >> 14;
									this.anIntArray754[local54] = this.anIntArray754[local54] * local366 + local60 * this.anIntArray757[local54] + 16383 >> 14;
									this.anIntArray757[local54] = local388;
								}
								if (arg3 != 0) {
									local60 = Class310.anIntArray827[arg3];
									local366 = Class310.anIntArray826[arg3];
									local388 = local366 * this.anIntArray755[local54] + this.anIntArray754[local54] * local60 + 16383 >> 14;
									this.anIntArray754[local54] = this.anIntArray754[local54] * local366 + 16383 - this.anIntArray755[local54] * local60 >> 14;
									this.anIntArray755[local54] = local388;
								}
								this.anIntArray755[local54] += Static389.anInt7041;
								this.anIntArray757[local54] += Static368.anInt6815;
								this.anIntArray754[local54] += Static223.anInt4452;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray108.length > local38) {
							local52 = this.anIntArrayArray108[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray135 == null || (this.aShortArray135[local60] & arg6) != 0) {
									local366 = this.anIntArray756[local60];
									local388 = this.anIntArray756[local60 + 1];
									for (local418 = local366; local418 < local388; local418++) {
										local445 = this.aShortArray136[local418] - 1;
										if (local445 == -1) {
											break;
										}
										if (arg4 != 0) {
											local449 = Class310.anIntArray827[arg4];
											local453 = Class310.anIntArray826[arg4];
											local457 = local449 * this.aShortArray134[local445] + local453 * this.aShortArray142[local445] + 16383 >> 14;
											this.aShortArray134[local445] = (short) (local453 * this.aShortArray134[local445] + 16383 - this.aShortArray142[local445] * local449 >> 14);
											this.aShortArray142[local445] = (short) local457;
										}
										if (arg2 != 0) {
											local449 = Class310.anIntArray827[arg2];
											local453 = Class310.anIntArray826[arg2];
											local457 = this.aShortArray134[local445] * local453 + 16383 - local449 * this.aShortArray138[local445] >> 14;
											this.aShortArray138[local445] = (short) (local453 * this.aShortArray138[local445] + local449 * this.aShortArray134[local445] + 16383 >> 14);
											this.aShortArray134[local445] = (short) local457;
										}
										if (arg3 != 0) {
											local449 = Class310.anIntArray827[arg3];
											local453 = Class310.anIntArray826[arg3];
											local457 = local449 * this.aShortArray138[local445] + this.aShortArray142[local445] * local453 + 16383 >> 14;
											this.aShortArray138[local445] = (short) (local453 * this.aShortArray138[local445] + 16383 - local449 * this.aShortArray142[local445] >> 14);
											this.aShortArray142[local445] = (short) local457;
										}
									}
								}
							}
						}
					}
					this.method6698();
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local246 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static458.aBoolean556) {
					local366 = arg7[3] * Static368.anInt6815 + arg7[0] * Static389.anInt7041 + Static223.anInt4452 * arg7[6] + 8192 >> 14;
					local388 = arg7[7] * Static223.anInt4452 + Static389.anInt7041 * arg7[1] + Static368.anInt6815 * arg7[4] + 8192 >> 14;
					local366 += local246;
					local388 += local54;
					local418 = arg7[5] * Static368.anInt6815 + Static389.anInt7041 * arg7[2] + Static223.anInt4452 * arg7[8] + 8192 >> 14;
					Static389.anInt7041 = local366;
					local418 += local60;
					Static368.anInt6815 = local388;
					Static458.aBoolean556 = false;
					Static223.anInt4452 = local418;
				}
				@Pc(433) int[] local433 = new int[9];
				local388 = Class310.anIntArray826[arg2];
				local418 = Class310.anIntArray827[arg2];
				local445 = Class310.anIntArray826[arg3];
				local449 = Class310.anIntArray827[arg3];
				local453 = Class310.anIntArray826[arg4];
				local457 = Class310.anIntArray827[arg4];
				local465 = local453 * local418 + 8192 >> 14;
				local473 = local457 * local418 + 8192 >> 14;
				local433[2] = local388 * local449 + 8192 >> 14;
				local433[0] = local449 * local473 + local453 * local445 + 8192 >> 14;
				local433[8] = local445 * local388 + 8192 >> 14;
				local433[1] = local457 * -local445 + local449 * local465 + 8192 >> 14;
				local433[7] = local457 * local449 + local465 * local445 + 8192 >> 14;
				local433[4] = local388 * local453 + 8192 >> 14;
				local433[5] = -local418;
				local433[3] = local457 * local388 + 8192 >> 14;
				local433[6] = local473 * local445 + -local449 * local453 + 8192 >> 14;
				@Pc(603) int local603 = local433[2] * -Static223.anInt4452 + -Static368.anInt6815 * local433[1] + local433[0] * -Static389.anInt7041 + 8192 >> 14;
				local628 = local433[5] * -Static223.anInt4452 + local433[4] * -Static368.anInt6815 + -Static389.anInt7041 * local433[3] + 8192 >> 14;
				local655 = local433[6] * -Static389.anInt7041 + -Static368.anInt6815 * local433[7] + local433[8] * -Static223.anInt4452 + 8192 >> 14;
				local660 = local603 + Static389.anInt7041;
				@Pc(664) int local664 = local628 + Static368.anInt6815;
				local668 = Static223.anInt4452 + local655;
				@Pc(671) int[] local671 = new int[9];
				for (local673 = 0; local673 < 3; local673++) {
					for (local677 = 0; local677 < 3; local677++) {
						local681 = 0;
						for (local683 = 0; local683 < 3; local683++) {
							local681 += local433[local673 * 3 + local683] * arg7[local677 * 3 + local683];
						}
						local671[local673 * 3 + local677] = local681 + 8192 >> 14;
					}
				}
				local677 = local60 * local433[2] + local54 * local433[1] + local246 * local433[0] + 8192 >> 14;
				local681 = local433[4] * local54 + local433[3] * local246 + local433[5] * local60 + 8192 >> 14;
				local677 += local660;
				local681 += local664;
				local683 = local433[8] * local60 + local54 * local433[7] + local433[6] * local246 + 8192 >> 14;
				local683 += local668;
				local810 = new int[9];
				for (local812 = 0; local812 < 3; local812++) {
					for (local816 = 0; local816 < 3; local816++) {
						local820 = 0;
						for (local822 = 0; local822 < 3; local822++) {
							local820 += arg7[local812 * 3 + local822] * local671[local822 * 3 + local816];
						}
						local810[local812 * 3 + local816] = local820 + 8192 >> 14;
					}
				}
				local816 = local683 * arg7[2] + local677 * arg7[0] + local681 * arg7[1] + 8192 >> 14;
				local820 = arg7[5] * local683 + arg7[4] * local681 + arg7[3] * local677 + 8192 >> 14;
				local816 += local28;
				local822 = arg7[6] * local677 + local681 * arg7[7] + local683 * arg7[8] + 8192 >> 14;
				local820 += local32;
				local822 += local38;
				for (local951 = 0; local951 < local8; local951++) {
					@Pc(957) int local957 = arg1[local951];
					if (this.anIntArrayArray108.length > local957) {
						@Pc(967) int[] local967 = this.anIntArrayArray108[local957];
						for (@Pc(969) int local969 = 0; local969 < local967.length; local969++) {
							@Pc(975) int local975 = local967[local969];
							if (this.aShortArray135 == null || (arg6 & this.aShortArray135[local975]) != 0) {
								@Pc(1017) int local1017 = local810[1] * this.anIntArray757[local975] + this.anIntArray755[local975] * local810[0] + this.anIntArray754[local975] * local810[2] + 8192 >> 14;
								@Pc(1048) int local1048 = local810[5] * this.anIntArray754[local975] + local810[3] * this.anIntArray755[local975] + local810[4] * this.anIntArray757[local975] + 8192 >> 14;
								@Pc(1052) int local1052 = local1017 + local816;
								@Pc(1056) int local1056 = local1048 + local820;
								@Pc(1088) int local1088 = local810[8] * this.anIntArray754[local975] + this.anIntArray755[local975] * local810[6] + this.anIntArray757[local975] * local810[7] + 8192 >> 14;
								this.anIntArray755[local975] = local1052;
								@Pc(1097) int local1097 = local1088 + local822;
								this.anIntArray757[local975] = local1056;
								this.anIntArray754[local975] = local1097;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2578) Class265 local2578;
			@Pc(2465) boolean local2465;
			@Pc(2573) Class178 local2573;
			if (arg0 == 5) {
				if (this.lb != null) {
					local2465 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.lb.length > local38) {
							local52 = this.lb[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray143 == null || (this.aShortArray143[local60] & arg6) != 0) {
									local366 = arg2 * 8 + (this.aByteArray115[local60] & 0xFF);
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray115[local60] = (byte) local366;
								}
							}
							local2465 |= local52.length > 0;
						}
					}
					if (local2465) {
						if (this.aClass178Array1 != null) {
							for (local38 = 0; local38 < this.anInt8125; local38++) {
								local2573 = this.aClass178Array1[local38];
								local2578 = this.aClass265Array1[local38];
								local2578.anInt7518 = 255 - (this.aByteArray115[local2573.anInt5097] & 0xFF) << 24 | local2578.anInt7518 & 0xFFFFFF;
							}
						}
						this.method6699();
					}
				}
			} else if (arg0 == 7) {
				if (this.lb != null) {
					local2465 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.lb.length) {
							local52 = this.lb[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray143 == null || (this.aShortArray143[local60] & arg6) != 0) {
									local366 = this.aShortArray132[local60] & 0xFFFF;
									local388 = local366 >> 10 & 0x3F;
									local418 = local366 >> 7 & 0x7;
									@Pc(2680) int local2680 = arg2 + local388 & 0x3F;
									local418 += arg3 / 4;
									local445 = local366 & 0x7F;
									if (local418 < 0) {
										local418 = 0;
									} else if (local418 > 7) {
										local418 = 7;
									}
									local445 += arg4;
									if (local445 < 0) {
										local445 = 0;
									} else if (local445 > 127) {
										local445 = 127;
									}
									this.aShortArray132[local60] = (short) (local2680 << 10 | local418 << 7 | local445);
								}
							}
							local2465 |= local52.length > 0;
						}
					}
					if (local2465) {
						if (this.aClass178Array1 != null) {
							for (local38 = 0; local38 < this.anInt8125; local38++) {
								local2573 = this.aClass178Array1[local38];
								local2578 = this.aClass265Array1[local38];
								local2578.anInt7518 = local2578.anInt7518 & 0xFF000000 | Static212.anIntArray347[this.aShortArray132[local2573.anInt5097] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6699();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray107 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray107.length > local32) {
							local244 = this.anIntArrayArray107[local32];
							for (local246 = 0; local246 < local244.length; local246++) {
								local2578 = this.aClass265Array1[local244[local246]];
								local2578.anInt7524 += arg2;
								local2578.anInt7517 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray107 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray107.length) {
							local244 = this.anIntArrayArray107[local32];
							for (local246 = 0; local246 < local244.length; local246++) {
								local2578 = this.aClass265Array1[local244[local246]];
								local2578.anInt7516 = arg2 * local2578.anInt7516 >> 7;
								local2578.anInt7521 = arg3 * local2578.anInt7521 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray107 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray107.length > local32) {
						local244 = this.anIntArrayArray107[local32];
						for (local246 = 0; local246 < local244.length; local246++) {
							local2578 = this.aClass265Array1[local244[local246]];
							local2578.anInt7522 = local2578.anInt7522 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray108.length) {
					local244 = this.anIntArrayArray108[local32];
					for (local246 = 0; local246 < local244.length; local246++) {
						local54 = local244[local246];
						if (this.aShortArray135 == null || (this.aShortArray135[local54] & arg6) != 0) {
							this.anIntArray755[local54] -= Static389.anInt7041;
							this.anIntArray757[local54] -= Static368.anInt6815;
							this.anIntArray754[local54] -= Static223.anInt4452;
							this.anIntArray755[local54] = this.anIntArray755[local54] * arg2 >> 7;
							this.anIntArray757[local54] = arg3 * this.anIntArray757[local54] >> 7;
							this.anIntArray754[local54] = this.anIntArray754[local54] * arg4 >> 7;
							this.anIntArray755[local54] += Static389.anInt7041;
							this.anIntArray757[local54] += Static368.anInt6815;
							this.anIntArray754[local54] += Static223.anInt4452;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local246 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static458.aBoolean556) {
				local366 = Static368.anInt6815 * arg7[3] + Static389.anInt7041 * arg7[0] + arg7[6] * Static223.anInt4452 + 8192 >> 14;
				local388 = Static223.anInt4452 * arg7[7] + arg7[1] * Static389.anInt7041 + arg7[4] * Static368.anInt6815 + 8192 >> 14;
				local388 += local54;
				local366 += local246;
				local418 = Static223.anInt4452 * arg7[8] + arg7[5] * Static368.anInt6815 + Static389.anInt7041 * arg7[2] + 8192 >> 14;
				Static389.anInt7041 = local366;
				Static368.anInt6815 = local388;
				local418 += local60;
				Static458.aBoolean556 = false;
				Static223.anInt4452 = local418;
			}
			local366 = arg2 << 15 >> 7;
			local388 = arg3 << 15 >> 7;
			local418 = arg4 << 15 >> 7;
			local445 = -Static389.anInt7041 * local366 + 8192 >> 14;
			local449 = -Static368.anInt6815 * local388 + 8192 >> 14;
			local453 = local418 * -Static223.anInt4452 + 8192 >> 14;
			local457 = Static389.anInt7041 + local445;
			local465 = local449 + Static368.anInt6815;
			local473 = local453 + Static223.anInt4452;
			@Pc(1849) int[] local1849 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local388 * arg7[1] + 8192 >> 14, local388 * arg7[4] + 8192 >> 14, local388 * arg7[7] + 8192 >> 14, arg7[2] * local418 + 8192 >> 14, arg7[5] * local418 + 8192 >> 14, local418 * arg7[8] + 8192 >> 14 };
			local628 = local366 * local246 + 8192 >> 14;
			local655 = local388 * local54 + 8192 >> 14;
			local660 = local60 * local418 + 8192 >> 14;
			@Pc(1985) int local1985 = local655 + local465;
			@Pc(1989) int local1989 = local628 + local457;
			@Pc(1993) int local1993 = local660 + local473;
			@Pc(1996) int[] local1996 = new int[9];
			@Pc(2002) int local2002;
			for (local668 = 0; local668 < 3; local668++) {
				for (local2002 = 0; local2002 < 3; local2002++) {
					local673 = 0;
					for (local677 = 0; local677 < 3; local677++) {
						local673 += arg7[local668 * 3 + local677] * local1849[local677 * 3 + local2002];
					}
					local1996[local668 * 3 + local2002] = local673 + 8192 >> 14;
				}
			}
			local2002 = arg7[1] * local1985 + local1989 * arg7[0] + local1993 * arg7[2] + 8192 >> 14;
			local673 = arg7[4] * local1985 + arg7[3] * local1989 + arg7[5] * local1993 + 8192 >> 14;
			local677 = local1985 * arg7[7] + arg7[6] * local1989 + arg7[8] * local1993 + 8192 >> 14;
			local673 += local32;
			local2002 += local28;
			local677 += local38;
			for (local681 = 0; local681 < local8; local681++) {
				local683 = arg1[local681];
				if (local683 < this.anIntArrayArray108.length) {
					local810 = this.anIntArrayArray108[local683];
					for (local812 = 0; local812 < local810.length; local812++) {
						local816 = local810[local812];
						if (this.aShortArray135 == null || (arg6 & this.aShortArray135[local816]) != 0) {
							local820 = local1996[2] * this.anIntArray754[local816] + this.anIntArray757[local816] * local1996[1] + this.anIntArray755[local816] * local1996[0] + 8192 >> 14;
							local822 = local1996[3] * this.anIntArray755[local816] + this.anIntArray757[local816] * local1996[4] + local1996[5] * this.anIntArray754[local816] + 8192 >> 14;
							local951 = this.anIntArray757[local816] * local1996[7] + this.anIntArray755[local816] * local1996[6] + this.anIntArray754[local816] * local1996[8] + 8192 >> 14;
							@Pc(2281) int local2281 = local820 + local2002;
							@Pc(2285) int local2285 = local822 + local673;
							this.anIntArray755[local816] = local2281;
							@Pc(2294) int local2294 = local951 + local677;
							this.anIntArray757[local816] = local2285;
							this.anIntArray754[local816] = local2294;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class310.anIntArray827[arg0];
		@Pc(13) int local13 = Class310.anIntArray826[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8095; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray757[local15] + local13 * this.anIntArray755[local15] >> 14;
			this.anIntArray757[local15] = local13 * this.anIntArray757[local15] - local9 * this.anIntArray755[local15] >> 14;
			this.anIntArray755[local15] = local33;
		}
		this.method6708();
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
	private void method6692() {
		if (this.aClass178Array1 == null) {
			return;
		}
		@Pc(12) float local12 = this.aClass122_Sub2_18.method5610();
		@Pc(16) float local16 = this.aClass122_Sub2_18.method5570();
		this.aClass122_Sub2_18.method7271(false);
		this.aClass122_Sub2_18.method5633(false);
		this.aClass122_Sub2_18.method5575(1, Static312.aClass181_4);
		this.aClass122_Sub2_18.method5585(Static312.aClass181_4, 1);
		for (@Pc(39) int local39 = 0; local39 < this.anInt8125; local39++) {
			@Pc(46) Class178 local46 = this.aClass178Array1[local39];
			@Pc(51) Class265 local51 = this.aClass265Array1[local39];
			if (!local46.aBoolean361 || !this.aClass122_Sub2_18.method7215()) {
				@Pc(79) float local79 = (float) (this.anIntArray755[local46.anInt5093] + this.anIntArray755[local46.anInt5092] + this.anIntArray755[local46.anInt5094]) * 0.3333333F;
				@Pc(100) float local100 = (float) (this.anIntArray757[local46.anInt5093] + this.anIntArray757[local46.anInt5094] + this.anIntArray757[local46.anInt5092]) * 0.3333333F;
				@Pc(121) float local121 = (float) (this.anIntArray754[local46.anInt5093] + this.anIntArray754[local46.anInt5092] + this.anIntArray754[local46.anInt5094]) * 0.3333333F;
				@Pc(135) float local135 = Static102.aFloat16 + Static289.aFloat110 * local121 + local100 * Static35.aFloat7 + Static11.aFloat4 * local79;
				@Pc(149) float local149 = Static246.aFloat102 + Static476.aFloat154 * local100 + Static528.aFloat199 * local79 + local121 * Static125.aFloat27;
				@Pc(163) float local163 = Static129.aFloat28 + local100 * Static40.aFloat12 + Static248.aFloat24 * local79 + Static139.aFloat32 * local121;
				@Pc(168) Class118_Sub3 local168 = this.aClass122_Sub2_18.method5654();
				local168.method6976(local51.anInt7516 * local46.aShort86 >> 7, local163, local51.anInt7522, local135 + (float) local51.anInt7524, local46.aShort84 * local51.anInt7521 >> 7, (float) local51.anInt7517 + local149);
				local168.method6987(this.aClass122_Sub2_18.aClass118_Sub3_17);
				this.aClass122_Sub2_18.method5638();
				this.aClass122_Sub2_18.la(local16, local12 - (float) local46.anInt5096 * 1.5F);
				@Pc(222) int local222 = local51.anInt7518;
				this.aClass122_Sub2_18.method5622(false, false, local46.aShort85);
				this.aClass122_Sub2_18.method5650(local46.aByte65);
				this.aClass122_Sub2_18.method5634(local222);
				this.aClass122_Sub2_18.method5606();
			}
		}
		this.aClass122_Sub2_18.method5585(Static295.aClass181_3, 1);
		this.aClass122_Sub2_18.method5575(1, Static295.aClass181_3);
		this.aClass122_Sub2_18.la(local16, local12);
		this.aClass122_Sub2_18.method7271(true);
	}

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		this.aShort129 = (short) arg0;
		this.method6708();
		this.method6698();
	}

	@OriginalMember(owner = "client!uf", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray108 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8116; local12++) {
			this.anIntArray755[local12] <<= 0x4;
			this.anIntArray757[local12] <<= 0x4;
			this.anIntArray754[local12] <<= 0x4;
		}
		Static368.anInt6815 = 0;
		Static389.anInt7041 = 0;
		Static223.anInt4452 = 0;
		return true;
	}

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass122_Sub2_18.anInterface8_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt8101; local11++) {
			if (this.aShortArray139[local11] == arg0) {
				this.aShortArray139[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class220 local48 = local9.method878(arg0 & 0xFFFF);
			local37 = local48.aByte84;
			local35 = local48.aByte81;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class220 local69 = local9.method878(arg1 & 0xFFFF);
			local58 = local69.aByte84;
			local56 = local69.aByte81;
		}
		if (!(local37 != local58 | local56 != local35)) {
			return;
		}
		if (this.aClass178Array1 != null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt8125; local94++) {
				@Pc(101) Class178 local101 = this.aClass178Array1[local94];
				@Pc(106) Class265 local106 = this.aClass265Array1[local94];
				local106.anInt7518 = local106.anInt7518 & 0xFF000000 | Static212.anIntArray347[this.aShortArray132[local101.anInt5097] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6699();
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
	private void method6693() {
		if (this.anInt8077 == 0) {
			return;
		}
		if (this.method6695() && this.method6694()) {
			this.aClass122_Sub2_18.method5665(this.aClass173_2.anInterface5_9, 0);
			this.aClass122_Sub2_18.method5665(this.aClass173_3.anInterface5_9, 1);
			this.aClass122_Sub2_18.method5665(this.aClass173_4.anInterface5_9, 2);
			@Pc(57) boolean local57;
			if ((this.anInt8106 & 0x37) == 0) {
				this.aClass122_Sub2_18.method5633(false);
				local57 = false;
				this.aClass122_Sub2_18.method5573(this.aClass122_Sub2_18.aClass170_19);
			} else {
				local57 = true;
				this.aClass122_Sub2_18.method5633(true);
				this.aClass122_Sub2_18.method5573(this.aClass122_Sub2_18.aClass170_15);
				this.aClass122_Sub2_18.method5665(this.aClass173_1.anInterface5_9, 3);
			}
			for (@Pc(90) int local90 = 0; local90 < this.anIntArray758.length; local90++) {
				@Pc(97) int local97 = this.anIntArray752[local90];
				@Pc(104) int local104 = this.anIntArray752[local90 + 1];
				@Pc(111) int local111 = this.aShortArray139[local97] & 0xFFFF;
				if (local111 == 65535) {
					local111 = -1;
				}
				this.aClass122_Sub2_18.method5622(true, local57, local111);
				this.aClass122_Sub2_18.method5669(Static354.aClass22_4, this.aClass281_1.anInterface1_7, this.anIntArray753[local90], this.anIntArray758[local90], local104 - local97, local97 * 3);
			}
		}
		this.method6707();
	}

	@OriginalMember(owner = "client!uf", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class310.anIntArray827[arg0];
		@Pc(13) int local13 = Class310.anIntArray826[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8095; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray754[local15] + this.anIntArray755[local15] * local13 >> 14;
			this.anIntArray754[local15] = this.anIntArray754[local15] * local13 - local9 * this.anIntArray755[local15] >> 14;
			this.anIntArray755[local15] = local33;
		}
		this.method6708();
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!uf", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8116; local7++) {
			this.anIntArray755[local7] = this.anIntArray755[local7] + 7 >> 4;
			this.anIntArray757[local7] = this.anIntArray757[local7] + 7 >> 4;
			this.anIntArray754[local7] = this.anIntArray754[local7] + 7 >> 4;
		}
		this.method6708();
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!uf", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort128;
	}

	@OriginalMember(owner = "client!uf", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			Static368.anInt6815 = 0;
			Static223.anInt4452 = 0;
			local31 = 0;
			Static389.anInt7041 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray108.length > local41) {
					local55 = this.anIntArrayArray108[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static389.anInt7041 += this.anIntArray755[local63];
						Static368.anInt6815 += this.anIntArray757[local63];
						Static223.anInt4452 += this.anIntArray754[local63];
						local31++;
					}
				}
			}
			if (local31 <= 0) {
				Static368.anInt6815 = local21;
				Static223.anInt4452 = local25;
				Static389.anInt7041 = local17;
			} else {
				Static368.anInt6815 = Static368.anInt6815 / local31 + local21;
				Static223.anInt4452 = Static223.anInt4452 / local31 + local25;
				Static389.anInt7041 = Static389.anInt7041 / local31 + local17;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local25 = arg4 << 4;
			local21 = arg3 << 4;
			local17 = arg2 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray108.length > local35) {
					local164 = this.anIntArrayArray108[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray755[local57] += local17;
						this.anIntArray757[local57] += local21;
						this.anIntArray754[local57] += local25;
					}
				}
			}
			return;
		}
		@Pc(291) int local291;
		@Pc(310) int local310;
		@Pc(762) int local762;
		@Pc(771) int local771;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray108.length > local35) {
					local164 = this.anIntArrayArray108[local35];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray755[local57] -= Static389.anInt7041;
							this.anIntArray757[local57] -= Static368.anInt6815;
							this.anIntArray754[local57] -= Static223.anInt4452;
							if (arg4 != 0) {
								local63 = Class310.anIntArray827[arg4];
								local291 = Class310.anIntArray826[arg4];
								local310 = this.anIntArray755[local57] * local291 + this.anIntArray757[local57] * local63 + 16383 >> 14;
								this.anIntArray757[local57] = this.anIntArray757[local57] * local291 + 16383 - this.anIntArray755[local57] * local63 >> 14;
								this.anIntArray755[local57] = local310;
							}
							if (arg2 != 0) {
								local63 = Class310.anIntArray827[arg2];
								local291 = Class310.anIntArray826[arg2];
								local310 = this.anIntArray757[local57] * local291 + 16383 - this.anIntArray754[local57] * local63 >> 14;
								this.anIntArray754[local57] = local291 * this.anIntArray754[local57] + local63 * this.anIntArray757[local57] + 16383 >> 14;
								this.anIntArray757[local57] = local310;
							}
							if (arg3 != 0) {
								local63 = Class310.anIntArray827[arg3];
								local291 = Class310.anIntArray826[arg3];
								local310 = local291 * this.anIntArray755[local57] + this.anIntArray754[local57] * local63 + 16383 >> 14;
								this.anIntArray754[local57] = this.anIntArray754[local57] * local291 + 16383 - this.anIntArray755[local57] * local63 >> 14;
								this.anIntArray755[local57] = local310;
							}
							this.anIntArray755[local57] += Static389.anInt7041;
							this.anIntArray757[local57] += Static368.anInt6815;
							this.anIntArray754[local57] += Static223.anInt4452;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray755[local57] -= Static389.anInt7041;
							this.anIntArray757[local57] -= Static368.anInt6815;
							this.anIntArray754[local57] -= Static223.anInt4452;
							if (arg2 != 0) {
								local63 = Class310.anIntArray827[arg2];
								local291 = Class310.anIntArray826[arg2];
								local310 = this.anIntArray757[local57] * local291 + 16383 - local63 * this.anIntArray754[local57] >> 14;
								this.anIntArray754[local57] = this.anIntArray757[local57] * local63 + local291 * this.anIntArray754[local57] + 16383 >> 14;
								this.anIntArray757[local57] = local310;
							}
							if (arg4 != 0) {
								local63 = Class310.anIntArray827[arg4];
								local291 = Class310.anIntArray826[arg4];
								local310 = this.anIntArray755[local57] * local291 + local63 * this.anIntArray757[local57] + 16383 >> 14;
								this.anIntArray757[local57] = local291 * this.anIntArray757[local57] + 16383 - this.anIntArray755[local57] * local63 >> 14;
								this.anIntArray755[local57] = local310;
							}
							if (arg3 != 0) {
								local63 = Class310.anIntArray827[arg3];
								local291 = Class310.anIntArray826[arg3];
								local310 = this.anIntArray754[local57] * local63 + this.anIntArray755[local57] * local291 + 16383 >> 14;
								this.anIntArray754[local57] = this.anIntArray754[local57] * local291 + 16383 - this.anIntArray755[local57] * local63 >> 14;
								this.anIntArray755[local57] = local310;
							}
							this.anIntArray755[local57] += Static389.anInt7041;
							this.anIntArray757[local57] += Static368.anInt6815;
							this.anIntArray754[local57] += Static223.anInt4452;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray108.length > local41) {
						local55 = this.anIntArrayArray108[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local291 = this.anIntArray756[local63];
							local310 = this.anIntArray756[local63 + 1];
							for (local762 = local291; local762 < local310; local762++) {
								local771 = this.aShortArray136[local762] - 1;
								if (local771 == -1) {
									break;
								}
								@Pc(783) int local783;
								@Pc(787) int local787;
								@Pc(805) int local805;
								if (arg4 != 0) {
									local783 = Class310.anIntArray827[arg4];
									local787 = Class310.anIntArray826[arg4];
									local805 = this.aShortArray142[local771] * local787 + this.aShortArray134[local771] * local783 + 16383 >> 14;
									this.aShortArray134[local771] = (short) (this.aShortArray134[local771] * local787 + 16383 - this.aShortArray142[local771] * local783 >> 14);
									this.aShortArray142[local771] = (short) local805;
								}
								if (arg2 != 0) {
									local783 = Class310.anIntArray827[arg2];
									local787 = Class310.anIntArray826[arg2];
									local805 = this.aShortArray134[local771] * local787 + 16383 - this.aShortArray138[local771] * local783 >> 14;
									this.aShortArray138[local771] = (short) (local787 * this.aShortArray138[local771] + this.aShortArray134[local771] * local783 + 16383 >> 14);
									this.aShortArray134[local771] = (short) local805;
								}
								if (arg3 != 0) {
									local783 = Class310.anIntArray827[arg3];
									local787 = Class310.anIntArray826[arg3];
									local805 = local787 * this.aShortArray142[local771] + local783 * this.aShortArray138[local771] + 16383 >> 14;
									this.aShortArray138[local771] = (short) (local787 * this.aShortArray138[local771] + 16383 - local783 * this.aShortArray142[local771] >> 14);
									this.aShortArray142[local771] = (short) local805;
								}
							}
						}
					}
				}
				this.method6698();
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray108.length > local35) {
					local164 = this.anIntArrayArray108[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray755[local57] -= Static389.anInt7041;
						this.anIntArray757[local57] -= Static368.anInt6815;
						this.anIntArray754[local57] -= Static223.anInt4452;
						this.anIntArray755[local57] = this.anIntArray755[local57] * arg2 >> 7;
						this.anIntArray757[local57] = this.anIntArray757[local57] * arg3 >> 7;
						this.anIntArray754[local57] = arg4 * this.anIntArray754[local57] >> 7;
						this.anIntArray755[local57] += Static389.anInt7041;
						this.anIntArray757[local57] += Static368.anInt6815;
						this.anIntArray754[local57] += Static223.anInt4452;
					}
				}
			}
		} else {
			@Pc(1206) Class265 local1206;
			@Pc(1106) boolean local1106;
			@Pc(1201) Class178 local1201;
			if (arg0 == 5) {
				if (this.lb != null) {
					local1106 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.lb.length > local41) {
							local55 = this.lb[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local291 = (this.aByteArray115[local63] & 0xFF) + arg2 * 8;
								if (local291 < 0) {
									local291 = 0;
								} else if (local291 > 255) {
									local291 = 255;
								}
								this.aByteArray115[local63] = (byte) local291;
							}
							local1106 |= local55.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass178Array1 != null) {
							for (local41 = 0; local41 < this.anInt8125; local41++) {
								local1201 = this.aClass178Array1[local41];
								local1206 = this.aClass265Array1[local41];
								local1206.anInt7518 = local1206.anInt7518 & 0xFFFFFF | 255 - (this.aByteArray115[local1201.anInt5097] & 0xFF) << 24;
							}
						}
						this.method6699();
					}
				}
			} else if (arg0 == 7) {
				if (this.lb != null) {
					local1106 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.lb.length) {
							local55 = this.lb[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local291 = this.aShortArray132[local63] & 0xFFFF;
								local310 = local291 >> 10 & 0x3F;
								local762 = local291 >> 7 & 0x7;
								local762 += arg3 / 4;
								@Pc(1304) int local1304 = arg2 + local310 & 0x3F;
								local771 = local291 & 0x7F;
								local771 += arg4;
								if (local762 < 0) {
									local762 = 0;
								} else if (local762 > 7) {
									local762 = 7;
								}
								if (local771 < 0) {
									local771 = 0;
								} else if (local771 > 127) {
									local771 = 127;
								}
								this.aShortArray132[local63] = (short) (local762 << 7 | local1304 << 10 | local771);
							}
							local1106 |= local55.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass178Array1 != null) {
							for (local41 = 0; local41 < this.anInt8125; local41++) {
								local1201 = this.aClass178Array1[local41];
								local1206 = this.aClass265Array1[local41];
								local1206.anInt7518 = local1206.anInt7518 & 0xFF000000 | Static212.anIntArray347[this.aShortArray132[local1201.anInt5097] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6699();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray107 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray107.length > local35) {
							local164 = this.anIntArrayArray107[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1206 = this.aClass265Array1[local164[local166]];
								local1206.anInt7524 += arg2;
								local1206.anInt7517 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray107 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray107.length) {
							local164 = this.anIntArrayArray107[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1206 = this.aClass265Array1[local164[local166]];
								local1206.anInt7516 = arg2 * local1206.anInt7516 >> 7;
								local1206.anInt7521 = local1206.anInt7521 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray107 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray107.length) {
						local164 = this.anIntArrayArray107[local35];
						for (local166 = 0; local166 < local164.length; local166++) {
							local1206 = this.aClass265Array1[local164[local166]];
							local1206.anInt7522 = local1206.anInt7522 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z")
	private boolean method6694() {
		if (this.aClass281_1.aBoolean557) {
			return true;
		}
		if (this.aClass281_1.anInterface1_6 == null) {
			this.aClass281_1.anInterface1_6 = this.aClass122_Sub2_18.method5660(this.aBoolean567);
		}
		@Pc(28) Interface1 local28 = this.aClass281_1.anInterface1_6;
		local28.method5227(this.anInt8077 * 6);
		@Pc(40) Buffer local40 = local28.method5729();
		if (local40 != null) {
			@Pc(48) Stream local48 = this.aClass122_Sub2_18.method5555(local40);
			@Pc(52) int local52;
			if (Stream.c()) {
				for (local52 = 0; local52 < this.anInt8077; local52++) {
					local48.a(this.aShortArray140[local52]);
					local48.a(this.aShortArray141[local52]);
					local48.a(this.aShortArray131[local52]);
				}
			} else {
				for (local52 = 0; local52 < this.anInt8077; local52++) {
					local48.d(this.aShortArray140[local52]);
					local48.d(this.aShortArray141[local52]);
					local48.d(this.aShortArray131[local52]);
				}
			}
			local48.b();
			if (local28.method5730()) {
				this.aClass281_1.aBoolean557 = true;
				this.aClass281_1.anInterface1_7 = local28;
				this.aBoolean569 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	@Override
	public void method6668() {
		if (this.anInt8113 > 0 && this.anInt8077 > 0) {
			this.method6695();
			this.method6694();
			this.method6707();
		}
	}

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static223.anInt4452 = 0;
			Static389.anInt7041 = 0;
			Static368.anInt6815 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt8095; local17++) {
				Static389.anInt7041 += this.anIntArray755[local17];
				Static368.anInt6815 += this.anIntArray757[local17];
				local15++;
				Static223.anInt4452 += this.anIntArray754[local17];
			}
			if (local15 <= 0) {
				Static368.anInt6815 = arg2;
				Static223.anInt4452 = arg3;
				Static389.anInt7041 = arg1;
			} else {
				Static368.anInt6815 = arg2 + Static368.anInt6815 / local15;
				Static389.anInt7041 = Static389.anInt7041 / local15 + arg1;
				Static223.anInt4452 = Static223.anInt4452 / local15 + arg3;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt8095; local15++) {
				this.anIntArray755[local15] += arg1;
				this.anIntArray757[local15] += arg2;
				this.anIntArray754[local15] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt8095; local15++) {
					this.anIntArray755[local15] -= Static389.anInt7041;
					this.anIntArray757[local15] -= Static368.anInt6815;
					this.anIntArray754[local15] -= Static223.anInt4452;
					if (arg3 != 0) {
						local17 = Class310.anIntArray827[arg3];
						local167 = Class310.anIntArray826[arg3];
						local185 = local167 * this.anIntArray755[local15] + local17 * this.anIntArray757[local15] + 16383 >> 14;
						this.anIntArray757[local15] = this.anIntArray757[local15] * local167 + 16383 - this.anIntArray755[local15] * local17 >> 14;
						this.anIntArray755[local15] = local185;
					}
					if (arg1 != 0) {
						local17 = Class310.anIntArray827[arg1];
						local167 = Class310.anIntArray826[arg1];
						local185 = local167 * this.anIntArray757[local15] + 16383 - this.anIntArray754[local15] * local17 >> 14;
						this.anIntArray754[local15] = local17 * this.anIntArray757[local15] + this.anIntArray754[local15] * local167 + 16383 >> 14;
						this.anIntArray757[local15] = local185;
					}
					if (arg2 != 0) {
						local17 = Class310.anIntArray827[arg2];
						local167 = Class310.anIntArray826[arg2];
						local185 = this.anIntArray754[local15] * local17 + this.anIntArray755[local15] * local167 + 16383 >> 14;
						this.anIntArray754[local15] = this.anIntArray754[local15] * local167 + 16383 - local17 * this.anIntArray755[local15] >> 14;
						this.anIntArray755[local15] = local185;
					}
					this.anIntArray755[local15] += Static389.anInt7041;
					this.anIntArray757[local15] += Static368.anInt6815;
					this.anIntArray754[local15] += Static223.anInt4452;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt8095; local15++) {
					this.anIntArray755[local15] -= Static389.anInt7041;
					this.anIntArray757[local15] -= Static368.anInt6815;
					this.anIntArray754[local15] -= Static223.anInt4452;
					this.anIntArray755[local15] = this.anIntArray755[local15] * arg1 / 128;
					this.anIntArray757[local15] = this.anIntArray757[local15] * arg2 / 128;
					this.anIntArray754[local15] = this.anIntArray754[local15] * arg3 / 128;
					this.anIntArray755[local15] += Static389.anInt7041;
					this.anIntArray757[local15] += Static368.anInt6815;
					this.anIntArray754[local15] += Static223.anInt4452;
				}
			} else {
				@Pc(521) Class178 local521;
				@Pc(526) Class265 local526;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt8101; local15++) {
						local17 = (this.aByteArray115[local15] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray115[local15] = (byte) local17;
					}
					if (this.aClass178Array1 != null) {
						for (local17 = 0; local17 < this.anInt8125; local17++) {
							local521 = this.aClass178Array1[local17];
							local526 = this.aClass265Array1[local17];
							local526.anInt7518 = local526.anInt7518 & 0xFFFFFF | 255 - (this.aByteArray115[local521.anInt5097] & 0xFF) << 24;
						}
					}
					this.method6699();
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt8101; local15++) {
						local17 = this.aShortArray132[local15] & 0xFFFF;
						local167 = local17 >> 10 & 0x3F;
						local185 = local17 >> 7 & 0x7;
						@Pc(588) int local588 = local17 & 0x7F;
						local185 += arg2 / 4;
						@Pc(600) int local600 = arg1 + local167 & 0x3F;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local588 += arg3;
						if (local588 < 0) {
							local588 = 0;
						} else if (local588 > 127) {
							local588 = 127;
						}
						this.aShortArray132[local15] = (short) (local588 | local185 << 7 | local600 << 10);
					}
					if (this.aClass178Array1 != null) {
						for (local17 = 0; local17 < this.anInt8125; local17++) {
							local521 = this.aClass178Array1[local17];
							local526 = this.aClass265Array1[local17];
							local526.anInt7518 = local526.anInt7518 & 0xFF000000 | Static212.anIntArray347[this.aShortArray132[local521.anInt5097] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6699();
				} else {
					@Pc(708) Class265 local708;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt8125; local15++) {
							local708 = this.aClass265Array1[local15];
							local708.anInt7524 += arg1;
							local708.anInt7517 += arg2;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt8125; local15++) {
							local708 = this.aClass265Array1[local15];
							local708.anInt7521 = arg2 * local708.anInt7521 >> 7;
							local708.anInt7516 = arg1 * local708.anInt7516 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt8125; local15++) {
							local708 = this.aClass265Array1[local15];
							local708.anInt7522 = local708.anInt7522 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)Z")
	private boolean method6695() {
		@Pc(13) boolean local13 = !this.aClass173_3.aBoolean353;
		@Pc(26) boolean local26 = (this.anInt8106 & 0x37) != 0 && !this.aClass173_1.aBoolean353;
		@Pc(34) boolean local34 = !this.aClass173_2.aBoolean353;
		@Pc(42) boolean local42 = !this.aClass173_4.aBoolean353;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface5 local73;
		@Pc(87) Buffer local87;
		if (local34) {
			if (this.aClass173_2.anInterface5_8 == null) {
				this.aClass173_2.anInterface5_8 = this.aClass122_Sub2_18.method5671(this.aBoolean567);
			}
			local73 = this.aClass173_2.anInterface5_8;
			local73.method5727(this.anInt8113 * 12, 12);
			local87 = local73.method5729();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass122_Sub2_18.aNativeInterface3.copyPositions(this.anIntArray755, this.anIntArray757, this.anIntArray754, this.aShortArray133, 0, 12, this.anInt8113, local87.getAddress());
				if (local73.method5730()) {
					this.aClass173_2.aBoolean353 = true;
					this.aClass173_2.anInterface5_9 = local73;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(178) short[] local178;
		@Pc(186) short[] local186;
		@Pc(182) short[] local182;
		@Pc(190) byte[] local190;
		if (local13) {
			if (this.aClass173_3.anInterface5_8 == null) {
				this.aClass173_3.anInterface5_8 = this.aClass122_Sub2_18.method5671(this.aBoolean567);
			}
			local73 = this.aClass173_3.anInterface5_8;
			local73.method5727(this.anInt8113 * 4, 4);
			local87 = local73.method5729();
			if (local87 == null) {
				local54 = false;
			} else {
				if ((this.anInt8106 & 0x37) == 0) {
					if (this.aClass137_1 == null) {
						local182 = this.aShortArray138;
						local190 = this.aByteArray114;
						local178 = this.aShortArray142;
						local186 = this.aShortArray134;
					} else {
						local178 = this.aClass137_1.aShortArray69;
						local182 = this.aClass137_1.aShortArray70;
						local186 = this.aClass137_1.aShortArray71;
						local190 = this.aClass137_1.aByteArray54;
					}
					this.aClass122_Sub2_18.aNativeInterface3.copyLighting(this.aShortArray132, this.aByteArray115, this.aShortArray139, local178, local186, local182, local190, this.aShort128, this.aShort129, this.aShortArray137, 0, 4, this.anInt8113, local87.getAddress());
				} else {
					this.aClass122_Sub2_18.aNativeInterface3.copyColours(this.aShortArray132, this.aByteArray115, this.aShortArray139, this.aShort128, this.aShortArray137, 0, 4, this.anInt8113, local87.getAddress());
				}
				if (local73.method5730()) {
					this.aClass173_3.aBoolean353 = true;
					this.aClass173_3.anInterface5_9 = local73;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass173_1.anInterface5_8 == null) {
				this.aClass173_1.anInterface5_8 = this.aClass122_Sub2_18.method5671(this.aBoolean567);
			}
			local73 = this.aClass173_1.anInterface5_8;
			local73.method5727(this.anInt8113 * 12, 12);
			local87 = local73.method5729();
			if (local87 == null) {
				local54 = false;
			} else {
				if (this.aClass137_1 == null) {
					local178 = this.aShortArray142;
					local182 = this.aShortArray138;
					local186 = this.aShortArray134;
					local190 = this.aByteArray114;
				} else {
					local178 = this.aClass137_1.aShortArray69;
					local186 = this.aClass137_1.aShortArray71;
					local190 = this.aClass137_1.aByteArray54;
					local182 = this.aClass137_1.aShortArray70;
				}
				this.aClass122_Sub2_18.aNativeInterface3.copyNormals(local178, local186, local182, local190, 3.0F / (float) this.aShort129, 3.0F / (float) (this.aShort129 / 2 + this.aShort129), 0, 12, this.anInt8113, local87.getAddress());
				if (local73.method5730()) {
					this.aClass173_1.anInterface5_9 = local73;
					this.aClass173_1.aBoolean353 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass173_4.anInterface5_8 == null) {
				this.aClass173_4.anInterface5_8 = this.aClass122_Sub2_18.method5671(this.aBoolean567);
			}
			local73 = this.aClass173_4.anInterface5_8;
			local73.method5727(this.anInt8113 * 8, 8);
			local87 = local73.method5729();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass122_Sub2_18.aNativeInterface3.copyTexCoords(this.aFloatArray60, this.aFloatArray61, 0, 8, this.anInt8113, local87.getAddress());
				if (local73.method5730()) {
					this.aClass173_4.aBoolean353 = true;
					this.aClass173_4.anInterface5_9 = local73;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 < arg2 && arg0 < arg7 && arg0 < arg1) {
			return false;
		} else if (arg2 < arg0 && arg7 < arg0 && arg0 > arg1) {
			return false;
		} else if (arg3 > arg6 && arg5 > arg6 && arg4 > arg6) {
			return false;
		} else {
			return arg6 <= arg3 || arg5 >= arg6 || arg6 <= arg4;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method6674(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class145_Sub3 local8 = (Class145_Sub3) arg0;
		if (this.anInt8101 == 0 || local8.anInt8101 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt8095;
		@Pc(24) int[] local24 = local8.anIntArray755;
		@Pc(27) int[] local27 = local8.anIntArray757;
		@Pc(30) int[] local30 = local8.anIntArray754;
		@Pc(33) short[] local33 = local8.aShortArray142;
		@Pc(36) short[] local36 = local8.aShortArray134;
		@Pc(39) short[] local39 = local8.aShortArray138;
		@Pc(42) byte[] local42 = local8.aByteArray114;
		@Pc(53) short[] local53;
		@Pc(61) short[] local61;
		@Pc(57) short[] local57;
		@Pc(49) byte[] local49;
		if (this.aClass137_1 == null) {
			local61 = null;
			local49 = null;
			local57 = null;
			local53 = null;
		} else {
			local49 = this.aClass137_1.aByteArray54;
			local53 = this.aClass137_1.aShortArray69;
			local57 = this.aClass137_1.aShortArray70;
			local61 = this.aClass137_1.aShortArray71;
		}
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(90) short[] local90;
		@Pc(86) byte[] local86;
		if (local8.aClass137_1 == null) {
			local90 = null;
			local86 = null;
			local82 = null;
			local78 = null;
		} else {
			local78 = local8.aClass137_1.aShortArray69;
			local82 = local8.aClass137_1.aShortArray71;
			local86 = local8.aClass137_1.aByteArray54;
			local90 = local8.aClass137_1.aShortArray70;
		}
		@Pc(103) int[] local103 = local8.anIntArray756;
		@Pc(106) short[] local106 = local8.aShortArray136;
		if (!local8.aBoolean568) {
			local8.method6704();
		}
		@Pc(115) int local115 = local8.anInt8110;
		@Pc(118) int local118 = local8.anInt8112;
		@Pc(121) int local121 = local8.anInt8098;
		@Pc(124) int local124 = local8.anInt8100;
		@Pc(127) int local127 = local8.anInt8076;
		@Pc(130) int local130 = local8.anInt8071;
		for (@Pc(132) int local132 = 0; local132 < this.anInt8095; local132++) {
			@Pc(141) int local141 = this.anIntArray757[local132] - arg2;
			if (local141 >= local115 && local118 >= local141) {
				@Pc(161) int local161 = this.anIntArray755[local132] - arg1;
				if (local121 <= local161 && local124 >= local161) {
					@Pc(177) int local177 = this.anIntArray754[local132] - arg3;
					if (local177 >= local127 && local177 <= local130) {
						@Pc(191) int local191 = -1;
						@Pc(196) int local196 = this.anIntArray756[local132];
						@Pc(203) int local203 = this.anIntArray756[local132 + 1];
						for (@Pc(205) int local205 = local196; local205 < local203; local205++) {
							local191 = this.aShortArray136[local205] - 1;
							if (local191 == -1 || this.aByteArray114[local191] != 0) {
								break;
							}
						}
						if (local191 != -1) {
							for (@Pc(241) int local241 = 0; local241 < local21; local241++) {
								if (local24[local241] == local161 && local30[local241] == local177 && local27[local241] == local141) {
									@Pc(264) int local264 = -1;
									local203 = local103[local241 + 1];
									local196 = local103[local241];
									for (@Pc(276) int local276 = local196; local276 < local203; local276++) {
										local264 = local106[local276] - 1;
										if (local264 == -1 || local42[local264] != 0) {
											break;
										}
									}
									if (local264 != -1) {
										if (local53 == null) {
											this.aClass137_1 = new Class137();
											local53 = this.aClass137_1.aShortArray69 = Static225.method3896(this.aShortArray142);
											local61 = this.aClass137_1.aShortArray71 = Static225.method3896(this.aShortArray134);
											local57 = this.aClass137_1.aShortArray70 = Static225.method3896(this.aShortArray138);
											local49 = this.aClass137_1.aByteArray54 = Static24.method567(this.aByteArray114);
										}
										if (local78 == null) {
											@Pc(353) Class137 local353 = local8.aClass137_1 = new Class137();
											local78 = local353.aShortArray69 = Static225.method3896(local33);
											local82 = local353.aShortArray71 = Static225.method3896(local36);
											local90 = local353.aShortArray70 = Static225.method3896(local39);
											local86 = local353.aByteArray54 = Static24.method567(local42);
										}
										@Pc(386) short local386 = this.aShortArray142[local191];
										@Pc(391) short local391 = this.aShortArray134[local191];
										@Pc(396) short local396 = this.aShortArray138[local191];
										@Pc(401) byte local401 = this.aByteArray114[local191];
										local203 = local103[local241 + 1];
										local196 = local103[local241];
										@Pc(421) int local421;
										for (@Pc(413) int local413 = local196; local413 < local203; local413++) {
											local421 = local106[local413] - 1;
											if (local421 == -1) {
												break;
											}
											if (local86[local421] != 0) {
												local78[local421] += local386;
												local82[local421] += local391;
												local90[local421] += local396;
												local86[local421] += local401;
											}
										}
										local203 = this.anIntArray756[local132 + 1];
										local396 = local39[local264];
										local401 = local42[local264];
										local196 = this.anIntArray756[local132];
										local386 = local33[local264];
										local391 = local36[local264];
										for (local421 = local196; local421 < local203; local421++) {
											@Pc(504) int local504 = this.aShortArray136[local421] - 1;
											if (local504 == -1) {
												break;
											}
											if (local49[local504] != 0) {
												local53[local504] += local386;
												local61[local504] += local391;
												local57[local504] += local396;
												local49[local504] += local401;
											}
										}
										local8.method6698();
										this.method6698();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "()[Lclient!fi;")
	@Override
	public Class93[] method6684() {
		return this.aClass93Array7;
	}

	@OriginalMember(owner = "client!uf", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean568) {
			this.method6704();
		}
		return this.anInt8076;
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
	private void method6698() {
		if ((this.anInt8106 & 0x37) == 0) {
			if (this.aClass173_3 == null) {
				return;
			}
			this.aClass173_3.aBoolean353 = false;
		} else if (this.aClass173_1 != null) {
			this.aClass173_1.aBoolean353 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!uf", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt8081;
	}

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		if (this.aClass173_2 != null) {
			this.aClass173_2.aBoolean354 = Static399.method6031(this.anInt8106, arg0);
		}
		if (this.aClass173_4 != null) {
			this.aClass173_4.aBoolean354 = Static255.method4305(arg0, this.anInt8106);
		}
		if (this.aClass173_3 != null) {
			this.aClass173_3.aBoolean354 = Static210.method3585(arg0, this.anInt8106);
		}
		if (this.aClass173_1 != null) {
			this.aClass173_1.aBoolean354 = Static130.method2175(arg0, this.anInt8106);
		}
		this.anInt8081 = arg0;
		if (this.aClass137_1 != null && (this.anInt8081 & 0x10000) == 0) {
			this.aShortArray138 = this.aClass137_1.aShortArray70;
			this.aByteArray114 = this.aClass137_1.aByteArray54;
			this.aShortArray142 = this.aClass137_1.aShortArray69;
			this.aShortArray134 = this.aClass137_1.aShortArray71;
			this.aClass137_1 = null;
		}
		this.aBoolean569 = true;
		this.method6707();
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
	private void method6699() {
		if (this.aClass173_3 != null) {
			this.aClass173_3.aBoolean353 = false;
		}
	}

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)V")
	private void method6700() {
		if (this.aClass281_1 != null) {
			this.aClass281_1.aBoolean557 = false;
		}
	}

	@OriginalMember(owner = "client!uf", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8095; local7++) {
			if (arg0 != 128) {
				this.anIntArray755[local7] = this.anIntArray755[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray757[local7] = arg1 * this.anIntArray757[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray754[local7] = this.anIntArray754[local7] * arg2 >> 7;
			}
		}
		this.method6708();
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean568) {
			this.method6704();
		}
		return this.anInt8120;
	}

	@OriginalMember(owner = "client!uf", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8101; local7++) {
			if (this.aShortArray132[local7] == arg0) {
				this.aShortArray132[local7] = arg1;
			}
		}
		if (this.aClass178Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt8125; local30++) {
				@Pc(37) Class178 local37 = this.aClass178Array1[local30];
				@Pc(42) Class265 local42 = this.aClass265Array1[local30];
				local42.anInt7518 = Static212.anIntArray347[this.aShortArray132[local37.anInt5097] & 0xFFFF] & 0xFFFFFF | local42.anInt7518 & 0xFF000000;
			}
		}
		this.method6699();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZLclient!uf;ZIILclient!uf;)Lclient!r;")
	private Class145 method6701(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class145_Sub3 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class145_Sub3 arg4) {
		arg4.anInt8106 = this.anInt8106;
		arg4.anInt8116 = this.anInt8116;
		arg4.anInt8101 = this.anInt8101;
		arg4.aShort129 = this.aShort129;
		arg4.aShort128 = this.aShort128;
		arg4.anInt8125 = this.anInt8125;
		arg4.anInt8113 = this.anInt8113;
		arg4.anInt8081 = arg3;
		arg4.anInt8077 = this.anInt8077;
		arg4.anInt8095 = this.anInt8095;
		@Pc(50) boolean local50 = Static530.method7340(this.anInt8106, arg3);
		@Pc(56) boolean local56 = Static334.method5103(this.anInt8106, arg3);
		@Pc(62) boolean local62 = Static483.method6631(arg3, this.anInt8106);
		@Pc(73) boolean local73 = local56 | local50 | local62;
		@Pc(178) int local178;
		if (local73) {
			if (!local50) {
				arg4.anIntArray755 = this.anIntArray755;
			} else if (arg1.anIntArray755 == null || arg1.anIntArray755.length < this.anInt8116) {
				arg4.anIntArray755 = arg1.anIntArray755 = new int[this.anInt8116];
			} else {
				arg4.anIntArray755 = arg1.anIntArray755;
			}
			if (!local56) {
				arg4.anIntArray757 = this.anIntArray757;
			} else if (arg1.anIntArray757 == null || arg1.anIntArray757.length < this.anInt8116) {
				arg4.anIntArray757 = arg1.anIntArray757 = new int[this.anInt8116];
			} else {
				arg4.anIntArray757 = arg1.anIntArray757;
			}
			if (!local62) {
				arg4.anIntArray754 = this.anIntArray754;
			} else if (arg1.anIntArray754 == null || this.anInt8116 > arg1.anIntArray754.length) {
				arg4.anIntArray754 = arg1.anIntArray754 = new int[this.anInt8116];
			} else {
				arg4.anIntArray754 = arg1.anIntArray754;
			}
			for (local178 = 0; local178 < this.anInt8116; local178++) {
				if (local50) {
					arg4.anIntArray755[local178] = this.anIntArray755[local178];
				}
				if (local56) {
					arg4.anIntArray757[local178] = this.anIntArray757[local178];
				}
				if (local62) {
					arg4.anIntArray754[local178] = this.anIntArray754[local178];
				}
			}
		} else {
			arg4.anIntArray757 = this.anIntArray757;
			arg4.anIntArray754 = this.anIntArray754;
			arg4.anIntArray755 = this.anIntArray755;
		}
		if (Static399.method6031(this.anInt8106, arg3)) {
			arg4.aClass173_2 = arg1.aClass173_2;
			arg4.aClass173_2.aBoolean354 = true;
			arg4.aClass173_2.aBoolean353 = this.aClass173_2.aBoolean353;
			arg4.aClass173_2.anInterface5_9 = this.aClass173_2.anInterface5_9;
		} else if (Static183.method2894(this.anInt8106, arg3)) {
			arg4.aClass173_2 = this.aClass173_2;
		} else {
			arg4.aClass173_2 = null;
		}
		if (Static529.method7331(this.anInt8106, arg3)) {
			if (arg1.aShortArray132 == null || this.anInt8101 > arg1.aShortArray132.length) {
				arg4.aShortArray132 = arg1.aShortArray132 = new short[this.anInt8101];
			} else {
				arg4.aShortArray132 = arg1.aShortArray132;
			}
			for (local178 = 0; local178 < this.anInt8101; local178++) {
				arg4.aShortArray132[local178] = this.aShortArray132[local178];
			}
		} else {
			arg4.aShortArray132 = this.aShortArray132;
		}
		if (Static85.method1465(arg3, this.anInt8106)) {
			if (arg1.aByteArray115 == null || arg1.aByteArray115.length < this.anInt8101) {
				arg4.aByteArray115 = arg1.aByteArray115 = new byte[this.anInt8101];
			} else {
				arg4.aByteArray115 = arg1.aByteArray115;
			}
			for (local178 = 0; local178 < this.anInt8101; local178++) {
				arg4.aByteArray115[local178] = this.aByteArray115[local178];
			}
		} else {
			arg4.aByteArray115 = this.aByteArray115;
		}
		if (Static210.method3585(arg3, this.anInt8106)) {
			arg4.aClass173_3 = arg1.aClass173_3;
			arg4.aClass173_3.aBoolean354 = true;
			arg4.aClass173_3.aBoolean353 = this.aClass173_3.aBoolean353;
			arg4.aClass173_3.anInterface5_9 = this.aClass173_3.anInterface5_9;
		} else if (Static136.method2256(arg3, this.anInt8106)) {
			arg4.aClass173_3 = this.aClass173_3;
		} else {
			arg4.aClass173_3 = null;
		}
		@Pc(577) int local577;
		if (Static330.method5080(arg3, this.anInt8106)) {
			if (arg1.aShortArray142 == null || arg1.aShortArray142.length < this.anInt8113) {
				local178 = this.anInt8113;
				arg4.aShortArray142 = arg1.aShortArray142 = new short[local178];
				arg4.aShortArray134 = arg1.aShortArray134 = new short[local178];
				arg4.aShortArray138 = arg1.aShortArray138 = new short[local178];
			} else {
				arg4.aShortArray138 = arg1.aShortArray138;
				arg4.aShortArray142 = arg1.aShortArray142;
				arg4.aShortArray134 = arg1.aShortArray134;
			}
			if (this.aClass137_1 == null) {
				arg4.aClass137_1 = null;
				for (local178 = 0; local178 < this.anInt8113; local178++) {
					arg4.aShortArray142[local178] = this.aShortArray142[local178];
					arg4.aShortArray134[local178] = this.aShortArray134[local178];
					arg4.aShortArray138[local178] = this.aShortArray138[local178];
				}
			} else {
				if (arg1.aClass137_1 == null) {
					arg1.aClass137_1 = new Class137();
				}
				@Pc(561) Class137 local561 = arg4.aClass137_1 = arg1.aClass137_1;
				if (local561.aShortArray69 == null || local561.aShortArray69.length < this.anInt8113) {
					local577 = this.anInt8113;
					local561.aShortArray70 = new short[local577];
					local561.aByteArray54 = new byte[local577];
					local561.aShortArray69 = new short[local577];
					local561.aShortArray71 = new short[local577];
				}
				for (local577 = 0; local577 < this.anInt8113; local577++) {
					arg4.aShortArray142[local577] = this.aShortArray142[local577];
					arg4.aShortArray134[local577] = this.aShortArray134[local577];
					arg4.aShortArray138[local577] = this.aShortArray138[local577];
					local561.aShortArray69[local577] = this.aClass137_1.aShortArray69[local577];
					local561.aShortArray71[local577] = this.aClass137_1.aShortArray71[local577];
					local561.aShortArray70[local577] = this.aClass137_1.aShortArray70[local577];
					local561.aByteArray54[local577] = this.aClass137_1.aByteArray54[local577];
				}
			}
			arg4.aByteArray114 = this.aByteArray114;
		} else {
			arg4.aShortArray134 = this.aShortArray134;
			arg4.aShortArray142 = this.aShortArray142;
			arg4.aClass137_1 = this.aClass137_1;
			arg4.aShortArray138 = this.aShortArray138;
			arg4.aByteArray114 = this.aByteArray114;
		}
		if (Static130.method2175(arg3, this.anInt8106)) {
			arg4.aClass173_1 = arg1.aClass173_1;
			arg4.aClass173_1.aBoolean354 = true;
			arg4.aClass173_1.anInterface5_9 = this.aClass173_1.anInterface5_9;
			arg4.aClass173_1.aBoolean353 = this.aClass173_1.aBoolean353;
		} else if (Static441.method6336(this.anInt8106, arg3)) {
			arg4.aClass173_1 = this.aClass173_1;
		} else {
			arg4.aClass173_1 = null;
		}
		if (Static500.method5192(arg3, this.anInt8106)) {
			if (arg1.aFloatArray60 == null || this.anInt8101 > arg1.aFloatArray60.length) {
				local178 = this.anInt8113;
				arg4.aFloatArray60 = arg1.aFloatArray60 = new float[local178];
				arg4.aFloatArray61 = arg1.aFloatArray61 = new float[local178];
			} else {
				arg4.aFloatArray60 = arg1.aFloatArray60;
				arg4.aFloatArray61 = arg1.aFloatArray61;
			}
			for (local178 = 0; local178 < this.anInt8113; local178++) {
				arg4.aFloatArray60[local178] = this.aFloatArray60[local178];
				arg4.aFloatArray61[local178] = this.aFloatArray61[local178];
			}
		} else {
			arg4.aFloatArray61 = this.aFloatArray61;
			arg4.aFloatArray60 = this.aFloatArray60;
		}
		if (Static255.method4305(arg3, this.anInt8106)) {
			arg4.aClass173_4 = arg1.aClass173_4;
			arg4.aClass173_4.aBoolean354 = true;
			arg4.aClass173_4.aBoolean353 = this.aClass173_4.aBoolean353;
			arg4.aClass173_4.anInterface5_9 = this.aClass173_4.anInterface5_9;
		} else if (Static108.method1860(this.anInt8106, arg3)) {
			arg4.aClass173_4 = this.aClass173_4;
		} else {
			arg4.aClass173_4 = null;
		}
		if (Static137.method2259(arg3, this.anInt8106)) {
			if (arg1.aShortArray140 == null || this.anInt8101 > arg1.aShortArray140.length) {
				local178 = this.anInt8101;
				arg4.aShortArray140 = arg1.aShortArray140 = new short[local178];
				arg4.aShortArray131 = arg1.aShortArray131 = new short[local178];
				arg4.aShortArray141 = arg1.aShortArray141 = new short[local178];
			} else {
				arg4.aShortArray131 = arg1.aShortArray131;
				arg4.aShortArray140 = arg1.aShortArray140;
				arg4.aShortArray141 = arg1.aShortArray141;
			}
			for (local178 = 0; local178 < this.anInt8101; local178++) {
				arg4.aShortArray140[local178] = this.aShortArray140[local178];
				arg4.aShortArray141[local178] = this.aShortArray141[local178];
				arg4.aShortArray131[local178] = this.aShortArray131[local178];
			}
		} else {
			arg4.aShortArray141 = this.aShortArray141;
			arg4.aShortArray140 = this.aShortArray140;
			arg4.aShortArray131 = this.aShortArray131;
		}
		if (Static396.method5968(this.anInt8106, arg3)) {
			arg4.aClass281_1 = arg1.aClass281_1;
			arg4.aClass281_1.aBoolean558 = true;
			arg4.aClass281_1.aBoolean557 = this.aClass281_1.aBoolean557;
			arg4.aClass281_1.anInterface1_7 = this.aClass281_1.anInterface1_7;
		} else if (Static3.method207(this.anInt8106, arg3)) {
			arg4.aClass281_1 = this.aClass281_1;
		} else {
			arg4.aClass281_1 = null;
		}
		if (Static489.method6716(this.anInt8106, arg3)) {
			if (arg1.aShortArray139 == null || arg1.aShortArray139.length < this.anInt8101) {
				local178 = this.anInt8101;
				arg4.aShortArray139 = arg1.aShortArray139 = new short[local178];
			} else {
				arg4.aShortArray139 = arg1.aShortArray139;
			}
			for (local178 = 0; local178 < this.anInt8101; local178++) {
				arg4.aShortArray139[local178] = this.aShortArray139[local178];
			}
		} else {
			arg4.aShortArray139 = this.aShortArray139;
		}
		if (!Static163.method2511(arg3, this.anInt8106)) {
			arg4.aClass265Array1 = this.aClass265Array1;
		} else if (arg1.aClass265Array1 == null || this.anInt8125 > arg1.aClass265Array1.length) {
			local178 = this.anInt8125;
			arg4.aClass265Array1 = arg1.aClass265Array1 = new Class265[local178];
			for (local577 = 0; local577 < this.anInt8125; local577++) {
				arg4.aClass265Array1[local577] = this.aClass265Array1[local577].method6291();
			}
		} else {
			arg4.aClass265Array1 = arg1.aClass265Array1;
			for (local178 = 0; local178 < this.anInt8125; local178++) {
				arg4.aClass265Array1[local178].method6287(this.aClass265Array1[local178]);
			}
		}
		arg4.anIntArray758 = this.anIntArray758;
		arg4.aClass161Array7 = this.aClass161Array7;
		if (this.aBoolean568) {
			arg4.anInt8071 = this.anInt8071;
			arg4.anInt8110 = this.anInt8110;
			arg4.anInt8098 = this.anInt8098;
			arg4.anInt8076 = this.anInt8076;
			arg4.anInt8120 = this.anInt8120;
			arg4.anInt8100 = this.anInt8100;
			arg4.anInt8112 = this.anInt8112;
			arg4.aBoolean568 = true;
		} else {
			arg4.aBoolean568 = false;
		}
		arg4.anIntArrayArray108 = this.anIntArrayArray108;
		arg4.aShortArray143 = this.aShortArray143;
		arg4.lb = this.lb;
		arg4.aClass93Array7 = this.aClass93Array7;
		arg4.aShortArray133 = this.aShortArray133;
		arg4.aShortArray136 = this.aShortArray136;
		arg4.aShortArray135 = this.aShortArray135;
		arg4.anIntArrayArray107 = this.anIntArrayArray107;
		arg4.aShortArray137 = this.aShortArray137;
		arg4.anIntArray753 = this.anIntArray753;
		arg4.anIntArray756 = this.anIntArray756;
		arg4.aClass178Array1 = this.aClass178Array1;
		arg4.anIntArray752 = this.anIntArray752;
		return arg4;
	}

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aShort128 = (short) arg0;
		this.method6699();
	}

	@OriginalMember(owner = "client!uf", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8095; local3++) {
			if (arg0 != 0) {
				this.anIntArray755[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray757[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray754[local3] += arg2;
			}
		}
		this.method6708();
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class145 method6672(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class145_Sub3 local16;
		@Pc(12) Class145_Sub3 local12;
		if (arg0 == 1) {
			local12 = this.aClass122_Sub2_18.aClass145_Sub3_27;
			local16 = this.aClass122_Sub2_18.aClass145_Sub3_24;
		} else if (arg0 == 2) {
			local12 = this.aClass122_Sub2_18.aClass145_Sub3_26;
			local16 = this.aClass122_Sub2_18.aClass145_Sub3_30;
		} else if (arg0 == 3) {
			local12 = this.aClass122_Sub2_18.aClass145_Sub3_28;
			local16 = this.aClass122_Sub2_18.aClass145_Sub3_22;
		} else if (arg0 == 4) {
			local12 = this.aClass122_Sub2_18.aClass145_Sub3_29;
			local16 = this.aClass122_Sub2_18.aClass145_Sub3_25;
		} else if (arg0 == 5) {
			local12 = this.aClass122_Sub2_18.aClass145_Sub3_23;
			local16 = this.aClass122_Sub2_18.aClass145_Sub3_21;
		} else {
			local16 = local12 = new Class145_Sub3(this.aClass122_Sub2_18, 0, 0, true, false);
		}
		return this.method6701(arg0 != 0, local12, arg2, arg1, local16);
	}

	@OriginalMember(owner = "client!uf", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean568) {
			this.method6704();
		}
		return this.anInt8098;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!fp;FIJFIIII)S")
	private short method6702(@OriginalArg(1) int arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray756[arg9];
		@Pc(17) int local17 = this.anIntArray756[arg9 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray136[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg4 == Static74.aLongArray3[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray136[local19] = (short) (this.anInt8113 + 1);
		Static74.aLongArray3[local19] = arg4;
		this.aShortArray137[this.anInt8113] = (short) arg0;
		this.aShortArray133[this.anInt8113] = (short) arg9;
		this.aShortArray142[this.anInt8113] = (short) arg6;
		this.aShortArray134[this.anInt8113] = (short) arg8;
		this.aShortArray138[this.anInt8113] = (short) arg3;
		this.aByteArray114[this.anInt8113] = (byte) arg7;
		this.aFloatArray60[this.anInt8113] = arg2;
		this.aFloatArray61[this.anInt8113] = arg5;
		return (short) this.anInt8113++;
	}

	@OriginalMember(owner = "client!uf", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class205 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean568) {
			this.method6704();
		}
		@Pc(16) int local16 = this.anInt8098 + arg4;
		@Pc(21) int local21 = this.anInt8100 + arg4;
		@Pc(26) int local26 = this.anInt8076 + arg6;
		@Pc(31) int local31 = this.anInt8071 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8175 + local21 >> arg2.anInt8176 >= arg2.anInt8174 || local26 < 0 || local31 + arg2.anInt8175 >> arg2.anInt8176 >= arg2.anInt8177)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8174 <= local21 + arg3.anInt8175 >> arg3.anInt8176 || local26 < 0 || arg3.anInt8175 + local31 >> arg3.anInt8176 >= arg3.anInt8177) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8176;
			local21 = arg2.anInt8175 + local21 - 1 >> arg2.anInt8176;
			local26 >>= arg2.anInt8176;
			local31 = local31 + arg2.anInt8175 - 1 >> arg2.anInt8176;
			if (arg2.ba(local16, local26) == arg5 && arg2.ba(local21, local26) == arg5 && arg5 == arg2.ba(local16, local31) && arg2.ba(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt8095; local195++) {
				this.anIntArray757[local195] = this.anIntArray757[local195] + arg2.aa(this.anIntArray755[local195] + arg4, arg6 + this.anIntArray754[local195]) - arg5;
			}
		} else {
			@Pc(249) int local249;
			@Pc(260) int local260;
			if (arg0 == 2) {
				local195 = this.anInt8110;
				if (local195 == 0) {
					return;
				}
				for (local249 = 0; local249 < this.anInt8095; local249++) {
					local260 = (this.anIntArray757[local249] << 16) / local195;
					if (arg1 > local260) {
						this.anIntArray757[local249] -= -((arg1 - local260) * (-arg5 + arg2.aa(arg4 + this.anIntArray755[local249], arg6 + this.anIntArray754[local249])) / arg1);
					}
				}
			} else {
				@Pc(340) int local340;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 4;
					local249 = (arg1 >> 8 & 0xFF) * 4;
					local260 = (arg1 >> 16 & 0xFF) << 6;
					local340 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt8175 >= arg2.anInt8174 << arg2.anInt8176 || arg6 - (local249 >> 1) < 0 || arg2.anInt8177 << arg2.anInt8176 <= arg2.anInt8175 + (local249 >> 1) + arg6) {
						return;
					}
					this.method6673(local260, local195, local249, arg2, arg5, local340, arg4, arg6);
				} else if (arg0 == 4) {
					local195 = this.anInt8112 - this.anInt8110;
					for (local249 = 0; local249 < this.anInt8095; local249++) {
						this.anIntArray757[local249] = local195 + this.anIntArray757[local249] + arg3.aa(arg4 + this.anIntArray755[local249], arg6 + this.anIntArray754[local249]) - arg5;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt8112 - this.anInt8110;
					for (local249 = 0; local249 < this.anInt8095; local249++) {
						local260 = this.anIntArray755[local249] + arg4;
						local340 = this.anIntArray754[local249] + arg6;
						@Pc(345) int local345 = arg2.aa(local260, local340);
						@Pc(350) int local350 = arg3.aa(local260, local340);
						@Pc(354) int local354 = local345 - local350;
						this.anIntArray757[local249] = ((this.anIntArray757[local249] << 8) / local195 * local354 >> 8) + local345 - arg5;
					}
				}
			}
		}
		this.method6708();
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean568) {
			this.method6704();
		}
		return this.anInt8112;
	}

	@OriginalMember(owner = "client!uf", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean568) {
			this.method6704();
		}
		return this.anInt8100;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt8101; local7++) {
			local16 = this.aShortArray132[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			@Pc(61) int local61 = local16 & 0x7F;
			if (arg2 != -1) {
				local61 += arg3 * (arg2 - local61) >> 7;
			}
			this.aShortArray132[local7] = (short) (local28 << 7 | local22 << 10 | local61);
		}
		if (this.aClass178Array1 != null) {
			for (local16 = 0; local16 < this.anInt8125; local16++) {
				@Pc(109) Class178 local109 = this.aClass178Array1[local16];
				@Pc(114) Class265 local114 = this.aClass265Array1[local16];
				local114.anInt7518 = Static212.anIntArray347[this.aShortArray132[local109.anInt5097] & 0xFFFF] & 0xFFFFFF | local114.anInt7518 & 0xFF000000;
			}
		}
		this.method6699();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!m;Lclient!eca;II)V")
	@Override
	public void method6676(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class72_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8113 == 0) {
			return;
		}
		@Pc(13) Class118_Sub3 local13 = this.aClass122_Sub2_18.aClass118_Sub3_16;
		@Pc(16) Class118_Sub3 local16 = (Class118_Sub3) arg0;
		if (!this.aBoolean568) {
			this.method6704();
		}
		Static129.aFloat28 = local13.aFloat192 * local16.aFloat194 + local16.aFloat185 * local13.aFloat186 + local16.aFloat187 * local13.aFloat189 + local13.aFloat187;
		Static40.aFloat12 = local16.aFloat186 * local13.aFloat189 + local13.aFloat192 * local16.aFloat193 + local16.aFloat190 * local13.aFloat186;
		@Pc(69) float local69 = Static129.aFloat28 + (float) this.anInt8110 * Static40.aFloat12;
		@Pc(77) float local77 = (float) this.anInt8112 * Static40.aFloat12 + Static129.aFloat28;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local93 = (float) this.anInt8120 + local69;
			local87 = local77 - (float) this.anInt8120;
		} else {
			local87 = local69 - (float) this.anInt8120;
			local93 = (float) this.anInt8120 + local77;
		}
		if (local87 >= this.aClass122_Sub2_18.aFloat125 || (float) this.aClass122_Sub2_18.anInt6728 >= local93) {
			return;
		}
		Static35.aFloat7 = local13.aFloat196 * local16.aFloat186 + local16.aFloat193 * local13.aFloat191 + local16.aFloat190 * local13.aFloat193;
		Static102.aFloat16 = local13.aFloat194 + local13.aFloat196 * local16.aFloat187 + local16.aFloat185 * local13.aFloat193 + local16.aFloat194 * local13.aFloat191;
		@Pc(169) float local169 = Static102.aFloat16 + Static35.aFloat7 * (float) this.anInt8110;
		@Pc(177) float local177 = (float) this.anInt8112 * Static35.aFloat7 + Static102.aFloat16;
		@Pc(203) float local203;
		@Pc(192) float local192;
		if (local177 < local169) {
			local203 = ((float) -this.anInt8120 + local177) * (float) this.aClass122_Sub2_18.anInt6711;
			local192 = (float) this.aClass122_Sub2_18.anInt6711 * ((float) this.anInt8120 + local169);
		} else {
			local192 = (float) this.aClass122_Sub2_18.anInt6711 * (local177 + (float) this.anInt8120);
			local203 = (float) this.aClass122_Sub2_18.anInt6711 * (local169 - (float) this.anInt8120);
		}
		if (local203 / (float) arg2 >= this.aClass122_Sub2_18.aFloat133 || this.aClass122_Sub2_18.aFloat124 >= local192 / (float) arg2) {
			return;
		}
		Static476.aFloat154 = local13.aFloat190 * local16.aFloat190 + local16.aFloat193 * local13.aFloat195 + local13.aFloat188 * local16.aFloat186;
		Static246.aFloat102 = local16.aFloat187 * local13.aFloat188 + local16.aFloat194 * local13.aFloat195 + local16.aFloat185 * local13.aFloat190 + local13.aFloat185;
		@Pc(295) float local295 = (float) this.anInt8110 * Static476.aFloat154 + Static246.aFloat102;
		@Pc(303) float local303 = (float) this.anInt8112 * Static476.aFloat154 + Static246.aFloat102;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local295 > local303) {
			local330 = (local303 - (float) this.anInt8120) * (float) this.aClass122_Sub2_18.anInt6706;
			local318 = (float) this.aClass122_Sub2_18.anInt6706 * (local295 + (float) this.anInt8120);
		} else {
			local318 = (float) this.aClass122_Sub2_18.anInt6706 * ((float) this.anInt8120 + local303);
			local330 = ((float) -this.anInt8120 + local295) * (float) this.aClass122_Sub2_18.anInt6706;
		}
		if (local330 / (float) arg2 >= this.aClass122_Sub2_18.aFloat138 || this.aClass122_Sub2_18.aFloat134 >= local318 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass178Array1 != null) {
			Static248.aFloat24 = local13.aFloat192 * local16.aFloat191 + local16.aFloat195 * local13.aFloat186 + local16.aFloat192 * local13.aFloat189;
			Static139.aFloat32 = local13.aFloat186 * local16.aFloat188 + local13.aFloat192 * local16.aFloat196 + local16.aFloat189 * local13.aFloat189;
			Static528.aFloat199 = local16.aFloat192 * local13.aFloat188 + local16.aFloat191 * local13.aFloat195 + local16.aFloat195 * local13.aFloat190;
			Static125.aFloat27 = local16.aFloat189 * local13.aFloat188 + local13.aFloat190 * local16.aFloat188 + local13.aFloat195 * local16.aFloat196;
			Static11.aFloat4 = local16.aFloat195 * local13.aFloat193 + local16.aFloat191 * local13.aFloat191 + local13.aFloat196 * local16.aFloat192;
			Static289.aFloat110 = local16.aFloat196 * local13.aFloat191 + local13.aFloat193 * local16.aFloat188 + local13.aFloat196 * local16.aFloat189;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.anInt8098 + this.anInt8100 >> 1;
			@Pc(507) int local507 = this.anInt8076 + this.anInt8071 >> 1;
			@Pc(526) int local526 = (int) (Static289.aFloat110 * (float) local507 + Static102.aFloat16 + (float) local498 * Static11.aFloat4 + Static35.aFloat7 * (float) this.anInt8110);
			@Pc(545) int local545 = (int) (Static125.aFloat27 * (float) local507 + Static246.aFloat102 + Static528.aFloat199 * (float) local498 + Static476.aFloat154 * (float) this.anInt8110);
			@Pc(564) int local564 = (int) ((float) this.anInt8110 * Static40.aFloat12 + Static129.aFloat28 + Static248.aFloat24 * (float) local498 + Static139.aFloat32 * (float) local507);
			@Pc(583) int local583 = (int) (Static289.aFloat110 * (float) local507 + Static35.aFloat7 * (float) this.anInt8112 + (float) local498 * Static11.aFloat4 + Static102.aFloat16);
			@Pc(602) int local602 = (int) (Static476.aFloat154 * (float) this.anInt8112 + Static528.aFloat199 * (float) local498 + Static246.aFloat102 + Static125.aFloat27 * (float) local507);
			@Pc(621) int local621 = (int) ((float) local507 * Static139.aFloat32 + (float) this.anInt8112 * Static40.aFloat12 + Static129.aFloat28 + (float) local498 * Static248.aFloat24);
			arg1.anInt2130 = this.aClass122_Sub2_18.anInt6713 + this.aClass122_Sub2_18.anInt6711 * local526 / arg2;
			arg1.anInt2132 = local583 * this.aClass122_Sub2_18.anInt6711 / arg2 + this.aClass122_Sub2_18.anInt6713;
			arg1.anInt2131 = local545 * this.aClass122_Sub2_18.anInt6706 / arg2 + this.aClass122_Sub2_18.anInt6718;
			arg1.anInt2133 = this.aClass122_Sub2_18.anInt6718 + local602 * this.aClass122_Sub2_18.anInt6706 / arg2;
			if (local564 < this.aClass122_Sub2_18.anInt6728 && this.aClass122_Sub2_18.anInt6728 > local621) {
				arg1.aBoolean129 = true;
				arg1.anInt2129 = this.aClass122_Sub2_18.anInt6713 + (local526 + this.anInt8120) * this.aClass122_Sub2_18.anInt6711 / arg2 - arg1.anInt2130;
			}
		}
		this.aClass122_Sub2_18.method5613((float) arg2);
		this.aClass122_Sub2_18.method5598();
		this.aClass122_Sub2_18.method5562(local16);
		this.method6693();
		this.method6692();
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "()Z")
	@Override
	public boolean method6670() {
		if (this.aShortArray139 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray139.length; local12++) {
			if (this.aShortArray139[local12] != -1 && !this.aClass122_Sub2_18.anInterface8_14.method879(this.aShortArray139[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class310.anIntArray827[arg0];
		@Pc(13) int local13 = Class310.anIntArray826[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8095; local15++) {
			local33 = this.anIntArray755[local15] * local13 + local9 * this.anIntArray754[local15] >> 14;
			this.anIntArray754[local15] = this.anIntArray754[local15] * local13 - local9 * this.anIntArray755[local15] >> 14;
			this.anIntArray755[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt8113; local33++) {
			@Pc(87) int local87 = local13 * this.aShortArray142[local33] + this.aShortArray138[local33] * local9 >> 14;
			this.aShortArray138[local33] = (short) (this.aShortArray138[local33] * local13 - this.aShortArray142[local33] * local9 >> 14);
			this.aShortArray142[local33] = (short) local87;
		}
		this.method6708();
		this.method6698();
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!oca;I)V")
	private void method6703(@OriginalArg(0) Class1_Sub1_Sub9_Sub2 arg0) {
		if (this.anInt8113 > Static189.anIntArray314.length) {
			Static175.anIntArray291 = new int[this.anInt8113];
			Static189.anIntArray314 = new int[this.anInt8113];
		}
		@Pc(52) int local52;
		@Pc(90) int local90;
		@Pc(99) int local99;
		for (@Pc(26) int local26 = 0; local26 < this.anInt8095; local26++) {
			local52 = (this.anIntArray755[local26] - (this.anIntArray757[local26] * this.aClass122_Sub2_18.anInt6697 >> 8) >> this.aClass122_Sub2_18.anInt6714) - arg0.anInt6060;
			@Pc(76) int local76 = (this.anIntArray754[local26] - (this.anIntArray757[local26] * this.aClass122_Sub2_18.anInt6710 >> 8) >> this.aClass122_Sub2_18.anInt6714) - arg0.anInt6058;
			@Pc(81) int local81 = this.anIntArray756[local26];
			@Pc(88) int local88 = this.anIntArray756[local26 + 1];
			for (local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray136[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static189.anIntArray314[local99] = local52;
				Static175.anIntArray291[local99] = local76;
			}
		}
		for (local52 = 0; local52 < this.anInt8077; local52++) {
			if (this.aByteArray115 == null || this.aByteArray115[local52] <= 128) {
				@Pc(148) short local148 = this.aShortArray140[local52];
				@Pc(153) short local153 = this.aShortArray141[local52];
				@Pc(158) short local158 = this.aShortArray131[local52];
				local90 = Static189.anIntArray314[local148];
				local99 = Static189.anIntArray314[local153];
				@Pc(170) int local170 = Static189.anIntArray314[local158];
				@Pc(174) int local174 = Static175.anIntArray291[local148];
				@Pc(178) int local178 = Static175.anIntArray291[local153];
				@Pc(182) int local182 = Static175.anIntArray291[local158];
				if (-((local178 - local174) * (-local99 + local170)) + (local178 - local182) * (local90 - local99) > 0) {
					arg0.method5136(local174, local178, local170, local99, local90, local182);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "()[Lclient!kca;")
	@Override
	public Class161[] method6677() {
		return this.aClass161Array7;
	}

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "(I)V")
	private void method6704() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt8095; local23++) {
			@Pc(30) int local30 = this.anIntArray755[local23];
			@Pc(35) int local35 = this.anIntArray757[local23];
			if (local30 > local13) {
				local13 = local30;
			}
			@Pc(49) int local49 = this.anIntArray754[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local17 < local49) {
				local17 = local49;
			}
			if (local49 < local11) {
				local11 = local49;
			}
			@Pc(99) int local99 = local30 * local30 + local49 * local49;
			if (local99 > local19) {
				local19 = local99;
			}
			local99 = local49 * local49 + local30 * local30 + local35 * local35;
			if (local99 > local21) {
				local21 = local99;
			}
		}
		this.anInt8076 = local11;
		this.anInt8110 = local9;
		this.anInt8071 = local17;
		this.anInt8098 = local7;
		this.anInt8100 = local13;
		this.anInt8112 = local15;
		this.anInt8120 = (int) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean568 = true;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method6683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class118_Sub3 local8 = (Class118_Sub3) arg2;
		@Pc(12) Class118_Sub3 local12 = this.aClass122_Sub2_18.aClass118_Sub3_16;
		@Pc(33) float local33 = local12.aFloat194 + local8.aFloat187 * local12.aFloat196 + local8.aFloat185 * local12.aFloat193 + local8.aFloat194 * local12.aFloat191;
		@Pc(54) float local54 = local12.aFloat185 + local12.aFloat190 * local8.aFloat185 + local12.aFloat195 * local8.aFloat194 + local8.aFloat187 * local12.aFloat188;
		Static35.aFloat7 = local12.aFloat196 * local8.aFloat186 + local8.aFloat190 * local12.aFloat193 + local8.aFloat193 * local12.aFloat191;
		Static11.aFloat4 = local12.aFloat196 * local8.aFloat192 + local8.aFloat195 * local12.aFloat193 + local12.aFloat191 * local8.aFloat191;
		Static476.aFloat154 = local12.aFloat190 * local8.aFloat190 + local8.aFloat193 * local12.aFloat195 + local8.aFloat186 * local12.aFloat188;
		Static125.aFloat27 = local12.aFloat195 * local8.aFloat196 + local8.aFloat188 * local12.aFloat190 + local8.aFloat189 * local12.aFloat188;
		Static528.aFloat199 = local12.aFloat188 * local8.aFloat192 + local8.aFloat195 * local12.aFloat190 + local8.aFloat191 * local12.aFloat195;
		Static248.aFloat24 = local12.aFloat186 * local8.aFloat195 + local8.aFloat191 * local12.aFloat192 + local12.aFloat189 * local8.aFloat192;
		Static289.aFloat110 = local8.aFloat189 * local12.aFloat196 + local8.aFloat196 * local12.aFloat191 + local12.aFloat193 * local8.aFloat188;
		@Pc(201) float local201 = local12.aFloat189 * local8.aFloat187 + local8.aFloat194 * local12.aFloat192 + local8.aFloat185 * local12.aFloat186 + local12.aFloat187;
		Static139.aFloat32 = local12.aFloat186 * local8.aFloat188 + local12.aFloat192 * local8.aFloat196 + local12.aFloat189 * local8.aFloat189;
		Static40.aFloat12 = local8.aFloat186 * local12.aFloat189 + local8.aFloat190 * local12.aFloat186 + local8.aFloat193 * local12.aFloat192;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass122_Sub2_18.anInt6711;
		@Pc(255) int local255 = this.aClass122_Sub2_18.anInt6706;
		if (!this.aBoolean568) {
			this.method6704();
		}
		Static326.anIntArray593[0] = this.anInt8098;
		Static495.anIntArray845[0] = this.anInt8110;
		Static331.anIntArray605[0] = this.anInt8076;
		Static326.anIntArray593[1] = this.anInt8100;
		Static495.anIntArray845[1] = this.anInt8110;
		Static326.anIntArray593[2] = this.anInt8098;
		Static331.anIntArray605[1] = this.anInt8076;
		Static495.anIntArray845[2] = this.anInt8112;
		Static326.anIntArray593[3] = this.anInt8100;
		Static331.anIntArray605[2] = this.anInt8076;
		Static495.anIntArray845[3] = this.anInt8112;
		Static326.anIntArray593[4] = this.anInt8098;
		Static331.anIntArray605[3] = this.anInt8076;
		Static495.anIntArray845[4] = this.anInt8110;
		Static326.anIntArray593[5] = this.anInt8100;
		Static331.anIntArray605[4] = this.anInt8071;
		Static495.anIntArray845[5] = this.anInt8110;
		Static331.anIntArray605[5] = this.anInt8071;
		Static326.anIntArray593[6] = this.anInt8098;
		Static495.anIntArray845[6] = this.anInt8112;
		Static331.anIntArray605[6] = this.anInt8071;
		Static326.anIntArray593[7] = this.anInt8100;
		Static495.anIntArray845[7] = this.anInt8112;
		Static331.anIntArray605[7] = this.anInt8071;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static495.anIntArray845[local383];
			local395 = Static326.anIntArray593[local383];
			local400 = Static331.anIntArray605[local383];
			local414 = local400 * Static139.aFloat32 + Static40.aFloat12 * local390 + local395 * Static248.aFloat24 + local201;
			local428 = local54 + Static528.aFloat199 * local395 + Static476.aFloat154 * local390 + Static125.aFloat27 * local400;
			local442 = Static35.aFloat7 * local390 + local395 * Static11.aFloat4 + local400 * Static289.aFloat110 + local33;
			if ((float) this.aClass122_Sub2_18.anInt6728 <= local414) {
				@Pc(461) float local461 = (float) this.aClass122_Sub2_18.anInt6713 + (float) local251 * local442 / local414;
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(479) float local479 = local428 * (float) local255 / local414 + (float) this.aClass122_Sub2_18.anInt6718;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local479 < local245) {
					local245 = local479;
				}
				local239 = true;
				if (local247 < local479) {
					local247 = local479;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (Static189.anIntArray314.length < this.anInt8113) {
				Static175.anIntArray291 = new int[this.anInt8113];
				Static189.anIntArray314 = new int[this.anInt8113];
			}
			@Pc(628) int local628;
			for (@Pc(546) int local546 = 0; local546 < this.anInt8095; local546++) {
				local395 = this.anIntArray755[local546];
				local400 = this.anIntArray754[local546];
				local390 = this.anIntArray757[local546];
				local442 = Static11.aFloat4 * local395 + Static35.aFloat7 * local390 + Static289.aFloat110 * local400 + local33;
				local428 = local54 + Static476.aFloat154 * local390 + local395 * Static528.aFloat199 + local400 * Static125.aFloat27;
				local414 = Static139.aFloat32 * local400 + local395 * Static248.aFloat24 + Static40.aFloat12 * local390 + local201;
				@Pc(641) int local641;
				@Pc(646) int local646;
				@Pc(653) int local653;
				if ((float) this.aClass122_Sub2_18.anInt6728 <= local414) {
					local628 = (int) ((float) local251 * local442 / local414 + (float) this.aClass122_Sub2_18.anInt6713);
					local641 = (int) ((float) this.aClass122_Sub2_18.anInt6718 + local428 * (float) local255 / local414);
					local646 = this.anIntArray756[local546];
					local653 = this.anIntArray756[local546 + 1];
					for (@Pc(655) int local655 = local646; local655 < local653; local655++) {
						@Pc(664) int local664 = this.aShortArray136[local655] - 1;
						if (local664 == -1) {
							break;
						}
						Static189.anIntArray314[local664] = local628;
						Static175.anIntArray291[local664] = local641;
					}
				} else {
					local628 = this.anIntArray756[local546];
					local641 = this.anIntArray756[local546 + 1];
					for (local646 = local628; local646 < local641; local646++) {
						local653 = this.aShortArray136[local646] - 1;
						if (local653 == -1) {
							break;
						}
						Static189.anIntArray314[this.aShortArray136[local646] - 1] = -999999;
					}
				}
			}
			for (local628 = 0; local628 < this.anInt8101; local628++) {
				if (Static189.anIntArray314[this.aShortArray140[local628]] != -999999 && Static189.anIntArray314[this.aShortArray141[local628]] != -999999 && Static189.anIntArray314[this.aShortArray131[local628]] != -999999 && this.method6697(arg1, Static175.anIntArray291[this.aShortArray131[local628]], Static175.anIntArray291[this.aShortArray140[local628]], Static189.anIntArray314[this.aShortArray140[local628]], Static189.anIntArray314[this.aShortArray131[local628]], Static189.anIntArray314[this.aShortArray141[local628]], arg0, Static175.anIntArray291[this.aShortArray141[local628]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uf", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class1_Sub1_Sub9 EA(@OriginalArg(0) Class1_Sub1_Sub9 arg0) {
		if (this.anInt8113 == 0) {
			return null;
		}
		if (!this.aBoolean568) {
			this.method6704();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass122_Sub2_18.anInt6697 <= 0) {
			local39 = this.anInt8098 - (this.anInt8110 * this.aClass122_Sub2_18.anInt6697 >> 8) >> this.aClass122_Sub2_18.anInt6714;
			local56 = this.anInt8100 - (this.anInt8112 * this.aClass122_Sub2_18.anInt6697 >> 8) >> this.aClass122_Sub2_18.anInt6714;
		} else {
			local39 = this.anInt8098 - (this.aClass122_Sub2_18.anInt6697 * this.anInt8112 >> 8) >> this.aClass122_Sub2_18.anInt6714;
			local56 = this.anInt8100 - (this.aClass122_Sub2_18.anInt6697 * this.anInt8110 >> 8) >> this.aClass122_Sub2_18.anInt6714;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass122_Sub2_18.anInt6710 <= 0) {
			local113 = this.anInt8076 - (this.anInt8110 * this.aClass122_Sub2_18.anInt6710 >> 8) >> this.aClass122_Sub2_18.anInt6714;
			local130 = this.anInt8071 - (this.anInt8112 * this.aClass122_Sub2_18.anInt6710 >> 8) >> this.aClass122_Sub2_18.anInt6714;
		} else {
			local113 = this.anInt8076 - (this.aClass122_Sub2_18.anInt6710 * this.anInt8112 >> 8) >> this.aClass122_Sub2_18.anInt6714;
			local130 = this.anInt8071 - (this.anInt8110 * this.aClass122_Sub2_18.anInt6710 >> 8) >> this.aClass122_Sub2_18.anInt6714;
		}
		@Pc(173) int local173 = local56 + 1 - local39;
		@Pc(179) int local179 = local130 + 1 - local113;
		@Pc(182) Class1_Sub1_Sub9_Sub2 local182 = (Class1_Sub1_Sub9_Sub2) arg0;
		@Pc(198) Class1_Sub1_Sub9_Sub2 local198;
		if (local182 != null && local182.method5130(local173, local179)) {
			local198 = local182;
			local182.method5132();
		} else {
			local198 = new Class1_Sub1_Sub9_Sub2(this.aClass122_Sub2_18, local173, local179);
		}
		local198.method5135(local39, local130, local56, local113);
		this.method6703(local198);
		return local198;
	}

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class310.anIntArray827[arg0];
		@Pc(13) int local13 = Class310.anIntArray826[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8095; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray757[local15] - this.anIntArray754[local15] * local9 >> 14;
			this.anIntArray754[local15] = local9 * this.anIntArray757[local15] + local13 * this.anIntArray754[local15] >> 14;
			this.anIntArray757[local15] = local33;
		}
		this.method6708();
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!uf", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8095; local3++) {
			this.anIntArray754[local3] = -this.anIntArray754[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt8113; local29++) {
			this.aShortArray138[local29] = (short) -this.aShortArray138[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt8101; local52++) {
			@Pc(59) short local59 = this.aShortArray140[local52];
			this.aShortArray140[local52] = this.aShortArray131[local52];
			this.aShortArray131[local52] = local59;
		}
		this.method6708();
		this.method6698();
		this.method6700();
		this.aBoolean568 = false;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!m;Lclient!eca;I)V")
	@Override
	public void method6686(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class72_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8113 == 0) {
			return;
		}
		@Pc(13) Class118_Sub3 local13 = this.aClass122_Sub2_18.aClass118_Sub3_16;
		@Pc(16) Class118_Sub3 local16 = (Class118_Sub3) arg0;
		if (!this.aBoolean568) {
			this.method6704();
		}
		this.method6706(local16);
		Static129.aFloat28 = local16.aFloat194 * local13.aFloat192 + local16.aFloat185 * local13.aFloat186 + local13.aFloat189 * local16.aFloat187 + local13.aFloat187;
		Static40.aFloat12 = local16.aFloat193 * local13.aFloat192 + local13.aFloat186 * local16.aFloat190 + local13.aFloat189 * local16.aFloat186;
		@Pc(73) float local73 = (float) this.anInt8110 * Static40.aFloat12 + Static129.aFloat28;
		@Pc(81) float local81 = (float) this.anInt8112 * Static40.aFloat12 + Static129.aFloat28;
		@Pc(98) float local98;
		@Pc(91) float local91;
		if (local73 > local81) {
			local91 = (float) this.anInt8120 + local73;
			local98 = (float) -this.anInt8120 + local81;
		} else {
			local91 = (float) this.anInt8120 + local81;
			local98 = (float) -this.anInt8120 + local73;
		}
		if (local98 >= this.aClass122_Sub2_18.aFloat128 || (float) this.aClass122_Sub2_18.anInt6728 >= local91) {
			return;
		}
		Static102.aFloat16 = local13.aFloat194 + local16.aFloat194 * local13.aFloat191 + local13.aFloat193 * local16.aFloat185 + local16.aFloat187 * local13.aFloat196;
		Static35.aFloat7 = local13.aFloat196 * local16.aFloat186 + local13.aFloat193 * local16.aFloat190 + local13.aFloat191 * local16.aFloat193;
		@Pc(175) float local175 = Static35.aFloat7 * (float) this.anInt8110 + Static102.aFloat16;
		@Pc(183) float local183 = Static35.aFloat7 * (float) this.anInt8112 + Static102.aFloat16;
		@Pc(210) float local210;
		@Pc(198) float local198;
		if (local183 < local175) {
			local198 = (float) this.aClass122_Sub2_18.anInt6711 * (local175 + (float) this.anInt8120);
			local210 = ((float) -this.anInt8120 + local183) * (float) this.aClass122_Sub2_18.anInt6711;
		} else {
			local210 = ((float) -this.anInt8120 + local175) * (float) this.aClass122_Sub2_18.anInt6711;
			local198 = (local183 + (float) this.anInt8120) * (float) this.aClass122_Sub2_18.anInt6711;
		}
		if (local210 / local91 >= this.aClass122_Sub2_18.aFloat133 || this.aClass122_Sub2_18.aFloat124 >= local198 / local91) {
			return;
		}
		Static476.aFloat154 = local13.aFloat190 * local16.aFloat190 + local13.aFloat195 * local16.aFloat193 + local13.aFloat188 * local16.aFloat186;
		Static246.aFloat102 = local13.aFloat185 + local13.aFloat190 * local16.aFloat185 + local16.aFloat194 * local13.aFloat195 + local16.aFloat187 * local13.aFloat188;
		@Pc(300) float local300 = (float) this.anInt8110 * Static476.aFloat154 + Static246.aFloat102;
		@Pc(308) float local308 = (float) this.anInt8112 * Static476.aFloat154 + Static246.aFloat102;
		@Pc(335) float local335;
		@Pc(323) float local323;
		if (local308 < local300) {
			local323 = (local300 + (float) this.anInt8120) * (float) this.aClass122_Sub2_18.anInt6706;
			local335 = ((float) -this.anInt8120 + local308) * (float) this.aClass122_Sub2_18.anInt6706;
		} else {
			local323 = (local308 + (float) this.anInt8120) * (float) this.aClass122_Sub2_18.anInt6706;
			local335 = ((float) -this.anInt8120 + local300) * (float) this.aClass122_Sub2_18.anInt6706;
		}
		if (local335 / local91 >= this.aClass122_Sub2_18.aFloat138 || local323 / local91 <= this.aClass122_Sub2_18.aFloat134) {
			return;
		}
		if (arg1 != null || this.aClass178Array1 != null) {
			Static248.aFloat24 = local13.aFloat186 * local16.aFloat195 + local16.aFloat191 * local13.aFloat192 + local16.aFloat192 * local13.aFloat189;
			Static139.aFloat32 = local16.aFloat189 * local13.aFloat189 + local16.aFloat188 * local13.aFloat186 + local13.aFloat192 * local16.aFloat196;
			Static125.aFloat27 = local16.aFloat188 * local13.aFloat190 + local13.aFloat195 * local16.aFloat196 + local16.aFloat189 * local13.aFloat188;
			Static289.aFloat110 = local16.aFloat189 * local13.aFloat196 + local13.aFloat193 * local16.aFloat188 + local16.aFloat196 * local13.aFloat191;
			Static528.aFloat199 = local16.aFloat195 * local13.aFloat190 + local16.aFloat191 * local13.aFloat195 + local13.aFloat188 * local16.aFloat192;
			Static11.aFloat4 = local13.aFloat196 * local16.aFloat192 + local13.aFloat193 * local16.aFloat195 + local13.aFloat191 * local16.aFloat191;
		}
		if (arg1 != null) {
			@Pc(495) boolean local495 = false;
			@Pc(497) boolean local497 = true;
			@Pc(505) int local505 = this.anInt8100 + this.anInt8098 >> 1;
			@Pc(513) int local513 = this.anInt8071 + this.anInt8076 >> 1;
			@Pc(532) int local532 = (int) (Static289.aFloat110 * (float) local513 + (float) this.anInt8110 * Static35.aFloat7 + Static102.aFloat16 + (float) local505 * Static11.aFloat4);
			@Pc(551) int local551 = (int) (Static528.aFloat199 * (float) local505 + Static246.aFloat102 + (float) this.anInt8110 * Static476.aFloat154 + (float) local513 * Static125.aFloat27);
			@Pc(570) int local570 = (int) (Static248.aFloat24 * (float) local505 + Static129.aFloat28 + Static40.aFloat12 * (float) this.anInt8110 + (float) local513 * Static139.aFloat32);
			if (local570 < this.aClass122_Sub2_18.anInt6728) {
				local495 = true;
			} else {
				arg1.anInt2131 = this.aClass122_Sub2_18.anInt6718 + this.aClass122_Sub2_18.anInt6706 * local551 / local570;
				arg1.anInt2130 = this.aClass122_Sub2_18.anInt6711 * local532 / local570 + this.aClass122_Sub2_18.anInt6713;
			}
			@Pc(629) int local629 = (int) ((float) this.anInt8112 * Static35.aFloat7 + Static102.aFloat16 + (float) local505 * Static11.aFloat4 + (float) local513 * Static289.aFloat110);
			@Pc(648) int local648 = (int) (Static125.aFloat27 * (float) local513 + Static246.aFloat102 + (float) local505 * Static528.aFloat199 + Static476.aFloat154 * (float) this.anInt8112);
			@Pc(667) int local667 = (int) ((float) this.anInt8112 * Static40.aFloat12 + Static129.aFloat28 + (float) local505 * Static248.aFloat24 + Static139.aFloat32 * (float) local513);
			if (local667 < this.aClass122_Sub2_18.anInt6728) {
				local495 = true;
			} else {
				arg1.anInt2133 = this.aClass122_Sub2_18.anInt6718 + local648 * this.aClass122_Sub2_18.anInt6706 / local667;
				arg1.anInt2132 = local629 * this.aClass122_Sub2_18.anInt6711 / local667 + this.aClass122_Sub2_18.anInt6713;
			}
			if (local495) {
				if (this.aClass122_Sub2_18.anInt6728 > local570 && this.aClass122_Sub2_18.anInt6728 > local667) {
					local497 = false;
				} else {
					@Pc(737) int local737;
					@Pc(747) int local747;
					@Pc(758) int local758;
					if (this.aClass122_Sub2_18.anInt6728 > local570) {
						local737 = (local667 - this.aClass122_Sub2_18.anInt6728 << 16) / (local667 - local570);
						local747 = ((local629 - local532) * local737 >> 16) + local629;
						local758 = ((local648 - local551) * local737 >> 16) + local648;
						arg1.anInt2130 = this.aClass122_Sub2_18.anInt6711 * local747 / this.aClass122_Sub2_18.anInt6728 + this.aClass122_Sub2_18.anInt6713;
						arg1.anInt2131 = this.aClass122_Sub2_18.anInt6718 + this.aClass122_Sub2_18.anInt6706 * local758 / this.aClass122_Sub2_18.anInt6728;
					} else if (local667 < this.aClass122_Sub2_18.anInt6728) {
						local737 = (local570 - this.aClass122_Sub2_18.anInt6728 << 16) / (local570 - local667);
						local747 = (local737 * (local532 - local629) >> 16) + local532;
						local758 = local551 + (local737 * (local551 - local648) >> 16);
						arg1.anInt2130 = this.aClass122_Sub2_18.anInt6713 + this.aClass122_Sub2_18.anInt6711 * local747 / this.aClass122_Sub2_18.anInt6728;
						arg1.anInt2131 = this.aClass122_Sub2_18.anInt6718 + this.aClass122_Sub2_18.anInt6706 * local758 / this.aClass122_Sub2_18.anInt6728;
					}
				}
			}
			if (local497) {
				arg1.aBoolean129 = true;
				if (local570 > local667) {
					arg1.anInt2129 = (local532 + this.anInt8120) * this.aClass122_Sub2_18.anInt6711 / local570 + this.aClass122_Sub2_18.anInt6713 - arg1.anInt2130;
				} else {
					arg1.anInt2129 = this.aClass122_Sub2_18.anInt6711 * (this.anInt8120 + local629) / local667 + this.aClass122_Sub2_18.anInt6713 - arg1.anInt2132;
				}
			}
		}
		this.aClass122_Sub2_18.method5639();
		this.aClass122_Sub2_18.method5562(local16);
		this.method6693();
		this.method6692();
	}

	@OriginalMember(owner = "client!uf", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean568) {
			this.method6704();
		}
		return this.anInt8071;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLclient!uw;)V")
	private void method6706(@OriginalArg(1) Class118_Sub3 arg0) {
		@Pc(14) int local14;
		if (this.aClass161Array7 != null) {
			for (local14 = 0; local14 < this.aClass161Array7.length; local14++) {
				@Pc(21) Class161 local21 = this.aClass161Array7[local14];
				@Pc(23) Class161 local23 = local21;
				if (local21.aClass161_1 != null) {
					local23 = local21.aClass161_1;
				}
				local23.anInt4838 = (int) (arg0.aFloat194 + arg0.aFloat193 * (float) this.anIntArray757[local21.anInt4842] + (float) this.anIntArray755[local21.anInt4842] * arg0.aFloat191 + arg0.aFloat196 * (float) this.anIntArray754[local21.anInt4842]);
				local23.anInt4848 = (int) (arg0.aFloat185 + (float) this.anIntArray754[local21.anInt4842] * arg0.aFloat188 + arg0.aFloat190 * (float) this.anIntArray757[local21.anInt4842] + arg0.aFloat195 * (float) this.anIntArray755[local21.anInt4842]);
				local23.anInt4843 = (int) (arg0.aFloat187 + arg0.aFloat186 * (float) this.anIntArray757[local21.anInt4842] + (float) this.anIntArray755[local21.anInt4842] * arg0.aFloat192 + arg0.aFloat189 * (float) this.anIntArray754[local21.anInt4842]);
				local23.anInt4849 = (int) ((float) this.anIntArray754[local21.anInt4841] * arg0.aFloat196 + (float) this.anIntArray755[local21.anInt4841] * arg0.aFloat191 + arg0.aFloat193 * (float) this.anIntArray757[local21.anInt4841] + arg0.aFloat194);
				local23.anInt4846 = (int) ((float) this.anIntArray757[local21.anInt4841] * arg0.aFloat190 + (float) this.anIntArray755[local21.anInt4841] * arg0.aFloat195 + (float) this.anIntArray754[local21.anInt4841] * arg0.aFloat188 + arg0.aFloat185);
				local23.anInt4850 = (int) (arg0.aFloat187 + (float) this.anIntArray754[local21.anInt4841] * arg0.aFloat189 + arg0.aFloat186 * (float) this.anIntArray757[local21.anInt4841] + (float) this.anIntArray755[local21.anInt4841] * arg0.aFloat192);
				local23.anInt4839 = (int) (arg0.aFloat194 + arg0.aFloat196 * (float) this.anIntArray754[local21.anInt4847] + (float) this.anIntArray755[local21.anInt4847] * arg0.aFloat191 + (float) this.anIntArray757[local21.anInt4847] * arg0.aFloat193);
				local23.anInt4845 = (int) (arg0.aFloat185 + arg0.aFloat188 * (float) this.anIntArray754[local21.anInt4847] + arg0.aFloat195 * (float) this.anIntArray755[local21.anInt4847] + arg0.aFloat190 * (float) this.anIntArray757[local21.anInt4847]);
				local23.anInt4840 = (int) (arg0.aFloat187 + (float) this.anIntArray757[local21.anInt4847] * arg0.aFloat186 + (float) this.anIntArray755[local21.anInt4847] * arg0.aFloat192 + (float) this.anIntArray754[local21.anInt4847] * arg0.aFloat189);
			}
		}
		if (this.aClass93Array7 == null) {
			return;
		}
		for (local14 = 0; local14 < this.aClass93Array7.length; local14++) {
			@Pc(362) Class93 local362 = this.aClass93Array7[local14];
			@Pc(364) Class93 local364 = local362;
			if (local362.aClass93_1 != null) {
				local364 = local362.aClass93_1;
			}
			if (local362.aClass118_4 == null) {
				local362.aClass118_4 = arg0.method6964();
			} else {
				local362.aClass118_4.EA(arg0);
			}
			local364.anInt2652 = (int) (arg0.aFloat194 + (float) this.anIntArray754[local362.anInt2654] * arg0.aFloat196 + (float) this.anIntArray755[local362.anInt2654] * arg0.aFloat191 + arg0.aFloat193 * (float) this.anIntArray757[local362.anInt2654]);
			local364.anInt2655 = (int) (arg0.aFloat188 * (float) this.anIntArray754[local362.anInt2654] + arg0.aFloat195 * (float) this.anIntArray755[local362.anInt2654] + arg0.aFloat190 * (float) this.anIntArray757[local362.anInt2654] + arg0.aFloat185);
			local364.anInt2651 = (int) (arg0.aFloat187 + arg0.aFloat186 * (float) this.anIntArray757[local362.anInt2654] + arg0.aFloat192 * (float) this.anIntArray755[local362.anInt2654] + arg0.aFloat189 * (float) this.anIntArray754[local362.anInt2654]);
		}
	}

	@OriginalMember(owner = "client!uf", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort129;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)V")
	private void method6707() {
		if (!this.aBoolean569) {
			return;
		}
		this.aBoolean569 = false;
		if (this.aClass161Array7 == null && this.aClass93Array7 == null && this.aClass178Array1 == null) {
			if (this.anIntArray755 != null && !Static272.method4467(this.anInt8106, this.anInt8081)) {
				if (this.aClass173_2 == null || this.aClass173_2.method4367()) {
					if (!this.aBoolean568) {
						this.method6704();
					}
					this.anIntArray755 = null;
				} else {
					this.aBoolean569 = true;
				}
			}
			if (this.anIntArray757 != null && !Static510.method6251(this.anInt8106, this.anInt8081)) {
				if (this.aClass173_2 == null || this.aClass173_2.method4367()) {
					if (!this.aBoolean568) {
						this.method6704();
					}
					this.anIntArray757 = null;
				} else {
					this.aBoolean569 = true;
				}
			}
			if (this.anIntArray754 != null && !Static174.method2622(this.anInt8106, this.anInt8081)) {
				if (this.aClass173_2 == null || this.aClass173_2.method4367()) {
					if (!this.aBoolean568) {
						this.method6704();
					}
					this.anIntArray754 = null;
				} else {
					this.aBoolean569 = true;
				}
			}
		}
		if (this.aShortArray136 != null && this.anIntArray755 == null && this.anIntArray757 == null && this.anIntArray754 == null) {
			this.aShortArray136 = null;
			this.anIntArray756 = null;
		}
		if (this.aByteArray114 != null && !Static288.method4643(this.anInt8081, this.anInt8106)) {
			label195: {
				label194: {
					@Pc(159) boolean local159;
					if ((this.anInt8106 & 0x37) == 0) {
						if (this.aClass173_3 == null || this.aClass173_3.method4367()) {
							break label194;
						}
						local159 = false;
					} else {
						if (this.aClass173_1 == null || this.aClass173_1.method4367()) {
							break label194;
						}
						local159 = false;
					}
					if (!local159) {
						this.aBoolean569 = true;
						break label195;
					}
				}
				this.aShortArray142 = this.aShortArray134 = this.aShortArray138 = null;
				this.aByteArray114 = null;
			}
		}
		if (this.aShortArray132 != null && !Static292.method7313(this.anInt8106, this.anInt8081)) {
			if (this.aClass173_3 == null || this.aClass173_3.method4367()) {
				this.aShortArray132 = null;
			} else {
				this.aBoolean569 = true;
			}
		}
		if (this.aByteArray115 != null && !Static410.method6097(this.anInt8106, this.anInt8081)) {
			if (this.aClass173_3 == null || this.aClass173_3.method4367()) {
				this.aByteArray115 = null;
			} else {
				this.aBoolean569 = true;
			}
		}
		if (this.aFloatArray60 != null && !Static474.method6598(this.anInt8106, this.anInt8081)) {
			if (this.aClass173_4 == null || this.aClass173_4.method4367()) {
				this.aFloatArray60 = this.aFloatArray61 = null;
			} else {
				this.aBoolean569 = true;
			}
		}
		if (this.aShortArray139 != null && !Static415.method6110(this.anInt8106, this.anInt8081)) {
			if (this.aClass173_3 == null || this.aClass173_3.method4367()) {
				this.aShortArray139 = null;
			} else {
				this.aBoolean569 = true;
			}
		}
		if (this.aShortArray140 != null && !Static410.method6096(this.anInt8081, this.anInt8106)) {
			if ((this.aClass281_1 == null || this.aClass281_1.method6495()) && (this.aClass173_3 == null || this.aClass173_3.method4367())) {
				this.aShortArray140 = this.aShortArray141 = this.aShortArray131 = null;
			} else {
				this.aBoolean569 = true;
			}
		}
		if (this.aShortArray133 != null) {
			if (this.aClass173_2 == null || this.aClass173_2.method4367()) {
				this.aShortArray133 = null;
			} else {
				this.aBoolean569 = true;
			}
		}
		if (this.aShortArray137 != null) {
			if (this.aClass173_3 == null || this.aClass173_3.method4367()) {
				this.aShortArray137 = null;
			} else {
				this.aBoolean569 = true;
			}
		}
		if (this.lb != null && !Static352.method5305(this.anInt8081, this.anInt8106)) {
			this.lb = null;
			this.aShortArray143 = null;
		}
		if (this.anIntArrayArray108 != null && !Static393.method5944(this.anInt8106, this.anInt8081)) {
			this.aShortArray135 = null;
			this.anIntArrayArray108 = null;
		}
		if (this.anIntArrayArray107 != null && !Static23.method7129(this.anInt8106, this.anInt8081)) {
			this.anIntArrayArray107 = null;
		}
		if (this.anIntArray752 != null && (this.anInt8081 & 0x800) == 0 && (this.anInt8081 & 0x40000) == 0) {
			this.anIntArray758 = null;
			this.anIntArray752 = null;
			this.anIntArray753 = null;
		}
	}

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "(I)V")
	private void method6708() {
		if (this.aClass173_2 != null) {
			this.aClass173_2.aBoolean353 = false;
		}
	}

	@OriginalMember(owner = "client!uf", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean568) {
			this.method6704();
		}
		return this.anInt8110;
	}
}
