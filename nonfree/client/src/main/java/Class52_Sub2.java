import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	private int anInt3930;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
	private int anInt3938;

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
	private int anInt3943;

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "[Lclient!dk;")
	private Class3_Sub14[] aClass3_Sub14Array1;

	@OriginalMember(owner = "client!ha", name = "ab", descriptor = "Lclient!ep;")
	public Class76 aClass76_13;

	@OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
	private int anInt3944;

	@OriginalMember(owner = "client!ha", name = "db", descriptor = "Lclient!cca;")
	private Interface3 anInterface3_7;

	@OriginalMember(owner = "client!ha", name = "hb", descriptor = "Lclient!cca;")
	private Interface3 anInterface3_8;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "F")
	private float aFloat134 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "F")
	private float aFloat135 = -3.4028235E38F;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!eea;")
	private final Class71 aClass71_34 = new Class71();

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	private final int anInt3929 = this.anInt9494 - 2;

	@OriginalMember(owner = "client!ha", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "Lclient!tu;")
	public final Class5_Sub3 aClass5_Sub3_4;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!ha", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ha", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	public final int anInt3923;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	private final int anInt3925;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "[[B")
	private final byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ha", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "[[[Lclient!dk;")
	private Class3_Sub14[][][] aClass3_Sub14ArrayArrayArray1;

	@OriginalMember(owner = "client!ha", name = "gb", descriptor = "Lclient!sd;")
	private Class267 aClass267_15;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!ob;")
	private Class211 aClass211_1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!tu;IIII[[I[[II)V")
	public Class52_Sub2(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray43 = arg5;
		this.aClass5_Sub3_4 = arg0;
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aByteArrayArray12 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray4 = new float[super.anInt9491 + 1][super.anInt9492 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray2 = new float[super.anInt9491 + 1][super.anInt9492 + 1];
		this.anInt3923 = arg2;
		this.anInt3925 = 0x1 << this.anInt3929;
		this.aByteArrayArray11 = new byte[arg3][arg4];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt9491 + 1][super.anInt9492 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aShortArrayArray3 = new short[arg3 * arg4][];
		this.aClass3_Sub14ArrayArrayArray1 = new Class3_Sub14[arg3][arg4][];
		for (@Pc(123) int local123 = 0; super.anInt9492 >= local123; local123++) {
			for (@Pc(127) int local127 = 0; local127 <= super.anInt9491; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray43[local127][local123];
				if (this.aFloat134 > (float) local136) {
					this.aFloat134 = local136;
				}
				if ((float) local136 > this.aFloat135) {
					this.aFloat135 = local136;
				}
				if (local127 > 0 && local123 > 0 && super.anInt9491 > local127 && local123 < super.anInt9492) {
					@Pc(199) int local199 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(215) int local215 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(234) float local234 = (float) (1.0D / Math.sqrt((double) (local215 * local215 + arg7 * arg7 * 4 + local199 * local199)));
					this.aFloatArrayArray2[local127][local123] = local234 * (float) local199;
					this.aFloatArrayArray4[local127][local123] = local234 * (float) (-arg7 * 2);
					this.aFloatArrayArray3[local127][local123] = (float) local215 * local234;
				}
			}
		}
		this.aFloat135++;
		this.aFloat134--;
		this.aClass267_15 = new Class267(128);
		if ((this.anInt3923 & 0x10) != 0) {
			this.aClass211_1 = new Class211(this.aClass5_Sub3_4, this);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!vs;I)V")
	private void method3261(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub10_Sub18_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray12[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray11[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static108.anIntArray248.length) {
			Static108.anIntArray248 = new int[local22];
			Static310.anIntArray538 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static108.anIntArray248[local38] = local12[local38] >> this.aClass5_Sub3_4.anInt7761;
			Static310.anIntArray538[local38] = local19[local38] >> this.aClass5_Sub3_4.anInt7761;
		}
		@Pc(76) int local76 = 0;
		while (local22 > local76) {
			@Pc(82) int local82 = Static108.anIntArray248[local76];
			@Pc(87) int local87 = Static310.anIntArray538[local76++];
			@Pc(91) int local91 = Static108.anIntArray248[local76];
			@Pc(96) int local96 = Static310.anIntArray538[local76++];
			@Pc(100) int local100 = Static108.anIntArray248[local76];
			@Pc(105) int local105 = Static310.anIntArray538[local76++];
			if ((local82 - local91) * (local96 + -local105) - (local100 - local91) * (local96 - local87) > 0) {
				arg1.method7518(local91, local87, local100, local96, local82, local105);
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
	@Override
	public void method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ha", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9494;
		@Pc(13) int local13 = arg1 >> super.anInt9494;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9491 - 1 || super.anInt9492 - 1 < local13) {
			return 0;
		}
		@Pc(45) int local45 = super.anInt9493 - 1 & arg0;
		@Pc(52) int local52 = arg1 & super.anInt9493 - 1;
		@Pc(79) int local79 = this.anIntArrayArray43[local8 + 1][local13] * local45 + (super.anInt9493 - local45) * this.anIntArrayArray43[local8][local13] >> super.anInt9494;
		@Pc(110) int local110 = this.anIntArrayArray43[local8 + 1][local13 + 1] * local45 + (super.anInt9493 - local45) * this.anIntArrayArray43[local8][local13 + 1] >> super.anInt9494;
		return local110 * local52 + (super.anInt9493 - local52) * local79 >> super.anInt9494;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7826(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3944 <= 0) {
			return;
		}
		@Pc(19) Interface14 local19 = this.aClass5_Sub3_4.method6341(this.anInt3930);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method3136();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass5_Sub3_4.method6352(local36);
				@Pc(48) int local48;
				@Pc(58) int local58;
				@Pc(60) int local60;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = local48 * super.anInt9491 + arg0;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray3[local58];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local44.c(local90);
										if (local90 < local23) {
											local23 = local90;
										}
										local21++;
										if (local90 > local25) {
											local25 = local90;
										}
									}
								}
							}
							local58++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = local48 * super.anInt9491 + arg0;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray3[local58];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 > local25) {
											local25 = local90;
										}
										if (local23 > local90) {
											local23 = local90;
										}
										local44.b(local90);
										local21++;
									}
								}
							}
							local58++;
						}
					}
				}
				local44.a();
				if (local19.method3135()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass5_Sub3_4.method6423();
		this.aClass5_Sub3_4.method6428(false);
		this.aClass5_Sub3_4.method6349(false);
		this.aClass5_Sub3_4.method6414(false);
		this.aClass5_Sub3_4.method6311(false);
		this.aClass5_Sub3_4.method6398(0);
		this.aClass5_Sub3_4.method6299(false, -2, false);
		this.aClass5_Sub3_4.method6416(null);
		@Pc(282) Class205_Sub1 local282 = this.aClass5_Sub3_4.method6297();
		@Pc(287) float[] local287 = this.aClass5_Sub3_4.method6409();
		local287[4] = 0.0F;
		local287[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass5_Sub3_4.anInt7640;
		local287[1] = 0.0F;
		local287[8] = 0.0F;
		local287[14] = -this.aFloat134 / (this.aFloat135 - this.aFloat134);
		local287[11] = 0.0F;
		local287[2] = 0.0F;
		local287[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass5_Sub3_4.anInt7674) - 1.0F;
		local287[6] = 0.0F;
		local287[10] = 1.0F / (this.aFloat135 - this.aFloat134);
		local287[0] = (float) 1024 / ((float) this.aClass5_Sub3_4.anInt7674 * 128.0F * (float) super.anInt9493);
		local287[9] = 0.0F;
		local287[15] = 1.0F;
		local287[3] = 0.0F;
		local287[7] = 0.0F;
		local287[5] = (float) 1024 / ((float) this.aClass5_Sub3_4.anInt7640 * 128.0F * (float) super.anInt9493);
		local282.method5228(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
		this.aClass5_Sub3_4.method6345();
		this.aClass5_Sub3_4.method6392();
		if ((this.anInt3923 & 0x7) == 0) {
			this.aClass5_Sub3_4.method6349(false);
		} else {
			this.aClass5_Sub3_4.method6349(true);
			this.aClass5_Sub3_4.method6351();
		}
		this.aClass5_Sub3_4.method6372(false);
		this.aClass5_Sub3_4.method6382(this.anInterface3_8, 0);
		this.aClass5_Sub3_4.method6382(this.anInterface3_7, 1);
		this.aClass5_Sub3_4.method6333(this.aClass76_13);
		this.aClass5_Sub3_4.method6295(local23, local21 / 3, local25 + 1 - local23, 0, Static524.aClass87_7, local19);
		this.aClass5_Sub3_4.method6372(true);
	}

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass211_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass5_Sub3_4.anInt7762 * arg2 >> 8) >> this.aClass5_Sub3_4.anInt7761;
			@Pc(39) int local39 = arg3 - (this.aClass5_Sub3_4.anInt7756 * arg2 >> 8) >> this.aClass5_Sub3_4.anInt7761;
			this.aClass211_1.method5432(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3264(arg3, arg2, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class3_Sub10_Sub18 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub10_Sub18 arg2) {
		if ((this.aByteArrayArray11[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9493 >> this.aClass5_Sub3_4.anInt7761;
		@Pc(24) Class3_Sub10_Sub18_Sub1 local24 = (Class3_Sub10_Sub18_Sub1) arg2;
		@Pc(34) Class3_Sub10_Sub18_Sub1 local34;
		if (local24 != null && local24.method7512(local21, local21)) {
			local34 = local24;
			local24.method7513();
		} else {
			local34 = new Class3_Sub10_Sub18_Sub1(this.aClass5_Sub3_4, local21, local21);
		}
		local34.method7517(0, 0, local21, local21);
		this.method3261(arg0, local34, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!ha", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt3944 <= 0) {
			this.aClass211_1 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt9491 + 1][super.anInt9492 + 1];
			for (@Pc(21) int local21 = 1; local21 < super.anInt9491; local21++) {
				for (@Pc(25) int local25 = 1; local25 < super.anInt9492; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray12[local21][local25] >> 1) + (this.aByteArrayArray12[local21][local25 + 1] >> 3) + (this.aByteArrayArray12[local21 + -1][local25] >> 2) + (this.aByteArrayArray12[local21 + 1][local25] >> 3) + (this.aByteArrayArray12[local21][local25 + -1] >> 2));
				}
			}
			@Pc(105) Class3_Sub14[] local105 = new Class3_Sub14[this.aClass267_15.method6641()];
			this.aClass267_15.method6639(local105);
			for (@Pc(113) int local113 = 0; local113 < local105.length; local113++) {
				local105[local113].method1784(this.anInt3944);
			}
			@Pc(133) int local133 = 20;
			if (this.anIntArrayArrayArray10 != null) {
				local133 += 4;
			}
			if ((this.anInt3923 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(153) NativeHeapBuffer local153 = this.aClass5_Sub3_4.aNativeHeap5.a(this.anInt3944 * 4, false);
			@Pc(163) NativeHeapBuffer local163 = this.aClass5_Sub3_4.aNativeHeap5.a(this.anInt3944 * local133, false);
			@Pc(168) Stream local168 = new Stream(local163);
			@Pc(173) Stream local173 = new Stream(local153);
			@Pc(177) Class3_Sub14[] local177 = new Class3_Sub14[this.anInt3944];
			@Pc(184) int local184 = Static27.method797(this.anInt3944 / 4);
			if (local184 < 1) {
				local184 = 1;
			}
			@Pc(194) Class267 local194 = new Class267(local184);
			@Pc(198) Class3_Sub14[] local198 = new Class3_Sub14[this.anInt3943];
			@Pc(204) int local204;
			for (@Pc(200) int local200 = 0; super.anInt9491 > local200; local200++) {
				for (local204 = 0; local204 < super.anInt9492; local204++) {
					if (this.anIntArrayArrayArray7[local200][local204] != null) {
						@Pc(220) Class3_Sub14[] local220 = this.aClass3_Sub14ArrayArrayArray1[local200][local204];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray12[local200][local204];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray11[local200][local204];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray8[local200][local204];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray7[local200][local204];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local200][local204];
						@Pc(272) int[] local272 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local200][local204];
						if (local241 == null) {
							local241 = local248;
						}
						@Pc(283) float local283 = this.aFloatArrayArray2[local200][local204];
						@Pc(290) float local290 = this.aFloatArrayArray4[local200][local204];
						@Pc(297) float local297 = this.aFloatArrayArray3[local200][local204];
						@Pc(306) float local306 = this.aFloatArrayArray2[local200][local204 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray4[local200][local204 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray3[local200][local204 + 1];
						@Pc(335) float local335 = this.aFloatArrayArray2[local200 + 1][local204 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray4[local200 + 1][local204 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray3[local200 + 1][local204 + 1];
						@Pc(366) float local366 = this.aFloatArrayArray2[local200 + 1][local204];
						@Pc(375) float local375 = this.aFloatArrayArray4[local200 + 1][local204];
						@Pc(384) float local384 = this.aFloatArrayArray3[local200 + 1][local204];
						@Pc(392) int local392 = local19[local200][local204] & 0xFF;
						@Pc(402) int local402 = local19[local200][local204 + 1] & 0xFF;
						@Pc(414) int local414 = local19[local200 + 1][local204 + 1] & 0xFF;
						@Pc(424) int local424 = local19[local200 + 1][local204] & 0xFF;
						@Pc(426) int local426 = 0;
						@Pc(436) int local436;
						label357: for (@Pc(428) int local428 = 0; local428 < local248.length; local428++) {
							@Pc(434) Class3_Sub14 local434 = local220[local428];
							for (local436 = 0; local436 < local426; local436++) {
								if (local434 == local198[local436]) {
									continue label357;
								}
							}
							local198[local426++] = local434;
						}
						@Pc(477) short[] local477 = this.aShortArrayArray3[super.anInt9491 * local204 + local200] = new short[local248.length];
						for (local436 = 0; local436 < local248.length; local436++) {
							@Pc(491) int local491 = (local200 << super.anInt9494) + local227[local436];
							@Pc(501) int local501 = (local204 << super.anInt9494) + local234[local436];
							@Pc(506) int local506 = local491 >> this.anInt3929;
							@Pc(511) int local511 = local501 >> this.anInt3929;
							@Pc(515) int local515 = local248[local436];
							@Pc(519) int local519 = local241[local436];
							@Pc(527) int local527 = local260 == null ? 0 : local260[local436];
							@Pc(545) long local545 = (long) local511 | (long) local515 << 32 | (long) local519 << 48 | (long) (local506 << 16);
							@Pc(549) int local549 = local227[local436];
							@Pc(553) int local553 = local234[local436];
							@Pc(555) byte local555 = 74;
							@Pc(557) int local557 = 0;
							@Pc(559) float local559 = 1.0F;
							@Pc(601) float local601;
							@Pc(599) float local599;
							@Pc(603) float local603;
							@Pc(639) float local639;
							@Pc(607) int local607;
							if (local549 == 0 && local553 == 0) {
								local607 = local555 - local392;
								local601 = local283;
								local599 = local290;
								local603 = local297;
							} else if (local549 == 0 && super.anInt9493 == local553) {
								local603 = local324;
								local599 = local315;
								local601 = local306;
								local607 = local555 - local402;
							} else if (super.anInt9493 == local549 && super.anInt9493 == local553) {
								local603 = local357;
								local607 = local555 - local414;
								local601 = local335;
								local599 = local346;
							} else if (super.anInt9493 == local549 && local553 == 0) {
								local599 = local375;
								local601 = local366;
								local603 = local384;
								local607 = local555 - local424;
							} else {
								@Pc(616) float local616 = (float) local549 / (float) super.anInt9493;
								@Pc(623) float local623 = (float) local553 / (float) super.anInt9493;
								@Pc(631) float local631 = (local366 - local283) * local616 + local283;
								local639 = local616 * (local375 - local290) + local290;
								@Pc(648) float local648 = local297 + local616 * (local384 - local297);
								@Pc(657) float local657 = local306 + local616 * (local335 - local306);
								@Pc(665) float local665 = local616 * (local346 - local315) + local315;
								@Pc(673) float local673 = local616 * (local357 - local324) + local324;
								local601 = local631 + local623 * (local657 - local631);
								local599 = local639 + (local665 - local639) * local623;
								local603 = local648 + local623 * (local673 - local648);
								@Pc(710) int local710 = ((local424 - local392) * local549 >> super.anInt9494) + local392;
								@Pc(721) int local721 = (local549 * (local414 - local402) >> super.anInt9494) + local402;
								local607 = local555 - ((local721 - local710) * local553 >> super.anInt9494) - local710;
							}
							if (local515 != -1) {
								@Pc(782) int local782 = local607 * (local515 & 0x7F) >> 7;
								if (local782 < 2) {
									local782 = 2;
								} else if (local782 > 126) {
									local782 = 126;
								}
								if ((this.anInt3923 & 0x7) == 0) {
									local559 = local599 * this.aClass5_Sub3_4.aFloatArray53[1] + this.aClass5_Sub3_4.aFloatArray53[0] * local601 + this.aClass5_Sub3_4.aFloatArray53[2] * local603;
									local559 = this.aClass5_Sub3_4.aFloat228 + (local559 > 0.0F ? this.aClass5_Sub3_4.aFloat219 : this.aClass5_Sub3_4.aFloat232) * local559;
								}
								local557 = Static393.anIntArray638[local515 & 0xFF80 | local782];
							}
							@Pc(851) Class3 local851 = null;
							if ((local491 & this.anInt3925 - 1) == 0 && (this.anInt3925 - 1 & local501) == 0) {
								local851 = local194.method6644(local545);
							}
							@Pc(1195) int local1195;
							@Pc(887) int local887;
							if (local851 == null) {
								if (local519 == local515) {
									local887 = local557;
								} else {
									@Pc(897) int local897 = local607 * (local519 & 0x7F) >> 7;
									if (local897 < 2) {
										local897 = 2;
									} else if (local897 > 126) {
										local897 = 126;
									}
									local887 = Static393.anIntArray638[local897 | local519 & 0xFF80];
									if ((this.anInt3923 & 0x7) == 0) {
										local639 = this.aClass5_Sub3_4.aFloatArray53[2] * local603 + local601 * this.aClass5_Sub3_4.aFloatArray53[0] + local599 * this.aClass5_Sub3_4.aFloatArray53[1];
										local639 = (local559 > 0.0F ? this.aClass5_Sub3_4.aFloat219 : this.aClass5_Sub3_4.aFloat232) * local559 + this.aClass5_Sub3_4.aFloat228;
										@Pc(975) int local975 = local887 >> 16 & 0xFF;
										@Pc(981) int local981 = local887 >> 8 & 0xFF;
										local975 = (int) ((float) local975 * local639);
										@Pc(991) int local991 = local887 & 0xFF;
										local981 = (int) ((float) local981 * local639);
										if (local975 < 0) {
											local975 = 0;
										} else if (local975 > 255) {
											local975 = 255;
										}
										if (local981 < 0) {
											local981 = 0;
										} else if (local981 > 255) {
											local981 = 255;
										}
										local991 = (int) ((float) local991 * local639);
										if (local991 < 0) {
											local991 = 0;
										} else if (local991 > 255) {
											local991 = 255;
										}
										local887 = local991 | local975 << 16 | local981 << 8;
									}
								}
								if (Stream.c()) {
									local168.a((float) local491);
									local168.a((float) (local527 + this.sa(local491, local501)));
									local168.a((float) local501);
									local168.a((float) local491);
									local168.a((float) local501);
									if (this.anIntArrayArrayArray10 != null) {
										local168.a((float) (local272 == null ? 0 : local272[local436] - 1));
									}
									if ((this.anInt3923 & 0x7) != 0) {
										local168.a(local601);
										local168.a(local599);
										local168.a(local603);
									}
								} else {
									local168.b((float) local491);
									local168.b((float) (this.sa(local491, local501) + local527));
									local168.b((float) local501);
									local168.b((float) local491);
									local168.b((float) local501);
									if (this.anIntArrayArrayArray10 != null) {
										local168.b((float) (local272 == null ? 0 : local272[local436] - 1));
									}
									if ((this.anInt3923 & 0x7) != 0) {
										local168.b(local601);
										local168.b(local599);
										local168.b(local603);
									}
								}
								if (this.aClass5_Sub3_4.anInt7747 == 0) {
									local173.d(local887 | 0xFF000000);
								} else {
									local173.f(local887 | 0xFF000000);
								}
								local1195 = this.anInt3938++;
								local477[local436] = (short) local1195;
								if (local515 != -1) {
									local177[local1195] = local220[local436];
								}
								local194.method6640(new Class3_Sub18(local477[local436]), local545);
							} else {
								local477[local436] = ((Class3_Sub18) local851).aShort44;
								local1195 = local477[local436] & 0xFFFF;
								if (local515 != -1 && local220[local436].aLong285 < local177[local1195].aLong285) {
									local177[local1195] = local220[local436];
								}
							}
							for (local887 = 0; local887 < local426; local887++) {
								local198[local887].method1788(local607, local559, local1195, local557);
							}
							this.anInt3930++;
						}
					}
				}
			}
			for (local204 = 0; local204 < this.anInt3938; local204++) {
				@Pc(1310) Class3_Sub14 local1310 = local177[local204];
				if (local1310 != null) {
					local1310.method1790(local204);
				}
			}
			@Pc(1327) int local1327;
			@Pc(1346) int local1346;
			for (@Pc(1323) int local1323 = 0; local1323 < super.anInt9491; local1323++) {
				for (local1327 = 0; local1327 < super.anInt9492; local1327++) {
					@Pc(1340) short[] local1340 = this.aShortArrayArray3[local1327 * super.anInt9491 + local1323];
					if (local1340 != null) {
						@Pc(1344) int local1344 = 0;
						local1346 = 0;
						while (local1340.length > local1346) {
							@Pc(1355) int local1355 = local1340[local1346++] & 0xFFFF;
							@Pc(1362) int local1362 = local1340[local1346++] & 0xFFFF;
							@Pc(1369) int local1369 = local1340[local1346++] & 0xFFFF;
							@Pc(1373) Class3_Sub14 local1373 = local177[local1355];
							@Pc(1377) Class3_Sub14 local1377 = local177[local1362];
							@Pc(1381) Class3_Sub14 local1381 = local177[local1369];
							@Pc(1383) Class3_Sub14 local1383 = null;
							if (local1373 != null) {
								local1373.method1785(local1327, local1344, local1323);
								local1383 = local1373;
							}
							if (local1377 != null) {
								local1377.method1785(local1327, local1344, local1323);
								if (local1383 == null || local1377.aLong285 < local1383.aLong285) {
									local1383 = local1377;
								}
							}
							if (local1381 != null) {
								local1381.method1785(local1327, local1344, local1323);
								if (local1383 == null || local1383.aLong285 > local1381.aLong285) {
									local1383 = local1381;
								}
							}
							if (local1383 != null) {
								if (local1373 != null) {
									local1383.method1790(local1355);
								}
								if (local1377 != null) {
									local1383.method1790(local1362);
								}
								if (local1381 != null) {
									local1383.method1790(local1369);
								}
								local1383.method1785(local1327, local1344, local1323);
							}
							local1344++;
						}
					}
				}
			}
			local168.a();
			local173.a();
			this.anInterface3_7 = this.aClass5_Sub3_4.method6422(false);
			this.anInterface3_7.method2578(local153, 4, this.anInt3938 * 4);
			this.anInterface3_8 = this.aClass5_Sub3_4.method6422(false);
			this.anInterface3_8.method2578(local163, local133, this.anInt3938 * local133);
			if ((this.anInt3923 & 0x7) == 0) {
				if (this.anIntArrayArrayArray10 == null) {
					this.aClass76_13 = this.aClass5_Sub3_4.method6361(new Class50[] { new Class50(new Class144[] { Static218.aClass144_1, Static218.aClass144_5 }), new Class50(Static218.aClass144_3) });
				} else {
					this.aClass76_13 = this.aClass5_Sub3_4.method6361(new Class50[] { new Class50(new Class144[] { Static218.aClass144_1, Static218.aClass144_5, Static218.aClass144_4 }), new Class50(Static218.aClass144_3) });
				}
			} else if (this.anIntArrayArrayArray10 == null) {
				this.aClass76_13 = this.aClass5_Sub3_4.method6361(new Class50[] { new Class50(new Class144[] { Static218.aClass144_1, Static218.aClass144_5, Static218.aClass144_2 }), new Class50(Static218.aClass144_3) });
			} else {
				this.aClass76_13 = this.aClass5_Sub3_4.method6361(new Class50[] { new Class50(new Class144[] { Static218.aClass144_1, Static218.aClass144_5, Static218.aClass144_4, Static218.aClass144_2 }), new Class50(Static218.aClass144_3) });
			}
			local1327 = 0;
			for (@Pc(1687) int local1687 = 0; local1687 < local105.length; local1687++) {
				if (local105[local1687].anInt1905 > 0) {
					local105[local1327++] = local105[local1687];
				}
			}
			this.aClass3_Sub14Array1 = new Class3_Sub14[local1327];
			@Pc(1716) long[] local1716 = new long[local1327];
			for (local1346 = 0; local1346 < local1327; local1346++) {
				@Pc(1724) Class3_Sub14 local1724 = local105[local1346];
				local1716[local1346] = local1724.aLong285;
				this.aClass3_Sub14Array1[local1346] = local1724;
				local1724.method1789(this.anInt3938);
			}
			Static17.method3541(local1716, this.aClass3_Sub14Array1);
			if (this.aClass211_1 != null) {
				this.aClass211_1.method5434();
			}
		}
		this.anIntArrayArrayArray8 = null;
		this.aClass3_Sub14ArrayArrayArray1 = null;
		this.aByteArrayArray12 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass267_15 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray12 = this.anIntArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray12[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray12[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method7831(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass211_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass5_Sub3_4.anInt7762 >> 8) >> this.aClass5_Sub3_4.anInt7761;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass5_Sub3_4.anInt7756 >> 8) >> this.aClass5_Sub3_4.anInt7761;
			return this.aClass211_1.method5430(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!oj;[I)V")
	@Override
	public void method7832(@OriginalArg(0) Class3_Sub30 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass71_34.method2076(new Class3_Sub25(this.aClass5_Sub3_4, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ha", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass211_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass5_Sub3_4.anInt7762 * arg2 >> 8) >> this.aClass5_Sub3_4.anInt7761;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass5_Sub3_4.anInt7756 >> 8) >> this.aClass5_Sub3_4.anInt7761;
			this.aClass211_1.method5437(arg0, local38, local23);
		}
	}

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray43[arg0][arg1];
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([[ZBIIZII)V")
	private void method3264(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (this.aClass3_Sub14Array1 == null) {
			return;
		}
		@Pc(21) int local21 = arg1 + arg1 + 1;
		@Pc(25) int local25 = local21 * local21;
		if (local25 > Static311.anIntArray539.length) {
			Static311.anIntArray539 = new int[local25];
		}
		@Pc(41) int local41 = arg2 - arg1;
		@Pc(43) int local43 = local41;
		if (local41 < 0) {
			local41 = 0;
		}
		@Pc(52) int local52 = arg4 - arg1;
		@Pc(54) int local54 = local52;
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(65) int local65 = arg1 + arg2;
		if (super.anInt9491 - 1 < local65) {
			local65 = super.anInt9491 - 1;
		}
		@Pc(81) int local81 = arg4 + arg1;
		Static206.anInt4559 = 0;
		if (local81 > super.anInt9492 - 1) {
			local81 = super.anInt9492 - 1;
		}
		for (@Pc(96) int local96 = local41; local96 <= local65; local96++) {
			@Pc(105) boolean[] local105 = arg0[local96 - local43];
			for (@Pc(107) int local107 = local52; local107 <= local81; local107++) {
				if (local105[local107 - local54]) {
					Static311.anIntArray539[Static206.anInt4559++] = local96 + super.anInt9491 * local107;
				}
			}
		}
		this.aClass5_Sub3_4.method6375();
		this.aClass5_Sub3_4.method6370();
		this.aClass5_Sub3_4.method6349((this.anInt3923 & 0x7) != 0);
		this.aClass5_Sub3_4.method6299(false, -1, false);
		this.aClass5_Sub3_4.method6382(this.anInterface3_8, 0);
		for (@Pc(189) int local189 = 0; local189 < this.aClass3_Sub14Array1.length; local189++) {
			this.aClass3_Sub14Array1[local189].method1792(Static206.anInt4559, Static311.anIntArray539);
		}
		@Pc(216) Class205_Sub1 local216 = this.aClass5_Sub3_4.method6297();
		local216.GA(0, -1, 0);
		this.aClass5_Sub3_4.method6392();
		if (!this.aClass71_34.method2085()) {
			@Pc(234) int local234 = this.aClass5_Sub3_4.anInt7785;
			@Pc(238) int local238 = this.aClass5_Sub3_4.anInt7764;
			this.aClass5_Sub3_4.X(0, local238, this.aClass5_Sub3_4.anInt7773);
			this.aClass5_Sub3_4.method6349(false);
			this.aClass5_Sub3_4.method6311(false);
			this.aClass5_Sub3_4.method6398(128);
			this.aClass5_Sub3_4.method6299(false, -2, false);
			this.aClass5_Sub3_4.method6416(this.aClass5_Sub3_4.anInterface12_3);
			this.aClass5_Sub3_4.method6320(Static526.aClass289_5, Static130.aClass289_1);
			this.aClass5_Sub3_4.method6415(Static144.aClass166_2, 0);
			this.aClass5_Sub3_4.method6314(Static501.aClass166_4, 0);
			for (@Pc(300) Class3 local300 = this.aClass71_34.method2089(); local300 != null; local300 = this.aClass71_34.method2086()) {
				@Pc(305) Class3_Sub25 local305 = (Class3_Sub25) local300;
				local305.method4298(arg4, arg1, arg2, arg0);
			}
			this.aClass5_Sub3_4.method6415(Static213.aClass166_3, 0);
			this.aClass5_Sub3_4.method6314(Static213.aClass166_3, 0);
			this.aClass5_Sub3_4.method6416(null);
			this.aClass5_Sub3_4.X(local234, local238, this.aClass5_Sub3_4.anInt7773);
		}
		if (this.aClass211_1 == null) {
			return;
		}
		this.aClass5_Sub3_4.method6382(this.anInterface3_8, 0);
		this.aClass5_Sub3_4.method6382(this.anInterface3_7, 1);
		this.aClass5_Sub3_4.method6333(this.aClass76_13);
		this.aClass211_1.method5435(arg2, arg4, arg1, arg3, arg0);
		return;
	}

	@OriginalMember(owner = "client!ha", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt9491][super.anInt9492][];
		}
		if (arg3 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt9491][super.anInt9492][];
		}
		this.anIntArrayArrayArray12[arg0][arg1] = arg2;
		this.anIntArrayArrayArray11[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub14[] local88 = this.aClass3_Sub14ArrayArrayArray1[arg0][arg1] = new Class3_Sub14[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
			@Pc(125) Class3 local125;
			for (local125 = this.aClass267_15.method6644(local119); local125 != null; local125 = this.aClass267_15.method6646()) {
				@Pc(130) Class3_Sub14 local130 = (Class3_Sub14) local125;
				if (local130.anInt1913 == arg8[local90] && (float) arg9[local90] == local130.aFloat64 && arg10 == local130.anInt1914 && local130.anInt1903 == arg11 && local130.anInt1909 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub14(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass267_15.method6640(local88[local90], local119);
			} else {
				local88[local90] = (Class3_Sub14) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray11[arg0][arg1] = (byte) (this.aByteArrayArray11[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt3943) {
			this.anInt3943 = arg6.length;
		}
		this.anInt3944 += arg6.length;
	}
}
