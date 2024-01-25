import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "I")
	private int anInt3499;

	@OriginalMember(owner = "client!eo", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
	private int anInt3511;

	@OriginalMember(owner = "client!eo", name = "X", descriptor = "Lclient!pw;")
	private Class268 aClass268_1;

	@OriginalMember(owner = "client!eo", name = "ab", descriptor = "I")
	private int anInt3514;

	@OriginalMember(owner = "client!eo", name = "bb", descriptor = "Lclient!pw;")
	public Class268 aClass268_2;

	@OriginalMember(owner = "client!eo", name = "db", descriptor = "Lclient!pw;")
	public Class268 aClass268_3;

	@OriginalMember(owner = "client!eo", name = "eb", descriptor = "Lclient!pw;")
	public Class268 aClass268_4;

	@OriginalMember(owner = "client!eo", name = "gb", descriptor = "[Lclient!ni;")
	private Class8_Sub36[] aClass8_Sub36Array1;

	@OriginalMember(owner = "client!eo", name = "hb", descriptor = "Lclient!id;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!eo", name = "jb", descriptor = "I")
	private int anInt3515;

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "Lclient!bq;")
	private final Class43 aClass43_21 = new Class43();

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "Lclient!nv;")
	public final Class16_Sub3 aClass16_Sub3_15;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	private final int anInt3491;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!eo", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!eo", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "[[[Lclient!ni;")
	private Class8_Sub36[][][] aClass8_Sub36ArrayArrayArray1;

	@OriginalMember(owner = "client!eo", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!eo", name = "P", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!eo", name = "Y", descriptor = "[[B")
	private byte[][] aByteArrayArray57;

	@OriginalMember(owner = "client!eo", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!eo", name = "W", descriptor = "I")
	public final int anInt3513;

	@OriginalMember(owner = "client!eo", name = "T", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
	private final int anInt3507;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!eo", name = "F", descriptor = "[[B")
	private final byte[][] aByteArrayArray56;

	@OriginalMember(owner = "client!eo", name = "cb", descriptor = "Lclient!pfa;")
	private Class253 aClass253_9;

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "Lclient!ou;")
	private Class244 aClass244_1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!nv;IIII[[I[[II)V")
	public Class86_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass16_Sub3_15 = arg0;
		this.anInt3491 = super.anInt9954 - 2;
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aFloatArrayArray8 = new float[super.anInt9955 + 1][super.anInt9953 + 1];
		this.aFloatArrayArray9 = new float[super.anInt9955 + 1][super.anInt9953 + 1];
		this.aClass8_Sub36ArrayArrayArray1 = new Class8_Sub36[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt9955 + 1][super.anInt9953 + 1];
		this.aShortArrayArray5 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aByteArrayArray57 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anInt3513 = arg2;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anInt3507 = 0x1 << this.anInt3491;
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aByteArrayArray56 = new byte[arg3][arg4];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9953; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9955 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + arg7 * 4 * arg7 + local138 * local138)));
				this.aFloatArrayArray8[local119][local115] = (float) local138 * local174;
				this.aFloatArrayArray9[local119][local115] = local174 * (float) (-arg7 * 2);
				this.aFloatArrayArray7[local119][local115] = (float) local155 * local174;
			}
		}
		this.aClass253_9 = new Class253(128);
		if ((this.anInt3513 & 0x10) != 0) {
			this.aClass244_1 = new Class244(this.aClass16_Sub3_15, this);
		}
	}

	@OriginalMember(owner = "client!eo", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface2 local9 = this.aClass16_Sub3_15.anInterface2_12;
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt9955][super.anInt9953][];
		}
		if (arg3 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt9955][super.anInt9953][];
		}
		this.anIntArrayArrayArray2[arg0][arg1] = arg2;
		this.anIntArrayArrayArray4[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray6[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg3;
		}
		@Pc(92) Class8_Sub36[] local92 = this.aClass8_Sub36ArrayArrayArray1[arg0][arg1] = new Class8_Sub36[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt3513 & 0x20) != 0 && local100 != -1 && local9.method4027(local100).aBoolean471) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(148) long local148 = (long) (local104 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) local100;
			@Pc(154) Class8 local154;
			for (local154 = this.aClass253_9.method6594(local148); local154 != null; local154 = this.aClass253_9.method6599()) {
				@Pc(159) Class8_Sub36 local159 = (Class8_Sub36) local154;
				if (local100 == local159.anInt6982 && (float) local104 == local159.aFloat148 && arg10 == local159.anInt6979 && arg11 == local159.anInt6971 && local159.anInt6974 == arg12) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class8_Sub36(this, local100, local104, arg10, arg11, arg12);
				this.aClass253_9.method6591(local92[local94], local148);
			} else {
				local92[local94] = (Class8_Sub36) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray56[arg0][arg1] = (byte) (this.aByteArrayArray56[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt3515) {
			this.anInt3515 = arg6.length;
		}
		this.anInt3514 += arg6.length;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2905(arg0, arg2, arg4, arg5, arg6, arg1, arg3);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2905(arg0, arg2, arg4, -1, arg5, arg1, arg3);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8084(@OriginalArg(0) Class8_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass244_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass16_Sub3_15.anInt7351 * arg2 >> 8) >> this.aClass16_Sub3_15.anInt7339;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass16_Sub3_15.anInt7375 >> 8) >> this.aClass16_Sub3_15.anInt7339;
			return this.aClass244_1.method6465(local25, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!eo", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class8_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass244_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass16_Sub3_15.anInt7351 * arg2 >> 8) >> this.aClass16_Sub3_15.anInt7339;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass16_Sub3_15.anInt7375 >> 8) >> this.aClass16_Sub3_15.anInt7339;
			this.aClass244_1.method6468(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!ada;[I)V")
	@Override
	public void method8083(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass43_21.method1424(new Class8_Sub29(this.aClass16_Sub3_15, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!eo", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class8_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass244_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass16_Sub3_15.anInt7351 * arg2 >> 8) >> this.aClass16_Sub3_15.anInt7339;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass16_Sub3_15.anInt7375 >> 8) >> this.aClass16_Sub3_15.anInt7339;
			this.aClass244_1.method6461(local38, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eo", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray57[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray57[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!eo", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class8_Sub5_Sub11 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub5_Sub11 arg2) {
		if ((this.aByteArrayArray56[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9958 >> this.aClass16_Sub3_15.anInt7339;
		@Pc(24) Class8_Sub5_Sub11_Sub1 local24 = (Class8_Sub5_Sub11_Sub1) arg2;
		@Pc(40) Class8_Sub5_Sub11_Sub1 local40;
		if (local24 != null && local24.method5552(local21, local21)) {
			local40 = local24;
			local24.method5555();
		} else {
			local40 = new Class8_Sub5_Sub11_Sub1(this.aClass16_Sub3_15, local21, local21);
		}
		local40.method5553(local21, 0, local21, 0);
		this.method2904(arg1, local40, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8079(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3514 <= 0) {
			return;
		}
		this.aClass16_Sub3_15.method6010();
		this.aClass16_Sub3_15.method5996(false);
		this.aClass16_Sub3_15.method6024(false);
		this.aClass16_Sub3_15.method5950(false);
		this.aClass16_Sub3_15.method5955(false);
		this.aClass16_Sub3_15.method6005(0);
		this.aClass16_Sub3_15.method6023(-2);
		this.aClass16_Sub3_15.method6020(null);
		Static203.aFloatArray43[2] = 0.0F;
		Static203.aFloatArray43[7] = 0.0F;
		Static203.aFloatArray43[1] = 0.0F;
		Static203.aFloatArray43[11] = 0.0F;
		Static203.aFloatArray43[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass16_Sub3_15.anInt7331) - 1.0F;
		Static203.aFloatArray43[4] = 0.0F;
		Static203.aFloatArray43[5] = (float) 1024 / ((float) this.aClass16_Sub3_15.anInt7270 * (float) super.anInt9958 * 128.0F);
		Static203.aFloatArray43[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass16_Sub3_15.anInt7270;
		Static203.aFloatArray43[0] = (float) 1024 / ((float) super.anInt9958 * 128.0F * (float) this.aClass16_Sub3_15.anInt7331);
		Static203.aFloatArray43[6] = 0.0F;
		Static203.aFloatArray43[14] = 0.0F;
		Static203.aFloatArray43[10] = 0.0F;
		Static203.aFloatArray43[3] = 0.0F;
		Static203.aFloatArray43[8] = 0.0F;
		Static203.aFloatArray43[9] = 0.0F;
		Static203.aFloatArray43[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static203.aFloatArray43, 0);
		Static203.aFloatArray43[15] = 1.0F;
		Static203.aFloatArray43[11] = 0.0F;
		Static203.aFloatArray43[9] = 1.0F;
		Static203.aFloatArray43[13] = 0.0F;
		Static203.aFloatArray43[2] = 0.0F;
		Static203.aFloatArray43[8] = 0.0F;
		Static203.aFloatArray43[0] = 1.0F;
		Static203.aFloatArray43[7] = 0.0F;
		Static203.aFloatArray43[5] = 0.0F;
		Static203.aFloatArray43[6] = 1.0F;
		Static203.aFloatArray43[12] = 0.0F;
		Static203.aFloatArray43[1] = 0.0F;
		Static203.aFloatArray43[10] = 0.0F;
		Static203.aFloatArray43[3] = 0.0F;
		Static203.aFloatArray43[14] = 0.0F;
		Static203.aFloatArray43[4] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static203.aFloatArray43, 0);
		if ((this.anInt3513 & 0x7) == 0) {
			this.aClass16_Sub3_15.method6024(false);
		} else {
			this.aClass16_Sub3_15.method6024(true);
			this.aClass16_Sub3_15.method5977();
		}
		this.aClass16_Sub3_15.method5988(this.aClass268_1, this.aClass268_4, this.aClass268_3, this.aClass268_2);
		if (this.aClass16_Sub3_15.aClass8_Sub8_Sub1_2.aByteArray107.length < this.anInt3511 * 2) {
			this.aClass16_Sub3_15.aClass8_Sub8_Sub1_2 = new Class8_Sub8_Sub1(this.anInt3511 * 2);
		} else {
			this.aClass16_Sub3_15.aClass8_Sub8_Sub1_2.anInt10588 = 0;
		}
		@Pc(318) int local318 = 0;
		@Pc(322) Class8_Sub8_Sub1 local322 = this.aClass16_Sub3_15.aClass8_Sub8_Sub1_2;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(340) int local340;
		@Pc(359) short[] local359;
		@Pc(363) int local363;
		if (this.aClass16_Sub3_15.aBoolean519) {
			for (local328 = arg1; local328 < arg3; local328++) {
				local338 = local328 * super.anInt9955 + arg0;
				for (local340 = arg0; local340 < arg2; local340++) {
					if (arg4[local340 - arg0][local328 - arg1]) {
						local359 = this.aShortArrayArray5[local338];
						if (local359 != null) {
							for (local363 = 0; local363 < local359.length; local363++) {
								local318++;
								local322.method8548(local359[local363] & 0xFFFF);
							}
						}
					}
					local338++;
				}
			}
		} else {
			for (local328 = arg1; local328 < arg3; local328++) {
				local338 = super.anInt9955 * local328 + arg0;
				for (local340 = arg0; local340 < arg2; local340++) {
					if (arg4[local340 - arg0][local328 - arg1]) {
						local359 = this.aShortArrayArray5[local338];
						if (local359 != null) {
							for (local363 = 0; local363 < local359.length; local363++) {
								local322.method8534(local359[local363] & 0xFFFF);
								local318++;
							}
						}
					}
					local338++;
				}
			}
		}
		if (local318 > 0) {
			@Pc(483) Class53_Sub1 local483 = new Class53_Sub1(this.aClass16_Sub3_15, 5123, local322.aByteArray107, local322.anInt10588);
			this.aClass16_Sub3_15.method5992(local318, local483, 0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BILclient!mt;I)V")
	private void method2904(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub5_Sub11_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int[] local20 = this.anIntArrayArrayArray2[arg2][arg0];
		@Pc(27) int[] local27 = this.anIntArrayArrayArray4[arg2][arg0];
		@Pc(30) int local30 = local20.length;
		if (local30 > this.aClass16_Sub3_15.anIntArray397.length) {
			this.aClass16_Sub3_15.anIntArray396 = new int[local30];
			this.aClass16_Sub3_15.anIntArray397 = new int[local30];
		}
		@Pc(50) int[] local50 = this.aClass16_Sub3_15.anIntArray397;
		@Pc(54) int[] local54 = this.aClass16_Sub3_15.anIntArray396;
		for (@Pc(56) int local56 = 0; local56 < local30; local56++) {
			local50[local56] = local20[local56] >> this.aClass16_Sub3_15.anInt7339;
			local54[local56] = local27[local56] >> this.aClass16_Sub3_15.anInt7339;
		}
		@Pc(88) int local88 = 0;
		while (local88 < local30) {
			@Pc(94) int local94 = local50[local88];
			@Pc(99) int local99 = local54[local88++];
			@Pc(103) int local103 = local50[local88];
			@Pc(108) int local108 = local54[local88++];
			@Pc(112) int local112 = local50[local88];
			@Pc(117) int local117 = local54[local88++];
			if (-((local108 - local99) * (local112 - local103)) + (local94 - local103) * (local108 + -local117) > 0) {
				arg1.method5554(local112, local117, local99, local103, local94, local108);
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt3514 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt9955 + 1][super.anInt9953 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; local23 < super.anInt9955; local23++) {
				for (local27 = 1; super.anInt9953 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray57[local23][local27] >> 1) + (this.aByteArrayArray57[local23 + 1][local27] >> 3) + (this.aByteArrayArray57[local23 + -1][local27] >> 2) + (this.aByteArrayArray57[local23][local27 + -1] >> 2) + (this.aByteArrayArray57[local23][local27 + 1] >> 3));
				}
			}
			this.aClass8_Sub36Array1 = new Class8_Sub36[this.aClass253_9.method6592()];
			this.aClass253_9.method6590(this.aClass8_Sub36Array1);
			for (local27 = 0; local27 < this.aClass8_Sub36Array1.length; local27++) {
				this.aClass8_Sub36Array1[local27].method5731(this.anInt3514);
			}
			@Pc(131) int local131 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local131 += 4;
			}
			if ((this.anInt3513 & 0x7) != 0) {
				local131 += 12;
			}
			@Pc(154) NativeHeapBuffer local154 = this.aClass16_Sub3_15.aNativeHeap5.a(local131 * this.anInt3514, false);
			@Pc(159) Stream local159 = new Stream(local154);
			@Pc(163) Class8_Sub36[] local163 = new Class8_Sub36[this.anInt3514];
			@Pc(170) int local170 = Static258.method4554(this.anInt3514 / 4);
			if (local170 < 1) {
				local170 = 1;
			}
			@Pc(182) Class253 local182 = new Class253(local170);
			@Pc(186) Class8_Sub36[] local186 = new Class8_Sub36[this.anInt3515];
			@Pc(192) int local192;
			for (@Pc(188) int local188 = 0; local188 < super.anInt9955; local188++) {
				for (local192 = 0; super.anInt9953 > local192; local192++) {
					if (this.anIntArrayArrayArray7[local188][local192] != null) {
						@Pc(208) Class8_Sub36[] local208 = this.aClass8_Sub36ArrayArrayArray1[local188][local192];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray2[local188][local192];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray4[local188][local192];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray6[local188][local192];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray7[local188][local192];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local188][local192];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local188][local192];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray8[local188][local192];
						@Pc(278) float local278 = this.aFloatArrayArray9[local188][local192];
						@Pc(285) float local285 = this.aFloatArrayArray7[local188][local192];
						@Pc(294) float local294 = this.aFloatArrayArray8[local188][local192 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray9[local188][local192 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray7[local188][local192 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray8[local188 + 1][local192 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray9[local188 + 1][local192 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray7[local188 + 1][local192 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray8[local188 + 1][local192];
						@Pc(363) float local363 = this.aFloatArrayArray9[local188 + 1][local192];
						@Pc(372) float local372 = this.aFloatArrayArray7[local188 + 1][local192];
						@Pc(380) int local380 = local21[local188][local192] & 0xFF;
						@Pc(390) int local390 = local21[local188][local192 + 1] & 0xFF;
						@Pc(402) int local402 = local21[local188 + 1][local192 + 1] & 0xFF;
						@Pc(412) int local412 = local21[local188 + 1][local192] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(424) int local424;
						label335: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(422) Class8_Sub36 local422 = local208[local416];
							for (local424 = 0; local424 < local414; local424++) {
								if (local186[local424] == local422) {
									continue label335;
								}
							}
							local186[local414++] = local422;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray5[local192 * super.anInt9955 + local188] = new short[local236.length];
						for (local424 = 0; local424 < local236.length; local424++) {
							@Pc(478) int local478 = (local188 << super.anInt9954) + local215[local424];
							@Pc(487) int local487 = (local192 << super.anInt9954) + local222[local424];
							@Pc(492) int local492 = local478 >> this.anInt3491;
							@Pc(497) int local497 = local487 >> this.anInt3491;
							@Pc(501) int local501 = local236[local424];
							@Pc(505) int local505 = local229[local424];
							@Pc(513) int local513 = local248 == null ? 0 : local248[local424];
							@Pc(531) long local531 = (long) local497 | (long) (local492 << 16) | (long) local505 << 48 | (long) local501 << 32;
							@Pc(535) int local535 = local215[local424];
							@Pc(539) int local539 = local222[local424];
							@Pc(541) byte local541 = 74;
							@Pc(543) int local543 = 0;
							@Pc(586) float local586;
							@Pc(578) float local578;
							@Pc(584) float local584;
							@Pc(640) float local640;
							@Pc(582) int local582;
							if (local535 == 0 && local539 == 0) {
								local584 = local285;
								local582 = local541 - local380;
								local586 = local271;
								local578 = local278;
							} else if (local535 == 0 && local539 == super.anInt9958) {
								local584 = local312;
								local582 = local541 - local390;
								local578 = local303;
								local586 = local294;
							} else if (super.anInt9958 == local535 && super.anInt9958 == local539) {
								local578 = local334;
								local582 = local541 - local402;
								local584 = local345;
								local586 = local323;
							} else if (local535 == super.anInt9958 && local539 == 0) {
								local584 = local372;
								local578 = local363;
								local582 = local541 - local412;
								local586 = local354;
							} else {
								@Pc(617) float local617 = (float) local535 / (float) super.anInt9958;
								@Pc(624) float local624 = (float) local539 / (float) super.anInt9958;
								@Pc(632) float local632 = local271 + (local354 - local271) * local617;
								local640 = (local363 - local278) * local617 + local278;
								@Pc(649) float local649 = local285 + local617 * (local372 - local285);
								@Pc(658) float local658 = local617 * (local323 - local294) + local294;
								@Pc(667) float local667 = local303 + (local334 - local303) * local617;
								local586 = (local658 - local632) * local624 + local632;
								@Pc(683) float local683 = (local345 - local312) * local617 + local312;
								local578 = local640 + (local667 - local640) * local624;
								local584 = local649 + local624 * (local683 - local649);
								@Pc(712) int local712 = local380 + (local535 * (local412 - local380) >> super.anInt9954);
								@Pc(724) int local724 = (local535 * (local402 - local390) >> super.anInt9954) + local390;
								local582 = local541 - local712 - ((local724 - local712) * local539 >> super.anInt9954);
							}
							@Pc(764) float local764 = 1.0F;
							if (local501 != -1) {
								@Pc(775) int local775 = local582 * (local501 & 0x7F) >> 7;
								if (local775 < 2) {
									local775 = 2;
								} else if (local775 > 126) {
									local775 = 126;
								}
								local543 = Static77.anIntArray92[local775 | local501 & 0xFF80];
								if ((this.anInt3513 & 0x7) == 0) {
									local764 = this.aClass16_Sub3_15.aFloatArray64[0] * local586 + this.aClass16_Sub3_15.aFloatArray64[1] * local578 + this.aClass16_Sub3_15.aFloatArray64[2] * local584;
									local764 = this.aClass16_Sub3_15.aFloat169 + local764 * (local764 > 0.0F ? this.aClass16_Sub3_15.aFloat163 : this.aClass16_Sub3_15.aFloat165);
								}
							}
							@Pc(847) Class8 local847 = null;
							if ((this.anInt3507 - 1 & local478) == 0 && (local487 & this.anInt3507 - 1) == 0) {
								local847 = local182.method6594(local531);
							}
							@Pc(1203) int local1203;
							@Pc(873) int local873;
							if (local847 == null) {
								if (local505 == local501) {
									local873 = local543;
								} else {
									@Pc(883) int local883 = local582 * (local505 & 0x7F) >> 7;
									if (local883 < 2) {
										local883 = 2;
									} else if (local883 > 126) {
										local883 = 126;
									}
									local873 = Static77.anIntArray92[local505 & 0xFF80 | local883];
									if ((this.anInt3513 & 0x7) == 0) {
										local640 = this.aClass16_Sub3_15.aFloatArray64[2] * local584 + local578 * this.aClass16_Sub3_15.aFloatArray64[1] + this.aClass16_Sub3_15.aFloatArray64[0] * local586;
										local640 = this.aClass16_Sub3_15.aFloat169 + (local764 > 0.0F ? this.aClass16_Sub3_15.aFloat163 : this.aClass16_Sub3_15.aFloat165) * local764;
										@Pc(960) int local960 = local873 >> 16 & 0xFF;
										@Pc(966) int local966 = local873 >> 8 & 0xFF;
										@Pc(970) int local970 = local873 & 0xFF;
										local960 = (int) ((float) local960 * local640);
										if (local960 < 0) {
											local960 = 0;
										} else if (local960 > 255) {
											local960 = 255;
										}
										local966 = (int) ((float) local966 * local640);
										if (local966 < 0) {
											local966 = 0;
										} else if (local966 > 255) {
											local966 = 255;
										}
										local970 = (int) ((float) local970 * local640);
										if (local970 < 0) {
											local970 = 0;
										} else if (local970 > 255) {
											local970 = 255;
										}
										local873 = local970 | local960 << 16 | local966 << 8;
									}
								}
								if (this.aClass16_Sub3_15.aBoolean519) {
									local159.a((float) local478);
									local159.a((float) (local513 + this.method8088(local487, local478)));
									local159.a((float) local487);
									local159.b((byte) (local873 >> 16));
									local159.b((byte) (local873 >> 8));
									local159.b((byte) local873);
									local159.b(-1);
									local159.a((float) local478);
									local159.a((float) local487);
									if (this.anIntArrayArrayArray5 != null) {
										local159.a((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt3513 & 0x7) != 0) {
										local159.a(local586);
										local159.a(local578);
										local159.a(local584);
									}
								} else {
									local159.b((float) local478);
									local159.b((float) (local513 + this.method8088(local487, local478)));
									local159.b((float) local487);
									local159.b((byte) (local873 >> 16));
									local159.b((byte) (local873 >> 8));
									local159.b((byte) local873);
									local159.b(-1);
									local159.b((float) local478);
									local159.b((float) local487);
									if (this.anIntArrayArrayArray5 != null) {
										local159.b((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt3513 & 0x7) != 0) {
										local159.b(local586);
										local159.b(local578);
										local159.b(local584);
									}
								}
								local1203 = this.anInt3499++;
								local465[local424] = (short) local1203;
								if (local501 != -1) {
									local163[local1203] = local208[local424];
								}
								local182.method6591(new Class8_Sub38(local465[local424]), local531);
							} else {
								local465[local424] = ((Class8_Sub38) local847).aShort79;
								local1203 = local465[local424] & 0xFFFF;
								if (local501 != -1 && local163[local1203].aLong285 > local208[local424].aLong285) {
									local163[local1203] = local208[local424];
								}
							}
							for (local873 = 0; local873 < local414; local873++) {
								local186[local873].method5733(local543, local582, local764, local1203);
							}
							this.anInt3511++;
						}
					}
				}
			}
			for (local192 = 0; local192 < this.anInt3499; local192++) {
				@Pc(1324) Class8_Sub36 local1324 = local163[local192];
				if (local1324 != null) {
					local1324.method5735(local192);
				}
			}
			@Pc(1358) int local1358;
			for (@Pc(1337) int local1337 = 0; local1337 < super.anInt9955; local1337++) {
				for (@Pc(1341) int local1341 = 0; super.anInt9953 > local1341; local1341++) {
					@Pc(1354) short[] local1354 = this.aShortArrayArray5[super.anInt9955 * local1341 + local1337];
					if (local1354 != null) {
						local1358 = 0;
						@Pc(1360) int local1360 = 0;
						while (local1354.length > local1360) {
							@Pc(1369) int local1369 = local1354[local1360++] & 0xFFFF;
							@Pc(1376) int local1376 = local1354[local1360++] & 0xFFFF;
							@Pc(1383) int local1383 = local1354[local1360++] & 0xFFFF;
							@Pc(1387) Class8_Sub36 local1387 = local163[local1369];
							@Pc(1391) Class8_Sub36 local1391 = local163[local1376];
							@Pc(1395) Class8_Sub36 local1395 = local163[local1383];
							@Pc(1397) Class8_Sub36 local1397 = null;
							if (local1387 != null) {
								local1387.method5732(local1358, local1337, local1341);
								local1397 = local1387;
							}
							if (local1391 != null) {
								local1391.method5732(local1358, local1337, local1341);
								if (local1397 == null || local1391.aLong285 < local1397.aLong285) {
									local1397 = local1391;
								}
							}
							if (local1395 != null) {
								local1395.method5732(local1358, local1337, local1341);
								if (local1397 == null || local1395.aLong285 < local1397.aLong285) {
									local1397 = local1395;
								}
							}
							if (local1397 != null) {
								if (local1387 != null) {
									local1397.method5735(local1369);
								}
								if (local1391 != null) {
									local1397.method5735(local1376);
								}
								if (local1395 != null) {
									local1397.method5735(local1383);
								}
								local1397.method5732(local1358, local1337, local1341);
							}
							local1358++;
						}
					}
				}
			}
			local159.b();
			this.anInterface9_1 = this.aClass16_Sub3_15.method6006(local131, local159.a(), local154);
			this.aClass268_2 = new Class268(this.anInterface9_1, 5126, 3, 0);
			this.aClass268_1 = new Class268(this.anInterface9_1, 5121, 4, 12);
			@Pc(1536) byte local1536;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass268_3 = new Class268(this.anInterface9_1, 5126, 2, 16);
				local1536 = 24;
			} else {
				local1536 = 28;
				this.aClass268_3 = new Class268(this.anInterface9_1, 5126, 3, 16);
			}
			if ((this.anInt3513 & 0x7) != 0) {
				this.aClass268_4 = new Class268(this.anInterface9_1, 5126, 3, local1536);
			}
			@Pc(1573) long[] local1573 = new long[this.aClass8_Sub36Array1.length];
			for (local1358 = 0; local1358 < this.aClass8_Sub36Array1.length; local1358++) {
				@Pc(1582) Class8_Sub36 local1582 = this.aClass8_Sub36Array1[local1358];
				local1573[local1358] = local1582.aLong285;
				local1582.method5728(this.anInt3499);
			}
			Static213.method4050(this.aClass8_Sub36Array1, local1573);
			if (this.aClass244_1 != null) {
				this.aClass244_1.method6466();
			}
		} else {
			this.aClass244_1 = null;
		}
		this.aClass253_9 = null;
		this.anIntArrayArrayArray7 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray9 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray5 = null;
		this.aByteArrayArray57 = null;
		this.anIntArrayArrayArray2 = this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass8_Sub36ArrayArrayArray1 = null;
		this.anIntArrayArrayArray3 = null;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIBZIII[[Z)V")
	private void method2905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[][] arg6) {
		if (this.aClass8_Sub36Array1 == null) {
			return;
		}
		@Pc(33) int local33 = arg1 + arg1 + 1;
		@Pc(37) int local37 = local33 * local33;
		if (this.aClass16_Sub3_15.anIntArray395.length < local37) {
			this.aClass16_Sub3_15.anIntArray395 = new int[local37];
		}
		if (this.anInt3511 * 2 > this.aClass16_Sub3_15.aClass8_Sub8_Sub1_2.aByteArray107.length) {
			this.aClass16_Sub3_15.aClass8_Sub8_Sub1_2 = new Class8_Sub8_Sub1(this.anInt3511 * 2);
		}
		@Pc(77) int local77 = arg0 - arg1;
		@Pc(79) int local79 = local77;
		if (local77 < 0) {
			local77 = 0;
		}
		@Pc(90) int local90 = arg5 - arg1;
		@Pc(92) int local92 = local90;
		if (local90 < 0) {
			local90 = 0;
		}
		@Pc(103) int local103 = arg1 + arg0;
		if (local103 > super.anInt9955 - 1) {
			local103 = super.anInt9955 - 1;
		}
		@Pc(118) int local118 = arg1 + arg5;
		if (super.anInt9953 - 1 < local118) {
			local118 = super.anInt9953 - 1;
		}
		@Pc(131) int local131 = 0;
		@Pc(135) int[] local135 = this.aClass16_Sub3_15.anIntArray395;
		@Pc(147) int local147;
		for (@Pc(137) int local137 = local77; local137 <= local103; local137++) {
			@Pc(145) boolean[] local145 = arg6[local137 - local79];
			for (local147 = local90; local147 <= local118; local147++) {
				if (local145[local147 - local92]) {
					local135[local131++] = local137 + super.anInt9955 * local147;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass16_Sub3_15.method5965();
		} else {
			this.aClass16_Sub3_15.method5973((float) arg3);
			this.aClass16_Sub3_15.method5956();
		}
		this.aClass16_Sub3_15.method6024((this.anInt3513 & 0x7) != 0);
		for (@Pc(214) int local214 = 0; local214 < this.aClass8_Sub36Array1.length; local214++) {
			this.aClass8_Sub36Array1[local214].method5734(local131, local135);
		}
		if (!this.aClass43_21.method1420()) {
			local147 = this.aClass16_Sub3_15.anInt7367;
			@Pc(247) int local247 = this.aClass16_Sub3_15.anInt7365;
			this.aClass16_Sub3_15.L(0, local247, this.aClass16_Sub3_15.anInt7382);
			this.aClass16_Sub3_15.method6024(false);
			this.aClass16_Sub3_15.method5955(false);
			this.aClass16_Sub3_15.method6005(128);
			this.aClass16_Sub3_15.method6023(-2);
			this.aClass16_Sub3_15.method6020(this.aClass16_Sub3_15.aClass20_Sub4_5);
			this.aClass16_Sub3_15.method5957(8448, 7681);
			this.aClass16_Sub3_15.method6025(770, 0, 34166);
			this.aClass16_Sub3_15.method6029(0, 34167);
			for (@Pc(307) Class8 local307 = this.aClass43_21.method1422(); local307 != null; local307 = this.aClass43_21.method1426()) {
				@Pc(312) Class8_Sub29 local312 = (Class8_Sub29) local307;
				local312.method4382(arg5, arg1, arg0, arg6);
			}
			this.aClass16_Sub3_15.method6025(768, 0, 5890);
			this.aClass16_Sub3_15.method6029(0, 5890);
			this.aClass16_Sub3_15.method6020(null);
			this.aClass16_Sub3_15.L(local147, local247, this.aClass16_Sub3_15.anInt7382);
		}
		if (this.aClass244_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass16_Sub3_15.method5988(null, null, this.aClass268_3, this.aClass268_2);
		this.aClass244_1.method6460(arg1, arg2, arg5, arg6, arg0);
		OpenGL.glPopMatrix();
		return;
	}
}
