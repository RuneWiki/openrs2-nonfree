import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class157_Sub2 extends Class157 {

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
	private int anInt6294;

	@OriginalMember(owner = "client!sp", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!sp", name = "W", descriptor = "I")
	private int anInt6310;

	@OriginalMember(owner = "client!sp", name = "ab", descriptor = "I")
	private int anInt6313;

	@OriginalMember(owner = "client!sp", name = "bb", descriptor = "Lclient!se;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!sp", name = "eb", descriptor = "Lclient!tp;")
	public Class238 aClass238_10;

	@OriginalMember(owner = "client!sp", name = "gb", descriptor = "Lclient!tp;")
	private Class238 aClass238_11;

	@OriginalMember(owner = "client!sp", name = "hb", descriptor = "Lclient!tp;")
	public Class238 aClass238_12;

	@OriginalMember(owner = "client!sp", name = "ib", descriptor = "I")
	private int anInt6314;

	@OriginalMember(owner = "client!sp", name = "lb", descriptor = "Lclient!tp;")
	public Class238 lb;

	@OriginalMember(owner = "client!sp", name = "mb", descriptor = "[Lclient!wn;")
	private Class1_Sub44[] aClass1_Sub44Array1;

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Lclient!sr;")
	private final Class227 aClass227_38 = new Class227();

	@OriginalMember(owner = "client!sp", name = "T", descriptor = "[[I")
	private final int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
	private final int anInt6306;

	@OriginalMember(owner = "client!sp", name = "Z", descriptor = "Lclient!ur;")
	public final Class34_Sub2 aClass34_Sub2_34;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!sp", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!sp", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
	private final int anInt6290;

	@OriginalMember(owner = "client!sp", name = "K", descriptor = "[[[Lclient!wn;")
	private Class1_Sub44[][][] aClass1_Sub44ArrayArrayArray1;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!sp", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "[[B")
	private final byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
	public final int anInt6296;

	@OriginalMember(owner = "client!sp", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!sp", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!sp", name = "V", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!sp", name = "kb", descriptor = "Lclient!qh;")
	private Class199 aClass199_164;

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "Lclient!ru;")
	private Class217 aClass217_2;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!ur;IIII[[I[[II)V")
	public Class157_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray57 = arg5;
		this.anInt6306 = super.anInt6279 - 2;
		this.aClass34_Sub2_34 = arg0;
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt6283 + 1][super.anInt6286 + 1];
		this.aFloatArrayArray5 = new float[super.anInt6283 + 1][super.anInt6286 + 1];
		this.anInt6290 = 0x1 << this.anInt6306;
		this.aClass1_Sub44ArrayArrayArray1 = new Class1_Sub44[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt6283 + 1][super.anInt6286 + 1];
		this.aByteArrayArray26 = new byte[arg3][arg4];
		this.anInt6296 = arg2;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aShortArrayArray10 = new short[arg4 * arg3][];
		this.aByteArrayArray27 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt6286 > local117; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt6283; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + arg7 * arg7 * 4 + local140 * local140)));
				this.aFloatArrayArray7[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray6[local121][local117] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray5[local121][local117] = (float) local157 * local176;
			}
		}
		this.aClass199_164 = new Class199(128);
		if ((this.anInt6296 & 0x10) != 0) {
			this.aClass217_2 = new Class217(this.aClass34_Sub2_34, this);
		}
	}

	@OriginalMember(owner = "client!sp", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray57[arg0][arg1];
	}

	@OriginalMember(owner = "client!sp", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class1_Sub5_Sub10 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub5_Sub10 arg2) {
		if ((this.aByteArrayArray26[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt6284 >> this.aClass34_Sub2_34.anInt7072;
		@Pc(27) Class1_Sub5_Sub10_Sub1 local27 = (Class1_Sub5_Sub10_Sub1) arg2;
		@Pc(37) Class1_Sub5_Sub10_Sub1 local37;
		if (local27 != null && local27.method4691(local24, local24)) {
			local37 = local27;
			local27.method4687();
		} else {
			local37 = new Class1_Sub5_Sub10_Sub1(this.aClass34_Sub2_34, local24, local24);
		}
		local37.method4688(0, local24, local24, 0);
		this.method4956(local37, arg0, arg1);
		return local37;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4950(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6314 <= 0) {
			return;
		}
		this.aClass34_Sub2_34.method5529();
		this.aClass34_Sub2_34.method5555(false);
		this.aClass34_Sub2_34.method5487(false);
		this.aClass34_Sub2_34.method5492(false);
		this.aClass34_Sub2_34.method5546(false);
		this.aClass34_Sub2_34.method5536(0);
		this.aClass34_Sub2_34.method5556(-2);
		this.aClass34_Sub2_34.method5493(null);
		Static126.aFloatArray7[8] = 0.0F;
		Static126.aFloatArray7[3] = 0.0F;
		Static126.aFloatArray7[11] = 0.0F;
		Static126.aFloatArray7[14] = 0.0F;
		Static126.aFloatArray7[10] = 0.0F;
		Static126.aFloatArray7[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass34_Sub2_34.anInt6906;
		Static126.aFloatArray7[2] = 0.0F;
		Static126.aFloatArray7[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass34_Sub2_34.anInt6997) - 1.0F;
		Static126.aFloatArray7[4] = 0.0F;
		Static126.aFloatArray7[5] = (float) 1024 / ((float) this.aClass34_Sub2_34.anInt6906 * (float) super.anInt6284 * 128.0F);
		Static126.aFloatArray7[9] = 0.0F;
		Static126.aFloatArray7[7] = 0.0F;
		Static126.aFloatArray7[1] = 0.0F;
		Static126.aFloatArray7[6] = 0.0F;
		Static126.aFloatArray7[15] = 1.0F;
		Static126.aFloatArray7[0] = (float) 1024 / ((float) super.anInt6284 * 128.0F * (float) this.aClass34_Sub2_34.anInt6997);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static126.aFloatArray7, 0);
		Static126.aFloatArray7[12] = 0.0F;
		Static126.aFloatArray7[15] = 1.0F;
		Static126.aFloatArray7[3] = 0.0F;
		Static126.aFloatArray7[5] = 0.0F;
		Static126.aFloatArray7[2] = 0.0F;
		Static126.aFloatArray7[0] = 1.0F;
		Static126.aFloatArray7[1] = 0.0F;
		Static126.aFloatArray7[6] = 1.0F;
		Static126.aFloatArray7[7] = 0.0F;
		Static126.aFloatArray7[10] = 0.0F;
		Static126.aFloatArray7[4] = 0.0F;
		Static126.aFloatArray7[13] = 0.0F;
		Static126.aFloatArray7[11] = 0.0F;
		Static126.aFloatArray7[9] = 1.0F;
		Static126.aFloatArray7[14] = 0.0F;
		Static126.aFloatArray7[8] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static126.aFloatArray7, 0);
		if ((this.anInt6296 & 0x7) == 0) {
			this.aClass34_Sub2_34.method5487(false);
		} else {
			this.aClass34_Sub2_34.method5487(true);
			this.aClass34_Sub2_34.method5553();
		}
		this.aClass34_Sub2_34.method5550(this.aClass238_10, this.lb, this.aClass238_11, this.aClass238_12);
		if (this.aClass34_Sub2_34.aClass1_Sub28_Sub2_3.aByteArray86.length < this.anInt6294 * 2) {
			this.aClass34_Sub2_34.aClass1_Sub28_Sub2_3 = new Class1_Sub28_Sub2(this.anInt6294 * 2);
		} else {
			this.aClass34_Sub2_34.aClass1_Sub28_Sub2_3.anInt6812 = 0;
		}
		@Pc(311) int local311 = 0;
		@Pc(315) Class1_Sub28_Sub2 local315 = this.aClass34_Sub2_34.aClass1_Sub28_Sub2_3;
		@Pc(321) int local321;
		@Pc(330) int local330;
		@Pc(332) int local332;
		@Pc(351) short[] local351;
		@Pc(355) int local355;
		if (this.aClass34_Sub2_34.aBoolean751) {
			for (local321 = arg1; local321 < arg3; local321++) {
				local330 = super.anInt6283 * local321 + arg0;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local321 - arg1]) {
						local351 = this.aShortArrayArray10[local330];
						if (local351 != null) {
							for (local355 = 0; local355 < local351.length; local355++) {
								local311++;
								local315.method5393(local351[local355] & 0xFFFF);
							}
						}
					}
					local330++;
				}
			}
		} else {
			for (local321 = arg1; local321 < arg3; local321++) {
				local330 = arg0 + super.anInt6283 * local321;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local321 - arg1]) {
						local351 = this.aShortArrayArray10[local330];
						if (local351 != null) {
							for (local355 = 0; local355 < local351.length; local355++) {
								local315.method5383(local351[local355] & 0xFFFF);
								local311++;
							}
						}
					}
					local330++;
				}
			}
		}
		if (local311 > 0) {
			@Pc(471) Class56_Sub1 local471 = new Class56_Sub1(this.aClass34_Sub2_34, 5123, local315.aByteArray86, local315.anInt6812);
			this.aClass34_Sub2_34.method5504(local311, 0, local471);
		}
	}

	@OriginalMember(owner = "client!sp", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt6279;
		@Pc(13) int local13 = arg1 >> super.anInt6279;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt6283 - 1 || local13 > super.anInt6286 - 1) {
			return 0;
		}
		@Pc(48) int local48 = arg0 & super.anInt6284 - 1;
		@Pc(55) int local55 = arg1 & super.anInt6284 - 1;
		@Pc(82) int local82 = (super.anInt6284 - local48) * this.anIntArrayArray57[local8][local13] + local48 * this.anIntArrayArray57[local8 + 1][local13] >> super.anInt6279;
		@Pc(113) int local113 = this.anIntArrayArray57[local8 + 1][local13 + 1] * local48 + this.anIntArrayArray57[local8][local13 + 1] * (super.anInt6284 - local48) >> super.anInt6279;
		return local55 * local113 + local82 * (super.anInt6284 - local55) >> super.anInt6279;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([[ZZIIIII)V")
	private void method4954(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.aClass1_Sub44Array1 == null) {
			return;
		}
		@Pc(24) float local24 = this.aClass34_Sub2_34.aFloat101;
		@Pc(28) float local28 = this.aClass34_Sub2_34.aFloat90;
		@Pc(35) int local35 = arg3 + arg3 + 1;
		@Pc(39) int local39 = local35 * local35;
		if (local39 > this.aClass34_Sub2_34.anIntArray465.length) {
			this.aClass34_Sub2_34.anIntArray465 = new int[local39];
		}
		if (this.anInt6294 * 2 > this.aClass34_Sub2_34.aClass1_Sub28_Sub2_3.aByteArray86.length) {
			this.aClass34_Sub2_34.aClass1_Sub28_Sub2_3 = new Class1_Sub28_Sub2(this.anInt6294 * 2);
		}
		@Pc(75) int local75 = arg4 - arg3;
		@Pc(77) int local77 = local75;
		if (local75 < 0) {
			local75 = 0;
		}
		@Pc(89) int local89 = arg2 - arg3;
		@Pc(91) int local91 = local89;
		if (local89 < 0) {
			local89 = 0;
		}
		@Pc(102) int local102 = arg3 + arg4;
		if (super.anInt6283 - 1 < local102) {
			local102 = super.anInt6283 - 1;
		}
		@Pc(121) int local121 = arg2 + arg3;
		if (local121 > super.anInt6286 - 1) {
			local121 = super.anInt6286 - 1;
		}
		@Pc(134) int local134 = 0;
		@Pc(138) int[] local138 = this.aClass34_Sub2_34.anIntArray465;
		@Pc(151) int local151;
		for (@Pc(140) int local140 = local75; local140 <= local102; local140++) {
			@Pc(149) boolean[] local149 = arg0[local140 - local77];
			for (local151 = local89; local151 <= local121; local151++) {
				if (local149[local151 - local91]) {
					local138[local134++] = local140 + local151 * super.anInt6283;
				}
			}
		}
		this.aClass34_Sub2_34.method5539();
		this.aClass34_Sub2_34.method5487((this.anInt6296 & 0x7) != 0);
		for (@Pc(215) int local215 = 0; local215 < this.aClass1_Sub44Array1.length; local215++) {
			this.aClass1_Sub44Array1[local215].method5884(local138, local134);
		}
		if (!this.aClass227_38.method4976()) {
			local151 = this.aClass34_Sub2_34.anInt7114;
			@Pc(244) int local244 = this.aClass34_Sub2_34.anInt7095;
			this.aClass34_Sub2_34.Q(0, local244, this.aClass34_Sub2_34.anInt7089);
			this.aClass34_Sub2_34.da(local28, local24 - 4.0F);
			this.aClass34_Sub2_34.method5487(false);
			this.aClass34_Sub2_34.method5546(false);
			this.aClass34_Sub2_34.method5536(128);
			this.aClass34_Sub2_34.method5556(-2);
			this.aClass34_Sub2_34.method5493(this.aClass34_Sub2_34.aClass10_Sub1_5);
			this.aClass34_Sub2_34.method5526(8448, 7681);
			this.aClass34_Sub2_34.method5486(34166, 0, 770);
			this.aClass34_Sub2_34.method5534(0, 34167);
			for (@Pc(315) Class1 local315 = this.aClass227_38.method4967(); local315 != null; local315 = this.aClass227_38.method4973()) {
				@Pc(320) Class1_Sub8 local320 = (Class1_Sub8) local315;
				local320.method581(arg3, arg2, arg4, arg0);
			}
			this.aClass34_Sub2_34.method5486(5890, 0, 768);
			this.aClass34_Sub2_34.method5534(0, 5890);
			this.aClass34_Sub2_34.method5493(null);
			this.aClass34_Sub2_34.Q(local151, local244, this.aClass34_Sub2_34.anInt7089);
		}
		if (this.aClass217_2 != null) {
			this.aClass34_Sub2_34.da(local28, local24 - 8.0F);
			this.aClass34_Sub2_34.method5539();
			this.aClass34_Sub2_34.method5550(this.aClass238_10, this.lb, null, null);
			this.aClass217_2.method4813(arg4, arg0, arg1, arg2, arg3);
		}
		this.aClass34_Sub2_34.da(local28, local24);
	}

	@OriginalMember(owner = "client!sp", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class1_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass217_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass34_Sub2_34.anInt7111 * arg2 >> 8) >> this.aClass34_Sub2_34.anInt7072;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass34_Sub2_34.anInt7083 >> 8) >> this.aClass34_Sub2_34.anInt7072;
			this.aClass217_2.method4815(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class1_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass217_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass34_Sub2_34.anInt7111 * arg2 >> 8) >> this.aClass34_Sub2_34.anInt7072;
			@Pc(38) int local38 = arg3 - (this.aClass34_Sub2_34.anInt7083 * arg2 >> 8) >> this.aClass34_Sub2_34.anInt7072;
			this.aClass217_2.method4816(local38, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.pa(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!sp", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt6283][super.anInt6286][];
		}
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt6283][super.anInt6286][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray10[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray11[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub44[] local88 = this.aClass1_Sub44ArrayArrayArray1[arg0][arg1] = new Class1_Sub44[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class1 local125;
			for (local125 = this.aClass199_164.method4387(local119); local125 != null; local125 = this.aClass199_164.method4389()) {
				@Pc(130) Class1_Sub44 local130 = (Class1_Sub44) local125;
				if (arg8[local90] == local130.anInt7447 && local130.aFloat107 == (float) arg9[local90] && arg10 == local130.anInt7448 && local130.anInt7442 == arg11 && local130.anInt7443 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub44(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass199_164.method4383(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub44) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray26[arg0][arg1] = (byte) (this.aByteArrayArray26[arg0][arg1] | 0x1);
		}
		if (this.anInt6313 < arg6.length) {
			this.anInt6313 = arg6.length;
		}
		this.anInt6314 += arg6.length;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method4954(arg3, arg4, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method4946(@OriginalArg(0) Class1_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass217_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass34_Sub2_34.anInt7111 >> 8) >> this.aClass34_Sub2_34.anInt7072;
			@Pc(39) int local39 = arg3 - (this.aClass34_Sub2_34.anInt7083 * arg2 >> 8) >> this.aClass34_Sub2_34.anInt7072;
			return this.aClass217_2.method4811(local39, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!re;III)V")
	private void method4956(@OriginalArg(0) Class1_Sub5_Sub10_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray10[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass34_Sub2_34.anIntArray466.length) {
			this.aClass34_Sub2_34.anIntArray467 = new int[local22];
			this.aClass34_Sub2_34.anIntArray466 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass34_Sub2_34.anIntArray466;
		@Pc(46) int[] local46 = this.aClass34_Sub2_34.anIntArray467;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = (local12[local48] & 0xFF) >> this.aClass34_Sub2_34.anInt7072;
			local46[local48] = (local19[local48] & 0xFF) >> this.aClass34_Sub2_34.anInt7072;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local22) {
			@Pc(105) int local105 = local42[local80];
			@Pc(110) int local110 = local46[local80++];
			@Pc(114) int local114 = local42[local80];
			@Pc(119) int local119 = local46[local80++];
			@Pc(123) int local123 = local42[local80];
			@Pc(128) int local128 = local46[local80++];
			if (-((local119 - local110) * (-local114 + local123)) + (local119 - local128) * (local105 + -local114) > 0) {
				arg0.method4689(local128, local105, local119, local110, local123, local114);
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		if (this.anInt6314 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt6283 + 1][super.anInt6286 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; super.anInt6283 > local16; local16++) {
				for (local20 = 1; super.anInt6286 > local20; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray27[local16][local20 + 1] >> 3) + (this.aByteArrayArray27[local16 - 1][local20] >> 2) + (this.aByteArrayArray27[local16 + 1][local20] >> 3) + (this.aByteArrayArray27[local16][local20 + -1] >> 2) + (this.aByteArrayArray27[local16][local20] >> 1));
				}
			}
			this.aClass1_Sub44Array1 = new Class1_Sub44[this.aClass199_164.method4390()];
			this.aClass199_164.method4391(this.aClass1_Sub44Array1);
			for (local20 = 0; local20 < this.aClass1_Sub44Array1.length; local20++) {
				this.aClass1_Sub44Array1[local20].method5888(this.anInt6314);
			}
			@Pc(124) int local124 = 24;
			if (this.anIntArrayArrayArray9 != null) {
				local124 += 4;
			}
			if ((this.anInt6296 & 0x7) != 0) {
				local124 += 12;
			}
			@Pc(143) NativeBuffer local143 = this.aClass34_Sub2_34.aNativeHeap2.a(local124 * this.anInt6314);
			@Pc(148) NativeStream local148 = new NativeStream(local143);
			@Pc(152) Class1_Sub44[] local152 = new Class1_Sub44[this.anInt6314];
			@Pc(159) int local159 = Static322.method4327(this.anInt6314 / 4);
			if (local159 < 1) {
				local159 = 1;
			}
			@Pc(171) Class199 local171 = new Class199(local159);
			@Pc(175) Class1_Sub44[] local175 = new Class1_Sub44[this.anInt6313];
			@Pc(181) int local181;
			for (@Pc(177) int local177 = 0; super.anInt6283 > local177; local177++) {
				for (local181 = 0; local181 < super.anInt6286; local181++) {
					if (this.anIntArrayArrayArray8[local177][local181] != null) {
						@Pc(197) Class1_Sub44[] local197 = this.aClass1_Sub44ArrayArrayArray1[local177][local181];
						@Pc(204) int[] local204 = this.anIntArrayArrayArray7[local177][local181];
						@Pc(211) int[] local211 = this.anIntArrayArrayArray10[local177][local181];
						@Pc(218) int[] local218 = this.anIntArrayArrayArray11[local177][local181];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray8[local177][local181];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local177][local181];
						if (local218 == null) {
							local218 = local225;
						}
						@Pc(253) int[] local253 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local177][local181];
						@Pc(260) float local260 = this.aFloatArrayArray7[local177][local181];
						@Pc(267) float local267 = this.aFloatArrayArray6[local177][local181];
						@Pc(274) float local274 = this.aFloatArrayArray5[local177][local181];
						@Pc(283) float local283 = this.aFloatArrayArray7[local177][local181 + 1];
						@Pc(292) float local292 = this.aFloatArrayArray6[local177][local181 + 1];
						@Pc(301) float local301 = this.aFloatArrayArray5[local177][local181 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray7[local177 + 1][local181 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray6[local177 + 1][local181 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray5[local177 + 1][local181 + 1];
						@Pc(343) float local343 = this.aFloatArrayArray7[local177 + 1][local181];
						@Pc(352) float local352 = this.aFloatArrayArray6[local177 + 1][local181];
						@Pc(361) float local361 = this.aFloatArrayArray5[local177 + 1][local181];
						@Pc(369) int local369 = local14[local177][local181] & 0xFF;
						@Pc(379) int local379 = local14[local177][local181 + 1] & 0xFF;
						@Pc(391) int local391 = local14[local177 + 1][local181 + 1] & 0xFF;
						@Pc(401) int local401 = local14[local177 + 1][local181] & 0xFF;
						@Pc(403) int local403 = 0;
						@Pc(413) int local413;
						label335: for (@Pc(405) int local405 = 0; local405 < local225.length; local405++) {
							@Pc(411) Class1_Sub44 local411 = local197[local405];
							for (local413 = 0; local413 < local403; local413++) {
								if (local175[local413] == local411) {
									continue label335;
								}
							}
							local175[local403++] = local411;
						}
						@Pc(458) short[] local458 = this.aShortArrayArray10[local177 + super.anInt6283 * local181] = new short[local225.length];
						for (local413 = 0; local413 < local225.length; local413++) {
							@Pc(472) int local472 = (local177 << super.anInt6279) + local204[local413];
							@Pc(481) int local481 = (local181 << super.anInt6279) + local211[local413];
							@Pc(486) int local486 = local472 >> this.anInt6306;
							@Pc(491) int local491 = local481 >> this.anInt6306;
							@Pc(495) int local495 = local225[local413];
							@Pc(499) int local499 = local218[local413];
							@Pc(507) int local507 = local237 == null ? 0 : local237[local413];
							@Pc(525) long local525 = (long) local499 << 48 | (long) local495 << 32 | (long) (local486 << 16) | (long) local491;
							@Pc(529) int local529 = local204[local413];
							@Pc(533) int local533 = local211[local413];
							@Pc(535) byte local535 = 74;
							@Pc(537) int local537 = 0;
							@Pc(539) float local539 = 1.0F;
							@Pc(569) float local569;
							@Pc(563) float local563;
							@Pc(561) float local561;
							@Pc(620) float local620;
							@Pc(567) int local567;
							if (local529 == 0 && local533 == 0) {
								local561 = local274;
								local567 = local535 - local369;
								local569 = local260;
								local563 = local267;
							} else if (local529 == 0 && local533 == super.anInt6284) {
								local561 = local301;
								local563 = local292;
								local567 = local535 - local379;
								local569 = local283;
							} else if (local529 == super.anInt6284 && local533 == super.anInt6284) {
								local561 = local334;
								local563 = local323;
								local567 = local535 - local391;
								local569 = local312;
							} else if (local529 == super.anInt6284 && local533 == 0) {
								local563 = local352;
								local567 = local535 - local401;
								local569 = local343;
								local561 = local361;
							} else {
								@Pc(596) float local596 = (float) local529 / (float) super.anInt6284;
								@Pc(603) float local603 = (float) local533 / (float) super.anInt6284;
								@Pc(612) float local612 = local260 + (local343 - local260) * local596;
								local620 = local267 + (local352 - local267) * local596;
								@Pc(628) float local628 = local274 + (local361 - local274) * local596;
								@Pc(637) float local637 = (local312 - local283) * local596 + local283;
								@Pc(646) float local646 = local596 * (local323 - local292) + local292;
								local569 = (local637 - local612) * local603 + local612;
								@Pc(663) float local663 = local301 + local596 * (local334 - local301);
								local563 = local603 * (local646 - local620) + local620;
								local561 = local628 + (local663 - local628) * local603;
								@Pc(693) int local693 = local369 + ((local401 - local369) * local529 >> super.anInt6279);
								@Pc(705) int local705 = local379 + ((local391 - local379) * local529 >> super.anInt6279);
								local567 = local535 - ((local705 - local693) * local533 >> super.anInt6279) - local693;
							}
							if (local495 != -1) {
								@Pc(766) int local766 = local567 * (local495 & 0x7F) >> 7;
								if (local766 < 2) {
									local766 = 2;
								} else if (local766 > 126) {
									local766 = 126;
								}
								local537 = Static160.anIntArray183[local495 & 0xFF80 | local766];
								if ((this.anInt6296 & 0x7) == 0) {
									local539 = this.aClass34_Sub2_34.aFloatArray28[0] * local569 + this.aClass34_Sub2_34.aFloatArray28[1] * local563 + this.aClass34_Sub2_34.aFloatArray28[2] * local561;
									local539 = this.aClass34_Sub2_34.aFloat83 + local539 * (local539 > 0.0F ? this.aClass34_Sub2_34.aFloat95 : this.aClass34_Sub2_34.aFloat94);
								}
							}
							@Pc(839) Class1 local839 = null;
							if ((local472 & this.anInt6290 - 1) == 0 && (local481 & this.anInt6290 - 1) == 0) {
								local839 = local171.method4387(local525);
							}
							@Pc(872) int local872;
							@Pc(903) int local903;
							if (local839 == null) {
								if (local499 == local495) {
									local903 = local537;
								} else {
									@Pc(913) int local913 = (local499 & 0x7F) * local567 >> 7;
									if (local913 < 2) {
										local913 = 2;
									} else if (local913 > 126) {
										local913 = 126;
									}
									local903 = Static160.anIntArray183[local913 | local499 & 0xFF80];
									if ((this.anInt6296 & 0x7) == 0) {
										local620 = local561 * this.aClass34_Sub2_34.aFloatArray28[2] + this.aClass34_Sub2_34.aFloatArray28[0] * local569 + this.aClass34_Sub2_34.aFloatArray28[1] * local563;
										local620 = this.aClass34_Sub2_34.aFloat83 + (local539 > 0.0F ? this.aClass34_Sub2_34.aFloat95 : this.aClass34_Sub2_34.aFloat94) * local539;
										@Pc(988) int local988 = local903 >> 16 & 0xFF;
										@Pc(994) int local994 = local903 >> 8 & 0xFF;
										local988 = (int) ((float) local988 * local620);
										@Pc(1004) int local1004 = local903 & 0xFF;
										local994 = (int) ((float) local994 * local620);
										if (local988 < 0) {
											local988 = 0;
										} else if (local988 > 255) {
											local988 = 255;
										}
										if (local994 < 0) {
											local994 = 0;
										} else if (local994 > 255) {
											local994 = 255;
										}
										local1004 = (int) ((float) local1004 * local620);
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										local903 = local1004 | local988 << 16 | local994 << 8;
									}
								}
								if (this.aClass34_Sub2_34.aBoolean751) {
									local148.b((float) local472);
									local148.b((float) (local507 + this.ca(local472, local481)));
									local148.b((float) local481);
									local148.b((byte) (local903 >> 16));
									local148.b((byte) (local903 >> 8));
									local148.b((byte) local903);
									local148.b(-1);
									local148.b((float) local472);
									local148.b((float) local481);
									if (this.anIntArrayArrayArray9 != null) {
										local148.b((float) (local253 == null ? 0 : local253[local413] - 1));
									}
									if ((this.anInt6296 & 0x7) != 0) {
										local148.b(local569);
										local148.b(local563);
										local148.b(local561);
									}
								} else {
									local148.a((float) local472);
									local148.a((float) (local507 + this.ca(local472, local481)));
									local148.a((float) local481);
									local148.b((byte) (local903 >> 16));
									local148.b((byte) (local903 >> 8));
									local148.b((byte) local903);
									local148.b(-1);
									local148.a((float) local472);
									local148.a((float) local481);
									if (this.anIntArrayArrayArray9 != null) {
										local148.a((float) (local253 == null ? 0 : local253[local413] - 1));
									}
									if ((this.anInt6296 & 0x7) != 0) {
										local148.a(local569);
										local148.a(local563);
										local148.a(local561);
									}
								}
								local872 = this.anInt6310++;
								local458[local413] = (short) local872;
								if (local495 != -1) {
									local152[local872] = local197[local413];
								}
								local171.method4383(local525, new Class1_Sub39(local458[local413]));
							} else {
								local458[local413] = ((Class1_Sub39) local839).aShort106;
								local872 = local458[local413] & 0xFFFF;
								if (local495 != -1 && local197[local413].aLong230 < local152[local872].aLong230) {
									local152[local872] = local197[local413];
								}
							}
							for (local903 = 0; local903 < local403; local903++) {
								local175[local903].method5887(local537, local567, local539, local872);
							}
							this.anInt6294++;
						}
					}
				}
			}
			for (local181 = 0; local181 < this.anInt6310; local181++) {
				@Pc(1301) Class1_Sub44 local1301 = local152[local181];
				if (local1301 != null) {
					local1301.method5886(local181);
				}
			}
			@Pc(1334) int local1334;
			for (@Pc(1314) int local1314 = 0; super.anInt6283 > local1314; local1314++) {
				for (@Pc(1318) int local1318 = 0; local1318 < super.anInt6286; local1318++) {
					@Pc(1330) short[] local1330 = this.aShortArrayArray10[local1314 + local1318 * super.anInt6283];
					if (local1330 != null) {
						local1334 = 0;
						@Pc(1336) int local1336 = 0;
						while (local1336 < local1330.length) {
							@Pc(1345) int local1345 = local1330[local1336++] & 0xFFFF;
							@Pc(1352) int local1352 = local1330[local1336++] & 0xFFFF;
							@Pc(1359) int local1359 = local1330[local1336++] & 0xFFFF;
							@Pc(1363) Class1_Sub44 local1363 = local152[local1345];
							@Pc(1367) Class1_Sub44 local1367 = local152[local1352];
							@Pc(1371) Class1_Sub44 local1371 = local152[local1359];
							@Pc(1373) Class1_Sub44 local1373 = null;
							if (local1363 != null) {
								local1373 = local1363;
								local1363.method5881(local1334, local1318, local1314);
							}
							if (local1367 != null) {
								local1367.method5881(local1334, local1318, local1314);
								if (local1373 == null || local1367.aLong230 < local1373.aLong230) {
									local1373 = local1367;
								}
							}
							if (local1371 != null) {
								local1371.method5881(local1334, local1318, local1314);
								if (local1373 == null || local1371.aLong230 < local1373.aLong230) {
									local1373 = local1371;
								}
							}
							if (local1373 != null) {
								if (local1363 != null) {
									local1373.method5886(local1345);
								}
								if (local1367 != null) {
									local1373.method5886(local1352);
								}
								if (local1371 != null) {
									local1373.method5886(local1359);
								}
								local1373.method5881(local1334, local1318, local1314);
							}
							local1334++;
						}
					}
				}
			}
			local148.b();
			this.anInterface10_4 = this.aClass34_Sub2_34.method5544(local148.a(), local124, local143);
			this.aClass238_10 = new Class238(this.anInterface10_4, 5126, 3, 0);
			this.aClass238_11 = new Class238(this.anInterface10_4, 5121, 4, 12);
			@Pc(1506) byte local1506;
			if (this.anIntArrayArrayArray9 == null) {
				this.lb = new Class238(this.anInterface10_4, 5126, 2, 16);
				local1506 = 24;
			} else {
				local1506 = 28;
				this.lb = new Class238(this.anInterface10_4, 5126, 3, 16);
			}
			if ((this.anInt6296 & 0x7) != 0) {
				this.aClass238_12 = new Class238(this.anInterface10_4, 5126, 3, local1506);
			}
			@Pc(1550) long[] local1550 = new long[this.aClass1_Sub44Array1.length];
			for (local1334 = 0; local1334 < this.aClass1_Sub44Array1.length; local1334++) {
				@Pc(1559) Class1_Sub44 local1559 = this.aClass1_Sub44Array1[local1334];
				local1550[local1334] = local1559.aLong230;
				local1559.method5883(this.anInt6310);
			}
			Static165.method2381(this.aClass1_Sub44Array1, local1550);
			if (this.aClass217_2 != null) {
				this.aClass217_2.method4810();
			}
		} else {
			this.aClass217_2 = null;
		}
		this.aClass1_Sub44ArrayArrayArray1 = null;
		this.anIntArrayArrayArray8 = null;
		this.aByteArrayArray27 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray6 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray6 = this.aFloatArrayArray5 = null;
		this.aClass199_164 = null;
		this.anIntArrayArrayArray7 = this.anIntArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!bn;[I)V")
	@Override
	public void method4948(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass227_38.method4972(new Class1_Sub8(this.aClass34_Sub2_34, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!sp", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray27[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray27[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)V")
	@Override
	public void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
