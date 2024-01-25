import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	private int anInt1810;

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
	private int anInt1813;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "Lclient!ig;")
	public Class91 aClass91_2;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
	private int anInt1816;

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "Lclient!ig;")
	private Class91 aClass91_3;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "Lclient!ig;")
	public Class91 aClass91_4;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lclient!va;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
	private int anInt1817;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "[Lclient!ap;")
	private Class1_Sub6[] aClass1_Sub6Array1;

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "Lclient!ig;")
	public Class91 aClass91_5;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!bb;")
	private final Class16 aClass16_5 = new Class16();

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!h;")
	public final Class32_Sub2 aClass32_Sub2_13;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "[[I")
	private final int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
	public final int anInt1812;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
	public int anInt1811;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public final int anInt1814;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "[[[Lclient!ap;")
	private Class1_Sub6[][][] aClass1_Sub6ArrayArrayArray1;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "[[B")
	private final byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "Lclient!tm;")
	private Class197 aClass197_6;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!ln;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!h;IIII[[I[[II)V")
	public Class53_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass32_Sub2_13 = arg0;
		this.anIntArrayArray19 = arg5;
		this.anIntArrayArray20 = arg6;
		this.anInt1812 = arg2;
		while (arg7 > 1) {
			this.anInt1811++;
			arg7 >>= 0x1;
		}
		this.anInt1814 = 0x1 << this.anInt1811;
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aClass1_Sub6ArrayArrayArray1 = new Class1_Sub6[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.aByteArrayArray3 = new byte[arg3][arg4];
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray3 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray2 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray4 = new float[arg3 + 1][arg4 + 1];
		for (@Pc(119) int local119 = 1; local119 < arg4; local119++) {
			for (@Pc(124) int local124 = 1; local124 < arg3; local124++) {
				@Pc(145) int local145 = this.anIntArrayArray19[local124 + 1][local119] - this.anIntArrayArray19[local124 - 1][local119];
				@Pc(163) int local163 = this.anIntArrayArray19[local124][local119 + 1] - this.anIntArrayArray19[local124][local119 - 1];
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local145 * local145 + local163 * local163 + 65536)));
				this.aFloatArrayArray3[local124][local119] = (float) local145 * local178;
				this.aFloatArrayArray2[local124][local119] = -256.0F * local178;
				this.aFloatArrayArray4[local124][local119] = (float) local163 * local178;
			}
		}
		this.aClass197_6 = new Class197(128);
		if ((this.anInt1812 & 0x10) != 0) {
			this.aClass128_1 = new Class128(this.aClass32_Sub2_13, this);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!si;[I)V")
	@Override
	public void method2786(@OriginalArg(0) Class1_Sub30 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass16_5.method416(new Class1_Sub34(this.aClass32_Sub2_13, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	@Override
	public void method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!um;II)V")
	private void method1610(@OriginalArg(0) Class1_Sub4_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray2[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray5[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static66.anIntArray180.length < local16) {
			Static66.anIntArray180 = new int[local16];
			Static66.anIntArray179 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static66.anIntArray180[local28] = (local6[local28] & 0xFF) >> this.aClass32_Sub2_13.anInt2483;
			Static66.anIntArray179[local28] = (local13[local28] & 0xFF) >> this.aClass32_Sub2_13.anInt2483;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static66.anIntArray180[local28];
			@Pc(71) int local71 = Static66.anIntArray179[local28++];
			@Pc(75) int local75 = Static66.anIntArray180[local28];
			@Pc(80) int local80 = Static66.anIntArray179[local28++];
			@Pc(84) int local84 = Static66.anIntArray180[local28];
			@Pc(89) int local89 = Static66.anIntArray179[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method5296(local89, local80, local75, local66, local84, local71);
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lclient!gi;IIIIZ)V")
	@Override
	public void method2788(@OriginalArg(0) Class1_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass128_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass32_Sub2_13.anInt2500 >> 8) >> this.aClass32_Sub2_13.anInt2483;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass32_Sub2_13.anInt2507 >> 8) >> this.aClass32_Sub2_13.anInt2483;
			this.aClass128_1.method3499(local33, arg0, local19);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!gi;IIIIZ)V")
	@Override
	public void method2782(@OriginalArg(0) Class1_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass128_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass32_Sub2_13.anInt2500 >> 8) >> this.aClass32_Sub2_13.anInt2483;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass32_Sub2_13.anInt2507 >> 8) >> this.aClass32_Sub2_13.anInt2483;
			this.aClass128_1.method3501(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(2) int local2 = arg8.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local2; local45++) {
			@Pc(52) int local52 = arg5[local45];
			@Pc(56) int local56 = arg6[local45];
			@Pc(60) int local60 = arg7[local45];
			local7[local43] = arg2[local52];
			local12[local43] = arg4[local52];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local52];
			}
			local43++;
			local7[local43] = arg2[local56];
			local12[local43] = arg4[local56];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local56];
			}
			local43++;
			local7[local43] = arg2[local60];
			local12[local43] = arg4[local60];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local60];
			}
			local43++;
		}
		this.method2790(arg0, arg1, local7, local41, local12, local17, local22, local27, local32, arg12, arg13, false);
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(Lclient!gi;IIIIZ)Z")
	@Override
	public boolean method2796(@OriginalArg(0) Class1_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass128_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass32_Sub2_13.anInt2500 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass32_Sub2_13.anInt2507 >> 8) >> 3;
			return this.aClass128_1.method3506(local30, arg0, local18);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!gi;)Lclient!gi;")
	@Override
	public Class1_Sub4_Sub10 method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub4_Sub10 arg2) {
		if ((this.aByteArrayArray3[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt1814 >> this.aClass32_Sub2_13.anInt2483;
		@Pc(20) Class1_Sub4_Sub10_Sub1 local20 = (Class1_Sub4_Sub10_Sub1) arg2;
		@Pc(30) Class1_Sub4_Sub10_Sub1 local30;
		if (local20 != null && local20.method5297(local17, local17)) {
			local30 = local20;
			local20.method5298();
		} else {
			local30 = new Class1_Sub4_Sub10_Sub1(this.aClass32_Sub2_13, local17, local17);
		}
		local30.method5294(local17, local17, 0, 0);
		this.method1610(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
	@Override
	public void method2787() {
		if (this.anInt1817 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt3017 + 1][this.anInt3016 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt3017; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt3016; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray4[local14 - 1][local20] >> 2) + (this.aByteArrayArray4[local14 + 1][local20] >> 3) + (this.aByteArrayArray4[local14][local20 - 1] >> 2) + (this.aByteArrayArray4[local14][local20 + 1] >> 3) + (this.aByteArrayArray4[local14][local20] >> 1));
				}
			}
			this.aClass1_Sub6Array1 = new Class1_Sub6[this.aClass197_6.method5158()];
			this.aClass197_6.method5156(this.aClass1_Sub6Array1);
			for (local14 = 0; local14 < this.aClass1_Sub6Array1.length; local14++) {
				this.aClass1_Sub6Array1[local14].method355(this.anInt1817);
			}
			local14 = 24;
			if (this.anIntArrayArray20 != null) {
				local14 += 4;
			}
			if ((this.anInt1812 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt1817 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class1_Sub6[] local141 = new Class1_Sub6[this.anInt1817];
			@Pc(149) Class197 local149 = new Class197(Static258.method4650(this.anInt1817));
			@Pc(153) Class1_Sub6[] local153 = new Class1_Sub6[this.anInt1816];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt3017; local155++) {
				for (local161 = 0; local161 < this.anInt3016; local161++) {
					if (this.anIntArrayArrayArray4[local155][local161] != null) {
						@Pc(180) Class1_Sub6[] local180 = this.aClass1_Sub6ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray3[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray2[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray5[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray1[local155][local161];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray4[local155][local161];
						if (local208 == null) {
							local208 = local215;
						}
						@Pc(226) float local226 = this.aFloatArrayArray3[local155][local161];
						@Pc(233) float local233 = this.aFloatArrayArray2[local155][local161];
						@Pc(240) float local240 = this.aFloatArrayArray4[local155][local161];
						@Pc(249) float local249 = this.aFloatArrayArray3[local155][local161 + 1];
						@Pc(258) float local258 = this.aFloatArrayArray2[local155][local161 + 1];
						@Pc(267) float local267 = this.aFloatArrayArray4[local155][local161 + 1];
						@Pc(278) float local278 = this.aFloatArrayArray3[local155 + 1][local161 + 1];
						@Pc(289) float local289 = this.aFloatArrayArray2[local155 + 1][local161 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray4[local155 + 1][local161 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray3[local155 + 1][local161];
						@Pc(318) float local318 = this.aFloatArrayArray2[local155 + 1][local161];
						@Pc(327) float local327 = this.aFloatArrayArray4[local155 + 1][local161];
						@Pc(335) int local335 = local12[local155][local161] & 0xFF;
						@Pc(345) int local345 = local12[local155][local161 + 1] & 0xFF;
						@Pc(357) int local357 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(367) int local367 = local12[local155 + 1][local161] & 0xFF;
						@Pc(378) float local378;
						@Pc(388) float local388;
						@Pc(400) float local400;
						@Pc(410) float local410;
						if (this.anIntArrayArray20 == null) {
							local410 = 0.0F;
							local400 = 0.0F;
							local388 = 0.0F;
							local378 = 0.0F;
						} else {
							local378 = this.anIntArrayArray20[local155][local161];
							local388 = this.anIntArrayArray20[local155][local161 + 1];
							local400 = this.anIntArrayArray20[local155 + 1][local161 + 1];
							local410 = this.anIntArrayArray20[local155 + 1][local161];
						}
						@Pc(421) int local421 = 0;
						@Pc(433) int local433;
						label304: for (@Pc(423) int local423 = 0; local423 < local215.length; local423++) {
							@Pc(431) Class1_Sub6 local431 = local180[local423];
							for (local433 = 0; local433 < local421; local433++) {
								if (local153[local433] == local431) {
									continue label304;
								}
							}
							local153[local421++] = local431;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray1[local161 * this.anInt3017 + local155] = new short[local215.length];
						for (@Pc(467) int local467 = 0; local467 < local215.length; local467++) {
							@Pc(480) int local480 = (local155 << this.anInt1811) + local194[local467];
							@Pc(489) int local489 = (local161 << this.anInt1811) + local201[local467];
							@Pc(493) int local493 = local215[local467];
							@Pc(497) int local497 = local208[local467];
							@Pc(505) int local505 = local187 == null ? 0 : local187[local467];
							@Pc(523) long local523 = (long) local497 << 48 | (long) local493 << 32 | (long) (local480 << 16) | (long) local489;
							@Pc(527) int local527 = local194[local467];
							@Pc(531) int local531 = local201[local467];
							@Pc(535) int local535 = 0;
							@Pc(537) float local537 = 1.0F;
							@Pc(553) int local553;
							@Pc(543) float local543;
							@Pc(545) float local545;
							@Pc(547) float local547;
							@Pc(549) float local549;
							@Pc(643) float local643;
							if (local527 == 0 && local531 == 0) {
								local543 = local226;
								local545 = local233;
								local547 = local240;
								local549 = local378;
								local553 = 74 - local335;
							} else if (local527 == 0 && local531 == this.anInt1814) {
								local543 = local249;
								local545 = local258;
								local547 = local267;
								local549 = local388;
								local553 = 74 - local345;
							} else if (local527 == this.anInt1814 && local531 == this.anInt1814) {
								local543 = local278;
								local545 = local289;
								local547 = local300;
								local549 = local400;
								local553 = 74 - local357;
							} else if (local527 == this.anInt1814 && local531 == 0) {
								local543 = local309;
								local545 = local318;
								local547 = local327;
								local549 = local410;
								local553 = 74 - local367;
							} else {
								@Pc(620) float local620 = (float) local527 / (float) this.anInt1814;
								@Pc(627) float local627 = (float) local531 / (float) this.anInt1814;
								@Pc(635) float local635 = local226 + (local309 - local226) * local620;
								local643 = local233 + (local318 - local233) * local620;
								@Pc(651) float local651 = local240 + (local327 - local240) * local620;
								@Pc(659) float local659 = local249 + (local278 - local249) * local620;
								@Pc(667) float local667 = local258 + (local289 - local258) * local620;
								@Pc(675) float local675 = local267 + (local300 - local267) * local620;
								local543 = local635 + (local659 - local635) * local627;
								local545 = local643 + (local667 - local643) * local627;
								local547 = local651 + (local675 - local651) * local627;
								@Pc(710) int local710 = local335 + ((local367 - local335) * local527 >> this.anInt1811);
								@Pc(721) int local721 = local345 + ((local357 - local345) * local527 >> this.anInt1811);
								local553 = 74 - local710 - ((local721 - local710) * local531 >> this.anInt1811);
								@Pc(742) float local742 = local378 + (local410 - local378) * local620;
								@Pc(750) float local750 = local388 + (local400 - local388) * local620;
								local549 = local742 + (local750 - local742) * local627;
							}
							if (local493 != -1) {
								@Pc(769) int local769 = (local493 & 0x7F) * local553 >> 7;
								if (local769 < 2) {
									local769 = 2;
								} else if (local769 > 126) {
									local769 = 126;
								}
								local535 = Static177.anIntArray371[local493 & 0xFF80 | local769];
								if ((this.anInt1812 & 0x7) == 0) {
									local537 = this.aClass32_Sub2_13.aFloatArray16[0] * local543 + this.aClass32_Sub2_13.aFloatArray16[1] * local545 + this.aClass32_Sub2_13.aFloatArray16[2] * local547;
									local537 = this.aClass32_Sub2_13.aFloat23 + local537 * (local537 > 0.0F ? this.aClass32_Sub2_13.aFloat35 : this.aClass32_Sub2_13.aFloat34);
								}
							}
							@Pc(840) Class1 local840 = local149.method5157(local523);
							@Pc(872) int local872;
							if (local840 == null) {
								if (local497 == local493) {
									local872 = local535;
								} else {
									@Pc(853) int local853 = (local497 & 0x7F) * local553 >> 7;
									if (local853 < 2) {
										local853 = 2;
									} else if (local853 > 126) {
										local853 = 126;
									}
									local872 = Static177.anIntArray371[local497 & 0xFF80 | local853];
									if ((this.anInt1812 & 0x7) == 0) {
										@Pc(900) float local900 = this.aClass32_Sub2_13.aFloatArray16[0] * local543 + this.aClass32_Sub2_13.aFloatArray16[1] * local545 + this.aClass32_Sub2_13.aFloatArray16[2] * local547;
										local643 = this.aClass32_Sub2_13.aFloat23 + local537 * (local537 > 0.0F ? this.aClass32_Sub2_13.aFloat35 : this.aClass32_Sub2_13.aFloat34);
										@Pc(925) int local925 = local872 >> 16 & 0xFF;
										@Pc(931) int local931 = local872 >> 8 & 0xFF;
										@Pc(935) int local935 = local872 & 0xFF;
										local925 = (int) ((float) local925 * local643);
										if (local925 < 0) {
											local925 = 0;
										} else if (local925 > 255) {
											local925 = 255;
										}
										local931 = (int) ((float) local931 * local643);
										if (local931 < 0) {
											local931 = 0;
										} else if (local931 > 255) {
											local931 = 255;
										}
										local935 = (int) ((float) local935 * local643);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local872 = local925 << 16 | local931 << 8 | local935;
									}
								}
								local137.putFloat((float) local480);
								local137.putFloat((float) (this.method2792(local480, local489) + local505));
								local137.putFloat((float) local489);
								local137.put((byte) (local872 >> 16));
								local137.put((byte) (local872 >> 8));
								local137.put((byte) local872);
								local137.put((byte) -1);
								local137.putFloat((float) local480);
								local137.putFloat((float) local489);
								if (this.anIntArrayArray20 != null) {
									local137.putFloat(local549 + (float) local505);
								}
								if ((this.anInt1812 & 0x7) != 0) {
									local137.putFloat(local543);
									local137.putFloat(local545);
									local137.putFloat(local547);
								}
								local433 = this.anInt1810++;
								local465[local467] = (short) local433;
								if (local493 != -1) {
									local141[local433] = local180[local467];
								}
								local149.method5166(new Class1_Sub14(local465[local467]), local523);
							} else {
								local465[local467] = ((Class1_Sub14) local840).aShort26;
								local433 = local465[local467] & 0xFFFF;
								if (local493 != -1 && local180[local467].aLong213 < local141[local433].aLong213) {
									local141[local433] = local180[local467];
								}
							}
							for (local872 = 0; local872 < local421; local872++) {
								local153[local872].method354(local553, local537, local535, local433);
							}
							this.anInt1813++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt1810; local155++) {
				@Pc(1178) Class1_Sub6 local1178 = local141[local155];
				if (local1178 != null) {
					local1178.method357(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt3017; local155++) {
				for (local161 = 0; local161 < this.anInt3016; local161++) {
					@Pc(1208) short[] local1208 = this.aShortArrayArray1[local161 * this.anInt3017 + local155];
					if (local1208 != null) {
						@Pc(1212) int local1212 = 0;
						@Pc(1214) int local1214 = 0;
						while (local1214 < local1208.length) {
							@Pc(1225) int local1225 = local1208[local1214++] & 0xFFFF;
							@Pc(1232) int local1232 = local1208[local1214++] & 0xFFFF;
							@Pc(1239) int local1239 = local1208[local1214++] & 0xFFFF;
							@Pc(1243) Class1_Sub6 local1243 = local141[local1225];
							@Pc(1247) Class1_Sub6 local1247 = local141[local1232];
							@Pc(1251) Class1_Sub6 local1251 = local141[local1239];
							@Pc(1253) Class1_Sub6 local1253 = null;
							if (local1243 != null) {
								local1243.method358(local155, local1212, local161);
								local1253 = local1243;
							}
							if (local1247 != null) {
								local1247.method358(local155, local1212, local161);
								if (local1253 == null || local1247.aLong213 < local1253.aLong213) {
									local1253 = local1247;
								}
							}
							if (local1251 != null) {
								local1251.method358(local155, local1212, local161);
								if (local1253 == null || local1251.aLong213 < local1253.aLong213) {
									local1253 = local1251;
								}
							}
							if (local1253 != null) {
								if (local1243 != null) {
									local1253.method357(local1225);
								}
								if (local1247 != null) {
									local1253.method357(local1232);
								}
								if (local1251 != null) {
									local1253.method357(local1239);
								}
								local1253.method358(local155, local1212, local161);
							}
							local1212++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface8_1 = this.aClass32_Sub2_13.method2272(local14, local137);
			this.aClass91_2 = new Class91(this.aClass32_Sub2_13, this.anInterface8_1, 5126, 3, 0);
			this.aClass91_3 = new Class91(this.aClass32_Sub2_13, this.anInterface8_1, 5121, 4, 12);
			@Pc(1383) byte local1383;
			if (this.anIntArrayArray20 == null) {
				this.aClass91_4 = new Class91(this.aClass32_Sub2_13, this.anInterface8_1, 5126, 2, 16);
				local1383 = 24;
			} else {
				this.aClass91_4 = new Class91(this.aClass32_Sub2_13, this.anInterface8_1, 5126, 3, 16);
				local1383 = 28;
			}
			if ((this.anInt1812 & 0x7) != 0) {
				this.aClass91_5 = new Class91(this.aClass32_Sub2_13, this.anInterface8_1, 5126, 3, local1383);
				local155 = local1383 + 12;
			}
			@Pc(1421) long[] local1421 = new long[this.aClass1_Sub6Array1.length];
			for (@Pc(1423) int local1423 = 0; local1423 < this.aClass1_Sub6Array1.length; local1423++) {
				@Pc(1433) Class1_Sub6 local1433 = this.aClass1_Sub6Array1[local1423];
				local1421[local1423] = local1433.aLong213;
				local1433.method353(this.anInt1810);
			}
			Static29.method763(this.aClass1_Sub6Array1, local1421);
			if (this.aClass128_1 != null) {
				this.aClass128_1.method3507();
			}
		} else {
			this.aClass128_1 = null;
		}
		this.anIntArrayArrayArray2 = this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray1 = null;
		this.anIntArrayArrayArray3 = null;
		this.aClass1_Sub6ArrayArrayArray1 = null;
		this.anIntArrayArrayArray4 = null;
		this.aByteArrayArray4 = null;
		this.aClass197_6 = null;
		this.anIntArrayArray20 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)I")
	@Override
	public int method2792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt1811;
		@Pc(9) int local9 = arg1 >> this.anInt1811;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt3017 - 1 || local9 > this.anInt3016 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt1814 - 1;
		@Pc(41) int local41 = arg1 & this.anInt1814 - 1;
		@Pc(67) int local67 = this.anIntArrayArray19[local4][local9] * (this.anInt1814 - local34) + this.anIntArrayArray19[local4 + 1][local9] * local34 >> this.anInt1811;
		@Pc(97) int local97 = this.anIntArrayArray19[local4][local9 + 1] * (this.anInt1814 - local34) + this.anIntArrayArray19[local4 + 1][local9 + 1] * local34 >> this.anInt1811;
		return local67 * (this.anInt1814 - local41) + local97 * local41 >> this.anInt1811;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass1_Sub6Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass32_Sub2_13.aFloat37;
		@Pc(10) float local10 = this.aClass32_Sub2_13.aFloat19;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static66.anIntArray178.length < local20) {
			Static66.anIntArray178 = new int[local20];
		}
		if (Static66.aClass1_Sub8_3.aByteArray81.length < this.anInt1813 * 2) {
			Static66.aClass1_Sub8_3 = new Class1_Sub8(this.anInt1813 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt3017 - 1) {
			local67 = this.anInt3017 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt3016 - 1) {
			local82 = this.anInt3016 - 1;
		}
		Static66.anInt1815 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static66.anIntArray178[Static66.anInt1815++] = local108 * this.anInt3017 + local97;
				}
			}
		}
		this.aClass32_Sub2_13.method2315();
		this.aClass32_Sub2_13.method2250((this.anInt1812 & 0x7) != 0);
		for (local97 = 0; local97 < this.aClass1_Sub6Array1.length; local97++) {
			this.aClass1_Sub6Array1[local97].method356(Static66.anIntArray178, Static66.anInt1815);
		}
		if (!this.aClass16_5.method418()) {
			local97 = this.aClass32_Sub2_13.anInt2514;
			@Pc(180) int local180 = this.aClass32_Sub2_13.anInt2493;
			this.aClass32_Sub2_13.method2204(0, local180);
			this.aClass32_Sub2_13.method2225(local10, local6 - 4.0F);
			this.aClass32_Sub2_13.method2250(false);
			this.aClass32_Sub2_13.method2281(false);
			this.aClass32_Sub2_13.method2291(130);
			this.aClass32_Sub2_13.method2258();
			this.aClass32_Sub2_13.method2287(this.aClass32_Sub2_13.aClass20_Sub1_3);
			this.aClass32_Sub2_13.method2255(8448, 7681);
			this.aClass32_Sub2_13.method2276(0, 34166, 770);
			this.aClass32_Sub2_13.method2265(0, 34167);
			for (@Pc(236) Class1 local236 = this.aClass16_5.method410(); local236 != null; local236 = this.aClass16_5.method419()) {
				@Pc(241) Class1_Sub34 local241 = (Class1_Sub34) local236;
				local241.method5101(arg3, arg0, arg2, arg1);
			}
			this.aClass32_Sub2_13.method2276(0, 5890, 768);
			this.aClass32_Sub2_13.method2265(0, 5890);
			this.aClass32_Sub2_13.method2287(null);
			this.aClass32_Sub2_13.method2204(local97, local180);
		}
		if (this.aClass128_1 != null) {
			this.aClass32_Sub2_13.method2225(local10, local6 - 8.0F);
			this.aClass32_Sub2_13.method2315();
			this.aClass32_Sub2_13.method2269(this.aClass91_2, null, null, this.aClass91_4);
			this.aClass128_1.method3500(arg1, arg2, arg0, arg3, arg4);
		}
		this.aClass32_Sub2_13.method2225(local10, local6);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	@Override
	public void method2793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray4[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method2790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		this.anIntArrayArrayArray3[arg0][arg1] = arg3;
		this.anIntArrayArrayArray2[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray4[arg0][arg1] = arg5;
		this.anIntArrayArrayArray1[arg0][arg1] = arg6;
		@Pc(45) Class1_Sub6[] local45 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1] = new Class1_Sub6[arg5.length];
		for (@Pc(47) int local47 = 0; local47 < arg5.length; local47++) {
			@Pc(73) long local73 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[local47] << 16) | (long) arg8[local47];
			@Pc(79) Class1 local79 = this.aClass197_6.method5157(local73);
			if (local79 == null) {
				local45[local47] = new Class1_Sub6(this, arg7[local47], arg8[local47], arg9, arg10);
				this.aClass197_6.method5166(local45[local47], local73);
			} else {
				local45[local47] = (Class1_Sub6) local79;
			}
		}
		if (arg11) {
			this.aByteArrayArray3[arg0][arg1] = (byte) (this.aByteArrayArray3[arg0][arg1] | 0x1);
		}
		if (arg5.length > this.anInt1816) {
			this.anInt1816 = arg5.length;
		}
		this.anInt1817 += arg5.length;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2789(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1817 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass32_Sub2_13.anOpengl2;
		this.aClass32_Sub2_13.method2268();
		this.aClass32_Sub2_13.method2312(false);
		this.aClass32_Sub2_13.method2250(false);
		this.aClass32_Sub2_13.method2262(false);
		this.aClass32_Sub2_13.method2281(false);
		this.aClass32_Sub2_13.method2291(0);
		this.aClass32_Sub2_13.method2258();
		this.aClass32_Sub2_13.method2287(null);
		Static66.aFloatArray5[0] = (float) 1024 / ((float) this.anInt1814 * 128.0F * (float) this.aClass32_Sub2_13.anInt2490);
		Static66.aFloatArray5[1] = 0.0F;
		Static66.aFloatArray5[2] = 0.0F;
		Static66.aFloatArray5[3] = 0.0F;
		Static66.aFloatArray5[4] = 0.0F;
		Static66.aFloatArray5[5] = (float) 1024 / ((float) this.anInt1814 * 128.0F * (float) this.aClass32_Sub2_13.anInt2489);
		Static66.aFloatArray5[6] = 0.0F;
		Static66.aFloatArray5[7] = 0.0F;
		Static66.aFloatArray5[8] = 0.0F;
		Static66.aFloatArray5[9] = 0.0F;
		Static66.aFloatArray5[10] = 0.0F;
		Static66.aFloatArray5[11] = 0.0F;
		Static66.aFloatArray5[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass32_Sub2_13.anInt2490;
		Static66.aFloatArray5[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass32_Sub2_13.anInt2489;
		Static66.aFloatArray5[14] = 0.0F;
		Static66.aFloatArray5[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static66.aFloatArray5, 0);
		Static66.aFloatArray5[0] = 1.0F;
		Static66.aFloatArray5[1] = 0.0F;
		Static66.aFloatArray5[2] = 0.0F;
		Static66.aFloatArray5[3] = 0.0F;
		Static66.aFloatArray5[4] = 0.0F;
		Static66.aFloatArray5[5] = 0.0F;
		Static66.aFloatArray5[6] = 1.0F;
		Static66.aFloatArray5[7] = 0.0F;
		Static66.aFloatArray5[8] = 0.0F;
		Static66.aFloatArray5[9] = 1.0F;
		Static66.aFloatArray5[10] = 0.0F;
		Static66.aFloatArray5[11] = 0.0F;
		Static66.aFloatArray5[12] = 0.0F;
		Static66.aFloatArray5[13] = 0.0F;
		Static66.aFloatArray5[14] = 0.0F;
		Static66.aFloatArray5[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static66.aFloatArray5, 0);
		if ((this.anInt1812 & 0x7) == 0) {
			this.aClass32_Sub2_13.method2250(false);
		} else {
			this.aClass32_Sub2_13.method2250(true);
			this.aClass32_Sub2_13.method2280();
		}
		this.aClass32_Sub2_13.method2269(this.aClass91_2, this.aClass91_5, this.aClass91_3, this.aClass91_4);
		if (Static66.aClass1_Sub8_3.aByteArray81.length < this.anInt1813 * 2) {
			Static66.aClass1_Sub8_3 = new Class1_Sub8(this.anInt1813 * 2);
		} else {
			Static66.aClass1_Sub8_3.anInt5182 = 0;
		}
		@Pc(288) int local288 = 0;
		@Pc(294) int local294;
		@Pc(304) int local304;
		@Pc(306) int local306;
		@Pc(324) short[] local324;
		@Pc(328) int local328;
		if (this.aClass32_Sub2_13.aBoolean240) {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt3017 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray1[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static66.aClass1_Sub8_3.method4542(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		} else {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt3017 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray1[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static66.aClass1_Sub8_3.method4509(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		}
		if (local288 > 0) {
			@Pc(418) Class4_Sub2 local418 = new Class4_Sub2(this.aClass32_Sub2_13, 5123, Static66.aClass1_Sub8_3.aByteArray81, Static66.aClass1_Sub8_3.anInt5182);
			this.aClass32_Sub2_13.method2252(local418, 0, local288);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
	@Override
	public int method2785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray19[arg0][arg1];
	}
}
