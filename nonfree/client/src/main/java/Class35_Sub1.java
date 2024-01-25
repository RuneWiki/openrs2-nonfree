import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!bja", name = "p", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!bja", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!bja", name = "F", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!bja", name = "X", descriptor = "Lclient!ot;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "client!bja", name = "Z", descriptor = "Lclient!ut;")
	public Class364 aClass364_1;

	@OriginalMember(owner = "client!bja", name = "ab", descriptor = "Lclient!ut;")
	public Class364 aClass364_2;

	@OriginalMember(owner = "client!bja", name = "bb", descriptor = "[Lclient!sv;")
	private Class3_Sub47[] aClass3_Sub47Array1;

	@OriginalMember(owner = "client!bja", name = "db", descriptor = "Lclient!ut;")
	private Class364 aClass364_3;

	@OriginalMember(owner = "client!bja", name = "eb", descriptor = "Lclient!ut;")
	public Class364 aClass364_4;

	@OriginalMember(owner = "client!bja", name = "gb", descriptor = "I")
	private int anInt1077;

	@OriginalMember(owner = "client!bja", name = "jb", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!bja", name = "U", descriptor = "Lclient!qw;")
	private final Class302 aClass302_4 = new Class302();

	@OriginalMember(owner = "client!bja", name = "Q", descriptor = "I")
	private final int anInt1073 = this.anInt9154 - 2;

	@OriginalMember(owner = "client!bja", name = "m", descriptor = "Lclient!lf;")
	public final Class95_Sub3 aClass95_Sub3_6;

	@OriginalMember(owner = "client!bja", name = "V", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!bja", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!bja", name = "lb", descriptor = "[[F")
	private float[][] lb;

	@OriginalMember(owner = "client!bja", name = "A", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!bja", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!bja", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!bja", name = "K", descriptor = "I")
	private final int anInt1068;

	@OriginalMember(owner = "client!bja", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bja", name = "q", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!bja", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!bja", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!bja", name = "l", descriptor = "[[[Lclient!sv;")
	private Class3_Sub47[][][] aClass3_Sub47ArrayArrayArray1;

	@OriginalMember(owner = "client!bja", name = "N", descriptor = "I")
	public final int anInt1070;

	@OriginalMember(owner = "client!bja", name = "t", descriptor = "[[B")
	private final byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bja", name = "cb", descriptor = "Lclient!tca;")
	private Class333 aClass333_7;

	@OriginalMember(owner = "client!bja", name = "w", descriptor = "Lclient!wg;")
	private Class386 aClass386_1;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lclient!lf;IIII[[I[[II)V")
	public Class35_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass95_Sub3_6 = arg0;
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.lb = new float[super.anInt9149 + 1][super.anInt9148 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anInt1068 = 0x1 << this.anInt1073;
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.aShortArrayArray5 = new short[arg4 * arg3][];
		this.aFloatArrayArray4 = new float[super.anInt9149 + 1][super.anInt9148 + 1];
		this.aFloatArrayArray3 = new float[super.anInt9149 + 1][super.anInt9148 + 1];
		this.aClass3_Sub47ArrayArrayArray1 = new Class3_Sub47[arg3][arg4][];
		this.anInt1070 = arg2;
		this.aByteArrayArray3 = new byte[arg3][arg4];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9148; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9149 > local119; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (local154 * local154 + arg7 * 4 * arg7 + local137 * local137)));
				this.aFloatArrayArray4[local119][local115] = local173 * (float) local137;
				this.aFloatArrayArray3[local119][local115] = (float) (-arg7 * 2) * local173;
				this.lb[local119][local115] = (float) local154 * local173;
			}
		}
		this.aClass333_7 = new Class333(128);
		if ((this.anInt1070 & 0x10) != 0) {
			this.aClass386_1 = new Class386(this.aClass95_Sub3_6, this);
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method962(arg4, arg0, arg1, arg3, arg5, -1, arg2);
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IZII[[ZIII)V")
	private void method962(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub47Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg6 + arg6 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (this.aClass95_Sub3_6.anIntArray311.length < local14) {
			this.aClass95_Sub3_6.anIntArray311 = new int[local14];
		}
		if (this.anInt1064 * 2 > this.aClass95_Sub3_6.aClass3_Sub4_Sub2_1.aByteArray90.length) {
			this.aClass95_Sub3_6.aClass3_Sub4_Sub2_1 = new Class3_Sub4_Sub2(this.anInt1064 * 2);
		}
		@Pc(50) int local50 = arg1 - arg6;
		@Pc(52) int local52 = local50;
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(61) int local61 = arg2 - arg6;
		@Pc(63) int local63 = local61;
		if (local61 < 0) {
			local61 = 0;
		}
		@Pc(71) int local71 = arg6 + arg1;
		if (local71 > super.anInt9149 - 1) {
			local71 = super.anInt9149 - 1;
		}
		@Pc(90) int local90 = arg6 + arg2;
		if (local90 > super.anInt9148 - 1) {
			local90 = super.anInt9148 - 1;
		}
		@Pc(107) int local107 = 0;
		@Pc(111) int[] local111 = this.aClass95_Sub3_6.anIntArray311;
		@Pc(124) int local124;
		for (@Pc(113) int local113 = local50; local113 <= local71; local113++) {
			@Pc(122) boolean[] local122 = arg3[local113 - local52];
			for (local124 = local61; local124 <= local90; local124++) {
				if (local122[local124 - local63]) {
					local111[local107++] = local113 + super.anInt9149 * local124;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass95_Sub3_6.method4873();
		} else {
			this.aClass95_Sub3_6.method4891((float) arg5);
			this.aClass95_Sub3_6.method4881();
		}
		this.aClass95_Sub3_6.method4908((this.anInt1070 & 0x7) != 0);
		for (@Pc(192) int local192 = 0; local192 < this.aClass3_Sub47Array1.length; local192++) {
			this.aClass3_Sub47Array1[local192].method7443(local111, local107);
		}
		if (!this.aClass302_4.method6612()) {
			local124 = this.aClass95_Sub3_6.anInt5791;
			@Pc(221) int local221 = this.aClass95_Sub3_6.anInt5780;
			this.aClass95_Sub3_6.L(0, local221, this.aClass95_Sub3_6.anInt5767);
			this.aClass95_Sub3_6.method4908(false);
			this.aClass95_Sub3_6.method4841(false);
			this.aClass95_Sub3_6.method4833(128);
			this.aClass95_Sub3_6.method4849(-2);
			this.aClass95_Sub3_6.method4864(this.aClass95_Sub3_6.aClass10_Sub2_2);
			this.aClass95_Sub3_6.method4899(8448, 7681);
			this.aClass95_Sub3_6.method4869(34166, 0, 770);
			this.aClass95_Sub3_6.method4850(0, 34167);
			for (@Pc(283) Class3 local283 = this.aClass302_4.method6603(); local283 != null; local283 = this.aClass302_4.method6605()) {
				@Pc(288) Class3_Sub55 local288 = (Class3_Sub55) local283;
				local288.method8967(arg1, arg6, arg2, arg3);
			}
			this.aClass95_Sub3_6.method4869(5890, 0, 768);
			this.aClass95_Sub3_6.method4850(0, 5890);
			this.aClass95_Sub3_6.method4864((Class10) null);
			this.aClass95_Sub3_6.L(local124, local221, this.aClass95_Sub3_6.anInt5767);
		}
		if (this.aClass386_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass95_Sub3_6.method4903(this.aClass364_2, this.aClass364_4, (Class364) null, (Class364) null);
		this.aClass386_1.method8815(arg2, arg1, arg6, arg0, arg3);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!bja", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt9149][super.anInt9148][];
		}
		if (arg5 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt9149][super.anInt9148][];
		}
		@Pc(33) Interface2 local33 = this.aClass95_Sub3_6.anInterface2_12;
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray1[arg0][arg1] = arg4;
		this.anIntArrayArrayArray5[arg0][arg1] = arg6;
		this.anIntArrayArrayArray2[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub47[] local92 = this.aClass3_Sub47ArrayArrayArray1[arg0][arg1] = new Class3_Sub47[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt1070 & 0x20) != 0 && local100 != -1 && local33.method8330(local100).aBoolean466) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(148) long local148 = (long) (local104 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) local100;
			@Pc(154) Class3 local154;
			for (local154 = this.aClass333_7.method7489(local148); local154 != null; local154 = this.aClass333_7.method7484()) {
				@Pc(159) Class3_Sub47 local159 = (Class3_Sub47) local154;
				if (local100 == local159.anInt9125 && (float) local104 == local159.aFloat179 && local159.anInt9131 == arg10 && arg11 == local159.anInt9138 && local159.anInt9133 == arg12) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class3_Sub47(this, local100, local104, arg10, arg11, arg12);
				this.aClass333_7.method7488(local148, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub47) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray3[arg0][arg1] = (byte) (this.aByteArrayArray3[arg0][arg1] | 0x1);
		}
		if (this.anInt1079 < arg6.length) {
			this.anInt1079 = arg6.length;
		}
		this.anInt1077 += arg6.length;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lclient!uaa;[I)V")
	@Override
	public void method7457(@OriginalArg(0) Class3_Sub13 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass302_4.method6613(new Class3_Sub55(this.aClass95_Sub3_6, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!bja", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub5_Sub11 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub5_Sub11 arg2) {
		if ((this.aByteArrayArray3[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9152 >> this.aClass95_Sub3_6.anInt5750;
		@Pc(27) Class3_Sub5_Sub11_Sub1 local27 = (Class3_Sub5_Sub11_Sub1) arg2;
		@Pc(43) Class3_Sub5_Sub11_Sub1 local43;
		if (local27 != null && local27.method4403(local24, local24)) {
			local43 = local27;
			local27.method4404();
		} else {
			local43 = new Class3_Sub5_Sub11_Sub1(this.aClass95_Sub3_6, local24, local24);
		}
		local43.method4399(local24, 0, 0, local24);
		this.method965(local43, arg0, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILclient!kea;II)V")
	private void method965(@OriginalArg(1) Class3_Sub5_Sub11_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray1[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass95_Sub3_6.anIntArray313.length) {
			this.aClass95_Sub3_6.anIntArray312 = new int[local22];
			this.aClass95_Sub3_6.anIntArray313 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass95_Sub3_6.anIntArray313;
		@Pc(46) int[] local46 = this.aClass95_Sub3_6.anIntArray312;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass95_Sub3_6.anInt5750;
			local46[local48] = local19[local48] >> this.aClass95_Sub3_6.anInt5750;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(90) int local90 = local42[local84];
			@Pc(95) int local95 = local46[local84++];
			@Pc(99) int local99 = local42[local84];
			@Pc(104) int local104 = local46[local84++];
			@Pc(108) int local108 = local42[local84];
			@Pc(113) int local113 = local46[local84++];
			if (-((local104 - local95) * (local108 - local99)) + (local90 - local99) * (local104 + -local113) > 0) {
				arg0.method4400(local95, local99, local113, local104, local90, local108);
			}
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method962(arg4, arg0, arg1, arg3, arg6, arg5, arg2);
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(II)V")
	@Override
	public void method7454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bja", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt1077 <= 0) {
			this.aClass386_1 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt9149 + 1][super.anInt9148 + 1];
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 1; local24 < super.anInt9149; local24++) {
				for (local28 = 1; local28 < super.anInt9148; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray4[local24 - 1][local28] >> 2) + (this.aByteArrayArray4[local24 + 1][local28] >> 3) + (this.aByteArrayArray4[local24][local28 + -1] >> 2) + (this.aByteArrayArray4[local24][local28 - -1] >> 3) + (this.aByteArrayArray4[local24][local28] >> 1));
				}
			}
			this.aClass3_Sub47Array1 = new Class3_Sub47[this.aClass333_7.method7486()];
			this.aClass333_7.method7483(this.aClass3_Sub47Array1);
			for (local28 = 0; local28 < this.aClass3_Sub47Array1.length; local28++) {
				this.aClass3_Sub47Array1[local28].method7438(this.anInt1077);
			}
			@Pc(132) int local132 = 24;
			if (this.anIntArrayArrayArray3 != null) {
				local132 += 4;
			}
			if ((this.anInt1070 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass95_Sub3_6.aNativeHeap2.a(local132 * this.anInt1077, false);
			@Pc(160) Stream local160 = new Stream(local155);
			@Pc(164) Class3_Sub47[] local164 = new Class3_Sub47[this.anInt1077];
			@Pc(171) int local171 = Static324.method4617(this.anInt1077 / 4);
			if (local171 < 1) {
				local171 = 1;
			}
			@Pc(183) Class333 local183 = new Class333(local171);
			@Pc(187) Class3_Sub47[] local187 = new Class3_Sub47[this.anInt1079];
			@Pc(193) int local193;
			for (@Pc(189) int local189 = 0; local189 < super.anInt9149; local189++) {
				for (local193 = 0; local193 < super.anInt9148; local193++) {
					if (this.anIntArrayArrayArray5[local189][local193] != null) {
						@Pc(209) Class3_Sub47[] local209 = this.aClass3_Sub47ArrayArrayArray1[local189][local193];
						@Pc(216) int[] local216 = this.anIntArrayArrayArray6[local189][local193];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray1[local189][local193];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray2[local189][local193];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray5[local189][local193];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local189][local193];
						@Pc(261) int[] local261 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local189][local193];
						if (local230 == null) {
							local230 = local237;
						}
						@Pc(272) float local272 = this.aFloatArrayArray4[local189][local193];
						@Pc(279) float local279 = this.aFloatArrayArray3[local189][local193];
						@Pc(286) float local286 = this.lb[local189][local193];
						@Pc(295) float local295 = this.aFloatArrayArray4[local189][local193 + 1];
						@Pc(304) float local304 = this.aFloatArrayArray3[local189][local193 + 1];
						@Pc(313) float local313 = this.lb[local189][local193 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray4[local189 + 1][local193 + 1];
						@Pc(335) float local335 = this.aFloatArrayArray3[local189 + 1][local193 + 1];
						@Pc(346) float local346 = this.lb[local189 + 1][local193 + 1];
						@Pc(355) float local355 = this.aFloatArrayArray4[local189 + 1][local193];
						@Pc(364) float local364 = this.aFloatArrayArray3[local189 + 1][local193];
						@Pc(373) float local373 = this.lb[local189 + 1][local193];
						@Pc(381) int local381 = local22[local189][local193] & 0xFF;
						@Pc(391) int local391 = local22[local189][local193 + 1] & 0xFF;
						@Pc(403) int local403 = local22[local189 + 1][local193 + 1] & 0xFF;
						@Pc(413) int local413 = local22[local189 + 1][local193] & 0xFF;
						@Pc(415) int local415 = 0;
						@Pc(425) int local425;
						label337: for (@Pc(417) int local417 = 0; local417 < local237.length; local417++) {
							@Pc(423) Class3_Sub47 local423 = local209[local417];
							for (local425 = 0; local425 < local415; local425++) {
								if (local187[local425] == local423) {
									continue label337;
								}
							}
							local187[local415++] = local423;
						}
						@Pc(466) short[] local466 = this.aShortArrayArray5[super.anInt9149 * local193 + local189] = new short[local237.length];
						for (local425 = 0; local425 < local237.length; local425++) {
							@Pc(480) int local480 = (local189 << super.anInt9154) + local216[local425];
							@Pc(490) int local490 = (local193 << super.anInt9154) + local223[local425];
							@Pc(495) int local495 = local480 >> this.anInt1073;
							@Pc(500) int local500 = local490 >> this.anInt1073;
							@Pc(504) int local504 = local237[local425];
							@Pc(508) int local508 = local230[local425];
							@Pc(516) int local516 = local249 == null ? 0 : local249[local425];
							@Pc(534) long local534 = (long) local500 | (long) (local495 << 16) | (long) local508 << 48 | (long) local504 << 32;
							@Pc(538) int local538 = local216[local425];
							@Pc(542) int local542 = local223[local425];
							@Pc(544) byte local544 = 74;
							@Pc(546) int local546 = 0;
							@Pc(548) float local548 = 1.0F;
							@Pc(581) float local581;
							@Pc(579) float local579;
							@Pc(577) float local577;
							@Pc(634) float local634;
							@Pc(575) int local575;
							if (local538 == 0 && local542 == 0) {
								local575 = local544 - local381;
								local581 = local272;
								local579 = local279;
								local577 = local286;
							} else if (local538 == 0 && local542 == super.anInt9152) {
								local575 = local544 - local391;
								local577 = local313;
								local579 = local304;
								local581 = local295;
							} else if (local538 == super.anInt9152 && super.anInt9152 == local542) {
								local579 = local335;
								local575 = local544 - local403;
								local577 = local346;
								local581 = local324;
							} else if (local538 == super.anInt9152 && local542 == 0) {
								local581 = local355;
								local577 = local373;
								local575 = local544 - local413;
								local579 = local364;
							} else {
								@Pc(611) float local611 = (float) local538 / (float) super.anInt9152;
								@Pc(618) float local618 = (float) local542 / (float) super.anInt9152;
								@Pc(626) float local626 = local611 * (local355 - local272) + local272;
								local634 = (local364 - local279) * local611 + local279;
								@Pc(643) float local643 = local611 * (local373 - local286) + local286;
								@Pc(652) float local652 = local611 * (local324 - local295) + local295;
								@Pc(661) float local661 = (local335 - local304) * local611 + local304;
								@Pc(669) float local669 = (local346 - local313) * local611 + local313;
								local581 = local618 * (local652 - local626) + local626;
								local579 = (local661 - local634) * local618 + local634;
								local577 = local618 * (local669 - local643) + local643;
								@Pc(707) int local707 = local381 + (local538 * (local413 - local381) >> super.anInt9154);
								@Pc(719) int local719 = ((local403 - local391) * local538 >> super.anInt9154) + local391;
								local575 = local544 - local707 - ((local719 - local707) * local542 >> super.anInt9154);
							}
							if (local504 != -1) {
								@Pc(780) int local780 = local575 * (local504 & 0x7F) >> 7;
								if (local780 < 2) {
									local780 = 2;
								} else if (local780 > 126) {
									local780 = 126;
								}
								if ((this.anInt1070 & 0x7) == 0) {
									local548 = this.aClass95_Sub3_6.aFloatArray33[1] * local579 + this.aClass95_Sub3_6.aFloatArray33[0] * local581 + this.aClass95_Sub3_6.aFloatArray33[2] * local577;
									local548 = this.aClass95_Sub3_6.aFloat84 + (local548 > 0.0F ? this.aClass95_Sub3_6.aFloat102 : this.aClass95_Sub3_6.aFloat91) * local548;
								}
								local546 = Static537.anIntArray457[local504 & 0xFF80 | local780];
							}
							@Pc(851) Class3 local851 = null;
							if ((this.anInt1068 - 1 & local480) == 0 && (local490 & this.anInt1068 - 1) == 0) {
								local851 = local183.method7489(local534);
							}
							@Pc(1207) int local1207;
							@Pc(903) int local903;
							if (local851 == null) {
								if (local508 == local504) {
									local903 = local546;
								} else {
									@Pc(883) int local883 = (local508 & 0x7F) * local575 >> 7;
									if (local883 < 2) {
										local883 = 2;
									} else if (local883 > 126) {
										local883 = 126;
									}
									local903 = Static537.anIntArray457[local883 | local508 & 0xFF80];
									if ((this.anInt1070 & 0x7) == 0) {
										local634 = this.aClass95_Sub3_6.aFloatArray33[2] * local577 + this.aClass95_Sub3_6.aFloatArray33[1] * local579 + local581 * this.aClass95_Sub3_6.aFloatArray33[0];
										local634 = this.aClass95_Sub3_6.aFloat84 + (local548 > 0.0F ? this.aClass95_Sub3_6.aFloat102 : this.aClass95_Sub3_6.aFloat91) * local548;
										@Pc(956) int local956 = local903 >> 16 & 0xFF;
										@Pc(962) int local962 = local903 >> 8 & 0xFF;
										@Pc(966) int local966 = local903 & 0xFF;
										local956 = (int) ((float) local956 * local634);
										local962 = (int) ((float) local962 * local634);
										if (local956 < 0) {
											local956 = 0;
										} else if (local956 > 255) {
											local956 = 255;
										}
										if (local962 < 0) {
											local962 = 0;
										} else if (local962 > 255) {
											local962 = 255;
										}
										local966 = (int) ((float) local966 * local634);
										if (local966 < 0) {
											local966 = 0;
										} else if (local966 > 255) {
											local966 = 255;
										}
										local903 = local956 << 16 | local962 << 8 | local966;
									}
								}
								if (this.aClass95_Sub3_6.aBoolean369) {
									local160.a((float) local480);
									local160.a((float) (local516 + this.method7452(local480, local490)));
									local160.a((float) local490);
									local160.c((byte) (local903 >> 16));
									local160.c((byte) (local903 >> 8));
									local160.c((byte) local903);
									local160.c(-1);
									local160.a((float) local480);
									local160.a((float) local490);
									if (this.anIntArrayArrayArray3 != null) {
										local160.a((float) (local261 == null ? 0 : local261[local425] - 1));
									}
									if ((this.anInt1070 & 0x7) != 0) {
										local160.a(local581);
										local160.a(local579);
										local160.a(local577);
									}
								} else {
									local160.b((float) local480);
									local160.b((float) (local516 + this.method7452(local480, local490)));
									local160.b((float) local490);
									local160.c((byte) (local903 >> 16));
									local160.c((byte) (local903 >> 8));
									local160.c((byte) local903);
									local160.c(-1);
									local160.b((float) local480);
									local160.b((float) local490);
									if (this.anIntArrayArrayArray3 != null) {
										local160.b((float) (local261 == null ? 0 : local261[local425] - 1));
									}
									if ((this.anInt1070 & 0x7) != 0) {
										local160.b(local581);
										local160.b(local579);
										local160.b(local577);
									}
								}
								local1207 = this.anInt1054++;
								local466[local425] = (short) local1207;
								if (local504 != -1) {
									local164[local1207] = local209[local425];
								}
								local183.method7488(local534, new Class3_Sub29(local466[local425]));
							} else {
								local466[local425] = ((Class3_Sub29) local851).aShort48;
								local1207 = local466[local425] & 0xFFFF;
								if (local504 != -1 && local164[local1207].aLong313 > local209[local425].aLong313) {
									local164[local1207] = local209[local425];
								}
							}
							for (local903 = 0; local903 < local415; local903++) {
								local187[local903].method7446(local548, local546, local1207, local575);
							}
							this.anInt1064++;
						}
					}
				}
			}
			for (local193 = 0; local193 < this.anInt1054; local193++) {
				@Pc(1315) Class3_Sub47 local1315 = local164[local193];
				if (local1315 != null) {
					local1315.method7437(local193);
				}
			}
			@Pc(1348) int local1348;
			for (@Pc(1328) int local1328 = 0; super.anInt9149 > local1328; local1328++) {
				for (@Pc(1332) int local1332 = 0; super.anInt9148 > local1332; local1332++) {
					@Pc(1344) short[] local1344 = this.aShortArrayArray5[local1328 + super.anInt9149 * local1332];
					if (local1344 != null) {
						local1348 = 0;
						@Pc(1350) int local1350 = 0;
						while (local1344.length > local1350) {
							@Pc(1359) int local1359 = local1344[local1350++] & 0xFFFF;
							@Pc(1366) int local1366 = local1344[local1350++] & 0xFFFF;
							@Pc(1373) int local1373 = local1344[local1350++] & 0xFFFF;
							@Pc(1377) Class3_Sub47 local1377 = local164[local1359];
							@Pc(1381) Class3_Sub47 local1381 = local164[local1366];
							@Pc(1385) Class3_Sub47 local1385 = local164[local1373];
							@Pc(1387) Class3_Sub47 local1387 = null;
							if (local1377 != null) {
								local1377.method7439(local1328, local1332, local1348);
								local1387 = local1377;
							}
							if (local1381 != null) {
								local1381.method7439(local1328, local1332, local1348);
								if (local1387 == null || local1381.aLong313 < local1387.aLong313) {
									local1387 = local1381;
								}
							}
							if (local1385 != null) {
								local1385.method7439(local1328, local1332, local1348);
								if (local1387 == null || local1385.aLong313 < local1387.aLong313) {
									local1387 = local1385;
								}
							}
							if (local1387 != null) {
								if (local1377 != null) {
									local1387.method7437(local1359);
								}
								if (local1381 != null) {
									local1387.method7437(local1366);
								}
								if (local1385 != null) {
									local1387.method7437(local1373);
								}
								local1387.method7439(local1328, local1332, local1348);
							}
							local1348++;
						}
					}
				}
			}
			local160.a();
			this.anInterface21_1 = this.aClass95_Sub3_6.method4888(local160.c(), local155, local132);
			this.aClass364_4 = new Class364(this.anInterface21_1, 5126, 3, 0);
			this.aClass364_3 = new Class364(this.anInterface21_1, 5121, 4, 12);
			@Pc(1534) byte local1534;
			if (this.anIntArrayArrayArray3 == null) {
				this.aClass364_2 = new Class364(this.anInterface21_1, 5126, 2, 16);
				local1534 = 24;
			} else {
				this.aClass364_2 = new Class364(this.anInterface21_1, 5126, 3, 16);
				local1534 = 28;
			}
			if ((this.anInt1070 & 0x7) != 0) {
				this.aClass364_1 = new Class364(this.anInterface21_1, 5126, 3, local1534);
			}
			@Pc(1571) long[] local1571 = new long[this.aClass3_Sub47Array1.length];
			for (local1348 = 0; local1348 < this.aClass3_Sub47Array1.length; local1348++) {
				@Pc(1580) Class3_Sub47 local1580 = this.aClass3_Sub47Array1[local1348];
				local1571[local1348] = local1580.aLong313;
				local1580.method7436(this.anInt1054);
			}
			Static439.method5992(this.aClass3_Sub47Array1, local1571);
			if (this.aClass386_1 != null) {
				this.aClass386_1.method8817();
			}
		}
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray1 = null;
		this.aClass333_7 = null;
		this.anIntArrayArrayArray2 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.lb = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray4 = null;
		this.aByteArrayArray4 = null;
		this.aClass3_Sub47ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!bja", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass386_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass95_Sub3_6.anInt5760 >> 8) >> this.aClass95_Sub3_6.anInt5750;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass95_Sub3_6.anInt5762 >> 8) >> this.aClass95_Sub3_6.anInt5750;
			this.aClass386_1.method8813(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7460(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass386_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass95_Sub3_6.anInt5760 * arg2 >> 8) >> this.aClass95_Sub3_6.anInt5750;
			@Pc(39) int local39 = arg3 - (this.aClass95_Sub3_6.anInt5762 * arg2 >> 8) >> this.aClass95_Sub3_6.anInt5750;
			return this.aClass386_1.method8812(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!bja", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass386_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass95_Sub3_6.anInt5760 * arg2 >> 8) >> this.aClass95_Sub3_6.anInt5750;
			@Pc(38) int local38 = arg3 - (this.aClass95_Sub3_6.anInt5762 * arg2 >> 8) >> this.aClass95_Sub3_6.anInt5750;
			this.aClass386_1.method8814(local24, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7456(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1077 <= 0) {
			return;
		}
		this.aClass95_Sub3_6.method4844();
		this.aClass95_Sub3_6.method4839(false);
		this.aClass95_Sub3_6.method4908(false);
		this.aClass95_Sub3_6.method4862(false);
		this.aClass95_Sub3_6.method4841(false);
		this.aClass95_Sub3_6.method4833(0);
		this.aClass95_Sub3_6.method4849(-2);
		this.aClass95_Sub3_6.method4864((Class10) null);
		Static35.aFloatArray5[11] = 0.0F;
		Static35.aFloatArray5[14] = 0.0F;
		Static35.aFloatArray5[4] = 0.0F;
		Static35.aFloatArray5[8] = 0.0F;
		Static35.aFloatArray5[2] = 0.0F;
		Static35.aFloatArray5[9] = 0.0F;
		Static35.aFloatArray5[7] = 0.0F;
		Static35.aFloatArray5[6] = 0.0F;
		Static35.aFloatArray5[10] = 0.0F;
		Static35.aFloatArray5[15] = 1.0F;
		Static35.aFloatArray5[5] = (float) 1024 / ((float) super.anInt9152 * 128.0F * (float) this.aClass95_Sub3_6.anInt5669);
		Static35.aFloatArray5[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass95_Sub3_6.anInt5708) - 1.0F;
		Static35.aFloatArray5[0] = (float) 1024 / ((float) this.aClass95_Sub3_6.anInt5708 * 128.0F * (float) super.anInt9152);
		Static35.aFloatArray5[1] = 0.0F;
		Static35.aFloatArray5[3] = 0.0F;
		Static35.aFloatArray5[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass95_Sub3_6.anInt5669;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static35.aFloatArray5, 0);
		Static35.aFloatArray5[0] = 1.0F;
		Static35.aFloatArray5[15] = 1.0F;
		Static35.aFloatArray5[7] = 0.0F;
		Static35.aFloatArray5[4] = 0.0F;
		Static35.aFloatArray5[8] = 0.0F;
		Static35.aFloatArray5[12] = 0.0F;
		Static35.aFloatArray5[13] = 0.0F;
		Static35.aFloatArray5[5] = 0.0F;
		Static35.aFloatArray5[1] = 0.0F;
		Static35.aFloatArray5[9] = 1.0F;
		Static35.aFloatArray5[11] = 0.0F;
		Static35.aFloatArray5[14] = 0.0F;
		Static35.aFloatArray5[3] = 0.0F;
		Static35.aFloatArray5[10] = 0.0F;
		Static35.aFloatArray5[6] = 1.0F;
		Static35.aFloatArray5[2] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static35.aFloatArray5, 0);
		if ((this.anInt1070 & 0x7) == 0) {
			this.aClass95_Sub3_6.method4908(false);
		} else {
			this.aClass95_Sub3_6.method4908(true);
			this.aClass95_Sub3_6.method4860();
		}
		this.aClass95_Sub3_6.method4903(this.aClass364_2, this.aClass364_4, this.aClass364_3, this.aClass364_1);
		if (this.aClass95_Sub3_6.aClass3_Sub4_Sub2_1.aByteArray90.length >= this.anInt1064 * 2) {
			this.aClass95_Sub3_6.aClass3_Sub4_Sub2_1.anInt9739 = 0;
		} else {
			this.aClass95_Sub3_6.aClass3_Sub4_Sub2_1 = new Class3_Sub4_Sub2(this.anInt1064 * 2);
		}
		@Pc(315) int local315 = 0;
		@Pc(319) Class3_Sub4_Sub2 local319 = this.aClass95_Sub3_6.aClass3_Sub4_Sub2_1;
		@Pc(325) int local325;
		@Pc(334) int local334;
		@Pc(336) int local336;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass95_Sub3_6.aBoolean369) {
			for (local325 = arg1; local325 < arg3; local325++) {
				local334 = local325 * super.anInt9149 + arg0;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local325 - arg1]) {
						local353 = this.aShortArrayArray5[local334];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local319.method7956(local353[local357] & 0xFFFF);
								local315++;
							}
						}
					}
					local334++;
				}
			}
		} else {
			for (local325 = arg1; local325 < arg3; local325++) {
				local334 = arg0 + local325 * super.anInt9149;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local325 - arg1]) {
						local353 = this.aShortArrayArray5[local334];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local315++;
								local319.method7942(local353[local357] & 0xFFFF);
							}
						}
					}
					local334++;
				}
			}
		}
		if (local315 > 0) {
			@Pc(469) Class167_Sub2 local469 = new Class167_Sub2(this.aClass95_Sub3_6, 5123, local319.aByteArray90, local319.anInt9739);
			this.aClass95_Sub3_6.method4837(0, local315, local469);
		}
	}

	@OriginalMember(owner = "client!bja", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray4[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray4[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
}
