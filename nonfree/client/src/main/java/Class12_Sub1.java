import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!aga", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!aga", name = "w", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!aga", name = "O", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!aga", name = "ab", descriptor = "[Lclient!nk;")
	private Class6_Sub41[] aClass6_Sub41Array1;

	@OriginalMember(owner = "client!aga", name = "gb", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!aga", name = "hb", descriptor = "Lclient!fw;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!aga", name = "ib", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!aga", name = "jb", descriptor = "Lclient!fw;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!aga", name = "kb", descriptor = "Lclient!bfa;")
	public Class34 aClass34_1;

	@OriginalMember(owner = "client!aga", name = "G", descriptor = "F")
	private float aFloat1 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!aga", name = "W", descriptor = "F")
	private float aFloat2 = -3.4028235E38F;

	@OriginalMember(owner = "client!aga", name = "T", descriptor = "Lclient!v;")
	private final Class362 aClass362_1 = new Class362();

	@OriginalMember(owner = "client!aga", name = "x", descriptor = "Lclient!lba;")
	public final Class132_Sub1 aClass132_Sub1_1;

	@OriginalMember(owner = "client!aga", name = "K", descriptor = "I")
	private final int anInt415;

	@OriginalMember(owner = "client!aga", name = "I", descriptor = "[[[Lclient!nk;")
	private Class6_Sub41[][][] aClass6_Sub41ArrayArrayArray1;

	@OriginalMember(owner = "client!aga", name = "eb", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "[[B")
	private final byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aga", name = "S", descriptor = "I")
	public final int anInt420;

	@OriginalMember(owner = "client!aga", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!aga", name = "C", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!aga", name = "H", descriptor = "I")
	private final int anInt414;

	@OriginalMember(owner = "client!aga", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!aga", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!aga", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!aga", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!aga", name = "B", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!aga", name = "Q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!aga", name = "db", descriptor = "Lclient!lk;")
	private Class209 aClass209_2;

	@OriginalMember(owner = "client!aga", name = "D", descriptor = "Lclient!bha;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!lba;IIII[[I[[II)V")
	public Class12_Sub1(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass132_Sub1_1 = arg0;
		this.anInt415 = super.anInt9312 - 2;
		this.aClass6_Sub41ArrayArrayArray1 = new Class6_Sub41[arg3][arg4][];
		this.aByteArrayArray2 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.aByteArrayArray1 = new byte[arg3][arg4];
		this.anInt420 = arg2;
		this.aFloatArrayArray1 = new float[super.anInt9314 + 1][super.anInt9313 + 1];
		this.aShortArrayArray1 = new short[arg4 * arg3][];
		this.anInt414 = 0x1 << this.anInt415;
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aFloatArrayArray2 = new float[super.anInt9314 + 1][super.anInt9313 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt9314 + 1][super.anInt9313 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt9313 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9314; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray53[local125][local121];
				if (this.aFloat1 > (float) local134) {
					this.aFloat1 = (float) local134;
				}
				if (this.aFloat2 < (float) local134) {
					this.aFloat2 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt9314 > local125 && super.anInt9313 > local121) {
					@Pc(190) int local190 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(207) int local207 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(226) float local226 = (float) (1.0D / Math.sqrt((double) (local207 * local207 + arg7 * arg7 * 4 + local190 * local190)));
					this.aFloatArrayArray3[local125][local121] = (float) local190 * local226;
					this.aFloatArrayArray1[local125][local121] = local226 * (float) (-arg7 * 2);
					this.aFloatArrayArray2[local125][local121] = local226 * (float) local207;
				}
			}
		}
		this.aFloat2++;
		this.aFloat1--;
		this.aClass209_2 = new Class209(128);
		if ((this.anInt420 & 0x10) != 0) {
			this.aClass36_1 = new Class36(this.aClass132_Sub1_1, this);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method447(arg2, -1, arg3, arg5, arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!aga", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray2[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
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

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7852(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass36_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass132_Sub1_1.anInt8968 >> 8) >> this.aClass132_Sub1_1.anInt8967;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass132_Sub1_1.anInt8979 >> 8) >> this.aClass132_Sub1_1.anInt8967;
			return this.aClass36_1.method934(arg0, local40, local25);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIBLclient!ua;)V")
	private void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub4_Sub5_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray6[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray1[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static432.anIntArray489.length) {
			Static432.anIntArray489 = new int[local22];
			Static522.anIntArray576 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static432.anIntArray489[local34] = local12[local34] >> this.aClass132_Sub1_1.anInt8967;
			Static522.anIntArray576[local34] = local19[local34] >> this.aClass132_Sub1_1.anInt8967;
		}
		@Pc(70) int local70 = 0;
		while (local70 < local22) {
			@Pc(76) int local76 = Static432.anIntArray489[local70];
			@Pc(81) int local81 = Static522.anIntArray576[local70++];
			@Pc(85) int local85 = Static432.anIntArray489[local70];
			@Pc(90) int local90 = Static522.anIntArray576[local70++];
			@Pc(94) int local94 = Static432.anIntArray489[local70];
			@Pc(99) int local99 = Static522.anIntArray576[local70++];
			if (-((local94 - local85) * (local90 + -local81)) + (local90 - local99) * (local76 - local85) > 0) {
				arg2.method8140(local85, local90, local94, local76, local81, local99);
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!sca;[I)V")
	@Override
	public void method7856(@OriginalArg(0) Class6_Sub17 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass362_1.method8536(new Class6_Sub30(this.aClass132_Sub1_1, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method447(arg2, arg5, arg3, arg6, arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!aga", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class6_Sub4_Sub5 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub5 arg2) {
		if ((this.aByteArrayArray1[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9306 >> this.aClass132_Sub1_1.anInt8967;
		@Pc(27) Class6_Sub4_Sub5_Sub2 local27 = (Class6_Sub4_Sub5_Sub2) arg2;
		@Pc(43) Class6_Sub4_Sub5_Sub2 local43;
		if (local27 != null && local27.method8139(local24, local24)) {
			local43 = local27;
			local27.method8138();
		} else {
			local43 = new Class6_Sub4_Sub5_Sub2(this.aClass132_Sub1_1, local24, local24);
		}
		local43.method8144(0, 0, local24, local24);
		this.method445(arg1, arg0, local43);
		return local43;
	}

	@OriginalMember(owner = "client!aga", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt424 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt9314 + 1][super.anInt9313 + 1];
			for (@Pc(23) int local23 = 1; local23 < super.anInt9314; local23++) {
				for (@Pc(27) int local27 = 1; super.anInt9313 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray2[local23 - 1][local27] >> 2) + (this.aByteArrayArray2[local23 + 1][local27] >> 3) + (this.aByteArrayArray2[local23][local27 + -1] >> 2) + (this.aByteArrayArray2[local23][local27 + 1] >> 3) + (this.aByteArrayArray2[local23][local27] >> 1));
				}
			}
			@Pc(107) Class6_Sub41[] local107 = new Class6_Sub41[this.aClass209_2.method5033()];
			this.aClass209_2.method5032(local107);
			for (@Pc(115) int local115 = 0; local115 < local107.length; local115++) {
				local107[local115].method5721(this.anInt424);
			}
			@Pc(135) int local135 = 20;
			if (this.anIntArrayArrayArray2 != null) {
				local135 += 4;
			}
			if ((this.anInt420 & 0x7) != 0) {
				local135 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass132_Sub1_1.aNativeHeap5.a(this.anInt424 * 4, false);
			@Pc(165) NativeHeapBuffer local165 = this.aClass132_Sub1_1.aNativeHeap5.a(this.anInt424 * local135, false);
			@Pc(170) Stream local170 = new Stream(local165);
			@Pc(175) Stream local175 = new Stream(local155);
			@Pc(179) Class6_Sub41[] local179 = new Class6_Sub41[this.anInt424];
			@Pc(186) int local186 = Static199.method2911(this.anInt424 / 4);
			if (local186 < 1) {
				local186 = 1;
			}
			@Pc(196) Class209 local196 = new Class209(local186);
			@Pc(200) Class6_Sub41[] local200 = new Class6_Sub41[this.anInt423];
			@Pc(206) int local206;
			for (@Pc(202) int local202 = 0; super.anInt9314 > local202; local202++) {
				for (local206 = 0; local206 < super.anInt9313; local206++) {
					if (this.anIntArrayArrayArray3[local202][local206] != null) {
						@Pc(222) Class6_Sub41[] local222 = this.aClass6_Sub41ArrayArrayArray1[local202][local206];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray6[local202][local206];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray1[local202][local206];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray5[local202][local206];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray3[local202][local206];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local202][local206];
						if (local243 == null) {
							local243 = local250;
						}
						@Pc(278) int[] local278 = this.anIntArrayArrayArray2 == null ? null : this.anIntArrayArrayArray2[local202][local206];
						@Pc(285) float local285 = this.aFloatArrayArray3[local202][local206];
						@Pc(292) float local292 = this.aFloatArrayArray1[local202][local206];
						@Pc(299) float local299 = this.aFloatArrayArray2[local202][local206];
						@Pc(308) float local308 = this.aFloatArrayArray3[local202][local206 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray1[local202][local206 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray2[local202][local206 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray3[local202 + 1][local206 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray1[local202 + 1][local206 + 1];
						@Pc(359) float local359 = this.aFloatArrayArray2[local202 + 1][local206 + 1];
						@Pc(368) float local368 = this.aFloatArrayArray3[local202 + 1][local206];
						@Pc(377) float local377 = this.aFloatArrayArray1[local202 + 1][local206];
						@Pc(386) float local386 = this.aFloatArrayArray2[local202 + 1][local206];
						@Pc(394) int local394 = local21[local202][local206] & 0xFF;
						@Pc(404) int local404 = local21[local202][local206 + 1] & 0xFF;
						@Pc(416) int local416 = local21[local202 + 1][local206 + 1] & 0xFF;
						@Pc(426) int local426 = local21[local202 + 1][local206] & 0xFF;
						@Pc(428) int local428 = 0;
						@Pc(438) int local438;
						label355: for (@Pc(430) int local430 = 0; local430 < local250.length; local430++) {
							@Pc(436) Class6_Sub41 local436 = local222[local430];
							for (local438 = 0; local438 < local428; local438++) {
								if (local200[local438] == local436) {
									continue label355;
								}
							}
							local200[local428++] = local436;
						}
						@Pc(475) short[] local475 = this.aShortArrayArray1[local202 + super.anInt9314 * local206] = new short[local250.length];
						for (local438 = 0; local438 < local250.length; local438++) {
							@Pc(488) int local488 = (local202 << super.anInt9312) + local229[local438];
							@Pc(498) int local498 = (local206 << super.anInt9312) + local236[local438];
							@Pc(503) int local503 = local488 >> this.anInt415;
							@Pc(508) int local508 = local498 >> this.anInt415;
							@Pc(512) int local512 = local250[local438];
							@Pc(516) int local516 = local243[local438];
							@Pc(524) int local524 = local262 == null ? 0 : local262[local438];
							@Pc(542) long local542 = (long) local512 << 32 | (long) local516 << 48 | (long) (local503 << 16) | (long) local508;
							@Pc(546) int local546 = local229[local438];
							@Pc(550) int local550 = local236[local438];
							@Pc(552) byte local552 = 74;
							@Pc(554) int local554 = 0;
							@Pc(585) float local585;
							@Pc(587) float local587;
							@Pc(579) float local579;
							@Pc(642) float local642;
							@Pc(583) int local583;
							if (local546 == 0 && local550 == 0) {
								local583 = local552 - local394;
								local585 = local285;
								local587 = local292;
								local579 = local299;
							} else if (local546 == 0 && local550 == super.anInt9306) {
								local579 = local326;
								local583 = local552 - local404;
								local585 = local308;
								local587 = local317;
							} else if (super.anInt9306 == local546 && local550 == super.anInt9306) {
								local583 = local552 - local416;
								local579 = local359;
								local585 = local337;
								local587 = local348;
							} else if (local546 == super.anInt9306 && local550 == 0) {
								local579 = local386;
								local585 = local368;
								local587 = local377;
								local583 = local552 - local426;
							} else {
								@Pc(618) float local618 = (float) local546 / (float) super.anInt9306;
								@Pc(625) float local625 = (float) local550 / (float) super.anInt9306;
								@Pc(634) float local634 = local285 + local618 * (local368 - local285);
								local642 = (local377 - local292) * local618 + local292;
								@Pc(650) float local650 = local299 + (local386 - local299) * local618;
								@Pc(659) float local659 = (local337 - local308) * local618 + local308;
								@Pc(668) float local668 = local317 + local618 * (local348 - local317);
								@Pc(676) float local676 = local326 + local618 * (local359 - local326);
								local587 = local642 + (local668 - local642) * local625;
								local585 = (local659 - local634) * local625 + local634;
								local579 = local650 + local625 * (local676 - local650);
								@Pc(713) int local713 = ((local426 - local394) * local546 >> super.anInt9312) + local394;
								@Pc(725) int local725 = local404 + (local546 * (local416 - local404) >> super.anInt9312);
								local583 = local552 - (local550 * (local725 - local713) >> super.anInt9312) - local713;
							}
							@Pc(777) float local777 = 1.0F;
							if (local512 != -1) {
								@Pc(789) int local789 = (local512 & 0x7F) * local583 >> 7;
								if (local789 < 2) {
									local789 = 2;
								} else if (local789 > 126) {
									local789 = 126;
								}
								local554 = Static70.anIntArray71[local789 | local512 & 0xFF80];
								if ((this.anInt420 & 0x7) == 0) {
									local777 = local585 * this.aClass132_Sub1_1.aFloatArray63[0] + this.aClass132_Sub1_1.aFloatArray63[1] * local587 + local579 * this.aClass132_Sub1_1.aFloatArray63[2];
									local777 = this.aClass132_Sub1_1.aFloat177 + local777 * (local777 > 0.0F ? this.aClass132_Sub1_1.aFloat176 : this.aClass132_Sub1_1.aFloat169);
								}
							}
							@Pc(865) Class6 local865 = null;
							if ((local488 & this.anInt414 - 1) == 0 && (local498 & this.anInt414 - 1) == 0) {
								local865 = local196.method5038(local542);
							}
							@Pc(1210) int local1210;
							@Pc(895) int local895;
							if (local865 == null) {
								if (local516 == local512) {
									local895 = local554;
								} else {
									@Pc(905) int local905 = local583 * (local516 & 0x7F) >> 7;
									if (local905 < 2) {
										local905 = 2;
									} else if (local905 > 126) {
										local905 = 126;
									}
									local895 = Static70.anIntArray71[local516 & 0xFF80 | local905];
									if ((this.anInt420 & 0x7) == 0) {
										local642 = this.aClass132_Sub1_1.aFloatArray63[2] * local579 + local587 * this.aClass132_Sub1_1.aFloatArray63[1] + local585 * this.aClass132_Sub1_1.aFloatArray63[0];
										local642 = this.aClass132_Sub1_1.aFloat177 + (local777 > 0.0F ? this.aClass132_Sub1_1.aFloat176 : this.aClass132_Sub1_1.aFloat169) * local777;
										@Pc(985) int local985 = local895 >> 16 & 0xFF;
										@Pc(991) int local991 = local895 >> 8 & 0xFF;
										local985 = (int) ((float) local985 * local642);
										@Pc(1001) int local1001 = local895 & 0xFF;
										if (local985 < 0) {
											local985 = 0;
										} else if (local985 > 255) {
											local985 = 255;
										}
										local991 = (int) ((float) local991 * local642);
										local1001 = (int) ((float) local1001 * local642);
										if (local991 < 0) {
											local991 = 0;
										} else if (local991 > 255) {
											local991 = 255;
										}
										if (local1001 < 0) {
											local1001 = 0;
										} else if (local1001 > 255) {
											local1001 = 255;
										}
										local895 = local985 << 16 | local991 << 8 | local1001;
									}
								}
								if (Stream.b()) {
									local170.a((float) local488);
									local170.a((float) (local524 + this.method7854(local498, local488)));
									local170.a((float) local498);
									local170.a((float) local488);
									local170.a((float) local498);
									if (this.anIntArrayArrayArray2 != null) {
										local170.a((float) (local278 == null ? 0 : local278[local438] - 1));
									}
									if ((this.anInt420 & 0x7) != 0) {
										local170.a(local585);
										local170.a(local587);
										local170.a(local579);
									}
								} else {
									local170.b((float) local488);
									local170.b((float) (local524 + this.method7854(local498, local488)));
									local170.b((float) local498);
									local170.b((float) local488);
									local170.b((float) local498);
									if (this.anIntArrayArrayArray2 != null) {
										local170.b((float) (local278 == null ? 0 : local278[local438] - 1));
									}
									if ((this.anInt420 & 0x7) != 0) {
										local170.b(local585);
										local170.b(local587);
										local170.b(local579);
									}
								}
								if (this.aClass132_Sub1_1.anInt8981 == 0) {
									local175.f(local895 | 0xFF000000);
								} else {
									local175.e(local895 | 0xFF000000);
								}
								local1210 = this.anInt417++;
								local475[local438] = (short) local1210;
								if (local512 != -1) {
									local179[local1210] = local222[local438];
								}
								local196.method5035(local542, new Class6_Sub40(local475[local438]));
							} else {
								local475[local438] = ((Class6_Sub40) local865).aShort83;
								local1210 = local475[local438] & 0xFFFF;
								if (local512 != -1 && local179[local1210].aLong314 > local222[local438].aLong314) {
									local179[local1210] = local222[local438];
								}
							}
							for (local895 = 0; local895 < local428; local895++) {
								local200[local895].method5726(local1210, local583, local554, local777);
							}
							this.anInt408++;
						}
					}
				}
			}
			for (local206 = 0; local206 < this.anInt417; local206++) {
				@Pc(1326) Class6_Sub41 local1326 = local179[local206];
				if (local1326 != null) {
					local1326.method5722(local206);
				}
			}
			@Pc(1343) int local1343;
			@Pc(1361) int local1361;
			for (@Pc(1339) int local1339 = 0; local1339 < super.anInt9314; local1339++) {
				for (local1343 = 0; super.anInt9313 > local1343; local1343++) {
					@Pc(1355) short[] local1355 = this.aShortArrayArray1[local1339 + super.anInt9314 * local1343];
					if (local1355 != null) {
						@Pc(1359) int local1359 = 0;
						local1361 = 0;
						while (local1361 < local1355.length) {
							@Pc(1370) int local1370 = local1355[local1361++] & 0xFFFF;
							@Pc(1377) int local1377 = local1355[local1361++] & 0xFFFF;
							@Pc(1384) int local1384 = local1355[local1361++] & 0xFFFF;
							@Pc(1388) Class6_Sub41 local1388 = local179[local1370];
							@Pc(1392) Class6_Sub41 local1392 = local179[local1377];
							@Pc(1396) Class6_Sub41 local1396 = local179[local1384];
							@Pc(1398) Class6_Sub41 local1398 = null;
							if (local1388 != null) {
								local1388.method5724(local1359, local1339, local1343);
								local1398 = local1388;
							}
							if (local1392 != null) {
								local1392.method5724(local1359, local1339, local1343);
								if (local1398 == null || local1392.aLong314 < local1398.aLong314) {
									local1398 = local1392;
								}
							}
							if (local1396 != null) {
								local1396.method5724(local1359, local1339, local1343);
								if (local1398 == null || local1396.aLong314 < local1398.aLong314) {
									local1398 = local1396;
								}
							}
							if (local1398 != null) {
								if (local1388 != null) {
									local1398.method5722(local1370);
								}
								if (local1392 != null) {
									local1398.method5722(local1377);
								}
								if (local1396 != null) {
									local1398.method5722(local1384);
								}
								local1398.method5724(local1359, local1339, local1343);
							}
							local1359++;
						}
					}
				}
			}
			local170.c();
			local175.c();
			this.anInterface12_1 = this.aClass132_Sub1_1.method7564(false);
			this.anInterface12_1.method8890(4, local155, this.anInt417 * 4);
			this.anInterface12_2 = this.aClass132_Sub1_1.method7564(false);
			this.anInterface12_2.method8890(local135, local165, this.anInt417 * local135);
			if ((this.anInt420 & 0x7) == 0) {
				if (this.anIntArrayArrayArray2 == null) {
					this.aClass34_1 = this.aClass132_Sub1_1.method7549(new Class168[] { new Class168(new Class116[] { Static174.aClass116_1, Static174.aClass116_5 }), new Class168(Static174.aClass116_3) });
				} else {
					this.aClass34_1 = this.aClass132_Sub1_1.method7549(new Class168[] { new Class168(new Class116[] { Static174.aClass116_1, Static174.aClass116_5, Static174.aClass116_4 }), new Class168(Static174.aClass116_3) });
				}
			} else if (this.anIntArrayArrayArray2 == null) {
				this.aClass34_1 = this.aClass132_Sub1_1.method7549(new Class168[] { new Class168(new Class116[] { Static174.aClass116_1, Static174.aClass116_5, Static174.aClass116_2 }), new Class168(Static174.aClass116_3) });
			} else {
				this.aClass34_1 = this.aClass132_Sub1_1.method7549(new Class168[] { new Class168(new Class116[] { Static174.aClass116_1, Static174.aClass116_5, Static174.aClass116_4, Static174.aClass116_2 }), new Class168(Static174.aClass116_3) });
			}
			local1343 = 0;
			for (@Pc(1705) int local1705 = 0; local1705 < local107.length; local1705++) {
				if (local107[local1705].anInt6678 > 0) {
					local107[local1343++] = local107[local1705];
				}
			}
			this.aClass6_Sub41Array1 = new Class6_Sub41[local1343];
			@Pc(1735) long[] local1735 = new long[local1343];
			for (local1361 = 0; local1361 < local1343; local1361++) {
				@Pc(1743) Class6_Sub41 local1743 = local107[local1361];
				local1735[local1361] = local1743.aLong314;
				this.aClass6_Sub41Array1[local1361] = local1743;
				local1743.method5723(this.anInt417);
			}
			Static151.method2160(local1735, this.aClass6_Sub41Array1);
			if (this.aClass36_1 != null) {
				this.aClass36_1.method932();
			}
		} else {
			this.aClass36_1 = null;
		}
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray1 = null;
		this.anIntArrayArrayArray5 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray1 = this.aFloatArrayArray2 = null;
		this.aByteArrayArray2 = null;
		this.aClass6_Sub41ArrayArrayArray1 = null;
		this.aClass209_2 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray3 = null;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V")
	@Override
	public void method7847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[[ZIZIII)V")
	private void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass6_Sub41Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg0 + arg0 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (Static607.anIntArray657.length < local18) {
			Static607.anIntArray657 = new int[local18];
		}
		@Pc(34) int local34 = arg5 - arg0;
		@Pc(36) int local36 = local34;
		if (local34 < 0) {
			local34 = 0;
		}
		@Pc(48) int local48 = arg6 - arg0;
		@Pc(50) int local50 = local48;
		if (local48 < 0) {
			local48 = 0;
		}
		@Pc(58) int local58 = arg0 + arg5;
		if (super.anInt9314 - 1 < local58) {
			local58 = super.anInt9314 - 1;
		}
		@Pc(78) int local78 = arg6 + arg0;
		if (super.anInt9313 - 1 < local78) {
			local78 = super.anInt9313 - 1;
		}
		Static64.anInt1187 = 0;
		for (@Pc(93) int local93 = local34; local93 <= local58; local93++) {
			@Pc(101) boolean[] local101 = arg2[local93 - local36];
			for (@Pc(103) int local103 = local48; local103 <= local78; local103++) {
				if (local101[local103 - local50]) {
					Static607.anIntArray657[Static64.anInt1187++] = local103 * super.anInt9314 + local93;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass132_Sub1_1.method7531();
		} else {
			this.aClass132_Sub1_1.method7557((float) arg1);
			this.aClass132_Sub1_1.method7601();
		}
		this.aClass132_Sub1_1.method7641();
		this.aClass132_Sub1_1.method7536((this.anInt420 & 0x7) != 0);
		this.aClass132_Sub1_1.method7610(false, false, -1);
		this.aClass132_Sub1_1.method7529(this.anInterface12_2, 0);
		for (@Pc(193) int local193 = 0; local193 < this.aClass6_Sub41Array1.length; local193++) {
			this.aClass6_Sub41Array1[local193].method5725(Static607.anIntArray657, Static64.anInt1187);
		}
		@Pc(214) Class207_Sub3 local214 = this.aClass132_Sub1_1.method7609();
		local214.method8212(0, -1, 0);
		this.aClass132_Sub1_1.method7571();
		if (!this.aClass362_1.method8541()) {
			@Pc(232) int local232 = this.aClass132_Sub1_1.anInt8984;
			@Pc(236) int local236 = this.aClass132_Sub1_1.anInt9002;
			this.aClass132_Sub1_1.L(0, local236, this.aClass132_Sub1_1.anInt8982);
			this.aClass132_Sub1_1.method7536(false);
			this.aClass132_Sub1_1.method7622(false);
			this.aClass132_Sub1_1.method7547(128);
			this.aClass132_Sub1_1.method7610(false, false, -2);
			this.aClass132_Sub1_1.method7635(this.aClass132_Sub1_1.anInterface17_3);
			this.aClass132_Sub1_1.method7637(Static131.aClass322_3, Static320.aClass322_5);
			this.aClass132_Sub1_1.method7552(Static583.aClass378_3, 0);
			this.aClass132_Sub1_1.method7598(0, Static568.aClass378_2);
			for (@Pc(298) Class6 local298 = this.aClass362_1.method8538(); local298 != null; local298 = this.aClass362_1.method8530()) {
				@Pc(303) Class6_Sub30 local303 = (Class6_Sub30) local298;
				local303.method4010(arg6, arg0, arg2, arg5);
			}
			this.aClass132_Sub1_1.method7552(Static368.aClass378_1, 0);
			this.aClass132_Sub1_1.method7598(0, Static368.aClass378_1);
			this.aClass132_Sub1_1.method7635((Interface17) null);
			this.aClass132_Sub1_1.L(local232, local236, this.aClass132_Sub1_1.anInt8982);
		}
		if (this.aClass36_1 != null) {
			this.aClass132_Sub1_1.method7529(this.anInterface12_2, 0);
			this.aClass132_Sub1_1.method7529(this.anInterface12_1, 1);
			this.aClass132_Sub1_1.method7628(this.aClass34_1);
			this.aClass36_1.method937(arg4, arg2, arg0, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!aga", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass36_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass132_Sub1_1.anInt8968 * arg2 >> 8) >> this.aClass132_Sub1_1.anInt8967;
			@Pc(39) int local39 = arg3 - (this.aClass132_Sub1_1.anInt8979 * arg2 >> 8) >> this.aClass132_Sub1_1.anInt8967;
			this.aClass36_1.method930(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7848(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt424 <= 0) {
			return;
		}
		@Pc(16) Interface21 local16 = this.aClass132_Sub1_1.method7606(this.anInt408);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method5806();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass132_Sub1_1.method7592(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.b()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9314 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray1[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local18++;
										if (local20 > local87) {
											local20 = local87;
										}
										local41.b(local87);
										if (local87 > local22) {
											local22 = local87;
										}
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9314 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray1[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local87 > local22) {
											local22 = local87;
										}
										local41.c(local87);
										if (local87 < local20) {
											local20 = local87;
										}
										local18++;
									}
								}
							}
							local54++;
						}
					}
				}
				local41.c();
				if (local16.method5808()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass132_Sub1_1.method7540();
		this.aClass132_Sub1_1.method7642(false);
		this.aClass132_Sub1_1.method7536(false);
		this.aClass132_Sub1_1.method7623(false);
		this.aClass132_Sub1_1.method7622(false);
		this.aClass132_Sub1_1.method7547(0);
		this.aClass132_Sub1_1.method7610(false, false, -2);
		this.aClass132_Sub1_1.method7635((Interface17) null);
		@Pc(260) Class207_Sub3 local260 = this.aClass132_Sub1_1.method7609();
		@Pc(265) float[] local265 = this.aClass132_Sub1_1.method7587();
		local265[10] = 1.0F / (this.aFloat2 - this.aFloat1);
		local265[7] = 0.0F;
		local265[9] = 0.0F;
		local265[11] = 0.0F;
		local265[4] = 0.0F;
		local265[8] = 0.0F;
		local265[14] = -this.aFloat1 / (this.aFloat2 - this.aFloat1);
		local265[1] = 0.0F;
		local265[6] = 0.0F;
		local265[5] = (float) 1024 / ((float) this.aClass132_Sub1_1.anInt8893 * (float) super.anInt9306 * 128.0F);
		local265[3] = 0.0F;
		local265[2] = 0.0F;
		local265[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass132_Sub1_1.anInt8924) - 1.0F;
		local265[0] = (float) 1024 / ((float) super.anInt9306 * 128.0F * (float) this.aClass132_Sub1_1.anInt8924);
		local265[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass132_Sub1_1.anInt8893;
		local265[15] = 1.0F;
		local260.method8222(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F);
		this.aClass132_Sub1_1.method7615();
		this.aClass132_Sub1_1.method7571();
		if ((this.anInt420 & 0x7) == 0) {
			this.aClass132_Sub1_1.method7536(false);
		} else {
			this.aClass132_Sub1_1.method7536(true);
			this.aClass132_Sub1_1.method7580();
		}
		this.aClass132_Sub1_1.method7584(false);
		this.aClass132_Sub1_1.method7529(this.anInterface12_2, 0);
		this.aClass132_Sub1_1.method7529(this.anInterface12_1, 1);
		this.aClass132_Sub1_1.method7628(this.aClass34_1);
		this.aClass132_Sub1_1.method7573(0, Static122.aClass60_1, local16, local18 / 3, local20, local22 + 1 - local20);
		this.aClass132_Sub1_1.method7584(true);
	}

	@OriginalMember(owner = "client!aga", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass36_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass132_Sub1_1.anInt8968 * arg2 >> 8) >> this.aClass132_Sub1_1.anInt8967;
			@Pc(39) int local39 = arg3 - (this.aClass132_Sub1_1.anInt8979 * arg2 >> 8) >> this.aClass132_Sub1_1.anInt8967;
			this.aClass36_1.method936(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!aga", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface6 local9 = this.aClass132_Sub1_1.anInterface6_11;
		if (arg5 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[super.anInt9314][super.anInt9313][];
		}
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt9314][super.anInt9313][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray1[arg0][arg1] = arg4;
		this.anIntArrayArrayArray3[arg0][arg1] = arg6;
		this.anIntArrayArrayArray5[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(92) Class6_Sub41[] local92 = this.aClass6_Sub41ArrayArrayArray1[arg0][arg1] = new Class6_Sub41[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt420 & 0x20) != 0 && local100 != -1 && local9.method7088(local100).aBoolean573) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(148) long local148 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (local104 << 14) | (long) local100;
			@Pc(154) Class6 local154;
			for (local154 = this.aClass209_2.method5038(local148); local154 != null; local154 = this.aClass209_2.method5042()) {
				@Pc(159) Class6_Sub41 local159 = (Class6_Sub41) local154;
				if (local100 == local159.anInt6674 && (float) local104 == local159.aFloat78 && local159.anInt6679 == arg10 && local159.anInt6677 == arg11 && arg12 == local159.anInt6676) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class6_Sub41(this, local100, local104, arg10, arg11, arg12);
				this.aClass209_2.method5035(local148, local92[local94]);
			} else {
				local92[local94] = (Class6_Sub41) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray1[arg0][arg1] = (byte) (this.aByteArrayArray1[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt423) {
			this.anInt423 = arg6.length;
		}
		this.anInt424 += arg6.length;
	}
}
