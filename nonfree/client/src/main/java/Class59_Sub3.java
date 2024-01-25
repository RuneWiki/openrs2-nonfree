import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class59_Sub3 extends Class59 {

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	private int anInt7821;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	private int anInt7823;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
	private int anInt7843;

	@OriginalMember(owner = "client!rk", name = "V", descriptor = "[Lclient!wm;")
	private Class6_Sub52[] aClass6_Sub52Array1;

	@OriginalMember(owner = "client!rk", name = "X", descriptor = "Lclient!ce;")
	public Class45 aClass45_11;

	@OriginalMember(owner = "client!rk", name = "Y", descriptor = "Lclient!ce;")
	private Class45 aClass45_12;

	@OriginalMember(owner = "client!rk", name = "ab", descriptor = "Lclient!ce;")
	public Class45 aClass45_13;

	@OriginalMember(owner = "client!rk", name = "cb", descriptor = "I")
	private int anInt7844;

	@OriginalMember(owner = "client!rk", name = "db", descriptor = "Lclient!ad;")
	private Interface1 anInterface1_7;

	@OriginalMember(owner = "client!rk", name = "eb", descriptor = "Lclient!ce;")
	public Class45 aClass45_14;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Lclient!ws;")
	private final Class361 aClass361_60 = new Class361();

	@OriginalMember(owner = "client!rk", name = "P", descriptor = "Lclient!jaa;")
	public final Class14_Sub3 aClass14_Sub3_37;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
	private final int anInt7831;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	public final int anInt7820;

	@OriginalMember(owner = "client!rk", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!rk", name = "R", descriptor = "[[S")
	public final short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!rk", name = "N", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!rk", name = "O", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!rk", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "[[B")
	private final byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!rk", name = "T", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
	private final int anInt7828;

	@OriginalMember(owner = "client!rk", name = "L", descriptor = "[[[Lclient!wm;")
	private Class6_Sub52[][][] aClass6_Sub52ArrayArrayArray1;

	@OriginalMember(owner = "client!rk", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!rk", name = "S", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!rk", name = "W", descriptor = "Lclient!hd;")
	private Class128 aClass128_38;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "Lclient!k;")
	private Class166 aClass166_2;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!jaa;IIII[[I[[II)V")
	public Class59_Sub3(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass14_Sub3_37 = arg0;
		this.anIntArrayArray70 = arg5;
		this.anInt7831 = super.anInt9638 - 2;
		this.anInt7820 = arg2;
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aShortArrayArray9 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray13 = new float[super.anInt9640 + 1][super.anInt9639 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aByteArrayArray24 = new byte[arg3][arg4];
		this.aFloatArrayArray12 = new float[super.anInt9640 + 1][super.anInt9639 + 1];
		this.anInt7828 = 0x1 << this.anInt7831;
		this.aClass6_Sub52ArrayArrayArray1 = new Class6_Sub52[arg3][arg4][];
		this.aByteArrayArray25 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray11 = new float[super.anInt9640 + 1][super.anInt9639 + 1];
		for (@Pc(117) int local117 = 1; local117 < super.anInt9639; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt9640 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + arg7 * 4 * arg7 + local157 * local157)));
				this.aFloatArrayArray12[local121][local117] = (float) local140 * local178;
				this.aFloatArrayArray13[local121][local117] = (float) (-arg7 * 2) * local178;
				this.aFloatArrayArray11[local121][local117] = local178 * (float) local157;
			}
		}
		this.aClass128_38 = new Class128(128);
		if ((this.anInt7820 & 0x10) != 0) {
			this.aClass166_2 = new Class166(this.aClass14_Sub3_37, this);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
	@Override
	public void method7862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method7865(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass166_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass14_Sub3_37.anInt4583 >> 8) >> this.aClass14_Sub3_37.anInt4556;
			@Pc(39) int local39 = arg3 - (this.aClass14_Sub3_37.anInt4594 * arg2 >> 8) >> this.aClass14_Sub3_37.anInt4556;
			return this.aClass166_2.method4247(local25, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7864(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7843 <= 0) {
			return;
		}
		this.aClass14_Sub3_37.method3983();
		this.aClass14_Sub3_37.method3945(false);
		this.aClass14_Sub3_37.method3921(false);
		this.aClass14_Sub3_37.method3959(false);
		this.aClass14_Sub3_37.method3965(false);
		this.aClass14_Sub3_37.method3937(0);
		this.aClass14_Sub3_37.method3962(-2);
		this.aClass14_Sub3_37.method3985(null);
		Static46.aFloatArray5[1] = 0.0F;
		Static46.aFloatArray5[6] = 0.0F;
		Static46.aFloatArray5[8] = 0.0F;
		Static46.aFloatArray5[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass14_Sub3_37.anInt4385;
		Static46.aFloatArray5[3] = 0.0F;
		Static46.aFloatArray5[15] = 1.0F;
		Static46.aFloatArray5[14] = 0.0F;
		Static46.aFloatArray5[10] = 0.0F;
		Static46.aFloatArray5[4] = 0.0F;
		Static46.aFloatArray5[2] = 0.0F;
		Static46.aFloatArray5[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass14_Sub3_37.anInt4445;
		Static46.aFloatArray5[7] = 0.0F;
		Static46.aFloatArray5[5] = (float) 1024 / ((float) super.anInt9641 * 128.0F * (float) this.aClass14_Sub3_37.anInt4385);
		Static46.aFloatArray5[0] = (float) 1024 / ((float) super.anInt9641 * 128.0F * (float) this.aClass14_Sub3_37.anInt4445);
		Static46.aFloatArray5[11] = 0.0F;
		Static46.aFloatArray5[9] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static46.aFloatArray5, 0);
		Static46.aFloatArray5[9] = 1.0F;
		Static46.aFloatArray5[5] = 0.0F;
		Static46.aFloatArray5[14] = 0.0F;
		Static46.aFloatArray5[11] = 0.0F;
		Static46.aFloatArray5[1] = 0.0F;
		Static46.aFloatArray5[15] = 1.0F;
		Static46.aFloatArray5[3] = 0.0F;
		Static46.aFloatArray5[4] = 0.0F;
		Static46.aFloatArray5[12] = 0.0F;
		Static46.aFloatArray5[13] = 0.0F;
		Static46.aFloatArray5[7] = 0.0F;
		Static46.aFloatArray5[0] = 1.0F;
		Static46.aFloatArray5[8] = 0.0F;
		Static46.aFloatArray5[6] = 1.0F;
		Static46.aFloatArray5[10] = 0.0F;
		Static46.aFloatArray5[2] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static46.aFloatArray5, 0);
		if ((this.anInt7820 & 0x7) == 0) {
			this.aClass14_Sub3_37.method3921(false);
		} else {
			this.aClass14_Sub3_37.method3921(true);
			this.aClass14_Sub3_37.method3919();
		}
		this.aClass14_Sub3_37.method3981(this.aClass45_13, this.aClass45_12, this.aClass45_14, this.aClass45_11);
		if (this.anInt7821 * 2 <= this.aClass14_Sub3_37.aClass6_Sub21_Sub1_1.aByteArray93.length) {
			this.aClass14_Sub3_37.aClass6_Sub21_Sub1_1.anInt7338 = 0;
		} else {
			this.aClass14_Sub3_37.aClass6_Sub21_Sub1_1 = new Class6_Sub21_Sub1(this.anInt7821 * 2);
		}
		@Pc(310) int local310 = 0;
		@Pc(314) Class6_Sub21_Sub1 local314 = this.aClass14_Sub3_37.aClass6_Sub21_Sub1_1;
		@Pc(320) int local320;
		@Pc(329) int local329;
		@Pc(331) int local331;
		@Pc(349) short[] local349;
		@Pc(353) int local353;
		if (this.aClass14_Sub3_37.aBoolean298) {
			for (local320 = arg1; local320 < arg3; local320++) {
				local329 = local320 * super.anInt9640 + arg0;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local320 - arg1]) {
						local349 = this.aShortArrayArray9[local329];
						if (local349 != null) {
							for (local353 = 0; local353 < local349.length; local353++) {
								local314.method6052(local349[local353] & 0xFFFF);
								local310++;
							}
						}
					}
					local329++;
				}
			}
		} else {
			for (local320 = arg1; local320 < arg3; local320++) {
				local329 = arg0 + super.anInt9640 * local320;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local320 - arg1]) {
						local349 = this.aShortArrayArray9[local329];
						if (local349 != null) {
							for (local353 = 0; local353 < local349.length; local353++) {
								local310++;
								local314.method6032(local349[local353] & 0xFFFF);
							}
						}
					}
					local329++;
				}
			}
		}
		if (local310 > 0) {
			@Pc(466) Class77_Sub1 local466 = new Class77_Sub1(this.aClass14_Sub3_37, 5123, local314.aByteArray93, local314.anInt7338);
			this.aClass14_Sub3_37.method3920(local466, 0, local310);
		}
	}

	@OriginalMember(owner = "client!rk", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass166_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass14_Sub3_37.anInt4583 >> 8) >> this.aClass14_Sub3_37.anInt4556;
			@Pc(38) int local38 = arg3 - (this.aClass14_Sub3_37.anInt4594 * arg2 >> 8) >> this.aClass14_Sub3_37.anInt4556;
			this.aClass166_2.method4240(local24, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt7843 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt9640 + 1][super.anInt9639 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; local16 < super.anInt9640; local16++) {
				for (local20 = 1; local20 < super.anInt9639; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray25[local16][local20] >> 1) + (this.aByteArrayArray25[local16][local20 + 1] >> 3) + (this.aByteArrayArray25[local16][local20 + -1] >> 2) + (this.aByteArrayArray25[local16 + 1][local20] >> 3) + (this.aByteArrayArray25[local16 - 1][local20] >> 2));
				}
			}
			this.aClass6_Sub52Array1 = new Class6_Sub52[this.aClass128_38.method3268()];
			this.aClass128_38.method3271(this.aClass6_Sub52Array1);
			for (local20 = 0; local20 < this.aClass6_Sub52Array1.length; local20++) {
				this.aClass6_Sub52Array1[local20].method7807(this.anInt7843);
			}
			@Pc(132) int local132 = 24;
			if (this.anIntArrayArrayArray15 != null) {
				local132 += 4;
			}
			if ((this.anInt7820 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(152) NativeHeapBuffer local152 = this.aClass14_Sub3_37.aNativeHeap4.a(this.anInt7843 * local132, false);
			@Pc(157) Stream local157 = new Stream(local152);
			@Pc(161) Class6_Sub52[] local161 = new Class6_Sub52[this.anInt7843];
			@Pc(168) int local168 = Static505.method6819(this.anInt7843 / 4);
			if (local168 < 1) {
				local168 = 1;
			}
			@Pc(180) Class128 local180 = new Class128(local168);
			@Pc(184) Class6_Sub52[] local184 = new Class6_Sub52[this.anInt7844];
			@Pc(190) int local190;
			for (@Pc(186) int local186 = 0; local186 < super.anInt9640; local186++) {
				for (local190 = 0; super.anInt9639 > local190; local190++) {
					if (this.anIntArrayArrayArray12[local186][local190] != null) {
						@Pc(206) Class6_Sub52[] local206 = this.aClass6_Sub52ArrayArrayArray1[local186][local190];
						@Pc(213) int[] local213 = this.anIntArrayArrayArray16[local186][local190];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray13[local186][local190];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray14[local186][local190];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray12[local186][local190];
						@Pc(246) int[] local246 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local186][local190];
						@Pc(258) int[] local258 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local186][local190];
						if (local227 == null) {
							local227 = local234;
						}
						@Pc(269) float local269 = this.aFloatArrayArray12[local186][local190];
						@Pc(276) float local276 = this.aFloatArrayArray13[local186][local190];
						@Pc(283) float local283 = this.aFloatArrayArray11[local186][local190];
						@Pc(292) float local292 = this.aFloatArrayArray12[local186][local190 + 1];
						@Pc(301) float local301 = this.aFloatArrayArray13[local186][local190 + 1];
						@Pc(310) float local310 = this.aFloatArrayArray11[local186][local190 + 1];
						@Pc(321) float local321 = this.aFloatArrayArray12[local186 + 1][local190 + 1];
						@Pc(332) float local332 = this.aFloatArrayArray13[local186 + 1][local190 + 1];
						@Pc(343) float local343 = this.aFloatArrayArray11[local186 + 1][local190 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray12[local186 + 1][local190];
						@Pc(361) float local361 = this.aFloatArrayArray13[local186 + 1][local190];
						@Pc(370) float local370 = this.aFloatArrayArray11[local186 + 1][local190];
						@Pc(378) int local378 = local14[local186][local190] & 0xFF;
						@Pc(388) int local388 = local14[local186][local190 + 1] & 0xFF;
						@Pc(400) int local400 = local14[local186 + 1][local190 + 1] & 0xFF;
						@Pc(410) int local410 = local14[local186 + 1][local190] & 0xFF;
						@Pc(412) int local412 = 0;
						@Pc(422) int local422;
						label335: for (@Pc(414) int local414 = 0; local414 < local234.length; local414++) {
							@Pc(420) Class6_Sub52 local420 = local206[local414];
							for (local422 = 0; local422 < local412; local422++) {
								if (local420 == local184[local422]) {
									continue label335;
								}
							}
							local184[local412++] = local420;
						}
						@Pc(463) short[] local463 = this.aShortArrayArray9[local186 + local190 * super.anInt9640] = new short[local234.length];
						for (local422 = 0; local422 < local234.length; local422++) {
							@Pc(476) int local476 = (local186 << super.anInt9638) + local213[local422];
							@Pc(486) int local486 = (local190 << super.anInt9638) + local220[local422];
							@Pc(491) int local491 = local476 >> this.anInt7831;
							@Pc(496) int local496 = local486 >> this.anInt7831;
							@Pc(500) int local500 = local234[local422];
							@Pc(504) int local504 = local227[local422];
							@Pc(512) int local512 = local246 == null ? 0 : local246[local422];
							@Pc(530) long local530 = (long) (local491 << 16) | (long) local504 << 48 | (long) local500 << 32 | (long) local496;
							@Pc(534) int local534 = local213[local422];
							@Pc(538) int local538 = local220[local422];
							@Pc(540) byte local540 = 74;
							@Pc(542) int local542 = 0;
							@Pc(544) float local544 = 1.0F;
							@Pc(581) float local581;
							@Pc(589) float local589;
							@Pc(583) float local583;
							@Pc(623) float local623;
							@Pc(587) int local587;
							if (local534 == 0 && local538 == 0) {
								local587 = local540 - local378;
								local583 = local283;
								local581 = local269;
								local589 = local276;
							} else if (local534 == 0 && local538 == super.anInt9641) {
								local587 = local540 - local388;
								local581 = local292;
								local589 = local301;
								local583 = local310;
							} else if (super.anInt9641 == local534 && local538 == super.anInt9641) {
								local587 = local540 - local400;
								local589 = local332;
								local583 = local343;
								local581 = local321;
							} else if (super.anInt9641 == local534 && local538 == 0) {
								local581 = local352;
								local583 = local370;
								local587 = local540 - local410;
								local589 = local361;
							} else {
								@Pc(598) float local598 = (float) local534 / (float) super.anInt9641;
								@Pc(605) float local605 = (float) local538 / (float) super.anInt9641;
								@Pc(614) float local614 = local269 + local598 * (local352 - local269);
								local623 = local276 + (local361 - local276) * local598;
								@Pc(631) float local631 = local283 + local598 * (local370 - local283);
								@Pc(640) float local640 = local292 + local598 * (local321 - local292);
								@Pc(648) float local648 = local598 * (local332 - local301) + local301;
								@Pc(656) float local656 = local310 + (local343 - local310) * local598;
								local581 = (local640 - local614) * local605 + local614;
								local589 = local623 + local605 * (local648 - local623);
								local583 = local631 + (local656 - local631) * local605;
								@Pc(691) int local691 = (local534 * (local410 - local378) >> super.anInt9638) + local378;
								@Pc(703) int local703 = ((local400 - local388) * local534 >> super.anInt9638) + local388;
								local587 = local540 - local691 - (local538 * (local703 - local691) >> super.anInt9638);
							}
							if (local500 != -1) {
								@Pc(764) int local764 = local587 * (local500 & 0x7F) >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local542 = Static171.anIntArray212[local500 & 0xFF80 | local764];
								if ((this.anInt7820 & 0x7) == 0) {
									local544 = local581 * this.aClass14_Sub3_37.aFloatArray40[0] + this.aClass14_Sub3_37.aFloatArray40[1] * local589 + this.aClass14_Sub3_37.aFloatArray40[2] * local583;
									local544 = this.aClass14_Sub3_37.aFloat90 + local544 * (local544 > 0.0F ? this.aClass14_Sub3_37.aFloat106 : this.aClass14_Sub3_37.aFloat107);
								}
							}
							@Pc(836) Class6 local836 = null;
							if ((local476 & this.anInt7828 - 1) == 0 && (local486 & this.anInt7828 - 1) == 0) {
								local836 = local180.method3263(local530);
							}
							@Pc(1196) int local1196;
							@Pc(869) int local869;
							if (local836 == null) {
								if (local504 == local500) {
									local869 = local542;
								} else {
									@Pc(879) int local879 = local587 * (local504 & 0x7F) >> 7;
									if (local879 < 2) {
										local879 = 2;
									} else if (local879 > 126) {
										local879 = 126;
									}
									local869 = Static171.anIntArray212[local504 & 0xFF80 | local879];
									if ((this.anInt7820 & 0x7) == 0) {
										@Pc(929) float local929 = local589 * this.aClass14_Sub3_37.aFloatArray40[1] + this.aClass14_Sub3_37.aFloatArray40[0] * local581 + this.aClass14_Sub3_37.aFloatArray40[2] * local583;
										local623 = this.aClass14_Sub3_37.aFloat90 + local544 * (local544 > 0.0F ? this.aClass14_Sub3_37.aFloat106 : this.aClass14_Sub3_37.aFloat107);
										@Pc(954) int local954 = local869 >> 16 & 0xFF;
										@Pc(960) int local960 = local869 >> 8 & 0xFF;
										local954 = (int) ((float) local954 * local623);
										@Pc(970) int local970 = local869 & 0xFF;
										local960 = (int) ((float) local960 * local623);
										if (local954 < 0) {
											local954 = 0;
										} else if (local954 > 255) {
											local954 = 255;
										}
										local970 = (int) ((float) local970 * local623);
										if (local960 < 0) {
											local960 = 0;
										} else if (local960 > 255) {
											local960 = 255;
										}
										if (local970 < 0) {
											local970 = 0;
										} else if (local970 > 255) {
											local970 = 255;
										}
										local869 = local960 << 8 | local954 << 16 | local970;
									}
								}
								if (this.aClass14_Sub3_37.aBoolean298) {
									local157.a((float) local476);
									local157.a((float) (this.sa(local476, local486) + local512));
									local157.a((float) local486);
									local157.b((byte) (local869 >> 16));
									local157.b((byte) (local869 >> 8));
									local157.b((byte) local869);
									local157.b(-1);
									local157.a((float) local476);
									local157.a((float) local486);
									if (this.anIntArrayArrayArray15 != null) {
										local157.a((float) (local258 == null ? 0 : local258[local422] - 1));
									}
									if ((this.anInt7820 & 0x7) != 0) {
										local157.a(local581);
										local157.a(local589);
										local157.a(local583);
									}
								} else {
									local157.b((float) local476);
									local157.b((float) (local512 + this.sa(local476, local486)));
									local157.b((float) local486);
									local157.b((byte) (local869 >> 16));
									local157.b((byte) (local869 >> 8));
									local157.b((byte) local869);
									local157.b(-1);
									local157.b((float) local476);
									local157.b((float) local486);
									if (this.anIntArrayArrayArray15 != null) {
										local157.b((float) (local258 == null ? 0 : local258[local422] - 1));
									}
									if ((this.anInt7820 & 0x7) != 0) {
										local157.b(local581);
										local157.b(local589);
										local157.b(local583);
									}
								}
								local1196 = this.anInt7823++;
								local463[local422] = (short) local1196;
								if (local500 != -1) {
									local161[local1196] = local206[local422];
								}
								local180.method3267(new Class6_Sub36(local463[local422]), local530);
							} else {
								local463[local422] = ((Class6_Sub36) local836).aShort82;
								local1196 = local463[local422] & 0xFFFF;
								if (local500 != -1 && local161[local1196].aLong263 > local206[local422].aLong263) {
									local161[local1196] = local206[local422];
								}
							}
							for (local869 = 0; local869 < local412; local869++) {
								local184[local869].method7811(local542, local1196, local587, local544);
							}
							this.anInt7821++;
						}
					}
				}
			}
			for (local190 = 0; local190 < this.anInt7823; local190++) {
				@Pc(1312) Class6_Sub52 local1312 = local161[local190];
				if (local1312 != null) {
					local1312.method7806(local190);
				}
			}
			@Pc(1349) int local1349;
			for (@Pc(1329) int local1329 = 0; local1329 < super.anInt9640; local1329++) {
				for (@Pc(1333) int local1333 = 0; super.anInt9639 > local1333; local1333++) {
					@Pc(1345) short[] local1345 = this.aShortArrayArray9[super.anInt9640 * local1333 + local1329];
					if (local1345 != null) {
						local1349 = 0;
						@Pc(1351) int local1351 = 0;
						while (local1351 < local1345.length) {
							@Pc(1360) int local1360 = local1345[local1351++] & 0xFFFF;
							@Pc(1367) int local1367 = local1345[local1351++] & 0xFFFF;
							@Pc(1374) int local1374 = local1345[local1351++] & 0xFFFF;
							@Pc(1378) Class6_Sub52 local1378 = local161[local1360];
							@Pc(1382) Class6_Sub52 local1382 = local161[local1367];
							@Pc(1386) Class6_Sub52 local1386 = local161[local1374];
							@Pc(1388) Class6_Sub52 local1388 = null;
							if (local1378 != null) {
								local1388 = local1378;
								local1378.method7810(local1349, local1333, local1329);
							}
							if (local1382 != null) {
								local1382.method7810(local1349, local1333, local1329);
								if (local1388 == null || local1382.aLong263 < local1388.aLong263) {
									local1388 = local1382;
								}
							}
							if (local1386 != null) {
								local1386.method7810(local1349, local1333, local1329);
								if (local1388 == null || local1388.aLong263 > local1386.aLong263) {
									local1388 = local1386;
								}
							}
							if (local1388 != null) {
								if (local1378 != null) {
									local1388.method7806(local1360);
								}
								if (local1382 != null) {
									local1388.method7806(local1367);
								}
								if (local1386 != null) {
									local1388.method7806(local1374);
								}
								local1388.method7810(local1349, local1333, local1329);
							}
							local1349++;
						}
					}
				}
			}
			local157.c();
			this.anInterface1_7 = this.aClass14_Sub3_37.method3936(local132, local157.a(), local152);
			this.aClass45_14 = new Class45(this.anInterface1_7, 5126, 3, 0);
			this.aClass45_12 = new Class45(this.anInterface1_7, 5121, 4, 12);
			@Pc(1535) byte local1535;
			if (this.anIntArrayArrayArray15 == null) {
				this.aClass45_13 = new Class45(this.anInterface1_7, 5126, 2, 16);
				local1535 = 24;
			} else {
				local1535 = 28;
				this.aClass45_13 = new Class45(this.anInterface1_7, 5126, 3, 16);
			}
			if ((this.anInt7820 & 0x7) != 0) {
				this.aClass45_11 = new Class45(this.anInterface1_7, 5126, 3, local1535);
			}
			@Pc(1569) long[] local1569 = new long[this.aClass6_Sub52Array1.length];
			for (local1349 = 0; local1349 < this.aClass6_Sub52Array1.length; local1349++) {
				@Pc(1578) Class6_Sub52 local1578 = this.aClass6_Sub52Array1[local1349];
				local1569[local1349] = local1578.aLong263;
				local1578.method7808(this.anInt7823);
			}
			Static16.method368(local1569, this.aClass6_Sub52Array1);
			if (this.aClass166_2 != null) {
				this.aClass166_2.method4242();
			}
		} else {
			this.aClass166_2 = null;
		}
		this.aClass128_38 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray13 = this.aFloatArrayArray11 = null;
		this.anIntArrayArrayArray17 = null;
		this.aByteArrayArray25 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray16 = this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray15 = null;
		this.aClass6_Sub52ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!rk", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9638;
		@Pc(13) int local13 = arg1 >> super.anInt9638;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9640 - 1 || local13 > super.anInt9639 - 1) {
			return 0;
		}
		@Pc(38) int local38 = super.anInt9641 - 1 & arg0;
		@Pc(45) int local45 = super.anInt9641 - 1 & arg1;
		@Pc(72) int local72 = local38 * this.anIntArrayArray70[local8 + 1][local13] + (super.anInt9641 - local38) * this.anIntArrayArray70[local8][local13] >> super.anInt9638;
		@Pc(104) int local104 = this.anIntArrayArray70[local8][local13 + 1] * (super.anInt9641 - local38) + this.anIntArrayArray70[local8 + 1][local13 + 1] * local38 >> super.anInt9638;
		return local45 * local104 + (super.anInt9641 - local45) * local72 >> super.anInt9638;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6421(arg3, arg2, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!rk", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt9640][super.anInt9639][];
		}
		if (arg5 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9640][super.anInt9639][];
		}
		this.anIntArrayArrayArray16[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray14[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub52[] local88 = this.aClass6_Sub52ArrayArrayArray1[arg0][arg1] = new Class6_Sub52[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14);
			@Pc(125) Class6 local125;
			for (local125 = this.aClass128_38.method3263(local119); local125 != null; local125 = this.aClass128_38.method3264()) {
				@Pc(130) Class6_Sub52 local130 = (Class6_Sub52) local125;
				if (local130.anInt9575 == arg8[local90] && (float) arg9[local90] == local130.aFloat203 && arg10 == local130.anInt9577 && arg11 == local130.anInt9574 && local130.anInt9578 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub52(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass128_38.method3267(local88[local90], local119);
			} else {
				local88[local90] = (Class6_Sub52) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray24[arg0][arg1] = (byte) (this.aByteArrayArray24[arg0][arg1] | 0x1);
		}
		if (this.anInt7844 < arg6.length) {
			this.anInt7844 = arg6.length;
		}
		this.anInt7843 += arg6.length;
	}

	@OriginalMember(owner = "client!rk", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass166_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass14_Sub3_37.anInt4583 * arg2 >> 8) >> this.aClass14_Sub3_37.anInt4556;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass14_Sub3_37.anInt4594 >> 8) >> this.aClass14_Sub3_37.anInt4556;
			this.aClass166_2.method4245(local38, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!bj;[I)V")
	@Override
	public void method7866(@OriginalArg(0) Class6_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass361_60.method7833(new Class6_Sub39(this.aClass14_Sub3_37, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class6_Sub2_Sub14 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub14 arg2) {
		if ((this.aByteArrayArray24[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9641 >> this.aClass14_Sub3_37.anInt4556;
		@Pc(27) Class6_Sub2_Sub14_Sub2 local27 = (Class6_Sub2_Sub14_Sub2) arg2;
		@Pc(43) Class6_Sub2_Sub14_Sub2 local43;
		if (local27 != null && local27.method7413(local24, local24)) {
			local43 = local27;
			local27.method7411();
		} else {
			local43 = new Class6_Sub2_Sub14_Sub2(this.aClass14_Sub3_37, local24, local24);
		}
		local43.method7410(local24, 0, local24, 0);
		this.method6423(arg1, arg0, local43);
		return local43;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([[ZIIIZIZ)V")
	private void method6421(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass6_Sub52Array1 == null) {
			return;
		}
		@Pc(16) int local16 = arg1 + arg1 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (this.aClass14_Sub3_37.anIntArray276.length < local20) {
			this.aClass14_Sub3_37.anIntArray276 = new int[local20];
		}
		if (this.aClass14_Sub3_37.aClass6_Sub21_Sub1_1.aByteArray93.length < this.anInt7821 * 2) {
			this.aClass14_Sub3_37.aClass6_Sub21_Sub1_1 = new Class6_Sub21_Sub1(this.anInt7821 * 2);
		}
		@Pc(55) int local55 = arg2 - arg1;
		@Pc(57) int local57 = local55;
		if (local55 < 0) {
			local55 = 0;
		}
		@Pc(66) int local66 = arg3 - arg1;
		@Pc(68) int local68 = local66;
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(76) int local76 = arg1 + arg2;
		if (local76 > super.anInt9640 - 1) {
			local76 = super.anInt9640 - 1;
		}
		@Pc(95) int local95 = arg3 + arg1;
		if (local95 > super.anInt9639 - 1) {
			local95 = super.anInt9639 - 1;
		}
		@Pc(112) int local112 = 0;
		@Pc(116) int[] local116 = this.aClass14_Sub3_37.anIntArray276;
		@Pc(129) int local129;
		for (@Pc(118) int local118 = local55; local118 <= local76; local118++) {
			@Pc(127) boolean[] local127 = arg0[local118 - local57];
			for (local129 = local66; local129 <= local95; local129++) {
				if (local127[local129 - local68]) {
					local116[local112++] = super.anInt9640 * local129 + local118;
				}
			}
		}
		this.aClass14_Sub3_37.method3913();
		this.aClass14_Sub3_37.method3921((this.anInt7820 & 0x7) != 0);
		for (@Pc(194) int local194 = 0; local194 < this.aClass6_Sub52Array1.length; local194++) {
			this.aClass6_Sub52Array1[local194].method7809(local116, local112);
		}
		if (!this.aClass361_60.method7837()) {
			local129 = this.aClass14_Sub3_37.anInt4581;
			@Pc(223) int local223 = this.aClass14_Sub3_37.anInt4593;
			this.aClass14_Sub3_37.X(0, local223, this.aClass14_Sub3_37.anInt4589);
			this.aClass14_Sub3_37.method3921(false);
			this.aClass14_Sub3_37.method3965(false);
			this.aClass14_Sub3_37.method3937(128);
			this.aClass14_Sub3_37.method3962(-2);
			this.aClass14_Sub3_37.method3985(this.aClass14_Sub3_37.aClass51_Sub1_3);
			this.aClass14_Sub3_37.method3976(8448, 7681);
			this.aClass14_Sub3_37.method3966(34166, 0, 770);
			this.aClass14_Sub3_37.method3918(0, 34167);
			for (@Pc(283) Class6 local283 = this.aClass361_60.method7838(); local283 != null; local283 = this.aClass361_60.method7845()) {
				@Pc(288) Class6_Sub39 local288 = (Class6_Sub39) local283;
				local288.method5874(arg3, arg0, arg2, arg1);
			}
			this.aClass14_Sub3_37.method3966(5890, 0, 768);
			this.aClass14_Sub3_37.method3918(0, 5890);
			this.aClass14_Sub3_37.method3985(null);
			this.aClass14_Sub3_37.X(local129, local223, this.aClass14_Sub3_37.anInt4589);
		}
		if (this.aClass166_2 != null) {
			this.aClass14_Sub3_37.method3981(this.aClass45_13, null, this.aClass45_14, null);
			this.aClass166_2.method4244(arg4, arg3, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rk", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray70[arg0][arg1];
	}

	@OriginalMember(owner = "client!rk", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray25[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILclient!uu;)V")
	private void method6423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub2_Sub14_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray16[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass14_Sub3_37.anIntArray274.length) {
			this.aClass14_Sub3_37.anIntArray274 = new int[local22];
			this.aClass14_Sub3_37.anIntArray275 = new int[local22];
		}
		@Pc(50) int[] local50 = this.aClass14_Sub3_37.anIntArray274;
		@Pc(54) int[] local54 = this.aClass14_Sub3_37.anIntArray275;
		for (@Pc(56) int local56 = 0; local56 < local22; local56++) {
			local50[local56] = local12[local56] >> this.aClass14_Sub3_37.anInt4556;
			local54[local56] = local19[local56] >> this.aClass14_Sub3_37.anInt4556;
		}
		@Pc(84) int local84 = 0;
		while (local84 < local22) {
			@Pc(90) int local90 = local50[local84];
			@Pc(95) int local95 = local54[local84++];
			@Pc(99) int local99 = local50[local84];
			@Pc(104) int local104 = local54[local84++];
			@Pc(108) int local108 = local50[local84];
			@Pc(113) int local113 = local54[local84++];
			if (-((local104 - local95) * (local108 - local99)) + (local90 - local99) * (-local113 + local104) > 0) {
				arg2.method7412(local104, local108, local99, local90, local95, local113);
			}
		}
	}
}
