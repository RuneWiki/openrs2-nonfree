import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!eg", name = "lb", descriptor = "I")
	public static int lb = 0;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	private int anInt2071;

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	private int anInt2073;

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!eg", name = "Z", descriptor = "Lclient!wc;")
	public Class260 aClass260_6;

	@OriginalMember(owner = "client!eg", name = "ab", descriptor = "Lclient!wc;")
	public Class260 aClass260_7;

	@OriginalMember(owner = "client!eg", name = "bb", descriptor = "Lclient!ap;")
	private Interface1 anInterface1_4;

	@OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
	private int anInt2091;

	@OriginalMember(owner = "client!eg", name = "fb", descriptor = "[Lclient!ln;")
	private Class2_Sub25[] aClass2_Sub25Array1;

	@OriginalMember(owner = "client!eg", name = "gb", descriptor = "Lclient!wc;")
	public Class260 aClass260_8;

	@OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
	private int anInt2092;

	@OriginalMember(owner = "client!eg", name = "mb", descriptor = "Lclient!wc;")
	private Class260 aClass260_9;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!ar;")
	private final Class14 aClass14_16 = new Class14();

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "[[I")
	private final int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "Lclient!ef;")
	public final Class49_Sub2 aClass49_Sub2_11;

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
	private final int anInt2082;

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
	private final int anInt2083;

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!eg", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[[[Lclient!ln;")
	private Class2_Sub25[][][] aClass2_Sub25ArrayArrayArray1;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "[[B")
	private final byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
	public final int anInt2085;

	@OriginalMember(owner = "client!eg", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!eg", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!eg", name = "hb", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!eg", name = "cb", descriptor = "Lclient!mn;")
	private Class163 aClass163_6;

	@OriginalMember(owner = "client!eg", name = "L", descriptor = "Lclient!gb;")
	private Class89 aClass89_1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!ef;IIII[[I[[II)V")
	public Class64_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray12 = arg5;
		this.aClass49_Sub2_11 = arg0;
		this.anInt2082 = super.anInt2932 - 2;
		this.anInt2083 = 0x1 << this.anInt2082;
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aFloatArrayArray1 = new float[super.anInt2934 + 1][super.anInt2928 + 1];
		this.aShortArrayArray3 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aClass2_Sub25ArrayArrayArray1 = new Class2_Sub25[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aFloatArrayArray2 = new float[super.anInt2934 + 1][super.anInt2928 + 1];
		this.aByteArrayArray14 = new byte[arg3][arg4];
		this.anInt2085 = arg2;
		this.aFloatArrayArray3 = new float[super.anInt2934 + 1][super.anInt2928 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
		for (@Pc(117) int local117 = 1; local117 < super.anInt2928; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt2934 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + arg7 * 4 * arg7 + local157 * local157)));
				this.aFloatArrayArray3[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray2[local121][local117] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray1[local121][local117] = local176 * (float) local157;
			}
		}
		this.aClass163_6 = new Class163(128);
		if ((this.anInt2085 & 0x10) != 0) {
			this.aClass89_1 = new Class89(this.aClass49_Sub2_11, this);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt2932;
		@Pc(13) int local13 = arg1 >> super.anInt2932;
		if (local8 < 0 || local13 < 0 || super.anInt2934 - 1 < local8 || local13 > super.anInt2928 - 1) {
			return 0;
		}
		@Pc(38) int local38 = super.anInt2927 - 1 & arg0;
		@Pc(45) int local45 = arg1 & super.anInt2927 - 1;
		@Pc(71) int local71 = local38 * this.anIntArrayArray12[local8 + 1][local13] + (super.anInt2927 - local38) * this.anIntArrayArray12[local8][local13] >> super.anInt2932;
		@Pc(102) int local102 = local38 * this.anIntArrayArray12[local8 + 1][local13 + 1] + this.anIntArrayArray12[local8][local13 + 1] * (super.anInt2927 - local38) >> super.anInt2932;
		return local71 * (super.anInt2927 - local45) + local45 * local102 >> super.anInt2932;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII[[ZIZ)V")
	private void method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass2_Sub25Array1 == null) {
			return;
		}
		@Pc(12) float local12 = this.aClass49_Sub2_11.aFloat29;
		@Pc(16) float local16 = this.aClass49_Sub2_11.aFloat31;
		@Pc(22) int local22 = arg1 + arg1 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (local26 > Static173.anIntArray306.length) {
			Static173.anIntArray306 = new int[local26];
		}
		if (this.anInt2071 * 2 > Static92.aClass2_Sub23_5.aByteArray130.length) {
			Static92.aClass2_Sub23_5 = new Class2_Sub23(this.anInt2071 * 2);
		}
		@Pc(57) int local57 = arg0 - arg1;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg2 - arg1;
		@Pc(69) int local69 = local67;
		if (local67 < 0) {
			local67 = 0;
		}
		@Pc(77) int local77 = arg0 + arg1;
		if (local77 > super.anInt2934 - 1) {
			local77 = super.anInt2934 - 1;
		}
		@Pc(96) int local96 = arg2 + arg1;
		if (super.anInt2928 - 1 < local96) {
			local96 = super.anInt2928 - 1;
		}
		Static361.anInt6114 = 0;
		@Pc(122) int local122;
		for (@Pc(111) int local111 = local57; local111 <= local77; local111++) {
			@Pc(120) boolean[] local120 = arg3[local111 - local59];
			for (local122 = local67; local122 <= local96; local122++) {
				if (local120[local122 - local69]) {
					Static173.anIntArray306[Static361.anInt6114++] = local111 + super.anInt2934 * local122;
				}
			}
		}
		this.aClass49_Sub2_11.method1638();
		this.aClass49_Sub2_11.method1587((this.anInt2085 & 0x7) != 0);
		for (@Pc(197) int local197 = 0; local197 < this.aClass2_Sub25Array1.length; local197++) {
			this.aClass2_Sub25Array1[local197].method3527(Static361.anInt6114, Static173.anIntArray306);
		}
		if (!this.aClass14_16.method298()) {
			local122 = this.aClass49_Sub2_11.anInt2027;
			@Pc(228) int local228 = this.aClass49_Sub2_11.anInt2034;
			this.aClass49_Sub2_11.UA(0, local228, this.aClass49_Sub2_11.anInt2047);
			this.aClass49_Sub2_11.g(local16, local12 - 4.0F);
			this.aClass49_Sub2_11.method1587(false);
			this.aClass49_Sub2_11.method1635(false);
			this.aClass49_Sub2_11.method1626(128);
			this.aClass49_Sub2_11.method1594(-2);
			this.aClass49_Sub2_11.method1646(this.aClass49_Sub2_11.aClass55_Sub3_1);
			this.aClass49_Sub2_11.method1613(8448, 7681);
			this.aClass49_Sub2_11.method1625(34166, 770, 0);
			this.aClass49_Sub2_11.method1623(34167, 0);
			for (@Pc(299) Class2 local299 = this.aClass14_16.method309(); local299 != null; local299 = this.aClass14_16.method311()) {
				@Pc(304) Class2_Sub32 local304 = (Class2_Sub32) local299;
				local304.method4189(arg3, arg2, arg0, arg1);
			}
			this.aClass49_Sub2_11.method1625(5890, 768, 0);
			this.aClass49_Sub2_11.method1623(5890, 0);
			this.aClass49_Sub2_11.method1646(null);
			this.aClass49_Sub2_11.UA(local122, local228, this.aClass49_Sub2_11.anInt2047);
		}
		if (this.aClass89_1 != null) {
			this.aClass49_Sub2_11.g(local16, local12 - 8.0F);
			this.aClass49_Sub2_11.method1638();
			this.aClass49_Sub2_11.method1618(this.aClass260_7, null, null, this.aClass260_8);
			this.aClass89_1.method2114(arg2, arg1, arg0, arg3, arg4);
		}
		this.aClass49_Sub2_11.g(local16, local12);
	}

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass89_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass49_Sub2_11.anInt2029 * arg2 >> 8) >> this.aClass49_Sub2_11.anInt2003;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass49_Sub2_11.anInt2049 >> 8) >> this.aClass49_Sub2_11.anInt2003;
			this.aClass89_1.method2110(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method2352(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass89_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass49_Sub2_11.anInt2029 >> 8) >> this.aClass49_Sub2_11.anInt2003;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass49_Sub2_11.anInt2049 >> 8) >> this.aClass49_Sub2_11.anInt2003;
			return this.aClass89_1.method2113(arg0, local25, local40);
		}
	}

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class2_Sub5_Sub1 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub1 arg2) {
		if ((this.aByteArrayArray14[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt2927 >> this.aClass49_Sub2_11.anInt2003;
		@Pc(24) Class2_Sub5_Sub1_Sub1 local24 = (Class2_Sub5_Sub1_Sub1) arg2;
		@Pc(34) Class2_Sub5_Sub1_Sub1 local34;
		if (local24 != null && local24.method2004(local21, local21)) {
			local34 = local24;
			local24.method2003();
		} else {
			local34 = new Class2_Sub5_Sub1_Sub1(this.aClass49_Sub2_11, local21, local21);
		}
		local34.method2002(0, 0, local21, local21);
		this.method1684(arg1, local34, arg0);
		return local34;
	}

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt2934][super.anInt2928][];
		}
		if (arg3 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt2934][super.anInt2928][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray4[arg0][arg1] = arg4;
		this.anIntArrayArrayArray2[arg0][arg1] = arg6;
		this.anIntArrayArrayArray5[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub25[] local88 = this.aClass2_Sub25ArrayArrayArray1[arg0][arg1] = new Class2_Sub25[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(125) Class2 local125;
			for (local125 = this.aClass163_6.method3769(local119); local125 != null; local125 = this.aClass163_6.method3765()) {
				@Pc(130) Class2_Sub25 local130 = (Class2_Sub25) local125;
				if (local130.anInt4353 == arg8[local90] && (float) arg9[local90] == local130.aFloat64 && local130.anInt4351 == arg10 && arg11 == local130.anInt4358 && local130.anInt4354 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub25(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass163_6.method3764(local119, local88[local90]);
			} else {
				local88[local90] = (Class2_Sub25) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray14[arg0][arg1] = (byte) (this.aByteArrayArray14[arg0][arg1] | 0x1);
		}
		if (this.anInt2092 < arg6.length) {
			this.anInt2092 = arg6.length;
		}
		this.anInt2091 += arg6.length;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!jd;[I)V")
	@Override
	public void method2349(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass14_16.method300(new Class2_Sub32(this.aClass49_Sub2_11, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray12[arg0][arg1];
	}

	@OriginalMember(owner = "client!eg", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		if (this.anInt2091 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt2934 + 1][super.anInt2928 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; super.anInt2934 > local23; local23++) {
				for (local27 = 1; local27 < super.anInt2928; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray15[local23 + 1][local27] >> 3) + (this.aByteArrayArray15[local23 - 1][local27] >> 2) + (this.aByteArrayArray15[local23][local27 + -1] >> 2) + (this.aByteArrayArray15[local23][local27 + 1] >> 3) + (this.aByteArrayArray15[local23][local27] >> 1));
				}
			}
			this.aClass2_Sub25Array1 = new Class2_Sub25[this.aClass163_6.method3763()];
			this.aClass163_6.method3762(this.aClass2_Sub25Array1);
			for (local27 = 0; local27 < this.aClass2_Sub25Array1.length; local27++) {
				this.aClass2_Sub25Array1[local27].method3530(this.anInt2091);
			}
			@Pc(139) int local139 = 24;
			if (this.anIntArrayArrayArray6 != null) {
				local139 += 4;
			}
			if ((this.anInt2085 & 0x7) != 0) {
				local139 += 12;
			}
			@Pc(161) NativeBuffer local161 = this.aClass49_Sub2_11.aNativeHeap1.a(this.anInt2091 * local139);
			@Pc(166) NativeStream local166 = new NativeStream(local161);
			@Pc(170) Class2_Sub25[] local170 = new Class2_Sub25[this.anInt2091];
			@Pc(177) int local177 = Static202.method3245(this.anInt2091 / 4);
			if (local177 < 1) {
				local177 = 1;
			}
			@Pc(187) Class163 local187 = new Class163(local177);
			@Pc(191) Class2_Sub25[] local191 = new Class2_Sub25[this.anInt2092];
			@Pc(197) int local197;
			for (@Pc(193) int local193 = 0; super.anInt2934 > local193; local193++) {
				for (local197 = 0; local197 < super.anInt2928; local197++) {
					if (this.anIntArrayArrayArray2[local193][local197] != null) {
						@Pc(213) Class2_Sub25[] local213 = this.aClass2_Sub25ArrayArrayArray1[local193][local197];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray7[local193][local197];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray4[local193][local197];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray5[local193][local197];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray2[local193][local197];
						@Pc(253) int[] local253 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local193][local197];
						if (local234 == null) {
							local234 = local241;
						}
						@Pc(269) int[] local269 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local193][local197];
						@Pc(276) float local276 = this.aFloatArrayArray3[local193][local197];
						@Pc(283) float local283 = this.aFloatArrayArray2[local193][local197];
						@Pc(290) float local290 = this.aFloatArrayArray1[local193][local197];
						@Pc(299) float local299 = this.aFloatArrayArray3[local193][local197 + 1];
						@Pc(308) float local308 = this.aFloatArrayArray2[local193][local197 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray1[local193][local197 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray3[local193 + 1][local197 + 1];
						@Pc(339) float local339 = this.aFloatArrayArray2[local193 + 1][local197 + 1];
						@Pc(350) float local350 = this.aFloatArrayArray1[local193 + 1][local197 + 1];
						@Pc(359) float local359 = this.aFloatArrayArray3[local193 + 1][local197];
						@Pc(368) float local368 = this.aFloatArrayArray2[local193 + 1][local197];
						@Pc(377) float local377 = this.aFloatArrayArray1[local193 + 1][local197];
						@Pc(385) int local385 = local21[local193][local197] & 0xFF;
						@Pc(395) int local395 = local21[local193][local197 + 1] & 0xFF;
						@Pc(407) int local407 = local21[local193 + 1][local197 + 1] & 0xFF;
						@Pc(417) int local417 = local21[local193 + 1][local197] & 0xFF;
						@Pc(419) int local419 = 0;
						@Pc(429) int local429;
						label335: for (@Pc(421) int local421 = 0; local421 < local241.length; local421++) {
							@Pc(427) Class2_Sub25 local427 = local213[local421];
							for (local429 = 0; local429 < local419; local429++) {
								if (local427 == local191[local429]) {
									continue label335;
								}
							}
							local191[local419++] = local427;
						}
						@Pc(466) short[] local466 = this.aShortArrayArray3[super.anInt2934 * local197 + local193] = new short[local241.length];
						for (local429 = 0; local429 < local241.length; local429++) {
							@Pc(479) int local479 = (local193 << super.anInt2932) + local220[local429];
							@Pc(489) int local489 = (local197 << super.anInt2932) + local227[local429];
							@Pc(494) int local494 = local479 >> this.anInt2082;
							@Pc(499) int local499 = local489 >> this.anInt2082;
							@Pc(503) int local503 = local241[local429];
							@Pc(507) int local507 = local234[local429];
							@Pc(515) int local515 = local253 == null ? 0 : local253[local429];
							@Pc(533) long local533 = (long) local499 | (long) (local494 << 16) | (long) local507 << 48 | (long) local503 << 32;
							@Pc(537) int local537 = local220[local429];
							@Pc(541) int local541 = local227[local429];
							@Pc(543) byte local543 = 74;
							@Pc(545) int local545 = 0;
							@Pc(583) float local583;
							@Pc(575) float local575;
							@Pc(577) float local577;
							@Pc(638) float local638;
							@Pc(581) int local581;
							if (local537 == 0 && local541 == 0) {
								local575 = local283;
								local581 = local543 - local385;
								local577 = local290;
								local583 = local276;
							} else if (local537 == 0 && local541 == super.anInt2927) {
								local577 = local317;
								local575 = local308;
								local583 = local299;
								local581 = local543 - local395;
							} else if (local537 == super.anInt2927 && local541 == super.anInt2927) {
								local575 = local339;
								local577 = local350;
								local581 = local543 - local407;
								local583 = local328;
							} else if (super.anInt2927 == local537 && local541 == 0) {
								local581 = local543 - local417;
								local575 = local368;
								local583 = local359;
								local577 = local377;
							} else {
								@Pc(613) float local613 = (float) local537 / (float) super.anInt2927;
								@Pc(620) float local620 = (float) local541 / (float) super.anInt2927;
								@Pc(629) float local629 = local613 * (local359 - local276) + local276;
								local638 = local283 + (local368 - local283) * local613;
								@Pc(647) float local647 = (local377 - local290) * local613 + local290;
								@Pc(656) float local656 = local613 * (local328 - local299) + local299;
								@Pc(664) float local664 = local613 * (local339 - local308) + local308;
								@Pc(673) float local673 = local317 + local613 * (local350 - local317);
								local583 = local620 * (local656 - local629) + local629;
								local575 = (local664 - local638) * local620 + local638;
								local577 = (local673 - local647) * local620 + local647;
								@Pc(710) int local710 = local385 + ((local417 - local385) * local537 >> super.anInt2932);
								@Pc(723) int local723 = local395 + (local537 * (local407 - local395) >> super.anInt2932);
								local581 = local543 - (local541 * (local723 - local710) >> super.anInt2932) - local710;
							}
							@Pc(763) float local763 = 1.0F;
							if (local503 != -1) {
								@Pc(775) int local775 = (local503 & 0x7F) * local581 >> 7;
								if (local775 < 2) {
									local775 = 2;
								} else if (local775 > 126) {
									local775 = 126;
								}
								local545 = Static199.anIntArray337[local775 | local503 & 0xFF80];
								if ((this.anInt2085 & 0x7) == 0) {
									local763 = this.aClass49_Sub2_11.aFloatArray12[0] * local583 + local575 * this.aClass49_Sub2_11.aFloatArray12[1] + this.aClass49_Sub2_11.aFloatArray12[2] * local577;
									local763 = local763 * (local763 > 0.0F ? this.aClass49_Sub2_11.aFloat26 : this.aClass49_Sub2_11.aFloat38) + this.aClass49_Sub2_11.aFloat34;
								}
							}
							@Pc(849) Class2 local849 = null;
							if ((local479 & this.anInt2083 - 1) == 0 && (local489 & this.anInt2083 - 1) == 0) {
								local849 = local187.method3769(local533);
							}
							@Pc(882) int local882;
							@Pc(943) int local943;
							if (local849 == null) {
								if (local503 == local507) {
									local943 = local545;
								} else {
									@Pc(919) int local919 = (local507 & 0x7F) * local581 >> 7;
									if (local919 < 2) {
										local919 = 2;
									} else if (local919 > 126) {
										local919 = 126;
									}
									local943 = Static199.anIntArray337[local507 & 0xFF80 | local919];
									if ((this.anInt2085 & 0x7) == 0) {
										local638 = local577 * this.aClass49_Sub2_11.aFloatArray12[2] + local575 * this.aClass49_Sub2_11.aFloatArray12[1] + local583 * this.aClass49_Sub2_11.aFloatArray12[0];
										local638 = this.aClass49_Sub2_11.aFloat34 + (local763 > 0.0F ? this.aClass49_Sub2_11.aFloat26 : this.aClass49_Sub2_11.aFloat38) * local763;
										@Pc(999) int local999 = local943 >> 16 & 0xFF;
										@Pc(1005) int local1005 = local943 >> 8 & 0xFF;
										local999 = (int) ((float) local999 * local638);
										@Pc(1015) int local1015 = local943 & 0xFF;
										local1005 = (int) ((float) local1005 * local638);
										if (local999 < 0) {
											local999 = 0;
										} else if (local999 > 255) {
											local999 = 255;
										}
										local1015 = (int) ((float) local1015 * local638);
										if (local1005 < 0) {
											local1005 = 0;
										} else if (local1005 > 255) {
											local1005 = 255;
										}
										if (local1015 < 0) {
											local1015 = 0;
										} else if (local1015 > 255) {
											local1015 = 255;
										}
										local943 = local1015 | local1005 << 8 | local999 << 16;
									}
								}
								if (this.aClass49_Sub2_11.aBoolean111) {
									local166.a((float) local479);
									local166.a((float) (local515 + this.a(local479, local489)));
									local166.a((float) local489);
									local166.a((byte) (local943 >> 16));
									local166.a((byte) (local943 >> 8));
									local166.a((byte) local943);
									local166.a(-1);
									local166.a((float) local479);
									local166.a((float) local489);
									if (this.anIntArrayArrayArray6 != null) {
										local166.a((float) (local269 == null ? 0 : local269[local429] - 1));
									}
									if ((this.anInt2085 & 0x7) != 0) {
										local166.a(local583);
										local166.a(local575);
										local166.a(local577);
									}
								} else {
									local166.b((float) local479);
									local166.b((float) (local515 + this.a(local479, local489)));
									local166.b((float) local489);
									local166.a((byte) (local943 >> 16));
									local166.a((byte) (local943 >> 8));
									local166.a((byte) local943);
									local166.a(-1);
									local166.b((float) local479);
									local166.b((float) local489);
									if (this.anIntArrayArrayArray6 != null) {
										local166.b((float) (local269 == null ? 0 : local269[local429] - 1));
									}
									if ((this.anInt2085 & 0x7) != 0) {
										local166.b(local583);
										local166.b(local575);
										local166.b(local577);
									}
								}
								local882 = this.anInt2073++;
								local466[local429] = (short) local882;
								if (local503 != -1) {
									local170[local882] = local213[local429];
								}
								local187.method3764(local533, new Class2_Sub6(local466[local429]));
							} else {
								local466[local429] = ((Class2_Sub6) local849).aShort1;
								local882 = local466[local429] & 0xFFFF;
								if (local503 != -1 && local170[local882].aLong227 > local213[local429].aLong227) {
									local170[local882] = local213[local429];
								}
							}
							for (local943 = 0; local943 < local419; local943++) {
								local191[local943].method3528(local763, local581, local882, local545);
							}
							this.anInt2071++;
						}
					}
				}
			}
			for (local197 = 0; local197 < this.anInt2073; local197++) {
				@Pc(1319) Class2_Sub25 local1319 = local170[local197];
				if (local1319 != null) {
					local1319.method3525(local197);
				}
			}
			@Pc(1356) int local1356;
			for (@Pc(1336) int local1336 = 0; local1336 < super.anInt2934; local1336++) {
				for (@Pc(1340) int local1340 = 0; local1340 < super.anInt2928; local1340++) {
					@Pc(1352) short[] local1352 = this.aShortArrayArray3[local1336 + super.anInt2934 * local1340];
					if (local1352 != null) {
						local1356 = 0;
						@Pc(1358) int local1358 = 0;
						while (local1358 < local1352.length) {
							@Pc(1367) int local1367 = local1352[local1358++] & 0xFFFF;
							@Pc(1374) int local1374 = local1352[local1358++] & 0xFFFF;
							@Pc(1381) int local1381 = local1352[local1358++] & 0xFFFF;
							@Pc(1385) Class2_Sub25 local1385 = local170[local1367];
							@Pc(1389) Class2_Sub25 local1389 = local170[local1374];
							@Pc(1393) Class2_Sub25 local1393 = local170[local1381];
							@Pc(1395) Class2_Sub25 local1395 = null;
							if (local1385 != null) {
								local1385.method3529(local1336, local1340, local1356);
								local1395 = local1385;
							}
							if (local1389 != null) {
								local1389.method3529(local1336, local1340, local1356);
								if (local1395 == null || local1389.aLong227 < local1395.aLong227) {
									local1395 = local1389;
								}
							}
							if (local1393 != null) {
								local1393.method3529(local1336, local1340, local1356);
								if (local1395 == null || local1395.aLong227 > local1393.aLong227) {
									local1395 = local1393;
								}
							}
							if (local1395 != null) {
								if (local1385 != null) {
									local1395.method3525(local1367);
								}
								if (local1389 != null) {
									local1395.method3525(local1374);
								}
								if (local1393 != null) {
									local1395.method3525(local1381);
								}
								local1395.method3529(local1336, local1340, local1356);
							}
							local1356++;
						}
					}
				}
			}
			local166.c();
			this.anInterface1_4 = this.aClass49_Sub2_11.method1590(local139, local166.b(), local161);
			this.aClass260_7 = new Class260(this.anInterface1_4, 5126, 3, 0);
			this.aClass260_9 = new Class260(this.anInterface1_4, 5121, 4, 12);
			@Pc(1532) byte local1532;
			if (this.anIntArrayArrayArray6 == null) {
				local1532 = 24;
				this.aClass260_8 = new Class260(this.anInterface1_4, 5126, 2, 16);
			} else {
				local1532 = 28;
				this.aClass260_8 = new Class260(this.anInterface1_4, 5126, 3, 16);
			}
			if ((this.anInt2085 & 0x7) != 0) {
				this.aClass260_6 = new Class260(this.anInterface1_4, 5126, 3, local1532);
			}
			@Pc(1576) long[] local1576 = new long[this.aClass2_Sub25Array1.length];
			for (local1356 = 0; local1356 < this.aClass2_Sub25Array1.length; local1356++) {
				@Pc(1585) Class2_Sub25 local1585 = this.aClass2_Sub25Array1[local1356];
				local1576[local1356] = local1585.aLong227;
				local1585.method3524(this.anInt2073);
			}
			Static432.method5651(this.aClass2_Sub25Array1, local1576);
			if (this.aClass89_1 != null) {
				this.aClass89_1.method2112();
			}
		} else {
			this.aClass89_1 = null;
		}
		this.aByteArrayArray15 = null;
		this.anIntArrayArrayArray5 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray1 = null;
		this.aClass163_6 = null;
		this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray7 = this.anIntArrayArrayArray4 = null;
		this.aClass2_Sub25ArrayArrayArray1 = null;
		this.anIntArrayArrayArray3 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2356(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2091 <= 0) {
			return;
		}
		this.aClass49_Sub2_11.method1614();
		this.aClass49_Sub2_11.method1582(false);
		this.aClass49_Sub2_11.method1587(false);
		this.aClass49_Sub2_11.method1588(false);
		this.aClass49_Sub2_11.method1635(false);
		this.aClass49_Sub2_11.method1626(0);
		this.aClass49_Sub2_11.method1594(-2);
		this.aClass49_Sub2_11.method1646(null);
		Static111.aFloatArray23[15] = 1.0F;
		Static111.aFloatArray23[2] = 0.0F;
		Static111.aFloatArray23[11] = 0.0F;
		Static111.aFloatArray23[5] = (float) 1024 / ((float) this.aClass49_Sub2_11.anInt1823 * (float) super.anInt2927 * 128.0F);
		Static111.aFloatArray23[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass49_Sub2_11.anInt1824) - 1.0F;
		Static111.aFloatArray23[7] = 0.0F;
		Static111.aFloatArray23[14] = 0.0F;
		Static111.aFloatArray23[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass49_Sub2_11.anInt1823;
		Static111.aFloatArray23[1] = 0.0F;
		Static111.aFloatArray23[0] = (float) 1024 / ((float) super.anInt2927 * 128.0F * (float) this.aClass49_Sub2_11.anInt1824);
		Static111.aFloatArray23[10] = 0.0F;
		Static111.aFloatArray23[6] = 0.0F;
		Static111.aFloatArray23[8] = 0.0F;
		Static111.aFloatArray23[4] = 0.0F;
		Static111.aFloatArray23[3] = 0.0F;
		Static111.aFloatArray23[9] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static111.aFloatArray23, 0);
		Static111.aFloatArray23[14] = 0.0F;
		Static111.aFloatArray23[9] = 1.0F;
		Static111.aFloatArray23[2] = 0.0F;
		Static111.aFloatArray23[13] = 0.0F;
		Static111.aFloatArray23[4] = 0.0F;
		Static111.aFloatArray23[3] = 0.0F;
		Static111.aFloatArray23[7] = 0.0F;
		Static111.aFloatArray23[8] = 0.0F;
		Static111.aFloatArray23[6] = 1.0F;
		Static111.aFloatArray23[5] = 0.0F;
		Static111.aFloatArray23[0] = 1.0F;
		Static111.aFloatArray23[15] = 1.0F;
		Static111.aFloatArray23[10] = 0.0F;
		Static111.aFloatArray23[11] = 0.0F;
		Static111.aFloatArray23[1] = 0.0F;
		Static111.aFloatArray23[12] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static111.aFloatArray23, 0);
		if ((this.anInt2085 & 0x7) == 0) {
			this.aClass49_Sub2_11.method1587(false);
		} else {
			this.aClass49_Sub2_11.method1587(true);
			this.aClass49_Sub2_11.method1577();
		}
		this.aClass49_Sub2_11.method1618(this.aClass260_7, this.aClass260_9, this.aClass260_6, this.aClass260_8);
		if (Static92.aClass2_Sub23_5.aByteArray130.length < this.anInt2071 * 2) {
			Static92.aClass2_Sub23_5 = new Class2_Sub23(this.anInt2071 * 2);
		} else {
			Static92.aClass2_Sub23_5.anInt6952 = 0;
		}
		@Pc(310) int local310 = 0;
		@Pc(316) int local316;
		@Pc(325) int local325;
		@Pc(327) int local327;
		@Pc(346) short[] local346;
		@Pc(350) int local350;
		if (this.aClass49_Sub2_11.aBoolean111) {
			for (local316 = arg1; local316 < arg3; local316++) {
				local325 = super.anInt2934 * local316 + arg0;
				for (local327 = arg0; local327 < arg2; local327++) {
					if (arg4[local327 - arg0][local316 - arg1]) {
						local346 = this.aShortArrayArray3[local325];
						if (local346 != null) {
							for (local350 = 0; local350 < local346.length; local350++) {
								local310++;
								Static92.aClass2_Sub23_5.method5502(local346[local350] & 0xFFFF);
							}
						}
					}
					local325++;
				}
			}
		} else {
			for (local316 = arg1; local316 < arg3; local316++) {
				local325 = local316 * super.anInt2934 + arg0;
				for (local327 = arg0; local327 < arg2; local327++) {
					if (arg4[local327 - arg0][local316 - arg1]) {
						local346 = this.aShortArrayArray3[local325];
						if (local346 != null) {
							for (local350 = 0; local350 < local346.length; local350++) {
								local310++;
								Static92.aClass2_Sub23_5.method5457(local346[local350] & 0xFFFF);
							}
						}
					}
					local325++;
				}
			}
		}
		if (local310 > 0) {
			@Pc(466) Class41_Sub2 local466 = new Class41_Sub2(this.aClass49_Sub2_11, 5123, Static92.aClass2_Sub23_5.aByteArray130, Static92.aClass2_Sub23_5.anInt6952);
			this.aClass49_Sub2_11.method1631(local310, 0, local466);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method1682(arg0, arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray15[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray15[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass89_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass49_Sub2_11.anInt2029 * arg2 >> 8) >> this.aClass49_Sub2_11.anInt2003;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass49_Sub2_11.anInt2049 >> 8) >> this.aClass49_Sub2_11.anInt2003;
			this.aClass89_1.method2109(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILclient!fk;I)V")
	private void method1684(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub5_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray7[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray4[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static221.anIntArray361.length) {
			Static221.anIntArray361 = new int[local22];
			Static295.anIntArray428 = new int[local22];
		}
		for (@Pc(40) int local40 = 0; local40 < local22; local40++) {
			Static221.anIntArray361[local40] = (local12[local40] & 0xFF) >> this.aClass49_Sub2_11.anInt2003;
			Static295.anIntArray428[local40] = (local19[local40] & 0xFF) >> this.aClass49_Sub2_11.anInt2003;
		}
		@Pc(72) int local72 = 0;
		while (local72 < local22) {
			@Pc(78) int local78 = Static221.anIntArray361[local72];
			@Pc(83) int local83 = Static295.anIntArray428[local72++];
			@Pc(87) int local87 = Static221.anIntArray361[local72];
			@Pc(92) int local92 = Static295.anIntArray428[local72++];
			@Pc(96) int local96 = Static221.anIntArray361[local72];
			@Pc(101) int local101 = Static295.anIntArray428[local72++];
			if ((local78 - local87) * (local92 + -local101) - (local92 - local83) * (local96 - local87) > 0) {
				arg1.method2001(local101, local83, local96, local92, local78, local87);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)V")
	@Override
	public void method2354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method2351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.B(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}
}
