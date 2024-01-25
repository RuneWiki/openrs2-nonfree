import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tla")
public final class Class313_Sub2 extends Class313 {

	@OriginalMember(owner = "client!tla", name = "K", descriptor = "I")
	private int anInt10031;

	@OriginalMember(owner = "client!tla", name = "F", descriptor = "I")
	private int anInt10032;

	@OriginalMember(owner = "client!tla", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!tla", name = "M", descriptor = "Lclient!kn;")
	public Class212 aClass212_23;

	@OriginalMember(owner = "client!tla", name = "B", descriptor = "I")
	private int anInt10048;

	@OriginalMember(owner = "client!tla", name = "R", descriptor = "Lclient!lq;")
	private Interface16 anInterface16_15;

	@OriginalMember(owner = "client!tla", name = "E", descriptor = "[Lclient!so;")
	private Class3_Sub47[] aClass3_Sub47Array1;

	@OriginalMember(owner = "client!tla", name = "ib", descriptor = "Lclient!lq;")
	private Interface16 anInterface16_16;

	@OriginalMember(owner = "client!tla", name = "eb", descriptor = "I")
	private int anInt10049;

	@OriginalMember(owner = "client!tla", name = "Z", descriptor = "F")
	private float aFloat187 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!tla", name = "D", descriptor = "F")
	private float aFloat188 = -3.4028235E38F;

	@OriginalMember(owner = "client!tla", name = "y", descriptor = "Lclient!tj;")
	private final Class357 aClass357_57 = new Class357();

	@OriginalMember(owner = "client!tla", name = "J", descriptor = "Lclient!nb;")
	public final Class67_Sub1 aClass67_Sub1_21;

	@OriginalMember(owner = "client!tla", name = "U", descriptor = "I")
	private final int anInt10044;

	@OriginalMember(owner = "client!tla", name = "G", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!tla", name = "Q", descriptor = "[[B")
	private final byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!tla", name = "q", descriptor = "I")
	private final int anInt10043;

	@OriginalMember(owner = "client!tla", name = "W", descriptor = "[[[Lclient!so;")
	private Class3_Sub47[][][] aClass3_Sub47ArrayArrayArray1;

	@OriginalMember(owner = "client!tla", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!tla", name = "db", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!tla", name = "O", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!tla", name = "fb", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!tla", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!tla", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!tla", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!tla", name = "V", descriptor = "I")
	public final int anInt10037;

	@OriginalMember(owner = "client!tla", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!tla", name = "ab", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!tla", name = "gb", descriptor = "Lclient!gn;")
	private Class136 aClass136_45;

	@OriginalMember(owner = "client!tla", name = "X", descriptor = "Lclient!jv;")
	private Class196 aClass196_2;

	@OriginalMember(owner = "client!tla", name = "<init>", descriptor = "(Lclient!nb;IIII[[I[[II)V")
	public Class313_Sub2(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass67_Sub1_21 = arg0;
		this.anInt10044 = super.anInt10873 - 2;
		this.aShortArrayArray5 = new short[arg4 * arg3][];
		this.aByteArrayArray22 = new byte[arg3][arg4];
		this.anInt10043 = 0x1 << this.anInt10044;
		this.aClass3_Sub47ArrayArrayArray1 = new Class3_Sub47[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray17 = new float[super.anInt10875 + 1][super.anInt10872 + 1];
		this.aByteArrayArray23 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray16 = new float[super.anInt10875 + 1][super.anInt10872 + 1];
		this.anInt10037 = arg2;
		this.aFloatArrayArray15 = new float[super.anInt10875 + 1][super.anInt10872 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt10872 >= local121; local121++) {
			for (@Pc(127) int local127 = 0; super.anInt10875 >= local127; local127++) {
				@Pc(136) int local136 = super.anIntArrayArray60[local127][local121];
				if ((float) local136 > this.aFloat188) {
					this.aFloat188 = (float) local136;
				}
				if (this.aFloat187 > (float) local136) {
					this.aFloat187 = (float) local136;
				}
				if (local127 > 0 && local121 > 0 && super.anInt10875 > local127 && local121 < super.anInt10872) {
					@Pc(201) int local201 = arg6[local127 + 1][local121] - arg6[local127 - 1][local121];
					@Pc(218) int local218 = arg6[local127][local121 + 1] - arg6[local127][local121 - 1];
					@Pc(237) float local237 = (float) (1.0D / Math.sqrt((double) (local218 * local218 + arg7 * 4 * arg7 + local201 * local201)));
					this.aFloatArrayArray17[local127][local121] = local237 * (float) local201;
					this.aFloatArrayArray16[local127][local121] = (float) (-arg7 * 2) * local237;
					this.aFloatArrayArray15[local127][local121] = local237 * (float) local218;
				}
			}
		}
		this.aFloat187--;
		this.aFloat188++;
		this.aClass136_45 = new Class136(128);
		if ((this.anInt10037 & 0x10) != 0) {
			this.aClass196_2 = new Class196(this.aClass67_Sub1_21, this);
		}
	}

	@OriginalMember(owner = "client!tla", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray23[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!tla", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass196_2 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass67_Sub1_21.anInt6679 >> 8) >> this.aClass67_Sub1_21.anInt6658;
			@Pc(42) int local42 = arg3 - (this.aClass67_Sub1_21.anInt6655 * arg2 >> 8) >> this.aClass67_Sub1_21.anInt6658;
			this.aClass196_2.method4779(local42, local27, arg0);
		}
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(II)V")
	@Override
	public void method9090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tla", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub4_Sub13 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub13 arg2) {
		if ((this.aByteArrayArray22[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(22) int local22 = super.anInt10871 >> this.aClass67_Sub1_21.anInt6658;
		@Pc(25) Class3_Sub4_Sub13_Sub1 local25 = (Class3_Sub4_Sub13_Sub1) arg2;
		@Pc(43) Class3_Sub4_Sub13_Sub1 local43;
		if (local25 != null && local25.method5891(local22, local22)) {
			local43 = local25;
			local25.method5889();
		} else {
			local43 = new Class3_Sub4_Sub13_Sub1(this.aClass67_Sub1_21, local22, local22);
		}
		local43.method5887(local22, local22, 0, 0);
		this.method8436(arg1, local43, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(Lclient!vj;[I)V")
	@Override
	public void method9097(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass357_57.method8401(new Class3_Sub6(this.aClass67_Sub1_21, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method9088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(48) int[] local48 = arg3 == null ? null : new int[local8 * 3];
		@Pc(58) int[] local58 = arg5 == null ? null : new int[local8 * 3];
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < local8; local62++) {
			@Pc(68) int local68 = arg6[local62];
			@Pc(72) int local72 = arg7[local62];
			@Pc(76) int local76 = arg8[local62];
			local13[local60] = arg2[local68];
			local18[local60] = arg4[local68];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local68];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local68];
			}
			local60++;
			local13[local60] = arg2[local72];
			local18[local60] = arg4[local72];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local72];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local72];
			}
			local60++;
			local13[local60] = arg2[local76];
			local18[local60] = arg4[local76];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local76];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local76];
			}
			local60++;
		}
		this.U(arg0, arg1, local13, local48, local18, local58, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(II[[ZBIIZI)V")
	private void method8435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub47Array1 == null) {
			return;
		}
		@Pc(23) int local23 = arg3 + arg3 + 1;
		@Pc(27) int local27 = local23 * local23;
		if (Static300.anIntArray307.length < local27) {
			Static300.anIntArray307 = new int[local27];
		}
		@Pc(40) int local40 = arg1 - arg3;
		@Pc(42) int local42 = local40;
		if (local40 < 0) {
			local40 = 0;
		}
		@Pc(53) int local53 = arg4 - arg3;
		@Pc(55) int local55 = local53;
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(67) int local67 = arg1 + arg3;
		if (local67 > super.anInt10875 - 1) {
			local67 = super.anInt10875 - 1;
		}
		@Pc(86) int local86 = arg4 + arg3;
		Static124.anInt2382 = 0;
		if (super.anInt10872 - 1 < local86) {
			local86 = super.anInt10872 - 1;
		}
		for (@Pc(105) int local105 = local40; local105 <= local67; local105++) {
			@Pc(113) boolean[] local113 = arg2[local105 - local42];
			for (@Pc(115) int local115 = local53; local115 <= local86; local115++) {
				if (local113[local115 - local55]) {
					Static300.anIntArray307[Static124.anInt2382++] = local105 + local115 * super.anInt10875;
				}
			}
		}
		if (arg6 == -1) {
			this.aClass67_Sub1_21.method5577();
		} else {
			this.aClass67_Sub1_21.method5615((float) arg6);
			this.aClass67_Sub1_21.method5653();
		}
		this.aClass67_Sub1_21.method5650();
		this.aClass67_Sub1_21.method5592((this.anInt10037 & 0x7) != 0);
		this.aClass67_Sub1_21.method5575(false, false, -1);
		this.aClass67_Sub1_21.method5620(this.anInterface16_16, 0);
		for (@Pc(222) int local222 = 0; local222 < this.aClass3_Sub47Array1.length; local222++) {
			this.aClass3_Sub47Array1[local222].method8145(Static124.anInt2382, Static300.anIntArray307);
		}
		@Pc(249) Class181_Sub1 local249 = this.aClass67_Sub1_21.method5586();
		local249.method6356(0, -1, 0);
		this.aClass67_Sub1_21.method5639();
		if (!this.aClass357_57.method8404()) {
			@Pc(269) int local269 = this.aClass67_Sub1_21.anInt6669;
			@Pc(273) int local273 = this.aClass67_Sub1_21.anInt6676;
			this.aClass67_Sub1_21.L(0, local273, this.aClass67_Sub1_21.anInt6681);
			this.aClass67_Sub1_21.method5592(false);
			this.aClass67_Sub1_21.method5652(false);
			this.aClass67_Sub1_21.method5617(128);
			this.aClass67_Sub1_21.method5575(false, false, -2);
			this.aClass67_Sub1_21.method5612(this.aClass67_Sub1_21.anInterface12_3);
			this.aClass67_Sub1_21.method5686(Static496.aClass37_2, Static573.aClass37_3);
			this.aClass67_Sub1_21.method5590(0, Static472.aClass58_3);
			this.aClass67_Sub1_21.method5674(0, Static653.aClass58_4);
			for (@Pc(333) Class3 local333 = this.aClass357_57.method8391(); local333 != null; local333 = this.aClass357_57.method8392()) {
				@Pc(338) Class3_Sub6 local338 = (Class3_Sub6) local333;
				local338.method166(arg4, arg3, arg2, arg1);
			}
			this.aClass67_Sub1_21.method5590(0, Static143.aClass58_1);
			this.aClass67_Sub1_21.method5674(0, Static143.aClass58_1);
			this.aClass67_Sub1_21.method5612((Interface12) null);
			this.aClass67_Sub1_21.L(local269, local273, this.aClass67_Sub1_21.anInt6681);
		}
		if (this.aClass196_2 != null) {
			this.aClass67_Sub1_21.method5620(this.anInterface16_16, 0);
			this.aClass67_Sub1_21.method5620(this.anInterface16_15, 1);
			this.aClass67_Sub1_21.method5569(this.aClass212_23);
			this.aClass196_2.method4778(arg2, arg5, arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method9089(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt10048 <= 0) {
			return;
		}
		@Pc(17) Interface5 local17 = this.aClass67_Sub1_21.method5571(this.anInt10031);
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 32767;
		@Pc(23) int local23 = -32768;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			local19 = 0;
			@Pc(36) Buffer local36 = local17.method9252();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass67_Sub1_21.method5616(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(79) short[] local79;
				@Pc(83) int local83;
				@Pc(91) int local91;
				if (Stream.b()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = super.anInt10875 * local48 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local79 = this.aShortArrayArray5[local57];
								if (local79 != null) {
									for (local83 = 0; local83 < local79.length; local83++) {
										local91 = local79[local83] & 0xFFFF;
										if (local21 > local91) {
											local21 = local91;
										}
										if (local91 > local23) {
											local23 = local91;
										}
										local44.b(local91);
										local19++;
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = local48 * super.anInt10875 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local79 = this.aShortArrayArray5[local57];
								if (local79 != null) {
									for (local83 = 0; local83 < local79.length; local83++) {
										local91 = local79[local83] & 0xFFFF;
										local19++;
										if (local91 > local23) {
											local23 = local91;
										}
										if (local21 > local91) {
											local21 = local91;
										}
										local44.d(local91);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.a();
				if (local17.method9250()) {
					break;
				}
			}
		}
		if (local19 <= 0) {
			return;
		}
		this.aClass67_Sub1_21.method5558();
		this.aClass67_Sub1_21.method5572(false);
		this.aClass67_Sub1_21.method5592(false);
		this.aClass67_Sub1_21.method5591(false);
		this.aClass67_Sub1_21.method5652(false);
		this.aClass67_Sub1_21.method5617(0);
		this.aClass67_Sub1_21.method5575(false, false, -2);
		this.aClass67_Sub1_21.method5612((Interface12) null);
		@Pc(308) Class181_Sub1 local308 = this.aClass67_Sub1_21.method5586();
		@Pc(313) float[] local313 = this.aClass67_Sub1_21.method5604();
		local313[5] = (float) 1024 / ((float) super.anInt10871 * 128.0F * (float) this.aClass67_Sub1_21.anInt6626);
		local313[9] = 0.0F;
		local313[0] = (float) 1024 / ((float) super.anInt10871 * 128.0F * (float) this.aClass67_Sub1_21.anInt6608);
		local313[7] = 0.0F;
		local313[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass67_Sub1_21.anInt6626;
		local313[10] = 1.0F / (this.aFloat188 - this.aFloat187);
		local313[3] = 0.0F;
		local313[14] = -this.aFloat187 / (this.aFloat188 - this.aFloat187);
		local313[6] = 0.0F;
		local313[15] = 1.0F;
		local313[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass67_Sub1_21.anInt6608) - 1.0F;
		local313[8] = 0.0F;
		local313[2] = 0.0F;
		local313[1] = 0.0F;
		local313[11] = 0.0F;
		local313[4] = 0.0F;
		local308.method4914(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		this.aClass67_Sub1_21.method5662();
		this.aClass67_Sub1_21.method5639();
		if ((this.anInt10037 & 0x7) == 0) {
			this.aClass67_Sub1_21.method5592(false);
		} else {
			this.aClass67_Sub1_21.method5592(true);
			this.aClass67_Sub1_21.method5611();
		}
		this.aClass67_Sub1_21.method5667(false);
		this.aClass67_Sub1_21.method5620(this.anInterface16_16, 0);
		this.aClass67_Sub1_21.method5620(this.anInterface16_15, 1);
		this.aClass67_Sub1_21.method5569(this.aClass212_23);
		this.aClass67_Sub1_21.method5659(local17, 0, local23 + 1 - local21, local19 / 3, local21, Static508.aClass281_7);
		this.aClass67_Sub1_21.method5667(true);
	}

	@OriginalMember(owner = "client!tla", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass196_2 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass67_Sub1_21.anInt6679 >> 8) >> this.aClass67_Sub1_21.anInt6658;
			@Pc(42) int local42 = arg3 - (this.aClass67_Sub1_21.anInt6655 * arg2 >> 8) >> this.aClass67_Sub1_21.anInt6658;
			this.aClass196_2.method4783(local27, local42, arg0);
		}
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(BILclient!mfa;I)V")
	private void method8436(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4_Sub13_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int[] local20 = this.anIntArrayArrayArray14[arg2][arg0];
		@Pc(27) int[] local27 = this.anIntArrayArrayArray12[arg2][arg0];
		@Pc(30) int local30 = local20.length;
		if (Static48.anIntArray56.length < local30) {
			Static48.anIntArray56 = new int[local30];
			Static526.anIntArray482 = new int[local30];
		}
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			Static48.anIntArray56[local44] = local20[local44] >> this.aClass67_Sub1_21.anInt6658;
			Static526.anIntArray482[local44] = local27[local44] >> this.aClass67_Sub1_21.anInt6658;
		}
		@Pc(78) int local78 = 0;
		while (local78 < local30) {
			@Pc(86) int local86 = Static48.anIntArray56[local78];
			@Pc(91) int local91 = Static526.anIntArray482[local78++];
			@Pc(95) int local95 = Static48.anIntArray56[local78];
			@Pc(100) int local100 = Static526.anIntArray482[local78++];
			@Pc(104) int local104 = Static48.anIntArray56[local78];
			@Pc(109) int local109 = Static526.anIntArray482[local78++];
			if (-((local100 - local91) * (-local95 + local104)) + (local86 - local95) * (local100 + -local109) > 0) {
				arg1.method5885(local95, local109, local100, local104, local91, local86);
			}
		}
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method9092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8435(arg6, arg0, arg3, arg2, arg1, arg4, arg5);
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method9087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method8435(arg5, arg0, arg3, arg2, arg1, arg4, -1);
	}

	@OriginalMember(owner = "client!tla", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray13 == null) {
			this.anIntArrayArrayArray13 = new int[super.anInt10875][super.anInt10872][];
		}
		@Pc(25) Interface2 local25 = this.aClass67_Sub1_21.anInterface2_11;
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt10875][super.anInt10872][];
		}
		this.anIntArrayArrayArray14[arg0][arg1] = arg2;
		this.anIntArrayArrayArray12[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg6;
		this.anIntArrayArrayArray11[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray13 != null) {
			this.anIntArrayArrayArray13[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(104) Class3_Sub47[] local104 = this.aClass3_Sub47ArrayArrayArray1[arg0][arg1] = new Class3_Sub47[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt10037 & 0x20) != 0 && local114 != -1 && local25.method1027(local114).aBoolean67) {
				local118 = 128;
				local114 = -1;
			}
			@Pc(164) long local164 = (long) (local118 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) local114;
			@Pc(170) Class3 local170;
			for (local170 = this.aClass136_45.method3503(local164); local170 != null; local170 = this.aClass136_45.method3510()) {
				@Pc(177) Class3_Sub47 local177 = (Class3_Sub47) local170;
				if (local177.anInt9656 == local114 && (float) local118 == local177.aFloat182 && arg10 == local177.anInt9658 && arg11 == local177.anInt9650 && arg12 == local177.anInt9657) {
					break;
				}
			}
			if (local170 == null) {
				local104[local106] = new Class3_Sub47(this, local114, local118, arg10, arg11, arg12);
				this.aClass136_45.method3508(local164, local104[local106]);
			} else {
				local104[local106] = (Class3_Sub47) local170;
			}
		}
		if (arg13) {
			this.aByteArrayArray22[arg0][arg1] = (byte) (this.aByteArrayArray22[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt10049) {
			this.anInt10049 = arg6.length;
		}
		this.anInt10048 += arg6.length;
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method9094(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass196_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (this.aClass67_Sub1_21.anInt6679 * arg2 >> 8) >> this.aClass67_Sub1_21.anInt6658;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass67_Sub1_21.anInt6655 >> 8) >> this.aClass67_Sub1_21.anInt6658;
			return this.aClass196_2.method4776(arg0, local42, local28);
		}
	}

	@OriginalMember(owner = "client!tla", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt10048 <= 0) {
			this.aClass196_2 = null;
		} else {
			@Pc(24) byte[][] local24 = new byte[super.anInt10875 + 1][super.anInt10872 + 1];
			for (@Pc(26) int local26 = 1; super.anInt10875 > local26; local26++) {
				for (@Pc(32) int local32 = 1; super.anInt10872 > local32; local32++) {
					local24[local26][local32] = (byte) ((this.aByteArrayArray23[local26][local32] >> 1) + (this.aByteArrayArray23[local26][local32 - 1] >> 2) + (this.aByteArrayArray23[local26 + 1][local32] >> 3) + (this.aByteArrayArray23[local26 + -1][local32] >> 2) + (this.aByteArrayArray23[local26][local32 + 1] >> 3));
				}
			}
			@Pc(122) Class3_Sub47[] local122 = new Class3_Sub47[this.aClass136_45.method3504()];
			this.aClass136_45.method3502(local122);
			for (@Pc(132) int local132 = 0; local132 < local122.length; local132++) {
				local122[local132].method8149(this.anInt10048);
			}
			@Pc(154) int local154 = 20;
			if (this.anIntArrayArrayArray13 != null) {
				local154 += 4;
			}
			if ((this.anInt10037 & 0x7) != 0) {
				local154 += 12;
			}
			@Pc(183) NativeHeapBuffer local183 = this.aClass67_Sub1_21.aNativeHeap5.a(this.anInt10048 * 4, false);
			@Pc(193) NativeHeapBuffer local193 = this.aClass67_Sub1_21.aNativeHeap5.a(this.anInt10048 * local154, false);
			@Pc(198) Stream local198 = new Stream(local193);
			@Pc(203) Stream local203 = new Stream(local183);
			@Pc(207) Class3_Sub47[] local207 = new Class3_Sub47[this.anInt10048];
			@Pc(214) int local214 = Static487.method7093(this.anInt10048 / 4);
			if (local214 < 1) {
				local214 = 1;
			}
			@Pc(224) Class136 local224 = new Class136(local214);
			@Pc(228) Class3_Sub47[] local228 = new Class3_Sub47[this.anInt10049];
			@Pc(234) int local234;
			for (@Pc(230) int local230 = 0; local230 < super.anInt10875; local230++) {
				for (local234 = 0; super.anInt10872 > local234; local234++) {
					if (this.anIntArrayArrayArray9[local230][local234] != null) {
						@Pc(252) Class3_Sub47[] local252 = this.aClass3_Sub47ArrayArrayArray1[local230][local234];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray14[local230][local234];
						@Pc(266) int[] local266 = this.anIntArrayArrayArray12[local230][local234];
						@Pc(273) int[] local273 = this.anIntArrayArrayArray11[local230][local234];
						@Pc(280) int[] local280 = this.anIntArrayArrayArray9[local230][local234];
						@Pc(293) int[] local293 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local230][local234];
						@Pc(306) int[] local306 = this.anIntArrayArrayArray13 == null ? null : this.anIntArrayArrayArray13[local230][local234];
						if (local273 == null) {
							local273 = local280;
						}
						@Pc(317) float local317 = this.aFloatArrayArray17[local230][local234];
						@Pc(324) float local324 = this.aFloatArrayArray16[local230][local234];
						@Pc(331) float local331 = this.aFloatArrayArray15[local230][local234];
						@Pc(340) float local340 = this.aFloatArrayArray17[local230][local234 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray16[local230][local234 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray15[local230][local234 + 1];
						@Pc(369) float local369 = this.aFloatArrayArray17[local230 + 1][local234 + 1];
						@Pc(380) float local380 = this.aFloatArrayArray16[local230 + 1][local234 + 1];
						@Pc(391) float local391 = this.aFloatArrayArray15[local230 + 1][local234 + 1];
						@Pc(400) float local400 = this.aFloatArrayArray17[local230 + 1][local234];
						@Pc(409) float local409 = this.aFloatArrayArray16[local230 + 1][local234];
						@Pc(418) float local418 = this.aFloatArrayArray15[local230 + 1][local234];
						@Pc(426) int local426 = local24[local230][local234] & 0xFF;
						@Pc(436) int local436 = local24[local230][local234 + 1] & 0xFF;
						@Pc(448) int local448 = local24[local230 + 1][local234 + 1] & 0xFF;
						@Pc(458) int local458 = local24[local230 + 1][local234] & 0xFF;
						@Pc(460) int local460 = 0;
						@Pc(470) int local470;
						label357: for (@Pc(462) int local462 = 0; local462 < local280.length; local462++) {
							@Pc(468) Class3_Sub47 local468 = local252[local462];
							for (local470 = 0; local470 < local460; local470++) {
								if (local228[local470] == local468) {
									continue label357;
								}
							}
							local228[local460++] = local468;
						}
						@Pc(517) short[] local517 = this.aShortArrayArray5[local234 * super.anInt10875 + local230] = new short[local280.length];
						for (local470 = 0; local470 < local280.length; local470++) {
							@Pc(530) int local530 = (local230 << super.anInt10873) + local259[local470];
							@Pc(540) int local540 = (local234 << super.anInt10873) + local266[local470];
							@Pc(545) int local545 = local530 >> this.anInt10044;
							@Pc(550) int local550 = local540 >> this.anInt10044;
							@Pc(554) int local554 = local280[local470];
							@Pc(558) int local558 = local273[local470];
							@Pc(567) int local567 = local293 == null ? 0 : local293[local470];
							@Pc(585) long local585 = (long) local554 << 32 | (long) local558 << 48 | (long) (local545 << 16) | (long) local550;
							@Pc(589) int local589 = local259[local470];
							@Pc(593) int local593 = local266[local470];
							@Pc(595) byte local595 = 74;
							@Pc(597) int local597 = 0;
							@Pc(599) float local599 = 1.0F;
							@Pc(614) float local614;
							@Pc(618) float local618;
							@Pc(616) float local616;
							@Pc(701) float local701;
							@Pc(612) int local612;
							if (local589 == 0 && local593 == 0) {
								local612 = local595 - local426;
								local614 = local317;
								local616 = local331;
								local618 = local324;
							} else if (local589 == 0 && super.anInt10871 == local593) {
								local614 = local340;
								local618 = local349;
								local612 = local595 - local436;
								local616 = local358;
							} else if (super.anInt10871 == local589 && super.anInt10871 == local593) {
								local612 = local595 - local448;
								local616 = local391;
								local618 = local380;
								local614 = local369;
							} else if (local589 == super.anInt10871 && local593 == 0) {
								local616 = local418;
								local614 = local400;
								local612 = local595 - local458;
								local618 = local409;
							} else {
								@Pc(677) float local677 = (float) local589 / (float) super.anInt10871;
								@Pc(684) float local684 = (float) local593 / (float) super.anInt10871;
								@Pc(692) float local692 = local317 + (local400 - local317) * local677;
								local701 = local324 + (local409 - local324) * local677;
								@Pc(709) float local709 = local331 + (local418 - local331) * local677;
								@Pc(718) float local718 = local340 + (local369 - local340) * local677;
								@Pc(727) float local727 = (local380 - local349) * local677 + local349;
								local618 = local701 + (local727 - local701) * local684;
								local614 = local692 + local684 * (local718 - local692);
								@Pc(754) float local754 = local358 + local677 * (local391 - local358);
								local616 = local684 * (local754 - local709) + local709;
								@Pc(774) int local774 = local426 + (local589 * (local458 - local426) >> super.anInt10873);
								@Pc(785) int local785 = ((local448 - local436) * local589 >> super.anInt10873) + local436;
								local612 = local595 - (local593 * (local785 - local774) >> super.anInt10873) - local774;
							}
							if (local554 != -1) {
								@Pc(834) int local834 = local612 * (local554 & 0x7F) >> 7;
								if (local834 < 2) {
									local834 = 2;
								} else if (local834 > 126) {
									local834 = 126;
								}
								if ((this.anInt10037 & 0x7) == 0) {
									local599 = local616 * this.aClass67_Sub1_21.aFloatArray57[2] + local614 * this.aClass67_Sub1_21.aFloatArray57[0] + local618 * this.aClass67_Sub1_21.aFloatArray57[1];
									local599 = this.aClass67_Sub1_21.aFloat121 + (local599 > 0.0F ? this.aClass67_Sub1_21.aFloat122 : this.aClass67_Sub1_21.aFloat110) * local599;
								}
								local597 = Static305.anIntArray309[local554 & 0xFF80 | local834];
							}
							@Pc(909) Class3 local909 = null;
							if ((local530 & this.anInt10043 - 1) == 0 && (this.anInt10043 - 1 & local540) == 0) {
								local909 = local224.method3503(local585);
							}
							@Pc(1279) int local1279;
							@Pc(972) int local972;
							if (local909 == null) {
								if (local554 == local558) {
									local972 = local597;
								} else {
									@Pc(948) int local948 = (local558 & 0x7F) * local612 >> 7;
									if (local948 < 2) {
										local948 = 2;
									} else if (local948 > 126) {
										local948 = 126;
									}
									local972 = Static305.anIntArray309[local948 | local558 & 0xFF80];
									if ((this.anInt10037 & 0x7) == 0) {
										@Pc(1003) float local1003 = this.aClass67_Sub1_21.aFloatArray57[1] * local618 + this.aClass67_Sub1_21.aFloatArray57[0] * local614 + this.aClass67_Sub1_21.aFloatArray57[2] * local616;
										local701 = this.aClass67_Sub1_21.aFloat121 + local599 * (local599 > 0.0F ? this.aClass67_Sub1_21.aFloat122 : this.aClass67_Sub1_21.aFloat110);
										@Pc(1029) int local1029 = local972 >> 16 & 0xFF;
										@Pc(1035) int local1035 = local972 >> 8 & 0xFF;
										local1029 = (int) ((float) local1029 * local701);
										@Pc(1045) int local1045 = local972 & 0xFF;
										if (local1029 < 0) {
											local1029 = 0;
										} else if (local1029 > 255) {
											local1029 = 255;
										}
										local1035 = (int) ((float) local1035 * local701);
										if (local1035 < 0) {
											local1035 = 0;
										} else if (local1035 > 255) {
											local1035 = 255;
										}
										local1045 = (int) ((float) local1045 * local701);
										if (local1045 < 0) {
											local1045 = 0;
										} else if (local1045 > 255) {
											local1045 = 255;
										}
										local972 = local1045 | local1029 << 16 | local1035 << 8;
									}
								}
								if (Stream.b()) {
									local198.a((float) local530);
									local198.a((float) (this.method9096(local530, local540) + local567));
									local198.a((float) local540);
									local198.a((float) local530);
									local198.a((float) local540);
									if (this.anIntArrayArrayArray13 != null) {
										local198.a((float) (local306 == null ? 0 : local306[local470] - 1));
									}
									if ((this.anInt10037 & 0x7) != 0) {
										local198.a(local614);
										local198.a(local618);
										local198.a(local616);
									}
								} else {
									local198.b((float) local530);
									local198.b((float) (this.method9096(local530, local540) + local567));
									local198.b((float) local540);
									local198.b((float) local530);
									local198.b((float) local540);
									if (this.anIntArrayArrayArray13 != null) {
										local198.b((float) (local306 == null ? 0 : local306[local470] - 1));
									}
									if ((this.anInt10037 & 0x7) != 0) {
										local198.b(local614);
										local198.b(local618);
										local198.b(local616);
									}
								}
								if (this.aClass67_Sub1_21.anInt6670 == 0) {
									local203.c(local972 | 0xFF000000);
								} else {
									local203.a(local972 | 0xFF000000);
								}
								local1279 = this.anInt10032++;
								local517[local470] = (short) local1279;
								if (local554 != -1) {
									local207[local1279] = local252[local470];
								}
								local224.method3508(local585, new Class3_Sub40(local517[local470]));
							} else {
								local517[local470] = ((Class3_Sub40) local909).aShort116;
								local1279 = local517[local470] & 0xFFFF;
								if (local554 != -1 && local207[local1279].aLong382 > local252[local470].aLong382) {
									local207[local1279] = local252[local470];
								}
							}
							for (local972 = 0; local972 < local460; local972++) {
								local228[local972].method8150(local597, local599, local1279, local612);
							}
							this.anInt10031++;
						}
					}
				}
			}
			for (local234 = 0; local234 < this.anInt10032; local234++) {
				@Pc(1413) Class3_Sub47 local1413 = local207[local234];
				if (local1413 != null) {
					local1413.method8148(local234);
				}
			}
			@Pc(1438) int local1438;
			@Pc(1456) int local1456;
			for (@Pc(1432) int local1432 = 0; super.anInt10875 > local1432; local1432++) {
				for (local1438 = 0; local1438 < super.anInt10872; local1438++) {
					@Pc(1450) short[] local1450 = this.aShortArrayArray5[super.anInt10875 * local1438 + local1432];
					if (local1450 != null) {
						@Pc(1454) int local1454 = 0;
						local1456 = 0;
						while (local1450.length > local1456) {
							@Pc(1465) int local1465 = local1450[local1456++] & 0xFFFF;
							@Pc(1472) int local1472 = local1450[local1456++] & 0xFFFF;
							@Pc(1479) int local1479 = local1450[local1456++] & 0xFFFF;
							@Pc(1483) Class3_Sub47 local1483 = local207[local1465];
							@Pc(1487) Class3_Sub47 local1487 = local207[local1472];
							@Pc(1491) Class3_Sub47 local1491 = local207[local1479];
							@Pc(1493) Class3_Sub47 local1493 = null;
							if (local1483 != null) {
								local1493 = local1483;
								local1483.method8144(local1432, local1454, local1438);
							}
							if (local1487 != null) {
								local1487.method8144(local1432, local1454, local1438);
								if (local1493 == null || local1487.aLong382 < local1493.aLong382) {
									local1493 = local1487;
								}
							}
							if (local1491 != null) {
								local1491.method8144(local1432, local1454, local1438);
								if (local1493 == null || local1491.aLong382 < local1493.aLong382) {
									local1493 = local1491;
								}
							}
							if (local1493 != null) {
								if (local1483 != null) {
									local1493.method8148(local1465);
								}
								if (local1487 != null) {
									local1493.method8148(local1472);
								}
								if (local1491 != null) {
									local1493.method8148(local1479);
								}
								local1493.method8144(local1432, local1454, local1438);
							}
							local1454++;
						}
					}
				}
			}
			local198.a();
			local203.a();
			this.anInterface16_15 = this.aClass67_Sub1_21.method5649(false);
			this.anInterface16_15.method7125(local183, 4, this.anInt10032 * 4);
			this.anInterface16_16 = this.aClass67_Sub1_21.method5649(false);
			this.anInterface16_16.method7125(local193, local154, this.anInt10032 * local154);
			if ((this.anInt10037 & 0x7) == 0) {
				if (this.anIntArrayArrayArray13 == null) {
					this.aClass212_23 = this.aClass67_Sub1_21.method5570(new Class147[] { new Class147(new Class134[] { Static219.aClass134_1, Static219.aClass134_5 }), new Class147(Static219.aClass134_3) });
				} else {
					this.aClass212_23 = this.aClass67_Sub1_21.method5570(new Class147[] { new Class147(new Class134[] { Static219.aClass134_1, Static219.aClass134_5, Static219.aClass134_4 }), new Class147(Static219.aClass134_3) });
				}
			} else if (this.anIntArrayArrayArray13 == null) {
				this.aClass212_23 = this.aClass67_Sub1_21.method5570(new Class147[] { new Class147(new Class134[] { Static219.aClass134_1, Static219.aClass134_5, Static219.aClass134_2 }), new Class147(Static219.aClass134_3) });
			} else {
				this.aClass212_23 = this.aClass67_Sub1_21.method5570(new Class147[] { new Class147(new Class134[] { Static219.aClass134_1, Static219.aClass134_5, Static219.aClass134_4, Static219.aClass134_2 }), new Class147(Static219.aClass134_3) });
			}
			local1438 = 0;
			for (@Pc(1836) int local1836 = 0; local1836 < local122.length; local1836++) {
				if (local122[local1836].anInt9655 > 0) {
					local122[local1438++] = local122[local1836];
				}
			}
			this.aClass3_Sub47Array1 = new Class3_Sub47[local1438];
			@Pc(1870) long[] local1870 = new long[local1438];
			for (local1456 = 0; local1456 < local1438; local1456++) {
				@Pc(1880) Class3_Sub47 local1880 = local122[local1456];
				local1870[local1456] = local1880.aLong382;
				this.aClass3_Sub47Array1[local1456] = local1880;
				local1880.method8146(this.anInt10032);
			}
			Static630.method4805(local1870, this.aClass3_Sub47Array1);
			if (this.aClass196_2 != null) {
				this.aClass196_2.method4774();
			}
		}
		this.anIntArrayArrayArray11 = null;
		this.aClass136_45 = null;
		this.aFloatArrayArray17 = this.aFloatArrayArray16 = this.aFloatArrayArray15 = null;
		this.anIntArrayArrayArray14 = this.anIntArrayArrayArray12 = null;
		this.aByteArrayArray23 = null;
		this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass3_Sub47ArrayArrayArray1 = null;
		this.anIntArrayArrayArray9 = null;
	}
}
