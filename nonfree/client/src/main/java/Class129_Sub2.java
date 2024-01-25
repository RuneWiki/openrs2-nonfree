import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class129_Sub2 extends Class129 {

	@OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
	private int anInt3943;

	@OriginalMember(owner = "client!ida", name = "z", descriptor = "I")
	private int anInt3951;

	@OriginalMember(owner = "client!ida", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ida", name = "Y", descriptor = "Lclient!vc;")
	private Interface23 anInterface23_8;

	@OriginalMember(owner = "client!ida", name = "bb", descriptor = "[Lclient!as;")
	private Class1_Sub7[] aClass1_Sub7Array1;

	@OriginalMember(owner = "client!ida", name = "eb", descriptor = "Lclient!vc;")
	private Interface23 anInterface23_9;

	@OriginalMember(owner = "client!ida", name = "fb", descriptor = "I")
	private int anInt3964;

	@OriginalMember(owner = "client!ida", name = "gb", descriptor = "I")
	private int anInt3965;

	@OriginalMember(owner = "client!ida", name = "hb", descriptor = "Lclient!si;")
	public Class185 aClass185_13;

	@OriginalMember(owner = "client!ida", name = "y", descriptor = "F")
	private float aFloat108 = -3.4028235E38F;

	@OriginalMember(owner = "client!ida", name = "v", descriptor = "F")
	private float aFloat107 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ida", name = "X", descriptor = "Lclient!gca;")
	private final Class111 aClass111_20 = new Class111();

	@OriginalMember(owner = "client!ida", name = "D", descriptor = "Lclient!nv;")
	public final Class78_Sub1 aClass78_Sub1_8;

	@OriginalMember(owner = "client!ida", name = "V", descriptor = "I")
	private final int anInt3963;

	@OriginalMember(owner = "client!ida", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ida", name = "t", descriptor = "I")
	private final int anInt3948;

	@OriginalMember(owner = "client!ida", name = "T", descriptor = "[[B")
	private final byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!ida", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ida", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ida", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!ida", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ida", name = "B", descriptor = "[[[Lclient!as;")
	private Class1_Sub7[][][] aClass1_Sub7ArrayArrayArray1;

	@OriginalMember(owner = "client!ida", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ida", name = "J", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ida", name = "K", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ida", name = "ab", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ida", name = "u", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!ida", name = "q", descriptor = "I")
	public final int anInt3945;

	@OriginalMember(owner = "client!ida", name = "db", descriptor = "Lclient!faa;")
	private Class91 aClass91_13;

	@OriginalMember(owner = "client!ida", name = "W", descriptor = "Lclient!g;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!nv;IIII[[I[[II)V")
	public Class129_Sub2(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass78_Sub1_8 = arg0;
		this.anInt3963 = super.anInt8066 - 2;
		this.aFloatArrayArray7 = new float[super.anInt8065 + 1][super.anInt8058 + 1];
		this.anInt3948 = 0x1 << this.anInt3963;
		this.aByteArrayArray8 = new byte[arg3][arg4];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt8065 + 1][super.anInt8058 + 1];
		this.aFloatArrayArray5 = new float[super.anInt8065 + 1][super.anInt8058 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aClass1_Sub7ArrayArrayArray1 = new Class1_Sub7[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aByteArrayArray9 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray4 = new short[arg3 * arg4][];
		this.anInt3945 = arg2;
		for (@Pc(121) int local121 = 0; super.anInt8058 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt8065; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray49[local125][local121];
				if (this.aFloat107 > (float) local134) {
					this.aFloat107 = local134;
				}
				if ((float) local134 > this.aFloat108) {
					this.aFloat108 = local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt8065 && super.anInt8058 > local121) {
					@Pc(191) int local191 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(207) int local207 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(226) float local226 = (float) (1.0D / Math.sqrt((double) (local207 * local207 + local191 * local191 + arg7 * arg7 * 4)));
					this.aFloatArrayArray7[local125][local121] = (float) local191 * local226;
					this.aFloatArrayArray6[local125][local121] = (float) (-arg7 * 2) * local226;
					this.aFloatArrayArray5[local125][local121] = local226 * (float) local207;
				}
			}
		}
		this.aFloat107--;
		this.aFloat108++;
		this.aClass91_13 = new Class91(128);
		if ((this.anInt3945 & 0x10) != 0) {
			this.aClass110_1 = new Class110(this.aClass78_Sub1_8, this);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6476(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3964 <= 0) {
			return;
		}
		@Pc(19) Interface13 local19 = this.aClass78_Sub1_8.method6974(this.anInt3951);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method5603();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass78_Sub1_8.method6925(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(77) short[] local77;
				@Pc(81) int local81;
				@Pc(89) int local89;
				if (Stream.b()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt8065;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray4[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										local21++;
										if (local89 > local25) {
											local25 = local89;
										}
										if (local23 > local89) {
											local23 = local89;
										}
										local44.b(local89);
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = local48 * super.anInt8065 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray4[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										if (local25 < local89) {
											local25 = local89;
										}
										local44.c(local89);
										if (local89 < local23) {
											local23 = local89;
										}
										local21++;
									}
								}
							}
							local57++;
						}
					}
				}
				local44.a();
				if (local19.method5602()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass78_Sub1_8.method6911();
		this.aClass78_Sub1_8.method6978(false);
		this.aClass78_Sub1_8.method6949(false);
		this.aClass78_Sub1_8.method6944(false);
		this.aClass78_Sub1_8.method6953(false);
		this.aClass78_Sub1_8.method6913(0);
		this.aClass78_Sub1_8.method6948(false, false, -2);
		this.aClass78_Sub1_8.method6931(null);
		@Pc(274) Class34_Sub1 local274 = this.aClass78_Sub1_8.method6904();
		@Pc(279) float[] local279 = this.aClass78_Sub1_8.method6946();
		local279[4] = 0.0F;
		local279[7] = 0.0F;
		local279[5] = (float) 1024 / ((float) this.aClass78_Sub1_8.anInt8451 * 128.0F * (float) super.anInt8060);
		local279[11] = 0.0F;
		local279[2] = 0.0F;
		local279[10] = 1.0F / (this.aFloat108 - this.aFloat107);
		local279[15] = 1.0F;
		local279[6] = 0.0F;
		local279[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass78_Sub1_8.anInt8491;
		local279[8] = 0.0F;
		local279[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass78_Sub1_8.anInt8451;
		local279[9] = 0.0F;
		local279[14] = -this.aFloat107 / (this.aFloat108 - this.aFloat107);
		local279[3] = 0.0F;
		local279[0] = (float) 1024 / ((float) this.aClass78_Sub1_8.anInt8491 * (float) super.anInt8060 * 128.0F);
		local279[1] = 0.0F;
		local274.method905(0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.aClass78_Sub1_8.method6937();
		this.aClass78_Sub1_8.method6895();
		if ((this.anInt3945 & 0x7) == 0) {
			this.aClass78_Sub1_8.method6949(false);
		} else {
			this.aClass78_Sub1_8.method6949(true);
			this.aClass78_Sub1_8.method6955();
		}
		this.aClass78_Sub1_8.method6940(false);
		this.aClass78_Sub1_8.method6965(this.anInterface23_8, 0);
		this.aClass78_Sub1_8.method6965(this.anInterface23_9, 1);
		this.aClass78_Sub1_8.method6941(this.aClass185_13);
		this.aClass78_Sub1_8.method6947(Static302.aClass77_5, local25 + 1 - local23, local23, local21 / 3, 0, local19);
		this.aClass78_Sub1_8.method6940(true);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)V")
	@Override
	public void method6475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ida", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass110_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass78_Sub1_8.anInt8574 >> 8) >> this.aClass78_Sub1_8.anInt8562;
			@Pc(39) int local39 = arg3 - (this.aClass78_Sub1_8.anInt8579 * arg2 >> 8) >> this.aClass78_Sub1_8.anInt8562;
			this.aClass110_1.method2496(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!tw;[I)V")
	@Override
	public void method6482(@OriginalArg(0) Class1_Sub24 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass111_20.method2552(new Class1_Sub35(this.aClass78_Sub1_8, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.O(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3236(arg4, arg2, arg3, -1, arg1, arg0);
	}

	@OriginalMember(owner = "client!ida", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt8065][super.anInt8058][];
		}
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt8065][super.anInt8058][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub7[] local88 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1] = new Class1_Sub7[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class1 local125;
			for (local125 = this.aClass91_13.method2271(local119); local125 != null; local125 = this.aClass91_13.method2277()) {
				@Pc(130) Class1_Sub7 local130 = (Class1_Sub7) local125;
				if (arg8[local90] == local130.anInt565 && (float) arg9[local90] == local130.aFloat3 && local130.anInt570 == arg10 && local130.anInt561 == arg11 && local130.anInt566 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub7(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass91_13.method2269(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub7) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray8[arg0][arg1] = (byte) (this.aByteArrayArray8[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt3965) {
			this.anInt3965 = arg6.length;
		}
		this.anInt3964 += arg6.length;
	}

	@OriginalMember(owner = "client!ida", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass110_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass78_Sub1_8.anInt8574 >> 8) >> this.aClass78_Sub1_8.anInt8562;
			@Pc(38) int local38 = arg3 - (this.aClass78_Sub1_8.anInt8579 * arg2 >> 8) >> this.aClass78_Sub1_8.anInt8562;
			this.aClass110_1.method2493(arg0, local23, local38);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BILclient!wb;I)V")
	private void method3235(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int[] local20 = this.anIntArrayArrayArray10[arg2][arg0];
		@Pc(27) int[] local27 = this.anIntArrayArrayArray7[arg2][arg0];
		@Pc(30) int local30 = local20.length;
		if (local30 > Static101.anIntArray78.length) {
			Static542.anIntArray572 = new int[local30];
			Static101.anIntArray78 = new int[local30];
		}
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			Static101.anIntArray78[local42] = local20[local42] >> this.aClass78_Sub1_8.anInt8562;
			Static542.anIntArray572[local42] = local27[local42] >> this.aClass78_Sub1_8.anInt8562;
		}
		@Pc(70) int local70 = 0;
		while (local70 < local30) {
			@Pc(76) int local76 = Static101.anIntArray78[local70];
			@Pc(81) int local81 = Static542.anIntArray572[local70++];
			@Pc(85) int local85 = Static101.anIntArray78[local70];
			@Pc(90) int local90 = Static542.anIntArray572[local70++];
			@Pc(94) int local94 = Static101.anIntArray78[local70];
			@Pc(99) int local99 = Static542.anIntArray572[local70++];
			if ((local90 - local99) * (local76 - local85) - (local94 - local85) * (local90 + -local81) > 0) {
				arg1.method7720(local99, local90, local85, local94, local81, local76);
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method3236(arg4, arg2, arg3, arg5, arg1, arg0);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray9[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray9[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6474(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass110_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass78_Sub1_8.anInt8574 >> 8) >> this.aClass78_Sub1_8.anInt8562;
			@Pc(40) int local40 = arg3 - (this.aClass78_Sub1_8.anInt8579 * arg2 >> 8) >> this.aClass78_Sub1_8.anInt8562;
			return this.aClass110_1.method2497(arg0, local40, local25);
		}
	}

	@OriginalMember(owner = "client!ida", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt3964 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt8065 + 1][super.anInt8058 + 1];
			for (@Pc(23) int local23 = 1; super.anInt8065 > local23; local23++) {
				for (@Pc(27) int local27 = 1; local27 < super.anInt8058; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray9[local23][local27] >> 1) + (this.aByteArrayArray9[local23][local27 - 1] >> 2) + (this.aByteArrayArray9[local23 + 1][local27] >> 3) + (this.aByteArrayArray9[local23 + -1][local27] >> 2) + (this.aByteArrayArray9[local23][local27 + 1] >> 3));
				}
			}
			@Pc(107) Class1_Sub7[] local107 = new Class1_Sub7[this.aClass91_13.method2273()];
			this.aClass91_13.method2272(local107);
			for (@Pc(115) int local115 = 0; local115 < local107.length; local115++) {
				local107[local115].method483(this.anInt3964);
			}
			@Pc(135) int local135 = 20;
			if (this.anIntArrayArrayArray9 != null) {
				local135 += 4;
			}
			if ((this.anInt3945 & 0x7) != 0) {
				local135 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass78_Sub1_8.aNativeHeap6.a(this.anInt3964 * 4, false);
			@Pc(165) NativeHeapBuffer local165 = this.aClass78_Sub1_8.aNativeHeap6.a(this.anInt3964 * local135, false);
			@Pc(170) Stream local170 = new Stream(local165);
			@Pc(175) Stream local175 = new Stream(local155);
			@Pc(179) Class1_Sub7[] local179 = new Class1_Sub7[this.anInt3964];
			@Pc(186) int local186 = Static505.method7085(this.anInt3964 / 4);
			if (local186 < 1) {
				local186 = 1;
			}
			@Pc(198) Class91 local198 = new Class91(local186);
			@Pc(202) Class1_Sub7[] local202 = new Class1_Sub7[this.anInt3965];
			@Pc(208) int local208;
			for (@Pc(204) int local204 = 0; super.anInt8065 > local204; local204++) {
				for (local208 = 0; local208 < super.anInt8058; local208++) {
					if (this.anIntArrayArrayArray12[local204][local208] != null) {
						@Pc(224) Class1_Sub7[] local224 = this.aClass1_Sub7ArrayArrayArray1[local204][local208];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray10[local204][local208];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray7[local204][local208];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray8[local204][local208];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray12[local204][local208];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local204][local208];
						if (local245 == null) {
							local245 = local252;
						}
						@Pc(280) int[] local280 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local204][local208];
						@Pc(287) float local287 = this.aFloatArrayArray7[local204][local208];
						@Pc(294) float local294 = this.aFloatArrayArray6[local204][local208];
						@Pc(301) float local301 = this.aFloatArrayArray5[local204][local208];
						@Pc(310) float local310 = this.aFloatArrayArray7[local204][local208 + 1];
						@Pc(319) float local319 = this.aFloatArrayArray6[local204][local208 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray5[local204][local208 + 1];
						@Pc(339) float local339 = this.aFloatArrayArray7[local204 + 1][local208 + 1];
						@Pc(350) float local350 = this.aFloatArrayArray6[local204 + 1][local208 + 1];
						@Pc(361) float local361 = this.aFloatArrayArray5[local204 + 1][local208 + 1];
						@Pc(370) float local370 = this.aFloatArrayArray7[local204 + 1][local208];
						@Pc(379) float local379 = this.aFloatArrayArray6[local204 + 1][local208];
						@Pc(388) float local388 = this.aFloatArrayArray5[local204 + 1][local208];
						@Pc(396) int local396 = local21[local204][local208] & 0xFF;
						@Pc(406) int local406 = local21[local204][local208 + 1] & 0xFF;
						@Pc(418) int local418 = local21[local204 + 1][local208 + 1] & 0xFF;
						@Pc(428) int local428 = local21[local204 + 1][local208] & 0xFF;
						@Pc(430) int local430 = 0;
						@Pc(440) int local440;
						label357: for (@Pc(432) int local432 = 0; local432 < local252.length; local432++) {
							@Pc(438) Class1_Sub7 local438 = local224[local432];
							for (local440 = 0; local440 < local430; local440++) {
								if (local438 == local202[local440]) {
									continue label357;
								}
							}
							local202[local430++] = local438;
						}
						@Pc(485) short[] local485 = this.aShortArrayArray4[local208 * super.anInt8065 + local204] = new short[local252.length];
						for (local440 = 0; local440 < local252.length; local440++) {
							@Pc(499) int local499 = (local204 << super.anInt8066) + local231[local440];
							@Pc(509) int local509 = (local208 << super.anInt8066) + local238[local440];
							@Pc(514) int local514 = local499 >> this.anInt3963;
							@Pc(519) int local519 = local509 >> this.anInt3963;
							@Pc(523) int local523 = local252[local440];
							@Pc(527) int local527 = local245[local440];
							@Pc(535) int local535 = local264 == null ? 0 : local264[local440];
							@Pc(553) long local553 = (long) local519 | (long) local523 << 32 | (long) local527 << 48 | (long) (local514 << 16);
							@Pc(557) int local557 = local231[local440];
							@Pc(561) int local561 = local238[local440];
							@Pc(563) byte local563 = 74;
							@Pc(565) int local565 = 0;
							@Pc(567) float local567 = 1.0F;
							@Pc(605) float local605;
							@Pc(601) float local601;
							@Pc(603) float local603;
							@Pc(655) float local655;
							@Pc(609) int local609;
							if (local557 == 0 && local561 == 0) {
								local601 = local294;
								local609 = local563 - local396;
								local605 = local287;
								local603 = local301;
							} else if (local557 == 0 && local561 == super.anInt8060) {
								local605 = local310;
								local609 = local563 - local406;
								local603 = local328;
								local601 = local319;
							} else if (local557 == super.anInt8060 && local561 == super.anInt8060) {
								local601 = local350;
								local603 = local361;
								local605 = local339;
								local609 = local563 - local418;
							} else if (local557 == super.anInt8060 && local561 == 0) {
								local609 = local563 - local428;
								local603 = local388;
								local605 = local370;
								local601 = local379;
							} else {
								@Pc(631) float local631 = (float) local557 / (float) super.anInt8060;
								@Pc(638) float local638 = (float) local561 / (float) super.anInt8060;
								@Pc(647) float local647 = local287 + local631 * (local370 - local287);
								local655 = local294 + (local379 - local294) * local631;
								@Pc(663) float local663 = local631 * (local388 - local301) + local301;
								@Pc(671) float local671 = local631 * (local339 - local310) + local310;
								@Pc(679) float local679 = local319 + (local350 - local319) * local631;
								local601 = (local679 - local655) * local638 + local655;
								local605 = (local671 - local647) * local638 + local647;
								@Pc(703) float local703 = local328 + local631 * (local361 - local328);
								local603 = (local703 - local663) * local638 + local663;
								@Pc(723) int local723 = (local557 * (local428 - local396) >> super.anInt8066) + local396;
								@Pc(735) int local735 = ((local418 - local406) * local557 >> super.anInt8066) + local406;
								local609 = local563 - ((local735 - local723) * local561 >> super.anInt8066) - local723;
							}
							if (local523 != -1) {
								@Pc(797) int local797 = local609 * (local523 & 0x7F) >> 7;
								if (local797 < 2) {
									local797 = 2;
								} else if (local797 > 126) {
									local797 = 126;
								}
								if ((this.anInt3945 & 0x7) == 0) {
									local567 = this.aClass78_Sub1_8.aFloatArray72[2] * local603 + local601 * this.aClass78_Sub1_8.aFloatArray72[1] + local605 * this.aClass78_Sub1_8.aFloatArray72[0];
									local567 = local567 * (local567 > 0.0F ? this.aClass78_Sub1_8.aFloat219 : this.aClass78_Sub1_8.aFloat225) + this.aClass78_Sub1_8.aFloat213;
								}
								local565 = Static226.anIntArray212[local523 & 0xFF80 | local797];
							}
							@Pc(871) Class1 local871 = null;
							if ((this.anInt3948 - 1 & local499) == 0 && (this.anInt3948 - 1 & local509) == 0) {
								local871 = local198.method2271(local553);
							}
							@Pc(910) int local910;
							@Pc(940) int local940;
							if (local871 == null) {
								if (local523 == local527) {
									local940 = local565;
								} else {
									@Pc(950) int local950 = local609 * (local527 & 0x7F) >> 7;
									if (local950 < 2) {
										local950 = 2;
									} else if (local950 > 126) {
										local950 = 126;
									}
									local940 = Static226.anIntArray212[local527 & 0xFF80 | local950];
									if ((this.anInt3945 & 0x7) == 0) {
										local655 = this.aClass78_Sub1_8.aFloatArray72[1] * local601 + this.aClass78_Sub1_8.aFloatArray72[0] * local605 + local603 * this.aClass78_Sub1_8.aFloatArray72[2];
										local655 = this.aClass78_Sub1_8.aFloat213 + local567 * (local567 > 0.0F ? this.aClass78_Sub1_8.aFloat219 : this.aClass78_Sub1_8.aFloat225);
										@Pc(1028) int local1028 = local940 >> 16 & 0xFF;
										@Pc(1034) int local1034 = local940 >> 8 & 0xFF;
										@Pc(1038) int local1038 = local940 & 0xFF;
										local1028 = (int) ((float) local1028 * local655);
										if (local1028 < 0) {
											local1028 = 0;
										} else if (local1028 > 255) {
											local1028 = 255;
										}
										local1034 = (int) ((float) local1034 * local655);
										if (local1034 < 0) {
											local1034 = 0;
										} else if (local1034 > 255) {
											local1034 = 255;
										}
										local1038 = (int) ((float) local1038 * local655);
										if (local1038 < 0) {
											local1038 = 0;
										} else if (local1038 > 255) {
											local1038 = 255;
										}
										local940 = local1034 << 8 | local1028 << 16 | local1038;
									}
								}
								if (Stream.b()) {
									local170.b((float) local499);
									local170.b((float) (this.method6480(local509, local499) + local535));
									local170.b((float) local509);
									local170.b((float) local499);
									local170.b((float) local509);
									if (this.anIntArrayArrayArray9 != null) {
										local170.b((float) (local280 == null ? 0 : local280[local440] - 1));
									}
									if ((this.anInt3945 & 0x7) != 0) {
										local170.b(local605);
										local170.b(local601);
										local170.b(local603);
									}
								} else {
									local170.a((float) local499);
									local170.a((float) (local535 + this.method6480(local509, local499)));
									local170.a((float) local509);
									local170.a((float) local499);
									local170.a((float) local509);
									if (this.anIntArrayArrayArray9 != null) {
										local170.a((float) (local280 == null ? 0 : local280[local440] - 1));
									}
									if ((this.anInt3945 & 0x7) != 0) {
										local170.a(local605);
										local170.a(local601);
										local170.a(local603);
									}
								}
								if (this.aClass78_Sub1_8.anInt8568 == 0) {
									local175.a(local940 | 0xFF000000);
								} else {
									local175.f(local940 | 0xFF000000);
								}
								local910 = this.anInt3943++;
								local485[local440] = (short) local910;
								if (local523 != -1) {
									local179[local910] = local224[local440];
								}
								local198.method2269(local553, new Class1_Sub47(local485[local440]));
							} else {
								local485[local440] = ((Class1_Sub47) local871).aShort114;
								local910 = local485[local440] & 0xFFFF;
								if (local523 != -1 && local179[local910].aLong268 > local224[local440].aLong268) {
									local179[local910] = local224[local440];
								}
							}
							for (local940 = 0; local940 < local430; local940++) {
								local202[local940].method485(local609, local567, local565, local910);
							}
							this.anInt3951++;
						}
					}
				}
			}
			for (local208 = 0; local208 < this.anInt3943; local208++) {
				@Pc(1322) Class1_Sub7 local1322 = local179[local208];
				if (local1322 != null) {
					local1322.method487(local208);
				}
			}
			@Pc(1339) int local1339;
			@Pc(1358) int local1358;
			for (@Pc(1335) int local1335 = 0; local1335 < super.anInt8065; local1335++) {
				for (local1339 = 0; super.anInt8058 > local1339; local1339++) {
					@Pc(1352) short[] local1352 = this.aShortArrayArray4[local1339 * super.anInt8065 + local1335];
					if (local1352 != null) {
						@Pc(1356) int local1356 = 0;
						local1358 = 0;
						while (local1358 < local1352.length) {
							@Pc(1367) int local1367 = local1352[local1358++] & 0xFFFF;
							@Pc(1374) int local1374 = local1352[local1358++] & 0xFFFF;
							@Pc(1381) int local1381 = local1352[local1358++] & 0xFFFF;
							@Pc(1385) Class1_Sub7 local1385 = local179[local1367];
							@Pc(1389) Class1_Sub7 local1389 = local179[local1374];
							@Pc(1393) Class1_Sub7 local1393 = local179[local1381];
							@Pc(1395) Class1_Sub7 local1395 = null;
							if (local1385 != null) {
								local1385.method482(local1339, local1335, local1356);
								local1395 = local1385;
							}
							if (local1389 != null) {
								local1389.method482(local1339, local1335, local1356);
								if (local1395 == null || local1389.aLong268 < local1395.aLong268) {
									local1395 = local1389;
								}
							}
							if (local1393 != null) {
								local1393.method482(local1339, local1335, local1356);
								if (local1395 == null || local1393.aLong268 < local1395.aLong268) {
									local1395 = local1393;
								}
							}
							if (local1395 != null) {
								if (local1385 != null) {
									local1395.method487(local1367);
								}
								if (local1389 != null) {
									local1395.method487(local1374);
								}
								if (local1393 != null) {
									local1395.method487(local1381);
								}
								local1395.method482(local1339, local1335, local1356);
							}
							local1356++;
						}
					}
				}
			}
			local170.a();
			local175.a();
			this.anInterface23_9 = this.aClass78_Sub1_8.method6927(false);
			this.anInterface23_9.method5571(local155, 4, this.anInt3943 * 4);
			this.anInterface23_8 = this.aClass78_Sub1_8.method6927(false);
			this.anInterface23_8.method5571(local165, local135, this.anInt3943 * local135);
			if ((this.anInt3945 & 0x7) == 0) {
				if (this.anIntArrayArrayArray9 == null) {
					this.aClass185_13 = this.aClass78_Sub1_8.method6938(new Class318[] { new Class318(new Class174[] { Static246.aClass174_1, Static246.aClass174_5 }), new Class318(Static246.aClass174_3) });
				} else {
					this.aClass185_13 = this.aClass78_Sub1_8.method6938(new Class318[] { new Class318(new Class174[] { Static246.aClass174_1, Static246.aClass174_5, Static246.aClass174_4 }), new Class318(Static246.aClass174_3) });
				}
			} else if (this.anIntArrayArrayArray9 == null) {
				this.aClass185_13 = this.aClass78_Sub1_8.method6938(new Class318[] { new Class318(new Class174[] { Static246.aClass174_1, Static246.aClass174_5, Static246.aClass174_2 }), new Class318(Static246.aClass174_3) });
			} else {
				this.aClass185_13 = this.aClass78_Sub1_8.method6938(new Class318[] { new Class318(new Class174[] { Static246.aClass174_1, Static246.aClass174_5, Static246.aClass174_4, Static246.aClass174_2 }), new Class318(Static246.aClass174_3) });
			}
			local1339 = 0;
			for (@Pc(1702) int local1702 = 0; local1702 < local107.length; local1702++) {
				if (local107[local1702].anInt563 > 0) {
					local107[local1339++] = local107[local1702];
				}
			}
			this.aClass1_Sub7Array1 = new Class1_Sub7[local1339];
			@Pc(1732) long[] local1732 = new long[local1339];
			for (local1358 = 0; local1358 < local1339; local1358++) {
				@Pc(1740) Class1_Sub7 local1740 = local107[local1358];
				local1732[local1358] = local1740.aLong268;
				this.aClass1_Sub7Array1[local1358] = local1740;
				local1740.method488(this.anInt3943);
			}
			Static222.method3326(this.aClass1_Sub7Array1, local1732);
			if (this.aClass110_1 != null) {
				this.aClass110_1.method2499();
			}
		} else {
			this.aClass110_1 = null;
		}
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray9 = null;
		this.aByteArrayArray9 = null;
		this.aClass91_13 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray6 = this.aFloatArrayArray5 = null;
		this.aClass1_Sub7ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZBI[[ZIII)V")
	private void method3236(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass1_Sub7Array1 == null) {
			return;
		}
		@Pc(21) int local21 = arg1 + arg1 + 1;
		@Pc(25) int local25 = local21 * local21;
		if (Static568.anIntArray549.length < local25) {
			Static568.anIntArray549 = new int[local25];
		}
		@Pc(37) int local37 = arg5 - arg1;
		@Pc(39) int local39 = local37;
		if (local37 < 0) {
			local37 = 0;
		}
		@Pc(48) int local48 = arg4 - arg1;
		@Pc(50) int local50 = local48;
		if (local48 < 0) {
			local48 = 0;
		}
		@Pc(59) int local59 = arg5 + arg1;
		if (super.anInt8065 - 1 < local59) {
			local59 = super.anInt8065 - 1;
		}
		@Pc(74) int local74 = arg1 + arg4;
		if (local74 > super.anInt8058 - 1) {
			local74 = super.anInt8058 - 1;
		}
		Static386.anInt6912 = 0;
		for (@Pc(89) int local89 = local37; local89 <= local59; local89++) {
			@Pc(97) boolean[] local97 = arg2[local89 - local39];
			for (@Pc(99) int local99 = local48; local99 <= local74; local99++) {
				if (local97[local99 - local50]) {
					Static568.anIntArray549[Static386.anInt6912++] = local89 + super.anInt8065 * local99;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass78_Sub1_8.method6939();
		} else {
			this.aClass78_Sub1_8.method6976((float) arg3);
			this.aClass78_Sub1_8.method6969();
		}
		this.aClass78_Sub1_8.method6957();
		this.aClass78_Sub1_8.method6949((this.anInt3945 & 0x7) != 0);
		this.aClass78_Sub1_8.method6948(false, false, -1);
		this.aClass78_Sub1_8.method6965(this.anInterface23_8, 0);
		for (@Pc(186) int local186 = 0; local186 < this.aClass1_Sub7Array1.length; local186++) {
			this.aClass1_Sub7Array1[local186].method484(Static568.anIntArray549, Static386.anInt6912);
		}
		@Pc(207) Class34_Sub1 local207 = this.aClass78_Sub1_8.method6904();
		local207.NA(0, -1, 0);
		this.aClass78_Sub1_8.method6895();
		if (!this.aClass111_20.method2546()) {
			@Pc(227) int local227 = this.aClass78_Sub1_8.anInt8566;
			@Pc(231) int local231 = this.aClass78_Sub1_8.anInt8565;
			this.aClass78_Sub1_8.pa(0, local231, this.aClass78_Sub1_8.anInt8585);
			this.aClass78_Sub1_8.method6949(false);
			this.aClass78_Sub1_8.method6953(false);
			this.aClass78_Sub1_8.method6913(128);
			this.aClass78_Sub1_8.method6948(false, false, -2);
			this.aClass78_Sub1_8.method6931(this.aClass78_Sub1_8.anInterface20_3);
			this.aClass78_Sub1_8.method6864(Static31.aClass118_1, Static569.aClass118_4);
			this.aClass78_Sub1_8.method6975(Static276.aClass148_4, 0);
			this.aClass78_Sub1_8.method6903(0, Static155.aClass148_2);
			for (@Pc(293) Class1 local293 = this.aClass111_20.method2547(); local293 != null; local293 = this.aClass111_20.method2554()) {
				@Pc(298) Class1_Sub35 local298 = (Class1_Sub35) local293;
				local298.method5010(arg5, arg4, arg1, arg2);
			}
			this.aClass78_Sub1_8.method6975(Static47.aClass148_1, 0);
			this.aClass78_Sub1_8.method6903(0, Static47.aClass148_1);
			this.aClass78_Sub1_8.method6931(null);
			this.aClass78_Sub1_8.pa(local227, local231, this.aClass78_Sub1_8.anInt8585);
		}
		if (this.aClass110_1 == null) {
			return;
		}
		this.aClass78_Sub1_8.method6965(this.anInterface23_8, 0);
		this.aClass78_Sub1_8.method6965(this.anInterface23_9, 1);
		this.aClass78_Sub1_8.method6941(this.aClass185_13);
		this.aClass110_1.method2500(arg5, arg1, arg4, arg0, arg2);
		return;
	}

	@OriginalMember(owner = "client!ida", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub8_Sub4 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub8_Sub4 arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8060 >> this.aClass78_Sub1_8.anInt8562;
		@Pc(24) Class1_Sub8_Sub4_Sub2 local24 = (Class1_Sub8_Sub4_Sub2) arg2;
		@Pc(34) Class1_Sub8_Sub4_Sub2 local34;
		if (local24 != null && local24.method7718(local21, local21)) {
			local34 = local24;
			local24.method7723();
		} else {
			local34 = new Class1_Sub8_Sub4_Sub2(this.aClass78_Sub1_8, local21, local21);
		}
		local34.method7717(0, local21, local21, 0);
		this.method3235(arg1, local34, arg0);
		return local34;
	}
}
