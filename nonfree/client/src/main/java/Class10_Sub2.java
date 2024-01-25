import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
	private int anInt4305;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
	private int anInt4306;

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
	private int anInt4322;

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "[Lclient!md;")
	private Class1_Sub31[] aClass1_Sub31Array1;

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "Lclient!ql;")
	private Interface15 anInterface15_5;

	@OriginalMember(owner = "client!ih", name = "Y", descriptor = "Lclient!sk;")
	public Class265 aClass265_13;

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
	private int anInt4323;

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "Lclient!ql;")
	private Interface15 anInterface15_6;

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "F")
	private float aFloat91 = -3.4028235E38F;

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "F")
	private float aFloat90 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "Lclient!bu;")
	private final Class38 aClass38_29 = new Class38();

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "[[I")
	private final int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	private final int anInt4301;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "Lclient!cb;")
	public final Class9_Sub1 aClass9_Sub1_6;

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
	public final int anInt4315;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "[[[Lclient!md;")
	private Class1_Sub31[][][] aClass1_Sub31ArrayArrayArray1;

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "[[B")
	private final byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!ih", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ih", name = "eb", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
	private final int anInt4314;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "Lclient!lb;")
	private Class174 aClass174_14;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!ap;")
	private Class15 aClass15_1;

	static {
		new Class114("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!cb;IIII[[I[[II)V")
	public Class10_Sub2(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray33 = arg5;
		this.anInt4301 = super.anInt7411 - 2;
		this.aClass9_Sub1_6 = arg0;
		this.aFloatArrayArray3 = new float[super.anInt7412 + 1][super.anInt7409 + 1];
		this.anInt4315 = arg2;
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aClass1_Sub31ArrayArrayArray1 = new Class1_Sub31[arg3][arg4][];
		this.aByteArrayArray19 = new byte[arg3][arg4];
		this.aFloatArrayArray5 = new float[super.anInt7412 + 1][super.anInt7409 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt7412 + 1][super.anInt7409 + 1];
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray4 = new short[arg3 * arg4][];
		this.anInt4314 = 0x1 << this.anInt4301;
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		for (@Pc(123) int local123 = 0; local123 <= super.anInt7409; local123++) {
			for (@Pc(127) int local127 = 0; super.anInt7412 >= local127; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray33[local127][local123];
				if (this.aFloat91 < (float) local136) {
					this.aFloat91 = local136;
				}
				if ((float) local136 < this.aFloat90) {
					this.aFloat90 = local136;
				}
				if (local127 > 0 && local123 > 0 && local127 < super.anInt7412 && super.anInt7409 > local123) {
					@Pc(188) int local188 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(204) int local204 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(223) float local223 = (float) (1.0D / Math.sqrt((double) (local204 * local204 + arg7 * 4 * arg7 + local188 * local188)));
					this.aFloatArrayArray5[local127][local123] = local223 * (float) local188;
					this.aFloatArrayArray4[local127][local123] = local223 * (float) (-arg7 * 2);
					this.aFloatArrayArray3[local127][local123] = (float) local204 * local223;
				}
			}
		}
		this.aFloat91++;
		this.aFloat90--;
		this.aClass174_14 = new Class174(128);
		if ((this.anInt4315 & 0x10) != 0) {
			this.aClass15_1 = new Class15(this.aClass9_Sub1_6, this);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	@Override
	public void method6333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([[ZIIIIIZ)V")
	private void method3766(@OriginalArg(0) boolean[][] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass1_Sub31Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 + arg2 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (local15 > Static185.anIntArray301.length) {
			Static185.anIntArray301 = new int[local15];
		}
		@Pc(31) int local31 = arg1 - arg2;
		@Pc(33) int local33 = local31;
		if (local31 < 0) {
			local31 = 0;
		}
		@Pc(42) int local42 = arg3 - arg2;
		@Pc(44) int local44 = local42;
		if (local42 < 0) {
			local42 = 0;
		}
		@Pc(52) int local52 = arg2 + arg1;
		if (local52 > super.anInt7412 - 1) {
			local52 = super.anInt7412 - 1;
		}
		@Pc(71) int local71 = arg2 + arg3;
		if (super.anInt7409 - 1 < local71) {
			local71 = super.anInt7409 - 1;
		}
		Static339.anInt6343 = 0;
		for (@Pc(86) int local86 = local31; local86 <= local52; local86++) {
			@Pc(95) boolean[] local95 = arg0[local86 - local33];
			for (@Pc(97) int local97 = local42; local97 <= local71; local97++) {
				if (local95[local97 - local44]) {
					Static185.anIntArray301[Static339.anInt6343++] = local86 + super.anInt7412 * local97;
				}
			}
		}
		this.aClass9_Sub1_6.method7649();
		this.aClass9_Sub1_6.method7693();
		this.aClass9_Sub1_6.method7738((this.anInt4315 & 0x7) != 0);
		this.aClass9_Sub1_6.method7732(false, -1, false);
		this.aClass9_Sub1_6.method7697(this.anInterface15_6, 0);
		for (@Pc(188) int local188 = 0; local188 < this.aClass1_Sub31Array1.length; local188++) {
			this.aClass1_Sub31Array1[local188].method4975(Static339.anInt6343, Static185.anIntArray301);
		}
		@Pc(209) Class22_Sub3 local209 = this.aClass9_Sub1_6.method7760();
		local209.oa(0, -1, 0);
		this.aClass9_Sub1_6.method7656();
		if (!this.aClass38_29.method1414()) {
			@Pc(227) int local227 = this.aClass9_Sub1_6.anInt9212;
			@Pc(231) int local231 = this.aClass9_Sub1_6.anInt9215;
			this.aClass9_Sub1_6.E(0, local231, this.aClass9_Sub1_6.anInt9197);
			this.aClass9_Sub1_6.method7738(false);
			this.aClass9_Sub1_6.method7724(false);
			this.aClass9_Sub1_6.method7730(128);
			this.aClass9_Sub1_6.method7732(false, -2, false);
			this.aClass9_Sub1_6.method7712(this.aClass9_Sub1_6.anInterface14_3);
			this.aClass9_Sub1_6.method7723(Static453.aClass295_5, Static74.aClass295_2);
			this.aClass9_Sub1_6.method7678(Static349.aClass122_3, 0);
			this.aClass9_Sub1_6.method7735(0, Static43.aClass122_1);
			for (@Pc(293) Class1 local293 = this.aClass38_29.method1419(); local293 != null; local293 = this.aClass38_29.method1415()) {
				@Pc(298) Class1_Sub30 local298 = (Class1_Sub30) local293;
				local298.method4415(arg3, arg0, arg2, arg1);
			}
			this.aClass9_Sub1_6.method7678(Static197.aClass122_2, 0);
			this.aClass9_Sub1_6.method7735(0, Static197.aClass122_2);
			this.aClass9_Sub1_6.method7712(null);
			this.aClass9_Sub1_6.E(local227, local231, this.aClass9_Sub1_6.anInt9197);
		}
		if (this.aClass15_1 != null) {
			this.aClass9_Sub1_6.method7697(this.anInterface15_6, 0);
			this.aClass9_Sub1_6.method7697(this.anInterface15_5, 1);
			this.aClass9_Sub1_6.method7664(this.aClass265_13);
			this.aClass15_1.method822(arg3, arg1, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ih", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt7411;
		@Pc(13) int local13 = arg1 >> super.anInt7411;
		if (local8 < 0 || local13 < 0 || super.anInt7412 - 1 < local8 || local13 > super.anInt7409 - 1) {
			return 0;
		}
		@Pc(41) int local41 = super.anInt7410 - 1 & arg0;
		@Pc(48) int local48 = super.anInt7410 - 1 & arg1;
		@Pc(75) int local75 = local41 * this.anIntArrayArray33[local8 + 1][local13] + this.anIntArrayArray33[local8][local13] * (super.anInt7410 - local41) >> super.anInt7411;
		@Pc(106) int local106 = (super.anInt7410 - local41) * this.anIntArrayArray33[local8][local13 + 1] + local41 * this.anIntArrayArray33[local8 + 1][local13 + 1] >> super.anInt7411;
		return (super.anInt7410 - local48) * local75 + local48 * local106 >> super.anInt7411;
	}

	@OriginalMember(owner = "client!ih", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt7412][super.anInt7409][];
		}
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt7412][super.anInt7409][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray12[arg0][arg1] = arg4;
		this.anIntArrayArrayArray10[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub31[] local88 = this.aClass1_Sub31ArrayArrayArray1[arg0][arg1] = new Class1_Sub31[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class1 local125;
			for (local125 = this.aClass174_14.method4422(local119); local125 != null; local125 = this.aClass174_14.method4424()) {
				@Pc(130) Class1_Sub31 local130 = (Class1_Sub31) local125;
				if (arg8[local90] == local130.anInt5737 && local130.aFloat110 == (float) arg9[local90] && arg10 == local130.anInt5731 && local130.anInt5740 == arg11 && local130.anInt5742 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub31(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass174_14.method4420(local88[local90], local119);
			} else {
				local88[local90] = (Class1_Sub31) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray19[arg0][arg1] = (byte) (this.aByteArrayArray19[arg0][arg1] | 0x1);
		}
		if (this.anInt4323 < arg6.length) {
			this.anInt4323 = arg6.length;
		}
		this.anInt4322 += arg6.length;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILclient!ch;I)V")
	private void method3767(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray7[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray12[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (Static42.anIntArray130.length < local22) {
			Static438.anIntArray202 = new int[local22];
			Static42.anIntArray130 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static42.anIntArray130[local34] = local12[local34] >> this.aClass9_Sub1_6.anInt9216;
			Static438.anIntArray202[local34] = local19[local34] >> this.aClass9_Sub1_6.anInt9216;
		}
		@Pc(62) int local62 = 0;
		while (local62 < local22) {
			@Pc(68) int local68 = Static42.anIntArray130[local62];
			@Pc(73) int local73 = Static438.anIntArray202[local62++];
			@Pc(77) int local77 = Static42.anIntArray130[local62];
			@Pc(82) int local82 = Static438.anIntArray202[local62++];
			@Pc(86) int local86 = Static42.anIntArray130[local62];
			@Pc(91) int local91 = Static438.anIntArray202[local62++];
			if (-((local82 - local73) * (local86 + -local77)) + (local68 - local77) * (local82 - local91) > 0) {
				arg1.method1641(local86, local73, local91, local68, local77, local82);
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt4322 <= 0) {
			this.aClass15_1 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt7412 + 1][super.anInt7409 + 1];
			for (@Pc(28) int local28 = 1; local28 < super.anInt7412; local28++) {
				for (@Pc(32) int local32 = 1; local32 < super.anInt7409; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray20[local28][local32 - 1] >> 2) + (this.aByteArrayArray20[local28 - 1][local32] >> 2) + (this.aByteArrayArray20[local28 + 1][local32] >> 3) + (this.aByteArrayArray20[local28][local32 + 1] >> 3) + (this.aByteArrayArray20[local28][local32] >> 1));
				}
			}
			@Pc(112) Class1_Sub31[] local112 = new Class1_Sub31[this.aClass174_14.method4426()];
			this.aClass174_14.method4427(local112);
			for (@Pc(120) int local120 = 0; local120 < local112.length; local120++) {
				local112[local120].method4969(this.anInt4322);
			}
			@Pc(140) int local140 = 20;
			if (this.anIntArrayArrayArray9 != null) {
				local140 += 4;
			}
			if ((this.anInt4315 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(163) NativeHeapBuffer local163 = this.aClass9_Sub1_6.aNativeHeap6.a(this.anInt4322 * 4, false);
			@Pc(173) NativeHeapBuffer local173 = this.aClass9_Sub1_6.aNativeHeap6.a(this.anInt4322 * local140, false);
			@Pc(178) Stream local178 = new Stream(local173);
			@Pc(183) Stream local183 = new Stream(local163);
			@Pc(187) Class1_Sub31[] local187 = new Class1_Sub31[this.anInt4322];
			@Pc(194) int local194 = Static216.method3865(this.anInt4322 / 4);
			if (local194 < 1) {
				local194 = 1;
			}
			@Pc(206) Class174 local206 = new Class174(local194);
			@Pc(210) Class1_Sub31[] local210 = new Class1_Sub31[this.anInt4323];
			@Pc(216) int local216;
			for (@Pc(212) int local212 = 0; super.anInt7412 > local212; local212++) {
				for (local216 = 0; super.anInt7409 > local216; local216++) {
					if (this.anIntArrayArrayArray10[local212][local216] != null) {
						@Pc(232) Class1_Sub31[] local232 = this.aClass1_Sub31ArrayArrayArray1[local212][local216];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray7[local212][local216];
						@Pc(246) int[] local246 = this.anIntArrayArrayArray12[local212][local216];
						@Pc(253) int[] local253 = this.anIntArrayArrayArray8[local212][local216];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray10[local212][local216];
						@Pc(272) int[] local272 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local212][local216];
						@Pc(284) int[] local284 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local212][local216];
						if (local253 == null) {
							local253 = local260;
						}
						@Pc(295) float local295 = this.aFloatArrayArray5[local212][local216];
						@Pc(302) float local302 = this.aFloatArrayArray4[local212][local216];
						@Pc(309) float local309 = this.aFloatArrayArray3[local212][local216];
						@Pc(318) float local318 = this.aFloatArrayArray5[local212][local216 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray4[local212][local216 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray3[local212][local216 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray5[local212 + 1][local216 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray4[local212 + 1][local216 + 1];
						@Pc(369) float local369 = this.aFloatArrayArray3[local212 + 1][local216 + 1];
						@Pc(378) float local378 = this.aFloatArrayArray5[local212 + 1][local216];
						@Pc(387) float local387 = this.aFloatArrayArray4[local212 + 1][local216];
						@Pc(396) float local396 = this.aFloatArrayArray3[local212 + 1][local216];
						@Pc(404) int local404 = local26[local212][local216] & 0xFF;
						@Pc(414) int local414 = local26[local212][local216 + 1] & 0xFF;
						@Pc(426) int local426 = local26[local212 + 1][local216 + 1] & 0xFF;
						@Pc(436) int local436 = local26[local212 + 1][local216] & 0xFF;
						@Pc(438) int local438 = 0;
						@Pc(448) int local448;
						label357: for (@Pc(440) int local440 = 0; local440 < local260.length; local440++) {
							@Pc(446) Class1_Sub31 local446 = local232[local440];
							for (local448 = 0; local448 < local438; local448++) {
								if (local210[local448] == local446) {
									continue label357;
								}
							}
							local210[local438++] = local446;
						}
						@Pc(489) short[] local489 = this.aShortArrayArray4[local216 * super.anInt7412 + local212] = new short[local260.length];
						for (local448 = 0; local448 < local260.length; local448++) {
							@Pc(503) int local503 = (local212 << super.anInt7411) + local239[local448];
							@Pc(513) int local513 = (local216 << super.anInt7411) + local246[local448];
							@Pc(518) int local518 = local503 >> this.anInt4301;
							@Pc(523) int local523 = local513 >> this.anInt4301;
							@Pc(527) int local527 = local260[local448];
							@Pc(531) int local531 = local253[local448];
							@Pc(539) int local539 = local272 == null ? 0 : local272[local448];
							@Pc(557) long local557 = (long) local523 | (long) (local518 << 16) | (long) local527 << 32 | (long) local531 << 48;
							@Pc(561) int local561 = local239[local448];
							@Pc(565) int local565 = local246[local448];
							@Pc(567) byte local567 = 74;
							@Pc(569) int local569 = 0;
							@Pc(584) float local584;
							@Pc(578) float local578;
							@Pc(586) float local586;
							@Pc(685) float local685;
							@Pc(582) int local582;
							if (local561 == 0 && local565 == 0) {
								local578 = local302;
								local582 = local567 - local404;
								local584 = local295;
								local586 = local309;
							} else if (local561 == 0 && local565 == super.anInt7410) {
								local578 = local327;
								local586 = local336;
								local584 = local318;
								local582 = local567 - local414;
							} else if (super.anInt7410 == local561 && super.anInt7410 == local565) {
								local586 = local369;
								local584 = local347;
								local578 = local358;
								local582 = local567 - local426;
							} else if (local561 == super.anInt7410 && local565 == 0) {
								local578 = local387;
								local584 = local378;
								local586 = local396;
								local582 = local567 - local436;
							} else {
								@Pc(661) float local661 = (float) local561 / (float) super.anInt7410;
								@Pc(668) float local668 = (float) local565 / (float) super.anInt7410;
								@Pc(677) float local677 = local295 + local661 * (local378 - local295);
								local685 = (local387 - local302) * local661 + local302;
								@Pc(693) float local693 = local309 + (local396 - local309) * local661;
								@Pc(701) float local701 = (local347 - local318) * local661 + local318;
								@Pc(709) float local709 = local327 + local661 * (local358 - local327);
								local584 = local677 + local668 * (local701 - local677);
								local578 = (local709 - local685) * local668 + local685;
								@Pc(735) float local735 = local336 + (local369 - local336) * local661;
								local586 = local693 + local668 * (local735 - local693);
								@Pc(756) int local756 = (local561 * (local436 - local404) >> super.anInt7411) + local404;
								@Pc(767) int local767 = local414 + (local561 * (local426 - local414) >> super.anInt7411);
								local582 = local567 - (local565 * (local767 - local756) >> super.anInt7411) - local756;
							}
							@Pc(783) float local783 = 1.0F;
							if (local527 != -1) {
								@Pc(795) int local795 = (local527 & 0x7F) * local582 >> 7;
								if (local795 < 2) {
									local795 = 2;
								} else if (local795 > 126) {
									local795 = 126;
								}
								if ((this.anInt4315 & 0x7) == 0) {
									local783 = local586 * this.aClass9_Sub1_6.aFloatArray75[2] + local584 * this.aClass9_Sub1_6.aFloatArray75[0] + this.aClass9_Sub1_6.aFloatArray75[1] * local578;
									local783 = local783 * (local783 > 0.0F ? this.aClass9_Sub1_6.aFloat192 : this.aClass9_Sub1_6.aFloat197) + this.aClass9_Sub1_6.aFloat202;
								}
								local569 = Static392.anIntArray516[local795 | local527 & 0xFF80];
							}
							@Pc(864) Class1 local864 = null;
							if ((this.anInt4314 - 1 & local503) == 0 && (local513 & this.anInt4314 - 1) == 0) {
								local864 = local206.method4422(local557);
							}
							@Pc(897) int local897;
							@Pc(927) int local927;
							if (local864 == null) {
								if (local527 == local531) {
									local927 = local569;
								} else {
									@Pc(937) int local937 = (local531 & 0x7F) * local582 >> 7;
									if (local937 < 2) {
										local937 = 2;
									} else if (local937 > 126) {
										local937 = 126;
									}
									local927 = Static392.anIntArray516[local531 & 0xFF80 | local937];
									if ((this.anInt4315 & 0x7) == 0) {
										local685 = local586 * this.aClass9_Sub1_6.aFloatArray75[2] + local578 * this.aClass9_Sub1_6.aFloatArray75[1] + this.aClass9_Sub1_6.aFloatArray75[0] * local584;
										local685 = this.aClass9_Sub1_6.aFloat202 + local783 * (local783 > 0.0F ? this.aClass9_Sub1_6.aFloat192 : this.aClass9_Sub1_6.aFloat197);
										@Pc(1010) int local1010 = local927 >> 16 & 0xFF;
										@Pc(1016) int local1016 = local927 >> 8 & 0xFF;
										local1010 = (int) ((float) local1010 * local685);
										@Pc(1026) int local1026 = local927 & 0xFF;
										local1016 = (int) ((float) local1016 * local685);
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										if (local1016 < 0) {
											local1016 = 0;
										} else if (local1016 > 255) {
											local1016 = 255;
										}
										local1026 = (int) ((float) local1026 * local685);
										if (local1026 < 0) {
											local1026 = 0;
										} else if (local1026 > 255) {
											local1026 = 255;
										}
										local927 = local1010 << 16 | local1016 << 8 | local1026;
									}
								}
								if (Stream.c()) {
									local178.a((float) local503);
									local178.a((float) (local539 + this.aa(local503, local513)));
									local178.a((float) local513);
									local178.a((float) local503);
									local178.a((float) local513);
									if (this.anIntArrayArrayArray9 != null) {
										local178.a((float) (local284 == null ? 0 : local284[local448] - 1));
									}
									if ((this.anInt4315 & 0x7) != 0) {
										local178.a(local584);
										local178.a(local578);
										local178.a(local586);
									}
								} else {
									local178.b((float) local503);
									local178.b((float) (local539 + this.aa(local503, local513)));
									local178.b((float) local513);
									local178.b((float) local503);
									local178.b((float) local513);
									if (this.anIntArrayArrayArray9 != null) {
										local178.b((float) (local284 == null ? 0 : local284[local448] - 1));
									}
									if ((this.anInt4315 & 0x7) != 0) {
										local178.b(local584);
										local178.b(local578);
										local178.b(local586);
									}
								}
								if (this.aClass9_Sub1_6.anInt9206 == 0) {
									local183.e(local927 | 0xFF000000);
								} else {
									local183.a(local927 | 0xFF000000);
								}
								local897 = this.anInt4305++;
								local489[local448] = (short) local897;
								if (local527 != -1) {
									local187[local897] = local232[local448];
								}
								local206.method4420(new Class1_Sub7(local489[local448]), local557);
							} else {
								local489[local448] = ((Class1_Sub7) local864).aShort16;
								local897 = local489[local448] & 0xFFFF;
								if (local527 != -1 && local187[local897].aLong244 > local232[local448].aLong244) {
									local187[local897] = local232[local448];
								}
							}
							for (local927 = 0; local927 < local438; local927++) {
								local210[local927].method4973(local897, local582, local783, local569);
							}
							this.anInt4306++;
						}
					}
				}
			}
			for (local216 = 0; local216 < this.anInt4305; local216++) {
				@Pc(1301) Class1_Sub31 local1301 = local187[local216];
				if (local1301 != null) {
					local1301.method4971(local216);
				}
			}
			@Pc(1318) int local1318;
			@Pc(1336) int local1336;
			for (@Pc(1314) int local1314 = 0; local1314 < super.anInt7412; local1314++) {
				for (local1318 = 0; super.anInt7409 > local1318; local1318++) {
					@Pc(1330) short[] local1330 = this.aShortArrayArray4[local1314 + super.anInt7412 * local1318];
					if (local1330 != null) {
						@Pc(1334) int local1334 = 0;
						local1336 = 0;
						while (local1336 < local1330.length) {
							@Pc(1345) int local1345 = local1330[local1336++] & 0xFFFF;
							@Pc(1352) int local1352 = local1330[local1336++] & 0xFFFF;
							@Pc(1359) int local1359 = local1330[local1336++] & 0xFFFF;
							@Pc(1363) Class1_Sub31 local1363 = local187[local1345];
							@Pc(1367) Class1_Sub31 local1367 = local187[local1352];
							@Pc(1371) Class1_Sub31 local1371 = local187[local1359];
							@Pc(1373) Class1_Sub31 local1373 = null;
							if (local1363 != null) {
								local1363.method4970(local1314, local1334, local1318);
								local1373 = local1363;
							}
							if (local1367 != null) {
								local1367.method4970(local1314, local1334, local1318);
								if (local1373 == null || local1373.aLong244 > local1367.aLong244) {
									local1373 = local1367;
								}
							}
							if (local1371 != null) {
								local1371.method4970(local1314, local1334, local1318);
								if (local1373 == null || local1371.aLong244 < local1373.aLong244) {
									local1373 = local1371;
								}
							}
							if (local1373 != null) {
								if (local1363 != null) {
									local1373.method4971(local1345);
								}
								if (local1367 != null) {
									local1373.method4971(local1352);
								}
								if (local1371 != null) {
									local1373.method4971(local1359);
								}
								local1373.method4970(local1314, local1334, local1318);
							}
							local1334++;
						}
					}
				}
			}
			local178.b();
			local183.b();
			this.anInterface15_5 = this.aClass9_Sub1_6.method7707(false);
			this.anInterface15_5.method6274(4, this.anInt4305 * 4, local163);
			this.anInterface15_6 = this.aClass9_Sub1_6.method7707(false);
			this.anInterface15_6.method6274(local140, local140 * this.anInt4305, local173);
			if ((this.anInt4315 & 0x7) == 0) {
				if (this.anIntArrayArrayArray9 == null) {
					this.aClass265_13 = this.aClass9_Sub1_6.method7729(new Class317[] { new Class317(new Class245[] { Static397.aClass245_1, Static397.aClass245_5 }), new Class317(Static397.aClass245_3) });
				} else {
					this.aClass265_13 = this.aClass9_Sub1_6.method7729(new Class317[] { new Class317(new Class245[] { Static397.aClass245_1, Static397.aClass245_5, Static397.aClass245_4 }), new Class317(Static397.aClass245_3) });
				}
			} else if (this.anIntArrayArrayArray9 == null) {
				this.aClass265_13 = this.aClass9_Sub1_6.method7729(new Class317[] { new Class317(new Class245[] { Static397.aClass245_1, Static397.aClass245_5, Static397.aClass245_2 }), new Class317(Static397.aClass245_3) });
			} else {
				this.aClass265_13 = this.aClass9_Sub1_6.method7729(new Class317[] { new Class317(new Class245[] { Static397.aClass245_1, Static397.aClass245_5, Static397.aClass245_4, Static397.aClass245_2 }), new Class317(Static397.aClass245_3) });
			}
			local1318 = 0;
			for (@Pc(1669) int local1669 = 0; local1669 < local112.length; local1669++) {
				if (local112[local1669].anInt5743 > 0) {
					local112[local1318++] = local112[local1669];
				}
			}
			this.aClass1_Sub31Array1 = new Class1_Sub31[local1318];
			@Pc(1698) long[] local1698 = new long[local1318];
			for (local1336 = 0; local1336 < local1318; local1336++) {
				@Pc(1706) Class1_Sub31 local1706 = local112[local1336];
				local1698[local1336] = local1706.aLong244;
				this.aClass1_Sub31Array1[local1336] = local1706;
				local1706.method4974(this.anInt4305);
			}
			Static46.method1411(local1698, this.aClass1_Sub31Array1);
			if (this.aClass15_1 != null) {
				this.aClass15_1.method828();
			}
		}
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray9 = null;
		this.aByteArrayArray20 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray7 = this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass1_Sub31ArrayArrayArray1 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
		this.aClass174_14 = null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6337(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4322 <= 0) {
			return;
		}
		@Pc(16) Interface1 local16 = this.aClass9_Sub1_6.method7769(this.anInt4306);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method7519();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass9_Sub1_6.method7677(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(74) short[] local74;
				@Pc(78) int local78;
				@Pc(86) int local86;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = local45 * super.anInt7412 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray4[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										local18++;
										if (local20 > local86) {
											local20 = local86;
										}
										if (local86 > local22) {
											local22 = local86;
										}
										local41.c(local86);
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt7412 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray4[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										if (local86 < local20) {
											local20 = local86;
										}
										if (local86 > local22) {
											local22 = local86;
										}
										local41.f(local86);
										local18++;
									}
								}
							}
							local54++;
						}
					}
				}
				local41.b();
				if (local16.method7521()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass9_Sub1_6.method7766();
		this.aClass9_Sub1_6.method7747(false);
		this.aClass9_Sub1_6.method7738(false);
		this.aClass9_Sub1_6.method7737(false);
		this.aClass9_Sub1_6.method7724(false);
		this.aClass9_Sub1_6.method7730(0);
		this.aClass9_Sub1_6.method7732(false, -2, false);
		this.aClass9_Sub1_6.method7712(null);
		@Pc(270) Class22_Sub3 local270 = this.aClass9_Sub1_6.method7760();
		@Pc(275) float[] local275 = this.aClass9_Sub1_6.method7676();
		local275[8] = 0.0F;
		local275[11] = 0.0F;
		local275[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass9_Sub1_6.anInt9150) - 1.0F;
		local275[15] = 1.0F;
		local275[6] = 0.0F;
		local275[10] = 1.0F / (this.aFloat91 - this.aFloat90);
		local275[1] = 0.0F;
		local275[14] = -this.aFloat90 / (this.aFloat91 - this.aFloat90);
		local275[4] = 0.0F;
		local275[3] = 0.0F;
		local275[0] = (float) 1024 / ((float) this.aClass9_Sub1_6.anInt9150 * (float) super.anInt7410 * 128.0F);
		local275[2] = 0.0F;
		local275[7] = 0.0F;
		local275[9] = 0.0F;
		local275[5] = (float) 1024 / ((float) this.aClass9_Sub1_6.anInt9085 * (float) super.anInt7410 * 128.0F);
		local275[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass9_Sub1_6.anInt9085;
		local270.method5967(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass9_Sub1_6.method7681();
		this.aClass9_Sub1_6.method7656();
		if ((this.anInt4315 & 0x7) == 0) {
			this.aClass9_Sub1_6.method7738(false);
		} else {
			this.aClass9_Sub1_6.method7738(true);
			this.aClass9_Sub1_6.method7682();
		}
		this.aClass9_Sub1_6.method7653(false);
		this.aClass9_Sub1_6.method7697(this.anInterface15_6, 0);
		this.aClass9_Sub1_6.method7697(this.anInterface15_5, 1);
		this.aClass9_Sub1_6.method7664(this.aClass265_13);
		this.aClass9_Sub1_6.method7658(Static29.aClass102_1, local20, 0, local22 + 1 - local20, local18 / 3, local16);
		this.aClass9_Sub1_6.method7653(true);
	}

	@OriginalMember(owner = "client!ih", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass15_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass9_Sub1_6.anInt9211 >> 8) >> this.aClass9_Sub1_6.anInt9216;
			@Pc(39) int local39 = arg3 - (this.aClass9_Sub1_6.anInt9200 * arg2 >> 8) >> this.aClass9_Sub1_6.anInt9216;
			this.aClass15_1.method825(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!nm;[I)V")
	@Override
	public void method6335(@OriginalArg(0) Class1_Sub27 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass38_29.method1426(new Class1_Sub30(this.aClass9_Sub1_6, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method6336(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass15_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass9_Sub1_6.anInt9211 * arg2 >> 8) >> this.aClass9_Sub1_6.anInt9216;
			@Pc(39) int local39 = arg3 - (this.aClass9_Sub1_6.anInt9200 * arg2 >> 8) >> this.aClass9_Sub1_6.anInt9216;
			return this.aClass15_1.method823(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass15_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass9_Sub1_6.anInt9211 >> 8) >> this.aClass9_Sub1_6.anInt9216;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass9_Sub1_6.anInt9200 >> 8) >> this.aClass9_Sub1_6.anInt9216;
			this.aClass15_1.method830(arg0, local38, local23);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3766(arg3, arg0, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!ih", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray33[arg0][arg1];
	}

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class1_Sub1_Sub4 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt7410 >> this.aClass9_Sub1_6.anInt9216;
		@Pc(27) Class1_Sub1_Sub4_Sub1 local27 = (Class1_Sub1_Sub4_Sub1) arg2;
		@Pc(37) Class1_Sub1_Sub4_Sub1 local37;
		if (local27 != null && local27.method1637(local24, local24)) {
			local37 = local27;
			local27.method1635();
		} else {
			local37 = new Class1_Sub1_Sub4_Sub1(this.aClass9_Sub1_6, local24, local24);
		}
		local37.method1642(0, 0, local24, local24);
		this.method3767(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}
}
