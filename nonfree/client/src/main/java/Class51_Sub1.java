import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
	private int anInt1746;

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
	private int anInt1766;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "Lclient!fg;")
	private Interface11 anInterface11_9;

	@OriginalMember(owner = "client!cj", name = "bb", descriptor = "Lclient!eu;")
	public Class46 aClass46_16;

	@OriginalMember(owner = "client!cj", name = "cb", descriptor = "[Lclient!mv;")
	private Class3_Sub38[] aClass3_Sub38Array1;

	@OriginalMember(owner = "client!cj", name = "fb", descriptor = "I")
	private int anInt1768;

	@OriginalMember(owner = "client!cj", name = "gb", descriptor = "I")
	private int anInt1769;

	@OriginalMember(owner = "client!cj", name = "ib", descriptor = "Lclient!fg;")
	private Interface11 anInterface11_10;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "F")
	private float aFloat63 = -3.4028235E38F;

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "F")
	private float aFloat64 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "Lclient!mr;")
	private final Class223 aClass223_10 = new Class223();

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
	private final int anInt1765 = this.anInt9117 - 2;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Lclient!ch;")
	public final Class5_Sub1 aClass5_Sub1_5;

	@OriginalMember(owner = "client!cj", name = "Y", descriptor = "[[[Lclient!mv;")
	private Class3_Sub38[][][] aClass3_Sub38ArrayArrayArray1;

	@OriginalMember(owner = "client!cj", name = "kb", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cj", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
	private final int anInt1754;

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!cj", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
	public final int anInt1753;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!cj", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "[[B")
	private final byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!cj", name = "hb", descriptor = "Lclient!qp;")
	private Class280 aClass280_5;

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "Lclient!lba;")
	private Class199 aClass199_1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!ch;IIII[[I[[II)V")
	public Class51_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass5_Sub1_5 = arg0;
		this.aClass3_Sub38ArrayArrayArray1 = new Class3_Sub38[arg3][arg4][];
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray2 = new float[super.anInt9121 + 1][super.anInt9115 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anInt1754 = 0x1 << this.anInt1765;
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt9121 + 1][super.anInt9115 + 1];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anInt1753 = arg2;
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.aFloatArrayArray1 = new float[super.anInt9121 + 1][super.anInt9115 + 1];
		this.aByteArrayArray2 = new byte[arg3][arg4];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt9115; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9121; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray57[local125][local121];
				if ((float) local134 > this.aFloat63) {
					this.aFloat63 = local134;
				}
				if (this.aFloat64 > (float) local134) {
					this.aFloat64 = local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt9121 && super.anInt9115 > local121) {
					@Pc(190) int local190 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(207) int local207 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(227) float local227 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local190 * local190 + local207 * local207)));
					this.aFloatArrayArray2[local125][local121] = (float) local190 * local227;
					this.aFloatArrayArray1[local125][local121] = local227 * (float) (-arg7 * 2);
					this.aFloatArrayArray3[local125][local121] = local227 * (float) local207;
				}
			}
		}
		this.aFloat64--;
		this.aFloat63++;
		this.aClass280_5 = new Class280(128);
		if ((this.anInt1753 & 0x10) != 0) {
			this.aClass199_1 = new Class199(this.aClass5_Sub1_5, this);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7831(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass199_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass5_Sub1_5.anInt6547 * arg2 >> 8) >> this.aClass5_Sub1_5.anInt6526;
			@Pc(40) int local40 = arg3 - (this.aClass5_Sub1_5.anInt6511 * arg2 >> 8) >> this.aClass5_Sub1_5.anInt6526;
			return this.aClass199_1.method5144(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!cj", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass199_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass5_Sub1_5.anInt6547 * arg2 >> 8) >> this.aClass5_Sub1_5.anInt6526;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass5_Sub1_5.anInt6511 >> 8) >> this.aClass5_Sub1_5.anInt6526;
			this.aClass199_1.method5136(arg0, local38, local23);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	@Override
	public void method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1755(arg0, arg1, arg4, arg2, arg3, arg5, arg6);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!cj", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray3[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray3[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILclient!hm;)V")
	private void method1753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub4_Sub5_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray1[arg0][arg1];
		@Pc(23) int[] local23 = this.anIntArrayArrayArray5[arg0][arg1];
		@Pc(26) int local26 = local12.length;
		if (local26 > Static38.anIntArray32.length) {
			Static1.anIntArray626 = new int[local26];
			Static38.anIntArray32 = new int[local26];
		}
		for (@Pc(42) int local42 = 0; local42 < local26; local42++) {
			Static38.anIntArray32[local42] = local12[local42] >> this.aClass5_Sub1_5.anInt6526;
			Static1.anIntArray626[local42] = local23[local42] >> this.aClass5_Sub1_5.anInt6526;
		}
		@Pc(70) int local70 = 0;
		while (local26 > local70) {
			@Pc(76) int local76 = Static38.anIntArray32[local70];
			@Pc(81) int local81 = Static1.anIntArray626[local70++];
			@Pc(85) int local85 = Static38.anIntArray32[local70];
			@Pc(90) int local90 = Static1.anIntArray626[local70++];
			@Pc(94) int local94 = Static38.anIntArray32[local70];
			@Pc(99) int local99 = Static1.anIntArray626[local70++];
			if ((local90 - local99) * (local76 - local85) - (local90 - local81) * (local94 - local85) > 0) {
				arg2.method3678(local76, local85, local81, local90, local99, local94);
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub4_Sub5 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub5 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9118 >> this.aClass5_Sub1_5.anInt6526;
		@Pc(27) Class3_Sub4_Sub5_Sub2 local27 = (Class3_Sub4_Sub5_Sub2) arg2;
		@Pc(37) Class3_Sub4_Sub5_Sub2 local37;
		if (local27 != null && local27.method3676(local24, local24)) {
			local37 = local27;
			local27.method3675();
		} else {
			local37 = new Class3_Sub4_Sub5_Sub2(this.aClass5_Sub1_5, local24, local24);
		}
		local37.method3679(local24, 0, local24, 0);
		this.method1753(arg0, arg1, local37);
		return local37;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZI[[ZIII)V")
	private void method1755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub38Array1 == null) {
			return;
		}
		@Pc(24) int local24 = arg3 + arg3 + 1;
		@Pc(28) int local28 = local24 * local24;
		if (Static307.anIntArray297.length < local28) {
			Static307.anIntArray297 = new int[local28];
		}
		@Pc(40) int local40 = arg0 - arg3;
		@Pc(42) int local42 = local40;
		if (local40 < 0) {
			local40 = 0;
		}
		@Pc(51) int local51 = arg1 - arg3;
		@Pc(53) int local53 = local51;
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(65) int local65 = arg0 + arg3;
		if (super.anInt9121 - 1 < local65) {
			local65 = super.anInt9121 - 1;
		}
		@Pc(80) int local80 = arg3 + arg1;
		if (super.anInt9115 - 1 < local80) {
			local80 = super.anInt9115 - 1;
		}
		Static361.anInt6872 = 0;
		for (@Pc(95) int local95 = local40; local95 <= local65; local95++) {
			@Pc(104) boolean[] local104 = arg4[local95 - local42];
			for (@Pc(106) int local106 = local51; local106 <= local80; local106++) {
				if (local104[local106 - local53]) {
					Static307.anIntArray297[Static361.anInt6872++] = super.anInt9121 * local106 + local95;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass5_Sub1_5.method5597();
		} else {
			this.aClass5_Sub1_5.method5638((float) arg5);
			this.aClass5_Sub1_5.method5593();
		}
		this.aClass5_Sub1_5.method5625();
		this.aClass5_Sub1_5.method5630((this.anInt1753 & 0x7) != 0);
		this.aClass5_Sub1_5.method5579(false, false, -1);
		this.aClass5_Sub1_5.method5692(this.anInterface11_10, 0);
		for (@Pc(197) int local197 = 0; local197 < this.aClass3_Sub38Array1.length; local197++) {
			this.aClass3_Sub38Array1[local197].method5902(Static307.anIntArray297, Static361.anInt6872);
		}
		@Pc(222) Class39_Sub1 local222 = this.aClass5_Sub1_5.method5658();
		local222.method7240(0, -1, 0);
		this.aClass5_Sub1_5.method5680();
		if (!this.aClass223_10.method5864()) {
			@Pc(240) int local240 = this.aClass5_Sub1_5.anInt6521;
			@Pc(244) int local244 = this.aClass5_Sub1_5.anInt6539;
			this.aClass5_Sub1_5.L(0, local244, this.aClass5_Sub1_5.anInt6531);
			this.aClass5_Sub1_5.method5630(false);
			this.aClass5_Sub1_5.method5636(false);
			this.aClass5_Sub1_5.method5666(128);
			this.aClass5_Sub1_5.method5579(false, false, -2);
			this.aClass5_Sub1_5.method5609(this.aClass5_Sub1_5.anInterface10_3);
			this.aClass5_Sub1_5.method5682(Static314.aClass374_2, Static514.aClass374_5);
			this.aClass5_Sub1_5.method5583(Static161.aClass9_3, 0);
			this.aClass5_Sub1_5.method5592(Static578.aClass9_5, 0);
			for (@Pc(304) Class3 local304 = this.aClass223_10.method5874(); local304 != null; local304 = this.aClass223_10.method5870()) {
				@Pc(309) Class3_Sub13 local309 = (Class3_Sub13) local304;
				local309.method2128(arg0, arg1, arg3, arg4);
			}
			this.aClass5_Sub1_5.method5583(Static333.aClass9_2, 0);
			this.aClass5_Sub1_5.method5592(Static333.aClass9_2, 0);
			this.aClass5_Sub1_5.method5609(null);
			this.aClass5_Sub1_5.L(local240, local244, this.aClass5_Sub1_5.anInt6531);
		}
		if (this.aClass199_1 == null) {
			return;
		}
		this.aClass5_Sub1_5.method5692(this.anInterface11_10, 0);
		this.aClass5_Sub1_5.method5692(this.anInterface11_9, 1);
		this.aClass5_Sub1_5.method5610(this.aClass46_16);
		this.aClass199_1.method5138(arg4, arg0, arg3, arg1, arg2);
		return;
	}

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt9121][super.anInt9115][];
		}
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt9121][super.anInt9115][];
		}
		@Pc(33) Interface7 local33 = this.aClass5_Sub1_5.anInterface7_15;
		this.anIntArrayArrayArray1[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray2[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub38[] local92 = this.aClass3_Sub38ArrayArrayArray1[arg0][arg1] = new Class3_Sub38[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt1753 & 0x20) != 0 && local100 != -1 && local33.method8118(local100).aBoolean365) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(149) long local149 = (long) local100 | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (local104 << 14);
			@Pc(155) Class3 local155;
			for (local155 = this.aClass280_5.method7107(local149); local155 != null; local155 = this.aClass280_5.method7105()) {
				@Pc(160) Class3_Sub38 local160 = (Class3_Sub38) local155;
				if (local100 == local160.anInt6870 && (float) local104 == local160.aFloat159 && arg10 == local160.anInt6874 && arg11 == local160.anInt6869 && local160.anInt6881 == arg12) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class3_Sub38(this, local100, local104, arg10, arg11, arg12);
				this.aClass280_5.method7109(local92[local94], local149);
			} else {
				local92[local94] = (Class3_Sub38) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray2[arg0][arg1] = (byte) (this.aByteArrayArray2[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt1768) {
			this.anInt1768 = arg6.length;
		}
		this.anInt1769 += arg6.length;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1755(arg0, arg1, arg4, arg2, arg3, -1, arg5);
	}

	@OriginalMember(owner = "client!cj", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt1769 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt9121 + 1][super.anInt9115 + 1];
			for (@Pc(20) int local20 = 1; super.anInt9121 > local20; local20++) {
				for (@Pc(24) int local24 = 1; local24 < super.anInt9115; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray3[local20][local24] >> 1) + (this.aByteArrayArray3[local20][local24 + 1] >> 3) + (this.aByteArrayArray3[local20 - 1][local24] >> 2) + (this.aByteArrayArray3[local20 + 1][local24] >> 3) + (this.aByteArrayArray3[local20][local24 + -1] >> 2));
				}
			}
			@Pc(108) Class3_Sub38[] local108 = new Class3_Sub38[this.aClass280_5.method7106()];
			this.aClass280_5.method7104(local108);
			for (@Pc(116) int local116 = 0; local116 < local108.length; local116++) {
				local108[local116].method5904(this.anInt1769);
			}
			@Pc(136) int local136 = 20;
			if (this.anIntArrayArrayArray6 != null) {
				local136 += 4;
			}
			if ((this.anInt1753 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass5_Sub1_5.aNativeHeap5.a(this.anInt1769 * 4, false);
			@Pc(166) NativeHeapBuffer local166 = this.aClass5_Sub1_5.aNativeHeap5.a(local136 * this.anInt1769, false);
			@Pc(171) Stream local171 = new Stream(local166);
			@Pc(176) Stream local176 = new Stream(local156);
			@Pc(180) Class3_Sub38[] local180 = new Class3_Sub38[this.anInt1769];
			@Pc(187) int local187 = Static274.method4478(this.anInt1769 / 4);
			if (local187 < 1) {
				local187 = 1;
			}
			@Pc(197) Class280 local197 = new Class280(local187);
			@Pc(201) Class3_Sub38[] local201 = new Class3_Sub38[this.anInt1768];
			@Pc(207) int local207;
			for (@Pc(203) int local203 = 0; super.anInt9121 > local203; local203++) {
				for (local207 = 0; local207 < super.anInt9115; local207++) {
					if (this.anIntArrayArrayArray2[local203][local207] != null) {
						@Pc(223) Class3_Sub38[] local223 = this.aClass3_Sub38ArrayArrayArray1[local203][local207];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray1[local203][local207];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray5[local203][local207];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray3[local203][local207];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray2[local203][local207];
						@Pc(263) int[] local263 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local203][local207];
						@Pc(275) int[] local275 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local203][local207];
						if (local244 == null) {
							local244 = local251;
						}
						@Pc(286) float local286 = this.aFloatArrayArray2[local203][local207];
						@Pc(293) float local293 = this.aFloatArrayArray1[local203][local207];
						@Pc(300) float local300 = this.aFloatArrayArray3[local203][local207];
						@Pc(309) float local309 = this.aFloatArrayArray2[local203][local207 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray1[local203][local207 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray3[local203][local207 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray2[local203 + 1][local207 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray1[local203 + 1][local207 + 1];
						@Pc(360) float local360 = this.aFloatArrayArray3[local203 + 1][local207 + 1];
						@Pc(369) float local369 = this.aFloatArrayArray2[local203 + 1][local207];
						@Pc(378) float local378 = this.aFloatArrayArray1[local203 + 1][local207];
						@Pc(387) float local387 = this.aFloatArrayArray3[local203 + 1][local207];
						@Pc(395) int local395 = local18[local203][local207] & 0xFF;
						@Pc(405) int local405 = local18[local203][local207 + 1] & 0xFF;
						@Pc(417) int local417 = local18[local203 + 1][local207 + 1] & 0xFF;
						@Pc(427) int local427 = local18[local203 + 1][local207] & 0xFF;
						@Pc(429) int local429 = 0;
						@Pc(439) int local439;
						label357: for (@Pc(431) int local431 = 0; local431 < local251.length; local431++) {
							@Pc(437) Class3_Sub38 local437 = local223[local431];
							for (local439 = 0; local439 < local429; local439++) {
								if (local201[local439] == local437) {
									continue label357;
								}
							}
							local201[local429++] = local437;
						}
						@Pc(485) short[] local485 = this.aShortArrayArray1[local207 * super.anInt9121 + local203] = new short[local251.length];
						for (local439 = 0; local439 < local251.length; local439++) {
							@Pc(498) int local498 = (local203 << super.anInt9117) + local230[local439];
							@Pc(508) int local508 = (local207 << super.anInt9117) + local237[local439];
							@Pc(513) int local513 = local498 >> this.anInt1765;
							@Pc(518) int local518 = local508 >> this.anInt1765;
							@Pc(522) int local522 = local251[local439];
							@Pc(526) int local526 = local244[local439];
							@Pc(534) int local534 = local263 == null ? 0 : local263[local439];
							@Pc(552) long local552 = (long) local518 | (long) (local513 << 16) | (long) local526 << 48 | (long) local522 << 32;
							@Pc(556) int local556 = local230[local439];
							@Pc(560) int local560 = local237[local439];
							@Pc(562) byte local562 = 74;
							@Pc(564) int local564 = 0;
							@Pc(566) float local566 = 1.0F;
							@Pc(586) float local586;
							@Pc(578) float local578;
							@Pc(580) float local580;
							@Pc(662) float local662;
							@Pc(584) int local584;
							if (local556 == 0 && local560 == 0) {
								local578 = local293;
								local580 = local300;
								local584 = local562 - local395;
								local586 = local286;
							} else if (local556 == 0 && super.anInt9118 == local560) {
								local584 = local562 - local405;
								local580 = local327;
								local586 = local309;
								local578 = local318;
							} else if (local556 == super.anInt9118 && super.anInt9118 == local560) {
								local586 = local338;
								local580 = local360;
								local578 = local349;
								local584 = local562 - local417;
							} else if (super.anInt9118 == local556 && local560 == 0) {
								local578 = local378;
								local586 = local369;
								local580 = local387;
								local584 = local562 - local427;
							} else {
								@Pc(639) float local639 = (float) local556 / (float) super.anInt9118;
								@Pc(646) float local646 = (float) local560 / (float) super.anInt9118;
								@Pc(654) float local654 = local639 * (local369 - local286) + local286;
								local662 = (local378 - local293) * local639 + local293;
								@Pc(670) float local670 = local300 + local639 * (local387 - local300);
								@Pc(679) float local679 = local309 + local639 * (local338 - local309);
								@Pc(688) float local688 = (local349 - local318) * local639 + local318;
								local586 = local654 + (local679 - local654) * local646;
								local578 = (local688 - local662) * local646 + local662;
								@Pc(714) float local714 = local639 * (local360 - local327) + local327;
								local580 = local646 * (local714 - local670) + local670;
								@Pc(735) int local735 = local395 + ((local427 - local395) * local556 >> super.anInt9117);
								@Pc(748) int local748 = local405 + (local556 * (local417 - local405) >> super.anInt9117);
								local584 = local562 - local735 - (local560 * (local748 - local735) >> super.anInt9117);
							}
							if (local522 != -1) {
								@Pc(798) int local798 = (local522 & 0x7F) * local584 >> 7;
								if (local798 < 2) {
									local798 = 2;
								} else if (local798 > 126) {
									local798 = 126;
								}
								if ((this.anInt1753 & 0x7) == 0) {
									local566 = this.aClass5_Sub1_5.aFloatArray50[2] * local580 + this.aClass5_Sub1_5.aFloatArray50[0] * local586 + this.aClass5_Sub1_5.aFloatArray50[1] * local578;
									local566 = local566 * (local566 > 0.0F ? this.aClass5_Sub1_5.aFloat148 : this.aClass5_Sub1_5.aFloat147) + this.aClass5_Sub1_5.aFloat141;
								}
								local564 = Static159.anIntArray159[local798 | local522 & 0xFF80];
							}
							@Pc(874) Class3 local874 = null;
							if ((local498 & this.anInt1754 - 1) == 0 && (this.anInt1754 - 1 & local508) == 0) {
								local874 = local197.method7107(local552);
							}
							@Pc(910) int local910;
							@Pc(936) int local936;
							if (local874 == null) {
								if (local522 == local526) {
									local936 = local564;
								} else {
									@Pc(946) int local946 = (local526 & 0x7F) * local584 >> 7;
									if (local946 < 2) {
										local946 = 2;
									} else if (local946 > 126) {
										local946 = 126;
									}
									local936 = Static159.anIntArray159[local526 & 0xFF80 | local946];
									if ((this.anInt1753 & 0x7) == 0) {
										local662 = local578 * this.aClass5_Sub1_5.aFloatArray50[1] + this.aClass5_Sub1_5.aFloatArray50[0] * local586 + local580 * this.aClass5_Sub1_5.aFloatArray50[2];
										local662 = this.aClass5_Sub1_5.aFloat141 + local566 * (local566 > 0.0F ? this.aClass5_Sub1_5.aFloat148 : this.aClass5_Sub1_5.aFloat147);
										@Pc(1021) int local1021 = local936 >> 16 & 0xFF;
										@Pc(1027) int local1027 = local936 >> 8 & 0xFF;
										local1021 = (int) ((float) local1021 * local662);
										@Pc(1037) int local1037 = local936 & 0xFF;
										local1027 = (int) ((float) local1027 * local662);
										if (local1021 < 0) {
											local1021 = 0;
										} else if (local1021 > 255) {
											local1021 = 255;
										}
										local1037 = (int) ((float) local1037 * local662);
										if (local1027 < 0) {
											local1027 = 0;
										} else if (local1027 > 255) {
											local1027 = 255;
										}
										if (local1037 < 0) {
											local1037 = 0;
										} else if (local1037 > 255) {
											local1037 = 255;
										}
										local936 = local1037 | local1021 << 16 | local1027 << 8;
									}
								}
								if (Stream.a()) {
									local171.a((float) local498);
									local171.a((float) (this.method7839(local498, local508) + local534));
									local171.a((float) local508);
									local171.a((float) local498);
									local171.a((float) local508);
									if (this.anIntArrayArrayArray6 != null) {
										local171.a((float) (local275 == null ? 0 : local275[local439] - 1));
									}
									if ((this.anInt1753 & 0x7) != 0) {
										local171.a(local586);
										local171.a(local578);
										local171.a(local580);
									}
								} else {
									local171.b((float) local498);
									local171.b((float) (local534 + this.method7839(local498, local508)));
									local171.b((float) local508);
									local171.b((float) local498);
									local171.b((float) local508);
									if (this.anIntArrayArrayArray6 != null) {
										local171.b((float) (local275 == null ? 0 : local275[local439] - 1));
									}
									if ((this.anInt1753 & 0x7) != 0) {
										local171.b(local586);
										local171.b(local578);
										local171.b(local580);
									}
								}
								if (this.aClass5_Sub1_5.anInt6532 == 0) {
									local176.f(local936 | 0xFF000000);
								} else {
									local176.a(local936 | 0xFF000000);
								}
								local910 = this.anInt1746++;
								local485[local439] = (short) local910;
								if (local522 != -1) {
									local180[local910] = local223[local439];
								}
								local197.method7109(new Class3_Sub26(local485[local439]), local552);
							} else {
								local485[local439] = ((Class3_Sub26) local874).aShort45;
								local910 = local485[local439] & 0xFFFF;
								if (local522 != -1 && local180[local910].aLong276 > local223[local439].aLong276) {
									local180[local910] = local223[local439];
								}
							}
							for (local936 = 0; local936 < local429; local936++) {
								local201[local936].method5908(local584, local564, local910, local566);
							}
							this.anInt1766++;
						}
					}
				}
			}
			for (local207 = 0; local207 < this.anInt1746; local207++) {
				@Pc(1322) Class3_Sub38 local1322 = local180[local207];
				if (local1322 != null) {
					local1322.method5905(local207);
				}
			}
			@Pc(1339) int local1339;
			@Pc(1358) int local1358;
			for (@Pc(1335) int local1335 = 0; local1335 < super.anInt9121; local1335++) {
				for (local1339 = 0; local1339 < super.anInt9115; local1339++) {
					@Pc(1352) short[] local1352 = this.aShortArrayArray1[local1339 * super.anInt9121 + local1335];
					if (local1352 != null) {
						@Pc(1356) int local1356 = 0;
						local1358 = 0;
						while (local1358 < local1352.length) {
							@Pc(1367) int local1367 = local1352[local1358++] & 0xFFFF;
							@Pc(1374) int local1374 = local1352[local1358++] & 0xFFFF;
							@Pc(1381) int local1381 = local1352[local1358++] & 0xFFFF;
							@Pc(1385) Class3_Sub38 local1385 = local180[local1367];
							@Pc(1389) Class3_Sub38 local1389 = local180[local1374];
							@Pc(1393) Class3_Sub38 local1393 = local180[local1381];
							@Pc(1395) Class3_Sub38 local1395 = null;
							if (local1385 != null) {
								local1395 = local1385;
								local1385.method5909(local1335, local1356, local1339);
							}
							if (local1389 != null) {
								local1389.method5909(local1335, local1356, local1339);
								if (local1395 == null || local1395.aLong276 > local1389.aLong276) {
									local1395 = local1389;
								}
							}
							if (local1393 != null) {
								local1393.method5909(local1335, local1356, local1339);
								if (local1395 == null || local1395.aLong276 > local1393.aLong276) {
									local1395 = local1393;
								}
							}
							if (local1395 != null) {
								if (local1385 != null) {
									local1395.method5905(local1367);
								}
								if (local1389 != null) {
									local1395.method5905(local1374);
								}
								if (local1393 != null) {
									local1395.method5905(local1381);
								}
								local1395.method5909(local1335, local1356, local1339);
							}
							local1356++;
						}
					}
				}
			}
			local171.b();
			local176.b();
			this.anInterface11_9 = this.aClass5_Sub1_5.method5649(false);
			this.anInterface11_9.method6376(this.anInt1746 * 4, local156, 4);
			this.anInterface11_10 = this.aClass5_Sub1_5.method5649(false);
			this.anInterface11_10.method6376(this.anInt1746 * local136, local166, local136);
			if ((this.anInt1753 & 0x7) == 0) {
				if (this.anIntArrayArrayArray6 == null) {
					this.aClass46_16 = this.aClass5_Sub1_5.method5652(new Class93[] { new Class93(new Class131[] { Static196.aClass131_1, Static196.aClass131_5 }), new Class93(Static196.aClass131_3) });
				} else {
					this.aClass46_16 = this.aClass5_Sub1_5.method5652(new Class93[] { new Class93(new Class131[] { Static196.aClass131_1, Static196.aClass131_5, Static196.aClass131_4 }), new Class93(Static196.aClass131_3) });
				}
			} else if (this.anIntArrayArrayArray6 == null) {
				this.aClass46_16 = this.aClass5_Sub1_5.method5652(new Class93[] { new Class93(new Class131[] { Static196.aClass131_1, Static196.aClass131_5, Static196.aClass131_2 }), new Class93(Static196.aClass131_3) });
			} else {
				this.aClass46_16 = this.aClass5_Sub1_5.method5652(new Class93[] { new Class93(new Class131[] { Static196.aClass131_1, Static196.aClass131_5, Static196.aClass131_4, Static196.aClass131_2 }), new Class93(Static196.aClass131_3) });
			}
			local1339 = 0;
			for (@Pc(1702) int local1702 = 0; local1702 < local108.length; local1702++) {
				if (local108[local1702].anInt6878 > 0) {
					local108[local1339++] = local108[local1702];
				}
			}
			this.aClass3_Sub38Array1 = new Class3_Sub38[local1339];
			@Pc(1732) long[] local1732 = new long[local1339];
			for (local1358 = 0; local1358 < local1339; local1358++) {
				@Pc(1740) Class3_Sub38 local1740 = local108[local1358];
				local1732[local1358] = local1740.aLong276;
				this.aClass3_Sub38Array1[local1358] = local1740;
				local1740.method5903(this.anInt1746);
			}
			Static205.method3536(local1732, this.aClass3_Sub38Array1);
			if (this.aClass199_1 != null) {
				this.aClass199_1.method5139();
			}
		} else {
			this.aClass199_1 = null;
		}
		this.anIntArrayArrayArray1 = this.anIntArrayArrayArray5 = null;
		this.aClass3_Sub38ArrayArrayArray1 = null;
		this.aByteArrayArray3 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray3 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray1 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass280_5 = null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7840(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1769 <= 0) {
			return;
		}
		@Pc(19) Interface19 local19 = this.aClass5_Sub1_5.method5669(this.anInt1766);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7984();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass5_Sub1_5.method5647(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(77) short[] local77;
				@Pc(81) int local81;
				@Pc(89) int local89;
				if (Stream.a()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt9121;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray1[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										local44.e(local89);
										if (local89 > local25) {
											local25 = local89;
										}
										local21++;
										if (local89 < local23) {
											local23 = local89;
										}
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt9121;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray1[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										local21++;
										if (local89 > local25) {
											local25 = local89;
										}
										if (local23 > local89) {
											local23 = local89;
										}
										local44.d(local89);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.b();
				if (local19.method7985()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass5_Sub1_5.method5564();
		this.aClass5_Sub1_5.method5599(false);
		this.aClass5_Sub1_5.method5630(false);
		this.aClass5_Sub1_5.method5611(false);
		this.aClass5_Sub1_5.method5636(false);
		this.aClass5_Sub1_5.method5666(0);
		this.aClass5_Sub1_5.method5579(false, false, -2);
		this.aClass5_Sub1_5.method5609(null);
		@Pc(273) Class39_Sub1 local273 = this.aClass5_Sub1_5.method5658();
		@Pc(278) float[] local278 = this.aClass5_Sub1_5.method5603();
		local278[8] = 0.0F;
		local278[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass5_Sub1_5.anInt6469) - 1.0F;
		local278[11] = 0.0F;
		local278[9] = 0.0F;
		local278[2] = 0.0F;
		local278[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass5_Sub1_5.anInt6423;
		local278[3] = 0.0F;
		local278[1] = 0.0F;
		local278[7] = 0.0F;
		local278[4] = 0.0F;
		local278[15] = 1.0F;
		local278[5] = (float) 1024 / ((float) super.anInt9118 * 128.0F * (float) this.aClass5_Sub1_5.anInt6423);
		local278[6] = 0.0F;
		local278[14] = -this.aFloat64 / (this.aFloat63 - this.aFloat64);
		local278[10] = 1.0F / (this.aFloat63 - this.aFloat64);
		local278[0] = (float) 1024 / ((float) this.aClass5_Sub1_5.anInt6469 * (float) super.anInt9118 * 128.0F);
		local273.method1547(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
		this.aClass5_Sub1_5.method5580();
		this.aClass5_Sub1_5.method5680();
		if ((this.anInt1753 & 0x7) == 0) {
			this.aClass5_Sub1_5.method5630(false);
		} else {
			this.aClass5_Sub1_5.method5630(true);
			this.aClass5_Sub1_5.method5591();
		}
		this.aClass5_Sub1_5.method5590(false);
		this.aClass5_Sub1_5.method5692(this.anInterface11_10, 0);
		this.aClass5_Sub1_5.method5692(this.anInterface11_9, 1);
		this.aClass5_Sub1_5.method5610(this.aClass46_16);
		this.aClass5_Sub1_5.method5665(Static67.aClass292_2, local23, local25 + 1 - local23, local19, local21 / 3, 0);
		this.aClass5_Sub1_5.method5590(true);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!wh;[I)V")
	@Override
	public void method7834(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass223_10.method5868(new Class3_Sub13(this.aClass5_Sub1_5, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!cj", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass199_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass5_Sub1_5.anInt6547 >> 8) >> this.aClass5_Sub1_5.anInt6526;
			@Pc(38) int local38 = arg3 - (this.aClass5_Sub1_5.anInt6511 * arg2 >> 8) >> this.aClass5_Sub1_5.anInt6526;
			this.aClass199_1.method5137(local23, arg0, local38);
		}
	}
}
