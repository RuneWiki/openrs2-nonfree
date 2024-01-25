import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class109_Sub3 extends Class109 {

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray40;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
	private int anInt8397;

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
	private int anInt8408;

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
	private int anInt8419;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "[Lclient!ea;")
	private Class5_Sub16[] aClass5_Sub16Array1;

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "Lclient!co;")
	public Class69 aClass69_22;

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
	private int anInt8420;

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "Lclient!cq;")
	private Interface3 anInterface3_14;

	@OriginalMember(owner = "client!rd", name = "fb", descriptor = "Lclient!cq;")
	private Interface3 anInterface3_15;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "F")
	private float aFloat170 = -3.4028235E38F;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "F")
	private float aFloat171 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!fca;")
	private final Class114 aClass114_58 = new Class114();

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
	private final int anInt8409 = this.anInt9066 - 2;

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "Lclient!gd;")
	public final Class65_Sub2 aClass65_Sub2_14;

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "[[[Lclient!ea;")
	private Class5_Sub16[][][] aClass5_Sub16ArrayArrayArray1;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray42;

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray43;

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray44;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "[[S")
	public final short[][] aShortArrayArray17;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
	private final int anInt8412;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "[[B")
	private final byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
	public final int anInt8407;

	@OriginalMember(owner = "client!rd", name = "gb", descriptor = "[[B")
	private byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray41;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray45;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "Lclient!rda;")
	private Class300 aClass300_38;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "Lclient!ep;")
	private Class107 aClass107_1;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!gd;IIII[[I[[II)V")
	public Class109_Sub3(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass65_Sub2_14 = arg0;
		this.aClass5_Sub16ArrayArrayArray1 = new Class5_Sub16[arg3][arg4][];
		this.anIntArrayArrayArray42 = new int[arg3][arg4][];
		this.anIntArrayArrayArray43 = new int[arg3][arg4][];
		this.anIntArrayArrayArray44 = new int[arg3][arg4][];
		this.aShortArrayArray17 = new short[arg3 * arg4][];
		this.aFloatArrayArray12 = new float[super.anInt9061 + 1][super.anInt9065 + 1];
		this.anInt8412 = 0x1 << this.anInt8409;
		this.aFloatArrayArray11 = new float[super.anInt9061 + 1][super.anInt9065 + 1];
		this.aByteArrayArray27 = new byte[arg3][arg4];
		this.anInt8407 = arg2;
		this.aByteArrayArray28 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray41 = new int[arg3][arg4][];
		this.anIntArrayArrayArray45 = new int[arg3][arg4][];
		this.aFloatArrayArray10 = new float[super.anInt9061 + 1][super.anInt9065 + 1];
		for (@Pc(121) int local121 = 0; super.anInt9065 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9061; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray48[local125][local121];
				if ((float) local134 > this.aFloat170) {
					this.aFloat170 = (float) local134;
				}
				if ((float) local134 < this.aFloat171) {
					this.aFloat171 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt9061 && local121 < super.anInt9065) {
					@Pc(186) int local186 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(203) int local203 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(223) float local223 = (float) (1.0D / Math.sqrt((double) (local186 * local186 + arg7 * arg7 * 4 + local203 * local203)));
					this.aFloatArrayArray10[local125][local121] = local223 * (float) local186;
					this.aFloatArrayArray12[local125][local121] = (float) (-arg7 * 2) * local223;
					this.aFloatArrayArray11[local125][local121] = local223 * (float) local203;
				}
			}
		}
		this.aFloat170++;
		this.aFloat171--;
		this.aClass300_38 = new Class300(128);
		if ((this.anInt8407 & 0x10) != 0) {
			this.aClass107_1 = new Class107(this.aClass65_Sub2_14, this);
		}
	}

	@OriginalMember(owner = "client!rd", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray28[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray28[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ig;BII)V")
	private void method7179(@OriginalArg(0) Class5_Sub3_Sub7_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray42[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray45[arg1][arg2];
		@Pc(26) int local26 = local12.length;
		if (local26 > Static50.anIntArray36.length) {
			Static425.anIntArray428 = new int[local26];
			Static50.anIntArray36 = new int[local26];
		}
		for (@Pc(42) int local42 = 0; local42 < local26; local42++) {
			Static50.anIntArray36[local42] = local12[local42] >> this.aClass65_Sub2_14.anInt5270;
			Static425.anIntArray428[local42] = local19[local42] >> this.aClass65_Sub2_14.anInt5270;
		}
		@Pc(70) int local70 = 0;
		while (local26 > local70) {
			@Pc(76) int local76 = Static50.anIntArray36[local70];
			@Pc(81) int local81 = Static425.anIntArray428[local70++];
			@Pc(85) int local85 = Static50.anIntArray36[local70];
			@Pc(90) int local90 = Static425.anIntArray428[local70++];
			@Pc(94) int local94 = Static50.anIntArray36[local70];
			@Pc(99) int local99 = Static425.anIntArray428[local70++];
			if (-((local90 - local81) * (local94 - local85)) + (local90 - local99) * (local76 - local85) > 0) {
				arg0.method3896(local90, local94, local81, local99, local85, local76);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII[[ZIZI)V")
	private void method7180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		if (this.aClass5_Sub16Array1 == null) {
			return;
		}
		@Pc(18) int local18 = arg6 + arg6 + 1;
		@Pc(22) int local22 = local18 * local18;
		if (local22 > Static558.anIntArray417.length) {
			Static558.anIntArray417 = new int[local22];
		}
		@Pc(34) int local34 = arg2 - arg6;
		@Pc(36) int local36 = local34;
		if (local34 < 0) {
			local34 = 0;
		}
		@Pc(47) int local47 = arg0 - arg6;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(61) int local61 = arg2 + arg6;
		if (local61 > super.anInt9061 - 1) {
			local61 = super.anInt9061 - 1;
		}
		@Pc(80) int local80 = arg6 + arg0;
		Static245.anInt782 = 0;
		if (local80 > super.anInt9065 - 1) {
			local80 = super.anInt9065 - 1;
		}
		for (@Pc(95) int local95 = local34; local95 <= local61; local95++) {
			@Pc(103) boolean[] local103 = arg3[local95 - local36];
			for (@Pc(105) int local105 = local47; local105 <= local80; local105++) {
				if (local103[local105 - local49]) {
					Static558.anIntArray417[Static245.anInt782++] = local95 + local105 * super.anInt9061;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass65_Sub2_14.method4412();
		} else {
			this.aClass65_Sub2_14.method4352((float) arg4);
			this.aClass65_Sub2_14.method4367();
		}
		this.aClass65_Sub2_14.method4443();
		this.aClass65_Sub2_14.method4372((this.anInt8407 & 0x7) != 0);
		this.aClass65_Sub2_14.method4446(false, -1, false);
		this.aClass65_Sub2_14.method4427(0, this.anInterface3_15);
		for (@Pc(190) int local190 = 0; local190 < this.aClass5_Sub16Array1.length; local190++) {
			this.aClass5_Sub16Array1[local190].method2264(Static558.anIntArray417, Static245.anInt782);
		}
		@Pc(211) Class254_Sub2 local211 = this.aClass65_Sub2_14.method4471();
		local211.method7361(0, -1, 0);
		this.aClass65_Sub2_14.method4434();
		if (!this.aClass114_58.method2810()) {
			@Pc(229) int local229 = this.aClass65_Sub2_14.anInt5246;
			@Pc(233) int local233 = this.aClass65_Sub2_14.anInt5263;
			this.aClass65_Sub2_14.L(0, local233, this.aClass65_Sub2_14.anInt5250);
			this.aClass65_Sub2_14.method4372(false);
			this.aClass65_Sub2_14.method4445(false);
			this.aClass65_Sub2_14.method4419(128);
			this.aClass65_Sub2_14.method4446(false, -2, false);
			this.aClass65_Sub2_14.method4426(this.aClass65_Sub2_14.anInterface25_3);
			this.aClass65_Sub2_14.method4432(Static606.aClass178_4, Static138.aClass178_2);
			this.aClass65_Sub2_14.method4400(Static413.aClass64_3, 0);
			this.aClass65_Sub2_14.method4369(0, Static235.aClass64_2);
			for (@Pc(293) Class5 local293 = this.aClass114_58.method2805(); local293 != null; local293 = this.aClass114_58.method2814()) {
				@Pc(298) Class5_Sub53 local298 = (Class5_Sub53) local293;
				local298.method7787(arg0, arg6, arg3, arg2);
			}
			this.aClass65_Sub2_14.method4400(Static536.aClass64_4, 0);
			this.aClass65_Sub2_14.method4369(0, Static536.aClass64_4);
			this.aClass65_Sub2_14.method4426((Interface25) null);
			this.aClass65_Sub2_14.L(local229, local233, this.aClass65_Sub2_14.anInt5250);
		}
		if (this.aClass107_1 == null) {
			return;
		}
		this.aClass65_Sub2_14.method4427(0, this.anInterface3_15);
		this.aClass65_Sub2_14.method4427(1, this.anInterface3_14);
		this.aClass65_Sub2_14.method4447(this.aClass69_22);
		this.aClass107_1.method2682(arg3, arg5, arg2, arg0, arg6);
		return;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	@Override
	public void method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rd", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass107_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass65_Sub2_14.anInt5265 >> 8) >> this.aClass65_Sub2_14.anInt5270;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass65_Sub2_14.anInt5237 >> 8) >> this.aClass65_Sub2_14.anInt5270;
			this.aClass107_1.method2683(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub3_Sub7 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub3_Sub7 arg2) {
		if ((this.aByteArrayArray27[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9063 >> this.aClass65_Sub2_14.anInt5270;
		@Pc(24) Class5_Sub3_Sub7_Sub1 local24 = (Class5_Sub3_Sub7_Sub1) arg2;
		@Pc(34) Class5_Sub3_Sub7_Sub1 local34;
		if (local24 != null && local24.method3898(local21, local21)) {
			local34 = local24;
			local24.method3892();
		} else {
			local34 = new Class5_Sub3_Sub7_Sub1(this.aClass65_Sub2_14, local21, local21);
		}
		local34.method3895(local21, local21, 0, 0);
		this.method7179(local34, arg0, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray43 == null) {
			this.anIntArrayArrayArray43 = new int[super.anInt9061][super.anInt9065][];
		}
		if (arg5 != null && this.anIntArrayArrayArray40 == null) {
			this.anIntArrayArrayArray40 = new int[super.anInt9061][super.anInt9065][];
		}
		@Pc(33) Interface4 local33 = this.aClass65_Sub2_14.anInterface4_11;
		this.anIntArrayArrayArray42[arg0][arg1] = arg2;
		this.anIntArrayArrayArray45[arg0][arg1] = arg4;
		this.anIntArrayArrayArray44[arg0][arg1] = arg6;
		this.anIntArrayArrayArray41[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray40 != null) {
			this.anIntArrayArrayArray40[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray43 != null) {
			this.anIntArrayArrayArray43[arg0][arg1] = arg3;
		}
		@Pc(92) Class5_Sub16[] local92 = this.aClass5_Sub16ArrayArrayArray1[arg0][arg1] = new Class5_Sub16[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt8407 & 0x20) != 0 && local100 != -1 && local33.method358(local100).aBoolean315) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(146) long local146 = (long) local100 | (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(152) Class5 local152;
			for (local152 = this.aClass300_38.method7188(local146); local152 != null; local152 = this.aClass300_38.method7187()) {
				@Pc(157) Class5_Sub16 local157 = (Class5_Sub16) local152;
				if (local100 == local157.anInt2532 && local157.aFloat67 == (float) local104 && arg10 == local157.anInt2541 && local157.anInt2533 == arg11 && arg12 == local157.anInt2525) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class5_Sub16(this, local100, local104, arg10, arg11, arg12);
				this.aClass300_38.method7191(local92[local94], local146);
			} else {
				local92[local94] = (Class5_Sub16) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray27[arg0][arg1] = (byte) (this.aByteArrayArray27[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8419) {
			this.anInt8419 = arg6.length;
		}
		this.anInt8420 += arg6.length;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7180(arg1, arg5, arg0, arg3, -1, arg4, arg2);
	}

	@OriginalMember(owner = "client!rd", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass107_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass65_Sub2_14.anInt5265 * arg2 >> 8) >> this.aClass65_Sub2_14.anInt5270;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass65_Sub2_14.anInt5237 >> 8) >> this.aClass65_Sub2_14.anInt5270;
			this.aClass107_1.method2678(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7180(arg1, arg6, arg0, arg3, arg5, arg4, arg2);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7693(@OriginalArg(0) Class5_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass107_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass65_Sub2_14.anInt5265 * arg2 >> 8) >> this.aClass65_Sub2_14.anInt5270;
			@Pc(39) int local39 = arg3 - (this.aClass65_Sub2_14.anInt5237 * arg2 >> 8) >> this.aClass65_Sub2_14.anInt5270;
			return this.aClass107_1.method2679(local39, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!gu;[I)V")
	@Override
	public void method7694(@OriginalArg(0) Class5_Sub18 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass114_58.method2807(new Class5_Sub53(this.aClass65_Sub2_14, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7700(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8420 <= 0) {
			return;
		}
		@Pc(19) Interface12 local19 = this.aClass65_Sub2_14.method4399(this.anInt8408);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method900();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass65_Sub2_14.method4457(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(77) short[] local77;
				@Pc(81) int local81;
				@Pc(89) int local89;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt9061 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray17[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										if (local23 > local89) {
											local23 = local89;
										}
										if (local89 > local25) {
											local25 = local89;
										}
										local21++;
										local44.e(local89);
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt9061;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray17[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										if (local89 > local25) {
											local25 = local89;
										}
										local21++;
										local44.b(local89);
										if (local89 < local23) {
											local23 = local89;
										}
									}
								}
							}
							local57++;
						}
					}
				}
				local44.a();
				if (local19.method903()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass65_Sub2_14.method4408();
		this.aClass65_Sub2_14.method4366(false);
		this.aClass65_Sub2_14.method4372(false);
		this.aClass65_Sub2_14.method4433(false);
		this.aClass65_Sub2_14.method4445(false);
		this.aClass65_Sub2_14.method4419(0);
		this.aClass65_Sub2_14.method4446(false, -2, false);
		this.aClass65_Sub2_14.method4426((Interface25) null);
		@Pc(272) Class254_Sub2 local272 = this.aClass65_Sub2_14.method4471();
		@Pc(277) float[] local277 = this.aClass65_Sub2_14.method4379();
		local277[1] = 0.0F;
		local277[6] = 0.0F;
		local277[10] = 1.0F / (this.aFloat170 - this.aFloat171);
		local277[4] = 0.0F;
		local277[9] = 0.0F;
		local277[11] = 0.0F;
		local277[3] = 0.0F;
		local277[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass65_Sub2_14.anInt5126;
		local277[7] = 0.0F;
		local277[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass65_Sub2_14.anInt5222) - 1.0F;
		local277[5] = (float) 1024 / ((float) this.aClass65_Sub2_14.anInt5126 * 128.0F * (float) super.anInt9063);
		local277[2] = 0.0F;
		local277[0] = (float) 1024 / ((float) super.anInt9063 * 128.0F * (float) this.aClass65_Sub2_14.anInt5222);
		local277[8] = 0.0F;
		local277[14] = -this.aFloat171 / (this.aFloat170 - this.aFloat171);
		local277[15] = 1.0F;
		local272.method6236(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F);
		this.aClass65_Sub2_14.method4417();
		this.aClass65_Sub2_14.method4434();
		if ((this.anInt8407 & 0x7) == 0) {
			this.aClass65_Sub2_14.method4372(false);
		} else {
			this.aClass65_Sub2_14.method4372(true);
			this.aClass65_Sub2_14.method4389();
		}
		this.aClass65_Sub2_14.method4436(false);
		this.aClass65_Sub2_14.method4427(0, this.anInterface3_15);
		this.aClass65_Sub2_14.method4427(1, this.anInterface3_14);
		this.aClass65_Sub2_14.method4447(this.aClass69_22);
		this.aClass65_Sub2_14.method4398(0, local25 + 1 - local23, local23, Static72.aClass155_1, local19, local21 / 3);
		this.aClass65_Sub2_14.method4436(true);
	}

	@OriginalMember(owner = "client!rd", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt8420 <= 0) {
			this.aClass107_1 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt9061 + 1][super.anInt9065 + 1];
			for (@Pc(25) int local25 = 1; super.anInt9061 > local25; local25++) {
				for (@Pc(29) int local29 = 1; super.anInt9065 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray28[local25][local29] >> 1) + (this.aByteArrayArray28[local25 + 1][local29] >> 3) + (this.aByteArrayArray28[local25 - 1][local29] >> 2) + (this.aByteArrayArray28[local25][local29 - 1] >> 2) + (this.aByteArrayArray28[local25][local29 - -1] >> 3));
				}
			}
			@Pc(113) Class5_Sub16[] local113 = new Class5_Sub16[this.aClass300_38.method7190()];
			this.aClass300_38.method7184(local113);
			for (@Pc(121) int local121 = 0; local121 < local113.length; local121++) {
				local113[local121].method2272(this.anInt8420);
			}
			@Pc(137) int local137 = 20;
			if (this.anIntArrayArrayArray40 != null) {
				local137 += 4;
			}
			if ((this.anInt8407 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(157) NativeHeapBuffer local157 = this.aClass65_Sub2_14.aNativeHeap5.a(this.anInt8420 * 4, false);
			@Pc(167) NativeHeapBuffer local167 = this.aClass65_Sub2_14.aNativeHeap5.a(this.anInt8420 * local137, false);
			@Pc(172) Stream local172 = new Stream(local167);
			@Pc(177) Stream local177 = new Stream(local157);
			@Pc(181) Class5_Sub16[] local181 = new Class5_Sub16[this.anInt8420];
			@Pc(188) int local188 = Static180.method2993(this.anInt8420 / 4);
			if (local188 < 1) {
				local188 = 1;
			}
			@Pc(198) Class300 local198 = new Class300(local188);
			@Pc(202) Class5_Sub16[] local202 = new Class5_Sub16[this.anInt8419];
			@Pc(208) int local208;
			for (@Pc(204) int local204 = 0; super.anInt9061 > local204; local204++) {
				for (local208 = 0; super.anInt9065 > local208; local208++) {
					if (this.anIntArrayArrayArray44[local204][local208] != null) {
						@Pc(224) Class5_Sub16[] local224 = this.aClass5_Sub16ArrayArrayArray1[local204][local208];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray42[local204][local208];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray45[local204][local208];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray41[local204][local208];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray44[local204][local208];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray43 == null ? null : this.anIntArrayArrayArray43[local204][local208];
						if (local245 == null) {
							local245 = local252;
						}
						@Pc(280) int[] local280 = this.anIntArrayArrayArray40 == null ? null : this.anIntArrayArrayArray40[local204][local208];
						@Pc(287) float local287 = this.aFloatArrayArray10[local204][local208];
						@Pc(294) float local294 = this.aFloatArrayArray12[local204][local208];
						@Pc(301) float local301 = this.aFloatArrayArray11[local204][local208];
						@Pc(310) float local310 = this.aFloatArrayArray10[local204][local208 + 1];
						@Pc(319) float local319 = this.aFloatArrayArray12[local204][local208 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray11[local204][local208 + 1];
						@Pc(339) float local339 = this.aFloatArrayArray10[local204 + 1][local208 + 1];
						@Pc(350) float local350 = this.aFloatArrayArray12[local204 + 1][local208 + 1];
						@Pc(361) float local361 = this.aFloatArrayArray11[local204 + 1][local208 + 1];
						@Pc(370) float local370 = this.aFloatArrayArray10[local204 + 1][local208];
						@Pc(379) float local379 = this.aFloatArrayArray12[local204 + 1][local208];
						@Pc(388) float local388 = this.aFloatArrayArray11[local204 + 1][local208];
						@Pc(396) int local396 = local23[local204][local208] & 0xFF;
						@Pc(406) int local406 = local23[local204][local208 + 1] & 0xFF;
						@Pc(418) int local418 = local23[local204 + 1][local208 + 1] & 0xFF;
						@Pc(428) int local428 = local23[local204 + 1][local208] & 0xFF;
						@Pc(430) int local430 = 0;
						@Pc(440) int local440;
						label357: for (@Pc(432) int local432 = 0; local432 < local252.length; local432++) {
							@Pc(438) Class5_Sub16 local438 = local224[local432];
							for (local440 = 0; local440 < local430; local440++) {
								if (local202[local440] == local438) {
									continue label357;
								}
							}
							local202[local430++] = local438;
						}
						@Pc(485) short[] local485 = this.aShortArrayArray17[local204 + super.anInt9061 * local208] = new short[local252.length];
						for (local440 = 0; local440 < local252.length; local440++) {
							@Pc(498) int local498 = (local204 << super.anInt9066) + local231[local440];
							@Pc(507) int local507 = (local208 << super.anInt9066) + local238[local440];
							@Pc(512) int local512 = local498 >> this.anInt8409;
							@Pc(517) int local517 = local507 >> this.anInt8409;
							@Pc(521) int local521 = local252[local440];
							@Pc(525) int local525 = local245[local440];
							@Pc(533) int local533 = local264 == null ? 0 : local264[local440];
							@Pc(551) long local551 = (long) (local512 << 16) | (long) local521 << 32 | (long) local525 << 48 | (long) local517;
							@Pc(555) int local555 = local231[local440];
							@Pc(559) int local559 = local238[local440];
							@Pc(561) byte local561 = 74;
							@Pc(563) int local563 = 0;
							@Pc(565) float local565 = 1.0F;
							@Pc(580) float local580;
							@Pc(582) float local582;
							@Pc(578) float local578;
							@Pc(669) float local669;
							@Pc(576) int local576;
							if (local555 == 0 && local559 == 0) {
								local576 = local561 - local396;
								local578 = local301;
								local580 = local287;
								local582 = local294;
							} else if (local555 == 0 && super.anInt9063 == local559) {
								local582 = local319;
								local576 = local561 - local406;
								local578 = local328;
								local580 = local310;
							} else if (super.anInt9063 == local555 && super.anInt9063 == local559) {
								local580 = local339;
								local582 = local350;
								local578 = local361;
								local576 = local561 - local418;
							} else if (super.anInt9063 == local555 && local559 == 0) {
								local576 = local561 - local428;
								local580 = local370;
								local578 = local388;
								local582 = local379;
							} else {
								@Pc(646) float local646 = (float) local555 / (float) super.anInt9063;
								@Pc(653) float local653 = (float) local559 / (float) super.anInt9063;
								@Pc(661) float local661 = (local370 - local287) * local646 + local287;
								local669 = local646 * (local379 - local294) + local294;
								@Pc(677) float local677 = local301 + local646 * (local388 - local301);
								@Pc(686) float local686 = local310 + local646 * (local339 - local310);
								@Pc(695) float local695 = (local350 - local319) * local646 + local319;
								@Pc(704) float local704 = local646 * (local361 - local328) + local328;
								local582 = (local695 - local669) * local653 + local669;
								local580 = local661 + local653 * (local686 - local661);
								local578 = local653 * (local704 - local677) + local677;
								@Pc(743) int local743 = local396 + ((local428 - local396) * local555 >> super.anInt9066);
								@Pc(755) int local755 = (local555 * (local418 - local406) >> super.anInt9066) + local406;
								local576 = local561 - local743 - (local559 * (local755 - local743) >> super.anInt9066);
							}
							if (local521 != -1) {
								@Pc(792) int local792 = local576 * (local521 & 0x7F) >> 7;
								if (local792 < 2) {
									local792 = 2;
								} else if (local792 > 126) {
									local792 = 126;
								}
								if ((this.anInt8407 & 0x7) == 0) {
									local565 = local582 * this.aClass65_Sub2_14.aFloatArray50[1] + local580 * this.aClass65_Sub2_14.aFloatArray50[0] + this.aClass65_Sub2_14.aFloatArray50[2] * local578;
									local565 = this.aClass65_Sub2_14.aFloat99 + local565 * (local565 > 0.0F ? this.aClass65_Sub2_14.aFloat101 : this.aClass65_Sub2_14.aFloat104);
								}
								local563 = Static336.anIntArray357[local521 & 0xFF80 | local792];
							}
							@Pc(866) Class5 local866 = null;
							if ((this.anInt8412 - 1 & local498) == 0 && (this.anInt8412 - 1 & local507) == 0) {
								local866 = local198.method7188(local551);
							}
							@Pc(905) int local905;
							@Pc(936) int local936;
							if (local866 == null) {
								if (local525 == local521) {
									local936 = local563;
								} else {
									@Pc(946) int local946 = local576 * (local525 & 0x7F) >> 7;
									if (local946 < 2) {
										local946 = 2;
									} else if (local946 > 126) {
										local946 = 126;
									}
									local936 = Static336.anIntArray357[local946 | local525 & 0xFF80];
									if ((this.anInt8407 & 0x7) == 0) {
										local669 = local578 * this.aClass65_Sub2_14.aFloatArray50[2] + this.aClass65_Sub2_14.aFloatArray50[1] * local582 + this.aClass65_Sub2_14.aFloatArray50[0] * local580;
										local669 = (local565 > 0.0F ? this.aClass65_Sub2_14.aFloat101 : this.aClass65_Sub2_14.aFloat104) * local565 + this.aClass65_Sub2_14.aFloat99;
										@Pc(1022) int local1022 = local936 >> 16 & 0xFF;
										@Pc(1028) int local1028 = local936 >> 8 & 0xFF;
										@Pc(1032) int local1032 = local936 & 0xFF;
										local1022 = (int) ((float) local1022 * local669);
										if (local1022 < 0) {
											local1022 = 0;
										} else if (local1022 > 255) {
											local1022 = 255;
										}
										local1028 = (int) ((float) local1028 * local669);
										local1032 = (int) ((float) local1032 * local669);
										if (local1028 < 0) {
											local1028 = 0;
										} else if (local1028 > 255) {
											local1028 = 255;
										}
										if (local1032 < 0) {
											local1032 = 0;
										} else if (local1032 > 255) {
											local1032 = 255;
										}
										local936 = local1028 << 8 | local1022 << 16 | local1032;
									}
								}
								if (Stream.c()) {
									local172.a((float) local498);
									local172.a((float) (local533 + this.method7702(local498, local507)));
									local172.a((float) local507);
									local172.a((float) local498);
									local172.a((float) local507);
									if (this.anIntArrayArrayArray40 != null) {
										local172.a((float) (local280 == null ? 0 : local280[local440] - 1));
									}
									if ((this.anInt8407 & 0x7) != 0) {
										local172.a(local580);
										local172.a(local582);
										local172.a(local578);
									}
								} else {
									local172.b((float) local498);
									local172.b((float) (this.method7702(local498, local507) + local533));
									local172.b((float) local507);
									local172.b((float) local498);
									local172.b((float) local507);
									if (this.anIntArrayArrayArray40 != null) {
										local172.b((float) (local280 == null ? 0 : local280[local440] - 1));
									}
									if ((this.anInt8407 & 0x7) != 0) {
										local172.b(local580);
										local172.b(local582);
										local172.b(local578);
									}
								}
								if (this.aClass65_Sub2_14.anInt5253 == 0) {
									local177.c(local936 | 0xFF000000);
								} else {
									local177.a(local936 | 0xFF000000);
								}
								local905 = this.anInt8397++;
								local485[local440] = (short) local905;
								if (local521 != -1) {
									local181[local905] = local224[local440];
								}
								local198.method7191(new Class5_Sub37(local485[local440]), local551);
							} else {
								local485[local440] = ((Class5_Sub37) local866).aShort54;
								local905 = local485[local440] & 0xFFFF;
								if (local521 != -1 && local181[local905].aLong307 > local224[local440].aLong307) {
									local181[local905] = local224[local440];
								}
							}
							for (local936 = 0; local936 < local430; local936++) {
								local202[local936].method2273(local576, local905, local565, local563);
							}
							this.anInt8408++;
						}
					}
				}
			}
			for (local208 = 0; local208 < this.anInt8397; local208++) {
				@Pc(1316) Class5_Sub16 local1316 = local181[local208];
				if (local1316 != null) {
					local1316.method2275(local208);
				}
			}
			@Pc(1337) int local1337;
			@Pc(1355) int local1355;
			for (@Pc(1333) int local1333 = 0; local1333 < super.anInt9061; local1333++) {
				for (local1337 = 0; super.anInt9065 > local1337; local1337++) {
					@Pc(1349) short[] local1349 = this.aShortArrayArray17[local1333 + super.anInt9061 * local1337];
					if (local1349 != null) {
						@Pc(1353) int local1353 = 0;
						local1355 = 0;
						while (local1355 < local1349.length) {
							@Pc(1364) int local1364 = local1349[local1355++] & 0xFFFF;
							@Pc(1371) int local1371 = local1349[local1355++] & 0xFFFF;
							@Pc(1378) int local1378 = local1349[local1355++] & 0xFFFF;
							@Pc(1382) Class5_Sub16 local1382 = local181[local1364];
							@Pc(1386) Class5_Sub16 local1386 = local181[local1371];
							@Pc(1390) Class5_Sub16 local1390 = local181[local1378];
							@Pc(1392) Class5_Sub16 local1392 = null;
							if (local1382 != null) {
								local1382.method2269(local1333, local1337, local1353);
								local1392 = local1382;
							}
							if (local1386 != null) {
								local1386.method2269(local1333, local1337, local1353);
								if (local1392 == null || local1386.aLong307 < local1392.aLong307) {
									local1392 = local1386;
								}
							}
							if (local1390 != null) {
								local1390.method2269(local1333, local1337, local1353);
								if (local1392 == null || local1392.aLong307 > local1390.aLong307) {
									local1392 = local1390;
								}
							}
							if (local1392 != null) {
								if (local1382 != null) {
									local1392.method2275(local1364);
								}
								if (local1386 != null) {
									local1392.method2275(local1371);
								}
								if (local1390 != null) {
									local1392.method2275(local1378);
								}
								local1392.method2269(local1333, local1337, local1353);
							}
							local1353++;
						}
					}
				}
			}
			local172.a();
			local177.a();
			this.anInterface3_14 = this.aClass65_Sub2_14.method4374(false);
			this.anInterface3_14.method8246(this.anInt8397 * 4, 4, local157);
			this.anInterface3_15 = this.aClass65_Sub2_14.method4374(false);
			this.anInterface3_15.method8246(local137 * this.anInt8397, local137, local167);
			if ((this.anInt8407 & 0x7) == 0) {
				if (this.anIntArrayArrayArray40 == null) {
					this.aClass69_22 = this.aClass65_Sub2_14.method4463(new Class219[] { new Class219(new Class281[] { Static456.aClass281_1, Static456.aClass281_5 }), new Class219(Static456.aClass281_3) });
				} else {
					this.aClass69_22 = this.aClass65_Sub2_14.method4463(new Class219[] { new Class219(new Class281[] { Static456.aClass281_1, Static456.aClass281_5, Static456.aClass281_4 }), new Class219(Static456.aClass281_3) });
				}
			} else if (this.anIntArrayArrayArray40 == null) {
				this.aClass69_22 = this.aClass65_Sub2_14.method4463(new Class219[] { new Class219(new Class281[] { Static456.aClass281_1, Static456.aClass281_5, Static456.aClass281_2 }), new Class219(Static456.aClass281_3) });
			} else {
				this.aClass69_22 = this.aClass65_Sub2_14.method4463(new Class219[] { new Class219(new Class281[] { Static456.aClass281_1, Static456.aClass281_5, Static456.aClass281_4, Static456.aClass281_2 }), new Class219(Static456.aClass281_3) });
			}
			local1337 = 0;
			for (@Pc(1683) int local1683 = 0; local1683 < local113.length; local1683++) {
				if (local113[local1683].anInt2534 > 0) {
					local113[local1337++] = local113[local1683];
				}
			}
			this.aClass5_Sub16Array1 = new Class5_Sub16[local1337];
			@Pc(1716) long[] local1716 = new long[local1337];
			for (local1355 = 0; local1355 < local1337; local1355++) {
				@Pc(1724) Class5_Sub16 local1724 = local113[local1355];
				local1716[local1355] = local1724.aLong307;
				this.aClass5_Sub16Array1[local1355] = local1724;
				local1724.method2274(this.anInt8397);
			}
			Static324.method8035(this.aClass5_Sub16Array1, local1716);
			if (this.aClass107_1 != null) {
				this.aClass107_1.method2680();
			}
		}
		this.aClass5_Sub16ArrayArrayArray1 = null;
		this.anIntArrayArrayArray42 = this.anIntArrayArrayArray45 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray12 = this.aFloatArrayArray11 = null;
		this.aClass300_38 = null;
		this.anIntArrayArrayArray43 = null;
		this.anIntArrayArrayArray40 = null;
		this.aByteArrayArray28 = null;
		this.anIntArrayArrayArray44 = null;
		this.anIntArrayArrayArray41 = null;
	}
}
