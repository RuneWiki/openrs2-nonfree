import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class162_Sub2 extends Class162 {

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
	private int anInt4152;

	@OriginalMember(owner = "client!mr", name = "S", descriptor = "I")
	private int anInt4161;

	@OriginalMember(owner = "client!mr", name = "Z", descriptor = "Lclient!nn;")
	private Interface11 anInterface11_4;

	@OriginalMember(owner = "client!mr", name = "ab", descriptor = "Lclient!hf;")
	private Class100 aClass100_6;

	@OriginalMember(owner = "client!mr", name = "bb", descriptor = "Lclient!hf;")
	public Class100 aClass100_7;

	@OriginalMember(owner = "client!mr", name = "fb", descriptor = "[Lclient!wf;")
	private Class2_Sub43[] aClass2_Sub43Array1;

	@OriginalMember(owner = "client!mr", name = "hb", descriptor = "I")
	private int anInt4164;

	@OriginalMember(owner = "client!mr", name = "jb", descriptor = "I")
	private int anInt4165;

	@OriginalMember(owner = "client!mr", name = "kb", descriptor = "Lclient!hf;")
	public Class100 aClass100_8;

	@OriginalMember(owner = "client!mr", name = "lb", descriptor = "Lclient!hf;")
	public Class100 lb;

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "Lclient!mg;")
	private final Class156 aClass156_32 = new Class156();

	@OriginalMember(owner = "client!mr", name = "N", descriptor = "[[I")
	private final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "Lclient!pg;")
	public final Class163_Sub2 aClass163_Sub2_28;

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "I")
	private final int anInt4156;

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "[[B")
	private final byte[][] aByteArrayArray35;

	@OriginalMember(owner = "client!mr", name = "V", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!mr", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
	private final int anInt4149;

	@OriginalMember(owner = "client!mr", name = "K", descriptor = "I")
	public final int anInt4158;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!mr", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!mr", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!mr", name = "T", descriptor = "[[[Lclient!wf;")
	private Class2_Sub43[][][] aClass2_Sub43ArrayArrayArray1;

	@OriginalMember(owner = "client!mr", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!mr", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!mr", name = "ib", descriptor = "[[B")
	private byte[][] aByteArrayArray36;

	@OriginalMember(owner = "client!mr", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!mr", name = "eb", descriptor = "Lclient!ew;")
	private Class72 aClass72_30;

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "Lclient!pn;")
	private Class193 aClass193_2;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!pg;IIII[[I[[II)V")
	public Class162_Sub2(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray30 = arg5;
		this.aClass163_Sub2_28 = arg0;
		this.anInt4156 = super.anInt4139 - 2;
		this.aByteArrayArray35 = new byte[arg3][arg4];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray8 = new float[super.anInt4138 + 1][super.anInt4137 + 1];
		this.anInt4149 = 0x1 << this.anInt4156;
		this.anInt4158 = arg2;
		this.aShortArrayArray5 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aClass2_Sub43ArrayArrayArray1 = new Class2_Sub43[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt4138 + 1][super.anInt4137 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt4138 + 1][super.anInt4137 + 1];
		this.aByteArrayArray36 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt4137 > local117; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt4138; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + local139 * local139 + local156 * local156)));
				this.aFloatArrayArray7[local121][local117] = local175 * (float) local139;
				this.aFloatArrayArray6[local121][local117] = (float) (-arg7 * 2) * local175;
				this.aFloatArrayArray8[local121][local117] = (float) local156 * local175;
			}
		}
		this.aClass72_30 = new Class72(128);
		if ((this.anInt4158 & 0x10) != 0) {
			this.aClass193_2 = new Class193(this.aClass163_Sub2_28, this);
		}
	}

	@OriginalMember(owner = "client!mr", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass193_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass163_Sub2_28.anInt5256 >> 8) >> this.aClass163_Sub2_28.anInt5220;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass163_Sub2_28.anInt5262 >> 8) >> this.aClass163_Sub2_28.anInt5220;
			this.aClass193_2.method4245(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!mr", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt4138][super.anInt4137][];
		}
		if (arg3 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt4138][super.anInt4137][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub43[] local88 = this.aClass2_Sub43ArrayArrayArray1[arg0][arg1] = new Class2_Sub43[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
			@Pc(125) Class2 local125;
			for (local125 = this.aClass72_30.method1659(local119); local125 != null; local125 = this.aClass72_30.method1657()) {
				@Pc(130) Class2_Sub43 local130 = (Class2_Sub43) local125;
				if (arg8[local90] == local130.anInt7128 && local130.aFloat105 == (float) arg9[local90] && arg10 == local130.anInt7124 && local130.anInt7131 == arg11 && arg12 == local130.anInt7126) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub43(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass72_30.method1653(local88[local90], local119);
			} else {
				local88[local90] = (Class2_Sub43) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray35[arg0][arg1] = (byte) (this.aByteArrayArray35[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt4164) {
			this.anInt4164 = arg6.length;
		}
		this.anInt4165 += arg6.length;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3281(arg3, arg1, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!sa;[I)V")
	@Override
	public void method3274(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass156_32.method3157(new Class2_Sub26(this.aClass163_Sub2_28, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I[[ZIIIZI)V")
	private void method3281(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (this.aClass2_Sub43Array1 == null) {
			return;
		}
		@Pc(14) float local14 = this.aClass163_Sub2_28.aFloat72;
		@Pc(18) float local18 = this.aClass163_Sub2_28.aFloat76;
		@Pc(24) int local24 = arg3 + arg3 + 1;
		@Pc(28) int local28 = local24 * local24;
		if (local28 > this.aClass163_Sub2_28.anIntArray427.length) {
			this.aClass163_Sub2_28.anIntArray427 = new int[local28];
		}
		if (this.anInt4161 * 2 > this.aClass163_Sub2_28.aClass2_Sub13_Sub1_3.aByteArray52.length) {
			this.aClass163_Sub2_28.aClass2_Sub13_Sub1_3 = new Class2_Sub13_Sub1(this.anInt4161 * 2);
		}
		@Pc(68) int local68 = arg2 - arg3;
		@Pc(70) int local70 = local68;
		if (local68 < 0) {
			local68 = 0;
		}
		@Pc(82) int local82 = arg1 - arg3;
		@Pc(84) int local84 = local82;
		if (local82 < 0) {
			local82 = 0;
		}
		@Pc(95) int local95 = arg3 + arg2;
		if (local95 > super.anInt4138 - 1) {
			local95 = super.anInt4138 - 1;
		}
		@Pc(114) int local114 = arg1 + arg3;
		if (super.anInt4137 - 1 < local114) {
			local114 = super.anInt4137 - 1;
		}
		@Pc(127) int local127 = 0;
		@Pc(131) int[] local131 = this.aClass163_Sub2_28.anIntArray427;
		@Pc(144) int local144;
		for (@Pc(133) int local133 = local68; local133 <= local95; local133++) {
			@Pc(142) boolean[] local142 = arg0[local133 - local70];
			for (local144 = local82; local144 <= local114; local144++) {
				if (local142[local144 - local84]) {
					local131[local127++] = local133 + super.anInt4138 * local144;
				}
			}
		}
		this.aClass163_Sub2_28.method4171();
		this.aClass163_Sub2_28.method4177((this.anInt4158 & 0x7) != 0);
		for (@Pc(211) int local211 = 0; local211 < this.aClass2_Sub43Array1.length; local211++) {
			this.aClass2_Sub43Array1[local211].method5608(local127, local131);
		}
		if (!this.aClass156_32.method3153()) {
			local144 = this.aClass163_Sub2_28.anInt5253;
			@Pc(244) int local244 = this.aClass163_Sub2_28.anInt5241;
			this.aClass163_Sub2_28.Q(0, local244, this.aClass163_Sub2_28.anInt5245);
			this.aClass163_Sub2_28.da(local18, local14 - 4.0F);
			this.aClass163_Sub2_28.method4177(false);
			this.aClass163_Sub2_28.method4166(false);
			this.aClass163_Sub2_28.method4174(128);
			this.aClass163_Sub2_28.method4139(-2);
			this.aClass163_Sub2_28.method4118(this.aClass163_Sub2_28.aClass20_Sub1_5);
			this.aClass163_Sub2_28.method4164(8448, 7681);
			this.aClass163_Sub2_28.method4181(0, 770, 34166);
			this.aClass163_Sub2_28.method4135(0, 34167);
			for (@Pc(311) Class2 local311 = this.aClass156_32.method3155(); local311 != null; local311 = this.aClass156_32.method3150()) {
				@Pc(316) Class2_Sub26 local316 = (Class2_Sub26) local311;
				local316.method2554(arg0, arg3, arg1, arg2);
			}
			this.aClass163_Sub2_28.method4181(0, 768, 5890);
			this.aClass163_Sub2_28.method4135(0, 5890);
			this.aClass163_Sub2_28.method4118(null);
			this.aClass163_Sub2_28.Q(local144, local244, this.aClass163_Sub2_28.anInt5245);
		}
		if (this.aClass193_2 != null) {
			this.aClass163_Sub2_28.da(local18, local14 - 8.0F);
			this.aClass163_Sub2_28.method4171();
			this.aClass163_Sub2_28.method4114(this.lb, null, null, this.aClass100_7);
			this.aClass193_2.method4244(arg0, arg1, arg2, arg3, arg4);
		}
		this.aClass163_Sub2_28.da(local18, local14);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.pa(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!mr", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray36[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray36[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!ok;III)V")
	private void method3282(@OriginalArg(0) Class2_Sub5_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray5[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (this.aClass163_Sub2_28.anIntArray429.length < local22) {
			this.aClass163_Sub2_28.anIntArray429 = new int[local22];
			this.aClass163_Sub2_28.anIntArray428 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass163_Sub2_28.anIntArray429;
		@Pc(46) int[] local46 = this.aClass163_Sub2_28.anIntArray428;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = (local12[local48] & 0xFF) >> this.aClass163_Sub2_28.anInt5220;
			local46[local48] = (local19[local48] & 0xFF) >> this.aClass163_Sub2_28.anInt5220;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(92) int local92 = local42[local84];
			@Pc(97) int local97 = local46[local84++];
			@Pc(101) int local101 = local42[local84];
			@Pc(106) int local106 = local46[local84++];
			@Pc(110) int local110 = local42[local84];
			@Pc(115) int local115 = local46[local84++];
			if ((local92 - local101) * (local106 - local115) - (local110 - local101) * (local106 - local97) > 0) {
				arg0.method3839(local97, local115, local92, local101, local106, local110);
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		if (this.anInt4165 <= 0) {
			this.aClass193_2 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt4138 + 1][super.anInt4137 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; local25 < super.anInt4138; local25++) {
				for (local29 = 1; super.anInt4137 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray36[local25][local29] >> 1) + (this.aByteArrayArray36[local25][local29 + 1] >> 3) + (this.aByteArrayArray36[local25 + -1][local29] >> 2) + (this.aByteArrayArray36[local25 - -1][local29] >> 3) + (this.aByteArrayArray36[local25][local29 - 1] >> 2));
				}
			}
			this.aClass2_Sub43Array1 = new Class2_Sub43[this.aClass72_30.method1652()];
			this.aClass72_30.method1656(this.aClass2_Sub43Array1);
			for (local29 = 0; local29 < this.aClass2_Sub43Array1.length; local29++) {
				this.aClass2_Sub43Array1[local29].method5610(this.anInt4165);
			}
			@Pc(141) int local141 = 24;
			if (this.anIntArrayArrayArray4 != null) {
				local141 += 4;
			}
			if ((this.anInt4158 & 0x7) != 0) {
				local141 += 12;
			}
			@Pc(160) NativeBuffer local160 = this.aClass163_Sub2_28.aNativeHeap2.a(local141 * this.anInt4165);
			@Pc(165) NativeStream local165 = new NativeStream(local160);
			@Pc(169) Class2_Sub43[] local169 = new Class2_Sub43[this.anInt4165];
			@Pc(176) int local176 = Static295.method3927(this.anInt4165 / 4);
			if (local176 < 1) {
				local176 = 1;
			}
			@Pc(186) Class72 local186 = new Class72(local176);
			@Pc(190) Class2_Sub43[] local190 = new Class2_Sub43[this.anInt4164];
			@Pc(196) int local196;
			for (@Pc(192) int local192 = 0; local192 < super.anInt4138; local192++) {
				for (local196 = 0; local196 < super.anInt4137; local196++) {
					if (this.anIntArrayArrayArray8[local192][local196] != null) {
						@Pc(212) Class2_Sub43[] local212 = this.aClass2_Sub43ArrayArrayArray1[local192][local196];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray6[local192][local196];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray5[local192][local196];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray3[local192][local196];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray8[local192][local196];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local192][local196];
						if (local233 == null) {
							local233 = local240;
						}
						@Pc(268) int[] local268 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local192][local196];
						@Pc(275) float local275 = this.aFloatArrayArray7[local192][local196];
						@Pc(282) float local282 = this.aFloatArrayArray6[local192][local196];
						@Pc(289) float local289 = this.aFloatArrayArray8[local192][local196];
						@Pc(298) float local298 = this.aFloatArrayArray7[local192][local196 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray6[local192][local196 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray8[local192][local196 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray7[local192 + 1][local196 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray6[local192 + 1][local196 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray8[local192 + 1][local196 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray7[local192 + 1][local196];
						@Pc(367) float local367 = this.aFloatArrayArray6[local192 + 1][local196];
						@Pc(376) float local376 = this.aFloatArrayArray8[local192 + 1][local196];
						@Pc(384) int local384 = local23[local192][local196] & 0xFF;
						@Pc(394) int local394 = local23[local192][local196 + 1] & 0xFF;
						@Pc(406) int local406 = local23[local192 + 1][local196 + 1] & 0xFF;
						@Pc(416) int local416 = local23[local192 + 1][local196] & 0xFF;
						@Pc(418) int local418 = 0;
						@Pc(428) int local428;
						label335: for (@Pc(420) int local420 = 0; local420 < local240.length; local420++) {
							@Pc(426) Class2_Sub43 local426 = local212[local420];
							for (local428 = 0; local428 < local418; local428++) {
								if (local426 == local190[local428]) {
									continue label335;
								}
							}
							local190[local418++] = local426;
						}
						@Pc(473) short[] local473 = this.aShortArrayArray5[super.anInt4138 * local196 + local192] = new short[local240.length];
						for (local428 = 0; local428 < local240.length; local428++) {
							@Pc(486) int local486 = (local192 << super.anInt4139) + local219[local428];
							@Pc(496) int local496 = (local196 << super.anInt4139) + local226[local428];
							@Pc(501) int local501 = local486 >> this.anInt4156;
							@Pc(506) int local506 = local496 >> this.anInt4156;
							@Pc(510) int local510 = local240[local428];
							@Pc(514) int local514 = local233[local428];
							@Pc(522) int local522 = local252 == null ? 0 : local252[local428];
							@Pc(540) long local540 = (long) local506 | (long) (local501 << 16) | (long) local514 << 48 | (long) local510 << 32;
							@Pc(544) int local544 = local219[local428];
							@Pc(548) int local548 = local226[local428];
							@Pc(550) byte local550 = 74;
							@Pc(552) int local552 = 0;
							@Pc(563) float local563;
							@Pc(569) float local569;
							@Pc(561) float local561;
							@Pc(637) float local637;
							@Pc(567) int local567;
							if (local544 == 0 && local548 == 0) {
								local561 = local289;
								local563 = local275;
								local567 = local550 - local384;
								local569 = local282;
							} else if (local544 == 0 && super.anInt4134 == local548) {
								local567 = local550 - local394;
								local563 = local298;
								local561 = local316;
								local569 = local307;
							} else if (local544 == super.anInt4134 && super.anInt4134 == local548) {
								local563 = local327;
								local569 = local338;
								local567 = local550 - local406;
								local561 = local349;
							} else if (super.anInt4134 == local544 && local548 == 0) {
								local563 = local358;
								local567 = local550 - local416;
								local569 = local367;
								local561 = local376;
							} else {
								@Pc(613) float local613 = (float) local544 / (float) super.anInt4134;
								@Pc(620) float local620 = (float) local548 / (float) super.anInt4134;
								@Pc(628) float local628 = local613 * (local358 - local275) + local275;
								local637 = (local367 - local282) * local613 + local282;
								@Pc(646) float local646 = local289 + (local376 - local289) * local613;
								@Pc(654) float local654 = local298 + (local327 - local298) * local613;
								@Pc(663) float local663 = local307 + (local338 - local307) * local613;
								local569 = (local663 - local637) * local620 + local637;
								@Pc(679) float local679 = local316 + (local349 - local316) * local613;
								local563 = (local654 - local628) * local620 + local628;
								local561 = (local679 - local646) * local620 + local646;
								@Pc(707) int local707 = local384 + ((local416 - local384) * local544 >> super.anInt4139);
								@Pc(719) int local719 = local394 + ((local406 - local394) * local544 >> super.anInt4139);
								local567 = local550 - local707 - (local548 * (local719 - local707) >> super.anInt4139);
							}
							@Pc(760) float local760 = 1.0F;
							if (local510 != -1) {
								@Pc(772) int local772 = local567 * (local510 & 0x7F) >> 7;
								if (local772 < 2) {
									local772 = 2;
								} else if (local772 > 126) {
									local772 = 126;
								}
								local552 = Static237.anIntArray330[local510 & 0xFF80 | local772];
								if ((this.anInt4158 & 0x7) == 0) {
									local760 = local569 * this.aClass163_Sub2_28.aFloatArray27[1] + this.aClass163_Sub2_28.aFloatArray27[0] * local563 + this.aClass163_Sub2_28.aFloatArray27[2] * local561;
									local760 = (local760 > 0.0F ? this.aClass163_Sub2_28.aFloat59 : this.aClass163_Sub2_28.aFloat58) * local760 + this.aClass163_Sub2_28.aFloat60;
								}
							}
							@Pc(845) Class2 local845 = null;
							if ((this.anInt4149 - 1 & local486) == 0 && (local496 & this.anInt4149 - 1) == 0) {
								local845 = local186.method1659(local540);
							}
							@Pc(1201) int local1201;
							@Pc(899) int local899;
							if (local845 == null) {
								if (local514 == local510) {
									local899 = local552;
								} else {
									@Pc(877) int local877 = local567 * (local514 & 0x7F) >> 7;
									if (local877 < 2) {
										local877 = 2;
									} else if (local877 > 126) {
										local877 = 126;
									}
									local899 = Static237.anIntArray330[local877 | local514 & 0xFF80];
									if ((this.anInt4158 & 0x7) == 0) {
										@Pc(930) float local930 = local563 * this.aClass163_Sub2_28.aFloatArray27[0] + this.aClass163_Sub2_28.aFloatArray27[1] * local569 + this.aClass163_Sub2_28.aFloatArray27[2] * local561;
										local637 = this.aClass163_Sub2_28.aFloat60 + (local760 > 0.0F ? this.aClass163_Sub2_28.aFloat59 : this.aClass163_Sub2_28.aFloat58) * local760;
										@Pc(955) int local955 = local899 >> 16 & 0xFF;
										@Pc(961) int local961 = local899 >> 8 & 0xFF;
										@Pc(965) int local965 = local899 & 0xFF;
										local955 = (int) ((float) local955 * local637);
										if (local955 < 0) {
											local955 = 0;
										} else if (local955 > 255) {
											local955 = 255;
										}
										local961 = (int) ((float) local961 * local637);
										local965 = (int) ((float) local965 * local637);
										if (local961 < 0) {
											local961 = 0;
										} else if (local961 > 255) {
											local961 = 255;
										}
										if (local965 < 0) {
											local965 = 0;
										} else if (local965 > 255) {
											local965 = 255;
										}
										local899 = local961 << 8 | local955 << 16 | local965;
									}
								}
								if (this.aClass163_Sub2_28.aBoolean374) {
									local165.a((float) local486);
									local165.a((float) (this.ca(local486, local496) + local522));
									local165.a((float) local496);
									local165.a((byte) (local899 >> 16));
									local165.a((byte) (local899 >> 8));
									local165.a((byte) local899);
									local165.a(-1);
									local165.a((float) local486);
									local165.a((float) local496);
									if (this.anIntArrayArrayArray4 != null) {
										local165.a((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt4158 & 0x7) != 0) {
										local165.a(local563);
										local165.a(local569);
										local165.a(local561);
									}
								} else {
									local165.b((float) local486);
									local165.b((float) (local522 + this.ca(local486, local496)));
									local165.b((float) local496);
									local165.a((byte) (local899 >> 16));
									local165.a((byte) (local899 >> 8));
									local165.a((byte) local899);
									local165.a(-1);
									local165.b((float) local486);
									local165.b((float) local496);
									if (this.anIntArrayArrayArray4 != null) {
										local165.b((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt4158 & 0x7) != 0) {
										local165.b(local563);
										local165.b(local569);
										local165.b(local561);
									}
								}
								local1201 = this.anInt4152++;
								local473[local428] = (short) local1201;
								if (local510 != -1) {
									local169[local1201] = local212[local428];
								}
								local186.method1653(new Class2_Sub10(local473[local428]), local540);
							} else {
								local473[local428] = ((Class2_Sub10) local845).aShort16;
								local1201 = local473[local428] & 0xFFFF;
								if (local510 != -1 && local169[local1201].aLong225 > local212[local428].aLong225) {
									local169[local1201] = local212[local428];
								}
							}
							for (local899 = 0; local899 < local418; local899++) {
								local190[local899].method5613(local567, local1201, local552, local760);
							}
							this.anInt4161++;
						}
					}
				}
			}
			for (local196 = 0; local196 < this.anInt4152; local196++) {
				@Pc(1322) Class2_Sub43 local1322 = local169[local196];
				if (local1322 != null) {
					local1322.method5614(local196);
				}
			}
			@Pc(1355) int local1355;
			for (@Pc(1335) int local1335 = 0; super.anInt4138 > local1335; local1335++) {
				for (@Pc(1339) int local1339 = 0; super.anInt4137 > local1339; local1339++) {
					@Pc(1351) short[] local1351 = this.aShortArrayArray5[local1335 + super.anInt4138 * local1339];
					if (local1351 != null) {
						local1355 = 0;
						@Pc(1357) int local1357 = 0;
						while (local1351.length > local1357) {
							@Pc(1366) int local1366 = local1351[local1357++] & 0xFFFF;
							@Pc(1373) int local1373 = local1351[local1357++] & 0xFFFF;
							@Pc(1380) int local1380 = local1351[local1357++] & 0xFFFF;
							@Pc(1384) Class2_Sub43 local1384 = local169[local1366];
							@Pc(1388) Class2_Sub43 local1388 = local169[local1373];
							@Pc(1392) Class2_Sub43 local1392 = local169[local1380];
							@Pc(1394) Class2_Sub43 local1394 = null;
							if (local1384 != null) {
								local1384.method5611(local1335, local1339, local1355);
								local1394 = local1384;
							}
							if (local1388 != null) {
								local1388.method5611(local1335, local1339, local1355);
								if (local1394 == null || local1394.aLong225 > local1388.aLong225) {
									local1394 = local1388;
								}
							}
							if (local1392 != null) {
								local1392.method5611(local1335, local1339, local1355);
								if (local1394 == null || local1394.aLong225 > local1392.aLong225) {
									local1394 = local1392;
								}
							}
							if (local1394 != null) {
								if (local1384 != null) {
									local1394.method5614(local1366);
								}
								if (local1388 != null) {
									local1394.method5614(local1373);
								}
								if (local1392 != null) {
									local1394.method5614(local1380);
								}
								local1394.method5611(local1335, local1339, local1355);
							}
							local1355++;
						}
					}
				}
			}
			local165.c();
			this.anInterface11_4 = this.aClass163_Sub2_28.method4162(local165.a(), local141, local160);
			this.aClass100_7 = new Class100(this.anInterface11_4, 5126, 3, 0);
			this.aClass100_6 = new Class100(this.anInterface11_4, 5121, 4, 12);
			@Pc(1523) byte local1523;
			if (this.anIntArrayArrayArray4 == null) {
				local1523 = 24;
				this.lb = new Class100(this.anInterface11_4, 5126, 2, 16);
			} else {
				local1523 = 28;
				this.lb = new Class100(this.anInterface11_4, 5126, 3, 16);
			}
			if ((this.anInt4158 & 0x7) != 0) {
				this.aClass100_8 = new Class100(this.anInterface11_4, 5126, 3, local1523);
			}
			@Pc(1570) long[] local1570 = new long[this.aClass2_Sub43Array1.length];
			for (local1355 = 0; local1355 < this.aClass2_Sub43Array1.length; local1355++) {
				@Pc(1579) Class2_Sub43 local1579 = this.aClass2_Sub43Array1[local1355];
				local1570[local1355] = local1579.aLong225;
				local1579.method5609(this.anInt4152);
			}
			Static371.method4841(this.aClass2_Sub43Array1, local1570);
			if (this.aClass193_2 != null) {
				this.aClass193_2.method4246();
			}
		}
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass72_30 = null;
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray5 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray6 = this.aFloatArrayArray8 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray3 = null;
		this.aByteArrayArray36 = null;
		this.aClass2_Sub43ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!mr", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass193_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass163_Sub2_28.anInt5256 * arg2 >> 8) >> this.aClass163_Sub2_28.anInt5220;
			@Pc(38) int local38 = arg3 - (this.aClass163_Sub2_28.anInt5262 * arg2 >> 8) >> this.aClass163_Sub2_28.anInt5220;
			this.aClass193_2.method4247(local38, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method3273(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass193_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass163_Sub2_28.anInt5256 * arg2 >> 8) >> this.aClass163_Sub2_28.anInt5220;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass163_Sub2_28.anInt5262 >> 8) >> this.aClass163_Sub2_28.anInt5220;
			return this.aClass193_2.method4250(local38, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)V")
	@Override
	public void method3271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3278(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4165 <= 0) {
			return;
		}
		this.aClass163_Sub2_28.method4179();
		this.aClass163_Sub2_28.method4161(false);
		this.aClass163_Sub2_28.method4177(false);
		this.aClass163_Sub2_28.method4157(false);
		this.aClass163_Sub2_28.method4166(false);
		this.aClass163_Sub2_28.method4174(0);
		this.aClass163_Sub2_28.method4139(-2);
		this.aClass163_Sub2_28.method4118(null);
		Static426.aFloatArray34[9] = 0.0F;
		Static426.aFloatArray34[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass163_Sub2_28.anInt5202) - 1.0F;
		Static426.aFloatArray34[14] = 0.0F;
		Static426.aFloatArray34[5] = (float) 1024 / ((float) super.anInt4134 * 128.0F * (float) this.aClass163_Sub2_28.anInt5121);
		Static426.aFloatArray34[7] = 0.0F;
		Static426.aFloatArray34[1] = 0.0F;
		Static426.aFloatArray34[8] = 0.0F;
		Static426.aFloatArray34[10] = 0.0F;
		Static426.aFloatArray34[11] = 0.0F;
		Static426.aFloatArray34[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass163_Sub2_28.anInt5121;
		Static426.aFloatArray34[6] = 0.0F;
		Static426.aFloatArray34[15] = 1.0F;
		Static426.aFloatArray34[3] = 0.0F;
		Static426.aFloatArray34[4] = 0.0F;
		Static426.aFloatArray34[0] = (float) 1024 / ((float) this.aClass163_Sub2_28.anInt5202 * (float) super.anInt4134 * 128.0F);
		Static426.aFloatArray34[2] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static426.aFloatArray34, 0);
		Static426.aFloatArray34[9] = 1.0F;
		Static426.aFloatArray34[3] = 0.0F;
		Static426.aFloatArray34[4] = 0.0F;
		Static426.aFloatArray34[13] = 0.0F;
		Static426.aFloatArray34[7] = 0.0F;
		Static426.aFloatArray34[8] = 0.0F;
		Static426.aFloatArray34[12] = 0.0F;
		Static426.aFloatArray34[2] = 0.0F;
		Static426.aFloatArray34[10] = 0.0F;
		Static426.aFloatArray34[14] = 0.0F;
		Static426.aFloatArray34[11] = 0.0F;
		Static426.aFloatArray34[1] = 0.0F;
		Static426.aFloatArray34[15] = 1.0F;
		Static426.aFloatArray34[0] = 1.0F;
		Static426.aFloatArray34[6] = 1.0F;
		Static426.aFloatArray34[5] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static426.aFloatArray34, 0);
		if ((this.anInt4158 & 0x7) == 0) {
			this.aClass163_Sub2_28.method4177(false);
		} else {
			this.aClass163_Sub2_28.method4177(true);
			this.aClass163_Sub2_28.method4170();
		}
		this.aClass163_Sub2_28.method4114(this.lb, this.aClass100_8, this.aClass100_6, this.aClass100_7);
		if (this.anInt4161 * 2 <= this.aClass163_Sub2_28.aClass2_Sub13_Sub1_3.aByteArray52.length) {
			this.aClass163_Sub2_28.aClass2_Sub13_Sub1_3.anInt4347 = 0;
		} else {
			this.aClass163_Sub2_28.aClass2_Sub13_Sub1_3 = new Class2_Sub13_Sub1(this.anInt4161 * 2);
		}
		@Pc(315) int local315 = 0;
		@Pc(319) Class2_Sub13_Sub1 local319 = this.aClass163_Sub2_28.aClass2_Sub13_Sub1_3;
		@Pc(325) int local325;
		@Pc(335) int local335;
		@Pc(337) int local337;
		@Pc(356) short[] local356;
		@Pc(360) int local360;
		if (this.aClass163_Sub2_28.aBoolean374) {
			for (local325 = arg1; local325 < arg3; local325++) {
				local335 = local325 * super.anInt4138 + arg0;
				for (local337 = arg0; local337 < arg2; local337++) {
					if (arg4[local337 - arg0][local325 - arg1]) {
						local356 = this.aShortArrayArray5[local335];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local315++;
								local319.method3568(local356[local360] & 0xFFFF);
							}
						}
					}
					local335++;
				}
			}
		} else {
			for (local325 = arg1; local325 < arg3; local325++) {
				local335 = super.anInt4138 * local325 + arg0;
				for (local337 = arg0; local337 < arg2; local337++) {
					if (arg4[local337 - arg0][local325 - arg1]) {
						local356 = this.aShortArrayArray5[local335];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local319.method3540(local356[local360] & 0xFFFF);
								local315++;
							}
						}
					}
					local335++;
				}
			}
		}
		if (local315 > 0) {
			@Pc(481) Class83_Sub2 local481 = new Class83_Sub2(this.aClass163_Sub2_28, 5123, local319.aByteArray52, local319.anInt4347);
			this.aClass163_Sub2_28.method4105(0, local481, local315);
		}
	}

	@OriginalMember(owner = "client!mr", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class2_Sub5_Sub7 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub7 arg2) {
		if ((this.aByteArrayArray35[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt4134 >> this.aClass163_Sub2_28.anInt5220;
		@Pc(27) Class2_Sub5_Sub7_Sub1 local27 = (Class2_Sub5_Sub7_Sub1) arg2;
		@Pc(43) Class2_Sub5_Sub7_Sub1 local43;
		if (local27 != null && local27.method3838(local24, local24)) {
			local43 = local27;
			local27.method3836();
		} else {
			local43 = new Class2_Sub5_Sub7_Sub1(this.aClass163_Sub2_28, local24, local24);
		}
		local43.method3834(0, local24, 0, local24);
		this.method3282(local43, arg0, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!mr", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt4139;
		@Pc(13) int local13 = arg1 >> super.anInt4139;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt4138 - 1 || local13 > super.anInt4137 - 1) {
			return 0;
		}
		@Pc(45) int local45 = arg0 & super.anInt4134 - 1;
		@Pc(52) int local52 = arg1 & super.anInt4134 - 1;
		@Pc(78) int local78 = this.anIntArrayArray30[local8][local13] * (super.anInt4134 - local45) + this.anIntArrayArray30[local8 + 1][local13] * local45 >> super.anInt4139;
		@Pc(109) int local109 = local45 * this.anIntArrayArray30[local8 + 1][local13 + 1] + this.anIntArrayArray30[local8][local13 + 1] * (super.anInt4134 - local45) >> super.anInt4139;
		return local52 * local109 + (super.anInt4134 - local52) * local78 >> super.anInt4139;
	}

	@OriginalMember(owner = "client!mr", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray30[arg0][arg1];
	}
}
