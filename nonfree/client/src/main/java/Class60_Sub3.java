import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class60_Sub3 extends Class60 {

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	private int anInt8346;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	private int anInt8350;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "Lclient!qca;")
	public Class258 aClass258_14;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
	private int anInt8369;

	@OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lclient!vp;")
	private Interface23 anInterface23_12;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "Lclient!vp;")
	private Interface23 anInterface23_13;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
	private int anInt8370;

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "[Lclient!al;")
	private Class6_Sub2[] aClass6_Sub2Array1;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "F")
	private float aFloat177 = -3.4028235E38F;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "F")
	private float aFloat178 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!rh;")
	private final Class275 aClass275_179 = new Class275();

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray82;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "Lclient!sv;")
	public final Class121_Sub2 aClass121_Sub2_18;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
	private final int anInt8355;

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "[[B")
	private byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
	public final int anInt8368;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	private final int anInt8349;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray24;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray23;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray22;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "[[[Lclient!al;")
	private Class6_Sub2[][][] aClass6_Sub2ArrayArrayArray1;

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "[[S")
	public final short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[[B")
	private final byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lclient!nj;")
	private Class212 aClass212_35;

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "Lclient!rv;")
	private Class283 aClass283_2;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!sv;IIII[[I[[II)V")
	public Class60_Sub3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray82 = arg5;
		this.aClass121_Sub2_18 = arg0;
		this.anInt8355 = super.anInt9654 - 2;
		this.aByteArrayArray26 = new byte[arg3 + 1][arg4 + 1];
		this.anInt8368 = arg2;
		this.anInt8349 = 0x1 << this.anInt8355;
		this.anIntArrayArrayArray21 = new int[arg3][arg4][];
		this.anIntArrayArrayArray24 = new int[arg3][arg4][];
		this.anIntArrayArrayArray23 = new int[arg3][arg4][];
		this.anIntArrayArrayArray22 = new int[arg3][arg4][];
		this.aFloatArrayArray14 = new float[super.anInt9656 + 1][super.anInt9657 + 1];
		this.aFloatArrayArray12 = new float[super.anInt9656 + 1][super.anInt9657 + 1];
		this.aFloatArrayArray13 = new float[super.anInt9656 + 1][super.anInt9657 + 1];
		this.aClass6_Sub2ArrayArrayArray1 = new Class6_Sub2[arg3][arg4][];
		this.aShortArrayArray13 = new short[arg4 * arg3][];
		this.aByteArrayArray25 = new byte[arg3][arg4];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		for (@Pc(123) int local123 = 0; local123 <= super.anInt9657; local123++) {
			for (@Pc(127) int local127 = 0; super.anInt9656 >= local127; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray82[local127][local123];
				if (this.aFloat178 > (float) local136) {
					this.aFloat178 = local136;
				}
				if (this.aFloat177 < (float) local136) {
					this.aFloat177 = local136;
				}
				if (local127 > 0 && local123 > 0 && local127 < super.anInt9656 && super.anInt9657 > local123) {
					@Pc(195) int local195 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(211) int local211 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(231) float local231 = (float) (1.0D / Math.sqrt((double) (local195 * local195 + arg7 * 4 * arg7 + local211 * local211)));
					this.aFloatArrayArray13[local127][local123] = (float) local195 * local231;
					this.aFloatArrayArray14[local127][local123] = (float) (-arg7 * 2) * local231;
					this.aFloatArrayArray12[local127][local123] = (float) local211 * local231;
				}
			}
		}
		this.aFloat177++;
		this.aFloat178--;
		this.aClass212_35 = new Class212(128);
		if ((this.anInt8368 & 0x10) != 0) {
			this.aClass283_2 = new Class283(this.aClass121_Sub2_18, this);
		}
	}

	@OriginalMember(owner = "client!ua", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass283_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass121_Sub2_18.anInt8911 >> 8) >> this.aClass121_Sub2_18.anInt8912;
			@Pc(38) int local38 = arg3 - (this.aClass121_Sub2_18.anInt8921 * arg2 >> 8) >> this.aClass121_Sub2_18.anInt8912;
			this.aClass283_2.method6437(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ua", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt9656][super.anInt9657][];
		}
		if (arg5 != null && this.anIntArrayArrayArray20 == null) {
			this.anIntArrayArrayArray20 = new int[super.anInt9656][super.anInt9657][];
		}
		this.anIntArrayArrayArray23[arg0][arg1] = arg2;
		this.anIntArrayArrayArray21[arg0][arg1] = arg4;
		this.anIntArrayArrayArray24[arg0][arg1] = arg6;
		this.anIntArrayArrayArray22[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray20 != null) {
			this.anIntArrayArrayArray20[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub2[] local88 = this.aClass6_Sub2ArrayArrayArray1[arg0][arg1] = new Class6_Sub2[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
			@Pc(125) Class6 local125;
			for (local125 = this.aClass212_35.method5106(local119); local125 != null; local125 = this.aClass212_35.method5107()) {
				@Pc(130) Class6_Sub2 local130 = (Class6_Sub2) local125;
				if (local130.anInt251 == arg8[local90] && (float) arg9[local90] == local130.aFloat5 && local130.anInt252 == arg10 && local130.anInt253 == arg11 && local130.anInt258 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub2(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass212_35.method5104(local119, local88[local90]);
			} else {
				local88[local90] = (Class6_Sub2) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray25[arg0][arg1] = (byte) (this.aByteArrayArray25[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8369) {
			this.anInt8369 = arg6.length;
		}
		this.anInt8370 += arg6.length;
	}

	@OriginalMember(owner = "client!ua", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray26[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray26[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray82[arg0][arg1];
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7894(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8370 <= 0) {
			return;
		}
		@Pc(19) Interface11 local19 = this.aClass121_Sub2_18.method7281(this.anInt8350);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7569();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass121_Sub2_18.method7200(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(77) short[] local77;
				@Pc(81) int local81;
				@Pc(89) int local89;
				if (Stream.a()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = super.anInt9656 * local48 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray13[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										if (local89 > local25) {
											local25 = local89;
										}
										if (local89 < local23) {
											local23 = local89;
										}
										local44.f(local89);
										local21++;
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt9656 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray13[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										local21++;
										local44.b(local89);
										if (local25 < local89) {
											local25 = local89;
										}
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
				local44.c();
				if (local19.method7563()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass121_Sub2_18.method7252();
		this.aClass121_Sub2_18.method7296(false);
		this.aClass121_Sub2_18.method7240(false);
		this.aClass121_Sub2_18.method7264(false);
		this.aClass121_Sub2_18.method7228(false);
		this.aClass121_Sub2_18.method7164(0);
		this.aClass121_Sub2_18.method7290(-2, false, false);
		this.aClass121_Sub2_18.method7167(null);
		@Pc(271) Class34_Sub3 local271 = this.aClass121_Sub2_18.method7275();
		@Pc(276) float[] local276 = this.aClass121_Sub2_18.method7268();
		local276[11] = 0.0F;
		local276[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass121_Sub2_18.anInt8864;
		local276[3] = 0.0F;
		local276[1] = 0.0F;
		local276[9] = 0.0F;
		local276[14] = -this.aFloat178 / (this.aFloat177 - this.aFloat178);
		local276[6] = 0.0F;
		local276[7] = 0.0F;
		local276[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass121_Sub2_18.anInt8869;
		local276[15] = 1.0F;
		local276[5] = (float) 1024 / ((float) this.aClass121_Sub2_18.anInt8864 * 128.0F * (float) super.anInt9652);
		local276[0] = (float) 1024 / ((float) this.aClass121_Sub2_18.anInt8869 * (float) super.anInt9652 * 128.0F);
		local276[10] = 1.0F / (this.aFloat177 - this.aFloat178);
		local276[4] = 0.0F;
		local276[8] = 0.0F;
		local276[2] = 0.0F;
		local271.method3759(0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.aClass121_Sub2_18.method7213();
		this.aClass121_Sub2_18.method7233();
		if ((this.anInt8368 & 0x7) == 0) {
			this.aClass121_Sub2_18.method7240(false);
		} else {
			this.aClass121_Sub2_18.method7240(true);
			this.aClass121_Sub2_18.method7246();
		}
		this.aClass121_Sub2_18.method7221(false);
		this.aClass121_Sub2_18.method7297(0, this.anInterface23_12);
		this.aClass121_Sub2_18.method7297(1, this.anInterface23_13);
		this.aClass121_Sub2_18.method7263(this.aClass258_14);
		this.aClass121_Sub2_18.method7239(local23, local25 + 1 - local23, local19, local21 / 3, Static503.aClass107_2, 0);
		this.aClass121_Sub2_18.method7221(true);
	}

	@OriginalMember(owner = "client!ua", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass283_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass121_Sub2_18.anInt8911 >> 8) >> this.aClass121_Sub2_18.anInt8912;
			@Pc(39) int local39 = arg3 - (this.aClass121_Sub2_18.anInt8921 * arg2 >> 8) >> this.aClass121_Sub2_18.anInt8912;
			this.aClass283_2.method6440(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6918(arg2, arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII[[ZZI)V")
	private void method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) boolean arg4) {
		if (this.aClass6_Sub2Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg0 + arg0 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (local18 > Static78.anIntArray95.length) {
			Static78.anIntArray95 = new int[local18];
		}
		@Pc(33) int local33 = arg1 - arg0;
		@Pc(35) int local35 = local33;
		if (local33 < 0) {
			local33 = 0;
		}
		@Pc(44) int local44 = arg2 - arg0;
		@Pc(46) int local46 = local44;
		if (local44 < 0) {
			local44 = 0;
		}
		@Pc(57) int local57 = arg0 + arg1;
		if (local57 > super.anInt9656 - 1) {
			local57 = super.anInt9656 - 1;
		}
		@Pc(76) int local76 = arg0 + arg2;
		Static470.anInt7956 = 0;
		if (local76 > super.anInt9657 - 1) {
			local76 = super.anInt9657 - 1;
		}
		for (@Pc(95) int local95 = local33; local95 <= local57; local95++) {
			@Pc(104) boolean[] local104 = arg3[local95 - local35];
			for (@Pc(106) int local106 = local44; local106 <= local76; local106++) {
				if (local104[local106 - local46]) {
					Static78.anIntArray95[Static470.anInt7956++] = local106 * super.anInt9656 + local95;
				}
			}
		}
		this.aClass121_Sub2_18.method7232();
		this.aClass121_Sub2_18.method7197();
		this.aClass121_Sub2_18.method7240((this.anInt8368 & 0x7) != 0);
		this.aClass121_Sub2_18.method7290(-1, false, false);
		this.aClass121_Sub2_18.method7297(0, this.anInterface23_12);
		for (@Pc(194) int local194 = 0; local194 < this.aClass6_Sub2Array1.length; local194++) {
			this.aClass6_Sub2Array1[local194].method213(Static470.anInt7956, Static78.anIntArray95);
		}
		@Pc(219) Class34_Sub3 local219 = this.aClass121_Sub2_18.method7275();
		local219.GA(0, -1, 0);
		this.aClass121_Sub2_18.method7233();
		if (!this.aClass275_179.method6371()) {
			@Pc(237) int local237 = this.aClass121_Sub2_18.anInt8914;
			@Pc(241) int local241 = this.aClass121_Sub2_18.anInt8913;
			this.aClass121_Sub2_18.X(0, local241, this.aClass121_Sub2_18.anInt8898);
			this.aClass121_Sub2_18.method7240(false);
			this.aClass121_Sub2_18.method7228(false);
			this.aClass121_Sub2_18.method7164(128);
			this.aClass121_Sub2_18.method7290(-2, false, false);
			this.aClass121_Sub2_18.method7167(this.aClass121_Sub2_18.anInterface3_3);
			this.aClass121_Sub2_18.method7198(Static526.aClass59_4, Static241.aClass59_1);
			this.aClass121_Sub2_18.method7270(Static257.aClass305_4, 0);
			this.aClass121_Sub2_18.method7195(Static121.aClass305_2, 0);
			for (@Pc(303) Class6 local303 = this.aClass275_179.method6366(); local303 != null; local303 = this.aClass275_179.method6364()) {
				@Pc(308) Class6_Sub33 local308 = (Class6_Sub33) local303;
				local308.method4103(arg1, arg0, arg3, arg2);
			}
			this.aClass121_Sub2_18.method7270(Static67.aClass305_1, 0);
			this.aClass121_Sub2_18.method7195(Static67.aClass305_1, 0);
			this.aClass121_Sub2_18.method7167(null);
			this.aClass121_Sub2_18.X(local237, local241, this.aClass121_Sub2_18.anInt8898);
		}
		if (this.aClass283_2 != null) {
			this.aClass121_Sub2_18.method7297(0, this.anInterface23_12);
			this.aClass121_Sub2_18.method7297(1, this.anInterface23_13);
			this.aClass121_Sub2_18.method7263(this.aClass258_14);
			this.aClass283_2.method6441(arg1, arg2, arg0, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class6_Sub1_Sub12 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1_Sub12 arg2) {
		if ((this.aByteArrayArray25[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9652 >> this.aClass121_Sub2_18.anInt8912;
		@Pc(24) Class6_Sub1_Sub12_Sub1 local24 = (Class6_Sub1_Sub12_Sub1) arg2;
		@Pc(40) Class6_Sub1_Sub12_Sub1 local40;
		if (local24 != null && local24.method4890(local21, local21)) {
			local40 = local24;
			local24.method4891();
		} else {
			local40 = new Class6_Sub1_Sub12_Sub1(this.aClass121_Sub2_18, local21, local21);
		}
		local40.method4892(0, 0, local21, local21);
		this.method6921(arg0, arg1, local40);
		return local40;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!hj;[I)V")
	@Override
	public void method7893(@OriginalArg(0) Class6_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass275_179.method6370(new Class6_Sub33(this.aClass121_Sub2_18, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ua", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt8370 <= 0) {
			this.aClass283_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt9656 + 1][super.anInt9657 + 1];
			for (@Pc(21) int local21 = 1; local21 < super.anInt9656; local21++) {
				for (@Pc(25) int local25 = 1; super.anInt9657 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray26[local21][local25] >> 1) + (this.aByteArrayArray26[local21][local25 - 1] >> 2) + (this.aByteArrayArray26[local21 + -1][local25] >> 2) + (this.aByteArrayArray26[local21 + 1][local25] >> 3) + (this.aByteArrayArray26[local21][local25 + 1] >> 3));
				}
			}
			@Pc(109) Class6_Sub2[] local109 = new Class6_Sub2[this.aClass212_35.method5105()];
			this.aClass212_35.method5100(local109);
			for (@Pc(117) int local117 = 0; local117 < local109.length; local117++) {
				local109[local117].method221(this.anInt8370);
			}
			@Pc(133) int local133 = 20;
			if (this.anIntArrayArrayArray20 != null) {
				local133 += 4;
			}
			if ((this.anInt8368 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(153) NativeHeapBuffer local153 = this.aClass121_Sub2_18.aNativeHeap6.a(this.anInt8370 * 4, false);
			@Pc(163) NativeHeapBuffer local163 = this.aClass121_Sub2_18.aNativeHeap6.a(this.anInt8370 * local133, false);
			@Pc(168) Stream local168 = new Stream(local163);
			@Pc(173) Stream local173 = new Stream(local153);
			@Pc(177) Class6_Sub2[] local177 = new Class6_Sub2[this.anInt8370];
			@Pc(184) int local184 = Static21.method292(this.anInt8370 / 4);
			if (local184 < 1) {
				local184 = 1;
			}
			@Pc(194) Class212 local194 = new Class212(local184);
			@Pc(198) Class6_Sub2[] local198 = new Class6_Sub2[this.anInt8369];
			@Pc(204) int local204;
			for (@Pc(200) int local200 = 0; local200 < super.anInt9656; local200++) {
				for (local204 = 0; super.anInt9657 > local204; local204++) {
					if (this.anIntArrayArrayArray24[local200][local204] != null) {
						@Pc(220) Class6_Sub2[] local220 = this.aClass6_Sub2ArrayArrayArray1[local200][local204];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray23[local200][local204];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray21[local200][local204];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray22[local200][local204];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray24[local200][local204];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local200][local204];
						if (local241 == null) {
							local241 = local248;
						}
						@Pc(276) int[] local276 = this.anIntArrayArrayArray20 == null ? null : this.anIntArrayArrayArray20[local200][local204];
						@Pc(283) float local283 = this.aFloatArrayArray13[local200][local204];
						@Pc(290) float local290 = this.aFloatArrayArray14[local200][local204];
						@Pc(297) float local297 = this.aFloatArrayArray12[local200][local204];
						@Pc(306) float local306 = this.aFloatArrayArray13[local200][local204 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray14[local200][local204 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray12[local200][local204 + 1];
						@Pc(335) float local335 = this.aFloatArrayArray13[local200 + 1][local204 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray14[local200 + 1][local204 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray12[local200 + 1][local204 + 1];
						@Pc(366) float local366 = this.aFloatArrayArray13[local200 + 1][local204];
						@Pc(375) float local375 = this.aFloatArrayArray14[local200 + 1][local204];
						@Pc(384) float local384 = this.aFloatArrayArray12[local200 + 1][local204];
						@Pc(392) int local392 = local19[local200][local204] & 0xFF;
						@Pc(402) int local402 = local19[local200][local204 + 1] & 0xFF;
						@Pc(414) int local414 = local19[local200 + 1][local204 + 1] & 0xFF;
						@Pc(424) int local424 = local19[local200 + 1][local204] & 0xFF;
						@Pc(426) int local426 = 0;
						@Pc(436) int local436;
						label357: for (@Pc(428) int local428 = 0; local428 < local248.length; local428++) {
							@Pc(434) Class6_Sub2 local434 = local220[local428];
							for (local436 = 0; local436 < local426; local436++) {
								if (local198[local436] == local434) {
									continue label357;
								}
							}
							local198[local426++] = local434;
						}
						@Pc(478) short[] local478 = this.aShortArrayArray13[super.anInt9656 * local204 + local200] = new short[local248.length];
						for (local436 = 0; local436 < local248.length; local436++) {
							@Pc(491) int local491 = (local200 << super.anInt9654) + local227[local436];
							@Pc(501) int local501 = (local204 << super.anInt9654) + local234[local436];
							@Pc(506) int local506 = local491 >> this.anInt8355;
							@Pc(511) int local511 = local501 >> this.anInt8355;
							@Pc(515) int local515 = local248[local436];
							@Pc(519) int local519 = local241[local436];
							@Pc(527) int local527 = local260 == null ? 0 : local260[local436];
							@Pc(545) long local545 = (long) local519 << 48 | (long) local515 << 32 | (long) (local506 << 16) | (long) local511;
							@Pc(549) int local549 = local227[local436];
							@Pc(553) int local553 = local234[local436];
							@Pc(555) byte local555 = 74;
							@Pc(557) int local557 = 0;
							@Pc(577) float local577;
							@Pc(579) float local579;
							@Pc(581) float local581;
							@Pc(652) float local652;
							@Pc(575) int local575;
							if (local549 == 0 && local553 == 0) {
								local575 = local555 - local392;
								local577 = local283;
								local581 = local297;
								local579 = local290;
							} else if (local549 == 0 && super.anInt9652 == local553) {
								local575 = local555 - local402;
								local577 = local306;
								local579 = local315;
								local581 = local324;
							} else if (super.anInt9652 == local549 && local553 == super.anInt9652) {
								local579 = local346;
								local577 = local335;
								local575 = local555 - local414;
								local581 = local357;
							} else if (local549 == super.anInt9652 && local553 == 0) {
								local577 = local366;
								local579 = local375;
								local581 = local384;
								local575 = local555 - local424;
							} else {
								@Pc(627) float local627 = (float) local549 / (float) super.anInt9652;
								@Pc(634) float local634 = (float) local553 / (float) super.anInt9652;
								@Pc(643) float local643 = (local366 - local283) * local627 + local283;
								local652 = local290 + local627 * (local375 - local290);
								@Pc(661) float local661 = (local384 - local297) * local627 + local297;
								@Pc(670) float local670 = local306 + local627 * (local335 - local306);
								@Pc(678) float local678 = local315 + (local346 - local315) * local627;
								local577 = local643 + local634 * (local670 - local643);
								@Pc(694) float local694 = local324 + (local357 - local324) * local627;
								local579 = local652 + (local678 - local652) * local634;
								local581 = local661 + (local694 - local661) * local634;
								@Pc(722) int local722 = ((local424 - local392) * local549 >> super.anInt9654) + local392;
								@Pc(734) int local734 = local402 + ((local414 - local402) * local549 >> super.anInt9654);
								local575 = local555 - ((local734 - local722) * local553 >> super.anInt9654) - local722;
							}
							@Pc(774) float local774 = 1.0F;
							if (local515 != -1) {
								@Pc(785) int local785 = local575 * (local515 & 0x7F) >> 7;
								if (local785 < 2) {
									local785 = 2;
								} else if (local785 > 126) {
									local785 = 126;
								}
								if ((this.anInt8368 & 0x7) == 0) {
									local774 = local579 * this.aClass121_Sub2_18.aFloatArray59[1] + local577 * this.aClass121_Sub2_18.aFloatArray59[0] + local581 * this.aClass121_Sub2_18.aFloatArray59[2];
									local774 = this.aClass121_Sub2_18.aFloat199 + local774 * (local774 > 0.0F ? this.aClass121_Sub2_18.aFloat185 : this.aClass121_Sub2_18.aFloat191);
								}
								local557 = Static101.anIntArray262[local785 | local515 & 0xFF80];
							}
							@Pc(857) Class6 local857 = null;
							if ((local491 & this.anInt8349 - 1) == 0 && (local501 & this.anInt8349 - 1) == 0) {
								local857 = local194.method5106(local545);
							}
							@Pc(893) int local893;
							@Pc(953) int local953;
							if (local857 == null) {
								if (local519 == local515) {
									local953 = local557;
								} else {
									@Pc(929) int local929 = (local519 & 0x7F) * local575 >> 7;
									if (local929 < 2) {
										local929 = 2;
									} else if (local929 > 126) {
										local929 = 126;
									}
									local953 = Static101.anIntArray262[local929 | local519 & 0xFF80];
									if ((this.anInt8368 & 0x7) == 0) {
										local652 = this.aClass121_Sub2_18.aFloatArray59[2] * local581 + local579 * this.aClass121_Sub2_18.aFloatArray59[1] + local577 * this.aClass121_Sub2_18.aFloatArray59[0];
										local652 = this.aClass121_Sub2_18.aFloat199 + (local774 > 0.0F ? this.aClass121_Sub2_18.aFloat185 : this.aClass121_Sub2_18.aFloat191) * local774;
										@Pc(1006) int local1006 = local953 >> 16 & 0xFF;
										@Pc(1012) int local1012 = local953 >> 8 & 0xFF;
										local1006 = (int) ((float) local1006 * local652);
										@Pc(1022) int local1022 = local953 & 0xFF;
										if (local1006 < 0) {
											local1006 = 0;
										} else if (local1006 > 255) {
											local1006 = 255;
										}
										local1012 = (int) ((float) local1012 * local652);
										if (local1012 < 0) {
											local1012 = 0;
										} else if (local1012 > 255) {
											local1012 = 255;
										}
										local1022 = (int) ((float) local1022 * local652);
										if (local1022 < 0) {
											local1022 = 0;
										} else if (local1022 > 255) {
											local1022 = 255;
										}
										local953 = local1012 << 8 | local1006 << 16 | local1022;
									}
								}
								if (Stream.a()) {
									local168.b((float) local491);
									local168.b((float) (this.sa(local491, local501) + local527));
									local168.b((float) local501);
									local168.b((float) local491);
									local168.b((float) local501);
									if (this.anIntArrayArrayArray20 != null) {
										local168.b((float) (local276 == null ? 0 : local276[local436] - 1));
									}
									if ((this.anInt8368 & 0x7) != 0) {
										local168.b(local577);
										local168.b(local579);
										local168.b(local581);
									}
								} else {
									local168.a((float) local491);
									local168.a((float) (local527 + this.sa(local491, local501)));
									local168.a((float) local501);
									local168.a((float) local491);
									local168.a((float) local501);
									if (this.anIntArrayArrayArray20 != null) {
										local168.a((float) (local276 == null ? 0 : local276[local436] - 1));
									}
									if ((this.anInt8368 & 0x7) != 0) {
										local168.a(local577);
										local168.a(local579);
										local168.a(local581);
									}
								}
								if (this.aClass121_Sub2_18.anInt8923 == 0) {
									local173.d(local953 | 0xFF000000);
								} else {
									local173.a(local953 | 0xFF000000);
								}
								local893 = this.anInt8346++;
								local478[local436] = (short) local893;
								if (local515 != -1) {
									local177[local893] = local220[local436];
								}
								local194.method5104(local545, new Class6_Sub26(local478[local436]));
							} else {
								local478[local436] = ((Class6_Sub26) local857).aShort73;
								local893 = local478[local436] & 0xFFFF;
								if (local515 != -1 && local177[local893].aLong249 > local220[local436].aLong249) {
									local177[local893] = local220[local436];
								}
							}
							for (local953 = 0; local953 < local426; local953++) {
								local198[local953].method218(local557, local774, local893, local575);
							}
							this.anInt8350++;
						}
					}
				}
			}
			for (local204 = 0; local204 < this.anInt8346; local204++) {
				@Pc(1307) Class6_Sub2 local1307 = local177[local204];
				if (local1307 != null) {
					local1307.method215(local204);
				}
			}
			@Pc(1324) int local1324;
			@Pc(1343) int local1343;
			for (@Pc(1320) int local1320 = 0; super.anInt9656 > local1320; local1320++) {
				for (local1324 = 0; local1324 < super.anInt9657; local1324++) {
					@Pc(1337) short[] local1337 = this.aShortArrayArray13[local1324 * super.anInt9656 + local1320];
					if (local1337 != null) {
						@Pc(1341) int local1341 = 0;
						local1343 = 0;
						while (local1343 < local1337.length) {
							@Pc(1352) int local1352 = local1337[local1343++] & 0xFFFF;
							@Pc(1359) int local1359 = local1337[local1343++] & 0xFFFF;
							@Pc(1366) int local1366 = local1337[local1343++] & 0xFFFF;
							@Pc(1370) Class6_Sub2 local1370 = local177[local1352];
							@Pc(1374) Class6_Sub2 local1374 = local177[local1359];
							@Pc(1378) Class6_Sub2 local1378 = local177[local1366];
							@Pc(1380) Class6_Sub2 local1380 = null;
							if (local1370 != null) {
								local1380 = local1370;
								local1370.method217(local1324, local1320, local1341);
							}
							if (local1374 != null) {
								local1374.method217(local1324, local1320, local1341);
								if (local1380 == null || local1380.aLong249 > local1374.aLong249) {
									local1380 = local1374;
								}
							}
							if (local1378 != null) {
								local1378.method217(local1324, local1320, local1341);
								if (local1380 == null || local1380.aLong249 > local1378.aLong249) {
									local1380 = local1378;
								}
							}
							if (local1380 != null) {
								if (local1370 != null) {
									local1380.method215(local1352);
								}
								if (local1374 != null) {
									local1380.method215(local1359);
								}
								if (local1378 != null) {
									local1380.method215(local1366);
								}
								local1380.method217(local1324, local1320, local1341);
							}
							local1341++;
						}
					}
				}
			}
			local168.c();
			local173.c();
			this.anInterface23_13 = this.aClass121_Sub2_18.method7201(false);
			this.anInterface23_13.method7570(local153, 4, this.anInt8346 * 4);
			this.anInterface23_12 = this.aClass121_Sub2_18.method7201(false);
			this.anInterface23_12.method7570(local163, local133, this.anInt8346 * local133);
			if ((this.anInt8368 & 0x7) == 0) {
				if (this.anIntArrayArrayArray20 == null) {
					this.aClass258_14 = this.aClass121_Sub2_18.method7285(new Class228[] { new Class228(new Class248[] { Static389.aClass248_1, Static389.aClass248_5 }), new Class228(Static389.aClass248_3) });
				} else {
					this.aClass258_14 = this.aClass121_Sub2_18.method7285(new Class228[] { new Class228(new Class248[] { Static389.aClass248_1, Static389.aClass248_5, Static389.aClass248_4 }), new Class228(Static389.aClass248_3) });
				}
			} else if (this.anIntArrayArrayArray20 == null) {
				this.aClass258_14 = this.aClass121_Sub2_18.method7285(new Class228[] { new Class228(new Class248[] { Static389.aClass248_1, Static389.aClass248_5, Static389.aClass248_2 }), new Class228(Static389.aClass248_3) });
			} else {
				this.aClass258_14 = this.aClass121_Sub2_18.method7285(new Class228[] { new Class228(new Class248[] { Static389.aClass248_1, Static389.aClass248_5, Static389.aClass248_4, Static389.aClass248_2 }), new Class228(Static389.aClass248_3) });
			}
			local1324 = 0;
			for (@Pc(1675) int local1675 = 0; local1675 < local109.length; local1675++) {
				if (local109[local1675].anInt250 > 0) {
					local109[local1324++] = local109[local1675];
				}
			}
			this.aClass6_Sub2Array1 = new Class6_Sub2[local1324];
			@Pc(1705) long[] local1705 = new long[local1324];
			for (local1343 = 0; local1343 < local1324; local1343++) {
				@Pc(1713) Class6_Sub2 local1713 = local109[local1343];
				local1705[local1343] = local1713.aLong249;
				this.aClass6_Sub2Array1[local1343] = local1713;
				local1713.method214(this.anInt8346);
			}
			Static296.method7808(local1705, this.aClass6_Sub2Array1);
			if (this.aClass283_2 != null) {
				this.aClass283_2.method6443();
			}
		}
		this.anIntArrayArrayArray23 = this.anIntArrayArrayArray21 = null;
		this.aFloatArrayArray13 = this.aFloatArrayArray14 = this.aFloatArrayArray12 = null;
		this.aClass6_Sub2ArrayArrayArray1 = null;
		this.anIntArrayArrayArray22 = null;
		this.aByteArrayArray26 = null;
		this.anIntArrayArrayArray19 = null;
		this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray24 = null;
		this.aClass212_35 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ua", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9654;
		@Pc(13) int local13 = arg1 >> super.anInt9654;
		if (local8 < 0 || local13 < 0 || super.anInt9656 - 1 < local8 || super.anInt9657 - 1 < local13) {
			return 0;
		}
		@Pc(41) int local41 = super.anInt9652 - 1 & arg0;
		@Pc(48) int local48 = super.anInt9652 - 1 & arg1;
		@Pc(76) int local76 = (super.anInt9652 - local41) * this.anIntArrayArray82[local8][local13] + local41 * this.anIntArrayArray82[local8 + 1][local13] >> super.anInt9654;
		@Pc(107) int local107 = this.anIntArrayArray82[local8][local13 + 1] * (super.anInt9652 - local41) + this.anIntArrayArray82[local8 + 1][local13 + 1] * local41 >> super.anInt9654;
		return local76 * (super.anInt9652 - local48) + local107 * local48 >> super.anInt9654;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method7890(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass283_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass121_Sub2_18.anInt8911 * arg2 >> 8) >> this.aClass121_Sub2_18.anInt8912;
			@Pc(39) int local39 = arg3 - (this.aClass121_Sub2_18.anInt8921 * arg2 >> 8) >> this.aClass121_Sub2_18.anInt8912;
			return this.aClass283_2.method6438(arg0, local39, local25);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!mn;)V")
	private void method6921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub1_Sub12_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray23[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray21[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static320.anIntArray466.length) {
			Static320.anIntArray466 = new int[local22];
			Static407.anIntArray569 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static320.anIntArray466[local38] = local12[local38] >> this.aClass121_Sub2_18.anInt8912;
			Static407.anIntArray569[local38] = local19[local38] >> this.aClass121_Sub2_18.anInt8912;
		}
		@Pc(70) int local70 = 0;
		while (local22 > local70) {
			@Pc(76) int local76 = Static320.anIntArray466[local70];
			@Pc(81) int local81 = Static407.anIntArray569[local70++];
			@Pc(85) int local85 = Static320.anIntArray466[local70];
			@Pc(90) int local90 = Static407.anIntArray569[local70++];
			@Pc(94) int local94 = Static320.anIntArray466[local70];
			@Pc(99) int local99 = Static407.anIntArray569[local70++];
			if ((local90 - local99) * (local76 - local85) - (local94 - local85) * (local90 + -local81) > 0) {
				arg2.method4893(local90, local76, local85, local94, local99, local81);
			}
		}
	}
}
