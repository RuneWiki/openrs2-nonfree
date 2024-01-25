import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!an", name = "y", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!an", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!an", name = "H", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!an", name = "X", descriptor = "[Lclient!fk;")
	private Class4_Sub19[] aClass4_Sub19Array1;

	@OriginalMember(owner = "client!an", name = "Y", descriptor = "Lclient!eu;")
	private Interface4 anInterface4_4;

	@OriginalMember(owner = "client!an", name = "cb", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!an", name = "db", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!an", name = "eb", descriptor = "Lclient!eu;")
	private Interface4 anInterface4_5;

	@OriginalMember(owner = "client!an", name = "fb", descriptor = "Lclient!ts;")
	public Class321 aClass321_2;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "F")
	private float aFloat3 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "F")
	private float aFloat2 = -3.4028235E38F;

	@OriginalMember(owner = "client!an", name = "N", descriptor = "Lclient!gj;")
	private final Class124 aClass124_2 = new Class124();

	@OriginalMember(owner = "client!an", name = "t", descriptor = "I")
	private final int anInt291 = this.anInt9837 - 2;

	@OriginalMember(owner = "client!an", name = "P", descriptor = "[[I")
	private final int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!an", name = "I", descriptor = "Lclient!ej;")
	public final Class66_Sub1 aClass66_Sub1_2;

	@OriginalMember(owner = "client!an", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!an", name = "B", descriptor = "I")
	public final int anInt295;

	@OriginalMember(owner = "client!an", name = "M", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!an", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!an", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!an", name = "S", descriptor = "I")
	private final int anInt305;

	@OriginalMember(owner = "client!an", name = "v", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!an", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!an", name = "L", descriptor = "[[[Lclient!fk;")
	private Class4_Sub19[][][] aClass4_Sub19ArrayArrayArray1;

	@OriginalMember(owner = "client!an", name = "W", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!an", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "[[B")
	private final byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!an", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!an", name = "bb", descriptor = "Lclient!jw;")
	private Class183 aClass183_2;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "Lclient!pm;")
	private Class269 aClass269_1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!ej;IIII[[I[[II)V")
	public Class16_Sub1(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray14 = arg5;
		this.aClass66_Sub1_2 = arg0;
		this.aFloatArrayArray5 = new float[super.anInt9838 + 1][super.anInt9839 + 1];
		this.anInt295 = arg2;
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt9838 + 1][super.anInt9839 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anInt305 = 0x1 << this.anInt291;
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aClass4_Sub19ArrayArrayArray1 = new Class4_Sub19[arg3][arg4][];
		this.aByteArrayArray2 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray3 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aByteArrayArray1 = new byte[arg3][arg4];
		this.aFloatArrayArray6 = new float[super.anInt9838 + 1][super.anInt9839 + 1];
		for (@Pc(123) int local123 = 0; super.anInt9839 >= local123; local123++) {
			for (@Pc(127) int local127 = 0; super.anInt9838 >= local127; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray14[local127][local123];
				if ((float) local136 > this.aFloat2) {
					this.aFloat2 = local136;
				}
				if ((float) local136 < this.aFloat3) {
					this.aFloat3 = local136;
				}
				if (local127 > 0 && local123 > 0 && local127 < super.anInt9838 && local123 < super.anInt9839) {
					@Pc(192) int local192 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(208) int local208 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(227) float local227 = (float) (1.0D / Math.sqrt((double) (local208 * local208 + arg7 * arg7 * 4 + local192 * local192)));
					this.aFloatArrayArray5[local127][local123] = (float) local192 * local227;
					this.aFloatArrayArray6[local127][local123] = local227 * (float) (-arg7 * 2);
					this.aFloatArrayArray4[local127][local123] = (float) local208 * local227;
				}
			}
		}
		this.aFloat3--;
		this.aFloat2++;
		this.aClass183_2 = new Class183(128);
		if ((this.anInt295 & 0x10) != 0) {
			this.aClass269_1 = new Class269(this.aClass66_Sub1_2, this);
		}
	}

	@OriginalMember(owner = "client!an", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt9838][super.anInt9839][];
		}
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt9838][super.anInt9839][];
		}
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray4[arg0][arg1] = arg4;
		this.anIntArrayArrayArray3[arg0][arg1] = arg6;
		this.anIntArrayArrayArray7[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub19[] local88 = this.aClass4_Sub19ArrayArrayArray1[arg0][arg1] = new Class4_Sub19[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14);
			@Pc(125) Class4 local125;
			for (local125 = this.aClass183_2.method4289(local119); local125 != null; local125 = this.aClass183_2.method4290()) {
				@Pc(130) Class4_Sub19 local130 = (Class4_Sub19) local125;
				if (local130.anInt3257 == arg8[local90] && local130.aFloat61 == (float) arg9[local90] && arg10 == local130.anInt3262 && local130.anInt3260 == arg11 && arg12 == local130.anInt3268) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub19(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass183_2.method4282(local119, local88[local90]);
			} else {
				local88[local90] = (Class4_Sub19) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray1[arg0][arg1] = (byte) (this.aByteArrayArray1[arg0][arg1] | 0x1);
		}
		if (this.anInt309 < arg6.length) {
			this.anInt309 = arg6.length;
		}
		this.anInt310 += arg6.length;
	}

	@OriginalMember(owner = "client!an", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray14[arg0][arg1];
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIILclient!df;)V")
	private void method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub7_Sub3_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray4[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static515.anIntArray672.length) {
			Static80.anIntArray213 = new int[local22];
			Static515.anIntArray672 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static515.anIntArray672[local34] = local12[local34] >> this.aClass66_Sub1_2.anInt8437;
			Static80.anIntArray213[local34] = local19[local34] >> this.aClass66_Sub1_2.anInt8437;
		}
		@Pc(66) int local66 = 0;
		while (local66 < local22) {
			@Pc(72) int local72 = Static515.anIntArray672[local66];
			@Pc(77) int local77 = Static80.anIntArray213[local66++];
			@Pc(81) int local81 = Static515.anIntArray672[local66];
			@Pc(86) int local86 = Static80.anIntArray213[local66++];
			@Pc(90) int local90 = Static515.anIntArray672[local66];
			@Pc(95) int local95 = Static80.anIntArray213[local66++];
			if (-((local86 - local77) * (local90 + -local81)) + (local86 - local95) * (-local81 + local72) > 0) {
				arg2.method2091(local77, local72, local90, local86, local81, local95);
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass269_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass66_Sub1_2.anInt8420 >> 8) >> this.aClass66_Sub1_2.anInt8437;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass66_Sub1_2.anInt8440 >> 8) >> this.aClass66_Sub1_2.anInt8437;
			this.aClass269_1.method5919(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class4_Sub7_Sub3 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub7_Sub3 arg2) {
		if ((this.aByteArrayArray1[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9841 >> this.aClass66_Sub1_2.anInt8437;
		@Pc(24) Class4_Sub7_Sub3_Sub1 local24 = (Class4_Sub7_Sub3_Sub1) arg2;
		@Pc(40) Class4_Sub7_Sub3_Sub1 local40;
		if (local24 != null && local24.method2094(local21, local21)) {
			local40 = local24;
			local24.method2089();
		} else {
			local40 = new Class4_Sub7_Sub3_Sub1(this.aClass66_Sub1_2, local21, local21);
		}
		local40.method2095(local21, local21, 0, 0);
		this.method326(arg0, arg1, local40);
		return local40;
	}

	@OriginalMember(owner = "client!an", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9837;
		@Pc(13) int local13 = arg1 >> super.anInt9837;
		if (local8 < 0 || local13 < 0 || super.anInt9838 - 1 < local8 || super.anInt9839 - 1 < local13) {
			return 0;
		}
		@Pc(48) int local48 = arg0 & super.anInt9841 - 1;
		@Pc(55) int local55 = arg1 & super.anInt9841 - 1;
		@Pc(82) int local82 = local48 * this.anIntArrayArray14[local8 + 1][local13] + (super.anInt9841 - local48) * this.anIntArrayArray14[local8][local13] >> super.anInt9837;
		@Pc(114) int local114 = this.anIntArrayArray14[local8][local13 + 1] * (super.anInt9841 - local48) + local48 * this.anIntArrayArray14[local8 + 1][local13 + 1] >> super.anInt9837;
		return local82 * (super.anInt9841 - local55) + local55 * local114 >> super.anInt9837;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method327(arg3, arg1, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
	@Override
	public void method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([[ZIIIZII)V")
	private void method327(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(6) int arg4) {
		if (this.aClass4_Sub19Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg2 + arg2 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (Static559.anIntArray704.length < local18) {
			Static559.anIntArray704 = new int[local18];
		}
		@Pc(30) int local30 = arg4 - arg2;
		@Pc(32) int local32 = local30;
		if (local30 < 0) {
			local30 = 0;
		}
		@Pc(41) int local41 = arg1 - arg2;
		@Pc(43) int local43 = local41;
		if (local41 < 0) {
			local41 = 0;
		}
		@Pc(54) int local54 = arg2 + arg4;
		if (super.anInt9838 - 1 < local54) {
			local54 = super.anInt9838 - 1;
		}
		@Pc(74) int local74 = arg1 + arg2;
		Static152.anInt3363 = 0;
		if (local74 > super.anInt9839 - 1) {
			local74 = super.anInt9839 - 1;
		}
		for (@Pc(89) int local89 = local30; local89 <= local54; local89++) {
			@Pc(98) boolean[] local98 = arg0[local89 - local32];
			for (@Pc(100) int local100 = local41; local100 <= local74; local100++) {
				if (local98[local100 - local43]) {
					Static559.anIntArray704[Static152.anInt3363++] = local89 + super.anInt9838 * local100;
				}
			}
		}
		this.aClass66_Sub1_2.method6980();
		this.aClass66_Sub1_2.method6976();
		this.aClass66_Sub1_2.method6985((this.anInt295 & 0x7) != 0);
		this.aClass66_Sub1_2.method6899(false, -1, false);
		this.aClass66_Sub1_2.method6941(this.anInterface4_4, 0);
		for (@Pc(193) int local193 = 0; local193 < this.aClass4_Sub19Array1.length; local193++) {
			this.aClass4_Sub19Array1[local193].method2995(Static152.anInt3363, Static559.anIntArray704);
		}
		@Pc(218) Class134_Sub1 local218 = this.aClass66_Sub1_2.method6919();
		local218.GA(0, -1, 0);
		this.aClass66_Sub1_2.method6902();
		if (!this.aClass124_2.method3264()) {
			@Pc(238) int local238 = this.aClass66_Sub1_2.anInt8416;
			@Pc(242) int local242 = this.aClass66_Sub1_2.anInt8414;
			this.aClass66_Sub1_2.X(0, local242, this.aClass66_Sub1_2.anInt8439);
			this.aClass66_Sub1_2.method6985(false);
			this.aClass66_Sub1_2.method6864(false);
			this.aClass66_Sub1_2.method6984(128);
			this.aClass66_Sub1_2.method6899(false, -2, false);
			this.aClass66_Sub1_2.method6979(this.aClass66_Sub1_2.anInterface15_3);
			this.aClass66_Sub1_2.method6997(Static152.aClass240_1, Static174.aClass240_2);
			this.aClass66_Sub1_2.method6923(Static19.aClass120_1, 0);
			this.aClass66_Sub1_2.method6866(Static184.aClass120_3, 0);
			for (@Pc(302) Class4 local302 = this.aClass124_2.method3267(); local302 != null; local302 = this.aClass124_2.method3273()) {
				@Pc(307) Class4_Sub3 local307 = (Class4_Sub3) local302;
				local307.method268(arg1, arg2, arg0, arg4);
			}
			this.aClass66_Sub1_2.method6923(Static22.aClass120_2, 0);
			this.aClass66_Sub1_2.method6866(Static22.aClass120_2, 0);
			this.aClass66_Sub1_2.method6979(null);
			this.aClass66_Sub1_2.X(local238, local242, this.aClass66_Sub1_2.anInt8439);
		}
		if (this.aClass269_1 != null) {
			this.aClass66_Sub1_2.method6941(this.anInterface4_4, 0);
			this.aClass66_Sub1_2.method6941(this.anInterface4_5, 1);
			this.aClass66_Sub1_2.method6890(this.aClass321_2);
			this.aClass269_1.method5925(arg2, arg0, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method8043(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass269_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass66_Sub1_2.anInt8420 >> 8) >> this.aClass66_Sub1_2.anInt8437;
			@Pc(39) int local39 = arg3 - (this.aClass66_Sub1_2.anInt8440 * arg2 >> 8) >> this.aClass66_Sub1_2.anInt8437;
			return this.aClass269_1.method5920(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8039(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt310 <= 0) {
			return;
		}
		@Pc(16) Interface8 local16 = this.aClass66_Sub1_2.method6883(this.anInt292);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method7149();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass66_Sub1_2.method6978(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.b()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = local45 * super.anInt9838 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray3[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local22 < local87) {
											local22 = local87;
										}
										if (local20 > local87) {
											local20 = local87;
										}
										local18++;
										local41.c(local87);
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = super.anInt9838 * local45 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray3[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local41.e(local87);
										if (local87 < local20) {
											local20 = local87;
										}
										local18++;
										if (local87 > local22) {
											local22 = local87;
										}
									}
								}
							}
							local54++;
						}
					}
				}
				local41.c();
				if (local16.method7150()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass66_Sub1_2.method6935();
		this.aClass66_Sub1_2.method6862(false);
		this.aClass66_Sub1_2.method6985(false);
		this.aClass66_Sub1_2.method6946(false);
		this.aClass66_Sub1_2.method6864(false);
		this.aClass66_Sub1_2.method6984(0);
		this.aClass66_Sub1_2.method6899(false, -2, false);
		this.aClass66_Sub1_2.method6979(null);
		@Pc(253) Class134_Sub1 local253 = this.aClass66_Sub1_2.method6919();
		@Pc(258) float[] local258 = this.aClass66_Sub1_2.method6911();
		local258[6] = 0.0F;
		local258[8] = 0.0F;
		local258[10] = 1.0F / (this.aFloat2 - this.aFloat3);
		local258[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass66_Sub1_2.anInt8336;
		local258[15] = 1.0F;
		local258[5] = (float) 1024 / ((float) super.anInt9841 * 128.0F * (float) this.aClass66_Sub1_2.anInt8336);
		local258[11] = 0.0F;
		local258[4] = 0.0F;
		local258[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass66_Sub1_2.anInt8277;
		local258[7] = 0.0F;
		local258[1] = 0.0F;
		local258[14] = -this.aFloat3 / (this.aFloat2 - this.aFloat3);
		local258[0] = (float) 1024 / ((float) this.aClass66_Sub1_2.anInt8277 * 128.0F * (float) super.anInt9841);
		local258[2] = 0.0F;
		local258[3] = 0.0F;
		local258[9] = 0.0F;
		local253.method3411(0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F);
		this.aClass66_Sub1_2.method6861();
		this.aClass66_Sub1_2.method6902();
		if ((this.anInt295 & 0x7) == 0) {
			this.aClass66_Sub1_2.method6985(false);
		} else {
			this.aClass66_Sub1_2.method6985(true);
			this.aClass66_Sub1_2.method6961();
		}
		this.aClass66_Sub1_2.method6972(false);
		this.aClass66_Sub1_2.method6941(this.anInterface4_4, 0);
		this.aClass66_Sub1_2.method6941(this.anInterface4_5, 1);
		this.aClass66_Sub1_2.method6890(this.aClass321_2);
		this.aClass66_Sub1_2.method6917(local20, Static453.aClass247_5, local16, 0, local22 + 1 - local20, local18 / 3);
		this.aClass66_Sub1_2.method6972(true);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!pv;[I)V")
	@Override
	public void method8042(@OriginalArg(0) Class4_Sub32 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass124_2.method3275(new Class4_Sub3(this.aClass66_Sub1_2, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!an", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt310 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt9838 + 1][super.anInt9839 + 1];
			for (@Pc(20) int local20 = 1; super.anInt9838 > local20; local20++) {
				for (@Pc(24) int local24 = 1; local24 < super.anInt9839; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray2[local20][local24] >> 1) + (this.aByteArrayArray2[local20][local24 - 1] >> 2) + (this.aByteArrayArray2[local20 + -1][local24] >> 2) + (this.aByteArrayArray2[local20 + 1][local24] >> 3) + (this.aByteArrayArray2[local20][local24 + 1] >> 3));
				}
			}
			@Pc(100) Class4_Sub19[] local100 = new Class4_Sub19[this.aClass183_2.method4291()];
			this.aClass183_2.method4284(local100);
			for (@Pc(108) int local108 = 0; local108 < local100.length; local108++) {
				local100[local108].method2991(this.anInt310);
			}
			@Pc(124) int local124 = 20;
			if (this.anIntArrayArrayArray6 != null) {
				local124 += 4;
			}
			if ((this.anInt295 & 0x7) != 0) {
				local124 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass66_Sub1_2.aNativeHeap5.a(this.anInt310 * 4, false);
			@Pc(157) NativeHeapBuffer local157 = this.aClass66_Sub1_2.aNativeHeap5.a(this.anInt310 * local124, false);
			@Pc(162) Stream local162 = new Stream(local157);
			@Pc(167) Stream local167 = new Stream(local147);
			@Pc(171) Class4_Sub19[] local171 = new Class4_Sub19[this.anInt310];
			@Pc(178) int local178 = Static337.method5028(this.anInt310 / 4);
			if (local178 < 1) {
				local178 = 1;
			}
			@Pc(188) Class183 local188 = new Class183(local178);
			@Pc(192) Class4_Sub19[] local192 = new Class4_Sub19[this.anInt309];
			@Pc(198) int local198;
			for (@Pc(194) int local194 = 0; super.anInt9838 > local194; local194++) {
				for (local198 = 0; super.anInt9839 > local198; local198++) {
					if (this.anIntArrayArrayArray3[local194][local198] != null) {
						@Pc(214) Class4_Sub19[] local214 = this.aClass4_Sub19ArrayArrayArray1[local194][local198];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray8[local194][local198];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray4[local194][local198];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray7[local194][local198];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray3[local194][local198];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local194][local198];
						@Pc(266) int[] local266 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local194][local198];
						if (local235 == null) {
							local235 = local242;
						}
						@Pc(277) float local277 = this.aFloatArrayArray5[local194][local198];
						@Pc(284) float local284 = this.aFloatArrayArray6[local194][local198];
						@Pc(291) float local291 = this.aFloatArrayArray4[local194][local198];
						@Pc(300) float local300 = this.aFloatArrayArray5[local194][local198 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray6[local194][local198 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray4[local194][local198 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray5[local194 + 1][local198 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray6[local194 + 1][local198 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray4[local194 + 1][local198 + 1];
						@Pc(360) float local360 = this.aFloatArrayArray5[local194 + 1][local198];
						@Pc(369) float local369 = this.aFloatArrayArray6[local194 + 1][local198];
						@Pc(378) float local378 = this.aFloatArrayArray4[local194 + 1][local198];
						@Pc(386) int local386 = local18[local194][local198] & 0xFF;
						@Pc(396) int local396 = local18[local194][local198 + 1] & 0xFF;
						@Pc(408) int local408 = local18[local194 + 1][local198 + 1] & 0xFF;
						@Pc(418) int local418 = local18[local194 + 1][local198] & 0xFF;
						@Pc(420) int local420 = 0;
						@Pc(430) int local430;
						label355: for (@Pc(422) int local422 = 0; local422 < local242.length; local422++) {
							@Pc(428) Class4_Sub19 local428 = local214[local422];
							for (local430 = 0; local430 < local420; local430++) {
								if (local428 == local192[local430]) {
									continue label355;
								}
							}
							local192[local420++] = local428;
						}
						@Pc(468) short[] local468 = this.aShortArrayArray3[super.anInt9838 * local198 + local194] = new short[local242.length];
						for (local430 = 0; local430 < local242.length; local430++) {
							@Pc(481) int local481 = (local194 << super.anInt9837) + local221[local430];
							@Pc(490) int local490 = (local198 << super.anInt9837) + local228[local430];
							@Pc(495) int local495 = local481 >> this.anInt291;
							@Pc(500) int local500 = local490 >> this.anInt291;
							@Pc(504) int local504 = local242[local430];
							@Pc(508) int local508 = local235[local430];
							@Pc(516) int local516 = local254 == null ? 0 : local254[local430];
							@Pc(534) long local534 = (long) local500 | (long) (local495 << 16) | (long) local508 << 48 | (long) local504 << 32;
							@Pc(538) int local538 = local221[local430];
							@Pc(542) int local542 = local228[local430];
							@Pc(544) byte local544 = 74;
							@Pc(546) int local546 = 0;
							@Pc(670) float local670;
							@Pc(661) float local661;
							@Pc(679) float local679;
							@Pc(619) float local619;
							@Pc(718) int local718;
							if (local538 == 0 && local542 == 0) {
								local661 = local284;
								local670 = local277;
								local718 = local544 - local386;
								local679 = local291;
							} else if (local538 == 0 && local542 == super.anInt9841) {
								local670 = local300;
								local661 = local309;
								local679 = local318;
								local718 = local544 - local396;
							} else if (super.anInt9841 == local538 && super.anInt9841 == local542) {
								local670 = local329;
								local661 = local340;
								local679 = local351;
								local718 = local544 - local408;
							} else if (local538 == super.anInt9841 && local542 == 0) {
								local679 = local378;
								local661 = local369;
								local718 = local544 - local418;
								local670 = local360;
							} else {
								@Pc(594) float local594 = (float) local538 / (float) super.anInt9841;
								@Pc(601) float local601 = (float) local542 / (float) super.anInt9841;
								@Pc(610) float local610 = local594 * (local360 - local277) + local277;
								local619 = local284 + local594 * (local369 - local284);
								@Pc(627) float local627 = local291 + local594 * (local378 - local291);
								@Pc(635) float local635 = local594 * (local329 - local300) + local300;
								@Pc(643) float local643 = local309 + local594 * (local340 - local309);
								@Pc(652) float local652 = local318 + (local351 - local318) * local594;
								local661 = local601 * (local643 - local619) + local619;
								local670 = local601 * (local635 - local610) + local610;
								local679 = (local652 - local627) * local601 + local627;
								@Pc(691) int local691 = (local538 * (local418 - local386) >> super.anInt9837) + local386;
								@Pc(703) int local703 = local396 + ((local408 - local396) * local538 >> super.anInt9837);
								local718 = local544 - local691 - (local542 * (local703 - local691) >> super.anInt9837);
							}
							@Pc(768) float local768 = 1.0F;
							if (local504 != -1) {
								@Pc(779) int local779 = (local504 & 0x7F) * local718 >> 7;
								if (local779 < 2) {
									local779 = 2;
								} else if (local779 > 126) {
									local779 = 126;
								}
								local546 = Static170.anIntArray696[local504 & 0xFF80 | local779];
								if ((this.anInt295 & 0x7) == 0) {
									local768 = this.aClass66_Sub1_2.aFloatArray58[1] * local661 + local670 * this.aClass66_Sub1_2.aFloatArray58[0] + this.aClass66_Sub1_2.aFloatArray58[2] * local679;
									local768 = this.aClass66_Sub1_2.aFloat168 + (local768 > 0.0F ? this.aClass66_Sub1_2.aFloat183 : this.aClass66_Sub1_2.bf) * local768;
								}
							}
							@Pc(852) Class4 local852 = null;
							if ((this.anInt305 - 1 & local481) == 0 && (this.anInt305 - 1 & local490) == 0) {
								local852 = local188.method4289(local534);
							}
							@Pc(1192) int local1192;
							@Pc(915) int local915;
							if (local852 == null) {
								if (local508 == local504) {
									local915 = local546;
								} else {
									@Pc(891) int local891 = local718 * (local508 & 0x7F) >> 7;
									if (local891 < 2) {
										local891 = 2;
									} else if (local891 > 126) {
										local891 = 126;
									}
									local915 = Static170.anIntArray696[local891 | local508 & 0xFF80];
									if ((this.anInt295 & 0x7) == 0) {
										@Pc(943) float local943 = this.aClass66_Sub1_2.aFloatArray58[0] * local670 + this.aClass66_Sub1_2.aFloatArray58[1] * local661 + this.aClass66_Sub1_2.aFloatArray58[2] * local679;
										local619 = (local768 > 0.0F ? this.aClass66_Sub1_2.aFloat183 : this.aClass66_Sub1_2.bf) * local768 + this.aClass66_Sub1_2.aFloat168;
										@Pc(968) int local968 = local915 >> 16 & 0xFF;
										@Pc(974) int local974 = local915 >> 8 & 0xFF;
										local968 = (int) ((float) local968 * local619);
										@Pc(984) int local984 = local915 & 0xFF;
										local974 = (int) ((float) local974 * local619);
										if (local968 < 0) {
											local968 = 0;
										} else if (local968 > 255) {
											local968 = 255;
										}
										if (local974 < 0) {
											local974 = 0;
										} else if (local974 > 255) {
											local974 = 255;
										}
										local984 = (int) ((float) local984 * local619);
										if (local984 < 0) {
											local984 = 0;
										} else if (local984 > 255) {
											local984 = 255;
										}
										local915 = local974 << 8 | local968 << 16 | local984;
									}
								}
								if (Stream.b()) {
									local162.b((float) local481);
									local162.b((float) (this.sa(local481, local490) + local516));
									local162.b((float) local490);
									local162.b((float) local481);
									local162.b((float) local490);
									if (this.anIntArrayArrayArray6 != null) {
										local162.b((float) (local266 == null ? 0 : local266[local430] - 1));
									}
									if ((this.anInt295 & 0x7) != 0) {
										local162.b(local670);
										local162.b(local661);
										local162.b(local679);
									}
								} else {
									local162.a((float) local481);
									local162.a((float) (local516 + this.sa(local481, local490)));
									local162.a((float) local490);
									local162.a((float) local481);
									local162.a((float) local490);
									if (this.anIntArrayArrayArray6 != null) {
										local162.a((float) (local266 == null ? 0 : local266[local430] - 1));
									}
									if ((this.anInt295 & 0x7) != 0) {
										local162.a(local670);
										local162.a(local661);
										local162.a(local679);
									}
								}
								if (this.aClass66_Sub1_2.anInt8418 == 0) {
									local167.a(local915 | 0xFF000000);
								} else {
									local167.b(local915 | 0xFF000000);
								}
								local1192 = this.anInt299++;
								local468[local430] = (short) local1192;
								if (local504 != -1) {
									local171[local1192] = local214[local430];
								}
								local188.method4282(local534, new Class4_Sub52(local468[local430]));
							} else {
								local468[local430] = ((Class4_Sub52) local852).aShort126;
								local1192 = local468[local430] & 0xFFFF;
								if (local504 != -1 && local214[local430].aLong307 < local171[local1192].aLong307) {
									local171[local1192] = local214[local430];
								}
							}
							for (local915 = 0; local915 < local420; local915++) {
								local192[local915].method2993(local768, local546, local1192, local718);
							}
							this.anInt292++;
						}
					}
				}
			}
			for (local198 = 0; local198 < this.anInt299; local198++) {
				@Pc(1309) Class4_Sub19 local1309 = local171[local198];
				if (local1309 != null) {
					local1309.method2997(local198);
				}
			}
			@Pc(1326) int local1326;
			@Pc(1344) int local1344;
			for (@Pc(1322) int local1322 = 0; local1322 < super.anInt9838; local1322++) {
				for (local1326 = 0; local1326 < super.anInt9839; local1326++) {
					@Pc(1338) short[] local1338 = this.aShortArrayArray3[local1322 + local1326 * super.anInt9838];
					if (local1338 != null) {
						@Pc(1342) int local1342 = 0;
						local1344 = 0;
						while (local1338.length > local1344) {
							@Pc(1353) int local1353 = local1338[local1344++] & 0xFFFF;
							@Pc(1360) int local1360 = local1338[local1344++] & 0xFFFF;
							@Pc(1367) int local1367 = local1338[local1344++] & 0xFFFF;
							@Pc(1371) Class4_Sub19 local1371 = local171[local1353];
							@Pc(1375) Class4_Sub19 local1375 = local171[local1360];
							@Pc(1379) Class4_Sub19 local1379 = local171[local1367];
							@Pc(1381) Class4_Sub19 local1381 = null;
							if (local1371 != null) {
								local1381 = local1371;
								local1371.method2992(local1322, local1326, local1342);
							}
							if (local1375 != null) {
								local1375.method2992(local1322, local1326, local1342);
								if (local1381 == null || local1375.aLong307 < local1381.aLong307) {
									local1381 = local1375;
								}
							}
							if (local1379 != null) {
								local1379.method2992(local1322, local1326, local1342);
								if (local1381 == null || local1379.aLong307 < local1381.aLong307) {
									local1381 = local1379;
								}
							}
							if (local1381 != null) {
								if (local1371 != null) {
									local1381.method2997(local1353);
								}
								if (local1375 != null) {
									local1381.method2997(local1360);
								}
								if (local1379 != null) {
									local1381.method2997(local1367);
								}
								local1381.method2992(local1322, local1326, local1342);
							}
							local1342++;
						}
					}
				}
			}
			local162.c();
			local167.c();
			this.anInterface4_5 = this.aClass66_Sub1_2.method6931(false);
			this.anInterface4_5.method3561(4, this.anInt299 * 4, local147);
			this.anInterface4_4 = this.aClass66_Sub1_2.method6931(false);
			this.anInterface4_4.method3561(local124, local124 * this.anInt299, local157);
			if ((this.anInt295 & 0x7) == 0) {
				if (this.anIntArrayArrayArray6 == null) {
					this.aClass321_2 = this.aClass66_Sub1_2.method6903(new Class43[] { new Class43(new Class79[] { Static108.aClass79_1, Static108.aClass79_5 }), new Class43(Static108.aClass79_3) });
				} else {
					this.aClass321_2 = this.aClass66_Sub1_2.method6903(new Class43[] { new Class43(new Class79[] { Static108.aClass79_1, Static108.aClass79_5, Static108.aClass79_4 }), new Class43(Static108.aClass79_3) });
				}
			} else if (this.anIntArrayArrayArray6 == null) {
				this.aClass321_2 = this.aClass66_Sub1_2.method6903(new Class43[] { new Class43(new Class79[] { Static108.aClass79_1, Static108.aClass79_5, Static108.aClass79_2 }), new Class43(Static108.aClass79_3) });
			} else {
				this.aClass321_2 = this.aClass66_Sub1_2.method6903(new Class43[] { new Class43(new Class79[] { Static108.aClass79_1, Static108.aClass79_5, Static108.aClass79_4, Static108.aClass79_2 }), new Class43(Static108.aClass79_3) });
			}
			local1326 = 0;
			for (@Pc(1681) int local1681 = 0; local1681 < local100.length; local1681++) {
				if (local100[local1681].anInt3261 > 0) {
					local100[local1326++] = local100[local1681];
				}
			}
			this.aClass4_Sub19Array1 = new Class4_Sub19[local1326];
			@Pc(1711) long[] local1711 = new long[local1326];
			for (local1344 = 0; local1344 < local1326; local1344++) {
				@Pc(1719) Class4_Sub19 local1719 = local100[local1344];
				local1711[local1344] = local1719.aLong307;
				this.aClass4_Sub19Array1[local1344] = local1719;
				local1719.method2999(this.anInt299);
			}
			Static366.method5525(this.aClass4_Sub19Array1, local1711);
			if (this.aClass269_1 != null) {
				this.aClass269_1.method5921();
			}
		} else {
			this.aClass269_1 = null;
		}
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray3 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray4 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass183_2 = null;
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray7 = null;
		this.aByteArrayArray2 = null;
		this.aClass4_Sub19ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!an", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass269_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass66_Sub1_2.anInt8420 * arg2 >> 8) >> this.aClass66_Sub1_2.anInt8437;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass66_Sub1_2.anInt8440 >> 8) >> this.aClass66_Sub1_2.anInt8437;
			this.aClass269_1.method5924(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!an", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray2[arg0][arg1] = (byte) arg2;
		}
	}
}
