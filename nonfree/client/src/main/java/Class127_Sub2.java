import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class127_Sub2 extends Class127 {

	@OriginalMember(owner = "client!tv", name = "P", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
	private int anInt9214;

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "I")
	private int anInt9217;

	@OriginalMember(owner = "client!tv", name = "V", descriptor = "Lclient!mk;")
	private Class208 aClass208_11;

	@OriginalMember(owner = "client!tv", name = "W", descriptor = "Lclient!mk;")
	public Class208 aClass208_12;

	@OriginalMember(owner = "client!tv", name = "Y", descriptor = "I")
	private int anInt9225;

	@OriginalMember(owner = "client!tv", name = "Z", descriptor = "Lclient!vd;")
	private Interface22 anInterface22_6;

	@OriginalMember(owner = "client!tv", name = "db", descriptor = "[Lclient!pf;")
	private Class3_Sub41[] aClass3_Sub41Array1;

	@OriginalMember(owner = "client!tv", name = "eb", descriptor = "Lclient!mk;")
	public Class208 aClass208_13;

	@OriginalMember(owner = "client!tv", name = "hb", descriptor = "I")
	private int anInt9226;

	@OriginalMember(owner = "client!tv", name = "jb", descriptor = "Lclient!mk;")
	public Class208 aClass208_14;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "Lclient!or;")
	private final Class244 aClass244_64 = new Class244();

	@OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
	private final int anInt9218 = this.anInt10008 - 2;

	@OriginalMember(owner = "client!tv", name = "H", descriptor = "Lclient!er;")
	public final Class31_Sub2 aClass31_Sub2_41;

	@OriginalMember(owner = "client!tv", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!tv", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!tv", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!tv", name = "L", descriptor = "I")
	public final int anInt9220;

	@OriginalMember(owner = "client!tv", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!tv", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!tv", name = "G", descriptor = "[[S")
	public final short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!tv", name = "M", descriptor = "[[[Lclient!pf;")
	private Class3_Sub41[][][] aClass3_Sub41ArrayArrayArray1;

	@OriginalMember(owner = "client!tv", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "[[B")
	private final byte[][] aByteArrayArray43;

	@OriginalMember(owner = "client!tv", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray44;

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
	private final int anInt9212;

	@OriginalMember(owner = "client!tv", name = "X", descriptor = "Lclient!sba;")
	private Class297 aClass297_33;

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "Lclient!mi;")
	private Class206 aClass206_2;

	static {
		for (@Pc(9) int local9 = 0; local9 < 26; local9++) {
			aCharArray8[local9] = (char) (local9 + 65);
		}
		for (@Pc(23) int local23 = 26; local23 < 52; local23++) {
			aCharArray8[local23] = (char) (local23 + 97 - 26);
		}
		for (@Pc(39) int local39 = 52; local39 < 62; local39++) {
			aCharArray8[local39] = (char) (local39 + 48 - 52);
		}
		aCharArray8[62] = '+';
		aCharArray8[63] = '/';
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!er;IIII[[I[[II)V")
	public Class127_Sub2(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass31_Sub2_41 = arg0;
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aFloatArrayArray11 = new float[super.anInt10004 + 1][super.anInt10007 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anInt9220 = arg2;
		this.aFloatArrayArray12 = new float[super.anInt10004 + 1][super.anInt10007 + 1];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aShortArrayArray8 = new short[arg3 * arg4][];
		this.aClass3_Sub41ArrayArrayArray1 = new Class3_Sub41[arg3][arg4][];
		this.aFloatArrayArray10 = new float[super.anInt10004 + 1][super.anInt10007 + 1];
		this.aByteArrayArray43 = new byte[arg3][arg4];
		this.aByteArrayArray44 = new byte[arg3 + 1][arg4 + 1];
		this.anInt9212 = 0x1 << this.anInt9218;
		for (@Pc(115) int local115 = 1; super.anInt10007 > local115; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt10004 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + arg7 * 4 * arg7 + local138 * local138)));
				this.aFloatArrayArray10[local119][local115] = (float) local138 * local174;
				this.aFloatArrayArray11[local119][local115] = (float) (-arg7 * 2) * local174;
				this.aFloatArrayArray12[local119][local115] = (float) local155 * local174;
			}
		}
		this.aClass297_33 = new Class297(128);
		if ((this.anInt9220 & 0x10) != 0) {
			this.aClass206_2 = new Class206(this.aClass31_Sub2_41, this);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7256(arg4, arg1, arg3, arg5, arg0, arg2);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)V")
	@Override
	public void method7868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tv", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass206_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass31_Sub2_41.anInt3148 >> 8) >> this.aClass31_Sub2_41.anInt3133;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass31_Sub2_41.anInt3154 >> 8) >> this.aClass31_Sub2_41.anInt3133;
			this.aClass206_2.method4892(local38, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7863(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass206_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass31_Sub2_41.anInt3148 * arg2 >> 8) >> this.aClass31_Sub2_41.anInt3133;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass31_Sub2_41.anInt3154 >> 8) >> this.aClass31_Sub2_41.anInt3133;
			return this.aClass206_2.method4896(local40, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!cda;II)V")
	private void method7254(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray19[arg2][arg0];
		@Pc(25) int[] local25 = this.anIntArrayArrayArray18[arg2][arg0];
		@Pc(28) int local28 = local12.length;
		if (local28 > this.aClass31_Sub2_41.anIntArray108.length) {
			this.aClass31_Sub2_41.anIntArray108 = new int[local28];
			this.aClass31_Sub2_41.anIntArray109 = new int[local28];
		}
		@Pc(48) int[] local48 = this.aClass31_Sub2_41.anIntArray108;
		@Pc(52) int[] local52 = this.aClass31_Sub2_41.anIntArray109;
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			local48[local54] = local12[local54] >> this.aClass31_Sub2_41.anInt3133;
			local52[local54] = local25[local54] >> this.aClass31_Sub2_41.anInt3133;
		}
		@Pc(86) int local86 = 0;
		while (local86 < local28) {
			@Pc(92) int local92 = local48[local86];
			@Pc(97) int local97 = local52[local86++];
			@Pc(101) int local101 = local48[local86];
			@Pc(106) int local106 = local52[local86++];
			@Pc(110) int local110 = local48[local86];
			@Pc(115) int local115 = local52[local86++];
			if ((local106 - local115) * (local92 - local101) - (local110 - local101) * (-local97 + local106) > 0) {
				arg1.method1439(local101, local106, local110, local115, local92, local97);
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7865(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9225 <= 0) {
			return;
		}
		this.aClass31_Sub2_41.method2547();
		this.aClass31_Sub2_41.method2561(false);
		this.aClass31_Sub2_41.method2545(false);
		this.aClass31_Sub2_41.method2548(false);
		this.aClass31_Sub2_41.method2556(false);
		this.aClass31_Sub2_41.method2568(0);
		this.aClass31_Sub2_41.method2566(-2);
		this.aClass31_Sub2_41.method2535(null);
		Static238.aFloatArray41[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass31_Sub2_41.anInt3093;
		Static238.aFloatArray41[11] = 0.0F;
		Static238.aFloatArray41[3] = 0.0F;
		Static238.aFloatArray41[7] = 0.0F;
		Static238.aFloatArray41[10] = 0.0F;
		Static238.aFloatArray41[8] = 0.0F;
		Static238.aFloatArray41[15] = 1.0F;
		Static238.aFloatArray41[14] = 0.0F;
		Static238.aFloatArray41[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass31_Sub2_41.anInt3063;
		Static238.aFloatArray41[6] = 0.0F;
		Static238.aFloatArray41[5] = (float) 1024 / ((float) super.anInt10009 * 128.0F * (float) this.aClass31_Sub2_41.anInt3063);
		Static238.aFloatArray41[9] = 0.0F;
		Static238.aFloatArray41[2] = 0.0F;
		Static238.aFloatArray41[0] = (float) 1024 / ((float) this.aClass31_Sub2_41.anInt3093 * (float) super.anInt10009 * 128.0F);
		Static238.aFloatArray41[4] = 0.0F;
		Static238.aFloatArray41[1] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static238.aFloatArray41, 0);
		Static238.aFloatArray41[1] = 0.0F;
		Static238.aFloatArray41[6] = 1.0F;
		Static238.aFloatArray41[12] = 0.0F;
		Static238.aFloatArray41[14] = 0.0F;
		Static238.aFloatArray41[8] = 0.0F;
		Static238.aFloatArray41[5] = 0.0F;
		Static238.aFloatArray41[10] = 0.0F;
		Static238.aFloatArray41[3] = 0.0F;
		Static238.aFloatArray41[4] = 0.0F;
		Static238.aFloatArray41[9] = 1.0F;
		Static238.aFloatArray41[15] = 1.0F;
		Static238.aFloatArray41[2] = 0.0F;
		Static238.aFloatArray41[7] = 0.0F;
		Static238.aFloatArray41[13] = 0.0F;
		Static238.aFloatArray41[0] = 1.0F;
		Static238.aFloatArray41[11] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static238.aFloatArray41, 0);
		if ((this.anInt9220 & 0x7) == 0) {
			this.aClass31_Sub2_41.method2545(false);
		} else {
			this.aClass31_Sub2_41.method2545(true);
			this.aClass31_Sub2_41.method2574();
		}
		this.aClass31_Sub2_41.method2537(this.aClass208_14, this.aClass208_11, this.aClass208_13, this.aClass208_12);
		if (this.aClass31_Sub2_41.aClass3_Sub26_Sub2_2.aByteArray213.length >= this.anInt9217 * 2) {
			this.aClass31_Sub2_41.aClass3_Sub26_Sub2_2.anInt8703 = 0;
		} else {
			this.aClass31_Sub2_41.aClass3_Sub26_Sub2_2 = new Class3_Sub26_Sub2(this.anInt9217 * 2);
		}
		@Pc(318) int local318 = 0;
		@Pc(322) Class3_Sub26_Sub2 local322 = this.aClass31_Sub2_41.aClass3_Sub26_Sub2_2;
		@Pc(328) int local328;
		@Pc(337) int local337;
		@Pc(339) int local339;
		@Pc(357) short[] local357;
		@Pc(361) int local361;
		if (this.aClass31_Sub2_41.aBoolean216) {
			for (local328 = arg1; local328 < arg3; local328++) {
				local337 = local328 * super.anInt10004 + arg0;
				for (local339 = arg0; local339 < arg2; local339++) {
					if (arg4[local339 - arg0][local328 - arg1]) {
						local357 = this.aShortArrayArray8[local337];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local322.method6769(local357[local361] & 0xFFFF);
								local318++;
							}
						}
					}
					local337++;
				}
			}
		} else {
			for (local328 = arg1; local328 < arg3; local328++) {
				local337 = super.anInt10004 * local328 + arg0;
				for (local339 = arg0; local339 < arg2; local339++) {
					if (arg4[local339 - arg0][local328 - arg1]) {
						local357 = this.aShortArrayArray8[local337];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local318++;
								local322.method6793(local357[local361] & 0xFFFF);
							}
						}
					}
					local337++;
				}
			}
		}
		if (local318 > 0) {
			@Pc(490) Class166_Sub2 local490 = new Class166_Sub2(this.aClass31_Sub2_41, 5123, local322.aByteArray213, local322.anInt8703);
			this.aClass31_Sub2_41.method2498(local318, 0, local490);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray44[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray44[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass206_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass31_Sub2_41.anInt3148 >> 8) >> this.aClass31_Sub2_41.anInt3133;
			@Pc(38) int local38 = arg3 - (this.aClass31_Sub2_41.anInt3154 * arg2 >> 8) >> this.aClass31_Sub2_41.anInt3133;
			this.aClass206_2.method4895(arg0, local38, local24);
		}
	}

	@OriginalMember(owner = "client!tv", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt10004][super.anInt10007][];
		}
		if (arg3 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt10004][super.anInt10007][];
		}
		this.anIntArrayArrayArray19[arg0][arg1] = arg2;
		this.anIntArrayArrayArray18[arg0][arg1] = arg4;
		this.anIntArrayArrayArray16[arg0][arg1] = arg6;
		this.anIntArrayArrayArray17[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub41[] local88 = this.aClass3_Sub41ArrayArrayArray1[arg0][arg1] = new Class3_Sub41[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg8[local90];
			@Pc(125) Class3 local125;
			for (local125 = this.aClass297_33.method6531(local119); local125 != null; local125 = this.aClass297_33.method6538()) {
				@Pc(130) Class3_Sub41 local130 = (Class3_Sub41) local125;
				if (arg8[local90] == local130.anInt7356 && local130.aFloat158 == (float) arg9[local90] && arg10 == local130.anInt7357 && arg11 == local130.anInt7359 && arg12 == local130.anInt7361) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub41(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass297_33.method6537(local119, local88[local90]);
			} else {
				local88[local90] = (Class3_Sub41) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray43[arg0][arg1] = (byte) (this.aByteArrayArray43[arg0][arg1] | 0x1);
		}
		if (this.anInt9226 < arg6.length) {
			this.anInt9226 = arg6.length;
		}
		this.anInt9225 += arg6.length;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method7256(arg4, arg1, arg3, -1, arg0, arg2);
	}

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub3 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub3 arg2) {
		if ((this.aByteArrayArray43[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt10009 >> this.aClass31_Sub2_41.anInt3133;
		@Pc(24) Class3_Sub7_Sub3_Sub1 local24 = (Class3_Sub7_Sub3_Sub1) arg2;
		@Pc(40) Class3_Sub7_Sub3_Sub1 local40;
		if (local24 != null && local24.method1443(local21, local21)) {
			local40 = local24;
			local24.method1445();
		} else {
			local40 = new Class3_Sub7_Sub3_Sub1(this.aClass31_Sub2_41, local21, local21);
		}
		local40.method1442(0, 0, local21, local21);
		this.method7254(arg1, local40, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!cp;[I)V")
	@Override
	public void method7866(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass244_64.method5570(new Class3_Sub50(this.aClass31_Sub2_41, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!tv", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt9225 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt10004 + 1][super.anInt10007 + 1];
			@Pc(24) int local24;
			for (@Pc(20) int local20 = 1; super.anInt10004 > local20; local20++) {
				for (local24 = 1; super.anInt10007 > local24; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray44[local20][local24] >> 1) + (this.aByteArrayArray44[local20 - 1][local24] >> 2) + (this.aByteArrayArray44[local20 + 1][local24] >> 3) + (this.aByteArrayArray44[local20][local24 - 1] >> 2) + (this.aByteArrayArray44[local20][local24 + 1] >> 3));
				}
			}
			this.aClass3_Sub41Array1 = new Class3_Sub41[this.aClass297_33.method6528()];
			this.aClass297_33.method6536(this.aClass3_Sub41Array1);
			for (local24 = 0; local24 < this.aClass3_Sub41Array1.length; local24++) {
				this.aClass3_Sub41Array1[local24].method5755(this.anInt9225);
			}
			@Pc(136) int local136 = 24;
			if (this.anIntArrayArrayArray15 != null) {
				local136 += 4;
			}
			if ((this.anInt9220 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass31_Sub2_41.aNativeHeap4.a(local136 * this.anInt9225, false);
			@Pc(161) Stream local161 = new Stream(local156);
			@Pc(165) Class3_Sub41[] local165 = new Class3_Sub41[this.anInt9225];
			@Pc(172) int local172 = Static49.method1209(this.anInt9225 / 4);
			if (local172 < 1) {
				local172 = 1;
			}
			@Pc(184) Class297 local184 = new Class297(local172);
			@Pc(188) Class3_Sub41[] local188 = new Class3_Sub41[this.anInt9226];
			@Pc(194) int local194;
			for (@Pc(190) int local190 = 0; super.anInt10004 > local190; local190++) {
				for (local194 = 0; super.anInt10007 > local194; local194++) {
					if (this.anIntArrayArrayArray16[local190][local194] != null) {
						@Pc(210) Class3_Sub41[] local210 = this.aClass3_Sub41ArrayArrayArray1[local190][local194];
						@Pc(217) int[] local217 = this.anIntArrayArrayArray19[local190][local194];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray18[local190][local194];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray17[local190][local194];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray16[local190][local194];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local190][local194];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local190][local194];
						if (local231 == null) {
							local231 = local238;
						}
						@Pc(273) float local273 = this.aFloatArrayArray10[local190][local194];
						@Pc(280) float local280 = this.aFloatArrayArray11[local190][local194];
						@Pc(287) float local287 = this.aFloatArrayArray12[local190][local194];
						@Pc(296) float local296 = this.aFloatArrayArray10[local190][local194 + 1];
						@Pc(305) float local305 = this.aFloatArrayArray11[local190][local194 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray12[local190][local194 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray10[local190 + 1][local194 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray11[local190 + 1][local194 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray12[local190 + 1][local194 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray10[local190 + 1][local194];
						@Pc(365) float local365 = this.aFloatArrayArray11[local190 + 1][local194];
						@Pc(374) float local374 = this.aFloatArrayArray12[local190 + 1][local194];
						@Pc(382) int local382 = local18[local190][local194] & 0xFF;
						@Pc(392) int local392 = local18[local190][local194 + 1] & 0xFF;
						@Pc(404) int local404 = local18[local190 + 1][local194 + 1] & 0xFF;
						@Pc(414) int local414 = local18[local190 + 1][local194] & 0xFF;
						@Pc(416) int local416 = 0;
						@Pc(426) int local426;
						label335: for (@Pc(418) int local418 = 0; local418 < local238.length; local418++) {
							@Pc(424) Class3_Sub41 local424 = local210[local418];
							for (local426 = 0; local426 < local416; local426++) {
								if (local188[local426] == local424) {
									continue label335;
								}
							}
							local188[local416++] = local424;
						}
						@Pc(472) short[] local472 = this.aShortArrayArray8[super.anInt10004 * local194 + local190] = new short[local238.length];
						for (local426 = 0; local426 < local238.length; local426++) {
							@Pc(485) int local485 = (local190 << super.anInt10008) + local217[local426];
							@Pc(494) int local494 = (local194 << super.anInt10008) + local224[local426];
							@Pc(499) int local499 = local485 >> this.anInt9218;
							@Pc(504) int local504 = local494 >> this.anInt9218;
							@Pc(508) int local508 = local238[local426];
							@Pc(512) int local512 = local231[local426];
							@Pc(520) int local520 = local250 == null ? 0 : local250[local426];
							@Pc(538) long local538 = (long) local504 | (long) (local499 << 16) | (long) local508 << 32 | (long) local512 << 48;
							@Pc(542) int local542 = local217[local426];
							@Pc(546) int local546 = local224[local426];
							@Pc(548) byte local548 = 74;
							@Pc(550) int local550 = 0;
							@Pc(552) float local552 = 1.0F;
							@Pc(576) float local576;
							@Pc(582) float local582;
							@Pc(574) float local574;
							@Pc(658) float local658;
							@Pc(580) int local580;
							if (local542 == 0 && local546 == 0) {
								local576 = local273;
								local574 = local287;
								local582 = local280;
								local580 = local548 - local382;
							} else if (local542 == 0 && local546 == super.anInt10009) {
								local574 = local314;
								local576 = local296;
								local580 = local548 - local392;
								local582 = local305;
							} else if (super.anInt10009 == local542 && local546 == super.anInt10009) {
								local576 = local325;
								local580 = local548 - local404;
								local582 = local336;
								local574 = local347;
							} else if (local542 == super.anInt10009 && local546 == 0) {
								local574 = local374;
								local582 = local365;
								local576 = local356;
								local580 = local548 - local414;
							} else {
								@Pc(633) float local633 = (float) local542 / (float) super.anInt10009;
								@Pc(640) float local640 = (float) local546 / (float) super.anInt10009;
								@Pc(649) float local649 = local273 + (local356 - local273) * local633;
								local658 = local280 + (local365 - local280) * local633;
								@Pc(666) float local666 = local633 * (local374 - local287) + local287;
								@Pc(675) float local675 = local296 + local633 * (local325 - local296);
								@Pc(683) float local683 = local633 * (local336 - local305) + local305;
								local576 = local640 * (local675 - local649) + local649;
								local582 = (local683 - local658) * local640 + local658;
								@Pc(708) float local708 = local314 + (local347 - local314) * local633;
								local574 = (local708 - local666) * local640 + local666;
								@Pc(728) int local728 = local382 + ((local414 - local382) * local542 >> super.anInt10008);
								@Pc(740) int local740 = (local542 * (local404 - local392) >> super.anInt10008) + local392;
								local580 = local548 - (local546 * (local740 - local728) >> super.anInt10008) - local728;
							}
							if (local508 != -1) {
								@Pc(777) int local777 = (local508 & 0x7F) * local580 >> 7;
								if (local777 < 2) {
									local777 = 2;
								} else if (local777 > 126) {
									local777 = 126;
								}
								local550 = Static422.anIntArray428[local777 | local508 & 0xFF80];
								if ((this.anInt9220 & 0x7) == 0) {
									local552 = this.aClass31_Sub2_41.aFloatArray29[2] * local574 + local576 * this.aClass31_Sub2_41.aFloatArray29[0] + local582 * this.aClass31_Sub2_41.aFloatArray29[1];
									local552 = this.aClass31_Sub2_41.aFloat92 + (local552 > 0.0F ? this.aClass31_Sub2_41.aFloat90 : this.aClass31_Sub2_41.aFloat96) * local552;
								}
							}
							@Pc(846) Class3 local846 = null;
							if ((this.anInt9212 - 1 & local485) == 0 && (local494 & this.anInt9212 - 1) == 0) {
								local846 = local184.method6531(local538);
							}
							@Pc(885) int local885;
							@Pc(911) int local911;
							if (local846 == null) {
								if (local512 == local508) {
									local911 = local550;
								} else {
									@Pc(921) int local921 = local580 * (local512 & 0x7F) >> 7;
									if (local921 < 2) {
										local921 = 2;
									} else if (local921 > 126) {
										local921 = 126;
									}
									local911 = Static422.anIntArray428[local921 | local512 & 0xFF80];
									if ((this.anInt9220 & 0x7) == 0) {
										local658 = this.aClass31_Sub2_41.aFloatArray29[2] * local574 + this.aClass31_Sub2_41.aFloatArray29[1] * local582 + local576 * this.aClass31_Sub2_41.aFloatArray29[0];
										local658 = local552 * (local552 > 0.0F ? this.aClass31_Sub2_41.aFloat90 : this.aClass31_Sub2_41.aFloat96) + this.aClass31_Sub2_41.aFloat92;
										@Pc(999) int local999 = local911 >> 16 & 0xFF;
										@Pc(1005) int local1005 = local911 >> 8 & 0xFF;
										@Pc(1009) int local1009 = local911 & 0xFF;
										local999 = (int) ((float) local999 * local658);
										if (local999 < 0) {
											local999 = 0;
										} else if (local999 > 255) {
											local999 = 255;
										}
										local1005 = (int) ((float) local1005 * local658);
										if (local1005 < 0) {
											local1005 = 0;
										} else if (local1005 > 255) {
											local1005 = 255;
										}
										local1009 = (int) ((float) local1009 * local658);
										if (local1009 < 0) {
											local1009 = 0;
										} else if (local1009 > 255) {
											local1009 = 255;
										}
										local911 = local1005 << 8 | local999 << 16 | local1009;
									}
								}
								if (this.aClass31_Sub2_41.aBoolean216) {
									local161.a((float) local485);
									local161.a((float) (local520 + this.method7860(local494, local485)));
									local161.a((float) local494);
									local161.f((byte) (local911 >> 16));
									local161.f((byte) (local911 >> 8));
									local161.f((byte) local911);
									local161.f(-1);
									local161.a((float) local485);
									local161.a((float) local494);
									if (this.anIntArrayArrayArray15 != null) {
										local161.a((float) (local262 == null ? 0 : local262[local426] - 1));
									}
									if ((this.anInt9220 & 0x7) != 0) {
										local161.a(local576);
										local161.a(local582);
										local161.a(local574);
									}
								} else {
									local161.b((float) local485);
									local161.b((float) (this.method7860(local494, local485) + local520));
									local161.b((float) local494);
									local161.f((byte) (local911 >> 16));
									local161.f((byte) (local911 >> 8));
									local161.f((byte) local911);
									local161.f(-1);
									local161.b((float) local485);
									local161.b((float) local494);
									if (this.anIntArrayArrayArray15 != null) {
										local161.b((float) (local262 == null ? 0 : local262[local426] - 1));
									}
									if ((this.anInt9220 & 0x7) != 0) {
										local161.b(local576);
										local161.b(local582);
										local161.b(local574);
									}
								}
								local885 = this.anInt9214++;
								local472[local426] = (short) local885;
								if (local508 != -1) {
									local165[local885] = local210[local426];
								}
								local184.method6537(local538, new Class3_Sub38(local472[local426]));
							} else {
								local472[local426] = ((Class3_Sub38) local846).aShort82;
								local885 = local472[local426] & 0xFFFF;
								if (local508 != -1 && local210[local426].aLong262 < local165[local885].aLong262) {
									local165[local885] = local210[local426];
								}
							}
							for (local911 = 0; local911 < local416; local911++) {
								local188[local911].method5753(local885, local552, local550, local580);
							}
							this.anInt9217++;
						}
					}
				}
			}
			for (local194 = 0; local194 < this.anInt9214; local194++) {
				@Pc(1319) Class3_Sub41 local1319 = local165[local194];
				if (local1319 != null) {
					local1319.method5758(local194);
				}
			}
			@Pc(1352) int local1352;
			for (@Pc(1332) int local1332 = 0; super.anInt10004 > local1332; local1332++) {
				for (@Pc(1336) int local1336 = 0; super.anInt10007 > local1336; local1336++) {
					@Pc(1348) short[] local1348 = this.aShortArrayArray8[local1332 + local1336 * super.anInt10004];
					if (local1348 != null) {
						local1352 = 0;
						@Pc(1354) int local1354 = 0;
						while (local1354 < local1348.length) {
							@Pc(1363) int local1363 = local1348[local1354++] & 0xFFFF;
							@Pc(1370) int local1370 = local1348[local1354++] & 0xFFFF;
							@Pc(1377) int local1377 = local1348[local1354++] & 0xFFFF;
							@Pc(1381) Class3_Sub41 local1381 = local165[local1363];
							@Pc(1385) Class3_Sub41 local1385 = local165[local1370];
							@Pc(1389) Class3_Sub41 local1389 = local165[local1377];
							@Pc(1391) Class3_Sub41 local1391 = null;
							if (local1381 != null) {
								local1391 = local1381;
								local1381.method5754(local1352, local1332, local1336);
							}
							if (local1385 != null) {
								local1385.method5754(local1352, local1332, local1336);
								if (local1391 == null || local1391.aLong262 > local1385.aLong262) {
									local1391 = local1385;
								}
							}
							if (local1389 != null) {
								local1389.method5754(local1352, local1332, local1336);
								if (local1391 == null || local1391.aLong262 > local1389.aLong262) {
									local1391 = local1389;
								}
							}
							if (local1391 != null) {
								if (local1381 != null) {
									local1391.method5758(local1363);
								}
								if (local1385 != null) {
									local1391.method5758(local1370);
								}
								if (local1389 != null) {
									local1391.method5758(local1377);
								}
								local1391.method5754(local1352, local1332, local1336);
							}
							local1352++;
						}
					}
				}
			}
			local161.c();
			this.anInterface22_6 = this.aClass31_Sub2_41.method2575(local156, local136, local161.b());
			this.aClass208_13 = new Class208(this.anInterface22_6, 5126, 3, 0);
			this.aClass208_11 = new Class208(this.anInterface22_6, 5121, 4, 12);
			@Pc(1538) byte local1538;
			if (this.anIntArrayArrayArray15 == null) {
				this.aClass208_14 = new Class208(this.anInterface22_6, 5126, 2, 16);
				local1538 = 24;
			} else {
				this.aClass208_14 = new Class208(this.anInterface22_6, 5126, 3, 16);
				local1538 = 28;
			}
			if ((this.anInt9220 & 0x7) != 0) {
				this.aClass208_12 = new Class208(this.anInterface22_6, 5126, 3, local1538);
			}
			@Pc(1572) long[] local1572 = new long[this.aClass3_Sub41Array1.length];
			for (local1352 = 0; local1352 < this.aClass3_Sub41Array1.length; local1352++) {
				@Pc(1581) Class3_Sub41 local1581 = this.aClass3_Sub41Array1[local1352];
				local1572[local1352] = local1581.aLong262;
				local1581.method5752(this.anInt9214);
			}
			Static11.method7280(this.aClass3_Sub41Array1, local1572);
			if (this.aClass206_2 != null) {
				this.aClass206_2.method4893();
			}
		} else {
			this.aClass206_2 = null;
		}
		this.aClass297_33 = null;
		this.anIntArrayArrayArray15 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray11 = this.aFloatArrayArray12 = null;
		this.anIntArrayArrayArray19 = this.anIntArrayArrayArray18 = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass3_Sub41ArrayArrayArray1 = null;
		this.anIntArrayArrayArray16 = null;
		this.aByteArrayArray44 = null;
		this.anIntArrayArrayArray17 = null;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZBI[[ZIII)V")
	private void method7256(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass3_Sub41Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg5 + arg5 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (this.aClass31_Sub2_41.anIntArray107.length < local15) {
			this.aClass31_Sub2_41.anIntArray107 = new int[local15];
		}
		if (this.anInt9217 * 2 > this.aClass31_Sub2_41.aClass3_Sub26_Sub2_2.aByteArray213.length) {
			this.aClass31_Sub2_41.aClass3_Sub26_Sub2_2 = new Class3_Sub26_Sub2(this.anInt9217 * 2);
		}
		@Pc(59) int local59 = arg4 - arg5;
		@Pc(61) int local61 = local59;
		if (local59 < 0) {
			local59 = 0;
		}
		@Pc(69) int local69 = arg1 - arg5;
		@Pc(71) int local71 = local69;
		if (local69 < 0) {
			local69 = 0;
		}
		@Pc(79) int local79 = arg5 + arg4;
		if (local79 > super.anInt10004 - 1) {
			local79 = super.anInt10004 - 1;
		}
		@Pc(98) int local98 = arg5 + arg1;
		if (local98 > super.anInt10007 - 1) {
			local98 = super.anInt10007 - 1;
		}
		@Pc(115) int local115 = 0;
		@Pc(119) int[] local119 = this.aClass31_Sub2_41.anIntArray107;
		@Pc(132) int local132;
		for (@Pc(121) int local121 = local59; local121 <= local79; local121++) {
			@Pc(130) boolean[] local130 = arg2[local121 - local61];
			for (local132 = local69; local132 <= local98; local132++) {
				if (local130[local132 - local71]) {
					local119[local115++] = local121 + local132 * super.anInt10004;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass31_Sub2_41.method2522();
		} else {
			this.aClass31_Sub2_41.method2500((float) arg3);
			this.aClass31_Sub2_41.method2534();
		}
		this.aClass31_Sub2_41.method2545((this.anInt9220 & 0x7) != 0);
		for (@Pc(193) int local193 = 0; local193 < this.aClass3_Sub41Array1.length; local193++) {
			this.aClass3_Sub41Array1[local193].method5756(local119, local115);
		}
		if (!this.aClass244_64.method5571()) {
			local132 = this.aClass31_Sub2_41.anInt3158;
			@Pc(222) int local222 = this.aClass31_Sub2_41.anInt3162;
			this.aClass31_Sub2_41.pa(0, local222, this.aClass31_Sub2_41.anInt3168);
			this.aClass31_Sub2_41.method2545(false);
			this.aClass31_Sub2_41.method2556(false);
			this.aClass31_Sub2_41.method2568(128);
			this.aClass31_Sub2_41.method2566(-2);
			this.aClass31_Sub2_41.method2535(this.aClass31_Sub2_41.aClass50_Sub1_2);
			this.aClass31_Sub2_41.method2536(7681, 8448);
			this.aClass31_Sub2_41.method2523(770, 34166, 0);
			this.aClass31_Sub2_41.method2499(34167, 0);
			for (@Pc(284) Class3 local284 = this.aClass244_64.method5572(); local284 != null; local284 = this.aClass244_64.method5576()) {
				@Pc(289) Class3_Sub50 local289 = (Class3_Sub50) local284;
				local289.method7729(arg5, arg2, arg4, arg1);
			}
			this.aClass31_Sub2_41.method2523(768, 5890, 0);
			this.aClass31_Sub2_41.method2499(5890, 0);
			this.aClass31_Sub2_41.method2535(null);
			this.aClass31_Sub2_41.pa(local132, local222, this.aClass31_Sub2_41.anInt3168);
		}
		if (this.aClass206_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass31_Sub2_41.method2537(this.aClass208_14, null, this.aClass208_13, null);
		this.aClass206_2.method4894(arg4, arg0, arg1, arg2, arg5);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.O(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}
}
