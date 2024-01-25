import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class193_Sub2 extends Class193 {

	@OriginalMember(owner = "client!nda", name = "v", descriptor = "I")
	private int anInt6512;

	@OriginalMember(owner = "client!nda", name = "H", descriptor = "Lclient!nj;")
	private Class241 aClass241_1;

	@OriginalMember(owner = "client!nda", name = "L", descriptor = "I")
	private int anInt6520;

	@OriginalMember(owner = "client!nda", name = "P", descriptor = "I")
	private int anInt6524;

	@OriginalMember(owner = "client!nda", name = "Q", descriptor = "Lclient!cja;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!nda", name = "X", descriptor = "I")
	private int anInt6529;

	@OriginalMember(owner = "client!nda", name = "cb", descriptor = "I")
	private int anInt6532;

	@OriginalMember(owner = "client!nda", name = "ib", descriptor = "Lclient!rs;")
	private Class307 aClass307_1;

	@OriginalMember(owner = "client!nda", name = "jb", descriptor = "I")
	private int anInt6537;

	@OriginalMember(owner = "client!nda", name = "rb", descriptor = "I")
	private int anInt6542;

	@OriginalMember(owner = "client!nda", name = "Ib", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!nda", name = "Pb", descriptor = "I")
	private int anInt6557;

	@OriginalMember(owner = "client!nda", name = "Qb", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_14;

	@OriginalMember(owner = "client!nda", name = "Vb", descriptor = "Lclient!cja;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!nda", name = "fc", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!nda", name = "lc", descriptor = "I")
	private int anInt6570;

	@OriginalMember(owner = "client!nda", name = "pc", descriptor = "I")
	private int anInt6574;

	@OriginalMember(owner = "client!nda", name = "qc", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!nda", name = "rc", descriptor = "Lclient!cja;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!nda", name = "Cc", descriptor = "I")
	private int anInt6579;

	@OriginalMember(owner = "client!nda", name = "Fc", descriptor = "Lclient!cja;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!nda", name = "bb", descriptor = "[I")
	private int[] anIntArray424;

	@OriginalMember(owner = "client!nda", name = "wc", descriptor = "I")
	private int anInt6576;

	@OriginalMember(owner = "client!nda", name = "Ec", descriptor = "I")
	private int anInt6580;

	@OriginalMember(owner = "client!nda", name = "Gc", descriptor = "Z")
	private boolean aBoolean465;

	@OriginalMember(owner = "client!nda", name = "I", descriptor = "Z")
	private boolean aBoolean461;

	@OriginalMember(owner = "client!nda", name = "zc", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "[I")
	private int[] anIntArray422;

	@OriginalMember(owner = "client!nda", name = "xc", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!nda", name = "ob", descriptor = "[I")
	private int[] anIntArray425;

	@OriginalMember(owner = "client!nda", name = "Z", descriptor = "I")
	private int anInt6531;

	@OriginalMember(owner = "client!nda", name = "mc", descriptor = "I")
	private int anInt6571;

	@OriginalMember(owner = "client!nda", name = "ic", descriptor = "[Lclient!qi;")
	private Class287[] aClass287Array4;

	@OriginalMember(owner = "client!nda", name = "Hb", descriptor = "[Lclient!hv;")
	private Class156[] aClass156Array4;

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "I")
	private int anInt6507;

	@OriginalMember(owner = "client!nda", name = "Zb", descriptor = "[Lclient!mv;")
	private Class234[] aClass234Array1;

	@OriginalMember(owner = "client!nda", name = "vb", descriptor = "[Lclient!tt;")
	private Class340[] aClass340Array1;

	@OriginalMember(owner = "client!nda", name = "sb", descriptor = "[F")
	private float[] aFloatArray52;

	@OriginalMember(owner = "client!nda", name = "gc", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!nda", name = "K", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!nda", name = "Gb", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!nda", name = "R", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!nda", name = "vc", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!nda", name = "ac", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!nda", name = "F", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!nda", name = "Mb", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!nda", name = "xb", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!nda", name = "bc", descriptor = "[F")
	private float[] aFloatArray53;

	@OriginalMember(owner = "client!nda", name = "nb", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!nda", name = "Ab", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!nda", name = "db", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!nda", name = "S", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!nda", name = "tc", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!nda", name = "uc", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!nda", name = "Dc", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!nda", name = "J", descriptor = "[I")
	private int[] anIntArray423;

	@OriginalMember(owner = "client!nda", name = "Yb", descriptor = "[I")
	private int[] anIntArray426;

	@OriginalMember(owner = "client!nda", name = "Ac", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!nda", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!nda", name = "zb", descriptor = "[[I")
	private int[][] anIntArrayArray79;

	@OriginalMember(owner = "client!nda", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!ij;Lclient!lga;IIII)V")
	public Class193_Sub2(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface2 local11 = arg0.anInterface2_12;
		@Pc(15) int[] local15 = new int[arg1.anInt5661];
		this.anIntArray424 = new int[arg1.anInt5665 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5661; local24++) {
			if (arg1.aByteArray46 == null || arg1.aByteArray46[local24] != 2) {
				if (arg1.aShortArray61 != null && arg1.aShortArray61[local24] != -1) {
					@Pc(55) Class271 local55 = local11.method6027(arg1.aShortArray61[local24] & 0xFFFF);
					if (((this.anInt6537 & 0x40) == 0 || !local55.aBoolean514) && local55.aBoolean515) {
						continue;
					}
				}
				local15[this.anInt6576++] = local24;
				this.anIntArray424[arg1.aShortArray63[local24]]++;
				this.anIntArray424[arg1.aShortArray69[local24]]++;
				this.anIntArray424[arg1.aShortArray65[local24]]++;
			}
		}
		this.anInt6580 = this.anInt6576;
		@Pc(131) long[] local131 = new long[this.anInt6576];
		@Pc(140) boolean local140 = (this.anInt6570 & 0x100) != 0;
		@Pc(152) int local152;
		@Pc(165) int local165;
		@Pc(329) int local329;
		for (@Pc(142) int local142 = 0; local142 < this.anInt6576; local142++) {
			@Pc(148) int local148 = local15[local142];
			@Pc(150) Class271 local150 = null;
			local152 = 0;
			@Pc(154) byte local154 = 0;
			@Pc(156) byte local156 = 0;
			@Pc(158) byte local158 = 0;
			if (arg1.aClass149Array1 != null) {
				@Pc(163) boolean local163 = false;
				for (local165 = 0; local165 < arg1.aClass149Array1.length; local165++) {
					@Pc(172) Class149 local172 = arg1.aClass149Array1[local165];
					if (local148 == local172.anInt4079) {
						@Pc(181) Class108 local181 = Static173.method2997(local172.anInt4081);
						if (local181.aBoolean243) {
							local163 = true;
						}
						if (local181.anInt3070 != -1) {
							@Pc(197) Class271 local197 = local11.method6027(local181.anInt3070);
							if (local197.anInt7162 == 2) {
								this.aBoolean465 = true;
							}
						}
					}
				}
				if (local163) {
					local131[local142] = Long.MAX_VALUE;
					this.anInt6580--;
					continue;
				}
			}
			@Pc(226) short local226 = -1;
			if (arg1.aShortArray61 != null) {
				local226 = arg1.aShortArray61[local148];
				if (local226 != -1) {
					local150 = local11.method6027(local226 & 0xFFFF);
					if ((this.anInt6537 & 0x40) != 0 && local150.aBoolean514) {
						local226 = -1;
						local150 = null;
					} else {
						local156 = local150.aByte94;
						local158 = local150.aByte97;
					}
				}
			}
			@Pc(285) boolean local285 = arg1.aByteArray52 != null && arg1.aByteArray52[local148] != 0 || local150 != null && local150.anInt7162 != 0;
			if ((local140 || local285) && arg1.aByteArray50 != null) {
				local152 += arg1.aByteArray50[local148] << 17;
			}
			if (local285) {
				local152 += 65536;
			}
			local152 += (local156 & 0xFF) << 8;
			local152 += local158 & 0xFF;
			local329 = local154 + ((local226 & 0xFFFF) << 16);
			@Pc(335) int local335 = local329 + (local142 & 0xFFFF);
			local131[local142] = (long) local335 + ((long) local152 << 32);
			this.aBoolean461 |= local150 != null && (local150.aByte93 != 0 || local150.aByte95 != 0);
			this.aBoolean465 |= local285;
		}
		Static480.method6806(local131, local15);
		this.anIntArray427 = arg1.anIntArray360;
		this.anIntArray422 = arg1.anIntArray355;
		this.aShortArray98 = arg1.aShortArray64;
		this.anIntArray425 = arg1.anIntArray353;
		this.anInt6531 = arg1.anInt5669;
		this.anInt6571 = arg1.anInt5665;
		this.aClass287Array4 = arg1.aClass287Array2;
		this.aClass156Array4 = arg1.aClass156Array2;
		@Pc(412) Class137[] local412 = new Class137[this.anInt6571];
		@Pc(432) int local432;
		@Pc(446) int local446;
		@Pc(489) int local489;
		if (arg1.aClass149Array1 != null) {
			this.anInt6507 = arg1.aClass149Array1.length;
			this.aClass234Array1 = new Class234[this.anInt6507];
			this.aClass340Array1 = new Class340[this.anInt6507];
			for (local432 = 0; local432 < this.anInt6507; local432++) {
				@Pc(439) Class149 local439 = arg1.aClass149Array1[local432];
				@Pc(444) Class108 local444 = Static173.method2997(local439.anInt4081);
				local446 = -1;
				for (@Pc(448) int local448 = 0; local448 < this.anInt6576; local448++) {
					if (local15[local448] == local439.anInt4079) {
						local446 = local448;
						break;
					}
				}
				if (local446 == -1) {
					throw new RuntimeException();
				}
				local489 = Static347.anIntArray701[arg1.aShortArray68[local439.anInt4079] & 0xFFFF] & 0xFFFFFF;
				@Pc(507) int local507 = local489 | 255 - (arg1.aByteArray52 == null ? 0 : arg1.aByteArray52[local439.anInt4079]) << 24;
				this.aClass340Array1[local432] = new Class340(local446, arg1.aShortArray63[local439.anInt4079], arg1.aShortArray69[local439.anInt4079], arg1.aShortArray65[local439.anInt4079], local444.anInt3075, local444.anInt3079, local444.anInt3070, local444.anInt3068, local444.anInt3071, local444.aBoolean243, local444.aBoolean242, local439.anInt4076);
				this.aClass234Array1[local432] = new Class234(local507);
			}
		}
		local432 = this.anInt6576 * 3;
		this.aFloatArray52 = new float[local432];
		this.aShortArray94 = new short[local432];
		this.aShortArray87 = new short[this.anInt6576];
		if (arg1.aShortArray66 != null) {
			this.aShortArray93 = new short[this.anInt6576];
		}
		this.aShortArray88 = new short[local432];
		this.aShortArray97 = new short[this.anInt6576];
		this.aShort88 = (short) arg3;
		this.aShortArray86 = new short[local432];
		this.aByteArray66 = new byte[local432];
		this.aShortArray92 = new short[local432];
		this.aFloatArray53 = new float[local432];
		this.aShortArray91 = new short[local432];
		Static591.aLongArray14 = new long[local432];
		this.aShort87 = (short) arg4;
		this.aShortArray90 = new short[this.anInt6576];
		this.aShortArray89 = new short[local432];
		this.aShortArray95 = new short[this.anInt6576];
		this.aShortArray96 = new short[this.anInt6576];
		this.aByteArray67 = new byte[this.anInt6576];
		local152 = 0;
		for (local329 = 0; local329 < arg1.anInt5665; local329++) {
			local446 = this.anIntArray424[local329];
			this.anIntArray424[local329] = local152;
			local152 += local446;
			local412[local329] = new Class137();
		}
		this.anIntArray424[arg1.anInt5665] = local152;
		@Pc(697) Class215 local697 = Static159.method2761(this.anInt6576, local15, arg1);
		@Pc(701) Class265[] local701 = new Class265[arg1.anInt5661];
		@Pc(742) int local742;
		@Pc(753) int local753;
		@Pc(764) int local764;
		@Pc(720) short local720;
		@Pc(731) int local731;
		for (local489 = 0; local489 < arg1.anInt5661; local489++) {
			@Pc(710) short local710 = arg1.aShortArray63[local489];
			@Pc(715) short local715 = arg1.aShortArray69[local489];
			local720 = arg1.aShortArray65[local489];
			local731 = this.anIntArray422[local715] - this.anIntArray422[local710];
			local742 = this.anIntArray427[local715] - this.anIntArray427[local710];
			local753 = this.anIntArray425[local715] - this.anIntArray425[local710];
			local764 = this.anIntArray422[local720] - this.anIntArray422[local710];
			@Pc(774) int local774 = this.anIntArray427[local720] - this.anIntArray427[local710];
			@Pc(785) int local785 = this.anIntArray425[local720] - this.anIntArray425[local710];
			@Pc(793) int local793 = local742 * local785 - local774 * local753;
			@Pc(802) int local802 = local764 * local753 - local785 * local731;
			@Pc(810) int local810 = local774 * local731 - local764 * local742;
			while (local793 > 8192 || local802 > 8192 || local810 > 8192 || local793 < -8192 || local802 < -8192 || local810 < -8192) {
				local793 >>= 0x1;
				local810 >>= 0x1;
				local802 >>= 0x1;
			}
			@Pc(863) int local863 = (int) Math.sqrt((double) (local793 * local793 + local802 * local802 + local810 * local810));
			if (local863 <= 0) {
				local863 = 1;
			}
			local793 = local793 * 256 / local863;
			local802 = local802 * 256 / local863;
			local810 = local810 * 256 / local863;
			@Pc(895) byte local895 = arg1.aByteArray46 == null ? 0 : arg1.aByteArray46[local489];
			if (local895 == 0) {
				@Pc(904) Class137 local904 = local412[local710];
				local904.anInt3915 += local793;
				local904.anInt3914++;
				local904.anInt3916 += local810;
				local904.anInt3912 += local802;
				@Pc(932) Class137 local932 = local412[local715];
				local932.anInt3915 += local793;
				local932.anInt3916 += local810;
				local932.anInt3914++;
				local932.anInt3912 += local802;
				@Pc(960) Class137 local960 = local412[local720];
				local960.anInt3916 += local810;
				local960.anInt3915 += local793;
				local960.anInt3912 += local802;
				local960.anInt3914++;
			} else if (local895 == 1) {
				@Pc(999) Class265 local999 = local701[local489] = new Class265();
				local999.anInt7054 = local802;
				local999.anInt7056 = local810;
				local999.anInt7053 = local793;
			}
		}
		@Pc(1025) int local1025;
		@Pc(1068) short local1068;
		for (local165 = 0; local165 < this.anInt6576; local165++) {
			local1025 = local15[local165];
			@Pc(1032) int local1032 = arg1.aShortArray68[local1025] & 0xFFFF;
			if (arg1.aByteArray51 == null) {
				local731 = -1;
			} else {
				local731 = arg1.aByteArray51[local1025];
			}
			if (arg1.aByteArray52 == null) {
				local742 = 0;
			} else {
				local742 = arg1.aByteArray52[local1025] & 0xFF;
			}
			local1068 = arg1.aShortArray61 == null ? -1 : arg1.aShortArray61[local1025];
			if (local1068 != -1 && (this.anInt6537 & 0x40) != 0) {
				@Pc(1086) Class271 local1086 = local11.method6027(local1068 & 0xFFFF);
				if (local1086.aBoolean514) {
					local1068 = -1;
				}
			}
			@Pc(1093) float local1093 = 0.0F;
			@Pc(1095) float local1095 = 0.0F;
			@Pc(1097) float local1097 = 0.0F;
			@Pc(1099) float local1099 = 0.0F;
			@Pc(1101) float local1101 = 0.0F;
			@Pc(1103) float local1103 = 0.0F;
			@Pc(1105) byte local1105 = 0;
			@Pc(1107) byte local1107 = 0;
			@Pc(1109) int local1109 = 0;
			@Pc(1143) byte local1143;
			@Pc(1160) short local1160;
			@Pc(1958) short local1958;
			@Pc(1963) short local1963;
			if (local1068 != -1) {
				if (local731 == -1) {
					local1099 = 1.0F;
					local1097 = 1.0F;
					local1101 = 0.0F;
					local1103 = 0.0F;
					local1107 = 2;
					local1095 = 1.0F;
					local1105 = 1;
					local1093 = 0.0F;
				} else {
					local731 &= 0xFF;
					local1143 = arg1.aByteArray49[local731];
					@Pc(1150) short local1150;
					@Pc(1155) short local1155;
					@Pc(1193) float local1193;
					@Pc(1209) float local1209;
					@Pc(1217) float local1217;
					@Pc(1317) float local1317;
					@Pc(1325) float local1325;
					@Pc(1333) float local1333;
					@Pc(1356) float local1356;
					@Pc(1379) float local1379;
					@Pc(1402) float local1402;
					if (local1143 == 0) {
						local1150 = arg1.aShortArray63[local1025];
						local1155 = arg1.aShortArray69[local1025];
						local1160 = arg1.aShortArray65[local1025];
						local1958 = arg1.aShortArray70[local731];
						local1963 = arg1.aShortArray62[local731];
						@Pc(1968) short local1968 = arg1.aShortArray67[local731];
						@Pc(1974) float local1974 = (float) arg1.anIntArray355[local1958];
						@Pc(1980) float local1980 = (float) arg1.anIntArray360[local1958];
						local1193 = (float) arg1.anIntArray353[local1958];
						local1209 = (float) arg1.anIntArray355[local1963] - local1974;
						local1217 = (float) arg1.anIntArray360[local1963] - local1980;
						@Pc(2013) float local2013 = (float) arg1.anIntArray353[local1963] - local1193;
						@Pc(2021) float local2021 = (float) arg1.anIntArray355[local1968] - local1974;
						@Pc(2029) float local2029 = (float) arg1.anIntArray360[local1968] - local1980;
						@Pc(2037) float local2037 = (float) arg1.anIntArray353[local1968] - local1193;
						@Pc(2046) float local2046 = (float) arg1.anIntArray355[local1150] - local1974;
						@Pc(2055) float local2055 = (float) arg1.anIntArray360[local1150] - local1980;
						@Pc(2064) float local2064 = (float) arg1.anIntArray353[local1150] - local1193;
						@Pc(2072) float local2072 = (float) arg1.anIntArray355[local1155] - local1974;
						@Pc(2081) float local2081 = (float) arg1.anIntArray360[local1155] - local1980;
						local1317 = (float) arg1.anIntArray353[local1155] - local1193;
						local1325 = (float) arg1.anIntArray355[local1160] - local1974;
						local1333 = (float) arg1.anIntArray360[local1160] - local1980;
						local1356 = (float) arg1.anIntArray353[local1160] - local1193;
						local1379 = local2037 * local1217 - local2013 * local2029;
						local1402 = local2021 * local2013 - local1209 * local2037;
						@Pc(2141) float local2141 = local1209 * local2029 - local2021 * local1217;
						@Pc(2150) float local2150 = local2029 * local2141 - local1402 * local2037;
						@Pc(2158) float local2158 = local2037 * local1379 - local2021 * local2141;
						@Pc(2167) float local2167 = local2021 * local1402 - local2029 * local1379;
						@Pc(2181) float local2181 = 1.0F / (local2013 * local2167 + local1209 * local2150 + local2158 * local1217);
						local1093 = local2181 * (local2158 * local2055 + local2046 * local2150 + local2064 * local2167);
						local1097 = (local2150 * local2072 + local2081 * local2158 + local1317 * local2167) * local2181;
						local1101 = local2181 * (local1356 * local2167 + local1325 * local2150 + local2158 * local1333);
						@Pc(2232) float local2232 = local2141 * local1217 - local2013 * local1402;
						@Pc(2241) float local2241 = local1209 * local1402 - local1379 * local1217;
						@Pc(2249) float local2249 = local1379 * local2013 - local1209 * local2141;
						@Pc(2263) float local2263 = 1.0F / (local2037 * local2241 + local2232 * local2021 + local2029 * local2249);
						local1095 = local2263 * (local2064 * local2241 + local2249 * local2055 + local2046 * local2232);
						local1099 = local2263 * (local2081 * local2249 + local2232 * local2072 + local2241 * local1317);
						local1103 = (local1356 * local2241 + local1325 * local2232 + local1333 * local2249) * local2263;
					} else {
						local1150 = arg1.aShortArray63[local1025];
						local1155 = arg1.aShortArray69[local1025];
						local1160 = arg1.aShortArray65[local1025];
						@Pc(1165) int local1165 = local697.anIntArray375[local731];
						@Pc(1170) int local1170 = local697.anIntArray377[local731];
						@Pc(1175) int local1175 = local697.anIntArray376[local731];
						@Pc(1180) float[] local1180 = local697.aFloatArrayArray7[local731];
						@Pc(1185) byte local1185 = arg1.aByteArray48[local731];
						local1193 = (float) arg1.anIntArray358[local731] / 256.0F;
						if (local1143 == 1) {
							local1209 = (float) arg1.anIntArray356[local731] / 1024.0F;
							Static553.method7821(local1170, local1209, local1180, Static601.aFloatArray101, arg1.anIntArray355[local1150], arg1.anIntArray360[local1150], local1175, local1165, arg1.anIntArray353[local1150], local1185, local1193);
							local1093 = Static601.aFloatArray101[0];
							local1095 = Static601.aFloatArray101[1];
							Static553.method7821(local1170, local1209, local1180, Static601.aFloatArray101, arg1.anIntArray355[local1155], arg1.anIntArray360[local1155], local1175, local1165, arg1.anIntArray353[local1155], local1185, local1193);
							local1097 = Static601.aFloatArray101[0];
							local1099 = Static601.aFloatArray101[1];
							Static553.method7821(local1170, local1209, local1180, Static601.aFloatArray101, arg1.anIntArray355[local1160], arg1.anIntArray360[local1160], local1175, local1165, arg1.anIntArray353[local1160], local1185, local1193);
							local1103 = Static601.aFloatArray101[1];
							local1101 = Static601.aFloatArray101[0];
							local1217 = local1209 / 2.0F;
							if ((local1185 & 0x1) == 0) {
								if (local1097 - local1093 > local1217) {
									local1105 = 1;
									local1097 -= local1209;
								} else if (local1217 < local1093 - local1097) {
									local1105 = 2;
									local1097 += local1209;
								}
								if (local1101 - local1093 > local1217) {
									local1101 -= local1209;
									local1107 = 1;
								} else if (local1217 < local1093 - local1101) {
									local1107 = 2;
									local1101 += local1209;
								}
							} else {
								if (local1217 < local1099 - local1095) {
									local1099 -= local1209;
									local1105 = 1;
								} else if (local1217 < local1095 - local1099) {
									local1105 = 2;
									local1099 += local1209;
								}
								if (local1103 - local1095 > local1217) {
									local1107 = 1;
									local1103 -= local1209;
								} else if (local1217 < local1095 - local1103) {
									local1103 += local1209;
									local1107 = 2;
								}
							}
						} else if (local1143 == 2) {
							local1209 = (float) arg1.anIntArray361[local731] / 256.0F;
							local1217 = (float) arg1.anIntArray357[local731] / 256.0F;
							@Pc(1227) int local1227 = arg1.anIntArray355[local1155] - arg1.anIntArray355[local1150];
							@Pc(1238) int local1238 = arg1.anIntArray360[local1155] - arg1.anIntArray360[local1150];
							@Pc(1249) int local1249 = arg1.anIntArray353[local1155] - arg1.anIntArray353[local1150];
							@Pc(1260) int local1260 = arg1.anIntArray355[local1160] - arg1.anIntArray355[local1150];
							@Pc(1271) int local1271 = arg1.anIntArray360[local1160] - arg1.anIntArray360[local1150];
							@Pc(1282) int local1282 = arg1.anIntArray353[local1160] - arg1.anIntArray353[local1150];
							@Pc(1291) int local1291 = local1282 * local1238 - local1249 * local1271;
							@Pc(1300) int local1300 = local1249 * local1260 - local1227 * local1282;
							@Pc(1309) int local1309 = local1271 * local1227 - local1260 * local1238;
							local1317 = 64.0F / (float) arg1.anIntArray359[local731];
							local1325 = 64.0F / (float) arg1.anIntArray363[local731];
							local1333 = 64.0F / (float) arg1.anIntArray356[local731];
							local1356 = ((float) local1300 * local1180[1] + (float) local1291 * local1180[0] + local1180[2] * (float) local1309) / local1317;
							local1379 = ((float) local1300 * local1180[4] + (float) local1291 * local1180[3] + (float) local1309 * local1180[5]) / local1325;
							local1402 = (local1180[8] * (float) local1309 + (float) local1300 * local1180[7] + local1180[6] * (float) local1291) / local1333;
							local1109 = Static330.method5041(local1402, local1379, local1356);
							Static375.method5564(local1165, local1170, local1193, local1185, arg1.anIntArray353[local1150], arg1.anIntArray355[local1150], local1209, local1175, local1180, arg1.anIntArray360[local1150], local1217, local1109, Static601.aFloatArray101);
							local1095 = Static601.aFloatArray101[1];
							local1093 = Static601.aFloatArray101[0];
							Static375.method5564(local1165, local1170, local1193, local1185, arg1.anIntArray353[local1155], arg1.anIntArray355[local1155], local1209, local1175, local1180, arg1.anIntArray360[local1155], local1217, local1109, Static601.aFloatArray101);
							local1099 = Static601.aFloatArray101[1];
							local1097 = Static601.aFloatArray101[0];
							Static375.method5564(local1165, local1170, local1193, local1185, arg1.anIntArray353[local1160], arg1.anIntArray355[local1160], local1209, local1175, local1180, arg1.anIntArray360[local1160], local1217, local1109, Static601.aFloatArray101);
							local1103 = Static601.aFloatArray101[1];
							local1101 = Static601.aFloatArray101[0];
						} else if (local1143 == 3) {
							Static178.method8646(arg1.anIntArray353[local1150], local1185, local1180, arg1.anIntArray360[local1150], local1175, local1193, Static601.aFloatArray101, arg1.anIntArray355[local1150], local1170, local1165);
							local1095 = Static601.aFloatArray101[1];
							local1093 = Static601.aFloatArray101[0];
							Static178.method8646(arg1.anIntArray353[local1155], local1185, local1180, arg1.anIntArray360[local1155], local1175, local1193, Static601.aFloatArray101, arg1.anIntArray355[local1155], local1170, local1165);
							local1099 = Static601.aFloatArray101[1];
							local1097 = Static601.aFloatArray101[0];
							Static178.method8646(arg1.anIntArray353[local1160], local1185, local1180, arg1.anIntArray360[local1160], local1175, local1193, Static601.aFloatArray101, arg1.anIntArray355[local1160], local1170, local1165);
							local1101 = Static601.aFloatArray101[0];
							local1103 = Static601.aFloatArray101[1];
							if ((local1185 & 0x1) == 0) {
								if (local1097 - local1093 > 0.5F) {
									local1097--;
									local1105 = 1;
								} else if (local1093 - local1097 > 0.5F) {
									local1097++;
									local1105 = 2;
								}
								if (local1101 - local1093 > 0.5F) {
									local1107 = 1;
									local1101--;
								} else if (local1093 - local1101 > 0.5F) {
									local1101++;
									local1107 = 2;
								}
							} else {
								if (local1099 - local1095 > 0.5F) {
									local1099--;
									local1105 = 1;
								} else if (local1095 - local1099 > 0.5F) {
									local1105 = 2;
									local1099++;
								}
								if (local1103 - local1095 > 0.5F) {
									local1107 = 1;
									local1103--;
								} else if (local1095 - local1103 > 0.5F) {
									local1103++;
									local1107 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray46 == null) {
				local1143 = 0;
			} else {
				local1143 = arg1.aByteArray46[local1025];
			}
			if (local1143 == 0) {
				@Pc(2342) long local2342 = ((long) (local1109 << 24) + (long) (local1032 << 8) + (long) local742 << 32) + (long) (local731 << 2);
				local1160 = arg1.aShortArray63[local1025];
				local1958 = arg1.aShortArray69[local1025];
				local1963 = arg1.aShortArray65[local1025];
				@Pc(2361) Class137 local2361 = local412[local1160];
				this.aShortArray87[local165] = this.method5629(local1095, local165, local2342, local1093, local1160, local2361.anInt3914, arg1, local2361.anInt3916, local2361.anInt3915, local2361.anInt3912);
				@Pc(2386) Class137 local2386 = local412[local1958];
				this.aShortArray95[local165] = this.method5629(local1099, local165, (long) local1105 + local2342, local1097, local1958, local2386.anInt3914, arg1, local2386.anInt3916, local2386.anInt3915, local2386.anInt3912);
				@Pc(2414) Class137 local2414 = local412[local1963];
				this.aShortArray97[local165] = this.method5629(local1103, local165, local2342 + (long) local1107, local1101, local1963, local2414.anInt3914, arg1, local2414.anInt3916, local2414.anInt3915, local2414.anInt3912);
			} else if (local1143 == 1) {
				@Pc(2449) Class265 local2449 = local701[local1025];
				@Pc(2491) long local2491 = ((long) local742 + (long) (local1032 << 8) + (long) (local1109 << 24) << 32) + (long) ((local2449.anInt7056 + 256 << 22) + (local731 << 2) + (local2449.anInt7053 <= 0 ? 2048 : 1024) + (local2449.anInt7054 + 256 << 12));
				this.aShortArray87[local165] = this.method5629(local1095, local165, local2491, local1093, arg1.aShortArray63[local1025], 0, arg1, local2449.anInt7056, local2449.anInt7053, local2449.anInt7054);
				this.aShortArray95[local165] = this.method5629(local1099, local165, (long) local1105 + local2491, local1097, arg1.aShortArray69[local1025], 0, arg1, local2449.anInt7056, local2449.anInt7053, local2449.anInt7054);
				this.aShortArray97[local165] = this.method5629(local1103, local165, (long) local1107 + local2491, local1101, arg1.aShortArray65[local1025], 0, arg1, local2449.anInt7056, local2449.anInt7053, local2449.anInt7054);
			}
			if (arg1.aByteArray52 != null) {
				this.aByteArray67[local165] = arg1.aByteArray52[local1025];
			}
			if (arg1.aShortArray66 != null) {
				this.aShortArray93[local165] = arg1.aShortArray66[local1025];
			}
			this.aShortArray90[local165] = arg1.aShortArray68[local1025];
			this.aShortArray96[local165] = local1068;
		}
		if (this.anInt6580 > 0) {
			local1025 = 1;
			local720 = this.aShortArray96[0];
			for (local731 = 0; local731 < this.anInt6580; local731++) {
				@Pc(2625) short local2625 = this.aShortArray96[local731];
				if (local720 != local2625) {
					local1025++;
					local720 = local2625;
				}
			}
			this.anIntArray423 = new int[local1025];
			this.anIntArray426 = new int[local1025];
			this.anIntArray428 = new int[local1025 + 1];
			this.anIntArray428[0] = 0;
			local742 = this.anInt6524;
			local720 = this.aShortArray96[0];
			local1025 = 0;
			local1068 = 0;
			for (local764 = 0; local764 < this.anInt6580; local764++) {
				@Pc(2676) short local2676 = this.aShortArray96[local764];
				if (local2676 != local720) {
					this.anIntArray426[local1025] = local742;
					this.anIntArray423[local1025] = local1068 + 1 - local742;
					local1025++;
					this.anIntArray428[local1025] = local764;
					local720 = local2676;
					local742 = this.anInt6524;
					local1068 = 0;
				}
				@Pc(2716) short local2716 = this.aShortArray87[local764];
				if (local2716 > local1068) {
					local1068 = local2716;
				}
				if (local2716 < local742) {
					local742 = local2716;
				}
				local2716 = this.aShortArray95[local764];
				if (local2716 < local742) {
					local742 = local2716;
				}
				if (local2716 > local1068) {
					local1068 = local2716;
				}
				local2716 = this.aShortArray97[local764];
				if (local2716 < local742) {
					local742 = local2716;
				}
				if (local1068 < local2716) {
					local1068 = local2716;
				}
			}
			this.anIntArray426[local1025] = local742;
			this.anIntArray423[local1025] = local1068 + 1 - local742;
			local1025++;
			this.anIntArray428[local1025] = this.anInt6580;
		}
		Static591.aLongArray14 = null;
		this.aShortArray86 = Static14.method365(this.aShortArray86, this.anInt6524);
		this.aShortArray92 = Static14.method365(this.aShortArray92, this.anInt6524);
		this.aShortArray89 = Static14.method365(this.aShortArray89, this.anInt6524);
		this.aShortArray91 = Static14.method365(this.aShortArray91, this.anInt6524);
		this.aShortArray94 = Static14.method365(this.aShortArray94, this.anInt6524);
		this.aByteArray66 = Static506.method7048(this.anInt6524, this.aByteArray66);
		this.aFloatArray52 = Static324.method4945(this.anInt6524, this.aFloatArray52);
		this.aFloatArray53 = Static324.method4945(this.anInt6524, this.aFloatArray53);
		if (arg1.anIntArray354 != null && Static467.method8859(this.anInt6537, arg2)) {
			this.anIntArrayArray77 = arg1.method4927(false);
		}
		if (arg1.aClass149Array1 != null && Static547.method7569(this.anInt6537, arg2)) {
			this.anIntArrayArray79 = arg1.method4924();
		}
		if (arg1.anIntArray362 != null && Static534.method7398(this.anInt6537, arg2)) {
			local1025 = 0;
			@Pc(2908) int[] local2908 = new int[256];
			for (local731 = 0; local731 < this.anInt6576; local731++) {
				local742 = arg1.anIntArray362[local15[local731]];
				if (local742 >= 0) {
					@Pc(2928) int local2928 = local2908[local742]++;
					if (local742 > local1025) {
						local1025 = local742;
					}
				}
			}
			this.anIntArrayArray78 = new int[local1025 + 1][];
			for (local742 = 0; local742 <= local1025; local742++) {
				this.anIntArrayArray78[local742] = new int[local2908[local742]];
				local2908[local742] = 0;
			}
			for (local753 = 0; local753 < this.anInt6576; local753++) {
				local764 = arg1.anIntArray362[local15[local753]];
				if (local764 >= 0) {
					this.anIntArrayArray78[local764][local2908[local764]++] = local753;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!ij;IIZZ)V")
	public Class193_Sub2(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean461 = false;
		this.anInt6524 = 0;
		this.anInt6531 = 0;
		this.aBoolean463 = false;
		this.anInt6576 = 0;
		this.aBoolean464 = false;
		this.anInt6571 = 0;
		this.anInt6580 = 0;
		this.aBoolean465 = false;
		this.aBoolean462 = true;
		this.aBoolean463 = arg4;
		this.aClass13_Sub3_14 = arg0;
		this.anInt6537 = arg2;
		this.anInt6570 = arg1;
		if (arg3 || Static418.method6107(this.anInt6537, this.anInt6570)) {
			this.aClass57_3 = new Class57(Static328.method4993(this.anInt6537, this.anInt6570));
		}
		if (arg3 || Static444.method6367(this.anInt6570, this.anInt6537)) {
			this.aClass57_2 = new Class57(Static352.method5274(this.anInt6537, this.anInt6570));
		}
		if (arg3 || Static479.method6801(this.anInt6537, this.anInt6570)) {
			this.aClass57_4 = new Class57(Static591.method8346(this.anInt6570, this.anInt6537));
		}
		if (arg3 || Static113.method2019(this.anInt6537, this.anInt6570)) {
			this.aClass57_1 = new Class57(Static508.method7063(this.anInt6537, this.anInt6570));
		}
		if (arg3 || Static345.method8049(this.anInt6537, this.anInt6570)) {
			this.aClass307_1 = new Class307(Static394.method5835(this.anInt6570, this.anInt6537));
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIILclient!pda;IZI)Z")
	private boolean method5626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class51 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class51_Sub2 local8 = (Class51_Sub2) arg2;
		@Pc(12) Class51_Sub2 local12 = this.aClass13_Sub3_14.aClass51_Sub2_16;
		@Pc(33) float local33 = local8.aFloat79 * local12.aFloat70 + local8.aFloat75 * local12.aFloat68 + local8.aFloat69 * local12.aFloat76 + local12.aFloat75;
		@Pc(54) float local54 = local12.aFloat69 + local12.aFloat71 * local8.aFloat79 + local8.aFloat69 * local12.aFloat77 + local12.aFloat72 * local8.aFloat75;
		Static249.aFloat104 = local12.aFloat71 * local8.aFloat78 + local8.aFloat70 * local12.aFloat72 + local12.aFloat77 * local8.aFloat71;
		Static151.aFloat63 = local8.aFloat78 * local12.aFloat70 + local12.aFloat68 * local8.aFloat70 + local12.aFloat76 * local8.aFloat71;
		Static562.aFloat184 = local12.aFloat70 * local8.aFloat73 + local12.aFloat76 * local8.aFloat77 + local8.aFloat76 * local12.aFloat68;
		Static382.aFloat122 = local8.aFloat72 * local12.aFloat73 + local8.aFloat68 * local12.aFloat74 + local8.aFloat74 * local12.aFloat78;
		@Pc(147) float local147 = local12.aFloat79 + local8.aFloat69 * local12.aFloat73 + local12.aFloat74 * local8.aFloat75 + local12.aFloat78 * local8.aFloat79;
		Static480.aFloat144 = local12.aFloat72 * local8.aFloat68 + local12.aFloat77 * local8.aFloat72 + local8.aFloat74 * local12.aFloat71;
		Static315.aFloat114 = local12.aFloat71 * local8.aFloat73 + local12.aFloat77 * local8.aFloat77 + local8.aFloat76 * local12.aFloat72;
		Static419.aFloat128 = local12.aFloat78 * local8.aFloat78 + local12.aFloat73 * local8.aFloat71 + local8.aFloat70 * local12.aFloat74;
		Static378.aFloat163 = local8.aFloat68 * local12.aFloat68 + local8.aFloat72 * local12.aFloat76 + local8.aFloat74 * local12.aFloat70;
		Static638.aFloat210 = local12.aFloat78 * local8.aFloat73 + local12.aFloat73 * local8.aFloat77 + local12.aFloat74 * local8.aFloat76;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass13_Sub3_14.anInt9751;
		@Pc(255) int local255 = this.aClass13_Sub3_14.anInt9742;
		if (!this.aBoolean464) {
			this.method5635();
		}
		@Pc(270) int local270 = this.anInt6529 - this.anInt6520 >> 1;
		@Pc(279) int local279 = this.anInt6542 - this.anInt6532 >> 1;
		@Pc(288) int local288 = this.anInt6579 - this.anInt6557 >> 1;
		@Pc(294) int local294 = this.anInt6520 + local270;
		@Pc(299) int local299 = local279 + this.anInt6532;
		@Pc(304) int local304 = local288 + this.anInt6557;
		@Pc(311) int local311 = local294 - (local270 << arg3);
		@Pc(318) int local318 = local299 - (local279 << arg3);
		@Pc(325) int local325 = local304 - (local288 << arg3);
		@Pc(331) int local331 = (local270 << arg3) + local294;
		@Pc(337) int local337 = (local279 << arg3) + local299;
		@Pc(343) int local343 = (local288 << arg3) + local304;
		Static461.anIntArray516[0] = local311;
		Static506.anIntArray601[0] = local318;
		Static131.anIntArray185[0] = local325;
		Static461.anIntArray516[1] = local331;
		Static506.anIntArray601[1] = local318;
		Static131.anIntArray185[1] = local325;
		Static461.anIntArray516[2] = local311;
		Static506.anIntArray601[2] = local337;
		Static461.anIntArray516[3] = local331;
		Static131.anIntArray185[2] = local325;
		Static506.anIntArray601[3] = local337;
		Static461.anIntArray516[4] = local311;
		Static131.anIntArray185[3] = local325;
		Static506.anIntArray601[4] = local318;
		Static131.anIntArray185[4] = local343;
		Static461.anIntArray516[5] = local331;
		Static506.anIntArray601[5] = local318;
		Static131.anIntArray185[5] = local343;
		Static461.anIntArray516[6] = local311;
		Static506.anIntArray601[6] = local337;
		Static131.anIntArray185[6] = local343;
		Static461.anIntArray516[7] = local331;
		Static506.anIntArray601[7] = local337;
		Static131.anIntArray185[7] = local343;
		@Pc(506) float local506;
		@Pc(492) float local492;
		@Pc(478) float local478;
		@Pc(454) float local454;
		@Pc(464) float local464;
		@Pc(459) float local459;
		for (@Pc(447) int local447 = 0; local447 < 8; local447++) {
			local454 = (float) Static461.anIntArray516[local447];
			local459 = (float) Static131.anIntArray185[local447];
			local464 = (float) Static506.anIntArray601[local447];
			local478 = Static638.aFloat210 * local464 + local454 * Static382.aFloat122 + Static419.aFloat128 * local459 + local147;
			local492 = local459 * Static249.aFloat104 + Static480.aFloat144 * local454 + Static315.aFloat114 * local464 + local54;
			local506 = local33 + local454 * Static378.aFloat163 + local464 * Static562.aFloat184 + local459 * Static151.aFloat63;
			if (local478 >= (float) this.aClass13_Sub3_14.anInt9723) {
				if (arg5 > 0) {
					local478 = (float) arg5;
				}
				@Pc(530) float local530 = (float) local251 * local506 / local478 + (float) this.aClass13_Sub3_14.anInt9761;
				@Pc(542) float local542 = (float) this.aClass13_Sub3_14.anInt9735 + (float) local255 * local492 / local478;
				if (local241 > local530) {
					local241 = local530;
				}
				if (local530 > local243) {
					local243 = local530;
				}
				if (local245 > local542) {
					local245 = local542;
				}
				local239 = true;
				if (local542 > local247) {
					local247 = local542;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg4) {
				return true;
			}
			if (this.anInt6524 > Static175.anIntArray230.length) {
				Static175.anIntArray230 = new int[this.anInt6524];
				Static364.anIntArray410 = new int[this.anInt6524];
			}
			@Pc(703) int local703;
			for (@Pc(613) int local613 = 0; local613 < this.anInt6571; local613++) {
				local454 = (float) this.anIntArray422[local613];
				local464 = (float) this.anIntArray427[local613];
				local459 = (float) this.anIntArray425[local613];
				local492 = local54 + local459 * Static249.aFloat104 + Static480.aFloat144 * local454 + local464 * Static315.aFloat114;
				local506 = local33 + local459 * Static151.aFloat63 + Static562.aFloat184 * local464 + Static378.aFloat163 * local454;
				local478 = local147 + local459 * Static419.aFloat128 + Static382.aFloat122 * local454 + local464 * Static638.aFloat210;
				@Pc(716) int local716;
				@Pc(721) int local721;
				@Pc(728) int local728;
				if ((float) this.aClass13_Sub3_14.anInt9723 <= local478) {
					if (arg5 > 0) {
						local478 = (float) arg5;
					}
					local703 = (int) ((float) local251 * local506 / local478 + (float) this.aClass13_Sub3_14.anInt9761);
					local716 = (int) ((float) local255 * local492 / local478 + (float) this.aClass13_Sub3_14.anInt9735);
					local721 = this.anIntArray424[local613];
					local728 = this.anIntArray424[local613 + 1];
					for (@Pc(730) int local730 = local721; local730 < local728; local730++) {
						@Pc(739) int local739 = this.aShortArray88[local730] - 1;
						if (local739 == -1) {
							break;
						}
						Static175.anIntArray230[local739] = local703;
						Static364.anIntArray410[local739] = local716;
					}
				} else {
					local703 = this.anIntArray424[local613];
					local716 = this.anIntArray424[local613 + 1];
					for (local721 = local703; local721 < local716; local721++) {
						local728 = this.aShortArray88[local721] - 1;
						if (local728 == -1) {
							break;
						}
						Static175.anIntArray230[this.aShortArray88[local721] - 1] = -999999;
					}
				}
			}
			for (local703 = 0; local703 < this.anInt6576; local703++) {
				if (Static175.anIntArray230[this.aShortArray87[local703]] != -999999 && Static175.anIntArray230[this.aShortArray95[local703]] != -999999 && Static175.anIntArray230[this.aShortArray97[local703]] != -999999 && this.method5643(Static175.anIntArray230[this.aShortArray95[local703]], Static364.anIntArray410[this.aShortArray97[local703]], arg0, arg1, Static175.anIntArray230[this.aShortArray97[local703]], Static364.anIntArray410[this.aShortArray95[local703]], Static364.anIntArray410[this.aShortArray87[local703]], Static175.anIntArray230[this.aShortArray87[local703]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!pda;Lclient!wt;II)V")
	@Override
	public void method6622(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class16_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6524 == 0) {
			return;
		}
		@Pc(16) Class51_Sub2 local16 = this.aClass13_Sub3_14.aClass51_Sub2_16;
		if (!this.aBoolean464) {
			this.method5635();
		}
		@Pc(25) Class51_Sub2 local25 = (Class51_Sub2) arg0;
		Static638.aFloat210 = local16.aFloat78 * local25.aFloat73 + local25.aFloat77 * local16.aFloat73 + local16.aFloat74 * local25.aFloat76;
		Static415.aFloat127 = local16.aFloat73 * local25.aFloat69 + local16.aFloat74 * local25.aFloat75 + local25.aFloat79 * local16.aFloat78 + local16.aFloat79;
		@Pc(72) float local72 = (float) this.anInt6532 * Static638.aFloat210 + Static415.aFloat127;
		@Pc(80) float local80 = Static415.aFloat127 + (float) this.anInt6542 * Static638.aFloat210;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = local80 - (float) this.anInt6512;
			local97 = local72 + (float) this.anInt6512;
		} else {
			local91 = (float) -this.anInt6512 + local72;
			local97 = local80 + (float) this.anInt6512;
		}
		if (local91 >= this.aClass13_Sub3_14.aFloat188 || local97 <= (float) this.aClass13_Sub3_14.anInt9723) {
			return;
		}
		Static562.aFloat184 = local25.aFloat76 * local16.aFloat68 + local25.aFloat77 * local16.aFloat76 + local25.aFloat73 * local16.aFloat70;
		Static250.aFloat105 = local25.aFloat75 * local16.aFloat68 + local25.aFloat69 * local16.aFloat76 + local25.aFloat79 * local16.aFloat70 + local16.aFloat75;
		@Pc(173) float local173 = Static562.aFloat184 * (float) this.anInt6532 + Static250.aFloat105;
		@Pc(181) float local181 = Static250.aFloat105 + (float) this.anInt6542 * Static562.aFloat184;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local181 < local173) {
			local196 = (local173 + (float) this.anInt6512) * (float) this.aClass13_Sub3_14.anInt9751;
			local207 = (local181 - (float) this.anInt6512) * (float) this.aClass13_Sub3_14.anInt9751;
		} else {
			local207 = ((float) -this.anInt6512 + local173) * (float) this.aClass13_Sub3_14.anInt9751;
			local196 = (float) this.aClass13_Sub3_14.anInt9751 * ((float) this.anInt6512 + local181);
		}
		if (local207 / (float) arg2 >= this.aClass13_Sub3_14.aFloat198 || this.aClass13_Sub3_14.aFloat190 >= local196 / (float) arg2) {
			return;
		}
		Static449.aFloat129 = local16.aFloat69 + local16.aFloat72 * local25.aFloat75 + local16.aFloat77 * local25.aFloat69 + local25.aFloat79 * local16.aFloat71;
		Static315.aFloat114 = local16.aFloat71 * local25.aFloat73 + local25.aFloat76 * local16.aFloat72 + local16.aFloat77 * local25.aFloat77;
		@Pc(299) float local299 = Static315.aFloat114 * (float) this.anInt6532 + Static449.aFloat129;
		@Pc(307) float local307 = Static315.aFloat114 * (float) this.anInt6542 + Static449.aFloat129;
		@Pc(334) float local334;
		@Pc(322) float local322;
		if (local307 < local299) {
			local322 = ((float) this.anInt6512 + local299) * (float) this.aClass13_Sub3_14.anInt9742;
			local334 = (float) this.aClass13_Sub3_14.anInt9742 * (local307 - (float) this.anInt6512);
		} else {
			local322 = (local307 + (float) this.anInt6512) * (float) this.aClass13_Sub3_14.anInt9742;
			local334 = ((float) -this.anInt6512 + local299) * (float) this.aClass13_Sub3_14.anInt9742;
		}
		if (this.aClass13_Sub3_14.aFloat194 <= local334 / (float) arg2 || this.aClass13_Sub3_14.aFloat201 >= local322 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass340Array1 != null) {
			Static249.aFloat104 = local25.aFloat78 * local16.aFloat71 + local16.aFloat77 * local25.aFloat71 + local16.aFloat72 * local25.aFloat70;
			Static151.aFloat63 = local16.aFloat70 * local25.aFloat78 + local25.aFloat71 * local16.aFloat76 + local25.aFloat70 * local16.aFloat68;
			Static480.aFloat144 = local16.aFloat77 * local25.aFloat72 + local16.aFloat72 * local25.aFloat68 + local16.aFloat71 * local25.aFloat74;
			Static419.aFloat128 = local16.aFloat73 * local25.aFloat71 + local25.aFloat70 * local16.aFloat74 + local25.aFloat78 * local16.aFloat78;
			Static382.aFloat122 = local25.aFloat74 * local16.aFloat78 + local16.aFloat73 * local25.aFloat72 + local25.aFloat68 * local16.aFloat74;
			Static378.aFloat163 = local25.aFloat74 * local16.aFloat70 + local25.aFloat72 * local16.aFloat76 + local16.aFloat68 * local25.aFloat68;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.anInt6520 + this.anInt6529 >> 1;
			@Pc(510) int local510 = this.anInt6557 + this.anInt6579 >> 1;
			@Pc(529) int local529 = (int) (Static151.aFloat63 * (float) local510 + Static250.aFloat105 + (float) local502 * Static378.aFloat163 + (float) this.anInt6532 * Static562.aFloat184);
			@Pc(548) int local548 = (int) (Static249.aFloat104 * (float) local510 + (float) this.anInt6532 * Static315.aFloat114 + (float) local502 * Static480.aFloat144 + Static449.aFloat129);
			@Pc(567) int local567 = (int) ((float) local510 * Static419.aFloat128 + (float) this.anInt6532 * Static638.aFloat210 + Static415.aFloat127 + (float) local502 * Static382.aFloat122);
			@Pc(586) int local586 = (int) (Static250.aFloat105 + Static378.aFloat163 * (float) local502 + (float) this.anInt6542 * Static562.aFloat184 + (float) local510 * Static151.aFloat63);
			@Pc(605) int local605 = (int) ((float) local510 * Static249.aFloat104 + Static315.aFloat114 * (float) this.anInt6542 + (float) local502 * Static480.aFloat144 + Static449.aFloat129);
			@Pc(624) int local624 = (int) ((float) local510 * Static419.aFloat128 + Static638.aFloat210 * (float) this.anInt6542 + Static415.aFloat127 + (float) local502 * Static382.aFloat122);
			arg1.anInt10441 = this.aClass13_Sub3_14.anInt9761 + local529 * this.aClass13_Sub3_14.anInt9751 / arg2;
			arg1.anInt10438 = this.aClass13_Sub3_14.anInt9735 + this.aClass13_Sub3_14.anInt9742 * local548 / arg2;
			arg1.anInt10440 = this.aClass13_Sub3_14.anInt9761 + this.aClass13_Sub3_14.anInt9751 * local586 / arg2;
			arg1.anInt10439 = this.aClass13_Sub3_14.anInt9735 + local605 * this.aClass13_Sub3_14.anInt9742 / arg2;
			if (local567 >= this.aClass13_Sub3_14.anInt9723 || this.aClass13_Sub3_14.anInt9723 <= local624) {
				arg1.aBoolean758 = true;
				arg1.anInt10442 = this.aClass13_Sub3_14.anInt9761 + (local529 + this.anInt6512) * this.aClass13_Sub3_14.anInt9751 / arg2 - arg1.anInt10441;
			}
		}
		this.aClass13_Sub3_14.method8263((float) arg2);
		this.aClass13_Sub3_14.method8295();
		this.aClass13_Sub3_14.method8273(local25);
		this.method5633();
		this.method5634();
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
	private void method5627() {
		if (this.aClass57_3 != null) {
			this.aClass57_3.aBoolean158 = false;
		}
	}

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "()V")
	@Override
	public void method6624() {
		if (this.anInt6524 > 0 && this.anInt6580 > 0) {
			this.method5636();
			this.method5642();
			this.method5628();
		}
	}

	@OriginalMember(owner = "client!nda", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean464) {
			this.method5635();
		}
		return this.anInt6579;
	}

	@OriginalMember(owner = "client!nda", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub7_Sub17 ba(@OriginalArg(0) Class2_Sub7_Sub17 arg0) {
		if (this.anInt6524 == 0) {
			return null;
		}
		if (!this.aBoolean464) {
			this.method5635();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass13_Sub3_14.anInt9753 > 0) {
			local40 = this.anInt6520 - (this.aClass13_Sub3_14.anInt9753 * this.anInt6542 >> 8) >> this.aClass13_Sub3_14.anInt9738;
			local57 = this.anInt6529 - (this.aClass13_Sub3_14.anInt9753 * this.anInt6532 >> 8) >> this.aClass13_Sub3_14.anInt9738;
		} else {
			local40 = this.anInt6520 - (this.anInt6532 * this.aClass13_Sub3_14.anInt9753 >> 8) >> this.aClass13_Sub3_14.anInt9738;
			local57 = this.anInt6529 - (this.aClass13_Sub3_14.anInt9753 * this.anInt6542 >> 8) >> this.aClass13_Sub3_14.anInt9738;
		}
		@Pc(113) int local113;
		@Pc(129) int local129;
		if (this.aClass13_Sub3_14.anInt9741 > 0) {
			local113 = this.anInt6557 - (this.aClass13_Sub3_14.anInt9741 * this.anInt6542 >> 8) >> this.aClass13_Sub3_14.anInt9738;
			local129 = this.anInt6579 - (this.aClass13_Sub3_14.anInt9741 * this.anInt6532 >> 8) >> this.aClass13_Sub3_14.anInt9738;
		} else {
			local113 = this.anInt6557 - (this.anInt6532 * this.aClass13_Sub3_14.anInt9741 >> 8) >> this.aClass13_Sub3_14.anInt9738;
			local129 = this.anInt6579 - (this.anInt6542 * this.aClass13_Sub3_14.anInt9741 >> 8) >> this.aClass13_Sub3_14.anInt9738;
		}
		@Pc(172) int local172 = local57 + 1 - local40;
		@Pc(178) int local178 = local129 + 1 - local113;
		@Pc(181) Class2_Sub7_Sub17_Sub2 local181 = (Class2_Sub7_Sub17_Sub2) arg0;
		@Pc(197) Class2_Sub7_Sub17_Sub2 local197;
		if (local181 != null && local181.method8462(local178, local172)) {
			local197 = local181;
			local181.method8466();
		} else {
			local197 = new Class2_Sub7_Sub17_Sub2(this.aClass13_Sub3_14, local172, local178);
		}
		local197.method8463(local129, local57, local40, local113);
		this.method5641(local197);
		return local197;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V")
	private void method5628() {
		if (!this.aBoolean462) {
			return;
		}
		this.aBoolean462 = false;
		if (this.aClass287Array4 == null && this.aClass156Array4 == null && this.aClass340Array1 == null) {
			if (this.anIntArray422 != null && !Static288.method4573(this.anInt6537, this.anInt6570)) {
				if (this.aClass57_3 == null || this.aClass57_3.method1641()) {
					if (!this.aBoolean464) {
						this.method5635();
					}
					this.anIntArray422 = null;
				} else {
					this.aBoolean462 = true;
				}
			}
			if (this.anIntArray427 != null && !Static30.method654(this.anInt6570, this.anInt6537)) {
				if (this.aClass57_3 == null || this.aClass57_3.method1641()) {
					if (!this.aBoolean464) {
						this.method5635();
					}
					this.anIntArray427 = null;
				} else {
					this.aBoolean462 = true;
				}
			}
			if (this.anIntArray425 != null && !Static168.method2927(this.anInt6537, this.anInt6570)) {
				if (this.aClass57_3 == null || this.aClass57_3.method1641()) {
					if (!this.aBoolean464) {
						this.method5635();
					}
					this.anIntArray425 = null;
				} else {
					this.aBoolean462 = true;
				}
			}
		}
		if (this.aShortArray88 != null && this.anIntArray422 == null && this.anIntArray427 == null && this.anIntArray425 == null) {
			this.aShortArray88 = null;
			this.anIntArray424 = null;
		}
		if (this.aByteArray66 != null && !Static596.method8400(this.anInt6570, this.anInt6537)) {
			label195: {
				label194: {
					@Pc(163) boolean local163;
					if ((this.anInt6537 & 0x37) == 0) {
						if (this.aClass57_4 == null || this.aClass57_4.method1641()) {
							break label194;
						}
						local163 = false;
					} else {
						if (this.aClass57_1 == null || this.aClass57_1.method1641()) {
							break label194;
						}
						local163 = false;
					}
					if (!local163) {
						this.aBoolean462 = true;
						break label195;
					}
				}
				this.aByteArray66 = null;
				this.aShortArray89 = this.aShortArray91 = this.aShortArray94 = null;
			}
		}
		if (this.aShortArray90 != null && !Static66.method1538(this.anInt6537, this.anInt6570)) {
			if (this.aClass57_4 == null || this.aClass57_4.method1641()) {
				this.aShortArray90 = null;
			} else {
				this.aBoolean462 = true;
			}
		}
		if (this.aByteArray67 != null && !Static334.method5082(this.anInt6537, this.anInt6570)) {
			if (this.aClass57_4 == null || this.aClass57_4.method1641()) {
				this.aByteArray67 = null;
			} else {
				this.aBoolean462 = true;
			}
		}
		if (this.aFloatArray52 != null && !Static497.method6929(this.anInt6537, this.anInt6570)) {
			if (this.aClass57_2 == null || this.aClass57_2.method1641()) {
				this.aFloatArray52 = this.aFloatArray53 = null;
			} else {
				this.aBoolean462 = true;
			}
		}
		if (this.aShortArray96 != null && !Static210.method8327(this.anInt6537, this.anInt6570)) {
			if (this.aClass57_4 == null || this.aClass57_4.method1641()) {
				this.aShortArray96 = null;
			} else {
				this.aBoolean462 = true;
			}
		}
		if (this.aShortArray87 != null && !Static139.method2559(this.anInt6570, this.anInt6537)) {
			if ((this.aClass307_1 == null || this.aClass307_1.method7069()) && (this.aClass57_4 == null || this.aClass57_4.method1641())) {
				this.aShortArray87 = this.aShortArray95 = this.aShortArray97 = null;
			} else {
				this.aBoolean462 = true;
			}
		}
		if (this.aShortArray86 != null) {
			if (this.aClass57_3 == null || this.aClass57_3.method1641()) {
				this.aShortArray86 = null;
			} else {
				this.aBoolean462 = true;
			}
		}
		if (this.aShortArray92 != null) {
			if (this.aClass57_4 == null || this.aClass57_4.method1641()) {
				this.aShortArray92 = null;
			} else {
				this.aBoolean462 = true;
			}
		}
		if (this.anIntArrayArray78 != null && !Static534.method7398(this.anInt6537, this.anInt6570)) {
			this.aShortArray93 = null;
			this.anIntArrayArray78 = null;
		}
		if (this.anIntArrayArray77 != null && !Static467.method8859(this.anInt6537, this.anInt6570)) {
			this.aShortArray98 = null;
			this.anIntArrayArray77 = null;
		}
		if (this.anIntArrayArray79 != null && !Static547.method7569(this.anInt6537, this.anInt6570)) {
			this.anIntArrayArray79 = null;
		}
		if (this.anIntArray428 != null && (this.anInt6570 & 0x800) == 0 && (this.anInt6570 & 0x40000) == 0) {
			this.anIntArray423 = null;
			this.anIntArray426 = null;
			this.anIntArray428 = null;
		}
	}

	@OriginalMember(owner = "client!nda", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6571; local3++) {
			if (arg0 != 128) {
				this.anIntArray422[local3] = arg0 * this.anIntArray422[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray427[local3] = this.anIntArray427[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray425[local3] = arg2 * this.anIntArray425[local3] >> 7;
			}
		}
		this.method5627();
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "()[Lclient!qi;")
	@Override
	public Class287[] method6621() {
		return this.aClass287Array4;
	}

	@OriginalMember(owner = "client!nda", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class290.anIntArray546[arg0];
		@Pc(13) int local13 = Class290.anIntArray547[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6571; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray427[local15] + this.anIntArray422[local15] * local13 >> 14;
			this.anIntArray427[local15] = this.anIntArray427[local15] * local13 - local9 * this.anIntArray422[local15] >> 14;
			this.anIntArray422[local15] = local34;
		}
		this.method5627();
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IILclient!pda;ZII)Z")
	@Override
	public boolean method6617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5626(arg0, arg1, arg2, arg4, arg3, arg5);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(FIJIFIILclient!lga;III)S")
	private short method5629(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class212 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray424[arg4];
		@Pc(17) int local17 = this.anIntArray424[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = local10; local26 < local17; local26++) {
			@Pc(33) short local33 = this.aShortArray88[local26];
			if (local33 == 0) {
				local19 = local26;
				break;
			}
			if (Static591.aLongArray14[local26] == arg2) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray88[local19] = (short) (this.anInt6524 + 1);
		Static591.aLongArray14[local19] = arg2;
		this.aShortArray92[this.anInt6524] = (short) arg1;
		this.aShortArray86[this.anInt6524] = (short) arg4;
		this.aShortArray89[this.anInt6524] = (short) arg8;
		this.aShortArray91[this.anInt6524] = (short) arg9;
		this.aShortArray94[this.anInt6524] = (short) arg7;
		this.aByteArray66[this.anInt6524] = (byte) arg5;
		this.aFloatArray52[this.anInt6524] = arg3;
		this.aFloatArray53[this.anInt6524] = arg0;
		return (short) this.anInt6524++;
	}

	@OriginalMember(owner = "client!nda", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6571; local3++) {
			this.anIntArray425[local3] = -this.anIntArray425[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt6524; local29++) {
			this.aShortArray94[local29] = (short) -this.aShortArray94[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt6576; local48++) {
			@Pc(55) short local55 = this.aShortArray87[local48];
			this.aShortArray87[local48] = this.aShortArray97[local48];
			this.aShortArray97[local48] = local55;
		}
		this.method5627();
		this.method5638();
		this.method5637();
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!pda;IZ)V")
	@Override
	public void method6627(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray98 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6571; local14++) {
			if ((this.aShortArray98[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method6713(this.anIntArray422[local14], this.anIntArray427[local14], this.anIntArray425[local14], local12);
				} else {
					arg0.method6706(this.anIntArray422[local14], this.anIntArray427[local14], this.anIntArray425[local14], local12);
				}
				this.anIntArray422[local14] = local12[0];
				this.anIntArray427[local14] = local12[1];
				this.anIntArray425[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class290.anIntArray546[arg0];
		@Pc(13) int local13 = Class290.anIntArray547[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6571; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray425[local15] + this.anIntArray422[local15] * local13 >> 14;
			this.anIntArray425[local15] = local13 * this.anIntArray425[local15] - this.anIntArray422[local15] * local9 >> 14;
			this.anIntArray422[local15] = local34;
		}
		this.method5627();
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!nda", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean465;
	}

	@OriginalMember(owner = "client!nda", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean461;
	}

	@OriginalMember(owner = "client!nda", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean464) {
			this.method5635();
		}
		return this.anInt6574;
	}

	@OriginalMember(owner = "client!nda", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static89.anInt6948 = 0;
			local29 = 0;
			Static150.anInt3093 = 0;
			Static398.anInt6844 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray77.length) {
					local55 = this.anIntArrayArray77[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local63]) != 0) {
							Static398.anInt6844 += this.anIntArray422[local63];
							Static89.anInt6948 += this.anIntArray427[local63];
							local29++;
							Static150.anInt3093 += this.anIntArray425[local63];
						}
					}
				}
			}
			if (local29 <= 0) {
				Static398.anInt6844 = arg2;
				Static89.anInt6948 = arg3;
				Static150.anInt3093 = arg4;
			} else {
				Static400.aBoolean561 = true;
				Static150.anInt3093 = Static150.anInt3093 / local29 + arg4;
				Static89.anInt6948 = Static89.anInt6948 / local29 + arg3;
				Static398.anInt6844 = arg2 + Static398.anInt6844 / local29;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg3 * arg7[1] + arg2 * arg7[0] + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg7[3] * arg2 + arg3 * arg7[4] + 8192 >> 14;
				local41 = arg2 * arg7[6] + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg3 = local35;
				arg4 = local41;
				arg2 = local29;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray77.length > local35) {
					local253 = this.anIntArrayArray77[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray98 == null || (this.aShortArray98[local57] & arg6) != 0) {
							this.anIntArray422[local57] += arg2;
							this.anIntArray427[local57] += arg3;
							this.anIntArray425[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(389) int local389;
		@Pc(408) int local408;
		@Pc(648) int local648;
		@Pc(657) int local657;
		@Pc(667) int local667;
		@Pc(671) int local671;
		@Pc(689) int local689;
		@Pc(1012) int local1012;
		@Pc(1020) int local1020;
		@Pc(1174) int local1174;
		@Pc(1199) int local1199;
		@Pc(1204) int local1204;
		@Pc(1212) int local1212;
		@Pc(1217) int local1217;
		@Pc(1221) int local1221;
		@Pc(1225) int local1225;
		@Pc(1227) int local1227;
		@Pc(1355) int[] local1355;
		@Pc(1357) int local1357;
		@Pc(1361) int local1361;
		@Pc(1365) int local1365;
		@Pc(1367) int local1367;
		@Pc(1497) int local1497;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray77.length > local35) {
						local253 = this.anIntArrayArray77[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local57 = local253[local255];
							if (this.aShortArray98 == null || (this.aShortArray98[local57] & arg6) != 0) {
								this.anIntArray422[local57] -= Static398.anInt6844;
								this.anIntArray427[local57] -= Static89.anInt6948;
								this.anIntArray425[local57] -= Static150.anInt3093;
								if (arg4 != 0) {
									local63 = Class290.anIntArray546[arg4];
									local389 = Class290.anIntArray547[arg4];
									local408 = this.anIntArray427[local57] * local63 + this.anIntArray422[local57] * local389 + 16383 >> 14;
									this.anIntArray427[local57] = this.anIntArray427[local57] * local389 + 16383 - local63 * this.anIntArray422[local57] >> 14;
									this.anIntArray422[local57] = local408;
								}
								if (arg2 != 0) {
									local63 = Class290.anIntArray546[arg2];
									local389 = Class290.anIntArray547[arg2];
									local408 = this.anIntArray427[local57] * local389 + 16383 - this.anIntArray425[local57] * local63 >> 14;
									this.anIntArray425[local57] = this.anIntArray427[local57] * local63 + local389 * this.anIntArray425[local57] + 16383 >> 14;
									this.anIntArray427[local57] = local408;
								}
								if (arg3 != 0) {
									local63 = Class290.anIntArray546[arg3];
									local389 = Class290.anIntArray547[arg3];
									local408 = this.anIntArray422[local57] * local389 + local63 * this.anIntArray425[local57] + 16383 >> 14;
									this.anIntArray425[local57] = this.anIntArray425[local57] * local389 + 16383 - local63 * this.anIntArray422[local57] >> 14;
									this.anIntArray422[local57] = local408;
								}
								this.anIntArray422[local57] += Static398.anInt6844;
								this.anIntArray427[local57] += Static89.anInt6948;
								this.anIntArray425[local57] += Static150.anInt3093;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray77.length) {
							local55 = this.anIntArrayArray77[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray98 == null || (this.aShortArray98[local63] & arg6) != 0) {
									local389 = this.anIntArray424[local63];
									local408 = this.anIntArray424[local63 + 1];
									for (local648 = local389; local648 < local408; local648++) {
										local657 = this.aShortArray88[local648] - 1;
										if (local657 == -1) {
											break;
										}
										if (arg4 != 0) {
											local667 = Class290.anIntArray546[arg4];
											local671 = Class290.anIntArray547[arg4];
											local689 = this.aShortArray89[local657] * local671 + local667 * this.aShortArray91[local657] + 16383 >> 14;
											this.aShortArray91[local657] = (short) (local671 * this.aShortArray91[local657] + 16383 - local667 * this.aShortArray89[local657] >> 14);
											this.aShortArray89[local657] = (short) local689;
										}
										if (arg2 != 0) {
											local667 = Class290.anIntArray546[arg2];
											local671 = Class290.anIntArray547[arg2];
											local689 = this.aShortArray91[local657] * local671 + 16383 - this.aShortArray94[local657] * local667 >> 14;
											this.aShortArray94[local657] = (short) (local667 * this.aShortArray91[local657] + this.aShortArray94[local657] * local671 + 16383 >> 14);
											this.aShortArray91[local657] = (short) local689;
										}
										if (arg3 != 0) {
											local667 = Class290.anIntArray546[arg3];
											local671 = Class290.anIntArray547[arg3];
											local689 = local671 * this.aShortArray89[local657] + this.aShortArray94[local657] * local667 + 16383 >> 14;
											this.aShortArray94[local657] = (short) (this.aShortArray94[local657] * local671 + 16383 - local667 * this.aShortArray89[local657] >> 14);
											this.aShortArray89[local657] = (short) local689;
										}
									}
								}
							}
						}
					}
					this.method5638();
					return;
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static400.aBoolean561) {
					local389 = Static150.anInt3093 * arg7[6] + Static398.anInt6844 * arg7[0] + Static89.anInt6948 * arg7[3] + 8192 >> 14;
					local408 = arg7[7] * Static150.anInt3093 + arg7[4] * Static89.anInt6948 + Static398.anInt6844 * arg7[1] + 8192 >> 14;
					local408 += local57;
					local389 += local255;
					local648 = arg7[5] * Static89.anInt6948 + arg7[2] * Static398.anInt6844 + arg7[8] * Static150.anInt3093 + 8192 >> 14;
					Static398.anInt6844 = local389;
					local648 += local63;
					Static89.anInt6948 = local408;
					Static400.aBoolean561 = false;
					Static150.anInt3093 = local648;
				}
				@Pc(980) int[] local980 = new int[9];
				local408 = Class290.anIntArray547[arg2];
				local648 = Class290.anIntArray546[arg2];
				local657 = Class290.anIntArray547[arg3];
				local667 = Class290.anIntArray546[arg3];
				local671 = Class290.anIntArray547[arg4];
				local689 = Class290.anIntArray546[arg4];
				local1012 = local648 * local671 + 8192 >> 14;
				local1020 = local689 * local648 + 8192 >> 14;
				local980[0] = local671 * local657 + local1020 * local667 + 8192 >> 14;
				local980[5] = -local648;
				local980[7] = local657 * local1012 + local689 * local667 + 8192 >> 14;
				local980[4] = local671 * local408 + 8192 >> 14;
				local980[6] = -local667 * local671 + local657 * local1020 + 8192 >> 14;
				local980[2] = local667 * local408 + 8192 >> 14;
				local980[3] = local689 * local408 + 8192 >> 14;
				local980[1] = local689 * -local657 + local1012 * local667 + 8192 >> 14;
				local980[8] = local657 * local408 + 8192 >> 14;
				@Pc(1149) int local1149 = -Static150.anInt3093 * local980[2] + local980[0] * -Static398.anInt6844 + -Static89.anInt6948 * local980[1] + 8192 >> 14;
				local1174 = local980[3] * -Static398.anInt6844 + local980[4] * -Static89.anInt6948 + local980[5] * -Static150.anInt3093 + 8192 >> 14;
				local1199 = local980[8] * -Static150.anInt3093 + -Static89.anInt6948 * local980[7] + -Static398.anInt6844 * local980[6] + 8192 >> 14;
				local1204 = local1149 + Static398.anInt6844;
				@Pc(1208) int local1208 = Static89.anInt6948 + local1174;
				local1212 = Static150.anInt3093 + local1199;
				@Pc(1215) int[] local1215 = new int[9];
				for (local1217 = 0; local1217 < 3; local1217++) {
					for (local1221 = 0; local1221 < 3; local1221++) {
						local1225 = 0;
						for (local1227 = 0; local1227 < 3; local1227++) {
							local1225 += arg7[local1227 + local1221 * 3] * local980[local1227 + local1217 * 3];
						}
						local1215[local1217 * 3 + local1221] = local1225 + 8192 >> 14;
					}
				}
				local1221 = local57 * local980[1] + local980[0] * local255 + local980[2] * local63 + 8192 >> 14;
				local1225 = local255 * local980[3] + local57 * local980[4] + local63 * local980[5] + 8192 >> 14;
				local1221 += local1204;
				local1227 = local980[7] * local57 + local980[6] * local255 + local980[8] * local63 + 8192 >> 14;
				local1225 += local1208;
				local1227 += local1212;
				local1355 = new int[9];
				for (local1357 = 0; local1357 < 3; local1357++) {
					for (local1361 = 0; local1361 < 3; local1361++) {
						local1365 = 0;
						for (local1367 = 0; local1367 < 3; local1367++) {
							local1365 += local1215[local1361 + local1367 * 3] * arg7[local1357 * 3 + local1367];
						}
						local1355[local1357 * 3 + local1361] = local1365 + 8192 >> 14;
					}
				}
				local1361 = local1227 * arg7[2] + arg7[1] * local1225 + arg7[0] * local1221 + 8192 >> 14;
				local1365 = arg7[3] * local1221 + local1225 * arg7[4] + arg7[5] * local1227 + 8192 >> 14;
				local1367 = arg7[8] * local1227 + local1221 * arg7[6] + local1225 * arg7[7] + 8192 >> 14;
				local1361 += local29;
				local1365 += local35;
				local1367 += local41;
				for (local1497 = 0; local1497 < local8; local1497++) {
					@Pc(1503) int local1503 = arg1[local1497];
					if (local1503 < this.anIntArrayArray77.length) {
						@Pc(1517) int[] local1517 = this.anIntArrayArray77[local1503];
						for (@Pc(1519) int local1519 = 0; local1519 < local1517.length; local1519++) {
							@Pc(1525) int local1525 = local1517[local1519];
							if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local1525]) != 0) {
								@Pc(1567) int local1567 = local1355[2] * this.anIntArray425[local1525] + this.anIntArray422[local1525] * local1355[0] + this.anIntArray427[local1525] * local1355[1] + 8192 >> 14;
								@Pc(1599) int local1599 = this.anIntArray425[local1525] * local1355[5] + local1355[3] * this.anIntArray422[local1525] + local1355[4] * this.anIntArray427[local1525] + 8192 >> 14;
								@Pc(1603) int local1603 = local1599 + local1365;
								@Pc(1635) int local1635 = this.anIntArray422[local1525] * local1355[6] + local1355[7] * this.anIntArray427[local1525] + this.anIntArray425[local1525] * local1355[8] + 8192 >> 14;
								@Pc(1639) int local1639 = local1567 + local1361;
								@Pc(1643) int local1643 = local1635 + local1367;
								this.anIntArray422[local1525] = local1639;
								this.anIntArray427[local1525] = local1603;
								this.anIntArray425[local1525] = local1643;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2573) Class234 local2573;
			@Pc(2459) boolean local2459;
			@Pc(2568) Class340 local2568;
			if (arg0 == 5) {
				if (this.anIntArrayArray78 != null) {
					local2459 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray78.length) {
							local55 = this.anIntArrayArray78[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local63]) != 0) {
									local389 = arg2 * 8 + (this.aByteArray67[local63] & 0xFF);
									if (local389 < 0) {
										local389 = 0;
									} else if (local389 > 255) {
										local389 = 255;
									}
									this.aByteArray67[local63] = (byte) local389;
								}
							}
							local2459 |= local55.length > 0;
						}
					}
					if (local2459) {
						if (this.aClass340Array1 != null) {
							for (local41 = 0; local41 < this.anInt6507; local41++) {
								local2568 = this.aClass340Array1[local41];
								local2573 = this.aClass234Array1[local41];
								local2573.anInt6355 = local2573.anInt6355 & 0xFFFFFF | 255 - (this.aByteArray67[local2568.anInt9245] & 0xFF) << 24;
							}
						}
						this.method5632();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray78 != null) {
					local2459 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray78.length > local41) {
							local55 = this.anIntArrayArray78[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray93 == null || (this.aShortArray93[local63] & arg6) != 0) {
									local389 = this.aShortArray90[local63] & 0xFFFF;
									local408 = local389 >> 10 & 0x3F;
									local648 = local389 >> 7 & 0x7;
									local657 = local389 & 0x7F;
									@Pc(2678) int local2678 = arg2 + local408 & 0x3F;
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
									this.aShortArray90[local63] = (short) (local657 | local648 << 7 | local2678 << 10);
								}
							}
							local2459 |= local55.length > 0;
						}
					}
					if (local2459) {
						if (this.aClass340Array1 != null) {
							for (local41 = 0; local41 < this.anInt6507; local41++) {
								local2568 = this.aClass340Array1[local41];
								local2573 = this.aClass234Array1[local41];
								local2573.anInt6355 = local2573.anInt6355 & 0xFF000000 | Static347.anIntArray701[this.aShortArray90[local2568.anInt9245] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method5632();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray79 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray79.length > local35) {
							local253 = this.anIntArrayArray79[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2573 = this.aClass234Array1[local253[local255]];
								local2573.anInt6351 += arg3;
								local2573.anInt6354 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray79 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray79.length) {
							local253 = this.anIntArrayArray79[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2573 = this.aClass234Array1[local253[local255]];
								local2573.anInt6352 = local2573.anInt6352 * arg3 >> 7;
								local2573.anInt6353 = local2573.anInt6353 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray79 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray79.length > local35) {
						local253 = this.anIntArrayArray79[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local2573 = this.aClass234Array1[local253[local255]];
							local2573.anInt6349 = arg2 + local2573.anInt6349 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray77.length > local35) {
					local253 = this.anIntArrayArray77[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local57]) != 0) {
							this.anIntArray422[local57] -= Static398.anInt6844;
							this.anIntArray427[local57] -= Static89.anInt6948;
							this.anIntArray425[local57] -= Static150.anInt3093;
							this.anIntArray422[local57] = this.anIntArray422[local57] * arg2 >> 7;
							this.anIntArray427[local57] = arg3 * this.anIntArray427[local57] >> 7;
							this.anIntArray425[local57] = arg4 * this.anIntArray425[local57] >> 7;
							this.anIntArray422[local57] += Static398.anInt6844;
							this.anIntArray427[local57] += Static89.anInt6948;
							this.anIntArray425[local57] += Static150.anInt3093;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static400.aBoolean561) {
				local389 = Static89.anInt6948 * arg7[3] + Static398.anInt6844 * arg7[0] + Static150.anInt3093 * arg7[6] + 8192 >> 14;
				local408 = Static398.anInt6844 * arg7[1] + Static89.anInt6948 * arg7[4] + arg7[7] * Static150.anInt3093 + 8192 >> 14;
				local648 = Static150.anInt3093 * arg7[8] + arg7[5] * Static89.anInt6948 + Static398.anInt6844 * arg7[2] + 8192 >> 14;
				local389 += local255;
				local408 += local57;
				local648 += local63;
				Static89.anInt6948 = local408;
				Static398.anInt6844 = local389;
				Static400.aBoolean561 = false;
				Static150.anInt3093 = local648;
			}
			local389 = arg2 << 15 >> 7;
			local408 = arg3 << 15 >> 7;
			local648 = arg4 << 15 >> 7;
			local657 = -Static398.anInt6844 * local389 + 8192 >> 14;
			local667 = -Static89.anInt6948 * local408 + 8192 >> 14;
			local671 = -Static150.anInt3093 * local648 + 8192 >> 14;
			local689 = local657 + Static398.anInt6844;
			local1012 = Static89.anInt6948 + local667;
			local1020 = local671 + Static150.anInt3093;
			@Pc(1993) int[] local1993 = new int[] { arg7[0] * local389 + 8192 >> 14, arg7[3] * local389 + 8192 >> 14, local389 * arg7[6] + 8192 >> 14, arg7[1] * local408 + 8192 >> 14, local408 * arg7[4] + 8192 >> 14, local408 * arg7[7] + 8192 >> 14, arg7[2] * local648 + 8192 >> 14, local648 * arg7[5] + 8192 >> 14, local648 * arg7[8] + 8192 >> 14 };
			local1174 = local255 * local389 + 8192 >> 14;
			local1199 = local57 * local408 + 8192 >> 14;
			@Pc(2121) int local2121 = local1199 + local1012;
			local1204 = local63 * local648 + 8192 >> 14;
			@Pc(2133) int local2133 = local1174 + local689;
			@Pc(2137) int local2137 = local1204 + local1020;
			@Pc(2140) int[] local2140 = new int[9];
			@Pc(2146) int local2146;
			for (local1212 = 0; local1212 < 3; local1212++) {
				for (local2146 = 0; local2146 < 3; local2146++) {
					local1217 = 0;
					for (local1221 = 0; local1221 < 3; local1221++) {
						local1217 += arg7[local1221 + local1212 * 3] * local1993[local1221 * 3 + local2146];
					}
					local2140[local1212 * 3 + local2146] = local1217 + 8192 >> 14;
				}
			}
			local2146 = local2137 * arg7[2] + arg7[1] * local2121 + local2133 * arg7[0] + 8192 >> 14;
			local1217 = arg7[4] * local2121 + arg7[3] * local2133 + local2137 * arg7[5] + 8192 >> 14;
			local1217 += local35;
			local2146 += local29;
			local1221 = arg7[7] * local2121 + local2133 * arg7[6] + local2137 * arg7[8] + 8192 >> 14;
			local1221 += local41;
			for (local1225 = 0; local1225 < local8; local1225++) {
				local1227 = arg1[local1225];
				if (local1227 < this.anIntArrayArray77.length) {
					local1355 = this.anIntArrayArray77[local1227];
					for (local1357 = 0; local1357 < local1355.length; local1357++) {
						local1361 = local1355[local1357];
						if (this.aShortArray98 == null || (this.aShortArray98[local1361] & arg6) != 0) {
							local1365 = this.anIntArray422[local1361] * local2140[0] + this.anIntArray427[local1361] * local2140[1] + local2140[2] * this.anIntArray425[local1361] + 8192 >> 14;
							local1367 = local2140[3] * this.anIntArray422[local1361] + local2140[4] * this.anIntArray427[local1361] + this.anIntArray425[local1361] * local2140[5] + 8192 >> 14;
							local1497 = this.anIntArray425[local1361] * local2140[8] + local2140[7] * this.anIntArray427[local1361] + this.anIntArray422[local1361] * local2140[6] + 8192 >> 14;
							@Pc(2414) int local2414 = local1365 + local2146;
							@Pc(2418) int local2418 = local1367 + local1217;
							@Pc(2422) int local2422 = local1497 + local1221;
							this.anIntArray422[local1361] = local2414;
							this.anIntArray427[local1361] = local2418;
							this.anIntArray425[local1361] = local2422;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean464) {
			this.method5635();
		}
		@Pc(16) int local16 = this.anInt6520 + arg4;
		@Pc(22) int local22 = arg4 + this.anInt6529;
		@Pc(28) int local28 = arg6 + this.anInt6557;
		@Pc(33) int local33 = this.anInt6579 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local22 + arg2.anInt8647 >> arg2.anInt8641 >= arg2.anInt8650 || local28 < 0 || arg2.anInt8645 <= local33 + arg2.anInt8647 >> arg2.anInt8641)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8650 <= arg3.anInt8647 + local22 >> arg3.anInt8641 || local28 < 0 || arg3.anInt8647 + local33 >> arg3.anInt8641 >= arg3.anInt8645) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8641;
			local22 = arg2.anInt8647 + local22 - 1 >> arg2.anInt8641;
			local28 >>= arg2.anInt8641;
			local33 = arg2.anInt8647 + local33 - 1 >> arg2.anInt8641;
			if (arg5 == arg2.method7447(local28, local16) && arg2.method7447(local28, local22) == arg5 && arg2.method7447(local33, local16) == arg5 && arg2.method7447(local33, local22) == arg5) {
				return;
			}
		}
		@Pc(221) int local221;
		if (arg0 == 1) {
			for (local221 = 0; local221 < this.anInt6571; local221++) {
				this.anIntArray427[local221] = this.anIntArray427[local221] + arg2.method7446(this.anIntArray422[local221] + arg4, arg6 + this.anIntArray425[local221]) - arg5;
			}
		} else {
			@Pc(229) int local229;
			@Pc(237) int local237;
			if (arg0 == 2) {
				local221 = this.anInt6532;
				if (local221 == 0) {
					return;
				}
				for (local229 = 0; local229 < this.anInt6571; local229++) {
					local237 = (this.anIntArray427[local229] << 16) / local221;
					if (local237 < arg1) {
						this.anIntArray427[local229] += (arg2.method7446(arg4 + this.anIntArray422[local229], arg6 + this.anIntArray425[local229]) - arg5) * (-local237 + arg1) / arg1;
					}
				}
			} else {
				@Pc(245) int local245;
				if (arg0 == 3) {
					local221 = (arg1 & 0xFF) * 4;
					local229 = (arg1 >> 8 & 0xFF) * 4;
					local237 = (arg1 >> 16 & 0xFF) << 6;
					local245 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local221 >> 1) < 0 || arg2.anInt8650 << arg2.anInt8641 <= (local221 >> 1) + arg4 + arg2.anInt8647 || arg6 - (local229 >> 1) < 0 || arg2.anInt8645 << arg2.anInt8641 <= arg2.anInt8647 + arg6 + (local229 >> 1)) {
						return;
					}
					this.method6619(arg2, arg4, local245, local229, local221, local237, arg6, arg5);
				} else if (arg0 == 4) {
					local221 = this.anInt6542 - this.anInt6532;
					for (local229 = 0; local229 < this.anInt6571; local229++) {
						this.anIntArray427[local229] -= arg5 - arg3.method7446(arg4 + this.anIntArray422[local229], arg6 + this.anIntArray425[local229]) - local221;
					}
				} else if (arg0 == 5) {
					local221 = this.anInt6542 - this.anInt6532;
					for (local229 = 0; local229 < this.anInt6571; local229++) {
						local237 = arg4 + this.anIntArray422[local229];
						local245 = arg6 + this.anIntArray425[local229];
						@Pc(355) int local355 = arg2.method7446(local237, local245);
						@Pc(361) int local361 = arg3.method7446(local237, local245);
						@Pc(369) int local369 = local355 - local361 - arg1;
						this.anIntArray427[local229] = local355 + (local369 * ((this.anIntArray427[local229] << 8) / local221) >> 8) - arg5;
					}
				}
			}
		}
		this.method5627();
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "()[Lclient!hv;")
	@Override
	public Class156[] method6625() {
		return this.aClass156Array4;
	}

	@OriginalMember(owner = "client!nda", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class290.anIntArray546[arg0];
		@Pc(13) int local13 = Class290.anIntArray547[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6571; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray427[local15] - local9 * this.anIntArray425[local15] >> 14;
			this.anIntArray425[local15] = this.anIntArray425[local15] * local13 + local9 * this.anIntArray427[local15] >> 14;
			this.anIntArray427[local15] = local34;
		}
		this.method5627();
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!nda", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort87;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V")
	public void method5631() {
		if (this.aClass57_3 != null) {
			this.aClass57_3.method1642();
		}
		if (this.aClass57_2 != null) {
			this.aClass57_2.method1642();
		}
		if (this.aClass57_4 != null) {
			this.aClass57_4.method1642();
		}
		if (this.aClass57_1 != null) {
			this.aClass57_1.method1642();
		}
		if (this.aClass307_1 != null) {
			this.aClass307_1.method7068();
		}
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "()V")
	@Override
	protected void method6620() {
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class193 method6609(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) Class193_Sub2 local22;
		@Pc(26) Class193_Sub2 local26;
		if (arg0 == 1) {
			local26 = this.aClass13_Sub3_14.aClass193_Sub2_22;
			local22 = this.aClass13_Sub3_14.aClass193_Sub2_26;
		} else if (arg0 == 2) {
			local26 = this.aClass13_Sub3_14.aClass193_Sub2_23;
			local22 = this.aClass13_Sub3_14.aClass193_Sub2_21;
		} else if (arg0 == 3) {
			local22 = this.aClass13_Sub3_14.aClass193_Sub2_30;
			local26 = this.aClass13_Sub3_14.aClass193_Sub2_25;
		} else if (arg0 == 4) {
			local22 = this.aClass13_Sub3_14.aClass193_Sub2_27;
			local26 = this.aClass13_Sub3_14.aClass193_Sub2_29;
		} else if (arg0 == 5) {
			local22 = this.aClass13_Sub3_14.aClass193_Sub2_24;
			local26 = this.aClass13_Sub3_14.aClass193_Sub2_28;
		} else {
			local22 = local26 = new Class193_Sub2(this.aClass13_Sub3_14, 0, 0, true, false);
		}
		return this.method5639(arg1, local22, local26, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!nda", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean464) {
			this.method5635();
		}
		return this.anInt6529;
	}

	@OriginalMember(owner = "client!nda", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass57_3 != null) {
			this.aClass57_3.aBoolean157 = Static328.method4993(this.anInt6537, arg0);
		}
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean157 = Static352.method5274(this.anInt6537, arg0);
		}
		if (this.aClass57_4 != null) {
			this.aClass57_4.aBoolean157 = Static591.method8346(arg0, this.anInt6537);
		}
		if (this.aClass57_1 != null) {
			this.aClass57_1.aBoolean157 = Static508.method7063(this.anInt6537, arg0);
		}
		this.anInt6570 = arg0;
		this.aBoolean462 = true;
		if (this.aClass241_1 != null && (this.anInt6570 & 0x10000) == 0) {
			this.aByteArray66 = this.aClass241_1.aByteArray68;
			this.aShortArray94 = this.aClass241_1.aShortArray101;
			this.aShortArray89 = this.aClass241_1.aShortArray99;
			this.aShortArray91 = this.aClass241_1.aShortArray100;
			this.aClass241_1 = null;
		}
		this.method5628();
	}

	@OriginalMember(owner = "client!nda", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean464) {
			this.method5635();
		}
		return this.anInt6520;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6576; local7++) {
			local16 = this.aShortArray90[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(61) int local61 = local16 & 0x7F;
			if (arg2 != -1) {
				local61 -= -(arg3 * (arg2 - local61) >> 7);
			}
			this.aShortArray90[local7] = (short) (local22 << 10 | local28 << 7 | local61);
		}
		if (this.aClass340Array1 != null) {
			for (local16 = 0; local16 < this.anInt6507; local16++) {
				@Pc(110) Class340 local110 = this.aClass340Array1[local16];
				@Pc(115) Class234 local115 = this.aClass234Array1[local16];
				local115.anInt6355 = local115.anInt6355 & 0xFF000000 | Static347.anIntArray701[this.aShortArray90[local110.anInt9245] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5632();
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "()Z")
	@Override
	public boolean method6618() {
		if (this.aShortArray96 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray96.length; local12++) {
			if (this.aShortArray96[local12] != -1 && !this.aClass13_Sub3_14.anInterface2_12.method6026(this.aShortArray96[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(I)V")
	private void method5632() {
		if (this.aClass57_4 != null) {
			this.aClass57_4.aBoolean158 = false;
		}
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(B)V")
	private void method5633() {
		if (this.anInt6580 == 0) {
			return;
		}
		if (this.method5636() && this.method5642()) {
			this.aClass13_Sub3_14.method8192(0, this.aClass57_3.anInterface10_2);
			this.aClass13_Sub3_14.method8192(1, this.aClass57_4.anInterface10_2);
			this.aClass13_Sub3_14.method8192(2, this.aClass57_2.anInterface10_2);
			@Pc(56) boolean local56;
			if ((this.anInt6537 & 0x37) == 0) {
				this.aClass13_Sub3_14.method8302(false);
				local56 = false;
				this.aClass13_Sub3_14.method8243(this.aClass13_Sub3_14.aClass258_21);
			} else {
				this.aClass13_Sub3_14.method8302(true);
				local56 = true;
				this.aClass13_Sub3_14.method8192(3, this.aClass57_1.anInterface10_2);
				this.aClass13_Sub3_14.method8243(this.aClass13_Sub3_14.aClass258_20);
			}
			for (@Pc(89) int local89 = 0; local89 < this.anIntArray426.length; local89++) {
				@Pc(96) int local96 = this.anIntArray428[local89];
				@Pc(103) int local103 = this.anIntArray428[local89 + 1];
				@Pc(110) int local110 = this.aShortArray96[local96] & 0xFFFF;
				if (local110 == 65535) {
					local110 = -1;
				}
				this.aClass13_Sub3_14.method8261(true, local56, local110);
				this.aClass13_Sub3_14.method8188(this.anIntArray426[local89], this.anIntArray423[local89], Static339.aClass191_4, this.aClass307_1.anInterface11_4, local103 - local96, local96 * 3);
			}
		}
		this.method5628();
	}

	@OriginalMember(owner = "client!nda", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6531; local3++) {
			this.anIntArray422[local3] = this.anIntArray422[local3] + 7 >> 4;
			this.anIntArray427[local3] = this.anIntArray427[local3] + 7 >> 4;
			this.anIntArray425[local3] = this.anIntArray425[local3] + 7 >> 4;
		}
		this.method5627();
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6611(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class193_Sub2 local8 = (Class193_Sub2) arg0;
		if (this.anInt6576 == 0 || local8.anInt6576 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt6571;
		@Pc(27) int[] local27 = local8.anIntArray422;
		@Pc(30) int[] local30 = local8.anIntArray427;
		@Pc(33) int[] local33 = local8.anIntArray425;
		@Pc(36) short[] local36 = local8.aShortArray89;
		@Pc(39) short[] local39 = local8.aShortArray91;
		@Pc(42) short[] local42 = local8.aShortArray94;
		@Pc(45) byte[] local45 = local8.aByteArray66;
		@Pc(54) short[] local54;
		@Pc(50) short[] local50;
		@Pc(56) short[] local56;
		@Pc(52) byte[] local52;
		if (this.aClass241_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local56 = this.aClass241_1.aShortArray101;
			local50 = this.aClass241_1.aShortArray100;
			local54 = this.aClass241_1.aShortArray99;
			local52 = this.aClass241_1.aByteArray68;
		}
		@Pc(85) short[] local85;
		@Pc(79) short[] local79;
		@Pc(81) short[] local81;
		@Pc(83) byte[] local83;
		if (local8.aClass241_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local83 = local8.aClass241_1.aByteArray68;
			local81 = local8.aClass241_1.aShortArray101;
			local85 = local8.aClass241_1.aShortArray99;
			local79 = local8.aClass241_1.aShortArray100;
		}
		@Pc(106) int[] local106 = local8.anIntArray424;
		@Pc(109) short[] local109 = local8.aShortArray88;
		if (!local8.aBoolean464) {
			local8.method5635();
		}
		@Pc(118) int local118 = local8.anInt6532;
		@Pc(121) int local121 = local8.anInt6542;
		@Pc(124) int local124 = local8.anInt6520;
		@Pc(127) int local127 = local8.anInt6529;
		@Pc(130) int local130 = local8.anInt6557;
		@Pc(133) int local133 = local8.anInt6579;
		for (@Pc(135) int local135 = 0; local135 < this.anInt6571; local135++) {
			@Pc(145) int local145 = this.anIntArray427[local135] - arg2;
			if (local145 >= local118 && local121 >= local145) {
				@Pc(169) int local169 = this.anIntArray422[local135] - arg1;
				if (local124 <= local169 && local169 <= local127) {
					@Pc(192) int local192 = this.anIntArray425[local135] - arg3;
					if (local130 <= local192 && local192 <= local133) {
						@Pc(202) int local202 = -1;
						@Pc(207) int local207 = this.anIntArray424[local135];
						@Pc(214) int local214 = this.anIntArray424[local135 + 1];
						for (@Pc(216) int local216 = local207; local216 < local214; local216++) {
							local202 = this.aShortArray88[local216] - 1;
							if (local202 == -1 || this.aByteArray66[local202] != 0) {
								break;
							}
						}
						if (local202 != -1) {
							for (@Pc(251) int local251 = 0; local251 < local24; local251++) {
								if (local169 == local27[local251] && local33[local251] == local192 && local30[local251] == local145) {
									local214 = local106[local251 + 1];
									local207 = local106[local251];
									@Pc(284) int local284 = -1;
									for (@Pc(286) int local286 = local207; local286 < local214; local286++) {
										local284 = local109[local286] - 1;
										if (local284 == -1 || local45[local284] != 0) {
											break;
										}
									}
									if (local284 != -1) {
										if (local54 == null) {
											this.aClass241_1 = new Class241();
											local54 = this.aClass241_1.aShortArray99 = Static58.method1307(this.aShortArray89);
											local50 = this.aClass241_1.aShortArray100 = Static58.method1307(this.aShortArray91);
											local56 = this.aClass241_1.aShortArray101 = Static58.method1307(this.aShortArray94);
											local52 = this.aClass241_1.aByteArray68 = Static522.method7264(this.aByteArray66);
										}
										if (local85 == null) {
											@Pc(367) Class241 local367 = local8.aClass241_1 = new Class241();
											local85 = local367.aShortArray99 = Static58.method1307(local36);
											local79 = local367.aShortArray100 = Static58.method1307(local39);
											local81 = local367.aShortArray101 = Static58.method1307(local42);
											local83 = local367.aByteArray68 = Static522.method7264(local45);
										}
										@Pc(400) short local400 = this.aShortArray89[local202];
										@Pc(405) short local405 = this.aShortArray91[local202];
										@Pc(410) short local410 = this.aShortArray94[local202];
										@Pc(415) byte local415 = this.aByteArray66[local202];
										local214 = local106[local251 + 1];
										local207 = local106[local251];
										@Pc(435) int local435;
										for (@Pc(427) int local427 = local207; local427 < local214; local427++) {
											local435 = local109[local427] - 1;
											if (local435 == -1) {
												break;
											}
											if (local83[local435] != 0) {
												local85[local435] += local400;
												local79[local435] += local405;
												local81[local435] += local410;
												local83[local435] += local415;
											}
										}
										local214 = this.anIntArray424[local135 + 1];
										local415 = local45[local284];
										local410 = local42[local284];
										local207 = this.anIntArray424[local135];
										local400 = local36[local284];
										local405 = local39[local284];
										for (local435 = local207; local435 < local214; local435++) {
											@Pc(524) int local524 = this.aShortArray88[local435] - 1;
											if (local524 == -1) {
												break;
											}
											if (local52[local524] != 0) {
												local54[local524] += local400;
												local50[local524] += local405;
												local56[local524] += local410;
												local52[local524] += local415;
											}
										}
										local8.method5638();
										this.method5638();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean464) {
			this.method5635();
		}
		return this.anInt6557;
	}

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "(B)V")
	private void method5634() {
		if (this.aClass340Array1 == null) {
			return;
		}
		this.aClass13_Sub3_14.C(!this.aBoolean465);
		this.aClass13_Sub3_14.method8302(false);
		this.aClass13_Sub3_14.method8231(Static470.aClass43_5, 1);
		this.aClass13_Sub3_14.method8279(Static470.aClass43_5, 1);
		for (@Pc(40) int local40 = 0; local40 < this.anInt6507; local40++) {
			@Pc(47) Class340 local47 = this.aClass340Array1[local40];
			@Pc(52) Class234 local52 = this.aClass234Array1[local40];
			if (!local47.aBoolean661 || !this.aClass13_Sub3_14.method8093()) {
				@Pc(81) float local81 = (float) (this.anIntArray422[local47.anInt9247] + this.anIntArray422[local47.anInt9250] + this.anIntArray422[local47.anInt9249]) * 0.3333333F;
				@Pc(103) float local103 = (float) (this.anIntArray427[local47.anInt9247] + this.anIntArray427[local47.anInt9250] + this.anIntArray427[local47.anInt9249]) * 0.3333333F;
				@Pc(124) float local124 = (float) (this.anIntArray425[local47.anInt9247] + this.anIntArray425[local47.anInt9250] + this.anIntArray425[local47.anInt9249]) * 0.3333333F;
				@Pc(138) float local138 = Static250.aFloat105 + local81 * Static378.aFloat163 + local103 * Static562.aFloat184 + Static151.aFloat63 * local124;
				@Pc(152) float local152 = Static249.aFloat104 * local124 + local103 * Static315.aFloat114 + Static480.aFloat144 * local81 + Static449.aFloat129;
				@Pc(166) float local166 = Static638.aFloat210 * local103 + Static382.aFloat122 * local81 + Static419.aFloat128 * local124 + Static415.aFloat127;
				@Pc(187) float local187 = (float) (1.0D / Math.sqrt((double) (local138 * local138 + local152 * local152 + local166 * local166))) * (float) local47.anInt9244;
				@Pc(192) Class51_Sub2 local192 = this.aClass13_Sub3_14.method8193();
				local192.method3239(local47.aShort118 * local52.anInt6352 >> 7, local166 - local187 * local166, -(local152 * local187) + local152 + (float) local52.anInt6351, local47.aShort117 * local52.anInt6353 >> 7, (float) local52.anInt6354 + local138 - local187 * local138, local52.anInt6349);
				local192.method3230(this.aClass13_Sub3_14.aClass51_Sub2_17);
				this.aClass13_Sub3_14.method8290();
				@Pc(248) int local248 = local52.anInt6355;
				this.aClass13_Sub3_14.method8261(false, false, local47.aShort116);
				this.aClass13_Sub3_14.method8306(local47.aByte126);
				this.aClass13_Sub3_14.method8212(local248);
				this.aClass13_Sub3_14.method8301();
			}
		}
		this.aClass13_Sub3_14.method8279(Static287.aClass43_8, 1);
		this.aClass13_Sub3_14.method8231(Static287.aClass43_8, 1);
		this.aClass13_Sub3_14.C(true);
	}

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "(I)V")
	private void method5635() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt6571; local23++) {
			@Pc(30) int local30 = this.anIntArray422[local23];
			@Pc(35) int local35 = this.anIntArray427[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			@Pc(54) int local54 = this.anIntArray425[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local54 < local11) {
				local11 = local54;
			}
			if (local17 < local54) {
				local17 = local54;
			}
			@Pc(91) int local91 = local30 * local30 + local54 * local54;
			if (local91 > local19) {
				local19 = local91;
			}
			local91 = local35 * local35 + local54 * local54 + local30 * local30;
			if (local91 > local21) {
				local21 = local91;
			}
		}
		this.anInt6557 = local11;
		this.anInt6579 = local17;
		this.anInt6532 = local9;
		this.anInt6520 = local7;
		this.anInt6542 = local15;
		this.anInt6529 = local13;
		this.anInt6512 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt6574 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean464 = true;
	}

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "(B)Z")
	private boolean method5636() {
		@Pc(13) boolean local13 = !this.aClass57_4.aBoolean158;
		@Pc(29) boolean local29 = (this.anInt6537 & 0x37) != 0 && !this.aClass57_1.aBoolean158;
		@Pc(37) boolean local37 = !this.aClass57_3.aBoolean158;
		@Pc(45) boolean local45 = !this.aClass57_2.aBoolean158;
		if (!local37 && !local13 && !local29 && !local45) {
			return true;
		}
		@Pc(63) boolean local63 = true;
		@Pc(82) Interface10 local82;
		@Pc(98) Buffer local98;
		if (local37) {
			if (this.aClass57_3.anInterface10_1 == null) {
				this.aClass57_3.anInterface10_1 = this.aClass13_Sub3_14.method8200(this.aBoolean463);
			}
			local82 = this.aClass57_3.anInterface10_1;
			local82.method8450(12, this.anInt6524 * 12);
			local98 = local82.method8449();
			if (local98 == null) {
				local63 = false;
			} else {
				this.aClass13_Sub3_14.aNativeInterface3.copyPositions(this.anIntArray422, this.anIntArray427, this.anIntArray425, this.aShortArray86, 0, 12, this.anInt6524, local98.getAddress());
				if (local82.method8448()) {
					this.aClass57_3.anInterface10_2 = local82;
					this.aClass57_3.aBoolean158 = true;
				} else {
					local63 = false;
				}
			}
		}
		@Pc(222) short[] local222;
		@Pc(210) short[] local210;
		@Pc(218) short[] local218;
		@Pc(214) byte[] local214;
		if (local13) {
			if (this.aClass57_4.anInterface10_1 == null) {
				this.aClass57_4.anInterface10_1 = this.aClass13_Sub3_14.method8200(this.aBoolean463);
			}
			local82 = this.aClass57_4.anInterface10_1;
			local82.method8450(4, this.anInt6524 * 4);
			local98 = local82.method8449();
			if (local98 == null) {
				local63 = false;
			} else {
				if ((this.anInt6537 & 0x37) == 0) {
					if (this.aClass241_1 == null) {
						local222 = this.aShortArray89;
						local214 = this.aByteArray66;
						local218 = this.aShortArray94;
						local210 = this.aShortArray91;
					} else {
						local210 = this.aClass241_1.aShortArray100;
						local214 = this.aClass241_1.aByteArray68;
						local218 = this.aClass241_1.aShortArray101;
						local222 = this.aClass241_1.aShortArray99;
					}
					this.aClass13_Sub3_14.aNativeInterface3.copyLighting(this.aShortArray90, this.aByteArray67, this.aShortArray96, local222, local210, local218, local214, this.aShort88, this.aShort87, this.aShortArray92, 0, 4, this.anInt6524, local98.getAddress());
				} else {
					this.aClass13_Sub3_14.aNativeInterface3.copyColours(this.aShortArray90, this.aByteArray67, this.aShortArray96, this.aShort88, this.aShortArray92, 0, 4, this.anInt6524, local98.getAddress());
				}
				if (local82.method8448()) {
					this.aClass57_4.aBoolean158 = true;
					this.aClass57_4.anInterface10_2 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local29) {
			if (this.aClass57_1.anInterface10_1 == null) {
				this.aClass57_1.anInterface10_1 = this.aClass13_Sub3_14.method8200(this.aBoolean463);
			}
			local82 = this.aClass57_1.anInterface10_1;
			local82.method8450(12, this.anInt6524 * 12);
			local98 = local82.method8449();
			if (local98 == null) {
				local63 = false;
			} else {
				if (this.aClass241_1 == null) {
					local214 = this.aByteArray66;
					local210 = this.aShortArray91;
					local218 = this.aShortArray94;
					local222 = this.aShortArray89;
				} else {
					local214 = this.aClass241_1.aByteArray68;
					local222 = this.aClass241_1.aShortArray99;
					local210 = this.aClass241_1.aShortArray100;
					local218 = this.aClass241_1.aShortArray101;
				}
				this.aClass13_Sub3_14.aNativeInterface3.copyNormals(local222, local210, local218, local214, 3.0F / (float) this.aShort87, 3.0F / (float) (this.aShort87 + this.aShort87 / 2), 0, 12, this.anInt6524, local98.getAddress());
				if (local82.method8448()) {
					this.aClass57_1.aBoolean158 = true;
					this.aClass57_1.anInterface10_2 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local45) {
			if (this.aClass57_2.anInterface10_1 == null) {
				this.aClass57_2.anInterface10_1 = this.aClass13_Sub3_14.method8200(this.aBoolean463);
			}
			local82 = this.aClass57_2.anInterface10_1;
			local82.method8450(8, this.anInt6524 * 8);
			local98 = local82.method8449();
			if (local98 == null) {
				local63 = false;
			} else {
				this.aClass13_Sub3_14.aNativeInterface3.copyTexCoords(this.aFloatArray52, this.aFloatArray53, 0, 8, this.anInt6524, local98.getAddress());
				if (local82.method8448()) {
					this.aClass57_2.aBoolean158 = true;
					this.aClass57_2.anInterface10_2 = local82;
				} else {
					local63 = false;
				}
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!nda", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6576; local7++) {
			if (arg0 == this.aShortArray90[local7]) {
				this.aShortArray90[local7] = arg1;
			}
		}
		if (this.aClass340Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt6507; local34++) {
				@Pc(41) Class340 local41 = this.aClass340Array1[local34];
				@Pc(46) Class234 local46 = this.aClass234Array1[local34];
				local46.anInt6355 = Static347.anIntArray701[this.aShortArray90[local41.anInt9245] & 0xFFFF] & 0xFFFFFF | local46.anInt6355 & 0xFF000000;
			}
		}
		this.method5632();
	}

	@OriginalMember(owner = "client!nda", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass13_Sub3_14.anInterface2_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6576; local11++) {
			if (this.aShortArray96[local11] == arg0) {
				this.aShortArray96[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class271 local44 = local9.method6027(arg0 & 0xFFFF);
			local31 = local44.aByte92;
			local33 = local44.aByte91;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(64) Class271 local64 = local9.method6027(arg1 & 0xFFFF);
			local54 = local64.aByte91;
			if (local64.aByte93 != 0 || local64.aByte95 != 0) {
				this.aBoolean461 = true;
			}
			local52 = local64.aByte92;
		}
		if (!(local33 != local54 | local52 != local31)) {
			return;
		}
		if (this.aClass340Array1 != null) {
			for (@Pc(105) int local105 = 0; local105 < this.anInt6507; local105++) {
				@Pc(112) Class340 local112 = this.aClass340Array1[local105];
				@Pc(117) Class234 local117 = this.aClass234Array1[local105];
				local117.anInt6355 = Static347.anIntArray701[this.aShortArray90[local112.anInt9245] & 0xFFFF] & 0xFFFFFF | local117.anInt6355 & 0xFF000000;
			}
		}
		this.method5632();
	}

	@OriginalMember(owner = "client!nda", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort88;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IILclient!pda;ZI)Z")
	@Override
	public boolean method6623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5626(arg0, arg1, arg2, arg4, arg3, -1);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public void method6608(@OriginalArg(0) Class51 arg0) {
		@Pc(8) Class51_Sub2 local8 = (Class51_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass287Array4 != null) {
			for (local13 = 0; local13 < this.aClass287Array4.length; local13++) {
				@Pc(20) Class287 local20 = this.aClass287Array4[local13];
				@Pc(22) Class287 local22 = local20;
				if (local20.aClass287_2 != null) {
					local22 = local20.aClass287_2;
				}
				local22.anInt7580 = (int) ((float) this.anIntArray425[local20.anInt7576] * local8.aFloat70 + (float) this.anIntArray422[local20.anInt7576] * local8.aFloat68 + local8.aFloat76 * (float) this.anIntArray427[local20.anInt7576] + local8.aFloat75);
				local22.anInt7579 = (int) (local8.aFloat69 + local8.aFloat71 * (float) this.anIntArray425[local20.anInt7576] + local8.aFloat77 * (float) this.anIntArray427[local20.anInt7576] + local8.aFloat72 * (float) this.anIntArray422[local20.anInt7576]);
				local22.anInt7578 = (int) ((float) this.anIntArray427[local20.anInt7576] * local8.aFloat73 + (float) this.anIntArray422[local20.anInt7576] * local8.aFloat74 + (float) this.anIntArray425[local20.anInt7576] * local8.aFloat78 + local8.aFloat79);
				local22.anInt7586 = (int) ((float) this.anIntArray425[local20.anInt7583] * local8.aFloat70 + local8.aFloat68 * (float) this.anIntArray422[local20.anInt7583] + (float) this.anIntArray427[local20.anInt7583] * local8.aFloat76 + local8.aFloat75);
				local22.anInt7581 = (int) (local8.aFloat69 + local8.aFloat77 * (float) this.anIntArray427[local20.anInt7583] + local8.aFloat72 * (float) this.anIntArray422[local20.anInt7583] + local8.aFloat71 * (float) this.anIntArray425[local20.anInt7583]);
				local22.anInt7571 = (int) ((float) this.anIntArray425[local20.anInt7583] * local8.aFloat78 + local8.aFloat73 * (float) this.anIntArray427[local20.anInt7583] + local8.aFloat74 * (float) this.anIntArray422[local20.anInt7583] + local8.aFloat79);
				local22.anInt7584 = (int) (local8.aFloat75 + local8.aFloat68 * (float) this.anIntArray422[local20.anInt7574] + (float) this.anIntArray427[local20.anInt7574] * local8.aFloat76 + local8.aFloat70 * (float) this.anIntArray425[local20.anInt7574]);
				local22.anInt7585 = (int) (local8.aFloat69 + (float) this.anIntArray425[local20.anInt7574] * local8.aFloat71 + (float) this.anIntArray427[local20.anInt7574] * local8.aFloat77 + (float) this.anIntArray422[local20.anInt7574] * local8.aFloat72);
				local22.anInt7575 = (int) (local8.aFloat79 + (float) this.anIntArray422[local20.anInt7574] * local8.aFloat74 + (float) this.anIntArray427[local20.anInt7574] * local8.aFloat73 + local8.aFloat78 * (float) this.anIntArray425[local20.anInt7574]);
			}
		}
		if (this.aClass156Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass156Array4.length; local13++) {
			@Pc(365) Class156 local365 = this.aClass156Array4[local13];
			@Pc(367) Class156 local367 = local365;
			if (local365.aClass156_1 != null) {
				local367 = local365.aClass156_1;
			}
			if (local365.aClass51_4 == null) {
				local365.aClass51_4 = local8.method6712();
			} else {
				local365.aClass51_4.method6704(local8);
			}
			local367.anInt4165 = (int) (local8.aFloat75 + (float) this.anIntArray427[local365.anInt4163] * local8.aFloat76 + local8.aFloat68 * (float) this.anIntArray422[local365.anInt4163] + (float) this.anIntArray425[local365.anInt4163] * local8.aFloat70);
			local367.anInt4166 = (int) ((float) this.anIntArray425[local365.anInt4163] * local8.aFloat71 + (float) this.anIntArray427[local365.anInt4163] * local8.aFloat77 + local8.aFloat72 * (float) this.anIntArray422[local365.anInt4163] + local8.aFloat69);
			local367.anInt4160 = (int) (local8.aFloat79 + (float) this.anIntArray427[local365.anInt4163] * local8.aFloat73 + local8.aFloat74 * (float) this.anIntArray422[local365.anInt4163] + local8.aFloat78 * (float) this.anIntArray425[local365.anInt4163]);
		}
	}

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "(B)V")
	private void method5637() {
		if (this.aClass307_1 != null) {
			this.aClass307_1.aBoolean601 = false;
		}
	}

	@OriginalMember(owner = "client!nda", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort87 = (short) arg0;
		this.method5627();
		this.method5638();
	}

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class290.anIntArray546[arg0];
		@Pc(13) int local13 = Class290.anIntArray547[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6571; local15++) {
			local33 = this.anIntArray425[local15] * local9 + this.anIntArray422[local15] * local13 >> 14;
			this.anIntArray425[local15] = local13 * this.anIntArray425[local15] - this.anIntArray422[local15] * local9 >> 14;
			this.anIntArray422[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6524; local33++) {
			@Pc(83) int local83 = local13 * this.aShortArray89[local33] + this.aShortArray94[local33] * local9 >> 14;
			this.aShortArray94[local33] = (short) (local13 * this.aShortArray94[local33] - local9 * this.aShortArray89[local33] >> 14);
			this.aShortArray89[local33] = (short) local83;
		}
		this.method5627();
		this.method5638();
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "(B)V")
	private void method5638() {
		if ((this.anInt6537 & 0x37) == 0) {
			if (this.aClass57_4 != null) {
				this.aClass57_4.aBoolean158 = false;
			}
		} else if (this.aClass57_1 != null) {
			this.aClass57_1.aBoolean158 = false;
		}
	}

	@OriginalMember(owner = "client!nda", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt6570;
	}

	@OriginalMember(owner = "client!nda", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort88 = (short) arg0;
		this.method5632();
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!nda;ZLclient!nda;ZZ)Lclient!ka;")
	private Class193 method5639(@OriginalArg(0) int arg0, @OriginalArg(1) Class193_Sub2 arg1, @OriginalArg(3) Class193_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg1.anInt6576 = this.anInt6576;
		arg1.anInt6570 = arg0;
		arg1.aShort88 = this.aShort88;
		arg1.anInt6580 = this.anInt6580;
		arg1.aShort87 = this.aShort87;
		if ((arg0 & 0x100) == 0) {
			arg1.aBoolean465 = this.aBoolean465;
		} else {
			arg1.aBoolean465 = true;
		}
		arg1.aBoolean461 = this.aBoolean461;
		arg1.anInt6507 = this.anInt6507;
		arg1.anInt6537 = this.anInt6537;
		arg1.anInt6571 = this.anInt6571;
		arg1.anInt6524 = this.anInt6524;
		arg1.anInt6531 = this.anInt6531;
		@Pc(67) boolean local67 = Static314.method4856(arg0, this.anInt6537);
		@Pc(73) boolean local73 = Static68.method1588(this.anInt6537, arg0);
		@Pc(79) boolean local79 = Static57.method1303(this.anInt6537, arg0);
		@Pc(85) boolean local85 = local67 | local73 | local79;
		@Pc(200) int local200;
		if (local85) {
			if (!local67) {
				arg1.anIntArray422 = this.anIntArray422;
			} else if (arg2.anIntArray422 == null || arg2.anIntArray422.length < this.anInt6531) {
				arg1.anIntArray422 = arg2.anIntArray422 = new int[this.anInt6531];
			} else {
				arg1.anIntArray422 = arg2.anIntArray422;
			}
			if (!local73) {
				arg1.anIntArray427 = this.anIntArray427;
			} else if (arg2.anIntArray427 == null || arg2.anIntArray427.length < this.anInt6531) {
				arg1.anIntArray427 = arg2.anIntArray427 = new int[this.anInt6531];
			} else {
				arg1.anIntArray427 = arg2.anIntArray427;
			}
			if (!local79) {
				arg1.anIntArray425 = this.anIntArray425;
			} else if (arg2.anIntArray425 == null || arg2.anIntArray425.length < this.anInt6531) {
				arg1.anIntArray425 = arg2.anIntArray425 = new int[this.anInt6531];
			} else {
				arg1.anIntArray425 = arg2.anIntArray425;
			}
			for (local200 = 0; local200 < this.anInt6531; local200++) {
				if (local67) {
					arg1.anIntArray422[local200] = this.anIntArray422[local200];
				}
				if (local73) {
					arg1.anIntArray427[local200] = this.anIntArray427[local200];
				}
				if (local79) {
					arg1.anIntArray425[local200] = this.anIntArray425[local200];
				}
			}
		} else {
			arg1.anIntArray427 = this.anIntArray427;
			arg1.anIntArray425 = this.anIntArray425;
			arg1.anIntArray422 = this.anIntArray422;
		}
		if (Static328.method4993(this.anInt6537, arg0)) {
			arg1.aClass57_3 = arg2.aClass57_3;
			arg1.aClass57_3.anInterface10_2 = this.aClass57_3.anInterface10_2;
			arg1.aClass57_3.aBoolean157 = true;
			arg1.aClass57_3.aBoolean158 = this.aClass57_3.aBoolean158;
		} else if (Static418.method6107(this.anInt6537, arg0)) {
			arg1.aClass57_3 = this.aClass57_3;
		} else {
			arg1.aClass57_3 = null;
		}
		if (Static566.method7893(this.anInt6537, arg0)) {
			if (arg2.aShortArray90 == null || this.anInt6576 > arg2.aShortArray90.length) {
				arg1.aShortArray90 = arg2.aShortArray90 = new short[this.anInt6576];
			} else {
				arg1.aShortArray90 = arg2.aShortArray90;
			}
			for (local200 = 0; local200 < this.anInt6576; local200++) {
				arg1.aShortArray90[local200] = this.aShortArray90[local200];
			}
		} else {
			arg1.aShortArray90 = this.aShortArray90;
		}
		if (Static476.method6756(arg0, this.anInt6537)) {
			if (arg2.aByteArray67 == null || this.anInt6576 > arg2.aByteArray67.length) {
				arg1.aByteArray67 = arg2.aByteArray67 = new byte[this.anInt6576];
			} else {
				arg1.aByteArray67 = arg2.aByteArray67;
			}
			for (local200 = 0; local200 < this.anInt6576; local200++) {
				arg1.aByteArray67[local200] = this.aByteArray67[local200];
			}
		} else {
			arg1.aByteArray67 = this.aByteArray67;
		}
		if (Static591.method8346(arg0, this.anInt6537)) {
			arg1.aClass57_4 = arg2.aClass57_4;
			arg1.aClass57_4.aBoolean157 = true;
			arg1.aClass57_4.aBoolean158 = this.aClass57_4.aBoolean158;
			arg1.aClass57_4.anInterface10_2 = this.aClass57_4.anInterface10_2;
		} else if (Static479.method6801(this.anInt6537, arg0)) {
			arg1.aClass57_4 = this.aClass57_4;
		} else {
			arg1.aClass57_4 = null;
		}
		@Pc(567) int local567;
		if (Static457.method7542(this.anInt6537, arg0)) {
			if (arg2.aShortArray89 == null || this.anInt6524 > arg2.aShortArray89.length) {
				local200 = this.anInt6524;
				arg1.aShortArray91 = arg2.aShortArray91 = new short[local200];
				arg1.aShortArray89 = arg2.aShortArray89 = new short[local200];
				arg1.aShortArray94 = arg2.aShortArray94 = new short[local200];
			} else {
				arg1.aShortArray94 = arg2.aShortArray94;
				arg1.aShortArray91 = arg2.aShortArray91;
				arg1.aShortArray89 = arg2.aShortArray89;
			}
			if (this.aClass241_1 == null) {
				arg1.aClass241_1 = null;
				for (local200 = 0; local200 < this.anInt6524; local200++) {
					arg1.aShortArray89[local200] = this.aShortArray89[local200];
					arg1.aShortArray91[local200] = this.aShortArray91[local200];
					arg1.aShortArray94[local200] = this.aShortArray94[local200];
				}
			} else {
				if (arg2.aClass241_1 == null) {
					arg2.aClass241_1 = new Class241();
				}
				@Pc(555) Class241 local555 = arg1.aClass241_1 = arg2.aClass241_1;
				if (local555.aShortArray99 == null || this.anInt6524 > local555.aShortArray99.length) {
					local567 = this.anInt6524;
					local555.aByteArray68 = new byte[local567];
					local555.aShortArray99 = new short[local567];
					local555.aShortArray100 = new short[local567];
					local555.aShortArray101 = new short[local567];
				}
				for (local567 = 0; local567 < this.anInt6524; local567++) {
					arg1.aShortArray89[local567] = this.aShortArray89[local567];
					arg1.aShortArray91[local567] = this.aShortArray91[local567];
					arg1.aShortArray94[local567] = this.aShortArray94[local567];
					local555.aShortArray99[local567] = this.aClass241_1.aShortArray99[local567];
					local555.aShortArray100[local567] = this.aClass241_1.aShortArray100[local567];
					local555.aShortArray101[local567] = this.aClass241_1.aShortArray101[local567];
					local555.aByteArray68[local567] = this.aClass241_1.aByteArray68[local567];
				}
			}
			arg1.aByteArray66 = this.aByteArray66;
		} else {
			arg1.aShortArray89 = this.aShortArray89;
			arg1.aByteArray66 = this.aByteArray66;
			arg1.aShortArray91 = this.aShortArray91;
			arg1.aClass241_1 = this.aClass241_1;
			arg1.aShortArray94 = this.aShortArray94;
		}
		if (Static508.method7063(this.anInt6537, arg0)) {
			arg1.aClass57_1 = arg2.aClass57_1;
			arg1.aClass57_1.aBoolean158 = this.aClass57_1.aBoolean158;
			arg1.aClass57_1.anInterface10_2 = this.aClass57_1.anInterface10_2;
			arg1.aClass57_1.aBoolean157 = true;
		} else if (Static113.method2019(this.anInt6537, arg0)) {
			arg1.aClass57_1 = this.aClass57_1;
		} else {
			arg1.aClass57_1 = null;
		}
		if (Static603.method8485(this.anInt6537, arg0)) {
			if (arg2.aFloatArray52 == null || this.anInt6576 > arg2.aFloatArray52.length) {
				local200 = this.anInt6524;
				arg1.aFloatArray52 = arg2.aFloatArray52 = new float[local200];
				arg1.aFloatArray53 = arg2.aFloatArray53 = new float[local200];
			} else {
				arg1.aFloatArray52 = arg2.aFloatArray52;
				arg1.aFloatArray53 = arg2.aFloatArray53;
			}
			for (local200 = 0; local200 < this.anInt6524; local200++) {
				arg1.aFloatArray52[local200] = this.aFloatArray52[local200];
				arg1.aFloatArray53[local200] = this.aFloatArray53[local200];
			}
		} else {
			arg1.aFloatArray53 = this.aFloatArray53;
			arg1.aFloatArray52 = this.aFloatArray52;
		}
		if (Static352.method5274(this.anInt6537, arg0)) {
			arg1.aClass57_2 = arg2.aClass57_2;
			arg1.aClass57_2.aBoolean158 = this.aClass57_2.aBoolean158;
			arg1.aClass57_2.anInterface10_2 = this.aClass57_2.anInterface10_2;
			arg1.aClass57_2.aBoolean157 = true;
		} else if (Static444.method6367(arg0, this.anInt6537)) {
			arg1.aClass57_2 = this.aClass57_2;
		} else {
			arg1.aClass57_2 = null;
		}
		if (Static228.method3698(this.anInt6537, arg0)) {
			if (arg2.aShortArray87 == null || this.anInt6576 > arg2.aShortArray87.length) {
				local200 = this.anInt6576;
				arg1.aShortArray97 = arg2.aShortArray97 = new short[local200];
				arg1.aShortArray87 = arg2.aShortArray87 = new short[local200];
				arg1.aShortArray95 = arg2.aShortArray95 = new short[local200];
			} else {
				arg1.aShortArray87 = arg2.aShortArray87;
				arg1.aShortArray97 = arg2.aShortArray97;
				arg1.aShortArray95 = arg2.aShortArray95;
			}
			for (local200 = 0; local200 < this.anInt6576; local200++) {
				arg1.aShortArray87[local200] = this.aShortArray87[local200];
				arg1.aShortArray95[local200] = this.aShortArray95[local200];
				arg1.aShortArray97[local200] = this.aShortArray97[local200];
			}
		} else {
			arg1.aShortArray95 = this.aShortArray95;
			arg1.aShortArray87 = this.aShortArray87;
			arg1.aShortArray97 = this.aShortArray97;
		}
		if (Static394.method5835(arg0, this.anInt6537)) {
			arg1.aClass307_1 = arg2.aClass307_1;
			arg1.aClass307_1.anInterface11_4 = this.aClass307_1.anInterface11_4;
			arg1.aClass307_1.aBoolean601 = this.aClass307_1.aBoolean601;
			arg1.aClass307_1.aBoolean600 = true;
		} else if (Static345.method8049(this.anInt6537, arg0)) {
			arg1.aClass307_1 = this.aClass307_1;
		} else {
			arg1.aClass307_1 = null;
		}
		if (Static278.method4492(arg0, this.anInt6537)) {
			if (arg2.aShortArray96 == null || arg2.aShortArray96.length < this.anInt6576) {
				local200 = this.anInt6576;
				arg1.aShortArray96 = arg2.aShortArray96 = new short[local200];
			} else {
				arg1.aShortArray96 = arg2.aShortArray96;
			}
			for (local200 = 0; local200 < this.anInt6576; local200++) {
				arg1.aShortArray96[local200] = this.aShortArray96[local200];
			}
		} else {
			arg1.aShortArray96 = this.aShortArray96;
		}
		if (!Static12.method150(this.anInt6537, arg0)) {
			arg1.aClass234Array1 = this.aClass234Array1;
		} else if (arg2.aClass234Array1 == null || this.anInt6507 > arg2.aClass234Array1.length) {
			local200 = this.anInt6507;
			arg1.aClass234Array1 = arg2.aClass234Array1 = new Class234[local200];
			for (local567 = 0; local567 < this.anInt6507; local567++) {
				arg1.aClass234Array1[local567] = this.aClass234Array1[local567].method5471();
			}
		} else {
			arg1.aClass234Array1 = arg2.aClass234Array1;
			for (local200 = 0; local200 < this.anInt6507; local200++) {
				arg1.aClass234Array1[local200].method5472(this.aClass234Array1[local200]);
			}
		}
		arg1.anIntArray428 = this.anIntArray428;
		arg1.aShortArray98 = this.aShortArray98;
		arg1.aClass340Array1 = this.aClass340Array1;
		arg1.anIntArray426 = this.anIntArray426;
		arg1.aClass287Array4 = this.aClass287Array4;
		arg1.aShortArray88 = this.aShortArray88;
		arg1.anIntArrayArray79 = this.anIntArrayArray79;
		arg1.aShortArray92 = this.aShortArray92;
		arg1.anIntArray424 = this.anIntArray424;
		arg1.anIntArrayArray78 = this.anIntArrayArray78;
		arg1.anIntArrayArray77 = this.anIntArrayArray77;
		arg1.aShortArray86 = this.aShortArray86;
		arg1.aClass156Array4 = this.aClass156Array4;
		arg1.aShortArray93 = this.aShortArray93;
		if (this.aBoolean464) {
			arg1.anInt6574 = this.anInt6574;
			arg1.anInt6542 = this.anInt6542;
			arg1.anInt6532 = this.anInt6532;
			arg1.anInt6579 = this.anInt6579;
			arg1.anInt6529 = this.anInt6529;
			arg1.anInt6512 = this.anInt6512;
			arg1.anInt6520 = this.anInt6520;
			arg1.anInt6557 = this.anInt6557;
			arg1.aBoolean464 = true;
		} else {
			arg1.aBoolean464 = false;
		}
		arg1.anIntArray423 = this.anIntArray423;
		return arg1;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!pda;Lclient!wt;I)V")
	@Override
	public void method6612(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class16_Sub10 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6524 == 0) {
			return;
		}
		@Pc(13) Class51_Sub2 local13 = this.aClass13_Sub3_14.aClass51_Sub2_16;
		@Pc(16) Class51_Sub2 local16 = (Class51_Sub2) arg0;
		if (!this.aBoolean464) {
			this.method5635();
		}
		Static415.aFloat127 = local16.aFloat79 * local13.aFloat78 + local16.aFloat75 * local13.aFloat74 + local13.aFloat73 * local16.aFloat69 + local13.aFloat79;
		Static638.aFloat210 = local13.aFloat74 * local16.aFloat76 + local13.aFloat73 * local16.aFloat77 + local16.aFloat73 * local13.aFloat78;
		@Pc(69) float local69 = (float) this.anInt6532 * Static638.aFloat210 + Static415.aFloat127;
		@Pc(77) float local77 = Static415.aFloat127 + (float) this.anInt6542 * Static638.aFloat210;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local69 > local77) {
			local87 = local77 - (float) this.anInt6512;
			local93 = (float) this.anInt6512 + local69;
		} else {
			local87 = (float) -this.anInt6512 + local69;
			local93 = (float) this.anInt6512 + local77;
		}
		if (local87 >= this.aClass13_Sub3_14.aFloat191 || local93 <= (float) this.aClass13_Sub3_14.anInt9723) {
			return;
		}
		Static562.aFloat184 = local16.aFloat77 * local13.aFloat76 + local13.aFloat68 * local16.aFloat76 + local13.aFloat70 * local16.aFloat73;
		Static250.aFloat105 = local13.aFloat75 + local13.aFloat70 * local16.aFloat79 + local13.aFloat76 * local16.aFloat69 + local13.aFloat68 * local16.aFloat75;
		@Pc(170) float local170 = Static250.aFloat105 + (float) this.anInt6532 * Static562.aFloat184;
		@Pc(178) float local178 = Static562.aFloat184 * (float) this.anInt6542 + Static250.aFloat105;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local170 > local178) {
			local193 = (float) this.aClass13_Sub3_14.anInt9751 * (local178 - (float) this.anInt6512);
			local204 = (local170 + (float) this.anInt6512) * (float) this.aClass13_Sub3_14.anInt9751;
		} else {
			local193 = (local170 - (float) this.anInt6512) * (float) this.aClass13_Sub3_14.anInt9751;
			local204 = (local178 + (float) this.anInt6512) * (float) this.aClass13_Sub3_14.anInt9751;
		}
		if (this.aClass13_Sub3_14.aFloat198 <= local193 / local93 || local204 / local93 <= this.aClass13_Sub3_14.aFloat190) {
			return;
		}
		Static315.aFloat114 = local16.aFloat73 * local13.aFloat71 + local16.aFloat77 * local13.aFloat77 + local16.aFloat76 * local13.aFloat72;
		Static449.aFloat129 = local13.aFloat69 + local13.aFloat71 * local16.aFloat79 + local13.aFloat72 * local16.aFloat75 + local13.aFloat77 * local16.aFloat69;
		@Pc(293) float local293 = (float) this.anInt6532 * Static315.aFloat114 + Static449.aFloat129;
		@Pc(301) float local301 = Static449.aFloat129 + Static315.aFloat114 * (float) this.anInt6542;
		@Pc(316) float local316;
		@Pc(327) float local327;
		if (local293 > local301) {
			local316 = (float) this.aClass13_Sub3_14.anInt9742 * ((float) -this.anInt6512 + local301);
			local327 = (float) this.aClass13_Sub3_14.anInt9742 * ((float) this.anInt6512 + local293);
		} else {
			local316 = (local293 - (float) this.anInt6512) * (float) this.aClass13_Sub3_14.anInt9742;
			local327 = (float) this.aClass13_Sub3_14.anInt9742 * (local301 + (float) this.anInt6512);
		}
		if (local316 / local93 >= this.aClass13_Sub3_14.aFloat194 || this.aClass13_Sub3_14.aFloat201 >= local327 / local93) {
			return;
		}
		if (arg1 != null || this.aClass340Array1 != null) {
			Static249.aFloat104 = local16.aFloat70 * local13.aFloat72 + local16.aFloat71 * local13.aFloat77 + local16.aFloat78 * local13.aFloat71;
			Static480.aFloat144 = local13.aFloat72 * local16.aFloat68 + local13.aFloat77 * local16.aFloat72 + local16.aFloat74 * local13.aFloat71;
			Static151.aFloat63 = local16.aFloat71 * local13.aFloat76 + local13.aFloat68 * local16.aFloat70 + local16.aFloat78 * local13.aFloat70;
			Static382.aFloat122 = local16.aFloat74 * local13.aFloat78 + local13.aFloat74 * local16.aFloat68 + local16.aFloat72 * local13.aFloat73;
			Static419.aFloat128 = local13.aFloat74 * local16.aFloat70 + local13.aFloat73 * local16.aFloat71 + local16.aFloat78 * local13.aFloat78;
			Static378.aFloat163 = local16.aFloat74 * local13.aFloat70 + local16.aFloat72 * local13.aFloat76 + local16.aFloat68 * local13.aFloat68;
		}
		if (arg1 != null) {
			@Pc(487) boolean local487 = false;
			@Pc(489) boolean local489 = true;
			@Pc(497) int local497 = this.anInt6529 + this.anInt6520 >> 1;
			@Pc(505) int local505 = this.anInt6579 + this.anInt6557 >> 1;
			@Pc(524) int local524 = (int) (Static151.aFloat63 * (float) local505 + Static562.aFloat184 * (float) this.anInt6532 + Static250.aFloat105 + Static378.aFloat163 * (float) local497);
			@Pc(543) int local543 = (int) (Static315.aFloat114 * (float) this.anInt6532 + Static449.aFloat129 + (float) local497 * Static480.aFloat144 + (float) local505 * Static249.aFloat104);
			@Pc(562) int local562 = (int) (Static419.aFloat128 * (float) local505 + Static382.aFloat122 * (float) local497 + Static415.aFloat127 + (float) this.anInt6532 * Static638.aFloat210);
			if (local562 >= this.aClass13_Sub3_14.anInt9723) {
				arg1.anInt10438 = local543 * this.aClass13_Sub3_14.anInt9742 / local562 + this.aClass13_Sub3_14.anInt9735;
				arg1.anInt10441 = this.aClass13_Sub3_14.anInt9751 * local524 / local562 + this.aClass13_Sub3_14.anInt9761;
			} else {
				local487 = true;
			}
			@Pc(616) int local616 = (int) ((float) local505 * Static151.aFloat63 + Static250.aFloat105 + (float) local497 * Static378.aFloat163 + Static562.aFloat184 * (float) this.anInt6542);
			@Pc(635) int local635 = (int) ((float) local505 * Static249.aFloat104 + (float) this.anInt6542 * Static315.aFloat114 + Static449.aFloat129 + (float) local497 * Static480.aFloat144);
			@Pc(654) int local654 = (int) ((float) this.anInt6542 * Static638.aFloat210 + (float) local497 * Static382.aFloat122 + Static415.aFloat127 + Static419.aFloat128 * (float) local505);
			if (this.aClass13_Sub3_14.anInt9723 <= local654) {
				arg1.anInt10440 = local616 * this.aClass13_Sub3_14.anInt9751 / local654 + this.aClass13_Sub3_14.anInt9761;
				arg1.anInt10439 = local635 * this.aClass13_Sub3_14.anInt9742 / local654 + this.aClass13_Sub3_14.anInt9735;
			} else {
				local487 = true;
			}
			if (local487) {
				if (local562 < this.aClass13_Sub3_14.anInt9723 && local654 < this.aClass13_Sub3_14.anInt9723) {
					local489 = false;
				} else {
					@Pc(723) int local723;
					@Pc(734) int local734;
					@Pc(745) int local745;
					if (local562 < this.aClass13_Sub3_14.anInt9723) {
						local723 = (local654 - this.aClass13_Sub3_14.anInt9723 << 16) / (local654 - local562);
						local734 = ((local616 - local524) * local723 >> 16) + local616;
						local745 = local635 + ((local635 - local543) * local723 >> 16);
						arg1.anInt10441 = this.aClass13_Sub3_14.anInt9761 + local734 * this.aClass13_Sub3_14.anInt9751 / this.aClass13_Sub3_14.anInt9723;
						arg1.anInt10438 = this.aClass13_Sub3_14.anInt9735 + local745 * this.aClass13_Sub3_14.anInt9742 / this.aClass13_Sub3_14.anInt9723;
					} else if (local654 < this.aClass13_Sub3_14.anInt9723) {
						local723 = (local562 - this.aClass13_Sub3_14.anInt9723 << 16) / (local562 - local654);
						local734 = local524 + ((local524 - local616) * local723 >> 16);
						local745 = local543 + ((local543 - local635) * local723 >> 16);
						arg1.anInt10441 = local734 * this.aClass13_Sub3_14.anInt9751 / this.aClass13_Sub3_14.anInt9723 + this.aClass13_Sub3_14.anInt9761;
						arg1.anInt10438 = this.aClass13_Sub3_14.anInt9742 * local745 / this.aClass13_Sub3_14.anInt9723 + this.aClass13_Sub3_14.anInt9735;
					}
				}
			}
			if (local489) {
				arg1.aBoolean758 = true;
				if (local562 > local654) {
					arg1.anInt10442 = this.aClass13_Sub3_14.anInt9761 + this.aClass13_Sub3_14.anInt9751 * (this.anInt6512 + local524) / local562 - arg1.anInt10441;
				} else {
					arg1.anInt10442 = this.aClass13_Sub3_14.anInt9761 + (local616 + this.anInt6512) * this.aClass13_Sub3_14.anInt9751 / local654 - arg1.anInt10440;
				}
			}
		}
		this.aClass13_Sub3_14.method8223();
		this.aClass13_Sub3_14.method8273(local16);
		this.method5633();
		this.method5634();
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6629(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			Static150.anInt3093 = 0;
			Static89.anInt6948 = 0;
			Static398.anInt6844 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray77.length) {
					local55 = this.anIntArrayArray77[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static398.anInt6844 += this.anIntArray422[local63];
						Static89.anInt6948 += this.anIntArray427[local63];
						Static150.anInt3093 += this.anIntArray425[local63];
						local33++;
					}
				}
			}
			if (local33 <= 0) {
				Static398.anInt6844 = local25;
				Static89.anInt6948 = local17;
				Static150.anInt3093 = local21;
			} else {
				Static150.anInt3093 = local21 + Static150.anInt3093 / local33;
				Static89.anInt6948 = Static89.anInt6948 / local33 + local17;
				Static398.anInt6844 = local25 + Static398.anInt6844 / local33;
			}
			return;
		}
		@Pc(161) int[] local161;
		@Pc(163) int local163;
		if (arg0 == 1) {
			local17 = arg3 << 4;
			local25 = arg2 << 4;
			local21 = arg4 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray77.length) {
					local161 = this.anIntArrayArray77[local35];
					for (local163 = 0; local163 < local161.length; local163++) {
						local57 = local161[local163];
						this.anIntArray422[local57] += local25;
						this.anIntArray427[local57] += local17;
						this.anIntArray425[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(279) int local279;
		@Pc(298) int local298;
		@Pc(753) int local753;
		@Pc(762) int local762;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray77.length) {
					local161 = this.anIntArrayArray77[local35];
					if ((arg5 & 0x1) == 0) {
						for (local163 = 0; local163 < local161.length; local163++) {
							local57 = local161[local163];
							this.anIntArray422[local57] -= Static398.anInt6844;
							this.anIntArray427[local57] -= Static89.anInt6948;
							this.anIntArray425[local57] -= Static150.anInt3093;
							if (arg4 != 0) {
								local63 = Class290.anIntArray546[arg4];
								local279 = Class290.anIntArray547[arg4];
								local298 = this.anIntArray427[local57] * local63 + this.anIntArray422[local57] * local279 + 16383 >> 14;
								this.anIntArray427[local57] = local279 * this.anIntArray427[local57] + 16383 - local63 * this.anIntArray422[local57] >> 14;
								this.anIntArray422[local57] = local298;
							}
							if (arg2 != 0) {
								local63 = Class290.anIntArray546[arg2];
								local279 = Class290.anIntArray547[arg2];
								local298 = this.anIntArray427[local57] * local279 + 16383 - local63 * this.anIntArray425[local57] >> 14;
								this.anIntArray425[local57] = this.anIntArray425[local57] * local279 + this.anIntArray427[local57] * local63 + 16383 >> 14;
								this.anIntArray427[local57] = local298;
							}
							if (arg3 != 0) {
								local63 = Class290.anIntArray546[arg3];
								local279 = Class290.anIntArray547[arg3];
								local298 = this.anIntArray425[local57] * local63 + local279 * this.anIntArray422[local57] + 16383 >> 14;
								this.anIntArray425[local57] = local279 * this.anIntArray425[local57] + 16383 - this.anIntArray422[local57] * local63 >> 14;
								this.anIntArray422[local57] = local298;
							}
							this.anIntArray422[local57] += Static398.anInt6844;
							this.anIntArray427[local57] += Static89.anInt6948;
							this.anIntArray425[local57] += Static150.anInt3093;
						}
					} else {
						for (local163 = 0; local163 < local161.length; local163++) {
							local57 = local161[local163];
							this.anIntArray422[local57] -= Static398.anInt6844;
							this.anIntArray427[local57] -= Static89.anInt6948;
							this.anIntArray425[local57] -= Static150.anInt3093;
							if (arg2 != 0) {
								local63 = Class290.anIntArray546[arg2];
								local279 = Class290.anIntArray547[arg2];
								local298 = this.anIntArray427[local57] * local279 + 16383 - this.anIntArray425[local57] * local63 >> 14;
								this.anIntArray425[local57] = this.anIntArray425[local57] * local279 + local63 * this.anIntArray427[local57] + 16383 >> 14;
								this.anIntArray427[local57] = local298;
							}
							if (arg4 != 0) {
								local63 = Class290.anIntArray546[arg4];
								local279 = Class290.anIntArray547[arg4];
								local298 = local279 * this.anIntArray422[local57] + local63 * this.anIntArray427[local57] + 16383 >> 14;
								this.anIntArray427[local57] = this.anIntArray427[local57] * local279 + 16383 - this.anIntArray422[local57] * local63 >> 14;
								this.anIntArray422[local57] = local298;
							}
							if (arg3 != 0) {
								local63 = Class290.anIntArray546[arg3];
								local279 = Class290.anIntArray547[arg3];
								local298 = local279 * this.anIntArray422[local57] + this.anIntArray425[local57] * local63 + 16383 >> 14;
								this.anIntArray425[local57] = local279 * this.anIntArray425[local57] + 16383 - this.anIntArray422[local57] * local63 >> 14;
								this.anIntArray422[local57] = local298;
							}
							this.anIntArray422[local57] += Static398.anInt6844;
							this.anIntArray427[local57] += Static89.anInt6948;
							this.anIntArray425[local57] += Static150.anInt3093;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray77.length) {
						local55 = this.anIntArrayArray77[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local279 = this.anIntArray424[local63];
							local298 = this.anIntArray424[local63 + 1];
							for (local753 = local279; local753 < local298; local753++) {
								local762 = this.aShortArray88[local753] - 1;
								if (local762 == -1) {
									break;
								}
								@Pc(771) int local771;
								@Pc(775) int local775;
								@Pc(793) int local793;
								if (arg4 != 0) {
									local771 = Class290.anIntArray546[arg4];
									local775 = Class290.anIntArray547[arg4];
									local793 = local771 * this.aShortArray91[local762] + local775 * this.aShortArray89[local762] + 16383 >> 14;
									this.aShortArray91[local762] = (short) (this.aShortArray91[local762] * local775 + 16383 - this.aShortArray89[local762] * local771 >> 14);
									this.aShortArray89[local762] = (short) local793;
								}
								if (arg2 != 0) {
									local771 = Class290.anIntArray546[arg2];
									local775 = Class290.anIntArray547[arg2];
									local793 = this.aShortArray91[local762] * local775 + 16383 - local771 * this.aShortArray94[local762] >> 14;
									this.aShortArray94[local762] = (short) (local771 * this.aShortArray91[local762] + local775 * this.aShortArray94[local762] + 16383 >> 14);
									this.aShortArray91[local762] = (short) local793;
								}
								if (arg3 != 0) {
									local771 = Class290.anIntArray546[arg3];
									local775 = Class290.anIntArray547[arg3];
									local793 = local775 * this.aShortArray89[local762] + this.aShortArray94[local762] * local771 + 16383 >> 14;
									this.aShortArray94[local762] = (short) (local775 * this.aShortArray94[local762] + 16383 - local771 * this.aShortArray89[local762] >> 14);
									this.aShortArray89[local762] = (short) local793;
								}
							}
						}
					}
				}
				this.method5638();
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray77.length > local35) {
					local161 = this.anIntArrayArray77[local35];
					for (local163 = 0; local163 < local161.length; local163++) {
						local57 = local161[local163];
						this.anIntArray422[local57] -= Static398.anInt6844;
						this.anIntArray427[local57] -= Static89.anInt6948;
						this.anIntArray425[local57] -= Static150.anInt3093;
						this.anIntArray422[local57] = arg2 * this.anIntArray422[local57] >> 7;
						this.anIntArray427[local57] = arg3 * this.anIntArray427[local57] >> 7;
						this.anIntArray425[local57] = this.anIntArray425[local57] * arg4 >> 7;
						this.anIntArray422[local57] += Static398.anInt6844;
						this.anIntArray427[local57] += Static89.anInt6948;
						this.anIntArray425[local57] += Static150.anInt3093;
					}
				}
			}
		} else {
			@Pc(1217) Class234 local1217;
			@Pc(1114) boolean local1114;
			@Pc(1212) Class340 local1212;
			if (arg0 == 5) {
				if (this.anIntArrayArray78 != null) {
					local1114 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray78.length > local41) {
							local55 = this.anIntArrayArray78[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local279 = arg2 * 8 + (this.aByteArray67[local63] & 0xFF);
								if (local279 < 0) {
									local279 = 0;
								} else if (local279 > 255) {
									local279 = 255;
								}
								this.aByteArray67[local63] = (byte) local279;
							}
							local1114 |= local55.length > 0;
						}
					}
					if (local1114) {
						if (this.aClass340Array1 != null) {
							for (local41 = 0; local41 < this.anInt6507; local41++) {
								local1212 = this.aClass340Array1[local41];
								local1217 = this.aClass234Array1[local41];
								local1217.anInt6355 = local1217.anInt6355 & 0xFFFFFF | 255 - (this.aByteArray67[local1212.anInt9245] & 0xFF) << 24;
							}
						}
						this.method5632();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray78 != null) {
					local1114 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray78.length > local41) {
							local55 = this.anIntArrayArray78[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local279 = this.aShortArray90[local63] & 0xFFFF;
								local298 = local279 >> 10 & 0x3F;
								local753 = local279 >> 7 & 0x7;
								@Pc(1303) int local1303 = local298 + arg2 & 0x3F;
								local753 += arg3 / 4;
								local762 = local279 & 0x7F;
								local762 += arg4;
								if (local753 < 0) {
									local753 = 0;
								} else if (local753 > 7) {
									local753 = 7;
								}
								if (local762 < 0) {
									local762 = 0;
								} else if (local762 > 127) {
									local762 = 127;
								}
								this.aShortArray90[local63] = (short) (local762 | local753 << 7 | local1303 << 10);
							}
							local1114 |= local55.length > 0;
						}
					}
					if (local1114) {
						if (this.aClass340Array1 != null) {
							for (local41 = 0; local41 < this.anInt6507; local41++) {
								local1212 = this.aClass340Array1[local41];
								local1217 = this.aClass234Array1[local41];
								local1217.anInt6355 = local1217.anInt6355 & 0xFF000000 | Static347.anIntArray701[this.aShortArray90[local1212.anInt9245] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method5632();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray79 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray79.length) {
							local161 = this.anIntArrayArray79[local35];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1217 = this.aClass234Array1[local161[local163]];
								local1217.anInt6354 += arg2;
								local1217.anInt6351 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray79 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray79.length) {
							local161 = this.anIntArrayArray79[local35];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1217 = this.aClass234Array1[local161[local163]];
								local1217.anInt6352 = local1217.anInt6352 * arg3 >> 7;
								local1217.anInt6353 = arg2 * local1217.anInt6353 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray79 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray79.length) {
						local161 = this.anIntArrayArray79[local35];
						for (local163 = 0; local163 < local161.length; local163++) {
							local1217 = this.aClass234Array1[local161[local163]];
							local1217.anInt6349 = local1217.anInt6349 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean464) {
			this.method5635();
		}
		return this.anInt6542;
	}

	@OriginalMember(owner = "client!nda", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray77 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6531; local12++) {
			this.anIntArray422[local12] <<= 0x4;
			this.anIntArray427[local12] <<= 0x4;
			this.anIntArray425[local12] <<= 0x4;
		}
		Static398.anInt6844 = 0;
		Static150.anInt3093 = 0;
		Static89.anInt6948 = 0;
		return true;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "()V")
	@Override
	protected void method6613() {
	}

	@OriginalMember(owner = "client!nda", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static398.anInt6844 = 0;
			local14 = 0;
			Static89.anInt6948 = 0;
			Static150.anInt3093 = 0;
			for (local20 = 0; local20 < this.anInt6571; local20++) {
				Static398.anInt6844 += this.anIntArray422[local20];
				Static89.anInt6948 += this.anIntArray427[local20];
				local14++;
				Static150.anInt3093 += this.anIntArray425[local20];
			}
			if (local14 <= 0) {
				Static150.anInt3093 = arg3;
				Static398.anInt6844 = arg1;
				Static89.anInt6948 = arg2;
			} else {
				Static398.anInt6844 = Static398.anInt6844 / local14 + arg1;
				Static89.anInt6948 = arg2 + Static89.anInt6948 / local14;
				Static150.anInt3093 = Static150.anInt3093 / local14 + arg3;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt6571; local14++) {
				this.anIntArray422[local14] += arg1;
				this.anIntArray427[local14] += arg2;
				this.anIntArray425[local14] += arg3;
			}
		} else {
			@Pc(169) int local169;
			@Pc(187) int local187;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt6571; local14++) {
					this.anIntArray422[local14] -= Static398.anInt6844;
					this.anIntArray427[local14] -= Static89.anInt6948;
					this.anIntArray425[local14] -= Static150.anInt3093;
					if (arg3 != 0) {
						local20 = Class290.anIntArray546[arg3];
						local169 = Class290.anIntArray547[arg3];
						local187 = this.anIntArray427[local14] * local20 + this.anIntArray422[local14] * local169 + 16383 >> 14;
						this.anIntArray427[local14] = local169 * this.anIntArray427[local14] + 16383 - this.anIntArray422[local14] * local20 >> 14;
						this.anIntArray422[local14] = local187;
					}
					if (arg1 != 0) {
						local20 = Class290.anIntArray546[arg1];
						local169 = Class290.anIntArray547[arg1];
						local187 = local169 * this.anIntArray427[local14] + 16383 - local20 * this.anIntArray425[local14] >> 14;
						this.anIntArray425[local14] = this.anIntArray427[local14] * local20 + this.anIntArray425[local14] * local169 + 16383 >> 14;
						this.anIntArray427[local14] = local187;
					}
					if (arg2 != 0) {
						local20 = Class290.anIntArray546[arg2];
						local169 = Class290.anIntArray547[arg2];
						local187 = this.anIntArray422[local14] * local169 + this.anIntArray425[local14] * local20 + 16383 >> 14;
						this.anIntArray425[local14] = local169 * this.anIntArray425[local14] + 16383 - local20 * this.anIntArray422[local14] >> 14;
						this.anIntArray422[local14] = local187;
					}
					this.anIntArray422[local14] += Static398.anInt6844;
					this.anIntArray427[local14] += Static89.anInt6948;
					this.anIntArray425[local14] += Static150.anInt3093;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt6571; local14++) {
					this.anIntArray422[local14] -= Static398.anInt6844;
					this.anIntArray427[local14] -= Static89.anInt6948;
					this.anIntArray425[local14] -= Static150.anInt3093;
					this.anIntArray422[local14] = this.anIntArray422[local14] * arg1 / 128;
					this.anIntArray427[local14] = arg2 * this.anIntArray427[local14] / 128;
					this.anIntArray425[local14] = arg3 * this.anIntArray425[local14] / 128;
					this.anIntArray422[local14] += Static398.anInt6844;
					this.anIntArray427[local14] += Static89.anInt6948;
					this.anIntArray425[local14] += Static150.anInt3093;
				}
			} else {
				@Pc(522) Class340 local522;
				@Pc(527) Class234 local527;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt6576; local14++) {
						local20 = arg1 * 8 + (this.aByteArray67[local14] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray67[local14] = (byte) local20;
					}
					if (this.aClass340Array1 != null) {
						for (local20 = 0; local20 < this.anInt6507; local20++) {
							local522 = this.aClass340Array1[local20];
							local527 = this.aClass234Array1[local20];
							local527.anInt6355 = 255 - (this.aByteArray67[local522.anInt9245] & 0xFF) << 24 | local527.anInt6355 & 0xFFFFFF;
						}
					}
					this.method5632();
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt6576; local14++) {
						local20 = this.aShortArray90[local14] & 0xFFFF;
						local169 = local20 >> 10 & 0x3F;
						local187 = local20 >> 7 & 0x7;
						local187 += arg2 / 4;
						@Pc(591) int local591 = local20 & 0x7F;
						@Pc(597) int local597 = arg1 + local169 & 0x3F;
						if (local187 < 0) {
							local187 = 0;
						} else if (local187 > 7) {
							local187 = 7;
						}
						local591 += arg3;
						if (local591 < 0) {
							local591 = 0;
						} else if (local591 > 127) {
							local591 = 127;
						}
						this.aShortArray90[local14] = (short) (local187 << 7 | local597 << 10 | local591);
					}
					if (this.aClass340Array1 != null) {
						for (local20 = 0; local20 < this.anInt6507; local20++) {
							local522 = this.aClass340Array1[local20];
							local527 = this.aClass234Array1[local20];
							local527.anInt6355 = Static347.anIntArray701[this.aShortArray90[local522.anInt9245] & 0xFFFF] & 0xFFFFFF | local527.anInt6355 & 0xFF000000;
						}
					}
					this.method5632();
				} else {
					@Pc(702) Class234 local702;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt6507; local14++) {
							local702 = this.aClass234Array1[local14];
							local702.anInt6354 += arg1;
							local702.anInt6351 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt6507; local14++) {
							local702 = this.aClass234Array1[local14];
							local702.anInt6353 = arg1 * local702.anInt6353 >> 7;
							local702.anInt6352 = local702.anInt6352 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt6507; local14++) {
							local702 = this.aClass234Array1[local14];
							local702.anInt6349 = arg1 + local702.anInt6349 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!vca;B)V")
	private void method5641(@OriginalArg(0) Class2_Sub7_Sub17_Sub2 arg0) {
		if (this.anInt6524 > Static175.anIntArray230.length) {
			Static175.anIntArray230 = new int[this.anInt6524];
			Static364.anIntArray410 = new int[this.anInt6524];
		}
		@Pc(47) int local47;
		@Pc(85) int local85;
		@Pc(94) int local94;
		for (@Pc(20) int local20 = 0; local20 < this.anInt6571; local20++) {
			local47 = (this.anIntArray422[local20] - (this.aClass13_Sub3_14.anInt9753 * this.anIntArray427[local20] >> 8) >> this.aClass13_Sub3_14.anInt9738) - arg0.anInt9960;
			@Pc(71) int local71 = (this.anIntArray425[local20] - (this.anIntArray427[local20] * this.aClass13_Sub3_14.anInt9741 >> 8) >> this.aClass13_Sub3_14.anInt9738) - arg0.anInt9957;
			@Pc(76) int local76 = this.anIntArray424[local20];
			@Pc(83) int local83 = this.anIntArray424[local20 + 1];
			for (local85 = local76; local85 < local83; local85++) {
				local94 = this.aShortArray88[local85] - 1;
				if (local94 == -1) {
					break;
				}
				Static175.anIntArray230[local94] = local47;
				Static364.anIntArray410[local94] = local71;
			}
		}
		for (local47 = 0; local47 < this.anInt6580; local47++) {
			if (this.aByteArray67 == null || this.aByteArray67[local47] <= 128) {
				@Pc(139) short local139 = this.aShortArray87[local47];
				@Pc(144) short local144 = this.aShortArray95[local47];
				@Pc(149) short local149 = this.aShortArray97[local47];
				local85 = Static175.anIntArray230[local139];
				local94 = Static175.anIntArray230[local144];
				@Pc(161) int local161 = Static175.anIntArray230[local149];
				@Pc(165) int local165 = Static364.anIntArray410[local139];
				@Pc(169) int local169 = Static364.anIntArray410[local144];
				@Pc(173) int local173 = Static364.anIntArray410[local149];
				if ((local169 - local173) * (local85 + -local94) - (local169 - local165) * (-local94 + local161) > 0) {
					arg0.method8467(local165, local161, local85, local94, local169, local173);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6571; local7++) {
			if (arg0 != 0) {
				this.anIntArray422[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray427[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray425[local7] += arg2;
			}
		}
		this.method5627();
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!nda", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean464) {
			this.method5635();
		}
		return this.anInt6532;
	}

	@OriginalMember(owner = "client!nda", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean464) {
			this.method5635();
		}
		return this.anInt6512;
	}

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "(B)Z")
	private boolean method5642() {
		if (this.aClass307_1.aBoolean601) {
			return true;
		}
		if (this.aClass307_1.anInterface11_5 == null) {
			this.aClass307_1.anInterface11_5 = this.aClass13_Sub3_14.method8288(this.aBoolean463);
		}
		@Pc(34) Interface11 local34 = this.aClass307_1.anInterface11_5;
		local34.method7407(this.anInt6580 * 6);
		@Pc(46) Buffer local46 = local34.method7405();
		if (local46 != null) {
			@Pc(54) Stream local54 = this.aClass13_Sub3_14.method8260(local46);
			@Pc(58) int local58;
			if (Stream.c()) {
				for (local58 = 0; local58 < this.anInt6580; local58++) {
					local54.b(this.aShortArray87[local58]);
					local54.b(this.aShortArray95[local58]);
					local54.b(this.aShortArray97[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt6580; local58++) {
					local54.e(this.aShortArray87[local58]);
					local54.e(this.aShortArray95[local58]);
					local54.e(this.aShortArray97[local58]);
				}
			}
			local54.b();
			if (local34.method7409()) {
				this.aBoolean462 = true;
				this.aClass307_1.aBoolean601 = true;
				this.aClass307_1.anInterface11_4 = local34;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIBIII)Z")
	private boolean method5643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > arg3 && arg5 > arg3 && arg3 < arg1) {
			return false;
		} else if (arg3 > arg6 && arg5 < arg3 && arg1 < arg3) {
			return false;
		} else if (arg2 < arg7 && arg0 > arg2 && arg4 > arg2) {
			return false;
		} else {
			return arg2 <= arg7 || arg0 >= arg2 || arg2 <= arg4;
		}
	}
}
