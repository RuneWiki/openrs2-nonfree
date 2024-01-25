import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!b", name = "r", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "[Lclient!oea;")
	private Class261[] aClass261Array1;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "[F")
	private float[] aFloatArray21;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!b", name = "K", descriptor = "Lclient!nc;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!b", name = "N", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!b", name = "U", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!b", name = "W", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "Lclient!is;")
	private Class183 aClass183_1;

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!b", name = "kb", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!b", name = "nb", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!b", name = "tb", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!b", name = "ub", descriptor = "B")
	private byte aByte20;

	@OriginalMember(owner = "client!b", name = "vb", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!b", name = "xb", descriptor = "[F")
	private float[] aFloatArray22;

	@OriginalMember(owner = "client!b", name = "zb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!b", name = "Fb", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!b", name = "Kb", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!b", name = "Lb", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!b", name = "Nb", descriptor = "[Lclient!uq;")
	private Class365[] aClass365Array1;

	@OriginalMember(owner = "client!b", name = "Rb", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!b", name = "Ub", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!b", name = "Vb", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!b", name = "Wb", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!b", name = "cc", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!b", name = "fc", descriptor = "Lclient!wfa;")
	private Interface26 anInterface26_1;

	@OriginalMember(owner = "client!b", name = "gc", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!b", name = "ic", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!b", name = "lc", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!b", name = "nc", descriptor = "[I")
	private int[] anIntArray33;

	@OriginalMember(owner = "client!b", name = "qc", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!b", name = "rc", descriptor = "[Lclient!eha;")
	private Class101[] aClass101Array1;

	@OriginalMember(owner = "client!b", name = "wc", descriptor = "[Lclient!qr;")
	private Class298[] aClass298Array1;

	@OriginalMember(owner = "client!b", name = "xc", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!b", name = "zc", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!b", name = "Ac", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!b", name = "Bc", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!b", name = "Dc", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!b", name = "Gc", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	private int anInt956 = 0;

	@OriginalMember(owner = "client!b", name = "Sb", descriptor = "I")
	private int anInt1000 = 0;

	@OriginalMember(owner = "client!b", name = "Xb", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "Z")
	private boolean aBoolean92 = true;

	@OriginalMember(owner = "client!b", name = "Pb", descriptor = "I")
	private int anInt998 = 0;

	@OriginalMember(owner = "client!b", name = "pc", descriptor = "I")
	private int anInt1010 = 0;

	@OriginalMember(owner = "client!b", name = "Jb", descriptor = "I")
	private int anInt995 = 0;

	@OriginalMember(owner = "client!b", name = "kc", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!b", name = "Zb", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_4;

	@OriginalMember(owner = "client!b", name = "hc", descriptor = "Lclient!nba;")
	private Class243 aClass243_4;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "Lclient!nba;")
	private Class243 aClass243_1;

	@OriginalMember(owner = "client!b", name = "Ob", descriptor = "Lclient!nba;")
	private Class243 aClass243_3;

	@OriginalMember(owner = "client!b", name = "Ib", descriptor = "Lclient!nba;")
	private Class243 aClass243_2;

	@OriginalMember(owner = "client!b", name = "sb", descriptor = "Lclient!jc;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class28_Sub1(@OriginalArg(0) Class16_Sub2 arg0) {
		this.aClass16_Sub2_4 = arg0;
		this.aClass243_4 = new Class243((Interface26) null, 5126, 3, 0);
		this.aClass243_1 = new Class243((Interface26) null, 5126, 2, 0);
		this.aClass243_3 = new Class243((Interface26) null, 5126, 3, 0);
		this.aClass243_2 = new Class243((Interface26) null, 5121, 4, 0);
		this.aClass187_1 = new Class187();
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!hk;Lclient!dc;IIII)V")
	public Class28_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt996 = arg2;
		this.aClass16_Sub2_4 = arg0;
		this.anInt1016 = arg5;
		if (Static433.method6369(arg5, arg2)) {
			this.aClass243_4 = new Class243((Interface26) null, 5126, 3, 0);
		}
		if (Static164.method2757(arg2, arg5)) {
			this.aClass243_1 = new Class243((Interface26) null, 5126, 2, 0);
		}
		if (Static81.method1704(arg2, arg5)) {
			this.aClass243_3 = new Class243((Interface26) null, 5126, 3, 0);
		}
		if (Static473.method6806(arg5, arg2)) {
			this.aClass243_2 = new Class243((Interface26) null, 5121, 4, 0);
		}
		if (Static557.method7624(arg5, arg2)) {
			this.aClass187_1 = new Class187();
		}
		@Pc(108) Interface5 local108 = arg0.anInterface5_12;
		@Pc(112) int[] local112 = new int[arg1.anInt2040];
		this.anIntArray29 = new int[arg1.anInt2038 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt2040; local121++) {
			if (arg1.aByteArray11 == null || arg1.aByteArray11[local121] != 2) {
				if (arg1.aShortArray29 != null && arg1.aShortArray29[local121] != -1) {
					@Pc(153) Class342 local153 = local108.method5193(arg1.aShortArray29[local121] & 0xFFFF);
					if (((this.anInt1016 & 0x40) == 0 || !local153.aBoolean693) && local153.aBoolean690) {
						continue;
					}
				}
				local112[this.anInt1000++] = local121;
				this.anIntArray29[arg1.aShortArray27[local121]]++;
				this.anIntArray29[arg1.aShortArray35[local121]]++;
				this.anIntArray29[arg1.aShortArray33[local121]]++;
			}
		}
		this.anInt998 = this.anInt1000;
		@Pc(226) long[] local226 = new long[this.anInt1000];
		@Pc(238) boolean local238 = (this.anInt996 & 0x100) != 0;
		@Pc(250) int local250;
		@Pc(263) int local263;
		@Pc(439) int local439;
		for (@Pc(240) int local240 = 0; local240 < this.anInt1000; local240++) {
			@Pc(246) int local246 = local112[local240];
			@Pc(248) Class342 local248 = null;
			local250 = 0;
			@Pc(252) byte local252 = 0;
			@Pc(254) byte local254 = 0;
			@Pc(256) byte local256 = 0;
			if (arg1.aClass151Array1 != null) {
				@Pc(261) boolean local261 = false;
				for (local263 = 0; local263 < arg1.aClass151Array1.length; local263++) {
					@Pc(270) Class151 local270 = arg1.aClass151Array1[local263];
					if (local270.anInt3833 == local246) {
						@Pc(279) Class354 local279 = Static248.method3941(local270.anInt3835);
						if (local279.aBoolean706) {
							local261 = true;
						}
						if (local279.anInt9478 != -1) {
							@Pc(295) Class342 local295 = local108.method5193(local279.anInt9478);
							if (local295.anInt9280 == 2) {
								this.aBoolean95 = true;
							}
						}
					}
				}
				if (local261) {
					local226[local240] = Long.MAX_VALUE;
					this.anInt998--;
					continue;
				}
			}
			@Pc(330) short local330 = -1;
			if (arg1.aShortArray29 != null) {
				local330 = arg1.aShortArray29[local246];
				if (local330 != -1) {
					local248 = local108.method5193(local330 & 0xFFFF);
					if ((this.anInt1016 & 0x40) != 0 && local248.aBoolean693) {
						local330 = -1;
						local248 = null;
					} else {
						local256 = local248.aByte128;
						if (local248.aByte130 != 0 || local248.aByte127 != 0) {
							this.aBoolean94 = true;
						}
						local254 = local248.aByte129;
					}
				}
			}
			@Pc(401) boolean local401 = arg1.aByteArray10 != null && arg1.aByteArray10[local246] != 0 || local248 != null && local248.anInt9280 != 0;
			if ((local238 || local401) && arg1.aByteArray13 != null) {
				local250 += arg1.aByteArray13[local246] << 17;
			}
			if (local401) {
				local250 += 65536;
			}
			local250 += (local254 & 0xFF) << 8;
			local439 = local252 + ((local330 & 0xFFFF) << 16);
			local250 += local256 & 0xFF;
			@Pc(451) int local451 = local439 + (local240 & 0xFFFF);
			local226[local240] = ((long) local250 << 32) + ((long) local451);
			this.aBoolean95 |= local401;
			this.aBoolean94 |= local248 != null && (local248.aByte130 != 0 || local248.aByte127 != 0);
		}
		Static314.method4936(local112, local226);
		this.anInt995 = arg1.anInt2038;
		this.anIntArray30 = arg1.anIntArray133;
		this.anIntArray28 = arg1.anIntArray131;
		this.anInt956 = arg1.anInt2046;
		this.aShortArray15 = arg1.aShortArray30;
		this.anIntArray31 = arg1.anIntArray135;
		this.aClass298Array1 = arg1.aClass298Array2;
		@Pc(525) Class238[] local525 = new Class238[this.anInt995];
		this.aClass261Array1 = arg1.aClass261Array2;
		@Pc(549) int local549;
		@Pc(563) int local563;
		@Pc(601) int local601;
		if (arg1.aClass151Array1 != null) {
			this.anInt985 = arg1.aClass151Array1.length;
			this.aClass101Array1 = new Class101[this.anInt985];
			this.aClass365Array1 = new Class365[this.anInt985];
			for (local549 = 0; local549 < this.anInt985; local549++) {
				@Pc(556) Class151 local556 = arg1.aClass151Array1[local549];
				@Pc(561) Class354 local561 = Static248.method3941(local556.anInt3835);
				local563 = -1;
				for (@Pc(565) int local565 = 0; local565 < this.anInt1000; local565++) {
					if (local112[local565] == local556.anInt3833) {
						local563 = local565;
						break;
					}
				}
				if (local563 == -1) {
					throw new RuntimeException();
				}
				local601 = Static274.anIntArray337[arg1.aShortArray34[local556.anInt3833] & 0xFFFF] & 0xFFFFFF;
				@Pc(618) int local618 = local601 | 255 - (arg1.aByteArray10 == null ? 0 : arg1.aByteArray10[local556.anInt3833]) << 24;
				this.aClass101Array1[local549] = new Class101(local563, arg1.aShortArray27[local556.anInt3833], arg1.aShortArray35[local556.anInt3833], arg1.aShortArray33[local556.anInt3833], local561.anInt9477, local561.anInt9475, local561.anInt9478, local561.anInt9474, local561.anInt9476, local561.aBoolean706, local561.aBoolean707, local556.anInt3834);
				this.aClass365Array1[local549] = new Class365(local618);
			}
		}
		local549 = this.anInt1000 * 3;
		this.aFloatArray21 = new float[local549];
		this.aByteArray4 = new byte[this.anInt1000];
		this.aShortArray12 = new short[local549];
		this.aShortArray19 = new short[this.anInt1000];
		this.aShort18 = (short) arg4;
		this.aShortArray17 = new short[this.anInt1000];
		this.aShortArray13 = new short[this.anInt1000];
		this.aShortArray21 = new short[local549];
		this.aShort19 = (short) arg3;
		Static241.aLongArray8 = new long[local549];
		this.aShortArray14 = new short[this.anInt1000];
		this.aFloatArray22 = new float[local549];
		if (arg1.aShortArray28 != null) {
			this.aShortArray16 = new short[this.anInt1000];
		}
		this.aShortArray11 = new short[local549];
		this.aShortArray18 = new short[this.anInt1000];
		this.aShortArray20 = new short[local549];
		this.aByteArray3 = new byte[local549];
		local250 = 0;
		for (local439 = 0; local439 < arg1.anInt2038; local439++) {
			local563 = this.anIntArray29[local439];
			this.anIntArray29[local439] = local250;
			local525[local439] = new Class238();
			local250 += local563;
		}
		this.anIntArray29[arg1.anInt2038] = local250;
		@Pc(800) Class348 local800 = Static555.method7594(local112, this.anInt1000, arg1);
		@Pc(804) Class307[] local804 = new Class307[arg1.anInt2040];
		@Pc(845) int local845;
		@Pc(855) int local855;
		@Pc(877) int local877;
		@Pc(888) int local888;
		@Pc(897) int local897;
		@Pc(906) int local906;
		@Pc(823) short local823;
		@Pc(834) int local834;
		for (local601 = 0; local601 < arg1.anInt2040; local601++) {
			@Pc(813) short local813 = arg1.aShortArray27[local601];
			@Pc(818) short local818 = arg1.aShortArray35[local601];
			local823 = arg1.aShortArray33[local601];
			local834 = this.anIntArray30[local818] - this.anIntArray30[local813];
			local845 = this.anIntArray31[local818] - this.anIntArray31[local813];
			local855 = this.anIntArray28[local818] - this.anIntArray28[local813];
			@Pc(866) int local866 = this.anIntArray30[local823] - this.anIntArray30[local813];
			local877 = this.anIntArray31[local823] - this.anIntArray31[local813];
			local888 = this.anIntArray28[local823] - this.anIntArray28[local813];
			local897 = local845 * local888 - local855 * local877;
			local906 = local866 * local855 - local888 * local834;
			@Pc(915) int local915;
			for (local915 = local834 * local877 - local866 * local845; local897 > 8192 || local906 > 8192 || local915 > 8192 || local897 < -8192 || local906 < -8192 || local915 < -8192; local915 >>= 0x1) {
				local906 >>= 0x1;
				local897 >>= 0x1;
			}
			@Pc(972) int local972 = (int) Math.sqrt((double) (local906 * local906 + local897 * local897 + local915 * local915));
			if (local972 <= 0) {
				local972 = 1;
			}
			local897 = local897 * 256 / local972;
			local906 = local906 * 256 / local972;
			local915 = local915 * 256 / local972;
			@Pc(1004) byte local1004 = arg1.aByteArray11 == null ? 0 : arg1.aByteArray11[local601];
			if (local1004 == 0) {
				@Pc(1013) Class238 local1013 = local525[local813];
				local1013.anInt6642++;
				local1013.anInt6643 += local897;
				local1013.anInt6645 += local906;
				local1013.anInt6641 += local915;
				@Pc(1041) Class238 local1041 = local525[local818];
				local1041.anInt6645 += local906;
				local1041.anInt6642++;
				local1041.anInt6641 += local915;
				local1041.anInt6643 += local897;
				@Pc(1069) Class238 local1069 = local525[local823];
				local1069.anInt6643 += local897;
				local1069.anInt6645 += local906;
				local1069.anInt6641 += local915;
				local1069.anInt6642++;
			} else if (local1004 == 1) {
				@Pc(1108) Class307 local1108 = local804[local601] = new Class307();
				local1108.anInt8593 = local906;
				local1108.anInt8590 = local915;
				local1108.anInt8591 = local897;
			}
		}
		@Pc(1134) int local1134;
		@Pc(1177) short local1177;
		for (local263 = 0; local263 < this.anInt1000; local263++) {
			local1134 = local112[local263];
			@Pc(1141) int local1141 = arg1.aShortArray34[local1134] & 0xFFFF;
			if (arg1.aByteArray12 == null) {
				local834 = -1;
			} else {
				local834 = arg1.aByteArray12[local1134];
			}
			if (arg1.aByteArray10 == null) {
				local845 = 0;
			} else {
				local845 = arg1.aByteArray10[local1134] & 0xFF;
			}
			local1177 = arg1.aShortArray29 == null ? -1 : arg1.aShortArray29[local1134];
			if (local1177 != -1 && (this.anInt1016 & 0x40) != 0) {
				@Pc(1195) Class342 local1195 = local108.method5193(local1177 & 0xFFFF);
				if (local1195.aBoolean693) {
					local1177 = -1;
				}
			}
			@Pc(1202) float local1202 = 0.0F;
			@Pc(1204) float local1204 = 0.0F;
			@Pc(1206) float local1206 = 0.0F;
			@Pc(1208) float local1208 = 0.0F;
			@Pc(1210) float local1210 = 0.0F;
			@Pc(1212) float local1212 = 0.0F;
			@Pc(1214) byte local1214 = 0;
			@Pc(1216) byte local1216 = 0;
			@Pc(1218) int local1218 = 0;
			@Pc(1234) byte local1234;
			@Pc(1254) short local1254;
			@Pc(2043) short local2043;
			@Pc(2048) short local2048;
			if (local1177 != -1) {
				if (local834 == -1) {
					local1216 = 2;
					local1204 = 1.0F;
					local1202 = 0.0F;
					local1206 = 1.0F;
					local1214 = 1;
					local1208 = 1.0F;
					local1210 = 0.0F;
					local1212 = 0.0F;
				} else {
					local834 &= 0xFF;
					local1234 = arg1.aByteArray14[local834];
					@Pc(1244) short local1244;
					@Pc(1249) short local1249;
					@Pc(1287) float local1287;
					@Pc(1298) float local1298;
					@Pc(1392) float local1392;
					@Pc(1624) float local1624;
					@Pc(1632) float local1632;
					@Pc(1640) float local1640;
					@Pc(1663) float local1663;
					@Pc(1686) float local1686;
					@Pc(1709) float local1709;
					if (local1234 == 0) {
						local1244 = arg1.aShortArray27[local1134];
						local1249 = arg1.aShortArray35[local1134];
						local1254 = arg1.aShortArray33[local1134];
						local2043 = arg1.aShortArray36[local834];
						local2048 = arg1.aShortArray32[local834];
						@Pc(2053) short local2053 = arg1.aShortArray31[local834];
						@Pc(2059) float local2059 = (float) arg1.anIntArray133[local2043];
						@Pc(2065) float local2065 = (float) arg1.anIntArray135[local2043];
						local1287 = (float) arg1.anIntArray131[local2043];
						local1298 = (float) arg1.anIntArray133[local2048] - local2059;
						local1392 = (float) arg1.anIntArray135[local2048] - local2065;
						@Pc(2097) float local2097 = (float) arg1.anIntArray131[local2048] - local1287;
						@Pc(2106) float local2106 = (float) arg1.anIntArray133[local2053] - local2059;
						@Pc(2114) float local2114 = (float) arg1.anIntArray135[local2053] - local2065;
						@Pc(2122) float local2122 = (float) arg1.anIntArray131[local2053] - local1287;
						@Pc(2130) float local2130 = (float) arg1.anIntArray133[local1244] - local2059;
						@Pc(2138) float local2138 = (float) arg1.anIntArray135[local1244] - local2065;
						@Pc(2146) float local2146 = (float) arg1.anIntArray131[local1244] - local1287;
						@Pc(2155) float local2155 = (float) arg1.anIntArray133[local1249] - local2059;
						@Pc(2164) float local2164 = (float) arg1.anIntArray135[local1249] - local2065;
						local1624 = (float) arg1.anIntArray131[local1249] - local1287;
						local1632 = (float) arg1.anIntArray133[local1254] - local2059;
						local1640 = (float) arg1.anIntArray135[local1254] - local2065;
						local1663 = (float) arg1.anIntArray131[local1254] - local1287;
						local1686 = local2122 * local1392 - local2097 * local2114;
						local1709 = local2106 * local2097 - local1298 * local2122;
						@Pc(2224) float local2224 = local1298 * local2114 - local2106 * local1392;
						@Pc(2232) float local2232 = local2224 * local2114 - local2122 * local1709;
						@Pc(2240) float local2240 = local1686 * local2122 - local2106 * local2224;
						@Pc(2249) float local2249 = local1709 * local2106 - local1686 * local2114;
						@Pc(2263) float local2263 = 1.0F / (local2240 * local1392 + local1298 * local2232 + local2097 * local2249);
						local1206 = local2263 * (local2164 * local2240 + local2232 * local2155 + local1624 * local2249);
						local1202 = local2263 * (local2240 * local2138 + local2232 * local2130 + local2146 * local2249);
						local1210 = local2263 * (local2249 * local1663 + local1640 * local2240 + local1632 * local2232);
						@Pc(2313) float local2313 = local1709 * local1298 - local1686 * local1392;
						@Pc(2321) float local2321 = local1686 * local2097 - local2224 * local1298;
						@Pc(2330) float local2330 = local1392 * local2224 - local2097 * local1709;
						@Pc(2344) float local2344 = 1.0F / (local2313 * local2122 + local2106 * local2330 + local2114 * local2321);
						local1212 = local2344 * (local1663 * local2313 + local1640 * local2321 + local1632 * local2330);
						local1208 = local2344 * (local1624 * local2313 + local2321 * local2164 + local2330 * local2155);
						local1204 = local2344 * (local2130 * local2330 + local2321 * local2138 + local2146 * local2313);
					} else {
						local1244 = arg1.aShortArray27[local1134];
						local1249 = arg1.aShortArray35[local1134];
						local1254 = arg1.aShortArray33[local1134];
						@Pc(1259) int local1259 = local800.anIntArray607[local834];
						@Pc(1264) int local1264 = local800.anIntArray605[local834];
						@Pc(1269) int local1269 = local800.anIntArray606[local834];
						@Pc(1274) float[] local1274 = local800.aFloatArrayArray15[local834];
						@Pc(1279) byte local1279 = arg1.aByteArray15[local834];
						local1287 = (float) arg1.anIntArray130[local834] / 256.0F;
						if (local1234 == 1) {
							local1298 = (float) arg1.anIntArray136[local834] / 1024.0F;
							Static420.method5995(local1269, local1264, arg1.anIntArray131[local1244], arg1.anIntArray133[local1244], local1298, local1259, arg1.anIntArray135[local1244], local1287, Static421.aFloatArray51, local1279, local1274);
							local1202 = Static421.aFloatArray51[0];
							local1204 = Static421.aFloatArray51[1];
							Static420.method5995(local1269, local1264, arg1.anIntArray131[local1249], arg1.anIntArray133[local1249], local1298, local1259, arg1.anIntArray135[local1249], local1287, Static421.aFloatArray51, local1279, local1274);
							local1206 = Static421.aFloatArray51[0];
							local1208 = Static421.aFloatArray51[1];
							Static420.method5995(local1269, local1264, arg1.anIntArray131[local1254], arg1.anIntArray133[local1254], local1298, local1259, arg1.anIntArray135[local1254], local1287, Static421.aFloatArray51, local1279, local1274);
							local1212 = Static421.aFloatArray51[1];
							local1210 = Static421.aFloatArray51[0];
							local1392 = local1298 / 2.0F;
							if ((local1279 & 0x1) == 0) {
								if (local1392 < local1210 - local1202) {
									local1210 -= local1298;
									local1216 = 1;
								} else if (local1202 - local1210 > local1392) {
									local1210 += local1298;
									local1216 = 2;
								}
								if (local1392 < local1206 - local1202) {
									local1206 -= local1298;
									local1214 = 1;
								} else if (local1392 < local1202 - local1206) {
									local1206 += local1298;
									local1214 = 2;
								}
							} else {
								if (local1392 < local1208 - local1204) {
									local1214 = 1;
									local1208 -= local1298;
								} else if (local1392 < local1204 - local1208) {
									local1208 += local1298;
									local1214 = 2;
								}
								if (local1392 < local1212 - local1204) {
									local1212 -= local1298;
									local1216 = 1;
								} else if (local1204 - local1212 > local1392) {
									local1212 += local1298;
									local1216 = 2;
								}
							}
						} else if (local1234 == 2) {
							local1298 = (float) arg1.anIntArray132[local834] / 256.0F;
							local1392 = (float) arg1.anIntArray128[local834] / 256.0F;
							@Pc(1537) int local1537 = arg1.anIntArray133[local1249] - arg1.anIntArray133[local1244];
							@Pc(1548) int local1548 = arg1.anIntArray135[local1249] - arg1.anIntArray135[local1244];
							@Pc(1559) int local1559 = arg1.anIntArray131[local1249] - arg1.anIntArray131[local1244];
							@Pc(1569) int local1569 = arg1.anIntArray133[local1254] - arg1.anIntArray133[local1244];
							@Pc(1579) int local1579 = arg1.anIntArray135[local1254] - arg1.anIntArray135[local1244];
							@Pc(1590) int local1590 = arg1.anIntArray131[local1254] - arg1.anIntArray131[local1244];
							@Pc(1599) int local1599 = local1548 * local1590 - local1559 * local1579;
							@Pc(1607) int local1607 = local1559 * local1569 - local1537 * local1590;
							@Pc(1616) int local1616 = local1579 * local1537 - local1548 * local1569;
							local1624 = 64.0F / (float) arg1.anIntArray129[local834];
							local1632 = 64.0F / (float) arg1.anIntArray134[local834];
							local1640 = 64.0F / (float) arg1.anIntArray136[local834];
							local1663 = ((float) local1616 * local1274[2] + (float) local1607 * local1274[1] + (float) local1599 * local1274[0]) / local1624;
							local1686 = ((float) local1616 * local1274[5] + local1274[4] * (float) local1607 + local1274[3] * (float) local1599) / local1632;
							local1709 = (local1274[7] * (float) local1607 + local1274[6] * (float) local1599 + local1274[8] * (float) local1616) / local1640;
							local1218 = Static255.method4050(local1663, local1709, local1686);
							Static550.method7563(arg1.anIntArray131[local1244], arg1.anIntArray133[local1244], local1269, local1279, arg1.anIntArray135[local1244], local1392, local1259, local1287, Static421.aFloatArray51, local1274, local1218, local1264, local1298);
							local1202 = Static421.aFloatArray51[0];
							local1204 = Static421.aFloatArray51[1];
							Static550.method7563(arg1.anIntArray131[local1249], arg1.anIntArray133[local1249], local1269, local1279, arg1.anIntArray135[local1249], local1392, local1259, local1287, Static421.aFloatArray51, local1274, local1218, local1264, local1298);
							local1208 = Static421.aFloatArray51[1];
							local1206 = Static421.aFloatArray51[0];
							Static550.method7563(arg1.anIntArray131[local1254], arg1.anIntArray133[local1254], local1269, local1279, arg1.anIntArray135[local1254], local1392, local1259, local1287, Static421.aFloatArray51, local1274, local1218, local1264, local1298);
							local1210 = Static421.aFloatArray51[0];
							local1212 = Static421.aFloatArray51[1];
						} else if (local1234 == 3) {
							Static252.method4004(local1274, local1287, local1269, arg1.anIntArray133[local1244], local1259, local1279, arg1.anIntArray135[local1244], arg1.anIntArray131[local1244], local1264, Static421.aFloatArray51);
							local1202 = Static421.aFloatArray51[0];
							local1204 = Static421.aFloatArray51[1];
							Static252.method4004(local1274, local1287, local1269, arg1.anIntArray133[local1249], local1259, local1279, arg1.anIntArray135[local1249], arg1.anIntArray131[local1249], local1264, Static421.aFloatArray51);
							local1206 = Static421.aFloatArray51[0];
							local1208 = Static421.aFloatArray51[1];
							Static252.method4004(local1274, local1287, local1269, arg1.anIntArray133[local1254], local1259, local1279, arg1.anIntArray135[local1254], arg1.anIntArray131[local1254], local1264, Static421.aFloatArray51);
							local1210 = Static421.aFloatArray51[0];
							local1212 = Static421.aFloatArray51[1];
							if ((local1279 & 0x1) == 0) {
								if (local1206 - local1202 > 0.5F) {
									local1206--;
									local1214 = 1;
								} else if (local1202 - local1206 > 0.5F) {
									local1206++;
									local1214 = 2;
								}
								if (local1210 - local1202 > 0.5F) {
									local1216 = 1;
									local1210--;
								} else if (local1202 - local1210 > 0.5F) {
									local1216 = 2;
									local1210++;
								}
							} else {
								if (local1208 - local1204 > 0.5F) {
									local1208--;
									local1214 = 1;
								} else if (local1204 - local1208 > 0.5F) {
									local1208++;
									local1214 = 2;
								}
								if (local1212 - local1204 > 0.5F) {
									local1216 = 1;
									local1212--;
								} else if (local1204 - local1212 > 0.5F) {
									local1216 = 2;
									local1212++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray11 == null) {
				local1234 = 0;
			} else {
				local1234 = arg1.aByteArray11[local1134];
			}
			if (local1234 == 0) {
				@Pc(2567) long local2567 = ((long) local845 + (long) (local1218 << 24) + (long) (local1141 << 8) << 32) + (long) (local834 << 2);
				local1254 = arg1.aShortArray27[local1134];
				local2043 = arg1.aShortArray35[local1134];
				local2048 = arg1.aShortArray33[local1134];
				@Pc(2586) Class238 local2586 = local525[local1254];
				this.aShortArray19[local263] = this.method1025(local1202, local2586.anInt6642, local2586.anInt6643, local2586.anInt6645, local2586.anInt6641, local1254, arg1, local1204, local2567);
				@Pc(2610) Class238 local2610 = local525[local2043];
				this.aShortArray13[local263] = this.method1025(local1206, local2610.anInt6642, local2610.anInt6643, local2610.anInt6645, local2610.anInt6641, local2043, arg1, local1208, (long) local1214 + local2567);
				@Pc(2637) Class238 local2637 = local525[local2048];
				this.aShortArray18[local263] = this.method1025(local1210, local2637.anInt6642, local2637.anInt6643, local2637.anInt6645, local2637.anInt6641, local2048, arg1, local1212, (long) local1216 + local2567);
			} else if (local1234 == 1) {
				@Pc(2430) Class307 local2430 = local804[local1134];
				@Pc(2472) long local2472 = ((long) (local1218 << 24) + (long) (local1141 << 8) + (long) local845 << 32) + (long) ((local2430.anInt8591 <= 0 ? 2048 : 1024) + (local834 << 2) + (local2430.anInt8593 + 256 << 12) + (local2430.anInt8590 - -256 << 22));
				this.aShortArray19[local263] = this.method1025(local1202, 0, local2430.anInt8591, local2430.anInt8593, local2430.anInt8590, arg1.aShortArray27[local1134], arg1, local1204, local2472);
				this.aShortArray13[local263] = this.method1025(local1206, 0, local2430.anInt8591, local2430.anInt8593, local2430.anInt8590, arg1.aShortArray35[local1134], arg1, local1208, (long) local1214 + local2472);
				this.aShortArray18[local263] = this.method1025(local1210, 0, local2430.anInt8591, local2430.anInt8593, local2430.anInt8590, arg1.aShortArray33[local1134], arg1, local1212, local2472 + (long) local1216);
			}
			if (arg1.aByteArray10 != null) {
				this.aByteArray4[local263] = arg1.aByteArray10[local1134];
			}
			if (arg1.aShortArray28 != null) {
				this.aShortArray16[local263] = arg1.aShortArray28[local1134];
			}
			this.aShortArray17[local263] = arg1.aShortArray34[local1134];
			this.aShortArray14[local263] = local1177;
		}
		local1134 = 0;
		local823 = -10000;
		for (local834 = 0; local834 < this.anInt998; local834++) {
			@Pc(2717) short local2717 = this.aShortArray14[local834];
			if (local2717 != local823) {
				local1134++;
				local823 = local2717;
			}
		}
		this.anIntArray33 = new int[local1134 + 1];
		local1134 = 0;
		local823 = -10000;
		for (local845 = 0; local845 < this.anInt998; local845++) {
			local1177 = this.aShortArray14[local845];
			if (local823 != local1177) {
				local823 = local1177;
				this.anIntArray33[local1134++] = local845;
			}
		}
		this.anIntArray33[local1134] = this.anInt998;
		Static241.aLongArray8 = null;
		this.aShortArray20 = Static181.method2980(this.anInt1010, this.aShortArray20);
		this.aShortArray11 = Static181.method2980(this.anInt1010, this.aShortArray11);
		this.aShortArray21 = Static181.method2980(this.anInt1010, this.aShortArray21);
		this.aByteArray3 = Static654.method8556(this.aByteArray3, this.anInt1010);
		this.aFloatArray21 = Static282.method4465(this.aFloatArray21, this.anInt1010);
		this.aFloatArray22 = Static282.method4465(this.aFloatArray22, this.anInt1010);
		if (arg1.anIntArray138 != null && Static672.method8703(this.anInt1016, arg2)) {
			this.anIntArrayArray4 = arg1.method1892(false);
		}
		if (arg1.aClass151Array1 != null && Static7.method71(this.anInt1016, arg2)) {
			this.anIntArrayArray3 = arg1.method1887();
		}
		if (arg1.anIntArray137 != null && Static521.method7355(arg2, this.anInt1016)) {
			local855 = 0;
			@Pc(2874) int[] local2874 = new int[256];
			for (local877 = 0; local877 < this.anInt1000; local877++) {
				local888 = arg1.anIntArray137[local112[local877]];
				if (local888 >= 0) {
					if (local855 < local888) {
						local855 = local888;
					}
					@Pc(2899) int local2899 = local2874[local888]++;
				}
			}
			this.anIntArrayArray2 = new int[local855 + 1][];
			for (local888 = 0; local888 <= local855; local888++) {
				this.anIntArrayArray2[local888] = new int[local2874[local888]];
				local2874[local888] = 0;
			}
			for (local897 = 0; local897 < this.anInt1000; local897++) {
				local906 = arg1.anIntArray137[local112[local897]];
				if (local906 >= 0) {
					this.anIntArrayArray2[local906][local2874[local906]++] = local897;
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt996 = arg0;
		this.aBoolean92 = true;
		if (this.aClass183_1 != null && (this.anInt996 & 0x10000) == 0) {
			this.aShortArray21 = this.aClass183_1.aShortArray110;
			this.aShortArray20 = this.aClass183_1.aShortArray111;
			this.aShortArray11 = this.aClass183_1.aShortArray109;
			this.aByteArray3 = this.aClass183_1.aByteArray50;
			this.aClass183_1 = null;
		}
		this.method1014();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!sk;Lclient!eea;I)V")
	@Override
	public void method6908(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class23_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1010 == 0) {
			return;
		}
		@Pc(13) Class25_Sub1 local13 = this.aClass16_Sub2_4.aClass25_Sub1_3;
		@Pc(16) Class25_Sub1 local16 = (Class25_Sub1) arg0;
		if (!this.aBoolean93) {
			this.method1015();
		}
		Static104.aFloat73 = local16.aFloat37 * local13.aFloat45 + local13.aFloat42 * local16.aFloat47 + local13.aFloat37 * local16.aFloat38;
		Static334.aFloat150 = local13.aFloat37 * local16.aFloat41 + local16.aFloat43 * local13.aFloat42 + local16.aFloat39 * local13.aFloat45 + local13.aFloat39;
		@Pc(69) float local69 = Static104.aFloat73 * (float) this.aShort14 + Static334.aFloat150;
		@Pc(77) float local77 = Static334.aFloat150 + Static104.aFloat73 * (float) this.aShort21;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.aShort22;
			local94 = (float) -this.aShort22 + local77;
		} else {
			local94 = (float) -this.aShort22 + local69;
			local87 = (float) this.aShort22 + local77;
		}
		if (this.aClass16_Sub2_4.aFloat90 <= local94 || (float) this.aClass16_Sub2_4.anInt4389 >= local87) {
			return;
		}
		Static370.aFloat152 = local16.aFloat39 * local13.aFloat46 + local13.aFloat47 * local16.aFloat41 + local16.aFloat43 * local13.aFloat48 + local13.aFloat43;
		Static267.aFloat118 = local13.aFloat48 * local16.aFloat47 + local13.aFloat47 * local16.aFloat38 + local16.aFloat37 * local13.aFloat46;
		@Pc(171) float local171 = Static267.aFloat118 * (float) this.aShort14 + Static370.aFloat152;
		@Pc(179) float local179 = (float) this.aShort21 * Static267.aFloat118 + Static370.aFloat152;
		@Pc(205) float local205;
		@Pc(194) float local194;
		if (local171 > local179) {
			local194 = (float) this.aClass16_Sub2_4.anInt4396 * (local171 + (float) this.aShort22);
			local205 = (float) this.aClass16_Sub2_4.anInt4396 * (local179 - (float) this.aShort22);
		} else {
			local205 = ((float) -this.aShort22 + local171) * (float) this.aClass16_Sub2_4.anInt4396;
			local194 = (local179 + (float) this.aShort22) * (float) this.aClass16_Sub2_4.anInt4396;
		}
		if (this.aClass16_Sub2_4.aFloat102 <= local205 / local87 || local194 / local87 <= this.aClass16_Sub2_4.aFloat103) {
			return;
		}
		Static390.aFloat155 = local13.aFloat38 * local16.aFloat38 + local16.aFloat47 * local13.aFloat44 + local16.aFloat37 * local13.aFloat40;
		Static515.aFloat187 = local16.aFloat41 * local13.aFloat38 + local13.aFloat44 * local16.aFloat43 + local13.aFloat40 * local16.aFloat39 + local13.aFloat41;
		@Pc(295) float local295 = (float) this.aShort14 * Static390.aFloat155 + Static515.aFloat187;
		@Pc(303) float local303 = Static515.aFloat187 + Static390.aFloat155 * (float) this.aShort21;
		@Pc(319) float local319;
		@Pc(330) float local330;
		if (local295 > local303) {
			local330 = (float) this.aClass16_Sub2_4.anInt4377 * ((float) this.aShort22 + local295);
			local319 = ((float) -this.aShort22 + local303) * (float) this.aClass16_Sub2_4.anInt4377;
		} else {
			local319 = (float) this.aClass16_Sub2_4.anInt4377 * ((float) -this.aShort22 + local295);
			local330 = (local303 + (float) this.aShort22) * (float) this.aClass16_Sub2_4.anInt4377;
		}
		if (local319 / local87 >= this.aClass16_Sub2_4.aFloat95 || this.aClass16_Sub2_4.aFloat89 >= local330 / local87) {
			return;
		}
		if (arg1 != null || this.aClass101Array1 != null) {
			Static101.aFloat68 = local13.aFloat45 * local16.aFloat42 + local16.aFloat48 * local13.aFloat42 + local13.aFloat37 * local16.aFloat44;
			Static186.aFloat81 = local13.aFloat44 * local16.aFloat46 + local16.aFloat40 * local13.aFloat38 + local16.aFloat45 * local13.aFloat40;
			Static498.aFloat184 = local16.aFloat42 * local13.aFloat46 + local13.aFloat47 * local16.aFloat44 + local13.aFloat48 * local16.aFloat48;
			Static242.aFloat107 = local16.aFloat44 * local13.aFloat38 + local16.aFloat48 * local13.aFloat44 + local16.aFloat42 * local13.aFloat40;
			Static662.aFloat198 = local13.aFloat42 * local16.aFloat46 + local16.aFloat40 * local13.aFloat37 + local16.aFloat45 * local13.aFloat45;
			Static365.aFloat84 = local16.aFloat45 * local13.aFloat46 + local16.aFloat40 * local13.aFloat47 + local13.aFloat48 * local16.aFloat46;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.aShort15 + this.aShort16 >> 1;
			@Pc(508) int local508 = this.aShort20 + this.aShort17 >> 1;
			@Pc(527) int local527 = (int) (Static365.aFloat84 * (float) local508 + Static370.aFloat152 + Static498.aFloat184 * (float) local500 + Static267.aFloat118 * (float) this.aShort14);
			@Pc(546) int local546 = (int) (Static390.aFloat155 * (float) this.aShort14 + Static515.aFloat187 + Static242.aFloat107 * (float) local500 + Static186.aFloat81 * (float) local508);
			@Pc(565) int local565 = (int) (Static662.aFloat198 * (float) local508 + (float) this.aShort14 * Static104.aFloat73 + Static101.aFloat68 * (float) local500 + Static334.aFloat150);
			if (this.aClass16_Sub2_4.anInt4389 > local565) {
				local490 = true;
			} else {
				arg1.anInt2464 = this.aClass16_Sub2_4.anInt4391 + local546 * this.aClass16_Sub2_4.anInt4377 / local565;
				arg1.anInt2467 = this.aClass16_Sub2_4.anInt4395 + local527 * this.aClass16_Sub2_4.anInt4396 / local565;
			}
			@Pc(625) int local625 = (int) (Static365.aFloat84 * (float) local508 + Static498.aFloat184 * (float) local500 + Static370.aFloat152 + (float) this.aShort21 * Static267.aFloat118);
			@Pc(644) int local644 = (int) ((float) local508 * Static186.aFloat81 + Static515.aFloat187 + (float) local500 * Static242.aFloat107 + Static390.aFloat155 * (float) this.aShort21);
			@Pc(663) int local663 = (int) (Static104.aFloat73 * (float) this.aShort21 + Static101.aFloat68 * (float) local500 + Static334.aFloat150 + Static662.aFloat198 * (float) local508);
			if (this.aClass16_Sub2_4.anInt4389 <= local663) {
				arg1.anInt2465 = this.aClass16_Sub2_4.anInt4391 + local644 * this.aClass16_Sub2_4.anInt4377 / local663;
				arg1.anInt2463 = this.aClass16_Sub2_4.anInt4395 + this.aClass16_Sub2_4.anInt4396 * local625 / local663;
			} else {
				local490 = true;
			}
			if (local490) {
				if (local565 < this.aClass16_Sub2_4.anInt4389 && local663 < this.aClass16_Sub2_4.anInt4389) {
					local492 = false;
				} else {
					@Pc(734) int local734;
					@Pc(745) int local745;
					@Pc(771) int local771;
					if (this.aClass16_Sub2_4.anInt4389 > local565) {
						local734 = (local663 - this.aClass16_Sub2_4.anInt4389 << 16) / (local663 - local565);
						local745 = local625 + ((local625 - local527) * local734 >> 16);
						arg1.anInt2467 = this.aClass16_Sub2_4.anInt4395 + this.aClass16_Sub2_4.anInt4396 * local745 / this.aClass16_Sub2_4.anInt4389;
						local771 = local644 + (local734 * (local644 - local546) >> 16);
						arg1.anInt2464 = this.aClass16_Sub2_4.anInt4377 * local771 / this.aClass16_Sub2_4.anInt4389 + this.aClass16_Sub2_4.anInt4391;
					} else if (local663 < this.aClass16_Sub2_4.anInt4389) {
						local734 = (local565 - this.aClass16_Sub2_4.anInt4389 << 16) / (local565 - local663);
						local745 = local527 + ((local527 - local625) * local734 >> 16);
						local771 = local546 + (local734 * (local546 - local644) >> 16);
						arg1.anInt2467 = this.aClass16_Sub2_4.anInt4396 * local745 / this.aClass16_Sub2_4.anInt4389 + this.aClass16_Sub2_4.anInt4395;
						arg1.anInt2464 = local771 * this.aClass16_Sub2_4.anInt4377 / this.aClass16_Sub2_4.anInt4389 + this.aClass16_Sub2_4.anInt4391;
					}
				}
			}
			if (local492) {
				if (local565 > local663) {
					arg1.anInt2466 = (local527 + this.aShort22) * this.aClass16_Sub2_4.anInt4396 / local565 + this.aClass16_Sub2_4.anInt4395 - arg1.anInt2467;
				} else {
					arg1.anInt2466 = this.aClass16_Sub2_4.anInt4395 + this.aClass16_Sub2_4.anInt4396 * (this.aShort22 + local625) / local663 - arg1.anInt2463;
				}
				arg1.aBoolean206 = true;
			}
		}
		this.aClass16_Sub2_4.method3690();
		this.aClass16_Sub2_4.method3691(local16);
		this.method1027();
		this.aClass16_Sub2_4.method3686();
		this.method1023();
	}

	@OriginalMember(owner = "client!b", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub6_Sub12 ba(@OriginalArg(0) Class3_Sub6_Sub12 arg0) {
		if (this.anInt1010 == 0) {
			return null;
		}
		if (!this.aBoolean93) {
			this.method1015();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass16_Sub2_4.anInt4376 > 0) {
			local39 = this.aShort15 - (this.aClass16_Sub2_4.anInt4376 * this.aShort21 >> 8) >> this.aClass16_Sub2_4.anInt4364;
			local56 = this.aShort16 - (this.aShort14 * this.aClass16_Sub2_4.anInt4376 >> 8) >> this.aClass16_Sub2_4.anInt4364;
		} else {
			local39 = this.aShort15 - (this.aShort14 * this.aClass16_Sub2_4.anInt4376 >> 8) >> this.aClass16_Sub2_4.anInt4364;
			local56 = this.aShort16 - (this.aClass16_Sub2_4.anInt4376 * this.aShort21 >> 8) >> this.aClass16_Sub2_4.anInt4364;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass16_Sub2_4.anInt4402 <= 0) {
			local116 = this.aShort20 - (this.aShort14 * this.aClass16_Sub2_4.anInt4402 >> 8) >> this.aClass16_Sub2_4.anInt4364;
			local133 = this.aShort17 - (this.aShort21 * this.aClass16_Sub2_4.anInt4402 >> 8) >> this.aClass16_Sub2_4.anInt4364;
		} else {
			local116 = this.aShort20 - (this.aShort21 * this.aClass16_Sub2_4.anInt4402 >> 8) >> this.aClass16_Sub2_4.anInt4364;
			local133 = this.aShort17 - (this.aClass16_Sub2_4.anInt4402 * this.aShort14 >> 8) >> this.aClass16_Sub2_4.anInt4364;
		}
		@Pc(175) int local175 = local56 + 1 - local39;
		@Pc(182) int local182 = local133 + 1 - local116;
		@Pc(185) Class3_Sub6_Sub12_Sub2 local185 = (Class3_Sub6_Sub12_Sub2) arg0;
		@Pc(201) Class3_Sub6_Sub12_Sub2 local201;
		if (local185 != null && local185.method8346(local175, local182)) {
			local201 = local185;
			local185.method8348();
		} else {
			local201 = new Class3_Sub6_Sub12_Sub2(this.aClass16_Sub2_4, local175, local182);
		}
		local201.method8345(local116, local56, local133, local39);
		this.method1020(local201);
		return local201;
	}

	@OriginalMember(owner = "client!b", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean93) {
			this.method1015();
		}
		@Pc(16) int local16 = arg4 + this.aShort15;
		@Pc(22) int local22 = arg4 + this.aShort16;
		@Pc(27) int local27 = this.aShort20 + arg6;
		@Pc(32) int local32 = this.aShort17 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local22 + arg2.anInt9716 >> arg2.anInt9717 >= arg2.anInt9718 || local27 < 0 || arg2.anInt9715 <= local32 + arg2.anInt9716 >> arg2.anInt9717)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9718 <= arg3.anInt9716 + local22 >> arg3.anInt9717 || local27 < 0 || arg3.anInt9716 + local32 >> arg3.anInt9717 >= arg3.anInt9715) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9717;
			local22 = arg2.anInt9716 + local22 - 1 >> arg2.anInt9717;
			local27 >>= arg2.anInt9717;
			local32 = local32 + arg2.anInt9716 - 1 >> arg2.anInt9717;
			if (arg5 == arg2.method8279(local27, local16) && arg5 == arg2.method8279(local27, local22) && arg5 == arg2.method8279(local32, local16) && arg2.method8279(local32, local22) == arg5) {
				return;
			}
		}
		@Pc(214) int local214;
		if (arg0 == 1) {
			for (local214 = 0; local214 < this.anInt995; local214++) {
				this.anIntArray31[local214] += arg2.method8286(arg4 + this.anIntArray30[local214], this.anIntArray28[local214] - -arg6) - arg5;
			}
		} else {
			@Pc(222) int local222;
			@Pc(230) int local230;
			if (arg0 == 2) {
				@Pc(438) short local438 = this.aShort14;
				if (local438 == 0) {
					return;
				}
				for (local222 = 0; local222 < this.anInt995; local222++) {
					local230 = (this.anIntArray31[local222] << 16) / local438;
					if (arg1 > local230) {
						this.anIntArray31[local222] += (arg1 - local230) * (arg2.method8286(arg4 + this.anIntArray30[local222], this.anIntArray28[local222] + arg6) - arg5) / arg1;
					}
				}
			} else {
				@Pc(238) int local238;
				if (arg0 == 3) {
					local214 = (arg1 & 0xFF) * 4;
					local222 = (arg1 >> 8 & 0xFF) * 4;
					local230 = (arg1 >> 16 & 0xFF) << 6;
					local238 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local214 >> 1) < 0 || arg2.anInt9718 << arg2.anInt9717 <= (local214 >> 1) + arg4 + arg2.anInt9716 || arg6 - (local222 >> 1) < 0 || arg2.anInt9716 + (local222 >> 1) + arg6 >= arg2.anInt9715 << arg2.anInt9717) {
						return;
					}
					this.method6906(local230, arg2, arg5, arg4, local222, local214, local238, arg6);
				} else if (arg0 == 4) {
					local214 = this.aShort21 - this.aShort14;
					for (local222 = 0; local222 < this.anInt995; local222++) {
						this.anIntArray31[local222] = local214 + this.anIntArray31[local222] + arg3.method8286(this.anIntArray30[local222] + arg4, arg6 + this.anIntArray28[local222]) - arg5;
					}
				} else if (arg0 == 5) {
					local214 = this.aShort21 - this.aShort14;
					for (local222 = 0; local222 < this.anInt995; local222++) {
						local230 = arg4 + this.anIntArray30[local222];
						local238 = arg6 + this.anIntArray28[local222];
						@Pc(389) int local389 = arg2.method8286(local230, local238);
						@Pc(395) int local395 = arg3.method8286(local230, local238);
						@Pc(403) int local403 = local389 - arg1 - local395;
						this.anIntArray31[local222] = local389 + ((this.anIntArray31[local222] << 8) / local214 * local403 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean93 = false;
		if (this.aClass243_4 != null) {
			this.aClass243_4.anInterface26_5 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	private void method1014() {
		if (!this.aBoolean92) {
			return;
		}
		this.aBoolean92 = false;
		if (this.aClass261Array1 == null && this.aClass298Array1 == null && this.aClass101Array1 == null) {
			if (this.anIntArray30 != null && !Static454.method6514(this.anInt996, this.anInt1016)) {
				if (this.aClass243_4 != null && this.aClass243_4.anInterface26_5 == null) {
					this.aBoolean92 = true;
				} else {
					if (!this.aBoolean93) {
						this.method1015();
					}
					this.anIntArray30 = null;
				}
			}
			if (this.anIntArray31 != null && !Static220.method3442(this.anInt996, this.anInt1016)) {
				if (this.aClass243_4 != null && this.aClass243_4.anInterface26_5 == null) {
					this.aBoolean92 = true;
				} else {
					if (!this.aBoolean93) {
						this.method1015();
					}
					this.anIntArray31 = null;
				}
			}
			if (this.anIntArray28 != null && !Static315.method4943(this.anInt996, this.anInt1016)) {
				if (this.aClass243_4 != null && this.aClass243_4.anInterface26_5 == null) {
					this.aBoolean92 = true;
				} else {
					if (!this.aBoolean93) {
						this.method1015();
					}
					this.anIntArray28 = null;
				}
			}
		}
		if (this.aShortArray12 != null && this.anIntArray30 == null && this.anIntArray31 == null && this.anIntArray28 == null) {
			this.aShortArray12 = null;
			this.anIntArray29 = null;
		}
		if (this.aByteArray3 != null && !Static539.method7484(this.anInt1016, this.anInt996)) {
			if (this.aClass243_3 == null) {
				if (this.aClass243_2 != null && this.aClass243_2.anInterface26_5 == null) {
					this.aBoolean92 = true;
				} else {
					this.aShortArray20 = this.aShortArray11 = this.aShortArray21 = null;
					this.aByteArray3 = null;
				}
			} else if (this.aClass243_3.anInterface26_5 == null) {
				this.aBoolean92 = true;
			} else {
				this.aByteArray3 = null;
				this.aShortArray20 = this.aShortArray11 = this.aShortArray21 = null;
			}
		}
		if (this.aShortArray17 != null && !Static254.method4043(this.anInt1016, this.anInt996)) {
			if (this.aClass243_2 != null && this.aClass243_2.anInterface26_5 == null) {
				this.aBoolean92 = true;
			} else {
				this.aShortArray17 = null;
			}
		}
		if (this.aByteArray4 != null && !Static385.method5624(this.anInt1016, this.anInt996)) {
			if (this.aClass243_2 != null && this.aClass243_2.anInterface26_5 == null) {
				this.aBoolean92 = true;
			} else {
				this.aByteArray4 = null;
			}
		}
		if (this.aFloatArray21 != null && !Static526.method7368(this.anInt1016, this.anInt996)) {
			if (this.aClass243_1 != null && this.aClass243_1.anInterface26_5 == null) {
				this.aBoolean92 = true;
			} else {
				this.aFloatArray21 = this.aFloatArray22 = null;
			}
		}
		if (this.aShortArray14 != null && !Static2.method22(this.anInt996, this.anInt1016)) {
			if (this.aClass243_2 != null && this.aClass243_2.anInterface26_5 == null) {
				this.aBoolean92 = true;
			} else {
				this.aShortArray14 = null;
			}
		}
		if (this.aShortArray19 != null && !Static248.method3939(this.anInt1016, this.anInt996)) {
			if (this.aClass187_1 != null && this.aClass187_1.anInterface17_4 == null || this.aClass243_2 != null && this.aClass243_2.anInterface26_5 == null) {
				this.aBoolean92 = true;
			} else {
				this.aShortArray19 = this.aShortArray13 = this.aShortArray18 = null;
			}
		}
		if (this.anIntArrayArray2 != null && !Static521.method7355(this.anInt996, this.anInt1016)) {
			this.aShortArray16 = null;
			this.anIntArrayArray2 = null;
		}
		if (this.anIntArrayArray4 != null && !Static672.method8703(this.anInt1016, this.anInt996)) {
			this.aShortArray15 = null;
			this.anIntArrayArray4 = null;
		}
		if (this.anIntArrayArray3 != null && !Static7.method71(this.anInt1016, this.anInt996)) {
			this.anIntArrayArray3 = null;
		}
		if (this.anIntArray33 != null && (this.anInt996 & 0x800) == 0 && (this.anInt996 & 0x40000) == 0) {
			this.anIntArray33 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6897(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class28_Sub1 local8 = (Class28_Sub1) arg0;
		if (this.anInt1000 == 0 || local8.anInt1000 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt995;
		@Pc(24) int[] local24 = local8.anIntArray30;
		@Pc(27) int[] local27 = local8.anIntArray31;
		@Pc(30) int[] local30 = local8.anIntArray28;
		@Pc(33) short[] local33 = local8.aShortArray20;
		@Pc(36) short[] local36 = local8.aShortArray11;
		@Pc(39) short[] local39 = local8.aShortArray21;
		@Pc(42) byte[] local42 = local8.aByteArray3;
		@Pc(49) short[] local49;
		@Pc(61) short[] local61;
		@Pc(53) short[] local53;
		@Pc(57) byte[] local57;
		if (this.aClass183_1 == null) {
			local53 = null;
			local61 = null;
			local49 = null;
			local57 = null;
		} else {
			local49 = this.aClass183_1.aShortArray111;
			local53 = this.aClass183_1.aShortArray110;
			local57 = this.aClass183_1.aByteArray50;
			local61 = this.aClass183_1.aShortArray109;
		}
		@Pc(86) short[] local86;
		@Pc(90) short[] local90;
		@Pc(82) short[] local82;
		@Pc(78) byte[] local78;
		if (local8.aClass183_1 == null) {
			local90 = null;
			local78 = null;
			local86 = null;
			local82 = null;
		} else {
			local78 = local8.aClass183_1.aByteArray50;
			local82 = local8.aClass183_1.aShortArray110;
			local86 = local8.aClass183_1.aShortArray111;
			local90 = local8.aClass183_1.aShortArray109;
		}
		@Pc(103) int[] local103 = local8.anIntArray29;
		@Pc(106) short[] local106 = local8.aShortArray12;
		if (!local8.aBoolean93) {
			local8.method1015();
		}
		@Pc(115) short local115 = local8.aShort14;
		@Pc(118) short local118 = local8.aShort21;
		@Pc(121) short local121 = local8.aShort15;
		@Pc(124) short local124 = local8.aShort16;
		@Pc(127) short local127 = local8.aShort20;
		@Pc(130) short local130 = local8.aShort17;
		for (@Pc(132) int local132 = 0; local132 < this.anInt995; local132++) {
			@Pc(141) int local141 = this.anIntArray31[local132] - arg2;
			if (local141 >= local115 && local141 <= local118) {
				@Pc(161) int local161 = this.anIntArray30[local132] - arg1;
				if (local161 >= local121 && local124 >= local161) {
					@Pc(176) int local176 = this.anIntArray28[local132] - arg3;
					if (local176 >= local127 && local130 >= local176) {
						@Pc(190) int local190 = -1;
						@Pc(195) int local195 = this.anIntArray29[local132];
						@Pc(202) int local202 = this.anIntArray29[local132 + 1];
						for (@Pc(204) int local204 = local195; local204 < local202; local204++) {
							local190 = this.aShortArray12[local204] - 1;
							if (local190 == -1 || this.aByteArray3[local190] != 0) {
								break;
							}
						}
						if (local190 != -1) {
							for (@Pc(239) int local239 = 0; local239 < local21; local239++) {
								if (local24[local239] == local161 && local30[local239] == local176 && local27[local239] == local141) {
									local202 = local103[local239 + 1];
									local195 = local103[local239];
									@Pc(276) int local276 = -1;
									for (@Pc(278) int local278 = local195; local278 < local202; local278++) {
										local276 = local106[local278] - 1;
										if (local276 == -1 || local42[local276] != 0) {
											break;
										}
									}
									if (local276 != -1) {
										if (local49 == null) {
											this.aClass183_1 = new Class183();
											local49 = this.aClass183_1.aShortArray111 = Static648.method8490(this.aShortArray20);
											local61 = this.aClass183_1.aShortArray109 = Static648.method8490(this.aShortArray11);
											local53 = this.aClass183_1.aShortArray110 = Static648.method8490(this.aShortArray21);
											local57 = this.aClass183_1.aByteArray50 = Static488.method7008(this.aByteArray3);
										}
										if (local86 == null) {
											@Pc(354) Class183 local354 = local8.aClass183_1 = new Class183();
											local86 = local354.aShortArray111 = Static648.method8490(local33);
											local90 = local354.aShortArray109 = Static648.method8490(local36);
											local82 = local354.aShortArray110 = Static648.method8490(local39);
											local78 = local354.aByteArray50 = Static488.method7008(local42);
										}
										@Pc(387) short local387 = this.aShortArray20[local190];
										@Pc(392) short local392 = this.aShortArray11[local190];
										@Pc(397) short local397 = this.aShortArray21[local190];
										local202 = local103[local239 + 1];
										@Pc(408) byte local408 = this.aByteArray3[local190];
										local195 = local103[local239];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local195; local414 < local202; local414++) {
											local422 = local106[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local78[local422] != 0) {
												local86[local422] += local387;
												local90[local422] += local392;
												local82[local422] += local397;
												local78[local422] += local408;
											}
										}
										local387 = local33[local276];
										local397 = local39[local276];
										local195 = this.anIntArray29[local132];
										local202 = this.anIntArray29[local132 + 1];
										local408 = local42[local276];
										local392 = local36[local276];
										for (local422 = local195; local422 < local202; local422++) {
											@Pc(507) int local507 = this.aShortArray12[local422] - 1;
											if (local507 == -1) {
												break;
											}
											if (local57[local507] != 0) {
												local49[local507] += local387;
												local61[local507] += local392;
												local53[local507] += local397;
												local57[local507] += local408;
											}
										}
										if (this.aClass243_3 == null && this.aClass243_2 != null) {
											this.aClass243_2.anInterface26_5 = null;
										}
										if (this.aClass243_3 != null) {
											this.aClass243_3.anInterface26_5 = null;
										}
										if (local8.aClass243_3 == null && local8.aClass243_2 != null) {
											local8.aClass243_2.anInterface26_5 = null;
										}
										if (local8.aClass243_3 != null) {
											local8.aClass243_3.anInterface26_5 = null;
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

	@OriginalMember(owner = "client!b", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean93) {
			this.method1015();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!b", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort18;
	}

	@OriginalMember(owner = "client!b", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean95;
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "()[Lclient!oea;")
	@Override
	public Class261[] method6912() {
		return this.aClass261Array1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class28 method6900(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class28_Sub1 local14;
		@Pc(18) Class28_Sub1 local18;
		if (arg0 == 1) {
			local14 = this.aClass16_Sub2_4.aClass28_Sub1_8;
			local18 = this.aClass16_Sub2_4.aClass28_Sub1_4;
		} else if (arg0 == 2) {
			local18 = this.aClass16_Sub2_4.aClass28_Sub1_5;
			local14 = this.aClass16_Sub2_4.aClass28_Sub1_2;
		} else if (arg0 == 3) {
			local14 = this.aClass16_Sub2_4.aClass28_Sub1_3;
			local18 = this.aClass16_Sub2_4.aClass28_Sub1_1;
		} else if (arg0 == 4) {
			local18 = this.aClass16_Sub2_4.aClass28_Sub1_10;
			local14 = this.aClass16_Sub2_4.aClass28_Sub1_6;
		} else if (arg0 == 5) {
			local18 = this.aClass16_Sub2_4.aClass28_Sub1_7;
			local14 = this.aClass16_Sub2_4.aClass28_Sub1_9;
		} else {
			local14 = local18 = new Class28_Sub1(this.aClass16_Sub2_4);
		}
		return this.method1018(arg0 != 0, arg2, local14, local18, arg1);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	private void method1015() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt995; local23++) {
			@Pc(30) int local30 = this.anIntArray30[local23];
			@Pc(35) int local35 = this.anIntArray31[local23];
			@Pc(40) int local40 = this.anIntArray28[local23];
			if (local30 > local13) {
				local13 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local11 > local40) {
				local11 = local40;
			}
			if (local40 > local17) {
				local17 = local40;
			}
			@Pc(86) int local86 = local40 * local40 + local30 * local30;
			if (local19 < local86) {
				local19 = local86;
			}
			local86 = local35 * local35 + local40 * local40 + local30 * local30;
			if (local21 < local86) {
				local21 = local86;
			}
		}
		this.aShort14 = (short) local9;
		this.aShort20 = (short) local11;
		this.aShort21 = (short) local15;
		this.aShort17 = (short) local17;
		this.aShort15 = (short) local7;
		this.aShort16 = (short) local13;
		this.aShort22 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort23 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean93 = true;
	}

	@OriginalMember(owner = "client!b", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static195.anInt3523 = 0;
			Static215.anInt6269 = 0;
			Static636.anInt9817 = 0;
			for (local20 = 0; local20 < this.anInt995; local20++) {
				Static195.anInt3523 += this.anIntArray30[local20];
				Static636.anInt9817 += this.anIntArray31[local20];
				Static215.anInt6269 += this.anIntArray28[local20];
				local12++;
			}
			if (local12 > 0) {
				Static195.anInt3523 = Static195.anInt3523 / local12 + arg1;
				Static636.anInt9817 = arg2 + Static636.anInt9817 / local12;
				Static215.anInt6269 = Static215.anInt6269 / local12 + arg3;
			} else {
				Static636.anInt9817 = arg2;
				Static195.anInt3523 = arg1;
				Static215.anInt6269 = arg3;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt995; local12++) {
				this.anIntArray30[local12] += arg1;
				this.anIntArray31[local12] += arg2;
				this.anIntArray28[local12] += arg3;
			}
		} else {
			@Pc(169) int local169;
			@Pc(187) int local187;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt995; local12++) {
					this.anIntArray30[local12] -= Static195.anInt3523;
					this.anIntArray31[local12] -= Static636.anInt9817;
					this.anIntArray28[local12] -= Static215.anInt6269;
					if (arg3 != 0) {
						local20 = Class3_Sub7_Sub2.anIntArray171[arg3];
						local169 = Class3_Sub7_Sub2.anIntArray170[arg3];
						local187 = local20 * this.anIntArray31[local12] + this.anIntArray30[local12] * local169 + 16383 >> 14;
						this.anIntArray31[local12] = local169 * this.anIntArray31[local12] + 16383 - local20 * this.anIntArray30[local12] >> 14;
						this.anIntArray30[local12] = local187;
					}
					if (arg1 != 0) {
						local20 = Class3_Sub7_Sub2.anIntArray171[arg1];
						local169 = Class3_Sub7_Sub2.anIntArray170[arg1];
						local187 = local169 * this.anIntArray31[local12] + 16383 - local20 * this.anIntArray28[local12] >> 14;
						this.anIntArray28[local12] = local169 * this.anIntArray28[local12] + local20 * this.anIntArray31[local12] + 16383 >> 14;
						this.anIntArray31[local12] = local187;
					}
					if (arg2 != 0) {
						local20 = Class3_Sub7_Sub2.anIntArray171[arg2];
						local169 = Class3_Sub7_Sub2.anIntArray170[arg2];
						local187 = this.anIntArray30[local12] * local169 + local20 * this.anIntArray28[local12] + 16383 >> 14;
						this.anIntArray28[local12] = local169 * this.anIntArray28[local12] + 16383 - local20 * this.anIntArray30[local12] >> 14;
						this.anIntArray30[local12] = local187;
					}
					this.anIntArray30[local12] += Static195.anInt3523;
					this.anIntArray31[local12] += Static636.anInt9817;
					this.anIntArray28[local12] += Static215.anInt6269;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt995; local12++) {
					this.anIntArray30[local12] -= Static195.anInt3523;
					this.anIntArray31[local12] -= Static636.anInt9817;
					this.anIntArray28[local12] -= Static215.anInt6269;
					this.anIntArray30[local12] = arg1 * this.anIntArray30[local12] / 128;
					this.anIntArray31[local12] = arg2 * this.anIntArray31[local12] / 128;
					this.anIntArray28[local12] = this.anIntArray28[local12] * arg3 / 128;
					this.anIntArray30[local12] += Static195.anInt3523;
					this.anIntArray31[local12] += Static636.anInt9817;
					this.anIntArray28[local12] += Static215.anInt6269;
				}
			} else {
				@Pc(521) Class101 local521;
				@Pc(526) Class365 local526;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt1000; local12++) {
						local20 = (this.aByteArray4[local12] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray4[local12] = (byte) local20;
					}
					if (this.aClass243_2 != null) {
						this.aClass243_2.anInterface26_5 = null;
					}
					if (this.aClass101Array1 != null) {
						for (local20 = 0; local20 < this.anInt985; local20++) {
							local521 = this.aClass101Array1[local20];
							local526 = this.aClass365Array1[local20];
							local526.anInt9558 = local526.anInt9558 & 0xFFFFFF | 255 - (this.aByteArray4[local521.anInt2499] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt1000; local12++) {
						local20 = this.aShortArray17[local12] & 0xFFFF;
						local169 = local20 >> 10 & 0x3F;
						local187 = local20 >> 7 & 0x7;
						@Pc(581) int local581 = local20 & 0x7F;
						local187 += arg2 / 4;
						@Pc(593) int local593 = local169 + arg1 & 0x3F;
						local581 += arg3;
						if (local187 < 0) {
							local187 = 0;
						} else if (local187 > 7) {
							local187 = 7;
						}
						if (local581 < 0) {
							local581 = 0;
						} else if (local581 > 127) {
							local581 = 127;
						}
						this.aShortArray17[local12] = (short) (local593 << 10 | local187 << 7 | local581);
					}
					if (this.aClass243_2 != null) {
						this.aClass243_2.anInterface26_5 = null;
					}
					if (this.aClass101Array1 != null) {
						for (local20 = 0; local20 < this.anInt985; local20++) {
							local521 = this.aClass101Array1[local20];
							local526 = this.aClass365Array1[local20];
							local526.anInt9558 = Static274.anIntArray337[this.aShortArray17[local521.anInt2499] & 0xFFFF] & 0xFFFFFF | local526.anInt9558 & 0xFF000000;
						}
					}
				} else {
					@Pc(705) Class365 local705;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt985; local12++) {
							local705 = this.aClass365Array1[local12];
							local705.anInt9557 += arg2;
							local705.anInt9565 += arg1;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt985; local12++) {
							local705 = this.aClass365Array1[local12];
							local705.anInt9559 = local705.anInt9559 * arg2 >> 7;
							local705.anInt9566 = local705.anInt9566 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt985; local12++) {
							local705 = this.aClass365Array1[local12];
							local705.anInt9562 = local705.anInt9562 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean93) {
			this.method1015();
		}
		return this.aShort17;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILclient!sk;IIZ)Z")
	private boolean method1016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class25_Sub1 local8 = (Class25_Sub1) arg3;
		@Pc(12) Class25_Sub1 local12 = this.aClass16_Sub2_4.aClass25_Sub1_3;
		@Pc(33) float local33 = local12.aFloat43 + local12.aFloat46 * local8.aFloat39 + local12.aFloat47 * local8.aFloat41 + local8.aFloat43 * local12.aFloat48;
		@Pc(54) float local54 = local8.aFloat39 * local12.aFloat40 + local8.aFloat43 * local12.aFloat44 + local8.aFloat41 * local12.aFloat38 + local12.aFloat41;
		Static186.aFloat81 = local12.aFloat44 * local8.aFloat46 + local8.aFloat40 * local12.aFloat38 + local12.aFloat40 * local8.aFloat45;
		Static104.aFloat73 = local8.aFloat38 * local12.aFloat37 + local12.aFloat42 * local8.aFloat47 + local8.aFloat37 * local12.aFloat45;
		Static662.aFloat198 = local8.aFloat45 * local12.aFloat45 + local12.aFloat42 * local8.aFloat46 + local8.aFloat40 * local12.aFloat37;
		Static498.aFloat184 = local8.aFloat48 * local12.aFloat48 + local8.aFloat44 * local12.aFloat47 + local8.aFloat42 * local12.aFloat46;
		Static242.aFloat107 = local12.aFloat38 * local8.aFloat44 + local12.aFloat44 * local8.aFloat48 + local12.aFloat40 * local8.aFloat42;
		Static365.aFloat84 = local12.aFloat46 * local8.aFloat45 + local8.aFloat40 * local12.aFloat47 + local8.aFloat46 * local12.aFloat48;
		Static101.aFloat68 = local8.aFloat44 * local12.aFloat37 + local8.aFloat48 * local12.aFloat42 + local8.aFloat42 * local12.aFloat45;
		@Pc(201) float local201 = local12.aFloat39 + local8.aFloat39 * local12.aFloat45 + local8.aFloat41 * local12.aFloat37 + local8.aFloat43 * local12.aFloat42;
		Static390.aFloat155 = local12.aFloat40 * local8.aFloat37 + local8.aFloat38 * local12.aFloat38 + local8.aFloat47 * local12.aFloat44;
		Static267.aFloat118 = local12.aFloat46 * local8.aFloat37 + local12.aFloat48 * local8.aFloat47 + local12.aFloat47 * local8.aFloat38;
		@Pc(245) boolean local245 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass16_Sub2_4.anInt4396;
		@Pc(261) int local261 = this.aClass16_Sub2_4.anInt4377;
		if (!this.aBoolean93) {
			this.method1015();
		}
		@Pc(275) int local275 = this.aShort16 - this.aShort15 >> 1;
		@Pc(283) int local283 = this.aShort21 - this.aShort14 >> 1;
		@Pc(292) int local292 = this.aShort17 - this.aShort20 >> 1;
		@Pc(298) int local298 = this.aShort15 + local275;
		@Pc(303) int local303 = local283 + this.aShort14;
		@Pc(308) int local308 = local292 + this.aShort20;
		@Pc(314) int local314 = local298 - (local275 << arg4);
		@Pc(321) int local321 = local303 - (local283 << arg4);
		@Pc(327) int local327 = local308 - (local292 << arg4);
		@Pc(333) int local333 = (local275 << arg4) + local298;
		@Pc(339) int local339 = (local283 << arg4) + local303;
		@Pc(345) int local345 = (local292 << arg4) + local308;
		Static21.anIntArray14[0] = local314;
		Static387.anIntArray422[0] = local321;
		Static142.anIntArray342[0] = local327;
		Static21.anIntArray14[1] = local333;
		Static387.anIntArray422[1] = local321;
		Static21.anIntArray14[2] = local314;
		Static142.anIntArray342[1] = local327;
		Static387.anIntArray422[2] = local339;
		Static21.anIntArray14[3] = local333;
		Static142.anIntArray342[2] = local327;
		Static387.anIntArray422[3] = local339;
		Static142.anIntArray342[3] = local327;
		Static21.anIntArray14[4] = local314;
		Static387.anIntArray422[4] = local321;
		Static142.anIntArray342[4] = local345;
		Static21.anIntArray14[5] = local333;
		Static387.anIntArray422[5] = local321;
		Static21.anIntArray14[6] = local314;
		Static142.anIntArray342[5] = local345;
		Static387.anIntArray422[6] = local339;
		Static21.anIntArray14[7] = local333;
		Static142.anIntArray342[6] = local345;
		Static387.anIntArray422[7] = local339;
		Static142.anIntArray342[7] = local345;
		@Pc(474) float local474;
		@Pc(488) float local488;
		@Pc(502) float local502;
		@Pc(455) float local455;
		@Pc(450) float local450;
		@Pc(460) float local460;
		for (@Pc(443) int local443 = 0; local443 < 8; local443++) {
			local450 = (float) Static387.anIntArray422[local443];
			local455 = (float) Static21.anIntArray14[local443];
			local460 = (float) Static142.anIntArray342[local443];
			local474 = local33 + Static365.aFloat84 * local460 + local450 * Static267.aFloat118 + Static498.aFloat184 * local455;
			local488 = Static242.aFloat107 * local455 + local450 * Static390.aFloat155 + local460 * Static186.aFloat81 + local54;
			local502 = local450 * Static104.aFloat73 + local455 * Static101.aFloat68 + Static662.aFloat198 * local460 + local201;
			if ((float) this.aClass16_Sub2_4.anInt4389 <= local502) {
				if (arg0 > 0) {
					local502 = (float) arg0;
				}
				@Pc(526) float local526 = (float) local257 * local474 / local502 + (float) this.aClass16_Sub2_4.anInt4395;
				if (local526 < local247) {
					local247 = local526;
				}
				@Pc(544) float local544 = local488 * (float) local261 / local502 + (float) this.aClass16_Sub2_4.anInt4391;
				if (local249 < local526) {
					local249 = local526;
				}
				if (local544 < local251) {
					local251 = local544;
				}
				local245 = true;
				if (local253 < local544) {
					local253 = local544;
				}
			}
		}
		if (local245 && local247 < (float) arg1 && local249 > (float) arg1 && (float) arg2 > local251 && (float) arg2 < local253) {
			if (arg5) {
				return true;
			}
			if (this.aClass16_Sub2_4.anIntArray288.length < this.anInt1010) {
				this.aClass16_Sub2_4.anIntArray288 = new int[this.anInt1010];
				this.aClass16_Sub2_4.anIntArray287 = new int[this.anInt1010];
			}
			@Pc(617) int[] local617 = this.aClass16_Sub2_4.anIntArray288;
			@Pc(621) int[] local621 = this.aClass16_Sub2_4.anIntArray287;
			@Pc(697) int local697;
			for (@Pc(623) int local623 = 0; local623 < this.anInt995; local623++) {
				local455 = (float) this.anIntArray30[local623];
				local460 = (float) this.anIntArray28[local623];
				local450 = (float) this.anIntArray31[local623];
				local502 = local460 * Static662.aFloat198 + Static101.aFloat68 * local455 + Static104.aFloat73 * local450 + local201;
				local474 = local33 + local460 * Static365.aFloat84 + Static267.aFloat118 * local450 + Static498.aFloat184 * local455;
				local488 = local54 + local460 * Static186.aFloat81 + Static242.aFloat107 * local455 + local450 * Static390.aFloat155;
				@Pc(704) int local704;
				@Pc(706) int local706;
				@Pc(715) int local715;
				if ((float) this.aClass16_Sub2_4.anInt4389 <= local502) {
					if (arg0 > 0) {
						local502 = (float) arg0;
					}
					local697 = (int) ((float) this.aClass16_Sub2_4.anInt4395 + (float) local257 * local474 / local502);
					local704 = (int) (local488 * (float) local261 / local502 + (float) this.aClass16_Sub2_4.anInt4391);
					local706 = this.anIntArray29[local623];
					local715 = this.anIntArray29[local623 + 1];
					for (@Pc(782) int local782 = local706; local782 < local715; local782++) {
						@Pc(791) int local791 = this.aShortArray12[local782] - 1;
						if (local791 == -1) {
							break;
						}
						local617[local791] = local697;
						local621[local791] = local704;
					}
				} else {
					local697 = this.anIntArray29[local623];
					local704 = this.anIntArray29[local623 + 1];
					for (local706 = local697; local706 < local704; local706++) {
						local715 = this.aShortArray12[local706] - 1;
						if (local715 == -1) {
							break;
						}
						local617[this.aShortArray12[local706] - 1] = -999999;
					}
				}
			}
			for (local697 = 0; local697 < this.anInt1000; local697++) {
				if (local617[this.aShortArray19[local697]] != -999999 && local617[this.aShortArray13[local697]] != -999999 && local617[this.aShortArray18[local697]] != -999999 && this.method1026(local617[this.aShortArray18[local697]], local621[this.aShortArray18[local697]], arg1, local617[this.aShortArray13[local697]], local621[this.aShortArray13[local697]], local617[this.aShortArray19[local697]], arg2, local621[this.aShortArray19[local697]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!b", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray4 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt956; local12++) {
			this.anIntArray30[local12] <<= 0x4;
			this.anIntArray31[local12] <<= 0x4;
			this.anIntArray28[local12] <<= 0x4;
		}
		Static215.anInt6269 = 0;
		Static636.anInt9817 = 0;
		Static195.anInt3523 = 0;
		return true;
	}

	@OriginalMember(owner = "client!b", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass16_Sub2_4.anInterface5_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt1000; local11++) {
			if (this.aShortArray14[local11] == arg0) {
				this.aShortArray14[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class342 local47 = local9.method5193(arg0 & 0xFFFF);
			local37 = local47.aByte124;
			local35 = local47.aByte126;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class342 local67 = local9.method5193(arg1 & 0xFFFF);
			local55 = local67.aByte126;
			local57 = local67.aByte124;
			if (local67.aByte130 != 0 || local67.aByte127 != 0) {
				this.aBoolean94 = true;
			}
		}
		if (!(local37 != local57 | local35 != local55)) {
			return;
		}
		if (this.aClass101Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt985; local109++) {
				@Pc(116) Class101 local116 = this.aClass101Array1[local109];
				@Pc(121) Class365 local121 = this.aClass365Array1[local109];
				local121.anInt9558 = Static274.anIntArray337[this.aShortArray17[local116.anInt2499] & 0xFFFF] & 0xFFFFFF | local121.anInt9558 & 0xFF000000;
			}
		}
		if (this.aClass243_2 != null) {
			this.aClass243_2.anInterface26_5 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!sk;IZ)V")
	@Override
	public void method6889(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray15 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt995; local14++) {
			if ((arg1 & this.aShortArray15[local14]) != 0) {
				if (arg2) {
					arg0.method4287(this.anIntArray30[local14], this.anIntArray31[local14], this.anIntArray28[local14], local12);
				} else {
					arg0.method4286(this.anIntArray30[local14], this.anIntArray31[local14], this.anIntArray28[local14], local12);
				}
				this.anIntArray30[local14] = local12[0];
				this.anIntArray31[local14] = local12[1];
				this.anIntArray28[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort18 = (short) arg0;
		if (this.aClass243_2 != null) {
			this.aClass243_2.anInterface26_5 = null;
		}
		if (this.aClass243_3 != null) {
			this.aClass243_3.anInterface26_5 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean93) {
			this.method1015();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!b", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1000; local3++) {
			if (arg0 == this.aShortArray17[local3]) {
				this.aShortArray17[local3] = arg1;
			}
		}
		if (this.aClass101Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt985; local34++) {
				@Pc(41) Class101 local41 = this.aClass101Array1[local34];
				@Pc(46) Class365 local46 = this.aClass365Array1[local34];
				local46.anInt9558 = local46.anInt9558 & 0xFF000000 | Static274.anIntArray337[this.aShortArray17[local41.anInt2499] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass243_2 != null) {
			this.aClass243_2.anInterface26_5 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub2.anIntArray171[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub2.anIntArray170[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt995; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray31[local15] + local13 * this.anIntArray30[local15] >> 14;
			this.anIntArray31[local15] = local13 * this.anIntArray31[local15] - local9 * this.anIntArray30[local15] >> 14;
			this.anIntArray30[local15] = local34;
		}
		this.aBoolean93 = false;
		if (this.aClass243_4 != null) {
			this.aClass243_4.anInterface26_5 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZZLclient!b;Lclient!b;IB)Lclient!ka;")
	private Class28 method1018(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class28_Sub1 arg2, @OriginalArg(3) Class28_Sub1 arg3, @OriginalArg(4) int arg4) {
		arg2.aShort18 = this.aShort18;
		arg2.aShort19 = this.aShort19;
		arg2.aBoolean94 = this.aBoolean94;
		if ((arg4 & 0x100) == 0) {
			arg2.aBoolean95 = this.aBoolean95;
		} else {
			arg2.aBoolean95 = true;
		}
		arg2.aByte20 = 0;
		arg2.anInt1010 = this.anInt1010;
		arg2.anInt1016 = this.anInt1016;
		arg2.anInt996 = arg4;
		arg2.anInt985 = this.anInt985;
		arg2.anInt1000 = this.anInt1000;
		arg2.anInt995 = this.anInt995;
		arg2.anInt998 = this.anInt998;
		arg2.anInt956 = this.anInt956;
		@Pc(73) boolean local73 = Static643.method8446(this.anInt1016, arg4);
		@Pc(79) boolean local79 = Static304.method4692(arg4, this.anInt1016);
		@Pc(85) boolean local85 = Static430.method6355(arg4, this.anInt1016);
		@Pc(91) boolean local91 = local85 | local79 | local73;
		@Pc(202) int local202;
		if (local91) {
			if (!local73) {
				arg2.anIntArray30 = this.anIntArray30;
			} else if (arg3.anIntArray30 == null || this.anInt956 > arg3.anIntArray30.length) {
				arg2.anIntArray30 = arg3.anIntArray30 = new int[this.anInt956];
			} else {
				arg2.anIntArray30 = arg3.anIntArray30;
			}
			if (!local79) {
				arg2.anIntArray31 = this.anIntArray31;
			} else if (arg3.anIntArray31 == null || this.anInt956 > arg3.anIntArray31.length) {
				arg2.anIntArray31 = arg3.anIntArray31 = new int[this.anInt956];
			} else {
				arg2.anIntArray31 = arg3.anIntArray31;
			}
			if (!local85) {
				arg2.anIntArray28 = this.anIntArray28;
			} else if (arg3.anIntArray28 == null || arg3.anIntArray28.length < this.anInt956) {
				arg2.anIntArray28 = arg3.anIntArray28 = new int[this.anInt956];
			} else {
				arg2.anIntArray28 = arg3.anIntArray28;
			}
			for (local202 = 0; local202 < this.anInt956; local202++) {
				if (local73) {
					arg2.anIntArray30[local202] = this.anIntArray30[local202];
				}
				if (local79) {
					arg2.anIntArray31[local202] = this.anIntArray31[local202];
				}
				if (local85) {
					arg2.anIntArray28[local202] = this.anIntArray28[local202];
				}
			}
		} else {
			arg2.anIntArray30 = this.anIntArray30;
			arg2.anIntArray31 = this.anIntArray31;
			arg2.anIntArray28 = this.anIntArray28;
		}
		if (Static519.method7350(arg4, this.anInt1016)) {
			if (arg0) {
				arg2.aByte20 = (byte) (arg2.aByte20 | 0x1);
			}
			arg2.aClass243_4 = arg3.aClass243_4;
			arg2.aClass243_4.anInterface26_5 = this.aClass243_4.anInterface26_5;
			arg2.aClass243_4.aByte93 = this.aClass243_4.aByte93;
		} else if (Static433.method6369(this.anInt1016, arg4)) {
			arg2.aClass243_4 = this.aClass243_4;
		} else {
			arg2.aClass243_4 = null;
		}
		if (Static123.method2195(arg4, this.anInt1016)) {
			if (arg3.aShortArray17 == null || this.anInt1000 > arg3.aShortArray17.length) {
				arg2.aShortArray17 = arg3.aShortArray17 = new short[this.anInt1000];
			} else {
				arg2.aShortArray17 = arg3.aShortArray17;
			}
			for (local202 = 0; local202 < this.anInt1000; local202++) {
				arg2.aShortArray17[local202] = this.aShortArray17[local202];
			}
		} else {
			arg2.aShortArray17 = this.aShortArray17;
		}
		if (Static28.method920(arg4, this.anInt1016)) {
			if (arg3.aByteArray4 == null || this.anInt1000 > arg3.aByteArray4.length) {
				arg2.aByteArray4 = arg3.aByteArray4 = new byte[this.anInt1000];
			} else {
				arg2.aByteArray4 = arg3.aByteArray4;
			}
			for (local202 = 0; local202 < this.anInt1000; local202++) {
				arg2.aByteArray4[local202] = this.aByteArray4[local202];
			}
		} else {
			arg2.aByteArray4 = this.aByteArray4;
		}
		if (Static179.method2975(arg4, this.anInt1016)) {
			if (arg0) {
				arg2.aByte20 = (byte) (arg2.aByte20 | 0x2);
			}
			arg2.aClass243_2 = arg3.aClass243_2;
			arg2.aClass243_2.anInterface26_5 = this.aClass243_2.anInterface26_5;
			arg2.aClass243_2.aByte93 = this.aClass243_2.aByte93;
		} else if (Static473.method6806(this.anInt1016, arg4)) {
			arg2.aClass243_2 = this.aClass243_2;
		} else {
			arg2.aClass243_2 = null;
		}
		@Pc(582) int local582;
		if (Static561.method7661(arg4, this.anInt1016)) {
			if (arg3.aShortArray20 == null || this.anInt1010 > arg3.aShortArray20.length) {
				local202 = this.anInt1010;
				arg2.aShortArray11 = arg3.aShortArray11 = new short[local202];
				arg2.aShortArray21 = arg3.aShortArray21 = new short[local202];
				arg2.aShortArray20 = arg3.aShortArray20 = new short[local202];
			} else {
				arg2.aShortArray20 = arg3.aShortArray20;
				arg2.aShortArray21 = arg3.aShortArray21;
				arg2.aShortArray11 = arg3.aShortArray11;
			}
			if (this.aClass183_1 == null) {
				for (local202 = 0; local202 < this.anInt1010; local202++) {
					arg2.aShortArray20[local202] = this.aShortArray20[local202];
					arg2.aShortArray11[local202] = this.aShortArray11[local202];
					arg2.aShortArray21[local202] = this.aShortArray21[local202];
				}
			} else {
				if (arg3.aClass183_1 == null) {
					arg3.aClass183_1 = new Class183();
				}
				@Pc(570) Class183 local570 = arg2.aClass183_1 = arg3.aClass183_1;
				if (local570.aShortArray111 == null || local570.aShortArray111.length < this.anInt1010) {
					local582 = this.anInt1010;
					local570.aShortArray109 = new short[local582];
					local570.aByteArray50 = new byte[local582];
					local570.aShortArray110 = new short[local582];
					local570.aShortArray111 = new short[local582];
				}
				for (local582 = 0; local582 < this.anInt1010; local582++) {
					arg2.aShortArray20[local582] = this.aShortArray20[local582];
					arg2.aShortArray11[local582] = this.aShortArray11[local582];
					arg2.aShortArray21[local582] = this.aShortArray21[local582];
					local570.aShortArray111[local582] = this.aClass183_1.aShortArray111[local582];
					local570.aShortArray109[local582] = this.aClass183_1.aShortArray109[local582];
					local570.aShortArray110[local582] = this.aClass183_1.aShortArray110[local582];
					local570.aByteArray50[local582] = this.aClass183_1.aByteArray50[local582];
				}
			}
			arg2.aByteArray3 = this.aByteArray3;
		} else {
			arg2.aClass183_1 = this.aClass183_1;
			arg2.aShortArray11 = this.aShortArray11;
			arg2.aShortArray20 = this.aShortArray20;
			arg2.aByteArray3 = this.aByteArray3;
			arg2.aShortArray21 = this.aShortArray21;
		}
		if (Static293.method4566(arg4, this.anInt1016)) {
			if (arg0) {
				arg2.aByte20 = (byte) (arg2.aByte20 | 0x4);
			}
			arg2.aClass243_3 = arg3.aClass243_3;
			arg2.aClass243_3.anInterface26_5 = this.aClass243_3.anInterface26_5;
			arg2.aClass243_3.aByte93 = this.aClass243_3.aByte93;
		} else if (Static81.method1704(arg4, this.anInt1016)) {
			arg2.aClass243_3 = this.aClass243_3;
		} else {
			arg2.aClass243_3 = null;
		}
		if (Static281.method4451(this.anInt1016, arg4)) {
			if (arg3.aFloatArray21 == null || this.anInt1000 > arg3.aFloatArray21.length) {
				local202 = this.anInt1010;
				arg2.aFloatArray22 = arg3.aFloatArray22 = new float[local202];
				arg2.aFloatArray21 = arg3.aFloatArray21 = new float[local202];
			} else {
				arg2.aFloatArray21 = arg3.aFloatArray21;
				arg2.aFloatArray22 = arg3.aFloatArray22;
			}
			for (local202 = 0; local202 < this.anInt1010; local202++) {
				arg2.aFloatArray21[local202] = this.aFloatArray21[local202];
				arg2.aFloatArray22[local202] = this.aFloatArray22[local202];
			}
		} else {
			arg2.aFloatArray22 = this.aFloatArray22;
			arg2.aFloatArray21 = this.aFloatArray21;
		}
		if (Static282.method4461(this.anInt1016, arg4)) {
			if (arg0) {
				arg2.aByte20 = (byte) (arg2.aByte20 | 0x8);
			}
			arg2.aClass243_1 = arg3.aClass243_1;
			arg2.aClass243_1.aByte93 = this.aClass243_1.aByte93;
			arg2.aClass243_1.anInterface26_5 = this.aClass243_1.anInterface26_5;
		} else if (Static164.method2757(arg4, this.anInt1016)) {
			arg2.aClass243_1 = this.aClass243_1;
		} else {
			arg2.aClass243_1 = null;
		}
		if (Static555.method7593(arg4, this.anInt1016)) {
			if (arg3.aShortArray19 == null || this.anInt1000 > arg3.aShortArray19.length) {
				local202 = this.anInt1000;
				arg2.aShortArray18 = arg3.aShortArray18 = new short[local202];
				arg2.aShortArray19 = arg3.aShortArray19 = new short[local202];
				arg2.aShortArray13 = arg3.aShortArray13 = new short[local202];
			} else {
				arg2.aShortArray13 = arg3.aShortArray13;
				arg2.aShortArray18 = arg3.aShortArray18;
				arg2.aShortArray19 = arg3.aShortArray19;
			}
			for (local202 = 0; local202 < this.anInt1000; local202++) {
				arg2.aShortArray19[local202] = this.aShortArray19[local202];
				arg2.aShortArray13[local202] = this.aShortArray13[local202];
				arg2.aShortArray18[local202] = this.aShortArray18[local202];
			}
		} else {
			arg2.aShortArray19 = this.aShortArray19;
			arg2.aShortArray13 = this.aShortArray13;
			arg2.aShortArray18 = this.aShortArray18;
		}
		if (Static204.method3247(this.anInt1016, arg4)) {
			if (arg0) {
				arg2.aByte20 = (byte) (arg2.aByte20 | 0x10);
			}
			arg2.aClass187_1 = arg3.aClass187_1;
			arg2.aClass187_1.anInterface17_4 = this.aClass187_1.anInterface17_4;
		} else if (Static557.method7624(this.anInt1016, arg4)) {
			arg2.aClass187_1 = this.aClass187_1;
		} else {
			arg2.aClass187_1 = null;
		}
		if (Static403.method5756(arg4, this.anInt1016)) {
			if (arg3.aShortArray14 == null || arg3.aShortArray14.length < this.anInt1000) {
				local202 = this.anInt1000;
				arg2.aShortArray14 = arg3.aShortArray14 = new short[local202];
			} else {
				arg2.aShortArray14 = arg3.aShortArray14;
			}
			for (local202 = 0; local202 < this.anInt1000; local202++) {
				arg2.aShortArray14[local202] = this.aShortArray14[local202];
			}
		} else {
			arg2.aShortArray14 = this.aShortArray14;
		}
		if (!Static382.method5596(arg4, this.anInt1016)) {
			arg2.aClass365Array1 = this.aClass365Array1;
		} else if (arg3.aClass365Array1 == null || arg3.aClass365Array1.length < this.anInt985) {
			local202 = this.anInt985;
			arg2.aClass365Array1 = arg3.aClass365Array1 = new Class365[local202];
			for (local582 = 0; local582 < this.anInt985; local582++) {
				arg2.aClass365Array1[local582] = this.aClass365Array1[local582].method8091();
			}
		} else {
			arg2.aClass365Array1 = arg3.aClass365Array1;
			for (local202 = 0; local202 < this.anInt985; local202++) {
				arg2.aClass365Array1[local202].method8088(this.aClass365Array1[local202]);
			}
		}
		if (this.aBoolean93) {
			arg2.aShort16 = this.aShort16;
			arg2.aBoolean93 = true;
			arg2.aShort21 = this.aShort21;
			arg2.aShort20 = this.aShort20;
			arg2.aShort22 = this.aShort22;
			arg2.aShort14 = this.aShort14;
			arg2.aShort17 = this.aShort17;
			arg2.aShort23 = this.aShort23;
			arg2.aShort15 = this.aShort15;
		} else {
			arg2.aBoolean93 = false;
		}
		arg2.anIntArrayArray3 = this.anIntArrayArray3;
		arg2.anIntArrayArray2 = this.anIntArrayArray2;
		arg2.aClass101Array1 = this.aClass101Array1;
		arg2.aShortArray15 = this.aShortArray15;
		arg2.anIntArray29 = this.anIntArray29;
		arg2.anIntArrayArray4 = this.anIntArrayArray4;
		arg2.aShortArray16 = this.aShortArray16;
		arg2.aShortArray12 = this.aShortArray12;
		arg2.aClass261Array1 = this.aClass261Array1;
		arg2.aClass298Array1 = this.aClass298Array1;
		arg2.anIntArray33 = this.anIntArray33;
		return arg2;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!sk;ZI)Z")
	@Override
	public boolean method6887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method1016(-1, arg0, arg1, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BZ)V")
	private void method1019(@OriginalArg(1) boolean arg0) {
		@Pc(22) boolean local22 = this.aClass243_2 != null && this.aClass243_2.anInterface26_5 == null;
		@Pc(33) boolean local33 = this.aClass243_3 != null && this.aClass243_3.anInterface26_5 == null;
		@Pc(44) boolean local44 = this.aClass243_4 != null && this.aClass243_4.anInterface26_5 == null;
		@Pc(55) boolean local55 = this.aClass243_1 != null && this.aClass243_1.anInterface26_5 == null;
		if (arg0) {
			local22 &= (this.aByte20 & 0x2) != 0;
			local44 &= (this.aByte20 & 0x1) != 0;
			local55 &= (this.aByte20 & 0x8) != 0;
			local33 &= (this.aByte20 & 0x4) != 0;
		}
		@Pc(109) byte local109 = 0;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (local44) {
			local109 = 12;
		}
		if (local22) {
			local113 = local109;
			local109 = (byte) (local109 + 4);
		}
		if (local33) {
			local115 = local109;
			local109 = (byte) (local109 + 12);
		}
		if (local55) {
			local117 = local109;
			local109 = (byte) (local109 + 8);
		}
		if (local109 == 0) {
			return;
		}
		if (this.aClass16_Sub2_4.aClass3_Sub17_Sub1_1.aByteArray59.length < this.anInt1010 * local109) {
			this.aClass16_Sub2_4.aClass3_Sub17_Sub1_1 = new Class3_Sub17_Sub1((this.anInt1010 + 100) * local109);
		} else {
			this.aClass16_Sub2_4.aClass3_Sub17_Sub1_1.lb = 0;
		}
		@Pc(196) Class3_Sub17_Sub1 local196 = this.aClass16_Sub2_4.aClass3_Sub17_Sub1_1;
		@Pc(204) int local204;
		@Pc(213) int local213;
		@Pc(241) int local241;
		@Pc(250) int local250;
		if (local44) {
			@Pc(220) int local220;
			@Pc(227) int local227;
			@Pc(232) int local232;
			@Pc(239) int local239;
			if (this.aClass16_Sub2_4.aBoolean322) {
				for (local204 = 0; local204 < this.anInt995; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray30[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray31[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray28[local204]);
					local232 = this.anIntArray29[local204];
					local239 = this.anIntArray29[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray12[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.lb = local250 * local109;
						local196.method4854(local213);
						local196.method4854(local220);
						local196.method4854(local227);
					}
				}
			} else {
				for (local204 = 0; local204 < this.anInt995; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray30[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray31[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray28[local204]);
					local232 = this.anIntArray29[local204];
					local239 = this.anIntArray29[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray12[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.lb = local109 * local250;
						local196.method4893(local213);
						local196.method4893(local220);
						local196.method4893(local227);
					}
				}
			}
		}
		@Pc(486) float local486;
		@Pc(384) short[] local384;
		@Pc(393) short[] local393;
		@Pc(390) short[] local390;
		@Pc(387) byte[] local387;
		@Pc(544) float local544;
		if (local22) {
			if (this.aClass243_3 == null) {
				if (this.aClass183_1 == null) {
					local384 = this.aShortArray20;
					local387 = this.aByteArray3;
					local390 = this.aShortArray21;
					local393 = this.aShortArray11;
				} else {
					local393 = this.aClass183_1.aShortArray109;
					local390 = this.aClass183_1.aShortArray110;
					local387 = this.aClass183_1.aByteArray50;
					local384 = this.aClass183_1.aShortArray111;
				}
				@Pc(417) float local417 = this.aClass16_Sub2_4.aFloatArray42[0];
				@Pc(423) float local423 = this.aClass16_Sub2_4.aFloatArray42[1];
				@Pc(429) float local429 = this.aClass16_Sub2_4.aFloatArray42[2];
				@Pc(433) float local433 = this.aClass16_Sub2_4.aFloat86;
				@Pc(443) float local443 = this.aClass16_Sub2_4.aFloat93 * 768.0F / (float) this.aShort18;
				@Pc(453) float local453 = this.aClass16_Sub2_4.aFloat101 * 768.0F / (float) this.aShort18;
				for (@Pc(455) int local455 = 0; local455 < this.anInt1000; local455++) {
					@Pc(475) int local475 = this.method1021(this.aByteArray4[local455], this.aShort19, this.aShortArray14[local455], this.aShortArray17[local455]);
					local486 = this.aClass16_Sub2_4.aFloat88 * (float) (local475 >> 16 & 0xFF);
					@Pc(491) short local491 = this.aShortArray19[local455];
					@Pc(502) float local502 = (float) (local475 >> 8 & 0xFF) * this.aClass16_Sub2_4.aFloat91;
					@Pc(511) float local511 = (float) (local475 >>> 24) * this.aClass16_Sub2_4.aFloat94;
					@Pc(516) short local516 = (short) local387[local491];
					if (local516 == 0) {
						local544 = ((float) local393[local491] * local423 + (float) local384[local491] * local417 + (float) local390[local491] * local429) * 0.0026041667F;
					} else {
						local544 = ((float) local393[local491] * local423 + local417 * (float) local384[local491] + local429 * (float) local390[local491]) / (float) (local516 * 256);
					}
					@Pc(581) float local581 = local433 + (local544 < 0.0F ? local453 : local443) * local544;
					@Pc(586) int local586 = (int) (local581 * local511);
					if (local586 < 0) {
						local586 = 0;
					} else if (local586 > 255) {
						local586 = 255;
					}
					@Pc(605) int local605 = (int) (local486 * local581);
					@Pc(610) int local610 = (int) (local502 * local581);
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					local196.lb = local113 + local109 * local491;
					if (local610 < 0) {
						local610 = 0;
					} else if (local610 > 255) {
						local610 = 255;
					}
					local196.method4849(local586);
					local196.method4849(local605);
					local196.method4849(local610);
					local196.method4849(255 - (this.aByteArray4[local455] & 0xFF));
					local491 = this.aShortArray13[local455];
					local516 = (short) local387[local491];
					if (local516 == 0) {
						local544 = ((float) local390[local491] * local429 + (float) local393[local491] * local423 + local417 * (float) local384[local491]) * 0.0026041667F;
					} else {
						local544 = ((float) local384[local491] * local417 + (float) local393[local491] * local423 + local429 * (float) local390[local491]) / (float) (local516 * 256);
					}
					local581 = (local544 < 0.0F ? local453 : local443) * local544 + local433;
					local586 = (int) (local511 * local581);
					if (local586 < 0) {
						local586 = 0;
					} else if (local586 > 255) {
						local586 = 255;
					}
					local605 = (int) (local581 * local486);
					local610 = (int) (local502 * local581);
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					local196.lb = local491 * local109 + local113;
					if (local610 < 0) {
						local610 = 0;
					} else if (local610 > 255) {
						local610 = 255;
					}
					local196.method4849(local586);
					local196.method4849(local605);
					local196.method4849(local610);
					local196.method4849(255 - (this.aByteArray4[local455] & 0xFF));
					local491 = this.aShortArray18[local455];
					local516 = (short) local387[local491];
					if (local516 == 0) {
						local544 = ((float) local390[local491] * local429 + local423 * (float) local393[local491] + local417 * (float) local384[local491]) * 0.0026041667F;
					} else {
						local544 = (local429 * (float) local390[local491] + (float) local384[local491] * local417 + (float) local393[local491] * local423) / (float) (local516 * 256);
					}
					local581 = local433 + (local544 < 0.0F ? local453 : local443) * local544;
					local586 = (int) (local511 * local581);
					if (local586 < 0) {
						local586 = 0;
					} else if (local586 > 255) {
						local586 = 255;
					}
					local605 = (int) (local486 * local581);
					local610 = (int) (local502 * local581);
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					local196.lb = local491 * local109 + local113;
					if (local610 < 0) {
						local610 = 0;
					} else if (local610 > 255) {
						local610 = 255;
					}
					local196.method4849(local586);
					local196.method4849(local605);
					local196.method4849(local610);
					local196.method4849(255 - (this.aByteArray4[local455] & 0xFF));
				}
			} else {
				for (local204 = 0; local204 < this.anInt1000; local204++) {
					local213 = this.method1021(this.aByteArray4[local204], this.aShort19, this.aShortArray14[local204], this.aShortArray17[local204]);
					local196.lb = this.aShortArray19[local204] * local109 + local113;
					local196.method4854(local213);
					local196.lb = local109 * this.aShortArray13[local204] + local113;
					local196.method4854(local213);
					local196.lb = local113 + local109 * this.aShortArray18[local204];
					local196.method4854(local213);
				}
			}
		}
		if (local33) {
			if (this.aClass183_1 == null) {
				local390 = this.aShortArray21;
				local393 = this.aShortArray11;
				local387 = this.aByteArray3;
				local384 = this.aShortArray20;
			} else {
				local393 = this.aClass183_1.aShortArray109;
				local387 = this.aClass183_1.aByteArray50;
				local384 = this.aClass183_1.aShortArray111;
				local390 = this.aClass183_1.aShortArray110;
			}
			@Pc(1126) float local1126 = 3.0F / (float) this.aShort18;
			local544 = 3.0F / (float) (this.aShort18 / 2 + this.aShort18);
			local196.lb = local115;
			if (this.aClass16_Sub2_4.aBoolean322) {
				for (local241 = 0; local241 < this.anInt1010; local241++) {
					local250 = local387[local241] & 0xFF;
					if (local250 == 0) {
						local196.method4226(local544 * (float) local384[local241]);
						local196.method4226((float) local393[local241] * local544);
						local196.method4226(local544 * (float) local390[local241]);
					} else {
						local486 = local1126 / (float) local250;
						local196.method4226(local486 * (float) local384[local241]);
						local196.method4226(local486 * (float) local393[local241]);
						local196.method4226((float) local390[local241] * local486);
					}
					local196.lb += local109 - 12;
				}
			} else {
				for (local241 = 0; local241 < this.anInt1010; local241++) {
					local250 = local387[local241] & 0xFF;
					if (local250 == 0) {
						local196.method4229(local544 * (float) local384[local241]);
						local196.method4229(local544 * (float) local393[local241]);
						local196.method4229(local544 * (float) local390[local241]);
					} else {
						local486 = local1126 / (float) local250;
						local196.method4229(local486 * (float) local384[local241]);
						local196.method4229(local486 * (float) local393[local241]);
						local196.method4229(local486 * (float) local390[local241]);
					}
					local196.lb += local109 - 12;
				}
			}
		}
		if (local55) {
			local196.lb = local117;
			if (this.aClass16_Sub2_4.aBoolean322) {
				for (local204 = 0; local204 < this.anInt1010; local204++) {
					local196.method4226(this.aFloatArray21[local204]);
					local196.method4226(this.aFloatArray22[local204]);
					local196.lb += local109 - 8;
				}
			} else {
				for (local204 = 0; local204 < this.anInt1010; local204++) {
					local196.method4229(this.aFloatArray21[local204]);
					local196.method4229(this.aFloatArray22[local204]);
					local196.lb += local109 - 8;
				}
			}
		}
		local196.lb = this.anInt1010 * local109;
		@Pc(1445) Interface26 local1445;
		if (arg0) {
			if (this.anInterface26_1 == null) {
				this.anInterface26_1 = this.aClass16_Sub2_4.method3643(local109, true, local196.aByteArray59, local196.lb);
			} else {
				this.anInterface26_1.method5257(local196.aByteArray59, local109, local196.lb);
			}
			this.aByte20 = 0;
			local1445 = this.anInterface26_1;
		} else {
			local1445 = this.aClass16_Sub2_4.method3643(local109, false, local196.aByteArray59, local196.lb);
			this.aBoolean92 = true;
		}
		if (local44) {
			this.aClass243_4.anInterface26_5 = local1445;
			this.aClass243_4.aByte93 = 0;
		}
		if (local55) {
			this.aClass243_1.aByte93 = local117;
			this.aClass243_1.anInterface26_5 = local1445;
		}
		if (local22) {
			this.aClass243_2.aByte93 = local113;
			this.aClass243_2.anInterface26_5 = local1445;
		}
		if (local33) {
			this.aClass243_3.aByte93 = local115;
			this.aClass243_3.anInterface26_5 = local1445;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!sk;Lclient!eea;II)V")
	@Override
	public void method6894(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class23_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1010 == 0) {
			return;
		}
		@Pc(13) Class25_Sub1 local13 = this.aClass16_Sub2_4.aClass25_Sub1_3;
		@Pc(16) Class25_Sub1 local16 = (Class25_Sub1) arg0;
		if (!this.aBoolean93) {
			this.method1015();
		}
		Static104.aFloat73 = local16.aFloat47 * local13.aFloat42 + local13.aFloat37 * local16.aFloat38 + local13.aFloat45 * local16.aFloat37;
		Static334.aFloat150 = local13.aFloat39 + local16.aFloat39 * local13.aFloat45 + local16.aFloat41 * local13.aFloat37 + local16.aFloat43 * local13.aFloat42;
		@Pc(69) float local69 = Static104.aFloat73 * (float) this.aShort14 + Static334.aFloat150;
		@Pc(77) float local77 = (float) this.aShort21 * Static104.aFloat73 + Static334.aFloat150;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.aShort22;
			local94 = (float) -this.aShort22 + local77;
		} else {
			local94 = local69 - (float) this.aShort22;
			local87 = (float) this.aShort22 + local77;
		}
		if (this.aClass16_Sub2_4.aFloat87 <= local94 || (float) this.aClass16_Sub2_4.anInt4389 >= local87) {
			return;
		}
		Static267.aFloat118 = local13.aFloat47 * local16.aFloat38 + local13.aFloat48 * local16.aFloat47 + local13.aFloat46 * local16.aFloat37;
		Static370.aFloat152 = local13.aFloat43 + local16.aFloat41 * local13.aFloat47 + local16.aFloat43 * local13.aFloat48 + local16.aFloat39 * local13.aFloat46;
		@Pc(170) float local170 = Static370.aFloat152 + (float) this.aShort14 * Static267.aFloat118;
		@Pc(178) float local178 = Static267.aFloat118 * (float) this.aShort21 + Static370.aFloat152;
		@Pc(205) float local205;
		@Pc(193) float local193;
		if (local178 < local170) {
			local193 = (float) this.aClass16_Sub2_4.anInt4396 * ((float) this.aShort22 + local170);
			local205 = ((float) -this.aShort22 + local178) * (float) this.aClass16_Sub2_4.anInt4396;
		} else {
			local193 = (float) this.aClass16_Sub2_4.anInt4396 * (local178 + (float) this.aShort22);
			local205 = (float) this.aClass16_Sub2_4.anInt4396 * ((float) -this.aShort22 + local170);
		}
		if (this.aClass16_Sub2_4.aFloat102 <= local205 / (float) arg2 || local193 / (float) arg2 <= this.aClass16_Sub2_4.aFloat103) {
			return;
		}
		Static515.aFloat187 = local13.aFloat41 + local13.aFloat44 * local16.aFloat43 + local13.aFloat38 * local16.aFloat41 + local16.aFloat39 * local13.aFloat40;
		Static390.aFloat155 = local16.aFloat37 * local13.aFloat40 + local13.aFloat38 * local16.aFloat38 + local13.aFloat44 * local16.aFloat47;
		@Pc(297) float local297 = Static390.aFloat155 * (float) this.aShort14 + Static515.aFloat187;
		@Pc(305) float local305 = (float) this.aShort21 * Static390.aFloat155 + Static515.aFloat187;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local305 < local297) {
			local320 = ((float) -this.aShort22 + local305) * (float) this.aClass16_Sub2_4.anInt4377;
			local331 = (float) this.aClass16_Sub2_4.anInt4377 * (local297 + (float) this.aShort22);
		} else {
			local320 = (float) this.aClass16_Sub2_4.anInt4377 * (local297 - (float) this.aShort22);
			local331 = (float) this.aClass16_Sub2_4.anInt4377 * ((float) this.aShort22 + local305);
		}
		if (local320 / (float) arg2 >= this.aClass16_Sub2_4.aFloat95 || this.aClass16_Sub2_4.aFloat89 >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass101Array1 != null) {
			Static101.aFloat68 = local13.aFloat45 * local16.aFloat42 + local16.aFloat48 * local13.aFloat42 + local13.aFloat37 * local16.aFloat44;
			Static365.aFloat84 = local16.aFloat45 * local13.aFloat46 + local16.aFloat46 * local13.aFloat48 + local13.aFloat47 * local16.aFloat40;
			Static498.aFloat184 = local16.aFloat42 * local13.aFloat46 + local13.aFloat47 * local16.aFloat44 + local16.aFloat48 * local13.aFloat48;
			Static242.aFloat107 = local16.aFloat48 * local13.aFloat44 + local13.aFloat38 * local16.aFloat44 + local16.aFloat42 * local13.aFloat40;
			Static186.aFloat81 = local16.aFloat46 * local13.aFloat44 + local13.aFloat38 * local16.aFloat40 + local13.aFloat40 * local16.aFloat45;
			Static662.aFloat198 = local13.aFloat42 * local16.aFloat46 + local13.aFloat37 * local16.aFloat40 + local16.aFloat45 * local13.aFloat45;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.aShort15 + this.aShort16 >> 1;
			@Pc(508) int local508 = this.aShort17 + this.aShort20 >> 1;
			@Pc(527) int local527 = (int) (Static370.aFloat152 + (float) local500 * Static498.aFloat184 + Static267.aFloat118 * (float) this.aShort14 + Static365.aFloat84 * (float) local508);
			@Pc(546) int local546 = (int) (Static186.aFloat81 * (float) local508 + Static515.aFloat187 + Static242.aFloat107 * (float) local500 + Static390.aFloat155 * (float) this.aShort14);
			@Pc(565) int local565 = (int) (Static662.aFloat198 * (float) local508 + (float) local500 * Static101.aFloat68 + Static334.aFloat150 + Static104.aFloat73 * (float) this.aShort14);
			@Pc(584) int local584 = (int) (Static498.aFloat184 * (float) local500 + Static370.aFloat152 + (float) this.aShort21 * Static267.aFloat118 + (float) local508 * Static365.aFloat84);
			@Pc(603) int local603 = (int) (Static515.aFloat187 + Static242.aFloat107 * (float) local500 + (float) this.aShort21 * Static390.aFloat155 + Static186.aFloat81 * (float) local508);
			arg1.anInt2467 = this.aClass16_Sub2_4.anInt4396 * local527 / arg2 + this.aClass16_Sub2_4.anInt4395;
			arg1.anInt2464 = this.aClass16_Sub2_4.anInt4391 + this.aClass16_Sub2_4.anInt4377 * local546 / arg2;
			arg1.anInt2465 = this.aClass16_Sub2_4.anInt4377 * local603 / arg2 + this.aClass16_Sub2_4.anInt4391;
			@Pc(661) int local661 = (int) (Static662.aFloat198 * (float) local508 + Static334.aFloat150 + (float) local500 * Static101.aFloat68 + Static104.aFloat73 * (float) this.aShort21);
			arg1.anInt2463 = this.aClass16_Sub2_4.anInt4395 + local584 * this.aClass16_Sub2_4.anInt4396 / arg2;
			if (local565 >= this.aClass16_Sub2_4.anInt4389 || local661 >= this.aClass16_Sub2_4.anInt4389) {
				arg1.anInt2466 = this.aClass16_Sub2_4.anInt4395 + (local527 + this.aShort22) * this.aClass16_Sub2_4.anInt4396 / arg2 - arg1.anInt2467;
				arg1.aBoolean206 = true;
			}
		}
		this.aClass16_Sub2_4.method3695((float) arg2);
		this.aClass16_Sub2_4.method3666();
		this.aClass16_Sub2_4.method3691(local16);
		this.method1027();
		this.aClass16_Sub2_4.method3686();
		this.method1023();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!vg;I)V")
	private void method1020(@OriginalArg(0) Class3_Sub6_Sub12_Sub2 arg0) {
		if (this.aClass16_Sub2_4.anIntArray288.length < this.anInt1010) {
			this.aClass16_Sub2_4.anIntArray288 = new int[this.anInt1010];
			this.aClass16_Sub2_4.anIntArray287 = new int[this.anInt1010];
		}
		@Pc(36) int[] local36 = this.aClass16_Sub2_4.anIntArray288;
		@Pc(40) int[] local40 = this.aClass16_Sub2_4.anIntArray287;
		@Pc(68) int local68;
		@Pc(107) int local107;
		@Pc(116) int local116;
		for (@Pc(42) int local42 = 0; local42 < this.anInt995; local42++) {
			local68 = (this.anIntArray30[local42] - (this.aClass16_Sub2_4.anInt4376 * this.anIntArray31[local42] >> 8) >> this.aClass16_Sub2_4.anInt4364) - arg0.anInt9800;
			@Pc(93) int local93 = (this.anIntArray28[local42] - (this.aClass16_Sub2_4.anInt4402 * this.anIntArray31[local42] >> 8) >> this.aClass16_Sub2_4.anInt4364) - arg0.anInt9798;
			@Pc(98) int local98 = this.anIntArray29[local42];
			@Pc(105) int local105 = this.anIntArray29[local42 + 1];
			for (local107 = local98; local107 < local105; local107++) {
				local116 = this.aShortArray12[local107] - 1;
				if (local116 == -1) {
					break;
				}
				local36[local116] = local68;
				local40[local116] = local93;
			}
		}
		for (local68 = 0; local68 < this.anInt998; local68++) {
			if (this.aByteArray4 == null || this.aByteArray4[local68] <= 128) {
				@Pc(160) short local160 = this.aShortArray19[local68];
				@Pc(165) short local165 = this.aShortArray13[local68];
				@Pc(170) short local170 = this.aShortArray18[local68];
				local107 = local36[local160];
				local116 = local36[local165];
				@Pc(182) int local182 = local36[local170];
				@Pc(186) int local186 = local40[local160];
				@Pc(190) int local190 = local40[local165];
				@Pc(194) int local194 = local40[local170];
				if (-((local182 - local116) * (-local186 + local190)) + (local107 - local116) * (local190 - local194) > 0) {
					arg0.method8349(local116, local182, local186, local194, local190, local107);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub2.anIntArray171[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub2.anIntArray170[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt995; local15++) {
			local33 = local13 * this.anIntArray30[local15] + local9 * this.anIntArray28[local15] >> 14;
			this.anIntArray28[local15] = local13 * this.anIntArray28[local15] - local9 * this.anIntArray30[local15] >> 14;
			this.anIntArray30[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt1010; local33++) {
			@Pc(87) int local87 = this.aShortArray20[local33] * local13 + local9 * this.aShortArray21[local33] >> 14;
			this.aShortArray21[local33] = (short) (this.aShortArray21[local33] * local13 - local9 * this.aShortArray20[local33] >> 14);
			this.aShortArray20[local33] = (short) local87;
		}
		if (this.aClass243_3 == null && this.aClass243_2 != null) {
			this.aClass243_2.anInterface26_5 = null;
		}
		if (this.aClass243_3 != null) {
			this.aClass243_3.anInterface26_5 = null;
		}
		if (this.aClass243_4 != null) {
			this.aClass243_4.anInterface26_5 = null;
		}
		this.aBoolean93 = false;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt1000; local3++) {
			local12 = this.aShortArray17[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 -= -((arg1 - local24) * arg3 >> 7);
			}
			if (arg0 != -1) {
				local18 -= -(arg3 * (arg0 - local18) >> 7);
			}
			@Pc(58) int local58 = local12 & 0x7F;
			if (arg2 != -1) {
				local58 += (arg2 - local58) * arg3 >> 7;
			}
			this.aShortArray17[local3] = (short) (local24 << 7 | local18 << 10 | local58);
		}
		if (this.aClass101Array1 != null) {
			for (local12 = 0; local12 < this.anInt985; local12++) {
				@Pc(111) Class101 local111 = this.aClass101Array1[local12];
				@Pc(116) Class365 local116 = this.aClass365Array1[local12];
				local116.anInt9558 = Static274.anIntArray337[this.aShortArray17[local111.anInt2499] & 0xFFFF] & 0xFFFFFF | local116.anInt9558 & 0xFF000000;
			}
		}
		if (this.aClass243_2 != null) {
			this.aClass243_2.anInterface26_5 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean93) {
			this.method1015();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BISII)I")
	private int method1021(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18 = Static274.anIntArray337[Static326.method5080(arg3, arg1)];
		if (arg2 != -1) {
			@Pc(30) Class342 local30 = this.aClass16_Sub2_4.anInterface5_12.method5193(arg2 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte126 & 0xFF;
			@Pc(46) int local46;
			@Pc(66) int local66;
			if (local35 != 0) {
				if (arg1 < 0) {
					local46 = 0;
				} else if (arg1 > 127) {
					local46 = 16777215;
				} else {
					local46 = arg1 * 131586;
				}
				if (local35 == 256) {
					local18 = local46;
				} else {
					local66 = 256 - local35;
					local18 = (local35 * (local46 & 0xFF00FF) + (local18 & 0xFF00FF) * local66 & 0xFF00FF00) + ((local18 & 0xFF00) * local66 + local35 * (local46 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local46 = local30.aByte124 & 0xFF;
			if (local46 != 0) {
				local46 += 256;
				@Pc(119) int local119 = local46 * (local18 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local66 = local46 * (local18 >> 8 & 0xFF);
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(143) int local143 = local46 * (local18 & 0xFF);
				if (local143 > 65535) {
					local143 = 65535;
				}
				local18 = (local143 >> 8) + (local66 & 0xFF00) + (local119 << 8 & 0xFF00B8);
			}
		}
		return (local18 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()[Lclient!qr;")
	@Override
	public Class298[] method6911() {
		return this.aClass298Array1;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()V")
	@Override
	protected void method6907() {
	}

	@OriginalMember(owner = "client!b", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt996;
	}

	@OriginalMember(owner = "client!b", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt956; local3++) {
			this.anIntArray30[local3] = this.anIntArray30[local3] + 7 >> 4;
			this.anIntArray31[local3] = this.anIntArray31[local3] + 7 >> 4;
			this.anIntArray28[local3] = this.anIntArray28[local3] + 7 >> 4;
		}
		if (this.aClass243_4 != null) {
			this.aClass243_4.anInterface26_5 = null;
		}
		this.aBoolean93 = false;
	}

	@OriginalMember(owner = "client!b", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt995; local3++) {
			if (arg0 != 128) {
				this.anIntArray30[local3] = arg0 * this.anIntArray30[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray31[local3] = arg1 * this.anIntArray31[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray28[local3] = arg2 * this.anIntArray28[local3] >> 7;
			}
		}
		if (this.aClass243_4 != null) {
			this.aClass243_4.anInterface26_5 = null;
		}
		this.aBoolean93 = false;
	}

	@OriginalMember(owner = "client!b", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean93) {
			this.method1015();
		}
		return this.aShort21;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
	@Override
	public void method6892() {
		if (this.anInt1010 <= 0 || this.anInt998 <= 0) {
			return;
		}
		this.method1019(false);
		if ((this.aByte20 & 0x10) == 0 && this.aClass187_1.anInterface17_4 == null) {
			this.method1024(false);
		}
		this.method1014();
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	private void method1023() {
		if (this.aClass101Array1 == null) {
			return;
		}
		@Pc(12) Class25_Sub1 local12 = this.aClass16_Sub2_4.aClass25_Sub1_2;
		this.aClass16_Sub2_4.method3656();
		this.aClass16_Sub2_4.C(!this.aBoolean95);
		this.aClass16_Sub2_4.method3637(false);
		this.aClass16_Sub2_4.method3629(this.aClass16_Sub2_4.aClass243_5, (Class243) null, this.aClass16_Sub2_4.aClass243_6, (Class243) null);
		for (@Pc(44) int local44 = 0; local44 < this.anInt985; local44++) {
			@Pc(51) Class101 local51 = this.aClass101Array1[local44];
			@Pc(56) Class365 local56 = this.aClass365Array1[local44];
			if (!local51.aBoolean209 || !this.aClass16_Sub2_4.method8186()) {
				@Pc(84) float local84 = (float) (this.anIntArray30[local51.anInt2501] + this.anIntArray30[local51.anInt2500] + this.anIntArray30[local51.anInt2498]) * 0.3333333F;
				@Pc(107) float local107 = (float) (this.anIntArray31[local51.anInt2501] + this.anIntArray31[local51.anInt2500] + this.anIntArray31[local51.anInt2498]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray28[local51.anInt2498] + this.anIntArray28[local51.anInt2500] + this.anIntArray28[local51.anInt2501]) * 0.3333333F;
				@Pc(142) float local142 = local128 * Static365.aFloat84 + local107 * Static267.aFloat118 + Static498.aFloat184 * local84 + Static370.aFloat152;
				@Pc(156) float local156 = Static515.aFloat187 + Static186.aFloat81 * local128 + local107 * Static390.aFloat155 + Static242.aFloat107 * local84;
				@Pc(170) float local170 = Static334.aFloat150 + local84 * Static101.aFloat68 + local107 * Static104.aFloat73 + local128 * Static662.aFloat198;
				@Pc(191) float local191 = (float) (1.0D / Math.sqrt((double) (local142 * local142 + local156 * local156 + local170 * local170))) * (float) local51.anInt2497;
				local12.method841((float) local56.anInt9565 + local142 - local191 * local142, local56.anInt9566 * local51.aShort28 >> 7, local191 * local170 - local170, -local156 + (float) local56.anInt9557 + local191 * local156, local56.anInt9562, local51.aShort30 * local56.anInt9559 >> 7);
				this.aClass16_Sub2_4.method3634(local12);
				@Pc(243) int local243 = local56.anInt9558;
				OpenGL.glColor4ub((byte) (local243 >> 16), (byte) (local243 >> 8), (byte) local243, (byte) (local243 >> 24));
				this.aClass16_Sub2_4.method3687(local51.aShort29);
				this.aClass16_Sub2_4.method3654(local51.aByte29);
				this.aClass16_Sub2_4.method3623(4);
			}
		}
		this.aClass16_Sub2_4.C(true);
		this.aClass16_Sub2_4.method3686();
	}

	@OriginalMember(owner = "client!b", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub2.anIntArray171[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub2.anIntArray170[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt995; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray31[local15] - local9 * this.anIntArray28[local15] >> 14;
			this.anIntArray28[local15] = this.anIntArray28[local15] * local13 + this.anIntArray31[local15] * local9 >> 14;
			this.anIntArray31[local15] = local33;
		}
		if (this.aClass243_4 != null) {
			this.aClass243_4.anInterface26_5 = null;
		}
		this.aBoolean93 = false;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(BZ)V")
	private void method1024(@OriginalArg(1) boolean arg0) {
		if (this.anInt998 * 6 <= this.aClass16_Sub2_4.aClass3_Sub17_Sub1_1.aByteArray59.length) {
			this.aClass16_Sub2_4.aClass3_Sub17_Sub1_1.lb = 0;
		} else {
			this.aClass16_Sub2_4.aClass3_Sub17_Sub1_1 = new Class3_Sub17_Sub1(this.anInt998 * 6 + 600);
		}
		@Pc(38) Class3_Sub17_Sub1 local38 = this.aClass16_Sub2_4.aClass3_Sub17_Sub1_1;
		@Pc(44) int local44;
		if (this.aClass16_Sub2_4.aBoolean322) {
			for (local44 = 0; local44 < this.anInt998; local44++) {
				local38.method4876(this.aShortArray19[local44]);
				local38.method4876(this.aShortArray13[local44]);
				local38.method4876(this.aShortArray18[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt998; local44++) {
				local38.method4843(this.aShortArray19[local44]);
				local38.method4843(this.aShortArray13[local44]);
				local38.method4843(this.aShortArray18[local44]);
			}
		}
		if (local38.lb == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface17_1 == null) {
				this.anInterface17_1 = this.aClass16_Sub2_4.method3613(true, local38.lb, local38.aByteArray59);
			} else {
				this.anInterface17_1.method7366(local38.aByteArray59, local38.lb);
			}
			this.aClass187_1.anInterface17_4 = this.anInterface17_1;
		} else {
			this.aClass187_1.anInterface17_4 = this.aClass16_Sub2_4.method3613(false, local38.lb, local38.aByteArray59);
		}
		if (!arg0) {
			this.aBoolean92 = true;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6905(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			Static195.anInt3523 = 0;
			local29 = 0;
			Static215.anInt6269 = 0;
			Static636.anInt9817 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray4.length) {
					local51 = this.anIntArrayArray4[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static195.anInt3523 += this.anIntArray30[local59];
						Static636.anInt9817 += this.anIntArray31[local59];
						local29++;
						Static215.anInt6269 += this.anIntArray28[local59];
					}
				}
			}
			if (local29 <= 0) {
				Static636.anInt9817 = local17;
				Static215.anInt6269 = local21;
				Static195.anInt3523 = local25;
			} else {
				Static636.anInt9817 = local17 + Static636.anInt9817 / local29;
				Static195.anInt3523 = local25 + Static195.anInt3523 / local29;
				Static215.anInt6269 = Static215.anInt6269 / local29 + local21;
			}
			return;
		}
		@Pc(158) int[] local158;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			local17 = arg3 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray4.length > local35) {
					local158 = this.anIntArrayArray4[local35];
					for (local160 = 0; local160 < local158.length; local160++) {
						local53 = local158[local160];
						this.anIntArray30[local53] += local25;
						this.anIntArray31[local53] += local17;
						this.anIntArray28[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(275) int local275;
		@Pc(293) int local293;
		@Pc(750) int local750;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray4.length > local35) {
					local158 = this.anIntArrayArray4[local35];
					if ((arg5 & 0x1) == 0) {
						for (local160 = 0; local160 < local158.length; local160++) {
							local53 = local158[local160];
							this.anIntArray30[local53] -= Static195.anInt3523;
							this.anIntArray31[local53] -= Static636.anInt9817;
							this.anIntArray28[local53] -= Static215.anInt6269;
							if (arg4 != 0) {
								local59 = Class3_Sub7_Sub2.anIntArray171[arg4];
								local275 = Class3_Sub7_Sub2.anIntArray170[arg4];
								local293 = this.anIntArray30[local53] * local275 + this.anIntArray31[local53] * local59 + 16383 >> 14;
								this.anIntArray31[local53] = this.anIntArray31[local53] * local275 + 16383 - this.anIntArray30[local53] * local59 >> 14;
								this.anIntArray30[local53] = local293;
							}
							if (arg2 != 0) {
								local59 = Class3_Sub7_Sub2.anIntArray171[arg2];
								local275 = Class3_Sub7_Sub2.anIntArray170[arg2];
								local293 = this.anIntArray31[local53] * local275 + 16383 - local59 * this.anIntArray28[local53] >> 14;
								this.anIntArray28[local53] = this.anIntArray31[local53] * local59 + this.anIntArray28[local53] * local275 + 16383 >> 14;
								this.anIntArray31[local53] = local293;
							}
							if (arg3 != 0) {
								local59 = Class3_Sub7_Sub2.anIntArray171[arg3];
								local275 = Class3_Sub7_Sub2.anIntArray170[arg3];
								local293 = this.anIntArray30[local53] * local275 + this.anIntArray28[local53] * local59 + 16383 >> 14;
								this.anIntArray28[local53] = local275 * this.anIntArray28[local53] + 16383 - local59 * this.anIntArray30[local53] >> 14;
								this.anIntArray30[local53] = local293;
							}
							this.anIntArray30[local53] += Static195.anInt3523;
							this.anIntArray31[local53] += Static636.anInt9817;
							this.anIntArray28[local53] += Static215.anInt6269;
						}
					} else {
						for (local160 = 0; local160 < local158.length; local160++) {
							local53 = local158[local160];
							this.anIntArray30[local53] -= Static195.anInt3523;
							this.anIntArray31[local53] -= Static636.anInt9817;
							this.anIntArray28[local53] -= Static215.anInt6269;
							if (arg2 != 0) {
								local59 = Class3_Sub7_Sub2.anIntArray171[arg2];
								local275 = Class3_Sub7_Sub2.anIntArray170[arg2];
								local293 = this.anIntArray31[local53] * local275 + 16383 - local59 * this.anIntArray28[local53] >> 14;
								this.anIntArray28[local53] = local59 * this.anIntArray31[local53] + local275 * this.anIntArray28[local53] + 16383 >> 14;
								this.anIntArray31[local53] = local293;
							}
							if (arg4 != 0) {
								local59 = Class3_Sub7_Sub2.anIntArray171[arg4];
								local275 = Class3_Sub7_Sub2.anIntArray170[arg4];
								local293 = local275 * this.anIntArray30[local53] + local59 * this.anIntArray31[local53] + 16383 >> 14;
								this.anIntArray31[local53] = local275 * this.anIntArray31[local53] + 16383 - this.anIntArray30[local53] * local59 >> 14;
								this.anIntArray30[local53] = local293;
							}
							if (arg3 != 0) {
								local59 = Class3_Sub7_Sub2.anIntArray171[arg3];
								local275 = Class3_Sub7_Sub2.anIntArray170[arg3];
								local293 = local59 * this.anIntArray28[local53] + local275 * this.anIntArray30[local53] + 16383 >> 14;
								this.anIntArray28[local53] = local275 * this.anIntArray28[local53] + 16383 - local59 * this.anIntArray30[local53] >> 14;
								this.anIntArray30[local53] = local293;
							}
							this.anIntArray30[local53] += Static195.anInt3523;
							this.anIntArray31[local53] += Static636.anInt9817;
							this.anIntArray28[local53] += Static215.anInt6269;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray4.length > local41) {
						local51 = this.anIntArrayArray4[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local275 = this.anIntArray29[local59];
							local293 = this.anIntArray29[local59 + 1];
							for (local750 = local275; local750 < local293; local750++) {
								@Pc(759) int local759 = this.aShortArray12[local750] - 1;
								if (local759 == -1) {
									break;
								}
								@Pc(769) int local769;
								@Pc(773) int local773;
								@Pc(791) int local791;
								if (arg4 != 0) {
									local769 = Class3_Sub7_Sub2.anIntArray171[arg4];
									local773 = Class3_Sub7_Sub2.anIntArray170[arg4];
									local791 = local773 * this.aShortArray20[local759] + local769 * this.aShortArray11[local759] + 16383 >> 14;
									this.aShortArray11[local759] = (short) (local773 * this.aShortArray11[local759] + 16383 - local769 * this.aShortArray20[local759] >> 14);
									this.aShortArray20[local759] = (short) local791;
								}
								if (arg2 != 0) {
									local769 = Class3_Sub7_Sub2.anIntArray171[arg2];
									local773 = Class3_Sub7_Sub2.anIntArray170[arg2];
									local791 = this.aShortArray11[local759] * local773 + 16383 - this.aShortArray21[local759] * local769 >> 14;
									this.aShortArray21[local759] = (short) (local769 * this.aShortArray11[local759] + local773 * this.aShortArray21[local759] + 16383 >> 14);
									this.aShortArray11[local759] = (short) local791;
								}
								if (arg3 != 0) {
									local769 = Class3_Sub7_Sub2.anIntArray171[arg3];
									local773 = Class3_Sub7_Sub2.anIntArray170[arg3];
									local791 = local769 * this.aShortArray21[local759] + local773 * this.aShortArray20[local759] + 16383 >> 14;
									this.aShortArray21[local759] = (short) (this.aShortArray21[local759] * local773 + 16383 - local769 * this.aShortArray20[local759] >> 14);
									this.aShortArray20[local759] = (short) local791;
								}
							}
						}
					}
				}
				if (this.aClass243_3 == null && this.aClass243_2 != null) {
					this.aClass243_2.anInterface26_5 = null;
				}
				if (this.aClass243_3 != null) {
					this.aClass243_3.anInterface26_5 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray4.length > local35) {
					local158 = this.anIntArrayArray4[local35];
					for (local160 = 0; local160 < local158.length; local160++) {
						local53 = local158[local160];
						this.anIntArray30[local53] -= Static195.anInt3523;
						this.anIntArray31[local53] -= Static636.anInt9817;
						this.anIntArray28[local53] -= Static215.anInt6269;
						this.anIntArray30[local53] = this.anIntArray30[local53] * arg2 >> 7;
						this.anIntArray31[local53] = this.anIntArray31[local53] * arg3 >> 7;
						this.anIntArray28[local53] = this.anIntArray28[local53] * arg4 >> 7;
						this.anIntArray30[local53] += Static195.anInt3523;
						this.anIntArray31[local53] += Static636.anInt9817;
						this.anIntArray28[local53] += Static215.anInt6269;
					}
				}
			}
		} else {
			@Pc(1205) Class101 local1205;
			@Pc(1210) Class365 local1210;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray2.length) {
							local158 = this.anIntArrayArray2[local35];
							for (local160 = 0; local160 < local158.length; local160++) {
								local53 = local158[local160];
								local59 = arg2 * 8 + (this.aByteArray4[local53] & 0xFF);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray4[local53] = (byte) local59;
							}
							if (local158.length > 0 && this.aClass243_2 != null) {
								this.aClass243_2.anInterface26_5 = null;
							}
						}
					}
					if (this.aClass101Array1 != null) {
						for (local35 = 0; local35 < this.anInt985; local35++) {
							local1205 = this.aClass101Array1[local35];
							local1210 = this.aClass365Array1[local35];
							local1210.anInt9558 = local1210.anInt9558 & 0xFFFFFF | 255 - (this.aByteArray4[local1205.anInt2499] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1454) Class365 local1454;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray3.length) {
								local158 = this.anIntArrayArray3[local35];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1454 = this.aClass365Array1[local158[local160]];
									local1454.anInt9565 += arg2;
									local1454.anInt9557 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray3.length > local35) {
								local158 = this.anIntArrayArray3[local35];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1454 = this.aClass365Array1[local158[local160]];
									local1454.anInt9559 = local1454.anInt9559 * arg3 >> 7;
									local1454.anInt9566 = arg2 * local1454.anInt9566 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray3.length > local35) {
							local158 = this.anIntArrayArray3[local35];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1454 = this.aClass365Array1[local158[local160]];
								local1454.anInt9562 = arg2 + local1454.anInt9562 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray2.length > local35) {
						local158 = this.anIntArrayArray2[local35];
						for (local160 = 0; local160 < local158.length; local160++) {
							local53 = local158[local160];
							local59 = this.aShortArray17[local53] & 0xFFFF;
							local275 = local59 >> 10 & 0x3F;
							local293 = local59 >> 7 & 0x7;
							@Pc(1292) int local1292 = local275 + arg2 & 0x3F;
							local293 += arg3 / 4;
							local750 = local59 & 0x7F;
							local750 += arg4;
							if (local293 < 0) {
								local293 = 0;
							} else if (local293 > 7) {
								local293 = 7;
							}
							if (local750 < 0) {
								local750 = 0;
							} else if (local750 > 127) {
								local750 = 127;
							}
							this.aShortArray17[local53] = (short) (local293 << 7 | local1292 << 10 | local750);
						}
						if (local158.length > 0 && this.aClass243_2 != null) {
							this.aClass243_2.anInterface26_5 = null;
						}
					}
				}
				if (this.aClass101Array1 != null) {
					for (local35 = 0; local35 < this.anInt985; local35++) {
						local1205 = this.aClass101Array1[local35];
						local1210 = this.aClass365Array1[local35];
						local1210.anInt9558 = Static274.anIntArray337[this.aShortArray17[local1205.anInt2499] & 0xFFFF] & 0xFFFFFF | local1210.anInt9558 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(FIIIBIILclient!dc;FJ)S")
	private short method1025(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class73 arg6, @OriginalArg(8) float arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray29[arg5];
		@Pc(17) int local17 = this.anIntArray29[arg5 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(32) int local32 = local10; local32 < local17; local32++) {
			@Pc(39) short local39 = this.aShortArray12[local32];
			if (local39 == 0) {
				local19 = local32;
				break;
			}
			if (arg8 == Static241.aLongArray8[local32]) {
				return (short) (local39 - 1);
			}
		}
		this.aShortArray12[local19] = (short) (this.anInt1010 + 1);
		Static241.aLongArray8[local19] = arg8;
		this.aShortArray20[this.anInt1010] = (short) arg2;
		this.aShortArray11[this.anInt1010] = (short) arg3;
		this.aShortArray21[this.anInt1010] = (short) arg4;
		this.aByteArray3[this.anInt1010] = (byte) arg1;
		this.aFloatArray21[this.anInt1010] = arg0;
		this.aFloatArray22[this.anInt1010] = arg7;
		return (short) this.anInt1010++;
	}

	@OriginalMember(owner = "client!b", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean94;
	}

	@OriginalMember(owner = "client!b", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean93) {
			this.method1015();
		}
		return this.aShort23;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method6888(@OriginalArg(0) Class25 arg0) {
		@Pc(8) Class25_Sub1 local8 = (Class25_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass261Array1 != null) {
			for (local13 = 0; local13 < this.aClass261Array1.length; local13++) {
				@Pc(20) Class261 local20 = this.aClass261Array1[local13];
				@Pc(22) Class261 local22 = local20;
				if (local20.aClass261_2 != null) {
					local22 = local20.aClass261_2;
				}
				local22.anInt7118 = (int) (local8.aFloat43 + (float) this.anIntArray31[local20.anInt7121] * local8.aFloat47 + local8.aFloat48 * (float) this.anIntArray30[local20.anInt7121] + (float) this.anIntArray28[local20.anInt7121] * local8.aFloat46);
				local22.anInt7128 = (int) ((float) this.anIntArray28[local20.anInt7121] * local8.aFloat40 + (float) this.anIntArray31[local20.anInt7121] * local8.aFloat38 + local8.aFloat44 * (float) this.anIntArray30[local20.anInt7121] + local8.aFloat41);
				local22.anInt7130 = (int) (local8.aFloat39 + (float) this.anIntArray31[local20.anInt7121] * local8.aFloat37 + local8.aFloat42 * (float) this.anIntArray30[local20.anInt7121] + local8.aFloat45 * (float) this.anIntArray28[local20.anInt7121]);
				local22.anInt7117 = (int) (local8.aFloat43 + (float) this.anIntArray28[local20.anInt7134] * local8.aFloat46 + (float) this.anIntArray30[local20.anInt7134] * local8.aFloat48 + (float) this.anIntArray31[local20.anInt7134] * local8.aFloat47);
				local22.anInt7123 = (int) (local8.aFloat40 * (float) this.anIntArray28[local20.anInt7134] + (float) this.anIntArray31[local20.anInt7134] * local8.aFloat38 + local8.aFloat44 * (float) this.anIntArray30[local20.anInt7134] + local8.aFloat41);
				local22.anInt7129 = (int) ((float) this.anIntArray31[local20.anInt7134] * local8.aFloat37 + local8.aFloat42 * (float) this.anIntArray30[local20.anInt7134] + local8.aFloat45 * (float) this.anIntArray28[local20.anInt7134] + local8.aFloat39);
				local22.anInt7127 = (int) ((float) this.anIntArray30[local20.anInt7124] * local8.aFloat48 + (float) this.anIntArray31[local20.anInt7124] * local8.aFloat47 + (float) this.anIntArray28[local20.anInt7124] * local8.aFloat46 + local8.aFloat43);
				local22.anInt7125 = (int) (local8.aFloat41 + local8.aFloat44 * (float) this.anIntArray30[local20.anInt7124] + (float) this.anIntArray31[local20.anInt7124] * local8.aFloat38 + (float) this.anIntArray28[local20.anInt7124] * local8.aFloat40);
				local22.anInt7135 = (int) (local8.aFloat39 + (float) this.anIntArray31[local20.anInt7124] * local8.aFloat37 + local8.aFloat42 * (float) this.anIntArray30[local20.anInt7124] + local8.aFloat45 * (float) this.anIntArray28[local20.anInt7124]);
			}
		}
		if (this.aClass298Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass298Array1.length; local13++) {
			@Pc(361) Class298 local361 = this.aClass298Array1[local13];
			@Pc(363) Class298 local363 = local361;
			if (local361.aClass298_1 != null) {
				local363 = local361.aClass298_1;
			}
			if (local361.aClass25_7 == null) {
				local361.aClass25_7 = local8.method4292();
			} else {
				local361.aClass25_7.method4297(local8);
			}
			local363.anInt8373 = (int) (local8.aFloat43 + local8.aFloat47 * (float) this.anIntArray31[local361.anInt8371] + (float) this.anIntArray30[local361.anInt8371] * local8.aFloat48 + (float) this.anIntArray28[local361.anInt8371] * local8.aFloat46);
			local363.anInt8378 = (int) ((float) this.anIntArray28[local361.anInt8371] * local8.aFloat40 + (float) this.anIntArray31[local361.anInt8371] * local8.aFloat38 + local8.aFloat44 * (float) this.anIntArray30[local361.anInt8371] + local8.aFloat41);
			local363.anInt8379 = (int) (local8.aFloat42 * (float) this.anIntArray30[local361.anInt8371] + local8.aFloat37 * (float) this.anIntArray31[local361.anInt8371] + (float) this.anIntArray28[local361.anInt8371] * local8.aFloat45 + local8.aFloat39);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!sk;ZII)Z")
	@Override
	public boolean method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method1016(arg5, arg0, arg1, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()Z")
	@Override
	public boolean method6899() {
		if (this.aShortArray14 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray14.length; local12++) {
			if (this.aShortArray14[local12] != -1 && !this.aClass16_Sub2_4.anInterface5_12.method5197(this.aShortArray14[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!b", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean93) {
			this.method1015();
		}
		return this.aShort22;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub2.anIntArray171[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub2.anIntArray170[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt995; local15++) {
			@Pc(33) int local33 = this.anIntArray28[local15] * local9 + local13 * this.anIntArray30[local15] >> 14;
			this.anIntArray28[local15] = local13 * this.anIntArray28[local15] - this.anIntArray30[local15] * local9 >> 14;
			this.anIntArray30[local15] = local33;
		}
		if (this.aClass243_4 != null) {
			this.aClass243_4.anInterface26_5 = null;
		}
		this.aBoolean93 = false;
	}

	@OriginalMember(owner = "client!b", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt995; local7++) {
			if (arg0 != 0) {
				this.anIntArray30[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray31[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray28[local7] += arg2;
			}
		}
		this.aBoolean93 = false;
		if (this.aClass243_4 != null) {
			this.aClass243_4.anInterface26_5 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort19 = (short) arg0;
		if (this.aClass243_2 != null) {
			this.aClass243_2.anInterface26_5 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!b", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt995; local3++) {
			this.anIntArray28[local3] = -this.anIntArray28[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1010; local29++) {
			this.aShortArray21[local29] = (short) -this.aShortArray21[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt1000; local52++) {
			@Pc(59) short local59 = this.aShortArray19[local52];
			this.aShortArray19[local52] = this.aShortArray18[local52];
			this.aShortArray18[local52] = local59;
		}
		if (this.aClass243_3 == null && this.aClass243_2 != null) {
			this.aClass243_2.anInterface26_5 = null;
		}
		if (this.aClass243_3 != null) {
			this.aClass243_3.anInterface26_5 = null;
		}
		this.aBoolean93 = false;
		if (this.aClass187_1 != null) {
			this.aClass187_1.anInterface17_4 = null;
		}
		if (this.aClass243_4 != null) {
			this.aClass243_4.anInterface26_5 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBIIIIII)Z")
	private boolean method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg7 && arg4 > arg6 && arg1 > arg6) {
			return false;
		} else if (arg6 > arg7 && arg6 > arg4 && arg1 < arg6) {
			return false;
		} else if (arg5 > arg2 && arg2 < arg3 && arg2 < arg0) {
			return false;
		} else {
			return arg2 <= arg5 || arg2 <= arg3 || arg0 >= arg2;
		}
	}

	@OriginalMember(owner = "client!b", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static195.anInt3523 = 0;
			local26 = 0;
			Static636.anInt9817 = 0;
			Static215.anInt6269 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray4.length) {
					local52 = this.anIntArrayArray4[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray15 == null || (this.aShortArray15[local60] & arg6) != 0) {
							Static195.anInt3523 += this.anIntArray30[local60];
							Static636.anInt9817 += this.anIntArray31[local60];
							local26++;
							Static215.anInt6269 += this.anIntArray28[local60];
						}
					}
				}
			}
			if (local26 <= 0) {
				Static195.anInt3523 = arg2;
				Static636.anInt9817 = arg3;
				Static215.anInt6269 = arg4;
			} else {
				Static215.anInt6269 = arg4 + Static215.anInt6269 / local26;
				Static553.aBoolean666 = true;
				Static636.anInt9817 = Static636.anInt9817 / local26 + arg3;
				Static195.anInt3523 = Static195.anInt3523 / local26 + arg2;
			}
			return;
		}
		@Pc(249) int[] local249;
		@Pc(251) int local251;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg7[2] * arg4 + arg2 * arg7[0] + arg7[1] * arg3 + 8192 >> 14;
				local32 = arg2 * arg7[3] + arg7[4] * arg3 + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
				arg4 = local38;
				arg2 = local26;
				arg3 = local32;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray4.length > local32) {
					local249 = this.anIntArrayArray4[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local54 = local249[local251];
						if (this.aShortArray15 == null || (arg6 & this.aShortArray15[local54]) != 0) {
							this.anIntArray30[local54] += arg2;
							this.anIntArray31[local54] += arg3;
							this.anIntArray28[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(384) int local384;
		@Pc(403) int local403;
		@Pc(636) int local636;
		@Pc(645) int local645;
		@Pc(654) int local654;
		@Pc(658) int local658;
		@Pc(676) int local676;
		@Pc(1020) int local1020;
		@Pc(1028) int local1028;
		@Pc(1183) int local1183;
		@Pc(1208) int local1208;
		@Pc(1212) int local1212;
		@Pc(1221) int local1221;
		@Pc(1226) int local1226;
		@Pc(1230) int local1230;
		@Pc(1234) int local1234;
		@Pc(1236) int local1236;
		@Pc(1369) int[] local1369;
		@Pc(1371) int local1371;
		@Pc(1375) int local1375;
		@Pc(1379) int local1379;
		@Pc(1381) int local1381;
		@Pc(1509) int local1509;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray4.length > local32) {
						local249 = this.anIntArrayArray4[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local54 = local249[local251];
							if (this.aShortArray15 == null || (arg6 & this.aShortArray15[local54]) != 0) {
								this.anIntArray30[local54] -= Static195.anInt3523;
								this.anIntArray31[local54] -= Static636.anInt9817;
								this.anIntArray28[local54] -= Static215.anInt6269;
								if (arg4 != 0) {
									local60 = Class3_Sub7_Sub2.anIntArray171[arg4];
									local384 = Class3_Sub7_Sub2.anIntArray170[arg4];
									local403 = this.anIntArray31[local54] * local60 + this.anIntArray30[local54] * local384 + 16383 >> 14;
									this.anIntArray31[local54] = this.anIntArray31[local54] * local384 + 16383 - this.anIntArray30[local54] * local60 >> 14;
									this.anIntArray30[local54] = local403;
								}
								if (arg2 != 0) {
									local60 = Class3_Sub7_Sub2.anIntArray171[arg2];
									local384 = Class3_Sub7_Sub2.anIntArray170[arg2];
									local403 = local384 * this.anIntArray31[local54] + 16383 - local60 * this.anIntArray28[local54] >> 14;
									this.anIntArray28[local54] = local60 * this.anIntArray31[local54] + this.anIntArray28[local54] * local384 + 16383 >> 14;
									this.anIntArray31[local54] = local403;
								}
								if (arg3 != 0) {
									local60 = Class3_Sub7_Sub2.anIntArray171[arg3];
									local384 = Class3_Sub7_Sub2.anIntArray170[arg3];
									local403 = local384 * this.anIntArray30[local54] + this.anIntArray28[local54] * local60 + 16383 >> 14;
									this.anIntArray28[local54] = local384 * this.anIntArray28[local54] + 16383 - this.anIntArray30[local54] * local60 >> 14;
									this.anIntArray30[local54] = local403;
								}
								this.anIntArray30[local54] += Static195.anInt3523;
								this.anIntArray31[local54] += Static636.anInt9817;
								this.anIntArray28[local54] += Static215.anInt6269;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray4.length > local38) {
							local52 = this.anIntArrayArray4[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray15 == null || (this.aShortArray15[local60] & arg6) != 0) {
									local384 = this.anIntArray29[local60];
									local403 = this.anIntArray29[local60 + 1];
									for (local636 = local384; local636 < local403; local636++) {
										local645 = this.aShortArray12[local636] - 1;
										if (local645 == -1) {
											break;
										}
										if (arg4 != 0) {
											local654 = Class3_Sub7_Sub2.anIntArray171[arg4];
											local658 = Class3_Sub7_Sub2.anIntArray170[arg4];
											local676 = local658 * this.aShortArray20[local645] + this.aShortArray11[local645] * local654 + 16383 >> 14;
											this.aShortArray11[local645] = (short) (local658 * this.aShortArray11[local645] + 16383 - local654 * this.aShortArray20[local645] >> 14);
											this.aShortArray20[local645] = (short) local676;
										}
										if (arg2 != 0) {
											local654 = Class3_Sub7_Sub2.anIntArray171[arg2];
											local658 = Class3_Sub7_Sub2.anIntArray170[arg2];
											local676 = this.aShortArray11[local645] * local658 + 16383 - local654 * this.aShortArray21[local645] >> 14;
											this.aShortArray21[local645] = (short) (local654 * this.aShortArray11[local645] + local658 * this.aShortArray21[local645] + 16383 >> 14);
											this.aShortArray11[local645] = (short) local676;
										}
										if (arg3 != 0) {
											local654 = Class3_Sub7_Sub2.anIntArray171[arg3];
											local658 = Class3_Sub7_Sub2.anIntArray170[arg3];
											local676 = local654 * this.aShortArray21[local645] + local658 * this.aShortArray20[local645] + 16383 >> 14;
											this.aShortArray21[local645] = (short) (local658 * this.aShortArray21[local645] + 16383 - this.aShortArray20[local645] * local654 >> 14);
											this.aShortArray20[local645] = (short) local676;
										}
									}
								}
							}
						}
					}
					if (this.aClass243_3 == null && this.aClass243_2 != null) {
						this.aClass243_2.anInterface26_5 = null;
					}
					if (this.aClass243_3 != null) {
						this.aClass243_3.anInterface26_5 = null;
						return;
					}
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local251 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static553.aBoolean666) {
					local384 = Static195.anInt3523 * arg7[0] + arg7[3] * Static636.anInt9817 + arg7[6] * Static215.anInt6269 + 8192 >> 14;
					local403 = Static215.anInt6269 * arg7[7] + arg7[4] * Static636.anInt9817 + arg7[1] * Static195.anInt3523 + 8192 >> 14;
					local384 += local251;
					local636 = Static215.anInt6269 * arg7[8] + Static195.anInt3523 * arg7[2] + arg7[5] * Static636.anInt9817 + 8192 >> 14;
					local403 += local54;
					Static195.anInt3523 = local384;
					Static636.anInt9817 = local403;
					local636 += local60;
					Static215.anInt6269 = local636;
					Static553.aBoolean666 = false;
				}
				@Pc(988) int[] local988 = new int[9];
				local403 = Class3_Sub7_Sub2.anIntArray170[arg2];
				local636 = Class3_Sub7_Sub2.anIntArray171[arg2];
				local645 = Class3_Sub7_Sub2.anIntArray170[arg3];
				local654 = Class3_Sub7_Sub2.anIntArray171[arg3];
				local658 = Class3_Sub7_Sub2.anIntArray170[arg4];
				local676 = Class3_Sub7_Sub2.anIntArray171[arg4];
				local1020 = local658 * local636 + 8192 >> 14;
				local1028 = local636 * local676 + 8192 >> 14;
				local988[6] = -local654 * local658 + local1028 * local645 + 8192 >> 14;
				local988[4] = local658 * local403 + 8192 >> 14;
				local988[7] = local645 * local1020 + local654 * local676 + 8192 >> 14;
				local988[1] = -local645 * local676 + local654 * local1020 + 8192 >> 14;
				local988[5] = -local636;
				local988[8] = local645 * local403 + 8192 >> 14;
				local988[3] = local403 * local676 + 8192 >> 14;
				local988[2] = local403 * local654 + 8192 >> 14;
				local988[0] = local1028 * local654 + local658 * local645 + 8192 >> 14;
				@Pc(1157) int local1157 = -Static195.anInt3523 * local988[0] + -Static636.anInt9817 * local988[1] + -Static215.anInt6269 * local988[2] + 8192 >> 14;
				local1183 = -Static636.anInt9817 * local988[4] + local988[3] * -Static195.anInt3523 + local988[5] * -Static215.anInt6269 + 8192 >> 14;
				local1208 = -Static215.anInt6269 * local988[8] + -Static636.anInt9817 * local988[7] + local988[6] * -Static195.anInt3523 + 8192 >> 14;
				local1212 = Static195.anInt3523 + local1157;
				@Pc(1217) int local1217 = local1183 + Static636.anInt9817;
				local1221 = local1208 + Static215.anInt6269;
				@Pc(1224) int[] local1224 = new int[9];
				for (local1226 = 0; local1226 < 3; local1226++) {
					for (local1230 = 0; local1230 < 3; local1230++) {
						local1234 = 0;
						for (local1236 = 0; local1236 < 3; local1236++) {
							local1234 += local988[local1226 * 3 + local1236] * arg7[local1236 + local1230 * 3];
						}
						local1224[local1226 * 3 + local1230] = local1234 + 8192 >> 14;
					}
				}
				local1230 = local60 * local988[2] + local251 * local988[0] + local988[1] * local54 + 8192 >> 14;
				local1234 = local988[3] * local251 + local54 * local988[4] + local988[5] * local60 + 8192 >> 14;
				local1236 = local54 * local988[7] + local251 * local988[6] + local60 * local988[8] + 8192 >> 14;
				local1230 += local1212;
				local1234 += local1217;
				local1236 += local1221;
				local1369 = new int[9];
				for (local1371 = 0; local1371 < 3; local1371++) {
					for (local1375 = 0; local1375 < 3; local1375++) {
						local1379 = 0;
						for (local1381 = 0; local1381 < 3; local1381++) {
							local1379 += arg7[local1381 + local1371 * 3] * local1224[local1381 * 3 + local1375];
						}
						local1369[local1371 * 3 + local1375] = local1379 + 8192 >> 14;
					}
				}
				local1375 = local1236 * arg7[2] + local1234 * arg7[1] + arg7[0] * local1230 + 8192 >> 14;
				local1379 = local1236 * arg7[5] + local1230 * arg7[3] + arg7[4] * local1234 + 8192 >> 14;
				local1381 = arg7[6] * local1230 + arg7[7] * local1234 + local1236 * arg7[8] + 8192 >> 14;
				local1375 += local26;
				local1379 += local32;
				local1381 += local38;
				for (local1509 = 0; local1509 < local8; local1509++) {
					@Pc(1515) int local1515 = arg1[local1509];
					if (this.anIntArrayArray4.length > local1515) {
						@Pc(1525) int[] local1525 = this.anIntArrayArray4[local1515];
						for (@Pc(1527) int local1527 = 0; local1527 < local1525.length; local1527++) {
							@Pc(1533) int local1533 = local1525[local1527];
							if (this.aShortArray15 == null || (this.aShortArray15[local1533] & arg6) != 0) {
								@Pc(1575) int local1575 = local1369[2] * this.anIntArray28[local1533] + this.anIntArray30[local1533] * local1369[0] + this.anIntArray31[local1533] * local1369[1] + 8192 >> 14;
								@Pc(1606) int local1606 = this.anIntArray31[local1533] * local1369[4] + this.anIntArray30[local1533] * local1369[3] + this.anIntArray28[local1533] * local1369[5] + 8192 >> 14;
								@Pc(1637) int local1637 = this.anIntArray30[local1533] * local1369[6] + local1369[7] * this.anIntArray31[local1533] + this.anIntArray28[local1533] * local1369[8] + 8192 >> 14;
								@Pc(1641) int local1641 = local1606 + local1379;
								@Pc(1645) int local1645 = local1575 + local1375;
								@Pc(1649) int local1649 = local1637 + local1381;
								this.anIntArray30[local1533] = local1645;
								this.anIntArray31[local1533] = local1641;
								this.anIntArray28[local1533] = local1649;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2571) Class101 local2571;
			@Pc(2576) Class365 local2576;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray2.length) {
							local249 = this.anIntArrayArray2[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local54 = local249[local251];
								if (this.aShortArray16 == null || (this.aShortArray16[local54] & arg6) != 0) {
									local60 = (this.aByteArray4[local54] & 0xFF) + (arg2 * 8);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray4[local54] = (byte) local60;
									if (this.aClass243_2 != null) {
										this.aClass243_2.anInterface26_5 = null;
									}
								}
							}
						}
					}
					if (this.aClass101Array1 != null) {
						for (local32 = 0; local32 < this.anInt985; local32++) {
							local2571 = this.aClass101Array1[local32];
							local2576 = this.aClass365Array1[local32];
							local2576.anInt9558 = local2576.anInt9558 & 0xFFFFFF | 255 - (this.aByteArray4[local2571.anInt2499] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2835) Class365 local2835;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray3.length > local32) {
								local249 = this.anIntArrayArray3[local32];
								for (local251 = 0; local251 < local249.length; local251++) {
									local2835 = this.aClass365Array1[local249[local251]];
									local2835.anInt9565 += arg2;
									local2835.anInt9557 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray3.length) {
								local249 = this.anIntArrayArray3[local32];
								for (local251 = 0; local251 < local249.length; local251++) {
									local2835 = this.aClass365Array1[local249[local251]];
									local2835.anInt9559 = arg3 * local2835.anInt9559 >> 7;
									local2835.anInt9566 = arg2 * local2835.anInt9566 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray3.length > local32) {
							local249 = this.anIntArrayArray3[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2835 = this.aClass365Array1[local249[local251]];
								local2835.anInt9562 = arg2 + local2835.anInt9562 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray2.length > local32) {
						local249 = this.anIntArrayArray2[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local54 = local249[local251];
							if (this.aShortArray16 == null || (this.aShortArray16[local54] & arg6) != 0) {
								local60 = this.aShortArray17[local54] & 0xFFFF;
								local384 = local60 >> 10 & 0x3F;
								local403 = local60 >> 7 & 0x7;
								local403 += arg3 / 4;
								local636 = local60 & 0x7F;
								@Pc(2688) int local2688 = local384 + arg2 & 0x3F;
								if (local403 < 0) {
									local403 = 0;
								} else if (local403 > 7) {
									local403 = 7;
								}
								local636 += arg4;
								if (local636 < 0) {
									local636 = 0;
								} else if (local636 > 127) {
									local636 = 127;
								}
								this.aShortArray17[local54] = (short) (local636 | local2688 << 10 | local403 << 7);
								if (this.aClass243_2 != null) {
									this.aClass243_2.anInterface26_5 = null;
								}
							}
						}
					}
				}
				if (this.aClass101Array1 != null) {
					for (local32 = 0; local32 < this.anInt985; local32++) {
						local2571 = this.aClass101Array1[local32];
						local2576 = this.aClass365Array1[local32];
						local2576.anInt9558 = local2576.anInt9558 & 0xFF000000 | Static274.anIntArray337[this.aShortArray17[local2571.anInt2499] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray4.length > local32) {
					local249 = this.anIntArrayArray4[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local54 = local249[local251];
						if (this.aShortArray15 == null || (this.aShortArray15[local54] & arg6) != 0) {
							this.anIntArray30[local54] -= Static195.anInt3523;
							this.anIntArray31[local54] -= Static636.anInt9817;
							this.anIntArray28[local54] -= Static215.anInt6269;
							this.anIntArray30[local54] = arg2 * this.anIntArray30[local54] >> 7;
							this.anIntArray31[local54] = this.anIntArray31[local54] * arg3 >> 7;
							this.anIntArray28[local54] = arg4 * this.anIntArray28[local54] >> 7;
							this.anIntArray30[local54] += Static195.anInt3523;
							this.anIntArray31[local54] += Static636.anInt9817;
							this.anIntArray28[local54] += Static215.anInt6269;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local251 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static553.aBoolean666) {
				local384 = Static195.anInt3523 * arg7[0] + Static636.anInt9817 * arg7[3] + arg7[6] * Static215.anInt6269 + 8192 >> 14;
				local403 = Static195.anInt3523 * arg7[1] + Static636.anInt9817 * arg7[4] + arg7[7] * Static215.anInt6269 + 8192 >> 14;
				local403 += local54;
				local384 += local251;
				local636 = Static215.anInt6269 * arg7[8] + arg7[5] * Static636.anInt9817 + Static195.anInt3523 * arg7[2] + 8192 >> 14;
				Static636.anInt9817 = local403;
				Static195.anInt3523 = local384;
				local636 += local60;
				Static553.aBoolean666 = false;
				Static215.anInt6269 = local636;
			}
			local384 = arg2 << 15 >> 7;
			local403 = arg3 << 15 >> 7;
			local636 = arg4 << 15 >> 7;
			local645 = local384 * -Static195.anInt3523 + 8192 >> 14;
			local654 = -Static636.anInt9817 * local403 + 8192 >> 14;
			local658 = local636 * -Static215.anInt6269 + 8192 >> 14;
			local676 = Static195.anInt3523 + local645;
			local1020 = local654 + Static636.anInt9817;
			local1028 = Static215.anInt6269 + local658;
			@Pc(2006) int[] local2006 = new int[] { arg7[0] * local384 + 8192 >> 14, arg7[3] * local384 + 8192 >> 14, local384 * arg7[6] + 8192 >> 14, arg7[1] * local403 + 8192 >> 14, local403 * arg7[4] + 8192 >> 14, arg7[7] * local403 + 8192 >> 14, local636 * arg7[2] + 8192 >> 14, arg7[5] * local636 + 8192 >> 14, local636 * arg7[8] + 8192 >> 14 };
			local1183 = local251 * local384 + 8192 >> 14;
			local1208 = local54 * local403 + 8192 >> 14;
			local1212 = local636 * local60 + 8192 >> 14;
			@Pc(2142) int local2142 = local1208 + local1020;
			@Pc(2146) int local2146 = local1183 + local676;
			@Pc(2150) int local2150 = local1212 + local1028;
			@Pc(2153) int[] local2153 = new int[9];
			@Pc(2159) int local2159;
			for (local1221 = 0; local1221 < 3; local1221++) {
				for (local2159 = 0; local2159 < 3; local2159++) {
					local1226 = 0;
					for (local1230 = 0; local1230 < 3; local1230++) {
						local1226 += local2006[local2159 + local1230 * 3] * arg7[local1221 * 3 + local1230];
					}
					local2153[local1221 * 3 + local2159] = local1226 + 8192 >> 14;
				}
			}
			local2159 = arg7[1] * local2142 + local2146 * arg7[0] + arg7[2] * local2150 + 8192 >> 14;
			local1226 = arg7[3] * local2146 + arg7[4] * local2142 + arg7[5] * local2150 + 8192 >> 14;
			local1230 = local2146 * arg7[6] + local2142 * arg7[7] + local2150 * arg7[8] + 8192 >> 14;
			local2159 += local26;
			local1226 += local32;
			local1230 += local38;
			for (local1234 = 0; local1234 < local8; local1234++) {
				local1236 = arg1[local1234];
				if (this.anIntArrayArray4.length > local1236) {
					local1369 = this.anIntArrayArray4[local1236];
					for (local1371 = 0; local1371 < local1369.length; local1371++) {
						local1375 = local1369[local1371];
						if (this.aShortArray15 == null || (arg6 & this.aShortArray15[local1375]) != 0) {
							local1379 = local2153[1] * this.anIntArray31[local1375] + this.anIntArray30[local1375] * local2153[0] + local2153[2] * this.anIntArray28[local1375] + 8192 >> 14;
							local1381 = this.anIntArray31[local1375] * local2153[4] + this.anIntArray30[local1375] * local2153[3] + local2153[5] * this.anIntArray28[local1375] + 8192 >> 14;
							@Pc(2397) int local2397 = local1381 + local1226;
							@Pc(2401) int local2401 = local1379 + local2159;
							local1509 = this.anIntArray28[local1375] * local2153[8] + local2153[6] * this.anIntArray30[local1375] + this.anIntArray31[local1375] * local2153[7] + 8192 >> 14;
							@Pc(2436) int local2436 = local1509 + local1230;
							this.anIntArray30[local1375] = local2401;
							this.anIntArray31[local1375] = local2397;
							this.anIntArray28[local1375] = local2436;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
	@Override
	protected void method6896() {
	}

	@OriginalMember(owner = "client!b", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean93) {
			this.method1015();
		}
		return this.aShort20;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	private void method1027() {
		if (this.anInt998 == 0) {
			return;
		}
		if (this.aByte20 != 0) {
			this.method1019(true);
		}
		this.method1019(false);
		if (this.aClass187_1 != null) {
			if (this.aClass187_1.anInterface17_4 == null) {
				this.method1024((this.aByte20 & 0x10) != 0);
			}
			if (this.aClass187_1.anInterface17_4 != null) {
				this.aClass16_Sub2_4.method3637(this.aClass243_3 != null);
				this.aClass16_Sub2_4.method3629(this.aClass243_4, this.aClass243_3, this.aClass243_1, this.aClass243_2);
				@Pc(81) int local81 = this.anIntArray33.length - 1;
				for (@Pc(83) int local83 = 0; local83 < local81; local83++) {
					@Pc(90) int local90 = this.anIntArray33[local83];
					@Pc(97) int local97 = this.anIntArray33[local83 + 1];
					@Pc(104) int local104 = this.aShortArray14[local90] & 0xFFFF;
					if (local104 == 65535) {
						local104 = -1;
					}
					this.aClass16_Sub2_4.method3641(local104, this.aClass243_3 != null);
					this.aClass16_Sub2_4.method3632(local90 * 3, this.aClass187_1.anInterface17_4, (local97 - local90) * 3);
				}
			}
		}
		this.method1014();
	}
}
