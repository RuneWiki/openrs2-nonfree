import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class92_Sub3 extends Class92 {

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_19;

	@OriginalMember(owner = "client!qw", name = "F", descriptor = "Z")
	private boolean aBoolean674;

	@OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
	private int anInt8439;

	@OriginalMember(owner = "client!qw", name = "Z", descriptor = "Z")
	private boolean aBoolean675;

	@OriginalMember(owner = "client!qw", name = "kb", descriptor = "Lclient!mia;")
	private Class204 aClass204_1;

	@OriginalMember(owner = "client!qw", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!qw", name = "mb", descriptor = "Z")
	private boolean aBoolean676;

	@OriginalMember(owner = "client!qw", name = "qb", descriptor = "Lclient!le;")
	private Class182 aClass182_1;

	@OriginalMember(owner = "client!qw", name = "ub", descriptor = "I")
	private int anInt8464;

	@OriginalMember(owner = "client!qw", name = "zb", descriptor = "Lclient!mia;")
	private Class204 aClass204_2;

	@OriginalMember(owner = "client!qw", name = "Cb", descriptor = "Lclient!mia;")
	private Class204 aClass204_3;

	@OriginalMember(owner = "client!qw", name = "Db", descriptor = "Lclient!bga;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!qw", name = "Ib", descriptor = "Lclient!mia;")
	private Class204 aClass204_4;

	@OriginalMember(owner = "client!qw", name = "Ob", descriptor = "I")
	private int anInt8474;

	@OriginalMember(owner = "client!qw", name = "Sb", descriptor = "I")
	private int anInt8478;

	@OriginalMember(owner = "client!qw", name = "Ub", descriptor = "I")
	private int anInt8479;

	@OriginalMember(owner = "client!qw", name = "Zb", descriptor = "I")
	private int anInt8482;

	@OriginalMember(owner = "client!qw", name = "gc", descriptor = "I")
	private int anInt8489;

	@OriginalMember(owner = "client!qw", name = "rc", descriptor = "I")
	private int anInt8495;

	@OriginalMember(owner = "client!qw", name = "zc", descriptor = "I")
	private int anInt8498;

	@OriginalMember(owner = "client!qw", name = "Lc", descriptor = "I")
	private int anInt8504;

	@OriginalMember(owner = "client!qw", name = "Fb", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!qw", name = "nc", descriptor = "I")
	private int anInt8492;

	@OriginalMember(owner = "client!qw", name = "J", descriptor = "I")
	private int anInt8438;

	@OriginalMember(owner = "client!qw", name = "Tb", descriptor = "Z")
	private boolean aBoolean678;

	@OriginalMember(owner = "client!qw", name = "Vb", descriptor = "Z")
	private boolean aBoolean679;

	@OriginalMember(owner = "client!qw", name = "hc", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!qw", name = "Cc", descriptor = "[I")
	private int[] anIntArray440;

	@OriginalMember(owner = "client!qw", name = "N", descriptor = "I")
	private int anInt8442;

	@OriginalMember(owner = "client!qw", name = "C", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!qw", name = "Nb", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!qw", name = "Bb", descriptor = "I")
	private int anInt8467;

	@OriginalMember(owner = "client!qw", name = "eb", descriptor = "[Lclient!cia;")
	private Class49[] aClass49Array5;

	@OriginalMember(owner = "client!qw", name = "sc", descriptor = "[Lclient!fk;")
	private Class103[] aClass103Array5;

	@OriginalMember(owner = "client!qw", name = "L", descriptor = "I")
	private int anInt8440;

	@OriginalMember(owner = "client!qw", name = "T", descriptor = "[Lclient!mc;")
	private Class196[] aClass196Array1;

	@OriginalMember(owner = "client!qw", name = "Wb", descriptor = "[Lclient!ri;")
	private Class292[] aClass292Array1;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "[S")
	private short[] aShortArray136;

	@OriginalMember(owner = "client!qw", name = "Dc", descriptor = "[S")
	private short[] aShortArray146;

	@OriginalMember(owner = "client!qw", name = "lc", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!qw", name = "uc", descriptor = "[S")
	private short[] aShortArray143;

	@OriginalMember(owner = "client!qw", name = "x", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!qw", name = "z", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!qw", name = "W", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!qw", name = "Ab", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!qw", name = "mc", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!qw", name = "Fc", descriptor = "[S")
	private short[] aShortArray147;

	@OriginalMember(owner = "client!qw", name = "V", descriptor = "[F")
	private float[] aFloatArray71;

	@OriginalMember(owner = "client!qw", name = "ab", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!qw", name = "Ac", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!qw", name = "yc", descriptor = "[F")
	private float[] aFloatArray72;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!qw", name = "Hc", descriptor = "[S")
	private short[] aShortArray148;

	@OriginalMember(owner = "client!qw", name = "wc", descriptor = "[S")
	private short[] aShortArray144;

	@OriginalMember(owner = "client!qw", name = "Bc", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!qw", name = "kc", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!qw", name = "bb", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!qw", name = "D", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!qw", name = "wb", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!qw", name = "Kb", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!qw", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!uv;Lclient!lv;IIII)V")
	public Class92_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface7 local11 = arg0.anInterface7_10;
		@Pc(15) int[] local15 = new int[arg1.anInt6635];
		this.anIntArray437 = new int[arg1.anInt6641 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt6635; local24++) {
			if (arg1.aByteArray52 == null || arg1.aByteArray52[local24] != 2) {
				if (arg1.aShortArray108 != null && arg1.aShortArray108[local24] != -1) {
					@Pc(56) Class254 local56 = local11.method6931(arg1.aShortArray108[local24] & 0xFFFF);
					if (((this.anInt8504 & 0x40) == 0 || !local56.aBoolean618) && local56.aBoolean621) {
						continue;
					}
				}
				local15[this.anInt8492++] = local24;
				this.anIntArray437[arg1.aShortArray104[local24]]++;
				this.anIntArray437[arg1.aShortArray109[local24]]++;
				this.anIntArray437[arg1.aShortArray103[local24]]++;
			}
		}
		this.anInt8438 = this.anInt8492;
		@Pc(128) long[] local128 = new long[this.anInt8492];
		@Pc(140) boolean local140 = (this.anInt8482 & 0x100) != 0;
		@Pc(152) int local152;
		@Pc(165) int local165;
		@Pc(339) int local339;
		for (@Pc(142) int local142 = 0; local142 < this.anInt8492; local142++) {
			@Pc(148) int local148 = local15[local142];
			@Pc(150) Class254 local150 = null;
			local152 = 0;
			@Pc(154) byte local154 = 0;
			@Pc(156) byte local156 = 0;
			@Pc(158) byte local158 = 0;
			if (arg1.aClass123Array1 != null) {
				@Pc(163) boolean local163 = false;
				for (local165 = 0; local165 < arg1.aClass123Array1.length; local165++) {
					@Pc(172) Class123 local172 = arg1.aClass123Array1[local165];
					if (local148 == local172.anInt4150) {
						@Pc(185) Class191 local185 = Static129.method2652(local172.anInt4149);
						if (local185.aBoolean521) {
							local163 = true;
						}
						if (local185.anInt6623 != -1) {
							@Pc(201) Class254 local201 = local11.method6931(local185.anInt6623);
							if (local201.anInt7796 == 2) {
								this.aBoolean678 = true;
							}
						}
					}
				}
				if (local163) {
					local128[local142] = Long.MAX_VALUE;
					this.anInt8438--;
					continue;
				}
			}
			@Pc(236) short local236 = -1;
			if (arg1.aShortArray108 != null) {
				local236 = arg1.aShortArray108[local148];
				if (local236 != -1) {
					local150 = local11.method6931(local236 & 0xFFFF);
					if ((this.anInt8504 & 0x40) != 0 && local150.aBoolean618) {
						local150 = null;
						local236 = -1;
					} else {
						local156 = local150.aByte95;
						local158 = local150.aByte94;
					}
				}
			}
			@Pc(301) boolean local301 = arg1.aByteArray51 != null && arg1.aByteArray51[local148] != 0 || local150 != null && local150.anInt7796 != 0;
			if ((local140 || local301) && arg1.aByteArray50 != null) {
				local152 += arg1.aByteArray50[local148] << 17;
			}
			if (local301) {
				local152 += 65536;
			}
			local152 += (local156 & 0xFF) << 8;
			local339 = local154 + ((local236 & 0xFFFF) << 16);
			local152 += local158 & 0xFF;
			@Pc(351) int local351 = local339 + (local142 & 0xFFFF);
			local128[local142] = (long) local351 + ((long) local152 << 32);
			this.aBoolean678 |= local301;
			this.aBoolean679 |= local150 != null && (local150.aByte96 != 0 || local150.aByte100 != 0);
		}
		Static163.method3150(local15, local128);
		this.aShortArray140 = arg1.aShortArray107;
		this.anIntArray440 = arg1.anIntArray314;
		this.anInt8442 = arg1.anInt6641;
		this.anIntArray434 = arg1.anIntArray317;
		this.anIntArray438 = arg1.anIntArray319;
		this.anInt8467 = arg1.anInt6644;
		this.aClass49Array5 = arg1.aClass49Array4;
		@Pc(430) Class265[] local430 = new Class265[this.anInt8442];
		this.aClass103Array5 = arg1.aClass103Array4;
		@Pc(454) int local454;
		@Pc(468) int local468;
		@Pc(514) int local514;
		if (arg1.aClass123Array1 != null) {
			this.anInt8440 = arg1.aClass123Array1.length;
			this.aClass196Array1 = new Class196[this.anInt8440];
			this.aClass292Array1 = new Class292[this.anInt8440];
			for (local454 = 0; local454 < this.anInt8440; local454++) {
				@Pc(461) Class123 local461 = arg1.aClass123Array1[local454];
				@Pc(466) Class191 local466 = Static129.method2652(local461.anInt4149);
				local468 = -1;
				for (@Pc(470) int local470 = 0; local470 < this.anInt8492; local470++) {
					if (local15[local470] == local461.anInt4150) {
						local468 = local470;
						break;
					}
				}
				if (local468 == -1) {
					throw new RuntimeException();
				}
				local514 = Static376.anIntArray336[arg1.aShortArray110[local461.anInt4150] & 0xFFFF] & 0xFFFFFF;
				@Pc(532) int local532 = local514 | 255 - (arg1.aByteArray51 == null ? 0 : arg1.aByteArray51[local461.anInt4150]) << 24;
				this.aClass292Array1[local454] = new Class292(local468, arg1.aShortArray104[local461.anInt4150], arg1.aShortArray109[local461.anInt4150], arg1.aShortArray103[local461.anInt4150], local466.anInt6625, local466.anInt6628, local466.anInt6623, local466.anInt6631, local466.anInt6627, local466.aBoolean521, local466.aBoolean522, local461.anInt4151);
				this.aClass196Array1[local454] = new Class196(local532);
			}
		}
		local454 = this.anInt8492 * 3;
		Static118.aLongArray3 = new long[local454];
		this.aShortArray136 = new short[local454];
		this.aShortArray146 = new short[local454];
		this.aShortArray141 = new short[this.anInt8492];
		this.aShortArray143 = new short[local454];
		this.aShortArray137 = new short[local454];
		this.aShort102 = (short) arg4;
		this.aShortArray138 = new short[this.anInt8492];
		this.aByteArray78 = new byte[local454];
		this.aShortArray142 = new short[this.anInt8492];
		this.aShortArray147 = new short[this.anInt8492];
		this.aFloatArray71 = new float[local454];
		if (arg1.aShortArray105 != null) {
			this.aShortArray139 = new short[this.anInt8492];
		}
		this.aShortArray145 = new short[local454];
		this.aFloatArray72 = new float[local454];
		this.aShort101 = (short) arg3;
		this.aShortArray148 = new short[local454];
		this.aShortArray144 = new short[this.anInt8492];
		this.aByteArray79 = new byte[this.anInt8492];
		local152 = 0;
		for (local339 = 0; local339 < arg1.anInt6641; local339++) {
			local468 = this.anIntArray437[local339];
			this.anIntArray437[local339] = local152;
			local430[local339] = new Class265();
			local152 += local468;
		}
		this.anIntArray437[arg1.anInt6641] = local152;
		@Pc(726) Class264 local726 = Static239.method4874(local15, arg1, this.anInt8492);
		@Pc(730) Class381[] local730 = new Class381[arg1.anInt6635];
		@Pc(770) int local770;
		@Pc(780) int local780;
		@Pc(791) int local791;
		@Pc(749) short local749;
		@Pc(760) int local760;
		for (local514 = 0; local514 < arg1.anInt6635; local514++) {
			@Pc(739) short local739 = arg1.aShortArray104[local514];
			@Pc(744) short local744 = arg1.aShortArray109[local514];
			local749 = arg1.aShortArray103[local514];
			local760 = this.anIntArray434[local744] - this.anIntArray434[local739];
			local770 = this.anIntArray440[local744] - this.anIntArray440[local739];
			local780 = this.anIntArray438[local744] - this.anIntArray438[local739];
			local791 = this.anIntArray434[local749] - this.anIntArray434[local739];
			@Pc(801) int local801 = this.anIntArray440[local749] - this.anIntArray440[local739];
			@Pc(812) int local812 = this.anIntArray438[local749] - this.anIntArray438[local739];
			@Pc(821) int local821 = local770 * local812 - local780 * local801;
			@Pc(829) int local829 = local791 * local780 - local760 * local812;
			@Pc(838) int local838;
			for (local838 = local760 * local801 - local791 * local770; local821 > 8192 || local829 > 8192 || local838 > 8192 || local821 < -8192 || local829 < -8192 || local838 < -8192; local838 >>= 0x1) {
				local829 >>= 0x1;
				local821 >>= 0x1;
			}
			@Pc(894) int local894 = (int) Math.sqrt((double) (local821 * local821 + local829 * local829 + local838 * local838));
			if (local894 <= 0) {
				local894 = 1;
			}
			local829 = local829 * 256 / local894;
			local838 = local838 * 256 / local894;
			local821 = local821 * 256 / local894;
			@Pc(929) byte local929 = arg1.aByteArray52 == null ? 0 : arg1.aByteArray52[local514];
			if (local929 == 0) {
				@Pc(962) Class265 local962 = local430[local739];
				local962.anInt7985++;
				local962.anInt7982 += local821;
				local962.anInt7980 += local838;
				local962.anInt7984 += local829;
				@Pc(990) Class265 local990 = local430[local744];
				local990.anInt7984 += local829;
				local990.anInt7982 += local821;
				local990.anInt7985++;
				local990.anInt7980 += local838;
				@Pc(1018) Class265 local1018 = local430[local749];
				local1018.anInt7980 += local838;
				local1018.anInt7984 += local829;
				local1018.anInt7982 += local821;
				local1018.anInt7985++;
			} else if (local929 == 1) {
				@Pc(947) Class381 local947 = local730[local514] = new Class381();
				local947.anInt10764 = local838;
				local947.anInt10758 = local829;
				local947.anInt10760 = local821;
			}
		}
		@Pc(1059) int local1059;
		@Pc(1102) short local1102;
		for (local165 = 0; local165 < this.anInt8492; local165++) {
			local1059 = local15[local165];
			@Pc(1066) int local1066 = arg1.aShortArray110[local1059] & 0xFFFF;
			if (arg1.aByteArray53 == null) {
				local760 = -1;
			} else {
				local760 = arg1.aByteArray53[local1059];
			}
			if (arg1.aByteArray51 == null) {
				local770 = 0;
			} else {
				local770 = arg1.aByteArray51[local1059] & 0xFF;
			}
			local1102 = arg1.aShortArray108 == null ? -1 : arg1.aShortArray108[local1059];
			if (local1102 != -1 && (this.anInt8504 & 0x40) != 0) {
				@Pc(1118) Class254 local1118 = local11.method6931(local1102 & 0xFFFF);
				if (local1118.aBoolean618) {
					local1102 = -1;
				}
			}
			@Pc(1125) float local1125 = 0.0F;
			@Pc(1127) float local1127 = 0.0F;
			@Pc(1129) float local1129 = 0.0F;
			@Pc(1131) float local1131 = 0.0F;
			@Pc(1133) float local1133 = 0.0F;
			@Pc(1135) float local1135 = 0.0F;
			@Pc(1137) byte local1137 = 0;
			@Pc(1139) byte local1139 = 0;
			@Pc(1141) int local1141 = 0;
			@Pc(1157) byte local1157;
			@Pc(1174) short local1174;
			@Pc(1965) short local1965;
			@Pc(1970) short local1970;
			if (local1102 != -1) {
				if (local760 == -1) {
					local1129 = 1.0F;
					local1135 = 0.0F;
					local1125 = 0.0F;
					local1131 = 1.0F;
					local1133 = 0.0F;
					local1127 = 1.0F;
					local1137 = 1;
					local1139 = 2;
				} else {
					local760 &= 0xFF;
					local1157 = arg1.aByteArray48[local760];
					@Pc(1164) short local1164;
					@Pc(1169) short local1169;
					@Pc(1207) float local1207;
					@Pc(1221) float local1221;
					@Pc(1229) float local1229;
					@Pc(1329) float local1329;
					@Pc(1337) float local1337;
					@Pc(1345) float local1345;
					@Pc(1368) float local1368;
					@Pc(1391) float local1391;
					@Pc(1414) float local1414;
					if (local1157 == 0) {
						local1164 = arg1.aShortArray104[local1059];
						local1169 = arg1.aShortArray109[local1059];
						local1174 = arg1.aShortArray103[local1059];
						local1965 = arg1.aShortArray106[local760];
						local1970 = arg1.aShortArray111[local760];
						@Pc(1975) short local1975 = arg1.aShortArray102[local760];
						@Pc(1981) float local1981 = (float) arg1.anIntArray317[local1965];
						@Pc(1987) float local1987 = (float) arg1.anIntArray314[local1965];
						local1207 = (float) arg1.anIntArray319[local1965];
						local1221 = (float) arg1.anIntArray317[local1970] - local1981;
						local1229 = (float) arg1.anIntArray314[local1970] - local1987;
						@Pc(2019) float local2019 = (float) arg1.anIntArray319[local1970] - local1207;
						@Pc(2028) float local2028 = (float) arg1.anIntArray317[local1975] - local1981;
						@Pc(2036) float local2036 = (float) arg1.anIntArray314[local1975] - local1987;
						@Pc(2045) float local2045 = (float) arg1.anIntArray319[local1975] - local1207;
						@Pc(2053) float local2053 = (float) arg1.anIntArray317[local1164] - local1981;
						@Pc(2061) float local2061 = (float) arg1.anIntArray314[local1164] - local1987;
						@Pc(2070) float local2070 = (float) arg1.anIntArray319[local1164] - local1207;
						@Pc(2078) float local2078 = (float) arg1.anIntArray317[local1169] - local1981;
						@Pc(2087) float local2087 = (float) arg1.anIntArray314[local1169] - local1987;
						local1329 = (float) arg1.anIntArray319[local1169] - local1207;
						local1337 = (float) arg1.anIntArray317[local1174] - local1981;
						local1345 = (float) arg1.anIntArray314[local1174] - local1987;
						local1368 = (float) arg1.anIntArray319[local1174] - local1207;
						local1391 = local1229 * local2045 - local2036 * local2019;
						local1414 = local2019 * local2028 - local1221 * local2045;
						@Pc(2145) float local2145 = local1221 * local2036 - local1229 * local2028;
						@Pc(2153) float local2153 = local2036 * local2145 - local1414 * local2045;
						@Pc(2161) float local2161 = local2045 * local1391 - local2145 * local2028;
						@Pc(2169) float local2169 = local1414 * local2028 - local2036 * local1391;
						@Pc(2183) float local2183 = 1.0F / (local2169 * local2019 + local1221 * local2153 + local1229 * local2161);
						local1133 = (local1368 * local2169 + local1345 * local2161 + local1337 * local2153) * local2183;
						local1129 = (local2153 * local2078 + local2087 * local2161 + local2169 * local1329) * local2183;
						local1125 = local2183 * (local2061 * local2161 + local2053 * local2153 + local2070 * local2169);
						@Pc(2234) float local2234 = local1414 * local1221 - local1229 * local1391;
						@Pc(2242) float local2242 = local1229 * local2145 - local1414 * local2019;
						@Pc(2251) float local2251 = local2019 * local1391 - local1221 * local2145;
						@Pc(2265) float local2265 = 1.0F / (local2036 * local2251 + local2242 * local2028 + local2234 * local2045);
						local1131 = (local2251 * local2087 + local2242 * local2078 + local1329 * local2234) * local2265;
						local1127 = (local2070 * local2234 + local2061 * local2251 + local2242 * local2053) * local2265;
						local1135 = (local2251 * local1345 + local1337 * local2242 + local2234 * local1368) * local2265;
					} else {
						local1164 = arg1.aShortArray104[local1059];
						local1169 = arg1.aShortArray109[local1059];
						local1174 = arg1.aShortArray103[local1059];
						@Pc(1179) int local1179 = local726.anIntArray415[local760];
						@Pc(1184) int local1184 = local726.anIntArray417[local760];
						@Pc(1189) int local1189 = local726.anIntArray416[local760];
						@Pc(1194) float[] local1194 = local726.aFloatArrayArray11[local760];
						@Pc(1199) byte local1199 = arg1.aByteArray49[local760];
						local1207 = (float) arg1.anIntArray316[local760] / 256.0F;
						if (local1157 == 1) {
							local1221 = (float) arg1.anIntArray311[local760] / 1024.0F;
							Static443.method6756(arg1.anIntArray317[local1164], local1189, arg1.anIntArray319[local1164], local1184, arg1.anIntArray314[local1164], local1194, local1221, local1199, local1179, local1207, Static450.aFloatArray68);
							local1127 = Static450.aFloatArray68[1];
							local1125 = Static450.aFloatArray68[0];
							Static443.method6756(arg1.anIntArray317[local1169], local1189, arg1.anIntArray319[local1169], local1184, arg1.anIntArray314[local1169], local1194, local1221, local1199, local1179, local1207, Static450.aFloatArray68);
							local1131 = Static450.aFloatArray68[1];
							local1129 = Static450.aFloatArray68[0];
							Static443.method6756(arg1.anIntArray317[local1174], local1189, arg1.anIntArray319[local1174], local1184, arg1.anIntArray314[local1174], local1194, local1221, local1199, local1179, local1207, Static450.aFloatArray68);
							local1133 = Static450.aFloatArray68[0];
							local1135 = Static450.aFloatArray68[1];
							local1229 = local1221 / 2.0F;
							if ((local1199 & 0x1) == 0) {
								if (local1129 - local1125 > local1229) {
									local1137 = 1;
									local1129 -= local1221;
								} else if (local1229 < local1125 - local1129) {
									local1137 = 2;
									local1129 += local1221;
								}
								if (local1229 < local1133 - local1125) {
									local1139 = 1;
									local1133 -= local1221;
								} else if (local1229 < local1125 - local1133) {
									local1133 += local1221;
									local1139 = 2;
								}
							} else {
								if (local1229 < local1135 - local1127) {
									local1135 -= local1221;
									local1139 = 1;
								} else if (local1229 < local1127 - local1135) {
									local1139 = 2;
									local1135 += local1221;
								}
								if (local1229 < local1131 - local1127) {
									local1131 -= local1221;
									local1137 = 1;
								} else if (local1229 < local1127 - local1131) {
									local1131 += local1221;
									local1137 = 2;
								}
							}
						} else if (local1157 == 2) {
							local1221 = (float) arg1.anIntArray313[local760] / 256.0F;
							local1229 = (float) arg1.anIntArray309[local760] / 256.0F;
							@Pc(1240) int local1240 = arg1.anIntArray317[local1169] - arg1.anIntArray317[local1164];
							@Pc(1251) int local1251 = arg1.anIntArray314[local1169] - arg1.anIntArray314[local1164];
							@Pc(1262) int local1262 = arg1.anIntArray319[local1169] - arg1.anIntArray319[local1164];
							@Pc(1273) int local1273 = arg1.anIntArray317[local1174] - arg1.anIntArray317[local1164];
							@Pc(1284) int local1284 = arg1.anIntArray314[local1174] - arg1.anIntArray314[local1164];
							@Pc(1295) int local1295 = arg1.anIntArray319[local1174] - arg1.anIntArray319[local1164];
							@Pc(1304) int local1304 = local1251 * local1295 - local1262 * local1284;
							@Pc(1313) int local1313 = local1262 * local1273 - local1240 * local1295;
							@Pc(1321) int local1321 = local1284 * local1240 - local1273 * local1251;
							local1329 = 64.0F / (float) arg1.anIntArray310[local760];
							local1337 = 64.0F / (float) arg1.anIntArray315[local760];
							local1345 = 64.0F / (float) arg1.anIntArray311[local760];
							local1368 = ((float) local1313 * local1194[1] + local1194[0] * (float) local1304 + local1194[2] * (float) local1321) / local1329;
							local1391 = (local1194[4] * (float) local1313 + (float) local1304 * local1194[3] + local1194[5] * (float) local1321) / local1337;
							local1414 = (local1194[6] * (float) local1304 + (float) local1313 * local1194[7] + local1194[8] * (float) local1321) / local1345;
							local1141 = Static130.method8097(local1368, local1414, local1391);
							Static46.method1556(arg1.anIntArray314[local1164], local1229, local1199, local1184, local1207, local1221, local1194, local1141, Static450.aFloatArray68, local1189, arg1.anIntArray319[local1164], local1179, arg1.anIntArray317[local1164]);
							local1127 = Static450.aFloatArray68[1];
							local1125 = Static450.aFloatArray68[0];
							Static46.method1556(arg1.anIntArray314[local1169], local1229, local1199, local1184, local1207, local1221, local1194, local1141, Static450.aFloatArray68, local1189, arg1.anIntArray319[local1169], local1179, arg1.anIntArray317[local1169]);
							local1129 = Static450.aFloatArray68[0];
							local1131 = Static450.aFloatArray68[1];
							Static46.method1556(arg1.anIntArray314[local1174], local1229, local1199, local1184, local1207, local1221, local1194, local1141, Static450.aFloatArray68, local1189, arg1.anIntArray319[local1174], local1179, arg1.anIntArray317[local1174]);
							local1133 = Static450.aFloatArray68[0];
							local1135 = Static450.aFloatArray68[1];
						} else if (local1157 == 3) {
							Static430.method6638(Static450.aFloatArray68, arg1.anIntArray314[local1164], local1199, local1189, local1194, arg1.anIntArray319[local1164], local1184, local1207, arg1.anIntArray317[local1164], local1179);
							local1127 = Static450.aFloatArray68[1];
							local1125 = Static450.aFloatArray68[0];
							Static430.method6638(Static450.aFloatArray68, arg1.anIntArray314[local1169], local1199, local1189, local1194, arg1.anIntArray319[local1169], local1184, local1207, arg1.anIntArray317[local1169], local1179);
							local1131 = Static450.aFloatArray68[1];
							local1129 = Static450.aFloatArray68[0];
							Static430.method6638(Static450.aFloatArray68, arg1.anIntArray314[local1174], local1199, local1189, local1194, arg1.anIntArray319[local1174], local1184, local1207, arg1.anIntArray317[local1174], local1179);
							local1135 = Static450.aFloatArray68[1];
							local1133 = Static450.aFloatArray68[0];
							if ((local1199 & 0x1) == 0) {
								if (local1133 - local1125 > 0.5F) {
									local1139 = 1;
									local1133--;
								} else if (local1125 - local1133 > 0.5F) {
									local1139 = 2;
									local1133++;
								}
								if (local1129 - local1125 > 0.5F) {
									local1129--;
									local1137 = 1;
								} else if (local1125 - local1129 > 0.5F) {
									local1137 = 2;
									local1129++;
								}
							} else {
								if (local1135 - local1127 > 0.5F) {
									local1139 = 1;
									local1135--;
								} else if (local1127 - local1135 > 0.5F) {
									local1135++;
									local1139 = 2;
								}
								if (local1131 - local1127 > 0.5F) {
									local1137 = 1;
									local1131--;
								} else if (local1127 - local1131 > 0.5F) {
									local1137 = 2;
									local1131++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray52 == null) {
				local1157 = 0;
			} else {
				local1157 = arg1.aByteArray52[local1059];
			}
			if (local1157 == 0) {
				@Pc(2491) long local2491 = (long) (local760 << 2) + ((long) (local1141 << 24) + (long) (local1066 << 8) + (long) local770 << 32);
				local1174 = arg1.aShortArray104[local1059];
				local1965 = arg1.aShortArray109[local1059];
				local1970 = arg1.aShortArray103[local1059];
				@Pc(2510) Class265 local2510 = local430[local1174];
				this.aShortArray142[local165] = this.method7090(local1125, local165, local2491, local2510.anInt7982, local1174, local2510.anInt7984, local2510.anInt7980, arg1, local2510.anInt7985, local1127);
				@Pc(2535) Class265 local2535 = local430[local1965];
				this.aShortArray138[local165] = this.method7090(local1129, local165, local2491 + (long) local1137, local2535.anInt7982, local1965, local2535.anInt7984, local2535.anInt7980, arg1, local2535.anInt7985, local1131);
				@Pc(2563) Class265 local2563 = local430[local1970];
				this.aShortArray147[local165] = this.method7090(local1133, local165, (long) local1139 + local2491, local2563.anInt7982, local1970, local2563.anInt7984, local2563.anInt7980, arg1, local2563.anInt7985, local1135);
			} else if (local1157 == 1) {
				@Pc(2349) Class381 local2349 = local730[local1059];
				@Pc(2393) long local2393 = ((long) local770 + (long) (local1141 << 24) + (long) (local1066 << 8) << 32) + (long) ((local2349.anInt10764 + 256 << 22) + (local760 << 2) + (local2349.anInt10760 <= 0 ? 2048 : 1024) + (local2349.anInt10758 - -256 << 12));
				this.aShortArray142[local165] = this.method7090(local1125, local165, local2393, local2349.anInt10760, arg1.aShortArray104[local1059], local2349.anInt10758, local2349.anInt10764, arg1, 0, local1127);
				this.aShortArray138[local165] = this.method7090(local1129, local165, (long) local1137 + local2393, local2349.anInt10760, arg1.aShortArray109[local1059], local2349.anInt10758, local2349.anInt10764, arg1, 0, local1131);
				this.aShortArray147[local165] = this.method7090(local1133, local165, local2393 + (long) local1139, local2349.anInt10760, arg1.aShortArray103[local1059], local2349.anInt10758, local2349.anInt10764, arg1, 0, local1135);
			}
			if (arg1.aByteArray51 != null) {
				this.aByteArray79[local165] = arg1.aByteArray51[local1059];
			}
			if (arg1.aShortArray105 != null) {
				this.aShortArray139[local165] = arg1.aShortArray105[local1059];
			}
			this.aShortArray141[local165] = arg1.aShortArray110[local1059];
			this.aShortArray144[local165] = local1102;
		}
		if (this.anInt8438 > 0) {
			local1059 = 1;
			local749 = this.aShortArray144[0];
			for (local760 = 0; local760 < this.anInt8438; local760++) {
				@Pc(2653) short local2653 = this.aShortArray144[local760];
				if (local2653 != local749) {
					local749 = local2653;
					local1059++;
				}
			}
			this.anIntArray439 = new int[local1059];
			this.anIntArray436 = new int[local1059];
			this.anIntArray435 = new int[local1059 + 1];
			this.anIntArray435[0] = 0;
			local770 = this.anInt8474;
			local1102 = 0;
			local749 = this.aShortArray144[0];
			local1059 = 0;
			for (local791 = 0; local791 < this.anInt8438; local791++) {
				@Pc(2704) short local2704 = this.aShortArray144[local791];
				if (local749 != local2704) {
					this.anIntArray439[local1059] = local770;
					this.anIntArray436[local1059] = local1102 + 1 - local770;
					local1059++;
					this.anIntArray435[local1059] = local791;
					local749 = local2704;
					local770 = this.anInt8474;
					local1102 = 0;
				}
				@Pc(2739) short local2739 = this.aShortArray142[local791];
				if (local1102 < local2739) {
					local1102 = local2739;
				}
				if (local770 > local2739) {
					local770 = local2739;
				}
				local2739 = this.aShortArray138[local791];
				if (local2739 > local1102) {
					local1102 = local2739;
				}
				if (local770 > local2739) {
					local770 = local2739;
				}
				local2739 = this.aShortArray147[local791];
				if (local2739 < local770) {
					local770 = local2739;
				}
				if (local2739 > local1102) {
					local1102 = local2739;
				}
			}
			this.anIntArray439[local1059] = local770;
			this.anIntArray436[local1059] = local1102 + 1 - local770;
			local1059++;
			this.anIntArray435[local1059] = this.anInt8438;
		}
		Static118.aLongArray3 = null;
		this.aShortArray136 = Static398.method6264(this.aShortArray136, this.anInt8474);
		this.aShortArray137 = Static398.method6264(this.aShortArray137, this.anInt8474);
		this.aShortArray143 = Static398.method6264(this.aShortArray143, this.anInt8474);
		this.aShortArray145 = Static398.method6264(this.aShortArray145, this.anInt8474);
		this.aShortArray148 = Static398.method6264(this.aShortArray148, this.anInt8474);
		this.aByteArray78 = Static588.method8112(this.anInt8474, this.aByteArray78);
		this.aFloatArray72 = Static614.method8443(this.anInt8474, this.aFloatArray72);
		this.aFloatArray71 = Static614.method8443(this.anInt8474, this.aFloatArray71);
		if (arg1.anIntArray318 != null && Static452.method6868(arg2, this.anInt8504)) {
			this.anIntArrayArray43 = arg1.method5552(false);
		}
		if (arg1.aClass123Array1 != null && Static6.method445(arg2, this.anInt8504)) {
			this.anIntArrayArray44 = arg1.method5553();
		}
		if (arg1.anIntArray312 != null && Static245.method4395(this.anInt8504, arg2)) {
			local1059 = 0;
			@Pc(2926) int[] local2926 = new int[256];
			for (local760 = 0; local760 < this.anInt8492; local760++) {
				local770 = arg1.anIntArray312[local15[local760]];
				if (local770 >= 0) {
					@Pc(2943) int local2943 = local2926[local770]++;
					if (local1059 < local770) {
						local1059 = local770;
					}
				}
			}
			this.anIntArrayArray42 = new int[local1059 + 1][];
			for (local770 = 0; local770 <= local1059; local770++) {
				this.anIntArrayArray42[local770] = new int[local2926[local770]];
				local2926[local770] = 0;
			}
			for (local780 = 0; local780 < this.anInt8492; local780++) {
				local791 = arg1.anIntArray312[local15[local780]];
				if (local791 >= 0) {
					this.anIntArrayArray42[local791][local2926[local791]++] = local780;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!uv;IIZZ)V")
	public Class92_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8438 = 0;
		this.aBoolean676 = false;
		this.anInt8442 = 0;
		this.anInt8467 = 0;
		this.aBoolean675 = false;
		this.aBoolean674 = true;
		this.anInt8492 = 0;
		this.anInt8474 = 0;
		this.aBoolean679 = false;
		this.aBoolean678 = false;
		this.aBoolean675 = arg4;
		this.anInt8504 = arg2;
		this.anInt8482 = arg1;
		this.aClass5_Sub2_19 = arg0;
		if (arg3 || Static166.method8084(this.anInt8504, this.anInt8482)) {
			this.aClass204_4 = new Class204(Static422.method6593(this.anInt8482, this.anInt8504));
		}
		if (arg3 || Static9.method494(this.anInt8482, this.anInt8504)) {
			this.aClass204_3 = new Class204(Static190.method3512(this.anInt8482, this.anInt8504));
		}
		if (arg3 || Static268.method4837(this.anInt8504, this.anInt8482)) {
			this.aClass204_1 = new Class204(Static290.method5003(this.anInt8504, this.anInt8482));
		}
		if (arg3 || Static5.method442(this.anInt8482, this.anInt8504)) {
			this.aClass204_2 = new Class204(Static593.method8180(this.anInt8482, this.anInt8504));
		}
		if (arg3 || Static272.method4854(this.anInt8482, this.anInt8504)) {
			this.aClass27_1 = new Class27(Static487.method7138(this.anInt8482, this.anInt8504));
		}
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)V")
	private void method7073() {
		if (this.aClass204_1 != null) {
			this.aClass204_1.aBoolean547 = false;
		}
	}

	@OriginalMember(owner = "client!qw", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean676) {
			this.method7082();
		}
		return this.anInt8498;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!hba;Lclient!lda;I)V")
	@Override
	public void method7053(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class9_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8474 == 0) {
			return;
		}
		@Pc(13) Class115_Sub3 local13 = this.aClass5_Sub2_19.aClass115_Sub3_16;
		if (!this.aBoolean676) {
			this.method7082();
		}
		@Pc(22) Class115_Sub3 local22 = (Class115_Sub3) arg0;
		Static393.aFloat142 = local13.aFloat153 * local22.aFloat147 + local13.aFloat148 * local22.aFloat151 + local22.aFloat153 * local13.aFloat145;
		Static556.aFloat182 = local13.aFloat144 + local22.aFloat143 * local13.aFloat148 + local22.aFloat149 * local13.aFloat153 + local22.aFloat144 * local13.aFloat145;
		@Pc(69) float local69 = Static556.aFloat182 + (float) this.anInt8498 * Static393.aFloat142;
		@Pc(77) float local77 = (float) this.anInt8495 * Static393.aFloat142 + Static556.aFloat182;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.anInt8479 + local77;
			local94 = local69 + (float) this.anInt8479;
		} else {
			local88 = (float) -this.anInt8479 + local69;
			local94 = local77 + (float) this.anInt8479;
		}
		if (local88 >= this.aClass5_Sub2_19.aFloat92 || local94 <= (float) this.aClass5_Sub2_19.anInt4893) {
			return;
		}
		Static496.aFloat163 = local13.aFloat143 + local22.aFloat144 * local13.aFloat146 + local22.aFloat149 * local13.aFloat151 + local22.aFloat143 * local13.aFloat152;
		Static462.aFloat162 = local22.aFloat153 * local13.aFloat146 + local13.aFloat151 * local22.aFloat147 + local22.aFloat151 * local13.aFloat152;
		@Pc(171) float local171 = Static462.aFloat162 * (float) this.anInt8498 + Static496.aFloat163;
		@Pc(179) float local179 = Static462.aFloat162 * (float) this.anInt8495 + Static496.aFloat163;
		@Pc(206) float local206;
		@Pc(194) float local194;
		if (local179 < local171) {
			local194 = (local171 + (float) this.anInt8479) * (float) this.aClass5_Sub2_19.anInt4873;
			local206 = (local179 - (float) this.anInt8479) * (float) this.aClass5_Sub2_19.anInt4873;
		} else {
			local194 = (local179 + (float) this.anInt8479) * (float) this.aClass5_Sub2_19.anInt4873;
			local206 = (float) this.aClass5_Sub2_19.anInt4873 * ((float) -this.anInt8479 + local171);
		}
		if (this.aClass5_Sub2_19.aFloat104 <= local206 / local94 || this.aClass5_Sub2_19.aFloat102 >= local194 / local94) {
			return;
		}
		Static623.aFloat185 = local13.aFloat154 * local22.aFloat151 + local13.aFloat147 * local22.aFloat147 + local22.aFloat153 * local13.aFloat150;
		Static335.aFloat132 = local13.aFloat149 + local22.aFloat144 * local13.aFloat150 + local22.aFloat143 * local13.aFloat154 + local13.aFloat147 * local22.aFloat149;
		@Pc(295) float local295 = Static335.aFloat132 + (float) this.anInt8498 * Static623.aFloat185;
		@Pc(303) float local303 = Static335.aFloat132 + Static623.aFloat185 * (float) this.anInt8495;
		@Pc(318) float local318;
		@Pc(329) float local329;
		if (local303 < local295) {
			local318 = (local303 - (float) this.anInt8479) * (float) this.aClass5_Sub2_19.anInt4872;
			local329 = (float) this.aClass5_Sub2_19.anInt4872 * ((float) this.anInt8479 + local295);
		} else {
			local318 = (float) this.aClass5_Sub2_19.anInt4872 * (local295 - (float) this.anInt8479);
			local329 = (float) this.aClass5_Sub2_19.anInt4872 * ((float) this.anInt8479 + local303);
		}
		if (this.aClass5_Sub2_19.aFloat94 <= local318 / local94 || this.aClass5_Sub2_19.aFloat97 >= local329 / local94) {
			return;
		}
		if (arg1 != null || this.aClass292Array1 != null) {
			Static82.aFloat67 = local13.aFloat152 * local22.aFloat146 + local22.aFloat150 * local13.aFloat151 + local22.aFloat145 * local13.aFloat146;
			Static379.aFloat139 = local13.aFloat148 * local22.aFloat152 + local22.aFloat154 * local13.aFloat153 + local22.aFloat148 * local13.aFloat145;
			Static49.aFloat59 = local13.aFloat151 * local22.aFloat154 + local22.aFloat152 * local13.aFloat152 + local13.aFloat146 * local22.aFloat148;
			Static224.aFloat117 = local13.aFloat147 * local22.aFloat154 + local13.aFloat154 * local22.aFloat152 + local22.aFloat148 * local13.aFloat150;
			Static180.aFloat88 = local22.aFloat145 * local13.aFloat150 + local13.aFloat154 * local22.aFloat146 + local22.aFloat150 * local13.aFloat147;
			Static259.aFloat137 = local13.aFloat153 * local22.aFloat150 + local13.aFloat148 * local22.aFloat146 + local13.aFloat145 * local22.aFloat145;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(498) int local498 = this.anInt8439 + this.anInt8464 >> 1;
			@Pc(506) int local506 = this.anInt8478 + this.lb >> 1;
			@Pc(525) int local525 = (int) (Static82.aFloat67 * (float) local506 + (float) this.anInt8498 * Static462.aFloat162 + (float) local498 * Static49.aFloat59 + Static496.aFloat163);
			@Pc(544) int local544 = (int) ((float) this.anInt8498 * Static623.aFloat185 + Static335.aFloat132 + Static224.aFloat117 * (float) local498 + (float) local506 * Static180.aFloat88);
			@Pc(563) int local563 = (int) (Static556.aFloat182 + (float) local498 * Static379.aFloat139 + (float) this.anInt8498 * Static393.aFloat142 + (float) local506 * Static259.aFloat137);
			if (local563 < this.aClass5_Sub2_19.anInt4893) {
				local488 = true;
			} else {
				arg1.anInt6271 = this.aClass5_Sub2_19.anInt4894 + this.aClass5_Sub2_19.anInt4873 * local525 / local563;
				arg1.anInt6273 = this.aClass5_Sub2_19.anInt4871 + this.aClass5_Sub2_19.anInt4872 * local544 / local563;
			}
			@Pc(621) int local621 = (int) (Static82.aFloat67 * (float) local506 + (float) local498 * Static49.aFloat59 + Static496.aFloat163 + (float) this.anInt8495 * Static462.aFloat162);
			@Pc(640) int local640 = (int) ((float) local506 * Static180.aFloat88 + (float) local498 * Static224.aFloat117 + Static335.aFloat132 + (float) this.anInt8495 * Static623.aFloat185);
			@Pc(659) int local659 = (int) ((float) local498 * Static379.aFloat139 + Static556.aFloat182 + (float) this.anInt8495 * Static393.aFloat142 + (float) local506 * Static259.aFloat137);
			if (local659 < this.aClass5_Sub2_19.anInt4893) {
				local488 = true;
			} else {
				arg1.anInt6270 = this.aClass5_Sub2_19.anInt4894 + local621 * this.aClass5_Sub2_19.anInt4873 / local659;
				arg1.anInt6272 = this.aClass5_Sub2_19.anInt4871 + this.aClass5_Sub2_19.anInt4872 * local640 / local659;
			}
			if (local488) {
				if (this.aClass5_Sub2_19.anInt4893 > local563 && this.aClass5_Sub2_19.anInt4893 > local659) {
					local490 = false;
				} else {
					@Pc(738) int local738;
					@Pc(749) int local749;
					@Pc(759) int local759;
					if (local563 < this.aClass5_Sub2_19.anInt4893) {
						local738 = (local659 - this.aClass5_Sub2_19.anInt4893 << 16) / (local659 - local563);
						local749 = local621 + ((local621 - local525) * local738 >> 16);
						local759 = (local738 * (local640 - local544) >> 16) + local640;
						arg1.anInt6271 = local749 * this.aClass5_Sub2_19.anInt4873 / this.aClass5_Sub2_19.anInt4893 + this.aClass5_Sub2_19.anInt4894;
						arg1.anInt6273 = this.aClass5_Sub2_19.anInt4871 + this.aClass5_Sub2_19.anInt4872 * local759 / this.aClass5_Sub2_19.anInt4893;
					} else if (this.aClass5_Sub2_19.anInt4893 > local659) {
						local738 = (local563 - this.aClass5_Sub2_19.anInt4893 << 16) / (local563 - local659);
						local749 = local525 + ((local525 - local621) * local738 >> 16);
						arg1.anInt6271 = this.aClass5_Sub2_19.anInt4873 * local749 / this.aClass5_Sub2_19.anInt4893 + this.aClass5_Sub2_19.anInt4894;
						local759 = local544 + (local738 * (local544 - local640) >> 16);
						arg1.anInt6273 = this.aClass5_Sub2_19.anInt4871 + this.aClass5_Sub2_19.anInt4872 * local759 / this.aClass5_Sub2_19.anInt4893;
					}
				}
			}
			if (local490) {
				if (local659 >= local563) {
					arg1.anInt6269 = this.aClass5_Sub2_19.anInt4894 + this.aClass5_Sub2_19.anInt4873 * (local621 + this.anInt8479) / local659 - arg1.anInt6270;
				} else {
					arg1.anInt6269 = this.aClass5_Sub2_19.anInt4873 * (local525 + this.anInt8479) / local563 + this.aClass5_Sub2_19.anInt4894 - arg1.anInt6271;
				}
				arg1.aBoolean490 = true;
			}
		}
		this.aClass5_Sub2_19.method3979();
		this.aClass5_Sub2_19.method4052(local22);
		this.method7088();
		this.method7074();
	}

	@OriginalMember(owner = "client!qw", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort101 = (short) arg0;
		this.method7073();
	}

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean679;
	}

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "(I)V")
	private void method7074() {
		if (this.aClass292Array1 == null) {
			return;
		}
		this.aClass5_Sub2_19.C(!this.aBoolean678);
		this.aClass5_Sub2_19.method3982(false);
		this.aClass5_Sub2_19.method4054(1, Static347.aClass80_2);
		this.aClass5_Sub2_19.method3956(Static347.aClass80_2, 1);
		for (@Pc(42) int local42 = 0; local42 < this.anInt8440; local42++) {
			@Pc(49) Class292 local49 = this.aClass292Array1[local42];
			@Pc(54) Class196 local54 = this.aClass196Array1[local42];
			if (!local49.aBoolean686 || !this.aClass5_Sub2_19.method6131()) {
				@Pc(82) float local82 = (float) (this.anIntArray434[local49.anInt8621] + this.anIntArray434[local49.anInt8623] + this.anIntArray434[local49.anInt8619]) * 0.3333333F;
				@Pc(104) float local104 = (float) (this.anIntArray440[local49.anInt8623] + this.anIntArray440[local49.anInt8621] + this.anIntArray440[local49.anInt8619]) * 0.3333333F;
				@Pc(126) float local126 = (float) (this.anIntArray438[local49.anInt8619] + this.anIntArray438[local49.anInt8623] + this.anIntArray438[local49.anInt8621]) * 0.3333333F;
				@Pc(140) float local140 = Static496.aFloat163 + local126 * Static82.aFloat67 + local104 * Static462.aFloat162 + Static49.aFloat59 * local82;
				@Pc(154) float local154 = Static335.aFloat132 + local82 * Static224.aFloat117 + Static623.aFloat185 * local104 + Static180.aFloat88 * local126;
				@Pc(168) float local168 = Static259.aFloat137 * local126 + Static379.aFloat139 * local82 + Static393.aFloat142 * local104 + Static556.aFloat182;
				@Pc(189) float local189 = (float) (1.0D / Math.sqrt((double) (local168 * local168 + local140 * local140 + local154 * local154))) * (float) local49.anInt8620;
				@Pc(194) Class115_Sub3 local194 = this.aClass5_Sub2_19.method3981();
				local194.method6312(local140 + (float) local54.anInt6787 - local140 * local189, local49.aShort106 * local54.anInt6792 >> 7, local54.anInt6785 * local49.aShort105 >> 7, local154 + (float) local54.anInt6788 - local189 * local154, -(local168 * local189) + local168, local54.anInt6794);
				local194.method6305(this.aClass5_Sub2_19.aClass115_Sub3_17);
				this.aClass5_Sub2_19.method3938();
				@Pc(250) int local250 = local54.anInt6790;
				this.aClass5_Sub2_19.method4042(false, local49.aShort104, false);
				this.aClass5_Sub2_19.method4004(local49.aByte104);
				this.aClass5_Sub2_19.method3987(local250);
				this.aClass5_Sub2_19.method4005();
			}
		}
		this.aClass5_Sub2_19.method3956(Static115.aClass80_1, 1);
		this.aClass5_Sub2_19.method4054(1, Static115.aClass80_1);
		this.aClass5_Sub2_19.C(true);
	}

	@OriginalMember(owner = "client!qw", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8467; local3++) {
			this.anIntArray434[local3] = this.anIntArray434[local3] + 7 >> 4;
			this.anIntArray440[local3] = this.anIntArray440[local3] + 7 >> 4;
			this.anIntArray438[local3] = this.anIntArray438[local3] + 7 >> 4;
		}
		this.method7091();
		this.aBoolean676 = false;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIZILclient!hba;)Z")
	private boolean method7075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class115 arg5) {
		@Pc(16) Class115_Sub3 local16 = (Class115_Sub3) arg5;
		@Pc(20) Class115_Sub3 local20 = this.aClass5_Sub2_19.aClass115_Sub3_16;
		@Pc(41) float local41 = local20.aFloat143 + local16.aFloat144 * local20.aFloat146 + local16.aFloat143 * local20.aFloat152 + local20.aFloat151 * local16.aFloat149;
		@Pc(62) float local62 = local20.aFloat149 + local20.aFloat154 * local16.aFloat143 + local20.aFloat147 * local16.aFloat149 + local20.aFloat150 * local16.aFloat144;
		Static623.aFloat185 = local16.aFloat147 * local20.aFloat147 + local20.aFloat154 * local16.aFloat151 + local20.aFloat150 * local16.aFloat153;
		Static180.aFloat88 = local20.aFloat150 * local16.aFloat145 + local20.aFloat147 * local16.aFloat150 + local20.aFloat154 * local16.aFloat146;
		Static379.aFloat139 = local20.aFloat145 * local16.aFloat148 + local20.aFloat148 * local16.aFloat152 + local20.aFloat153 * local16.aFloat154;
		Static462.aFloat162 = local16.aFloat153 * local20.aFloat146 + local16.aFloat147 * local20.aFloat151 + local20.aFloat152 * local16.aFloat151;
		Static393.aFloat142 = local20.aFloat145 * local16.aFloat153 + local16.aFloat151 * local20.aFloat148 + local16.aFloat147 * local20.aFloat153;
		Static259.aFloat137 = local16.aFloat150 * local20.aFloat153 + local16.aFloat146 * local20.aFloat148 + local20.aFloat145 * local16.aFloat145;
		Static49.aFloat59 = local20.aFloat146 * local16.aFloat148 + local20.aFloat152 * local16.aFloat152 + local20.aFloat151 * local16.aFloat154;
		@Pc(209) float local209 = local16.aFloat149 * local20.aFloat153 + local16.aFloat143 * local20.aFloat148 + local20.aFloat145 * local16.aFloat144 + local20.aFloat144;
		Static82.aFloat67 = local16.aFloat145 * local20.aFloat146 + local16.aFloat146 * local20.aFloat152 + local16.aFloat150 * local20.aFloat151;
		Static224.aFloat117 = local16.aFloat152 * local20.aFloat154 + local16.aFloat154 * local20.aFloat147 + local20.aFloat150 * local16.aFloat148;
		@Pc(247) boolean local247 = false;
		@Pc(249) float local249 = Float.MAX_VALUE;
		@Pc(251) float local251 = -3.4028235E38F;
		@Pc(253) float local253 = Float.MAX_VALUE;
		@Pc(255) float local255 = -3.4028235E38F;
		@Pc(259) int local259 = this.aClass5_Sub2_19.anInt4873;
		@Pc(263) int local263 = this.aClass5_Sub2_19.anInt4872;
		if (!this.aBoolean676) {
			this.method7082();
		}
		@Pc(278) int local278 = this.anInt8439 - this.anInt8464 >> 1;
		@Pc(286) int local286 = this.anInt8495 - this.anInt8498 >> 1;
		@Pc(295) int local295 = this.anInt8478 - this.lb >> 1;
		@Pc(300) int local300 = local278 + this.anInt8464;
		@Pc(305) int local305 = local286 + this.anInt8498;
		@Pc(310) int local310 = this.lb + local295;
		@Pc(316) int local316 = local300 - (local278 << arg4);
		@Pc(323) int local323 = local305 - (local286 << arg4);
		@Pc(329) int local329 = local310 - (local295 << arg4);
		@Pc(335) int local335 = local300 + (local278 << arg4);
		@Pc(342) int local342 = local305 + (local286 << arg4);
		Static445.anIntArray419[0] = local316;
		@Pc(352) int local352 = (local295 << arg4) + local310;
		Static376.anIntArray337[0] = local323;
		Static445.anIntArray419[1] = local335;
		Static446.anIntArray421[0] = local329;
		Static376.anIntArray337[1] = local323;
		Static445.anIntArray419[2] = local316;
		Static446.anIntArray421[1] = local329;
		Static376.anIntArray337[2] = local342;
		Static446.anIntArray421[2] = local329;
		Static445.anIntArray419[3] = local335;
		Static376.anIntArray337[3] = local342;
		Static445.anIntArray419[4] = local316;
		Static446.anIntArray421[3] = local329;
		Static376.anIntArray337[4] = local323;
		Static446.anIntArray421[4] = local352;
		Static445.anIntArray419[5] = local335;
		Static376.anIntArray337[5] = local323;
		Static446.anIntArray421[5] = local352;
		Static445.anIntArray419[6] = local316;
		Static376.anIntArray337[6] = local342;
		Static445.anIntArray419[7] = local335;
		Static446.anIntArray421[6] = local352;
		Static376.anIntArray337[7] = local342;
		Static446.anIntArray421[7] = local352;
		@Pc(491) float local491;
		@Pc(505) float local505;
		@Pc(477) float local477;
		@Pc(458) float local458;
		@Pc(453) float local453;
		@Pc(463) float local463;
		for (@Pc(446) int local446 = 0; local446 < 8; local446++) {
			local453 = (float) Static376.anIntArray337[local446];
			local458 = (float) Static445.anIntArray419[local446];
			local463 = (float) Static446.anIntArray421[local446];
			local477 = Static259.aFloat137 * local463 + Static379.aFloat139 * local458 + local453 * Static393.aFloat142 + local209;
			local491 = local463 * Static82.aFloat67 + Static462.aFloat162 * local453 + Static49.aFloat59 * local458 + local41;
			local505 = local463 * Static180.aFloat88 + local458 * Static224.aFloat117 + Static623.aFloat185 * local453 + local62;
			if ((float) this.aClass5_Sub2_19.anInt4893 <= local477) {
				if (arg1 > 0) {
					local477 = (float) arg1;
				}
				@Pc(529) float local529 = local491 * (float) local259 / local477 + (float) this.aClass5_Sub2_19.anInt4894;
				if (local249 > local529) {
					local249 = local529;
				}
				@Pc(547) float local547 = (float) this.aClass5_Sub2_19.anInt4871 + (float) local263 * local505 / local477;
				if (local251 < local529) {
					local251 = local529;
				}
				if (local255 < local547) {
					local255 = local547;
				}
				if (local253 > local547) {
					local253 = local547;
				}
				local247 = true;
			}
		}
		if (local247 && (float) arg0 > local249 && local251 > (float) arg0 && local253 < (float) arg2 && local255 > (float) arg2) {
			if (arg3) {
				return true;
			}
			if (this.anInt8474 > Static506.anIntArray448.length) {
				Static113.anIntArray108 = new int[this.anInt8474];
				Static506.anIntArray448 = new int[this.anInt8474];
			}
			@Pc(705) int local705;
			for (@Pc(618) int local618 = 0; local618 < this.anInt8442; local618++) {
				local463 = (float) this.anIntArray438[local618];
				local458 = (float) this.anIntArray434[local618];
				local453 = (float) this.anIntArray440[local618];
				local477 = local453 * Static393.aFloat142 + Static379.aFloat139 * local458 + Static259.aFloat137 * local463 + local209;
				local491 = local41 + local453 * Static462.aFloat162 + local458 * Static49.aFloat59 + local463 * Static82.aFloat67;
				local505 = local463 * Static180.aFloat88 + Static224.aFloat117 * local458 + Static623.aFloat185 * local453 + local62;
				@Pc(718) int local718;
				@Pc(723) int local723;
				@Pc(730) int local730;
				if (local477 >= (float) this.aClass5_Sub2_19.anInt4893) {
					if (arg1 > 0) {
						local477 = (float) arg1;
					}
					local705 = (int) ((float) local259 * local491 / local477 + (float) this.aClass5_Sub2_19.anInt4894);
					local718 = (int) (local505 * (float) local263 / local477 + (float) this.aClass5_Sub2_19.anInt4871);
					local723 = this.anIntArray437[local618];
					local730 = this.anIntArray437[local618 + 1];
					for (@Pc(732) int local732 = local723; local732 < local730; local732++) {
						@Pc(741) int local741 = this.aShortArray146[local732] - 1;
						if (local741 == -1) {
							break;
						}
						Static506.anIntArray448[local741] = local705;
						Static113.anIntArray108[local741] = local718;
					}
				} else {
					local705 = this.anIntArray437[local618];
					local718 = this.anIntArray437[local618 + 1];
					for (local723 = local705; local723 < local718; local723++) {
						local730 = this.aShortArray146[local723] - 1;
						if (local730 == -1) {
							break;
						}
						Static506.anIntArray448[this.aShortArray146[local723] - 1] = -999999;
					}
				}
			}
			for (local705 = 0; local705 < this.anInt8492; local705++) {
				if (Static506.anIntArray448[this.aShortArray142[local705]] != -999999 && Static506.anIntArray448[this.aShortArray138[local705]] != -999999 && Static506.anIntArray448[this.aShortArray147[local705]] != -999999 && this.method7079(arg2, Static506.anIntArray448[this.aShortArray147[local705]], arg0, Static113.anIntArray108[this.aShortArray142[local705]], Static113.anIntArray108[this.aShortArray138[local705]], Static506.anIntArray448[this.aShortArray142[local705]], Static113.anIntArray108[this.aShortArray147[local705]], Static506.anIntArray448[this.aShortArray138[local705]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qw", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean676) {
			this.method7082();
		}
		return this.anInt8479;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!qw;IZZILclient!qw;)Lclient!ka;")
	private Class92 method7076(@OriginalArg(0) Class92_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class92_Sub3 arg4) {
		arg4.anInt8482 = arg1;
		arg4.anInt8438 = this.anInt8438;
		arg4.aShort101 = this.aShort101;
		arg4.aBoolean679 = this.aBoolean679;
		arg4.aShort102 = this.aShort102;
		arg4.anInt8467 = this.anInt8467;
		arg4.anInt8474 = this.anInt8474;
		arg4.anInt8504 = this.anInt8504;
		if ((arg1 & 0x100) == 0) {
			arg4.aBoolean678 = this.aBoolean678;
		} else {
			arg4.aBoolean678 = true;
		}
		arg4.anInt8442 = this.anInt8442;
		arg4.anInt8440 = this.anInt8440;
		arg4.anInt8492 = this.anInt8492;
		@Pc(70) boolean local70 = Static115.method2524(this.anInt8504, arg1);
		@Pc(76) boolean local76 = Static191.method3516(arg1, this.anInt8504);
		@Pc(82) boolean local82 = Static450.method6846(this.anInt8504, arg1);
		@Pc(88) boolean local88 = local76 | local70 | local82;
		@Pc(197) int local197;
		if (local88) {
			if (!local70) {
				arg4.anIntArray434 = this.anIntArray434;
			} else if (arg0.anIntArray434 == null || this.anInt8467 > arg0.anIntArray434.length) {
				arg4.anIntArray434 = arg0.anIntArray434 = new int[this.anInt8467];
			} else {
				arg4.anIntArray434 = arg0.anIntArray434;
			}
			if (!local76) {
				arg4.anIntArray440 = this.anIntArray440;
			} else if (arg0.anIntArray440 == null || arg0.anIntArray440.length < this.anInt8467) {
				arg4.anIntArray440 = arg0.anIntArray440 = new int[this.anInt8467];
			} else {
				arg4.anIntArray440 = arg0.anIntArray440;
			}
			if (!local82) {
				arg4.anIntArray438 = this.anIntArray438;
			} else if (arg0.anIntArray438 == null || this.anInt8467 > arg0.anIntArray438.length) {
				arg4.anIntArray438 = arg0.anIntArray438 = new int[this.anInt8467];
			} else {
				arg4.anIntArray438 = arg0.anIntArray438;
			}
			for (local197 = 0; local197 < this.anInt8467; local197++) {
				if (local70) {
					arg4.anIntArray434[local197] = this.anIntArray434[local197];
				}
				if (local76) {
					arg4.anIntArray440[local197] = this.anIntArray440[local197];
				}
				if (local82) {
					arg4.anIntArray438[local197] = this.anIntArray438[local197];
				}
			}
		} else {
			arg4.anIntArray434 = this.anIntArray434;
			arg4.anIntArray440 = this.anIntArray440;
			arg4.anIntArray438 = this.anIntArray438;
		}
		if (Static422.method6593(arg1, this.anInt8504)) {
			arg4.aClass204_4 = arg0.aClass204_4;
			arg4.aClass204_4.aBoolean548 = true;
			arg4.aClass204_4.aBoolean547 = this.aClass204_4.aBoolean547;
			arg4.aClass204_4.anInterface26_16 = this.aClass204_4.anInterface26_16;
		} else if (Static166.method8084(this.anInt8504, arg1)) {
			arg4.aClass204_4 = this.aClass204_4;
		} else {
			arg4.aClass204_4 = null;
		}
		if (Static598.method8290(this.anInt8504, arg1)) {
			if (arg0.aShortArray141 == null || this.anInt8492 > arg0.aShortArray141.length) {
				arg4.aShortArray141 = arg0.aShortArray141 = new short[this.anInt8492];
			} else {
				arg4.aShortArray141 = arg0.aShortArray141;
			}
			for (local197 = 0; local197 < this.anInt8492; local197++) {
				arg4.aShortArray141[local197] = this.aShortArray141[local197];
			}
		} else {
			arg4.aShortArray141 = this.aShortArray141;
		}
		if (Static269.method8258(this.anInt8504, arg1)) {
			if (arg0.aByteArray79 == null || arg0.aByteArray79.length < this.anInt8492) {
				arg4.aByteArray79 = arg0.aByteArray79 = new byte[this.anInt8492];
			} else {
				arg4.aByteArray79 = arg0.aByteArray79;
			}
			for (local197 = 0; local197 < this.anInt8492; local197++) {
				arg4.aByteArray79[local197] = this.aByteArray79[local197];
			}
		} else {
			arg4.aByteArray79 = this.aByteArray79;
		}
		if (Static290.method5003(this.anInt8504, arg1)) {
			arg4.aClass204_1 = arg0.aClass204_1;
			arg4.aClass204_1.aBoolean547 = this.aClass204_1.aBoolean547;
			arg4.aClass204_1.aBoolean548 = true;
			arg4.aClass204_1.anInterface26_16 = this.aClass204_1.anInterface26_16;
		} else if (Static268.method4837(this.anInt8504, arg1)) {
			arg4.aClass204_1 = this.aClass204_1;
		} else {
			arg4.aClass204_1 = null;
		}
		@Pc(550) int local550;
		if (Static531.method7545(this.anInt8504, arg1)) {
			if (arg0.aShortArray143 == null || arg0.aShortArray143.length < this.anInt8474) {
				local197 = this.anInt8474;
				arg4.aShortArray143 = arg0.aShortArray143 = new short[local197];
				arg4.aShortArray145 = arg0.aShortArray145 = new short[local197];
				arg4.aShortArray148 = arg0.aShortArray148 = new short[local197];
			} else {
				arg4.aShortArray143 = arg0.aShortArray143;
				arg4.aShortArray145 = arg0.aShortArray145;
				arg4.aShortArray148 = arg0.aShortArray148;
			}
			if (this.aClass182_1 == null) {
				arg4.aClass182_1 = null;
				for (local197 = 0; local197 < this.anInt8474; local197++) {
					arg4.aShortArray143[local197] = this.aShortArray143[local197];
					arg4.aShortArray145[local197] = this.aShortArray145[local197];
					arg4.aShortArray148[local197] = this.aShortArray148[local197];
				}
			} else {
				if (arg0.aClass182_1 == null) {
					arg0.aClass182_1 = new Class182();
				}
				@Pc(538) Class182 local538 = arg4.aClass182_1 = arg0.aClass182_1;
				if (local538.aShortArray87 == null || local538.aShortArray87.length < this.anInt8474) {
					local550 = this.anInt8474;
					local538.aByteArray44 = new byte[local550];
					local538.aShortArray89 = new short[local550];
					local538.aShortArray87 = new short[local550];
					local538.aShortArray88 = new short[local550];
				}
				for (local550 = 0; local550 < this.anInt8474; local550++) {
					arg4.aShortArray143[local550] = this.aShortArray143[local550];
					arg4.aShortArray145[local550] = this.aShortArray145[local550];
					arg4.aShortArray148[local550] = this.aShortArray148[local550];
					local538.aShortArray87[local550] = this.aClass182_1.aShortArray87[local550];
					local538.aShortArray88[local550] = this.aClass182_1.aShortArray88[local550];
					local538.aShortArray89[local550] = this.aClass182_1.aShortArray89[local550];
					local538.aByteArray44[local550] = this.aClass182_1.aByteArray44[local550];
				}
			}
			arg4.aByteArray78 = this.aByteArray78;
		} else {
			arg4.aShortArray145 = this.aShortArray145;
			arg4.aShortArray148 = this.aShortArray148;
			arg4.aClass182_1 = this.aClass182_1;
			arg4.aByteArray78 = this.aByteArray78;
			arg4.aShortArray143 = this.aShortArray143;
		}
		if (Static593.method8180(arg1, this.anInt8504)) {
			arg4.aClass204_2 = arg0.aClass204_2;
			arg4.aClass204_2.anInterface26_16 = this.aClass204_2.anInterface26_16;
			arg4.aClass204_2.aBoolean548 = true;
			arg4.aClass204_2.aBoolean547 = this.aClass204_2.aBoolean547;
		} else if (Static5.method442(arg1, this.anInt8504)) {
			arg4.aClass204_2 = this.aClass204_2;
		} else {
			arg4.aClass204_2 = null;
		}
		if (Static406.method6371(arg1, this.anInt8504)) {
			if (arg0.aFloatArray72 == null || arg0.aFloatArray72.length < this.anInt8492) {
				local197 = this.anInt8474;
				arg4.aFloatArray71 = arg0.aFloatArray71 = new float[local197];
				arg4.aFloatArray72 = arg0.aFloatArray72 = new float[local197];
			} else {
				arg4.aFloatArray71 = arg0.aFloatArray71;
				arg4.aFloatArray72 = arg0.aFloatArray72;
			}
			for (local197 = 0; local197 < this.anInt8474; local197++) {
				arg4.aFloatArray72[local197] = this.aFloatArray72[local197];
				arg4.aFloatArray71[local197] = this.aFloatArray71[local197];
			}
		} else {
			arg4.aFloatArray72 = this.aFloatArray72;
			arg4.aFloatArray71 = this.aFloatArray71;
		}
		if (Static190.method3512(arg1, this.anInt8504)) {
			arg4.aClass204_3 = arg0.aClass204_3;
			arg4.aClass204_3.anInterface26_16 = this.aClass204_3.anInterface26_16;
			arg4.aClass204_3.aBoolean548 = true;
			arg4.aClass204_3.aBoolean547 = this.aClass204_3.aBoolean547;
		} else if (Static9.method494(arg1, this.anInt8504)) {
			arg4.aClass204_3 = this.aClass204_3;
		} else {
			arg4.aClass204_3 = null;
		}
		if (Static141.method2792(arg1, this.anInt8504)) {
			if (arg0.aShortArray142 == null || arg0.aShortArray142.length < this.anInt8492) {
				local197 = this.anInt8492;
				arg4.aShortArray142 = arg0.aShortArray142 = new short[local197];
				arg4.aShortArray138 = arg0.aShortArray138 = new short[local197];
				arg4.aShortArray147 = arg0.aShortArray147 = new short[local197];
			} else {
				arg4.aShortArray147 = arg0.aShortArray147;
				arg4.aShortArray138 = arg0.aShortArray138;
				arg4.aShortArray142 = arg0.aShortArray142;
			}
			for (local197 = 0; local197 < this.anInt8492; local197++) {
				arg4.aShortArray142[local197] = this.aShortArray142[local197];
				arg4.aShortArray138[local197] = this.aShortArray138[local197];
				arg4.aShortArray147[local197] = this.aShortArray147[local197];
			}
		} else {
			arg4.aShortArray147 = this.aShortArray147;
			arg4.aShortArray142 = this.aShortArray142;
			arg4.aShortArray138 = this.aShortArray138;
		}
		if (Static487.method7138(arg1, this.anInt8504)) {
			arg4.aClass27_1 = arg0.aClass27_1;
			arg4.aClass27_1.aBoolean136 = true;
			arg4.aClass27_1.anInterface27_4 = this.aClass27_1.anInterface27_4;
			arg4.aClass27_1.aBoolean135 = this.aClass27_1.aBoolean135;
		} else if (Static272.method4854(arg1, this.anInt8504)) {
			arg4.aClass27_1 = this.aClass27_1;
		} else {
			arg4.aClass27_1 = null;
		}
		if (Static374.method7975(arg1, this.anInt8504)) {
			if (arg0.aShortArray144 == null || this.anInt8492 > arg0.aShortArray144.length) {
				local197 = this.anInt8492;
				arg4.aShortArray144 = arg0.aShortArray144 = new short[local197];
			} else {
				arg4.aShortArray144 = arg0.aShortArray144;
			}
			for (local197 = 0; local197 < this.anInt8492; local197++) {
				arg4.aShortArray144[local197] = this.aShortArray144[local197];
			}
		} else {
			arg4.aShortArray144 = this.aShortArray144;
		}
		if (!Static415.method6495(this.anInt8504, arg1)) {
			arg4.aClass196Array1 = this.aClass196Array1;
		} else if (arg0.aClass196Array1 == null || arg0.aClass196Array1.length < this.anInt8440) {
			local197 = this.anInt8440;
			arg4.aClass196Array1 = arg0.aClass196Array1 = new Class196[local197];
			for (local550 = 0; local550 < this.anInt8440; local550++) {
				arg4.aClass196Array1[local550] = this.aClass196Array1[local550].method5677();
			}
		} else {
			arg4.aClass196Array1 = arg0.aClass196Array1;
			for (local197 = 0; local197 < this.anInt8440; local197++) {
				arg4.aClass196Array1[local197].method5675(this.aClass196Array1[local197]);
			}
		}
		arg4.anIntArray437 = this.anIntArray437;
		arg4.anIntArrayArray43 = this.anIntArrayArray43;
		arg4.anIntArray436 = this.anIntArray436;
		arg4.aShortArray137 = this.aShortArray137;
		arg4.aShortArray139 = this.aShortArray139;
		arg4.aShortArray136 = this.aShortArray136;
		if (this.aBoolean676) {
			arg4.aBoolean676 = true;
			arg4.anInt8464 = this.anInt8464;
			arg4.anInt8479 = this.anInt8479;
			arg4.anInt8495 = this.anInt8495;
			arg4.anInt8478 = this.anInt8478;
			arg4.anInt8498 = this.anInt8498;
			arg4.anInt8439 = this.anInt8439;
			arg4.lb = this.lb;
			arg4.anInt8489 = this.anInt8489;
		} else {
			arg4.aBoolean676 = false;
		}
		arg4.aShortArray140 = this.aShortArray140;
		arg4.anIntArrayArray42 = this.anIntArrayArray42;
		arg4.aClass103Array5 = this.aClass103Array5;
		arg4.aClass49Array5 = this.aClass49Array5;
		arg4.aClass292Array1 = this.aClass292Array1;
		arg4.anIntArray439 = this.anIntArray439;
		arg4.anIntArrayArray44 = this.anIntArrayArray44;
		arg4.anIntArray435 = this.anIntArray435;
		arg4.aShortArray146 = this.aShortArray146;
		return arg4;
	}

	@OriginalMember(owner = "client!qw", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8492; local3++) {
			if (this.aShortArray141[local3] == arg0) {
				this.aShortArray141[local3] = arg1;
			}
		}
		if (this.aClass292Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt8440; local34++) {
				@Pc(41) Class292 local41 = this.aClass292Array1[local34];
				@Pc(46) Class196 local46 = this.aClass196Array1[local34];
				local46.anInt6790 = local46.anInt6790 & 0xFF000000 | Static376.anIntArray336[this.aShortArray141[local41.anInt8622] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7073();
	}

	@OriginalMember(owner = "client!qw", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class6_Sub5_Sub10 ba(@OriginalArg(0) Class6_Sub5_Sub10 arg0) {
		if (this.anInt8474 == 0) {
			return null;
		}
		if (!this.aBoolean676) {
			this.method7082();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass5_Sub2_19.anInt4862 > 0) {
			local37 = this.anInt8464 - (this.aClass5_Sub2_19.anInt4862 * this.anInt8495 >> 8) >> this.aClass5_Sub2_19.anInt4864;
			local54 = this.anInt8439 - (this.anInt8498 * this.aClass5_Sub2_19.anInt4862 >> 8) >> this.aClass5_Sub2_19.anInt4864;
		} else {
			local37 = this.anInt8464 - (this.aClass5_Sub2_19.anInt4862 * this.anInt8498 >> 8) >> this.aClass5_Sub2_19.anInt4864;
			local54 = this.anInt8439 - (this.anInt8495 * this.aClass5_Sub2_19.anInt4862 >> 8) >> this.aClass5_Sub2_19.anInt4864;
		}
		@Pc(114) int local114;
		@Pc(130) int local130;
		if (this.aClass5_Sub2_19.anInt4857 <= 0) {
			local114 = this.lb - (this.aClass5_Sub2_19.anInt4857 * this.anInt8498 >> 8) >> this.aClass5_Sub2_19.anInt4864;
			local130 = this.anInt8478 - (this.aClass5_Sub2_19.anInt4857 * this.anInt8495 >> 8) >> this.aClass5_Sub2_19.anInt4864;
		} else {
			local114 = this.lb - (this.anInt8495 * this.aClass5_Sub2_19.anInt4857 >> 8) >> this.aClass5_Sub2_19.anInt4864;
			local130 = this.anInt8478 - (this.aClass5_Sub2_19.anInt4857 * this.anInt8498 >> 8) >> this.aClass5_Sub2_19.anInt4864;
		}
		@Pc(171) int local171 = local54 + 1 - local37;
		@Pc(177) int local177 = local130 + 1 - local114;
		@Pc(180) Class6_Sub5_Sub10_Sub2 local180 = (Class6_Sub5_Sub10_Sub2) arg0;
		@Pc(196) Class6_Sub5_Sub10_Sub2 local196;
		if (local180 != null && local180.method3509(local171, local177)) {
			local196 = local180;
			local180.method3511();
		} else {
			local196 = new Class6_Sub5_Sub10_Sub2(this.aClass5_Sub2_19, local171, local177);
		}
		local196.method3508(local130, local114, local37, local54);
		this.method7078(local196);
		return local196;
	}

	@OriginalMember(owner = "client!qw", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean676) {
			this.method7082();
		}
		return this.anInt8489;
	}

	@OriginalMember(owner = "client!qw", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8442; local7++) {
			this.anIntArray438[local7] = -this.anIntArray438[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt8474; local25++) {
			this.aShortArray148[local25] = (short) -this.aShortArray148[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt8492; local44++) {
			@Pc(51) short local51 = this.aShortArray142[local44];
			this.aShortArray142[local44] = this.aShortArray147[local44];
			this.aShortArray147[local44] = local51;
		}
		this.method7091();
		this.method7085();
		this.method7087();
		this.aBoolean676 = false;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "()[Lclient!fk;")
	@Override
	public Class103[] method7048() {
		return this.aClass103Array5;
	}

	@OriginalMember(owner = "client!qw", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean676) {
			this.method7082();
		}
		return this.anInt8495;
	}

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass204_4 != null) {
			this.aClass204_4.aBoolean548 = Static422.method6593(arg0, this.anInt8504);
		}
		if (this.aClass204_3 != null) {
			this.aClass204_3.aBoolean548 = Static190.method3512(arg0, this.anInt8504);
		}
		if (this.aClass204_1 != null) {
			this.aClass204_1.aBoolean548 = Static290.method5003(this.anInt8504, arg0);
		}
		if (this.aClass204_2 != null) {
			this.aClass204_2.aBoolean548 = Static593.method8180(arg0, this.anInt8504);
		}
		this.anInt8482 = arg0;
		this.aBoolean674 = true;
		if (this.aClass182_1 != null && (this.anInt8482 & 0x10000) == 0) {
			this.aShortArray148 = this.aClass182_1.aShortArray89;
			this.aShortArray143 = this.aClass182_1.aShortArray87;
			this.aShortArray145 = this.aClass182_1.aShortArray88;
			this.aByteArray78 = this.aClass182_1.aByteArray44;
			this.aClass182_1 = null;
		}
		this.method7077();
	}

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "(I)V")
	private void method7077() {
		if (!this.aBoolean674) {
			return;
		}
		this.aBoolean674 = false;
		if (this.aClass103Array5 == null && this.aClass49Array5 == null && this.aClass292Array1 == null) {
			if (this.anIntArray434 != null && !Static243.method3833(this.anInt8482, this.anInt8504)) {
				if (this.aClass204_4 == null || this.aClass204_4.method5737()) {
					if (!this.aBoolean676) {
						this.method7082();
					}
					this.anIntArray434 = null;
				} else {
					this.aBoolean674 = true;
				}
			}
			if (this.anIntArray440 != null && !Static519.method7425(this.anInt8504, this.anInt8482)) {
				if (this.aClass204_4 == null || this.aClass204_4.method5737()) {
					if (!this.aBoolean676) {
						this.method7082();
					}
					this.anIntArray440 = null;
				} else {
					this.aBoolean674 = true;
				}
			}
			if (this.anIntArray438 != null && !Static591.method8151(this.anInt8504, this.anInt8482)) {
				if (this.aClass204_4 == null || this.aClass204_4.method5737()) {
					if (!this.aBoolean676) {
						this.method7082();
					}
					this.anIntArray438 = null;
				} else {
					this.aBoolean674 = true;
				}
			}
		}
		if (this.aShortArray146 != null && this.anIntArray434 == null && this.anIntArray440 == null && this.anIntArray438 == null) {
			this.anIntArray437 = null;
			this.aShortArray146 = null;
		}
		if (this.aByteArray78 != null && !Static257.method4575(this.anInt8504, this.anInt8482)) {
			label197: {
				label196: {
					@Pc(169) boolean local169;
					if ((this.anInt8504 & 0x37) == 0) {
						if (this.aClass204_1 == null || this.aClass204_1.method5737()) {
							break label196;
						}
						local169 = false;
					} else {
						if (this.aClass204_2 == null || this.aClass204_2.method5737()) {
							break label196;
						}
						local169 = false;
					}
					if (!local169) {
						this.aBoolean674 = true;
						break label197;
					}
				}
				this.aByteArray78 = null;
				this.aShortArray143 = this.aShortArray145 = this.aShortArray148 = null;
			}
		}
		if (this.aShortArray141 != null && !Static24.method706(this.anInt8482, this.anInt8504)) {
			if (this.aClass204_1 == null || this.aClass204_1.method5737()) {
				this.aShortArray141 = null;
			} else {
				this.aBoolean674 = true;
			}
		}
		if (this.aByteArray79 != null && !Static427.method6612(this.anInt8504, this.anInt8482)) {
			if (this.aClass204_1 == null || this.aClass204_1.method5737()) {
				this.aByteArray79 = null;
			} else {
				this.aBoolean674 = true;
			}
		}
		if (this.aFloatArray72 != null && !Static30.method772(this.anInt8504, this.anInt8482)) {
			if (this.aClass204_3 == null || this.aClass204_3.method5737()) {
				this.aFloatArray72 = this.aFloatArray71 = null;
			} else {
				this.aBoolean674 = true;
			}
		}
		if (this.aShortArray144 != null && !Static179.method3381(this.anInt8482, this.anInt8504)) {
			if (this.aClass204_1 == null || this.aClass204_1.method5737()) {
				this.aShortArray144 = null;
			} else {
				this.aBoolean674 = true;
			}
		}
		if (this.aShortArray142 != null && !Static256.method4522(this.anInt8482, this.anInt8504)) {
			if ((this.aClass27_1 == null || this.aClass27_1.method1348()) && (this.aClass204_1 == null || this.aClass204_1.method5737())) {
				this.aShortArray142 = this.aShortArray138 = this.aShortArray147 = null;
			} else {
				this.aBoolean674 = true;
			}
		}
		if (this.aShortArray136 != null) {
			if (this.aClass204_4 == null || this.aClass204_4.method5737()) {
				this.aShortArray136 = null;
			} else {
				this.aBoolean674 = true;
			}
		}
		if (this.aShortArray137 != null) {
			if (this.aClass204_1 == null || this.aClass204_1.method5737()) {
				this.aShortArray137 = null;
			} else {
				this.aBoolean674 = true;
			}
		}
		if (this.anIntArrayArray42 != null && !Static245.method4395(this.anInt8504, this.anInt8482)) {
			this.aShortArray139 = null;
			this.anIntArrayArray42 = null;
		}
		if (this.anIntArrayArray43 != null && !Static452.method6868(this.anInt8482, this.anInt8504)) {
			this.aShortArray140 = null;
			this.anIntArrayArray43 = null;
		}
		if (this.anIntArrayArray44 != null && !Static6.method445(this.anInt8482, this.anInt8504)) {
			this.anIntArrayArray44 = null;
		}
		if (this.anIntArray435 != null && (this.anInt8482 & 0x800) == 0 && (this.anInt8482 & 0x40000) == 0) {
			this.anIntArray436 = null;
			this.anIntArray439 = null;
			this.anIntArray435 = null;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILclient!gl;)V")
	private void method7078(@OriginalArg(1) Class6_Sub5_Sub10_Sub2 arg0) {
		if (this.anInt8474 > Static506.anIntArray448.length) {
			Static113.anIntArray108 = new int[this.anInt8474];
			Static506.anIntArray448 = new int[this.anInt8474];
		}
		@Pc(57) int local57;
		@Pc(95) int local95;
		@Pc(104) int local104;
		for (@Pc(30) int local30 = 0; local30 < this.anInt8442; local30++) {
			local57 = (this.anIntArray434[local30] - (this.anIntArray440[local30] * this.aClass5_Sub2_19.anInt4862 >> 8) >> this.aClass5_Sub2_19.anInt4864) - arg0.anInt4135;
			@Pc(81) int local81 = (this.anIntArray438[local30] - (this.anIntArray440[local30] * this.aClass5_Sub2_19.anInt4857 >> 8) >> this.aClass5_Sub2_19.anInt4864) - arg0.anInt4129;
			@Pc(86) int local86 = this.anIntArray437[local30];
			@Pc(93) int local93 = this.anIntArray437[local30 + 1];
			for (local95 = local86; local95 < local93; local95++) {
				local104 = this.aShortArray146[local95] - 1;
				if (local104 == -1) {
					break;
				}
				Static506.anIntArray448[local104] = local57;
				Static113.anIntArray108[local104] = local81;
			}
		}
		for (local57 = 0; local57 < this.anInt8438; local57++) {
			if (this.aByteArray79 == null || this.aByteArray79[local57] <= 128) {
				@Pc(151) short local151 = this.aShortArray142[local57];
				@Pc(156) short local156 = this.aShortArray138[local57];
				@Pc(161) short local161 = this.aShortArray147[local57];
				local95 = Static506.anIntArray448[local151];
				local104 = Static506.anIntArray448[local156];
				@Pc(173) int local173 = Static506.anIntArray448[local161];
				@Pc(177) int local177 = Static113.anIntArray108[local151];
				@Pc(181) int local181 = Static113.anIntArray108[local156];
				@Pc(185) int local185 = Static113.anIntArray108[local161];
				if (-((local181 - local177) * (local173 + -local104)) + (local181 - local185) * (local95 - local104) > 0) {
					arg0.method3510(local177, local95, local104, local173, local185, local181);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method7079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg3 && arg0 < arg4 && arg0 < arg6) {
			return false;
		} else if (arg0 > arg3 && arg4 < arg0 && arg6 < arg0) {
			return false;
		} else if (arg5 > arg2 && arg2 < arg7 && arg1 > arg2) {
			return false;
		} else {
			return arg5 >= arg2 || arg7 >= arg2 || arg2 <= arg1;
		}
	}

	@OriginalMember(owner = "client!qw", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean676) {
			this.method7082();
		}
		return this.anInt8439;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7060(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class92_Sub3 local8 = (Class92_Sub3) arg0;
		if (this.anInt8492 == 0 || local8.anInt8492 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt8442;
		@Pc(24) int[] local24 = local8.anIntArray434;
		@Pc(27) int[] local27 = local8.anIntArray440;
		@Pc(30) int[] local30 = local8.anIntArray438;
		@Pc(33) short[] local33 = local8.aShortArray143;
		@Pc(36) short[] local36 = local8.aShortArray145;
		@Pc(39) short[] local39 = local8.aShortArray148;
		@Pc(42) byte[] local42 = local8.aByteArray78;
		@Pc(53) short[] local53;
		@Pc(61) short[] local61;
		@Pc(49) short[] local49;
		@Pc(57) byte[] local57;
		if (this.aClass182_1 == null) {
			local61 = null;
			local57 = null;
			local49 = null;
			local53 = null;
		} else {
			local49 = this.aClass182_1.aShortArray89;
			local53 = this.aClass182_1.aShortArray87;
			local57 = this.aClass182_1.aByteArray44;
			local61 = this.aClass182_1.aShortArray88;
		}
		@Pc(78) short[] local78;
		@Pc(86) short[] local86;
		@Pc(90) short[] local90;
		@Pc(82) byte[] local82;
		if (local8.aClass182_1 == null) {
			local82 = null;
			local86 = null;
			local78 = null;
			local90 = null;
		} else {
			local78 = local8.aClass182_1.aShortArray87;
			local82 = local8.aClass182_1.aByteArray44;
			local86 = local8.aClass182_1.aShortArray88;
			local90 = local8.aClass182_1.aShortArray89;
		}
		@Pc(103) int[] local103 = local8.anIntArray437;
		@Pc(106) short[] local106 = local8.aShortArray146;
		if (!local8.aBoolean676) {
			local8.method7082();
		}
		@Pc(115) int local115 = local8.anInt8498;
		@Pc(118) int local118 = local8.anInt8495;
		@Pc(121) int local121 = local8.anInt8464;
		@Pc(124) int local124 = local8.anInt8439;
		@Pc(127) int local127 = local8.lb;
		@Pc(130) int local130 = local8.anInt8478;
		for (@Pc(132) int local132 = 0; local132 < this.anInt8442; local132++) {
			@Pc(142) int local142 = this.anIntArray440[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(158) int local158 = this.anIntArray434[local132] - arg1;
				if (local121 <= local158 && local158 <= local124) {
					@Pc(177) int local177 = this.anIntArray438[local132] - arg3;
					if (local127 <= local177 && local177 <= local130) {
						@Pc(191) int local191 = -1;
						@Pc(196) int local196 = this.anIntArray437[local132];
						@Pc(203) int local203 = this.anIntArray437[local132 + 1];
						for (@Pc(205) int local205 = local196; local205 < local203; local205++) {
							local191 = this.aShortArray146[local205] - 1;
							if (local191 == -1 || this.aByteArray78[local191] != 0) {
								break;
							}
						}
						if (local191 != -1) {
							for (@Pc(241) int local241 = 0; local241 < local21; local241++) {
								if (local24[local241] == local158 && local177 == local30[local241] && local142 == local27[local241]) {
									local203 = local103[local241 + 1];
									@Pc(274) int local274 = -1;
									local196 = local103[local241];
									for (@Pc(280) int local280 = local196; local280 < local203; local280++) {
										local274 = local106[local280] - 1;
										if (local274 == -1 || local42[local274] != 0) {
											break;
										}
									}
									if (local274 != -1) {
										if (local53 == null) {
											this.aClass182_1 = new Class182();
											local53 = this.aClass182_1.aShortArray87 = Static273.method4871(this.aShortArray143);
											local61 = this.aClass182_1.aShortArray88 = Static273.method4871(this.aShortArray145);
											local49 = this.aClass182_1.aShortArray89 = Static273.method4871(this.aShortArray148);
											local57 = this.aClass182_1.aByteArray44 = Static395.method6252(this.aByteArray78);
										}
										if (local78 == null) {
											@Pc(361) Class182 local361 = local8.aClass182_1 = new Class182();
											local78 = local361.aShortArray87 = Static273.method4871(local33);
											local86 = local361.aShortArray88 = Static273.method4871(local36);
											local90 = local361.aShortArray89 = Static273.method4871(local39);
											local82 = local361.aByteArray44 = Static395.method6252(local42);
										}
										@Pc(394) short local394 = this.aShortArray143[local191];
										@Pc(399) short local399 = this.aShortArray145[local191];
										@Pc(404) short local404 = this.aShortArray148[local191];
										@Pc(409) byte local409 = this.aByteArray78[local191];
										local196 = local103[local241];
										local203 = local103[local241 + 1];
										@Pc(429) int local429;
										for (@Pc(421) int local421 = local196; local421 < local203; local421++) {
											local429 = local106[local421] - 1;
											if (local429 == -1) {
												break;
											}
											if (local82[local429] != 0) {
												local78[local429] += local394;
												local86[local429] += local399;
												local90[local429] += local404;
												local82[local429] += local409;
											}
										}
										local409 = local42[local274];
										local196 = this.anIntArray437[local132];
										local404 = local39[local274];
										local394 = local33[local274];
										local203 = this.anIntArray437[local132 + 1];
										local399 = local36[local274];
										for (local429 = local196; local429 < local203; local429++) {
											@Pc(511) int local511 = this.aShortArray146[local429] - 1;
											if (local511 == -1) {
												break;
											}
											if (local57[local511] != 0) {
												local53[local511] += local394;
												local61[local511] += local399;
												local49[local511] += local404;
												local57[local511] += local409;
											}
										}
										local8.method7085();
										this.method7085();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "(I)Z")
	private boolean method7080() {
		if (this.aClass27_1.aBoolean135) {
			return true;
		}
		if (this.aClass27_1.anInterface27_3 == null) {
			this.aClass27_1.anInterface27_3 = this.aClass5_Sub2_19.method3993(this.aBoolean675);
		}
		@Pc(28) Interface27 local28 = this.aClass27_1.anInterface27_3;
		local28.method8101(this.anInt8438 * 6);
		@Pc(40) Buffer local40 = local28.method7962();
		if (local40 != null) {
			@Pc(48) Stream local48 = this.aClass5_Sub2_19.method4046(local40);
			@Pc(52) int local52;
			if (Stream.a()) {
				for (local52 = 0; local52 < this.anInt8438; local52++) {
					local48.c(this.aShortArray142[local52]);
					local48.c(this.aShortArray138[local52]);
					local48.c(this.aShortArray147[local52]);
				}
			} else {
				for (local52 = 0; local52 < this.anInt8438; local52++) {
					local48.d(this.aShortArray142[local52]);
					local48.d(this.aShortArray138[local52]);
					local48.d(this.aShortArray147[local52]);
				}
			}
			local48.c();
			if (local28.method7963()) {
				this.aBoolean674 = true;
				this.aClass27_1.anInterface27_4 = local28;
				this.aClass27_1.aBoolean135 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!hba;IZ)V")
	@Override
	public void method7059(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray140 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8442; local14++) {
			if ((this.aShortArray140[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method6286(this.anIntArray434[local14], this.anIntArray440[local14], this.anIntArray438[local14], local12);
				} else {
					arg0.method6293(this.anIntArray434[local14], this.anIntArray440[local14], this.anIntArray438[local14], local12);
				}
				this.anIntArray434[local14] = local12[0];
				this.anIntArray440[local14] = local12[1];
				this.anIntArray438[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt8492; local7++) {
			local16 = this.aShortArray141[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 -= -(arg3 * (arg0 - local22) >> 7);
			}
			if (arg1 != -1) {
				local28 -= -((arg1 - local28) * arg3 >> 7);
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray141[local7] = (short) (local28 << 7 | local22 << 10 | local32);
		}
		if (this.aClass292Array1 != null) {
			for (local16 = 0; local16 < this.anInt8440; local16++) {
				@Pc(108) Class292 local108 = this.aClass292Array1[local16];
				@Pc(113) Class196 local113 = this.aClass196Array1[local16];
				local113.anInt6790 = local113.anInt6790 & 0xFF000000 | Static376.anIntArray336[this.aShortArray141[local108.anInt8622] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7073();
	}

	@OriginalMember(owner = "client!qw", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass5_Sub2_19.anInterface7_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt8492; local11++) {
			if (arg0 == this.aShortArray144[local11]) {
				this.aShortArray144[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class254 local52 = local9.method6931(arg0 & 0xFFFF);
			local41 = local52.aByte97;
			local39 = local52.aByte98;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(73) Class254 local73 = local9.method6931(arg1 & 0xFFFF);
			local62 = local73.aByte97;
			local60 = local73.aByte98;
			if (local73.aByte96 != 0 || local73.aByte100 != 0) {
				this.aBoolean679 = true;
			}
		}
		if (!(local41 != local62 | local60 != local39)) {
			return;
		}
		if (this.aClass292Array1 != null) {
			for (@Pc(115) int local115 = 0; local115 < this.anInt8440; local115++) {
				@Pc(122) Class292 local122 = this.aClass292Array1[local115];
				@Pc(127) Class196 local127 = this.aClass196Array1[local115];
				local127.anInt6790 = local127.anInt6790 & 0xFF000000 | Static376.anIntArray336[this.aShortArray141[local122.anInt8622] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7073();
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7072(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			Static476.anInt8410 = 0;
			local26 = 0;
			Static299.anInt6110 = 0;
			Static193.anInt2613 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray43.length > local38) {
					local48 = this.anIntArrayArray43[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static299.anInt6110 += this.anIntArray434[local56];
						Static193.anInt2613 += this.anIntArray440[local56];
						local26++;
						Static476.anInt8410 += this.anIntArray438[local56];
					}
				}
			}
			if (local26 > 0) {
				Static193.anInt2613 = Static193.anInt2613 / local26 + local14;
				Static476.anInt8410 = Static476.anInt8410 / local26 + local22;
				Static299.anInt6110 = Static299.anInt6110 / local26 + local18;
			} else {
				Static476.anInt8410 = local22;
				Static299.anInt6110 = local18;
				Static193.anInt2613 = local14;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local22 = arg4 << 4;
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray43.length) {
					local164 = this.anIntArrayArray43[local32];
					for (local166 = 0; local166 < local164.length; local166++) {
						local50 = local164[local166];
						this.anIntArray434[local50] += local18;
						this.anIntArray440[local50] += local14;
						this.anIntArray438[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(289) int local289;
		@Pc(308) int local308;
		@Pc(764) int local764;
		@Pc(773) int local773;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray43.length > local32) {
					local164 = this.anIntArrayArray43[local32];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local50 = local164[local166];
							this.anIntArray434[local50] -= Static299.anInt6110;
							this.anIntArray440[local50] -= Static193.anInt2613;
							this.anIntArray438[local50] -= Static476.anInt8410;
							if (arg4 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg4];
								local289 = Class78_Sub2_Sub2.anIntArray271[arg4];
								local308 = local56 * this.anIntArray440[local50] + local289 * this.anIntArray434[local50] + 16383 >> 14;
								this.anIntArray440[local50] = local289 * this.anIntArray440[local50] + 16383 - this.anIntArray434[local50] * local56 >> 14;
								this.anIntArray434[local50] = local308;
							}
							if (arg2 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg2];
								local289 = Class78_Sub2_Sub2.anIntArray271[arg2];
								local308 = this.anIntArray440[local50] * local289 + 16383 - local56 * this.anIntArray438[local50] >> 14;
								this.anIntArray438[local50] = this.anIntArray438[local50] * local289 + local56 * this.anIntArray440[local50] + 16383 >> 14;
								this.anIntArray440[local50] = local308;
							}
							if (arg3 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg3];
								local289 = Class78_Sub2_Sub2.anIntArray271[arg3];
								local308 = local56 * this.anIntArray438[local50] + local289 * this.anIntArray434[local50] + 16383 >> 14;
								this.anIntArray438[local50] = this.anIntArray438[local50] * local289 + 16383 - local56 * this.anIntArray434[local50] >> 14;
								this.anIntArray434[local50] = local308;
							}
							this.anIntArray434[local50] += Static299.anInt6110;
							this.anIntArray440[local50] += Static193.anInt2613;
							this.anIntArray438[local50] += Static476.anInt8410;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local50 = local164[local166];
							this.anIntArray434[local50] -= Static299.anInt6110;
							this.anIntArray440[local50] -= Static193.anInt2613;
							this.anIntArray438[local50] -= Static476.anInt8410;
							if (arg2 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg2];
								local289 = Class78_Sub2_Sub2.anIntArray271[arg2];
								local308 = local289 * this.anIntArray440[local50] + 16383 - local56 * this.anIntArray438[local50] >> 14;
								this.anIntArray438[local50] = this.anIntArray440[local50] * local56 + local289 * this.anIntArray438[local50] + 16383 >> 14;
								this.anIntArray440[local50] = local308;
							}
							if (arg4 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg4];
								local289 = Class78_Sub2_Sub2.anIntArray271[arg4];
								local308 = this.anIntArray440[local50] * local56 + this.anIntArray434[local50] * local289 + 16383 >> 14;
								this.anIntArray440[local50] = local289 * this.anIntArray440[local50] + 16383 - local56 * this.anIntArray434[local50] >> 14;
								this.anIntArray434[local50] = local308;
							}
							if (arg3 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg3];
								local289 = Class78_Sub2_Sub2.anIntArray271[arg3];
								local308 = this.anIntArray434[local50] * local289 + local56 * this.anIntArray438[local50] + 16383 >> 14;
								this.anIntArray438[local50] = this.anIntArray438[local50] * local289 + 16383 - this.anIntArray434[local50] * local56 >> 14;
								this.anIntArray434[local50] = local308;
							}
							this.anIntArray434[local50] += Static299.anInt6110;
							this.anIntArray440[local50] += Static193.anInt2613;
							this.anIntArray438[local50] += Static476.anInt8410;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray43.length) {
						local48 = this.anIntArrayArray43[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local289 = this.anIntArray437[local56];
							local308 = this.anIntArray437[local56 + 1];
							for (local764 = local289; local764 < local308; local764++) {
								local773 = this.aShortArray146[local764] - 1;
								if (local773 == -1) {
									break;
								}
								@Pc(785) int local785;
								@Pc(789) int local789;
								@Pc(807) int local807;
								if (arg4 != 0) {
									local785 = Class78_Sub2_Sub2.anIntArray270[arg4];
									local789 = Class78_Sub2_Sub2.anIntArray271[arg4];
									local807 = this.aShortArray143[local773] * local789 + this.aShortArray145[local773] * local785 + 16383 >> 14;
									this.aShortArray145[local773] = (short) (local789 * this.aShortArray145[local773] + 16383 - local785 * this.aShortArray143[local773] >> 14);
									this.aShortArray143[local773] = (short) local807;
								}
								if (arg2 != 0) {
									local785 = Class78_Sub2_Sub2.anIntArray270[arg2];
									local789 = Class78_Sub2_Sub2.anIntArray271[arg2];
									local807 = this.aShortArray145[local773] * local789 + 16383 - local785 * this.aShortArray148[local773] >> 14;
									this.aShortArray148[local773] = (short) (this.aShortArray148[local773] * local789 + local785 * this.aShortArray145[local773] + 16383 >> 14);
									this.aShortArray145[local773] = (short) local807;
								}
								if (arg3 != 0) {
									local785 = Class78_Sub2_Sub2.anIntArray270[arg3];
									local789 = Class78_Sub2_Sub2.anIntArray271[arg3];
									local807 = local785 * this.aShortArray148[local773] + local789 * this.aShortArray143[local773] + 16383 >> 14;
									this.aShortArray148[local773] = (short) (local789 * this.aShortArray148[local773] + 16383 - this.aShortArray143[local773] * local785 >> 14);
									this.aShortArray143[local773] = (short) local807;
								}
							}
						}
					}
				}
				this.method7085();
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray43.length > local32) {
					local164 = this.anIntArrayArray43[local32];
					for (local166 = 0; local166 < local164.length; local166++) {
						local50 = local164[local166];
						this.anIntArray434[local50] -= Static299.anInt6110;
						this.anIntArray440[local50] -= Static193.anInt2613;
						this.anIntArray438[local50] -= Static476.anInt8410;
						this.anIntArray434[local50] = this.anIntArray434[local50] * arg2 >> 7;
						this.anIntArray440[local50] = this.anIntArray440[local50] * arg3 >> 7;
						this.anIntArray438[local50] = this.anIntArray438[local50] * arg4 >> 7;
						this.anIntArray434[local50] += Static299.anInt6110;
						this.anIntArray440[local50] += Static193.anInt2613;
						this.anIntArray438[local50] += Static476.anInt8410;
					}
				}
			}
		} else {
			@Pc(1226) Class196 local1226;
			@Pc(1115) boolean local1115;
			@Pc(1221) Class292 local1221;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					local1115 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray42.length) {
							local48 = this.anIntArrayArray42[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local289 = (this.aByteArray79[local56] & 0xFF) + arg2 * 8;
								if (local289 < 0) {
									local289 = 0;
								} else if (local289 > 255) {
									local289 = 255;
								}
								this.aByteArray79[local56] = (byte) local289;
							}
							local1115 |= local48.length > 0;
						}
					}
					if (local1115) {
						if (this.aClass292Array1 != null) {
							for (local38 = 0; local38 < this.anInt8440; local38++) {
								local1221 = this.aClass292Array1[local38];
								local1226 = this.aClass196Array1[local38];
								local1226.anInt6790 = 255 - (this.aByteArray79[local1221.anInt8622] & 0xFF) << 24 | local1226.anInt6790 & 0xFFFFFF;
							}
						}
						this.method7073();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray42 != null) {
					local1115 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray42.length) {
							local48 = this.anIntArrayArray42[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local289 = this.aShortArray141[local56] & 0xFFFF;
								local308 = local289 >> 10 & 0x3F;
								local764 = local289 >> 7 & 0x7;
								local773 = local289 & 0x7F;
								@Pc(1326) int local1326 = arg2 + local308 & 0x3F;
								local764 += arg3 / 4;
								local773 += arg4;
								if (local764 < 0) {
									local764 = 0;
								} else if (local764 > 7) {
									local764 = 7;
								}
								if (local773 < 0) {
									local773 = 0;
								} else if (local773 > 127) {
									local773 = 127;
								}
								this.aShortArray141[local56] = (short) (local764 << 7 | local1326 << 10 | local773);
							}
							local1115 |= local48.length > 0;
						}
					}
					if (local1115) {
						if (this.aClass292Array1 != null) {
							for (local38 = 0; local38 < this.anInt8440; local38++) {
								local1221 = this.aClass292Array1[local38];
								local1226 = this.aClass196Array1[local38];
								local1226.anInt6790 = Static376.anIntArray336[this.aShortArray141[local1221.anInt8622] & 0xFFFF] & 0xFFFFFF | local1226.anInt6790 & 0xFF000000;
							}
						}
						this.method7073();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray44 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray44.length) {
							local164 = this.anIntArrayArray44[local32];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1226 = this.aClass196Array1[local164[local166]];
								local1226.anInt6788 += arg3;
								local1226.anInt6787 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray44 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray44.length) {
							local164 = this.anIntArrayArray44[local32];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1226 = this.aClass196Array1[local164[local166]];
								local1226.anInt6785 = local1226.anInt6785 * arg3 >> 7;
								local1226.anInt6792 = local1226.anInt6792 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray44.length > local32) {
						local164 = this.anIntArrayArray44[local32];
						for (local166 = 0; local166 < local164.length; local166++) {
							local1226 = this.aClass196Array1[local164[local166]];
							local1226.anInt6794 = local1226.anInt6794 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean676) {
			this.method7082();
		}
		return this.anInt8478;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class92 method7069(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(20) Class92_Sub3 local20;
		@Pc(24) Class92_Sub3 local24;
		if (arg0 == 1) {
			local24 = this.aClass5_Sub2_19.aClass92_Sub3_29;
			local20 = this.aClass5_Sub2_19.aClass92_Sub3_24;
		} else if (arg0 == 2) {
			local24 = this.aClass5_Sub2_19.aClass92_Sub3_23;
			local20 = this.aClass5_Sub2_19.aClass92_Sub3_26;
		} else if (arg0 == 3) {
			local20 = this.aClass5_Sub2_19.aClass92_Sub3_27;
			local24 = this.aClass5_Sub2_19.aClass92_Sub3_25;
		} else if (arg0 == 4) {
			local24 = this.aClass5_Sub2_19.aClass92_Sub3_22;
			local20 = this.aClass5_Sub2_19.aClass92_Sub3_21;
		} else if (arg0 == 5) {
			local24 = this.aClass5_Sub2_19.aClass92_Sub3_28;
			local20 = this.aClass5_Sub2_19.aClass92_Sub3_30;
		} else {
			local20 = local24 = new Class92_Sub3(this.aClass5_Sub2_19, 0, 0, true, false);
		}
		return this.method7076(local24, arg1, arg2, arg0 != 0, local20);
	}

	@OriginalMember(owner = "client!qw", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt8482;
	}

	@OriginalMember(owner = "client!qw", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class78_Sub2_Sub2.anIntArray270[arg0];
		@Pc(13) int local13 = Class78_Sub2_Sub2.anIntArray271[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8442; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray440[local15] - local9 * this.anIntArray438[local15] >> 14;
			this.anIntArray438[local15] = local13 * this.anIntArray438[local15] + local9 * this.anIntArray440[local15] >> 14;
			this.anIntArray440[local15] = local34;
		}
		this.method7091();
		this.aBoolean676 = false;
	}

	@OriginalMember(owner = "client!qw", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8442; local7++) {
			if (arg0 != 128) {
				this.anIntArray434[local7] = arg0 * this.anIntArray434[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray440[local7] = this.anIntArray440[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray438[local7] = this.anIntArray438[local7] * arg2 >> 7;
			}
		}
		this.method7091();
		this.aBoolean676 = false;
	}

	@OriginalMember(owner = "client!qw", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort102;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "()[Lclient!cia;")
	@Override
	public Class49[] method7050() {
		return this.aClass49Array5;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!hba;Lclient!lda;II)V")
	@Override
	public void method7057(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class9_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8474 == 0) {
			return;
		}
		@Pc(16) Class115_Sub3 local16 = this.aClass5_Sub2_19.aClass115_Sub3_16;
		@Pc(19) Class115_Sub3 local19 = (Class115_Sub3) arg0;
		if (!this.aBoolean676) {
			this.method7082();
		}
		Static556.aFloat182 = local16.aFloat148 * local19.aFloat143 + local19.aFloat149 * local16.aFloat153 + local19.aFloat144 * local16.aFloat145 + local16.aFloat144;
		Static393.aFloat142 = local16.aFloat145 * local19.aFloat153 + local16.aFloat153 * local19.aFloat147 + local19.aFloat151 * local16.aFloat148;
		@Pc(72) float local72 = (float) this.anInt8498 * Static393.aFloat142 + Static556.aFloat182;
		@Pc(80) float local80 = (float) this.anInt8495 * Static393.aFloat142 + Static556.aFloat182;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.anInt8479 + local80;
			local97 = (float) this.anInt8479 + local72;
		} else {
			local91 = (float) -this.anInt8479 + local72;
			local97 = (float) this.anInt8479 + local80;
		}
		if (this.aClass5_Sub2_19.aFloat103 <= local91 || (float) this.aClass5_Sub2_19.anInt4893 >= local97) {
			return;
		}
		Static462.aFloat162 = local19.aFloat153 * local16.aFloat146 + local19.aFloat147 * local16.aFloat151 + local19.aFloat151 * local16.aFloat152;
		Static496.aFloat163 = local16.aFloat143 + local19.aFloat144 * local16.aFloat146 + local19.aFloat149 * local16.aFloat151 + local19.aFloat143 * local16.aFloat152;
		@Pc(174) float local174 = Static462.aFloat162 * (float) this.anInt8498 + Static496.aFloat163;
		@Pc(182) float local182 = Static496.aFloat163 + (float) this.anInt8495 * Static462.aFloat162;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local182 < local174) {
			local209 = ((float) -this.anInt8479 + local182) * (float) this.aClass5_Sub2_19.anInt4873;
			local197 = (float) this.aClass5_Sub2_19.anInt4873 * (local174 + (float) this.anInt8479);
		} else {
			local197 = (float) this.aClass5_Sub2_19.anInt4873 * (local182 + (float) this.anInt8479);
			local209 = ((float) -this.anInt8479 + local174) * (float) this.aClass5_Sub2_19.anInt4873;
		}
		if (local209 / (float) arg2 >= this.aClass5_Sub2_19.aFloat104 || this.aClass5_Sub2_19.aFloat102 >= local197 / (float) arg2) {
			return;
		}
		Static623.aFloat185 = local19.aFloat147 * local16.aFloat147 + local19.aFloat151 * local16.aFloat154 + local19.aFloat153 * local16.aFloat150;
		Static335.aFloat132 = local16.aFloat149 + local19.aFloat149 * local16.aFloat147 + local16.aFloat154 * local19.aFloat143 + local19.aFloat144 * local16.aFloat150;
		@Pc(301) float local301 = Static335.aFloat132 + (float) this.anInt8498 * Static623.aFloat185;
		@Pc(309) float local309 = Static335.aFloat132 + Static623.aFloat185 * (float) this.anInt8495;
		@Pc(325) float local325;
		@Pc(336) float local336;
		if (local309 < local301) {
			local336 = (float) this.aClass5_Sub2_19.anInt4872 * ((float) this.anInt8479 + local301);
			local325 = (float) this.aClass5_Sub2_19.anInt4872 * (local309 - (float) this.anInt8479);
		} else {
			local325 = ((float) -this.anInt8479 + local301) * (float) this.aClass5_Sub2_19.anInt4872;
			local336 = ((float) this.anInt8479 + local309) * (float) this.aClass5_Sub2_19.anInt4872;
		}
		if (this.aClass5_Sub2_19.aFloat94 <= local325 / (float) arg2 || local336 / (float) arg2 <= this.aClass5_Sub2_19.aFloat97) {
			return;
		}
		if (arg1 != null || this.aClass292Array1 != null) {
			Static259.aFloat137 = local19.aFloat145 * local16.aFloat145 + local19.aFloat146 * local16.aFloat148 + local16.aFloat153 * local19.aFloat150;
			Static82.aFloat67 = local19.aFloat146 * local16.aFloat152 + local19.aFloat150 * local16.aFloat151 + local19.aFloat145 * local16.aFloat146;
			Static49.aFloat59 = local19.aFloat152 * local16.aFloat152 + local16.aFloat151 * local19.aFloat154 + local16.aFloat146 * local19.aFloat148;
			Static224.aFloat117 = local16.aFloat147 * local19.aFloat154 + local16.aFloat154 * local19.aFloat152 + local16.aFloat150 * local19.aFloat148;
			Static379.aFloat139 = local16.aFloat153 * local19.aFloat154 + local16.aFloat148 * local19.aFloat152 + local16.aFloat145 * local19.aFloat148;
			Static180.aFloat88 = local19.aFloat145 * local16.aFloat150 + local16.aFloat147 * local19.aFloat150 + local19.aFloat146 * local16.aFloat154;
		}
		if (arg1 != null) {
			@Pc(503) int local503 = this.anInt8439 + this.anInt8464 >> 1;
			@Pc(511) int local511 = this.lb + this.anInt8478 >> 1;
			@Pc(530) int local530 = (int) (Static82.aFloat67 * (float) local511 + (float) this.anInt8498 * Static462.aFloat162 + Static496.aFloat163 + (float) local503 * Static49.aFloat59);
			@Pc(549) int local549 = (int) (Static623.aFloat185 * (float) this.anInt8498 + Static335.aFloat132 + (float) local503 * Static224.aFloat117 + Static180.aFloat88 * (float) local511);
			@Pc(568) int local568 = (int) ((float) local503 * Static379.aFloat139 + Static556.aFloat182 + Static393.aFloat142 * (float) this.anInt8498 + (float) local511 * Static259.aFloat137);
			@Pc(587) int local587 = (int) ((float) local511 * Static82.aFloat67 + Static462.aFloat162 * (float) this.anInt8495 + Static496.aFloat163 + (float) local503 * Static49.aFloat59);
			@Pc(606) int local606 = (int) (Static335.aFloat132 + (float) local503 * Static224.aFloat117 + Static623.aFloat185 * (float) this.anInt8495 + (float) local511 * Static180.aFloat88);
			arg1.anInt6272 = this.aClass5_Sub2_19.anInt4871 + this.aClass5_Sub2_19.anInt4872 * local606 / arg2;
			@Pc(639) int local639 = (int) (Static259.aFloat137 * (float) local511 + (float) this.anInt8495 * Static393.aFloat142 + Static556.aFloat182 + (float) local503 * Static379.aFloat139);
			arg1.anInt6270 = this.aClass5_Sub2_19.anInt4873 * local587 / arg2 + this.aClass5_Sub2_19.anInt4894;
			arg1.anInt6271 = local530 * this.aClass5_Sub2_19.anInt4873 / arg2 + this.aClass5_Sub2_19.anInt4894;
			arg1.anInt6273 = this.aClass5_Sub2_19.anInt4871 + local549 * this.aClass5_Sub2_19.anInt4872 / arg2;
			if (local568 >= this.aClass5_Sub2_19.anInt4893 || local639 >= this.aClass5_Sub2_19.anInt4893) {
				arg1.aBoolean490 = true;
				arg1.anInt6269 = this.aClass5_Sub2_19.anInt4894 + (local530 + this.anInt8479) * this.aClass5_Sub2_19.anInt4873 / arg2 - arg1.anInt6271;
			}
		}
		this.aClass5_Sub2_19.method4059((float) arg2);
		this.aClass5_Sub2_19.method3940();
		this.aClass5_Sub2_19.method4052(local19);
		this.method7088();
		this.method7074();
	}

	@OriginalMember(owner = "client!qw", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort101;
	}

	@OriginalMember(owner = "client!qw", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static299.anInt6110 = 0;
			local26 = 0;
			Static476.anInt8410 = 0;
			Static193.anInt2613 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray43.length) {
					local52 = this.anIntArrayArray43[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray140 == null || (arg6 & this.aShortArray140[local60]) != 0) {
							Static299.anInt6110 += this.anIntArray434[local60];
							Static193.anInt2613 += this.anIntArray440[local60];
							local26++;
							Static476.anInt8410 += this.anIntArray438[local60];
						}
					}
				}
			}
			if (local26 <= 0) {
				Static299.anInt6110 = arg2;
				Static193.anInt2613 = arg3;
				Static476.anInt8410 = arg4;
			} else {
				Static476.anInt8410 = arg4 + Static476.anInt8410 / local26;
				Static112.aBoolean843 = true;
				Static193.anInt2613 = Static193.anInt2613 / local26 + arg3;
				Static299.anInt6110 = arg2 + Static299.anInt6110 / local26;
			}
			return;
		}
		@Pc(255) int[] local255;
		@Pc(257) int local257;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg7[1] * arg3 + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg3 * arg7[4] + arg7[3] * arg2 + 8192 >> 14;
				local38 = arg3 * arg7[7] + arg7[6] * arg2 + arg4 * arg7[8] + 8192 >> 14;
				arg2 = local26;
				arg3 = local32;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray43.length) {
					local255 = this.anIntArrayArray43[local32];
					for (local257 = 0; local257 < local255.length; local257++) {
						local54 = local255[local257];
						if (this.aShortArray140 == null || (this.aShortArray140[local54] & arg6) != 0) {
							this.anIntArray434[local54] += arg2;
							this.anIntArray440[local54] += arg3;
							this.anIntArray438[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(378) int local378;
		@Pc(401) int local401;
		@Pc(431) int local431;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(466) int local466;
		@Pc(470) int local470;
		@Pc(478) int local478;
		@Pc(486) int local486;
		@Pc(642) int local642;
		@Pc(668) int local668;
		@Pc(672) int local672;
		@Pc(680) int local680;
		@Pc(685) int local685;
		@Pc(689) int local689;
		@Pc(693) int local693;
		@Pc(695) int local695;
		@Pc(827) int[] local827;
		@Pc(829) int local829;
		@Pc(833) int local833;
		@Pc(837) int local837;
		@Pc(839) int local839;
		@Pc(971) int local971;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray43.length) {
						local255 = this.anIntArrayArray43[local32];
						for (local257 = 0; local257 < local255.length; local257++) {
							local54 = local255[local257];
							if (this.aShortArray140 == null || (this.aShortArray140[local54] & arg6) != 0) {
								this.anIntArray434[local54] -= Static299.anInt6110;
								this.anIntArray440[local54] -= Static193.anInt2613;
								this.anIntArray438[local54] -= Static476.anInt8410;
								if (arg4 != 0) {
									local60 = Class78_Sub2_Sub2.anIntArray270[arg4];
									local378 = Class78_Sub2_Sub2.anIntArray271[arg4];
									local401 = local378 * this.anIntArray434[local54] + this.anIntArray440[local54] * local60 + 16383 >> 14;
									this.anIntArray440[local54] = local378 * this.anIntArray440[local54] + 16383 - this.anIntArray434[local54] * local60 >> 14;
									this.anIntArray434[local54] = local401;
								}
								if (arg2 != 0) {
									local60 = Class78_Sub2_Sub2.anIntArray270[arg2];
									local378 = Class78_Sub2_Sub2.anIntArray271[arg2];
									local401 = this.anIntArray440[local54] * local378 + 16383 - local60 * this.anIntArray438[local54] >> 14;
									this.anIntArray438[local54] = this.anIntArray440[local54] * local60 + this.anIntArray438[local54] * local378 + 16383 >> 14;
									this.anIntArray440[local54] = local401;
								}
								if (arg3 != 0) {
									local60 = Class78_Sub2_Sub2.anIntArray270[arg3];
									local378 = Class78_Sub2_Sub2.anIntArray271[arg3];
									local401 = local60 * this.anIntArray438[local54] + this.anIntArray434[local54] * local378 + 16383 >> 14;
									this.anIntArray438[local54] = local378 * this.anIntArray438[local54] + 16383 - local60 * this.anIntArray434[local54] >> 14;
									this.anIntArray434[local54] = local401;
								}
								this.anIntArray434[local54] += Static299.anInt6110;
								this.anIntArray440[local54] += Static193.anInt2613;
								this.anIntArray438[local54] += Static476.anInt8410;
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
								if (this.aShortArray140 == null || (arg6 & this.aShortArray140[local60]) != 0) {
									local378 = this.anIntArray437[local60];
									local401 = this.anIntArray437[local60 + 1];
									for (local431 = local378; local431 < local401; local431++) {
										local458 = this.aShortArray146[local431] - 1;
										if (local458 == -1) {
											break;
										}
										if (arg4 != 0) {
											local462 = Class78_Sub2_Sub2.anIntArray270[arg4];
											local466 = Class78_Sub2_Sub2.anIntArray271[arg4];
											local470 = local462 * this.aShortArray145[local458] + this.aShortArray143[local458] * local466 + 16383 >> 14;
											this.aShortArray145[local458] = (short) (local466 * this.aShortArray145[local458] + 16383 - local462 * this.aShortArray143[local458] >> 14);
											this.aShortArray143[local458] = (short) local470;
										}
										if (arg2 != 0) {
											local462 = Class78_Sub2_Sub2.anIntArray270[arg2];
											local466 = Class78_Sub2_Sub2.anIntArray271[arg2];
											local470 = this.aShortArray145[local458] * local466 + 16383 - local462 * this.aShortArray148[local458] >> 14;
											this.aShortArray148[local458] = (short) (this.aShortArray148[local458] * local466 + local462 * this.aShortArray145[local458] + 16383 >> 14);
											this.aShortArray145[local458] = (short) local470;
										}
										if (arg3 != 0) {
											local462 = Class78_Sub2_Sub2.anIntArray270[arg3];
											local466 = Class78_Sub2_Sub2.anIntArray271[arg3];
											local470 = local466 * this.aShortArray143[local458] + local462 * this.aShortArray148[local458] + 16383 >> 14;
											this.aShortArray148[local458] = (short) (local466 * this.aShortArray148[local458] + 16383 - this.aShortArray143[local458] * local462 >> 14);
											this.aShortArray143[local458] = (short) local470;
										}
									}
								}
							}
						}
					}
					this.method7085();
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local257 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static112.aBoolean843) {
					local378 = arg7[3] * Static193.anInt2613 + Static299.anInt6110 * arg7[0] + arg7[6] * Static476.anInt8410 + 8192 >> 14;
					local401 = Static299.anInt6110 * arg7[1] + arg7[4] * Static193.anInt2613 + Static476.anInt8410 * arg7[7] + 8192 >> 14;
					local378 += local257;
					local401 += local54;
					local431 = arg7[8] * Static476.anInt8410 + Static299.anInt6110 * arg7[2] + Static193.anInt2613 * arg7[5] + 8192 >> 14;
					Static299.anInt6110 = local378;
					Static193.anInt2613 = local401;
					local431 += local60;
					Static112.aBoolean843 = false;
					Static476.anInt8410 = local431;
				}
				@Pc(446) int[] local446 = new int[9];
				local401 = Class78_Sub2_Sub2.anIntArray271[arg2];
				local431 = Class78_Sub2_Sub2.anIntArray270[arg2];
				local458 = Class78_Sub2_Sub2.anIntArray271[arg3];
				local462 = Class78_Sub2_Sub2.anIntArray270[arg3];
				local466 = Class78_Sub2_Sub2.anIntArray271[arg4];
				local470 = Class78_Sub2_Sub2.anIntArray270[arg4];
				local478 = local431 * local466 + 8192 >> 14;
				local486 = local470 * local431 + 8192 >> 14;
				local446[3] = local470 * local401 + 8192 >> 14;
				local446[5] = -local431;
				local446[2] = local401 * local462 + 8192 >> 14;
				local446[1] = -local458 * local470 + local478 * local462 + 8192 >> 14;
				local446[8] = local401 * local458 + 8192 >> 14;
				local446[6] = local466 * -local462 + local458 * local486 + 8192 >> 14;
				local446[0] = local458 * local466 + local486 * local462 + 8192 >> 14;
				local446[7] = local462 * local470 + local458 * local478 + 8192 >> 14;
				local446[4] = local401 * local466 + 8192 >> 14;
				@Pc(617) int local617 = -Static299.anInt6110 * local446[0] + -Static193.anInt2613 * local446[1] + -Static476.anInt8410 * local446[2] + 8192 >> 14;
				local642 = local446[5] * -Static476.anInt8410 + local446[3] * -Static299.anInt6110 + local446[4] * -Static193.anInt2613 + 8192 >> 14;
				local668 = local446[7] * -Static193.anInt2613 + -Static299.anInt6110 * local446[6] + local446[8] * -Static476.anInt8410 + 8192 >> 14;
				local672 = local617 + Static299.anInt6110;
				@Pc(676) int local676 = Static193.anInt2613 + local642;
				local680 = Static476.anInt8410 + local668;
				@Pc(683) int[] local683 = new int[9];
				for (local685 = 0; local685 < 3; local685++) {
					for (local689 = 0; local689 < 3; local689++) {
						local693 = 0;
						for (local695 = 0; local695 < 3; local695++) {
							local693 += arg7[local689 * 3 + local695] * local446[local685 * 3 + local695];
						}
						local683[local685 * 3 + local689] = local693 + 8192 >> 14;
					}
				}
				local689 = local446[1] * local54 + local446[0] * local257 + local60 * local446[2] + 8192 >> 14;
				local693 = local446[3] * local257 + local446[4] * local54 + local60 * local446[5] + 8192 >> 14;
				local689 += local672;
				local693 += local676;
				local695 = local54 * local446[7] + local257 * local446[6] + local446[8] * local60 + 8192 >> 14;
				local695 += local680;
				local827 = new int[9];
				for (local829 = 0; local829 < 3; local829++) {
					for (local833 = 0; local833 < 3; local833++) {
						local837 = 0;
						for (local839 = 0; local839 < 3; local839++) {
							local837 += local683[local839 * 3 + local833] * arg7[local839 + local829 * 3];
						}
						local827[local829 * 3 + local833] = local837 + 8192 >> 14;
					}
				}
				local833 = local695 * arg7[2] + local693 * arg7[1] + arg7[0] * local689 + 8192 >> 14;
				local837 = local689 * arg7[3] + arg7[4] * local693 + local695 * arg7[5] + 8192 >> 14;
				local833 += local26;
				local837 += local32;
				local839 = local689 * arg7[6] + arg7[7] * local693 + local695 * arg7[8] + 8192 >> 14;
				local839 += local38;
				for (local971 = 0; local971 < local8; local971++) {
					@Pc(977) int local977 = arg1[local971];
					if (this.anIntArrayArray43.length > local977) {
						@Pc(987) int[] local987 = this.anIntArrayArray43[local977];
						for (@Pc(989) int local989 = 0; local989 < local987.length; local989++) {
							@Pc(995) int local995 = local987[local989];
							if (this.aShortArray140 == null || (this.aShortArray140[local995] & arg6) != 0) {
								@Pc(1039) int local1039 = this.anIntArray438[local995] * local827[2] + this.anIntArray440[local995] * local827[1] + local827[0] * this.anIntArray434[local995] + 8192 >> 14;
								@Pc(1070) int local1070 = local827[5] * this.anIntArray438[local995] + this.anIntArray440[local995] * local827[4] + local827[3] * this.anIntArray434[local995] + 8192 >> 14;
								@Pc(1101) int local1101 = local827[8] * this.anIntArray438[local995] + local827[7] * this.anIntArray440[local995] + local827[6] * this.anIntArray434[local995] + 8192 >> 14;
								@Pc(1105) int local1105 = local1039 + local833;
								@Pc(1109) int local1109 = local1070 + local837;
								this.anIntArray434[local995] = local1105;
								@Pc(1118) int local1118 = local1101 + local839;
								this.anIntArray440[local995] = local1109;
								this.anIntArray438[local995] = local1118;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2591) Class196 local2591;
			@Pc(2481) boolean local2481;
			@Pc(2586) Class292 local2586;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					local2481 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray42.length) {
							local52 = this.anIntArrayArray42[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray139 == null || (this.aShortArray139[local60] & arg6) != 0) {
									local378 = arg2 * 8 + (this.aByteArray79[local60] & 0xFF);
									if (local378 < 0) {
										local378 = 0;
									} else if (local378 > 255) {
										local378 = 255;
									}
									this.aByteArray79[local60] = (byte) local378;
								}
							}
							local2481 |= local52.length > 0;
						}
					}
					if (local2481) {
						if (this.aClass292Array1 != null) {
							for (local38 = 0; local38 < this.anInt8440; local38++) {
								local2586 = this.aClass292Array1[local38];
								local2591 = this.aClass196Array1[local38];
								local2591.anInt6790 = local2591.anInt6790 & 0xFFFFFF | 255 - (this.aByteArray79[local2586.anInt8622] & 0xFF) << 24;
							}
						}
						this.method7073();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray42 != null) {
					local2481 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray42.length) {
							local52 = this.anIntArrayArray42[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray139 == null || (arg6 & this.aShortArray139[local60]) != 0) {
									local378 = this.aShortArray141[local60] & 0xFFFF;
									local401 = local378 >> 10 & 0x3F;
									local431 = local378 >> 7 & 0x7;
									@Pc(2694) int local2694 = local401 + arg2 & 0x3F;
									local431 += arg3 / 4;
									local458 = local378 & 0x7F;
									local458 += arg4;
									if (local431 < 0) {
										local431 = 0;
									} else if (local431 > 7) {
										local431 = 7;
									}
									if (local458 < 0) {
										local458 = 0;
									} else if (local458 > 127) {
										local458 = 127;
									}
									this.aShortArray141[local60] = (short) (local2694 << 10 | local431 << 7 | local458);
								}
							}
							local2481 |= local52.length > 0;
						}
					}
					if (local2481) {
						if (this.aClass292Array1 != null) {
							for (local38 = 0; local38 < this.anInt8440; local38++) {
								local2586 = this.aClass292Array1[local38];
								local2591 = this.aClass196Array1[local38];
								local2591.anInt6790 = Static376.anIntArray336[this.aShortArray141[local2586.anInt8622] & 0xFFFF] & 0xFFFFFF | local2591.anInt6790 & 0xFF000000;
							}
						}
						this.method7073();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray44 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray44.length > local32) {
							local255 = this.anIntArrayArray44[local32];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2591 = this.aClass196Array1[local255[local257]];
								local2591.anInt6787 += arg2;
								local2591.anInt6788 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray44 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray44.length > local32) {
							local255 = this.anIntArrayArray44[local32];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2591 = this.aClass196Array1[local255[local257]];
								local2591.anInt6785 = arg3 * local2591.anInt6785 >> 7;
								local2591.anInt6792 = arg2 * local2591.anInt6792 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray44.length > local32) {
						local255 = this.anIntArrayArray44[local32];
						for (local257 = 0; local257 < local255.length; local257++) {
							local2591 = this.aClass196Array1[local255[local257]];
							local2591.anInt6794 = arg2 + local2591.anInt6794 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray43.length > local32) {
					local255 = this.anIntArrayArray43[local32];
					for (local257 = 0; local257 < local255.length; local257++) {
						local54 = local255[local257];
						if (this.aShortArray140 == null || (arg6 & this.aShortArray140[local54]) != 0) {
							this.anIntArray434[local54] -= Static299.anInt6110;
							this.anIntArray440[local54] -= Static193.anInt2613;
							this.anIntArray438[local54] -= Static476.anInt8410;
							this.anIntArray434[local54] = arg2 * this.anIntArray434[local54] >> 7;
							this.anIntArray440[local54] = arg3 * this.anIntArray440[local54] >> 7;
							this.anIntArray438[local54] = this.anIntArray438[local54] * arg4 >> 7;
							this.anIntArray434[local54] += Static299.anInt6110;
							this.anIntArray440[local54] += Static193.anInt2613;
							this.anIntArray438[local54] += Static476.anInt8410;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local257 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static112.aBoolean843) {
				local378 = arg7[6] * Static476.anInt8410 + arg7[3] * Static193.anInt2613 + arg7[0] * Static299.anInt6110 + 8192 >> 14;
				local401 = arg7[1] * Static299.anInt6110 + Static193.anInt2613 * arg7[4] + arg7[7] * Static476.anInt8410 + 8192 >> 14;
				local431 = Static299.anInt6110 * arg7[2] + Static193.anInt2613 * arg7[5] + arg7[8] * Static476.anInt8410 + 8192 >> 14;
				local378 += local257;
				local401 += local54;
				Static299.anInt6110 = local378;
				Static193.anInt2613 = local401;
				local431 += local60;
				Static476.anInt8410 = local431;
				Static112.aBoolean843 = false;
			}
			local378 = arg2 << 15 >> 7;
			local401 = arg3 << 15 >> 7;
			local431 = arg4 << 15 >> 7;
			local458 = local378 * -Static299.anInt6110 + 8192 >> 14;
			local462 = local401 * -Static193.anInt2613 + 8192 >> 14;
			local466 = local431 * -Static476.anInt8410 + 8192 >> 14;
			local470 = local458 + Static299.anInt6110;
			local478 = Static193.anInt2613 + local462;
			local486 = Static476.anInt8410 + local466;
			@Pc(2010) int[] local2010 = new int[] { arg7[0] * local378 + 8192 >> 14, arg7[3] * local378 + 8192 >> 14, arg7[6] * local378 + 8192 >> 14, local401 * arg7[1] + 8192 >> 14, arg7[4] * local401 + 8192 >> 14, local401 * arg7[7] + 8192 >> 14, arg7[2] * local431 + 8192 >> 14, local431 * arg7[5] + 8192 >> 14, local431 * arg7[8] + 8192 >> 14 };
			local642 = local257 * local378 + 8192 >> 14;
			local668 = local401 * local54 + 8192 >> 14;
			@Pc(2138) int local2138 = local642 + local470;
			@Pc(2142) int local2142 = local668 + local478;
			local672 = local60 * local431 + 8192 >> 14;
			@Pc(2154) int local2154 = local672 + local486;
			@Pc(2157) int[] local2157 = new int[9];
			@Pc(2163) int local2163;
			for (local680 = 0; local680 < 3; local680++) {
				for (local2163 = 0; local2163 < 3; local2163++) {
					local685 = 0;
					for (local689 = 0; local689 < 3; local689++) {
						local685 += local2010[local689 * 3 + local2163] * arg7[local680 * 3 + local689];
					}
					local2157[local680 * 3 + local2163] = local685 + 8192 >> 14;
				}
			}
			local2163 = local2154 * arg7[2] + local2138 * arg7[0] + arg7[1] * local2142 + 8192 >> 14;
			local685 = local2154 * arg7[5] + arg7[3] * local2138 + arg7[4] * local2142 + 8192 >> 14;
			local689 = arg7[8] * local2154 + arg7[6] * local2138 + arg7[7] * local2142 + 8192 >> 14;
			local685 += local32;
			local2163 += local26;
			local689 += local38;
			for (local693 = 0; local693 < local8; local693++) {
				local695 = arg1[local693];
				if (local695 < this.anIntArrayArray43.length) {
					local827 = this.anIntArrayArray43[local695];
					for (local829 = 0; local829 < local827.length; local829++) {
						local833 = local827[local829];
						if (this.aShortArray140 == null || (this.aShortArray140[local833] & arg6) != 0) {
							local837 = local2157[2] * this.anIntArray438[local833] + local2157[0] * this.anIntArray434[local833] + local2157[1] * this.anIntArray440[local833] + 8192 >> 14;
							local839 = local2157[5] * this.anIntArray438[local833] + local2157[4] * this.anIntArray440[local833] + local2157[3] * this.anIntArray434[local833] + 8192 >> 14;
							local971 = local2157[8] * this.anIntArray438[local833] + this.anIntArray440[local833] * local2157[7] + local2157[6] * this.anIntArray434[local833] + 8192 >> 14;
							@Pc(2438) int local2438 = local839 + local685;
							@Pc(2442) int local2442 = local837 + local2163;
							@Pc(2446) int local2446 = local971 + local689;
							this.anIntArray434[local833] = local2442;
							this.anIntArray440[local833] = local2438;
							this.anIntArray438[local833] = local2446;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean678;
	}

	@OriginalMember(owner = "client!qw", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static476.anInt8410 = 0;
			Static299.anInt6110 = 0;
			local13 = 0;
			Static193.anInt2613 = 0;
			for (local17 = 0; local17 < this.anInt8442; local17++) {
				Static299.anInt6110 += this.anIntArray434[local17];
				Static193.anInt2613 += this.anIntArray440[local17];
				Static476.anInt8410 += this.anIntArray438[local17];
				local13++;
			}
			if (local13 > 0) {
				Static193.anInt2613 = arg2 + Static193.anInt2613 / local13;
				Static476.anInt8410 = Static476.anInt8410 / local13 + arg3;
				Static299.anInt6110 = arg1 + Static299.anInt6110 / local13;
			} else {
				Static299.anInt6110 = arg1;
				Static476.anInt8410 = arg3;
				Static193.anInt2613 = arg2;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt8442; local13++) {
				this.anIntArray434[local13] += arg1;
				this.anIntArray440[local13] += arg2;
				this.anIntArray438[local13] += arg3;
			}
		} else {
			@Pc(159) int local159;
			@Pc(177) int local177;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt8442; local13++) {
					this.anIntArray434[local13] -= Static299.anInt6110;
					this.anIntArray440[local13] -= Static193.anInt2613;
					this.anIntArray438[local13] -= Static476.anInt8410;
					if (arg3 != 0) {
						local17 = Class78_Sub2_Sub2.anIntArray270[arg3];
						local159 = Class78_Sub2_Sub2.anIntArray271[arg3];
						local177 = local159 * this.anIntArray434[local13] + this.anIntArray440[local13] * local17 + 16383 >> 14;
						this.anIntArray440[local13] = this.anIntArray440[local13] * local159 + 16383 - local17 * this.anIntArray434[local13] >> 14;
						this.anIntArray434[local13] = local177;
					}
					if (arg1 != 0) {
						local17 = Class78_Sub2_Sub2.anIntArray270[arg1];
						local159 = Class78_Sub2_Sub2.anIntArray271[arg1];
						local177 = local159 * this.anIntArray440[local13] + 16383 - local17 * this.anIntArray438[local13] >> 14;
						this.anIntArray438[local13] = this.anIntArray440[local13] * local17 + this.anIntArray438[local13] * local159 + 16383 >> 14;
						this.anIntArray440[local13] = local177;
					}
					if (arg2 != 0) {
						local17 = Class78_Sub2_Sub2.anIntArray270[arg2];
						local159 = Class78_Sub2_Sub2.anIntArray271[arg2];
						local177 = this.anIntArray438[local13] * local17 + this.anIntArray434[local13] * local159 + 16383 >> 14;
						this.anIntArray438[local13] = local159 * this.anIntArray438[local13] + 16383 - local17 * this.anIntArray434[local13] >> 14;
						this.anIntArray434[local13] = local177;
					}
					this.anIntArray434[local13] += Static299.anInt6110;
					this.anIntArray440[local13] += Static193.anInt2613;
					this.anIntArray438[local13] += Static476.anInt8410;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt8442; local13++) {
					this.anIntArray434[local13] -= Static299.anInt6110;
					this.anIntArray440[local13] -= Static193.anInt2613;
					this.anIntArray438[local13] -= Static476.anInt8410;
					this.anIntArray434[local13] = arg1 * this.anIntArray434[local13] / 128;
					this.anIntArray440[local13] = this.anIntArray440[local13] * arg2 / 128;
					this.anIntArray438[local13] = this.anIntArray438[local13] * arg3 / 128;
					this.anIntArray434[local13] += Static299.anInt6110;
					this.anIntArray440[local13] += Static193.anInt2613;
					this.anIntArray438[local13] += Static476.anInt8410;
				}
			} else {
				@Pc(510) Class292 local510;
				@Pc(515) Class196 local515;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt8492; local13++) {
						local17 = arg1 * 8 + (this.aByteArray79[local13] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray79[local13] = (byte) local17;
					}
					if (this.aClass292Array1 != null) {
						for (local17 = 0; local17 < this.anInt8440; local17++) {
							local510 = this.aClass292Array1[local17];
							local515 = this.aClass196Array1[local17];
							local515.anInt6790 = local515.anInt6790 & 0xFFFFFF | 255 - (this.aByteArray79[local510.anInt8622] & 0xFF) << 24;
						}
					}
					this.method7073();
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt8492; local13++) {
						local17 = this.aShortArray141[local13] & 0xFFFF;
						local159 = local17 >> 10 & 0x3F;
						local177 = local17 >> 7 & 0x7;
						@Pc(579) int local579 = arg1 + local159 & 0x3F;
						@Pc(583) int local583 = local17 & 0x7F;
						local177 += arg2 / 4;
						local583 += arg3;
						if (local177 < 0) {
							local177 = 0;
						} else if (local177 > 7) {
							local177 = 7;
						}
						if (local583 < 0) {
							local583 = 0;
						} else if (local583 > 127) {
							local583 = 127;
						}
						this.aShortArray141[local13] = (short) (local579 << 10 | local177 << 7 | local583);
					}
					if (this.aClass292Array1 != null) {
						for (local17 = 0; local17 < this.anInt8440; local17++) {
							local510 = this.aClass292Array1[local17];
							local515 = this.aClass196Array1[local17];
							local515.anInt6790 = local515.anInt6790 & 0xFF000000 | Static376.anIntArray336[this.aShortArray141[local510.anInt8622] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7073();
				} else {
					@Pc(702) Class196 local702;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt8440; local13++) {
							local702 = this.aClass196Array1[local13];
							local702.anInt6787 += arg1;
							local702.anInt6788 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt8440; local13++) {
							local702 = this.aClass196Array1[local13];
							local702.anInt6785 = arg2 * local702.anInt6785 >> 7;
							local702.anInt6792 = arg1 * local702.anInt6792 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt8440; local13++) {
							local702 = this.aClass196Array1[local13];
							local702.anInt6794 = local702.anInt6794 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8442; local3++) {
			if (arg0 != 0) {
				this.anIntArray434[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray440[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray438[local3] += arg2;
			}
		}
		this.method7091();
		this.aBoolean676 = false;
	}

	@OriginalMember(owner = "client!qw", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort102 = (short) arg0;
		this.method7091();
		this.method7085();
	}

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "(I)V")
	private void method7082() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt8442; local27++) {
			@Pc(34) int local34 = this.anIntArray434[local27];
			@Pc(39) int local39 = this.anIntArray440[local27];
			if (local15 < local39) {
				local15 = local39;
			}
			if (local9 > local39) {
				local9 = local39;
			}
			if (local34 < local7) {
				local7 = local34;
			}
			@Pc(63) int local63 = this.anIntArray438[local27];
			if (local34 > local13) {
				local13 = local34;
			}
			if (local21 < local63) {
				local21 = local63;
			}
			if (local63 < local11) {
				local11 = local63;
			}
			@Pc(94) int local94 = local34 * local34 + local63 * local63;
			if (local94 > local23) {
				local23 = local94;
			}
			local94 = local39 * local39 + local63 * local63 + local34 * local34;
			if (local94 > local25) {
				local25 = local94;
			}
		}
		this.anInt8478 = local21;
		this.anInt8464 = local7;
		this.anInt8495 = local15;
		this.anInt8498 = local9;
		this.anInt8439 = local13;
		this.lb = local11;
		this.anInt8479 = (int) (Math.sqrt((double) local23) + 0.99D);
		this.anInt8489 = (int) (Math.sqrt((double) local25) + 0.99D);
		this.aBoolean676 = true;
	}

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) Class245 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean676) {
			this.method7082();
		}
		@Pc(16) int local16 = this.anInt8464 + arg4;
		@Pc(21) int local21 = this.anInt8439 + arg4;
		@Pc(26) int local26 = this.lb + arg6;
		@Pc(31) int local31 = this.anInt8478 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9289 <= arg2.anInt9291 + local21 >> arg2.anInt9286 || local26 < 0 || arg2.anInt9290 <= arg2.anInt9291 + local31 >> arg2.anInt9286)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt9291 >> arg3.anInt9286 >= arg3.anInt9289 || local26 < 0 || arg3.anInt9291 + local31 >> arg3.anInt9286 >= arg3.anInt9290) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9286;
			local21 = local21 + arg2.anInt9291 - 1 >> arg2.anInt9286;
			local26 >>= arg2.anInt9286;
			local31 = arg2.anInt9291 + local31 - 1 >> arg2.anInt9286;
			if (arg5 == arg2.method7583(local26, local16) && arg5 == arg2.method7583(local26, local21) && arg5 == arg2.method7583(local31, local16) && arg5 == arg2.method7583(local31, local21)) {
				return;
			}
		}
		@Pc(202) int local202;
		if (arg0 == 1) {
			for (local202 = 0; local202 < this.anInt8442; local202++) {
				this.anIntArray440[local202] += arg2.method7580(arg4 + this.anIntArray434[local202], arg6 + this.anIntArray438[local202]) - arg5;
			}
		} else {
			@Pc(210) int local210;
			@Pc(218) int local218;
			if (arg0 == 2) {
				local202 = this.anInt8498;
				if (local202 == 0) {
					return;
				}
				for (local210 = 0; local210 < this.anInt8442; local210++) {
					local218 = (this.anIntArray440[local210] << 16) / local202;
					if (local218 < arg1) {
						this.anIntArray440[local210] -= -((arg2.method7580(arg4 + this.anIntArray434[local210], this.anIntArray438[local210] - -arg6) - arg5) * (-local218 + arg1) / arg1);
					}
				}
			} else {
				@Pc(226) int local226;
				if (arg0 == 3) {
					local202 = (arg1 & 0xFF) * 4;
					local210 = (arg1 >> 8 & 0xFF) * 4;
					local218 = (arg1 >> 16 & 0xFF) << 6;
					local226 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local202 >> 1) < 0 || arg2.anInt9289 << arg2.anInt9286 <= arg4 + (local202 >> 1) + arg2.anInt9291 || arg6 - (local210 >> 1) < 0 || arg2.anInt9290 << arg2.anInt9286 <= (local210 >> 1) + (arg6 + arg2.anInt9291)) {
						return;
					}
					this.method7064(local210, local202, arg2, arg5, arg4, arg6, local218, local226);
				} else if (arg0 == 4) {
					local202 = this.anInt8495 - this.anInt8498;
					for (local210 = 0; local210 < this.anInt8442; local210++) {
						this.anIntArray440[local210] = this.anIntArray440[local210] + arg3.method7580(arg4 + this.anIntArray434[local210], arg6 + this.anIntArray438[local210]) + local202 - arg5;
					}
				} else if (arg0 == 5) {
					local202 = this.anInt8495 - this.anInt8498;
					for (local210 = 0; local210 < this.anInt8442; local210++) {
						local218 = arg4 + this.anIntArray434[local210];
						local226 = arg6 + this.anIntArray438[local210];
						@Pc(326) int local326 = arg2.method7580(local218, local226);
						@Pc(332) int local332 = arg3.method7580(local218, local226);
						@Pc(340) int local340 = local326 - arg1 - local332;
						this.anIntArray440[local210] = ((this.anIntArray440[local210] << 8) / local202 * local340 >> 8) + local326 - arg5;
					}
				}
			}
		}
		this.method7091();
		this.aBoolean676 = false;
	}

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "(I)V")
	public void method7083() {
		if (this.aClass204_4 != null) {
			this.aClass204_4.method5736();
		}
		if (this.aClass204_3 != null) {
			this.aClass204_3.method5736();
		}
		if (this.aClass204_1 != null) {
			this.aClass204_1.method5736();
		}
		if (this.aClass204_2 != null) {
			this.aClass204_2.method5736();
		}
		if (this.aClass27_1 != null) {
			this.aClass27_1.method1347();
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)Z")
	private boolean method7084() {
		@Pc(13) boolean local13 = !this.aClass204_1.aBoolean547;
		@Pc(29) boolean local29 = (this.anInt8504 & 0x37) != 0 && !this.aClass204_2.aBoolean547;
		@Pc(37) boolean local37 = !this.aClass204_4.aBoolean547;
		@Pc(51) boolean local51 = !this.aClass204_3.aBoolean547;
		if (!local37 && !local13 && !local29 && !local51) {
			return true;
		}
		@Pc(63) boolean local63 = true;
		@Pc(82) Interface26 local82;
		@Pc(96) Buffer local96;
		if (local37) {
			if (this.aClass204_4.anInterface26_15 == null) {
				this.aClass204_4.anInterface26_15 = this.aClass5_Sub2_19.method4063(this.aBoolean675);
			}
			local82 = this.aClass204_4.anInterface26_15;
			local82.method8109(12, this.anInt8474 * 12);
			local96 = local82.method8110();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass5_Sub2_19.aNativeInterface3.copyPositions(this.anIntArray434, this.anIntArray440, this.anIntArray438, this.aShortArray136, 0, 12, this.anInt8474, local96.getAddress());
				if (local82.method8107()) {
					this.aClass204_4.aBoolean547 = true;
					this.aClass204_4.anInterface26_16 = local82;
				} else {
					local63 = false;
				}
			}
		}
		@Pc(209) short[] local209;
		@Pc(205) short[] local205;
		@Pc(217) short[] local217;
		@Pc(213) byte[] local213;
		if (local13) {
			if (this.aClass204_1.anInterface26_15 == null) {
				this.aClass204_1.anInterface26_15 = this.aClass5_Sub2_19.method4063(this.aBoolean675);
			}
			local82 = this.aClass204_1.anInterface26_15;
			local82.method8109(4, this.anInt8474 * 4);
			local96 = local82.method8110();
			if (local96 == null) {
				local63 = false;
			} else {
				if ((this.anInt8504 & 0x37) == 0) {
					if (this.aClass182_1 == null) {
						local209 = this.aShortArray143;
						local213 = this.aByteArray78;
						local217 = this.aShortArray148;
						local205 = this.aShortArray145;
					} else {
						local205 = this.aClass182_1.aShortArray88;
						local209 = this.aClass182_1.aShortArray87;
						local213 = this.aClass182_1.aByteArray44;
						local217 = this.aClass182_1.aShortArray89;
					}
					this.aClass5_Sub2_19.aNativeInterface3.copyLighting(this.aShortArray141, this.aByteArray79, this.aShortArray144, local209, local205, local217, local213, this.aShort101, this.aShort102, this.aShortArray137, 0, 4, this.anInt8474, local96.getAddress());
				} else {
					this.aClass5_Sub2_19.aNativeInterface3.copyColours(this.aShortArray141, this.aByteArray79, this.aShortArray144, this.aShort101, this.aShortArray137, 0, 4, this.anInt8474, local96.getAddress());
				}
				if (local82.method8107()) {
					this.aClass204_1.aBoolean547 = true;
					this.aClass204_1.anInterface26_16 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local29) {
			if (this.aClass204_2.anInterface26_15 == null) {
				this.aClass204_2.anInterface26_15 = this.aClass5_Sub2_19.method4063(this.aBoolean675);
			}
			local82 = this.aClass204_2.anInterface26_15;
			local82.method8109(12, this.anInt8474 * 12);
			local96 = local82.method8110();
			if (local96 == null) {
				local63 = false;
			} else {
				if (this.aClass182_1 == null) {
					local217 = this.aShortArray148;
					local209 = this.aShortArray143;
					local213 = this.aByteArray78;
					local205 = this.aShortArray145;
				} else {
					local213 = this.aClass182_1.aByteArray44;
					local217 = this.aClass182_1.aShortArray89;
					local209 = this.aClass182_1.aShortArray87;
					local205 = this.aClass182_1.aShortArray88;
				}
				this.aClass5_Sub2_19.aNativeInterface3.copyNormals(local209, local205, local217, local213, 3.0F / (float) this.aShort102, 3.0F / (float) (this.aShort102 + this.aShort102 / 2), 0, 12, this.anInt8474, local96.getAddress());
				if (local82.method8107()) {
					this.aClass204_2.anInterface26_16 = local82;
					this.aClass204_2.aBoolean547 = true;
				} else {
					local63 = false;
				}
			}
		}
		if (local51) {
			if (this.aClass204_3.anInterface26_15 == null) {
				this.aClass204_3.anInterface26_15 = this.aClass5_Sub2_19.method4063(this.aBoolean675);
			}
			local82 = this.aClass204_3.anInterface26_15;
			local82.method8109(8, this.anInt8474 * 8);
			local96 = local82.method8110();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass5_Sub2_19.aNativeInterface3.copyTexCoords(this.aFloatArray72, this.aFloatArray71, 0, 8, this.anInt8474, local96.getAddress());
				if (local82.method8107()) {
					this.aClass204_3.anInterface26_16 = local82;
					this.aClass204_3.aBoolean547 = true;
				} else {
					local63 = false;
				}
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
	private void method7085() {
		if ((this.anInt8504 & 0x37) == 0) {
			if (this.aClass204_1 != null) {
				this.aClass204_1.aBoolean547 = false;
			}
		} else if (this.aClass204_2 != null) {
			this.aClass204_2.aBoolean547 = false;
		}
	}

	@OriginalMember(owner = "client!qw", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class78_Sub2_Sub2.anIntArray270[arg0];
		@Pc(13) int local13 = Class78_Sub2_Sub2.anIntArray271[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8442; local15++) {
			@Pc(33) int local33 = this.anIntArray434[local15] * local13 + local9 * this.anIntArray440[local15] >> 14;
			this.anIntArray440[local15] = local13 * this.anIntArray440[local15] - this.anIntArray434[local15] * local9 >> 14;
			this.anIntArray434[local15] = local33;
		}
		this.method7091();
		this.aBoolean676 = false;
	}

	@OriginalMember(owner = "client!qw", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray43 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8467; local12++) {
			this.anIntArray434[local12] <<= 0x4;
			this.anIntArray440[local12] <<= 0x4;
			this.anIntArray438[local12] <<= 0x4;
		}
		Static476.anInt8410 = 0;
		Static193.anInt2613 = 0;
		Static299.anInt6110 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "()V")
	@Override
	protected void method7070() {
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class78_Sub2_Sub2.anIntArray270[arg0];
		@Pc(13) int local13 = Class78_Sub2_Sub2.anIntArray271[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8442; local15++) {
			@Pc(33) int local33 = this.anIntArray438[local15] * local9 + this.anIntArray434[local15] * local13 >> 14;
			this.anIntArray438[local15] = local13 * this.anIntArray438[local15] - this.anIntArray434[local15] * local9 >> 14;
			this.anIntArray434[local15] = local33;
		}
		this.method7091();
		this.aBoolean676 = false;
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "()Z")
	@Override
	public boolean method7052() {
		if (this.aShortArray144 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray144.length; local12++) {
			if (this.aShortArray144[local12] != -1 && !this.aClass5_Sub2_19.anInterface7_10.method6928(this.aShortArray144[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!hba;ZI)Z")
	@Override
	public boolean method7067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7075(arg0, -1, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "(I)V")
	private void method7087() {
		if (this.aClass27_1 != null) {
			this.aClass27_1.aBoolean135 = false;
		}
	}

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "(I)V")
	private void method7088() {
		if (this.anInt8438 == 0) {
			return;
		}
		if (this.method7084() && this.method7080()) {
			this.aClass5_Sub2_19.method3974(0, this.aClass204_4.anInterface26_16);
			this.aClass5_Sub2_19.method3974(1, this.aClass204_1.anInterface26_16);
			this.aClass5_Sub2_19.method3974(2, this.aClass204_3.anInterface26_16);
			@Pc(61) boolean local61;
			if ((this.anInt8504 & 0x37) == 0) {
				this.aClass5_Sub2_19.method3982(false);
				local61 = false;
				this.aClass5_Sub2_19.method4045(this.aClass5_Sub2_19.aClass270_21);
			} else {
				local61 = true;
				this.aClass5_Sub2_19.method3982(true);
				this.aClass5_Sub2_19.method3974(3, this.aClass204_2.anInterface26_16);
				this.aClass5_Sub2_19.method4045(this.aClass5_Sub2_19.aClass270_17);
			}
			for (@Pc(94) int local94 = 0; local94 < this.anIntArray439.length; local94++) {
				@Pc(101) int local101 = this.anIntArray435[local94];
				@Pc(108) int local108 = this.anIntArray435[local94 + 1];
				@Pc(115) int local115 = this.aShortArray144[local101] & 0xFFFF;
				if (local115 == 65535) {
					local115 = -1;
				}
				this.aClass5_Sub2_19.method4042(true, local115, local61);
				this.aClass5_Sub2_19.method3976(Static574.aClass248_11, this.anIntArray436[local94], local101 * 3, this.aClass27_1.anInterface27_4, this.anIntArray439[local94], local108 - local101);
			}
		}
		this.method7077();
	}

	@OriginalMember(owner = "client!qw", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean676) {
			this.method7082();
		}
		return this.anInt8464;
	}

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "()V")
	@Override
	protected void method7055() {
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(FIJIIIILclient!lv;IIF)S")
	private short method7090(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class192 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray437[arg4];
		@Pc(17) int local17 = this.anIntArray437[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray146[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static118.aLongArray3[local21] == arg2) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray146[local19] = (short) (this.anInt8474 + 1);
		Static118.aLongArray3[local19] = arg2;
		this.aShortArray137[this.anInt8474] = (short) arg1;
		this.aShortArray136[this.anInt8474] = (short) arg4;
		this.aShortArray143[this.anInt8474] = (short) arg3;
		this.aShortArray145[this.anInt8474] = (short) arg5;
		this.aShortArray148[this.anInt8474] = (short) arg6;
		this.aByteArray78[this.anInt8474] = (byte) arg8;
		this.aFloatArray72[this.anInt8474] = arg0;
		this.aFloatArray71[this.anInt8474] = arg9;
		return (short) this.anInt8474++;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!hba;ZII)Z")
	@Override
	public boolean method7061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method7075(arg0, arg5, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "(I)V")
	private void method7091() {
		if (this.aClass204_4 != null) {
			this.aClass204_4.aBoolean547 = false;
		}
	}

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "()V")
	@Override
	public void method7054() {
		if (this.anInt8474 > 0 && this.anInt8438 > 0) {
			this.method7084();
			this.method7080();
			this.method7077();
		}
	}

	@OriginalMember(owner = "client!qw", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean676) {
			this.method7082();
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class78_Sub2_Sub2.anIntArray270[arg0];
		@Pc(13) int local13 = Class78_Sub2_Sub2.anIntArray271[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8442; local15++) {
			local33 = this.anIntArray434[local15] * local13 + this.anIntArray438[local15] * local9 >> 14;
			this.anIntArray438[local15] = local13 * this.anIntArray438[local15] - local9 * this.anIntArray434[local15] >> 14;
			this.anIntArray434[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt8474; local33++) {
			@Pc(84) int local84 = this.aShortArray148[local33] * local9 + local13 * this.aShortArray143[local33] >> 14;
			this.aShortArray148[local33] = (short) (local13 * this.aShortArray148[local33] - local9 * this.aShortArray143[local33] >> 14);
			this.aShortArray143[local33] = (short) local84;
		}
		this.method7091();
		this.method7085();
		this.aBoolean676 = false;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!hba;)V")
	@Override
	public void method7071(@OriginalArg(0) Class115 arg0) {
		@Pc(8) Class115_Sub3 local8 = (Class115_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass103Array5 != null) {
			for (local13 = 0; local13 < this.aClass103Array5.length; local13++) {
				@Pc(20) Class103 local20 = this.aClass103Array5[local13];
				@Pc(22) Class103 local22 = local20;
				if (local20.aClass103_1 != null) {
					local22 = local20.aClass103_1;
				}
				local22.anInt3656 = (int) ((float) this.anIntArray440[local20.anInt3652] * local8.aFloat151 + local8.aFloat152 * (float) this.anIntArray434[local20.anInt3652] + (float) this.anIntArray438[local20.anInt3652] * local8.aFloat146 + local8.aFloat143);
				local22.anInt3653 = (int) ((float) this.anIntArray440[local20.anInt3652] * local8.aFloat147 + (float) this.anIntArray434[local20.anInt3652] * local8.aFloat154 + (float) this.anIntArray438[local20.anInt3652] * local8.aFloat150 + local8.aFloat149);
				local22.anInt3657 = (int) ((float) this.anIntArray438[local20.anInt3652] * local8.aFloat145 + local8.aFloat153 * (float) this.anIntArray440[local20.anInt3652] + local8.aFloat148 * (float) this.anIntArray434[local20.anInt3652] + local8.aFloat144);
				local22.anInt3649 = (int) (local8.aFloat143 + local8.aFloat151 * (float) this.anIntArray440[local20.anInt3647] + local8.aFloat152 * (float) this.anIntArray434[local20.anInt3647] + local8.aFloat146 * (float) this.anIntArray438[local20.anInt3647]);
				local22.anInt3650 = (int) (local8.aFloat149 + local8.aFloat150 * (float) this.anIntArray438[local20.anInt3647] + local8.aFloat154 * (float) this.anIntArray434[local20.anInt3647] + (float) this.anIntArray440[local20.anInt3647] * local8.aFloat147);
				local22.anInt3643 = (int) (local8.aFloat148 * (float) this.anIntArray434[local20.anInt3647] + local8.aFloat153 * (float) this.anIntArray440[local20.anInt3647] + local8.aFloat145 * (float) this.anIntArray438[local20.anInt3647] + local8.aFloat144);
				local22.anInt3645 = (int) ((float) this.anIntArray438[local20.anInt3660] * local8.aFloat146 + local8.aFloat151 * (float) this.anIntArray440[local20.anInt3660] + (float) this.anIntArray434[local20.anInt3660] * local8.aFloat152 + local8.aFloat143);
				local22.anInt3655 = (int) (local8.aFloat149 + local8.aFloat147 * (float) this.anIntArray440[local20.anInt3660] + (float) this.anIntArray434[local20.anInt3660] * local8.aFloat154 + local8.aFloat150 * (float) this.anIntArray438[local20.anInt3660]);
				local22.anInt3648 = (int) (local8.aFloat144 + local8.aFloat153 * (float) this.anIntArray440[local20.anInt3660] + (float) this.anIntArray434[local20.anInt3660] * local8.aFloat148 + local8.aFloat145 * (float) this.anIntArray438[local20.anInt3660]);
			}
		}
		if (this.aClass49Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass49Array5.length; local13++) {
			@Pc(365) Class49 local365 = this.aClass49Array5[local13];
			@Pc(367) Class49 local367 = local365;
			if (local365.aClass49_1 != null) {
				local367 = local365.aClass49_1;
			}
			if (local365.aClass115_1 == null) {
				local365.aClass115_1 = local8.method6292();
			} else {
				local365.aClass115_1.method6282(local8);
			}
			local367.anInt2384 = (int) (local8.aFloat143 + local8.aFloat146 * (float) this.anIntArray438[local365.anInt2379] + local8.aFloat152 * (float) this.anIntArray434[local365.anInt2379] + (float) this.anIntArray440[local365.anInt2379] * local8.aFloat151);
			local367.anInt2381 = (int) (local8.aFloat149 + (float) this.anIntArray438[local365.anInt2379] * local8.aFloat150 + (float) this.anIntArray434[local365.anInt2379] * local8.aFloat154 + (float) this.anIntArray440[local365.anInt2379] * local8.aFloat147);
			local367.anInt2388 = (int) (local8.aFloat144 + (float) this.anIntArray438[local365.anInt2379] * local8.aFloat145 + (float) this.anIntArray440[local365.anInt2379] * local8.aFloat153 + (float) this.anIntArray434[local365.anInt2379] * local8.aFloat148);
		}
	}
}
