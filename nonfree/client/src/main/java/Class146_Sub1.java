import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class146_Sub1 extends Class146 {

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	private int anInt4152;

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
	private int anInt4164;

	@OriginalMember(owner = "client!lh", name = "Y", descriptor = "Lclient!it;")
	public Class124 aClass124_8;

	@OriginalMember(owner = "client!lh", name = "Z", descriptor = "[Lclient!io;")
	private Class4_Sub22[] aClass4_Sub22Array1;

	@OriginalMember(owner = "client!lh", name = "ab", descriptor = "Lclient!gf;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
	private int anInt4174;

	@OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
	private int anInt4175;

	@OriginalMember(owner = "client!lh", name = "eb", descriptor = "Lclient!it;")
	private Class124 aClass124_9;

	@OriginalMember(owner = "client!lh", name = "ib", descriptor = "Lclient!it;")
	public Class124 aClass124_10;

	@OriginalMember(owner = "client!lh", name = "jb", descriptor = "Lclient!it;")
	public Class124 aClass124_11;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!vr;")
	private final Class258 aClass258_33 = new Class258();

	@OriginalMember(owner = "client!lh", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
	private final int anInt4161;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Lclient!bv;")
	public final Class30_Sub1 aClass30_Sub1_25;

	@OriginalMember(owner = "client!lh", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "[[[Lclient!io;")
	private Class4_Sub22[][][] aClass4_Sub22ArrayArrayArray1;

	@OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
	public final int anInt4165;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!lh", name = "lb", descriptor = "[[B")
	private byte[][] lb;

	@OriginalMember(owner = "client!lh", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!lh", name = "U", descriptor = "[[B")
	private final byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
	private final int anInt4171;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!lh", name = "W", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!lh", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!lh", name = "kb", descriptor = "Lclient!qo;")
	private Class196 aClass196_19;

	@OriginalMember(owner = "client!lh", name = "X", descriptor = "Lclient!tn;")
	private Class231 aClass231_2;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!bv;IIII[[I[[II)V")
	public Class146_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray34 = arg5;
		this.anInt4161 = super.anInt4734 - 2;
		this.aClass30_Sub1_25 = arg0;
		this.aFloatArrayArray4 = new float[super.anInt4730 + 1][super.anInt4732 + 1];
		this.aClass4_Sub22ArrayArrayArray1 = new Class4_Sub22[arg3][arg4][];
		this.anInt4165 = arg2;
		this.aShortArrayArray6 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.lb = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray5 = new float[super.anInt4730 + 1][super.anInt4732 + 1];
		this.aByteArrayArray7 = new byte[arg3][arg4];
		this.anInt4171 = 0x1 << this.anInt4161;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt4730 + 1][super.anInt4732 + 1];
		for (@Pc(117) int local117 = 1; local117 < super.anInt4732; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt4730 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + local140 * local140 + arg7 * 4 * arg7)));
				this.aFloatArrayArray4[local121][local117] = (float) local140 * local176;
				this.aFloatArrayArray5[local121][local117] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray3[local121][local117] = (float) local157 * local176;
			}
		}
		this.aClass196_19 = new Class196(128);
		if ((this.anInt4165 & 0x10) != 0) {
			this.aClass231_2 = new Class231(this.aClass30_Sub1_25, this);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!dd;[I)V")
	@Override
	public void method3602(@OriginalArg(0) Class4_Sub8 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass258_33.method5526(new Class4_Sub31(this.aClass30_Sub1_25, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZI[[ZII)V")
	private void method3150(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) boolean[][] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.aClass4_Sub22Array1 == null) {
			return;
		}
		@Pc(21) float local21 = this.aClass30_Sub1_25.aFloat34;
		@Pc(25) float local25 = this.aClass30_Sub1_25.aFloat29;
		@Pc(31) int local31 = arg4 + arg4 + 1;
		@Pc(35) int local35 = local31 * local31;
		if (Static280.anIntArray442.length < local35) {
			Static280.anIntArray442 = new int[local35];
		}
		if (Static311.aClass4_Sub30_8.aByteArray79.length < this.anInt4152 * 2) {
			Static311.aClass4_Sub30_8 = new Class4_Sub30(this.anInt4152 * 2);
		}
		@Pc(67) int local67 = arg0 - arg4;
		@Pc(69) int local69 = local67;
		if (local67 < 0) {
			local67 = 0;
		}
		@Pc(78) int local78 = arg3 - arg4;
		@Pc(80) int local80 = local78;
		if (local78 < 0) {
			local78 = 0;
		}
		@Pc(88) int local88 = arg0 + arg4;
		if (super.anInt4730 - 1 < local88) {
			local88 = super.anInt4730 - 1;
		}
		@Pc(103) int local103 = arg4 + arg3;
		Static229.anInt4205 = 0;
		if (super.anInt4732 - 1 < local103) {
			local103 = super.anInt4732 - 1;
		}
		@Pc(129) int local129;
		for (@Pc(118) int local118 = local67; local118 <= local88; local118++) {
			@Pc(127) boolean[] local127 = arg2[local118 - local69];
			for (local129 = local78; local129 <= local103; local129++) {
				if (local127[local129 - local80]) {
					Static280.anIntArray442[Static229.anInt4205++] = local129 * super.anInt4730 + local118;
				}
			}
		}
		this.aClass30_Sub1_25.method911();
		this.aClass30_Sub1_25.method952((this.anInt4165 & 0x7) != 0);
		for (@Pc(204) int local204 = 0; local204 < this.aClass4_Sub22Array1.length; local204++) {
			this.aClass4_Sub22Array1[local204].method2543(Static229.anInt4205, Static280.anIntArray442);
		}
		if (!this.aClass258_33.method5533()) {
			local129 = this.aClass30_Sub1_25.anInt1263;
			@Pc(237) int local237 = this.aClass30_Sub1_25.anInt1278;
			this.aClass30_Sub1_25.V(0, local237, this.aClass30_Sub1_25.anInt1276);
			this.aClass30_Sub1_25.o(local25, local21 - 4.0F);
			this.aClass30_Sub1_25.method952(false);
			this.aClass30_Sub1_25.method956(false);
			this.aClass30_Sub1_25.method931(128);
			this.aClass30_Sub1_25.method940(-2);
			this.aClass30_Sub1_25.method916(this.aClass30_Sub1_25.aClass1_Sub3_1);
			this.aClass30_Sub1_25.method905(7681, 8448);
			this.aClass30_Sub1_25.method957(34166, 770, 0);
			this.aClass30_Sub1_25.method954(0, 34167);
			for (@Pc(306) Class4 local306 = this.aClass258_33.method5538(); local306 != null; local306 = this.aClass258_33.method5528()) {
				@Pc(311) Class4_Sub31 local311 = (Class4_Sub31) local306;
				local311.method4023(arg0, arg4, arg3, arg2);
			}
			this.aClass30_Sub1_25.method957(5890, 768, 0);
			this.aClass30_Sub1_25.method954(0, 5890);
			this.aClass30_Sub1_25.method916(null);
			this.aClass30_Sub1_25.V(local129, local237, this.aClass30_Sub1_25.anInt1276);
		}
		if (this.aClass231_2 != null) {
			this.aClass30_Sub1_25.o(local25, local21 - 8.0F);
			this.aClass30_Sub1_25.method911();
			this.aClass30_Sub1_25.method919(this.aClass124_8, this.aClass124_11, null, null);
			this.aClass231_2.method5223(arg1, arg3, arg2, arg4, arg0);
		}
		this.aClass30_Sub1_25.o(local25, local21);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3607(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4174 <= 0) {
			return;
		}
		this.aClass30_Sub1_25.method942();
		this.aClass30_Sub1_25.method960(false);
		this.aClass30_Sub1_25.method952(false);
		this.aClass30_Sub1_25.method930(false);
		this.aClass30_Sub1_25.method956(false);
		this.aClass30_Sub1_25.method931(0);
		this.aClass30_Sub1_25.method940(-2);
		this.aClass30_Sub1_25.method916(null);
		Static71.aFloatArray14[6] = 0.0F;
		Static71.aFloatArray14[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass30_Sub1_25.anInt1138;
		Static71.aFloatArray14[10] = 0.0F;
		Static71.aFloatArray14[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass30_Sub1_25.anInt1161;
		Static71.aFloatArray14[9] = 0.0F;
		Static71.aFloatArray14[15] = 1.0F;
		Static71.aFloatArray14[5] = (float) 1024 / ((float) this.aClass30_Sub1_25.anInt1138 * (float) super.anInt4733 * 128.0F);
		Static71.aFloatArray14[2] = 0.0F;
		Static71.aFloatArray14[11] = 0.0F;
		Static71.aFloatArray14[8] = 0.0F;
		Static71.aFloatArray14[4] = 0.0F;
		Static71.aFloatArray14[1] = 0.0F;
		Static71.aFloatArray14[3] = 0.0F;
		Static71.aFloatArray14[0] = (float) 1024 / ((float) this.aClass30_Sub1_25.anInt1161 * (float) super.anInt4733 * 128.0F);
		Static71.aFloatArray14[14] = 0.0F;
		Static71.aFloatArray14[7] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static71.aFloatArray14, 0);
		Static71.aFloatArray14[3] = 0.0F;
		Static71.aFloatArray14[10] = 0.0F;
		Static71.aFloatArray14[1] = 0.0F;
		Static71.aFloatArray14[14] = 0.0F;
		Static71.aFloatArray14[5] = 0.0F;
		Static71.aFloatArray14[6] = 1.0F;
		Static71.aFloatArray14[15] = 1.0F;
		Static71.aFloatArray14[11] = 0.0F;
		Static71.aFloatArray14[12] = 0.0F;
		Static71.aFloatArray14[0] = 1.0F;
		Static71.aFloatArray14[8] = 0.0F;
		Static71.aFloatArray14[7] = 0.0F;
		Static71.aFloatArray14[9] = 1.0F;
		Static71.aFloatArray14[2] = 0.0F;
		Static71.aFloatArray14[13] = 0.0F;
		Static71.aFloatArray14[4] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static71.aFloatArray14, 0);
		if ((this.anInt4165 & 0x7) == 0) {
			this.aClass30_Sub1_25.method952(false);
		} else {
			this.aClass30_Sub1_25.method952(true);
			this.aClass30_Sub1_25.method918();
		}
		this.aClass30_Sub1_25.method919(this.aClass124_8, this.aClass124_11, this.aClass124_10, this.aClass124_9);
		if (this.anInt4152 * 2 <= Static311.aClass4_Sub30_8.aByteArray79.length) {
			Static311.aClass4_Sub30_8.anInt6244 = 0;
		} else {
			Static311.aClass4_Sub30_8 = new Class4_Sub30(this.anInt4152 * 2);
		}
		@Pc(306) int local306 = 0;
		@Pc(312) int local312;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(342) short[] local342;
		@Pc(346) int local346;
		if (this.aClass30_Sub1_25.aBoolean76) {
			for (local312 = arg1; local312 < arg3; local312++) {
				local321 = arg0 + super.anInt4730 * local312;
				for (local323 = arg0; local323 < arg2; local323++) {
					if (arg4[local323 - arg0][local312 - arg1]) {
						local342 = this.aShortArrayArray6[local321];
						if (local342 != null) {
							for (local346 = 0; local346 < local342.length; local346++) {
								Static311.aClass4_Sub30_8.method4846(local342[local346] & 0xFFFF);
								local306++;
							}
						}
					}
					local321++;
				}
			}
		} else {
			for (local312 = arg1; local312 < arg3; local312++) {
				local321 = arg0 + local312 * super.anInt4730;
				for (local323 = arg0; local323 < arg2; local323++) {
					if (arg4[local323 - arg0][local312 - arg1]) {
						local342 = this.aShortArrayArray6[local321];
						if (local342 != null) {
							for (local346 = 0; local346 < local342.length; local346++) {
								local306++;
								Static311.aClass4_Sub30_8.method4874(local342[local346] & 0xFFFF);
							}
						}
					}
					local321++;
				}
			}
		}
		if (local306 > 0) {
			@Pc(463) Class45_Sub2 local463 = new Class45_Sub2(this.aClass30_Sub1_25, 5123, Static311.aClass4_Sub30_8.aByteArray79, Static311.aClass4_Sub30_8.anInt6244);
			this.aClass30_Sub1_25.method958(0, local306, local463);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.JA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!lh", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt4730][super.anInt4732][];
		}
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt4730][super.anInt4732][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub22[] local88 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1] = new Class4_Sub22[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class4 local125;
			for (local125 = this.aClass196_19.method4477(local119); local125 != null; local125 = this.aClass196_19.method4479()) {
				@Pc(130) Class4_Sub22 local130 = (Class4_Sub22) local125;
				if (local130.anInt3232 == arg8[local90] && (float) arg9[local90] == local130.aFloat99 && arg10 == local130.anInt3236 && local130.anInt3230 == arg11 && arg12 == local130.anInt3229) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub22(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass196_19.method4474(local119, local88[local90]);
			} else {
				local88[local90] = (Class4_Sub22) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray7[arg0][arg1] = (byte) (this.aByteArrayArray7[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt4175) {
			this.anInt4175 = arg6.length;
		}
		this.anInt4174 += arg6.length;
	}

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray34[arg0][arg1];
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILclient!fi;)V")
	private void method3152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub1_Sub7_Sub1 arg2) {
		@Pc(20) int[] local20 = this.anIntArrayArrayArray6[arg0][arg1];
		@Pc(27) int[] local27 = this.anIntArrayArrayArray5[arg0][arg1];
		@Pc(30) int local30 = local20.length;
		if (local30 > Static192.anIntArray673.length) {
			Static192.anIntArray673 = new int[local30];
			Static400.anIntArray605 = new int[local30];
		}
		for (@Pc(46) int local46 = 0; local46 < local30; local46++) {
			Static192.anIntArray673[local46] = (local20[local46] & 0xFF) >> this.aClass30_Sub1_25.anInt1242;
			Static400.anIntArray605[local46] = (local27[local46] & 0xFF) >> this.aClass30_Sub1_25.anInt1242;
		}
		@Pc(78) int local78 = 0;
		while (local78 < local30) {
			@Pc(84) int local84 = Static192.anIntArray673[local78];
			@Pc(89) int local89 = Static400.anIntArray605[local78++];
			@Pc(93) int local93 = Static192.anIntArray673[local78];
			@Pc(98) int local98 = Static400.anIntArray605[local78++];
			@Pc(102) int local102 = Static192.anIntArray673[local78];
			@Pc(107) int local107 = Static400.anIntArray605[local78++];
			if (-((local102 - local93) * (local98 - local89)) + (local98 - local107) * (-local93 + local84) > 0) {
				arg2.method1810(local102, local89, local98, local93, local84, local107);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass231_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass30_Sub1_25.anInt1282 * arg2 >> 8) >> this.aClass30_Sub1_25.anInt1242;
			@Pc(37) int local37 = arg3 - (arg2 * this.aClass30_Sub1_25.anInt1260 >> 8) >> this.aClass30_Sub1_25.anInt1242;
			this.aClass231_2.method5219(local37, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3150(arg0, arg4, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!lh", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class4_Sub1_Sub7 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub7 arg2) {
		if ((this.aByteArrayArray7[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt4733 >> this.aClass30_Sub1_25.anInt1242;
		@Pc(24) Class4_Sub1_Sub7_Sub1 local24 = (Class4_Sub1_Sub7_Sub1) arg2;
		@Pc(34) Class4_Sub1_Sub7_Sub1 local34;
		if (local24 != null && local24.method1809(local21, local21)) {
			local34 = local24;
			local24.method1806();
		} else {
			local34 = new Class4_Sub1_Sub7_Sub1(this.aClass30_Sub1_25, local21, local21);
		}
		local34.method1805(0, local21, 0, local21);
		this.method3152(arg0, arg1, local34);
		return local34;
	}

	@OriginalMember(owner = "client!lh", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass231_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass30_Sub1_25.anInt1282 >> 8) >> this.aClass30_Sub1_25.anInt1242;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass30_Sub1_25.anInt1260 >> 8) >> this.aClass30_Sub1_25.anInt1242;
			this.aClass231_2.method5217(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!lh", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt4734;
		@Pc(13) int local13 = arg1 >> super.anInt4734;
		if (local8 < 0 || local13 < 0 || super.anInt4730 - 1 < local8 || local13 > super.anInt4732 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & super.anInt4733 - 1;
		@Pc(51) int local51 = super.anInt4733 - 1 & arg1;
		@Pc(78) int local78 = this.anIntArrayArray34[local8 + 1][local13] * local44 + this.anIntArrayArray34[local8][local13] * (super.anInt4733 - local44) >> super.anInt4734;
		@Pc(109) int local109 = local44 * this.anIntArrayArray34[local8 + 1][local13 + 1] + (super.anInt4733 - local44) * this.anIntArrayArray34[local8][local13 + 1] >> super.anInt4734;
		return local78 * (super.anInt4733 - local51) + local51 * local109 >> super.anInt4734;
	}

	@OriginalMember(owner = "client!lh", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.lb[arg0][arg1] & 0xFF) < arg2) {
			this.lb[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method3606(@OriginalArg(0) Class4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass231_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass30_Sub1_25.anInt1282 >> 8) >> this.aClass30_Sub1_25.anInt1242;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass30_Sub1_25.anInt1260 >> 8) >> this.aClass30_Sub1_25.anInt1242;
			return this.aClass231_2.method5220(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	@Override
	public void method3603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "()V")
	@Override
	public void f() {
		if (this.anInt4174 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt4730 + 1][super.anInt4732 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; local23 < super.anInt4730; local23++) {
				for (local27 = 1; super.anInt4732 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.lb[local23][local27 + 1] >> 3) + (this.lb[local23][local27 - 1] >> 2) + (this.lb[local23 + 1][local27] >> 3) + (this.lb[local23 + -1][local27] >> 2) + (this.lb[local23][local27] >> 1));
				}
			}
			this.aClass4_Sub22Array1 = new Class4_Sub22[this.aClass196_19.method4473()];
			this.aClass196_19.method4478(this.aClass4_Sub22Array1);
			for (local27 = 0; local27 < this.aClass4_Sub22Array1.length; local27++) {
				this.aClass4_Sub22Array1[local27].method2541(this.anInt4174);
			}
			@Pc(135) int local135 = 24;
			if (this.anIntArrayArrayArray8 != null) {
				local135 += 4;
			}
			if ((this.anInt4165 & 0x7) != 0) {
				local135 += 12;
			}
			@Pc(154) NativeBuffer local154 = this.aClass30_Sub1_25.aNativeHeap1.a(local135 * this.anInt4174);
			@Pc(159) NativeStream local159 = new NativeStream(local154);
			@Pc(163) Class4_Sub22[] local163 = new Class4_Sub22[this.anInt4174];
			@Pc(173) Class196 local173 = new Class196(Static79.method1390(this.anInt4174 / 4));
			@Pc(177) Class4_Sub22[] local177 = new Class4_Sub22[this.anInt4175];
			@Pc(183) int local183;
			for (@Pc(179) int local179 = 0; local179 < super.anInt4730; local179++) {
				for (local183 = 0; local183 < super.anInt4732; local183++) {
					if (this.anIntArrayArrayArray7[local179][local183] != null) {
						@Pc(199) Class4_Sub22[] local199 = this.aClass4_Sub22ArrayArrayArray1[local179][local183];
						@Pc(206) int[] local206 = this.anIntArrayArrayArray6[local179][local183];
						@Pc(213) int[] local213 = this.anIntArrayArrayArray5[local179][local183];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray9[local179][local183];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray7[local179][local183];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local179][local183];
						if (local220 == null) {
							local220 = local227;
						}
						@Pc(255) int[] local255 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local179][local183];
						@Pc(262) float local262 = this.aFloatArrayArray4[local179][local183];
						@Pc(269) float local269 = this.aFloatArrayArray5[local179][local183];
						@Pc(276) float local276 = this.aFloatArrayArray3[local179][local183];
						@Pc(285) float local285 = this.aFloatArrayArray4[local179][local183 + 1];
						@Pc(294) float local294 = this.aFloatArrayArray5[local179][local183 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray3[local179][local183 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray4[local179 + 1][local183 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray5[local179 + 1][local183 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray3[local179 + 1][local183 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray4[local179 + 1][local183];
						@Pc(354) float local354 = this.aFloatArrayArray5[local179 + 1][local183];
						@Pc(363) float local363 = this.aFloatArrayArray3[local179 + 1][local183];
						@Pc(371) int local371 = local21[local179][local183] & 0xFF;
						@Pc(381) int local381 = local21[local179][local183 + 1] & 0xFF;
						@Pc(393) int local393 = local21[local179 + 1][local183 + 1] & 0xFF;
						@Pc(403) int local403 = local21[local179 + 1][local183] & 0xFF;
						@Pc(405) int local405 = 0;
						@Pc(415) int local415;
						label331: for (@Pc(407) int local407 = 0; local407 < local227.length; local407++) {
							@Pc(413) Class4_Sub22 local413 = local199[local407];
							for (local415 = 0; local415 < local405; local415++) {
								if (local177[local415] == local413) {
									continue label331;
								}
							}
							local177[local405++] = local413;
						}
						@Pc(453) short[] local453 = this.aShortArrayArray6[local183 * super.anInt4730 + local179] = new short[local227.length];
						for (local415 = 0; local415 < local227.length; local415++) {
							@Pc(466) int local466 = (local179 << super.anInt4734) + local206[local415];
							@Pc(476) int local476 = (local183 << super.anInt4734) + local213[local415];
							@Pc(481) int local481 = local466 >> this.anInt4161;
							@Pc(486) int local486 = local476 >> this.anInt4161;
							@Pc(490) int local490 = local227[local415];
							@Pc(494) int local494 = local220[local415];
							@Pc(502) int local502 = local239 == null ? 0 : local239[local415];
							@Pc(520) long local520 = (long) (local481 << 16) | (long) local490 << 32 | (long) local494 << 48 | (long) local486;
							@Pc(524) int local524 = local206[local415];
							@Pc(528) int local528 = local213[local415];
							@Pc(530) byte local530 = 74;
							@Pc(532) int local532 = 0;
							@Pc(534) float local534 = 1.0F;
							@Pc(543) float local543;
							@Pc(551) float local551;
							@Pc(545) float local545;
							@Pc(633) float local633;
							@Pc(549) int local549;
							if (local524 == 0 && local528 == 0) {
								local543 = local262;
								local545 = local276;
								local549 = local530 - local371;
								local551 = local269;
							} else if (local524 == 0 && super.anInt4733 == local528) {
								local549 = local530 - local381;
								local551 = local294;
								local545 = local303;
								local543 = local285;
							} else if (super.anInt4733 == local524 && local528 == super.anInt4733) {
								local549 = local530 - local393;
								local551 = local325;
								local545 = local336;
								local543 = local314;
							} else if (local524 == super.anInt4733 && local528 == 0) {
								local545 = local363;
								local543 = local345;
								local551 = local354;
								local549 = local530 - local403;
							} else {
								@Pc(608) float local608 = (float) local524 / (float) super.anInt4733;
								@Pc(615) float local615 = (float) local528 / (float) super.anInt4733;
								@Pc(624) float local624 = local262 + local608 * (local345 - local262);
								local633 = local269 + (local354 - local269) * local608;
								@Pc(642) float local642 = (local363 - local276) * local608 + local276;
								@Pc(651) float local651 = local285 + local608 * (local314 - local285);
								@Pc(659) float local659 = local294 + local608 * (local325 - local294);
								local543 = (local651 - local624) * local615 + local624;
								@Pc(677) float local677 = local608 * (local336 - local303) + local303;
								local551 = local633 + (local659 - local633) * local615;
								local545 = local642 + (local677 - local642) * local615;
								@Pc(706) int local706 = local371 + ((local403 - local371) * local524 >> super.anInt4734);
								@Pc(718) int local718 = (local524 * (local393 - local381) >> super.anInt4734) + local381;
								local549 = local530 - local706 - (local528 * (local718 - local706) >> super.anInt4734);
							}
							if (local490 != -1) {
								@Pc(755) int local755 = local549 * (local490 & 0x7F) >> 7;
								if (local755 < 2) {
									local755 = 2;
								} else if (local755 > 126) {
									local755 = 126;
								}
								local532 = Static154.anIntArray246[local490 & 0xFF80 | local755];
								if ((this.anInt4165 & 0x7) == 0) {
									local534 = local545 * this.aClass30_Sub1_25.aFloatArray8[2] + local551 * this.aClass30_Sub1_25.aFloatArray8[1] + local543 * this.aClass30_Sub1_25.aFloatArray8[0];
									local534 = (local534 > 0.0F ? this.aClass30_Sub1_25.aFloat31 : this.aClass30_Sub1_25.aFloat35) * local534 + this.aClass30_Sub1_25.aFloat37;
								}
							}
							@Pc(831) Class4 local831 = null;
							if ((local466 & this.anInt4171 - 1) == 0 && (this.anInt4171 - 1 & local476) == 0) {
								local831 = local173.method4477(local520);
							}
							@Pc(864) int local864;
							@Pc(895) int local895;
							if (local831 == null) {
								if (local494 == local490) {
									local895 = local532;
								} else {
									@Pc(905) int local905 = (local494 & 0x7F) * local549 >> 7;
									if (local905 < 2) {
										local905 = 2;
									} else if (local905 > 126) {
										local905 = 126;
									}
									local895 = Static154.anIntArray246[local494 & 0xFF80 | local905];
									if ((this.anInt4165 & 0x7) == 0) {
										local633 = local545 * this.aClass30_Sub1_25.aFloatArray8[2] + this.aClass30_Sub1_25.aFloatArray8[1] * local551 + local543 * this.aClass30_Sub1_25.aFloatArray8[0];
										local633 = local534 * (local534 > 0.0F ? this.aClass30_Sub1_25.aFloat31 : this.aClass30_Sub1_25.aFloat35) + this.aClass30_Sub1_25.aFloat37;
										@Pc(983) int local983 = local895 >> 16 & 0xFF;
										@Pc(989) int local989 = local895 >> 8 & 0xFF;
										local983 = (int) ((float) local983 * local633);
										@Pc(999) int local999 = local895 & 0xFF;
										local989 = (int) ((float) local989 * local633);
										if (local983 < 0) {
											local983 = 0;
										} else if (local983 > 255) {
											local983 = 255;
										}
										local999 = (int) ((float) local999 * local633);
										if (local989 < 0) {
											local989 = 0;
										} else if (local989 > 255) {
											local989 = 255;
										}
										if (local999 < 0) {
											local999 = 0;
										} else if (local999 > 255) {
											local999 = 255;
										}
										local895 = local999 | local989 << 8 | local983 << 16;
									}
								}
								if (this.aClass30_Sub1_25.aBoolean76) {
									local159.b((float) local466);
									local159.b((float) (local502 + this.va(local466, local476)));
									local159.b((float) local476);
									local159.b((byte) (local895 >> 16));
									local159.b((byte) (local895 >> 8));
									local159.b((byte) local895);
									local159.b(-1);
									local159.b((float) local466);
									local159.b((float) local476);
									if (this.anIntArrayArrayArray8 != null) {
										local159.b((float) (local255 == null ? 0 : local255[local415] - 1));
									}
									if ((this.anInt4165 & 0x7) != 0) {
										local159.b(local543);
										local159.b(local551);
										local159.b(local545);
									}
								} else {
									local159.a((float) local466);
									local159.a((float) (local502 + this.va(local466, local476)));
									local159.a((float) local476);
									local159.b((byte) (local895 >> 16));
									local159.b((byte) (local895 >> 8));
									local159.b((byte) local895);
									local159.b(-1);
									local159.a((float) local466);
									local159.a((float) local476);
									if (this.anIntArrayArrayArray8 != null) {
										local159.a((float) (local255 == null ? 0 : local255[local415] - 1));
									}
									if ((this.anInt4165 & 0x7) != 0) {
										local159.a(local543);
										local159.a(local551);
										local159.a(local545);
									}
								}
								local864 = this.anInt4164++;
								local453[local415] = (short) local864;
								if (local490 != -1) {
									local163[local864] = local199[local415];
								}
								local173.method4474(local520, new Class4_Sub37(local453[local415]));
							} else {
								local453[local415] = ((Class4_Sub37) local831).aShort86;
								local864 = local453[local415] & 0xFFFF;
								if (local490 != -1 && local163[local864].aLong225 > local199[local415].aLong225) {
									local163[local864] = local199[local415];
								}
							}
							for (local895 = 0; local895 < local405; local895++) {
								local177[local895].method2547(local549, local534, local532, local864);
							}
							this.anInt4152++;
						}
					}
				}
			}
			for (local183 = 0; local183 < this.anInt4164; local183++) {
				@Pc(1303) Class4_Sub22 local1303 = local163[local183];
				if (local1303 != null) {
					local1303.method2542(local183);
				}
			}
			@Pc(1336) int local1336;
			for (@Pc(1316) int local1316 = 0; super.anInt4730 > local1316; local1316++) {
				for (@Pc(1320) int local1320 = 0; local1320 < super.anInt4732; local1320++) {
					@Pc(1332) short[] local1332 = this.aShortArrayArray6[local1320 * super.anInt4730 + local1316];
					if (local1332 != null) {
						local1336 = 0;
						@Pc(1338) int local1338 = 0;
						while (local1338 < local1332.length) {
							@Pc(1347) int local1347 = local1332[local1338++] & 0xFFFF;
							@Pc(1354) int local1354 = local1332[local1338++] & 0xFFFF;
							@Pc(1361) int local1361 = local1332[local1338++] & 0xFFFF;
							@Pc(1365) Class4_Sub22 local1365 = local163[local1347];
							@Pc(1369) Class4_Sub22 local1369 = local163[local1354];
							@Pc(1373) Class4_Sub22 local1373 = local163[local1361];
							@Pc(1375) Class4_Sub22 local1375 = null;
							if (local1365 != null) {
								local1365.method2546(local1316, local1336, local1320);
								local1375 = local1365;
							}
							if (local1369 != null) {
								local1369.method2546(local1316, local1336, local1320);
								if (local1375 == null || local1375.aLong225 > local1369.aLong225) {
									local1375 = local1369;
								}
							}
							if (local1373 != null) {
								local1373.method2546(local1316, local1336, local1320);
								if (local1375 == null || local1373.aLong225 < local1375.aLong225) {
									local1375 = local1373;
								}
							}
							if (local1375 != null) {
								if (local1365 != null) {
									local1375.method2542(local1347);
								}
								if (local1369 != null) {
									local1375.method2542(local1354);
								}
								if (local1373 != null) {
									local1375.method2542(local1361);
								}
								local1375.method2546(local1316, local1336, local1320);
							}
							local1336++;
						}
					}
				}
			}
			local159.b();
			this.anInterface6_5 = this.aClass30_Sub1_25.method902(local135, local159.c(), local154);
			this.aClass124_11 = new Class124(this.anInterface6_5, 5126, 3, 0);
			this.aClass124_9 = new Class124(this.anInterface6_5, 5121, 4, 12);
			@Pc(1526) byte local1526;
			if (this.anIntArrayArrayArray8 == null) {
				this.aClass124_8 = new Class124(this.anInterface6_5, 5126, 2, 16);
				local1526 = 24;
			} else {
				this.aClass124_8 = new Class124(this.anInterface6_5, 5126, 3, 16);
				local1526 = 28;
			}
			if ((this.anInt4165 & 0x7) != 0) {
				this.aClass124_10 = new Class124(this.anInterface6_5, 5126, 3, local1526);
			}
			@Pc(1563) long[] local1563 = new long[this.aClass4_Sub22Array1.length];
			for (local1336 = 0; local1336 < this.aClass4_Sub22Array1.length; local1336++) {
				@Pc(1572) Class4_Sub22 local1572 = this.aClass4_Sub22Array1[local1336];
				local1563[local1336] = local1572.aLong225;
				local1572.method2545(this.anInt4164);
			}
			Static124.method1885(local1563, this.aClass4_Sub22Array1);
			if (this.aClass231_2 != null) {
				this.aClass231_2.method5222();
			}
		} else {
			this.aClass231_2 = null;
		}
		this.anIntArrayArrayArray7 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray5 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass196_19 = null;
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray5 = null;
		this.lb = null;
		this.aClass4_Sub22ArrayArrayArray1 = null;
		this.anIntArrayArrayArray4 = null;
	}
}
