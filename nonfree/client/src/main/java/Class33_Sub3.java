import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!tda", name = "v", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!tda", name = "x", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!tda", name = "y", descriptor = "[Lclient!kh;")
	private Class193[] aClass193Array1;

	@OriginalMember(owner = "client!tda", name = "G", descriptor = "[Lclient!cs;")
	private Class65[] aClass65Array1;

	@OriginalMember(owner = "client!tda", name = "H", descriptor = "Lclient!vr;")
	private Class353 aClass353_1;

	@OriginalMember(owner = "client!tda", name = "J", descriptor = "I")
	private int anInt8053;

	@OriginalMember(owner = "client!tda", name = "P", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!tda", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!tda", name = "S", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!tda", name = "T", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!tda", name = "ab", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!tda", name = "cb", descriptor = "I")
	private int anInt8066;

	@OriginalMember(owner = "client!tda", name = "db", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!tda", name = "fb", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!tda", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!tda", name = "hb", descriptor = "Lclient!re;")
	private Interface21 anInterface21_2;

	@OriginalMember(owner = "client!tda", name = "pb", descriptor = "[I")
	private int[] anIntArray542;

	@OriginalMember(owner = "client!tda", name = "qb", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!tda", name = "sb", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!tda", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!tda", name = "ub", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!tda", name = "wb", descriptor = "[I")
	private int[] anIntArray543;

	@OriginalMember(owner = "client!tda", name = "Cb", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!tda", name = "Db", descriptor = "Lclient!fba;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!tda", name = "Eb", descriptor = "[Lclient!il;")
	private Class163[] aClass163Array4;

	@OriginalMember(owner = "client!tda", name = "Hb", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!tda", name = "Kb", descriptor = "[Lclient!rca;")
	private Class293[] aClass293Array4;

	@OriginalMember(owner = "client!tda", name = "Lb", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!tda", name = "Mb", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!tda", name = "Nb", descriptor = "[F")
	private float[] aFloatArray64;

	@OriginalMember(owner = "client!tda", name = "Pb", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!tda", name = "Sb", descriptor = "B")
	private byte aByte115;

	@OriginalMember(owner = "client!tda", name = "ac", descriptor = "I")
	private int anInt8090;

	@OriginalMember(owner = "client!tda", name = "bc", descriptor = "[F")
	private float[] aFloatArray65;

	@OriginalMember(owner = "client!tda", name = "cc", descriptor = "[I")
	private int[] anIntArray544;

	@OriginalMember(owner = "client!tda", name = "dc", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!tda", name = "ec", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!tda", name = "ic", descriptor = "[I")
	private int[] anIntArray545;

	@OriginalMember(owner = "client!tda", name = "mc", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!tda", name = "nc", descriptor = "[I")
	private int[] anIntArray546;

	@OriginalMember(owner = "client!tda", name = "pc", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!tda", name = "qc", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!tda", name = "sc", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!tda", name = "wc", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!tda", name = "s", descriptor = "Z")
	private boolean aBoolean681 = true;

	@OriginalMember(owner = "client!tda", name = "Fb", descriptor = "I")
	private int anInt8079 = 0;

	@OriginalMember(owner = "client!tda", name = "Wb", descriptor = "Z")
	private boolean aBoolean682 = false;

	@OriginalMember(owner = "client!tda", name = "kc", descriptor = "I")
	private int anInt8095 = 0;

	@OriginalMember(owner = "client!tda", name = "fc", descriptor = "I")
	private int anInt8091 = 0;

	@OriginalMember(owner = "client!tda", name = "tc", descriptor = "Z")
	private boolean aBoolean683 = false;

	@OriginalMember(owner = "client!tda", name = "vc", descriptor = "I")
	private int anInt8099 = 0;

	@OriginalMember(owner = "client!tda", name = "Rb", descriptor = "I")
	private int anInt8084 = 0;

	@OriginalMember(owner = "client!tda", name = "V", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_37;

	@OriginalMember(owner = "client!tda", name = "Ob", descriptor = "Lclient!gv;")
	private Class133 aClass133_8;

	@OriginalMember(owner = "client!tda", name = "oc", descriptor = "Lclient!gv;")
	private Class133 aClass133_10;

	@OriginalMember(owner = "client!tda", name = "Tb", descriptor = "Lclient!gv;")
	private Class133 aClass133_9;

	@OriginalMember(owner = "client!tda", name = "jb", descriptor = "Lclient!gv;")
	private Class133 aClass133_7;

	@OriginalMember(owner = "client!tda", name = "ob", descriptor = "Lclient!ti;")
	private Class327 aClass327_1;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class33_Sub3(@OriginalArg(0) Class162_Sub3 arg0) {
		this.aClass162_Sub3_37 = arg0;
		this.aClass133_8 = new Class133(null, 5126, 3, 0);
		this.aClass133_10 = new Class133(null, 5126, 2, 0);
		this.aClass133_9 = new Class133(null, 5126, 3, 0);
		this.aClass133_7 = new Class133(null, 5121, 4, 0);
		this.aClass327_1 = new Class327();
	}

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!uca;Lclient!ak;IIII)V")
	public Class33_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8066 = arg2;
		this.aClass162_Sub3_37 = arg0;
		this.anInt8090 = arg5;
		if (Static154.method2106(arg2, arg5)) {
			this.aClass133_8 = new Class133(null, 5126, 3, 0);
		}
		if (Static343.method5006(arg2, arg5)) {
			this.aClass133_10 = new Class133(null, 5126, 2, 0);
		}
		if (Static125.method1730(arg5, arg2)) {
			this.aClass133_9 = new Class133(null, 5126, 3, 0);
		}
		if (Static421.method5634(arg5, arg2)) {
			this.aClass133_7 = new Class133(null, 5121, 4, 0);
		}
		if (Static554.method7256(arg2, arg5)) {
			this.aClass327_1 = new Class327();
		}
		@Pc(105) Interface9 local105 = arg0.anInterface9_10;
		@Pc(109) int[] local109 = new int[arg1.anInt315];
		this.anIntArray546 = new int[arg1.anInt325 + 1];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt315; local118++) {
			if ((arg1.aByteArray10 == null || arg1.aByteArray10[local118] != 2) && (arg1.aShortArray22 == null || arg1.aShortArray22[local118] == -1 || !local105.method1074(arg1.aShortArray22[local118] & 0xFFFF).aBoolean598)) {
				local109[this.anInt8099++] = local118;
				this.anIntArray546[arg1.aShortArray26[local118]]++;
				this.anIntArray546[arg1.aShortArray20[local118]]++;
				this.anIntArray546[arg1.aShortArray18[local118]]++;
			}
		}
		this.anInt8091 = this.anInt8099;
		@Pc(205) long[] local205 = new long[this.anInt8099];
		@Pc(217) boolean local217 = (this.anInt8066 & 0x100) != 0;
		@Pc(229) int local229;
		@Pc(400) int local400;
		for (@Pc(219) int local219 = 0; local219 < this.anInt8099; local219++) {
			@Pc(225) int local225 = local109[local219];
			@Pc(227) Class291 local227 = null;
			local229 = 0;
			@Pc(231) byte local231 = 0;
			@Pc(233) byte local233 = 0;
			@Pc(235) byte local235 = 0;
			if (arg1.aClass122Array1 != null) {
				@Pc(240) boolean local240 = false;
				for (@Pc(242) int local242 = 0; local242 < arg1.aClass122Array1.length; local242++) {
					@Pc(249) Class122 local249 = arg1.aClass122Array1[local242];
					if (local249.anInt2551 == local225) {
						@Pc(262) Class280 local262 = Static304.method4382(local249.anInt2553);
						if (local262.aBoolean569) {
							local240 = true;
						}
						if (local262.anInt6951 != -1) {
							@Pc(278) Class291 local278 = local105.method1074(local262.anInt6951);
							if (local278.aBoolean599) {
								this.aBoolean683 = true;
							}
						}
					}
				}
				if (local240) {
					local205[local219] = Long.MAX_VALUE;
					this.anInt8091--;
					continue;
				}
			}
			@Pc(310) short local310 = -1;
			if (arg1.aShortArray22 != null) {
				local310 = arg1.aShortArray22[local225];
				if (local310 != -1) {
					local227 = local105.method1074(local310 & 0xFFFF);
					local233 = local227.aByte96;
					local235 = local227.aByte95;
				}
			}
			@Pc(362) boolean local362 = arg1.aByteArray11 != null && arg1.aByteArray11[local225] != 0 || local227 != null && local227.aBoolean599 | !local227.aBoolean601;
			if ((local217 || local362) && arg1.aByteArray12 != null) {
				local229 += arg1.aByteArray12[local225] << 17;
			}
			if (local362) {
				local229 += 65536;
			}
			local229 += (local233 & 0xFF) << 8;
			local400 = local231 + ((local310 & 0xFFFF) << 16);
			local229 += local235 & 0xFF;
			@Pc(412) int local412 = local400 + (local219 & 0xFFFF);
			local205[local219] = (long) local412 + ((long) local229 << 32);
			this.aBoolean683 |= local362;
		}
		Static271.method3963(local109, local205);
		this.anIntArray543 = arg1.anIntArray32;
		this.anInt8079 = arg1.anInt325;
		this.anInt8084 = arg1.anInt327;
		this.aShortArray129 = arg1.aShortArray25;
		this.anIntArray545 = arg1.anIntArray33;
		this.anIntArray542 = arg1.anIntArray35;
		this.aClass293Array4 = arg1.aClass293Array1;
		this.aClass163Array4 = arg1.aClass163Array1;
		@Pc(477) Class89[] local477 = new Class89[this.anInt8079];
		@Pc(497) int local497;
		@Pc(511) int local511;
		if (arg1.aClass122Array1 != null) {
			this.anInt8053 = arg1.aClass122Array1.length;
			this.aClass193Array1 = new Class193[this.anInt8053];
			this.aClass65Array1 = new Class65[this.anInt8053];
			for (local497 = 0; local497 < this.anInt8053; local497++) {
				@Pc(504) Class122 local504 = arg1.aClass122Array1[local497];
				@Pc(509) Class280 local509 = Static304.method4382(local504.anInt2553);
				local511 = -1;
				for (@Pc(513) int local513 = 0; local513 < this.anInt8099; local513++) {
					if (local504.anInt2551 == local109[local513]) {
						local511 = local513;
						break;
					}
				}
				if (local511 == -1) {
					throw new RuntimeException();
				}
				@Pc(550) int local550 = Static142.anIntArray365[arg1.aShortArray21[local504.anInt2551] & 0xFFFF] & 0xFFFFFF;
				@Pc(568) int local568 = local550 | 255 - (arg1.aByteArray11 == null ? 0 : arg1.aByteArray11[local504.anInt2551]) << 24;
				this.aClass193Array1[local497] = new Class193(local511, arg1.aShortArray26[local504.anInt2551], arg1.aShortArray20[local504.anInt2551], arg1.aShortArray18[local504.anInt2551], local509.anInt6954, local509.anInt6949, local509.anInt6951, local509.anInt6955, local509.anInt6956, local509.aBoolean569, local509.aBoolean570, local504.anInt2554);
				this.aClass65Array1[local497] = new Class65(local568);
			}
		}
		local497 = this.anInt8099 * 3;
		this.aShortArray125 = new short[local497];
		this.aShortArray127 = new short[this.anInt8099];
		this.aShortArray130 = new short[local497];
		this.aShortArray124 = new short[local497];
		if (arg1.aShortArray23 != null) {
			this.aShortArray126 = new short[this.anInt8099];
		}
		this.aFloatArray64 = new float[local497];
		this.aByteArray88 = new byte[this.anInt8099];
		this.aShort101 = (short) arg3;
		this.aShortArray132 = new short[this.anInt8099];
		this.aShortArray131 = new short[this.anInt8099];
		this.aFloatArray65 = new float[local497];
		this.aShortArray122 = new short[this.anInt8099];
		this.aByteArray89 = new byte[local497];
		this.aShort107 = (short) arg4;
		this.aShortArray128 = new short[this.anInt8099];
		this.aShortArray123 = new short[local497];
		Static119.aLongArray4 = new long[local497];
		local229 = 0;
		for (local400 = 0; local400 < arg1.anInt325; local400++) {
			local511 = this.anIntArray546[local400];
			this.anIntArray546[local400] = local229;
			local229 += local511;
			local477[local400] = new Class89();
		}
		this.anIntArray546[arg1.anInt325] = local229;
		@Pc(745) int[] local745 = null;
		@Pc(747) int[] local747 = null;
		@Pc(749) int[] local749 = null;
		@Pc(751) float[][] local751 = null;
		@Pc(777) int local777;
		@Pc(819) int local819;
		@Pc(825) int local825;
		@Pc(838) int local838;
		@Pc(840) int local840;
		@Pc(876) int local876;
		@Pc(881) int local881;
		@Pc(1049) float local1049;
		@Pc(1035) float local1035;
		@Pc(1047) float local1047;
		if (arg1.aByteArray7 != null) {
			@Pc(757) int local757 = arg1.anInt316;
			@Pc(760) int[] local760 = new int[local757];
			@Pc(763) int[] local763 = new int[local757];
			@Pc(766) int[] local766 = new int[local757];
			@Pc(769) int[] local769 = new int[local757];
			@Pc(772) int[] local772 = new int[local757];
			@Pc(775) int[] local775 = new int[local757];
			for (local777 = 0; local777 < local757; local777++) {
				local760[local777] = Integer.MAX_VALUE;
				local763[local777] = -2147483647;
				local766[local777] = Integer.MAX_VALUE;
				local769[local777] = -2147483647;
				local772[local777] = Integer.MAX_VALUE;
				local775[local777] = -2147483647;
			}
			local751 = new float[local757][];
			local749 = new int[local757];
			for (local819 = 0; local819 < this.anInt8099; local819++) {
				local825 = local109[local819];
				if (arg1.aByteArray7[local825] != -1) {
					local838 = arg1.aByteArray7[local825] & 0xFF;
					for (local840 = 0; local840 < 3; local840++) {
						@Pc(852) short local852;
						if (local840 == 0) {
							local852 = arg1.aShortArray26[local825];
						} else if (local840 == 1) {
							local852 = arg1.aShortArray20[local825];
						} else {
							local852 = arg1.aShortArray18[local825];
						}
						local876 = arg1.anIntArray33[local852];
						local881 = arg1.anIntArray32[local852];
						@Pc(886) int local886 = arg1.anIntArray35[local852];
						if (local876 < local760[local838]) {
							local760[local838] = local876;
						}
						if (local876 > local763[local838]) {
							local763[local838] = local876;
						}
						if (local881 < local766[local838]) {
							local766[local838] = local881;
						}
						if (local769[local838] < local881) {
							local769[local838] = local881;
						}
						if (local886 < local772[local838]) {
							local772[local838] = local886;
						}
						if (local886 > local775[local838]) {
							local775[local838] = local886;
						}
					}
				}
			}
			local747 = new int[local757];
			local745 = new int[local757];
			for (local825 = 0; local825 < local757; local825++) {
				@Pc(976) byte local976 = arg1.aByteArray9[local825];
				if (local976 > 0) {
					local745[local825] = (local760[local825] + local763[local825]) / 2;
					local747[local825] = (local769[local825] + local766[local825]) / 2;
					local749[local825] = (local775[local825] + local772[local825]) / 2;
					if (local976 == 1) {
						local881 = arg1.anIntArray41[local825];
						local1035 = 64.0F / (float) arg1.anIntArray39[local825];
						if (local881 == 0) {
							local1049 = 1.0F;
							local1047 = 1.0F;
						} else if (local881 > 0) {
							local1047 = (float) local881 / 1024.0F;
							local1049 = 1.0F;
						} else {
							local1049 = (float) -local881 / 1024.0F;
							local1047 = 1.0F;
						}
					} else if (local976 == 2) {
						local1047 = 64.0F / (float) arg1.anIntArray38[local825];
						local1035 = 64.0F / (float) arg1.anIntArray39[local825];
						local1049 = 64.0F / (float) arg1.anIntArray41[local825];
					} else {
						local1035 = (float) arg1.anIntArray39[local825] / 1024.0F;
						local1047 = (float) arg1.anIntArray38[local825] / 1024.0F;
						local1049 = (float) arg1.anIntArray41[local825] / 1024.0F;
					}
					local751[local825] = Static70.method1170(local1035, arg1.aShortArray24[local825], arg1.aShortArray27[local825], arg1.aByteArray8[local825] & 0xFF, arg1.aShortArray19[local825], local1049, local1047);
				}
			}
		}
		@Pc(1154) Class32[] local1154 = new Class32[arg1.anInt315];
		@Pc(1173) short local1173;
		@Pc(1184) int local1184;
		@Pc(1195) int local1195;
		@Pc(1256) int local1256;
		for (@Pc(1156) int local1156 = 0; local1156 < arg1.anInt315; local1156++) {
			@Pc(1163) short local1163 = arg1.aShortArray26[local1156];
			@Pc(1168) short local1168 = arg1.aShortArray20[local1156];
			local1173 = arg1.aShortArray18[local1156];
			local1184 = this.anIntArray545[local1168] - this.anIntArray545[local1163];
			local1195 = this.anIntArray543[local1168] - this.anIntArray543[local1163];
			local777 = this.anIntArray542[local1168] - this.anIntArray542[local1163];
			local819 = this.anIntArray545[local1173] - this.anIntArray545[local1163];
			local825 = this.anIntArray543[local1173] - this.anIntArray543[local1163];
			local838 = this.anIntArray542[local1173] - this.anIntArray542[local1163];
			local840 = local838 * local1195 - local777 * local825;
			local1256 = local777 * local819 - local838 * local1184;
			for (local876 = local825 * local1184 - local1195 * local819; local840 > 8192 || local1256 > 8192 || local876 > 8192 || local840 < -8192 || local1256 < -8192 || local876 < -8192; local876 >>= 0x1) {
				local1256 >>= 0x1;
				local840 >>= 0x1;
			}
			local881 = (int) Math.sqrt((double) (local1256 * local1256 + local840 * local840 + local876 * local876));
			if (local881 <= 0) {
				local881 = 1;
			}
			local840 = local840 * 256 / local881;
			local876 = local876 * 256 / local881;
			local1256 = local1256 * 256 / local881;
			@Pc(1355) byte local1355 = arg1.aByteArray10 == null ? 0 : arg1.aByteArray10[local1156];
			if (local1355 == 0) {
				@Pc(1383) Class89 local1383 = local477[local1163];
				local1383.anInt2007 += local1256;
				local1383.anInt2011 += local876;
				local1383.anInt2010++;
				local1383.anInt2009 += local840;
				@Pc(1411) Class89 local1411 = local477[local1168];
				local1411.anInt2009 += local840;
				local1411.anInt2007 += local1256;
				local1411.anInt2011 += local876;
				local1411.anInt2010++;
				@Pc(1439) Class89 local1439 = local477[local1173];
				local1439.anInt2010++;
				local1439.anInt2011 += local876;
				local1439.anInt2009 += local840;
				local1439.anInt2007 += local1256;
			} else if (local1355 == 1) {
				@Pc(1368) Class32 local1368 = local1154[local1156] = new Class32();
				local1368.anInt677 = local876;
				local1368.anInt675 = local1256;
				local1368.anInt676 = local840;
			}
		}
		@Pc(1480) int local1480;
		for (@Pc(1474) int local1474 = 0; local1474 < this.anInt8099; local1474++) {
			local1480 = local109[local1474];
			@Pc(1487) int local1487 = arg1.aShortArray21[local1480] & 0xFFFF;
			@Pc(1492) short local1492;
			if (arg1.aShortArray22 == null) {
				local1492 = -1;
			} else {
				local1492 = arg1.aShortArray22[local1480];
			}
			if (arg1.aByteArray7 == null) {
				local1195 = -1;
			} else {
				local1195 = arg1.aByteArray7[local1480];
			}
			if (arg1.aByteArray11 == null) {
				local777 = 0;
			} else {
				local777 = arg1.aByteArray11[local1480] & 0xFF;
			}
			@Pc(1527) float local1527 = 0.0F;
			@Pc(1529) float local1529 = 0.0F;
			@Pc(1531) float local1531 = 0.0F;
			local1049 = 0.0F;
			local1035 = 0.0F;
			local1047 = 0.0F;
			@Pc(1539) byte local1539 = 0;
			@Pc(1541) byte local1541 = 0;
			@Pc(1543) int local1543 = 0;
			@Pc(1559) byte local1559;
			@Pc(1576) short local1576;
			@Pc(2320) short local2320;
			@Pc(2325) short local2325;
			if (local1492 != -1) {
				if (local1195 == -1) {
					local1047 = 0.0F;
					local1541 = 2;
					local1539 = 1;
					local1531 = 1.0F;
					local1035 = 0.0F;
					local1529 = 1.0F;
					local1049 = 1.0F;
					local1527 = 0.0F;
				} else {
					local1195 &= 0xFF;
					local1559 = arg1.aByteArray9[local1195];
					@Pc(1566) short local1566;
					@Pc(1571) short local1571;
					@Pc(1605) float local1605;
					@Pc(1616) float local1616;
					@Pc(1695) float local1695;
					@Pc(1933) float local1933;
					@Pc(1941) float local1941;
					@Pc(1949) float local1949;
					@Pc(1972) float local1972;
					@Pc(1995) float local1995;
					@Pc(2018) float local2018;
					if (local1559 == 0) {
						local1566 = arg1.aShortArray26[local1480];
						local1571 = arg1.aShortArray20[local1480];
						local1576 = arg1.aShortArray18[local1480];
						local2320 = arg1.aShortArray19[local1195];
						local2325 = arg1.aShortArray24[local1195];
						@Pc(2330) short local2330 = arg1.aShortArray27[local1195];
						@Pc(2336) float local2336 = (float) arg1.anIntArray33[local2320];
						@Pc(2342) float local2342 = (float) arg1.anIntArray32[local2320];
						local1605 = arg1.anIntArray35[local2320];
						local1616 = (float) arg1.anIntArray33[local2325] - local2336;
						local1695 = (float) arg1.anIntArray32[local2325] - local2342;
						@Pc(2374) float local2374 = (float) arg1.anIntArray35[local2325] - local1605;
						@Pc(2383) float local2383 = (float) arg1.anIntArray33[local2330] - local2336;
						@Pc(2391) float local2391 = (float) arg1.anIntArray32[local2330] - local2342;
						@Pc(2399) float local2399 = (float) arg1.anIntArray35[local2330] - local1605;
						@Pc(2407) float local2407 = (float) arg1.anIntArray33[local1566] - local2336;
						@Pc(2416) float local2416 = (float) arg1.anIntArray32[local1566] - local2342;
						@Pc(2425) float local2425 = (float) arg1.anIntArray35[local1566] - local1605;
						@Pc(2433) float local2433 = (float) arg1.anIntArray33[local1571] - local2336;
						@Pc(2442) float local2442 = (float) arg1.anIntArray32[local1571] - local2342;
						local1933 = (float) arg1.anIntArray35[local1571] - local1605;
						local1941 = (float) arg1.anIntArray33[local1576] - local2336;
						local1949 = (float) arg1.anIntArray32[local1576] - local2342;
						local1972 = (float) arg1.anIntArray35[local1576] - local1605;
						local1995 = local2399 * local1695 - local2374 * local2391;
						local2018 = local2374 * local2383 - local2399 * local1616;
						@Pc(2502) float local2502 = local1616 * local2391 - local2383 * local1695;
						@Pc(2510) float local2510 = local2502 * local2391 - local2399 * local2018;
						@Pc(2519) float local2519 = local2399 * local1995 - local2383 * local2502;
						@Pc(2528) float local2528 = local2383 * local2018 - local1995 * local2391;
						@Pc(2542) float local2542 = 1.0F / (local1616 * local2510 + local2519 * local1695 + local2528 * local2374);
						local1531 = local2542 * (local2528 * local1933 + local2442 * local2519 + local2433 * local2510);
						local1035 = (local1941 * local2510 + local2519 * local1949 + local1972 * local2528) * local2542;
						local1527 = (local2425 * local2528 + local2510 * local2407 + local2519 * local2416) * local2542;
						@Pc(2593) float local2593 = local2374 * local1995 - local2502 * local1616;
						@Pc(2602) float local2602 = local2502 * local1695 - local2018 * local2374;
						@Pc(2610) float local2610 = local2018 * local1616 - local1695 * local1995;
						@Pc(2624) float local2624 = 1.0F / (local2399 * local2610 + local2602 * local2383 + local2391 * local2593);
						local1529 = local2624 * (local2610 * local2425 + local2602 * local2407 + local2416 * local2593);
						local1047 = (local2610 * local1972 + local2602 * local1941 + local1949 * local2593) * local2624;
						local1049 = local2624 * (local2593 * local2442 + local2433 * local2602 + local1933 * local2610);
					} else {
						local1566 = arg1.aShortArray26[local1480];
						local1571 = arg1.aShortArray20[local1480];
						local1576 = arg1.aShortArray18[local1480];
						@Pc(1580) int local1580 = local745[local1195];
						@Pc(1584) int local1584 = local747[local1195];
						@Pc(1588) int local1588 = local749[local1195];
						@Pc(1592) float[] local1592 = local751[local1195];
						@Pc(1597) byte local1597 = arg1.aByteArray6[local1195];
						local1605 = (float) arg1.anIntArray40[local1195] / 256.0F;
						if (local1559 == 1) {
							local1616 = (float) arg1.anIntArray38[local1195] / 1024.0F;
							Static484.method6238(local1584, local1605, local1588, local1592, arg1.anIntArray35[local1566], local1580, arg1.anIntArray33[local1566], local1616, local1597, arg1.anIntArray32[local1566]);
							local1529 = Static212.aFloat66;
							local1527 = Static157.aFloat57;
							Static484.method6238(local1584, local1605, local1588, local1592, arg1.anIntArray35[local1571], local1580, arg1.anIntArray33[local1571], local1616, local1597, arg1.anIntArray32[local1571]);
							local1531 = Static157.aFloat57;
							local1049 = Static212.aFloat66;
							Static484.method6238(local1584, local1605, local1588, local1592, arg1.anIntArray35[local1576], local1580, arg1.anIntArray33[local1576], local1616, local1597, arg1.anIntArray32[local1576]);
							local1035 = Static157.aFloat57;
							local1047 = Static212.aFloat66;
							local1695 = local1616 / 2.0F;
							if ((local1597 & 0x1) == 0) {
								if (local1695 < local1035 - local1527) {
									local1541 = 1;
									local1035 -= local1616;
								} else if (local1527 - local1035 > local1695) {
									local1541 = 2;
									local1035 += local1616;
								}
								if (local1695 < local1531 - local1527) {
									local1531 -= local1616;
									local1539 = 1;
								} else if (local1527 - local1531 > local1695) {
									local1531 += local1616;
									local1539 = 2;
								}
							} else {
								if (local1695 < local1049 - local1529) {
									local1049 -= local1616;
									local1539 = 1;
								} else if (local1695 < local1529 - local1049) {
									local1049 += local1616;
									local1539 = 2;
								}
								if (local1695 < local1047 - local1529) {
									local1541 = 1;
									local1047 -= local1616;
								} else if (local1529 - local1047 > local1695) {
									local1047 += local1616;
									local1541 = 2;
								}
							}
						} else if (local1559 == 2) {
							local1616 = (float) arg1.anIntArray31[local1195] / 256.0F;
							local1695 = (float) arg1.anIntArray36[local1195] / 256.0F;
							@Pc(1844) int local1844 = arg1.anIntArray33[local1571] - arg1.anIntArray33[local1566];
							@Pc(1855) int local1855 = arg1.anIntArray32[local1571] - arg1.anIntArray32[local1566];
							@Pc(1866) int local1866 = arg1.anIntArray35[local1571] - arg1.anIntArray35[local1566];
							@Pc(1877) int local1877 = arg1.anIntArray33[local1576] - arg1.anIntArray33[local1566];
							@Pc(1888) int local1888 = arg1.anIntArray32[local1576] - arg1.anIntArray32[local1566];
							@Pc(1899) int local1899 = arg1.anIntArray35[local1576] - arg1.anIntArray35[local1566];
							@Pc(1908) int local1908 = local1899 * local1855 - local1888 * local1866;
							@Pc(1916) int local1916 = local1877 * local1866 - local1844 * local1899;
							@Pc(1925) int local1925 = local1888 * local1844 - local1855 * local1877;
							local1933 = 64.0F / (float) arg1.anIntArray41[local1195];
							local1941 = 64.0F / (float) arg1.anIntArray39[local1195];
							local1949 = 64.0F / (float) arg1.anIntArray38[local1195];
							local1972 = ((float) local1925 * local1592[2] + local1592[0] * (float) local1908 + local1592[1] * (float) local1916) / local1933;
							local1995 = ((float) local1925 * local1592[5] + (float) local1908 * local1592[3] + local1592[4] * (float) local1916) / local1941;
							local2018 = ((float) local1916 * local1592[7] + (float) local1908 * local1592[6] + local1592[8] * (float) local1925) / local1949;
							local1543 = Static387.method5348(local1972, local2018, local1995);
							Static245.method3483(local1695, local1616, local1605, local1543, local1597, local1584, local1580, local1588, arg1.anIntArray33[local1566], arg1.anIntArray32[local1566], local1592, arg1.anIntArray35[local1566]);
							local1529 = Static511.aFloat237;
							local1527 = Static488.aFloat203;
							Static245.method3483(local1695, local1616, local1605, local1543, local1597, local1584, local1580, local1588, arg1.anIntArray33[local1571], arg1.anIntArray32[local1571], local1592, arg1.anIntArray35[local1571]);
							local1049 = Static511.aFloat237;
							local1531 = Static488.aFloat203;
							Static245.method3483(local1695, local1616, local1605, local1543, local1597, local1584, local1580, local1588, arg1.anIntArray33[local1576], arg1.anIntArray32[local1576], local1592, arg1.anIntArray35[local1576]);
							local1047 = Static511.aFloat237;
							local1035 = Static488.aFloat203;
						} else if (local1559 == 3) {
							Static470.method6058(arg1.anIntArray33[local1566], local1605, local1592, local1580, local1597, arg1.anIntArray32[local1566], arg1.anIntArray35[local1566], local1584, local1588);
							local1527 = Static332.aFloat243;
							local1529 = Static191.aFloat64;
							Static470.method6058(arg1.anIntArray33[local1571], local1605, local1592, local1580, local1597, arg1.anIntArray32[local1571], arg1.anIntArray35[local1571], local1584, local1588);
							local1531 = Static332.aFloat243;
							local1049 = Static191.aFloat64;
							Static470.method6058(arg1.anIntArray33[local1576], local1605, local1592, local1580, local1597, arg1.anIntArray32[local1576], arg1.anIntArray35[local1576], local1584, local1588);
							local1047 = Static191.aFloat64;
							local1035 = Static332.aFloat243;
							if ((local1597 & 0x1) == 0) {
								if (local1035 - local1527 > 0.5F) {
									local1541 = 1;
									local1035--;
								} else if (local1527 - local1035 > 0.5F) {
									local1541 = 2;
									local1035++;
								}
								if (local1531 - local1527 > 0.5F) {
									local1539 = 1;
									local1531--;
								} else if (local1527 - local1531 > 0.5F) {
									local1539 = 2;
									local1531++;
								}
							} else {
								if (local1047 - local1529 > 0.5F) {
									local1047--;
									local1541 = 1;
								} else if (local1529 - local1047 > 0.5F) {
									local1047++;
									local1541 = 2;
								}
								if (local1049 - local1529 > 0.5F) {
									local1539 = 1;
									local1049--;
								} else if (local1529 - local1049 > 0.5F) {
									local1049++;
									local1539 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray10 == null) {
				local1559 = 0;
			} else {
				local1559 = arg1.aByteArray10[local1480];
			}
			if (local1559 == 0) {
				@Pc(2718) long local2718 = (long) (local1195 << 2) + ((long) (local1543 << 24) + (long) (local1487 << 8) + (long) local777 << 32);
				local1576 = arg1.aShortArray26[local1480];
				local2320 = arg1.aShortArray20[local1480];
				local2325 = arg1.aShortArray18[local1480];
				@Pc(2737) Class89 local2737 = local477[local1576];
				this.aShortArray127[local1474] = this.method6589(local1529, local2718, arg1, local1527, local2737.anInt2010, local2737.anInt2007, local2737.anInt2009, local1576, local2737.anInt2011);
				@Pc(2761) Class89 local2761 = local477[local2320];
				this.aShortArray132[local1474] = this.method6589(local1049, local2718 + (long) local1539, arg1, local1531, local2761.anInt2010, local2761.anInt2007, local2761.anInt2009, local2320, local2761.anInt2011);
				@Pc(2788) Class89 local2788 = local477[local2325];
				this.aShortArray128[local1474] = this.method6589(local1047, local2718 + (long) local1541, arg1, local1035, local2788.anInt2010, local2788.anInt2007, local2788.anInt2009, local2325, local2788.anInt2011);
			} else if (local1559 == 1) {
				@Pc(2820) Class32 local2820 = local1154[local1480];
				@Pc(2865) long local2865 = (long) ((local2820.anInt677 + 256 << 22) + (local2820.anInt675 + 256 << 12) + (local2820.anInt676 > 0 ? 1024 : 2048) + (local1195 << 2)) + ((long) local777 + (long) (local1487 << 8) + (long) (local1543 << 24) << 32);
				this.aShortArray127[local1474] = this.method6589(local1529, local2865, arg1, local1527, 0, local2820.anInt675, local2820.anInt676, arg1.aShortArray26[local1480], local2820.anInt677);
				this.aShortArray132[local1474] = this.method6589(local1049, (long) local1539 + local2865, arg1, local1531, 0, local2820.anInt675, local2820.anInt676, arg1.aShortArray20[local1480], local2820.anInt677);
				this.aShortArray128[local1474] = this.method6589(local1047, local2865 + (long) local1541, arg1, local1035, 0, local2820.anInt675, local2820.anInt676, arg1.aShortArray18[local1480], local2820.anInt677);
			}
			if (arg1.aShortArray22 == null) {
				this.aShortArray122[local1474] = -1;
			} else {
				this.aShortArray122[local1474] = arg1.aShortArray22[local1480];
			}
			if (arg1.aByteArray11 != null) {
				this.aByteArray88[local1474] = arg1.aByteArray11[local1480];
			}
			if (arg1.aShortArray23 != null) {
				this.aShortArray126[local1474] = arg1.aShortArray23[local1480];
			}
			this.aShortArray131[local1474] = arg1.aShortArray21[local1480];
		}
		local1480 = 0;
		local1173 = -10000;
		for (local1184 = 0; local1184 < this.anInt8091; local1184++) {
			@Pc(3003) short local3003 = this.aShortArray122[local1184];
			if (local1173 != local3003) {
				local1480++;
				local1173 = local3003;
			}
		}
		this.anIntArray544 = new int[local1480 + 1];
		local1173 = -10000;
		local1480 = 0;
		for (local1195 = 0; local1195 < this.anInt8091; local1195++) {
			@Pc(3037) short local3037 = this.aShortArray122[local1195];
			if (local1173 != local3037) {
				this.anIntArray544[local1480++] = local1195;
				local1173 = local3037;
			}
		}
		this.anIntArray544[local1480] = this.anInt8091;
		Static119.aLongArray4 = null;
		this.aShortArray130 = Static434.method5701(this.anInt8095, this.aShortArray130);
		this.aShortArray123 = Static434.method5701(this.anInt8095, this.aShortArray123);
		this.aShortArray125 = Static434.method5701(this.anInt8095, this.aShortArray125);
		this.aByteArray89 = Static408.method2562(this.anInt8095, this.aByteArray89);
		this.aFloatArray65 = Static168.method2200(this.aFloatArray65, this.anInt8095);
		this.aFloatArray64 = Static168.method2200(this.aFloatArray64, this.anInt8095);
		if (arg1.anIntArray34 != null && Static563.method7369(arg2, this.anInt8090)) {
			this.anIntArrayArray57 = arg1.method243(false);
		}
		if (arg1.aClass122Array1 != null && Static86.method1272(arg2, this.anInt8090)) {
			this.anIntArrayArray55 = arg1.method236();
		}
		if (arg1.anIntArray37 != null && Static485.method6240(arg2, this.anInt8090)) {
			local777 = 0;
			@Pc(3156) int[] local3156 = new int[256];
			for (local825 = 0; local825 < this.anInt8099; local825++) {
				local838 = arg1.anIntArray37[local109[local825]];
				if (local838 >= 0) {
					@Pc(3173) int local3173 = local3156[local838]++;
					if (local838 > local777) {
						local777 = local838;
					}
				}
			}
			this.anIntArrayArray56 = new int[local777 + 1][];
			for (local838 = 0; local838 <= local777; local838++) {
				this.anIntArrayArray56[local838] = new int[local3156[local838]];
				local3156[local838] = 0;
			}
			for (local840 = 0; local840 < this.anInt8099; local840++) {
				local1256 = arg1.anIntArray37[local109[local840]];
				if (local1256 >= 0) {
					this.anIntArrayArray56[local1256][local3156[local1256]++] = local840;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8079; local7++) {
			if (arg0 != 128) {
				this.anIntArray545[local7] = this.anIntArray545[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray543[local7] = arg1 * this.anIntArray543[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray542[local7] = arg2 * this.anIntArray542[local7] >> 7;
			}
		}
		if (this.aClass133_8 != null) {
			this.aClass133_8.anInterface10_2 = null;
		}
		this.aBoolean682 = false;
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)V")
	private void method6582() {
		if (this.aClass193Array1 == null) {
			return;
		}
		@Pc(8) Class25_Sub1 local8 = this.aClass162_Sub3_37.aClass25_Sub1_2;
		this.aClass162_Sub3_37.method6965();
		this.aClass162_Sub3_37.ZA(!this.aBoolean683);
		this.aClass162_Sub3_37.method6907(false);
		this.aClass162_Sub3_37.method6916(this.aClass162_Sub3_37.aClass133_12, null, null, this.aClass162_Sub3_37.aClass133_11);
		for (@Pc(40) int local40 = 0; local40 < this.anInt8053; local40++) {
			@Pc(47) Class193 local47 = this.aClass193Array1[local40];
			@Pc(52) Class65 local52 = this.aClass65Array1[local40];
			if (!local47.aBoolean368 || !this.aClass162_Sub3_37.method6880()) {
				@Pc(80) float local80 = (float) (this.anIntArray545[local47.anInt4792] + this.anIntArray545[local47.anInt4793] + this.anIntArray545[local47.anInt4795]) * 0.3333333F;
				@Pc(101) float local101 = (float) (this.anIntArray543[local47.anInt4792] + this.anIntArray543[local47.anInt4795] + this.anIntArray543[local47.anInt4793]) * 0.3333333F;
				@Pc(122) float local122 = (float) (this.anIntArray542[local47.anInt4792] + this.anIntArray542[local47.anInt4795] + this.anIntArray542[local47.anInt4793]) * 0.3333333F;
				@Pc(136) float local136 = Static217.aFloat68 * local80 + local101 * Static321.aFloat158 + Static61.aFloat27 * local122 + Static148.aFloat56;
				@Pc(150) float local150 = Static345.aFloat162 + local80 * Static550.aFloat186 + Static240.aFloat259 * local101 + Static266.aFloat126 * local122;
				@Pc(164) float local164 = Static517.aFloat207 + Static434.aFloat189 * local122 + Static369.aFloat244 * local101 + local80 * Static523.aFloat210;
				local8.method377(local52.anInt1378 * local47.aShort51 >> 7, local47.aShort53 * local52.anInt1373 >> 7, local136 + (float) local52.anInt1376, -local164 + (float) local47.anInt4796, local52.anInt1374, (float) local52.anInt1372 - local150);
				this.aClass162_Sub3_37.method6913(local8);
				@Pc(207) int local207 = local52.anInt1379;
				OpenGL.glColor4ub((byte) (local207 >> 16), (byte) (local207 >> 8), (byte) local207, (byte) (local207 >> 24));
				this.aClass162_Sub3_37.method6963(local47.aShort52);
				this.aClass162_Sub3_37.method6923(local47.aByte45);
				this.aClass162_Sub3_37.method6956(4);
			}
		}
		this.aClass162_Sub3_37.ZA(true);
		this.aClass162_Sub3_37.method6898();
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class33 method7200(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(32) Class33_Sub3 local32;
		@Pc(36) Class33_Sub3 local36;
		if (arg0 == 1) {
			local36 = this.aClass162_Sub3_37.aClass33_Sub3_6;
			local32 = this.aClass162_Sub3_37.aClass33_Sub3_5;
		} else if (arg0 == 2) {
			local32 = this.aClass162_Sub3_37.aClass33_Sub3_10;
			local36 = this.aClass162_Sub3_37.aClass33_Sub3_4;
		} else if (arg0 == 3) {
			local36 = this.aClass162_Sub3_37.aClass33_Sub3_2;
			local32 = this.aClass162_Sub3_37.aClass33_Sub3_7;
		} else if (arg0 == 4) {
			local36 = this.aClass162_Sub3_37.aClass33_Sub3_9;
			local32 = this.aClass162_Sub3_37.aClass33_Sub3_1;
		} else if (arg0 == 5) {
			local32 = this.aClass162_Sub3_37.aClass33_Sub3_8;
			local36 = this.aClass162_Sub3_37.aClass33_Sub3_3;
		} else {
			local32 = local36 = new Class33_Sub3(this.aClass162_Sub3_37);
		}
		return this.method6585(local36, arg1, arg2, arg0 != 0, local32);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!q;Lclient!qh;I)V")
	@Override
	public void method7192(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class12_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8095 == 0) {
			return;
		}
		@Pc(16) Class25_Sub1 local16 = this.aClass162_Sub3_37.aClass25_Sub1_3;
		@Pc(19) Class25_Sub1 local19 = (Class25_Sub1) arg0;
		if (!this.aBoolean682) {
			this.method6588();
		}
		Static517.aFloat207 = local16.aFloat18 * local19.aFloat16 + local19.aFloat11 * local16.aFloat13 + local19.aFloat22 * local16.aFloat19 + local16.aFloat22;
		Static369.aFloat244 = local19.aFloat18 * local16.aFloat19 + local16.aFloat18 * local19.aFloat20 + local19.aFloat15 * local16.aFloat13;
		@Pc(72) float local72 = Static517.aFloat207 + Static369.aFloat244 * (float) this.aShort105;
		@Pc(80) float local80 = Static369.aFloat244 * (float) this.aShort100 + Static517.aFloat207;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local97 = (float) -this.aShort99 + local80;
			local90 = (float) this.aShort99 + local72;
		} else {
			local90 = local80 + (float) this.aShort99;
			local97 = (float) -this.aShort99 + local72;
		}
		if (local97 >= this.aClass162_Sub3_37.aFloat215 || (float) this.aClass162_Sub3_37.anInt8703 >= local90) {
			return;
		}
		Static148.aFloat56 = local19.aFloat22 * local16.aFloat17 + local19.aFloat16 * local16.aFloat15 + local16.aFloat12 * local19.aFloat11 + local16.aFloat11;
		Static321.aFloat158 = local19.aFloat20 * local16.aFloat15 + local19.aFloat15 * local16.aFloat12 + local19.aFloat18 * local16.aFloat17;
		@Pc(174) float local174 = Static321.aFloat158 * (float) this.aShort105 + Static148.aFloat56;
		@Pc(182) float local182 = Static321.aFloat158 * (float) this.aShort100 + Static148.aFloat56;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local174 > local182) {
			local198 = (float) this.aClass162_Sub3_37.anInt8728 * (local182 - (float) this.aShort99);
			local209 = (float) this.aClass162_Sub3_37.anInt8728 * (local174 + (float) this.aShort99);
		} else {
			local198 = ((float) -this.aShort99 + local174) * (float) this.aClass162_Sub3_37.anInt8728;
			local209 = (local182 + (float) this.aShort99) * (float) this.aClass162_Sub3_37.anInt8728;
		}
		if (this.aClass162_Sub3_37.aFloat216 <= local198 / local90 || this.aClass162_Sub3_37.aFloat219 >= local209 / local90) {
			return;
		}
		Static240.aFloat259 = local19.aFloat15 * local16.aFloat14 + local19.aFloat20 * local16.aFloat20 + local16.aFloat21 * local19.aFloat18;
		Static345.aFloat162 = local16.aFloat16 + local16.aFloat14 * local19.aFloat11 + local16.aFloat20 * local19.aFloat16 + local19.aFloat22 * local16.aFloat21;
		@Pc(298) float local298 = Static345.aFloat162 + Static240.aFloat259 * (float) this.aShort105;
		@Pc(306) float local306 = Static240.aFloat259 * (float) this.aShort100 + Static345.aFloat162;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local298 > local306) {
			local333 = (local298 + (float) this.aShort99) * (float) this.aClass162_Sub3_37.bf;
			local322 = ((float) -this.aShort99 + local306) * (float) this.aClass162_Sub3_37.bf;
		} else {
			local322 = ((float) -this.aShort99 + local298) * (float) this.aClass162_Sub3_37.bf;
			local333 = ((float) this.aShort99 + local306) * (float) this.aClass162_Sub3_37.bf;
		}
		if (local322 / local90 >= this.aClass162_Sub3_37.aFloat230 || local333 / local90 <= this.aClass162_Sub3_37.aFloat228) {
			return;
		}
		if (arg1 != null || this.aClass193Array1 != null) {
			Static217.aFloat68 = local19.aFloat14 * local16.aFloat15 + local19.aFloat12 * local16.aFloat12 + local16.aFloat17 * local19.aFloat13;
			Static266.aFloat126 = local16.aFloat14 * local19.aFloat17 + local16.aFloat20 * local19.aFloat21 + local19.aFloat19 * local16.aFloat21;
			Static550.aFloat186 = local16.aFloat21 * local19.aFloat13 + local19.aFloat12 * local16.aFloat14 + local19.aFloat14 * local16.aFloat20;
			Static61.aFloat27 = local19.aFloat19 * local16.aFloat17 + local19.aFloat21 * local16.aFloat15 + local16.aFloat12 * local19.aFloat17;
			Static523.aFloat210 = local19.aFloat14 * local16.aFloat18 + local16.aFloat13 * local19.aFloat12 + local19.aFloat13 * local16.aFloat19;
			Static434.aFloat189 = local19.aFloat17 * local16.aFloat13 + local19.aFloat21 * local16.aFloat18 + local19.aFloat19 * local16.aFloat19;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.aShort103 + this.aShort98 >> 1;
			@Pc(511) int local511 = this.aShort102 + this.aShort104 >> 1;
			@Pc(530) int local530 = (int) ((float) local511 * Static61.aFloat27 + (float) this.aShort105 * Static321.aFloat158 + (float) local503 * Static217.aFloat68 + Static148.aFloat56);
			@Pc(549) int local549 = (int) (Static345.aFloat162 + (float) local503 * Static550.aFloat186 + Static240.aFloat259 * (float) this.aShort105 + Static266.aFloat126 * (float) local511);
			@Pc(568) int local568 = (int) (Static369.aFloat244 * (float) this.aShort105 + Static517.aFloat207 + Static523.aFloat210 * (float) local503 + Static434.aFloat189 * (float) local511);
			if (local568 >= this.aClass162_Sub3_37.anInt8703) {
				arg1.anInt7026 = this.aClass162_Sub3_37.anInt8717 + this.aClass162_Sub3_37.bf * local549 / local568;
				arg1.anInt7029 = this.aClass162_Sub3_37.anInt8725 + this.aClass162_Sub3_37.anInt8728 * local530 / local568;
			} else {
				local493 = true;
			}
			@Pc(626) int local626 = (int) ((float) local503 * Static217.aFloat68 + Static148.aFloat56 + (float) this.aShort100 * Static321.aFloat158 + (float) local511 * Static61.aFloat27);
			@Pc(645) int local645 = (int) ((float) local511 * Static266.aFloat126 + (float) this.aShort100 * Static240.aFloat259 + (float) local503 * Static550.aFloat186 + Static345.aFloat162);
			@Pc(664) int local664 = (int) (Static434.aFloat189 * (float) local511 + (float) this.aShort100 * Static369.aFloat244 + (float) local503 * Static523.aFloat210 + Static517.aFloat207);
			if (this.aClass162_Sub3_37.anInt8703 > local664) {
				local493 = true;
			} else {
				arg1.anInt7027 = this.aClass162_Sub3_37.anInt8725 + local626 * this.aClass162_Sub3_37.anInt8728 / local664;
				arg1.anInt7028 = this.aClass162_Sub3_37.anInt8717 + this.aClass162_Sub3_37.bf * local645 / local664;
			}
			if (local493) {
				if (this.aClass162_Sub3_37.anInt8703 > local568 && this.aClass162_Sub3_37.anInt8703 > local664) {
					local495 = false;
				} else {
					@Pc(751) int local751;
					@Pc(762) int local762;
					@Pc(788) int local788;
					if (this.aClass162_Sub3_37.anInt8703 > local568) {
						local751 = (local664 - this.aClass162_Sub3_37.anInt8703 << 16) / (local664 - local568);
						local762 = ((local626 - local530) * local751 >> 16) + local626;
						arg1.anInt7029 = local762 * this.aClass162_Sub3_37.anInt8728 / this.aClass162_Sub3_37.anInt8703 + this.aClass162_Sub3_37.anInt8725;
						local788 = ((local645 - local549) * local751 >> 16) + local645;
						arg1.anInt7026 = this.aClass162_Sub3_37.anInt8717 + this.aClass162_Sub3_37.bf * local788 / this.aClass162_Sub3_37.anInt8703;
					} else if (local664 < this.aClass162_Sub3_37.anInt8703) {
						local751 = (local568 - this.aClass162_Sub3_37.anInt8703 << 16) / (local568 - local664);
						local762 = local530 + (local751 * (local530 - local626) >> 16);
						arg1.anInt7029 = this.aClass162_Sub3_37.anInt8725 + local762 * this.aClass162_Sub3_37.anInt8728 / this.aClass162_Sub3_37.anInt8703;
						local788 = local549 + ((local549 - local645) * local751 >> 16);
						arg1.anInt7026 = this.aClass162_Sub3_37.bf * local788 / this.aClass162_Sub3_37.anInt8703 + this.aClass162_Sub3_37.anInt8717;
					}
				}
			}
			if (local495) {
				if (local568 > local664) {
					arg1.anInt7030 = this.aClass162_Sub3_37.anInt8725 + this.aClass162_Sub3_37.anInt8728 * (local530 + this.aShort99) / local568 - arg1.anInt7029;
				} else {
					arg1.anInt7030 = this.aClass162_Sub3_37.anInt8725 + this.aClass162_Sub3_37.anInt8728 * (local626 - -this.aShort99) / local664 - arg1.anInt7027;
				}
				arg1.aBoolean576 = true;
			}
		}
		this.aClass162_Sub3_37.method6932();
		this.aClass162_Sub3_37.method6969(local19);
		this.method6583();
		this.aClass162_Sub3_37.method6898();
		this.method6582();
	}

	@OriginalMember(owner = "client!tda", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean682) {
			this.method6588();
		}
		return this.aShort102;
	}

	@OriginalMember(owner = "client!tda", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class285.anIntArray476[arg0];
		@Pc(13) int local13 = Class285.anIntArray475[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8079; local15++) {
			@Pc(33) int local33 = this.anIntArray543[local15] * local13 - local9 * this.anIntArray542[local15] >> 14;
			this.anIntArray542[local15] = local9 * this.anIntArray543[local15] + this.anIntArray542[local15] * local13 >> 14;
			this.anIntArray543[local15] = local33;
		}
		if (this.aClass133_8 != null) {
			this.aClass133_8.anInterface10_2 = null;
		}
		this.aBoolean682 = false;
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V")
	private void method6583() {
		if (this.anInt8091 == 0) {
			return;
		}
		if (this.aByte115 != 0) {
			this.method6593(true);
		}
		this.method6593(false);
		if (this.aClass327_1 != null) {
			if (this.aClass327_1.anInterface21_3 == null) {
				this.method6586((this.aByte115 & 0x10) != 0);
			}
			if (this.aClass327_1.anInterface21_3 != null) {
				this.aClass162_Sub3_37.method6907(this.aClass133_9 != null);
				this.aClass162_Sub3_37.method6916(this.aClass133_10, this.aClass133_9, this.aClass133_7, this.aClass133_8);
				@Pc(76) int local76 = this.anIntArray544.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray544[local78];
					@Pc(92) int local92 = this.anIntArray544[local78 + 1];
					@Pc(99) int local99 = this.aShortArray122[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass162_Sub3_37.method6919(this.aClass133_9 != null, local99);
					this.aClass162_Sub3_37.method6904(local85 * 3, (local92 - local85) * 3, this.aClass327_1.anInterface21_3);
				}
			}
		}
		this.method6591();
	}

	@OriginalMember(owner = "client!tda", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt8066 = arg0;
		if (this.aClass353_1 != null && (this.anInt8066 & 0x10000) == 0) {
			this.aByteArray89 = this.aClass353_1.aByteArray100;
			this.aShortArray130 = this.aClass353_1.aShortArray137;
			this.aShortArray125 = this.aClass353_1.aShortArray136;
			this.aShortArray123 = this.aClass353_1.aShortArray135;
			this.aClass353_1 = null;
		}
		this.aBoolean681 = true;
		this.method6591();
	}

	@OriginalMember(owner = "client!tda", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8079; local7++) {
			this.anIntArray542[local7] = -this.anIntArray542[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt8095; local29++) {
			this.aShortArray125[local29] = (short) -this.aShortArray125[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt8099; local52++) {
			@Pc(59) short local59 = this.aShortArray127[local52];
			this.aShortArray127[local52] = this.aShortArray128[local52];
			this.aShortArray128[local52] = local59;
		}
		if (this.aClass133_9 == null && this.aClass133_7 != null) {
			this.aClass133_7.anInterface10_2 = null;
		}
		if (this.aClass133_9 != null) {
			this.aClass133_9.anInterface10_2 = null;
		}
		if (this.aClass327_1 != null) {
			this.aClass327_1.anInterface21_3 = null;
		}
		this.aBoolean682 = false;
		if (this.aClass133_8 != null) {
			this.aClass133_8.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3) {
		return this.method6595(-1, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!tda", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static4.anInt80 = 0;
			local29 = 0;
			Static592.anInt9608 = 0;
			Static214.anInt3101 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray57.length) {
					local51 = this.anIntArrayArray57[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray129 == null || (this.aShortArray129[local59] & arg6) != 0) {
							Static214.anInt3101 += this.anIntArray545[local59];
							Static592.anInt9608 += this.anIntArray543[local59];
							Static4.anInt80 += this.anIntArray542[local59];
							local29++;
						}
					}
				}
			}
			if (local29 > 0) {
				Static4.anInt80 = Static4.anInt80 / local29 + arg4;
				Static368.aBoolean700 = true;
				Static214.anInt3101 = Static214.anInt3101 / local29 + arg2;
				Static592.anInt9608 = Static592.anInt9608 / local29 + arg3;
			} else {
				Static214.anInt3101 = arg2;
				Static4.anInt80 = arg4;
				Static592.anInt9608 = arg3;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg3 * arg7[7] + arg2 * arg7[6] + 8192 >> 14;
				arg3 = local35;
				arg2 = local29;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray57.length > local35) {
					local250 = this.anIntArrayArray57[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local53 = local250[local252];
						if (this.aShortArray129 == null || (arg6 & this.aShortArray129[local53]) != 0) {
							this.anIntArray545[local53] += arg2;
							this.anIntArray543[local53] += arg3;
							this.anIntArray542[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(376) int local376;
		@Pc(398) int local398;
		@Pc(429) int local429;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(468) int local468;
		@Pc(476) int local476;
		@Pc(484) int local484;
		@Pc(639) int local639;
		@Pc(664) int local664;
		@Pc(669) int local669;
		@Pc(677) int local677;
		@Pc(682) int local682;
		@Pc(686) int local686;
		@Pc(690) int local690;
		@Pc(692) int local692;
		@Pc(820) int[] local820;
		@Pc(822) int local822;
		@Pc(826) int local826;
		@Pc(830) int local830;
		@Pc(832) int local832;
		@Pc(958) int local958;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray57.length) {
						local250 = this.anIntArrayArray57[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local53 = local250[local252];
							if (this.aShortArray129 == null || (arg6 & this.aShortArray129[local53]) != 0) {
								this.anIntArray545[local53] -= Static214.anInt3101;
								this.anIntArray543[local53] -= Static592.anInt9608;
								this.anIntArray542[local53] -= Static4.anInt80;
								if (arg4 != 0) {
									local59 = Class285.anIntArray476[arg4];
									local376 = Class285.anIntArray475[arg4];
									local398 = this.anIntArray545[local53] * local376 + local59 * this.anIntArray543[local53] + 16383 >> 14;
									this.anIntArray543[local53] = local376 * this.anIntArray543[local53] + 16383 - local59 * this.anIntArray545[local53] >> 14;
									this.anIntArray545[local53] = local398;
								}
								if (arg2 != 0) {
									local59 = Class285.anIntArray476[arg2];
									local376 = Class285.anIntArray475[arg2];
									local398 = local376 * this.anIntArray543[local53] + 16383 - local59 * this.anIntArray542[local53] >> 14;
									this.anIntArray542[local53] = this.anIntArray542[local53] * local376 + this.anIntArray543[local53] * local59 + 16383 >> 14;
									this.anIntArray543[local53] = local398;
								}
								if (arg3 != 0) {
									local59 = Class285.anIntArray476[arg3];
									local376 = Class285.anIntArray475[arg3];
									local398 = this.anIntArray545[local53] * local376 + this.anIntArray542[local53] * local59 + 16383 >> 14;
									this.anIntArray542[local53] = this.anIntArray542[local53] * local376 + 16383 - this.anIntArray545[local53] * local59 >> 14;
									this.anIntArray545[local53] = local398;
								}
								this.anIntArray545[local53] += Static214.anInt3101;
								this.anIntArray543[local53] += Static592.anInt9608;
								this.anIntArray542[local53] += Static4.anInt80;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray57.length) {
							local51 = this.anIntArrayArray57[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray129 == null || (this.aShortArray129[local59] & arg6) != 0) {
									local376 = this.anIntArray546[local59];
									local398 = this.anIntArray546[local59 + 1];
									for (local429 = local376; local429 < local398; local429++) {
										local456 = this.aShortArray124[local429] - 1;
										if (local456 == -1) {
											break;
										}
										if (arg4 != 0) {
											local460 = Class285.anIntArray476[arg4];
											local464 = Class285.anIntArray475[arg4];
											local468 = this.aShortArray123[local456] * local460 + this.aShortArray130[local456] * local464 + 16383 >> 14;
											this.aShortArray123[local456] = (short) (this.aShortArray123[local456] * local464 + 16383 - this.aShortArray130[local456] * local460 >> 14);
											this.aShortArray130[local456] = (short) local468;
										}
										if (arg2 != 0) {
											local460 = Class285.anIntArray476[arg2];
											local464 = Class285.anIntArray475[arg2];
											local468 = this.aShortArray123[local456] * local464 + 16383 - this.aShortArray125[local456] * local460 >> 14;
											this.aShortArray125[local456] = (short) (local460 * this.aShortArray123[local456] + this.aShortArray125[local456] * local464 + 16383 >> 14);
											this.aShortArray123[local456] = (short) local468;
										}
										if (arg3 != 0) {
											local460 = Class285.anIntArray476[arg3];
											local464 = Class285.anIntArray475[arg3];
											local468 = this.aShortArray130[local456] * local464 + local460 * this.aShortArray125[local456] + 16383 >> 14;
											this.aShortArray125[local456] = (short) (this.aShortArray125[local456] * local464 + 16383 - local460 * this.aShortArray130[local456] >> 14);
											this.aShortArray130[local456] = (short) local468;
										}
									}
								}
							}
						}
					}
					if (this.aClass133_9 == null && this.aClass133_7 != null) {
						this.aClass133_7.anInterface10_2 = null;
					}
					if (this.aClass133_9 != null) {
						this.aClass133_9.anInterface10_2 = null;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static368.aBoolean700) {
					local376 = Static592.anInt9608 * arg7[3] + Static214.anInt3101 * arg7[0] + Static4.anInt80 * arg7[6] + 8192 >> 14;
					local398 = arg7[4] * Static592.anInt9608 + arg7[1] * Static214.anInt3101 + arg7[7] * Static4.anInt80 + 8192 >> 14;
					local398 += local53;
					local376 += local252;
					local429 = arg7[8] * Static4.anInt80 + arg7[2] * Static214.anInt3101 + arg7[5] * Static592.anInt9608 + 8192 >> 14;
					Static214.anInt3101 = local376;
					local429 += local59;
					Static592.anInt9608 = local398;
					Static4.anInt80 = local429;
					Static368.aBoolean700 = false;
				}
				@Pc(444) int[] local444 = new int[9];
				local398 = Class285.anIntArray475[arg2];
				local429 = Class285.anIntArray476[arg2];
				local456 = Class285.anIntArray475[arg3];
				local460 = Class285.anIntArray476[arg3];
				local464 = Class285.anIntArray475[arg4];
				local468 = Class285.anIntArray476[arg4];
				local476 = local429 * local464 + 8192 >> 14;
				local484 = local429 * local468 + 8192 >> 14;
				local444[5] = -local429;
				local444[1] = local468 * -local456 + local460 * local476 + 8192 >> 14;
				local444[7] = local460 * local468 + local476 * local456 + 8192 >> 14;
				local444[3] = local398 * local468 + 8192 >> 14;
				local444[6] = local464 * -local460 + local456 * local484 + 8192 >> 14;
				local444[4] = local398 * local464 + 8192 >> 14;
				local444[0] = local464 * local456 + local484 * local460 + 8192 >> 14;
				local444[8] = local398 * local456 + 8192 >> 14;
				local444[2] = local398 * local460 + 8192 >> 14;
				@Pc(613) int local613 = -Static592.anInt9608 * local444[1] + local444[0] * -Static214.anInt3101 + -Static4.anInt80 * local444[2] + 8192 >> 14;
				local639 = local444[5] * -Static4.anInt80 + local444[3] * -Static214.anInt3101 + -Static592.anInt9608 * local444[4] + 8192 >> 14;
				local664 = -Static4.anInt80 * local444[8] + -Static592.anInt9608 * local444[7] + local444[6] * -Static214.anInt3101 + 8192 >> 14;
				local669 = local613 + Static214.anInt3101;
				@Pc(673) int local673 = local639 + Static592.anInt9608;
				local677 = local664 + Static4.anInt80;
				@Pc(680) int[] local680 = new int[9];
				for (local682 = 0; local682 < 3; local682++) {
					for (local686 = 0; local686 < 3; local686++) {
						local690 = 0;
						for (local692 = 0; local692 < 3; local692++) {
							local690 += local444[local692 + local682 * 3] * arg7[local692 + local686 * 3];
						}
						local680[local686 + local682 * 3] = local690 + 8192 >> 14;
					}
				}
				local686 = local53 * local444[1] + local252 * local444[0] + local59 * local444[2] + 8192 >> 14;
				local690 = local252 * local444[3] + local53 * local444[4] + local59 * local444[5] + 8192 >> 14;
				local686 += local669;
				local690 += local673;
				local692 = local444[8] * local59 + local53 * local444[7] + local252 * local444[6] + 8192 >> 14;
				local692 += local677;
				local820 = new int[9];
				for (local822 = 0; local822 < 3; local822++) {
					for (local826 = 0; local826 < 3; local826++) {
						local830 = 0;
						for (local832 = 0; local832 < 3; local832++) {
							local830 += arg7[local832 + local822 * 3] * local680[local832 * 3 + local826];
						}
						local820[local822 * 3 + local826] = local830 + 8192 >> 14;
					}
				}
				local826 = local692 * arg7[2] + arg7[0] * local686 + arg7[1] * local690 + 8192 >> 14;
				local830 = local692 * arg7[5] + arg7[4] * local690 + local686 * arg7[3] + 8192 >> 14;
				local830 += local35;
				local826 += local29;
				local832 = arg7[8] * local692 + local690 * arg7[7] + local686 * arg7[6] + 8192 >> 14;
				local832 += local41;
				for (local958 = 0; local958 < local8; local958++) {
					@Pc(964) int local964 = arg1[local958];
					if (local964 < this.anIntArrayArray57.length) {
						@Pc(978) int[] local978 = this.anIntArrayArray57[local964];
						for (@Pc(980) int local980 = 0; local980 < local978.length; local980++) {
							@Pc(986) int local986 = local978[local980];
							if (this.aShortArray129 == null || (arg6 & this.aShortArray129[local986]) != 0) {
								@Pc(1028) int local1028 = local820[2] * this.anIntArray542[local986] + local820[0] * this.anIntArray545[local986] + local820[1] * this.anIntArray543[local986] + 8192 >> 14;
								@Pc(1059) int local1059 = this.anIntArray542[local986] * local820[5] + this.anIntArray543[local986] * local820[4] + local820[3] * this.anIntArray545[local986] + 8192 >> 14;
								@Pc(1092) int local1092 = local820[6] * this.anIntArray545[local986] + this.anIntArray543[local986] * local820[7] + local820[8] * this.anIntArray542[local986] + 8192 >> 14;
								@Pc(1096) int local1096 = local1059 + local830;
								@Pc(1100) int local1100 = local1028 + local826;
								@Pc(1104) int local1104 = local1092 + local832;
								this.anIntArray545[local986] = local1100;
								this.anIntArray543[local986] = local1096;
								this.anIntArray542[local986] = local1104;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2571) Class193 local2571;
			@Pc(2576) Class65 local2576;
			if (arg0 == 5) {
				if (this.anIntArrayArray56 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray56.length > local35) {
							local250 = this.anIntArrayArray56[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local53 = local250[local252];
								if (this.aShortArray126 == null || (arg6 & this.aShortArray126[local53]) != 0) {
									local59 = arg2 * 8 + (this.aByteArray88[local53] & 0xFF);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray88[local53] = (byte) local59;
									if (this.aClass133_7 != null) {
										this.aClass133_7.anInterface10_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass193Array1 != null) {
						for (local35 = 0; local35 < this.anInt8053; local35++) {
							local2571 = this.aClass193Array1[local35];
							local2576 = this.aClass65Array1[local35];
							local2576.anInt1379 = local2576.anInt1379 & 0xFFFFFF | 255 - (this.aByteArray88[local2571.anInt4794] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2827) Class65 local2827;
				if (arg0 == 8) {
					if (this.anIntArrayArray55 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray55.length > local35) {
								local250 = this.anIntArrayArray55[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2827 = this.aClass65Array1[local250[local252]];
									local2827.anInt1376 += arg2;
									local2827.anInt1372 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray55 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray55.length) {
								local250 = this.anIntArrayArray55[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2827 = this.aClass65Array1[local250[local252]];
									local2827.anInt1373 = arg3 * local2827.anInt1373 >> 7;
									local2827.anInt1378 = arg2 * local2827.anInt1378 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray55 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray55.length) {
							local250 = this.anIntArrayArray55[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2827 = this.aClass65Array1[local250[local252]];
								local2827.anInt1374 = local2827.anInt1374 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray56 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray56.length) {
						local250 = this.anIntArrayArray56[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local53 = local250[local252];
							if (this.aShortArray126 == null || (arg6 & this.aShortArray126[local53]) != 0) {
								local59 = this.aShortArray131[local53] & 0xFFFF;
								local376 = local59 >> 10 & 0x3F;
								local398 = local59 >> 7 & 0x7;
								local429 = local59 & 0x7F;
								@Pc(2684) int local2684 = local376 + arg2 & 0x3F;
								local398 += arg3 / 4;
								local429 += arg4;
								if (local398 < 0) {
									local398 = 0;
								} else if (local398 > 7) {
									local398 = 7;
								}
								if (local429 < 0) {
									local429 = 0;
								} else if (local429 > 127) {
									local429 = 127;
								}
								this.aShortArray131[local53] = (short) (local2684 << 10 | local398 << 7 | local429);
								if (this.aClass133_7 != null) {
									this.aClass133_7.anInterface10_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass193Array1 != null) {
					for (local35 = 0; local35 < this.anInt8053; local35++) {
						local2571 = this.aClass193Array1[local35];
						local2576 = this.aClass65Array1[local35];
						local2576.anInt1379 = Static142.anIntArray365[this.aShortArray131[local2571.anInt4794] & 0xFFFF] & 0xFFFFFF | local2576.anInt1379 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray57.length) {
					local250 = this.anIntArrayArray57[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local53 = local250[local252];
						if (this.aShortArray129 == null || (this.aShortArray129[local53] & arg6) != 0) {
							this.anIntArray545[local53] -= Static214.anInt3101;
							this.anIntArray543[local53] -= Static592.anInt9608;
							this.anIntArray542[local53] -= Static4.anInt80;
							this.anIntArray545[local53] = this.anIntArray545[local53] * arg2 >> 7;
							this.anIntArray543[local53] = arg3 * this.anIntArray543[local53] >> 7;
							this.anIntArray542[local53] = arg4 * this.anIntArray542[local53] >> 7;
							this.anIntArray545[local53] += Static214.anInt3101;
							this.anIntArray543[local53] += Static592.anInt9608;
							this.anIntArray542[local53] += Static4.anInt80;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static368.aBoolean700) {
				local376 = arg7[0] * Static214.anInt3101 + Static592.anInt9608 * arg7[3] + Static4.anInt80 * arg7[6] + 8192 >> 14;
				local398 = arg7[1] * Static214.anInt3101 + arg7[4] * Static592.anInt9608 + arg7[7] * Static4.anInt80 + 8192 >> 14;
				local429 = arg7[8] * Static4.anInt80 + Static592.anInt9608 * arg7[5] + arg7[2] * Static214.anInt3101 + 8192 >> 14;
				local376 += local252;
				local398 += local53;
				local429 += local59;
				Static214.anInt3101 = local376;
				Static592.anInt9608 = local398;
				Static368.aBoolean700 = false;
				Static4.anInt80 = local429;
			}
			local376 = arg2 << 15 >> 7;
			local398 = arg3 << 15 >> 7;
			local429 = arg4 << 15 >> 7;
			local456 = -Static214.anInt3101 * local376 + 8192 >> 14;
			local460 = -Static592.anInt9608 * local398 + 8192 >> 14;
			local464 = -Static4.anInt80 * local429 + 8192 >> 14;
			local468 = local456 + Static214.anInt3101;
			local476 = Static592.anInt9608 + local460;
			local484 = Static4.anInt80 + local464;
			@Pc(1866) int[] local1866 = new int[] { arg7[0] * local376 + 8192 >> 14, local376 * arg7[3] + 8192 >> 14, local376 * arg7[6] + 8192 >> 14, arg7[1] * local398 + 8192 >> 14, local398 * arg7[4] + 8192 >> 14, local398 * arg7[7] + 8192 >> 14, local429 * arg7[2] + 8192 >> 14, local429 * arg7[5] + 8192 >> 14, arg7[8] * local429 + 8192 >> 14 };
			local639 = local252 * local376 + 8192 >> 14;
			local664 = local53 * local398 + 8192 >> 14;
			@Pc(1994) int local1994 = local639 + local468;
			local669 = local59 * local429 + 8192 >> 14;
			@Pc(2006) int local2006 = local664 + local476;
			@Pc(2010) int local2010 = local669 + local484;
			@Pc(2013) int[] local2013 = new int[9];
			@Pc(2019) int local2019;
			for (local677 = 0; local677 < 3; local677++) {
				for (local2019 = 0; local2019 < 3; local2019++) {
					local682 = 0;
					for (local686 = 0; local686 < 3; local686++) {
						local682 += local1866[local2019 + local686 * 3] * arg7[local677 * 3 + local686];
					}
					local2013[local2019 + local677 * 3] = local682 + 8192 >> 14;
				}
			}
			local2019 = arg7[2] * local2010 + local1994 * arg7[0] + arg7[1] * local2006 + 8192 >> 14;
			local682 = arg7[3] * local1994 + arg7[4] * local2006 + local2010 * arg7[5] + 8192 >> 14;
			local682 += local35;
			local686 = arg7[8] * local2010 + arg7[6] * local1994 + local2006 * arg7[7] + 8192 >> 14;
			local2019 += local29;
			local686 += local41;
			for (local690 = 0; local690 < local8; local690++) {
				local692 = arg1[local690];
				if (local692 < this.anIntArrayArray57.length) {
					local820 = this.anIntArrayArray57[local692];
					for (local822 = 0; local822 < local820.length; local822++) {
						local826 = local820[local822];
						if (this.aShortArray129 == null || (this.aShortArray129[local826] & arg6) != 0) {
							local830 = this.anIntArray542[local826] * local2013[2] + local2013[1] * this.anIntArray543[local826] + local2013[0] * this.anIntArray545[local826] + 8192 >> 14;
							local832 = local2013[4] * this.anIntArray543[local826] + local2013[3] * this.anIntArray545[local826] + this.anIntArray542[local826] * local2013[5] + 8192 >> 14;
							@Pc(2254) int local2254 = local832 + local682;
							local958 = this.anIntArray542[local826] * local2013[8] + local2013[7] * this.anIntArray543[local826] + local2013[6] * this.anIntArray545[local826] + 8192 >> 14;
							@Pc(2289) int local2289 = local830 + local2019;
							this.anIntArray545[local826] = local2289;
							@Pc(2298) int local2298 = local958 + local686;
							this.anIntArray543[local826] = local2254;
							this.anIntArray542[local826] = local2298;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!tda;IZZLclient!tda;I)Lclient!da;")
	private Class33 method6585(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class33_Sub3 arg4) {
		arg4.anInt8090 = this.anInt8090;
		arg4.anInt8099 = this.anInt8099;
		if ((arg1 & 0x100) == 0) {
			arg4.aBoolean683 = this.aBoolean683;
		} else {
			arg4.aBoolean683 = true;
		}
		arg4.anInt8053 = this.anInt8053;
		arg4.aByte115 = 0;
		arg4.anInt8066 = arg1;
		arg4.anInt8084 = this.anInt8084;
		arg4.anInt8079 = this.anInt8079;
		arg4.aShort107 = this.aShort107;
		arg4.anInt8091 = this.anInt8091;
		arg4.aShort101 = this.aShort101;
		arg4.anInt8095 = this.anInt8095;
		@Pc(69) boolean local69 = Static131.method1767(arg1, this.anInt8090);
		@Pc(75) boolean local75 = Static19.method290(this.anInt8090, arg1);
		@Pc(83) boolean local83 = Static23.method329(this.anInt8090, arg1);
		@Pc(89) boolean local89 = local69 | local75 | local83;
		@Pc(190) int local190;
		if (local89) {
			if (!local69) {
				arg4.anIntArray545 = this.anIntArray545;
			} else if (arg0.anIntArray545 == null || this.anInt8084 > arg0.anIntArray545.length) {
				arg4.anIntArray545 = arg0.anIntArray545 = new int[this.anInt8084];
			} else {
				arg4.anIntArray545 = arg0.anIntArray545;
			}
			if (!local75) {
				arg4.anIntArray543 = this.anIntArray543;
			} else if (arg0.anIntArray543 == null || this.anInt8084 > arg0.anIntArray543.length) {
				arg4.anIntArray543 = arg0.anIntArray543 = new int[this.anInt8084];
			} else {
				arg4.anIntArray543 = arg0.anIntArray543;
			}
			if (!local83) {
				arg4.anIntArray542 = this.anIntArray542;
			} else if (arg0.anIntArray542 == null || arg0.anIntArray542.length < this.anInt8084) {
				arg4.anIntArray542 = arg0.anIntArray542 = new int[this.anInt8084];
			} else {
				arg4.anIntArray542 = arg0.anIntArray542;
			}
			for (local190 = 0; local190 < this.anInt8084; local190++) {
				if (local69) {
					arg4.anIntArray545[local190] = this.anIntArray545[local190];
				}
				if (local75) {
					arg4.anIntArray543[local190] = this.anIntArray543[local190];
				}
				if (local83) {
					arg4.anIntArray542[local190] = this.anIntArray542[local190];
				}
			}
		} else {
			arg4.anIntArray545 = this.anIntArray545;
			arg4.anIntArray542 = this.anIntArray542;
			arg4.anIntArray543 = this.anIntArray543;
		}
		if (Static347.method5021(this.anInt8090, arg1)) {
			arg4.aClass133_8 = arg0.aClass133_8;
			if (arg3) {
				arg4.aByte115 = (byte) (arg4.aByte115 | 0x1);
			}
			arg4.aClass133_8.anInterface10_2 = this.aClass133_8.anInterface10_2;
			arg4.aClass133_8.aByte36 = this.aClass133_8.aByte36;
		} else if (Static154.method2106(arg1, this.anInt8090)) {
			arg4.aClass133_8 = this.aClass133_8;
		} else {
			arg4.aClass133_8 = null;
		}
		if (Static486.method6250(arg1, this.anInt8090)) {
			if (arg0.aShortArray131 == null || arg0.aShortArray131.length < this.anInt8099) {
				arg4.aShortArray131 = arg0.aShortArray131 = new short[this.anInt8099];
			} else {
				arg4.aShortArray131 = arg0.aShortArray131;
			}
			for (local190 = 0; local190 < this.anInt8099; local190++) {
				arg4.aShortArray131[local190] = this.aShortArray131[local190];
			}
		} else {
			arg4.aShortArray131 = this.aShortArray131;
		}
		if (Static331.method4765(arg1, this.anInt8090)) {
			if (arg0.aByteArray88 == null || arg0.aByteArray88.length < this.anInt8099) {
				arg4.aByteArray88 = arg0.aByteArray88 = new byte[this.anInt8099];
			} else {
				arg4.aByteArray88 = arg0.aByteArray88;
			}
			for (local190 = 0; local190 < this.anInt8099; local190++) {
				arg4.aByteArray88[local190] = this.aByteArray88[local190];
			}
		} else {
			arg4.aByteArray88 = this.aByteArray88;
		}
		if (Static540.method7100(this.anInt8090, arg1)) {
			arg4.aClass133_7 = arg0.aClass133_7;
			if (arg3) {
				arg4.aByte115 = (byte) (arg4.aByte115 | 0x2);
			}
			arg4.aClass133_7.anInterface10_2 = this.aClass133_7.anInterface10_2;
			arg4.aClass133_7.aByte36 = this.aClass133_7.aByte36;
		} else if (Static421.method5634(this.anInt8090, arg1)) {
			arg4.aClass133_7 = this.aClass133_7;
		} else {
			arg4.aClass133_7 = null;
		}
		@Pc(569) int local569;
		if (Static525.method6782(this.anInt8090, arg1)) {
			if (arg0.aShortArray130 == null || this.anInt8095 > arg0.aShortArray130.length) {
				local190 = this.anInt8095;
				arg4.aShortArray130 = arg0.aShortArray130 = new short[local190];
				arg4.aShortArray125 = arg0.aShortArray125 = new short[local190];
				arg4.aShortArray123 = arg0.aShortArray123 = new short[local190];
			} else {
				arg4.aShortArray130 = arg0.aShortArray130;
				arg4.aShortArray125 = arg0.aShortArray125;
				arg4.aShortArray123 = arg0.aShortArray123;
			}
			if (this.aClass353_1 == null) {
				for (local190 = 0; local190 < this.anInt8095; local190++) {
					arg4.aShortArray130[local190] = this.aShortArray130[local190];
					arg4.aShortArray123[local190] = this.aShortArray123[local190];
					arg4.aShortArray125[local190] = this.aShortArray125[local190];
				}
			} else {
				if (arg0.aClass353_1 == null) {
					arg0.aClass353_1 = new Class353();
				}
				@Pc(553) Class353 local553 = arg4.aClass353_1 = arg0.aClass353_1;
				if (local553.aShortArray137 == null || this.anInt8095 > local553.aShortArray137.length) {
					local569 = this.anInt8095;
					local553.aShortArray136 = new short[local569];
					local553.aByteArray100 = new byte[local569];
					local553.aShortArray137 = new short[local569];
					local553.aShortArray135 = new short[local569];
				}
				for (local569 = 0; local569 < this.anInt8095; local569++) {
					arg4.aShortArray130[local569] = this.aShortArray130[local569];
					arg4.aShortArray123[local569] = this.aShortArray123[local569];
					arg4.aShortArray125[local569] = this.aShortArray125[local569];
					local553.aShortArray137[local569] = this.aClass353_1.aShortArray137[local569];
					local553.aShortArray135[local569] = this.aClass353_1.aShortArray135[local569];
					local553.aShortArray136[local569] = this.aClass353_1.aShortArray136[local569];
					local553.aByteArray100[local569] = this.aClass353_1.aByteArray100[local569];
				}
			}
			arg4.aByteArray89 = this.aByteArray89;
		} else {
			arg4.aByteArray89 = this.aByteArray89;
			arg4.aShortArray123 = this.aShortArray123;
			arg4.aShortArray125 = this.aShortArray125;
			arg4.aShortArray130 = this.aShortArray130;
			arg4.aClass353_1 = this.aClass353_1;
		}
		if (Static265.method3687(arg1, this.anInt8090)) {
			if (arg3) {
				arg4.aByte115 = (byte) (arg4.aByte115 | 0x4);
			}
			arg4.aClass133_9 = arg0.aClass133_9;
			arg4.aClass133_9.aByte36 = this.aClass133_9.aByte36;
			arg4.aClass133_9.anInterface10_2 = this.aClass133_9.anInterface10_2;
		} else if (Static125.method1730(this.anInt8090, arg1)) {
			arg4.aClass133_9 = this.aClass133_9;
		} else {
			arg4.aClass133_9 = null;
		}
		if (Static582.method7551(this.anInt8090, arg1)) {
			if (arg0.aFloatArray65 == null || arg0.aFloatArray65.length < this.anInt8099) {
				local190 = this.anInt8095;
				arg4.aFloatArray64 = arg0.aFloatArray64 = new float[local190];
				arg4.aFloatArray65 = arg0.aFloatArray65 = new float[local190];
			} else {
				arg4.aFloatArray65 = arg0.aFloatArray65;
				arg4.aFloatArray64 = arg0.aFloatArray64;
			}
			for (local190 = 0; local190 < this.anInt8095; local190++) {
				arg4.aFloatArray65[local190] = this.aFloatArray65[local190];
				arg4.aFloatArray64[local190] = this.aFloatArray64[local190];
			}
		} else {
			arg4.aFloatArray64 = this.aFloatArray64;
			arg4.aFloatArray65 = this.aFloatArray65;
		}
		if (Static243.method3465(this.anInt8090, arg1)) {
			if (arg3) {
				arg4.aByte115 = (byte) (arg4.aByte115 | 0x8);
			}
			arg4.aClass133_10 = arg0.aClass133_10;
			arg4.aClass133_10.aByte36 = this.aClass133_10.aByte36;
			arg4.aClass133_10.anInterface10_2 = this.aClass133_10.anInterface10_2;
		} else if (Static343.method5006(arg1, this.anInt8090)) {
			arg4.aClass133_10 = this.aClass133_10;
		} else {
			arg4.aClass133_10 = null;
		}
		if (Static143.method5992(this.anInt8090, arg1)) {
			if (arg0.aShortArray127 == null || arg0.aShortArray127.length < this.anInt8099) {
				local190 = this.anInt8099;
				arg4.aShortArray128 = arg0.aShortArray128 = new short[local190];
				arg4.aShortArray132 = arg0.aShortArray132 = new short[local190];
				arg4.aShortArray127 = arg0.aShortArray127 = new short[local190];
			} else {
				arg4.aShortArray127 = arg0.aShortArray127;
				arg4.aShortArray132 = arg0.aShortArray132;
				arg4.aShortArray128 = arg0.aShortArray128;
			}
			for (local190 = 0; local190 < this.anInt8099; local190++) {
				arg4.aShortArray127[local190] = this.aShortArray127[local190];
				arg4.aShortArray132[local190] = this.aShortArray132[local190];
				arg4.aShortArray128[local190] = this.aShortArray128[local190];
			}
		} else {
			arg4.aShortArray128 = this.aShortArray128;
			arg4.aShortArray127 = this.aShortArray127;
			arg4.aShortArray132 = this.aShortArray132;
		}
		if (Static198.method2498(this.anInt8090, arg1)) {
			if (arg3) {
				arg4.aByte115 = (byte) (arg4.aByte115 | 0x10);
			}
			arg4.aClass327_1 = arg0.aClass327_1;
			arg4.aClass327_1.anInterface21_3 = this.aClass327_1.anInterface21_3;
		} else if (Static554.method7256(arg1, this.anInt8090)) {
			arg4.aClass327_1 = this.aClass327_1;
		} else {
			arg4.aClass327_1 = null;
		}
		if (Static116.method1699(this.anInt8090, arg1)) {
			if (arg0.aShortArray122 == null || this.anInt8099 > arg0.aShortArray122.length) {
				local190 = this.anInt8099;
				arg4.aShortArray122 = arg0.aShortArray122 = new short[local190];
			} else {
				arg4.aShortArray122 = arg0.aShortArray122;
			}
			for (local190 = 0; local190 < this.anInt8099; local190++) {
				arg4.aShortArray122[local190] = this.aShortArray122[local190];
			}
		} else {
			arg4.aShortArray122 = this.aShortArray122;
		}
		if (!Static371.method5201(arg1, this.anInt8090)) {
			arg4.aClass65Array1 = this.aClass65Array1;
		} else if (arg0.aClass65Array1 == null || this.anInt8053 > arg0.aClass65Array1.length) {
			local190 = this.anInt8053;
			arg4.aClass65Array1 = arg0.aClass65Array1 = new Class65[local190];
			for (local569 = 0; local569 < this.anInt8053; local569++) {
				arg4.aClass65Array1[local569] = this.aClass65Array1[local569].method1215();
			}
		} else {
			arg4.aClass65Array1 = arg0.aClass65Array1;
			for (local190 = 0; local190 < this.anInt8053; local190++) {
				arg4.aClass65Array1[local190].method1216(this.aClass65Array1[local190]);
			}
		}
		arg4.aClass193Array1 = this.aClass193Array1;
		arg4.aClass293Array4 = this.aClass293Array4;
		arg4.anIntArrayArray56 = this.anIntArrayArray56;
		arg4.aClass163Array4 = this.aClass163Array4;
		arg4.anIntArray546 = this.anIntArray546;
		arg4.aShortArray129 = this.aShortArray129;
		if (this.aBoolean682) {
			arg4.aShort103 = this.aShort103;
			arg4.aShort102 = this.aShort102;
			arg4.aBoolean682 = true;
			arg4.aShort100 = this.aShort100;
			arg4.aShort98 = this.aShort98;
			arg4.aShort105 = this.aShort105;
			arg4.aShort104 = this.aShort104;
			arg4.aShort106 = this.aShort106;
			arg4.aShort99 = this.aShort99;
		} else {
			arg4.aBoolean682 = false;
		}
		arg4.anIntArrayArray55 = this.anIntArrayArray55;
		arg4.anIntArrayArray57 = this.anIntArrayArray57;
		arg4.anIntArray544 = this.anIntArray544;
		arg4.aShortArray124 = this.aShortArray124;
		arg4.aShortArray126 = this.aShortArray126;
		return arg4;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7189(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class33_Sub3 local8 = (Class33_Sub3) arg0;
		if (this.anInt8099 == 0 || local8.anInt8099 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt8079;
		@Pc(21) int[] local21 = local8.anIntArray545;
		@Pc(24) int[] local24 = local8.anIntArray543;
		@Pc(27) int[] local27 = local8.anIntArray542;
		@Pc(30) short[] local30 = local8.aShortArray130;
		@Pc(33) short[] local33 = local8.aShortArray123;
		@Pc(36) short[] local36 = local8.aShortArray125;
		@Pc(39) byte[] local39 = local8.aByteArray89;
		@Pc(48) short[] local48;
		@Pc(46) short[] local46;
		@Pc(44) short[] local44;
		@Pc(50) byte[] local50;
		if (this.aClass353_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local44 = this.aClass353_1.aShortArray136;
			local46 = this.aClass353_1.aShortArray135;
			local50 = this.aClass353_1.aByteArray100;
			local48 = this.aClass353_1.aShortArray137;
		}
		@Pc(75) short[] local75;
		@Pc(87) short[] local87;
		@Pc(79) short[] local79;
		@Pc(83) byte[] local83;
		if (local8.aClass353_1 == null) {
			local79 = null;
			local83 = null;
			local87 = null;
			local75 = null;
		} else {
			local75 = local8.aClass353_1.aShortArray137;
			local79 = local8.aClass353_1.aShortArray136;
			local83 = local8.aClass353_1.aByteArray100;
			local87 = local8.aClass353_1.aShortArray135;
		}
		@Pc(100) int[] local100 = local8.anIntArray546;
		@Pc(103) short[] local103 = local8.aShortArray124;
		if (!local8.aBoolean682) {
			local8.method6588();
		}
		@Pc(112) short local112 = local8.aShort105;
		@Pc(115) short local115 = local8.aShort100;
		@Pc(118) short local118 = local8.aShort103;
		@Pc(121) short local121 = local8.aShort98;
		@Pc(124) short local124 = local8.aShort104;
		@Pc(127) short local127 = local8.aShort102;
		for (@Pc(129) int local129 = 0; local129 < this.anInt8079; local129++) {
			@Pc(139) int local139 = this.anIntArray543[local129] - arg2;
			if (local139 >= local112 && local115 >= local139) {
				@Pc(159) int local159 = this.anIntArray545[local129] - arg1;
				if (local159 >= local118 && local159 <= local121) {
					@Pc(175) int local175 = this.anIntArray542[local129] - arg3;
					if (local175 >= local124 && local175 <= local127) {
						@Pc(185) int local185 = -1;
						@Pc(190) int local190 = this.anIntArray546[local129];
						@Pc(197) int local197 = this.anIntArray546[local129 + 1];
						for (@Pc(199) int local199 = local190; local199 < local197; local199++) {
							local185 = this.aShortArray124[local199] - 1;
							if (local185 == -1 || this.aByteArray89[local185] != 0) {
								break;
							}
						}
						if (local185 != -1) {
							for (@Pc(235) int local235 = 0; local235 < local18; local235++) {
								if (local21[local235] == local159 && local27[local235] == local175 && local24[local235] == local139) {
									local190 = local100[local235];
									local197 = local100[local235 + 1];
									@Pc(268) int local268 = -1;
									for (@Pc(270) int local270 = local190; local270 < local197; local270++) {
										local268 = local103[local270] - 1;
										if (local268 == -1 || local39[local268] != 0) {
											break;
										}
									}
									if (local268 != -1) {
										if (local48 == null) {
											this.aClass353_1 = new Class353();
											local48 = this.aClass353_1.aShortArray137 = Static571.method7440(this.aShortArray130);
											local46 = this.aClass353_1.aShortArray135 = Static571.method7440(this.aShortArray123);
											local44 = this.aClass353_1.aShortArray136 = Static571.method7440(this.aShortArray125);
											local50 = this.aClass353_1.aByteArray100 = Static544.method7110(this.aByteArray89);
										}
										if (local75 == null) {
											@Pc(346) Class353 local346 = local8.aClass353_1 = new Class353();
											local75 = local346.aShortArray137 = Static571.method7440(local30);
											local87 = local346.aShortArray135 = Static571.method7440(local33);
											local79 = local346.aShortArray136 = Static571.method7440(local36);
											local83 = local346.aByteArray100 = Static544.method7110(local39);
										}
										@Pc(379) short local379 = this.aShortArray130[local185];
										@Pc(384) short local384 = this.aShortArray123[local185];
										@Pc(389) short local389 = this.aShortArray125[local185];
										local197 = local100[local235 + 1];
										@Pc(400) byte local400 = this.aByteArray89[local185];
										local190 = local100[local235];
										@Pc(414) int local414;
										for (@Pc(406) int local406 = local190; local406 < local197; local406++) {
											local414 = local103[local406] - 1;
											if (local414 == -1) {
												break;
											}
											if (local83[local414] != 0) {
												local75[local414] += local379;
												local87[local414] += local384;
												local79[local414] += local389;
												local83[local414] += local400;
											}
										}
										local197 = this.anIntArray546[local129 + 1];
										local190 = this.anIntArray546[local129];
										local384 = local33[local268];
										local379 = local30[local268];
										local400 = local39[local268];
										local389 = local36[local268];
										for (local414 = local190; local414 < local197; local414++) {
											@Pc(497) int local497 = this.aShortArray124[local414] - 1;
											if (local497 == -1) {
												break;
											}
											if (local50[local497] != 0) {
												local48[local497] += local379;
												local46[local497] += local384;
												local44[local497] += local389;
												local50[local497] += local400;
											}
										}
										if (this.aClass133_9 == null && this.aClass133_7 != null) {
											this.aClass133_7.anInterface10_2 = null;
										}
										if (this.aClass133_9 != null) {
											this.aClass133_9.anInterface10_2 = null;
										}
										if (local8.aClass133_9 == null && local8.aClass133_7 != null) {
											local8.aClass133_7.anInterface10_2 = null;
										}
										if (local8.aClass133_9 != null) {
											local8.aClass133_9.anInterface10_2 = null;
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

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt8099; local7++) {
			local16 = this.aShortArray131[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local47 += (arg2 - local47) * arg3 >> 7;
			}
			this.aShortArray131[local7] = (short) (local47 | local28 << 7 | local22 << 10);
		}
		if (this.aClass193Array1 != null) {
			for (local16 = 0; local16 < this.anInt8053; local16++) {
				@Pc(106) Class193 local106 = this.aClass193Array1[local16];
				@Pc(111) Class65 local111 = this.aClass65Array1[local16];
				local111.anInt1379 = Static142.anIntArray365[this.aShortArray131[local106.anInt4794] & 0xFFFF] & 0xFFFFFF | local111.anInt1379 & 0xFF000000;
			}
		}
		if (this.aClass133_7 != null) {
			this.aClass133_7.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!tda", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static214.anInt3101 = 0;
			Static592.anInt9608 = 0;
			Static4.anInt80 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt8079; local20++) {
				Static214.anInt3101 += this.anIntArray545[local20];
				Static592.anInt9608 += this.anIntArray543[local20];
				local18++;
				Static4.anInt80 += this.anIntArray542[local20];
			}
			if (local18 <= 0) {
				Static4.anInt80 = arg3;
				Static592.anInt9608 = arg2;
				Static214.anInt3101 = arg1;
			} else {
				Static592.anInt9608 = Static592.anInt9608 / local18 + arg2;
				Static214.anInt3101 = arg1 + Static214.anInt3101 / local18;
				Static4.anInt80 = Static4.anInt80 / local18 + arg3;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt8079; local18++) {
				this.anIntArray545[local18] += arg1;
				this.anIntArray543[local18] += arg2;
				this.anIntArray542[local18] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt8079; local18++) {
					this.anIntArray545[local18] -= Static214.anInt3101;
					this.anIntArray543[local18] -= Static592.anInt9608;
					this.anIntArray542[local18] -= Static4.anInt80;
					if (arg3 != 0) {
						local20 = Class285.anIntArray476[arg3];
						local167 = Class285.anIntArray475[arg3];
						local185 = this.anIntArray543[local18] * local20 + this.anIntArray545[local18] * local167 + 16383 >> 14;
						this.anIntArray543[local18] = this.anIntArray543[local18] * local167 + 16383 - this.anIntArray545[local18] * local20 >> 14;
						this.anIntArray545[local18] = local185;
					}
					if (arg1 != 0) {
						local20 = Class285.anIntArray476[arg1];
						local167 = Class285.anIntArray475[arg1];
						local185 = this.anIntArray543[local18] * local167 + 16383 - this.anIntArray542[local18] * local20 >> 14;
						this.anIntArray542[local18] = local20 * this.anIntArray543[local18] + local167 * this.anIntArray542[local18] + 16383 >> 14;
						this.anIntArray543[local18] = local185;
					}
					if (arg2 != 0) {
						local20 = Class285.anIntArray476[arg2];
						local167 = Class285.anIntArray475[arg2];
						local185 = local20 * this.anIntArray542[local18] + this.anIntArray545[local18] * local167 + 16383 >> 14;
						this.anIntArray542[local18] = local167 * this.anIntArray542[local18] + 16383 - local20 * this.anIntArray545[local18] >> 14;
						this.anIntArray545[local18] = local185;
					}
					this.anIntArray545[local18] += Static214.anInt3101;
					this.anIntArray543[local18] += Static592.anInt9608;
					this.anIntArray542[local18] += Static4.anInt80;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt8079; local18++) {
					this.anIntArray545[local18] -= Static214.anInt3101;
					this.anIntArray543[local18] -= Static592.anInt9608;
					this.anIntArray542[local18] -= Static4.anInt80;
					this.anIntArray545[local18] = this.anIntArray545[local18] * arg1 / 128;
					this.anIntArray543[local18] = arg2 * this.anIntArray543[local18] / 128;
					this.anIntArray542[local18] = arg3 * this.anIntArray542[local18] / 128;
					this.anIntArray545[local18] += Static214.anInt3101;
					this.anIntArray543[local18] += Static592.anInt9608;
					this.anIntArray542[local18] += Static4.anInt80;
				}
			} else {
				@Pc(517) Class193 local517;
				@Pc(522) Class65 local522;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt8099; local18++) {
						local20 = (this.aByteArray88[local18] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray88[local18] = (byte) local20;
					}
					if (this.aClass133_7 != null) {
						this.aClass133_7.anInterface10_2 = null;
					}
					if (this.aClass193Array1 != null) {
						for (local20 = 0; local20 < this.anInt8053; local20++) {
							local517 = this.aClass193Array1[local20];
							local522 = this.aClass65Array1[local20];
							local522.anInt1379 = 255 - (this.aByteArray88[local517.anInt4794] & 0xFF) << 24 | local522.anInt1379 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt8099; local18++) {
						local20 = this.aShortArray131[local18] & 0xFFFF;
						local167 = local20 >> 10 & 0x3F;
						local185 = local20 >> 7 & 0x7;
						@Pc(583) int local583 = local20 & 0x7F;
						local185 += arg2 / 4;
						@Pc(595) int local595 = arg1 + local167 & 0x3F;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local583 += arg3;
						if (local583 < 0) {
							local583 = 0;
						} else if (local583 > 127) {
							local583 = 127;
						}
						this.aShortArray131[local18] = (short) (local595 << 10 | local185 << 7 | local583);
					}
					if (this.aClass133_7 != null) {
						this.aClass133_7.anInterface10_2 = null;
					}
					if (this.aClass193Array1 != null) {
						for (local20 = 0; local20 < this.anInt8053; local20++) {
							local517 = this.aClass193Array1[local20];
							local522 = this.aClass65Array1[local20];
							local522.anInt1379 = local522.anInt1379 & 0xFF000000 | Static142.anIntArray365[this.aShortArray131[local517.anInt4794] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(717) Class65 local717;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt8053; local18++) {
							local717 = this.aClass65Array1[local18];
							local717.anInt1372 += arg2;
							local717.anInt1376 += arg1;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt8053; local18++) {
							local717 = this.aClass65Array1[local18];
							local717.anInt1378 = local717.anInt1378 * arg1 >> 7;
							local717.anInt1373 = arg2 * local717.anInt1373 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt8053; local18++) {
							local717 = this.aClass65Array1[local18];
							local717.anInt1374 = arg1 + local717.anInt1374 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!q;Lclient!qh;II)V")
	@Override
	public void method7183(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class12_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8095 == 0) {
			return;
		}
		@Pc(13) Class25_Sub1 local13 = this.aClass162_Sub3_37.aClass25_Sub1_3;
		if (!this.aBoolean682) {
			this.method6588();
		}
		@Pc(22) Class25_Sub1 local22 = (Class25_Sub1) arg0;
		Static517.aFloat207 = local13.aFloat19 * local22.aFloat22 + local13.aFloat13 * local22.aFloat11 + local13.aFloat18 * local22.aFloat16 + local13.aFloat22;
		Static369.aFloat244 = local13.aFloat19 * local22.aFloat18 + local13.aFloat18 * local22.aFloat20 + local13.aFloat13 * local22.aFloat15;
		@Pc(69) float local69 = Static517.aFloat207 + (float) this.aShort105 * Static369.aFloat244;
		@Pc(77) float local77 = Static517.aFloat207 + Static369.aFloat244 * (float) this.aShort100;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = local69 + (float) this.aShort99;
			local94 = (float) -this.aShort99 + local77;
		} else {
			local87 = local77 + (float) this.aShort99;
			local94 = (float) -this.aShort99 + local69;
		}
		if (local94 >= this.aClass162_Sub3_37.aFloat220 || (float) this.aClass162_Sub3_37.anInt8703 >= local87) {
			return;
		}
		Static321.aFloat158 = local13.aFloat15 * local22.aFloat20 + local22.aFloat15 * local13.aFloat12 + local13.aFloat17 * local22.aFloat18;
		Static148.aFloat56 = local22.aFloat11 * local13.aFloat12 + local13.aFloat15 * local22.aFloat16 + local22.aFloat22 * local13.aFloat17 + local13.aFloat11;
		@Pc(171) float local171 = Static148.aFloat56 + (float) this.aShort105 * Static321.aFloat158;
		@Pc(179) float local179 = Static148.aFloat56 + Static321.aFloat158 * (float) this.aShort100;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local171 > local179) {
			local194 = (float) this.aClass162_Sub3_37.anInt8728 * (local179 - (float) this.aShort99);
			local205 = (local171 + (float) this.aShort99) * (float) this.aClass162_Sub3_37.anInt8728;
		} else {
			local205 = ((float) this.aShort99 + local179) * (float) this.aClass162_Sub3_37.anInt8728;
			local194 = (float) this.aClass162_Sub3_37.anInt8728 * (local171 - (float) this.aShort99);
		}
		if (local194 / (float) arg2 >= this.aClass162_Sub3_37.aFloat216 || this.aClass162_Sub3_37.aFloat219 >= local205 / (float) arg2) {
			return;
		}
		Static345.aFloat162 = local13.aFloat16 + local22.aFloat16 * local13.aFloat20 + local13.aFloat14 * local22.aFloat11 + local22.aFloat22 * local13.aFloat21;
		Static240.aFloat259 = local13.aFloat21 * local22.aFloat18 + local13.aFloat20 * local22.aFloat20 + local22.aFloat15 * local13.aFloat14;
		@Pc(296) float local296 = Static345.aFloat162 + Static240.aFloat259 * (float) this.aShort105;
		@Pc(304) float local304 = (float) this.aShort100 * Static240.aFloat259 + Static345.aFloat162;
		@Pc(319) float local319;
		@Pc(330) float local330;
		if (local304 < local296) {
			local319 = ((float) -this.aShort99 + local304) * (float) this.aClass162_Sub3_37.bf;
			local330 = (float) this.aClass162_Sub3_37.bf * (local296 + (float) this.aShort99);
		} else {
			local319 = (float) this.aClass162_Sub3_37.bf * (local296 - (float) this.aShort99);
			local330 = (local304 + (float) this.aShort99) * (float) this.aClass162_Sub3_37.bf;
		}
		if (this.aClass162_Sub3_37.aFloat230 <= local319 / (float) arg2 || local330 / (float) arg2 <= this.aClass162_Sub3_37.aFloat228) {
			return;
		}
		if (arg1 != null || this.aClass193Array1 != null) {
			Static266.aFloat126 = local22.aFloat19 * local13.aFloat21 + local13.aFloat20 * local22.aFloat21 + local22.aFloat17 * local13.aFloat14;
			Static61.aFloat27 = local13.aFloat17 * local22.aFloat19 + local22.aFloat17 * local13.aFloat12 + local13.aFloat15 * local22.aFloat21;
			Static523.aFloat210 = local22.aFloat13 * local13.aFloat19 + local13.aFloat18 * local22.aFloat14 + local13.aFloat13 * local22.aFloat12;
			Static550.aFloat186 = local22.aFloat12 * local13.aFloat14 + local22.aFloat14 * local13.aFloat20 + local22.aFloat13 * local13.aFloat21;
			Static434.aFloat189 = local13.aFloat19 * local22.aFloat19 + local22.aFloat17 * local13.aFloat13 + local22.aFloat21 * local13.aFloat18;
			Static217.aFloat68 = local22.aFloat13 * local13.aFloat17 + local22.aFloat12 * local13.aFloat12 + local22.aFloat14 * local13.aFloat15;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort103 + this.aShort98 >> 1;
			@Pc(506) int local506 = this.aShort102 + this.aShort104 >> 1;
			@Pc(525) int local525 = (int) (Static148.aFloat56 + (float) local498 * Static217.aFloat68 + (float) this.aShort105 * Static321.aFloat158 + (float) local506 * Static61.aFloat27);
			@Pc(544) int local544 = (int) ((float) local506 * Static266.aFloat126 + Static345.aFloat162 + (float) local498 * Static550.aFloat186 + (float) this.aShort105 * Static240.aFloat259);
			@Pc(563) int local563 = (int) (Static434.aFloat189 * (float) local506 + (float) this.aShort105 * Static369.aFloat244 + (float) local498 * Static523.aFloat210 + Static517.aFloat207);
			@Pc(582) int local582 = (int) (Static217.aFloat68 * (float) local498 + Static148.aFloat56 + (float) this.aShort100 * Static321.aFloat158 + Static61.aFloat27 * (float) local506);
			@Pc(601) int local601 = (int) ((float) this.aShort100 * Static240.aFloat259 + Static345.aFloat162 + Static550.aFloat186 * (float) local498 + Static266.aFloat126 * (float) local506);
			arg1.anInt7029 = this.aClass162_Sub3_37.anInt8728 * local525 / arg2 + this.aClass162_Sub3_37.anInt8725;
			arg1.anInt7027 = this.aClass162_Sub3_37.anInt8725 + this.aClass162_Sub3_37.anInt8728 * local582 / arg2;
			arg1.anInt7028 = this.aClass162_Sub3_37.anInt8717 + this.aClass162_Sub3_37.bf * local601 / arg2;
			arg1.anInt7026 = this.aClass162_Sub3_37.anInt8717 + local544 * this.aClass162_Sub3_37.bf / arg2;
			@Pc(673) int local673 = (int) ((float) local498 * Static523.aFloat210 + Static517.aFloat207 + Static369.aFloat244 * (float) this.aShort100 + (float) local506 * Static434.aFloat189);
			if (local563 >= this.aClass162_Sub3_37.anInt8703 || this.aClass162_Sub3_37.anInt8703 <= local673) {
				arg1.anInt7030 = this.aClass162_Sub3_37.anInt8725 + this.aClass162_Sub3_37.anInt8728 * (this.aShort99 + local525) / arg2 - arg1.anInt7029;
				arg1.aBoolean576 = true;
			}
		}
		this.aClass162_Sub3_37.method6893((float) arg2);
		this.aClass162_Sub3_37.method6914();
		this.aClass162_Sub3_37.method6969(local22);
		this.method6583();
		this.aClass162_Sub3_37.method6898();
		this.method6582();
	}

	@OriginalMember(owner = "client!tda", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean683;
	}

	@OriginalMember(owner = "client!tda", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8079; local3++) {
			if (arg0 != 0) {
				this.anIntArray545[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray543[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray542[local3] += arg2;
			}
		}
		if (this.aClass133_8 != null) {
			this.aClass133_8.anInterface10_2 = null;
		}
		this.aBoolean682 = false;
	}

	@OriginalMember(owner = "client!tda", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface9 local9 = this.aClass162_Sub3_37.anInterface9_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt8099; local11++) {
			if (this.aShortArray122[local11] == arg0) {
				this.aShortArray122[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class291 local51 = local9.method1074(arg0 & 0xFFFF);
			local41 = local51.aByte101;
			local39 = local51.aByte98;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(72) Class291 local72 = local9.method1074(arg1 & 0xFFFF);
			local61 = local72.aByte101;
			local59 = local72.aByte98;
		}
		if (!(local61 != local41 | local59 != local39)) {
			return;
		}
		if (this.aClass193Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt8053; local97++) {
				@Pc(104) Class193 local104 = this.aClass193Array1[local97];
				@Pc(109) Class65 local109 = this.aClass65Array1[local97];
				local109.anInt1379 = Static142.anIntArray365[this.aShortArray131[local104.anInt4794] & 0xFFFF] & 0xFFFFFF | local109.anInt1379 & 0xFF000000;
			}
		}
		if (this.aClass133_7 != null) {
			this.aClass133_7.anInterface10_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZ)V")
	private void method6586(@OriginalArg(1) boolean arg0) {
		if (this.aClass162_Sub3_37.aClass2_Sub7_Sub1_3.aByteArray52.length >= this.anInt8091 * 6) {
			this.aClass162_Sub3_37.aClass2_Sub7_Sub1_3.anInt5186 = 0;
		} else {
			this.aClass162_Sub3_37.aClass2_Sub7_Sub1_3 = new Class2_Sub7_Sub1((this.anInt8091 + 100) * 6);
		}
		@Pc(48) Class2_Sub7_Sub1 local48 = this.aClass162_Sub3_37.aClass2_Sub7_Sub1_3;
		@Pc(54) int local54;
		if (this.aClass162_Sub3_37.aBoolean720) {
			for (local54 = 0; local54 < this.anInt8091; local54++) {
				local48.method4511(this.aShortArray127[local54]);
				local48.method4511(this.aShortArray132[local54]);
				local48.method4511(this.aShortArray128[local54]);
			}
		} else {
			for (local54 = 0; local54 < this.anInt8091; local54++) {
				local48.method4469(this.aShortArray127[local54]);
				local48.method4469(this.aShortArray132[local54]);
				local48.method4469(this.aShortArray128[local54]);
			}
		}
		if (local48.anInt5186 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface21_2 == null) {
				this.anInterface21_2 = this.aClass162_Sub3_37.method6921(local48.anInt5186, true, local48.aByteArray52);
			} else {
				this.anInterface21_2.method5344(local48.anInt5186, local48.aByteArray52);
			}
			this.aClass327_1.anInterface21_3 = this.anInterface21_2;
		} else {
			this.aClass327_1.anInterface21_3 = this.aClass162_Sub3_37.method6921(local48.anInt5186, false, local48.aByteArray52);
		}
		if (!arg0) {
			this.aBoolean681 = true;
		}
	}

	@OriginalMember(owner = "client!tda", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean682) {
			this.method6588();
		}
		return this.aShort100;
	}

	@OriginalMember(owner = "client!tda", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray57 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8084; local12++) {
			this.anIntArray545[local12] <<= 0x4;
			this.anIntArray543[local12] <<= 0x4;
			this.anIntArray542[local12] <<= 0x4;
		}
		Static4.anInt80 = 0;
		Static592.anInt9608 = 0;
		Static214.anInt3101 = 0;
		return true;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLclient!uu;)V")
	private void method6587(@OriginalArg(1) Class2_Sub2_Sub8_Sub2 arg0) {
		if (this.anInt8095 > this.aClass162_Sub3_37.anIntArray569.length) {
			this.aClass162_Sub3_37.anIntArray569 = new int[this.anInt8095];
			this.aClass162_Sub3_37.anIntArray570 = new int[this.anInt8095];
		}
		@Pc(28) int[] local28 = this.aClass162_Sub3_37.anIntArray569;
		@Pc(32) int[] local32 = this.aClass162_Sub3_37.anIntArray570;
		@Pc(84) int local84;
		@Pc(107) int local107;
		for (@Pc(34) int local34 = 0; local34 < this.anInt8079; local34++) {
			@Pc(60) int local60 = (this.anIntArray545[local34] - (this.anIntArray543[local34] * this.aClass162_Sub3_37.anInt8720 >> 8) >> this.aClass162_Sub3_37.anInt8685) - arg0.anInt8966;
			local84 = (this.anIntArray542[local34] - (this.anIntArray543[local34] * this.aClass162_Sub3_37.anInt8712 >> 8) >> this.aClass162_Sub3_37.anInt8685) - arg0.anInt8965;
			@Pc(89) int local89 = this.anIntArray546[local34];
			@Pc(96) int local96 = this.anIntArray546[local34 + 1];
			for (@Pc(98) int local98 = local89; local98 < local96; local98++) {
				local107 = this.aShortArray124[local98] - 1;
				if (local107 == -1) {
					break;
				}
				local28[local107] = local60;
				local32[local107] = local84;
			}
		}
		for (local84 = 0; local84 < this.anInt8091; local84++) {
			if (this.aByteArray88 == null || this.aByteArray88[local84] <= 128) {
				@Pc(157) short local157 = this.aShortArray127[local84];
				@Pc(162) short local162 = this.aShortArray132[local84];
				@Pc(167) short local167 = this.aShortArray128[local84];
				local107 = local28[local157];
				@Pc(175) int local175 = local28[local162];
				@Pc(179) int local179 = local28[local167];
				@Pc(183) int local183 = local32[local157];
				@Pc(187) int local187 = local32[local162];
				@Pc(191) int local191 = local32[local167];
				if (-((local187 - local183) * (local179 - local175)) + (local187 - local191) * (local107 - local175) > 0) {
					arg0.method7147(local175, local183, local187, local191, local107, local179);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class285.anIntArray476[arg0];
		@Pc(13) int local13 = Class285.anIntArray475[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8079; local15++) {
			local33 = this.anIntArray545[local15] * local13 + this.anIntArray542[local15] * local9 >> 14;
			this.anIntArray542[local15] = local13 * this.anIntArray542[local15] - this.anIntArray545[local15] * local9 >> 14;
			this.anIntArray545[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt8095; local33++) {
			@Pc(82) int local82 = this.aShortArray130[local33] * local13 + this.aShortArray125[local33] * local9 >> 14;
			this.aShortArray125[local33] = (short) (this.aShortArray125[local33] * local13 - this.aShortArray130[local33] * local9 >> 14);
			this.aShortArray130[local33] = (short) local82;
		}
		if (this.aClass133_9 == null && this.aClass133_7 != null) {
			this.aClass133_7.anInterface10_2 = null;
		}
		if (this.aClass133_9 != null) {
			this.aClass133_9.anInterface10_2 = null;
		}
		this.aBoolean682 = false;
		if (this.aClass133_8 != null) {
			this.aClass133_8.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			Static4.anInt80 = 0;
			Static214.anInt3101 = 0;
			Static592.anInt9608 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray57.length) {
					local55 = this.anIntArrayArray57[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static214.anInt3101 += this.anIntArray545[local63];
						Static592.anInt9608 += this.anIntArray543[local63];
						Static4.anInt80 += this.anIntArray542[local63];
						local33++;
					}
				}
			}
			if (local33 <= 0) {
				Static592.anInt9608 = local21;
				Static214.anInt3101 = local25;
				Static4.anInt80 = local17;
			} else {
				Static214.anInt3101 = local25 + Static214.anInt3101 / local33;
				Static4.anInt80 = Static4.anInt80 / local33 + local17;
				Static592.anInt9608 = Static592.anInt9608 / local33 + local21;
			}
			return;
		}
		@Pc(168) int[] local168;
		@Pc(170) int local170;
		if (arg0 == 1) {
			local21 = arg3 << 4;
			local17 = arg4 << 4;
			local25 = arg2 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray57.length) {
					local168 = this.anIntArrayArray57[local35];
					for (local170 = 0; local170 < local168.length; local170++) {
						local57 = local168[local170];
						this.anIntArray545[local57] += local25;
						this.anIntArray543[local57] += local21;
						this.anIntArray542[local57] += local17;
					}
				}
			}
			return;
		}
		@Pc(297) int local297;
		@Pc(315) int local315;
		@Pc(767) int local767;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray57.length > local35) {
					local168 = this.anIntArrayArray57[local35];
					if ((arg5 & 0x1) == 0) {
						for (local170 = 0; local170 < local168.length; local170++) {
							local57 = local168[local170];
							this.anIntArray545[local57] -= Static214.anInt3101;
							this.anIntArray543[local57] -= Static592.anInt9608;
							this.anIntArray542[local57] -= Static4.anInt80;
							if (arg4 != 0) {
								local63 = Class285.anIntArray476[arg4];
								local297 = Class285.anIntArray475[arg4];
								local315 = local297 * this.anIntArray545[local57] + local63 * this.anIntArray543[local57] + 16383 >> 14;
								this.anIntArray543[local57] = this.anIntArray543[local57] * local297 + 16383 - this.anIntArray545[local57] * local63 >> 14;
								this.anIntArray545[local57] = local315;
							}
							if (arg2 != 0) {
								local63 = Class285.anIntArray476[arg2];
								local297 = Class285.anIntArray475[arg2];
								local315 = local297 * this.anIntArray543[local57] + 16383 - this.anIntArray542[local57] * local63 >> 14;
								this.anIntArray542[local57] = local63 * this.anIntArray543[local57] + local297 * this.anIntArray542[local57] + 16383 >> 14;
								this.anIntArray543[local57] = local315;
							}
							if (arg3 != 0) {
								local63 = Class285.anIntArray476[arg3];
								local297 = Class285.anIntArray475[arg3];
								local315 = local63 * this.anIntArray542[local57] + this.anIntArray545[local57] * local297 + 16383 >> 14;
								this.anIntArray542[local57] = local297 * this.anIntArray542[local57] + 16383 - this.anIntArray545[local57] * local63 >> 14;
								this.anIntArray545[local57] = local315;
							}
							this.anIntArray545[local57] += Static214.anInt3101;
							this.anIntArray543[local57] += Static592.anInt9608;
							this.anIntArray542[local57] += Static4.anInt80;
						}
					} else {
						for (local170 = 0; local170 < local168.length; local170++) {
							local57 = local168[local170];
							this.anIntArray545[local57] -= Static214.anInt3101;
							this.anIntArray543[local57] -= Static592.anInt9608;
							this.anIntArray542[local57] -= Static4.anInt80;
							if (arg2 != 0) {
								local63 = Class285.anIntArray476[arg2];
								local297 = Class285.anIntArray475[arg2];
								local315 = this.anIntArray543[local57] * local297 + 16383 - local63 * this.anIntArray542[local57] >> 14;
								this.anIntArray542[local57] = local63 * this.anIntArray543[local57] + local297 * this.anIntArray542[local57] + 16383 >> 14;
								this.anIntArray543[local57] = local315;
							}
							if (arg4 != 0) {
								local63 = Class285.anIntArray476[arg4];
								local297 = Class285.anIntArray475[arg4];
								local315 = this.anIntArray545[local57] * local297 + this.anIntArray543[local57] * local63 + 16383 >> 14;
								this.anIntArray543[local57] = local297 * this.anIntArray543[local57] + 16383 - this.anIntArray545[local57] * local63 >> 14;
								this.anIntArray545[local57] = local315;
							}
							if (arg3 != 0) {
								local63 = Class285.anIntArray476[arg3];
								local297 = Class285.anIntArray475[arg3];
								local315 = local297 * this.anIntArray545[local57] + this.anIntArray542[local57] * local63 + 16383 >> 14;
								this.anIntArray542[local57] = local297 * this.anIntArray542[local57] + 16383 - this.anIntArray545[local57] * local63 >> 14;
								this.anIntArray545[local57] = local315;
							}
							this.anIntArray545[local57] += Static214.anInt3101;
							this.anIntArray543[local57] += Static592.anInt9608;
							this.anIntArray542[local57] += Static4.anInt80;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray57.length) {
						local55 = this.anIntArrayArray57[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local297 = this.anIntArray546[local63];
							local315 = this.anIntArray546[local63 + 1];
							for (local767 = local297; local767 < local315; local767++) {
								@Pc(776) int local776 = this.aShortArray124[local767] - 1;
								if (local776 == -1) {
									break;
								}
								@Pc(785) int local785;
								@Pc(789) int local789;
								@Pc(807) int local807;
								if (arg4 != 0) {
									local785 = Class285.anIntArray476[arg4];
									local789 = Class285.anIntArray475[arg4];
									local807 = this.aShortArray123[local776] * local785 + this.aShortArray130[local776] * local789 + 16383 >> 14;
									this.aShortArray123[local776] = (short) (local789 * this.aShortArray123[local776] + 16383 - this.aShortArray130[local776] * local785 >> 14);
									this.aShortArray130[local776] = (short) local807;
								}
								if (arg2 != 0) {
									local785 = Class285.anIntArray476[arg2];
									local789 = Class285.anIntArray475[arg2];
									local807 = this.aShortArray123[local776] * local789 + 16383 - local785 * this.aShortArray125[local776] >> 14;
									this.aShortArray125[local776] = (short) (this.aShortArray123[local776] * local785 + this.aShortArray125[local776] * local789 + 16383 >> 14);
									this.aShortArray123[local776] = (short) local807;
								}
								if (arg3 != 0) {
									local785 = Class285.anIntArray476[arg3];
									local789 = Class285.anIntArray475[arg3];
									local807 = local789 * this.aShortArray130[local776] + local785 * this.aShortArray125[local776] + 16383 >> 14;
									this.aShortArray125[local776] = (short) (local789 * this.aShortArray125[local776] + 16383 - this.aShortArray130[local776] * local785 >> 14);
									this.aShortArray130[local776] = (short) local807;
								}
							}
						}
					}
				}
				if (this.aClass133_9 == null && this.aClass133_7 != null) {
					this.aClass133_7.anInterface10_2 = null;
				}
				if (this.aClass133_9 != null) {
					this.aClass133_9.anInterface10_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray57.length > local35) {
					local168 = this.anIntArrayArray57[local35];
					for (local170 = 0; local170 < local168.length; local170++) {
						local57 = local168[local170];
						this.anIntArray545[local57] -= Static214.anInt3101;
						this.anIntArray543[local57] -= Static592.anInt9608;
						this.anIntArray542[local57] -= Static4.anInt80;
						this.anIntArray545[local57] = arg2 * this.anIntArray545[local57] >> 7;
						this.anIntArray543[local57] = this.anIntArray543[local57] * arg3 >> 7;
						this.anIntArray542[local57] = arg4 * this.anIntArray542[local57] >> 7;
						this.anIntArray545[local57] += Static214.anInt3101;
						this.anIntArray543[local57] += Static592.anInt9608;
						this.anIntArray542[local57] += Static4.anInt80;
					}
				}
			}
		} else {
			@Pc(1213) Class193 local1213;
			@Pc(1218) Class65 local1218;
			if (arg0 == 5) {
				if (this.anIntArrayArray56 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray56.length > local35) {
							local168 = this.anIntArrayArray56[local35];
							for (local170 = 0; local170 < local168.length; local170++) {
								local57 = local168[local170];
								local63 = (this.aByteArray88[local57] & 0xFF) + (arg2 * 8);
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray88[local57] = (byte) local63;
							}
							if (local168.length > 0 && this.aClass133_7 != null) {
								this.aClass133_7.anInterface10_2 = null;
							}
						}
					}
					if (this.aClass193Array1 != null) {
						for (local35 = 0; local35 < this.anInt8053; local35++) {
							local1213 = this.aClass193Array1[local35];
							local1218 = this.aClass65Array1[local35];
							local1218.anInt1379 = local1218.anInt1379 & 0xFFFFFF | 255 - (this.aByteArray88[local1213.anInt4794] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1467) Class65 local1467;
				if (arg0 == 8) {
					if (this.anIntArrayArray55 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray55.length > local35) {
								local168 = this.anIntArrayArray55[local35];
								for (local170 = 0; local170 < local168.length; local170++) {
									local1467 = this.aClass65Array1[local168[local170]];
									local1467.anInt1376 += arg2;
									local1467.anInt1372 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray55 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray55.length > local35) {
								local168 = this.anIntArrayArray55[local35];
								for (local170 = 0; local170 < local168.length; local170++) {
									local1467 = this.aClass65Array1[local168[local170]];
									local1467.anInt1378 = local1467.anInt1378 * arg2 >> 7;
									local1467.anInt1373 = local1467.anInt1373 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray55 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray55.length > local35) {
							local168 = this.anIntArrayArray55[local35];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1467 = this.aClass65Array1[local168[local170]];
								local1467.anInt1374 = arg2 + local1467.anInt1374 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray56 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray56.length > local35) {
						local168 = this.anIntArrayArray56[local35];
						for (local170 = 0; local170 < local168.length; local170++) {
							local57 = local168[local170];
							local63 = this.aShortArray131[local57] & 0xFFFF;
							local297 = local63 >> 10 & 0x3F;
							local315 = local63 >> 7 & 0x7;
							local767 = local63 & 0x7F;
							@Pc(1310) int local1310 = arg2 + local297 & 0x3F;
							local315 += arg3 / 4;
							local767 += arg4;
							if (local315 < 0) {
								local315 = 0;
							} else if (local315 > 7) {
								local315 = 7;
							}
							if (local767 < 0) {
								local767 = 0;
							} else if (local767 > 127) {
								local767 = 127;
							}
							this.aShortArray131[local57] = (short) (local767 | local1310 << 10 | local315 << 7);
						}
						if (local168.length > 0 && this.aClass133_7 != null) {
							this.aClass133_7.anInterface10_2 = null;
						}
					}
				}
				if (this.aClass193Array1 != null) {
					for (local35 = 0; local35 < this.anInt8053; local35++) {
						local1213 = this.aClass193Array1[local35];
						local1218 = this.aClass65Array1[local35];
						local1218.anInt1379 = local1218.anInt1379 & 0xFF000000 | Static142.anIntArray365[this.aShortArray131[local1213.anInt4794] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)V")
	private void method6588() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt8079; local23++) {
			@Pc(30) int local30 = this.anIntArray545[local23];
			@Pc(35) int local35 = this.anIntArray543[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			@Pc(55) int local55 = this.anIntArray542[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local11 > local55) {
				local11 = local55;
			}
			if (local55 > local17) {
				local17 = local55;
			}
			@Pc(82) int local82 = local55 * local55 + local30 * local30;
			if (local19 < local82) {
				local19 = local82;
			}
			local82 = local35 * local35 + local30 * local30 + local55 * local55;
			if (local21 < local82) {
				local21 = local82;
			}
		}
		this.aShort100 = (short) local15;
		this.aShort98 = (short) local13;
		this.aShort103 = (short) local7;
		this.aShort102 = (short) local17;
		this.aShort105 = (short) local9;
		this.aShort104 = (short) local11;
		this.aShort99 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort106 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean682 = true;
	}

	@OriginalMember(owner = "client!tda", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) Class151 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean682) {
			this.method6588();
		}
		@Pc(16) int local16 = this.aShort103 + arg4;
		@Pc(21) int local21 = this.aShort98 + arg4;
		@Pc(26) int local26 = this.aShort104 + arg6;
		@Pc(31) int local31 = arg6 + this.aShort102;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9573 >> arg2.anInt9568 >= arg2.anInt9572 || local26 < 0 || arg2.anInt9574 <= arg2.anInt9573 + local31 >> arg2.anInt9568)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9572 <= arg3.anInt9573 + local21 >> arg3.anInt9568 || local26 < 0 || arg3.anInt9574 <= arg3.anInt9573 + local31 >> arg3.anInt9568) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9568;
			local21 = local21 + arg2.anInt9573 - 1 >> arg2.anInt9568;
			local26 >>= arg2.anInt9568;
			local31 = arg2.anInt9573 + local31 - 1 >> arg2.anInt9568;
			if (arg5 == arg2.method7676(local26, local16) && arg2.method7676(local26, local21) == arg5 && arg2.method7676(local31, local16) == arg5 && arg5 == arg2.method7676(local31, local21)) {
				return;
			}
		}
		@Pc(191) int local191;
		if (arg0 == 1) {
			for (local191 = 0; local191 < this.anInt8079; local191++) {
				this.anIntArray543[local191] = this.anIntArray543[local191] + arg2.method7680(arg4 + this.anIntArray545[local191], arg6 + this.anIntArray542[local191]) - arg5;
			}
		} else {
			@Pc(249) int local249;
			@Pc(257) int local257;
			if (arg0 == 2) {
				@Pc(469) short local469 = this.aShort105;
				if (local469 == 0) {
					return;
				}
				for (local249 = 0; local249 < this.anInt8079; local249++) {
					local257 = (this.anIntArray543[local249] << 16) / local469;
					if (arg1 > local257) {
						this.anIntArray543[local249] += (arg1 - local257) * (-arg5 + arg2.method7680(this.anIntArray545[local249] - -arg4, this.anIntArray542[local249] - -arg6)) / arg1;
					}
				}
			} else {
				@Pc(265) int local265;
				if (arg0 == 3) {
					local191 = (arg1 & 0xFF) * 4;
					local249 = (arg1 >> 8 & 0xFF) * 4;
					local257 = (arg1 >> 16 & 0xFF) << 6;
					local265 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local191 >> 1) < 0 || arg2.anInt9572 << arg2.anInt9568 <= (local191 >> 1) + (arg4 + arg2.anInt9573) || arg6 - (local249 >> 1) < 0 || arg6 + (local249 >> 1) + arg2.anInt9573 >= arg2.anInt9574 << arg2.anInt9568) {
						return;
					}
					this.method7179(arg6, local191, local257, arg4, local265, arg5, arg2, local249);
				} else if (arg0 == 4) {
					local191 = this.aShort100 - this.aShort105;
					for (local249 = 0; local249 < this.anInt8079; local249++) {
						this.anIntArray543[local249] += arg3.method7680(arg4 + this.anIntArray545[local249], arg6 + this.anIntArray542[local249]) + local191 - arg5;
					}
				} else if (arg0 == 5) {
					local191 = this.aShort100 - this.aShort105;
					for (local249 = 0; local249 < this.anInt8079; local249++) {
						local257 = this.anIntArray545[local249] + arg4;
						local265 = this.anIntArray542[local249] + arg6;
						@Pc(422) int local422 = arg2.method7680(local257, local265);
						@Pc(428) int local428 = arg3.method7680(local257, local265);
						@Pc(434) int local434 = local422 - local428 - arg1;
						this.anIntArray543[local249] = (local434 * ((this.anIntArray543[local249] << 8) / local191) >> 8) + local422 - arg5;
					}
				}
			}
		}
		this.aBoolean682 = false;
		if (this.aClass133_8 != null) {
			this.aClass133_8.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!tda", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean682) {
			this.method6588();
		}
		return this.aShort104;
	}

	@OriginalMember(owner = "client!tda", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		if (this.aClass133_7 != null) {
			this.aClass133_7.anInterface10_2 = null;
		}
		this.aShort101 = (short) arg0;
	}

	@OriginalMember(owner = "client!tda", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean682) {
			this.method6588();
		}
		return this.aShort106;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IFJLclient!ak;FIIIII)S")
	private short method6589(@OriginalArg(1) float arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray546[arg7];
		@Pc(17) int local17 = this.anIntArray546[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray124[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static119.aLongArray4[local21] == arg1) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray124[local19] = (short) (this.anInt8095 + 1);
		Static119.aLongArray4[local19] = arg1;
		this.aShortArray130[this.anInt8095] = (short) arg6;
		this.aShortArray123[this.anInt8095] = (short) arg5;
		this.aShortArray125[this.anInt8095] = (short) arg8;
		this.aByteArray89[this.anInt8095] = (byte) arg4;
		this.aFloatArray65[this.anInt8095] = arg3;
		this.aFloatArray64[this.anInt8095] = arg0;
		return (short) this.anInt8095++;
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "()[Lclient!il;")
	@Override
	public Class163[] method7191() {
		return this.aClass163Array4;
	}

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "()[Lclient!rca;")
	@Override
	public Class293[] method7196() {
		return this.aClass293Array4;
	}

	@OriginalMember(owner = "client!tda", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class285.anIntArray476[arg0];
		@Pc(13) int local13 = Class285.anIntArray475[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8079; local15++) {
			@Pc(33) int local33 = this.anIntArray545[local15] * local13 + local9 * this.anIntArray543[local15] >> 14;
			this.anIntArray543[local15] = this.anIntArray543[local15] * local13 - this.anIntArray545[local15] * local9 >> 14;
			this.anIntArray545[local15] = local33;
		}
		if (this.aClass133_8 != null) {
			this.aClass133_8.anInterface10_2 = null;
		}
		this.aBoolean682 = false;
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "()V")
	@Override
	public void method7182() {
		if (this.anInt8095 <= 0 || this.anInt8091 <= 0) {
			return;
		}
		this.method6593(false);
		if ((this.aByte115 & 0x10) == 0 && this.aClass327_1.anInterface21_3 == null) {
			this.method6586(false);
		}
		this.method6591();
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(B)V")
	private void method6591() {
		if (!this.aBoolean681) {
			return;
		}
		this.aBoolean681 = false;
		if (this.aClass293Array4 == null && this.aClass163Array4 == null && this.aClass193Array1 == null) {
			if (this.anIntArray545 != null && !Static568.method7408(this.anInt8066, this.anInt8090)) {
				if (this.aClass133_8 != null && this.aClass133_8.anInterface10_2 == null) {
					this.aBoolean681 = true;
				} else {
					if (!this.aBoolean682) {
						this.method6588();
					}
					this.anIntArray545 = null;
				}
			}
			if (this.anIntArray543 != null && !Static69.method4392(this.anInt8090, this.anInt8066)) {
				if (this.aClass133_8 != null && this.aClass133_8.anInterface10_2 == null) {
					this.aBoolean681 = true;
				} else {
					if (!this.aBoolean682) {
						this.method6588();
					}
					this.anIntArray543 = null;
				}
			}
			if (this.anIntArray542 != null && !Static253.method3614(this.anInt8066, this.anInt8090)) {
				if (this.aClass133_8 != null && this.aClass133_8.anInterface10_2 == null) {
					this.aBoolean681 = true;
				} else {
					if (!this.aBoolean682) {
						this.method6588();
					}
					this.anIntArray542 = null;
				}
			}
		}
		if (this.aShortArray124 != null && this.anIntArray545 == null && this.anIntArray543 == null && this.anIntArray542 == null) {
			this.anIntArray546 = null;
			this.aShortArray124 = null;
		}
		if (this.aByteArray89 != null && !Static33.method554(this.anInt8090, this.anInt8066)) {
			if (this.aClass133_9 == null) {
				if (this.aClass133_7 != null && this.aClass133_7.anInterface10_2 == null) {
					this.aBoolean681 = true;
				} else {
					this.aShortArray130 = this.aShortArray123 = this.aShortArray125 = null;
					this.aByteArray89 = null;
				}
			} else if (this.aClass133_9.anInterface10_2 == null) {
				this.aBoolean681 = true;
			} else {
				this.aShortArray130 = this.aShortArray123 = this.aShortArray125 = null;
				this.aByteArray89 = null;
			}
		}
		if (this.aShortArray131 != null && !Static187.method7140(this.anInt8066, this.anInt8090)) {
			if (this.aClass133_7 != null && this.aClass133_7.anInterface10_2 == null) {
				this.aBoolean681 = true;
			} else {
				this.aShortArray131 = null;
			}
		}
		if (this.aByteArray88 != null && !Static408.method2560(this.anInt8090, this.anInt8066)) {
			if (this.aClass133_7 != null && this.aClass133_7.anInterface10_2 == null) {
				this.aBoolean681 = true;
			} else {
				this.aByteArray88 = null;
			}
		}
		if (this.aFloatArray65 != null && !Static415.method1369(this.anInt8066, this.anInt8090)) {
			if (this.aClass133_10 != null && this.aClass133_10.anInterface10_2 == null) {
				this.aBoolean681 = true;
			} else {
				this.aFloatArray65 = this.aFloatArray64 = null;
			}
		}
		if (this.aShortArray122 != null && !Static368.method6717(this.anInt8066, this.anInt8090)) {
			if (this.aClass133_7 != null && this.aClass133_7.anInterface10_2 == null) {
				this.aBoolean681 = true;
			} else {
				this.aShortArray122 = null;
			}
		}
		if (this.aShortArray127 != null && !Static77.method1220(this.anInt8066, this.anInt8090)) {
			if ((this.aClass327_1 == null || this.aClass327_1.anInterface21_3 != null) && (this.aClass133_7 == null || this.aClass133_7.anInterface10_2 != null)) {
				this.aShortArray127 = this.aShortArray132 = this.aShortArray128 = null;
			} else {
				this.aBoolean681 = true;
			}
		}
		if (this.anIntArrayArray56 != null && !Static485.method6240(this.anInt8066, this.anInt8090)) {
			this.aShortArray126 = null;
			this.anIntArrayArray56 = null;
		}
		if (this.anIntArrayArray57 != null && !Static563.method7369(this.anInt8066, this.anInt8090)) {
			this.aShortArray129 = null;
			this.anIntArrayArray57 = null;
		}
		if (this.anIntArrayArray55 != null && !Static86.method1272(this.anInt8066, this.anInt8090)) {
			this.anIntArrayArray55 = null;
		}
		if (this.anIntArray544 != null && (this.anInt8066 & 0x800) == 0 && (this.anInt8066 & 0x40000) == 0) {
			this.anIntArray544 = null;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(SBBII)I")
	private int method6592(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static142.anIntArray365[Static277.method4021(arg2, arg3)];
		if (arg0 != -1) {
			@Pc(32) Class291 local32 = this.aClass162_Sub3_37.anInterface9_10.method1074(arg0 & 0xFFFF);
			@Pc(37) int local37 = local32.aByte98 & 0xFF;
			@Pc(54) int local54;
			@Pc(77) int local77;
			if (local37 != 0) {
				if (arg2 < 0) {
					local54 = 0;
				} else if (arg2 <= 127) {
					local54 = arg2 * 131586;
				} else {
					local54 = 16777215;
				}
				if (local37 == 256) {
					local12 = local54;
				} else {
					local77 = 256 - local37;
					local12 = (local77 * (local12 & 0xFF00) + (local54 & 0xFF00) * local37 & 0xFF0000) + (local37 * (local54 & 0xFF00FF) + ((local12 & 0xFF00FF) * local77) & 0xFF00FF00) >> 8;
				}
			}
			local54 = local32.aByte101 & 0xFF;
			if (local54 != 0) {
				local54 += 256;
				@Pc(124) int local124 = (local12 >> 16 & 0xFF) * local54;
				if (local124 > 65535) {
					local124 = 65535;
				}
				local77 = local54 * (local12 >> 8 & 0xFF);
				if (local77 > 65535) {
					local77 = 65535;
				}
				@Pc(152) int local152 = local54 * (local12 & 0xFF);
				if (local152 > 65535) {
					local152 = 65535;
				}
				local12 = (local77 & 0xFF00) + (local124 << 8 & 0xFF00E5) + (local152 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!tda", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort107 = (short) arg0;
		if (this.aClass133_7 != null) {
			this.aClass133_7.anInterface10_2 = null;
		}
		if (this.aClass133_9 != null) {
			this.aClass133_9.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!tda", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class2_Sub2_Sub8 S(@OriginalArg(0) Class2_Sub2_Sub8 arg0) {
		if (this.anInt8095 == 0) {
			return null;
		}
		if (!this.aBoolean682) {
			this.method6588();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass162_Sub3_37.anInt8720 <= 0) {
			local40 = this.aShort103 - (this.aClass162_Sub3_37.anInt8720 * this.aShort105 >> 8) >> this.aClass162_Sub3_37.anInt8685;
			local57 = this.aShort98 - (this.aClass162_Sub3_37.anInt8720 * this.aShort100 >> 8) >> this.aClass162_Sub3_37.anInt8685;
		} else {
			local40 = this.aShort103 - (this.aClass162_Sub3_37.anInt8720 * this.aShort100 >> 8) >> this.aClass162_Sub3_37.anInt8685;
			local57 = this.aShort98 - (this.aClass162_Sub3_37.anInt8720 * this.aShort105 >> 8) >> this.aClass162_Sub3_37.anInt8685;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass162_Sub3_37.anInt8712 > 0) {
			local114 = this.aShort104 - (this.aClass162_Sub3_37.anInt8712 * this.aShort100 >> 8) >> this.aClass162_Sub3_37.anInt8685;
			local131 = this.aShort102 - (this.aClass162_Sub3_37.anInt8712 * this.aShort105 >> 8) >> this.aClass162_Sub3_37.anInt8685;
		} else {
			local114 = this.aShort104 - (this.aClass162_Sub3_37.anInt8712 * this.aShort105 >> 8) >> this.aClass162_Sub3_37.anInt8685;
			local131 = this.aShort102 - (this.aClass162_Sub3_37.anInt8712 * this.aShort100 >> 8) >> this.aClass162_Sub3_37.anInt8685;
		}
		@Pc(173) int local173 = local57 + 1 - local40;
		@Pc(179) int local179 = local131 + 1 - local114;
		@Pc(182) Class2_Sub2_Sub8_Sub2 local182 = (Class2_Sub2_Sub8_Sub2) arg0;
		@Pc(192) Class2_Sub2_Sub8_Sub2 local192;
		if (local182 != null && local182.method7146(local179, local173)) {
			local192 = local182;
			local182.method7145();
		} else {
			local192 = new Class2_Sub2_Sub8_Sub2(this.aClass162_Sub3_37, local173, local179);
		}
		local192.method7143(local40, local57, local114, local131);
		this.method6587(local192);
		return local192;
	}

	@OriginalMember(owner = "client!tda", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort101;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "()Z")
	@Override
	public boolean method7180() {
		if (this.aShortArray122 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray122.length; local12++) {
			if (this.aShortArray122[local12] != -1 && !this.aClass162_Sub3_37.anInterface9_10.method1073(this.aShortArray122[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "()V")
	@Override
	protected void method7190() {
	}

	@OriginalMember(owner = "client!tda", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort107;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)V")
	private void method6593(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass133_7 != null && this.aClass133_7.anInterface10_2 == null;
		@Pc(27) boolean local27 = this.aClass133_9 != null && this.aClass133_9.anInterface10_2 == null;
		@Pc(38) boolean local38 = this.aClass133_8 != null && this.aClass133_8.anInterface10_2 == null;
		@Pc(61) boolean local61 = this.aClass133_10 != null && this.aClass133_10.anInterface10_2 == null;
		if (arg0) {
			local61 &= (this.aByte115 & 0x8) != 0;
			local16 &= (this.aByte115 & 0x2) != 0;
			local38 &= (this.aByte115 & 0x1) != 0;
			local27 &= (this.aByte115 & 0x4) != 0;
		}
		@Pc(112) byte local112 = 0;
		@Pc(116) byte local116 = 0;
		@Pc(118) byte local118 = 0;
		@Pc(120) byte local120 = 0;
		if (local38) {
			local112 = 12;
		}
		if (local16) {
			local116 = local112;
			local112 = (byte) (local112 + 4);
		}
		if (local27) {
			local118 = local112;
			local112 = (byte) (local112 + 12);
		}
		if (local61) {
			local120 = local112;
			local112 = (byte) (local112 + 8);
		}
		if (local112 == 0) {
			return;
		}
		if (this.anInt8095 * local112 > this.aClass162_Sub3_37.aClass2_Sub7_Sub1_3.aByteArray52.length) {
			this.aClass162_Sub3_37.aClass2_Sub7_Sub1_3 = new Class2_Sub7_Sub1(local112 * (this.anInt8095 + 100));
		} else {
			this.aClass162_Sub3_37.aClass2_Sub7_Sub1_3.anInt5186 = 0;
		}
		@Pc(192) Class2_Sub7_Sub1 local192 = this.aClass162_Sub3_37.aClass2_Sub7_Sub1_3;
		@Pc(200) int local200;
		@Pc(209) int local209;
		@Pc(237) int local237;
		@Pc(246) int local246;
		if (local38) {
			@Pc(216) int local216;
			@Pc(223) int local223;
			@Pc(228) int local228;
			@Pc(235) int local235;
			if (this.aClass162_Sub3_37.aBoolean720) {
				for (local200 = 0; local200 < this.anInt8079; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray545[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray543[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray542[local200]);
					local228 = this.anIntArray546[local200];
					local235 = this.anIntArray546[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray124[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt5186 = local112 * local246;
						local192.method4495(local209);
						local192.method4495(local216);
						local192.method4495(local223);
					}
				}
			} else {
				for (local200 = 0; local200 < this.anInt8079; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray545[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray543[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray542[local200]);
					local228 = this.anIntArray546[local200];
					local235 = this.anIntArray546[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray124[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt5186 = local246 * local112;
						local192.method4484(local209);
						local192.method4484(local216);
						local192.method4484(local223);
					}
				}
			}
		}
		@Pc(496) float local496;
		@Pc(386) short[] local386;
		@Pc(389) short[] local389;
		@Pc(383) short[] local383;
		@Pc(380) byte[] local380;
		@Pc(537) float local537;
		if (local16) {
			if (this.aClass133_9 == null) {
				if (this.aClass353_1 == null) {
					local380 = this.aByteArray89;
					local383 = this.aShortArray125;
					local386 = this.aShortArray130;
					local389 = this.aShortArray123;
				} else {
					local386 = this.aClass353_1.aShortArray137;
					local383 = this.aClass353_1.aShortArray136;
					local389 = this.aClass353_1.aShortArray135;
					local380 = this.aClass353_1.aByteArray100;
				}
				@Pc(413) float local413 = this.aClass162_Sub3_37.aFloatArray70[0];
				@Pc(419) float local419 = this.aClass162_Sub3_37.aFloatArray70[1];
				@Pc(425) float local425 = this.aClass162_Sub3_37.aFloatArray70[2];
				@Pc(429) float local429 = this.aClass162_Sub3_37.aFloat225;
				@Pc(439) float local439 = this.aClass162_Sub3_37.aFloat222 * 768.0F / (float) this.aShort107;
				@Pc(449) float local449 = this.aClass162_Sub3_37.aFloat226 * 768.0F / (float) this.aShort107;
				for (@Pc(451) int local451 = 0; local451 < this.anInt8099; local451++) {
					@Pc(471) int local471 = this.method6592(this.aShortArray122[local451], this.aByteArray88[local451], this.aShort101, this.aShortArray131[local451]);
					@Pc(476) short local476 = this.aShortArray127[local451];
					@Pc(485) float local485 = this.aClass162_Sub3_37.aFloat218 * (float) (local471 >>> 24);
					local496 = (float) (local471 >> 16 & 0xFF) * this.aClass162_Sub3_37.aFloat214;
					@Pc(507) float local507 = this.aClass162_Sub3_37.aFloat211 * (float) (local471 >> 8 & 0xFF);
					@Pc(512) short local512 = (short) local380[local476];
					if (local512 == 0) {
						local537 = ((float) local383[local476] * local425 + (float) local386[local476] * local413 + (float) local389[local476] * local419) * 0.0026041667F;
					} else {
						local537 = (local413 * (float) local386[local476] + (float) local389[local476] * local419 + (float) local383[local476] * local425) / (float) (local512 * 256);
					}
					@Pc(577) float local577 = (local537 < 0.0F ? local449 : local439) * local537 + local429;
					@Pc(582) int local582 = (int) (local577 * local485);
					@Pc(587) int local587 = (int) (local496 * local577);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					@Pc(603) int local603 = (int) (local577 * local507);
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					local192.anInt5186 = local116 + local476 * local112;
					if (local603 < 0) {
						local603 = 0;
					} else if (local603 > 255) {
						local603 = 255;
					}
					local192.method4459(local582);
					local192.method4459(local587);
					local192.method4459(local603);
					local192.method4459(255 - (this.aByteArray88[local451] & 0xFF));
					local476 = this.aShortArray132[local451];
					local512 = local380[local476];
					if (local512 == 0) {
						local537 = (local413 * (float) local386[local476] + local419 * (float) local389[local476] + local425 * (float) local383[local476]) * 0.0026041667F;
					} else {
						local537 = ((float) local383[local476] * local425 + (float) local386[local476] * local413 + local419 * (float) local389[local476]) / (float) (local512 * 256);
					}
					local577 = (local537 < 0.0F ? local449 : local439) * local537 + local429;
					local582 = (int) (local577 * local485);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					local587 = (int) (local496 * local577);
					local603 = (int) (local507 * local577);
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					local192.anInt5186 = local112 * local476 + local116;
					if (local603 < 0) {
						local603 = 0;
					} else if (local603 > 255) {
						local603 = 255;
					}
					local192.method4459(local582);
					local192.method4459(local587);
					local192.method4459(local603);
					local192.method4459(255 - (this.aByteArray88[local451] & 0xFF));
					local476 = this.aShortArray128[local451];
					local512 = local380[local476];
					if (local512 == 0) {
						local537 = (local413 * (float) local386[local476] + local419 * (float) local389[local476] + (float) local383[local476] * local425) * 0.0026041667F;
					} else {
						local537 = (local425 * (float) local383[local476] + (float) local389[local476] * local419 + (float) local386[local476] * local413) / (float) (local512 * 256);
					}
					local577 = (local537 < 0.0F ? local449 : local439) * local537 + local429;
					local582 = (int) (local577 * local485);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					local587 = (int) (local577 * local496);
					local603 = (int) (local507 * local577);
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					local192.anInt5186 = local476 * local112 + local116;
					if (local603 < 0) {
						local603 = 0;
					} else if (local603 > 255) {
						local603 = 255;
					}
					local192.method4459(local582);
					local192.method4459(local587);
					local192.method4459(local603);
					local192.method4459(255 - (this.aByteArray88[local451] & 0xFF));
				}
			} else {
				for (local200 = 0; local200 < this.anInt8099; local200++) {
					local209 = this.method6592(this.aShortArray122[local200], this.aByteArray88[local200], this.aShort101, this.aShortArray131[local200]);
					local192.anInt5186 = local116 + local112 * this.aShortArray127[local200];
					local192.method4495(local209);
					local192.anInt5186 = local112 * this.aShortArray132[local200] + local116;
					local192.method4495(local209);
					local192.anInt5186 = local112 * this.aShortArray128[local200] + local116;
					local192.method4495(local209);
				}
			}
		}
		if (local27) {
			if (this.aClass353_1 == null) {
				local383 = this.aShortArray125;
				local380 = this.aByteArray89;
				local389 = this.aShortArray123;
				local386 = this.aShortArray130;
			} else {
				local386 = this.aClass353_1.aShortArray137;
				local389 = this.aClass353_1.aShortArray135;
				local380 = this.aClass353_1.aByteArray100;
				local383 = this.aClass353_1.aShortArray136;
			}
			@Pc(1115) float local1115 = 3.0F / (float) this.aShort107;
			local537 = 3.0F / (float) (this.aShort107 + this.aShort107 / 2);
			local192.anInt5186 = local118;
			if (this.aClass162_Sub3_37.aBoolean720) {
				for (local237 = 0; local237 < this.anInt8095; local237++) {
					local246 = local380[local237] & 0xFF;
					if (local246 == 0) {
						local192.method546((float) local386[local237] * local537);
						local192.method546((float) local389[local237] * local537);
						local192.method546(local537 * (float) local383[local237]);
					} else {
						local496 = local1115 / (float) local246;
						local192.method546((float) local386[local237] * local496);
						local192.method546(local496 * (float) local389[local237]);
						local192.method546((float) local383[local237] * local496);
					}
					local192.anInt5186 += local112 - 12;
				}
			} else {
				for (local237 = 0; local237 < this.anInt8095; local237++) {
					local246 = local380[local237] & 0xFF;
					if (local246 == 0) {
						local192.method545((float) local386[local237] * local537);
						local192.method545((float) local389[local237] * local537);
						local192.method545(local537 * (float) local383[local237]);
					} else {
						local496 = local1115 / (float) local246;
						local192.method545((float) local386[local237] * local496);
						local192.method545(local496 * (float) local389[local237]);
						local192.method545(local496 * (float) local383[local237]);
					}
					local192.anInt5186 += local112 - 12;
				}
			}
		}
		if (local61) {
			local192.anInt5186 = local120;
			if (this.aClass162_Sub3_37.aBoolean720) {
				for (local200 = 0; local200 < this.anInt8095; local200++) {
					local192.method546(this.aFloatArray65[local200]);
					local192.method546(this.aFloatArray64[local200]);
					local192.anInt5186 += local112 - 8;
				}
			} else {
				for (local200 = 0; local200 < this.anInt8095; local200++) {
					local192.method545(this.aFloatArray65[local200]);
					local192.method545(this.aFloatArray64[local200]);
					local192.anInt5186 += local112 - 8;
				}
			}
		}
		local192.anInt5186 = local112 * this.anInt8095;
		@Pc(1451) Interface10 local1451;
		if (arg0) {
			if (this.anInterface10_4 == null) {
				this.anInterface10_4 = this.aClass162_Sub3_37.method6955(local112, local192.aByteArray52, local192.anInt5186, true);
			} else {
				this.anInterface10_4.method2292(local112, local192.aByteArray52, local192.anInt5186);
			}
			this.aByte115 = 0;
			local1451 = this.anInterface10_4;
		} else {
			local1451 = this.aClass162_Sub3_37.method6955(local112, local192.aByteArray52, local192.anInt5186, false);
			this.aBoolean681 = true;
		}
		if (local38) {
			this.aClass133_8.anInterface10_2 = local1451;
			this.aClass133_8.aByte36 = 0;
		}
		if (local61) {
			this.aClass133_10.anInterface10_2 = local1451;
			this.aClass133_10.aByte36 = local120;
		}
		if (local16) {
			this.aClass133_7.anInterface10_2 = local1451;
			this.aClass133_7.aByte36 = local116;
		}
		if (local27) {
			this.aClass133_9.aByte36 = local118;
			this.aClass133_9.anInterface10_2 = local1451;
		}
	}

	@OriginalMember(owner = "client!tda", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class285.anIntArray476[arg0];
		@Pc(13) int local13 = Class285.anIntArray475[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8079; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray542[local15] + this.anIntArray545[local15] * local13 >> 14;
			this.anIntArray542[local15] = this.anIntArray542[local15] * local13 - local9 * this.anIntArray545[local15] >> 14;
			this.anIntArray545[local15] = local33;
		}
		if (this.aClass133_8 != null) {
			this.aClass133_8.anInterface10_2 = null;
		}
		this.aBoolean682 = false;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILclient!q;ZZI)Z")
	private boolean method6595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class25_Sub1 local8 = (Class25_Sub1) arg2;
		@Pc(12) Class25_Sub1 local12 = this.aClass162_Sub3_37.aClass25_Sub1_3;
		@Pc(33) float local33 = local12.aFloat17 * local8.aFloat22 + local8.aFloat16 * local12.aFloat15 + local8.aFloat11 * local12.aFloat12 + local12.aFloat11;
		@Pc(54) float local54 = local12.aFloat16 + local8.aFloat22 * local12.aFloat21 + local8.aFloat16 * local12.aFloat20 + local8.aFloat11 * local12.aFloat14;
		Static369.aFloat244 = local12.aFloat19 * local8.aFloat18 + local8.aFloat15 * local12.aFloat13 + local12.aFloat18 * local8.aFloat20;
		Static523.aFloat210 = local12.aFloat18 * local8.aFloat14 + local8.aFloat12 * local12.aFloat13 + local8.aFloat13 * local12.aFloat19;
		Static266.aFloat126 = local8.aFloat21 * local12.aFloat20 + local8.aFloat17 * local12.aFloat14 + local12.aFloat21 * local8.aFloat19;
		Static321.aFloat158 = local12.aFloat17 * local8.aFloat18 + local12.aFloat15 * local8.aFloat20 + local12.aFloat12 * local8.aFloat15;
		Static434.aFloat189 = local8.aFloat19 * local12.aFloat19 + local12.aFloat18 * local8.aFloat21 + local8.aFloat17 * local12.aFloat13;
		Static240.aFloat259 = local8.aFloat20 * local12.aFloat20 + local8.aFloat15 * local12.aFloat14 + local8.aFloat18 * local12.aFloat21;
		Static550.aFloat186 = local8.aFloat13 * local12.aFloat21 + local8.aFloat14 * local12.aFloat20 + local12.aFloat14 * local8.aFloat12;
		@Pc(201) float local201 = local8.aFloat16 * local12.aFloat18 + local8.aFloat11 * local12.aFloat13 + local12.aFloat19 * local8.aFloat22 + local12.aFloat22;
		Static217.aFloat68 = local8.aFloat13 * local12.aFloat17 + local8.aFloat14 * local12.aFloat15 + local12.aFloat12 * local8.aFloat12;
		Static61.aFloat27 = local12.aFloat12 * local8.aFloat17 + local12.aFloat15 * local8.aFloat21 + local8.aFloat19 * local12.aFloat17;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass162_Sub3_37.anInt8728;
		@Pc(255) int local255 = this.aClass162_Sub3_37.bf;
		if (!this.aBoolean682) {
			this.method6588();
		}
		Static197.anIntArray242[0] = this.aShort103;
		Static55.anIntArray104[0] = this.aShort105;
		Static217.anIntArray263[0] = this.aShort104;
		Static197.anIntArray242[1] = this.aShort98;
		Static55.anIntArray104[1] = this.aShort105;
		Static197.anIntArray242[2] = this.aShort103;
		Static217.anIntArray263[1] = this.aShort104;
		Static55.anIntArray104[2] = this.aShort100;
		Static217.anIntArray263[2] = this.aShort104;
		Static197.anIntArray242[3] = this.aShort98;
		Static55.anIntArray104[3] = this.aShort100;
		Static217.anIntArray263[3] = this.aShort104;
		Static197.anIntArray242[4] = this.aShort103;
		Static55.anIntArray104[4] = this.aShort105;
		Static217.anIntArray263[4] = this.aShort102;
		Static197.anIntArray242[5] = this.aShort98;
		Static55.anIntArray104[5] = this.aShort105;
		Static197.anIntArray242[6] = this.aShort103;
		Static217.anIntArray263[5] = this.aShort102;
		Static55.anIntArray104[6] = this.aShort100;
		Static197.anIntArray242[7] = this.aShort98;
		Static217.anIntArray263[6] = this.aShort102;
		Static55.anIntArray104[7] = this.aShort100;
		Static217.anIntArray263[7] = this.aShort102;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static197.anIntArray242[local383];
			local395 = Static55.anIntArray104[local383];
			local400 = Static217.anIntArray263[local383];
			local414 = local54 + local395 * Static240.aFloat259 + Static550.aFloat186 * local390 + local400 * Static266.aFloat126;
			local428 = local33 + local400 * Static61.aFloat27 + local390 * Static217.aFloat68 + local395 * Static321.aFloat158;
			local442 = Static434.aFloat189 * local400 + local395 * Static369.aFloat244 + Static523.aFloat210 * local390 + local201;
			if (local442 >= (float) this.aClass162_Sub3_37.anInt8703) {
				if (arg0 > 0) {
					local442 = arg0;
				}
				@Pc(469) float local469 = (float) local251 * local428 / local442 + (float) this.aClass162_Sub3_37.anInt8725;
				if (local469 > local243) {
					local243 = local469;
				}
				@Pc(487) float local487 = local414 * (float) local255 / local442 + (float) this.aClass162_Sub3_37.anInt8717;
				if (local241 > local469) {
					local241 = local469;
				}
				if (local245 > local487) {
					local245 = local487;
				}
				local239 = true;
				if (local487 > local247) {
					local247 = local487;
				}
			}
		}
		if (local239 && (float) arg1 > local241 && (float) arg1 < local243 && (float) arg4 > local245 && local247 > (float) arg4) {
			if (arg3) {
				return true;
			}
			if (this.aClass162_Sub3_37.anIntArray569.length < this.anInt8095) {
				this.aClass162_Sub3_37.anIntArray569 = new int[this.anInt8095];
				this.aClass162_Sub3_37.anIntArray570 = new int[this.anInt8095];
			}
			@Pc(560) int[] local560 = this.aClass162_Sub3_37.anIntArray569;
			@Pc(564) int[] local564 = this.aClass162_Sub3_37.anIntArray570;
			@Pc(640) int local640;
			for (@Pc(566) int local566 = 0; local566 < this.anInt8079; local566++) {
				local390 = this.anIntArray545[local566];
				local400 = this.anIntArray542[local566];
				local395 = this.anIntArray543[local566];
				local428 = Static61.aFloat27 * local400 + Static321.aFloat158 * local395 + Static217.aFloat68 * local390 + local33;
				local414 = local400 * Static266.aFloat126 + Static240.aFloat259 * local395 + local390 * Static550.aFloat186 + local54;
				local442 = Static434.aFloat189 * local400 + Static523.aFloat210 * local390 + Static369.aFloat244 * local395 + local201;
				@Pc(647) int local647;
				@Pc(649) int local649;
				@Pc(658) int local658;
				if (local442 >= (float) this.aClass162_Sub3_37.anInt8703) {
					if (arg0 > 0) {
						local442 = arg0;
					}
					local640 = (int) ((float) local251 * local428 / local442 + (float) this.aClass162_Sub3_37.anInt8725);
					local647 = (int) (local414 * (float) local255 / local442 + (float) this.aClass162_Sub3_37.anInt8717);
					local649 = this.anIntArray546[local566];
					local658 = this.anIntArray546[local566 + 1];
					for (@Pc(724) int local724 = local649; local724 < local658; local724++) {
						@Pc(733) int local733 = this.aShortArray124[local724] - 1;
						if (local733 == -1) {
							break;
						}
						local560[local733] = local640;
						local564[local733] = local647;
					}
				} else {
					local640 = this.anIntArray546[local566];
					local647 = this.anIntArray546[local566 + 1];
					for (local649 = local640; local649 < local647; local649++) {
						local658 = this.aShortArray124[local649] - 1;
						if (local658 == -1) {
							break;
						}
						local560[this.aShortArray124[local649] - 1] = -999999;
					}
				}
			}
			for (local640 = 0; local640 < this.anInt8099; local640++) {
				if (local560[this.aShortArray127[local640]] != -999999 && local560[this.aShortArray132[local640]] != -999999 && local560[this.aShortArray128[local640]] != -999999 && this.method6597(local560[this.aShortArray128[local640]], local560[this.aShortArray127[local640]], local560[this.aShortArray132[local640]], local564[this.aShortArray132[local640]], local564[this.aShortArray127[local640]], arg4, arg1, local564[this.aShortArray128[local640]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7197(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray129 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8079; local14++) {
			if ((this.aShortArray129[local14] & arg1) != 0) {
				if (arg2) {
					arg0.A(this.anIntArray545[local14], this.anIntArray543[local14], this.anIntArray542[local14], local12);
				} else {
					arg0.method5881(this.anIntArray545[local14], this.anIntArray543[local14], this.anIntArray542[local14], local12);
				}
				this.anIntArray545[local14] = local12[0];
				this.anIntArray543[local14] = local12[1];
				this.anIntArray542[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean682) {
			this.method6588();
		}
		return this.aShort98;
	}

	@OriginalMember(owner = "client!tda", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8084; local3++) {
			this.anIntArray545[local3] = this.anIntArray545[local3] + 7 >> 4;
			this.anIntArray543[local3] = this.anIntArray543[local3] + 7 >> 4;
			this.anIntArray542[local3] = this.anIntArray542[local3] + 7 >> 4;
		}
		this.aBoolean682 = false;
		if (this.aClass133_8 != null) {
			this.aClass133_8.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!tda", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean682) {
			this.method6588();
		}
		return this.aShort99;
	}

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "()V")
	@Override
	protected void method7205() {
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg4 && arg5 < arg3 && arg7 > arg5) {
			return false;
		} else if (arg5 > arg4 && arg3 < arg5 && arg5 > arg7) {
			return false;
		} else if (arg6 < arg1 && arg6 < arg2 && arg6 < arg0) {
			return false;
		} else {
			return arg1 >= arg6 || arg6 <= arg2 || arg6 <= arg0;
		}
	}

	@OriginalMember(owner = "client!tda", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean682) {
			this.method6588();
		}
		return this.aShort103;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7202(@OriginalArg(0) Class25 arg0) {
		@Pc(8) Class25_Sub1 local8 = (Class25_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass293Array4 != null) {
			for (local13 = 0; local13 < this.aClass293Array4.length; local13++) {
				@Pc(20) Class293 local20 = this.aClass293Array4[local13];
				@Pc(22) Class293 local22 = local20;
				if (local20.aClass293_1 != null) {
					local22 = local20.aClass293_1;
				}
				local22.anInt7306 = (int) (local8.aFloat17 * (float) this.anIntArray542[local20.anInt7304] + local8.aFloat12 * (float) this.anIntArray545[local20.anInt7304] + local8.aFloat15 * (float) this.anIntArray543[local20.anInt7304] + local8.aFloat11);
				local22.anInt7310 = (int) ((float) this.anIntArray542[local20.anInt7304] * local8.aFloat21 + (float) this.anIntArray545[local20.anInt7304] * local8.aFloat14 + local8.aFloat20 * (float) this.anIntArray543[local20.anInt7304] + local8.aFloat16);
				local22.anInt7317 = (int) (local8.aFloat22 + local8.aFloat18 * (float) this.anIntArray543[local20.anInt7304] + local8.aFloat13 * (float) this.anIntArray545[local20.anInt7304] + (float) this.anIntArray542[local20.anInt7304] * local8.aFloat19);
				local22.anInt7318 = (int) ((float) this.anIntArray542[local20.anInt7308] * local8.aFloat17 + (float) this.anIntArray545[local20.anInt7308] * local8.aFloat12 + (float) this.anIntArray543[local20.anInt7308] * local8.aFloat15 + local8.aFloat11);
				local22.anInt7315 = (int) (local8.aFloat16 + local8.aFloat21 * (float) this.anIntArray542[local20.anInt7308] + local8.aFloat14 * (float) this.anIntArray545[local20.anInt7308] + (float) this.anIntArray543[local20.anInt7308] * local8.aFloat20);
				local22.anInt7316 = (int) (local8.aFloat22 + (float) this.anIntArray545[local20.anInt7308] * local8.aFloat13 + (float) this.anIntArray543[local20.anInt7308] * local8.aFloat18 + local8.aFloat19 * (float) this.anIntArray542[local20.anInt7308]);
				local22.anInt7305 = (int) ((float) this.anIntArray543[local20.anInt7313] * local8.aFloat15 + (float) this.anIntArray545[local20.anInt7313] * local8.aFloat12 + local8.aFloat17 * (float) this.anIntArray542[local20.anInt7313] + local8.aFloat11);
				local22.anInt7302 = (int) (local8.aFloat16 + (float) this.anIntArray542[local20.anInt7313] * local8.aFloat21 + (float) this.anIntArray543[local20.anInt7313] * local8.aFloat20 + (float) this.anIntArray545[local20.anInt7313] * local8.aFloat14);
				local22.anInt7312 = (int) (local8.aFloat22 + (float) this.anIntArray542[local20.anInt7313] * local8.aFloat19 + local8.aFloat18 * (float) this.anIntArray543[local20.anInt7313] + local8.aFloat13 * (float) this.anIntArray545[local20.anInt7313]);
			}
		}
		if (this.aClass163Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass163Array4.length; local13++) {
			@Pc(365) Class163 local365 = this.aClass163Array4[local13];
			@Pc(367) Class163 local367 = local365;
			if (local365.aClass163_1 != null) {
				local367 = local365.aClass163_1;
			}
			if (local365.aClass25_1 == null) {
				local365.aClass25_1 = local8.method5883();
			} else {
				local365.aClass25_1.M(local8);
			}
			local367.anInt3823 = (int) ((float) this.anIntArray542[local365.anInt3821] * local8.aFloat17 + local8.aFloat12 * (float) this.anIntArray545[local365.anInt3821] + local8.aFloat15 * (float) this.anIntArray543[local365.anInt3821] + local8.aFloat11);
			local367.anInt3825 = (int) (local8.aFloat16 + local8.aFloat21 * (float) this.anIntArray542[local365.anInt3821] + (float) this.anIntArray543[local365.anInt3821] * local8.aFloat20 + local8.aFloat14 * (float) this.anIntArray545[local365.anInt3821]);
			local367.anInt3824 = (int) (local8.aFloat22 + local8.aFloat19 * (float) this.anIntArray542[local365.anInt3821] + (float) this.anIntArray545[local365.anInt3821] * local8.aFloat13 + (float) this.anIntArray543[local365.anInt3821] * local8.aFloat18);
		}
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8099; local3++) {
			if (this.aShortArray131[local3] == arg0) {
				this.aShortArray131[local3] = arg1;
			}
		}
		if (this.aClass193Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt8053; local34++) {
				@Pc(41) Class193 local41 = this.aClass193Array1[local34];
				@Pc(46) Class65 local46 = this.aClass65Array1[local34];
				local46.anInt1379 = Static142.anIntArray365[this.aShortArray131[local41.anInt4794] & 0xFFFF] & 0xFFFFFF | local46.anInt1379 & 0xFF000000;
			}
		}
		if (this.aClass133_7 != null) {
			this.aClass133_7.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6595(arg4, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!tda", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt8066;
	}

	@OriginalMember(owner = "client!tda", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean682) {
			this.method6588();
		}
		return this.aShort105;
	}
}
