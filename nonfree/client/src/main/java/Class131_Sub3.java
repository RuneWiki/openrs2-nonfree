import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class131_Sub3 extends Class131 {

	@OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
	private int anInt8734;

	@OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
	private int anInt8737;

	@OriginalMember(owner = "client!vh", name = "T", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!vh", name = "U", descriptor = "Lclient!as;")
	public Class19 aClass19_13;

	@OriginalMember(owner = "client!vh", name = "X", descriptor = "Lclient!pi;")
	private Interface11 anInterface11_7;

	@OriginalMember(owner = "client!vh", name = "Y", descriptor = "Lclient!as;")
	public Class19 aClass19_14;

	@OriginalMember(owner = "client!vh", name = "ab", descriptor = "Lclient!as;")
	public Class19 aClass19_15;

	@OriginalMember(owner = "client!vh", name = "bb", descriptor = "I")
	private int anInt8745;

	@OriginalMember(owner = "client!vh", name = "cb", descriptor = "[Lclient!hl;")
	private Class5_Sub25[] aClass5_Sub25Array1;

	@OriginalMember(owner = "client!vh", name = "fb", descriptor = "Lclient!as;")
	private Class19 aClass19_16;

	@OriginalMember(owner = "client!vh", name = "hb", descriptor = "I")
	private int anInt8746;

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "Lclient!fea;")
	private final Class99 aClass99_77 = new Class99();

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "[[I")
	private final int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
	private final int anInt8744;

	@OriginalMember(owner = "client!vh", name = "O", descriptor = "Lclient!jj;")
	public final Class62_Sub3 aClass62_Sub3_41;

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "[[B")
	private final byte[][] aByteArrayArray49;

	@OriginalMember(owner = "client!vh", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!vh", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!vh", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray50;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "[[[Lclient!hl;")
	private Class5_Sub25[][][] aClass5_Sub25ArrayArrayArray1;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
	public final int anInt8731;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[[S")
	public final short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!vh", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
	private final int anInt8724;

	@OriginalMember(owner = "client!vh", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!vh", name = "eb", descriptor = "Lclient!cb;")
	private Class42 aClass42_40;

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "Lclient!mr;")
	private Class202 aClass202_2;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!jj;IIII[[I[[II)V")
	public Class131_Sub3(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray74 = arg5;
		this.anInt8744 = super.anInt8869 - 2;
		this.aClass62_Sub3_41 = arg0;
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aByteArrayArray49 = new byte[arg3][arg4];
		this.aFloatArrayArray13 = new float[super.anInt8873 + 1][super.anInt8871 + 1];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aByteArrayArray50 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aClass5_Sub25ArrayArrayArray1 = new Class5_Sub25[arg3][arg4][];
		this.anInt8731 = arg2;
		this.aShortArrayArray9 = new short[arg4 * arg3][];
		this.aFloatArrayArray14 = new float[super.anInt8873 + 1][super.anInt8871 + 1];
		this.anInt8724 = 0x1 << this.anInt8744;
		this.aFloatArrayArray15 = new float[super.anInt8873 + 1][super.anInt8871 + 1];
		for (@Pc(117) int local117 = 1; local117 < super.anInt8871; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt8873 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local140 * local140 + local157 * local157)));
				this.aFloatArrayArray15[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray13[local121][local117] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray14[local121][local117] = (float) local157 * local176;
			}
		}
		this.aClass42_40 = new Class42(128);
		if ((this.anInt8731 & 0x10) != 0) {
			this.aClass202_2 = new Class202(this.aClass62_Sub3_41, this);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7182(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8745 <= 0) {
			return;
		}
		this.aClass62_Sub3_41.method3955();
		this.aClass62_Sub3_41.method3942(false);
		this.aClass62_Sub3_41.method3970(false);
		this.aClass62_Sub3_41.method3961(false);
		this.aClass62_Sub3_41.method3989(false);
		this.aClass62_Sub3_41.method3979(0);
		this.aClass62_Sub3_41.method3933(-2);
		this.aClass62_Sub3_41.method4007(null);
		Static246.aFloatArray35[3] = 0.0F;
		Static246.aFloatArray35[11] = 0.0F;
		Static246.aFloatArray35[2] = 0.0F;
		Static246.aFloatArray35[6] = 0.0F;
		Static246.aFloatArray35[10] = 0.0F;
		Static246.aFloatArray35[8] = 0.0F;
		Static246.aFloatArray35[5] = (float) 1024 / ((float) super.anInt8874 * 128.0F * (float) this.aClass62_Sub3_41.anInt4485);
		Static246.aFloatArray35[4] = 0.0F;
		Static246.aFloatArray35[0] = (float) 1024 / ((float) this.aClass62_Sub3_41.anInt4471 * (float) super.anInt8874 * 128.0F);
		Static246.aFloatArray35[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass62_Sub3_41.anInt4485;
		Static246.aFloatArray35[7] = 0.0F;
		Static246.aFloatArray35[15] = 1.0F;
		Static246.aFloatArray35[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass62_Sub3_41.anInt4471) - 1.0F;
		Static246.aFloatArray35[1] = 0.0F;
		Static246.aFloatArray35[14] = 0.0F;
		Static246.aFloatArray35[9] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static246.aFloatArray35, 0);
		Static246.aFloatArray35[5] = 0.0F;
		Static246.aFloatArray35[8] = 0.0F;
		Static246.aFloatArray35[6] = 1.0F;
		Static246.aFloatArray35[13] = 0.0F;
		Static246.aFloatArray35[11] = 0.0F;
		Static246.aFloatArray35[15] = 1.0F;
		Static246.aFloatArray35[2] = 0.0F;
		Static246.aFloatArray35[1] = 0.0F;
		Static246.aFloatArray35[12] = 0.0F;
		Static246.aFloatArray35[3] = 0.0F;
		Static246.aFloatArray35[0] = 1.0F;
		Static246.aFloatArray35[7] = 0.0F;
		Static246.aFloatArray35[10] = 0.0F;
		Static246.aFloatArray35[14] = 0.0F;
		Static246.aFloatArray35[4] = 0.0F;
		Static246.aFloatArray35[9] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static246.aFloatArray35, 0);
		if ((this.anInt8731 & 0x7) == 0) {
			this.aClass62_Sub3_41.method3970(false);
		} else {
			this.aClass62_Sub3_41.method3970(true);
			this.aClass62_Sub3_41.method4001();
		}
		this.aClass62_Sub3_41.method4000(this.aClass19_14, this.aClass19_15, this.aClass19_16, this.aClass19_13);
		if (this.anInt8734 * 2 > this.aClass62_Sub3_41.aClass5_Sub3_Sub2_3.aByteArray66.length) {
			this.aClass62_Sub3_41.aClass5_Sub3_Sub2_3 = new Class5_Sub3_Sub2(this.anInt8734 * 2);
		} else {
			this.aClass62_Sub3_41.aClass5_Sub3_Sub2_3.anInt4960 = 0;
		}
		@Pc(317) int local317 = 0;
		@Pc(321) Class5_Sub3_Sub2 local321 = this.aClass62_Sub3_41.aClass5_Sub3_Sub2_3;
		@Pc(327) int local327;
		@Pc(336) int local336;
		@Pc(338) int local338;
		@Pc(356) short[] local356;
		@Pc(360) int local360;
		if (this.aClass62_Sub3_41.aBoolean278) {
			for (local327 = arg1; local327 < arg3; local327++) {
				local336 = arg0 + local327 * super.anInt8873;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local327 - arg1]) {
						local356 = this.aShortArrayArray9[local336];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local317++;
								local321.method4181(local356[local360] & 0xFFFF);
							}
						}
					}
					local336++;
				}
			}
		} else {
			for (local327 = arg1; local327 < arg3; local327++) {
				local336 = arg0 + super.anInt8873 * local327;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local327 - arg1]) {
						local356 = this.aShortArrayArray9[local336];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local321.method4195(local356[local360] & 0xFFFF);
								local317++;
							}
						}
					}
					local336++;
				}
			}
		}
		if (local317 > 0) {
			@Pc(472) Class113_Sub2 local472 = new Class113_Sub2(this.aClass62_Sub3_41, 5123, local321.aByteArray66, local321.anInt4960);
			this.aClass62_Sub3_41.method3938(local472, 0, local317);
		}
	}

	@OriginalMember(owner = "client!vh", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class5_Sub2_Sub13 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub13 arg2) {
		if ((this.aByteArrayArray49[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8874 >> this.aClass62_Sub3_41.anInt4622;
		@Pc(24) Class5_Sub2_Sub13_Sub1 local24 = (Class5_Sub2_Sub13_Sub1) arg2;
		@Pc(34) Class5_Sub2_Sub13_Sub1 local34;
		if (local24 != null && local24.method2142(local21, local21)) {
			local34 = local24;
			local24.method2143();
		} else {
			local34 = new Class5_Sub2_Sub13_Sub1(this.aClass62_Sub3_41, local21, local21);
		}
		local34.method2141(0, local21, local21, 0);
		this.method7096(local34, arg0, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!vh", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt8869;
		@Pc(13) int local13 = arg1 >> super.anInt8869;
		if (local8 < 0 || local13 < 0 || super.anInt8873 - 1 < local8 || super.anInt8871 - 1 < local13) {
			return 0;
		}
		@Pc(46) int local46 = arg0 & super.anInt8874 - 1;
		@Pc(53) int local53 = arg1 & super.anInt8874 - 1;
		@Pc(80) int local80 = local46 * this.anIntArrayArray74[local8 + 1][local13] + this.anIntArrayArray74[local8][local13] * (super.anInt8874 - local46) >> super.anInt8869;
		@Pc(111) int local111 = (super.anInt8874 - local46) * this.anIntArrayArray74[local8][local13 + 1] + local46 * this.anIntArrayArray74[local8 + 1][local13 + 1] >> super.anInt8869;
		return local111 * local53 + local80 * (super.anInt8874 - local53) >> super.anInt8869;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!uca;[I)V")
	@Override
	public void method7187(@OriginalArg(0) Class5_Sub10 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass99_77.method2513(new Class5_Sub26(this.aClass62_Sub3_41, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!vh", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass202_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass62_Sub3_41.anInt4665 * arg2 >> 8) >> this.aClass62_Sub3_41.anInt4622;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass62_Sub3_41.anInt4643 >> 8) >> this.aClass62_Sub3_41.anInt4622;
			this.aClass202_2.method5088(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method7185(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass202_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass62_Sub3_41.anInt4665 * arg2 >> 8) >> this.aClass62_Sub3_41.anInt4622;
			@Pc(40) int local40 = arg3 - (this.aClass62_Sub3_41.anInt4643 * arg2 >> 8) >> this.aClass62_Sub3_41.anInt4622;
			return this.aClass202_2.method5086(local25, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!vh", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass202_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass62_Sub3_41.anInt4665 * arg2 >> 8) >> this.aClass62_Sub3_41.anInt4622;
			@Pc(39) int local39 = arg3 - (this.aClass62_Sub3_41.anInt4643 * arg2 >> 8) >> this.aClass62_Sub3_41.anInt4622;
			this.aClass202_2.method5085(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!vh", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt8745 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt8873 + 1][super.anInt8871 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; super.anInt8873 > local16; local16++) {
				for (local20 = 1; local20 < super.anInt8871; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray50[local16][local20 - 1] >> 2) + (this.aByteArrayArray50[local16 - 1][local20] >> 2) + (this.aByteArrayArray50[local16 + 1][local20] >> 3) + (this.aByteArrayArray50[local16][local20 + 1] >> 3) + (this.aByteArrayArray50[local16][local20] >> 1));
				}
			}
			this.aClass5_Sub25Array1 = new Class5_Sub25[this.aClass42_40.method1111()];
			this.aClass42_40.method1113(this.aClass5_Sub25Array1);
			for (local20 = 0; local20 < this.aClass5_Sub25Array1.length; local20++) {
				this.aClass5_Sub25Array1[local20].method3148(this.anInt8745);
			}
			@Pc(136) int local136 = 24;
			if (this.anIntArrayArrayArray20 != null) {
				local136 += 4;
			}
			if ((this.anInt8731 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(159) NativeHeapBuffer local159 = this.aClass62_Sub3_41.aNativeHeap3.a(this.anInt8745 * local136, false);
			@Pc(164) Stream local164 = new Stream(local159);
			@Pc(168) Class5_Sub25[] local168 = new Class5_Sub25[this.anInt8745];
			@Pc(175) int local175 = Static7.method265(this.anInt8745 / 4);
			if (local175 < 1) {
				local175 = 1;
			}
			@Pc(185) Class42 local185 = new Class42(local175);
			@Pc(189) Class5_Sub25[] local189 = new Class5_Sub25[this.anInt8746];
			@Pc(195) int local195;
			for (@Pc(191) int local191 = 0; super.anInt8873 > local191; local191++) {
				for (local195 = 0; super.anInt8871 > local195; local195++) {
					if (this.anIntArrayArrayArray16[local191][local195] != null) {
						@Pc(211) Class5_Sub25[] local211 = this.aClass5_Sub25ArrayArrayArray1[local191][local195];
						@Pc(218) int[] local218 = this.anIntArrayArrayArray15[local191][local195];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray19[local191][local195];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray18[local191][local195];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray16[local191][local195];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local191][local195];
						if (local232 == null) {
							local232 = local239;
						}
						@Pc(267) int[] local267 = this.anIntArrayArrayArray20 == null ? null : this.anIntArrayArrayArray20[local191][local195];
						@Pc(274) float local274 = this.aFloatArrayArray15[local191][local195];
						@Pc(281) float local281 = this.aFloatArrayArray13[local191][local195];
						@Pc(288) float local288 = this.aFloatArrayArray14[local191][local195];
						@Pc(297) float local297 = this.aFloatArrayArray15[local191][local195 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray13[local191][local195 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray14[local191][local195 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray15[local191 + 1][local195 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray13[local191 + 1][local195 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray14[local191 + 1][local195 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray15[local191 + 1][local195];
						@Pc(366) float local366 = this.aFloatArrayArray13[local191 + 1][local195];
						@Pc(375) float local375 = this.aFloatArrayArray14[local191 + 1][local195];
						@Pc(383) int local383 = local14[local191][local195] & 0xFF;
						@Pc(393) int local393 = local14[local191][local195 + 1] & 0xFF;
						@Pc(405) int local405 = local14[local191 + 1][local195 + 1] & 0xFF;
						@Pc(415) int local415 = local14[local191 + 1][local195] & 0xFF;
						@Pc(417) int local417 = 0;
						@Pc(427) int local427;
						label337: for (@Pc(419) int local419 = 0; local419 < local239.length; local419++) {
							@Pc(425) Class5_Sub25 local425 = local211[local419];
							for (local427 = 0; local427 < local417; local427++) {
								if (local189[local427] == local425) {
									continue label337;
								}
							}
							local189[local417++] = local425;
						}
						@Pc(464) short[] local464 = this.aShortArrayArray9[local191 + super.anInt8873 * local195] = new short[local239.length];
						for (local427 = 0; local427 < local239.length; local427++) {
							@Pc(478) int local478 = (local191 << super.anInt8869) + local218[local427];
							@Pc(488) int local488 = (local195 << super.anInt8869) + local225[local427];
							@Pc(493) int local493 = local478 >> this.anInt8744;
							@Pc(498) int local498 = local488 >> this.anInt8744;
							@Pc(502) int local502 = local239[local427];
							@Pc(506) int local506 = local232[local427];
							@Pc(514) int local514 = local251 == null ? 0 : local251[local427];
							@Pc(532) long local532 = (long) local498 | (long) (local493 << 16) | (long) local502 << 32 | (long) local506 << 48;
							@Pc(536) int local536 = local218[local427];
							@Pc(540) int local540 = local225[local427];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(638) float local638;
							@Pc(655) float local655;
							@Pc(664) float local664;
							@Pc(604) float local604;
							@Pc(702) int local702;
							if (local536 == 0 && local540 == 0) {
								local638 = local274;
								local655 = local281;
								local702 = local542 - local383;
								local664 = local288;
							} else if (local536 == 0 && local540 == super.anInt8874) {
								local702 = local542 - local393;
								local655 = local306;
								local664 = local315;
								local638 = local297;
							} else if (super.anInt8874 == local536 && super.anInt8874 == local540) {
								local638 = local326;
								local655 = local337;
								local664 = local348;
								local702 = local542 - local405;
							} else if (local536 == super.anInt8874 && local540 == 0) {
								local638 = local357;
								local702 = local542 - local415;
								local655 = local366;
								local664 = local375;
							} else {
								@Pc(581) float local581 = (float) local536 / (float) super.anInt8874;
								@Pc(588) float local588 = (float) local540 / (float) super.anInt8874;
								@Pc(596) float local596 = local274 + (local357 - local274) * local581;
								local604 = local281 + local581 * (local366 - local281);
								@Pc(613) float local613 = local288 + local581 * (local375 - local288);
								@Pc(621) float local621 = local581 * (local326 - local297) + local297;
								@Pc(630) float local630 = (local337 - local306) * local581 + local306;
								local638 = local588 * (local621 - local596) + local596;
								@Pc(646) float local646 = local315 + (local348 - local315) * local581;
								local655 = local604 + (local630 - local604) * local588;
								local664 = (local646 - local613) * local588 + local613;
								@Pc(676) int local676 = local383 + ((local415 - local383) * local536 >> super.anInt8869);
								@Pc(687) int local687 = (local536 * (local405 - local393) >> super.anInt8869) + local393;
								local702 = local542 - local676 - ((local687 - local676) * local540 >> super.anInt8869);
							}
							if (local502 != -1) {
								@Pc(762) int local762 = (local502 & 0x7F) * local702 >> 7;
								if (local762 < 2) {
									local762 = 2;
								} else if (local762 > 126) {
									local762 = 126;
								}
								if ((this.anInt8731 & 0x7) == 0) {
									local546 = local655 * this.aClass62_Sub3_41.aFloatArray34[1] + this.aClass62_Sub3_41.aFloatArray34[0] * local638 + this.aClass62_Sub3_41.aFloatArray34[2] * local664;
									local546 = (local546 > 0.0F ? this.aClass62_Sub3_41.aFloat206 : this.aClass62_Sub3_41.aFloat200) * local546 + this.aClass62_Sub3_41.aFloat191;
								}
								local544 = Static444.anIntArray587[local502 & 0xFF80 | local762];
							}
							@Pc(836) Class5 local836 = null;
							if ((local478 & this.anInt8724 - 1) == 0 && (local488 & this.anInt8724 - 1) == 0) {
								local836 = local185.method1109(local532);
							}
							@Pc(872) int local872;
							@Pc(930) int local930;
							if (local836 == null) {
								if (local506 == local502) {
									local930 = local544;
								} else {
									@Pc(908) int local908 = local702 * (local506 & 0x7F) >> 7;
									if (local908 < 2) {
										local908 = 2;
									} else if (local908 > 126) {
										local908 = 126;
									}
									local930 = Static444.anIntArray587[local506 & 0xFF80 | local908];
									if ((this.anInt8731 & 0x7) == 0) {
										@Pc(958) float local958 = this.aClass62_Sub3_41.aFloatArray34[0] * local638 + local655 * this.aClass62_Sub3_41.aFloatArray34[1] + this.aClass62_Sub3_41.aFloatArray34[2] * local664;
										local604 = local546 * (local546 > 0.0F ? this.aClass62_Sub3_41.aFloat206 : this.aClass62_Sub3_41.aFloat200) + this.aClass62_Sub3_41.aFloat191;
										@Pc(983) int local983 = local930 >> 16 & 0xFF;
										@Pc(989) int local989 = local930 >> 8 & 0xFF;
										@Pc(993) int local993 = local930 & 0xFF;
										local983 = (int) ((float) local983 * local604);
										if (local983 < 0) {
											local983 = 0;
										} else if (local983 > 255) {
											local983 = 255;
										}
										local989 = (int) ((float) local989 * local604);
										local993 = (int) ((float) local993 * local604);
										if (local989 < 0) {
											local989 = 0;
										} else if (local989 > 255) {
											local989 = 255;
										}
										if (local993 < 0) {
											local993 = 0;
										} else if (local993 > 255) {
											local993 = 255;
										}
										local930 = local993 | local983 << 16 | local989 << 8;
									}
								}
								if (this.aClass62_Sub3_41.aBoolean278) {
									local164.b((float) local478);
									local164.b((float) (this.aa(local478, local488) + local514));
									local164.b((float) local488);
									local164.d((byte) (local930 >> 16));
									local164.d((byte) (local930 >> 8));
									local164.d((byte) local930);
									local164.d(-1);
									local164.b((float) local478);
									local164.b((float) local488);
									if (this.anIntArrayArrayArray20 != null) {
										local164.b((float) (local267 == null ? 0 : local267[local427] - 1));
									}
									if ((this.anInt8731 & 0x7) != 0) {
										local164.b(local638);
										local164.b(local655);
										local164.b(local664);
									}
								} else {
									local164.a((float) local478);
									local164.a((float) (local514 + this.aa(local478, local488)));
									local164.a((float) local488);
									local164.d((byte) (local930 >> 16));
									local164.d((byte) (local930 >> 8));
									local164.d((byte) local930);
									local164.d(-1);
									local164.a((float) local478);
									local164.a((float) local488);
									if (this.anIntArrayArrayArray20 != null) {
										local164.a((float) (local267 == null ? 0 : local267[local427] - 1));
									}
									if ((this.anInt8731 & 0x7) != 0) {
										local164.a(local638);
										local164.a(local655);
										local164.a(local664);
									}
								}
								local872 = this.anInt8737++;
								local464[local427] = (short) local872;
								if (local502 != -1) {
									local168[local872] = local211[local427];
								}
								local185.method1106(local532, new Class5_Sub35(local464[local427]));
							} else {
								local464[local427] = ((Class5_Sub35) local836).aShort88;
								local872 = local464[local427] & 0xFFFF;
								if (local502 != -1 && local168[local872].aLong253 > local211[local427].aLong253) {
									local168[local872] = local211[local427];
								}
							}
							for (local930 = 0; local930 < local417; local930++) {
								local189[local930].method3154(local702, local546, local544, local872);
							}
							this.anInt8734++;
						}
					}
				}
			}
			for (local195 = 0; local195 < this.anInt8737; local195++) {
				@Pc(1307) Class5_Sub25 local1307 = local168[local195];
				if (local1307 != null) {
					local1307.method3150(local195);
				}
			}
			@Pc(1344) int local1344;
			for (@Pc(1324) int local1324 = 0; super.anInt8873 > local1324; local1324++) {
				for (@Pc(1328) int local1328 = 0; super.anInt8871 > local1328; local1328++) {
					@Pc(1340) short[] local1340 = this.aShortArrayArray9[local1328 * super.anInt8873 + local1324];
					if (local1340 != null) {
						local1344 = 0;
						@Pc(1346) int local1346 = 0;
						while (local1346 < local1340.length) {
							@Pc(1355) int local1355 = local1340[local1346++] & 0xFFFF;
							@Pc(1362) int local1362 = local1340[local1346++] & 0xFFFF;
							@Pc(1369) int local1369 = local1340[local1346++] & 0xFFFF;
							@Pc(1373) Class5_Sub25 local1373 = local168[local1355];
							@Pc(1377) Class5_Sub25 local1377 = local168[local1362];
							@Pc(1381) Class5_Sub25 local1381 = local168[local1369];
							@Pc(1383) Class5_Sub25 local1383 = null;
							if (local1373 != null) {
								local1383 = local1373;
								local1373.method3146(local1328, local1344, local1324);
							}
							if (local1377 != null) {
								local1377.method3146(local1328, local1344, local1324);
								if (local1383 == null || local1383.aLong253 > local1377.aLong253) {
									local1383 = local1377;
								}
							}
							if (local1381 != null) {
								local1381.method3146(local1328, local1344, local1324);
								if (local1383 == null || local1381.aLong253 < local1383.aLong253) {
									local1383 = local1381;
								}
							}
							if (local1383 != null) {
								if (local1373 != null) {
									local1383.method3150(local1355);
								}
								if (local1377 != null) {
									local1383.method3150(local1362);
								}
								if (local1381 != null) {
									local1383.method3150(local1369);
								}
								local1383.method3146(local1328, local1344, local1324);
							}
							local1344++;
						}
					}
				}
			}
			local164.b();
			this.anInterface11_7 = this.aClass62_Sub3_41.method3977(local159, local136, local164.a());
			this.aClass19_13 = new Class19(this.anInterface11_7, 5126, 3, 0);
			this.aClass19_16 = new Class19(this.anInterface11_7, 5121, 4, 12);
			@Pc(1520) byte local1520;
			if (this.anIntArrayArrayArray20 == null) {
				this.aClass19_14 = new Class19(this.anInterface11_7, 5126, 2, 16);
				local1520 = 24;
			} else {
				local1520 = 28;
				this.aClass19_14 = new Class19(this.anInterface11_7, 5126, 3, 16);
			}
			if ((this.anInt8731 & 0x7) != 0) {
				this.aClass19_15 = new Class19(this.anInterface11_7, 5126, 3, local1520);
			}
			@Pc(1564) long[] local1564 = new long[this.aClass5_Sub25Array1.length];
			for (local1344 = 0; local1344 < this.aClass5_Sub25Array1.length; local1344++) {
				@Pc(1573) Class5_Sub25 local1573 = this.aClass5_Sub25Array1[local1344];
				local1564[local1344] = local1573.aLong253;
				local1573.method3147(this.anInt8737);
			}
			Static501.method6902(local1564, this.aClass5_Sub25Array1);
			if (this.aClass202_2 != null) {
				this.aClass202_2.method5081();
			}
		} else {
			this.aClass202_2 = null;
		}
		this.anIntArrayArrayArray17 = null;
		this.aClass5_Sub25ArrayArrayArray1 = null;
		this.anIntArrayArrayArray18 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray15 = this.anIntArrayArrayArray19 = null;
		this.aClass42_40 = null;
		this.aByteArrayArray50 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray13 = this.aFloatArrayArray14 = null;
	}

	@OriginalMember(owner = "client!vh", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt8873][super.anInt8871][];
		}
		if (arg5 != null && this.anIntArrayArrayArray20 == null) {
			this.anIntArrayArrayArray20 = new int[super.anInt8873][super.anInt8871][];
		}
		this.anIntArrayArrayArray15[arg0][arg1] = arg2;
		this.anIntArrayArrayArray19[arg0][arg1] = arg4;
		this.anIntArrayArrayArray16[arg0][arg1] = arg6;
		this.anIntArrayArrayArray18[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray20 != null) {
			this.anIntArrayArrayArray20[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg3;
		}
		@Pc(88) Class5_Sub25[] local88 = this.aClass5_Sub25ArrayArrayArray1[arg0][arg1] = new Class5_Sub25[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class5 local125;
			for (local125 = this.aClass42_40.method1109(local119); local125 != null; local125 = this.aClass42_40.method1110()) {
				@Pc(130) Class5_Sub25 local130 = (Class5_Sub25) local125;
				if (arg8[local90] == local130.anInt3593 && (float) arg9[local90] == local130.aFloat167 && local130.anInt3596 == arg10 && arg11 == local130.anInt3600 && local130.anInt3601 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class5_Sub25(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass42_40.method1106(local119, local88[local90]);
			} else {
				local88[local90] = (Class5_Sub25) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray49[arg0][arg1] = (byte) (this.aByteArrayArray49[arg0][arg1] | 0x1);
		}
		if (this.anInt8746 < arg6.length) {
			this.anInt8746 = arg6.length;
		}
		this.anInt8745 += arg6.length;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method7098(arg0, arg1, arg3, arg2, arg4);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!vh", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray50[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray50[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	@Override
	public void method7183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!ec;II)V")
	private void method7096(@OriginalArg(1) Class5_Sub2_Sub13_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray15[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray19[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (this.aClass62_Sub3_41.anIntArray302.length < local22) {
			this.aClass62_Sub3_41.anIntArray301 = new int[local22];
			this.aClass62_Sub3_41.anIntArray302 = new int[local22];
		}
		@Pc(50) int[] local50 = this.aClass62_Sub3_41.anIntArray302;
		@Pc(54) int[] local54 = this.aClass62_Sub3_41.anIntArray301;
		for (@Pc(56) int local56 = 0; local56 < local22; local56++) {
			local50[local56] = local12[local56] >> this.aClass62_Sub3_41.anInt4622;
			local54[local56] = local19[local56] >> this.aClass62_Sub3_41.anInt4622;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(90) int local90 = local50[local84];
			@Pc(95) int local95 = local54[local84++];
			@Pc(99) int local99 = local50[local84];
			@Pc(104) int local104 = local54[local84++];
			@Pc(108) int local108 = local50[local84];
			@Pc(113) int local113 = local54[local84++];
			if ((local104 - local113) * (local90 - local99) - (local108 - local99) * (local104 - local95) > 0) {
				arg0.method2144(local99, local90, local104, local113, local108, local95);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII[[ZIZ)V")
	private void method7098(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean[][] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass5_Sub25Array1 == null) {
			return;
		}
		@Pc(18) float local18 = this.aClass62_Sub3_41.aFloat189;
		@Pc(22) float local22 = this.aClass62_Sub3_41.aFloat203;
		@Pc(28) int local28 = arg3 + arg3 + 1;
		@Pc(32) int local32 = local28 * local28;
		if (this.aClass62_Sub3_41.anIntArray300.length < local32) {
			this.aClass62_Sub3_41.anIntArray300 = new int[local32];
		}
		if (this.aClass62_Sub3_41.aClass5_Sub3_Sub2_3.aByteArray66.length < this.anInt8734 * 2) {
			this.aClass62_Sub3_41.aClass5_Sub3_Sub2_3 = new Class5_Sub3_Sub2(this.anInt8734 * 2);
		}
		@Pc(72) int local72 = arg0 - arg3;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(83) int local83 = arg1 - arg3;
		@Pc(85) int local85 = local83;
		if (local83 < 0) {
			local83 = 0;
		}
		@Pc(96) int local96 = arg0 + arg3;
		if (local96 > super.anInt8873 - 1) {
			local96 = super.anInt8873 - 1;
		}
		@Pc(111) int local111 = arg3 + arg1;
		if (super.anInt8871 - 1 < local111) {
			local111 = super.anInt8871 - 1;
		}
		@Pc(128) int local128 = 0;
		@Pc(132) int[] local132 = this.aClass62_Sub3_41.anIntArray300;
		@Pc(145) int local145;
		for (@Pc(134) int local134 = local72; local134 <= local96; local134++) {
			@Pc(143) boolean[] local143 = arg2[local134 - local74];
			for (local145 = local83; local145 <= local111; local145++) {
				if (local143[local145 - local85]) {
					local132[local128++] = local134 + super.anInt8873 * local145;
				}
			}
		}
		this.aClass62_Sub3_41.method3967();
		this.aClass62_Sub3_41.method3970((this.anInt8731 & 0x7) != 0);
		for (@Pc(217) int local217 = 0; local217 < this.aClass5_Sub25Array1.length; local217++) {
			this.aClass5_Sub25Array1[local217].method3153(local128, local132);
		}
		if (!this.aClass99_77.method2523()) {
			local145 = this.aClass62_Sub3_41.anInt4634;
			@Pc(250) int local250 = this.aClass62_Sub3_41.anInt4653;
			this.aClass62_Sub3_41.E(0, local250, this.aClass62_Sub3_41.anInt4646);
			this.aClass62_Sub3_41.la(local22, local18 - 4.0F);
			this.aClass62_Sub3_41.method3970(false);
			this.aClass62_Sub3_41.method3989(false);
			this.aClass62_Sub3_41.method3979(128);
			this.aClass62_Sub3_41.method3933(-2);
			this.aClass62_Sub3_41.method4007(this.aClass62_Sub3_41.aClass4_Sub2_1);
			this.aClass62_Sub3_41.method4011(7681, 8448);
			this.aClass62_Sub3_41.method3984(34166, 0, 770);
			this.aClass62_Sub3_41.method4003(0, 34167);
			for (@Pc(323) Class5 local323 = this.aClass99_77.method2526(); local323 != null; local323 = this.aClass99_77.method2519()) {
				@Pc(328) Class5_Sub26 local328 = (Class5_Sub26) local323;
				local328.method3342(arg2, arg3, arg0, arg1);
			}
			this.aClass62_Sub3_41.method3984(5890, 0, 768);
			this.aClass62_Sub3_41.method4003(0, 5890);
			this.aClass62_Sub3_41.method4007(null);
			this.aClass62_Sub3_41.E(local145, local250, this.aClass62_Sub3_41.anInt4646);
		}
		if (this.aClass202_2 != null) {
			this.aClass62_Sub3_41.la(local22, local18 - 8.0F);
			this.aClass62_Sub3_41.method3967();
			this.aClass62_Sub3_41.method4000(this.aClass19_14, null, null, this.aClass19_13);
			this.aClass202_2.method5084(arg4, arg2, arg0, arg1, arg3);
		}
		this.aClass62_Sub3_41.la(local22, local18);
	}

	@OriginalMember(owner = "client!vh", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray74[arg0][arg1];
	}
}
