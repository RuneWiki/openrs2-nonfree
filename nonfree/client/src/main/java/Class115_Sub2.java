import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class115_Sub2 extends Class115 {

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	private int anInt9261;

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
	private int anInt9270;

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
	private int anInt9281;

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "Lclient!wf;")
	private Interface24 anInterface24_11;

	@OriginalMember(owner = "client!sq", name = "Z", descriptor = "I")
	private int anInt9282;

	@OriginalMember(owner = "client!sq", name = "bb", descriptor = "[Lclient!sv;")
	private Class4_Sub47[] aClass4_Sub47Array1;

	@OriginalMember(owner = "client!sq", name = "eb", descriptor = "Lclient!wf;")
	private Interface24 anInterface24_12;

	@OriginalMember(owner = "client!sq", name = "hb", descriptor = "Lclient!dt;")
	public Class82 aClass82_20;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "F")
	private float aFloat194 = -3.4028235E38F;

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "F")
	private float aFloat193 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "Lclient!au;")
	private final Class22 aClass22_61 = new Class22();

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!nh;")
	public final Class7_Sub1 aClass7_Sub1_16;

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
	private final int anInt9275;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "[[S")
	public final short[][] aShortArrayArray18;

	@OriginalMember(owner = "client!sq", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!sq", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "[[B")
	private final byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!sq", name = "S", descriptor = "[[[Lclient!sv;")
	private Class4_Sub47[][][] aClass4_Sub47ArrayArrayArray1;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!sq", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
	private final int anInt9277;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
	public final int anInt9264;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!sq", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray22;

	@OriginalMember(owner = "client!sq", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!sq", name = "Y", descriptor = "Lclient!mo;")
	private Class221 aClass221_34;

	@OriginalMember(owner = "client!sq", name = "V", descriptor = "Lclient!vg;")
	private Class343 aClass343_1;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!nh;IIII[[I[[II)V")
	public Class115_Sub2(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass7_Sub1_16 = arg0;
		this.anInt9275 = super.anInt10331 - 2;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aShortArrayArray18 = new short[arg3 * arg4][];
		this.aFloatArrayArray14 = new float[super.anInt10330 + 1][super.anInt10327 + 1];
		this.aFloatArrayArray12 = new float[super.anInt10330 + 1][super.anInt10327 + 1];
		this.aByteArrayArray27 = new byte[arg3][arg4];
		this.aClass4_Sub47ArrayArrayArray1 = new Class4_Sub47[arg3][arg4][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.aFloatArrayArray13 = new float[super.anInt10330 + 1][super.anInt10327 + 1];
		this.anInt9277 = 0x1 << this.anInt9275;
		this.anInt9264 = arg2;
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anIntArrayArrayArray22 = new int[arg3][arg4][];
		this.aByteArrayArray28 = new byte[arg3 + 1][arg4 + 1];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt10327; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt10330 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray61[local125][local121];
				if (this.aFloat193 > (float) local134) {
					this.aFloat193 = local134;
				}
				if ((float) local134 > this.aFloat194) {
					this.aFloat194 = local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt10330 && local121 < super.anInt10327) {
					@Pc(186) int local186 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(202) int local202 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(222) float local222 = (float) (1.0D / Math.sqrt((double) (local202 * local202 + local186 * local186 + arg7 * 4 * arg7)));
					this.aFloatArrayArray13[local125][local121] = local222 * (float) local186;
					this.aFloatArrayArray14[local125][local121] = (float) (-arg7 * 2) * local222;
					this.aFloatArrayArray12[local125][local121] = local222 * (float) local202;
				}
			}
		}
		this.aFloat193--;
		this.aFloat194++;
		this.aClass221_34 = new Class221(128);
		if ((this.anInt9264 & 0x10) != 0) {
			this.aClass343_1 = new Class343(this.aClass7_Sub1_16, this);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7116(arg3, arg2, arg4, arg0, arg1, arg5);
	}

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass343_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass7_Sub1_16.anInt7353 * arg2 >> 8) >> this.aClass7_Sub1_16.anInt7364;
			@Pc(38) int local38 = arg3 - (this.aClass7_Sub1_16.anInt7363 * arg2 >> 8) >> this.aClass7_Sub1_16.anInt7364;
			this.aClass343_1.method7886(local38, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!sq", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray21 == null) {
			this.anIntArrayArrayArray21 = new int[super.anInt10330][super.anInt10327][];
		}
		if (arg3 != null && this.anIntArrayArrayArray22 == null) {
			this.anIntArrayArrayArray22 = new int[super.anInt10330][super.anInt10327][];
		}
		this.anIntArrayArrayArray19[arg0][arg1] = arg2;
		this.anIntArrayArrayArray18[arg0][arg1] = arg4;
		this.anIntArrayArrayArray17[arg0][arg1] = arg6;
		this.anIntArrayArrayArray20[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray21 != null) {
			this.anIntArrayArrayArray21[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray22 != null) {
			this.anIntArrayArrayArray22[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub47[] local88 = this.aClass4_Sub47ArrayArrayArray1[arg0][arg1] = new Class4_Sub47[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class4 local125;
			for (local125 = this.aClass221_34.method5075(local119); local125 != null; local125 = this.aClass221_34.method5067()) {
				@Pc(130) Class4_Sub47 local130 = (Class4_Sub47) local125;
				if (local130.anInt9311 == arg8[local90] && (float) arg9[local90] == local130.aFloat196 && local130.anInt9317 == arg10 && local130.anInt9304 == arg11 && arg12 == local130.anInt9308) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub47(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass221_34.method5073(local88[local90], local119);
			} else {
				local88[local90] = (Class4_Sub47) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray27[arg0][arg1] = (byte) (this.aByteArrayArray27[arg0][arg1] | 0x1);
		}
		if (this.anInt9282 < arg6.length) {
			this.anInt9282 = arg6.length;
		}
		this.anInt9281 += arg6.length;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8059(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9281 <= 0) {
			return;
		}
		@Pc(19) Interface6 local19 = this.aClass7_Sub1_16.method5772(this.anInt9261);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7935();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass7_Sub1_16.method5675(local36);
				@Pc(48) int local48;
				@Pc(58) int local58;
				@Pc(60) int local60;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = local48 * super.anInt10330 + arg0;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray18[local58];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local44.d(local90);
										if (local90 < local23) {
											local23 = local90;
										}
										if (local90 > local25) {
											local25 = local90;
										}
										local21++;
									}
								}
							}
							local58++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = super.anInt10330 * local48 + arg0;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray18[local58];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local25 < local90) {
											local25 = local90;
										}
										if (local90 < local23) {
											local23 = local90;
										}
										local21++;
										local44.e(local90);
									}
								}
							}
							local58++;
						}
					}
				}
				local44.a();
				if (local19.method7936()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass7_Sub1_16.method5778();
		this.aClass7_Sub1_16.method5701(false);
		this.aClass7_Sub1_16.method5717(false);
		this.aClass7_Sub1_16.method5661(false);
		this.aClass7_Sub1_16.method5702(false);
		this.aClass7_Sub1_16.method5716(0);
		this.aClass7_Sub1_16.method5692(-2, false, false);
		this.aClass7_Sub1_16.method5694(null);
		@Pc(277) Class81_Sub1 local277 = this.aClass7_Sub1_16.method5695();
		@Pc(282) float[] local282 = this.aClass7_Sub1_16.method5657();
		local282[0] = (float) 1024 / ((float) this.aClass7_Sub1_16.anInt7180 * 128.0F * (float) super.anInt10333);
		local282[15] = 1.0F;
		local282[10] = 1.0F / (this.aFloat194 - this.aFloat193);
		local282[6] = 0.0F;
		local282[2] = 0.0F;
		local282[1] = 0.0F;
		local282[3] = 0.0F;
		local282[7] = 0.0F;
		local282[4] = 0.0F;
		local282[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass7_Sub1_16.anInt7180) - 1.0F;
		local282[14] = -this.aFloat193 / (this.aFloat194 - this.aFloat193);
		local282[5] = (float) 1024 / ((float) this.aClass7_Sub1_16.anInt7241 * (float) super.anInt10333 * 128.0F);
		local282[8] = 0.0F;
		local282[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass7_Sub1_16.anInt7241;
		local282[9] = 0.0F;
		local282[11] = 0.0F;
		local277.method1973(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
		this.aClass7_Sub1_16.method5709();
		this.aClass7_Sub1_16.method5786();
		if ((this.anInt9264 & 0x7) == 0) {
			this.aClass7_Sub1_16.method5717(false);
		} else {
			this.aClass7_Sub1_16.method5717(true);
			this.aClass7_Sub1_16.method5703();
		}
		this.aClass7_Sub1_16.method5742(false);
		this.aClass7_Sub1_16.method5721(this.anInterface24_11, 0);
		this.aClass7_Sub1_16.method5721(this.anInterface24_12, 1);
		this.aClass7_Sub1_16.method5754(this.aClass82_20);
		this.aClass7_Sub1_16.method5680(local21 / 3, 0, local25 + 1 - local23, local19, Static409.aClass119_6, local23);
		this.aClass7_Sub1_16.method5742(true);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!am;[I)V")
	@Override
	public void method8057(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass22_61.method894(new Class4_Sub25(this.aClass7_Sub1_16, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray28[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray28[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class4_Sub6_Sub7 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub6_Sub7 arg2) {
		if ((this.aByteArrayArray27[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt10333 >> this.aClass7_Sub1_16.anInt7364;
		@Pc(24) Class4_Sub6_Sub7_Sub2 local24 = (Class4_Sub6_Sub7_Sub2) arg2;
		@Pc(34) Class4_Sub6_Sub7_Sub2 local34;
		if (local24 != null && local24.method7454(local21, local21)) {
			local34 = local24;
			local24.method7450();
		} else {
			local34 = new Class4_Sub6_Sub7_Sub2(this.aClass7_Sub1_16, local21, local21);
		}
		local34.method7448(0, local21, 0, local21);
		this.method7115(local34, arg1, arg0);
		return local34;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method8062(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass343_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass7_Sub1_16.anInt7353 >> 8) >> this.aClass7_Sub1_16.anInt7364;
			@Pc(39) int local39 = arg3 - (this.aClass7_Sub1_16.anInt7363 * arg2 >> 8) >> this.aClass7_Sub1_16.anInt7364;
			return this.aClass343_1.method7890(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!sq", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt9281 <= 0) {
			this.aClass343_1 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt10330 + 1][super.anInt10327 + 1];
			for (@Pc(25) int local25 = 1; super.anInt10330 > local25; local25++) {
				for (@Pc(29) int local29 = 1; local29 < super.anInt10327; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray28[local25][local29] >> 1) + (this.aByteArrayArray28[local25][local29 + 1] >> 3) + (this.aByteArrayArray28[local25 + -1][local29] >> 2) + (this.aByteArrayArray28[local25 + 1][local29] >> 3) + (this.aByteArrayArray28[local25][local29 + -1] >> 2));
				}
			}
			@Pc(105) Class4_Sub47[] local105 = new Class4_Sub47[this.aClass221_34.method5070()];
			this.aClass221_34.method5074(local105);
			for (@Pc(113) int local113 = 0; local113 < local105.length; local113++) {
				local105[local113].method7143(this.anInt9281);
			}
			@Pc(129) int local129 = 20;
			if (this.anIntArrayArrayArray21 != null) {
				local129 += 4;
			}
			if ((this.anInt9264 & 0x7) != 0) {
				local129 += 12;
			}
			@Pc(152) NativeHeapBuffer local152 = this.aClass7_Sub1_16.aNativeHeap5.a(this.anInt9281 * 4, false);
			@Pc(162) NativeHeapBuffer local162 = this.aClass7_Sub1_16.aNativeHeap5.a(this.anInt9281 * local129, false);
			@Pc(167) Stream local167 = new Stream(local162);
			@Pc(172) Stream local172 = new Stream(local152);
			@Pc(176) Class4_Sub47[] local176 = new Class4_Sub47[this.anInt9281];
			@Pc(183) int local183 = Static205.method3349(this.anInt9281 / 4);
			if (local183 < 1) {
				local183 = 1;
			}
			@Pc(195) Class221 local195 = new Class221(local183);
			@Pc(199) Class4_Sub47[] local199 = new Class4_Sub47[this.anInt9282];
			@Pc(205) int local205;
			for (@Pc(201) int local201 = 0; super.anInt10330 > local201; local201++) {
				for (local205 = 0; local205 < super.anInt10327; local205++) {
					if (this.anIntArrayArrayArray17[local201][local205] != null) {
						@Pc(221) Class4_Sub47[] local221 = this.aClass4_Sub47ArrayArrayArray1[local201][local205];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray19[local201][local205];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray18[local201][local205];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray20[local201][local205];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray17[local201][local205];
						@Pc(261) int[] local261 = this.anIntArrayArrayArray22 == null ? null : this.anIntArrayArrayArray22[local201][local205];
						@Pc(273) int[] local273 = this.anIntArrayArrayArray21 == null ? null : this.anIntArrayArrayArray21[local201][local205];
						if (local242 == null) {
							local242 = local249;
						}
						@Pc(284) float local284 = this.aFloatArrayArray13[local201][local205];
						@Pc(291) float local291 = this.aFloatArrayArray14[local201][local205];
						@Pc(298) float local298 = this.aFloatArrayArray12[local201][local205];
						@Pc(307) float local307 = this.aFloatArrayArray13[local201][local205 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray14[local201][local205 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray12[local201][local205 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray13[local201 + 1][local205 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray14[local201 + 1][local205 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray12[local201 + 1][local205 + 1];
						@Pc(367) float local367 = this.aFloatArrayArray13[local201 + 1][local205];
						@Pc(376) float local376 = this.aFloatArrayArray14[local201 + 1][local205];
						@Pc(385) float local385 = this.aFloatArrayArray12[local201 + 1][local205];
						@Pc(393) int local393 = local23[local201][local205] & 0xFF;
						@Pc(403) int local403 = local23[local201][local205 + 1] & 0xFF;
						@Pc(415) int local415 = local23[local201 + 1][local205 + 1] & 0xFF;
						@Pc(425) int local425 = local23[local201 + 1][local205] & 0xFF;
						@Pc(427) int local427 = 0;
						@Pc(437) int local437;
						label355: for (@Pc(429) int local429 = 0; local429 < local249.length; local429++) {
							@Pc(435) Class4_Sub47 local435 = local221[local429];
							for (local437 = 0; local437 < local427; local437++) {
								if (local199[local437] == local435) {
									continue label355;
								}
							}
							local199[local427++] = local435;
						}
						@Pc(474) short[] local474 = this.aShortArrayArray18[super.anInt10330 * local205 + local201] = new short[local249.length];
						for (local437 = 0; local437 < local249.length; local437++) {
							@Pc(488) int local488 = (local201 << super.anInt10331) + local228[local437];
							@Pc(498) int local498 = (local205 << super.anInt10331) + local235[local437];
							@Pc(503) int local503 = local488 >> this.anInt9275;
							@Pc(508) int local508 = local498 >> this.anInt9275;
							@Pc(512) int local512 = local249[local437];
							@Pc(516) int local516 = local242[local437];
							@Pc(524) int local524 = local261 == null ? 0 : local261[local437];
							@Pc(542) long local542 = (long) local512 << 32 | (long) local516 << 48 | (long) (local503 << 16) | (long) local508;
							@Pc(546) int local546 = local228[local437];
							@Pc(550) int local550 = local235[local437];
							@Pc(552) byte local552 = 74;
							@Pc(554) int local554 = 0;
							@Pc(556) float local556 = 1.0F;
							@Pc(562) float local562;
							@Pc(564) float local564;
							@Pc(570) float local570;
							@Pc(662) float local662;
							@Pc(568) int local568;
							if (local546 == 0 && local550 == 0) {
								local562 = local284;
								local564 = local291;
								local568 = local552 - local393;
								local570 = local298;
							} else if (local546 == 0 && local550 == super.anInt10333) {
								local562 = local307;
								local570 = local325;
								local568 = local552 - local403;
								local564 = local316;
							} else if (super.anInt10333 == local546 && local550 == super.anInt10333) {
								local562 = local336;
								local568 = local552 - local415;
								local570 = local358;
								local564 = local347;
							} else if (local546 == super.anInt10333 && local550 == 0) {
								local568 = local552 - local425;
								local564 = local376;
								local570 = local385;
								local562 = local367;
							} else {
								@Pc(638) float local638 = (float) local546 / (float) super.anInt10333;
								@Pc(645) float local645 = (float) local550 / (float) super.anInt10333;
								@Pc(653) float local653 = local284 + local638 * (local367 - local284);
								local662 = local638 * (local376 - local291) + local291;
								@Pc(670) float local670 = (local385 - local298) * local638 + local298;
								@Pc(679) float local679 = local307 + (local336 - local307) * local638;
								@Pc(688) float local688 = local316 + local638 * (local347 - local316);
								@Pc(697) float local697 = local638 * (local358 - local325) + local325;
								local564 = local645 * (local688 - local662) + local662;
								local562 = local653 + local645 * (local679 - local653);
								local570 = (local697 - local670) * local645 + local670;
								@Pc(733) int local733 = ((local425 - local393) * local546 >> super.anInt10331) + local393;
								@Pc(746) int local746 = local403 + ((local415 - local403) * local546 >> super.anInt10331);
								local568 = local552 - ((local746 - local733) * local550 >> super.anInt10331) - local733;
							}
							if (local512 != -1) {
								@Pc(782) int local782 = local568 * (local512 & 0x7F) >> 7;
								if (local782 < 2) {
									local782 = 2;
								} else if (local782 > 126) {
									local782 = 126;
								}
								local554 = Static394.anIntArray413[local512 & 0xFF80 | local782];
								if ((this.anInt9264 & 0x7) == 0) {
									local556 = local564 * this.aClass7_Sub1_16.aFloatArray54[1] + this.aClass7_Sub1_16.aFloatArray54[0] * local562 + local570 * this.aClass7_Sub1_16.aFloatArray54[2];
									local556 = (local556 > 0.0F ? this.aClass7_Sub1_16.aFloat180 : this.aClass7_Sub1_16.aFloat168) * local556 + this.aClass7_Sub1_16.aFloat171;
								}
							}
							@Pc(853) Class4 local853 = null;
							if ((this.anInt9277 - 1 & local488) == 0 && (this.anInt9277 - 1 & local498) == 0) {
								local853 = local195.method5075(local542);
							}
							@Pc(892) int local892;
							@Pc(919) int local919;
							if (local853 == null) {
								if (local512 == local516) {
									local919 = local554;
								} else {
									@Pc(929) int local929 = local568 * (local516 & 0x7F) >> 7;
									if (local929 < 2) {
										local929 = 2;
									} else if (local929 > 126) {
										local929 = 126;
									}
									local919 = Static394.anIntArray413[local929 | local516 & 0xFF80];
									if ((this.anInt9264 & 0x7) == 0) {
										@Pc(979) float local979 = local562 * this.aClass7_Sub1_16.aFloatArray54[0] + local564 * this.aClass7_Sub1_16.aFloatArray54[1] + this.aClass7_Sub1_16.aFloatArray54[2] * local570;
										local662 = (local556 > 0.0F ? this.aClass7_Sub1_16.aFloat180 : this.aClass7_Sub1_16.aFloat168) * local556 + this.aClass7_Sub1_16.aFloat171;
										@Pc(1004) int local1004 = local919 >> 16 & 0xFF;
										@Pc(1010) int local1010 = local919 >> 8 & 0xFF;
										local1004 = (int) ((float) local1004 * local662);
										@Pc(1020) int local1020 = local919 & 0xFF;
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										local1010 = (int) ((float) local1010 * local662);
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										local1020 = (int) ((float) local1020 * local662);
										if (local1020 < 0) {
											local1020 = 0;
										} else if (local1020 > 255) {
											local1020 = 255;
										}
										local919 = local1004 << 16 | local1010 << 8 | local1020;
									}
								}
								if (Stream.c()) {
									local167.b((float) local488);
									local167.b((float) (local524 + this.method8064(local488, local498)));
									local167.b((float) local498);
									local167.b((float) local488);
									local167.b((float) local498);
									if (this.anIntArrayArrayArray21 != null) {
										local167.b((float) (local273 == null ? 0 : local273[local437] - 1));
									}
									if ((this.anInt9264 & 0x7) != 0) {
										local167.b(local562);
										local167.b(local564);
										local167.b(local570);
									}
								} else {
									local167.a((float) local488);
									local167.a((float) (local524 + this.method8064(local488, local498)));
									local167.a((float) local498);
									local167.a((float) local488);
									local167.a((float) local498);
									if (this.anIntArrayArrayArray21 != null) {
										local167.a((float) (local273 == null ? 0 : local273[local437] - 1));
									}
									if ((this.anInt9264 & 0x7) != 0) {
										local167.a(local562);
										local167.a(local564);
										local167.a(local570);
									}
								}
								if (this.aClass7_Sub1_16.anInt7351 == 0) {
									local172.f(local919 | 0xFF000000);
								} else {
									local172.c(local919 | 0xFF000000);
								}
								local892 = this.anInt9270++;
								local474[local437] = (short) local892;
								if (local512 != -1) {
									local176[local892] = local221[local437];
								}
								local195.method5073(new Class4_Sub49(local474[local437]), local542);
							} else {
								local474[local437] = ((Class4_Sub49) local853).aShort123;
								local892 = local474[local437] & 0xFFFF;
								if (local512 != -1 && local176[local892].aLong295 > local221[local437].aLong295) {
									local176[local892] = local221[local437];
								}
							}
							for (local919 = 0; local919 < local427; local919++) {
								local199[local919].method7138(local568, local556, local554, local892);
							}
							this.anInt9261++;
						}
					}
				}
			}
			for (local205 = 0; local205 < this.anInt9270; local205++) {
				@Pc(1315) Class4_Sub47 local1315 = local176[local205];
				if (local1315 != null) {
					local1315.method7142(local205);
				}
			}
			@Pc(1336) int local1336;
			@Pc(1354) int local1354;
			for (@Pc(1332) int local1332 = 0; local1332 < super.anInt10330; local1332++) {
				for (local1336 = 0; super.anInt10327 > local1336; local1336++) {
					@Pc(1348) short[] local1348 = this.aShortArrayArray18[local1332 + super.anInt10330 * local1336];
					if (local1348 != null) {
						@Pc(1352) int local1352 = 0;
						local1354 = 0;
						while (local1354 < local1348.length) {
							@Pc(1363) int local1363 = local1348[local1354++] & 0xFFFF;
							@Pc(1370) int local1370 = local1348[local1354++] & 0xFFFF;
							@Pc(1377) int local1377 = local1348[local1354++] & 0xFFFF;
							@Pc(1381) Class4_Sub47 local1381 = local176[local1363];
							@Pc(1385) Class4_Sub47 local1385 = local176[local1370];
							@Pc(1389) Class4_Sub47 local1389 = local176[local1377];
							@Pc(1391) Class4_Sub47 local1391 = null;
							if (local1381 != null) {
								local1381.method7136(local1332, local1336, local1352);
								local1391 = local1381;
							}
							if (local1385 != null) {
								local1385.method7136(local1332, local1336, local1352);
								if (local1391 == null || local1391.aLong295 > local1385.aLong295) {
									local1391 = local1385;
								}
							}
							if (local1389 != null) {
								local1389.method7136(local1332, local1336, local1352);
								if (local1391 == null || local1389.aLong295 < local1391.aLong295) {
									local1391 = local1389;
								}
							}
							if (local1391 != null) {
								if (local1381 != null) {
									local1391.method7142(local1363);
								}
								if (local1385 != null) {
									local1391.method7142(local1370);
								}
								if (local1389 != null) {
									local1391.method7142(local1377);
								}
								local1391.method7136(local1332, local1336, local1352);
							}
							local1352++;
						}
					}
				}
			}
			local167.a();
			local172.a();
			this.anInterface24_12 = this.aClass7_Sub1_16.method5704(false);
			this.anInterface24_12.method6548(4, local152, this.anInt9270 * 4);
			this.anInterface24_11 = this.aClass7_Sub1_16.method5704(false);
			this.anInterface24_11.method6548(local129, local162, local129 * this.anInt9270);
			if ((this.anInt9264 & 0x7) == 0) {
				if (this.anIntArrayArrayArray21 == null) {
					this.aClass82_20 = this.aClass7_Sub1_16.method5736(new Class204[] { new Class204(new Class91[] { Static117.aClass91_1, Static117.aClass91_5 }), new Class204(Static117.aClass91_3) });
				} else {
					this.aClass82_20 = this.aClass7_Sub1_16.method5736(new Class204[] { new Class204(new Class91[] { Static117.aClass91_1, Static117.aClass91_5, Static117.aClass91_4 }), new Class204(Static117.aClass91_3) });
				}
			} else if (this.anIntArrayArrayArray21 == null) {
				this.aClass82_20 = this.aClass7_Sub1_16.method5736(new Class204[] { new Class204(new Class91[] { Static117.aClass91_1, Static117.aClass91_5, Static117.aClass91_2 }), new Class204(Static117.aClass91_3) });
			} else {
				this.aClass82_20 = this.aClass7_Sub1_16.method5736(new Class204[] { new Class204(new Class91[] { Static117.aClass91_1, Static117.aClass91_5, Static117.aClass91_4, Static117.aClass91_2 }), new Class204(Static117.aClass91_3) });
			}
			local1336 = 0;
			for (@Pc(1682) int local1682 = 0; local1682 < local105.length; local1682++) {
				if (local105[local1682].anInt9314 > 0) {
					local105[local1336++] = local105[local1682];
				}
			}
			this.aClass4_Sub47Array1 = new Class4_Sub47[local1336];
			@Pc(1711) long[] local1711 = new long[local1336];
			for (local1354 = 0; local1354 < local1336; local1354++) {
				@Pc(1719) Class4_Sub47 local1719 = local105[local1354];
				local1711[local1354] = local1719.aLong295;
				this.aClass4_Sub47Array1[local1354] = local1719;
				local1719.method7141(this.anInt9270);
			}
			Static417.method4089(this.aClass4_Sub47Array1, local1711);
			if (this.aClass343_1 != null) {
				this.aClass343_1.method7888();
			}
		}
		this.aClass221_34 = null;
		this.anIntArrayArrayArray19 = this.anIntArrayArrayArray18 = null;
		this.aFloatArrayArray13 = this.aFloatArrayArray14 = this.aFloatArrayArray12 = null;
		this.aByteArrayArray28 = null;
		this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray22 = null;
		this.aClass4_Sub47ArrayArrayArray1 = null;
		this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray21 = null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!uda;ZII)V")
	private void method7115(@OriginalArg(0) Class4_Sub6_Sub7_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray19[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray18[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (Static201.anIntArray197.length < local22) {
			Static82.anIntArray107 = new int[local22];
			Static201.anIntArray197 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static201.anIntArray197[local38] = local12[local38] >> this.aClass7_Sub1_16.anInt7364;
			Static82.anIntArray107[local38] = local19[local38] >> this.aClass7_Sub1_16.anInt7364;
		}
		@Pc(70) int local70 = 0;
		while (local70 < local22) {
			@Pc(78) int local78 = Static201.anIntArray197[local70];
			@Pc(83) int local83 = Static82.anIntArray107[local70++];
			@Pc(87) int local87 = Static201.anIntArray197[local70];
			@Pc(92) int local92 = Static82.anIntArray107[local70++];
			@Pc(96) int local96 = Static201.anIntArray197[local70];
			@Pc(101) int local101 = Static82.anIntArray107[local70++];
			if ((local78 - local87) * (local92 - local101) - (local92 - local83) * (-local87 + local96) > 0) {
				arg0.method7449(local92, local101, local83, local87, local78, local96);
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([[ZIZIIIB)V")
	private void method7116(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass4_Sub47Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg1 + arg1 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > Static144.anIntArray148.length) {
			Static144.anIntArray148 = new int[local14];
		}
		@Pc(30) int local30 = arg3 - arg1;
		@Pc(32) int local32 = local30;
		if (local30 < 0) {
			local30 = 0;
		}
		@Pc(44) int local44 = arg4 - arg1;
		@Pc(46) int local46 = local44;
		if (local44 < 0) {
			local44 = 0;
		}
		@Pc(54) int local54 = arg3 + arg1;
		if (super.anInt10330 - 1 < local54) {
			local54 = super.anInt10330 - 1;
		}
		@Pc(69) int local69 = arg4 + arg1;
		if (super.anInt10327 - 1 < local69) {
			local69 = super.anInt10327 - 1;
		}
		Static566.anInt10283 = 0;
		for (@Pc(88) int local88 = local30; local88 <= local54; local88++) {
			@Pc(96) boolean[] local96 = arg0[local88 - local32];
			for (@Pc(98) int local98 = local44; local98 <= local69; local98++) {
				if (local96[local98 - local46]) {
					Static144.anIntArray148[Static566.anInt10283++] = super.anInt10330 * local98 + local88;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass7_Sub1_16.method5720();
		} else {
			this.aClass7_Sub1_16.method5711((float) arg5);
			this.aClass7_Sub1_16.method5667();
		}
		this.aClass7_Sub1_16.method5767();
		this.aClass7_Sub1_16.method5717((this.anInt9264 & 0x7) != 0);
		this.aClass7_Sub1_16.method5692(-1, false, false);
		this.aClass7_Sub1_16.method5721(this.anInterface24_11, 0);
		for (@Pc(183) int local183 = 0; local183 < this.aClass4_Sub47Array1.length; local183++) {
			this.aClass4_Sub47Array1[local183].method7137(Static566.anInt10283, Static144.anIntArray148);
		}
		@Pc(210) Class81_Sub1 local210 = this.aClass7_Sub1_16.method5695();
		local210.NA(0, -1, 0);
		this.aClass7_Sub1_16.method5786();
		if (!this.aClass22_61.method893()) {
			@Pc(228) int local228 = this.aClass7_Sub1_16.anInt7362;
			@Pc(232) int local232 = this.aClass7_Sub1_16.anInt7354;
			this.aClass7_Sub1_16.pa(0, local232, this.aClass7_Sub1_16.anInt7350);
			this.aClass7_Sub1_16.method5717(false);
			this.aClass7_Sub1_16.method5702(false);
			this.aClass7_Sub1_16.method5716(128);
			this.aClass7_Sub1_16.method5692(-2, false, false);
			this.aClass7_Sub1_16.method5694(this.aClass7_Sub1_16.anInterface1_3);
			this.aClass7_Sub1_16.method5764(Static468.aClass95_3, Static563.aClass95_5);
			this.aClass7_Sub1_16.method5681(0, Static18.aClass61_1);
			this.aClass7_Sub1_16.method5713(Static308.aClass61_4, 0);
			for (@Pc(294) Class4 local294 = this.aClass22_61.method895(); local294 != null; local294 = this.aClass22_61.method889()) {
				@Pc(299) Class4_Sub25 local299 = (Class4_Sub25) local294;
				local299.method3403(arg4, arg3, arg1, arg0);
			}
			this.aClass7_Sub1_16.method5681(0, Static411.aClass61_5);
			this.aClass7_Sub1_16.method5713(Static411.aClass61_5, 0);
			this.aClass7_Sub1_16.method5694(null);
			this.aClass7_Sub1_16.pa(local228, local232, this.aClass7_Sub1_16.anInt7350);
		}
		if (this.aClass343_1 != null) {
			this.aClass7_Sub1_16.method5721(this.anInterface24_11, 0);
			this.aClass7_Sub1_16.method5721(this.anInterface24_12, 1);
			this.aClass7_Sub1_16.method5754(this.aClass82_20);
			this.aClass343_1.method7891(arg2, arg1, arg0, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	@Override
	public void method8061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sq", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass343_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass7_Sub1_16.anInt7353 >> 8) >> this.aClass7_Sub1_16.anInt7364;
			@Pc(39) int local39 = arg3 - (this.aClass7_Sub1_16.anInt7363 * arg2 >> 8) >> this.aClass7_Sub1_16.anInt7364;
			this.aClass343_1.method7892(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method7116(arg3, arg2, arg4, arg0, arg1, -1);
	}
}
