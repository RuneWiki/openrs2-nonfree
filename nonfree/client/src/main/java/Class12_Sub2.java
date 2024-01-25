import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!bda", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!bda", name = "D", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!bda", name = "F", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!bda", name = "T", descriptor = "Lclient!ls;")
	public Class214 aClass214_1;

	@OriginalMember(owner = "client!bda", name = "X", descriptor = "Lclient!ls;")
	public Class214 aClass214_2;

	@OriginalMember(owner = "client!bda", name = "Y", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!bda", name = "Z", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!bda", name = "bb", descriptor = "[Lclient!lw;")
	private Class6_Sub37[] aClass6_Sub37Array1;

	@OriginalMember(owner = "client!bda", name = "cb", descriptor = "Lclient!ls;")
	public Class214 aClass214_3;

	@OriginalMember(owner = "client!bda", name = "db", descriptor = "Lclient!vn;")
	private Interface26 anInterface26_1;

	@OriginalMember(owner = "client!bda", name = "eb", descriptor = "Lclient!ls;")
	private Class214 aClass214_4;

	@OriginalMember(owner = "client!bda", name = "A", descriptor = "Lclient!v;")
	private final Class362 aClass362_4 = new Class362();

	@OriginalMember(owner = "client!bda", name = "u", descriptor = "Lclient!pq;")
	public final Class132_Sub3 aClass132_Sub3_4;

	@OriginalMember(owner = "client!bda", name = "K", descriptor = "I")
	private final int anInt882;

	@OriginalMember(owner = "client!bda", name = "z", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
	public final int anInt868;

	@OriginalMember(owner = "client!bda", name = "Q", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!bda", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!bda", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!bda", name = "gb", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!bda", name = "o", descriptor = "[[[Lclient!lw;")
	private Class6_Sub37[][][] aClass6_Sub37ArrayArrayArray1;

	@OriginalMember(owner = "client!bda", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!bda", name = "q", descriptor = "[[B")
	private final byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!bda", name = "O", descriptor = "[[S")
	public final short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!bda", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!bda", name = "M", descriptor = "I")
	private final int anInt883;

	@OriginalMember(owner = "client!bda", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!bda", name = "ab", descriptor = "Lclient!lk;")
	private Class209 aClass209_4;

	@OriginalMember(owner = "client!bda", name = "P", descriptor = "Lclient!f;")
	private Class98 aClass98_1;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!pq;IIII[[I[[II)V")
	public Class12_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass132_Sub3_4 = arg0;
		this.anInt882 = super.anInt9312 - 2;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anInt868 = arg2;
		this.aFloatArrayArray4 = new float[super.anInt9314 + 1][super.anInt9313 + 1];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt9314 + 1][super.anInt9313 + 1];
		this.aByteArrayArray5 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aClass6_Sub37ArrayArrayArray1 = new Class6_Sub37[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt9314 + 1][super.anInt9313 + 1];
		this.aByteArrayArray4 = new byte[arg3][arg4];
		this.aShortArrayArray2 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anInt883 = 0x1 << this.anInt882;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; super.anInt9313 > local115; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9314 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + arg7 * arg7 * 4 + local138 * local138)));
				this.aFloatArrayArray5[local119][local115] = (float) local138 * local174;
				this.aFloatArrayArray6[local119][local115] = local174 * (float) (-arg7 * 2);
				this.aFloatArrayArray4[local119][local115] = (float) local155 * local174;
			}
		}
		this.aClass209_4 = new Class209(128);
		if ((this.anInt868 & 0x10) != 0) {
			this.aClass98_1 = new Class98(this.aClass132_Sub3_4, this);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!sca;[I)V")
	@Override
	public void method7856(@OriginalArg(0) Class6_Sub17 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass362_4.method8536(new Class6_Sub55(this.aClass132_Sub3_4, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!bda", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass98_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass132_Sub3_4.anInt7897 >> 8) >> this.aClass132_Sub3_4.anInt7879;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass132_Sub3_4.anInt7922 >> 8) >> this.aClass132_Sub3_4.anInt7879;
			this.aClass98_1.method2097(local38, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7852(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass98_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass132_Sub3_4.anInt7897 >> 8) >> this.aClass132_Sub3_4.anInt7879;
			@Pc(39) int local39 = arg3 - (this.aClass132_Sub3_4.anInt7922 * arg2 >> 8) >> this.aClass132_Sub3_4.anInt7879;
			return this.aClass98_1.method2105(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILclient!gea;I)V")
	private void method874(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub4_Sub5_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray9[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass132_Sub3_4.anIntArray521.length) {
			this.aClass132_Sub3_4.anIntArray521 = new int[local22];
			this.aClass132_Sub3_4.anIntArray522 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass132_Sub3_4.anIntArray521;
		@Pc(50) int[] local50 = this.aClass132_Sub3_4.anIntArray522;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass132_Sub3_4.anInt7879;
			local50[local52] = local19[local52] >> this.aClass132_Sub3_4.anInt7879;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local22) {
			@Pc(86) int local86 = local46[local80];
			@Pc(91) int local91 = local50[local80++];
			@Pc(95) int local95 = local46[local80];
			@Pc(100) int local100 = local50[local80++];
			@Pc(104) int local104 = local46[local80];
			@Pc(109) int local109 = local50[local80++];
			if (-((local104 - local95) * (local100 - local91)) + (local100 - local109) * (-local95 + local86) > 0) {
				arg1.method2497(local109, local95, local100, local86, local91, local104);
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class6_Sub4_Sub5 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub5 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9306 >> this.aClass132_Sub3_4.anInt7879;
		@Pc(27) Class6_Sub4_Sub5_Sub1 local27 = (Class6_Sub4_Sub5_Sub1) arg2;
		@Pc(43) Class6_Sub4_Sub5_Sub1 local43;
		if (local27 != null && local27.method2496(local24, local24)) {
			local43 = local27;
			local27.method2495();
		} else {
			local43 = new Class6_Sub4_Sub5_Sub1(this.aClass132_Sub3_4, local24, local24);
		}
		local43.method2499(local24, 0, local24, 0);
		this.method874(arg0, local43, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)V")
	@Override
	public void method7847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bda", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt889 <= 0) {
			this.aClass98_1 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt9314 + 1][super.anInt9313 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; local25 < super.anInt9314; local25++) {
				for (local29 = 1; super.anInt9313 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray5[local25][local29] >> 1) + (this.aByteArrayArray5[local25][local29 - 1] >> 2) + (this.aByteArrayArray5[local25 + 1][local29] >> 3) + (this.aByteArrayArray5[local25 + -1][local29] >> 2) + (this.aByteArrayArray5[local25][local29 + 1] >> 3));
				}
			}
			this.aClass6_Sub37Array1 = new Class6_Sub37[this.aClass209_4.method5033()];
			this.aClass209_4.method5032(this.aClass6_Sub37Array1);
			for (local29 = 0; local29 < this.aClass6_Sub37Array1.length; local29++) {
				this.aClass6_Sub37Array1[local29].method5165(this.anInt889);
			}
			@Pc(145) int local145 = 24;
			if (this.anIntArrayArrayArray8 != null) {
				local145 += 4;
			}
			if ((this.anInt868 & 0x7) != 0) {
				local145 += 12;
			}
			@Pc(168) NativeHeapBuffer local168 = this.aClass132_Sub3_4.aNativeHeap4.a(local145 * this.anInt889, false);
			@Pc(173) Stream local173 = new Stream(local168);
			@Pc(177) Class6_Sub37[] local177 = new Class6_Sub37[this.anInt889];
			@Pc(184) int local184 = Static199.method2911(this.anInt889 / 4);
			if (local184 < 1) {
				local184 = 1;
			}
			@Pc(196) Class209 local196 = new Class209(local184);
			@Pc(200) Class6_Sub37[] local200 = new Class6_Sub37[this.anInt888];
			@Pc(206) int local206;
			for (@Pc(202) int local202 = 0; super.anInt9314 > local202; local202++) {
				for (local206 = 0; local206 < super.anInt9313; local206++) {
					if (this.anIntArrayArrayArray12[local202][local206] != null) {
						@Pc(222) Class6_Sub37[] local222 = this.aClass6_Sub37ArrayArrayArray1[local202][local206];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray9[local202][local206];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray7[local202][local206];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray10[local202][local206];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray12[local202][local206];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local202][local206];
						@Pc(274) int[] local274 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local202][local206];
						if (local243 == null) {
							local243 = local250;
						}
						@Pc(285) float local285 = this.aFloatArrayArray5[local202][local206];
						@Pc(292) float local292 = this.aFloatArrayArray6[local202][local206];
						@Pc(299) float local299 = this.aFloatArrayArray4[local202][local206];
						@Pc(308) float local308 = this.aFloatArrayArray5[local202][local206 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray6[local202][local206 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray4[local202][local206 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray5[local202 + 1][local206 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray6[local202 + 1][local206 + 1];
						@Pc(359) float local359 = this.aFloatArrayArray4[local202 + 1][local206 + 1];
						@Pc(368) float local368 = this.aFloatArrayArray5[local202 + 1][local206];
						@Pc(377) float local377 = this.aFloatArrayArray6[local202 + 1][local206];
						@Pc(386) float local386 = this.aFloatArrayArray4[local202 + 1][local206];
						@Pc(394) int local394 = local23[local202][local206] & 0xFF;
						@Pc(404) int local404 = local23[local202][local206 + 1] & 0xFF;
						@Pc(416) int local416 = local23[local202 + 1][local206 + 1] & 0xFF;
						@Pc(426) int local426 = local23[local202 + 1][local206] & 0xFF;
						@Pc(428) int local428 = 0;
						@Pc(438) int local438;
						label337: for (@Pc(430) int local430 = 0; local430 < local250.length; local430++) {
							@Pc(436) Class6_Sub37 local436 = local222[local430];
							for (local438 = 0; local438 < local428; local438++) {
								if (local200[local438] == local436) {
									continue label337;
								}
							}
							local200[local428++] = local436;
						}
						@Pc(479) short[] local479 = this.aShortArrayArray2[local202 + local206 * super.anInt9314] = new short[local250.length];
						for (local438 = 0; local438 < local250.length; local438++) {
							@Pc(493) int local493 = (local202 << super.anInt9312) + local229[local438];
							@Pc(503) int local503 = (local206 << super.anInt9312) + local236[local438];
							@Pc(508) int local508 = local493 >> this.anInt882;
							@Pc(513) int local513 = local503 >> this.anInt882;
							@Pc(517) int local517 = local250[local438];
							@Pc(521) int local521 = local243[local438];
							@Pc(529) int local529 = local262 == null ? 0 : local262[local438];
							@Pc(547) long local547 = (long) local521 << 48 | (long) local517 << 32 | (long) (local508 << 16) | (long) local513;
							@Pc(551) int local551 = local229[local438];
							@Pc(555) int local555 = local236[local438];
							@Pc(557) byte local557 = 74;
							@Pc(559) int local559 = 0;
							@Pc(561) float local561 = 1.0F;
							@Pc(589) float local589;
							@Pc(591) float local591;
							@Pc(593) float local593;
							@Pc(652) float local652;
							@Pc(597) int local597;
							if (local551 == 0 && local555 == 0) {
								local589 = local285;
								local591 = local292;
								local597 = local557 - local394;
								local593 = local299;
							} else if (local551 == 0 && local555 == super.anInt9306) {
								local591 = local317;
								local589 = local308;
								local593 = local326;
								local597 = local557 - local404;
							} else if (local551 == super.anInt9306 && super.anInt9306 == local555) {
								local589 = local337;
								local591 = local348;
								local593 = local359;
								local597 = local557 - local416;
							} else if (local551 == super.anInt9306 && local555 == 0) {
								local591 = local377;
								local589 = local368;
								local597 = local557 - local426;
								local593 = local386;
							} else {
								@Pc(627) float local627 = (float) local551 / (float) super.anInt9306;
								@Pc(634) float local634 = (float) local555 / (float) super.anInt9306;
								@Pc(643) float local643 = (local368 - local285) * local627 + local285;
								local652 = local627 * (local377 - local292) + local292;
								@Pc(661) float local661 = local627 * (local386 - local299) + local299;
								@Pc(669) float local669 = local627 * (local337 - local308) + local308;
								@Pc(678) float local678 = local627 * (local348 - local317) + local317;
								local591 = (local678 - local652) * local634 + local652;
								local589 = local634 * (local669 - local643) + local643;
								@Pc(703) float local703 = local627 * (local359 - local326) + local326;
								local593 = (local703 - local661) * local634 + local661;
								@Pc(723) int local723 = (local551 * (local426 - local394) >> super.anInt9312) + local394;
								@Pc(736) int local736 = local404 + (local551 * (local416 - local404) >> super.anInt9312);
								local597 = local557 - local723 - ((local736 - local723) * local555 >> super.anInt9312);
							}
							if (local517 != -1) {
								@Pc(786) int local786 = (local517 & 0x7F) * local597 >> 7;
								if (local786 < 2) {
									local786 = 2;
								} else if (local786 > 126) {
									local786 = 126;
								}
								if ((this.anInt868 & 0x7) == 0) {
									local561 = local593 * this.aClass132_Sub3_4.aFloatArray45[2] + local591 * this.aClass132_Sub3_4.aFloatArray45[1] + local589 * this.aClass132_Sub3_4.aFloatArray45[0];
									local561 = local561 * (local561 > 0.0F ? this.aClass132_Sub3_4.aFloat137 : this.aClass132_Sub3_4.aFloat146) + this.aClass132_Sub3_4.aFloat143;
								}
								local559 = Static70.anIntArray71[local786 | local517 & 0xFF80];
							}
							@Pc(858) Class6 local858 = null;
							if ((this.anInt883 - 1 & local493) == 0 && (this.anInt883 - 1 & local503) == 0) {
								local858 = local196.method5038(local547);
							}
							@Pc(1211) int local1211;
							@Pc(884) int local884;
							if (local858 == null) {
								if (local517 == local521) {
									local884 = local559;
								} else {
									@Pc(894) int local894 = local597 * (local521 & 0x7F) >> 7;
									if (local894 < 2) {
										local894 = 2;
									} else if (local894 > 126) {
										local894 = 126;
									}
									local884 = Static70.anIntArray71[local894 | local521 & 0xFF80];
									if ((this.anInt868 & 0x7) == 0) {
										local652 = local593 * this.aClass132_Sub3_4.aFloatArray45[2] + local591 * this.aClass132_Sub3_4.aFloatArray45[1] + local589 * this.aClass132_Sub3_4.aFloatArray45[0];
										local652 = local561 * (local561 > 0.0F ? this.aClass132_Sub3_4.aFloat137 : this.aClass132_Sub3_4.aFloat146) + this.aClass132_Sub3_4.aFloat143;
										@Pc(969) int local969 = local884 >> 16 & 0xFF;
										@Pc(975) int local975 = local884 >> 8 & 0xFF;
										@Pc(979) int local979 = local884 & 0xFF;
										local969 = (int) ((float) local969 * local652);
										if (local969 < 0) {
											local969 = 0;
										} else if (local969 > 255) {
											local969 = 255;
										}
										local975 = (int) ((float) local975 * local652);
										if (local975 < 0) {
											local975 = 0;
										} else if (local975 > 255) {
											local975 = 255;
										}
										local979 = (int) ((float) local979 * local652);
										if (local979 < 0) {
											local979 = 0;
										} else if (local979 > 255) {
											local979 = 255;
										}
										local884 = local969 << 16 | local975 << 8 | local979;
									}
								}
								if (this.aClass132_Sub3_4.aBoolean544) {
									local173.a((float) local493);
									local173.a((float) (this.method7854(local503, local493) + local529));
									local173.a((float) local503);
									local173.d((byte) (local884 >> 16));
									local173.d((byte) (local884 >> 8));
									local173.d((byte) local884);
									local173.d(-1);
									local173.a((float) local493);
									local173.a((float) local503);
									if (this.anIntArrayArrayArray8 != null) {
										local173.a((float) (local274 == null ? 0 : local274[local438] - 1));
									}
									if ((this.anInt868 & 0x7) != 0) {
										local173.a(local589);
										local173.a(local591);
										local173.a(local593);
									}
								} else {
									local173.b((float) local493);
									local173.b((float) (local529 + this.method7854(local503, local493)));
									local173.b((float) local503);
									local173.d((byte) (local884 >> 16));
									local173.d((byte) (local884 >> 8));
									local173.d((byte) local884);
									local173.d(-1);
									local173.b((float) local493);
									local173.b((float) local503);
									if (this.anIntArrayArrayArray8 != null) {
										local173.b((float) (local274 == null ? 0 : local274[local438] - 1));
									}
									if ((this.anInt868 & 0x7) != 0) {
										local173.b(local589);
										local173.b(local591);
										local173.b(local593);
									}
								}
								local1211 = this.anInt877++;
								local479[local438] = (short) local1211;
								if (local517 != -1) {
									local177[local1211] = local222[local438];
								}
								local196.method5035(local547, new Class6_Sub40(local479[local438]));
							} else {
								local479[local438] = ((Class6_Sub40) local858).aShort83;
								local1211 = local479[local438] & 0xFFFF;
								if (local517 != -1 && local222[local438].aLong314 < local177[local1211].aLong314) {
									local177[local1211] = local222[local438];
								}
							}
							for (local884 = 0; local884 < local428; local884++) {
								local200[local884].method5171(local1211, local597, local559, local561);
							}
							this.anInt879++;
						}
					}
				}
			}
			for (local206 = 0; local206 < this.anInt877; local206++) {
				@Pc(1328) Class6_Sub37 local1328 = local177[local206];
				if (local1328 != null) {
					local1328.method5172(local206);
				}
			}
			@Pc(1361) int local1361;
			for (@Pc(1341) int local1341 = 0; super.anInt9314 > local1341; local1341++) {
				for (@Pc(1345) int local1345 = 0; local1345 < super.anInt9313; local1345++) {
					@Pc(1357) short[] local1357 = this.aShortArrayArray2[local1341 + super.anInt9314 * local1345];
					if (local1357 != null) {
						local1361 = 0;
						@Pc(1363) int local1363 = 0;
						while (local1357.length > local1363) {
							@Pc(1372) int local1372 = local1357[local1363++] & 0xFFFF;
							@Pc(1379) int local1379 = local1357[local1363++] & 0xFFFF;
							@Pc(1386) int local1386 = local1357[local1363++] & 0xFFFF;
							@Pc(1390) Class6_Sub37 local1390 = local177[local1372];
							@Pc(1394) Class6_Sub37 local1394 = local177[local1379];
							@Pc(1398) Class6_Sub37 local1398 = local177[local1386];
							@Pc(1400) Class6_Sub37 local1400 = null;
							if (local1390 != null) {
								local1400 = local1390;
								local1390.method5168(local1345, local1361, local1341);
							}
							if (local1394 != null) {
								local1394.method5168(local1345, local1361, local1341);
								if (local1400 == null || local1394.aLong314 < local1400.aLong314) {
									local1400 = local1394;
								}
							}
							if (local1398 != null) {
								local1398.method5168(local1345, local1361, local1341);
								if (local1400 == null || local1400.aLong314 > local1398.aLong314) {
									local1400 = local1398;
								}
							}
							if (local1400 != null) {
								if (local1390 != null) {
									local1400.method5172(local1372);
								}
								if (local1394 != null) {
									local1400.method5172(local1379);
								}
								if (local1398 != null) {
									local1400.method5172(local1386);
								}
								local1400.method5168(local1345, local1361, local1341);
							}
							local1361++;
						}
					}
				}
			}
			local173.c();
			this.anInterface26_1 = this.aClass132_Sub3_4.method6775(local168, local145, local173.a());
			this.aClass214_2 = new Class214(this.anInterface26_1, 5126, 3, 0);
			this.aClass214_4 = new Class214(this.anInterface26_1, 5121, 4, 12);
			@Pc(1541) byte local1541;
			if (this.anIntArrayArrayArray8 == null) {
				local1541 = 24;
				this.aClass214_3 = new Class214(this.anInterface26_1, 5126, 2, 16);
			} else {
				local1541 = 28;
				this.aClass214_3 = new Class214(this.anInterface26_1, 5126, 3, 16);
			}
			if ((this.anInt868 & 0x7) != 0) {
				this.aClass214_1 = new Class214(this.anInterface26_1, 5126, 3, local1541);
			}
			@Pc(1585) long[] local1585 = new long[this.aClass6_Sub37Array1.length];
			for (local1361 = 0; local1361 < this.aClass6_Sub37Array1.length; local1361++) {
				@Pc(1594) Class6_Sub37 local1594 = this.aClass6_Sub37Array1[local1361];
				local1585[local1361] = local1594.aLong314;
				local1594.method5167(this.anInt877);
			}
			Static151.method2160(local1585, this.aClass6_Sub37Array1);
			if (this.aClass98_1 != null) {
				this.aClass98_1.method2101();
			}
		}
		this.anIntArrayArrayArray10 = null;
		this.aClass6_Sub37ArrayArrayArray1 = null;
		this.anIntArrayArrayArray11 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray4 = null;
		this.aByteArrayArray5 = null;
		this.anIntArrayArrayArray9 = this.anIntArrayArrayArray7 = null;
		this.aClass209_4 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!bda", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass98_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass132_Sub3_4.anInt7897 * arg2 >> 8) >> this.aClass132_Sub3_4.anInt7879;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass132_Sub3_4.anInt7922 >> 8) >> this.aClass132_Sub3_4.anInt7879;
			this.aClass98_1.method2100(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!bda", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt9314][super.anInt9313][];
		}
		@Pc(21) Interface6 local21 = this.aClass132_Sub3_4.anInterface6_11;
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt9314][super.anInt9313][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray10[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(92) Class6_Sub37[] local92 = this.aClass6_Sub37ArrayArrayArray1[arg0][arg1] = new Class6_Sub37[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt868 & 0x20) != 0 && local100 != -1 && local21.method7088(local100).aBoolean573) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(145) long local145 = (long) (local104 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) local100;
			@Pc(151) Class6 local151;
			for (local151 = this.aClass209_4.method5038(local145); local151 != null; local151 = this.aClass209_4.method5042()) {
				@Pc(156) Class6_Sub37 local156 = (Class6_Sub37) local151;
				if (local156.anInt6120 == local100 && local156.aFloat70 == (float) local104 && arg10 == local156.anInt6114 && local156.anInt6123 == arg11 && local156.anInt6122 == arg12) {
					break;
				}
			}
			if (local151 == null) {
				local92[local94] = new Class6_Sub37(this, local100, local104, arg10, arg11, arg12);
				this.aClass209_4.method5035(local145, local92[local94]);
			} else {
				local92[local94] = (Class6_Sub37) local151;
			}
		}
		if (arg13) {
			this.aByteArrayArray4[arg0][arg1] = (byte) (this.aByteArrayArray4[arg0][arg1] | 0x1);
		}
		if (this.anInt888 < arg6.length) {
			this.anInt888 = arg6.length;
		}
		this.anInt889 += arg6.length;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIZI[[Z)V")
	private void method875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[][] arg6) {
		if (this.aClass6_Sub37Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg2 + arg2 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > this.aClass132_Sub3_4.anIntArray520.length) {
			this.aClass132_Sub3_4.anIntArray520 = new int[local14];
		}
		if (this.aClass132_Sub3_4.aClass6_Sub23_Sub2_2.aByteArray101.length < this.anInt879 * 2) {
			this.aClass132_Sub3_4.aClass6_Sub23_Sub2_2 = new Class6_Sub23_Sub2(this.anInt879 * 2);
		}
		@Pc(50) int local50 = arg5 - arg2;
		@Pc(52) int local52 = local50;
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(64) int local64 = arg3 - arg2;
		@Pc(66) int local66 = local64;
		if (local64 < 0) {
			local64 = 0;
		}
		@Pc(77) int local77 = arg2 + arg5;
		if (local77 > super.anInt9314 - 1) {
			local77 = super.anInt9314 - 1;
		}
		@Pc(96) int local96 = arg3 + arg2;
		if (local96 > super.anInt9313 - 1) {
			local96 = super.anInt9313 - 1;
		}
		@Pc(109) int local109 = 0;
		@Pc(113) int[] local113 = this.aClass132_Sub3_4.anIntArray520;
		@Pc(126) int local126;
		for (@Pc(115) int local115 = local50; local115 <= local77; local115++) {
			@Pc(124) boolean[] local124 = arg6[local115 - local52];
			for (local126 = local64; local126 <= local96; local126++) {
				if (local124[local126 - local66]) {
					local113[local109++] = super.anInt9314 * local126 + local115;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass132_Sub3_4.method6777();
		} else {
			this.aClass132_Sub3_4.method6736((float) arg0);
			this.aClass132_Sub3_4.method6749();
		}
		this.aClass132_Sub3_4.method6742((this.anInt868 & 0x7) != 0);
		for (@Pc(191) int local191 = 0; local191 < this.aClass6_Sub37Array1.length; local191++) {
			this.aClass6_Sub37Array1[local191].method5169(local109, local113);
		}
		if (!this.aClass362_4.method8541()) {
			local126 = this.aClass132_Sub3_4.anInt7904;
			@Pc(224) int local224 = this.aClass132_Sub3_4.anInt7891;
			this.aClass132_Sub3_4.L(0, local224, this.aClass132_Sub3_4.anInt7892);
			this.aClass132_Sub3_4.method6742(false);
			this.aClass132_Sub3_4.method6787(false);
			this.aClass132_Sub3_4.method6781(128);
			this.aClass132_Sub3_4.method6772(-2);
			this.aClass132_Sub3_4.method6759(this.aClass132_Sub3_4.aClass53_Sub2_6);
			this.aClass132_Sub3_4.method6770(7681, 8448);
			this.aClass132_Sub3_4.method6763(0, 770, 34166);
			this.aClass132_Sub3_4.method6760(34167, 0);
			for (@Pc(284) Class6 local284 = this.aClass362_4.method8538(); local284 != null; local284 = this.aClass362_4.method8530()) {
				@Pc(289) Class6_Sub55 local289 = (Class6_Sub55) local284;
				local289.method8855(arg5, arg3, arg6, arg2);
			}
			this.aClass132_Sub3_4.method6763(0, 768, 5890);
			this.aClass132_Sub3_4.method6760(5890, 0);
			this.aClass132_Sub3_4.method6759((Class53) null);
			this.aClass132_Sub3_4.L(local126, local224, this.aClass132_Sub3_4.anInt7892);
		}
		if (this.aClass98_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass132_Sub3_4.method6788(this.aClass214_2, this.aClass214_3, (Class214) null, (Class214) null);
		this.aClass98_1.method2103(arg3, arg5, arg2, arg4, arg6);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method875(arg5, arg6, arg2, arg1, arg4, arg0, arg3);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method875(-1, arg5, arg2, arg1, arg4, arg0, arg3);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7848(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt889 <= 0) {
			return;
		}
		this.aClass132_Sub3_4.method6765();
		this.aClass132_Sub3_4.method6774(false);
		this.aClass132_Sub3_4.method6742(false);
		this.aClass132_Sub3_4.method6764(false);
		this.aClass132_Sub3_4.method6787(false);
		this.aClass132_Sub3_4.method6781(0);
		this.aClass132_Sub3_4.method6772(-2);
		this.aClass132_Sub3_4.method6759((Class53) null);
		Static75.aFloatArray5[9] = 0.0F;
		Static75.aFloatArray5[7] = 0.0F;
		Static75.aFloatArray5[11] = 0.0F;
		Static75.aFloatArray5[6] = 0.0F;
		Static75.aFloatArray5[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass132_Sub3_4.anInt7710;
		Static75.aFloatArray5[2] = 0.0F;
		Static75.aFloatArray5[1] = 0.0F;
		Static75.aFloatArray5[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass132_Sub3_4.anInt7739) - 1.0F;
		Static75.aFloatArray5[10] = 0.0F;
		Static75.aFloatArray5[8] = 0.0F;
		Static75.aFloatArray5[0] = (float) 1024 / ((float) super.anInt9306 * 128.0F * (float) this.aClass132_Sub3_4.anInt7739);
		Static75.aFloatArray5[14] = 0.0F;
		Static75.aFloatArray5[4] = 0.0F;
		Static75.aFloatArray5[5] = (float) 1024 / ((float) super.anInt9306 * 128.0F * (float) this.aClass132_Sub3_4.anInt7710);
		Static75.aFloatArray5[3] = 0.0F;
		Static75.aFloatArray5[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static75.aFloatArray5, 0);
		Static75.aFloatArray5[6] = 1.0F;
		Static75.aFloatArray5[12] = 0.0F;
		Static75.aFloatArray5[5] = 0.0F;
		Static75.aFloatArray5[7] = 0.0F;
		Static75.aFloatArray5[1] = 0.0F;
		Static75.aFloatArray5[11] = 0.0F;
		Static75.aFloatArray5[8] = 0.0F;
		Static75.aFloatArray5[10] = 0.0F;
		Static75.aFloatArray5[9] = 1.0F;
		Static75.aFloatArray5[14] = 0.0F;
		Static75.aFloatArray5[4] = 0.0F;
		Static75.aFloatArray5[3] = 0.0F;
		Static75.aFloatArray5[0] = 1.0F;
		Static75.aFloatArray5[15] = 1.0F;
		Static75.aFloatArray5[13] = 0.0F;
		Static75.aFloatArray5[2] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static75.aFloatArray5, 0);
		if ((this.anInt868 & 0x7) == 0) {
			this.aClass132_Sub3_4.method6742(false);
		} else {
			this.aClass132_Sub3_4.method6742(true);
			this.aClass132_Sub3_4.method6813();
		}
		this.aClass132_Sub3_4.method6788(this.aClass214_2, this.aClass214_3, this.aClass214_4, this.aClass214_1);
		if (this.anInt879 * 2 <= this.aClass132_Sub3_4.aClass6_Sub23_Sub2_2.aByteArray101.length) {
			this.aClass132_Sub3_4.aClass6_Sub23_Sub2_2.anInt9901 = 0;
		} else {
			this.aClass132_Sub3_4.aClass6_Sub23_Sub2_2 = new Class6_Sub23_Sub2(this.anInt879 * 2);
		}
		@Pc(311) int local311 = 0;
		@Pc(315) Class6_Sub23_Sub2 local315 = this.aClass132_Sub3_4.aClass6_Sub23_Sub2_2;
		@Pc(321) int local321;
		@Pc(330) int local330;
		@Pc(332) int local332;
		@Pc(350) short[] local350;
		@Pc(354) int local354;
		if (this.aClass132_Sub3_4.aBoolean544) {
			for (local321 = arg1; local321 < arg3; local321++) {
				local330 = arg0 + local321 * super.anInt9314;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local321 - arg1]) {
						local350 = this.aShortArrayArray2[local330];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local311++;
								local315.method8347(local350[local354] & 0xFFFF);
							}
						}
					}
					local330++;
				}
			}
		} else {
			for (local321 = arg1; local321 < arg3; local321++) {
				local330 = arg0 + local321 * super.anInt9314;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local321 - arg1]) {
						local350 = this.aShortArrayArray2[local330];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local315.method8335(local350[local354] & 0xFFFF);
								local311++;
							}
						}
					}
					local330++;
				}
			}
		}
		if (local311 > 0) {
			@Pc(468) Class165_Sub2 local468 = new Class165_Sub2(this.aClass132_Sub3_4, 5123, local315.aByteArray101, local315.anInt9901);
			this.aClass132_Sub3_4.method6751(local311, local468, 0);
		}
	}

	@OriginalMember(owner = "client!bda", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray5[arg0][arg1] = (byte) arg2;
		}
	}
}
