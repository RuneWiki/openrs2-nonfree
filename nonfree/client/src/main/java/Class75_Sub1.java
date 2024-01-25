import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!eo", name = "lb", descriptor = "J")
	public static long lb = -1L;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
	private int anInt2247;

	@OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!eo", name = "X", descriptor = "Lclient!vs;")
	public Class304 aClass304_1;

	@OriginalMember(owner = "client!eo", name = "Y", descriptor = "Lclient!vs;")
	private Class304 aClass304_2;

	@OriginalMember(owner = "client!eo", name = "db", descriptor = "I")
	private int anInt2266;

	@OriginalMember(owner = "client!eo", name = "eb", descriptor = "Lclient!tq;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!eo", name = "jb", descriptor = "[Lclient!gd;")
	private Class2_Sub23[] aClass2_Sub23Array1;

	@OriginalMember(owner = "client!eo", name = "kb", descriptor = "I")
	private int anInt2268;

	@OriginalMember(owner = "client!eo", name = "P", descriptor = "Lclient!rk;")
	private final Class249 aClass249_14 = new Class249();

	@OriginalMember(owner = "client!eo", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!eo", name = "F", descriptor = "Lclient!kw;")
	public final Class39_Sub2 aClass39_Sub2_8;

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
	private final int anInt2262;

	@OriginalMember(owner = "client!eo", name = "J", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!eo", name = "T", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "[[B")
	private final byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!eo", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!eo", name = "V", descriptor = "[[[Lclient!gd;")
	private Class2_Sub23[][][] aClass2_Sub23ArrayArrayArray1;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
	public final int anInt2246;

	@OriginalMember(owner = "client!eo", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!eo", name = "H", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
	private final int anInt2259;

	@OriginalMember(owner = "client!eo", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!eo", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!eo", name = "ib", descriptor = "Lclient!ica;")
	private Class127 aClass127_22;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Lclient!pr;")
	private Class227 aClass227_1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!kw;IIII[[I[[II)V")
	public Class75_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray30 = arg5;
		this.aClass39_Sub2_8 = arg0;
		this.anInt2262 = super.anInt7996 - 2;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aByteArrayArray6 = new byte[arg3][arg4];
		this.aFloatArrayArray1 = new float[super.anInt7998 + 1][super.anInt7995 + 1];
		this.aClass2_Sub23ArrayArrayArray1 = new Class2_Sub23[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anInt2246 = arg2;
		this.aFloatArrayArray3 = new float[super.anInt7998 + 1][super.anInt7995 + 1];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.anInt2259 = 0x1 << this.anInt2262;
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray2 = new float[super.anInt7998 + 1][super.anInt7995 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; local117 < super.anInt7995; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt7998 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(155) int local155 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + local139 * local139 + arg7 * arg7 * 4)));
				this.aFloatArrayArray2[local121][local117] = local175 * (float) local139;
				this.aFloatArrayArray3[local121][local117] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray1[local121][local117] = (float) local155 * local175;
			}
		}
		this.aClass127_22 = new Class127(128);
		if ((this.anInt2246 & 0x10) != 0) {
			this.aClass227_1 = new Class227(this.aClass39_Sub2_8, this);
		}
	}

	@OriginalMember(owner = "client!eo", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt7996;
		@Pc(13) int local13 = arg1 >> super.anInt7996;
		if (local8 < 0 || local13 < 0 || super.anInt7998 - 1 < local8 || super.anInt7995 - 1 < local13) {
			return 0;
		}
		@Pc(52) int local52 = super.anInt7994 - 1 & arg0;
		@Pc(59) int local59 = arg1 & super.anInt7994 - 1;
		@Pc(86) int local86 = this.anIntArrayArray30[local8][local13] * (super.anInt7994 - local52) + this.anIntArrayArray30[local8 + 1][local13] * local52 >> super.anInt7996;
		@Pc(117) int local117 = this.anIntArrayArray30[local8][local13 + 1] * (super.anInt7994 - local52) + this.anIntArrayArray30[local8 + 1][local13 + 1] * local52 >> super.anInt7996;
		return local117 * local59 + local86 * (super.anInt7994 - local59) >> super.anInt7996;
	}

	@OriginalMember(owner = "client!eo", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray7[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray7[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!eo", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass227_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass39_Sub2_8.anInt7306 * arg2 >> 8) >> this.aClass39_Sub2_8.anInt7289;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass39_Sub2_8.anInt7295 >> 8) >> this.aClass39_Sub2_8.anInt7289;
			this.aClass227_1.method5952(local38, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.IA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!eo", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[super.anInt7998][super.anInt7995][];
		}
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt7998][super.anInt7995][];
		}
		this.anIntArrayArrayArray5[arg0][arg1] = arg2;
		this.anIntArrayArrayArray6[arg0][arg1] = arg4;
		this.anIntArrayArrayArray3[arg0][arg1] = arg6;
		this.anIntArrayArrayArray7[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub23[] local88 = this.aClass2_Sub23ArrayArrayArray1[arg0][arg1] = new Class2_Sub23[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
			@Pc(125) Class2 local125;
			for (local125 = this.aClass127_22.method3205(local119); local125 != null; local125 = this.aClass127_22.method3210()) {
				@Pc(130) Class2_Sub23 local130 = (Class2_Sub23) local125;
				if (arg8[local90] == local130.anInt2771 && (float) arg9[local90] == local130.aFloat50 && local130.anInt2773 == arg10 && local130.anInt2766 == arg11 && arg12 == local130.anInt2768) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub23(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass127_22.method3213(local88[local90], local119);
			} else {
				local88[local90] = (Class2_Sub23) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray6[arg0][arg1] = (byte) (this.aByteArrayArray6[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt2268) {
			this.anInt2268 = arg6.length;
		}
		this.anInt2266 += arg6.length;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!at;[I)V")
	@Override
	public void method6706(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass249_14.method6523(new Class2_Sub24(this.aClass39_Sub2_8, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIBII[[ZZ)V")
	private void method2185(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean[][] arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass2_Sub23Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg0 + arg0 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (local18 > Static158.anIntArray343.length) {
			Static158.anIntArray343 = new int[local18];
		}
		@Pc(34) int local34 = arg2 - arg0;
		@Pc(36) int local36 = local34;
		if (local34 < 0) {
			local34 = 0;
		}
		@Pc(45) int local45 = arg1 - arg0;
		@Pc(47) int local47 = local45;
		if (local45 < 0) {
			local45 = 0;
		}
		@Pc(55) int local55 = arg0 + arg2;
		if (local55 > super.anInt7998 - 1) {
			local55 = super.anInt7998 - 1;
		}
		@Pc(74) int local74 = arg0 + arg1;
		Static257.anInt4642 = 0;
		if (local74 > super.anInt7995 - 1) {
			local74 = super.anInt7995 - 1;
		}
		for (@Pc(89) int local89 = local34; local89 <= local55; local89++) {
			@Pc(98) boolean[] local98 = arg3[local89 - local36];
			for (@Pc(100) int local100 = local45; local100 <= local74; local100++) {
				if (local98[local100 - local47]) {
					Static158.anIntArray343[Static257.anInt4642++] = local89 + local100 * super.anInt7998;
				}
			}
		}
		this.aClass39_Sub2_8.method6146();
		this.aClass39_Sub2_8.method6159();
		this.aClass39_Sub2_8.method6139((this.anInt2246 & 0x7) != 0);
		this.aClass39_Sub2_8.method6208(false, -1, false);
		this.aClass39_Sub2_8.method6095(0, this.anInterface19_1);
		for (@Pc(185) int local185 = 0; local185 < this.aClass2_Sub23Array1.length; local185++) {
			this.aClass2_Sub23Array1[local185].method2620(Static158.anIntArray343, Static257.anInt4642);
		}
		@Pc(206) Class181_Sub2 local206 = this.aClass39_Sub2_8.method6158();
		local206.oa(0, -1, 0);
		this.aClass39_Sub2_8.method6089();
		if (!this.aClass249_14.method6519()) {
			@Pc(224) int local224 = this.aClass39_Sub2_8.anInt7301;
			@Pc(228) int local228 = this.aClass39_Sub2_8.anInt7277;
			this.aClass39_Sub2_8.E(0, local228, this.aClass39_Sub2_8.anInt7308);
			this.aClass39_Sub2_8.method6139(false);
			this.aClass39_Sub2_8.method6171(false);
			this.aClass39_Sub2_8.method6088(128);
			this.aClass39_Sub2_8.method6208(false, -2, false);
			this.aClass39_Sub2_8.method6179(this.aClass39_Sub2_8.anInterface11_3);
			this.aClass39_Sub2_8.method6093(Static389.aClass165_3, Static99.aClass165_2);
			this.aClass39_Sub2_8.method6192(0, Static254.aClass111_2);
			this.aClass39_Sub2_8.method6085(Static463.aClass111_4, 0);
			for (@Pc(288) Class2 local288 = this.aClass249_14.method6527(); local288 != null; local288 = this.aClass249_14.method6525()) {
				@Pc(293) Class2_Sub24 local293 = (Class2_Sub24) local288;
				local293.method2725(arg3, arg1, arg0, arg2);
			}
			this.aClass39_Sub2_8.method6192(0, Static132.aClass111_1);
			this.aClass39_Sub2_8.method6085(Static132.aClass111_1, 0);
			this.aClass39_Sub2_8.method6179(null);
			this.aClass39_Sub2_8.E(local224, local228, this.aClass39_Sub2_8.anInt7308);
		}
		if (this.aClass227_1 != null) {
			this.aClass39_Sub2_8.method6095(0, this.anInterface19_1);
			this.aClass39_Sub2_8.method6200(this.aClass304_2);
			this.aClass227_1.method5951(arg4, arg2, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6698(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2266 <= 0) {
			return;
		}
		@Pc(19) Interface7 local19 = this.aClass39_Sub2_8.method6129(this.anInt2247);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method6952();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass39_Sub2_8.method6195(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(77) short[] local77;
				@Pc(81) int local81;
				@Pc(89) int local89;
				if (Stream.a()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt7998 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray1[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										if (local89 < local23) {
											local23 = local89;
										}
										local44.f(local89);
										local21++;
										if (local25 < local89) {
											local25 = local89;
										}
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = local48 * super.anInt7998 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray1[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										if (local23 > local89) {
											local23 = local89;
										}
										local21++;
										if (local25 < local89) {
											local25 = local89;
										}
										local44.e(local89);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.c();
				if (local19.method6954()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass39_Sub2_8.method6107();
		this.aClass39_Sub2_8.method6102(false);
		this.aClass39_Sub2_8.method6139(false);
		this.aClass39_Sub2_8.method6187(false);
		this.aClass39_Sub2_8.method6171(false);
		this.aClass39_Sub2_8.method6088(0);
		this.aClass39_Sub2_8.method6208(false, -2, false);
		this.aClass39_Sub2_8.method6179(null);
		@Pc(280) Class181_Sub2 local280 = this.aClass39_Sub2_8.method6158();
		@Pc(285) float[] local285 = this.aClass39_Sub2_8.method6113();
		local285[2] = 0.0F;
		local285[0] = (float) 1024 / ((float) this.aClass39_Sub2_8.anInt7145 * (float) super.anInt7994 * 128.0F);
		local285[3] = 0.0F;
		local285[1] = 0.0F;
		local285[11] = 0.0F;
		local285[6] = 0.0F;
		local285[5] = (float) 1024 / ((float) this.aClass39_Sub2_8.anInt7126 * 128.0F * (float) super.anInt7994);
		local285[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass39_Sub2_8.anInt7126;
		local285[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass39_Sub2_8.anInt7145) - 1.0F;
		local285[4] = 0.0F;
		local285[9] = 0.0F;
		local285[8] = 0.0F;
		local285[7] = 0.0F;
		local285[10] = 0.0F;
		local285[14] = 0.0F;
		local285[15] = 1.0F;
		local280.method5391(0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		this.aClass39_Sub2_8.method6181();
		this.aClass39_Sub2_8.method6089();
		if ((this.anInt2246 & 0x7) == 0) {
			this.aClass39_Sub2_8.method6139(false);
		} else {
			this.aClass39_Sub2_8.method6139(true);
			this.aClass39_Sub2_8.method6155();
		}
		this.aClass39_Sub2_8.method6124(false);
		this.aClass39_Sub2_8.method6200(this.aClass304_2);
		this.aClass39_Sub2_8.method6095(0, this.anInterface19_1);
		this.aClass39_Sub2_8.method6215(local19, 0, Static514.aClass281_6, local21 / 3, local23, local25 + 1 - local23);
		this.aClass39_Sub2_8.method6124(true);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method6703(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass227_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass39_Sub2_8.anInt7306 * arg2 >> 8) >> this.aClass39_Sub2_8.anInt7289;
			@Pc(40) int local40 = arg3 - (this.aClass39_Sub2_8.anInt7295 * arg2 >> 8) >> this.aClass39_Sub2_8.anInt7289;
			return this.aClass227_1.method5950(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt2266 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt7998 + 1][super.anInt7995 + 1];
			for (@Pc(20) int local20 = 1; local20 < super.anInt7998; local20++) {
				for (@Pc(24) int local24 = 1; super.anInt7995 > local24; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray7[local20 + 1][local24] >> 3) + (this.aByteArrayArray7[local20 - 1][local24] >> 2) + (this.aByteArrayArray7[local20][local24 + -1] >> 2) + (this.aByteArrayArray7[local20][local24 - -1] >> 3) + (this.aByteArrayArray7[local20][local24] >> 1));
				}
			}
			@Pc(108) Class2_Sub23[] local108 = new Class2_Sub23[this.aClass127_22.method3209()];
			this.aClass127_22.method3207(local108);
			for (@Pc(116) int local116 = 0; local116 < local108.length; local116++) {
				local108[local116].method2616(this.anInt2266);
			}
			@Pc(132) int local132 = 24;
			if (this.anIntArrayArrayArray2 != null) {
				local132 += 4;
			}
			if ((this.anInt2246 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass39_Sub2_8.aNativeHeap5.a(this.anInt2266 * local132, false);
			@Pc(160) Stream local160 = new Stream(local155);
			@Pc(164) Class2_Sub23[] local164 = new Class2_Sub23[this.anInt2266];
			@Pc(171) int local171 = Static266.method4292(this.anInt2266 / 4);
			if (local171 < 1) {
				local171 = 1;
			}
			@Pc(181) Class127 local181 = new Class127(local171);
			@Pc(185) Class2_Sub23[] local185 = new Class2_Sub23[this.anInt2268];
			@Pc(191) int local191;
			for (@Pc(187) int local187 = 0; super.anInt7998 > local187; local187++) {
				for (local191 = 0; local191 < super.anInt7995; local191++) {
					if (this.anIntArrayArrayArray3[local187][local191] != null) {
						@Pc(207) Class2_Sub23[] local207 = this.aClass2_Sub23ArrayArrayArray1[local187][local191];
						@Pc(214) int[] local214 = this.anIntArrayArrayArray5[local187][local191];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray6[local187][local191];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray7[local187][local191];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray3[local187][local191];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local187][local191];
						if (local228 == null) {
							local228 = local235;
						}
						@Pc(263) int[] local263 = this.anIntArrayArrayArray2 == null ? null : this.anIntArrayArrayArray2[local187][local191];
						@Pc(270) float local270 = this.aFloatArrayArray2[local187][local191];
						@Pc(277) float local277 = this.aFloatArrayArray3[local187][local191];
						@Pc(284) float local284 = this.aFloatArrayArray1[local187][local191];
						@Pc(293) float local293 = this.aFloatArrayArray2[local187][local191 + 1];
						@Pc(302) float local302 = this.aFloatArrayArray3[local187][local191 + 1];
						@Pc(311) float local311 = this.aFloatArrayArray1[local187][local191 + 1];
						@Pc(322) float local322 = this.aFloatArrayArray2[local187 + 1][local191 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray3[local187 + 1][local191 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray1[local187 + 1][local191 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray2[local187 + 1][local191];
						@Pc(362) float local362 = this.aFloatArrayArray3[local187 + 1][local191];
						@Pc(371) float local371 = this.aFloatArrayArray1[local187 + 1][local191];
						@Pc(379) int local379 = local18[local187][local191] & 0xFF;
						@Pc(389) int local389 = local18[local187][local191 + 1] & 0xFF;
						@Pc(401) int local401 = local18[local187 + 1][local191 + 1] & 0xFF;
						@Pc(411) int local411 = local18[local187 + 1][local191] & 0xFF;
						@Pc(413) int local413 = 0;
						@Pc(423) int local423;
						label355: for (@Pc(415) int local415 = 0; local415 < local235.length; local415++) {
							@Pc(421) Class2_Sub23 local421 = local207[local415];
							for (local423 = 0; local423 < local413; local423++) {
								if (local421 == local185[local423]) {
									continue label355;
								}
							}
							local185[local413++] = local421;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray1[local187 + super.anInt7998 * local191] = new short[local235.length];
						for (local423 = 0; local423 < local235.length; local423++) {
							@Pc(473) int local473 = (local187 << super.anInt7996) + local214[local423];
							@Pc(482) int local482 = (local191 << super.anInt7996) + local221[local423];
							@Pc(487) int local487 = local473 >> this.anInt2262;
							@Pc(492) int local492 = local482 >> this.anInt2262;
							@Pc(496) int local496 = local235[local423];
							@Pc(500) int local500 = local228[local423];
							@Pc(508) int local508 = local247 == null ? 0 : local247[local423];
							@Pc(526) long local526 = (long) local492 | (long) local500 << 48 | (long) local496 << 32 | (long) (local487 << 16);
							@Pc(530) int local530 = local214[local423];
							@Pc(534) int local534 = local221[local423];
							@Pc(536) byte local536 = 74;
							@Pc(538) int local538 = 0;
							@Pc(582) float local582;
							@Pc(590) float local590;
							@Pc(588) float local588;
							@Pc(624) float local624;
							@Pc(586) int local586;
							if (local530 == 0 && local534 == 0) {
								local586 = local536 - local379;
								local582 = local270;
								local590 = local277;
								local588 = local284;
							} else if (local530 == 0 && super.anInt7994 == local534) {
								local590 = local302;
								local588 = local311;
								local582 = local293;
								local586 = local536 - local389;
							} else if (local530 == super.anInt7994 && super.anInt7994 == local534) {
								local586 = local536 - local401;
								local590 = local333;
								local582 = local322;
								local588 = local344;
							} else if (local530 == super.anInt7994 && local534 == 0) {
								local582 = local353;
								local586 = local536 - local411;
								local588 = local371;
								local590 = local362;
							} else {
								@Pc(599) float local599 = (float) local530 / (float) super.anInt7994;
								@Pc(606) float local606 = (float) local534 / (float) super.anInt7994;
								@Pc(615) float local615 = local270 + (local353 - local270) * local599;
								local624 = (local362 - local277) * local599 + local277;
								@Pc(632) float local632 = local284 + local599 * (local371 - local284);
								@Pc(641) float local641 = (local322 - local293) * local599 + local293;
								@Pc(650) float local650 = local302 + (local333 - local302) * local599;
								local582 = (local641 - local615) * local606 + local615;
								@Pc(667) float local667 = local311 + (local344 - local311) * local599;
								local590 = local624 + local606 * (local650 - local624);
								local588 = local632 + local606 * (local667 - local632);
								@Pc(696) int local696 = (local530 * (local411 - local379) >> super.anInt7996) + local379;
								@Pc(708) int local708 = (local530 * (local401 - local389) >> super.anInt7996) + local389;
								local586 = local536 - local696 - ((local708 - local696) * local534 >> super.anInt7996);
							}
							@Pc(760) float local760 = 1.0F;
							if (local496 != -1) {
								@Pc(771) int local771 = local586 * (local496 & 0x7F) >> 7;
								if (local771 < 2) {
									local771 = 2;
								} else if (local771 > 126) {
									local771 = 126;
								}
								local538 = Static445.anIntArray614[local771 | local496 & 0xFF80];
								if ((this.anInt2246 & 0x7) == 0) {
									local760 = local590 * this.aClass39_Sub2_8.aFloatArray61[1] + this.aClass39_Sub2_8.aFloatArray61[0] * local582 + local588 * this.aClass39_Sub2_8.aFloatArray61[2];
									local760 = local760 * (local760 > 0.0F ? this.aClass39_Sub2_8.aFloat200 : this.aClass39_Sub2_8.aFloat192) + this.aClass39_Sub2_8.aFloat189;
								}
							}
							@Pc(844) Class2 local844 = null;
							if ((this.anInt2259 - 1 & local473) == 0 && (local482 & this.anInt2259 - 1) == 0) {
								local844 = local181.method3205(local526);
							}
							@Pc(1175) int local1175;
							@Pc(899) int local899;
							if (local844 == null) {
								if (local496 == local500) {
									local899 = local538;
								} else {
									@Pc(879) int local879 = local586 * (local500 & 0x7F) >> 7;
									if (local879 < 2) {
										local879 = 2;
									} else if (local879 > 126) {
										local879 = 126;
									}
									local899 = Static445.anIntArray614[local500 & 0xFF80 | local879];
									if ((this.anInt2246 & 0x7) == 0) {
										@Pc(930) float local930 = this.aClass39_Sub2_8.aFloatArray61[0] * local582 + local590 * this.aClass39_Sub2_8.aFloatArray61[1] + this.aClass39_Sub2_8.aFloatArray61[2] * local588;
										local624 = local760 * (local760 > 0.0F ? this.aClass39_Sub2_8.aFloat200 : this.aClass39_Sub2_8.aFloat192) + this.aClass39_Sub2_8.aFloat189;
										@Pc(955) int local955 = local899 >> 16 & 0xFF;
										@Pc(961) int local961 = local899 >> 8 & 0xFF;
										@Pc(965) int local965 = local899 & 0xFF;
										local955 = (int) ((float) local955 * local624);
										if (local955 < 0) {
											local955 = 0;
										} else if (local955 > 255) {
											local955 = 255;
										}
										local961 = (int) ((float) local961 * local624);
										if (local961 < 0) {
											local961 = 0;
										} else if (local961 > 255) {
											local961 = 255;
										}
										local965 = (int) ((float) local965 * local624);
										if (local965 < 0) {
											local965 = 0;
										} else if (local965 > 255) {
											local965 = 255;
										}
										local899 = local961 << 8 | local955 << 16 | local965;
									}
								}
								if (Stream.a()) {
									local160.a((float) local473);
									local160.a((float) (this.aa(local473, local482) + local508));
									local160.a((float) local482);
									local160.a((float) local473);
									local160.a((float) local482);
									if (this.anIntArrayArrayArray2 != null) {
										local160.a((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt2246 & 0x7) != 0) {
										local160.a(local582);
										local160.a(local590);
										local160.a(local588);
									}
								} else {
									local160.b((float) local473);
									local160.b((float) (this.aa(local473, local482) + local508));
									local160.b((float) local482);
									local160.b((float) local473);
									local160.b((float) local482);
									if (this.anIntArrayArrayArray2 != null) {
										local160.b((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt2246 & 0x7) != 0) {
										local160.b(local582);
										local160.b(local590);
										local160.b(local588);
									}
								}
								if (this.aClass39_Sub2_8.anInt7313 == 0) {
									local160.d(local899 | 0xFF000000);
								} else {
									local160.c(local899 | 0xFF000000);
								}
								local1175 = this.anInt2260++;
								local460[local423] = (short) local1175;
								if (local496 != -1) {
									local164[local1175] = local207[local423];
								}
								local181.method3213(new Class2_Sub15(local460[local423]), local526);
							} else {
								local460[local423] = ((Class2_Sub15) local844).aShort24;
								local1175 = local460[local423] & 0xFFFF;
								if (local496 != -1 && local207[local423].aLong241 < local164[local1175].aLong241) {
									local164[local1175] = local207[local423];
								}
							}
							for (local899 = 0; local899 < local413; local899++) {
								local185[local899].method2618(local760, local1175, local586, local538);
							}
							this.anInt2247++;
						}
					}
				}
			}
			for (local191 = 0; local191 < this.anInt2260; local191++) {
				@Pc(1292) Class2_Sub23 local1292 = local164[local191];
				if (local1292 != null) {
					local1292.method2614(local191);
				}
			}
			@Pc(1309) int local1309;
			@Pc(1327) int local1327;
			for (@Pc(1305) int local1305 = 0; super.anInt7998 > local1305; local1305++) {
				for (local1309 = 0; local1309 < super.anInt7995; local1309++) {
					@Pc(1321) short[] local1321 = this.aShortArrayArray1[local1305 + super.anInt7998 * local1309];
					if (local1321 != null) {
						@Pc(1325) int local1325 = 0;
						local1327 = 0;
						while (local1327 < local1321.length) {
							@Pc(1336) int local1336 = local1321[local1327++] & 0xFFFF;
							@Pc(1343) int local1343 = local1321[local1327++] & 0xFFFF;
							@Pc(1350) int local1350 = local1321[local1327++] & 0xFFFF;
							@Pc(1354) Class2_Sub23 local1354 = local164[local1336];
							@Pc(1358) Class2_Sub23 local1358 = local164[local1343];
							@Pc(1362) Class2_Sub23 local1362 = local164[local1350];
							@Pc(1364) Class2_Sub23 local1364 = null;
							if (local1354 != null) {
								local1354.method2615(local1309, local1305, local1325);
								local1364 = local1354;
							}
							if (local1358 != null) {
								local1358.method2615(local1309, local1305, local1325);
								if (local1364 == null || local1364.aLong241 > local1358.aLong241) {
									local1364 = local1358;
								}
							}
							if (local1362 != null) {
								local1362.method2615(local1309, local1305, local1325);
								if (local1364 == null || local1364.aLong241 > local1362.aLong241) {
									local1364 = local1362;
								}
							}
							if (local1364 != null) {
								if (local1354 != null) {
									local1364.method2614(local1336);
								}
								if (local1358 != null) {
									local1364.method2614(local1343);
								}
								if (local1362 != null) {
									local1364.method2614(local1350);
								}
								local1364.method2615(local1309, local1305, local1325);
							}
							local1325++;
						}
					}
				}
			}
			local160.c();
			this.anInterface19_1 = this.aClass39_Sub2_8.method6100(false);
			this.anInterface19_1.method6489(local155, local132 * this.anInt2260, local132);
			if ((this.anInt2246 & 0x7) == 0) {
				if (this.anIntArrayArrayArray2 == null) {
					this.aClass304_2 = this.aClass39_Sub2_8.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5, Static241.aClass154_3 }) });
					this.aClass304_1 = this.aClass39_Sub2_8.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5 }), new Class287(Static241.aClass154_3) });
				} else {
					this.aClass304_2 = this.aClass39_Sub2_8.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5, Static241.aClass154_4, Static241.aClass154_3 }) });
					this.aClass304_1 = this.aClass39_Sub2_8.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5, Static241.aClass154_4 }), new Class287(Static241.aClass154_3) });
				}
			} else if (this.anIntArrayArrayArray2 == null) {
				this.aClass304_2 = this.aClass39_Sub2_8.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5, Static241.aClass154_2, Static241.aClass154_3 }) });
				this.aClass304_1 = this.aClass39_Sub2_8.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5, Static241.aClass154_2 }), new Class287(Static241.aClass154_3) });
			} else {
				this.aClass304_2 = this.aClass39_Sub2_8.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5, Static241.aClass154_4, Static241.aClass154_2, Static241.aClass154_3 }) });
				this.aClass304_1 = this.aClass39_Sub2_8.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_5, Static241.aClass154_4, Static241.aClass154_2 }), new Class287(Static241.aClass154_3) });
			}
			local1309 = 0;
			for (@Pc(1783) int local1783 = 0; local1783 < local108.length; local1783++) {
				if (local108[local1783].anInt2775 > 0) {
					local108[local1309++] = local108[local1783];
				}
			}
			this.aClass2_Sub23Array1 = new Class2_Sub23[local1309];
			@Pc(1812) long[] local1812 = new long[local1309];
			for (local1327 = 0; local1327 < local1309; local1327++) {
				@Pc(1820) Class2_Sub23 local1820 = local108[local1327];
				local1812[local1327] = local1820.aLong241;
				this.aClass2_Sub23Array1[local1327] = local1820;
				local1820.method2617(this.anInt2260);
			}
			Static410.method6417(local1812, this.aClass2_Sub23Array1);
			if (this.aClass227_1 != null) {
				this.aClass227_1.method5954();
			}
		} else {
			this.aClass227_1 = null;
		}
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray4 = null;
		this.aByteArrayArray7 = null;
		this.aClass2_Sub23ArrayArrayArray1 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray5 = this.anIntArrayArrayArray6 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray1 = null;
		this.aClass127_22 = null;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V")
	@Override
	public void method6699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method2185(arg2, arg1, arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!eo", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class2_Sub13_Sub6 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13_Sub6 arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt7994 >> this.aClass39_Sub2_8.anInt7289;
		@Pc(24) Class2_Sub13_Sub6_Sub2 local24 = (Class2_Sub13_Sub6_Sub2) arg2;
		@Pc(40) Class2_Sub13_Sub6_Sub2 local40;
		if (local24 != null && local24.method7451(local21, local21)) {
			local40 = local24;
			local24.method7448();
		} else {
			local40 = new Class2_Sub13_Sub6_Sub2(this.aClass39_Sub2_8, local21, local21);
		}
		local40.method7447(local21, local21, 0, 0);
		this.method2187(arg0, arg1, local40);
		return local40;
	}

	@OriginalMember(owner = "client!eo", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass227_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass39_Sub2_8.anInt7306 * arg2 >> 8) >> this.aClass39_Sub2_8.anInt7289;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass39_Sub2_8.anInt7295 >> 8) >> this.aClass39_Sub2_8.anInt7289;
			this.aClass227_1.method5948(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIILclient!vh;)V")
	private void method2187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub13_Sub6_Sub2 arg2) {
		@Pc(16) int[] local16 = this.anIntArrayArrayArray5[arg0][arg1];
		@Pc(23) int[] local23 = this.anIntArrayArrayArray6[arg0][arg1];
		@Pc(26) int local26 = local16.length;
		if (local26 > Static155.anIntArray341.length) {
			Static69.anIntArray119 = new int[local26];
			Static155.anIntArray341 = new int[local26];
		}
		for (@Pc(38) int local38 = 0; local38 < local26; local38++) {
			Static155.anIntArray341[local38] = local16[local38] >> this.aClass39_Sub2_8.anInt7289;
			Static69.anIntArray119[local38] = local23[local38] >> this.aClass39_Sub2_8.anInt7289;
		}
		@Pc(70) int local70 = 0;
		while (local70 < local26) {
			@Pc(76) int local76 = Static155.anIntArray341[local70];
			@Pc(81) int local81 = Static69.anIntArray119[local70++];
			@Pc(85) int local85 = Static155.anIntArray341[local70];
			@Pc(90) int local90 = Static69.anIntArray119[local70++];
			@Pc(94) int local94 = Static155.anIntArray341[local70];
			@Pc(99) int local99 = Static69.anIntArray119[local70++];
			if (-((local94 - local85) * (local90 - local81)) + (local76 - local85) * (local90 + -local99) > 0) {
				arg2.method7449(local94, local81, local76, local85, local99, local90);
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray30[arg0][arg1];
	}
}
