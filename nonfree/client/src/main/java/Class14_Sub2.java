import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
	private int anInt2844;

	@OriginalMember(owner = "client!gu", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!gu", name = "R", descriptor = "I")
	private int anInt2855;

	@OriginalMember(owner = "client!gu", name = "Z", descriptor = "I")
	private int anInt2860;

	@OriginalMember(owner = "client!gu", name = "ab", descriptor = "[Lclient!ui;")
	private Class4_Sub41[] aClass4_Sub41Array1;

	@OriginalMember(owner = "client!gu", name = "db", descriptor = "Lclient!jd;")
	public Class118 aClass118_3;

	@OriginalMember(owner = "client!gu", name = "eb", descriptor = "Lclient!jd;")
	public Class118 aClass118_4;

	@OriginalMember(owner = "client!gu", name = "gb", descriptor = "Lclient!us;")
	private Interface9 anInterface9_3;

	@OriginalMember(owner = "client!gu", name = "ib", descriptor = "Lclient!jd;")
	private Class118 aClass118_5;

	@OriginalMember(owner = "client!gu", name = "jb", descriptor = "Lclient!jd;")
	public Class118 aClass118_6;

	@OriginalMember(owner = "client!gu", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!gu", name = "A", descriptor = "Lclient!gw;")
	private final Class91 aClass91_16 = new Class91();

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	private final int anInt2838 = this.anInt2830 - 2;

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "Lclient!bt;")
	public final Class30_Sub1 aClass30_Sub1_13;

	@OriginalMember(owner = "client!gu", name = "I", descriptor = "[[I")
	private final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!gu", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!gu", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!gu", name = "kb", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!gu", name = "hb", descriptor = "[[B")
	private byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
	private final int anInt2849;

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "[[S")
	public final short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!gu", name = "W", descriptor = "[[B")
	private final byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!gu", name = "Q", descriptor = "[[[Lclient!ui;")
	private Class4_Sub41[][][] aClass4_Sub41ArrayArrayArray1;

	@OriginalMember(owner = "client!gu", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!gu", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
	public final int anInt2836;

	@OriginalMember(owner = "client!gu", name = "fb", descriptor = "Lclient!hl;")
	private Class96 aClass96_17;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "Lclient!dg;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!bt;IIII[[I[[II)V")
	public Class14_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass30_Sub1_13 = arg0;
		this.anIntArrayArray21 = arg5;
		this.aFloatArrayArray14 = new float[super.anInt2832 + 1][super.anInt2835 + 1];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aFloatArrayArray16 = new float[super.anInt2832 + 1][super.anInt2835 + 1];
		this.aByteArrayArray13 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anInt2849 = 0x1 << this.anInt2838;
		this.aShortArrayArray2 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aByteArrayArray12 = new byte[arg3][arg4];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aClass4_Sub41ArrayArrayArray1 = new Class4_Sub41[arg3][arg4][];
		this.aFloatArrayArray15 = new float[super.anInt2832 + 1][super.anInt2835 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anInt2836 = arg2;
		for (@Pc(117) int local117 = 1; local117 < super.anInt2835; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt2832; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + local140 * local140 + arg7 * arg7 * 4)));
				this.aFloatArrayArray14[local121][local117] = local177 * (float) local140;
				this.aFloatArrayArray16[local121][local117] = local177 * (float) (-arg7 * 2);
				this.aFloatArrayArray15[local121][local117] = local177 * (float) local157;
			}
		}
		this.aClass96_17 = new Class96(128);
		if ((this.anInt2836 & 0x10) != 0) {
			this.aClass48_1 = new Class48(this.aClass30_Sub1_13, this);
		}
	}

	@OriginalMember(owner = "client!gu", name = "R", descriptor = "(II)I")
	@Override
	public int R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt2830;
		@Pc(13) int local13 = arg1 >> super.anInt2830;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt2832 - 1 || super.anInt2835 - 1 < local13) {
			return 0;
		}
		@Pc(41) int local41 = super.anInt2831 - 1 & arg0;
		@Pc(48) int local48 = arg1 & super.anInt2831 - 1;
		@Pc(75) int local75 = local41 * this.anIntArrayArray21[local8 + 1][local13] + (super.anInt2831 - local41) * this.anIntArrayArray21[local8][local13] >> super.anInt2830;
		@Pc(106) int local106 = local41 * this.anIntArrayArray21[local8 + 1][local13 + 1] + (super.anInt2831 - local41) * this.anIntArrayArray21[local8][local13 + 1] >> super.anInt2830;
		return local48 * local106 + (super.anInt2831 - local48) * local75 >> super.anInt2830;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ia;IIIIZ)Z")
	@Override
	public boolean method2554(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass48_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass30_Sub1_13.anInt861 >> 8) >> this.aClass30_Sub1_13.anInt839;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass30_Sub1_13.anInt879 >> 8) >> this.aClass30_Sub1_13.anInt839;
			return this.aClass48_1.method1479(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method2557(arg4, arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray13[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray13[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ni;[I)V")
	@Override
	public void method2555(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass91_16.method2587(new Class4_Sub21(this.aClass30_Sub1_13, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	@Override
	public void method2549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII[[ZIII)V")
	private void method2557(@OriginalArg(0) boolean arg0, @OriginalArg(3) boolean[][] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.aClass4_Sub41Array1 == null) {
			return;
		}
		@Pc(8) float local8 = this.aClass30_Sub1_13.aFloat17;
		@Pc(12) float local12 = this.aClass30_Sub1_13.aFloat25;
		@Pc(18) int local18 = arg4 + arg4 + 1;
		@Pc(22) int local22 = local18 * local18;
		if (local22 > this.aClass30_Sub1_13.anIntArray48.length) {
			this.aClass30_Sub1_13.anIntArray48 = new int[local22];
		}
		if (this.anInt2844 * 2 > this.aClass30_Sub1_13.aClass4_Sub20_Sub2_1.aByteArray77.length) {
			this.aClass30_Sub1_13.aClass4_Sub20_Sub2_1 = new Class4_Sub20_Sub2(this.anInt2844 * 2);
		}
		@Pc(66) int local66 = arg3 - arg4;
		@Pc(68) int local68 = local66;
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(76) int local76 = arg2 - arg4;
		@Pc(78) int local78 = local76;
		if (local76 < 0) {
			local76 = 0;
		}
		@Pc(86) int local86 = arg4 + arg3;
		if (local86 > super.anInt2832 - 1) {
			local86 = super.anInt2832 - 1;
		}
		@Pc(101) int local101 = arg4 + arg2;
		if (super.anInt2835 - 1 < local101) {
			local101 = super.anInt2835 - 1;
		}
		@Pc(118) int local118 = 0;
		@Pc(122) int[] local122 = this.aClass30_Sub1_13.anIntArray48;
		@Pc(135) int local135;
		for (@Pc(124) int local124 = local66; local124 <= local86; local124++) {
			@Pc(133) boolean[] local133 = arg1[local124 - local68];
			for (local135 = local76; local135 <= local101; local135++) {
				if (local133[local135 - local78]) {
					local122[local118++] = super.anInt2832 * local135 + local124;
				}
			}
		}
		this.aClass30_Sub1_13.method702();
		this.aClass30_Sub1_13.method704((this.anInt2836 & 0x7) != 0);
		for (@Pc(195) int local195 = 0; local195 < this.aClass4_Sub41Array1.length; local195++) {
			this.aClass4_Sub41Array1[local195].method5807(local118, local122);
		}
		if (!this.aClass91_16.method2575()) {
			local135 = this.aClass30_Sub1_13.anInt875;
			@Pc(224) int local224 = this.aClass30_Sub1_13.anInt854;
			this.aClass30_Sub1_13.ha(0, local224, this.aClass30_Sub1_13.anInt856);
			this.aClass30_Sub1_13.PA(local12, local8 - 4.0F);
			this.aClass30_Sub1_13.method704(false);
			this.aClass30_Sub1_13.method731(false);
			this.aClass30_Sub1_13.method703(128);
			this.aClass30_Sub1_13.method693(-2);
			this.aClass30_Sub1_13.method730(this.aClass30_Sub1_13.aClass62_Sub2_1);
			this.aClass30_Sub1_13.method724(8448, 7681);
			this.aClass30_Sub1_13.method752(34166, 770, 0);
			this.aClass30_Sub1_13.method690(34167, 0);
			for (@Pc(291) Class4 local291 = this.aClass91_16.method2584(); local291 != null; local291 = this.aClass91_16.method2586()) {
				@Pc(296) Class4_Sub21 local296 = (Class4_Sub21) local291;
				local296.method3359(arg2, arg3, arg4, arg1);
			}
			this.aClass30_Sub1_13.method752(5890, 768, 0);
			this.aClass30_Sub1_13.method690(5890, 0);
			this.aClass30_Sub1_13.method730(null);
			this.aClass30_Sub1_13.ha(local135, local224, this.aClass30_Sub1_13.anInt856);
		}
		if (this.aClass48_1 != null) {
			this.aClass30_Sub1_13.PA(local12, local8 - 8.0F);
			this.aClass30_Sub1_13.method702();
			this.aClass30_Sub1_13.method748(null, null, this.aClass118_3, this.aClass118_6);
			this.aClass48_1.method1476(arg0, arg2, arg1, arg4, arg3);
		}
		this.aClass30_Sub1_13.PA(local12, local8);
	}

	@OriginalMember(owner = "client!gu", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt2832][super.anInt2835][];
		}
		if (arg3 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt2832][super.anInt2835][];
		}
		this.anIntArrayArrayArray2[arg0][arg1] = arg2;
		this.anIntArrayArrayArray4[arg0][arg1] = arg4;
		this.anIntArrayArrayArray6[arg0][arg1] = arg6;
		this.anIntArrayArrayArray5[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub41[] local88 = this.aClass4_Sub41ArrayArrayArray1[arg0][arg1] = new Class4_Sub41[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class4 local125;
			for (local125 = this.aClass96_17.method2797(local119); local125 != null; local125 = this.aClass96_17.method2803()) {
				@Pc(130) Class4_Sub41 local130 = (Class4_Sub41) local125;
				if (arg8[local90] == local130.anInt7252 && local130.aFloat92 == (float) arg9[local90] && local130.anInt7262 == arg10 && local130.anInt7254 == arg11 && local130.anInt7255 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub41(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass96_17.method2805(local119, local88[local90]);
			} else {
				local88[local90] = (Class4_Sub41) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray12[arg0][arg1] = (byte) (this.aByteArrayArray12[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt2860) {
			this.anInt2860 = arg6.length;
		}
		this.lb += arg6.length;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!dm;BI)V")
	private void method2559(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub6_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray2[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray4[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (this.aClass30_Sub1_13.anIntArray47.length < local22) {
			this.aClass30_Sub1_13.anIntArray46 = new int[local22];
			this.aClass30_Sub1_13.anIntArray47 = new int[local22];
		}
		@Pc(52) int[] local52 = this.aClass30_Sub1_13.anIntArray47;
		@Pc(56) int[] local56 = this.aClass30_Sub1_13.anIntArray46;
		for (@Pc(58) int local58 = 0; local58 < local22; local58++) {
			local52[local58] = (local12[local58] & 0xFF) >> this.aClass30_Sub1_13.anInt839;
			local56[local58] = (local19[local58] & 0xFF) >> this.aClass30_Sub1_13.anInt839;
		}
		@Pc(90) int local90 = 0;
		while (local22 > local90) {
			@Pc(96) int local96 = local52[local90];
			@Pc(101) int local101 = local56[local90++];
			@Pc(105) int local105 = local52[local90];
			@Pc(110) int local110 = local56[local90++];
			@Pc(114) int local114 = local52[local90];
			@Pc(119) int local119 = local56[local90++];
			if (-((local110 - local101) * (-local105 + local114)) + (local110 - local119) * (local96 - local105) > 0) {
				arg1.method1553(local101, local96, local105, local110, local119, local114);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2551(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.lb <= 0) {
			return;
		}
		this.aClass30_Sub1_13.method761();
		this.aClass30_Sub1_13.method760(false);
		this.aClass30_Sub1_13.method704(false);
		this.aClass30_Sub1_13.method738(false);
		this.aClass30_Sub1_13.method731(false);
		this.aClass30_Sub1_13.method703(0);
		this.aClass30_Sub1_13.method693(-2);
		this.aClass30_Sub1_13.method730(null);
		Static367.aFloatArray42[8] = 0.0F;
		Static367.aFloatArray42[5] = (float) 1024 / ((float) super.anInt2831 * 128.0F * (float) this.aClass30_Sub1_13.anInt801);
		Static367.aFloatArray42[10] = 0.0F;
		Static367.aFloatArray42[9] = 0.0F;
		Static367.aFloatArray42[6] = 0.0F;
		Static367.aFloatArray42[0] = (float) 1024 / ((float) this.aClass30_Sub1_13.anInt758 * (float) super.anInt2831 * 128.0F);
		Static367.aFloatArray42[3] = 0.0F;
		Static367.aFloatArray42[15] = 1.0F;
		Static367.aFloatArray42[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass30_Sub1_13.anInt758) - 1.0F;
		Static367.aFloatArray42[7] = 0.0F;
		Static367.aFloatArray42[1] = 0.0F;
		Static367.aFloatArray42[2] = 0.0F;
		Static367.aFloatArray42[11] = 0.0F;
		Static367.aFloatArray42[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass30_Sub1_13.anInt801;
		Static367.aFloatArray42[4] = 0.0F;
		Static367.aFloatArray42[14] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static367.aFloatArray42, 0);
		Static367.aFloatArray42[3] = 0.0F;
		Static367.aFloatArray42[5] = 0.0F;
		Static367.aFloatArray42[7] = 0.0F;
		Static367.aFloatArray42[15] = 1.0F;
		Static367.aFloatArray42[14] = 0.0F;
		Static367.aFloatArray42[12] = 0.0F;
		Static367.aFloatArray42[6] = 1.0F;
		Static367.aFloatArray42[13] = 0.0F;
		Static367.aFloatArray42[8] = 0.0F;
		Static367.aFloatArray42[1] = 0.0F;
		Static367.aFloatArray42[4] = 0.0F;
		Static367.aFloatArray42[0] = 1.0F;
		Static367.aFloatArray42[11] = 0.0F;
		Static367.aFloatArray42[2] = 0.0F;
		Static367.aFloatArray42[9] = 1.0F;
		Static367.aFloatArray42[10] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static367.aFloatArray42, 0);
		if ((this.anInt2836 & 0x7) == 0) {
			this.aClass30_Sub1_13.method704(false);
		} else {
			this.aClass30_Sub1_13.method704(true);
			this.aClass30_Sub1_13.method718();
		}
		this.aClass30_Sub1_13.method748(this.aClass118_5, this.aClass118_4, this.aClass118_3, this.aClass118_6);
		if (this.anInt2844 * 2 <= this.aClass30_Sub1_13.aClass4_Sub20_Sub2_1.aByteArray77.length) {
			this.aClass30_Sub1_13.aClass4_Sub20_Sub2_1.anInt5526 = 0;
		} else {
			this.aClass30_Sub1_13.aClass4_Sub20_Sub2_1 = new Class4_Sub20_Sub2(this.anInt2844 * 2);
		}
		@Pc(311) int local311 = 0;
		@Pc(315) Class4_Sub20_Sub2 local315 = this.aClass30_Sub1_13.aClass4_Sub20_Sub2_1;
		@Pc(321) int local321;
		@Pc(330) int local330;
		@Pc(332) int local332;
		@Pc(351) short[] local351;
		@Pc(355) int local355;
		if (this.aClass30_Sub1_13.aBoolean51) {
			for (local321 = arg1; local321 < arg3; local321++) {
				local330 = super.anInt2832 * local321 + arg0;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local321 - arg1]) {
						local351 = this.aShortArrayArray2[local330];
						if (local351 != null) {
							for (local355 = 0; local355 < local351.length; local355++) {
								local311++;
								local315.method4558(local351[local355] & 0xFFFF);
							}
						}
					}
					local330++;
				}
			}
		} else {
			for (local321 = arg1; local321 < arg3; local321++) {
				local330 = arg0 + super.anInt2832 * local321;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local321 - arg1]) {
						local351 = this.aShortArrayArray2[local330];
						if (local351 != null) {
							for (local355 = 0; local355 < local351.length; local355++) {
								local315.method4604(local351[local355] & 0xFFFF);
								local311++;
							}
						}
					}
					local330++;
				}
			}
		}
		if (local311 > 0) {
			@Pc(467) Class129_Sub2 local467 = new Class129_Sub2(this.aClass30_Sub1_13, 5123, local315.aByteArray77, local315.anInt5526);
			this.aClass30_Sub1_13.method721(0, local311, local467);
		}
	}

	@OriginalMember(owner = "client!gu", name = "U", descriptor = "()V")
	@Override
	public void U() {
		if (this.lb > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt2832 + 1][super.anInt2835 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; super.anInt2832 > local16; local16++) {
				for (local20 = 1; local20 < super.anInt2835; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray13[local16][local20] >> 1) + (this.aByteArrayArray13[local16][local20 - 1] >> 2) + (this.aByteArrayArray13[local16 + 1][local20] >> 3) + (this.aByteArrayArray13[local16 + -1][local20] >> 2) + (this.aByteArrayArray13[local16][local20 + 1] >> 3));
				}
			}
			this.aClass4_Sub41Array1 = new Class4_Sub41[this.aClass96_17.method2807()];
			this.aClass96_17.method2800(this.aClass4_Sub41Array1);
			for (local20 = 0; local20 < this.aClass4_Sub41Array1.length; local20++) {
				this.aClass4_Sub41Array1[local20].method5805(this.lb);
			}
			@Pc(128) int local128 = 24;
			if (this.anIntArrayArrayArray7 != null) {
				local128 += 4;
			}
			if ((this.anInt2836 & 0x7) != 0) {
				local128 += 12;
			}
			@Pc(147) NativeBuffer local147 = this.aClass30_Sub1_13.aNativeHeap1.a(this.lb * local128);
			@Pc(152) NativeStream local152 = new NativeStream(local147);
			@Pc(156) Class4_Sub41[] local156 = new Class4_Sub41[this.lb];
			@Pc(163) int local163 = Static284.method4425(this.lb / 4);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(175) Class96 local175 = new Class96(local163);
			@Pc(179) Class4_Sub41[] local179 = new Class4_Sub41[this.anInt2860];
			@Pc(185) int local185;
			for (@Pc(181) int local181 = 0; local181 < super.anInt2832; local181++) {
				for (local185 = 0; local185 < super.anInt2835; local185++) {
					if (this.anIntArrayArrayArray6[local181][local185] != null) {
						@Pc(201) Class4_Sub41[] local201 = this.aClass4_Sub41ArrayArrayArray1[local181][local185];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray2[local181][local185];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray4[local181][local185];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray5[local181][local185];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray6[local181][local185];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local181][local185];
						if (local222 == null) {
							local222 = local229;
						}
						@Pc(257) int[] local257 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local181][local185];
						@Pc(264) float local264 = this.aFloatArrayArray14[local181][local185];
						@Pc(271) float local271 = this.aFloatArrayArray16[local181][local185];
						@Pc(278) float local278 = this.aFloatArrayArray15[local181][local185];
						@Pc(287) float local287 = this.aFloatArrayArray14[local181][local185 + 1];
						@Pc(296) float local296 = this.aFloatArrayArray16[local181][local185 + 1];
						@Pc(305) float local305 = this.aFloatArrayArray15[local181][local185 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray14[local181 + 1][local185 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray16[local181 + 1][local185 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray15[local181 + 1][local185 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray14[local181 + 1][local185];
						@Pc(356) float local356 = this.aFloatArrayArray16[local181 + 1][local185];
						@Pc(365) float local365 = this.aFloatArrayArray15[local181 + 1][local185];
						@Pc(373) int local373 = local14[local181][local185] & 0xFF;
						@Pc(383) int local383 = local14[local181][local185 + 1] & 0xFF;
						@Pc(395) int local395 = local14[local181 + 1][local185 + 1] & 0xFF;
						@Pc(405) int local405 = local14[local181 + 1][local185] & 0xFF;
						@Pc(407) int local407 = 0;
						@Pc(417) int local417;
						label335: for (@Pc(409) int local409 = 0; local409 < local229.length; local409++) {
							@Pc(415) Class4_Sub41 local415 = local201[local409];
							for (local417 = 0; local417 < local407; local417++) {
								if (local179[local417] == local415) {
									continue label335;
								}
							}
							local179[local407++] = local415;
						}
						@Pc(455) short[] local455 = this.aShortArrayArray2[local185 * super.anInt2832 + local181] = new short[local229.length];
						for (local417 = 0; local417 < local229.length; local417++) {
							@Pc(469) int local469 = (local181 << super.anInt2830) + local208[local417];
							@Pc(478) int local478 = (local185 << super.anInt2830) + local215[local417];
							@Pc(483) int local483 = local469 >> this.anInt2838;
							@Pc(488) int local488 = local478 >> this.anInt2838;
							@Pc(492) int local492 = local229[local417];
							@Pc(496) int local496 = local222[local417];
							@Pc(504) int local504 = local241 == null ? 0 : local241[local417];
							@Pc(522) long local522 = (long) local488 | (long) (local483 << 16) | (long) local492 << 32 | (long) local496 << 48;
							@Pc(526) int local526 = local208[local417];
							@Pc(530) int local530 = local215[local417];
							@Pc(532) byte local532 = 74;
							@Pc(534) int local534 = 0;
							@Pc(536) float local536 = 1.0F;
							@Pc(554) float local554;
							@Pc(552) float local552;
							@Pc(556) float local556;
							@Pc(632) float local632;
							@Pc(550) int local550;
							if (local526 == 0 && local530 == 0) {
								local550 = local532 - local373;
								local552 = local271;
								local554 = local264;
								local556 = local278;
							} else if (local526 == 0 && super.anInt2831 == local530) {
								local550 = local532 - local383;
								local554 = local287;
								local552 = local296;
								local556 = local305;
							} else if (super.anInt2831 == local526 && super.anInt2831 == local530) {
								local552 = local327;
								local556 = local338;
								local554 = local316;
								local550 = local532 - local395;
							} else if (super.anInt2831 == local526 && local530 == 0) {
								local550 = local532 - local405;
								local552 = local356;
								local554 = local347;
								local556 = local365;
							} else {
								@Pc(608) float local608 = (float) local526 / (float) super.anInt2831;
								@Pc(615) float local615 = (float) local530 / (float) super.anInt2831;
								@Pc(623) float local623 = local264 + local608 * (local347 - local264);
								local632 = local271 + (local356 - local271) * local608;
								@Pc(640) float local640 = local278 + (local365 - local278) * local608;
								@Pc(648) float local648 = local608 * (local316 - local287) + local287;
								@Pc(657) float local657 = (local327 - local296) * local608 + local296;
								@Pc(666) float local666 = (local338 - local305) * local608 + local305;
								local554 = (local648 - local623) * local615 + local623;
								local552 = local632 + local615 * (local657 - local632);
								local556 = local640 + local615 * (local666 - local640);
								@Pc(703) int local703 = local373 + (local526 * (local405 - local373) >> super.anInt2830);
								@Pc(716) int local716 = local383 + ((local395 - local383) * local526 >> super.anInt2830);
								local550 = local532 - local703 - (local530 * (local716 - local703) >> super.anInt2830);
							}
							if (local492 != -1) {
								@Pc(765) int local765 = (local492 & 0x7F) * local550 >> 7;
								if (local765 < 2) {
									local765 = 2;
								} else if (local765 > 126) {
									local765 = 126;
								}
								local534 = Static323.anIntArray198[local765 | local492 & 0xFF80];
								if ((this.anInt2836 & 0x7) == 0) {
									local536 = local554 * this.aClass30_Sub1_13.aFloatArray1[0] + local552 * this.aClass30_Sub1_13.aFloatArray1[1] + this.aClass30_Sub1_13.aFloatArray1[2] * local556;
									local536 = this.aClass30_Sub1_13.aFloat22 + (local536 > 0.0F ? this.aClass30_Sub1_13.aFloat8 : this.aClass30_Sub1_13.aFloat23) * local536;
								}
							}
							@Pc(836) Class4 local836 = null;
							if ((this.anInt2849 - 1 & local469) == 0 && (local478 & this.anInt2849 - 1) == 0) {
								local836 = local175.method2797(local522);
							}
							@Pc(1192) int local1192;
							@Pc(892) int local892;
							if (local836 == null) {
								if (local492 == local496) {
									local892 = local534;
								} else {
									@Pc(872) int local872 = (local496 & 0x7F) * local550 >> 7;
									if (local872 < 2) {
										local872 = 2;
									} else if (local872 > 126) {
										local872 = 126;
									}
									local892 = Static323.anIntArray198[local872 | local496 & 0xFF80];
									if ((this.anInt2836 & 0x7) == 0) {
										local632 = local556 * this.aClass30_Sub1_13.aFloatArray1[2] + this.aClass30_Sub1_13.aFloatArray1[0] * local554 + local552 * this.aClass30_Sub1_13.aFloatArray1[1];
										local632 = this.aClass30_Sub1_13.aFloat22 + (local536 > 0.0F ? this.aClass30_Sub1_13.aFloat8 : this.aClass30_Sub1_13.aFloat23) * local536;
										@Pc(945) int local945 = local892 >> 16 & 0xFF;
										@Pc(951) int local951 = local892 >> 8 & 0xFF;
										local945 = (int) ((float) local945 * local632);
										@Pc(961) int local961 = local892 & 0xFF;
										local951 = (int) ((float) local951 * local632);
										if (local945 < 0) {
											local945 = 0;
										} else if (local945 > 255) {
											local945 = 255;
										}
										if (local951 < 0) {
											local951 = 0;
										} else if (local951 > 255) {
											local951 = 255;
										}
										local961 = (int) ((float) local961 * local632);
										if (local961 < 0) {
											local961 = 0;
										} else if (local961 > 255) {
											local961 = 255;
										}
										local892 = local961 | local945 << 16 | local951 << 8;
									}
								}
								if (this.aClass30_Sub1_13.aBoolean51) {
									local152.a((float) local469);
									local152.a((float) (local504 + this.R(local469, local478)));
									local152.a((float) local478);
									local152.b((byte) (local892 >> 16));
									local152.b((byte) (local892 >> 8));
									local152.b((byte) local892);
									local152.b(-1);
									local152.a((float) local469);
									local152.a((float) local478);
									if (this.anIntArrayArrayArray7 != null) {
										local152.a((float) (local257 == null ? 0 : local257[local417] - 1));
									}
									if ((this.anInt2836 & 0x7) != 0) {
										local152.a(local554);
										local152.a(local552);
										local152.a(local556);
									}
								} else {
									local152.b((float) local469);
									local152.b((float) (local504 + this.R(local469, local478)));
									local152.b((float) local478);
									local152.b((byte) (local892 >> 16));
									local152.b((byte) (local892 >> 8));
									local152.b((byte) local892);
									local152.b(-1);
									local152.b((float) local469);
									local152.b((float) local478);
									if (this.anIntArrayArrayArray7 != null) {
										local152.b((float) (local257 == null ? 0 : local257[local417] - 1));
									}
									if ((this.anInt2836 & 0x7) != 0) {
										local152.b(local554);
										local152.b(local552);
										local152.b(local556);
									}
								}
								local1192 = this.anInt2855++;
								local455[local417] = (short) local1192;
								if (local492 != -1) {
									local156[local1192] = local201[local417];
								}
								local175.method2805(local522, new Class4_Sub27(local455[local417]));
							} else {
								local455[local417] = ((Class4_Sub27) local836).aShort55;
								local1192 = local455[local417] & 0xFFFF;
								if (local492 != -1 && local156[local1192].aLong228 > local201[local417].aLong228) {
									local156[local1192] = local201[local417];
								}
							}
							for (local892 = 0; local892 < local407; local892++) {
								local179[local892].method5809(local536, local534, local550, local1192);
							}
							this.anInt2844++;
						}
					}
				}
			}
			for (local185 = 0; local185 < this.anInt2855; local185++) {
				@Pc(1305) Class4_Sub41 local1305 = local156[local185];
				if (local1305 != null) {
					local1305.method5812(local185);
				}
			}
			@Pc(1339) int local1339;
			for (@Pc(1318) int local1318 = 0; local1318 < super.anInt2832; local1318++) {
				for (@Pc(1322) int local1322 = 0; local1322 < super.anInt2835; local1322++) {
					@Pc(1335) short[] local1335 = this.aShortArrayArray2[super.anInt2832 * local1322 + local1318];
					if (local1335 != null) {
						local1339 = 0;
						@Pc(1341) int local1341 = 0;
						while (local1341 < local1335.length) {
							@Pc(1350) int local1350 = local1335[local1341++] & 0xFFFF;
							@Pc(1357) int local1357 = local1335[local1341++] & 0xFFFF;
							@Pc(1364) int local1364 = local1335[local1341++] & 0xFFFF;
							@Pc(1368) Class4_Sub41 local1368 = local156[local1350];
							@Pc(1372) Class4_Sub41 local1372 = local156[local1357];
							@Pc(1376) Class4_Sub41 local1376 = local156[local1364];
							@Pc(1378) Class4_Sub41 local1378 = null;
							if (local1368 != null) {
								local1378 = local1368;
								local1368.method5813(local1339, local1318, local1322);
							}
							if (local1372 != null) {
								local1372.method5813(local1339, local1318, local1322);
								if (local1378 == null || local1378.aLong228 > local1372.aLong228) {
									local1378 = local1372;
								}
							}
							if (local1376 != null) {
								local1376.method5813(local1339, local1318, local1322);
								if (local1378 == null || local1376.aLong228 < local1378.aLong228) {
									local1378 = local1376;
								}
							}
							if (local1378 != null) {
								if (local1368 != null) {
									local1378.method5812(local1350);
								}
								if (local1372 != null) {
									local1378.method5812(local1357);
								}
								if (local1376 != null) {
									local1378.method5812(local1364);
								}
								local1378.method5813(local1339, local1318, local1322);
							}
							local1339++;
						}
					}
				}
			}
			local152.b();
			this.anInterface9_3 = this.aClass30_Sub1_13.method763(local152.c(), local147, local128);
			this.aClass118_6 = new Class118(this.anInterface9_3, 5126, 3, 0);
			this.aClass118_5 = new Class118(this.anInterface9_3, 5121, 4, 12);
			@Pc(1523) byte local1523;
			if (this.anIntArrayArrayArray7 == null) {
				this.aClass118_3 = new Class118(this.anInterface9_3, 5126, 2, 16);
				local1523 = 24;
			} else {
				local1523 = 28;
				this.aClass118_3 = new Class118(this.anInterface9_3, 5126, 3, 16);
			}
			if ((this.anInt2836 & 0x7) != 0) {
				this.aClass118_4 = new Class118(this.anInterface9_3, 5126, 3, local1523);
			}
			@Pc(1567) long[] local1567 = new long[this.aClass4_Sub41Array1.length];
			for (local1339 = 0; local1339 < this.aClass4_Sub41Array1.length; local1339++) {
				@Pc(1576) Class4_Sub41 local1576 = this.aClass4_Sub41Array1[local1339];
				local1567[local1339] = local1576.aLong228;
				local1576.method5808(this.anInt2855);
			}
			Static176.method3077(local1567, this.aClass4_Sub41Array1);
			if (this.aClass48_1 != null) {
				this.aClass48_1.method1482();
			}
		} else {
			this.aClass48_1 = null;
		}
		this.aByteArrayArray13 = null;
		this.aClass4_Sub41ArrayArrayArray1 = null;
		this.anIntArrayArrayArray6 = null;
		this.aFloatArrayArray14 = this.aFloatArrayArray16 = this.aFloatArrayArray15 = null;
		this.anIntArrayArrayArray7 = null;
		this.aClass96_17 = null;
		this.anIntArrayArrayArray2 = this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!gu", name = "oa", descriptor = "(II)I")
	@Override
	public int oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray21[arg0][arg1];
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method2552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.ta(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!gu", name = "ia", descriptor = "(Lclient!ia;IIIIZ)V")
	@Override
	public void ia(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass48_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass30_Sub1_13.anInt861 >> 8) >> this.aClass30_Sub1_13.anInt839;
			@Pc(37) int local37 = arg3 - (this.aClass30_Sub1_13.anInt879 * arg2 >> 8) >> this.aClass30_Sub1_13.anInt839;
			this.aClass48_1.method1477(local37, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "H", descriptor = "(Lclient!ia;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass48_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass30_Sub1_13.anInt861 * arg2 >> 8) >> this.aClass30_Sub1_13.anInt839;
			@Pc(39) int local39 = arg3 - (this.aClass30_Sub1_13.anInt879 * arg2 >> 8) >> this.aClass30_Sub1_13.anInt839;
			this.aClass48_1.method1481(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "(IILclient!ia;)Lclient!ia;")
	@Override
	public Class4_Sub1_Sub6 q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub6 arg2) {
		if ((this.aByteArrayArray12[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt2831 >> this.aClass30_Sub1_13.anInt839;
		@Pc(24) Class4_Sub1_Sub6_Sub1 local24 = (Class4_Sub1_Sub6_Sub1) arg2;
		@Pc(40) Class4_Sub1_Sub6_Sub1 local40;
		if (local24 != null && local24.method1548(local21, local21)) {
			local40 = local24;
			local24.method1549();
		} else {
			local40 = new Class4_Sub1_Sub6_Sub1(this.aClass30_Sub1_13, local21, local21);
		}
		local40.method1552(0, 0, local21, local21);
		this.method2559(arg1, local40, arg0);
		return local40;
	}
}
