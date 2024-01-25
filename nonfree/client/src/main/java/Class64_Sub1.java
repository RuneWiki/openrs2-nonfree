import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!eh", name = "R", descriptor = "[J")
	public static final long[] aLongArray1 = new long[256];

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
	private int anInt1957;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
	private int anInt1966;

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
	private int anInt1969;

	@OriginalMember(owner = "client!eh", name = "W", descriptor = "Lclient!tp;")
	public Class225 aClass225_5;

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "[Lclient!uo;")
	private Class3_Sub42[] aClass3_Sub42Array1;

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "Lclient!tp;")
	public Class225 aClass225_6;

	@OriginalMember(owner = "client!eh", name = "ab", descriptor = "Lclient!hh;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!eh", name = "bb", descriptor = "Lclient!tp;")
	public Class225 aClass225_7;

	@OriginalMember(owner = "client!eh", name = "cb", descriptor = "Lclient!tp;")
	private Class225 aClass225_8;

	@OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
	private int anInt1970;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "Lclient!tu;")
	private final Class229 aClass229_9 = new Class229();

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
	private final int anInt1968;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Lclient!gk;")
	public final Class75_Sub2 aClass75_Sub2_11;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
	private final int anInt1965;

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "[[S")
	public final short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!eh", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
	public final int anInt1951;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!eh", name = "gb", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "[[B")
	private final byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "[[[Lclient!uo;")
	private Class3_Sub42[][][] aClass3_Sub42ArrayArrayArray1;

	@OriginalMember(owner = "client!eh", name = "fb", descriptor = "Lclient!jr;")
	private Class127 aClass127_8;

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "Lclient!hv;")
	private Class104 aClass104_1;

	static {
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(31) long local31 = (long) local27;
			for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
				if ((local31 & 0x1L) == 1L) {
					local31 = local31 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local31 >>>= 0x1;
				}
			}
			aLongArray1[local27] = local31;
		}
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!gk;IIII[[I[[II)V")
	public Class64_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray22 = arg5;
		this.anInt1968 = super.anInt7004 - 2;
		this.aClass75_Sub2_11 = arg0;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anInt1965 = 0x1 << this.anInt1968;
		this.aShortArrayArray2 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt7006 + 1][super.anInt7005 + 1];
		this.anInt1951 = arg2;
		this.aFloatArrayArray2 = new float[super.anInt7006 + 1][super.anInt7005 + 1];
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
		this.aByteArrayArray6 = new byte[arg3][arg4];
		this.aFloatArrayArray1 = new float[super.anInt7006 + 1][super.anInt7005 + 1];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aClass3_Sub42ArrayArrayArray1 = new Class3_Sub42[arg3][arg4][];
		for (@Pc(117) int local117 = 1; local117 < super.anInt7005; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt7006; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(155) int local155 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local139 * local139 + arg7 * 4 * arg7 + local155 * local155)));
				this.aFloatArrayArray1[local121][local117] = (float) local139 * local175;
				this.aFloatArrayArray2[local121][local117] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray3[local121][local117] = (float) local155 * local175;
			}
		}
		this.aClass127_8 = new Class127(128);
		if ((this.anInt1951 & 0x10) != 0) {
			this.aClass104_1 = new Class104(this.aClass75_Sub2_11, this);
		}
	}

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass104_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass75_Sub2_11.anInt3113 * arg2 >> 8) >> this.aClass75_Sub2_11.anInt3078;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass75_Sub2_11.anInt3118 >> 8) >> this.aClass75_Sub2_11.anInt3078;
			this.aClass104_1.method2894(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method5438(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass104_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass75_Sub2_11.anInt3113 * arg2 >> 8) >> this.aClass75_Sub2_11.anInt3078;
			@Pc(40) int local40 = arg3 - (this.aClass75_Sub2_11.anInt3118 * arg2 >> 8) >> this.aClass75_Sub2_11.anInt3078;
			return this.aClass104_1.method2893(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!cb;II)V")
	private void method1581(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray3[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray8[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (Static442.anIntArray572.length < local22) {
			Static442.anIntArray572 = new int[local22];
			Static349.anIntArray566 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static442.anIntArray572[local38] = (local12[local38] & 0xFF) >> this.aClass75_Sub2_11.anInt3078;
			Static349.anIntArray566[local38] = (local19[local38] & 0xFF) >> this.aClass75_Sub2_11.anInt3078;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local22) {
			@Pc(86) int local86 = Static442.anIntArray572[local80];
			@Pc(91) int local91 = Static349.anIntArray566[local80++];
			@Pc(95) int local95 = Static442.anIntArray572[local80];
			@Pc(100) int local100 = Static349.anIntArray566[local80++];
			@Pc(104) int local104 = Static442.anIntArray572[local80];
			@Pc(109) int local109 = Static349.anIntArray566[local80++];
			if ((local100 - local109) * (-local95 + local86) - (local104 - local95) * (local100 - local91) > 0) {
				arg1.method995(local100, local91, local86, local95, local109, local104);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	@Override
	public void method5445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eh", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt7006][super.anInt7005][];
		}
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt7006][super.anInt7005][];
		}
		this.anIntArrayArrayArray3[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray4[arg0][arg1] = arg6;
		this.anIntArrayArrayArray6[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub42[] local88 = this.aClass3_Sub42ArrayArrayArray1[arg0][arg1] = new Class3_Sub42[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg8[local90];
			@Pc(125) Class3 local125;
			for (local125 = this.aClass127_8.method3246(local119); local125 != null; local125 = this.aClass127_8.method3254()) {
				@Pc(130) Class3_Sub42 local130 = (Class3_Sub42) local125;
				if (arg8[local90] == local130.anInt7085 && local130.aFloat94 == (float) arg9[local90] && local130.anInt7081 == arg10 && local130.anInt7078 == arg11 && arg12 == local130.anInt7084) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub42(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass127_8.method3257(local119, local88[local90]);
			} else {
				local88[local90] = (Class3_Sub42) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray6[arg0][arg1] = (byte) (this.aByteArrayArray6[arg0][arg1] | 0x1);
		}
		if (this.anInt1970 < arg6.length) {
			this.anInt1970 = arg6.length;
		}
		this.anInt1969 += arg6.length;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.JA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method1582(arg0, arg3, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5444(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1969 <= 0) {
			return;
		}
		this.aClass75_Sub2_11.method2461();
		this.aClass75_Sub2_11.method2451(false);
		this.aClass75_Sub2_11.method2482(false);
		this.aClass75_Sub2_11.method2485(false);
		this.aClass75_Sub2_11.method2467(false);
		this.aClass75_Sub2_11.method2445(0);
		this.aClass75_Sub2_11.method2440(-2);
		this.aClass75_Sub2_11.method2456(null);
		Static67.aFloatArray11[14] = 0.0F;
		Static67.aFloatArray11[9] = 0.0F;
		Static67.aFloatArray11[5] = (float) 1024 / ((float) this.aClass75_Sub2_11.anInt3074 * 128.0F * (float) super.anInt7007);
		Static67.aFloatArray11[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass75_Sub2_11.anInt3074;
		Static67.aFloatArray11[8] = 0.0F;
		Static67.aFloatArray11[6] = 0.0F;
		Static67.aFloatArray11[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass75_Sub2_11.anInt3032) - 1.0F;
		Static67.aFloatArray11[3] = 0.0F;
		Static67.aFloatArray11[11] = 0.0F;
		Static67.aFloatArray11[7] = 0.0F;
		Static67.aFloatArray11[15] = 1.0F;
		Static67.aFloatArray11[1] = 0.0F;
		Static67.aFloatArray11[10] = 0.0F;
		Static67.aFloatArray11[4] = 0.0F;
		Static67.aFloatArray11[2] = 0.0F;
		Static67.aFloatArray11[0] = (float) 1024 / ((float) this.aClass75_Sub2_11.anInt3032 * (float) super.anInt7007 * 128.0F);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static67.aFloatArray11, 0);
		Static67.aFloatArray11[10] = 0.0F;
		Static67.aFloatArray11[12] = 0.0F;
		Static67.aFloatArray11[9] = 1.0F;
		Static67.aFloatArray11[14] = 0.0F;
		Static67.aFloatArray11[4] = 0.0F;
		Static67.aFloatArray11[11] = 0.0F;
		Static67.aFloatArray11[5] = 0.0F;
		Static67.aFloatArray11[15] = 1.0F;
		Static67.aFloatArray11[7] = 0.0F;
		Static67.aFloatArray11[1] = 0.0F;
		Static67.aFloatArray11[6] = 1.0F;
		Static67.aFloatArray11[3] = 0.0F;
		Static67.aFloatArray11[0] = 1.0F;
		Static67.aFloatArray11[2] = 0.0F;
		Static67.aFloatArray11[8] = 0.0F;
		Static67.aFloatArray11[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static67.aFloatArray11, 0);
		if ((this.anInt1951 & 0x7) == 0) {
			this.aClass75_Sub2_11.method2482(false);
		} else {
			this.aClass75_Sub2_11.method2482(true);
			this.aClass75_Sub2_11.method2413();
		}
		this.aClass75_Sub2_11.method2473(this.aClass225_7, this.aClass225_6, this.aClass225_8, this.aClass225_5);
		if (this.anInt1957 * 2 <= Static82.aClass3_Sub2_5.aByteArray95.length) {
			Static82.aClass3_Sub2_5.anInt7620 = 0;
		} else {
			Static82.aClass3_Sub2_5 = new Class3_Sub2(this.anInt1957 * 2);
		}
		@Pc(308) int local308 = 0;
		@Pc(314) int local314;
		@Pc(323) int local323;
		@Pc(325) int local325;
		@Pc(344) short[] local344;
		@Pc(348) int local348;
		if (this.aClass75_Sub2_11.aBoolean228) {
			for (local314 = arg1; local314 < arg3; local314++) {
				local323 = super.anInt7006 * local314 + arg0;
				for (local325 = arg0; local325 < arg2; local325++) {
					if (arg4[local325 - arg0][local314 - arg1]) {
						local344 = this.aShortArrayArray2[local323];
						if (local344 != null) {
							for (local348 = 0; local348 < local344.length; local348++) {
								local308++;
								Static82.aClass3_Sub2_5.method6045(local344[local348] & 0xFFFF);
							}
						}
					}
					local323++;
				}
			}
		} else {
			for (local314 = arg1; local314 < arg3; local314++) {
				local323 = super.anInt7006 * local314 + arg0;
				for (local325 = arg0; local325 < arg2; local325++) {
					if (arg4[local325 - arg0][local314 - arg1]) {
						local344 = this.aShortArrayArray2[local323];
						if (local344 != null) {
							for (local348 = 0; local348 < local344.length; local348++) {
								local308++;
								Static82.aClass3_Sub2_5.method6000(local344[local348] & 0xFFFF);
							}
						}
					}
					local323++;
				}
			}
		}
		if (local308 > 0) {
			@Pc(460) Class85_Sub1 local460 = new Class85_Sub1(this.aClass75_Sub2_11, 5123, Static82.aClass3_Sub2_5.aByteArray95, Static82.aClass3_Sub2_5.anInt7620);
			this.aClass75_Sub2_11.method2454(0, local460, local308);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[[ZIZIZ)V")
	private void method1582(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass3_Sub42Array1 == null) {
			return;
		}
		@Pc(16) float local16 = this.aClass75_Sub2_11.aFloat34;
		@Pc(20) float local20 = this.aClass75_Sub2_11.aFloat46;
		@Pc(27) int local27 = arg3 + arg3 + 1;
		@Pc(31) int local31 = local27 * local27;
		if (local31 > Static368.anIntArray468.length) {
			Static368.anIntArray468 = new int[local31];
		}
		if (this.anInt1957 * 2 > Static82.aClass3_Sub2_5.aByteArray95.length) {
			Static82.aClass3_Sub2_5 = new Class3_Sub2(this.anInt1957 * 2);
		}
		@Pc(67) int local67 = arg0 - arg3;
		@Pc(69) int local69 = local67;
		if (local67 < 0) {
			local67 = 0;
		}
		@Pc(81) int local81 = arg2 - arg3;
		@Pc(83) int local83 = local81;
		if (local81 < 0) {
			local81 = 0;
		}
		@Pc(91) int local91 = arg0 + arg3;
		if (local91 > super.anInt7006 - 1) {
			local91 = super.anInt7006 - 1;
		}
		@Pc(106) int local106 = arg3 + arg2;
		Static28.anInt783 = 0;
		if (local106 > super.anInt7005 - 1) {
			local106 = super.anInt7005 - 1;
		}
		@Pc(136) int local136;
		for (@Pc(125) int local125 = local67; local125 <= local91; local125++) {
			@Pc(134) boolean[] local134 = arg1[local125 - local69];
			for (local136 = local81; local136 <= local106; local136++) {
				if (local134[local136 - local83]) {
					Static368.anIntArray468[Static28.anInt783++] = super.anInt7006 * local136 + local125;
				}
			}
		}
		this.aClass75_Sub2_11.method2478();
		this.aClass75_Sub2_11.method2482((this.anInt1951 & 0x7) != 0);
		for (@Pc(206) int local206 = 0; local206 < this.aClass3_Sub42Array1.length; local206++) {
			this.aClass3_Sub42Array1[local206].method5496(Static28.anInt783, Static368.anIntArray468);
		}
		if (!this.aClass229_9.method5317()) {
			local136 = this.aClass75_Sub2_11.anInt3087;
			@Pc(239) int local239 = this.aClass75_Sub2_11.anInt3117;
			this.aClass75_Sub2_11.V(0, local239, this.aClass75_Sub2_11.anInt3089);
			this.aClass75_Sub2_11.o(local20, local16 - 4.0F);
			this.aClass75_Sub2_11.method2482(false);
			this.aClass75_Sub2_11.method2467(false);
			this.aClass75_Sub2_11.method2445(128);
			this.aClass75_Sub2_11.method2440(-2);
			this.aClass75_Sub2_11.method2456(this.aClass75_Sub2_11.aClass42_Sub1_1);
			this.aClass75_Sub2_11.method2479(8448, 7681);
			this.aClass75_Sub2_11.method2466(34166, 0, 770);
			this.aClass75_Sub2_11.method2460(34167, 0);
			for (@Pc(310) Class3 local310 = this.aClass229_9.method5328(); local310 != null; local310 = this.aClass229_9.method5325()) {
				@Pc(315) Class3_Sub31 local315 = (Class3_Sub31) local310;
				local315.method4009(arg0, arg2, arg1, arg3);
			}
			this.aClass75_Sub2_11.method2466(5890, 0, 768);
			this.aClass75_Sub2_11.method2460(5890, 0);
			this.aClass75_Sub2_11.method2456(null);
			this.aClass75_Sub2_11.V(local136, local239, this.aClass75_Sub2_11.anInt3089);
		}
		if (this.aClass104_1 != null) {
			this.aClass75_Sub2_11.o(local20, local16 - 8.0F);
			this.aClass75_Sub2_11.method2478();
			this.aClass75_Sub2_11.method2473(null, this.aClass225_6, null, this.aClass225_5);
			this.aClass104_1.method2888(arg3, arg0, arg2, arg4, arg1);
		}
		this.aClass75_Sub2_11.o(local20, local16);
	}

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class3_Sub3_Sub4 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub4 arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt7007 >> this.aClass75_Sub2_11.anInt3078;
		@Pc(27) Class3_Sub3_Sub4_Sub1 local27 = (Class3_Sub3_Sub4_Sub1) arg2;
		@Pc(43) Class3_Sub3_Sub4_Sub1 local43;
		if (local27 != null && local27.method997(local24, local24)) {
			local43 = local27;
			local27.method998();
		} else {
			local43 = new Class3_Sub3_Sub4_Sub1(this.aClass75_Sub2_11, local24, local24);
		}
		local43.method1000(local24, 0, local24, 0);
		this.method1581(arg0, local43, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!eh", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass104_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass75_Sub2_11.anInt3113 >> 8) >> this.aClass75_Sub2_11.anInt3078;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass75_Sub2_11.anInt3118 >> 8) >> this.aClass75_Sub2_11.anInt3078;
			this.aClass104_1.method2891(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!eh", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray7[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray7[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "()V")
	@Override
	public void f() {
		if (this.anInt1969 <= 0) {
			this.aClass104_1 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt7006 + 1][super.anInt7005 + 1];
			@Pc(32) int local32;
			for (@Pc(28) int local28 = 1; super.anInt7006 > local28; local28++) {
				for (local32 = 1; super.anInt7005 > local32; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray7[local28][local32 - 1] >> 2) + (this.aByteArrayArray7[local28 + 1][local32] >> 3) + (this.aByteArrayArray7[local28 + -1][local32] >> 2) + (this.aByteArrayArray7[local28][local32 - -1] >> 3) + (this.aByteArrayArray7[local28][local32] >> 1));
				}
			}
			this.aClass3_Sub42Array1 = new Class3_Sub42[this.aClass127_8.method3256()];
			this.aClass127_8.method3258(this.aClass3_Sub42Array1);
			for (local32 = 0; local32 < this.aClass3_Sub42Array1.length; local32++) {
				this.aClass3_Sub42Array1[local32].method5497(this.anInt1969);
			}
			@Pc(140) int local140 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local140 += 4;
			}
			if ((this.anInt1951 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(162) NativeBuffer local162 = this.aClass75_Sub2_11.aNativeHeap1.a(local140 * this.anInt1969);
			@Pc(167) NativeStream local167 = new NativeStream(local162);
			@Pc(171) Class3_Sub42[] local171 = new Class3_Sub42[this.anInt1969];
			@Pc(179) Class127 local179 = new Class127(Static78.method1396(this.anInt1969));
			@Pc(183) Class3_Sub42[] local183 = new Class3_Sub42[this.anInt1970];
			@Pc(189) int local189;
			for (@Pc(185) int local185 = 0; super.anInt7006 > local185; local185++) {
				for (local189 = 0; local189 < super.anInt7005; local189++) {
					if (this.anIntArrayArrayArray4[local185][local189] != null) {
						@Pc(205) Class3_Sub42[] local205 = this.aClass3_Sub42ArrayArrayArray1[local185][local189];
						@Pc(212) int[] local212 = this.anIntArrayArrayArray3[local185][local189];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray8[local185][local189];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray6[local185][local189];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray4[local185][local189];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local185][local189];
						if (local226 == null) {
							local226 = local233;
						}
						@Pc(261) int[] local261 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local185][local189];
						@Pc(268) float local268 = this.aFloatArrayArray1[local185][local189];
						@Pc(275) float local275 = this.aFloatArrayArray2[local185][local189];
						@Pc(282) float local282 = this.aFloatArrayArray3[local185][local189];
						@Pc(291) float local291 = this.aFloatArrayArray1[local185][local189 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray2[local185][local189 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray3[local185][local189 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray1[local185 + 1][local189 + 1];
						@Pc(331) float local331 = this.aFloatArrayArray2[local185 + 1][local189 + 1];
						@Pc(342) float local342 = this.aFloatArrayArray3[local185 + 1][local189 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray1[local185 + 1][local189];
						@Pc(360) float local360 = this.aFloatArrayArray2[local185 + 1][local189];
						@Pc(369) float local369 = this.aFloatArrayArray3[local185 + 1][local189];
						@Pc(377) int local377 = local26[local185][local189] & 0xFF;
						@Pc(387) int local387 = local26[local185][local189 + 1] & 0xFF;
						@Pc(399) int local399 = local26[local185 + 1][local189 + 1] & 0xFF;
						@Pc(409) int local409 = local26[local185 + 1][local189] & 0xFF;
						@Pc(411) int local411 = 0;
						@Pc(421) int local421;
						label331: for (@Pc(413) int local413 = 0; local413 < local233.length; local413++) {
							@Pc(419) Class3_Sub42 local419 = local205[local413];
							for (local421 = 0; local421 < local411; local421++) {
								if (local419 == local183[local421]) {
									continue label331;
								}
							}
							local183[local411++] = local419;
						}
						@Pc(462) short[] local462 = this.aShortArrayArray2[local185 + super.anInt7006 * local189] = new short[local233.length];
						for (local421 = 0; local421 < local233.length; local421++) {
							@Pc(475) int local475 = (local185 << super.anInt7004) + local212[local421];
							@Pc(484) int local484 = (local189 << super.anInt7004) + local219[local421];
							@Pc(489) int local489 = local475 >> this.anInt1968;
							@Pc(494) int local494 = local484 >> this.anInt1968;
							@Pc(498) int local498 = local233[local421];
							@Pc(502) int local502 = local226[local421];
							@Pc(510) int local510 = local245 == null ? 0 : local245[local421];
							@Pc(528) long local528 = (long) local502 << 48 | (long) local498 << 32 | (long) (local489 << 16) | (long) local494;
							@Pc(532) int local532 = local212[local421];
							@Pc(536) int local536 = local219[local421];
							@Pc(538) byte local538 = 74;
							@Pc(540) int local540 = 0;
							@Pc(582) float local582;
							@Pc(580) float local580;
							@Pc(578) float local578;
							@Pc(624) float local624;
							@Pc(576) int local576;
							if (local532 == 0 && local536 == 0) {
								local580 = local275;
								local582 = local268;
								local578 = local282;
								local576 = local538 - local377;
							} else if (local532 == 0 && local536 == super.anInt7007) {
								local576 = local538 - local387;
								local578 = local309;
								local580 = local300;
								local582 = local291;
							} else if (super.anInt7007 == local532 && local536 == super.anInt7007) {
								local576 = local538 - local399;
								local578 = local342;
								local580 = local331;
								local582 = local320;
							} else if (super.anInt7007 == local532 && local536 == 0) {
								local576 = local538 - local409;
								local582 = local351;
								local578 = local369;
								local580 = local360;
							} else {
								@Pc(600) float local600 = (float) local532 / (float) super.anInt7007;
								@Pc(607) float local607 = (float) local536 / (float) super.anInt7007;
								@Pc(615) float local615 = (local351 - local268) * local600 + local268;
								local624 = (local360 - local275) * local600 + local275;
								@Pc(632) float local632 = local600 * (local369 - local282) + local282;
								@Pc(641) float local641 = (local320 - local291) * local600 + local291;
								@Pc(649) float local649 = local300 + (local331 - local300) * local600;
								local580 = local607 * (local649 - local624) + local624;
								@Pc(666) float local666 = (local342 - local309) * local600 + local309;
								local582 = (local641 - local615) * local607 + local615;
								local578 = local632 + local607 * (local666 - local632);
								@Pc(695) int local695 = local377 + (local532 * (local409 - local377) >> super.anInt7004);
								@Pc(707) int local707 = local387 + ((local399 - local387) * local532 >> super.anInt7004);
								local576 = local538 - local695 - ((local707 - local695) * local536 >> super.anInt7004);
							}
							@Pc(759) float local759 = 1.0F;
							if (local498 != -1) {
								@Pc(770) int local770 = (local498 & 0x7F) * local576 >> 7;
								if (local770 < 2) {
									local770 = 2;
								} else if (local770 > 126) {
									local770 = 126;
								}
								local540 = Static168.anIntArray264[local770 | local498 & 0xFF80];
								if ((this.anInt1951 & 0x7) == 0) {
									local759 = this.aClass75_Sub2_11.aFloatArray23[1] * local580 + local582 * this.aClass75_Sub2_11.aFloatArray23[0] + this.aClass75_Sub2_11.aFloatArray23[2] * local578;
									local759 = this.aClass75_Sub2_11.aFloat45 + local759 * (local759 > 0.0F ? this.aClass75_Sub2_11.aFloat39 : this.aClass75_Sub2_11.aFloat29);
								}
							}
							@Pc(842) Class3 local842 = null;
							if ((local475 & this.anInt1965 - 1) == 0 && (local484 & this.anInt1965 - 1) == 0) {
								local842 = local179.method3246(local528);
							}
							@Pc(1196) int local1196;
							@Pc(868) int local868;
							if (local842 == null) {
								if (local502 == local498) {
									local868 = local540;
								} else {
									@Pc(878) int local878 = (local502 & 0x7F) * local576 >> 7;
									if (local878 < 2) {
										local878 = 2;
									} else if (local878 > 126) {
										local878 = 126;
									}
									local868 = Static168.anIntArray264[local502 & 0xFF80 | local878];
									if ((this.anInt1951 & 0x7) == 0) {
										local624 = local578 * this.aClass75_Sub2_11.aFloatArray23[2] + local582 * this.aClass75_Sub2_11.aFloatArray23[0] + this.aClass75_Sub2_11.aFloatArray23[1] * local580;
										local624 = (local759 > 0.0F ? this.aClass75_Sub2_11.aFloat39 : this.aClass75_Sub2_11.aFloat29) * local759 + this.aClass75_Sub2_11.aFloat45;
										@Pc(954) int local954 = local868 >> 16 & 0xFF;
										@Pc(960) int local960 = local868 >> 8 & 0xFF;
										local954 = (int) ((float) local954 * local624);
										@Pc(970) int local970 = local868 & 0xFF;
										if (local954 < 0) {
											local954 = 0;
										} else if (local954 > 255) {
											local954 = 255;
										}
										local960 = (int) ((float) local960 * local624);
										local970 = (int) ((float) local970 * local624);
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
										local868 = local970 | local960 << 8 | local954 << 16;
									}
								}
								if (this.aClass75_Sub2_11.aBoolean228) {
									local167.b((float) local475);
									local167.b((float) (local510 + this.va(local475, local484)));
									local167.b((float) local484);
									local167.a((byte) (local868 >> 16));
									local167.a((byte) (local868 >> 8));
									local167.a((byte) local868);
									local167.a(-1);
									local167.b((float) local475);
									local167.b((float) local484);
									if (this.anIntArrayArrayArray5 != null) {
										local167.b((float) (local261 == null ? 0 : local261[local421] - 1));
									}
									if ((this.anInt1951 & 0x7) != 0) {
										local167.b(local582);
										local167.b(local580);
										local167.b(local578);
									}
								} else {
									local167.a((float) local475);
									local167.a((float) (this.va(local475, local484) + local510));
									local167.a((float) local484);
									local167.a((byte) (local868 >> 16));
									local167.a((byte) (local868 >> 8));
									local167.a((byte) local868);
									local167.a(-1);
									local167.a((float) local475);
									local167.a((float) local484);
									if (this.anIntArrayArrayArray5 != null) {
										local167.a((float) (local261 == null ? 0 : local261[local421] - 1));
									}
									if ((this.anInt1951 & 0x7) != 0) {
										local167.a(local582);
										local167.a(local580);
										local167.a(local578);
									}
								}
								local1196 = this.anInt1966++;
								local462[local421] = (short) local1196;
								if (local498 != -1) {
									local171[local1196] = local205[local421];
								}
								local179.method3257(local528, new Class3_Sub32(local462[local421]));
							} else {
								local462[local421] = ((Class3_Sub32) local842).aShort154;
								local1196 = local462[local421] & 0xFFFF;
								if (local498 != -1 && local205[local421].aLong227 < local171[local1196].aLong227) {
									local171[local1196] = local205[local421];
								}
							}
							for (local868 = 0; local868 < local411; local868++) {
								local183[local868].method5500(local759, local540, local1196, local576);
							}
							this.anInt1957++;
						}
					}
				}
			}
			for (local189 = 0; local189 < this.anInt1966; local189++) {
				@Pc(1309) Class3_Sub42 local1309 = local171[local189];
				if (local1309 != null) {
					local1309.method5499(local189);
				}
			}
			@Pc(1346) int local1346;
			for (@Pc(1326) int local1326 = 0; local1326 < super.anInt7006; local1326++) {
				for (@Pc(1330) int local1330 = 0; local1330 < super.anInt7005; local1330++) {
					@Pc(1342) short[] local1342 = this.aShortArrayArray2[local1330 * super.anInt7006 + local1326];
					if (local1342 != null) {
						local1346 = 0;
						@Pc(1348) int local1348 = 0;
						while (local1348 < local1342.length) {
							@Pc(1357) int local1357 = local1342[local1348++] & 0xFFFF;
							@Pc(1364) int local1364 = local1342[local1348++] & 0xFFFF;
							@Pc(1371) int local1371 = local1342[local1348++] & 0xFFFF;
							@Pc(1375) Class3_Sub42 local1375 = local171[local1357];
							@Pc(1379) Class3_Sub42 local1379 = local171[local1364];
							@Pc(1383) Class3_Sub42 local1383 = local171[local1371];
							@Pc(1385) Class3_Sub42 local1385 = null;
							if (local1375 != null) {
								local1375.method5494(local1330, local1346, local1326);
								local1385 = local1375;
							}
							if (local1379 != null) {
								local1379.method5494(local1330, local1346, local1326);
								if (local1385 == null || local1379.aLong227 < local1385.aLong227) {
									local1385 = local1379;
								}
							}
							if (local1383 != null) {
								local1383.method5494(local1330, local1346, local1326);
								if (local1385 == null || local1385.aLong227 > local1383.aLong227) {
									local1385 = local1383;
								}
							}
							if (local1385 != null) {
								if (local1375 != null) {
									local1385.method5499(local1357);
								}
								if (local1379 != null) {
									local1385.method5499(local1364);
								}
								if (local1383 != null) {
									local1385.method5499(local1371);
								}
								local1385.method5494(local1330, local1346, local1326);
							}
							local1346++;
						}
					}
				}
			}
			local167.b();
			this.anInterface5_2 = this.aClass75_Sub2_11.method2438(local140, local162, local167.c());
			this.aClass225_6 = new Class225(this.aClass75_Sub2_11, this.anInterface5_2, 5126, 3, 0);
			this.aClass225_8 = new Class225(this.aClass75_Sub2_11, this.anInterface5_2, 5121, 4, 12);
			@Pc(1522) byte local1522;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass225_5 = new Class225(this.aClass75_Sub2_11, this.anInterface5_2, 5126, 2, 16);
				local1522 = 24;
			} else {
				local1522 = 28;
				this.aClass225_5 = new Class225(this.aClass75_Sub2_11, this.anInterface5_2, 5126, 3, 16);
			}
			if ((this.anInt1951 & 0x7) != 0) {
				this.aClass225_7 = new Class225(this.aClass75_Sub2_11, this.anInterface5_2, 5126, 3, local1522);
			}
			@Pc(1575) long[] local1575 = new long[this.aClass3_Sub42Array1.length];
			for (local1346 = 0; local1346 < this.aClass3_Sub42Array1.length; local1346++) {
				@Pc(1584) Class3_Sub42 local1584 = this.aClass3_Sub42Array1[local1346];
				local1575[local1346] = local1584.aLong227;
				local1584.method5495(this.anInt1966);
			}
			Static306.method4512(local1575, this.aClass3_Sub42Array1);
			if (this.aClass104_1 != null) {
				this.aClass104_1.method2895();
			}
		}
		this.aClass3_Sub42ArrayArrayArray1 = null;
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray4 = null;
		this.aFloatArrayArray1 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray3 = this.anIntArrayArrayArray8 = null;
		this.aByteArrayArray7 = null;
		this.anIntArrayArrayArray7 = null;
		this.aClass127_8 = null;
	}

	@OriginalMember(owner = "client!eh", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt7004;
		@Pc(13) int local13 = arg1 >> super.anInt7004;
		if (local8 < 0 || local13 < 0 || super.anInt7006 - 1 < local8 || local13 > super.anInt7005 - 1) {
			return 0;
		}
		@Pc(45) int local45 = super.anInt7007 - 1 & arg0;
		@Pc(52) int local52 = super.anInt7007 - 1 & arg1;
		@Pc(79) int local79 = this.anIntArrayArray22[local8 + 1][local13] * local45 + (super.anInt7007 - local45) * this.anIntArrayArray22[local8][local13] >> super.anInt7004;
		@Pc(111) int local111 = (super.anInt7007 - local45) * this.anIntArrayArray22[local8][local13 + 1] + local45 * this.anIntArrayArray22[local8 + 1][local13 + 1] >> super.anInt7004;
		return (super.anInt7007 - local52) * local79 + local52 * local111 >> super.anInt7004;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ve;[I)V")
	@Override
	public void method5442(@OriginalArg(0) Class3_Sub23 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass229_9.method5321(new Class3_Sub31(this.aClass75_Sub2_11, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray22[arg0][arg1];
	}
}
