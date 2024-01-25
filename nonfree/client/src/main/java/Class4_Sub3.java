import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
	private int anInt10323;

	@OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
	private int anInt10331;

	@OriginalMember(owner = "client!wo", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!wo", name = "W", descriptor = "Lclient!vv;")
	public Class346 aClass346_13;

	@OriginalMember(owner = "client!wo", name = "ab", descriptor = "I")
	private int anInt10339;

	@OriginalMember(owner = "client!wo", name = "cb", descriptor = "Lclient!vv;")
	private Class346 aClass346_14;

	@OriginalMember(owner = "client!wo", name = "db", descriptor = "I")
	private int anInt10340;

	@OriginalMember(owner = "client!wo", name = "eb", descriptor = "Lclient!sj;")
	private Interface16 anInterface16_7;

	@OriginalMember(owner = "client!wo", name = "gb", descriptor = "[Lclient!ef;")
	private Class3_Sub13[] aClass3_Sub13Array1;

	@OriginalMember(owner = "client!wo", name = "ib", descriptor = "Lclient!vv;")
	public Class346 aClass346_15;

	@OriginalMember(owner = "client!wo", name = "jb", descriptor = "Lclient!vv;")
	public Class346 aClass346_16;

	@OriginalMember(owner = "client!wo", name = "Q", descriptor = "Lclient!ki;")
	private final Class183 aClass183_63 = new Class183();

	@OriginalMember(owner = "client!wo", name = "O", descriptor = "I")
	private final int anInt10333 = this.anInt10463 - 2;

	@OriginalMember(owner = "client!wo", name = "A", descriptor = "[[I")
	private final int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!wo", name = "J", descriptor = "Lclient!ji;")
	public final Class15_Sub3 aClass15_Sub3_44;

	@OriginalMember(owner = "client!wo", name = "G", descriptor = "[[[Lclient!ef;")
	private Class3_Sub13[][][] aClass3_Sub13ArrayArrayArray1;

	@OriginalMember(owner = "client!wo", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!wo", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
	public final int anInt10327;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!wo", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!wo", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!wo", name = "R", descriptor = "[[S")
	public final short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!wo", name = "hb", descriptor = "[[B")
	private byte[][] aByteArrayArray35;

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!wo", name = "U", descriptor = "I")
	private final int anInt10337;

	@OriginalMember(owner = "client!wo", name = "fb", descriptor = "Lclient!bc;")
	private Class25 aClass25_44;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "Lclient!tfa;")
	private Class309 aClass309_2;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!ji;IIII[[I[[II)V")
	public Class4_Sub3(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray87 = arg5;
		this.aClass15_Sub3_44 = arg0;
		this.aClass3_Sub13ArrayArrayArray1 = new Class3_Sub13[arg3][arg4][];
		this.aFloatArrayArray15 = new float[super.anInt10461 + 1][super.anInt10459 + 1];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aFloatArrayArray14 = new float[super.anInt10461 + 1][super.anInt10459 + 1];
		this.anInt10327 = arg2;
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aFloatArrayArray16 = new float[super.anInt10461 + 1][super.anInt10459 + 1];
		this.aByteArrayArray34 = new byte[arg3][arg4];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.aShortArrayArray13 = new short[arg4 * arg3][];
		this.aByteArrayArray35 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray21 = new int[arg3][arg4][];
		this.anInt10337 = 0x1 << this.anInt10333;
		for (@Pc(117) int local117 = 1; super.anInt10459 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt10461 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local139 * local139 + arg7 * 4 * arg7 + local156 * local156)));
				this.aFloatArrayArray14[local121][local117] = local177 * (float) local139;
				this.aFloatArrayArray16[local121][local117] = local177 * (float) (-arg7 * 2);
				this.aFloatArrayArray15[local121][local117] = local177 * (float) local156;
			}
		}
		this.aClass25_44 = new Class25(128);
		if ((this.anInt10327 & 0x10) != 0) {
			this.aClass309_2 = new Class309(this.aClass15_Sub3_44, this);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIZ[[ZI)V")
	private void method8336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		if (this.aClass3_Sub13Array1 == null) {
			return;
		}
		@Pc(18) int local18 = arg2 + arg2 + 1;
		@Pc(22) int local22 = local18 * local18;
		if (this.aClass15_Sub3_44.anIntArray317.length < local22) {
			this.aClass15_Sub3_44.anIntArray317 = new int[local22];
		}
		if (this.anInt10323 * 2 > this.aClass15_Sub3_44.aClass3_Sub7_Sub2_3.aByteArray86.length) {
			this.aClass15_Sub3_44.aClass3_Sub7_Sub2_3 = new Class3_Sub7_Sub2(this.anInt10323 * 2);
		}
		@Pc(58) int local58 = arg0 - arg2;
		@Pc(60) int local60 = local58;
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(68) int local68 = arg1 - arg2;
		@Pc(70) int local70 = local68;
		if (local68 < 0) {
			local68 = 0;
		}
		@Pc(81) int local81 = arg2 + arg0;
		if (local81 > super.anInt10461 - 1) {
			local81 = super.anInt10461 - 1;
		}
		@Pc(96) int local96 = arg2 + arg1;
		if (super.anInt10459 - 1 < local96) {
			local96 = super.anInt10459 - 1;
		}
		@Pc(109) int local109 = 0;
		@Pc(113) int[] local113 = this.aClass15_Sub3_44.anIntArray317;
		@Pc(125) int local125;
		for (@Pc(115) int local115 = local58; local115 <= local81; local115++) {
			@Pc(123) boolean[] local123 = arg4[local115 - local60];
			for (local125 = local68; local125 <= local96; local125++) {
				if (local123[local125 - local70]) {
					local113[local109++] = local115 + local125 * super.anInt10461;
				}
			}
		}
		this.aClass15_Sub3_44.method4423();
		this.aClass15_Sub3_44.method4414((this.anInt10327 & 0x7) != 0);
		for (@Pc(196) int local196 = 0; local196 < this.aClass3_Sub13Array1.length; local196++) {
			this.aClass3_Sub13Array1[local196].method2308(local109, local113);
		}
		if (!this.aClass183_63.method4798()) {
			local125 = this.aClass15_Sub3_44.anInt5371;
			@Pc(229) int local229 = this.aClass15_Sub3_44.anInt5352;
			this.aClass15_Sub3_44.X(0, local229, this.aClass15_Sub3_44.anInt5361);
			this.aClass15_Sub3_44.method4414(false);
			this.aClass15_Sub3_44.method4413(false);
			this.aClass15_Sub3_44.method4392(128);
			this.aClass15_Sub3_44.method4448(-2);
			this.aClass15_Sub3_44.method4377(this.aClass15_Sub3_44.aClass11_Sub2_3);
			this.aClass15_Sub3_44.method4451(7681, 8448);
			this.aClass15_Sub3_44.method4442(770, 34166, 0);
			this.aClass15_Sub3_44.method4378(0, 34167);
			for (@Pc(289) Class3 local289 = this.aClass183_63.method4795(); local289 != null; local289 = this.aClass183_63.method4793()) {
				@Pc(294) Class3_Sub20 local294 = (Class3_Sub20) local289;
				local294.method3691(arg1, arg0, arg4, arg2);
			}
			this.aClass15_Sub3_44.method4442(768, 5890, 0);
			this.aClass15_Sub3_44.method4378(0, 5890);
			this.aClass15_Sub3_44.method4377(null);
			this.aClass15_Sub3_44.X(local125, local229, this.aClass15_Sub3_44.anInt5361);
		}
		if (this.aClass309_2 != null) {
			this.aClass15_Sub3_44.method4409(null, this.aClass346_16, null, this.aClass346_13);
			this.aClass309_2.method7561(arg4, arg2, arg0, arg1, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class3_Sub4_Sub2 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub2 arg2) {
		if ((this.aByteArrayArray34[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt10458 >> this.aClass15_Sub3_44.anInt5327;
		@Pc(24) Class3_Sub4_Sub2_Sub1 local24 = (Class3_Sub4_Sub2_Sub1) arg2;
		@Pc(40) Class3_Sub4_Sub2_Sub1 local40;
		if (local24 != null && local24.method1056(local21, local21)) {
			local40 = local24;
			local24.method1060();
		} else {
			local40 = new Class3_Sub4_Sub2_Sub1(this.aClass15_Sub3_44, local21, local21);
		}
		local40.method1057(0, 0, local21, local21);
		this.method8337(arg0, arg1, local40);
		return local40;
	}

	@OriginalMember(owner = "client!wo", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray35[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray35[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wo", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray87[arg0][arg1];
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method8336(arg0, arg1, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!wo", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass309_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass15_Sub3_44.anInt5335 >> 8) >> this.aClass15_Sub3_44.anInt5327;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass15_Sub3_44.anInt5353 >> 8) >> this.aClass15_Sub3_44.anInt5327;
			this.aClass309_2.method7567(local38, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!wo", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt10463;
		@Pc(13) int local13 = arg1 >> super.anInt10463;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt10461 - 1 || super.anInt10459 - 1 < local13) {
			return 0;
		}
		@Pc(42) int local42 = super.anInt10458 - 1 & arg0;
		@Pc(49) int local49 = super.anInt10458 - 1 & arg1;
		@Pc(76) int local76 = this.anIntArrayArray87[local8][local13] * (super.anInt10458 - local42) + this.anIntArrayArray87[local8 + 1][local13] * local42 >> super.anInt10463;
		@Pc(107) int local107 = local42 * this.anIntArrayArray87[local8 + 1][local13 + 1] + (super.anInt10458 - local42) * this.anIntArrayArray87[local8][local13 - -1] >> super.anInt10463;
		return local107 * local49 + local76 * (super.anInt10458 - local49) >> super.anInt10463;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8446(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt10339 <= 0) {
			return;
		}
		this.aClass15_Sub3_44.method4396();
		this.aClass15_Sub3_44.method4382(false);
		this.aClass15_Sub3_44.method4414(false);
		this.aClass15_Sub3_44.method4428(false);
		this.aClass15_Sub3_44.method4413(false);
		this.aClass15_Sub3_44.method4392(0);
		this.aClass15_Sub3_44.method4448(-2);
		this.aClass15_Sub3_44.method4377(null);
		Static312.aFloatArray47[0] = (float) 1024 / ((float) this.aClass15_Sub3_44.anInt5270 * (float) super.anInt10458 * 128.0F);
		Static312.aFloatArray47[9] = 0.0F;
		Static312.aFloatArray47[2] = 0.0F;
		Static312.aFloatArray47[11] = 0.0F;
		Static312.aFloatArray47[1] = 0.0F;
		Static312.aFloatArray47[14] = 0.0F;
		Static312.aFloatArray47[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass15_Sub3_44.lb;
		Static312.aFloatArray47[7] = 0.0F;
		Static312.aFloatArray47[10] = 0.0F;
		Static312.aFloatArray47[6] = 0.0F;
		Static312.aFloatArray47[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass15_Sub3_44.anInt5270) - 1.0F;
		Static312.aFloatArray47[4] = 0.0F;
		Static312.aFloatArray47[15] = 1.0F;
		Static312.aFloatArray47[3] = 0.0F;
		Static312.aFloatArray47[8] = 0.0F;
		Static312.aFloatArray47[5] = (float) 1024 / ((float) super.anInt10458 * 128.0F * (float) this.aClass15_Sub3_44.lb);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static312.aFloatArray47, 0);
		Static312.aFloatArray47[10] = 0.0F;
		Static312.aFloatArray47[14] = 0.0F;
		Static312.aFloatArray47[15] = 1.0F;
		Static312.aFloatArray47[0] = 1.0F;
		Static312.aFloatArray47[2] = 0.0F;
		Static312.aFloatArray47[1] = 0.0F;
		Static312.aFloatArray47[11] = 0.0F;
		Static312.aFloatArray47[5] = 0.0F;
		Static312.aFloatArray47[9] = 1.0F;
		Static312.aFloatArray47[4] = 0.0F;
		Static312.aFloatArray47[6] = 1.0F;
		Static312.aFloatArray47[13] = 0.0F;
		Static312.aFloatArray47[12] = 0.0F;
		Static312.aFloatArray47[3] = 0.0F;
		Static312.aFloatArray47[8] = 0.0F;
		Static312.aFloatArray47[7] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static312.aFloatArray47, 0);
		if ((this.anInt10327 & 0x7) == 0) {
			this.aClass15_Sub3_44.method4414(false);
		} else {
			this.aClass15_Sub3_44.method4414(true);
			this.aClass15_Sub3_44.method4388();
		}
		this.aClass15_Sub3_44.method4409(this.aClass346_14, this.aClass346_16, this.aClass346_15, this.aClass346_13);
		if (this.aClass15_Sub3_44.aClass3_Sub7_Sub2_3.aByteArray86.length < this.anInt10323 * 2) {
			this.aClass15_Sub3_44.aClass3_Sub7_Sub2_3 = new Class3_Sub7_Sub2(this.anInt10323 * 2);
		} else {
			this.aClass15_Sub3_44.aClass3_Sub7_Sub2_3.anInt7869 = 0;
		}
		@Pc(312) int local312 = 0;
		@Pc(316) Class3_Sub7_Sub2 local316 = this.aClass15_Sub3_44.aClass3_Sub7_Sub2_3;
		@Pc(322) int local322;
		@Pc(331) int local331;
		@Pc(333) int local333;
		@Pc(352) short[] local352;
		@Pc(356) int local356;
		if (this.aClass15_Sub3_44.aBoolean442) {
			for (local322 = arg1; local322 < arg3; local322++) {
				local331 = super.anInt10461 * local322 + arg0;
				for (local333 = arg0; local333 < arg2; local333++) {
					if (arg4[local333 - arg0][local322 - arg1]) {
						local352 = this.aShortArrayArray13[local331];
						if (local352 != null) {
							for (local356 = 0; local356 < local352.length; local356++) {
								local312++;
								local316.method6528(local352[local356] & 0xFFFF);
							}
						}
					}
					local331++;
				}
			}
		} else {
			for (local322 = arg1; local322 < arg3; local322++) {
				local331 = local322 * super.anInt10461 + arg0;
				for (local333 = arg0; local333 < arg2; local333++) {
					if (arg4[local333 - arg0][local322 - arg1]) {
						local352 = this.aShortArrayArray13[local331];
						if (local352 != null) {
							for (local356 = 0; local356 < local352.length; local356++) {
								local312++;
								local316.method6498(local352[local356] & 0xFFFF);
							}
						}
					}
					local331++;
				}
			}
		}
		if (local312 > 0) {
			@Pc(464) Class94_Sub2 local464 = new Class94_Sub2(this.aClass15_Sub3_44, 5123, local316.aByteArray86, local316.anInt7869);
			this.aClass15_Sub3_44.method4453(local312, local464, 0);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBILclient!bf;)V")
	private void method8337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub4_Sub2_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray20[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray17[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (this.aClass15_Sub3_44.anIntArray316.length < local22) {
			this.aClass15_Sub3_44.anIntArray315 = new int[local22];
			this.aClass15_Sub3_44.anIntArray316 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass15_Sub3_44.anIntArray316;
		@Pc(50) int[] local50 = this.aClass15_Sub3_44.anIntArray315;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass15_Sub3_44.anInt5327;
			local50[local52] = local19[local52] >> this.aClass15_Sub3_44.anInt5327;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local22) {
			@Pc(86) int local86 = local46[local80];
			@Pc(91) int local91 = local50[local80++];
			@Pc(95) int local95 = local46[local80];
			@Pc(100) int local100 = local50[local80++];
			@Pc(104) int local104 = local46[local80];
			@Pc(109) int local109 = local50[local80++];
			if ((local86 - local95) * (local100 - local109) - (local104 - local95) * (-local91 + local100) > 0) {
				arg2.method1059(local91, local104, local95, local100, local109, local86);
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt10339 <= 0) {
			this.aClass309_2 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt10461 + 1][super.anInt10459 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; local25 < super.anInt10461; local25++) {
				for (local29 = 1; super.anInt10459 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray35[local25][local29 + 1] >> 3) + (this.aByteArrayArray35[local25][local29 - 1] >> 2) + (this.aByteArrayArray35[local25 + 1][local29] >> 3) + (this.aByteArrayArray35[local25 + -1][local29] >> 2) + (this.aByteArrayArray35[local25][local29] >> 1));
				}
			}
			this.aClass3_Sub13Array1 = new Class3_Sub13[this.aClass25_44.method950()];
			this.aClass25_44.method955(this.aClass3_Sub13Array1);
			for (local29 = 0; local29 < this.aClass3_Sub13Array1.length; local29++) {
				this.aClass3_Sub13Array1[local29].method2312(this.anInt10339);
			}
			@Pc(133) int local133 = 24;
			if (this.anIntArrayArrayArray19 != null) {
				local133 += 4;
			}
			if ((this.anInt10327 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(153) NativeHeapBuffer local153 = this.aClass15_Sub3_44.aNativeHeap4.a(this.anInt10339 * local133, false);
			@Pc(158) Stream local158 = new Stream(local153);
			@Pc(162) Class3_Sub13[] local162 = new Class3_Sub13[this.anInt10339];
			@Pc(169) int local169 = Static332.method5752(this.anInt10339 / 4);
			if (local169 < 1) {
				local169 = 1;
			}
			@Pc(181) Class25 local181 = new Class25(local169);
			@Pc(185) Class3_Sub13[] local185 = new Class3_Sub13[this.anInt10340];
			@Pc(191) int local191;
			for (@Pc(187) int local187 = 0; super.anInt10461 > local187; local187++) {
				for (local191 = 0; super.anInt10459 > local191; local191++) {
					if (this.anIntArrayArrayArray16[local187][local191] != null) {
						@Pc(207) Class3_Sub13[] local207 = this.aClass3_Sub13ArrayArrayArray1[local187][local191];
						@Pc(214) int[] local214 = this.anIntArrayArrayArray20[local187][local191];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray17[local187][local191];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray21[local187][local191];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray16[local187][local191];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray18 == null ? null : this.anIntArrayArrayArray18[local187][local191];
						if (local228 == null) {
							local228 = local235;
						}
						@Pc(263) int[] local263 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local187][local191];
						@Pc(270) float local270 = this.aFloatArrayArray14[local187][local191];
						@Pc(277) float local277 = this.aFloatArrayArray16[local187][local191];
						@Pc(284) float local284 = this.aFloatArrayArray15[local187][local191];
						@Pc(293) float local293 = this.aFloatArrayArray14[local187][local191 + 1];
						@Pc(302) float local302 = this.aFloatArrayArray16[local187][local191 + 1];
						@Pc(311) float local311 = this.aFloatArrayArray15[local187][local191 + 1];
						@Pc(322) float local322 = this.aFloatArrayArray14[local187 + 1][local191 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray16[local187 + 1][local191 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray15[local187 + 1][local191 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray14[local187 + 1][local191];
						@Pc(362) float local362 = this.aFloatArrayArray16[local187 + 1][local191];
						@Pc(371) float local371 = this.aFloatArrayArray15[local187 + 1][local191];
						@Pc(379) int local379 = local23[local187][local191] & 0xFF;
						@Pc(389) int local389 = local23[local187][local191 + 1] & 0xFF;
						@Pc(401) int local401 = local23[local187 + 1][local191 + 1] & 0xFF;
						@Pc(411) int local411 = local23[local187 + 1][local191] & 0xFF;
						@Pc(413) int local413 = 0;
						@Pc(423) int local423;
						label335: for (@Pc(415) int local415 = 0; local415 < local235.length; local415++) {
							@Pc(421) Class3_Sub13 local421 = local207[local415];
							for (local423 = 0; local423 < local413; local423++) {
								if (local421 == local185[local423]) {
									continue label335;
								}
							}
							local185[local413++] = local421;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray13[local187 + super.anInt10461 * local191] = new short[local235.length];
						for (local423 = 0; local423 < local235.length; local423++) {
							@Pc(474) int local474 = (local187 << super.anInt10463) + local214[local423];
							@Pc(483) int local483 = (local191 << super.anInt10463) + local221[local423];
							@Pc(488) int local488 = local474 >> this.anInt10333;
							@Pc(493) int local493 = local483 >> this.anInt10333;
							@Pc(497) int local497 = local235[local423];
							@Pc(501) int local501 = local228[local423];
							@Pc(509) int local509 = local247 == null ? 0 : local247[local423];
							@Pc(527) long local527 = (long) (local488 << 16) | (long) local501 << 48 | (long) local497 << 32 | (long) local493;
							@Pc(531) int local531 = local214[local423];
							@Pc(535) int local535 = local221[local423];
							@Pc(537) byte local537 = 74;
							@Pc(539) int local539 = 0;
							@Pc(541) float local541 = 1.0F;
							@Pc(552) float local552;
							@Pc(550) float local550;
							@Pc(558) float local558;
							@Pc(660) float local660;
							@Pc(556) int local556;
							if (local531 == 0 && local535 == 0) {
								local550 = local277;
								local552 = local270;
								local556 = local537 - local379;
								local558 = local284;
							} else if (local531 == 0 && super.anInt10458 == local535) {
								local552 = local293;
								local550 = local302;
								local558 = local311;
								local556 = local537 - local389;
							} else if (local531 == super.anInt10458 && local535 == super.anInt10458) {
								local556 = local537 - local401;
								local550 = local333;
								local552 = local322;
								local558 = local344;
							} else if (local531 == super.anInt10458 && local535 == 0) {
								local556 = local537 - local411;
								local558 = local371;
								local550 = local362;
								local552 = local353;
							} else {
								@Pc(637) float local637 = (float) local531 / (float) super.anInt10458;
								@Pc(644) float local644 = (float) local535 / (float) super.anInt10458;
								@Pc(652) float local652 = local270 + local637 * (local353 - local270);
								local660 = local277 + local637 * (local362 - local277);
								@Pc(669) float local669 = local284 + local637 * (local371 - local284);
								@Pc(678) float local678 = (local322 - local293) * local637 + local293;
								@Pc(686) float local686 = local637 * (local333 - local302) + local302;
								local550 = local660 + local644 * (local686 - local660);
								local552 = local644 * (local678 - local652) + local652;
								@Pc(713) float local713 = local637 * (local344 - local311) + local311;
								local558 = local669 + (local713 - local669) * local644;
								@Pc(734) int local734 = ((local411 - local379) * local531 >> super.anInt10463) + local379;
								@Pc(746) int local746 = local389 + (local531 * (local401 - local389) >> super.anInt10463);
								local556 = local537 - local734 - ((local746 - local734) * local535 >> super.anInt10463);
							}
							if (local497 != -1) {
								@Pc(773) int local773 = local556 * (local497 & 0x7F) >> 7;
								if (local773 < 2) {
									local773 = 2;
								} else if (local773 > 126) {
									local773 = 126;
								}
								local539 = Static331.anIntArray442[local773 | local497 & 0xFF80];
								if ((this.anInt10327 & 0x7) == 0) {
									local541 = this.aClass15_Sub3_44.aFloatArray41[2] * local558 + local550 * this.aClass15_Sub3_44.aFloatArray41[1] + this.aClass15_Sub3_44.aFloatArray41[0] * local552;
									local541 = (local541 > 0.0F ? this.aClass15_Sub3_44.aFloat96 : this.aClass15_Sub3_44.aFloat105) * local541 + this.aClass15_Sub3_44.aFloat109;
								}
							}
							@Pc(844) Class3 local844 = null;
							if ((this.anInt10337 - 1 & local474) == 0 && (this.anInt10337 - 1 & local483) == 0) {
								local844 = local181.method946(local527);
							}
							@Pc(877) int local877;
							@Pc(941) int local941;
							if (local844 == null) {
								if (local501 == local497) {
									local941 = local539;
								} else {
									@Pc(917) int local917 = local556 * (local501 & 0x7F) >> 7;
									if (local917 < 2) {
										local917 = 2;
									} else if (local917 > 126) {
										local917 = 126;
									}
									local941 = Static331.anIntArray442[local917 | local501 & 0xFF80];
									if ((this.anInt10327 & 0x7) == 0) {
										@Pc(972) float local972 = this.aClass15_Sub3_44.aFloatArray41[1] * local550 + this.aClass15_Sub3_44.aFloatArray41[0] * local552 + this.aClass15_Sub3_44.aFloatArray41[2] * local558;
										local660 = (local541 > 0.0F ? this.aClass15_Sub3_44.aFloat96 : this.aClass15_Sub3_44.aFloat105) * local541 + this.aClass15_Sub3_44.aFloat109;
										@Pc(997) int local997 = local941 >> 16 & 0xFF;
										@Pc(1003) int local1003 = local941 >> 8 & 0xFF;
										local997 = (int) ((float) local997 * local660);
										@Pc(1013) int local1013 = local941 & 0xFF;
										local1003 = (int) ((float) local1003 * local660);
										if (local997 < 0) {
											local997 = 0;
										} else if (local997 > 255) {
											local997 = 255;
										}
										local1013 = (int) ((float) local1013 * local660);
										if (local1003 < 0) {
											local1003 = 0;
										} else if (local1003 > 255) {
											local1003 = 255;
										}
										if (local1013 < 0) {
											local1013 = 0;
										} else if (local1013 > 255) {
											local1013 = 255;
										}
										local941 = local997 << 16 | local1003 << 8 | local1013;
									}
								}
								if (this.aClass15_Sub3_44.aBoolean442) {
									local158.b((float) local474);
									local158.b((float) (local509 + this.sa(local474, local483)));
									local158.b((float) local483);
									local158.c((byte) (local941 >> 16));
									local158.c((byte) (local941 >> 8));
									local158.c((byte) local941);
									local158.c(-1);
									local158.b((float) local474);
									local158.b((float) local483);
									if (this.anIntArrayArrayArray19 != null) {
										local158.b((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt10327 & 0x7) != 0) {
										local158.b(local552);
										local158.b(local550);
										local158.b(local558);
									}
								} else {
									local158.a((float) local474);
									local158.a((float) (this.sa(local474, local483) + local509));
									local158.a((float) local483);
									local158.c((byte) (local941 >> 16));
									local158.c((byte) (local941 >> 8));
									local158.c((byte) local941);
									local158.c(-1);
									local158.a((float) local474);
									local158.a((float) local483);
									if (this.anIntArrayArrayArray19 != null) {
										local158.a((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt10327 & 0x7) != 0) {
										local158.a(local552);
										local158.a(local550);
										local158.a(local558);
									}
								}
								local877 = this.anInt10331++;
								local460[local423] = (short) local877;
								if (local497 != -1) {
									local162[local877] = local207[local423];
								}
								local181.method945(new Class3_Sub39(local460[local423]), local527);
							} else {
								local460[local423] = ((Class3_Sub39) local844).aShort83;
								local877 = local460[local423] & 0xFFFF;
								if (local497 != -1 && local207[local423].aLong262 < local162[local877].aLong262) {
									local162[local877] = local207[local423];
								}
							}
							for (local941 = 0; local941 < local413; local941++) {
								local185[local941].method2311(local556, local541, local877, local539);
							}
							this.anInt10323++;
						}
					}
				}
			}
			for (local191 = 0; local191 < this.anInt10331; local191++) {
				@Pc(1326) Class3_Sub13 local1326 = local162[local191];
				if (local1326 != null) {
					local1326.method2307(local191);
				}
			}
			@Pc(1360) int local1360;
			for (@Pc(1339) int local1339 = 0; super.anInt10461 > local1339; local1339++) {
				for (@Pc(1343) int local1343 = 0; local1343 < super.anInt10459; local1343++) {
					@Pc(1356) short[] local1356 = this.aShortArrayArray13[local1343 * super.anInt10461 + local1339];
					if (local1356 != null) {
						local1360 = 0;
						@Pc(1362) int local1362 = 0;
						while (local1362 < local1356.length) {
							@Pc(1371) int local1371 = local1356[local1362++] & 0xFFFF;
							@Pc(1378) int local1378 = local1356[local1362++] & 0xFFFF;
							@Pc(1385) int local1385 = local1356[local1362++] & 0xFFFF;
							@Pc(1389) Class3_Sub13 local1389 = local162[local1371];
							@Pc(1393) Class3_Sub13 local1393 = local162[local1378];
							@Pc(1397) Class3_Sub13 local1397 = local162[local1385];
							@Pc(1399) Class3_Sub13 local1399 = null;
							if (local1389 != null) {
								local1399 = local1389;
								local1389.method2310(local1339, local1343, local1360);
							}
							if (local1393 != null) {
								local1393.method2310(local1339, local1343, local1360);
								if (local1399 == null || local1393.aLong262 < local1399.aLong262) {
									local1399 = local1393;
								}
							}
							if (local1397 != null) {
								local1397.method2310(local1339, local1343, local1360);
								if (local1399 == null || local1397.aLong262 < local1399.aLong262) {
									local1399 = local1397;
								}
							}
							if (local1399 != null) {
								if (local1389 != null) {
									local1399.method2307(local1371);
								}
								if (local1393 != null) {
									local1399.method2307(local1378);
								}
								if (local1397 != null) {
									local1399.method2307(local1385);
								}
								local1399.method2310(local1339, local1343, local1360);
							}
							local1360++;
						}
					}
				}
			}
			local158.a();
			this.anInterface16_7 = this.aClass15_Sub3_44.method4373(local153, local133, local158.c());
			this.aClass346_13 = new Class346(this.anInterface16_7, 5126, 3, 0);
			this.aClass346_14 = new Class346(this.anInterface16_7, 5121, 4, 12);
			@Pc(1536) byte local1536;
			if (this.anIntArrayArrayArray19 == null) {
				local1536 = 24;
				this.aClass346_16 = new Class346(this.anInterface16_7, 5126, 2, 16);
			} else {
				local1536 = 28;
				this.aClass346_16 = new Class346(this.anInterface16_7, 5126, 3, 16);
			}
			if ((this.anInt10327 & 0x7) != 0) {
				this.aClass346_15 = new Class346(this.anInterface16_7, 5126, 3, local1536);
			}
			@Pc(1580) long[] local1580 = new long[this.aClass3_Sub13Array1.length];
			for (local1360 = 0; local1360 < this.aClass3_Sub13Array1.length; local1360++) {
				@Pc(1589) Class3_Sub13 local1589 = this.aClass3_Sub13Array1[local1360];
				local1580[local1360] = local1589.aLong262;
				local1589.method2309(this.anInt10331);
			}
			Static118.method7552(local1580, this.aClass3_Sub13Array1);
			if (this.aClass309_2 != null) {
				this.aClass309_2.method7563();
			}
		}
		this.aClass25_44 = null;
		this.aByteArrayArray35 = null;
		this.anIntArrayArrayArray20 = this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray19 = null;
		this.aFloatArrayArray14 = this.aFloatArrayArray16 = this.aFloatArrayArray15 = null;
		this.anIntArrayArrayArray18 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray21 = null;
		this.aClass3_Sub13ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!wo", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt10461][super.anInt10459][];
		}
		if (arg3 != null && this.anIntArrayArrayArray18 == null) {
			this.anIntArrayArrayArray18 = new int[super.anInt10461][super.anInt10459][];
		}
		this.anIntArrayArrayArray20[arg0][arg1] = arg2;
		this.anIntArrayArrayArray17[arg0][arg1] = arg4;
		this.anIntArrayArrayArray16[arg0][arg1] = arg6;
		this.anIntArrayArrayArray21[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray18 != null) {
			this.anIntArrayArrayArray18[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub13[] local88 = this.aClass3_Sub13ArrayArrayArray1[arg0][arg1] = new Class3_Sub13[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg8[local90];
			@Pc(125) Class3 local125;
			for (local125 = this.aClass25_44.method946(local119); local125 != null; local125 = this.aClass25_44.method953()) {
				@Pc(130) Class3_Sub13 local130 = (Class3_Sub13) local125;
				if (arg8[local90] == local130.anInt2624 && (float) arg9[local90] == local130.aFloat28 && local130.anInt2625 == arg10 && local130.anInt2626 == arg11 && local130.anInt2622 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub13(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass25_44.method945(local88[local90], local119);
			} else {
				local88[local90] = (Class3_Sub13) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray34[arg0][arg1] = (byte) (this.aByteArrayArray34[arg0][arg1] | 0x1);
		}
		if (this.anInt10340 < arg6.length) {
			this.anInt10340 = arg6.length;
		}
		this.anInt10339 += arg6.length;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!pn;[I)V")
	@Override
	public void method8448(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass183_63.method4792(new Class3_Sub20(this.aClass15_Sub3_44, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
	@Override
	public void method8442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method8445(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass309_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass15_Sub3_44.anInt5335 >> 8) >> this.aClass15_Sub3_44.anInt5327;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass15_Sub3_44.anInt5353 >> 8) >> this.aClass15_Sub3_44.anInt5327;
			return this.aClass309_2.method7564(local24, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!wo", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass309_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass15_Sub3_44.anInt5335 * arg2 >> 8) >> this.aClass15_Sub3_44.anInt5327;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass15_Sub3_44.anInt5353 >> 8) >> this.aClass15_Sub3_44.anInt5327;
			this.aClass309_2.method7566(local39, arg0, local24);
		}
	}
}
