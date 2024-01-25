import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class105_Sub2 extends Class105 {

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "B")
	private byte aByte74;

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
	private int anInt4253;

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "Lclient!pl;")
	private Interface9 anInterface9_3;

	@OriginalMember(owner = "client!lu", name = "B", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!lu", name = "C", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!lu", name = "D", descriptor = "[I")
	private int[] anIntArray357;

	@OriginalMember(owner = "client!lu", name = "G", descriptor = "[Lclient!ou;")
	private Class187[] aClass187Array1;

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "[B")
	private byte[] aByteArray65;

	@OriginalMember(owner = "client!lu", name = "J", descriptor = "[Lclient!dv;")
	private Class57[] aClass57Array3;

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
	private int anInt4264;

	@OriginalMember(owner = "client!lu", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!lu", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!lu", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!lu", name = "fb", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!lu", name = "kb", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!lu", name = "mb", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!lu", name = "nb", descriptor = "[I")
	private int[] anIntArray358;

	@OriginalMember(owner = "client!lu", name = "ob", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!lu", name = "qb", descriptor = "[F")
	private float[] aFloatArray13;

	@OriginalMember(owner = "client!lu", name = "tb", descriptor = "[I")
	private int[] anIntArray359;

	@OriginalMember(owner = "client!lu", name = "wb", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!lu", name = "Eb", descriptor = "[F")
	private float[] aFloatArray14;

	@OriginalMember(owner = "client!lu", name = "Fb", descriptor = "Lclient!iv;")
	private Class117 aClass117_1;

	@OriginalMember(owner = "client!lu", name = "Ib", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!lu", name = "Kb", descriptor = "Lclient!wu;")
	private Interface12 anInterface12_5;

	@OriginalMember(owner = "client!lu", name = "Lb", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!lu", name = "Pb", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!lu", name = "Sb", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!lu", name = "Vb", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!lu", name = "Yb", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!lu", name = "ac", descriptor = "[Lclient!uj;")
	private Class244[] aClass244Array3;

	@OriginalMember(owner = "client!lu", name = "bc", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!lu", name = "cc", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!lu", name = "dc", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!lu", name = "ec", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!lu", name = "fc", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!lu", name = "jc", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!lu", name = "rc", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!lu", name = "tc", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!lu", name = "uc", descriptor = "I")
	private int anInt4310;

	@OriginalMember(owner = "client!lu", name = "wc", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!lu", name = "zc", descriptor = "[Lclient!dk;")
	private Class52[] aClass52Array1;

	@OriginalMember(owner = "client!lu", name = "rb", descriptor = "I")
	private int anInt4280 = 0;

	@OriginalMember(owner = "client!lu", name = "Jb", descriptor = "I")
	private int anInt4292 = 0;

	@OriginalMember(owner = "client!lu", name = "Bb", descriptor = "Z")
	private boolean aBoolean298 = true;

	@OriginalMember(owner = "client!lu", name = "ub", descriptor = "I")
	private int anInt4282 = 0;

	@OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
	private int anInt4258 = 0;

	@OriginalMember(owner = "client!lu", name = "pc", descriptor = "Z")
	private boolean aBoolean299 = false;

	@OriginalMember(owner = "client!lu", name = "Ac", descriptor = "I")
	private int anInt4312 = 0;

	@OriginalMember(owner = "client!lu", name = "kc", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_25;

	@OriginalMember(owner = "client!lu", name = "Tb", descriptor = "Lclient!gi;")
	private Class89 aClass89_8;

	@OriginalMember(owner = "client!lu", name = "Mb", descriptor = "Lclient!gi;")
	private Class89 aClass89_7;

	@OriginalMember(owner = "client!lu", name = "xc", descriptor = "Lclient!gi;")
	private Class89 aClass89_10;

	@OriginalMember(owner = "client!lu", name = "vc", descriptor = "Lclient!gi;")
	private Class89 aClass89_9;

	@OriginalMember(owner = "client!lu", name = "ib", descriptor = "Lclient!wi;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class105_Sub2(@OriginalArg(0) Class39_Sub2 arg0) {
		this.aClass39_Sub2_25 = arg0;
		this.aClass89_8 = new Class89(null, 5126, 3, 0);
		this.aClass89_7 = new Class89(null, 5126, 2, 0);
		this.aClass89_10 = new Class89(null, 5126, 3, 0);
		this.aClass89_9 = new Class89(null, 5121, 4, 0);
		this.aClass267_1 = new Class267();
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!kd;Lclient!tp;IIII)V")
	public Class105_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4253 = arg2;
		this.aClass39_Sub2_25 = arg0;
		this.anInt4310 = arg5;
		if (Static129.method3338(arg2, arg5)) {
			this.aClass89_8 = new Class89(null, 5126, 3, 0);
		}
		if (Static169.method2682(arg2, arg5)) {
			this.aClass89_7 = new Class89(null, 5126, 2, 0);
		}
		if (Static439.method5781(arg5, arg2)) {
			this.aClass89_10 = new Class89(null, 5126, 3, 0);
		}
		if (Static159.method2576(arg5, arg2)) {
			this.aClass89_9 = new Class89(null, 5121, 4, 0);
		}
		if (Static285.method4144(arg2, arg5)) {
			this.aClass267_1 = new Class267();
		}
		@Pc(102) Interface4 local102 = arg0.anInterface4_12;
		this.anIntArray357 = new int[arg1.anInt6290 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt6304];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt6304; local115++) {
			if ((arg1.aByteArray86 == null || arg1.aByteArray86[local115] != 2) && (arg1.aShortArray104 == null || arg1.aShortArray104[local115] == -1 || !local102.method2450(arg1.aShortArray104[local115] & 0xFFFF).aBoolean330)) {
				local113[this.anInt4258++] = local115;
				this.anIntArray357[arg1.aShortArray109[local115]]++;
				this.anIntArray357[arg1.aShortArray110[local115]]++;
				this.anIntArray357[arg1.aShortArray101[local115]]++;
			}
		}
		this.anInt4280 = this.anInt4258;
		@Pc(203) long[] local203 = new long[this.anInt4258];
		@Pc(212) boolean local212 = (this.anInt4253 & 0x100) != 0;
		@Pc(224) int local224;
		@Pc(235) int local235;
		@Pc(360) int local360;
		label488: for (@Pc(214) int local214 = 0; local214 < this.anInt4258; local214++) {
			@Pc(220) int local220 = local113[local214];
			@Pc(222) Class183 local222 = null;
			local224 = 0;
			@Pc(226) byte local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			if (arg1.aClass177Array1 != null) {
				for (local235 = 0; local235 < arg1.aClass177Array1.length; local235++) {
					@Pc(242) Class177 local242 = arg1.aClass177Array1[local235];
					if (local220 == local242.anInt4873) {
						@Pc(251) Class266 local251 = Static425.method5648(local242.anInt4871);
						if (local251.aBoolean495) {
							local203[local214] = Long.MAX_VALUE;
							this.anInt4280--;
							continue label488;
						}
					}
				}
			}
			@Pc(278) short local278 = -1;
			if (arg1.aShortArray104 != null) {
				local278 = arg1.aShortArray104[local220];
				if (local278 != -1) {
					local222 = local102.method2450(local278 & 0xFFFF);
					local228 = local222.aByte76;
					local230 = local222.aByte75;
				}
			}
			@Pc(322) boolean local322 = arg1.aByteArray87 != null && arg1.aByteArray87[local220] != 0 || local222 != null && !local222.aBoolean337;
			if ((local212 || local322) && arg1.aByteArray82 != null) {
				local224 += arg1.aByteArray82[local220] << 17;
			}
			if (local322) {
				local224 += 65536;
			}
			local224 += (local228 & 0xFF) << 8;
			local360 = local226 + ((local278 & 0xFFFF) << 16);
			local224 += local230 & 0xFF;
			@Pc(372) int local372 = local360 + (local214 & 0xFFFF);
			local203[local214] = ((long) local224 << 32) + (long) local372;
		}
		Static371.method5814(local113, local203);
		this.anIntArray358 = arg1.anIntArray575;
		this.anInt4282 = arg1.anInt6285;
		this.anIntArray356 = arg1.anIntArray572;
		this.anIntArray360 = arg1.anIntArray581;
		this.aShortArray61 = arg1.aShortArray108;
		this.anInt4312 = arg1.anInt6290;
		this.aClass244Array3 = arg1.aClass244Array4;
		@Pc(427) Class241[] local427 = new Class241[this.anInt4312];
		this.aClass57Array3 = arg1.aClass57Array4;
		@Pc(451) int local451;
		@Pc(465) int local465;
		if (arg1.aClass177Array1 != null) {
			this.anInt4264 = arg1.aClass177Array1.length;
			this.aClass52Array1 = new Class52[this.anInt4264];
			this.aClass187Array1 = new Class187[this.anInt4264];
			for (local451 = 0; local451 < this.anInt4264; local451++) {
				@Pc(458) Class177 local458 = arg1.aClass177Array1[local451];
				@Pc(463) Class266 local463 = Static425.method5648(local458.anInt4871);
				local465 = -1;
				for (@Pc(467) int local467 = 0; local467 < this.anInt4258; local467++) {
					if (local458.anInt4873 == local113[local467]) {
						local465 = local467;
						break;
					}
				}
				if (local465 == -1) {
					throw new RuntimeException();
				}
				local235 = Static337.anIntArray223[arg1.aShortArray103[local458.anInt4873] & 0xFFFF] & 0xFFFFFF;
				local235 |= 255 - (arg1.aByteArray87 == null ? 0 : arg1.aByteArray87[local458.anInt4873]) << 24;
				this.aClass52Array1[local451] = new Class52(local465, arg1.aShortArray109[local458.anInt4873], arg1.aShortArray110[local458.anInt4873], arg1.aShortArray101[local458.anInt4873], local463.anInt7161, local463.anInt7164, local463.anInt7159, local463.anInt7157, local463.anInt7156, local463.aBoolean495, local463.aBoolean494, local458.anInt4870);
				this.aClass187Array1[local451] = new Class187(local235);
			}
		}
		local451 = this.anInt4258 * 3;
		if (arg1.aShortArray105 != null) {
			this.aShortArray65 = new short[this.anInt4258];
		}
		this.aShortArray68 = new short[this.anInt4258];
		this.aShortArray64 = new short[local451];
		this.aShortArray67 = new short[local451];
		this.aFloatArray14 = new float[local451];
		this.aShortArray63 = new short[this.anInt4258];
		this.aShort69 = (short) arg3;
		this.aShort66 = (short) arg4;
		this.aByteArray66 = new byte[local451];
		Static146.aLongArray2 = new long[local451];
		this.aShortArray62 = new short[this.anInt4258];
		this.aFloatArray13 = new float[local451];
		this.aByteArray65 = new byte[this.anInt4258];
		this.aShortArray60 = new short[local451];
		this.aShortArray59 = new short[this.anInt4258];
		this.aShortArray66 = new short[this.anInt4258];
		this.aShortArray69 = new short[local451];
		local224 = 0;
		for (local360 = 0; local360 < arg1.anInt6290; local360++) {
			local465 = this.anIntArray357[local360];
			this.anIntArray357[local360] = local224;
			local224 += local465;
			local427[local360] = new Class241();
		}
		this.anIntArray357[arg1.anInt6290] = local224;
		@Pc(698) int[] local698 = null;
		@Pc(700) int[] local700 = null;
		@Pc(702) int[] local702 = null;
		@Pc(704) float[][] local704 = null;
		@Pc(730) int local730;
		@Pc(775) int local775;
		@Pc(781) int local781;
		@Pc(794) int local794;
		@Pc(796) int local796;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(998) float local998;
		@Pc(990) float local990;
		@Pc(1006) float local1006;
		if (arg1.aByteArray88 != null) {
			@Pc(710) int local710 = arg1.anInt6288;
			@Pc(713) int[] local713 = new int[local710];
			@Pc(716) int[] local716 = new int[local710];
			@Pc(719) int[] local719 = new int[local710];
			@Pc(722) int[] local722 = new int[local710];
			@Pc(725) int[] local725 = new int[local710];
			@Pc(728) int[] local728 = new int[local710];
			for (local730 = 0; local730 < local710; local730++) {
				local713[local730] = Integer.MAX_VALUE;
				local716[local730] = -2147483647;
				local719[local730] = Integer.MAX_VALUE;
				local722[local730] = -2147483647;
				local725[local730] = Integer.MAX_VALUE;
				local728[local730] = -2147483647;
			}
			local702 = new int[local710];
			local700 = new int[local710];
			local698 = new int[local710];
			for (local775 = 0; local775 < this.anInt4258; local775++) {
				local781 = local113[local775];
				if (arg1.aByteArray88[local781] != -1) {
					local794 = arg1.aByteArray88[local781] & 0xFF;
					for (local796 = 0; local796 < 3; local796++) {
						@Pc(810) short local810;
						if (local796 == 0) {
							local810 = arg1.aShortArray109[local781];
						} else if (local796 == 1) {
							local810 = arg1.aShortArray110[local781];
						} else {
							local810 = arg1.aShortArray101[local781];
						}
						local829 = arg1.anIntArray581[local810];
						local834 = arg1.anIntArray572[local810];
						@Pc(839) int local839 = arg1.anIntArray575[local810];
						if (local829 < local713[local794]) {
							local713[local794] = local829;
						}
						if (local829 > local716[local794]) {
							local716[local794] = local829;
						}
						if (local719[local794] > local834) {
							local719[local794] = local834;
						}
						if (local834 > local722[local794]) {
							local722[local794] = local834;
						}
						if (local725[local794] > local839) {
							local725[local794] = local839;
						}
						if (local839 > local728[local794]) {
							local728[local794] = local839;
						}
					}
				}
			}
			local704 = new float[local710][];
			for (local781 = 0; local781 < local710; local781++) {
				@Pc(930) byte local930 = arg1.aByteArray84[local781];
				if (local930 > 0) {
					local698[local781] = (local713[local781] + local716[local781]) / 2;
					local700[local781] = (local722[local781] + local719[local781]) / 2;
					local702[local781] = (local725[local781] + local728[local781]) / 2;
					if (local930 == 1) {
						local834 = arg1.anIntArray577[local781];
						local990 = 64.0F / (float) arg1.anIntArray578[local781];
						if (local834 == 0) {
							local998 = 1.0F;
							local1006 = 1.0F;
						} else if (local834 <= 0) {
							local998 = (float) -local834 / 1024.0F;
							local1006 = 1.0F;
						} else {
							local998 = 1.0F;
							local1006 = (float) local834 / 1024.0F;
						}
					} else if (local930 == 2) {
						local990 = 64.0F / (float) arg1.anIntArray578[local781];
						local998 = 64.0F / (float) arg1.anIntArray577[local781];
						local1006 = 64.0F / (float) arg1.anIntArray571[local781];
					} else {
						local990 = (float) arg1.anIntArray578[local781] / 1024.0F;
						local998 = (float) arg1.anIntArray577[local781] / 1024.0F;
						local1006 = (float) arg1.anIntArray571[local781] / 1024.0F;
					}
					local704[local781] = Static137.method2330(local990, arg1.aByteArray85[local781] & 0xFF, local998, arg1.aShortArray106[local781], arg1.aShortArray107[local781], arg1.aShortArray102[local781], local1006);
				}
			}
		}
		@Pc(1114) Class144[] local1114 = new Class144[arg1.anInt6304];
		@Pc(1133) short local1133;
		@Pc(1144) int local1144;
		@Pc(1155) int local1155;
		@Pc(1215) int local1215;
		for (@Pc(1116) int local1116 = 0; local1116 < arg1.anInt6304; local1116++) {
			@Pc(1123) short local1123 = arg1.aShortArray109[local1116];
			@Pc(1128) short local1128 = arg1.aShortArray110[local1116];
			local1133 = arg1.aShortArray101[local1116];
			local1144 = this.anIntArray360[local1128] - this.anIntArray360[local1123];
			local1155 = this.anIntArray356[local1128] - this.anIntArray356[local1123];
			local730 = this.anIntArray358[local1128] - this.anIntArray358[local1123];
			local775 = this.anIntArray360[local1133] - this.anIntArray360[local1123];
			local781 = this.anIntArray356[local1133] - this.anIntArray356[local1123];
			local794 = this.anIntArray358[local1133] - this.anIntArray358[local1123];
			local796 = local1155 * local794 - local730 * local781;
			local1215 = local730 * local775 - local794 * local1144;
			local829 = local1144 * local781 - local1155 * local775;
			while (local796 > 8192 || local1215 > 8192 || local829 > 8192 || local796 < -8192 || local1215 < -8192 || local829 < -8192) {
				local796 >>= 0x1;
				local829 >>= 0x1;
				local1215 >>= 0x1;
			}
			local834 = (int) Math.sqrt((double) (local829 * local829 + local1215 * local1215 + local796 * local796));
			if (local834 <= 0) {
				local834 = 1;
			}
			local1215 = local1215 * 256 / local834;
			local829 = local829 * 256 / local834;
			local796 = local796 * 256 / local834;
			@Pc(1314) byte local1314 = arg1.aByteArray86 == null ? 0 : arg1.aByteArray86[local1116];
			if (local1314 == 0) {
				@Pc(1323) Class241 local1323 = local427[local1123];
				local1323.anInt6507 += local796;
				local1323.anInt6505 += local829;
				local1323.anInt6504++;
				local1323.anInt6506 += local1215;
				@Pc(1351) Class241 local1351 = local427[local1128];
				local1351.anInt6507 += local796;
				local1351.anInt6504++;
				local1351.anInt6505 += local829;
				local1351.anInt6506 += local1215;
				@Pc(1379) Class241 local1379 = local427[local1133];
				local1379.anInt6506 += local1215;
				local1379.anInt6507 += local796;
				local1379.anInt6504++;
				local1379.anInt6505 += local829;
			} else if (local1314 == 1) {
				@Pc(1416) Class144 local1416 = local1114[local1116] = new Class144();
				local1416.anInt3999 = local1215;
				local1416.anInt4003 = local796;
				local1416.anInt4000 = local829;
			}
		}
		@Pc(1438) int local1438;
		for (@Pc(1432) int local1432 = 0; local1432 < this.anInt4258; local1432++) {
			local1438 = local113[local1432];
			@Pc(1445) int local1445 = arg1.aShortArray103[local1438] & 0xFFFF;
			@Pc(1450) short local1450;
			if (arg1.aShortArray104 == null) {
				local1450 = -1;
			} else {
				local1450 = arg1.aShortArray104[local1438];
			}
			if (arg1.aByteArray88 == null) {
				local1155 = -1;
			} else {
				local1155 = arg1.aByteArray88[local1438];
			}
			if (arg1.aByteArray87 == null) {
				local730 = 0;
			} else {
				local730 = arg1.aByteArray87[local1438] & 0xFF;
			}
			@Pc(1485) float local1485 = 0.0F;
			@Pc(1487) float local1487 = 0.0F;
			@Pc(1489) float local1489 = 0.0F;
			local998 = 0.0F;
			local990 = 0.0F;
			local1006 = 0.0F;
			@Pc(1497) byte local1497 = 0;
			@Pc(1499) byte local1499 = 0;
			@Pc(1501) int local1501 = 0;
			@Pc(1517) byte local1517;
			@Pc(1534) short local1534;
			@Pc(2281) short local2281;
			@Pc(2286) short local2286;
			if (local1450 != -1) {
				if (local1155 == -1) {
					local990 = 0.0F;
					local1499 = 2;
					local1485 = 0.0F;
					local1006 = 0.0F;
					local1489 = 1.0F;
					local1497 = 1;
					local998 = 1.0F;
					local1487 = 1.0F;
				} else {
					local1155 &= 0xFF;
					local1517 = arg1.aByteArray84[local1155];
					@Pc(1524) short local1524;
					@Pc(1529) short local1529;
					@Pc(1563) float local1563;
					@Pc(1581) float local1581;
					@Pc(1589) float local1589;
					@Pc(1690) float local1690;
					@Pc(1698) float local1698;
					@Pc(1706) float local1706;
					@Pc(1729) float local1729;
					@Pc(1752) float local1752;
					@Pc(1775) float local1775;
					if (local1517 == 0) {
						local1524 = arg1.aShortArray109[local1438];
						local1529 = arg1.aShortArray110[local1438];
						local1534 = arg1.aShortArray101[local1438];
						local2281 = arg1.aShortArray107[local1155];
						local2286 = arg1.aShortArray106[local1155];
						@Pc(2291) short local2291 = arg1.aShortArray102[local1155];
						@Pc(2297) float local2297 = (float) arg1.anIntArray581[local2281];
						@Pc(2303) float local2303 = (float) arg1.anIntArray572[local2281];
						local1563 = arg1.anIntArray575[local2281];
						local1581 = (float) arg1.anIntArray581[local2286] - local2297;
						local1589 = (float) arg1.anIntArray572[local2286] - local2303;
						@Pc(2334) float local2334 = (float) arg1.anIntArray575[local2286] - local1563;
						@Pc(2342) float local2342 = (float) arg1.anIntArray581[local2291] - local2297;
						@Pc(2351) float local2351 = (float) arg1.anIntArray572[local2291] - local2303;
						@Pc(2360) float local2360 = (float) arg1.anIntArray575[local2291] - local1563;
						@Pc(2369) float local2369 = (float) arg1.anIntArray581[local1524] - local2297;
						@Pc(2377) float local2377 = (float) arg1.anIntArray572[local1524] - local2303;
						@Pc(2386) float local2386 = (float) arg1.anIntArray575[local1524] - local1563;
						@Pc(2395) float local2395 = (float) arg1.anIntArray581[local1529] - local2297;
						@Pc(2403) float local2403 = (float) arg1.anIntArray572[local1529] - local2303;
						local1690 = (float) arg1.anIntArray575[local1529] - local1563;
						local1698 = (float) arg1.anIntArray581[local1534] - local2297;
						local1706 = (float) arg1.anIntArray572[local1534] - local2303;
						local1729 = (float) arg1.anIntArray575[local1534] - local1563;
						local1752 = local2360 * local1589 - local2351 * local2334;
						local1775 = local2342 * local2334 - local1581 * local2360;
						@Pc(2465) float local2465 = local1581 * local2351 - local2342 * local1589;
						@Pc(2474) float local2474 = local2465 * local2351 - local1775 * local2360;
						@Pc(2482) float local2482 = local2360 * local1752 - local2465 * local2342;
						@Pc(2490) float local2490 = local2342 * local1775 - local2351 * local1752;
						@Pc(2504) float local2504 = 1.0F / (local2490 * local2334 + local1589 * local2482 + local1581 * local2474);
						local990 = (local2474 * local1698 + local2482 * local1706 + local1729 * local2490) * local2504;
						local1489 = (local2403 * local2482 + local2474 * local2395 + local1690 * local2490) * local2504;
						local1485 = (local2386 * local2490 + local2377 * local2482 + local2369 * local2474) * local2504;
						@Pc(2555) float local2555 = local1752 * local2334 - local1581 * local2465;
						@Pc(2563) float local2563 = local1775 * local1581 - local1752 * local1589;
						@Pc(2572) float local2572 = local2465 * local1589 - local2334 * local1775;
						@Pc(2586) float local2586 = 1.0F / (local2342 * local2572 + local2555 * local2351 + local2360 * local2563);
						local1006 = local2586 * (local2555 * local1706 + local2572 * local1698 + local1729 * local2563);
						local998 = local2586 * (local2563 * local1690 + local2395 * local2572 + local2403 * local2555);
						local1487 = (local2555 * local2377 + local2572 * local2369 + local2386 * local2563) * local2586;
					} else {
						local1524 = arg1.aShortArray109[local1438];
						local1529 = arg1.aShortArray110[local1438];
						local1534 = arg1.aShortArray101[local1438];
						@Pc(1538) int local1538 = local698[local1155];
						@Pc(1542) int local1542 = local700[local1155];
						@Pc(1546) int local1546 = local702[local1155];
						@Pc(1550) float[] local1550 = local704[local1155];
						@Pc(1555) byte local1555 = arg1.aByteArray83[local1155];
						local1563 = (float) arg1.anIntArray579[local1155] / 256.0F;
						if (local1517 == 1) {
							local1581 = (float) arg1.anIntArray571[local1155] / 1024.0F;
							Static110.method1980(local1563, local1550, local1555, arg1.anIntArray572[local1524], local1546, local1538, arg1.anIntArray575[local1524], local1542, local1581, arg1.anIntArray581[local1524]);
							local1487 = Static24.aFloat6;
							local1485 = Static428.aFloat100;
							Static110.method1980(local1563, local1550, local1555, arg1.anIntArray572[local1529], local1546, local1538, arg1.anIntArray575[local1529], local1542, local1581, arg1.anIntArray581[local1529]);
							local998 = Static24.aFloat6;
							local1489 = Static428.aFloat100;
							Static110.method1980(local1563, local1550, local1555, arg1.anIntArray572[local1534], local1546, local1538, arg1.anIntArray575[local1534], local1542, local1581, arg1.anIntArray581[local1534]);
							local1006 = Static24.aFloat6;
							local990 = Static428.aFloat100;
							local1589 = local1581 / 2.0F;
							if ((local1555 & 0x1) == 0) {
								if (local990 - local1485 > local1589) {
									local990 -= local1581;
									local1499 = 1;
								} else if (local1485 - local990 > local1589) {
									local990 += local1581;
									local1499 = 2;
								}
								if (local1589 < local1489 - local1485) {
									local1489 -= local1581;
									local1497 = 1;
								} else if (local1589 < local1485 - local1489) {
									local1497 = 2;
									local1489 += local1581;
								}
							} else {
								if (local1589 < local1006 - local1487) {
									local1499 = 1;
									local1006 -= local1581;
								} else if (local1487 - local1006 > local1589) {
									local1006 += local1581;
									local1499 = 2;
								}
								if (local1589 < local998 - local1487) {
									local998 -= local1581;
									local1497 = 1;
								} else if (local1589 < local1487 - local998) {
									local998 += local1581;
									local1497 = 2;
								}
							}
						} else if (local1517 == 2) {
							local1581 = (float) arg1.anIntArray574[local1155] / 256.0F;
							local1589 = (float) arg1.anIntArray576[local1155] / 256.0F;
							@Pc(1600) int local1600 = arg1.anIntArray581[local1529] - arg1.anIntArray581[local1524];
							@Pc(1611) int local1611 = arg1.anIntArray572[local1529] - arg1.anIntArray572[local1524];
							@Pc(1622) int local1622 = arg1.anIntArray575[local1529] - arg1.anIntArray575[local1524];
							@Pc(1633) int local1633 = arg1.anIntArray581[local1534] - arg1.anIntArray581[local1524];
							@Pc(1644) int local1644 = arg1.anIntArray572[local1534] - arg1.anIntArray572[local1524];
							@Pc(1655) int local1655 = arg1.anIntArray575[local1534] - arg1.anIntArray575[local1524];
							@Pc(1664) int local1664 = local1611 * local1655 - local1644 * local1622;
							@Pc(1673) int local1673 = local1622 * local1633 - local1600 * local1655;
							@Pc(1682) int local1682 = local1644 * local1600 - local1633 * local1611;
							local1690 = 64.0F / (float) arg1.anIntArray577[local1155];
							local1698 = 64.0F / (float) arg1.anIntArray578[local1155];
							local1706 = 64.0F / (float) arg1.anIntArray571[local1155];
							local1729 = ((float) local1682 * local1550[2] + local1550[1] * (float) local1673 + local1550[0] * (float) local1664) / local1690;
							local1752 = (local1550[3] * (float) local1664 + (float) local1673 * local1550[4] + (float) local1682 * local1550[5]) / local1698;
							local1775 = ((float) local1682 * local1550[8] + local1550[7] * (float) local1673 + local1550[6] * (float) local1664) / local1706;
							local1501 = Static290.method4213(local1752, local1775, local1729);
							Static200.method3249(local1550, local1501, arg1.anIntArray581[local1524], arg1.anIntArray575[local1524], local1546, local1555, local1563, local1589, local1542, local1538, arg1.anIntArray572[local1524], local1581);
							local1485 = Static9.aFloat93;
							local1487 = Static134.aFloat15;
							Static200.method3249(local1550, local1501, arg1.anIntArray581[local1529], arg1.anIntArray575[local1529], local1546, local1555, local1563, local1589, local1542, local1538, arg1.anIntArray572[local1529], local1581);
							local998 = Static134.aFloat15;
							local1489 = Static9.aFloat93;
							Static200.method3249(local1550, local1501, arg1.anIntArray581[local1534], arg1.anIntArray575[local1534], local1546, local1555, local1563, local1589, local1542, local1538, arg1.anIntArray572[local1534], local1581);
							local1006 = Static134.aFloat15;
							local990 = Static9.aFloat93;
						} else if (local1517 == 3) {
							Static385.method5209(arg1.anIntArray575[local1524], local1538, local1542, arg1.anIntArray581[local1524], local1555, arg1.anIntArray572[local1524], local1550, local1563, local1546);
							local1485 = Static227.aFloat62;
							local1487 = Static269.aFloat68;
							Static385.method5209(arg1.anIntArray575[local1529], local1538, local1542, arg1.anIntArray581[local1529], local1555, arg1.anIntArray572[local1529], local1550, local1563, local1546);
							local1489 = Static227.aFloat62;
							local998 = Static269.aFloat68;
							Static385.method5209(arg1.anIntArray575[local1534], local1538, local1542, arg1.anIntArray581[local1534], local1555, arg1.anIntArray572[local1534], local1550, local1563, local1546);
							local990 = Static227.aFloat62;
							local1006 = Static269.aFloat68;
							if ((local1555 & 0x1) == 0) {
								if (local990 - local1485 > 0.5F) {
									local1499 = 1;
									local990--;
								} else if (local1485 - local990 > 0.5F) {
									local1499 = 2;
									local990++;
								}
								if (local1489 - local1485 > 0.5F) {
									local1497 = 1;
									local1489--;
								} else if (local1485 - local1489 > 0.5F) {
									local1489++;
									local1497 = 2;
								}
							} else {
								if (local998 - local1487 > 0.5F) {
									local998--;
									local1497 = 1;
								} else if (local1487 - local998 > 0.5F) {
									local1497 = 2;
									local998++;
								}
								if (local1006 - local1487 > 0.5F) {
									local1006--;
									local1499 = 1;
								} else if (local1487 - local1006 > 0.5F) {
									local1006++;
									local1499 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray86 == null) {
				local1517 = 0;
			} else {
				local1517 = arg1.aByteArray86[local1438];
			}
			if (local1517 == 0) {
				@Pc(2682) long local2682 = (long) (local1155 << 2) + ((long) (local1501 << 24) + (long) (local1445 << 8) + (long) local730 << 32);
				local1534 = arg1.aShortArray109[local1438];
				local2281 = arg1.aShortArray110[local1438];
				local2286 = arg1.aShortArray101[local1438];
				@Pc(2701) Class241 local2701 = local427[local1534];
				this.aShortArray66[local1432] = this.method3550(local1534, local2701.anInt6504, arg1, local1487, local2682, local2701.anInt6505, local2701.anInt6507, local2701.anInt6506, local1485);
				@Pc(2725) Class241 local2725 = local427[local2281];
				this.aShortArray59[local1432] = this.method3550(local2281, local2725.anInt6504, arg1, local998, local2682 + (long) local1497, local2725.anInt6505, local2725.anInt6507, local2725.anInt6506, local1489);
				@Pc(2752) Class241 local2752 = local427[local2286];
				this.aShortArray62[local1432] = this.method3550(local2286, local2752.anInt6504, arg1, local1006, local2682 + (long) local1499, local2752.anInt6505, local2752.anInt6507, local2752.anInt6506, local990);
			} else if (local1517 == 1) {
				@Pc(2784) Class144 local2784 = local1114[local1438];
				@Pc(2830) long local2830 = ((long) (local1445 << 8) + (long) (local1501 << 24) + (long) local730 << 32) + (long) ((local2784.anInt3999 + 256 << 12) + (local2784.anInt4003 <= 0 ? 2048 : 1024) + (local1155 << 2) + (local2784.anInt4000 + 256 << 22));
				this.aShortArray66[local1432] = this.method3550(arg1.aShortArray109[local1438], 0, arg1, local1487, local2830, local2784.anInt4000, local2784.anInt4003, local2784.anInt3999, local1485);
				this.aShortArray59[local1432] = this.method3550(arg1.aShortArray110[local1438], 0, arg1, local998, local2830 + (long) local1497, local2784.anInt4000, local2784.anInt4003, local2784.anInt3999, local1489);
				this.aShortArray62[local1432] = this.method3550(arg1.aShortArray101[local1438], 0, arg1, local1006, local2830 + (long) local1499, local2784.anInt4000, local2784.anInt4003, local2784.anInt3999, local990);
			}
			if (arg1.aShortArray104 == null) {
				this.aShortArray68[local1432] = -1;
			} else {
				this.aShortArray68[local1432] = arg1.aShortArray104[local1438];
			}
			if (arg1.aByteArray87 != null) {
				this.aByteArray65[local1432] = arg1.aByteArray87[local1438];
			}
			if (arg1.aShortArray105 != null) {
				this.aShortArray65[local1432] = arg1.aShortArray105[local1438];
			}
			this.aShortArray63[local1432] = arg1.aShortArray103[local1438];
		}
		local1438 = 0;
		local1133 = -10000;
		for (local1144 = 0; local1144 < this.anInt4280; local1144++) {
			@Pc(2972) short local2972 = this.aShortArray68[local1144];
			if (local1133 != local2972) {
				local1438++;
				local1133 = local2972;
			}
		}
		this.anIntArray359 = new int[local1438 + 1];
		local1438 = 0;
		local1133 = -10000;
		for (local1155 = 0; local1155 < this.anInt4280; local1155++) {
			@Pc(3010) short local3010 = this.aShortArray68[local1155];
			if (local3010 != local1133) {
				this.anIntArray359[local1438++] = local1155;
				local1133 = local3010;
			}
		}
		this.anIntArray359[local1438] = this.anInt4280;
		Static146.aLongArray2 = null;
		this.aShortArray67 = Static172.method2772(this.anInt4292, this.aShortArray67);
		this.aShortArray69 = Static172.method2772(this.anInt4292, this.aShortArray69);
		this.aShortArray64 = Static172.method2772(this.anInt4292, this.aShortArray64);
		this.aByteArray66 = Static352.method4871(this.anInt4292, this.aByteArray66);
		this.aFloatArray14 = Static254.method3807(this.anInt4292, this.aFloatArray14);
		this.aFloatArray13 = Static254.method3807(this.anInt4292, this.aFloatArray13);
		if (arg1.anIntArray573 != null && Static310.method4413(arg2, this.anInt4310)) {
			this.anIntArrayArray45 = arg1.method5240();
		}
		if (arg1.aClass177Array1 != null && Static100.method1788(arg2, this.anInt4310)) {
			this.anIntArrayArray44 = arg1.method5242();
		}
		if (arg1.anIntArray580 != null && Static147.method2420(arg2, this.anInt4310)) {
			local730 = 0;
			@Pc(3128) int[] local3128 = new int[256];
			for (local781 = 0; local781 < this.anInt4258; local781++) {
				local794 = arg1.anIntArray580[local113[local781]];
				if (local794 >= 0) {
					@Pc(3148) int local3148 = local3128[local794]++;
					if (local794 > local730) {
						local730 = local794;
					}
				}
			}
			this.anIntArrayArray46 = new int[local730 + 1][];
			for (local794 = 0; local794 <= local730; local794++) {
				this.anIntArrayArray46[local794] = new int[local3128[local794]];
				local3128[local794] = 0;
			}
			for (local796 = 0; local796 < this.anInt4258; local796++) {
				local1215 = arg1.anIntArray580[local113[local796]];
				if (local1215 >= 0) {
					this.anIntArrayArray46[local1215][local3128[local1215]++] = local796;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4312; local3++) {
			if (arg0 != 128) {
				this.anIntArray360[local3] = this.anIntArray360[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray356[local3] = arg1 * this.anIntArray356[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray358[local3] = this.anIntArray358[local3] * arg2 >> 7;
			}
		}
		this.aBoolean299 = false;
		if (this.aClass89_8 != null) {
			this.aClass89_8.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4258; local7++) {
			local16 = this.aShortArray63[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg2 != -1) {
				local32 += arg3 * (arg2 - local32) >> 7;
			}
			this.aShortArray63[local7] = (short) (local32 | local28 << 7 | local22 << 10);
		}
		if (this.aClass52Array1 != null) {
			for (local16 = 0; local16 < this.anInt4264; local16++) {
				@Pc(110) Class52 local110 = this.aClass52Array1[local16];
				@Pc(115) Class187 local115 = this.aClass187Array1[local16];
				local115.anInt5178 = Static337.anIntArray223[this.aShortArray63[local110.anInt1679] & 0xFFFF] & 0xFFFFFF | local115.anInt5178 & 0xFF000000;
			}
		}
		if (this.aClass89_9 != null) {
			this.aClass89_9.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIIB)Z")
	private boolean method3549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg6 > arg7 && arg4 > arg7 && arg7 < arg1) {
			return false;
		} else if (arg6 < arg7 && arg4 < arg7 && arg1 < arg7) {
			return false;
		} else if (arg0 < arg2 && arg5 > arg0 && arg0 < arg3) {
			return false;
		} else {
			return arg2 >= arg0 || arg0 <= arg5 || arg3 >= arg0;
		}
	}

	@OriginalMember(owner = "client!lu", name = "XA", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			Static142.anInt5534 = 0;
			local29 = 0;
			Static306.anInt5292 = 0;
			Static207.anInt3929 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray45.length) {
					local55 = this.anIntArrayArray45[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static306.anInt5292 += this.anIntArray360[local63];
						Static142.anInt5534 += this.anIntArray356[local63];
						local29++;
						Static207.anInt3929 += this.anIntArray358[local63];
					}
				}
			}
			if (local29 > 0) {
				Static207.anInt3929 = Static207.anInt3929 / local29 + local17;
				Static306.anInt5292 = Static306.anInt5292 / local29 + local21;
				Static142.anInt5534 = local25 + Static142.anInt5534 / local29;
			} else {
				Static142.anInt5534 = local25;
				Static306.anInt5292 = local21;
				Static207.anInt3929 = local17;
			}
			return;
		}
		@Pc(163) int[] local163;
		@Pc(165) int local165;
		if (arg0 == 1) {
			local25 = arg3 << 4;
			local21 = arg2 << 4;
			local17 = arg4 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray45.length > local35) {
					local163 = this.anIntArrayArray45[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local57 = local163[local165];
						this.anIntArray360[local57] += local21;
						this.anIntArray356[local57] += local25;
						this.anIntArray358[local57] += local17;
					}
				}
			}
			return;
		}
		@Pc(280) int local280;
		@Pc(298) int local298;
		@Pc(748) int local748;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray45.length > local35) {
					local163 = this.anIntArrayArray45[local35];
					if ((arg5 & 0x1) == 0) {
						for (local165 = 0; local165 < local163.length; local165++) {
							local57 = local163[local165];
							this.anIntArray360[local57] -= Static306.anInt5292;
							this.anIntArray356[local57] -= Static142.anInt5534;
							this.anIntArray358[local57] -= Static207.anInt3929;
							if (arg4 != 0) {
								local63 = Class183.anIntArray433[arg4];
								local280 = Class183.anIntArray434[arg4];
								local298 = local280 * this.anIntArray360[local57] + this.anIntArray356[local57] * local63 + 32767 >> 15;
								this.anIntArray356[local57] = local280 * this.anIntArray356[local57] + 32767 - local63 * this.anIntArray360[local57] >> 15;
								this.anIntArray360[local57] = local298;
							}
							if (arg2 != 0) {
								local63 = Class183.anIntArray433[arg2];
								local280 = Class183.anIntArray434[arg2];
								local298 = local280 * this.anIntArray356[local57] + 32767 - this.anIntArray358[local57] * local63 >> 15;
								this.anIntArray358[local57] = this.anIntArray356[local57] * local63 + local280 * this.anIntArray358[local57] + 32767 >> 15;
								this.anIntArray356[local57] = local298;
							}
							if (arg3 != 0) {
								local63 = Class183.anIntArray433[arg3];
								local280 = Class183.anIntArray434[arg3];
								local298 = local63 * this.anIntArray358[local57] + this.anIntArray360[local57] * local280 + 32767 >> 15;
								this.anIntArray358[local57] = local280 * this.anIntArray358[local57] + 32767 - this.anIntArray360[local57] * local63 >> 15;
								this.anIntArray360[local57] = local298;
							}
							this.anIntArray360[local57] += Static306.anInt5292;
							this.anIntArray356[local57] += Static142.anInt5534;
							this.anIntArray358[local57] += Static207.anInt3929;
						}
					} else {
						for (local165 = 0; local165 < local163.length; local165++) {
							local57 = local163[local165];
							this.anIntArray360[local57] -= Static306.anInt5292;
							this.anIntArray356[local57] -= Static142.anInt5534;
							this.anIntArray358[local57] -= Static207.anInt3929;
							if (arg2 != 0) {
								local63 = Class183.anIntArray433[arg2];
								local280 = Class183.anIntArray434[arg2];
								local298 = local280 * this.anIntArray356[local57] + 32767 - local63 * this.anIntArray358[local57] >> 15;
								this.anIntArray358[local57] = this.anIntArray358[local57] * local280 + this.anIntArray356[local57] * local63 + 32767 >> 15;
								this.anIntArray356[local57] = local298;
							}
							if (arg4 != 0) {
								local63 = Class183.anIntArray433[arg4];
								local280 = Class183.anIntArray434[arg4];
								local298 = this.anIntArray356[local57] * local63 + this.anIntArray360[local57] * local280 + 32767 >> 15;
								this.anIntArray356[local57] = local280 * this.anIntArray356[local57] + 32767 - this.anIntArray360[local57] * local63 >> 15;
								this.anIntArray360[local57] = local298;
							}
							if (arg3 != 0) {
								local63 = Class183.anIntArray433[arg3];
								local280 = Class183.anIntArray434[arg3];
								local298 = this.anIntArray358[local57] * local63 + local280 * this.anIntArray360[local57] + 32767 >> 15;
								this.anIntArray358[local57] = this.anIntArray358[local57] * local280 + 32767 - local63 * this.anIntArray360[local57] >> 15;
								this.anIntArray360[local57] = local298;
							}
							this.anIntArray360[local57] += Static306.anInt5292;
							this.anIntArray356[local57] += Static142.anInt5534;
							this.anIntArray358[local57] += Static207.anInt3929;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray45.length) {
						local55 = this.anIntArrayArray45[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local280 = this.anIntArray357[local63];
							local298 = this.anIntArray357[local63 + 1];
							for (local748 = local280; local748 < local298; local748++) {
								@Pc(757) int local757 = this.aShortArray60[local748] - 1;
								if (local757 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Class183.anIntArray433[arg4];
									local774 = Class183.anIntArray434[arg4];
									local792 = this.aShortArray69[local757] * local770 + this.aShortArray67[local757] * local774 + 32767 >> 15;
									this.aShortArray69[local757] = (short) (local774 * this.aShortArray69[local757] + 32767 - this.aShortArray67[local757] * local770 >> 15);
									this.aShortArray67[local757] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Class183.anIntArray433[arg2];
									local774 = Class183.anIntArray434[arg2];
									local792 = local774 * this.aShortArray69[local757] + 32767 - this.aShortArray64[local757] * local770 >> 15;
									this.aShortArray64[local757] = (short) (this.aShortArray64[local757] * local774 + this.aShortArray69[local757] * local770 + 32767 >> 15);
									this.aShortArray69[local757] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Class183.anIntArray433[arg3];
									local774 = Class183.anIntArray434[arg3];
									local792 = this.aShortArray67[local757] * local774 + this.aShortArray64[local757] * local770 + 32767 >> 15;
									this.aShortArray64[local757] = (short) (this.aShortArray64[local757] * local774 + 32767 - this.aShortArray67[local757] * local770 >> 15);
									this.aShortArray67[local757] = (short) local792;
								}
							}
						}
					}
				}
				if (this.aClass89_10 == null && this.aClass89_9 != null) {
					this.aClass89_9.anInterface12_1 = null;
				}
				if (this.aClass89_10 != null) {
					this.aClass89_10.anInterface12_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray45.length > local35) {
					local163 = this.anIntArrayArray45[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local57 = local163[local165];
						this.anIntArray360[local57] -= Static306.anInt5292;
						this.anIntArray356[local57] -= Static142.anInt5534;
						this.anIntArray358[local57] -= Static207.anInt3929;
						this.anIntArray360[local57] = this.anIntArray360[local57] * arg2 >> 7;
						this.anIntArray356[local57] = this.anIntArray356[local57] * arg3 >> 7;
						this.anIntArray358[local57] = this.anIntArray358[local57] * arg4 >> 7;
						this.anIntArray360[local57] += Static306.anInt5292;
						this.anIntArray356[local57] += Static142.anInt5534;
						this.anIntArray358[local57] += Static207.anInt3929;
					}
				}
			}
		} else {
			@Pc(1204) Class52 local1204;
			@Pc(1209) Class187 local1209;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray46.length > local35) {
							local163 = this.anIntArrayArray46[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local57 = local163[local165];
								local63 = (this.aByteArray65[local57] & 0xFF) + arg2 * 8;
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray65[local57] = (byte) local63;
							}
							if (local163.length > 0 && this.aClass89_9 != null) {
								this.aClass89_9.anInterface12_1 = null;
							}
						}
					}
					if (this.aClass52Array1 != null) {
						for (local35 = 0; local35 < this.anInt4264; local35++) {
							local1204 = this.aClass52Array1[local35];
							local1209 = this.aClass187Array1[local35];
							local1209.anInt5178 = local1209.anInt5178 & 0xFFFFFF | 255 - (this.aByteArray65[local1204.anInt1679] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1465) Class187 local1465;
				if (arg0 == 8) {
					if (this.anIntArrayArray44 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray44.length) {
								local163 = this.anIntArrayArray44[local35];
								for (local165 = 0; local165 < local163.length; local165++) {
									local1465 = this.aClass187Array1[local163[local165]];
									local1465.anInt5173 += arg3;
									local1465.anInt5171 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray44 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray44.length > local35) {
								local163 = this.anIntArrayArray44[local35];
								for (local165 = 0; local165 < local163.length; local165++) {
									local1465 = this.aClass187Array1[local163[local165]];
									local1465.anInt5175 = local1465.anInt5175 * arg2 >> 7;
									local1465.anInt5172 = arg3 * local1465.anInt5172 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray44.length > local35) {
							local163 = this.anIntArrayArray44[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1465 = this.aClass187Array1[local163[local165]];
								local1465.anInt5176 = local1465.anInt5176 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray46 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray46.length) {
						local163 = this.anIntArrayArray46[local35];
						for (local165 = 0; local165 < local163.length; local165++) {
							local57 = local163[local165];
							local63 = this.aShortArray63[local57] & 0xFFFF;
							local280 = local63 >> 10 & 0x3F;
							local298 = local63 >> 7 & 0x7;
							local748 = local63 & 0x7F;
							local298 += arg3 / 4;
							@Pc(1307) int local1307 = arg2 + local280 & 0x3F;
							if (local298 < 0) {
								local298 = 0;
							} else if (local298 > 7) {
								local298 = 7;
							}
							local748 += arg4;
							if (local748 < 0) {
								local748 = 0;
							} else if (local748 > 127) {
								local748 = 127;
							}
							this.aShortArray63[local57] = (short) (local748 | local298 << 7 | local1307 << 10);
						}
						if (local163.length > 0 && this.aClass89_9 != null) {
							this.aClass89_9.anInterface12_1 = null;
						}
					}
				}
				if (this.aClass52Array1 != null) {
					for (local35 = 0; local35 < this.anInt4264; local35++) {
						local1204 = this.aClass52Array1[local35];
						local1209 = this.aClass187Array1[local35];
						local1209.anInt5178 = local1209.anInt5178 & 0xFF000000 | Static337.anIntArray223[this.aShortArray63[local1204.anInt1679] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BIZ)Lclient!t;")
	@Override
	public Class105 method3548(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(19) Class105_Sub2 local19;
		@Pc(23) Class105_Sub2 local23;
		if (arg0 == 1) {
			local23 = this.aClass39_Sub2_25.aClass105_Sub2_2;
			local19 = this.aClass39_Sub2_25.aClass105_Sub2_9;
		} else if (arg0 == 2) {
			local19 = this.aClass39_Sub2_25.aClass105_Sub2_3;
			local23 = this.aClass39_Sub2_25.aClass105_Sub2_10;
		} else if (arg0 == 3) {
			local19 = this.aClass39_Sub2_25.aClass105_Sub2_4;
			local23 = this.aClass39_Sub2_25.aClass105_Sub2_7;
		} else if (arg0 == 4) {
			local19 = this.aClass39_Sub2_25.aClass105_Sub2_1;
			local23 = this.aClass39_Sub2_25.aClass105_Sub2_5;
		} else if (arg0 == 5) {
			local23 = this.aClass39_Sub2_25.aClass105_Sub2_6;
			local19 = this.aClass39_Sub2_25.aClass105_Sub2_8;
		} else {
			local19 = local23 = new Class105_Sub2(this.aClass39_Sub2_25);
		}
		return this.method3551(arg1, arg2, local23, local19, arg0 != 0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!tp;FJIIBIF)S")
	private short method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray357[arg0];
		@Pc(22) int local22 = this.anIntArray357[arg0 + 1];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = local10; local26 < local22; local26++) {
			@Pc(33) short local33 = this.aShortArray60[local26];
			if (local33 == 0) {
				local24 = local26;
				break;
			}
			if (arg4 == Static146.aLongArray2[local26]) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray60[local24] = (short) (this.anInt4292 + 1);
		Static146.aLongArray2[local24] = arg4;
		this.aShortArray67[this.anInt4292] = (short) arg6;
		this.aShortArray69[this.anInt4292] = (short) arg7;
		this.aShortArray64[this.anInt4292] = (short) arg5;
		this.aByteArray66[this.anInt4292] = (byte) arg1;
		this.aFloatArray14[this.anInt4292] = arg8;
		this.aFloatArray13[this.anInt4292] = arg3;
		return (short) this.anInt4292++;
	}

	@OriginalMember(owner = "client!lu", name = "I", descriptor = "(SS)V")
	@Override
	public void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass39_Sub2_25.anInterface4_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4258; local11++) {
			if (arg0 == this.aShortArray68[local11]) {
				this.aShortArray68[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class183 local44 = local9.method2450(arg0 & 0xFFFF);
			local31 = local44.aByte80;
			local33 = local44.aByte79;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(65) Class183 local65 = local9.method2450(arg1 & 0xFFFF);
			local54 = local65.aByte79;
			local52 = local65.aByte80;
		}
		if (!(local31 != local52 | local33 != local54)) {
			return;
		}
		if (this.aClass52Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt4264; local90++) {
				@Pc(97) Class52 local97 = this.aClass52Array1[local90];
				@Pc(102) Class187 local102 = this.aClass187Array1[local90];
				local102.anInt5178 = Static337.anIntArray223[this.aShortArray63[local97.anInt1679] & 0xFFFF] & 0xFFFFFF | local102.anInt5178 & 0xFF000000;
			}
		}
		if (this.aClass89_9 != null) {
			this.aClass89_9.anInterface12_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZBLclient!lu;Lclient!lu;Z)Lclient!t;")
	private Class105 method3551(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class105_Sub2 arg2, @OriginalArg(4) Class105_Sub2 arg3, @OriginalArg(5) boolean arg4) {
		arg3.aShort66 = this.aShort66;
		arg3.anInt4280 = this.anInt4280;
		arg3.aByte74 = 0;
		arg3.anInt4312 = this.anInt4312;
		arg3.anInt4310 = this.anInt4310;
		arg3.anInt4253 = arg0;
		arg3.anInt4258 = this.anInt4258;
		arg3.anInt4282 = this.anInt4282;
		arg3.anInt4292 = this.anInt4292;
		arg3.anInt4264 = this.anInt4264;
		arg3.aShort69 = this.aShort69;
		@Pc(53) boolean local53 = Static248.method3744(this.anInt4310, arg0);
		@Pc(59) boolean local59 = Static393.method5260(arg0, this.anInt4310);
		@Pc(65) boolean local65 = Static102.method1860(arg0, this.anInt4310);
		@Pc(71) boolean local71 = local53 | local59 | local65;
		@Pc(184) int local184;
		if (local71) {
			if (!local53) {
				arg3.anIntArray360 = this.anIntArray360;
			} else if (arg2.anIntArray360 == null || this.anInt4282 > arg2.anIntArray360.length) {
				arg3.anIntArray360 = arg2.anIntArray360 = new int[this.anInt4282];
			} else {
				arg3.anIntArray360 = arg2.anIntArray360;
			}
			if (!local59) {
				arg3.anIntArray356 = this.anIntArray356;
			} else if (arg2.anIntArray356 == null || this.anInt4282 > arg2.anIntArray356.length) {
				arg3.anIntArray356 = arg2.anIntArray356 = new int[this.anInt4282];
			} else {
				arg3.anIntArray356 = arg2.anIntArray356;
			}
			if (!local65) {
				arg3.anIntArray358 = this.anIntArray358;
			} else if (arg2.anIntArray358 == null || arg2.anIntArray358.length < this.anInt4282) {
				arg3.anIntArray358 = arg2.anIntArray358 = new int[this.anInt4282];
			} else {
				arg3.anIntArray358 = arg2.anIntArray358;
			}
			for (local184 = 0; local184 < this.anInt4282; local184++) {
				if (local53) {
					arg3.anIntArray360[local184] = this.anIntArray360[local184];
				}
				if (local59) {
					arg3.anIntArray356[local184] = this.anIntArray356[local184];
				}
				if (local65) {
					arg3.anIntArray358[local184] = this.anIntArray358[local184];
				}
			}
		} else {
			arg3.anIntArray356 = this.anIntArray356;
			arg3.anIntArray358 = this.anIntArray358;
			arg3.anIntArray360 = this.anIntArray360;
		}
		if (Static285.method4143(this.anInt4310, arg0)) {
			arg3.aClass89_8 = arg2.aClass89_8;
			if (arg4) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x1);
			}
			arg3.aClass89_8.aByte54 = this.aClass89_8.aByte54;
			arg3.aClass89_8.anInterface12_1 = this.aClass89_8.anInterface12_1;
		} else if (Static129.method3338(arg0, this.anInt4310)) {
			arg3.aClass89_8 = this.aClass89_8;
		} else {
			arg3.aClass89_8 = null;
		}
		if (Static439.method5780(this.anInt4310, arg0)) {
			if (arg2.aShortArray63 == null || this.anInt4258 > arg2.aShortArray63.length) {
				arg3.aShortArray63 = arg2.aShortArray63 = new short[this.anInt4258];
			} else {
				arg3.aShortArray63 = arg2.aShortArray63;
			}
			for (local184 = 0; local184 < this.anInt4258; local184++) {
				arg3.aShortArray63[local184] = this.aShortArray63[local184];
			}
		} else {
			arg3.aShortArray63 = this.aShortArray63;
		}
		if (Static157.method3073(arg0, this.anInt4310)) {
			if (arg2.aByteArray65 == null || arg2.aByteArray65.length < this.anInt4258) {
				arg3.aByteArray65 = arg2.aByteArray65 = new byte[this.anInt4258];
			} else {
				arg3.aByteArray65 = arg2.aByteArray65;
			}
			for (local184 = 0; local184 < this.anInt4258; local184++) {
				arg3.aByteArray65[local184] = this.aByteArray65[local184];
			}
		} else {
			arg3.aByteArray65 = this.aByteArray65;
		}
		if (Static408.method5470(arg0, this.anInt4310)) {
			arg3.aClass89_9 = arg2.aClass89_9;
			if (arg4) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x2);
			}
			arg3.aClass89_9.aByte54 = this.aClass89_9.aByte54;
			arg3.aClass89_9.anInterface12_1 = this.aClass89_9.anInterface12_1;
		} else if (Static159.method2576(this.anInt4310, arg0)) {
			arg3.aClass89_9 = this.aClass89_9;
		} else {
			arg3.aClass89_9 = null;
		}
		@Pc(537) int local537;
		if (Static428.method5677(arg0, this.anInt4310)) {
			if (arg2.aShortArray67 == null || arg2.aShortArray67.length < this.anInt4292) {
				local184 = this.anInt4292;
				arg3.aShortArray69 = arg2.aShortArray69 = new short[local184];
				arg3.aShortArray64 = arg2.aShortArray64 = new short[local184];
				arg3.aShortArray67 = arg2.aShortArray67 = new short[local184];
			} else {
				arg3.aShortArray69 = arg2.aShortArray69;
				arg3.aShortArray64 = arg2.aShortArray64;
				arg3.aShortArray67 = arg2.aShortArray67;
			}
			if (this.aClass117_1 == null) {
				for (local184 = 0; local184 < this.anInt4292; local184++) {
					arg3.aShortArray67[local184] = this.aShortArray67[local184];
					arg3.aShortArray69[local184] = this.aShortArray69[local184];
					arg3.aShortArray64[local184] = this.aShortArray64[local184];
				}
			} else {
				if (arg2.aClass117_1 == null) {
					arg2.aClass117_1 = new Class117();
				}
				@Pc(521) Class117 local521 = arg3.aClass117_1 = arg2.aClass117_1;
				if (local521.aShortArray48 == null || this.anInt4292 > local521.aShortArray48.length) {
					local537 = this.anInt4292;
					local521.aShortArray49 = new short[local537];
					local521.aShortArray48 = new short[local537];
					local521.aShortArray47 = new short[local537];
					local521.aByteArray57 = new byte[local537];
				}
				for (local537 = 0; local537 < this.anInt4292; local537++) {
					arg3.aShortArray67[local537] = this.aShortArray67[local537];
					arg3.aShortArray69[local537] = this.aShortArray69[local537];
					arg3.aShortArray64[local537] = this.aShortArray64[local537];
					local521.aShortArray48[local537] = this.aClass117_1.aShortArray48[local537];
					local521.aShortArray47[local537] = this.aClass117_1.aShortArray47[local537];
					local521.aShortArray49[local537] = this.aClass117_1.aShortArray49[local537];
					local521.aByteArray57[local537] = this.aClass117_1.aByteArray57[local537];
				}
			}
			arg3.aByteArray66 = this.aByteArray66;
		} else {
			arg3.aByteArray66 = this.aByteArray66;
			arg3.aClass117_1 = this.aClass117_1;
			arg3.aShortArray64 = this.aShortArray64;
			arg3.aShortArray69 = this.aShortArray69;
			arg3.aShortArray67 = this.aShortArray67;
		}
		if (Static172.method2764(this.anInt4310, arg0)) {
			if (arg4) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x4);
			}
			arg3.aClass89_10 = arg2.aClass89_10;
			arg3.aClass89_10.anInterface12_1 = this.aClass89_10.anInterface12_1;
			arg3.aClass89_10.aByte54 = this.aClass89_10.aByte54;
		} else if (Static439.method5781(this.anInt4310, arg0)) {
			arg3.aClass89_10 = this.aClass89_10;
		} else {
			arg3.aClass89_10 = null;
		}
		if (Static23.method4301(this.anInt4310, arg0)) {
			if (arg2.aFloatArray14 == null || this.anInt4258 > arg2.aFloatArray14.length) {
				local184 = this.anInt4292;
				arg3.aFloatArray13 = arg2.aFloatArray13 = new float[local184];
				arg3.aFloatArray14 = arg2.aFloatArray14 = new float[local184];
			} else {
				arg3.aFloatArray14 = arg2.aFloatArray14;
				arg3.aFloatArray13 = arg2.aFloatArray13;
			}
			for (local184 = 0; local184 < this.anInt4292; local184++) {
				arg3.aFloatArray14[local184] = this.aFloatArray14[local184];
				arg3.aFloatArray13[local184] = this.aFloatArray13[local184];
			}
		} else {
			arg3.aFloatArray13 = this.aFloatArray13;
			arg3.aFloatArray14 = this.aFloatArray14;
		}
		if (Static196.method3038(arg0, this.anInt4310)) {
			arg3.aClass89_7 = arg2.aClass89_7;
			if (arg4) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x8);
			}
			arg3.aClass89_7.aByte54 = this.aClass89_7.aByte54;
			arg3.aClass89_7.anInterface12_1 = this.aClass89_7.anInterface12_1;
		} else if (Static169.method2682(arg0, this.anInt4310)) {
			arg3.aClass89_7 = this.aClass89_7;
		} else {
			arg3.aClass89_7 = null;
		}
		if (Static199.method3241(arg0, this.anInt4310)) {
			if (arg2.aShortArray66 == null || arg2.aShortArray66.length < this.anInt4258) {
				local184 = this.anInt4258;
				arg3.aShortArray66 = arg2.aShortArray66 = new short[local184];
				arg3.aShortArray59 = arg2.aShortArray59 = new short[local184];
				arg3.aShortArray62 = arg2.aShortArray62 = new short[local184];
			} else {
				arg3.aShortArray62 = arg2.aShortArray62;
				arg3.aShortArray59 = arg2.aShortArray59;
				arg3.aShortArray66 = arg2.aShortArray66;
			}
			for (local184 = 0; local184 < this.anInt4258; local184++) {
				arg3.aShortArray66[local184] = this.aShortArray66[local184];
				arg3.aShortArray59[local184] = this.aShortArray59[local184];
				arg3.aShortArray62[local184] = this.aShortArray62[local184];
			}
		} else {
			arg3.aShortArray66 = this.aShortArray66;
			arg3.aShortArray62 = this.aShortArray62;
			arg3.aShortArray59 = this.aShortArray59;
		}
		if (Static60.method1283(arg0, this.anInt4310)) {
			arg3.aClass267_1 = arg2.aClass267_1;
			if (arg4) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x10);
			}
			arg3.aClass267_1.anInterface9_5 = this.aClass267_1.anInterface9_5;
		} else if (Static285.method4144(arg0, this.anInt4310)) {
			arg3.aClass267_1 = this.aClass267_1;
		} else {
			arg3.aClass267_1 = null;
		}
		if (Static223.method3420(arg0, this.anInt4310)) {
			if (arg2.aShortArray68 == null || arg2.aShortArray68.length < this.anInt4258) {
				local184 = this.anInt4258;
				arg3.aShortArray68 = arg2.aShortArray68 = new short[local184];
			} else {
				arg3.aShortArray68 = arg2.aShortArray68;
			}
			for (local184 = 0; local184 < this.anInt4258; local184++) {
				arg3.aShortArray68[local184] = this.aShortArray68[local184];
			}
		} else {
			arg3.aShortArray68 = this.aShortArray68;
		}
		if (!Static166.method2654(this.anInt4310, arg0)) {
			arg3.aClass187Array1 = this.aClass187Array1;
		} else if (arg2.aClass187Array1 == null || arg2.aClass187Array1.length < this.anInt4264) {
			local184 = this.anInt4264;
			arg3.aClass187Array1 = arg2.aClass187Array1 = new Class187[local184];
			for (local537 = 0; local537 < this.anInt4264; local537++) {
				arg3.aClass187Array1[local537] = this.aClass187Array1[local537].method4286();
			}
		} else {
			arg3.aClass187Array1 = arg2.aClass187Array1;
			for (local184 = 0; local184 < this.anInt4264; local184++) {
				arg3.aClass187Array1[local184].method4285(this.aClass187Array1[local184]);
			}
		}
		arg3.anIntArrayArray46 = this.anIntArrayArray46;
		arg3.anIntArray359 = this.anIntArray359;
		arg3.aClass52Array1 = this.aClass52Array1;
		arg3.aClass244Array3 = this.aClass244Array3;
		arg3.anIntArray357 = this.anIntArray357;
		arg3.anIntArrayArray45 = this.anIntArrayArray45;
		if (this.aBoolean299) {
			arg3.aShort68 = this.aShort68;
			arg3.aShort63 = this.aShort63;
			arg3.aBoolean299 = true;
			arg3.aShort64 = this.aShort64;
			arg3.aShort70 = this.aShort70;
			arg3.aShort65 = this.aShort65;
			arg3.aShort67 = this.aShort67;
			arg3.aShort71 = this.aShort71;
		} else {
			arg3.aBoolean299 = false;
		}
		arg3.anIntArrayArray44 = this.anIntArrayArray44;
		arg3.aShortArray60 = this.aShortArray60;
		arg3.aShortArray61 = this.aShortArray61;
		arg3.aShortArray65 = this.aShortArray65;
		arg3.aClass57Array3 = this.aClass57Array3;
		return arg3;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "()V")
	@Override
	public void method3542() {
		if (this.anInt4292 <= 0 || this.anInt4280 <= 0) {
			return;
		}
		this.method3558(false);
		if ((this.aByte74 & 0x10) == 0 && this.aClass267_1.anInterface9_5 == null) {
			this.method3562(false);
		}
		this.method3560();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ISZIB)I")
	private int method3552(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(12) int local12 = Static337.anIntArray223[Static359.method4935(arg2, arg0)];
		if (arg1 != -1) {
			@Pc(25) Class183 local25 = this.aClass39_Sub2_25.anInterface4_12.method2450(arg1 & 0xFFFF);
			@Pc(30) int local30 = local25.aByte80 & 0xFF;
			@Pc(42) int local42;
			@Pc(64) int local64;
			if (local30 != 0) {
				if (arg0 < 0) {
					local42 = 0;
				} else if (arg0 <= 127) {
					local42 = arg0 * 131586;
				} else {
					local42 = 16777215;
				}
				if (local30 == 256) {
					local12 = local42;
				} else {
					local64 = 256 - local30;
					local12 = ((local42 & 0xFF00FF) * local30 + (local12 & 0xFF00FF) * local64 & 0xFF00FF00) + (local30 * (local42 & 0xFF00) + (local64 * (local12 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local42 = local25.aByte79 & 0xFF;
			if (local42 != 0) {
				local42 += 256;
				@Pc(118) int local118 = (local12 >> 16 & 0xFF) * local42;
				if (local118 > 65535) {
					local118 = 65535;
				}
				local64 = (local12 >> 8 & 0xFF) * local42;
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(142) int local142 = (local12 & 0xFF) * local42;
				if (local142 > 65535) {
					local142 = 65535;
				}
				local12 = (local142 >> 8) + ((local118 & 0x5500FF00) << 8) + (local64 & 0xFF00);
			}
		}
		return (local12 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!lu", name = "NA", descriptor = "()I")
	@Override
	public int NA() {
		if (!this.aBoolean299) {
			this.method3559();
		}
		return this.aShort68;
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class183.anIntArray433[arg0];
		@Pc(13) int local13 = Class183.anIntArray434[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4312; local15++) {
			local33 = local9 * this.anIntArray358[local15] + local13 * this.anIntArray360[local15] >> 15;
			this.anIntArray358[local15] = local13 * this.anIntArray358[local15] - this.anIntArray360[local15] * local9 >> 15;
			this.anIntArray360[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4292; local33++) {
			@Pc(87) int local87 = local9 * this.aShortArray64[local33] + this.aShortArray67[local33] * local13 >> 15;
			this.aShortArray64[local33] = (short) (local13 * this.aShortArray64[local33] - local9 * this.aShortArray67[local33] >> 15);
			this.aShortArray67[local33] = (short) local87;
		}
		if (this.aClass89_10 == null && this.aClass89_9 != null) {
			this.aClass89_9.anInterface12_1 = null;
		}
		if (this.aClass89_10 != null) {
			this.aClass89_10.anInterface12_1 = null;
		}
		this.aBoolean299 = false;
		if (this.aClass89_8 != null) {
			this.aClass89_8.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "R", descriptor = "(I)V")
	@Override
	public void R(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class183.anIntArray433[arg0];
		@Pc(13) int local13 = Class183.anIntArray434[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4312; local15++) {
			@Pc(33) int local33 = this.anIntArray360[local15] * local13 + this.anIntArray356[local15] * local9 >> 15;
			this.anIntArray356[local15] = local13 * this.anIntArray356[local15] - local9 * this.anIntArray360[local15] >> 15;
			this.anIntArray360[local15] = local33;
		}
		if (this.aClass89_8 != null) {
			this.aClass89_8.anInterface12_1 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!lu", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean299) {
			this.method3559();
		}
		return this.aShort64;
	}

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "()I")
	@Override
	public int l() {
		return this.aShort66;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!qg;)V")
	private void method3554(@OriginalArg(1) Class33_Sub2 arg0) {
		@Pc(21) int local21;
		if (this.aClass244Array3 != null) {
			for (local21 = 0; local21 < this.aClass244Array3.length; local21++) {
				@Pc(28) Class244 local28 = this.aClass244Array3[local21];
				@Pc(30) Class244 local30 = local28;
				if (local28.aClass244_1 != null) {
					local30 = local28.aClass244_1;
				}
				local30.anInt6571 = (int) (arg0.aFloat82 * (float) this.anIntArray356[local28.anInt6577] + (float) this.anIntArray360[local28.anInt6577] * arg0.aFloat81 + arg0.aFloat78 * (float) this.anIntArray358[local28.anInt6577] + arg0.aFloat79);
				local30.anInt6568 = (int) (arg0.aFloat80 * (float) this.anIntArray360[local28.anInt6577] + (float) this.anIntArray356[local28.anInt6577] * arg0.aFloat87 + arg0.aFloat88 * (float) this.anIntArray358[local28.anInt6577] + arg0.aFloat85);
				local30.anInt6576 = (int) (arg0.aFloat77 * (float) this.anIntArray358[local28.anInt6577] + arg0.aFloat83 * (float) this.anIntArray356[local28.anInt6577] + arg0.aFloat84 * (float) this.anIntArray360[local28.anInt6577] + arg0.aFloat86);
				local30.anInt6570 = (int) (arg0.aFloat79 + arg0.aFloat82 * (float) this.anIntArray356[local28.anInt6578] + arg0.aFloat81 * (float) this.anIntArray360[local28.anInt6578] + (float) this.anIntArray358[local28.anInt6578] * arg0.aFloat78);
				local30.anInt6582 = (int) (arg0.aFloat85 + (float) this.anIntArray356[local28.anInt6578] * arg0.aFloat87 + (float) this.anIntArray360[local28.anInt6578] * arg0.aFloat80 + (float) this.anIntArray358[local28.anInt6578] * arg0.aFloat88);
				local30.anInt6580 = (int) ((float) this.anIntArray360[local28.anInt6578] * arg0.aFloat84 + (float) this.anIntArray356[local28.anInt6578] * arg0.aFloat83 + arg0.aFloat77 * (float) this.anIntArray358[local28.anInt6578] + arg0.aFloat86);
				local30.anInt6584 = (int) (arg0.aFloat81 * (float) this.anIntArray360[local28.anInt6579] + (float) this.anIntArray356[local28.anInt6579] * arg0.aFloat82 + (float) this.anIntArray358[local28.anInt6579] * arg0.aFloat78 + arg0.aFloat79);
				local30.anInt6585 = (int) (arg0.aFloat85 + arg0.aFloat80 * (float) this.anIntArray360[local28.anInt6579] + (float) this.anIntArray356[local28.anInt6579] * arg0.aFloat87 + arg0.aFloat88 * (float) this.anIntArray358[local28.anInt6579]);
				local30.anInt6574 = (int) (arg0.aFloat86 + (float) this.anIntArray358[local28.anInt6579] * arg0.aFloat77 + arg0.aFloat84 * (float) this.anIntArray360[local28.anInt6579] + arg0.aFloat83 * (float) this.anIntArray356[local28.anInt6579]);
			}
		}
		if (this.aClass57Array3 == null) {
			return;
		}
		for (local21 = 0; local21 < this.aClass57Array3.length; local21++) {
			@Pc(369) Class57 local369 = this.aClass57Array3[local21];
			@Pc(371) Class57 local371 = local369;
			if (local369.aClass57_1 != null) {
				local371 = local369.aClass57_1;
			}
			if (local369.aClass33_1 == null) {
				local369.aClass33_1 = arg0.method4612();
			} else {
				local369.aClass33_1.za(arg0);
			}
			local371.anInt1828 = (int) (arg0.aFloat78 * (float) this.anIntArray358[local369.anInt1834] + (float) this.anIntArray360[local369.anInt1834] * arg0.aFloat81 + arg0.aFloat82 * (float) this.anIntArray356[local369.anInt1834] + arg0.aFloat79);
			local371.anInt1831 = (int) (arg0.aFloat88 * (float) this.anIntArray358[local369.anInt1834] + (float) this.anIntArray356[local369.anInt1834] * arg0.aFloat87 + arg0.aFloat80 * (float) this.anIntArray360[local369.anInt1834] + arg0.aFloat85);
			local371.anInt1830 = (int) (arg0.aFloat86 + arg0.aFloat83 * (float) this.anIntArray356[local369.anInt1834] + (float) this.anIntArray360[local369.anInt1834] * arg0.aFloat84 + (float) this.anIntArray358[local369.anInt1834] * arg0.aFloat77);
		}
	}

	@OriginalMember(owner = "client!lu", name = "P", descriptor = "()I")
	@Override
	public int P() {
		return this.anInt4253;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!c;Lclient!ju;II)V")
	@Override
	public void method3546(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4292 == 0) {
			return;
		}
		@Pc(16) Class33_Sub2 local16 = this.aClass39_Sub2_25.aClass33_Sub2_4;
		@Pc(19) Class33_Sub2 local19 = (Class33_Sub2) arg0;
		if (!this.aBoolean299) {
			this.method3559();
		}
		Static147.aFloat29 = local16.aFloat86 + local16.aFloat84 * local19.aFloat79 + local19.aFloat85 * local16.aFloat83 + local19.aFloat86 * local16.aFloat77;
		Static167.aFloat32 = local19.aFloat87 * local16.aFloat83 + local19.aFloat82 * local16.aFloat84 + local16.aFloat77 * local19.aFloat83;
		@Pc(72) float local72 = Static167.aFloat32 * (float) this.aShort63 + Static147.aFloat29;
		@Pc(80) float local80 = Static147.aFloat29 + Static167.aFloat32 * (float) this.aShort67;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.aShort65;
			local96 = (float) this.aShort65 + local72;
		} else {
			local96 = (float) this.aShort65 + local80;
			local90 = local72 - (float) this.aShort65;
		}
		if (local90 >= this.aClass39_Sub2_25.aFloat38 || local96 <= (float) this.aClass39_Sub2_25.anInt3795) {
			return;
		}
		Static278.aFloat71 = local16.aFloat82 * local19.aFloat87 + local16.aFloat81 * local19.aFloat82 + local16.aFloat78 * local19.aFloat83;
		Static71.aFloat31 = local19.aFloat85 * local16.aFloat82 + local19.aFloat79 * local16.aFloat81 + local19.aFloat86 * local16.aFloat78 + local16.aFloat79;
		@Pc(172) float local172 = (float) this.aShort63 * Static278.aFloat71 + Static71.aFloat31;
		@Pc(180) float local180 = Static71.aFloat31 + (float) this.aShort67 * Static278.aFloat71;
		@Pc(206) float local206;
		@Pc(195) float local195;
		if (local180 < local172) {
			local195 = (float) this.aClass39_Sub2_25.anInt3804 * ((float) this.aShort65 + local172);
			local206 = (local180 - (float) this.aShort65) * (float) this.aClass39_Sub2_25.anInt3804;
		} else {
			local206 = (float) this.aClass39_Sub2_25.anInt3804 * ((float) -this.aShort65 + local172);
			local195 = ((float) this.aShort65 + local180) * (float) this.aClass39_Sub2_25.anInt3804;
		}
		if (local206 / (float) arg2 >= this.aClass39_Sub2_25.aFloat43 || local195 / (float) arg2 <= this.aClass39_Sub2_25.aFloat36) {
			return;
		}
		Static308.aFloat75 = local16.aFloat88 * local19.aFloat86 + local19.aFloat79 * local16.aFloat80 + local16.aFloat87 * local19.aFloat85 + local16.aFloat85;
		Static400.aFloat95 = local19.aFloat82 * local16.aFloat80 + local19.aFloat87 * local16.aFloat87 + local16.aFloat88 * local19.aFloat83;
		@Pc(298) float local298 = (float) this.aShort63 * Static400.aFloat95 + Static308.aFloat75;
		@Pc(306) float local306 = Static400.aFloat95 * (float) this.aShort67 + Static308.aFloat75;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local298 > local306) {
			local332 = (float) this.aClass39_Sub2_25.anInt3801 * (local298 + (float) this.aShort65);
			local321 = ((float) -this.aShort65 + local306) * (float) this.aClass39_Sub2_25.anInt3801;
		} else {
			local321 = (float) this.aClass39_Sub2_25.anInt3801 * (local298 - (float) this.aShort65);
			local332 = (float) this.aClass39_Sub2_25.anInt3801 * ((float) this.aShort65 + local306);
		}
		if (local321 / (float) arg2 >= this.aClass39_Sub2_25.aFloat35 || this.aClass39_Sub2_25.aFloat44 >= local332 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass52Array1 != null) {
			Static291.aFloat74 = local19.aFloat81 * local16.aFloat84 + local16.aFloat83 * local19.aFloat80 + local19.aFloat84 * local16.aFloat77;
			Static42.aFloat7 = local16.aFloat83 * local19.aFloat88 + local16.aFloat84 * local19.aFloat78 + local16.aFloat77 * local19.aFloat77;
			Static422.aFloat99 = local19.aFloat84 * local16.aFloat88 + local19.aFloat80 * local16.aFloat87 + local16.aFloat80 * local19.aFloat81;
			Static84.aFloat13 = local19.aFloat77 * local16.aFloat88 + local16.aFloat87 * local19.aFloat88 + local16.aFloat80 * local19.aFloat78;
			Static136.aFloat22 = local16.aFloat82 * local19.aFloat88 + local16.aFloat81 * local19.aFloat78 + local19.aFloat77 * local16.aFloat78;
			Static411.aFloat97 = local16.aFloat81 * local19.aFloat81 + local16.aFloat82 * local19.aFloat80 + local19.aFloat84 * local16.aFloat78;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort64 + this.aShort68 >> 1;
			@Pc(509) int local509 = this.aShort70 + this.aShort71 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static136.aFloat22 + (float) local501 * Static411.aFloat97 + Static71.aFloat31 + Static278.aFloat71 * (float) this.aShort63);
			@Pc(547) int local547 = (int) ((float) local509 * Static84.aFloat13 + (float) local501 * Static422.aFloat99 + Static308.aFloat75 + (float) this.aShort63 * Static400.aFloat95);
			@Pc(566) int local566 = (int) (Static42.aFloat7 * (float) local509 + Static291.aFloat74 * (float) local501 + Static147.aFloat29 + (float) this.aShort63 * Static167.aFloat32);
			@Pc(585) int local585 = (int) (Static136.aFloat22 * (float) local509 + (float) this.aShort67 * Static278.aFloat71 + Static71.aFloat31 + (float) local501 * Static411.aFloat97);
			@Pc(604) int local604 = (int) (Static84.aFloat13 * (float) local509 + Static422.aFloat99 * (float) local501 + Static308.aFloat75 + (float) this.aShort67 * Static400.aFloat95);
			arg1.anInt3547 = this.aClass39_Sub2_25.anInt3796 + local604 * this.aClass39_Sub2_25.anInt3801 / arg2;
			arg1.anInt3545 = this.aClass39_Sub2_25.anInt3804 * local585 / arg2 + this.aClass39_Sub2_25.anInt3798;
			arg1.anInt3548 = this.aClass39_Sub2_25.anInt3801 * local547 / arg2 + this.aClass39_Sub2_25.anInt3796;
			arg1.anInt3546 = this.aClass39_Sub2_25.anInt3798 + this.aClass39_Sub2_25.anInt3804 * local528 / arg2;
			@Pc(677) int local677 = (int) (Static42.aFloat7 * (float) local509 + (float) this.aShort67 * Static167.aFloat32 + Static291.aFloat74 * (float) local501 + Static147.aFloat29);
			if (this.aClass39_Sub2_25.anInt3795 > local566 && this.aClass39_Sub2_25.anInt3795 > local677) {
				arg1.aBoolean227 = true;
				arg1.anInt3544 = this.aClass39_Sub2_25.anInt3804 * (this.aShort65 + local528) / arg2 + this.aClass39_Sub2_25.anInt3798 - arg1.anInt3546;
			}
		}
		this.aClass39_Sub2_25.method3159((float) arg2);
		this.aClass39_Sub2_25.method3182();
		this.aClass39_Sub2_25.method3166(local19);
		this.method3557();
		this.aClass39_Sub2_25.method3226();
		this.method3556();
	}

	@OriginalMember(owner = "client!lu", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean299) {
			this.method3559();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!lu", name = "E", descriptor = "(I)V")
	@Override
	public void E(@OriginalArg(0) int arg0) {
		this.aShort69 = (short) arg0;
		if (this.aClass89_9 != null) {
			this.aClass89_9.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	@Override
	public Class1_Sub2_Sub1 fa(@OriginalArg(0) Class1_Sub2_Sub1 arg0) {
		if (this.anInt4292 == 0) {
			return null;
		}
		if (!this.aBoolean299) {
			this.method3559();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass39_Sub2_25.anInt3819 <= 0) {
			local43 = this.aShort64 - (this.aClass39_Sub2_25.anInt3819 * this.aShort63 >> 8) >> this.aClass39_Sub2_25.anInt3777;
			local60 = this.aShort68 - (this.aClass39_Sub2_25.anInt3819 * this.aShort67 >> 8) >> this.aClass39_Sub2_25.anInt3777;
		} else {
			local43 = this.aShort64 - (this.aClass39_Sub2_25.anInt3819 * this.aShort67 >> 8) >> this.aClass39_Sub2_25.anInt3777;
			local60 = this.aShort68 - (this.aShort63 * this.aClass39_Sub2_25.anInt3819 >> 8) >> this.aClass39_Sub2_25.anInt3777;
		}
		@Pc(120) int local120;
		@Pc(137) int local137;
		if (this.aClass39_Sub2_25.anInt3808 > 0) {
			local120 = this.aShort70 - (this.aClass39_Sub2_25.anInt3808 * this.aShort67 >> 8) >> this.aClass39_Sub2_25.anInt3777;
			local137 = this.aShort71 - (this.aClass39_Sub2_25.anInt3808 * this.aShort63 >> 8) >> this.aClass39_Sub2_25.anInt3777;
		} else {
			local120 = this.aShort70 - (this.aShort63 * this.aClass39_Sub2_25.anInt3808 >> 8) >> this.aClass39_Sub2_25.anInt3777;
			local137 = this.aShort71 - (this.aShort67 * this.aClass39_Sub2_25.anInt3808 >> 8) >> this.aClass39_Sub2_25.anInt3777;
		}
		@Pc(180) int local180 = local60 + 1 - local43;
		@Pc(187) int local187 = local137 + 1 - local120;
		@Pc(190) Class1_Sub2_Sub1_Sub1 local190 = (Class1_Sub2_Sub1_Sub1) arg0;
		@Pc(206) Class1_Sub2_Sub1_Sub1 local206;
		if (local190 != null && local190.method61(local180, local187)) {
			local206 = local190;
			local190.method60();
		} else {
			local206 = new Class1_Sub2_Sub1_Sub1(this.aClass39_Sub2_25, local180, local187);
		}
		local206.method62(local43, local137, local60, local120);
		this.method3563(local206);
		return local206;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "()[Lclient!dv;")
	@Override
	public Class57[] method3530() {
		return this.aClass57Array3;
	}

	@OriginalMember(owner = "client!lu", name = "D", descriptor = "()I")
	@Override
	public int D() {
		return this.aShort69;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V")
	private void method3556() {
		if (this.aClass52Array1 == null) {
			return;
		}
		@Pc(8) Class33_Sub2 local8 = this.aClass39_Sub2_25.aClass33_Sub2_2;
		@Pc(12) float local12 = this.aClass39_Sub2_25.xa();
		@Pc(16) float local16 = this.aClass39_Sub2_25.W();
		this.aClass39_Sub2_25.method3196();
		this.aClass39_Sub2_25.method4504(false);
		this.aClass39_Sub2_25.method3186(false);
		this.aClass39_Sub2_25.method3181(null, this.aClass39_Sub2_25.aClass89_2, this.aClass39_Sub2_25.aClass89_1, null);
		for (@Pc(47) int local47 = 0; local47 < this.anInt4264; local47++) {
			@Pc(54) Class52 local54 = this.aClass52Array1[local47];
			@Pc(59) Class187 local59 = this.aClass187Array1[local47];
			if (!local54.aBoolean93 || !this.aClass39_Sub2_25.method4547()) {
				@Pc(87) float local87 = (float) (this.anIntArray360[local54.anInt1680] + this.anIntArray360[local54.anInt1684] + this.anIntArray360[local54.anInt1681]) * 0.3333333F;
				@Pc(108) float local108 = (float) (this.anIntArray356[local54.anInt1684] + this.anIntArray356[local54.anInt1680] + this.anIntArray356[local54.anInt1681]) * 0.3333333F;
				@Pc(130) float local130 = (float) (this.anIntArray358[local54.anInt1681] + this.anIntArray358[local54.anInt1680] + this.anIntArray358[local54.anInt1684]) * 0.3333333F;
				@Pc(144) float local144 = Static71.aFloat31 + local108 * Static278.aFloat71 + Static411.aFloat97 * local87 + Static136.aFloat22 * local130;
				@Pc(158) float local158 = Static308.aFloat75 + local87 * Static422.aFloat99 + local108 * Static400.aFloat95 + local130 * Static84.aFloat13;
				@Pc(172) float local172 = Static147.aFloat29 + local130 * Static42.aFloat7 + Static291.aFloat74 * local87 + local108 * Static167.aFloat32;
				local8.method4618(local144 + (float) local59.anInt5171, -local158 + (float) local59.anInt5173, -local172, local59.anInt5176, local59.anInt5175 * local54.aShort19 >> 7, local54.aShort17 * local59.anInt5172 >> 7);
				this.aClass39_Sub2_25.method3187(local8);
				this.aClass39_Sub2_25.g(local16, local12 - (float) local54.anInt1677 * 1.5F);
				@Pc(223) int local223 = local59.anInt5178;
				OpenGL.glColor4ub((byte) (local223 >> 16), (byte) (local223 >> 8), (byte) local223, (byte) (local223 >> 24));
				this.aClass39_Sub2_25.method3218(local54.aShort18);
				this.aClass39_Sub2_25.method3205(local54.aByte26);
				this.aClass39_Sub2_25.method3162(local54.aByte25);
				this.aClass39_Sub2_25.method3167(4);
			}
		}
		this.aClass39_Sub2_25.g(local16, local12);
		this.aClass39_Sub2_25.method4504(true);
		this.aClass39_Sub2_25.method3226();
	}

	@OriginalMember(owner = "client!lu", name = "aa", descriptor = "(I)V")
	@Override
	public void aa(@OriginalArg(0) int arg0) {
		this.aShort66 = (short) arg0;
		if (this.aClass89_9 != null) {
			this.aClass89_9.anInterface12_1 = null;
		}
		if (this.aClass89_10 != null) {
			this.aClass89_10.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "UA", descriptor = "(I)V")
	@Override
	public void UA(@OriginalArg(0) int arg0) {
		this.anInt4253 = arg0;
		this.aBoolean298 = true;
		if (this.aClass117_1 != null && (this.anInt4253 & 0x10000) == 0) {
			this.aShortArray67 = this.aClass117_1.aShortArray48;
			this.aShortArray69 = this.aClass117_1.aShortArray47;
			this.aShortArray64 = this.aClass117_1.aShortArray49;
			this.aByteArray66 = this.aClass117_1.aByteArray57;
			this.aClass117_1 = null;
		}
		this.method3560();
	}

	@OriginalMember(owner = "client!lu", name = "IA", descriptor = "()V")
	@Override
	public void IA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4312; local7++) {
			this.anIntArray358[local7] = -this.anIntArray358[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4292; local25++) {
			this.aShortArray64[local25] = (short) -this.aShortArray64[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt4258; local48++) {
			@Pc(55) short local55 = this.aShortArray66[local48];
			this.aShortArray66[local48] = this.aShortArray62[local48];
			this.aShortArray62[local48] = local55;
		}
		if (this.aClass89_10 == null && this.aClass89_9 != null) {
			this.aClass89_9.anInterface12_1 = null;
		}
		if (this.aClass89_10 != null) {
			this.aClass89_10.anInterface12_1 = null;
		}
		this.aBoolean299 = false;
		if (this.aClass267_1 != null) {
			this.aClass267_1.anInterface9_5 = null;
		}
		if (this.aClass89_8 != null) {
			this.aClass89_8.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "(IIII)V")
	@Override
	protected void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static207.anInt3929 = 0;
			Static306.anInt5292 = 0;
			local16 = 0;
			Static142.anInt5534 = 0;
			for (local20 = 0; local20 < this.anInt4312; local20++) {
				Static306.anInt5292 += this.anIntArray360[local20];
				Static142.anInt5534 += this.anIntArray356[local20];
				local16++;
				Static207.anInt3929 += this.anIntArray358[local20];
			}
			if (local16 <= 0) {
				Static207.anInt3929 = arg3;
				Static306.anInt5292 = arg1;
				Static142.anInt5534 = arg2;
			} else {
				Static207.anInt3929 = Static207.anInt3929 / local16 + arg3;
				Static306.anInt5292 = Static306.anInt5292 / local16 + arg1;
				Static142.anInt5534 = arg2 + Static142.anInt5534 / local16;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt4312; local16++) {
				this.anIntArray360[local16] += arg1;
				this.anIntArray356[local16] += arg2;
				this.anIntArray358[local16] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt4312; local16++) {
					this.anIntArray360[local16] -= Static306.anInt5292;
					this.anIntArray356[local16] -= Static142.anInt5534;
					this.anIntArray358[local16] -= Static207.anInt3929;
					if (arg3 != 0) {
						local20 = Class183.anIntArray433[arg3];
						local164 = Class183.anIntArray434[arg3];
						local182 = this.anIntArray360[local16] * local164 + this.anIntArray356[local16] * local20 + 32767 >> 15;
						this.anIntArray356[local16] = local164 * this.anIntArray356[local16] + 32767 - this.anIntArray360[local16] * local20 >> 15;
						this.anIntArray360[local16] = local182;
					}
					if (arg1 != 0) {
						local20 = Class183.anIntArray433[arg1];
						local164 = Class183.anIntArray434[arg1];
						local182 = this.anIntArray356[local16] * local164 + 32767 - local20 * this.anIntArray358[local16] >> 15;
						this.anIntArray358[local16] = local164 * this.anIntArray358[local16] + local20 * this.anIntArray356[local16] + 32767 >> 15;
						this.anIntArray356[local16] = local182;
					}
					if (arg2 != 0) {
						local20 = Class183.anIntArray433[arg2];
						local164 = Class183.anIntArray434[arg2];
						local182 = local20 * this.anIntArray358[local16] + local164 * this.anIntArray360[local16] + 32767 >> 15;
						this.anIntArray358[local16] = local164 * this.anIntArray358[local16] + 32767 - local20 * this.anIntArray360[local16] >> 15;
						this.anIntArray360[local16] = local182;
					}
					this.anIntArray360[local16] += Static306.anInt5292;
					this.anIntArray356[local16] += Static142.anInt5534;
					this.anIntArray358[local16] += Static207.anInt3929;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt4312; local16++) {
					this.anIntArray360[local16] -= Static306.anInt5292;
					this.anIntArray356[local16] -= Static142.anInt5534;
					this.anIntArray358[local16] -= Static207.anInt3929;
					this.anIntArray360[local16] = this.anIntArray360[local16] * arg1 / 128;
					this.anIntArray356[local16] = arg2 * this.anIntArray356[local16] / 128;
					this.anIntArray358[local16] = arg3 * this.anIntArray358[local16] / 128;
					this.anIntArray360[local16] += Static306.anInt5292;
					this.anIntArray356[local16] += Static142.anInt5534;
					this.anIntArray358[local16] += Static207.anInt3929;
				}
			} else {
				@Pc(515) Class52 local515;
				@Pc(520) Class187 local520;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt4258; local16++) {
						local20 = (this.aByteArray65[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray65[local16] = (byte) local20;
					}
					if (this.aClass89_9 != null) {
						this.aClass89_9.anInterface12_1 = null;
					}
					if (this.aClass52Array1 != null) {
						for (local20 = 0; local20 < this.anInt4264; local20++) {
							local515 = this.aClass52Array1[local20];
							local520 = this.aClass187Array1[local20];
							local520.anInt5178 = 255 - (this.aByteArray65[local515.anInt1679] & 0xFF) << 24 | local520.anInt5178 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt4258; local16++) {
						local20 = this.aShortArray63[local16] & 0xFFFF;
						local164 = local20 >> 10 & 0x3F;
						local182 = local20 >> 7 & 0x7;
						@Pc(577) int local577 = local20 & 0x7F;
						local182 += arg2 / 4;
						@Pc(589) int local589 = local164 + arg1 & 0x3F;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						local577 += arg3;
						if (local577 < 0) {
							local577 = 0;
						} else if (local577 > 127) {
							local577 = 127;
						}
						this.aShortArray63[local16] = (short) (local577 | local589 << 10 | local182 << 7);
					}
					if (this.aClass89_9 != null) {
						this.aClass89_9.anInterface12_1 = null;
					}
					if (this.aClass52Array1 != null) {
						for (local20 = 0; local20 < this.anInt4264; local20++) {
							local515 = this.aClass52Array1[local20];
							local520 = this.aClass187Array1[local20];
							local520.anInt5178 = local520.anInt5178 & 0xFF000000 | Static337.anIntArray223[this.aShortArray63[local515.anInt1679] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(707) Class187 local707;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt4264; local16++) {
							local707 = this.aClass187Array1[local16];
							local707.anInt5171 += arg1;
							local707.anInt5173 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt4264; local16++) {
							local707 = this.aClass187Array1[local16];
							local707.anInt5172 = arg2 * local707.anInt5172 >> 7;
							local707.anInt5175 = local707.anInt5175 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt4264; local16++) {
							local707 = this.aClass187Array1[local16];
							local707.anInt5176 = arg1 + local707.anInt5176 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "()V")
	@Override
	protected void j() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4282; local3++) {
			this.anIntArray360[local3] = this.anIntArray360[local3] + 7 >> 4;
			this.anIntArray356[local3] = this.anIntArray356[local3] + 7 >> 4;
			this.anIntArray358[local3] = this.anIntArray358[local3] + 7 >> 4;
		}
		this.aBoolean299 = false;
		if (this.aClass89_8 != null) {
			this.aClass89_8.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)V")
	private void method3557() {
		if (this.anInt4280 == 0) {
			return;
		}
		if (this.aByte74 != 0) {
			this.method3558(true);
		}
		this.method3558(false);
		if (this.aClass267_1 != null) {
			if (this.aClass267_1.anInterface9_5 == null) {
				this.method3562((this.aByte74 & 0x10) != 0);
			}
			if (this.aClass267_1.anInterface9_5 != null) {
				this.aClass39_Sub2_25.method3186(this.aClass89_10 != null);
				this.aClass39_Sub2_25.method3181(this.aClass89_10, this.aClass89_7, this.aClass89_8, this.aClass89_9);
				@Pc(79) int local79 = this.anIntArray359.length - 1;
				for (@Pc(81) int local81 = 0; local81 < local79; local81++) {
					@Pc(88) int local88 = this.anIntArray359[local81];
					@Pc(95) int local95 = this.anIntArray359[local81 + 1];
					@Pc(102) int local102 = this.aShortArray68[local88] & 0xFFFF;
					if (local102 == 65535) {
						local102 = -1;
					}
					this.aClass39_Sub2_25.method3233(this.aClass89_10 != null, local102);
					this.aClass39_Sub2_25.method3184(this.aClass267_1.anInterface9_5, (local95 - local88) * 3, local88 * 3);
				}
			}
		}
		this.method3560();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!c;Lclient!ju;I)V")
	@Override
	public void method3534(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4292 == 0) {
			return;
		}
		@Pc(13) Class33_Sub2 local13 = this.aClass39_Sub2_25.aClass33_Sub2_4;
		@Pc(16) Class33_Sub2 local16 = (Class33_Sub2) arg0;
		if (!this.aBoolean299) {
			this.method3559();
		}
		this.method3554(local16);
		Static147.aFloat29 = local13.aFloat86 + local13.aFloat84 * local16.aFloat79 + local13.aFloat83 * local16.aFloat85 + local13.aFloat77 * local16.aFloat86;
		Static167.aFloat32 = local13.aFloat84 * local16.aFloat82 + local13.aFloat83 * local16.aFloat87 + local16.aFloat83 * local13.aFloat77;
		@Pc(73) float local73 = Static147.aFloat29 + (float) this.aShort63 * Static167.aFloat32;
		@Pc(81) float local81 = Static147.aFloat29 + Static167.aFloat32 * (float) this.aShort67;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local81 < local73) {
			local97 = local73 + (float) this.aShort65;
			local91 = (float) -this.aShort65 + local81;
		} else {
			local91 = local73 - (float) this.aShort65;
			local97 = local81 + (float) this.aShort65;
		}
		if (this.aClass39_Sub2_25.aFloat40 <= local91 || (float) this.aClass39_Sub2_25.anInt3795 >= local97) {
			return;
		}
		Static278.aFloat71 = local16.aFloat83 * local13.aFloat78 + local13.aFloat82 * local16.aFloat87 + local13.aFloat81 * local16.aFloat82;
		Static71.aFloat31 = local13.aFloat79 + local16.aFloat79 * local13.aFloat81 + local13.aFloat82 * local16.aFloat85 + local13.aFloat78 * local16.aFloat86;
		@Pc(174) float local174 = Static278.aFloat71 * (float) this.aShort63 + Static71.aFloat31;
		@Pc(182) float local182 = Static278.aFloat71 * (float) this.aShort67 + Static71.aFloat31;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local182 < local174) {
			local208 = (local174 + (float) this.aShort65) * (float) this.aClass39_Sub2_25.anInt3804;
			local197 = (float) this.aClass39_Sub2_25.anInt3804 * ((float) -this.aShort65 + local182);
		} else {
			local197 = (float) this.aClass39_Sub2_25.anInt3804 * (local174 - (float) this.aShort65);
			local208 = ((float) this.aShort65 + local182) * (float) this.aClass39_Sub2_25.anInt3804;
		}
		if (this.aClass39_Sub2_25.aFloat43 <= local197 / local97 || local208 / local97 <= this.aClass39_Sub2_25.aFloat36) {
			return;
		}
		Static308.aFloat75 = local13.aFloat85 + local13.aFloat88 * local16.aFloat86 + local16.aFloat79 * local13.aFloat80 + local13.aFloat87 * local16.aFloat85;
		Static400.aFloat95 = local13.aFloat88 * local16.aFloat83 + local16.aFloat87 * local13.aFloat87 + local16.aFloat82 * local13.aFloat80;
		@Pc(298) float local298 = Static308.aFloat75 + Static400.aFloat95 * (float) this.aShort63;
		@Pc(306) float local306 = Static400.aFloat95 * (float) this.aShort67 + Static308.aFloat75;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local298 > local306) {
			local321 = (local306 - (float) this.aShort65) * (float) this.aClass39_Sub2_25.anInt3801;
			local332 = (float) this.aClass39_Sub2_25.anInt3801 * ((float) this.aShort65 + local298);
		} else {
			local321 = (float) this.aClass39_Sub2_25.anInt3801 * (local298 - (float) this.aShort65);
			local332 = (float) this.aClass39_Sub2_25.anInt3801 * (local306 + (float) this.aShort65);
		}
		if (this.aClass39_Sub2_25.aFloat35 <= local321 / local97 || local332 / local97 <= this.aClass39_Sub2_25.aFloat44) {
			return;
		}
		if (arg1 != null || this.aClass52Array1 != null) {
			Static84.aFloat13 = local16.aFloat78 * local13.aFloat80 + local16.aFloat88 * local13.aFloat87 + local16.aFloat77 * local13.aFloat88;
			Static411.aFloat97 = local16.aFloat84 * local13.aFloat78 + local16.aFloat81 * local13.aFloat81 + local16.aFloat80 * local13.aFloat82;
			Static42.aFloat7 = local13.aFloat83 * local16.aFloat88 + local16.aFloat78 * local13.aFloat84 + local13.aFloat77 * local16.aFloat77;
			Static422.aFloat99 = local16.aFloat84 * local13.aFloat88 + local13.aFloat80 * local16.aFloat81 + local13.aFloat87 * local16.aFloat80;
			Static136.aFloat22 = local13.aFloat78 * local16.aFloat77 + local13.aFloat81 * local16.aFloat78 + local13.aFloat82 * local16.aFloat88;
			Static291.aFloat74 = local13.aFloat83 * local16.aFloat80 + local13.aFloat84 * local16.aFloat81 + local13.aFloat77 * local16.aFloat84;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.aShort68 + this.aShort64 >> 1;
			@Pc(509) int local509 = this.aShort70 + this.aShort71 >> 1;
			@Pc(528) int local528 = (int) ((float) this.aShort63 * Static278.aFloat71 + (float) local501 * Static411.aFloat97 + Static71.aFloat31 + Static136.aFloat22 * (float) local509);
			@Pc(547) int local547 = (int) ((float) this.aShort63 * Static400.aFloat95 + (float) local501 * Static422.aFloat99 + Static308.aFloat75 + (float) local509 * Static84.aFloat13);
			@Pc(566) int local566 = (int) (Static42.aFloat7 * (float) local509 + Static147.aFloat29 + (float) local501 * Static291.aFloat74 + Static167.aFloat32 * (float) this.aShort63);
			if (this.aClass39_Sub2_25.anInt3795 > local566) {
				local491 = true;
			} else {
				arg1.anInt3548 = this.aClass39_Sub2_25.anInt3796 + this.aClass39_Sub2_25.anInt3801 * local547 / local566;
				arg1.anInt3546 = local528 * this.aClass39_Sub2_25.anInt3804 / local566 + this.aClass39_Sub2_25.anInt3798;
			}
			@Pc(621) int local621 = (int) (Static278.aFloat71 * (float) this.aShort67 + Static71.aFloat31 + (float) local501 * Static411.aFloat97 + (float) local509 * Static136.aFloat22);
			@Pc(640) int local640 = (int) (Static308.aFloat75 + (float) local501 * Static422.aFloat99 + (float) this.aShort67 * Static400.aFloat95 + Static84.aFloat13 * (float) local509);
			@Pc(659) int local659 = (int) (Static147.aFloat29 + (float) local501 * Static291.aFloat74 + Static167.aFloat32 * (float) this.aShort67 + Static42.aFloat7 * (float) local509);
			if (this.aClass39_Sub2_25.anInt3795 <= local659) {
				arg1.anInt3547 = local640 * this.aClass39_Sub2_25.anInt3801 / local659 + this.aClass39_Sub2_25.anInt3796;
				arg1.anInt3545 = this.aClass39_Sub2_25.anInt3798 + this.aClass39_Sub2_25.anInt3804 * local621 / local659;
			} else {
				local491 = true;
			}
			if (local491) {
				if (local566 < this.aClass39_Sub2_25.anInt3795 && this.aClass39_Sub2_25.anInt3795 > local659) {
					local493 = false;
				} else {
					@Pc(739) int local739;
					@Pc(750) int local750;
					@Pc(776) int local776;
					if (local566 < this.aClass39_Sub2_25.anInt3795) {
						local739 = (local659 - this.aClass39_Sub2_25.anInt3795 << 16) / (local659 - local566);
						local750 = local621 + (local739 * (local621 - local528) >> 16);
						arg1.anInt3546 = this.aClass39_Sub2_25.anInt3804 * local750 / this.aClass39_Sub2_25.anInt3795 + this.aClass39_Sub2_25.anInt3798;
						local776 = ((local640 - local547) * local739 >> 16) + local640;
						arg1.anInt3548 = this.aClass39_Sub2_25.anInt3796 + local776 * this.aClass39_Sub2_25.anInt3801 / this.aClass39_Sub2_25.anInt3795;
					} else if (local659 < this.aClass39_Sub2_25.anInt3795) {
						local739 = (local566 - this.aClass39_Sub2_25.anInt3795 << 16) / (local566 - local659);
						local750 = local528 + ((local528 - local621) * local739 >> 16);
						arg1.anInt3546 = this.aClass39_Sub2_25.anInt3804 * local750 / this.aClass39_Sub2_25.anInt3795 + this.aClass39_Sub2_25.anInt3798;
						local776 = ((local547 - local640) * local739 >> 16) + local547;
						arg1.anInt3548 = this.aClass39_Sub2_25.anInt3796 + this.aClass39_Sub2_25.anInt3801 * local776 / this.aClass39_Sub2_25.anInt3795;
					}
				}
			}
			if (local493) {
				if (local659 < local566) {
					arg1.anInt3544 = this.aClass39_Sub2_25.anInt3798 + this.aClass39_Sub2_25.anInt3804 * (this.aShort65 + local528) / local566 - arg1.anInt3546;
				} else {
					arg1.anInt3544 = this.aClass39_Sub2_25.anInt3798 + (this.aShort65 + local621) * this.aClass39_Sub2_25.anInt3804 / local659 - arg1.anInt3545;
				}
				arg1.aBoolean227 = true;
			}
		}
		this.aClass39_Sub2_25.method3185();
		this.aClass39_Sub2_25.method3166(local16);
		this.method3557();
		this.aClass39_Sub2_25.method3226();
		this.method3556();
	}

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "()I")
	@Override
	public int m() {
		if (!this.aBoolean299) {
			this.method3559();
		}
		return this.aShort71;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method3526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class33_Sub2 local8 = (Class33_Sub2) arg2;
		@Pc(12) Class33_Sub2 local12 = this.aClass39_Sub2_25.aClass33_Sub2_4;
		@Pc(33) float local33 = local8.aFloat85 * local12.aFloat82 + local12.aFloat81 * local8.aFloat79 + local12.aFloat78 * local8.aFloat86 + local12.aFloat79;
		@Pc(54) float local54 = local12.aFloat85 + local8.aFloat86 * local12.aFloat88 + local12.aFloat87 * local8.aFloat85 + local8.aFloat79 * local12.aFloat80;
		Static84.aFloat13 = local12.aFloat88 * local8.aFloat77 + local8.aFloat88 * local12.aFloat87 + local8.aFloat78 * local12.aFloat80;
		Static422.aFloat99 = local8.aFloat84 * local12.aFloat88 + local12.aFloat87 * local8.aFloat80 + local12.aFloat80 * local8.aFloat81;
		Static278.aFloat71 = local8.aFloat83 * local12.aFloat78 + local8.aFloat82 * local12.aFloat81 + local12.aFloat82 * local8.aFloat87;
		Static411.aFloat97 = local12.aFloat82 * local8.aFloat80 + local12.aFloat81 * local8.aFloat81 + local12.aFloat78 * local8.aFloat84;
		Static291.aFloat74 = local12.aFloat77 * local8.aFloat84 + local8.aFloat80 * local12.aFloat83 + local8.aFloat81 * local12.aFloat84;
		Static136.aFloat22 = local12.aFloat78 * local8.aFloat77 + local12.aFloat82 * local8.aFloat88 + local12.aFloat81 * local8.aFloat78;
		Static42.aFloat7 = local12.aFloat83 * local8.aFloat88 + local8.aFloat78 * local12.aFloat84 + local12.aFloat77 * local8.aFloat77;
		Static167.aFloat32 = local8.aFloat83 * local12.aFloat77 + local12.aFloat84 * local8.aFloat82 + local12.aFloat83 * local8.aFloat87;
		@Pc(219) float local219 = local12.aFloat86 + local8.aFloat86 * local12.aFloat77 + local12.aFloat83 * local8.aFloat85 + local12.aFloat84 * local8.aFloat79;
		Static400.aFloat95 = local8.aFloat83 * local12.aFloat88 + local8.aFloat87 * local12.aFloat87 + local8.aFloat82 * local12.aFloat80;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass39_Sub2_25.anInt3804;
		@Pc(255) int local255 = this.aClass39_Sub2_25.anInt3801;
		if (!this.aBoolean299) {
			this.method3559();
		}
		Static261.anIntArray405[0] = this.aShort64;
		Static324.anIntArray513[0] = this.aShort63;
		Static314.anIntArray496[0] = this.aShort70;
		Static261.anIntArray405[1] = this.aShort68;
		Static324.anIntArray513[1] = this.aShort63;
		Static261.anIntArray405[2] = this.aShort64;
		Static314.anIntArray496[1] = this.aShort70;
		Static324.anIntArray513[2] = this.aShort67;
		Static261.anIntArray405[3] = this.aShort68;
		Static314.anIntArray496[2] = this.aShort70;
		Static324.anIntArray513[3] = this.aShort67;
		Static261.anIntArray405[4] = this.aShort64;
		Static314.anIntArray496[3] = this.aShort70;
		Static324.anIntArray513[4] = this.aShort63;
		Static314.anIntArray496[4] = this.aShort71;
		Static261.anIntArray405[5] = this.aShort68;
		Static324.anIntArray513[5] = this.aShort63;
		Static261.anIntArray405[6] = this.aShort64;
		Static314.anIntArray496[5] = this.aShort71;
		Static324.anIntArray513[6] = this.aShort67;
		Static314.anIntArray496[6] = this.aShort71;
		Static261.anIntArray405[7] = this.aShort68;
		Static324.anIntArray513[7] = this.aShort67;
		Static314.anIntArray496[7] = this.aShort71;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static261.anIntArray405[local383];
			local395 = Static314.anIntArray496[local383];
			local400 = Static324.anIntArray513[local383];
			local414 = Static42.aFloat7 * local395 + Static291.aFloat74 * local390 + local400 * Static167.aFloat32 + local219;
			local428 = Static84.aFloat13 * local395 + Static422.aFloat99 * local390 + Static400.aFloat95 * local400 + local54;
			local442 = local33 + local395 * Static136.aFloat22 + local390 * Static411.aFloat97 + Static278.aFloat71 * local400;
			if (local414 >= (float) this.aClass39_Sub2_25.anInt3795) {
				@Pc(461) float local461 = (float) this.aClass39_Sub2_25.anInt3798 + (float) local251 * local442 / local414;
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(479) float local479 = (float) this.aClass39_Sub2_25.anInt3796 + local428 * (float) local255 / local414;
				if (local461 > local243) {
					local243 = local461;
				}
				local239 = true;
				if (local245 > local479) {
					local245 = local479;
				}
				if (local479 > local247) {
					local247 = local479;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt4292 > this.aClass39_Sub2_25.anIntArray313.length) {
				this.aClass39_Sub2_25.anIntArray313 = new int[this.anInt4292];
				this.aClass39_Sub2_25.anIntArray315 = new int[this.anInt4292];
			}
			@Pc(558) int[] local558 = this.aClass39_Sub2_25.anIntArray313;
			@Pc(562) int[] local562 = this.aClass39_Sub2_25.anIntArray315;
			@Pc(646) int local646;
			for (@Pc(564) int local564 = 0; local564 < this.anInt4312; local564++) {
				local395 = this.anIntArray358[local564];
				local390 = this.anIntArray360[local564];
				local400 = this.anIntArray356[local564];
				local442 = local395 * Static136.aFloat22 + Static278.aFloat71 * local400 + Static411.aFloat97 * local390 + local33;
				local428 = local395 * Static84.aFloat13 + local400 * Static400.aFloat95 + local390 * Static422.aFloat99 + local54;
				local414 = local219 + local395 * Static42.aFloat7 + local400 * Static167.aFloat32 + local390 * Static291.aFloat74;
				@Pc(659) int local659;
				@Pc(664) int local664;
				@Pc(671) int local671;
				if (local414 >= (float) this.aClass39_Sub2_25.anInt3795) {
					local646 = (int) ((float) this.aClass39_Sub2_25.anInt3798 + local442 * (float) local251 / local414);
					local659 = (int) ((float) this.aClass39_Sub2_25.anInt3796 + local428 * (float) local255 / local414);
					local664 = this.anIntArray357[local564];
					local671 = this.anIntArray357[local564 + 1];
					for (@Pc(673) int local673 = local664; local673 < local671; local673++) {
						@Pc(682) int local682 = this.aShortArray60[local673] - 1;
						if (local682 == -1) {
							break;
						}
						local558[local682] = local646;
						local562[local682] = local659;
					}
				} else {
					local646 = this.anIntArray357[local564];
					local659 = this.anIntArray357[local564 + 1];
					for (local664 = local646; local664 < local659; local664++) {
						local671 = this.aShortArray60[local664] - 1;
						if (local671 == -1) {
							break;
						}
						local558[this.aShortArray60[local664] - 1] = -999999;
					}
				}
			}
			for (local646 = 0; local646 < this.anInt4258; local646++) {
				if (local558[this.aShortArray66[local646]] != -999999 && local558[this.aShortArray59[local646]] != -999999 && local558[this.aShortArray62[local646]] != -999999 && this.method3549(arg0, local562[this.aShortArray62[local646]], local558[this.aShortArray66[local646]], local558[this.aShortArray62[local646]], local562[this.aShortArray59[local646]], local558[this.aShortArray59[local646]], local562[this.aShortArray66[local646]], arg1)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "M", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static142.anInt5534 = 0;
			local29 = 0;
			Static207.anInt3929 = 0;
			Static306.anInt5292 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray45.length) {
					local55 = this.anIntArrayArray45[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray61 == null || (this.aShortArray61[local63] & arg6) != 0) {
							Static306.anInt5292 += this.anIntArray360[local63];
							Static142.anInt5534 += this.anIntArray356[local63];
							local29++;
							Static207.anInt3929 += this.anIntArray358[local63];
						}
					}
				}
			}
			if (local29 <= 0) {
				Static306.anInt5292 = arg2;
				Static142.anInt5534 = arg3;
				Static207.anInt3929 = arg4;
			} else {
				Static142.anInt5534 = Static142.anInt5534 / local29 + arg3;
				Static426.aBoolean481 = true;
				Static306.anInt5292 = arg2 + Static306.anInt5292 / local29;
				Static207.anInt3929 = arg4 + Static207.anInt3929 / local29;
			}
			return;
		}
		@Pc(256) int[] local256;
		@Pc(258) int local258;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[2] * arg4 + arg7[0] * arg2 + arg3 * arg7[1] + 16384 >> 15;
				local35 = arg7[3] * arg2 + arg3 * arg7[4] + arg4 * arg7[5] + 16384 >> 15;
				local41 = arg7[6] * arg2 + arg3 * arg7[7] + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local29;
				arg3 = local35;
				arg4 = local41;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray45.length > local35) {
					local256 = this.anIntArrayArray45[local35];
					for (local258 = 0; local258 < local256.length; local258++) {
						local57 = local256[local258];
						if (this.aShortArray61 == null || (this.aShortArray61[local57] & arg6) != 0) {
							this.anIntArray360[local57] += arg2;
							this.anIntArray356[local57] += arg3;
							this.anIntArray358[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(399) int local399;
		@Pc(417) int local417;
		@Pc(647) int local647;
		@Pc(656) int local656;
		@Pc(668) int local668;
		@Pc(672) int local672;
		@Pc(690) int local690;
		@Pc(1032) int local1032;
		@Pc(1040) int local1040;
		@Pc(1194) int local1194;
		@Pc(1219) int local1219;
		@Pc(1223) int local1223;
		@Pc(1231) int local1231;
		@Pc(1236) int local1236;
		@Pc(1240) int local1240;
		@Pc(1244) int local1244;
		@Pc(1246) int local1246;
		@Pc(1378) int[] local1378;
		@Pc(1380) int local1380;
		@Pc(1384) int local1384;
		@Pc(1388) int local1388;
		@Pc(1390) int local1390;
		@Pc(1517) int local1517;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray45.length) {
						local256 = this.anIntArrayArray45[local35];
						for (local258 = 0; local258 < local256.length; local258++) {
							local57 = local256[local258];
							if (this.aShortArray61 == null || (this.aShortArray61[local57] & arg6) != 0) {
								this.anIntArray360[local57] -= Static306.anInt5292;
								this.anIntArray356[local57] -= Static142.anInt5534;
								this.anIntArray358[local57] -= Static207.anInt3929;
								if (arg4 != 0) {
									local63 = Class183.anIntArray433[arg4];
									local399 = Class183.anIntArray434[arg4];
									local417 = local399 * this.anIntArray360[local57] + local63 * this.anIntArray356[local57] + 32767 >> 15;
									this.anIntArray356[local57] = local399 * this.anIntArray356[local57] + 32767 - this.anIntArray360[local57] * local63 >> 15;
									this.anIntArray360[local57] = local417;
								}
								if (arg2 != 0) {
									local63 = Class183.anIntArray433[arg2];
									local399 = Class183.anIntArray434[arg2];
									local417 = this.anIntArray356[local57] * local399 + 32767 - local63 * this.anIntArray358[local57] >> 15;
									this.anIntArray358[local57] = local63 * this.anIntArray356[local57] + local399 * this.anIntArray358[local57] + 32767 >> 15;
									this.anIntArray356[local57] = local417;
								}
								if (arg3 != 0) {
									local63 = Class183.anIntArray433[arg3];
									local399 = Class183.anIntArray434[arg3];
									local417 = local63 * this.anIntArray358[local57] + local399 * this.anIntArray360[local57] + 32767 >> 15;
									this.anIntArray358[local57] = local399 * this.anIntArray358[local57] + 32767 - this.anIntArray360[local57] * local63 >> 15;
									this.anIntArray360[local57] = local417;
								}
								this.anIntArray360[local57] += Static306.anInt5292;
								this.anIntArray356[local57] += Static142.anInt5534;
								this.anIntArray358[local57] += Static207.anInt3929;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray45.length > local41) {
							local55 = this.anIntArrayArray45[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray61 == null || (this.aShortArray61[local63] & arg6) != 0) {
									local399 = this.anIntArray357[local63];
									local417 = this.anIntArray357[local63 + 1];
									for (local647 = local399; local647 < local417; local647++) {
										local656 = this.aShortArray60[local647] - 1;
										if (local656 == -1) {
											break;
										}
										if (arg4 != 0) {
											local668 = Class183.anIntArray433[arg4];
											local672 = Class183.anIntArray434[arg4];
											local690 = local668 * this.aShortArray69[local656] + this.aShortArray67[local656] * local672 + 32767 >> 15;
											this.aShortArray69[local656] = (short) (this.aShortArray69[local656] * local672 + 32767 - local668 * this.aShortArray67[local656] >> 15);
											this.aShortArray67[local656] = (short) local690;
										}
										if (arg2 != 0) {
											local668 = Class183.anIntArray433[arg2];
											local672 = Class183.anIntArray434[arg2];
											local690 = local672 * this.aShortArray69[local656] + 32767 - local668 * this.aShortArray64[local656] >> 15;
											this.aShortArray64[local656] = (short) (this.aShortArray64[local656] * local672 + local668 * this.aShortArray69[local656] + 32767 >> 15);
											this.aShortArray69[local656] = (short) local690;
										}
										if (arg3 != 0) {
											local668 = Class183.anIntArray433[arg3];
											local672 = Class183.anIntArray434[arg3];
											local690 = this.aShortArray64[local656] * local668 + local672 * this.aShortArray67[local656] + 32767 >> 15;
											this.aShortArray64[local656] = (short) (this.aShortArray64[local656] * local672 + 32767 - local668 * this.aShortArray67[local656] >> 15);
											this.aShortArray67[local656] = (short) local690;
										}
									}
								}
							}
						}
					}
					if (this.aClass89_10 == null && this.aClass89_9 != null) {
						this.aClass89_9.anInterface12_1 = null;
					}
					if (this.aClass89_10 != null) {
						this.aClass89_10.anInterface12_1 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local258 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static426.aBoolean481) {
					local399 = arg7[6] * Static207.anInt3929 + Static142.anInt5534 * arg7[3] + Static306.anInt5292 * arg7[0] + 16384 >> 15;
					local417 = Static207.anInt3929 * arg7[7] + Static306.anInt5292 * arg7[1] + arg7[4] * Static142.anInt5534 + 16384 >> 15;
					local647 = arg7[8] * Static207.anInt3929 + arg7[5] * Static142.anInt5534 + Static306.anInt5292 * arg7[2] + 16384 >> 15;
					local417 += local57;
					local399 += local258;
					local647 += local63;
					Static306.anInt5292 = local399;
					Static142.anInt5534 = local417;
					Static426.aBoolean481 = false;
					Static207.anInt3929 = local647;
				}
				@Pc(1000) int[] local1000 = new int[9];
				local417 = Class183.anIntArray434[arg2];
				local647 = Class183.anIntArray433[arg2];
				local656 = Class183.anIntArray434[arg3];
				local668 = Class183.anIntArray433[arg3];
				local672 = Class183.anIntArray434[arg4];
				local690 = Class183.anIntArray433[arg4];
				local1032 = local672 * local647 + 16384 >> 15;
				local1040 = local647 * local690 + 16384 >> 15;
				local1000[3] = local417 * local690 + 16384 >> 15;
				local1000[1] = local668 * local1032 + -local656 * local690 + 16384 >> 15;
				local1000[5] = -local647;
				local1000[4] = local417 * local672 + 16384 >> 15;
				local1000[0] = local1040 * local668 + local672 * local656 + 16384 >> 15;
				local1000[2] = local417 * local668 + 16384 >> 15;
				local1000[6] = local1040 * local656 + -local668 * local672 + 16384 >> 15;
				local1000[7] = local690 * local668 + local656 * local1032 + 16384 >> 15;
				local1000[8] = local417 * local656 + 16384 >> 15;
				@Pc(1169) int local1169 = local1000[2] * -Static207.anInt3929 + -Static142.anInt5534 * local1000[1] + -Static306.anInt5292 * local1000[0] + 16384 >> 15;
				local1194 = -Static142.anInt5534 * local1000[4] + -Static306.anInt5292 * local1000[3] + local1000[5] * -Static207.anInt3929 + 16384 >> 15;
				local1219 = -Static306.anInt5292 * local1000[6] + local1000[7] * -Static142.anInt5534 + local1000[8] * -Static207.anInt3929 + 16384 >> 15;
				local1223 = local1169 + Static306.anInt5292;
				@Pc(1227) int local1227 = Static142.anInt5534 + local1194;
				local1231 = local1219 + Static207.anInt3929;
				@Pc(1234) int[] local1234 = new int[9];
				for (local1236 = 0; local1236 < 3; local1236++) {
					for (local1240 = 0; local1240 < 3; local1240++) {
						local1244 = 0;
						for (local1246 = 0; local1246 < 3; local1246++) {
							local1244 += arg7[local1240 * 3 + local1246] * local1000[local1246 + local1236 * 3];
						}
						local1234[local1236 * 3 + local1240] = local1244 + 16384 >> 15;
					}
				}
				local1240 = local63 * local1000[2] + local258 * local1000[0] + local57 * local1000[1] + 16384 >> 15;
				local1244 = local1000[5] * local63 + local1000[3] * local258 + local1000[4] * local57 + 16384 >> 15;
				local1244 += local1227;
				local1240 += local1223;
				local1246 = local63 * local1000[8] + local258 * local1000[6] + local57 * local1000[7] + 16384 >> 15;
				local1246 += local1231;
				local1378 = new int[9];
				for (local1380 = 0; local1380 < 3; local1380++) {
					for (local1384 = 0; local1384 < 3; local1384++) {
						local1388 = 0;
						for (local1390 = 0; local1390 < 3; local1390++) {
							local1388 += local1234[local1390 * 3 + local1384] * arg7[local1380 * 3 + local1390];
						}
						local1378[local1380 * 3 + local1384] = local1388 + 16384 >> 15;
					}
				}
				local1384 = arg7[2] * local1246 + arg7[1] * local1244 + local1240 * arg7[0] + 16384 >> 15;
				local1388 = local1246 * arg7[5] + arg7[4] * local1244 + local1240 * arg7[3] + 16384 >> 15;
				local1384 += local29;
				local1388 += local35;
				local1390 = local1246 * arg7[8] + local1240 * arg7[6] + local1244 * arg7[7] + 16384 >> 15;
				local1390 += local41;
				for (local1517 = 0; local1517 < local8; local1517++) {
					@Pc(1523) int local1523 = arg1[local1517];
					if (this.anIntArrayArray45.length > local1523) {
						@Pc(1537) int[] local1537 = this.anIntArrayArray45[local1523];
						for (@Pc(1539) int local1539 = 0; local1539 < local1537.length; local1539++) {
							@Pc(1545) int local1545 = local1537[local1539];
							if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local1545]) != 0) {
								@Pc(1587) int local1587 = this.anIntArray356[local1545] * local1378[1] + this.anIntArray360[local1545] * local1378[0] + local1378[2] * this.anIntArray358[local1545] + 16384 >> 15;
								@Pc(1618) int local1618 = this.anIntArray358[local1545] * local1378[5] + local1378[4] * this.anIntArray356[local1545] + this.anIntArray360[local1545] * local1378[3] + 16384 >> 15;
								@Pc(1622) int local1622 = local1618 + local1388;
								@Pc(1626) int local1626 = local1587 + local1384;
								@Pc(1659) int local1659 = local1378[6] * this.anIntArray360[local1545] + local1378[7] * this.anIntArray356[local1545] + local1378[8] * this.anIntArray358[local1545] + 16384 >> 15;
								@Pc(1663) int local1663 = local1659 + local1390;
								this.anIntArray360[local1545] = local1626;
								this.anIntArray356[local1545] = local1622;
								this.anIntArray358[local1545] = local1663;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2606) Class52 local2606;
			@Pc(2611) Class187 local2611;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray46.length) {
							local256 = this.anIntArrayArray46[local35];
							for (local258 = 0; local258 < local256.length; local258++) {
								local57 = local256[local258];
								if (this.aShortArray65 == null || (arg6 & this.aShortArray65[local57]) != 0) {
									local63 = (this.aByteArray65[local57] & 0xFF) + (arg2 * 8);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray65[local57] = (byte) local63;
									if (this.aClass89_9 != null) {
										this.aClass89_9.anInterface12_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass52Array1 != null) {
						for (local35 = 0; local35 < this.anInt4264; local35++) {
							local2606 = this.aClass52Array1[local35];
							local2611 = this.aClass187Array1[local35];
							local2611.anInt5178 = 255 - (this.aByteArray65[local2606.anInt1679] & 0xFF) << 24 | local2611.anInt5178 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2856) Class187 local2856;
				if (arg0 == 8) {
					if (this.anIntArrayArray44 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray44.length) {
								local256 = this.anIntArrayArray44[local35];
								for (local258 = 0; local258 < local256.length; local258++) {
									local2856 = this.aClass187Array1[local256[local258]];
									local2856.anInt5171 += arg2;
									local2856.anInt5173 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray44 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray44.length) {
								local256 = this.anIntArrayArray44[local35];
								for (local258 = 0; local258 < local256.length; local258++) {
									local2856 = this.aClass187Array1[local256[local258]];
									local2856.anInt5175 = local2856.anInt5175 * arg2 >> 7;
									local2856.anInt5172 = arg3 * local2856.anInt5172 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray44.length > local35) {
							local256 = this.anIntArrayArray44[local35];
							for (local258 = 0; local258 < local256.length; local258++) {
								local2856 = this.aClass187Array1[local256[local258]];
								local2856.anInt5176 = local2856.anInt5176 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray46 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray46.length) {
						local256 = this.anIntArrayArray46[local35];
						for (local258 = 0; local258 < local256.length; local258++) {
							local57 = local256[local258];
							if (this.aShortArray65 == null || (arg6 & this.aShortArray65[local57]) != 0) {
								local63 = this.aShortArray63[local57] & 0xFFFF;
								local399 = local63 >> 10 & 0x3F;
								local417 = local63 >> 7 & 0x7;
								local647 = local63 & 0x7F;
								@Pc(2707) int local2707 = arg2 + local399 & 0x3F;
								local417 += arg3 / 4;
								if (local417 < 0) {
									local417 = 0;
								} else if (local417 > 7) {
									local417 = 7;
								}
								local647 += arg4;
								if (local647 < 0) {
									local647 = 0;
								} else if (local647 > 127) {
									local647 = 127;
								}
								this.aShortArray63[local57] = (short) (local2707 << 10 | local417 << 7 | local647);
								if (this.aClass89_9 != null) {
									this.aClass89_9.anInterface12_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass52Array1 != null) {
					for (local35 = 0; local35 < this.anInt4264; local35++) {
						local2606 = this.aClass52Array1[local35];
						local2611 = this.aClass187Array1[local35];
						local2611.anInt5178 = Static337.anIntArray223[this.aShortArray63[local2606.anInt1679] & 0xFFFF] & 0xFFFFFF | local2611.anInt5178 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray45.length) {
					local256 = this.anIntArrayArray45[local35];
					for (local258 = 0; local258 < local256.length; local258++) {
						local57 = local256[local258];
						if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local57]) != 0) {
							this.anIntArray360[local57] -= Static306.anInt5292;
							this.anIntArray356[local57] -= Static142.anInt5534;
							this.anIntArray358[local57] -= Static207.anInt3929;
							this.anIntArray360[local57] = arg2 * this.anIntArray360[local57] >> 7;
							this.anIntArray356[local57] = arg3 * this.anIntArray356[local57] >> 7;
							this.anIntArray358[local57] = arg4 * this.anIntArray358[local57] >> 7;
							this.anIntArray360[local57] += Static306.anInt5292;
							this.anIntArray356[local57] += Static142.anInt5534;
							this.anIntArray358[local57] += Static207.anInt3929;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local258 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static426.aBoolean481) {
				local399 = arg7[3] * Static142.anInt5534 + Static306.anInt5292 * arg7[0] + Static207.anInt3929 * arg7[6] + 16384 >> 15;
				local417 = Static207.anInt3929 * arg7[7] + arg7[1] * Static306.anInt5292 + Static142.anInt5534 * arg7[4] + 16384 >> 15;
				local399 += local258;
				local417 += local57;
				local647 = Static207.anInt3929 * arg7[8] + Static142.anInt5534 * arg7[5] + Static306.anInt5292 * arg7[2] + 16384 >> 15;
				Static142.anInt5534 = local417;
				Static306.anInt5292 = local399;
				local647 += local63;
				Static207.anInt3929 = local647;
				Static426.aBoolean481 = false;
			}
			local399 = arg2 << 15 >> 7;
			local417 = arg3 << 15 >> 7;
			local647 = arg4 << 15 >> 7;
			local656 = -Static306.anInt5292 * local399 + 16384 >> 15;
			local668 = -Static142.anInt5534 * local417 + 16384 >> 15;
			local672 = local647 * -Static207.anInt3929 + 16384 >> 15;
			local690 = local656 + Static306.anInt5292;
			local1032 = Static142.anInt5534 + local668;
			local1040 = Static207.anInt3929 + local672;
			@Pc(1889) int[] local1889 = new int[] { arg7[0] * local399 + 16384 >> 15, arg7[3] * local399 + 16384 >> 15, local399 * arg7[6] + 16384 >> 15, local417 * arg7[1] + 16384 >> 15, local417 * arg7[4] + 16384 >> 15, arg7[7] * local417 + 16384 >> 15, arg7[2] * local647 + 16384 >> 15, local647 * arg7[5] + 16384 >> 15, arg7[8] * local647 + 16384 >> 15 };
			local1194 = local258 * local399 + 16384 >> 15;
			local1219 = local57 * local417 + 16384 >> 15;
			local1223 = local63 * local647 + 16384 >> 15;
			@Pc(2025) int local2025 = local1194 + local690;
			@Pc(2029) int local2029 = local1219 + local1032;
			@Pc(2033) int local2033 = local1223 + local1040;
			@Pc(2036) int[] local2036 = new int[9];
			@Pc(2042) int local2042;
			for (local1231 = 0; local1231 < 3; local1231++) {
				for (local2042 = 0; local2042 < 3; local2042++) {
					local1236 = 0;
					for (local1240 = 0; local1240 < 3; local1240++) {
						local1236 += arg7[local1231 * 3 + local1240] * local1889[local1240 * 3 + local2042];
					}
					local2036[local2042 + local1231 * 3] = local1236 + 16384 >> 15;
				}
			}
			local2042 = local2033 * arg7[2] + local2025 * arg7[0] + arg7[1] * local2029 + 16384 >> 15;
			local1236 = arg7[4] * local2029 + arg7[3] * local2025 + arg7[5] * local2033 + 16384 >> 15;
			local1240 = local2025 * arg7[6] + local2029 * arg7[7] + local2033 * arg7[8] + 16384 >> 15;
			local1236 += local35;
			local2042 += local29;
			local1240 += local41;
			for (local1244 = 0; local1244 < local8; local1244++) {
				local1246 = arg1[local1244];
				if (local1246 < this.anIntArrayArray45.length) {
					local1378 = this.anIntArrayArray45[local1246];
					for (local1380 = 0; local1380 < local1378.length; local1380++) {
						local1384 = local1378[local1380];
						if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local1384]) != 0) {
							local1388 = local2036[0] * this.anIntArray360[local1384] + local2036[1] * this.anIntArray356[local1384] + local2036[2] * this.anIntArray358[local1384] + 16384 >> 15;
							local1390 = this.anIntArray356[local1384] * local2036[4] + local2036[3] * this.anIntArray360[local1384] + local2036[5] * this.anIntArray358[local1384] + 16384 >> 15;
							@Pc(2286) int local2286 = local1388 + local2042;
							@Pc(2290) int local2290 = local1390 + local1236;
							local1517 = local2036[6] * this.anIntArray360[local1384] + this.anIntArray356[local1384] * local2036[7] + local2036[8] * this.anIntArray358[local1384] + 16384 >> 15;
							this.anIntArray360[local1384] = local2286;
							@Pc(2332) int local2332 = local1517 + local1240;
							this.anIntArray356[local1384] = local2290;
							this.anIntArray358[local1384] = local2332;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		if (!this.aBoolean299) {
			this.method3559();
		}
		return this.aShort67;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZB)V")
	private void method3558(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass89_9 != null && this.aClass89_9.anInterface12_1 == null;
		@Pc(27) boolean local27 = this.aClass89_10 != null && this.aClass89_10.anInterface12_1 == null;
		@Pc(38) boolean local38 = this.aClass89_8 != null && this.aClass89_8.anInterface12_1 == null;
		@Pc(49) boolean local49 = this.aClass89_7 != null && this.aClass89_7.anInterface12_1 == null;
		if (arg0) {
			local16 &= (this.aByte74 & 0x2) != 0;
			local38 &= (this.aByte74 & 0x1) != 0;
			local27 &= (this.aByte74 & 0x4) != 0;
			local49 &= (this.aByte74 & 0x8) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (local38) {
			local103 = 12;
		}
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local111 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.anInt4292 * local103 <= this.aClass39_Sub2_25.aClass1_Sub5_Sub2_1.aByteArray89.length) {
			this.aClass39_Sub2_25.aClass1_Sub5_Sub2_1.anInt6475 = 0;
		} else {
			this.aClass39_Sub2_25.aClass1_Sub5_Sub2_1 = new Class1_Sub5_Sub2((this.anInt4292 + 100) * local103);
		}
		@Pc(193) Class1_Sub5_Sub2 local193 = this.aClass39_Sub2_25.aClass1_Sub5_Sub2_1;
		@Pc(201) int local201;
		@Pc(210) int local210;
		@Pc(238) int local238;
		@Pc(247) int local247;
		if (local38) {
			@Pc(217) int local217;
			@Pc(224) int local224;
			@Pc(229) int local229;
			@Pc(236) int local236;
			if (this.aClass39_Sub2_25.aBoolean250) {
				for (local201 = 0; local201 < this.anInt4312; local201++) {
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray360[local201]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray356[local201]);
					local224 = NativeStream.floatToRawIntBits((float) this.anIntArray358[local201]);
					local229 = this.anIntArray357[local201];
					local236 = this.anIntArray357[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray60[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt6475 = local247 * local103;
						local193.method5417(local210);
						local193.method5417(local217);
						local193.method5417(local224);
					}
				}
			} else {
				for (local201 = 0; local201 < this.anInt4312; local201++) {
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray360[local201]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray356[local201]);
					local224 = NativeStream.floatToRawIntBits((float) this.anIntArray358[local201]);
					local229 = this.anIntArray357[local201];
					local236 = this.anIntArray357[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray60[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt6475 = local247 * local103;
						local193.method5409(local210);
						local193.method5409(local217);
						local193.method5409(local224);
					}
				}
			}
		}
		@Pc(479) float local479;
		@Pc(385) short[] local385;
		@Pc(377) short[] local377;
		@Pc(381) short[] local381;
		@Pc(373) byte[] local373;
		@Pc(532) float local532;
		if (local16) {
			if (this.aClass89_10 == null) {
				if (this.aClass117_1 == null) {
					local373 = this.aByteArray66;
					local377 = this.aShortArray69;
					local385 = this.aShortArray67;
					local381 = this.aShortArray64;
				} else {
					local373 = this.aClass117_1.aByteArray57;
					local377 = this.aClass117_1.aShortArray47;
					local381 = this.aClass117_1.aShortArray49;
					local385 = this.aClass117_1.aShortArray48;
				}
				@Pc(405) float local405 = this.aClass39_Sub2_25.aFloatArray11[0];
				@Pc(411) float local411 = this.aClass39_Sub2_25.aFloatArray11[1];
				@Pc(417) float local417 = this.aClass39_Sub2_25.aFloatArray11[2];
				@Pc(421) float local421 = this.aClass39_Sub2_25.aFloat49;
				@Pc(431) float local431 = this.aClass39_Sub2_25.aFloat46 * 768.0F / (float) this.aShort66;
				@Pc(441) float local441 = this.aClass39_Sub2_25.aFloat37 * 768.0F / (float) this.aShort66;
				for (@Pc(443) int local443 = 0; local443 < this.anInt4258; local443++) {
					@Pc(463) int local463 = this.method3552(this.aShort69, this.aShortArray68[local443], this.aShortArray63[local443], this.aByteArray65[local443]);
					@Pc(468) short local468 = this.aShortArray66[local443];
					local479 = this.aClass39_Sub2_25.aFloat50 * (float) (local463 >> 16 & 0xFF);
					@Pc(490) float local490 = this.aClass39_Sub2_25.aFloat54 * (float) (local463 >> 8 & 0xFF);
					@Pc(499) float local499 = this.aClass39_Sub2_25.aFloat48 * (float) (local463 >>> 24);
					@Pc(504) short local504 = (short) local373[local468];
					if (local504 == 0) {
						local532 = ((float) local381[local468] * local417 + (float) local385[local468] * local405 + (float) local377[local468] * local411) * 0.0026041667F;
					} else {
						local532 = ((float) local377[local468] * local411 + local405 * (float) local385[local468] + local417 * (float) local381[local468]) / (float) (local504 * 256);
					}
					@Pc(572) float local572 = local421 + (local532 < 0.0F ? local441 : local431) * local532;
					@Pc(577) int local577 = (int) (local572 * local499);
					if (local577 < 0) {
						local577 = 0;
					} else if (local577 > 255) {
						local577 = 255;
					}
					@Pc(596) int local596 = (int) (local479 * local572);
					@Pc(601) int local601 = (int) (local490 * local572);
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local193.anInt6475 = local107 + local468 * local103;
					if (local601 < 0) {
						local601 = 0;
					} else if (local601 > 255) {
						local601 = 255;
					}
					local193.method5396(local577);
					local193.method5396(local596);
					local193.method5396(local601);
					local193.method5396(255 - (this.aByteArray65[local443] & 0xFF));
					local468 = this.aShortArray59[local443];
					local504 = local373[local468];
					if (local504 == 0) {
						local532 = (local405 * (float) local385[local468] + local411 * (float) local377[local468] + local417 * (float) local381[local468]) * 0.0026041667F;
					} else {
						local532 = ((float) local381[local468] * local417 + local405 * (float) local385[local468] + local411 * (float) local377[local468]) / (float) (local504 * 256);
					}
					local572 = (local532 < 0.0F ? local441 : local431) * local532 + local421;
					local577 = (int) (local499 * local572);
					local596 = (int) (local479 * local572);
					if (local577 < 0) {
						local577 = 0;
					} else if (local577 > 255) {
						local577 = 255;
					}
					local601 = (int) (local572 * local490);
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					if (local601 < 0) {
						local601 = 0;
					} else if (local601 > 255) {
						local601 = 255;
					}
					local193.anInt6475 = local107 + local103 * local468;
					local193.method5396(local577);
					local193.method5396(local596);
					local193.method5396(local601);
					local193.method5396(255 - (this.aByteArray65[local443] & 0xFF));
					local468 = this.aShortArray62[local443];
					local504 = local373[local468];
					if (local504 == 0) {
						local532 = (local417 * (float) local381[local468] + (float) local377[local468] * local411 + (float) local385[local468] * local405) * 0.0026041667F;
					} else {
						local532 = (local417 * (float) local381[local468] + (float) local385[local468] * local405 + (float) local377[local468] * local411) / (float) (local504 * 256);
					}
					local572 = local421 + (local532 < 0.0F ? local441 : local431) * local532;
					local577 = (int) (local572 * local499);
					if (local577 < 0) {
						local577 = 0;
					} else if (local577 > 255) {
						local577 = 255;
					}
					local596 = (int) (local479 * local572);
					local601 = (int) (local572 * local490);
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local193.anInt6475 = local468 * local103 + local107;
					if (local601 < 0) {
						local601 = 0;
					} else if (local601 > 255) {
						local601 = 255;
					}
					local193.method5396(local577);
					local193.method5396(local596);
					local193.method5396(local601);
					local193.method5396(255 - (this.aByteArray65[local443] & 0xFF));
				}
			} else {
				for (local201 = 0; local201 < this.anInt4258; local201++) {
					local210 = this.method3552(this.aShort69, this.aShortArray68[local201], this.aShortArray63[local201], this.aByteArray65[local201]);
					local193.anInt6475 = local107 + this.aShortArray66[local201] * local103;
					local193.method5417(local210);
					local193.anInt6475 = local103 * this.aShortArray59[local201] + local107;
					local193.method5417(local210);
					local193.anInt6475 = this.aShortArray62[local201] * local103 + local107;
					local193.method5417(local210);
				}
			}
		}
		if (local27) {
			if (this.aClass117_1 == null) {
				local377 = this.aShortArray69;
				local385 = this.aShortArray67;
				local373 = this.aByteArray66;
				local381 = this.aShortArray64;
			} else {
				local381 = this.aClass117_1.aShortArray49;
				local385 = this.aClass117_1.aShortArray48;
				local373 = this.aClass117_1.aByteArray57;
				local377 = this.aClass117_1.aShortArray47;
			}
			@Pc(1114) float local1114 = 3.0F / (float) this.aShort66;
			local532 = 3.0F / (float) (this.aShort66 + this.aShort66 / 2);
			local193.anInt6475 = local109;
			if (this.aClass39_Sub2_25.aBoolean250) {
				for (local238 = 0; local238 < this.anInt4292; local238++) {
					local247 = local373[local238] & 0xFF;
					if (local247 == 0) {
						local193.method5422((float) local385[local238] * local532);
						local193.method5422((float) local377[local238] * local532);
						local193.method5422(local532 * (float) local381[local238]);
					} else {
						local479 = local1114 / (float) local247;
						local193.method5422(local479 * (float) local385[local238]);
						local193.method5422(local479 * (float) local377[local238]);
						local193.method5422(local479 * (float) local381[local238]);
					}
					local193.anInt6475 += local103 - 12;
				}
			} else {
				for (local238 = 0; local238 < this.anInt4292; local238++) {
					local247 = local373[local238] & 0xFF;
					if (local247 == 0) {
						local193.method5420(local532 * (float) local385[local238]);
						local193.method5420((float) local377[local238] * local532);
						local193.method5420(local532 * (float) local381[local238]);
					} else {
						local479 = local1114 / (float) local247;
						local193.method5420((float) local385[local238] * local479);
						local193.method5420(local479 * (float) local377[local238]);
						local193.method5420((float) local381[local238] * local479);
					}
					local193.anInt6475 += local103 - 12;
				}
			}
		}
		if (local49) {
			local193.anInt6475 = local111;
			if (this.aClass39_Sub2_25.aBoolean250) {
				for (local201 = 0; local201 < this.anInt4292; local201++) {
					local193.method5422(this.aFloatArray14[local201]);
					local193.method5422(this.aFloatArray13[local201]);
					local193.anInt6475 += local103 - 8;
				}
			} else {
				for (local201 = 0; local201 < this.anInt4292; local201++) {
					local193.method5420(this.aFloatArray14[local201]);
					local193.method5420(this.aFloatArray13[local201]);
					local193.anInt6475 += local103 - 8;
				}
			}
		}
		local193.anInt6475 = local103 * this.anInt4292;
		@Pc(1407) Interface12 local1407;
		if (arg0) {
			if (this.anInterface12_5 == null) {
				this.anInterface12_5 = this.aClass39_Sub2_25.method3234(local103, true, local193.aByteArray89, local193.anInt6475);
			} else {
				this.anInterface12_5.method5068(local193.aByteArray89, local193.anInt6475, local103);
			}
			this.aByte74 = 0;
			local1407 = this.anInterface12_5;
		} else {
			local1407 = this.aClass39_Sub2_25.method3234(local103, false, local193.aByteArray89, local193.anInt6475);
			this.aBoolean298 = true;
		}
		if (local38) {
			this.aClass89_8.anInterface12_1 = local1407;
			this.aClass89_8.aByte54 = 0;
		}
		if (local49) {
			this.aClass89_7.anInterface12_1 = local1407;
			this.aClass89_7.aByte54 = local111;
		}
		if (local16) {
			this.aClass89_9.anInterface12_1 = local1407;
			this.aClass89_9.aByte54 = local107;
		}
		if (local27) {
			this.aClass89_10.aByte54 = local109;
			this.aClass89_10.anInterface12_1 = local1407;
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "()Z")
	@Override
	public boolean method3538() {
		if (this.aShortArray68 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray68.length; local12++) {
			if (this.aShortArray68[local12] != -1 && !this.aClass39_Sub2_25.anInterface4_12.method2454(this.aShortArray68[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean299) {
			this.method3559();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V")
	private void method3559() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt4312; local27++) {
			@Pc(34) int local34 = this.anIntArray360[local27];
			@Pc(39) int local39 = this.anIntArray356[local27];
			if (local7 > local34) {
				local7 = local34;
			}
			@Pc(53) int local53 = this.anIntArray358[local27];
			if (local34 > local17) {
				local17 = local34;
			}
			if (local39 < local9) {
				local9 = local39;
			}
			if (local39 > local19) {
				local19 = local39;
			}
			if (local53 < local15) {
				local15 = local53;
			}
			if (local53 > local21) {
				local21 = local53;
			}
			@Pc(90) int local90 = local53 * local53 + local34 * local34;
			if (local90 > local23) {
				local23 = local90;
			}
			local90 = local39 * local39 + local53 * local53 + local34 * local34;
			if (local90 > local25) {
				local25 = local90;
			}
		}
		this.aShort64 = (short) local7;
		this.aShort63 = (short) local9;
		this.aShort71 = (short) local21;
		this.aShort70 = (short) local15;
		this.aShort68 = (short) local17;
		this.aShort67 = (short) local19;
		this.aShort65 = (short) (Math.sqrt((double) local23) + 0.99D);
		Math.sqrt((double) local25);
		this.aBoolean299 = true;
	}

	@OriginalMember(owner = "client!lu", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		if (!this.aBoolean299) {
			this.method3559();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!lu", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class183.anIntArray433[arg0];
		@Pc(13) int local13 = Class183.anIntArray434[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4312; local15++) {
			@Pc(33) int local33 = this.anIntArray356[local15] * local13 - this.anIntArray358[local15] * local9 >> 15;
			this.anIntArray358[local15] = local13 * this.anIntArray358[local15] + local9 * this.anIntArray356[local15] >> 15;
			this.anIntArray356[local15] = local33;
		}
		this.aBoolean299 = false;
		if (this.aClass89_8 != null) {
			this.aClass89_8.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "Q", descriptor = "(I)V")
	@Override
	public void Q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class183.anIntArray433[arg0];
		@Pc(13) int local13 = Class183.anIntArray434[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4312; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray360[local15] + this.anIntArray358[local15] * local9 >> 15;
			this.anIntArray358[local15] = this.anIntArray358[local15] * local13 - local9 * this.anIntArray360[local15] >> 15;
			this.anIntArray360[local15] = local33;
		}
		if (this.aClass89_8 != null) {
			this.aClass89_8.anInterface12_1 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!lu", name = "w", descriptor = "()Z")
	@Override
	protected boolean w() {
		if (this.anIntArrayArray45 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4282; local12++) {
			this.anIntArray360[local12] <<= 0x4;
			this.anIntArray356[local12] <<= 0x4;
			this.anIntArray358[local12] <<= 0x4;
		}
		Static207.anInt3929 = 0;
		Static306.anInt5292 = 0;
		Static142.anInt5534 = 0;
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	@Override
	public void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(3) Class149 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean299) {
			this.method3559();
		}
		@Pc(17) int local17 = arg4 + this.aShort64;
		@Pc(23) int local23 = arg4 + this.aShort68;
		@Pc(28) int local28 = this.aShort70 + arg6;
		@Pc(34) int local34 = arg6 + this.aShort71;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt4318 + local23 >> arg2.anInt4316 >= arg2.anInt4317 || local28 < 0 || arg2.anInt4319 <= local34 + arg2.anInt4318 >> arg2.anInt4316)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt4317 <= arg3.anInt4318 + local23 >> arg3.anInt4316 || local28 < 0 || local34 + arg3.anInt4318 >> arg3.anInt4316 >= arg3.anInt4319) {
				return;
			}
		} else {
			local17 >>= arg2.anInt4316;
			local23 = local23 + arg2.anInt4318 - 1 >> arg2.anInt4316;
			local28 >>= arg2.anInt4316;
			local34 = local34 + arg2.anInt4318 - 1 >> arg2.anInt4316;
			if (arg5 == arg2.l(local17, local28) && arg2.l(local23, local28) == arg5 && arg5 == arg2.l(local17, local34) && arg2.l(local23, local34) == arg5) {
				return;
			}
		}
		@Pc(289) int local289;
		if (arg0 == 1) {
			for (local289 = 0; local289 < this.anInt4312; local289++) {
				this.anIntArray356[local289] = this.anIntArray356[local289] + arg2.a(arg4 + this.anIntArray360[local289], arg6 + this.anIntArray358[local289]) - arg5;
			}
		} else {
			@Pc(221) int local221;
			@Pc(232) int local232;
			if (arg0 == 2) {
				@Pc(213) short local213 = this.aShort63;
				if (local213 == 0) {
					return;
				}
				for (local221 = 0; local221 < this.anInt4312; local221++) {
					local232 = (this.anIntArray356[local221] << 16) / local213;
					if (local232 < arg1) {
						this.anIntArray356[local221] += (arg2.a(this.anIntArray360[local221] + arg4, this.anIntArray358[local221] + arg6) - arg5) * (-local232 + arg1) / arg1;
					}
				}
			} else {
				@Pc(357) int local357;
				if (arg0 == 3) {
					local289 = (arg1 & 0xFF) * 4;
					local221 = (arg1 >> 8 & 0xFF) * 4;
					local232 = (arg1 >> 16 & 0xFF) << 6;
					local357 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local289 >> 1) < 0 || (local289 >> 1) + arg4 + arg2.anInt4318 >= arg2.anInt4317 << arg2.anInt4316 || arg6 - (local221 >> 1) < 0 || arg2.anInt4319 << arg2.anInt4316 <= arg6 + (local221 >> 1) + arg2.anInt4318) {
						return;
					}
					this.method3528(local232, local289, arg2, arg6, arg5, local357, arg4, local221);
				} else if (arg0 == 4) {
					local289 = this.aShort67 - this.aShort63;
					for (local221 = 0; local221 < this.anInt4312; local221++) {
						this.anIntArray356[local221] = local289 + this.anIntArray356[local221] + arg3.a(arg4 + this.anIntArray360[local221], this.anIntArray358[local221] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local289 = this.aShort67 - this.aShort63;
					for (local221 = 0; local221 < this.anInt4312; local221++) {
						local232 = arg4 + this.anIntArray360[local221];
						local357 = this.anIntArray358[local221] + arg6;
						@Pc(362) int local362 = arg2.a(local232, local357);
						@Pc(367) int local367 = arg3.a(local232, local357);
						@Pc(372) int local372 = local362 - local367;
						this.anIntArray356[local221] = local362 + (local372 * ((this.anIntArray356[local221] << 8) / local289) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass89_8 != null) {
			this.aClass89_8.anInterface12_1 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)V")
	private void method3560() {
		if (!this.aBoolean298) {
			return;
		}
		this.aBoolean298 = false;
		if (this.aClass244Array3 == null && this.aClass57Array3 == null && this.aClass52Array1 == null) {
			if (this.anIntArray360 != null && !Static104.method5960(this.anInt4253, this.anInt4310)) {
				if (this.aClass89_8 != null && this.aClass89_8.anInterface12_1 == null) {
					this.aBoolean298 = true;
				} else {
					if (!this.aBoolean299) {
						this.method3559();
					}
					this.anIntArray360 = null;
				}
			}
			if (this.anIntArray356 != null && !Static115.method2121(this.anInt4310, this.anInt4253)) {
				if (this.aClass89_8 != null && this.aClass89_8.anInterface12_1 == null) {
					this.aBoolean298 = true;
				} else {
					if (!this.aBoolean299) {
						this.method3559();
					}
					this.anIntArray356 = null;
				}
			}
			if (this.anIntArray358 != null && !Static39.method715(this.anInt4253, this.anInt4310)) {
				if (this.aClass89_8 != null && this.aClass89_8.anInterface12_1 == null) {
					this.aBoolean298 = true;
				} else {
					if (!this.aBoolean299) {
						this.method3559();
					}
					this.anIntArray358 = null;
				}
			}
		}
		if (this.aShortArray60 != null && this.anIntArray360 == null && this.anIntArray356 == null && this.anIntArray358 == null) {
			this.anIntArray357 = null;
			this.aShortArray60 = null;
		}
		if (this.aByteArray66 != null && !Static55.method5710(this.anInt4310, this.anInt4253)) {
			if (this.aClass89_10 == null) {
				if (this.aClass89_9 != null && this.aClass89_9.anInterface12_1 == null) {
					this.aBoolean298 = true;
				} else {
					this.aShortArray67 = this.aShortArray69 = this.aShortArray64 = null;
					this.aByteArray66 = null;
				}
			} else if (this.aClass89_10.anInterface12_1 == null) {
				this.aBoolean298 = true;
			} else {
				this.aByteArray66 = null;
				this.aShortArray67 = this.aShortArray69 = this.aShortArray64 = null;
			}
		}
		if (this.aShortArray63 != null && !Static306.method4371(this.anInt4310, this.anInt4253)) {
			if (this.aClass89_9 != null && this.aClass89_9.anInterface12_1 == null) {
				this.aBoolean298 = true;
			} else {
				this.aShortArray63 = null;
			}
		}
		if (this.aByteArray65 != null && !Static263.method3888(this.anInt4253, this.anInt4310)) {
			if (this.aClass89_9 != null && this.aClass89_9.anInterface12_1 == null) {
				this.aBoolean298 = true;
			} else {
				this.aByteArray65 = null;
			}
		}
		if (this.aFloatArray14 != null && !Static171.method2755(this.anInt4310, this.anInt4253)) {
			if (this.aClass89_7 != null && this.aClass89_7.anInterface12_1 == null) {
				this.aBoolean298 = true;
			} else {
				this.aFloatArray14 = this.aFloatArray13 = null;
			}
		}
		if (this.aShortArray68 != null && !Static414.method5547(this.anInt4253, this.anInt4310)) {
			if (this.aClass89_9 != null && this.aClass89_9.anInterface12_1 == null) {
				this.aBoolean298 = true;
			} else {
				this.aShortArray68 = null;
			}
		}
		if (this.aShortArray66 != null && !Static362.method4968(this.anInt4253, this.anInt4310)) {
			if ((this.aClass267_1 == null || this.aClass267_1.anInterface9_5 != null) && (this.aClass89_9 == null || this.aClass89_9.anInterface12_1 != null)) {
				this.aShortArray66 = this.aShortArray59 = this.aShortArray62 = null;
			} else {
				this.aBoolean298 = true;
			}
		}
		if (this.anIntArrayArray46 != null && !Static147.method2420(this.anInt4253, this.anInt4310)) {
			this.aShortArray65 = null;
			this.anIntArrayArray46 = null;
		}
		if (this.anIntArrayArray45 != null && !Static310.method4413(this.anInt4253, this.anInt4310)) {
			this.aShortArray61 = null;
			this.anIntArrayArray45 = null;
		}
		if (this.anIntArrayArray44 != null && !Static100.method1788(this.anInt4253, this.anInt4310)) {
			this.anIntArrayArray44 = null;
		}
		if (this.anIntArray359 != null && (this.anInt4253 & 0x800) == 0 && (this.anInt4253 & 0x40000) == 0) {
			this.anIntArray359 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	@Override
	public void method3532(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class105_Sub2 local8 = (Class105_Sub2) arg0;
		if (this.anInt4258 == 0 || local8.anInt4258 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt4312;
		@Pc(27) int[] local27 = local8.anIntArray360;
		@Pc(30) int[] local30 = local8.anIntArray356;
		@Pc(33) int[] local33 = local8.anIntArray358;
		@Pc(36) short[] local36 = local8.aShortArray67;
		@Pc(39) short[] local39 = local8.aShortArray69;
		@Pc(42) short[] local42 = local8.aShortArray64;
		@Pc(45) byte[] local45 = local8.aByteArray66;
		@Pc(60) short[] local60;
		@Pc(56) short[] local56;
		@Pc(64) short[] local64;
		@Pc(52) byte[] local52;
		if (this.aClass117_1 == null) {
			local60 = null;
			local64 = null;
			local52 = null;
			local56 = null;
		} else {
			local52 = this.aClass117_1.aByteArray57;
			local56 = this.aClass117_1.aShortArray47;
			local60 = this.aClass117_1.aShortArray48;
			local64 = this.aClass117_1.aShortArray49;
		}
		@Pc(81) short[] local81;
		@Pc(93) short[] local93;
		@Pc(85) short[] local85;
		@Pc(89) byte[] local89;
		if (local8.aClass117_1 == null) {
			local89 = null;
			local93 = null;
			local85 = null;
			local81 = null;
		} else {
			local81 = local8.aClass117_1.aShortArray48;
			local85 = local8.aClass117_1.aShortArray49;
			local89 = local8.aClass117_1.aByteArray57;
			local93 = local8.aClass117_1.aShortArray47;
		}
		@Pc(106) int[] local106 = local8.anIntArray357;
		@Pc(109) short[] local109 = local8.aShortArray60;
		if (!local8.aBoolean299) {
			local8.method3559();
		}
		@Pc(118) short local118 = local8.aShort63;
		@Pc(121) short local121 = local8.aShort67;
		@Pc(124) short local124 = local8.aShort64;
		@Pc(127) short local127 = local8.aShort68;
		@Pc(130) short local130 = local8.aShort70;
		@Pc(133) short local133 = local8.aShort71;
		for (@Pc(135) int local135 = 0; local135 < this.anInt4312; local135++) {
			@Pc(145) int local145 = this.anIntArray356[local135] - arg2;
			if (local145 >= local118 && local121 >= local145) {
				@Pc(165) int local165 = this.anIntArray360[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(181) int local181 = this.anIntArray358[local135] - arg3;
					if (local181 >= local130 && local133 >= local181) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray357[local135];
						@Pc(211) int local211 = this.anIntArray357[local135 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray60[local213] - 1;
							if (local199 == -1 || this.aByteArray66[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(242) int local242 = 0; local242 < local24; local242++) {
								if (local27[local242] == local165 && local33[local242] == local181 && local30[local242] == local145) {
									local204 = local106[local242];
									local211 = local106[local242 + 1];
									@Pc(283) int local283 = -1;
									for (@Pc(285) int local285 = local204; local285 < local211; local285++) {
										local283 = local109[local285] - 1;
										if (local283 == -1 || local45[local283] != 0) {
											break;
										}
									}
									if (local283 != -1) {
										if (local60 == null) {
											this.aClass117_1 = new Class117();
											local60 = this.aClass117_1.aShortArray48 = Static292.method4247(this.aShortArray67);
											local56 = this.aClass117_1.aShortArray47 = Static292.method4247(this.aShortArray69);
											local64 = this.aClass117_1.aShortArray49 = Static292.method4247(this.aShortArray64);
											local52 = this.aClass117_1.aByteArray57 = Static309.method4393(this.aByteArray66);
										}
										if (local81 == null) {
											@Pc(365) Class117 local365 = local8.aClass117_1 = new Class117();
											local81 = local365.aShortArray48 = Static292.method4247(local36);
											local93 = local365.aShortArray47 = Static292.method4247(local39);
											local85 = local365.aShortArray49 = Static292.method4247(local42);
											local89 = local365.aByteArray57 = Static309.method4393(local45);
										}
										@Pc(398) short local398 = this.aShortArray67[local199];
										@Pc(403) short local403 = this.aShortArray69[local199];
										@Pc(408) short local408 = this.aShortArray64[local199];
										local211 = local106[local242 + 1];
										@Pc(419) byte local419 = this.aByteArray66[local199];
										local204 = local106[local242];
										@Pc(433) int local433;
										for (@Pc(425) int local425 = local204; local425 < local211; local425++) {
											local433 = local109[local425] - 1;
											if (local433 == -1) {
												break;
											}
											if (local89[local433] != 0) {
												local81[local433] += local398;
												local93[local433] += local403;
												local85[local433] += local408;
												local89[local433] += local419;
											}
										}
										local211 = this.anIntArray357[local135 + 1];
										local398 = local36[local283];
										local204 = this.anIntArray357[local135];
										local403 = local39[local283];
										local408 = local42[local283];
										local419 = local45[local283];
										for (local433 = local204; local433 < local211; local433++) {
											@Pc(520) int local520 = this.aShortArray60[local433] - 1;
											if (local520 == -1) {
												break;
											}
											if (local52[local520] != 0) {
												local60[local520] += local398;
												local56[local520] += local403;
												local64[local520] += local408;
												local52[local520] += local419;
											}
										}
										if (this.aClass89_10 == null && this.aClass89_9 != null) {
											this.aClass89_9.anInterface12_1 = null;
										}
										if (this.aClass89_10 != null) {
											this.aClass89_10.anInterface12_1 = null;
										}
										if (local8.aClass89_10 == null && local8.aClass89_9 != null) {
											local8.aClass89_9.anInterface12_1 = null;
										}
										if (local8.aClass89_10 != null) {
											local8.aClass89_10.anInterface12_1 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "BA", descriptor = "(SS)V")
	@Override
	public void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4258; local7++) {
			if (arg0 == this.aShortArray63[local7]) {
				this.aShortArray63[local7] = arg1;
			}
		}
		if (this.aClass52Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt4264; local34++) {
				@Pc(41) Class52 local41 = this.aClass52Array1[local34];
				@Pc(46) Class187 local46 = this.aClass187Array1[local34];
				local46.anInt5178 = Static337.anIntArray223[this.aShortArray63[local41.anInt1679] & 0xFFFF] & 0xFFFFFF | local46.anInt5178 & 0xFF000000;
			}
		}
		if (this.aClass89_9 != null) {
			this.aClass89_9.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "JA", descriptor = "(III)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4312; local7++) {
			if (arg0 != 0) {
				this.anIntArray360[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray356[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray358[local7] += arg2;
			}
		}
		if (this.aClass89_8 != null) {
			this.aClass89_8.anInterface12_1 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BZ)V")
	private void method3562(@OriginalArg(1) boolean arg0) {
		if (this.anInt4280 * 6 > this.aClass39_Sub2_25.aClass1_Sub5_Sub2_1.aByteArray89.length) {
			this.aClass39_Sub2_25.aClass1_Sub5_Sub2_1 = new Class1_Sub5_Sub2(this.anInt4280 * 6 + 600);
		} else {
			this.aClass39_Sub2_25.aClass1_Sub5_Sub2_1.anInt6475 = 0;
		}
		@Pc(38) Class1_Sub5_Sub2 local38 = this.aClass39_Sub2_25.aClass1_Sub5_Sub2_1;
		@Pc(44) int local44;
		if (this.aClass39_Sub2_25.aBoolean250) {
			for (local44 = 0; local44 < this.anInt4280; local44++) {
				local38.method5393(this.aShortArray66[local44]);
				local38.method5393(this.aShortArray59[local44]);
				local38.method5393(this.aShortArray62[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt4280; local44++) {
				local38.method5355(this.aShortArray66[local44]);
				local38.method5355(this.aShortArray59[local44]);
				local38.method5355(this.aShortArray62[local44]);
			}
		}
		if (local38.anInt6475 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface9_3 == null) {
				this.anInterface9_3 = this.aClass39_Sub2_25.method3235(local38.aByteArray89, true, local38.anInt6475);
			} else {
				this.anInterface9_3.method4692(local38.anInt6475, local38.aByteArray89);
			}
			this.aClass267_1.anInterface9_5 = this.anInterface9_3;
		} else {
			this.aClass267_1.anInterface9_5 = this.aClass39_Sub2_25.method3235(local38.aByteArray89, false, local38.anInt6475);
		}
		if (!arg0) {
			this.aBoolean298 = true;
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "()[Lclient!uj;")
	@Override
	public Class244[] method3535() {
		return this.aClass244Array3;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!aa;B)V")
	private void method3563(@OriginalArg(0) Class1_Sub2_Sub1_Sub1 arg0) {
		if (this.anInt4292 > this.aClass39_Sub2_25.anIntArray313.length) {
			this.aClass39_Sub2_25.anIntArray313 = new int[this.anInt4292];
			this.aClass39_Sub2_25.anIntArray315 = new int[this.anInt4292];
		}
		@Pc(32) int[] local32 = this.aClass39_Sub2_25.anIntArray313;
		@Pc(36) int[] local36 = this.aClass39_Sub2_25.anIntArray315;
		@Pc(71) int local71;
		@Pc(110) int local110;
		@Pc(119) int local119;
		for (@Pc(38) int local38 = 0; local38 < this.anInt4312; local38++) {
			local71 = (this.anIntArray360[local38] - (this.aClass39_Sub2_25.anInt3819 * this.anIntArray356[local38] >> 8) >> this.aClass39_Sub2_25.anInt3777) - arg0.anInt57;
			@Pc(96) int local96 = (this.anIntArray358[local38] - (this.aClass39_Sub2_25.anInt3808 * this.anIntArray356[local38] >> 8) >> this.aClass39_Sub2_25.anInt3777) - arg0.anInt53;
			@Pc(101) int local101 = this.anIntArray357[local38];
			@Pc(108) int local108 = this.anIntArray357[local38 + 1];
			for (local110 = local101; local110 < local108; local110++) {
				local119 = this.aShortArray60[local110] - 1;
				if (local119 == -1) {
					break;
				}
				local32[local119] = local71;
				local36[local119] = local96;
			}
		}
		for (local71 = 0; local71 < this.anInt4280; local71++) {
			if (this.aByteArray65 == null || this.aByteArray65[local71] <= 128) {
				@Pc(162) short local162 = this.aShortArray66[local71];
				@Pc(167) short local167 = this.aShortArray59[local71];
				@Pc(172) short local172 = this.aShortArray62[local71];
				local110 = local32[local162];
				local119 = local32[local167];
				@Pc(184) int local184 = local32[local172];
				@Pc(188) int local188 = local36[local162];
				@Pc(192) int local192 = local36[local167];
				@Pc(196) int local196 = local36[local172];
				if (-((local192 - local188) * (-local119 + local184)) + (local110 - local119) * (local192 - local196) > 0) {
					arg0.method59(local188, local192, local196, local184, local119, local110);
				}
			}
		}
	}
}
