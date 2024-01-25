import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!og", name = "h", descriptor = "I")
	private int anInt6406;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Lclient!kea;")
	private final Class14_Sub2 aClass14_Sub2_11;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "Lclient!de;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	private int anInt6410;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "Lclient!de;")
	private Class65 aClass65_2;

	@OriginalMember(owner = "client!og", name = "z", descriptor = "Z")
	private boolean aBoolean446;

	@OriginalMember(owner = "client!og", name = "C", descriptor = "I")
	private int anInt6419;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
	private int anInt6429;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "I")
	private int anInt6430;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	private int anInt6431;

	@OriginalMember(owner = "client!og", name = "bb", descriptor = "Lclient!de;")
	private Class65 aClass65_3;

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "Lclient!rj;")
	private Class288 aClass288_1;

	@OriginalMember(owner = "client!og", name = "ob", descriptor = "I")
	private int anInt6443;

	@OriginalMember(owner = "client!og", name = "rb", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!og", name = "wb", descriptor = "Lclient!de;")
	private Class65 aClass65_4;

	@OriginalMember(owner = "client!og", name = "Ab", descriptor = "I")
	private int anInt6447;

	@OriginalMember(owner = "client!og", name = "Nb", descriptor = "Lclient!on;")
	private Class242 aClass242_1;

	@OriginalMember(owner = "client!og", name = "bc", descriptor = "I")
	private int anInt6466;

	@OriginalMember(owner = "client!og", name = "ec", descriptor = "I")
	private int anInt6467;

	@OriginalMember(owner = "client!og", name = "sc", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!og", name = "Qb", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	private int anInt6414;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "I")
	private int anInt6424;

	@OriginalMember(owner = "client!og", name = "s", descriptor = "I")
	private int anInt6413;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "[I")
	private int[] anIntArray479;

	@OriginalMember(owner = "client!og", name = "zb", descriptor = "[I")
	private int[] anIntArray482;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!og", name = "U", descriptor = "I")
	private int anInt6432;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "[Lclient!fd;")
	private Class90[] aClass90Array6;

	@OriginalMember(owner = "client!og", name = "Xb", descriptor = "[Lclient!et;")
	private Class85[] aClass85Array6;

	@OriginalMember(owner = "client!og", name = "jb", descriptor = "I")
	private int anInt6440;

	@OriginalMember(owner = "client!og", name = "kb", descriptor = "[Lclient!lg;")
	private Class192[] aClass192Array1;

	@OriginalMember(owner = "client!og", name = "qb", descriptor = "[Lclient!naa;")
	private Class214[] aClass214Array1;

	@OriginalMember(owner = "client!og", name = "Yb", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!og", name = "rc", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!og", name = "vb", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!og", name = "S", descriptor = "[B")
	private byte[] aByteArray80;

	@OriginalMember(owner = "client!og", name = "V", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!og", name = "cc", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!og", name = "Hb", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!og", name = "oc", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!og", name = "ib", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!og", name = "ub", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!og", name = "dc", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!og", name = "Pb", descriptor = "[F")
	private float[] aFloatArray53;

	@OriginalMember(owner = "client!og", name = "tb", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!og", name = "lb", descriptor = "[F")
	private float[] lb;

	@OriginalMember(owner = "client!og", name = "Lb", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!og", name = "W", descriptor = "[I")
	private int[] anIntArray480;

	@OriginalMember(owner = "client!og", name = "ab", descriptor = "[I")
	private int[] anIntArray481;

	@OriginalMember(owner = "client!og", name = "Ib", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!og", name = "fc", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!og", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!og", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!kea;Lclient!nj;IIII)V")
	public Class20_Sub3(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_15;
		@Pc(15) int[] local15 = new int[arg1.anInt6188];
		this.anIntArray484 = new int[arg1.anInt6186 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt6188; local24++) {
			if ((arg1.aByteArray75 == null || arg1.aByteArray75[local24] != 2) && (arg1.aShortArray72 == null || arg1.aShortArray72[local24] == -1 || !local11.method4234(arg1.aShortArray72[local24] & 0xFFFF).aBoolean592)) {
				local15[this.anInt6414++] = local24;
				this.anIntArray484[arg1.aShortArray68[local24]]++;
				this.anIntArray484[arg1.aShortArray75[local24]]++;
				this.anIntArray484[arg1.aShortArray77[local24]]++;
			}
		}
		this.anInt6424 = this.anInt6414;
		@Pc(114) long[] local114 = new long[this.anInt6414];
		@Pc(123) boolean local123 = (this.anInt6410 & 0x100) != 0;
		@Pc(135) int local135;
		@Pc(146) int local146;
		@Pc(275) int local275;
		label498: for (@Pc(125) int local125 = 0; local125 < this.anInt6414; local125++) {
			@Pc(131) int local131 = local15[local125];
			@Pc(133) Class313 local133 = null;
			local135 = 0;
			@Pc(137) byte local137 = 0;
			@Pc(139) byte local139 = 0;
			@Pc(141) byte local141 = 0;
			if (arg1.aClass265Array1 != null) {
				for (local146 = 0; local146 < arg1.aClass265Array1.length; local146++) {
					@Pc(153) Class265 local153 = arg1.aClass265Array1[local146];
					if (local131 == local153.anInt7251) {
						@Pc(162) Class97 local162 = Static154.method2911(local153.anInt7256);
						if (local162.aBoolean229) {
							local114[local125] = Long.MAX_VALUE;
							this.anInt6424--;
							continue label498;
						}
					}
				}
			}
			@Pc(189) short local189 = -1;
			if (arg1.aShortArray72 != null) {
				local189 = arg1.aShortArray72[local131];
				if (local189 != -1) {
					local133 = local11.method4234(local189 & 0xFFFF);
					local139 = local133.aByte98;
					local141 = local133.aByte99;
				}
			}
			@Pc(231) boolean local231 = arg1.aByteArray76 != null && arg1.aByteArray76[local131] != 0 || local133 != null && !local133.aBoolean590;
			if ((local123 || local231) && arg1.aByteArray70 != null) {
				local135 += arg1.aByteArray70[local131] << 17;
			}
			if (local231) {
				local135 += 65536;
			}
			local135 += (local139 & 0xFF) << 8;
			local135 += local141 & 0xFF;
			local275 = local137 + ((local189 & 0xFFFF) << 16);
			@Pc(281) int local281 = local275 + (local125 & 0xFFFF);
			local114[local125] = (long) local281 + ((long) local135 << 32);
		}
		Static400.method5854(local15, local114);
		this.anInt6413 = arg1.anInt6186;
		this.anIntArray479 = arg1.anIntArray454;
		this.anIntArray482 = arg1.anIntArray455;
		this.aShortArray86 = arg1.aShortArray70;
		this.anIntArray478 = arg1.anIntArray456;
		this.anInt6432 = arg1.anInt6195;
		@Pc(328) Class358[] local328 = new Class358[this.anInt6413];
		this.aClass90Array6 = arg1.aClass90Array5;
		this.aClass85Array6 = arg1.aClass85Array5;
		@Pc(356) int local356;
		@Pc(370) int local370;
		if (arg1.aClass265Array1 != null) {
			this.anInt6440 = arg1.aClass265Array1.length;
			this.aClass192Array1 = new Class192[this.anInt6440];
			this.aClass214Array1 = new Class214[this.anInt6440];
			for (local356 = 0; local356 < this.anInt6440; local356++) {
				@Pc(363) Class265 local363 = arg1.aClass265Array1[local356];
				@Pc(368) Class97 local368 = Static154.method2911(local363.anInt7256);
				local370 = -1;
				for (@Pc(372) int local372 = 0; local372 < this.anInt6414; local372++) {
					if (local15[local372] == local363.anInt7251) {
						local370 = local372;
						break;
					}
				}
				if (local370 == -1) {
					throw new RuntimeException();
				}
				local146 = Static171.anIntArray212[arg1.aShortArray71[local363.anInt7251] & 0xFFFF] & 0xFFFFFF;
				local146 |= 255 - (arg1.aByteArray76 == null ? 0 : arg1.aByteArray76[local363.anInt7251]) << 24;
				this.aClass192Array1[local356] = new Class192(local370, arg1.aShortArray68[local363.anInt7251], arg1.aShortArray75[local363.anInt7251], arg1.aShortArray77[local363.anInt7251], local368.anInt3123, local368.anInt3116, local368.anInt3120, local368.anInt3122, local368.anInt3119, local368.aBoolean229, local368.aBoolean230, local363.anInt7249);
				this.aClass214Array1[local356] = new Class214(local146);
			}
		}
		local356 = this.anInt6414 * 3;
		this.aShortArray94 = new short[this.anInt6414];
		this.aShortArray98 = new short[local356];
		this.aByteArray81 = new byte[local356];
		this.aByteArray80 = new byte[this.anInt6414];
		this.aShortArray90 = new short[this.anInt6414];
		this.aShortArray88 = new short[local356];
		this.aShortArray95 = new short[local356];
		this.aShort86 = (short) arg4;
		this.aShortArray97 = new short[local356];
		this.aShortArray87 = new short[this.anInt6414];
		this.aShort85 = (short) arg3;
		this.aShortArray92 = new short[this.anInt6414];
		Static70.aLongArray10 = new long[local356];
		this.aShortArray96 = new short[this.anInt6414];
		this.aFloatArray53 = new float[local356];
		this.aShortArray91 = new short[local356];
		this.aShortArray89 = new short[local356];
		this.lb = new float[local356];
		if (arg1.aShortArray74 != null) {
			this.aShortArray93 = new short[this.anInt6414];
		}
		local135 = 0;
		for (local275 = 0; local275 < arg1.anInt6186; local275++) {
			local370 = this.anIntArray484[local275];
			this.anIntArray484[local275] = local135;
			local135 += local370;
			local328[local275] = new Class358();
		}
		this.anIntArray484[arg1.anInt6186] = local135;
		@Pc(624) int[] local624 = null;
		@Pc(626) int[] local626 = null;
		@Pc(628) int[] local628 = null;
		@Pc(630) float[][] local630 = null;
		@Pc(648) int[] local648;
		@Pc(656) int local656;
		@Pc(700) int local700;
		@Pc(706) int local706;
		@Pc(720) int local720;
		@Pc(722) int local722;
		@Pc(755) int local755;
		@Pc(760) int local760;
		@Pc(910) float local910;
		@Pc(902) float local902;
		@Pc(918) float local918;
		if (arg1.aByteArray74 != null) {
			@Pc(636) int local636 = arg1.anInt6183;
			@Pc(639) int[] local639 = new int[local636];
			@Pc(642) int[] local642 = new int[local636];
			@Pc(645) int[] local645 = new int[local636];
			local648 = new int[local636];
			@Pc(651) int[] local651 = new int[local636];
			@Pc(654) int[] local654 = new int[local636];
			for (local656 = 0; local656 < local636; local656++) {
				local639[local656] = Integer.MAX_VALUE;
				local642[local656] = -2147483647;
				local645[local656] = Integer.MAX_VALUE;
				local648[local656] = -2147483647;
				local651[local656] = Integer.MAX_VALUE;
				local654[local656] = -2147483647;
			}
			local628 = new int[local636];
			local626 = new int[local636];
			local624 = new int[local636];
			local630 = new float[local636][];
			for (local700 = 0; local700 < this.anInt6414; local700++) {
				local706 = local15[local700];
				if (arg1.aByteArray74[local706] != -1) {
					local720 = arg1.aByteArray74[local706] & 0xFF;
					for (local722 = 0; local722 < 3; local722++) {
						@Pc(731) short local731;
						if (local722 == 0) {
							local731 = arg1.aShortArray68[local706];
						} else if (local722 == 1) {
							local731 = arg1.aShortArray75[local706];
						} else {
							local731 = arg1.aShortArray77[local706];
						}
						local755 = arg1.anIntArray454[local731];
						local760 = arg1.anIntArray456[local731];
						@Pc(765) int local765 = arg1.anIntArray455[local731];
						if (local755 < local639[local720]) {
							local639[local720] = local755;
						}
						if (local755 > local642[local720]) {
							local642[local720] = local755;
						}
						if (local760 < local645[local720]) {
							local645[local720] = local760;
						}
						if (local760 > local648[local720]) {
							local648[local720] = local760;
						}
						if (local651[local720] > local765) {
							local651[local720] = local765;
						}
						if (local654[local720] < local765) {
							local654[local720] = local765;
						}
					}
				}
			}
			for (local706 = 0; local706 < local636; local706++) {
				@Pc(845) byte local845 = arg1.aByteArray71[local706];
				if (local845 > 0) {
					local624[local706] = (local642[local706] + local639[local706]) / 2;
					local626[local706] = (local648[local706] + local645[local706]) / 2;
					local628[local706] = (local654[local706] + local651[local706]) / 2;
					if (local845 == 1) {
						local760 = arg1.anIntArray449[local706];
						if (local760 == 0) {
							local910 = 1.0F;
							local902 = 1.0F;
						} else if (local760 <= 0) {
							local902 = 1.0F;
							local910 = (float) -local760 / 1024.0F;
						} else {
							local910 = 1.0F;
							local902 = (float) local760 / 1024.0F;
						}
						local918 = 64.0F / (float) arg1.anIntArray458[local706];
					} else if (local845 == 2) {
						local902 = 64.0F / (float) arg1.anIntArray459[local706];
						local910 = 64.0F / (float) arg1.anIntArray449[local706];
						local918 = 64.0F / (float) arg1.anIntArray458[local706];
					} else {
						local918 = (float) arg1.anIntArray458[local706] / 1024.0F;
						local902 = (float) arg1.anIntArray459[local706] / 1024.0F;
						local910 = (float) arg1.anIntArray449[local706] / 1024.0F;
					}
					local630[local706] = Static162.method2961(arg1.aShortArray76[local706], local902, local910, arg1.aShortArray73[local706], arg1.aByteArray73[local706] & 0xFF, local918, arg1.aShortArray69[local706]);
				}
			}
		}
		@Pc(1023) Class321[] local1023 = new Class321[arg1.anInt6188];
		@Pc(1042) short local1042;
		@Pc(1053) int local1053;
		@Pc(1064) int local1064;
		for (@Pc(1025) int local1025 = 0; local1025 < arg1.anInt6188; local1025++) {
			@Pc(1032) short local1032 = arg1.aShortArray68[local1025];
			@Pc(1037) short local1037 = arg1.aShortArray75[local1025];
			local1042 = arg1.aShortArray77[local1025];
			local1053 = this.anIntArray479[local1037] - this.anIntArray479[local1032];
			local1064 = this.anIntArray478[local1037] - this.anIntArray478[local1032];
			local656 = this.anIntArray482[local1037] - this.anIntArray482[local1032];
			local700 = this.anIntArray479[local1042] - this.anIntArray479[local1032];
			local706 = this.anIntArray478[local1042] - this.anIntArray478[local1032];
			local720 = this.anIntArray482[local1042] - this.anIntArray482[local1032];
			local722 = local1064 * local720 - local706 * local656;
			@Pc(1124) int local1124 = local700 * local656 - local720 * local1053;
			local755 = local1053 * local706 - local1064 * local700;
			while (local722 > 8192 || local1124 > 8192 || local755 > 8192 || local722 < -8192 || local1124 < -8192 || local755 < -8192) {
				local755 >>= 0x1;
				local1124 >>= 0x1;
				local722 >>= 0x1;
			}
			local760 = (int) Math.sqrt((double) (local1124 * local1124 + local722 * local722 + local755 * local755));
			if (local760 <= 0) {
				local760 = 1;
			}
			local755 = local755 * 256 / local760;
			local722 = local722 * 256 / local760;
			local1124 = local1124 * 256 / local760;
			@Pc(1217) byte local1217 = arg1.aByteArray75 == null ? 0 : arg1.aByteArray75[local1025];
			if (local1217 == 0) {
				@Pc(1223) Class358 local1223 = local328[local1032];
				local1223.anInt9594++;
				local1223.anInt9595 += local722;
				local1223.anInt9593 += local755;
				local1223.anInt9597 += local1124;
				@Pc(1251) Class358 local1251 = local328[local1037];
				local1251.anInt9594++;
				local1251.anInt9593 += local755;
				local1251.anInt9595 += local722;
				local1251.anInt9597 += local1124;
				@Pc(1279) Class358 local1279 = local328[local1042];
				local1279.anInt9597 += local1124;
				local1279.anInt9594++;
				local1279.anInt9593 += local755;
				local1279.anInt9595 += local722;
			} else if (local1217 == 1) {
				@Pc(1316) Class321 local1316 = local1023[local1025] = new Class321();
				local1316.anInt8679 = local1124;
				local1316.anInt8678 = local722;
				local1316.anInt8683 = local755;
			}
		}
		@Pc(1342) int local1342;
		for (@Pc(1336) int local1336 = 0; local1336 < this.anInt6414; local1336++) {
			local1342 = local15[local1336];
			@Pc(1349) int local1349 = arg1.aShortArray71[local1342] & 0xFFFF;
			@Pc(1357) short local1357;
			if (arg1.aShortArray72 == null) {
				local1357 = -1;
			} else {
				local1357 = arg1.aShortArray72[local1342];
			}
			if (arg1.aByteArray74 == null) {
				local1064 = -1;
			} else {
				local1064 = arg1.aByteArray74[local1342];
			}
			if (arg1.aByteArray76 == null) {
				local656 = 0;
			} else {
				local656 = arg1.aByteArray76[local1342] & 0xFF;
			}
			@Pc(1389) float local1389 = 0.0F;
			@Pc(1391) float local1391 = 0.0F;
			@Pc(1393) float local1393 = 0.0F;
			local910 = 0.0F;
			local918 = 0.0F;
			local902 = 0.0F;
			@Pc(1401) byte local1401 = 0;
			@Pc(1403) byte local1403 = 0;
			@Pc(1405) int local1405 = 0;
			@Pc(1440) byte local1440;
			@Pc(1460) short local1460;
			@Pc(2200) short local2200;
			@Pc(2205) short local2205;
			if (local1357 != -1) {
				if (local1064 == -1) {
					local1389 = 0.0F;
					local918 = 0.0F;
					local1391 = 1.0F;
					local1401 = 1;
					local1393 = 1.0F;
					local902 = 0.0F;
					local1403 = 2;
					local910 = 1.0F;
				} else {
					local1064 &= 0xFF;
					local1440 = arg1.aByteArray71[local1064];
					@Pc(1450) short local1450;
					@Pc(1455) short local1455;
					@Pc(1489) float local1489;
					@Pc(1502) float local1502;
					@Pc(1581) float local1581;
					@Pc(2006) float local2006;
					@Pc(2014) float local2014;
					@Pc(2022) float local2022;
					@Pc(2045) float local2045;
					@Pc(2068) float local2068;
					@Pc(2091) float local2091;
					if (local1440 == 0) {
						local1450 = arg1.aShortArray68[local1342];
						local1455 = arg1.aShortArray75[local1342];
						local1460 = arg1.aShortArray77[local1342];
						local2200 = arg1.aShortArray76[local1064];
						local2205 = arg1.aShortArray73[local1064];
						@Pc(2210) short local2210 = arg1.aShortArray69[local1064];
						@Pc(2216) float local2216 = (float) arg1.anIntArray454[local2200];
						@Pc(2222) float local2222 = (float) arg1.anIntArray456[local2200];
						local1489 = arg1.anIntArray455[local2200];
						local1502 = (float) arg1.anIntArray454[local2205] - local2216;
						local1581 = (float) arg1.anIntArray456[local2205] - local2222;
						@Pc(2253) float local2253 = (float) arg1.anIntArray455[local2205] - local1489;
						@Pc(2262) float local2262 = (float) arg1.anIntArray454[local2210] - local2216;
						@Pc(2271) float local2271 = (float) arg1.anIntArray456[local2210] - local2222;
						@Pc(2279) float local2279 = (float) arg1.anIntArray455[local2210] - local1489;
						@Pc(2287) float local2287 = (float) arg1.anIntArray454[local1450] - local2216;
						@Pc(2296) float local2296 = (float) arg1.anIntArray456[local1450] - local2222;
						@Pc(2305) float local2305 = (float) arg1.anIntArray455[local1450] - local1489;
						@Pc(2313) float local2313 = (float) arg1.anIntArray454[local1455] - local2216;
						@Pc(2321) float local2321 = (float) arg1.anIntArray456[local1455] - local2222;
						local2006 = (float) arg1.anIntArray455[local1455] - local1489;
						local2014 = (float) arg1.anIntArray454[local1460] - local2216;
						local2022 = (float) arg1.anIntArray456[local1460] - local2222;
						local2045 = (float) arg1.anIntArray455[local1460] - local1489;
						local2068 = local1581 * local2279 - local2253 * local2271;
						local2091 = local2253 * local2262 - local1502 * local2279;
						@Pc(2379) float local2379 = local2271 * local1502 - local2262 * local1581;
						@Pc(2388) float local2388 = local2271 * local2379 - local2091 * local2279;
						@Pc(2396) float local2396 = local2279 * local2068 - local2379 * local2262;
						@Pc(2405) float local2405 = local2091 * local2262 - local2068 * local2271;
						@Pc(2419) float local2419 = 1.0F / (local1502 * local2388 + local1581 * local2396 + local2405 * local2253);
						local1393 = (local2006 * local2405 + local2388 * local2313 + local2396 * local2321) * local2419;
						local1389 = (local2405 * local2305 + local2296 * local2396 + local2388 * local2287) * local2419;
						local918 = local2419 * (local2405 * local2045 + local2388 * local2014 + local2022 * local2396);
						@Pc(2470) float local2470 = local2068 * local2253 - local2379 * local1502;
						@Pc(2479) float local2479 = local1502 * local2091 - local1581 * local2068;
						@Pc(2487) float local2487 = local1581 * local2379 - local2091 * local2253;
						@Pc(2501) float local2501 = 1.0F / (local2479 * local2279 + local2271 * local2470 + local2262 * local2487);
						local910 = local2501 * (local2006 * local2479 + local2313 * local2487 + local2321 * local2470);
						local1391 = (local2470 * local2296 + local2287 * local2487 + local2479 * local2305) * local2501;
						local902 = (local2022 * local2470 + local2014 * local2487 + local2479 * local2045) * local2501;
					} else {
						local1450 = arg1.aShortArray68[local1342];
						local1455 = arg1.aShortArray75[local1342];
						local1460 = arg1.aShortArray77[local1342];
						@Pc(1464) int local1464 = local624[local1064];
						@Pc(1468) int local1468 = local626[local1064];
						@Pc(1472) int local1472 = local628[local1064];
						@Pc(1476) float[] local1476 = local630[local1064];
						@Pc(1481) byte local1481 = arg1.aByteArray72[local1064];
						local1489 = (float) arg1.anIntArray451[local1064] / 256.0F;
						if (local1440 == 1) {
							local1502 = (float) arg1.anIntArray459[local1064] / 1024.0F;
							Static593.method7823(arg1.anIntArray456[local1450], arg1.anIntArray454[local1450], local1468, local1476, local1472, arg1.anIntArray455[local1450], local1481, local1502, local1464, local1489);
							local1389 = Static22.aFloat111;
							local1391 = Static280.aFloat132;
							Static593.method7823(arg1.anIntArray456[local1455], arg1.anIntArray454[local1455], local1468, local1476, local1472, arg1.anIntArray455[local1455], local1481, local1502, local1464, local1489);
							local1393 = Static22.aFloat111;
							local910 = Static280.aFloat132;
							Static593.method7823(arg1.anIntArray456[local1460], arg1.anIntArray454[local1460], local1468, local1476, local1472, arg1.anIntArray455[local1460], local1481, local1502, local1464, local1489);
							local918 = Static22.aFloat111;
							local902 = Static280.aFloat132;
							local1581 = local1502 / 2.0F;
							if ((local1481 & 0x1) == 0) {
								if (local1393 - local1389 > local1581) {
									local1401 = 1;
									local1393 -= local1502;
								} else if (local1389 - local1393 > local1581) {
									local1401 = 2;
									local1393 += local1502;
								}
								if (local918 - local1389 > local1581) {
									local918 -= local1502;
									local1403 = 1;
								} else if (local1389 - local918 > local1581) {
									local1403 = 2;
									local918 += local1502;
								}
							} else {
								if (local902 - local1391 > local1581) {
									local902 -= local1502;
									local1403 = 1;
								} else if (local1581 < local1391 - local902) {
									local902 += local1502;
									local1403 = 2;
								}
								if (local910 - local1391 > local1581) {
									local910 -= local1502;
									local1401 = 1;
								} else if (local1391 - local910 > local1581) {
									local1401 = 2;
									local910 += local1502;
								}
							}
						} else if (local1440 == 2) {
							local1502 = (float) arg1.anIntArray450[local1064] / 256.0F;
							local1581 = (float) arg1.anIntArray453[local1064] / 256.0F;
							@Pc(1919) int local1919 = arg1.anIntArray454[local1455] - arg1.anIntArray454[local1450];
							@Pc(1930) int local1930 = arg1.anIntArray456[local1455] - arg1.anIntArray456[local1450];
							@Pc(1941) int local1941 = arg1.anIntArray455[local1455] - arg1.anIntArray455[local1450];
							@Pc(1951) int local1951 = arg1.anIntArray454[local1460] - arg1.anIntArray454[local1450];
							@Pc(1962) int local1962 = arg1.anIntArray456[local1460] - arg1.anIntArray456[local1450];
							@Pc(1972) int local1972 = arg1.anIntArray455[local1460] - arg1.anIntArray455[local1450];
							@Pc(1980) int local1980 = local1930 * local1972 - local1941 * local1962;
							@Pc(1989) int local1989 = local1941 * local1951 - local1919 * local1972;
							@Pc(1998) int local1998 = local1919 * local1962 - local1951 * local1930;
							local2006 = 64.0F / (float) arg1.anIntArray449[local1064];
							local2014 = 64.0F / (float) arg1.anIntArray458[local1064];
							local2022 = 64.0F / (float) arg1.anIntArray459[local1064];
							local2045 = ((float) local1989 * local1476[1] + (float) local1980 * local1476[0] + (float) local1998 * local1476[2]) / local2006;
							local2068 = ((float) local1998 * local1476[5] + local1476[3] * (float) local1980 + local1476[4] * (float) local1989) / local2014;
							local2091 = (local1476[6] * (float) local1980 + local1476[7] * (float) local1989 + local1476[8] * (float) local1998) / local2022;
							local1405 = Static345.method5318(local2091, local2045, local2068);
							Static360.method5431(local1581, local1489, arg1.anIntArray456[local1450], local1464, local1481, local1472, arg1.anIntArray455[local1450], local1405, arg1.anIntArray454[local1450], local1468, local1502, local1476);
							local1389 = Static225.aFloat112;
							local1391 = Static63.aFloat17;
							Static360.method5431(local1581, local1489, arg1.anIntArray456[local1455], local1464, local1481, local1472, arg1.anIntArray455[local1455], local1405, arg1.anIntArray454[local1455], local1468, local1502, local1476);
							local910 = Static63.aFloat17;
							local1393 = Static225.aFloat112;
							Static360.method5431(local1581, local1489, arg1.anIntArray456[local1460], local1464, local1481, local1472, arg1.anIntArray455[local1460], local1405, arg1.anIntArray454[local1460], local1468, local1502, local1476);
							local918 = Static225.aFloat112;
							local902 = Static63.aFloat17;
						} else if (local1440 == 3) {
							Static393.method5750(local1472, arg1.anIntArray454[local1450], local1468, local1489, arg1.anIntArray455[local1450], arg1.anIntArray456[local1450], local1481, local1464, local1476);
							local1391 = Static550.aFloat193;
							local1389 = Static524.aFloat187;
							Static393.method5750(local1472, arg1.anIntArray454[local1455], local1468, local1489, arg1.anIntArray455[local1455], arg1.anIntArray456[local1455], local1481, local1464, local1476);
							local910 = Static550.aFloat193;
							local1393 = Static524.aFloat187;
							Static393.method5750(local1472, arg1.anIntArray454[local1460], local1468, local1489, arg1.anIntArray455[local1460], arg1.anIntArray456[local1460], local1481, local1464, local1476);
							local918 = Static524.aFloat187;
							local902 = Static550.aFloat193;
							if ((local1481 & 0x1) == 0) {
								if (local918 - local1389 > 0.5F) {
									local1403 = 1;
									local918--;
								} else if (local1389 - local918 > 0.5F) {
									local918++;
									local1403 = 2;
								}
								if (local1393 - local1389 > 0.5F) {
									local1401 = 1;
									local1393--;
								} else if (local1389 - local1393 > 0.5F) {
									local1401 = 2;
									local1393++;
								}
							} else {
								if (local910 - local1391 > 0.5F) {
									local910--;
									local1401 = 1;
								} else if (local1391 - local910 > 0.5F) {
									local910++;
									local1401 = 2;
								}
								if (local902 - local1391 > 0.5F) {
									local902--;
									local1403 = 1;
								} else if (local1391 - local902 > 0.5F) {
									local1403 = 2;
									local902++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray75 == null) {
				local1440 = 0;
			} else {
				local1440 = arg1.aByteArray75[local1342];
			}
			if (local1440 == 0) {
				@Pc(2580) long local2580 = ((long) (local1349 << 8) + (long) (local1405 << 24) + (long) local656 << 32) + (long) (local1064 << 2);
				local1460 = arg1.aShortArray68[local1342];
				local2200 = arg1.aShortArray75[local1342];
				local2205 = arg1.aShortArray77[local1342];
				@Pc(2599) Class358 local2599 = local328[local1460];
				this.aShortArray90[local1336] = this.method5499(local2599.anInt9594, local1391, local1460, arg1, local2580, local2599.anInt9597, local2599.anInt9595, local2599.anInt9593, local1336, local1389);
				@Pc(2624) Class358 local2624 = local328[local2200];
				this.aShortArray94[local1336] = this.method5499(local2624.anInt9594, local910, local2200, arg1, local2580 + (long) local1401, local2624.anInt9597, local2624.anInt9595, local2624.anInt9593, local1336, local1393);
				@Pc(2652) Class358 local2652 = local328[local2205];
				this.aShortArray96[local1336] = this.method5499(local2652.anInt9594, local902, local2205, arg1, (long) local1403 + local2580, local2652.anInt9597, local2652.anInt9595, local2652.anInt9593, local1336, local918);
			} else if (local1440 == 1) {
				@Pc(2685) Class321 local2685 = local1023[local1342];
				@Pc(2731) long local2731 = (long) ((local2685.anInt8679 + 256 << 12) + (local1064 << 2) + (local2685.anInt8678 <= 0 ? 2048 : 1024) + (local2685.anInt8683 - -256 << 22)) + ((long) (local1405 << 24) + (long) (local1349 << 8) + (long) local656 << 32);
				this.aShortArray90[local1336] = this.method5499(0, local1391, arg1.aShortArray68[local1342], arg1, local2731, local2685.anInt8679, local2685.anInt8678, local2685.anInt8683, local1336, local1389);
				this.aShortArray94[local1336] = this.method5499(0, local910, arg1.aShortArray75[local1342], arg1, local2731 + (long) local1401, local2685.anInt8679, local2685.anInt8678, local2685.anInt8683, local1336, local1393);
				this.aShortArray96[local1336] = this.method5499(0, local902, arg1.aShortArray77[local1342], arg1, (long) local1403 + local2731, local2685.anInt8679, local2685.anInt8678, local2685.anInt8683, local1336, local918);
			}
			if (arg1.aShortArray72 == null) {
				this.aShortArray87[local1336] = -1;
			} else {
				this.aShortArray87[local1336] = arg1.aShortArray72[local1342];
			}
			if (arg1.aByteArray76 != null) {
				this.aByteArray80[local1336] = arg1.aByteArray76[local1342];
			}
			if (arg1.aShortArray74 != null) {
				this.aShortArray93[local1336] = arg1.aShortArray74[local1342];
			}
			this.aShortArray92[local1336] = arg1.aShortArray71[local1342];
		}
		if (this.anInt6424 > 0) {
			local1342 = 1;
			local1042 = this.aShortArray87[0];
			for (local1053 = 0; local1053 < this.anInt6424; local1053++) {
				@Pc(2885) short local2885 = this.aShortArray87[local1053];
				if (local2885 != local1042) {
					local1342++;
					local1042 = local2885;
				}
			}
			this.anIntArray480 = new int[local1342];
			this.anIntArray481 = new int[local1342 + 1];
			this.anIntArray483 = new int[local1342];
			this.anIntArray481[0] = 0;
			local1064 = this.anInt6443;
			local1342 = 0;
			@Pc(2926) short local2926 = 0;
			local1042 = this.aShortArray87[0];
			for (local700 = 0; local700 < this.anInt6424; local700++) {
				@Pc(2940) short local2940 = this.aShortArray87[local700];
				if (local2940 != local1042) {
					this.anIntArray483[local1342] = local1064;
					this.anIntArray480[local1342] = local2926 + 1 - local1064;
					local1342++;
					this.anIntArray481[local1342] = local700;
					local2926 = 0;
					local1042 = local2940;
					local1064 = this.anInt6443;
				}
				@Pc(2979) short local2979 = this.aShortArray90[local700];
				if (local2979 < local1064) {
					local1064 = local2979;
				}
				if (local2926 < local2979) {
					local2926 = local2979;
				}
				local2979 = this.aShortArray94[local700];
				if (local2979 > local2926) {
					local2926 = local2979;
				}
				if (local1064 > local2979) {
					local1064 = local2979;
				}
				local2979 = this.aShortArray96[local700];
				if (local2926 < local2979) {
					local2926 = local2979;
				}
				if (local2979 < local1064) {
					local1064 = local2979;
				}
			}
			this.anIntArray483[local1342] = local1064;
			this.anIntArray480[local1342] = local2926 + 1 - local1064;
			local1342++;
			this.anIntArray481[local1342] = this.anInt6424;
		}
		Static70.aLongArray10 = null;
		this.aShortArray95 = Static46.method1077(this.anInt6443, this.aShortArray95);
		this.aShortArray91 = Static46.method1077(this.anInt6443, this.aShortArray91);
		this.aShortArray98 = Static46.method1077(this.anInt6443, this.aShortArray98);
		this.aShortArray97 = Static46.method1077(this.anInt6443, this.aShortArray97);
		this.aShortArray89 = Static46.method1077(this.anInt6443, this.aShortArray89);
		this.aByteArray81 = Static265.method4441(this.anInt6443, this.aByteArray81);
		this.lb = Static558.method7546(this.lb, this.anInt6443);
		this.aFloatArray53 = Static558.method7546(this.aFloatArray53, this.anInt6443);
		if (arg1.anIntArray452 != null && Static412.method5962(this.anInt6430, arg2)) {
			this.anIntArrayArray61 = arg1.method5299(false);
		}
		if (arg1.aClass265Array1 != null && Static453.method6409(this.anInt6430, arg2)) {
			this.anIntArrayArray59 = arg1.method5303();
		}
		if (arg1.anIntArray457 != null && Static425.method6113(this.anInt6430, arg2)) {
			local1342 = 0;
			local648 = new int[256];
			for (local1053 = 0; local1053 < this.anInt6414; local1053++) {
				local1064 = arg1.anIntArray457[local15[local1053]];
				if (local1064 >= 0) {
					@Pc(3184) int local3184 = local648[local1064]++;
					if (local1064 > local1342) {
						local1342 = local1064;
					}
				}
			}
			this.anIntArrayArray60 = new int[local1342 + 1][];
			for (local1064 = 0; local1064 <= local1342; local1064++) {
				this.anIntArrayArray60[local1064] = new int[local648[local1064]];
				local648[local1064] = 0;
			}
			for (local656 = 0; local656 < this.anInt6414; local656++) {
				local700 = arg1.anIntArray457[local15[local656]];
				if (local700 >= 0) {
					this.anIntArrayArray60[local700][local648[local700]++] = local656;
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!kea;IIZZ)V")
	public Class20_Sub3(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean446 = false;
		this.anInt6413 = 0;
		this.anInt6432 = 0;
		this.anInt6443 = 0;
		this.anInt6424 = 0;
		this.aBoolean447 = true;
		this.anInt6414 = 0;
		this.aBoolean448 = false;
		this.aClass14_Sub2_11 = arg0;
		this.anInt6410 = arg1;
		this.anInt6430 = arg2;
		this.aBoolean448 = arg4;
		if (arg3 || Static552.method7481(this.anInt6430, this.anInt6410)) {
			this.aClass65_1 = new Class65(Static524.method7193(this.anInt6410, this.anInt6430));
		}
		if (arg3 || Static195.method3543(this.anInt6430, this.anInt6410)) {
			this.aClass65_4 = new Class65(Static569.method7618(this.anInt6430, this.anInt6410));
		}
		if (arg3 || Static99.method1793(this.anInt6430, this.anInt6410)) {
			this.aClass65_2 = new Class65(Static515.method7130(this.anInt6430, this.anInt6410));
		}
		if (arg3 || Static599.method7859(this.anInt6430, this.anInt6410)) {
			this.aClass65_3 = new Class65(Static280.method4617(this.anInt6430, this.anInt6410));
		}
		if (arg3 || Static472.method6557(this.anInt6410, this.anInt6430)) {
			this.aClass288_1 = new Class288(Static414.method5967(this.anInt6430, this.anInt6410));
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6414; local7++) {
			local16 = this.aShortArray92[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			@Pc(60) int local60 = local16 & 0x7F;
			if (arg2 != -1) {
				local60 -= -((arg2 - local60) * arg3 >> 7);
			}
			this.aShortArray92[local7] = (short) (local60 | local22 << 10 | local28 << 7);
		}
		if (this.aClass192Array1 != null) {
			for (local16 = 0; local16 < this.anInt6440; local16++) {
				@Pc(106) Class192 local106 = this.aClass192Array1[local16];
				@Pc(111) Class214 local111 = this.aClass214Array1[local16];
				local111.anInt5990 = Static171.anIntArray212[this.aShortArray92[local106.anInt5355] & 0xFFFF] & 0xFFFFFF | local111.anInt5990 & 0xFF000000;
			}
		}
		this.method5494();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!q;Lclient!po;II)V")
	@Override
	public void method7259(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class98_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6443 == 0) {
			return;
		}
		@Pc(13) Class54_Sub3 local13 = this.aClass14_Sub2_11.aClass54_Sub3_16;
		if (!this.aBoolean446) {
			this.method5503();
		}
		@Pc(22) Class54_Sub3 local22 = (Class54_Sub3) arg0;
		Static161.aFloat68 = local22.aFloat152 * local13.aFloat150 + local13.aFloat146 * local22.aFloat143 + local22.aFloat150 * local13.aFloat148;
		Static419.aFloat158 = local22.aFloat145 * local13.aFloat146 + local22.aFloat149 * local13.aFloat150 + local13.aFloat148 * local22.aFloat154 + local13.aFloat154;
		@Pc(69) float local69 = Static161.aFloat68 * (float) this.anInt6466 + Static419.aFloat158;
		@Pc(77) float local77 = Static161.aFloat68 * (float) this.anInt6467 + Static419.aFloat158;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = local77 - (float) this.anInt6447;
			local93 = local69 + (float) this.anInt6447;
		} else {
			local87 = (float) -this.anInt6447 + local69;
			local93 = local77 + (float) this.anInt6447;
		}
		if (this.aClass14_Sub2_11.aFloat177 <= local87 || (float) this.aClass14_Sub2_11.anInt8584 >= local93) {
			return;
		}
		Static81.aFloat20 = local22.aFloat150 * local13.aFloat147 + local22.aFloat143 * local13.aFloat144 + local22.aFloat152 * local13.aFloat143;
		Static440.aFloat161 = local13.aFloat145 + local13.aFloat147 * local22.aFloat154 + local13.aFloat143 * local22.aFloat149 + local22.aFloat145 * local13.aFloat144;
		@Pc(170) float local170 = (float) this.anInt6466 * Static81.aFloat20 + Static440.aFloat161;
		@Pc(178) float local178 = (float) this.anInt6467 * Static81.aFloat20 + Static440.aFloat161;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local178 < local170) {
			local193 = (float) this.aClass14_Sub2_11.anInt8603 * (local170 + (float) this.anInt6447);
			local204 = (local178 - (float) this.anInt6447) * (float) this.aClass14_Sub2_11.anInt8603;
		} else {
			local204 = (float) this.aClass14_Sub2_11.anInt8603 * ((float) -this.anInt6447 + local170);
			local193 = (local178 + (float) this.anInt6447) * (float) this.aClass14_Sub2_11.anInt8603;
		}
		if (this.aClass14_Sub2_11.aFloat174 <= local204 / (float) arg2 || local193 / (float) arg2 <= this.aClass14_Sub2_11.aFloat171) {
			return;
		}
		Static40.aFloat13 = local13.aFloat151 * local22.aFloat143 + local13.aFloat152 * local22.aFloat152 + local13.aFloat153 * local22.aFloat150;
		Static527.aFloat189 = local13.aFloat149 + local13.aFloat152 * local22.aFloat149 + local13.aFloat151 * local22.aFloat145 + local22.aFloat154 * local13.aFloat153;
		@Pc(296) float local296 = Static527.aFloat189 + (float) this.anInt6466 * Static40.aFloat13;
		@Pc(304) float local304 = Static527.aFloat189 + Static40.aFloat13 * (float) this.anInt6467;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local304 < local296) {
			local320 = (float) this.aClass14_Sub2_11.anInt8609 * ((float) -this.anInt6447 + local304);
			local331 = (float) this.aClass14_Sub2_11.anInt8609 * ((float) this.anInt6447 + local296);
		} else {
			local331 = (float) this.aClass14_Sub2_11.anInt8609 * ((float) this.anInt6447 + local304);
			local320 = (local296 - (float) this.anInt6447) * (float) this.aClass14_Sub2_11.anInt8609;
		}
		if (local320 / (float) arg2 >= this.aClass14_Sub2_11.aFloat168 || local331 / (float) arg2 <= this.aClass14_Sub2_11.aFloat184) {
			return;
		}
		if (arg1 != null || this.aClass192Array1 != null) {
			Static503.aFloat166 = local13.aFloat150 * local22.aFloat151 + local13.aFloat146 * local22.aFloat144 + local22.aFloat146 * local13.aFloat148;
			Static135.aFloat64 = local22.aFloat151 * local13.aFloat152 + local13.aFloat151 * local22.aFloat144 + local22.aFloat146 * local13.aFloat153;
			Static497.aFloat165 = local13.aFloat148 * local22.aFloat148 + local13.aFloat146 * local22.aFloat147 + local22.aFloat153 * local13.aFloat150;
			Static56.aFloat16 = local22.aFloat144 * local13.aFloat144 + local13.aFloat143 * local22.aFloat151 + local22.aFloat146 * local13.aFloat147;
			Static470.aFloat11 = local13.aFloat147 * local22.aFloat148 + local22.aFloat147 * local13.aFloat144 + local22.aFloat153 * local13.aFloat143;
			Static81.aFloat21 = local22.aFloat148 * local13.aFloat153 + local22.aFloat147 * local13.aFloat151 + local22.aFloat153 * local13.aFloat152;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.anInt6429 + this.anInt6406 >> 1;
			@Pc(507) int local507 = this.anInt6419 + this.anInt6431 >> 1;
			@Pc(526) int local526 = (int) ((float) local507 * Static470.aFloat11 + Static440.aFloat161 + (float) local498 * Static56.aFloat16 + (float) this.anInt6466 * Static81.aFloat20);
			@Pc(545) int local545 = (int) (Static81.aFloat21 * (float) local507 + Static135.aFloat64 * (float) local498 + Static527.aFloat189 + Static40.aFloat13 * (float) this.anInt6466);
			@Pc(564) int local564 = (int) ((float) this.anInt6466 * Static161.aFloat68 + Static419.aFloat158 + (float) local498 * Static503.aFloat166 + (float) local507 * Static497.aFloat165);
			@Pc(583) int local583 = (int) (Static470.aFloat11 * (float) local507 + Static440.aFloat161 + Static56.aFloat16 * (float) local498 + (float) this.anInt6467 * Static81.aFloat20);
			@Pc(602) int local602 = (int) (Static81.aFloat21 * (float) local507 + (float) this.anInt6467 * Static40.aFloat13 + Static527.aFloat189 + (float) local498 * Static135.aFloat64);
			arg1.anInt7045 = local602 * this.aClass14_Sub2_11.anInt8609 / arg2 + this.aClass14_Sub2_11.anInt8597;
			arg1.anInt7042 = this.aClass14_Sub2_11.anInt8617 + local526 * this.aClass14_Sub2_11.anInt8603 / arg2;
			arg1.anInt7043 = local583 * this.aClass14_Sub2_11.anInt8603 / arg2 + this.aClass14_Sub2_11.anInt8617;
			arg1.anInt7044 = local545 * this.aClass14_Sub2_11.anInt8609 / arg2 + this.aClass14_Sub2_11.anInt8597;
			@Pc(674) int local674 = (int) (Static161.aFloat68 * (float) this.anInt6467 + (float) local498 * Static503.aFloat166 + Static419.aFloat158 + (float) local507 * Static497.aFloat165);
			if (local564 < this.aClass14_Sub2_11.anInt8584 && this.aClass14_Sub2_11.anInt8584 > local674) {
				arg1.anInt7041 = (local526 + this.anInt6447) * this.aClass14_Sub2_11.anInt8603 / arg2 + this.aClass14_Sub2_11.anInt8617 - arg1.anInt7042;
				arg1.aBoolean491 = true;
			}
		}
		this.aClass14_Sub2_11.method6921((float) arg2);
		this.aClass14_Sub2_11.method6986();
		this.aClass14_Sub2_11.method7017(local22);
		this.method5495();
		this.method5496();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	private void method5487() {
		if (!this.aBoolean447) {
			return;
		}
		this.aBoolean447 = false;
		if (this.aClass85Array6 == null && this.aClass90Array6 == null && this.aClass192Array1 == null) {
			if (this.anIntArray479 != null && !Static259.method4375(this.anInt6430, this.anInt6410)) {
				if (this.aClass65_1 == null || this.aClass65_1.method1645()) {
					if (!this.aBoolean446) {
						this.method5503();
					}
					this.anIntArray479 = null;
				} else {
					this.aBoolean447 = true;
				}
			}
			if (this.anIntArray478 != null && !Static483.method6645(this.anInt6410, this.anInt6430)) {
				if (this.aClass65_1 == null || this.aClass65_1.method1645()) {
					if (!this.aBoolean446) {
						this.method5503();
					}
					this.anIntArray478 = null;
				} else {
					this.aBoolean447 = true;
				}
			}
			if (this.anIntArray482 != null && !Static438.method6233(this.anInt6410, this.anInt6430)) {
				if (this.aClass65_1 == null || this.aClass65_1.method1645()) {
					if (!this.aBoolean446) {
						this.method5503();
					}
					this.anIntArray482 = null;
				} else {
					this.aBoolean447 = true;
				}
			}
		}
		if (this.aShortArray88 != null && this.anIntArray479 == null && this.anIntArray478 == null && this.anIntArray482 == null) {
			this.aShortArray88 = null;
			this.anIntArray484 = null;
		}
		if (this.aByteArray81 != null && !Static421.method6083(this.anInt6430, this.anInt6410)) {
			label195: {
				label194: {
					@Pc(163) boolean local163;
					if ((this.anInt6430 & 0x37) == 0) {
						if (this.aClass65_2 == null || this.aClass65_2.method1645()) {
							break label194;
						}
						local163 = false;
					} else {
						if (this.aClass65_3 == null || this.aClass65_3.method1645()) {
							break label194;
						}
						local163 = false;
					}
					if (!local163) {
						this.aBoolean447 = true;
						break label195;
					}
				}
				this.aByteArray81 = null;
				this.aShortArray98 = this.aShortArray97 = this.aShortArray89 = null;
			}
		}
		if (this.aShortArray92 != null && !Static467.method6519(this.anInt6410, this.anInt6430)) {
			if (this.aClass65_2 == null || this.aClass65_2.method1645()) {
				this.aShortArray92 = null;
			} else {
				this.aBoolean447 = true;
			}
		}
		if (this.aByteArray80 != null && !Static513.method7110(this.anInt6430, this.anInt6410)) {
			if (this.aClass65_2 == null || this.aClass65_2.method1645()) {
				this.aByteArray80 = null;
			} else {
				this.aBoolean447 = true;
			}
		}
		if (this.lb != null && !Static308.method4870(this.anInt6410, this.anInt6430)) {
			if (this.aClass65_4 == null || this.aClass65_4.method1645()) {
				this.lb = this.aFloatArray53 = null;
			} else {
				this.aBoolean447 = true;
			}
		}
		if (this.aShortArray87 != null && !Static79.method1614(this.anInt6410, this.anInt6430)) {
			if (this.aClass65_2 == null || this.aClass65_2.method1645()) {
				this.aShortArray87 = null;
			} else {
				this.aBoolean447 = true;
			}
		}
		if (this.aShortArray90 != null && !Static50.method1120(this.anInt6410, this.anInt6430)) {
			if ((this.aClass288_1 == null || this.aClass288_1.method6407()) && (this.aClass65_2 == null || this.aClass65_2.method1645())) {
				this.aShortArray90 = this.aShortArray94 = this.aShortArray96 = null;
			} else {
				this.aBoolean447 = true;
			}
		}
		if (this.aShortArray95 != null) {
			if (this.aClass65_1 == null || this.aClass65_1.method1645()) {
				this.aShortArray95 = null;
			} else {
				this.aBoolean447 = true;
			}
		}
		if (this.aShortArray91 != null) {
			if (this.aClass65_2 == null || this.aClass65_2.method1645()) {
				this.aShortArray91 = null;
			} else {
				this.aBoolean447 = true;
			}
		}
		if (this.anIntArrayArray60 != null && !Static425.method6113(this.anInt6430, this.anInt6410)) {
			this.aShortArray93 = null;
			this.anIntArrayArray60 = null;
		}
		if (this.anIntArrayArray61 != null && !Static412.method5962(this.anInt6430, this.anInt6410)) {
			this.aShortArray86 = null;
			this.anIntArrayArray61 = null;
		}
		if (this.anIntArrayArray59 != null && !Static453.method6409(this.anInt6430, this.anInt6410)) {
			this.anIntArrayArray59 = null;
		}
		if (this.anIntArray481 != null && (this.anInt6410 & 0x800) == 0 && (this.anInt6410 & 0x40000) == 0) {
			this.anIntArray480 = null;
			this.anIntArray483 = null;
			this.anIntArray481 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean446) {
			this.method5503();
		}
		@Pc(16) int local16 = this.anInt6429 + arg4;
		@Pc(22) int local22 = arg4 + this.anInt6406;
		@Pc(27) int local27 = this.anInt6419 + arg6;
		@Pc(33) int local33 = arg6 + this.anInt6431;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9641 + local22 >> arg2.anInt9638 >= arg2.anInt9640 || local27 < 0 || arg2.anInt9639 <= arg2.anInt9641 + local33 >> arg2.anInt9638)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9640 <= local22 + arg3.anInt9641 >> arg3.anInt9638 || local27 < 0 || arg3.anInt9639 <= arg3.anInt9641 + local33 >> arg3.anInt9638) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9638;
			local22 = local22 + arg2.anInt9641 - 1 >> arg2.anInt9638;
			local27 >>= arg2.anInt9638;
			local33 = arg2.anInt9641 + local33 - 1 >> arg2.anInt9638;
			if (arg2.JA(local16, local27) == arg5 && arg2.JA(local22, local27) == arg5 && arg2.JA(local16, local33) == arg5 && arg5 == arg2.JA(local22, local33)) {
				return;
			}
		}
		@Pc(199) int local199;
		if (arg0 == 1) {
			for (local199 = 0; local199 < this.anInt6413; local199++) {
				this.anIntArray478[local199] = this.anIntArray478[local199] + arg2.sa(this.anIntArray479[local199] + arg4, arg6 + this.anIntArray482[local199]) - arg5;
			}
		} else {
			@Pc(248) int local248;
			@Pc(259) int local259;
			if (arg0 == 2) {
				local199 = this.anInt6466;
				if (local199 == 0) {
					return;
				}
				for (local248 = 0; local248 < this.anInt6413; local248++) {
					local259 = (this.anIntArray478[local248] << 16) / local199;
					if (local259 < arg1) {
						this.anIntArray478[local248] -= -((arg2.sa(arg4 + this.anIntArray479[local248], arg6 + this.anIntArray482[local248]) - arg5) * (-local259 + arg1) / arg1);
					}
				}
			} else {
				@Pc(396) int local396;
				if (arg0 == 3) {
					local199 = (arg1 & 0xFF) * 4;
					local248 = (arg1 >> 8 & 0xFF) * 4;
					local259 = (arg1 >> 16 & 0xFF) << 6;
					local396 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local199 >> 1) < 0 || arg2.anInt9640 << arg2.anInt9638 <= (local199 >> 1) + arg4 + arg2.anInt9641 || arg6 - (local248 >> 1) < 0 || arg2.anInt9639 << arg2.anInt9638 <= arg6 + (local248 >> 1) + arg2.anInt9641) {
						return;
					}
					this.method7269(local259, local248, local199, arg5, arg2, local396, arg6, arg4);
				} else if (arg0 == 4) {
					local199 = this.anInt6467 - this.anInt6466;
					for (local248 = 0; local248 < this.anInt6413; local248++) {
						this.anIntArray478[local248] = local199 + this.anIntArray478[local248] + arg3.sa(this.anIntArray479[local248] - -arg4, arg6 + this.anIntArray482[local248]) - arg5;
					}
				} else if (arg0 == 5) {
					local199 = this.anInt6467 - this.anInt6466;
					for (local248 = 0; local248 < this.anInt6413; local248++) {
						local259 = this.anIntArray479[local248] + arg4;
						local396 = this.anIntArray482[local248] + arg6;
						@Pc(401) int local401 = arg2.sa(local259, local396);
						@Pc(406) int local406 = arg3.sa(local259, local396);
						@Pc(411) int local411 = local401 - local406;
						this.anIntArray478[local248] = ((this.anIntArray478[local248] << 8) / local199 * local411 >> 8) + local401 - arg5;
					}
				}
			}
		}
		this.method5491();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!og", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass14_Sub2_11.anInterface4_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6414; local11++) {
			if (this.aShortArray87[local11] == arg0) {
				this.aShortArray87[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class313 local52 = local9.method4234(arg0 & 0xFFFF);
			local41 = local52.aByte100;
			local39 = local52.aByte101;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(73) Class313 local73 = local9.method4234(arg1 & 0xFFFF);
			local60 = local73.aByte101;
			local62 = local73.aByte100;
		}
		if (!(local60 != local39 | local41 != local62)) {
			return;
		}
		if (this.aClass192Array1 != null) {
			for (@Pc(98) int local98 = 0; local98 < this.anInt6440; local98++) {
				@Pc(105) Class192 local105 = this.aClass192Array1[local98];
				@Pc(110) Class214 local110 = this.aClass214Array1[local98];
				local110.anInt5990 = local110.anInt5990 & 0xFF000000 | Static171.anIntArray212[this.aShortArray92[local105.anInt5355] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5494();
	}

	@OriginalMember(owner = "client!og", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean446) {
			this.method5503();
		}
		return this.anInt6466;
	}

	@OriginalMember(owner = "client!og", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean446) {
			this.method5503();
		}
		return this.anInt6429;
	}

	@OriginalMember(owner = "client!og", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.aShort85 = (short) arg0;
		this.method5494();
	}

	@OriginalMember(owner = "client!og", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		if (this.aClass65_1 != null) {
			this.aClass65_1.aBoolean123 = Static524.method7193(arg0, this.anInt6430);
		}
		if (this.aClass65_4 != null) {
			this.aClass65_4.aBoolean123 = Static569.method7618(this.anInt6430, arg0);
		}
		if (this.aClass65_2 != null) {
			this.aClass65_2.aBoolean123 = Static515.method7130(this.anInt6430, arg0);
		}
		if (this.aClass65_3 != null) {
			this.aClass65_3.aBoolean123 = Static280.method4617(this.anInt6430, arg0);
		}
		this.anInt6410 = arg0;
		if (this.aClass242_1 != null && (this.anInt6410 & 0x10000) == 0) {
			this.aByteArray81 = this.aClass242_1.aByteArray84;
			this.aShortArray89 = this.aClass242_1.aShortArray105;
			this.aShortArray98 = this.aClass242_1.aShortArray103;
			this.aShortArray97 = this.aClass242_1.aShortArray104;
			this.aClass242_1 = null;
		}
		this.aBoolean447 = true;
		this.method5487();
	}

	@OriginalMember(owner = "client!og", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean446) {
			this.method5503();
		}
		return this.anInt6467;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!pca;)V")
	private void method5489(@OriginalArg(1) Class6_Sub2_Sub14_Sub1 arg0) {
		if (Static59.anIntArray110.length < this.anInt6443) {
			Static168.anIntArray209 = new int[this.anInt6443];
			Static59.anIntArray110 = new int[this.anInt6443];
		}
		@Pc(50) int local50;
		@Pc(89) int local89;
		@Pc(98) int local98;
		for (@Pc(24) int local24 = 0; local24 < this.anInt6413; local24++) {
			local50 = (this.anIntArray479[local24] - (this.anIntArray478[local24] * this.aClass14_Sub2_11.anInt8589 >> 8) >> this.aClass14_Sub2_11.anInt8591) - arg0.anInt6811;
			@Pc(75) int local75 = (this.anIntArray482[local24] - (this.aClass14_Sub2_11.anInt8580 * this.anIntArray478[local24] >> 8) >> this.aClass14_Sub2_11.anInt8591) - arg0.anInt6805;
			@Pc(80) int local80 = this.anIntArray484[local24];
			@Pc(87) int local87 = this.anIntArray484[local24 + 1];
			for (local89 = local80; local89 < local87; local89++) {
				local98 = this.aShortArray88[local89] - 1;
				if (local98 == -1) {
					break;
				}
				Static59.anIntArray110[local98] = local50;
				Static168.anIntArray209[local98] = local75;
			}
		}
		for (local50 = 0; local50 < this.anInt6424; local50++) {
			if (this.aByteArray80 == null || this.aByteArray80[local50] <= 128) {
				@Pc(146) short local146 = this.aShortArray90[local50];
				@Pc(151) short local151 = this.aShortArray94[local50];
				@Pc(156) short local156 = this.aShortArray96[local50];
				local89 = Static59.anIntArray110[local146];
				local98 = Static59.anIntArray110[local151];
				@Pc(168) int local168 = Static59.anIntArray110[local156];
				@Pc(172) int local172 = Static168.anIntArray209[local146];
				@Pc(176) int local176 = Static168.anIntArray209[local151];
				@Pc(180) int local180 = Static168.anIntArray209[local156];
				if (-((local176 - local172) * (local168 - local98)) + (local89 - local98) * (local176 - local180) > 0) {
					arg0.method5716(local168, local176, local180, local172, local89, local98);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6432; local3++) {
			this.anIntArray479[local3] = this.anIntArray479[local3] + 7 >> 4;
			this.anIntArray478[local3] = this.anIntArray478[local3] + 7 >> 4;
			this.anIntArray482[local3] = this.anIntArray482[local3] + 7 >> 4;
		}
		this.method5491();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!og", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort86 = (short) arg0;
		this.method5491();
		this.method5493();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)Z")
	private boolean method5490() {
		@Pc(18) boolean local18 = !this.aClass65_2.aBoolean122;
		@Pc(31) boolean local31 = (this.anInt6430 & 0x37) != 0 && !this.aClass65_3.aBoolean122;
		@Pc(39) boolean local39 = !this.aClass65_1.aBoolean122;
		@Pc(47) boolean local47 = !this.aClass65_4.aBoolean122;
		if (!local39 && !local18 && !local31 && !local47) {
			return true;
		}
		@Pc(59) boolean local59 = true;
		@Pc(80) Interface13 local80;
		@Pc(94) Buffer local94;
		if (local39) {
			if (this.aClass65_1.anInterface13_2 == null) {
				this.aClass65_1.anInterface13_2 = this.aClass14_Sub2_11.method7004(this.aBoolean448);
			}
			local80 = this.aClass65_1.anInterface13_2;
			local80.method1884(12, this.anInt6443 * 12);
			local94 = local80.method4095();
			if (local94 == null) {
				local59 = false;
			} else {
				this.aClass14_Sub2_11.lb.copyPositions(this.anIntArray479, this.anIntArray478, this.anIntArray482, this.aShortArray95, 0, 12, this.anInt6443, local94.getAddress());
				if (local80.method4094()) {
					this.aClass65_1.anInterface13_1 = local80;
					this.aClass65_1.aBoolean122 = true;
				} else {
					local59 = false;
				}
			}
		}
		@Pc(187) short[] local187;
		@Pc(190) short[] local190;
		@Pc(193) short[] local193;
		@Pc(184) byte[] local184;
		if (local18) {
			if (this.aClass65_2.anInterface13_2 == null) {
				this.aClass65_2.anInterface13_2 = this.aClass14_Sub2_11.method7004(this.aBoolean448);
			}
			local80 = this.aClass65_2.anInterface13_2;
			local80.method1884(4, this.anInt6443 * 4);
			local94 = local80.method4095();
			if (local94 == null) {
				local59 = false;
			} else {
				if ((this.anInt6430 & 0x37) == 0) {
					if (this.aClass242_1 == null) {
						local184 = this.aByteArray81;
						local187 = this.aShortArray98;
						local190 = this.aShortArray97;
						local193 = this.aShortArray89;
					} else {
						local187 = this.aClass242_1.aShortArray103;
						local190 = this.aClass242_1.aShortArray104;
						local184 = this.aClass242_1.aByteArray84;
						local193 = this.aClass242_1.aShortArray105;
					}
					this.aClass14_Sub2_11.lb.copyLighting(this.aShortArray92, this.aByteArray80, this.aShortArray87, local187, local190, local193, local184, this.aShort85, this.aShort86, this.aShortArray91, 0, 4, this.anInt6443, local94.getAddress());
				} else {
					this.aClass14_Sub2_11.lb.copyColours(this.aShortArray92, this.aByteArray80, this.aShortArray87, this.aShort85, this.aShortArray91, 0, 4, this.anInt6443, local94.getAddress());
				}
				if (local80.method4094()) {
					this.aClass65_2.anInterface13_1 = local80;
					this.aClass65_2.aBoolean122 = true;
				} else {
					local59 = false;
				}
			}
		}
		if (local31) {
			if (this.aClass65_3.anInterface13_2 == null) {
				this.aClass65_3.anInterface13_2 = this.aClass14_Sub2_11.method7004(this.aBoolean448);
			}
			local80 = this.aClass65_3.anInterface13_2;
			local80.method1884(12, this.anInt6443 * 12);
			local94 = local80.method4095();
			if (local94 == null) {
				local59 = false;
			} else {
				if (this.aClass242_1 == null) {
					local190 = this.aShortArray97;
					local193 = this.aShortArray89;
					local187 = this.aShortArray98;
					local184 = this.aByteArray81;
				} else {
					local187 = this.aClass242_1.aShortArray103;
					local184 = this.aClass242_1.aByteArray84;
					local190 = this.aClass242_1.aShortArray104;
					local193 = this.aClass242_1.aShortArray105;
				}
				this.aClass14_Sub2_11.lb.copyNormals(local187, local190, local193, local184, 3.0F / (float) this.aShort86, 3.0F / (float) (this.aShort86 / 2 + this.aShort86), 0, 12, this.anInt6443, local94.getAddress());
				if (local80.method4094()) {
					this.aClass65_3.anInterface13_1 = local80;
					this.aClass65_3.aBoolean122 = true;
				} else {
					local59 = false;
				}
			}
		}
		if (local47) {
			if (this.aClass65_4.anInterface13_2 == null) {
				this.aClass65_4.anInterface13_2 = this.aClass14_Sub2_11.method7004(this.aBoolean448);
			}
			local80 = this.aClass65_4.anInterface13_2;
			local80.method1884(8, this.anInt6443 * 8);
			local94 = local80.method4095();
			if (local94 == null) {
				local59 = false;
			} else {
				this.aClass14_Sub2_11.lb.copyTexCoords(this.lb, this.aFloatArray53, 0, 8, this.anInt6443, local94.getAddress());
				if (local80.method4094()) {
					this.aClass65_4.aBoolean122 = true;
					this.aClass65_4.anInterface13_1 = local80;
				} else {
					local59 = false;
				}
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!og", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub7.anIntArray178[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub7.anIntArray177[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6413; local15++) {
			local33 = this.anIntArray482[local15] * local9 + local13 * this.anIntArray479[local15] >> 14;
			this.anIntArray482[local15] = local13 * this.anIntArray482[local15] - this.anIntArray479[local15] * local9 >> 14;
			this.anIntArray479[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6443; local33++) {
			@Pc(87) int local87 = this.aShortArray98[local33] * local13 + local9 * this.aShortArray89[local33] >> 14;
			this.aShortArray89[local33] = (short) (this.aShortArray89[local33] * local13 - local9 * this.aShortArray98[local33] >> 14);
			this.aShortArray98[local33] = (short) local87;
		}
		this.method5491();
		this.method5493();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class54_Sub3 local8 = (Class54_Sub3) arg2;
		@Pc(12) Class54_Sub3 local12 = this.aClass14_Sub2_11.aClass54_Sub3_16;
		@Pc(33) float local33 = local12.aFloat143 * local8.aFloat149 + local12.aFloat144 * local8.aFloat145 + local12.aFloat147 * local8.aFloat154 + local12.aFloat145;
		@Pc(54) float local54 = local8.aFloat149 * local12.aFloat152 + local12.aFloat151 * local8.aFloat145 + local8.aFloat154 * local12.aFloat153 + local12.aFloat149;
		Static81.aFloat21 = local8.aFloat147 * local12.aFloat151 + local8.aFloat153 * local12.aFloat152 + local12.aFloat153 * local8.aFloat148;
		Static497.aFloat165 = local12.aFloat148 * local8.aFloat148 + local12.aFloat150 * local8.aFloat153 + local8.aFloat147 * local12.aFloat146;
		Static161.aFloat68 = local8.aFloat150 * local12.aFloat148 + local12.aFloat146 * local8.aFloat143 + local8.aFloat152 * local12.aFloat150;
		Static135.aFloat64 = local8.aFloat146 * local12.aFloat153 + local8.aFloat151 * local12.aFloat152 + local8.aFloat144 * local12.aFloat151;
		Static503.aFloat166 = local8.aFloat151 * local12.aFloat150 + local8.aFloat144 * local12.aFloat146 + local12.aFloat148 * local8.aFloat146;
		Static81.aFloat20 = local8.aFloat150 * local12.aFloat147 + local12.aFloat143 * local8.aFloat152 + local12.aFloat144 * local8.aFloat143;
		Static40.aFloat13 = local12.aFloat153 * local8.aFloat150 + local8.aFloat143 * local12.aFloat151 + local12.aFloat152 * local8.aFloat152;
		@Pc(201) float local201 = local12.aFloat154 + local12.aFloat148 * local8.aFloat154 + local8.aFloat149 * local12.aFloat150 + local12.aFloat146 * local8.aFloat145;
		Static56.aFloat16 = local12.aFloat147 * local8.aFloat146 + local12.aFloat144 * local8.aFloat144 + local8.aFloat151 * local12.aFloat143;
		Static470.aFloat11 = local8.aFloat148 * local12.aFloat147 + local12.aFloat143 * local8.aFloat153 + local8.aFloat147 * local12.aFloat144;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass14_Sub2_11.anInt8603;
		@Pc(255) int local255 = this.aClass14_Sub2_11.anInt8609;
		if (!this.aBoolean446) {
			this.method5503();
		}
		Static551.anIntArray693[0] = this.anInt6429;
		Static355.anIntArray533[0] = this.anInt6466;
		Static352.anIntArray469[0] = this.anInt6419;
		Static551.anIntArray693[1] = this.anInt6406;
		Static355.anIntArray533[1] = this.anInt6466;
		Static352.anIntArray469[1] = this.anInt6419;
		Static551.anIntArray693[2] = this.anInt6429;
		Static355.anIntArray533[2] = this.anInt6467;
		Static551.anIntArray693[3] = this.anInt6406;
		Static352.anIntArray469[2] = this.anInt6419;
		Static355.anIntArray533[3] = this.anInt6467;
		Static352.anIntArray469[3] = this.anInt6419;
		Static551.anIntArray693[4] = this.anInt6429;
		Static355.anIntArray533[4] = this.anInt6466;
		Static551.anIntArray693[5] = this.anInt6406;
		Static352.anIntArray469[4] = this.anInt6431;
		Static355.anIntArray533[5] = this.anInt6466;
		Static352.anIntArray469[5] = this.anInt6431;
		Static551.anIntArray693[6] = this.anInt6429;
		Static355.anIntArray533[6] = this.anInt6467;
		Static551.anIntArray693[7] = this.anInt6406;
		Static352.anIntArray469[6] = this.anInt6431;
		Static355.anIntArray533[7] = this.anInt6467;
		Static352.anIntArray469[7] = this.anInt6431;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(400) float local400;
		@Pc(390) float local390;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static355.anIntArray533[local383];
			local395 = Static352.anIntArray469[local383];
			local400 = Static551.anIntArray693[local383];
			local414 = local54 + Static40.aFloat13 * local390 + local400 * Static135.aFloat64 + Static81.aFloat21 * local395;
			local428 = local395 * Static497.aFloat165 + local390 * Static161.aFloat68 + Static503.aFloat166 * local400 + local201;
			local442 = Static470.aFloat11 * local395 + Static81.aFloat20 * local390 + local400 * Static56.aFloat16 + local33;
			if (local428 >= (float) this.aClass14_Sub2_11.anInt8584) {
				@Pc(461) float local461 = (float) this.aClass14_Sub2_11.anInt8617 + local442 * (float) local251 / local428;
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(479) float local479 = (float) this.aClass14_Sub2_11.anInt8597 + (float) local255 * local414 / local428;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local247 < local479) {
					local247 = local479;
				}
				local239 = true;
				if (local479 < local245) {
					local245 = local479;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt6443 > Static59.anIntArray110.length) {
				Static168.anIntArray209 = new int[this.anInt6443];
				Static59.anIntArray110 = new int[this.anInt6443];
			}
			@Pc(620) int local620;
			for (@Pc(546) int local546 = 0; local546 < this.anInt6413; local546++) {
				local390 = this.anIntArray478[local546];
				local395 = this.anIntArray482[local546];
				local400 = this.anIntArray479[local546];
				local442 = local33 + local395 * Static470.aFloat11 + Static81.aFloat20 * local390 + Static56.aFloat16 * local400;
				local428 = local390 * Static161.aFloat68 + Static503.aFloat166 * local400 + local395 * Static497.aFloat165 + local201;
				local414 = local400 * Static135.aFloat64 + local390 * Static40.aFloat13 + local395 * Static81.aFloat21 + local54;
				@Pc(627) int local627;
				@Pc(629) int local629;
				@Pc(638) int local638;
				if ((float) this.aClass14_Sub2_11.anInt8584 <= local428) {
					local620 = (int) ((float) local251 * local442 / local428 + (float) this.aClass14_Sub2_11.anInt8617);
					local627 = (int) ((float) local255 * local414 / local428 + (float) this.aClass14_Sub2_11.anInt8597);
					local629 = this.anIntArray484[local546];
					local638 = this.anIntArray484[local546 + 1];
					for (@Pc(696) int local696 = local629; local696 < local638; local696++) {
						@Pc(705) int local705 = this.aShortArray88[local696] - 1;
						if (local705 == -1) {
							break;
						}
						Static59.anIntArray110[local705] = local620;
						Static168.anIntArray209[local705] = local627;
					}
				} else {
					local620 = this.anIntArray484[local546];
					local627 = this.anIntArray484[local546 + 1];
					for (local629 = local620; local629 < local627; local629++) {
						local638 = this.aShortArray88[local629] - 1;
						if (local638 == -1) {
							break;
						}
						Static59.anIntArray110[this.aShortArray88[local629] - 1] = -999999;
					}
				}
			}
			for (local620 = 0; local620 < this.anInt6414; local620++) {
				if (Static59.anIntArray110[this.aShortArray90[local620]] != -999999 && Static59.anIntArray110[this.aShortArray94[local620]] != -999999 && Static59.anIntArray110[this.aShortArray96[local620]] != -999999 && this.method5497(Static168.anIntArray209[this.aShortArray96[local620]], arg1, Static59.anIntArray110[this.aShortArray96[local620]], arg0, Static59.anIntArray110[this.aShortArray90[local620]], Static59.anIntArray110[this.aShortArray94[local620]], Static168.anIntArray209[this.aShortArray94[local620]], Static168.anIntArray209[this.aShortArray90[local620]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!og", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6413; local3++) {
			this.anIntArray482[local3] = -this.anIntArray482[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt6443; local29++) {
			this.aShortArray89[local29] = (short) -this.aShortArray89[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt6414; local48++) {
			@Pc(55) short local55 = this.aShortArray90[local48];
			this.aShortArray90[local48] = this.aShortArray96[local48];
			this.aShortArray96[local48] = local55;
		}
		this.method5491();
		this.method5493();
		this.method5501();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!og", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean446) {
			this.method5503();
		}
		return this.anInt6406;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
	private void method5491() {
		if (this.aClass65_1 != null) {
			this.aClass65_1.aBoolean122 = false;
		}
	}

	@OriginalMember(owner = "client!og", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean446) {
			this.method5503();
		}
		return this.anInt6447;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class20 method7264(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(23) Class20_Sub3 local23;
		@Pc(19) Class20_Sub3 local19;
		if (arg0 == 1) {
			local23 = this.aClass14_Sub2_11.aClass20_Sub3_25;
			local19 = this.aClass14_Sub2_11.aClass20_Sub3_27;
		} else if (arg0 == 2) {
			local19 = this.aClass14_Sub2_11.aClass20_Sub3_23;
			local23 = this.aClass14_Sub2_11.aClass20_Sub3_29;
		} else if (arg0 == 3) {
			local19 = this.aClass14_Sub2_11.aClass20_Sub3_26;
			local23 = this.aClass14_Sub2_11.aClass20_Sub3_28;
		} else if (arg0 == 4) {
			local19 = this.aClass14_Sub2_11.aClass20_Sub3_21;
			local23 = this.aClass14_Sub2_11.aClass20_Sub3_24;
		} else if (arg0 == 5) {
			local19 = this.aClass14_Sub2_11.aClass20_Sub3_22;
			local23 = this.aClass14_Sub2_11.aClass20_Sub3_30;
		} else {
			local23 = local19 = new Class20_Sub3(this.aClass14_Sub2_11, 0, 0, true, false);
		}
		return this.method5498(arg2, local19, arg0 != 0, local23, arg1);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Z")
	private boolean method5492() {
		if (this.aClass288_1.aBoolean552) {
			return true;
		}
		if (this.aClass288_1.anInterface23_6 == null) {
			this.aClass288_1.anInterface23_6 = this.aClass14_Sub2_11.method7005(this.aBoolean448);
		}
		@Pc(28) Interface23 local28 = this.aClass288_1.anInterface23_6;
		local28.method4092(this.anInt6424 * 6);
		@Pc(40) Buffer local40 = local28.method4095();
		if (local40 != null) {
			@Pc(54) Stream local54 = this.aClass14_Sub2_11.method6939(local40);
			@Pc(58) int local58;
			if (Stream.b()) {
				for (local58 = 0; local58 < this.anInt6424; local58++) {
					local54.c(this.aShortArray90[local58]);
					local54.c(this.aShortArray94[local58]);
					local54.c(this.aShortArray96[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt6424; local58++) {
					local54.a(this.aShortArray90[local58]);
					local54.a(this.aShortArray94[local58]);
					local54.a(this.aShortArray96[local58]);
				}
			}
			local54.c();
			if (local28.method4094()) {
				this.aClass288_1.aBoolean552 = true;
				this.aClass288_1.anInterface23_7 = local28;
				this.aBoolean447 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	private void method5493() {
		if ((this.anInt6430 & 0x37) == 0) {
			if (this.aClass65_2 != null) {
				this.aClass65_2.aBoolean122 = false;
			}
		} else if (this.aClass65_3 != null) {
			this.aClass65_3.aBoolean122 = false;
		}
	}

	@OriginalMember(owner = "client!og", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class6_Sub2_Sub14 Z(@OriginalArg(0) Class6_Sub2_Sub14 arg0) {
		if (this.anInt6443 == 0) {
			return null;
		}
		if (!this.aBoolean446) {
			this.method5503();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass14_Sub2_11.anInt8589 > 0) {
			local40 = this.anInt6429 - (this.anInt6467 * this.aClass14_Sub2_11.anInt8589 >> 8) >> this.aClass14_Sub2_11.anInt8591;
			local57 = this.anInt6406 - (this.anInt6466 * this.aClass14_Sub2_11.anInt8589 >> 8) >> this.aClass14_Sub2_11.anInt8591;
		} else {
			local40 = this.anInt6429 - (this.aClass14_Sub2_11.anInt8589 * this.anInt6466 >> 8) >> this.aClass14_Sub2_11.anInt8591;
			local57 = this.anInt6406 - (this.anInt6467 * this.aClass14_Sub2_11.anInt8589 >> 8) >> this.aClass14_Sub2_11.anInt8591;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass14_Sub2_11.anInt8580 > 0) {
			local116 = this.anInt6419 - (this.aClass14_Sub2_11.anInt8580 * this.anInt6467 >> 8) >> this.aClass14_Sub2_11.anInt8591;
			local133 = this.anInt6431 - (this.aClass14_Sub2_11.anInt8580 * this.anInt6466 >> 8) >> this.aClass14_Sub2_11.anInt8591;
		} else {
			local116 = this.anInt6419 - (this.anInt6466 * this.aClass14_Sub2_11.anInt8580 >> 8) >> this.aClass14_Sub2_11.anInt8591;
			local133 = this.anInt6431 - (this.aClass14_Sub2_11.anInt8580 * this.anInt6467 >> 8) >> this.aClass14_Sub2_11.anInt8591;
		}
		@Pc(176) int local176 = local57 + 1 - local40;
		@Pc(183) int local183 = local133 + 1 - local116;
		@Pc(186) Class6_Sub2_Sub14_Sub1 local186 = (Class6_Sub2_Sub14_Sub1) arg0;
		@Pc(196) Class6_Sub2_Sub14_Sub1 local196;
		if (local186 != null && local186.method5717(local183, local176)) {
			local196 = local186;
			local186.method5720();
		} else {
			local196 = new Class6_Sub2_Sub14_Sub1(this.aClass14_Sub2_11, local176, local183);
		}
		local196.method5718(local116, local133, local57, local40);
		this.method5489(local196);
		return local196;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	private void method5494() {
		if (this.aClass65_2 != null) {
			this.aClass65_2.aBoolean122 = false;
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
	private void method5495() {
		if (this.anInt6424 == 0) {
			return;
		}
		if (this.method5490() && this.method5492()) {
			this.aClass14_Sub2_11.method6994(0, this.aClass65_1.anInterface13_1);
			this.aClass14_Sub2_11.method6994(1, this.aClass65_2.anInterface13_1);
			this.aClass14_Sub2_11.method6994(2, this.aClass65_4.anInterface13_1);
			@Pc(56) boolean local56;
			if ((this.anInt6430 & 0x37) == 0) {
				local56 = false;
				this.aClass14_Sub2_11.method6947(false);
				this.aClass14_Sub2_11.method6944(this.aClass14_Sub2_11.aClass28_18);
			} else {
				local56 = true;
				this.aClass14_Sub2_11.method6947(true);
				this.aClass14_Sub2_11.method6994(3, this.aClass65_3.anInterface13_1);
				this.aClass14_Sub2_11.method6944(this.aClass14_Sub2_11.aClass28_20);
			}
			for (@Pc(98) int local98 = 0; local98 < this.anIntArray483.length; local98++) {
				@Pc(105) int local105 = this.anIntArray481[local98];
				@Pc(112) int local112 = this.anIntArray481[local98 + 1];
				@Pc(119) int local119 = this.aShortArray87[local105] & 0xFFFF;
				if (local119 == 65535) {
					local119 = -1;
				}
				this.aClass14_Sub2_11.method6981(local56, local119, true);
				this.aClass14_Sub2_11.method7026(local105 * 3, this.anIntArray483[local98], this.anIntArray480[local98], local112 - local105, Static181.aClass311_4, this.aClass288_1.anInterface23_7);
			}
		}
		this.method5487();
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	private void method5496() {
		if (this.aClass192Array1 == null) {
			return;
		}
		@Pc(16) float local16 = this.aClass14_Sub2_11.method6913();
		@Pc(20) float local20 = this.aClass14_Sub2_11.method6907();
		this.aClass14_Sub2_11.method6880(false);
		this.aClass14_Sub2_11.method6947(false);
		this.aClass14_Sub2_11.method6912(Static113.aClass138_2, 1);
		this.aClass14_Sub2_11.method6968(Static113.aClass138_2, 1);
		for (@Pc(43) int local43 = 0; local43 < this.anInt6440; local43++) {
			@Pc(50) Class192 local50 = this.aClass192Array1[local43];
			@Pc(55) Class214 local55 = this.aClass214Array1[local43];
			if (!local50.aBoolean381 || !this.aClass14_Sub2_11.method6887()) {
				@Pc(83) float local83 = (float) (this.anIntArray479[local50.anInt5353] + this.anIntArray479[local50.anInt5356] + this.anIntArray479[local50.anInt5351]) * 0.3333333F;
				@Pc(105) float local105 = (float) (this.anIntArray478[local50.anInt5356] + this.anIntArray478[local50.anInt5351] + this.anIntArray478[local50.anInt5353]) * 0.3333333F;
				@Pc(127) float local127 = (float) (this.anIntArray482[local50.anInt5351] + this.anIntArray482[local50.anInt5356] + this.anIntArray482[local50.anInt5353]) * 0.3333333F;
				@Pc(141) float local141 = local105 * Static81.aFloat20 + Static56.aFloat16 * local83 + local127 * Static470.aFloat11 + Static440.aFloat161;
				@Pc(155) float local155 = Static527.aFloat189 + Static135.aFloat64 * local83 + Static40.aFloat13 * local105 + local127 * Static81.aFloat21;
				@Pc(169) float local169 = local127 * Static497.aFloat165 + local105 * Static161.aFloat68 + Static503.aFloat166 * local83 + Static419.aFloat158;
				@Pc(174) Class54_Sub3 local174 = this.aClass14_Sub2_11.method7012();
				local174.method5451(local55.anInt5994 * local50.aShort63 >> 7, local169, local55.anInt5985, local155 + (float) local55.anInt5993, local55.anInt5988 * local50.aShort64 >> 7, local141 + (float) local55.anInt5982);
				local174.method5454(this.aClass14_Sub2_11.aClass54_Sub3_17);
				this.aClass14_Sub2_11.method7033();
				this.aClass14_Sub2_11.ka(local20, local16 - (float) local50.anInt5354 * 1.5F);
				@Pc(229) int local229 = local55.anInt5990;
				this.aClass14_Sub2_11.method6981(false, local50.aShort62, false);
				this.aClass14_Sub2_11.method6998(local50.aByte46);
				this.aClass14_Sub2_11.method7025(local229);
				this.aClass14_Sub2_11.method7019();
			}
		}
		this.aClass14_Sub2_11.method6968(Static457.aClass138_4, 1);
		this.aClass14_Sub2_11.method6912(Static457.aClass138_4, 1);
		this.aClass14_Sub2_11.ka(local20, local16);
		this.aClass14_Sub2_11.method6880(true);
	}

	@OriginalMember(owner = "client!og", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static51.anInt1125 = 0;
			Static499.anInt8327 = 0;
			local16 = 0;
			Static575.anInt9045 = 0;
			for (local20 = 0; local20 < this.anInt6413; local20++) {
				Static575.anInt9045 += this.anIntArray479[local20];
				Static51.anInt1125 += this.anIntArray478[local20];
				local16++;
				Static499.anInt8327 += this.anIntArray482[local20];
			}
			if (local16 > 0) {
				Static51.anInt1125 = arg2 + Static51.anInt1125 / local16;
				Static575.anInt9045 = Static575.anInt9045 / local16 + arg1;
				Static499.anInt8327 = Static499.anInt8327 / local16 + arg3;
			} else {
				Static51.anInt1125 = arg2;
				Static499.anInt8327 = arg3;
				Static575.anInt9045 = arg1;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt6413; local16++) {
				this.anIntArray479[local16] += arg1;
				this.anIntArray478[local16] += arg2;
				this.anIntArray482[local16] += arg3;
			}
		} else {
			@Pc(168) int local168;
			@Pc(186) int local186;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt6413; local16++) {
					this.anIntArray479[local16] -= Static575.anInt9045;
					this.anIntArray478[local16] -= Static51.anInt1125;
					this.anIntArray482[local16] -= Static499.anInt8327;
					if (arg3 != 0) {
						local20 = Class6_Sub2_Sub7.anIntArray178[arg3];
						local168 = Class6_Sub2_Sub7.anIntArray177[arg3];
						local186 = this.anIntArray479[local16] * local168 + local20 * this.anIntArray478[local16] + 16383 >> 14;
						this.anIntArray478[local16] = this.anIntArray478[local16] * local168 + 16383 - this.anIntArray479[local16] * local20 >> 14;
						this.anIntArray479[local16] = local186;
					}
					if (arg1 != 0) {
						local20 = Class6_Sub2_Sub7.anIntArray178[arg1];
						local168 = Class6_Sub2_Sub7.anIntArray177[arg1];
						local186 = local168 * this.anIntArray478[local16] + 16383 - local20 * this.anIntArray482[local16] >> 14;
						this.anIntArray482[local16] = this.anIntArray478[local16] * local20 + local168 * this.anIntArray482[local16] + 16383 >> 14;
						this.anIntArray478[local16] = local186;
					}
					if (arg2 != 0) {
						local20 = Class6_Sub2_Sub7.anIntArray178[arg2];
						local168 = Class6_Sub2_Sub7.anIntArray177[arg2];
						local186 = this.anIntArray482[local16] * local20 + this.anIntArray479[local16] * local168 + 16383 >> 14;
						this.anIntArray482[local16] = this.anIntArray482[local16] * local168 + 16383 - local20 * this.anIntArray479[local16] >> 14;
						this.anIntArray479[local16] = local186;
					}
					this.anIntArray479[local16] += Static575.anInt9045;
					this.anIntArray478[local16] += Static51.anInt1125;
					this.anIntArray482[local16] += Static499.anInt8327;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt6413; local16++) {
					this.anIntArray479[local16] -= Static575.anInt9045;
					this.anIntArray478[local16] -= Static51.anInt1125;
					this.anIntArray482[local16] -= Static499.anInt8327;
					this.anIntArray479[local16] = this.anIntArray479[local16] * arg1 / 128;
					this.anIntArray478[local16] = this.anIntArray478[local16] * arg2 / 128;
					this.anIntArray482[local16] = this.anIntArray482[local16] * arg3 / 128;
					this.anIntArray479[local16] += Static575.anInt9045;
					this.anIntArray478[local16] += Static51.anInt1125;
					this.anIntArray482[local16] += Static499.anInt8327;
				}
			} else {
				@Pc(514) Class192 local514;
				@Pc(519) Class214 local519;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt6414; local16++) {
						local20 = arg1 * 8 + (this.aByteArray80[local16] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray80[local16] = (byte) local20;
					}
					if (this.aClass192Array1 != null) {
						for (local20 = 0; local20 < this.anInt6440; local20++) {
							local514 = this.aClass192Array1[local20];
							local519 = this.aClass214Array1[local20];
							local519.anInt5990 = 255 - (this.aByteArray80[local514.anInt5355] & 0xFF) << 24 | local519.anInt5990 & 0xFFFFFF;
						}
					}
					this.method5494();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt6414; local16++) {
						local20 = this.aShortArray92[local16] & 0xFFFF;
						local168 = local20 >> 10 & 0x3F;
						local186 = local20 >> 7 & 0x7;
						local186 += arg2 / 4;
						@Pc(584) int local584 = arg1 + local168 & 0x3F;
						@Pc(588) int local588 = local20 & 0x7F;
						if (local186 < 0) {
							local186 = 0;
						} else if (local186 > 7) {
							local186 = 7;
						}
						local588 += arg3;
						if (local588 < 0) {
							local588 = 0;
						} else if (local588 > 127) {
							local588 = 127;
						}
						this.aShortArray92[local16] = (short) (local588 | local584 << 10 | local186 << 7);
					}
					if (this.aClass192Array1 != null) {
						for (local20 = 0; local20 < this.anInt6440; local20++) {
							local514 = this.aClass192Array1[local20];
							local519 = this.aClass214Array1[local20];
							local519.anInt5990 = Static171.anIntArray212[this.aShortArray92[local514.anInt5355] & 0xFFFF] & 0xFFFFFF | local519.anInt5990 & 0xFF000000;
						}
					}
					this.method5494();
				} else {
					@Pc(699) Class214 local699;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt6440; local16++) {
							local699 = this.aClass214Array1[local16];
							local699.anInt5982 += arg1;
							local699.anInt5993 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt6440; local16++) {
							local699 = this.aClass214Array1[local16];
							local699.anInt5994 = local699.anInt5994 * arg2 >> 7;
							local699.anInt5988 = arg1 * local699.anInt5988 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt6440; local16++) {
							local699 = this.aClass214Array1[local16];
							local699.anInt5985 = local699.anInt5985 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIIIIIIII)Z")
	private boolean method5497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg7 && arg1 < arg6 && arg1 < arg0) {
			return false;
		} else if (arg1 > arg7 && arg6 < arg1 && arg0 < arg1) {
			return false;
		} else if (arg3 < arg4 && arg5 > arg3 && arg3 < arg2) {
			return false;
		} else {
			return arg4 >= arg3 || arg5 >= arg3 || arg3 <= arg2;
		}
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt6410;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZBLclient!og;ZLclient!og;I)Lclient!ba;")
	private Class20 method5498(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class20_Sub3 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class20_Sub3 arg3, @OriginalArg(5) int arg4) {
		arg3.anInt6430 = this.anInt6430;
		arg3.anInt6414 = this.anInt6414;
		arg3.anInt6424 = this.anInt6424;
		arg3.anInt6432 = this.anInt6432;
		arg3.aShort85 = this.aShort85;
		arg3.anInt6440 = this.anInt6440;
		arg3.anInt6413 = this.anInt6413;
		arg3.anInt6410 = arg4;
		arg3.anInt6443 = this.anInt6443;
		arg3.aShort86 = this.aShort86;
		@Pc(50) boolean local50 = Static288.method4675(arg4, this.anInt6430);
		@Pc(56) boolean local56 = Static569.method7617(arg4, this.anInt6430);
		@Pc(62) boolean local62 = Static422.method6090(this.anInt6430, arg4);
		@Pc(68) boolean local68 = local56 | local50 | local62;
		@Pc(173) int local173;
		if (local68) {
			if (!local50) {
				arg3.anIntArray479 = this.anIntArray479;
			} else if (arg1.anIntArray479 == null || this.anInt6432 > arg1.anIntArray479.length) {
				arg3.anIntArray479 = arg1.anIntArray479 = new int[this.anInt6432];
			} else {
				arg3.anIntArray479 = arg1.anIntArray479;
			}
			if (!local56) {
				arg3.anIntArray478 = this.anIntArray478;
			} else if (arg1.anIntArray478 == null || arg1.anIntArray478.length < this.anInt6432) {
				arg3.anIntArray478 = arg1.anIntArray478 = new int[this.anInt6432];
			} else {
				arg3.anIntArray478 = arg1.anIntArray478;
			}
			if (!local62) {
				arg3.anIntArray482 = this.anIntArray482;
			} else if (arg1.anIntArray482 == null || this.anInt6432 > arg1.anIntArray482.length) {
				arg3.anIntArray482 = arg1.anIntArray482 = new int[this.anInt6432];
			} else {
				arg3.anIntArray482 = arg1.anIntArray482;
			}
			for (local173 = 0; local173 < this.anInt6432; local173++) {
				if (local50) {
					arg3.anIntArray479[local173] = this.anIntArray479[local173];
				}
				if (local56) {
					arg3.anIntArray478[local173] = this.anIntArray478[local173];
				}
				if (local62) {
					arg3.anIntArray482[local173] = this.anIntArray482[local173];
				}
			}
		} else {
			arg3.anIntArray482 = this.anIntArray482;
			arg3.anIntArray478 = this.anIntArray478;
			arg3.anIntArray479 = this.anIntArray479;
		}
		if (Static524.method7193(arg4, this.anInt6430)) {
			arg3.aClass65_1 = arg1.aClass65_1;
			arg3.aClass65_1.aBoolean122 = this.aClass65_1.aBoolean122;
			arg3.aClass65_1.aBoolean123 = true;
			arg3.aClass65_1.anInterface13_1 = this.aClass65_1.anInterface13_1;
		} else if (Static552.method7481(this.anInt6430, arg4)) {
			arg3.aClass65_1 = this.aClass65_1;
		} else {
			arg3.aClass65_1 = null;
		}
		if (Static273.method4514(arg4, this.anInt6430)) {
			if (arg1.aShortArray92 == null || this.anInt6414 > arg1.aShortArray92.length) {
				arg3.aShortArray92 = arg1.aShortArray92 = new short[this.anInt6414];
			} else {
				arg3.aShortArray92 = arg1.aShortArray92;
			}
			for (local173 = 0; local173 < this.anInt6414; local173++) {
				arg3.aShortArray92[local173] = this.aShortArray92[local173];
			}
		} else {
			arg3.aShortArray92 = this.aShortArray92;
		}
		if (Static185.method3397(this.anInt6430, arg4)) {
			if (arg1.aByteArray80 == null || arg1.aByteArray80.length < this.anInt6414) {
				arg3.aByteArray80 = arg1.aByteArray80 = new byte[this.anInt6414];
			} else {
				arg3.aByteArray80 = arg1.aByteArray80;
			}
			for (local173 = 0; local173 < this.anInt6414; local173++) {
				arg3.aByteArray80[local173] = this.aByteArray80[local173];
			}
		} else {
			arg3.aByteArray80 = this.aByteArray80;
		}
		if (Static515.method7130(this.anInt6430, arg4)) {
			arg3.aClass65_2 = arg1.aClass65_2;
			arg3.aClass65_2.anInterface13_1 = this.aClass65_2.anInterface13_1;
			arg3.aClass65_2.aBoolean123 = true;
			arg3.aClass65_2.aBoolean122 = this.aClass65_2.aBoolean122;
		} else if (Static99.method1793(this.anInt6430, arg4)) {
			arg3.aClass65_2 = this.aClass65_2;
		} else {
			arg3.aClass65_2 = null;
		}
		@Pc(597) int local597;
		if (Static294.method4725(arg4, this.anInt6430)) {
			if (arg1.aShortArray98 == null || this.anInt6443 > arg1.aShortArray98.length) {
				local173 = this.anInt6443;
				arg3.aShortArray89 = arg1.aShortArray89 = new short[local173];
				arg3.aShortArray97 = arg1.aShortArray97 = new short[local173];
				arg3.aShortArray98 = arg1.aShortArray98 = new short[local173];
			} else {
				arg3.aShortArray89 = arg1.aShortArray89;
				arg3.aShortArray97 = arg1.aShortArray97;
				arg3.aShortArray98 = arg1.aShortArray98;
			}
			if (this.aClass242_1 == null) {
				arg3.aClass242_1 = null;
				for (local173 = 0; local173 < this.anInt6443; local173++) {
					arg3.aShortArray98[local173] = this.aShortArray98[local173];
					arg3.aShortArray97[local173] = this.aShortArray97[local173];
					arg3.aShortArray89[local173] = this.aShortArray89[local173];
				}
			} else {
				if (arg1.aClass242_1 == null) {
					arg1.aClass242_1 = new Class242();
				}
				@Pc(581) Class242 local581 = arg3.aClass242_1 = arg1.aClass242_1;
				if (local581.aShortArray103 == null || this.anInt6443 > local581.aShortArray103.length) {
					local597 = this.anInt6443;
					local581.aByteArray84 = new byte[local597];
					local581.aShortArray104 = new short[local597];
					local581.aShortArray103 = new short[local597];
					local581.aShortArray105 = new short[local597];
				}
				for (local597 = 0; local597 < this.anInt6443; local597++) {
					arg3.aShortArray98[local597] = this.aShortArray98[local597];
					arg3.aShortArray97[local597] = this.aShortArray97[local597];
					arg3.aShortArray89[local597] = this.aShortArray89[local597];
					local581.aShortArray103[local597] = this.aClass242_1.aShortArray103[local597];
					local581.aShortArray104[local597] = this.aClass242_1.aShortArray104[local597];
					local581.aShortArray105[local597] = this.aClass242_1.aShortArray105[local597];
					local581.aByteArray84[local597] = this.aClass242_1.aByteArray84[local597];
				}
			}
			arg3.aByteArray81 = this.aByteArray81;
		} else {
			arg3.aByteArray81 = this.aByteArray81;
			arg3.aShortArray89 = this.aShortArray89;
			arg3.aShortArray97 = this.aShortArray97;
			arg3.aClass242_1 = this.aClass242_1;
			arg3.aShortArray98 = this.aShortArray98;
		}
		if (Static280.method4617(this.anInt6430, arg4)) {
			arg3.aClass65_3 = arg1.aClass65_3;
			arg3.aClass65_3.aBoolean123 = true;
			arg3.aClass65_3.anInterface13_1 = this.aClass65_3.anInterface13_1;
			arg3.aClass65_3.aBoolean122 = this.aClass65_3.aBoolean122;
		} else if (Static599.method7859(this.anInt6430, arg4)) {
			arg3.aClass65_3 = this.aClass65_3;
		} else {
			arg3.aClass65_3 = null;
		}
		if (Static160.method2952(this.anInt6430, arg4)) {
			if (arg1.lb == null || arg1.lb.length < this.anInt6414) {
				local173 = this.anInt6443;
				arg3.aFloatArray53 = arg1.aFloatArray53 = new float[local173];
				arg3.lb = arg1.lb = new float[local173];
			} else {
				arg3.lb = arg1.lb;
				arg3.aFloatArray53 = arg1.aFloatArray53;
			}
			for (local173 = 0; local173 < this.anInt6443; local173++) {
				arg3.lb[local173] = this.lb[local173];
				arg3.aFloatArray53[local173] = this.aFloatArray53[local173];
			}
		} else {
			arg3.lb = this.lb;
			arg3.aFloatArray53 = this.aFloatArray53;
		}
		if (Static569.method7618(this.anInt6430, arg4)) {
			arg3.aClass65_4 = arg1.aClass65_4;
			arg3.aClass65_4.aBoolean122 = this.aClass65_4.aBoolean122;
			arg3.aClass65_4.aBoolean123 = true;
			arg3.aClass65_4.anInterface13_1 = this.aClass65_4.anInterface13_1;
		} else if (Static195.method3543(this.anInt6430, arg4)) {
			arg3.aClass65_4 = this.aClass65_4;
		} else {
			arg3.aClass65_4 = null;
		}
		if (Static421.method6084(this.anInt6430, arg4)) {
			if (arg1.aShortArray90 == null || arg1.aShortArray90.length < this.anInt6414) {
				local173 = this.anInt6414;
				arg3.aShortArray96 = arg1.aShortArray96 = new short[local173];
				arg3.aShortArray94 = arg1.aShortArray94 = new short[local173];
				arg3.aShortArray90 = arg1.aShortArray90 = new short[local173];
			} else {
				arg3.aShortArray96 = arg1.aShortArray96;
				arg3.aShortArray94 = arg1.aShortArray94;
				arg3.aShortArray90 = arg1.aShortArray90;
			}
			for (local173 = 0; local173 < this.anInt6414; local173++) {
				arg3.aShortArray90[local173] = this.aShortArray90[local173];
				arg3.aShortArray94[local173] = this.aShortArray94[local173];
				arg3.aShortArray96[local173] = this.aShortArray96[local173];
			}
		} else {
			arg3.aShortArray94 = this.aShortArray94;
			arg3.aShortArray96 = this.aShortArray96;
			arg3.aShortArray90 = this.aShortArray90;
		}
		if (Static414.method5967(this.anInt6430, arg4)) {
			arg3.aClass288_1 = arg1.aClass288_1;
			arg3.aClass288_1.aBoolean552 = this.aClass288_1.aBoolean552;
			arg3.aClass288_1.aBoolean551 = true;
			arg3.aClass288_1.anInterface23_7 = this.aClass288_1.anInterface23_7;
		} else if (Static472.method6557(arg4, this.anInt6430)) {
			arg3.aClass288_1 = this.aClass288_1;
		} else {
			arg3.aClass288_1 = null;
		}
		if (Static256.method4327(arg4, this.anInt6430)) {
			if (arg1.aShortArray87 == null || this.anInt6414 > arg1.aShortArray87.length) {
				local173 = this.anInt6414;
				arg3.aShortArray87 = arg1.aShortArray87 = new short[local173];
			} else {
				arg3.aShortArray87 = arg1.aShortArray87;
			}
			for (local173 = 0; local173 < this.anInt6414; local173++) {
				arg3.aShortArray87[local173] = this.aShortArray87[local173];
			}
		} else {
			arg3.aShortArray87 = this.aShortArray87;
		}
		if (!Static490.method6711(arg4, this.anInt6430)) {
			arg3.aClass214Array1 = this.aClass214Array1;
		} else if (arg1.aClass214Array1 == null || this.anInt6440 > arg1.aClass214Array1.length) {
			local173 = this.anInt6440;
			arg3.aClass214Array1 = arg1.aClass214Array1 = new Class214[local173];
			for (local597 = 0; local597 < this.anInt6440; local597++) {
				arg3.aClass214Array1[local597] = this.aClass214Array1[local597].method5143();
			}
		} else {
			arg3.aClass214Array1 = arg1.aClass214Array1;
			for (local173 = 0; local173 < this.anInt6440; local173++) {
				arg3.aClass214Array1[local173].method5142(this.aClass214Array1[local173]);
			}
		}
		arg3.anIntArrayArray60 = this.anIntArrayArray60;
		arg3.aShortArray88 = this.aShortArray88;
		arg3.anIntArray480 = this.anIntArray480;
		arg3.aShortArray93 = this.aShortArray93;
		arg3.anIntArray483 = this.anIntArray483;
		arg3.aClass192Array1 = this.aClass192Array1;
		arg3.aClass90Array6 = this.aClass90Array6;
		arg3.aShortArray95 = this.aShortArray95;
		arg3.anIntArrayArray59 = this.anIntArrayArray59;
		arg3.anIntArray484 = this.anIntArray484;
		arg3.aShortArray91 = this.aShortArray91;
		if (this.aBoolean446) {
			arg3.anInt6467 = this.anInt6467;
			arg3.anInt6419 = this.anInt6419;
			arg3.aBoolean446 = true;
			arg3.anInt6429 = this.anInt6429;
			arg3.anInt6431 = this.anInt6431;
			arg3.anInt6447 = this.anInt6447;
			arg3.anInt6466 = this.anInt6466;
			arg3.anInt6406 = this.anInt6406;
		} else {
			arg3.aBoolean446 = false;
		}
		arg3.aClass85Array6 = this.aClass85Array6;
		arg3.anIntArray481 = this.anIntArray481;
		arg3.aShortArray86 = this.aShortArray86;
		arg3.anIntArrayArray61 = this.anIntArrayArray61;
		return arg3;
	}

	@OriginalMember(owner = "client!og", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort85;
	}

	@OriginalMember(owner = "client!og", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6413; local3++) {
			if (arg0 != 0) {
				this.anIntArray479[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray478[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray482[local3] += arg2;
			}
		}
		this.method5491();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!og", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			Static499.anInt8327 = 0;
			local29 = 0;
			Static575.anInt9045 = 0;
			Static51.anInt1125 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray61.length) {
					local55 = this.anIntArrayArray61[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static575.anInt9045 += this.anIntArray479[local63];
						Static51.anInt1125 += this.anIntArray478[local63];
						Static499.anInt8327 += this.anIntArray482[local63];
						local29++;
					}
				}
			}
			if (local29 > 0) {
				Static575.anInt9045 = local25 + Static575.anInt9045 / local29;
				Static51.anInt1125 = Static51.anInt1125 / local29 + local21;
				Static499.anInt8327 = local17 + Static499.anInt8327 / local29;
			} else {
				Static51.anInt1125 = local21;
				Static575.anInt9045 = local25;
				Static499.anInt8327 = local17;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local21 = arg3 << 4;
			local17 = arg4 << 4;
			local25 = arg2 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray61.length > local35) {
					local162 = this.anIntArrayArray61[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local57 = local162[local164];
						this.anIntArray479[local57] += local25;
						this.anIntArray478[local57] += local21;
						this.anIntArray482[local57] += local17;
					}
				}
			}
			return;
		}
		@Pc(287) int local287;
		@Pc(305) int local305;
		@Pc(765) int local765;
		@Pc(774) int local774;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray61.length) {
					local162 = this.anIntArrayArray61[local35];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local57 = local162[local164];
							this.anIntArray479[local57] -= Static575.anInt9045;
							this.anIntArray478[local57] -= Static51.anInt1125;
							this.anIntArray482[local57] -= Static499.anInt8327;
							if (arg4 != 0) {
								local63 = Class6_Sub2_Sub7.anIntArray178[arg4];
								local287 = Class6_Sub2_Sub7.anIntArray177[arg4];
								local305 = this.anIntArray479[local57] * local287 + local63 * this.anIntArray478[local57] + 16383 >> 14;
								this.anIntArray478[local57] = local287 * this.anIntArray478[local57] + 16383 - this.anIntArray479[local57] * local63 >> 14;
								this.anIntArray479[local57] = local305;
							}
							if (arg2 != 0) {
								local63 = Class6_Sub2_Sub7.anIntArray178[arg2];
								local287 = Class6_Sub2_Sub7.anIntArray177[arg2];
								local305 = this.anIntArray478[local57] * local287 + 16383 - local63 * this.anIntArray482[local57] >> 14;
								this.anIntArray482[local57] = local63 * this.anIntArray478[local57] + local287 * this.anIntArray482[local57] + 16383 >> 14;
								this.anIntArray478[local57] = local305;
							}
							if (arg3 != 0) {
								local63 = Class6_Sub2_Sub7.anIntArray178[arg3];
								local287 = Class6_Sub2_Sub7.anIntArray177[arg3];
								local305 = this.anIntArray479[local57] * local287 + local63 * this.anIntArray482[local57] + 16383 >> 14;
								this.anIntArray482[local57] = this.anIntArray482[local57] * local287 + 16383 - this.anIntArray479[local57] * local63 >> 14;
								this.anIntArray479[local57] = local305;
							}
							this.anIntArray479[local57] += Static575.anInt9045;
							this.anIntArray478[local57] += Static51.anInt1125;
							this.anIntArray482[local57] += Static499.anInt8327;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local57 = local162[local164];
							this.anIntArray479[local57] -= Static575.anInt9045;
							this.anIntArray478[local57] -= Static51.anInt1125;
							this.anIntArray482[local57] -= Static499.anInt8327;
							if (arg2 != 0) {
								local63 = Class6_Sub2_Sub7.anIntArray178[arg2];
								local287 = Class6_Sub2_Sub7.anIntArray177[arg2];
								local305 = local287 * this.anIntArray478[local57] + 16383 - local63 * this.anIntArray482[local57] >> 14;
								this.anIntArray482[local57] = local287 * this.anIntArray482[local57] + local63 * this.anIntArray478[local57] + 16383 >> 14;
								this.anIntArray478[local57] = local305;
							}
							if (arg4 != 0) {
								local63 = Class6_Sub2_Sub7.anIntArray178[arg4];
								local287 = Class6_Sub2_Sub7.anIntArray177[arg4];
								local305 = local63 * this.anIntArray478[local57] + this.anIntArray479[local57] * local287 + 16383 >> 14;
								this.anIntArray478[local57] = local287 * this.anIntArray478[local57] + 16383 - local63 * this.anIntArray479[local57] >> 14;
								this.anIntArray479[local57] = local305;
							}
							if (arg3 != 0) {
								local63 = Class6_Sub2_Sub7.anIntArray178[arg3];
								local287 = Class6_Sub2_Sub7.anIntArray177[arg3];
								local305 = local63 * this.anIntArray482[local57] + this.anIntArray479[local57] * local287 + 16383 >> 14;
								this.anIntArray482[local57] = local287 * this.anIntArray482[local57] + 16383 - this.anIntArray479[local57] * local63 >> 14;
								this.anIntArray479[local57] = local305;
							}
							this.anIntArray479[local57] += Static575.anInt9045;
							this.anIntArray478[local57] += Static51.anInt1125;
							this.anIntArray482[local57] += Static499.anInt8327;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray61.length > local41) {
						local55 = this.anIntArrayArray61[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local287 = this.anIntArray484[local63];
							local305 = this.anIntArray484[local63 + 1];
							for (local765 = local287; local765 < local305; local765++) {
								local774 = this.aShortArray88[local765] - 1;
								if (local774 == -1) {
									break;
								}
								@Pc(787) int local787;
								@Pc(791) int local791;
								@Pc(809) int local809;
								if (arg4 != 0) {
									local787 = Class6_Sub2_Sub7.anIntArray178[arg4];
									local791 = Class6_Sub2_Sub7.anIntArray177[arg4];
									local809 = local787 * this.aShortArray97[local774] + local791 * this.aShortArray98[local774] + 16383 >> 14;
									this.aShortArray97[local774] = (short) (local791 * this.aShortArray97[local774] + 16383 - local787 * this.aShortArray98[local774] >> 14);
									this.aShortArray98[local774] = (short) local809;
								}
								if (arg2 != 0) {
									local787 = Class6_Sub2_Sub7.anIntArray178[arg2];
									local791 = Class6_Sub2_Sub7.anIntArray177[arg2];
									local809 = local791 * this.aShortArray97[local774] + 16383 - this.aShortArray89[local774] * local787 >> 14;
									this.aShortArray89[local774] = (short) (local791 * this.aShortArray89[local774] + this.aShortArray97[local774] * local787 + 16383 >> 14);
									this.aShortArray97[local774] = (short) local809;
								}
								if (arg3 != 0) {
									local787 = Class6_Sub2_Sub7.anIntArray178[arg3];
									local791 = Class6_Sub2_Sub7.anIntArray177[arg3];
									local809 = local791 * this.aShortArray98[local774] + local787 * this.aShortArray89[local774] + 16383 >> 14;
									this.aShortArray89[local774] = (short) (local791 * this.aShortArray89[local774] + 16383 - this.aShortArray98[local774] * local787 >> 14);
									this.aShortArray98[local774] = (short) local809;
								}
							}
						}
					}
				}
				this.method5493();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray61.length) {
					local162 = this.anIntArrayArray61[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local57 = local162[local164];
						this.anIntArray479[local57] -= Static575.anInt9045;
						this.anIntArray478[local57] -= Static51.anInt1125;
						this.anIntArray482[local57] -= Static499.anInt8327;
						this.anIntArray479[local57] = arg2 * this.anIntArray479[local57] >> 7;
						this.anIntArray478[local57] = this.anIntArray478[local57] * arg3 >> 7;
						this.anIntArray482[local57] = this.anIntArray482[local57] * arg4 >> 7;
						this.anIntArray479[local57] += Static575.anInt9045;
						this.anIntArray478[local57] += Static51.anInt1125;
						this.anIntArray482[local57] += Static499.anInt8327;
					}
				}
			}
		} else {
			@Pc(1218) Class214 local1218;
			@Pc(1120) boolean local1120;
			@Pc(1213) Class192 local1213;
			if (arg0 == 5) {
				if (this.anIntArrayArray60 != null) {
					local1120 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray60.length > local41) {
							local55 = this.anIntArrayArray60[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local287 = arg2 * 8 + (this.aByteArray80[local63] & 0xFF);
								if (local287 < 0) {
									local287 = 0;
								} else if (local287 > 255) {
									local287 = 255;
								}
								this.aByteArray80[local63] = (byte) local287;
							}
							local1120 |= local55.length > 0;
						}
					}
					if (local1120) {
						if (this.aClass192Array1 != null) {
							for (local41 = 0; local41 < this.anInt6440; local41++) {
								local1213 = this.aClass192Array1[local41];
								local1218 = this.aClass214Array1[local41];
								local1218.anInt5990 = 255 - (this.aByteArray80[local1213.anInt5355] & 0xFF) << 24 | local1218.anInt5990 & 0xFFFFFF;
							}
						}
						this.method5494();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray60 != null) {
					local1120 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray60.length) {
							local55 = this.anIntArrayArray60[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local287 = this.aShortArray92[local63] & 0xFFFF;
								local305 = local287 >> 10 & 0x3F;
								local765 = local287 >> 7 & 0x7;
								local765 += arg3 / 4;
								local774 = local287 & 0x7F;
								@Pc(1319) int local1319 = local305 + arg2 & 0x3F;
								if (local765 < 0) {
									local765 = 0;
								} else if (local765 > 7) {
									local765 = 7;
								}
								local774 += arg4;
								if (local774 < 0) {
									local774 = 0;
								} else if (local774 > 127) {
									local774 = 127;
								}
								this.aShortArray92[local63] = (short) (local765 << 7 | local1319 << 10 | local774);
							}
							local1120 |= local55.length > 0;
						}
					}
					if (local1120) {
						if (this.aClass192Array1 != null) {
							for (local41 = 0; local41 < this.anInt6440; local41++) {
								local1213 = this.aClass192Array1[local41];
								local1218 = this.aClass214Array1[local41];
								local1218.anInt5990 = local1218.anInt5990 & 0xFF000000 | Static171.anIntArray212[this.aShortArray92[local1213.anInt5355] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method5494();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray59 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray59.length > local35) {
							local162 = this.anIntArrayArray59[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1218 = this.aClass214Array1[local162[local164]];
								local1218.anInt5982 += arg2;
								local1218.anInt5993 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray59 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray59.length > local35) {
							local162 = this.anIntArrayArray59[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1218 = this.aClass214Array1[local162[local164]];
								local1218.anInt5994 = arg3 * local1218.anInt5994 >> 7;
								local1218.anInt5988 = arg2 * local1218.anInt5988 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray59 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray59.length > local35) {
						local162 = this.anIntArrayArray59[local35];
						for (local164 = 0; local164 < local162.length; local164++) {
							local1218 = this.aClass214Array1[local162[local164]];
							local1218.anInt5985 = arg2 + local1218.anInt5985 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub7.anIntArray178[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub7.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6413; local15++) {
			@Pc(33) int local33 = this.anIntArray479[local15] * local13 + local9 * this.anIntArray482[local15] >> 14;
			this.anIntArray482[local15] = local13 * this.anIntArray482[local15] - local9 * this.anIntArray479[local15] >> 14;
			this.anIntArray479[local15] = local33;
		}
		this.method5491();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "()[Lclient!fd;")
	@Override
	public Class90[] method7261() {
		return this.aClass90Array6;
	}

	@OriginalMember(owner = "client!og", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort86;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "()[Lclient!et;")
	@Override
	public Class85[] method7267() {
		return this.aClass85Array6;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!q;Lclient!po;I)V")
	@Override
	public void method7256(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class98_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6443 == 0) {
			return;
		}
		@Pc(13) Class54_Sub3 local13 = this.aClass14_Sub2_11.aClass54_Sub3_16;
		@Pc(16) Class54_Sub3 local16 = (Class54_Sub3) arg0;
		if (!this.aBoolean446) {
			this.method5503();
		}
		Static419.aFloat158 = local13.aFloat154 + local13.aFloat150 * local16.aFloat149 + local16.aFloat145 * local13.aFloat146 + local16.aFloat154 * local13.aFloat148;
		Static161.aFloat68 = local16.aFloat150 * local13.aFloat148 + local16.aFloat143 * local13.aFloat146 + local16.aFloat152 * local13.aFloat150;
		@Pc(69) float local69 = (float) this.anInt6466 * Static161.aFloat68 + Static419.aFloat158;
		@Pc(77) float local77 = Static161.aFloat68 * (float) this.anInt6467 + Static419.aFloat158;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local94 = local69 + (float) this.anInt6447;
			local88 = (float) -this.anInt6447 + local77;
		} else {
			local88 = (float) -this.anInt6447 + local69;
			local94 = local77 + (float) this.anInt6447;
		}
		if (this.aClass14_Sub2_11.aFloat180 <= local88 || local94 <= (float) this.aClass14_Sub2_11.anInt8584) {
			return;
		}
		Static440.aFloat161 = local13.aFloat145 + local13.aFloat147 * local16.aFloat154 + local13.aFloat144 * local16.aFloat145 + local13.aFloat143 * local16.aFloat149;
		Static81.aFloat20 = local16.aFloat150 * local13.aFloat147 + local13.aFloat143 * local16.aFloat152 + local13.aFloat144 * local16.aFloat143;
		@Pc(171) float local171 = Static440.aFloat161 + Static81.aFloat20 * (float) this.anInt6466;
		@Pc(179) float local179 = Static440.aFloat161 + (float) this.anInt6467 * Static81.aFloat20;
		@Pc(205) float local205;
		@Pc(194) float local194;
		if (local171 > local179) {
			local194 = (local171 + (float) this.anInt6447) * (float) this.aClass14_Sub2_11.anInt8603;
			local205 = (local179 - (float) this.anInt6447) * (float) this.aClass14_Sub2_11.anInt8603;
		} else {
			local205 = ((float) -this.anInt6447 + local171) * (float) this.aClass14_Sub2_11.anInt8603;
			local194 = ((float) this.anInt6447 + local179) * (float) this.aClass14_Sub2_11.anInt8603;
		}
		if (local205 / local94 >= this.aClass14_Sub2_11.aFloat174 || local194 / local94 <= this.aClass14_Sub2_11.aFloat171) {
			return;
		}
		Static40.aFloat13 = local13.aFloat153 * local16.aFloat150 + local13.aFloat151 * local16.aFloat143 + local13.aFloat152 * local16.aFloat152;
		Static527.aFloat189 = local13.aFloat149 + local16.aFloat154 * local13.aFloat153 + local13.aFloat152 * local16.aFloat149 + local13.aFloat151 * local16.aFloat145;
		@Pc(295) float local295 = Static527.aFloat189 + (float) this.anInt6466 * Static40.aFloat13;
		@Pc(303) float local303 = (float) this.anInt6467 * Static40.aFloat13 + Static527.aFloat189;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local295 > local303) {
			local318 = (float) this.aClass14_Sub2_11.anInt8609 * (local295 + (float) this.anInt6447);
			local330 = ((float) -this.anInt6447 + local303) * (float) this.aClass14_Sub2_11.anInt8609;
		} else {
			local330 = (local295 - (float) this.anInt6447) * (float) this.aClass14_Sub2_11.anInt8609;
			local318 = ((float) this.anInt6447 + local303) * (float) this.aClass14_Sub2_11.anInt8609;
		}
		if (this.aClass14_Sub2_11.aFloat168 <= local330 / local94 || local318 / local94 <= this.aClass14_Sub2_11.aFloat184) {
			return;
		}
		if (arg1 != null || this.aClass192Array1 != null) {
			Static81.aFloat21 = local16.aFloat147 * local13.aFloat151 + local16.aFloat153 * local13.aFloat152 + local16.aFloat148 * local13.aFloat153;
			Static56.aFloat16 = local13.aFloat144 * local16.aFloat144 + local16.aFloat151 * local13.aFloat143 + local13.aFloat147 * local16.aFloat146;
			Static470.aFloat11 = local16.aFloat147 * local13.aFloat144 + local16.aFloat153 * local13.aFloat143 + local13.aFloat147 * local16.aFloat148;
			Static503.aFloat166 = local13.aFloat148 * local16.aFloat146 + local13.aFloat150 * local16.aFloat151 + local13.aFloat146 * local16.aFloat144;
			Static135.aFloat64 = local16.aFloat146 * local13.aFloat153 + local13.aFloat151 * local16.aFloat144 + local16.aFloat151 * local13.aFloat152;
			Static497.aFloat165 = local16.aFloat147 * local13.aFloat146 + local13.aFloat150 * local16.aFloat153 + local16.aFloat148 * local13.aFloat148;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(500) int local500 = this.anInt6429 + this.anInt6406 >> 1;
			@Pc(509) int local509 = this.anInt6419 + this.anInt6431 >> 1;
			@Pc(528) int local528 = (int) (Static470.aFloat11 * (float) local509 + Static440.aFloat161 + (float) local500 * Static56.aFloat16 + (float) this.anInt6466 * Static81.aFloat20);
			@Pc(547) int local547 = (int) (Static81.aFloat21 * (float) local509 + (float) local500 * Static135.aFloat64 + Static527.aFloat189 + Static40.aFloat13 * (float) this.anInt6466);
			@Pc(566) int local566 = (int) ((float) local509 * Static497.aFloat165 + Static503.aFloat166 * (float) local500 + Static419.aFloat158 + Static161.aFloat68 * (float) this.anInt6466);
			if (local566 < this.aClass14_Sub2_11.anInt8584) {
				local489 = true;
			} else {
				arg1.anInt7042 = this.aClass14_Sub2_11.anInt8617 + local528 * this.aClass14_Sub2_11.anInt8603 / local566;
				arg1.anInt7044 = this.aClass14_Sub2_11.anInt8609 * local547 / local566 + this.aClass14_Sub2_11.anInt8597;
			}
			@Pc(620) int local620 = (int) ((float) local509 * Static470.aFloat11 + (float) this.anInt6467 * Static81.aFloat20 + Static56.aFloat16 * (float) local500 + Static440.aFloat161);
			@Pc(639) int local639 = (int) (Static81.aFloat21 * (float) local509 + Static527.aFloat189 + (float) local500 * Static135.aFloat64 + (float) this.anInt6467 * Static40.aFloat13);
			@Pc(658) int local658 = (int) (Static419.aFloat158 + (float) local500 * Static503.aFloat166 + Static161.aFloat68 * (float) this.anInt6467 + Static497.aFloat165 * (float) local509);
			if (local658 >= this.aClass14_Sub2_11.anInt8584) {
				arg1.anInt7045 = this.aClass14_Sub2_11.anInt8597 + this.aClass14_Sub2_11.anInt8609 * local639 / local658;
				arg1.anInt7043 = this.aClass14_Sub2_11.anInt8617 + local620 * this.aClass14_Sub2_11.anInt8603 / local658;
			} else {
				local489 = true;
			}
			if (local489) {
				if (local566 < this.aClass14_Sub2_11.anInt8584 && local658 < this.aClass14_Sub2_11.anInt8584) {
					local491 = false;
				} else {
					@Pc(727) int local727;
					@Pc(737) int local737;
					@Pc(747) int local747;
					if (local566 < this.aClass14_Sub2_11.anInt8584) {
						local727 = (local658 - this.aClass14_Sub2_11.anInt8584 << 16) / (local658 - local566);
						local737 = ((local620 - local528) * local727 >> 16) + local620;
						local747 = ((local639 - local547) * local727 >> 16) + local639;
						arg1.anInt7042 = this.aClass14_Sub2_11.anInt8617 + local737 * this.aClass14_Sub2_11.anInt8603 / this.aClass14_Sub2_11.anInt8584;
						arg1.anInt7044 = this.aClass14_Sub2_11.anInt8609 * local747 / this.aClass14_Sub2_11.anInt8584 + this.aClass14_Sub2_11.anInt8597;
					} else if (this.aClass14_Sub2_11.anInt8584 > local658) {
						local727 = (local566 - this.aClass14_Sub2_11.anInt8584 << 16) / (local566 - local658);
						local737 = (local727 * (local528 - local620) >> 16) + local528;
						local747 = ((local547 - local639) * local727 >> 16) + local547;
						arg1.anInt7042 = this.aClass14_Sub2_11.anInt8617 + local737 * this.aClass14_Sub2_11.anInt8603 / this.aClass14_Sub2_11.anInt8584;
						arg1.anInt7044 = this.aClass14_Sub2_11.anInt8597 + local747 * this.aClass14_Sub2_11.anInt8609 / this.aClass14_Sub2_11.anInt8584;
					}
				}
			}
			if (local491) {
				if (local566 > local658) {
					arg1.anInt7041 = (this.anInt6447 + local528) * this.aClass14_Sub2_11.anInt8603 / local566 + this.aClass14_Sub2_11.anInt8617 - arg1.anInt7042;
				} else {
					arg1.anInt7041 = this.aClass14_Sub2_11.anInt8617 + this.aClass14_Sub2_11.anInt8603 * (local620 + this.anInt6447) / local658 - arg1.anInt7043;
				}
				arg1.aBoolean491 = true;
			}
		}
		this.aClass14_Sub2_11.method7032();
		this.aClass14_Sub2_11.method7017(local16);
		this.method5495();
		this.method5496();
	}

	@OriginalMember(owner = "client!og", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub7.anIntArray178[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub7.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6413; local15++) {
			@Pc(34) int local34 = this.anIntArray478[local15] * local9 + local13 * this.anIntArray479[local15] >> 14;
			this.anIntArray478[local15] = local13 * this.anIntArray478[local15] - this.anIntArray479[local15] * local9 >> 14;
			this.anIntArray479[local15] = local34;
		}
		this.method5491();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IFILclient!nj;JIIIIIF)S")
	private short method5499(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class220 arg3, @OriginalArg(4) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray484[arg2];
		@Pc(17) int local17 = this.anIntArray484[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(27) int local27 = local10; local27 < local17; local27++) {
			@Pc(34) short local34 = this.aShortArray88[local27];
			if (local34 == 0) {
				local19 = local27;
				break;
			}
			if (Static70.aLongArray10[local27] == arg4) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray88[local19] = (short) (this.anInt6443 + 1);
		Static70.aLongArray10[local19] = arg4;
		this.aShortArray91[this.anInt6443] = (short) arg8;
		this.aShortArray95[this.anInt6443] = (short) arg2;
		this.aShortArray98[this.anInt6443] = (short) arg6;
		this.aShortArray97[this.anInt6443] = (short) arg5;
		this.aShortArray89[this.anInt6443] = (short) arg7;
		this.aByteArray81[this.anInt6443] = (byte) arg0;
		this.lb[this.anInt6443] = arg9;
		this.aFloatArray53[this.anInt6443] = arg1;
		return (short) this.anInt6443++;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
	public void method5500() {
		if (this.aClass65_1 != null) {
			this.aClass65_1.method1646();
		}
		if (this.aClass65_4 != null) {
			this.aClass65_4.method1646();
		}
		if (this.aClass65_2 != null) {
			this.aClass65_2.method1646();
		}
		if (this.aClass65_3 != null) {
			this.aClass65_3.method1646();
		}
		if (this.aClass288_1 != null) {
			this.aClass288_1.method6408();
		}
	}

	@OriginalMember(owner = "client!og", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6413; local7++) {
			if (arg0 != 128) {
				this.anIntArray479[local7] = this.anIntArray479[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray478[local7] = this.anIntArray478[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray482[local7] = this.anIntArray482[local7] * arg2 >> 7;
			}
		}
		this.method5491();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!og", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean446) {
			this.method5503();
		}
		return this.anInt6431;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(B)V")
	private void method5501() {
		if (this.aClass288_1 != null) {
			this.aClass288_1.aBoolean552 = false;
		}
	}

	@OriginalMember(owner = "client!og", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean446) {
			this.method5503();
		}
		return this.anInt6419;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "()V")
	@Override
	public void method7271() {
		if (this.anInt6443 > 0 && this.anInt6424 > 0) {
			this.method5490();
			this.method5492();
			this.method5487();
		}
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
	private void method5503() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt6413; local29++) {
			@Pc(36) int local36 = this.anIntArray479[local29];
			@Pc(41) int local41 = this.anIntArray478[local29];
			if (local36 < local7) {
				local7 = local36;
			}
			if (local41 < local9) {
				local9 = local41;
			}
			if (local21 < local41) {
				local21 = local41;
			}
			@Pc(69) int local69 = this.anIntArray482[local29];
			if (local36 > local19) {
				local19 = local36;
			}
			if (local69 > local23) {
				local23 = local69;
			}
			if (local11 > local69) {
				local11 = local69;
			}
			@Pc(97) int local97 = local36 * local36 + local69 * local69;
			if (local97 > local25) {
				local25 = local97;
			}
			local97 = local41 * local41 + local69 * local69 + local36 * local36;
			if (local27 < local97) {
				local27 = local97;
			}
		}
		this.anInt6419 = local11;
		this.anInt6431 = local23;
		this.anInt6466 = local9;
		this.anInt6467 = local21;
		this.anInt6406 = local19;
		this.anInt6429 = local7;
		this.anInt6447 = (int) (Math.sqrt((double) local25) + 0.99D);
		Math.sqrt((double) local27);
		this.aBoolean446 = true;
	}

	@OriginalMember(owner = "client!og", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6414; local3++) {
			if (this.aShortArray92[local3] == arg0) {
				this.aShortArray92[local3] = arg1;
			}
		}
		if (this.aClass192Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt6440; local34++) {
				@Pc(41) Class192 local41 = this.aClass192Array1[local34];
				@Pc(46) Class214 local46 = this.aClass214Array1[local34];
				local46.anInt5990 = local46.anInt5990 & 0xFF000000 | Static171.anIntArray212[this.aShortArray92[local41.anInt5355] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5494();
	}

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray61 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6432; local12++) {
			this.anIntArray479[local12] <<= 0x4;
			this.anIntArray478[local12] <<= 0x4;
			this.anIntArray482[local12] <<= 0x4;
		}
		Static575.anInt9045 = 0;
		Static51.anInt1125 = 0;
		Static499.anInt8327 = 0;
		return true;
	}

	@OriginalMember(owner = "client!og", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static51.anInt1125 = 0;
			local26 = 0;
			Static575.anInt9045 = 0;
			Static499.anInt8327 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray61.length) {
					local48 = this.anIntArrayArray61[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray86 == null || (this.aShortArray86[local56] & arg6) != 0) {
							Static575.anInt9045 += this.anIntArray479[local56];
							Static51.anInt1125 += this.anIntArray478[local56];
							Static499.anInt8327 += this.anIntArray482[local56];
							local26++;
						}
					}
				}
			}
			if (local26 <= 0) {
				Static575.anInt9045 = arg2;
				Static499.anInt8327 = arg4;
				Static51.anInt1125 = arg3;
			} else {
				Static575.anInt9045 = Static575.anInt9045 / local26 + arg2;
				Static51.anInt1125 = Static51.anInt1125 / local26 + arg3;
				Static471.aBoolean451 = true;
				Static499.anInt8327 = arg4 + Static499.anInt8327 / local26;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg4 * arg7[2] + arg7[1] * arg3 + arg2 * arg7[0] + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg7[4] * arg3 + arg2 * arg7[3] + 8192 >> 14;
				local38 = arg2 * arg7[6] + arg3 * arg7[7] + arg7[8] * arg4 + 8192 >> 14;
				arg4 = local38;
				arg3 = local32;
				arg2 = local26;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray61.length > local32) {
					local248 = this.anIntArrayArray61[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray86 == null || (this.aShortArray86[local50] & arg6) != 0) {
							this.anIntArray479[local50] += arg2;
							this.anIntArray478[local50] += arg3;
							this.anIntArray482[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(378) int local378;
		@Pc(396) int local396;
		@Pc(632) int local632;
		@Pc(641) int local641;
		@Pc(651) int local651;
		@Pc(655) int local655;
		@Pc(673) int local673;
		@Pc(1005) int local1005;
		@Pc(1013) int local1013;
		@Pc(1167) int local1167;
		@Pc(1192) int local1192;
		@Pc(1196) int local1196;
		@Pc(1205) int local1205;
		@Pc(1210) int local1210;
		@Pc(1214) int local1214;
		@Pc(1218) int local1218;
		@Pc(1220) int local1220;
		@Pc(1349) int[] local1349;
		@Pc(1351) int local1351;
		@Pc(1355) int local1355;
		@Pc(1359) int local1359;
		@Pc(1361) int local1361;
		@Pc(1489) int local1489;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray61.length > local32) {
						local248 = this.anIntArrayArray61[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local50 = local248[local250];
							if (this.aShortArray86 == null || (arg6 & this.aShortArray86[local50]) != 0) {
								this.anIntArray479[local50] -= Static575.anInt9045;
								this.anIntArray478[local50] -= Static51.anInt1125;
								this.anIntArray482[local50] -= Static499.anInt8327;
								if (arg4 != 0) {
									local56 = Class6_Sub2_Sub7.anIntArray178[arg4];
									local378 = Class6_Sub2_Sub7.anIntArray177[arg4];
									local396 = local56 * this.anIntArray478[local50] + this.anIntArray479[local50] * local378 + 16383 >> 14;
									this.anIntArray478[local50] = local378 * this.anIntArray478[local50] + 16383 - local56 * this.anIntArray479[local50] >> 14;
									this.anIntArray479[local50] = local396;
								}
								if (arg2 != 0) {
									local56 = Class6_Sub2_Sub7.anIntArray178[arg2];
									local378 = Class6_Sub2_Sub7.anIntArray177[arg2];
									local396 = this.anIntArray478[local50] * local378 + 16383 - this.anIntArray482[local50] * local56 >> 14;
									this.anIntArray482[local50] = this.anIntArray482[local50] * local378 + this.anIntArray478[local50] * local56 + 16383 >> 14;
									this.anIntArray478[local50] = local396;
								}
								if (arg3 != 0) {
									local56 = Class6_Sub2_Sub7.anIntArray178[arg3];
									local378 = Class6_Sub2_Sub7.anIntArray177[arg3];
									local396 = local56 * this.anIntArray482[local50] + this.anIntArray479[local50] * local378 + 16383 >> 14;
									this.anIntArray482[local50] = this.anIntArray482[local50] * local378 + 16383 - this.anIntArray479[local50] * local56 >> 14;
									this.anIntArray479[local50] = local396;
								}
								this.anIntArray479[local50] += Static575.anInt9045;
								this.anIntArray478[local50] += Static51.anInt1125;
								this.anIntArray482[local50] += Static499.anInt8327;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray61.length) {
							local48 = this.anIntArrayArray61[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray86 == null || (this.aShortArray86[local56] & arg6) != 0) {
									local378 = this.anIntArray484[local56];
									local396 = this.anIntArray484[local56 + 1];
									for (local632 = local378; local632 < local396; local632++) {
										local641 = this.aShortArray88[local632] - 1;
										if (local641 == -1) {
											break;
										}
										if (arg4 != 0) {
											local651 = Class6_Sub2_Sub7.anIntArray178[arg4];
											local655 = Class6_Sub2_Sub7.anIntArray177[arg4];
											local673 = local651 * this.aShortArray97[local641] + this.aShortArray98[local641] * local655 + 16383 >> 14;
											this.aShortArray97[local641] = (short) (local655 * this.aShortArray97[local641] + 16383 - this.aShortArray98[local641] * local651 >> 14);
											this.aShortArray98[local641] = (short) local673;
										}
										if (arg2 != 0) {
											local651 = Class6_Sub2_Sub7.anIntArray178[arg2];
											local655 = Class6_Sub2_Sub7.anIntArray177[arg2];
											local673 = local655 * this.aShortArray97[local641] + 16383 - local651 * this.aShortArray89[local641] >> 14;
											this.aShortArray89[local641] = (short) (this.aShortArray89[local641] * local655 + this.aShortArray97[local641] * local651 + 16383 >> 14);
											this.aShortArray97[local641] = (short) local673;
										}
										if (arg3 != 0) {
											local651 = Class6_Sub2_Sub7.anIntArray178[arg3];
											local655 = Class6_Sub2_Sub7.anIntArray177[arg3];
											local673 = local655 * this.aShortArray98[local641] + this.aShortArray89[local641] * local651 + 16383 >> 14;
											this.aShortArray89[local641] = (short) (this.aShortArray89[local641] * local655 + 16383 - local651 * this.aShortArray98[local641] >> 14);
											this.aShortArray98[local641] = (short) local673;
										}
									}
								}
							}
						}
					}
					this.method5493();
					return;
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static471.aBoolean451) {
					local378 = Static499.anInt8327 * arg7[6] + Static51.anInt1125 * arg7[3] + arg7[0] * Static575.anInt9045 + 8192 >> 14;
					local396 = Static51.anInt1125 * arg7[4] + Static575.anInt9045 * arg7[1] + Static499.anInt8327 * arg7[7] + 8192 >> 14;
					local396 += local50;
					local632 = Static499.anInt8327 * arg7[8] + arg7[2] * Static575.anInt9045 + arg7[5] * Static51.anInt1125 + 8192 >> 14;
					local378 += local250;
					Static51.anInt1125 = local396;
					local632 += local56;
					Static575.anInt9045 = local378;
					Static499.anInt8327 = local632;
					Static471.aBoolean451 = false;
				}
				@Pc(973) int[] local973 = new int[9];
				local396 = Class6_Sub2_Sub7.anIntArray177[arg2];
				local632 = Class6_Sub2_Sub7.anIntArray178[arg2];
				local641 = Class6_Sub2_Sub7.anIntArray177[arg3];
				local651 = Class6_Sub2_Sub7.anIntArray178[arg3];
				local655 = Class6_Sub2_Sub7.anIntArray177[arg4];
				local673 = Class6_Sub2_Sub7.anIntArray178[arg4];
				local1005 = local655 * local632 + 8192 >> 14;
				local1013 = local673 * local632 + 8192 >> 14;
				local973[6] = -local651 * local655 + local641 * local1013 + 8192 >> 14;
				local973[2] = local396 * local651 + 8192 >> 14;
				local973[7] = local1005 * local641 + local651 * local673 + 8192 >> 14;
				local973[0] = local651 * local1013 + local655 * local641 + 8192 >> 14;
				local973[3] = local396 * local673 + 8192 >> 14;
				local973[8] = local396 * local641 + 8192 >> 14;
				local973[4] = local396 * local655 + 8192 >> 14;
				local973[5] = -local632;
				local973[1] = local1005 * local651 + -local641 * local673 + 8192 >> 14;
				@Pc(1142) int local1142 = -Static51.anInt1125 * local973[1] + local973[0] * -Static575.anInt9045 + local973[2] * -Static499.anInt8327 + 8192 >> 14;
				local1167 = local973[5] * -Static499.anInt8327 + -Static575.anInt9045 * local973[3] + -Static51.anInt1125 * local973[4] + 8192 >> 14;
				local1192 = local973[8] * -Static499.anInt8327 + local973[7] * -Static51.anInt1125 + local973[6] * -Static575.anInt9045 + 8192 >> 14;
				local1196 = Static575.anInt9045 + local1142;
				@Pc(1200) int local1200 = Static51.anInt1125 + local1167;
				local1205 = local1192 + Static499.anInt8327;
				@Pc(1208) int[] local1208 = new int[9];
				for (local1210 = 0; local1210 < 3; local1210++) {
					for (local1214 = 0; local1214 < 3; local1214++) {
						local1218 = 0;
						for (local1220 = 0; local1220 < 3; local1220++) {
							local1218 += local973[local1220 + local1210 * 3] * arg7[local1214 * 3 + local1220];
						}
						local1208[local1210 * 3 + local1214] = local1218 + 8192 >> 14;
					}
				}
				local1214 = local973[1] * local50 + local250 * local973[0] + local56 * local973[2] + 8192 >> 14;
				local1218 = local973[4] * local50 + local973[3] * local250 + local56 * local973[5] + 8192 >> 14;
				local1214 += local1196;
				local1220 = local56 * local973[8] + local50 * local973[7] + local250 * local973[6] + 8192 >> 14;
				local1218 += local1200;
				local1220 += local1205;
				local1349 = new int[9];
				for (local1351 = 0; local1351 < 3; local1351++) {
					for (local1355 = 0; local1355 < 3; local1355++) {
						local1359 = 0;
						for (local1361 = 0; local1361 < 3; local1361++) {
							local1359 += local1208[local1355 + local1361 * 3] * arg7[local1351 * 3 + local1361];
						}
						local1349[local1355 + local1351 * 3] = local1359 + 8192 >> 14;
					}
				}
				local1355 = arg7[2] * local1220 + local1214 * arg7[0] + local1218 * arg7[1] + 8192 >> 14;
				local1359 = arg7[5] * local1220 + local1218 * arg7[4] + arg7[3] * local1214 + 8192 >> 14;
				local1361 = local1214 * arg7[6] + local1218 * arg7[7] + arg7[8] * local1220 + 8192 >> 14;
				local1359 += local32;
				local1355 += local26;
				local1361 += local38;
				for (local1489 = 0; local1489 < local8; local1489++) {
					@Pc(1495) int local1495 = arg1[local1489];
					if (this.anIntArrayArray61.length > local1495) {
						@Pc(1509) int[] local1509 = this.anIntArrayArray61[local1495];
						for (@Pc(1511) int local1511 = 0; local1511 < local1509.length; local1511++) {
							@Pc(1517) int local1517 = local1509[local1511];
							if (this.aShortArray86 == null || (arg6 & this.aShortArray86[local1517]) != 0) {
								@Pc(1562) int local1562 = this.anIntArray479[local1517] * local1349[0] + local1349[1] * this.anIntArray478[local1517] + this.anIntArray482[local1517] * local1349[2] + 8192 >> 14;
								@Pc(1594) int local1594 = local1349[4] * this.anIntArray478[local1517] + local1349[3] * this.anIntArray479[local1517] + local1349[5] * this.anIntArray482[local1517] + 8192 >> 14;
								@Pc(1598) int local1598 = local1562 + local1355;
								@Pc(1629) int local1629 = local1349[8] * this.anIntArray482[local1517] + this.anIntArray479[local1517] * local1349[6] + local1349[7] * this.anIntArray478[local1517] + 8192 >> 14;
								@Pc(1633) int local1633 = local1594 + local1359;
								this.anIntArray479[local1517] = local1598;
								@Pc(1642) int local1642 = local1629 + local1361;
								this.anIntArray478[local1517] = local1633;
								this.anIntArray482[local1517] = local1642;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2587) Class214 local2587;
			@Pc(2469) boolean local2469;
			@Pc(2582) Class192 local2582;
			if (arg0 == 5) {
				if (this.anIntArrayArray60 != null) {
					local2469 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray60.length) {
							local48 = this.anIntArrayArray60[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray93 == null || (this.aShortArray93[local56] & arg6) != 0) {
									local378 = (this.aByteArray80[local56] & 0xFF) + arg2 * 8;
									if (local378 < 0) {
										local378 = 0;
									} else if (local378 > 255) {
										local378 = 255;
									}
									this.aByteArray80[local56] = (byte) local378;
								}
							}
							local2469 |= local48.length > 0;
						}
					}
					if (local2469) {
						if (this.aClass192Array1 != null) {
							for (local38 = 0; local38 < this.anInt6440; local38++) {
								local2582 = this.aClass192Array1[local38];
								local2587 = this.aClass214Array1[local38];
								local2587.anInt5990 = 255 - (this.aByteArray80[local2582.anInt5355] & 0xFF) << 24 | local2587.anInt5990 & 0xFFFFFF;
							}
						}
						this.method5494();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray60 != null) {
					local2469 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray60.length > local38) {
							local48 = this.anIntArrayArray60[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray93 == null || (this.aShortArray93[local56] & arg6) != 0) {
									local378 = this.aShortArray92[local56] & 0xFFFF;
									local396 = local378 >> 10 & 0x3F;
									local632 = local378 >> 7 & 0x7;
									local641 = local378 & 0x7F;
									local632 += arg3 / 4;
									@Pc(2700) int local2700 = arg2 + local396 & 0x3F;
									if (local632 < 0) {
										local632 = 0;
									} else if (local632 > 7) {
										local632 = 7;
									}
									local641 += arg4;
									if (local641 < 0) {
										local641 = 0;
									} else if (local641 > 127) {
										local641 = 127;
									}
									this.aShortArray92[local56] = (short) (local641 | local2700 << 10 | local632 << 7);
								}
							}
							local2469 |= local48.length > 0;
						}
					}
					if (local2469) {
						if (this.aClass192Array1 != null) {
							for (local38 = 0; local38 < this.anInt6440; local38++) {
								local2582 = this.aClass192Array1[local38];
								local2587 = this.aClass214Array1[local38];
								local2587.anInt5990 = Static171.anIntArray212[this.aShortArray92[local2582.anInt5355] & 0xFFFF] & 0xFFFFFF | local2587.anInt5990 & 0xFF000000;
							}
						}
						this.method5494();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray59 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray59.length > local32) {
							local248 = this.anIntArrayArray59[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2587 = this.aClass214Array1[local248[local250]];
								local2587.anInt5993 += arg3;
								local2587.anInt5982 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray59 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray59.length) {
							local248 = this.anIntArrayArray59[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2587 = this.aClass214Array1[local248[local250]];
								local2587.anInt5994 = local2587.anInt5994 * arg3 >> 7;
								local2587.anInt5988 = local2587.anInt5988 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray59 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray59.length > local32) {
						local248 = this.anIntArrayArray59[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local2587 = this.aClass214Array1[local248[local250]];
							local2587.anInt5985 = local2587.anInt5985 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray61.length) {
					local248 = this.anIntArrayArray61[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray86 == null || (arg6 & this.aShortArray86[local50]) != 0) {
							this.anIntArray479[local50] -= Static575.anInt9045;
							this.anIntArray478[local50] -= Static51.anInt1125;
							this.anIntArray482[local50] -= Static499.anInt8327;
							this.anIntArray479[local50] = this.anIntArray479[local50] * arg2 >> 7;
							this.anIntArray478[local50] = arg3 * this.anIntArray478[local50] >> 7;
							this.anIntArray482[local50] = this.anIntArray482[local50] * arg4 >> 7;
							this.anIntArray479[local50] += Static575.anInt9045;
							this.anIntArray478[local50] += Static51.anInt1125;
							this.anIntArray482[local50] += Static499.anInt8327;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static471.aBoolean451) {
				local378 = Static51.anInt1125 * arg7[3] + Static575.anInt9045 * arg7[0] + Static499.anInt8327 * arg7[6] + 8192 >> 14;
				local396 = Static499.anInt8327 * arg7[7] + Static575.anInt9045 * arg7[1] + arg7[4] * Static51.anInt1125 + 8192 >> 14;
				local378 += local250;
				local396 += local50;
				local632 = arg7[8] * Static499.anInt8327 + arg7[5] * Static51.anInt1125 + arg7[2] * Static575.anInt9045 + 8192 >> 14;
				Static575.anInt9045 = local378;
				local632 += local56;
				Static51.anInt1125 = local396;
				Static471.aBoolean451 = false;
				Static499.anInt8327 = local632;
			}
			local378 = arg2 << 15 >> 7;
			local396 = arg3 << 15 >> 7;
			local632 = arg4 << 15 >> 7;
			local641 = local378 * -Static575.anInt9045 + 8192 >> 14;
			local651 = -Static51.anInt1125 * local396 + 8192 >> 14;
			local655 = local632 * -Static499.anInt8327 + 8192 >> 14;
			local673 = Static575.anInt9045 + local641;
			local1005 = Static51.anInt1125 + local651;
			local1013 = local655 + Static499.anInt8327;
			@Pc(1991) int[] local1991 = new int[] { arg7[0] * local378 + 8192 >> 14, arg7[3] * local378 + 8192 >> 14, arg7[6] * local378 + 8192 >> 14, local396 * arg7[1] + 8192 >> 14, arg7[4] * local396 + 8192 >> 14, local396 * arg7[7] + 8192 >> 14, arg7[2] * local632 + 8192 >> 14, arg7[5] * local632 + 8192 >> 14, arg7[8] * local632 + 8192 >> 14 };
			local1167 = local250 * local378 + 8192 >> 14;
			local1192 = local50 * local396 + 8192 >> 14;
			@Pc(2119) int local2119 = local1192 + local1005;
			@Pc(2123) int local2123 = local1167 + local673;
			local1196 = local56 * local632 + 8192 >> 14;
			@Pc(2135) int local2135 = local1196 + local1013;
			@Pc(2138) int[] local2138 = new int[9];
			@Pc(2144) int local2144;
			for (local1205 = 0; local1205 < 3; local1205++) {
				for (local2144 = 0; local2144 < 3; local2144++) {
					local1210 = 0;
					for (local1214 = 0; local1214 < 3; local1214++) {
						local1210 += local1991[local1214 * 3 + local2144] * arg7[local1205 * 3 + local1214];
					}
					local2138[local1205 * 3 + local2144] = local1210 + 8192 >> 14;
				}
			}
			local2144 = local2123 * arg7[0] + local2119 * arg7[1] + local2135 * arg7[2] + 8192 >> 14;
			local1210 = local2119 * arg7[4] + local2123 * arg7[3] + local2135 * arg7[5] + 8192 >> 14;
			local2144 += local26;
			local1214 = local2135 * arg7[8] + local2123 * arg7[6] + local2119 * arg7[7] + 8192 >> 14;
			local1210 += local32;
			local1214 += local38;
			for (local1218 = 0; local1218 < local8; local1218++) {
				local1220 = arg1[local1218];
				if (this.anIntArrayArray61.length > local1220) {
					local1349 = this.anIntArrayArray61[local1220];
					for (local1351 = 0; local1351 < local1349.length; local1351++) {
						local1355 = local1349[local1351];
						if (this.aShortArray86 == null || (arg6 & this.aShortArray86[local1355]) != 0) {
							local1359 = local2138[2] * this.anIntArray482[local1355] + local2138[0] * this.anIntArray479[local1355] + this.anIntArray478[local1355] * local2138[1] + 8192 >> 14;
							local1361 = this.anIntArray479[local1355] * local2138[3] + this.anIntArray478[local1355] * local2138[4] + local2138[5] * this.anIntArray482[local1355] + 8192 >> 14;
							@Pc(2387) int local2387 = local1359 + local2144;
							@Pc(2391) int local2391 = local1361 + local1210;
							local1489 = local2138[6] * this.anIntArray479[local1355] + this.anIntArray478[local1355] * local2138[7] + local2138[8] * this.anIntArray482[local1355] + 8192 >> 14;
							@Pc(2426) int local2426 = local1489 + local1214;
							this.anIntArray479[local1355] = local2387;
							this.anIntArray478[local1355] = local2391;
							this.anIntArray482[local1355] = local2426;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()Z")
	@Override
	public boolean method7254() {
		if (this.aShortArray87 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray87.length; local12++) {
			if (this.aShortArray87[local12] != -1 && !this.aClass14_Sub2_11.anInterface4_15.method4233(this.aShortArray87[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!og", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub7.anIntArray178[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub7.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6413; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray478[local15] - this.anIntArray482[local15] * local9 >> 14;
			this.anIntArray482[local15] = this.anIntArray478[local15] * local9 + this.anIntArray482[local15] * local13 >> 14;
			this.anIntArray478[local15] = local33;
		}
		this.method5491();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7258(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class20_Sub3 local8 = (Class20_Sub3) arg0;
		if (this.anInt6414 == 0 || local8.anInt6414 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt6413;
		@Pc(24) int[] local24 = local8.anIntArray479;
		@Pc(27) int[] local27 = local8.anIntArray478;
		@Pc(30) int[] local30 = local8.anIntArray482;
		@Pc(33) short[] local33 = local8.aShortArray98;
		@Pc(36) short[] local36 = local8.aShortArray97;
		@Pc(39) short[] local39 = local8.aShortArray89;
		@Pc(42) byte[] local42 = local8.aByteArray81;
		@Pc(53) short[] local53;
		@Pc(57) short[] local57;
		@Pc(49) short[] local49;
		@Pc(61) byte[] local61;
		if (this.aClass242_1 == null) {
			local57 = null;
			local53 = null;
			local61 = null;
			local49 = null;
		} else {
			local49 = this.aClass242_1.aShortArray105;
			local53 = this.aClass242_1.aShortArray103;
			local57 = this.aClass242_1.aShortArray104;
			local61 = this.aClass242_1.aByteArray84;
		}
		@Pc(82) short[] local82;
		@Pc(90) short[] local90;
		@Pc(86) short[] local86;
		@Pc(78) byte[] local78;
		if (local8.aClass242_1 == null) {
			local90 = null;
			local82 = null;
			local86 = null;
			local78 = null;
		} else {
			local78 = local8.aClass242_1.aByteArray84;
			local82 = local8.aClass242_1.aShortArray103;
			local86 = local8.aClass242_1.aShortArray105;
			local90 = local8.aClass242_1.aShortArray104;
		}
		@Pc(103) int[] local103 = local8.anIntArray484;
		@Pc(106) short[] local106 = local8.aShortArray88;
		if (!local8.aBoolean446) {
			local8.method5503();
		}
		@Pc(115) int local115 = local8.anInt6466;
		@Pc(118) int local118 = local8.anInt6467;
		@Pc(121) int local121 = local8.anInt6429;
		@Pc(124) int local124 = local8.anInt6406;
		@Pc(127) int local127 = local8.anInt6419;
		@Pc(130) int local130 = local8.anInt6431;
		for (@Pc(132) int local132 = 0; local132 < this.anInt6413; local132++) {
			@Pc(142) int local142 = this.anIntArray478[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(166) int local166 = this.anIntArray479[local132] - arg1;
				if (local166 >= local121 && local166 <= local124) {
					@Pc(186) int local186 = this.anIntArray482[local132] - arg3;
					if (local186 >= local127 && local130 >= local186) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray484[local132];
						@Pc(208) int local208 = this.anIntArray484[local132 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray88[local210] - 1;
							if (local196 == -1 || this.aByteArray81[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local21; local243++) {
								if (local166 == local24[local243] && local30[local243] == local186 && local27[local243] == local142) {
									local208 = local103[local243 + 1];
									@Pc(276) int local276 = -1;
									local201 = local103[local243];
									for (@Pc(282) int local282 = local201; local282 < local208; local282++) {
										local276 = local106[local282] - 1;
										if (local276 == -1 || local42[local276] != 0) {
											break;
										}
									}
									if (local276 != -1) {
										if (local53 == null) {
											this.aClass242_1 = new Class242();
											local53 = this.aClass242_1.aShortArray103 = Static320.method5060(this.aShortArray98);
											local57 = this.aClass242_1.aShortArray104 = Static320.method5060(this.aShortArray97);
											local49 = this.aClass242_1.aShortArray105 = Static320.method5060(this.aShortArray89);
											local61 = this.aClass242_1.aByteArray84 = Static78.method1611(this.aByteArray81);
										}
										if (local82 == null) {
											@Pc(363) Class242 local363 = local8.aClass242_1 = new Class242();
											local82 = local363.aShortArray103 = Static320.method5060(local33);
											local90 = local363.aShortArray104 = Static320.method5060(local36);
											local86 = local363.aShortArray105 = Static320.method5060(local39);
											local78 = local363.aByteArray84 = Static78.method1611(local42);
										}
										@Pc(396) short local396 = this.aShortArray98[local196];
										@Pc(401) short local401 = this.aShortArray97[local196];
										@Pc(406) short local406 = this.aShortArray89[local196];
										local201 = local103[local243];
										@Pc(415) byte local415 = this.aByteArray81[local196];
										local208 = local103[local243 + 1];
										@Pc(431) int local431;
										for (@Pc(423) int local423 = local201; local423 < local208; local423++) {
											local431 = local106[local423] - 1;
											if (local431 == -1) {
												break;
											}
											if (local78[local431] != 0) {
												local82[local431] += local396;
												local90[local431] += local401;
												local86[local431] += local406;
												local78[local431] += local415;
											}
										}
										local406 = local39[local276];
										local401 = local36[local276];
										local208 = this.anIntArray484[local132 + 1];
										local415 = local42[local276];
										local396 = local33[local276];
										local201 = this.anIntArray484[local132];
										for (local431 = local201; local431 < local208; local431++) {
											@Pc(517) int local517 = this.aShortArray88[local431] - 1;
											if (local517 == -1) {
												break;
											}
											if (local61[local517] != 0) {
												local53[local517] += local396;
												local57[local517] += local401;
												local49[local517] += local406;
												local61[local517] += local415;
											}
										}
										local8.method5493();
										this.method5493();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7263(@OriginalArg(0) Class54 arg0) {
		@Pc(8) Class54_Sub3 local8 = (Class54_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass85Array6 != null) {
			for (local13 = 0; local13 < this.aClass85Array6.length; local13++) {
				@Pc(20) Class85 local20 = this.aClass85Array6[local13];
				@Pc(22) Class85 local22 = local20;
				if (local20.aClass85_1 != null) {
					local22 = local20.aClass85_1;
				}
				local22.anInt2862 = (int) (local8.aFloat143 * (float) this.anIntArray478[local20.anInt2868] + (float) this.anIntArray479[local20.anInt2868] * local8.aFloat144 + local8.aFloat147 * (float) this.anIntArray482[local20.anInt2868] + local8.aFloat145);
				local22.anInt2874 = (int) (local8.aFloat149 + (float) this.anIntArray482[local20.anInt2868] * local8.aFloat153 + local8.aFloat151 * (float) this.anIntArray479[local20.anInt2868] + local8.aFloat152 * (float) this.anIntArray478[local20.anInt2868]);
				local22.anInt2875 = (int) ((float) this.anIntArray478[local20.anInt2868] * local8.aFloat150 + (float) this.anIntArray479[local20.anInt2868] * local8.aFloat146 + local8.aFloat148 * (float) this.anIntArray482[local20.anInt2868] + local8.aFloat154);
				local22.anInt2863 = (int) (local8.aFloat145 + (float) this.anIntArray482[local20.anInt2870] * local8.aFloat147 + (float) this.anIntArray479[local20.anInt2870] * local8.aFloat144 + local8.aFloat143 * (float) this.anIntArray478[local20.anInt2870]);
				local22.anInt2865 = (int) (local8.aFloat151 * (float) this.anIntArray479[local20.anInt2870] + local8.aFloat152 * (float) this.anIntArray478[local20.anInt2870] + local8.aFloat153 * (float) this.anIntArray482[local20.anInt2870] + local8.aFloat149);
				local22.anInt2873 = (int) (local8.aFloat146 * (float) this.anIntArray479[local20.anInt2870] + local8.aFloat150 * (float) this.anIntArray478[local20.anInt2870] + local8.aFloat148 * (float) this.anIntArray482[local20.anInt2870] + local8.aFloat154);
				local22.anInt2864 = (int) (local8.aFloat145 + local8.aFloat144 * (float) this.anIntArray479[local20.anInt2866] + local8.aFloat143 * (float) this.anIntArray478[local20.anInt2866] + local8.aFloat147 * (float) this.anIntArray482[local20.anInt2866]);
				local22.anInt2869 = (int) (local8.aFloat149 + local8.aFloat153 * (float) this.anIntArray482[local20.anInt2866] + local8.aFloat151 * (float) this.anIntArray479[local20.anInt2866] + local8.aFloat152 * (float) this.anIntArray478[local20.anInt2866]);
				local22.anInt2878 = (int) ((float) this.anIntArray482[local20.anInt2866] * local8.aFloat148 + (float) this.anIntArray478[local20.anInt2866] * local8.aFloat150 + (float) this.anIntArray479[local20.anInt2866] * local8.aFloat146 + local8.aFloat154);
			}
		}
		if (this.aClass90Array6 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass90Array6.length; local13++) {
			@Pc(361) Class90 local361 = this.aClass90Array6[local13];
			@Pc(363) Class90 local363 = local361;
			if (local361.aClass90_1 != null) {
				local363 = local361.aClass90_1;
			}
			if (local361.aClass54_5 == null) {
				local361.aClass54_5 = local8.method7693();
			} else {
				local361.aClass54_5.la(local8);
			}
			local363.anInt2971 = (int) ((float) this.anIntArray482[local361.anInt2975] * local8.aFloat147 + local8.aFloat143 * (float) this.anIntArray478[local361.anInt2975] + local8.aFloat144 * (float) this.anIntArray479[local361.anInt2975] + local8.aFloat145);
			local363.anInt2976 = (int) ((float) this.anIntArray479[local361.anInt2975] * local8.aFloat151 + (float) this.anIntArray478[local361.anInt2975] * local8.aFloat152 + (float) this.anIntArray482[local361.anInt2975] * local8.aFloat153 + local8.aFloat149);
			local363.anInt2974 = (int) ((float) this.anIntArray482[local361.anInt2975] * local8.aFloat148 + (float) this.anIntArray478[local361.anInt2975] * local8.aFloat150 + (float) this.anIntArray479[local361.anInt2975] * local8.aFloat146 + local8.aFloat154);
		}
	}
}
