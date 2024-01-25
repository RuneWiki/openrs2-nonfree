import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class83_Sub1 extends Class83 {

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "I")
	private int anInt3076;

	@OriginalMember(owner = "client!eea", name = "B", descriptor = "Z")
	private boolean aBoolean234;

	@OriginalMember(owner = "client!eea", name = "G", descriptor = "I")
	private int anInt3087;

	@OriginalMember(owner = "client!eea", name = "K", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!eea", name = "L", descriptor = "Lclient!sca;")
	private Class303 aClass303_1;

	@OriginalMember(owner = "client!eea", name = "W", descriptor = "I")
	private int anInt3095;

	@OriginalMember(owner = "client!eea", name = "bb", descriptor = "I")
	private int anInt3097;

	@OriginalMember(owner = "client!eea", name = "cb", descriptor = "I")
	private int anInt3098;

	@OriginalMember(owner = "client!eea", name = "hb", descriptor = "I")
	private int anInt3102;

	@OriginalMember(owner = "client!eea", name = "mb", descriptor = "Lclient!di;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!eea", name = "yb", descriptor = "I")
	private int anInt3113;

	@OriginalMember(owner = "client!eea", name = "Ub", descriptor = "I")
	private int anInt3127;

	@OriginalMember(owner = "client!eea", name = "Yb", descriptor = "Lclient!di;")
	private Class72 aClass72_2;

	@OriginalMember(owner = "client!eea", name = "gc", descriptor = "Lclient!fw;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!eea", name = "hc", descriptor = "I")
	private int anInt3137;

	@OriginalMember(owner = "client!eea", name = "oc", descriptor = "I")
	private int anInt3142;

	@OriginalMember(owner = "client!eea", name = "qc", descriptor = "Lclient!di;")
	private Class72 aClass72_3;

	@OriginalMember(owner = "client!eea", name = "Bc", descriptor = "Lclient!di;")
	private Class72 aClass72_4;

	@OriginalMember(owner = "client!eea", name = "Dc", descriptor = "Z")
	private boolean aBoolean238;

	@OriginalMember(owner = "client!eea", name = "Ec", descriptor = "I")
	private int anInt3151;

	@OriginalMember(owner = "client!eea", name = "Gc", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_7;

	@OriginalMember(owner = "client!eea", name = "ob", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!eea", name = "O", descriptor = "I")
	private int anInt3090;

	@OriginalMember(owner = "client!eea", name = "fb", descriptor = "I")
	private int anInt3100;

	@OriginalMember(owner = "client!eea", name = "db", descriptor = "Z")
	private boolean aBoolean237;

	@OriginalMember(owner = "client!eea", name = "M", descriptor = "Z")
	private boolean aBoolean236;

	@OriginalMember(owner = "client!eea", name = "jb", descriptor = "I")
	private int anInt3104;

	@OriginalMember(owner = "client!eea", name = "xb", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!eea", name = "Db", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!eea", name = "ac", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!eea", name = "Gb", descriptor = "I")
	private int anInt3118;

	@OriginalMember(owner = "client!eea", name = "u", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!eea", name = "pc", descriptor = "[Lclient!oia;")
	private Class238[] aClass238Array1;

	@OriginalMember(owner = "client!eea", name = "X", descriptor = "[Lclient!nda;")
	private Class219[] aClass219Array1;

	@OriginalMember(owner = "client!eea", name = "sb", descriptor = "I")
	private int anInt3109;

	@OriginalMember(owner = "client!eea", name = "S", descriptor = "[Lclient!oo;")
	private Class241[] aClass241Array1;

	@OriginalMember(owner = "client!eea", name = "Lb", descriptor = "[Lclient!iha;")
	private Class145[] aClass145Array1;

	@OriginalMember(owner = "client!eea", name = "jc", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!eea", name = "Nb", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!eea", name = "m", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!eea", name = "pb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!eea", name = "w", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!eea", name = "zc", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!eea", name = "J", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!eea", name = "ab", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!eea", name = "N", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!eea", name = "vb", descriptor = "[F")
	private float[] aFloatArray39;

	@OriginalMember(owner = "client!eea", name = "sc", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!eea", name = "Z", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!eea", name = "Cb", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!eea", name = "T", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!eea", name = "Hc", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!eea", name = "mc", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!eea", name = "o", descriptor = "[F")
	private float[] aFloatArray38;

	@OriginalMember(owner = "client!eea", name = "Ib", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!eea", name = "uc", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!eea", name = "Kb", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!eea", name = "p", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!eea", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!eea", name = "lb", descriptor = "[[I")
	private int[][] lb;

	@OriginalMember(owner = "client!eea", name = "Bb", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!ln;Lclient!uk;IIII)V")
	public Class83_Sub1(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class344 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface2 local11 = arg0.anInterface2_12;
		@Pc(15) int[] local15 = new int[arg1.anInt9930];
		this.anIntArray158 = new int[arg1.anInt9923 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt9930; local24++) {
			if (arg1.aByteArray100 == null || arg1.aByteArray100[local24] != 2) {
				if (arg1.aShortArray135 != null && arg1.aShortArray135[local24] != -1) {
					@Pc(56) Class218 local56 = local11.method4027(arg1.aShortArray135[local24] & 0xFFFF);
					if (((this.anInt3127 & 0x40) == 0 || !local56.aBoolean471) && local56.aBoolean475) {
						continue;
					}
				}
				local15[this.anInt3090++] = local24;
				this.anIntArray158[arg1.aShortArray131[local24]]++;
				this.anIntArray158[arg1.aShortArray128[local24]]++;
				this.anIntArray158[arg1.aShortArray134[local24]]++;
			}
		}
		this.anInt3100 = this.anInt3090;
		@Pc(125) long[] local125 = new long[this.anInt3090];
		@Pc(134) boolean local134 = (this.anInt3113 & 0x100) != 0;
		@Pc(146) int local146;
		@Pc(159) int local159;
		@Pc(316) int local316;
		for (@Pc(136) int local136 = 0; local136 < this.anInt3090; local136++) {
			@Pc(142) int local142 = local15[local136];
			@Pc(144) Class218 local144 = null;
			local146 = 0;
			@Pc(148) byte local148 = 0;
			@Pc(150) byte local150 = 0;
			@Pc(152) byte local152 = 0;
			if (arg1.aClass156Array1 != null) {
				@Pc(157) boolean local157 = false;
				for (local159 = 0; local159 < arg1.aClass156Array1.length; local159++) {
					@Pc(166) Class156 local166 = arg1.aClass156Array1[local159];
					if (local142 == local166.anInt5531) {
						@Pc(175) Class101 local175 = Static635.method8514(local166.anInt5528);
						if (local175.aBoolean274) {
							local157 = true;
						}
						if (local175.anInt3716 != -1) {
							@Pc(190) Class218 local190 = local11.method4027(local175.anInt3716);
							if (local190.anInt6842 == 2) {
								this.aBoolean237 = true;
							}
						}
					}
				}
				if (local157) {
					local125[local136] = Long.MAX_VALUE;
					this.anInt3100--;
					continue;
				}
			}
			@Pc(223) short local223 = -1;
			if (arg1.aShortArray135 != null) {
				local223 = arg1.aShortArray135[local142];
				if (local223 != -1) {
					local144 = local11.method4027(local223 & 0xFFFF);
					if ((this.anInt3127 & 0x40) != 0 && local144.aBoolean471) {
						local223 = -1;
						local144 = null;
					} else {
						local152 = local144.aByte62;
						local150 = local144.aByte66;
					}
				}
			}
			@Pc(278) boolean local278 = arg1.aByteArray96 != null && arg1.aByteArray96[local142] != 0 || local144 != null && local144.anInt6842 != 0;
			if ((local134 || local278) && arg1.aByteArray98 != null) {
				local146 += arg1.aByteArray98[local142] << 17;
			}
			if (local278) {
				local146 += 65536;
			}
			local146 += (local150 & 0xFF) << 8;
			local316 = local148 + ((local223 & 0xFFFF) << 16);
			local146 += local152 & 0xFF;
			@Pc(328) int local328 = local316 + (local136 & 0xFFFF);
			local125[local136] = ((long) local146 << 32) + (long) local328;
			this.aBoolean237 |= local278;
			this.aBoolean236 |= local144 != null && (local144.aByte67 != 0 || local144.aByte64 != 0);
		}
		Static420.method6584(local15, local125);
		this.anInt3104 = arg1.anInt9923;
		this.anIntArray159 = arg1.anIntArray573;
		this.anIntArray160 = arg1.anIntArray570;
		this.aShortArray20 = arg1.aShortArray136;
		this.anInt3118 = arg1.anInt9920;
		this.anIntArray157 = arg1.anIntArray576;
		@Pc(400) Class163[] local400 = new Class163[this.anInt3104];
		this.aClass238Array1 = arg1.aClass238Array5;
		this.aClass219Array1 = arg1.aClass219Array5;
		@Pc(428) int local428;
		@Pc(442) int local442;
		@Pc(484) int local484;
		if (arg1.aClass156Array1 != null) {
			this.anInt3109 = arg1.aClass156Array1.length;
			this.aClass241Array1 = new Class241[this.anInt3109];
			this.aClass145Array1 = new Class145[this.anInt3109];
			for (local428 = 0; local428 < this.anInt3109; local428++) {
				@Pc(435) Class156 local435 = arg1.aClass156Array1[local428];
				@Pc(440) Class101 local440 = Static635.method8514(local435.anInt5528);
				local442 = -1;
				for (@Pc(444) int local444 = 0; local444 < this.anInt3090; local444++) {
					if (local15[local444] == local435.anInt5531) {
						local442 = local444;
						break;
					}
				}
				if (local442 == -1) {
					throw new RuntimeException();
				}
				local484 = Static77.anIntArray92[arg1.aShortArray132[local435.anInt5531] & 0xFFFF] & 0xFFFFFF;
				@Pc(501) int local501 = local484 | 255 - (arg1.aByteArray96 == null ? 0 : arg1.aByteArray96[local435.anInt5531]) << 24;
				this.aClass145Array1[local428] = new Class145(local442, arg1.aShortArray131[local435.anInt5531], arg1.aShortArray128[local435.anInt5531], arg1.aShortArray134[local435.anInt5531], local440.anInt3711, local440.anInt3715, local440.anInt3716, local440.anInt3718, local440.anInt3717, local440.aBoolean274, local440.aBoolean275, local435.anInt5527);
				this.aClass241Array1[local428] = new Class241(local501);
			}
		}
		local428 = this.anInt3090 * 3;
		this.aShortArray21 = new short[local428];
		this.aShort32 = (short) arg4;
		this.aShortArray13 = new short[local428];
		this.aShortArray18 = new short[local428];
		if (arg1.aShortArray133 != null) {
			this.aShortArray14 = new short[this.anInt3090];
		}
		this.aShortArray24 = new short[this.anInt3090];
		this.aShort31 = (short) arg3;
		this.aShortArray17 = new short[this.anInt3090];
		this.aShortArray15 = new short[this.anInt3090];
		this.aFloatArray39 = new float[local428];
		this.aShortArray23 = new short[local428];
		Static151.aLongArray2 = new long[local428];
		this.aByteArray18 = new byte[this.anInt3090];
		this.aByteArray19 = new byte[local428];
		this.aShortArray16 = new short[this.anInt3090];
		this.aShortArray25 = new short[this.anInt3090];
		this.aShortArray22 = new short[local428];
		this.aFloatArray38 = new float[local428];
		this.aShortArray19 = new short[local428];
		local146 = 0;
		for (local316 = 0; local316 < arg1.anInt9923; local316++) {
			local442 = this.anIntArray158[local316];
			this.anIntArray158[local316] = local146;
			local146 += local442;
			local400[local316] = new Class163();
		}
		this.anIntArray158[arg1.anInt9923] = local146;
		@Pc(687) Class114 local687 = Static346.method5514(arg1, local15, this.anInt3090);
		@Pc(691) Class65[] local691 = new Class65[arg1.anInt9930];
		@Pc(732) int local732;
		@Pc(743) int local743;
		@Pc(754) int local754;
		@Pc(710) short local710;
		@Pc(721) int local721;
		for (local484 = 0; local484 < arg1.anInt9930; local484++) {
			@Pc(700) short local700 = arg1.aShortArray131[local484];
			@Pc(705) short local705 = arg1.aShortArray128[local484];
			local710 = arg1.aShortArray134[local484];
			local721 = this.anIntArray157[local705] - this.anIntArray157[local700];
			local732 = this.anIntArray160[local705] - this.anIntArray160[local700];
			local743 = this.anIntArray159[local705] - this.anIntArray159[local700];
			local754 = this.anIntArray157[local710] - this.anIntArray157[local700];
			@Pc(765) int local765 = this.anIntArray160[local710] - this.anIntArray160[local700];
			@Pc(776) int local776 = this.anIntArray159[local710] - this.anIntArray159[local700];
			@Pc(785) int local785 = local732 * local776 - local765 * local743;
			@Pc(794) int local794 = local754 * local743 - local776 * local721;
			@Pc(803) int local803;
			for (local803 = local765 * local721 - local732 * local754; local785 > 8192 || local794 > 8192 || local803 > 8192 || local785 < -8192 || local794 < -8192 || local803 < -8192; local803 >>= 0x1) {
				local785 >>= 0x1;
				local794 >>= 0x1;
			}
			@Pc(858) int local858 = (int) Math.sqrt((double) (local803 * local803 + local785 * local785 + local794 * local794));
			if (local858 <= 0) {
				local858 = 1;
			}
			local785 = local785 * 256 / local858;
			local794 = local794 * 256 / local858;
			local803 = local803 * 256 / local858;
			@Pc(890) byte local890 = arg1.aByteArray100 == null ? 0 : arg1.aByteArray100[local484];
			if (local890 == 0) {
				@Pc(896) Class163 local896 = local400[local700];
				local896.anInt5637++;
				local896.anInt5636 += local785;
				local896.anInt5635 += local803;
				local896.anInt5640 += local794;
				@Pc(924) Class163 local924 = local400[local705];
				local924.anInt5635 += local803;
				local924.anInt5640 += local794;
				local924.anInt5636 += local785;
				local924.anInt5637++;
				@Pc(952) Class163 local952 = local400[local710];
				local952.anInt5635 += local803;
				local952.anInt5637++;
				local952.anInt5640 += local794;
				local952.anInt5636 += local785;
			} else if (local890 == 1) {
				@Pc(989) Class65 local989 = local691[local484] = new Class65();
				local989.anInt2538 = local794;
				local989.anInt2543 = local785;
				local989.anInt2541 = local803;
			}
		}
		@Pc(1015) int local1015;
		@Pc(1058) short local1058;
		for (local159 = 0; local159 < this.anInt3090; local159++) {
			local1015 = local15[local159];
			@Pc(1022) int local1022 = arg1.aShortArray132[local1015] & 0xFFFF;
			if (arg1.aByteArray95 == null) {
				local721 = -1;
			} else {
				local721 = arg1.aByteArray95[local1015];
			}
			if (arg1.aByteArray96 == null) {
				local732 = 0;
			} else {
				local732 = arg1.aByteArray96[local1015] & 0xFF;
			}
			local1058 = arg1.aShortArray135 == null ? -1 : arg1.aShortArray135[local1015];
			if (local1058 != -1 && (this.anInt3127 & 0x40) != 0) {
				@Pc(1076) Class218 local1076 = local11.method4027(local1058 & 0xFFFF);
				if (local1076.aBoolean471) {
					local1058 = -1;
				}
			}
			@Pc(1083) float local1083 = 0.0F;
			@Pc(1085) float local1085 = 0.0F;
			@Pc(1087) float local1087 = 0.0F;
			@Pc(1089) float local1089 = 0.0F;
			@Pc(1091) float local1091 = 0.0F;
			@Pc(1093) float local1093 = 0.0F;
			@Pc(1095) byte local1095 = 0;
			@Pc(1097) byte local1097 = 0;
			@Pc(1099) int local1099 = 0;
			@Pc(1115) byte local1115;
			@Pc(1132) short local1132;
			@Pc(1923) short local1923;
			@Pc(1928) short local1928;
			if (local1058 != -1) {
				if (local721 == -1) {
					local1091 = 0.0F;
					local1089 = 1.0F;
					local1093 = 0.0F;
					local1083 = 0.0F;
					local1097 = 2;
					local1087 = 1.0F;
					local1085 = 1.0F;
					local1095 = 1;
				} else {
					local721 &= 0xFF;
					local1115 = arg1.aByteArray101[local721];
					@Pc(1122) short local1122;
					@Pc(1127) short local1127;
					@Pc(1165) float local1165;
					@Pc(1176) float local1176;
					@Pc(1270) float local1270;
					@Pc(1714) float local1714;
					@Pc(1722) float local1722;
					@Pc(1730) float local1730;
					@Pc(1753) float local1753;
					@Pc(1776) float local1776;
					@Pc(1799) float local1799;
					if (local1115 == 0) {
						local1122 = arg1.aShortArray131[local1015];
						local1127 = arg1.aShortArray128[local1015];
						local1132 = arg1.aShortArray134[local1015];
						local1923 = arg1.aShortArray127[local721];
						local1928 = arg1.aShortArray129[local721];
						@Pc(1933) short local1933 = arg1.aShortArray130[local721];
						@Pc(1939) float local1939 = (float) arg1.anIntArray576[local1923];
						@Pc(1945) float local1945 = (float) arg1.anIntArray570[local1923];
						local1165 = arg1.anIntArray573[local1923];
						local1176 = (float) arg1.anIntArray576[local1928] - local1939;
						local1270 = (float) arg1.anIntArray570[local1928] - local1945;
						@Pc(1978) float local1978 = (float) arg1.anIntArray573[local1928] - local1165;
						@Pc(1987) float local1987 = (float) arg1.anIntArray576[local1933] - local1939;
						@Pc(1995) float local1995 = (float) arg1.anIntArray570[local1933] - local1945;
						@Pc(2003) float local2003 = (float) arg1.anIntArray573[local1933] - local1165;
						@Pc(2011) float local2011 = (float) arg1.anIntArray576[local1122] - local1939;
						@Pc(2019) float local2019 = (float) arg1.anIntArray570[local1122] - local1945;
						@Pc(2027) float local2027 = (float) arg1.anIntArray573[local1122] - local1165;
						@Pc(2036) float local2036 = (float) arg1.anIntArray576[local1127] - local1939;
						@Pc(2045) float local2045 = (float) arg1.anIntArray570[local1127] - local1945;
						local1714 = (float) arg1.anIntArray573[local1127] - local1165;
						local1722 = (float) arg1.anIntArray576[local1132] - local1939;
						local1730 = (float) arg1.anIntArray570[local1132] - local1945;
						local1753 = (float) arg1.anIntArray573[local1132] - local1165;
						local1776 = local2003 * local1270 - local1995 * local1978;
						local1799 = local1987 * local1978 - local2003 * local1176;
						@Pc(2104) float local2104 = local1176 * local1995 - local1987 * local1270;
						@Pc(2113) float local2113 = local1995 * local2104 - local1799 * local2003;
						@Pc(2121) float local2121 = local2003 * local1776 - local2104 * local1987;
						@Pc(2129) float local2129 = local1799 * local1987 - local1776 * local1995;
						@Pc(2143) float local2143 = 1.0F / (local1978 * local2129 + local2113 * local1176 + local1270 * local2121);
						local1087 = (local1714 * local2129 + local2121 * local2045 + local2113 * local2036) * local2143;
						local1083 = local2143 * (local2129 * local2027 + local2019 * local2121 + local2011 * local2113);
						local1091 = local2143 * (local2113 * local1722 + local1730 * local2121 + local2129 * local1753);
						@Pc(2193) float local2193 = local1776 * local1978 - local2104 * local1176;
						@Pc(2202) float local2202 = local1176 * local1799 - local1270 * local1776;
						@Pc(2211) float local2211 = local1270 * local2104 - local1799 * local1978;
						@Pc(2225) float local2225 = 1.0F / (local2202 * local2003 + local2211 * local1987 + local2193 * local1995);
						local1085 = local2225 * (local2202 * local2027 + local2193 * local2019 + local2211 * local2011);
						local1093 = local2225 * (local2202 * local1753 + local1722 * local2211 + local2193 * local1730);
						local1089 = local2225 * (local2202 * local1714 + local2045 * local2193 + local2211 * local2036);
					} else {
						local1122 = arg1.aShortArray131[local1015];
						local1127 = arg1.aShortArray128[local1015];
						local1132 = arg1.aShortArray134[local1015];
						@Pc(1137) int local1137 = local687.anIntArray224[local721];
						@Pc(1142) int local1142 = local687.anIntArray227[local721];
						@Pc(1147) int local1147 = local687.anIntArray226[local721];
						@Pc(1152) float[] local1152 = local687.aFloatArrayArray10[local721];
						@Pc(1157) byte local1157 = arg1.aByteArray97[local721];
						local1165 = (float) arg1.anIntArray568[local721] / 256.0F;
						if (local1115 == 1) {
							local1176 = (float) arg1.anIntArray577[local721] / 1024.0F;
							Static635.method8513(local1142, local1176, local1137, arg1.anIntArray570[local1122], arg1.anIntArray576[local1122], local1165, local1147, Static221.aFloatArray54, local1152, arg1.anIntArray573[local1122], local1157);
							local1085 = Static221.aFloatArray54[1];
							local1083 = Static221.aFloatArray54[0];
							Static635.method8513(local1142, local1176, local1137, arg1.anIntArray570[local1127], arg1.anIntArray576[local1127], local1165, local1147, Static221.aFloatArray54, local1152, arg1.anIntArray573[local1127], local1157);
							local1089 = Static221.aFloatArray54[1];
							local1087 = Static221.aFloatArray54[0];
							Static635.method8513(local1142, local1176, local1137, arg1.anIntArray570[local1132], arg1.anIntArray576[local1132], local1165, local1147, Static221.aFloatArray54, local1152, arg1.anIntArray573[local1132], local1157);
							local1093 = Static221.aFloatArray54[1];
							local1091 = Static221.aFloatArray54[0];
							local1270 = local1176 / 2.0F;
							if ((local1157 & 0x1) == 0) {
								if (local1270 < local1087 - local1083) {
									local1095 = 1;
									local1087 -= local1176;
								} else if (local1083 - local1087 > local1270) {
									local1095 = 2;
									local1087 += local1176;
								}
								if (local1091 - local1083 > local1270) {
									local1097 = 1;
									local1091 -= local1176;
								} else if (local1270 < local1083 - local1091) {
									local1097 = 2;
									local1091 += local1176;
								}
							} else {
								if (local1093 - local1085 > local1270) {
									local1097 = 1;
									local1093 -= local1176;
								} else if (local1270 < local1085 - local1093) {
									local1093 += local1176;
									local1097 = 2;
								}
								if (local1089 - local1085 > local1270) {
									local1095 = 1;
									local1089 -= local1176;
								} else if (local1270 < local1085 - local1089) {
									local1095 = 2;
									local1089 += local1176;
								}
							}
						} else if (local1115 == 2) {
							local1176 = (float) arg1.anIntArray575[local721] / 256.0F;
							local1270 = (float) arg1.anIntArray571[local721] / 256.0F;
							@Pc(1627) int local1627 = arg1.anIntArray576[local1127] - arg1.anIntArray576[local1122];
							@Pc(1637) int local1637 = arg1.anIntArray570[local1127] - arg1.anIntArray570[local1122];
							@Pc(1648) int local1648 = arg1.anIntArray573[local1127] - arg1.anIntArray573[local1122];
							@Pc(1658) int local1658 = arg1.anIntArray576[local1132] - arg1.anIntArray576[local1122];
							@Pc(1668) int local1668 = arg1.anIntArray570[local1132] - arg1.anIntArray570[local1122];
							@Pc(1679) int local1679 = arg1.anIntArray573[local1132] - arg1.anIntArray573[local1122];
							@Pc(1688) int local1688 = local1679 * local1637 - local1668 * local1648;
							@Pc(1697) int local1697 = local1658 * local1648 - local1679 * local1627;
							@Pc(1706) int local1706 = local1627 * local1668 - local1658 * local1637;
							local1714 = 64.0F / (float) arg1.anIntArray574[local721];
							local1722 = 64.0F / (float) arg1.anIntArray572[local721];
							local1730 = 64.0F / (float) arg1.anIntArray577[local721];
							local1753 = (local1152[1] * (float) local1697 + (float) local1688 * local1152[0] + (float) local1706 * local1152[2]) / local1714;
							local1776 = ((float) local1706 * local1152[5] + local1152[4] * (float) local1697 + (float) local1688 * local1152[3]) / local1722;
							local1799 = ((float) local1688 * local1152[6] + local1152[7] * (float) local1697 + local1152[8] * (float) local1706) / local1730;
							local1099 = Static378.method5985(local1776, local1753, local1799);
							Static479.method7073(local1270, arg1.anIntArray573[local1122], local1176, Static221.aFloatArray54, local1137, arg1.anIntArray576[local1122], local1099, arg1.anIntArray570[local1122], local1157, local1147, local1165, local1142, local1152);
							local1085 = Static221.aFloatArray54[1];
							local1083 = Static221.aFloatArray54[0];
							Static479.method7073(local1270, arg1.anIntArray573[local1127], local1176, Static221.aFloatArray54, local1137, arg1.anIntArray576[local1127], local1099, arg1.anIntArray570[local1127], local1157, local1147, local1165, local1142, local1152);
							local1089 = Static221.aFloatArray54[1];
							local1087 = Static221.aFloatArray54[0];
							Static479.method7073(local1270, arg1.anIntArray573[local1132], local1176, Static221.aFloatArray54, local1137, arg1.anIntArray576[local1132], local1099, arg1.anIntArray570[local1132], local1157, local1147, local1165, local1142, local1152);
							local1093 = Static221.aFloatArray54[1];
							local1091 = Static221.aFloatArray54[0];
						} else if (local1115 == 3) {
							Static558.method7824(arg1.anIntArray576[local1122], local1157, local1142, local1152, arg1.anIntArray570[local1122], Static221.aFloatArray54, local1165, local1147, local1137, arg1.anIntArray573[local1122]);
							local1085 = Static221.aFloatArray54[1];
							local1083 = Static221.aFloatArray54[0];
							Static558.method7824(arg1.anIntArray576[local1127], local1157, local1142, local1152, arg1.anIntArray570[local1127], Static221.aFloatArray54, local1165, local1147, local1137, arg1.anIntArray573[local1127]);
							local1087 = Static221.aFloatArray54[0];
							local1089 = Static221.aFloatArray54[1];
							Static558.method7824(arg1.anIntArray576[local1132], local1157, local1142, local1152, arg1.anIntArray570[local1132], Static221.aFloatArray54, local1165, local1147, local1137, arg1.anIntArray573[local1132]);
							local1091 = Static221.aFloatArray54[0];
							local1093 = Static221.aFloatArray54[1];
							if ((local1157 & 0x1) == 0) {
								if (local1091 - local1083 > 0.5F) {
									local1091--;
									local1097 = 1;
								} else if (local1083 - local1091 > 0.5F) {
									local1097 = 2;
									local1091++;
								}
								if (local1087 - local1083 > 0.5F) {
									local1087--;
									local1095 = 1;
								} else if (local1083 - local1087 > 0.5F) {
									local1087++;
									local1095 = 2;
								}
							} else {
								if (local1093 - local1085 > 0.5F) {
									local1097 = 1;
									local1093--;
								} else if (local1085 - local1093 > 0.5F) {
									local1097 = 2;
									local1093++;
								}
								if (local1089 - local1085 > 0.5F) {
									local1095 = 1;
									local1089--;
								} else if (local1085 - local1089 > 0.5F) {
									local1089++;
									local1095 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray100 == null) {
				local1115 = 0;
			} else {
				local1115 = arg1.aByteArray100[local1015];
			}
			if (local1115 == 0) {
				@Pc(2322) long local2322 = ((long) local732 + (long) (local1099 << 24) + (long) (local1022 << 8) << 32) + (long) (local721 << 2);
				local1132 = arg1.aShortArray131[local1015];
				local1923 = arg1.aShortArray128[local1015];
				local1928 = arg1.aShortArray134[local1015];
				@Pc(2341) Class163 local2341 = local400[local1132];
				this.aShortArray16[local159] = this.method2699(local2322, local1132, local159, local2341.anInt5636, local2341.anInt5635, local2341.anInt5640, arg1, local1083, local2341.anInt5637, local1085);
				@Pc(2366) Class163 local2366 = local400[local1923];
				this.aShortArray17[local159] = this.method2699((long) local1095 + local2322, local1923, local159, local2366.anInt5636, local2366.anInt5635, local2366.anInt5640, arg1, local1087, local2366.anInt5637, local1089);
				@Pc(2394) Class163 local2394 = local400[local1928];
				this.aShortArray25[local159] = this.method2699(local2322 + (long) local1097, local1928, local159, local2394.anInt5636, local2394.anInt5635, local2394.anInt5640, arg1, local1091, local2394.anInt5637, local1093);
			} else if (local1115 == 1) {
				@Pc(2427) Class65 local2427 = local691[local1015];
				@Pc(2470) long local2470 = (long) ((local2427.anInt2538 + 256 << 12) + (local721 << 2) + (local2427.anInt2543 > 0 ? 1024 : 2048) + (local2427.anInt2541 + 256 << 22)) + ((long) local732 + (long) (local1099 << 24) + (long) (local1022 << 8) << 32);
				this.aShortArray16[local159] = this.method2699(local2470, arg1.aShortArray131[local1015], local159, local2427.anInt2543, local2427.anInt2541, local2427.anInt2538, arg1, local1083, 0, local1085);
				this.aShortArray17[local159] = this.method2699(local2470 + (long) local1095, arg1.aShortArray128[local1015], local159, local2427.anInt2543, local2427.anInt2541, local2427.anInt2538, arg1, local1087, 0, local1089);
				this.aShortArray25[local159] = this.method2699(local2470 + (long) local1097, arg1.aShortArray134[local1015], local159, local2427.anInt2543, local2427.anInt2541, local2427.anInt2538, arg1, local1091, 0, local1093);
			}
			if (arg1.aByteArray96 != null) {
				this.aByteArray18[local159] = arg1.aByteArray96[local1015];
			}
			if (arg1.aShortArray133 != null) {
				this.aShortArray14[local159] = arg1.aShortArray133[local1015];
			}
			this.aShortArray24[local159] = arg1.aShortArray132[local1015];
			this.aShortArray15[local159] = local1058;
		}
		if (this.anInt3100 > 0) {
			local1015 = 1;
			local710 = this.aShortArray15[0];
			for (local721 = 0; local721 < this.anInt3100; local721++) {
				@Pc(2607) short local2607 = this.aShortArray15[local721];
				if (local710 != local2607) {
					local710 = local2607;
					local1015++;
				}
			}
			this.anIntArray162 = new int[local1015];
			this.anIntArray161 = new int[local1015 + 1];
			this.anIntArray156 = new int[local1015];
			this.anIntArray161[0] = 0;
			local732 = this.anInt3095;
			local1015 = 0;
			local1058 = 0;
			local710 = this.aShortArray15[0];
			for (local754 = 0; local754 < this.anInt3100; local754++) {
				@Pc(2658) short local2658 = this.aShortArray15[local754];
				if (local710 != local2658) {
					this.anIntArray156[local1015] = local732;
					this.anIntArray162[local1015] = local1058 + 1 - local732;
					local1015++;
					this.anIntArray161[local1015] = local754;
					local1058 = 0;
					local732 = this.anInt3095;
					local710 = local2658;
				}
				@Pc(2694) short local2694 = this.aShortArray16[local754];
				if (local2694 > local1058) {
					local1058 = local2694;
				}
				if (local732 > local2694) {
					local732 = local2694;
				}
				local2694 = this.aShortArray17[local754];
				if (local2694 > local1058) {
					local1058 = local2694;
				}
				if (local732 > local2694) {
					local732 = local2694;
				}
				local2694 = this.aShortArray25[local754];
				if (local2694 > local1058) {
					local1058 = local2694;
				}
				if (local2694 < local732) {
					local732 = local2694;
				}
			}
			this.anIntArray156[local1015] = local732;
			this.anIntArray162[local1015] = local1058 + 1 - local732;
			local1015++;
			this.anIntArray161[local1015] = this.anInt3100;
		}
		Static151.aLongArray2 = null;
		this.aShortArray22 = Static303.method4964(this.aShortArray22, this.anInt3095);
		this.aShortArray13 = Static303.method4964(this.aShortArray13, this.anInt3095);
		this.aShortArray23 = Static303.method4964(this.aShortArray23, this.anInt3095);
		this.aShortArray19 = Static303.method4964(this.aShortArray19, this.anInt3095);
		this.aShortArray18 = Static303.method4964(this.aShortArray18, this.anInt3095);
		this.aByteArray19 = Static282.method4763(this.aByteArray19, this.anInt3095);
		this.aFloatArray38 = Static2.method4221(this.aFloatArray38, this.anInt3095);
		this.aFloatArray39 = Static2.method4221(this.aFloatArray39, this.anInt3095);
		if (arg1.anIntArray567 != null && Static37.method1269(this.anInt3127, arg2)) {
			this.anIntArrayArray9 = arg1.method8047(false);
		}
		if (arg1.aClass156Array1 != null && Static520.method7418(this.anInt3127, arg2)) {
			this.lb = arg1.method8052();
		}
		if (arg1.anIntArray569 != null && Static349.method5537(arg2, this.anInt3127)) {
			local1015 = 0;
			@Pc(2877) int[] local2877 = new int[256];
			for (local721 = 0; local721 < this.anInt3090; local721++) {
				local732 = arg1.anIntArray569[local15[local721]];
				if (local732 >= 0) {
					if (local732 > local1015) {
						local1015 = local732;
					}
					@Pc(2902) int local2902 = local2877[local732]++;
				}
			}
			this.anIntArrayArray10 = new int[local1015 + 1][];
			for (local732 = 0; local732 <= local1015; local732++) {
				this.anIntArrayArray10[local732] = new int[local2877[local732]];
				local2877[local732] = 0;
			}
			for (local743 = 0; local743 < this.anInt3090; local743++) {
				local754 = arg1.anIntArray569[local15[local743]];
				if (local754 >= 0) {
					this.anIntArrayArray10[local754][local2877[local754]++] = local743;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!ln;IIZZ)V")
	public Class83_Sub1(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean234 = false;
		this.anInt3090 = 0;
		this.anInt3100 = 0;
		this.anInt3104 = 0;
		this.aBoolean237 = false;
		this.anInt3118 = 0;
		this.anInt3095 = 0;
		this.aBoolean235 = true;
		this.aBoolean236 = false;
		this.aBoolean238 = false;
		this.anInt3127 = arg2;
		this.aClass16_Sub1_7 = arg0;
		this.anInt3113 = arg1;
		this.aBoolean238 = arg4;
		if (arg3 || Static215.method4063(this.anInt3113, this.anInt3127)) {
			this.aClass72_3 = new Class72(Static287.method4823(this.anInt3113, this.anInt3127));
		}
		if (arg3 || Static605.method7725(this.anInt3127, this.anInt3113)) {
			this.aClass72_1 = new Class72(Static377.method5849(this.anInt3127, this.anInt3113));
		}
		if (arg3 || Static536.method7560(this.anInt3113, this.anInt3127)) {
			this.aClass72_4 = new Class72(Static376.method5847(this.anInt3113, this.anInt3127));
		}
		if (arg3 || Static589.method8153(this.anInt3113, this.anInt3127)) {
			this.aClass72_2 = new Class72(Static322.method5333(this.anInt3113, this.anInt3127));
		}
		if (arg3 || Static71.method1822(this.anInt3127, this.anInt3113)) {
			this.aClass303_1 = new Class303(Static108.method2411(this.anInt3113, this.anInt3127));
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt3090; local3++) {
			local12 = this.aShortArray24[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			@Pc(58) int local58 = local12 & 0x7F;
			if (arg2 != -1) {
				local58 -= -(arg3 * (arg2 - local58) >> 7);
			}
			this.aShortArray24[local3] = (short) (local58 | local18 << 10 | local24 << 7);
		}
		if (this.aClass145Array1 != null) {
			for (local12 = 0; local12 < this.anInt3109; local12++) {
				@Pc(107) Class145 local107 = this.aClass145Array1[local12];
				@Pc(112) Class241 local112 = this.aClass241Array1[local12];
				local112.anInt7718 = Static77.anIntArray92[this.aShortArray24[local107.anInt5188] & 0xFFFF] & 0xFFFFFF | local112.anInt7718 & 0xFF000000;
			}
		}
		this.method2695();
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IILclient!dfa;ZII)Z")
	@Override
	public boolean method7994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method2698(arg2, arg4, arg3, arg0, arg5, arg1);
	}

	@OriginalMember(owner = "client!eea", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort32;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)Z")
	private boolean method2686() {
		@Pc(13) boolean local13 = !this.aClass72_4.aBoolean196;
		@Pc(26) boolean local26 = (this.anInt3127 & 0x37) != 0 && !this.aClass72_2.aBoolean196;
		@Pc(34) boolean local34 = !this.aClass72_3.aBoolean196;
		@Pc(42) boolean local42 = !this.aClass72_1.aBoolean196;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(75) Interface4 local75;
		@Pc(91) Buffer local91;
		if (local34) {
			if (this.aClass72_3.anInterface4_11 == null) {
				this.aClass72_3.anInterface4_11 = this.aClass16_Sub1_7.method3988(this.aBoolean238);
			}
			local75 = this.aClass72_3.anInterface4_11;
			local75.method6507(12, this.anInt3095 * 12);
			local91 = local75.method6506();
			if (local91 == null) {
				local54 = false;
			} else {
				this.aClass16_Sub1_7.aNativeInterface3.copyPositions(this.anIntArray157, this.anIntArray160, this.anIntArray159, this.aShortArray22, 0, 12, this.anInt3095, local91.getAddress());
				if (local75.method6505()) {
					this.aClass72_3.anInterface4_12 = local75;
					this.aClass72_3.aBoolean196 = true;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(190) short[] local190;
		@Pc(184) short[] local184;
		@Pc(187) short[] local187;
		@Pc(181) byte[] local181;
		if (local13) {
			if (this.aClass72_4.anInterface4_11 == null) {
				this.aClass72_4.anInterface4_11 = this.aClass16_Sub1_7.method3988(this.aBoolean238);
			}
			local75 = this.aClass72_4.anInterface4_11;
			local75.method6507(4, this.anInt3095 * 4);
			local91 = local75.method6506();
			if (local91 == null) {
				local54 = false;
			} else {
				if ((this.anInt3127 & 0x37) == 0) {
					if (this.aClass110_1 == null) {
						local181 = this.aByteArray19;
						local184 = this.aShortArray19;
						local187 = this.aShortArray18;
						local190 = this.aShortArray23;
					} else {
						local187 = this.aClass110_1.aShortArray44;
						local190 = this.aClass110_1.aShortArray45;
						local181 = this.aClass110_1.aByteArray26;
						local184 = this.aClass110_1.aShortArray43;
					}
					this.aClass16_Sub1_7.aNativeInterface3.copyLighting(this.aShortArray24, this.aByteArray18, this.aShortArray15, local190, local184, local187, local181, this.aShort31, this.aShort32, this.aShortArray13, 0, 4, this.anInt3095, local91.getAddress());
				} else {
					this.aClass16_Sub1_7.aNativeInterface3.copyColours(this.aShortArray24, this.aByteArray18, this.aShortArray15, this.aShort31, this.aShortArray13, 0, 4, this.anInt3095, local91.getAddress());
				}
				if (local75.method6505()) {
					this.aClass72_4.aBoolean196 = true;
					this.aClass72_4.anInterface4_12 = local75;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass72_2.anInterface4_11 == null) {
				this.aClass72_2.anInterface4_11 = this.aClass16_Sub1_7.method3988(this.aBoolean238);
			}
			local75 = this.aClass72_2.anInterface4_11;
			local75.method6507(12, this.anInt3095 * 12);
			local91 = local75.method6506();
			if (local91 == null) {
				local54 = false;
			} else {
				if (this.aClass110_1 == null) {
					local184 = this.aShortArray19;
					local190 = this.aShortArray23;
					local181 = this.aByteArray19;
					local187 = this.aShortArray18;
				} else {
					local187 = this.aClass110_1.aShortArray44;
					local190 = this.aClass110_1.aShortArray45;
					local181 = this.aClass110_1.aByteArray26;
					local184 = this.aClass110_1.aShortArray43;
				}
				this.aClass16_Sub1_7.aNativeInterface3.copyNormals(local190, local184, local187, local181, 3.0F / (float) this.aShort32, 3.0F / (float) (this.aShort32 / 2 + this.aShort32), 0, 12, this.anInt3095, local91.getAddress());
				if (local75.method6505()) {
					this.aClass72_2.aBoolean196 = true;
					this.aClass72_2.anInterface4_12 = local75;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass72_1.anInterface4_11 == null) {
				this.aClass72_1.anInterface4_11 = this.aClass16_Sub1_7.method3988(this.aBoolean238);
			}
			local75 = this.aClass72_1.anInterface4_11;
			local75.method6507(8, this.anInt3095 * 8);
			local91 = local75.method6506();
			if (local91 == null) {
				local54 = false;
			} else {
				this.aClass16_Sub1_7.aNativeInterface3.copyTexCoords(this.aFloatArray38, this.aFloatArray39, 0, 8, this.anInt3095, local91.getAddress());
				if (local75.method6505()) {
					this.aClass72_1.aBoolean196 = true;
					this.aClass72_1.anInterface4_12 = local75;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IILclient!dfa;ZI)Z")
	@Override
	public boolean method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method2698(arg2, arg4, arg3, arg0, -1, arg1);
	}

	@OriginalMember(owner = "client!eea", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean234) {
			this.method2701();
		}
		return this.anInt3151;
	}

	@OriginalMember(owner = "client!eea", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean234) {
			this.method2701();
		}
		return this.anInt3142;
	}

	@OriginalMember(owner = "client!eea", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean234) {
			this.method2701();
		}
		return this.anInt3097;
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "()[Lclient!nda;")
	@Override
	public Class219[] method8010() {
		return this.aClass219Array1;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V")
	private void method2687() {
		if (this.anInt3100 == 0) {
			return;
		}
		if (this.method2686() && this.method2702()) {
			this.aClass16_Sub1_7.method3983(this.aClass72_3.anInterface4_12, 0);
			this.aClass16_Sub1_7.method3983(this.aClass72_4.anInterface4_12, 1);
			this.aClass16_Sub1_7.method3983(this.aClass72_1.anInterface4_12, 2);
			@Pc(57) boolean local57;
			if ((this.anInt3127 & 0x37) == 0) {
				this.aClass16_Sub1_7.method3966(false);
				local57 = false;
				this.aClass16_Sub1_7.method3967(this.aClass16_Sub1_7.aClass94_19);
			} else {
				local57 = true;
				this.aClass16_Sub1_7.method3966(true);
				this.aClass16_Sub1_7.method3983(this.aClass72_2.anInterface4_12, 3);
				this.aClass16_Sub1_7.method3967(this.aClass16_Sub1_7.aClass94_20);
			}
			for (@Pc(95) int local95 = 0; local95 < this.anIntArray156.length; local95++) {
				@Pc(102) int local102 = this.anIntArray161[local95];
				@Pc(109) int local109 = this.anIntArray161[local95 + 1];
				@Pc(116) int local116 = this.aShortArray15[local102] & 0xFFFF;
				if (local116 == 65535) {
					local116 = -1;
				}
				this.aClass16_Sub1_7.method3957(true, local57, local116);
				this.aClass16_Sub1_7.method3977(Static525.aClass342_3, this.aClass303_1.anInterface13_8, this.anIntArray156[local95], local109 - local102, local102 * 3, this.anIntArray162[local95]);
			}
		}
		this.method2703();
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method2689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > arg0 && arg0 < arg2 && arg0 < arg7) {
			return false;
		} else if (arg5 < arg0 && arg0 > arg2 && arg0 > arg7) {
			return false;
		} else if (arg6 > arg4 && arg3 > arg4 && arg1 > arg4) {
			return false;
		} else {
			return arg4 <= arg6 || arg4 <= arg3 || arg1 >= arg4;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V")
	private void method2690() {
		if (this.aClass72_3 != null) {
			this.aClass72_3.aBoolean196 = false;
		}
	}

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass72_3 != null) {
			this.aClass72_3.aBoolean197 = Static287.method4823(arg0, this.anInt3127);
		}
		if (this.aClass72_1 != null) {
			this.aClass72_1.aBoolean197 = Static377.method5849(this.anInt3127, arg0);
		}
		if (this.aClass72_4 != null) {
			this.aClass72_4.aBoolean197 = Static376.method5847(arg0, this.anInt3127);
		}
		if (this.aClass72_2 != null) {
			this.aClass72_2.aBoolean197 = Static322.method5333(arg0, this.anInt3127);
		}
		this.anInt3113 = arg0;
		if (this.aClass110_1 != null && (this.anInt3113 & 0x10000) == 0) {
			this.aShortArray23 = this.aClass110_1.aShortArray45;
			this.aShortArray18 = this.aClass110_1.aShortArray44;
			this.aByteArray19 = this.aClass110_1.aByteArray26;
			this.aShortArray19 = this.aClass110_1.aShortArray43;
			this.aClass110_1 = null;
		}
		this.aBoolean235 = true;
		this.method2703();
	}

	@OriginalMember(owner = "client!eea", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3104; local7++) {
			if (arg0 != 128) {
				this.anIntArray157[local7] = this.anIntArray157[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray160[local7] = this.anIntArray160[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray159[local7] = this.anIntArray159[local7] * arg2 >> 7;
			}
		}
		this.method2690();
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public void method7999(@OriginalArg(0) Class54 arg0) {
		@Pc(8) Class54_Sub3 local8 = (Class54_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass219Array1 != null) {
			for (local13 = 0; local13 < this.aClass219Array1.length; local13++) {
				@Pc(20) Class219 local20 = this.aClass219Array1[local13];
				@Pc(22) Class219 local22 = local20;
				if (local20.aClass219_2 != null) {
					local22 = local20.aClass219_2;
				}
				local22.anInt6908 = (int) ((float) this.anIntArray160[local20.anInt6898] * local8.aFloat115 + local8.aFloat117 * (float) this.anIntArray157[local20.anInt6898] + (float) this.anIntArray159[local20.anInt6898] * local8.aFloat114 + local8.aFloat123);
				local22.anInt6902 = (int) (local8.aFloat122 + local8.aFloat116 * (float) this.anIntArray160[local20.anInt6898] + local8.aFloat113 * (float) this.anIntArray157[local20.anInt6898] + (float) this.anIntArray159[local20.anInt6898] * local8.aFloat119);
				local22.anInt6900 = (int) (local8.aFloat121 + (float) this.anIntArray157[local20.anInt6898] * local8.aFloat120 + local8.aFloat124 * (float) this.anIntArray160[local20.anInt6898] + (float) this.anIntArray159[local20.anInt6898] * local8.aFloat118);
				local22.anInt6913 = (int) (local8.aFloat123 + local8.aFloat114 * (float) this.anIntArray159[local20.anInt6899] + (float) this.anIntArray157[local20.anInt6899] * local8.aFloat117 + local8.aFloat115 * (float) this.anIntArray160[local20.anInt6899]);
				local22.anInt6911 = (int) ((float) this.anIntArray159[local20.anInt6899] * local8.aFloat119 + (float) this.anIntArray160[local20.anInt6899] * local8.aFloat116 + local8.aFloat113 * (float) this.anIntArray157[local20.anInt6899] + local8.aFloat122);
				local22.anInt6916 = (int) (local8.aFloat121 + local8.aFloat118 * (float) this.anIntArray159[local20.anInt6899] + local8.aFloat124 * (float) this.anIntArray160[local20.anInt6899] + (float) this.anIntArray157[local20.anInt6899] * local8.aFloat120);
				local22.anInt6904 = (int) (local8.aFloat114 * (float) this.anIntArray159[local20.anInt6906] + (float) this.anIntArray160[local20.anInt6906] * local8.aFloat115 + local8.aFloat117 * (float) this.anIntArray157[local20.anInt6906] + local8.aFloat123);
				local22.anInt6903 = (int) (local8.aFloat122 + (float) this.anIntArray160[local20.anInt6906] * local8.aFloat116 + (float) this.anIntArray157[local20.anInt6906] * local8.aFloat113 + (float) this.anIntArray159[local20.anInt6906] * local8.aFloat119);
				local22.anInt6905 = (int) ((float) this.anIntArray160[local20.anInt6906] * local8.aFloat124 + local8.aFloat120 * (float) this.anIntArray157[local20.anInt6906] + local8.aFloat118 * (float) this.anIntArray159[local20.anInt6906] + local8.aFloat121);
			}
		}
		if (this.aClass238Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass238Array1.length; local13++) {
			@Pc(361) Class238 local361 = this.aClass238Array1[local13];
			@Pc(363) Class238 local363 = local361;
			if (local361.aClass238_1 != null) {
				local363 = local361.aClass238_1;
			}
			if (local361.aClass54_8 == null) {
				local361.aClass54_8 = local8.method5133();
			} else {
				local361.aClass54_8.method5137(local8);
			}
			local363.anInt7656 = (int) ((float) this.anIntArray159[local361.anInt7661] * local8.aFloat114 + local8.aFloat117 * (float) this.anIntArray157[local361.anInt7661] + (float) this.anIntArray160[local361.anInt7661] * local8.aFloat115 + local8.aFloat123);
			local363.anInt7662 = (int) ((float) this.anIntArray159[local361.anInt7661] * local8.aFloat119 + local8.aFloat116 * (float) this.anIntArray160[local361.anInt7661] + (float) this.anIntArray157[local361.anInt7661] * local8.aFloat113 + local8.aFloat122);
			local363.anInt7657 = (int) (local8.aFloat120 * (float) this.anIntArray157[local361.anInt7661] + local8.aFloat124 * (float) this.anIntArray160[local361.anInt7661] + local8.aFloat118 * (float) this.anIntArray159[local361.anInt7661] + local8.aFloat121);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class344.anIntArray579[arg0];
		@Pc(13) int local13 = Class344.anIntArray578[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3104; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray157[local15] + local9 * this.anIntArray159[local15] >> 14;
			this.anIntArray159[local15] = this.anIntArray159[local15] * local13 - this.anIntArray157[local15] * local9 >> 14;
			this.anIntArray157[local15] = local33;
		}
		this.method2690();
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZILclient!eea;ILclient!eea;Z)Lclient!ka;")
	private Class83 method2691(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class83_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class83_Sub1 arg3, @OriginalArg(5) boolean arg4) {
		arg1.aShort31 = this.aShort31;
		arg1.anInt3090 = this.anInt3090;
		arg1.anInt3113 = arg2;
		arg1.anInt3104 = this.anInt3104;
		arg1.anInt3109 = this.anInt3109;
		arg1.aShort32 = this.aShort32;
		arg1.anInt3095 = this.anInt3095;
		arg1.anInt3100 = this.anInt3100;
		if ((arg2 & 0x100) == 0) {
			arg1.aBoolean237 = this.aBoolean237;
		} else {
			arg1.aBoolean237 = true;
		}
		arg1.anInt3118 = this.anInt3118;
		arg1.anInt3127 = this.anInt3127;
		arg1.aBoolean236 = this.aBoolean236;
		@Pc(70) boolean local70 = Static531.method7496(this.anInt3127, arg2);
		@Pc(76) boolean local76 = Static639.method8603(arg2, this.anInt3127);
		@Pc(82) boolean local82 = Static430.method6706(this.anInt3127, arg2);
		@Pc(88) boolean local88 = local70 | local76 | local82;
		@Pc(207) int local207;
		if (local88) {
			if (!local70) {
				arg1.anIntArray157 = this.anIntArray157;
			} else if (arg3.anIntArray157 == null || this.anInt3118 > arg3.anIntArray157.length) {
				arg1.anIntArray157 = arg3.anIntArray157 = new int[this.anInt3118];
			} else {
				arg1.anIntArray157 = arg3.anIntArray157;
			}
			if (!local76) {
				arg1.anIntArray160 = this.anIntArray160;
			} else if (arg3.anIntArray160 == null || this.anInt3118 > arg3.anIntArray160.length) {
				arg1.anIntArray160 = arg3.anIntArray160 = new int[this.anInt3118];
			} else {
				arg1.anIntArray160 = arg3.anIntArray160;
			}
			if (!local82) {
				arg1.anIntArray159 = this.anIntArray159;
			} else if (arg3.anIntArray159 == null || this.anInt3118 > arg3.anIntArray159.length) {
				arg1.anIntArray159 = arg3.anIntArray159 = new int[this.anInt3118];
			} else {
				arg1.anIntArray159 = arg3.anIntArray159;
			}
			for (local207 = 0; local207 < this.anInt3118; local207++) {
				if (local70) {
					arg1.anIntArray157[local207] = this.anIntArray157[local207];
				}
				if (local76) {
					arg1.anIntArray160[local207] = this.anIntArray160[local207];
				}
				if (local82) {
					arg1.anIntArray159[local207] = this.anIntArray159[local207];
				}
			}
		} else {
			arg1.anIntArray160 = this.anIntArray160;
			arg1.anIntArray159 = this.anIntArray159;
			arg1.anIntArray157 = this.anIntArray157;
		}
		if (Static287.method4823(arg2, this.anInt3127)) {
			arg1.aClass72_3 = arg3.aClass72_3;
			arg1.aClass72_3.anInterface4_12 = this.aClass72_3.anInterface4_12;
			arg1.aClass72_3.aBoolean197 = true;
			arg1.aClass72_3.aBoolean196 = this.aClass72_3.aBoolean196;
		} else if (Static215.method4063(arg2, this.anInt3127)) {
			arg1.aClass72_3 = this.aClass72_3;
		} else {
			arg1.aClass72_3 = null;
		}
		if (Static33.method1193(arg2, this.anInt3127)) {
			if (arg3.aShortArray24 == null || this.anInt3090 > arg3.aShortArray24.length) {
				arg1.aShortArray24 = arg3.aShortArray24 = new short[this.anInt3090];
			} else {
				arg1.aShortArray24 = arg3.aShortArray24;
			}
			for (local207 = 0; local207 < this.anInt3090; local207++) {
				arg1.aShortArray24[local207] = this.aShortArray24[local207];
			}
		} else {
			arg1.aShortArray24 = this.aShortArray24;
		}
		if (Static46.method1368(this.anInt3127, arg2)) {
			if (arg3.aByteArray18 == null || this.anInt3090 > arg3.aByteArray18.length) {
				arg1.aByteArray18 = arg3.aByteArray18 = new byte[this.anInt3090];
			} else {
				arg1.aByteArray18 = arg3.aByteArray18;
			}
			for (local207 = 0; local207 < this.anInt3090; local207++) {
				arg1.aByteArray18[local207] = this.aByteArray18[local207];
			}
		} else {
			arg1.aByteArray18 = this.aByteArray18;
		}
		if (Static376.method5847(arg2, this.anInt3127)) {
			arg1.aClass72_4 = arg3.aClass72_4;
			arg1.aClass72_4.aBoolean196 = this.aClass72_4.aBoolean196;
			arg1.aClass72_4.aBoolean197 = true;
			arg1.aClass72_4.anInterface4_12 = this.aClass72_4.anInterface4_12;
		} else if (Static536.method7560(arg2, this.anInt3127)) {
			arg1.aClass72_4 = this.aClass72_4;
		} else {
			arg1.aClass72_4 = null;
		}
		@Pc(566) int local566;
		if (Static271.method4662(arg2, this.anInt3127)) {
			if (arg3.aShortArray23 == null || this.anInt3095 > arg3.aShortArray23.length) {
				local207 = this.anInt3095;
				arg1.aShortArray18 = arg3.aShortArray18 = new short[local207];
				arg1.aShortArray23 = arg3.aShortArray23 = new short[local207];
				arg1.aShortArray19 = arg3.aShortArray19 = new short[local207];
			} else {
				arg1.aShortArray19 = arg3.aShortArray19;
				arg1.aShortArray18 = arg3.aShortArray18;
				arg1.aShortArray23 = arg3.aShortArray23;
			}
			if (this.aClass110_1 == null) {
				arg1.aClass110_1 = null;
				for (local207 = 0; local207 < this.anInt3095; local207++) {
					arg1.aShortArray23[local207] = this.aShortArray23[local207];
					arg1.aShortArray19[local207] = this.aShortArray19[local207];
					arg1.aShortArray18[local207] = this.aShortArray18[local207];
				}
			} else {
				if (arg3.aClass110_1 == null) {
					arg3.aClass110_1 = new Class110();
				}
				@Pc(554) Class110 local554 = arg1.aClass110_1 = arg3.aClass110_1;
				if (local554.aShortArray45 == null || this.anInt3095 > local554.aShortArray45.length) {
					local566 = this.anInt3095;
					local554.aByteArray26 = new byte[local566];
					local554.aShortArray45 = new short[local566];
					local554.aShortArray43 = new short[local566];
					local554.aShortArray44 = new short[local566];
				}
				for (local566 = 0; local566 < this.anInt3095; local566++) {
					arg1.aShortArray23[local566] = this.aShortArray23[local566];
					arg1.aShortArray19[local566] = this.aShortArray19[local566];
					arg1.aShortArray18[local566] = this.aShortArray18[local566];
					local554.aShortArray45[local566] = this.aClass110_1.aShortArray45[local566];
					local554.aShortArray43[local566] = this.aClass110_1.aShortArray43[local566];
					local554.aShortArray44[local566] = this.aClass110_1.aShortArray44[local566];
					local554.aByteArray26[local566] = this.aClass110_1.aByteArray26[local566];
				}
			}
			arg1.aByteArray19 = this.aByteArray19;
		} else {
			arg1.aClass110_1 = this.aClass110_1;
			arg1.aShortArray18 = this.aShortArray18;
			arg1.aShortArray19 = this.aShortArray19;
			arg1.aShortArray23 = this.aShortArray23;
			arg1.aByteArray19 = this.aByteArray19;
		}
		if (Static322.method5333(arg2, this.anInt3127)) {
			arg1.aClass72_2 = arg3.aClass72_2;
			arg1.aClass72_2.anInterface4_12 = this.aClass72_2.anInterface4_12;
			arg1.aClass72_2.aBoolean196 = this.aClass72_2.aBoolean196;
			arg1.aClass72_2.aBoolean197 = true;
		} else if (Static589.method8153(arg2, this.anInt3127)) {
			arg1.aClass72_2 = this.aClass72_2;
		} else {
			arg1.aClass72_2 = null;
		}
		if (Static436.method6739(arg2, this.anInt3127)) {
			if (arg3.aFloatArray38 == null || arg3.aFloatArray38.length < this.anInt3090) {
				local207 = this.anInt3095;
				arg1.aFloatArray39 = arg3.aFloatArray39 = new float[local207];
				arg1.aFloatArray38 = arg3.aFloatArray38 = new float[local207];
			} else {
				arg1.aFloatArray39 = arg3.aFloatArray39;
				arg1.aFloatArray38 = arg3.aFloatArray38;
			}
			for (local207 = 0; local207 < this.anInt3095; local207++) {
				arg1.aFloatArray38[local207] = this.aFloatArray38[local207];
				arg1.aFloatArray39[local207] = this.aFloatArray39[local207];
			}
		} else {
			arg1.aFloatArray39 = this.aFloatArray39;
			arg1.aFloatArray38 = this.aFloatArray38;
		}
		if (Static377.method5849(this.anInt3127, arg2)) {
			arg1.aClass72_1 = arg3.aClass72_1;
			arg1.aClass72_1.aBoolean196 = this.aClass72_1.aBoolean196;
			arg1.aClass72_1.anInterface4_12 = this.aClass72_1.anInterface4_12;
			arg1.aClass72_1.aBoolean197 = true;
		} else if (Static605.method7725(this.anInt3127, arg2)) {
			arg1.aClass72_1 = this.aClass72_1;
		} else {
			arg1.aClass72_1 = null;
		}
		if (Static304.method4968(this.anInt3127, arg2)) {
			if (arg3.aShortArray16 == null || this.anInt3090 > arg3.aShortArray16.length) {
				local207 = this.anInt3090;
				arg1.aShortArray16 = arg3.aShortArray16 = new short[local207];
				arg1.aShortArray17 = arg3.aShortArray17 = new short[local207];
				arg1.aShortArray25 = arg3.aShortArray25 = new short[local207];
			} else {
				arg1.aShortArray16 = arg3.aShortArray16;
				arg1.aShortArray17 = arg3.aShortArray17;
				arg1.aShortArray25 = arg3.aShortArray25;
			}
			for (local207 = 0; local207 < this.anInt3090; local207++) {
				arg1.aShortArray16[local207] = this.aShortArray16[local207];
				arg1.aShortArray17[local207] = this.aShortArray17[local207];
				arg1.aShortArray25[local207] = this.aShortArray25[local207];
			}
		} else {
			arg1.aShortArray17 = this.aShortArray17;
			arg1.aShortArray16 = this.aShortArray16;
			arg1.aShortArray25 = this.aShortArray25;
		}
		if (Static108.method2411(arg2, this.anInt3127)) {
			arg1.aClass303_1 = arg3.aClass303_1;
			arg1.aClass303_1.aBoolean638 = this.aClass303_1.aBoolean638;
			arg1.aClass303_1.aBoolean637 = true;
			arg1.aClass303_1.anInterface13_8 = this.aClass303_1.anInterface13_8;
		} else if (Static71.method1822(this.anInt3127, arg2)) {
			arg1.aClass303_1 = this.aClass303_1;
		} else {
			arg1.aClass303_1 = null;
		}
		if (Static371.method5820(arg2, this.anInt3127)) {
			if (arg3.aShortArray15 == null || this.anInt3090 > arg3.aShortArray15.length) {
				local207 = this.anInt3090;
				arg1.aShortArray15 = arg3.aShortArray15 = new short[local207];
			} else {
				arg1.aShortArray15 = arg3.aShortArray15;
			}
			for (local207 = 0; local207 < this.anInt3090; local207++) {
				arg1.aShortArray15[local207] = this.aShortArray15[local207];
			}
		} else {
			arg1.aShortArray15 = this.aShortArray15;
		}
		if (!Static616.method8363(this.anInt3127, arg2)) {
			arg1.aClass241Array1 = this.aClass241Array1;
		} else if (arg3.aClass241Array1 == null || this.anInt3109 > arg3.aClass241Array1.length) {
			local207 = this.anInt3109;
			arg1.aClass241Array1 = arg3.aClass241Array1 = new Class241[local207];
			for (local566 = 0; local566 < this.anInt3109; local566++) {
				arg1.aClass241Array1[local566] = this.aClass241Array1[local566].method6408();
			}
		} else {
			arg1.aClass241Array1 = arg3.aClass241Array1;
			for (local207 = 0; local207 < this.anInt3109; local207++) {
				arg1.aClass241Array1[local207].method6411(this.aClass241Array1[local207]);
			}
		}
		arg1.aClass145Array1 = this.aClass145Array1;
		arg1.aShortArray13 = this.aShortArray13;
		if (this.aBoolean234) {
			arg1.anInt3151 = this.anInt3151;
			arg1.anInt3076 = this.anInt3076;
			arg1.anInt3098 = this.anInt3098;
			arg1.anInt3087 = this.anInt3087;
			arg1.anInt3142 = this.anInt3142;
			arg1.anInt3137 = this.anInt3137;
			arg1.aBoolean234 = true;
			arg1.anInt3102 = this.anInt3102;
			arg1.anInt3097 = this.anInt3097;
		} else {
			arg1.aBoolean234 = false;
		}
		arg1.anIntArray158 = this.anIntArray158;
		arg1.aShortArray20 = this.aShortArray20;
		arg1.anIntArray161 = this.anIntArray161;
		arg1.aShortArray14 = this.aShortArray14;
		arg1.anIntArray162 = this.anIntArray162;
		arg1.anIntArrayArray10 = this.anIntArrayArray10;
		arg1.aClass238Array1 = this.aClass238Array1;
		arg1.aClass219Array1 = this.aClass219Array1;
		arg1.anIntArrayArray9 = this.anIntArrayArray9;
		arg1.anIntArray156 = this.anIntArray156;
		arg1.aShortArray22 = this.aShortArray22;
		arg1.lb = this.lb;
		arg1.aShortArray21 = this.aShortArray21;
		return arg1;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(B)V")
	private void method2692() {
		if (this.aClass303_1 != null) {
			this.aClass303_1.aBoolean638 = false;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!dfa;IZ)V")
	@Override
	public void method7996(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray20 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt3104; local14++) {
			if ((arg1 & this.aShortArray20[local14]) != 0) {
				if (arg2) {
					arg0.method5129(this.anIntArray157[local14], this.anIntArray160[local14], this.anIntArray159[local14], local12);
				} else {
					arg0.method5139(this.anIntArray157[local14], this.anIntArray160[local14], this.anIntArray159[local14], local12);
				}
				this.anIntArray157[local14] = local12[0];
				this.anIntArray160[local14] = local12[1];
				this.anIntArray159[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass16_Sub1_7.anInterface2_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3090; local11++) {
			if (arg0 == this.aShortArray15[local11]) {
				this.aShortArray15[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class218 local43 = local9.method4027(arg0 & 0xFFFF);
			local31 = local43.aByte63;
			local33 = local43.aByte68;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(63) Class218 local63 = local9.method4027(arg1 & 0xFFFF);
			if (local63.aByte67 != 0 || local63.aByte64 != 0) {
				this.aBoolean236 = true;
			}
			local53 = local63.aByte68;
			local51 = local63.aByte63;
		}
		if (!(local31 != local51 | local33 != local53)) {
			return;
		}
		if (this.aClass145Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt3109; local97++) {
				@Pc(104) Class145 local104 = this.aClass145Array1[local97];
				@Pc(109) Class241 local109 = this.aClass241Array1[local97];
				local109.anInt7718 = Static77.anIntArray92[this.aShortArray24[local104.anInt5188] & 0xFFFF] & 0xFFFFFF | local109.anInt7718 & 0xFF000000;
			}
		}
		this.method2695();
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8014(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			Static62.anInt1969 = 0;
			Static98.anInt2630 = 0;
			local31 = 0;
			Static568.anInt9762 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray9.length > local41) {
					local51 = this.anIntArrayArray9[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static568.anInt9762 += this.anIntArray157[local59];
						Static62.anInt1969 += this.anIntArray160[local59];
						local31++;
						Static98.anInt2630 += this.anIntArray159[local59];
					}
				}
			}
			if (local31 <= 0) {
				Static98.anInt2630 = local25;
				Static62.anInt1969 = local21;
				Static568.anInt9762 = local17;
			} else {
				Static62.anInt1969 = Static62.anInt1969 / local31 + local21;
				Static568.anInt9762 = local17 + Static568.anInt9762 / local31;
				Static98.anInt2630 = local25 + Static98.anInt2630 / local31;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray9.length) {
					local162 = this.anIntArrayArray9[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local53 = local162[local164];
						this.anIntArray157[local53] += local17;
						this.anIntArray160[local53] += local21;
						this.anIntArray159[local53] += local25;
					}
				}
			}
			return;
		}
		@Pc(287) int local287;
		@Pc(305) int local305;
		@Pc(762) int local762;
		@Pc(771) int local771;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray9.length) {
					local162 = this.anIntArrayArray9[local35];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local53 = local162[local164];
							this.anIntArray157[local53] -= Static568.anInt9762;
							this.anIntArray160[local53] -= Static62.anInt1969;
							this.anIntArray159[local53] -= Static98.anInt2630;
							if (arg4 != 0) {
								local59 = Class344.anIntArray579[arg4];
								local287 = Class344.anIntArray578[arg4];
								local305 = this.anIntArray157[local53] * local287 + this.anIntArray160[local53] * local59 + 16383 >> 14;
								this.anIntArray160[local53] = this.anIntArray160[local53] * local287 + 16383 - local59 * this.anIntArray157[local53] >> 14;
								this.anIntArray157[local53] = local305;
							}
							if (arg2 != 0) {
								local59 = Class344.anIntArray579[arg2];
								local287 = Class344.anIntArray578[arg2];
								local305 = this.anIntArray160[local53] * local287 + 16383 - local59 * this.anIntArray159[local53] >> 14;
								this.anIntArray159[local53] = local287 * this.anIntArray159[local53] + local59 * this.anIntArray160[local53] + 16383 >> 14;
								this.anIntArray160[local53] = local305;
							}
							if (arg3 != 0) {
								local59 = Class344.anIntArray579[arg3];
								local287 = Class344.anIntArray578[arg3];
								local305 = local287 * this.anIntArray157[local53] + this.anIntArray159[local53] * local59 + 16383 >> 14;
								this.anIntArray159[local53] = local287 * this.anIntArray159[local53] + 16383 - local59 * this.anIntArray157[local53] >> 14;
								this.anIntArray157[local53] = local305;
							}
							this.anIntArray157[local53] += Static568.anInt9762;
							this.anIntArray160[local53] += Static62.anInt1969;
							this.anIntArray159[local53] += Static98.anInt2630;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local53 = local162[local164];
							this.anIntArray157[local53] -= Static568.anInt9762;
							this.anIntArray160[local53] -= Static62.anInt1969;
							this.anIntArray159[local53] -= Static98.anInt2630;
							if (arg2 != 0) {
								local59 = Class344.anIntArray579[arg2];
								local287 = Class344.anIntArray578[arg2];
								local305 = this.anIntArray160[local53] * local287 + 16383 - local59 * this.anIntArray159[local53] >> 14;
								this.anIntArray159[local53] = this.anIntArray159[local53] * local287 + local59 * this.anIntArray160[local53] + 16383 >> 14;
								this.anIntArray160[local53] = local305;
							}
							if (arg4 != 0) {
								local59 = Class344.anIntArray579[arg4];
								local287 = Class344.anIntArray578[arg4];
								local305 = local287 * this.anIntArray157[local53] + this.anIntArray160[local53] * local59 + 16383 >> 14;
								this.anIntArray160[local53] = local287 * this.anIntArray160[local53] + 16383 - local59 * this.anIntArray157[local53] >> 14;
								this.anIntArray157[local53] = local305;
							}
							if (arg3 != 0) {
								local59 = Class344.anIntArray579[arg3];
								local287 = Class344.anIntArray578[arg3];
								local305 = local59 * this.anIntArray159[local53] + local287 * this.anIntArray157[local53] + 16383 >> 14;
								this.anIntArray159[local53] = local287 * this.anIntArray159[local53] + 16383 - local59 * this.anIntArray157[local53] >> 14;
								this.anIntArray157[local53] = local305;
							}
							this.anIntArray157[local53] += Static568.anInt9762;
							this.anIntArray160[local53] += Static62.anInt1969;
							this.anIntArray159[local53] += Static98.anInt2630;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray9.length) {
						local51 = this.anIntArrayArray9[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local287 = this.anIntArray158[local59];
							local305 = this.anIntArray158[local59 + 1];
							for (local762 = local287; local762 < local305; local762++) {
								local771 = this.aShortArray21[local762] - 1;
								if (local771 == -1) {
									break;
								}
								@Pc(783) int local783;
								@Pc(787) int local787;
								@Pc(805) int local805;
								if (arg4 != 0) {
									local783 = Class344.anIntArray579[arg4];
									local787 = Class344.anIntArray578[arg4];
									local805 = local787 * this.aShortArray23[local771] + this.aShortArray19[local771] * local783 + 16383 >> 14;
									this.aShortArray19[local771] = (short) (this.aShortArray19[local771] * local787 + 16383 - local783 * this.aShortArray23[local771] >> 14);
									this.aShortArray23[local771] = (short) local805;
								}
								if (arg2 != 0) {
									local783 = Class344.anIntArray579[arg2];
									local787 = Class344.anIntArray578[arg2];
									local805 = this.aShortArray19[local771] * local787 + 16383 - local783 * this.aShortArray18[local771] >> 14;
									this.aShortArray18[local771] = (short) (local787 * this.aShortArray18[local771] + this.aShortArray19[local771] * local783 + 16383 >> 14);
									this.aShortArray19[local771] = (short) local805;
								}
								if (arg3 != 0) {
									local783 = Class344.anIntArray579[arg3];
									local787 = Class344.anIntArray578[arg3];
									local805 = this.aShortArray18[local771] * local783 + this.aShortArray23[local771] * local787 + 16383 >> 14;
									this.aShortArray18[local771] = (short) (local787 * this.aShortArray18[local771] + 16383 - local783 * this.aShortArray23[local771] >> 14);
									this.aShortArray23[local771] = (short) local805;
								}
							}
						}
					}
				}
				this.method2697();
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray9.length) {
					local162 = this.anIntArrayArray9[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local53 = local162[local164];
						this.anIntArray157[local53] -= Static568.anInt9762;
						this.anIntArray160[local53] -= Static62.anInt1969;
						this.anIntArray159[local53] -= Static98.anInt2630;
						this.anIntArray157[local53] = this.anIntArray157[local53] * arg2 >> 7;
						this.anIntArray160[local53] = arg3 * this.anIntArray160[local53] >> 7;
						this.anIntArray159[local53] = arg4 * this.anIntArray159[local53] >> 7;
						this.anIntArray157[local53] += Static568.anInt9762;
						this.anIntArray160[local53] += Static62.anInt1969;
						this.anIntArray159[local53] += Static98.anInt2630;
					}
				}
			}
		} else {
			@Pc(1231) Class241 local1231;
			@Pc(1120) boolean local1120;
			@Pc(1226) Class145 local1226;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local1120 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray10.length) {
							local51 = this.anIntArrayArray10[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local287 = (this.aByteArray18[local59] & 0xFF) + arg2 * 8;
								if (local287 < 0) {
									local287 = 0;
								} else if (local287 > 255) {
									local287 = 255;
								}
								this.aByteArray18[local59] = (byte) local287;
							}
							local1120 |= local51.length > 0;
						}
					}
					if (local1120) {
						if (this.aClass145Array1 != null) {
							for (local41 = 0; local41 < this.anInt3109; local41++) {
								local1226 = this.aClass145Array1[local41];
								local1231 = this.aClass241Array1[local41];
								local1231.anInt7718 = 255 - (this.aByteArray18[local1226.anInt5188] & 0xFF) << 24 | local1231.anInt7718 & 0xFFFFFF;
							}
						}
						this.method2695();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray10 != null) {
					local1120 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray10.length > local41) {
							local51 = this.anIntArrayArray10[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local287 = this.aShortArray24[local59] & 0xFFFF;
								local305 = local287 >> 10 & 0x3F;
								local762 = local287 >> 7 & 0x7;
								@Pc(1324) int local1324 = local305 + arg2 & 0x3F;
								local771 = local287 & 0x7F;
								local762 += arg3 / 4;
								if (local762 < 0) {
									local762 = 0;
								} else if (local762 > 7) {
									local762 = 7;
								}
								local771 += arg4;
								if (local771 < 0) {
									local771 = 0;
								} else if (local771 > 127) {
									local771 = 127;
								}
								this.aShortArray24[local59] = (short) (local762 << 7 | local1324 << 10 | local771);
							}
							local1120 |= local51.length > 0;
						}
					}
					if (local1120) {
						if (this.aClass145Array1 != null) {
							for (local41 = 0; local41 < this.anInt3109; local41++) {
								local1226 = this.aClass145Array1[local41];
								local1231 = this.aClass241Array1[local41];
								local1231.anInt7718 = local1231.anInt7718 & 0xFF000000 | Static77.anIntArray92[this.aShortArray24[local1226.anInt5188] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method2695();
					}
				}
			} else if (arg0 == 8) {
				if (this.lb != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.lb.length > local35) {
							local162 = this.lb[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1231 = this.aClass241Array1[local162[local164]];
								local1231.anInt7722 += arg2;
								local1231.anInt7723 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.lb != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.lb.length) {
							local162 = this.lb[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1231 = this.aClass241Array1[local162[local164]];
								local1231.anInt7719 = local1231.anInt7719 * arg2 >> 7;
								local1231.anInt7717 = arg3 * local1231.anInt7717 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.lb != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.lb.length > local35) {
						local162 = this.lb[local35];
						for (local164 = 0; local164 < local162.length; local164++) {
							local1231 = this.aClass241Array1[local162[local164]];
							local1231.anInt7715 = local1231.anInt7715 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!ru;B)V")
	private void method2693(@OriginalArg(0) Class8_Sub5_Sub11_Sub2 arg0) {
		if (this.anInt3095 > Static142.anIntArray184.length) {
			Static142.anIntArray184 = new int[this.anInt3095];
			Static5.anIntArray5 = new int[this.anInt3095];
		}
		@Pc(47) int local47;
		@Pc(85) int local85;
		@Pc(94) int local94;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3104; local20++) {
			local47 = (this.anIntArray157[local20] - (this.aClass16_Sub1_7.anInt4928 * this.anIntArray160[local20] >> 8) >> this.aClass16_Sub1_7.anInt4909) - arg0.anInt8809;
			@Pc(71) int local71 = (this.anIntArray159[local20] - (this.anIntArray160[local20] * this.aClass16_Sub1_7.anInt4902 >> 8) >> this.aClass16_Sub1_7.anInt4909) - arg0.anInt8810;
			@Pc(76) int local76 = this.anIntArray158[local20];
			@Pc(83) int local83 = this.anIntArray158[local20 + 1];
			for (local85 = local76; local85 < local83; local85++) {
				local94 = this.aShortArray21[local85] - 1;
				if (local94 == -1) {
					break;
				}
				Static142.anIntArray184[local94] = local47;
				Static5.anIntArray5[local94] = local71;
			}
		}
		for (local47 = 0; local47 < this.anInt3100; local47++) {
			if (this.aByteArray18 == null || this.aByteArray18[local47] <= 128) {
				@Pc(144) short local144 = this.aShortArray16[local47];
				@Pc(149) short local149 = this.aShortArray17[local47];
				@Pc(154) short local154 = this.aShortArray25[local47];
				local85 = Static142.anIntArray184[local144];
				local94 = Static142.anIntArray184[local149];
				@Pc(166) int local166 = Static142.anIntArray184[local154];
				@Pc(170) int local170 = Static5.anIntArray5[local144];
				@Pc(174) int local174 = Static5.anIntArray5[local149];
				@Pc(178) int local178 = Static5.anIntArray5[local154];
				if ((local174 - local178) * (local85 + -local94) - (local174 - local170) * (-local94 + local166) > 0) {
					arg0.method7267(local166, local94, local85, local174, local170, local178);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3118; local7++) {
			this.anIntArray157[local7] = this.anIntArray157[local7] + 7 >> 4;
			this.anIntArray160[local7] = this.anIntArray160[local7] + 7 >> 4;
			this.anIntArray159[local7] = this.anIntArray159[local7] + 7 >> 4;
		}
		this.method2690();
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!eea", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3090; local7++) {
			if (arg0 == this.aShortArray24[local7]) {
				this.aShortArray24[local7] = arg1;
			}
		}
		if (this.aClass145Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt3109; local38++) {
				@Pc(45) Class145 local45 = this.aClass145Array1[local38];
				@Pc(50) Class241 local50 = this.aClass241Array1[local38];
				local50.anInt7718 = Static77.anIntArray92[this.aShortArray24[local45.anInt5188] & 0xFFFF] & 0xFFFFFF | local50.anInt7718 & 0xFF000000;
			}
		}
		this.method2695();
	}

	@OriginalMember(owner = "client!eea", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class344.anIntArray579[arg0];
		@Pc(13) int local13 = Class344.anIntArray578[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3104; local15++) {
			@Pc(33) int local33 = this.anIntArray160[local15] * local13 - local9 * this.anIntArray159[local15] >> 14;
			this.anIntArray159[local15] = local13 * this.anIntArray159[local15] + local9 * this.anIntArray160[local15] >> 14;
			this.anIntArray160[local15] = local33;
		}
		this.method2690();
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!eea", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean234) {
			this.method2701();
		}
		@Pc(16) int local16 = arg4 + this.anInt3076;
		@Pc(22) int local22 = arg4 + this.anInt3142;
		@Pc(28) int local28 = arg6 + this.anInt3137;
		@Pc(33) int local33 = arg6 + this.anInt3102;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9958 + local22 >> arg2.anInt9954 >= arg2.anInt9955 || local28 < 0 || arg2.anInt9958 + local33 >> arg2.anInt9954 >= arg2.anInt9953)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9958 + local22 >> arg3.anInt9954 >= arg3.anInt9955 || local28 < 0 || arg3.anInt9953 <= local33 + arg3.anInt9958 >> arg3.anInt9954) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9954;
			local22 = local22 + arg2.anInt9958 - 1 >> arg2.anInt9954;
			local28 >>= arg2.anInt9954;
			local33 = arg2.anInt9958 + local33 - 1 >> arg2.anInt9954;
			if (arg5 == arg2.method8086(local28, local16) && arg2.method8086(local28, local22) == arg5 && arg2.method8086(local33, local16) == arg5 && arg2.method8086(local33, local22) == arg5) {
				return;
			}
		}
		@Pc(181) int local181;
		if (arg0 == 1) {
			for (local181 = 0; local181 < this.anInt3104; local181++) {
				this.anIntArray160[local181] -= arg5 - arg2.method8088(arg6 + this.anIntArray159[local181], this.anIntArray157[local181] - -arg4);
			}
		} else {
			@Pc(234) int local234;
			@Pc(245) int local245;
			if (arg0 == 2) {
				local181 = this.anInt3087;
				if (local181 == 0) {
					return;
				}
				for (local234 = 0; local234 < this.anInt3104; local234++) {
					local245 = (this.anIntArray160[local234] << 16) / local181;
					if (local245 < arg1) {
						this.anIntArray160[local234] -= -((arg2.method8088(this.anIntArray159[local234] + arg6, arg4 + this.anIntArray157[local234]) - arg5) * (arg1 - local245) / arg1);
					}
				}
			} else {
				@Pc(327) int local327;
				if (arg0 == 3) {
					local181 = (arg1 & 0xFF) * 4;
					local234 = (arg1 >> 8 & 0xFF) * 4;
					local245 = (arg1 >> 16 & 0xFF) << 6;
					local327 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local181 >> 1) < 0 || arg2.anInt9955 << arg2.anInt9954 <= arg4 + (local181 >> 1) + arg2.anInt9958 || arg6 - (local234 >> 1) < 0 || arg2.anInt9953 << arg2.anInt9954 <= arg2.anInt9958 + arg6 + (local234 >> 1)) {
						return;
					}
					this.method8001(arg4, arg6, local327, arg2, local181, local234, local245, arg5);
				} else if (arg0 == 4) {
					local181 = this.anInt3098 - this.anInt3087;
					for (local234 = 0; local234 < this.anInt3104; local234++) {
						this.anIntArray160[local234] = this.anIntArray160[local234] + arg3.method8088(arg6 + this.anIntArray159[local234], this.anIntArray157[local234] + arg4) + local181 - arg5;
					}
				} else if (arg0 == 5) {
					local181 = this.anInt3098 - this.anInt3087;
					for (local234 = 0; local234 < this.anInt3104; local234++) {
						local245 = arg4 + this.anIntArray157[local234];
						local327 = arg6 + this.anIntArray159[local234];
						@Pc(433) int local433 = arg2.method8088(local327, local245);
						@Pc(439) int local439 = arg3.method8088(local327, local245);
						@Pc(445) int local445 = local433 - local439 - arg1;
						this.anIntArray160[local234] = local433 + (local445 * ((this.anIntArray160[local234] << 8) / local181) >> 8) - arg5;
					}
				}
			}
		}
		this.method2690();
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7995(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class83_Sub1 local8 = (Class83_Sub1) arg0;
		if (this.anInt3090 == 0 || local8.anInt3090 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt3104;
		@Pc(27) int[] local27 = local8.anIntArray157;
		@Pc(30) int[] local30 = local8.anIntArray160;
		@Pc(33) int[] local33 = local8.anIntArray159;
		@Pc(36) short[] local36 = local8.aShortArray23;
		@Pc(39) short[] local39 = local8.aShortArray19;
		@Pc(42) short[] local42 = local8.aShortArray18;
		@Pc(45) byte[] local45 = local8.aByteArray19;
		@Pc(64) short[] local64;
		@Pc(52) short[] local52;
		@Pc(60) short[] local60;
		@Pc(56) byte[] local56;
		if (this.aClass110_1 == null) {
			local52 = null;
			local56 = null;
			local60 = null;
			local64 = null;
		} else {
			local52 = this.aClass110_1.aShortArray43;
			local56 = this.aClass110_1.aByteArray26;
			local60 = this.aClass110_1.aShortArray44;
			local64 = this.aClass110_1.aShortArray45;
		}
		@Pc(83) short[] local83;
		@Pc(79) short[] local79;
		@Pc(85) short[] local85;
		@Pc(81) byte[] local81;
		if (local8.aClass110_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local79 = local8.aClass110_1.aShortArray43;
			local83 = local8.aClass110_1.aShortArray45;
			local81 = local8.aClass110_1.aByteArray26;
			local85 = local8.aClass110_1.aShortArray44;
		}
		@Pc(106) int[] local106 = local8.anIntArray158;
		@Pc(109) short[] local109 = local8.aShortArray21;
		if (!local8.aBoolean234) {
			local8.method2701();
		}
		@Pc(118) int local118 = local8.anInt3087;
		@Pc(121) int local121 = local8.anInt3098;
		@Pc(124) int local124 = local8.anInt3076;
		@Pc(127) int local127 = local8.anInt3142;
		@Pc(130) int local130 = local8.anInt3137;
		@Pc(133) int local133 = local8.anInt3102;
		for (@Pc(135) int local135 = 0; local135 < this.anInt3104; local135++) {
			@Pc(144) int local144 = this.anIntArray160[local135] - arg2;
			if (local118 <= local144 && local121 >= local144) {
				@Pc(164) int local164 = this.anIntArray157[local135] - arg1;
				if (local124 <= local164 && local164 <= local127) {
					@Pc(184) int local184 = this.anIntArray159[local135] - arg3;
					if (local184 >= local130 && local184 <= local133) {
						@Pc(194) int local194 = -1;
						@Pc(199) int local199 = this.anIntArray158[local135];
						@Pc(206) int local206 = this.anIntArray158[local135 + 1];
						for (@Pc(208) int local208 = local199; local208 < local206; local208++) {
							local194 = this.aShortArray21[local208] - 1;
							if (local194 == -1 || this.aByteArray19[local194] != 0) {
								break;
							}
						}
						if (local194 != -1) {
							for (@Pc(238) int local238 = 0; local238 < local24; local238++) {
								if (local164 == local27[local238] && local184 == local33[local238] && local144 == local30[local238]) {
									local206 = local106[local238 + 1];
									local199 = local106[local238];
									@Pc(279) int local279 = -1;
									for (@Pc(281) int local281 = local199; local281 < local206; local281++) {
										local279 = local109[local281] - 1;
										if (local279 == -1 || local45[local279] != 0) {
											break;
										}
									}
									if (local279 != -1) {
										if (local64 == null) {
											this.aClass110_1 = new Class110();
											local64 = this.aClass110_1.aShortArray45 = Static292.method4864(this.aShortArray23);
											local52 = this.aClass110_1.aShortArray43 = Static292.method4864(this.aShortArray19);
											local60 = this.aClass110_1.aShortArray44 = Static292.method4864(this.aShortArray18);
											local56 = this.aClass110_1.aByteArray26 = Static202.method3730(this.aByteArray19);
										}
										if (local83 == null) {
											@Pc(358) Class110 local358 = local8.aClass110_1 = new Class110();
											local83 = local358.aShortArray45 = Static292.method4864(local36);
											local79 = local358.aShortArray43 = Static292.method4864(local39);
											local85 = local358.aShortArray44 = Static292.method4864(local42);
											local81 = local358.aByteArray26 = Static202.method3730(local45);
										}
										@Pc(391) short local391 = this.aShortArray23[local194];
										@Pc(396) short local396 = this.aShortArray19[local194];
										@Pc(401) short local401 = this.aShortArray18[local194];
										local199 = local106[local238];
										local206 = local106[local238 + 1];
										@Pc(416) byte local416 = this.aByteArray19[local194];
										@Pc(426) int local426;
										for (@Pc(418) int local418 = local199; local418 < local206; local418++) {
											local426 = local109[local418] - 1;
											if (local426 == -1) {
												break;
											}
											if (local81[local426] != 0) {
												local83[local426] += local391;
												local79[local426] += local396;
												local85[local426] += local401;
												local81[local426] += local416;
											}
										}
										local199 = this.anIntArray158[local135];
										local396 = local39[local279];
										local401 = local42[local279];
										local391 = local36[local279];
										local416 = local45[local279];
										local206 = this.anIntArray158[local135 + 1];
										for (local426 = local199; local426 < local206; local426++) {
											@Pc(509) int local509 = this.aShortArray21[local426] - 1;
											if (local509 == -1) {
												break;
											}
											if (local56[local509] != 0) {
												local64[local509] += local391;
												local52[local509] += local396;
												local60[local509] += local401;
												local56[local509] += local416;
											}
										}
										local8.method2697();
										this.method2697();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "()V")
	@Override
	protected void method8000() {
	}

	@OriginalMember(owner = "client!eea", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3104; local7++) {
			if (arg0 != 0) {
				this.anIntArray157[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray160[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray159[local7] += arg2;
			}
		}
		this.method2690();
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "(B)V")
	private void method2695() {
		if (this.aClass72_4 != null) {
			this.aClass72_4.aBoolean196 = false;
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(Z)V")
	private void method2696() {
		if (this.aClass145Array1 == null) {
			return;
		}
		this.aClass16_Sub1_7.C(!this.aBoolean237);
		this.aClass16_Sub1_7.method3966(false);
		this.aClass16_Sub1_7.method3946(1, Static190.aClass265_8);
		this.aClass16_Sub1_7.method3950(1, Static190.aClass265_8);
		for (@Pc(32) int local32 = 0; local32 < this.anInt3109; local32++) {
			@Pc(39) Class145 local39 = this.aClass145Array1[local32];
			@Pc(44) Class241 local44 = this.aClass241Array1[local32];
			if (!local39.aBoolean387 || !this.aClass16_Sub1_7.method6079()) {
				@Pc(72) float local72 = (float) (this.anIntArray157[local39.anInt5185] + this.anIntArray157[local39.anInt5181] + this.anIntArray157[local39.anInt5182]) * 0.3333333F;
				@Pc(94) float local94 = (float) (this.anIntArray160[local39.anInt5181] + this.anIntArray160[local39.anInt5182] + this.anIntArray160[local39.anInt5185]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray159[local39.anInt5181] + this.anIntArray159[local39.anInt5182] + this.anIntArray159[local39.anInt5185]) * 0.3333333F;
				@Pc(130) float local130 = Static589.aFloat194 * local72 + local94 * Static469.aFloat184 + local116 * Static240.aFloat103 + Static54.aFloat42;
				@Pc(144) float local144 = Static640.aFloat200 + Static443.aFloat180 * local116 + local72 * Static354.aFloat131 + Static453.aFloat182 * local94;
				@Pc(158) float local158 = local94 * Static387.aFloat172 + Static305.aFloat112 * local72 + local116 * Static249.aFloat104 + Static629.aFloat199;
				@Pc(179) float local179 = (float) (1.0D / Math.sqrt((double) (local158 * local158 + local130 * local130 + local144 * local144))) * (float) local39.anInt5186;
				@Pc(184) Class54_Sub3 local184 = this.aClass16_Sub1_7.method3945();
				local184.method5151(local44.anInt7715, local144 + (float) local44.anInt7723 - local144 * local179, local158 - local158 * local179, local39.aShort57 * local44.anInt7719 >> 7, local130 + (float) local44.anInt7722 - local130 * local179, local44.anInt7717 * local39.aShort55 >> 7);
				local184.method5155(this.aClass16_Sub1_7.aClass54_Sub3_17);
				this.aClass16_Sub1_7.method3986();
				@Pc(240) int local240 = local44.anInt7718;
				this.aClass16_Sub1_7.method3957(false, false, local39.aShort56);
				this.aClass16_Sub1_7.method3956(local39.aByte55);
				this.aClass16_Sub1_7.method3939(local240);
				this.aClass16_Sub1_7.method3961();
			}
		}
		this.aClass16_Sub1_7.method3950(1, Static613.aClass265_9);
		this.aClass16_Sub1_7.method3946(1, Static613.aClass265_9);
		this.aClass16_Sub1_7.C(true);
	}

	@OriginalMember(owner = "client!eea", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort31;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(I)V")
	private void method2697() {
		if ((this.anInt3127 & 0x37) == 0) {
			if (this.aClass72_4 != null) {
				this.aClass72_4.aBoolean196 = false;
			}
		} else if (this.aClass72_2 != null) {
			this.aClass72_2.aBoolean196 = false;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!dfa;IZIIII)Z")
	private boolean method2698(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class54_Sub3 local8 = (Class54_Sub3) arg0;
		@Pc(12) Class54_Sub3 local12 = this.aClass16_Sub1_7.aClass54_Sub3_16;
		@Pc(33) float local33 = local12.aFloat123 + local8.aFloat121 * local12.aFloat114 + local12.aFloat115 * local8.aFloat122 + local8.aFloat123 * local12.aFloat117;
		@Pc(54) float local54 = local12.aFloat122 + local12.aFloat116 * local8.aFloat122 + local8.aFloat123 * local12.aFloat113 + local12.aFloat119 * local8.aFloat121;
		Static589.aFloat194 = local12.aFloat117 * local8.aFloat117 + local12.aFloat115 * local8.aFloat113 + local12.aFloat114 * local8.aFloat120;
		Static443.aFloat180 = local12.aFloat113 * local8.aFloat114 + local8.aFloat119 * local12.aFloat116 + local8.aFloat118 * local12.aFloat119;
		@Pc(111) float local111 = local8.aFloat122 * local12.aFloat124 + local8.aFloat123 * local12.aFloat120 + local8.aFloat121 * local12.aFloat118 + local12.aFloat121;
		Static305.aFloat112 = local8.aFloat117 * local12.aFloat120 + local8.aFloat113 * local12.aFloat124 + local8.aFloat120 * local12.aFloat118;
		Static354.aFloat131 = local8.aFloat120 * local12.aFloat119 + local12.aFloat113 * local8.aFloat117 + local12.aFloat116 * local8.aFloat113;
		Static249.aFloat104 = local8.aFloat118 * local12.aFloat118 + local12.aFloat120 * local8.aFloat114 + local8.aFloat119 * local12.aFloat124;
		Static240.aFloat103 = local8.aFloat118 * local12.aFloat114 + local8.aFloat114 * local12.aFloat117 + local12.aFloat115 * local8.aFloat119;
		Static453.aFloat182 = local12.aFloat116 * local8.aFloat116 + local12.aFloat113 * local8.aFloat115 + local8.aFloat124 * local12.aFloat119;
		Static469.aFloat184 = local8.aFloat124 * local12.aFloat114 + local12.aFloat115 * local8.aFloat116 + local12.aFloat117 * local8.aFloat115;
		Static387.aFloat172 = local12.aFloat124 * local8.aFloat116 + local12.aFloat120 * local8.aFloat115 + local12.aFloat118 * local8.aFloat124;
		@Pc(239) boolean local239 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass16_Sub1_7.anInt4918;
		@Pc(261) int local261 = this.aClass16_Sub1_7.anInt4914;
		if (!this.aBoolean234) {
			this.method2701();
		}
		@Pc(275) int local275 = this.anInt3142 - this.anInt3076 >> 1;
		@Pc(284) int local284 = this.anInt3098 - this.anInt3087 >> 1;
		@Pc(293) int local293 = this.anInt3102 - this.anInt3137 >> 1;
		@Pc(298) int local298 = this.anInt3076 + local275;
		@Pc(304) int local304 = this.anInt3087 + local284;
		@Pc(310) int local310 = this.anInt3137 + local293;
		@Pc(316) int local316 = local298 - (local275 << arg1);
		@Pc(323) int local323 = local304 - (local284 << arg1);
		@Pc(330) int local330 = local310 - (local293 << arg1);
		@Pc(337) int local337 = local298 + (local275 << arg1);
		@Pc(343) int local343 = (local284 << arg1) + local304;
		@Pc(349) int local349 = (local293 << arg1) + local310;
		Static22.anIntArray26[0] = local316;
		Static204.anIntArray258[0] = local323;
		Static278.anIntArray336[0] = local330;
		Static22.anIntArray26[1] = local337;
		Static204.anIntArray258[1] = local323;
		Static278.anIntArray336[1] = local330;
		Static22.anIntArray26[2] = local316;
		Static204.anIntArray258[2] = local343;
		Static22.anIntArray26[3] = local337;
		Static278.anIntArray336[2] = local330;
		Static204.anIntArray258[3] = local343;
		Static22.anIntArray26[4] = local316;
		Static278.anIntArray336[3] = local330;
		Static204.anIntArray258[4] = local323;
		Static22.anIntArray26[5] = local337;
		Static278.anIntArray336[4] = local349;
		Static204.anIntArray258[5] = local323;
		Static278.anIntArray336[5] = local349;
		Static22.anIntArray26[6] = local316;
		Static204.anIntArray258[6] = local343;
		Static22.anIntArray26[7] = local337;
		Static278.anIntArray336[6] = local349;
		Static204.anIntArray258[7] = local343;
		Static278.anIntArray336[7] = local349;
		@Pc(478) float local478;
		@Pc(492) float local492;
		@Pc(506) float local506;
		@Pc(459) float local459;
		@Pc(464) float local464;
		@Pc(454) float local454;
		for (@Pc(447) int local447 = 0; local447 < 8; local447++) {
			local454 = Static278.anIntArray336[local447];
			local459 = Static22.anIntArray26[local447];
			local464 = Static204.anIntArray258[local447];
			local478 = Static240.aFloat103 * local454 + local464 * Static469.aFloat184 + local459 * Static589.aFloat194 + local33;
			local492 = Static354.aFloat131 * local459 + local464 * Static453.aFloat182 + local454 * Static443.aFloat180 + local54;
			local506 = local111 + local454 * Static249.aFloat104 + Static305.aFloat112 * local459 + local464 * Static387.aFloat172;
			if (local506 >= (float) this.aClass16_Sub1_7.anInt4931) {
				if (arg4 > 0) {
					local506 = arg4;
				}
				@Pc(530) float local530 = (float) this.aClass16_Sub1_7.anInt4917 + local478 * (float) local257 / local506;
				if (local530 < local247) {
					local247 = local530;
				}
				if (local249 < local530) {
					local249 = local530;
				}
				@Pc(554) float local554 = (float) local261 * local492 / local506 + (float) this.aClass16_Sub1_7.anInt4920;
				if (local554 < local251) {
					local251 = local554;
				}
				if (local253 < local554) {
					local253 = local554;
				}
				local239 = true;
			}
		}
		if (local239 && local247 < (float) arg3 && (float) arg3 < local249 && (float) arg5 > local251 && (float) arg5 < local253) {
			if (arg2) {
				return true;
			}
			if (Static142.anIntArray184.length < this.anInt3095) {
				Static5.anIntArray5 = new int[this.anInt3095];
				Static142.anIntArray184 = new int[this.anInt3095];
			}
			@Pc(691) int local691;
			for (@Pc(617) int local617 = 0; local617 < this.anInt3104; local617++) {
				local459 = this.anIntArray157[local617];
				local464 = this.anIntArray160[local617];
				local454 = this.anIntArray159[local617];
				local506 = Static249.aFloat104 * local454 + Static305.aFloat112 * local459 + local464 * Static387.aFloat172 + local111;
				local478 = Static240.aFloat103 * local454 + local464 * Static469.aFloat184 + local459 * Static589.aFloat194 + local33;
				local492 = local54 + Static453.aFloat182 * local464 + Static354.aFloat131 * local459 + Static443.aFloat180 * local454;
				@Pc(698) int local698;
				@Pc(700) int local700;
				@Pc(709) int local709;
				if (local506 >= (float) this.aClass16_Sub1_7.anInt4931) {
					if (arg4 > 0) {
						local506 = arg4;
					}
					local691 = (int) ((float) this.aClass16_Sub1_7.anInt4917 + (float) local257 * local478 / local506);
					local698 = (int) ((float) local261 * local492 / local506 + (float) this.aClass16_Sub1_7.anInt4920);
					local700 = this.anIntArray158[local617];
					local709 = this.anIntArray158[local617 + 1];
					for (@Pc(780) int local780 = local700; local780 < local709; local780++) {
						@Pc(789) int local789 = this.aShortArray21[local780] - 1;
						if (local789 == -1) {
							break;
						}
						Static142.anIntArray184[local789] = local691;
						Static5.anIntArray5[local789] = local698;
					}
				} else {
					local691 = this.anIntArray158[local617];
					local698 = this.anIntArray158[local617 + 1];
					for (local700 = local691; local700 < local698; local700++) {
						local709 = this.aShortArray21[local700] - 1;
						if (local709 == -1) {
							break;
						}
						Static142.anIntArray184[this.aShortArray21[local700] - 1] = -999999;
					}
				}
			}
			for (local691 = 0; local691 < this.anInt3090; local691++) {
				if (Static142.anIntArray184[this.aShortArray16[local691]] != -999999 && Static142.anIntArray184[this.aShortArray17[local691]] != -999999 && Static142.anIntArray184[this.aShortArray25[local691]] != -999999 && this.method2689(arg5, Static142.anIntArray184[this.aShortArray25[local691]], Static5.anIntArray5[this.aShortArray17[local691]], Static142.anIntArray184[this.aShortArray17[local691]], arg3, Static5.anIntArray5[this.aShortArray16[local691]], Static142.anIntArray184[this.aShortArray16[local691]], Static5.anIntArray5[this.aShortArray25[local691]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "()V")
	@Override
	protected void method8011() {
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(JIZIIIILclient!uk;FIF)S")
	private short method2699(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class344 arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray158[arg1];
		@Pc(17) int local17 = this.anIntArray158[arg1 + 1];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = local10; local26 < local17; local26++) {
			@Pc(33) short local33 = this.aShortArray21[local26];
			if (local33 == 0) {
				local24 = local26;
				break;
			}
			if (arg0 == Static151.aLongArray2[local26]) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray21[local24] = (short) (this.anInt3095 + 1);
		Static151.aLongArray2[local24] = arg0;
		this.aShortArray13[this.anInt3095] = (short) arg2;
		this.aShortArray22[this.anInt3095] = (short) arg1;
		this.aShortArray23[this.anInt3095] = (short) arg3;
		this.aShortArray19[this.anInt3095] = (short) arg5;
		this.aShortArray18[this.anInt3095] = (short) arg4;
		this.aByteArray19[this.anInt3095] = (byte) arg8;
		this.aFloatArray38[this.anInt3095] = arg7;
		this.aFloatArray39[this.anInt3095] = arg9;
		return (short) this.anInt3095++;
	}

	@OriginalMember(owner = "client!eea", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static62.anInt1969 = 0;
			local29 = 0;
			Static98.anInt2630 = 0;
			Static568.anInt9762 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray9.length) {
					local51 = this.anIntArrayArray9[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray20 == null || (arg6 & this.aShortArray20[local59]) != 0) {
							Static568.anInt9762 += this.anIntArray157[local59];
							Static62.anInt1969 += this.anIntArray160[local59];
							local29++;
							Static98.anInt2630 += this.anIntArray159[local59];
						}
					}
				}
			}
			if (local29 > 0) {
				Static98.anInt2630 = arg4 + Static98.anInt2630 / local29;
				Static568.anInt9762 = arg2 + Static568.anInt9762 / local29;
				Static62.anInt1969 = Static62.anInt1969 / local29 + arg3;
				Static393.aBoolean551 = true;
			} else {
				Static62.anInt1969 = arg3;
				Static568.anInt9762 = arg2;
				Static98.anInt2630 = arg4;
			}
			return;
		}
		@Pc(254) int[] local254;
		@Pc(256) int local256;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg2 * arg7[0] + arg7[1] * arg3 + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
				local41 = arg2 * arg7[6] + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg3 = local35;
				arg4 = local41;
				arg2 = local29;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray9.length) {
					local254 = this.anIntArrayArray9[local35];
					for (local256 = 0; local256 < local254.length; local256++) {
						local53 = local254[local256];
						if (this.aShortArray20 == null || (arg6 & this.aShortArray20[local53]) != 0) {
							this.anIntArray157[local53] += arg2;
							this.anIntArray160[local53] += arg3;
							this.anIntArray159[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(379) int local379;
		@Pc(402) int local402;
		@Pc(432) int local432;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(471) int local471;
		@Pc(479) int local479;
		@Pc(487) int local487;
		@Pc(642) int local642;
		@Pc(667) int local667;
		@Pc(671) int local671;
		@Pc(679) int local679;
		@Pc(684) int local684;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(694) int local694;
		@Pc(823) int[] local823;
		@Pc(825) int local825;
		@Pc(829) int local829;
		@Pc(833) int local833;
		@Pc(835) int local835;
		@Pc(965) int local965;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray9.length > local35) {
						local254 = this.anIntArrayArray9[local35];
						for (local256 = 0; local256 < local254.length; local256++) {
							local53 = local254[local256];
							if (this.aShortArray20 == null || (arg6 & this.aShortArray20[local53]) != 0) {
								this.anIntArray157[local53] -= Static568.anInt9762;
								this.anIntArray160[local53] -= Static62.anInt1969;
								this.anIntArray159[local53] -= Static98.anInt2630;
								if (arg4 != 0) {
									local59 = Class344.anIntArray579[arg4];
									local379 = Class344.anIntArray578[arg4];
									local402 = local379 * this.anIntArray157[local53] + this.anIntArray160[local53] * local59 + 16383 >> 14;
									this.anIntArray160[local53] = local379 * this.anIntArray160[local53] + 16383 - this.anIntArray157[local53] * local59 >> 14;
									this.anIntArray157[local53] = local402;
								}
								if (arg2 != 0) {
									local59 = Class344.anIntArray579[arg2];
									local379 = Class344.anIntArray578[arg2];
									local402 = local379 * this.anIntArray160[local53] + 16383 - local59 * this.anIntArray159[local53] >> 14;
									this.anIntArray159[local53] = local59 * this.anIntArray160[local53] + this.anIntArray159[local53] * local379 + 16383 >> 14;
									this.anIntArray160[local53] = local402;
								}
								if (arg3 != 0) {
									local59 = Class344.anIntArray579[arg3];
									local379 = Class344.anIntArray578[arg3];
									local402 = this.anIntArray159[local53] * local59 + local379 * this.anIntArray157[local53] + 16383 >> 14;
									this.anIntArray159[local53] = local379 * this.anIntArray159[local53] + 16383 - local59 * this.anIntArray157[local53] >> 14;
									this.anIntArray157[local53] = local402;
								}
								this.anIntArray157[local53] += Static568.anInt9762;
								this.anIntArray160[local53] += Static62.anInt1969;
								this.anIntArray159[local53] += Static98.anInt2630;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray9.length > local41) {
							local51 = this.anIntArrayArray9[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray20 == null || (arg6 & this.aShortArray20[local59]) != 0) {
									local379 = this.anIntArray158[local59];
									local402 = this.anIntArray158[local59 + 1];
									for (local432 = local379; local432 < local402; local432++) {
										local459 = this.aShortArray21[local432] - 1;
										if (local459 == -1) {
											break;
										}
										if (arg4 != 0) {
											local463 = Class344.anIntArray579[arg4];
											local467 = Class344.anIntArray578[arg4];
											local471 = local467 * this.aShortArray23[local459] + this.aShortArray19[local459] * local463 + 16383 >> 14;
											this.aShortArray19[local459] = (short) (local467 * this.aShortArray19[local459] + 16383 - local463 * this.aShortArray23[local459] >> 14);
											this.aShortArray23[local459] = (short) local471;
										}
										if (arg2 != 0) {
											local463 = Class344.anIntArray579[arg2];
											local467 = Class344.anIntArray578[arg2];
											local471 = local467 * this.aShortArray19[local459] + 16383 - this.aShortArray18[local459] * local463 >> 14;
											this.aShortArray18[local459] = (short) (local467 * this.aShortArray18[local459] + this.aShortArray19[local459] * local463 + 16383 >> 14);
											this.aShortArray19[local459] = (short) local471;
										}
										if (arg3 != 0) {
											local463 = Class344.anIntArray579[arg3];
											local467 = Class344.anIntArray578[arg3];
											local471 = this.aShortArray18[local459] * local463 + local467 * this.aShortArray23[local459] + 16383 >> 14;
											this.aShortArray18[local459] = (short) (this.aShortArray18[local459] * local467 + 16383 - local463 * this.aShortArray23[local459] >> 14);
											this.aShortArray23[local459] = (short) local471;
										}
									}
								}
							}
						}
					}
					this.method2697();
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local256 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static393.aBoolean551) {
					local379 = Static568.anInt9762 * arg7[0] + Static62.anInt1969 * arg7[3] + Static98.anInt2630 * arg7[6] + 8192 >> 14;
					local402 = Static62.anInt1969 * arg7[4] + Static568.anInt9762 * arg7[1] + Static98.anInt2630 * arg7[7] + 8192 >> 14;
					local402 += local53;
					local379 += local256;
					local432 = arg7[8] * Static98.anInt2630 + Static568.anInt9762 * arg7[2] + arg7[5] * Static62.anInt1969 + 8192 >> 14;
					Static62.anInt1969 = local402;
					local432 += local59;
					Static568.anInt9762 = local379;
					Static98.anInt2630 = local432;
					Static393.aBoolean551 = false;
				}
				@Pc(447) int[] local447 = new int[9];
				local402 = Class344.anIntArray578[arg2];
				local432 = Class344.anIntArray579[arg2];
				local459 = Class344.anIntArray578[arg3];
				local463 = Class344.anIntArray579[arg3];
				local467 = Class344.anIntArray578[arg4];
				local471 = Class344.anIntArray579[arg4];
				local479 = local467 * local432 + 8192 >> 14;
				local487 = local471 * local432 + 8192 >> 14;
				local447[5] = -local432;
				local447[2] = local402 * local463 + 8192 >> 14;
				local447[7] = local463 * local471 + local459 * local479 + 8192 >> 14;
				local447[4] = local467 * local402 + 8192 >> 14;
				local447[6] = local487 * local459 + local467 * -local463 + 8192 >> 14;
				local447[0] = local467 * local459 + local463 * local487 + 8192 >> 14;
				local447[3] = local402 * local471 + 8192 >> 14;
				local447[1] = local479 * local463 + -local459 * local471 + 8192 >> 14;
				local447[8] = local402 * local459 + 8192 >> 14;
				@Pc(617) int local617 = local447[1] * -Static62.anInt1969 + -Static568.anInt9762 * local447[0] + -Static98.anInt2630 * local447[2] + 8192 >> 14;
				local642 = local447[5] * -Static98.anInt2630 + local447[4] * -Static62.anInt1969 + -Static568.anInt9762 * local447[3] + 8192 >> 14;
				local667 = -Static62.anInt1969 * local447[7] + -Static568.anInt9762 * local447[6] + local447[8] * -Static98.anInt2630 + 8192 >> 14;
				local671 = local617 + Static568.anInt9762;
				@Pc(675) int local675 = local642 + Static62.anInt1969;
				local679 = local667 + Static98.anInt2630;
				@Pc(682) int[] local682 = new int[9];
				for (local684 = 0; local684 < 3; local684++) {
					for (local688 = 0; local688 < 3; local688++) {
						local692 = 0;
						for (local694 = 0; local694 < 3; local694++) {
							local692 += local447[local684 * 3 + local694] * arg7[local688 * 3 + local694];
						}
						local682[local688 + local684 * 3] = local692 + 8192 >> 14;
					}
				}
				local688 = local447[0] * local256 + local447[1] * local53 + local447[2] * local59 + 8192 >> 14;
				local692 = local59 * local447[5] + local53 * local447[4] + local447[3] * local256 + 8192 >> 14;
				local692 += local675;
				local688 += local671;
				local694 = local447[7] * local53 + local447[6] * local256 + local447[8] * local59 + 8192 >> 14;
				local694 += local679;
				local823 = new int[9];
				for (local825 = 0; local825 < 3; local825++) {
					for (local829 = 0; local829 < 3; local829++) {
						local833 = 0;
						for (local835 = 0; local835 < 3; local835++) {
							local833 += arg7[local825 * 3 + local835] * local682[local835 * 3 + local829];
						}
						local823[local829 + local825 * 3] = local833 + 8192 >> 14;
					}
				}
				local829 = local692 * arg7[1] + arg7[0] * local688 + arg7[2] * local694 + 8192 >> 14;
				local833 = local688 * arg7[3] + local692 * arg7[4] + local694 * arg7[5] + 8192 >> 14;
				local829 += local29;
				local833 += local35;
				local835 = arg7[7] * local692 + local688 * arg7[6] + local694 * arg7[8] + 8192 >> 14;
				local835 += local41;
				for (local965 = 0; local965 < local8; local965++) {
					@Pc(971) int local971 = arg1[local965];
					if (this.anIntArrayArray9.length > local971) {
						@Pc(981) int[] local981 = this.anIntArrayArray9[local971];
						for (@Pc(983) int local983 = 0; local983 < local981.length; local983++) {
							@Pc(989) int local989 = local981[local983];
							if (this.aShortArray20 == null || (arg6 & this.aShortArray20[local989]) != 0) {
								@Pc(1031) int local1031 = local823[2] * this.anIntArray159[local989] + this.anIntArray157[local989] * local823[0] + local823[1] * this.anIntArray160[local989] + 8192 >> 14;
								@Pc(1063) int local1063 = local823[4] * this.anIntArray160[local989] + local823[3] * this.anIntArray157[local989] + this.anIntArray159[local989] * local823[5] + 8192 >> 14;
								@Pc(1096) int local1096 = this.anIntArray157[local989] * local823[6] + this.anIntArray160[local989] * local823[7] + this.anIntArray159[local989] * local823[8] + 8192 >> 14;
								@Pc(1100) int local1100 = local1031 + local829;
								@Pc(1104) int local1104 = local1063 + local833;
								this.anIntArray157[local989] = local1100;
								@Pc(1113) int local1113 = local1096 + local835;
								this.anIntArray160[local989] = local1104;
								this.anIntArray159[local989] = local1113;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2595) Class241 local2595;
			@Pc(2486) boolean local2486;
			@Pc(2590) Class145 local2590;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local2486 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray10.length > local41) {
							local51 = this.anIntArrayArray10[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray14 == null || (this.aShortArray14[local59] & arg6) != 0) {
									local379 = (this.aByteArray18[local59] & 0xFF) + (arg2 * 8);
									if (local379 < 0) {
										local379 = 0;
									} else if (local379 > 255) {
										local379 = 255;
									}
									this.aByteArray18[local59] = (byte) local379;
								}
							}
							local2486 |= local51.length > 0;
						}
					}
					if (local2486) {
						if (this.aClass145Array1 != null) {
							for (local41 = 0; local41 < this.anInt3109; local41++) {
								local2590 = this.aClass145Array1[local41];
								local2595 = this.aClass241Array1[local41];
								local2595.anInt7718 = 255 - (this.aByteArray18[local2590.anInt5188] & 0xFF) << 24 | local2595.anInt7718 & 0xFFFFFF;
							}
						}
						this.method2695();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray10 != null) {
					local2486 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray10.length > local41) {
							local51 = this.anIntArrayArray10[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray14 == null || (this.aShortArray14[local59] & arg6) != 0) {
									local379 = this.aShortArray24[local59] & 0xFFFF;
									local402 = local379 >> 10 & 0x3F;
									local432 = local379 >> 7 & 0x7;
									local459 = local379 & 0x7F;
									local432 += arg3 / 4;
									@Pc(2712) int local2712 = local402 + arg2 & 0x3F;
									local459 += arg4;
									if (local432 < 0) {
										local432 = 0;
									} else if (local432 > 7) {
										local432 = 7;
									}
									if (local459 < 0) {
										local459 = 0;
									} else if (local459 > 127) {
										local459 = 127;
									}
									this.aShortArray24[local59] = (short) (local2712 << 10 | local432 << 7 | local459);
								}
							}
							local2486 |= local51.length > 0;
						}
					}
					if (local2486) {
						if (this.aClass145Array1 != null) {
							for (local41 = 0; local41 < this.anInt3109; local41++) {
								local2590 = this.aClass145Array1[local41];
								local2595 = this.aClass241Array1[local41];
								local2595.anInt7718 = Static77.anIntArray92[this.aShortArray24[local2590.anInt5188] & 0xFFFF] & 0xFFFFFF | local2595.anInt7718 & 0xFF000000;
							}
						}
						this.method2695();
					}
				}
			} else if (arg0 == 8) {
				if (this.lb != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.lb.length) {
							local254 = this.lb[local35];
							for (local256 = 0; local256 < local254.length; local256++) {
								local2595 = this.aClass241Array1[local254[local256]];
								local2595.anInt7722 += arg2;
								local2595.anInt7723 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.lb != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.lb.length) {
							local254 = this.lb[local35];
							for (local256 = 0; local256 < local254.length; local256++) {
								local2595 = this.aClass241Array1[local254[local256]];
								local2595.anInt7717 = local2595.anInt7717 * arg3 >> 7;
								local2595.anInt7719 = local2595.anInt7719 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.lb != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.lb.length) {
						local254 = this.lb[local35];
						for (local256 = 0; local256 < local254.length; local256++) {
							local2595 = this.aClass241Array1[local254[local256]];
							local2595.anInt7715 = local2595.anInt7715 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray9.length) {
					local254 = this.anIntArrayArray9[local35];
					for (local256 = 0; local256 < local254.length; local256++) {
						local53 = local254[local256];
						if (this.aShortArray20 == null || (arg6 & this.aShortArray20[local53]) != 0) {
							this.anIntArray157[local53] -= Static568.anInt9762;
							this.anIntArray160[local53] -= Static62.anInt1969;
							this.anIntArray159[local53] -= Static98.anInt2630;
							this.anIntArray157[local53] = this.anIntArray157[local53] * arg2 >> 7;
							this.anIntArray160[local53] = this.anIntArray160[local53] * arg3 >> 7;
							this.anIntArray159[local53] = this.anIntArray159[local53] * arg4 >> 7;
							this.anIntArray157[local53] += Static568.anInt9762;
							this.anIntArray160[local53] += Static62.anInt1969;
							this.anIntArray159[local53] += Static98.anInt2630;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local256 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static393.aBoolean551) {
				local379 = arg7[0] * Static568.anInt9762 + Static62.anInt1969 * arg7[3] + arg7[6] * Static98.anInt2630 + 8192 >> 14;
				local402 = Static62.anInt1969 * arg7[4] + arg7[1] * Static568.anInt9762 + arg7[7] * Static98.anInt2630 + 8192 >> 14;
				local379 += local256;
				local432 = arg7[5] * Static62.anInt1969 + Static568.anInt9762 * arg7[2] + Static98.anInt2630 * arg7[8] + 8192 >> 14;
				local402 += local53;
				local432 += local59;
				Static568.anInt9762 = local379;
				Static62.anInt1969 = local402;
				Static393.aBoolean551 = false;
				Static98.anInt2630 = local432;
			}
			local379 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local432 = arg4 << 15 >> 7;
			local459 = -Static568.anInt9762 * local379 + 8192 >> 14;
			local463 = -Static62.anInt1969 * local402 + 8192 >> 14;
			local467 = local432 * -Static98.anInt2630 + 8192 >> 14;
			local471 = local459 + Static568.anInt9762;
			local479 = Static62.anInt1969 + local463;
			local487 = local467 + Static98.anInt2630;
			@Pc(2014) int[] local2014 = new int[] { local379 * arg7[0] + 8192 >> 14, arg7[3] * local379 + 8192 >> 14, local379 * arg7[6] + 8192 >> 14, local402 * arg7[1] + 8192 >> 14, arg7[4] * local402 + 8192 >> 14, local402 * arg7[7] + 8192 >> 14, arg7[2] * local432 + 8192 >> 14, arg7[5] * local432 + 8192 >> 14, local432 * arg7[8] + 8192 >> 14 };
			local642 = local256 * local379 + 8192 >> 14;
			local667 = local402 * local53 + 8192 >> 14;
			local671 = local59 * local432 + 8192 >> 14;
			@Pc(2150) int local2150 = local642 + local471;
			@Pc(2154) int local2154 = local667 + local479;
			@Pc(2158) int local2158 = local671 + local487;
			@Pc(2161) int[] local2161 = new int[9];
			@Pc(2167) int local2167;
			for (local679 = 0; local679 < 3; local679++) {
				for (local2167 = 0; local2167 < 3; local2167++) {
					local684 = 0;
					for (local688 = 0; local688 < 3; local688++) {
						local684 += arg7[local688 + local679 * 3] * local2014[local688 * 3 + local2167];
					}
					local2161[local2167 + local679 * 3] = local684 + 8192 >> 14;
				}
			}
			local2167 = local2158 * arg7[2] + arg7[0] * local2150 + arg7[1] * local2154 + 8192 >> 14;
			local684 = arg7[4] * local2154 + arg7[3] * local2150 + arg7[5] * local2158 + 8192 >> 14;
			local2167 += local29;
			local688 = arg7[8] * local2158 + local2154 * arg7[7] + arg7[6] * local2150 + 8192 >> 14;
			local684 += local35;
			local688 += local41;
			for (local692 = 0; local692 < local8; local692++) {
				local694 = arg1[local692];
				if (this.anIntArrayArray9.length > local694) {
					local823 = this.anIntArrayArray9[local694];
					for (local825 = 0; local825 < local823.length; local825++) {
						local829 = local823[local825];
						if (this.aShortArray20 == null || (this.aShortArray20[local829] & arg6) != 0) {
							local833 = local2161[0] * this.anIntArray157[local829] + this.anIntArray160[local829] * local2161[1] + this.anIntArray159[local829] * local2161[2] + 8192 >> 14;
							local835 = this.anIntArray157[local829] * local2161[3] + this.anIntArray160[local829] * local2161[4] + local2161[5] * this.anIntArray159[local829] + 8192 >> 14;
							local965 = local2161[8] * this.anIntArray159[local829] + this.anIntArray157[local829] * local2161[6] + this.anIntArray160[local829] * local2161[7] + 8192 >> 14;
							@Pc(2439) int local2439 = local835 + local684;
							@Pc(2443) int local2443 = local833 + local2167;
							@Pc(2447) int local2447 = local965 + local688;
							this.anIntArray157[local829] = local2443;
							this.anIntArray160[local829] = local2439;
							this.anIntArray159[local829] = local2447;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!dfa;Lclient!im;I)V")
	@Override
	public void method8003(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3095 == 0) {
			return;
		}
		@Pc(16) Class54_Sub3 local16 = this.aClass16_Sub1_7.aClass54_Sub3_16;
		if (!this.aBoolean234) {
			this.method2701();
		}
		@Pc(25) Class54_Sub3 local25 = (Class54_Sub3) arg0;
		Static629.aFloat199 = local16.aFloat121 + local16.aFloat124 * local25.aFloat122 + local25.aFloat123 * local16.aFloat120 + local16.aFloat118 * local25.aFloat121;
		Static387.aFloat172 = local25.aFloat116 * local16.aFloat124 + local25.aFloat115 * local16.aFloat120 + local16.aFloat118 * local25.aFloat124;
		@Pc(72) float local72 = Static387.aFloat172 * (float) this.anInt3087 + Static629.aFloat199;
		@Pc(80) float local80 = (float) this.anInt3098 * Static387.aFloat172 + Static629.aFloat199;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.anInt3151 + local80;
			local97 = (float) this.anInt3151 + local72;
		} else {
			local91 = (float) -this.anInt3151 + local72;
			local97 = local80 + (float) this.anInt3151;
		}
		if (this.aClass16_Sub1_7.aFloat87 <= local91 || local97 <= (float) this.aClass16_Sub1_7.anInt4931) {
			return;
		}
		Static469.aFloat184 = local25.aFloat116 * local16.aFloat115 + local25.aFloat115 * local16.aFloat117 + local16.aFloat114 * local25.aFloat124;
		Static54.aFloat42 = local16.aFloat123 + local16.aFloat115 * local25.aFloat122 + local16.aFloat117 * local25.aFloat123 + local16.aFloat114 * local25.aFloat121;
		@Pc(174) float local174 = (float) this.anInt3087 * Static469.aFloat184 + Static54.aFloat42;
		@Pc(182) float local182 = (float) this.anInt3098 * Static469.aFloat184 + Static54.aFloat42;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local174 > local182) {
			local197 = ((float) -this.anInt3151 + local182) * (float) this.aClass16_Sub1_7.anInt4918;
			local208 = (local174 + (float) this.anInt3151) * (float) this.aClass16_Sub1_7.anInt4918;
		} else {
			local197 = (local174 - (float) this.anInt3151) * (float) this.aClass16_Sub1_7.anInt4918;
			local208 = (float) this.aClass16_Sub1_7.anInt4918 * (local182 + (float) this.anInt3151);
		}
		if (local197 / local97 >= this.aClass16_Sub1_7.aFloat97 || this.aClass16_Sub1_7.aFloat91 >= local208 / local97) {
			return;
		}
		Static640.aFloat200 = local16.aFloat122 + local16.aFloat119 * local25.aFloat121 + local16.aFloat116 * local25.aFloat122 + local16.aFloat113 * local25.aFloat123;
		Static453.aFloat182 = local25.aFloat124 * local16.aFloat119 + local25.aFloat115 * local16.aFloat113 + local25.aFloat116 * local16.aFloat116;
		@Pc(298) float local298 = Static453.aFloat182 * (float) this.anInt3087 + Static640.aFloat200;
		@Pc(306) float local306 = Static640.aFloat200 + (float) this.anInt3098 * Static453.aFloat182;
		@Pc(333) float local333;
		@Pc(321) float local321;
		if (local298 > local306) {
			local321 = (float) this.aClass16_Sub1_7.anInt4914 * ((float) this.anInt3151 + local298);
			local333 = ((float) -this.anInt3151 + local306) * (float) this.aClass16_Sub1_7.anInt4914;
		} else {
			local321 = (float) this.aClass16_Sub1_7.anInt4914 * (local306 + (float) this.anInt3151);
			local333 = (float) this.aClass16_Sub1_7.anInt4914 * (local298 - (float) this.anInt3151);
		}
		if (local333 / local97 >= this.aClass16_Sub1_7.aFloat84 || this.aClass16_Sub1_7.aFloat83 >= local321 / local97) {
			return;
		}
		if (arg1 != null || this.aClass145Array1 != null) {
			Static305.aFloat112 = local16.aFloat120 * local25.aFloat117 + local16.aFloat124 * local25.aFloat113 + local16.aFloat118 * local25.aFloat120;
			Static240.aFloat103 = local25.aFloat119 * local16.aFloat115 + local16.aFloat117 * local25.aFloat114 + local25.aFloat118 * local16.aFloat114;
			Static354.aFloat131 = local16.aFloat119 * local25.aFloat120 + local25.aFloat117 * local16.aFloat113 + local25.aFloat113 * local16.aFloat116;
			Static249.aFloat104 = local16.aFloat124 * local25.aFloat119 + local16.aFloat120 * local25.aFloat114 + local16.aFloat118 * local25.aFloat118;
			Static589.aFloat194 = local16.aFloat114 * local25.aFloat120 + local16.aFloat117 * local25.aFloat117 + local16.aFloat115 * local25.aFloat113;
			Static443.aFloat180 = local16.aFloat116 * local25.aFloat119 + local25.aFloat114 * local16.aFloat113 + local25.aFloat118 * local16.aFloat119;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(502) int local502 = this.anInt3142 + this.anInt3076 >> 1;
			@Pc(511) int local511 = this.anInt3137 + this.anInt3102 >> 1;
			@Pc(530) int local530 = (int) ((float) local511 * Static240.aFloat103 + Static54.aFloat42 + (float) local502 * Static589.aFloat194 + (float) this.anInt3087 * Static469.aFloat184);
			@Pc(549) int local549 = (int) (Static443.aFloat180 * (float) local511 + Static453.aFloat182 * (float) this.anInt3087 + Static354.aFloat131 * (float) local502 + Static640.aFloat200);
			@Pc(568) int local568 = (int) ((float) local511 * Static249.aFloat104 + Static387.aFloat172 * (float) this.anInt3087 + Static629.aFloat199 + (float) local502 * Static305.aFloat112);
			if (this.aClass16_Sub1_7.anInt4931 <= local568) {
				arg1.anInt5265 = this.aClass16_Sub1_7.anInt4920 + this.aClass16_Sub1_7.anInt4914 * local549 / local568;
				arg1.anInt5263 = this.aClass16_Sub1_7.anInt4917 + this.aClass16_Sub1_7.anInt4918 * local530 / local568;
			} else {
				local492 = true;
			}
			@Pc(627) int local627 = (int) (Static54.aFloat42 + (float) local502 * Static589.aFloat194 + Static469.aFloat184 * (float) this.anInt3098 + Static240.aFloat103 * (float) local511);
			@Pc(646) int local646 = (int) (Static443.aFloat180 * (float) local511 + Static453.aFloat182 * (float) this.anInt3098 + Static640.aFloat200 + Static354.aFloat131 * (float) local502);
			@Pc(665) int local665 = (int) (Static249.aFloat104 * (float) local511 + Static629.aFloat199 + (float) local502 * Static305.aFloat112 + Static387.aFloat172 * (float) this.anInt3098);
			if (local665 >= this.aClass16_Sub1_7.anInt4931) {
				arg1.anInt5262 = this.aClass16_Sub1_7.anInt4917 + local627 * this.aClass16_Sub1_7.anInt4918 / local665;
				arg1.anInt5266 = this.aClass16_Sub1_7.anInt4914 * local646 / local665 + this.aClass16_Sub1_7.anInt4920;
			} else {
				local492 = true;
			}
			if (local492) {
				if (this.aClass16_Sub1_7.anInt4931 > local568 && local665 < this.aClass16_Sub1_7.anInt4931) {
					local494 = false;
				} else {
					@Pc(743) int local743;
					@Pc(754) int local754;
					@Pc(780) int local780;
					if (this.aClass16_Sub1_7.anInt4931 > local568) {
						local743 = (local665 - this.aClass16_Sub1_7.anInt4931 << 16) / (local665 - local568);
						local754 = local627 + (local743 * (local627 - local530) >> 16);
						arg1.anInt5263 = this.aClass16_Sub1_7.anInt4917 + this.aClass16_Sub1_7.anInt4918 * local754 / this.aClass16_Sub1_7.anInt4931;
						local780 = (local743 * (local646 - local549) >> 16) + local646;
						arg1.anInt5265 = this.aClass16_Sub1_7.anInt4920 + this.aClass16_Sub1_7.anInt4914 * local780 / this.aClass16_Sub1_7.anInt4931;
					} else if (this.aClass16_Sub1_7.anInt4931 > local665) {
						local743 = (local568 - this.aClass16_Sub1_7.anInt4931 << 16) / (local568 - local665);
						local754 = ((local530 - local627) * local743 >> 16) + local530;
						local780 = (local743 * (local549 - local646) >> 16) + local549;
						arg1.anInt5263 = this.aClass16_Sub1_7.anInt4918 * local754 / this.aClass16_Sub1_7.anInt4931 + this.aClass16_Sub1_7.anInt4917;
						arg1.anInt5265 = this.aClass16_Sub1_7.anInt4914 * local780 / this.aClass16_Sub1_7.anInt4931 + this.aClass16_Sub1_7.anInt4920;
					}
				}
			}
			if (local494) {
				arg1.aBoolean394 = true;
				if (local568 <= local665) {
					arg1.anInt5264 = (this.anInt3151 + local627) * this.aClass16_Sub1_7.anInt4918 / local665 + this.aClass16_Sub1_7.anInt4917 - arg1.anInt5262;
				} else {
					arg1.anInt5264 = this.aClass16_Sub1_7.anInt4917 + this.aClass16_Sub1_7.anInt4918 * (this.anInt3151 + local530) / local568 - arg1.anInt5263;
				}
			}
		}
		this.aClass16_Sub1_7.method3938();
		this.aClass16_Sub1_7.method3921(local25);
		this.method2687();
		this.method2696();
	}

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "()Z")
	@Override
	public boolean method8012() {
		if (this.aShortArray15 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray15.length; local12++) {
			if (this.aShortArray15[local12] != -1 && !this.aClass16_Sub1_7.anInterface2_12.method4025(this.aShortArray15[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class344.anIntArray579[arg0];
		@Pc(13) int local13 = Class344.anIntArray578[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3104; local15++) {
			local34 = this.anIntArray159[local15] * local9 + this.anIntArray157[local15] * local13 >> 14;
			this.anIntArray159[local15] = local13 * this.anIntArray159[local15] - local9 * this.anIntArray157[local15] >> 14;
			this.anIntArray157[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt3095; local34++) {
			@Pc(84) int local84 = local13 * this.aShortArray23[local34] + local9 * this.aShortArray18[local34] >> 14;
			this.aShortArray18[local34] = (short) (this.aShortArray18[local34] * local13 - local9 * this.aShortArray23[local34] >> 14);
			this.aShortArray23[local34] = (short) local84;
		}
		this.method2690();
		this.method2697();
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "(B)V")
	public void method2700() {
		if (this.aClass72_3 != null) {
			this.aClass72_3.method2235();
		}
		if (this.aClass72_1 != null) {
			this.aClass72_1.method2235();
		}
		if (this.aClass72_4 != null) {
			this.aClass72_4.method2235();
		}
		if (this.aClass72_2 != null) {
			this.aClass72_2.method2235();
		}
		if (this.aClass303_1 != null) {
			this.aClass303_1.method7334();
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "()V")
	@Override
	public void method8002() {
		if (this.anInt3095 > 0 && this.anInt3100 > 0) {
			this.method2686();
			this.method2702();
			this.method2703();
		}
	}

	@OriginalMember(owner = "client!eea", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class344.anIntArray579[arg0];
		@Pc(13) int local13 = Class344.anIntArray578[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3104; local15++) {
			@Pc(33) int local33 = this.anIntArray157[local15] * local13 + local9 * this.anIntArray160[local15] >> 14;
			this.anIntArray160[local15] = local13 * this.anIntArray160[local15] - local9 * this.anIntArray157[local15] >> 14;
			this.anIntArray157[local15] = local33;
		}
		this.method2690();
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class83 method7993(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class83_Sub1 local12;
		@Pc(16) Class83_Sub1 local16;
		if (arg0 == 1) {
			local12 = this.aClass16_Sub1_7.aClass83_Sub1_21;
			local16 = this.aClass16_Sub1_7.aClass83_Sub1_30;
		} else if (arg0 == 2) {
			local12 = this.aClass16_Sub1_7.aClass83_Sub1_23;
			local16 = this.aClass16_Sub1_7.aClass83_Sub1_27;
		} else if (arg0 == 3) {
			local12 = this.aClass16_Sub1_7.aClass83_Sub1_25;
			local16 = this.aClass16_Sub1_7.aClass83_Sub1_22;
		} else if (arg0 == 4) {
			local16 = this.aClass16_Sub1_7.aClass83_Sub1_29;
			local12 = this.aClass16_Sub1_7.aClass83_Sub1_26;
		} else if (arg0 == 5) {
			local12 = this.aClass16_Sub1_7.aClass83_Sub1_28;
			local16 = this.aClass16_Sub1_7.aClass83_Sub1_24;
		} else {
			local12 = local16 = new Class83_Sub1(this.aClass16_Sub1_7, 0, 0, true, false);
		}
		return this.method2691(arg2, local12, arg1, local16, arg0 != 0);
	}

	@OriginalMember(owner = "client!eea", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean237;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "()[Lclient!oia;")
	@Override
	public Class238[] method8005() {
		return this.aClass238Array1;
	}

	@OriginalMember(owner = "client!eea", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static62.anInt1969 = 0;
			Static568.anInt9762 = 0;
			Static98.anInt2630 = 0;
			for (local17 = 0; local17 < this.anInt3104; local17++) {
				Static568.anInt9762 += this.anIntArray157[local17];
				Static62.anInt1969 += this.anIntArray160[local17];
				local9++;
				Static98.anInt2630 += this.anIntArray159[local17];
			}
			if (local9 <= 0) {
				Static98.anInt2630 = arg3;
				Static62.anInt1969 = arg2;
				Static568.anInt9762 = arg1;
			} else {
				Static62.anInt1969 = arg2 + Static62.anInt1969 / local9;
				Static98.anInt2630 = Static98.anInt2630 / local9 + arg3;
				Static568.anInt9762 = Static568.anInt9762 / local9 + arg1;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt3104; local9++) {
				this.anIntArray157[local9] += arg1;
				this.anIntArray160[local9] += arg2;
				this.anIntArray159[local9] += arg3;
			}
		} else {
			@Pc(171) int local171;
			@Pc(189) int local189;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt3104; local9++) {
					this.anIntArray157[local9] -= Static568.anInt9762;
					this.anIntArray160[local9] -= Static62.anInt1969;
					this.anIntArray159[local9] -= Static98.anInt2630;
					if (arg3 != 0) {
						local17 = Class344.anIntArray579[arg3];
						local171 = Class344.anIntArray578[arg3];
						local189 = this.anIntArray157[local9] * local171 + this.anIntArray160[local9] * local17 + 16383 >> 14;
						this.anIntArray160[local9] = local171 * this.anIntArray160[local9] + 16383 - local17 * this.anIntArray157[local9] >> 14;
						this.anIntArray157[local9] = local189;
					}
					if (arg1 != 0) {
						local17 = Class344.anIntArray579[arg1];
						local171 = Class344.anIntArray578[arg1];
						local189 = local171 * this.anIntArray160[local9] + 16383 - this.anIntArray159[local9] * local17 >> 14;
						this.anIntArray159[local9] = this.anIntArray159[local9] * local171 + local17 * this.anIntArray160[local9] + 16383 >> 14;
						this.anIntArray160[local9] = local189;
					}
					if (arg2 != 0) {
						local17 = Class344.anIntArray579[arg2];
						local171 = Class344.anIntArray578[arg2];
						local189 = this.anIntArray159[local9] * local17 + local171 * this.anIntArray157[local9] + 16383 >> 14;
						this.anIntArray159[local9] = local171 * this.anIntArray159[local9] + 16383 - this.anIntArray157[local9] * local17 >> 14;
						this.anIntArray157[local9] = local189;
					}
					this.anIntArray157[local9] += Static568.anInt9762;
					this.anIntArray160[local9] += Static62.anInt1969;
					this.anIntArray159[local9] += Static98.anInt2630;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt3104; local9++) {
					this.anIntArray157[local9] -= Static568.anInt9762;
					this.anIntArray160[local9] -= Static62.anInt1969;
					this.anIntArray159[local9] -= Static98.anInt2630;
					this.anIntArray157[local9] = arg1 * this.anIntArray157[local9] / 128;
					this.anIntArray160[local9] = arg2 * this.anIntArray160[local9] / 128;
					this.anIntArray159[local9] = this.anIntArray159[local9] * arg3 / 128;
					this.anIntArray157[local9] += Static568.anInt9762;
					this.anIntArray160[local9] += Static62.anInt1969;
					this.anIntArray159[local9] += Static98.anInt2630;
				}
			} else {
				@Pc(520) Class145 local520;
				@Pc(525) Class241 local525;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt3090; local9++) {
						local17 = arg1 * 8 + (this.aByteArray18[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray18[local9] = (byte) local17;
					}
					if (this.aClass145Array1 != null) {
						for (local17 = 0; local17 < this.anInt3109; local17++) {
							local520 = this.aClass145Array1[local17];
							local525 = this.aClass241Array1[local17];
							local525.anInt7718 = 255 - (this.aByteArray18[local520.anInt5188] & 0xFF) << 24 | local525.anInt7718 & 0xFFFFFF;
						}
					}
					this.method2695();
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt3090; local9++) {
						local17 = this.aShortArray24[local9] & 0xFFFF;
						local171 = local17 >> 10 & 0x3F;
						local189 = local17 >> 7 & 0x7;
						@Pc(588) int local588 = local171 + arg1 & 0x3F;
						local189 += arg2 / 4;
						@Pc(598) int local598 = local17 & 0x7F;
						local598 += arg3;
						if (local189 < 0) {
							local189 = 0;
						} else if (local189 > 7) {
							local189 = 7;
						}
						if (local598 < 0) {
							local598 = 0;
						} else if (local598 > 127) {
							local598 = 127;
						}
						this.aShortArray24[local9] = (short) (local189 << 7 | local588 << 10 | local598);
					}
					if (this.aClass145Array1 != null) {
						for (local17 = 0; local17 < this.anInt3109; local17++) {
							local520 = this.aClass145Array1[local17];
							local525 = this.aClass241Array1[local17];
							local525.anInt7718 = Static77.anIntArray92[this.aShortArray24[local520.anInt5188] & 0xFFFF] & 0xFFFFFF | local525.anInt7718 & 0xFF000000;
						}
					}
					this.method2695();
				} else {
					@Pc(701) Class241 local701;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt3109; local9++) {
							local701 = this.aClass241Array1[local9];
							local701.anInt7722 += arg1;
							local701.anInt7723 += arg2;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt3109; local9++) {
							local701 = this.aClass241Array1[local9];
							local701.anInt7717 = local701.anInt7717 * arg2 >> 7;
							local701.anInt7719 = arg1 * local701.anInt7719 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt3109; local9++) {
							local701 = this.aClass241Array1[local9];
							local701.anInt7715 = local701.anInt7715 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eea", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort32 = (short) arg0;
		this.method2690();
		this.method2697();
	}

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "(B)V")
	private void method2701() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt3104; local31++) {
			@Pc(38) int local38 = this.anIntArray157[local31];
			@Pc(43) int local43 = this.anIntArray160[local31];
			if (local43 > local15) {
				local15 = local43;
			}
			@Pc(57) int local57 = this.anIntArray159[local31];
			if (local7 > local38) {
				local7 = local38;
			}
			if (local13 < local38) {
				local13 = local38;
			}
			if (local43 < local9) {
				local9 = local43;
			}
			if (local57 < local11) {
				local11 = local57;
			}
			if (local57 > local17) {
				local17 = local57;
			}
			@Pc(106) int local106 = local38 * local38 + local57 * local57;
			if (local19 < local106) {
				local19 = local106;
			}
			local106 = local38 * local38 + local57 * local57 + local43 * local43;
			if (local21 < local106) {
				local21 = local106;
			}
		}
		this.anInt3102 = local17;
		this.anInt3137 = local11;
		this.anInt3098 = local15;
		this.anInt3087 = local9;
		this.anInt3076 = local7;
		this.anInt3142 = local13;
		this.anInt3151 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt3097 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean234 = true;
	}

	@OriginalMember(owner = "client!eea", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean234) {
			this.method2701();
		}
		return this.anInt3102;
	}

	@OriginalMember(owner = "client!eea", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort31 = (short) arg0;
		this.method2695();
	}

	@OriginalMember(owner = "client!eea", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt3113;
	}

	@OriginalMember(owner = "client!eea", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean234) {
			this.method2701();
		}
		return this.anInt3076;
	}

	@OriginalMember(owner = "client!eea", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean234) {
			this.method2701();
		}
		return this.anInt3137;
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)Z")
	private boolean method2702() {
		if (this.aClass303_1.aBoolean638) {
			return true;
		}
		if (this.aClass303_1.anInterface13_7 == null) {
			this.aClass303_1.anInterface13_7 = this.aClass16_Sub1_7.method3917(this.aBoolean238);
		}
		@Pc(28) Interface13 local28 = this.aClass303_1.anInterface13_7;
		local28.method6500(this.anInt3100 * 6);
		@Pc(42) Buffer local42 = local28.method4654();
		if (local42 != null) {
			@Pc(56) Stream local56 = this.aClass16_Sub1_7.method3981(local42);
			@Pc(60) int local60;
			if (Stream.c()) {
				for (local60 = 0; local60 < this.anInt3100; local60++) {
					local56.f(this.aShortArray16[local60]);
					local56.f(this.aShortArray17[local60]);
					local56.f(this.aShortArray25[local60]);
				}
			} else {
				for (local60 = 0; local60 < this.anInt3100; local60++) {
					local56.c(this.aShortArray16[local60]);
					local56.c(this.aShortArray17[local60]);
					local56.c(this.aShortArray25[local60]);
				}
			}
			local56.b();
			if (local28.method4655()) {
				this.aBoolean235 = true;
				this.aClass303_1.anInterface13_8 = local28;
				this.aClass303_1.aBoolean638 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eea", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class8_Sub5_Sub11 ba(@OriginalArg(0) Class8_Sub5_Sub11 arg0) {
		if (this.anInt3095 == 0) {
			return null;
		}
		if (!this.aBoolean234) {
			this.method2701();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass16_Sub1_7.anInt4928 <= 0) {
			local37 = this.anInt3076 - (this.anInt3087 * this.aClass16_Sub1_7.anInt4928 >> 8) >> this.aClass16_Sub1_7.anInt4909;
			local54 = this.anInt3142 - (this.anInt3098 * this.aClass16_Sub1_7.anInt4928 >> 8) >> this.aClass16_Sub1_7.anInt4909;
		} else {
			local37 = this.anInt3076 - (this.anInt3098 * this.aClass16_Sub1_7.anInt4928 >> 8) >> this.aClass16_Sub1_7.anInt4909;
			local54 = this.anInt3142 - (this.anInt3087 * this.aClass16_Sub1_7.anInt4928 >> 8) >> this.aClass16_Sub1_7.anInt4909;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass16_Sub1_7.anInt4902 <= 0) {
			local113 = this.anInt3137 - (this.anInt3087 * this.aClass16_Sub1_7.anInt4902 >> 8) >> this.aClass16_Sub1_7.anInt4909;
			local130 = this.anInt3102 - (this.aClass16_Sub1_7.anInt4902 * this.anInt3098 >> 8) >> this.aClass16_Sub1_7.anInt4909;
		} else {
			local113 = this.anInt3137 - (this.anInt3098 * this.aClass16_Sub1_7.anInt4902 >> 8) >> this.aClass16_Sub1_7.anInt4909;
			local130 = this.anInt3102 - (this.aClass16_Sub1_7.anInt4902 * this.anInt3087 >> 8) >> this.aClass16_Sub1_7.anInt4909;
		}
		@Pc(172) int local172 = local54 + 1 - local37;
		@Pc(179) int local179 = local130 + 1 - local113;
		@Pc(182) Class8_Sub5_Sub11_Sub2 local182 = (Class8_Sub5_Sub11_Sub2) arg0;
		@Pc(192) Class8_Sub5_Sub11_Sub2 local192;
		if (local182 != null && local182.method7261(local172, local179)) {
			local192 = local182;
			local182.method7269();
		} else {
			local192 = new Class8_Sub5_Sub11_Sub2(this.aClass16_Sub1_7, local172, local179);
		}
		local192.method7264(local130, local113, local37, local54);
		this.method2693(local192);
		return local192;
	}

	@OriginalMember(owner = "client!eea", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean234) {
			this.method2701();
		}
		return this.anInt3098;
	}

	@OriginalMember(owner = "client!eea", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray9 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3118; local12++) {
			this.anIntArray157[local12] <<= 0x4;
			this.anIntArray160[local12] <<= 0x4;
			this.anIntArray159[local12] <<= 0x4;
		}
		Static568.anInt9762 = 0;
		Static62.anInt1969 = 0;
		Static98.anInt2630 = 0;
		return true;
	}

	@OriginalMember(owner = "client!eea", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean236;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!dfa;Lclient!im;II)V")
	@Override
	public void method8009(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3095 == 0) {
			return;
		}
		@Pc(13) Class54_Sub3 local13 = this.aClass16_Sub1_7.aClass54_Sub3_16;
		@Pc(16) Class54_Sub3 local16 = (Class54_Sub3) arg0;
		if (!this.aBoolean234) {
			this.method2701();
		}
		Static387.aFloat172 = local16.aFloat124 * local13.aFloat118 + local16.aFloat115 * local13.aFloat120 + local16.aFloat116 * local13.aFloat124;
		Static629.aFloat199 = local13.aFloat118 * local16.aFloat121 + local13.aFloat124 * local16.aFloat122 + local16.aFloat123 * local13.aFloat120 + local13.aFloat121;
		@Pc(69) float local69 = Static387.aFloat172 * (float) this.anInt3087 + Static629.aFloat199;
		@Pc(77) float local77 = (float) this.anInt3098 * Static387.aFloat172 + Static629.aFloat199;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = local69 + (float) this.anInt3151;
			local93 = local77 - (float) this.anInt3151;
		} else {
			local93 = (float) -this.anInt3151 + local69;
			local87 = local77 + (float) this.anInt3151;
		}
		if (this.aClass16_Sub1_7.aFloat92 <= local93 || local87 <= (float) this.aClass16_Sub1_7.anInt4931) {
			return;
		}
		Static469.aFloat184 = local16.aFloat124 * local13.aFloat114 + local16.aFloat116 * local13.aFloat115 + local16.aFloat115 * local13.aFloat117;
		Static54.aFloat42 = local13.aFloat115 * local16.aFloat122 + local16.aFloat123 * local13.aFloat117 + local16.aFloat121 * local13.aFloat114 + local13.aFloat123;
		@Pc(170) float local170 = (float) this.anInt3087 * Static469.aFloat184 + Static54.aFloat42;
		@Pc(178) float local178 = (float) this.anInt3098 * Static469.aFloat184 + Static54.aFloat42;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local170 > local178) {
			local205 = (local170 + (float) this.anInt3151) * (float) this.aClass16_Sub1_7.anInt4918;
			local194 = (local178 - (float) this.anInt3151) * (float) this.aClass16_Sub1_7.anInt4918;
		} else {
			local194 = (float) this.aClass16_Sub1_7.anInt4918 * ((float) -this.anInt3151 + local170);
			local205 = (local178 + (float) this.anInt3151) * (float) this.aClass16_Sub1_7.anInt4918;
		}
		if (this.aClass16_Sub1_7.aFloat97 <= local194 / (float) arg2 || this.aClass16_Sub1_7.aFloat91 >= local205 / (float) arg2) {
			return;
		}
		Static453.aFloat182 = local13.aFloat119 * local16.aFloat124 + local16.aFloat115 * local13.aFloat113 + local16.aFloat116 * local13.aFloat116;
		Static640.aFloat200 = local16.aFloat121 * local13.aFloat119 + local16.aFloat122 * local13.aFloat116 + local13.aFloat113 * local16.aFloat123 + local13.aFloat122;
		@Pc(296) float local296 = Static453.aFloat182 * (float) this.anInt3087 + Static640.aFloat200;
		@Pc(304) float local304 = (float) this.anInt3098 * Static453.aFloat182 + Static640.aFloat200;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local296 > local304) {
			local319 = (float) this.aClass16_Sub1_7.anInt4914 * (local296 + (float) this.anInt3151);
			local331 = ((float) -this.anInt3151 + local304) * (float) this.aClass16_Sub1_7.anInt4914;
		} else {
			local319 = (float) this.aClass16_Sub1_7.anInt4914 * (local304 + (float) this.anInt3151);
			local331 = ((float) -this.anInt3151 + local296) * (float) this.aClass16_Sub1_7.anInt4914;
		}
		if (this.aClass16_Sub1_7.aFloat84 <= local331 / (float) arg2 || this.aClass16_Sub1_7.aFloat83 >= local319 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass145Array1 != null) {
			Static305.aFloat112 = local16.aFloat120 * local13.aFloat118 + local13.aFloat124 * local16.aFloat113 + local16.aFloat117 * local13.aFloat120;
			Static443.aFloat180 = local16.aFloat118 * local13.aFloat119 + local13.aFloat113 * local16.aFloat114 + local13.aFloat116 * local16.aFloat119;
			Static589.aFloat194 = local13.aFloat114 * local16.aFloat120 + local13.aFloat117 * local16.aFloat117 + local16.aFloat113 * local13.aFloat115;
			Static354.aFloat131 = local13.aFloat116 * local16.aFloat113 + local13.aFloat113 * local16.aFloat117 + local16.aFloat120 * local13.aFloat119;
			Static240.aFloat103 = local16.aFloat118 * local13.aFloat114 + local13.aFloat115 * local16.aFloat119 + local16.aFloat114 * local13.aFloat117;
			Static249.aFloat104 = local16.aFloat114 * local13.aFloat120 + local16.aFloat119 * local13.aFloat124 + local13.aFloat118 * local16.aFloat118;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt3076 + this.anInt3142 >> 1;
			@Pc(507) int local507 = this.anInt3137 + this.anInt3102 >> 1;
			@Pc(526) int local526 = (int) ((float) local499 * Static589.aFloat194 + Static54.aFloat42 + Static469.aFloat184 * (float) this.anInt3087 + (float) local507 * Static240.aFloat103);
			@Pc(545) int local545 = (int) ((float) local507 * Static443.aFloat180 + (float) local499 * Static354.aFloat131 + Static640.aFloat200 + (float) this.anInt3087 * Static453.aFloat182);
			@Pc(564) int local564 = (int) (Static249.aFloat104 * (float) local507 + Static629.aFloat199 + (float) local499 * Static305.aFloat112 + (float) this.anInt3087 * Static387.aFloat172);
			@Pc(583) int local583 = (int) ((float) this.anInt3098 * Static469.aFloat184 + Static54.aFloat42 + (float) local499 * Static589.aFloat194 + Static240.aFloat103 * (float) local507);
			@Pc(602) int local602 = (int) (Static453.aFloat182 * (float) this.anInt3098 + Static354.aFloat131 * (float) local499 + Static640.aFloat200 + (float) local507 * Static443.aFloat180);
			arg1.anInt5266 = this.aClass16_Sub1_7.anInt4920 + local602 * this.aClass16_Sub1_7.anInt4914 / arg2;
			arg1.anInt5263 = this.aClass16_Sub1_7.anInt4917 + this.aClass16_Sub1_7.anInt4918 * local526 / arg2;
			@Pc(648) int local648 = (int) ((float) local507 * Static249.aFloat104 + Static305.aFloat112 * (float) local499 + Static629.aFloat199 + (float) this.anInt3098 * Static387.aFloat172);
			arg1.anInt5265 = this.aClass16_Sub1_7.anInt4920 + this.aClass16_Sub1_7.anInt4914 * local545 / arg2;
			arg1.anInt5262 = this.aClass16_Sub1_7.anInt4918 * local583 / arg2 + this.aClass16_Sub1_7.anInt4917;
			if (local564 >= this.aClass16_Sub1_7.anInt4931 || this.aClass16_Sub1_7.anInt4931 <= local648) {
				arg1.anInt5264 = this.aClass16_Sub1_7.anInt4918 * (this.anInt3151 + local526) / arg2 + this.aClass16_Sub1_7.anInt4917 - arg1.anInt5263;
				arg1.aBoolean394 = true;
			}
		}
		this.aClass16_Sub1_7.method3894((float) arg2);
		this.aClass16_Sub1_7.method3900();
		this.aClass16_Sub1_7.method3921(local16);
		this.method2687();
		this.method2696();
	}

	@OriginalMember(owner = "client!eea", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3104; local7++) {
			this.anIntArray159[local7] = -this.anIntArray159[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt3095; local29++) {
			this.aShortArray18[local29] = (short) -this.aShortArray18[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt3090; local52++) {
			@Pc(59) short local59 = this.aShortArray16[local52];
			this.aShortArray16[local52] = this.aShortArray25[local52];
			this.aShortArray25[local52] = local59;
		}
		this.method2690();
		this.method2697();
		this.method2692();
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!eea", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean234) {
			this.method2701();
		}
		return this.anInt3087;
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "(I)V")
	private void method2703() {
		if (!this.aBoolean235) {
			return;
		}
		this.aBoolean235 = false;
		if (this.aClass219Array1 == null && this.aClass238Array1 == null && this.aClass145Array1 == null) {
			if (this.anIntArray157 != null && !Static358.method5631(this.anInt3113, this.anInt3127)) {
				if (this.aClass72_3 == null || this.aClass72_3.method2236()) {
					if (!this.aBoolean234) {
						this.method2701();
					}
					this.anIntArray157 = null;
				} else {
					this.aBoolean235 = true;
				}
			}
			if (this.anIntArray160 != null && !Static184.method3511(this.anInt3113, this.anInt3127)) {
				if (this.aClass72_3 == null || this.aClass72_3.method2236()) {
					if (!this.aBoolean234) {
						this.method2701();
					}
					this.anIntArray160 = null;
				} else {
					this.aBoolean235 = true;
				}
			}
			if (this.anIntArray159 != null && !Static577.method8058(this.anInt3127, this.anInt3113)) {
				if (this.aClass72_3 == null || this.aClass72_3.method2236()) {
					if (!this.aBoolean234) {
						this.method2701();
					}
					this.anIntArray159 = null;
				} else {
					this.aBoolean235 = true;
				}
			}
		}
		if (this.aShortArray21 != null && this.anIntArray157 == null && this.anIntArray160 == null && this.anIntArray159 == null) {
			this.aShortArray21 = null;
			this.anIntArray158 = null;
		}
		if (this.aByteArray19 != null && !Static480.method7077(this.anInt3113, this.anInt3127)) {
			label197: {
				label196: {
					@Pc(165) boolean local165;
					if ((this.anInt3127 & 0x37) == 0) {
						if (this.aClass72_4 == null || this.aClass72_4.method2236()) {
							break label196;
						}
						local165 = false;
					} else {
						if (this.aClass72_2 == null || this.aClass72_2.method2236()) {
							break label196;
						}
						local165 = false;
					}
					if (!local165) {
						this.aBoolean235 = true;
						break label197;
					}
				}
				this.aByteArray19 = null;
				this.aShortArray23 = this.aShortArray19 = this.aShortArray18 = null;
			}
		}
		if (this.aShortArray24 != null && !Static103.method2358(this.anInt3113, this.anInt3127)) {
			if (this.aClass72_4 == null || this.aClass72_4.method2236()) {
				this.aShortArray24 = null;
			} else {
				this.aBoolean235 = true;
			}
		}
		if (this.aByteArray18 != null && !Static206.method7640(this.anInt3113, this.anInt3127)) {
			if (this.aClass72_4 == null || this.aClass72_4.method2236()) {
				this.aByteArray18 = null;
			} else {
				this.aBoolean235 = true;
			}
		}
		if (this.aFloatArray38 != null && !Static241.method4438(this.anInt3113, this.anInt3127)) {
			if (this.aClass72_1 == null || this.aClass72_1.method2236()) {
				this.aFloatArray38 = this.aFloatArray39 = null;
			} else {
				this.aBoolean235 = true;
			}
		}
		if (this.aShortArray15 != null && !Static573.method7973(this.anInt3127, this.anInt3113)) {
			if (this.aClass72_4 == null || this.aClass72_4.method2236()) {
				this.aShortArray15 = null;
			} else {
				this.aBoolean235 = true;
			}
		}
		if (this.aShortArray16 != null && !Static204.method3779(this.anInt3127, this.anInt3113)) {
			if ((this.aClass303_1 == null || this.aClass303_1.method7333()) && (this.aClass72_4 == null || this.aClass72_4.method2236())) {
				this.aShortArray16 = this.aShortArray17 = this.aShortArray25 = null;
			} else {
				this.aBoolean235 = true;
			}
		}
		if (this.aShortArray22 != null) {
			if (this.aClass72_3 == null || this.aClass72_3.method2236()) {
				this.aShortArray22 = null;
			} else {
				this.aBoolean235 = true;
			}
		}
		if (this.aShortArray13 != null) {
			if (this.aClass72_4 == null || this.aClass72_4.method2236()) {
				this.aShortArray13 = null;
			} else {
				this.aBoolean235 = true;
			}
		}
		if (this.anIntArrayArray10 != null && !Static349.method5537(this.anInt3113, this.anInt3127)) {
			this.aShortArray14 = null;
			this.anIntArrayArray10 = null;
		}
		if (this.anIntArrayArray9 != null && !Static37.method1269(this.anInt3127, this.anInt3113)) {
			this.aShortArray20 = null;
			this.anIntArrayArray9 = null;
		}
		if (this.lb != null && !Static520.method7418(this.anInt3127, this.anInt3113)) {
			this.lb = null;
		}
		if (this.anIntArray161 != null && (this.anInt3113 & 0x800) == 0 && (this.anInt3113 & 0x40000) == 0) {
			this.anIntArray162 = null;
			this.anIntArray156 = null;
			this.anIntArray161 = null;
		}
	}
}
