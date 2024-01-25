import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class59_Sub2 extends Class59 {

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
	private int anInt4293;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
	private int anInt4294;

	@OriginalMember(owner = "client!iq", name = "S", descriptor = "Lclient!bf;")
	public Class28 aClass28_13;

	@OriginalMember(owner = "client!iq", name = "V", descriptor = "Lclient!ii;")
	private Interface13 anInterface13_8;

	@OriginalMember(owner = "client!iq", name = "X", descriptor = "I")
	private int anInt4303;

	@OriginalMember(owner = "client!iq", name = "Y", descriptor = "[Lclient!fr;")
	private Class6_Sub20[] aClass6_Sub20Array1;

	@OriginalMember(owner = "client!iq", name = "Z", descriptor = "Lclient!ii;")
	private Interface13 anInterface13_9;

	@OriginalMember(owner = "client!iq", name = "cb", descriptor = "I")
	private int anInt4304;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "F")
	private float aFloat83 = -3.4028235E38F;

	@OriginalMember(owner = "client!iq", name = "K", descriptor = "F")
	private float aFloat84 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!iq", name = "G", descriptor = "Lclient!ws;")
	private final Class361 aClass361_27 = new Class361();

	@OriginalMember(owner = "client!iq", name = "F", descriptor = "[[I")
	private final int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "Lclient!kea;")
	public final Class14_Sub2 aClass14_Sub2_6;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
	private final int anInt4280;

	@OriginalMember(owner = "client!iq", name = "E", descriptor = "I")
	private final int anInt4296;

	@OriginalMember(owner = "client!iq", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!iq", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "[[[Lclient!fr;")
	private Class6_Sub20[][][] aClass6_Sub20ArrayArrayArray1;

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!iq", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!iq", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[[B")
	private final byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!iq", name = "R", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!iq", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public final int anInt4288;

	@OriginalMember(owner = "client!iq", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!iq", name = "U", descriptor = "Lclient!hd;")
	private Class128 aClass128_20;

	@OriginalMember(owner = "client!iq", name = "Q", descriptor = "Lclient!o;")
	private Class229 aClass229_1;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!kea;IIII[[I[[II)V")
	public Class59_Sub2(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray26 = arg5;
		this.aClass14_Sub2_6 = arg0;
		this.anInt4280 = super.anInt9638 - 2;
		this.anInt4296 = 0x1 << this.anInt4280;
		this.aFloatArrayArray4 = new float[super.anInt9640 + 1][super.anInt9639 + 1];
		this.aFloatArrayArray2 = new float[super.anInt9640 + 1][super.anInt9639 + 1];
		this.aClass6_Sub20ArrayArrayArray1 = new Class6_Sub20[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt9640 + 1][super.anInt9639 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aShortArrayArray7 = new short[arg4 * arg3][];
		this.aByteArrayArray13 = new byte[arg3][arg4];
		this.aByteArrayArray14 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anInt4288 = arg2;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		for (@Pc(123) int local123 = 0; local123 <= super.anInt9639; local123++) {
			for (@Pc(127) int local127 = 0; local127 <= super.anInt9640; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray26[local127][local123];
				if ((float) local136 > this.aFloat83) {
					this.aFloat83 = local136;
				}
				if (this.aFloat84 > (float) local136) {
					this.aFloat84 = local136;
				}
				if (local127 > 0 && local123 > 0 && super.anInt9640 > local127 && local123 < super.anInt9639) {
					@Pc(189) int local189 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(206) int local206 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(226) float local226 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local189 * local189 + local206 * local206)));
					this.aFloatArrayArray4[local127][local123] = (float) local189 * local226;
					this.aFloatArrayArray3[local127][local123] = local226 * (float) (-arg7 * 2);
					this.aFloatArrayArray2[local127][local123] = (float) local206 * local226;
				}
			}
		}
		this.aFloat84--;
		this.aFloat83++;
		this.aClass128_20 = new Class128(128);
		if ((this.anInt4288 & 0x10) != 0) {
			this.aClass229_1 = new Class229(this.aClass14_Sub2_6, this);
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class6_Sub2_Sub14 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub14 arg2) {
		if ((this.aByteArrayArray13[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9641 >> this.aClass14_Sub2_6.anInt8591;
		@Pc(24) Class6_Sub2_Sub14_Sub1 local24 = (Class6_Sub2_Sub14_Sub1) arg2;
		@Pc(40) Class6_Sub2_Sub14_Sub1 local40;
		if (local24 != null && local24.method5717(local21, local21)) {
			local40 = local24;
			local24.method5720();
		} else {
			local40 = new Class6_Sub2_Sub14_Sub1(this.aClass14_Sub2_6, local21, local21);
		}
		local40.method5718(0, local21, local21, 0);
		this.method3750(local40, arg0, arg1);
		return local40;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
	@Override
	public void method7862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!pca;II)V")
	private void method3750(@OriginalArg(1) Class6_Sub2_Sub14_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray10[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static328.anIntArray441.length) {
			Static328.anIntArray441 = new int[local22];
			Static113.anIntArray164 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static328.anIntArray441[local34] = local12[local34] >> this.aClass14_Sub2_6.anInt8591;
			Static113.anIntArray164[local34] = local19[local34] >> this.aClass14_Sub2_6.anInt8591;
		}
		@Pc(66) int local66 = 0;
		while (local22 > local66) {
			@Pc(72) int local72 = Static328.anIntArray441[local66];
			@Pc(77) int local77 = Static113.anIntArray164[local66++];
			@Pc(81) int local81 = Static328.anIntArray441[local66];
			@Pc(86) int local86 = Static113.anIntArray164[local66++];
			@Pc(90) int local90 = Static328.anIntArray441[local66];
			@Pc(95) int local95 = Static113.anIntArray164[local66++];
			if (-((local86 - local77) * (local90 - local81)) + (local72 - local81) * (local86 - local95) > 0) {
				arg0.method5716(local90, local86, local95, local77, local72, local81);
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!bj;[I)V")
	@Override
	public void method7866(@OriginalArg(0) Class6_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass361_27.method7833(new Class6_Sub37(this.aClass14_Sub2_6, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7864(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4304 <= 0) {
			return;
		}
		@Pc(19) Interface23 local19 = this.aClass14_Sub2_6.method6945(this.anInt4293);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method4095();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass14_Sub2_6.method6939(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(76) short[] local76;
				@Pc(80) int local80;
				@Pc(88) int local88;
				if (Stream.b()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = super.anInt9640 * local48 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local76 = this.aShortArrayArray7[local57];
								if (local76 != null) {
									for (local80 = 0; local80 < local76.length; local80++) {
										local88 = local76[local80] & 0xFFFF;
										if (local88 < local23) {
											local23 = local88;
										}
										local44.c(local88);
										if (local88 > local25) {
											local25 = local88;
										}
										local21++;
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt9640;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local76 = this.aShortArrayArray7[local57];
								if (local76 != null) {
									for (local80 = 0; local80 < local76.length; local80++) {
										local88 = local76[local80] & 0xFFFF;
										if (local88 > local25) {
											local25 = local88;
										}
										if (local23 > local88) {
											local23 = local88;
										}
										local21++;
										local44.a(local88);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.c();
				if (local19.method4094()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass14_Sub2_6.method6942();
		this.aClass14_Sub2_6.method6966(false);
		this.aClass14_Sub2_6.method6947(false);
		this.aClass14_Sub2_6.method7028(false);
		this.aClass14_Sub2_6.method6906(false);
		this.aClass14_Sub2_6.method6998(0);
		this.aClass14_Sub2_6.method6981(false, -2, false);
		this.aClass14_Sub2_6.method7034(null);
		@Pc(264) Class54_Sub3 local264 = this.aClass14_Sub2_6.method7012();
		@Pc(269) float[] local269 = this.aClass14_Sub2_6.method7008();
		local269[3] = 0.0F;
		local269[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass14_Sub2_6.anInt8422;
		local269[7] = 0.0F;
		local269[10] = 1.0F / (this.aFloat83 - this.aFloat84);
		local269[5] = (float) 1024 / ((float) super.anInt9641 * 128.0F * (float) this.aClass14_Sub2_6.anInt8558);
		local269[0] = (float) 1024 / ((float) super.anInt9641 * 128.0F * (float) this.aClass14_Sub2_6.anInt8422);
		local269[11] = 0.0F;
		local269[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass14_Sub2_6.anInt8558;
		local269[6] = 0.0F;
		local269[2] = 0.0F;
		local269[4] = 0.0F;
		local269[15] = 1.0F;
		local269[1] = 0.0F;
		local269[9] = 0.0F;
		local269[8] = 0.0F;
		local269[14] = -this.aFloat84 / (this.aFloat83 - this.aFloat84);
		local264.method5446(0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass14_Sub2_6.method7038();
		this.aClass14_Sub2_6.method7033();
		if ((this.anInt4288 & 0x7) == 0) {
			this.aClass14_Sub2_6.method6947(false);
		} else {
			this.aClass14_Sub2_6.method6947(true);
			this.aClass14_Sub2_6.method7006();
		}
		this.aClass14_Sub2_6.method6983(false);
		this.aClass14_Sub2_6.method6994(0, this.anInterface13_8);
		this.aClass14_Sub2_6.method6994(1, this.anInterface13_9);
		this.aClass14_Sub2_6.method6944(this.aClass28_13);
		this.aClass14_Sub2_6.method7026(0, local23, local25 + 1 - local23, local21 / 3, Static181.aClass311_4, local19);
		this.aClass14_Sub2_6.method6983(true);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(47) int[] local47 = arg3 == null ? null : new int[local8 * 3];
		@Pc(56) int[] local56 = arg5 == null ? null : new int[local8 * 3];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local8; local60++) {
			@Pc(66) int local66 = arg6[local60];
			@Pc(70) int local70 = arg7[local60];
			@Pc(74) int local74 = arg8[local60];
			local13[local58] = arg2[local66];
			local18[local58] = arg4[local66];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local66];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local66];
			}
			local58++;
			local13[local58] = arg2[local70];
			local18[local58] = arg4[local70];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local70];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local70];
			}
			local58++;
			local13[local58] = arg2[local74];
			local18[local58] = arg4[local74];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.BA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!iq", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9638;
		@Pc(13) int local13 = arg1 >> super.anInt9638;
		if (local8 < 0 || local13 < 0 || super.anInt9640 - 1 < local8 || local13 > super.anInt9639 - 1) {
			return 0;
		}
		@Pc(41) int local41 = arg0 & super.anInt9641 - 1;
		@Pc(48) int local48 = arg1 & super.anInt9641 - 1;
		@Pc(75) int local75 = (super.anInt9641 - local41) * this.anIntArrayArray26[local8][local13] + local41 * this.anIntArrayArray26[local8 + 1][local13] >> super.anInt9638;
		@Pc(106) int local106 = this.anIntArrayArray26[local8 + 1][local13 + 1] * local41 + (super.anInt9641 - local41) * this.anIntArrayArray26[local8][local13 + 1] >> super.anInt9638;
		return (super.anInt9641 - local48) * local75 + local106 * local48 >> super.anInt9638;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3752(arg0, arg3, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!iq", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray14[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray14[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method7865(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass229_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass14_Sub2_6.anInt8589 >> 8) >> this.aClass14_Sub2_6.anInt8591;
			@Pc(40) int local40 = arg3 - (this.aClass14_Sub2_6.anInt8580 * arg2 >> 8) >> this.aClass14_Sub2_6.anInt8591;
			return this.aClass229_1.method5380(local40, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt4304 <= 0) {
			this.aClass229_1 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt9640 + 1][super.anInt9639 + 1];
			for (@Pc(24) int local24 = 1; local24 < super.anInt9640; local24++) {
				for (@Pc(28) int local28 = 1; super.anInt9639 > local28; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray14[local24][local28] >> 1) + (this.aByteArrayArray14[local24 + 1][local28] >> 3) + (this.aByteArrayArray14[local24 - 1][local28] >> 2) + (this.aByteArrayArray14[local24][local28 + -1] >> 2) + (this.aByteArrayArray14[local24][local28 + 1] >> 3));
				}
			}
			@Pc(104) Class6_Sub20[] local104 = new Class6_Sub20[this.aClass128_20.method3268()];
			this.aClass128_20.method3271(local104);
			for (@Pc(112) int local112 = 0; local112 < local104.length; local112++) {
				local104[local112].method2828(this.anInt4304);
			}
			@Pc(132) int local132 = 20;
			if (this.anIntArrayArrayArray6 != null) {
				local132 += 4;
			}
			if ((this.anInt4288 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(152) NativeHeapBuffer local152 = this.aClass14_Sub2_6.aNativeHeap6.a(this.anInt4304 * 4, false);
			@Pc(162) NativeHeapBuffer local162 = this.aClass14_Sub2_6.aNativeHeap6.a(local132 * this.anInt4304, false);
			@Pc(167) Stream local167 = new Stream(local162);
			@Pc(172) Stream local172 = new Stream(local152);
			@Pc(176) Class6_Sub20[] local176 = new Class6_Sub20[this.anInt4304];
			@Pc(183) int local183 = Static505.method6819(this.anInt4304 / 4);
			if (local183 < 1) {
				local183 = 1;
			}
			@Pc(193) Class128 local193 = new Class128(local183);
			@Pc(197) Class6_Sub20[] local197 = new Class6_Sub20[this.anInt4303];
			@Pc(203) int local203;
			for (@Pc(199) int local199 = 0; super.anInt9640 > local199; local199++) {
				for (local203 = 0; super.anInt9639 > local203; local203++) {
					if (this.anIntArrayArrayArray8[local199][local203] != null) {
						@Pc(219) Class6_Sub20[] local219 = this.aClass6_Sub20ArrayArrayArray1[local199][local203];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray10[local199][local203];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray7[local199][local203];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray9[local199][local203];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray8[local199][local203];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local199][local203];
						if (local240 == null) {
							local240 = local247;
						}
						@Pc(275) int[] local275 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local199][local203];
						@Pc(282) float local282 = this.aFloatArrayArray4[local199][local203];
						@Pc(289) float local289 = this.aFloatArrayArray3[local199][local203];
						@Pc(296) float local296 = this.aFloatArrayArray2[local199][local203];
						@Pc(305) float local305 = this.aFloatArrayArray4[local199][local203 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray3[local199][local203 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray2[local199][local203 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray4[local199 + 1][local203 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray3[local199 + 1][local203 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray2[local199 + 1][local203 + 1];
						@Pc(365) float local365 = this.aFloatArrayArray4[local199 + 1][local203];
						@Pc(374) float local374 = this.aFloatArrayArray3[local199 + 1][local203];
						@Pc(383) float local383 = this.aFloatArrayArray2[local199 + 1][local203];
						@Pc(391) int local391 = local22[local199][local203] & 0xFF;
						@Pc(401) int local401 = local22[local199][local203 + 1] & 0xFF;
						@Pc(413) int local413 = local22[local199 + 1][local203 + 1] & 0xFF;
						@Pc(423) int local423 = local22[local199 + 1][local203] & 0xFF;
						@Pc(425) int local425 = 0;
						@Pc(435) int local435;
						label357: for (@Pc(427) int local427 = 0; local427 < local247.length; local427++) {
							@Pc(433) Class6_Sub20 local433 = local219[local427];
							for (local435 = 0; local435 < local425; local435++) {
								if (local197[local435] == local433) {
									continue label357;
								}
							}
							local197[local425++] = local433;
						}
						@Pc(472) short[] local472 = this.aShortArrayArray7[super.anInt9640 * local203 + local199] = new short[local247.length];
						for (local435 = 0; local435 < local247.length; local435++) {
							@Pc(485) int local485 = (local199 << super.anInt9638) + local226[local435];
							@Pc(494) int local494 = (local203 << super.anInt9638) + local233[local435];
							@Pc(499) int local499 = local485 >> this.anInt4280;
							@Pc(504) int local504 = local494 >> this.anInt4280;
							@Pc(508) int local508 = local247[local435];
							@Pc(512) int local512 = local240[local435];
							@Pc(520) int local520 = local259 == null ? 0 : local259[local435];
							@Pc(538) long local538 = (long) local508 << 32 | (long) local512 << 48 | (long) (local499 << 16) | (long) local504;
							@Pc(542) int local542 = local226[local435];
							@Pc(546) int local546 = local233[local435];
							@Pc(548) byte local548 = 74;
							@Pc(550) int local550 = 0;
							@Pc(552) float local552 = 1.0F;
							@Pc(577) float local577;
							@Pc(575) float local575;
							@Pc(573) float local573;
							@Pc(660) float local660;
							@Pc(581) int local581;
							if (local542 == 0 && local546 == 0) {
								local577 = local282;
								local575 = local289;
								local581 = local548 - local391;
								local573 = local296;
							} else if (local542 == 0 && local546 == super.anInt9641) {
								local573 = local323;
								local575 = local314;
								local577 = local305;
								local581 = local548 - local401;
							} else if (super.anInt9641 == local542 && super.anInt9641 == local546) {
								local573 = local356;
								local581 = local548 - local413;
								local577 = local334;
								local575 = local345;
							} else if (super.anInt9641 == local542 && local546 == 0) {
								local577 = local365;
								local573 = local383;
								local575 = local374;
								local581 = local548 - local423;
							} else {
								@Pc(636) float local636 = (float) local542 / (float) super.anInt9641;
								@Pc(643) float local643 = (float) local546 / (float) super.anInt9641;
								@Pc(652) float local652 = (local365 - local282) * local636 + local282;
								local660 = local636 * (local374 - local289) + local289;
								@Pc(669) float local669 = local296 + local636 * (local383 - local296);
								@Pc(677) float local677 = local305 + (local334 - local305) * local636;
								@Pc(685) float local685 = local314 + local636 * (local345 - local314);
								local575 = local660 + (local685 - local660) * local643;
								local577 = (local677 - local652) * local643 + local652;
								@Pc(710) float local710 = local636 * (local356 - local323) + local323;
								local573 = (local710 - local669) * local643 + local669;
								@Pc(731) int local731 = local391 + ((local423 - local391) * local542 >> super.anInt9638);
								@Pc(743) int local743 = (local542 * (local413 - local401) >> super.anInt9638) + local401;
								local581 = local548 - (local546 * (local743 - local731) >> super.anInt9638) - local731;
							}
							if (local508 != -1) {
								@Pc(780) int local780 = (local508 & 0x7F) * local581 >> 7;
								if (local780 < 2) {
									local780 = 2;
								} else if (local780 > 126) {
									local780 = 126;
								}
								if ((this.anInt4288 & 0x7) == 0) {
									local552 = local573 * this.aClass14_Sub2_6.aFloatArray62[2] + local577 * this.aClass14_Sub2_6.aFloatArray62[0] + this.aClass14_Sub2_6.aFloatArray62[1] * local575;
									local552 = (local552 > 0.0F ? this.aClass14_Sub2_6.aFloat167 : this.aClass14_Sub2_6.aFloat178) * local552 + this.aClass14_Sub2_6.aFloat176;
								}
								local550 = Static171.anIntArray212[local780 | local508 & 0xFF80];
							}
							@Pc(853) Class6 local853 = null;
							if ((local485 & this.anInt4296 - 1) == 0 && (this.anInt4296 - 1 & local494) == 0) {
								local853 = local193.method3263(local538);
							}
							@Pc(889) int local889;
							@Pc(948) int local948;
							if (local853 == null) {
								if (local512 == local508) {
									local948 = local550;
								} else {
									@Pc(926) int local926 = (local512 & 0x7F) * local581 >> 7;
									if (local926 < 2) {
										local926 = 2;
									} else if (local926 > 126) {
										local926 = 126;
									}
									local948 = Static171.anIntArray212[local512 & 0xFF80 | local926];
									if ((this.anInt4288 & 0x7) == 0) {
										@Pc(979) float local979 = this.aClass14_Sub2_6.aFloatArray62[1] * local575 + local577 * this.aClass14_Sub2_6.aFloatArray62[0] + this.aClass14_Sub2_6.aFloatArray62[2] * local573;
										local660 = this.aClass14_Sub2_6.aFloat176 + (local552 > 0.0F ? this.aClass14_Sub2_6.aFloat167 : this.aClass14_Sub2_6.aFloat178) * local552;
										@Pc(1004) int local1004 = local948 >> 16 & 0xFF;
										@Pc(1010) int local1010 = local948 >> 8 & 0xFF;
										local1004 = (int) ((float) local1004 * local660);
										@Pc(1020) int local1020 = local948 & 0xFF;
										local1010 = (int) ((float) local1010 * local660);
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										local1020 = (int) ((float) local1020 * local660);
										if (local1020 < 0) {
											local1020 = 0;
										} else if (local1020 > 255) {
											local1020 = 255;
										}
										local948 = local1020 | local1010 << 8 | local1004 << 16;
									}
								}
								if (Stream.b()) {
									local167.a((float) local485);
									local167.a((float) (this.sa(local485, local494) + local520));
									local167.a((float) local494);
									local167.a((float) local485);
									local167.a((float) local494);
									if (this.anIntArrayArrayArray6 != null) {
										local167.a((float) (local275 == null ? 0 : local275[local435] - 1));
									}
									if ((this.anInt4288 & 0x7) != 0) {
										local167.a(local577);
										local167.a(local575);
										local167.a(local573);
									}
								} else {
									local167.b((float) local485);
									local167.b((float) (local520 + this.sa(local485, local494)));
									local167.b((float) local494);
									local167.b((float) local485);
									local167.b((float) local494);
									if (this.anIntArrayArrayArray6 != null) {
										local167.b((float) (local275 == null ? 0 : local275[local435] - 1));
									}
									if ((this.anInt4288 & 0x7) != 0) {
										local167.b(local577);
										local167.b(local575);
										local167.b(local573);
									}
								}
								if (this.aClass14_Sub2_6.anInt8602 == 0) {
									local172.d(local948 | 0xFF000000);
								} else {
									local172.f(local948 | 0xFF000000);
								}
								local889 = this.anInt4294++;
								local472[local435] = (short) local889;
								if (local508 != -1) {
									local176[local889] = local219[local435];
								}
								local193.method3267(new Class6_Sub36(local472[local435]), local538);
							} else {
								local472[local435] = ((Class6_Sub36) local853).aShort82;
								local889 = local472[local435] & 0xFFFF;
								if (local508 != -1 && local176[local889].aLong263 > local219[local435].aLong263) {
									local176[local889] = local219[local435];
								}
							}
							for (local948 = 0; local948 < local425; local948++) {
								local197[local948].method2826(local552, local581, local889, local550);
							}
							this.anInt4293++;
						}
					}
				}
			}
			for (local203 = 0; local203 < this.anInt4294; local203++) {
				@Pc(1297) Class6_Sub20 local1297 = local176[local203];
				if (local1297 != null) {
					local1297.method2825(local203);
				}
			}
			@Pc(1314) int local1314;
			@Pc(1332) int local1332;
			for (@Pc(1310) int local1310 = 0; local1310 < super.anInt9640; local1310++) {
				for (local1314 = 0; local1314 < super.anInt9639; local1314++) {
					@Pc(1326) short[] local1326 = this.aShortArrayArray7[local1310 + local1314 * super.anInt9640];
					if (local1326 != null) {
						@Pc(1330) int local1330 = 0;
						local1332 = 0;
						while (local1326.length > local1332) {
							@Pc(1341) int local1341 = local1326[local1332++] & 0xFFFF;
							@Pc(1348) int local1348 = local1326[local1332++] & 0xFFFF;
							@Pc(1355) int local1355 = local1326[local1332++] & 0xFFFF;
							@Pc(1359) Class6_Sub20 local1359 = local176[local1341];
							@Pc(1363) Class6_Sub20 local1363 = local176[local1348];
							@Pc(1367) Class6_Sub20 local1367 = local176[local1355];
							@Pc(1369) Class6_Sub20 local1369 = null;
							if (local1359 != null) {
								local1359.method2823(local1310, local1330, local1314);
								local1369 = local1359;
							}
							if (local1363 != null) {
								local1363.method2823(local1310, local1330, local1314);
								if (local1369 == null || local1363.aLong263 < local1369.aLong263) {
									local1369 = local1363;
								}
							}
							if (local1367 != null) {
								local1367.method2823(local1310, local1330, local1314);
								if (local1369 == null || local1367.aLong263 < local1369.aLong263) {
									local1369 = local1367;
								}
							}
							if (local1369 != null) {
								if (local1359 != null) {
									local1369.method2825(local1341);
								}
								if (local1363 != null) {
									local1369.method2825(local1348);
								}
								if (local1367 != null) {
									local1369.method2825(local1355);
								}
								local1369.method2823(local1310, local1330, local1314);
							}
							local1330++;
						}
					}
				}
			}
			local167.c();
			local172.c();
			this.anInterface13_9 = this.aClass14_Sub2_6.method7004(false);
			this.anInterface13_9.method1883(local152, 4, this.anInt4294 * 4);
			this.anInterface13_8 = this.aClass14_Sub2_6.method7004(false);
			this.anInterface13_8.method1883(local162, local132, this.anInt4294 * local132);
			if ((this.anInt4288 & 0x7) == 0) {
				if (this.anIntArrayArrayArray6 == null) {
					this.aClass28_13 = this.aClass14_Sub2_6.method7000(new Class231[] { new Class231(new Class210[] { Static321.aClass210_1, Static321.aClass210_5 }), new Class231(Static321.aClass210_3) });
				} else {
					this.aClass28_13 = this.aClass14_Sub2_6.method7000(new Class231[] { new Class231(new Class210[] { Static321.aClass210_1, Static321.aClass210_5, Static321.aClass210_4 }), new Class231(Static321.aClass210_3) });
				}
			} else if (this.anIntArrayArrayArray6 == null) {
				this.aClass28_13 = this.aClass14_Sub2_6.method7000(new Class231[] { new Class231(new Class210[] { Static321.aClass210_1, Static321.aClass210_5, Static321.aClass210_2 }), new Class231(Static321.aClass210_3) });
			} else {
				this.aClass28_13 = this.aClass14_Sub2_6.method7000(new Class231[] { new Class231(new Class210[] { Static321.aClass210_1, Static321.aClass210_5, Static321.aClass210_4, Static321.aClass210_2 }), new Class231(Static321.aClass210_3) });
			}
			local1314 = 0;
			for (@Pc(1672) int local1672 = 0; local1672 < local104.length; local1672++) {
				if (local104[local1672].anInt3203 > 0) {
					local104[local1314++] = local104[local1672];
				}
			}
			this.aClass6_Sub20Array1 = new Class6_Sub20[local1314];
			@Pc(1701) long[] local1701 = new long[local1314];
			for (local1332 = 0; local1332 < local1314; local1332++) {
				@Pc(1709) Class6_Sub20 local1709 = local104[local1332];
				local1701[local1332] = local1709.aLong263;
				this.aClass6_Sub20Array1[local1332] = local1709;
				local1709.method2819(this.anInt4294);
			}
			Static16.method368(local1701, this.aClass6_Sub20Array1);
			if (this.aClass229_1 != null) {
				this.aClass229_1.method5384();
			}
		}
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray8 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.aClass6_Sub20ArrayArrayArray1 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray7 = null;
		this.aClass128_20 = null;
		this.aByteArrayArray14 = null;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II[[ZIIZI)V")
	private void method3752(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4) {
		if (this.aClass6_Sub20Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg4 + arg4 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (Static103.anIntArray159.length < local14) {
			Static103.anIntArray159 = new int[local14];
		}
		@Pc(26) int local26 = arg0 - arg4;
		@Pc(28) int local28 = local26;
		if (local26 < 0) {
			local26 = 0;
		}
		@Pc(36) int local36 = arg2 - arg4;
		@Pc(38) int local38 = local36;
		if (local36 < 0) {
			local36 = 0;
		}
		@Pc(47) int local47 = arg0 + arg4;
		if (local47 > super.anInt9640 - 1) {
			local47 = super.anInt9640 - 1;
		}
		@Pc(66) int local66 = arg4 + arg2;
		Static401.anInt7021 = 0;
		if (local66 > super.anInt9639 - 1) {
			local66 = super.anInt9639 - 1;
		}
		for (@Pc(81) int local81 = local26; local81 <= local47; local81++) {
			@Pc(90) boolean[] local90 = arg1[local81 - local28];
			for (@Pc(92) int local92 = local36; local92 <= local66; local92++) {
				if (local90[local92 - local38]) {
					Static103.anIntArray159[Static401.anInt7021++] = local81 + local92 * super.anInt9640;
				}
			}
		}
		this.aClass14_Sub2_6.method7032();
		this.aClass14_Sub2_6.method6980();
		this.aClass14_Sub2_6.method6947((this.anInt4288 & 0x7) != 0);
		this.aClass14_Sub2_6.method6981(false, -1, false);
		this.aClass14_Sub2_6.method6994(0, this.anInterface13_8);
		for (@Pc(180) int local180 = 0; local180 < this.aClass6_Sub20Array1.length; local180++) {
			this.aClass6_Sub20Array1[local180].method2821(Static103.anIntArray159, Static401.anInt7021);
		}
		@Pc(201) Class54_Sub3 local201 = this.aClass14_Sub2_6.method7012();
		local201.GA(0, -1, 0);
		this.aClass14_Sub2_6.method7033();
		if (!this.aClass361_27.method7837()) {
			@Pc(219) int local219 = this.aClass14_Sub2_6.anInt8585;
			@Pc(223) int local223 = this.aClass14_Sub2_6.anInt8592;
			this.aClass14_Sub2_6.X(0, local223, this.aClass14_Sub2_6.anInt8590);
			this.aClass14_Sub2_6.method6947(false);
			this.aClass14_Sub2_6.method6906(false);
			this.aClass14_Sub2_6.method6998(128);
			this.aClass14_Sub2_6.method6981(false, -2, false);
			this.aClass14_Sub2_6.method7034(this.aClass14_Sub2_6.anInterface10_3);
			this.aClass14_Sub2_6.method6935(Static568.aClass228_14, Static41.aClass228_10);
			this.aClass14_Sub2_6.method6912(Static113.aClass138_2, 0);
			this.aClass14_Sub2_6.method6968(Static89.aClass138_1, 0);
			for (@Pc(283) Class6 local283 = this.aClass361_27.method7838(); local283 != null; local283 = this.aClass361_27.method7845()) {
				@Pc(288) Class6_Sub37 local288 = (Class6_Sub37) local283;
				local288.method5702(arg1, arg4, arg0, arg2);
			}
			this.aClass14_Sub2_6.method6912(Static185.aClass138_3, 0);
			this.aClass14_Sub2_6.method6968(Static185.aClass138_3, 0);
			this.aClass14_Sub2_6.method7034(null);
			this.aClass14_Sub2_6.X(local219, local223, this.aClass14_Sub2_6.anInt8590);
		}
		if (this.aClass229_1 != null) {
			this.aClass14_Sub2_6.method6994(0, this.anInterface13_8);
			this.aClass14_Sub2_6.method6994(1, this.anInterface13_9);
			this.aClass14_Sub2_6.method6944(this.aClass28_13);
			this.aClass229_1.method5381(arg1, arg4, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!iq", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray26[arg0][arg1];
	}

	@OriginalMember(owner = "client!iq", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass229_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass14_Sub2_6.anInt8589 * arg2 >> 8) >> this.aClass14_Sub2_6.anInt8591;
			@Pc(38) int local38 = arg3 - (this.aClass14_Sub2_6.anInt8580 * arg2 >> 8) >> this.aClass14_Sub2_6.anInt8591;
			this.aClass229_1.method5383(local23, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!iq", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt9640][super.anInt9639][];
		}
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt9640][super.anInt9639][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub20[] local88 = this.aClass6_Sub20ArrayArrayArray1[arg0][arg1] = new Class6_Sub20[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class6 local125;
			for (local125 = this.aClass128_20.method3263(local119); local125 != null; local125 = this.aClass128_20.method3264()) {
				@Pc(130) Class6_Sub20 local130 = (Class6_Sub20) local125;
				if (local130.anInt3196 == arg8[local90] && (float) arg9[local90] == local130.aFloat65 && arg10 == local130.anInt3191 && arg11 == local130.anInt3192 && arg12 == local130.anInt3204) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub20(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass128_20.method3267(local88[local90], local119);
			} else {
				local88[local90] = (Class6_Sub20) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray13[arg0][arg1] = (byte) (this.aByteArrayArray13[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt4303) {
			this.anInt4303 = arg6.length;
		}
		this.anInt4304 += arg6.length;
	}

	@OriginalMember(owner = "client!iq", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass229_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass14_Sub2_6.anInt8589 >> 8) >> this.aClass14_Sub2_6.anInt8591;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass14_Sub2_6.anInt8580 >> 8) >> this.aClass14_Sub2_6.anInt8591;
			this.aClass229_1.method5385(arg0, local24, local39);
		}
	}
}
