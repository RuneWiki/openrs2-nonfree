import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!haa", name = "t", descriptor = "Lclient!vb;")
	private Class369 aClass369_1;

	@OriginalMember(owner = "client!haa", name = "y", descriptor = "Lclient!dk;")
	private Class82 aClass82_1;

	@OriginalMember(owner = "client!haa", name = "A", descriptor = "Z")
	private boolean aBoolean299;

	@OriginalMember(owner = "client!haa", name = "B", descriptor = "Lclient!iba;")
	private Class168 aClass168_1;

	@OriginalMember(owner = "client!haa", name = "F", descriptor = "Z")
	private boolean aBoolean300;

	@OriginalMember(owner = "client!haa", name = "T", descriptor = "I")
	private int anInt3905;

	@OriginalMember(owner = "client!haa", name = "Y", descriptor = "I")
	private int anInt3909;

	@OriginalMember(owner = "client!haa", name = "db", descriptor = "I")
	private int anInt3912;

	@OriginalMember(owner = "client!haa", name = "yb", descriptor = "I")
	private int anInt3921;

	@OriginalMember(owner = "client!haa", name = "Ab", descriptor = "I")
	private int anInt3923;

	@OriginalMember(owner = "client!haa", name = "Wb", descriptor = "Lclient!dk;")
	private Class82 aClass82_2;

	@OriginalMember(owner = "client!haa", name = "Yb", descriptor = "Lclient!dk;")
	private Class82 aClass82_3;

	@OriginalMember(owner = "client!haa", name = "ec", descriptor = "Lclient!dk;")
	private Class82 aClass82_4;

	@OriginalMember(owner = "client!haa", name = "qc", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!haa", name = "rc", descriptor = "I")
	private int anInt3950;

	@OriginalMember(owner = "client!haa", name = "tc", descriptor = "I")
	private int anInt3952;

	@OriginalMember(owner = "client!haa", name = "xc", descriptor = "I")
	private int anInt3955;

	@OriginalMember(owner = "client!haa", name = "Ac", descriptor = "I")
	private int anInt3958;

	@OriginalMember(owner = "client!haa", name = "Dc", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_10;

	@OriginalMember(owner = "client!haa", name = "Kc", descriptor = "I")
	private int anInt3965;

	@OriginalMember(owner = "client!haa", name = "Mc", descriptor = "I")
	private int anInt3967;

	@OriginalMember(owner = "client!haa", name = "Nb", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!haa", name = "J", descriptor = "I")
	private int anInt3900;

	@OriginalMember(owner = "client!haa", name = "r", descriptor = "I")
	private int anInt3890;

	@OriginalMember(owner = "client!haa", name = "cb", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!haa", name = "Qb", descriptor = "Z")
	private boolean aBoolean302;

	@OriginalMember(owner = "client!haa", name = "Pc", descriptor = "I")
	private int anInt3970;

	@OriginalMember(owner = "client!haa", name = "Nc", descriptor = "I")
	private int anInt3968;

	@OriginalMember(owner = "client!haa", name = "X", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!haa", name = "hb", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!haa", name = "rb", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!haa", name = "L", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!haa", name = "G", descriptor = "[Lclient!oea;")
	private Class261[] aClass261Array3;

	@OriginalMember(owner = "client!haa", name = "pc", descriptor = "[Lclient!qr;")
	private Class298[] aClass298Array3;

	@OriginalMember(owner = "client!haa", name = "Hc", descriptor = "I")
	private int anInt3962;

	@OriginalMember(owner = "client!haa", name = "Ec", descriptor = "[Lclient!gja;")
	private Class144[] aClass144Array1;

	@OriginalMember(owner = "client!haa", name = "kc", descriptor = "[Lclient!fs;")
	private Class132[] aClass132Array1;

	@OriginalMember(owner = "client!haa", name = "pb", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!haa", name = "gc", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!haa", name = "Sb", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!haa", name = "ob", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!haa", name = "vc", descriptor = "[F")
	private float[] aFloatArray37;

	@OriginalMember(owner = "client!haa", name = "H", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!haa", name = "qb", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!haa", name = "nc", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!haa", name = "Pb", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!haa", name = "nb", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!haa", name = "mc", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!haa", name = "tb", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!haa", name = "S", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!haa", name = "Ib", descriptor = "[F")
	private float[] aFloatArray36;

	@OriginalMember(owner = "client!haa", name = "Ub", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!haa", name = "Vb", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!haa", name = "Fc", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!haa", name = "wb", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!haa", name = "gb", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!haa", name = "M", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!haa", name = "bb", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!haa", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!haa", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!haa", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!sf;Lclient!dc;IIII)V")
	public Class28_Sub2(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface5 local11 = arg0.anInterface5_12;
		this.anIntArray269 = new int[arg1.anInt2038 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt2040];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt2040; local24++) {
			if (arg1.aByteArray11 == null || arg1.aByteArray11[local24] != 2) {
				if (arg1.aShortArray29 != null && arg1.aShortArray29[local24] != -1) {
					@Pc(57) Class342 local57 = local11.method5193(arg1.aShortArray29[local24] & 0xFFFF);
					if (((this.anInt3905 & 0x40) == 0 || !local57.aBoolean693) && local57.aBoolean690) {
						continue;
					}
				}
				local22[this.anInt3900++] = local24;
				this.anIntArray269[arg1.aShortArray27[local24]]++;
				this.anIntArray269[arg1.aShortArray35[local24]]++;
				this.anIntArray269[arg1.aShortArray33[local24]]++;
			}
		}
		this.anInt3890 = this.anInt3900;
		@Pc(130) long[] local130 = new long[this.anInt3900];
		@Pc(139) boolean local139 = (this.anInt3950 & 0x100) != 0;
		@Pc(151) int local151;
		@Pc(164) int local164;
		@Pc(339) int local339;
		for (@Pc(141) int local141 = 0; local141 < this.anInt3900; local141++) {
			@Pc(147) int local147 = local22[local141];
			@Pc(149) Class342 local149 = null;
			local151 = 0;
			@Pc(153) byte local153 = 0;
			@Pc(155) byte local155 = 0;
			@Pc(157) byte local157 = 0;
			if (arg1.aClass151Array1 != null) {
				@Pc(162) boolean local162 = false;
				for (local164 = 0; local164 < arg1.aClass151Array1.length; local164++) {
					@Pc(171) Class151 local171 = arg1.aClass151Array1[local164];
					if (local171.anInt3833 == local147) {
						@Pc(184) Class354 local184 = Static248.method3941(local171.anInt3835);
						if (local184.aBoolean706) {
							local162 = true;
						}
						if (local184.anInt9478 != -1) {
							@Pc(200) Class342 local200 = local11.method5193(local184.anInt9478);
							if (local200.anInt9280 == 2) {
								this.aBoolean301 = true;
							}
						}
					}
				}
				if (local162) {
					local130[local141] = Long.MAX_VALUE;
					this.anInt3890--;
					continue;
				}
			}
			@Pc(235) short local235 = -1;
			if (arg1.aShortArray29 != null) {
				local235 = arg1.aShortArray29[local147];
				if (local235 != -1) {
					local149 = local11.method5193(local235 & 0xFFFF);
					if ((this.anInt3905 & 0x40) != 0 && local149.aBoolean693) {
						local149 = null;
						local235 = -1;
					} else {
						local157 = local149.aByte128;
						local155 = local149.aByte129;
					}
				}
			}
			@Pc(295) boolean local295 = arg1.aByteArray10 != null && arg1.aByteArray10[local147] != 0 || local149 != null && local149.anInt9280 != 0;
			if ((local139 || local295) && arg1.aByteArray13 != null) {
				local151 += arg1.aByteArray13[local147] << 17;
			}
			if (local295) {
				local151 += 65536;
			}
			local151 += (local155 & 0xFF) << 8;
			local151 += local157 & 0xFF;
			local339 = local153 + ((local235 & 0xFFFF) << 16);
			@Pc(345) int local345 = local339 + (local141 & 0xFFFF);
			local130[local141] = (long) local345 + ((long) local151 << 32);
			this.aBoolean302 |= local149 != null && (local149.aByte130 != 0 || local149.aByte127 != 0);
			this.aBoolean301 |= local295;
		}
		Static314.method4936(local22, local130);
		this.anInt3970 = arg1.anInt2038;
		this.anInt3968 = arg1.anInt2046;
		this.aShortArray81 = arg1.aShortArray30;
		this.anIntArray267 = arg1.anIntArray133;
		this.anIntArray268 = arg1.anIntArray135;
		this.anIntArray263 = arg1.anIntArray131;
		this.aClass261Array3 = arg1.aClass261Array2;
		this.aClass298Array3 = arg1.aClass298Array2;
		@Pc(428) Class259[] local428 = new Class259[this.anInt3970];
		@Pc(448) int local448;
		@Pc(462) int local462;
		@Pc(504) int local504;
		if (arg1.aClass151Array1 != null) {
			this.anInt3962 = arg1.aClass151Array1.length;
			this.aClass144Array1 = new Class144[this.anInt3962];
			this.aClass132Array1 = new Class132[this.anInt3962];
			for (local448 = 0; local448 < this.anInt3962; local448++) {
				@Pc(455) Class151 local455 = arg1.aClass151Array1[local448];
				@Pc(460) Class354 local460 = Static248.method3941(local455.anInt3835);
				local462 = -1;
				for (@Pc(464) int local464 = 0; local464 < this.anInt3900; local464++) {
					if (local455.anInt3833 == local22[local464]) {
						local462 = local464;
						break;
					}
				}
				if (local462 == -1) {
					throw new RuntimeException();
				}
				local504 = Static274.anIntArray337[arg1.aShortArray34[local455.anInt3833] & 0xFFFF] & 0xFFFFFF;
				@Pc(522) int local522 = local504 | 255 - (arg1.aByteArray10 == null ? 0 : arg1.aByteArray10[local455.anInt3833]) << 24;
				this.aClass132Array1[local448] = new Class132(local462, arg1.aShortArray27[local455.anInt3833], arg1.aShortArray35[local455.anInt3833], arg1.aShortArray33[local455.anInt3833], local460.anInt9477, local460.anInt9475, local460.anInt9478, local460.anInt9474, local460.anInt9476, local460.aBoolean706, local460.aBoolean707, local455.anInt3834);
				this.aClass144Array1[local448] = new Class144(local522);
			}
		}
		local448 = this.anInt3900 * 3;
		this.aShortArray83 = new short[this.anInt3900];
		this.aShortArray90 = new short[this.anInt3900];
		this.aShortArray87 = new short[local448];
		this.aShortArray82 = new short[this.anInt3900];
		this.aFloatArray37 = new float[local448];
		this.aShortArray79 = new short[this.anInt3900];
		this.aShortArray84 = new short[local448];
		this.aByteArray38 = new byte[local448];
		this.aShortArray86 = new short[local448];
		this.aByteArray37 = new byte[this.anInt3900];
		this.aShortArray91 = new short[local448];
		this.aShort54 = (short) arg4;
		this.aShortArray80 = new short[local448];
		this.aFloatArray36 = new float[local448];
		this.aShortArray88 = new short[local448];
		Static214.aLongArray7 = new long[local448];
		this.aShortArray89 = new short[this.anInt3900];
		if (arg1.aShortArray28 != null) {
			this.aShortArray92 = new short[this.anInt3900];
		}
		this.aShort55 = (short) arg3;
		local151 = 0;
		for (local339 = 0; local339 < arg1.anInt2038; local339++) {
			local462 = this.anIntArray269[local339];
			this.anIntArray269[local339] = local151;
			local428[local339] = new Class259();
			local151 += local462;
		}
		this.anIntArray269[arg1.anInt2038] = local151;
		@Pc(712) Class348 local712 = Static555.method7594(local22, this.anInt3900, arg1);
		@Pc(716) Class323[] local716 = new Class323[arg1.anInt2040];
		@Pc(756) int local756;
		@Pc(767) int local767;
		@Pc(778) int local778;
		@Pc(735) short local735;
		@Pc(745) int local745;
		for (local504 = 0; local504 < arg1.anInt2040; local504++) {
			@Pc(725) short local725 = arg1.aShortArray27[local504];
			@Pc(730) short local730 = arg1.aShortArray35[local504];
			local735 = arg1.aShortArray33[local504];
			local745 = this.anIntArray267[local730] - this.anIntArray267[local725];
			local756 = this.anIntArray268[local730] - this.anIntArray268[local725];
			local767 = this.anIntArray263[local730] - this.anIntArray263[local725];
			local778 = this.anIntArray267[local735] - this.anIntArray267[local725];
			@Pc(789) int local789 = this.anIntArray268[local735] - this.anIntArray268[local725];
			@Pc(799) int local799 = this.anIntArray263[local735] - this.anIntArray263[local725];
			@Pc(808) int local808 = local799 * local756 - local767 * local789;
			@Pc(817) int local817 = local778 * local767 - local799 * local745;
			@Pc(826) int local826 = local745 * local789 - local756 * local778;
			while (local808 > 8192 || local817 > 8192 || local826 > 8192 || local808 < -8192 || local817 < -8192 || local826 < -8192) {
				local826 >>= 0x1;
				local808 >>= 0x1;
				local817 >>= 0x1;
			}
			@Pc(879) int local879 = (int) Math.sqrt((double) (local826 * local826 + local817 * local817 + local808 * local808));
			if (local879 <= 0) {
				local879 = 1;
			}
			local808 = local808 * 256 / local879;
			local826 = local826 * 256 / local879;
			local817 = local817 * 256 / local879;
			@Pc(914) byte local914 = arg1.aByteArray11 == null ? 0 : arg1.aByteArray11[local504];
			if (local914 == 0) {
				@Pc(945) Class259 local945 = local428[local725];
				local945.anInt7052++;
				local945.anInt7051 += local817;
				local945.anInt7048 += local826;
				local945.anInt7049 += local808;
				@Pc(973) Class259 local973 = local428[local730];
				local973.anInt7048 += local826;
				local973.anInt7052++;
				local973.anInt7049 += local808;
				local973.anInt7051 += local817;
				@Pc(1001) Class259 local1001 = local428[local735];
				local1001.anInt7051 += local817;
				local1001.anInt7048 += local826;
				local1001.anInt7049 += local808;
				local1001.anInt7052++;
			} else if (local914 == 1) {
				@Pc(930) Class323 local930 = local716[local504] = new Class323();
				local930.anInt8832 = local817;
				local930.anInt8834 = local808;
				local930.anInt8837 = local826;
			}
		}
		@Pc(1038) int local1038;
		@Pc(1081) short local1081;
		for (local164 = 0; local164 < this.anInt3900; local164++) {
			local1038 = local22[local164];
			@Pc(1045) int local1045 = arg1.aShortArray34[local1038] & 0xFFFF;
			if (arg1.aByteArray12 == null) {
				local745 = -1;
			} else {
				local745 = arg1.aByteArray12[local1038];
			}
			if (arg1.aByteArray10 == null) {
				local756 = 0;
			} else {
				local756 = arg1.aByteArray10[local1038] & 0xFF;
			}
			local1081 = arg1.aShortArray29 == null ? -1 : arg1.aShortArray29[local1038];
			if (local1081 != -1 && (this.anInt3905 & 0x40) != 0) {
				@Pc(1099) Class342 local1099 = local11.method5193(local1081 & 0xFFFF);
				if (local1099.aBoolean693) {
					local1081 = -1;
				}
			}
			@Pc(1106) float local1106 = 0.0F;
			@Pc(1108) float local1108 = 0.0F;
			@Pc(1110) float local1110 = 0.0F;
			@Pc(1112) float local1112 = 0.0F;
			@Pc(1114) float local1114 = 0.0F;
			@Pc(1116) float local1116 = 0.0F;
			@Pc(1118) byte local1118 = 0;
			@Pc(1120) byte local1120 = 0;
			@Pc(1122) int local1122 = 0;
			@Pc(1139) byte local1139;
			@Pc(1156) short local1156;
			@Pc(1949) short local1949;
			@Pc(1954) short local1954;
			if (local1081 != -1) {
				if (local745 == -1) {
					local1120 = 2;
					local1106 = 0.0F;
					local1108 = 1.0F;
					local1114 = 0.0F;
					local1110 = 1.0F;
					local1116 = 0.0F;
					local1118 = 1;
					local1112 = 1.0F;
				} else {
					local745 &= 0xFF;
					local1139 = arg1.aByteArray14[local745];
					@Pc(1146) short local1146;
					@Pc(1151) short local1151;
					@Pc(1189) float local1189;
					@Pc(1416) float local1416;
					@Pc(1424) float local1424;
					@Pc(1521) float local1521;
					@Pc(1529) float local1529;
					@Pc(1537) float local1537;
					@Pc(1560) float local1560;
					@Pc(1583) float local1583;
					@Pc(1606) float local1606;
					if (local1139 == 0) {
						local1146 = arg1.aShortArray27[local1038];
						local1151 = arg1.aShortArray35[local1038];
						local1156 = arg1.aShortArray33[local1038];
						local1949 = arg1.aShortArray36[local745];
						local1954 = arg1.aShortArray32[local745];
						@Pc(1959) short local1959 = arg1.aShortArray31[local745];
						@Pc(1965) float local1965 = (float) arg1.anIntArray133[local1949];
						@Pc(1971) float local1971 = (float) arg1.anIntArray135[local1949];
						local1189 = (float) arg1.anIntArray131[local1949];
						local1416 = (float) arg1.anIntArray133[local1954] - local1965;
						local1424 = (float) arg1.anIntArray135[local1954] - local1971;
						@Pc(2004) float local2004 = (float) arg1.anIntArray131[local1954] - local1189;
						@Pc(2012) float local2012 = (float) arg1.anIntArray133[local1959] - local1965;
						@Pc(2021) float local2021 = (float) arg1.anIntArray135[local1959] - local1971;
						@Pc(2030) float local2030 = (float) arg1.anIntArray131[local1959] - local1189;
						@Pc(2039) float local2039 = (float) arg1.anIntArray133[local1146] - local1965;
						@Pc(2047) float local2047 = (float) arg1.anIntArray135[local1146] - local1971;
						@Pc(2055) float local2055 = (float) arg1.anIntArray131[local1146] - local1189;
						@Pc(2063) float local2063 = (float) arg1.anIntArray133[local1151] - local1965;
						@Pc(2071) float local2071 = (float) arg1.anIntArray135[local1151] - local1971;
						local1521 = (float) arg1.anIntArray131[local1151] - local1189;
						local1529 = (float) arg1.anIntArray133[local1156] - local1965;
						local1537 = (float) arg1.anIntArray135[local1156] - local1971;
						local1560 = (float) arg1.anIntArray131[local1156] - local1189;
						local1583 = local1424 * local2030 - local2021 * local2004;
						local1606 = local2004 * local2012 - local2030 * local1416;
						@Pc(2129) float local2129 = local2021 * local1416 - local1424 * local2012;
						@Pc(2138) float local2138 = local2021 * local2129 - local2030 * local1606;
						@Pc(2146) float local2146 = local2030 * local1583 - local2012 * local2129;
						@Pc(2155) float local2155 = local2012 * local1606 - local1583 * local2021;
						@Pc(2169) float local2169 = 1.0F / (local2155 * local2004 + local1416 * local2138 + local2146 * local1424);
						local1110 = local2169 * (local2155 * local1521 + local2138 * local2063 + local2146 * local2071);
						local1106 = (local2047 * local2146 + local2138 * local2039 + local2055 * local2155) * local2169;
						local1114 = local2169 * (local2155 * local1560 + local2146 * local1537 + local2138 * local1529);
						@Pc(2219) float local2219 = local1583 * local2004 - local1416 * local2129;
						@Pc(2227) float local2227 = local1424 * local2129 - local1606 * local2004;
						@Pc(2235) float local2235 = local1416 * local1606 - local1583 * local1424;
						@Pc(2249) float local2249 = 1.0F / (local2235 * local2030 + local2227 * local2012 + local2021 * local2219);
						local1108 = (local2235 * local2055 + local2219 * local2047 + local2039 * local2227) * local2249;
						local1116 = local2249 * (local1560 * local2235 + local1529 * local2227 + local1537 * local2219);
						local1112 = local2249 * (local2063 * local2227 + local2071 * local2219 + local1521 * local2235);
					} else {
						local1146 = arg1.aShortArray27[local1038];
						local1151 = arg1.aShortArray35[local1038];
						local1156 = arg1.aShortArray33[local1038];
						@Pc(1161) int local1161 = local712.anIntArray607[local745];
						@Pc(1166) int local1166 = local712.anIntArray605[local745];
						@Pc(1171) int local1171 = local712.anIntArray606[local745];
						@Pc(1176) float[] local1176 = local712.aFloatArrayArray15[local745];
						@Pc(1181) byte local1181 = arg1.aByteArray15[local745];
						local1189 = (float) arg1.anIntArray130[local745] / 256.0F;
						if (local1139 == 1) {
							local1416 = (float) arg1.anIntArray136[local745] / 1024.0F;
							Static420.method5995(local1171, local1166, arg1.anIntArray131[local1146], arg1.anIntArray133[local1146], local1416, local1161, arg1.anIntArray135[local1146], local1189, Static631.aFloatArray78, local1181, local1176);
							local1106 = Static631.aFloatArray78[0];
							local1108 = Static631.aFloatArray78[1];
							Static420.method5995(local1171, local1166, arg1.anIntArray131[local1151], arg1.anIntArray133[local1151], local1416, local1161, arg1.anIntArray135[local1151], local1189, Static631.aFloatArray78, local1181, local1176);
							local1110 = Static631.aFloatArray78[0];
							local1112 = Static631.aFloatArray78[1];
							Static420.method5995(local1171, local1166, arg1.anIntArray131[local1156], arg1.anIntArray133[local1156], local1416, local1161, arg1.anIntArray135[local1156], local1189, Static631.aFloatArray78, local1181, local1176);
							local1114 = Static631.aFloatArray78[0];
							local1116 = Static631.aFloatArray78[1];
							local1424 = local1416 / 2.0F;
							if ((local1181 & 0x1) == 0) {
								if (local1424 < local1110 - local1106) {
									local1118 = 1;
									local1110 -= local1416;
								} else if (local1106 - local1110 > local1424) {
									local1110 += local1416;
									local1118 = 2;
								}
								if (local1424 < local1114 - local1106) {
									local1114 -= local1416;
									local1120 = 1;
								} else if (local1424 < local1106 - local1114) {
									local1120 = 2;
									local1114 += local1416;
								}
							} else {
								if (local1112 - local1108 > local1424) {
									local1118 = 1;
									local1112 -= local1416;
								} else if (local1108 - local1112 > local1424) {
									local1118 = 2;
									local1112 += local1416;
								}
								if (local1116 - local1108 > local1424) {
									local1116 -= local1416;
									local1120 = 1;
								} else if (local1108 - local1116 > local1424) {
									local1120 = 2;
									local1116 += local1416;
								}
							}
						} else if (local1139 == 2) {
							local1416 = (float) arg1.anIntArray132[local745] / 256.0F;
							local1424 = (float) arg1.anIntArray128[local745] / 256.0F;
							@Pc(1434) int local1434 = arg1.anIntArray133[local1151] - arg1.anIntArray133[local1146];
							@Pc(1445) int local1445 = arg1.anIntArray135[local1151] - arg1.anIntArray135[local1146];
							@Pc(1456) int local1456 = arg1.anIntArray131[local1151] - arg1.anIntArray131[local1146];
							@Pc(1466) int local1466 = arg1.anIntArray133[local1156] - arg1.anIntArray133[local1146];
							@Pc(1476) int local1476 = arg1.anIntArray135[local1156] - arg1.anIntArray135[local1146];
							@Pc(1487) int local1487 = arg1.anIntArray131[local1156] - arg1.anIntArray131[local1146];
							@Pc(1496) int local1496 = local1445 * local1487 - local1456 * local1476;
							@Pc(1504) int local1504 = local1456 * local1466 - local1434 * local1487;
							@Pc(1513) int local1513 = local1434 * local1476 - local1466 * local1445;
							local1521 = 64.0F / (float) arg1.anIntArray129[local745];
							local1529 = 64.0F / (float) arg1.anIntArray134[local745];
							local1537 = 64.0F / (float) arg1.anIntArray136[local745];
							local1560 = (local1176[0] * (float) local1496 + local1176[1] * (float) local1504 + (float) local1513 * local1176[2]) / local1521;
							local1583 = ((float) local1496 * local1176[3] + local1176[4] * (float) local1504 + local1176[5] * (float) local1513) / local1529;
							local1606 = (local1176[7] * (float) local1504 + (float) local1496 * local1176[6] + (float) local1513 * local1176[8]) / local1537;
							local1122 = Static255.method4050(local1560, local1606, local1583);
							Static550.method7563(arg1.anIntArray131[local1146], arg1.anIntArray133[local1146], local1171, local1181, arg1.anIntArray135[local1146], local1424, local1161, local1189, Static631.aFloatArray78, local1176, local1122, local1166, local1416);
							local1108 = Static631.aFloatArray78[1];
							local1106 = Static631.aFloatArray78[0];
							Static550.method7563(arg1.anIntArray131[local1151], arg1.anIntArray133[local1151], local1171, local1181, arg1.anIntArray135[local1151], local1424, local1161, local1189, Static631.aFloatArray78, local1176, local1122, local1166, local1416);
							local1110 = Static631.aFloatArray78[0];
							local1112 = Static631.aFloatArray78[1];
							Static550.method7563(arg1.anIntArray131[local1156], arg1.anIntArray133[local1156], local1171, local1181, arg1.anIntArray135[local1156], local1424, local1161, local1189, Static631.aFloatArray78, local1176, local1122, local1166, local1416);
							local1114 = Static631.aFloatArray78[0];
							local1116 = Static631.aFloatArray78[1];
						} else if (local1139 == 3) {
							Static252.method4004(local1176, local1189, local1171, arg1.anIntArray133[local1146], local1161, local1181, arg1.anIntArray135[local1146], arg1.anIntArray131[local1146], local1166, Static631.aFloatArray78);
							local1108 = Static631.aFloatArray78[1];
							local1106 = Static631.aFloatArray78[0];
							Static252.method4004(local1176, local1189, local1171, arg1.anIntArray133[local1151], local1161, local1181, arg1.anIntArray135[local1151], arg1.anIntArray131[local1151], local1166, Static631.aFloatArray78);
							local1112 = Static631.aFloatArray78[1];
							local1110 = Static631.aFloatArray78[0];
							Static252.method4004(local1176, local1189, local1171, arg1.anIntArray133[local1156], local1161, local1181, arg1.anIntArray135[local1156], arg1.anIntArray131[local1156], local1166, Static631.aFloatArray78);
							local1114 = Static631.aFloatArray78[0];
							local1116 = Static631.aFloatArray78[1];
							if ((local1181 & 0x1) == 0) {
								if (local1114 - local1106 > 0.5F) {
									local1120 = 1;
									local1114--;
								} else if (local1106 - local1114 > 0.5F) {
									local1120 = 2;
									local1114++;
								}
								if (local1110 - local1106 > 0.5F) {
									local1118 = 1;
									local1110--;
								} else if (local1106 - local1110 > 0.5F) {
									local1118 = 2;
									local1110++;
								}
							} else {
								if (local1112 - local1108 > 0.5F) {
									local1112--;
									local1118 = 1;
								} else if (local1108 - local1112 > 0.5F) {
									local1112++;
									local1118 = 2;
								}
								if (local1116 - local1108 > 0.5F) {
									local1116--;
									local1120 = 1;
								} else if (local1108 - local1116 > 0.5F) {
									local1116++;
									local1120 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray11 == null) {
				local1139 = 0;
			} else {
				local1139 = arg1.aByteArray11[local1038];
			}
			if (local1139 == 0) {
				@Pc(2474) long local2474 = ((long) local756 + (long) (local1122 << 24) + (long) (local1045 << 8) << 32) + (long) (local745 << 2);
				local1156 = arg1.aShortArray27[local1038];
				local1949 = arg1.aShortArray35[local1038];
				local1954 = arg1.aShortArray33[local1038];
				@Pc(2493) Class259 local2493 = local428[local1156];
				this.aShortArray90[local164] = this.method3373(local2493.anInt7048, local2493.anInt7049, arg1, local1156, local164, local2474, local2493.anInt7051, local2493.anInt7052, local1106, local1108);
				@Pc(2518) Class259 local2518 = local428[local1949];
				this.aShortArray82[local164] = this.method3373(local2518.anInt7048, local2518.anInt7049, arg1, local1949, local164, (long) local1118 + local2474, local2518.anInt7051, local2518.anInt7052, local1110, local1112);
				@Pc(2546) Class259 local2546 = local428[local1954];
				this.aShortArray89[local164] = this.method3373(local2546.anInt7048, local2546.anInt7049, arg1, local1954, local164, local2474 + (long) local1120, local2546.anInt7051, local2546.anInt7052, local1114, local1116);
			} else if (local1139 == 1) {
				@Pc(2330) Class323 local2330 = local716[local1038];
				@Pc(2376) long local2376 = (long) ((local2330.anInt8837 + 256 << 22) + (local2330.anInt8834 > 0 ? 1024 : 2048) + (local745 << 2) + (local2330.anInt8832 + 256 << 12)) + ((long) (local1045 << 8) + (long) (local1122 << 24) + (long) local756 << 32);
				this.aShortArray90[local164] = this.method3373(local2330.anInt8837, local2330.anInt8834, arg1, arg1.aShortArray27[local1038], local164, local2376, local2330.anInt8832, 0, local1106, local1108);
				this.aShortArray82[local164] = this.method3373(local2330.anInt8837, local2330.anInt8834, arg1, arg1.aShortArray35[local1038], local164, (long) local1118 + local2376, local2330.anInt8832, 0, local1110, local1112);
				this.aShortArray89[local164] = this.method3373(local2330.anInt8837, local2330.anInt8834, arg1, arg1.aShortArray33[local1038], local164, local2376 + (long) local1120, local2330.anInt8832, 0, local1114, local1116);
			}
			if (arg1.aByteArray10 != null) {
				this.aByteArray37[local164] = arg1.aByteArray10[local1038];
			}
			if (arg1.aShortArray28 != null) {
				this.aShortArray92[local164] = arg1.aShortArray28[local1038];
			}
			this.aShortArray79[local164] = arg1.aShortArray34[local1038];
			this.aShortArray83[local164] = local1081;
		}
		if (this.anInt3890 > 0) {
			local1038 = 1;
			local735 = this.aShortArray83[0];
			for (local745 = 0; local745 < this.anInt3890; local745++) {
				@Pc(2632) short local2632 = this.aShortArray83[local745];
				if (local2632 != local735) {
					local1038++;
					local735 = local2632;
				}
			}
			this.anIntArray266 = new int[local1038];
			this.anIntArray264 = new int[local1038];
			this.anIntArray265 = new int[local1038 + 1];
			this.anIntArray265[0] = 0;
			local756 = this.anInt3912;
			local1081 = 0;
			local1038 = 0;
			local735 = this.aShortArray83[0];
			for (local778 = 0; local778 < this.anInt3890; local778++) {
				@Pc(2683) short local2683 = this.aShortArray83[local778];
				if (local735 != local2683) {
					this.anIntArray264[local1038] = local756;
					this.anIntArray266[local1038] = local1081 + 1 - local756;
					local1038++;
					this.anIntArray265[local1038] = local778;
					local735 = local2683;
					local1081 = 0;
					local756 = this.anInt3912;
				}
				@Pc(2718) short local2718 = this.aShortArray90[local778];
				if (local2718 > local1081) {
					local1081 = local2718;
				}
				if (local756 > local2718) {
					local756 = local2718;
				}
				local2718 = this.aShortArray82[local778];
				if (local2718 > local1081) {
					local1081 = local2718;
				}
				if (local756 > local2718) {
					local756 = local2718;
				}
				local2718 = this.aShortArray89[local778];
				if (local756 > local2718) {
					local756 = local2718;
				}
				if (local2718 > local1081) {
					local1081 = local2718;
				}
			}
			this.anIntArray264[local1038] = local756;
			this.anIntArray266[local1038] = local1081 + 1 - local756;
			local1038++;
			this.anIntArray265[local1038] = this.anInt3890;
		}
		Static214.aLongArray7 = null;
		this.aShortArray91 = Static213.method3380(this.anInt3912, this.aShortArray91);
		this.aShortArray88 = Static213.method3380(this.anInt3912, this.aShortArray88);
		this.aShortArray86 = Static213.method3380(this.anInt3912, this.aShortArray86);
		this.aShortArray80 = Static213.method3380(this.anInt3912, this.aShortArray80);
		this.aShortArray87 = Static213.method3380(this.anInt3912, this.aShortArray87);
		this.aByteArray38 = Static282.method4466(this.anInt3912, this.aByteArray38);
		this.aFloatArray36 = Static402.method5741(this.aFloatArray36, this.anInt3912);
		this.aFloatArray37 = Static402.method5741(this.aFloatArray37, this.anInt3912);
		if (arg1.anIntArray138 != null && Static206.method3264(arg2, this.anInt3905)) {
			this.anIntArrayArray43 = arg1.method1892(false);
		}
		if (arg1.aClass151Array1 != null && Static14.method135(this.anInt3905, arg2)) {
			this.anIntArrayArray44 = arg1.method1887();
		}
		if (arg1.anIntArray137 != null && Static382.method5595(this.anInt3905, arg2)) {
			local1038 = 0;
			@Pc(2910) int[] local2910 = new int[256];
			for (local745 = 0; local745 < this.anInt3900; local745++) {
				local756 = arg1.anIntArray137[local22[local745]];
				if (local756 >= 0) {
					@Pc(2930) int local2930 = local2910[local756]++;
					if (local756 > local1038) {
						local1038 = local756;
					}
				}
			}
			this.anIntArrayArray42 = new int[local1038 + 1][];
			for (local756 = 0; local756 <= local1038; local756++) {
				this.anIntArrayArray42[local756] = new int[local2910[local756]];
				local2910[local756] = 0;
			}
			for (local767 = 0; local767 < this.anInt3900; local767++) {
				local778 = arg1.anIntArray137[local22[local767]];
				if (local778 >= 0) {
					this.anIntArrayArray42[local778][local2910[local778]++] = local767;
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!sf;IIZZ)V")
	public Class28_Sub2(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3890 = 0;
		this.aBoolean299 = true;
		this.aBoolean301 = false;
		this.anInt3912 = 0;
		this.aBoolean302 = false;
		this.aBoolean300 = false;
		this.aBoolean303 = false;
		this.anInt3900 = 0;
		this.anInt3968 = 0;
		this.anInt3970 = 0;
		this.anInt3950 = arg1;
		this.aClass16_Sub1_10 = arg0;
		this.anInt3905 = arg2;
		this.aBoolean303 = arg4;
		if (arg3 || Static363.method5414(this.anInt3950, this.anInt3905)) {
			this.aClass82_3 = new Class82(Static344.method5202(this.anInt3905, this.anInt3950));
		}
		if (arg3 || Static115.method2122(this.anInt3950, this.anInt3905)) {
			this.aClass82_4 = new Class82(Static464.method6665(this.anInt3950, this.anInt3905));
		}
		if (arg3 || Static317.method4991(this.anInt3905, this.anInt3950)) {
			this.aClass82_1 = new Class82(Static460.method6619(this.anInt3950, this.anInt3905));
		}
		if (arg3 || Static530.method7396(this.anInt3905, this.anInt3950)) {
			this.aClass82_2 = new Class82(Static25.method794(this.anInt3905, this.anInt3950));
		}
		if (arg3 || Static393.method5691(this.anInt3905, this.anInt3950)) {
			this.aClass369_1 = new Class369(Static302.method4657(this.anInt3905, this.anInt3950));
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6897(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class28_Sub2 local8 = (Class28_Sub2) arg0;
		if (this.anInt3900 == 0 || local8.anInt3900 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt3970;
		@Pc(24) int[] local24 = local8.anIntArray267;
		@Pc(27) int[] local27 = local8.anIntArray268;
		@Pc(30) int[] local30 = local8.anIntArray263;
		@Pc(33) short[] local33 = local8.aShortArray86;
		@Pc(36) short[] local36 = local8.aShortArray80;
		@Pc(39) short[] local39 = local8.aShortArray87;
		@Pc(42) byte[] local42 = local8.aByteArray38;
		@Pc(53) short[] local53;
		@Pc(49) short[] local49;
		@Pc(47) short[] local47;
		@Pc(51) byte[] local51;
		if (this.aClass168_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local47 = this.aClass168_1.aShortArray99;
			local53 = this.aClass168_1.aShortArray100;
			local49 = this.aClass168_1.aShortArray101;
			local51 = this.aClass168_1.aByteArray40;
		}
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(80) short[] local80;
		@Pc(76) byte[] local76;
		if (local8.aClass168_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local82 = local8.aClass168_1.aShortArray101;
			local76 = local8.aClass168_1.aByteArray40;
			local78 = local8.aClass168_1.aShortArray100;
			local80 = local8.aClass168_1.aShortArray99;
		}
		@Pc(103) int[] local103 = local8.anIntArray269;
		@Pc(106) short[] local106 = local8.aShortArray84;
		if (!local8.aBoolean300) {
			local8.method3368();
		}
		@Pc(115) int local115 = local8.anInt3909;
		@Pc(118) int local118 = local8.anInt3955;
		@Pc(121) int local121 = local8.anInt3967;
		@Pc(124) int local124 = local8.anInt3965;
		@Pc(127) int local127 = local8.anInt3921;
		@Pc(130) int local130 = local8.anInt3923;
		for (@Pc(132) int local132 = 0; local132 < this.anInt3970; local132++) {
			@Pc(142) int local142 = this.anIntArray268[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(162) int local162 = this.anIntArray267[local132] - arg1;
				if (local121 <= local162 && local124 >= local162) {
					@Pc(182) int local182 = this.anIntArray263[local132] - arg3;
					if (local182 >= local127 && local182 <= local130) {
						@Pc(200) int local200 = -1;
						@Pc(205) int local205 = this.anIntArray269[local132];
						@Pc(212) int local212 = this.anIntArray269[local132 + 1];
						for (@Pc(214) int local214 = local205; local214 < local212; local214++) {
							local200 = this.aShortArray84[local214] - 1;
							if (local200 == -1 || this.aByteArray38[local200] != 0) {
								break;
							}
						}
						if (local200 != -1) {
							for (@Pc(244) int local244 = 0; local244 < local21; local244++) {
								if (local162 == local24[local244] && local30[local244] == local182 && local142 == local27[local244]) {
									@Pc(267) int local267 = -1;
									local205 = local103[local244];
									local212 = local103[local244 + 1];
									for (@Pc(279) int local279 = local205; local279 < local212; local279++) {
										local267 = local106[local279] - 1;
										if (local267 == -1 || local42[local267] != 0) {
											break;
										}
									}
									if (local267 != -1) {
										if (local53 == null) {
											this.aClass168_1 = new Class168();
											local53 = this.aClass168_1.aShortArray100 = Static648.method8490(this.aShortArray86);
											local49 = this.aClass168_1.aShortArray101 = Static648.method8490(this.aShortArray80);
											local47 = this.aClass168_1.aShortArray99 = Static648.method8490(this.aShortArray87);
											local51 = this.aClass168_1.aByteArray40 = Static488.method7008(this.aByteArray38);
										}
										if (local78 == null) {
											@Pc(363) Class168 local363 = local8.aClass168_1 = new Class168();
											local78 = local363.aShortArray100 = Static648.method8490(local33);
											local82 = local363.aShortArray101 = Static648.method8490(local36);
											local80 = local363.aShortArray99 = Static648.method8490(local39);
											local76 = local363.aByteArray40 = Static488.method7008(local42);
										}
										@Pc(396) short local396 = this.aShortArray86[local200];
										@Pc(401) short local401 = this.aShortArray80[local200];
										@Pc(406) short local406 = this.aShortArray87[local200];
										local205 = local103[local244];
										@Pc(415) byte local415 = this.aByteArray38[local200];
										local212 = local103[local244 + 1];
										@Pc(431) int local431;
										for (@Pc(423) int local423 = local205; local423 < local212; local423++) {
											local431 = local106[local423] - 1;
											if (local431 == -1) {
												break;
											}
											if (local76[local431] != 0) {
												local78[local431] += local396;
												local82[local431] += local401;
												local80[local431] += local406;
												local76[local431] += local415;
											}
										}
										local406 = local39[local267];
										local415 = local42[local267];
										local205 = this.anIntArray269[local132];
										local396 = local33[local267];
										local212 = this.anIntArray269[local132 + 1];
										local401 = local36[local267];
										for (local431 = local205; local431 < local212; local431++) {
											@Pc(517) int local517 = this.aShortArray84[local431] - 1;
											if (local517 == -1) {
												break;
											}
											if (local51[local517] != 0) {
												local53[local517] += local396;
												local49[local517] += local401;
												local47[local517] += local406;
												local51[local517] += local415;
											}
										}
										local8.method3364();
										this.method3364();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3968; local7++) {
			this.anIntArray267[local7] = this.anIntArray267[local7] + 7 >> 4;
			this.anIntArray268[local7] = this.anIntArray268[local7] + 7 >> 4;
			this.anIntArray263[local7] = this.anIntArray263[local7] + 7 >> 4;
		}
		this.method3361();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!haa", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass16_Sub1_10.anInterface5_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3900; local11++) {
			if (this.aShortArray83[local11] == arg0) {
				this.aShortArray83[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class342 local48 = local9.method5193(arg0 & 0xFFFF);
			local35 = local48.aByte126;
			local37 = local48.aByte124;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class342 local69 = local9.method5193(arg1 & 0xFFFF);
			if (local69.aByte130 != 0 || local69.aByte127 != 0) {
				this.aBoolean302 = true;
			}
			local58 = local69.aByte124;
			local56 = local69.aByte126;
		}
		if (!(local58 != local37 | local35 != local56)) {
			return;
		}
		if (this.aClass132Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt3962; local109++) {
				@Pc(116) Class132 local116 = this.aClass132Array1[local109];
				@Pc(121) Class144 local121 = this.aClass144Array1[local109];
				local121.anInt3593 = local121.anInt3593 & 0xFF000000 | Static274.anIntArray337[this.aShortArray79[local116.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3372();
	}

	@OriginalMember(owner = "client!haa", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass82_3 != null) {
			this.aClass82_3.aBoolean192 = Static344.method5202(this.anInt3905, arg0);
		}
		if (this.aClass82_4 != null) {
			this.aClass82_4.aBoolean192 = Static464.method6665(arg0, this.anInt3905);
		}
		if (this.aClass82_1 != null) {
			this.aClass82_1.aBoolean192 = Static460.method6619(arg0, this.anInt3905);
		}
		if (this.aClass82_2 != null) {
			this.aClass82_2.aBoolean192 = Static25.method794(this.anInt3905, arg0);
		}
		this.anInt3950 = arg0;
		this.aBoolean299 = true;
		if (this.aClass168_1 != null && (this.anInt3950 & 0x10000) == 0) {
			this.aShortArray80 = this.aClass168_1.aShortArray101;
			this.aShortArray86 = this.aClass168_1.aShortArray100;
			this.aShortArray87 = this.aClass168_1.aShortArray99;
			this.aByteArray38 = this.aClass168_1.aByteArray40;
			this.aClass168_1 = null;
		}
		this.method3369();
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)V")
	private void method3355() {
		if (this.aClass132Array1 == null) {
			return;
		}
		this.aClass16_Sub1_10.C(!this.aBoolean301);
		this.aClass16_Sub1_10.method6260(false);
		this.aClass16_Sub1_10.method6284(Static262.aClass188_2, 1);
		this.aClass16_Sub1_10.method6326(1, Static262.aClass188_2);
		for (@Pc(36) int local36 = 0; local36 < this.anInt3962; local36++) {
			@Pc(43) Class132 local43 = this.aClass132Array1[local36];
			@Pc(48) Class144 local48 = this.aClass144Array1[local36];
			if (!local43.aBoolean265 || !this.aClass16_Sub1_10.method8186()) {
				@Pc(78) float local78 = (float) (this.anIntArray267[local43.anInt3341] + this.anIntArray267[local43.anInt3338] + this.anIntArray267[local43.anInt3333]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray268[local43.anInt3333] + this.anIntArray268[local43.anInt3341] + this.anIntArray268[local43.anInt3338]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray263[local43.anInt3341] + this.anIntArray263[local43.anInt3338] + this.anIntArray263[local43.anInt3333]) * 0.3333333F;
				@Pc(134) float local134 = local99 * Static513.aFloat186 + local78 * Static146.aFloat78 + Static449.aFloat177 * local120 + Static12.aFloat1;
				@Pc(148) float local148 = Static614.aFloat194 * local78 + Static161.aFloat79 * local99 + Static604.aFloat193 * local120 + Static14.aFloat2;
				@Pc(162) float local162 = Static38.aFloat61 + local120 * Static378.aFloat153 + local99 * Static535.aFloat190 + local78 * Static463.aFloat179;
				@Pc(183) float local183 = (float) (1.0D / Math.sqrt((double) (local148 * local148 + local134 * local134 + local162 * local162))) * (float) local43.anInt3334;
				@Pc(188) Class25_Sub3 local188 = this.aClass16_Sub1_10.method6207();
				local188.method4315(local43.aShort46 * local48.anInt3590 >> 7, (float) local48.anInt3589 + local134 - local134 * local183, local48.anInt3592, local162 - local183 * local162, local48.anInt3587 * local43.aShort47 >> 7, local148 + (float) local48.anInt3595 - local148 * local183);
				local188.method4311(this.aClass16_Sub1_10.aClass25_Sub3_17);
				this.aClass16_Sub1_10.method6256();
				@Pc(244) int local244 = local48.anInt3593;
				this.aClass16_Sub1_10.method6264(local43.aShort48, false, false);
				this.aClass16_Sub1_10.method6239(local43.aByte54);
				this.aClass16_Sub1_10.method6263(local244);
				this.aClass16_Sub1_10.method6251();
			}
		}
		this.aClass16_Sub1_10.method6326(1, Static622.aClass188_4);
		this.aClass16_Sub1_10.method6284(Static622.aClass188_4, 1);
		this.aClass16_Sub1_10.C(true);
	}

	@OriginalMember(owner = "client!haa", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean300) {
			this.method3368();
		}
		return this.anInt3921;
	}

	@OriginalMember(owner = "client!haa", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean300) {
			this.method3368();
		}
		return this.anInt3958;
	}

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "()[Lclient!oea;")
	@Override
	public Class261[] method6912() {
		return this.aClass261Array3;
	}

	@OriginalMember(owner = "client!haa", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean300) {
			this.method3368();
		}
		return this.anInt3967;
	}

	@OriginalMember(owner = "client!haa", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort55 = (short) arg0;
		this.method3372();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILclient!sk;ZII)Z")
	@Override
	public boolean method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3370(arg3, arg0, arg4, arg5, arg1, arg2);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ip;I)V")
	private void method3356(@OriginalArg(0) Class3_Sub6_Sub12_Sub1 arg0) {
		if (Static634.anIntArray636.length < this.anInt3912) {
			Static634.anIntArray636 = new int[this.anInt3912];
			Static374.anIntArray410 = new int[this.anInt3912];
		}
		@Pc(49) int local49;
		@Pc(86) int local86;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3970; local20++) {
			local49 = (this.anIntArray267[local20] - (this.anIntArray268[local20] * this.aClass16_Sub1_10.anInt7439 >> 8) >> this.aClass16_Sub1_10.anInt7446) - arg0.anInt4918;
			@Pc(72) int local72 = (this.anIntArray263[local20] - (this.aClass16_Sub1_10.anInt7463 * this.anIntArray268[local20] >> 8) >> this.aClass16_Sub1_10.anInt7446) - arg0.anInt4916;
			@Pc(77) int local77 = this.anIntArray269[local20];
			@Pc(84) int local84 = this.anIntArray269[local20 + 1];
			for (local86 = local77; local86 < local84; local86++) {
				local95 = this.aShortArray84[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static634.anIntArray636[local95] = local49;
				Static374.anIntArray410[local95] = local72;
			}
		}
		for (local49 = 0; local49 < this.anInt3890; local49++) {
			if (this.aByteArray37 == null || this.aByteArray37[local49] <= 128) {
				@Pc(134) short local134 = this.aShortArray90[local49];
				@Pc(139) short local139 = this.aShortArray82[local49];
				@Pc(144) short local144 = this.aShortArray89[local49];
				local86 = Static634.anIntArray636[local134];
				local95 = Static634.anIntArray636[local139];
				@Pc(156) int local156 = Static634.anIntArray636[local144];
				@Pc(160) int local160 = Static374.anIntArray410[local134];
				@Pc(164) int local164 = Static374.anIntArray410[local139];
				@Pc(168) int local168 = Static374.anIntArray410[local144];
				if ((local86 - local95) * (local164 - local168) - (local164 - local160) * (local156 - local95) > 0) {
					arg0.method4117(local156, local86, local168, local160, local164, local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "()V")
	@Override
	protected void method6896() {
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class28 method6900(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(21) Class28_Sub2 local21;
		@Pc(17) Class28_Sub2 local17;
		if (arg0 == 1) {
			local21 = this.aClass16_Sub1_10.aClass28_Sub2_29;
			local17 = this.aClass16_Sub1_10.aClass28_Sub2_28;
		} else if (arg0 == 2) {
			local17 = this.aClass16_Sub1_10.aClass28_Sub2_21;
			local21 = this.aClass16_Sub1_10.aClass28_Sub2_27;
		} else if (arg0 == 3) {
			local17 = this.aClass16_Sub1_10.aClass28_Sub2_24;
			local21 = this.aClass16_Sub1_10.aClass28_Sub2_30;
		} else if (arg0 == 4) {
			local21 = this.aClass16_Sub1_10.aClass28_Sub2_22;
			local17 = this.aClass16_Sub1_10.aClass28_Sub2_25;
		} else if (arg0 == 5) {
			local21 = this.aClass16_Sub1_10.aClass28_Sub2_23;
			local17 = this.aClass16_Sub1_10.aClass28_Sub2_26;
		} else {
			local21 = local17 = new Class28_Sub2(this.aClass16_Sub1_10, 0, 0, true, false);
		}
		return this.method3359(arg2, arg1, local17, local21, arg0 != 0);
	}

	@OriginalMember(owner = "client!haa", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean300) {
			this.method3368();
		}
		return this.anInt3952;
	}

	@OriginalMember(owner = "client!haa", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static656.anInt1395 = 0;
			Static320.anInt5956 = 0;
			Static359.anInt6411 = 0;
			for (local17 = 0; local17 < this.anInt3970; local17++) {
				Static359.anInt6411 += this.anIntArray267[local17];
				Static320.anInt5956 += this.anIntArray268[local17];
				Static656.anInt1395 += this.anIntArray263[local17];
				local9++;
			}
			if (local9 <= 0) {
				Static656.anInt1395 = arg3;
				Static320.anInt5956 = arg2;
				Static359.anInt6411 = arg1;
			} else {
				Static359.anInt6411 = arg1 + Static359.anInt6411 / local9;
				Static320.anInt5956 = arg2 + Static320.anInt5956 / local9;
				Static656.anInt1395 = Static656.anInt1395 / local9 + arg3;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt3970; local9++) {
				this.anIntArray267[local9] += arg1;
				this.anIntArray268[local9] += arg2;
				this.anIntArray263[local9] += arg3;
			}
		} else {
			@Pc(168) int local168;
			@Pc(186) int local186;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt3970; local9++) {
					this.anIntArray267[local9] -= Static359.anInt6411;
					this.anIntArray268[local9] -= Static320.anInt5956;
					this.anIntArray263[local9] -= Static656.anInt1395;
					if (arg3 != 0) {
						local17 = Class3_Sub7_Sub2.anIntArray171[arg3];
						local168 = Class3_Sub7_Sub2.anIntArray170[arg3];
						local186 = this.anIntArray267[local9] * local168 + local17 * this.anIntArray268[local9] + 16383 >> 14;
						this.anIntArray268[local9] = local168 * this.anIntArray268[local9] + 16383 - this.anIntArray267[local9] * local17 >> 14;
						this.anIntArray267[local9] = local186;
					}
					if (arg1 != 0) {
						local17 = Class3_Sub7_Sub2.anIntArray171[arg1];
						local168 = Class3_Sub7_Sub2.anIntArray170[arg1];
						local186 = local168 * this.anIntArray268[local9] + 16383 - local17 * this.anIntArray263[local9] >> 14;
						this.anIntArray263[local9] = local17 * this.anIntArray268[local9] + local168 * this.anIntArray263[local9] + 16383 >> 14;
						this.anIntArray268[local9] = local186;
					}
					if (arg2 != 0) {
						local17 = Class3_Sub7_Sub2.anIntArray171[arg2];
						local168 = Class3_Sub7_Sub2.anIntArray170[arg2];
						local186 = local168 * this.anIntArray267[local9] + local17 * this.anIntArray263[local9] + 16383 >> 14;
						this.anIntArray263[local9] = this.anIntArray263[local9] * local168 + 16383 - local17 * this.anIntArray267[local9] >> 14;
						this.anIntArray267[local9] = local186;
					}
					this.anIntArray267[local9] += Static359.anInt6411;
					this.anIntArray268[local9] += Static320.anInt5956;
					this.anIntArray263[local9] += Static656.anInt1395;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt3970; local9++) {
					this.anIntArray267[local9] -= Static359.anInt6411;
					this.anIntArray268[local9] -= Static320.anInt5956;
					this.anIntArray263[local9] -= Static656.anInt1395;
					this.anIntArray267[local9] = this.anIntArray267[local9] * arg1 / 128;
					this.anIntArray268[local9] = arg2 * this.anIntArray268[local9] / 128;
					this.anIntArray263[local9] = this.anIntArray263[local9] * arg3 / 128;
					this.anIntArray267[local9] += Static359.anInt6411;
					this.anIntArray268[local9] += Static320.anInt5956;
					this.anIntArray263[local9] += Static656.anInt1395;
				}
			} else {
				@Pc(519) Class132 local519;
				@Pc(524) Class144 local524;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt3900; local9++) {
						local17 = arg1 * 8 + (this.aByteArray37[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray37[local9] = (byte) local17;
					}
					if (this.aClass132Array1 != null) {
						for (local17 = 0; local17 < this.anInt3962; local17++) {
							local519 = this.aClass132Array1[local17];
							local524 = this.aClass144Array1[local17];
							local524.anInt3593 = local524.anInt3593 & 0xFFFFFF | 255 - (this.aByteArray37[local519.anInt3339] & 0xFF) << 24;
						}
					}
					this.method3372();
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt3900; local9++) {
						local17 = this.aShortArray79[local9] & 0xFFFF;
						local168 = local17 >> 10 & 0x3F;
						local186 = local17 >> 7 & 0x7;
						@Pc(587) int local587 = local168 + arg1 & 0x3F;
						@Pc(591) int local591 = local17 & 0x7F;
						local186 += arg2 / 4;
						local591 += arg3;
						if (local186 < 0) {
							local186 = 0;
						} else if (local186 > 7) {
							local186 = 7;
						}
						if (local591 < 0) {
							local591 = 0;
						} else if (local591 > 127) {
							local591 = 127;
						}
						this.aShortArray79[local9] = (short) (local591 | local587 << 10 | local186 << 7);
					}
					if (this.aClass132Array1 != null) {
						for (local17 = 0; local17 < this.anInt3962; local17++) {
							local519 = this.aClass132Array1[local17];
							local524 = this.aClass144Array1[local17];
							local524.anInt3593 = local524.anInt3593 & 0xFF000000 | Static274.anIntArray337[this.aShortArray79[local519.anInt3339] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method3372();
				} else {
					@Pc(709) Class144 local709;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt3962; local9++) {
							local709 = this.aClass144Array1[local9];
							local709.anInt3595 += arg2;
							local709.anInt3589 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt3962; local9++) {
							local709 = this.aClass144Array1[local9];
							local709.anInt3587 = arg1 * local709.anInt3587 >> 7;
							local709.anInt3590 = arg2 * local709.anInt3590 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt3962; local9++) {
							local709 = this.aClass144Array1[local9];
							local709.anInt3592 = arg1 + local709.anInt3592 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray43 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3968; local12++) {
			this.anIntArray267[local12] <<= 0x4;
			this.anIntArray268[local12] <<= 0x4;
			this.anIntArray263[local12] <<= 0x4;
		}
		Static359.anInt6411 = 0;
		Static320.anInt5956 = 0;
		Static656.anInt1395 = 0;
		return true;
	}

	@OriginalMember(owner = "client!haa", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort55;
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "()[Lclient!qr;")
	@Override
	public Class298[] method6911() {
		return this.aClass298Array3;
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)V")
	public void method3358() {
		if (this.aClass82_3 != null) {
			this.aClass82_3.method2087();
		}
		if (this.aClass82_4 != null) {
			this.aClass82_4.method2087();
		}
		if (this.aClass82_1 != null) {
			this.aClass82_1.method2087();
		}
		if (this.aClass82_2 != null) {
			this.aClass82_2.method2087();
		}
		if (this.aClass369_1 != null) {
			this.aClass369_1.method8253();
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BZILclient!haa;Lclient!haa;Z)Lclient!ka;")
	private Class28 method3359(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28_Sub2 arg2, @OriginalArg(4) Class28_Sub2 arg3, @OriginalArg(5) boolean arg4) {
		arg3.anInt3950 = arg1;
		arg3.anInt3970 = this.anInt3970;
		arg3.anInt3912 = this.anInt3912;
		arg3.anInt3905 = this.anInt3905;
		arg3.aBoolean302 = this.aBoolean302;
		arg3.anInt3900 = this.anInt3900;
		arg3.anInt3968 = this.anInt3968;
		if ((arg1 & 0x100) == 0) {
			arg3.aBoolean301 = this.aBoolean301;
		} else {
			arg3.aBoolean301 = true;
		}
		arg3.anInt3962 = this.anInt3962;
		arg3.aShort54 = this.aShort54;
		arg3.aShort55 = this.aShort55;
		arg3.anInt3890 = this.anInt3890;
		@Pc(75) boolean local75 = Static149.method2575(this.anInt3905, arg1);
		@Pc(81) boolean local81 = Static308.method4733(this.anInt3905, arg1);
		@Pc(87) boolean local87 = Static460.method6620(arg1, this.anInt3905);
		@Pc(93) boolean local93 = local87 | local81 | local75;
		@Pc(204) int local204;
		if (local93) {
			if (!local75) {
				arg3.anIntArray267 = this.anIntArray267;
			} else if (arg2.anIntArray267 == null || this.anInt3968 > arg2.anIntArray267.length) {
				arg3.anIntArray267 = arg2.anIntArray267 = new int[this.anInt3968];
			} else {
				arg3.anIntArray267 = arg2.anIntArray267;
			}
			if (!local81) {
				arg3.anIntArray268 = this.anIntArray268;
			} else if (arg2.anIntArray268 == null || this.anInt3968 > arg2.anIntArray268.length) {
				arg3.anIntArray268 = arg2.anIntArray268 = new int[this.anInt3968];
			} else {
				arg3.anIntArray268 = arg2.anIntArray268;
			}
			if (!local87) {
				arg3.anIntArray263 = this.anIntArray263;
			} else if (arg2.anIntArray263 == null || arg2.anIntArray263.length < this.anInt3968) {
				arg3.anIntArray263 = arg2.anIntArray263 = new int[this.anInt3968];
			} else {
				arg3.anIntArray263 = arg2.anIntArray263;
			}
			for (local204 = 0; local204 < this.anInt3968; local204++) {
				if (local75) {
					arg3.anIntArray267[local204] = this.anIntArray267[local204];
				}
				if (local81) {
					arg3.anIntArray268[local204] = this.anIntArray268[local204];
				}
				if (local87) {
					arg3.anIntArray263[local204] = this.anIntArray263[local204];
				}
			}
		} else {
			arg3.anIntArray263 = this.anIntArray263;
			arg3.anIntArray267 = this.anIntArray267;
			arg3.anIntArray268 = this.anIntArray268;
		}
		if (Static344.method5202(this.anInt3905, arg1)) {
			arg3.aClass82_3 = arg2.aClass82_3;
			arg3.aClass82_3.aBoolean191 = this.aClass82_3.aBoolean191;
			arg3.aClass82_3.anInterface16_8 = this.aClass82_3.anInterface16_8;
			arg3.aClass82_3.aBoolean192 = true;
		} else if (Static363.method5414(arg1, this.anInt3905)) {
			arg3.aClass82_3 = this.aClass82_3;
		} else {
			arg3.aClass82_3 = null;
		}
		if (Static545.method7550(arg1, this.anInt3905)) {
			if (arg2.aShortArray79 == null || arg2.aShortArray79.length < this.anInt3900) {
				arg3.aShortArray79 = arg2.aShortArray79 = new short[this.anInt3900];
			} else {
				arg3.aShortArray79 = arg2.aShortArray79;
			}
			for (local204 = 0; local204 < this.anInt3900; local204++) {
				arg3.aShortArray79[local204] = this.aShortArray79[local204];
			}
		} else {
			arg3.aShortArray79 = this.aShortArray79;
		}
		if (Static388.method5659(arg1, this.anInt3905)) {
			if (arg2.aByteArray37 == null || arg2.aByteArray37.length < this.anInt3900) {
				arg3.aByteArray37 = arg2.aByteArray37 = new byte[this.anInt3900];
			} else {
				arg3.aByteArray37 = arg2.aByteArray37;
			}
			for (local204 = 0; local204 < this.anInt3900; local204++) {
				arg3.aByteArray37[local204] = this.aByteArray37[local204];
			}
		} else {
			arg3.aByteArray37 = this.aByteArray37;
		}
		if (Static460.method6619(arg1, this.anInt3905)) {
			arg3.aClass82_1 = arg2.aClass82_1;
			arg3.aClass82_1.aBoolean191 = this.aClass82_1.aBoolean191;
			arg3.aClass82_1.anInterface16_8 = this.aClass82_1.anInterface16_8;
			arg3.aClass82_1.aBoolean192 = true;
		} else if (Static317.method4991(this.anInt3905, arg1)) {
			arg3.aClass82_1 = this.aClass82_1;
		} else {
			arg3.aClass82_1 = null;
		}
		@Pc(573) int local573;
		if (Static619.method8223(this.anInt3905, arg1)) {
			if (arg2.aShortArray86 == null || arg2.aShortArray86.length < this.anInt3912) {
				local204 = this.anInt3912;
				arg3.aShortArray80 = arg2.aShortArray80 = new short[local204];
				arg3.aShortArray87 = arg2.aShortArray87 = new short[local204];
				arg3.aShortArray86 = arg2.aShortArray86 = new short[local204];
			} else {
				arg3.aShortArray87 = arg2.aShortArray87;
				arg3.aShortArray80 = arg2.aShortArray80;
				arg3.aShortArray86 = arg2.aShortArray86;
			}
			if (this.aClass168_1 == null) {
				arg3.aClass168_1 = null;
				for (local204 = 0; local204 < this.anInt3912; local204++) {
					arg3.aShortArray86[local204] = this.aShortArray86[local204];
					arg3.aShortArray80[local204] = this.aShortArray80[local204];
					arg3.aShortArray87[local204] = this.aShortArray87[local204];
				}
			} else {
				if (arg2.aClass168_1 == null) {
					arg2.aClass168_1 = new Class168();
				}
				@Pc(561) Class168 local561 = arg3.aClass168_1 = arg2.aClass168_1;
				if (local561.aShortArray100 == null || this.anInt3912 > local561.aShortArray100.length) {
					local573 = this.anInt3912;
					local561.aByteArray40 = new byte[local573];
					local561.aShortArray100 = new short[local573];
					local561.aShortArray101 = new short[local573];
					local561.aShortArray99 = new short[local573];
				}
				for (local573 = 0; local573 < this.anInt3912; local573++) {
					arg3.aShortArray86[local573] = this.aShortArray86[local573];
					arg3.aShortArray80[local573] = this.aShortArray80[local573];
					arg3.aShortArray87[local573] = this.aShortArray87[local573];
					local561.aShortArray100[local573] = this.aClass168_1.aShortArray100[local573];
					local561.aShortArray101[local573] = this.aClass168_1.aShortArray101[local573];
					local561.aShortArray99[local573] = this.aClass168_1.aShortArray99[local573];
					local561.aByteArray40[local573] = this.aClass168_1.aByteArray40[local573];
				}
			}
			arg3.aByteArray38 = this.aByteArray38;
		} else {
			arg3.aShortArray87 = this.aShortArray87;
			arg3.aShortArray86 = this.aShortArray86;
			arg3.aByteArray38 = this.aByteArray38;
			arg3.aClass168_1 = this.aClass168_1;
			arg3.aShortArray80 = this.aShortArray80;
		}
		if (Static25.method794(this.anInt3905, arg1)) {
			arg3.aClass82_2 = arg2.aClass82_2;
			arg3.aClass82_2.anInterface16_8 = this.aClass82_2.anInterface16_8;
			arg3.aClass82_2.aBoolean192 = true;
			arg3.aClass82_2.aBoolean191 = this.aClass82_2.aBoolean191;
		} else if (Static530.method7396(this.anInt3905, arg1)) {
			arg3.aClass82_2 = this.aClass82_2;
		} else {
			arg3.aClass82_2 = null;
		}
		if (Static670.method8772(this.anInt3905, arg1)) {
			if (arg2.aFloatArray36 == null || arg2.aFloatArray36.length < this.anInt3900) {
				local204 = this.anInt3912;
				arg3.aFloatArray36 = arg2.aFloatArray36 = new float[local204];
				arg3.aFloatArray37 = arg2.aFloatArray37 = new float[local204];
			} else {
				arg3.aFloatArray36 = arg2.aFloatArray36;
				arg3.aFloatArray37 = arg2.aFloatArray37;
			}
			for (local204 = 0; local204 < this.anInt3912; local204++) {
				arg3.aFloatArray36[local204] = this.aFloatArray36[local204];
				arg3.aFloatArray37[local204] = this.aFloatArray37[local204];
			}
		} else {
			arg3.aFloatArray37 = this.aFloatArray37;
			arg3.aFloatArray36 = this.aFloatArray36;
		}
		if (Static464.method6665(arg1, this.anInt3905)) {
			arg3.aClass82_4 = arg2.aClass82_4;
			arg3.aClass82_4.aBoolean191 = this.aClass82_4.aBoolean191;
			arg3.aClass82_4.aBoolean192 = true;
			arg3.aClass82_4.anInterface16_8 = this.aClass82_4.anInterface16_8;
		} else if (Static115.method2122(arg1, this.anInt3905)) {
			arg3.aClass82_4 = this.aClass82_4;
		} else {
			arg3.aClass82_4 = null;
		}
		if (Static94.method1881(arg1, this.anInt3905)) {
			if (arg2.aShortArray90 == null || arg2.aShortArray90.length < this.anInt3900) {
				local204 = this.anInt3900;
				arg3.aShortArray82 = arg2.aShortArray82 = new short[local204];
				arg3.aShortArray90 = arg2.aShortArray90 = new short[local204];
				arg3.aShortArray89 = arg2.aShortArray89 = new short[local204];
			} else {
				arg3.aShortArray90 = arg2.aShortArray90;
				arg3.aShortArray89 = arg2.aShortArray89;
				arg3.aShortArray82 = arg2.aShortArray82;
			}
			for (local204 = 0; local204 < this.anInt3900; local204++) {
				arg3.aShortArray90[local204] = this.aShortArray90[local204];
				arg3.aShortArray82[local204] = this.aShortArray82[local204];
				arg3.aShortArray89[local204] = this.aShortArray89[local204];
			}
		} else {
			arg3.aShortArray90 = this.aShortArray90;
			arg3.aShortArray82 = this.aShortArray82;
			arg3.aShortArray89 = this.aShortArray89;
		}
		if (Static302.method4657(this.anInt3905, arg1)) {
			arg3.aClass369_1 = arg2.aClass369_1;
			arg3.aClass369_1.anInterface22_8 = this.aClass369_1.anInterface22_8;
			arg3.aClass369_1.aBoolean715 = this.aClass369_1.aBoolean715;
			arg3.aClass369_1.aBoolean716 = true;
		} else if (Static393.method5691(this.anInt3905, arg1)) {
			arg3.aClass369_1 = this.aClass369_1;
		} else {
			arg3.aClass369_1 = null;
		}
		if (Static122.method2192(this.anInt3905, arg1)) {
			if (arg2.aShortArray83 == null || this.anInt3900 > arg2.aShortArray83.length) {
				local204 = this.anInt3900;
				arg3.aShortArray83 = arg2.aShortArray83 = new short[local204];
			} else {
				arg3.aShortArray83 = arg2.aShortArray83;
			}
			for (local204 = 0; local204 < this.anInt3900; local204++) {
				arg3.aShortArray83[local204] = this.aShortArray83[local204];
			}
		} else {
			arg3.aShortArray83 = this.aShortArray83;
		}
		if (!Static449.method6473(arg1, this.anInt3905)) {
			arg3.aClass144Array1 = this.aClass144Array1;
		} else if (arg2.aClass144Array1 == null || this.anInt3962 > arg2.aClass144Array1.length) {
			local204 = this.anInt3962;
			arg3.aClass144Array1 = arg2.aClass144Array1 = new Class144[local204];
			for (local573 = 0; local573 < this.anInt3962; local573++) {
				arg3.aClass144Array1[local573] = this.aClass144Array1[local573].method3147();
			}
		} else {
			arg3.aClass144Array1 = arg2.aClass144Array1;
			for (local204 = 0; local204 < this.anInt3962; local204++) {
				arg3.aClass144Array1[local204].method3148(this.aClass144Array1[local204]);
			}
		}
		arg3.anIntArrayArray44 = this.anIntArrayArray44;
		arg3.aShortArray88 = this.aShortArray88;
		arg3.anIntArray264 = this.anIntArray264;
		arg3.aShortArray92 = this.aShortArray92;
		arg3.aShortArray91 = this.aShortArray91;
		arg3.anIntArray266 = this.anIntArray266;
		arg3.anIntArrayArray42 = this.anIntArrayArray42;
		arg3.aClass261Array3 = this.aClass261Array3;
		arg3.anIntArray269 = this.anIntArray269;
		arg3.aClass132Array1 = this.aClass132Array1;
		arg3.aShortArray81 = this.aShortArray81;
		arg3.anIntArrayArray43 = this.anIntArrayArray43;
		arg3.aClass298Array3 = this.aClass298Array3;
		if (this.aBoolean300) {
			arg3.anInt3952 = this.anInt3952;
			arg3.anInt3909 = this.anInt3909;
			arg3.anInt3967 = this.anInt3967;
			arg3.anInt3958 = this.anInt3958;
			arg3.anInt3923 = this.anInt3923;
			arg3.anInt3921 = this.anInt3921;
			arg3.aBoolean300 = true;
			arg3.anInt3965 = this.anInt3965;
			arg3.anInt3955 = this.anInt3955;
		} else {
			arg3.aBoolean300 = false;
		}
		arg3.aShortArray84 = this.aShortArray84;
		arg3.anIntArray265 = this.anIntArray265;
		return arg3;
	}

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub2.anIntArray171[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub2.anIntArray170[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3970; local15++) {
			local33 = local13 * this.anIntArray267[local15] + this.anIntArray263[local15] * local9 >> 14;
			this.anIntArray263[local15] = local13 * this.anIntArray263[local15] - local9 * this.anIntArray267[local15] >> 14;
			this.anIntArray267[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt3912; local33++) {
			@Pc(83) int local83 = this.aShortArray86[local33] * local13 + local9 * this.aShortArray87[local33] >> 14;
			this.aShortArray87[local33] = (short) (this.aShortArray87[local33] * local13 - local9 * this.aShortArray86[local33] >> 14);
			this.aShortArray86[local33] = (short) local83;
		}
		this.method3361();
		this.method3364();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "()V")
	@Override
	public void method6892() {
		if (this.anInt3912 > 0 && this.anInt3890 > 0) {
			this.method3362();
			this.method3366();
			this.method3369();
		}
	}

	@OriginalMember(owner = "client!haa", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean300) {
			this.method3368();
		}
		return this.anInt3965;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
	private void method3360() {
		if (this.anInt3890 == 0) {
			return;
		}
		if (this.method3362() && this.method3366()) {
			this.aClass16_Sub1_10.method6257(0, this.aClass82_3.anInterface16_8);
			this.aClass16_Sub1_10.method6257(1, this.aClass82_1.anInterface16_8);
			this.aClass16_Sub1_10.method6257(2, this.aClass82_4.anInterface16_8);
			@Pc(62) boolean local62;
			if ((this.anInt3905 & 0x37) == 0) {
				this.aClass16_Sub1_10.method6260(false);
				local62 = false;
				this.aClass16_Sub1_10.method6287(this.aClass16_Sub1_10.aClass277_20);
			} else {
				this.aClass16_Sub1_10.method6260(true);
				local62 = true;
				this.aClass16_Sub1_10.method6257(3, this.aClass82_2.anInterface16_8);
				this.aClass16_Sub1_10.method6287(this.aClass16_Sub1_10.aClass277_16);
			}
			for (@Pc(95) int local95 = 0; local95 < this.anIntArray264.length; local95++) {
				@Pc(102) int local102 = this.anIntArray265[local95];
				@Pc(109) int local109 = this.anIntArray265[local95 + 1];
				@Pc(116) int local116 = this.aShortArray83[local102] & 0xFFFF;
				if (local116 == 65535) {
					local116 = -1;
				}
				this.aClass16_Sub1_10.method6264(local116, local62, true);
				this.aClass16_Sub1_10.method6306(this.anIntArray266[local95], this.aClass369_1.anInterface22_8, Static425.aClass44_5, local109 - local102, this.anIntArray264[local95], local102 * 3);
			}
		}
		this.method3369();
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "()V")
	@Override
	protected void method6907() {
	}

	@OriginalMember(owner = "client!haa", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean300) {
			this.method3368();
		}
		return this.anInt3909;
	}

	@OriginalMember(owner = "client!haa", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean301;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!sk;IZ)V")
	@Override
	public void method6889(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray81 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt3970; local14++) {
			if ((this.aShortArray81[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method4287(this.anIntArray267[local14], this.anIntArray268[local14], this.anIntArray263[local14], local12);
				} else {
					arg0.method4286(this.anIntArray267[local14], this.anIntArray268[local14], this.anIntArray263[local14], local12);
				}
				this.anIntArray267[local14] = local12[0];
				this.anIntArray268[local14] = local12[1];
				this.anIntArray263[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILclient!sk;ZI)Z")
	@Override
	public boolean method6887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3370(arg3, arg0, arg4, -1, arg1, arg2);
	}

	@OriginalMember(owner = "client!haa", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3970; local3++) {
			if (arg0 != 0) {
				this.anIntArray267[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray268[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray263[local3] += arg2;
			}
		}
		this.method3361();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!haa", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub2.anIntArray171[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub2.anIntArray170[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3970; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray268[local15] - local9 * this.anIntArray263[local15] >> 14;
			this.anIntArray263[local15] = local13 * this.anIntArray263[local15] + local9 * this.anIntArray268[local15] >> 14;
			this.anIntArray268[local15] = local34;
		}
		this.method3361();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt3900; local3++) {
			local12 = this.aShortArray79[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg2 != -1) {
				local42 -= -(arg3 * (arg2 - local42) >> 7);
			}
			this.aShortArray79[local3] = (short) (local24 << 7 | local18 << 10 | local42);
		}
		if (this.aClass132Array1 != null) {
			for (local12 = 0; local12 < this.anInt3962; local12++) {
				@Pc(106) Class132 local106 = this.aClass132Array1[local12];
				@Pc(111) Class144 local111 = this.aClass144Array1[local12];
				local111.anInt3593 = Static274.anIntArray337[this.aShortArray79[local106.anInt3339] & 0xFFFF] & 0xFFFFFF | local111.anInt3593 & 0xFF000000;
			}
		}
		this.method3372();
	}

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "(I)V")
	private void method3361() {
		if (this.aClass82_3 != null) {
			this.aClass82_3.aBoolean191 = false;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6905(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
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
			local24 = 0;
			Static320.anInt5956 = 0;
			Static359.anInt6411 = 0;
			Static656.anInt1395 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray43.length) {
					local48 = this.anIntArrayArray43[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static359.anInt6411 += this.anIntArray267[local56];
						Static320.anInt5956 += this.anIntArray268[local56];
						local24++;
						Static656.anInt1395 += this.anIntArray263[local56];
					}
				}
			}
			if (local24 > 0) {
				Static359.anInt6411 = Static359.anInt6411 / local24 + local18;
				Static656.anInt1395 = Static656.anInt1395 / local24 + local22;
				Static320.anInt5956 = Static320.anInt5956 / local24 + local14;
			} else {
				Static320.anInt5956 = local14;
				Static656.anInt1395 = local22;
				Static359.anInt6411 = local18;
			}
			return;
		}
		@Pc(161) int[] local161;
		@Pc(163) int local163;
		if (arg0 == 1) {
			local18 = arg2 << 4;
			local14 = arg3 << 4;
			local22 = arg4 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray43.length) {
					local161 = this.anIntArrayArray43[local32];
					for (local163 = 0; local163 < local161.length; local163++) {
						local50 = local161[local163];
						this.anIntArray267[local50] += local18;
						this.anIntArray268[local50] += local14;
						this.anIntArray263[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(296) int local296;
		@Pc(748) int local748;
		@Pc(757) int local757;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray43.length > local32) {
					local161 = this.anIntArrayArray43[local32];
					if ((arg5 & 0x1) == 0) {
						for (local163 = 0; local163 < local161.length; local163++) {
							local50 = local161[local163];
							this.anIntArray267[local50] -= Static359.anInt6411;
							this.anIntArray268[local50] -= Static320.anInt5956;
							this.anIntArray263[local50] -= Static656.anInt1395;
							if (arg4 != 0) {
								local56 = Class3_Sub7_Sub2.anIntArray171[arg4];
								local277 = Class3_Sub7_Sub2.anIntArray170[arg4];
								local296 = this.anIntArray268[local50] * local56 + this.anIntArray267[local50] * local277 + 16383 >> 14;
								this.anIntArray268[local50] = local277 * this.anIntArray268[local50] + 16383 - local56 * this.anIntArray267[local50] >> 14;
								this.anIntArray267[local50] = local296;
							}
							if (arg2 != 0) {
								local56 = Class3_Sub7_Sub2.anIntArray171[arg2];
								local277 = Class3_Sub7_Sub2.anIntArray170[arg2];
								local296 = this.anIntArray268[local50] * local277 + 16383 - this.anIntArray263[local50] * local56 >> 14;
								this.anIntArray263[local50] = this.anIntArray268[local50] * local56 + local277 * this.anIntArray263[local50] + 16383 >> 14;
								this.anIntArray268[local50] = local296;
							}
							if (arg3 != 0) {
								local56 = Class3_Sub7_Sub2.anIntArray171[arg3];
								local277 = Class3_Sub7_Sub2.anIntArray170[arg3];
								local296 = this.anIntArray263[local50] * local56 + this.anIntArray267[local50] * local277 + 16383 >> 14;
								this.anIntArray263[local50] = local277 * this.anIntArray263[local50] + 16383 - local56 * this.anIntArray267[local50] >> 14;
								this.anIntArray267[local50] = local296;
							}
							this.anIntArray267[local50] += Static359.anInt6411;
							this.anIntArray268[local50] += Static320.anInt5956;
							this.anIntArray263[local50] += Static656.anInt1395;
						}
					} else {
						for (local163 = 0; local163 < local161.length; local163++) {
							local50 = local161[local163];
							this.anIntArray267[local50] -= Static359.anInt6411;
							this.anIntArray268[local50] -= Static320.anInt5956;
							this.anIntArray263[local50] -= Static656.anInt1395;
							if (arg2 != 0) {
								local56 = Class3_Sub7_Sub2.anIntArray171[arg2];
								local277 = Class3_Sub7_Sub2.anIntArray170[arg2];
								local296 = this.anIntArray268[local50] * local277 + 16383 - this.anIntArray263[local50] * local56 >> 14;
								this.anIntArray263[local50] = local56 * this.anIntArray268[local50] + this.anIntArray263[local50] * local277 + 16383 >> 14;
								this.anIntArray268[local50] = local296;
							}
							if (arg4 != 0) {
								local56 = Class3_Sub7_Sub2.anIntArray171[arg4];
								local277 = Class3_Sub7_Sub2.anIntArray170[arg4];
								local296 = this.anIntArray267[local50] * local277 + this.anIntArray268[local50] * local56 + 16383 >> 14;
								this.anIntArray268[local50] = this.anIntArray268[local50] * local277 + 16383 - this.anIntArray267[local50] * local56 >> 14;
								this.anIntArray267[local50] = local296;
							}
							if (arg3 != 0) {
								local56 = Class3_Sub7_Sub2.anIntArray171[arg3];
								local277 = Class3_Sub7_Sub2.anIntArray170[arg3];
								local296 = local277 * this.anIntArray267[local50] + this.anIntArray263[local50] * local56 + 16383 >> 14;
								this.anIntArray263[local50] = local277 * this.anIntArray263[local50] + 16383 - local56 * this.anIntArray267[local50] >> 14;
								this.anIntArray267[local50] = local296;
							}
							this.anIntArray267[local50] += Static359.anInt6411;
							this.anIntArray268[local50] += Static320.anInt5956;
							this.anIntArray263[local50] += Static656.anInt1395;
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
							local277 = this.anIntArray269[local56];
							local296 = this.anIntArray269[local56 + 1];
							for (local748 = local277; local748 < local296; local748++) {
								local757 = this.aShortArray84[local748] - 1;
								if (local757 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(793) int local793;
								if (arg4 != 0) {
									local770 = Class3_Sub7_Sub2.anIntArray171[arg4];
									local774 = Class3_Sub7_Sub2.anIntArray170[arg4];
									local793 = local770 * this.aShortArray80[local757] + local774 * this.aShortArray86[local757] + 16383 >> 14;
									this.aShortArray80[local757] = (short) (local774 * this.aShortArray80[local757] + 16383 - local770 * this.aShortArray86[local757] >> 14);
									this.aShortArray86[local757] = (short) local793;
								}
								if (arg2 != 0) {
									local770 = Class3_Sub7_Sub2.anIntArray171[arg2];
									local774 = Class3_Sub7_Sub2.anIntArray170[arg2];
									local793 = this.aShortArray80[local757] * local774 + 16383 - local770 * this.aShortArray87[local757] >> 14;
									this.aShortArray87[local757] = (short) (local774 * this.aShortArray87[local757] + this.aShortArray80[local757] * local770 + 16383 >> 14);
									this.aShortArray80[local757] = (short) local793;
								}
								if (arg3 != 0) {
									local770 = Class3_Sub7_Sub2.anIntArray171[arg3];
									local774 = Class3_Sub7_Sub2.anIntArray170[arg3];
									local793 = this.aShortArray86[local757] * local774 + this.aShortArray87[local757] * local770 + 16383 >> 14;
									this.aShortArray87[local757] = (short) (local774 * this.aShortArray87[local757] + 16383 - this.aShortArray86[local757] * local770 >> 14);
									this.aShortArray86[local757] = (short) local793;
								}
							}
						}
					}
				}
				this.method3364();
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray43.length > local32) {
					local161 = this.anIntArrayArray43[local32];
					for (local163 = 0; local163 < local161.length; local163++) {
						local50 = local161[local163];
						this.anIntArray267[local50] -= Static359.anInt6411;
						this.anIntArray268[local50] -= Static320.anInt5956;
						this.anIntArray263[local50] -= Static656.anInt1395;
						this.anIntArray267[local50] = this.anIntArray267[local50] * arg2 >> 7;
						this.anIntArray268[local50] = this.anIntArray268[local50] * arg3 >> 7;
						this.anIntArray263[local50] = this.anIntArray263[local50] * arg4 >> 7;
						this.anIntArray267[local50] += Static359.anInt6411;
						this.anIntArray268[local50] += Static320.anInt5956;
						this.anIntArray263[local50] += Static656.anInt1395;
					}
				}
			}
		} else {
			@Pc(1202) Class144 local1202;
			@Pc(1104) boolean local1104;
			@Pc(1197) Class132 local1197;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					local1104 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray42.length) {
							local48 = this.anIntArrayArray42[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local277 = arg2 * 8 + (this.aByteArray37[local56] & 0xFF);
								if (local277 < 0) {
									local277 = 0;
								} else if (local277 > 255) {
									local277 = 255;
								}
								this.aByteArray37[local56] = (byte) local277;
							}
							local1104 |= local48.length > 0;
						}
					}
					if (local1104) {
						if (this.aClass132Array1 != null) {
							for (local38 = 0; local38 < this.anInt3962; local38++) {
								local1197 = this.aClass132Array1[local38];
								local1202 = this.aClass144Array1[local38];
								local1202.anInt3593 = 255 - (this.aByteArray37[local1197.anInt3339] & 0xFF) << 24 | local1202.anInt3593 & 0xFFFFFF;
							}
						}
						this.method3372();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray42 != null) {
					local1104 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray42.length) {
							local48 = this.anIntArrayArray42[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local277 = this.aShortArray79[local56] & 0xFFFF;
								local296 = local277 >> 10 & 0x3F;
								local748 = local277 >> 7 & 0x7;
								local757 = local277 & 0x7F;
								local748 += arg3 / 4;
								@Pc(1307) int local1307 = arg2 + local296 & 0x3F;
								local757 += arg4;
								if (local748 < 0) {
									local748 = 0;
								} else if (local748 > 7) {
									local748 = 7;
								}
								if (local757 < 0) {
									local757 = 0;
								} else if (local757 > 127) {
									local757 = 127;
								}
								this.aShortArray79[local56] = (short) (local748 << 7 | local1307 << 10 | local757);
							}
							local1104 |= local48.length > 0;
						}
					}
					if (local1104) {
						if (this.aClass132Array1 != null) {
							for (local38 = 0; local38 < this.anInt3962; local38++) {
								local1197 = this.aClass132Array1[local38];
								local1202 = this.aClass144Array1[local38];
								local1202.anInt3593 = local1202.anInt3593 & 0xFF000000 | Static274.anIntArray337[this.aShortArray79[local1197.anInt3339] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3372();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray44 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray44.length) {
							local161 = this.anIntArrayArray44[local32];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1202 = this.aClass144Array1[local161[local163]];
								local1202.anInt3595 += arg3;
								local1202.anInt3589 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray44 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray44.length) {
							local161 = this.anIntArrayArray44[local32];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1202 = this.aClass144Array1[local161[local163]];
								local1202.anInt3590 = arg3 * local1202.anInt3590 >> 7;
								local1202.anInt3587 = local1202.anInt3587 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray44.length) {
						local161 = this.anIntArrayArray44[local32];
						for (local163 = 0; local163 < local161.length; local163++) {
							local1202 = this.aClass144Array1[local161[local163]];
							local1202.anInt3592 = arg2 + local1202.anInt3592 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "(I)Z")
	private boolean method3362() {
		@Pc(18) boolean local18 = !this.aClass82_1.aBoolean191;
		@Pc(31) boolean local31 = (this.anInt3905 & 0x37) != 0 && !this.aClass82_2.aBoolean191;
		@Pc(39) boolean local39 = !this.aClass82_3.aBoolean191;
		@Pc(47) boolean local47 = !this.aClass82_4.aBoolean191;
		if (!local39 && !local18 && !local31 && !local47) {
			return true;
		}
		@Pc(59) boolean local59 = true;
		@Pc(78) Interface16 local78;
		@Pc(92) Buffer local92;
		if (local39) {
			if (this.aClass82_3.anInterface16_7 == null) {
				this.aClass82_3.anInterface16_7 = this.aClass16_Sub1_10.method6244(this.aBoolean303);
			}
			local78 = this.aClass82_3.anInterface16_7;
			local78.method6040(this.anInt3912 * 12, 12);
			local92 = local78.method6041();
			if (local92 == null) {
				local59 = false;
			} else {
				this.aClass16_Sub1_10.aNativeInterface3.copyPositions(this.anIntArray267, this.anIntArray268, this.anIntArray263, this.aShortArray91, 0, 12, this.anInt3912, local92.getAddress());
				if (local78.method6039()) {
					this.aClass82_3.anInterface16_8 = local78;
					this.aClass82_3.aBoolean191 = true;
				} else {
					local59 = false;
				}
			}
		}
		@Pc(193) short[] local193;
		@Pc(187) short[] local187;
		@Pc(184) short[] local184;
		@Pc(190) byte[] local190;
		if (local18) {
			if (this.aClass82_1.anInterface16_7 == null) {
				this.aClass82_1.anInterface16_7 = this.aClass16_Sub1_10.method6244(this.aBoolean303);
			}
			local78 = this.aClass82_1.anInterface16_7;
			local78.method6040(this.anInt3912 * 4, 4);
			local92 = local78.method6041();
			if (local92 == null) {
				local59 = false;
			} else {
				if ((this.anInt3905 & 0x37) == 0) {
					if (this.aClass168_1 == null) {
						local184 = this.aShortArray87;
						local187 = this.aShortArray80;
						local190 = this.aByteArray38;
						local193 = this.aShortArray86;
					} else {
						local193 = this.aClass168_1.aShortArray100;
						local184 = this.aClass168_1.aShortArray99;
						local190 = this.aClass168_1.aByteArray40;
						local187 = this.aClass168_1.aShortArray101;
					}
					this.aClass16_Sub1_10.aNativeInterface3.copyLighting(this.aShortArray79, this.aByteArray37, this.aShortArray83, local193, local187, local184, local190, this.aShort55, this.aShort54, this.aShortArray88, 0, 4, this.anInt3912, local92.getAddress());
				} else {
					this.aClass16_Sub1_10.aNativeInterface3.copyColours(this.aShortArray79, this.aByteArray37, this.aShortArray83, this.aShort55, this.aShortArray88, 0, 4, this.anInt3912, local92.getAddress());
				}
				if (local78.method6039()) {
					this.aClass82_1.aBoolean191 = true;
					this.aClass82_1.anInterface16_8 = local78;
				} else {
					local59 = false;
				}
			}
		}
		if (local31) {
			if (this.aClass82_2.anInterface16_7 == null) {
				this.aClass82_2.anInterface16_7 = this.aClass16_Sub1_10.method6244(this.aBoolean303);
			}
			local78 = this.aClass82_2.anInterface16_7;
			local78.method6040(this.anInt3912 * 12, 12);
			local92 = local78.method6041();
			if (local92 == null) {
				local59 = false;
			} else {
				if (this.aClass168_1 == null) {
					local187 = this.aShortArray80;
					local193 = this.aShortArray86;
					local190 = this.aByteArray38;
					local184 = this.aShortArray87;
				} else {
					local193 = this.aClass168_1.aShortArray100;
					local187 = this.aClass168_1.aShortArray101;
					local190 = this.aClass168_1.aByteArray40;
					local184 = this.aClass168_1.aShortArray99;
				}
				this.aClass16_Sub1_10.aNativeInterface3.copyNormals(local193, local187, local184, local190, 3.0F / (float) this.aShort54, 3.0F / (float) (this.aShort54 + this.aShort54 / 2), 0, 12, this.anInt3912, local92.getAddress());
				if (local78.method6039()) {
					this.aClass82_2.aBoolean191 = true;
					this.aClass82_2.anInterface16_8 = local78;
				} else {
					local59 = false;
				}
			}
		}
		if (local47) {
			if (this.aClass82_4.anInterface16_7 == null) {
				this.aClass82_4.anInterface16_7 = this.aClass16_Sub1_10.method6244(this.aBoolean303);
			}
			local78 = this.aClass82_4.anInterface16_7;
			local78.method6040(this.anInt3912 * 8, 8);
			local92 = local78.method6041();
			if (local92 == null) {
				local59 = false;
			} else {
				this.aClass16_Sub1_10.aNativeInterface3.copyTexCoords(this.aFloatArray36, this.aFloatArray37, 0, 8, this.anInt3912, local92.getAddress());
				if (local78.method6039()) {
					this.aClass82_4.anInterface16_8 = local78;
					this.aClass82_4.aBoolean191 = true;
				} else {
					local59 = false;
				}
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!haa", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort54 = (short) arg0;
		this.method3361();
		this.method3364();
	}

	@OriginalMember(owner = "client!haa", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt3950;
	}

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "(I)V")
	private void method3363() {
		if (this.aClass369_1 != null) {
			this.aClass369_1.aBoolean715 = false;
		}
	}

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "(I)V")
	private void method3364() {
		if ((this.anInt3905 & 0x37) == 0) {
			if (this.aClass82_1 != null) {
				this.aClass82_1.aBoolean191 = false;
			}
		} else if (this.aClass82_2 != null) {
			this.aClass82_2.aBoolean191 = false;
		}
	}

	@OriginalMember(owner = "client!haa", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean302;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "()Z")
	@Override
	public boolean method6899() {
		if (this.aShortArray83 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray83.length; local12++) {
			if (this.aShortArray83[local12] != -1 && !this.aClass16_Sub1_10.anInterface5_12.method5197(this.aShortArray83[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!haa", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub2.anIntArray171[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub2.anIntArray170[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3970; local15++) {
			@Pc(33) int local33 = this.anIntArray268[local15] * local9 + local13 * this.anIntArray267[local15] >> 14;
			this.anIntArray268[local15] = this.anIntArray268[local15] * local13 - local9 * this.anIntArray267[local15] >> 14;
			this.anIntArray267[local15] = local33;
		}
		this.method3361();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!sk;Lclient!eea;II)V")
	@Override
	public void method6894(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class23_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3912 == 0) {
			return;
		}
		@Pc(13) Class25_Sub3 local13 = this.aClass16_Sub1_10.aClass25_Sub3_16;
		@Pc(16) Class25_Sub3 local16 = (Class25_Sub3) arg0;
		if (!this.aBoolean300) {
			this.method3368();
		}
		Static535.aFloat190 = local16.aFloat125 * local13.aFloat124 + local16.aFloat120 * local13.aFloat131 + local13.aFloat125 * local16.aFloat130;
		Static38.aFloat61 = local16.aFloat128 * local13.aFloat125 + local13.aFloat131 * local16.aFloat129 + local13.aFloat124 * local16.aFloat122 + local13.aFloat122;
		@Pc(69) float local69 = (float) this.anInt3909 * Static535.aFloat190 + Static38.aFloat61;
		@Pc(77) float local77 = Static535.aFloat190 * (float) this.anInt3955 + Static38.aFloat61;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.anInt3958 + local77;
			local94 = local69 + (float) this.anInt3958;
		} else {
			local88 = (float) -this.anInt3958 + local69;
			local94 = local77 + (float) this.anInt3958;
		}
		if (local88 >= this.aClass16_Sub1_10.aFloat173 || local94 <= (float) this.aClass16_Sub1_10.anInt7443) {
			return;
		}
		Static12.aFloat1 = local16.aFloat122 * local13.aFloat126 + local16.aFloat128 * local13.aFloat120 + local13.aFloat121 * local16.aFloat129 + local13.aFloat129;
		Static513.aFloat186 = local16.aFloat130 * local13.aFloat120 + local16.aFloat120 * local13.aFloat121 + local13.aFloat126 * local16.aFloat125;
		@Pc(171) float local171 = (float) this.anInt3909 * Static513.aFloat186 + Static12.aFloat1;
		@Pc(179) float local179 = Static12.aFloat1 + (float) this.anInt3955 * Static513.aFloat186;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local179 < local171) {
			local195 = ((float) -this.anInt3958 + local179) * (float) this.aClass16_Sub1_10.anInt7442;
			local206 = (float) this.aClass16_Sub1_10.anInt7442 * ((float) this.anInt3958 + local171);
		} else {
			local206 = ((float) this.anInt3958 + local179) * (float) this.aClass16_Sub1_10.anInt7442;
			local195 = (float) this.aClass16_Sub1_10.anInt7442 * ((float) -this.anInt3958 + local171);
		}
		if (this.aClass16_Sub1_10.aFloat169 <= local195 / (float) arg2 || local206 / (float) arg2 <= this.aClass16_Sub1_10.aFloat171) {
			return;
		}
		Static161.aFloat79 = local16.aFloat125 * local13.aFloat123 + local16.aFloat130 * local13.aFloat130 + local16.aFloat120 * local13.aFloat127;
		Static14.aFloat2 = local13.aFloat123 * local16.aFloat122 + local13.aFloat127 * local16.aFloat129 + local13.aFloat130 * local16.aFloat128 + local13.aFloat128;
		@Pc(298) float local298 = (float) this.anInt3909 * Static161.aFloat79 + Static14.aFloat2;
		@Pc(306) float local306 = Static14.aFloat2 + (float) this.anInt3955 * Static161.aFloat79;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local306 < local298) {
			local322 = (float) this.aClass16_Sub1_10.anInt7464 * ((float) -this.anInt3958 + local306);
			local333 = ((float) this.anInt3958 + local298) * (float) this.aClass16_Sub1_10.anInt7464;
		} else {
			local322 = (float) this.aClass16_Sub1_10.anInt7464 * ((float) -this.anInt3958 + local298);
			local333 = ((float) this.anInt3958 + local306) * (float) this.aClass16_Sub1_10.anInt7464;
		}
		if (local322 / (float) arg2 >= this.aClass16_Sub1_10.aFloat168 || this.aClass16_Sub1_10.aFloat170 >= local333 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass132Array1 != null) {
			Static449.aFloat177 = local13.aFloat120 * local16.aFloat123 + local13.aFloat121 * local16.aFloat126 + local13.aFloat126 * local16.aFloat124;
			Static463.aFloat179 = local16.aFloat131 * local13.aFloat124 + local13.aFloat125 * local16.aFloat127 + local16.aFloat121 * local13.aFloat131;
			Static146.aFloat78 = local13.aFloat126 * local16.aFloat131 + local13.aFloat121 * local16.aFloat121 + local16.aFloat127 * local13.aFloat120;
			Static604.aFloat193 = local16.aFloat126 * local13.aFloat127 + local16.aFloat123 * local13.aFloat130 + local13.aFloat123 * local16.aFloat124;
			Static378.aFloat153 = local16.aFloat124 * local13.aFloat124 + local16.aFloat123 * local13.aFloat125 + local13.aFloat131 * local16.aFloat126;
			Static614.aFloat194 = local13.aFloat130 * local16.aFloat127 + local13.aFloat127 * local16.aFloat121 + local16.aFloat131 * local13.aFloat123;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.anInt3967 + this.anInt3965 >> 1;
			@Pc(510) int local510 = this.anInt3923 + this.anInt3921 >> 1;
			@Pc(529) int local529 = (int) (Static146.aFloat78 * (float) local502 + Static12.aFloat1 + Static513.aFloat186 * (float) this.anInt3909 + Static449.aFloat177 * (float) local510);
			@Pc(548) int local548 = (int) ((float) local510 * Static604.aFloat193 + Static161.aFloat79 * (float) this.anInt3909 + Static614.aFloat194 * (float) local502 + Static14.aFloat2);
			@Pc(567) int local567 = (int) ((float) local510 * Static378.aFloat153 + Static38.aFloat61 + (float) local502 * Static463.aFloat179 + Static535.aFloat190 * (float) this.anInt3909);
			@Pc(586) int local586 = (int) (Static449.aFloat177 * (float) local510 + Static12.aFloat1 + Static146.aFloat78 * (float) local502 + (float) this.anInt3955 * Static513.aFloat186);
			@Pc(605) int local605 = (int) (Static614.aFloat194 * (float) local502 + Static14.aFloat2 + (float) this.anInt3955 * Static161.aFloat79 + (float) local510 * Static604.aFloat193);
			arg1.anInt2467 = this.aClass16_Sub1_10.anInt7460 + local529 * this.aClass16_Sub1_10.anInt7442 / arg2;
			@Pc(638) int local638 = (int) (Static38.aFloat61 + (float) local502 * Static463.aFloat179 + (float) this.anInt3955 * Static535.aFloat190 + (float) local510 * Static378.aFloat153);
			arg1.anInt2463 = this.aClass16_Sub1_10.anInt7460 + local586 * this.aClass16_Sub1_10.anInt7442 / arg2;
			arg1.anInt2465 = this.aClass16_Sub1_10.anInt7456 + local605 * this.aClass16_Sub1_10.anInt7464 / arg2;
			arg1.anInt2464 = this.aClass16_Sub1_10.anInt7456 + local548 * this.aClass16_Sub1_10.anInt7464 / arg2;
			if (local567 >= this.aClass16_Sub1_10.anInt7443 || local638 >= this.aClass16_Sub1_10.anInt7443) {
				arg1.aBoolean206 = true;
				arg1.anInt2466 = this.aClass16_Sub1_10.anInt7442 * (this.anInt3958 + local529) / arg2 + this.aClass16_Sub1_10.anInt7460 - arg1.anInt2467;
			}
		}
		this.aClass16_Sub1_10.method6286((float) arg2);
		this.aClass16_Sub1_10.method6290();
		this.aClass16_Sub1_10.method6209(local16);
		this.method3360();
		this.method3355();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub2.anIntArray171[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub2.anIntArray170[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3970; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray267[local15] + local9 * this.anIntArray263[local15] >> 14;
			this.anIntArray263[local15] = local13 * this.anIntArray263[local15] - this.anIntArray267[local15] * local9 >> 14;
			this.anIntArray267[local15] = local33;
		}
		this.method3361();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)Z")
	private boolean method3366() {
		if (this.aClass369_1.aBoolean715) {
			return true;
		}
		if (this.aClass369_1.anInterface22_7 == null) {
			this.aClass369_1.anInterface22_7 = this.aClass16_Sub1_10.method6262(this.aBoolean303);
		}
		@Pc(28) Interface22 local28 = this.aClass369_1.anInterface22_7;
		local28.method7734(this.anInt3890 * 6);
		@Pc(46) Buffer local46 = local28.method7739();
		if (local46 != null) {
			@Pc(54) Stream local54 = this.aClass16_Sub1_10.method6328(local46);
			@Pc(58) int local58;
			if (Stream.c()) {
				for (local58 = 0; local58 < this.anInt3890; local58++) {
					local54.e(this.aShortArray90[local58]);
					local54.e(this.aShortArray82[local58]);
					local54.e(this.aShortArray89[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt3890; local58++) {
					local54.a(this.aShortArray90[local58]);
					local54.a(this.aShortArray82[local58]);
					local54.a(this.aShortArray89[local58]);
				}
			}
			local54.b();
			if (local28.method7738()) {
				this.aClass369_1.anInterface22_8 = local28;
				this.aClass369_1.aBoolean715 = true;
				this.aBoolean299 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!haa", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean300) {
			this.method3368();
		}
		@Pc(16) int local16 = this.anInt3967 + arg4;
		@Pc(21) int local21 = this.anInt3965 + arg4;
		@Pc(27) int local27 = arg6 + this.anInt3921;
		@Pc(32) int local32 = this.anInt3923 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9718 <= arg2.anInt9716 + local21 >> arg2.anInt9717 || local27 < 0 || arg2.anInt9715 <= local32 + arg2.anInt9716 >> arg2.anInt9717)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9718 <= arg3.anInt9716 + local21 >> arg3.anInt9717 || local27 < 0 || arg3.anInt9715 <= arg3.anInt9716 + local32 >> arg3.anInt9717) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9717;
			local21 = local21 + arg2.anInt9716 - 1 >> arg2.anInt9717;
			local27 >>= arg2.anInt9717;
			local32 = local32 + arg2.anInt9716 - 1 >> arg2.anInt9717;
			if (arg2.method8279(local27, local16) == arg5 && arg5 == arg2.method8279(local27, local21) && arg2.method8279(local32, local16) == arg5 && arg5 == arg2.method8279(local32, local21)) {
				return;
			}
		}
		@Pc(210) int local210;
		if (arg0 == 1) {
			for (local210 = 0; local210 < this.anInt3970; local210++) {
				this.anIntArray268[local210] -= arg5 - arg2.method8286(this.anIntArray267[local210] + arg4, this.anIntArray263[local210] + arg6);
			}
		} else {
			@Pc(218) int local218;
			@Pc(226) int local226;
			if (arg0 == 2) {
				local210 = this.anInt3909;
				if (local210 == 0) {
					return;
				}
				for (local218 = 0; local218 < this.anInt3970; local218++) {
					local226 = (this.anIntArray268[local218] << 16) / local210;
					if (arg1 > local226) {
						this.anIntArray268[local218] -= -((arg1 - local226) * (arg2.method8286(arg4 + this.anIntArray267[local218], arg6 + this.anIntArray263[local218]) + -arg5) / arg1);
					}
				}
			} else {
				@Pc(234) int local234;
				if (arg0 == 3) {
					local210 = (arg1 & 0xFF) * 4;
					local218 = (arg1 >> 8 & 0xFF) * 4;
					local226 = (arg1 >> 16 & 0xFF) << 6;
					local234 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local210 >> 1) < 0 || arg2.anInt9718 << arg2.anInt9717 <= arg2.anInt9716 + arg4 + (local210 >> 1) || arg6 - (local218 >> 1) < 0 || arg2.anInt9716 + arg6 + (local218 >> 1) >= arg2.anInt9715 << arg2.anInt9717) {
						return;
					}
					this.method6906(local226, arg2, arg5, arg4, local218, local210, local234, arg6);
				} else if (arg0 == 4) {
					local210 = this.anInt3955 - this.anInt3909;
					for (local218 = 0; local218 < this.anInt3970; local218++) {
						this.anIntArray268[local218] = this.anIntArray268[local218] + arg3.method8286(arg4 + this.anIntArray267[local218], this.anIntArray263[local218] - -arg6) + local210 - arg5;
					}
				} else if (arg0 == 5) {
					local210 = this.anInt3955 - this.anInt3909;
					for (local218 = 0; local218 < this.anInt3970; local218++) {
						local226 = this.anIntArray267[local218] + arg4;
						local234 = this.anIntArray263[local218] + arg6;
						@Pc(341) int local341 = arg2.method8286(local226, local234);
						@Pc(347) int local347 = arg3.method8286(local226, local234);
						@Pc(355) int local355 = local341 - arg1 - local347;
						this.anIntArray268[local218] = ((this.anIntArray268[local218] << 8) / local210 * local355 >> 8) - (arg5 - local341);
					}
				}
			}
		}
		this.method3361();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3367(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > arg5 && arg7 > arg5 && arg0 > arg5) {
			return false;
		} else if (arg5 > arg1 && arg7 < arg5 && arg5 > arg0) {
			return false;
		} else if (arg4 < arg6 && arg2 > arg4 && arg3 > arg4) {
			return false;
		} else {
			return arg6 >= arg4 || arg4 <= arg2 || arg3 >= arg4;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V")
	private void method3368() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3970; local23++) {
			@Pc(30) int local30 = this.anIntArray267[local23];
			@Pc(35) int local35 = this.anIntArray268[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			@Pc(59) int local59 = this.anIntArray263[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local59 < local11) {
				local11 = local59;
			}
			if (local59 > local17) {
				local17 = local59;
			}
			@Pc(95) int local95 = local30 * local30 + local59 * local59;
			if (local95 > local19) {
				local19 = local95;
			}
			local95 = local35 * local35 + local59 * local59 + local30 * local30;
			if (local21 < local95) {
				local21 = local95;
			}
		}
		this.anInt3955 = local15;
		this.anInt3923 = local17;
		this.anInt3909 = local9;
		this.anInt3967 = local7;
		this.anInt3965 = local13;
		this.anInt3921 = local11;
		this.anInt3958 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt3952 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean300 = true;
	}

	@OriginalMember(owner = "client!haa", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean300) {
			this.method3368();
		}
		return this.anInt3955;
	}

	@OriginalMember(owner = "client!haa", name = "l", descriptor = "(I)V")
	private void method3369() {
		if (!this.aBoolean299) {
			return;
		}
		this.aBoolean299 = false;
		if (this.aClass261Array3 == null && this.aClass298Array3 == null && this.aClass132Array1 == null) {
			if (this.anIntArray267 != null && !Static515.method7300(this.anInt3905, this.anInt3950)) {
				if (this.aClass82_3 == null || this.aClass82_3.method2092()) {
					if (!this.aBoolean300) {
						this.method3368();
					}
					this.anIntArray267 = null;
				} else {
					this.aBoolean299 = true;
				}
			}
			if (this.anIntArray268 != null && !Static504.method8343(this.anInt3905, this.anInt3950)) {
				if (this.aClass82_3 == null || this.aClass82_3.method2092()) {
					if (!this.aBoolean300) {
						this.method3368();
					}
					this.anIntArray268 = null;
				} else {
					this.aBoolean299 = true;
				}
			}
			if (this.anIntArray263 != null && !Static354.method8517(this.anInt3950, this.anInt3905)) {
				if (this.aClass82_3 == null || this.aClass82_3.method2092()) {
					if (!this.aBoolean300) {
						this.method3368();
					}
					this.anIntArray263 = null;
				} else {
					this.aBoolean299 = true;
				}
			}
		}
		if (this.aShortArray84 != null && this.anIntArray267 == null && this.anIntArray268 == null && this.anIntArray263 == null) {
			this.aShortArray84 = null;
			this.anIntArray269 = null;
		}
		if (this.aByteArray38 != null && !Static65.method1548(this.anInt3905, this.anInt3950)) {
			label195: {
				label194: {
					@Pc(178) boolean local178;
					if ((this.anInt3905 & 0x37) == 0) {
						if (this.aClass82_1 == null || this.aClass82_1.method2092()) {
							break label194;
						}
						local178 = false;
					} else {
						if (this.aClass82_2 == null || this.aClass82_2.method2092()) {
							break label194;
						}
						local178 = false;
					}
					if (!local178) {
						this.aBoolean299 = true;
						break label195;
					}
				}
				this.aByteArray38 = null;
				this.aShortArray86 = this.aShortArray80 = this.aShortArray87 = null;
			}
		}
		if (this.aShortArray79 != null && !Static185.method2999(this.anInt3905, this.anInt3950)) {
			if (this.aClass82_1 == null || this.aClass82_1.method2092()) {
				this.aShortArray79 = null;
			} else {
				this.aBoolean299 = true;
			}
		}
		if (this.aByteArray37 != null && !Static54.method1376(this.anInt3905, this.anInt3950)) {
			if (this.aClass82_1 == null || this.aClass82_1.method2092()) {
				this.aByteArray37 = null;
			} else {
				this.aBoolean299 = true;
			}
		}
		if (this.aFloatArray36 != null && !Static102.method2012(this.anInt3950, this.anInt3905)) {
			if (this.aClass82_4 == null || this.aClass82_4.method2092()) {
				this.aFloatArray36 = this.aFloatArray37 = null;
			} else {
				this.aBoolean299 = true;
			}
		}
		if (this.aShortArray83 != null && !Static554.method7249(this.anInt3950, this.anInt3905)) {
			if (this.aClass82_1 == null || this.aClass82_1.method2092()) {
				this.aShortArray83 = null;
			} else {
				this.aBoolean299 = true;
			}
		}
		if (this.aShortArray90 != null && !Static5.method58(this.anInt3950, this.anInt3905)) {
			if ((this.aClass369_1 == null || this.aClass369_1.method8256()) && (this.aClass82_1 == null || this.aClass82_1.method2092())) {
				this.aShortArray90 = this.aShortArray82 = this.aShortArray89 = null;
			} else {
				this.aBoolean299 = true;
			}
		}
		if (this.aShortArray91 != null) {
			if (this.aClass82_3 == null || this.aClass82_3.method2092()) {
				this.aShortArray91 = null;
			} else {
				this.aBoolean299 = true;
			}
		}
		if (this.aShortArray88 != null) {
			if (this.aClass82_1 == null || this.aClass82_1.method2092()) {
				this.aShortArray88 = null;
			} else {
				this.aBoolean299 = true;
			}
		}
		if (this.anIntArrayArray42 != null && !Static382.method5595(this.anInt3905, this.anInt3950)) {
			this.aShortArray92 = null;
			this.anIntArrayArray42 = null;
		}
		if (this.anIntArrayArray43 != null && !Static206.method3264(this.anInt3950, this.anInt3905)) {
			this.aShortArray81 = null;
			this.anIntArrayArray43 = null;
		}
		if (this.anIntArrayArray44 != null && !Static14.method135(this.anInt3905, this.anInt3950)) {
			this.anIntArrayArray44 = null;
		}
		if (this.anIntArray265 != null && (this.anInt3950 & 0x800) == 0 && (this.anInt3950 & 0x40000) == 0) {
			this.anIntArray265 = null;
			this.anIntArray264 = null;
			this.anIntArray266 = null;
		}
	}

	@OriginalMember(owner = "client!haa", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub6_Sub12 ba(@OriginalArg(0) Class3_Sub6_Sub12 arg0) {
		if (this.anInt3912 == 0) {
			return null;
		}
		if (!this.aBoolean300) {
			this.method3368();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass16_Sub1_10.anInt7439 <= 0) {
			local40 = this.anInt3967 - (this.aClass16_Sub1_10.anInt7439 * this.anInt3909 >> 8) >> this.aClass16_Sub1_10.anInt7446;
			local57 = this.anInt3965 - (this.anInt3955 * this.aClass16_Sub1_10.anInt7439 >> 8) >> this.aClass16_Sub1_10.anInt7446;
		} else {
			local40 = this.anInt3967 - (this.aClass16_Sub1_10.anInt7439 * this.anInt3955 >> 8) >> this.aClass16_Sub1_10.anInt7446;
			local57 = this.anInt3965 - (this.aClass16_Sub1_10.anInt7439 * this.anInt3909 >> 8) >> this.aClass16_Sub1_10.anInt7446;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass16_Sub1_10.anInt7463 > 0) {
			local116 = this.anInt3921 - (this.aClass16_Sub1_10.anInt7463 * this.anInt3955 >> 8) >> this.aClass16_Sub1_10.anInt7446;
			local133 = this.anInt3923 - (this.anInt3909 * this.aClass16_Sub1_10.anInt7463 >> 8) >> this.aClass16_Sub1_10.anInt7446;
		} else {
			local116 = this.anInt3921 - (this.aClass16_Sub1_10.anInt7463 * this.anInt3909 >> 8) >> this.aClass16_Sub1_10.anInt7446;
			local133 = this.anInt3923 - (this.anInt3955 * this.aClass16_Sub1_10.anInt7463 >> 8) >> this.aClass16_Sub1_10.anInt7446;
		}
		@Pc(176) int local176 = local57 + 1 - local40;
		@Pc(183) int local183 = local133 + 1 - local116;
		@Pc(186) Class3_Sub6_Sub12_Sub1 local186 = (Class3_Sub6_Sub12_Sub1) arg0;
		@Pc(196) Class3_Sub6_Sub12_Sub1 local196;
		if (local186 != null && local186.method4121(local176, local183)) {
			local196 = local186;
			local186.method4119();
		} else {
			local196 = new Class3_Sub6_Sub12_Sub1(this.aClass16_Sub1_10, local176, local183);
		}
		local196.method4122(local57, local133, local116, local40);
		this.method3356(local196);
		return local196;
	}

	@OriginalMember(owner = "client!haa", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3900; local7++) {
			if (this.aShortArray79[local7] == arg0) {
				this.aShortArray79[local7] = arg1;
			}
		}
		if (this.aClass132Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt3962; local34++) {
				@Pc(41) Class132 local41 = this.aClass132Array1[local34];
				@Pc(46) Class144 local46 = this.aClass144Array1[local34];
				local46.anInt3593 = local46.anInt3593 & 0xFF000000 | Static274.anIntArray337[this.aShortArray79[local41.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3372();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZIIIILclient!sk;I)Z")
	private boolean method3370(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class25 arg5) {
		@Pc(17) Class25_Sub3 local17 = (Class25_Sub3) arg5;
		@Pc(21) Class25_Sub3 local21 = this.aClass16_Sub1_10.aClass25_Sub3_16;
		@Pc(42) float local42 = local21.aFloat129 + local21.aFloat120 * local17.aFloat128 + local17.aFloat129 * local21.aFloat121 + local21.aFloat126 * local17.aFloat122;
		@Pc(63) float local63 = local21.aFloat128 + local17.aFloat122 * local21.aFloat123 + local17.aFloat129 * local21.aFloat127 + local17.aFloat128 * local21.aFloat130;
		@Pc(84) float local84 = local17.aFloat128 * local21.aFloat125 + local21.aFloat131 * local17.aFloat129 + local17.aFloat122 * local21.aFloat124 + local21.aFloat122;
		Static378.aFloat153 = local21.aFloat131 * local17.aFloat126 + local17.aFloat123 * local21.aFloat125 + local17.aFloat124 * local21.aFloat124;
		Static146.aFloat78 = local17.aFloat127 * local21.aFloat120 + local21.aFloat121 * local17.aFloat121 + local21.aFloat126 * local17.aFloat131;
		Static604.aFloat193 = local21.aFloat127 * local17.aFloat126 + local17.aFloat123 * local21.aFloat130 + local17.aFloat124 * local21.aFloat123;
		Static161.aFloat79 = local21.aFloat123 * local17.aFloat125 + local17.aFloat120 * local21.aFloat127 + local21.aFloat130 * local17.aFloat130;
		Static614.aFloat194 = local21.aFloat130 * local17.aFloat127 + local17.aFloat121 * local21.aFloat127 + local17.aFloat131 * local21.aFloat123;
		Static535.aFloat190 = local21.aFloat131 * local17.aFloat120 + local17.aFloat130 * local21.aFloat125 + local17.aFloat125 * local21.aFloat124;
		Static463.aFloat179 = local17.aFloat131 * local21.aFloat124 + local21.aFloat125 * local17.aFloat127 + local17.aFloat121 * local21.aFloat131;
		Static513.aFloat186 = local17.aFloat125 * local21.aFloat126 + local21.aFloat121 * local17.aFloat120 + local17.aFloat130 * local21.aFloat120;
		Static449.aFloat177 = local17.aFloat124 * local21.aFloat126 + local17.aFloat123 * local21.aFloat120 + local17.aFloat126 * local21.aFloat121;
		@Pc(248) boolean local248 = false;
		@Pc(250) float local250 = Float.MAX_VALUE;
		@Pc(252) float local252 = -3.4028235E38F;
		@Pc(254) float local254 = Float.MAX_VALUE;
		@Pc(256) float local256 = -3.4028235E38F;
		@Pc(260) int local260 = this.aClass16_Sub1_10.anInt7442;
		@Pc(264) int local264 = this.aClass16_Sub1_10.anInt7464;
		if (!this.aBoolean300) {
			this.method3368();
		}
		@Pc(279) int local279 = this.anInt3965 - this.anInt3967 >> 1;
		@Pc(288) int local288 = this.anInt3955 - this.anInt3909 >> 1;
		@Pc(297) int local297 = this.anInt3923 - this.anInt3921 >> 1;
		@Pc(302) int local302 = local279 + this.anInt3967;
		@Pc(308) int local308 = this.anInt3909 + local288;
		@Pc(314) int local314 = this.anInt3921 + local297;
		@Pc(321) int local321 = local302 - (local279 << arg2);
		@Pc(327) int local327 = local308 - (local288 << arg2);
		@Pc(334) int local334 = local314 - (local297 << arg2);
		@Pc(340) int local340 = (local279 << arg2) + local302;
		@Pc(346) int local346 = local308 + (local288 << arg2);
		Static605.anIntArray620[0] = local321;
		@Pc(356) int local356 = (local297 << arg2) + local314;
		Static258.anIntArray327[0] = local327;
		Static605.anIntArray620[1] = local340;
		Static275.anIntArray425[0] = local334;
		Static258.anIntArray327[1] = local327;
		Static275.anIntArray425[1] = local334;
		Static605.anIntArray620[2] = local321;
		Static258.anIntArray327[2] = local346;
		Static605.anIntArray620[3] = local340;
		Static275.anIntArray425[2] = local334;
		Static258.anIntArray327[3] = local346;
		Static605.anIntArray620[4] = local321;
		Static275.anIntArray425[3] = local334;
		Static258.anIntArray327[4] = local327;
		Static275.anIntArray425[4] = local356;
		Static605.anIntArray620[5] = local340;
		Static258.anIntArray327[5] = local327;
		Static605.anIntArray620[6] = local321;
		Static275.anIntArray425[5] = local356;
		Static258.anIntArray327[6] = local346;
		Static275.anIntArray425[6] = local356;
		Static605.anIntArray620[7] = local340;
		Static258.anIntArray327[7] = local346;
		Static275.anIntArray425[7] = local356;
		@Pc(481) float local481;
		@Pc(509) float local509;
		@Pc(495) float local495;
		@Pc(457) float local457;
		@Pc(462) float local462;
		@Pc(467) float local467;
		for (@Pc(450) int local450 = 0; local450 < 8; local450++) {
			local457 = (float) Static605.anIntArray620[local450];
			local462 = (float) Static258.anIntArray327[local450];
			local467 = (float) Static275.anIntArray425[local450];
			local481 = local42 + local462 * Static513.aFloat186 + Static146.aFloat78 * local457 + Static449.aFloat177 * local467;
			local495 = local84 + local462 * Static535.aFloat190 + local457 * Static463.aFloat179 + Static378.aFloat153 * local467;
			local509 = local63 + Static604.aFloat193 * local467 + Static161.aFloat79 * local462 + local457 * Static614.aFloat194;
			if (local495 >= (float) this.aClass16_Sub1_10.anInt7443) {
				if (arg3 > 0) {
					local495 = (float) arg3;
				}
				@Pc(536) float local536 = local481 * (float) local260 / local495 + (float) this.aClass16_Sub1_10.anInt7460;
				if (local536 < local250) {
					local250 = local536;
				}
				if (local536 > local252) {
					local252 = local536;
				}
				@Pc(560) float local560 = (float) this.aClass16_Sub1_10.anInt7456 + (float) local264 * local509 / local495;
				if (local560 > local256) {
					local256 = local560;
				}
				if (local254 > local560) {
					local254 = local560;
				}
				local248 = true;
			}
		}
		if (local248 && (float) arg1 > local250 && local252 > (float) arg1 && (float) arg4 > local254 && local256 > (float) arg4) {
			if (arg0) {
				return true;
			}
			if (Static634.anIntArray636.length < this.anInt3912) {
				Static634.anIntArray636 = new int[this.anInt3912];
				Static374.anIntArray410 = new int[this.anInt3912];
			}
			@Pc(715) int local715;
			for (@Pc(625) int local625 = 0; local625 < this.anInt3970; local625++) {
				local462 = (float) this.anIntArray268[local625];
				local457 = (float) this.anIntArray267[local625];
				local467 = (float) this.anIntArray263[local625];
				local495 = Static378.aFloat153 * local467 + Static463.aFloat179 * local457 + local462 * Static535.aFloat190 + local84;
				local481 = local42 + Static146.aFloat78 * local457 + local462 * Static513.aFloat186 + local467 * Static449.aFloat177;
				local509 = local457 * Static614.aFloat194 + Static161.aFloat79 * local462 + Static604.aFloat193 * local467 + local63;
				@Pc(728) int local728;
				@Pc(733) int local733;
				@Pc(740) int local740;
				if ((float) this.aClass16_Sub1_10.anInt7443 <= local495) {
					if (arg3 > 0) {
						local495 = (float) arg3;
					}
					local715 = (int) ((float) this.aClass16_Sub1_10.anInt7460 + local481 * (float) local260 / local495);
					local728 = (int) ((float) this.aClass16_Sub1_10.anInt7456 + (float) local264 * local509 / local495);
					local733 = this.anIntArray269[local625];
					local740 = this.anIntArray269[local625 + 1];
					for (@Pc(742) int local742 = local733; local742 < local740; local742++) {
						@Pc(751) int local751 = this.aShortArray84[local742] - 1;
						if (local751 == -1) {
							break;
						}
						Static634.anIntArray636[local751] = local715;
						Static374.anIntArray410[local751] = local728;
					}
				} else {
					local715 = this.anIntArray269[local625];
					local728 = this.anIntArray269[local625 + 1];
					for (local733 = local715; local733 < local728; local733++) {
						local740 = this.aShortArray84[local733] - 1;
						if (local740 == -1) {
							break;
						}
						Static634.anIntArray636[this.aShortArray84[local733] - 1] = -999999;
					}
				}
			}
			for (local715 = 0; local715 < this.anInt3900; local715++) {
				if (Static634.anIntArray636[this.aShortArray90[local715]] != -999999 && Static634.anIntArray636[this.aShortArray82[local715]] != -999999 && Static634.anIntArray636[this.aShortArray89[local715]] != -999999 && this.method3367(Static374.anIntArray410[this.aShortArray89[local715]], Static374.anIntArray410[this.aShortArray90[local715]], Static634.anIntArray636[this.aShortArray82[local715]], Static634.anIntArray636[this.aShortArray89[local715]], arg1, arg4, Static634.anIntArray636[this.aShortArray90[local715]], Static374.anIntArray410[this.aShortArray82[local715]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!haa", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3970; local3++) {
			this.anIntArray263[local3] = -this.anIntArray263[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3912; local25++) {
			this.aShortArray87[local25] = (short) -this.aShortArray87[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt3900; local48++) {
			@Pc(55) short local55 = this.aShortArray90[local48];
			this.aShortArray90[local48] = this.aShortArray89[local48];
			this.aShortArray89[local48] = local55;
		}
		this.method3361();
		this.method3364();
		this.method3363();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!sk;Lclient!eea;I)V")
	@Override
	public void method6908(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class23_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3912 == 0) {
			return;
		}
		@Pc(16) Class25_Sub3 local16 = this.aClass16_Sub1_10.aClass25_Sub3_16;
		@Pc(19) Class25_Sub3 local19 = (Class25_Sub3) arg0;
		if (!this.aBoolean300) {
			this.method3368();
		}
		Static38.aFloat61 = local16.aFloat122 + local19.aFloat129 * local16.aFloat131 + local16.aFloat125 * local19.aFloat128 + local16.aFloat124 * local19.aFloat122;
		Static535.aFloat190 = local16.aFloat124 * local19.aFloat125 + local19.aFloat120 * local16.aFloat131 + local19.aFloat130 * local16.aFloat125;
		@Pc(72) float local72 = Static38.aFloat61 + (float) this.anInt3909 * Static535.aFloat190;
		@Pc(80) float local80 = Static535.aFloat190 * (float) this.anInt3955 + Static38.aFloat61;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.anInt3958 + local72;
			local97 = local80 - (float) this.anInt3958;
		} else {
			local90 = local80 + (float) this.anInt3958;
			local97 = (float) -this.anInt3958 + local72;
		}
		if (this.aClass16_Sub1_10.aFloat167 <= local97 || (float) this.aClass16_Sub1_10.anInt7443 >= local90) {
			return;
		}
		Static12.aFloat1 = local16.aFloat126 * local19.aFloat122 + local19.aFloat128 * local16.aFloat120 + local16.aFloat121 * local19.aFloat129 + local16.aFloat129;
		Static513.aFloat186 = local19.aFloat130 * local16.aFloat120 + local16.aFloat121 * local19.aFloat120 + local16.aFloat126 * local19.aFloat125;
		@Pc(173) float local173 = Static12.aFloat1 + Static513.aFloat186 * (float) this.anInt3909;
		@Pc(181) float local181 = (float) this.anInt3955 * Static513.aFloat186 + Static12.aFloat1;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local181 < local173) {
			local196 = (local181 - (float) this.anInt3958) * (float) this.aClass16_Sub1_10.anInt7442;
			local207 = (float) this.aClass16_Sub1_10.anInt7442 * (local173 + (float) this.anInt3958);
		} else {
			local196 = ((float) -this.anInt3958 + local173) * (float) this.aClass16_Sub1_10.anInt7442;
			local207 = ((float) this.anInt3958 + local181) * (float) this.aClass16_Sub1_10.anInt7442;
		}
		if (this.aClass16_Sub1_10.aFloat169 <= local196 / local90 || this.aClass16_Sub1_10.aFloat171 >= local207 / local90) {
			return;
		}
		Static161.aFloat79 = local19.aFloat125 * local16.aFloat123 + local16.aFloat127 * local19.aFloat120 + local19.aFloat130 * local16.aFloat130;
		Static14.aFloat2 = local16.aFloat127 * local19.aFloat129 + local19.aFloat128 * local16.aFloat130 + local16.aFloat123 * local19.aFloat122 + local16.aFloat128;
		@Pc(297) float local297 = Static14.aFloat2 + (float) this.anInt3909 * Static161.aFloat79;
		@Pc(305) float local305 = Static14.aFloat2 + (float) this.anInt3955 * Static161.aFloat79;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local305 < local297) {
			local320 = ((float) this.anInt3958 + local297) * (float) this.aClass16_Sub1_10.anInt7464;
			local332 = (local305 - (float) this.anInt3958) * (float) this.aClass16_Sub1_10.anInt7464;
		} else {
			local320 = (local305 + (float) this.anInt3958) * (float) this.aClass16_Sub1_10.anInt7464;
			local332 = ((float) -this.anInt3958 + local297) * (float) this.aClass16_Sub1_10.anInt7464;
		}
		if (this.aClass16_Sub1_10.aFloat168 <= local332 / local90 || this.aClass16_Sub1_10.aFloat170 >= local320 / local90) {
			return;
		}
		if (arg1 != null || this.aClass132Array1 != null) {
			Static378.aFloat153 = local16.aFloat124 * local19.aFloat124 + local16.aFloat125 * local19.aFloat123 + local19.aFloat126 * local16.aFloat131;
			Static604.aFloat193 = local16.aFloat123 * local19.aFloat124 + local16.aFloat127 * local19.aFloat126 + local16.aFloat130 * local19.aFloat123;
			Static449.aFloat177 = local19.aFloat123 * local16.aFloat120 + local19.aFloat126 * local16.aFloat121 + local19.aFloat124 * local16.aFloat126;
			Static146.aFloat78 = local19.aFloat121 * local16.aFloat121 + local16.aFloat120 * local19.aFloat127 + local19.aFloat131 * local16.aFloat126;
			Static614.aFloat194 = local16.aFloat123 * local19.aFloat131 + local19.aFloat121 * local16.aFloat127 + local19.aFloat127 * local16.aFloat130;
			Static463.aFloat179 = local16.aFloat125 * local19.aFloat127 + local19.aFloat121 * local16.aFloat131 + local16.aFloat124 * local19.aFloat131;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(502) int local502 = this.anInt3967 + this.anInt3965 >> 1;
			@Pc(510) int local510 = this.anInt3923 + this.anInt3921 >> 1;
			@Pc(529) int local529 = (int) (Static449.aFloat177 * (float) local510 + Static146.aFloat78 * (float) local502 + Static12.aFloat1 + Static513.aFloat186 * (float) this.anInt3909);
			@Pc(548) int local548 = (int) ((float) this.anInt3909 * Static161.aFloat79 + Static614.aFloat194 * (float) local502 + Static14.aFloat2 + (float) local510 * Static604.aFloat193);
			@Pc(567) int local567 = (int) (Static535.aFloat190 * (float) this.anInt3909 + Static463.aFloat179 * (float) local502 + Static38.aFloat61 + (float) local510 * Static378.aFloat153);
			if (local567 < this.aClass16_Sub1_10.anInt7443) {
				local491 = true;
			} else {
				arg1.anInt2467 = this.aClass16_Sub1_10.anInt7442 * local529 / local567 + this.aClass16_Sub1_10.anInt7460;
				arg1.anInt2464 = this.aClass16_Sub1_10.anInt7456 + local548 * this.aClass16_Sub1_10.anInt7464 / local567;
			}
			@Pc(626) int local626 = (int) (Static146.aFloat78 * (float) local502 + Static12.aFloat1 + Static513.aFloat186 * (float) this.anInt3955 + (float) local510 * Static449.aFloat177);
			@Pc(645) int local645 = (int) (Static161.aFloat79 * (float) this.anInt3955 + Static14.aFloat2 + (float) local502 * Static614.aFloat194 + Static604.aFloat193 * (float) local510);
			@Pc(664) int local664 = (int) (Static378.aFloat153 * (float) local510 + (float) this.anInt3955 * Static535.aFloat190 + Static38.aFloat61 + Static463.aFloat179 * (float) local502);
			if (local664 < this.aClass16_Sub1_10.anInt7443) {
				local491 = true;
			} else {
				arg1.anInt2463 = this.aClass16_Sub1_10.anInt7442 * local626 / local664 + this.aClass16_Sub1_10.anInt7460;
				arg1.anInt2465 = this.aClass16_Sub1_10.anInt7464 * local645 / local664 + this.aClass16_Sub1_10.anInt7456;
			}
			if (local491) {
				if (local567 < this.aClass16_Sub1_10.anInt7443 && local664 < this.aClass16_Sub1_10.anInt7443) {
					local493 = false;
				} else {
					@Pc(754) int local754;
					@Pc(765) int local765;
					@Pc(791) int local791;
					if (local567 < this.aClass16_Sub1_10.anInt7443) {
						local754 = (local664 - this.aClass16_Sub1_10.anInt7443 << 16) / (local664 - local567);
						local765 = local626 + ((local626 - local529) * local754 >> 16);
						arg1.anInt2467 = local765 * this.aClass16_Sub1_10.anInt7442 / this.aClass16_Sub1_10.anInt7443 + this.aClass16_Sub1_10.anInt7460;
						local791 = local645 + ((local645 - local548) * local754 >> 16);
						arg1.anInt2464 = this.aClass16_Sub1_10.anInt7464 * local791 / this.aClass16_Sub1_10.anInt7443 + this.aClass16_Sub1_10.anInt7456;
					} else if (local664 < this.aClass16_Sub1_10.anInt7443) {
						local754 = (local567 - this.aClass16_Sub1_10.anInt7443 << 16) / (local567 - local664);
						local765 = ((local529 - local626) * local754 >> 16) + local529;
						arg1.anInt2467 = local765 * this.aClass16_Sub1_10.anInt7442 / this.aClass16_Sub1_10.anInt7443 + this.aClass16_Sub1_10.anInt7460;
						local791 = local548 + ((local548 - local645) * local754 >> 16);
						arg1.anInt2464 = local791 * this.aClass16_Sub1_10.anInt7464 / this.aClass16_Sub1_10.anInt7443 + this.aClass16_Sub1_10.anInt7456;
					}
				}
			}
			if (local493) {
				if (local664 >= local567) {
					arg1.anInt2466 = (local626 + this.anInt3958) * this.aClass16_Sub1_10.anInt7442 / local664 + this.aClass16_Sub1_10.anInt7460 - arg1.anInt2463;
				} else {
					arg1.anInt2466 = (this.anInt3958 + local529) * this.aClass16_Sub1_10.anInt7442 / local567 + this.aClass16_Sub1_10.anInt7460 - arg1.anInt2467;
				}
				arg1.aBoolean206 = true;
			}
		}
		this.aClass16_Sub1_10.method6267();
		this.aClass16_Sub1_10.method6209(local19);
		this.method3360();
		this.method3355();
	}

	@OriginalMember(owner = "client!haa", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static656.anInt1395 = 0;
			Static359.anInt6411 = 0;
			local31 = 0;
			Static320.anInt5956 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray43.length > local41) {
					local55 = this.anIntArrayArray43[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray81 == null || (this.aShortArray81[local63] & arg6) != 0) {
							Static359.anInt6411 += this.anIntArray267[local63];
							Static320.anInt5956 += this.anIntArray268[local63];
							Static656.anInt1395 += this.anIntArray263[local63];
							local31++;
						}
					}
				}
			}
			if (local31 <= 0) {
				Static359.anInt6411 = arg2;
				Static320.anInt5956 = arg3;
				Static656.anInt1395 = arg4;
			} else {
				Static359.anInt6411 = arg2 + Static359.anInt6411 / local31;
				Static656.anInt1395 = arg4 + Static656.anInt1395 / local31;
				Static320.anInt5956 = Static320.anInt5956 / local31 + arg3;
				Static521.aBoolean657 = true;
			}
			return;
		}
		@Pc(252) int[] local252;
		@Pc(254) int local254;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg7[0] * arg2 + arg3 * arg7[1] + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg3 * arg7[4] + arg2 * arg7[3] + 8192 >> 14;
				local41 = arg4 * arg7[8] + arg7[7] * arg3 + arg2 * arg7[6] + 8192 >> 14;
				arg3 = local35;
				arg4 = local41;
				arg2 = local31;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray43.length > local35) {
					local252 = this.anIntArrayArray43[local35];
					for (local254 = 0; local254 < local252.length; local254++) {
						local57 = local252[local254];
						if (this.aShortArray81 == null || (this.aShortArray81[local57] & arg6) != 0) {
							this.anIntArray267[local57] += arg2;
							this.anIntArray268[local57] += arg3;
							this.anIntArray263[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(380) int local380;
		@Pc(402) int local402;
		@Pc(428) int local428;
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
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray43.length) {
						local252 = this.anIntArrayArray43[local35];
						for (local254 = 0; local254 < local252.length; local254++) {
							local57 = local252[local254];
							if (this.aShortArray81 == null || (this.aShortArray81[local57] & arg6) != 0) {
								this.anIntArray267[local57] -= Static359.anInt6411;
								this.anIntArray268[local57] -= Static320.anInt5956;
								this.anIntArray263[local57] -= Static656.anInt1395;
								if (arg4 != 0) {
									local63 = Class3_Sub7_Sub2.anIntArray171[arg4];
									local380 = Class3_Sub7_Sub2.anIntArray170[arg4];
									local402 = this.anIntArray268[local57] * local63 + this.anIntArray267[local57] * local380 + 16383 >> 14;
									this.anIntArray268[local57] = this.anIntArray268[local57] * local380 + 16383 - local63 * this.anIntArray267[local57] >> 14;
									this.anIntArray267[local57] = local402;
								}
								if (arg2 != 0) {
									local63 = Class3_Sub7_Sub2.anIntArray171[arg2];
									local380 = Class3_Sub7_Sub2.anIntArray170[arg2];
									local402 = this.anIntArray268[local57] * local380 + 16383 - local63 * this.anIntArray263[local57] >> 14;
									this.anIntArray263[local57] = this.anIntArray268[local57] * local63 + this.anIntArray263[local57] * local380 + 16383 >> 14;
									this.anIntArray268[local57] = local402;
								}
								if (arg3 != 0) {
									local63 = Class3_Sub7_Sub2.anIntArray171[arg3];
									local380 = Class3_Sub7_Sub2.anIntArray170[arg3];
									local402 = this.anIntArray267[local57] * local380 + this.anIntArray263[local57] * local63 + 16383 >> 14;
									this.anIntArray263[local57] = local380 * this.anIntArray263[local57] + 16383 - this.anIntArray267[local57] * local63 >> 14;
									this.anIntArray267[local57] = local402;
								}
								this.anIntArray267[local57] += Static359.anInt6411;
								this.anIntArray268[local57] += Static320.anInt5956;
								this.anIntArray263[local57] += Static656.anInt1395;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray43.length > local41) {
							local55 = this.anIntArrayArray43[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray81 == null || (this.aShortArray81[local63] & arg6) != 0) {
									local380 = this.anIntArray269[local63];
									local402 = this.anIntArray269[local63 + 1];
									for (local428 = local380; local428 < local402; local428++) {
										local459 = this.aShortArray84[local428] - 1;
										if (local459 == -1) {
											break;
										}
										if (arg4 != 0) {
											local463 = Class3_Sub7_Sub2.anIntArray171[arg4];
											local467 = Class3_Sub7_Sub2.anIntArray170[arg4];
											local471 = local467 * this.aShortArray86[local459] + this.aShortArray80[local459] * local463 + 16383 >> 14;
											this.aShortArray80[local459] = (short) (this.aShortArray80[local459] * local467 + 16383 - local463 * this.aShortArray86[local459] >> 14);
											this.aShortArray86[local459] = (short) local471;
										}
										if (arg2 != 0) {
											local463 = Class3_Sub7_Sub2.anIntArray171[arg2];
											local467 = Class3_Sub7_Sub2.anIntArray170[arg2];
											local471 = local467 * this.aShortArray80[local459] + 16383 - local463 * this.aShortArray87[local459] >> 14;
											this.aShortArray87[local459] = (short) (this.aShortArray80[local459] * local463 + local467 * this.aShortArray87[local459] + 16383 >> 14);
											this.aShortArray80[local459] = (short) local471;
										}
										if (arg3 != 0) {
											local463 = Class3_Sub7_Sub2.anIntArray171[arg3];
											local467 = Class3_Sub7_Sub2.anIntArray170[arg3];
											local471 = local467 * this.aShortArray86[local459] + this.aShortArray87[local459] * local463 + 16383 >> 14;
											this.aShortArray87[local459] = (short) (local467 * this.aShortArray87[local459] + 16383 - local463 * this.aShortArray86[local459] >> 14);
											this.aShortArray86[local459] = (short) local471;
										}
									}
								}
							}
						}
					}
					this.method3364();
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local254 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static521.aBoolean657) {
					local380 = Static359.anInt6411 * arg7[0] + Static320.anInt5956 * arg7[3] + Static656.anInt1395 * arg7[6] + 8192 >> 14;
					local402 = Static656.anInt1395 * arg7[7] + arg7[1] * Static359.anInt6411 + arg7[4] * Static320.anInt5956 + 8192 >> 14;
					local380 += local254;
					local428 = arg7[8] * Static656.anInt1395 + arg7[5] * Static320.anInt5956 + arg7[2] * Static359.anInt6411 + 8192 >> 14;
					local402 += local57;
					local428 += local63;
					Static359.anInt6411 = local380;
					Static320.anInt5956 = local402;
					Static521.aBoolean657 = false;
					Static656.anInt1395 = local428;
				}
				@Pc(447) int[] local447 = new int[9];
				local402 = Class3_Sub7_Sub2.anIntArray170[arg2];
				local428 = Class3_Sub7_Sub2.anIntArray171[arg2];
				local459 = Class3_Sub7_Sub2.anIntArray170[arg3];
				local463 = Class3_Sub7_Sub2.anIntArray171[arg3];
				local467 = Class3_Sub7_Sub2.anIntArray170[arg4];
				local471 = Class3_Sub7_Sub2.anIntArray171[arg4];
				local479 = local428 * local467 + 8192 >> 14;
				local487 = local428 * local471 + 8192 >> 14;
				local447[3] = local402 * local471 + 8192 >> 14;
				local447[4] = local402 * local467 + 8192 >> 14;
				local447[2] = local402 * local463 + 8192 >> 14;
				local447[1] = local471 * -local459 + local463 * local479 + 8192 >> 14;
				local447[8] = local459 * local402 + 8192 >> 14;
				local447[6] = -local463 * local467 + local487 * local459 + 8192 >> 14;
				local447[7] = local479 * local459 + local463 * local471 + 8192 >> 14;
				local447[5] = -local428;
				local447[0] = local463 * local487 + local467 * local459 + 8192 >> 14;
				@Pc(617) int local617 = local447[1] * -Static320.anInt5956 + local447[0] * -Static359.anInt6411 + -Static656.anInt1395 * local447[2] + 8192 >> 14;
				local642 = -Static656.anInt1395 * local447[5] + -Static359.anInt6411 * local447[3] + local447[4] * -Static320.anInt5956 + 8192 >> 14;
				local667 = local447[8] * -Static656.anInt1395 + -Static359.anInt6411 * local447[6] + local447[7] * -Static320.anInt5956 + 8192 >> 14;
				local671 = Static359.anInt6411 + local617;
				@Pc(675) int local675 = local642 + Static320.anInt5956;
				local679 = Static656.anInt1395 + local667;
				@Pc(682) int[] local682 = new int[9];
				for (local684 = 0; local684 < 3; local684++) {
					for (local688 = 0; local688 < 3; local688++) {
						local692 = 0;
						for (local694 = 0; local694 < 3; local694++) {
							local692 += arg7[local694 + local688 * 3] * local447[local684 * 3 + local694];
						}
						local682[local684 * 3 + local688] = local692 + 8192 >> 14;
					}
				}
				local688 = local447[2] * local63 + local447[1] * local57 + local254 * local447[0] + 8192 >> 14;
				local692 = local63 * local447[5] + local447[4] * local57 + local254 * local447[3] + 8192 >> 14;
				local692 += local675;
				local688 += local671;
				local694 = local57 * local447[7] + local254 * local447[6] + local447[8] * local63 + 8192 >> 14;
				local694 += local679;
				local823 = new int[9];
				for (local825 = 0; local825 < 3; local825++) {
					for (local829 = 0; local829 < 3; local829++) {
						local833 = 0;
						for (local835 = 0; local835 < 3; local835++) {
							local833 += arg7[local835 + local825 * 3] * local682[local835 * 3 + local829];
						}
						local823[local825 * 3 + local829] = local833 + 8192 >> 14;
					}
				}
				local829 = arg7[0] * local688 + arg7[1] * local692 + arg7[2] * local694 + 8192 >> 14;
				local833 = local694 * arg7[5] + local688 * arg7[3] + arg7[4] * local692 + 8192 >> 14;
				local829 += local31;
				local835 = arg7[6] * local688 + local692 * arg7[7] + local694 * arg7[8] + 8192 >> 14;
				local833 += local35;
				local835 += local41;
				for (local965 = 0; local965 < local8; local965++) {
					@Pc(971) int local971 = arg1[local965];
					if (this.anIntArrayArray43.length > local971) {
						@Pc(981) int[] local981 = this.anIntArrayArray43[local971];
						for (@Pc(983) int local983 = 0; local983 < local981.length; local983++) {
							@Pc(989) int local989 = local981[local983];
							if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local989]) != 0) {
								@Pc(1030) int local1030 = local823[2] * this.anIntArray263[local989] + this.anIntArray267[local989] * local823[0] + this.anIntArray268[local989] * local823[1] + 8192 >> 14;
								@Pc(1062) int local1062 = local823[5] * this.anIntArray263[local989] + this.anIntArray267[local989] * local823[3] + this.anIntArray268[local989] * local823[4] + 8192 >> 14;
								@Pc(1093) int local1093 = local823[7] * this.anIntArray268[local989] + this.anIntArray267[local989] * local823[6] + this.anIntArray263[local989] * local823[8] + 8192 >> 14;
								@Pc(1097) int local1097 = local1062 + local833;
								@Pc(1101) int local1101 = local1030 + local829;
								this.anIntArray267[local989] = local1101;
								@Pc(1110) int local1110 = local1093 + local835;
								this.anIntArray268[local989] = local1097;
								this.anIntArray263[local989] = local1110;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2592) Class144 local2592;
			@Pc(2475) boolean local2475;
			@Pc(2587) Class132 local2587;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					local2475 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray42.length > local41) {
							local55 = this.anIntArrayArray42[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray92 == null || (this.aShortArray92[local63] & arg6) != 0) {
									local380 = (this.aByteArray37[local63] & 0xFF) + (arg2 * 8);
									if (local380 < 0) {
										local380 = 0;
									} else if (local380 > 255) {
										local380 = 255;
									}
									this.aByteArray37[local63] = (byte) local380;
								}
							}
							local2475 |= local55.length > 0;
						}
					}
					if (local2475) {
						if (this.aClass132Array1 != null) {
							for (local41 = 0; local41 < this.anInt3962; local41++) {
								local2587 = this.aClass132Array1[local41];
								local2592 = this.aClass144Array1[local41];
								local2592.anInt3593 = local2592.anInt3593 & 0xFFFFFF | 255 - (this.aByteArray37[local2587.anInt3339] & 0xFF) << 24;
							}
						}
						this.method3372();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray42 != null) {
					local2475 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray42.length > local41) {
							local55 = this.anIntArrayArray42[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray92 == null || (this.aShortArray92[local63] & arg6) != 0) {
									local380 = this.aShortArray79[local63] & 0xFFFF;
									local402 = local380 >> 10 & 0x3F;
									local428 = local380 >> 7 & 0x7;
									local459 = local380 & 0x7F;
									@Pc(2701) int local2701 = local402 + arg2 & 0x3F;
									local428 += arg3 / 4;
									if (local428 < 0) {
										local428 = 0;
									} else if (local428 > 7) {
										local428 = 7;
									}
									local459 += arg4;
									if (local459 < 0) {
										local459 = 0;
									} else if (local459 > 127) {
										local459 = 127;
									}
									this.aShortArray79[local63] = (short) (local428 << 7 | local2701 << 10 | local459);
								}
							}
							local2475 |= local55.length > 0;
						}
					}
					if (local2475) {
						if (this.aClass132Array1 != null) {
							for (local41 = 0; local41 < this.anInt3962; local41++) {
								local2587 = this.aClass132Array1[local41];
								local2592 = this.aClass144Array1[local41];
								local2592.anInt3593 = Static274.anIntArray337[this.aShortArray79[local2587.anInt3339] & 0xFFFF] & 0xFFFFFF | local2592.anInt3593 & 0xFF000000;
							}
						}
						this.method3372();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray44 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray44.length > local35) {
							local252 = this.anIntArrayArray44[local35];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2592 = this.aClass144Array1[local252[local254]];
								local2592.anInt3595 += arg3;
								local2592.anInt3589 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray44 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray44.length > local35) {
							local252 = this.anIntArrayArray44[local35];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2592 = this.aClass144Array1[local252[local254]];
								local2592.anInt3587 = local2592.anInt3587 * arg2 >> 7;
								local2592.anInt3590 = arg3 * local2592.anInt3590 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray44 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray44.length > local35) {
						local252 = this.anIntArrayArray44[local35];
						for (local254 = 0; local254 < local252.length; local254++) {
							local2592 = this.aClass144Array1[local252[local254]];
							local2592.anInt3592 = local2592.anInt3592 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray43.length) {
					local252 = this.anIntArrayArray43[local35];
					for (local254 = 0; local254 < local252.length; local254++) {
						local57 = local252[local254];
						if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local57]) != 0) {
							this.anIntArray267[local57] -= Static359.anInt6411;
							this.anIntArray268[local57] -= Static320.anInt5956;
							this.anIntArray263[local57] -= Static656.anInt1395;
							this.anIntArray267[local57] = arg2 * this.anIntArray267[local57] >> 7;
							this.anIntArray268[local57] = arg3 * this.anIntArray268[local57] >> 7;
							this.anIntArray263[local57] = this.anIntArray263[local57] * arg4 >> 7;
							this.anIntArray267[local57] += Static359.anInt6411;
							this.anIntArray268[local57] += Static320.anInt5956;
							this.anIntArray263[local57] += Static656.anInt1395;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local254 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static521.aBoolean657) {
				local380 = Static656.anInt1395 * arg7[6] + Static359.anInt6411 * arg7[0] + arg7[3] * Static320.anInt5956 + 8192 >> 14;
				local402 = arg7[7] * Static656.anInt1395 + Static320.anInt5956 * arg7[4] + arg7[1] * Static359.anInt6411 + 8192 >> 14;
				local380 += local254;
				local428 = arg7[8] * Static656.anInt1395 + arg7[5] * Static320.anInt5956 + Static359.anInt6411 * arg7[2] + 8192 >> 14;
				local402 += local57;
				Static359.anInt6411 = local380;
				Static320.anInt5956 = local402;
				local428 += local63;
				Static656.anInt1395 = local428;
				Static521.aBoolean657 = false;
			}
			local380 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local428 = arg4 << 15 >> 7;
			local459 = local380 * -Static359.anInt6411 + 8192 >> 14;
			local463 = local402 * -Static320.anInt5956 + 8192 >> 14;
			local467 = -Static656.anInt1395 * local428 + 8192 >> 14;
			local471 = local459 + Static359.anInt6411;
			local479 = local463 + Static320.anInt5956;
			local487 = local467 + Static656.anInt1395;
			@Pc(2005) int[] local2005 = new int[] { local380 * arg7[0] + 8192 >> 14, arg7[3] * local380 + 8192 >> 14, local380 * arg7[6] + 8192 >> 14, arg7[1] * local402 + 8192 >> 14, local402 * arg7[4] + 8192 >> 14, arg7[7] * local402 + 8192 >> 14, arg7[2] * local428 + 8192 >> 14, arg7[5] * local428 + 8192 >> 14, arg7[8] * local428 + 8192 >> 14 };
			local642 = local254 * local380 + 8192 >> 14;
			local667 = local402 * local57 + 8192 >> 14;
			@Pc(2133) int local2133 = local667 + local479;
			@Pc(2137) int local2137 = local642 + local471;
			local671 = local428 * local63 + 8192 >> 14;
			@Pc(2149) int local2149 = local671 + local487;
			@Pc(2152) int[] local2152 = new int[9];
			@Pc(2158) int local2158;
			for (local679 = 0; local679 < 3; local679++) {
				for (local2158 = 0; local2158 < 3; local2158++) {
					local684 = 0;
					for (local688 = 0; local688 < 3; local688++) {
						local684 += arg7[local688 + local679 * 3] * local2005[local2158 + local688 * 3];
					}
					local2152[local2158 + local679 * 3] = local684 + 8192 >> 14;
				}
			}
			local2158 = arg7[0] * local2137 + local2133 * arg7[1] + arg7[2] * local2149 + 8192 >> 14;
			local684 = arg7[5] * local2149 + local2137 * arg7[3] + arg7[4] * local2133 + 8192 >> 14;
			local2158 += local31;
			local688 = arg7[6] * local2137 + local2133 * arg7[7] + local2149 * arg7[8] + 8192 >> 14;
			local684 += local35;
			local688 += local41;
			for (local692 = 0; local692 < local8; local692++) {
				local694 = arg1[local692];
				if (this.anIntArrayArray43.length > local694) {
					local823 = this.anIntArrayArray43[local694];
					for (local825 = 0; local825 < local823.length; local825++) {
						local829 = local823[local825];
						if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local829]) != 0) {
							local833 = local2152[2] * this.anIntArray263[local829] + this.anIntArray268[local829] * local2152[1] + this.anIntArray267[local829] * local2152[0] + 8192 >> 14;
							local835 = this.anIntArray263[local829] * local2152[5] + this.anIntArray267[local829] * local2152[3] + local2152[4] * this.anIntArray268[local829] + 8192 >> 14;
							@Pc(2397) int local2397 = local833 + local2158;
							local965 = local2152[8] * this.anIntArray263[local829] + this.anIntArray268[local829] * local2152[7] + local2152[6] * this.anIntArray267[local829] + 8192 >> 14;
							@Pc(2432) int local2432 = local835 + local684;
							this.anIntArray267[local829] = local2397;
							@Pc(2441) int local2441 = local965 + local688;
							this.anIntArray268[local829] = local2432;
							this.anIntArray263[local829] = local2441;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "n", descriptor = "(I)V")
	private void method3372() {
		if (this.aClass82_1 != null) {
			this.aClass82_1.aBoolean191 = false;
		}
	}

	@OriginalMember(owner = "client!haa", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean300) {
			this.method3368();
		}
		return this.anInt3923;
	}

	@OriginalMember(owner = "client!haa", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort54;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZIILclient!dc;IIJIIFF)S")
	private short method3373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class73 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray269[arg3];
		@Pc(17) int local17 = this.anIntArray269[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray84[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg5 == Static214.aLongArray7[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray84[local19] = (short) (this.anInt3912 + 1);
		Static214.aLongArray7[local19] = arg5;
		this.aShortArray88[this.anInt3912] = (short) arg4;
		this.aShortArray91[this.anInt3912] = (short) arg3;
		this.aShortArray86[this.anInt3912] = (short) arg1;
		this.aShortArray80[this.anInt3912] = (short) arg6;
		this.aShortArray87[this.anInt3912] = (short) arg0;
		this.aByteArray38[this.anInt3912] = (byte) arg7;
		this.aFloatArray36[this.anInt3912] = arg8;
		this.aFloatArray37[this.anInt3912] = arg9;
		return (short) this.anInt3912++;
	}

	@OriginalMember(owner = "client!haa", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3970; local7++) {
			if (arg0 != 128) {
				this.anIntArray267[local7] = this.anIntArray267[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray268[local7] = this.anIntArray268[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray263[local7] = arg2 * this.anIntArray263[local7] >> 7;
			}
		}
		this.method3361();
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method6888(@OriginalArg(0) Class25 arg0) {
		@Pc(8) Class25_Sub3 local8 = (Class25_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass261Array3 != null) {
			for (local13 = 0; local13 < this.aClass261Array3.length; local13++) {
				@Pc(20) Class261 local20 = this.aClass261Array3[local13];
				@Pc(22) Class261 local22 = local20;
				if (local20.aClass261_2 != null) {
					local22 = local20.aClass261_2;
				}
				local22.anInt7118 = (int) ((float) this.anIntArray267[local20.anInt7121] * local8.aFloat121 + local8.aFloat120 * (float) this.anIntArray268[local20.anInt7121] + (float) this.anIntArray263[local20.anInt7121] * local8.aFloat126 + local8.aFloat129);
				local22.anInt7128 = (int) (local8.aFloat128 + (float) this.anIntArray268[local20.anInt7121] * local8.aFloat130 + (float) this.anIntArray267[local20.anInt7121] * local8.aFloat127 + (float) this.anIntArray263[local20.anInt7121] * local8.aFloat123);
				local22.anInt7130 = (int) (local8.aFloat124 * (float) this.anIntArray263[local20.anInt7121] + local8.aFloat131 * (float) this.anIntArray267[local20.anInt7121] + local8.aFloat125 * (float) this.anIntArray268[local20.anInt7121] + local8.aFloat122);
				local22.anInt7117 = (int) (local8.aFloat126 * (float) this.anIntArray263[local20.anInt7134] + (float) this.anIntArray267[local20.anInt7134] * local8.aFloat121 + local8.aFloat120 * (float) this.anIntArray268[local20.anInt7134] + local8.aFloat129);
				local22.anInt7123 = (int) (local8.aFloat128 + local8.aFloat123 * (float) this.anIntArray263[local20.anInt7134] + local8.aFloat130 * (float) this.anIntArray268[local20.anInt7134] + (float) this.anIntArray267[local20.anInt7134] * local8.aFloat127);
				local22.anInt7129 = (int) ((float) this.anIntArray263[local20.anInt7134] * local8.aFloat124 + (float) this.anIntArray268[local20.anInt7134] * local8.aFloat125 + (float) this.anIntArray267[local20.anInt7134] * local8.aFloat131 + local8.aFloat122);
				local22.anInt7127 = (int) (local8.aFloat121 * (float) this.anIntArray267[local20.anInt7124] + local8.aFloat120 * (float) this.anIntArray268[local20.anInt7124] + (float) this.anIntArray263[local20.anInt7124] * local8.aFloat126 + local8.aFloat129);
				local22.anInt7125 = (int) (local8.aFloat128 + (float) this.anIntArray263[local20.anInt7124] * local8.aFloat123 + (float) this.anIntArray267[local20.anInt7124] * local8.aFloat127 + (float) this.anIntArray268[local20.anInt7124] * local8.aFloat130);
				local22.anInt7135 = (int) (local8.aFloat122 + local8.aFloat124 * (float) this.anIntArray263[local20.anInt7124] + local8.aFloat125 * (float) this.anIntArray268[local20.anInt7124] + local8.aFloat131 * (float) this.anIntArray267[local20.anInt7124]);
			}
		}
		if (this.aClass298Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass298Array3.length; local13++) {
			@Pc(361) Class298 local361 = this.aClass298Array3[local13];
			@Pc(363) Class298 local363 = local361;
			if (local361.aClass298_1 != null) {
				local363 = local361.aClass298_1;
			}
			if (local361.aClass25_7 == null) {
				local361.aClass25_7 = local8.method4292();
			} else {
				local361.aClass25_7.method4297(local8);
			}
			local363.anInt8373 = (int) ((float) this.anIntArray267[local361.anInt8371] * local8.aFloat121 + local8.aFloat120 * (float) this.anIntArray268[local361.anInt8371] + local8.aFloat126 * (float) this.anIntArray263[local361.anInt8371] + local8.aFloat129);
			local363.anInt8378 = (int) ((float) this.anIntArray267[local361.anInt8371] * local8.aFloat127 + (float) this.anIntArray268[local361.anInt8371] * local8.aFloat130 + (float) this.anIntArray263[local361.anInt8371] * local8.aFloat123 + local8.aFloat128);
			local363.anInt8379 = (int) ((float) this.anIntArray263[local361.anInt8371] * local8.aFloat124 + local8.aFloat125 * (float) this.anIntArray268[local361.anInt8371] + (float) this.anIntArray267[local361.anInt8371] * local8.aFloat131 + local8.aFloat122);
		}
	}
}
