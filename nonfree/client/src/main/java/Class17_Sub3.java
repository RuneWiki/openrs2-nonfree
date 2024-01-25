import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!jba", name = "lb", descriptor = "Lclient!jw;")
	public static final Class181 lb = new Class181(8, 16);

	@OriginalMember(owner = "client!jba", name = "mb", descriptor = "[B")
	public static final byte[] aByteArray46;

	@OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
	private int anInt4468;

	@OriginalMember(owner = "client!jba", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!jba", name = "M", descriptor = "I")
	private int anInt4477;

	@OriginalMember(owner = "client!jba", name = "bb", descriptor = "[Lclient!nl;")
	private Class1_Sub35[] aClass1_Sub35Array1;

	@OriginalMember(owner = "client!jba", name = "cb", descriptor = "Lclient!wr;")
	private Interface24 anInterface24_9;

	@OriginalMember(owner = "client!jba", name = "gb", descriptor = "I")
	private int anInt4486;

	@OriginalMember(owner = "client!jba", name = "ib", descriptor = "Lclient!um;")
	public Class331 aClass331_14;

	@OriginalMember(owner = "client!jba", name = "jb", descriptor = "I")
	private int anInt4487;

	@OriginalMember(owner = "client!jba", name = "kb", descriptor = "Lclient!wr;")
	private Interface24 anInterface24_10;

	@OriginalMember(owner = "client!jba", name = "n", descriptor = "F")
	private float aFloat108 = -3.4028235E38F;

	@OriginalMember(owner = "client!jba", name = "t", descriptor = "F")
	private float aFloat109 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!jba", name = "Y", descriptor = "Lclient!wo;")
	private final Class361 aClass361_51 = new Class361();

	@OriginalMember(owner = "client!jba", name = "G", descriptor = "I")
	private final int anInt4474 = this.anInt7988 - 2;

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "Lclient!qq;")
	public final Class12_Sub2 aClass12_Sub2_11;

	@OriginalMember(owner = "client!jba", name = "H", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!jba", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!jba", name = "Z", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "[[[Lclient!nl;")
	private Class1_Sub35[][][] aClass1_Sub35ArrayArrayArray1;

	@OriginalMember(owner = "client!jba", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!jba", name = "p", descriptor = "[[B")
	private final byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!jba", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!jba", name = "O", descriptor = "I")
	private final int anInt4479;

	@OriginalMember(owner = "client!jba", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!jba", name = "N", descriptor = "I")
	public final int anInt4478;

	@OriginalMember(owner = "client!jba", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!jba", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!jba", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!jba", name = "hb", descriptor = "Lclient!wh;")
	private Class356 aClass356_21;

	@OriginalMember(owner = "client!jba", name = "L", descriptor = "Lclient!gt;")
	private Class125 aClass125_2;

	static {
		@Pc(12) int local12 = 0;
		aByteArray46 = new byte[32896];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			for (@Pc(20) int local20 = 0; local20 <= local17; local20++) {
				aByteArray46[local12++] = (byte) (255.0D / Math.sqrt((double) ((float) (local20 * local20 + local17 * local17 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!qq;IIII[[I[[II)V")
	public Class17_Sub3(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass12_Sub2_11 = arg0;
		this.aShortArrayArray3 = new short[arg4 * arg3][];
		this.aFloatArrayArray5 = new float[super.anInt7983 + 1][super.anInt7984 + 1];
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
		this.aClass1_Sub35ArrayArrayArray1 = new Class1_Sub35[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aByteArrayArray14 = new byte[arg3][arg4];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anInt4479 = 0x1 << this.anInt4474;
		this.aFloatArrayArray7 = new float[super.anInt7983 + 1][super.anInt7984 + 1];
		this.anInt4478 = arg2;
		this.aFloatArrayArray6 = new float[super.anInt7983 + 1][super.anInt7984 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt7984 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt7983 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray50[local125][local121];
				if (this.aFloat109 > (float) local134) {
					this.aFloat109 = local134;
				}
				if (this.aFloat108 < (float) local134) {
					this.aFloat108 = local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt7983 && super.anInt7984 > local121) {
					@Pc(186) int local186 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(203) int local203 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(223) float local223 = (float) (1.0D / Math.sqrt((double) (local186 * local186 + arg7 * 4 * arg7 + local203 * local203)));
					this.aFloatArrayArray7[local125][local121] = (float) local186 * local223;
					this.aFloatArrayArray5[local125][local121] = local223 * (float) (-arg7 * 2);
					this.aFloatArrayArray6[local125][local121] = local223 * (float) local203;
				}
			}
		}
		this.aFloat109--;
		this.aFloat108++;
		this.aClass356_21 = new Class356(128);
		if ((this.anInt4478 & 0x10) != 0) {
			this.aClass125_2 = new Class125(this.aClass12_Sub2_11, this);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6646(@OriginalArg(0) Class1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass125_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass12_Sub2_11.anInt7549 * arg2 >> 8) >> this.aClass12_Sub2_11.anInt7540;
			@Pc(40) int local40 = arg3 - (this.aClass12_Sub2_11.anInt7536 * arg2 >> 8) >> this.aClass12_Sub2_11.anInt7540;
			return this.aClass125_2.method2706(local25, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray15[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray15[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub3_Sub4 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub4 arg2) {
		if ((this.aByteArrayArray14[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt7986 >> this.aClass12_Sub2_11.anInt7540;
		@Pc(24) Class1_Sub3_Sub4_Sub2 local24 = (Class1_Sub3_Sub4_Sub2) arg2;
		@Pc(34) Class1_Sub3_Sub4_Sub2 local34;
		if (local24 != null && local24.method1796(local21, local21)) {
			local34 = local24;
			local24.method1797();
		} else {
			local34 = new Class1_Sub3_Sub4_Sub2(this.aClass12_Sub2_11, local21, local21);
		}
		local34.method1798(local21, local21, 0, 0);
		this.method3848(local34, arg1, arg0);
		return local34;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.O(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V")
	@Override
	public void method6644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!di;II)V")
	private void method3848(@OriginalArg(1) Class1_Sub3_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray12[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (Static347.anIntArray627.length < local22) {
			Static347.anIntArray627 = new int[local22];
			Static173.anIntArray183 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static347.anIntArray627[local38] = local12[local38] >> this.aClass12_Sub2_11.anInt7540;
			Static173.anIntArray183[local38] = local19[local38] >> this.aClass12_Sub2_11.anInt7540;
		}
		@Pc(78) int local78 = 0;
		while (local22 > local78) {
			@Pc(84) int local84 = Static347.anIntArray627[local78];
			@Pc(89) int local89 = Static173.anIntArray183[local78++];
			@Pc(93) int local93 = Static347.anIntArray627[local78];
			@Pc(98) int local98 = Static173.anIntArray183[local78++];
			@Pc(102) int local102 = Static347.anIntArray627[local78];
			@Pc(107) int local107 = Static173.anIntArray183[local78++];
			if (-((local102 - local93) * (-local89 + local98)) + (local84 - local93) * (-local107 + local98) > 0) {
				arg0.method1793(local93, local84, local98, local107, local102, local89);
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt7983][super.anInt7984][];
		}
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt7983][super.anInt7984][];
		}
		this.anIntArrayArrayArray12[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray10[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub35[] local88 = this.aClass1_Sub35ArrayArrayArray1[arg0][arg1] = new Class1_Sub35[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[local90] << 14);
			@Pc(125) Class1 local125;
			for (local125 = this.aClass356_21.method7796(local119); local125 != null; local125 = this.aClass356_21.method7801()) {
				@Pc(130) Class1_Sub35 local130 = (Class1_Sub35) local125;
				if (local130.anInt6232 == arg8[local90] && (float) arg9[local90] == local130.aFloat158 && arg10 == local130.anInt6241 && local130.anInt6243 == arg11 && arg12 == local130.anInt6234) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub35(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass356_21.method7800(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub35) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray14[arg0][arg1] = (byte) (this.aByteArrayArray14[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt4486) {
			this.anInt4486 = arg6.length;
		}
		this.anInt4487 += arg6.length;
	}

	@OriginalMember(owner = "client!jba", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass125_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass12_Sub2_11.anInt7549 >> 8) >> this.aClass12_Sub2_11.anInt7540;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass12_Sub2_11.anInt7536 >> 8) >> this.aClass12_Sub2_11.anInt7540;
			this.aClass125_2.method2701(local23, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method3850(arg2, arg0, arg1, arg3, arg5, arg4);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIBI[[ZIZ)V")
	private void method3850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (this.aClass1_Sub35Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg0 + arg0 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (Static206.anIntArray236.length < local14) {
			Static206.anIntArray236 = new int[local14];
		}
		@Pc(25) int local25 = arg1 - arg0;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(39) int local39 = arg2 - arg0;
		@Pc(41) int local41 = local39;
		if (local39 < 0) {
			local39 = 0;
		}
		@Pc(49) int local49 = arg1 + arg0;
		if (super.anInt7983 - 1 < local49) {
			local49 = super.anInt7983 - 1;
		}
		@Pc(69) int local69 = arg2 + arg0;
		if (local69 > super.anInt7984 - 1) {
			local69 = super.anInt7984 - 1;
		}
		Static267.anInt5014 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local49; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local39; local95 <= local69; local95++) {
				if (local93[local95 - local41]) {
					Static206.anIntArray236[Static267.anInt5014++] = super.anInt7983 * local95 + local84;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass12_Sub2_11.method6277();
		} else {
			this.aClass12_Sub2_11.method6233((float) arg4);
			this.aClass12_Sub2_11.method6267();
		}
		this.aClass12_Sub2_11.method6175();
		this.aClass12_Sub2_11.method6161((this.anInt4478 & 0x7) != 0);
		this.aClass12_Sub2_11.method6236(-1, false, false);
		this.aClass12_Sub2_11.method6276(0, this.anInterface24_10);
		for (@Pc(189) int local189 = 0; local189 < this.aClass1_Sub35Array1.length; local189++) {
			this.aClass1_Sub35Array1[local189].method5219(Static267.anInt5014, Static206.anIntArray236);
		}
		@Pc(210) Class209_Sub2 local210 = this.aClass12_Sub2_11.method6245();
		local210.NA(0, -1, 0);
		this.aClass12_Sub2_11.method6275();
		if (!this.aClass361_51.method7847()) {
			@Pc(230) int local230 = this.aClass12_Sub2_11.anInt7555;
			@Pc(234) int local234 = this.aClass12_Sub2_11.anInt7552;
			this.aClass12_Sub2_11.pa(0, local234, this.aClass12_Sub2_11.anInt7520);
			this.aClass12_Sub2_11.method6161(false);
			this.aClass12_Sub2_11.method6184(false);
			this.aClass12_Sub2_11.method6183(128);
			this.aClass12_Sub2_11.method6236(-2, false, false);
			this.aClass12_Sub2_11.method6159(this.aClass12_Sub2_11.anInterface18_3);
			this.aClass12_Sub2_11.method6241(Static240.aClass108_5, Static9.aClass108_2);
			this.aClass12_Sub2_11.method6179(Static135.aClass84_1, 0);
			this.aClass12_Sub2_11.method6234(0, Static328.aClass84_3);
			for (@Pc(296) Class1 local296 = this.aClass361_51.method7854(); local296 != null; local296 = this.aClass361_51.method7853()) {
				@Pc(301) Class1_Sub43 local301 = (Class1_Sub43) local296;
				local301.method6621(arg0, arg3, arg2, arg1);
			}
			this.aClass12_Sub2_11.method6179(Static587.aClass84_6, 0);
			this.aClass12_Sub2_11.method6234(0, Static587.aClass84_6);
			this.aClass12_Sub2_11.method6159(null);
			this.aClass12_Sub2_11.pa(local230, local234, this.aClass12_Sub2_11.anInt7520);
		}
		if (this.aClass125_2 != null) {
			this.aClass12_Sub2_11.method6276(0, this.anInterface24_10);
			this.aClass12_Sub2_11.method6276(1, this.anInterface24_9);
			this.aClass12_Sub2_11.method6194(this.aClass331_14);
			this.aClass125_2.method2703(arg0, arg3, arg5, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!qea;[I)V")
	@Override
	public void method6640(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass361_51.method7855(new Class1_Sub43(this.aClass12_Sub2_11, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!jba", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass125_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass12_Sub2_11.anInt7549 * arg2 >> 8) >> this.aClass12_Sub2_11.anInt7540;
			@Pc(39) int local39 = arg3 - (this.aClass12_Sub2_11.anInt7536 * arg2 >> 8) >> this.aClass12_Sub2_11.anInt7540;
			this.aClass125_2.method2704(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!jba", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt4487 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt7983 + 1][super.anInt7984 + 1];
			for (@Pc(19) int local19 = 1; super.anInt7983 > local19; local19++) {
				for (@Pc(23) int local23 = 1; local23 < super.anInt7984; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray15[local19][local23 + 1] >> 3) + (this.aByteArrayArray15[local19][local23 - 1] >> 2) + (this.aByteArrayArray15[local19 + 1][local23] >> 3) + (this.aByteArrayArray15[local19 + -1][local23] >> 2) + (this.aByteArrayArray15[local19][local23] >> 1));
				}
			}
			@Pc(107) Class1_Sub35[] local107 = new Class1_Sub35[this.aClass356_21.method7799()];
			this.aClass356_21.method7791(local107);
			for (@Pc(115) int local115 = 0; local115 < local107.length; local115++) {
				local107[local115].method5212(this.anInt4487);
			}
			@Pc(131) int local131 = 20;
			if (this.anIntArrayArrayArray11 != null) {
				local131 += 4;
			}
			if ((this.anInt4478 & 0x7) != 0) {
				local131 += 12;
			}
			@Pc(154) NativeHeapBuffer local154 = this.aClass12_Sub2_11.aNativeHeap6.a(this.anInt4487 * 4, false);
			@Pc(164) NativeHeapBuffer local164 = this.aClass12_Sub2_11.aNativeHeap6.a(this.anInt4487 * local131, false);
			@Pc(169) Stream local169 = new Stream(local164);
			@Pc(174) Stream local174 = new Stream(local154);
			@Pc(178) Class1_Sub35[] local178 = new Class1_Sub35[this.anInt4487];
			@Pc(185) int local185 = Static549.method7478(this.anInt4487 / 4);
			if (local185 < 1) {
				local185 = 1;
			}
			@Pc(197) Class356 local197 = new Class356(local185);
			@Pc(201) Class1_Sub35[] local201 = new Class1_Sub35[this.anInt4486];
			@Pc(207) int local207;
			for (@Pc(203) int local203 = 0; super.anInt7983 > local203; local203++) {
				for (local207 = 0; local207 < super.anInt7984; local207++) {
					if (this.anIntArrayArrayArray10[local203][local207] != null) {
						@Pc(223) Class1_Sub35[] local223 = this.aClass1_Sub35ArrayArrayArray1[local203][local207];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray12[local203][local207];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray13[local203][local207];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray9[local203][local207];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray10[local203][local207];
						@Pc(263) int[] local263 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local203][local207];
						if (local244 == null) {
							local244 = local251;
						}
						@Pc(279) int[] local279 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local203][local207];
						@Pc(286) float local286 = this.aFloatArrayArray7[local203][local207];
						@Pc(293) float local293 = this.aFloatArrayArray5[local203][local207];
						@Pc(300) float local300 = this.aFloatArrayArray6[local203][local207];
						@Pc(309) float local309 = this.aFloatArrayArray7[local203][local207 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray5[local203][local207 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray6[local203][local207 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray7[local203 + 1][local207 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray5[local203 + 1][local207 + 1];
						@Pc(360) float local360 = this.aFloatArrayArray6[local203 + 1][local207 + 1];
						@Pc(369) float local369 = this.aFloatArrayArray7[local203 + 1][local207];
						@Pc(378) float local378 = this.aFloatArrayArray5[local203 + 1][local207];
						@Pc(387) float local387 = this.aFloatArrayArray6[local203 + 1][local207];
						@Pc(395) int local395 = local17[local203][local207] & 0xFF;
						@Pc(405) int local405 = local17[local203][local207 + 1] & 0xFF;
						@Pc(417) int local417 = local17[local203 + 1][local207 + 1] & 0xFF;
						@Pc(427) int local427 = local17[local203 + 1][local207] & 0xFF;
						@Pc(429) int local429 = 0;
						@Pc(439) int local439;
						label355: for (@Pc(431) int local431 = 0; local431 < local251.length; local431++) {
							@Pc(437) Class1_Sub35 local437 = local223[local431];
							for (local439 = 0; local439 < local429; local439++) {
								if (local437 == local201[local439]) {
									continue label355;
								}
							}
							local201[local429++] = local437;
						}
						@Pc(481) short[] local481 = this.aShortArrayArray3[local207 * super.anInt7983 + local203] = new short[local251.length];
						for (local439 = 0; local439 < local251.length; local439++) {
							@Pc(494) int local494 = (local203 << super.anInt7988) + local230[local439];
							@Pc(504) int local504 = (local207 << super.anInt7988) + local237[local439];
							@Pc(509) int local509 = local494 >> this.anInt4474;
							@Pc(514) int local514 = local504 >> this.anInt4474;
							@Pc(518) int local518 = local251[local439];
							@Pc(522) int local522 = local244[local439];
							@Pc(530) int local530 = local263 == null ? 0 : local263[local439];
							@Pc(548) long local548 = (long) (local509 << 16) | (long) local522 << 48 | (long) local518 << 32 | (long) local514;
							@Pc(552) int local552 = local230[local439];
							@Pc(556) int local556 = local237[local439];
							@Pc(558) byte local558 = 74;
							@Pc(560) int local560 = 0;
							@Pc(569) float local569;
							@Pc(571) float local571;
							@Pc(573) float local573;
							@Pc(649) float local649;
							@Pc(577) int local577;
							if (local552 == 0 && local556 == 0) {
								local569 = local286;
								local571 = local293;
								local573 = local300;
								local577 = local558 - local395;
							} else if (local552 == 0 && local556 == super.anInt7986) {
								local571 = local318;
								local577 = local558 - local405;
								local573 = local327;
								local569 = local309;
							} else if (local552 == super.anInt7986 && local556 == super.anInt7986) {
								local569 = local338;
								local571 = local349;
								local577 = local558 - local417;
								local573 = local360;
							} else if (super.anInt7986 == local552 && local556 == 0) {
								local573 = local387;
								local571 = local378;
								local569 = local369;
								local577 = local558 - local427;
							} else {
								@Pc(626) float local626 = (float) local552 / (float) super.anInt7986;
								@Pc(633) float local633 = (float) local556 / (float) super.anInt7986;
								@Pc(641) float local641 = local626 * (local369 - local286) + local286;
								local649 = local626 * (local378 - local293) + local293;
								@Pc(658) float local658 = (local387 - local300) * local626 + local300;
								@Pc(666) float local666 = (local338 - local309) * local626 + local309;
								@Pc(675) float local675 = local318 + local626 * (local349 - local318);
								local569 = local641 + local633 * (local666 - local641);
								@Pc(693) float local693 = (local360 - local327) * local626 + local327;
								local571 = local649 + local633 * (local675 - local649);
								local573 = local658 + (local693 - local658) * local633;
								@Pc(722) int local722 = local395 + (local552 * (local427 - local395) >> super.anInt7988);
								@Pc(734) int local734 = local405 + (local552 * (local417 - local405) >> super.anInt7988);
								local577 = local558 - (local556 * (local734 - local722) >> super.anInt7988) - local722;
							}
							@Pc(774) float local774 = 1.0F;
							if (local518 != -1) {
								@Pc(786) int local786 = (local518 & 0x7F) * local577 >> 7;
								if (local786 < 2) {
									local786 = 2;
								} else if (local786 > 126) {
									local786 = 126;
								}
								local560 = Static279.anIntArray313[local518 & 0xFF80 | local786];
								if ((this.anInt4478 & 0x7) == 0) {
									local774 = this.aClass12_Sub2_11.aFloatArray62[2] * local573 + local571 * this.aClass12_Sub2_11.aFloatArray62[1] + this.aClass12_Sub2_11.aFloatArray62[0] * local569;
									local774 = this.aClass12_Sub2_11.aFloat188 + local774 * (local774 > 0.0F ? this.aClass12_Sub2_11.aFloat193 : this.aClass12_Sub2_11.aFloat191);
								}
							}
							@Pc(857) Class1 local857 = null;
							if ((local494 & this.anInt4479 - 1) == 0 && (this.anInt4479 - 1 & local504) == 0) {
								local857 = local197.method7796(local548);
							}
							@Pc(1196) int local1196;
							@Pc(918) int local918;
							if (local857 == null) {
								if (local518 == local522) {
									local918 = local560;
								} else {
									@Pc(896) int local896 = (local522 & 0x7F) * local577 >> 7;
									if (local896 < 2) {
										local896 = 2;
									} else if (local896 > 126) {
										local896 = 126;
									}
									local918 = Static279.anIntArray313[local522 & 0xFF80 | local896];
									if ((this.anInt4478 & 0x7) == 0) {
										local649 = this.aClass12_Sub2_11.aFloatArray62[0] * local569 + local571 * this.aClass12_Sub2_11.aFloatArray62[1] + local573 * this.aClass12_Sub2_11.aFloatArray62[2];
										local649 = local774 * (local774 > 0.0F ? this.aClass12_Sub2_11.aFloat193 : this.aClass12_Sub2_11.aFloat191) + this.aClass12_Sub2_11.aFloat188;
										@Pc(971) int local971 = local918 >> 16 & 0xFF;
										@Pc(977) int local977 = local918 >> 8 & 0xFF;
										@Pc(981) int local981 = local918 & 0xFF;
										local971 = (int) ((float) local971 * local649);
										if (local971 < 0) {
											local971 = 0;
										} else if (local971 > 255) {
											local971 = 255;
										}
										local977 = (int) ((float) local977 * local649);
										local981 = (int) ((float) local981 * local649);
										if (local977 < 0) {
											local977 = 0;
										} else if (local977 > 255) {
											local977 = 255;
										}
										if (local981 < 0) {
											local981 = 0;
										} else if (local981 > 255) {
											local981 = 255;
										}
										local918 = local981 | local971 << 16 | local977 << 8;
									}
								}
								if (Stream.c()) {
									local169.b((float) local494);
									local169.b((float) (this.method6637(local494, local504) + local530));
									local169.b((float) local504);
									local169.b((float) local494);
									local169.b((float) local504);
									if (this.anIntArrayArrayArray11 != null) {
										local169.b((float) (local279 == null ? 0 : local279[local439] - 1));
									}
									if ((this.anInt4478 & 0x7) != 0) {
										local169.b(local569);
										local169.b(local571);
										local169.b(local573);
									}
								} else {
									local169.a((float) local494);
									local169.a((float) (this.method6637(local494, local504) + local530));
									local169.a((float) local504);
									local169.a((float) local494);
									local169.a((float) local504);
									if (this.anIntArrayArrayArray11 != null) {
										local169.a((float) (local279 == null ? 0 : local279[local439] - 1));
									}
									if ((this.anInt4478 & 0x7) != 0) {
										local169.a(local569);
										local169.a(local571);
										local169.a(local573);
									}
								}
								if (this.aClass12_Sub2_11.anInt7554 == 0) {
									local174.f(local918 | 0xFF000000);
								} else {
									local174.a(local918 | 0xFF000000);
								}
								local1196 = this.anInt4477++;
								local481[local439] = (short) local1196;
								if (local518 != -1) {
									local178[local1196] = local223[local439];
								}
								local197.method7800(local548, new Class1_Sub4(local481[local439]));
							} else {
								local481[local439] = ((Class1_Sub4) local857).aShort7;
								local1196 = local481[local439] & 0xFFFF;
								if (local518 != -1 && local178[local1196].aLong425 > local223[local439].aLong425) {
									local178[local1196] = local223[local439];
								}
							}
							for (local918 = 0; local918 < local429; local918++) {
								local201[local918].method5218(local577, local560, local1196, local774);
							}
							this.anInt4468++;
						}
					}
				}
			}
			for (local207 = 0; local207 < this.anInt4477; local207++) {
				@Pc(1309) Class1_Sub35 local1309 = local178[local207];
				if (local1309 != null) {
					local1309.method5216(local207);
				}
			}
			@Pc(1330) int local1330;
			@Pc(1348) int local1348;
			for (@Pc(1326) int local1326 = 0; super.anInt7983 > local1326; local1326++) {
				for (local1330 = 0; local1330 < super.anInt7984; local1330++) {
					@Pc(1342) short[] local1342 = this.aShortArrayArray3[local1326 + super.anInt7983 * local1330];
					if (local1342 != null) {
						@Pc(1346) int local1346 = 0;
						local1348 = 0;
						while (local1342.length > local1348) {
							@Pc(1357) int local1357 = local1342[local1348++] & 0xFFFF;
							@Pc(1364) int local1364 = local1342[local1348++] & 0xFFFF;
							@Pc(1371) int local1371 = local1342[local1348++] & 0xFFFF;
							@Pc(1375) Class1_Sub35 local1375 = local178[local1357];
							@Pc(1379) Class1_Sub35 local1379 = local178[local1364];
							@Pc(1383) Class1_Sub35 local1383 = local178[local1371];
							@Pc(1385) Class1_Sub35 local1385 = null;
							if (local1375 != null) {
								local1375.method5215(local1346, local1326, local1330);
								local1385 = local1375;
							}
							if (local1379 != null) {
								local1379.method5215(local1346, local1326, local1330);
								if (local1385 == null || local1379.aLong425 < local1385.aLong425) {
									local1385 = local1379;
								}
							}
							if (local1383 != null) {
								local1383.method5215(local1346, local1326, local1330);
								if (local1385 == null || local1383.aLong425 < local1385.aLong425) {
									local1385 = local1383;
								}
							}
							if (local1385 != null) {
								if (local1375 != null) {
									local1385.method5216(local1357);
								}
								if (local1379 != null) {
									local1385.method5216(local1364);
								}
								if (local1383 != null) {
									local1385.method5216(local1371);
								}
								local1385.method5215(local1346, local1326, local1330);
							}
							local1346++;
						}
					}
				}
			}
			local169.a();
			local174.a();
			this.anInterface24_9 = this.aClass12_Sub2_11.method6176(false);
			this.anInterface24_9.method6517(local154, 4, this.anInt4477 * 4);
			this.anInterface24_10 = this.aClass12_Sub2_11.method6176(false);
			this.anInterface24_10.method6517(local164, local131, local131 * this.anInt4477);
			if ((this.anInt4478 & 0x7) == 0) {
				if (this.anIntArrayArrayArray11 == null) {
					this.aClass331_14 = this.aClass12_Sub2_11.method6189(new Class271[] { new Class271(new Class193[] { Static278.aClass193_1, Static278.aClass193_5 }), new Class271(Static278.aClass193_3) });
				} else {
					this.aClass331_14 = this.aClass12_Sub2_11.method6189(new Class271[] { new Class271(new Class193[] { Static278.aClass193_1, Static278.aClass193_5, Static278.aClass193_4 }), new Class271(Static278.aClass193_3) });
				}
			} else if (this.anIntArrayArrayArray11 == null) {
				this.aClass331_14 = this.aClass12_Sub2_11.method6189(new Class271[] { new Class271(new Class193[] { Static278.aClass193_1, Static278.aClass193_5, Static278.aClass193_2 }), new Class271(Static278.aClass193_3) });
			} else {
				this.aClass331_14 = this.aClass12_Sub2_11.method6189(new Class271[] { new Class271(new Class193[] { Static278.aClass193_1, Static278.aClass193_5, Static278.aClass193_4, Static278.aClass193_2 }), new Class271(Static278.aClass193_3) });
			}
			local1330 = 0;
			for (@Pc(1680) int local1680 = 0; local1680 < local107.length; local1680++) {
				if (local107[local1680].anInt6238 > 0) {
					local107[local1330++] = local107[local1680];
				}
			}
			this.aClass1_Sub35Array1 = new Class1_Sub35[local1330];
			@Pc(1706) long[] local1706 = new long[local1330];
			for (local1348 = 0; local1348 < local1330; local1348++) {
				@Pc(1714) Class1_Sub35 local1714 = local107[local1348];
				local1706[local1348] = local1714.aLong425;
				this.aClass1_Sub35Array1[local1348] = local1714;
				local1714.method5217(this.anInt4477);
			}
			Static343.method5090(this.aClass1_Sub35Array1, local1706);
			if (this.aClass125_2 != null) {
				this.aClass125_2.method2702();
			}
		} else {
			this.aClass125_2 = null;
		}
		this.aFloatArrayArray7 = this.aFloatArrayArray5 = this.aFloatArrayArray6 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray12 = this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass356_21 = null;
		this.aClass1_Sub35ArrayArrayArray1 = null;
		this.anIntArrayArrayArray11 = null;
		this.aByteArrayArray15 = null;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3850(arg2, arg0, arg1, arg3, -1, arg4);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6645(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4487 <= 0) {
			return;
		}
		@Pc(19) Interface13 local19 = this.aClass12_Sub2_11.method6200(this.anInt4468);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7648();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass12_Sub2_11.method6160(local36);
				@Pc(48) int local48;
				@Pc(58) int local58;
				@Pc(60) int local60;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = local48 * super.anInt7983 + arg0;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray3[local58];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 < local23) {
											local23 = local90;
										}
										local44.b(local90);
										local21++;
										if (local90 > local25) {
											local25 = local90;
										}
									}
								}
							}
							local58++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = super.anInt7983 * local48 + arg0;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray3[local58];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 < local23) {
											local23 = local90;
										}
										local44.e(local90);
										local21++;
										if (local90 > local25) {
											local25 = local90;
										}
									}
								}
							}
							local58++;
						}
					}
				}
				local44.a();
				if (local19.method7652()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass12_Sub2_11.method6205();
		this.aClass12_Sub2_11.method6225(false);
		this.aClass12_Sub2_11.method6161(false);
		this.aClass12_Sub2_11.method6199(false);
		this.aClass12_Sub2_11.method6184(false);
		this.aClass12_Sub2_11.method6183(0);
		this.aClass12_Sub2_11.method6236(-2, false, false);
		this.aClass12_Sub2_11.method6159(null);
		@Pc(270) Class209_Sub2 local270 = this.aClass12_Sub2_11.method6245();
		@Pc(275) float[] local275 = this.aClass12_Sub2_11.method6190();
		local275[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass12_Sub2_11.anInt7363;
		local275[6] = 0.0F;
		local275[0] = (float) 1024 / ((float) this.aClass12_Sub2_11.anInt7363 * (float) super.anInt7986 * 128.0F);
		local275[5] = (float) 1024 / ((float) this.aClass12_Sub2_11.anInt7472 * (float) super.anInt7986 * 128.0F);
		local275[11] = 0.0F;
		local275[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass12_Sub2_11.anInt7472;
		local275[10] = 1.0F / (this.aFloat108 - this.aFloat109);
		local275[4] = 0.0F;
		local275[2] = 0.0F;
		local275[7] = 0.0F;
		local275[3] = 0.0F;
		local275[8] = 0.0F;
		local275[15] = 1.0F;
		local275[9] = 0.0F;
		local275[1] = 0.0F;
		local275[14] = -this.aFloat109 / (this.aFloat108 - this.aFloat109);
		local270.method4933(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
		this.aClass12_Sub2_11.method6232();
		this.aClass12_Sub2_11.method6275();
		if ((this.anInt4478 & 0x7) == 0) {
			this.aClass12_Sub2_11.method6161(false);
		} else {
			this.aClass12_Sub2_11.method6161(true);
			this.aClass12_Sub2_11.method6171();
		}
		this.aClass12_Sub2_11.method6182(false);
		this.aClass12_Sub2_11.method6276(0, this.anInterface24_10);
		this.aClass12_Sub2_11.method6276(1, this.anInterface24_9);
		this.aClass12_Sub2_11.method6194(this.aClass331_14);
		this.aClass12_Sub2_11.method6274(0, local23, local19, local21 / 3, local25 + 1 - local23, Static312.aClass165_3);
		this.aClass12_Sub2_11.method6182(true);
	}
}
