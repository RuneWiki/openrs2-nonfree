import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class42_Sub3 extends Class42 {

	@OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
	private int anInt5309;

	@OriginalMember(owner = "client!ll", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
	private int anInt5315;

	@OriginalMember(owner = "client!ll", name = "ab", descriptor = "[Lclient!oha;")
	private Class4_Sub37[] aClass4_Sub37Array1;

	@OriginalMember(owner = "client!ll", name = "cb", descriptor = "Lclient!oda;")
	private Interface19 anInterface19_3;

	@OriginalMember(owner = "client!ll", name = "db", descriptor = "I")
	private int anInt5324;

	@OriginalMember(owner = "client!ll", name = "eb", descriptor = "Lclient!oda;")
	private Interface19 anInterface19_4;

	@OriginalMember(owner = "client!ll", name = "fb", descriptor = "Lclient!nca;")
	public Class247 aClass247_1;

	@OriginalMember(owner = "client!ll", name = "gb", descriptor = "I")
	private int anInt5325;

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "F")
	private float aFloat118 = -3.4028235E38F;

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "F")
	private float aFloat117 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ll", name = "V", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_32 = new Class163();

	@OriginalMember(owner = "client!ll", name = "B", descriptor = "Lclient!wg;")
	public final Class33_Sub2 aClass33_Sub2_12;

	@OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
	private final int anInt5323;

	@OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
	private final int anInt5314;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ll", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ll", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!ll", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!ll", name = "S", descriptor = "[[S")
	public final short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "[[B")
	private final byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ll", name = "G", descriptor = "[[[Lclient!oha;")
	private Class4_Sub37[][][] aClass4_Sub37ArrayArrayArray1;

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ll", name = "jb", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
	public final int anInt5317;

	@OriginalMember(owner = "client!ll", name = "kb", descriptor = "Lclient!dj;")
	private Class66 aClass66_25;

	@OriginalMember(owner = "client!ll", name = "P", descriptor = "Lclient!vo;")
	private Class379 aClass379_2;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!wg;IIII[[I[[II)V")
	public Class42_Sub3(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass33_Sub2_12 = arg0;
		this.anInt5323 = super.anInt8635 - 2;
		this.anInt5314 = 0x1 << this.anInt5323;
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray13 = new float[super.anInt8638 + 1][super.anInt8630 + 1];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray12 = new float[super.anInt8638 + 1][super.anInt8630 + 1];
		this.aFloatArrayArray14 = new float[super.anInt8638 + 1][super.anInt8630 + 1];
		this.aShortArrayArray12 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aByteArrayArray19 = new byte[arg3][arg4];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aClass4_Sub37ArrayArrayArray1 = new Class4_Sub37[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
		this.anInt5317 = arg2;
		for (@Pc(121) int local121 = 0; super.anInt8630 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt8638; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray55[local125][local121];
				if ((float) local134 < this.aFloat117) {
					this.aFloat117 = (float) local134;
				}
				if (this.aFloat118 < (float) local134) {
					this.aFloat118 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt8638 && super.anInt8630 > local121) {
					@Pc(197) int local197 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(214) int local214 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(234) float local234 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local197 * local197 + local214 * local214)));
					this.aFloatArrayArray14[local125][local121] = (float) local197 * local234;
					this.aFloatArrayArray13[local125][local121] = local234 * (float) (-arg7 * 2);
					this.aFloatArrayArray12[local125][local121] = local234 * (float) local214;
				}
			}
		}
		this.aFloat118++;
		this.aFloat117--;
		this.aClass66_25 = new Class66(128);
		if ((this.anInt5317 & 0x10) != 0) {
			this.aClass379_2 = new Class379(this.aClass33_Sub2_12, this);
		}
	}

	@OriginalMember(owner = "client!ll", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class4_Sub5_Sub9 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub5_Sub9 arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8631 >> this.aClass33_Sub2_12.bf;
		@Pc(27) Class4_Sub5_Sub9_Sub1 local27 = (Class4_Sub5_Sub9_Sub1) arg2;
		@Pc(43) Class4_Sub5_Sub9_Sub1 local43;
		if (local27 != null && local27.method3290(local24, local24)) {
			local43 = local27;
			local27.method3291();
		} else {
			local43 = new Class4_Sub5_Sub9_Sub1(this.aClass33_Sub2_12, local24, local24);
		}
		local43.method3289(0, local24, local24, 0);
		this.method4694(local43, arg1, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!ll", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass379_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass33_Sub2_12.anInt9652 >> 8) >> this.aClass33_Sub2_12.bf;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass33_Sub2_12.anInt9680 >> 8) >> this.aClass33_Sub2_12.bf;
			this.aClass379_2.method8553(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7461(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass379_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass33_Sub2_12.anInt9652 * arg2 >> 8) >> this.aClass33_Sub2_12.bf;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass33_Sub2_12.anInt9680 >> 8) >> this.aClass33_Sub2_12.bf;
			return this.aClass379_2.method8559(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!ll", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass379_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass33_Sub2_12.anInt9652 * arg2 >> 8) >> this.aClass33_Sub2_12.bf;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass33_Sub2_12.anInt9680 >> 8) >> this.aClass33_Sub2_12.bf;
			this.aClass379_2.method8552(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4692(arg4, -1, arg1, arg2, arg0, arg5, arg3);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZIIIII[[ZB)V")
	private void method4692(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[][] arg6) {
		if (this.aClass4_Sub37Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg3 + arg3 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > Static662.anIntArray718.length) {
			Static662.anIntArray718 = new int[local14];
		}
		@Pc(26) int local26 = arg4 - arg3;
		@Pc(28) int local28 = local26;
		if (local26 < 0) {
			local26 = 0;
		}
		@Pc(40) int local40 = arg2 - arg3;
		@Pc(42) int local42 = local40;
		if (local40 < 0) {
			local40 = 0;
		}
		@Pc(51) int local51 = arg4 + arg3;
		if (local51 > super.anInt8638 - 1) {
			local51 = super.anInt8638 - 1;
		}
		@Pc(70) int local70 = arg2 + arg3;
		Static272.anInt4411 = 0;
		if (local70 > super.anInt8630 - 1) {
			local70 = super.anInt8630 - 1;
		}
		for (@Pc(89) int local89 = local26; local89 <= local51; local89++) {
			@Pc(98) boolean[] local98 = arg6[local89 - local28];
			for (@Pc(100) int local100 = local40; local100 <= local70; local100++) {
				if (local98[local100 - local42]) {
					Static662.anIntArray718[Static272.anInt4411++] = local89 + super.anInt8638 * local100;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass33_Sub2_12.method8243();
		} else {
			this.aClass33_Sub2_12.method8164((float) arg1);
			this.aClass33_Sub2_12.method8188();
		}
		this.aClass33_Sub2_12.method8266();
		this.aClass33_Sub2_12.method8213((this.anInt5317 & 0x7) != 0);
		this.aClass33_Sub2_12.method8272(false, -1, false);
		this.aClass33_Sub2_12.method8175(this.anInterface19_4, 0);
		for (@Pc(188) int local188 = 0; local188 < this.aClass4_Sub37Array1.length; local188++) {
			this.aClass4_Sub37Array1[local188].method5974(Static272.anInt4411, Static662.anIntArray718);
		}
		@Pc(209) Class92_Sub1 local209 = this.aClass33_Sub2_12.method8172();
		local209.method3854(0, -1, 0);
		this.aClass33_Sub2_12.method8232();
		if (!this.aClass163_32.method3638()) {
			@Pc(227) int local227 = this.aClass33_Sub2_12.anInt9674;
			@Pc(231) int local231 = this.aClass33_Sub2_12.anInt9645;
			this.aClass33_Sub2_12.L(0, local231, this.aClass33_Sub2_12.anInt9647);
			this.aClass33_Sub2_12.method8213(false);
			this.aClass33_Sub2_12.method8194(false);
			this.aClass33_Sub2_12.method8250(128);
			this.aClass33_Sub2_12.method8272(false, -2, false);
			this.aClass33_Sub2_12.method8159(this.aClass33_Sub2_12.anInterface14_3);
			this.aClass33_Sub2_12.method8280(Static489.aClass91_4, Static435.aClass91_3);
			this.aClass33_Sub2_12.method8239(0, Static228.aClass230_2);
			this.aClass33_Sub2_12.method8258(Static621.aClass230_4, 0);
			for (@Pc(291) Class4 local291 = this.aClass163_32.method3639(); local291 != null; local291 = this.aClass163_32.method3640()) {
				@Pc(296) Class4_Sub35 local296 = (Class4_Sub35) local291;
				local296.method5122(arg2, arg3, arg4, arg6);
			}
			this.aClass33_Sub2_12.method8239(0, Static41.aClass230_1);
			this.aClass33_Sub2_12.method8258(Static41.aClass230_1, 0);
			this.aClass33_Sub2_12.method8159((Interface14) null);
			this.aClass33_Sub2_12.L(local227, local231, this.aClass33_Sub2_12.anInt9647);
		}
		if (this.aClass379_2 != null) {
			this.aClass33_Sub2_12.method8175(this.anInterface19_4, 0);
			this.aClass33_Sub2_12.method8175(this.anInterface19_3, 1);
			this.aClass33_Sub2_12.method8179(this.aClass247_1);
			this.aClass379_2.method8551(arg6, arg2, arg3, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ll", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray13 == null) {
			this.anIntArrayArrayArray13 = new int[super.anInt8638][super.anInt8630][];
		}
		if (arg5 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt8638][super.anInt8630][];
		}
		@Pc(33) Interface9 local33 = this.aClass33_Sub2_12.anInterface9_12;
		this.anIntArrayArrayArray14[arg0][arg1] = arg2;
		this.anIntArrayArrayArray11[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray15[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray13 != null) {
			this.anIntArrayArrayArray13[arg0][arg1] = arg3;
		}
		@Pc(92) Class4_Sub37[] local92 = this.aClass4_Sub37ArrayArrayArray1[arg0][arg1] = new Class4_Sub37[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt5317 & 0x20) != 0 && local100 != -1 && local33.method1558(local100).aBoolean241) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(145) long local145 = (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) local100;
			@Pc(151) Class4 local151;
			for (local151 = this.aClass66_25.method1994(local145); local151 != null; local151 = this.aClass66_25.method1991()) {
				@Pc(156) Class4_Sub37 local156 = (Class4_Sub37) local151;
				if (local100 == local156.anInt6823 && (float) local104 == local156.aFloat160 && local156.anInt6817 == arg10 && arg11 == local156.anInt6816 && arg12 == local156.anInt6812) {
					break;
				}
			}
			if (local151 == null) {
				local92[local94] = new Class4_Sub37(this, local100, local104, arg10, arg11, arg12);
				this.aClass66_25.method1985(local92[local94], local145);
			} else {
				local92[local94] = (Class4_Sub37) local151;
			}
		}
		if (arg13) {
			this.aByteArrayArray19[arg0][arg1] = (byte) (this.aByteArrayArray19[arg0][arg1] | 0x1);
		}
		if (this.anInt5324 < arg6.length) {
			this.anInt5324 = arg6.length;
		}
		this.anInt5325 += arg6.length;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
	@Override
	public void method7449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ll", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt5325 <= 0) {
			this.aClass379_2 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt8638 + 1][super.anInt8630 + 1];
			for (@Pc(24) int local24 = 1; super.anInt8638 > local24; local24++) {
				for (@Pc(28) int local28 = 1; local28 < super.anInt8630; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray20[local24 - 1][local28] >> 2) + (this.aByteArrayArray20[local24 + 1][local28] >> 3) + (this.aByteArrayArray20[local24][local28 + -1] >> 2) + (this.aByteArrayArray20[local24][local28 + 1] >> 3) + (this.aByteArrayArray20[local24][local28] >> 1));
				}
			}
			@Pc(104) Class4_Sub37[] local104 = new Class4_Sub37[this.aClass66_25.method1990()];
			this.aClass66_25.method1986(local104);
			for (@Pc(112) int local112 = 0; local112 < local104.length; local112++) {
				local104[local112].method5972(this.anInt5325);
			}
			@Pc(128) int local128 = 20;
			if (this.anIntArrayArrayArray16 != null) {
				local128 += 4;
			}
			if ((this.anInt5317 & 0x7) != 0) {
				local128 += 12;
			}
			@Pc(148) NativeHeapBuffer local148 = this.aClass33_Sub2_12.aNativeHeap5.a(this.anInt5325 * 4, false);
			@Pc(158) NativeHeapBuffer local158 = this.aClass33_Sub2_12.aNativeHeap5.a(local128 * this.anInt5325, false);
			@Pc(163) Stream local163 = new Stream(local158);
			@Pc(168) Stream local168 = new Stream(local148);
			@Pc(172) Class4_Sub37[] local172 = new Class4_Sub37[this.anInt5325];
			@Pc(179) int local179 = Static125.method2245(this.anInt5325 / 4);
			if (local179 < 1) {
				local179 = 1;
			}
			@Pc(189) Class66 local189 = new Class66(local179);
			@Pc(193) Class4_Sub37[] local193 = new Class4_Sub37[this.anInt5324];
			@Pc(199) int local199;
			for (@Pc(195) int local195 = 0; local195 < super.anInt8638; local195++) {
				for (local199 = 0; local199 < super.anInt8630; local199++) {
					if (this.anIntArrayArrayArray12[local195][local199] != null) {
						@Pc(215) Class4_Sub37[] local215 = this.aClass4_Sub37ArrayArrayArray1[local195][local199];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray14[local195][local199];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray11[local195][local199];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray15[local195][local199];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray12[local195][local199];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray13 == null ? null : this.anIntArrayArrayArray13[local195][local199];
						if (local236 == null) {
							local236 = local243;
						}
						@Pc(271) int[] local271 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local195][local199];
						@Pc(278) float local278 = this.aFloatArrayArray14[local195][local199];
						@Pc(285) float local285 = this.aFloatArrayArray13[local195][local199];
						@Pc(292) float local292 = this.aFloatArrayArray12[local195][local199];
						@Pc(301) float local301 = this.aFloatArrayArray14[local195][local199 + 1];
						@Pc(310) float local310 = this.aFloatArrayArray13[local195][local199 + 1];
						@Pc(319) float local319 = this.aFloatArrayArray12[local195][local199 + 1];
						@Pc(330) float local330 = this.aFloatArrayArray14[local195 + 1][local199 + 1];
						@Pc(341) float local341 = this.aFloatArrayArray13[local195 + 1][local199 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray12[local195 + 1][local199 + 1];
						@Pc(361) float local361 = this.aFloatArrayArray14[local195 + 1][local199];
						@Pc(370) float local370 = this.aFloatArrayArray13[local195 + 1][local199];
						@Pc(379) float local379 = this.aFloatArrayArray12[local195 + 1][local199];
						@Pc(387) int local387 = local22[local195][local199] & 0xFF;
						@Pc(397) int local397 = local22[local195][local199 + 1] & 0xFF;
						@Pc(409) int local409 = local22[local195 + 1][local199 + 1] & 0xFF;
						@Pc(419) int local419 = local22[local195 + 1][local199] & 0xFF;
						@Pc(421) int local421 = 0;
						@Pc(431) int local431;
						label357: for (@Pc(423) int local423 = 0; local423 < local243.length; local423++) {
							@Pc(429) Class4_Sub37 local429 = local215[local423];
							for (local431 = 0; local431 < local421; local431++) {
								if (local429 == local193[local431]) {
									continue label357;
								}
							}
							local193[local421++] = local429;
						}
						@Pc(468) short[] local468 = this.aShortArrayArray12[local195 + super.anInt8638 * local199] = new short[local243.length];
						for (local431 = 0; local431 < local243.length; local431++) {
							@Pc(482) int local482 = (local195 << super.anInt8635) + local222[local431];
							@Pc(491) int local491 = (local199 << super.anInt8635) + local229[local431];
							@Pc(496) int local496 = local482 >> this.anInt5323;
							@Pc(501) int local501 = local491 >> this.anInt5323;
							@Pc(505) int local505 = local243[local431];
							@Pc(509) int local509 = local236[local431];
							@Pc(517) int local517 = local255 == null ? 0 : local255[local431];
							@Pc(535) long local535 = (long) local505 << 32 | (long) local509 << 48 | (long) (local496 << 16) | (long) local501;
							@Pc(539) int local539 = local222[local431];
							@Pc(543) int local543 = local229[local431];
							@Pc(545) byte local545 = 74;
							@Pc(547) int local547 = 0;
							@Pc(549) float local549 = 1.0F;
							@Pc(558) float local558;
							@Pc(564) float local564;
							@Pc(566) float local566;
							@Pc(654) float local654;
							@Pc(562) int local562;
							if (local539 == 0 && local543 == 0) {
								local558 = local278;
								local562 = local545 - local387;
								local564 = local285;
								local566 = local292;
							} else if (local539 == 0 && local543 == super.anInt8631) {
								local566 = local319;
								local564 = local310;
								local558 = local301;
								local562 = local545 - local397;
							} else if (super.anInt8631 == local539 && super.anInt8631 == local543) {
								local564 = local341;
								local562 = local545 - local409;
								local558 = local330;
								local566 = local352;
							} else if (super.anInt8631 == local539 && local543 == 0) {
								local562 = local545 - local419;
								local564 = local370;
								local566 = local379;
								local558 = local361;
							} else {
								@Pc(629) float local629 = (float) local539 / (float) super.anInt8631;
								@Pc(636) float local636 = (float) local543 / (float) super.anInt8631;
								@Pc(645) float local645 = local278 + local629 * (local361 - local278);
								local654 = local285 + local629 * (local370 - local285);
								@Pc(663) float local663 = (local379 - local292) * local629 + local292;
								@Pc(671) float local671 = local301 + local629 * (local330 - local301);
								@Pc(680) float local680 = (local341 - local310) * local629 + local310;
								@Pc(688) float local688 = local629 * (local352 - local319) + local319;
								local564 = local654 + (local680 - local654) * local636;
								local558 = local636 * (local671 - local645) + local645;
								local566 = local636 * (local688 - local663) + local663;
								@Pc(726) int local726 = local387 + ((local419 - local387) * local539 >> super.anInt8635);
								@Pc(738) int local738 = (local539 * (local409 - local397) >> super.anInt8635) + local397;
								local562 = local545 - local726 - (local543 * (local738 - local726) >> super.anInt8635);
							}
							if (local505 != -1) {
								@Pc(775) int local775 = (local505 & 0x7F) * local562 >> 7;
								if (local775 < 2) {
									local775 = 2;
								} else if (local775 > 126) {
									local775 = 126;
								}
								if ((this.anInt5317 & 0x7) == 0) {
									local549 = this.aClass33_Sub2_12.aFloatArray71[1] * local564 + local558 * this.aClass33_Sub2_12.aFloatArray71[0] + this.aClass33_Sub2_12.aFloatArray71[2] * local566;
									local549 = this.aClass33_Sub2_12.aFloat212 + local549 * (local549 > 0.0F ? this.aClass33_Sub2_12.aFloat217 : this.aClass33_Sub2_12.aFloat210);
								}
								local547 = Static411.anIntArray448[local775 | local505 & 0xFF80];
							}
							@Pc(846) Class4 local846 = null;
							if ((local482 & this.anInt5314 - 1) == 0 && (local491 & this.anInt5314 - 1) == 0) {
								local846 = local189.method1994(local535);
							}
							@Pc(882) int local882;
							@Pc(909) int local909;
							if (local846 == null) {
								if (local505 == local509) {
									local909 = local547;
								} else {
									@Pc(919) int local919 = (local509 & 0x7F) * local562 >> 7;
									if (local919 < 2) {
										local919 = 2;
									} else if (local919 > 126) {
										local919 = 126;
									}
									local909 = Static411.anIntArray448[local509 & 0xFF80 | local919];
									if ((this.anInt5317 & 0x7) == 0) {
										@Pc(972) float local972 = local564 * this.aClass33_Sub2_12.aFloatArray71[1] + this.aClass33_Sub2_12.aFloatArray71[0] * local558 + this.aClass33_Sub2_12.aFloatArray71[2] * local566;
										local654 = this.aClass33_Sub2_12.aFloat212 + (local549 > 0.0F ? this.aClass33_Sub2_12.aFloat217 : this.aClass33_Sub2_12.aFloat210) * local549;
										@Pc(997) int local997 = local909 >> 16 & 0xFF;
										@Pc(1003) int local1003 = local909 >> 8 & 0xFF;
										@Pc(1007) int local1007 = local909 & 0xFF;
										local997 = (int) ((float) local997 * local654);
										if (local997 < 0) {
											local997 = 0;
										} else if (local997 > 255) {
											local997 = 255;
										}
										local1003 = (int) ((float) local1003 * local654);
										local1007 = (int) ((float) local1007 * local654);
										if (local1003 < 0) {
											local1003 = 0;
										} else if (local1003 > 255) {
											local1003 = 255;
										}
										if (local1007 < 0) {
											local1007 = 0;
										} else if (local1007 > 255) {
											local1007 = 255;
										}
										local909 = local1003 << 8 | local997 << 16 | local1007;
									}
								}
								if (Stream.b()) {
									local163.a((float) local482);
									local163.a((float) (this.method7453(local482, local491) + local517));
									local163.a((float) local491);
									local163.a((float) local482);
									local163.a((float) local491);
									if (this.anIntArrayArrayArray16 != null) {
										local163.a((float) (local271 == null ? 0 : local271[local431] - 1));
									}
									if ((this.anInt5317 & 0x7) != 0) {
										local163.a(local558);
										local163.a(local564);
										local163.a(local566);
									}
								} else {
									local163.b((float) local482);
									local163.b((float) (local517 + this.method7453(local482, local491)));
									local163.b((float) local491);
									local163.b((float) local482);
									local163.b((float) local491);
									if (this.anIntArrayArrayArray16 != null) {
										local163.b((float) (local271 == null ? 0 : local271[local431] - 1));
									}
									if ((this.anInt5317 & 0x7) != 0) {
										local163.b(local558);
										local163.b(local564);
										local163.b(local566);
									}
								}
								if (this.aClass33_Sub2_12.anInt9650 == 0) {
									local168.e(local909 | 0xFF000000);
								} else {
									local168.c(local909 | 0xFF000000);
								}
								local882 = this.anInt5309++;
								local468[local431] = (short) local882;
								if (local505 != -1) {
									local172[local882] = local215[local431];
								}
								local189.method1985(new Class4_Sub36(local468[local431]), local535);
							} else {
								local468[local431] = ((Class4_Sub36) local846).aShort90;
								local882 = local468[local431] & 0xFFFF;
								if (local505 != -1 && local215[local431].aLong307 < local172[local882].aLong307) {
									local172[local882] = local215[local431];
								}
							}
							for (local909 = 0; local909 < local421; local909++) {
								local193[local909].method5977(local549, local547, local882, local562);
							}
							this.anInt5315++;
						}
					}
				}
			}
			for (local199 = 0; local199 < this.anInt5309; local199++) {
				@Pc(1292) Class4_Sub37 local1292 = local172[local199];
				if (local1292 != null) {
					local1292.method5975(local199);
				}
			}
			@Pc(1309) int local1309;
			@Pc(1328) int local1328;
			for (@Pc(1305) int local1305 = 0; local1305 < super.anInt8638; local1305++) {
				for (local1309 = 0; local1309 < super.anInt8630; local1309++) {
					@Pc(1322) short[] local1322 = this.aShortArrayArray12[local1309 * super.anInt8638 + local1305];
					if (local1322 != null) {
						@Pc(1326) int local1326 = 0;
						local1328 = 0;
						while (local1328 < local1322.length) {
							@Pc(1337) int local1337 = local1322[local1328++] & 0xFFFF;
							@Pc(1344) int local1344 = local1322[local1328++] & 0xFFFF;
							@Pc(1351) int local1351 = local1322[local1328++] & 0xFFFF;
							@Pc(1355) Class4_Sub37 local1355 = local172[local1337];
							@Pc(1359) Class4_Sub37 local1359 = local172[local1344];
							@Pc(1363) Class4_Sub37 local1363 = local172[local1351];
							@Pc(1365) Class4_Sub37 local1365 = null;
							if (local1355 != null) {
								local1365 = local1355;
								local1355.method5969(local1305, local1309, local1326);
							}
							if (local1359 != null) {
								local1359.method5969(local1305, local1309, local1326);
								if (local1365 == null || local1365.aLong307 > local1359.aLong307) {
									local1365 = local1359;
								}
							}
							if (local1363 != null) {
								local1363.method5969(local1305, local1309, local1326);
								if (local1365 == null || local1363.aLong307 < local1365.aLong307) {
									local1365 = local1363;
								}
							}
							if (local1365 != null) {
								if (local1355 != null) {
									local1365.method5975(local1337);
								}
								if (local1359 != null) {
									local1365.method5975(local1344);
								}
								if (local1363 != null) {
									local1365.method5975(local1351);
								}
								local1365.method5969(local1305, local1309, local1326);
							}
							local1326++;
						}
					}
				}
			}
			local163.c();
			local168.c();
			this.anInterface19_3 = this.aClass33_Sub2_12.method8157(false);
			this.anInterface19_3.method6565(local148, this.anInt5309 * 4, 4);
			this.anInterface19_4 = this.aClass33_Sub2_12.method8157(false);
			this.anInterface19_4.method6565(local158, this.anInt5309 * local128, local128);
			if ((this.anInt5317 & 0x7) == 0) {
				if (this.anIntArrayArrayArray16 == null) {
					this.aClass247_1 = this.aClass33_Sub2_12.method8237(new Class289[] { new Class289(new Class214[] { Static345.aClass214_1, Static345.aClass214_5 }), new Class289(Static345.aClass214_3) });
				} else {
					this.aClass247_1 = this.aClass33_Sub2_12.method8237(new Class289[] { new Class289(new Class214[] { Static345.aClass214_1, Static345.aClass214_5, Static345.aClass214_4 }), new Class289(Static345.aClass214_3) });
				}
			} else if (this.anIntArrayArrayArray16 == null) {
				this.aClass247_1 = this.aClass33_Sub2_12.method8237(new Class289[] { new Class289(new Class214[] { Static345.aClass214_1, Static345.aClass214_5, Static345.aClass214_2 }), new Class289(Static345.aClass214_3) });
			} else {
				this.aClass247_1 = this.aClass33_Sub2_12.method8237(new Class289[] { new Class289(new Class214[] { Static345.aClass214_1, Static345.aClass214_5, Static345.aClass214_4, Static345.aClass214_2 }), new Class289(Static345.aClass214_3) });
			}
			local1309 = 0;
			for (@Pc(1676) int local1676 = 0; local1676 < local104.length; local1676++) {
				if (local104[local1676].anInt6815 > 0) {
					local104[local1309++] = local104[local1676];
				}
			}
			this.aClass4_Sub37Array1 = new Class4_Sub37[local1309];
			@Pc(1706) long[] local1706 = new long[local1309];
			for (local1328 = 0; local1328 < local1309; local1328++) {
				@Pc(1714) Class4_Sub37 local1714 = local104[local1328];
				local1706[local1328] = local1714.aLong307;
				this.aClass4_Sub37Array1[local1328] = local1714;
				local1714.method5971(this.anInt5309);
			}
			Static87.method1774(local1706, this.aClass4_Sub37Array1);
			if (this.aClass379_2 != null) {
				this.aClass379_2.method8557();
			}
		}
		this.anIntArrayArrayArray16 = null;
		this.aByteArrayArray20 = null;
		this.aClass4_Sub37ArrayArrayArray1 = null;
		this.anIntArrayArrayArray14 = this.anIntArrayArrayArray11 = null;
		this.aFloatArrayArray14 = this.aFloatArrayArray13 = this.aFloatArrayArray12 = null;
		this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray15 = null;
		this.aClass66_25 = null;
		this.anIntArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!ll", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4692(arg4, arg5, arg1, arg2, arg0, arg6, arg3);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!kp;[I)V")
	@Override
	public void method7451(@OriginalArg(0) Class4_Sub29 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass163_32.method3646(new Class4_Sub35(this.aClass33_Sub2_12, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7454(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5325 <= 0) {
			return;
		}
		@Pc(16) Interface16 local16 = this.aClass33_Sub2_12.method8247(this.anInt5315);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method8364();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass33_Sub2_12.method8168(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.b()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = super.anInt8638 * local45 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray12[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local18++;
										if (local20 > local87) {
											local20 = local87;
										}
										if (local87 > local22) {
											local22 = local87;
										}
										local41.f(local87);
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt8638 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray12[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local22 < local87) {
											local22 = local87;
										}
										if (local20 > local87) {
											local20 = local87;
										}
										local41.d(local87);
										local18++;
									}
								}
							}
							local54++;
						}
					}
				}
				local41.c();
				if (local16.method8363()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass33_Sub2_12.method8240();
		this.aClass33_Sub2_12.method8197(false);
		this.aClass33_Sub2_12.method8213(false);
		this.aClass33_Sub2_12.method8205(false);
		this.aClass33_Sub2_12.method8194(false);
		this.aClass33_Sub2_12.method8250(0);
		this.aClass33_Sub2_12.method8272(false, -2, false);
		this.aClass33_Sub2_12.method8159((Interface14) null);
		@Pc(274) Class92_Sub1 local274 = this.aClass33_Sub2_12.method8172();
		@Pc(279) float[] local279 = this.aClass33_Sub2_12.method8224();
		local279[0] = (float) 1024 / ((float) this.aClass33_Sub2_12.anInt9573 * (float) super.anInt8631 * 128.0F);
		local279[6] = 0.0F;
		local279[10] = 1.0F / (this.aFloat118 - this.aFloat117);
		local279[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass33_Sub2_12.anInt9573;
		local279[7] = 0.0F;
		local279[3] = 0.0F;
		local279[9] = 0.0F;
		local279[4] = 0.0F;
		local279[15] = 1.0F;
		local279[11] = 0.0F;
		local279[2] = 0.0F;
		local279[8] = 0.0F;
		local279[1] = 0.0F;
		local279[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass33_Sub2_12.anInt9526;
		local279[5] = (float) 1024 / ((float) this.aClass33_Sub2_12.anInt9526 * (float) super.anInt8631 * 128.0F);
		local279[14] = -this.aFloat117 / (this.aFloat118 - this.aFloat117);
		local274.method2306(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
		this.aClass33_Sub2_12.method8190();
		this.aClass33_Sub2_12.method8232();
		if ((this.anInt5317 & 0x7) == 0) {
			this.aClass33_Sub2_12.method8213(false);
		} else {
			this.aClass33_Sub2_12.method8213(true);
			this.aClass33_Sub2_12.method8263();
		}
		this.aClass33_Sub2_12.method8283(false);
		this.aClass33_Sub2_12.method8175(this.anInterface19_4, 0);
		this.aClass33_Sub2_12.method8175(this.anInterface19_3, 1);
		this.aClass33_Sub2_12.method8179(this.aClass247_1);
		this.aClass33_Sub2_12.method8279(local16, local22 + 1 - local20, Static83.aClass194_13, 0, local18 / 3, local20);
		this.aClass33_Sub2_12.method8283(true);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!hk;III)V")
	private void method4694(@OriginalArg(0) Class4_Sub5_Sub9_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray14[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray11[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static333.anIntArray408.length) {
			Static333.anIntArray408 = new int[local22];
			Static10.anIntArray10 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static333.anIntArray408[local38] = local12[local38] >> this.aClass33_Sub2_12.bf;
			Static10.anIntArray10[local38] = local19[local38] >> this.aClass33_Sub2_12.bf;
		}
		@Pc(74) int local74 = 0;
		while (local22 > local74) {
			@Pc(80) int local80 = Static333.anIntArray408[local74];
			@Pc(85) int local85 = Static10.anIntArray10[local74++];
			@Pc(89) int local89 = Static333.anIntArray408[local74];
			@Pc(94) int local94 = Static10.anIntArray10[local74++];
			@Pc(98) int local98 = Static333.anIntArray408[local74];
			@Pc(103) int local103 = Static10.anIntArray10[local74++];
			if (-((local94 - local85) * (local98 - local89)) + (local94 - local103) * (local80 - local89) > 0) {
				arg0.method3288(local89, local98, local85, local80, local103, local94);
			}
		}
	}
}
