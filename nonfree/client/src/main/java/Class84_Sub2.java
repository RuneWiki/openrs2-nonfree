import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class84_Sub2 extends Class84 {

	@OriginalMember(owner = "client!tn", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!tn", name = "N", descriptor = "I")
	private int anInt6385;

	@OriginalMember(owner = "client!tn", name = "T", descriptor = "I")
	private int anInt6389;

	@OriginalMember(owner = "client!tn", name = "U", descriptor = "Lclient!eo;")
	private Interface5 anInterface5_7;

	@OriginalMember(owner = "client!tn", name = "V", descriptor = "I")
	private int anInt6390;

	@OriginalMember(owner = "client!tn", name = "Y", descriptor = "I")
	private int anInt6391;

	@OriginalMember(owner = "client!tn", name = "Z", descriptor = "Lclient!ot;")
	public Class195 aClass195_12;

	@OriginalMember(owner = "client!tn", name = "ab", descriptor = "[Lclient!uc;")
	private Class6_Sub39[] aClass6_Sub39Array1;

	@OriginalMember(owner = "client!tn", name = "bb", descriptor = "Lclient!ot;")
	private Class195 aClass195_13;

	@OriginalMember(owner = "client!tn", name = "db", descriptor = "Lclient!ot;")
	public Class195 aClass195_14;

	@OriginalMember(owner = "client!tn", name = "eb", descriptor = "Lclient!ot;")
	public Class195 aClass195_15;

	@OriginalMember(owner = "client!tn", name = "R", descriptor = "Lclient!ft;")
	private final Class88 aClass88_44 = new Class88();

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	private final int anInt6367 = this.anInt6366 - 2;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "[[I")
	private final int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!tn", name = "I", descriptor = "Lclient!bl;")
	public final Class28_Sub1 aClass28_Sub1_37;

	@OriginalMember(owner = "client!tn", name = "y", descriptor = "[[B")
	private final byte[][] aByteArrayArray39;

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
	public final int anInt6381;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "[[[Lclient!uc;")
	private Class6_Sub39[][][] aClass6_Sub39ArrayArrayArray1;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!tn", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!tn", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!tn", name = "hb", descriptor = "[[B")
	private byte[][] aByteArrayArray40;

	@OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
	private final int anInt6384;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!tn", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!tn", name = "cb", descriptor = "Lclient!ke;")
	private Class137 aClass137_32;

	@OriginalMember(owner = "client!tn", name = "S", descriptor = "Lclient!fv;")
	private Class90 aClass90_2;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!bl;IIII[[I[[II)V")
	public Class84_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray57 = arg5;
		this.aClass28_Sub1_37 = arg0;
		this.aByteArrayArray39 = new byte[arg3][arg4];
		this.anInt6381 = arg2;
		this.aClass6_Sub39ArrayArrayArray1 = new Class6_Sub39[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt6363 + 1][super.anInt6360 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt6363 + 1][super.anInt6360 + 1];
		this.aByteArrayArray40 = new byte[arg3 + 1][arg4 + 1];
		this.anInt6384 = 0x1 << this.anInt6367;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aFloatArrayArray8 = new float[super.anInt6363 + 1][super.anInt6360 + 1];
		this.aShortArrayArray7 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; local117 < super.anInt6360; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt6363 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + arg7 * 4 * arg7 + local139 * local139)));
				this.aFloatArrayArray7[local121][local117] = (float) local139 * local175;
				this.aFloatArrayArray8[local121][local117] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray6[local121][local117] = local175 * (float) local156;
			}
		}
		this.aClass137_32 = new Class137(128);
		if ((this.anInt6381 & 0x10) != 0) {
			this.aClass90_2 = new Class90(this.aClass28_Sub1_37, this);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZLclient!un;)V")
	private void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub1_Sub8_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (Static447.anIntArray623.length < local22) {
			Static245.anIntArray377 = new int[local22];
			Static447.anIntArray623 = new int[local22];
		}
		for (@Pc(41) int local41 = 0; local41 < local22; local41++) {
			Static447.anIntArray623[local41] = (local12[local41] & 0xFF) >> this.aClass28_Sub1_37.anInt736;
			Static245.anIntArray377[local41] = (local19[local41] & 0xFF) >> this.aClass28_Sub1_37.anInt736;
		}
		@Pc(77) int local77 = 0;
		while (local22 > local77) {
			@Pc(83) int local83 = Static447.anIntArray623[local77];
			@Pc(88) int local88 = Static245.anIntArray377[local77++];
			@Pc(92) int local92 = Static447.anIntArray623[local77];
			@Pc(97) int local97 = Static245.anIntArray377[local77++];
			@Pc(101) int local101 = Static447.anIntArray623[local77];
			@Pc(106) int local106 = Static245.anIntArray377[local77++];
			if ((local83 - local92) * (local97 + -local106) - (local101 - local92) * (local97 - local88) > 0) {
				arg2.method5584(local101, local83, local106, local97, local88, local92);
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5337(arg0, arg1, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)I")
	@Override
	public int method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt6366;
		@Pc(13) int local13 = arg1 >> super.anInt6366;
		if (local8 < 0 || local13 < 0 || super.anInt6363 - 1 < local8 || local13 > super.anInt6360 - 1) {
			return 0;
		}
		@Pc(41) int local41 = super.anInt6362 - 1 & arg0;
		@Pc(48) int local48 = super.anInt6362 - 1 & arg1;
		@Pc(75) int local75 = local41 * this.anIntArrayArray57[local8 + 1][local13] + this.anIntArrayArray57[local8][local13] * (super.anInt6362 - local41) >> super.anInt6366;
		@Pc(107) int local107 = (super.anInt6362 - local41) * this.anIntArrayArray57[local8][local13 + 1] + local41 * this.anIntArrayArray57[local8 + 1][local13 + 1] >> super.anInt6366;
		return local75 * (super.anInt6362 - local48) + local107 * local48 >> super.anInt6366;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I")
	@Override
	public int method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray57[arg0][arg1];
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
	@Override
	public void method5325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!h;)Lclient!h;")
	@Override
	public Class6_Sub1_Sub8 method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1_Sub8 arg2) {
		if ((this.aByteArrayArray39[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt6362 >> this.aClass28_Sub1_37.anInt736;
		@Pc(27) Class6_Sub1_Sub8_Sub1 local27 = (Class6_Sub1_Sub8_Sub1) arg2;
		@Pc(37) Class6_Sub1_Sub8_Sub1 local37;
		if (local27 != null && local27.method5583(local24, local24)) {
			local37 = local27;
			local27.method5581();
		} else {
			local37 = new Class6_Sub1_Sub8_Sub1(this.aClass28_Sub1_37, local24, local24);
		}
		local37.method5585(local24, 0, local24, 0);
		this.method5335(arg0, arg1, local37);
		return local37;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ki;[I)V")
	@Override
	public void method5323(@OriginalArg(0) Class6_Sub6 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass88_44.method1878(new Class6_Sub10(this.aClass28_Sub1_37, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.method5327(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
	@Override
	public void method5320() {
		if (this.anInt6390 <= 0) {
			this.aClass90_2 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt6363 + 1][super.anInt6360 + 1];
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 1; local24 < super.anInt6363; local24++) {
				for (local28 = 1; local28 < super.anInt6360; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray40[local24][local28] >> 1) + (this.aByteArrayArray40[local24][local28 + 1] >> 3) + (this.aByteArrayArray40[local24 + -1][local28] >> 2) + (this.aByteArrayArray40[local24 + 1][local28] >> 3) + (this.aByteArrayArray40[local24][local28 + -1] >> 2));
				}
			}
			this.aClass6_Sub39Array1 = new Class6_Sub39[this.aClass137_32.method3177()];
			this.aClass137_32.method3172(this.aClass6_Sub39Array1);
			for (local28 = 0; local28 < this.aClass6_Sub39Array1.length; local28++) {
				this.aClass6_Sub39Array1[local28].method5431(this.anInt6390);
			}
			@Pc(144) int local144 = 24;
			if (this.anIntArrayArrayArray11 != null) {
				local144 += 4;
			}
			if ((this.anInt6381 & 0x7) != 0) {
				local144 += 12;
			}
			@Pc(163) NativeBuffer local163 = this.aClass28_Sub1_37.aNativeHeap1.a(this.anInt6390 * local144);
			@Pc(168) NativeStream local168 = new NativeStream(local163);
			@Pc(172) Class6_Sub39[] local172 = new Class6_Sub39[this.anInt6390];
			@Pc(180) Class137 local180 = new Class137(Static191.method2948(this.anInt6390));
			@Pc(184) Class6_Sub39[] local184 = new Class6_Sub39[this.anInt6391];
			@Pc(190) int local190;
			for (@Pc(186) int local186 = 0; local186 < super.anInt6363; local186++) {
				for (local190 = 0; super.anInt6360 > local190; local190++) {
					if (this.anIntArrayArrayArray12[local186][local190] != null) {
						@Pc(206) Class6_Sub39[] local206 = this.aClass6_Sub39ArrayArrayArray1[local186][local190];
						@Pc(213) int[] local213 = this.anIntArrayArrayArray7[local186][local190];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray8[local186][local190];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray9[local186][local190];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray12[local186][local190];
						@Pc(246) int[] local246 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local186][local190];
						@Pc(258) int[] local258 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local186][local190];
						if (local227 == null) {
							local227 = local234;
						}
						@Pc(269) float local269 = this.aFloatArrayArray7[local186][local190];
						@Pc(276) float local276 = this.aFloatArrayArray8[local186][local190];
						@Pc(283) float local283 = this.aFloatArrayArray6[local186][local190];
						@Pc(292) float local292 = this.aFloatArrayArray7[local186][local190 + 1];
						@Pc(301) float local301 = this.aFloatArrayArray8[local186][local190 + 1];
						@Pc(310) float local310 = this.aFloatArrayArray6[local186][local190 + 1];
						@Pc(321) float local321 = this.aFloatArrayArray7[local186 + 1][local190 + 1];
						@Pc(332) float local332 = this.aFloatArrayArray8[local186 + 1][local190 + 1];
						@Pc(343) float local343 = this.aFloatArrayArray6[local186 + 1][local190 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray7[local186 + 1][local190];
						@Pc(361) float local361 = this.aFloatArrayArray8[local186 + 1][local190];
						@Pc(370) float local370 = this.aFloatArrayArray6[local186 + 1][local190];
						@Pc(378) int local378 = local22[local186][local190] & 0xFF;
						@Pc(388) int local388 = local22[local186][local190 + 1] & 0xFF;
						@Pc(400) int local400 = local22[local186 + 1][local190 + 1] & 0xFF;
						@Pc(410) int local410 = local22[local186 + 1][local190] & 0xFF;
						@Pc(412) int local412 = 0;
						@Pc(422) int local422;
						label331: for (@Pc(414) int local414 = 0; local414 < local234.length; local414++) {
							@Pc(420) Class6_Sub39 local420 = local206[local414];
							for (local422 = 0; local422 < local412; local422++) {
								if (local420 == local184[local422]) {
									continue label331;
								}
							}
							local184[local412++] = local420;
						}
						@Pc(467) short[] local467 = this.aShortArrayArray7[local186 + super.anInt6363 * local190] = new short[local234.length];
						for (local422 = 0; local422 < local234.length; local422++) {
							@Pc(480) int local480 = (local186 << super.anInt6366) + local213[local422];
							@Pc(490) int local490 = (local190 << super.anInt6366) + local220[local422];
							@Pc(495) int local495 = local480 >> this.anInt6367;
							@Pc(500) int local500 = local490 >> this.anInt6367;
							@Pc(504) int local504 = local234[local422];
							@Pc(508) int local508 = local227[local422];
							@Pc(516) int local516 = local246 == null ? 0 : local246[local422];
							@Pc(534) long local534 = (long) local500 | (long) (local495 << 16) | (long) local508 << 48 | (long) local504 << 32;
							@Pc(538) int local538 = local213[local422];
							@Pc(542) int local542 = local220[local422];
							@Pc(546) int local546 = 0;
							@Pc(563) int local563;
							@Pc(567) float local567;
							@Pc(565) float local565;
							@Pc(569) float local569;
							@Pc(639) float local639;
							if (local538 == 0 && local542 == 0) {
								local563 = 74 - local378;
								local565 = local276;
								local567 = local269;
								local569 = local283;
							} else if (local538 == 0 && super.anInt6362 == local542) {
								local563 = 74 - local388;
								local565 = local301;
								local567 = local292;
								local569 = local310;
							} else if (super.anInt6362 == local538 && local542 == super.anInt6362) {
								local565 = local332;
								local569 = local343;
								local563 = 74 - local400;
								local567 = local321;
							} else if (local538 == super.anInt6362 && local542 == 0) {
								local565 = local361;
								local563 = 74 - local410;
								local567 = local352;
								local569 = local370;
							} else {
								@Pc(615) float local615 = (float) local538 / (float) super.anInt6362;
								@Pc(622) float local622 = (float) local542 / (float) super.anInt6362;
								@Pc(630) float local630 = (local352 - local269) * local615 + local269;
								local639 = local276 + local615 * (local361 - local276);
								@Pc(647) float local647 = (local370 - local283) * local615 + local283;
								@Pc(656) float local656 = local292 + local615 * (local321 - local292);
								@Pc(665) float local665 = (local332 - local301) * local615 + local301;
								local567 = (local656 - local630) * local622 + local630;
								@Pc(683) float local683 = (local343 - local310) * local615 + local310;
								local565 = (local665 - local639) * local622 + local639;
								local569 = local647 + local622 * (local683 - local647);
								@Pc(712) int local712 = local378 + ((local410 - local378) * local538 >> super.anInt6366);
								@Pc(725) int local725 = local388 + (local538 * (local400 - local388) >> super.anInt6366);
								local563 = 74 - local712 - (local542 * (local725 - local712) >> super.anInt6366);
							}
							@Pc(765) float local765 = 1.0F;
							if (local504 != -1) {
								@Pc(777) int local777 = local563 * (local504 & 0x7F) >> 7;
								if (local777 < 2) {
									local777 = 2;
								} else if (local777 > 126) {
									local777 = 126;
								}
								local546 = Static245.anIntArray376[local504 & 0xFF80 | local777];
								if ((this.anInt6381 & 0x7) == 0) {
									local765 = local569 * this.aClass28_Sub1_37.aFloatArray6[2] + local565 * this.aClass28_Sub1_37.aFloatArray6[1] + local567 * this.aClass28_Sub1_37.aFloatArray6[0];
									local765 = local765 * (local765 > 0.0F ? this.aClass28_Sub1_37.aFloat15 : this.aClass28_Sub1_37.aFloat9) + this.aClass28_Sub1_37.aFloat13;
								}
							}
							@Pc(850) Class6 local850 = null;
							if ((local480 & this.anInt6384 - 1) == 0 && (this.anInt6384 - 1 & local490) == 0) {
								local850 = local180.method3175(local534);
							}
							@Pc(1208) int local1208;
							@Pc(907) int local907;
							if (local850 == null) {
								if (local504 == local508) {
									local907 = local546;
								} else {
									@Pc(885) int local885 = (local508 & 0x7F) * local563 >> 7;
									if (local885 < 2) {
										local885 = 2;
									} else if (local885 > 126) {
										local885 = 126;
									}
									local907 = Static245.anIntArray376[local508 & 0xFF80 | local885];
									if ((this.anInt6381 & 0x7) == 0) {
										@Pc(938) float local938 = this.aClass28_Sub1_37.aFloatArray6[0] * local567 + this.aClass28_Sub1_37.aFloatArray6[1] * local565 + this.aClass28_Sub1_37.aFloatArray6[2] * local569;
										local639 = (local765 > 0.0F ? this.aClass28_Sub1_37.aFloat15 : this.aClass28_Sub1_37.aFloat9) * local765 + this.aClass28_Sub1_37.aFloat13;
										@Pc(963) int local963 = local907 >> 16 & 0xFF;
										@Pc(969) int local969 = local907 >> 8 & 0xFF;
										local963 = (int) ((float) local963 * local639);
										@Pc(979) int local979 = local907 & 0xFF;
										if (local963 < 0) {
											local963 = 0;
										} else if (local963 > 255) {
											local963 = 255;
										}
										local969 = (int) ((float) local969 * local639);
										if (local969 < 0) {
											local969 = 0;
										} else if (local969 > 255) {
											local969 = 255;
										}
										local979 = (int) ((float) local979 * local639);
										if (local979 < 0) {
											local979 = 0;
										} else if (local979 > 255) {
											local979 = 255;
										}
										local907 = local969 << 8 | local963 << 16 | local979;
									}
								}
								if (this.aClass28_Sub1_37.aBoolean52) {
									local168.b((float) local480);
									local168.b((float) (this.method5334(local480, local490) + local516));
									local168.b((float) local490);
									local168.a((byte) (local907 >> 16));
									local168.a((byte) (local907 >> 8));
									local168.a((byte) local907);
									local168.a(-1);
									local168.b((float) local480);
									local168.b((float) local490);
									if (this.anIntArrayArrayArray11 != null) {
										local168.b((float) (local258 == null ? 0 : local258[local422] - 1));
									}
									if ((this.anInt6381 & 0x7) != 0) {
										local168.b(local567);
										local168.b(local565);
										local168.b(local569);
									}
								} else {
									local168.a((float) local480);
									local168.a((float) (local516 + this.method5334(local480, local490)));
									local168.a((float) local490);
									local168.a((byte) (local907 >> 16));
									local168.a((byte) (local907 >> 8));
									local168.a((byte) local907);
									local168.a(-1);
									local168.a((float) local480);
									local168.a((float) local490);
									if (this.anIntArrayArrayArray11 != null) {
										local168.a((float) (local258 == null ? 0 : local258[local422] - 1));
									}
									if ((this.anInt6381 & 0x7) != 0) {
										local168.a(local567);
										local168.a(local565);
										local168.a(local569);
									}
								}
								local1208 = this.anInt6385++;
								local467[local422] = (short) local1208;
								if (local504 != -1) {
									local172[local1208] = local206[local422];
								}
								local180.method3179(local534, new Class6_Sub36(local467[local422]));
							} else {
								local467[local422] = ((Class6_Sub36) local850).aShort94;
								local1208 = local467[local422] & 0xFFFF;
								if (local504 != -1 && local206[local422].aLong217 < local172[local1208].aLong217) {
									local172[local1208] = local206[local422];
								}
							}
							for (local907 = 0; local907 < local412; local907++) {
								local184[local907].method5432(local563, local1208, local546, local765);
							}
							this.anInt6389++;
						}
					}
				}
			}
			for (local190 = 0; local190 < this.anInt6385; local190++) {
				@Pc(1324) Class6_Sub39 local1324 = local172[local190];
				if (local1324 != null) {
					local1324.method5429(local190);
				}
			}
			@Pc(1357) int local1357;
			for (@Pc(1337) int local1337 = 0; super.anInt6363 > local1337; local1337++) {
				for (@Pc(1341) int local1341 = 0; super.anInt6360 > local1341; local1341++) {
					@Pc(1353) short[] local1353 = this.aShortArrayArray7[local1337 + local1341 * super.anInt6363];
					if (local1353 != null) {
						local1357 = 0;
						@Pc(1359) int local1359 = 0;
						while (local1353.length > local1359) {
							@Pc(1368) int local1368 = local1353[local1359++] & 0xFFFF;
							@Pc(1375) int local1375 = local1353[local1359++] & 0xFFFF;
							@Pc(1382) int local1382 = local1353[local1359++] & 0xFFFF;
							@Pc(1386) Class6_Sub39 local1386 = local172[local1368];
							@Pc(1390) Class6_Sub39 local1390 = local172[local1375];
							@Pc(1394) Class6_Sub39 local1394 = local172[local1382];
							@Pc(1396) Class6_Sub39 local1396 = null;
							if (local1386 != null) {
								local1386.method5434(local1357, local1337, local1341);
								local1396 = local1386;
							}
							if (local1390 != null) {
								local1390.method5434(local1357, local1337, local1341);
								if (local1396 == null || local1396.aLong217 > local1390.aLong217) {
									local1396 = local1390;
								}
							}
							if (local1394 != null) {
								local1394.method5434(local1357, local1337, local1341);
								if (local1396 == null || local1394.aLong217 < local1396.aLong217) {
									local1396 = local1394;
								}
							}
							if (local1396 != null) {
								if (local1386 != null) {
									local1396.method5429(local1368);
								}
								if (local1390 != null) {
									local1396.method5429(local1375);
								}
								if (local1394 != null) {
									local1396.method5429(local1382);
								}
								local1396.method5434(local1357, local1337, local1341);
							}
							local1357++;
						}
					}
				}
			}
			local168.c();
			this.anInterface5_7 = this.aClass28_Sub1_37.method694(local163, local168.a(), local144);
			this.aClass195_15 = new Class195(this.aClass28_Sub1_37, this.anInterface5_7, 5126, 3, 0);
			this.aClass195_13 = new Class195(this.aClass28_Sub1_37, this.anInterface5_7, 5121, 4, 12);
			@Pc(1541) byte local1541;
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass195_12 = new Class195(this.aClass28_Sub1_37, this.anInterface5_7, 5126, 2, 16);
				local1541 = 24;
			} else {
				this.aClass195_12 = new Class195(this.aClass28_Sub1_37, this.anInterface5_7, 5126, 3, 16);
				local1541 = 28;
			}
			if ((this.anInt6381 & 0x7) != 0) {
				this.aClass195_14 = new Class195(this.aClass28_Sub1_37, this.anInterface5_7, 5126, 3, local1541);
			}
			@Pc(1579) long[] local1579 = new long[this.aClass6_Sub39Array1.length];
			for (local1357 = 0; local1357 < this.aClass6_Sub39Array1.length; local1357++) {
				@Pc(1588) Class6_Sub39 local1588 = this.aClass6_Sub39Array1[local1357];
				local1579[local1357] = local1588.aLong217;
				local1588.method5433(this.anInt6385);
			}
			Static79.method1464(this.aClass6_Sub39Array1, local1579);
			if (this.aClass90_2 != null) {
				this.aClass90_2.method1898();
			}
		}
		this.aClass137_32 = null;
		this.aClass6_Sub39ArrayArrayArray1 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray8 = this.aFloatArrayArray6 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray10 = null;
		this.aByteArrayArray40 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray7 = this.anIntArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	@Override
	public void method5332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray40[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray40[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt6363][super.anInt6360][];
		}
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt6363][super.anInt6360][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub39[] local88 = this.aClass6_Sub39ArrayArrayArray1[arg0][arg1] = new Class6_Sub39[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class6 local125;
			for (local125 = this.aClass137_32.method3175(local119); local125 != null; local125 = this.aClass137_32.method3176()) {
				@Pc(130) Class6_Sub39 local130 = (Class6_Sub39) local125;
				if (arg8[local90] == local130.anInt6572 && local130.aFloat100 == (float) arg9[local90] && local130.anInt6573 == arg10 && arg11 == local130.anInt6564 && local130.anInt6563 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub39(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass137_32.method3179(local119, local88[local90]);
			} else {
				local88[local90] = (Class6_Sub39) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray39[arg0][arg1] = (byte) (this.aByteArrayArray39[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6391) {
			this.anInt6391 = arg6.length;
		}
		this.anInt6390 += arg6.length;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Lclient!h;IIIIZ)V")
	@Override
	public void method5329(@OriginalArg(0) Class6_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass90_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass28_Sub1_37.anInt769 * arg2 >> 8) >> this.aClass28_Sub1_37.anInt736;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass28_Sub1_37.anInt755 >> 8) >> this.aClass28_Sub1_37.anInt736;
			this.aClass90_2.method1899(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!h;IIIIZ)V")
	@Override
	public void method5321(@OriginalArg(0) Class6_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass90_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass28_Sub1_37.anInt769 >> 8) >> this.aClass28_Sub1_37.anInt736;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass28_Sub1_37.anInt755 >> 8) >> this.aClass28_Sub1_37.anInt736;
			this.aClass90_2.method1902(local38, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIZB[[Z)V")
	private void method5337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(6) boolean[][] arg4) {
		if (this.aClass6_Sub39Array1 == null) {
			return;
		}
		@Pc(18) float local18 = this.aClass28_Sub1_37.aFloat24;
		@Pc(22) float local22 = this.aClass28_Sub1_37.aFloat20;
		@Pc(28) int local28 = arg2 + arg2 + 1;
		@Pc(32) int local32 = local28 * local28;
		if (local32 > Static314.anIntArray612.length) {
			Static314.anIntArray612 = new int[local32];
		}
		if (Static303.aClass6_Sub15_6.aByteArray51.length < this.anInt6389 * 2) {
			Static303.aClass6_Sub15_6 = new Class6_Sub15(this.anInt6389 * 2);
		}
		@Pc(67) int local67 = arg0 - arg2;
		@Pc(69) int local69 = local67;
		if (local67 < 0) {
			local67 = 0;
		}
		@Pc(81) int local81 = arg1 - arg2;
		@Pc(83) int local83 = local81;
		if (local81 < 0) {
			local81 = 0;
		}
		@Pc(91) int local91 = arg2 + arg0;
		if (super.anInt6363 - 1 < local91) {
			local91 = super.anInt6363 - 1;
		}
		@Pc(110) int local110 = arg2 + arg1;
		Static53.anInt1054 = 0;
		if (super.anInt6360 - 1 < local110) {
			local110 = super.anInt6360 - 1;
		}
		@Pc(136) int local136;
		for (@Pc(125) int local125 = local67; local125 <= local91; local125++) {
			@Pc(134) boolean[] local134 = arg4[local125 - local69];
			for (local136 = local81; local136 <= local110; local136++) {
				if (local134[local136 - local83]) {
					Static314.anIntArray612[Static53.anInt1054++] = local136 * super.anInt6363 + local125;
				}
			}
		}
		this.aClass28_Sub1_37.method644();
		this.aClass28_Sub1_37.method668((this.anInt6381 & 0x7) != 0);
		for (@Pc(208) int local208 = 0; local208 < this.aClass6_Sub39Array1.length; local208++) {
			this.aClass6_Sub39Array1[local208].method5427(Static314.anIntArray612, Static53.anInt1054);
		}
		if (!this.aClass88_44.method1888()) {
			local136 = this.aClass28_Sub1_37.anInt778;
			@Pc(241) int local241 = this.aClass28_Sub1_37.anInt775;
			this.aClass28_Sub1_37.method3535(0, local241, this.aClass28_Sub1_37.anInt766);
			this.aClass28_Sub1_37.method3581(local22, local18 - 4.0F);
			this.aClass28_Sub1_37.method668(false);
			this.aClass28_Sub1_37.method666(false);
			this.aClass28_Sub1_37.method708(128);
			this.aClass28_Sub1_37.method718(-2);
			this.aClass28_Sub1_37.method654(this.aClass28_Sub1_37.aClass40_Sub3_1);
			this.aClass28_Sub1_37.method692(7681, 8448);
			this.aClass28_Sub1_37.method665(34166, 770, 0);
			this.aClass28_Sub1_37.method643(34167, 0);
			for (@Pc(308) Class6 local308 = this.aClass88_44.method1882(); local308 != null; local308 = this.aClass88_44.method1891()) {
				@Pc(313) Class6_Sub10 local313 = (Class6_Sub10) local308;
				local313.method1649(arg4, arg2, arg1, arg0);
			}
			this.aClass28_Sub1_37.method665(5890, 768, 0);
			this.aClass28_Sub1_37.method643(5890, 0);
			this.aClass28_Sub1_37.method654(null);
			this.aClass28_Sub1_37.method3535(local136, local241, this.aClass28_Sub1_37.anInt766);
		}
		if (this.aClass90_2 != null) {
			this.aClass28_Sub1_37.method3581(local22, local18 - 8.0F);
			this.aClass28_Sub1_37.method644();
			this.aClass28_Sub1_37.method714(null, this.aClass195_12, null, this.aClass195_15);
			this.aClass90_2.method1907(arg1, arg2, arg4, arg3, arg0);
		}
		this.aClass28_Sub1_37.method3581(local22, local18);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5330(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6390 <= 0) {
			return;
		}
		this.aClass28_Sub1_37.method656();
		this.aClass28_Sub1_37.method677(false);
		this.aClass28_Sub1_37.method668(false);
		this.aClass28_Sub1_37.method670(false);
		this.aClass28_Sub1_37.method666(false);
		this.aClass28_Sub1_37.method708(0);
		this.aClass28_Sub1_37.method718(-2);
		this.aClass28_Sub1_37.method654(null);
		Static94.aFloatArray10[6] = 0.0F;
		Static94.aFloatArray10[4] = 0.0F;
		Static94.aFloatArray10[0] = (float) 1024 / ((float) super.anInt6362 * 128.0F * (float) this.aClass28_Sub1_37.anInt711);
		Static94.aFloatArray10[14] = 0.0F;
		Static94.aFloatArray10[9] = 0.0F;
		Static94.aFloatArray10[15] = 1.0F;
		Static94.aFloatArray10[5] = (float) 1024 / ((float) super.anInt6362 * 128.0F * (float) this.aClass28_Sub1_37.anInt566);
		Static94.aFloatArray10[3] = 0.0F;
		Static94.aFloatArray10[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass28_Sub1_37.anInt566;
		Static94.aFloatArray10[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass28_Sub1_37.anInt711) - 1.0F;
		Static94.aFloatArray10[8] = 0.0F;
		Static94.aFloatArray10[11] = 0.0F;
		Static94.aFloatArray10[1] = 0.0F;
		Static94.aFloatArray10[7] = 0.0F;
		Static94.aFloatArray10[10] = 0.0F;
		Static94.aFloatArray10[2] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static94.aFloatArray10, 0);
		Static94.aFloatArray10[1] = 0.0F;
		Static94.aFloatArray10[4] = 0.0F;
		Static94.aFloatArray10[15] = 1.0F;
		Static94.aFloatArray10[14] = 0.0F;
		Static94.aFloatArray10[2] = 0.0F;
		Static94.aFloatArray10[12] = 0.0F;
		Static94.aFloatArray10[0] = 1.0F;
		Static94.aFloatArray10[10] = 0.0F;
		Static94.aFloatArray10[8] = 0.0F;
		Static94.aFloatArray10[13] = 0.0F;
		Static94.aFloatArray10[7] = 0.0F;
		Static94.aFloatArray10[11] = 0.0F;
		Static94.aFloatArray10[5] = 0.0F;
		Static94.aFloatArray10[9] = 1.0F;
		Static94.aFloatArray10[3] = 0.0F;
		Static94.aFloatArray10[6] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static94.aFloatArray10, 0);
		if ((this.anInt6381 & 0x7) == 0) {
			this.aClass28_Sub1_37.method668(false);
		} else {
			this.aClass28_Sub1_37.method668(true);
			this.aClass28_Sub1_37.method671();
		}
		this.aClass28_Sub1_37.method714(this.aClass195_14, this.aClass195_12, this.aClass195_13, this.aClass195_15);
		if (Static303.aClass6_Sub15_6.aByteArray51.length < this.anInt6389 * 2) {
			Static303.aClass6_Sub15_6 = new Class6_Sub15(this.anInt6389 * 2);
		} else {
			Static303.aClass6_Sub15_6.anInt3487 = 0;
		}
		@Pc(305) int local305 = 0;
		@Pc(311) int local311;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(340) short[] local340;
		@Pc(344) int local344;
		if (this.aClass28_Sub1_37.aBoolean52) {
			for (local311 = arg1; local311 < arg3; local311++) {
				local320 = arg0 + super.anInt6363 * local311;
				for (local322 = arg0; local322 < arg2; local322++) {
					if (arg4[local322 - arg0][local311 - arg1]) {
						local340 = this.aShortArrayArray7[local320];
						if (local340 != null) {
							for (local344 = 0; local344 < local340.length; local344++) {
								local305++;
								Static303.aClass6_Sub15_6.method3100(local340[local344] & 0xFFFF);
							}
						}
					}
					local320++;
				}
			}
		} else {
			for (local311 = arg1; local311 < arg3; local311++) {
				local320 = local311 * super.anInt6363 + arg0;
				for (local322 = arg0; local322 < arg2; local322++) {
					if (arg4[local322 - arg0][local311 - arg1]) {
						local340 = this.aShortArrayArray7[local320];
						if (local340 != null) {
							for (local344 = 0; local344 < local340.length; local344++) {
								Static303.aClass6_Sub15_6.method3114(local340[local344] & 0xFFFF);
								local305++;
							}
						}
					}
					local320++;
				}
			}
		}
		if (local305 > 0) {
			@Pc(450) Class97_Sub2 local450 = new Class97_Sub2(this.aClass28_Sub1_37, 5123, Static303.aClass6_Sub15_6.aByteArray51, Static303.aClass6_Sub15_6.anInt3487);
			this.aClass28_Sub1_37.method661(0, local305, local450);
		}
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(Lclient!h;IIIIZ)Z")
	@Override
	public boolean method5333(@OriginalArg(0) Class6_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass90_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass28_Sub1_37.anInt769 >> 8) >> this.aClass28_Sub1_37.anInt736;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass28_Sub1_37.anInt755 >> 8) >> this.aClass28_Sub1_37.anInt736;
			return this.aClass90_2.method1901(local25, arg0, local40);
		}
	}
}
