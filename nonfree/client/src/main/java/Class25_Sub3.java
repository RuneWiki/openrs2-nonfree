import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
	private int anInt9184;

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
	private int anInt9186;

	@OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
	private int anInt9193;

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
	private int anInt9195;

	@OriginalMember(owner = "client!tv", name = "G", descriptor = "Z")
	private boolean aBoolean675;

	@OriginalMember(owner = "client!tv", name = "Y", descriptor = "Lclient!ag;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!tv", name = "eb", descriptor = "I")
	private int anInt9212;

	@OriginalMember(owner = "client!tv", name = "fb", descriptor = "I")
	private int anInt9213;

	@OriginalMember(owner = "client!tv", name = "ob", descriptor = "I")
	private int anInt9217;

	@OriginalMember(owner = "client!tv", name = "sb", descriptor = "Lclient!rh;")
	private Class293 aClass293_1;

	@OriginalMember(owner = "client!tv", name = "tb", descriptor = "Lclient!rh;")
	private Class293 aClass293_2;

	@OriginalMember(owner = "client!tv", name = "vb", descriptor = "Lclient!rh;")
	private Class293 aClass293_3;

	@OriginalMember(owner = "client!tv", name = "Cb", descriptor = "I")
	private int anInt9224;

	@OriginalMember(owner = "client!tv", name = "Ib", descriptor = "Z")
	private boolean aBoolean677;

	@OriginalMember(owner = "client!tv", name = "Kb", descriptor = "Lclient!nq;")
	private Class237 aClass237_1;

	@OriginalMember(owner = "client!tv", name = "Mb", descriptor = "I")
	private int anInt9230;

	@OriginalMember(owner = "client!tv", name = "Nb", descriptor = "Lclient!rh;")
	private Class293 aClass293_4;

	@OriginalMember(owner = "client!tv", name = "Tb", descriptor = "Z")
	private boolean aBoolean678;

	@OriginalMember(owner = "client!tv", name = "jc", descriptor = "I")
	private int anInt9243;

	@OriginalMember(owner = "client!tv", name = "rc", descriptor = "I")
	private int anInt9249;

	@OriginalMember(owner = "client!tv", name = "sc", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_21;

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "[I")
	private int[] anIntArray640;

	@OriginalMember(owner = "client!tv", name = "Jb", descriptor = "I")
	private int anInt9228;

	@OriginalMember(owner = "client!tv", name = "wc", descriptor = "I")
	private int anInt9252;

	@OriginalMember(owner = "client!tv", name = "K", descriptor = "Z")
	private boolean aBoolean676;

	@OriginalMember(owner = "client!tv", name = "fc", descriptor = "Z")
	private boolean aBoolean679;

	@OriginalMember(owner = "client!tv", name = "dc", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!tv", name = "zc", descriptor = "I")
	private int anInt9255;

	@OriginalMember(owner = "client!tv", name = "hc", descriptor = "[I")
	private int[] anIntArray645;

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
	private int anInt9189;

	@OriginalMember(owner = "client!tv", name = "Z", descriptor = "[I")
	private int[] anIntArray641;

	@OriginalMember(owner = "client!tv", name = "Qb", descriptor = "[I")
	private int[] anIntArray642;

	@OriginalMember(owner = "client!tv", name = "S", descriptor = "[Lclient!gi;")
	private Class130[] aClass130Array4;

	@OriginalMember(owner = "client!tv", name = "mb", descriptor = "[Lclient!uga;")
	private Class337[] aClass337Array4;

	@OriginalMember(owner = "client!tv", name = "V", descriptor = "I")
	private int anInt9206;

	@OriginalMember(owner = "client!tv", name = "Xb", descriptor = "[Lclient!rd;")
	private Class288[] aClass288Array1;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "[Lclient!ji;")
	private Class177[] aClass177Array1;

	@OriginalMember(owner = "client!tv", name = "pb", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!tv", name = "gb", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "S")
	private short aShort114;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!tv", name = "nb", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!tv", name = "Yb", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!tv", name = "W", descriptor = "[S")
	private short[] aShortArray136;

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!tv", name = "Cc", descriptor = "[B")
	private byte[] aByteArray96;

	@OriginalMember(owner = "client!tv", name = "U", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!tv", name = "F", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!tv", name = "kb", descriptor = "[F")
	private float[] aFloatArray69;

	@OriginalMember(owner = "client!tv", name = "qc", descriptor = "[F")
	private float[] aFloatArray70;

	@OriginalMember(owner = "client!tv", name = "vc", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!tv", name = "Bb", descriptor = "S")
	private short aShort115;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!tv", name = "lc", descriptor = "[I")
	private int[] anIntArray646;

	@OriginalMember(owner = "client!tv", name = "Ub", descriptor = "[I")
	private int[] anIntArray643;

	@OriginalMember(owner = "client!tv", name = "ac", descriptor = "[I")
	private int[] anIntArray644;

	@OriginalMember(owner = "client!tv", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray85;

	@OriginalMember(owner = "client!tv", name = "Hb", descriptor = "[[I")
	private int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!tv", name = "Db", descriptor = "[[I")
	private int[][] anIntArrayArray86;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!gt;Lclient!ww;IIII)V")
	public Class25_Sub3(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) Class379 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface6 local11 = arg0.anInterface6_11;
		this.anIntArray640 = new int[arg1.anInt10276 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt10272];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt10272; local24++) {
			if (arg1.aByteArray103 == null || arg1.aByteArray103[local24] != 2) {
				if (arg1.aShortArray153 != null && arg1.aShortArray153[local24] != -1) {
					@Pc(57) Class199 local57 = local11.method6357(arg1.aShortArray153[local24] & 0xFFFF);
					if (((this.anInt9186 & 0x40) == 0 || !local57.aBoolean427) && local57.aBoolean429) {
						continue;
					}
				}
				local22[this.anInt9228++] = local24;
				this.anIntArray640[arg1.aShortArray158[local24]]++;
				this.anIntArray640[arg1.aShortArray152[local24]]++;
				this.anIntArray640[arg1.aShortArray161[local24]]++;
			}
		}
		this.anInt9252 = this.anInt9228;
		@Pc(133) long[] local133 = new long[this.anInt9228];
		@Pc(145) boolean local145 = (this.anInt9230 & 0x100) != 0;
		@Pc(157) int local157;
		@Pc(170) int local170;
		@Pc(333) int local333;
		for (@Pc(147) int local147 = 0; local147 < this.anInt9228; local147++) {
			@Pc(153) int local153 = local22[local147];
			@Pc(155) Class199 local155 = null;
			local157 = 0;
			@Pc(159) byte local159 = 0;
			@Pc(161) byte local161 = 0;
			@Pc(163) byte local163 = 0;
			if (arg1.aClass259Array1 != null) {
				@Pc(168) boolean local168 = false;
				for (local170 = 0; local170 < arg1.aClass259Array1.length; local170++) {
					@Pc(177) Class259 local177 = arg1.aClass259Array1[local170];
					if (local153 == local177.anInt7713) {
						@Pc(190) Class291 local190 = Static283.method4472(local177.anInt7712);
						if (local190.aBoolean617) {
							local168 = true;
						}
						if (local190.anInt8275 != -1) {
							@Pc(206) Class199 local206 = local11.method6357(local190.anInt8275);
							if (local206.anInt5691 == 2) {
								this.aBoolean676 = true;
							}
						}
					}
				}
				if (local168) {
					local133[local147] = Long.MAX_VALUE;
					this.anInt9252--;
					continue;
				}
			}
			@Pc(235) short local235 = -1;
			if (arg1.aShortArray153 != null) {
				local235 = arg1.aShortArray153[local153];
				if (local235 != -1) {
					local155 = local11.method6357(local235 & 0xFFFF);
					if ((this.anInt9186 & 0x40) != 0 && local155.aBoolean427) {
						local155 = null;
						local235 = -1;
					} else {
						local161 = local155.aByte86;
						local163 = local155.aByte82;
					}
				}
			}
			@Pc(295) boolean local295 = arg1.aByteArray104 != null && arg1.aByteArray104[local153] != 0 || local155 != null && local155.anInt5691 != 0;
			if ((local145 || local295) && arg1.aByteArray105 != null) {
				local157 += arg1.aByteArray105[local153] << 17;
			}
			if (local295) {
				local157 += 65536;
			}
			local157 += (local161 & 0xFF) << 8;
			local333 = local159 + ((local235 & 0xFFFF) << 16);
			local157 += local163 & 0xFF;
			@Pc(345) int local345 = local333 + (local147 & 0xFFFF);
			local133[local147] = (long) local345 + ((long) local157 << 32);
			this.aBoolean679 |= local155 != null && (local155.aByte88 != 0 || local155.aByte87 != 0);
			this.aBoolean676 |= local295;
		}
		Static315.method5515(local22, local133);
		this.aShortArray140 = arg1.aShortArray159;
		this.anInt9255 = arg1.anInt10288;
		this.anIntArray645 = arg1.anIntArray743;
		this.anInt9189 = arg1.anInt10276;
		this.anIntArray641 = arg1.anIntArray751;
		this.anIntArray642 = arg1.anIntArray752;
		this.aClass130Array4 = arg1.aClass130Array5;
		@Pc(424) Class212[] local424 = new Class212[this.anInt9189];
		this.aClass337Array4 = arg1.aClass337Array5;
		@Pc(448) int local448;
		@Pc(462) int local462;
		@Pc(505) int local505;
		if (arg1.aClass259Array1 != null) {
			this.anInt9206 = arg1.aClass259Array1.length;
			this.aClass288Array1 = new Class288[this.anInt9206];
			this.aClass177Array1 = new Class177[this.anInt9206];
			for (local448 = 0; local448 < this.anInt9206; local448++) {
				@Pc(455) Class259 local455 = arg1.aClass259Array1[local448];
				@Pc(460) Class291 local460 = Static283.method4472(local455.anInt7712);
				local462 = -1;
				for (@Pc(464) int local464 = 0; local464 < this.anInt9228; local464++) {
					if (local455.anInt7713 == local22[local464]) {
						local462 = local464;
						break;
					}
				}
				if (local462 == -1) {
					throw new RuntimeException();
				}
				local505 = Static349.anIntArray394[arg1.aShortArray154[local455.anInt7713] & 0xFFFF] & 0xFFFFFF;
				@Pc(522) int local522 = local505 | 255 - (arg1.aByteArray104 == null ? 0 : arg1.aByteArray104[local455.anInt7713]) << 24;
				this.aClass288Array1[local448] = new Class288(local462, arg1.aShortArray158[local455.anInt7713], arg1.aShortArray152[local455.anInt7713], arg1.aShortArray161[local455.anInt7713], local460.anInt8273, local460.anInt8269, local460.anInt8275, local460.anInt8278, local460.anInt8276, local460.aBoolean617, local460.aBoolean616, local455.anInt7714);
				this.aClass177Array1[local448] = new Class177(local522);
			}
		}
		local448 = this.anInt9228 * 3;
		this.aByteArray95 = new byte[local448];
		this.aShortArray137 = new short[local448];
		this.aShort114 = (short) arg3;
		this.aShortArray130 = new short[this.anInt9228];
		this.aShortArray138 = new short[local448];
		this.aShortArray132 = new short[this.anInt9228];
		this.aShortArray139 = new short[local448];
		this.aShortArray136 = new short[this.anInt9228];
		this.aShortArray129 = new short[local448];
		this.aByteArray96 = new byte[this.anInt9228];
		this.aShortArray135 = new short[this.anInt9228];
		this.aShortArray133 = new short[local448];
		this.aShortArray134 = new short[this.anInt9228];
		this.aFloatArray69 = new float[local448];
		this.aFloatArray70 = new float[local448];
		if (arg1.aShortArray155 != null) {
			this.aShortArray141 = new short[this.anInt9228];
		}
		Static353.aLongArray13 = new long[local448];
		this.aShort115 = (short) arg4;
		this.aShortArray131 = new short[local448];
		local157 = 0;
		for (local333 = 0; local333 < arg1.anInt10276; local333++) {
			local462 = this.anIntArray640[local333];
			this.anIntArray640[local333] = local157;
			local424[local333] = new Class212();
			local157 += local462;
		}
		this.anIntArray640[arg1.anInt10276] = local157;
		@Pc(708) Class240 local708 = Static209.method3629(local22, this.anInt9228, arg1);
		@Pc(712) Class353[] local712 = new Class353[arg1.anInt10272];
		@Pc(752) int local752;
		@Pc(763) int local763;
		@Pc(774) int local774;
		@Pc(731) short local731;
		@Pc(742) int local742;
		for (local505 = 0; local505 < arg1.anInt10272; local505++) {
			@Pc(721) short local721 = arg1.aShortArray158[local505];
			@Pc(726) short local726 = arg1.aShortArray152[local505];
			local731 = arg1.aShortArray161[local505];
			local742 = this.anIntArray645[local726] - this.anIntArray645[local721];
			local752 = this.anIntArray642[local726] - this.anIntArray642[local721];
			local763 = this.anIntArray641[local726] - this.anIntArray641[local721];
			local774 = this.anIntArray645[local731] - this.anIntArray645[local721];
			@Pc(785) int local785 = this.anIntArray642[local731] - this.anIntArray642[local721];
			@Pc(796) int local796 = this.anIntArray641[local731] - this.anIntArray641[local721];
			@Pc(804) int local804 = local752 * local796 - local763 * local785;
			@Pc(813) int local813 = local763 * local774 - local742 * local796;
			@Pc(822) int local822 = local785 * local742 - local752 * local774;
			while (local804 > 8192 || local813 > 8192 || local822 > 8192 || local804 < -8192 || local813 < -8192 || local822 < -8192) {
				local804 >>= 0x1;
				local822 >>= 0x1;
				local813 >>= 0x1;
			}
			@Pc(873) int local873 = (int) Math.sqrt((double) (local822 * local822 + local813 * local813 + local804 * local804));
			if (local873 <= 0) {
				local873 = 1;
			}
			local804 = local804 * 256 / local873;
			local822 = local822 * 256 / local873;
			local813 = local813 * 256 / local873;
			@Pc(908) byte local908 = arg1.aByteArray103 == null ? 0 : arg1.aByteArray103[local505];
			if (local908 == 0) {
				@Pc(941) Class212 local941 = local424[local721];
				local941.anInt6234 += local813;
				local941.anInt6237 += local804;
				local941.anInt6236 += local822;
				local941.anInt6233++;
				@Pc(969) Class212 local969 = local424[local726];
				local969.anInt6236 += local822;
				local969.anInt6233++;
				local969.anInt6234 += local813;
				local969.anInt6237 += local804;
				@Pc(997) Class212 local997 = local424[local731];
				local997.anInt6236 += local822;
				local997.anInt6237 += local804;
				local997.anInt6234 += local813;
				local997.anInt6233++;
			} else if (local908 == 1) {
				@Pc(926) Class353 local926 = local712[local505] = new Class353();
				local926.anInt9767 = local813;
				local926.anInt9765 = local804;
				local926.anInt9768 = local822;
			}
		}
		@Pc(1038) int local1038;
		@Pc(1081) short local1081;
		for (local170 = 0; local170 < this.anInt9228; local170++) {
			local1038 = local22[local170];
			@Pc(1045) int local1045 = arg1.aShortArray154[local1038] & 0xFFFF;
			if (arg1.aByteArray106 == null) {
				local742 = -1;
			} else {
				local742 = arg1.aByteArray106[local1038];
			}
			if (arg1.aByteArray104 == null) {
				local752 = 0;
			} else {
				local752 = arg1.aByteArray104[local1038] & 0xFF;
			}
			local1081 = arg1.aShortArray153 == null ? -1 : arg1.aShortArray153[local1038];
			if (local1081 != -1 && (this.anInt9186 & 0x40) != 0) {
				@Pc(1096) Class199 local1096 = local11.method6357(local1081 & 0xFFFF);
				if (local1096.aBoolean427) {
					local1081 = -1;
				}
			}
			@Pc(1103) float local1103 = 0.0F;
			@Pc(1105) float local1105 = 0.0F;
			@Pc(1107) float local1107 = 0.0F;
			@Pc(1109) float local1109 = 0.0F;
			@Pc(1111) float local1111 = 0.0F;
			@Pc(1113) float local1113 = 0.0F;
			@Pc(1115) byte local1115 = 0;
			@Pc(1117) byte local1117 = 0;
			@Pc(1119) int local1119 = 0;
			@Pc(1153) byte local1153;
			@Pc(1173) short local1173;
			@Pc(1968) short local1968;
			@Pc(1973) short local1973;
			if (local1081 != -1) {
				if (local742 == -1) {
					local1111 = 0.0F;
					local1107 = 1.0F;
					local1117 = 2;
					local1109 = 1.0F;
					local1105 = 1.0F;
					local1115 = 1;
					local1103 = 0.0F;
					local1113 = 0.0F;
				} else {
					local742 &= 0xFF;
					local1153 = arg1.aByteArray107[local742];
					@Pc(1163) short local1163;
					@Pc(1168) short local1168;
					@Pc(1206) float local1206;
					@Pc(1217) float local1217;
					@Pc(1311) float local1311;
					@Pc(1550) float local1550;
					@Pc(1558) float local1558;
					@Pc(1566) float local1566;
					@Pc(1589) float local1589;
					@Pc(1612) float local1612;
					@Pc(1635) float local1635;
					if (local1153 == 0) {
						local1163 = arg1.aShortArray158[local1038];
						local1168 = arg1.aShortArray152[local1038];
						local1173 = arg1.aShortArray161[local1038];
						local1968 = arg1.aShortArray160[local742];
						local1973 = arg1.aShortArray157[local742];
						@Pc(1978) short local1978 = arg1.aShortArray156[local742];
						@Pc(1984) float local1984 = (float) arg1.anIntArray743[local1968];
						@Pc(1990) float local1990 = (float) arg1.anIntArray752[local1968];
						local1206 = arg1.anIntArray751[local1968];
						local1217 = (float) arg1.anIntArray743[local1973] - local1984;
						local1311 = (float) arg1.anIntArray752[local1973] - local1990;
						@Pc(2023) float local2023 = (float) arg1.anIntArray751[local1973] - local1206;
						@Pc(2031) float local2031 = (float) arg1.anIntArray743[local1978] - local1984;
						@Pc(2040) float local2040 = (float) arg1.anIntArray752[local1978] - local1990;
						@Pc(2049) float local2049 = (float) arg1.anIntArray751[local1978] - local1206;
						@Pc(2058) float local2058 = (float) arg1.anIntArray743[local1163] - local1984;
						@Pc(2066) float local2066 = (float) arg1.anIntArray752[local1163] - local1990;
						@Pc(2074) float local2074 = (float) arg1.anIntArray751[local1163] - local1206;
						@Pc(2082) float local2082 = (float) arg1.anIntArray743[local1168] - local1984;
						@Pc(2090) float local2090 = (float) arg1.anIntArray752[local1168] - local1990;
						local1550 = (float) arg1.anIntArray751[local1168] - local1206;
						local1558 = (float) arg1.anIntArray743[local1173] - local1984;
						local1566 = (float) arg1.anIntArray752[local1173] - local1990;
						local1589 = (float) arg1.anIntArray751[local1173] - local1206;
						local1612 = local1311 * local2049 - local2040 * local2023;
						local1635 = local2031 * local2023 - local1217 * local2049;
						@Pc(2152) float local2152 = local2040 * local1217 - local1311 * local2031;
						@Pc(2160) float local2160 = local2152 * local2040 - local1635 * local2049;
						@Pc(2169) float local2169 = local1612 * local2049 - local2152 * local2031;
						@Pc(2177) float local2177 = local2031 * local1635 - local2040 * local1612;
						@Pc(2191) float local2191 = 1.0F / (local2169 * local1311 + local2160 * local1217 + local2177 * local2023);
						local1111 = local2191 * (local1589 * local2177 + local1566 * local2169 + local2160 * local1558);
						local1107 = local2191 * (local2169 * local2090 + local2082 * local2160 + local1550 * local2177);
						local1103 = local2191 * (local2074 * local2177 + local2058 * local2160 + local2066 * local2169);
						@Pc(2241) float local2241 = local1311 * local2152 - local2023 * local1635;
						@Pc(2249) float local2249 = local1635 * local1217 - local1311 * local1612;
						@Pc(2257) float local2257 = local2023 * local1612 - local2152 * local1217;
						@Pc(2271) float local2271 = 1.0F / (local2031 * local2241 + local2040 * local2257 + local2049 * local2249);
						local1109 = local2271 * (local2249 * local1550 + local2090 * local2257 + local2241 * local2082);
						local1113 = local2271 * (local1589 * local2249 + local1558 * local2241 + local1566 * local2257);
						local1105 = (local2257 * local2066 + local2058 * local2241 + local2074 * local2249) * local2271;
					} else {
						local1163 = arg1.aShortArray158[local1038];
						local1168 = arg1.aShortArray152[local1038];
						local1173 = arg1.aShortArray161[local1038];
						@Pc(1178) int local1178 = local708.anIntArray490[local742];
						@Pc(1183) int local1183 = local708.anIntArray489[local742];
						@Pc(1188) int local1188 = local708.anIntArray491[local742];
						@Pc(1193) float[] local1193 = local708.aFloatArrayArray10[local742];
						@Pc(1198) byte local1198 = arg1.aByteArray102[local742];
						local1206 = (float) arg1.anIntArray748[local742] / 256.0F;
						if (local1153 == 1) {
							local1217 = (float) arg1.anIntArray745[local742] / 1024.0F;
							Static581.method8032(local1198, local1188, local1193, local1183, Static571.aFloatArray73, local1217, arg1.anIntArray751[local1163], local1206, arg1.anIntArray752[local1163], arg1.anIntArray743[local1163], local1178);
							local1105 = Static571.aFloatArray73[1];
							local1103 = Static571.aFloatArray73[0];
							Static581.method8032(local1198, local1188, local1193, local1183, Static571.aFloatArray73, local1217, arg1.anIntArray751[local1168], local1206, arg1.anIntArray752[local1168], arg1.anIntArray743[local1168], local1178);
							local1109 = Static571.aFloatArray73[1];
							local1107 = Static571.aFloatArray73[0];
							Static581.method8032(local1198, local1188, local1193, local1183, Static571.aFloatArray73, local1217, arg1.anIntArray751[local1173], local1206, arg1.anIntArray752[local1173], arg1.anIntArray743[local1173], local1178);
							local1113 = Static571.aFloatArray73[1];
							local1111 = Static571.aFloatArray73[0];
							local1311 = local1217 / 2.0F;
							if ((local1198 & 0x1) == 0) {
								if (local1107 - local1103 > local1311) {
									local1115 = 1;
									local1107 -= local1217;
								} else if (local1311 < local1103 - local1107) {
									local1115 = 2;
									local1107 += local1217;
								}
								if (local1111 - local1103 > local1311) {
									local1117 = 1;
									local1111 -= local1217;
								} else if (local1103 - local1111 > local1311) {
									local1117 = 2;
									local1111 += local1217;
								}
							} else {
								if (local1109 - local1105 > local1311) {
									local1109 -= local1217;
									local1115 = 1;
								} else if (local1105 - local1109 > local1311) {
									local1109 += local1217;
									local1115 = 2;
								}
								if (local1311 < local1113 - local1105) {
									local1113 -= local1217;
									local1117 = 1;
								} else if (local1105 - local1113 > local1311) {
									local1113 += local1217;
									local1117 = 2;
								}
							}
						} else if (local1153 == 2) {
							local1217 = (float) arg1.anIntArray744[local742] / 256.0F;
							local1311 = (float) arg1.anIntArray746[local742] / 256.0F;
							@Pc(1461) int local1461 = arg1.anIntArray743[local1168] - arg1.anIntArray743[local1163];
							@Pc(1472) int local1472 = arg1.anIntArray752[local1168] - arg1.anIntArray752[local1163];
							@Pc(1483) int local1483 = arg1.anIntArray751[local1168] - arg1.anIntArray751[local1163];
							@Pc(1494) int local1494 = arg1.anIntArray743[local1173] - arg1.anIntArray743[local1163];
							@Pc(1505) int local1505 = arg1.anIntArray752[local1173] - arg1.anIntArray752[local1163];
							@Pc(1516) int local1516 = arg1.anIntArray751[local1173] - arg1.anIntArray751[local1163];
							@Pc(1525) int local1525 = local1472 * local1516 - local1505 * local1483;
							@Pc(1533) int local1533 = local1483 * local1494 - local1461 * local1516;
							@Pc(1542) int local1542 = local1505 * local1461 - local1472 * local1494;
							local1550 = 64.0F / (float) arg1.anIntArray747[local742];
							local1558 = 64.0F / (float) arg1.anIntArray749[local742];
							local1566 = 64.0F / (float) arg1.anIntArray745[local742];
							local1589 = (local1193[2] * (float) local1542 + (float) local1525 * local1193[0] + (float) local1533 * local1193[1]) / local1550;
							local1612 = (local1193[5] * (float) local1542 + local1193[4] * (float) local1533 + local1193[3] * (float) local1525) / local1558;
							local1635 = ((float) local1533 * local1193[7] + local1193[6] * (float) local1525 + local1193[8] * (float) local1542) / local1566;
							local1119 = Static324.method4894(local1612, local1589, local1635);
							Static384.method5782(local1188, local1198, local1193, arg1.anIntArray743[local1163], local1217, local1178, local1311, Static571.aFloatArray73, arg1.anIntArray752[local1163], arg1.anIntArray751[local1163], local1206, local1183, local1119);
							local1105 = Static571.aFloatArray73[1];
							local1103 = Static571.aFloatArray73[0];
							Static384.method5782(local1188, local1198, local1193, arg1.anIntArray743[local1168], local1217, local1178, local1311, Static571.aFloatArray73, arg1.anIntArray752[local1168], arg1.anIntArray751[local1168], local1206, local1183, local1119);
							local1109 = Static571.aFloatArray73[1];
							local1107 = Static571.aFloatArray73[0];
							Static384.method5782(local1188, local1198, local1193, arg1.anIntArray743[local1173], local1217, local1178, local1311, Static571.aFloatArray73, arg1.anIntArray752[local1173], arg1.anIntArray751[local1173], local1206, local1183, local1119);
							local1113 = Static571.aFloatArray73[1];
							local1111 = Static571.aFloatArray73[0];
						} else if (local1153 == 3) {
							Static286.method6704(arg1.anIntArray752[local1163], local1188, arg1.anIntArray743[local1163], Static571.aFloatArray73, local1193, local1198, arg1.anIntArray751[local1163], local1178, local1206, local1183);
							local1105 = Static571.aFloatArray73[1];
							local1103 = Static571.aFloatArray73[0];
							Static286.method6704(arg1.anIntArray752[local1168], local1188, arg1.anIntArray743[local1168], Static571.aFloatArray73, local1193, local1198, arg1.anIntArray751[local1168], local1178, local1206, local1183);
							local1109 = Static571.aFloatArray73[1];
							local1107 = Static571.aFloatArray73[0];
							Static286.method6704(arg1.anIntArray752[local1173], local1188, arg1.anIntArray743[local1173], Static571.aFloatArray73, local1193, local1198, arg1.anIntArray751[local1173], local1178, local1206, local1183);
							local1113 = Static571.aFloatArray73[1];
							local1111 = Static571.aFloatArray73[0];
							if ((local1198 & 0x1) == 0) {
								if (local1111 - local1103 > 0.5F) {
									local1117 = 1;
									local1111--;
								} else if (local1103 - local1111 > 0.5F) {
									local1111++;
									local1117 = 2;
								}
								if (local1107 - local1103 > 0.5F) {
									local1115 = 1;
									local1107--;
								} else if (local1103 - local1107 > 0.5F) {
									local1107++;
									local1115 = 2;
								}
							} else {
								if (local1109 - local1105 > 0.5F) {
									local1109--;
									local1115 = 1;
								} else if (local1105 - local1109 > 0.5F) {
									local1115 = 2;
									local1109++;
								}
								if (local1113 - local1105 > 0.5F) {
									local1117 = 1;
									local1113--;
								} else if (local1105 - local1113 > 0.5F) {
									local1117 = 2;
									local1113++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray103 == null) {
				local1153 = 0;
			} else {
				local1153 = arg1.aByteArray103[local1038];
			}
			if (local1153 == 0) {
				@Pc(2350) long local2350 = (long) (local742 << 2) + ((long) (local1045 << 8) + (long) (local1119 << 24) + (long) local752 << 32);
				local1173 = arg1.aShortArray158[local1038];
				local1968 = arg1.aShortArray152[local1038];
				local1973 = arg1.aShortArray161[local1038];
				@Pc(2369) Class212 local2369 = local424[local1173];
				this.aShortArray134[local170] = this.method7752(local2369.anInt6237, local2369.anInt6233, local2369.anInt6234, local1105, local170, local2369.anInt6236, local1103, local1173, local2350, arg1);
				@Pc(2394) Class212 local2394 = local424[local1968];
				this.aShortArray136[local170] = this.method7752(local2394.anInt6237, local2394.anInt6233, local2394.anInt6234, local1109, local170, local2394.anInt6236, local1107, local1968, (long) local1115 + local2350, arg1);
				@Pc(2422) Class212 local2422 = local424[local1973];
				this.aShortArray130[local170] = this.method7752(local2422.anInt6237, local2422.anInt6233, local2422.anInt6234, local1113, local170, local2422.anInt6236, local1111, local1973, (long) local1117 + local2350, arg1);
			} else if (local1153 == 1) {
				@Pc(2457) Class353 local2457 = local712[local1038];
				@Pc(2500) long local2500 = (long) ((local2457.anInt9768 + 256 << 22) + (local742 << 2) + (local2457.anInt9765 > 0 ? 1024 : 2048) + (local2457.anInt9767 + 256 << 12)) + ((long) (local1119 << 24) + (long) (local1045 << 8) + (long) local752 << 32);
				this.aShortArray134[local170] = this.method7752(local2457.anInt9765, 0, local2457.anInt9767, local1105, local170, local2457.anInt9768, local1103, arg1.aShortArray158[local1038], local2500, arg1);
				this.aShortArray136[local170] = this.method7752(local2457.anInt9765, 0, local2457.anInt9767, local1109, local170, local2457.anInt9768, local1107, arg1.aShortArray152[local1038], (long) local1115 + local2500, arg1);
				this.aShortArray130[local170] = this.method7752(local2457.anInt9765, 0, local2457.anInt9767, local1113, local170, local2457.anInt9768, local1111, arg1.aShortArray161[local1038], local2500 + (long) local1117, arg1);
			}
			if (arg1.aByteArray104 != null) {
				this.aByteArray96[local170] = arg1.aByteArray104[local1038];
			}
			if (arg1.aShortArray155 != null) {
				this.aShortArray141[local170] = arg1.aShortArray155[local1038];
			}
			this.aShortArray135[local170] = arg1.aShortArray154[local1038];
			this.aShortArray132[local170] = local1081;
		}
		if (this.anInt9252 > 0) {
			local1038 = 1;
			local731 = this.aShortArray132[0];
			for (local742 = 0; local742 < this.anInt9252; local742++) {
				@Pc(2641) short local2641 = this.aShortArray132[local742];
				if (local2641 != local731) {
					local731 = local2641;
					local1038++;
				}
			}
			this.anIntArray646 = new int[local1038 + 1];
			this.anIntArray643 = new int[local1038];
			this.anIntArray644 = new int[local1038];
			this.anIntArray646[0] = 0;
			local752 = this.anInt9193;
			local1081 = 0;
			local731 = this.aShortArray132[0];
			local1038 = 0;
			for (local774 = 0; local774 < this.anInt9252; local774++) {
				@Pc(2692) short local2692 = this.aShortArray132[local774];
				if (local2692 != local731) {
					this.anIntArray643[local1038] = local752;
					this.anIntArray644[local1038] = local1081 + 1 - local752;
					local1038++;
					this.anIntArray646[local1038] = local774;
					local731 = local2692;
					local1081 = 0;
					local752 = this.anInt9193;
				}
				@Pc(2728) short local2728 = this.aShortArray134[local774];
				if (local752 > local2728) {
					local752 = local2728;
				}
				if (local2728 > local1081) {
					local1081 = local2728;
				}
				local2728 = this.aShortArray136[local774];
				if (local752 > local2728) {
					local752 = local2728;
				}
				if (local2728 > local1081) {
					local1081 = local2728;
				}
				local2728 = this.aShortArray130[local774];
				if (local1081 < local2728) {
					local1081 = local2728;
				}
				if (local752 > local2728) {
					local752 = local2728;
				}
			}
			this.anIntArray643[local1038] = local752;
			this.anIntArray644[local1038] = local1081 + 1 - local752;
			local1038++;
			this.anIntArray646[local1038] = this.anInt9252;
		}
		Static353.aLongArray13 = null;
		this.aShortArray139 = Static467.method6736(this.anInt9193, this.aShortArray139);
		this.aShortArray137 = Static467.method6736(this.anInt9193, this.aShortArray137);
		this.aShortArray129 = Static467.method6736(this.anInt9193, this.aShortArray129);
		this.aShortArray131 = Static467.method6736(this.anInt9193, this.aShortArray131);
		this.aShortArray133 = Static467.method6736(this.anInt9193, this.aShortArray133);
		this.aByteArray95 = Static457.method6673(this.anInt9193, this.aByteArray95);
		this.aFloatArray70 = Static445.method6603(this.anInt9193, this.aFloatArray70);
		this.aFloatArray69 = Static445.method6603(this.anInt9193, this.aFloatArray69);
		if (arg1.anIntArray753 != null && Static172.method3185(arg2, this.anInt9186)) {
			this.anIntArrayArray85 = arg1.method8583(false);
		}
		if (arg1.aClass259Array1 != null && Static599.method8219(arg2, this.anInt9186)) {
			this.anIntArrayArray87 = arg1.method8598();
		}
		if (arg1.anIntArray754 != null && Static603.method8363(arg2, this.anInt9186)) {
			local1038 = 0;
			@Pc(2919) int[] local2919 = new int[256];
			for (local742 = 0; local742 < this.anInt9228; local742++) {
				local752 = arg1.anIntArray754[local22[local742]];
				if (local752 >= 0) {
					@Pc(2939) int local2939 = local2919[local752]++;
					if (local1038 < local752) {
						local1038 = local752;
					}
				}
			}
			this.anIntArrayArray86 = new int[local1038 + 1][];
			for (local752 = 0; local752 <= local1038; local752++) {
				this.anIntArrayArray86[local752] = new int[local2919[local752]];
				local2919[local752] = 0;
			}
			for (local763 = 0; local763 < this.anInt9228; local763++) {
				local774 = arg1.anIntArray754[local22[local763]];
				if (local774 >= 0) {
					this.anIntArrayArray86[local774][local2919[local774]++] = local763;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!gt;IIZZ)V")
	public Class25_Sub3(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9189 = 0;
		this.anInt9193 = 0;
		this.aBoolean676 = false;
		this.anInt9228 = 0;
		this.aBoolean675 = false;
		this.aBoolean679 = false;
		this.aBoolean677 = true;
		this.anInt9252 = 0;
		this.anInt9255 = 0;
		this.aBoolean678 = false;
		this.anInt9186 = arg2;
		this.aClass87_Sub1_21 = arg0;
		this.aBoolean675 = arg4;
		this.anInt9230 = arg1;
		if (arg3 || Static504.method7816(this.anInt9186, this.anInt9230)) {
			this.aClass293_4 = new Class293(Static439.method6540(this.anInt9186, this.anInt9230));
		}
		if (arg3 || Static404.method784(this.anInt9186, this.anInt9230)) {
			this.aClass293_2 = new Class293(Static461.method6714(this.anInt9230, this.anInt9186));
		}
		if (arg3 || Static611.method8353(this.anInt9230, this.anInt9186)) {
			this.aClass293_3 = new Class293(Static336.method5206(this.anInt9230, this.anInt9186));
		}
		if (arg3 || Static115.method1859(this.anInt9230, this.anInt9186)) {
			this.aClass293_1 = new Class293(Static633.method8493(this.anInt9186, this.anInt9230));
		}
		if (arg3 || Static384.method5787(this.anInt9186, this.anInt9230)) {
			this.aClass12_1 = new Class12(Static471.method6779(this.anInt9230, this.anInt9186));
		}
	}

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "()V")
	@Override
	protected void method7729() {
	}

	@OriginalMember(owner = "client!tv", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean678) {
			this.method7744();
		}
		return this.anInt9212;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)Z")
	private boolean method7736() {
		if (this.aClass12_1.aBoolean23) {
			return true;
		}
		if (this.aClass12_1.anInterface10_1 == null) {
			this.aClass12_1.anInterface10_1 = this.aClass87_Sub1_21.method5087(this.aBoolean675);
		}
		@Pc(28) Interface10 local28 = this.aClass12_1.anInterface10_1;
		local28.method7675(this.anInt9252 * 6);
		@Pc(46) Buffer local46 = local28.method7682();
		if (local46 != null) {
			@Pc(54) Stream local54 = this.aClass87_Sub1_21.method5128(local46);
			@Pc(58) int local58;
			if (Stream.b()) {
				for (local58 = 0; local58 < this.anInt9252; local58++) {
					local54.c(this.aShortArray134[local58]);
					local54.c(this.aShortArray136[local58]);
					local54.c(this.aShortArray130[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt9252; local58++) {
					local54.d(this.aShortArray134[local58]);
					local54.d(this.aShortArray136[local58]);
					local54.d(this.aShortArray130[local58]);
				}
			}
			local54.a();
			if (local28.method7683()) {
				this.aClass12_1.anInterface10_2 = local28;
				this.aBoolean677 = true;
				this.aClass12_1.aBoolean23 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			local27 = 0;
			Static524.anInt8750 = 0;
			Static560.anInt9272 = 0;
			Static35.anInt899 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray85.length) {
					local51 = this.anIntArrayArray85[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray140 == null || (this.aShortArray140[local59] & arg6) != 0) {
							Static524.anInt8750 += this.anIntArray645[local59];
							Static560.anInt9272 += this.anIntArray642[local59];
							local27++;
							Static35.anInt899 += this.anIntArray641[local59];
						}
					}
				}
			}
			if (local27 <= 0) {
				Static560.anInt9272 = arg3;
				Static35.anInt899 = arg4;
				Static524.anInt8750 = arg2;
			} else {
				Static298.aBoolean421 = true;
				Static560.anInt9272 = Static560.anInt9272 / local27 + arg3;
				Static524.anInt8750 = Static524.anInt8750 / local27 + arg2;
				Static35.anInt899 = arg4 + Static35.anInt899 / local27;
			}
			return;
		}
		@Pc(245) int[] local245;
		@Pc(247) int local247;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg4 * arg7[2] + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg7[3] * arg2 + arg4 * arg7[5] + 8192 >> 14;
				local41 = arg2 * arg7[6] + arg3 * arg7[7] + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local27;
				arg3 = local35;
				arg4 = local41;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray85.length > local35) {
					local245 = this.anIntArrayArray85[local35];
					for (local247 = 0; local247 < local245.length; local247++) {
						local53 = local245[local247];
						if (this.aShortArray140 == null || (this.aShortArray140[local53] & arg6) != 0) {
							this.anIntArray645[local53] += arg2;
							this.anIntArray642[local53] += arg3;
							this.anIntArray641[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(393) int local393;
		@Pc(412) int local412;
		@Pc(642) int local642;
		@Pc(651) int local651;
		@Pc(663) int local663;
		@Pc(667) int local667;
		@Pc(685) int local685;
		@Pc(1012) int local1012;
		@Pc(1020) int local1020;
		@Pc(1175) int local1175;
		@Pc(1201) int local1201;
		@Pc(1205) int local1205;
		@Pc(1213) int local1213;
		@Pc(1218) int local1218;
		@Pc(1222) int local1222;
		@Pc(1226) int local1226;
		@Pc(1228) int local1228;
		@Pc(1357) int[] local1357;
		@Pc(1359) int local1359;
		@Pc(1363) int local1363;
		@Pc(1367) int local1367;
		@Pc(1369) int local1369;
		@Pc(1498) int local1498;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray85.length > local35) {
						local245 = this.anIntArrayArray85[local35];
						for (local247 = 0; local247 < local245.length; local247++) {
							local53 = local245[local247];
							if (this.aShortArray140 == null || (this.aShortArray140[local53] & arg6) != 0) {
								this.anIntArray645[local53] -= Static524.anInt8750;
								this.anIntArray642[local53] -= Static560.anInt9272;
								this.anIntArray641[local53] -= Static35.anInt899;
								if (arg4 != 0) {
									local59 = Class353.anIntArray681[arg4];
									local393 = Class353.anIntArray682[arg4];
									local412 = local59 * this.anIntArray642[local53] + this.anIntArray645[local53] * local393 + 16383 >> 14;
									this.anIntArray642[local53] = local393 * this.anIntArray642[local53] + 16383 - this.anIntArray645[local53] * local59 >> 14;
									this.anIntArray645[local53] = local412;
								}
								if (arg2 != 0) {
									local59 = Class353.anIntArray681[arg2];
									local393 = Class353.anIntArray682[arg2];
									local412 = this.anIntArray642[local53] * local393 + 16383 - this.anIntArray641[local53] * local59 >> 14;
									this.anIntArray641[local53] = this.anIntArray642[local53] * local59 + this.anIntArray641[local53] * local393 + 16383 >> 14;
									this.anIntArray642[local53] = local412;
								}
								if (arg3 != 0) {
									local59 = Class353.anIntArray681[arg3];
									local393 = Class353.anIntArray682[arg3];
									local412 = local59 * this.anIntArray641[local53] + local393 * this.anIntArray645[local53] + 16383 >> 14;
									this.anIntArray641[local53] = local393 * this.anIntArray641[local53] + 16383 - local59 * this.anIntArray645[local53] >> 14;
									this.anIntArray645[local53] = local412;
								}
								this.anIntArray645[local53] += Static524.anInt8750;
								this.anIntArray642[local53] += Static560.anInt9272;
								this.anIntArray641[local53] += Static35.anInt899;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray85.length) {
							local51 = this.anIntArrayArray85[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray140 == null || (arg6 & this.aShortArray140[local59]) != 0) {
									local393 = this.anIntArray640[local59];
									local412 = this.anIntArray640[local59 + 1];
									for (local642 = local393; local642 < local412; local642++) {
										local651 = this.aShortArray138[local642] - 1;
										if (local651 == -1) {
											break;
										}
										if (arg4 != 0) {
											local663 = Class353.anIntArray681[arg4];
											local667 = Class353.anIntArray682[arg4];
											local685 = this.aShortArray131[local651] * local663 + local667 * this.aShortArray129[local651] + 16383 >> 14;
											this.aShortArray131[local651] = (short) (local667 * this.aShortArray131[local651] + 16383 - this.aShortArray129[local651] * local663 >> 14);
											this.aShortArray129[local651] = (short) local685;
										}
										if (arg2 != 0) {
											local663 = Class353.anIntArray681[arg2];
											local667 = Class353.anIntArray682[arg2];
											local685 = local667 * this.aShortArray131[local651] + 16383 - local663 * this.aShortArray133[local651] >> 14;
											this.aShortArray133[local651] = (short) (local667 * this.aShortArray133[local651] + local663 * this.aShortArray131[local651] + 16383 >> 14);
											this.aShortArray131[local651] = (short) local685;
										}
										if (arg3 != 0) {
											local663 = Class353.anIntArray681[arg3];
											local667 = Class353.anIntArray682[arg3];
											local685 = local667 * this.aShortArray129[local651] + local663 * this.aShortArray133[local651] + 16383 >> 14;
											this.aShortArray133[local651] = (short) (local667 * this.aShortArray133[local651] + 16383 - local663 * this.aShortArray129[local651] >> 14);
											this.aShortArray129[local651] = (short) local685;
										}
									}
								}
							}
						}
					}
					this.method7745();
					return;
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local247 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static298.aBoolean421) {
					local393 = arg7[0] * Static524.anInt8750 + arg7[3] * Static560.anInt9272 + Static35.anInt899 * arg7[6] + 8192 >> 14;
					local412 = Static560.anInt9272 * arg7[4] + Static524.anInt8750 * arg7[1] + Static35.anInt899 * arg7[7] + 8192 >> 14;
					local642 = arg7[8] * Static35.anInt899 + Static524.anInt8750 * arg7[2] + arg7[5] * Static560.anInt9272 + 8192 >> 14;
					local393 += local247;
					local412 += local53;
					local642 += local59;
					Static560.anInt9272 = local412;
					Static524.anInt8750 = local393;
					Static35.anInt899 = local642;
					Static298.aBoolean421 = false;
				}
				@Pc(980) int[] local980 = new int[9];
				local412 = Class353.anIntArray682[arg2];
				local642 = Class353.anIntArray681[arg2];
				local651 = Class353.anIntArray682[arg3];
				local663 = Class353.anIntArray681[arg3];
				local667 = Class353.anIntArray682[arg4];
				local685 = Class353.anIntArray681[arg4];
				local1012 = local667 * local642 + 8192 >> 14;
				local1020 = local685 * local642 + 8192 >> 14;
				local980[2] = local663 * local412 + 8192 >> 14;
				local980[0] = local651 * local667 + local1020 * local663 + 8192 >> 14;
				local980[6] = -local663 * local667 + local651 * local1020 + 8192 >> 14;
				local980[3] = local685 * local412 + 8192 >> 14;
				local980[7] = local1012 * local651 + local685 * local663 + 8192 >> 14;
				local980[5] = -local642;
				local980[4] = local667 * local412 + 8192 >> 14;
				local980[1] = local663 * local1012 + local685 * -local651 + 8192 >> 14;
				local980[8] = local651 * local412 + 8192 >> 14;
				@Pc(1149) int local1149 = local980[2] * -Static35.anInt899 + -Static560.anInt9272 * local980[1] + local980[0] * -Static524.anInt8750 + 8192 >> 14;
				local1175 = -Static35.anInt899 * local980[5] + -Static524.anInt8750 * local980[3] + -Static560.anInt9272 * local980[4] + 8192 >> 14;
				local1201 = -Static560.anInt9272 * local980[7] + local980[6] * -Static524.anInt8750 + local980[8] * -Static35.anInt899 + 8192 >> 14;
				local1205 = local1149 + Static524.anInt8750;
				@Pc(1209) int local1209 = Static560.anInt9272 + local1175;
				local1213 = Static35.anInt899 + local1201;
				@Pc(1216) int[] local1216 = new int[9];
				for (local1218 = 0; local1218 < 3; local1218++) {
					for (local1222 = 0; local1222 < 3; local1222++) {
						local1226 = 0;
						for (local1228 = 0; local1228 < 3; local1228++) {
							local1226 += arg7[local1222 * 3 + local1228] * local980[local1218 * 3 + local1228];
						}
						local1216[local1222 + local1218 * 3] = local1226 + 8192 >> 14;
					}
				}
				local1222 = local980[2] * local59 + local53 * local980[1] + local247 * local980[0] + 8192 >> 14;
				local1226 = local247 * local980[3] + local53 * local980[4] + local980[5] * local59 + 8192 >> 14;
				local1228 = local980[8] * local59 + local980[7] * local53 + local980[6] * local247 + 8192 >> 14;
				local1226 += local1209;
				local1222 += local1205;
				local1228 += local1213;
				local1357 = new int[9];
				for (local1359 = 0; local1359 < 3; local1359++) {
					for (local1363 = 0; local1363 < 3; local1363++) {
						local1367 = 0;
						for (local1369 = 0; local1369 < 3; local1369++) {
							local1367 += arg7[local1369 + local1359 * 3] * local1216[local1369 * 3 + local1363];
						}
						local1357[local1359 * 3 + local1363] = local1367 + 8192 >> 14;
					}
				}
				local1363 = arg7[2] * local1228 + local1222 * arg7[0] + arg7[1] * local1226 + 8192 >> 14;
				local1367 = arg7[5] * local1228 + arg7[4] * local1226 + arg7[3] * local1222 + 8192 >> 14;
				local1363 += local27;
				local1367 += local35;
				local1369 = local1228 * arg7[8] + local1222 * arg7[6] + local1226 * arg7[7] + 8192 >> 14;
				local1369 += local41;
				for (local1498 = 0; local1498 < local8; local1498++) {
					@Pc(1504) int local1504 = arg1[local1498];
					if (local1504 < this.anIntArrayArray85.length) {
						@Pc(1518) int[] local1518 = this.anIntArrayArray85[local1504];
						for (@Pc(1520) int local1520 = 0; local1520 < local1518.length; local1520++) {
							@Pc(1526) int local1526 = local1518[local1520];
							if (this.aShortArray140 == null || (this.aShortArray140[local1526] & arg6) != 0) {
								@Pc(1570) int local1570 = local1357[2] * this.anIntArray641[local1526] + this.anIntArray642[local1526] * local1357[1] + this.anIntArray645[local1526] * local1357[0] + 8192 >> 14;
								@Pc(1601) int local1601 = local1357[4] * this.anIntArray642[local1526] + this.anIntArray645[local1526] * local1357[3] + this.anIntArray641[local1526] * local1357[5] + 8192 >> 14;
								@Pc(1632) int local1632 = local1357[8] * this.anIntArray641[local1526] + local1357[7] * this.anIntArray642[local1526] + this.anIntArray645[local1526] * local1357[6] + 8192 >> 14;
								@Pc(1636) int local1636 = local1570 + local1363;
								@Pc(1640) int local1640 = local1601 + local1367;
								@Pc(1644) int local1644 = local1632 + local1369;
								this.anIntArray645[local1526] = local1636;
								this.anIntArray642[local1526] = local1640;
								this.anIntArray641[local1526] = local1644;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2586) Class177 local2586;
			@Pc(2478) boolean local2478;
			@Pc(2581) Class288 local2581;
			if (arg0 == 5) {
				if (this.anIntArrayArray86 != null) {
					local2478 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray86.length) {
							local51 = this.anIntArrayArray86[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray141 == null || (this.aShortArray141[local59] & arg6) != 0) {
									local393 = arg2 * 8 + (this.aByteArray96[local59] & 0xFF);
									if (local393 < 0) {
										local393 = 0;
									} else if (local393 > 255) {
										local393 = 255;
									}
									this.aByteArray96[local59] = (byte) local393;
								}
							}
							local2478 |= local51.length > 0;
						}
					}
					if (local2478) {
						if (this.aClass288Array1 != null) {
							for (local41 = 0; local41 < this.anInt9206; local41++) {
								local2581 = this.aClass288Array1[local41];
								local2586 = this.aClass177Array1[local41];
								local2586.anInt5145 = 255 - (this.aByteArray96[local2581.anInt8261] & 0xFF) << 24 | local2586.anInt5145 & 0xFFFFFF;
							}
						}
						this.method7750();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray86 != null) {
					local2478 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray86.length > local41) {
							local51 = this.anIntArrayArray86[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray141 == null || (arg6 & this.aShortArray141[local59]) != 0) {
									local393 = this.aShortArray135[local59] & 0xFFFF;
									local412 = local393 >> 10 & 0x3F;
									local642 = local393 >> 7 & 0x7;
									local642 += arg3 / 4;
									@Pc(2698) int local2698 = local412 + arg2 & 0x3F;
									local651 = local393 & 0x7F;
									local651 += arg4;
									if (local642 < 0) {
										local642 = 0;
									} else if (local642 > 7) {
										local642 = 7;
									}
									if (local651 < 0) {
										local651 = 0;
									} else if (local651 > 127) {
										local651 = 127;
									}
									this.aShortArray135[local59] = (short) (local651 | local642 << 7 | local2698 << 10);
								}
							}
							local2478 |= local51.length > 0;
						}
					}
					if (local2478) {
						if (this.aClass288Array1 != null) {
							for (local41 = 0; local41 < this.anInt9206; local41++) {
								local2581 = this.aClass288Array1[local41];
								local2586 = this.aClass177Array1[local41];
								local2586.anInt5145 = local2586.anInt5145 & 0xFF000000 | Static349.anIntArray394[this.aShortArray135[local2581.anInt8261] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method7750();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray87 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray87.length > local35) {
							local245 = this.anIntArrayArray87[local35];
							for (local247 = 0; local247 < local245.length; local247++) {
								local2586 = this.aClass177Array1[local245[local247]];
								local2586.anInt5139 += arg3;
								local2586.anInt5138 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray87 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray87.length) {
							local245 = this.anIntArrayArray87[local35];
							for (local247 = 0; local247 < local245.length; local247++) {
								local2586 = this.aClass177Array1[local245[local247]];
								local2586.anInt5142 = local2586.anInt5142 * arg2 >> 7;
								local2586.anInt5144 = arg3 * local2586.anInt5144 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray87 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray87.length > local35) {
						local245 = this.anIntArrayArray87[local35];
						for (local247 = 0; local247 < local245.length; local247++) {
							local2586 = this.aClass177Array1[local245[local247]];
							local2586.anInt5140 = arg2 + local2586.anInt5140 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray85.length > local35) {
					local245 = this.anIntArrayArray85[local35];
					for (local247 = 0; local247 < local245.length; local247++) {
						local53 = local245[local247];
						if (this.aShortArray140 == null || (this.aShortArray140[local53] & arg6) != 0) {
							this.anIntArray645[local53] -= Static524.anInt8750;
							this.anIntArray642[local53] -= Static560.anInt9272;
							this.anIntArray641[local53] -= Static35.anInt899;
							this.anIntArray645[local53] = arg2 * this.anIntArray645[local53] >> 7;
							this.anIntArray642[local53] = this.anIntArray642[local53] * arg3 >> 7;
							this.anIntArray641[local53] = arg4 * this.anIntArray641[local53] >> 7;
							this.anIntArray645[local53] += Static524.anInt8750;
							this.anIntArray642[local53] += Static560.anInt9272;
							this.anIntArray641[local53] += Static35.anInt899;
						}
					}
				}
			}
		} else {
			local27 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local247 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static298.aBoolean421) {
				local393 = arg7[6] * Static35.anInt899 + arg7[3] * Static560.anInt9272 + arg7[0] * Static524.anInt8750 + 8192 >> 14;
				local412 = Static35.anInt899 * arg7[7] + arg7[1] * Static524.anInt8750 + arg7[4] * Static560.anInt9272 + 8192 >> 14;
				local412 += local53;
				local642 = Static560.anInt9272 * arg7[5] + Static524.anInt8750 * arg7[2] + arg7[8] * Static35.anInt899 + 8192 >> 14;
				local393 += local247;
				local642 += local59;
				Static524.anInt8750 = local393;
				Static560.anInt9272 = local412;
				Static298.aBoolean421 = false;
				Static35.anInt899 = local642;
			}
			local393 = arg2 << 15 >> 7;
			local412 = arg3 << 15 >> 7;
			local642 = arg4 << 15 >> 7;
			local651 = local393 * -Static524.anInt8750 + 8192 >> 14;
			local663 = local412 * -Static560.anInt9272 + 8192 >> 14;
			local667 = -Static35.anInt899 * local642 + 8192 >> 14;
			local685 = local651 + Static524.anInt8750;
			local1012 = local663 + Static560.anInt9272;
			local1020 = Static35.anInt899 + local667;
			@Pc(1871) int[] local1871 = new int[] { arg7[0] * local393 + 8192 >> 14, local393 * arg7[3] + 8192 >> 14, arg7[6] * local393 + 8192 >> 14, arg7[1] * local412 + 8192 >> 14, arg7[4] * local412 + 8192 >> 14, arg7[7] * local412 + 8192 >> 14, local642 * arg7[2] + 8192 >> 14, local642 * arg7[5] + 8192 >> 14, local642 * arg7[8] + 8192 >> 14 };
			local1175 = local393 * local247 + 8192 >> 14;
			local1201 = local412 * local53 + 8192 >> 14;
			@Pc(1999) int local1999 = local1201 + local1012;
			@Pc(2003) int local2003 = local1175 + local685;
			local1205 = local642 * local59 + 8192 >> 14;
			@Pc(2015) int local2015 = local1205 + local1020;
			@Pc(2018) int[] local2018 = new int[9];
			@Pc(2024) int local2024;
			for (local1213 = 0; local1213 < 3; local1213++) {
				for (local2024 = 0; local2024 < 3; local2024++) {
					local1218 = 0;
					for (local1222 = 0; local1222 < 3; local1222++) {
						local1218 += arg7[local1213 * 3 + local1222] * local1871[local2024 + local1222 * 3];
					}
					local2018[local2024 + local1213 * 3] = local1218 + 8192 >> 14;
				}
			}
			local2024 = local2015 * arg7[2] + arg7[1] * local1999 + arg7[0] * local2003 + 8192 >> 14;
			local1218 = local2015 * arg7[5] + arg7[3] * local2003 + local1999 * arg7[4] + 8192 >> 14;
			local2024 += local27;
			local1222 = arg7[7] * local1999 + arg7[6] * local2003 + arg7[8] * local2015 + 8192 >> 14;
			local1218 += local35;
			local1222 += local41;
			for (local1226 = 0; local1226 < local8; local1226++) {
				local1228 = arg1[local1226];
				if (local1228 < this.anIntArrayArray85.length) {
					local1357 = this.anIntArrayArray85[local1228];
					for (local1359 = 0; local1359 < local1357.length; local1359++) {
						local1363 = local1357[local1359];
						if (this.aShortArray140 == null || (this.aShortArray140[local1363] & arg6) != 0) {
							local1367 = local2018[0] * this.anIntArray645[local1363] + this.anIntArray642[local1363] * local2018[1] + this.anIntArray641[local1363] * local2018[2] + 8192 >> 14;
							local1369 = this.anIntArray645[local1363] * local2018[3] + this.anIntArray642[local1363] * local2018[4] + local2018[5] * this.anIntArray641[local1363] + 8192 >> 14;
							local1498 = this.anIntArray641[local1363] * local2018[8] + this.anIntArray645[local1363] * local2018[6] + this.anIntArray642[local1363] * local2018[7] + 8192 >> 14;
							@Pc(2294) int local2294 = local1367 + local2024;
							@Pc(2298) int local2298 = local1369 + local1218;
							this.anIntArray645[local1363] = local2294;
							@Pc(2307) int local2307 = local1498 + local1222;
							this.anIntArray642[local1363] = local2298;
							this.anIntArray641[local1363] = local2307;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean679;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
	public void method7737() {
		if (this.aClass293_4 != null) {
			this.aClass293_4.method6973();
		}
		if (this.aClass293_2 != null) {
			this.aClass293_2.method6973();
		}
		if (this.aClass293_3 != null) {
			this.aClass293_3.method6973();
		}
		if (this.aClass293_1 != null) {
			this.aClass293_1.method6973();
		}
		if (this.aClass12_1 != null) {
			this.aClass12_1.method286();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method7723(@OriginalArg(0) Class6 arg0) {
		@Pc(8) Class6_Sub2 local8 = (Class6_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass130Array4 != null) {
			for (local13 = 0; local13 < this.aClass130Array4.length; local13++) {
				@Pc(20) Class130 local20 = this.aClass130Array4[local13];
				@Pc(22) Class130 local22 = local20;
				if (local20.aClass130_1 != null) {
					local22 = local20.aClass130_1;
				}
				local22.anInt4019 = (int) (local8.aFloat78 + (float) this.anIntArray642[local20.anInt4011] * local8.aFloat80 + local8.aFloat81 * (float) this.anIntArray645[local20.anInt4011] + (float) this.anIntArray641[local20.anInt4011] * local8.aFloat71);
				local22.anInt4023 = (int) (local8.aFloat75 + local8.aFloat73 * (float) this.anIntArray645[local20.anInt4011] + (float) this.anIntArray642[local20.anInt4011] * local8.aFloat82 + (float) this.anIntArray641[local20.anInt4011] * local8.aFloat79);
				local22.anInt4018 = (int) (local8.aFloat72 + (float) this.anIntArray642[local20.anInt4011] * local8.aFloat74 + local8.aFloat77 * (float) this.anIntArray645[local20.anInt4011] + local8.aFloat76 * (float) this.anIntArray641[local20.anInt4011]);
				local22.anInt4012 = (int) (local8.aFloat78 + (float) this.anIntArray645[local20.anInt4017] * local8.aFloat81 + local8.aFloat80 * (float) this.anIntArray642[local20.anInt4017] + (float) this.anIntArray641[local20.anInt4017] * local8.aFloat71);
				local22.anInt4025 = (int) ((float) this.anIntArray645[local20.anInt4017] * local8.aFloat73 + (float) this.anIntArray642[local20.anInt4017] * local8.aFloat82 + local8.aFloat79 * (float) this.anIntArray641[local20.anInt4017] + local8.aFloat75);
				local22.anInt4024 = (int) (local8.aFloat77 * (float) this.anIntArray645[local20.anInt4017] + (float) this.anIntArray642[local20.anInt4017] * local8.aFloat74 + (float) this.anIntArray641[local20.anInt4017] * local8.aFloat76 + local8.aFloat72);
				local22.anInt4028 = (int) (local8.aFloat78 + (float) this.anIntArray641[local20.anInt4029] * local8.aFloat71 + local8.aFloat80 * (float) this.anIntArray642[local20.anInt4029] + (float) this.anIntArray645[local20.anInt4029] * local8.aFloat81);
				local22.anInt4014 = (int) (local8.aFloat75 + (float) this.anIntArray641[local20.anInt4029] * local8.aFloat79 + local8.aFloat82 * (float) this.anIntArray642[local20.anInt4029] + local8.aFloat73 * (float) this.anIntArray645[local20.anInt4029]);
				local22.anInt4016 = (int) (local8.aFloat74 * (float) this.anIntArray642[local20.anInt4029] + local8.aFloat77 * (float) this.anIntArray645[local20.anInt4029] + (float) this.anIntArray641[local20.anInt4029] * local8.aFloat76 + local8.aFloat72);
			}
		}
		if (this.aClass337Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass337Array4.length; local13++) {
			@Pc(365) Class337 local365 = this.aClass337Array4[local13];
			@Pc(367) Class337 local367 = local365;
			if (local365.aClass337_2 != null) {
				local367 = local365.aClass337_2;
			}
			if (local365.aClass6_35 == null) {
				local365.aClass6_35 = local8.method6709();
			} else {
				local365.aClass6_35.method6695(local8);
			}
			local367.anInt9397 = (int) ((float) this.anIntArray641[local365.anInt9398] * local8.aFloat71 + local8.aFloat80 * (float) this.anIntArray642[local365.anInt9398] + (float) this.anIntArray645[local365.anInt9398] * local8.aFloat81 + local8.aFloat78);
			local367.anInt9394 = (int) (local8.aFloat75 + local8.aFloat73 * (float) this.anIntArray645[local365.anInt9398] + (float) this.anIntArray642[local365.anInt9398] * local8.aFloat82 + local8.aFloat79 * (float) this.anIntArray641[local365.anInt9398]);
			local367.anInt9393 = (int) ((float) this.anIntArray645[local365.anInt9398] * local8.aFloat77 + (float) this.anIntArray642[local365.anInt9398] * local8.aFloat74 + local8.aFloat76 * (float) this.anIntArray641[local365.anInt9398] + local8.aFloat72);
		}
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
	private void method7738() {
		if (!this.aBoolean677) {
			return;
		}
		this.aBoolean677 = false;
		if (this.aClass130Array4 == null && this.aClass337Array4 == null && this.aClass288Array1 == null) {
			if (this.anIntArray645 != null && !Static585.method8069(this.anInt9186, this.anInt9230)) {
				if (this.aClass293_4 == null || this.aClass293_4.method6979()) {
					if (!this.aBoolean678) {
						this.method7744();
					}
					this.anIntArray645 = null;
				} else {
					this.aBoolean677 = true;
				}
			}
			if (this.anIntArray642 != null && !Static430.method6447(this.anInt9230, this.anInt9186)) {
				if (this.aClass293_4 == null || this.aClass293_4.method6979()) {
					if (!this.aBoolean678) {
						this.method7744();
					}
					this.anIntArray642 = null;
				} else {
					this.aBoolean677 = true;
				}
			}
			if (this.anIntArray641 != null && !Static548.method7645(this.anInt9230, this.anInt9186)) {
				if (this.aClass293_4 == null || this.aClass293_4.method6979()) {
					if (!this.aBoolean678) {
						this.method7744();
					}
					this.anIntArray641 = null;
				} else {
					this.aBoolean677 = true;
				}
			}
		}
		if (this.aShortArray138 != null && this.anIntArray645 == null && this.anIntArray642 == null && this.anIntArray641 == null) {
			this.aShortArray138 = null;
			this.anIntArray640 = null;
		}
		if (this.aByteArray95 != null && !Static513.method7222(this.anInt9186, this.anInt9230)) {
			label195: {
				label194: {
					@Pc(172) boolean local172;
					if ((this.anInt9186 & 0x37) == 0) {
						if (this.aClass293_3 == null || this.aClass293_3.method6979()) {
							break label194;
						}
						local172 = false;
					} else {
						if (this.aClass293_1 == null || this.aClass293_1.method6979()) {
							break label194;
						}
						local172 = false;
					}
					if (!local172) {
						this.aBoolean677 = true;
						break label195;
					}
				}
				this.aShortArray129 = this.aShortArray131 = this.aShortArray133 = null;
				this.aByteArray95 = null;
			}
		}
		if (this.aShortArray135 != null && !Static581.method8033(this.anInt9230, this.anInt9186)) {
			if (this.aClass293_3 == null || this.aClass293_3.method6979()) {
				this.aShortArray135 = null;
			} else {
				this.aBoolean677 = true;
			}
		}
		if (this.aByteArray96 != null && !Static224.method3809(this.anInt9186, this.anInt9230)) {
			if (this.aClass293_3 == null || this.aClass293_3.method6979()) {
				this.aByteArray96 = null;
			} else {
				this.aBoolean677 = true;
			}
		}
		if (this.aFloatArray70 != null && !Static600.method8240(this.anInt9186, this.anInt9230)) {
			if (this.aClass293_2 == null || this.aClass293_2.method6979()) {
				this.aFloatArray70 = this.aFloatArray69 = null;
			} else {
				this.aBoolean677 = true;
			}
		}
		if (this.aShortArray132 != null && !Static272.method4392(this.anInt9230, this.anInt9186)) {
			if (this.aClass293_3 == null || this.aClass293_3.method6979()) {
				this.aShortArray132 = null;
			} else {
				this.aBoolean677 = true;
			}
		}
		if (this.aShortArray134 != null && !Static455.method6665(this.anInt9186, this.anInt9230)) {
			if ((this.aClass12_1 == null || this.aClass12_1.method287()) && (this.aClass293_3 == null || this.aClass293_3.method6979())) {
				this.aShortArray134 = this.aShortArray136 = this.aShortArray130 = null;
			} else {
				this.aBoolean677 = true;
			}
		}
		if (this.aShortArray139 != null) {
			if (this.aClass293_4 == null || this.aClass293_4.method6979()) {
				this.aShortArray139 = null;
			} else {
				this.aBoolean677 = true;
			}
		}
		if (this.aShortArray137 != null) {
			if (this.aClass293_3 == null || this.aClass293_3.method6979()) {
				this.aShortArray137 = null;
			} else {
				this.aBoolean677 = true;
			}
		}
		if (this.anIntArrayArray86 != null && !Static603.method8363(this.anInt9230, this.anInt9186)) {
			this.anIntArrayArray86 = null;
			this.aShortArray141 = null;
		}
		if (this.anIntArrayArray85 != null && !Static172.method3185(this.anInt9230, this.anInt9186)) {
			this.aShortArray140 = null;
			this.anIntArrayArray85 = null;
		}
		if (this.anIntArrayArray87 != null && !Static599.method8219(this.anInt9230, this.anInt9186)) {
			this.anIntArrayArray87 = null;
		}
		if (this.anIntArray646 != null && (this.anInt9230 & 0x800) == 0 && (this.anInt9230 & 0x40000) == 0) {
			this.anIntArray643 = null;
			this.anIntArray644 = null;
			this.anIntArray646 = null;
		}
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V")
	private void method7739() {
		if (this.anInt9252 == 0) {
			return;
		}
		if (this.method7748() && this.method7736()) {
			this.aClass87_Sub1_21.method5148(this.aClass293_4.anInterface3_17, 0);
			this.aClass87_Sub1_21.method5148(this.aClass293_3.anInterface3_17, 1);
			this.aClass87_Sub1_21.method5148(this.aClass293_2.anInterface3_17, 2);
			@Pc(66) boolean local66;
			if ((this.anInt9186 & 0x37) == 0) {
				this.aClass87_Sub1_21.method5108(false);
				local66 = false;
				this.aClass87_Sub1_21.method5110(this.aClass87_Sub1_21.aClass147_17);
			} else {
				local66 = true;
				this.aClass87_Sub1_21.method5108(true);
				this.aClass87_Sub1_21.method5148(this.aClass293_1.anInterface3_17, 3);
				this.aClass87_Sub1_21.method5110(this.aClass87_Sub1_21.aClass147_19);
			}
			for (@Pc(101) int local101 = 0; local101 < this.anIntArray643.length; local101++) {
				@Pc(108) int local108 = this.anIntArray646[local101];
				@Pc(115) int local115 = this.anIntArray646[local101 + 1];
				@Pc(122) int local122 = this.aShortArray132[local108] & 0xFFFF;
				if (local122 == 65535) {
					local122 = -1;
				}
				this.aClass87_Sub1_21.method5071(local66, true, local122);
				this.aClass87_Sub1_21.method5136(local108 * 3, this.anIntArray644[local101], this.aClass12_1.anInterface10_2, local115 - local108, Static562.aClass334_7, this.anIntArray643[local101]);
			}
		}
		this.method7738();
	}

	@OriginalMember(owner = "client!tv", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort114;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)V")
	private void method7740() {
		if (this.aClass288Array1 == null) {
			return;
		}
		this.aClass87_Sub1_21.C(!this.aBoolean676);
		this.aClass87_Sub1_21.method5108(false);
		this.aClass87_Sub1_21.method5131(1, Static358.aClass315_1);
		this.aClass87_Sub1_21.method5118(1, Static358.aClass315_1);
		for (@Pc(32) int local32 = 0; local32 < this.anInt9206; local32++) {
			@Pc(39) Class288 local39 = this.aClass288Array1[local32];
			@Pc(44) Class177 local44 = this.aClass177Array1[local32];
			if (!local39.aBoolean614 || !this.aClass87_Sub1_21.method7914()) {
				@Pc(74) float local74 = (float) (this.anIntArray645[local39.anInt8262] + this.anIntArray645[local39.anInt8263] + this.anIntArray645[local39.anInt8264]) * 0.3333333F;
				@Pc(95) float local95 = (float) (this.anIntArray642[local39.anInt8264] + this.anIntArray642[local39.anInt8262] + this.anIntArray642[local39.anInt8263]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray641[local39.anInt8263] + this.anIntArray641[local39.anInt8262] + this.anIntArray641[local39.anInt8264]) * 0.3333333F;
				@Pc(130) float local130 = local95 * Static199.aFloat111 + Static394.aFloat163 * local74 + local116 * Static147.aFloat83 + Static644.aFloat225;
				@Pc(144) float local144 = Static151.aFloat85 + local95 * Static34.aFloat22 + local74 * Static106.aFloat221 + local116 * Static344.aFloat151;
				@Pc(158) float local158 = Static56.aFloat25 * local74 + local95 * Static249.aFloat115 + local116 * Static643.aFloat224 + Static261.aFloat121;
				@Pc(179) float local179 = (float) (1.0D / Math.sqrt((double) (local130 * local130 + local144 * local144 + local158 * local158))) * (float) local39.anInt8259;
				@Pc(184) Class6_Sub2 local184 = this.aClass87_Sub1_21.method5129();
				local184.method2709(local44.anInt5140, local158 - local158 * local179, (float) local44.anInt5139 + local144 - local144 * local179, local44.anInt5144 * local39.aShort105 >> 7, local44.anInt5142 * local39.aShort106 >> 7, (float) local44.anInt5138 + local130 - local130 * local179);
				local184.method2705(this.aClass87_Sub1_21.aClass6_Sub2_17);
				this.aClass87_Sub1_21.method5022();
				@Pc(240) int local240 = local44.anInt5145;
				this.aClass87_Sub1_21.method5071(false, false, local39.aShort107);
				this.aClass87_Sub1_21.method5093(local39.aByte108);
				this.aClass87_Sub1_21.method5075(local240);
				this.aClass87_Sub1_21.method5120();
			}
		}
		this.aClass87_Sub1_21.method5118(1, Static508.aClass315_2);
		this.aClass87_Sub1_21.method5131(1, Static508.aClass315_2);
		this.aClass87_Sub1_21.C(true);
	}

	@OriginalMember(owner = "client!tv", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean678) {
			this.method7744();
		}
		return this.anInt9184;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!kd;ZII)Z")
	@Override
	public boolean method7730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method7741(arg5, arg4, arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!tv", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class353.anIntArray681[arg0];
		@Pc(13) int local13 = Class353.anIntArray682[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9189; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray645[local15] + local9 * this.anIntArray642[local15] >> 14;
			this.anIntArray642[local15] = this.anIntArray642[local15] * local13 - local9 * this.anIntArray645[local15] >> 14;
			this.anIntArray645[local15] = local33;
		}
		this.method7747();
		this.aBoolean678 = false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIZILclient!kd;I)Z")
	private boolean method7741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class6_Sub2 local8 = (Class6_Sub2) arg4;
		@Pc(12) Class6_Sub2 local12 = this.aClass87_Sub1_21.aClass6_Sub2_16;
		@Pc(33) float local33 = local8.aFloat72 * local12.aFloat71 + local8.aFloat75 * local12.aFloat80 + local8.aFloat78 * local12.aFloat81 + local12.aFloat78;
		@Pc(54) float local54 = local12.aFloat75 + local12.aFloat79 * local8.aFloat72 + local8.aFloat78 * local12.aFloat73 + local12.aFloat82 * local8.aFloat75;
		Static344.aFloat151 = local12.aFloat82 * local8.aFloat79 + local12.aFloat73 * local8.aFloat71 + local8.aFloat76 * local12.aFloat79;
		@Pc(93) float local93 = local12.aFloat74 * local8.aFloat75 + local12.aFloat77 * local8.aFloat78 + local8.aFloat72 * local12.aFloat76 + local12.aFloat72;
		Static34.aFloat22 = local12.aFloat79 * local8.aFloat74 + local12.aFloat73 * local8.aFloat80 + local8.aFloat82 * local12.aFloat82;
		Static394.aFloat163 = local8.aFloat77 * local12.aFloat71 + local8.aFloat81 * local12.aFloat81 + local12.aFloat80 * local8.aFloat73;
		Static199.aFloat111 = local8.aFloat74 * local12.aFloat71 + local8.aFloat80 * local12.aFloat81 + local8.aFloat82 * local12.aFloat80;
		Static249.aFloat115 = local12.aFloat77 * local8.aFloat80 + local12.aFloat74 * local8.aFloat82 + local12.aFloat76 * local8.aFloat74;
		Static147.aFloat83 = local12.aFloat80 * local8.aFloat79 + local8.aFloat71 * local12.aFloat81 + local8.aFloat76 * local12.aFloat71;
		Static643.aFloat224 = local8.aFloat71 * local12.aFloat77 + local8.aFloat79 * local12.aFloat74 + local8.aFloat76 * local12.aFloat76;
		Static106.aFloat221 = local12.aFloat79 * local8.aFloat77 + local8.aFloat81 * local12.aFloat73 + local8.aFloat73 * local12.aFloat82;
		Static56.aFloat25 = local12.aFloat76 * local8.aFloat77 + local12.aFloat77 * local8.aFloat81 + local8.aFloat73 * local12.aFloat74;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass87_Sub1_21.anInt6144;
		@Pc(255) int local255 = this.aClass87_Sub1_21.anInt6150;
		if (!this.aBoolean678) {
			this.method7744();
		}
		@Pc(270) int local270 = this.anInt9195 - this.anInt9224 >> 1;
		@Pc(278) int local278 = this.anInt9217 - this.anInt9243 >> 1;
		@Pc(287) int local287 = this.anInt9249 - this.anInt9212 >> 1;
		@Pc(292) int local292 = local270 + this.anInt9224;
		@Pc(298) int local298 = this.anInt9243 + local278;
		@Pc(303) int local303 = local287 + this.anInt9212;
		@Pc(310) int local310 = local292 - (local270 << arg1);
		@Pc(317) int local317 = local298 - (local278 << arg1);
		@Pc(323) int local323 = local303 - (local287 << arg1);
		@Pc(329) int local329 = local292 + (local270 << arg1);
		@Pc(336) int local336 = local298 + (local278 << arg1);
		@Pc(342) int local342 = (local287 << arg1) + local303;
		Static223.anIntArray316[0] = local310;
		Static525.anIntArray603[0] = local317;
		Static223.anIntArray316[1] = local329;
		Static211.anIntArray493[0] = local323;
		Static525.anIntArray603[1] = local317;
		Static211.anIntArray493[1] = local323;
		Static223.anIntArray316[2] = local310;
		Static525.anIntArray603[2] = local336;
		Static211.anIntArray493[2] = local323;
		Static223.anIntArray316[3] = local329;
		Static525.anIntArray603[3] = local336;
		Static211.anIntArray493[3] = local323;
		Static223.anIntArray316[4] = local310;
		Static525.anIntArray603[4] = local317;
		Static223.anIntArray316[5] = local329;
		Static211.anIntArray493[4] = local342;
		Static525.anIntArray603[5] = local317;
		Static223.anIntArray316[6] = local310;
		Static211.anIntArray493[5] = local342;
		Static525.anIntArray603[6] = local336;
		Static223.anIntArray316[7] = local329;
		Static211.anIntArray493[6] = local342;
		Static525.anIntArray603[7] = local336;
		Static211.anIntArray493[7] = local342;
		@Pc(490) float local490;
		@Pc(476) float local476;
		@Pc(504) float local504;
		@Pc(457) float local457;
		@Pc(452) float local452;
		@Pc(462) float local462;
		for (@Pc(445) int local445 = 0; local445 < 8; local445++) {
			local452 = Static525.anIntArray603[local445];
			local457 = Static223.anIntArray316[local445];
			local462 = Static211.anIntArray493[local445];
			local476 = local54 + Static344.aFloat151 * local462 + Static34.aFloat22 * local452 + local457 * Static106.aFloat221;
			local490 = local33 + Static147.aFloat83 * local462 + local452 * Static199.aFloat111 + Static394.aFloat163 * local457;
			local504 = local93 + local452 * Static249.aFloat115 + Static56.aFloat25 * local457 + local462 * Static643.aFloat224;
			if (local504 >= (float) this.aClass87_Sub1_21.anInt6146) {
				if (arg0 > 0) {
					local504 = arg0;
				}
				@Pc(528) float local528 = (float) this.aClass87_Sub1_21.anInt6121 + (float) local251 * local490 / local504;
				if (local241 > local528) {
					local241 = local528;
				}
				@Pc(546) float local546 = (float) local255 * local476 / local504 + (float) this.aClass87_Sub1_21.anInt6134;
				if (local528 > local243) {
					local243 = local528;
				}
				local239 = true;
				if (local546 < local245) {
					local245 = local546;
				}
				if (local546 > local247) {
					local247 = local546;
				}
			}
		}
		if (local239 && (float) arg5 > local241 && (float) arg5 < local243 && (float) arg3 > local245 && (float) arg3 < local247) {
			if (arg2) {
				return true;
			}
			if (this.anInt9193 > Static35.anIntArray103.length) {
				Static456.anIntArray543 = new int[this.anInt9193];
				Static35.anIntArray103 = new int[this.anInt9193];
			}
			@Pc(691) int local691;
			for (@Pc(617) int local617 = 0; local617 < this.anInt9189; local617++) {
				local462 = this.anIntArray641[local617];
				local457 = this.anIntArray645[local617];
				local452 = this.anIntArray642[local617];
				local504 = local452 * Static249.aFloat115 + Static56.aFloat25 * local457 + local462 * Static643.aFloat224 + local93;
				local490 = local452 * Static199.aFloat111 + Static394.aFloat163 * local457 + local462 * Static147.aFloat83 + local33;
				local476 = local54 + Static344.aFloat151 * local462 + local457 * Static106.aFloat221 + local452 * Static34.aFloat22;
				@Pc(698) int local698;
				@Pc(700) int local700;
				@Pc(709) int local709;
				if ((float) this.aClass87_Sub1_21.anInt6146 <= local504) {
					if (arg0 > 0) {
						local504 = arg0;
					}
					local691 = (int) ((float) local251 * local490 / local504 + (float) this.aClass87_Sub1_21.anInt6121);
					local698 = (int) (local476 * (float) local255 / local504 + (float) this.aClass87_Sub1_21.anInt6134);
					local700 = this.anIntArray640[local617];
					local709 = this.anIntArray640[local617 + 1];
					for (@Pc(773) int local773 = local700; local773 < local709; local773++) {
						@Pc(782) int local782 = this.aShortArray138[local773] - 1;
						if (local782 == -1) {
							break;
						}
						Static35.anIntArray103[local782] = local691;
						Static456.anIntArray543[local782] = local698;
					}
				} else {
					local691 = this.anIntArray640[local617];
					local698 = this.anIntArray640[local617 + 1];
					for (local700 = local691; local700 < local698; local700++) {
						local709 = this.aShortArray138[local700] - 1;
						if (local709 == -1) {
							break;
						}
						Static35.anIntArray103[this.aShortArray138[local700] - 1] = -999999;
					}
				}
			}
			for (local691 = 0; local691 < this.anInt9228; local691++) {
				if (Static35.anIntArray103[this.aShortArray134[local691]] != -999999 && Static35.anIntArray103[this.aShortArray136[local691]] != -999999 && Static35.anIntArray103[this.aShortArray130[local691]] != -999999 && this.method7751(arg5, Static456.anIntArray543[this.aShortArray130[local691]], Static35.anIntArray103[this.aShortArray134[local691]], Static456.anIntArray543[this.aShortArray134[local691]], Static35.anIntArray103[this.aShortArray130[local691]], Static456.anIntArray543[this.aShortArray136[local691]], arg3, Static35.anIntArray103[this.aShortArray136[local691]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLclient!tv;ZILclient!tv;B)Lclient!ka;")
	private Class25 method7742(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class25_Sub3 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25_Sub3 arg4) {
		arg1.anInt9255 = this.anInt9255;
		if ((arg3 & 0x100) == 0) {
			arg1.aBoolean676 = this.aBoolean676;
		} else {
			arg1.aBoolean676 = true;
		}
		arg1.aBoolean679 = this.aBoolean679;
		arg1.aShort115 = this.aShort115;
		arg1.aShort114 = this.aShort114;
		arg1.anInt9189 = this.anInt9189;
		arg1.anInt9252 = this.anInt9252;
		arg1.anInt9230 = arg3;
		arg1.anInt9186 = this.anInt9186;
		arg1.anInt9228 = this.anInt9228;
		arg1.anInt9193 = this.anInt9193;
		arg1.anInt9206 = this.anInt9206;
		@Pc(73) boolean local73 = Static407.method6262(this.anInt9186, arg3);
		@Pc(79) boolean local79 = Static191.method5132(this.anInt9186, arg3);
		@Pc(85) boolean local85 = Static37.method811(arg3, this.anInt9186);
		@Pc(91) boolean local91 = local79 | local73 | local85;
		@Pc(206) int local206;
		if (local91) {
			if (!local73) {
				arg1.anIntArray645 = this.anIntArray645;
			} else if (arg4.anIntArray645 == null || arg4.anIntArray645.length < this.anInt9255) {
				arg1.anIntArray645 = arg4.anIntArray645 = new int[this.anInt9255];
			} else {
				arg1.anIntArray645 = arg4.anIntArray645;
			}
			if (!local79) {
				arg1.anIntArray642 = this.anIntArray642;
			} else if (arg4.anIntArray642 == null || this.anInt9255 > arg4.anIntArray642.length) {
				arg1.anIntArray642 = arg4.anIntArray642 = new int[this.anInt9255];
			} else {
				arg1.anIntArray642 = arg4.anIntArray642;
			}
			if (!local85) {
				arg1.anIntArray641 = this.anIntArray641;
			} else if (arg4.anIntArray641 == null || this.anInt9255 > arg4.anIntArray641.length) {
				arg1.anIntArray641 = arg4.anIntArray641 = new int[this.anInt9255];
			} else {
				arg1.anIntArray641 = arg4.anIntArray641;
			}
			for (local206 = 0; local206 < this.anInt9255; local206++) {
				if (local73) {
					arg1.anIntArray645[local206] = this.anIntArray645[local206];
				}
				if (local79) {
					arg1.anIntArray642[local206] = this.anIntArray642[local206];
				}
				if (local85) {
					arg1.anIntArray641[local206] = this.anIntArray641[local206];
				}
			}
		} else {
			arg1.anIntArray642 = this.anIntArray642;
			arg1.anIntArray645 = this.anIntArray645;
			arg1.anIntArray641 = this.anIntArray641;
		}
		if (Static439.method6540(this.anInt9186, arg3)) {
			arg1.aClass293_4 = arg4.aClass293_4;
			arg1.aClass293_4.aBoolean621 = this.aClass293_4.aBoolean621;
			arg1.aClass293_4.aBoolean622 = true;
			arg1.aClass293_4.anInterface3_17 = this.aClass293_4.anInterface3_17;
		} else if (Static504.method7816(this.anInt9186, arg3)) {
			arg1.aClass293_4 = this.aClass293_4;
		} else {
			arg1.aClass293_4 = null;
		}
		if (Static228.method3854(this.anInt9186, arg3)) {
			if (arg4.aShortArray135 == null || arg4.aShortArray135.length < this.anInt9228) {
				arg1.aShortArray135 = arg4.aShortArray135 = new short[this.anInt9228];
			} else {
				arg1.aShortArray135 = arg4.aShortArray135;
			}
			for (local206 = 0; local206 < this.anInt9228; local206++) {
				arg1.aShortArray135[local206] = this.aShortArray135[local206];
			}
		} else {
			arg1.aShortArray135 = this.aShortArray135;
		}
		if (Static270.method4343(arg3, this.anInt9186)) {
			if (arg4.aByteArray96 == null || arg4.aByteArray96.length < this.anInt9228) {
				arg1.aByteArray96 = arg4.aByteArray96 = new byte[this.anInt9228];
			} else {
				arg1.aByteArray96 = arg4.aByteArray96;
			}
			for (local206 = 0; local206 < this.anInt9228; local206++) {
				arg1.aByteArray96[local206] = this.aByteArray96[local206];
			}
		} else {
			arg1.aByteArray96 = this.aByteArray96;
		}
		if (Static336.method5206(arg3, this.anInt9186)) {
			arg1.aClass293_3 = arg4.aClass293_3;
			arg1.aClass293_3.aBoolean621 = this.aClass293_3.aBoolean621;
			arg1.aClass293_3.aBoolean622 = true;
			arg1.aClass293_3.anInterface3_17 = this.aClass293_3.anInterface3_17;
		} else if (Static611.method8353(arg3, this.anInt9186)) {
			arg1.aClass293_3 = this.aClass293_3;
		} else {
			arg1.aClass293_3 = null;
		}
		@Pc(527) int local527;
		if (Static480.method6932(arg3, this.anInt9186)) {
			if (arg4.aShortArray129 == null || arg4.aShortArray129.length < this.anInt9193) {
				local206 = this.anInt9193;
				arg1.aShortArray129 = arg4.aShortArray129 = new short[local206];
				arg1.aShortArray131 = arg4.aShortArray131 = new short[local206];
				arg1.aShortArray133 = arg4.aShortArray133 = new short[local206];
			} else {
				arg1.aShortArray131 = arg4.aShortArray131;
				arg1.aShortArray129 = arg4.aShortArray129;
				arg1.aShortArray133 = arg4.aShortArray133;
			}
			if (this.aClass237_1 == null) {
				arg1.aClass237_1 = null;
				for (local206 = 0; local206 < this.anInt9193; local206++) {
					arg1.aShortArray129[local206] = this.aShortArray129[local206];
					arg1.aShortArray131[local206] = this.aShortArray131[local206];
					arg1.aShortArray133[local206] = this.aShortArray133[local206];
				}
			} else {
				if (arg4.aClass237_1 == null) {
					arg4.aClass237_1 = new Class237();
				}
				@Pc(515) Class237 local515 = arg1.aClass237_1 = arg4.aClass237_1;
				if (local515.aShortArray90 == null || this.anInt9193 > local515.aShortArray90.length) {
					local527 = this.anInt9193;
					local515.aByteArray69 = new byte[local527];
					local515.aShortArray91 = new short[local527];
					local515.aShortArray90 = new short[local527];
					local515.aShortArray89 = new short[local527];
				}
				for (local527 = 0; local527 < this.anInt9193; local527++) {
					arg1.aShortArray129[local527] = this.aShortArray129[local527];
					arg1.aShortArray131[local527] = this.aShortArray131[local527];
					arg1.aShortArray133[local527] = this.aShortArray133[local527];
					local515.aShortArray90[local527] = this.aClass237_1.aShortArray90[local527];
					local515.aShortArray91[local527] = this.aClass237_1.aShortArray91[local527];
					local515.aShortArray89[local527] = this.aClass237_1.aShortArray89[local527];
					local515.aByteArray69[local527] = this.aClass237_1.aByteArray69[local527];
				}
			}
			arg1.aByteArray95 = this.aByteArray95;
		} else {
			arg1.aClass237_1 = this.aClass237_1;
			arg1.aShortArray129 = this.aShortArray129;
			arg1.aShortArray133 = this.aShortArray133;
			arg1.aByteArray95 = this.aByteArray95;
			arg1.aShortArray131 = this.aShortArray131;
		}
		if (Static633.method8493(this.anInt9186, arg3)) {
			arg1.aClass293_1 = arg4.aClass293_1;
			arg1.aClass293_1.aBoolean621 = this.aClass293_1.aBoolean621;
			arg1.aClass293_1.aBoolean622 = true;
			arg1.aClass293_1.anInterface3_17 = this.aClass293_1.anInterface3_17;
		} else if (Static115.method1859(arg3, this.anInt9186)) {
			arg1.aClass293_1 = this.aClass293_1;
		} else {
			arg1.aClass293_1 = null;
		}
		if (Static167.method3081(arg3, this.anInt9186)) {
			if (arg4.aFloatArray70 == null || arg4.aFloatArray70.length < this.anInt9228) {
				local206 = this.anInt9193;
				arg1.aFloatArray69 = arg4.aFloatArray69 = new float[local206];
				arg1.aFloatArray70 = arg4.aFloatArray70 = new float[local206];
			} else {
				arg1.aFloatArray70 = arg4.aFloatArray70;
				arg1.aFloatArray69 = arg4.aFloatArray69;
			}
			for (local206 = 0; local206 < this.anInt9193; local206++) {
				arg1.aFloatArray70[local206] = this.aFloatArray70[local206];
				arg1.aFloatArray69[local206] = this.aFloatArray69[local206];
			}
		} else {
			arg1.aFloatArray70 = this.aFloatArray70;
			arg1.aFloatArray69 = this.aFloatArray69;
		}
		if (Static461.method6714(arg3, this.anInt9186)) {
			arg1.aClass293_2 = arg4.aClass293_2;
			arg1.aClass293_2.aBoolean621 = this.aClass293_2.aBoolean621;
			arg1.aClass293_2.aBoolean622 = true;
			arg1.aClass293_2.anInterface3_17 = this.aClass293_2.anInterface3_17;
		} else if (Static404.method784(this.anInt9186, arg3)) {
			arg1.aClass293_2 = this.aClass293_2;
		} else {
			arg1.aClass293_2 = null;
		}
		if (Static602.method8257(arg3, this.anInt9186)) {
			if (arg4.aShortArray134 == null || arg4.aShortArray134.length < this.anInt9228) {
				local206 = this.anInt9228;
				arg1.aShortArray134 = arg4.aShortArray134 = new short[local206];
				arg1.aShortArray130 = arg4.aShortArray130 = new short[local206];
				arg1.aShortArray136 = arg4.aShortArray136 = new short[local206];
			} else {
				arg1.aShortArray134 = arg4.aShortArray134;
				arg1.aShortArray130 = arg4.aShortArray130;
				arg1.aShortArray136 = arg4.aShortArray136;
			}
			for (local206 = 0; local206 < this.anInt9228; local206++) {
				arg1.aShortArray134[local206] = this.aShortArray134[local206];
				arg1.aShortArray136[local206] = this.aShortArray136[local206];
				arg1.aShortArray130[local206] = this.aShortArray130[local206];
			}
		} else {
			arg1.aShortArray134 = this.aShortArray134;
			arg1.aShortArray130 = this.aShortArray130;
			arg1.aShortArray136 = this.aShortArray136;
		}
		if (Static471.method6779(arg3, this.anInt9186)) {
			arg1.aClass12_1 = arg4.aClass12_1;
			arg1.aClass12_1.anInterface10_2 = this.aClass12_1.anInterface10_2;
			arg1.aClass12_1.aBoolean23 = this.aClass12_1.aBoolean23;
			arg1.aClass12_1.aBoolean22 = true;
		} else if (Static384.method5787(this.anInt9186, arg3)) {
			arg1.aClass12_1 = this.aClass12_1;
		} else {
			arg1.aClass12_1 = null;
		}
		if (Static312.method4756(arg3, this.anInt9186)) {
			if (arg4.aShortArray132 == null || this.anInt9228 > arg4.aShortArray132.length) {
				local206 = this.anInt9228;
				arg1.aShortArray132 = arg4.aShortArray132 = new short[local206];
			} else {
				arg1.aShortArray132 = arg4.aShortArray132;
			}
			for (local206 = 0; local206 < this.anInt9228; local206++) {
				arg1.aShortArray132[local206] = this.aShortArray132[local206];
			}
		} else {
			arg1.aShortArray132 = this.aShortArray132;
		}
		if (!Static161.method3030(this.anInt9186, arg3)) {
			arg1.aClass177Array1 = this.aClass177Array1;
		} else if (arg4.aClass177Array1 == null || arg4.aClass177Array1.length < this.anInt9206) {
			local206 = this.anInt9206;
			arg1.aClass177Array1 = arg4.aClass177Array1 = new Class177[local206];
			for (local527 = 0; local527 < this.anInt9206; local527++) {
				arg1.aClass177Array1[local527] = this.aClass177Array1[local527].method4295();
			}
		} else {
			arg1.aClass177Array1 = arg4.aClass177Array1;
			for (local206 = 0; local206 < this.anInt9206; local206++) {
				arg1.aClass177Array1[local206].method4293(this.aClass177Array1[local206]);
			}
		}
		arg1.anIntArray643 = this.anIntArray643;
		arg1.anIntArray640 = this.anIntArray640;
		arg1.anIntArray646 = this.anIntArray646;
		arg1.aShortArray137 = this.aShortArray137;
		arg1.aShortArray138 = this.aShortArray138;
		arg1.aClass130Array4 = this.aClass130Array4;
		arg1.aShortArray140 = this.aShortArray140;
		arg1.anIntArrayArray86 = this.anIntArrayArray86;
		arg1.aClass337Array4 = this.aClass337Array4;
		arg1.anIntArrayArray87 = this.anIntArrayArray87;
		arg1.anIntArray644 = this.anIntArray644;
		arg1.aShortArray141 = this.aShortArray141;
		if (this.aBoolean678) {
			arg1.anInt9213 = this.anInt9213;
			arg1.anInt9224 = this.anInt9224;
			arg1.anInt9212 = this.anInt9212;
			arg1.anInt9195 = this.anInt9195;
			arg1.anInt9249 = this.anInt9249;
			arg1.anInt9217 = this.anInt9217;
			arg1.anInt9243 = this.anInt9243;
			arg1.anInt9184 = this.anInt9184;
			arg1.aBoolean678 = true;
		} else {
			arg1.aBoolean678 = false;
		}
		arg1.aShortArray139 = this.aShortArray139;
		arg1.aClass288Array1 = this.aClass288Array1;
		arg1.anIntArrayArray85 = this.anIntArrayArray85;
		return arg1;
	}

	@OriginalMember(owner = "client!tv", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean676;
	}

	@OriginalMember(owner = "client!tv", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9255; local7++) {
			this.anIntArray645[local7] = this.anIntArray645[local7] + 7 >> 4;
			this.anIntArray642[local7] = this.anIntArray642[local7] + 7 >> 4;
			this.anIntArray641[local7] = this.anIntArray641[local7] + 7 >> 4;
		}
		this.method7747();
		this.aBoolean678 = false;
	}

	@OriginalMember(owner = "client!tv", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9189; local7++) {
			if (arg0 != 128) {
				this.anIntArray645[local7] = this.anIntArray645[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray642[local7] = arg1 * this.anIntArray642[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray641[local7] = arg2 * this.anIntArray641[local7] >> 7;
			}
		}
		this.method7747();
		this.aBoolean678 = false;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "()V")
	@Override
	protected void method7718() {
	}

	@OriginalMember(owner = "client!tv", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static35.anInt899 = 0;
			Static560.anInt9272 = 0;
			Static524.anInt8750 = 0;
			for (local17 = 0; local17 < this.anInt9189; local17++) {
				Static524.anInt8750 += this.anIntArray645[local17];
				Static560.anInt9272 += this.anIntArray642[local17];
				local9++;
				Static35.anInt899 += this.anIntArray641[local17];
			}
			if (local9 <= 0) {
				Static35.anInt899 = arg3;
				Static560.anInt9272 = arg2;
				Static524.anInt8750 = arg1;
			} else {
				Static560.anInt9272 = Static560.anInt9272 / local9 + arg2;
				Static35.anInt899 = Static35.anInt899 / local9 + arg3;
				Static524.anInt8750 = arg1 + Static524.anInt8750 / local9;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt9189; local9++) {
				this.anIntArray645[local9] += arg1;
				this.anIntArray642[local9] += arg2;
				this.anIntArray641[local9] += arg3;
			}
		} else {
			@Pc(162) int local162;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt9189; local9++) {
					this.anIntArray645[local9] -= Static524.anInt8750;
					this.anIntArray642[local9] -= Static560.anInt9272;
					this.anIntArray641[local9] -= Static35.anInt899;
					if (arg3 != 0) {
						local17 = Class353.anIntArray681[arg3];
						local162 = Class353.anIntArray682[arg3];
						local181 = local17 * this.anIntArray642[local9] + this.anIntArray645[local9] * local162 + 16383 >> 14;
						this.anIntArray642[local9] = local162 * this.anIntArray642[local9] + 16383 - local17 * this.anIntArray645[local9] >> 14;
						this.anIntArray645[local9] = local181;
					}
					if (arg1 != 0) {
						local17 = Class353.anIntArray681[arg1];
						local162 = Class353.anIntArray682[arg1];
						local181 = local162 * this.anIntArray642[local9] + 16383 - this.anIntArray641[local9] * local17 >> 14;
						this.anIntArray641[local9] = local17 * this.anIntArray642[local9] + local162 * this.anIntArray641[local9] + 16383 >> 14;
						this.anIntArray642[local9] = local181;
					}
					if (arg2 != 0) {
						local17 = Class353.anIntArray681[arg2];
						local162 = Class353.anIntArray682[arg2];
						local181 = this.anIntArray645[local9] * local162 + this.anIntArray641[local9] * local17 + 16383 >> 14;
						this.anIntArray641[local9] = local162 * this.anIntArray641[local9] + 16383 - this.anIntArray645[local9] * local17 >> 14;
						this.anIntArray645[local9] = local181;
					}
					this.anIntArray645[local9] += Static524.anInt8750;
					this.anIntArray642[local9] += Static560.anInt9272;
					this.anIntArray641[local9] += Static35.anInt899;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt9189; local9++) {
					this.anIntArray645[local9] -= Static524.anInt8750;
					this.anIntArray642[local9] -= Static560.anInt9272;
					this.anIntArray641[local9] -= Static35.anInt899;
					this.anIntArray645[local9] = this.anIntArray645[local9] * arg1 / 128;
					this.anIntArray642[local9] = arg2 * this.anIntArray642[local9] / 128;
					this.anIntArray641[local9] = this.anIntArray641[local9] * arg3 / 128;
					this.anIntArray645[local9] += Static524.anInt8750;
					this.anIntArray642[local9] += Static560.anInt9272;
					this.anIntArray641[local9] += Static35.anInt899;
				}
			} else {
				@Pc(505) Class288 local505;
				@Pc(510) Class177 local510;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt9228; local9++) {
						local17 = arg1 * 8 + (this.aByteArray96[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray96[local9] = (byte) local17;
					}
					if (this.aClass288Array1 != null) {
						for (local17 = 0; local17 < this.anInt9206; local17++) {
							local505 = this.aClass288Array1[local17];
							local510 = this.aClass177Array1[local17];
							local510.anInt5145 = local510.anInt5145 & 0xFFFFFF | 255 - (this.aByteArray96[local505.anInt8261] & 0xFF) << 24;
						}
					}
					this.method7750();
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt9228; local9++) {
						local17 = this.aShortArray135[local9] & 0xFFFF;
						local162 = local17 >> 10 & 0x3F;
						local181 = local17 >> 7 & 0x7;
						local181 += arg2 / 4;
						@Pc(578) int local578 = local17 & 0x7F;
						@Pc(584) int local584 = local162 + arg1 & 0x3F;
						local578 += arg3;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						if (local578 < 0) {
							local578 = 0;
						} else if (local578 > 127) {
							local578 = 127;
						}
						this.aShortArray135[local9] = (short) (local181 << 7 | local584 << 10 | local578);
					}
					if (this.aClass288Array1 != null) {
						for (local17 = 0; local17 < this.anInt9206; local17++) {
							local505 = this.aClass288Array1[local17];
							local510 = this.aClass177Array1[local17];
							local510.anInt5145 = local510.anInt5145 & 0xFF000000 | Static349.anIntArray394[this.aShortArray135[local505.anInt8261] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method7750();
				} else {
					@Pc(696) Class177 local696;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt9206; local9++) {
							local696 = this.aClass177Array1[local9];
							local696.anInt5139 += arg2;
							local696.anInt5138 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt9206; local9++) {
							local696 = this.aClass177Array1[local9];
							local696.anInt5144 = arg2 * local696.anInt5144 >> 7;
							local696.anInt5142 = local696.anInt5142 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt9206; local9++) {
							local696 = this.aClass177Array1[local9];
							local696.anInt5140 = arg1 + local696.anInt5140 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean678) {
			this.method7744();
		}
		return this.anInt9243;
	}

	@OriginalMember(owner = "client!tv", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean678) {
			this.method7744();
		}
		return this.anInt9217;
	}

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9189; local3++) {
			this.anIntArray641[local3] = -this.anIntArray641[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt9193; local25++) {
			this.aShortArray133[local25] = (short) -this.aShortArray133[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt9228; local44++) {
			@Pc(51) short local51 = this.aShortArray134[local44];
			this.aShortArray134[local44] = this.aShortArray130[local44];
			this.aShortArray130[local44] = local51;
		}
		this.method7747();
		this.method7745();
		this.method7749();
		this.aBoolean678 = false;
	}

	@OriginalMember(owner = "client!tv", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort115 = (short) arg0;
		this.method7747();
		this.method7745();
	}

	@OriginalMember(owner = "client!tv", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub5_Sub12 ba(@OriginalArg(0) Class2_Sub5_Sub12 arg0) {
		if (this.anInt9193 == 0) {
			return null;
		}
		if (!this.aBoolean678) {
			this.method7744();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass87_Sub1_21.anInt6126 > 0) {
			local37 = this.anInt9224 - (this.anInt9217 * this.aClass87_Sub1_21.anInt6126 >> 8) >> this.aClass87_Sub1_21.anInt6129;
			local54 = this.anInt9195 - (this.anInt9243 * this.aClass87_Sub1_21.anInt6126 >> 8) >> this.aClass87_Sub1_21.anInt6129;
		} else {
			local37 = this.anInt9224 - (this.anInt9243 * this.aClass87_Sub1_21.anInt6126 >> 8) >> this.aClass87_Sub1_21.anInt6129;
			local54 = this.anInt9195 - (this.aClass87_Sub1_21.anInt6126 * this.anInt9217 >> 8) >> this.aClass87_Sub1_21.anInt6129;
		}
		@Pc(110) int local110;
		@Pc(126) int local126;
		if (this.aClass87_Sub1_21.anInt6118 > 0) {
			local110 = this.anInt9212 - (this.aClass87_Sub1_21.anInt6118 * this.anInt9217 >> 8) >> this.aClass87_Sub1_21.anInt6129;
			local126 = this.anInt9249 - (this.aClass87_Sub1_21.anInt6118 * this.anInt9243 >> 8) >> this.aClass87_Sub1_21.anInt6129;
		} else {
			local110 = this.anInt9212 - (this.aClass87_Sub1_21.anInt6118 * this.anInt9243 >> 8) >> this.aClass87_Sub1_21.anInt6129;
			local126 = this.anInt9249 - (this.anInt9217 * this.aClass87_Sub1_21.anInt6118 >> 8) >> this.aClass87_Sub1_21.anInt6129;
		}
		@Pc(168) int local168 = local54 + 1 - local37;
		@Pc(174) int local174 = local126 + 1 - local110;
		@Pc(177) Class2_Sub5_Sub12_Sub1 local177 = (Class2_Sub5_Sub12_Sub1) arg0;
		@Pc(187) Class2_Sub5_Sub12_Sub1 local187;
		if (local177 != null && local177.method4440(local174, local168)) {
			local187 = local177;
			local177.method4439();
		} else {
			local187 = new Class2_Sub5_Sub12_Sub1(this.aClass87_Sub1_21, local168, local174);
		}
		local187.method4438(local110, local37, local54, local126);
		this.method7746(local187);
		return local187;
	}

	@OriginalMember(owner = "client!tv", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt9230;
	}

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "()[Lclient!gi;")
	@Override
	public Class130[] method7731() {
		return this.aClass130Array4;
	}

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class353.anIntArray681[arg0];
		@Pc(13) int local13 = Class353.anIntArray682[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt9189; local15++) {
			local33 = local13 * this.anIntArray645[local15] + local9 * this.anIntArray641[local15] >> 14;
			this.anIntArray641[local15] = local13 * this.anIntArray641[local15] - local9 * this.anIntArray645[local15] >> 14;
			this.anIntArray645[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt9193; local33++) {
			@Pc(87) int local87 = this.aShortArray129[local33] * local13 + this.aShortArray133[local33] * local9 >> 14;
			this.aShortArray133[local33] = (short) (this.aShortArray133[local33] * local13 - this.aShortArray129[local33] * local9 >> 14);
			this.aShortArray129[local33] = (short) local87;
		}
		this.method7747();
		this.method7745();
		this.aBoolean678 = false;
	}

	@OriginalMember(owner = "client!tv", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort114 = (short) arg0;
		this.method7750();
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "()[Lclient!uga;")
	@Override
	public Class337[] method7724() {
		return this.aClass337Array4;
	}

	@OriginalMember(owner = "client!tv", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean678) {
			this.method7744();
		}
		return this.anInt9213;
	}

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "(I)V")
	private void method7744() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt9189; local29++) {
			@Pc(36) int local36 = this.anIntArray645[local29];
			@Pc(41) int local41 = this.anIntArray642[local29];
			if (local7 > local36) {
				local7 = local36;
			}
			if (local13 < local36) {
				local13 = local36;
			}
			if (local41 > local15) {
				local15 = local41;
			}
			@Pc(73) int local73 = this.anIntArray641[local29];
			if (local9 > local41) {
				local9 = local41;
			}
			if (local11 > local73) {
				local11 = local73;
			}
			if (local73 > local17) {
				local17 = local73;
			}
			@Pc(100) int local100 = local73 * local73 + local36 * local36;
			if (local19 < local100) {
				local19 = local100;
			}
			local100 = local41 * local41 + local36 * local36 + local73 * local73;
			if (local27 < local100) {
				local27 = local100;
			}
		}
		this.anInt9224 = local7;
		this.anInt9217 = local15;
		this.anInt9243 = local9;
		this.anInt9195 = local13;
		this.anInt9249 = local17;
		this.anInt9212 = local11;
		this.anInt9213 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt9184 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean678 = true;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			Static560.anInt9272 = 0;
			Static35.anInt899 = 0;
			local31 = 0;
			Static524.anInt8750 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray85.length) {
					local51 = this.anIntArrayArray85[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static524.anInt8750 += this.anIntArray645[local59];
						Static560.anInt9272 += this.anIntArray642[local59];
						local31++;
						Static35.anInt899 += this.anIntArray641[local59];
					}
				}
			}
			if (local31 > 0) {
				Static35.anInt899 = Static35.anInt899 / local31 + local25;
				Static560.anInt9272 = Static560.anInt9272 / local31 + local17;
				Static524.anInt8750 = Static524.anInt8750 / local31 + local21;
			} else {
				Static35.anInt899 = local25;
				Static560.anInt9272 = local17;
				Static524.anInt8750 = local21;
			}
			return;
		}
		@Pc(163) int[] local163;
		@Pc(165) int local165;
		if (arg0 == 1) {
			local25 = arg4 << 4;
			local21 = arg2 << 4;
			local17 = arg3 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray85.length) {
					local163 = this.anIntArrayArray85[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local53 = local163[local165];
						this.anIntArray645[local53] += local21;
						this.anIntArray642[local53] += local17;
						this.anIntArray641[local53] += local25;
					}
				}
			}
			return;
		}
		@Pc(286) int local286;
		@Pc(304) int local304;
		@Pc(755) int local755;
		@Pc(764) int local764;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray85.length) {
					local163 = this.anIntArrayArray85[local35];
					if ((arg5 & 0x1) == 0) {
						for (local165 = 0; local165 < local163.length; local165++) {
							local53 = local163[local165];
							this.anIntArray645[local53] -= Static524.anInt8750;
							this.anIntArray642[local53] -= Static560.anInt9272;
							this.anIntArray641[local53] -= Static35.anInt899;
							if (arg4 != 0) {
								local59 = Class353.anIntArray681[arg4];
								local286 = Class353.anIntArray682[arg4];
								local304 = this.anIntArray645[local53] * local286 + local59 * this.anIntArray642[local53] + 16383 >> 14;
								this.anIntArray642[local53] = local286 * this.anIntArray642[local53] + 16383 - this.anIntArray645[local53] * local59 >> 14;
								this.anIntArray645[local53] = local304;
							}
							if (arg2 != 0) {
								local59 = Class353.anIntArray681[arg2];
								local286 = Class353.anIntArray682[arg2];
								local304 = local286 * this.anIntArray642[local53] + 16383 - this.anIntArray641[local53] * local59 >> 14;
								this.anIntArray641[local53] = this.anIntArray641[local53] * local286 + local59 * this.anIntArray642[local53] + 16383 >> 14;
								this.anIntArray642[local53] = local304;
							}
							if (arg3 != 0) {
								local59 = Class353.anIntArray681[arg3];
								local286 = Class353.anIntArray682[arg3];
								local304 = local59 * this.anIntArray641[local53] + this.anIntArray645[local53] * local286 + 16383 >> 14;
								this.anIntArray641[local53] = this.anIntArray641[local53] * local286 + 16383 - local59 * this.anIntArray645[local53] >> 14;
								this.anIntArray645[local53] = local304;
							}
							this.anIntArray645[local53] += Static524.anInt8750;
							this.anIntArray642[local53] += Static560.anInt9272;
							this.anIntArray641[local53] += Static35.anInt899;
						}
					} else {
						for (local165 = 0; local165 < local163.length; local165++) {
							local53 = local163[local165];
							this.anIntArray645[local53] -= Static524.anInt8750;
							this.anIntArray642[local53] -= Static560.anInt9272;
							this.anIntArray641[local53] -= Static35.anInt899;
							if (arg2 != 0) {
								local59 = Class353.anIntArray681[arg2];
								local286 = Class353.anIntArray682[arg2];
								local304 = local286 * this.anIntArray642[local53] + 16383 - this.anIntArray641[local53] * local59 >> 14;
								this.anIntArray641[local53] = local59 * this.anIntArray642[local53] + this.anIntArray641[local53] * local286 + 16383 >> 14;
								this.anIntArray642[local53] = local304;
							}
							if (arg4 != 0) {
								local59 = Class353.anIntArray681[arg4];
								local286 = Class353.anIntArray682[arg4];
								local304 = local286 * this.anIntArray645[local53] + this.anIntArray642[local53] * local59 + 16383 >> 14;
								this.anIntArray642[local53] = this.anIntArray642[local53] * local286 + 16383 - local59 * this.anIntArray645[local53] >> 14;
								this.anIntArray645[local53] = local304;
							}
							if (arg3 != 0) {
								local59 = Class353.anIntArray681[arg3];
								local286 = Class353.anIntArray682[arg3];
								local304 = local286 * this.anIntArray645[local53] + this.anIntArray641[local53] * local59 + 16383 >> 14;
								this.anIntArray641[local53] = this.anIntArray641[local53] * local286 + 16383 - this.anIntArray645[local53] * local59 >> 14;
								this.anIntArray645[local53] = local304;
							}
							this.anIntArray645[local53] += Static524.anInt8750;
							this.anIntArray642[local53] += Static560.anInt9272;
							this.anIntArray641[local53] += Static35.anInt899;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray85.length) {
						local51 = this.anIntArrayArray85[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local286 = this.anIntArray640[local59];
							local304 = this.anIntArray640[local59 + 1];
							for (local755 = local286; local755 < local304; local755++) {
								local764 = this.aShortArray138[local755] - 1;
								if (local764 == -1) {
									break;
								}
								@Pc(777) int local777;
								@Pc(781) int local781;
								@Pc(800) int local800;
								if (arg4 != 0) {
									local777 = Class353.anIntArray681[arg4];
									local781 = Class353.anIntArray682[arg4];
									local800 = local777 * this.aShortArray131[local764] + this.aShortArray129[local764] * local781 + 16383 >> 14;
									this.aShortArray131[local764] = (short) (local781 * this.aShortArray131[local764] + 16383 - local777 * this.aShortArray129[local764] >> 14);
									this.aShortArray129[local764] = (short) local800;
								}
								if (arg2 != 0) {
									local777 = Class353.anIntArray681[arg2];
									local781 = Class353.anIntArray682[arg2];
									local800 = local781 * this.aShortArray131[local764] + 16383 - local777 * this.aShortArray133[local764] >> 14;
									this.aShortArray133[local764] = (short) (local781 * this.aShortArray133[local764] + this.aShortArray131[local764] * local777 + 16383 >> 14);
									this.aShortArray131[local764] = (short) local800;
								}
								if (arg3 != 0) {
									local777 = Class353.anIntArray681[arg3];
									local781 = Class353.anIntArray682[arg3];
									local800 = this.aShortArray129[local764] * local781 + local777 * this.aShortArray133[local764] + 16383 >> 14;
									this.aShortArray133[local764] = (short) (this.aShortArray133[local764] * local781 + 16383 - local777 * this.aShortArray129[local764] >> 14);
									this.aShortArray129[local764] = (short) local800;
								}
							}
						}
					}
				}
				this.method7745();
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray85.length) {
					local163 = this.anIntArrayArray85[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local53 = local163[local165];
						this.anIntArray645[local53] -= Static524.anInt8750;
						this.anIntArray642[local53] -= Static560.anInt9272;
						this.anIntArray641[local53] -= Static35.anInt899;
						this.anIntArray645[local53] = arg2 * this.anIntArray645[local53] >> 7;
						this.anIntArray642[local53] = this.anIntArray642[local53] * arg3 >> 7;
						this.anIntArray641[local53] = this.anIntArray641[local53] * arg4 >> 7;
						this.anIntArray645[local53] += Static524.anInt8750;
						this.anIntArray642[local53] += Static560.anInt9272;
						this.anIntArray641[local53] += Static35.anInt899;
					}
				}
			}
		} else {
			@Pc(1202) Class177 local1202;
			@Pc(1105) boolean local1105;
			@Pc(1197) Class288 local1197;
			if (arg0 == 5) {
				if (this.anIntArrayArray86 != null) {
					local1105 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray86.length) {
							local51 = this.anIntArrayArray86[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local286 = (this.aByteArray96[local59] & 0xFF) + arg2 * 8;
								if (local286 < 0) {
									local286 = 0;
								} else if (local286 > 255) {
									local286 = 255;
								}
								this.aByteArray96[local59] = (byte) local286;
							}
							local1105 |= local51.length > 0;
						}
					}
					if (local1105) {
						if (this.aClass288Array1 != null) {
							for (local41 = 0; local41 < this.anInt9206; local41++) {
								local1197 = this.aClass288Array1[local41];
								local1202 = this.aClass177Array1[local41];
								local1202.anInt5145 = local1202.anInt5145 & 0xFFFFFF | 255 - (this.aByteArray96[local1197.anInt8261] & 0xFF) << 24;
							}
						}
						this.method7750();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray86 != null) {
					local1105 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray86.length) {
							local51 = this.anIntArrayArray86[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local286 = this.aShortArray135[local59] & 0xFFFF;
								local304 = local286 >> 10 & 0x3F;
								local755 = local286 >> 7 & 0x7;
								local755 += arg3 / 4;
								local764 = local286 & 0x7F;
								@Pc(1306) int local1306 = local304 + arg2 & 0x3F;
								local764 += arg4;
								if (local755 < 0) {
									local755 = 0;
								} else if (local755 > 7) {
									local755 = 7;
								}
								if (local764 < 0) {
									local764 = 0;
								} else if (local764 > 127) {
									local764 = 127;
								}
								this.aShortArray135[local59] = (short) (local764 | local755 << 7 | local1306 << 10);
							}
							local1105 |= local51.length > 0;
						}
					}
					if (local1105) {
						if (this.aClass288Array1 != null) {
							for (local41 = 0; local41 < this.anInt9206; local41++) {
								local1197 = this.aClass288Array1[local41];
								local1202 = this.aClass177Array1[local41];
								local1202.anInt5145 = Static349.anIntArray394[this.aShortArray135[local1197.anInt8261] & 0xFFFF] & 0xFFFFFF | local1202.anInt5145 & 0xFF000000;
							}
						}
						this.method7750();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray87 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray87.length > local35) {
							local163 = this.anIntArrayArray87[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1202 = this.aClass177Array1[local163[local165]];
								local1202.anInt5138 += arg2;
								local1202.anInt5139 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray87 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray87.length > local35) {
							local163 = this.anIntArrayArray87[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1202 = this.aClass177Array1[local163[local165]];
								local1202.anInt5142 = arg2 * local1202.anInt5142 >> 7;
								local1202.anInt5144 = arg3 * local1202.anInt5144 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray87 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray87.length) {
						local163 = this.anIntArrayArray87[local35];
						for (local165 = 0; local165 < local163.length; local165++) {
							local1202 = this.aClass177Array1[local163[local165]];
							local1202.anInt5140 = local1202.anInt5140 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)V")
	private void method7745() {
		if ((this.anInt9186 & 0x37) == 0) {
			if (this.aClass293_3 != null) {
				this.aClass293_3.aBoolean621 = false;
			}
		} else if (this.aClass293_1 != null) {
			this.aClass293_1.aBoolean621 = false;
		}
	}

	@OriginalMember(owner = "client!tv", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9189; local7++) {
			if (arg0 != 0) {
				this.anIntArray645[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray642[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray641[local7] += arg2;
			}
		}
		this.method7747();
		this.aBoolean678 = false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!jt;)V")
	private void method7746(@OriginalArg(1) Class2_Sub5_Sub12_Sub1 arg0) {
		if (this.anInt9193 > Static35.anIntArray103.length) {
			Static456.anIntArray543 = new int[this.anInt9193];
			Static35.anIntArray103 = new int[this.anInt9193];
		}
		@Pc(55) int local55;
		@Pc(94) int local94;
		@Pc(103) int local103;
		for (@Pc(30) int local30 = 0; local30 < this.anInt9189; local30++) {
			local55 = (this.anIntArray645[local30] - (this.anIntArray642[local30] * this.aClass87_Sub1_21.anInt6126 >> 8) >> this.aClass87_Sub1_21.anInt6129) - arg0.anInt5313;
			@Pc(80) int local80 = (this.anIntArray641[local30] - (this.anIntArray642[local30] * this.aClass87_Sub1_21.anInt6118 >> 8) >> this.aClass87_Sub1_21.anInt6129) - arg0.anInt5312;
			@Pc(85) int local85 = this.anIntArray640[local30];
			@Pc(92) int local92 = this.anIntArray640[local30 + 1];
			for (local94 = local85; local94 < local92; local94++) {
				local103 = this.aShortArray138[local94] - 1;
				if (local103 == -1) {
					break;
				}
				Static35.anIntArray103[local103] = local55;
				Static456.anIntArray543[local103] = local80;
			}
		}
		for (local55 = 0; local55 < this.anInt9252; local55++) {
			if (this.aByteArray96 == null || this.aByteArray96[local55] <= 128) {
				@Pc(149) short local149 = this.aShortArray134[local55];
				@Pc(154) short local154 = this.aShortArray136[local55];
				@Pc(159) short local159 = this.aShortArray130[local55];
				local94 = Static35.anIntArray103[local149];
				local103 = Static35.anIntArray103[local154];
				@Pc(171) int local171 = Static35.anIntArray103[local159];
				@Pc(175) int local175 = Static456.anIntArray543[local149];
				@Pc(179) int local179 = Static456.anIntArray543[local154];
				@Pc(183) int local183 = Static456.anIntArray543[local159];
				if ((local179 - local183) * (-local103 + local94) - (local179 - local175) * (local171 + -local103) > 0) {
					arg0.method4441(local103, local94, local171, local175, local183, local179);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "()V")
	@Override
	public void method7727() {
		if (this.anInt9193 > 0 && this.anInt9252 > 0) {
			this.method7748();
			this.method7736();
			this.method7738();
		}
	}

	@OriginalMember(owner = "client!tv", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface6 local9 = this.aClass87_Sub1_21.anInterface6_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt9228; local11++) {
			if (arg0 == this.aShortArray132[local11]) {
				this.aShortArray132[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class199 local47 = local9.method6357(arg0 & 0xFFFF);
			local35 = local47.aByte84;
			local37 = local47.aByte83;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class199 local68 = local9.method6357(arg1 & 0xFFFF);
			local57 = local68.aByte83;
			if (local68.aByte88 != 0 || local68.aByte87 != 0) {
				this.aBoolean679 = true;
			}
			local55 = local68.aByte84;
		}
		if (!(local35 != local55 | local57 != local37)) {
			return;
		}
		if (this.aClass288Array1 != null) {
			for (@Pc(112) int local112 = 0; local112 < this.anInt9206; local112++) {
				@Pc(119) Class288 local119 = this.aClass288Array1[local112];
				@Pc(124) Class177 local124 = this.aClass177Array1[local112];
				local124.anInt5145 = local124.anInt5145 & 0xFF000000 | Static349.anIntArray394[this.aShortArray135[local119.anInt8261] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7750();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7726(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class25_Sub3 local8 = (Class25_Sub3) arg0;
		if (this.anInt9228 == 0 || local8.anInt9228 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt9189;
		@Pc(24) int[] local24 = local8.anIntArray645;
		@Pc(27) int[] local27 = local8.anIntArray642;
		@Pc(30) int[] local30 = local8.anIntArray641;
		@Pc(33) short[] local33 = local8.aShortArray129;
		@Pc(36) short[] local36 = local8.aShortArray131;
		@Pc(39) short[] local39 = local8.aShortArray133;
		@Pc(42) byte[] local42 = local8.aByteArray95;
		@Pc(49) short[] local49;
		@Pc(53) short[] local53;
		@Pc(51) short[] local51;
		@Pc(47) byte[] local47;
		if (this.aClass237_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local51 = this.aClass237_1.aShortArray89;
			local49 = this.aClass237_1.aShortArray90;
			local47 = this.aClass237_1.aByteArray69;
			local53 = this.aClass237_1.aShortArray91;
		}
		@Pc(78) short[] local78;
		@Pc(80) short[] local80;
		@Pc(82) short[] local82;
		@Pc(76) byte[] local76;
		if (local8.aClass237_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local78 = local8.aClass237_1.aShortArray90;
			local76 = local8.aClass237_1.aByteArray69;
			local82 = local8.aClass237_1.aShortArray89;
			local80 = local8.aClass237_1.aShortArray91;
		}
		@Pc(103) int[] local103 = local8.anIntArray640;
		@Pc(106) short[] local106 = local8.aShortArray138;
		if (!local8.aBoolean678) {
			local8.method7744();
		}
		@Pc(115) int local115 = local8.anInt9243;
		@Pc(118) int local118 = local8.anInt9217;
		@Pc(121) int local121 = local8.anInt9224;
		@Pc(124) int local124 = local8.anInt9195;
		@Pc(127) int local127 = local8.anInt9212;
		@Pc(130) int local130 = local8.anInt9249;
		for (@Pc(132) int local132 = 0; local132 < this.anInt9189; local132++) {
			@Pc(142) int local142 = this.anIntArray642[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(165) int local165 = this.anIntArray645[local132] - arg1;
				if (local121 <= local165 && local165 <= local124) {
					@Pc(185) int local185 = this.anIntArray641[local132] - arg3;
					if (local127 <= local185 && local130 >= local185) {
						@Pc(203) int local203 = -1;
						@Pc(208) int local208 = this.anIntArray640[local132];
						@Pc(215) int local215 = this.anIntArray640[local132 + 1];
						for (@Pc(217) int local217 = local208; local217 < local215; local217++) {
							local203 = this.aShortArray138[local217] - 1;
							if (local203 == -1 || this.aByteArray95[local203] != 0) {
								break;
							}
						}
						if (local203 != -1) {
							for (@Pc(253) int local253 = 0; local253 < local21; local253++) {
								if (local165 == local24[local253] && local185 == local30[local253] && local142 == local27[local253]) {
									local208 = local103[local253];
									@Pc(280) int local280 = -1;
									local215 = local103[local253 + 1];
									for (@Pc(288) int local288 = local208; local288 < local215; local288++) {
										local280 = local106[local288] - 1;
										if (local280 == -1 || local42[local280] != 0) {
											break;
										}
									}
									if (local280 != -1) {
										if (local49 == null) {
											this.aClass237_1 = new Class237();
											local49 = this.aClass237_1.aShortArray90 = Static491.method7029(this.aShortArray129);
											local53 = this.aClass237_1.aShortArray91 = Static491.method7029(this.aShortArray131);
											local51 = this.aClass237_1.aShortArray89 = Static491.method7029(this.aShortArray133);
											local47 = this.aClass237_1.aByteArray69 = Static43.method860(this.aByteArray95);
										}
										if (local78 == null) {
											@Pc(369) Class237 local369 = local8.aClass237_1 = new Class237();
											local78 = local369.aShortArray90 = Static491.method7029(local33);
											local80 = local369.aShortArray91 = Static491.method7029(local36);
											local82 = local369.aShortArray89 = Static491.method7029(local39);
											local76 = local369.aByteArray69 = Static43.method860(local42);
										}
										@Pc(402) short local402 = this.aShortArray129[local203];
										@Pc(407) short local407 = this.aShortArray131[local203];
										@Pc(412) short local412 = this.aShortArray133[local203];
										local208 = local103[local253];
										@Pc(421) byte local421 = this.aByteArray95[local203];
										local215 = local103[local253 + 1];
										@Pc(437) int local437;
										for (@Pc(429) int local429 = local208; local429 < local215; local429++) {
											local437 = local106[local429] - 1;
											if (local437 == -1) {
												break;
											}
											if (local76[local437] != 0) {
												local78[local437] += local402;
												local80[local437] += local407;
												local82[local437] += local412;
												local76[local437] += local421;
											}
										}
										local407 = local36[local280];
										local412 = local39[local280];
										local421 = local42[local280];
										local208 = this.anIntArray640[local132];
										local215 = this.anIntArray640[local132 + 1];
										local402 = local33[local280];
										for (local437 = local208; local437 < local215; local437++) {
											@Pc(523) int local523 = this.aShortArray138[local437] - 1;
											if (local523 == -1) {
												break;
											}
											if (local47[local523] != 0) {
												local49[local523] += local402;
												local53[local523] += local407;
												local51[local523] += local412;
												local47[local523] += local421;
											}
										}
										local8.method7745();
										this.method7745();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	private void method7747() {
		if (this.aClass293_4 != null) {
			this.aClass293_4.aBoolean621 = false;
		}
	}

	@OriginalMember(owner = "client!tv", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray85 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt9255; local12++) {
			this.anIntArray645[local12] <<= 0x4;
			this.anIntArray642[local12] <<= 0x4;
			this.anIntArray641[local12] <<= 0x4;
		}
		Static524.anInt8750 = 0;
		Static35.anInt899 = 0;
		Static560.anInt9272 = 0;
		return true;
	}

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "(I)Z")
	private boolean method7748() {
		@Pc(19) boolean local19 = !this.aClass293_3.aBoolean621;
		@Pc(32) boolean local32 = (this.anInt9186 & 0x37) != 0 && !this.aClass293_1.aBoolean621;
		@Pc(40) boolean local40 = !this.aClass293_4.aBoolean621;
		@Pc(48) boolean local48 = !this.aClass293_2.aBoolean621;
		if (!local40 && !local19 && !local32 && !local48) {
			return true;
		}
		@Pc(60) boolean local60 = true;
		@Pc(79) Interface3 local79;
		@Pc(93) Buffer local93;
		if (local40) {
			if (this.aClass293_4.anInterface3_18 == null) {
				this.aClass293_4.anInterface3_18 = this.aClass87_Sub1_21.method5043(this.aBoolean675);
			}
			local79 = this.aClass293_4.anInterface3_18;
			local79.method7186(12, this.anInt9193 * 12);
			local93 = local79.method7189();
			if (local93 == null) {
				local60 = false;
			} else {
				this.aClass87_Sub1_21.aNativeInterface3.copyPositions(this.anIntArray645, this.anIntArray642, this.anIntArray641, this.aShortArray139, 0, 12, this.anInt9193, local93.getAddress());
				if (local79.method7187()) {
					this.aClass293_4.anInterface3_17 = local79;
					this.aClass293_4.aBoolean621 = true;
				} else {
					local60 = false;
				}
			}
		}
		@Pc(217) short[] local217;
		@Pc(214) short[] local214;
		@Pc(211) short[] local211;
		@Pc(208) byte[] local208;
		if (local19) {
			if (this.aClass293_3.anInterface3_18 == null) {
				this.aClass293_3.anInterface3_18 = this.aClass87_Sub1_21.method5043(this.aBoolean675);
			}
			local79 = this.aClass293_3.anInterface3_18;
			local79.method7186(4, this.anInt9193 * 4);
			local93 = local79.method7189();
			if (local93 == null) {
				local60 = false;
			} else {
				if ((this.anInt9186 & 0x37) == 0) {
					if (this.aClass237_1 == null) {
						local208 = this.aByteArray95;
						local211 = this.aShortArray133;
						local214 = this.aShortArray131;
						local217 = this.aShortArray129;
					} else {
						local211 = this.aClass237_1.aShortArray89;
						local208 = this.aClass237_1.aByteArray69;
						local214 = this.aClass237_1.aShortArray91;
						local217 = this.aClass237_1.aShortArray90;
					}
					this.aClass87_Sub1_21.aNativeInterface3.copyLighting(this.aShortArray135, this.aByteArray96, this.aShortArray132, local217, local214, local211, local208, this.aShort114, this.aShort115, this.aShortArray137, 0, 4, this.anInt9193, local93.getAddress());
				} else {
					this.aClass87_Sub1_21.aNativeInterface3.copyColours(this.aShortArray135, this.aByteArray96, this.aShortArray132, this.aShort114, this.aShortArray137, 0, 4, this.anInt9193, local93.getAddress());
				}
				if (local79.method7187()) {
					this.aClass293_3.aBoolean621 = true;
					this.aClass293_3.anInterface3_17 = local79;
				} else {
					local60 = false;
				}
			}
		}
		if (local32) {
			if (this.aClass293_1.anInterface3_18 == null) {
				this.aClass293_1.anInterface3_18 = this.aClass87_Sub1_21.method5043(this.aBoolean675);
			}
			local79 = this.aClass293_1.anInterface3_18;
			local79.method7186(12, this.anInt9193 * 12);
			local93 = local79.method7189();
			if (local93 == null) {
				local60 = false;
			} else {
				if (this.aClass237_1 == null) {
					local208 = this.aByteArray95;
					local214 = this.aShortArray131;
					local211 = this.aShortArray133;
					local217 = this.aShortArray129;
				} else {
					local211 = this.aClass237_1.aShortArray89;
					local214 = this.aClass237_1.aShortArray91;
					local217 = this.aClass237_1.aShortArray90;
					local208 = this.aClass237_1.aByteArray69;
				}
				this.aClass87_Sub1_21.aNativeInterface3.copyNormals(local217, local214, local211, local208, 3.0F / (float) this.aShort115, 3.0F / (float) (this.aShort115 + this.aShort115 / 2), 0, 12, this.anInt9193, local93.getAddress());
				if (local79.method7187()) {
					this.aClass293_1.anInterface3_17 = local79;
					this.aClass293_1.aBoolean621 = true;
				} else {
					local60 = false;
				}
			}
		}
		if (local48) {
			if (this.aClass293_2.anInterface3_18 == null) {
				this.aClass293_2.anInterface3_18 = this.aClass87_Sub1_21.method5043(this.aBoolean675);
			}
			local79 = this.aClass293_2.anInterface3_18;
			local79.method7186(8, this.anInt9193 * 8);
			local93 = local79.method7189();
			if (local93 == null) {
				local60 = false;
			} else {
				this.aClass87_Sub1_21.aNativeInterface3.copyTexCoords(this.aFloatArray70, this.aFloatArray69, 0, 8, this.anInt9193, local93.getAddress());
				if (local79.method7187()) {
					this.aClass293_2.aBoolean621 = true;
					this.aClass293_2.anInterface3_17 = local79;
				} else {
					local60 = false;
				}
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "(I)V")
	private void method7749() {
		if (this.aClass12_1 != null) {
			this.aClass12_1.aBoolean23 = false;
		}
	}

	@OriginalMember(owner = "client!tv", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean678) {
			this.method7744();
		}
		return this.anInt9195;
	}

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass293_4 != null) {
			this.aClass293_4.aBoolean622 = Static439.method6540(this.anInt9186, arg0);
		}
		if (this.aClass293_2 != null) {
			this.aClass293_2.aBoolean622 = Static461.method6714(arg0, this.anInt9186);
		}
		if (this.aClass293_3 != null) {
			this.aClass293_3.aBoolean622 = Static336.method5206(arg0, this.anInt9186);
		}
		if (this.aClass293_1 != null) {
			this.aClass293_1.aBoolean622 = Static633.method8493(this.anInt9186, arg0);
		}
		this.anInt9230 = arg0;
		if (this.aClass237_1 != null && (this.anInt9230 & 0x10000) == 0) {
			this.aShortArray129 = this.aClass237_1.aShortArray90;
			this.aShortArray131 = this.aClass237_1.aShortArray91;
			this.aByteArray95 = this.aClass237_1.aByteArray69;
			this.aShortArray133 = this.aClass237_1.aShortArray89;
			this.aClass237_1 = null;
		}
		this.aBoolean677 = true;
		this.method7738();
	}

	@OriginalMember(owner = "client!tv", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9228; local7++) {
			if (this.aShortArray135[local7] == arg0) {
				this.aShortArray135[local7] = arg1;
			}
		}
		if (this.aClass288Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt9206; local34++) {
				@Pc(41) Class288 local41 = this.aClass288Array1[local34];
				@Pc(46) Class177 local46 = this.aClass177Array1[local34];
				local46.anInt5145 = Static349.anIntArray394[this.aShortArray135[local41.anInt8261] & 0xFFFF] & 0xFFFFFF | local46.anInt5145 & 0xFF000000;
			}
		}
		this.method7750();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!kd;Lclient!ig;I)V")
	@Override
	public void method7735(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class11_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9193 == 0) {
			return;
		}
		@Pc(16) Class6_Sub2 local16 = this.aClass87_Sub1_21.aClass6_Sub2_16;
		@Pc(19) Class6_Sub2 local19 = (Class6_Sub2) arg0;
		if (!this.aBoolean678) {
			this.method7744();
		}
		Static249.aFloat115 = local19.aFloat74 * local16.aFloat76 + local19.aFloat80 * local16.aFloat77 + local16.aFloat74 * local19.aFloat82;
		Static261.aFloat121 = local16.aFloat77 * local19.aFloat78 + local16.aFloat74 * local19.aFloat75 + local19.aFloat72 * local16.aFloat76 + local16.aFloat72;
		@Pc(72) float local72 = Static249.aFloat115 * (float) this.anInt9243 + Static261.aFloat121;
		@Pc(80) float local80 = Static261.aFloat121 + (float) this.anInt9217 * Static249.aFloat115;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local97 = (float) -this.anInt9213 + local80;
			local90 = local72 + (float) this.anInt9213;
		} else {
			local90 = local80 + (float) this.anInt9213;
			local97 = (float) -this.anInt9213 + local72;
		}
		if (local97 >= this.aClass87_Sub1_21.aFloat139 || (float) this.aClass87_Sub1_21.anInt6146 >= local90) {
			return;
		}
		Static199.aFloat111 = local16.aFloat71 * local19.aFloat74 + local19.aFloat82 * local16.aFloat80 + local19.aFloat80 * local16.aFloat81;
		Static644.aFloat225 = local16.aFloat78 + local16.aFloat71 * local19.aFloat72 + local19.aFloat75 * local16.aFloat80 + local19.aFloat78 * local16.aFloat81;
		@Pc(174) float local174 = Static644.aFloat225 + Static199.aFloat111 * (float) this.anInt9243;
		@Pc(182) float local182 = Static644.aFloat225 + Static199.aFloat111 * (float) this.anInt9217;
		@Pc(208) float local208;
		@Pc(197) float local197;
		if (local182 < local174) {
			local197 = (float) this.aClass87_Sub1_21.anInt6144 * ((float) this.anInt9213 + local174);
			local208 = (local182 - (float) this.anInt9213) * (float) this.aClass87_Sub1_21.anInt6144;
		} else {
			local197 = (float) this.aClass87_Sub1_21.anInt6144 * ((float) this.anInt9213 + local182);
			local208 = (local174 - (float) this.anInt9213) * (float) this.aClass87_Sub1_21.anInt6144;
		}
		if (this.aClass87_Sub1_21.aFloat142 <= local208 / local90 || this.aClass87_Sub1_21.aFloat146 >= local197 / local90) {
			return;
		}
		Static151.aFloat85 = local16.aFloat75 + local19.aFloat75 * local16.aFloat82 + local19.aFloat78 * local16.aFloat73 + local19.aFloat72 * local16.aFloat79;
		Static34.aFloat22 = local19.aFloat74 * local16.aFloat79 + local16.aFloat73 * local19.aFloat80 + local16.aFloat82 * local19.aFloat82;
		@Pc(297) float local297 = Static151.aFloat85 + (float) this.anInt9243 * Static34.aFloat22;
		@Pc(305) float local305 = Static151.aFloat85 + (float) this.anInt9217 * Static34.aFloat22;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local305 < local297) {
			local320 = (float) this.aClass87_Sub1_21.anInt6150 * (local305 - (float) this.anInt9213);
			local331 = (float) this.aClass87_Sub1_21.anInt6150 * (local297 + (float) this.anInt9213);
		} else {
			local320 = (local297 - (float) this.anInt9213) * (float) this.aClass87_Sub1_21.anInt6150;
			local331 = (local305 + (float) this.anInt9213) * (float) this.aClass87_Sub1_21.anInt6150;
		}
		if (this.aClass87_Sub1_21.aFloat136 <= local320 / local90 || local331 / local90 <= this.aClass87_Sub1_21.aFloat133) {
			return;
		}
		if (arg1 != null || this.aClass288Array1 != null) {
			Static394.aFloat163 = local19.aFloat73 * local16.aFloat80 + local16.aFloat81 * local19.aFloat81 + local19.aFloat77 * local16.aFloat71;
			Static106.aFloat221 = local19.aFloat77 * local16.aFloat79 + local16.aFloat73 * local19.aFloat81 + local16.aFloat82 * local19.aFloat73;
			Static643.aFloat224 = local19.aFloat71 * local16.aFloat77 + local16.aFloat74 * local19.aFloat79 + local19.aFloat76 * local16.aFloat76;
			Static147.aFloat83 = local19.aFloat76 * local16.aFloat71 + local16.aFloat80 * local19.aFloat79 + local19.aFloat71 * local16.aFloat81;
			Static344.aFloat151 = local16.aFloat73 * local19.aFloat71 + local16.aFloat82 * local19.aFloat79 + local19.aFloat76 * local16.aFloat79;
			Static56.aFloat25 = local16.aFloat76 * local19.aFloat77 + local16.aFloat77 * local19.aFloat81 + local19.aFloat73 * local16.aFloat74;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.anInt9195 + this.anInt9224 >> 1;
			@Pc(509) int local509 = this.anInt9212 + this.anInt9249 >> 1;
			@Pc(528) int local528 = (int) (Static644.aFloat225 + Static394.aFloat163 * (float) local500 + (float) this.anInt9243 * Static199.aFloat111 + (float) local509 * Static147.aFloat83);
			@Pc(547) int local547 = (int) (Static151.aFloat85 + (float) local500 * Static106.aFloat221 + (float) this.anInt9243 * Static34.aFloat22 + (float) local509 * Static344.aFloat151);
			@Pc(566) int local566 = (int) ((float) this.anInt9243 * Static249.aFloat115 + Static261.aFloat121 + Static56.aFloat25 * (float) local500 + Static643.aFloat224 * (float) local509);
			if (local566 < this.aClass87_Sub1_21.anInt6146) {
				local490 = true;
			} else {
				arg1.anInt4698 = local528 * this.aClass87_Sub1_21.anInt6144 / local566 + this.aClass87_Sub1_21.anInt6121;
				arg1.anInt4696 = this.aClass87_Sub1_21.anInt6134 + this.aClass87_Sub1_21.anInt6150 * local547 / local566;
			}
			@Pc(621) int local621 = (int) (Static199.aFloat111 * (float) this.anInt9217 + (float) local500 * Static394.aFloat163 + Static644.aFloat225 + (float) local509 * Static147.aFloat83);
			@Pc(640) int local640 = (int) (Static344.aFloat151 * (float) local509 + Static34.aFloat22 * (float) this.anInt9217 + Static151.aFloat85 + (float) local500 * Static106.aFloat221);
			@Pc(659) int local659 = (int) ((float) local500 * Static56.aFloat25 + Static261.aFloat121 + Static249.aFloat115 * (float) this.anInt9217 + Static643.aFloat224 * (float) local509);
			if (local659 >= this.aClass87_Sub1_21.anInt6146) {
				arg1.anInt4699 = this.aClass87_Sub1_21.anInt6121 + local621 * this.aClass87_Sub1_21.anInt6144 / local659;
				arg1.anInt4697 = this.aClass87_Sub1_21.anInt6134 + this.aClass87_Sub1_21.anInt6150 * local640 / local659;
			} else {
				local490 = true;
			}
			if (local490) {
				if (local566 < this.aClass87_Sub1_21.anInt6146 && this.aClass87_Sub1_21.anInt6146 > local659) {
					local492 = false;
				} else {
					@Pc(741) int local741;
					@Pc(753) int local753;
					@Pc(779) int local779;
					if (local566 < this.aClass87_Sub1_21.anInt6146) {
						local741 = (local659 - this.aClass87_Sub1_21.anInt6146 << 16) / (local659 - local566);
						local753 = local621 + (local741 * (local621 - local528) >> 16);
						arg1.anInt4698 = local753 * this.aClass87_Sub1_21.anInt6144 / this.aClass87_Sub1_21.anInt6146 + this.aClass87_Sub1_21.anInt6121;
						local779 = (local741 * (local640 - local547) >> 16) + local640;
						arg1.anInt4696 = local779 * this.aClass87_Sub1_21.anInt6150 / this.aClass87_Sub1_21.anInt6146 + this.aClass87_Sub1_21.anInt6134;
					} else if (local659 < this.aClass87_Sub1_21.anInt6146) {
						local741 = (local566 - this.aClass87_Sub1_21.anInt6146 << 16) / (local566 - local659);
						local753 = local528 + (local741 * (local528 - local621) >> 16);
						arg1.anInt4698 = local753 * this.aClass87_Sub1_21.anInt6144 / this.aClass87_Sub1_21.anInt6146 + this.aClass87_Sub1_21.anInt6121;
						local779 = local547 + ((local547 - local640) * local741 >> 16);
						arg1.anInt4696 = this.aClass87_Sub1_21.anInt6134 + local779 * this.aClass87_Sub1_21.anInt6150 / this.aClass87_Sub1_21.anInt6146;
					}
				}
			}
			if (local492) {
				if (local659 < local566) {
					arg1.anInt4700 = this.aClass87_Sub1_21.anInt6121 + (this.anInt9213 + local528) * this.aClass87_Sub1_21.anInt6144 / local566 - arg1.anInt4698;
				} else {
					arg1.anInt4700 = this.aClass87_Sub1_21.anInt6121 + this.aClass87_Sub1_21.anInt6144 * (this.anInt9213 + local621) / local659 - arg1.anInt4699;
				}
				arg1.aBoolean391 = true;
			}
		}
		this.aClass87_Sub1_21.method5124();
		this.aClass87_Sub1_21.method5107(local19);
		this.method7739();
		this.method7740();
	}

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class112 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean678) {
			this.method7744();
		}
		@Pc(17) int local17 = arg4 + this.anInt9224;
		@Pc(23) int local23 = arg4 + this.anInt9195;
		@Pc(29) int local29 = arg6 + this.anInt9212;
		@Pc(34) int local34 = arg6 + this.anInt9249;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt9344 + local23 >> arg2.anInt9341 >= arg2.anInt9348 || local29 < 0 || arg2.anInt9344 + local34 >> arg2.anInt9341 >= arg2.anInt9340)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt9348 <= local23 + arg3.anInt9344 >> arg3.anInt9341 || local29 < 0 || arg3.anInt9340 <= arg3.anInt9344 + local34 >> arg3.anInt9341) {
				return;
			}
		} else {
			local17 >>= arg2.anInt9341;
			local23 = local23 + arg2.anInt9344 - 1 >> arg2.anInt9341;
			local29 >>= arg2.anInt9341;
			local34 = arg2.anInt9344 + local34 - 1 >> arg2.anInt9341;
			if (arg5 == arg2.method7819(local29, local17) && arg5 == arg2.method7819(local29, local23) && arg5 == arg2.method7819(local34, local17) && arg2.method7819(local34, local23) == arg5) {
				return;
			}
		}
		@Pc(210) int local210;
		if (arg0 == 1) {
			for (local210 = 0; local210 < this.anInt9189; local210++) {
				this.anIntArray642[local210] = this.anIntArray642[local210] + arg2.method7826(this.anIntArray645[local210] + arg4, arg6 + this.anIntArray641[local210]) - arg5;
			}
		} else {
			@Pc(218) int local218;
			@Pc(226) int local226;
			if (arg0 == 2) {
				local210 = this.anInt9243;
				if (local210 == 0) {
					return;
				}
				for (local218 = 0; local218 < this.anInt9189; local218++) {
					local226 = (this.anIntArray642[local218] << 16) / local210;
					if (arg1 > local226) {
						this.anIntArray642[local218] += (arg1 - local226) * (arg2.method7826(this.anIntArray645[local218] + arg4, this.anIntArray641[local218] + arg6) - arg5) / arg1;
					}
				}
			} else {
				@Pc(234) int local234;
				if (arg0 == 3) {
					local210 = (arg1 & 0xFF) * 4;
					local218 = (arg1 >> 8 & 0xFF) * 4;
					local226 = (arg1 >> 16 & 0xFF) << 6;
					local234 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local210 >> 1) < 0 || (local210 >> 1) + arg4 + arg2.anInt9344 >= arg2.anInt9348 << arg2.anInt9341 || arg6 - (local218 >> 1) < 0 || arg2.anInt9340 << arg2.anInt9341 <= arg6 + (local218 >> 1) + arg2.anInt9344) {
						return;
					}
					this.method7728(local226, local218, arg2, local234, arg6, local210, arg5, arg4);
				} else if (arg0 == 4) {
					local210 = this.anInt9217 - this.anInt9243;
					for (local218 = 0; local218 < this.anInt9189; local218++) {
						this.anIntArray642[local218] = local210 + this.anIntArray642[local218] + arg3.method7826(this.anIntArray645[local218] + arg4, arg6 + this.anIntArray641[local218]) - arg5;
					}
				} else if (arg0 == 5) {
					local210 = this.anInt9217 - this.anInt9243;
					for (local218 = 0; local218 < this.anInt9189; local218++) {
						local226 = arg4 + this.anIntArray645[local218];
						local234 = this.anIntArray641[local218] + arg6;
						@Pc(390) int local390 = arg2.method7826(local226, local234);
						@Pc(396) int local396 = arg3.method7826(local226, local234);
						@Pc(403) int local403 = local390 - local396 - arg1;
						this.anIntArray642[local218] = local390 + ((this.anIntArray642[local218] << 8) / local210 * local403 >> 8) - arg5;
					}
				}
			}
		}
		this.method7747();
		this.aBoolean678 = false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!kd;ZI)Z")
	@Override
	public boolean method7721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7741(-1, arg4, arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!tv", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class353.anIntArray681[arg0];
		@Pc(13) int local13 = Class353.anIntArray682[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9189; local15++) {
			@Pc(34) int local34 = this.anIntArray642[local15] * local13 - local9 * this.anIntArray641[local15] >> 14;
			this.anIntArray641[local15] = this.anIntArray642[local15] * local9 + local13 * this.anIntArray641[local15] >> 14;
			this.anIntArray642[local15] = local34;
		}
		this.method7747();
		this.aBoolean678 = false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!kd;IZ)V")
	@Override
	public void method7734(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray140 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt9189; local14++) {
			if ((arg1 & this.aShortArray140[local14]) != 0) {
				if (arg2) {
					arg0.method6713(this.anIntArray645[local14], this.anIntArray642[local14], this.anIntArray641[local14], local12);
				} else {
					arg0.method6702(this.anIntArray645[local14], this.anIntArray642[local14], this.anIntArray641[local14], local12);
				}
				this.anIntArray645[local14] = local12[0];
				this.anIntArray642[local14] = local12[1];
				this.anIntArray641[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class353.anIntArray681[arg0];
		@Pc(13) int local13 = Class353.anIntArray682[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9189; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray641[local15] + this.anIntArray645[local15] * local13 >> 14;
			this.anIntArray641[local15] = this.anIntArray641[local15] * local13 - this.anIntArray645[local15] * local9 >> 14;
			this.anIntArray645[local15] = local34;
		}
		this.method7747();
		this.aBoolean678 = false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt9228; local7++) {
			local16 = this.aShortArray135[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			@Pc(59) int local59 = local16 & 0x7F;
			if (arg2 != -1) {
				local59 -= -(arg3 * (arg2 - local59) >> 7);
			}
			this.aShortArray135[local7] = (short) (local59 | local28 << 7 | local22 << 10);
		}
		if (this.aClass288Array1 != null) {
			for (local16 = 0; local16 < this.anInt9206; local16++) {
				@Pc(109) Class288 local109 = this.aClass288Array1[local16];
				@Pc(114) Class177 local114 = this.aClass177Array1[local16];
				local114.anInt5145 = local114.anInt5145 & 0xFF000000 | Static349.anIntArray394[this.aShortArray135[local109.anInt8261] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method7750();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!kd;Lclient!ig;II)V")
	@Override
	public void method7725(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class11_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9193 == 0) {
			return;
		}
		@Pc(13) Class6_Sub2 local13 = this.aClass87_Sub1_21.aClass6_Sub2_16;
		if (!this.aBoolean678) {
			this.method7744();
		}
		@Pc(22) Class6_Sub2 local22 = (Class6_Sub2) arg0;
		Static249.aFloat115 = local22.aFloat74 * local13.aFloat76 + local13.aFloat74 * local22.aFloat82 + local22.aFloat80 * local13.aFloat77;
		Static261.aFloat121 = local13.aFloat72 + local13.aFloat76 * local22.aFloat72 + local22.aFloat75 * local13.aFloat74 + local22.aFloat78 * local13.aFloat77;
		@Pc(69) float local69 = Static261.aFloat121 + (float) this.anInt9243 * Static249.aFloat115;
		@Pc(77) float local77 = Static261.aFloat121 + Static249.aFloat115 * (float) this.anInt9217;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local94 = local77 - (float) this.anInt9213;
			local87 = (float) this.anInt9213 + local69;
		} else {
			local87 = (float) this.anInt9213 + local77;
			local94 = (float) -this.anInt9213 + local69;
		}
		if (this.aClass87_Sub1_21.aFloat141 <= local94 || (float) this.aClass87_Sub1_21.anInt6146 >= local87) {
			return;
		}
		Static644.aFloat225 = local13.aFloat71 * local22.aFloat72 + local22.aFloat78 * local13.aFloat81 + local13.aFloat80 * local22.aFloat75 + local13.aFloat78;
		Static199.aFloat111 = local22.aFloat74 * local13.aFloat71 + local22.aFloat80 * local13.aFloat81 + local22.aFloat82 * local13.aFloat80;
		@Pc(170) float local170 = Static644.aFloat225 + Static199.aFloat111 * (float) this.anInt9243;
		@Pc(178) float local178 = Static644.aFloat225 + (float) this.anInt9217 * Static199.aFloat111;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local178 < local170) {
			local193 = (local178 - (float) this.anInt9213) * (float) this.aClass87_Sub1_21.anInt6144;
			local204 = (local170 + (float) this.anInt9213) * (float) this.aClass87_Sub1_21.anInt6144;
		} else {
			local193 = (float) this.aClass87_Sub1_21.anInt6144 * (local170 - (float) this.anInt9213);
			local204 = (float) this.aClass87_Sub1_21.anInt6144 * ((float) this.anInt9213 + local178);
		}
		if (this.aClass87_Sub1_21.aFloat142 <= local193 / (float) arg2 || local204 / (float) arg2 <= this.aClass87_Sub1_21.aFloat146) {
			return;
		}
		Static151.aFloat85 = local22.aFloat72 * local13.aFloat79 + local13.aFloat73 * local22.aFloat78 + local13.aFloat82 * local22.aFloat75 + local13.aFloat75;
		Static34.aFloat22 = local22.aFloat82 * local13.aFloat82 + local22.aFloat80 * local13.aFloat73 + local13.aFloat79 * local22.aFloat74;
		@Pc(295) float local295 = Static151.aFloat85 + Static34.aFloat22 * (float) this.anInt9243;
		@Pc(303) float local303 = Static151.aFloat85 + Static34.aFloat22 * (float) this.anInt9217;
		@Pc(329) float local329;
		@Pc(318) float local318;
		if (local295 > local303) {
			local318 = (float) this.aClass87_Sub1_21.anInt6150 * (local295 + (float) this.anInt9213);
			local329 = (float) this.aClass87_Sub1_21.anInt6150 * (local303 - (float) this.anInt9213);
		} else {
			local329 = ((float) -this.anInt9213 + local295) * (float) this.aClass87_Sub1_21.anInt6150;
			local318 = (float) this.aClass87_Sub1_21.anInt6150 * (local303 + (float) this.anInt9213);
		}
		if (this.aClass87_Sub1_21.aFloat136 <= local329 / (float) arg2 || this.aClass87_Sub1_21.aFloat133 >= local318 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass288Array1 != null) {
			Static344.aFloat151 = local13.aFloat73 * local22.aFloat71 + local13.aFloat82 * local22.aFloat79 + local13.aFloat79 * local22.aFloat76;
			Static56.aFloat25 = local13.aFloat77 * local22.aFloat81 + local13.aFloat74 * local22.aFloat73 + local13.aFloat76 * local22.aFloat77;
			Static643.aFloat224 = local22.aFloat76 * local13.aFloat76 + local22.aFloat79 * local13.aFloat74 + local22.aFloat71 * local13.aFloat77;
			Static394.aFloat163 = local13.aFloat80 * local22.aFloat73 + local13.aFloat81 * local22.aFloat81 + local22.aFloat77 * local13.aFloat71;
			Static147.aFloat83 = local13.aFloat71 * local22.aFloat76 + local13.aFloat81 * local22.aFloat71 + local13.aFloat80 * local22.aFloat79;
			Static106.aFloat221 = local22.aFloat77 * local13.aFloat79 + local13.aFloat73 * local22.aFloat81 + local22.aFloat73 * local13.aFloat82;
		}
		if (arg1 != null) {
			@Pc(497) int local497 = this.anInt9195 + this.anInt9224 >> 1;
			@Pc(506) int local506 = this.anInt9212 + this.anInt9249 >> 1;
			@Pc(525) int local525 = (int) (Static147.aFloat83 * (float) local506 + (float) local497 * Static394.aFloat163 + Static644.aFloat225 + (float) this.anInt9243 * Static199.aFloat111);
			@Pc(544) int local544 = (int) ((float) local506 * Static344.aFloat151 + Static34.aFloat22 * (float) this.anInt9243 + Static151.aFloat85 + (float) local497 * Static106.aFloat221);
			@Pc(563) int local563 = (int) (Static643.aFloat224 * (float) local506 + (float) this.anInt9243 * Static249.aFloat115 + (float) local497 * Static56.aFloat25 + Static261.aFloat121);
			@Pc(582) int local582 = (int) (Static147.aFloat83 * (float) local506 + Static199.aFloat111 * (float) this.anInt9217 + Static644.aFloat225 + Static394.aFloat163 * (float) local497);
			@Pc(601) int local601 = (int) ((float) local506 * Static344.aFloat151 + (float) this.anInt9217 * Static34.aFloat22 + Static151.aFloat85 + (float) local497 * Static106.aFloat221);
			arg1.anInt4698 = this.aClass87_Sub1_21.anInt6121 + this.aClass87_Sub1_21.anInt6144 * local525 / arg2;
			@Pc(634) int local634 = (int) (Static643.aFloat224 * (float) local506 + Static249.aFloat115 * (float) this.anInt9217 + (float) local497 * Static56.aFloat25 + Static261.aFloat121);
			arg1.anInt4699 = this.aClass87_Sub1_21.anInt6144 * local582 / arg2 + this.aClass87_Sub1_21.anInt6121;
			arg1.anInt4697 = this.aClass87_Sub1_21.anInt6150 * local601 / arg2 + this.aClass87_Sub1_21.anInt6134;
			arg1.anInt4696 = this.aClass87_Sub1_21.anInt6150 * local544 / arg2 + this.aClass87_Sub1_21.anInt6134;
			if (local563 >= this.aClass87_Sub1_21.anInt6146 || local634 >= this.aClass87_Sub1_21.anInt6146) {
				arg1.aBoolean391 = true;
				arg1.anInt4700 = this.aClass87_Sub1_21.anInt6144 * (local525 + this.anInt9213) / arg2 + this.aClass87_Sub1_21.anInt6121 - arg1.anInt4698;
			}
		}
		this.aClass87_Sub1_21.method5020((float) arg2);
		this.aClass87_Sub1_21.method5041();
		this.aClass87_Sub1_21.method5107(local22);
		this.method7739();
		this.method7740();
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
	private void method7750() {
		if (this.aClass293_3 != null) {
			this.aClass293_3.aBoolean621 = false;
		}
	}

	@OriginalMember(owner = "client!tv", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean678) {
			this.method7744();
		}
		return this.anInt9249;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "()Z")
	@Override
	public boolean method7713() {
		if (this.aShortArray132 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray132.length; local12++) {
			if (this.aShortArray132[local12] != -1 && !this.aClass87_Sub1_21.anInterface6_11.method6355(this.aShortArray132[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIIZII)Z")
	private boolean method7751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg3 && arg5 > arg6 && arg6 < arg1) {
			return false;
		} else if (arg3 < arg6 && arg6 > arg5 && arg6 > arg1) {
			return false;
		} else if (arg2 > arg0 && arg0 < arg7 && arg4 > arg0) {
			return false;
		} else {
			return arg2 >= arg0 || arg0 <= arg7 || arg0 <= arg4;
		}
	}

	@OriginalMember(owner = "client!tv", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean678) {
			this.method7744();
		}
		return this.anInt9224;
	}

	@OriginalMember(owner = "client!tv", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort115;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class25 method7732(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class25_Sub3 local12;
		@Pc(16) Class25_Sub3 local16;
		if (arg0 == 1) {
			local12 = this.aClass87_Sub1_21.aClass25_Sub3_27;
			local16 = this.aClass87_Sub1_21.aClass25_Sub3_26;
		} else if (arg0 == 2) {
			local16 = this.aClass87_Sub1_21.aClass25_Sub3_29;
			local12 = this.aClass87_Sub1_21.aClass25_Sub3_22;
		} else if (arg0 == 3) {
			local12 = this.aClass87_Sub1_21.aClass25_Sub3_30;
			local16 = this.aClass87_Sub1_21.aClass25_Sub3_21;
		} else if (arg0 == 4) {
			local12 = this.aClass87_Sub1_21.aClass25_Sub3_24;
			local16 = this.aClass87_Sub1_21.aClass25_Sub3_28;
		} else if (arg0 == 5) {
			local12 = this.aClass87_Sub1_21.aClass25_Sub3_25;
			local16 = this.aClass87_Sub1_21.aClass25_Sub3_23;
		} else {
			local12 = local16 = new Class25_Sub3(this.aClass87_Sub1_21, 0, 0, true, false);
		}
		return this.method7742(arg0 != 0, local12, arg2, arg1, local16);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIFIIFIJLclient!ww;I)S")
	private short method7752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) Class379 arg9) {
		@Pc(10) int local10 = this.anIntArray640[arg7];
		@Pc(17) int local17 = this.anIntArray640[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(27) int local27 = local10; local27 < local17; local27++) {
			@Pc(34) short local34 = this.aShortArray138[local27];
			if (local34 == 0) {
				local19 = local27;
				break;
			}
			if (arg8 == Static353.aLongArray13[local27]) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray138[local19] = (short) (this.anInt9193 + 1);
		Static353.aLongArray13[local19] = arg8;
		this.aShortArray137[this.anInt9193] = (short) arg4;
		this.aShortArray139[this.anInt9193] = (short) arg7;
		this.aShortArray129[this.anInt9193] = (short) arg0;
		this.aShortArray131[this.anInt9193] = (short) arg2;
		this.aShortArray133[this.anInt9193] = (short) arg5;
		this.aByteArray95[this.anInt9193] = (byte) arg1;
		this.aFloatArray70[this.anInt9193] = arg6;
		this.aFloatArray69[this.anInt9193] = arg3;
		return (short) this.anInt9193++;
	}
}
