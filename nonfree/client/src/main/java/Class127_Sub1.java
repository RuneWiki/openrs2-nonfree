import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
	private int anInt4302;

	@OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
	private int anInt4306;

	@OriginalMember(owner = "client!hm", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!hm", name = "Z", descriptor = "I")
	private int anInt4318;

	@OriginalMember(owner = "client!hm", name = "bb", descriptor = "Lclient!og;")
	private Interface15 anInterface15_7;

	@OriginalMember(owner = "client!hm", name = "db", descriptor = "Lclient!og;")
	private Interface15 anInterface15_8;

	@OriginalMember(owner = "client!hm", name = "fb", descriptor = "[Lclient!gca;")
	private Class3_Sub20[] aClass3_Sub20Array1;

	@OriginalMember(owner = "client!hm", name = "gb", descriptor = "Lclient!qf;")
	public Class1 aClass1_13;

	@OriginalMember(owner = "client!hm", name = "ib", descriptor = "I")
	private int anInt4319;

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "F")
	private float aFloat111 = -3.4028235E38F;

	@OriginalMember(owner = "client!hm", name = "P", descriptor = "F")
	private float aFloat112 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "Lclient!or;")
	private final Class244 aClass244_37 = new Class244();

	@OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
	private final int anInt4314 = this.anInt10008 - 2;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "Lclient!rr;")
	public final Class31_Sub1 aClass31_Sub1_7;

	@OriginalMember(owner = "client!hm", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
	private final int anInt4309;

	@OriginalMember(owner = "client!hm", name = "J", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!hm", name = "H", descriptor = "[[[Lclient!gca;")
	private Class3_Sub20[][][] aClass3_Sub20ArrayArrayArray1;

	@OriginalMember(owner = "client!hm", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
	public final int anInt4304;

	@OriginalMember(owner = "client!hm", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!hm", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!hm", name = "y", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!hm", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!hm", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "[[B")
	private final byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!hm", name = "jb", descriptor = "Lclient!sba;")
	private Class297 aClass297_15;

	@OriginalMember(owner = "client!hm", name = "K", descriptor = "Lclient!ml;")
	private Class209 aClass209_1;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!rr;IIII[[I[[II)V")
	public Class127_Sub1(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass31_Sub1_7 = arg0;
		this.aByteArrayArray22 = new byte[arg3 + 1][arg4 + 1];
		this.anInt4309 = 0x1 << this.anInt4314;
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aClass3_Sub20ArrayArrayArray1 = new Class3_Sub20[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anInt4304 = arg2;
		this.aFloatArrayArray8 = new float[super.anInt10004 + 1][super.anInt10007 + 1];
		this.aFloatArrayArray7 = new float[super.anInt10004 + 1][super.anInt10007 + 1];
		this.aShortArrayArray4 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt10004 + 1][super.anInt10007 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aByteArrayArray21 = new byte[arg3][arg4];
		for (@Pc(121) int local121 = 0; super.anInt10007 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt10004; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray102[local125][local121];
				if (this.aFloat112 > (float) local134) {
					this.aFloat112 = local134;
				}
				if (this.aFloat111 < (float) local134) {
					this.aFloat111 = local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt10004 > local125 && local121 < super.anInt10007) {
					@Pc(183) int local183 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(200) int local200 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + arg7 * 4 * arg7 + local200 * local200)));
					this.aFloatArrayArray8[local125][local121] = (float) local183 * local219;
					this.aFloatArrayArray6[local125][local121] = local219 * (float) (-arg7 * 2);
					this.aFloatArrayArray7[local125][local121] = local219 * (float) local200;
				}
			}
		}
		this.aFloat112--;
		this.aFloat111++;
		this.aClass297_15 = new Class297(128);
		if ((this.anInt4304 & 0x10) != 0) {
			this.aClass209_1 = new Class209(this.aClass31_Sub1_7, this);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B[[ZZIIII)V")
	private void method3470(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass3_Sub20Array1 == null) {
			return;
		}
		@Pc(22) int local22 = arg3 + arg3 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (local26 > Static163.anIntArray36.length) {
			Static163.anIntArray36 = new int[local26];
		}
		@Pc(38) int local38 = arg2 - arg3;
		@Pc(40) int local40 = local38;
		if (local38 < 0) {
			local38 = 0;
		}
		@Pc(49) int local49 = arg5 - arg3;
		@Pc(51) int local51 = local49;
		if (local49 < 0) {
			local49 = 0;
		}
		@Pc(60) int local60 = arg2 + arg3;
		if (super.anInt10004 - 1 < local60) {
			local60 = super.anInt10004 - 1;
		}
		@Pc(79) int local79 = arg3 + arg5;
		if (local79 > super.anInt10007 - 1) {
			local79 = super.anInt10007 - 1;
		}
		Static351.anInt6269 = 0;
		for (@Pc(98) int local98 = local38; local98 <= local60; local98++) {
			@Pc(107) boolean[] local107 = arg0[local98 - local40];
			for (@Pc(109) int local109 = local49; local109 <= local79; local109++) {
				if (local107[local109 - local51]) {
					Static163.anIntArray36[Static351.anInt6269++] = super.anInt10004 * local109 + local98;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass31_Sub1_7.method7139();
		} else {
			this.aClass31_Sub1_7.method7140((float) arg4);
			this.aClass31_Sub1_7.method7071();
		}
		this.aClass31_Sub1_7.method7060();
		this.aClass31_Sub1_7.method7082((this.anInt4304 & 0x7) != 0);
		this.aClass31_Sub1_7.method7088(false, -1, false);
		this.aClass31_Sub1_7.method7113(this.anInterface15_8, 0);
		for (@Pc(192) int local192 = 0; local192 < this.aClass3_Sub20Array1.length; local192++) {
			this.aClass3_Sub20Array1[local192].method3010(Static163.anIntArray36, Static351.anInt6269);
		}
		@Pc(213) Class42_Sub3 local213 = this.aClass31_Sub1_7.method7168();
		local213.NA(0, -1, 0);
		this.aClass31_Sub1_7.method7128();
		if (!this.aClass244_37.method5571()) {
			@Pc(233) int local233 = this.aClass31_Sub1_7.anInt9133;
			@Pc(237) int local237 = this.aClass31_Sub1_7.anInt9110;
			this.aClass31_Sub1_7.pa(0, local237, this.aClass31_Sub1_7.anInt9106);
			this.aClass31_Sub1_7.method7082(false);
			this.aClass31_Sub1_7.method7058(false);
			this.aClass31_Sub1_7.method7115(128);
			this.aClass31_Sub1_7.method7088(false, -2, false);
			this.aClass31_Sub1_7.method7129(this.aClass31_Sub1_7.anInterface24_3);
			this.aClass31_Sub1_7.method7136(Static514.aClass266_6, Static486.aClass266_5);
			this.aClass31_Sub1_7.method7155(0, Static438.aClass179_14);
			this.aClass31_Sub1_7.method7185(Static138.aClass179_11, 0);
			for (@Pc(303) Class3 local303 = this.aClass244_37.method5572(); local303 != null; local303 = this.aClass244_37.method5576()) {
				@Pc(308) Class3_Sub25 local308 = (Class3_Sub25) local303;
				local308.method3363(arg2, arg3, arg5, arg0);
			}
			this.aClass31_Sub1_7.method7155(0, Static402.aClass179_23);
			this.aClass31_Sub1_7.method7185(Static402.aClass179_23, 0);
			this.aClass31_Sub1_7.method7129(null);
			this.aClass31_Sub1_7.pa(local233, local237, this.aClass31_Sub1_7.anInt9106);
		}
		if (this.aClass209_1 == null) {
			return;
		}
		this.aClass31_Sub1_7.method7113(this.anInterface15_8, 0);
		this.aClass31_Sub1_7.method7113(this.anInterface15_7, 1);
		this.aClass31_Sub1_7.method7149(this.aClass1_13);
		this.aClass209_1.method4917(arg3, arg5, arg1, arg0, arg2);
		return;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!wp;II)V")
	private void method3472(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray6[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (Static329.anIntArray317.length < local22) {
			Static571.anIntArray568 = new int[local22];
			Static329.anIntArray317 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static329.anIntArray317[local38] = local12[local38] >> this.aClass31_Sub1_7.anInt9130;
			Static571.anIntArray568[local38] = local19[local38] >> this.aClass31_Sub1_7.anInt9130;
		}
		@Pc(70) int local70 = 0;
		while (local70 < local22) {
			@Pc(76) int local76 = Static329.anIntArray317[local70];
			@Pc(81) int local81 = Static571.anIntArray568[local70++];
			@Pc(85) int local85 = Static329.anIntArray317[local70];
			@Pc(90) int local90 = Static571.anIntArray568[local70++];
			@Pc(94) int local94 = Static329.anIntArray317[local70];
			@Pc(99) int local99 = Static571.anIntArray568[local70++];
			if ((local90 - local99) * (-local85 + local76) - (local90 - local81) * (-local85 + local94) > 0) {
				arg1.method8143(local76, local81, local90, local85, local94, local99);
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass209_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass31_Sub1_7.anInt9143 * arg2 >> 8) >> this.aClass31_Sub1_7.anInt9130;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass31_Sub1_7.anInt9118 >> 8) >> this.aClass31_Sub1_7.anInt9130;
			this.aClass209_1.method4922(arg0, local23, local38);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7865(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4318 <= 0) {
			return;
		}
		@Pc(19) Interface2 local19 = this.aClass31_Sub1_7.method7119(this.anInt4306);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7292();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass31_Sub1_7.method7154(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.a()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt10004 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray4[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 < local23) {
											local23 = local90;
										}
										local21++;
										local44.e(local90);
										if (local25 < local90) {
											local25 = local90;
										}
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt10004;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray4[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local21++;
										if (local23 > local90) {
											local23 = local90;
										}
										local44.c(local90);
										if (local25 < local90) {
											local25 = local90;
										}
									}
								}
							}
							local57++;
						}
					}
				}
				local44.c();
				if (local19.method7291()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass31_Sub1_7.method7086();
		this.aClass31_Sub1_7.method7157(false);
		this.aClass31_Sub1_7.method7082(false);
		this.aClass31_Sub1_7.method7167(false);
		this.aClass31_Sub1_7.method7058(false);
		this.aClass31_Sub1_7.method7115(0);
		this.aClass31_Sub1_7.method7088(false, -2, false);
		this.aClass31_Sub1_7.method7129(null);
		@Pc(274) Class42_Sub3 local274 = this.aClass31_Sub1_7.method7168();
		@Pc(279) float[] local279 = this.aClass31_Sub1_7.method7151();
		local279[7] = 0.0F;
		local279[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass31_Sub1_7.anInt9092) - 1.0F;
		local279[4] = 0.0F;
		local279[10] = 1.0F / (this.aFloat111 - this.aFloat112);
		local279[0] = (float) 1024 / ((float) super.anInt10009 * 128.0F * (float) this.aClass31_Sub1_7.anInt9092);
		local279[15] = 1.0F;
		local279[11] = 0.0F;
		local279[3] = 0.0F;
		local279[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass31_Sub1_7.anInt8992;
		local279[9] = 0.0F;
		local279[2] = 0.0F;
		local279[5] = (float) 1024 / ((float) this.aClass31_Sub1_7.anInt8992 * (float) super.anInt10009 * 128.0F);
		local279[6] = 0.0F;
		local279[14] = -this.aFloat112 / (this.aFloat111 - this.aFloat112);
		local279[8] = 0.0F;
		local279[1] = 0.0F;
		local274.method7521(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.aClass31_Sub1_7.method7097();
		this.aClass31_Sub1_7.method7128();
		if ((this.anInt4304 & 0x7) == 0) {
			this.aClass31_Sub1_7.method7082(false);
		} else {
			this.aClass31_Sub1_7.method7082(true);
			this.aClass31_Sub1_7.method7114();
		}
		this.aClass31_Sub1_7.method7162(false);
		this.aClass31_Sub1_7.method7113(this.anInterface15_8, 0);
		this.aClass31_Sub1_7.method7113(this.anInterface15_7, 1);
		this.aClass31_Sub1_7.method7149(this.aClass1_13);
		this.aClass31_Sub1_7.method7174(Static486.aClass265_10, local25 + 1 - local23, local19, 0, local21 / 3, local23);
		this.aClass31_Sub1_7.method7162(true);
	}

	@OriginalMember(owner = "client!hm", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt4318 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt10004 + 1][super.anInt10007 + 1];
			for (@Pc(20) int local20 = 1; super.anInt10004 > local20; local20++) {
				for (@Pc(24) int local24 = 1; local24 < super.anInt10007; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray22[local20][local24 + 1] >> 3) + (this.aByteArrayArray22[local20 - 1][local24] >> 2) + (this.aByteArrayArray22[local20 + 1][local24] >> 3) + (this.aByteArrayArray22[local20][local24 + -1] >> 2) + (this.aByteArrayArray22[local20][local24] >> 1));
				}
			}
			@Pc(108) Class3_Sub20[] local108 = new Class3_Sub20[this.aClass297_15.method6528()];
			this.aClass297_15.method6536(local108);
			for (@Pc(116) int local116 = 0; local116 < local108.length; local116++) {
				local108[local116].method3004(this.anInt4318);
			}
			@Pc(136) int local136 = 20;
			if (this.anIntArrayArrayArray5 != null) {
				local136 += 4;
			}
			if ((this.anInt4304 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass31_Sub1_7.aNativeHeap6.a(this.anInt4318 * 4, false);
			@Pc(166) NativeHeapBuffer local166 = this.aClass31_Sub1_7.aNativeHeap6.a(this.anInt4318 * local136, false);
			@Pc(171) Stream local171 = new Stream(local166);
			@Pc(176) Stream local176 = new Stream(local156);
			@Pc(180) Class3_Sub20[] local180 = new Class3_Sub20[this.anInt4318];
			@Pc(187) int local187 = Static49.method1209(this.anInt4318 / 4);
			if (local187 < 1) {
				local187 = 1;
			}
			@Pc(199) Class297 local199 = new Class297(local187);
			@Pc(203) Class3_Sub20[] local203 = new Class3_Sub20[this.anInt4319];
			@Pc(209) int local209;
			for (@Pc(205) int local205 = 0; local205 < super.anInt10004; local205++) {
				for (local209 = 0; super.anInt10007 > local209; local209++) {
					if (this.anIntArrayArrayArray4[local205][local209] != null) {
						@Pc(225) Class3_Sub20[] local225 = this.aClass3_Sub20ArrayArrayArray1[local205][local209];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray6[local205][local209];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray7[local205][local209];
						@Pc(246) int[] local246 = this.anIntArrayArrayArray3[local205][local209];
						@Pc(253) int[] local253 = this.anIntArrayArrayArray4[local205][local209];
						@Pc(265) int[] local265 = this.anIntArrayArrayArray2 == null ? null : this.anIntArrayArrayArray2[local205][local209];
						if (local246 == null) {
							local246 = local253;
						}
						@Pc(281) int[] local281 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local205][local209];
						@Pc(288) float local288 = this.aFloatArrayArray8[local205][local209];
						@Pc(295) float local295 = this.aFloatArrayArray6[local205][local209];
						@Pc(302) float local302 = this.aFloatArrayArray7[local205][local209];
						@Pc(311) float local311 = this.aFloatArrayArray8[local205][local209 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray6[local205][local209 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray7[local205][local209 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray8[local205 + 1][local209 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray6[local205 + 1][local209 + 1];
						@Pc(362) float local362 = this.aFloatArrayArray7[local205 + 1][local209 + 1];
						@Pc(371) float local371 = this.aFloatArrayArray8[local205 + 1][local209];
						@Pc(380) float local380 = this.aFloatArrayArray6[local205 + 1][local209];
						@Pc(389) float local389 = this.aFloatArrayArray7[local205 + 1][local209];
						@Pc(397) int local397 = local18[local205][local209] & 0xFF;
						@Pc(407) int local407 = local18[local205][local209 + 1] & 0xFF;
						@Pc(419) int local419 = local18[local205 + 1][local209 + 1] & 0xFF;
						@Pc(429) int local429 = local18[local205 + 1][local209] & 0xFF;
						@Pc(431) int local431 = 0;
						@Pc(441) int local441;
						label357: for (@Pc(433) int local433 = 0; local433 < local253.length; local433++) {
							@Pc(439) Class3_Sub20 local439 = local225[local433];
							for (local441 = 0; local441 < local431; local441++) {
								if (local203[local441] == local439) {
									continue label357;
								}
							}
							local203[local431++] = local439;
						}
						@Pc(478) short[] local478 = this.aShortArrayArray4[local205 + super.anInt10004 * local209] = new short[local253.length];
						for (local441 = 0; local441 < local253.length; local441++) {
							@Pc(492) int local492 = (local205 << super.anInt10008) + local232[local441];
							@Pc(501) int local501 = (local209 << super.anInt10008) + local239[local441];
							@Pc(506) int local506 = local492 >> this.anInt4314;
							@Pc(511) int local511 = local501 >> this.anInt4314;
							@Pc(515) int local515 = local253[local441];
							@Pc(519) int local519 = local246[local441];
							@Pc(527) int local527 = local265 == null ? 0 : local265[local441];
							@Pc(545) long local545 = (long) local519 << 48 | (long) local515 << 32 | (long) (local506 << 16) | (long) local511;
							@Pc(549) int local549 = local232[local441];
							@Pc(553) int local553 = local239[local441];
							@Pc(555) byte local555 = 74;
							@Pc(557) int local557 = 0;
							@Pc(559) float local559 = 1.0F;
							@Pc(578) float local578;
							@Pc(584) float local584;
							@Pc(586) float local586;
							@Pc(648) float local648;
							@Pc(582) int local582;
							if (local549 == 0 && local553 == 0) {
								local584 = local295;
								local578 = local288;
								local582 = local555 - local397;
								local586 = local302;
							} else if (local549 == 0 && super.anInt10009 == local553) {
								local578 = local311;
								local582 = local555 - local407;
								local584 = local320;
								local586 = local329;
							} else if (super.anInt10009 == local549 && local553 == super.anInt10009) {
								local582 = local555 - local419;
								local578 = local340;
								local584 = local351;
								local586 = local362;
							} else if (super.anInt10009 == local549 && local553 == 0) {
								local586 = local389;
								local582 = local555 - local429;
								local584 = local380;
								local578 = local371;
							} else {
								@Pc(625) float local625 = (float) local549 / (float) super.anInt10009;
								@Pc(632) float local632 = (float) local553 / (float) super.anInt10009;
								@Pc(640) float local640 = (local371 - local288) * local625 + local288;
								local648 = local295 + (local380 - local295) * local625;
								@Pc(656) float local656 = local625 * (local389 - local302) + local302;
								@Pc(664) float local664 = local311 + (local340 - local311) * local625;
								@Pc(673) float local673 = (local351 - local320) * local625 + local320;
								local584 = local648 + (local673 - local648) * local632;
								local578 = local640 + local632 * (local664 - local640);
								@Pc(698) float local698 = local329 + local625 * (local362 - local329);
								local586 = local656 + local632 * (local698 - local656);
								@Pc(719) int local719 = ((local429 - local397) * local549 >> super.anInt10008) + local397;
								@Pc(731) int local731 = ((local419 - local407) * local549 >> super.anInt10008) + local407;
								local582 = local555 - local719 - (local553 * (local731 - local719) >> super.anInt10008);
							}
							if (local515 != -1) {
								@Pc(780) int local780 = (local515 & 0x7F) * local582 >> 7;
								if (local780 < 2) {
									local780 = 2;
								} else if (local780 > 126) {
									local780 = 126;
								}
								if ((this.anInt4304 & 0x7) == 0) {
									local559 = local586 * this.aClass31_Sub1_7.aFloatArray67[2] + this.aClass31_Sub1_7.aFloatArray67[0] * local578 + local584 * this.aClass31_Sub1_7.aFloatArray67[1];
									local559 = (local559 > 0.0F ? this.aClass31_Sub1_7.aFloat195 : this.aClass31_Sub1_7.aFloat205) * local559 + this.aClass31_Sub1_7.aFloat191;
								}
								local557 = Static422.anIntArray428[local515 & 0xFF80 | local780];
							}
							@Pc(852) Class3 local852 = null;
							if ((this.anInt4309 - 1 & local492) == 0 && (this.anInt4309 - 1 & local501) == 0) {
								local852 = local199.method6531(local545);
							}
							@Pc(888) int local888;
							@Pc(918) int local918;
							if (local852 == null) {
								if (local519 == local515) {
									local918 = local557;
								} else {
									@Pc(928) int local928 = (local519 & 0x7F) * local582 >> 7;
									if (local928 < 2) {
										local928 = 2;
									} else if (local928 > 126) {
										local928 = 126;
									}
									local918 = Static422.anIntArray428[local928 | local519 & 0xFF80];
									if ((this.anInt4304 & 0x7) == 0) {
										@Pc(979) float local979 = local584 * this.aClass31_Sub1_7.aFloatArray67[1] + this.aClass31_Sub1_7.aFloatArray67[0] * local578 + this.aClass31_Sub1_7.aFloatArray67[2] * local586;
										local648 = this.aClass31_Sub1_7.aFloat191 + local559 * (local559 > 0.0F ? this.aClass31_Sub1_7.aFloat195 : this.aClass31_Sub1_7.aFloat205);
										@Pc(1004) int local1004 = local918 >> 16 & 0xFF;
										@Pc(1010) int local1010 = local918 >> 8 & 0xFF;
										@Pc(1014) int local1014 = local918 & 0xFF;
										local1004 = (int) ((float) local1004 * local648);
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										local1010 = (int) ((float) local1010 * local648);
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										local1014 = (int) ((float) local1014 * local648);
										if (local1014 < 0) {
											local1014 = 0;
										} else if (local1014 > 255) {
											local1014 = 255;
										}
										local918 = local1014 | local1004 << 16 | local1010 << 8;
									}
								}
								if (Stream.a()) {
									local171.a((float) local492);
									local171.a((float) (local527 + this.method7860(local501, local492)));
									local171.a((float) local501);
									local171.a((float) local492);
									local171.a((float) local501);
									if (this.anIntArrayArrayArray5 != null) {
										local171.a((float) (local281 == null ? 0 : local281[local441] - 1));
									}
									if ((this.anInt4304 & 0x7) != 0) {
										local171.a(local578);
										local171.a(local584);
										local171.a(local586);
									}
								} else {
									local171.b((float) local492);
									local171.b((float) (local527 + this.method7860(local501, local492)));
									local171.b((float) local501);
									local171.b((float) local492);
									local171.b((float) local501);
									if (this.anIntArrayArrayArray5 != null) {
										local171.b((float) (local281 == null ? 0 : local281[local441] - 1));
									}
									if ((this.anInt4304 & 0x7) != 0) {
										local171.b(local578);
										local171.b(local584);
										local171.b(local586);
									}
								}
								if (this.aClass31_Sub1_7.anInt9122 == 0) {
									local176.b(local918 | 0xFF000000);
								} else {
									local176.d(local918 | 0xFF000000);
								}
								local888 = this.anInt4302++;
								local478[local441] = (short) local888;
								if (local515 != -1) {
									local180[local888] = local225[local441];
								}
								local199.method6537(local545, new Class3_Sub38(local478[local441]));
							} else {
								local478[local441] = ((Class3_Sub38) local852).aShort82;
								local888 = local478[local441] & 0xFFFF;
								if (local515 != -1 && local180[local888].aLong262 > local225[local441].aLong262) {
									local180[local888] = local225[local441];
								}
							}
							for (local918 = 0; local918 < local431; local918++) {
								local203[local918].method3006(local557, local888, local582, local559);
							}
							this.anInt4306++;
						}
					}
				}
			}
			for (local209 = 0; local209 < this.anInt4302; local209++) {
				@Pc(1297) Class3_Sub20 local1297 = local180[local209];
				if (local1297 != null) {
					local1297.method3005(local209);
				}
			}
			@Pc(1318) int local1318;
			@Pc(1336) int local1336;
			for (@Pc(1314) int local1314 = 0; super.anInt10004 > local1314; local1314++) {
				for (local1318 = 0; super.anInt10007 > local1318; local1318++) {
					@Pc(1330) short[] local1330 = this.aShortArrayArray4[local1314 + local1318 * super.anInt10004];
					if (local1330 != null) {
						@Pc(1334) int local1334 = 0;
						local1336 = 0;
						while (local1330.length > local1336) {
							@Pc(1345) int local1345 = local1330[local1336++] & 0xFFFF;
							@Pc(1352) int local1352 = local1330[local1336++] & 0xFFFF;
							@Pc(1359) int local1359 = local1330[local1336++] & 0xFFFF;
							@Pc(1363) Class3_Sub20 local1363 = local180[local1345];
							@Pc(1367) Class3_Sub20 local1367 = local180[local1352];
							@Pc(1371) Class3_Sub20 local1371 = local180[local1359];
							@Pc(1373) Class3_Sub20 local1373 = null;
							if (local1363 != null) {
								local1373 = local1363;
								local1363.method3003(local1334, local1318, local1314);
							}
							if (local1367 != null) {
								local1367.method3003(local1334, local1318, local1314);
								if (local1373 == null || local1367.aLong262 < local1373.aLong262) {
									local1373 = local1367;
								}
							}
							if (local1371 != null) {
								local1371.method3003(local1334, local1318, local1314);
								if (local1373 == null || local1371.aLong262 < local1373.aLong262) {
									local1373 = local1371;
								}
							}
							if (local1373 != null) {
								if (local1363 != null) {
									local1373.method3005(local1345);
								}
								if (local1367 != null) {
									local1373.method3005(local1352);
								}
								if (local1371 != null) {
									local1373.method3005(local1359);
								}
								local1373.method3003(local1334, local1318, local1314);
							}
							local1334++;
						}
					}
				}
			}
			local171.c();
			local176.c();
			this.anInterface15_7 = this.aClass31_Sub1_7.method7132(false);
			this.anInterface15_7.method5278(local156, 4, this.anInt4302 * 4);
			this.anInterface15_8 = this.aClass31_Sub1_7.method7132(false);
			this.anInterface15_8.method5278(local166, local136, local136 * this.anInt4302);
			if ((this.anInt4304 & 0x7) == 0) {
				if (this.anIntArrayArrayArray5 == null) {
					this.aClass1_13 = this.aClass31_Sub1_7.method7116(new Class90[] { new Class90(new Class156[] { Static248.aClass156_1, Static248.aClass156_5 }), new Class90(Static248.aClass156_3) });
				} else {
					this.aClass1_13 = this.aClass31_Sub1_7.method7116(new Class90[] { new Class90(new Class156[] { Static248.aClass156_1, Static248.aClass156_5, Static248.aClass156_4 }), new Class90(Static248.aClass156_3) });
				}
			} else if (this.anIntArrayArrayArray5 == null) {
				this.aClass1_13 = this.aClass31_Sub1_7.method7116(new Class90[] { new Class90(new Class156[] { Static248.aClass156_1, Static248.aClass156_5, Static248.aClass156_2 }), new Class90(Static248.aClass156_3) });
			} else {
				this.aClass1_13 = this.aClass31_Sub1_7.method7116(new Class90[] { new Class90(new Class156[] { Static248.aClass156_1, Static248.aClass156_5, Static248.aClass156_4, Static248.aClass156_2 }), new Class90(Static248.aClass156_3) });
			}
			local1318 = 0;
			for (@Pc(1676) int local1676 = 0; local1676 < local108.length; local1676++) {
				if (local108[local1676].anInt3715 > 0) {
					local108[local1318++] = local108[local1676];
				}
			}
			this.aClass3_Sub20Array1 = new Class3_Sub20[local1318];
			@Pc(1706) long[] local1706 = new long[local1318];
			for (local1336 = 0; local1336 < local1318; local1336++) {
				@Pc(1714) Class3_Sub20 local1714 = local108[local1336];
				local1706[local1336] = local1714.aLong262;
				this.aClass3_Sub20Array1[local1336] = local1714;
				local1714.method3007(this.anInt4302);
			}
			Static11.method7280(this.aClass3_Sub20Array1, local1706);
			if (this.aClass209_1 != null) {
				this.aClass209_1.method4915();
			}
		} else {
			this.aClass209_1 = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.aClass297_15 = null;
		this.aByteArrayArray22 = null;
		this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray7 = null;
		this.aClass3_Sub20ArrayArrayArray1 = null;
		this.anIntArrayArrayArray4 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray3 = null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
	@Override
	public void method7868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray22[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!hm", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass209_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass31_Sub1_7.anInt9143 * arg2 >> 8) >> this.aClass31_Sub1_7.anInt9130;
			@Pc(39) int local39 = arg3 - (this.aClass31_Sub1_7.anInt9118 * arg2 >> 8) >> this.aClass31_Sub1_7.anInt9130;
			this.aClass209_1.method4921(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!hm", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[super.anInt10004][super.anInt10007][];
		}
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt10004][super.anInt10007][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray4[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub20[] local88 = this.aClass3_Sub20ArrayArrayArray1[arg0][arg1] = new Class3_Sub20[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class3 local125;
			for (local125 = this.aClass297_15.method6531(local119); local125 != null; local125 = this.aClass297_15.method6538()) {
				@Pc(130) Class3_Sub20 local130 = (Class3_Sub20) local125;
				if (arg8[local90] == local130.anInt3714 && local130.aFloat105 == (float) arg9[local90] && arg10 == local130.anInt3706 && local130.anInt3708 == arg11 && arg12 == local130.anInt3716) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub20(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass297_15.method6537(local119, local88[local90]);
			} else {
				local88[local90] = (Class3_Sub20) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray21[arg0][arg1] = (byte) (this.aByteArrayArray21[arg0][arg1] | 0x1);
		}
		if (this.anInt4319 < arg6.length) {
			this.anInt4319 = arg6.length;
		}
		this.anInt4318 += arg6.length;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3470(arg3, arg4, arg0, arg2, -1, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method3470(arg3, arg4, arg0, arg2, arg5, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!cp;[I)V")
	@Override
	public void method7866(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass244_37.method5570(new Class3_Sub25(this.aClass31_Sub1_7, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub3 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub3 arg2) {
		if ((this.aByteArrayArray21[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt10009 >> this.aClass31_Sub1_7.anInt9130;
		@Pc(27) Class3_Sub7_Sub3_Sub2 local27 = (Class3_Sub7_Sub3_Sub2) arg2;
		@Pc(37) Class3_Sub7_Sub3_Sub2 local37;
		if (local27 != null && local27.method8142(local24, local24)) {
			local37 = local27;
			local27.method8144();
		} else {
			local37 = new Class3_Sub7_Sub3_Sub2(this.aClass31_Sub1_7, local24, local24);
		}
		local37.method8146(local24, 0, local24, 0);
		this.method3472(arg0, local37, arg1);
		return local37;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7863(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass209_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass31_Sub1_7.anInt9143 >> 8) >> this.aClass31_Sub1_7.anInt9130;
			@Pc(39) int local39 = arg3 - (this.aClass31_Sub1_7.anInt9118 * arg2 >> 8) >> this.aClass31_Sub1_7.anInt9130;
			return this.aClass209_1.method4919(local39, arg0, local24);
		}
	}
}
