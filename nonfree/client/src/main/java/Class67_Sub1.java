import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
	private int anInt1706;

	@OriginalMember(owner = "client!daa", name = "K", descriptor = "I")
	private int anInt1717;

	@OriginalMember(owner = "client!daa", name = "X", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!daa", name = "bb", descriptor = "Lclient!nba;")
	private Interface16 anInterface16_3;

	@OriginalMember(owner = "client!daa", name = "db", descriptor = "Lclient!nba;")
	private Interface16 anInterface16_4;

	@OriginalMember(owner = "client!daa", name = "eb", descriptor = "I")
	private int anInt1727;

	@OriginalMember(owner = "client!daa", name = "gb", descriptor = "I")
	private int anInt1728;

	@OriginalMember(owner = "client!daa", name = "jb", descriptor = "Lclient!mq;")
	public Class199 aClass199_1;

	@OriginalMember(owner = "client!daa", name = "kb", descriptor = "[Lclient!bl;")
	private Class2_Sub6[] aClass2_Sub6Array1;

	@OriginalMember(owner = "client!daa", name = "r", descriptor = "F")
	private float aFloat31 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!daa", name = "U", descriptor = "F")
	private float aFloat32 = -3.4028235E38F;

	@OriginalMember(owner = "client!daa", name = "s", descriptor = "Lclient!ae;")
	private final Class8 aClass8_7 = new Class8();

	@OriginalMember(owner = "client!daa", name = "D", descriptor = "Lclient!en;")
	public final Class100_Sub1 aClass100_Sub1_5;

	@OriginalMember(owner = "client!daa", name = "G", descriptor = "I")
	private final int anInt1714;

	@OriginalMember(owner = "client!daa", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
	public final int anInt1720;

	@OriginalMember(owner = "client!daa", name = "V", descriptor = "I")
	private final int anInt1723;

	@OriginalMember(owner = "client!daa", name = "P", descriptor = "[[[Lclient!bl;")
	private Class2_Sub6[][][] aClass2_Sub6ArrayArrayArray1;

	@OriginalMember(owner = "client!daa", name = "z", descriptor = "[[B")
	private final byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!daa", name = "ib", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!daa", name = "O", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!daa", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!daa", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!daa", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!daa", name = "mb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!daa", name = "T", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!daa", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!daa", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!daa", name = "lb", descriptor = "Lclient!il;")
	private Class162 lb;

	@OriginalMember(owner = "client!daa", name = "w", descriptor = "Lclient!tea;")
	private Class316 aClass316_1;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!en;IIII[[I[[II)V")
	public Class67_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass100_Sub1_5 = arg0;
		this.anInt1714 = super.anInt8108 - 2;
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anInt1720 = arg2;
		this.anInt1723 = 0x1 << this.anInt1714;
		this.aClass2_Sub6ArrayArrayArray1 = new Class2_Sub6[arg3][arg4][];
		this.aByteArrayArray3 = new byte[arg3][arg4];
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.aFloatArrayArray5 = new float[super.anInt8111 + 1][super.anInt8110 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt8111 + 1][super.anInt8110 + 1];
		this.aFloatArrayArray6 = new float[super.anInt8111 + 1][super.anInt8110 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt8110; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt8111 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray57[local125][local121];
				if (this.aFloat31 > (float) local134) {
					this.aFloat31 = local134;
				}
				if (this.aFloat32 < (float) local134) {
					this.aFloat32 = local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt8111 && local121 < super.anInt8110) {
					@Pc(187) int local187 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(204) int local204 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(223) float local223 = (float) (1.0D / Math.sqrt((double) (local204 * local204 + arg7 * arg7 * 4 + local187 * local187)));
					this.aFloatArrayArray6[local125][local121] = local223 * (float) local187;
					this.aFloatArrayArray5[local125][local121] = local223 * (float) (-arg7 * 2);
					this.aFloatArrayArray4[local125][local121] = local223 * (float) local204;
				}
			}
		}
		this.aFloat32++;
		this.aFloat31--;
		this.lb = new Class162(128);
		if ((this.anInt1720 & 0x10) != 0) {
			this.aClass316_1 = new Class316(this.aClass100_Sub1_5, this);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIZII[[ZI)V")
	private void method1248(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4, @OriginalArg(6) int arg5) {
		if (this.aClass2_Sub6Array1 == null) {
			return;
		}
		@Pc(25) int local25 = arg5 + arg5 + 1;
		@Pc(29) int local29 = local25 * local25;
		if (Static528.anIntArray632.length < local29) {
			Static528.anIntArray632 = new int[local29];
		}
		@Pc(45) int local45 = arg2 - arg5;
		@Pc(47) int local47 = local45;
		if (local45 < 0) {
			local45 = 0;
		}
		@Pc(59) int local59 = arg0 - arg5;
		@Pc(61) int local61 = local59;
		if (local59 < 0) {
			local59 = 0;
		}
		@Pc(72) int local72 = arg2 + arg5;
		if (local72 > super.anInt8111 - 1) {
			local72 = super.anInt8111 - 1;
		}
		@Pc(92) int local92 = arg0 + arg5;
		Static426.anInt7281 = 0;
		if (local92 > super.anInt8110 - 1) {
			local92 = super.anInt8110 - 1;
		}
		for (@Pc(111) int local111 = local45; local111 <= local72; local111++) {
			@Pc(120) boolean[] local120 = arg4[local111 - local47];
			for (@Pc(122) int local122 = local59; local122 <= local92; local122++) {
				if (local120[local122 - local61]) {
					Static528.anIntArray632[Static426.anInt7281++] = local122 * super.anInt8111 + local111;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass100_Sub1_5.method4828();
		} else {
			this.aClass100_Sub1_5.method4844((float) arg3);
			this.aClass100_Sub1_5.method4833();
		}
		this.aClass100_Sub1_5.method4799();
		this.aClass100_Sub1_5.method4774((this.anInt1720 & 0x7) != 0);
		this.aClass100_Sub1_5.method4761(-1, false, false);
		this.aClass100_Sub1_5.method4863(this.anInterface16_3, 0);
		for (@Pc(214) int local214 = 0; local214 < this.aClass2_Sub6Array1.length; local214++) {
			this.aClass2_Sub6Array1[local214].method713(Static528.anIntArray632, Static426.anInt7281);
		}
		@Pc(237) Class68_Sub2 local237 = this.aClass100_Sub1_5.method4878();
		local237.NA(0, -1, 0);
		this.aClass100_Sub1_5.method4858();
		if (!this.aClass8_7.method219()) {
			@Pc(255) int local255 = this.aClass100_Sub1_5.anInt5779;
			@Pc(259) int local259 = this.aClass100_Sub1_5.anInt5789;
			this.aClass100_Sub1_5.pa(0, local259, this.aClass100_Sub1_5.anInt5782);
			this.aClass100_Sub1_5.method4774(false);
			this.aClass100_Sub1_5.method4871(false);
			this.aClass100_Sub1_5.method4801(128);
			this.aClass100_Sub1_5.method4761(-2, false, false);
			this.aClass100_Sub1_5.method4876(this.aClass100_Sub1_5.anInterface10_3);
			this.aClass100_Sub1_5.method4797(Static458.aClass236_4, Static291.aClass236_2);
			this.aClass100_Sub1_5.method4883(0, Static224.aClass119_18);
			this.aClass100_Sub1_5.method4816(0, Static113.aClass119_11);
			for (@Pc(321) Class2 local321 = this.aClass8_7.method210(); local321 != null; local321 = this.aClass8_7.method218()) {
				@Pc(326) Class2_Sub38 local326 = (Class2_Sub38) local321;
				local326.method6109(arg0, arg5, arg4, arg2);
			}
			this.aClass100_Sub1_5.method4883(0, Static325.aClass119_44);
			this.aClass100_Sub1_5.method4816(0, Static325.aClass119_44);
			this.aClass100_Sub1_5.method4876(null);
			this.aClass100_Sub1_5.pa(local255, local259, this.aClass100_Sub1_5.anInt5782);
		}
		if (this.aClass316_1 == null) {
			return;
		}
		this.aClass100_Sub1_5.method4863(this.anInterface16_3, 0);
		this.aClass100_Sub1_5.method4863(this.anInterface16_4, 1);
		this.aClass100_Sub1_5.method4757(this.aClass199_1);
		this.aClass316_1.method7035(arg1, arg5, arg2, arg0, arg4);
		return;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
	@Override
	public void method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1248(arg1, arg4, arg0, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6705(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass316_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass100_Sub1_5.anInt5777 >> 8) >> this.aClass100_Sub1_5.anInt5756;
			@Pc(39) int local39 = arg3 - (this.aClass100_Sub1_5.anInt5769 * arg2 >> 8) >> this.aClass100_Sub1_5.anInt5756;
			return this.aClass316_1.method7032(arg0, local39, local25);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!ok;II)V")
	private void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub6_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray5[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray3[arg2][arg0];
		@Pc(30) int local30 = local12.length;
		if (local30 > Static155.anIntArray442.length) {
			Static155.anIntArray442 = new int[local30];
			Static348.anIntArray430 = new int[local30];
		}
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			Static155.anIntArray442[local42] = local12[local42] >> this.aClass100_Sub1_5.anInt5756;
			Static348.anIntArray430[local42] = local19[local42] >> this.aClass100_Sub1_5.anInt5756;
		}
		@Pc(74) int local74 = 0;
		while (local30 > local74) {
			@Pc(80) int local80 = Static155.anIntArray442[local74];
			@Pc(85) int local85 = Static348.anIntArray430[local74++];
			@Pc(89) int local89 = Static155.anIntArray442[local74];
			@Pc(94) int local94 = Static348.anIntArray430[local74++];
			@Pc(98) int local98 = Static155.anIntArray442[local74];
			@Pc(103) int local103 = Static348.anIntArray430[local74++];
			if ((local94 - local103) * (-local89 + local80) - (local98 - local89) * (local94 - local85) > 0) {
				arg1.method5711(local98, local85, local103, local80, local89, local94);
			}
		}
	}

	@OriginalMember(owner = "client!daa", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt1727 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt8111 + 1][super.anInt8110 + 1];
			for (@Pc(19) int local19 = 1; super.anInt8111 > local19; local19++) {
				for (@Pc(23) int local23 = 1; super.anInt8110 > local23; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray4[local19][local23 + 1] >> 3) + (this.aByteArrayArray4[local19 - 1][local23] >> 2) + (this.aByteArrayArray4[local19 + 1][local23] >> 3) + (this.aByteArrayArray4[local19][local23 + -1] >> 2) + (this.aByteArrayArray4[local19][local23] >> 1));
				}
			}
			@Pc(103) Class2_Sub6[] local103 = new Class2_Sub6[this.lb.method3524()];
			this.lb.method3520(local103);
			for (@Pc(111) int local111 = 0; local111 < local103.length; local111++) {
				local103[local111].method709(this.anInt1727);
			}
			@Pc(127) int local127 = 20;
			if (this.anIntArrayArrayArray8 != null) {
				local127 += 4;
			}
			if ((this.anInt1720 & 0x7) != 0) {
				local127 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass100_Sub1_5.aNativeHeap3.a(this.anInt1727 * 4, false);
			@Pc(157) NativeHeapBuffer local157 = this.aClass100_Sub1_5.aNativeHeap3.a(local127 * this.anInt1727, false);
			@Pc(162) Stream local162 = new Stream(local157);
			@Pc(167) Stream local167 = new Stream(local147);
			@Pc(171) Class2_Sub6[] local171 = new Class2_Sub6[this.anInt1727];
			@Pc(178) int local178 = Static285.method5287(this.anInt1727 / 4);
			if (local178 < 1) {
				local178 = 1;
			}
			@Pc(190) Class162 local190 = new Class162(local178);
			@Pc(194) Class2_Sub6[] local194 = new Class2_Sub6[this.anInt1728];
			@Pc(200) int local200;
			for (@Pc(196) int local196 = 0; super.anInt8111 > local196; local196++) {
				for (local200 = 0; local200 < super.anInt8110; local200++) {
					if (this.anIntArrayArrayArray6[local196][local200] != null) {
						@Pc(216) Class2_Sub6[] local216 = this.aClass2_Sub6ArrayArrayArray1[local196][local200];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray5[local196][local200];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray3[local196][local200];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray4[local196][local200];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray6[local196][local200];
						@Pc(256) int[] local256 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local196][local200];
						if (local237 == null) {
							local237 = local244;
						}
						@Pc(272) int[] local272 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local196][local200];
						@Pc(279) float local279 = this.aFloatArrayArray6[local196][local200];
						@Pc(286) float local286 = this.aFloatArrayArray5[local196][local200];
						@Pc(293) float local293 = this.aFloatArrayArray4[local196][local200];
						@Pc(302) float local302 = this.aFloatArrayArray6[local196][local200 + 1];
						@Pc(311) float local311 = this.aFloatArrayArray5[local196][local200 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray4[local196][local200 + 1];
						@Pc(331) float local331 = this.aFloatArrayArray6[local196 + 1][local200 + 1];
						@Pc(342) float local342 = this.aFloatArrayArray5[local196 + 1][local200 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray4[local196 + 1][local200 + 1];
						@Pc(362) float local362 = this.aFloatArrayArray6[local196 + 1][local200];
						@Pc(371) float local371 = this.aFloatArrayArray5[local196 + 1][local200];
						@Pc(380) float local380 = this.aFloatArrayArray4[local196 + 1][local200];
						@Pc(388) int local388 = local17[local196][local200] & 0xFF;
						@Pc(398) int local398 = local17[local196][local200 + 1] & 0xFF;
						@Pc(410) int local410 = local17[local196 + 1][local200 + 1] & 0xFF;
						@Pc(420) int local420 = local17[local196 + 1][local200] & 0xFF;
						@Pc(422) int local422 = 0;
						@Pc(432) int local432;
						label357: for (@Pc(424) int local424 = 0; local424 < local244.length; local424++) {
							@Pc(430) Class2_Sub6 local430 = local216[local424];
							for (local432 = 0; local432 < local422; local432++) {
								if (local430 == local194[local432]) {
									continue label357;
								}
							}
							local194[local422++] = local430;
						}
						@Pc(473) short[] local473 = this.aShortArrayArray1[local196 + local200 * super.anInt8111] = new short[local244.length];
						for (local432 = 0; local432 < local244.length; local432++) {
							@Pc(487) int local487 = (local196 << super.anInt8108) + local223[local432];
							@Pc(497) int local497 = (local200 << super.anInt8108) + local230[local432];
							@Pc(502) int local502 = local487 >> this.anInt1714;
							@Pc(507) int local507 = local497 >> this.anInt1714;
							@Pc(511) int local511 = local244[local432];
							@Pc(515) int local515 = local237[local432];
							@Pc(523) int local523 = local256 == null ? 0 : local256[local432];
							@Pc(541) long local541 = (long) local507 | (long) (local502 << 16) | (long) local515 << 48 | (long) local511 << 32;
							@Pc(545) int local545 = local223[local432];
							@Pc(549) int local549 = local230[local432];
							@Pc(551) byte local551 = 74;
							@Pc(553) int local553 = 0;
							@Pc(555) float local555 = 1.0F;
							@Pc(583) float local583;
							@Pc(581) float local581;
							@Pc(585) float local585;
							@Pc(647) float local647;
							@Pc(579) int local579;
							if (local545 == 0 && local549 == 0) {
								local581 = local286;
								local585 = local293;
								local583 = local279;
								local579 = local551 - local388;
							} else if (local545 == 0 && super.anInt8104 == local549) {
								local579 = local551 - local398;
								local581 = local311;
								local583 = local302;
								local585 = local320;
							} else if (local545 == super.anInt8104 && local549 == super.anInt8104) {
								local583 = local331;
								local585 = local353;
								local579 = local551 - local410;
								local581 = local342;
							} else if (super.anInt8104 == local545 && local549 == 0) {
								local583 = local362;
								local579 = local551 - local420;
								local585 = local380;
								local581 = local371;
							} else {
								@Pc(623) float local623 = (float) local545 / (float) super.anInt8104;
								@Pc(630) float local630 = (float) local549 / (float) super.anInt8104;
								@Pc(639) float local639 = local279 + (local362 - local279) * local623;
								local647 = local623 * (local371 - local286) + local286;
								@Pc(656) float local656 = local293 + local623 * (local380 - local293);
								@Pc(665) float local665 = local302 + (local331 - local302) * local623;
								@Pc(674) float local674 = local311 + (local342 - local311) * local623;
								@Pc(682) float local682 = local623 * (local353 - local320) + local320;
								local581 = local647 + local630 * (local674 - local647);
								local583 = (local665 - local639) * local630 + local639;
								local585 = (local682 - local656) * local630 + local656;
								@Pc(720) int local720 = local388 + (local545 * (local420 - local388) >> super.anInt8108);
								@Pc(733) int local733 = local398 + ((local410 - local398) * local545 >> super.anInt8108);
								local579 = local551 - ((local733 - local720) * local549 >> super.anInt8108) - local720;
							}
							if (local511 != -1) {
								@Pc(794) int local794 = (local511 & 0x7F) * local579 >> 7;
								if (local794 < 2) {
									local794 = 2;
								} else if (local794 > 126) {
									local794 = 126;
								}
								if ((this.anInt1720 & 0x7) == 0) {
									local555 = this.aClass100_Sub1_5.aFloatArray52[2] * local585 + this.aClass100_Sub1_5.aFloatArray52[0] * local583 + this.aClass100_Sub1_5.aFloatArray52[1] * local581;
									local555 = local555 * (local555 > 0.0F ? this.aClass100_Sub1_5.aFloat159 : this.aClass100_Sub1_5.aFloat162) + this.aClass100_Sub1_5.aFloat166;
								}
								local553 = Static250.anIntArray314[local511 & 0xFF80 | local794];
							}
							@Pc(863) Class2 local863 = null;
							if ((local487 & this.anInt1723 - 1) == 0 && (local497 & this.anInt1723 - 1) == 0) {
								local863 = local190.method3519(local541);
							}
							@Pc(899) int local899;
							@Pc(957) int local957;
							if (local863 == null) {
								if (local511 == local515) {
									local957 = local553;
								} else {
									@Pc(935) int local935 = (local515 & 0x7F) * local579 >> 7;
									if (local935 < 2) {
										local935 = 2;
									} else if (local935 > 126) {
										local935 = 126;
									}
									local957 = Static250.anIntArray314[local515 & 0xFF80 | local935];
									if ((this.anInt1720 & 0x7) == 0) {
										@Pc(988) float local988 = this.aClass100_Sub1_5.aFloatArray52[1] * local581 + this.aClass100_Sub1_5.aFloatArray52[0] * local583 + this.aClass100_Sub1_5.aFloatArray52[2] * local585;
										local647 = (local555 > 0.0F ? this.aClass100_Sub1_5.aFloat159 : this.aClass100_Sub1_5.aFloat162) * local555 + this.aClass100_Sub1_5.aFloat166;
										@Pc(1013) int local1013 = local957 >> 16 & 0xFF;
										@Pc(1019) int local1019 = local957 >> 8 & 0xFF;
										local1013 = (int) ((float) local1013 * local647);
										@Pc(1029) int local1029 = local957 & 0xFF;
										local1019 = (int) ((float) local1019 * local647);
										if (local1013 < 0) {
											local1013 = 0;
										} else if (local1013 > 255) {
											local1013 = 255;
										}
										local1029 = (int) ((float) local1029 * local647);
										if (local1019 < 0) {
											local1019 = 0;
										} else if (local1019 > 255) {
											local1019 = 255;
										}
										if (local1029 < 0) {
											local1029 = 0;
										} else if (local1029 > 255) {
											local1029 = 255;
										}
										local957 = local1013 << 16 | local1019 << 8 | local1029;
									}
								}
								if (Stream.a()) {
									local162.a((float) local487);
									local162.a((float) (local523 + this.method6711(local497, local487)));
									local162.a((float) local497);
									local162.a((float) local487);
									local162.a((float) local497);
									if (this.anIntArrayArrayArray8 != null) {
										local162.a((float) (local272 == null ? 0 : local272[local432] - 1));
									}
									if ((this.anInt1720 & 0x7) != 0) {
										local162.a(local583);
										local162.a(local581);
										local162.a(local585);
									}
								} else {
									local162.b((float) local487);
									local162.b((float) (this.method6711(local497, local487) + local523));
									local162.b((float) local497);
									local162.b((float) local487);
									local162.b((float) local497);
									if (this.anIntArrayArrayArray8 != null) {
										local162.b((float) (local272 == null ? 0 : local272[local432] - 1));
									}
									if ((this.anInt1720 & 0x7) != 0) {
										local162.b(local583);
										local162.b(local581);
										local162.b(local585);
									}
								}
								if (this.aClass100_Sub1_5.anInt5791 == 0) {
									local167.f(local957 | 0xFF000000);
								} else {
									local167.a(local957 | 0xFF000000);
								}
								local899 = this.anInt1706++;
								local473[local432] = (short) local899;
								if (local511 != -1) {
									local171[local899] = local216[local432];
								}
								local190.method3522(new Class2_Sub29(local473[local432]), local541);
							} else {
								local473[local432] = ((Class2_Sub29) local863).aShort60;
								local899 = local473[local432] & 0xFFFF;
								if (local511 != -1 && local216[local432].aLong268 < local171[local899].aLong268) {
									local171[local899] = local216[local432];
								}
							}
							for (local957 = 0; local957 < local422; local957++) {
								local194[local957].method710(local553, local579, local555, local899);
							}
							this.anInt1717++;
						}
					}
				}
			}
			for (local200 = 0; local200 < this.anInt1706; local200++) {
				@Pc(1324) Class2_Sub6 local1324 = local171[local200];
				if (local1324 != null) {
					local1324.method707(local200);
				}
			}
			@Pc(1341) int local1341;
			@Pc(1359) int local1359;
			for (@Pc(1337) int local1337 = 0; local1337 < super.anInt8111; local1337++) {
				for (local1341 = 0; super.anInt8110 > local1341; local1341++) {
					@Pc(1353) short[] local1353 = this.aShortArrayArray1[local1337 + local1341 * super.anInt8111];
					if (local1353 != null) {
						@Pc(1357) int local1357 = 0;
						local1359 = 0;
						while (local1359 < local1353.length) {
							@Pc(1368) int local1368 = local1353[local1359++] & 0xFFFF;
							@Pc(1375) int local1375 = local1353[local1359++] & 0xFFFF;
							@Pc(1382) int local1382 = local1353[local1359++] & 0xFFFF;
							@Pc(1386) Class2_Sub6 local1386 = local171[local1368];
							@Pc(1390) Class2_Sub6 local1390 = local171[local1375];
							@Pc(1394) Class2_Sub6 local1394 = local171[local1382];
							@Pc(1396) Class2_Sub6 local1396 = null;
							if (local1386 != null) {
								local1396 = local1386;
								local1386.method706(local1357, local1341, local1337);
							}
							if (local1390 != null) {
								local1390.method706(local1357, local1341, local1337);
								if (local1396 == null || local1390.aLong268 < local1396.aLong268) {
									local1396 = local1390;
								}
							}
							if (local1394 != null) {
								local1394.method706(local1357, local1341, local1337);
								if (local1396 == null || local1396.aLong268 > local1394.aLong268) {
									local1396 = local1394;
								}
							}
							if (local1396 != null) {
								if (local1386 != null) {
									local1396.method707(local1368);
								}
								if (local1390 != null) {
									local1396.method707(local1375);
								}
								if (local1394 != null) {
									local1396.method707(local1382);
								}
								local1396.method706(local1357, local1341, local1337);
							}
							local1357++;
						}
					}
				}
			}
			local162.c();
			local167.c();
			this.anInterface16_4 = this.aClass100_Sub1_5.method4837(false);
			this.anInterface16_4.method5773(local147, 4, this.anInt1706 * 4);
			this.anInterface16_3 = this.aClass100_Sub1_5.method4837(false);
			this.anInterface16_3.method5773(local157, local127, this.anInt1706 * local127);
			if ((this.anInt1720 & 0x7) == 0) {
				if (this.anIntArrayArrayArray8 == null) {
					this.aClass199_1 = this.aClass100_Sub1_5.method4853(new Class89[] { new Class89(new Class181[] { Static263.aClass181_1, Static263.aClass181_5 }), new Class89(Static263.aClass181_3) });
				} else {
					this.aClass199_1 = this.aClass100_Sub1_5.method4853(new Class89[] { new Class89(new Class181[] { Static263.aClass181_1, Static263.aClass181_5, Static263.aClass181_4 }), new Class89(Static263.aClass181_3) });
				}
			} else if (this.anIntArrayArrayArray8 == null) {
				this.aClass199_1 = this.aClass100_Sub1_5.method4853(new Class89[] { new Class89(new Class181[] { Static263.aClass181_1, Static263.aClass181_5, Static263.aClass181_2 }), new Class89(Static263.aClass181_3) });
			} else {
				this.aClass199_1 = this.aClass100_Sub1_5.method4853(new Class89[] { new Class89(new Class181[] { Static263.aClass181_1, Static263.aClass181_5, Static263.aClass181_4, Static263.aClass181_2 }), new Class89(Static263.aClass181_3) });
			}
			local1341 = 0;
			for (@Pc(1692) int local1692 = 0; local1692 < local103.length; local1692++) {
				if (local103[local1692].anInt1034 > 0) {
					local103[local1341++] = local103[local1692];
				}
			}
			this.aClass2_Sub6Array1 = new Class2_Sub6[local1341];
			@Pc(1721) long[] local1721 = new long[local1341];
			for (local1359 = 0; local1359 < local1341; local1359++) {
				@Pc(1729) Class2_Sub6 local1729 = local103[local1359];
				local1721[local1359] = local1729.aLong268;
				this.aClass2_Sub6Array1[local1359] = local1729;
				local1729.method712(this.anInt1706);
			}
			Static477.method6771(local1721, this.aClass2_Sub6Array1);
			if (this.aClass316_1 != null) {
				this.aClass316_1.method7028();
			}
		} else {
			this.aClass316_1 = null;
		}
		this.lb = null;
		this.aClass2_Sub6ArrayArrayArray1 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray7 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray5 = this.aFloatArrayArray4 = null;
		this.anIntArrayArrayArray5 = this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray4 = null;
		this.aByteArrayArray4 = null;
	}

	@OriginalMember(owner = "client!daa", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass316_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass100_Sub1_5.anInt5777 * arg2 >> 8) >> this.aClass100_Sub1_5.anInt5756;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass100_Sub1_5.anInt5769 >> 8) >> this.aClass100_Sub1_5.anInt5756;
			this.aClass316_1.method7033(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6713(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1727 <= 0) {
			return;
		}
		@Pc(16) Interface11 local16 = this.aClass100_Sub1_5.method4795(this.anInt1717);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method4114();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass100_Sub1_5.method4834(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.a()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = super.anInt8111 * local45 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray1[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local41.c(local87);
										local18++;
										if (local22 < local87) {
											local22 = local87;
										}
										if (local20 > local87) {
											local20 = local87;
										}
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = super.anInt8111 * local45 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray1[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local20 > local87) {
											local20 = local87;
										}
										if (local22 < local87) {
											local22 = local87;
										}
										local18++;
										local41.e(local87);
									}
								}
							}
							local54++;
						}
					}
				}
				local41.c();
				if (local16.method4118()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass100_Sub1_5.method4762();
		this.aClass100_Sub1_5.method4857(false);
		this.aClass100_Sub1_5.method4774(false);
		this.aClass100_Sub1_5.method4832(false);
		this.aClass100_Sub1_5.method4871(false);
		this.aClass100_Sub1_5.method4801(0);
		this.aClass100_Sub1_5.method4761(-2, false, false);
		this.aClass100_Sub1_5.method4876(null);
		@Pc(276) Class68_Sub2 local276 = this.aClass100_Sub1_5.method4878();
		@Pc(281) float[] local281 = this.aClass100_Sub1_5.method4806();
		local281[15] = 1.0F;
		local281[0] = (float) 1024 / ((float) this.aClass100_Sub1_5.anInt5608 * (float) super.anInt8104 * 128.0F);
		local281[8] = 0.0F;
		local281[1] = 0.0F;
		local281[14] = -this.aFloat31 / (this.aFloat32 - this.aFloat31);
		local281[7] = 0.0F;
		local281[3] = 0.0F;
		local281[6] = 0.0F;
		local281[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass100_Sub1_5.anInt5608) - 1.0F;
		local281[9] = 0.0F;
		local281[5] = (float) 1024 / ((float) super.anInt8104 * 128.0F * (float) this.aClass100_Sub1_5.anInt5630);
		local281[2] = 0.0F;
		local281[10] = 1.0F / (this.aFloat32 - this.aFloat31);
		local281[11] = 0.0F;
		local281[4] = 0.0F;
		local281[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass100_Sub1_5.anInt5630;
		local276.method5107(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
		this.aClass100_Sub1_5.method4783();
		this.aClass100_Sub1_5.method4858();
		if ((this.anInt1720 & 0x7) == 0) {
			this.aClass100_Sub1_5.method4774(false);
		} else {
			this.aClass100_Sub1_5.method4774(true);
			this.aClass100_Sub1_5.method4843();
		}
		this.aClass100_Sub1_5.method4881(false);
		this.aClass100_Sub1_5.method4863(this.anInterface16_3, 0);
		this.aClass100_Sub1_5.method4863(this.anInterface16_4, 1);
		this.aClass100_Sub1_5.method4757(this.aClass199_1);
		this.aClass100_Sub1_5.method4764(local22 + 1 - local20, Static341.aClass213_5, 0, local18 / 3, local20, local16);
		this.aClass100_Sub1_5.method4881(true);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method1248(arg1, arg4, arg0, -1, arg3, arg2);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!gga;[I)V")
	@Override
	public void method6709(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_7.method212(new Class2_Sub38(this.aClass100_Sub1_5, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!daa", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class2_Sub3_Sub6 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub6 arg2) {
		if ((this.aByteArrayArray3[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8104 >> this.aClass100_Sub1_5.anInt5756;
		@Pc(24) Class2_Sub3_Sub6_Sub1 local24 = (Class2_Sub3_Sub6_Sub1) arg2;
		@Pc(40) Class2_Sub3_Sub6_Sub1 local40;
		if (local24 != null && local24.method5709(local21, local21)) {
			local40 = local24;
			local24.method5712();
		} else {
			local40 = new Class2_Sub3_Sub6_Sub1(this.aClass100_Sub1_5, local21, local21);
		}
		local40.method5708(local21, 0, 0, local21);
		this.method1249(arg1, local40, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!daa", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass316_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass100_Sub1_5.anInt5777 * arg2 >> 8) >> this.aClass100_Sub1_5.anInt5756;
			@Pc(39) int local39 = arg3 - (this.aClass100_Sub1_5.anInt5769 * arg2 >> 8) >> this.aClass100_Sub1_5.anInt5756;
			this.aClass316_1.method7029(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!daa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt8111][super.anInt8110][];
		}
		if (arg3 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt8111][super.anInt8110][];
		}
		this.anIntArrayArrayArray5[arg0][arg1] = arg2;
		this.anIntArrayArrayArray3[arg0][arg1] = arg4;
		this.anIntArrayArrayArray6[arg0][arg1] = arg6;
		this.anIntArrayArrayArray4[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub6[] local88 = this.aClass2_Sub6ArrayArrayArray1[arg0][arg1] = new Class2_Sub6[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class2 local125;
			for (local125 = this.lb.method3519(local119); local125 != null; local125 = this.lb.method3528()) {
				@Pc(130) Class2_Sub6 local130 = (Class2_Sub6) local125;
				if (local130.anInt1026 == arg8[local90] && (float) arg9[local90] == local130.aFloat22 && local130.anInt1035 == arg10 && arg11 == local130.anInt1037 && local130.anInt1031 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub6(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.lb.method3522(local88[local90], local119);
			} else {
				local88[local90] = (Class2_Sub6) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray3[arg0][arg1] = (byte) (this.aByteArrayArray3[arg0][arg1] | 0x1);
		}
		if (this.anInt1728 < arg6.length) {
			this.anInt1728 = arg6.length;
		}
		this.anInt1727 += arg6.length;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray4[arg0][arg1] = (byte) arg2;
		}
	}
}
