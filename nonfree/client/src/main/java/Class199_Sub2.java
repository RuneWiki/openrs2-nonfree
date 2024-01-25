import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class199_Sub2 extends Class199 {

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
	private int anInt6495;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	private int anInt6496;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!mh", name = "cb", descriptor = "Lclient!cl;")
	public Class55 aClass55_11;

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "Lclient!cl;")
	private Class55 aClass55_12;

	@OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
	private int anInt6517;

	@OriginalMember(owner = "client!mh", name = "fb", descriptor = "[Lclient!gf;")
	private Class6_Sub20[] aClass6_Sub20Array1;

	@OriginalMember(owner = "client!mh", name = "gb", descriptor = "Lclient!wia;")
	private Interface27 anInterface27_5;

	@OriginalMember(owner = "client!mh", name = "hb", descriptor = "I")
	private int anInt6518;

	@OriginalMember(owner = "client!mh", name = "ib", descriptor = "Lclient!cl;")
	public Class55 aClass55_13;

	@OriginalMember(owner = "client!mh", name = "kb", descriptor = "Lclient!cl;")
	public Class55 aClass55_14;

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "Lclient!ada;")
	private final Class8 aClass8_35 = new Class8();

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
	private final int anInt6513 = this.anInt10104 - 2;

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "Lclient!wh;")
	public final Class100_Sub3 aClass100_Sub3_33;

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
	public final int anInt6500;

	@OriginalMember(owner = "client!mh", name = "I", descriptor = "[[S")
	public final short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "[[[Lclient!gf;")
	private Class6_Sub20[][][] aClass6_Sub20ArrayArrayArray1;

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray108;

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!mh", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!mh", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
	private final int anInt6502;

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "[[B")
	private final byte[][] aByteArrayArray107;

	@OriginalMember(owner = "client!mh", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!mh", name = "nb", descriptor = "Lclient!he;")
	private Class128 aClass128_22;

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "Lclient!wha;")
	private Class374 aClass374_2;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!wh;IIII[[I[[II)V")
	public Class199_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass100_Sub3_33 = arg0;
		this.anInt6500 = arg2;
		this.aShortArrayArray9 = new short[arg3 * arg4][];
		this.aClass6_Sub20ArrayArrayArray1 = new Class6_Sub20[arg3][arg4][];
		this.aByteArrayArray108 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray9 = new float[super.anInt10111 + 1][super.anInt10110 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray10 = new float[super.anInt10111 + 1][super.anInt10110 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anInt6502 = 0x1 << this.anInt6513;
		this.aByteArrayArray107 = new byte[arg3][arg4];
		this.aFloatArrayArray11 = new float[super.anInt10111 + 1][super.anInt10110 + 1];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt10110; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt10111 > local119; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local137 * local137 + arg7 * 4 * arg7 + local154 * local154)));
				this.aFloatArrayArray9[local119][local115] = local174 * (float) local137;
				this.aFloatArrayArray10[local119][local115] = (float) (-arg7 * 2) * local174;
				this.aFloatArrayArray11[local119][local115] = (float) local154 * local174;
			}
		}
		this.aClass128_22 = new Class128(128);
		if ((this.anInt6500 & 0x10) != 0) {
			this.aClass374_2 = new Class374(this.aClass100_Sub3_33, this);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.U(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIZI[[ZIZ)V")
	private void method5593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[][] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass6_Sub20Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg0 + arg0 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (this.aClass100_Sub3_33.anIntArray639.length < local14) {
			this.aClass100_Sub3_33.anIntArray639 = new int[local14];
		}
		if (this.aClass100_Sub3_33.aClass6_Sub40_Sub1_3.aByteArray113.length < this.anInt6495 * 2) {
			this.aClass100_Sub3_33.aClass6_Sub40_Sub1_3 = new Class6_Sub40_Sub1(this.anInt6495 * 2);
		}
		@Pc(53) int local53 = arg1 - arg0;
		@Pc(55) int local55 = local53;
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(64) int local64 = arg6 - arg0;
		@Pc(66) int local66 = local64;
		if (local64 < 0) {
			local64 = 0;
		}
		@Pc(74) int local74 = arg1 + arg0;
		if (super.anInt10111 - 1 < local74) {
			local74 = super.anInt10111 - 1;
		}
		@Pc(93) int local93 = arg0 + arg6;
		if (local93 > super.anInt10110 - 1) {
			local93 = super.anInt10110 - 1;
		}
		@Pc(106) int local106 = 0;
		@Pc(110) int[] local110 = this.aClass100_Sub3_33.anIntArray639;
		@Pc(123) int local123;
		for (@Pc(112) int local112 = local53; local112 <= local74; local112++) {
			@Pc(121) boolean[] local121 = arg5[local112 - local55];
			for (local123 = local64; local123 <= local93; local123++) {
				if (local121[local123 - local66]) {
					local110[local106++] = super.anInt10111 * local123 + local112;
				}
			}
		}
		if (arg2 == -1) {
			this.aClass100_Sub3_33.method8886();
		} else {
			this.aClass100_Sub3_33.method8877((float) arg2);
			this.aClass100_Sub3_33.method8920();
		}
		this.aClass100_Sub3_33.method8926((this.anInt6500 & 0x7) != 0);
		for (@Pc(191) int local191 = 0; local191 < this.aClass6_Sub20Array1.length; local191++) {
			this.aClass6_Sub20Array1[local191].method3249(local106, local110);
		}
		if (!this.aClass8_35.method151()) {
			local123 = this.aClass100_Sub3_33.anInt10616;
			@Pc(224) int local224 = this.aClass100_Sub3_33.anInt10597;
			this.aClass100_Sub3_33.L(0, local224, this.aClass100_Sub3_33.anInt10629);
			this.aClass100_Sub3_33.method8926(false);
			this.aClass100_Sub3_33.method8864(false);
			this.aClass100_Sub3_33.method8876(128);
			this.aClass100_Sub3_33.method8895(-2);
			this.aClass100_Sub3_33.method8925(this.aClass100_Sub3_33.aClass3_Sub2_6);
			this.aClass100_Sub3_33.method8880(7681, 8448);
			this.aClass100_Sub3_33.method8889(34166, 0, 770);
			this.aClass100_Sub3_33.method8923(34167, 0);
			for (@Pc(284) Class6 local284 = this.aClass8_35.method149(); local284 != null; local284 = this.aClass8_35.method155()) {
				@Pc(289) Class6_Sub21 local289 = (Class6_Sub21) local284;
				local289.method3306(arg1, arg5, arg0, arg6);
			}
			this.aClass100_Sub3_33.method8889(5890, 0, 768);
			this.aClass100_Sub3_33.method8923(5890, 0);
			this.aClass100_Sub3_33.method8925((Class3) null);
			this.aClass100_Sub3_33.L(local123, local224, this.aClass100_Sub3_33.anInt10629);
		}
		if (this.aClass374_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass100_Sub3_33.method8885(this.aClass55_11, (Class55) null, this.aClass55_14, (Class55) null);
		this.aClass374_2.method8947(arg0, arg1, arg5, arg3, arg6);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5593(arg2, arg0, -1, arg4, arg5, arg3, arg1);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8529(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6517 <= 0) {
			return;
		}
		this.aClass100_Sub3_33.method8907();
		this.aClass100_Sub3_33.method8863(false);
		this.aClass100_Sub3_33.method8926(false);
		this.aClass100_Sub3_33.method8858(false);
		this.aClass100_Sub3_33.method8864(false);
		this.aClass100_Sub3_33.method8876(0);
		this.aClass100_Sub3_33.method8895(-2);
		this.aClass100_Sub3_33.method8925((Class3) null);
		Static477.aFloatArray73[14] = 0.0F;
		Static477.aFloatArray73[10] = 0.0F;
		Static477.aFloatArray73[15] = 1.0F;
		Static477.aFloatArray73[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass100_Sub3_33.anInt10436;
		Static477.aFloatArray73[6] = 0.0F;
		Static477.aFloatArray73[3] = 0.0F;
		Static477.aFloatArray73[8] = 0.0F;
		Static477.aFloatArray73[11] = 0.0F;
		Static477.aFloatArray73[7] = 0.0F;
		Static477.aFloatArray73[9] = 0.0F;
		Static477.aFloatArray73[5] = (float) 1024 / ((float) this.aClass100_Sub3_33.anInt10436 * 128.0F * (float) super.anInt10112);
		Static477.aFloatArray73[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass100_Sub3_33.anInt10422;
		Static477.aFloatArray73[2] = 0.0F;
		Static477.aFloatArray73[0] = (float) 1024 / ((float) this.aClass100_Sub3_33.anInt10422 * (float) super.anInt10112 * 128.0F);
		Static477.aFloatArray73[4] = 0.0F;
		Static477.aFloatArray73[1] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static477.aFloatArray73, 0);
		Static477.aFloatArray73[2] = 0.0F;
		Static477.aFloatArray73[15] = 1.0F;
		Static477.aFloatArray73[3] = 0.0F;
		Static477.aFloatArray73[13] = 0.0F;
		Static477.aFloatArray73[14] = 0.0F;
		Static477.aFloatArray73[0] = 1.0F;
		Static477.aFloatArray73[11] = 0.0F;
		Static477.aFloatArray73[10] = 0.0F;
		Static477.aFloatArray73[7] = 0.0F;
		Static477.aFloatArray73[4] = 0.0F;
		Static477.aFloatArray73[12] = 0.0F;
		Static477.aFloatArray73[9] = 1.0F;
		Static477.aFloatArray73[5] = 0.0F;
		Static477.aFloatArray73[1] = 0.0F;
		Static477.aFloatArray73[6] = 1.0F;
		Static477.aFloatArray73[8] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static477.aFloatArray73, 0);
		if ((this.anInt6500 & 0x7) == 0) {
			this.aClass100_Sub3_33.method8926(false);
		} else {
			this.aClass100_Sub3_33.method8926(true);
			this.aClass100_Sub3_33.method8857();
		}
		this.aClass100_Sub3_33.method8885(this.aClass55_11, this.aClass55_12, this.aClass55_14, this.aClass55_13);
		if (this.anInt6495 * 2 > this.aClass100_Sub3_33.aClass6_Sub40_Sub1_3.aByteArray113.length) {
			this.aClass100_Sub3_33.aClass6_Sub40_Sub1_3 = new Class6_Sub40_Sub1(this.anInt6495 * 2);
		} else {
			this.aClass100_Sub3_33.aClass6_Sub40_Sub1_3.anInt10169 = 0;
		}
		@Pc(306) int local306 = 0;
		@Pc(310) Class6_Sub40_Sub1 local310 = this.aClass100_Sub3_33.aClass6_Sub40_Sub1_3;
		@Pc(316) int local316;
		@Pc(325) int local325;
		@Pc(327) int local327;
		@Pc(345) short[] local345;
		@Pc(349) int local349;
		if (this.aClass100_Sub3_33.aBoolean700) {
			for (local316 = arg1; local316 < arg3; local316++) {
				local325 = arg0 + super.anInt10111 * local316;
				for (local327 = arg0; local327 < arg2; local327++) {
					if (arg4[local327 - arg0][local316 - arg1]) {
						local345 = this.aShortArrayArray9[local325];
						if (local345 != null) {
							for (local349 = 0; local349 < local345.length; local349++) {
								local306++;
								local310.method8561(local345[local349] & 0xFFFF);
							}
						}
					}
					local325++;
				}
			}
		} else {
			for (local316 = arg1; local316 < arg3; local316++) {
				local325 = local316 * super.anInt10111 + arg0;
				for (local327 = arg0; local327 < arg2; local327++) {
					if (arg4[local327 - arg0][local316 - arg1]) {
						local345 = this.aShortArrayArray9[local325];
						if (local345 != null) {
							for (local349 = 0; local349 < local345.length; local349++) {
								local310.method8617(local345[local349] & 0xFFFF);
								local306++;
							}
						}
					}
					local325++;
				}
			}
		}
		if (local306 > 0) {
			@Pc(465) Class54_Sub1 local465 = new Class54_Sub1(this.aClass100_Sub3_33, 5123, local310.aByteArray113, local310.anInt10169);
			this.aClass100_Sub3_33.method8901(local465, 0, local306);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5593(arg2, arg0, arg5, arg4, arg6, arg3, arg1);
	}

	@OriginalMember(owner = "client!mh", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass374_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass100_Sub3_33.anInt10606 * arg2 >> 8) >> this.aClass100_Sub3_33.anInt10587;
			@Pc(38) int local38 = arg3 - (this.aClass100_Sub3_33.anInt10615 * arg2 >> 8) >> this.aClass100_Sub3_33.anInt10587;
			this.aClass374_2.method8943(arg0, local23, local38);
		}
	}

	@OriginalMember(owner = "client!mh", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass374_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass100_Sub3_33.anInt10606 >> 8) >> this.aClass100_Sub3_33.anInt10587;
			@Pc(38) int local38 = arg3 - (this.aClass100_Sub3_33.anInt10615 * arg2 >> 8) >> this.aClass100_Sub3_33.anInt10587;
			this.aClass374_2.method8944(arg0, local38, local24);
		}
	}

	@OriginalMember(owner = "client!mh", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class6_Sub2_Sub16 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub16 arg2) {
		if ((this.aByteArrayArray107[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt10112 >> this.aClass100_Sub3_33.anInt10587;
		@Pc(27) Class6_Sub2_Sub16_Sub1 local27 = (Class6_Sub2_Sub16_Sub1) arg2;
		@Pc(37) Class6_Sub2_Sub16_Sub1 local37;
		if (local27 != null && local27.method6386(local24, local24)) {
			local37 = local27;
			local27.method6385();
		} else {
			local37 = new Class6_Sub2_Sub16_Sub1(this.aClass100_Sub3_33, local24, local24);
		}
		local37.method6388(local24, local24, 0, 0);
		this.method5594(arg1, arg0, local37);
		return local37;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBLclient!oca;)V")
	private void method5594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub2_Sub16_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray10[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (this.aClass100_Sub3_33.anIntArray640.length < local22) {
			this.aClass100_Sub3_33.anIntArray640 = new int[local22];
			this.aClass100_Sub3_33.anIntArray641 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass100_Sub3_33.anIntArray640;
		@Pc(46) int[] local46 = this.aClass100_Sub3_33.anIntArray641;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass100_Sub3_33.anInt10587;
			local46[local48] = local19[local48] >> this.aClass100_Sub3_33.anInt10587;
		}
		@Pc(76) int local76 = 0;
		while (local22 > local76) {
			@Pc(82) int local82 = local42[local76];
			@Pc(87) int local87 = local46[local76++];
			@Pc(91) int local91 = local42[local76];
			@Pc(96) int local96 = local46[local76++];
			@Pc(100) int local100 = local42[local76];
			@Pc(105) int local105 = local46[local76++];
			if (-((local96 - local87) * (-local91 + local100)) + (local96 - local105) * (local82 - local91) > 0) {
				arg2.method6389(local105, local100, local96, local87, local91, local82);
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!raa;[I)V")
	@Override
	public void method8526(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_35.method157(new Class6_Sub21(this.aClass100_Sub3_33, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8527(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass374_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass100_Sub3_33.anInt10606 >> 8) >> this.aClass100_Sub3_33.anInt10587;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass100_Sub3_33.anInt10615 >> 8) >> this.aClass100_Sub3_33.anInt10587;
			return this.aClass374_2.method8946(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt10111][super.anInt10110][];
		}
		@Pc(21) Interface4 local21 = this.aClass100_Sub3_33.anInterface4_12;
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt10111][super.anInt10110][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray14[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg3;
		}
		@Pc(92) Class6_Sub20[] local92 = this.aClass6_Sub20ArrayArrayArray1[arg0][arg1] = new Class6_Sub20[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt6500 & 0x20) != 0 && local100 != -1 && local21.method895(local100).aBoolean636) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(149) long local149 = (long) (local104 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) local100;
			@Pc(155) Class6 local155;
			for (local155 = this.aClass128_22.method3560(local149); local155 != null; local155 = this.aClass128_22.method3553()) {
				@Pc(160) Class6_Sub20 local160 = (Class6_Sub20) local155;
				if (local160.anInt3663 == local100 && local160.aFloat67 == (float) local104 && arg10 == local160.anInt3660 && arg11 == local160.anInt3664 && local160.anInt3667 == arg12) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class6_Sub20(this, local100, local104, arg10, arg11, arg12);
				this.aClass128_22.method3551(local149, local92[local94]);
			} else {
				local92[local94] = (Class6_Sub20) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray107[arg0][arg1] = (byte) (this.aByteArrayArray107[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6518) {
			this.anInt6518 = arg6.length;
		}
		this.anInt6517 += arg6.length;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	@Override
	public void method8528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mh", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt6517 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt10111 + 1][super.anInt10110 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; local16 < super.anInt10111; local16++) {
				for (local20 = 1; super.anInt10110 > local20; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray108[local16 - 1][local20] >> 2) + (this.aByteArrayArray108[local16 + 1][local20] >> 3) + (this.aByteArrayArray108[local16][local20 - 1] >> 2) + (this.aByteArrayArray108[local16][local20 - -1] >> 3) + (this.aByteArrayArray108[local16][local20] >> 1));
				}
			}
			this.aClass6_Sub20Array1 = new Class6_Sub20[this.aClass128_22.method3554()];
			this.aClass128_22.method3561(this.aClass6_Sub20Array1);
			for (local20 = 0; local20 < this.aClass6_Sub20Array1.length; local20++) {
				this.aClass6_Sub20Array1[local20].method3257(this.anInt6517);
			}
			@Pc(128) int local128 = 24;
			if (this.anIntArrayArrayArray11 != null) {
				local128 += 4;
			}
			if ((this.anInt6500 & 0x7) != 0) {
				local128 += 12;
			}
			@Pc(148) NativeHeapBuffer local148 = this.aClass100_Sub3_33.aNativeHeap6.a(local128 * this.anInt6517, false);
			@Pc(153) Stream local153 = new Stream(local148);
			@Pc(157) Class6_Sub20[] local157 = new Class6_Sub20[this.anInt6517];
			@Pc(164) int local164 = Static600.method8449(this.anInt6517 / 4);
			if (local164 < 1) {
				local164 = 1;
			}
			@Pc(176) Class128 local176 = new Class128(local164);
			@Pc(180) Class6_Sub20[] local180 = new Class6_Sub20[this.anInt6518];
			@Pc(186) int local186;
			for (@Pc(182) int local182 = 0; super.anInt10111 > local182; local182++) {
				for (local186 = 0; local186 < super.anInt10110; local186++) {
					if (this.anIntArrayArrayArray12[local182][local186] != null) {
						@Pc(202) Class6_Sub20[] local202 = this.aClass6_Sub20ArrayArrayArray1[local182][local186];
						@Pc(209) int[] local209 = this.anIntArrayArrayArray10[local182][local186];
						@Pc(216) int[] local216 = this.anIntArrayArrayArray13[local182][local186];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray14[local182][local186];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray12[local182][local186];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local182][local186];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local182][local186];
						if (local223 == null) {
							local223 = local230;
						}
						@Pc(265) float local265 = this.aFloatArrayArray9[local182][local186];
						@Pc(272) float local272 = this.aFloatArrayArray10[local182][local186];
						@Pc(279) float local279 = this.aFloatArrayArray11[local182][local186];
						@Pc(288) float local288 = this.aFloatArrayArray9[local182][local186 + 1];
						@Pc(297) float local297 = this.aFloatArrayArray10[local182][local186 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray11[local182][local186 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray9[local182 + 1][local186 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray10[local182 + 1][local186 + 1];
						@Pc(339) float local339 = this.aFloatArrayArray11[local182 + 1][local186 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray9[local182 + 1][local186];
						@Pc(357) float local357 = this.aFloatArrayArray10[local182 + 1][local186];
						@Pc(366) float local366 = this.aFloatArrayArray11[local182 + 1][local186];
						@Pc(374) int local374 = local14[local182][local186] & 0xFF;
						@Pc(384) int local384 = local14[local182][local186 + 1] & 0xFF;
						@Pc(396) int local396 = local14[local182 + 1][local186 + 1] & 0xFF;
						@Pc(406) int local406 = local14[local182 + 1][local186] & 0xFF;
						@Pc(408) int local408 = 0;
						@Pc(418) int local418;
						label337: for (@Pc(410) int local410 = 0; local410 < local230.length; local410++) {
							@Pc(416) Class6_Sub20 local416 = local202[local410];
							for (local418 = 0; local418 < local408; local418++) {
								if (local416 == local180[local418]) {
									continue label337;
								}
							}
							local180[local408++] = local416;
						}
						@Pc(455) short[] local455 = this.aShortArrayArray9[super.anInt10111 * local186 + local182] = new short[local230.length];
						for (local418 = 0; local418 < local230.length; local418++) {
							@Pc(469) int local469 = (local182 << super.anInt10104) + local209[local418];
							@Pc(478) int local478 = (local186 << super.anInt10104) + local216[local418];
							@Pc(483) int local483 = local469 >> this.anInt6513;
							@Pc(488) int local488 = local478 >> this.anInt6513;
							@Pc(492) int local492 = local230[local418];
							@Pc(496) int local496 = local223[local418];
							@Pc(504) int local504 = local242 == null ? 0 : local242[local418];
							@Pc(522) long local522 = (long) local488 | (long) (local483 << 16) | (long) local496 << 48 | (long) local492 << 32;
							@Pc(526) int local526 = local209[local418];
							@Pc(530) int local530 = local216[local418];
							@Pc(532) byte local532 = 74;
							@Pc(534) int local534 = 0;
							@Pc(557) float local557;
							@Pc(549) float local549;
							@Pc(555) float local555;
							@Pc(612) float local612;
							@Pc(553) int local553;
							if (local526 == 0 && local530 == 0) {
								local549 = local272;
								local553 = local532 - local374;
								local557 = local265;
								local555 = local279;
							} else if (local526 == 0 && super.anInt10112 == local530) {
								local549 = local297;
								local553 = local532 - local384;
								local555 = local306;
								local557 = local288;
							} else if (super.anInt10112 == local526 && super.anInt10112 == local530) {
								local555 = local339;
								local549 = local328;
								local557 = local317;
								local553 = local532 - local396;
							} else if (super.anInt10112 == local526 && local530 == 0) {
								local555 = local366;
								local557 = local348;
								local553 = local532 - local406;
								local549 = local357;
							} else {
								@Pc(587) float local587 = (float) local526 / (float) super.anInt10112;
								@Pc(594) float local594 = (float) local530 / (float) super.anInt10112;
								@Pc(603) float local603 = local265 + (local348 - local265) * local587;
								local612 = local272 + (local357 - local272) * local587;
								@Pc(621) float local621 = local279 + (local366 - local279) * local587;
								@Pc(629) float local629 = local587 * (local317 - local288) + local288;
								@Pc(637) float local637 = (local328 - local297) * local587 + local297;
								local557 = local594 * (local629 - local603) + local603;
								@Pc(655) float local655 = local306 + (local339 - local306) * local587;
								local549 = local612 + (local637 - local612) * local594;
								local555 = (local655 - local621) * local594 + local621;
								@Pc(685) int local685 = ((local406 - local374) * local526 >> super.anInt10104) + local374;
								@Pc(697) int local697 = ((local396 - local384) * local526 >> super.anInt10104) + local384;
								local553 = local532 - ((local697 - local685) * local530 >> super.anInt10104) - local685;
							}
							@Pc(748) float local748 = 1.0F;
							if (local492 != -1) {
								@Pc(760) int local760 = local553 * (local492 & 0x7F) >> 7;
								if (local760 < 2) {
									local760 = 2;
								} else if (local760 > 126) {
									local760 = 126;
								}
								if ((this.anInt6500 & 0x7) == 0) {
									local748 = this.aClass100_Sub3_33.aFloatArray80[2] * local555 + local549 * this.aClass100_Sub3_33.aFloatArray80[1] + local557 * this.aClass100_Sub3_33.aFloatArray80[0];
									local748 = local748 * (local748 > 0.0F ? this.aClass100_Sub3_33.aFloat228 : this.aClass100_Sub3_33.aFloat225) + this.aClass100_Sub3_33.aFloat219;
								}
								local534 = Static91.anIntArray99[local492 & 0xFF80 | local760];
							}
							@Pc(834) Class6 local834 = null;
							if ((this.anInt6502 - 1 & local469) == 0 && (this.anInt6502 - 1 & local478) == 0) {
								local834 = local176.method3560(local522);
							}
							@Pc(873) int local873;
							@Pc(900) int local900;
							if (local834 == null) {
								if (local496 == local492) {
									local900 = local534;
								} else {
									@Pc(910) int local910 = local553 * (local496 & 0x7F) >> 7;
									if (local910 < 2) {
										local910 = 2;
									} else if (local910 > 126) {
										local910 = 126;
									}
									local900 = Static91.anIntArray99[local910 | local496 & 0xFF80];
									if ((this.anInt6500 & 0x7) == 0) {
										@Pc(961) float local961 = this.aClass100_Sub3_33.aFloatArray80[1] * local549 + local557 * this.aClass100_Sub3_33.aFloatArray80[0] + this.aClass100_Sub3_33.aFloatArray80[2] * local555;
										local612 = (local748 > 0.0F ? this.aClass100_Sub3_33.aFloat228 : this.aClass100_Sub3_33.aFloat225) * local748 + this.aClass100_Sub3_33.aFloat219;
										@Pc(986) int local986 = local900 >> 16 & 0xFF;
										@Pc(992) int local992 = local900 >> 8 & 0xFF;
										local986 = (int) ((float) local986 * local612);
										@Pc(1002) int local1002 = local900 & 0xFF;
										if (local986 < 0) {
											local986 = 0;
										} else if (local986 > 255) {
											local986 = 255;
										}
										local992 = (int) ((float) local992 * local612);
										local1002 = (int) ((float) local1002 * local612);
										if (local992 < 0) {
											local992 = 0;
										} else if (local992 > 255) {
											local992 = 255;
										}
										if (local1002 < 0) {
											local1002 = 0;
										} else if (local1002 > 255) {
											local1002 = 255;
										}
										local900 = local992 << 8 | local986 << 16 | local1002;
									}
								}
								if (this.aClass100_Sub3_33.aBoolean700) {
									local153.a((float) local469);
									local153.a((float) (local504 + this.method8531(local478, local469)));
									local153.a((float) local478);
									local153.f((byte) (local900 >> 16));
									local153.f((byte) (local900 >> 8));
									local153.f((byte) local900);
									local153.f(-1);
									local153.a((float) local469);
									local153.a((float) local478);
									if (this.anIntArrayArrayArray11 != null) {
										local153.a((float) (local254 == null ? 0 : local254[local418] - 1));
									}
									if ((this.anInt6500 & 0x7) != 0) {
										local153.a(local557);
										local153.a(local549);
										local153.a(local555);
									}
								} else {
									local153.b((float) local469);
									local153.b((float) (this.method8531(local478, local469) + local504));
									local153.b((float) local478);
									local153.f((byte) (local900 >> 16));
									local153.f((byte) (local900 >> 8));
									local153.f((byte) local900);
									local153.f(-1);
									local153.b((float) local469);
									local153.b((float) local478);
									if (this.anIntArrayArrayArray11 != null) {
										local153.b((float) (local254 == null ? 0 : local254[local418] - 1));
									}
									if ((this.anInt6500 & 0x7) != 0) {
										local153.b(local557);
										local153.b(local549);
										local153.b(local555);
									}
								}
								local873 = this.anInt6496++;
								local455[local418] = (short) local873;
								if (local492 != -1) {
									local157[local873] = local202[local418];
								}
								local176.method3551(local522, new Class6_Sub36(local455[local418]));
							} else {
								local455[local418] = ((Class6_Sub36) local834).aShort92;
								local873 = local455[local418] & 0xFFFF;
								if (local492 != -1 && local157[local873].aLong278 > local202[local418].aLong278) {
									local157[local873] = local202[local418];
								}
							}
							for (local900 = 0; local900 < local408; local900++) {
								local180[local900].method3251(local553, local748, local873, local534);
							}
							this.anInt6495++;
						}
					}
				}
			}
			for (local186 = 0; local186 < this.anInt6496; local186++) {
				@Pc(1311) Class6_Sub20 local1311 = local157[local186];
				if (local1311 != null) {
					local1311.method3253(local186);
				}
			}
			@Pc(1348) int local1348;
			for (@Pc(1328) int local1328 = 0; local1328 < super.anInt10111; local1328++) {
				for (@Pc(1332) int local1332 = 0; local1332 < super.anInt10110; local1332++) {
					@Pc(1344) short[] local1344 = this.aShortArrayArray9[local1328 + local1332 * super.anInt10111];
					if (local1344 != null) {
						local1348 = 0;
						@Pc(1350) int local1350 = 0;
						while (local1350 < local1344.length) {
							@Pc(1359) int local1359 = local1344[local1350++] & 0xFFFF;
							@Pc(1366) int local1366 = local1344[local1350++] & 0xFFFF;
							@Pc(1373) int local1373 = local1344[local1350++] & 0xFFFF;
							@Pc(1377) Class6_Sub20 local1377 = local157[local1359];
							@Pc(1381) Class6_Sub20 local1381 = local157[local1366];
							@Pc(1385) Class6_Sub20 local1385 = local157[local1373];
							@Pc(1387) Class6_Sub20 local1387 = null;
							if (local1377 != null) {
								local1387 = local1377;
								local1377.method3250(local1332, local1348, local1328);
							}
							if (local1381 != null) {
								local1381.method3250(local1332, local1348, local1328);
								if (local1387 == null || local1381.aLong278 < local1387.aLong278) {
									local1387 = local1381;
								}
							}
							if (local1385 != null) {
								local1385.method3250(local1332, local1348, local1328);
								if (local1387 == null || local1385.aLong278 < local1387.aLong278) {
									local1387 = local1385;
								}
							}
							if (local1387 != null) {
								if (local1377 != null) {
									local1387.method3253(local1359);
								}
								if (local1381 != null) {
									local1387.method3253(local1366);
								}
								if (local1385 != null) {
									local1387.method3253(local1373);
								}
								local1387.method3250(local1332, local1348, local1328);
							}
							local1348++;
						}
					}
				}
			}
			local153.c();
			this.anInterface27_5 = this.aClass100_Sub3_33.method8887(local153.a(), local148, local128);
			this.aClass55_11 = new Class55(this.anInterface27_5, 5126, 3, 0);
			this.aClass55_12 = new Class55(this.anInterface27_5, 5121, 4, 12);
			@Pc(1526) byte local1526;
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass55_14 = new Class55(this.anInterface27_5, 5126, 2, 16);
				local1526 = 24;
			} else {
				this.aClass55_14 = new Class55(this.anInterface27_5, 5126, 3, 16);
				local1526 = 28;
			}
			if ((this.anInt6500 & 0x7) != 0) {
				this.aClass55_13 = new Class55(this.anInterface27_5, 5126, 3, local1526);
			}
			@Pc(1563) long[] local1563 = new long[this.aClass6_Sub20Array1.length];
			for (local1348 = 0; local1348 < this.aClass6_Sub20Array1.length; local1348++) {
				@Pc(1572) Class6_Sub20 local1572 = this.aClass6_Sub20Array1[local1348];
				local1563[local1348] = local1572.aLong278;
				local1572.method3252(this.anInt6496);
			}
			Static571.method8295(local1563, this.aClass6_Sub20Array1);
			if (this.aClass374_2 != null) {
				this.aClass374_2.method8948();
			}
		} else {
			this.aClass374_2 = null;
		}
		this.aByteArrayArray108 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray12 = null;
		this.aClass128_22 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray10 = this.aFloatArrayArray11 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray13 = null;
		this.aClass6_Sub20ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!mh", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray108[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray108[arg0][arg1] = (byte) arg2;
		}
	}
}
