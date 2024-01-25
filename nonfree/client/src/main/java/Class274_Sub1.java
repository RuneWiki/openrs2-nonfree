import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class274_Sub1 extends Class274 {

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
	private int anInt8326;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
	private int anInt8327;

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!qh", name = "V", descriptor = "Lclient!ur;")
	private Interface27 anInterface27_7;

	@OriginalMember(owner = "client!qh", name = "W", descriptor = "Lclient!qe;")
	public Class270 aClass270_13;

	@OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
	private int anInt8343;

	@OriginalMember(owner = "client!qh", name = "Y", descriptor = "[Lclient!pga;")
	private Class3_Sub34[] aClass3_Sub34Array1;

	@OriginalMember(owner = "client!qh", name = "Z", descriptor = "I")
	private int anInt8344;

	@OriginalMember(owner = "client!qh", name = "ab", descriptor = "Lclient!qe;")
	public Class270 aClass270_14;

	@OriginalMember(owner = "client!qh", name = "gb", descriptor = "Lclient!qe;")
	public Class270 aClass270_15;

	@OriginalMember(owner = "client!qh", name = "hb", descriptor = "Lclient!qe;")
	private Class270 aClass270_16;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "Lclient!qia;")
	private final Class276 aClass276_50 = new Class276();

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
	private final int anInt8338 = this.anInt9727 - 2;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "Lclient!eq;")
	public final Class33_Sub3 aClass33_Sub3_34;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "[[B")
	private final byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!qh", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "[[S")
	public final short[][] aShortArrayArray19;

	@OriginalMember(owner = "client!qh", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	public final int anInt8325;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!qh", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
	private final int anInt8341;

	@OriginalMember(owner = "client!qh", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "[[[Lclient!pga;")
	private Class3_Sub34[][][] aClass3_Sub34ArrayArrayArray1;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!qh", name = "db", descriptor = "Lclient!sga;")
	private Class307 aClass307_41;

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "Lclient!jia;")
	private Class161 aClass161_2;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!eq;IIII[[I[[II)V")
	public Class274_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass33_Sub3_34 = arg0;
		this.aByteArrayArray18 = new byte[arg3][arg4];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aFloatArrayArray13 = new float[super.anInt9726 + 1][super.anInt9723 + 1];
		this.aShortArrayArray19 = new short[arg3 * arg4][];
		this.aByteArrayArray19 = new byte[arg3 + 1][arg4 + 1];
		this.anInt8325 = arg2;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aFloatArrayArray12 = new float[super.anInt9726 + 1][super.anInt9723 + 1];
		this.anInt8341 = 0x1 << this.anInt8338;
		this.aFloatArrayArray11 = new float[super.anInt9726 + 1][super.anInt9723 + 1];
		this.aClass3_Sub34ArrayArrayArray1 = new Class3_Sub34[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; super.anInt9723 > local115; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9726 > local119; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local137 * local137 + local154 * local154)));
				this.aFloatArrayArray12[local119][local115] = (float) local137 * local173;
				this.aFloatArrayArray13[local119][local115] = (float) (-arg7 * 2) * local173;
				this.aFloatArrayArray11[local119][local115] = local173 * (float) local154;
			}
		}
		this.aClass307_41 = new Class307(128);
		if ((this.anInt8325 & 0x10) != 0) {
			this.aClass161_2 = new Class161(this.aClass33_Sub3_34, this);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!pk;[I)V")
	@Override
	public void method8040(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass276_50.method6906(new Class3_Sub29(this.aClass33_Sub3_34, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!qh", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray19[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8036(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8344 <= 0) {
			return;
		}
		this.aClass33_Sub3_34.method3085();
		this.aClass33_Sub3_34.method3040(false);
		this.aClass33_Sub3_34.method3080(false);
		this.aClass33_Sub3_34.method3031(false);
		this.aClass33_Sub3_34.method3017(false);
		this.aClass33_Sub3_34.method3087(0);
		this.aClass33_Sub3_34.method3032(-2);
		this.aClass33_Sub3_34.method3012(null);
		Static292.aFloatArray53[11] = 0.0F;
		Static292.aFloatArray53[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass33_Sub3_34.anInt3352;
		Static292.aFloatArray53[2] = 0.0F;
		Static292.aFloatArray53[14] = 0.0F;
		Static292.aFloatArray53[4] = 0.0F;
		Static292.aFloatArray53[6] = 0.0F;
		Static292.aFloatArray53[7] = 0.0F;
		Static292.aFloatArray53[5] = (float) 1024 / ((float) this.aClass33_Sub3_34.anInt3352 * (float) super.anInt9722 * 128.0F);
		Static292.aFloatArray53[15] = 1.0F;
		Static292.aFloatArray53[0] = (float) 1024 / ((float) this.aClass33_Sub3_34.anInt3387 * 128.0F * (float) super.anInt9722);
		Static292.aFloatArray53[3] = 0.0F;
		Static292.aFloatArray53[10] = 0.0F;
		Static292.aFloatArray53[8] = 0.0F;
		Static292.aFloatArray53[1] = 0.0F;
		Static292.aFloatArray53[9] = 0.0F;
		Static292.aFloatArray53[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass33_Sub3_34.anInt3387) - 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static292.aFloatArray53, 0);
		Static292.aFloatArray53[15] = 1.0F;
		Static292.aFloatArray53[10] = 0.0F;
		Static292.aFloatArray53[8] = 0.0F;
		Static292.aFloatArray53[4] = 0.0F;
		Static292.aFloatArray53[7] = 0.0F;
		Static292.aFloatArray53[9] = 1.0F;
		Static292.aFloatArray53[1] = 0.0F;
		Static292.aFloatArray53[0] = 1.0F;
		Static292.aFloatArray53[3] = 0.0F;
		Static292.aFloatArray53[13] = 0.0F;
		Static292.aFloatArray53[11] = 0.0F;
		Static292.aFloatArray53[12] = 0.0F;
		Static292.aFloatArray53[5] = 0.0F;
		Static292.aFloatArray53[14] = 0.0F;
		Static292.aFloatArray53[6] = 1.0F;
		Static292.aFloatArray53[2] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static292.aFloatArray53, 0);
		if ((this.anInt8325 & 0x7) == 0) {
			this.aClass33_Sub3_34.method3080(false);
		} else {
			this.aClass33_Sub3_34.method3080(true);
			this.aClass33_Sub3_34.method3007();
		}
		this.aClass33_Sub3_34.method3073(this.aClass270_15, this.aClass270_14, this.aClass270_16, this.aClass270_13);
		if (this.aClass33_Sub3_34.aClass3_Sub15_Sub2_2.aByteArray106.length < this.anInt8327 * 2) {
			this.aClass33_Sub3_34.aClass3_Sub15_Sub2_2 = new Class3_Sub15_Sub2(this.anInt8327 * 2);
		} else {
			this.aClass33_Sub3_34.aClass3_Sub15_Sub2_2.anInt10282 = 0;
		}
		@Pc(319) int local319 = 0;
		@Pc(323) Class3_Sub15_Sub2 local323 = this.aClass33_Sub3_34.aClass3_Sub15_Sub2_2;
		@Pc(329) int local329;
		@Pc(339) int local339;
		@Pc(341) int local341;
		@Pc(360) short[] local360;
		@Pc(364) int local364;
		if (this.aClass33_Sub3_34.aBoolean264) {
			for (local329 = arg1; local329 < arg3; local329++) {
				local339 = super.anInt9726 * local329 + arg0;
				for (local341 = arg0; local341 < arg2; local341++) {
					if (arg4[local341 - arg0][local329 - arg1]) {
						local360 = this.aShortArrayArray19[local339];
						if (local360 != null) {
							for (local364 = 0; local364 < local360.length; local364++) {
								local323.method8464(local360[local364] & 0xFFFF);
								local319++;
							}
						}
					}
					local339++;
				}
			}
		} else {
			for (local329 = arg1; local329 < arg3; local329++) {
				local339 = arg0 + super.anInt9726 * local329;
				for (local341 = arg0; local341 < arg2; local341++) {
					if (arg4[local341 - arg0][local329 - arg1]) {
						local360 = this.aShortArrayArray19[local339];
						if (local360 != null) {
							for (local364 = 0; local364 < local360.length; local364++) {
								local319++;
								local323.method8405(local360[local364] & 0xFFFF);
							}
						}
					}
					local339++;
				}
			}
		}
		if (local319 > 0) {
			@Pc(480) Class66_Sub1 local480 = new Class66_Sub1(this.aClass33_Sub3_34, 5123, local323.aByteArray106, local323.anInt10282);
			this.aClass33_Sub3_34.method3075(local319, 0, local480);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!kw;IIB)V")
	private void method6898(@OriginalArg(0) Class3_Sub1_Sub6_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray8[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray5[arg2][arg1];
		@Pc(29) int local29 = local12.length;
		if (local29 > this.aClass33_Sub3_34.anIntArray162.length) {
			this.aClass33_Sub3_34.anIntArray161 = new int[local29];
			this.aClass33_Sub3_34.anIntArray162 = new int[local29];
		}
		@Pc(53) int[] local53 = this.aClass33_Sub3_34.anIntArray162;
		@Pc(57) int[] local57 = this.aClass33_Sub3_34.anIntArray161;
		for (@Pc(59) int local59 = 0; local59 < local29; local59++) {
			local53[local59] = local12[local59] >> this.aClass33_Sub3_34.anInt3416;
			local57[local59] = local19[local59] >> this.aClass33_Sub3_34.anInt3416;
		}
		@Pc(91) int local91 = 0;
		while (local29 > local91) {
			@Pc(97) int local97 = local53[local91];
			@Pc(102) int local102 = local57[local91++];
			@Pc(106) int local106 = local53[local91];
			@Pc(111) int local111 = local57[local91++];
			@Pc(115) int local115 = local53[local91];
			@Pc(120) int local120 = local57[local91++];
			if (-((local115 - local106) * (local111 + -local102)) + (local111 - local120) * (local97 - local106) > 0) {
				arg0.method5194(local111, local102, local106, local97, local115, local120);
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method6899(arg3, arg2, arg1, arg5, arg4, arg0, -1);
	}

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt9726][super.anInt9723][];
		}
		@Pc(21) Interface5 local21 = this.aClass33_Sub3_34.anInterface5_11;
		if (arg5 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt9726][super.anInt9723][];
		}
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub34[] local92 = this.aClass3_Sub34ArrayArrayArray1[arg0][arg1] = new Class3_Sub34[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt8325 & 0x20) != 0 && local100 != -1 && local21.method6869(local100).aBoolean497) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(149) long local149 = (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) local100;
			@Pc(155) Class3 local155;
			for (local155 = this.aClass307_41.method7424(local149); local155 != null; local155 = this.aClass307_41.method7422()) {
				@Pc(160) Class3_Sub34 local160 = (Class3_Sub34) local155;
				if (local100 == local160.anInt7881 && local160.aFloat217 == (float) local104 && local160.anInt7887 == arg10 && arg11 == local160.anInt7880 && arg12 == local160.anInt7878) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class3_Sub34(this, local100, local104, arg10, arg11, arg12);
				this.aClass307_41.method7425(local149, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub34) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray18[arg0][arg1] = (byte) (this.aByteArrayArray18[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8343) {
			this.anInt8343 = arg6.length;
		}
		this.anInt8344 += arg6.length;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8042(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass161_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass33_Sub3_34.anInt3440 * arg2 >> 8) >> this.aClass33_Sub3_34.anInt3416;
			@Pc(39) int local39 = arg3 - (this.aClass33_Sub3_34.anInt3435 * arg2 >> 8) >> this.aClass33_Sub3_34.anInt3416;
			return this.aClass161_2.method4886(local25, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!qh", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt8344 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt9726 + 1][super.anInt9723 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; local23 < super.anInt9726; local23++) {
				for (local27 = 1; super.anInt9723 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray19[local23][local27] >> 1) + (this.aByteArrayArray19[local23][local27 - 1] >> 2) + (this.aByteArrayArray19[local23 + -1][local27] >> 2) + (this.aByteArrayArray19[local23 + 1][local27] >> 3) + (this.aByteArrayArray19[local23][local27 + 1] >> 3));
				}
			}
			this.aClass3_Sub34Array1 = new Class3_Sub34[this.aClass307_41.method7420()];
			this.aClass307_41.method7426(this.aClass3_Sub34Array1);
			for (local27 = 0; local27 < this.aClass3_Sub34Array1.length; local27++) {
				this.aClass3_Sub34Array1[local27].method6596(this.anInt8344);
			}
			@Pc(135) int local135 = 24;
			if (this.anIntArrayArrayArray10 != null) {
				local135 += 4;
			}
			if ((this.anInt8325 & 0x7) != 0) {
				local135 += 12;
			}
			@Pc(158) NativeHeapBuffer local158 = this.aClass33_Sub3_34.aNativeHeap5.a(local135 * this.anInt8344, false);
			@Pc(163) Stream local163 = new Stream(local158);
			@Pc(167) Class3_Sub34[] local167 = new Class3_Sub34[this.anInt8344];
			@Pc(174) int local174 = Static51.method1165(this.anInt8344 / 4);
			if (local174 < 1) {
				local174 = 1;
			}
			@Pc(186) Class307 local186 = new Class307(local174);
			@Pc(190) Class3_Sub34[] local190 = new Class3_Sub34[this.anInt8343];
			@Pc(196) int local196;
			for (@Pc(192) int local192 = 0; local192 < super.anInt9726; local192++) {
				for (local196 = 0; super.anInt9723 > local196; local196++) {
					if (this.anIntArrayArrayArray7[local192][local196] != null) {
						@Pc(212) Class3_Sub34[] local212 = this.aClass3_Sub34ArrayArrayArray1[local192][local196];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray8[local192][local196];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray5[local192][local196];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray9[local192][local196];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray7[local192][local196];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local192][local196];
						if (local233 == null) {
							local233 = local240;
						}
						@Pc(268) int[] local268 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local192][local196];
						@Pc(275) float local275 = this.aFloatArrayArray12[local192][local196];
						@Pc(282) float local282 = this.aFloatArrayArray13[local192][local196];
						@Pc(289) float local289 = this.aFloatArrayArray11[local192][local196];
						@Pc(298) float local298 = this.aFloatArrayArray12[local192][local196 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray13[local192][local196 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray11[local192][local196 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray12[local192 + 1][local196 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray13[local192 + 1][local196 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray11[local192 + 1][local196 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray12[local192 + 1][local196];
						@Pc(367) float local367 = this.aFloatArrayArray13[local192 + 1][local196];
						@Pc(376) float local376 = this.aFloatArrayArray11[local192 + 1][local196];
						@Pc(384) int local384 = local21[local192][local196] & 0xFF;
						@Pc(394) int local394 = local21[local192][local196 + 1] & 0xFF;
						@Pc(406) int local406 = local21[local192 + 1][local196 + 1] & 0xFF;
						@Pc(416) int local416 = local21[local192 + 1][local196] & 0xFF;
						@Pc(418) int local418 = 0;
						@Pc(428) int local428;
						label335: for (@Pc(420) int local420 = 0; local420 < local240.length; local420++) {
							@Pc(426) Class3_Sub34 local426 = local212[local420];
							for (local428 = 0; local428 < local418; local428++) {
								if (local190[local428] == local426) {
									continue label335;
								}
							}
							local190[local418++] = local426;
						}
						@Pc(469) short[] local469 = this.aShortArrayArray19[super.anInt9726 * local196 + local192] = new short[local240.length];
						for (local428 = 0; local428 < local240.length; local428++) {
							@Pc(483) int local483 = (local192 << super.anInt9727) + local219[local428];
							@Pc(493) int local493 = (local196 << super.anInt9727) + local226[local428];
							@Pc(498) int local498 = local483 >> this.anInt8338;
							@Pc(503) int local503 = local493 >> this.anInt8338;
							@Pc(507) int local507 = local240[local428];
							@Pc(511) int local511 = local233[local428];
							@Pc(519) int local519 = local252 == null ? 0 : local252[local428];
							@Pc(537) long local537 = (long) local503 | (long) local507 << 32 | (long) local511 << 48 | (long) (local498 << 16);
							@Pc(541) int local541 = local219[local428];
							@Pc(545) int local545 = local226[local428];
							@Pc(547) byte local547 = 74;
							@Pc(549) int local549 = 0;
							@Pc(551) float local551 = 1.0F;
							@Pc(599) float local599;
							@Pc(601) float local601;
							@Pc(603) float local603;
							@Pc(637) float local637;
							@Pc(597) int local597;
							if (local541 == 0 && local545 == 0) {
								local597 = local547 - local384;
								local599 = local275;
								local603 = local289;
								local601 = local282;
							} else if (local541 == 0 && local545 == super.anInt9722) {
								local599 = local298;
								local601 = local307;
								local597 = local547 - local394;
								local603 = local316;
							} else if (local541 == super.anInt9722 && super.anInt9722 == local545) {
								local597 = local547 - local406;
								local599 = local327;
								local601 = local338;
								local603 = local349;
							} else if (super.anInt9722 == local541 && local545 == 0) {
								local597 = local547 - local416;
								local599 = local358;
								local601 = local367;
								local603 = local376;
							} else {
								@Pc(612) float local612 = (float) local541 / (float) super.anInt9722;
								@Pc(619) float local619 = (float) local545 / (float) super.anInt9722;
								@Pc(628) float local628 = local275 + (local358 - local275) * local612;
								local637 = (local367 - local282) * local612 + local282;
								@Pc(645) float local645 = local289 + (local376 - local289) * local612;
								@Pc(653) float local653 = local612 * (local327 - local298) + local298;
								@Pc(662) float local662 = (local338 - local307) * local612 + local307;
								@Pc(671) float local671 = local316 + (local349 - local316) * local612;
								local599 = (local653 - local628) * local619 + local628;
								local601 = local619 * (local662 - local637) + local637;
								local603 = (local671 - local645) * local619 + local645;
								@Pc(709) int local709 = ((local416 - local384) * local541 >> super.anInt9727) + local384;
								@Pc(720) int local720 = (local541 * (local406 - local394) >> super.anInt9727) + local394;
								local597 = local547 - ((local720 - local709) * local545 >> super.anInt9727) - local709;
							}
							if (local507 != -1) {
								@Pc(780) int local780 = (local507 & 0x7F) * local597 >> 7;
								if (local780 < 2) {
									local780 = 2;
								} else if (local780 > 126) {
									local780 = 126;
								}
								local549 = Static120.anIntArray152[local507 & 0xFF80 | local780];
								if ((this.anInt8325 & 0x7) == 0) {
									local551 = local599 * this.aClass33_Sub3_34.aFloatArray42[0] + this.aClass33_Sub3_34.aFloatArray42[1] * local601 + local603 * this.aClass33_Sub3_34.aFloatArray42[2];
									local551 = this.aClass33_Sub3_34.aFloat114 + local551 * (local551 > 0.0F ? this.aClass33_Sub3_34.aFloat103 : this.aClass33_Sub3_34.aFloat122);
								}
							}
							@Pc(849) Class3 local849 = null;
							if ((local483 & this.anInt8341 - 1) == 0 && (this.anInt8341 - 1 & local493) == 0) {
								local849 = local186.method7424(local537);
							}
							@Pc(1203) int local1203;
							@Pc(875) int local875;
							if (local849 == null) {
								if (local507 == local511) {
									local875 = local549;
								} else {
									@Pc(885) int local885 = local597 * (local511 & 0x7F) >> 7;
									if (local885 < 2) {
										local885 = 2;
									} else if (local885 > 126) {
										local885 = 126;
									}
									local875 = Static120.anIntArray152[local511 & 0xFF80 | local885];
									if ((this.anInt8325 & 0x7) == 0) {
										local637 = this.aClass33_Sub3_34.aFloatArray42[1] * local601 + this.aClass33_Sub3_34.aFloatArray42[0] * local599 + local603 * this.aClass33_Sub3_34.aFloatArray42[2];
										local637 = this.aClass33_Sub3_34.aFloat114 + (local551 > 0.0F ? this.aClass33_Sub3_34.aFloat103 : this.aClass33_Sub3_34.aFloat122) * local551;
										@Pc(960) int local960 = local875 >> 16 & 0xFF;
										@Pc(966) int local966 = local875 >> 8 & 0xFF;
										@Pc(970) int local970 = local875 & 0xFF;
										local960 = (int) ((float) local960 * local637);
										local966 = (int) ((float) local966 * local637);
										if (local960 < 0) {
											local960 = 0;
										} else if (local960 > 255) {
											local960 = 255;
										}
										local970 = (int) ((float) local970 * local637);
										if (local966 < 0) {
											local966 = 0;
										} else if (local966 > 255) {
											local966 = 255;
										}
										if (local970 < 0) {
											local970 = 0;
										} else if (local970 > 255) {
											local970 = 255;
										}
										local875 = local970 | local966 << 8 | local960 << 16;
									}
								}
								if (this.aClass33_Sub3_34.aBoolean264) {
									local163.a((float) local483);
									local163.a((float) (this.method8043(local493, local483) + local519));
									local163.a((float) local493);
									local163.c((byte) (local875 >> 16));
									local163.c((byte) (local875 >> 8));
									local163.c((byte) local875);
									local163.c(-1);
									local163.a((float) local483);
									local163.a((float) local493);
									if (this.anIntArrayArrayArray10 != null) {
										local163.a((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt8325 & 0x7) != 0) {
										local163.a(local599);
										local163.a(local601);
										local163.a(local603);
									}
								} else {
									local163.b((float) local483);
									local163.b((float) (local519 + this.method8043(local493, local483)));
									local163.b((float) local493);
									local163.c((byte) (local875 >> 16));
									local163.c((byte) (local875 >> 8));
									local163.c((byte) local875);
									local163.c(-1);
									local163.b((float) local483);
									local163.b((float) local493);
									if (this.anIntArrayArrayArray10 != null) {
										local163.b((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt8325 & 0x7) != 0) {
										local163.b(local599);
										local163.b(local601);
										local163.b(local603);
									}
								}
								local1203 = this.anInt8326++;
								local469[local428] = (short) local1203;
								if (local507 != -1) {
									local167[local1203] = local212[local428];
								}
								local186.method7425(local537, new Class3_Sub43(local469[local428]));
							} else {
								local469[local428] = ((Class3_Sub43) local849).aShort110;
								local1203 = local469[local428] & 0xFFFF;
								if (local507 != -1 && local212[local428].aLong277 < local167[local1203].aLong277) {
									local167[local1203] = local212[local428];
								}
							}
							for (local875 = 0; local875 < local418; local875++) {
								local190[local875].method6592(local551, local549, local1203, local597);
							}
							this.anInt8327++;
						}
					}
				}
			}
			for (local196 = 0; local196 < this.anInt8326; local196++) {
				@Pc(1320) Class3_Sub34 local1320 = local167[local196];
				if (local1320 != null) {
					local1320.method6590(local196);
				}
			}
			@Pc(1357) int local1357;
			for (@Pc(1337) int local1337 = 0; super.anInt9726 > local1337; local1337++) {
				for (@Pc(1341) int local1341 = 0; super.anInt9723 > local1341; local1341++) {
					@Pc(1353) short[] local1353 = this.aShortArrayArray19[local1337 + local1341 * super.anInt9726];
					if (local1353 != null) {
						local1357 = 0;
						@Pc(1359) int local1359 = 0;
						while (local1359 < local1353.length) {
							@Pc(1368) int local1368 = local1353[local1359++] & 0xFFFF;
							@Pc(1375) int local1375 = local1353[local1359++] & 0xFFFF;
							@Pc(1382) int local1382 = local1353[local1359++] & 0xFFFF;
							@Pc(1386) Class3_Sub34 local1386 = local167[local1368];
							@Pc(1390) Class3_Sub34 local1390 = local167[local1375];
							@Pc(1394) Class3_Sub34 local1394 = local167[local1382];
							@Pc(1396) Class3_Sub34 local1396 = null;
							if (local1386 != null) {
								local1396 = local1386;
								local1386.method6591(local1337, local1341, local1357);
							}
							if (local1390 != null) {
								local1390.method6591(local1337, local1341, local1357);
								if (local1396 == null || local1396.aLong277 > local1390.aLong277) {
									local1396 = local1390;
								}
							}
							if (local1394 != null) {
								local1394.method6591(local1337, local1341, local1357);
								if (local1396 == null || local1394.aLong277 < local1396.aLong277) {
									local1396 = local1394;
								}
							}
							if (local1396 != null) {
								if (local1386 != null) {
									local1396.method6590(local1368);
								}
								if (local1390 != null) {
									local1396.method6590(local1375);
								}
								if (local1394 != null) {
									local1396.method6590(local1382);
								}
								local1396.method6591(local1337, local1341, local1357);
							}
							local1357++;
						}
					}
				}
			}
			local163.a();
			this.anInterface27_7 = this.aClass33_Sub3_34.method3036(local135, local163.c(), local158);
			this.aClass270_14 = new Class270(this.anInterface27_7, 5126, 3, 0);
			this.aClass270_16 = new Class270(this.anInterface27_7, 5121, 4, 12);
			@Pc(1539) byte local1539;
			if (this.anIntArrayArrayArray10 == null) {
				this.aClass270_13 = new Class270(this.anInterface27_7, 5126, 2, 16);
				local1539 = 24;
			} else {
				this.aClass270_13 = new Class270(this.anInterface27_7, 5126, 3, 16);
				local1539 = 28;
			}
			if ((this.anInt8325 & 0x7) != 0) {
				this.aClass270_15 = new Class270(this.anInterface27_7, 5126, 3, local1539);
			}
			@Pc(1576) long[] local1576 = new long[this.aClass3_Sub34Array1.length];
			for (local1357 = 0; local1357 < this.aClass3_Sub34Array1.length; local1357++) {
				@Pc(1585) Class3_Sub34 local1585 = this.aClass3_Sub34Array1[local1357];
				local1576[local1357] = local1585.aLong277;
				local1585.method6594(this.anInt8326);
			}
			Static35.method696(this.aClass3_Sub34Array1, local1576);
			if (this.aClass161_2 != null) {
				this.aClass161_2.method4885();
			}
		} else {
			this.aClass161_2 = null;
		}
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass3_Sub34ArrayArrayArray1 = null;
		this.aByteArrayArray19 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass307_41 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray13 = this.aFloatArrayArray11 = null;
	}

	@OriginalMember(owner = "client!qh", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass161_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass33_Sub3_34.anInt3440 * arg2 >> 8) >> this.aClass33_Sub3_34.anInt3416;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass33_Sub3_34.anInt3435 >> 8) >> this.aClass33_Sub3_34.anInt3416;
			this.aClass161_2.method4889(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	@Override
	public void method8037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method6899(arg3, arg2, arg1, arg6, arg4, arg0, arg5);
	}

	@OriginalMember(owner = "client!qh", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass161_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass33_Sub3_34.anInt3440 * arg2 >> 8) >> this.aClass33_Sub3_34.anInt3416;
			@Pc(39) int local39 = arg3 - (this.aClass33_Sub3_34.anInt3435 * arg2 >> 8) >> this.aClass33_Sub3_34.anInt3416;
			this.aClass161_2.method4888(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!qh", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub1_Sub6 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub6 arg2) {
		if ((this.aByteArrayArray18[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9722 >> this.aClass33_Sub3_34.anInt3416;
		@Pc(27) Class3_Sub1_Sub6_Sub2 local27 = (Class3_Sub1_Sub6_Sub2) arg2;
		@Pc(43) Class3_Sub1_Sub6_Sub2 local43;
		if (local27 != null && local27.method5191(local24, local24)) {
			local43 = local27;
			local27.method5195();
		} else {
			local43 = new Class3_Sub1_Sub6_Sub2(this.aClass33_Sub3_34, local24, local24);
		}
		local43.method5192(local24, 0, 0, local24);
		this.method6898(local43, arg1, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([[ZIIIZIII)V")
	private void method6899(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub34Array1 == null) {
			return;
		}
		@Pc(25) int local25 = arg1 + arg1 + 1;
		@Pc(29) int local29 = local25 * local25;
		if (local29 > this.aClass33_Sub3_34.anIntArray163.length) {
			this.aClass33_Sub3_34.anIntArray163 = new int[local29];
		}
		if (this.anInt8327 * 2 > this.aClass33_Sub3_34.aClass3_Sub15_Sub2_2.aByteArray106.length) {
			this.aClass33_Sub3_34.aClass3_Sub15_Sub2_2 = new Class3_Sub15_Sub2(this.anInt8327 * 2);
		}
		@Pc(73) int local73 = arg5 - arg1;
		@Pc(75) int local75 = local73;
		if (local73 < 0) {
			local73 = 0;
		}
		@Pc(87) int local87 = arg2 - arg1;
		@Pc(89) int local89 = local87;
		if (local87 < 0) {
			local87 = 0;
		}
		@Pc(97) int local97 = arg1 + arg5;
		if (local97 > super.anInt9726 - 1) {
			local97 = super.anInt9726 - 1;
		}
		@Pc(112) int local112 = arg1 + arg2;
		if (local112 > super.anInt9723 - 1) {
			local112 = super.anInt9723 - 1;
		}
		@Pc(129) int local129 = 0;
		@Pc(133) int[] local133 = this.aClass33_Sub3_34.anIntArray163;
		@Pc(146) int local146;
		for (@Pc(135) int local135 = local73; local135 <= local97; local135++) {
			@Pc(144) boolean[] local144 = arg0[local135 - local75];
			for (local146 = local87; local146 <= local112; local146++) {
				if (local144[local146 - local89]) {
					local133[local129++] = local146 * super.anInt9726 + local135;
				}
			}
		}
		if (arg6 == -1) {
			this.aClass33_Sub3_34.method3018();
		} else {
			this.aClass33_Sub3_34.method3039((float) arg6);
			this.aClass33_Sub3_34.method3056();
		}
		this.aClass33_Sub3_34.method3080((this.anInt8325 & 0x7) != 0);
		for (@Pc(211) int local211 = 0; local211 < this.aClass3_Sub34Array1.length; local211++) {
			this.aClass3_Sub34Array1[local211].method6595(local129, local133);
		}
		if (!this.aClass276_50.method6908()) {
			local146 = this.aClass33_Sub3_34.anInt3436;
			@Pc(242) int local242 = this.aClass33_Sub3_34.anInt3447;
			this.aClass33_Sub3_34.L(0, local242, this.aClass33_Sub3_34.anInt3442);
			this.aClass33_Sub3_34.method3080(false);
			this.aClass33_Sub3_34.method3017(false);
			this.aClass33_Sub3_34.method3087(128);
			this.aClass33_Sub3_34.method3032(-2);
			this.aClass33_Sub3_34.method3012(this.aClass33_Sub3_34.aClass121_Sub2_1);
			this.aClass33_Sub3_34.method3057(7681, 8448);
			this.aClass33_Sub3_34.method3024(770, 34166, 0);
			this.aClass33_Sub3_34.method3081(34167, 0);
			for (@Pc(302) Class3 local302 = this.aClass276_50.method6907(); local302 != null; local302 = this.aClass276_50.method6912()) {
				@Pc(307) Class3_Sub29 local307 = (Class3_Sub29) local302;
				local307.method5362(arg1, arg2, arg0, arg5);
			}
			this.aClass33_Sub3_34.method3024(768, 5890, 0);
			this.aClass33_Sub3_34.method3081(5890, 0);
			this.aClass33_Sub3_34.method3012(null);
			this.aClass33_Sub3_34.L(local146, local242, this.aClass33_Sub3_34.anInt3442);
		}
		if (this.aClass161_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass33_Sub3_34.method3073(null, this.aClass270_14, null, this.aClass270_13);
		this.aClass161_2.method4891(arg2, arg0, arg1, arg4, arg5);
		OpenGL.glPopMatrix();
		return;
	}
}
