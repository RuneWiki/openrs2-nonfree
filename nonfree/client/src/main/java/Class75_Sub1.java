import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "[Lclient!mv;")
	private Class228[] aClass228Array1;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "[Lclient!pi;")
	private Class266[] aClass266Array1;

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "Lclient!pa;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!dn", name = "I", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!dn", name = "K", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!dn", name = "L", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!dn", name = "P", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!dn", name = "R", descriptor = "B")
	private byte aByte50;

	@OriginalMember(owner = "client!dn", name = "V", descriptor = "I")
	private int anInt2124;

	@OriginalMember(owner = "client!dn", name = "Y", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!dn", name = "ab", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!dn", name = "cb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!dn", name = "db", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!dn", name = "fb", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!dn", name = "gb", descriptor = "[Lclient!ps;")
	private Class272[] aClass272Array1;

	@OriginalMember(owner = "client!dn", name = "hb", descriptor = "I")
	private int anInt2129;

	@OriginalMember(owner = "client!dn", name = "kb", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!dn", name = "lb", descriptor = "[I")
	private int[] lb;

	@OriginalMember(owner = "client!dn", name = "nb", descriptor = "I")
	private int anInt2132;

	@OriginalMember(owner = "client!dn", name = "ob", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!dn", name = "tb", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!dn", name = "ub", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!dn", name = "wb", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!dn", name = "Bb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!dn", name = "Cb", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!dn", name = "Mb", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!dn", name = "Nb", descriptor = "Lclient!ee;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "client!dn", name = "Rb", descriptor = "Lclient!bia;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!dn", name = "Ub", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!dn", name = "Vb", descriptor = "[F")
	private float[] aFloatArray5;

	@OriginalMember(owner = "client!dn", name = "Zb", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!dn", name = "dc", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!dn", name = "fc", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!dn", name = "kc", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!dn", name = "nc", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!dn", name = "qc", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!dn", name = "rc", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!dn", name = "sc", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!dn", name = "yc", descriptor = "[F")
	private float[] aFloatArray6;

	@OriginalMember(owner = "client!dn", name = "Cc", descriptor = "[Lclient!nba;")
	private Class232[] aClass232Array1;

	@OriginalMember(owner = "client!dn", name = "Dc", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
	private int anInt2111 = 0;

	@OriginalMember(owner = "client!dn", name = "ib", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
	private int anInt2116 = 0;

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!dn", name = "eb", descriptor = "I")
	private int anInt2128 = 0;

	@OriginalMember(owner = "client!dn", name = "ac", descriptor = "I")
	private int anInt2157 = 0;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!dn", name = "cc", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!dn", name = "zc", descriptor = "I")
	private int anInt2172 = 0;

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_10;

	@OriginalMember(owner = "client!dn", name = "oc", descriptor = "Lclient!ss;")
	private Class313 aClass313_7;

	@OriginalMember(owner = "client!dn", name = "Z", descriptor = "Lclient!ss;")
	private Class313 aClass313_4;

	@OriginalMember(owner = "client!dn", name = "Ib", descriptor = "Lclient!ss;")
	private Class313 aClass313_6;

	@OriginalMember(owner = "client!dn", name = "Hb", descriptor = "Lclient!ss;")
	private Class313 aClass313_5;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Lclient!fr;")
	private Class114 aClass114_1;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class75_Sub1(@OriginalArg(0) Class82_Sub1 arg0) {
		this.aClass82_Sub1_10 = arg0;
		this.aClass313_7 = new Class313((Interface3) null, 5126, 3, 0);
		this.aClass313_4 = new Class313((Interface3) null, 5126, 2, 0);
		this.aClass313_6 = new Class313((Interface3) null, 5126, 3, 0);
		this.aClass313_5 = new Class313((Interface3) null, 5121, 4, 0);
		this.aClass114_1 = new Class114();
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!dw;Lclient!vo;IIII)V")
	public Class75_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2132 = arg5;
		this.aClass82_Sub1_10 = arg0;
		this.anInt2129 = arg2;
		if (Static574.method8059(arg5, arg2)) {
			this.aClass313_7 = new Class313((Interface3) null, 5126, 3, 0);
		}
		if (Static108.method1801(arg5, arg2)) {
			this.aClass313_4 = new Class313((Interface3) null, 5126, 2, 0);
		}
		if (Static519.method7558(arg5, arg2)) {
			this.aClass313_6 = new Class313((Interface3) null, 5126, 3, 0);
		}
		if (Static275.method4528(arg5, arg2)) {
			this.aClass313_5 = new Class313((Interface3) null, 5121, 4, 0);
		}
		if (Static513.method7469(arg5, arg2)) {
			this.aClass114_1 = new Class114();
		}
		@Pc(108) Interface5 local108 = arg0.anInterface5_9;
		@Pc(112) int[] local112 = new int[arg1.anInt9832];
		this.anIntArray141 = new int[arg1.anInt9825 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt9832; local121++) {
			if (arg1.aByteArray104 == null || arg1.aByteArray104[local121] != 2) {
				if (arg1.aShortArray155 != null && arg1.aShortArray155[local121] != -1) {
					@Pc(152) Class355 local152 = local108.method4129(arg1.aShortArray155[local121] & 0xFFFF);
					if (((this.anInt2132 & 0x40) == 0 || !local152.aBoolean743) && local152.aBoolean742) {
						continue;
					}
				}
				local112[this.anInt2128++] = local121;
				this.anIntArray141[arg1.aShortArray156[local121]]++;
				this.anIntArray141[arg1.aShortArray149[local121]]++;
				this.anIntArray141[arg1.aShortArray150[local121]]++;
			}
		}
		this.anInt2111 = this.anInt2128;
		@Pc(224) long[] local224 = new long[this.anInt2128];
		@Pc(236) boolean local236 = (this.anInt2129 & 0x100) != 0;
		@Pc(248) int local248;
		@Pc(261) int local261;
		@Pc(436) int local436;
		for (@Pc(238) int local238 = 0; local238 < this.anInt2128; local238++) {
			@Pc(244) int local244 = local112[local238];
			@Pc(246) Class355 local246 = null;
			local248 = 0;
			@Pc(250) byte local250 = 0;
			@Pc(252) byte local252 = 0;
			@Pc(254) byte local254 = 0;
			if (arg1.aClass311Array1 != null) {
				@Pc(259) boolean local259 = false;
				for (local261 = 0; local261 < arg1.aClass311Array1.length; local261++) {
					@Pc(268) Class311 local268 = arg1.aClass311Array1[local261];
					if (local268.anInt8944 == local244) {
						@Pc(281) Class270 local281 = Static305.method5145(local268.anInt8942);
						if (local281.aBoolean548) {
							local259 = true;
						}
						if (local281.anInt7611 != -1) {
							@Pc(297) Class355 local297 = local108.method4129(local281.anInt7611);
							if (local297.anInt9790 == 2) {
								this.aBoolean165 = true;
							}
						}
					}
				}
				if (local259) {
					local224[local238] = Long.MAX_VALUE;
					this.anInt2111--;
					continue;
				}
			}
			@Pc(326) short local326 = -1;
			if (arg1.aShortArray155 != null) {
				local326 = arg1.aShortArray155[local244];
				if (local326 != -1) {
					local246 = local108.method4129(local326 & 0xFFFF);
					if ((this.anInt2132 & 0x40) != 0 && local246.aBoolean743) {
						local326 = -1;
						local246 = null;
					} else {
						local252 = local246.aByte119;
						local254 = local246.aByte120;
						if (local246.aByte125 != 0 || local246.aByte122 != 0) {
							this.aBoolean164 = true;
						}
					}
				}
			}
			@Pc(392) boolean local392 = arg1.aByteArray99 != null && arg1.aByteArray99[local244] != 0 || local246 != null && local246.anInt9790 != 0;
			if ((local236 || local392) && arg1.aByteArray105 != null) {
				local248 += arg1.aByteArray105[local244] << 17;
			}
			if (local392) {
				local248 += 65536;
			}
			local248 += (local252 & 0xFF) << 8;
			local248 += local254 & 0xFF;
			local436 = local250 + ((local326 & 0xFFFF) << 16);
			@Pc(442) int local442 = local436 + (local238 & 0xFFFF);
			local224[local238] = (long) local442 + ((long) local248 << 32);
			this.aBoolean164 |= local246 != null && (local246.aByte125 != 0 || local246.aByte122 != 0);
			this.aBoolean165 |= local392;
		}
		Static562.method7965(local112, local224);
		this.aShortArray24 = arg1.aShortArray151;
		this.anIntArray140 = arg1.anIntArray627;
		this.anInt2157 = arg1.anInt9825;
		this.anIntArray142 = arg1.anIntArray625;
		this.anInt2116 = arg1.anInt9844;
		this.anIntArray139 = arg1.anIntArray632;
		this.aClass228Array1 = arg1.aClass228Array5;
		this.aClass232Array1 = arg1.aClass232Array5;
		@Pc(525) Class317[] local525 = new Class317[this.anInt2157];
		@Pc(545) int local545;
		@Pc(559) int local559;
		@Pc(602) int local602;
		if (arg1.aClass311Array1 != null) {
			this.anInt2124 = arg1.aClass311Array1.length;
			this.aClass272Array1 = new Class272[this.anInt2124];
			this.aClass266Array1 = new Class266[this.anInt2124];
			for (local545 = 0; local545 < this.anInt2124; local545++) {
				@Pc(552) Class311 local552 = arg1.aClass311Array1[local545];
				@Pc(557) Class270 local557 = Static305.method5145(local552.anInt8942);
				local559 = -1;
				for (@Pc(561) int local561 = 0; local561 < this.anInt2128; local561++) {
					if (local552.anInt8944 == local112[local561]) {
						local559 = local561;
						break;
					}
				}
				if (local559 == -1) {
					throw new RuntimeException();
				}
				local602 = Static205.anIntArray530[arg1.aShortArray148[local552.anInt8944] & 0xFFFF] & 0xFFFFFF;
				@Pc(620) int local620 = local602 | 255 - (arg1.aByteArray99 == null ? 0 : arg1.aByteArray99[local552.anInt8944]) << 24;
				this.aClass266Array1[local545] = new Class266(local559, arg1.aShortArray156[local552.anInt8944], arg1.aShortArray149[local552.anInt8944], arg1.aShortArray150[local552.anInt8944], local557.anInt7610, local557.anInt7609, local557.anInt7611, local557.anInt7601, local557.anInt7607, local557.aBoolean548, local557.aBoolean549, local552.anInt8939);
				this.aClass272Array1[local545] = new Class272(local620);
			}
		}
		local545 = this.anInt2128 * 3;
		this.aShort35 = (short) arg4;
		this.aShortArray29 = new short[local545];
		if (arg1.aShortArray153 != null) {
			this.aShortArray30 = new short[this.anInt2128];
		}
		this.aByteArray18 = new byte[local545];
		this.aShort36 = (short) arg3;
		this.aShortArray20 = new short[this.anInt2128];
		this.aShortArray25 = new short[this.anInt2128];
		this.aByteArray19 = new byte[this.anInt2128];
		Static453.aLongArray15 = new long[local545];
		this.aShortArray27 = new short[this.anInt2128];
		this.aShortArray21 = new short[local545];
		this.aShortArray22 = new short[this.anInt2128];
		this.aFloatArray5 = new float[local545];
		this.aShortArray28 = new short[this.anInt2128];
		this.aShortArray23 = new short[local545];
		this.aShortArray26 = new short[local545];
		this.aFloatArray6 = new float[local545];
		local248 = 0;
		for (local436 = 0; local436 < arg1.anInt9825; local436++) {
			local559 = this.anIntArray141[local436];
			this.anIntArray141[local436] = local248;
			local248 += local559;
			local525[local436] = new Class317();
		}
		this.anIntArray141[arg1.anInt9825] = local248;
		@Pc(798) Class144 local798 = Static24.method332(this.anInt2128, local112, arg1);
		@Pc(802) Class341[] local802 = new Class341[arg1.anInt9832];
		@Pc(843) int local843;
		@Pc(854) int local854;
		@Pc(875) int local875;
		@Pc(886) int local886;
		@Pc(894) int local894;
		@Pc(903) int local903;
		@Pc(821) short local821;
		@Pc(832) int local832;
		for (local602 = 0; local602 < arg1.anInt9832; local602++) {
			@Pc(811) short local811 = arg1.aShortArray156[local602];
			@Pc(816) short local816 = arg1.aShortArray149[local602];
			local821 = arg1.aShortArray150[local602];
			local832 = this.anIntArray142[local816] - this.anIntArray142[local811];
			local843 = this.anIntArray139[local816] - this.anIntArray139[local811];
			local854 = this.anIntArray140[local816] - this.anIntArray140[local811];
			@Pc(865) int local865 = this.anIntArray142[local821] - this.anIntArray142[local811];
			local875 = this.anIntArray139[local821] - this.anIntArray139[local811];
			local886 = this.anIntArray140[local821] - this.anIntArray140[local811];
			local894 = local886 * local843 - local875 * local854;
			local903 = local854 * local865 - local886 * local832;
			@Pc(911) int local911;
			for (local911 = local875 * local832 - local843 * local865; local894 > 8192 || local903 > 8192 || local911 > 8192 || local894 < -8192 || local903 < -8192 || local911 < -8192; local911 >>= 0x1) {
				local894 >>= 0x1;
				local903 >>= 0x1;
			}
			@Pc(967) int local967 = (int) Math.sqrt((double) (local911 * local911 + local894 * local894 + local903 * local903));
			if (local967 <= 0) {
				local967 = 1;
			}
			local894 = local894 * 256 / local967;
			local903 = local903 * 256 / local967;
			local911 = local911 * 256 / local967;
			@Pc(999) byte local999 = arg1.aByteArray104 == null ? 0 : arg1.aByteArray104[local602];
			if (local999 == 0) {
				@Pc(1005) Class317 local1005 = local525[local811];
				local1005.anInt9037 += local903;
				local1005.anInt9041 += local894;
				local1005.anInt9038 += local911;
				local1005.anInt9042++;
				@Pc(1033) Class317 local1033 = local525[local816];
				local1033.anInt9041 += local894;
				local1033.anInt9038 += local911;
				local1033.anInt9042++;
				local1033.anInt9037 += local903;
				@Pc(1061) Class317 local1061 = local525[local821];
				local1061.anInt9042++;
				local1061.anInt9038 += local911;
				local1061.anInt9037 += local903;
				local1061.anInt9041 += local894;
			} else if (local999 == 1) {
				@Pc(1098) Class341 local1098 = local802[local602] = new Class341();
				local1098.anInt9487 = local903;
				local1098.anInt9486 = local894;
				local1098.anInt9484 = local911;
			}
		}
		@Pc(1124) int local1124;
		@Pc(1167) short local1167;
		for (local261 = 0; local261 < this.anInt2128; local261++) {
			local1124 = local112[local261];
			@Pc(1131) int local1131 = arg1.aShortArray148[local1124] & 0xFFFF;
			if (arg1.aByteArray100 == null) {
				local832 = -1;
			} else {
				local832 = arg1.aByteArray100[local1124];
			}
			if (arg1.aByteArray99 == null) {
				local843 = 0;
			} else {
				local843 = arg1.aByteArray99[local1124] & 0xFF;
			}
			local1167 = arg1.aShortArray155 == null ? -1 : arg1.aShortArray155[local1124];
			if (local1167 != -1 && (this.anInt2132 & 0x40) != 0) {
				@Pc(1182) Class355 local1182 = local108.method4129(local1167 & 0xFFFF);
				if (local1182.aBoolean743) {
					local1167 = -1;
				}
			}
			@Pc(1189) float local1189 = 0.0F;
			@Pc(1191) float local1191 = 0.0F;
			@Pc(1193) float local1193 = 0.0F;
			@Pc(1195) float local1195 = 0.0F;
			@Pc(1197) float local1197 = 0.0F;
			@Pc(1199) float local1199 = 0.0F;
			@Pc(1201) byte local1201 = 0;
			@Pc(1203) byte local1203 = 0;
			@Pc(1205) int local1205 = 0;
			@Pc(1239) byte local1239;
			@Pc(1259) short local1259;
			@Pc(2047) short local2047;
			@Pc(2052) short local2052;
			if (local1167 != -1) {
				if (local832 == -1) {
					local1201 = 1;
					local1197 = 0.0F;
					local1195 = 1.0F;
					local1191 = 1.0F;
					local1189 = 0.0F;
					local1203 = 2;
					local1193 = 1.0F;
					local1199 = 0.0F;
				} else {
					local832 &= 0xFF;
					local1239 = arg1.aByteArray103[local832];
					@Pc(1249) short local1249;
					@Pc(1254) short local1254;
					@Pc(1292) float local1292;
					@Pc(1303) float local1303;
					@Pc(1397) float local1397;
					@Pc(1838) float local1838;
					@Pc(1846) float local1846;
					@Pc(1854) float local1854;
					@Pc(1877) float local1877;
					@Pc(1900) float local1900;
					@Pc(1923) float local1923;
					if (local1239 == 0) {
						local1249 = arg1.aShortArray156[local1124];
						local1254 = arg1.aShortArray149[local1124];
						local1259 = arg1.aShortArray150[local1124];
						local2047 = arg1.aShortArray154[local832];
						local2052 = arg1.aShortArray147[local832];
						@Pc(2057) short local2057 = arg1.aShortArray152[local832];
						@Pc(2063) float local2063 = (float) arg1.anIntArray625[local2047];
						@Pc(2069) float local2069 = (float) arg1.anIntArray632[local2047];
						local1292 = (float) arg1.anIntArray627[local2047];
						local1303 = (float) arg1.anIntArray625[local2052] - local2063;
						local1397 = (float) arg1.anIntArray632[local2052] - local2069;
						@Pc(2100) float local2100 = (float) arg1.anIntArray627[local2052] - local1292;
						@Pc(2109) float local2109 = (float) arg1.anIntArray625[local2057] - local2063;
						@Pc(2118) float local2118 = (float) arg1.anIntArray632[local2057] - local2069;
						@Pc(2126) float local2126 = (float) arg1.anIntArray627[local2057] - local1292;
						@Pc(2135) float local2135 = (float) arg1.anIntArray625[local1249] - local2063;
						@Pc(2143) float local2143 = (float) arg1.anIntArray632[local1249] - local2069;
						@Pc(2152) float local2152 = (float) arg1.anIntArray627[local1249] - local1292;
						@Pc(2160) float local2160 = (float) arg1.anIntArray625[local1254] - local2063;
						@Pc(2169) float local2169 = (float) arg1.anIntArray632[local1254] - local2069;
						local1838 = (float) arg1.anIntArray627[local1254] - local1292;
						local1846 = (float) arg1.anIntArray625[local1259] - local2063;
						local1854 = (float) arg1.anIntArray632[local1259] - local2069;
						local1877 = (float) arg1.anIntArray627[local1259] - local1292;
						local1900 = local2126 * local1397 - local2100 * local2118;
						local1923 = local2100 * local2109 - local2126 * local1303;
						@Pc(2230) float local2230 = local2118 * local1303 - local2109 * local1397;
						@Pc(2239) float local2239 = local2118 * local2230 - local1923 * local2126;
						@Pc(2247) float local2247 = local2126 * local1900 - local2109 * local2230;
						@Pc(2256) float local2256 = local1923 * local2109 - local2118 * local1900;
						@Pc(2270) float local2270 = 1.0F / (local2256 * local2100 + local1397 * local2247 + local2239 * local1303);
						local1197 = local2270 * (local1877 * local2256 + local2247 * local1854 + local1846 * local2239);
						local1193 = local2270 * (local2160 * local2239 + local2169 * local2247 + local1838 * local2256);
						local1189 = local2270 * (local2135 * local2239 + local2247 * local2143 + local2256 * local2152);
						@Pc(2321) float local2321 = local2100 * local1900 - local1303 * local2230;
						@Pc(2330) float local2330 = local2230 * local1397 - local2100 * local1923;
						@Pc(2338) float local2338 = local1923 * local1303 - local1900 * local1397;
						@Pc(2352) float local2352 = 1.0F / (local2338 * local2126 + local2118 * local2321 + local2109 * local2330);
						local1199 = local2352 * (local1877 * local2338 + local1854 * local2321 + local1846 * local2330);
						local1195 = (local2338 * local1838 + local2160 * local2330 + local2321 * local2169) * local2352;
						local1191 = local2352 * (local2135 * local2330 + local2143 * local2321 + local2338 * local2152);
					} else {
						local1249 = arg1.aShortArray156[local1124];
						local1254 = arg1.aShortArray149[local1124];
						local1259 = arg1.aShortArray150[local1124];
						@Pc(1264) int local1264 = local798.anIntArray229[local832];
						@Pc(1269) int local1269 = local798.anIntArray227[local832];
						@Pc(1274) int local1274 = local798.anIntArray228[local832];
						@Pc(1279) float[] local1279 = local798.aFloatArrayArray7[local832];
						@Pc(1284) byte local1284 = arg1.aByteArray101[local832];
						local1292 = (float) arg1.anIntArray629[local832] / 256.0F;
						if (local1239 == 1) {
							local1303 = (float) arg1.anIntArray622[local832] / 1024.0F;
							Static240.method4049(arg1.anIntArray627[local1249], local1274, local1284, local1269, arg1.anIntArray632[local1249], Static354.aFloatArray69, local1292, local1279, local1303, local1264, arg1.anIntArray625[local1249]);
							local1191 = Static354.aFloatArray69[1];
							local1189 = Static354.aFloatArray69[0];
							Static240.method4049(arg1.anIntArray627[local1254], local1274, local1284, local1269, arg1.anIntArray632[local1254], Static354.aFloatArray69, local1292, local1279, local1303, local1264, arg1.anIntArray625[local1254]);
							local1195 = Static354.aFloatArray69[1];
							local1193 = Static354.aFloatArray69[0];
							Static240.method4049(arg1.anIntArray627[local1259], local1274, local1284, local1269, arg1.anIntArray632[local1259], Static354.aFloatArray69, local1292, local1279, local1303, local1264, arg1.anIntArray625[local1259]);
							local1197 = Static354.aFloatArray69[0];
							local1199 = Static354.aFloatArray69[1];
							local1397 = local1303 / 2.0F;
							if ((local1284 & 0x1) == 0) {
								if (local1397 < local1193 - local1189) {
									local1201 = 1;
									local1193 -= local1303;
								} else if (local1189 - local1193 > local1397) {
									local1201 = 2;
									local1193 += local1303;
								}
								if (local1197 - local1189 > local1397) {
									local1203 = 1;
									local1197 -= local1303;
								} else if (local1397 < local1189 - local1197) {
									local1197 += local1303;
									local1203 = 2;
								}
							} else {
								if (local1397 < local1199 - local1191) {
									local1199 -= local1303;
									local1203 = 1;
								} else if (local1191 - local1199 > local1397) {
									local1203 = 2;
									local1199 += local1303;
								}
								if (local1397 < local1195 - local1191) {
									local1195 -= local1303;
									local1201 = 1;
								} else if (local1191 - local1195 > local1397) {
									local1201 = 2;
									local1195 += local1303;
								}
							}
						} else if (local1239 == 2) {
							local1303 = (float) arg1.anIntArray626[local832] / 256.0F;
							local1397 = (float) arg1.anIntArray623[local832] / 256.0F;
							@Pc(1751) int local1751 = arg1.anIntArray625[local1254] - arg1.anIntArray625[local1249];
							@Pc(1762) int local1762 = arg1.anIntArray632[local1254] - arg1.anIntArray632[local1249];
							@Pc(1773) int local1773 = arg1.anIntArray627[local1254] - arg1.anIntArray627[local1249];
							@Pc(1783) int local1783 = arg1.anIntArray625[local1259] - arg1.anIntArray625[local1249];
							@Pc(1794) int local1794 = arg1.anIntArray632[local1259] - arg1.anIntArray632[local1249];
							@Pc(1805) int local1805 = arg1.anIntArray627[local1259] - arg1.anIntArray627[local1249];
							@Pc(1814) int local1814 = local1805 * local1762 - local1794 * local1773;
							@Pc(1822) int local1822 = local1773 * local1783 - local1751 * local1805;
							@Pc(1830) int local1830 = local1751 * local1794 - local1762 * local1783;
							local1838 = 64.0F / (float) arg1.anIntArray624[local832];
							local1846 = 64.0F / (float) arg1.anIntArray628[local832];
							local1854 = 64.0F / (float) arg1.anIntArray622[local832];
							local1877 = (local1279[2] * (float) local1830 + local1279[1] * (float) local1822 + local1279[0] * (float) local1814) / local1838;
							local1900 = ((float) local1814 * local1279[3] + (float) local1822 * local1279[4] + (float) local1830 * local1279[5]) / local1846;
							local1923 = (local1279[7] * (float) local1822 + (float) local1814 * local1279[6] + local1279[8] * (float) local1830) / local1854;
							local1205 = Static528.method7684(local1877, local1900, local1923);
							Static542.method7796(local1292, arg1.anIntArray625[local1249], local1205, local1279, local1303, arg1.anIntArray632[local1249], local1397, local1284, local1274, local1269, local1264, Static354.aFloatArray69, arg1.anIntArray627[local1249]);
							local1191 = Static354.aFloatArray69[1];
							local1189 = Static354.aFloatArray69[0];
							Static542.method7796(local1292, arg1.anIntArray625[local1254], local1205, local1279, local1303, arg1.anIntArray632[local1254], local1397, local1284, local1274, local1269, local1264, Static354.aFloatArray69, arg1.anIntArray627[local1254]);
							local1195 = Static354.aFloatArray69[1];
							local1193 = Static354.aFloatArray69[0];
							Static542.method7796(local1292, arg1.anIntArray625[local1259], local1205, local1279, local1303, arg1.anIntArray632[local1259], local1397, local1284, local1274, local1269, local1264, Static354.aFloatArray69, arg1.anIntArray627[local1259]);
							local1199 = Static354.aFloatArray69[1];
							local1197 = Static354.aFloatArray69[0];
						} else if (local1239 == 3) {
							Static488.method7191(local1284, local1269, local1292, local1279, Static354.aFloatArray69, local1264, arg1.anIntArray627[local1249], arg1.anIntArray625[local1249], local1274, arg1.anIntArray632[local1249]);
							local1191 = Static354.aFloatArray69[1];
							local1189 = Static354.aFloatArray69[0];
							Static488.method7191(local1284, local1269, local1292, local1279, Static354.aFloatArray69, local1264, arg1.anIntArray627[local1254], arg1.anIntArray625[local1254], local1274, arg1.anIntArray632[local1254]);
							local1195 = Static354.aFloatArray69[1];
							local1193 = Static354.aFloatArray69[0];
							Static488.method7191(local1284, local1269, local1292, local1279, Static354.aFloatArray69, local1264, arg1.anIntArray627[local1259], arg1.anIntArray625[local1259], local1274, arg1.anIntArray632[local1259]);
							local1199 = Static354.aFloatArray69[1];
							local1197 = Static354.aFloatArray69[0];
							if ((local1284 & 0x1) == 0) {
								if (local1193 - local1189 > 0.5F) {
									local1201 = 1;
									local1193--;
								} else if (local1189 - local1193 > 0.5F) {
									local1193++;
									local1201 = 2;
								}
								if (local1197 - local1189 > 0.5F) {
									local1203 = 1;
									local1197--;
								} else if (local1189 - local1197 > 0.5F) {
									local1203 = 2;
									local1197++;
								}
							} else {
								if (local1195 - local1191 > 0.5F) {
									local1195--;
									local1201 = 1;
								} else if (local1191 - local1195 > 0.5F) {
									local1201 = 2;
									local1195++;
								}
								if (local1199 - local1191 > 0.5F) {
									local1203 = 1;
									local1199--;
								} else if (local1191 - local1199 > 0.5F) {
									local1203 = 2;
									local1199++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray104 == null) {
				local1239 = 0;
			} else {
				local1239 = arg1.aByteArray104[local1124];
			}
			if (local1239 == 0) {
				@Pc(2555) long local2555 = ((long) (local1131 << 8) + (long) (local1205 << 24) + (long) local843 << 32) + (long) (local832 << 2);
				local1259 = arg1.aShortArray156[local1124];
				local2047 = arg1.aShortArray149[local1124];
				local2052 = arg1.aShortArray150[local1124];
				@Pc(2574) Class317 local2574 = local525[local1259];
				this.aShortArray20[local261] = this.method1787(local2574.anInt9041, local1191, local2574.anInt9037, arg1, local2555, local1259, local1189, local2574.anInt9038, local2574.anInt9042);
				@Pc(2598) Class317 local2598 = local525[local2047];
				this.aShortArray27[local261] = this.method1787(local2598.anInt9041, local1195, local2598.anInt9037, arg1, local2555 + (long) local1201, local2047, local1193, local2598.anInt9038, local2598.anInt9042);
				@Pc(2625) Class317 local2625 = local525[local2052];
				this.aShortArray22[local261] = this.method1787(local2625.anInt9041, local1199, local2625.anInt9037, arg1, (long) local1203 + local2555, local2052, local1197, local2625.anInt9038, local2625.anInt9042);
			} else if (local1239 == 1) {
				@Pc(2415) Class341 local2415 = local802[local1124];
				@Pc(2461) long local2461 = (long) ((local2415.anInt9487 + 256 << 12) + (local2415.anInt9486 <= 0 ? 2048 : 1024) + (local832 << 2) + (local2415.anInt9484 + 256 << 22)) + ((long) local843 + (long) (local1205 << 24) + (long) (local1131 << 8) << 32);
				this.aShortArray20[local261] = this.method1787(local2415.anInt9486, local1191, local2415.anInt9487, arg1, local2461, arg1.aShortArray156[local1124], local1189, local2415.anInt9484, 0);
				this.aShortArray27[local261] = this.method1787(local2415.anInt9486, local1195, local2415.anInt9487, arg1, (long) local1201 + local2461, arg1.aShortArray149[local1124], local1193, local2415.anInt9484, 0);
				this.aShortArray22[local261] = this.method1787(local2415.anInt9486, local1199, local2415.anInt9487, arg1, local2461 + (long) local1203, arg1.aShortArray150[local1124], local1197, local2415.anInt9484, 0);
			}
			if (arg1.aByteArray99 != null) {
				this.aByteArray19[local261] = arg1.aByteArray99[local1124];
			}
			if (arg1.aShortArray153 != null) {
				this.aShortArray30[local261] = arg1.aShortArray153[local1124];
			}
			this.aShortArray28[local261] = arg1.aShortArray148[local1124];
			this.aShortArray25[local261] = local1167;
		}
		local1124 = 0;
		local821 = -10000;
		for (local832 = 0; local832 < this.anInt2111; local832++) {
			@Pc(2705) short local2705 = this.aShortArray25[local832];
			if (local821 != local2705) {
				local821 = local2705;
				local1124++;
			}
		}
		this.lb = new int[local1124 + 1];
		local1124 = 0;
		local821 = -10000;
		for (local843 = 0; local843 < this.anInt2111; local843++) {
			local1167 = this.aShortArray25[local843];
			if (local1167 != local821) {
				this.lb[local1124++] = local843;
				local821 = local1167;
			}
		}
		this.lb[local1124] = this.anInt2111;
		Static453.aLongArray15 = null;
		this.aShortArray26 = Static581.method8106(this.aShortArray26, this.anInt2172);
		this.aShortArray21 = Static581.method8106(this.aShortArray21, this.anInt2172);
		this.aShortArray23 = Static581.method8106(this.aShortArray23, this.anInt2172);
		this.aByteArray18 = Static475.method7020(this.anInt2172, this.aByteArray18);
		this.aFloatArray6 = Static168.method2809(this.anInt2172, this.aFloatArray6);
		this.aFloatArray5 = Static168.method2809(this.anInt2172, this.aFloatArray5);
		if (arg1.anIntArray630 != null && Static572.method8042(this.anInt2132, arg2)) {
			this.anIntArrayArray9 = arg1.method8355(false);
		}
		if (arg1.aClass311Array1 != null && Static63.method1056(this.anInt2132, arg2)) {
			this.anIntArrayArray8 = arg1.method8353();
		}
		if (arg1.anIntArray631 != null && Static414.method6404(this.anInt2132, arg2)) {
			local854 = 0;
			@Pc(2862) int[] local2862 = new int[256];
			for (local875 = 0; local875 < this.anInt2128; local875++) {
				local886 = arg1.anIntArray631[local112[local875]];
				if (local886 >= 0) {
					@Pc(2882) int local2882 = local2862[local886]++;
					if (local854 < local886) {
						local854 = local886;
					}
				}
			}
			this.anIntArrayArray7 = new int[local854 + 1][];
			for (local886 = 0; local886 <= local854; local886++) {
				this.anIntArrayArray7[local886] = new int[local2862[local886]];
				local2862[local886] = 0;
			}
			for (local894 = 0; local894 < this.anInt2128; local894++) {
				local903 = arg1.anIntArray631[local112[local894]];
				if (local903 >= 0) {
					this.anIntArrayArray7[local903][local2862[local903]++] = local894;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean166) {
			this.method1783();
		}
		return this.aShort33;
	}

	@OriginalMember(owner = "client!dn", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub13.anIntArray147[arg0];
		@Pc(13) int local13 = Class3_Sub13.anIntArray146[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2157; local15++) {
			@Pc(33) int local33 = this.anIntArray139[local15] * local13 - this.anIntArray140[local15] * local9 >> 14;
			this.anIntArray140[local15] = this.anIntArray139[local15] * local9 + this.anIntArray140[local15] * local13 >> 14;
			this.anIntArray139[local15] = local33;
		}
		if (this.aClass313_7 != null) {
			this.aClass313_7.anInterface3_7 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!dn", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt2129;
	}

	@OriginalMember(owner = "client!dn", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray9 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt2116; local12++) {
			this.anIntArray142[local12] <<= 0x4;
			this.anIntArray139[local12] <<= 0x4;
			this.anIntArray140[local12] <<= 0x4;
		}
		Static513.anInt8659 = 0;
		Static141.anInt2885 = 0;
		Static449.anInt7744 = 0;
		return true;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILclient!ih;ZII)Z")
	@Override
	public boolean method6800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method1795(arg5, arg0, arg4, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!dn;ZLclient!dn;ZI)Lclient!ka;")
	private Class75 method1782(@OriginalArg(1) Class75_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class75_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		arg2.anInt2132 = this.anInt2132;
		if ((arg4 & 0x100) == 0) {
			arg2.aBoolean165 = this.aBoolean165;
		} else {
			arg2.aBoolean165 = true;
		}
		arg2.aByte50 = 0;
		arg2.anInt2116 = this.anInt2116;
		arg2.anInt2124 = this.anInt2124;
		arg2.aShort35 = this.aShort35;
		arg2.anInt2111 = this.anInt2111;
		arg2.anInt2157 = this.anInt2157;
		arg2.aBoolean164 = this.aBoolean164;
		arg2.anInt2129 = arg4;
		arg2.anInt2128 = this.anInt2128;
		arg2.anInt2172 = this.anInt2172;
		arg2.aShort36 = this.aShort36;
		@Pc(73) boolean local73 = Static47.method900(this.anInt2132, arg4);
		@Pc(79) boolean local79 = Static379.method5970(arg4, this.anInt2132);
		@Pc(85) boolean local85 = Static395.method6223(this.anInt2132, arg4);
		@Pc(91) boolean local91 = local79 | local73 | local85;
		@Pc(214) int local214;
		if (local91) {
			if (!local73) {
				arg2.anIntArray142 = this.anIntArray142;
			} else if (arg0.anIntArray142 == null || arg0.anIntArray142.length < this.anInt2116) {
				arg2.anIntArray142 = arg0.anIntArray142 = new int[this.anInt2116];
			} else {
				arg2.anIntArray142 = arg0.anIntArray142;
			}
			if (!local79) {
				arg2.anIntArray139 = this.anIntArray139;
			} else if (arg0.anIntArray139 == null || arg0.anIntArray139.length < this.anInt2116) {
				arg2.anIntArray139 = arg0.anIntArray139 = new int[this.anInt2116];
			} else {
				arg2.anIntArray139 = arg0.anIntArray139;
			}
			if (!local85) {
				arg2.anIntArray140 = this.anIntArray140;
			} else if (arg0.anIntArray140 == null || this.anInt2116 > arg0.anIntArray140.length) {
				arg2.anIntArray140 = arg0.anIntArray140 = new int[this.anInt2116];
			} else {
				arg2.anIntArray140 = arg0.anIntArray140;
			}
			for (local214 = 0; local214 < this.anInt2116; local214++) {
				if (local73) {
					arg2.anIntArray142[local214] = this.anIntArray142[local214];
				}
				if (local79) {
					arg2.anIntArray139[local214] = this.anIntArray139[local214];
				}
				if (local85) {
					arg2.anIntArray140[local214] = this.anIntArray140[local214];
				}
			}
		} else {
			arg2.anIntArray142 = this.anIntArray142;
			arg2.anIntArray139 = this.anIntArray139;
			arg2.anIntArray140 = this.anIntArray140;
		}
		if (Static57.method7333(this.anInt2132, arg4)) {
			arg2.aClass313_7 = arg0.aClass313_7;
			if (arg3) {
				arg2.aByte50 = (byte) (arg2.aByte50 | 0x1);
			}
			arg2.aClass313_7.anInterface3_7 = this.aClass313_7.anInterface3_7;
			arg2.aClass313_7.aByte106 = this.aClass313_7.aByte106;
		} else if (Static574.method8059(this.anInt2132, arg4)) {
			arg2.aClass313_7 = this.aClass313_7;
		} else {
			arg2.aClass313_7 = null;
		}
		if (Static159.method2761(this.anInt2132, arg4)) {
			if (arg0.aShortArray28 == null || arg0.aShortArray28.length < this.anInt2128) {
				arg2.aShortArray28 = arg0.aShortArray28 = new short[this.anInt2128];
			} else {
				arg2.aShortArray28 = arg0.aShortArray28;
			}
			for (local214 = 0; local214 < this.anInt2128; local214++) {
				arg2.aShortArray28[local214] = this.aShortArray28[local214];
			}
		} else {
			arg2.aShortArray28 = this.aShortArray28;
		}
		if (Static171.method2838(this.anInt2132, arg4)) {
			if (arg0.aByteArray19 == null || arg0.aByteArray19.length < this.anInt2128) {
				arg2.aByteArray19 = arg0.aByteArray19 = new byte[this.anInt2128];
			} else {
				arg2.aByteArray19 = arg0.aByteArray19;
			}
			for (local214 = 0; local214 < this.anInt2128; local214++) {
				arg2.aByteArray19[local214] = this.aByteArray19[local214];
			}
		} else {
			arg2.aByteArray19 = this.aByteArray19;
		}
		if (Static505.method7347(arg4, this.anInt2132)) {
			if (arg3) {
				arg2.aByte50 = (byte) (arg2.aByte50 | 0x2);
			}
			arg2.aClass313_5 = arg0.aClass313_5;
			arg2.aClass313_5.anInterface3_7 = this.aClass313_5.anInterface3_7;
			arg2.aClass313_5.aByte106 = this.aClass313_5.aByte106;
		} else if (Static275.method4528(this.anInt2132, arg4)) {
			arg2.aClass313_5 = this.aClass313_5;
		} else {
			arg2.aClass313_5 = null;
		}
		@Pc(549) int local549;
		if (Static175.method2898(this.anInt2132, arg4)) {
			if (arg0.aShortArray26 == null || arg0.aShortArray26.length < this.anInt2172) {
				local214 = this.anInt2172;
				arg2.aShortArray26 = arg0.aShortArray26 = new short[local214];
				arg2.aShortArray21 = arg0.aShortArray21 = new short[local214];
				arg2.aShortArray23 = arg0.aShortArray23 = new short[local214];
			} else {
				arg2.aShortArray26 = arg0.aShortArray26;
				arg2.aShortArray21 = arg0.aShortArray21;
				arg2.aShortArray23 = arg0.aShortArray23;
			}
			if (this.aClass86_1 == null) {
				for (local214 = 0; local214 < this.anInt2172; local214++) {
					arg2.aShortArray26[local214] = this.aShortArray26[local214];
					arg2.aShortArray21[local214] = this.aShortArray21[local214];
					arg2.aShortArray23[local214] = this.aShortArray23[local214];
				}
			} else {
				if (arg0.aClass86_1 == null) {
					arg0.aClass86_1 = new Class86();
				}
				@Pc(533) Class86 local533 = arg2.aClass86_1 = arg0.aClass86_1;
				if (local533.aShortArray33 == null || local533.aShortArray33.length < this.anInt2172) {
					local549 = this.anInt2172;
					local533.aShortArray32 = new short[local549];
					local533.aShortArray33 = new short[local549];
					local533.aByteArray24 = new byte[local549];
					local533.aShortArray31 = new short[local549];
				}
				for (local549 = 0; local549 < this.anInt2172; local549++) {
					arg2.aShortArray26[local549] = this.aShortArray26[local549];
					arg2.aShortArray21[local549] = this.aShortArray21[local549];
					arg2.aShortArray23[local549] = this.aShortArray23[local549];
					local533.aShortArray33[local549] = this.aClass86_1.aShortArray33[local549];
					local533.aShortArray32[local549] = this.aClass86_1.aShortArray32[local549];
					local533.aShortArray31[local549] = this.aClass86_1.aShortArray31[local549];
					local533.aByteArray24[local549] = this.aClass86_1.aByteArray24[local549];
				}
			}
			arg2.aByteArray18 = this.aByteArray18;
		} else {
			arg2.aShortArray21 = this.aShortArray21;
			arg2.aShortArray26 = this.aShortArray26;
			arg2.aShortArray23 = this.aShortArray23;
			arg2.aByteArray18 = this.aByteArray18;
			arg2.aClass86_1 = this.aClass86_1;
		}
		if (Static453.method6692(arg4, this.anInt2132)) {
			arg2.aClass313_6 = arg0.aClass313_6;
			if (arg3) {
				arg2.aByte50 = (byte) (arg2.aByte50 | 0x4);
			}
			arg2.aClass313_6.aByte106 = this.aClass313_6.aByte106;
			arg2.aClass313_6.anInterface3_7 = this.aClass313_6.anInterface3_7;
		} else if (Static519.method7558(this.anInt2132, arg4)) {
			arg2.aClass313_6 = this.aClass313_6;
		} else {
			arg2.aClass313_6 = null;
		}
		if (Static153.method2724(this.anInt2132, arg4)) {
			if (arg0.aFloatArray6 == null || arg0.aFloatArray6.length < this.anInt2128) {
				local214 = this.anInt2172;
				arg2.aFloatArray6 = arg0.aFloatArray6 = new float[local214];
				arg2.aFloatArray5 = arg0.aFloatArray5 = new float[local214];
			} else {
				arg2.aFloatArray6 = arg0.aFloatArray6;
				arg2.aFloatArray5 = arg0.aFloatArray5;
			}
			for (local214 = 0; local214 < this.anInt2172; local214++) {
				arg2.aFloatArray6[local214] = this.aFloatArray6[local214];
				arg2.aFloatArray5[local214] = this.aFloatArray5[local214];
			}
		} else {
			arg2.aFloatArray6 = this.aFloatArray6;
			arg2.aFloatArray5 = this.aFloatArray5;
		}
		if (Static152.method2717(this.anInt2132, arg4)) {
			if (arg3) {
				arg2.aByte50 = (byte) (arg2.aByte50 | 0x8);
			}
			arg2.aClass313_4 = arg0.aClass313_4;
			arg2.aClass313_4.aByte106 = this.aClass313_4.aByte106;
			arg2.aClass313_4.anInterface3_7 = this.aClass313_4.anInterface3_7;
		} else if (Static108.method1801(this.anInt2132, arg4)) {
			arg2.aClass313_4 = this.aClass313_4;
		} else {
			arg2.aClass313_4 = null;
		}
		if (Static630.method8524(arg4, this.anInt2132)) {
			if (arg0.aShortArray20 == null || arg0.aShortArray20.length < this.anInt2128) {
				local214 = this.anInt2128;
				arg2.aShortArray20 = arg0.aShortArray20 = new short[local214];
				arg2.aShortArray22 = arg0.aShortArray22 = new short[local214];
				arg2.aShortArray27 = arg0.aShortArray27 = new short[local214];
			} else {
				arg2.aShortArray27 = arg0.aShortArray27;
				arg2.aShortArray20 = arg0.aShortArray20;
				arg2.aShortArray22 = arg0.aShortArray22;
			}
			for (local214 = 0; local214 < this.anInt2128; local214++) {
				arg2.aShortArray20[local214] = this.aShortArray20[local214];
				arg2.aShortArray27[local214] = this.aShortArray27[local214];
				arg2.aShortArray22[local214] = this.aShortArray22[local214];
			}
		} else {
			arg2.aShortArray27 = this.aShortArray27;
			arg2.aShortArray22 = this.aShortArray22;
			arg2.aShortArray20 = this.aShortArray20;
		}
		if (Static130.method2305(this.anInt2132, arg4)) {
			arg2.aClass114_1 = arg0.aClass114_1;
			if (arg3) {
				arg2.aByte50 = (byte) (arg2.aByte50 | 0x10);
			}
			arg2.aClass114_1.anInterface17_3 = this.aClass114_1.anInterface17_3;
		} else if (Static513.method7469(this.anInt2132, arg4)) {
			arg2.aClass114_1 = this.aClass114_1;
		} else {
			arg2.aClass114_1 = null;
		}
		if (Static290.method4742(arg4, this.anInt2132)) {
			if (arg0.aShortArray25 == null || arg0.aShortArray25.length < this.anInt2128) {
				local214 = this.anInt2128;
				arg2.aShortArray25 = arg0.aShortArray25 = new short[local214];
			} else {
				arg2.aShortArray25 = arg0.aShortArray25;
			}
			for (local214 = 0; local214 < this.anInt2128; local214++) {
				arg2.aShortArray25[local214] = this.aShortArray25[local214];
			}
		} else {
			arg2.aShortArray25 = this.aShortArray25;
		}
		if (!Static471.method6969(arg4, this.anInt2132)) {
			arg2.aClass272Array1 = this.aClass272Array1;
		} else if (arg0.aClass272Array1 == null || this.anInt2124 > arg0.aClass272Array1.length) {
			local214 = this.anInt2124;
			arg2.aClass272Array1 = arg0.aClass272Array1 = new Class272[local214];
			for (local549 = 0; local549 < this.anInt2124; local549++) {
				arg2.aClass272Array1[local549] = this.aClass272Array1[local549].method6666();
			}
		} else {
			arg2.aClass272Array1 = arg0.aClass272Array1;
			for (local214 = 0; local214 < this.anInt2124; local214++) {
				arg2.aClass272Array1[local214].method6665(this.aClass272Array1[local214]);
			}
		}
		arg2.anIntArray141 = this.anIntArray141;
		arg2.aShortArray30 = this.aShortArray30;
		arg2.aClass232Array1 = this.aClass232Array1;
		arg2.lb = this.lb;
		arg2.anIntArrayArray8 = this.anIntArrayArray8;
		if (this.aBoolean166) {
			arg2.aShort39 = this.aShort39;
			arg2.aShort31 = this.aShort31;
			arg2.aShort32 = this.aShort32;
			arg2.aShort40 = this.aShort40;
			arg2.aBoolean166 = true;
			arg2.aShort33 = this.aShort33;
			arg2.aShort38 = this.aShort38;
			arg2.aShort34 = this.aShort34;
			arg2.aShort37 = this.aShort37;
		} else {
			arg2.aBoolean166 = false;
		}
		arg2.anIntArrayArray7 = this.anIntArrayArray7;
		arg2.aClass266Array1 = this.aClass266Array1;
		arg2.aShortArray24 = this.aShortArray24;
		arg2.anIntArrayArray9 = this.anIntArrayArray9;
		arg2.aClass228Array1 = this.aClass228Array1;
		arg2.aShortArray29 = this.aShortArray29;
		return arg2;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
	@Override
	protected void method6784() {
	}

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt2129 = arg0;
		this.aBoolean163 = true;
		if (this.aClass86_1 != null && (this.anInt2129 & 0x10000) == 0) {
			this.aByteArray18 = this.aClass86_1.aByteArray24;
			this.aShortArray23 = this.aClass86_1.aShortArray31;
			this.aShortArray21 = this.aClass86_1.aShortArray32;
			this.aShortArray26 = this.aClass86_1.aShortArray33;
			this.aClass86_1 = null;
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ih;IZ)V")
	@Override
	public void method6798(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray24 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2157; local14++) {
			if ((arg1 & this.aShortArray24[local14]) != 0) {
				if (arg2) {
					arg0.method7929(this.anIntArray142[local14], this.anIntArray139[local14], this.anIntArray140[local14], local12);
				} else {
					arg0.method7920(this.anIntArray142[local14], this.anIntArray139[local14], this.anIntArray140[local14], local12);
				}
				this.anIntArray142[local14] = local12[0];
				this.anIntArray139[local14] = local12[1];
				this.anIntArray140[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static141.anInt2885 = 0;
			local14 = 0;
			Static449.anInt7744 = 0;
			Static513.anInt8659 = 0;
			for (local20 = 0; local20 < this.anInt2157; local20++) {
				Static449.anInt7744 += this.anIntArray142[local20];
				Static513.anInt8659 += this.anIntArray139[local20];
				local14++;
				Static141.anInt2885 += this.anIntArray140[local20];
			}
			if (local14 > 0) {
				Static449.anInt7744 = arg1 + Static449.anInt7744 / local14;
				Static513.anInt8659 = Static513.anInt8659 / local14 + arg2;
				Static141.anInt2885 = arg3 + Static141.anInt2885 / local14;
			} else {
				Static513.anInt8659 = arg2;
				Static449.anInt7744 = arg1;
				Static141.anInt2885 = arg3;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt2157; local14++) {
				this.anIntArray142[local14] += arg1;
				this.anIntArray139[local14] += arg2;
				this.anIntArray140[local14] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt2157; local14++) {
					this.anIntArray142[local14] -= Static449.anInt7744;
					this.anIntArray139[local14] -= Static513.anInt8659;
					this.anIntArray140[local14] -= Static141.anInt2885;
					if (arg3 != 0) {
						local20 = Class3_Sub13.anIntArray147[arg3];
						local163 = Class3_Sub13.anIntArray146[arg3];
						local182 = local20 * this.anIntArray139[local14] + local163 * this.anIntArray142[local14] + 16383 >> 14;
						this.anIntArray139[local14] = this.anIntArray139[local14] * local163 + 16383 - local20 * this.anIntArray142[local14] >> 14;
						this.anIntArray142[local14] = local182;
					}
					if (arg1 != 0) {
						local20 = Class3_Sub13.anIntArray147[arg1];
						local163 = Class3_Sub13.anIntArray146[arg1];
						local182 = local163 * this.anIntArray139[local14] + 16383 - this.anIntArray140[local14] * local20 >> 14;
						this.anIntArray140[local14] = local20 * this.anIntArray139[local14] + this.anIntArray140[local14] * local163 + 16383 >> 14;
						this.anIntArray139[local14] = local182;
					}
					if (arg2 != 0) {
						local20 = Class3_Sub13.anIntArray147[arg2];
						local163 = Class3_Sub13.anIntArray146[arg2];
						local182 = this.anIntArray140[local14] * local20 + local163 * this.anIntArray142[local14] + 16383 >> 14;
						this.anIntArray140[local14] = this.anIntArray140[local14] * local163 + 16383 - local20 * this.anIntArray142[local14] >> 14;
						this.anIntArray142[local14] = local182;
					}
					this.anIntArray142[local14] += Static449.anInt7744;
					this.anIntArray139[local14] += Static513.anInt8659;
					this.anIntArray140[local14] += Static141.anInt2885;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt2157; local14++) {
					this.anIntArray142[local14] -= Static449.anInt7744;
					this.anIntArray139[local14] -= Static513.anInt8659;
					this.anIntArray140[local14] -= Static141.anInt2885;
					this.anIntArray142[local14] = arg1 * this.anIntArray142[local14] / 128;
					this.anIntArray139[local14] = this.anIntArray139[local14] * arg2 / 128;
					this.anIntArray140[local14] = arg3 * this.anIntArray140[local14] / 128;
					this.anIntArray142[local14] += Static449.anInt7744;
					this.anIntArray139[local14] += Static513.anInt8659;
					this.anIntArray140[local14] += Static141.anInt2885;
				}
			} else {
				@Pc(516) Class266 local516;
				@Pc(521) Class272 local521;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt2128; local14++) {
						local20 = (this.aByteArray19[local14] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray19[local14] = (byte) local20;
					}
					if (this.aClass313_5 != null) {
						this.aClass313_5.anInterface3_7 = null;
					}
					if (this.aClass266Array1 != null) {
						for (local20 = 0; local20 < this.anInt2124; local20++) {
							local516 = this.aClass266Array1[local20];
							local521 = this.aClass272Array1[local20];
							local521.anInt7648 = 255 - (this.aByteArray19[local516.anInt7566] & 0xFF) << 24 | local521.anInt7648 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt2128; local14++) {
						local20 = this.aShortArray28[local14] & 0xFFFF;
						local163 = local20 >> 10 & 0x3F;
						local182 = local20 >> 7 & 0x7;
						@Pc(580) int local580 = local20 & 0x7F;
						@Pc(586) int local586 = arg1 + local163 & 0x3F;
						local182 += arg2 / 4;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						local580 += arg3;
						if (local580 < 0) {
							local580 = 0;
						} else if (local580 > 127) {
							local580 = 127;
						}
						this.aShortArray28[local14] = (short) (local586 << 10 | local182 << 7 | local580);
					}
					if (this.aClass313_5 != null) {
						this.aClass313_5.anInterface3_7 = null;
					}
					if (this.aClass266Array1 != null) {
						for (local20 = 0; local20 < this.anInt2124; local20++) {
							local516 = this.aClass266Array1[local20];
							local521 = this.aClass272Array1[local20];
							local521.anInt7648 = local521.anInt7648 & 0xFF000000 | Static205.anIntArray530[this.aShortArray28[local516.anInt7566] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(713) Class272 local713;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt2124; local14++) {
							local713 = this.aClass272Array1[local14];
							local713.anInt7640 += arg1;
							local713.anInt7647 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt2124; local14++) {
							local713 = this.aClass272Array1[local14];
							local713.anInt7650 = arg2 * local713.anInt7650 >> 7;
							local713.anInt7642 = local713.anInt7642 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt2124; local14++) {
							local713 = this.aClass272Array1[local14];
							local713.anInt7641 = local713.anInt7641 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2128; local7++) {
			if (arg0 == this.aShortArray28[local7]) {
				this.aShortArray28[local7] = arg1;
			}
		}
		if (this.aClass266Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt2124; local34++) {
				@Pc(41) Class266 local41 = this.aClass266Array1[local34];
				@Pc(46) Class272 local46 = this.aClass272Array1[local34];
				local46.anInt7648 = Static205.anIntArray530[this.aShortArray28[local41.anInt7566] & 0xFFFF] & 0xFFFFFF | local46.anInt7648 & 0xFF000000;
			}
		}
		if (this.aClass313_5 != null) {
			this.aClass313_5.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "()[Lclient!nba;")
	@Override
	public Class232[] method6801() {
		return this.aClass232Array1;
	}

	@OriginalMember(owner = "client!dn", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2157; local7++) {
			if (arg0 != 128) {
				this.anIntArray142[local7] = arg0 * this.anIntArray142[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray139[local7] = this.anIntArray139[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray140[local7] = this.anIntArray140[local7] * arg2 >> 7;
			}
		}
		if (this.aClass313_7 != null) {
			this.aClass313_7.anInterface3_7 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!dn", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass82_Sub1_10.anInterface5_9;
		for (@Pc(11) int local11 = 0; local11 < this.anInt2128; local11++) {
			if (arg0 == this.aShortArray25[local11]) {
				this.aShortArray25[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class355 local51 = local9.method4129(arg0 & 0xFFFF);
			local39 = local51.aByte121;
			local41 = local51.aByte124;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(72) Class355 local72 = local9.method4129(arg1 & 0xFFFF);
			local61 = local72.aByte124;
			if (local72.aByte125 != 0 || local72.aByte122 != 0) {
				this.aBoolean164 = true;
			}
			local59 = local72.aByte121;
		}
		if (!(local41 != local61 | local39 != local59)) {
			return;
		}
		if (this.aClass266Array1 != null) {
			for (@Pc(110) int local110 = 0; local110 < this.anInt2124; local110++) {
				@Pc(117) Class266 local117 = this.aClass266Array1[local110];
				@Pc(122) Class272 local122 = this.aClass272Array1[local110];
				local122.anInt7648 = Static205.anIntArray530[this.aShortArray28[local117.anInt7566] & 0xFFFF] & 0xFFFFFF | local122.anInt7648 & 0xFF000000;
			}
		}
		if (this.aClass313_5 != null) {
			this.aClass313_5.anInterface3_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
	private void method1783() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2157; local29++) {
			@Pc(36) int local36 = this.anIntArray142[local29];
			@Pc(41) int local41 = this.anIntArray139[local29];
			if (local41 < local9) {
				local9 = local41;
			}
			if (local21 < local41) {
				local21 = local41;
			}
			@Pc(60) int local60 = this.anIntArray140[local29];
			if (local36 > local13) {
				local13 = local36;
			}
			if (local7 > local36) {
				local7 = local36;
			}
			if (local60 < local11) {
				local11 = local60;
			}
			if (local23 < local60) {
				local23 = local60;
			}
			@Pc(96) int local96 = local60 * local60 + local36 * local36;
			if (local96 > local25) {
				local25 = local96;
			}
			local96 = local41 * local41 + local36 * local36 + local60 * local60;
			if (local96 > local27) {
				local27 = local96;
			}
		}
		this.aShort31 = (short) local9;
		this.aShort40 = (short) local23;
		this.aShort33 = (short) local7;
		this.aShort37 = (short) local11;
		this.aShort38 = (short) local13;
		this.aShort32 = (short) local21;
		this.aShort34 = (short) (int) (Math.sqrt((double) local25) + 0.99D);
		this.aShort39 = (short) (int) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean166 = true;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ih;Lclient!kia;II)V")
	@Override
	public void method6788(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class9_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2172 == 0) {
			return;
		}
		@Pc(16) Class31_Sub3 local16 = this.aClass82_Sub1_10.aClass31_Sub3_3;
		@Pc(19) Class31_Sub3 local19 = (Class31_Sub3) arg0;
		if (!this.aBoolean166) {
			this.method1783();
		}
		Static637.aFloat194 = local19.aFloat190 * local16.aFloat185 + local16.aFloat181 * local19.aFloat184 + local19.aFloat181 * local16.aFloat182;
		Static73.aFloat23 = local16.aFloat188 + local19.aFloat188 * local16.aFloat182 + local19.aFloat189 * local16.aFloat185 + local16.aFloat181 * local19.aFloat183;
		@Pc(72) float local72 = (float) this.aShort31 * Static637.aFloat194 + Static73.aFloat23;
		@Pc(80) float local80 = Static637.aFloat194 * (float) this.aShort32 + Static73.aFloat23;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local96 = local72 + (float) this.aShort34;
			local90 = local80 - (float) this.aShort34;
		} else {
			local90 = local72 - (float) this.aShort34;
			local96 = (float) this.aShort34 + local80;
		}
		if (local90 >= this.aClass82_Sub1_10.aFloat28 || (float) this.aClass82_Sub1_10.anInt2483 >= local96) {
			return;
		}
		Static148.aFloat69 = local16.aFloat187 * local19.aFloat181 + local19.aFloat190 * local16.aFloat186 + local16.aFloat190 * local19.aFloat184;
		Static395.aFloat147 = local16.aFloat186 * local19.aFloat189 + local19.aFloat183 * local16.aFloat190 + local19.aFloat188 * local16.aFloat187 + local16.aFloat189;
		@Pc(172) float local172 = (float) this.aShort31 * Static148.aFloat69 + Static395.aFloat147;
		@Pc(180) float local180 = Static148.aFloat69 * (float) this.aShort32 + Static395.aFloat147;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local180 < local172) {
			local195 = ((float) this.aShort34 + local172) * (float) this.aClass82_Sub1_10.anInt2482;
			local207 = (float) this.aClass82_Sub1_10.anInt2482 * ((float) -this.aShort34 + local180);
		} else {
			local195 = (local180 + (float) this.aShort34) * (float) this.aClass82_Sub1_10.anInt2482;
			local207 = (float) this.aClass82_Sub1_10.anInt2482 * ((float) -this.aShort34 + local172);
		}
		if (local207 / (float) arg2 >= this.aClass82_Sub1_10.aFloat39 || local195 / (float) arg2 <= this.aClass82_Sub1_10.aFloat42) {
			return;
		}
		Static218.aFloat115 = local16.aFloat184 * local19.aFloat184 + local16.aFloat180 * local19.aFloat190 + local19.aFloat181 * local16.aFloat191;
		Static74.aFloat24 = local19.aFloat183 * local16.aFloat184 + local19.aFloat189 * local16.aFloat180 + local16.aFloat191 * local19.aFloat188 + local16.aFloat183;
		@Pc(299) float local299 = Static74.aFloat24 + Static218.aFloat115 * (float) this.aShort31;
		@Pc(307) float local307 = Static74.aFloat24 + Static218.aFloat115 * (float) this.aShort32;
		@Pc(334) float local334;
		@Pc(322) float local322;
		if (local299 > local307) {
			local322 = (local299 + (float) this.aShort34) * (float) this.aClass82_Sub1_10.anInt2489;
			local334 = (float) this.aClass82_Sub1_10.anInt2489 * ((float) -this.aShort34 + local307);
		} else {
			local334 = (float) this.aClass82_Sub1_10.anInt2489 * (local299 - (float) this.aShort34);
			local322 = ((float) this.aShort34 + local307) * (float) this.aClass82_Sub1_10.anInt2489;
		}
		if (this.aClass82_Sub1_10.aFloat32 <= local334 / (float) arg2 || local322 / (float) arg2 <= this.aClass82_Sub1_10.aFloat48) {
			return;
		}
		if (arg1 != null || this.aClass266Array1 != null) {
			Static608.aFloat196 = local19.aFloat186 * local16.aFloat186 + local19.aFloat180 * local16.aFloat190 + local19.aFloat185 * local16.aFloat187;
			Static339.aFloat21 = local19.aFloat182 * local16.aFloat182 + local19.aFloat187 * local16.aFloat185 + local19.aFloat191 * local16.aFloat181;
			Static143.aFloat64 = local19.aFloat180 * local16.aFloat184 + local19.aFloat186 * local16.aFloat180 + local16.aFloat191 * local19.aFloat185;
			Static432.aFloat148 = local16.aFloat187 * local19.aFloat182 + local19.aFloat191 * local16.aFloat190 + local16.aFloat186 * local19.aFloat187;
			Static26.aFloat6 = local16.aFloat184 * local19.aFloat191 + local16.aFloat180 * local19.aFloat187 + local19.aFloat182 * local16.aFloat191;
			Static518.aFloat166 = local16.aFloat181 * local19.aFloat180 + local16.aFloat185 * local19.aFloat186 + local19.aFloat185 * local16.aFloat182;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort38 + this.aShort33 >> 1;
			@Pc(510) int local510 = this.aShort37 + this.aShort40 >> 1;
			@Pc(529) int local529 = (int) (Static608.aFloat196 * (float) local501 + Static395.aFloat147 + Static148.aFloat69 * (float) this.aShort31 + (float) local510 * Static432.aFloat148);
			@Pc(548) int local548 = (int) ((float) local510 * Static26.aFloat6 + (float) this.aShort31 * Static218.aFloat115 + Static74.aFloat24 + Static143.aFloat64 * (float) local501);
			@Pc(567) int local567 = (int) (Static339.aFloat21 * (float) local510 + Static73.aFloat23 + Static518.aFloat166 * (float) local501 + Static637.aFloat194 * (float) this.aShort31);
			@Pc(586) int local586 = (int) (Static148.aFloat69 * (float) this.aShort32 + Static395.aFloat147 + Static608.aFloat196 * (float) local501 + (float) local510 * Static432.aFloat148);
			@Pc(605) int local605 = (int) (Static218.aFloat115 * (float) this.aShort32 + (float) local501 * Static143.aFloat64 + Static74.aFloat24 + (float) local510 * Static26.aFloat6);
			arg1.anInt5911 = local605 * this.aClass82_Sub1_10.anInt2489 / arg2 + this.aClass82_Sub1_10.anInt2477;
			@Pc(637) int local637 = (int) ((float) this.aShort32 * Static637.aFloat194 + Static73.aFloat23 + (float) local501 * Static518.aFloat166 + Static339.aFloat21 * (float) local510);
			arg1.anInt5910 = this.aClass82_Sub1_10.anInt2496 + local529 * this.aClass82_Sub1_10.anInt2482 / arg2;
			arg1.anInt5909 = this.aClass82_Sub1_10.anInt2477 + this.aClass82_Sub1_10.anInt2489 * local548 / arg2;
			arg1.anInt5912 = this.aClass82_Sub1_10.anInt2496 + this.aClass82_Sub1_10.anInt2482 * local586 / arg2;
			if (this.aClass82_Sub1_10.anInt2483 <= local567 || local637 >= this.aClass82_Sub1_10.anInt2483) {
				arg1.aBoolean433 = true;
				arg1.anInt5913 = this.aClass82_Sub1_10.anInt2496 + this.aClass82_Sub1_10.anInt2482 * (local529 + this.aShort34) / arg2 - arg1.anInt5910;
			}
		}
		this.aClass82_Sub1_10.method2054((float) arg2);
		this.aClass82_Sub1_10.method2088();
		this.aClass82_Sub1_10.method2070(local19);
		this.method1790();
		this.aClass82_Sub1_10.method2094();
		this.method1784();
	}

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort36 = (short) arg0;
		if (this.aClass313_5 != null) {
			this.aClass313_5.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILclient!ih;ZI)Z")
	@Override
	public boolean method6804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method1795(-1, arg0, arg4, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!dn", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort36;
	}

	@OriginalMember(owner = "client!dn", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean166) {
			this.method1783();
		}
		return this.aShort38;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ih;Lclient!kia;I)V")
	@Override
	public void method6799(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class9_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2172 == 0) {
			return;
		}
		@Pc(16) Class31_Sub3 local16 = this.aClass82_Sub1_10.aClass31_Sub3_3;
		if (!this.aBoolean166) {
			this.method1783();
		}
		@Pc(25) Class31_Sub3 local25 = (Class31_Sub3) arg0;
		Static73.aFloat23 = local16.aFloat188 + local16.aFloat185 * local25.aFloat189 + local25.aFloat183 * local16.aFloat181 + local16.aFloat182 * local25.aFloat188;
		Static637.aFloat194 = local25.aFloat190 * local16.aFloat185 + local25.aFloat184 * local16.aFloat181 + local16.aFloat182 * local25.aFloat181;
		@Pc(72) float local72 = Static73.aFloat23 + (float) this.aShort31 * Static637.aFloat194;
		@Pc(80) float local80 = Static637.aFloat194 * (float) this.aShort32 + Static73.aFloat23;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local97 = (float) -this.aShort34 + local80;
			local90 = (float) this.aShort34 + local72;
		} else {
			local90 = (float) this.aShort34 + local80;
			local97 = (float) -this.aShort34 + local72;
		}
		if (this.aClass82_Sub1_10.aFloat33 <= local97 || local90 <= (float) this.aClass82_Sub1_10.anInt2483) {
			return;
		}
		Static148.aFloat69 = local16.aFloat187 * local25.aFloat181 + local16.aFloat186 * local25.aFloat190 + local25.aFloat184 * local16.aFloat190;
		Static395.aFloat147 = local16.aFloat190 * local25.aFloat183 + local25.aFloat189 * local16.aFloat186 + local16.aFloat187 * local25.aFloat188 + local16.aFloat189;
		@Pc(174) float local174 = Static395.aFloat147 + Static148.aFloat69 * (float) this.aShort31;
		@Pc(182) float local182 = Static395.aFloat147 + Static148.aFloat69 * (float) this.aShort32;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = (float) this.aClass82_Sub1_10.anInt2482 * ((float) this.aShort34 + local174);
			local209 = (float) this.aClass82_Sub1_10.anInt2482 * ((float) -this.aShort34 + local182);
		} else {
			local197 = (float) this.aClass82_Sub1_10.anInt2482 * (local182 + (float) this.aShort34);
			local209 = ((float) -this.aShort34 + local174) * (float) this.aClass82_Sub1_10.anInt2482;
		}
		if (local209 / local90 >= this.aClass82_Sub1_10.aFloat39 || local197 / local90 <= this.aClass82_Sub1_10.aFloat42) {
			return;
		}
		Static218.aFloat115 = local16.aFloat180 * local25.aFloat190 + local25.aFloat184 * local16.aFloat184 + local16.aFloat191 * local25.aFloat181;
		Static74.aFloat24 = local16.aFloat183 + local25.aFloat188 * local16.aFloat191 + local16.aFloat184 * local25.aFloat183 + local25.aFloat189 * local16.aFloat180;
		@Pc(299) float local299 = Static218.aFloat115 * (float) this.aShort31 + Static74.aFloat24;
		@Pc(307) float local307 = (float) this.aShort32 * Static218.aFloat115 + Static74.aFloat24;
		@Pc(334) float local334;
		@Pc(322) float local322;
		if (local307 < local299) {
			local322 = (float) this.aClass82_Sub1_10.anInt2489 * (local299 + (float) this.aShort34);
			local334 = (float) this.aClass82_Sub1_10.anInt2489 * ((float) -this.aShort34 + local307);
		} else {
			local334 = (float) this.aClass82_Sub1_10.anInt2489 * ((float) -this.aShort34 + local299);
			local322 = (float) this.aClass82_Sub1_10.anInt2489 * (local307 + (float) this.aShort34);
		}
		if (this.aClass82_Sub1_10.aFloat32 <= local334 / local90 || this.aClass82_Sub1_10.aFloat48 >= local322 / local90) {
			return;
		}
		if (arg1 != null || this.aClass266Array1 != null) {
			Static608.aFloat196 = local16.aFloat187 * local25.aFloat185 + local16.aFloat186 * local25.aFloat186 + local25.aFloat180 * local16.aFloat190;
			Static518.aFloat166 = local25.aFloat185 * local16.aFloat182 + local25.aFloat180 * local16.aFloat181 + local25.aFloat186 * local16.aFloat185;
			Static432.aFloat148 = local25.aFloat187 * local16.aFloat186 + local25.aFloat191 * local16.aFloat190 + local25.aFloat182 * local16.aFloat187;
			Static143.aFloat64 = local16.aFloat180 * local25.aFloat186 + local16.aFloat184 * local25.aFloat180 + local25.aFloat185 * local16.aFloat191;
			Static339.aFloat21 = local16.aFloat182 * local25.aFloat182 + local16.aFloat185 * local25.aFloat187 + local16.aFloat181 * local25.aFloat191;
			Static26.aFloat6 = local25.aFloat182 * local16.aFloat191 + local25.aFloat191 * local16.aFloat184 + local16.aFloat180 * local25.aFloat187;
		}
		if (arg1 != null) {
			@Pc(494) boolean local494 = false;
			@Pc(496) boolean local496 = true;
			@Pc(505) int local505 = this.aShort33 + this.aShort38 >> 1;
			@Pc(513) int local513 = this.aShort40 + this.aShort37 >> 1;
			@Pc(532) int local532 = (int) (Static608.aFloat196 * (float) local505 + Static395.aFloat147 + (float) this.aShort31 * Static148.aFloat69 + (float) local513 * Static432.aFloat148);
			@Pc(551) int local551 = (int) (Static74.aFloat24 + Static143.aFloat64 * (float) local505 + Static218.aFloat115 * (float) this.aShort31 + Static26.aFloat6 * (float) local513);
			@Pc(570) int local570 = (int) (Static339.aFloat21 * (float) local513 + Static73.aFloat23 + Static518.aFloat166 * (float) local505 + (float) this.aShort31 * Static637.aFloat194);
			if (local570 < this.aClass82_Sub1_10.anInt2483) {
				local494 = true;
			} else {
				arg1.anInt5910 = this.aClass82_Sub1_10.anInt2496 + this.aClass82_Sub1_10.anInt2482 * local532 / local570;
				arg1.anInt5909 = this.aClass82_Sub1_10.anInt2489 * local551 / local570 + this.aClass82_Sub1_10.anInt2477;
			}
			@Pc(628) int local628 = (int) ((float) local513 * Static432.aFloat148 + Static395.aFloat147 + (float) local505 * Static608.aFloat196 + (float) this.aShort32 * Static148.aFloat69);
			@Pc(647) int local647 = (int) ((float) local513 * Static26.aFloat6 + Static74.aFloat24 + Static143.aFloat64 * (float) local505 + (float) this.aShort32 * Static218.aFloat115);
			@Pc(666) int local666 = (int) (Static637.aFloat194 * (float) this.aShort32 + (float) local505 * Static518.aFloat166 + Static73.aFloat23 + Static339.aFloat21 * (float) local513);
			if (local666 >= this.aClass82_Sub1_10.anInt2483) {
				arg1.anInt5912 = this.aClass82_Sub1_10.anInt2496 + this.aClass82_Sub1_10.anInt2482 * local628 / local666;
				arg1.anInt5911 = local647 * this.aClass82_Sub1_10.anInt2489 / local666 + this.aClass82_Sub1_10.anInt2477;
			} else {
				local494 = true;
			}
			if (local494) {
				if (local570 < this.aClass82_Sub1_10.anInt2483 && this.aClass82_Sub1_10.anInt2483 > local666) {
					local496 = false;
				} else {
					@Pc(749) int local749;
					@Pc(759) int local759;
					@Pc(769) int local769;
					if (this.aClass82_Sub1_10.anInt2483 > local570) {
						local749 = (local666 - this.aClass82_Sub1_10.anInt2483 << 16) / (local666 - local570);
						local759 = local628 + ((local628 - local532) * local749 >> 16);
						local769 = local647 + (local749 * (local647 - local551) >> 16);
						arg1.anInt5910 = this.aClass82_Sub1_10.anInt2496 + local759 * this.aClass82_Sub1_10.anInt2482 / this.aClass82_Sub1_10.anInt2483;
						arg1.anInt5909 = local769 * this.aClass82_Sub1_10.anInt2489 / this.aClass82_Sub1_10.anInt2483 + this.aClass82_Sub1_10.anInt2477;
					} else if (this.aClass82_Sub1_10.anInt2483 > local666) {
						local749 = (local570 - this.aClass82_Sub1_10.anInt2483 << 16) / (local570 - local666);
						local759 = (local749 * (local532 - local628) >> 16) + local532;
						local769 = (local749 * (local551 - local647) >> 16) + local551;
						arg1.anInt5910 = this.aClass82_Sub1_10.anInt2482 * local759 / this.aClass82_Sub1_10.anInt2483 + this.aClass82_Sub1_10.anInt2496;
						arg1.anInt5909 = this.aClass82_Sub1_10.anInt2477 + local769 * this.aClass82_Sub1_10.anInt2489 / this.aClass82_Sub1_10.anInt2483;
					}
				}
			}
			if (local496) {
				if (local666 >= local570) {
					arg1.anInt5913 = this.aClass82_Sub1_10.anInt2482 * (local628 + this.aShort34) / local666 + this.aClass82_Sub1_10.anInt2496 - arg1.anInt5912;
				} else {
					arg1.anInt5913 = this.aClass82_Sub1_10.anInt2496 + this.aClass82_Sub1_10.anInt2482 * (local532 + this.aShort34) / local570 - arg1.anInt5910;
				}
				arg1.aBoolean433 = true;
			}
		}
		this.aClass82_Sub1_10.method2048();
		this.aClass82_Sub1_10.method2070(local25);
		this.method1790();
		this.aClass82_Sub1_10.method2094();
		this.method1784();
	}

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2157; local7++) {
			this.anIntArray140[local7] = -this.anIntArray140[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2172; local25++) {
			this.aShortArray23[local25] = (short) -this.aShortArray23[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt2128; local44++) {
			@Pc(51) short local51 = this.aShortArray20[local44];
			this.aShortArray20[local44] = this.aShortArray22[local44];
			this.aShortArray22[local44] = local51;
		}
		if (this.aClass313_6 == null && this.aClass313_5 != null) {
			this.aClass313_5.anInterface3_7 = null;
		}
		if (this.aClass313_6 != null) {
			this.aClass313_6.anInterface3_7 = null;
		}
		if (this.aClass114_1 != null) {
			this.aClass114_1.anInterface17_3 = null;
		}
		if (this.aClass313_7 != null) {
			this.aClass313_7.anInterface3_7 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean164;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6796(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
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
			local27 = 0;
			Static513.anInt8659 = 0;
			Static449.anInt7744 = 0;
			Static141.anInt2885 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray9.length) {
					local55 = this.anIntArrayArray9[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static449.anInt7744 += this.anIntArray142[local63];
						Static513.anInt8659 += this.anIntArray139[local63];
						local27++;
						Static141.anInt2885 += this.anIntArray140[local63];
					}
				}
			}
			if (local27 > 0) {
				Static141.anInt2885 = Static141.anInt2885 / local27 + local17;
				Static513.anInt8659 = local21 + Static513.anInt8659 / local27;
				Static449.anInt7744 = Static449.anInt7744 / local27 + local25;
			} else {
				Static141.anInt2885 = local17;
				Static513.anInt8659 = local21;
				Static449.anInt7744 = local25;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local21 = arg3 << 4;
			local17 = arg4 << 4;
			local25 = arg2 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray9.length > local35) {
					local164 = this.anIntArrayArray9[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray142[local57] += local25;
						this.anIntArray139[local57] += local21;
						this.anIntArray140[local57] += local17;
					}
				}
			}
			return;
		}
		@Pc(282) int local282;
		@Pc(301) int local301;
		@Pc(750) int local750;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray9.length) {
					local164 = this.anIntArrayArray9[local35];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray142[local57] -= Static449.anInt7744;
							this.anIntArray139[local57] -= Static513.anInt8659;
							this.anIntArray140[local57] -= Static141.anInt2885;
							if (arg4 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg4];
								local282 = Class3_Sub13.anIntArray146[arg4];
								local301 = local63 * this.anIntArray139[local57] + this.anIntArray142[local57] * local282 + 16383 >> 14;
								this.anIntArray139[local57] = local282 * this.anIntArray139[local57] + 16383 - local63 * this.anIntArray142[local57] >> 14;
								this.anIntArray142[local57] = local301;
							}
							if (arg2 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg2];
								local282 = Class3_Sub13.anIntArray146[arg2];
								local301 = this.anIntArray139[local57] * local282 + 16383 - local63 * this.anIntArray140[local57] >> 14;
								this.anIntArray140[local57] = this.anIntArray140[local57] * local282 + local63 * this.anIntArray139[local57] + 16383 >> 14;
								this.anIntArray139[local57] = local301;
							}
							if (arg3 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg3];
								local282 = Class3_Sub13.anIntArray146[arg3];
								local301 = this.anIntArray142[local57] * local282 + this.anIntArray140[local57] * local63 + 16383 >> 14;
								this.anIntArray140[local57] = local282 * this.anIntArray140[local57] + 16383 - local63 * this.anIntArray142[local57] >> 14;
								this.anIntArray142[local57] = local301;
							}
							this.anIntArray142[local57] += Static449.anInt7744;
							this.anIntArray139[local57] += Static513.anInt8659;
							this.anIntArray140[local57] += Static141.anInt2885;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray142[local57] -= Static449.anInt7744;
							this.anIntArray139[local57] -= Static513.anInt8659;
							this.anIntArray140[local57] -= Static141.anInt2885;
							if (arg2 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg2];
								local282 = Class3_Sub13.anIntArray146[arg2];
								local301 = this.anIntArray139[local57] * local282 + 16383 - this.anIntArray140[local57] * local63 >> 14;
								this.anIntArray140[local57] = this.anIntArray140[local57] * local282 + local63 * this.anIntArray139[local57] + 16383 >> 14;
								this.anIntArray139[local57] = local301;
							}
							if (arg4 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg4];
								local282 = Class3_Sub13.anIntArray146[arg4];
								local301 = this.anIntArray142[local57] * local282 + this.anIntArray139[local57] * local63 + 16383 >> 14;
								this.anIntArray139[local57] = this.anIntArray139[local57] * local282 + 16383 - this.anIntArray142[local57] * local63 >> 14;
								this.anIntArray142[local57] = local301;
							}
							if (arg3 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg3];
								local282 = Class3_Sub13.anIntArray146[arg3];
								local301 = local282 * this.anIntArray142[local57] + this.anIntArray140[local57] * local63 + 16383 >> 14;
								this.anIntArray140[local57] = local282 * this.anIntArray140[local57] + 16383 - this.anIntArray142[local57] * local63 >> 14;
								this.anIntArray142[local57] = local301;
							}
							this.anIntArray142[local57] += Static449.anInt7744;
							this.anIntArray139[local57] += Static513.anInt8659;
							this.anIntArray140[local57] += Static141.anInt2885;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray9.length) {
						local55 = this.anIntArrayArray9[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local282 = this.anIntArray141[local63];
							local301 = this.anIntArray141[local63 + 1];
							for (local750 = local282; local750 < local301; local750++) {
								@Pc(759) int local759 = this.aShortArray29[local750] - 1;
								if (local759 == -1) {
									break;
								}
								@Pc(771) int local771;
								@Pc(775) int local775;
								@Pc(793) int local793;
								if (arg4 != 0) {
									local771 = Class3_Sub13.anIntArray147[arg4];
									local775 = Class3_Sub13.anIntArray146[arg4];
									local793 = this.aShortArray21[local759] * local771 + this.aShortArray26[local759] * local775 + 16383 >> 14;
									this.aShortArray21[local759] = (short) (local775 * this.aShortArray21[local759] + 16383 - local771 * this.aShortArray26[local759] >> 14);
									this.aShortArray26[local759] = (short) local793;
								}
								if (arg2 != 0) {
									local771 = Class3_Sub13.anIntArray147[arg2];
									local775 = Class3_Sub13.anIntArray146[arg2];
									local793 = local775 * this.aShortArray21[local759] + 16383 - local771 * this.aShortArray23[local759] >> 14;
									this.aShortArray23[local759] = (short) (this.aShortArray21[local759] * local771 + local775 * this.aShortArray23[local759] + 16383 >> 14);
									this.aShortArray21[local759] = (short) local793;
								}
								if (arg3 != 0) {
									local771 = Class3_Sub13.anIntArray147[arg3];
									local775 = Class3_Sub13.anIntArray146[arg3];
									local793 = this.aShortArray26[local759] * local775 + local771 * this.aShortArray23[local759] + 16383 >> 14;
									this.aShortArray23[local759] = (short) (this.aShortArray23[local759] * local775 + 16383 - local771 * this.aShortArray26[local759] >> 14);
									this.aShortArray26[local759] = (short) local793;
								}
							}
						}
					}
				}
				if (this.aClass313_6 == null && this.aClass313_5 != null) {
					this.aClass313_5.anInterface3_7 = null;
				}
				if (this.aClass313_6 != null) {
					this.aClass313_6.anInterface3_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray9.length) {
					local164 = this.anIntArrayArray9[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray142[local57] -= Static449.anInt7744;
						this.anIntArray139[local57] -= Static513.anInt8659;
						this.anIntArray140[local57] -= Static141.anInt2885;
						this.anIntArray142[local57] = arg2 * this.anIntArray142[local57] >> 7;
						this.anIntArray139[local57] = arg3 * this.anIntArray139[local57] >> 7;
						this.anIntArray140[local57] = arg4 * this.anIntArray140[local57] >> 7;
						this.anIntArray142[local57] += Static449.anInt7744;
						this.anIntArray139[local57] += Static513.anInt8659;
						this.anIntArray140[local57] += Static141.anInt2885;
					}
				}
			}
		} else {
			@Pc(1204) Class266 local1204;
			@Pc(1209) Class272 local1209;
			if (arg0 == 5) {
				if (this.anIntArrayArray7 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray7.length > local35) {
							local164 = this.anIntArrayArray7[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local57 = local164[local166];
								local63 = (this.aByteArray19[local57] & 0xFF) + arg2 * 8;
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray19[local57] = (byte) local63;
							}
							if (local164.length > 0 && this.aClass313_5 != null) {
								this.aClass313_5.anInterface3_7 = null;
							}
						}
					}
					if (this.aClass266Array1 != null) {
						for (local35 = 0; local35 < this.anInt2124; local35++) {
							local1204 = this.aClass266Array1[local35];
							local1209 = this.aClass272Array1[local35];
							local1209.anInt7648 = local1209.anInt7648 & 0xFFFFFF | 255 - (this.aByteArray19[local1204.anInt7566] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1462) Class272 local1462;
				if (arg0 == 8) {
					if (this.anIntArrayArray8 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray8.length) {
								local164 = this.anIntArrayArray8[local35];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1462 = this.aClass272Array1[local164[local166]];
									local1462.anInt7647 += arg3;
									local1462.anInt7640 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray8.length > local35) {
								local164 = this.anIntArrayArray8[local35];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1462 = this.aClass272Array1[local164[local166]];
									local1462.anInt7642 = arg2 * local1462.anInt7642 >> 7;
									local1462.anInt7650 = arg3 * local1462.anInt7650 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray8.length > local35) {
							local164 = this.anIntArrayArray8[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1462 = this.aClass272Array1[local164[local166]];
								local1462.anInt7641 = local1462.anInt7641 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray7 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray7.length) {
						local164 = this.anIntArrayArray7[local35];
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							local63 = this.aShortArray28[local57] & 0xFFFF;
							local282 = local63 >> 10 & 0x3F;
							local301 = local63 >> 7 & 0x7;
							local750 = local63 & 0x7F;
							@Pc(1306) int local1306 = local282 + arg2 & 0x3F;
							local301 += arg3 / 4;
							local750 += arg4;
							if (local301 < 0) {
								local301 = 0;
							} else if (local301 > 7) {
								local301 = 7;
							}
							if (local750 < 0) {
								local750 = 0;
							} else if (local750 > 127) {
								local750 = 127;
							}
							this.aShortArray28[local57] = (short) (local1306 << 10 | local301 << 7 | local750);
						}
						if (local164.length > 0 && this.aClass313_5 != null) {
							this.aClass313_5.anInterface3_7 = null;
						}
					}
				}
				if (this.aClass266Array1 != null) {
					for (local35 = 0; local35 < this.anInt2124; local35++) {
						local1204 = this.aClass266Array1[local35];
						local1209 = this.aClass272Array1[local35];
						local1209.anInt7648 = Static205.anIntArray530[this.aShortArray28[local1204.anInt7566] & 0xFFFF] & 0xFFFFFF | local1209.anInt7648 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean166) {
			this.method1783();
		}
		return this.aShort40;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	private void method1784() {
		if (this.aClass266Array1 == null) {
			return;
		}
		@Pc(8) Class31_Sub3 local8 = this.aClass82_Sub1_10.aClass31_Sub3_2;
		this.aClass82_Sub1_10.method2045();
		this.aClass82_Sub1_10.C(!this.aBoolean165);
		this.aClass82_Sub1_10.method2028(false);
		this.aClass82_Sub1_10.method2073((Class313) null, this.aClass82_Sub1_10.aClass313_10, (Class313) null, this.aClass82_Sub1_10.aClass313_9);
		for (@Pc(42) int local42 = 0; local42 < this.anInt2124; local42++) {
			@Pc(49) Class266 local49 = this.aClass266Array1[local42];
			@Pc(54) Class272 local54 = this.aClass272Array1[local42];
			if (!local49.aBoolean541 || !this.aClass82_Sub1_10.method6103()) {
				@Pc(84) float local84 = (float) (this.anIntArray142[local49.anInt7567] + this.anIntArray142[local49.anInt7563] + this.anIntArray142[local49.anInt7568]) * 0.3333333F;
				@Pc(105) float local105 = (float) (this.anIntArray139[local49.anInt7567] + this.anIntArray139[local49.anInt7563] + this.anIntArray139[local49.anInt7568]) * 0.3333333F;
				@Pc(126) float local126 = (float) (this.anIntArray140[local49.anInt7568] + this.anIntArray140[local49.anInt7563] + this.anIntArray140[local49.anInt7567]) * 0.3333333F;
				@Pc(140) float local140 = Static395.aFloat147 + local105 * Static148.aFloat69 + local84 * Static608.aFloat196 + local126 * Static432.aFloat148;
				@Pc(154) float local154 = Static74.aFloat24 + local126 * Static26.aFloat6 + Static143.aFloat64 * local84 + Static218.aFloat115 * local105;
				@Pc(168) float local168 = local126 * Static339.aFloat21 + Static518.aFloat166 * local84 + Static637.aFloat194 * local105 + Static73.aFloat23;
				@Pc(189) float local189 = (float) (1.0D / Math.sqrt((double) (local168 * local168 + local140 * local140 + local154 * local154))) * (float) local49.anInt7559;
				local8.method7944(local140 + (float) local54.anInt7640 - local140 * local189, -local168 + local168 * local189, local54.anInt7650 * local49.aShort85 >> 7, (float) local54.anInt7647 + local154 * local189 - local154, local54.anInt7641, local49.aShort86 * local54.anInt7642 >> 7);
				this.aClass82_Sub1_10.method2093(local8);
				@Pc(241) int local241 = local54.anInt7648;
				OpenGL.glColor4ub((byte) (local241 >> 16), (byte) (local241 >> 8), (byte) local241, (byte) (local241 >> 24));
				this.aClass82_Sub1_10.method2057(local49.aShort87);
				this.aClass82_Sub1_10.method2085(local49.aByte82);
				this.aClass82_Sub1_10.method2089(4);
			}
		}
		this.aClass82_Sub1_10.C(true);
		this.aClass82_Sub1_10.method2094();
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "()V")
	@Override
	protected void method6791() {
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V")
	private void method1785(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass313_5 != null && this.aClass313_5.anInterface3_7 == null;
		@Pc(27) boolean local27 = this.aClass313_6 != null && this.aClass313_6.anInterface3_7 == null;
		@Pc(38) boolean local38 = this.aClass313_7 != null && this.aClass313_7.anInterface3_7 == null;
		@Pc(49) boolean local49 = this.aClass313_4 != null && this.aClass313_4.anInterface3_7 == null;
		if (arg0) {
			local38 &= (this.aByte50 & 0x1) != 0;
			local16 &= (this.aByte50 & 0x2) != 0;
			local49 &= (this.aByte50 & 0x8) != 0;
			local27 &= (this.aByte50 & 0x4) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(118) byte local118 = 0;
		if (local38) {
			local106 = 12;
		}
		@Pc(129) byte local129 = 0;
		if (local16) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local118 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local129 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.aClass82_Sub1_10.aClass3_Sub9_Sub1_2.aByteArray51.length < local106 * this.anInt2172) {
			this.aClass82_Sub1_10.aClass3_Sub9_Sub1_2 = new Class3_Sub9_Sub1((this.anInt2172 + 100) * local106);
		} else {
			this.aClass82_Sub1_10.aClass3_Sub9_Sub1_2.anInt6453 = 0;
		}
		@Pc(196) Class3_Sub9_Sub1 local196 = this.aClass82_Sub1_10.aClass3_Sub9_Sub1_2;
		@Pc(204) int local204;
		@Pc(213) int local213;
		@Pc(241) int local241;
		@Pc(250) int local250;
		if (local38) {
			@Pc(220) int local220;
			@Pc(227) int local227;
			@Pc(232) int local232;
			@Pc(239) int local239;
			if (this.aClass82_Sub1_10.aBoolean174) {
				for (local204 = 0; local204 < this.anInt2157; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray142[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray139[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray140[local204]);
					local232 = this.anIntArray141[local204];
					local239 = this.anIntArray141[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray29[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.anInt6453 = local106 * local250;
						local196.method5601(local213);
						local196.method5601(local220);
						local196.method5601(local227);
					}
				}
			} else {
				for (local204 = 0; local204 < this.anInt2157; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray142[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray139[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray140[local204]);
					local232 = this.anIntArray141[local204];
					local239 = this.anIntArray141[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray29[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.anInt6453 = local250 * local106;
						local196.method5598(local213);
						local196.method5598(local220);
						local196.method5598(local227);
					}
				}
			}
		}
		@Pc(485) float local485;
		@Pc(387) short[] local387;
		@Pc(375) short[] local375;
		@Pc(383) short[] local383;
		@Pc(379) byte[] local379;
		@Pc(534) float local534;
		if (local16) {
			if (this.aClass313_6 == null) {
				if (this.aClass86_1 == null) {
					local383 = this.aShortArray23;
					local375 = this.aShortArray21;
					local379 = this.aByteArray18;
					local387 = this.aShortArray26;
				} else {
					local375 = this.aClass86_1.aShortArray32;
					local379 = this.aClass86_1.aByteArray24;
					local383 = this.aClass86_1.aShortArray31;
					local387 = this.aClass86_1.aShortArray33;
				}
				@Pc(407) float local407 = this.aClass82_Sub1_10.aFloatArray11[0];
				@Pc(413) float local413 = this.aClass82_Sub1_10.aFloatArray11[1];
				@Pc(419) float local419 = this.aClass82_Sub1_10.aFloatArray11[2];
				@Pc(423) float local423 = this.aClass82_Sub1_10.aFloat36;
				@Pc(433) float local433 = this.aClass82_Sub1_10.aFloat31 * 768.0F / (float) this.aShort35;
				@Pc(443) float local443 = this.aClass82_Sub1_10.aFloat47 * 768.0F / (float) this.aShort35;
				for (@Pc(445) int local445 = 0; local445 < this.anInt2128; local445++) {
					@Pc(465) int local465 = this.method1794(this.aShort36, this.aByteArray19[local445], this.aShortArray25[local445], this.aShortArray28[local445]);
					@Pc(474) float local474 = (float) (local465 >>> 24) * this.aClass82_Sub1_10.aFloat40;
					local485 = (float) (local465 >> 16 & 0xFF) * this.aClass82_Sub1_10.aFloat34;
					@Pc(496) float local496 = (float) (local465 >> 8 & 0xFF) * this.aClass82_Sub1_10.aFloat35;
					@Pc(501) short local501 = this.aShortArray20[local445];
					@Pc(506) short local506 = (short) local379[local501];
					if (local506 == 0) {
						local534 = ((float) local387[local501] * local407 + (float) local375[local501] * local413 + local419 * (float) local383[local501]) * 0.0026041667F;
					} else {
						local534 = (local413 * (float) local375[local501] + local407 * (float) local387[local501] + local419 * (float) local383[local501]) / (float) (local506 * 256);
					}
					@Pc(574) float local574 = (local534 < 0.0F ? local443 : local433) * local534 + local423;
					@Pc(579) int local579 = (int) (local574 * local474);
					if (local579 < 0) {
						local579 = 0;
					} else if (local579 > 255) {
						local579 = 255;
					}
					@Pc(597) int local597 = (int) (local485 * local574);
					if (local597 < 0) {
						local597 = 0;
					} else if (local597 > 255) {
						local597 = 255;
					}
					@Pc(618) int local618 = (int) (local496 * local574);
					if (local618 < 0) {
						local618 = 0;
					} else if (local618 > 255) {
						local618 = 255;
					}
					local196.anInt6453 = local501 * local106 + local110;
					local196.method5572(local579);
					local196.method5572(local597);
					local196.method5572(local618);
					local196.method5572(255 - (this.aByteArray19[local445] & 0xFF));
					local501 = this.aShortArray27[local445];
					local506 = (short) local379[local501];
					if (local506 == 0) {
						local534 = ((float) local383[local501] * local419 + local413 * (float) local375[local501] + local407 * (float) local387[local501]) * 0.0026041667F;
					} else {
						local534 = ((float) local387[local501] * local407 + (float) local375[local501] * local413 + local419 * (float) local383[local501]) / (float) (local506 * 256);
					}
					local574 = local423 + local534 * (local534 < 0.0F ? local443 : local433);
					local579 = (int) (local574 * local474);
					local597 = (int) (local485 * local574);
					if (local579 < 0) {
						local579 = 0;
					} else if (local579 > 255) {
						local579 = 255;
					}
					if (local597 < 0) {
						local597 = 0;
					} else if (local597 > 255) {
						local597 = 255;
					}
					local618 = (int) (local574 * local496);
					if (local618 < 0) {
						local618 = 0;
					} else if (local618 > 255) {
						local618 = 255;
					}
					local196.anInt6453 = local110 + local501 * local106;
					local196.method5572(local579);
					local196.method5572(local597);
					local196.method5572(local618);
					local196.method5572(255 - (this.aByteArray19[local445] & 0xFF));
					local501 = this.aShortArray22[local445];
					local506 = (short) local379[local501];
					if (local506 == 0) {
						local534 = ((float) local375[local501] * local413 + local407 * (float) local387[local501] + local419 * (float) local383[local501]) * 0.0026041667F;
					} else {
						local534 = (local419 * (float) local383[local501] + local407 * (float) local387[local501] + local413 * (float) local375[local501]) / (float) (local506 * 256);
					}
					local574 = local534 * (local534 < 0.0F ? local443 : local433) + local423;
					local579 = (int) (local574 * local474);
					if (local579 < 0) {
						local579 = 0;
					} else if (local579 > 255) {
						local579 = 255;
					}
					local597 = (int) (local574 * local485);
					local618 = (int) (local574 * local496);
					if (local597 < 0) {
						local597 = 0;
					} else if (local597 > 255) {
						local597 = 255;
					}
					if (local618 < 0) {
						local618 = 0;
					} else if (local618 > 255) {
						local618 = 255;
					}
					local196.anInt6453 = local110 + local106 * local501;
					local196.method5572(local579);
					local196.method5572(local597);
					local196.method5572(local618);
					local196.method5572(255 - (this.aByteArray19[local445] & 0xFF));
				}
			} else {
				for (local204 = 0; local204 < this.anInt2128; local204++) {
					local213 = this.method1794(this.aShort36, this.aByteArray19[local204], this.aShortArray25[local204], this.aShortArray28[local204]);
					local196.anInt6453 = local110 + this.aShortArray20[local204] * local106;
					local196.method5601(local213);
					local196.anInt6453 = local106 * this.aShortArray27[local204] + local110;
					local196.method5601(local213);
					local196.anInt6453 = local110 + local106 * this.aShortArray22[local204];
					local196.method5601(local213);
				}
			}
		}
		if (local27) {
			if (this.aClass86_1 == null) {
				local383 = this.aShortArray23;
				local379 = this.aByteArray18;
				local387 = this.aShortArray26;
				local375 = this.aShortArray21;
			} else {
				local387 = this.aClass86_1.aShortArray33;
				local375 = this.aClass86_1.aShortArray32;
				local379 = this.aClass86_1.aByteArray24;
				local383 = this.aClass86_1.aShortArray31;
			}
			@Pc(1107) float local1107 = 3.0F / (float) this.aShort35;
			local196.anInt6453 = local118;
			local534 = 3.0F / (float) (this.aShort35 / 2 + this.aShort35);
			if (this.aClass82_Sub1_10.aBoolean174) {
				for (local241 = 0; local241 < this.anInt2172; local241++) {
					local250 = local379[local241] & 0xFF;
					if (local250 == 0) {
						local196.method706(local534 * (float) local387[local241]);
						local196.method706(local534 * (float) local375[local241]);
						local196.method706(local534 * (float) local383[local241]);
					} else {
						local485 = local1107 / (float) local250;
						local196.method706(local485 * (float) local387[local241]);
						local196.method706(local485 * (float) local375[local241]);
						local196.method706(local485 * (float) local383[local241]);
					}
					local196.anInt6453 += local106 - 12;
				}
			} else {
				for (local241 = 0; local241 < this.anInt2172; local241++) {
					local250 = local379[local241] & 0xFF;
					if (local250 == 0) {
						local196.method704(local534 * (float) local387[local241]);
						local196.method704((float) local375[local241] * local534);
						local196.method704(local534 * (float) local383[local241]);
					} else {
						local485 = local1107 / (float) local250;
						local196.method704(local485 * (float) local387[local241]);
						local196.method704((float) local375[local241] * local485);
						local196.method704(local485 * (float) local383[local241]);
					}
					local196.anInt6453 += local106 - 12;
				}
			}
		}
		if (local49) {
			local196.anInt6453 = local129;
			if (this.aClass82_Sub1_10.aBoolean174) {
				for (local204 = 0; local204 < this.anInt2172; local204++) {
					local196.method706(this.aFloatArray6[local204]);
					local196.method706(this.aFloatArray5[local204]);
					local196.anInt6453 += local106 - 8;
				}
			} else {
				for (local204 = 0; local204 < this.anInt2172; local204++) {
					local196.method704(this.aFloatArray6[local204]);
					local196.method704(this.aFloatArray5[local204]);
					local196.anInt6453 += local106 - 8;
				}
			}
		}
		local196.anInt6453 = local106 * this.anInt2172;
		@Pc(1420) Interface3 local1420;
		if (arg0) {
			if (this.anInterface3_2 == null) {
				this.anInterface3_2 = this.aClass82_Sub1_10.method2035(true, local106, local196.aByteArray51, local196.anInt6453);
			} else {
				this.anInterface3_2.method8530(local196.anInt6453, local106, local196.aByteArray51);
			}
			local1420 = this.anInterface3_2;
			this.aByte50 = 0;
		} else {
			local1420 = this.aClass82_Sub1_10.method2035(false, local106, local196.aByteArray51, local196.anInt6453);
			this.aBoolean163 = true;
		}
		if (local38) {
			this.aClass313_7.aByte106 = 0;
			this.aClass313_7.anInterface3_7 = local1420;
		}
		if (local49) {
			this.aClass313_4.anInterface3_7 = local1420;
			this.aClass313_4.aByte106 = local129;
		}
		if (local16) {
			this.aClass313_5.anInterface3_7 = local1420;
			this.aClass313_5.aByte106 = local110;
		}
		if (local27) {
			this.aClass313_6.aByte106 = local118;
			this.aClass313_6.anInterface3_7 = local1420;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	private void method1786() {
		if (!this.aBoolean163) {
			return;
		}
		this.aBoolean163 = false;
		if (this.aClass228Array1 == null && this.aClass232Array1 == null && this.aClass266Array1 == null) {
			if (this.anIntArray142 != null && !Static353.method5665(this.anInt2132, this.anInt2129)) {
				if (this.aClass313_7 != null && this.aClass313_7.anInterface3_7 == null) {
					this.aBoolean163 = true;
				} else {
					if (!this.aBoolean166) {
						this.method1783();
					}
					this.anIntArray142 = null;
				}
			}
			if (this.anIntArray139 != null && !Static612.method8368(this.anInt2129, this.anInt2132)) {
				if (this.aClass313_7 != null && this.aClass313_7.anInterface3_7 == null) {
					this.aBoolean163 = true;
				} else {
					if (!this.aBoolean166) {
						this.method1783();
					}
					this.anIntArray139 = null;
				}
			}
			if (this.anIntArray140 != null && !Static642.method8640(this.anInt2132, this.anInt2129)) {
				if (this.aClass313_7 != null && this.aClass313_7.anInterface3_7 == null) {
					this.aBoolean163 = true;
				} else {
					if (!this.aBoolean166) {
						this.method1783();
					}
					this.anIntArray140 = null;
				}
			}
		}
		if (this.aShortArray29 != null && this.anIntArray142 == null && this.anIntArray139 == null && this.anIntArray140 == null) {
			this.aShortArray29 = null;
			this.anIntArray141 = null;
		}
		if (this.aByteArray18 != null && !Static15.method245(this.anInt2129, this.anInt2132)) {
			if (this.aClass313_6 == null) {
				if (this.aClass313_5 != null && this.aClass313_5.anInterface3_7 == null) {
					this.aBoolean163 = true;
				} else {
					this.aShortArray26 = this.aShortArray21 = this.aShortArray23 = null;
					this.aByteArray18 = null;
				}
			} else if (this.aClass313_6.anInterface3_7 == null) {
				this.aBoolean163 = true;
			} else {
				this.aShortArray26 = this.aShortArray21 = this.aShortArray23 = null;
				this.aByteArray18 = null;
			}
		}
		if (this.aShortArray28 != null && !Static87.method1475(this.anInt2129, this.anInt2132)) {
			if (this.aClass313_5 != null && this.aClass313_5.anInterface3_7 == null) {
				this.aBoolean163 = true;
			} else {
				this.aShortArray28 = null;
			}
		}
		if (this.aByteArray19 != null && !Static342.method5463(this.anInt2132, this.anInt2129)) {
			if (this.aClass313_5 != null && this.aClass313_5.anInterface3_7 == null) {
				this.aBoolean163 = true;
			} else {
				this.aByteArray19 = null;
			}
		}
		if (this.aFloatArray6 != null && !Static122.method2219(this.anInt2132, this.anInt2129)) {
			if (this.aClass313_4 != null && this.aClass313_4.anInterface3_7 == null) {
				this.aBoolean163 = true;
			} else {
				this.aFloatArray6 = this.aFloatArray5 = null;
			}
		}
		if (this.aShortArray25 != null && !Static424.method6726(this.anInt2132, this.anInt2129)) {
			if (this.aClass313_5 != null && this.aClass313_5.anInterface3_7 == null) {
				this.aBoolean163 = true;
			} else {
				this.aShortArray25 = null;
			}
		}
		if (this.aShortArray20 != null && !Static170.method2821(this.anInt2129, this.anInt2132)) {
			if (this.aClass114_1 != null && this.aClass114_1.anInterface17_3 == null || this.aClass313_5 != null && this.aClass313_5.anInterface3_7 == null) {
				this.aBoolean163 = true;
			} else {
				this.aShortArray20 = this.aShortArray27 = this.aShortArray22 = null;
			}
		}
		if (this.anIntArrayArray7 != null && !Static414.method6404(this.anInt2132, this.anInt2129)) {
			this.anIntArrayArray7 = null;
			this.aShortArray30 = null;
		}
		if (this.anIntArrayArray9 != null && !Static572.method8042(this.anInt2132, this.anInt2129)) {
			this.anIntArrayArray9 = null;
			this.aShortArray24 = null;
		}
		if (this.anIntArrayArray8 != null && !Static63.method1056(this.anInt2132, this.anInt2129)) {
			this.anIntArrayArray8 = null;
		}
		if (this.lb != null && (this.anInt2129 & 0x800) == 0 && (this.anInt2129 & 0x40000) == 0) {
			this.lb = null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt2128; local3++) {
			local12 = this.aShortArray28[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg2 != -1) {
				local42 -= -(arg3 * (arg2 - local42) >> 7);
			}
			this.aShortArray28[local3] = (short) (local42 | local18 << 10 | local24 << 7);
		}
		if (this.aClass266Array1 != null) {
			for (local12 = 0; local12 < this.anInt2124; local12++) {
				@Pc(106) Class266 local106 = this.aClass266Array1[local12];
				@Pc(111) Class272 local111 = this.aClass272Array1[local12];
				local111.anInt7648 = Static205.anIntArray530[this.aShortArray28[local106.anInt7566] & 0xFFFF] & 0xFFFFFF | local111.anInt7648 & 0xFF000000;
			}
		}
		if (this.aClass313_5 != null) {
			this.aClass313_5.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub13.anIntArray147[arg0];
		@Pc(13) int local13 = Class3_Sub13.anIntArray146[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2157; local15++) {
			local34 = this.anIntArray140[local15] * local9 + local13 * this.anIntArray142[local15] >> 14;
			this.anIntArray140[local15] = this.anIntArray140[local15] * local13 - this.anIntArray142[local15] * local9 >> 14;
			this.anIntArray142[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt2172; local34++) {
			@Pc(85) int local85 = local9 * this.aShortArray23[local34] + this.aShortArray26[local34] * local13 >> 14;
			this.aShortArray23[local34] = (short) (local13 * this.aShortArray23[local34] - this.aShortArray26[local34] * local9 >> 14);
			this.aShortArray26[local34] = (short) local85;
		}
		if (this.aClass313_6 == null && this.aClass313_5 != null) {
			this.aClass313_5.anInterface3_7 = null;
		}
		if (this.aClass313_6 != null) {
			this.aClass313_6.anInterface3_7 = null;
		}
		if (this.aClass313_7 != null) {
			this.aClass313_7.anInterface3_7 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!dn", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean166) {
			this.method1783();
		}
		return this.aShort34;
	}

	@OriginalMember(owner = "client!dn", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort35 = (short) arg0;
		if (this.aClass313_5 != null) {
			this.aClass313_5.anInterface3_7 = null;
		}
		if (this.aClass313_6 != null) {
			this.aClass313_6.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IFILclient!vo;JIFIZI)S")
	private short method1787(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class359 arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray141[arg5];
		@Pc(17) int local17 = this.anIntArray141[arg5 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray29[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static453.aLongArray15[local21] == arg4) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray29[local19] = (short) (this.anInt2172 + 1);
		Static453.aLongArray15[local19] = arg4;
		this.aShortArray26[this.anInt2172] = (short) arg0;
		this.aShortArray21[this.anInt2172] = (short) arg2;
		this.aShortArray23[this.anInt2172] = (short) arg7;
		this.aByteArray18[this.anInt2172] = (byte) arg8;
		this.aFloatArray6[this.anInt2172] = arg6;
		this.aFloatArray5[this.anInt2172] = arg1;
		return (short) this.anInt2172++;
	}

	@OriginalMember(owner = "client!dn", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2116; local3++) {
			this.anIntArray142[local3] = this.anIntArray142[local3] + 7 >> 4;
			this.anIntArray139[local3] = this.anIntArray139[local3] + 7 >> 4;
			this.anIntArray140[local3] = this.anIntArray140[local3] + 7 >> 4;
		}
		this.aBoolean166 = false;
		if (this.aClass313_7 != null) {
			this.aClass313_7.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "()V")
	@Override
	public void method6785() {
		if (this.anInt2172 <= 0 || this.anInt2111 <= 0) {
			return;
		}
		this.method1785(false);
		if ((this.aByte50 & 0x10) == 0 && this.aClass114_1.anInterface17_3 == null) {
			this.method1788(false);
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(ZI)V")
	private void method1788(@OriginalArg(0) boolean arg0) {
		if (this.anInt2111 * 6 > this.aClass82_Sub1_10.aClass3_Sub9_Sub1_2.aByteArray51.length) {
			this.aClass82_Sub1_10.aClass3_Sub9_Sub1_2 = new Class3_Sub9_Sub1((this.anInt2111 + 100) * 6);
		} else {
			this.aClass82_Sub1_10.aClass3_Sub9_Sub1_2.anInt6453 = 0;
		}
		@Pc(38) Class3_Sub9_Sub1 local38 = this.aClass82_Sub1_10.aClass3_Sub9_Sub1_2;
		@Pc(51) int local51;
		if (this.aClass82_Sub1_10.aBoolean174) {
			for (local51 = 0; local51 < this.anInt2111; local51++) {
				local38.method5620(this.aShortArray20[local51]);
				local38.method5620(this.aShortArray27[local51]);
				local38.method5620(this.aShortArray22[local51]);
			}
		} else {
			for (local51 = 0; local51 < this.anInt2111; local51++) {
				local38.method5627(this.aShortArray20[local51]);
				local38.method5627(this.aShortArray27[local51]);
				local38.method5627(this.aShortArray22[local51]);
			}
		}
		if (local38.anInt6453 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface17_1 == null) {
				this.anInterface17_1 = this.aClass82_Sub1_10.method2044(local38.aByteArray51, local38.anInt6453, true);
			} else {
				this.anInterface17_1.method5960(local38.anInt6453, local38.aByteArray51);
			}
			this.aClass114_1.anInterface17_3 = this.anInterface17_1;
		} else {
			this.aClass114_1.anInterface17_3 = this.aClass82_Sub1_10.method2044(local38.aByteArray51, local38.anInt6453, false);
		}
		if (!arg0) {
			this.aBoolean163 = true;
		}
	}

	@OriginalMember(owner = "client!dn", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean166) {
			this.method1783();
		}
		return this.aShort39;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6782(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class75_Sub1 local8 = (Class75_Sub1) arg0;
		if (this.anInt2128 == 0 || local8.anInt2128 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt2157;
		@Pc(21) int[] local21 = local8.anIntArray142;
		@Pc(24) int[] local24 = local8.anIntArray139;
		@Pc(27) int[] local27 = local8.anIntArray140;
		@Pc(30) short[] local30 = local8.aShortArray26;
		@Pc(33) short[] local33 = local8.aShortArray21;
		@Pc(36) short[] local36 = local8.aShortArray23;
		@Pc(39) byte[] local39 = local8.aByteArray18;
		@Pc(58) short[] local58;
		@Pc(46) short[] local46;
		@Pc(54) short[] local54;
		@Pc(50) byte[] local50;
		if (this.aClass86_1 == null) {
			local58 = null;
			local46 = null;
			local50 = null;
			local54 = null;
		} else {
			local46 = this.aClass86_1.aShortArray32;
			local50 = this.aClass86_1.aByteArray24;
			local54 = this.aClass86_1.aShortArray31;
			local58 = this.aClass86_1.aShortArray33;
		}
		@Pc(79) short[] local79;
		@Pc(73) short[] local73;
		@Pc(77) short[] local77;
		@Pc(75) byte[] local75;
		if (local8.aClass86_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local77 = local8.aClass86_1.aShortArray31;
			local79 = local8.aClass86_1.aShortArray33;
			local73 = local8.aClass86_1.aShortArray32;
			local75 = local8.aClass86_1.aByteArray24;
		}
		@Pc(100) int[] local100 = local8.anIntArray141;
		@Pc(103) short[] local103 = local8.aShortArray29;
		if (!local8.aBoolean166) {
			local8.method1783();
		}
		@Pc(112) short local112 = local8.aShort31;
		@Pc(115) short local115 = local8.aShort32;
		@Pc(118) short local118 = local8.aShort33;
		@Pc(121) short local121 = local8.aShort38;
		@Pc(124) short local124 = local8.aShort37;
		@Pc(127) short local127 = local8.aShort40;
		for (@Pc(129) int local129 = 0; local129 < this.anInt2157; local129++) {
			@Pc(139) int local139 = this.anIntArray139[local129] - arg2;
			if (local139 >= local112 && local139 <= local115) {
				@Pc(159) int local159 = this.anIntArray142[local129] - arg1;
				if (local118 <= local159 && local121 >= local159) {
					@Pc(179) int local179 = this.anIntArray140[local129] - arg3;
					if (local124 <= local179 && local179 <= local127) {
						@Pc(193) int local193 = -1;
						@Pc(198) int local198 = this.anIntArray141[local129];
						@Pc(205) int local205 = this.anIntArray141[local129 + 1];
						for (@Pc(207) int local207 = local198; local207 < local205; local207++) {
							local193 = this.aShortArray29[local207] - 1;
							if (local193 == -1 || this.aByteArray18[local193] != 0) {
								break;
							}
						}
						if (local193 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local18; local243++) {
								if (local159 == local21[local243] && local27[local243] == local179 && local139 == local24[local243]) {
									local198 = local100[local243];
									@Pc(270) int local270 = -1;
									local205 = local100[local243 + 1];
									for (@Pc(278) int local278 = local198; local278 < local205; local278++) {
										local270 = local103[local278] - 1;
										if (local270 == -1 || local39[local270] != 0) {
											break;
										}
									}
									if (local270 != -1) {
										if (local58 == null) {
											this.aClass86_1 = new Class86();
											local58 = this.aClass86_1.aShortArray33 = Static605.method8321(this.aShortArray26);
											local46 = this.aClass86_1.aShortArray32 = Static605.method8321(this.aShortArray21);
											local54 = this.aClass86_1.aShortArray31 = Static605.method8321(this.aShortArray23);
											local50 = this.aClass86_1.aByteArray24 = Static234.method4002(this.aByteArray18);
										}
										if (local79 == null) {
											@Pc(358) Class86 local358 = local8.aClass86_1 = new Class86();
											local79 = local358.aShortArray33 = Static605.method8321(local30);
											local73 = local358.aShortArray32 = Static605.method8321(local33);
											local77 = local358.aShortArray31 = Static605.method8321(local36);
											local75 = local358.aByteArray24 = Static234.method4002(local39);
										}
										@Pc(391) short local391 = this.aShortArray26[local193];
										@Pc(396) short local396 = this.aShortArray21[local193];
										@Pc(401) short local401 = this.aShortArray23[local193];
										local205 = local100[local243 + 1];
										@Pc(412) byte local412 = this.aByteArray18[local193];
										local198 = local100[local243];
										@Pc(426) int local426;
										for (@Pc(418) int local418 = local198; local418 < local205; local418++) {
											local426 = local103[local418] - 1;
											if (local426 == -1) {
												break;
											}
											if (local75[local426] != 0) {
												local79[local426] += local391;
												local73[local426] += local396;
												local77[local426] += local401;
												local75[local426] += local412;
											}
										}
										local396 = local33[local270];
										local391 = local30[local270];
										local198 = this.anIntArray141[local129];
										local412 = local39[local270];
										local401 = local36[local270];
										local205 = this.anIntArray141[local129 + 1];
										for (local426 = local198; local426 < local205; local426++) {
											@Pc(516) int local516 = this.aShortArray29[local426] - 1;
											if (local516 == -1) {
												break;
											}
											if (local50[local516] != 0) {
												local58[local516] += local391;
												local46[local516] += local396;
												local54[local516] += local401;
												local50[local516] += local412;
											}
										}
										if (this.aClass313_6 == null && this.aClass313_5 != null) {
											this.aClass313_5.anInterface3_7 = null;
										}
										if (this.aClass313_6 != null) {
											this.aClass313_6.anInterface3_7 = null;
										}
										if (local8.aClass313_6 == null && local8.aClass313_5 != null) {
											local8.aClass313_5.anInterface3_7 = null;
										}
										if (local8.aClass313_6 != null) {
											local8.aClass313_6.anInterface3_7 = null;
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

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "()Z")
	@Override
	public boolean method6789() {
		if (this.aShortArray25 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray25.length; local12++) {
			if (this.aShortArray25[local12] != -1 && !this.aClass82_Sub1_10.anInterface5_9.method4130(this.aShortArray25[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dn", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean166) {
			this.method1783();
		}
		return this.aShort32;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZIIIIII)Z")
	private boolean method1789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg5 && arg7 > arg0 && arg0 < arg2) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg7 && arg0 > arg2) {
			return false;
		} else if (arg3 > arg1 && arg1 < arg4 && arg1 < arg6) {
			return false;
		} else {
			return arg1 <= arg3 || arg1 <= arg4 || arg1 <= arg6;
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "()[Lclient!mv;")
	@Override
	public Class228[] method6794() {
		return this.aClass228Array1;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
	private void method1790() {
		if (this.anInt2111 == 0) {
			return;
		}
		if (this.aByte50 != 0) {
			this.method1785(true);
		}
		this.method1785(false);
		if (this.aClass114_1 != null) {
			if (this.aClass114_1.anInterface17_3 == null) {
				this.method1788((this.aByte50 & 0x10) != 0);
			}
			if (this.aClass114_1.anInterface17_3 != null) {
				this.aClass82_Sub1_10.method2028(this.aClass313_6 != null);
				this.aClass82_Sub1_10.method2073(this.aClass313_5, this.aClass313_4, this.aClass313_6, this.aClass313_7);
				@Pc(70) int local70 = this.lb.length - 1;
				for (@Pc(72) int local72 = 0; local72 < local70; local72++) {
					@Pc(79) int local79 = this.lb[local72];
					@Pc(86) int local86 = this.lb[local72 + 1];
					@Pc(93) int local93 = this.aShortArray25[local79] & 0xFFFF;
					if (local93 == 65535) {
						local93 = -1;
					}
					this.aClass82_Sub1_10.method2084(this.aClass313_6 != null, local93);
					this.aClass82_Sub1_10.method2036(local79 * 3, (local86 - local79) * 3, this.aClass114_1.anInterface17_3);
				}
			}
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!dn", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean166) {
			this.method1783();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub13.anIntArray147[arg0];
		@Pc(13) int local13 = Class3_Sub13.anIntArray146[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2157; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray142[local15] + local9 * this.anIntArray140[local15] >> 14;
			this.anIntArray140[local15] = this.anIntArray140[local15] * local13 - local9 * this.anIntArray142[local15] >> 14;
			this.anIntArray142[local15] = local33;
		}
		if (this.aClass313_7 != null) {
			this.aClass313_7.anInterface3_7 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean165;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!pfa;B)V")
	private void method1792(@OriginalArg(0) Class3_Sub7_Sub17_Sub2 arg0) {
		if (this.aClass82_Sub1_10.anIntArray158.length < this.anInt2172) {
			this.aClass82_Sub1_10.anIntArray159 = new int[this.anInt2172];
			this.aClass82_Sub1_10.anIntArray158 = new int[this.anInt2172];
		}
		@Pc(32) int[] local32 = this.aClass82_Sub1_10.anIntArray158;
		@Pc(36) int[] local36 = this.aClass82_Sub1_10.anIntArray159;
		@Pc(64) int local64;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt2157; local38++) {
			local64 = (this.anIntArray142[local38] - (this.aClass82_Sub1_10.anInt2490 * this.anIntArray139[local38] >> 8) >> this.aClass82_Sub1_10.anInt2464) - arg0.anInt7498;
			@Pc(89) int local89 = (this.anIntArray140[local38] - (this.anIntArray139[local38] * this.aClass82_Sub1_10.anInt2498 >> 8) >> this.aClass82_Sub1_10.anInt2464) - arg0.anInt7497;
			@Pc(94) int local94 = this.anIntArray141[local38];
			@Pc(101) int local101 = this.anIntArray141[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray29[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local32[local112] = local64;
				local36[local112] = local89;
			}
		}
		for (local64 = 0; local64 < this.anInt2111; local64++) {
			if (this.aByteArray19 == null || this.aByteArray19[local64] <= 128) {
				@Pc(156) short local156 = this.aShortArray20[local64];
				@Pc(161) short local161 = this.aShortArray27[local64];
				@Pc(166) short local166 = this.aShortArray22[local64];
				local103 = local32[local156];
				local112 = local32[local161];
				@Pc(178) int local178 = local32[local166];
				@Pc(182) int local182 = local36[local156];
				@Pc(186) int local186 = local36[local161];
				@Pc(190) int local190 = local36[local166];
				if (-((local178 - local112) * (local186 + -local182)) + (local186 - local190) * (local103 + -local112) > 0) {
					arg0.method6557(local190, local178, local182, local112, local103, local186);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort35;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBSII)I")
	private int method1794(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3) {
		@Pc(17) int local17 = Static205.anIntArray530[Static81.method1391(arg3, arg0)];
		if (arg2 != -1) {
			@Pc(30) Class355 local30 = this.aClass82_Sub1_10.anInterface5_9.method4129(arg2 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte121 & 0xFF;
			@Pc(54) int local54;
			@Pc(71) int local71;
			if (local35 != 0) {
				if (arg0 < 0) {
					local54 = 0;
				} else if (arg0 <= 127) {
					local54 = arg0 * 131586;
				} else {
					local54 = 16777215;
				}
				if (local35 == 256) {
					local17 = local54;
				} else {
					local71 = 256 - local35;
					local17 = ((local17 & 0xFF00FF) * local71 + (local54 & 0xFF00FF) * local35 & 0xFF00FF00) + (local71 * (local17 & 0xFF00) + local35 * (local54 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local54 = local30.aByte124 & 0xFF;
			if (local54 != 0) {
				local54 += 256;
				@Pc(124) int local124 = local54 * (local17 >> 16 & 0xFF);
				if (local124 > 65535) {
					local124 = 65535;
				}
				local71 = local54 * (local17 >> 8 & 0xFF);
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(148) int local148 = (local17 & 0xFF) * local54;
				if (local148 > 65535) {
					local148 = 65535;
				}
				local17 = (local71 & 0xFF00) + ((local124 << 8 & 0xFF004A) + (local148 >> 8));
			}
		}
		return (local17 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!dn", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			local24 = 0;
			Static449.anInt7744 = 0;
			Static141.anInt2885 = 0;
			Static513.anInt8659 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray9.length) {
					local48 = this.anIntArrayArray9[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local56]) != 0) {
							Static449.anInt7744 += this.anIntArray142[local56];
							Static513.anInt8659 += this.anIntArray139[local56];
							local24++;
							Static141.anInt2885 += this.anIntArray140[local56];
						}
					}
				}
			}
			if (local24 > 0) {
				Static449.anInt7744 = Static449.anInt7744 / local24 + arg2;
				Static332.aBoolean461 = true;
				Static513.anInt8659 = Static513.anInt8659 / local24 + arg3;
				Static141.anInt2885 = Static141.anInt2885 / local24 + arg4;
			} else {
				Static513.anInt8659 = arg3;
				Static449.anInt7744 = arg2;
				Static141.anInt2885 = arg4;
			}
			return;
		}
		@Pc(245) int[] local245;
		@Pc(247) int local247;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[1] * arg3 + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg7[3] * arg2 + arg3 * arg7[4] + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg3 * arg7[7] + arg7[6] * arg2 + 8192 >> 14;
				arg2 = local24;
				arg3 = local32;
				arg4 = local38;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray9.length > local32) {
					local245 = this.anIntArrayArray9[local32];
					for (local247 = 0; local247 < local245.length; local247++) {
						local50 = local245[local247];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local50]) != 0) {
							this.anIntArray142[local50] += arg2;
							this.anIntArray139[local50] += arg3;
							this.anIntArray140[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(376) int local376;
		@Pc(399) int local399;
		@Pc(426) int local426;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(465) int local465;
		@Pc(469) int local469;
		@Pc(477) int local477;
		@Pc(485) int local485;
		@Pc(640) int local640;
		@Pc(666) int local666;
		@Pc(670) int local670;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(687) int local687;
		@Pc(691) int local691;
		@Pc(693) int local693;
		@Pc(823) int[] local823;
		@Pc(825) int local825;
		@Pc(829) int local829;
		@Pc(833) int local833;
		@Pc(835) int local835;
		@Pc(966) int local966;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray9.length > local32) {
						local245 = this.anIntArrayArray9[local32];
						for (local247 = 0; local247 < local245.length; local247++) {
							local50 = local245[local247];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local50]) != 0) {
								this.anIntArray142[local50] -= Static449.anInt7744;
								this.anIntArray139[local50] -= Static513.anInt8659;
								this.anIntArray140[local50] -= Static141.anInt2885;
								if (arg4 != 0) {
									local56 = Class3_Sub13.anIntArray147[arg4];
									local376 = Class3_Sub13.anIntArray146[arg4];
									local399 = this.anIntArray142[local50] * local376 + local56 * this.anIntArray139[local50] + 16383 >> 14;
									this.anIntArray139[local50] = local376 * this.anIntArray139[local50] + 16383 - this.anIntArray142[local50] * local56 >> 14;
									this.anIntArray142[local50] = local399;
								}
								if (arg2 != 0) {
									local56 = Class3_Sub13.anIntArray147[arg2];
									local376 = Class3_Sub13.anIntArray146[arg2];
									local399 = local376 * this.anIntArray139[local50] + 16383 - this.anIntArray140[local50] * local56 >> 14;
									this.anIntArray140[local50] = this.anIntArray140[local50] * local376 + this.anIntArray139[local50] * local56 + 16383 >> 14;
									this.anIntArray139[local50] = local399;
								}
								if (arg3 != 0) {
									local56 = Class3_Sub13.anIntArray147[arg3];
									local376 = Class3_Sub13.anIntArray146[arg3];
									local399 = this.anIntArray142[local50] * local376 + local56 * this.anIntArray140[local50] + 16383 >> 14;
									this.anIntArray140[local50] = this.anIntArray140[local50] * local376 + 16383 - local56 * this.anIntArray142[local50] >> 14;
									this.anIntArray142[local50] = local399;
								}
								this.anIntArray142[local50] += Static449.anInt7744;
								this.anIntArray139[local50] += Static513.anInt8659;
								this.anIntArray140[local50] += Static141.anInt2885;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray9.length > local38) {
							local48 = this.anIntArrayArray9[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray24 == null || (this.aShortArray24[local56] & arg6) != 0) {
									local376 = this.anIntArray141[local56];
									local399 = this.anIntArray141[local56 + 1];
									for (local426 = local376; local426 < local399; local426++) {
										local457 = this.aShortArray29[local426] - 1;
										if (local457 == -1) {
											break;
										}
										if (arg4 != 0) {
											local461 = Class3_Sub13.anIntArray147[arg4];
											local465 = Class3_Sub13.anIntArray146[arg4];
											local469 = local461 * this.aShortArray21[local457] + this.aShortArray26[local457] * local465 + 16383 >> 14;
											this.aShortArray21[local457] = (short) (local465 * this.aShortArray21[local457] + 16383 - this.aShortArray26[local457] * local461 >> 14);
											this.aShortArray26[local457] = (short) local469;
										}
										if (arg2 != 0) {
											local461 = Class3_Sub13.anIntArray147[arg2];
											local465 = Class3_Sub13.anIntArray146[arg2];
											local469 = local465 * this.aShortArray21[local457] + 16383 - local461 * this.aShortArray23[local457] >> 14;
											this.aShortArray23[local457] = (short) (this.aShortArray23[local457] * local465 + this.aShortArray21[local457] * local461 + 16383 >> 14);
											this.aShortArray21[local457] = (short) local469;
										}
										if (arg3 != 0) {
											local461 = Class3_Sub13.anIntArray147[arg3];
											local465 = Class3_Sub13.anIntArray146[arg3];
											local469 = local465 * this.aShortArray26[local457] + local461 * this.aShortArray23[local457] + 16383 >> 14;
											this.aShortArray23[local457] = (short) (local465 * this.aShortArray23[local457] + 16383 - local461 * this.aShortArray26[local457] >> 14);
											this.aShortArray26[local457] = (short) local469;
										}
									}
								}
							}
						}
					}
					if (this.aClass313_6 == null && this.aClass313_5 != null) {
						this.aClass313_5.anInterface3_7 = null;
					}
					if (this.aClass313_6 != null) {
						this.aClass313_6.anInterface3_7 = null;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local247 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static332.aBoolean461) {
					local376 = Static141.anInt2885 * arg7[6] + arg7[0] * Static449.anInt7744 + Static513.anInt8659 * arg7[3] + 8192 >> 14;
					local399 = arg7[7] * Static141.anInt2885 + Static449.anInt7744 * arg7[1] + arg7[4] * Static513.anInt8659 + 8192 >> 14;
					local399 += local50;
					local426 = arg7[5] * Static513.anInt8659 + arg7[2] * Static449.anInt7744 + arg7[8] * Static141.anInt2885 + 8192 >> 14;
					local376 += local247;
					local426 += local56;
					Static449.anInt7744 = local376;
					Static513.anInt8659 = local399;
					Static332.aBoolean461 = false;
					Static141.anInt2885 = local426;
				}
				@Pc(445) int[] local445 = new int[9];
				local399 = Class3_Sub13.anIntArray146[arg2];
				local426 = Class3_Sub13.anIntArray147[arg2];
				local457 = Class3_Sub13.anIntArray146[arg3];
				local461 = Class3_Sub13.anIntArray147[arg3];
				local465 = Class3_Sub13.anIntArray146[arg4];
				local469 = Class3_Sub13.anIntArray147[arg4];
				local477 = local426 * local465 + 8192 >> 14;
				local485 = local469 * local426 + 8192 >> 14;
				local445[6] = -local461 * local465 + local457 * local485 + 8192 >> 14;
				local445[3] = local399 * local469 + 8192 >> 14;
				local445[1] = local461 * local477 + local469 * -local457 + 8192 >> 14;
				local445[5] = -local426;
				local445[8] = local457 * local399 + 8192 >> 14;
				local445[2] = local461 * local399 + 8192 >> 14;
				local445[4] = local399 * local465 + 8192 >> 14;
				local445[0] = local461 * local485 + local465 * local457 + 8192 >> 14;
				local445[7] = local477 * local457 + local469 * local461 + 8192 >> 14;
				@Pc(614) int local614 = local445[2] * -Static141.anInt2885 + local445[1] * -Static513.anInt8659 + local445[0] * -Static449.anInt7744 + 8192 >> 14;
				local640 = local445[3] * -Static449.anInt7744 + local445[4] * -Static513.anInt8659 + local445[5] * -Static141.anInt2885 + 8192 >> 14;
				local666 = -Static513.anInt8659 * local445[7] + local445[6] * -Static449.anInt7744 + local445[8] * -Static141.anInt2885 + 8192 >> 14;
				local670 = Static449.anInt7744 + local614;
				@Pc(674) int local674 = Static513.anInt8659 + local640;
				local678 = Static141.anInt2885 + local666;
				@Pc(681) int[] local681 = new int[9];
				for (local683 = 0; local683 < 3; local683++) {
					for (local687 = 0; local687 < 3; local687++) {
						local691 = 0;
						for (local693 = 0; local693 < 3; local693++) {
							local691 += local445[local683 * 3 + local693] * arg7[local687 * 3 + local693];
						}
						local681[local687 + local683 * 3] = local691 + 8192 >> 14;
					}
				}
				local687 = local56 * local445[2] + local50 * local445[1] + local247 * local445[0] + 8192 >> 14;
				local691 = local445[5] * local56 + local247 * local445[3] + local445[4] * local50 + 8192 >> 14;
				local687 += local670;
				local691 += local674;
				local693 = local445[6] * local247 + local445[7] * local50 + local445[8] * local56 + 8192 >> 14;
				local693 += local678;
				local823 = new int[9];
				for (local825 = 0; local825 < 3; local825++) {
					for (local829 = 0; local829 < 3; local829++) {
						local833 = 0;
						for (local835 = 0; local835 < 3; local835++) {
							local833 += arg7[local825 * 3 + local835] * local681[local829 + local835 * 3];
						}
						local823[local825 * 3 + local829] = local833 + 8192 >> 14;
					}
				}
				local829 = local691 * arg7[1] + local687 * arg7[0] + arg7[2] * local693 + 8192 >> 14;
				local833 = local691 * arg7[4] + arg7[3] * local687 + arg7[5] * local693 + 8192 >> 14;
				local833 += local32;
				local835 = arg7[6] * local687 + local691 * arg7[7] + local693 * arg7[8] + 8192 >> 14;
				local829 += local24;
				local835 += local38;
				for (local966 = 0; local966 < local8; local966++) {
					@Pc(972) int local972 = arg1[local966];
					if (local972 < this.anIntArrayArray9.length) {
						@Pc(982) int[] local982 = this.anIntArrayArray9[local972];
						for (@Pc(984) int local984 = 0; local984 < local982.length; local984++) {
							@Pc(990) int local990 = local982[local984];
							if (this.aShortArray24 == null || (this.aShortArray24[local990] & arg6) != 0) {
								@Pc(1031) int local1031 = this.anIntArray139[local990] * local823[1] + local823[0] * this.anIntArray142[local990] + this.anIntArray140[local990] * local823[2] + 8192 >> 14;
								@Pc(1062) int local1062 = local823[4] * this.anIntArray139[local990] + local823[3] * this.anIntArray142[local990] + local823[5] * this.anIntArray140[local990] + 8192 >> 14;
								@Pc(1094) int local1094 = local823[7] * this.anIntArray139[local990] + this.anIntArray142[local990] * local823[6] + this.anIntArray140[local990] * local823[8] + 8192 >> 14;
								@Pc(1098) int local1098 = local1062 + local833;
								@Pc(1102) int local1102 = local1031 + local829;
								this.anIntArray142[local990] = local1102;
								@Pc(1111) int local1111 = local1094 + local835;
								this.anIntArray139[local990] = local1098;
								this.anIntArray140[local990] = local1111;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2589) Class266 local2589;
			@Pc(2594) Class272 local2594;
			if (arg0 == 5) {
				if (this.anIntArrayArray7 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray7.length) {
							local245 = this.anIntArrayArray7[local32];
							for (local247 = 0; local247 < local245.length; local247++) {
								local50 = local245[local247];
								if (this.aShortArray30 == null || (this.aShortArray30[local50] & arg6) != 0) {
									local56 = arg2 * 8 + (this.aByteArray19[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray19[local50] = (byte) local56;
									if (this.aClass313_5 != null) {
										this.aClass313_5.anInterface3_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass266Array1 != null) {
						for (local32 = 0; local32 < this.anInt2124; local32++) {
							local2589 = this.aClass266Array1[local32];
							local2594 = this.aClass272Array1[local32];
							local2594.anInt7648 = 255 - (this.aByteArray19[local2589.anInt7566] & 0xFF) << 24 | local2594.anInt7648 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2841) Class272 local2841;
				if (arg0 == 8) {
					if (this.anIntArrayArray8 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray8.length) {
								local245 = this.anIntArrayArray8[local32];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2841 = this.aClass272Array1[local245[local247]];
									local2841.anInt7640 += arg2;
									local2841.anInt7647 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray8.length > local32) {
								local245 = this.anIntArrayArray8[local32];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2841 = this.aClass272Array1[local245[local247]];
									local2841.anInt7650 = local2841.anInt7650 * arg3 >> 7;
									local2841.anInt7642 = local2841.anInt7642 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray8.length > local32) {
							local245 = this.anIntArrayArray8[local32];
							for (local247 = 0; local247 < local245.length; local247++) {
								local2841 = this.aClass272Array1[local245[local247]];
								local2841.anInt7641 = local2841.anInt7641 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray7 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray7.length > local32) {
						local245 = this.anIntArrayArray7[local32];
						for (local247 = 0; local247 < local245.length; local247++) {
							local50 = local245[local247];
							if (this.aShortArray30 == null || (arg6 & this.aShortArray30[local50]) != 0) {
								local56 = this.aShortArray28[local50] & 0xFFFF;
								local376 = local56 >> 10 & 0x3F;
								local399 = local56 >> 7 & 0x7;
								local399 += arg3 / 4;
								local426 = local56 & 0x7F;
								@Pc(2702) int local2702 = arg2 + local376 & 0x3F;
								if (local399 < 0) {
									local399 = 0;
								} else if (local399 > 7) {
									local399 = 7;
								}
								local426 += arg4;
								if (local426 < 0) {
									local426 = 0;
								} else if (local426 > 127) {
									local426 = 127;
								}
								this.aShortArray28[local50] = (short) (local399 << 7 | local2702 << 10 | local426);
								if (this.aClass313_5 != null) {
									this.aClass313_5.anInterface3_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass266Array1 != null) {
					for (local32 = 0; local32 < this.anInt2124; local32++) {
						local2589 = this.aClass266Array1[local32];
						local2594 = this.aClass272Array1[local32];
						local2594.anInt7648 = local2594.anInt7648 & 0xFF000000 | Static205.anIntArray530[this.aShortArray28[local2589.anInt7566] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray9.length) {
					local245 = this.anIntArrayArray9[local32];
					for (local247 = 0; local247 < local245.length; local247++) {
						local50 = local245[local247];
						if (this.aShortArray24 == null || (this.aShortArray24[local50] & arg6) != 0) {
							this.anIntArray142[local50] -= Static449.anInt7744;
							this.anIntArray139[local50] -= Static513.anInt8659;
							this.anIntArray140[local50] -= Static141.anInt2885;
							this.anIntArray142[local50] = arg2 * this.anIntArray142[local50] >> 7;
							this.anIntArray139[local50] = this.anIntArray139[local50] * arg3 >> 7;
							this.anIntArray140[local50] = this.anIntArray140[local50] * arg4 >> 7;
							this.anIntArray142[local50] += Static449.anInt7744;
							this.anIntArray139[local50] += Static513.anInt8659;
							this.anIntArray140[local50] += Static141.anInt2885;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local247 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static332.aBoolean461) {
				local376 = arg7[3] * Static513.anInt8659 + Static449.anInt7744 * arg7[0] + arg7[6] * Static141.anInt2885 + 8192 >> 14;
				local399 = Static449.anInt7744 * arg7[1] + Static513.anInt8659 * arg7[4] + arg7[7] * Static141.anInt2885 + 8192 >> 14;
				local376 += local247;
				local399 += local50;
				local426 = Static449.anInt7744 * arg7[2] + Static513.anInt8659 * arg7[5] + Static141.anInt2885 * arg7[8] + 8192 >> 14;
				Static449.anInt7744 = local376;
				Static513.anInt8659 = local399;
				local426 += local56;
				Static332.aBoolean461 = false;
				Static141.anInt2885 = local426;
			}
			local376 = arg2 << 15 >> 7;
			local399 = arg3 << 15 >> 7;
			local426 = arg4 << 15 >> 7;
			local457 = local376 * -Static449.anInt7744 + 8192 >> 14;
			local461 = -Static513.anInt8659 * local399 + 8192 >> 14;
			local465 = -Static141.anInt2885 * local426 + 8192 >> 14;
			local469 = Static449.anInt7744 + local457;
			local477 = Static513.anInt8659 + local461;
			local485 = Static141.anInt2885 + local465;
			@Pc(2020) int[] local2020 = new int[] { arg7[0] * local376 + 8192 >> 14, local376 * arg7[3] + 8192 >> 14, arg7[6] * local376 + 8192 >> 14, local399 * arg7[1] + 8192 >> 14, local399 * arg7[4] + 8192 >> 14, arg7[7] * local399 + 8192 >> 14, arg7[2] * local426 + 8192 >> 14, arg7[5] * local426 + 8192 >> 14, local426 * arg7[8] + 8192 >> 14 };
			local640 = local376 * local247 + 8192 >> 14;
			local666 = local399 * local50 + 8192 >> 14;
			@Pc(2148) int local2148 = local666 + local477;
			local670 = local426 * local56 + 8192 >> 14;
			@Pc(2160) int local2160 = local640 + local469;
			@Pc(2164) int local2164 = local670 + local485;
			@Pc(2167) int[] local2167 = new int[9];
			@Pc(2173) int local2173;
			for (local678 = 0; local678 < 3; local678++) {
				for (local2173 = 0; local2173 < 3; local2173++) {
					local683 = 0;
					for (local687 = 0; local687 < 3; local687++) {
						local683 += arg7[local687 + local678 * 3] * local2020[local687 * 3 + local2173];
					}
					local2167[local678 * 3 + local2173] = local683 + 8192 >> 14;
				}
			}
			local2173 = local2160 * arg7[0] + local2148 * arg7[1] + arg7[2] * local2164 + 8192 >> 14;
			local683 = local2160 * arg7[3] + local2148 * arg7[4] + arg7[5] * local2164 + 8192 >> 14;
			local687 = arg7[7] * local2148 + arg7[6] * local2160 + local2164 * arg7[8] + 8192 >> 14;
			local683 += local32;
			local2173 += local24;
			local687 += local38;
			for (local691 = 0; local691 < local8; local691++) {
				local693 = arg1[local691];
				if (local693 < this.anIntArrayArray9.length) {
					local823 = this.anIntArrayArray9[local693];
					for (local825 = 0; local825 < local823.length; local825++) {
						local829 = local823[local825];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local829]) != 0) {
							local833 = local2167[2] * this.anIntArray140[local829] + local2167[0] * this.anIntArray142[local829] + local2167[1] * this.anIntArray139[local829] + 8192 >> 14;
							local835 = this.anIntArray139[local829] * local2167[4] + this.anIntArray142[local829] * local2167[3] + local2167[5] * this.anIntArray140[local829] + 8192 >> 14;
							@Pc(2413) int local2413 = local835 + local683;
							@Pc(2417) int local2417 = local833 + local2173;
							local966 = this.anIntArray142[local829] * local2167[6] + local2167[7] * this.anIntArray139[local829] + local2167[8] * this.anIntArray140[local829] + 8192 >> 14;
							@Pc(2454) int local2454 = local966 + local687;
							this.anIntArray142[local829] = local2417;
							this.anIntArray139[local829] = local2413;
							this.anIntArray140[local829] = local2454;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class75 method6805(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(25) Class75_Sub1 local25;
		@Pc(21) Class75_Sub1 local21;
		if (arg0 == 1) {
			local25 = this.aClass82_Sub1_10.aClass75_Sub1_3;
			local21 = this.aClass82_Sub1_10.aClass75_Sub1_6;
		} else if (arg0 == 2) {
			local25 = this.aClass82_Sub1_10.aClass75_Sub1_2;
			local21 = this.aClass82_Sub1_10.aClass75_Sub1_1;
		} else if (arg0 == 3) {
			local25 = this.aClass82_Sub1_10.aClass75_Sub1_4;
			local21 = this.aClass82_Sub1_10.aClass75_Sub1_10;
		} else if (arg0 == 4) {
			local21 = this.aClass82_Sub1_10.aClass75_Sub1_7;
			local25 = this.aClass82_Sub1_10.aClass75_Sub1_9;
		} else if (arg0 == 5) {
			local21 = this.aClass82_Sub1_10.aClass75_Sub1_5;
			local25 = this.aClass82_Sub1_10.aClass75_Sub1_8;
		} else {
			local25 = local21 = new Class75_Sub1(this.aClass82_Sub1_10);
		}
		return this.method1782(local21, arg2, local25, arg0 != 0, arg1);
	}

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean166) {
			this.method1783();
		}
		@Pc(16) int local16 = arg4 + this.aShort33;
		@Pc(21) int local21 = arg4 + this.aShort38;
		@Pc(27) int local27 = arg6 + this.aShort37;
		@Pc(32) int local32 = this.aShort40 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt8986 >> arg2.anInt8988 >= arg2.anInt8983 || local27 < 0 || arg2.anInt8986 + local32 >> arg2.anInt8988 >= arg2.anInt8985)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8983 <= local21 + arg3.anInt8986 >> arg3.anInt8988 || local27 < 0 || arg3.anInt8985 <= arg3.anInt8986 + local32 >> arg3.anInt8988) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8988;
			local21 = local21 + arg2.anInt8986 - 1 >> arg2.anInt8988;
			local27 >>= arg2.anInt8988;
			local32 = local32 + arg2.anInt8986 - 1 >> arg2.anInt8988;
			if (arg5 == arg2.method7724(local27, local16) && arg5 == arg2.method7724(local27, local21) && arg5 == arg2.method7724(local32, local16) && arg2.method7724(local32, local21) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt2157; local195++) {
				this.anIntArray139[local195] = this.anIntArray139[local195] + arg2.method7725(this.anIntArray142[local195] + arg4, arg6 + this.anIntArray140[local195]) - arg5;
			}
		} else {
			@Pc(242) int local242;
			@Pc(253) int local253;
			if (arg0 == 2) {
				@Pc(237) short local237 = this.aShort31;
				if (local237 == 0) {
					return;
				}
				for (local242 = 0; local242 < this.anInt2157; local242++) {
					local253 = (this.anIntArray139[local242] << 16) / local237;
					if (local253 < arg1) {
						this.anIntArray139[local242] -= -((arg1 - local253) * (arg2.method7725(this.anIntArray142[local242] - -arg4, this.anIntArray140[local242] - -arg6) - arg5) / arg1);
					}
				}
			} else {
				@Pc(340) int local340;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 4;
					local242 = (arg1 >> 8 & 0xFF) * 4;
					local253 = (arg1 >> 16 & 0xFF) << 6;
					local340 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg2.anInt8983 << arg2.anInt8988 <= (local195 >> 1) + arg4 + arg2.anInt8986 || arg6 - (local242 >> 1) < 0 || arg6 + (local242 >> 1) + arg2.anInt8986 >= arg2.anInt8985 << arg2.anInt8988) {
						return;
					}
					this.method6806(local242, local253, arg6, arg4, arg5, arg2, local195, local340);
				} else if (arg0 == 4) {
					local195 = this.aShort32 - this.aShort31;
					for (local242 = 0; local242 < this.anInt2157; local242++) {
						this.anIntArray139[local242] = this.anIntArray139[local242] + arg3.method7725(arg4 + this.anIntArray142[local242], arg6 + this.anIntArray140[local242]) + local195 - arg5;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort32 - this.aShort31;
					for (local242 = 0; local242 < this.anInt2157; local242++) {
						local253 = arg4 + this.anIntArray142[local242];
						local340 = arg6 + this.anIntArray140[local242];
						@Pc(494) int local494 = arg2.method7725(local253, local340);
						@Pc(500) int local500 = arg3.method7725(local253, local340);
						@Pc(506) int local506 = local494 - local500 - arg1;
						this.anIntArray139[local242] = (local506 * ((this.anIntArray139[local242] << 8) / local195) >> 8) - (arg5 - local494);
					}
				}
			}
		}
		if (this.aClass313_7 != null) {
			this.aClass313_7.anInterface3_7 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILclient!ih;ZII)Z")
	private boolean method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class31_Sub3 local8 = (Class31_Sub3) arg3;
		@Pc(12) Class31_Sub3 local12 = this.aClass82_Sub1_10.aClass31_Sub3_3;
		@Pc(33) float local33 = local12.aFloat189 + local8.aFloat189 * local12.aFloat186 + local8.aFloat183 * local12.aFloat190 + local12.aFloat187 * local8.aFloat188;
		@Pc(54) float local54 = local12.aFloat183 + local12.aFloat184 * local8.aFloat183 + local12.aFloat180 * local8.aFloat189 + local12.aFloat191 * local8.aFloat188;
		Static339.aFloat21 = local12.aFloat181 * local8.aFloat191 + local8.aFloat187 * local12.aFloat185 + local8.aFloat182 * local12.aFloat182;
		@Pc(93) float local93 = local8.aFloat188 * local12.aFloat182 + local12.aFloat181 * local8.aFloat183 + local12.aFloat185 * local8.aFloat189 + local12.aFloat188;
		Static518.aFloat166 = local8.aFloat185 * local12.aFloat182 + local12.aFloat181 * local8.aFloat180 + local8.aFloat186 * local12.aFloat185;
		Static608.aFloat196 = local8.aFloat185 * local12.aFloat187 + local12.aFloat190 * local8.aFloat180 + local8.aFloat186 * local12.aFloat186;
		Static432.aFloat148 = local12.aFloat186 * local8.aFloat187 + local8.aFloat191 * local12.aFloat190 + local8.aFloat182 * local12.aFloat187;
		Static143.aFloat64 = local12.aFloat191 * local8.aFloat185 + local8.aFloat180 * local12.aFloat184 + local8.aFloat186 * local12.aFloat180;
		Static26.aFloat6 = local8.aFloat182 * local12.aFloat191 + local12.aFloat184 * local8.aFloat191 + local12.aFloat180 * local8.aFloat187;
		Static148.aFloat69 = local8.aFloat190 * local12.aFloat186 + local8.aFloat184 * local12.aFloat190 + local12.aFloat187 * local8.aFloat181;
		Static637.aFloat194 = local12.aFloat181 * local8.aFloat184 + local8.aFloat190 * local12.aFloat185 + local12.aFloat182 * local8.aFloat181;
		Static218.aFloat115 = local12.aFloat191 * local8.aFloat181 + local8.aFloat190 * local12.aFloat180 + local8.aFloat184 * local12.aFloat184;
		@Pc(239) boolean local239 = false;
		@Pc(246) float local246 = Float.MAX_VALUE;
		@Pc(248) float local248 = -3.4028235E38F;
		@Pc(250) float local250 = Float.MAX_VALUE;
		@Pc(252) float local252 = -3.4028235E38F;
		@Pc(256) int local256 = this.aClass82_Sub1_10.anInt2482;
		@Pc(260) int local260 = this.aClass82_Sub1_10.anInt2489;
		if (!this.aBoolean166) {
			this.method1783();
		}
		@Pc(274) int local274 = this.aShort38 - this.aShort33 >> 1;
		@Pc(283) int local283 = this.aShort32 - this.aShort31 >> 1;
		@Pc(292) int local292 = this.aShort40 - this.aShort37 >> 1;
		@Pc(298) int local298 = this.aShort33 + local274;
		@Pc(304) int local304 = this.aShort31 + local283;
		@Pc(310) int local310 = this.aShort37 + local292;
		@Pc(317) int local317 = local298 - (local274 << arg2);
		@Pc(324) int local324 = local304 - (local283 << arg2);
		@Pc(331) int local331 = local310 - (local292 << arg2);
		@Pc(338) int local338 = local298 + (local274 << arg2);
		@Pc(344) int local344 = (local283 << arg2) + local304;
		Static73.anIntArray103[0] = local317;
		@Pc(354) int local354 = (local292 << arg2) + local310;
		Static532.anIntArray563[0] = local324;
		Static73.anIntArray103[1] = local338;
		Static209.anIntArray226[0] = local331;
		Static532.anIntArray563[1] = local324;
		Static209.anIntArray226[1] = local331;
		Static73.anIntArray103[2] = local317;
		Static532.anIntArray563[2] = local344;
		Static209.anIntArray226[2] = local331;
		Static73.anIntArray103[3] = local338;
		Static532.anIntArray563[3] = local344;
		Static73.anIntArray103[4] = local317;
		Static209.anIntArray226[3] = local331;
		Static532.anIntArray563[4] = local324;
		Static209.anIntArray226[4] = local354;
		Static73.anIntArray103[5] = local338;
		Static532.anIntArray563[5] = local324;
		Static209.anIntArray226[5] = local354;
		Static73.anIntArray103[6] = local317;
		Static532.anIntArray563[6] = local344;
		Static73.anIntArray103[7] = local338;
		Static209.anIntArray226[6] = local354;
		Static532.anIntArray563[7] = local344;
		Static209.anIntArray226[7] = local354;
		@Pc(479) float local479;
		@Pc(507) float local507;
		@Pc(493) float local493;
		@Pc(455) float local455;
		@Pc(465) float local465;
		@Pc(460) float local460;
		for (@Pc(448) int local448 = 0; local448 < 8; local448++) {
			local455 = (float) Static73.anIntArray103[local448];
			local460 = (float) Static209.anIntArray226[local448];
			local465 = (float) Static532.anIntArray563[local448];
			local479 = local33 + Static148.aFloat69 * local465 + Static608.aFloat196 * local455 + local460 * Static432.aFloat148;
			local493 = local465 * Static637.aFloat194 + Static518.aFloat166 * local455 + Static339.aFloat21 * local460 + local93;
			local507 = local455 * Static143.aFloat64 + local465 * Static218.aFloat115 + local460 * Static26.aFloat6 + local54;
			if (local493 >= (float) this.aClass82_Sub1_10.anInt2483) {
				if (arg0 > 0) {
					local493 = (float) arg0;
				}
				@Pc(531) float local531 = (float) this.aClass82_Sub1_10.anInt2496 + (float) local256 * local479 / local493;
				if (local531 > local248) {
					local248 = local531;
				}
				@Pc(549) float local549 = local507 * (float) local260 / local493 + (float) this.aClass82_Sub1_10.anInt2477;
				if (local246 > local531) {
					local246 = local531;
				}
				if (local250 > local549) {
					local250 = local549;
				}
				local239 = true;
				if (local252 < local549) {
					local252 = local549;
				}
			}
		}
		if (local239 && (float) arg1 > local246 && local248 > (float) arg1 && (float) arg5 > local250 && local252 > (float) arg5) {
			if (arg4) {
				return true;
			}
			if (this.aClass82_Sub1_10.anIntArray158.length < this.anInt2172) {
				this.aClass82_Sub1_10.anIntArray159 = new int[this.anInt2172];
				this.aClass82_Sub1_10.anIntArray158 = new int[this.anInt2172];
			}
			@Pc(628) int[] local628 = this.aClass82_Sub1_10.anIntArray158;
			@Pc(632) int[] local632 = this.aClass82_Sub1_10.anIntArray159;
			@Pc(708) int local708;
			for (@Pc(634) int local634 = 0; local634 < this.anInt2157; local634++) {
				local455 = (float) this.anIntArray142[local634];
				local460 = (float) this.anIntArray140[local634];
				local465 = (float) this.anIntArray139[local634];
				local493 = Static339.aFloat21 * local460 + Static637.aFloat194 * local465 + local455 * Static518.aFloat166 + local93;
				local507 = local54 + local455 * Static143.aFloat64 + local465 * Static218.aFloat115 + local460 * Static26.aFloat6;
				local479 = Static432.aFloat148 * local460 + Static148.aFloat69 * local465 + local455 * Static608.aFloat196 + local33;
				@Pc(715) int local715;
				@Pc(717) int local717;
				@Pc(726) int local726;
				if ((float) this.aClass82_Sub1_10.anInt2483 <= local493) {
					if (arg0 > 0) {
						local493 = (float) arg0;
					}
					local708 = (int) ((float) this.aClass82_Sub1_10.anInt2496 + local479 * (float) local256 / local493);
					local715 = (int) ((float) local260 * local507 / local493 + (float) this.aClass82_Sub1_10.anInt2477);
					local717 = this.anIntArray141[local634];
					local726 = this.anIntArray141[local634 + 1];
					for (@Pc(793) int local793 = local717; local793 < local726; local793++) {
						@Pc(802) int local802 = this.aShortArray29[local793] - 1;
						if (local802 == -1) {
							break;
						}
						local628[local802] = local708;
						local632[local802] = local715;
					}
				} else {
					local708 = this.anIntArray141[local634];
					local715 = this.anIntArray141[local634 + 1];
					for (local717 = local708; local717 < local715; local717++) {
						local726 = this.aShortArray29[local717] - 1;
						if (local726 == -1) {
							break;
						}
						local628[this.aShortArray29[local717] - 1] = -999999;
					}
				}
			}
			for (local708 = 0; local708 < this.anInt2128; local708++) {
				if (local628[this.aShortArray20[local708]] != -999999 && local628[this.aShortArray27[local708]] != -999999 && local628[this.aShortArray22[local708]] != -999999 && this.method1789(arg5, arg1, local632[this.aShortArray22[local708]], local628[this.aShortArray20[local708]], local628[this.aShortArray27[local708]], local632[this.aShortArray20[local708]], local628[this.aShortArray22[local708]], local632[this.aShortArray27[local708]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dn", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub13.anIntArray147[arg0];
		@Pc(13) int local13 = Class3_Sub13.anIntArray146[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2157; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray142[local15] + this.anIntArray139[local15] * local9 >> 14;
			this.anIntArray139[local15] = this.anIntArray139[local15] * local13 - local9 * this.anIntArray142[local15] >> 14;
			this.anIntArray142[local15] = local33;
		}
		if (this.aClass313_7 != null) {
			this.aClass313_7.anInterface3_7 = null;
		}
		this.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method6797(@OriginalArg(0) Class31 arg0) {
		@Pc(8) Class31_Sub3 local8 = (Class31_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass228Array1 != null) {
			for (local13 = 0; local13 < this.aClass228Array1.length; local13++) {
				@Pc(20) Class228 local20 = this.aClass228Array1[local13];
				@Pc(22) Class228 local22 = local20;
				if (local20.aClass228_2 != null) {
					local22 = local20.aClass228_2;
				}
				local22.anInt6684 = (int) ((float) this.anIntArray139[local20.anInt6691] * local8.aFloat190 + (float) this.anIntArray142[local20.anInt6691] * local8.aFloat186 + (float) this.anIntArray140[local20.anInt6691] * local8.aFloat187 + local8.aFloat189);
				local22.anInt6696 = (int) (local8.aFloat183 + (float) this.anIntArray142[local20.anInt6691] * local8.aFloat180 + (float) this.anIntArray139[local20.anInt6691] * local8.aFloat184 + (float) this.anIntArray140[local20.anInt6691] * local8.aFloat191);
				local22.anInt6686 = (int) (local8.aFloat188 + local8.aFloat181 * (float) this.anIntArray139[local20.anInt6691] + (float) this.anIntArray142[local20.anInt6691] * local8.aFloat185 + (float) this.anIntArray140[local20.anInt6691] * local8.aFloat182);
				local22.anInt6690 = (int) (local8.aFloat189 + (float) this.anIntArray140[local20.anInt6698] * local8.aFloat187 + local8.aFloat190 * (float) this.anIntArray139[local20.anInt6698] + (float) this.anIntArray142[local20.anInt6698] * local8.aFloat186);
				local22.anInt6694 = (int) ((float) this.anIntArray142[local20.anInt6698] * local8.aFloat180 + (float) this.anIntArray139[local20.anInt6698] * local8.aFloat184 + local8.aFloat191 * (float) this.anIntArray140[local20.anInt6698] + local8.aFloat183);
				local22.anInt6700 = (int) ((float) this.anIntArray139[local20.anInt6698] * local8.aFloat181 + (float) this.anIntArray142[local20.anInt6698] * local8.aFloat185 + (float) this.anIntArray140[local20.anInt6698] * local8.aFloat182 + local8.aFloat188);
				local22.anInt6693 = (int) (local8.aFloat187 * (float) this.anIntArray140[local20.anInt6685] + (float) this.anIntArray142[local20.anInt6685] * local8.aFloat186 + (float) this.anIntArray139[local20.anInt6685] * local8.aFloat190 + local8.aFloat189);
				local22.anInt6699 = (int) (local8.aFloat183 + local8.aFloat184 * (float) this.anIntArray139[local20.anInt6685] + local8.aFloat180 * (float) this.anIntArray142[local20.anInt6685] + (float) this.anIntArray140[local20.anInt6685] * local8.aFloat191);
				local22.anInt6687 = (int) ((float) this.anIntArray142[local20.anInt6685] * local8.aFloat185 + (float) this.anIntArray139[local20.anInt6685] * local8.aFloat181 + (float) this.anIntArray140[local20.anInt6685] * local8.aFloat182 + local8.aFloat188);
			}
		}
		if (this.aClass232Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass232Array1.length; local13++) {
			@Pc(361) Class232 local361 = this.aClass232Array1[local13];
			@Pc(363) Class232 local363 = local361;
			if (local361.aClass232_2 != null) {
				local363 = local361.aClass232_2;
			}
			if (local361.aClass31_26 == null) {
				local361.aClass31_26 = local8.method7931();
			} else {
				local361.aClass31_26.method7934(local8);
			}
			local363.anInt6733 = (int) ((float) this.anIntArray142[local361.anInt6734] * local8.aFloat186 + (float) this.anIntArray139[local361.anInt6734] * local8.aFloat190 + local8.aFloat187 * (float) this.anIntArray140[local361.anInt6734] + local8.aFloat189);
			local363.anInt6729 = (int) ((float) this.anIntArray139[local361.anInt6734] * local8.aFloat184 + (float) this.anIntArray142[local361.anInt6734] * local8.aFloat180 + local8.aFloat191 * (float) this.anIntArray140[local361.anInt6734] + local8.aFloat183);
			local363.anInt6731 = (int) (local8.aFloat188 + (float) this.anIntArray140[local361.anInt6734] * local8.aFloat182 + (float) this.anIntArray139[local361.anInt6734] * local8.aFloat181 + (float) this.anIntArray142[local361.anInt6734] * local8.aFloat185);
		}
	}

	@OriginalMember(owner = "client!dn", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean166) {
			this.method1783();
		}
		return this.aShort37;
	}

	@OriginalMember(owner = "client!dn", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub7_Sub17 ba(@OriginalArg(0) Class3_Sub7_Sub17 arg0) {
		if (this.anInt2172 == 0) {
			return null;
		}
		if (!this.aBoolean166) {
			this.method1783();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass82_Sub1_10.anInt2490 > 0) {
			local40 = this.aShort33 - (this.aShort32 * this.aClass82_Sub1_10.anInt2490 >> 8) >> this.aClass82_Sub1_10.anInt2464;
			local57 = this.aShort38 - (this.aClass82_Sub1_10.anInt2490 * this.aShort31 >> 8) >> this.aClass82_Sub1_10.anInt2464;
		} else {
			local40 = this.aShort33 - (this.aShort31 * this.aClass82_Sub1_10.anInt2490 >> 8) >> this.aClass82_Sub1_10.anInt2464;
			local57 = this.aShort38 - (this.aClass82_Sub1_10.anInt2490 * this.aShort32 >> 8) >> this.aClass82_Sub1_10.anInt2464;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass82_Sub1_10.anInt2498 <= 0) {
			local114 = this.aShort37 - (this.aClass82_Sub1_10.anInt2498 * this.aShort31 >> 8) >> this.aClass82_Sub1_10.anInt2464;
			local131 = this.aShort40 - (this.aClass82_Sub1_10.anInt2498 * this.aShort32 >> 8) >> this.aClass82_Sub1_10.anInt2464;
		} else {
			local114 = this.aShort37 - (this.aShort32 * this.aClass82_Sub1_10.anInt2498 >> 8) >> this.aClass82_Sub1_10.anInt2464;
			local131 = this.aShort40 - (this.aClass82_Sub1_10.anInt2498 * this.aShort31 >> 8) >> this.aClass82_Sub1_10.anInt2464;
		}
		@Pc(171) int local171 = local57 + 1 - local40;
		@Pc(177) int local177 = local131 + 1 - local114;
		@Pc(180) Class3_Sub7_Sub17_Sub2 local180 = (Class3_Sub7_Sub17_Sub2) arg0;
		@Pc(196) Class3_Sub7_Sub17_Sub2 local196;
		if (local180 != null && local180.method6556(local171, local177)) {
			local196 = local180;
			local180.method6559();
		} else {
			local196 = new Class3_Sub7_Sub17_Sub2(this.aClass82_Sub1_10, local171, local177);
		}
		local196.method6561(local57, local131, local40, local114);
		this.method1792(local196);
		return local196;
	}

	@OriginalMember(owner = "client!dn", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2157; local3++) {
			if (arg0 != 0) {
				this.anIntArray142[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray139[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray140[local3] += arg2;
			}
		}
		if (this.aClass313_7 != null) {
			this.aClass313_7.anInterface3_7 = null;
		}
		this.aBoolean166 = false;
	}
}
