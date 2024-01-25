import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class202 {

	@OriginalMember(owner = "client!km", name = "g", descriptor = "[J")
	public static final long[] aLongArray12 = new long[11];

	@OriginalMember(owner = "client!km", name = "c", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!km", name = "p", descriptor = "Lclient!ml;")
	private Interface15 anInterface15_5;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "Lclient!uo;")
	private Class356 aClass356_12;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "Lclient!uo;")
	private Class356 aClass356_13;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "Lclient!uo;")
	private Class356 aClass356_14;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "[F")
	private final float[] aFloatArray52 = new float[16];

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Lclient!jo;")
	private final Class5_Sub23_Sub1 aClass5_Sub23_Sub1_2 = new Class5_Sub23_Sub1(786336);

	@OriginalMember(owner = "client!km", name = "s", descriptor = "I")
	private final int anInt5617 = Static197.method8882(1600);

	@OriginalMember(owner = "client!km", name = "v", descriptor = "[[Lclient!nh;")
	private final Class8_Sub8_Sub1[][] aClass8_Sub8_Sub1ArrayArray1 = new Class8_Sub8_Sub1[64][768];

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	private int anInt5618 = 0;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "[I")
	private final int[] anIntArray311 = new int[1600];

	@OriginalMember(owner = "client!km", name = "m", descriptor = "[I")
	private final int[] anIntArray312 = new int[64];

	@OriginalMember(owner = "client!km", name = "o", descriptor = "[[Lclient!nh;")
	private final Class8_Sub8_Sub1[][] aClass8_Sub8_Sub1ArrayArray2 = new Class8_Sub8_Sub1[1600][64];

	@OriginalMember(owner = "client!km", name = "e", descriptor = "[I")
	private final int[] anIntArray313 = new int[8191];

	static {
		for (@Pc(83) int local83 = 0; local83 < 256; local83++) {
			@Pc(92) char local92 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local83 / 2);
			@Pc(106) long local106 = (long) ((local83 & 0x1) == 0 ? local92 >>> 8 : local92 & 0xFF);
			@Pc(110) long local110 = local106 << 1;
			if (local110 >= 256L) {
				local110 ^= 0x11DL;
			}
			@Pc(122) long local122 = local110 << 1;
			if (local122 >= 256L) {
				local122 ^= 0x11DL;
			}
			@Pc(134) long local134 = local122 ^ local106;
			@Pc(138) long local138 = local122 << 1;
			if (local138 >= 256L) {
				local138 ^= 0x11DL;
			}
			@Pc(152) long local152 = local138 ^ local106;
			aLongArrayArray1[0][local83] = Static125.method1772(Static125.method1772(local110 << 8, Static125.method1772(Static125.method1772(local138 << 24, Static125.method1772(local106 << 32, Static125.method1772(local122 << 40, Static125.method1772(local106 << 48, local106 << 56)))), local134 << 16)), local152);
			for (@Pc(188) int local188 = 1; local188 < 8; local188++) {
				aLongArrayArray1[local188][local83] = Static125.method1772(aLongArrayArray1[local188 - 1][local83] >>> 8, aLongArrayArray1[local188 - 1][local83] << 56);
			}
		}
		aLongArray12[0] = 0L;
		for (@Pc(231) int local231 = 1; local231 <= 10; local231++) {
			@Pc(238) int local238 = local231 * 8 - 8;
			aLongArray12[local231] = Static379.method5558(Static379.method5558(Static379.method5558(Static379.method5558(Static164.method2212(4278190080L, aLongArrayArray1[4][local238 + 4]), Static379.method5558(Static164.method2212(1095216660480L, aLongArrayArray1[3][local238 + 3]), Static379.method5558(Static379.method5558(Static164.method2212(aLongArrayArray1[1][local238 + 1], 71776119061217280L), Static164.method2212(aLongArrayArray1[0][local238], -72057594037927936L)), Static164.method2212(280375465082880L, aLongArrayArray1[2][local238 + 2])))), Static164.method2212(16711680L, aLongArrayArray1[5][local238 + 5])), Static164.method2212(aLongArrayArray1[6][local238 + 6], 65280L)), Static164.method2212(255L, aLongArrayArray1[7][local238 + 7]));
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!ffa;ILclient!jw;)V")
	public void method4806(@OriginalArg(1) Class57_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class193 arg2) {
		if (arg0.aClass203_Sub2_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method4809(arg1, arg0);
		} else {
			this.method4810(arg0);
		}
		@Pc(34) float local34 = arg0.aClass203_Sub2_3.aFloat125;
		@Pc(38) float local38 = arg0.aClass203_Sub2_3.aFloat130;
		@Pc(42) float local42 = arg0.aClass203_Sub2_3.aFloat122;
		@Pc(46) float local46 = arg0.aClass203_Sub2_3.aFloat131;
		try {
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = Integer.MAX_VALUE;
			@Pc(57) int local57 = 0;
			@Pc(61) Class8_Sub8 local61 = arg2.aClass154_1.aClass8_Sub8_1;
			@Pc(64) Class8_Sub8 local64;
			@Pc(96) int local96;
			for (local64 = local61.aClass8_Sub8_10; local64 != local61; local64 = local64.aClass8_Sub8_10) {
				@Pc(69) Class8_Sub8_Sub1 local69 = (Class8_Sub8_Sub1) local64;
				local96 = (int) (local46 + (float) (local69.anInt7349 >> 12) * local42 + (float) (local69.anInt7350 >> 12) * local38 + (float) (local69.anInt7345 >> 12) * local34);
				if (local55 > local96) {
					local55 = local96;
				}
				if (local57 < local96) {
					local57 = local96;
				}
				this.anIntArray313[local53++] = local96;
			}
			@Pc(127) int local127 = local57 - local55;
			if (local127 + 2 <= 1600) {
				local127 += 2;
				local96 = 0;
			} else {
				local96 = Static197.method8882(local127) + 1 - this.anInt5617;
				local127 = (local127 >> local96) + 2;
			}
			local64 = local61.aClass8_Sub8_10;
			local53 = 0;
			@Pc(162) int local162 = -2;
			@Pc(164) boolean local164 = true;
			@Pc(166) boolean local166 = true;
			while (local61 != local64) {
				this.anInt5618 = 0;
				for (@Pc(175) int local175 = 0; local175 < local127; local175++) {
					this.anIntArray311[local175] = 0;
				}
				for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
					this.anIntArray312[local194] = 0;
				}
				while (local64 != local61) {
					@Pc(218) Class8_Sub8_Sub1 local218 = (Class8_Sub8_Sub1) local64;
					if (local166) {
						local162 = local218.anInt7342;
						local166 = false;
						local164 = local218.aBoolean565;
					}
					if (local53 > 0 && (local162 != local218.anInt7342 || local164 != local218.aBoolean565)) {
						local166 = true;
						break;
					}
					@Pc(271) int local271 = this.anIntArray313[local53++] - local55 >> local96;
					if (local271 < 1600) {
						if (this.anIntArray311[local271] < 64) {
							this.aClass8_Sub8_Sub1ArrayArray2[local271][this.anIntArray311[local271]++] = local218;
						} else {
							label106: {
								if (this.anIntArray311[local271] == 64) {
									if (this.anInt5618 == 64) {
										break label106;
									}
									this.anIntArray311[local271] += this.anInt5618++ + 1;
								}
								this.aClass8_Sub8_Sub1ArrayArray1[this.anIntArray311[local271] - 1 - 64][this.anIntArray312[this.anIntArray311[local271] - 1 - 64]++] = local218;
							}
						}
					}
					local64 = local64.aClass8_Sub8_10;
				}
				if (local162 >= 0) {
					arg0.method2358(local162);
				} else {
					arg0.method2358(-1);
				}
				if (local164 && Static473.aFloat139 != arg0.aFloat43) {
					arg0.xa(Static473.aFloat139);
				} else if (arg0.aFloat43 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method4812(local127, arg0);
			}
		} catch (@Pc(430) Exception local430) {
		}
		this.method4808(arg0);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!ffa;)V")
	private void method4808(@OriginalArg(1) Class57_Sub2 arg0) {
		arg0.method2309(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static473.aFloat139 != arg0.aFloat43) {
			arg0.xa(Static473.aFloat139);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IILclient!ffa;)V")
	private void method4809(@OriginalArg(0) int arg0, @OriginalArg(2) Class57_Sub2 arg1) {
		Static473.aFloat139 = arg1.aFloat43;
		arg1.method2383((float) arg0);
		arg1.method2326();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method2309(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(BLclient!ffa;)V")
	private void method4810(@OriginalArg(1) Class57_Sub2 arg0) {
		Static473.aFloat139 = arg0.aFloat43;
		arg0.method2333();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method2309(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!ffa;I)V")
	private void method4812(@OriginalArg(0) int arg0, @OriginalArg(1) Class57_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray52, 0);
		@Pc(23) float local23 = this.aFloatArray52[0];
		@Pc(28) float local28 = this.aFloatArray52[4];
		@Pc(33) float local33 = this.aFloatArray52[8];
		@Pc(38) float local38 = this.aFloatArray52[1];
		@Pc(43) float local43 = this.aFloatArray52[5];
		@Pc(48) float local48 = this.aFloatArray52[9];
		@Pc(52) float local52 = local38 + local23;
		@Pc(56) float local56 = local43 + local28;
		@Pc(60) float local60 = local33 + local48;
		@Pc(65) float local65 = local23 - local38;
		@Pc(70) float local70 = local28 - local43;
		@Pc(75) float local75 = local33 - local48;
		@Pc(79) float local79 = local38 - local23;
		@Pc(83) float local83 = local43 - local28;
		this.aClass5_Sub23_Sub1_2.anInt9869 = 0;
		@Pc(91) float local91 = local48 - local33;
		@Pc(98) int local98;
		@Pc(118) int local118;
		@Pc(127) int local127;
		@Pc(138) Class8_Sub8_Sub1 local138;
		@Pc(141) int local141;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(154) byte local154;
		@Pc(159) byte local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(177) float local177;
		@Pc(182) int local182;
		@Pc(505) float local505;
		@Pc(510) int local510;
		@Pc(450) int local450;
		@Pc(466) Class8_Sub8_Sub1 local466;
		@Pc(469) int local469;
		@Pc(482) byte local482;
		@Pc(487) byte local487;
		@Pc(499) float local499;
		if (arg1.aBoolean216) {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local118 = this.anIntArray311[local98] <= 64 ? this.anIntArray311[local98] : 64;
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass8_Sub8_Sub1ArrayArray2[local98][local127];
						local141 = local138.anInt7344;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt7345 >> 12);
						local171 = (float) (local138.anInt7350 >> 12);
						local177 = (float) (local138.anInt7349 >> 12);
						local182 = local138.anInt7348 >> 12;
						this.aClass5_Sub23_Sub1_2.method4302(0.0F);
						this.aClass5_Sub23_Sub1_2.method4302(0.0F);
						this.aClass5_Sub23_Sub1_2.method4302(local52 * (float) -local182 + local165);
						this.aClass5_Sub23_Sub1_2.method4302(local171 + (float) -local182 * local56);
						this.aClass5_Sub23_Sub1_2.method4302((float) -local182 * local60 + local177);
						this.aClass5_Sub23_Sub1_2.method8502(local146);
						this.aClass5_Sub23_Sub1_2.method8502(local151);
						this.aClass5_Sub23_Sub1_2.method8502(local154);
						this.aClass5_Sub23_Sub1_2.method8502(local159);
						this.aClass5_Sub23_Sub1_2.method4302(1.0F);
						this.aClass5_Sub23_Sub1_2.method4302(0.0F);
						this.aClass5_Sub23_Sub1_2.method4302(local65 * (float) local182 + local165);
						this.aClass5_Sub23_Sub1_2.method4302(local70 * (float) local182 + local171);
						this.aClass5_Sub23_Sub1_2.method4302(local177 + local75 * (float) local182);
						this.aClass5_Sub23_Sub1_2.method8502(local146);
						this.aClass5_Sub23_Sub1_2.method8502(local151);
						this.aClass5_Sub23_Sub1_2.method8502(local154);
						this.aClass5_Sub23_Sub1_2.method8502(local159);
						this.aClass5_Sub23_Sub1_2.method4302(1.0F);
						this.aClass5_Sub23_Sub1_2.method4302(1.0F);
						this.aClass5_Sub23_Sub1_2.method4302(local165 + local52 * (float) local182);
						this.aClass5_Sub23_Sub1_2.method4302((float) local182 * local56 + local171);
						this.aClass5_Sub23_Sub1_2.method4302(local60 * (float) local182 + local177);
						this.aClass5_Sub23_Sub1_2.method8502(local146);
						this.aClass5_Sub23_Sub1_2.method8502(local151);
						this.aClass5_Sub23_Sub1_2.method8502(local154);
						this.aClass5_Sub23_Sub1_2.method8502(local159);
						this.aClass5_Sub23_Sub1_2.method4302(0.0F);
						this.aClass5_Sub23_Sub1_2.method4302(1.0F);
						this.aClass5_Sub23_Sub1_2.method4302(local165 + (float) local182 * local79);
						this.aClass5_Sub23_Sub1_2.method4302((float) local182 * local83 + local171);
						this.aClass5_Sub23_Sub1_2.method4302(local91 * (float) local182 + local177);
						this.aClass5_Sub23_Sub1_2.method8502(local146);
						this.aClass5_Sub23_Sub1_2.method8502(local151);
						this.aClass5_Sub23_Sub1_2.method8502(local154);
						this.aClass5_Sub23_Sub1_2.method8502(local159);
					}
					if (this.anIntArray311[local98] > 64) {
						local450 = this.anIntArray311[local98] - 1 - 64;
						for (local141 = this.anIntArray312[local450] - 1; local141 >= 0; local141--) {
							local466 = this.aClass8_Sub8_Sub1ArrayArray1[local450][local141];
							local469 = local466.anInt7344;
							local154 = (byte) (local469 >> 16);
							local159 = (byte) (local469 >> 8);
							local482 = (byte) local469;
							local487 = (byte) (local469 >>> 24);
							local177 = (float) (local466.anInt7345 >> 12);
							local499 = (float) (local466.anInt7350 >> 12);
							local505 = (float) (local466.anInt7349 >> 12);
							local510 = local466.anInt7348 >> 12;
							this.aClass5_Sub23_Sub1_2.method4302(0.0F);
							this.aClass5_Sub23_Sub1_2.method4302(0.0F);
							this.aClass5_Sub23_Sub1_2.method4302(local177 + (float) -local510 * local52);
							this.aClass5_Sub23_Sub1_2.method4302((float) -local510 * local56 + local499);
							this.aClass5_Sub23_Sub1_2.method4302(local505 + local60 * (float) -local510);
							this.aClass5_Sub23_Sub1_2.method8502(local154);
							this.aClass5_Sub23_Sub1_2.method8502(local159);
							this.aClass5_Sub23_Sub1_2.method8502(local482);
							this.aClass5_Sub23_Sub1_2.method8502(local487);
							this.aClass5_Sub23_Sub1_2.method4302(1.0F);
							this.aClass5_Sub23_Sub1_2.method4302(0.0F);
							this.aClass5_Sub23_Sub1_2.method4302(local177 + (float) local510 * local65);
							this.aClass5_Sub23_Sub1_2.method4302(local70 * (float) local510 + local499);
							this.aClass5_Sub23_Sub1_2.method4302(local505 + local75 * (float) local510);
							this.aClass5_Sub23_Sub1_2.method8502(local154);
							this.aClass5_Sub23_Sub1_2.method8502(local159);
							this.aClass5_Sub23_Sub1_2.method8502(local482);
							this.aClass5_Sub23_Sub1_2.method8502(local487);
							this.aClass5_Sub23_Sub1_2.method4302(1.0F);
							this.aClass5_Sub23_Sub1_2.method4302(1.0F);
							this.aClass5_Sub23_Sub1_2.method4302(local52 * (float) local510 + local177);
							this.aClass5_Sub23_Sub1_2.method4302(local499 + local56 * (float) local510);
							this.aClass5_Sub23_Sub1_2.method4302(local60 * (float) local510 + local505);
							this.aClass5_Sub23_Sub1_2.method8502(local154);
							this.aClass5_Sub23_Sub1_2.method8502(local159);
							this.aClass5_Sub23_Sub1_2.method8502(local482);
							this.aClass5_Sub23_Sub1_2.method8502(local487);
							this.aClass5_Sub23_Sub1_2.method4302(0.0F);
							this.aClass5_Sub23_Sub1_2.method4302(1.0F);
							this.aClass5_Sub23_Sub1_2.method4302(local177 + (float) local510 * local79);
							this.aClass5_Sub23_Sub1_2.method4302(local499 + (float) local510 * local83);
							this.aClass5_Sub23_Sub1_2.method4302(local505 + local91 * (float) local510);
							this.aClass5_Sub23_Sub1_2.method8502(local154);
							this.aClass5_Sub23_Sub1_2.method8502(local159);
							this.aClass5_Sub23_Sub1_2.method8502(local482);
							this.aClass5_Sub23_Sub1_2.method8502(local487);
						}
					}
				}
			}
		} else {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local118 = this.anIntArray311[local98] <= 64 ? this.anIntArray311[local98] : 64;
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass8_Sub8_Sub1ArrayArray2[local98][local127];
						local141 = local138.anInt7344;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt7345 >> 12);
						local171 = (float) (local138.anInt7350 >> 12);
						local177 = (float) (local138.anInt7349 >> 12);
						local182 = local138.anInt7348 >> 12;
						this.aClass5_Sub23_Sub1_2.method4304(0.0F);
						this.aClass5_Sub23_Sub1_2.method4304(0.0F);
						this.aClass5_Sub23_Sub1_2.method4304(local165 + (float) -local182 * local52);
						this.aClass5_Sub23_Sub1_2.method4304(local171 + (float) -local182 * local56);
						this.aClass5_Sub23_Sub1_2.method4304(local177 + local60 * (float) -local182);
						this.aClass5_Sub23_Sub1_2.method8502(local146);
						this.aClass5_Sub23_Sub1_2.method8502(local151);
						this.aClass5_Sub23_Sub1_2.method8502(local154);
						this.aClass5_Sub23_Sub1_2.method8502(local159);
						this.aClass5_Sub23_Sub1_2.method4304(1.0F);
						this.aClass5_Sub23_Sub1_2.method4304(0.0F);
						this.aClass5_Sub23_Sub1_2.method4304(local65 * (float) local182 + local165);
						this.aClass5_Sub23_Sub1_2.method4304(local171 + local70 * (float) local182);
						this.aClass5_Sub23_Sub1_2.method4304(local177 + (float) local182 * local75);
						this.aClass5_Sub23_Sub1_2.method8502(local146);
						this.aClass5_Sub23_Sub1_2.method8502(local151);
						this.aClass5_Sub23_Sub1_2.method8502(local154);
						this.aClass5_Sub23_Sub1_2.method8502(local159);
						this.aClass5_Sub23_Sub1_2.method4304(1.0F);
						this.aClass5_Sub23_Sub1_2.method4304(1.0F);
						this.aClass5_Sub23_Sub1_2.method4304((float) local182 * local52 + local165);
						this.aClass5_Sub23_Sub1_2.method4304(local171 + (float) local182 * local56);
						this.aClass5_Sub23_Sub1_2.method4304(local177 + local60 * (float) local182);
						this.aClass5_Sub23_Sub1_2.method8502(local146);
						this.aClass5_Sub23_Sub1_2.method8502(local151);
						this.aClass5_Sub23_Sub1_2.method8502(local154);
						this.aClass5_Sub23_Sub1_2.method8502(local159);
						this.aClass5_Sub23_Sub1_2.method4304(0.0F);
						this.aClass5_Sub23_Sub1_2.method4304(1.0F);
						this.aClass5_Sub23_Sub1_2.method4304(local79 * (float) local182 + local165);
						this.aClass5_Sub23_Sub1_2.method4304(local83 * (float) local182 + local171);
						this.aClass5_Sub23_Sub1_2.method4304((float) local182 * local91 + local177);
						this.aClass5_Sub23_Sub1_2.method8502(local146);
						this.aClass5_Sub23_Sub1_2.method8502(local151);
						this.aClass5_Sub23_Sub1_2.method8502(local154);
						this.aClass5_Sub23_Sub1_2.method8502(local159);
					}
					if (this.anIntArray311[local98] > 64) {
						local450 = this.anIntArray311[local98] - 65;
						for (local141 = this.anIntArray312[local450] - 1; local141 >= 0; local141--) {
							local466 = this.aClass8_Sub8_Sub1ArrayArray1[local450][local141];
							local469 = local466.anInt7344;
							local154 = (byte) (local469 >> 16);
							local159 = (byte) (local469 >> 8);
							local482 = (byte) local469;
							local487 = (byte) (local469 >>> 24);
							local177 = (float) (local466.anInt7345 >> 12);
							local499 = (float) (local466.anInt7350 >> 12);
							local505 = (float) (local466.anInt7349 >> 12);
							local510 = local466.anInt7348 >> 12;
							this.aClass5_Sub23_Sub1_2.method4304(0.0F);
							this.aClass5_Sub23_Sub1_2.method4304(0.0F);
							this.aClass5_Sub23_Sub1_2.method4304((float) -local510 * local52 + local177);
							this.aClass5_Sub23_Sub1_2.method4304(local499 + (float) -local510 * local56);
							this.aClass5_Sub23_Sub1_2.method4304(local60 * (float) -local510 + local505);
							this.aClass5_Sub23_Sub1_2.method8502(local154);
							this.aClass5_Sub23_Sub1_2.method8502(local159);
							this.aClass5_Sub23_Sub1_2.method8502(local482);
							this.aClass5_Sub23_Sub1_2.method8502(local487);
							this.aClass5_Sub23_Sub1_2.method4304(1.0F);
							this.aClass5_Sub23_Sub1_2.method4304(0.0F);
							this.aClass5_Sub23_Sub1_2.method4304(local65 * (float) local510 + local177);
							this.aClass5_Sub23_Sub1_2.method4304(local499 + (float) local510 * local70);
							this.aClass5_Sub23_Sub1_2.method4304(local505 + local75 * (float) local510);
							this.aClass5_Sub23_Sub1_2.method8502(local154);
							this.aClass5_Sub23_Sub1_2.method8502(local159);
							this.aClass5_Sub23_Sub1_2.method8502(local482);
							this.aClass5_Sub23_Sub1_2.method8502(local487);
							this.aClass5_Sub23_Sub1_2.method4304(1.0F);
							this.aClass5_Sub23_Sub1_2.method4304(1.0F);
							this.aClass5_Sub23_Sub1_2.method4304(local177 + (float) local510 * local52);
							this.aClass5_Sub23_Sub1_2.method4304(local499 + local56 * (float) local510);
							this.aClass5_Sub23_Sub1_2.method4304(local60 * (float) local510 + local505);
							this.aClass5_Sub23_Sub1_2.method8502(local154);
							this.aClass5_Sub23_Sub1_2.method8502(local159);
							this.aClass5_Sub23_Sub1_2.method8502(local482);
							this.aClass5_Sub23_Sub1_2.method8502(local487);
							this.aClass5_Sub23_Sub1_2.method4304(0.0F);
							this.aClass5_Sub23_Sub1_2.method4304(1.0F);
							this.aClass5_Sub23_Sub1_2.method4304(local79 * (float) local510 + local177);
							this.aClass5_Sub23_Sub1_2.method4304(local499 + local83 * (float) local510);
							this.aClass5_Sub23_Sub1_2.method4304(local505 + (float) local510 * local91);
							this.aClass5_Sub23_Sub1_2.method8502(local154);
							this.aClass5_Sub23_Sub1_2.method8502(local159);
							this.aClass5_Sub23_Sub1_2.method8502(local482);
							this.aClass5_Sub23_Sub1_2.method8502(local487);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub23_Sub1_2.anInt9869 != 0) {
			this.anInterface15_5.method3618(24, this.aClass5_Sub23_Sub1_2.aByteArray102, this.aClass5_Sub23_Sub1_2.anInt9869);
			arg1.method2353((Class356) null, this.aClass356_13, this.aClass356_12, this.aClass356_14);
			arg1.method2307(this.aClass5_Sub23_Sub1_2.anInt9869 / 24);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!ffa;)V")
	public void method4813(@OriginalArg(1) Class57_Sub2 arg0) {
		this.anInterface15_5 = arg0.method2311(196584, true, 24, (byte[]) null);
		this.aClass356_14 = new Class356(this.anInterface15_5, 5126, 2, 0);
		this.aClass356_13 = new Class356(this.anInterface15_5, 5126, 3, 8);
		this.aClass356_12 = new Class356(this.anInterface15_5, 5121, 4, 20);
	}
}
