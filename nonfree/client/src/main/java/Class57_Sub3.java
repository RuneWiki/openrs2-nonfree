import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class57_Sub3 extends Class57 {

	@OriginalMember(owner = "client!vl", name = "Db", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[16384];

	@OriginalMember(owner = "client!vl", name = "Jc", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[16384];

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
	private int anInt9052;

	@OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
	private int anInt9056;

	@OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
	private int anInt9060;

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
	private int anInt9061;

	@OriginalMember(owner = "client!vl", name = "ab", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_23;

	@OriginalMember(owner = "client!vl", name = "bb", descriptor = "I")
	private int anInt9064;

	@OriginalMember(owner = "client!vl", name = "kb", descriptor = "Lclient!de;")
	private Class62 aClass62_1;

	@OriginalMember(owner = "client!vl", name = "rb", descriptor = "Z")
	private boolean aBoolean707;

	@OriginalMember(owner = "client!vl", name = "vb", descriptor = "Z")
	private boolean aBoolean708;

	@OriginalMember(owner = "client!vl", name = "wb", descriptor = "Lclient!de;")
	private Class62 aClass62_2;

	@OriginalMember(owner = "client!vl", name = "xb", descriptor = "Lclient!de;")
	private Class62 aClass62_3;

	@OriginalMember(owner = "client!vl", name = "Nb", descriptor = "Lclient!lp;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "client!vl", name = "Pb", descriptor = "I")
	private int anInt9086;

	@OriginalMember(owner = "client!vl", name = "Vb", descriptor = "Z")
	private boolean aBoolean710;

	@OriginalMember(owner = "client!vl", name = "Zb", descriptor = "I")
	private int anInt9093;

	@OriginalMember(owner = "client!vl", name = "mc", descriptor = "I")
	private int anInt9102;

	@OriginalMember(owner = "client!vl", name = "pc", descriptor = "Lclient!jea;")
	private Class164 aClass164_1;

	@OriginalMember(owner = "client!vl", name = "sc", descriptor = "I")
	private int anInt9107;

	@OriginalMember(owner = "client!vl", name = "tc", descriptor = "Lclient!de;")
	private Class62 aClass62_4;

	@OriginalMember(owner = "client!vl", name = "Ic", descriptor = "I")
	private int anInt9118;

	@OriginalMember(owner = "client!vl", name = "Kc", descriptor = "I")
	private int anInt9119;

	@OriginalMember(owner = "client!vl", name = "Mb", descriptor = "[I")
	private int[] anIntArray665;

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
	private int anInt9053;

	@OriginalMember(owner = "client!vl", name = "yc", descriptor = "I")
	private int anInt9111;

	@OriginalMember(owner = "client!vl", name = "Lb", descriptor = "Z")
	private boolean aBoolean709;

	@OriginalMember(owner = "client!vl", name = "zb", descriptor = "I")
	private int anInt9076;

	@OriginalMember(owner = "client!vl", name = "Fb", descriptor = "I")
	private int anInt9081;

	@OriginalMember(owner = "client!vl", name = "cc", descriptor = "[I")
	private int[] anIntArray669;

	@OriginalMember(owner = "client!vl", name = "V", descriptor = "[S")
	private short[] aShortArray278;

	@OriginalMember(owner = "client!vl", name = "bc", descriptor = "[I")
	private int[] anIntArray668;

	@OriginalMember(owner = "client!vl", name = "Xb", descriptor = "[I")
	private int[] anIntArray667;

	@OriginalMember(owner = "client!vl", name = "yb", descriptor = "[Lclient!aq;")
	private Class15[] aClass15Array5;

	@OriginalMember(owner = "client!vl", name = "Kb", descriptor = "[Lclient!tk;")
	private Class323[] aClass323Array5;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
	private int anInt9041;

	@OriginalMember(owner = "client!vl", name = "P", descriptor = "[Lclient!ov;")
	private Class251[] aClass251Array1;

	@OriginalMember(owner = "client!vl", name = "dc", descriptor = "[Lclient!si;")
	private Class308[] aClass308Array1;

	@OriginalMember(owner = "client!vl", name = "ob", descriptor = "[S")
	private short[] aShortArray282;

	@OriginalMember(owner = "client!vl", name = "vc", descriptor = "[S")
	private short[] aShortArray286;

	@OriginalMember(owner = "client!vl", name = "cb", descriptor = "[S")
	private short[] aShortArray280;

	@OriginalMember(owner = "client!vl", name = "N", descriptor = "S")
	private short aShort116;

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "[S")
	private short[] aShortArray275;

	@OriginalMember(owner = "client!vl", name = "S", descriptor = "[S")
	private short[] aShortArray277;

	@OriginalMember(owner = "client!vl", name = "Bc", descriptor = "[S")
	private short[] aShortArray287;

	@OriginalMember(owner = "client!vl", name = "Ib", descriptor = "[S")
	private short[] aShortArray284;

	@OriginalMember(owner = "client!vl", name = "lc", descriptor = "[S")
	private short[] aShortArray285;

	@OriginalMember(owner = "client!vl", name = "U", descriptor = "S")
	private short aShort117;

	@OriginalMember(owner = "client!vl", name = "Y", descriptor = "[S")
	private short[] aShortArray279;

	@OriginalMember(owner = "client!vl", name = "Dc", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!vl", name = "nb", descriptor = "[S")
	private short[] aShortArray281;

	@OriginalMember(owner = "client!vl", name = "I", descriptor = "[F")
	private float[] aFloatArray68;

	@OriginalMember(owner = "client!vl", name = "Lc", descriptor = "[F")
	private float[] aFloatArray71;

	@OriginalMember(owner = "client!vl", name = "O", descriptor = "[S")
	private short[] aShortArray276;

	@OriginalMember(owner = "client!vl", name = "pb", descriptor = "[S")
	private short[] aShortArray283;

	@OriginalMember(owner = "client!vl", name = "W", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "[I")
	private int[] anIntArray663;

	@OriginalMember(owner = "client!vl", name = "Sb", descriptor = "[I")
	private int[] anIntArray666;

	@OriginalMember(owner = "client!vl", name = "Q", descriptor = "[I")
	private int[] anIntArray664;

	@OriginalMember(owner = "client!vl", name = "Ac", descriptor = "[[I")
	private int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!vl", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!vl", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray68;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray69[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray70[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!cf;Lclient!nda;IIII)V")
	public Class57_Sub3(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface8 local11 = arg0.anInterface8_12;
		@Pc(15) int[] local15 = new int[arg1.anInt6105];
		this.anIntArray665 = new int[arg1.anInt6108 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt6105; local24++) {
			if ((arg1.aByteArray73 == null || arg1.aByteArray73[local24] != 2) && (arg1.aShortArray200 == null || arg1.aShortArray200[local24] == -1 || !local11.method6560(arg1.aShortArray200[local24] & 0xFFFF).aBoolean491)) {
				local15[this.anInt9053++] = local24;
				this.anIntArray665[arg1.aShortArray193[local24]]++;
				this.anIntArray665[arg1.aShortArray194[local24]]++;
				this.anIntArray665[arg1.aShortArray195[local24]]++;
			}
		}
		this.anInt9111 = this.anInt9053;
		@Pc(116) long[] local116 = new long[this.anInt9053];
		@Pc(125) boolean local125 = (this.anInt9064 & 0x100) != 0;
		@Pc(137) int local137;
		@Pc(148) int local148;
		@Pc(287) int local287;
		label501: for (@Pc(127) int local127 = 0; local127 < this.anInt9053; local127++) {
			@Pc(133) int local133 = local15[local127];
			@Pc(135) Class224 local135 = null;
			local137 = 0;
			@Pc(139) byte local139 = 0;
			@Pc(141) byte local141 = 0;
			@Pc(143) byte local143 = 0;
			if (arg1.aClass161Array1 != null) {
				for (local148 = 0; local148 < arg1.aClass161Array1.length; local148++) {
					@Pc(155) Class161 local155 = arg1.aClass161Array1[local148];
					if (local155.anInt4511 == local133) {
						@Pc(168) Class336 local168 = Static237.method3979(local155.anInt4509);
						if (local168.aBoolean659) {
							local116[local127] = Long.MAX_VALUE;
							this.anInt9111--;
							continue label501;
						}
					}
				}
			}
			@Pc(191) short local191 = -1;
			if (arg1.aShortArray200 != null) {
				local191 = arg1.aShortArray200[local133];
				if (local191 != -1) {
					local135 = local11.method6560(local191 & 0xFFFF);
					local141 = local135.aByte69;
					local143 = local135.aByte74;
				}
			}
			@Pc(243) boolean local243 = arg1.aByteArray76 != null && arg1.aByteArray76[local133] != 0 || local135 != null && !local135.aBoolean494 | local135.aBoolean492;
			if ((local125 || local243) && arg1.aByteArray74 != null) {
				local137 += arg1.aByteArray74[local133] << 17;
			}
			if (local243) {
				local137 += 65536;
			}
			local137 += (local141 & 0xFF) << 8;
			local137 += local143 & 0xFF;
			local287 = local139 + ((local191 & 0xFFFF) << 16);
			@Pc(293) int local293 = local287 + (local127 & 0xFFFF);
			local116[local127] = (long) local293 + ((long) local137 << 32);
			this.aBoolean709 |= local243;
		}
		Static219.method3810(local15, local116);
		this.anInt9076 = arg1.anInt6119;
		this.anInt9081 = arg1.anInt6108;
		this.anIntArray669 = arg1.anIntArray478;
		this.aShortArray278 = arg1.aShortArray197;
		this.anIntArray668 = arg1.anIntArray483;
		this.anIntArray667 = arg1.anIntArray475;
		this.aClass15Array5 = arg1.aClass15Array3;
		@Pc(354) Class98[] local354 = new Class98[this.anInt9081];
		this.aClass323Array5 = arg1.aClass323Array3;
		@Pc(378) int local378;
		@Pc(392) int local392;
		if (arg1.aClass161Array1 != null) {
			this.anInt9041 = arg1.aClass161Array1.length;
			this.aClass251Array1 = new Class251[this.anInt9041];
			this.aClass308Array1 = new Class308[this.anInt9041];
			for (local378 = 0; local378 < this.anInt9041; local378++) {
				@Pc(385) Class161 local385 = arg1.aClass161Array1[local378];
				@Pc(390) Class336 local390 = Static237.method3979(local385.anInt4509);
				local392 = -1;
				for (@Pc(394) int local394 = 0; local394 < this.anInt9053; local394++) {
					if (local385.anInt4511 == local15[local394]) {
						local392 = local394;
						break;
					}
				}
				if (local392 == -1) {
					throw new RuntimeException();
				}
				local148 = Static213.anIntArray342[arg1.aShortArray199[local385.anInt4511] & 0xFFFF] & 0xFFFFFF;
				local148 |= 255 - (arg1.aByteArray76 == null ? 0 : arg1.aByteArray76[local385.anInt4511]) << 24;
				this.aClass308Array1[local378] = new Class308(local392, arg1.aShortArray193[local385.anInt4511], arg1.aShortArray194[local385.anInt4511], arg1.aShortArray195[local385.anInt4511], local390.anInt8516, local390.anInt8512, local390.anInt8507, local390.anInt8514, local390.anInt8513, local390.aBoolean659, local390.aBoolean660, local385.anInt4505);
				this.aClass251Array1[local378] = new Class251(local148);
			}
		}
		local378 = this.anInt9053 * 3;
		this.aShortArray282 = new short[local378];
		Static577.aLongArray11 = new long[local378];
		this.aShortArray286 = new short[this.anInt9053];
		this.aShortArray280 = new short[local378];
		this.aShort116 = (short) arg3;
		this.aShortArray275 = new short[this.anInt9053];
		this.aShortArray277 = new short[local378];
		this.aShortArray287 = new short[this.anInt9053];
		this.aShortArray284 = new short[local378];
		this.aShortArray285 = new short[local378];
		this.aShort117 = (short) arg4;
		this.aShortArray279 = new short[local378];
		this.aByteArray103 = new byte[this.anInt9053];
		this.aShortArray281 = new short[this.anInt9053];
		this.aFloatArray68 = new float[local378];
		this.aFloatArray71 = new float[local378];
		this.aShortArray276 = new short[this.anInt9053];
		if (arg1.aShortArray198 != null) {
			this.aShortArray283 = new short[this.anInt9053];
		}
		this.aByteArray102 = new byte[local378];
		local137 = 0;
		for (local287 = 0; local287 < arg1.anInt6108; local287++) {
			local392 = this.anIntArray665[local287];
			this.anIntArray665[local287] = local137;
			local137 += local392;
			local354[local287] = new Class98();
		}
		this.anIntArray665[arg1.anInt6108] = local137;
		@Pc(632) int[] local632 = null;
		@Pc(634) int[] local634 = null;
		@Pc(636) int[] local636 = null;
		@Pc(638) float[][] local638 = null;
		@Pc(656) int[] local656;
		@Pc(664) int local664;
		@Pc(703) int local703;
		@Pc(709) int local709;
		@Pc(723) int local723;
		@Pc(725) int local725;
		@Pc(759) int local759;
		@Pc(764) int local764;
		@Pc(927) float local927;
		@Pc(923) float local923;
		@Pc(929) float local929;
		if (arg1.aByteArray75 != null) {
			@Pc(644) int local644 = arg1.anInt6115;
			@Pc(647) int[] local647 = new int[local644];
			@Pc(650) int[] local650 = new int[local644];
			@Pc(653) int[] local653 = new int[local644];
			local656 = new int[local644];
			@Pc(659) int[] local659 = new int[local644];
			@Pc(662) int[] local662 = new int[local644];
			for (local664 = 0; local664 < local644; local664++) {
				local647[local664] = Integer.MAX_VALUE;
				local650[local664] = -2147483647;
				local653[local664] = Integer.MAX_VALUE;
				local656[local664] = -2147483647;
				local659[local664] = Integer.MAX_VALUE;
				local662[local664] = -2147483647;
			}
			local632 = new int[local644];
			for (local703 = 0; local703 < this.anInt9053; local703++) {
				local709 = local15[local703];
				if (arg1.aByteArray75[local709] != -1) {
					local723 = arg1.aByteArray75[local709] & 0xFF;
					for (local725 = 0; local725 < 3; local725++) {
						@Pc(737) short local737;
						if (local725 == 0) {
							local737 = arg1.aShortArray193[local709];
						} else if (local725 == 1) {
							local737 = arg1.aShortArray194[local709];
						} else {
							local737 = arg1.aShortArray195[local709];
						}
						local759 = arg1.anIntArray483[local737];
						local764 = arg1.anIntArray478[local737];
						@Pc(769) int local769 = arg1.anIntArray475[local737];
						if (local759 < local647[local723]) {
							local647[local723] = local759;
						}
						if (local759 > local650[local723]) {
							local650[local723] = local759;
						}
						if (local764 < local653[local723]) {
							local653[local723] = local764;
						}
						if (local764 > local656[local723]) {
							local656[local723] = local764;
						}
						if (local769 < local659[local723]) {
							local659[local723] = local769;
						}
						if (local769 > local662[local723]) {
							local662[local723] = local769;
						}
					}
				}
			}
			local636 = new int[local644];
			local638 = new float[local644][];
			local634 = new int[local644];
			for (local709 = 0; local709 < local644; local709++) {
				@Pc(868) byte local868 = arg1.aByteArray72[local709];
				if (local868 > 0) {
					local632[local709] = (local647[local709] + local650[local709]) / 2;
					local634[local709] = (local656[local709] + local653[local709]) / 2;
					local636[local709] = (local662[local709] + local659[local709]) / 2;
					if (local868 == 1) {
						local764 = arg1.anIntArray482[local709];
						local923 = 64.0F / (float) arg1.anIntArray484[local709];
						if (local764 == 0) {
							local927 = 1.0F;
							local929 = 1.0F;
						} else if (local764 <= 0) {
							local927 = (float) -local764 / 1024.0F;
							local929 = 1.0F;
						} else {
							local929 = (float) local764 / 1024.0F;
							local927 = 1.0F;
						}
					} else if (local868 == 2) {
						local927 = 64.0F / (float) arg1.anIntArray482[local709];
						local929 = 64.0F / (float) arg1.anIntArray477[local709];
						local923 = 64.0F / (float) arg1.anIntArray484[local709];
					} else {
						local929 = (float) arg1.anIntArray477[local709] / 1024.0F;
						local927 = (float) arg1.anIntArray482[local709] / 1024.0F;
						local923 = (float) arg1.anIntArray484[local709] / 1024.0F;
					}
					local638[local709] = Static110.method2344(local929, arg1.aShortArray202[local709], arg1.aShortArray196[local709], local923, arg1.aByteArray77[local709] & 0xFF, arg1.aShortArray201[local709], local927);
				}
			}
		}
		@Pc(1042) Class101[] local1042 = new Class101[arg1.anInt6105];
		@Pc(1061) short local1061;
		@Pc(1072) int local1072;
		@Pc(1082) int local1082;
		for (@Pc(1044) int local1044 = 0; local1044 < arg1.anInt6105; local1044++) {
			@Pc(1051) short local1051 = arg1.aShortArray193[local1044];
			@Pc(1056) short local1056 = arg1.aShortArray194[local1044];
			local1061 = arg1.aShortArray195[local1044];
			local1072 = this.anIntArray668[local1056] - this.anIntArray668[local1051];
			local1082 = this.anIntArray669[local1056] - this.anIntArray669[local1051];
			local664 = this.anIntArray667[local1056] - this.anIntArray667[local1051];
			local703 = this.anIntArray668[local1061] - this.anIntArray668[local1051];
			local709 = this.anIntArray669[local1061] - this.anIntArray669[local1051];
			local723 = this.anIntArray667[local1061] - this.anIntArray667[local1051];
			local725 = local1082 * local723 - local664 * local709;
			@Pc(1144) int local1144 = local664 * local703 - local723 * local1072;
			for (local759 = local709 * local1072 - local1082 * local703; local725 > 8192 || local1144 > 8192 || local759 > 8192 || local725 < -8192 || local1144 < -8192 || local759 < -8192; local759 >>= 0x1) {
				local1144 >>= 0x1;
				local725 >>= 0x1;
			}
			local764 = (int) Math.sqrt((double) (local1144 * local1144 + local725 * local725 + local759 * local759));
			if (local764 <= 0) {
				local764 = 1;
			}
			local1144 = local1144 * 256 / local764;
			local725 = local725 * 256 / local764;
			local759 = local759 * 256 / local764;
			@Pc(1237) byte local1237 = arg1.aByteArray73 == null ? 0 : arg1.aByteArray73[local1044];
			if (local1237 == 0) {
				@Pc(1268) Class98 local1268 = local354[local1051];
				local1268.anInt3098 += local1144;
				local1268.anInt3097 += local725;
				local1268.anInt3096 += local759;
				local1268.anInt3099++;
				@Pc(1296) Class98 local1296 = local354[local1056];
				local1296.anInt3097 += local725;
				local1296.anInt3099++;
				local1296.anInt3096 += local759;
				local1296.anInt3098 += local1144;
				@Pc(1324) Class98 local1324 = local354[local1061];
				local1324.anInt3099++;
				local1324.anInt3096 += local759;
				local1324.anInt3097 += local725;
				local1324.anInt3098 += local1144;
			} else if (local1237 == 1) {
				@Pc(1253) Class101 local1253 = local1042[local1044] = new Class101();
				local1253.anInt3125 = local759;
				local1253.anInt3124 = local725;
				local1253.anInt3129 = local1144;
			}
		}
		@Pc(1361) int local1361;
		for (@Pc(1355) int local1355 = 0; local1355 < this.anInt9053; local1355++) {
			local1361 = local15[local1355];
			@Pc(1368) int local1368 = arg1.aShortArray199[local1361] & 0xFFFF;
			@Pc(1376) short local1376;
			if (arg1.aShortArray200 == null) {
				local1376 = -1;
			} else {
				local1376 = arg1.aShortArray200[local1361];
			}
			if (arg1.aByteArray75 == null) {
				local1082 = -1;
			} else {
				local1082 = arg1.aByteArray75[local1361];
			}
			if (arg1.aByteArray76 == null) {
				local664 = 0;
			} else {
				local664 = arg1.aByteArray76[local1361] & 0xFF;
			}
			@Pc(1408) float local1408 = 0.0F;
			@Pc(1410) float local1410 = 0.0F;
			@Pc(1412) float local1412 = 0.0F;
			local927 = 0.0F;
			local923 = 0.0F;
			local929 = 0.0F;
			@Pc(1420) byte local1420 = 0;
			@Pc(1422) byte local1422 = 0;
			@Pc(1424) int local1424 = 0;
			@Pc(1459) byte local1459;
			@Pc(1476) short local1476;
			@Pc(1481) short local1481;
			@Pc(1486) short local1486;
			if (local1376 != -1) {
				if (local1082 == -1) {
					local927 = 1.0F;
					local1412 = 1.0F;
					local1408 = 0.0F;
					local929 = 0.0F;
					local1410 = 1.0F;
					local923 = 0.0F;
					local1420 = 1;
					local1422 = 2;
				} else {
					local1082 &= 0xFF;
					local1459 = arg1.aByteArray72[local1082];
					@Pc(1466) short local1466;
					@Pc(1471) short local1471;
					@Pc(1509) float local1509;
					@Pc(1517) float local1517;
					@Pc(1525) float local1525;
					@Pc(1609) float local1609;
					@Pc(1618) float local1618;
					@Pc(1627) float local1627;
					@Pc(1636) float local1636;
					@Pc(1645) float local1645;
					@Pc(1653) float local1653;
					if (local1459 == 0) {
						local1466 = arg1.aShortArray193[local1361];
						local1471 = arg1.aShortArray194[local1361];
						local1476 = arg1.aShortArray195[local1361];
						local1481 = arg1.aShortArray202[local1082];
						local1486 = arg1.aShortArray196[local1082];
						@Pc(1491) short local1491 = arg1.aShortArray201[local1082];
						@Pc(1497) float local1497 = (float) arg1.anIntArray483[local1481];
						@Pc(1503) float local1503 = (float) arg1.anIntArray478[local1481];
						local1509 = arg1.anIntArray475[local1481];
						local1517 = (float) arg1.anIntArray483[local1486] - local1497;
						local1525 = (float) arg1.anIntArray478[local1486] - local1503;
						@Pc(1534) float local1534 = (float) arg1.anIntArray475[local1486] - local1509;
						@Pc(1542) float local1542 = (float) arg1.anIntArray483[local1491] - local1497;
						@Pc(1550) float local1550 = (float) arg1.anIntArray478[local1491] - local1503;
						@Pc(1558) float local1558 = (float) arg1.anIntArray475[local1491] - local1509;
						@Pc(1567) float local1567 = (float) arg1.anIntArray483[local1466] - local1497;
						@Pc(1576) float local1576 = (float) arg1.anIntArray478[local1466] - local1503;
						@Pc(1585) float local1585 = (float) arg1.anIntArray475[local1466] - local1509;
						@Pc(1593) float local1593 = (float) arg1.anIntArray483[local1471] - local1497;
						@Pc(1601) float local1601 = (float) arg1.anIntArray478[local1471] - local1503;
						local1609 = (float) arg1.anIntArray475[local1471] - local1509;
						local1618 = (float) arg1.anIntArray483[local1476] - local1497;
						local1627 = (float) arg1.anIntArray478[local1476] - local1503;
						local1636 = (float) arg1.anIntArray475[local1476] - local1509;
						local1645 = local1525 * local1558 - local1534 * local1550;
						local1653 = local1534 * local1542 - local1558 * local1517;
						@Pc(1661) float local1661 = local1550 * local1517 - local1542 * local1525;
						@Pc(1669) float local1669 = local1661 * local1550 - local1558 * local1653;
						@Pc(1678) float local1678 = local1558 * local1645 - local1542 * local1661;
						@Pc(1687) float local1687 = local1542 * local1653 - local1645 * local1550;
						@Pc(1701) float local1701 = 1.0F / (local1687 * local1534 + local1517 * local1669 + local1525 * local1678);
						local1412 = local1701 * (local1687 * local1609 + local1678 * local1601 + local1669 * local1593);
						local923 = (local1636 * local1687 + local1618 * local1669 + local1678 * local1627) * local1701;
						local1408 = (local1567 * local1669 + local1576 * local1678 + local1687 * local1585) * local1701;
						@Pc(1752) float local1752 = local1525 * local1661 - local1653 * local1534;
						@Pc(1760) float local1760 = local1517 * local1653 - local1525 * local1645;
						@Pc(1769) float local1769 = local1534 * local1645 - local1661 * local1517;
						@Pc(1783) float local1783 = 1.0F / (local1752 * local1542 + local1550 * local1769 + local1760 * local1558);
						local1410 = (local1567 * local1752 + local1769 * local1576 + local1585 * local1760) * local1783;
						local929 = (local1769 * local1627 + local1618 * local1752 + local1636 * local1760) * local1783;
						local927 = local1783 * (local1593 * local1752 + local1601 * local1769 + local1609 * local1760);
					} else {
						local1466 = arg1.aShortArray193[local1361];
						local1471 = arg1.aShortArray194[local1361];
						local1476 = arg1.aShortArray195[local1361];
						@Pc(1846) int local1846 = local632[local1082];
						@Pc(1850) int local1850 = local634[local1082];
						@Pc(1854) int local1854 = local636[local1082];
						@Pc(1858) float[] local1858 = local638[local1082];
						@Pc(1863) byte local1863 = arg1.aByteArray71[local1082];
						local1509 = (float) arg1.anIntArray480[local1082] / 256.0F;
						if (local1459 == 1) {
							local1517 = (float) arg1.anIntArray477[local1082] / 1024.0F;
							Static430.method6080(local1854, local1509, local1850, local1846, arg1.anIntArray475[local1466], local1858, arg1.anIntArray483[local1466], local1517, arg1.anIntArray478[local1466], local1863);
							local1410 = Static367.aFloat130;
							local1408 = Static328.aFloat118;
							Static430.method6080(local1854, local1509, local1850, local1846, arg1.anIntArray475[local1471], local1858, arg1.anIntArray483[local1471], local1517, arg1.anIntArray478[local1471], local1863);
							local927 = Static367.aFloat130;
							local1412 = Static328.aFloat118;
							Static430.method6080(local1854, local1509, local1850, local1846, arg1.anIntArray475[local1476], local1858, arg1.anIntArray483[local1476], local1517, arg1.anIntArray478[local1476], local1863);
							local923 = Static328.aFloat118;
							local929 = Static367.aFloat130;
							local1525 = local1517 / 2.0F;
							if ((local1863 & 0x1) == 0) {
								if (local1525 < local923 - local1408) {
									local1422 = 1;
									local923 -= local1517;
								} else if (local1525 < local1408 - local923) {
									local1422 = 2;
									local923 += local1517;
								}
								if (local1525 < local1412 - local1408) {
									local1412 -= local1517;
									local1420 = 1;
								} else if (local1525 < local1408 - local1412) {
									local1420 = 2;
									local1412 += local1517;
								}
							} else {
								if (local929 - local1410 > local1525) {
									local929 -= local1517;
									local1422 = 1;
								} else if (local1410 - local929 > local1525) {
									local929 += local1517;
									local1422 = 2;
								}
								if (local927 - local1410 > local1525) {
									local1420 = 1;
									local927 -= local1517;
								} else if (local1410 - local927 > local1525) {
									local1420 = 2;
									local927 += local1517;
								}
							}
						} else if (local1459 == 2) {
							local1517 = (float) arg1.anIntArray476[local1082] / 256.0F;
							local1525 = (float) arg1.anIntArray474[local1082] / 256.0F;
							@Pc(2095) int local2095 = arg1.anIntArray483[local1471] - arg1.anIntArray483[local1466];
							@Pc(2106) int local2106 = arg1.anIntArray478[local1471] - arg1.anIntArray478[local1466];
							@Pc(2117) int local2117 = arg1.anIntArray475[local1471] - arg1.anIntArray475[local1466];
							@Pc(2128) int local2128 = arg1.anIntArray483[local1476] - arg1.anIntArray483[local1466];
							@Pc(2139) int local2139 = arg1.anIntArray478[local1476] - arg1.anIntArray478[local1466];
							@Pc(2150) int local2150 = arg1.anIntArray475[local1476] - arg1.anIntArray475[local1466];
							@Pc(2159) int local2159 = local2106 * local2150 - local2139 * local2117;
							@Pc(2168) int local2168 = local2117 * local2128 - local2150 * local2095;
							@Pc(2176) int local2176 = local2095 * local2139 - local2106 * local2128;
							local1609 = 64.0F / (float) arg1.anIntArray482[local1082];
							local1618 = 64.0F / (float) arg1.anIntArray484[local1082];
							local1627 = 64.0F / (float) arg1.anIntArray477[local1082];
							local1636 = ((float) local2176 * local1858[2] + (float) local2168 * local1858[1] + local1858[0] * (float) local2159) / local1609;
							local1645 = ((float) local2176 * local1858[5] + local1858[3] * (float) local2159 + (float) local2168 * local1858[4]) / local1618;
							local1653 = ((float) local2176 * local1858[8] + local1858[7] * (float) local2168 + local1858[6] * (float) local2159) / local1627;
							local1424 = Static164.method2911(local1645, local1653, local1636);
							Static588.method2586(local1858, local1424, local1854, local1846, local1509, local1850, local1517, arg1.anIntArray483[local1466], local1863, arg1.anIntArray475[local1466], local1525, arg1.anIntArray478[local1466]);
							local1410 = Static302.aFloat178;
							local1408 = Static556.aFloat222;
							Static588.method2586(local1858, local1424, local1854, local1846, local1509, local1850, local1517, arg1.anIntArray483[local1471], local1863, arg1.anIntArray475[local1471], local1525, arg1.anIntArray478[local1471]);
							local927 = Static302.aFloat178;
							local1412 = Static556.aFloat222;
							Static588.method2586(local1858, local1424, local1854, local1846, local1509, local1850, local1517, arg1.anIntArray483[local1476], local1863, arg1.anIntArray475[local1476], local1525, arg1.anIntArray478[local1476]);
							local929 = Static302.aFloat178;
							local923 = Static556.aFloat222;
						} else if (local1459 == 3) {
							Static456.method6802(local1850, arg1.anIntArray478[local1466], local1846, local1858, local1509, local1863, arg1.anIntArray483[local1466], arg1.anIntArray475[local1466], local1854);
							local1408 = Static244.aFloat89;
							local1410 = Static486.aFloat159;
							Static456.method6802(local1850, arg1.anIntArray478[local1471], local1846, local1858, local1509, local1863, arg1.anIntArray483[local1471], arg1.anIntArray475[local1471], local1854);
							local927 = Static486.aFloat159;
							local1412 = Static244.aFloat89;
							Static456.method6802(local1850, arg1.anIntArray478[local1476], local1846, local1858, local1509, local1863, arg1.anIntArray483[local1476], arg1.anIntArray475[local1476], local1854);
							local929 = Static486.aFloat159;
							local923 = Static244.aFloat89;
							if ((local1863 & 0x1) == 0) {
								if (local923 - local1408 > 0.5F) {
									local1422 = 1;
									local923--;
								} else if (local1408 - local923 > 0.5F) {
									local1422 = 2;
									local923++;
								}
								if (local1412 - local1408 > 0.5F) {
									local1420 = 1;
									local1412--;
								} else if (local1408 - local1412 > 0.5F) {
									local1420 = 2;
									local1412++;
								}
							} else {
								if (local929 - local1410 > 0.5F) {
									local929--;
									local1422 = 1;
								} else if (local1410 - local929 > 0.5F) {
									local929++;
									local1422 = 2;
								}
								if (local927 - local1410 > 0.5F) {
									local927--;
									local1420 = 1;
								} else if (local1410 - local927 > 0.5F) {
									local1420 = 2;
									local927++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray73 == null) {
				local1459 = 0;
			} else {
				local1459 = arg1.aByteArray73[local1361];
			}
			if (local1459 == 0) {
				@Pc(2727) long local2727 = ((long) local664 + (long) (local1368 << 8) + (long) (local1424 << 24) << 32) + (long) (local1082 << 2);
				local1476 = arg1.aShortArray193[local1361];
				local1481 = arg1.aShortArray194[local1361];
				local1486 = arg1.aShortArray195[local1361];
				@Pc(2746) Class98 local2746 = local354[local1476];
				this.aShortArray287[local1355] = this.method7541(local1355, local2746.anInt3096, local2746.anInt3099, local1408, local1410, local1476, local2746.anInt3097, local2746.anInt3098, arg1, local2727);
				@Pc(2771) Class98 local2771 = local354[local1481];
				this.aShortArray281[local1355] = this.method7541(local1355, local2771.anInt3096, local2771.anInt3099, local1412, local927, local1481, local2771.anInt3097, local2771.anInt3098, arg1, local2727 + (long) local1420);
				@Pc(2799) Class98 local2799 = local354[local1486];
				this.aShortArray286[local1355] = this.method7541(local1355, local2799.anInt3096, local2799.anInt3099, local923, local929, local1486, local2799.anInt3097, local2799.anInt3098, arg1, (long) local1422 + local2727);
			} else if (local1459 == 1) {
				@Pc(2584) Class101 local2584 = local1042[local1361];
				@Pc(2630) long local2630 = (long) ((local2584.anInt3129 + 256 << 12) + (local1082 << 2) + (local2584.anInt3124 > 0 ? 1024 : 2048) + (local2584.anInt3125 + 256 << 22)) + ((long) local664 + (long) (local1424 << 24) + (long) (local1368 << 8) << 32);
				this.aShortArray287[local1355] = this.method7541(local1355, local2584.anInt3125, 0, local1408, local1410, arg1.aShortArray193[local1361], local2584.anInt3124, local2584.anInt3129, arg1, local2630);
				this.aShortArray281[local1355] = this.method7541(local1355, local2584.anInt3125, 0, local1412, local927, arg1.aShortArray194[local1361], local2584.anInt3124, local2584.anInt3129, arg1, local2630 + (long) local1420);
				this.aShortArray286[local1355] = this.method7541(local1355, local2584.anInt3125, 0, local923, local929, arg1.aShortArray195[local1361], local2584.anInt3124, local2584.anInt3129, arg1, local2630 + (long) local1422);
			}
			if (arg1.aShortArray200 == null) {
				this.aShortArray275[local1355] = -1;
			} else {
				this.aShortArray275[local1355] = arg1.aShortArray200[local1361];
			}
			if (arg1.aByteArray76 != null) {
				this.aByteArray103[local1355] = arg1.aByteArray76[local1361];
			}
			if (arg1.aShortArray198 != null) {
				this.aShortArray283[local1355] = arg1.aShortArray198[local1361];
			}
			this.aShortArray276[local1355] = arg1.aShortArray199[local1361];
		}
		if (this.anInt9111 > 0) {
			local1361 = 1;
			local1061 = this.aShortArray275[0];
			for (local1072 = 0; local1072 < this.anInt9111; local1072++) {
				@Pc(2899) short local2899 = this.aShortArray275[local1072];
				if (local1061 != local2899) {
					local1361++;
					local1061 = local2899;
				}
			}
			this.anIntArray663 = new int[local1361 + 1];
			this.anIntArray666 = new int[local1361];
			this.anIntArray664 = new int[local1361];
			this.anIntArray663[0] = 0;
			local1082 = this.anInt9086;
			@Pc(2942) short local2942 = 0;
			local1061 = this.aShortArray275[0];
			local1361 = 0;
			for (local703 = 0; local703 < this.anInt9111; local703++) {
				@Pc(2958) short local2958 = this.aShortArray275[local703];
				if (local2958 != local1061) {
					this.anIntArray666[local1361] = local1082;
					this.anIntArray664[local1361] = local2942 + 1 - local1082;
					local1361++;
					this.anIntArray663[local1361] = local703;
					local1061 = local2958;
					local1082 = this.anInt9086;
					local2942 = 0;
				}
				@Pc(2994) short local2994 = this.aShortArray287[local703];
				if (local2942 < local2994) {
					local2942 = local2994;
				}
				if (local2994 < local1082) {
					local1082 = local2994;
				}
				local2994 = this.aShortArray281[local703];
				if (local2942 < local2994) {
					local2942 = local2994;
				}
				if (local2994 < local1082) {
					local1082 = local2994;
				}
				local2994 = this.aShortArray286[local703];
				if (local2942 < local2994) {
					local2942 = local2994;
				}
				if (local2994 < local1082) {
					local1082 = local2994;
				}
			}
			this.anIntArray666[local1361] = local1082;
			this.anIntArray664[local1361] = local2942 + 1 - local1082;
			local1361++;
			this.anIntArray663[local1361] = this.anInt9111;
		}
		Static577.aLongArray11 = null;
		this.aShortArray282 = Static29.method544(this.aShortArray282, this.anInt9086);
		this.aShortArray285 = Static29.method544(this.aShortArray285, this.anInt9086);
		this.aShortArray279 = Static29.method544(this.aShortArray279, this.anInt9086);
		this.aShortArray284 = Static29.method544(this.aShortArray284, this.anInt9086);
		this.aShortArray277 = Static29.method544(this.aShortArray277, this.anInt9086);
		this.aByteArray102 = Static100.method2163(this.aByteArray102, this.anInt9086);
		this.aFloatArray71 = Static280.method4447(this.aFloatArray71, this.anInt9086);
		this.aFloatArray68 = Static280.method4447(this.aFloatArray68, this.anInt9086);
		if (arg1.anIntArray485 != null && Static219.method3811(arg2, this.anInt9093)) {
			this.anIntArrayArray69 = arg1.method5284(false);
		}
		if (arg1.aClass161Array1 != null && Static137.method2649(this.anInt9093, arg2)) {
			this.anIntArrayArray67 = arg1.method5294();
		}
		if (arg1.anIntArray479 != null && Static262.method4321(arg2, this.anInt9093)) {
			local1361 = 0;
			local656 = new int[256];
			for (local1072 = 0; local1072 < this.anInt9053; local1072++) {
				local1082 = arg1.anIntArray479[local15[local1072]];
				if (local1082 >= 0) {
					if (local1361 < local1082) {
						local1361 = local1082;
					}
					@Pc(3219) int local3219 = local656[local1082]++;
				}
			}
			this.anIntArrayArray68 = new int[local1361 + 1][];
			for (local1082 = 0; local1082 <= local1361; local1082++) {
				this.anIntArrayArray68[local1082] = new int[local656[local1082]];
				local656[local1082] = 0;
			}
			for (local664 = 0; local664 < this.anInt9053; local664++) {
				local703 = arg1.anIntArray479[local15[local664]];
				if (local703 >= 0) {
					this.anIntArrayArray68[local703][local656[local703]++] = local664;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!cf;IIZZ)V")
	public Class57_Sub3(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean708 = false;
		this.anInt9076 = 0;
		this.aBoolean707 = false;
		this.anInt9053 = 0;
		this.aBoolean710 = true;
		this.anInt9081 = 0;
		this.aBoolean709 = false;
		this.anInt9086 = 0;
		this.anInt9111 = 0;
		this.anInt9064 = arg1;
		this.anInt9093 = arg2;
		this.aBoolean707 = arg4;
		this.aClass43_Sub1_23 = arg0;
		if (arg3 || Static579.method7688(this.anInt9093, this.anInt9064)) {
			this.aClass62_3 = new Class62(Static524.method6964(this.anInt9093, this.anInt9064));
		}
		if (arg3 || Static214.method3765(this.anInt9064, this.anInt9093)) {
			this.aClass62_1 = new Class62(Static92.method2051(this.anInt9064, this.anInt9093));
		}
		if (arg3 || Static215.method3769(this.anInt9064, this.anInt9093)) {
			this.aClass62_2 = new Class62(Static330.method5099(this.anInt9093, this.anInt9064));
		}
		if (arg3 || Static530.method6997(this.anInt9064, this.anInt9093)) {
			this.aClass62_4 = new Class62(Static230.method3918(this.anInt9093, this.anInt9064));
		}
		if (arg3 || Static373.method5516(this.anInt9093, this.anInt9064)) {
			this.aClass164_1 = new Class164(Static350.method6850(this.anInt9093, this.anInt9064));
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!gk;B)V")
	private void method7529(@OriginalArg(0) Class3_Sub3_Sub10_Sub2 arg0) {
		if (Static428.anIntArray119.length < this.anInt9086) {
			Static428.anIntArray119 = new int[this.anInt9086];
			Static471.anIntArray596 = new int[this.anInt9086];
		}
		@Pc(53) int local53;
		@Pc(91) int local91;
		@Pc(100) int local100;
		for (@Pc(24) int local24 = 0; local24 < this.anInt9081; local24++) {
			local53 = (this.anIntArray668[local24] - (this.anIntArray669[local24] * this.aClass43_Sub1_23.anInt4811 >> 8) >> this.aClass43_Sub1_23.anInt4816) - arg0.anInt3382;
			@Pc(77) int local77 = (this.anIntArray667[local24] - (this.anIntArray669[local24] * this.aClass43_Sub1_23.anInt4810 >> 8) >> this.aClass43_Sub1_23.anInt4816) - arg0.anInt3386;
			@Pc(82) int local82 = this.anIntArray665[local24];
			@Pc(89) int local89 = this.anIntArray665[local24 + 1];
			for (local91 = local82; local91 < local89; local91++) {
				local100 = this.aShortArray280[local91] - 1;
				if (local100 == -1) {
					break;
				}
				Static428.anIntArray119[local100] = local53;
				Static471.anIntArray596[local100] = local77;
			}
		}
		for (local53 = 0; local53 < this.anInt9111; local53++) {
			if (this.aByteArray103 == null || this.aByteArray103[local53] <= 128) {
				@Pc(147) short local147 = this.aShortArray287[local53];
				@Pc(152) short local152 = this.aShortArray281[local53];
				@Pc(157) short local157 = this.aShortArray286[local53];
				local91 = Static428.anIntArray119[local147];
				local100 = Static428.anIntArray119[local152];
				@Pc(169) int local169 = Static428.anIntArray119[local157];
				@Pc(173) int local173 = Static471.anIntArray596[local147];
				@Pc(177) int local177 = Static471.anIntArray596[local152];
				@Pc(181) int local181 = Static471.anIntArray596[local157];
				if ((local91 - local100) * (local177 - local181) - (local169 - local100) * (local177 - local173) > 0) {
					arg0.method2994(local91, local100, local173, local181, local177, local169);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort117 = (short) arg0;
		this.method7543();
		this.method7530();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	private void method7530() {
		if ((this.anInt9093 & 0x37) == 0) {
			if (this.aClass62_2 != null) {
				this.aClass62_2.aBoolean182 = false;
			}
		} else if (this.aClass62_4 != null) {
			this.aClass62_4.aBoolean182 = false;
		}
	}

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort116 = (short) arg0;
		this.method7545();
	}

	@OriginalMember(owner = "client!vl", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub3_Sub10 S(@OriginalArg(0) Class3_Sub3_Sub10 arg0) {
		if (this.anInt9086 == 0) {
			return null;
		}
		if (!this.aBoolean708) {
			this.method7537();
		}
		@Pc(42) int local42;
		@Pc(58) int local58;
		if (this.aClass43_Sub1_23.anInt4811 <= 0) {
			local42 = this.anInt9060 - (this.anInt9118 * this.aClass43_Sub1_23.anInt4811 >> 8) >> this.aClass43_Sub1_23.anInt4816;
			local58 = this.anInt9056 - (this.aClass43_Sub1_23.anInt4811 * this.anInt9107 >> 8) >> this.aClass43_Sub1_23.anInt4816;
		} else {
			local42 = this.anInt9060 - (this.anInt9107 * this.aClass43_Sub1_23.anInt4811 >> 8) >> this.aClass43_Sub1_23.anInt4816;
			local58 = this.anInt9056 - (this.aClass43_Sub1_23.anInt4811 * this.anInt9118 >> 8) >> this.aClass43_Sub1_23.anInt4816;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass43_Sub1_23.anInt4810 > 0) {
			local116 = this.anInt9119 - (this.aClass43_Sub1_23.anInt4810 * this.anInt9107 >> 8) >> this.aClass43_Sub1_23.anInt4816;
			local133 = this.anInt9052 - (this.aClass43_Sub1_23.anInt4810 * this.anInt9118 >> 8) >> this.aClass43_Sub1_23.anInt4816;
		} else {
			local116 = this.anInt9119 - (this.aClass43_Sub1_23.anInt4810 * this.anInt9118 >> 8) >> this.aClass43_Sub1_23.anInt4816;
			local133 = this.anInt9052 - (this.anInt9107 * this.aClass43_Sub1_23.anInt4810 >> 8) >> this.aClass43_Sub1_23.anInt4816;
		}
		@Pc(176) int local176 = local58 + 1 - local42;
		@Pc(183) int local183 = local133 + 1 - local116;
		@Pc(186) Class3_Sub3_Sub10_Sub2 local186 = (Class3_Sub3_Sub10_Sub2) arg0;
		@Pc(196) Class3_Sub3_Sub10_Sub2 local196;
		if (local186 != null && local186.method2992(local176, local183)) {
			local196 = local186;
			local186.method2993();
		} else {
			local196 = new Class3_Sub3_Sub10_Sub2(this.aClass43_Sub1_23, local176, local183);
		}
		local196.method2990(local116, local133, local42, local58);
		this.method7529(local196);
		return local196;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "()V")
	@Override
	protected void method7513() {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7525(@OriginalArg(0) Class109 arg0) {
		@Pc(8) Class109_Sub3 local8 = (Class109_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass323Array5 != null) {
			for (local13 = 0; local13 < this.aClass323Array5.length; local13++) {
				@Pc(20) Class323 local20 = this.aClass323Array5[local13];
				@Pc(22) Class323 local22 = local20;
				if (local20.aClass323_2 != null) {
					local22 = local20.aClass323_2;
				}
				local22.anInt8107 = (int) ((float) this.anIntArray667[local20.anInt8095] * local8.aFloat195 + local8.aFloat187 * (float) this.anIntArray669[local20.anInt8095] + (float) this.anIntArray668[local20.anInt8095] * local8.aFloat193 + local8.aFloat192);
				local22.anInt8098 = (int) (local8.aFloat188 + local8.aFloat190 * (float) this.anIntArray667[local20.anInt8095] + (float) this.anIntArray668[local20.anInt8095] * local8.aFloat191 + local8.aFloat186 * (float) this.anIntArray669[local20.anInt8095]);
				local22.anInt8093 = (int) (local8.aFloat189 + (float) this.anIntArray668[local20.anInt8095] * local8.aFloat194 + (float) this.anIntArray669[local20.anInt8095] * local8.aFloat196 + local8.aFloat197 * (float) this.anIntArray667[local20.anInt8095]);
				local22.anInt8101 = (int) (local8.aFloat193 * (float) this.anIntArray668[local20.anInt8103] + local8.aFloat187 * (float) this.anIntArray669[local20.anInt8103] + (float) this.anIntArray667[local20.anInt8103] * local8.aFloat195 + local8.aFloat192);
				local22.anInt8094 = (int) (local8.aFloat188 + local8.aFloat190 * (float) this.anIntArray667[local20.anInt8103] + local8.aFloat191 * (float) this.anIntArray668[local20.anInt8103] + (float) this.anIntArray669[local20.anInt8103] * local8.aFloat186);
				local22.anInt8109 = (int) (local8.aFloat189 + local8.aFloat194 * (float) this.anIntArray668[local20.anInt8103] + local8.aFloat196 * (float) this.anIntArray669[local20.anInt8103] + (float) this.anIntArray667[local20.anInt8103] * local8.aFloat197);
				local22.anInt8092 = (int) (local8.aFloat192 + local8.aFloat195 * (float) this.anIntArray667[local20.anInt8106] + (float) this.anIntArray668[local20.anInt8106] * local8.aFloat193 + (float) this.anIntArray669[local20.anInt8106] * local8.aFloat187);
				local22.anInt8108 = (int) (local8.aFloat188 + local8.aFloat186 * (float) this.anIntArray669[local20.anInt8106] + local8.aFloat191 * (float) this.anIntArray668[local20.anInt8106] + (float) this.anIntArray667[local20.anInt8106] * local8.aFloat190);
				local22.anInt8104 = (int) (local8.aFloat189 + (float) this.anIntArray669[local20.anInt8106] * local8.aFloat196 + (float) this.anIntArray668[local20.anInt8106] * local8.aFloat194 + (float) this.anIntArray667[local20.anInt8106] * local8.aFloat197);
			}
		}
		if (this.aClass15Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass15Array5.length; local13++) {
			@Pc(361) Class15 local361 = this.aClass15Array5[local13];
			@Pc(363) Class15 local363 = local361;
			if (local361.aClass15_1 != null) {
				local363 = local361.aClass15_1;
			}
			if (local361.aClass109_1 == null) {
				local361.aClass109_1 = local8.method7100();
			} else {
				local361.aClass109_1.M(local8);
			}
			local363.anInt549 = (int) ((float) this.anIntArray669[local361.anInt548] * local8.aFloat187 + (float) this.anIntArray668[local361.anInt548] * local8.aFloat193 + local8.aFloat195 * (float) this.anIntArray667[local361.anInt548] + local8.aFloat192);
			local363.anInt538 = (int) (local8.aFloat190 * (float) this.anIntArray667[local361.anInt548] + local8.aFloat191 * (float) this.anIntArray668[local361.anInt548] + (float) this.anIntArray669[local361.anInt548] * local8.aFloat186 + local8.aFloat188);
			local363.anInt541 = (int) (local8.aFloat189 + (float) this.anIntArray669[local361.anInt548] * local8.aFloat196 + (float) this.anIntArray668[local361.anInt548] * local8.aFloat194 + local8.aFloat197 * (float) this.anIntArray667[local361.anInt548]);
		}
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "()V")
	@Override
	public void method7517() {
		if (this.anInt9086 > 0 && this.anInt9111 > 0) {
			this.method7540();
			this.method7533();
			this.method7538();
		}
	}

	@OriginalMember(owner = "client!vl", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean708) {
			this.method7537();
		}
		return this.anInt9118;
	}

	@OriginalMember(owner = "client!vl", name = "B", descriptor = "(I[IIIIZI[I)V")
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
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static100.anInt2413 = 0;
			Static45.anInt993 = 0;
			local28 = 0;
			Static369.anInt6328 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray69.length) {
					local52 = this.anIntArrayArray69[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray278 == null || (arg6 & this.aShortArray278[local60]) != 0) {
							Static100.anInt2413 += this.anIntArray668[local60];
							Static369.anInt6328 += this.anIntArray669[local60];
							Static45.anInt993 += this.anIntArray667[local60];
							local28++;
						}
					}
				}
			}
			if (local28 <= 0) {
				Static45.anInt993 = arg4;
				Static100.anInt2413 = arg2;
				Static369.anInt6328 = arg3;
			} else {
				Static100.anInt2413 = arg2 + Static100.anInt2413 / local28;
				Static549.aBoolean695 = true;
				Static369.anInt6328 = Static369.anInt6328 / local28 + arg3;
				Static45.anInt993 = Static45.anInt993 / local28 + arg4;
			}
			return;
		}
		@Pc(254) int[] local254;
		@Pc(256) int local256;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg2 * arg7[3] + arg3 * arg7[4] + 8192 >> 14;
				local38 = arg7[6] * arg2 + arg3 * arg7[7] + arg4 * arg7[8] + 8192 >> 14;
				arg3 = local32;
				arg2 = local28;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray69.length) {
					local254 = this.anIntArrayArray69[local32];
					for (local256 = 0; local256 < local254.length; local256++) {
						local54 = local254[local256];
						if (this.aShortArray278 == null || (this.aShortArray278[local54] & arg6) != 0) {
							this.anIntArray668[local54] += arg2;
							this.anIntArray669[local54] += arg3;
							this.anIntArray667[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(388) int local388;
		@Pc(406) int local406;
		@Pc(636) int local636;
		@Pc(645) int local645;
		@Pc(657) int local657;
		@Pc(661) int local661;
		@Pc(680) int local680;
		@Pc(1009) int local1009;
		@Pc(1017) int local1017;
		@Pc(1170) int local1170;
		@Pc(1197) int local1197;
		@Pc(1201) int local1201;
		@Pc(1209) int local1209;
		@Pc(1214) int local1214;
		@Pc(1218) int local1218;
		@Pc(1222) int local1222;
		@Pc(1224) int local1224;
		@Pc(1358) int[] local1358;
		@Pc(1360) int local1360;
		@Pc(1364) int local1364;
		@Pc(1368) int local1368;
		@Pc(1370) int local1370;
		@Pc(1499) int local1499;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray69.length) {
						local254 = this.anIntArrayArray69[local32];
						for (local256 = 0; local256 < local254.length; local256++) {
							local54 = local254[local256];
							if (this.aShortArray278 == null || (this.aShortArray278[local54] & arg6) != 0) {
								this.anIntArray668[local54] -= Static100.anInt2413;
								this.anIntArray669[local54] -= Static369.anInt6328;
								this.anIntArray667[local54] -= Static45.anInt993;
								if (arg4 != 0) {
									local60 = Class3_Sub17.anIntArray175[arg4];
									local388 = Class3_Sub17.anIntArray177[arg4];
									local406 = this.anIntArray668[local54] * local388 + this.anIntArray669[local54] * local60 + 16383 >> 14;
									this.anIntArray669[local54] = this.anIntArray669[local54] * local388 + 16383 - this.anIntArray668[local54] * local60 >> 14;
									this.anIntArray668[local54] = local406;
								}
								if (arg2 != 0) {
									local60 = Class3_Sub17.anIntArray175[arg2];
									local388 = Class3_Sub17.anIntArray177[arg2];
									local406 = this.anIntArray669[local54] * local388 + 16383 - local60 * this.anIntArray667[local54] >> 14;
									this.anIntArray667[local54] = local388 * this.anIntArray667[local54] + this.anIntArray669[local54] * local60 + 16383 >> 14;
									this.anIntArray669[local54] = local406;
								}
								if (arg3 != 0) {
									local60 = Class3_Sub17.anIntArray175[arg3];
									local388 = Class3_Sub17.anIntArray177[arg3];
									local406 = local388 * this.anIntArray668[local54] + local60 * this.anIntArray667[local54] + 16383 >> 14;
									this.anIntArray667[local54] = local388 * this.anIntArray667[local54] + 16383 - this.anIntArray668[local54] * local60 >> 14;
									this.anIntArray668[local54] = local406;
								}
								this.anIntArray668[local54] += Static100.anInt2413;
								this.anIntArray669[local54] += Static369.anInt6328;
								this.anIntArray667[local54] += Static45.anInt993;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray69.length > local38) {
							local52 = this.anIntArrayArray69[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray278 == null || (this.aShortArray278[local60] & arg6) != 0) {
									local388 = this.anIntArray665[local60];
									local406 = this.anIntArray665[local60 + 1];
									for (local636 = local388; local636 < local406; local636++) {
										local645 = this.aShortArray280[local636] - 1;
										if (local645 == -1) {
											break;
										}
										if (arg4 != 0) {
											local657 = Class3_Sub17.anIntArray175[arg4];
											local661 = Class3_Sub17.anIntArray177[arg4];
											local680 = this.aShortArray284[local645] * local657 + local661 * this.aShortArray279[local645] + 16383 >> 14;
											this.aShortArray284[local645] = (short) (this.aShortArray284[local645] * local661 + 16383 - this.aShortArray279[local645] * local657 >> 14);
											this.aShortArray279[local645] = (short) local680;
										}
										if (arg2 != 0) {
											local657 = Class3_Sub17.anIntArray175[arg2];
											local661 = Class3_Sub17.anIntArray177[arg2];
											local680 = local661 * this.aShortArray284[local645] + 16383 - this.aShortArray277[local645] * local657 >> 14;
											this.aShortArray277[local645] = (short) (this.aShortArray284[local645] * local657 + local661 * this.aShortArray277[local645] + 16383 >> 14);
											this.aShortArray284[local645] = (short) local680;
										}
										if (arg3 != 0) {
											local657 = Class3_Sub17.anIntArray175[arg3];
											local661 = Class3_Sub17.anIntArray177[arg3];
											local680 = local661 * this.aShortArray279[local645] + this.aShortArray277[local645] * local657 + 16383 >> 14;
											this.aShortArray277[local645] = (short) (local661 * this.aShortArray277[local645] + 16383 - local657 * this.aShortArray279[local645] >> 14);
											this.aShortArray279[local645] = (short) local680;
										}
									}
								}
							}
						}
					}
					this.method7530();
					return;
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local256 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static549.aBoolean695) {
					local388 = Static45.anInt993 * arg7[6] + arg7[3] * Static369.anInt6328 + arg7[0] * Static100.anInt2413 + 8192 >> 14;
					local406 = arg7[4] * Static369.anInt6328 + arg7[1] * Static100.anInt2413 + Static45.anInt993 * arg7[7] + 8192 >> 14;
					local636 = Static45.anInt993 * arg7[8] + Static100.anInt2413 * arg7[2] + arg7[5] * Static369.anInt6328 + 8192 >> 14;
					local406 += local54;
					local388 += local256;
					Static369.anInt6328 = local406;
					Static100.anInt2413 = local388;
					local636 += local60;
					Static549.aBoolean695 = false;
					Static45.anInt993 = local636;
				}
				@Pc(977) int[] local977 = new int[9];
				local406 = Class3_Sub17.anIntArray177[arg2];
				local636 = Class3_Sub17.anIntArray175[arg2];
				local645 = Class3_Sub17.anIntArray177[arg3];
				local657 = Class3_Sub17.anIntArray175[arg3];
				local661 = Class3_Sub17.anIntArray177[arg4];
				local680 = Class3_Sub17.anIntArray175[arg4];
				local1009 = local661 * local636 + 8192 >> 14;
				local1017 = local636 * local680 + 8192 >> 14;
				local977[3] = local406 * local680 + 8192 >> 14;
				local977[7] = local645 * local1009 + local657 * local680 + 8192 >> 14;
				local977[4] = local661 * local406 + 8192 >> 14;
				local977[5] = -local636;
				local977[8] = local645 * local406 + 8192 >> 14;
				local977[1] = local680 * -local645 + local657 * local1009 + 8192 >> 14;
				local977[2] = local406 * local657 + 8192 >> 14;
				local977[0] = local1017 * local657 + local661 * local645 + 8192 >> 14;
				local977[6] = local645 * local1017 + local661 * -local657 + 8192 >> 14;
				@Pc(1145) int local1145 = -Static45.anInt993 * local977[2] + -Static369.anInt6328 * local977[1] + local977[0] * -Static100.anInt2413 + 8192 >> 14;
				local1170 = local977[5] * -Static45.anInt993 + local977[4] * -Static369.anInt6328 + local977[3] * -Static100.anInt2413 + 8192 >> 14;
				local1197 = -Static100.anInt2413 * local977[6] + local977[7] * -Static369.anInt6328 + -Static45.anInt993 * local977[8] + 8192 >> 14;
				local1201 = local1145 + Static100.anInt2413;
				@Pc(1205) int local1205 = local1170 + Static369.anInt6328;
				local1209 = Static45.anInt993 + local1197;
				@Pc(1212) int[] local1212 = new int[9];
				for (local1214 = 0; local1214 < 3; local1214++) {
					for (local1218 = 0; local1218 < 3; local1218++) {
						local1222 = 0;
						for (local1224 = 0; local1224 < 3; local1224++) {
							local1222 += local977[local1214 * 3 + local1224] * arg7[local1218 * 3 + local1224];
						}
						local1212[local1214 * 3 + local1218] = local1222 + 8192 >> 14;
					}
				}
				local1218 = local60 * local977[2] + local977[0] * local256 + local54 * local977[1] + 8192 >> 14;
				local1222 = local977[3] * local256 + local54 * local977[4] + local60 * local977[5] + 8192 >> 14;
				local1224 = local54 * local977[7] + local256 * local977[6] + local60 * local977[8] + 8192 >> 14;
				local1218 += local1201;
				local1222 += local1205;
				local1224 += local1209;
				local1358 = new int[9];
				for (local1360 = 0; local1360 < 3; local1360++) {
					for (local1364 = 0; local1364 < 3; local1364++) {
						local1368 = 0;
						for (local1370 = 0; local1370 < 3; local1370++) {
							local1368 += arg7[local1360 * 3 + local1370] * local1212[local1370 * 3 + local1364];
						}
						local1358[local1360 * 3 + local1364] = local1368 + 8192 >> 14;
					}
				}
				local1364 = local1224 * arg7[2] + arg7[0] * local1218 + local1222 * arg7[1] + 8192 >> 14;
				local1368 = local1224 * arg7[5] + local1222 * arg7[4] + local1218 * arg7[3] + 8192 >> 14;
				local1370 = arg7[7] * local1222 + arg7[6] * local1218 + arg7[8] * local1224 + 8192 >> 14;
				local1364 += local28;
				local1368 += local32;
				local1370 += local38;
				for (local1499 = 0; local1499 < local8; local1499++) {
					@Pc(1505) int local1505 = arg1[local1499];
					if (local1505 < this.anIntArrayArray69.length) {
						@Pc(1519) int[] local1519 = this.anIntArrayArray69[local1505];
						for (@Pc(1521) int local1521 = 0; local1521 < local1519.length; local1521++) {
							@Pc(1527) int local1527 = local1519[local1521];
							if (this.aShortArray278 == null || (this.aShortArray278[local1527] & arg6) != 0) {
								@Pc(1572) int local1572 = this.anIntArray668[local1527] * local1358[0] + this.anIntArray669[local1527] * local1358[1] + this.anIntArray667[local1527] * local1358[2] + 8192 >> 14;
								@Pc(1603) int local1603 = local1358[5] * this.anIntArray667[local1527] + this.anIntArray668[local1527] * local1358[3] + local1358[4] * this.anIntArray669[local1527] + 8192 >> 14;
								@Pc(1607) int local1607 = local1603 + local1368;
								@Pc(1611) int local1611 = local1572 + local1364;
								@Pc(1642) int local1642 = this.anIntArray668[local1527] * local1358[6] + local1358[7] * this.anIntArray669[local1527] + local1358[8] * this.anIntArray667[local1527] + 8192 >> 14;
								@Pc(1646) int local1646 = local1642 + local1370;
								this.anIntArray668[local1527] = local1611;
								this.anIntArray669[local1527] = local1607;
								this.anIntArray667[local1527] = local1646;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2584) Class251 local2584;
			@Pc(2479) boolean local2479;
			@Pc(2579) Class308 local2579;
			if (arg0 == 5) {
				if (this.anIntArrayArray68 != null) {
					local2479 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray68.length) {
							local52 = this.anIntArrayArray68[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray283 == null || (arg6 & this.aShortArray283[local60]) != 0) {
									local388 = (this.aByteArray103[local60] & 0xFF) + (arg2 * 8);
									if (local388 < 0) {
										local388 = 0;
									} else if (local388 > 255) {
										local388 = 255;
									}
									this.aByteArray103[local60] = (byte) local388;
								}
							}
							local2479 |= local52.length > 0;
						}
					}
					if (local2479) {
						if (this.aClass308Array1 != null) {
							for (local38 = 0; local38 < this.anInt9041; local38++) {
								local2579 = this.aClass308Array1[local38];
								local2584 = this.aClass251Array1[local38];
								local2584.anInt6724 = local2584.anInt6724 & 0xFFFFFF | 255 - (this.aByteArray103[local2579.anInt7800] & 0xFF) << 24;
							}
						}
						this.method7545();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray68 != null) {
					local2479 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray68.length > local38) {
							local52 = this.anIntArrayArray68[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray283 == null || (this.aShortArray283[local60] & arg6) != 0) {
									local388 = this.aShortArray276[local60] & 0xFFFF;
									local406 = local388 >> 10 & 0x3F;
									local636 = local388 >> 7 & 0x7;
									@Pc(2688) int local2688 = local406 + arg2 & 0x3F;
									local645 = local388 & 0x7F;
									local636 += arg3 / 4;
									local645 += arg4;
									if (local636 < 0) {
										local636 = 0;
									} else if (local636 > 7) {
										local636 = 7;
									}
									if (local645 < 0) {
										local645 = 0;
									} else if (local645 > 127) {
										local645 = 127;
									}
									this.aShortArray276[local60] = (short) (local2688 << 10 | local636 << 7 | local645);
								}
							}
							local2479 |= local52.length > 0;
						}
					}
					if (local2479) {
						if (this.aClass308Array1 != null) {
							for (local38 = 0; local38 < this.anInt9041; local38++) {
								local2579 = this.aClass308Array1[local38];
								local2584 = this.aClass251Array1[local38];
								local2584.anInt6724 = local2584.anInt6724 & 0xFF000000 | Static213.anIntArray342[this.aShortArray276[local2579.anInt7800] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method7545();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray67 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray67.length) {
							local254 = this.anIntArrayArray67[local32];
							for (local256 = 0; local256 < local254.length; local256++) {
								local2584 = this.aClass251Array1[local254[local256]];
								local2584.anInt6721 += arg2;
								local2584.anInt6726 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray67 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray67.length) {
							local254 = this.anIntArrayArray67[local32];
							for (local256 = 0; local256 < local254.length; local256++) {
								local2584 = this.aClass251Array1[local254[local256]];
								local2584.anInt6720 = arg3 * local2584.anInt6720 >> 7;
								local2584.anInt6722 = arg2 * local2584.anInt6722 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray67 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray67.length > local32) {
						local254 = this.anIntArrayArray67[local32];
						for (local256 = 0; local256 < local254.length; local256++) {
							local2584 = this.aClass251Array1[local254[local256]];
							local2584.anInt6727 = local2584.anInt6727 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray69.length > local32) {
					local254 = this.anIntArrayArray69[local32];
					for (local256 = 0; local256 < local254.length; local256++) {
						local54 = local254[local256];
						if (this.aShortArray278 == null || (arg6 & this.aShortArray278[local54]) != 0) {
							this.anIntArray668[local54] -= Static100.anInt2413;
							this.anIntArray669[local54] -= Static369.anInt6328;
							this.anIntArray667[local54] -= Static45.anInt993;
							this.anIntArray668[local54] = this.anIntArray668[local54] * arg2 >> 7;
							this.anIntArray669[local54] = arg3 * this.anIntArray669[local54] >> 7;
							this.anIntArray667[local54] = arg4 * this.anIntArray667[local54] >> 7;
							this.anIntArray668[local54] += Static100.anInt2413;
							this.anIntArray669[local54] += Static369.anInt6328;
							this.anIntArray667[local54] += Static45.anInt993;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local256 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static549.aBoolean695) {
				local388 = Static45.anInt993 * arg7[6] + arg7[3] * Static369.anInt6328 + arg7[0] * Static100.anInt2413 + 8192 >> 14;
				local406 = arg7[1] * Static100.anInt2413 + Static369.anInt6328 * arg7[4] + arg7[7] * Static45.anInt993 + 8192 >> 14;
				local388 += local256;
				local636 = Static100.anInt2413 * arg7[2] + arg7[5] * Static369.anInt6328 + Static45.anInt993 * arg7[8] + 8192 >> 14;
				local406 += local54;
				local636 += local60;
				Static369.anInt6328 = local406;
				Static100.anInt2413 = local388;
				Static45.anInt993 = local636;
				Static549.aBoolean695 = false;
			}
			local388 = arg2 << 15 >> 7;
			local406 = arg3 << 15 >> 7;
			local636 = arg4 << 15 >> 7;
			local645 = -Static100.anInt2413 * local388 + 8192 >> 14;
			local657 = local406 * -Static369.anInt6328 + 8192 >> 14;
			local661 = -Static45.anInt993 * local636 + 8192 >> 14;
			local680 = local645 + Static100.anInt2413;
			local1009 = local657 + Static369.anInt6328;
			local1017 = Static45.anInt993 + local661;
			@Pc(2015) int[] local2015 = new int[] { arg7[0] * local388 + 8192 >> 14, local388 * arg7[3] + 8192 >> 14, arg7[6] * local388 + 8192 >> 14, arg7[1] * local406 + 8192 >> 14, local406 * arg7[4] + 8192 >> 14, local406 * arg7[7] + 8192 >> 14, arg7[2] * local636 + 8192 >> 14, local636 * arg7[5] + 8192 >> 14, arg7[8] * local636 + 8192 >> 14 };
			local1170 = local388 * local256 + 8192 >> 14;
			local1197 = local406 * local54 + 8192 >> 14;
			local1201 = local636 * local60 + 8192 >> 14;
			@Pc(2151) int local2151 = local1197 + local1009;
			@Pc(2155) int local2155 = local1170 + local680;
			@Pc(2159) int local2159 = local1201 + local1017;
			@Pc(2162) int[] local2162 = new int[9];
			@Pc(2168) int local2168;
			for (local1209 = 0; local1209 < 3; local1209++) {
				for (local2168 = 0; local2168 < 3; local2168++) {
					local1214 = 0;
					for (local1218 = 0; local1218 < 3; local1218++) {
						local1214 += local2015[local1218 * 3 + local2168] * arg7[local1218 + local1209 * 3];
					}
					local2162[local2168 + local1209 * 3] = local1214 + 8192 >> 14;
				}
			}
			local2168 = arg7[0] * local2155 + local2151 * arg7[1] + arg7[2] * local2159 + 8192 >> 14;
			local1214 = arg7[5] * local2159 + arg7[3] * local2155 + arg7[4] * local2151 + 8192 >> 14;
			local2168 += local28;
			local1214 += local32;
			local1218 = arg7[7] * local2151 + arg7[6] * local2155 + local2159 * arg7[8] + 8192 >> 14;
			local1218 += local38;
			for (local1222 = 0; local1222 < local8; local1222++) {
				local1224 = arg1[local1222];
				if (local1224 < this.anIntArrayArray69.length) {
					local1358 = this.anIntArrayArray69[local1224];
					for (local1360 = 0; local1360 < local1358.length; local1360++) {
						local1364 = local1358[local1360];
						if (this.aShortArray278 == null || (arg6 & this.aShortArray278[local1364]) != 0) {
							local1368 = this.anIntArray669[local1364] * local2162[1] + local2162[0] * this.anIntArray668[local1364] + this.anIntArray667[local1364] * local2162[2] + 8192 >> 14;
							local1370 = local2162[5] * this.anIntArray667[local1364] + local2162[4] * this.anIntArray669[local1364] + local2162[3] * this.anIntArray668[local1364] + 8192 >> 14;
							@Pc(2406) int local2406 = local1368 + local2168;
							local1499 = local2162[8] * this.anIntArray667[local1364] + local2162[6] * this.anIntArray668[local1364] + this.anIntArray669[local1364] * local2162[7] + 8192 >> 14;
							@Pc(2442) int local2442 = local1370 + local1214;
							@Pc(2446) int local2446 = local1499 + local1218;
							this.anIntArray668[local1364] = local2406;
							this.anIntArray669[local1364] = local2442;
							this.anIntArray667[local1364] = local2446;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!q;Lclient!ql;II)V")
	@Override
	public void method7521(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9086 == 0) {
			return;
		}
		@Pc(13) Class109_Sub3 local13 = this.aClass43_Sub1_23.aClass109_Sub3_16;
		@Pc(16) Class109_Sub3 local16 = (Class109_Sub3) arg0;
		if (!this.aBoolean708) {
			this.method7537();
		}
		Static367.aFloat131 = local13.aFloat189 + local16.aFloat188 * local13.aFloat196 + local13.aFloat194 * local16.aFloat192 + local16.aFloat189 * local13.aFloat197;
		Static50.aFloat9 = local13.aFloat194 * local16.aFloat187 + local16.aFloat186 * local13.aFloat196 + local13.aFloat197 * local16.aFloat196;
		@Pc(69) float local69 = Static367.aFloat131 + Static50.aFloat9 * (float) this.anInt9118;
		@Pc(77) float local77 = Static367.aFloat131 + Static50.aFloat9 * (float) this.anInt9107;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = local69 + (float) this.anInt9061;
			local93 = local77 - (float) this.anInt9061;
		} else {
			local87 = local77 + (float) this.anInt9061;
			local93 = local69 - (float) this.anInt9061;
		}
		if (local93 >= this.aClass43_Sub1_23.aFloat91 || local87 <= (float) this.aClass43_Sub1_23.anInt4814) {
			return;
		}
		Static110.aFloat39 = local13.aFloat187 * local16.aFloat186 + local16.aFloat187 * local13.aFloat193 + local13.aFloat195 * local16.aFloat196;
		Static555.aFloat220 = local13.aFloat192 + local13.aFloat187 * local16.aFloat188 + local13.aFloat193 * local16.aFloat192 + local13.aFloat195 * local16.aFloat189;
		@Pc(169) float local169 = (float) this.anInt9118 * Static110.aFloat39 + Static555.aFloat220;
		@Pc(177) float local177 = (float) this.anInt9107 * Static110.aFloat39 + Static555.aFloat220;
		@Pc(203) float local203;
		@Pc(192) float local192;
		if (local177 < local169) {
			local192 = ((float) this.anInt9061 + local169) * (float) this.aClass43_Sub1_23.anInt4838;
			local203 = (float) this.aClass43_Sub1_23.anInt4838 * ((float) -this.anInt9061 + local177);
		} else {
			local192 = (float) this.aClass43_Sub1_23.anInt4838 * (local177 + (float) this.anInt9061);
			local203 = (float) this.aClass43_Sub1_23.anInt4838 * (local169 - (float) this.anInt9061);
		}
		if (local203 / (float) arg2 >= this.aClass43_Sub1_23.aFloat92 || local192 / (float) arg2 <= this.aClass43_Sub1_23.aFloat101) {
			return;
		}
		Static121.aFloat43 = local13.aFloat190 * local16.aFloat196 + local13.aFloat191 * local16.aFloat187 + local16.aFloat186 * local13.aFloat186;
		Static510.aFloat177 = local13.aFloat188 + local13.aFloat190 * local16.aFloat189 + local16.aFloat188 * local13.aFloat186 + local16.aFloat192 * local13.aFloat191;
		@Pc(295) float local295 = Static121.aFloat43 * (float) this.anInt9118 + Static510.aFloat177;
		@Pc(303) float local303 = (float) this.anInt9107 * Static121.aFloat43 + Static510.aFloat177;
		@Pc(319) float local319;
		@Pc(330) float local330;
		if (local303 < local295) {
			local319 = ((float) -this.anInt9061 + local303) * (float) this.aClass43_Sub1_23.anInt4815;
			local330 = ((float) this.anInt9061 + local295) * (float) this.aClass43_Sub1_23.anInt4815;
		} else {
			local330 = (float) this.aClass43_Sub1_23.anInt4815 * ((float) this.anInt9061 + local303);
			local319 = (float) this.aClass43_Sub1_23.anInt4815 * (local295 - (float) this.anInt9061);
		}
		if (this.aClass43_Sub1_23.aFloat95 <= local319 / (float) arg2 || local330 / (float) arg2 <= this.aClass43_Sub1_23.aFloat104) {
			return;
		}
		if (arg1 != null || this.aClass308Array1 != null) {
			Static162.aFloat62 = local13.aFloat197 * local16.aFloat194 + local13.aFloat196 * local16.aFloat191 + local16.aFloat193 * local13.aFloat194;
			Static198.aFloat82 = local13.aFloat186 * local16.aFloat191 + local16.aFloat193 * local13.aFloat191 + local16.aFloat194 * local13.aFloat190;
			Static424.aFloat150 = local13.aFloat187 * local16.aFloat190 + local16.aFloat195 * local13.aFloat193 + local16.aFloat197 * local13.aFloat195;
			Static539.aFloat116 = local13.aFloat195 * local16.aFloat194 + local13.aFloat187 * local16.aFloat191 + local16.aFloat193 * local13.aFloat193;
			Static10.aFloat2 = local13.aFloat190 * local16.aFloat197 + local16.aFloat190 * local13.aFloat186 + local13.aFloat191 * local16.aFloat195;
			Static472.aFloat156 = local13.aFloat197 * local16.aFloat197 + local16.aFloat190 * local13.aFloat196 + local16.aFloat195 * local13.aFloat194;
		}
		if (arg1 != null) {
			@Pc(497) int local497 = this.anInt9056 + this.anInt9060 >> 1;
			@Pc(505) int local505 = this.anInt9119 + this.anInt9052 >> 1;
			@Pc(524) int local524 = (int) (Static424.aFloat150 * (float) local505 + (float) local497 * Static539.aFloat116 + Static555.aFloat220 + (float) this.anInt9118 * Static110.aFloat39);
			@Pc(543) int local543 = (int) (Static510.aFloat177 + (float) local497 * Static198.aFloat82 + (float) this.anInt9118 * Static121.aFloat43 + Static10.aFloat2 * (float) local505);
			@Pc(562) int local562 = (int) (Static472.aFloat156 * (float) local505 + Static50.aFloat9 * (float) this.anInt9118 + Static367.aFloat131 + (float) local497 * Static162.aFloat62);
			@Pc(581) int local581 = (int) ((float) this.anInt9107 * Static110.aFloat39 + Static555.aFloat220 + Static539.aFloat116 * (float) local497 + Static424.aFloat150 * (float) local505);
			@Pc(600) int local600 = (int) (Static10.aFloat2 * (float) local505 + (float) this.anInt9107 * Static121.aFloat43 + Static510.aFloat177 + (float) local497 * Static198.aFloat82);
			arg1.anInt7173 = this.aClass43_Sub1_23.anInt4818 + this.aClass43_Sub1_23.anInt4815 * local543 / arg2;
			arg1.anInt7171 = this.aClass43_Sub1_23.anInt4815 * local600 / arg2 + this.aClass43_Sub1_23.anInt4818;
			arg1.anInt7169 = this.aClass43_Sub1_23.anInt4839 + local524 * this.aClass43_Sub1_23.anInt4838 / arg2;
			arg1.anInt7170 = this.aClass43_Sub1_23.anInt4839 + local581 * this.aClass43_Sub1_23.anInt4838 / arg2;
			@Pc(673) int local673 = (int) (Static472.aFloat156 * (float) local505 + Static50.aFloat9 * (float) this.anInt9107 + Static367.aFloat131 + (float) local497 * Static162.aFloat62);
			if (this.aClass43_Sub1_23.anInt4814 <= local562 || local673 >= this.aClass43_Sub1_23.anInt4814) {
				arg1.anInt7172 = (local524 + this.anInt9061) * this.aClass43_Sub1_23.anInt4838 / arg2 + this.aClass43_Sub1_23.anInt4839 - arg1.anInt7169;
				arg1.aBoolean567 = true;
			}
		}
		this.aClass43_Sub1_23.method4221((float) arg2);
		this.aClass43_Sub1_23.method4249();
		this.aClass43_Sub1_23.method4216(local16);
		this.method7539();
		this.method7536();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7546(arg2, arg4, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "()V")
	@Override
	protected void method7508() {
	}

	@OriginalMember(owner = "client!vl", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean708) {
			this.method7537();
		}
		@Pc(16) int local16 = arg4 + this.anInt9060;
		@Pc(22) int local22 = arg4 + this.anInt9056;
		@Pc(27) int local27 = this.anInt9119 + arg6;
		@Pc(33) int local33 = arg6 + this.anInt9052;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8179 <= local22 + arg2.anInt8178 >> arg2.anInt8176 || local27 < 0 || arg2.anInt8180 <= local33 + arg2.anInt8178 >> arg2.anInt8176)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8178 + local22 >> arg3.anInt8176 >= arg3.anInt8179 || local27 < 0 || arg3.anInt8180 <= arg3.anInt8178 + local33 >> arg3.anInt8176) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8176;
			local22 = arg2.anInt8178 + local22 - 1 >> arg2.anInt8176;
			local27 >>= arg2.anInt8176;
			local33 = arg2.anInt8178 + local33 - 1 >> arg2.anInt8176;
			if (arg5 == arg2.method6889(local16, local27) && arg5 == arg2.method6889(local22, local27) && arg5 == arg2.method6889(local16, local33) && arg5 == arg2.method6889(local22, local33)) {
				return;
			}
		}
		@Pc(204) int local204;
		if (arg0 == 1) {
			for (local204 = 0; local204 < this.anInt9081; local204++) {
				this.anIntArray669[local204] = this.anIntArray669[local204] + arg2.method6890(this.anIntArray668[local204] + arg4, arg6 + this.anIntArray667[local204]) - arg5;
			}
		} else {
			@Pc(268) int local268;
			@Pc(277) int local277;
			if (arg0 == 2) {
				local204 = this.anInt9118;
				if (local204 == 0) {
					return;
				}
				for (local268 = 0; local268 < this.anInt9081; local268++) {
					local277 = (this.anIntArray669[local268] << 16) / local204;
					if (local277 < arg1) {
						this.anIntArray669[local268] += (arg1 - local277) * (-arg5 + arg2.method6890(this.anIntArray668[local268] - -arg4, arg6 + this.anIntArray667[local268])) / arg1;
					}
				}
			} else {
				@Pc(284) int local284;
				if (arg0 == 3) {
					local204 = (arg1 & 0xFF) * 4;
					local268 = (arg1 >> 8 & 0xFF) * 4;
					local277 = (arg1 >> 16 & 0xFF) << 6;
					local284 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local204 >> 1) < 0 || (local204 >> 1) + arg4 + arg2.anInt8178 >= arg2.anInt8179 << arg2.anInt8176 || arg6 - (local268 >> 1) < 0 || arg6 + (local268 >> 1) + arg2.anInt8178 >= arg2.anInt8180 << arg2.anInt8176) {
						return;
					}
					this.method7514(arg5, local277, local284, local268, local204, arg2, arg6, arg4);
				} else if (arg0 == 4) {
					local204 = this.anInt9107 - this.anInt9118;
					for (local268 = 0; local268 < this.anInt9081; local268++) {
						this.anIntArray669[local268] = this.anIntArray669[local268] + arg3.method6890(this.anIntArray668[local268] + arg4, arg6 + this.anIntArray667[local268]) + local204 - arg5;
					}
				} else if (arg0 == 5) {
					local204 = this.anInt9107 - this.anInt9118;
					for (local268 = 0; local268 < this.anInt9081; local268++) {
						local277 = this.anIntArray668[local268] + arg4;
						local284 = this.anIntArray667[local268] + arg6;
						@Pc(290) int local290 = arg2.method6890(local277, local284);
						@Pc(296) int local296 = arg3.method6890(local277, local284);
						@Pc(303) int local303 = local290 - local296 - arg1;
						this.anIntArray669[local268] = (local303 * ((this.anIntArray669[local268] << 8) / local204) >> 8) + (local290 - arg5);
					}
				}
			}
		}
		this.method7543();
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIZIIIIII)Z")
	private boolean method7531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > arg0 && arg0 < arg2 && arg0 < arg5) {
			return false;
		} else if (arg6 < arg0 && arg2 < arg0 && arg0 > arg5) {
			return false;
		} else if (arg4 < arg7 && arg4 < arg1 && arg3 > arg4) {
			return false;
		} else {
			return arg7 >= arg4 || arg1 >= arg4 || arg4 <= arg3;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V")
	private void method7532() {
		if (this.aClass164_1 != null) {
			this.aClass164_1.aBoolean349 = false;
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)Z")
	private boolean method7533() {
		if (this.aClass164_1.aBoolean349) {
			return true;
		}
		if (this.aClass164_1.anInterface17_6 == null) {
			this.aClass164_1.anInterface17_6 = this.aClass43_Sub1_23.method4258(this.aBoolean707);
		}
		@Pc(28) Interface17 local28 = this.aClass164_1.anInterface17_6;
		local28.method6942(this.anInt9111 * 6);
		@Pc(45) Buffer local45 = local28.method6938();
		if (local45 != null) {
			@Pc(53) Stream local53 = this.aClass43_Sub1_23.method4233(local45);
			@Pc(57) int local57;
			if (Stream.c()) {
				for (local57 = 0; local57 < this.anInt9111; local57++) {
					local53.d(this.aShortArray287[local57]);
					local53.d(this.aShortArray281[local57]);
					local53.d(this.aShortArray286[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt9111; local57++) {
					local53.f(this.aShortArray287[local57]);
					local53.f(this.aShortArray281[local57]);
					local53.f(this.aShortArray286[local57]);
				}
			}
			local53.a();
			if (local28.method6941()) {
				this.aBoolean710 = true;
				this.aClass164_1.aBoolean349 = true;
				this.aClass164_1.anInterface17_5 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt9053; local3++) {
			local12 = this.aShortArray276[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			@Pc(56) int local56 = local12 & 0x7F;
			if (arg2 != -1) {
				local56 -= -((arg2 - local56) * arg3 >> 7);
			}
			this.aShortArray276[local3] = (short) (local18 << 10 | local24 << 7 | local56);
		}
		if (this.aClass308Array1 != null) {
			for (local12 = 0; local12 < this.anInt9041; local12++) {
				@Pc(106) Class308 local106 = this.aClass308Array1[local12];
				@Pc(111) Class251 local111 = this.aClass251Array1[local12];
				local111.anInt6724 = Static213.anIntArray342[this.aShortArray276[local106.anInt7800] & 0xFFFF] & 0xFFFFFF | local111.anInt6724 & 0xFF000000;
			}
		}
		this.method7545();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7502(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			Static45.anInt993 = 0;
			local26 = 0;
			Static369.anInt6328 = 0;
			Static100.anInt2413 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray69.length > local38) {
					local48 = this.anIntArrayArray69[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static100.anInt2413 += this.anIntArray668[local56];
						Static369.anInt6328 += this.anIntArray669[local56];
						local26++;
						Static45.anInt993 += this.anIntArray667[local56];
					}
				}
			}
			if (local26 > 0) {
				Static100.anInt2413 = Static100.anInt2413 / local26 + local14;
				Static369.anInt6328 = Static369.anInt6328 / local26 + local22;
				Static45.anInt993 = Static45.anInt993 / local26 + local18;
			} else {
				Static100.anInt2413 = local14;
				Static45.anInt993 = local18;
				Static369.anInt6328 = local22;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local22 = arg3 << 4;
			local18 = arg4 << 4;
			local14 = arg2 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray69.length > local32) {
					local164 = this.anIntArrayArray69[local32];
					for (local166 = 0; local166 < local164.length; local166++) {
						local50 = local164[local166];
						this.anIntArray668[local50] += local14;
						this.anIntArray669[local50] += local22;
						this.anIntArray667[local50] += local18;
					}
				}
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(306) int local306;
		@Pc(767) int local767;
		@Pc(776) int local776;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray69.length) {
					local164 = this.anIntArrayArray69[local32];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local50 = local164[local166];
							this.anIntArray668[local50] -= Static100.anInt2413;
							this.anIntArray669[local50] -= Static369.anInt6328;
							this.anIntArray667[local50] -= Static45.anInt993;
							if (arg4 != 0) {
								local56 = Class3_Sub17.anIntArray175[arg4];
								local288 = Class3_Sub17.anIntArray177[arg4];
								local306 = this.anIntArray669[local50] * local56 + local288 * this.anIntArray668[local50] + 16383 >> 14;
								this.anIntArray669[local50] = local288 * this.anIntArray669[local50] + 16383 - local56 * this.anIntArray668[local50] >> 14;
								this.anIntArray668[local50] = local306;
							}
							if (arg2 != 0) {
								local56 = Class3_Sub17.anIntArray175[arg2];
								local288 = Class3_Sub17.anIntArray177[arg2];
								local306 = this.anIntArray669[local50] * local288 + 16383 - local56 * this.anIntArray667[local50] >> 14;
								this.anIntArray667[local50] = this.anIntArray669[local50] * local56 + local288 * this.anIntArray667[local50] + 16383 >> 14;
								this.anIntArray669[local50] = local306;
							}
							if (arg3 != 0) {
								local56 = Class3_Sub17.anIntArray175[arg3];
								local288 = Class3_Sub17.anIntArray177[arg3];
								local306 = this.anIntArray667[local50] * local56 + local288 * this.anIntArray668[local50] + 16383 >> 14;
								this.anIntArray667[local50] = local288 * this.anIntArray667[local50] + 16383 - local56 * this.anIntArray668[local50] >> 14;
								this.anIntArray668[local50] = local306;
							}
							this.anIntArray668[local50] += Static100.anInt2413;
							this.anIntArray669[local50] += Static369.anInt6328;
							this.anIntArray667[local50] += Static45.anInt993;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local50 = local164[local166];
							this.anIntArray668[local50] -= Static100.anInt2413;
							this.anIntArray669[local50] -= Static369.anInt6328;
							this.anIntArray667[local50] -= Static45.anInt993;
							if (arg2 != 0) {
								local56 = Class3_Sub17.anIntArray175[arg2];
								local288 = Class3_Sub17.anIntArray177[arg2];
								local306 = this.anIntArray669[local50] * local288 + 16383 - local56 * this.anIntArray667[local50] >> 14;
								this.anIntArray667[local50] = local288 * this.anIntArray667[local50] + local56 * this.anIntArray669[local50] + 16383 >> 14;
								this.anIntArray669[local50] = local306;
							}
							if (arg4 != 0) {
								local56 = Class3_Sub17.anIntArray175[arg4];
								local288 = Class3_Sub17.anIntArray177[arg4];
								local306 = this.anIntArray668[local50] * local288 + this.anIntArray669[local50] * local56 + 16383 >> 14;
								this.anIntArray669[local50] = local288 * this.anIntArray669[local50] + 16383 - local56 * this.anIntArray668[local50] >> 14;
								this.anIntArray668[local50] = local306;
							}
							if (arg3 != 0) {
								local56 = Class3_Sub17.anIntArray175[arg3];
								local288 = Class3_Sub17.anIntArray177[arg3];
								local306 = local56 * this.anIntArray667[local50] + local288 * this.anIntArray668[local50] + 16383 >> 14;
								this.anIntArray667[local50] = local288 * this.anIntArray667[local50] + 16383 - this.anIntArray668[local50] * local56 >> 14;
								this.anIntArray668[local50] = local306;
							}
							this.anIntArray668[local50] += Static100.anInt2413;
							this.anIntArray669[local50] += Static369.anInt6328;
							this.anIntArray667[local50] += Static45.anInt993;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray69.length > local38) {
						local48 = this.anIntArrayArray69[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local288 = this.anIntArray665[local56];
							local306 = this.anIntArray665[local56 + 1];
							for (local767 = local288; local767 < local306; local767++) {
								local776 = this.aShortArray280[local767] - 1;
								if (local776 == -1) {
									break;
								}
								@Pc(786) int local786;
								@Pc(790) int local790;
								@Pc(808) int local808;
								if (arg4 != 0) {
									local786 = Class3_Sub17.anIntArray175[arg4];
									local790 = Class3_Sub17.anIntArray177[arg4];
									local808 = local790 * this.aShortArray279[local776] + local786 * this.aShortArray284[local776] + 16383 >> 14;
									this.aShortArray284[local776] = (short) (this.aShortArray284[local776] * local790 + 16383 - this.aShortArray279[local776] * local786 >> 14);
									this.aShortArray279[local776] = (short) local808;
								}
								if (arg2 != 0) {
									local786 = Class3_Sub17.anIntArray175[arg2];
									local790 = Class3_Sub17.anIntArray177[arg2];
									local808 = this.aShortArray284[local776] * local790 + 16383 - this.aShortArray277[local776] * local786 >> 14;
									this.aShortArray277[local776] = (short) (local786 * this.aShortArray284[local776] + this.aShortArray277[local776] * local790 + 16383 >> 14);
									this.aShortArray284[local776] = (short) local808;
								}
								if (arg3 != 0) {
									local786 = Class3_Sub17.anIntArray175[arg3];
									local790 = Class3_Sub17.anIntArray177[arg3];
									local808 = this.aShortArray279[local776] * local790 + local786 * this.aShortArray277[local776] + 16383 >> 14;
									this.aShortArray277[local776] = (short) (this.aShortArray277[local776] * local790 + 16383 - this.aShortArray279[local776] * local786 >> 14);
									this.aShortArray279[local776] = (short) local808;
								}
							}
						}
					}
				}
				this.method7530();
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray69.length > local32) {
					local164 = this.anIntArrayArray69[local32];
					for (local166 = 0; local166 < local164.length; local166++) {
						local50 = local164[local166];
						this.anIntArray668[local50] -= Static100.anInt2413;
						this.anIntArray669[local50] -= Static369.anInt6328;
						this.anIntArray667[local50] -= Static45.anInt993;
						this.anIntArray668[local50] = this.anIntArray668[local50] * arg2 >> 7;
						this.anIntArray669[local50] = arg3 * this.anIntArray669[local50] >> 7;
						this.anIntArray667[local50] = this.anIntArray667[local50] * arg4 >> 7;
						this.anIntArray668[local50] += Static100.anInt2413;
						this.anIntArray669[local50] += Static369.anInt6328;
						this.anIntArray667[local50] += Static45.anInt993;
					}
				}
			}
		} else {
			@Pc(1212) Class251 local1212;
			@Pc(1112) boolean local1112;
			@Pc(1207) Class308 local1207;
			if (arg0 == 5) {
				if (this.anIntArrayArray68 != null) {
					local1112 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray68.length) {
							local48 = this.anIntArrayArray68[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local288 = (this.aByteArray103[local56] & 0xFF) + (arg2 * 8);
								if (local288 < 0) {
									local288 = 0;
								} else if (local288 > 255) {
									local288 = 255;
								}
								this.aByteArray103[local56] = (byte) local288;
							}
							local1112 |= local48.length > 0;
						}
					}
					if (local1112) {
						if (this.aClass308Array1 != null) {
							for (local38 = 0; local38 < this.anInt9041; local38++) {
								local1207 = this.aClass308Array1[local38];
								local1212 = this.aClass251Array1[local38];
								local1212.anInt6724 = 255 - (this.aByteArray103[local1207.anInt7800] & 0xFF) << 24 | local1212.anInt6724 & 0xFFFFFF;
							}
						}
						this.method7545();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray68 != null) {
					local1112 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray68.length > local38) {
							local48 = this.anIntArrayArray68[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local288 = this.aShortArray276[local56] & 0xFFFF;
								local306 = local288 >> 10 & 0x3F;
								local767 = local288 >> 7 & 0x7;
								@Pc(1309) int local1309 = arg2 + local306 & 0x3F;
								local776 = local288 & 0x7F;
								local767 += arg3 / 4;
								if (local767 < 0) {
									local767 = 0;
								} else if (local767 > 7) {
									local767 = 7;
								}
								local776 += arg4;
								if (local776 < 0) {
									local776 = 0;
								} else if (local776 > 127) {
									local776 = 127;
								}
								this.aShortArray276[local56] = (short) (local776 | local767 << 7 | local1309 << 10);
							}
							local1112 |= local48.length > 0;
						}
					}
					if (local1112) {
						if (this.aClass308Array1 != null) {
							for (local38 = 0; local38 < this.anInt9041; local38++) {
								local1207 = this.aClass308Array1[local38];
								local1212 = this.aClass251Array1[local38];
								local1212.anInt6724 = Static213.anIntArray342[this.aShortArray276[local1207.anInt7800] & 0xFFFF] & 0xFFFFFF | local1212.anInt6724 & 0xFF000000;
							}
						}
						this.method7545();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray67 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray67.length) {
							local164 = this.anIntArrayArray67[local32];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1212 = this.aClass251Array1[local164[local166]];
								local1212.anInt6721 += arg2;
								local1212.anInt6726 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray67 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray67.length > local32) {
							local164 = this.anIntArrayArray67[local32];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1212 = this.aClass251Array1[local164[local166]];
								local1212.anInt6720 = arg3 * local1212.anInt6720 >> 7;
								local1212.anInt6722 = local1212.anInt6722 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray67 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray67.length) {
						local164 = this.anIntArrayArray67[local32];
						for (local166 = 0; local166 < local164.length; local166++) {
							local1212 = this.aClass251Array1[local164[local166]];
							local1212.anInt6727 = local1212.anInt6727 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7524(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class57_Sub3 local8 = (Class57_Sub3) arg0;
		if (this.anInt9053 == 0 || local8.anInt9053 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt9081;
		@Pc(24) int[] local24 = local8.anIntArray668;
		@Pc(27) int[] local27 = local8.anIntArray669;
		@Pc(30) int[] local30 = local8.anIntArray667;
		@Pc(33) short[] local33 = local8.aShortArray279;
		@Pc(36) short[] local36 = local8.aShortArray284;
		@Pc(39) short[] local39 = local8.aShortArray277;
		@Pc(42) byte[] local42 = local8.aByteArray102;
		@Pc(49) short[] local49;
		@Pc(53) short[] local53;
		@Pc(47) short[] local47;
		@Pc(51) byte[] local51;
		if (this.aClass205_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local47 = this.aClass205_1.aShortArray153;
			local49 = this.aClass205_1.aShortArray155;
			local53 = this.aClass205_1.aShortArray154;
			local51 = this.aClass205_1.aByteArray65;
		}
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(80) short[] local80;
		@Pc(76) byte[] local76;
		if (local8.aClass205_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass205_1.aShortArray153;
			local82 = local8.aClass205_1.aShortArray154;
			local76 = local8.aClass205_1.aByteArray65;
			local78 = local8.aClass205_1.aShortArray155;
		}
		@Pc(103) int[] local103 = local8.anIntArray665;
		@Pc(106) short[] local106 = local8.aShortArray280;
		if (!local8.aBoolean708) {
			local8.method7537();
		}
		@Pc(115) int local115 = local8.anInt9118;
		@Pc(118) int local118 = local8.anInt9107;
		@Pc(121) int local121 = local8.anInt9060;
		@Pc(124) int local124 = local8.anInt9056;
		@Pc(127) int local127 = local8.anInt9119;
		@Pc(130) int local130 = local8.anInt9052;
		for (@Pc(132) int local132 = 0; local132 < this.anInt9081; local132++) {
			@Pc(141) int local141 = this.anIntArray669[local132] - arg2;
			if (local141 >= local115 && local141 <= local118) {
				@Pc(161) int local161 = this.anIntArray668[local132] - arg1;
				if (local121 <= local161 && local124 >= local161) {
					@Pc(177) int local177 = this.anIntArray667[local132] - arg3;
					if (local177 >= local127 && local130 >= local177) {
						@Pc(187) int local187 = -1;
						@Pc(192) int local192 = this.anIntArray665[local132];
						@Pc(199) int local199 = this.anIntArray665[local132 + 1];
						for (@Pc(201) int local201 = local192; local201 < local199; local201++) {
							local187 = this.aShortArray280[local201] - 1;
							if (local187 == -1 || this.aByteArray102[local187] != 0) {
								break;
							}
						}
						if (local187 != -1) {
							for (@Pc(230) int local230 = 0; local230 < local21; local230++) {
								if (local161 == local24[local230] && local177 == local30[local230] && local27[local230] == local141) {
									local192 = local103[local230];
									local199 = local103[local230 + 1];
									@Pc(267) int local267 = -1;
									for (@Pc(269) int local269 = local192; local269 < local199; local269++) {
										local267 = local106[local269] - 1;
										if (local267 == -1 || local42[local267] != 0) {
											break;
										}
									}
									if (local267 != -1) {
										if (local49 == null) {
											this.aClass205_1 = new Class205();
											local49 = this.aClass205_1.aShortArray155 = Static89.method2017(this.aShortArray279);
											local53 = this.aClass205_1.aShortArray154 = Static89.method2017(this.aShortArray284);
											local47 = this.aClass205_1.aShortArray153 = Static89.method2017(this.aShortArray277);
											local51 = this.aClass205_1.aByteArray65 = Static339.method5176(this.aByteArray102);
										}
										if (local78 == null) {
											@Pc(349) Class205 local349 = local8.aClass205_1 = new Class205();
											local78 = local349.aShortArray155 = Static89.method2017(local33);
											local82 = local349.aShortArray154 = Static89.method2017(local36);
											local80 = local349.aShortArray153 = Static89.method2017(local39);
											local76 = local349.aByteArray65 = Static339.method5176(local42);
										}
										@Pc(382) short local382 = this.aShortArray279[local187];
										@Pc(387) short local387 = this.aShortArray284[local187];
										@Pc(392) short local392 = this.aShortArray277[local187];
										@Pc(397) byte local397 = this.aByteArray102[local187];
										local199 = local103[local230 + 1];
										local192 = local103[local230];
										@Pc(417) int local417;
										for (@Pc(409) int local409 = local192; local409 < local199; local409++) {
											local417 = local106[local409] - 1;
											if (local417 == -1) {
												break;
											}
											if (local76[local417] != 0) {
												local78[local417] += local382;
												local82[local417] += local387;
												local80[local417] += local392;
												local76[local417] += local397;
											}
										}
										local387 = local36[local267];
										local397 = local42[local267];
										local392 = local39[local267];
										local382 = local33[local267];
										local199 = this.anIntArray665[local132 + 1];
										local192 = this.anIntArray665[local132];
										for (local417 = local192; local417 < local199; local417++) {
											@Pc(502) int local502 = this.aShortArray280[local417] - 1;
											if (local502 == -1) {
												break;
											}
											if (local51[local502] != 0) {
												local49[local502] += local382;
												local53[local502] += local387;
												local47[local502] += local392;
												local51[local502] += local397;
											}
										}
										local8.method7530();
										this.method7530();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean708) {
			this.method7537();
		}
		return this.anInt9052;
	}

	@OriginalMember(owner = "client!vl", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean708) {
			this.method7537();
		}
		return this.anInt9119;
	}

	@OriginalMember(owner = "client!vl", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort116;
	}

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean708) {
			this.method7537();
		}
		return this.anInt9056;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZIZLclient!vl;BLclient!vl;)Lclient!da;")
	private Class57 method7535(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class57_Sub3 arg3, @OriginalArg(5) Class57_Sub3 arg4) {
		arg4.anInt9041 = this.anInt9041;
		arg4.anInt9076 = this.anInt9076;
		arg4.anInt9064 = arg1;
		arg4.anInt9111 = this.anInt9111;
		if ((arg1 & 0x100) == 0) {
			arg4.aBoolean709 = this.aBoolean709;
		} else {
			arg4.aBoolean709 = true;
		}
		arg4.anInt9053 = this.anInt9053;
		arg4.anInt9081 = this.anInt9081;
		arg4.aShort116 = this.aShort116;
		arg4.aShort117 = this.aShort117;
		arg4.anInt9093 = this.anInt9093;
		arg4.anInt9086 = this.anInt9086;
		@Pc(71) boolean local71 = Static70.method7721(arg1, this.anInt9093);
		@Pc(77) boolean local77 = Static386.method5701(this.anInt9093, arg1);
		@Pc(83) boolean local83 = Static596.method7818(this.anInt9093, arg1);
		@Pc(89) boolean local89 = local83 | local77 | local71;
		@Pc(208) int local208;
		if (local89) {
			if (!local71) {
				arg4.anIntArray668 = this.anIntArray668;
			} else if (arg3.anIntArray668 == null || arg3.anIntArray668.length < this.anInt9076) {
				arg4.anIntArray668 = arg3.anIntArray668 = new int[this.anInt9076];
			} else {
				arg4.anIntArray668 = arg3.anIntArray668;
			}
			if (!local77) {
				arg4.anIntArray669 = this.anIntArray669;
			} else if (arg3.anIntArray669 == null || this.anInt9076 > arg3.anIntArray669.length) {
				arg4.anIntArray669 = arg3.anIntArray669 = new int[this.anInt9076];
			} else {
				arg4.anIntArray669 = arg3.anIntArray669;
			}
			if (!local83) {
				arg4.anIntArray667 = this.anIntArray667;
			} else if (arg3.anIntArray667 == null || this.anInt9076 > arg3.anIntArray667.length) {
				arg4.anIntArray667 = arg3.anIntArray667 = new int[this.anInt9076];
			} else {
				arg4.anIntArray667 = arg3.anIntArray667;
			}
			for (local208 = 0; local208 < this.anInt9076; local208++) {
				if (local71) {
					arg4.anIntArray668[local208] = this.anIntArray668[local208];
				}
				if (local77) {
					arg4.anIntArray669[local208] = this.anIntArray669[local208];
				}
				if (local83) {
					arg4.anIntArray667[local208] = this.anIntArray667[local208];
				}
			}
		} else {
			arg4.anIntArray668 = this.anIntArray668;
			arg4.anIntArray669 = this.anIntArray669;
			arg4.anIntArray667 = this.anIntArray667;
		}
		if (Static524.method6964(this.anInt9093, arg1)) {
			arg4.aClass62_3 = arg3.aClass62_3;
			arg4.aClass62_3.aBoolean182 = this.aClass62_3.aBoolean182;
			arg4.aClass62_3.aBoolean181 = true;
			arg4.aClass62_3.anInterface24_4 = this.aClass62_3.anInterface24_4;
		} else if (Static579.method7688(this.anInt9093, arg1)) {
			arg4.aClass62_3 = this.aClass62_3;
		} else {
			arg4.aClass62_3 = null;
		}
		if (Static447.method6264(arg1, this.anInt9093)) {
			if (arg3.aShortArray276 == null || arg3.aShortArray276.length < this.anInt9053) {
				arg4.aShortArray276 = arg3.aShortArray276 = new short[this.anInt9053];
			} else {
				arg4.aShortArray276 = arg3.aShortArray276;
			}
			for (local208 = 0; local208 < this.anInt9053; local208++) {
				arg4.aShortArray276[local208] = this.aShortArray276[local208];
			}
		} else {
			arg4.aShortArray276 = this.aShortArray276;
		}
		if (Static442.method7196(arg1, this.anInt9093)) {
			if (arg3.aByteArray103 == null || arg3.aByteArray103.length < this.anInt9053) {
				arg4.aByteArray103 = arg3.aByteArray103 = new byte[this.anInt9053];
			} else {
				arg4.aByteArray103 = arg3.aByteArray103;
			}
			for (local208 = 0; local208 < this.anInt9053; local208++) {
				arg4.aByteArray103[local208] = this.aByteArray103[local208];
			}
		} else {
			arg4.aByteArray103 = this.aByteArray103;
		}
		if (Static330.method5099(this.anInt9093, arg1)) {
			arg4.aClass62_2 = arg3.aClass62_2;
			arg4.aClass62_2.anInterface24_4 = this.aClass62_2.anInterface24_4;
			arg4.aClass62_2.aBoolean181 = true;
			arg4.aClass62_2.aBoolean182 = this.aClass62_2.aBoolean182;
		} else if (Static215.method3769(arg1, this.anInt9093)) {
			arg4.aClass62_2 = this.aClass62_2;
		} else {
			arg4.aClass62_2 = null;
		}
		@Pc(571) int local571;
		if (Static188.method3226(arg1, this.anInt9093)) {
			if (arg3.aShortArray279 == null || this.anInt9086 > arg3.aShortArray279.length) {
				local208 = this.anInt9086;
				arg4.aShortArray277 = arg3.aShortArray277 = new short[local208];
				arg4.aShortArray279 = arg3.aShortArray279 = new short[local208];
				arg4.aShortArray284 = arg3.aShortArray284 = new short[local208];
			} else {
				arg4.aShortArray284 = arg3.aShortArray284;
				arg4.aShortArray279 = arg3.aShortArray279;
				arg4.aShortArray277 = arg3.aShortArray277;
			}
			if (this.aClass205_1 == null) {
				arg4.aClass205_1 = null;
				for (local208 = 0; local208 < this.anInt9086; local208++) {
					arg4.aShortArray279[local208] = this.aShortArray279[local208];
					arg4.aShortArray284[local208] = this.aShortArray284[local208];
					arg4.aShortArray277[local208] = this.aShortArray277[local208];
				}
			} else {
				if (arg3.aClass205_1 == null) {
					arg3.aClass205_1 = new Class205();
				}
				@Pc(555) Class205 local555 = arg4.aClass205_1 = arg3.aClass205_1;
				if (local555.aShortArray155 == null || this.anInt9086 > local555.aShortArray155.length) {
					local571 = this.anInt9086;
					local555.aShortArray154 = new short[local571];
					local555.aByteArray65 = new byte[local571];
					local555.aShortArray153 = new short[local571];
					local555.aShortArray155 = new short[local571];
				}
				for (local571 = 0; local571 < this.anInt9086; local571++) {
					arg4.aShortArray279[local571] = this.aShortArray279[local571];
					arg4.aShortArray284[local571] = this.aShortArray284[local571];
					arg4.aShortArray277[local571] = this.aShortArray277[local571];
					local555.aShortArray155[local571] = this.aClass205_1.aShortArray155[local571];
					local555.aShortArray154[local571] = this.aClass205_1.aShortArray154[local571];
					local555.aShortArray153[local571] = this.aClass205_1.aShortArray153[local571];
					local555.aByteArray65[local571] = this.aClass205_1.aByteArray65[local571];
				}
			}
			arg4.aByteArray102 = this.aByteArray102;
		} else {
			arg4.aShortArray279 = this.aShortArray279;
			arg4.aShortArray284 = this.aShortArray284;
			arg4.aByteArray102 = this.aByteArray102;
			arg4.aShortArray277 = this.aShortArray277;
			arg4.aClass205_1 = this.aClass205_1;
		}
		if (Static230.method3918(this.anInt9093, arg1)) {
			arg4.aClass62_4 = arg3.aClass62_4;
			arg4.aClass62_4.aBoolean182 = this.aClass62_4.aBoolean182;
			arg4.aClass62_4.anInterface24_4 = this.aClass62_4.anInterface24_4;
			arg4.aClass62_4.aBoolean181 = true;
		} else if (Static530.method6997(arg1, this.anInt9093)) {
			arg4.aClass62_4 = this.aClass62_4;
		} else {
			arg4.aClass62_4 = null;
		}
		if (Static199.method3589(this.anInt9093, arg1)) {
			if (arg3.aFloatArray71 == null || this.anInt9053 > arg3.aFloatArray71.length) {
				local208 = this.anInt9086;
				arg4.aFloatArray68 = arg3.aFloatArray68 = new float[local208];
				arg4.aFloatArray71 = arg3.aFloatArray71 = new float[local208];
			} else {
				arg4.aFloatArray68 = arg3.aFloatArray68;
				arg4.aFloatArray71 = arg3.aFloatArray71;
			}
			for (local208 = 0; local208 < this.anInt9086; local208++) {
				arg4.aFloatArray71[local208] = this.aFloatArray71[local208];
				arg4.aFloatArray68[local208] = this.aFloatArray68[local208];
			}
		} else {
			arg4.aFloatArray68 = this.aFloatArray68;
			arg4.aFloatArray71 = this.aFloatArray71;
		}
		if (Static92.method2051(arg1, this.anInt9093)) {
			arg4.aClass62_1 = arg3.aClass62_1;
			arg4.aClass62_1.aBoolean181 = true;
			arg4.aClass62_1.aBoolean182 = this.aClass62_1.aBoolean182;
			arg4.aClass62_1.anInterface24_4 = this.aClass62_1.anInterface24_4;
		} else if (Static214.method3765(arg1, this.anInt9093)) {
			arg4.aClass62_1 = this.aClass62_1;
		} else {
			arg4.aClass62_1 = null;
		}
		if (Static90.method2035(this.anInt9093, arg1)) {
			if (arg3.aShortArray287 == null || this.anInt9053 > arg3.aShortArray287.length) {
				local208 = this.anInt9053;
				arg4.aShortArray281 = arg3.aShortArray281 = new short[local208];
				arg4.aShortArray286 = arg3.aShortArray286 = new short[local208];
				arg4.aShortArray287 = arg3.aShortArray287 = new short[local208];
			} else {
				arg4.aShortArray286 = arg3.aShortArray286;
				arg4.aShortArray281 = arg3.aShortArray281;
				arg4.aShortArray287 = arg3.aShortArray287;
			}
			for (local208 = 0; local208 < this.anInt9053; local208++) {
				arg4.aShortArray287[local208] = this.aShortArray287[local208];
				arg4.aShortArray281[local208] = this.aShortArray281[local208];
				arg4.aShortArray286[local208] = this.aShortArray286[local208];
			}
		} else {
			arg4.aShortArray281 = this.aShortArray281;
			arg4.aShortArray287 = this.aShortArray287;
			arg4.aShortArray286 = this.aShortArray286;
		}
		if (Static350.method6850(this.anInt9093, arg1)) {
			arg4.aClass164_1 = arg3.aClass164_1;
			arg4.aClass164_1.aBoolean350 = true;
			arg4.aClass164_1.aBoolean349 = this.aClass164_1.aBoolean349;
			arg4.aClass164_1.anInterface17_5 = this.aClass164_1.anInterface17_5;
		} else if (Static373.method5516(this.anInt9093, arg1)) {
			arg4.aClass164_1 = this.aClass164_1;
		} else {
			arg4.aClass164_1 = null;
		}
		if (Static321.method5001(this.anInt9093, arg1)) {
			if (arg3.aShortArray275 == null || arg3.aShortArray275.length < this.anInt9053) {
				local208 = this.anInt9053;
				arg4.aShortArray275 = arg3.aShortArray275 = new short[local208];
			} else {
				arg4.aShortArray275 = arg3.aShortArray275;
			}
			for (local208 = 0; local208 < this.anInt9053; local208++) {
				arg4.aShortArray275[local208] = this.aShortArray275[local208];
			}
		} else {
			arg4.aShortArray275 = this.aShortArray275;
		}
		if (!Static258.method4314(arg1, this.anInt9093)) {
			arg4.aClass251Array1 = this.aClass251Array1;
		} else if (arg3.aClass251Array1 == null || this.anInt9041 > arg3.aClass251Array1.length) {
			local208 = this.anInt9041;
			arg4.aClass251Array1 = arg3.aClass251Array1 = new Class251[local208];
			for (local571 = 0; local571 < this.anInt9041; local571++) {
				arg4.aClass251Array1[local571] = this.aClass251Array1[local571].method5748();
			}
		} else {
			arg4.aClass251Array1 = arg3.aClass251Array1;
			for (local208 = 0; local208 < this.anInt9041; local208++) {
				arg4.aClass251Array1[local208].method5751(this.aClass251Array1[local208]);
			}
		}
		if (this.aBoolean708) {
			arg4.anInt9061 = this.anInt9061;
			arg4.anInt9056 = this.anInt9056;
			arg4.anInt9102 = this.anInt9102;
			arg4.anInt9060 = this.anInt9060;
			arg4.anInt9119 = this.anInt9119;
			arg4.anInt9052 = this.anInt9052;
			arg4.aBoolean708 = true;
			arg4.anInt9118 = this.anInt9118;
			arg4.anInt9107 = this.anInt9107;
		} else {
			arg4.aBoolean708 = false;
		}
		arg4.anIntArrayArray69 = this.anIntArrayArray69;
		arg4.aClass15Array5 = this.aClass15Array5;
		arg4.aShortArray278 = this.aShortArray278;
		arg4.anIntArray663 = this.anIntArray663;
		arg4.anIntArray666 = this.anIntArray666;
		arg4.anIntArray665 = this.anIntArray665;
		arg4.anIntArrayArray68 = this.anIntArrayArray68;
		arg4.aShortArray280 = this.aShortArray280;
		arg4.aShortArray283 = this.aShortArray283;
		arg4.anIntArrayArray67 = this.anIntArrayArray67;
		arg4.aShortArray285 = this.aShortArray285;
		arg4.aClass323Array5 = this.aClass323Array5;
		arg4.aClass308Array1 = this.aClass308Array1;
		arg4.aShortArray282 = this.aShortArray282;
		arg4.anIntArray664 = this.anIntArray664;
		return arg4;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	private void method7536() {
		if (this.aClass308Array1 == null) {
			return;
		}
		this.aClass43_Sub1_23.ZA(false);
		this.aClass43_Sub1_23.method4301(false);
		this.aClass43_Sub1_23.method4251(1, Static88.aClass252_2);
		this.aClass43_Sub1_23.method4241(1, Static88.aClass252_2);
		for (@Pc(31) int local31 = 0; local31 < this.anInt9041; local31++) {
			@Pc(38) Class308 local38 = this.aClass308Array1[local31];
			@Pc(43) Class251 local43 = this.aClass251Array1[local31];
			if (!local38.aBoolean613 || !this.aClass43_Sub1_23.method7216()) {
				@Pc(73) float local73 = (float) (this.anIntArray668[local38.anInt7801] + this.anIntArray668[local38.anInt7797] + this.anIntArray668[local38.anInt7796]) * 0.3333333F;
				@Pc(95) float local95 = (float) (this.anIntArray669[local38.anInt7797] + this.anIntArray669[local38.anInt7801] + this.anIntArray669[local38.anInt7796]) * 0.3333333F;
				@Pc(117) float local117 = (float) (this.anIntArray667[local38.anInt7797] + this.anIntArray667[local38.anInt7801] + this.anIntArray667[local38.anInt7796]) * 0.3333333F;
				@Pc(131) float local131 = Static424.aFloat150 * local117 + Static110.aFloat39 * local95 + local73 * Static539.aFloat116 + Static555.aFloat220;
				@Pc(145) float local145 = Static121.aFloat43 * local95 + local73 * Static198.aFloat82 + Static10.aFloat2 * local117 + Static510.aFloat177;
				@Pc(159) float local159 = Static367.aFloat131 + Static162.aFloat62 * local73 + Static50.aFloat9 * local95 + local117 * Static472.aFloat156;
				@Pc(164) Class109_Sub3 local164 = this.aClass43_Sub1_23.method4172();
				local164.method7123(local43.anInt6727, (float) local43.anInt6726 + local145, local43.anInt6720 * local38.aShort110 >> 7, (float) -local38.anInt7795 + local159, local43.anInt6722 * local38.aShort108 >> 7, (float) local43.anInt6721 + local131);
				local164.method7114(this.aClass43_Sub1_23.aClass109_Sub3_17);
				this.aClass43_Sub1_23.method4287();
				@Pc(214) int local214 = local43.anInt6724;
				this.aClass43_Sub1_23.method4237(local38.aShort109, false, false);
				this.aClass43_Sub1_23.method4273(local38.aByte116);
				this.aClass43_Sub1_23.method4266(local214);
				this.aClass43_Sub1_23.method4231();
			}
		}
		this.aClass43_Sub1_23.method4241(1, Static165.aClass252_3);
		this.aClass43_Sub1_23.method4251(1, Static165.aClass252_3);
		this.aClass43_Sub1_23.ZA(true);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!q;Lclient!ql;I)V")
	@Override
	public void method7501(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9086 == 0) {
			return;
		}
		@Pc(13) Class109_Sub3 local13 = this.aClass43_Sub1_23.aClass109_Sub3_16;
		@Pc(16) Class109_Sub3 local16 = (Class109_Sub3) arg0;
		if (!this.aBoolean708) {
			this.method7537();
		}
		Static367.aFloat131 = local13.aFloat189 + local13.aFloat197 * local16.aFloat189 + local13.aFloat194 * local16.aFloat192 + local16.aFloat188 * local13.aFloat196;
		Static50.aFloat9 = local16.aFloat196 * local13.aFloat197 + local13.aFloat194 * local16.aFloat187 + local16.aFloat186 * local13.aFloat196;
		@Pc(69) float local69 = (float) this.anInt9118 * Static50.aFloat9 + Static367.aFloat131;
		@Pc(77) float local77 = (float) this.anInt9107 * Static50.aFloat9 + Static367.aFloat131;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = (float) this.anInt9061 + local69;
			local94 = (float) -this.anInt9061 + local77;
		} else {
			local87 = (float) this.anInt9061 + local77;
			local94 = local69 - (float) this.anInt9061;
		}
		if (this.aClass43_Sub1_23.aFloat99 <= local94 || local87 <= (float) this.aClass43_Sub1_23.anInt4814) {
			return;
		}
		Static555.aFloat220 = local13.aFloat193 * local16.aFloat192 + local13.aFloat187 * local16.aFloat188 + local13.aFloat195 * local16.aFloat189 + local13.aFloat192;
		Static110.aFloat39 = local13.aFloat187 * local16.aFloat186 + local16.aFloat187 * local13.aFloat193 + local16.aFloat196 * local13.aFloat195;
		@Pc(170) float local170 = Static555.aFloat220 + (float) this.anInt9118 * Static110.aFloat39;
		@Pc(178) float local178 = Static555.aFloat220 + (float) this.anInt9107 * Static110.aFloat39;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = (float) this.aClass43_Sub1_23.anInt4838 * (local170 + (float) this.anInt9061);
			local204 = (float) this.aClass43_Sub1_23.anInt4838 * (local178 - (float) this.anInt9061);
		} else {
			local204 = (float) this.aClass43_Sub1_23.anInt4838 * ((float) -this.anInt9061 + local170);
			local193 = ((float) this.anInt9061 + local178) * (float) this.aClass43_Sub1_23.anInt4838;
		}
		if (local204 / local87 >= this.aClass43_Sub1_23.aFloat92 || this.aClass43_Sub1_23.aFloat101 >= local193 / local87) {
			return;
		}
		Static121.aFloat43 = local13.aFloat186 * local16.aFloat186 + local13.aFloat191 * local16.aFloat187 + local13.aFloat190 * local16.aFloat196;
		Static510.aFloat177 = local16.aFloat188 * local13.aFloat186 + local16.aFloat192 * local13.aFloat191 + local16.aFloat189 * local13.aFloat190 + local13.aFloat188;
		@Pc(294) float local294 = (float) this.anInt9118 * Static121.aFloat43 + Static510.aFloat177;
		@Pc(302) float local302 = Static510.aFloat177 + Static121.aFloat43 * (float) this.anInt9107;
		@Pc(318) float local318;
		@Pc(329) float local329;
		if (local294 > local302) {
			local329 = ((float) this.anInt9061 + local294) * (float) this.aClass43_Sub1_23.anInt4815;
			local318 = (local302 - (float) this.anInt9061) * (float) this.aClass43_Sub1_23.anInt4815;
		} else {
			local318 = (float) this.aClass43_Sub1_23.anInt4815 * ((float) -this.anInt9061 + local294);
			local329 = (float) this.aClass43_Sub1_23.anInt4815 * (local302 + (float) this.anInt9061);
		}
		if (local318 / local87 >= this.aClass43_Sub1_23.aFloat95 || this.aClass43_Sub1_23.aFloat104 >= local329 / local87) {
			return;
		}
		if (arg1 != null || this.aClass308Array1 != null) {
			Static472.aFloat156 = local16.aFloat195 * local13.aFloat194 + local13.aFloat196 * local16.aFloat190 + local13.aFloat197 * local16.aFloat197;
			Static198.aFloat82 = local16.aFloat193 * local13.aFloat191 + local13.aFloat186 * local16.aFloat191 + local16.aFloat194 * local13.aFloat190;
			Static10.aFloat2 = local16.aFloat195 * local13.aFloat191 + local13.aFloat186 * local16.aFloat190 + local13.aFloat190 * local16.aFloat197;
			Static162.aFloat62 = local16.aFloat193 * local13.aFloat194 + local13.aFloat196 * local16.aFloat191 + local13.aFloat197 * local16.aFloat194;
			Static539.aFloat116 = local16.aFloat193 * local13.aFloat193 + local13.aFloat187 * local16.aFloat191 + local13.aFloat195 * local16.aFloat194;
			Static424.aFloat150 = local16.aFloat195 * local13.aFloat193 + local13.aFloat187 * local16.aFloat190 + local16.aFloat197 * local13.aFloat195;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(499) int local499 = this.anInt9060 + this.anInt9056 >> 1;
			@Pc(507) int local507 = this.anInt9052 + this.anInt9119 >> 1;
			@Pc(526) int local526 = (int) ((float) local499 * Static539.aFloat116 + Static555.aFloat220 + (float) this.anInt9118 * Static110.aFloat39 + (float) local507 * Static424.aFloat150);
			@Pc(545) int local545 = (int) ((float) this.anInt9118 * Static121.aFloat43 + Static510.aFloat177 + Static198.aFloat82 * (float) local499 + (float) local507 * Static10.aFloat2);
			@Pc(564) int local564 = (int) ((float) local507 * Static472.aFloat156 + Static367.aFloat131 + (float) local499 * Static162.aFloat62 + Static50.aFloat9 * (float) this.anInt9118);
			if (this.aClass43_Sub1_23.anInt4814 > local564) {
				local488 = true;
			} else {
				arg1.anInt7169 = local526 * this.aClass43_Sub1_23.anInt4838 / local564 + this.aClass43_Sub1_23.anInt4839;
				arg1.anInt7173 = this.aClass43_Sub1_23.anInt4818 + local545 * this.aClass43_Sub1_23.anInt4815 / local564;
			}
			@Pc(618) int local618 = (int) (Static555.aFloat220 + (float) local499 * Static539.aFloat116 + (float) this.anInt9107 * Static110.aFloat39 + (float) local507 * Static424.aFloat150);
			@Pc(637) int local637 = (int) ((float) local507 * Static10.aFloat2 + (float) this.anInt9107 * Static121.aFloat43 + (float) local499 * Static198.aFloat82 + Static510.aFloat177);
			@Pc(656) int local656 = (int) ((float) local507 * Static472.aFloat156 + Static367.aFloat131 + (float) local499 * Static162.aFloat62 + Static50.aFloat9 * (float) this.anInt9107);
			if (this.aClass43_Sub1_23.anInt4814 > local656) {
				local488 = true;
			} else {
				arg1.anInt7171 = this.aClass43_Sub1_23.anInt4818 + local637 * this.aClass43_Sub1_23.anInt4815 / local656;
				arg1.anInt7170 = this.aClass43_Sub1_23.anInt4839 + local618 * this.aClass43_Sub1_23.anInt4838 / local656;
			}
			if (local488) {
				if (local564 < this.aClass43_Sub1_23.anInt4814 && local656 < this.aClass43_Sub1_23.anInt4814) {
					local490 = false;
				} else {
					@Pc(737) int local737;
					@Pc(748) int local748;
					@Pc(760) int local760;
					if (this.aClass43_Sub1_23.anInt4814 > local564) {
						local737 = (local656 - this.aClass43_Sub1_23.anInt4814 << 16) / (local656 - local564);
						local748 = local618 + (local737 * (local618 - local526) >> 16);
						arg1.anInt7169 = this.aClass43_Sub1_23.anInt4839 + local748 * this.aClass43_Sub1_23.anInt4838 / this.aClass43_Sub1_23.anInt4814;
						local760 = local637 + ((local637 - local545) * local737 >> 16);
						arg1.anInt7173 = this.aClass43_Sub1_23.anInt4818 + local760 * this.aClass43_Sub1_23.anInt4815 / this.aClass43_Sub1_23.anInt4814;
					} else if (this.aClass43_Sub1_23.anInt4814 > local656) {
						local737 = (local564 - this.aClass43_Sub1_23.anInt4814 << 16) / (local564 - local656);
						local748 = local526 + (local737 * (local526 - local618) >> 16);
						local760 = local545 + (local737 * (local545 - local637) >> 16);
						arg1.anInt7169 = this.aClass43_Sub1_23.anInt4839 + local748 * this.aClass43_Sub1_23.anInt4838 / this.aClass43_Sub1_23.anInt4814;
						arg1.anInt7173 = this.aClass43_Sub1_23.anInt4818 + this.aClass43_Sub1_23.anInt4815 * local760 / this.aClass43_Sub1_23.anInt4814;
					}
				}
			}
			if (local490) {
				arg1.aBoolean567 = true;
				if (local564 <= local656) {
					arg1.anInt7172 = this.aClass43_Sub1_23.anInt4838 * (local618 + this.anInt9061) / local656 + this.aClass43_Sub1_23.anInt4839 - arg1.anInt7170;
				} else {
					arg1.anInt7172 = this.aClass43_Sub1_23.anInt4838 * (this.anInt9061 + local526) / local564 + this.aClass43_Sub1_23.anInt4839 - arg1.anInt7169;
				}
			}
		}
		this.aClass43_Sub1_23.method4203();
		this.aClass43_Sub1_23.method4216(local16);
		this.method7539();
		this.method7536();
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V")
	private void method7537() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt9081; local23++) {
			@Pc(30) int local30 = this.anIntArray668[local23];
			@Pc(35) int local35 = this.anIntArray669[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			@Pc(49) int local49 = this.anIntArray667[local23];
			if (local35 > local15) {
				local15 = local35;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local49 > local17) {
				local17 = local49;
			}
			if (local49 < local11) {
				local11 = local49;
			}
			@Pc(98) int local98 = local49 * local49 + local30 * local30;
			if (local19 < local98) {
				local19 = local98;
			}
			local98 = local35 * local35 + local30 * local30 + local49 * local49;
			if (local98 > local21) {
				local21 = local98;
			}
		}
		this.anInt9107 = local15;
		this.anInt9052 = local17;
		this.anInt9119 = local11;
		this.anInt9056 = local13;
		this.anInt9060 = local7;
		this.anInt9118 = local9;
		this.anInt9061 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt9102 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean708 = true;
	}

	@OriginalMember(owner = "client!vl", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9076; local7++) {
			this.anIntArray668[local7] = this.anIntArray668[local7] + 7 >> 4;
			this.anIntArray669[local7] = this.anIntArray669[local7] + 7 >> 4;
			this.anIntArray667[local7] = this.anIntArray667[local7] + 7 >> 4;
		}
		this.method7543();
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!vl", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9081; local3++) {
			if (arg0 != 0) {
				this.anIntArray668[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray669[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray667[local3] += arg2;
			}
		}
		this.method7543();
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "()Z")
	@Override
	public boolean method7526() {
		if (this.aShortArray275 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray275.length; local12++) {
			if (this.aShortArray275[local12] != -1 && !this.aClass43_Sub1_23.anInterface8_12.method6559(this.aShortArray275[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
	private void method7538() {
		if (!this.aBoolean710) {
			return;
		}
		this.aBoolean710 = false;
		if (this.aClass323Array5 == null && this.aClass15Array5 == null && this.aClass308Array1 == null) {
			if (this.anIntArray668 != null && !Static443.method6214(this.anInt9093, this.anInt9064)) {
				if (this.aClass62_3 == null || this.aClass62_3.method1947()) {
					if (!this.aBoolean708) {
						this.method7537();
					}
					this.anIntArray668 = null;
				} else {
					this.aBoolean710 = true;
				}
			}
			if (this.anIntArray669 != null && !Static152.method2799(this.anInt9093, this.anInt9064)) {
				if (this.aClass62_3 == null || this.aClass62_3.method1947()) {
					if (!this.aBoolean708) {
						this.method7537();
					}
					this.anIntArray669 = null;
				} else {
					this.aBoolean710 = true;
				}
			}
			if (this.anIntArray667 != null && !Static12.method128(this.anInt9064, this.anInt9093)) {
				if (this.aClass62_3 == null || this.aClass62_3.method1947()) {
					if (!this.aBoolean708) {
						this.method7537();
					}
					this.anIntArray667 = null;
				} else {
					this.aBoolean710 = true;
				}
			}
		}
		if (this.aShortArray280 != null && this.anIntArray668 == null && this.anIntArray669 == null && this.anIntArray667 == null) {
			this.anIntArray665 = null;
			this.aShortArray280 = null;
		}
		if (this.aByteArray102 != null && !Static207.method3708(this.anInt9093, this.anInt9064)) {
			label197: {
				label196: {
					@Pc(162) boolean local162;
					if ((this.anInt9093 & 0x37) == 0) {
						if (this.aClass62_2 == null || this.aClass62_2.method1947()) {
							break label196;
						}
						local162 = false;
					} else {
						if (this.aClass62_4 == null || this.aClass62_4.method1947()) {
							break label196;
						}
						local162 = false;
					}
					if (!local162) {
						this.aBoolean710 = true;
						break label197;
					}
				}
				this.aByteArray102 = null;
				this.aShortArray279 = this.aShortArray284 = this.aShortArray277 = null;
			}
		}
		if (this.aShortArray276 != null && !Static581.method7691(this.anInt9064, this.anInt9093)) {
			if (this.aClass62_2 == null || this.aClass62_2.method1947()) {
				this.aShortArray276 = null;
			} else {
				this.aBoolean710 = true;
			}
		}
		if (this.aByteArray103 != null && !Static331.method5122(this.anInt9064, this.anInt9093)) {
			if (this.aClass62_2 == null || this.aClass62_2.method1947()) {
				this.aByteArray103 = null;
			} else {
				this.aBoolean710 = true;
			}
		}
		if (this.aFloatArray71 != null && !Static88.method1975(this.anInt9093, this.anInt9064)) {
			if (this.aClass62_1 == null || this.aClass62_1.method1947()) {
				this.aFloatArray71 = this.aFloatArray68 = null;
			} else {
				this.aBoolean710 = true;
			}
		}
		if (this.aShortArray275 != null && !Static51.method844(this.anInt9093, this.anInt9064)) {
			if (this.aClass62_2 == null || this.aClass62_2.method1947()) {
				this.aShortArray275 = null;
			} else {
				this.aBoolean710 = true;
			}
		}
		if (this.aShortArray287 != null && !Static197.method3570(this.anInt9064, this.anInt9093)) {
			if ((this.aClass164_1 == null || this.aClass164_1.method4022()) && (this.aClass62_2 == null || this.aClass62_2.method1947())) {
				this.aShortArray287 = this.aShortArray281 = this.aShortArray286 = null;
			} else {
				this.aBoolean710 = true;
			}
		}
		if (this.aShortArray282 != null) {
			if (this.aClass62_3 == null || this.aClass62_3.method1947()) {
				this.aShortArray282 = null;
			} else {
				this.aBoolean710 = true;
			}
		}
		if (this.aShortArray285 != null) {
			if (this.aClass62_2 == null || this.aClass62_2.method1947()) {
				this.aShortArray285 = null;
			} else {
				this.aBoolean710 = true;
			}
		}
		if (this.anIntArrayArray68 != null && !Static262.method4321(this.anInt9064, this.anInt9093)) {
			this.aShortArray283 = null;
			this.anIntArrayArray68 = null;
		}
		if (this.anIntArrayArray69 != null && !Static219.method3811(this.anInt9064, this.anInt9093)) {
			this.aShortArray278 = null;
			this.anIntArrayArray69 = null;
		}
		if (this.anIntArrayArray67 != null && !Static137.method2649(this.anInt9093, this.anInt9064)) {
			this.anIntArrayArray67 = null;
		}
		if (this.anIntArray663 != null && (this.anInt9064 & 0x800) == 0 && (this.anInt9064 & 0x40000) == 0) {
			this.anIntArray664 = null;
			this.anIntArray663 = null;
			this.anIntArray666 = null;
		}
	}

	@OriginalMember(owner = "client!vl", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9081; local3++) {
			this.anIntArray667[local3] = -this.anIntArray667[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt9086; local25++) {
			this.aShortArray277[local25] = (short) -this.aShortArray277[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt9053; local48++) {
			@Pc(55) short local55 = this.aShortArray287[local48];
			this.aShortArray287[local48] = this.aShortArray286[local48];
			this.aShortArray286[local48] = local55;
		}
		this.method7543();
		this.method7530();
		this.method7532();
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!vl", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray69 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt9076; local12++) {
			this.anIntArray668[local12] <<= 0x4;
			this.anIntArray669[local12] <<= 0x4;
			this.anIntArray667[local12] <<= 0x4;
		}
		Static45.anInt993 = 0;
		Static369.anInt6328 = 0;
		Static100.anInt2413 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vl", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort117;
	}

	@OriginalMember(owner = "client!vl", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean708) {
			this.method7537();
		}
		return this.anInt9107;
	}

	@OriginalMember(owner = "client!vl", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub17.anIntArray175[arg0];
		@Pc(13) int local13 = Class3_Sub17.anIntArray177[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt9081; local15++) {
			local34 = this.anIntArray667[local15] * local9 + local13 * this.anIntArray668[local15] >> 14;
			this.anIntArray667[local15] = local13 * this.anIntArray667[local15] - local9 * this.anIntArray668[local15] >> 14;
			this.anIntArray668[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt9086; local34++) {
			@Pc(84) int local84 = this.aShortArray277[local34] * local9 + local13 * this.aShortArray279[local34] >> 14;
			this.aShortArray277[local34] = (short) (local13 * this.aShortArray277[local34] - this.aShortArray279[local34] * local9 >> 14);
			this.aShortArray279[local34] = (short) local84;
		}
		this.method7543();
		this.method7530();
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	private void method7539() {
		if (this.anInt9111 == 0) {
			return;
		}
		if (this.method7540() && this.method7533()) {
			this.aClass43_Sub1_23.method4181(0, this.aClass62_3.anInterface24_4);
			this.aClass43_Sub1_23.method4181(1, this.aClass62_2.anInterface24_4);
			this.aClass43_Sub1_23.method4181(2, this.aClass62_1.anInterface24_4);
			@Pc(56) boolean local56;
			if ((this.anInt9093 & 0x37) == 0) {
				local56 = false;
				this.aClass43_Sub1_23.method4301(false);
				this.aClass43_Sub1_23.method4196(this.aClass43_Sub1_23.aClass48_17);
			} else {
				this.aClass43_Sub1_23.method4301(true);
				local56 = true;
				this.aClass43_Sub1_23.method4181(3, this.aClass62_4.anInterface24_4);
				this.aClass43_Sub1_23.method4196(this.aClass43_Sub1_23.aClass48_18);
			}
			for (@Pc(96) int local96 = 0; local96 < this.anIntArray666.length; local96++) {
				@Pc(103) int local103 = this.anIntArray663[local96];
				@Pc(110) int local110 = this.anIntArray663[local96 + 1];
				@Pc(117) int local117 = this.aShortArray275[local103] & 0xFFFF;
				if (local117 == 65535) {
					local117 = -1;
				}
				this.aClass43_Sub1_23.method4237(local117, true, local56);
				this.aClass43_Sub1_23.method4232(Static534.aClass319_7, this.anIntArray666[local96], this.anIntArray664[local96], local103 * 3, local110 - local103, this.aClass164_1.anInterface17_5);
			}
		}
		this.method7538();
	}

	@OriginalMember(owner = "client!vl", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9081; local3++) {
			if (arg0 != 128) {
				this.anIntArray668[local3] = this.anIntArray668[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray669[local3] = arg1 * this.anIntArray669[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray667[local3] = arg2 * this.anIntArray667[local3] >> 7;
			}
		}
		this.method7543();
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(B)Z")
	private boolean method7540() {
		@Pc(13) boolean local13 = !this.aClass62_2.aBoolean182;
		@Pc(26) boolean local26 = (this.anInt9093 & 0x37) != 0 && !this.aClass62_4.aBoolean182;
		@Pc(34) boolean local34 = !this.aClass62_3.aBoolean182;
		@Pc(42) boolean local42 = !this.aClass62_1.aBoolean182;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface24 local73;
		@Pc(87) Buffer local87;
		if (local34) {
			if (this.aClass62_3.anInterface24_3 == null) {
				this.aClass62_3.anInterface24_3 = this.aClass43_Sub1_23.method4188(this.aBoolean707);
			}
			local73 = this.aClass62_3.anInterface24_3;
			local73.method4802(12, this.anInt9086 * 12);
			local87 = local73.method4803();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass43_Sub1_23.aNativeInterface3.copyPositions(this.anIntArray668, this.anIntArray669, this.anIntArray667, this.aShortArray282, 0, 12, this.anInt9086, local87.getAddress());
				if (local73.method4801()) {
					this.aClass62_3.aBoolean182 = true;
					this.aClass62_3.anInterface24_4 = local73;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(207) short[] local207;
		@Pc(215) short[] local215;
		@Pc(203) short[] local203;
		@Pc(211) byte[] local211;
		if (local13) {
			if (this.aClass62_2.anInterface24_3 == null) {
				this.aClass62_2.anInterface24_3 = this.aClass43_Sub1_23.method4188(this.aBoolean707);
			}
			local73 = this.aClass62_2.anInterface24_3;
			local73.method4802(4, this.anInt9086 * 4);
			local87 = local73.method4803();
			if (local87 == null) {
				local54 = false;
			} else {
				if ((this.anInt9093 & 0x37) == 0) {
					if (this.aClass205_1 == null) {
						local207 = this.aShortArray279;
						local203 = this.aShortArray277;
						local211 = this.aByteArray102;
						local215 = this.aShortArray284;
					} else {
						local203 = this.aClass205_1.aShortArray153;
						local207 = this.aClass205_1.aShortArray155;
						local211 = this.aClass205_1.aByteArray65;
						local215 = this.aClass205_1.aShortArray154;
					}
					this.aClass43_Sub1_23.aNativeInterface3.copyLighting(this.aShortArray276, this.aByteArray103, this.aShortArray275, local207, local215, local203, local211, this.aShort116, this.aShort117, this.aShortArray285, 0, 4, this.anInt9086, local87.getAddress());
				} else {
					this.aClass43_Sub1_23.aNativeInterface3.copyColours(this.aShortArray276, this.aByteArray103, this.aShortArray275, this.aShort116, this.aShortArray285, 0, 4, this.anInt9086, local87.getAddress());
				}
				if (local73.method4801()) {
					this.aClass62_2.aBoolean182 = true;
					this.aClass62_2.anInterface24_4 = local73;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass62_4.anInterface24_3 == null) {
				this.aClass62_4.anInterface24_3 = this.aClass43_Sub1_23.method4188(this.aBoolean707);
			}
			local73 = this.aClass62_4.anInterface24_3;
			local73.method4802(12, this.anInt9086 * 12);
			local87 = local73.method4803();
			if (local87 == null) {
				local54 = false;
			} else {
				if (this.aClass205_1 == null) {
					local211 = this.aByteArray102;
					local215 = this.aShortArray284;
					local203 = this.aShortArray277;
					local207 = this.aShortArray279;
				} else {
					local207 = this.aClass205_1.aShortArray155;
					local211 = this.aClass205_1.aByteArray65;
					local203 = this.aClass205_1.aShortArray153;
					local215 = this.aClass205_1.aShortArray154;
				}
				this.aClass43_Sub1_23.aNativeInterface3.copyNormals(local207, local215, local203, local211, 3.0F / (float) this.aShort117, 3.0F / (float) (this.aShort117 / 2 + this.aShort117), 0, 12, this.anInt9086, local87.getAddress());
				if (local73.method4801()) {
					this.aClass62_4.anInterface24_4 = local73;
					this.aClass62_4.aBoolean182 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass62_1.anInterface24_3 == null) {
				this.aClass62_1.anInterface24_3 = this.aClass43_Sub1_23.method4188(this.aBoolean707);
			}
			local73 = this.aClass62_1.anInterface24_3;
			local73.method4802(8, this.anInt9086 * 8);
			local87 = local73.method4803();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass43_Sub1_23.aNativeInterface3.copyTexCoords(this.aFloatArray71, this.aFloatArray68, 0, 8, this.anInt9086, local87.getAddress());
				if (local73.method4801()) {
					this.aClass62_1.aBoolean182 = true;
					this.aClass62_1.anInterface24_4 = local73;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "()[Lclient!aq;")
	@Override
	public Class15[] method7516() {
		return this.aClass15Array5;
	}

	@OriginalMember(owner = "client!vl", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub17.anIntArray175[arg0];
		@Pc(13) int local13 = Class3_Sub17.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9081; local15++) {
			@Pc(33) int local33 = this.anIntArray667[local15] * local9 + local13 * this.anIntArray668[local15] >> 14;
			this.anIntArray667[local15] = local13 * this.anIntArray667[local15] - local9 * this.anIntArray668[local15] >> 14;
			this.anIntArray668[local15] = local33;
		}
		this.method7543();
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!vl", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static100.anInt2413 = 0;
			Static369.anInt6328 = 0;
			Static45.anInt993 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt9081; local20++) {
				Static100.anInt2413 += this.anIntArray668[local20];
				Static369.anInt6328 += this.anIntArray669[local20];
				Static45.anInt993 += this.anIntArray667[local20];
				local18++;
			}
			if (local18 <= 0) {
				Static100.anInt2413 = arg1;
				Static369.anInt6328 = arg2;
				Static45.anInt993 = arg3;
			} else {
				Static45.anInt993 = Static45.anInt993 / local18 + arg3;
				Static369.anInt6328 = arg2 + Static369.anInt6328 / local18;
				Static100.anInt2413 = Static100.anInt2413 / local18 + arg1;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt9081; local18++) {
				this.anIntArray668[local18] += arg1;
				this.anIntArray669[local18] += arg2;
				this.anIntArray667[local18] += arg3;
			}
		} else {
			@Pc(169) int local169;
			@Pc(187) int local187;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt9081; local18++) {
					this.anIntArray668[local18] -= Static100.anInt2413;
					this.anIntArray669[local18] -= Static369.anInt6328;
					this.anIntArray667[local18] -= Static45.anInt993;
					if (arg3 != 0) {
						local20 = Class3_Sub17.anIntArray175[arg3];
						local169 = Class3_Sub17.anIntArray177[arg3];
						local187 = local169 * this.anIntArray668[local18] + this.anIntArray669[local18] * local20 + 16383 >> 14;
						this.anIntArray669[local18] = local169 * this.anIntArray669[local18] + 16383 - this.anIntArray668[local18] * local20 >> 14;
						this.anIntArray668[local18] = local187;
					}
					if (arg1 != 0) {
						local20 = Class3_Sub17.anIntArray175[arg1];
						local169 = Class3_Sub17.anIntArray177[arg1];
						local187 = local169 * this.anIntArray669[local18] + 16383 - this.anIntArray667[local18] * local20 >> 14;
						this.anIntArray667[local18] = this.anIntArray669[local18] * local20 + this.anIntArray667[local18] * local169 + 16383 >> 14;
						this.anIntArray669[local18] = local187;
					}
					if (arg2 != 0) {
						local20 = Class3_Sub17.anIntArray175[arg2];
						local169 = Class3_Sub17.anIntArray177[arg2];
						local187 = local20 * this.anIntArray667[local18] + local169 * this.anIntArray668[local18] + 16383 >> 14;
						this.anIntArray667[local18] = this.anIntArray667[local18] * local169 + 16383 - this.anIntArray668[local18] * local20 >> 14;
						this.anIntArray668[local18] = local187;
					}
					this.anIntArray668[local18] += Static100.anInt2413;
					this.anIntArray669[local18] += Static369.anInt6328;
					this.anIntArray667[local18] += Static45.anInt993;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt9081; local18++) {
					this.anIntArray668[local18] -= Static100.anInt2413;
					this.anIntArray669[local18] -= Static369.anInt6328;
					this.anIntArray667[local18] -= Static45.anInt993;
					this.anIntArray668[local18] = arg1 * this.anIntArray668[local18] / 128;
					this.anIntArray669[local18] = arg2 * this.anIntArray669[local18] / 128;
					this.anIntArray667[local18] = this.anIntArray667[local18] * arg3 / 128;
					this.anIntArray668[local18] += Static100.anInt2413;
					this.anIntArray669[local18] += Static369.anInt6328;
					this.anIntArray667[local18] += Static45.anInt993;
				}
			} else {
				@Pc(517) Class308 local517;
				@Pc(522) Class251 local522;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt9053; local18++) {
						local20 = arg1 * 8 + (this.aByteArray103[local18] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray103[local18] = (byte) local20;
					}
					if (this.aClass308Array1 != null) {
						for (local20 = 0; local20 < this.anInt9041; local20++) {
							local517 = this.aClass308Array1[local20];
							local522 = this.aClass251Array1[local20];
							local522.anInt6724 = 255 - (this.aByteArray103[local517.anInt7800] & 0xFF) << 24 | local522.anInt6724 & 0xFFFFFF;
						}
					}
					this.method7545();
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt9053; local18++) {
						local20 = this.aShortArray276[local18] & 0xFFFF;
						local169 = local20 >> 10 & 0x3F;
						local187 = local20 >> 7 & 0x7;
						@Pc(586) int local586 = arg1 + local169 & 0x3F;
						local187 += arg2 / 4;
						@Pc(596) int local596 = local20 & 0x7F;
						local596 += arg3;
						if (local187 < 0) {
							local187 = 0;
						} else if (local187 > 7) {
							local187 = 7;
						}
						if (local596 < 0) {
							local596 = 0;
						} else if (local596 > 127) {
							local596 = 127;
						}
						this.aShortArray276[local18] = (short) (local596 | local187 << 7 | local586 << 10);
					}
					if (this.aClass308Array1 != null) {
						for (local20 = 0; local20 < this.anInt9041; local20++) {
							local517 = this.aClass308Array1[local20];
							local522 = this.aClass251Array1[local20];
							local522.anInt6724 = Static213.anIntArray342[this.aShortArray276[local517.anInt7800] & 0xFFFF] & 0xFFFFFF | local522.anInt6724 & 0xFF000000;
						}
					}
					this.method7545();
				} else {
					@Pc(708) Class251 local708;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt9041; local18++) {
							local708 = this.aClass251Array1[local18];
							local708.anInt6721 += arg1;
							local708.anInt6726 += arg2;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt9041; local18++) {
							local708 = this.aClass251Array1[local18];
							local708.anInt6722 = local708.anInt6722 * arg1 >> 7;
							local708.anInt6720 = arg2 * local708.anInt6720 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt9041; local18++) {
							local708 = this.aClass251Array1[local18];
							local708.anInt6727 = arg1 + local708.anInt6727 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIFFIIIILclient!nda;J)S")
	private short method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class226 arg8, @OriginalArg(10) long arg9) {
		@Pc(10) int local10 = this.anIntArray665[arg5];
		@Pc(17) int local17 = this.anIntArray665[arg5 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray280[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static577.aLongArray11[local21] == arg9) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray280[local19] = (short) (this.anInt9086 + 1);
		Static577.aLongArray11[local19] = arg9;
		this.aShortArray285[this.anInt9086] = (short) arg0;
		this.aShortArray282[this.anInt9086] = (short) arg5;
		this.aShortArray279[this.anInt9086] = (short) arg6;
		this.aShortArray284[this.anInt9086] = (short) arg7;
		this.aShortArray277[this.anInt9086] = (short) arg1;
		this.aByteArray102[this.anInt9086] = (byte) arg2;
		this.aFloatArray71[this.anInt9086] = arg3;
		this.aFloatArray68[this.anInt9086] = arg4;
		return (short) this.anInt9086++;
	}

	@OriginalMember(owner = "client!vl", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt9064;
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V")
	public void method7542() {
		if (this.aClass62_3 != null) {
			this.aClass62_3.method1948();
		}
		if (this.aClass62_1 != null) {
			this.aClass62_1.method1948();
		}
		if (this.aClass62_2 != null) {
			this.aClass62_2.method1948();
		}
		if (this.aClass62_4 != null) {
			this.aClass62_4.method1948();
		}
		if (this.aClass164_1 != null) {
			this.aClass164_1.method4023();
		}
	}

	@OriginalMember(owner = "client!vl", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean708) {
			this.method7537();
		}
		return this.anInt9061;
	}

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)V")
	private void method7543() {
		if (this.aClass62_3 != null) {
			this.aClass62_3.aBoolean182 = false;
		}
	}

	@OriginalMember(owner = "client!vl", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub17.anIntArray175[arg0];
		@Pc(13) int local13 = Class3_Sub17.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9081; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray669[local15] - local9 * this.anIntArray667[local15] >> 14;
			this.anIntArray667[local15] = this.anIntArray667[local15] * local13 + this.anIntArray669[local15] * local9 >> 14;
			this.anIntArray669[local15] = local34;
		}
		this.method7543();
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class57 method7522(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class57_Sub3 local16;
		@Pc(12) Class57_Sub3 local12;
		if (arg0 == 1) {
			local12 = this.aClass43_Sub1_23.aClass57_Sub3_30;
			local16 = this.aClass43_Sub1_23.aClass57_Sub3_26;
		} else if (arg0 == 2) {
			local16 = this.aClass43_Sub1_23.aClass57_Sub3_21;
			local12 = this.aClass43_Sub1_23.aClass57_Sub3_23;
		} else if (arg0 == 3) {
			local12 = this.aClass43_Sub1_23.aClass57_Sub3_25;
			local16 = this.aClass43_Sub1_23.aClass57_Sub3_29;
		} else if (arg0 == 4) {
			local16 = this.aClass43_Sub1_23.aClass57_Sub3_27;
			local12 = this.aClass43_Sub1_23.aClass57_Sub3_24;
		} else if (arg0 == 5) {
			local16 = this.aClass43_Sub1_23.aClass57_Sub3_22;
			local12 = this.aClass43_Sub1_23.aClass57_Sub3_28;
		} else {
			local16 = local12 = new Class57_Sub3(this.aClass43_Sub1_23, 0, 0, true, false);
		}
		return this.method7535(arg2, arg1, arg0 != 0, local12, local16);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3) {
		return this.method7546(arg2, -1, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "(B)V")
	private void method7545() {
		if (this.aClass62_2 != null) {
			this.aClass62_2.aBoolean182 = false;
		}
	}

	@OriginalMember(owner = "client!vl", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass62_3 != null) {
			this.aClass62_3.aBoolean181 = Static524.method6964(this.anInt9093, arg0);
		}
		if (this.aClass62_1 != null) {
			this.aClass62_1.aBoolean181 = Static92.method2051(arg0, this.anInt9093);
		}
		if (this.aClass62_2 != null) {
			this.aClass62_2.aBoolean181 = Static330.method5099(this.anInt9093, arg0);
		}
		if (this.aClass62_4 != null) {
			this.aClass62_4.aBoolean181 = Static230.method3918(this.anInt9093, arg0);
		}
		this.anInt9064 = arg0;
		this.aBoolean710 = true;
		if (this.aClass205_1 != null && (this.anInt9064 & 0x10000) == 0) {
			this.aShortArray284 = this.aClass205_1.aShortArray154;
			this.aByteArray102 = this.aClass205_1.aByteArray65;
			this.aShortArray279 = this.aClass205_1.aShortArray155;
			this.aShortArray277 = this.aClass205_1.aShortArray153;
			this.aClass205_1 = null;
		}
		this.method7538();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "()[Lclient!tk;")
	@Override
	public Class323[] method7503() {
		return this.aClass323Array5;
	}

	@OriginalMember(owner = "client!vl", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean709;
	}

	@OriginalMember(owner = "client!vl", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass43_Sub1_23.anInterface8_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt9053; local11++) {
			if (arg0 == this.aShortArray275[local11]) {
				this.aShortArray275[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class224 local43 = local9.method6560(arg0 & 0xFFFF);
			local33 = local43.aByte71;
			local31 = local43.aByte73;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(63) Class224 local63 = local9.method6560(arg1 & 0xFFFF);
			local51 = local63.aByte73;
			local53 = local63.aByte71;
		}
		if (!(local53 != local33 | local51 != local31)) {
			return;
		}
		if (this.aClass308Array1 != null) {
			for (@Pc(96) int local96 = 0; local96 < this.anInt9041; local96++) {
				@Pc(103) Class308 local103 = this.aClass308Array1[local96];
				@Pc(108) Class251 local108 = this.aClass251Array1[local96];
				local108.anInt6724 = local108.anInt6724 & 0xFF000000 | Static213.anIntArray342[this.aShortArray276[local103.anInt7800] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7545();
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9053; local3++) {
			if (arg0 == this.aShortArray276[local3]) {
				this.aShortArray276[local3] = arg1;
			}
		}
		if (this.aClass308Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt9041; local34++) {
				@Pc(41) Class308 local41 = this.aClass308Array1[local34];
				@Pc(46) Class251 local46 = this.aClass251Array1[local34];
				local46.anInt6724 = local46.anInt6724 & 0xFF000000 | Static213.anIntArray342[this.aShortArray276[local41.anInt7800] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7545();
	}

	@OriginalMember(owner = "client!vl", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub17.anIntArray175[arg0];
		@Pc(13) int local13 = Class3_Sub17.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9081; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray668[local15] + this.anIntArray669[local15] * local9 >> 14;
			this.anIntArray669[local15] = this.anIntArray669[local15] * local13 - local9 * this.anIntArray668[local15] >> 14;
			this.anIntArray668[local15] = local33;
		}
		this.method7543();
		this.aBoolean708 = false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!q;IIIBZ)Z")
	private boolean method7546(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) Class109_Sub3 local8 = (Class109_Sub3) arg0;
		@Pc(12) Class109_Sub3 local12 = this.aClass43_Sub1_23.aClass109_Sub3_16;
		@Pc(33) float local33 = local12.aFloat192 + local8.aFloat192 * local12.aFloat193 + local8.aFloat188 * local12.aFloat187 + local12.aFloat195 * local8.aFloat189;
		@Pc(54) float local54 = local8.aFloat189 * local12.aFloat190 + local8.aFloat192 * local12.aFloat191 + local12.aFloat186 * local8.aFloat188 + local12.aFloat188;
		Static539.aFloat116 = local12.aFloat195 * local8.aFloat194 + local8.aFloat191 * local12.aFloat187 + local12.aFloat193 * local8.aFloat193;
		Static198.aFloat82 = local8.aFloat193 * local12.aFloat191 + local12.aFloat186 * local8.aFloat191 + local12.aFloat190 * local8.aFloat194;
		Static472.aFloat156 = local12.aFloat197 * local8.aFloat197 + local12.aFloat196 * local8.aFloat190 + local12.aFloat194 * local8.aFloat195;
		Static50.aFloat9 = local12.aFloat197 * local8.aFloat196 + local8.aFloat187 * local12.aFloat194 + local12.aFloat196 * local8.aFloat186;
		Static110.aFloat39 = local8.aFloat196 * local12.aFloat195 + local12.aFloat187 * local8.aFloat186 + local12.aFloat193 * local8.aFloat187;
		@Pc(165) float local165 = local12.aFloat189 + local12.aFloat194 * local8.aFloat192 + local8.aFloat188 * local12.aFloat196 + local12.aFloat197 * local8.aFloat189;
		Static162.aFloat62 = local8.aFloat194 * local12.aFloat197 + local12.aFloat196 * local8.aFloat191 + local12.aFloat194 * local8.aFloat193;
		Static424.aFloat150 = local12.aFloat195 * local8.aFloat197 + local8.aFloat195 * local12.aFloat193 + local12.aFloat187 * local8.aFloat190;
		Static10.aFloat2 = local12.aFloat191 * local8.aFloat195 + local12.aFloat186 * local8.aFloat190 + local8.aFloat197 * local12.aFloat190;
		Static121.aFloat43 = local8.aFloat196 * local12.aFloat190 + local12.aFloat186 * local8.aFloat186 + local12.aFloat191 * local8.aFloat187;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass43_Sub1_23.anInt4838;
		@Pc(255) int local255 = this.aClass43_Sub1_23.anInt4815;
		if (!this.aBoolean708) {
			this.method7537();
		}
		Static193.anIntArray315[0] = this.anInt9060;
		Static104.anIntArray172[0] = this.anInt9118;
		Static193.anIntArray315[1] = this.anInt9056;
		Static274.anIntArray380[0] = this.anInt9119;
		Static104.anIntArray172[1] = this.anInt9118;
		Static274.anIntArray380[1] = this.anInt9119;
		Static193.anIntArray315[2] = this.anInt9060;
		Static104.anIntArray172[2] = this.anInt9107;
		Static274.anIntArray380[2] = this.anInt9119;
		Static193.anIntArray315[3] = this.anInt9056;
		Static104.anIntArray172[3] = this.anInt9107;
		Static193.anIntArray315[4] = this.anInt9060;
		Static274.anIntArray380[3] = this.anInt9119;
		Static104.anIntArray172[4] = this.anInt9118;
		Static274.anIntArray380[4] = this.anInt9052;
		Static193.anIntArray315[5] = this.anInt9056;
		Static104.anIntArray172[5] = this.anInt9118;
		Static274.anIntArray380[5] = this.anInt9052;
		Static193.anIntArray315[6] = this.anInt9060;
		Static104.anIntArray172[6] = this.anInt9107;
		Static274.anIntArray380[6] = this.anInt9052;
		Static193.anIntArray315[7] = this.anInt9056;
		Static104.anIntArray172[7] = this.anInt9107;
		Static274.anIntArray380[7] = this.anInt9052;
		@Pc(420) float local420;
		@Pc(434) float local434;
		@Pc(448) float local448;
		@Pc(396) float local396;
		@Pc(401) float local401;
		@Pc(406) float local406;
		for (@Pc(389) int local389 = 0; local389 < 8; local389++) {
			local396 = Static193.anIntArray315[local389];
			local401 = Static104.anIntArray172[local389];
			local406 = Static274.anIntArray380[local389];
			local420 = local33 + Static424.aFloat150 * local406 + local401 * Static110.aFloat39 + Static539.aFloat116 * local396;
			local434 = local54 + Static10.aFloat2 * local406 + Static121.aFloat43 * local401 + Static198.aFloat82 * local396;
			local448 = local165 + Static162.aFloat62 * local396 + Static50.aFloat9 * local401 + Static472.aFloat156 * local406;
			if (local448 >= (float) this.aClass43_Sub1_23.anInt4814) {
				if (arg1 > 0) {
					local448 = arg1;
				}
				@Pc(475) float local475 = (float) local251 * local420 / local448 + (float) this.aClass43_Sub1_23.anInt4839;
				if (local475 > local243) {
					local243 = local475;
				}
				@Pc(493) float local493 = (float) local255 * local434 / local448 + (float) this.aClass43_Sub1_23.anInt4818;
				if (local475 < local241) {
					local241 = local475;
				}
				local239 = true;
				if (local493 < local245) {
					local245 = local493;
				}
				if (local493 > local247) {
					local247 = local493;
				}
			}
		}
		if (local239 && local241 < (float) arg2 && local243 > (float) arg2 && (float) arg3 > local245 && local247 > (float) arg3) {
			if (arg4) {
				return true;
			}
			if (Static428.anIntArray119.length < this.anInt9086) {
				Static428.anIntArray119 = new int[this.anInt9086];
				Static471.anIntArray596 = new int[this.anInt9086];
			}
			@Pc(652) int local652;
			for (@Pc(562) int local562 = 0; local562 < this.anInt9081; local562++) {
				local401 = this.anIntArray669[local562];
				local406 = this.anIntArray667[local562];
				local396 = this.anIntArray668[local562];
				local434 = local54 + Static198.aFloat82 * local396 + Static121.aFloat43 * local401 + Static10.aFloat2 * local406;
				local420 = local33 + local406 * Static424.aFloat150 + local396 * Static539.aFloat116 + local401 * Static110.aFloat39;
				local448 = Static162.aFloat62 * local396 + local401 * Static50.aFloat9 + Static472.aFloat156 * local406 + local165;
				@Pc(665) int local665;
				@Pc(670) int local670;
				@Pc(677) int local677;
				if ((float) this.aClass43_Sub1_23.anInt4814 <= local448) {
					if (arg1 > 0) {
						local448 = arg1;
					}
					local652 = (int) ((float) this.aClass43_Sub1_23.anInt4839 + (float) local251 * local420 / local448);
					local665 = (int) (local434 * (float) local255 / local448 + (float) this.aClass43_Sub1_23.anInt4818);
					local670 = this.anIntArray665[local562];
					local677 = this.anIntArray665[local562 + 1];
					for (@Pc(679) int local679 = local670; local679 < local677; local679++) {
						@Pc(688) int local688 = this.aShortArray280[local679] - 1;
						if (local688 == -1) {
							break;
						}
						Static428.anIntArray119[local688] = local652;
						Static471.anIntArray596[local688] = local665;
					}
				} else {
					local652 = this.anIntArray665[local562];
					local665 = this.anIntArray665[local562 + 1];
					for (local670 = local652; local670 < local665; local670++) {
						local677 = this.aShortArray280[local670] - 1;
						if (local677 == -1) {
							break;
						}
						Static428.anIntArray119[this.aShortArray280[local670] - 1] = -999999;
					}
				}
			}
			for (local652 = 0; local652 < this.anInt9053; local652++) {
				if (Static428.anIntArray119[this.aShortArray287[local652]] != -999999 && Static428.anIntArray119[this.aShortArray281[local652]] != -999999 && Static428.anIntArray119[this.aShortArray286[local652]] != -999999 && this.method7531(arg3, Static428.anIntArray119[this.aShortArray281[local652]], Static471.anIntArray596[this.aShortArray281[local652]], Static428.anIntArray119[this.aShortArray286[local652]], arg2, Static471.anIntArray596[this.aShortArray286[local652]], Static471.anIntArray596[this.aShortArray287[local652]], Static428.anIntArray119[this.aShortArray287[local652]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean708) {
			this.method7537();
		}
		return this.anInt9102;
	}

	@OriginalMember(owner = "client!vl", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean708) {
			this.method7537();
		}
		return this.anInt9060;
	}
}
