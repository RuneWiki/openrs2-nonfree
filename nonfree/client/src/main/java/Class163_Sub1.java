import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class163_Sub1 extends Class163 {

	@OriginalMember(owner = "client!on", name = "H", descriptor = "I")
	private int anInt4820;

	@OriginalMember(owner = "client!on", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!on", name = "O", descriptor = "I")
	private int anInt4824;

	@OriginalMember(owner = "client!on", name = "W", descriptor = "I")
	private int anInt4828;

	@OriginalMember(owner = "client!on", name = "X", descriptor = "Lclient!bg;")
	public Class21 aClass21_9;

	@OriginalMember(owner = "client!on", name = "ab", descriptor = "Lclient!bg;")
	public Class21 aClass21_10;

	@OriginalMember(owner = "client!on", name = "cb", descriptor = "Lclient!bg;")
	public Class21 aClass21_11;

	@OriginalMember(owner = "client!on", name = "db", descriptor = "Lclient!nc;")
	private Interface10 anInterface10_6;

	@OriginalMember(owner = "client!on", name = "eb", descriptor = "Lclient!bg;")
	private Class21 aClass21_12;

	@OriginalMember(owner = "client!on", name = "fb", descriptor = "[Lclient!kq;")
	private Class1_Sub23[] aClass1_Sub23Array1;

	@OriginalMember(owner = "client!on", name = "gb", descriptor = "I")
	private int anInt4829;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Lclient!vp;")
	private final Class254 aClass254_38 = new Class254();

	@OriginalMember(owner = "client!on", name = "J", descriptor = "[[I")
	private final int[][] anIntArrayArray116;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "I")
	private final int anInt4812;

	@OriginalMember(owner = "client!on", name = "D", descriptor = "Lclient!od;")
	public final Class128_Sub2 aClass128_Sub2_29;

	@OriginalMember(owner = "client!on", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!on", name = "Q", descriptor = "[[B")
	private final byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!on", name = "F", descriptor = "[[S")
	public final short[][] aShortArrayArray23;

	@OriginalMember(owner = "client!on", name = "R", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!on", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!on", name = "V", descriptor = "[[B")
	private byte[][] aByteArrayArray35;

	@OriginalMember(owner = "client!on", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	private final int anInt4806;

	@OriginalMember(owner = "client!on", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!on", name = "U", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!on", name = "I", descriptor = "[[[Lclient!kq;")
	private Class1_Sub23[][][] aClass1_Sub23ArrayArrayArray1;

	@OriginalMember(owner = "client!on", name = "z", descriptor = "I")
	public final int anInt4816;

	@OriginalMember(owner = "client!on", name = "bb", descriptor = "Lclient!wa;")
	private Class257 aClass257_19;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "Lclient!gf;")
	private Class92 aClass92_2;

	static {
		new Class151(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!od;IIII[[I[[II)V")
	public Class163_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray116 = arg5;
		this.anInt4812 = super.anInt5797 - 2;
		this.aClass128_Sub2_29 = arg0;
		this.aFloatArrayArray14 = new float[super.anInt5796 + 1][super.anInt5795 + 1];
		this.aByteArrayArray34 = new byte[arg3][arg4];
		this.aShortArrayArray23 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aByteArrayArray35 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anInt4806 = 0x1 << this.anInt4812;
		this.aFloatArrayArray15 = new float[super.anInt5796 + 1][super.anInt5795 + 1];
		this.aFloatArrayArray13 = new float[super.anInt5796 + 1][super.anInt5795 + 1];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aClass1_Sub23ArrayArrayArray1 = new Class1_Sub23[arg3][arg4][];
		this.anInt4816 = arg2;
		for (@Pc(117) int local117 = 1; super.anInt5795 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt5796 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(155) int local155 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local139 * local139 + arg7 * arg7 * 4 + local155 * local155)));
				this.aFloatArrayArray13[local121][local117] = local176 * (float) local139;
				this.aFloatArrayArray14[local121][local117] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray15[local121][local117] = local176 * (float) local155;
			}
		}
		this.aClass257_19 = new Class257(128);
		if ((this.anInt4816 & 0x10) != 0) {
			this.aClass92_2 = new Class92(this.aClass128_Sub2_29, this);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3819(arg0, arg3, arg4, arg2, arg1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4516(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4829 <= 0) {
			return;
		}
		this.aClass128_Sub2_29.method3643();
		this.aClass128_Sub2_29.method3656(false);
		this.aClass128_Sub2_29.method3621(false);
		this.aClass128_Sub2_29.method3659(false);
		this.aClass128_Sub2_29.method3668(false);
		this.aClass128_Sub2_29.method3653(0);
		this.aClass128_Sub2_29.method3652(-2);
		this.aClass128_Sub2_29.method3691(null);
		Static341.aFloatArray28[3] = 0.0F;
		Static341.aFloatArray28[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass128_Sub2_29.anInt4562;
		Static341.aFloatArray28[15] = 1.0F;
		Static341.aFloatArray28[8] = 0.0F;
		Static341.aFloatArray28[1] = 0.0F;
		Static341.aFloatArray28[5] = (float) 1024 / ((float) super.anInt5792 * 128.0F * (float) this.aClass128_Sub2_29.anInt4562);
		Static341.aFloatArray28[11] = 0.0F;
		Static341.aFloatArray28[6] = 0.0F;
		Static341.aFloatArray28[9] = 0.0F;
		Static341.aFloatArray28[2] = 0.0F;
		Static341.aFloatArray28[10] = 0.0F;
		Static341.aFloatArray28[4] = 0.0F;
		Static341.aFloatArray28[7] = 0.0F;
		Static341.aFloatArray28[14] = 0.0F;
		Static341.aFloatArray28[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass128_Sub2_29.anInt4455) - 1.0F;
		Static341.aFloatArray28[0] = (float) 1024 / ((float) this.aClass128_Sub2_29.anInt4455 * (float) super.anInt5792 * 128.0F);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static341.aFloatArray28, 0);
		Static341.aFloatArray28[14] = 0.0F;
		Static341.aFloatArray28[15] = 1.0F;
		Static341.aFloatArray28[5] = 0.0F;
		Static341.aFloatArray28[11] = 0.0F;
		Static341.aFloatArray28[10] = 0.0F;
		Static341.aFloatArray28[6] = 1.0F;
		Static341.aFloatArray28[1] = 0.0F;
		Static341.aFloatArray28[7] = 0.0F;
		Static341.aFloatArray28[13] = 0.0F;
		Static341.aFloatArray28[4] = 0.0F;
		Static341.aFloatArray28[8] = 0.0F;
		Static341.aFloatArray28[0] = 1.0F;
		Static341.aFloatArray28[12] = 0.0F;
		Static341.aFloatArray28[9] = 1.0F;
		Static341.aFloatArray28[3] = 0.0F;
		Static341.aFloatArray28[2] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static341.aFloatArray28, 0);
		if ((this.anInt4816 & 0x7) == 0) {
			this.aClass128_Sub2_29.method3621(false);
		} else {
			this.aClass128_Sub2_29.method3621(true);
			this.aClass128_Sub2_29.method3678();
		}
		this.aClass128_Sub2_29.method3664(this.aClass21_11, this.aClass21_12, this.aClass21_9, this.aClass21_10);
		if (Static298.aClass1_Sub11_5.aByteArray64.length < this.anInt4820 * 2) {
			Static298.aClass1_Sub11_5 = new Class1_Sub11(this.anInt4820 * 2);
		} else {
			Static298.aClass1_Sub11_5.anInt5766 = 0;
		}
		@Pc(305) int local305 = 0;
		@Pc(311) int local311;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(340) short[] local340;
		@Pc(344) int local344;
		if (this.aClass128_Sub2_29.aBoolean360) {
			for (local311 = arg1; local311 < arg3; local311++) {
				local320 = local311 * super.anInt5796 + arg0;
				for (local322 = arg0; local322 < arg2; local322++) {
					if (arg4[local322 - arg0][local311 - arg1]) {
						local340 = this.aShortArrayArray23[local320];
						if (local340 != null) {
							for (local344 = 0; local344 < local340.length; local344++) {
								local305++;
								Static298.aClass1_Sub11_5.method4448(local340[local344] & 0xFFFF);
							}
						}
					}
					local320++;
				}
			}
		} else {
			for (local311 = arg1; local311 < arg3; local311++) {
				local320 = super.anInt5796 * local311 + arg0;
				for (local322 = arg0; local322 < arg2; local322++) {
					if (arg4[local322 - arg0][local311 - arg1]) {
						local340 = this.aShortArrayArray23[local320];
						if (local340 != null) {
							for (local344 = 0; local344 < local340.length; local344++) {
								Static298.aClass1_Sub11_5.method4488(local340[local344] & 0xFFFF);
								local305++;
							}
						}
					}
					local320++;
				}
			}
		}
		if (local305 > 0) {
			@Pc(457) Class154_Sub2 local457 = new Class154_Sub2(this.aClass128_Sub2_29, 5123, Static298.aClass1_Sub11_5.aByteArray64, Static298.aClass1_Sub11_5.anInt5766);
			this.aClass128_Sub2_29.method3627(local305, 0, local457);
		}
	}

	@OriginalMember(owner = "client!on", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class1_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass92_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass128_Sub2_29.anInt4628 * arg2 >> 8) >> this.aClass128_Sub2_29.anInt4606;
			@Pc(38) int local38 = arg3 - (this.aClass128_Sub2_29.anInt4635 * arg2 >> 8) >> this.aClass128_Sub2_29.anInt4606;
			this.aClass92_2.method1788(arg0, local38, local23);
		}
	}

	@OriginalMember(owner = "client!on", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray35[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray35[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II[[ZZIII)V")
	private void method3819(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.aClass1_Sub23Array1 == null) {
			return;
		}
		@Pc(12) float local12 = this.aClass128_Sub2_29.aFloat62;
		@Pc(16) float local16 = this.aClass128_Sub2_29.aFloat73;
		@Pc(22) int local22 = arg3 + arg3 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (local26 > Static307.anIntArray300.length) {
			Static307.anIntArray300 = new int[local26];
		}
		if (this.anInt4820 * 2 > Static298.aClass1_Sub11_5.aByteArray64.length) {
			Static298.aClass1_Sub11_5 = new Class1_Sub11(this.anInt4820 * 2);
		}
		@Pc(54) int local54 = arg0 - arg3;
		@Pc(56) int local56 = local54;
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(65) int local65 = arg4 - arg3;
		@Pc(67) int local67 = local65;
		if (local65 < 0) {
			local65 = 0;
		}
		@Pc(75) int local75 = arg3 + arg0;
		if (super.anInt5796 - 1 < local75) {
			local75 = super.anInt5796 - 1;
		}
		@Pc(90) int local90 = arg3 + arg4;
		if (super.anInt5795 - 1 < local90) {
			local90 = super.anInt5795 - 1;
		}
		Static282.anInt4534 = 0;
		@Pc(116) int local116;
		for (@Pc(105) int local105 = local54; local105 <= local75; local105++) {
			@Pc(114) boolean[] local114 = arg1[local105 - local56];
			for (local116 = local65; local116 <= local90; local116++) {
				if (local114[local116 - local67]) {
					Static307.anIntArray300[Static282.anInt4534++] = local105 + local116 * super.anInt5796;
				}
			}
		}
		this.aClass128_Sub2_29.method3633();
		this.aClass128_Sub2_29.method3621((this.anInt4816 & 0x7) != 0);
		for (@Pc(184) int local184 = 0; local184 < this.aClass1_Sub23Array1.length; local184++) {
			this.aClass1_Sub23Array1[local184].method2853(Static307.anIntArray300, Static282.anInt4534);
		}
		if (!this.aClass254_38.method5444()) {
			local116 = this.aClass128_Sub2_29.anInt4645;
			@Pc(213) int local213 = this.aClass128_Sub2_29.anInt4636;
			this.aClass128_Sub2_29.V(0, local213, this.aClass128_Sub2_29.anInt4650);
			this.aClass128_Sub2_29.o(local16, local12 - 4.0F);
			this.aClass128_Sub2_29.method3621(false);
			this.aClass128_Sub2_29.method3668(false);
			this.aClass128_Sub2_29.method3653(128);
			this.aClass128_Sub2_29.method3652(-2);
			this.aClass128_Sub2_29.method3691(this.aClass128_Sub2_29.aClass5_Sub1_4);
			this.aClass128_Sub2_29.method3622(7681, 8448);
			this.aClass128_Sub2_29.method3647(34166, 770, 0);
			this.aClass128_Sub2_29.method3626(0, 34167);
			for (@Pc(284) Class1 local284 = this.aClass254_38.method5437(); local284 != null; local284 = this.aClass254_38.method5433()) {
				@Pc(289) Class1_Sub18 local289 = (Class1_Sub18) local284;
				local289.method2094(arg0, arg1, arg4, arg3);
			}
			this.aClass128_Sub2_29.method3647(5890, 768, 0);
			this.aClass128_Sub2_29.method3626(0, 5890);
			this.aClass128_Sub2_29.method3691(null);
			this.aClass128_Sub2_29.V(local116, local213, this.aClass128_Sub2_29.anInt4650);
		}
		if (this.aClass92_2 != null) {
			this.aClass128_Sub2_29.o(local16, local12 - 8.0F);
			this.aClass128_Sub2_29.method3633();
			this.aClass128_Sub2_29.method3664(this.aClass21_11, null, null, this.aClass21_10);
			this.aClass92_2.method1790(arg2, arg0, arg1, arg3, arg4);
		}
		this.aClass128_Sub2_29.o(local16, local12);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
	@Override
	public void method4517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!on", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class1_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass92_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass128_Sub2_29.anInt4628 >> 8) >> this.aClass128_Sub2_29.anInt4606;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass128_Sub2_29.anInt4635 >> 8) >> this.aClass128_Sub2_29.anInt4606;
			this.aClass92_2.method1792(local24, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!kt;[I)V")
	@Override
	public void method4515(@OriginalArg(0) Class1_Sub24 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass254_38.method5430(new Class1_Sub18(this.aClass128_Sub2_29, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!on", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt5797;
		@Pc(13) int local13 = arg1 >> super.anInt5797;
		if (local8 < 0 || local13 < 0 || super.anInt5796 - 1 < local8 || super.anInt5795 - 1 < local13) {
			return 0;
		}
		@Pc(52) int local52 = super.anInt5792 - 1 & arg0;
		@Pc(59) int local59 = arg1 & super.anInt5792 - 1;
		@Pc(85) int local85 = this.anIntArrayArray116[local8][local13] * (super.anInt5792 - local52) + local52 * this.anIntArrayArray116[local8 + 1][local13] >> super.anInt5797;
		@Pc(115) int local115 = (super.anInt5792 - local52) * this.anIntArrayArray116[local8][local13 + 1] + this.anIntArrayArray116[local8 + 1][local13 + 1] * local52 >> super.anInt5797;
		return local59 * local115 + local85 * (super.anInt5792 - local59) >> super.anInt5797;
	}

	@OriginalMember(owner = "client!on", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class1_Sub3_Sub10 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub10 arg2) {
		if ((this.aByteArrayArray34[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt5792 >> this.aClass128_Sub2_29.anInt4606;
		@Pc(27) Class1_Sub3_Sub10_Sub1 local27 = (Class1_Sub3_Sub10_Sub1) arg2;
		@Pc(37) Class1_Sub3_Sub10_Sub1 local37;
		if (local27 != null && local27.method4181(local24, local24)) {
			local37 = local27;
			local27.method4177();
		} else {
			local37 = new Class1_Sub3_Sub10_Sub1(this.aClass128_Sub2_29, local24, local24);
		}
		local37.method4182(0, 0, local24, local24);
		this.method3821(local37, arg1, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!qf;IZI)V")
	private void method3821(@OriginalArg(0) Class1_Sub3_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray10[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg2][arg1];
		@Pc(28) int local28 = local12.length;
		if (local28 > Static128.anIntArray105.length) {
			Static54.anIntArray47 = new int[local28];
			Static128.anIntArray105 = new int[local28];
		}
		for (@Pc(40) int local40 = 0; local40 < local28; local40++) {
			Static128.anIntArray105[local40] = (local12[local40] & 0xFF) >> this.aClass128_Sub2_29.anInt4606;
			Static54.anIntArray47[local40] = (local19[local40] & 0xFF) >> this.aClass128_Sub2_29.anInt4606;
		}
		@Pc(72) int local72 = 0;
		while (local72 < local28) {
			@Pc(78) int local78 = Static128.anIntArray105[local72];
			@Pc(83) int local83 = Static54.anIntArray47[local72++];
			@Pc(87) int local87 = Static128.anIntArray105[local72];
			@Pc(92) int local92 = Static54.anIntArray47[local72++];
			@Pc(96) int local96 = Static128.anIntArray105[local72];
			@Pc(101) int local101 = Static54.anIntArray47[local72++];
			if (-((local92 - local83) * (local96 + -local87)) + (local78 - local87) * (-local101 + local92) > 0) {
				arg0.method4176(local96, local92, local78, local83, local101, local87);
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "()V")
	@Override
	public void f() {
		if (this.anInt4829 <= 0) {
			this.aClass92_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt5796 + 1][super.anInt5795 + 1];
			@Pc(32) int local32;
			for (@Pc(28) int local28 = 1; local28 < super.anInt5796; local28++) {
				for (local32 = 1; super.anInt5795 > local32; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray35[local28 + 1][local32] >> 3) + (this.aByteArrayArray35[local28 - 1][local32] >> 2) + (this.aByteArrayArray35[local28][local32 + -1] >> 2) + (this.aByteArrayArray35[local28][local32 + 1] >> 3) + (this.aByteArrayArray35[local28][local32] >> 1));
				}
			}
			this.aClass1_Sub23Array1 = new Class1_Sub23[this.aClass257_19.method5500()];
			this.aClass257_19.method5497(this.aClass1_Sub23Array1);
			for (local32 = 0; local32 < this.aClass1_Sub23Array1.length; local32++) {
				this.aClass1_Sub23Array1[local32].method2845(this.anInt4829);
			}
			@Pc(148) int local148 = 24;
			if (this.anIntArrayArrayArray11 != null) {
				local148 += 4;
			}
			if ((this.anInt4816 & 0x7) != 0) {
				local148 += 12;
			}
			@Pc(170) NativeBuffer local170 = this.aClass128_Sub2_29.aNativeHeap2.a(this.anInt4829 * local148);
			@Pc(175) NativeStream local175 = new NativeStream(local170);
			@Pc(179) Class1_Sub23[] local179 = new Class1_Sub23[this.anInt4829];
			@Pc(186) int local186 = Static320.method4122(this.anInt4829 / 4);
			if (local186 < 1) {
				local186 = 1;
			}
			@Pc(196) Class257 local196 = new Class257(local186);
			@Pc(200) Class1_Sub23[] local200 = new Class1_Sub23[this.anInt4828];
			@Pc(206) int local206;
			for (@Pc(202) int local202 = 0; super.anInt5796 > local202; local202++) {
				for (local206 = 0; local206 < super.anInt5795; local206++) {
					if (this.anIntArrayArrayArray9[local202][local206] != null) {
						@Pc(222) Class1_Sub23[] local222 = this.aClass1_Sub23ArrayArrayArray1[local202][local206];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray10[local202][local206];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray7[local202][local206];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray12[local202][local206];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray9[local202][local206];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local202][local206];
						@Pc(274) int[] local274 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local202][local206];
						if (local243 == null) {
							local243 = local250;
						}
						@Pc(285) float local285 = this.aFloatArrayArray13[local202][local206];
						@Pc(292) float local292 = this.aFloatArrayArray14[local202][local206];
						@Pc(299) float local299 = this.aFloatArrayArray15[local202][local206];
						@Pc(308) float local308 = this.aFloatArrayArray13[local202][local206 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray14[local202][local206 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray15[local202][local206 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray13[local202 + 1][local206 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray14[local202 + 1][local206 + 1];
						@Pc(359) float local359 = this.aFloatArrayArray15[local202 + 1][local206 + 1];
						@Pc(368) float local368 = this.aFloatArrayArray13[local202 + 1][local206];
						@Pc(377) float local377 = this.aFloatArrayArray14[local202 + 1][local206];
						@Pc(386) float local386 = this.aFloatArrayArray15[local202 + 1][local206];
						@Pc(394) int local394 = local26[local202][local206] & 0xFF;
						@Pc(404) int local404 = local26[local202][local206 + 1] & 0xFF;
						@Pc(416) int local416 = local26[local202 + 1][local206 + 1] & 0xFF;
						@Pc(426) int local426 = local26[local202 + 1][local206] & 0xFF;
						@Pc(428) int local428 = 0;
						@Pc(438) int local438;
						label337: for (@Pc(430) int local430 = 0; local430 < local250.length; local430++) {
							@Pc(436) Class1_Sub23 local436 = local222[local430];
							for (local438 = 0; local438 < local428; local438++) {
								if (local200[local438] == local436) {
									continue label337;
								}
							}
							local200[local428++] = local436;
						}
						@Pc(480) short[] local480 = this.aShortArrayArray23[super.anInt5796 * local206 + local202] = new short[local250.length];
						for (local438 = 0; local438 < local250.length; local438++) {
							@Pc(493) int local493 = (local202 << super.anInt5797) + local229[local438];
							@Pc(502) int local502 = (local206 << super.anInt5797) + local236[local438];
							@Pc(507) int local507 = local493 >> this.anInt4812;
							@Pc(512) int local512 = local502 >> this.anInt4812;
							@Pc(516) int local516 = local250[local438];
							@Pc(520) int local520 = local243[local438];
							@Pc(528) int local528 = local262 == null ? 0 : local262[local438];
							@Pc(546) long local546 = (long) (local507 << 16) | (long) local516 << 32 | (long) local520 << 48 | (long) local512;
							@Pc(550) int local550 = local229[local438];
							@Pc(554) int local554 = local236[local438];
							@Pc(556) byte local556 = 74;
							@Pc(558) int local558 = 0;
							@Pc(567) float local567;
							@Pc(575) float local575;
							@Pc(573) float local573;
							@Pc(654) float local654;
							@Pc(571) int local571;
							if (local550 == 0 && local554 == 0) {
								local567 = local285;
								local571 = local556 - local394;
								local573 = local299;
								local575 = local292;
							} else if (local550 == 0 && local554 == super.anInt5792) {
								local571 = local556 - local404;
								local567 = local308;
								local575 = local317;
								local573 = local326;
							} else if (local550 == super.anInt5792 && local554 == super.anInt5792) {
								local573 = local359;
								local567 = local337;
								local575 = local348;
								local571 = local556 - local416;
							} else if (local550 == super.anInt5792 && local554 == 0) {
								local567 = local368;
								local573 = local386;
								local575 = local377;
								local571 = local556 - local426;
							} else {
								@Pc(631) float local631 = (float) local550 / (float) super.anInt5792;
								@Pc(638) float local638 = (float) local554 / (float) super.anInt5792;
								@Pc(646) float local646 = local285 + (local368 - local285) * local631;
								local654 = local631 * (local377 - local292) + local292;
								@Pc(663) float local663 = (local386 - local299) * local631 + local299;
								@Pc(672) float local672 = (local337 - local308) * local631 + local308;
								@Pc(681) float local681 = local317 + (local348 - local317) * local631;
								@Pc(690) float local690 = local326 + (local359 - local326) * local631;
								local567 = (local672 - local646) * local638 + local646;
								local575 = local654 + local638 * (local681 - local654);
								local573 = (local690 - local663) * local638 + local663;
								@Pc(725) int local725 = (local550 * (local426 - local394) >> super.anInt5797) + local394;
								@Pc(738) int local738 = local404 + ((local416 - local404) * local550 >> super.anInt5797);
								local571 = local556 - (local554 * (local738 - local725) >> super.anInt5797) - local725;
							}
							@Pc(778) float local778 = 1.0F;
							if (local516 != -1) {
								@Pc(790) int local790 = (local516 & 0x7F) * local571 >> 7;
								if (local790 < 2) {
									local790 = 2;
								} else if (local790 > 126) {
									local790 = 126;
								}
								if ((this.anInt4816 & 0x7) == 0) {
									local778 = local573 * this.aClass128_Sub2_29.aFloatArray23[2] + this.aClass128_Sub2_29.aFloatArray23[1] * local575 + local567 * this.aClass128_Sub2_29.aFloatArray23[0];
									local778 = this.aClass128_Sub2_29.aFloat59 + (local778 > 0.0F ? this.aClass128_Sub2_29.aFloat54 : this.aClass128_Sub2_29.aFloat57) * local778;
								}
								local558 = Static55.anIntArray48[local516 & 0xFF80 | local790];
							}
							@Pc(864) Class1 local864 = null;
							if ((this.anInt4806 - 1 & local493) == 0 && (this.anInt4806 - 1 & local502) == 0) {
								local864 = local196.method5503(local546);
							}
							@Pc(903) int local903;
							@Pc(958) int local958;
							if (local864 == null) {
								if (local516 == local520) {
									local958 = local558;
								} else {
									@Pc(936) int local936 = local571 * (local520 & 0x7F) >> 7;
									if (local936 < 2) {
										local936 = 2;
									} else if (local936 > 126) {
										local936 = 126;
									}
									local958 = Static55.anIntArray48[local936 | local520 & 0xFF80];
									if ((this.anInt4816 & 0x7) == 0) {
										local654 = local575 * this.aClass128_Sub2_29.aFloatArray23[1] + this.aClass128_Sub2_29.aFloatArray23[0] * local567 + local573 * this.aClass128_Sub2_29.aFloatArray23[2];
										local654 = (local778 > 0.0F ? this.aClass128_Sub2_29.aFloat54 : this.aClass128_Sub2_29.aFloat57) * local778 + this.aClass128_Sub2_29.aFloat59;
										@Pc(1011) int local1011 = local958 >> 16 & 0xFF;
										@Pc(1017) int local1017 = local958 >> 8 & 0xFF;
										local1011 = (int) ((float) local1011 * local654);
										@Pc(1027) int local1027 = local958 & 0xFF;
										if (local1011 < 0) {
											local1011 = 0;
										} else if (local1011 > 255) {
											local1011 = 255;
										}
										local1017 = (int) ((float) local1017 * local654);
										local1027 = (int) ((float) local1027 * local654);
										if (local1017 < 0) {
											local1017 = 0;
										} else if (local1017 > 255) {
											local1017 = 255;
										}
										if (local1027 < 0) {
											local1027 = 0;
										} else if (local1027 > 255) {
											local1027 = 255;
										}
										local958 = local1027 | local1011 << 16 | local1017 << 8;
									}
								}
								if (this.aClass128_Sub2_29.aBoolean360) {
									local175.a((float) local493);
									local175.a((float) (this.va(local493, local502) + local528));
									local175.a((float) local502);
									local175.a((byte) (local958 >> 16));
									local175.a((byte) (local958 >> 8));
									local175.a((byte) local958);
									local175.a(-1);
									local175.a((float) local493);
									local175.a((float) local502);
									if (this.anIntArrayArrayArray11 != null) {
										local175.a((float) (local274 == null ? 0 : local274[local438] - 1));
									}
									if ((this.anInt4816 & 0x7) != 0) {
										local175.a(local567);
										local175.a(local575);
										local175.a(local573);
									}
								} else {
									local175.b((float) local493);
									local175.b((float) (local528 + this.va(local493, local502)));
									local175.b((float) local502);
									local175.a((byte) (local958 >> 16));
									local175.a((byte) (local958 >> 8));
									local175.a((byte) local958);
									local175.a(-1);
									local175.b((float) local493);
									local175.b((float) local502);
									if (this.anIntArrayArrayArray11 != null) {
										local175.b((float) (local274 == null ? 0 : local274[local438] - 1));
									}
									if ((this.anInt4816 & 0x7) != 0) {
										local175.b(local567);
										local175.b(local575);
										local175.b(local573);
									}
								}
								local903 = this.anInt4824++;
								local480[local438] = (short) local903;
								if (local516 != -1) {
									local179[local903] = local222[local438];
								}
								local196.method5504(new Class1_Sub39(local480[local438]), local546);
							} else {
								local480[local438] = ((Class1_Sub39) local864).aShort75;
								local903 = local480[local438] & 0xFFFF;
								if (local516 != -1 && local222[local438].aLong226 < local179[local903].aLong226) {
									local179[local903] = local222[local438];
								}
							}
							for (local958 = 0; local958 < local428; local958++) {
								local200[local958].method2848(local571, local903, local778, local558);
							}
							this.anInt4820++;
						}
					}
				}
			}
			for (local206 = 0; local206 < this.anInt4824; local206++) {
				@Pc(1342) Class1_Sub23 local1342 = local179[local206];
				if (local1342 != null) {
					local1342.method2852(local206);
				}
			}
			@Pc(1375) int local1375;
			for (@Pc(1355) int local1355 = 0; local1355 < super.anInt5796; local1355++) {
				for (@Pc(1359) int local1359 = 0; local1359 < super.anInt5795; local1359++) {
					@Pc(1371) short[] local1371 = this.aShortArrayArray23[local1359 * super.anInt5796 + local1355];
					if (local1371 != null) {
						local1375 = 0;
						@Pc(1377) int local1377 = 0;
						while (local1377 < local1371.length) {
							@Pc(1386) int local1386 = local1371[local1377++] & 0xFFFF;
							@Pc(1393) int local1393 = local1371[local1377++] & 0xFFFF;
							@Pc(1400) int local1400 = local1371[local1377++] & 0xFFFF;
							@Pc(1404) Class1_Sub23 local1404 = local179[local1386];
							@Pc(1408) Class1_Sub23 local1408 = local179[local1393];
							@Pc(1412) Class1_Sub23 local1412 = local179[local1400];
							@Pc(1414) Class1_Sub23 local1414 = null;
							if (local1404 != null) {
								local1414 = local1404;
								local1404.method2849(local1375, local1359, local1355);
							}
							if (local1408 != null) {
								local1408.method2849(local1375, local1359, local1355);
								if (local1414 == null || local1408.aLong226 < local1414.aLong226) {
									local1414 = local1408;
								}
							}
							if (local1412 != null) {
								local1412.method2849(local1375, local1359, local1355);
								if (local1414 == null || local1412.aLong226 < local1414.aLong226) {
									local1414 = local1412;
								}
							}
							if (local1414 != null) {
								if (local1404 != null) {
									local1414.method2852(local1386);
								}
								if (local1408 != null) {
									local1414.method2852(local1393);
								}
								if (local1412 != null) {
									local1414.method2852(local1400);
								}
								local1414.method2849(local1375, local1359, local1355);
							}
							local1375++;
						}
					}
				}
			}
			local175.a();
			this.anInterface10_6 = this.aClass128_Sub2_29.method3623(local175.b(), local170, local148);
			this.aClass21_10 = new Class21(this.anInterface10_6, 5126, 3, 0);
			this.aClass21_12 = new Class21(this.anInterface10_6, 5121, 4, 12);
			@Pc(1561) byte local1561;
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass21_11 = new Class21(this.anInterface10_6, 5126, 2, 16);
				local1561 = 24;
			} else {
				this.aClass21_11 = new Class21(this.anInterface10_6, 5126, 3, 16);
				local1561 = 28;
			}
			if ((this.anInt4816 & 0x7) != 0) {
				this.aClass21_9 = new Class21(this.anInterface10_6, 5126, 3, local1561);
			}
			@Pc(1598) long[] local1598 = new long[this.aClass1_Sub23Array1.length];
			for (local1375 = 0; local1375 < this.aClass1_Sub23Array1.length; local1375++) {
				@Pc(1607) Class1_Sub23 local1607 = this.aClass1_Sub23Array1[local1375];
				local1598[local1375] = local1607.aLong226;
				local1607.method2847(this.anInt4824);
			}
			Static19.method332(local1598, this.aClass1_Sub23Array1);
			if (this.aClass92_2 != null) {
				this.aClass92_2.method1785();
			}
		}
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray7 = null;
		this.aByteArrayArray35 = null;
		this.anIntArrayArrayArray11 = null;
		this.aClass257_19 = null;
		this.anIntArrayArrayArray8 = null;
		this.aFloatArrayArray13 = this.aFloatArrayArray14 = this.aFloatArrayArray15 = null;
		this.anIntArrayArrayArray12 = null;
		this.aClass1_Sub23ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!on", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray116[arg0][arg1];
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method4514(@OriginalArg(0) Class1_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass128_Sub2_29.anInt4628 * arg2 >> 8) >> this.aClass128_Sub2_29.anInt4606;
			@Pc(40) int local40 = arg3 - (this.aClass128_Sub2_29.anInt4635 * arg2 >> 8) >> this.aClass128_Sub2_29.anInt4606;
			return this.aClass92_2.method1789(local40, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!on", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt5796][super.anInt5795][];
		}
		if (arg3 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt5796][super.anInt5795][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub23[] local88 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1] = new Class1_Sub23[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
			@Pc(125) Class1 local125;
			for (local125 = this.aClass257_19.method5503(local119); local125 != null; local125 = this.aClass257_19.method5507()) {
				@Pc(130) Class1_Sub23 local130 = (Class1_Sub23) local125;
				if (local130.anInt3456 == arg8[local90] && (float) arg9[local90] == local130.aFloat47 && arg10 == local130.anInt3450 && arg11 == local130.anInt3447 && arg12 == local130.anInt3457) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub23(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass257_19.method5504(local88[local90], local119);
			} else {
				local88[local90] = (Class1_Sub23) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray34[arg0][arg1] = (byte) (this.aByteArrayArray34[arg0][arg1] | 0x1);
		}
		if (this.anInt4828 < arg6.length) {
			this.anInt4828 = arg6.length;
		}
		this.anInt4829 += arg6.length;
	}
}
