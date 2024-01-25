import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class245_Sub1 extends Class245 {

	@OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
	private int anInt7530;

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
	private int anInt7542;

	@OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
	private int anInt7546;

	@OriginalMember(owner = "client!ok", name = "db", descriptor = "Lclient!gk;")
	public Class121 aClass121_8;

	@OriginalMember(owner = "client!ok", name = "eb", descriptor = "Lclient!gk;")
	private Class121 aClass121_9;

	@OriginalMember(owner = "client!ok", name = "fb", descriptor = "I")
	private int anInt7547;

	@OriginalMember(owner = "client!ok", name = "ib", descriptor = "Lclient!ob;")
	private Interface19 anInterface19_5;

	@OriginalMember(owner = "client!ok", name = "jb", descriptor = "[Lclient!iw;")
	private Class6_Sub28[] aClass6_Sub28Array1;

	@OriginalMember(owner = "client!ok", name = "kb", descriptor = "Lclient!gk;")
	public Class121 aClass121_10;

	@OriginalMember(owner = "client!ok", name = "mb", descriptor = "Lclient!gk;")
	public Class121 aClass121_11;

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "Lclient!kba;")
	private final Class163 aClass163_47 = new Class163();

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	private final int anInt7521 = this.anInt9286 - 2;

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "Lclient!ac;")
	public final Class5_Sub1 aClass5_Sub1_28;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ok", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "[[S")
	public final short[][] aShortArrayArray24;

	@OriginalMember(owner = "client!ok", name = "ab", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
	private final int anInt7534;

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ok", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
	public final int anInt7529;

	@OriginalMember(owner = "client!ok", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "[[[Lclient!iw;")
	private Class6_Sub28[][][] aClass6_Sub28ArrayArrayArray1;

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "[[B")
	private final byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!ok", name = "lb", descriptor = "[[F")
	private float[][] lb;

	@OriginalMember(owner = "client!ok", name = "hb", descriptor = "Lclient!wr;")
	private Class380 aClass380_28;

	@OriginalMember(owner = "client!ok", name = "Q", descriptor = "Lclient!cg;")
	private Class47 aClass47_2;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!ac;IIII[[I[[II)V")
	public Class245_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass5_Sub1_28 = arg0;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aShortArrayArray24 = new short[arg4 * arg3][];
		this.aByteArrayArray23 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anInt7534 = 0x1 << this.anInt7521;
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aFloatArrayArray10 = new float[super.anInt9289 + 1][super.anInt9290 + 1];
		this.anInt7529 = arg2;
		this.aFloatArrayArray9 = new float[super.anInt9289 + 1][super.anInt9290 + 1];
		this.aClass6_Sub28ArrayArrayArray1 = new Class6_Sub28[arg3][arg4][];
		this.aByteArrayArray22 = new byte[arg3][arg4];
		this.lb = new float[super.anInt9289 + 1][super.anInt9290 + 1];
		for (@Pc(115) int local115 = 1; super.anInt9290 > local115; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt9289; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + arg7 * 4 * arg7 + local138 * local138)));
				this.aFloatArrayArray10[local119][local115] = local174 * (float) local138;
				this.aFloatArrayArray9[local119][local115] = (float) (-arg7 * 2) * local174;
				this.lb[local119][local115] = (float) local155 * local174;
			}
		}
		this.aClass380_28 = new Class380(128);
		if ((this.anInt7529 & 0x10) != 0) {
			this.aClass47_2 = new Class47(this.aClass5_Sub1_28, this);
		}
	}

	@OriginalMember(owner = "client!ok", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray23[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ok", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass47_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass5_Sub1_28.anInt384 * arg2 >> 8) >> this.aClass5_Sub1_28.anInt360;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass5_Sub1_28.anInt375 >> 8) >> this.aClass5_Sub1_28.anInt360;
			this.aClass47_2.method2012(local38, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZII[[ZII)V")
	private void method6367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[][] arg5, @OriginalArg(7) int arg6) {
		if (this.aClass6_Sub28Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg3 + arg3 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (local18 > this.aClass5_Sub1_28.anIntArray7.length) {
			this.aClass5_Sub1_28.anIntArray7 = new int[local18];
		}
		if (this.anInt7542 * 2 > this.aClass5_Sub1_28.aClass6_Sub8_Sub2_1.aByteArray102.length) {
			this.aClass5_Sub1_28.aClass6_Sub8_Sub2_1 = new Class6_Sub8_Sub2(this.anInt7542 * 2);
		}
		@Pc(58) int local58 = arg4 - arg3;
		@Pc(60) int local60 = local58;
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(68) int local68 = arg6 - arg3;
		@Pc(70) int local70 = local68;
		if (local68 < 0) {
			local68 = 0;
		}
		@Pc(78) int local78 = arg4 + arg3;
		if (local78 > super.anInt9289 - 1) {
			local78 = super.anInt9289 - 1;
		}
		@Pc(93) int local93 = arg3 + arg6;
		if (super.anInt9290 - 1 < local93) {
			local93 = super.anInt9290 - 1;
		}
		@Pc(106) int local106 = 0;
		@Pc(110) int[] local110 = this.aClass5_Sub1_28.anIntArray7;
		@Pc(122) int local122;
		for (@Pc(112) int local112 = local58; local112 <= local78; local112++) {
			@Pc(120) boolean[] local120 = arg5[local112 - local60];
			for (local122 = local68; local122 <= local93; local122++) {
				if (local120[local122 - local70]) {
					local110[local106++] = local122 * super.anInt9289 + local112;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass5_Sub1_28.method350();
		} else {
			this.aClass5_Sub1_28.method379((float) arg1);
			this.aClass5_Sub1_28.method390();
		}
		this.aClass5_Sub1_28.method340((this.anInt7529 & 0x7) != 0);
		for (@Pc(194) int local194 = 0; local194 < this.aClass6_Sub28Array1.length; local194++) {
			this.aClass6_Sub28Array1[local194].method4519(local110, local106);
		}
		if (!this.aClass163_47.method4968()) {
			local122 = this.aClass5_Sub1_28.anInt404;
			@Pc(227) int local227 = this.aClass5_Sub1_28.anInt399;
			this.aClass5_Sub1_28.L(0, local227, this.aClass5_Sub1_28.anInt397);
			this.aClass5_Sub1_28.method340(false);
			this.aClass5_Sub1_28.method364(false);
			this.aClass5_Sub1_28.method359(128);
			this.aClass5_Sub1_28.method323(-2);
			this.aClass5_Sub1_28.method352(this.aClass5_Sub1_28.aClass2_Sub1_1);
			this.aClass5_Sub1_28.method388(7681, 8448);
			this.aClass5_Sub1_28.method329(0, 770, 34166);
			this.aClass5_Sub1_28.method375(0, 34167);
			for (@Pc(289) Class6 local289 = this.aClass163_47.method4966(); local289 != null; local289 = this.aClass163_47.method4965()) {
				@Pc(294) Class6_Sub40 local294 = (Class6_Sub40) local289;
				local294.method6757(arg6, arg3, arg4, arg5);
			}
			this.aClass5_Sub1_28.method329(0, 768, 5890);
			this.aClass5_Sub1_28.method375(0, 5890);
			this.aClass5_Sub1_28.method352((Class2) null);
			this.aClass5_Sub1_28.L(local122, local227, this.aClass5_Sub1_28.anInt397);
		}
		if (this.aClass47_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass5_Sub1_28.method357((Class121) null, (Class121) null, this.aClass121_11, this.aClass121_10);
		this.aClass47_2.method2010(arg2, arg3, arg4, arg5, arg6);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7585(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7547 <= 0) {
			return;
		}
		this.aClass5_Sub1_28.method356();
		this.aClass5_Sub1_28.method345(false);
		this.aClass5_Sub1_28.method340(false);
		this.aClass5_Sub1_28.method370(false);
		this.aClass5_Sub1_28.method364(false);
		this.aClass5_Sub1_28.method359(0);
		this.aClass5_Sub1_28.method323(-2);
		this.aClass5_Sub1_28.method352((Class2) null);
		Static159.aFloatArray33[4] = 0.0F;
		Static159.aFloatArray33[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass5_Sub1_28.anInt250;
		Static159.aFloatArray33[9] = 0.0F;
		Static159.aFloatArray33[3] = 0.0F;
		Static159.aFloatArray33[7] = 0.0F;
		Static159.aFloatArray33[11] = 0.0F;
		Static159.aFloatArray33[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass5_Sub1_28.anInt251;
		Static159.aFloatArray33[15] = 1.0F;
		Static159.aFloatArray33[14] = 0.0F;
		Static159.aFloatArray33[10] = 0.0F;
		Static159.aFloatArray33[0] = (float) 1024 / ((float) this.aClass5_Sub1_28.anInt251 * 128.0F * (float) super.anInt9291);
		Static159.aFloatArray33[6] = 0.0F;
		Static159.aFloatArray33[8] = 0.0F;
		Static159.aFloatArray33[1] = 0.0F;
		Static159.aFloatArray33[2] = 0.0F;
		Static159.aFloatArray33[5] = (float) 1024 / ((float) super.anInt9291 * 128.0F * (float) this.aClass5_Sub1_28.anInt250);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static159.aFloatArray33, 0);
		Static159.aFloatArray33[10] = 0.0F;
		Static159.aFloatArray33[7] = 0.0F;
		Static159.aFloatArray33[12] = 0.0F;
		Static159.aFloatArray33[15] = 1.0F;
		Static159.aFloatArray33[4] = 0.0F;
		Static159.aFloatArray33[5] = 0.0F;
		Static159.aFloatArray33[14] = 0.0F;
		Static159.aFloatArray33[11] = 0.0F;
		Static159.aFloatArray33[2] = 0.0F;
		Static159.aFloatArray33[8] = 0.0F;
		Static159.aFloatArray33[3] = 0.0F;
		Static159.aFloatArray33[0] = 1.0F;
		Static159.aFloatArray33[6] = 1.0F;
		Static159.aFloatArray33[1] = 0.0F;
		Static159.aFloatArray33[9] = 1.0F;
		Static159.aFloatArray33[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static159.aFloatArray33, 0);
		if ((this.anInt7529 & 0x7) == 0) {
			this.aClass5_Sub1_28.method340(false);
		} else {
			this.aClass5_Sub1_28.method340(true);
			this.aClass5_Sub1_28.method320();
		}
		this.aClass5_Sub1_28.method357(this.aClass121_9, this.aClass121_8, this.aClass121_11, this.aClass121_10);
		if (this.aClass5_Sub1_28.aClass6_Sub8_Sub2_1.aByteArray102.length < this.anInt7542 * 2) {
			this.aClass5_Sub1_28.aClass6_Sub8_Sub2_1 = new Class6_Sub8_Sub2(this.anInt7542 * 2);
		} else {
			this.aClass5_Sub1_28.aClass6_Sub8_Sub2_1.anInt10061 = 0;
		}
		@Pc(313) int local313 = 0;
		@Pc(317) Class6_Sub8_Sub2 local317 = this.aClass5_Sub1_28.aClass6_Sub8_Sub2_1;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass5_Sub1_28.aBoolean24) {
			for (local323 = arg1; local323 < arg3; local323++) {
				local333 = super.anInt9289 * local323 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local323 - arg1]) {
						local354 = this.aShortArrayArray24[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local313++;
								local317.method8241(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local323 = arg1; local323 < arg3; local323++) {
				local333 = arg0 + local323 * super.anInt9289;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local323 - arg1]) {
						local354 = this.aShortArrayArray24[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local317.method8264(local354[local358] & 0xFFFF);
								local313++;
							}
						}
					}
					local333++;
				}
			}
		}
		if (local313 > 0) {
			@Pc(467) Class170_Sub1 local467 = new Class170_Sub1(this.aClass5_Sub1_28, 5123, local317.aByteArray102, local317.anInt10061);
			this.aClass5_Sub1_28.method354(local313, local467, 0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7581(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass47_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass5_Sub1_28.anInt384 >> 8) >> this.aClass5_Sub1_28.anInt360;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass5_Sub1_28.anInt375 >> 8) >> this.aClass5_Sub1_28.anInt360;
			return this.aClass47_2.method2015(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!ok", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass47_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass5_Sub1_28.anInt384 * arg2 >> 8) >> this.aClass5_Sub1_28.anInt360;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass5_Sub1_28.anInt375 >> 8) >> this.aClass5_Sub1_28.anInt360;
			this.aClass47_2.method2014(local38, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILclient!en;)V")
	private void method6368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub5_Sub10_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass5_Sub1_28.anIntArray9.length) {
			this.aClass5_Sub1_28.anIntArray9 = new int[local22];
			this.aClass5_Sub1_28.anIntArray8 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass5_Sub1_28.anIntArray9;
		@Pc(50) int[] local50 = this.aClass5_Sub1_28.anIntArray8;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass5_Sub1_28.anInt360;
			local50[local52] = local19[local52] >> this.aClass5_Sub1_28.anInt360;
		}
		@Pc(80) int local80 = 0;
		while (local22 > local80) {
			@Pc(86) int local86 = local46[local80];
			@Pc(91) int local91 = local50[local80++];
			@Pc(95) int local95 = local46[local80];
			@Pc(100) int local100 = local50[local80++];
			@Pc(104) int local104 = local46[local80];
			@Pc(109) int local109 = local50[local80++];
			if ((local86 - local95) * (local100 - local109) - (local104 - local95) * (local100 - local91) > 0) {
				arg2.method2727(local91, local95, local86, local109, local100, local104);
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!cba;[I)V")
	@Override
	public void method7584(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass163_47.method4967(new Class6_Sub40(this.aClass5_Sub1_28, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ok", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class6_Sub5_Sub10 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub5_Sub10 arg2) {
		if ((this.aByteArrayArray22[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9291 >> this.aClass5_Sub1_28.anInt360;
		@Pc(27) Class6_Sub5_Sub10_Sub1 local27 = (Class6_Sub5_Sub10_Sub1) arg2;
		@Pc(37) Class6_Sub5_Sub10_Sub1 local37;
		if (local27 != null && local27.method2726(local24, local24)) {
			local37 = local27;
			local27.method2725();
		} else {
			local37 = new Class6_Sub5_Sub10_Sub1(this.aClass5_Sub1_28, local24, local24);
		}
		local37.method2722(0, local24, local24, 0);
		this.method6368(arg0, arg1, local37);
		return local37;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method6367(arg6, arg5, arg4, arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!ok", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt7547 <= 0) {
			this.aClass47_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt9289 + 1][super.anInt9290 + 1];
			@Pc(32) int local32;
			for (@Pc(28) int local28 = 1; local28 < super.anInt9289; local28++) {
				for (local32 = 1; local32 < super.anInt9290; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray23[local28][local32] >> 1) + (this.aByteArrayArray23[local28][local32 + 1] >> 3) + (this.aByteArrayArray23[local28][local32 - 1] >> 2) + (this.aByteArrayArray23[local28 + 1][local32] >> 3) + (this.aByteArrayArray23[local28 + -1][local32] >> 2));
				}
			}
			this.aClass6_Sub28Array1 = new Class6_Sub28[this.aClass380_28.method8756()];
			this.aClass380_28.method8749(this.aClass6_Sub28Array1);
			for (local32 = 0; local32 < this.aClass6_Sub28Array1.length; local32++) {
				this.aClass6_Sub28Array1[local32].method4525(this.anInt7547);
			}
			@Pc(148) int local148 = 24;
			if (this.anIntArrayArrayArray12 != null) {
				local148 += 4;
			}
			if ((this.anInt7529 & 0x7) != 0) {
				local148 += 12;
			}
			@Pc(168) NativeHeapBuffer local168 = this.aClass5_Sub1_28.aNativeHeap1.a(local148 * this.anInt7547, false);
			@Pc(173) Stream local173 = new Stream(local168);
			@Pc(177) Class6_Sub28[] local177 = new Class6_Sub28[this.anInt7547];
			@Pc(184) int local184 = Static48.method1561(this.anInt7547 / 4);
			if (local184 < 1) {
				local184 = 1;
			}
			@Pc(194) Class380 local194 = new Class380(local184);
			@Pc(198) Class6_Sub28[] local198 = new Class6_Sub28[this.anInt7546];
			@Pc(204) int local204;
			for (@Pc(200) int local200 = 0; super.anInt9289 > local200; local200++) {
				for (local204 = 0; local204 < super.anInt9290; local204++) {
					if (this.anIntArrayArrayArray13[local200][local204] != null) {
						@Pc(220) Class6_Sub28[] local220 = this.aClass6_Sub28ArrayArrayArray1[local200][local204];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray8[local200][local204];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray10[local200][local204];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray11[local200][local204];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray13[local200][local204];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local200][local204];
						@Pc(272) int[] local272 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local200][local204];
						if (local241 == null) {
							local241 = local248;
						}
						@Pc(283) float local283 = this.aFloatArrayArray10[local200][local204];
						@Pc(290) float local290 = this.aFloatArrayArray9[local200][local204];
						@Pc(297) float local297 = this.lb[local200][local204];
						@Pc(306) float local306 = this.aFloatArrayArray10[local200][local204 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray9[local200][local204 + 1];
						@Pc(324) float local324 = this.lb[local200][local204 + 1];
						@Pc(335) float local335 = this.aFloatArrayArray10[local200 + 1][local204 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray9[local200 + 1][local204 + 1];
						@Pc(357) float local357 = this.lb[local200 + 1][local204 + 1];
						@Pc(366) float local366 = this.aFloatArrayArray10[local200 + 1][local204];
						@Pc(375) float local375 = this.aFloatArrayArray9[local200 + 1][local204];
						@Pc(384) float local384 = this.lb[local200 + 1][local204];
						@Pc(392) int local392 = local26[local200][local204] & 0xFF;
						@Pc(402) int local402 = local26[local200][local204 + 1] & 0xFF;
						@Pc(414) int local414 = local26[local200 + 1][local204 + 1] & 0xFF;
						@Pc(424) int local424 = local26[local200 + 1][local204] & 0xFF;
						@Pc(426) int local426 = 0;
						@Pc(436) int local436;
						label337: for (@Pc(428) int local428 = 0; local428 < local248.length; local428++) {
							@Pc(434) Class6_Sub28 local434 = local220[local428];
							for (local436 = 0; local436 < local426; local436++) {
								if (local434 == local198[local436]) {
									continue label337;
								}
							}
							local198[local426++] = local434;
						}
						@Pc(478) short[] local478 = this.aShortArrayArray24[super.anInt9289 * local204 + local200] = new short[local248.length];
						for (local436 = 0; local436 < local248.length; local436++) {
							@Pc(491) int local491 = (local200 << super.anInt9286) + local227[local436];
							@Pc(501) int local501 = (local204 << super.anInt9286) + local234[local436];
							@Pc(506) int local506 = local491 >> this.anInt7521;
							@Pc(511) int local511 = local501 >> this.anInt7521;
							@Pc(515) int local515 = local248[local436];
							@Pc(519) int local519 = local241[local436];
							@Pc(527) int local527 = local260 == null ? 0 : local260[local436];
							@Pc(545) long local545 = (long) local511 | (long) local519 << 48 | (long) local515 << 32 | (long) (local506 << 16);
							@Pc(549) int local549 = local227[local436];
							@Pc(553) int local553 = local234[local436];
							@Pc(555) byte local555 = 74;
							@Pc(557) int local557 = 0;
							@Pc(559) float local559 = 1.0F;
							@Pc(606) float local606;
							@Pc(614) float local614;
							@Pc(612) float local612;
							@Pc(647) float local647;
							@Pc(610) int local610;
							if (local549 == 0 && local553 == 0) {
								local614 = local290;
								local610 = local555 - local392;
								local612 = local297;
								local606 = local283;
							} else if (local549 == 0 && local553 == super.anInt9291) {
								local614 = local315;
								local606 = local306;
								local612 = local324;
								local610 = local555 - local402;
							} else if (super.anInt9291 == local549 && local553 == super.anInt9291) {
								local614 = local346;
								local612 = local357;
								local610 = local555 - local414;
								local606 = local335;
							} else if (local549 == super.anInt9291 && local553 == 0) {
								local606 = local366;
								local610 = local555 - local424;
								local612 = local384;
								local614 = local375;
							} else {
								@Pc(623) float local623 = (float) local549 / (float) super.anInt9291;
								@Pc(630) float local630 = (float) local553 / (float) super.anInt9291;
								@Pc(639) float local639 = local283 + (local366 - local283) * local623;
								local647 = local623 * (local375 - local290) + local290;
								@Pc(655) float local655 = (local384 - local297) * local623 + local297;
								@Pc(663) float local663 = local623 * (local335 - local306) + local306;
								@Pc(671) float local671 = local315 + (local346 - local315) * local623;
								@Pc(680) float local680 = (local357 - local324) * local623 + local324;
								local614 = (local671 - local647) * local630 + local647;
								local606 = local630 * (local663 - local639) + local639;
								local612 = (local680 - local655) * local630 + local655;
								@Pc(717) int local717 = local392 + (local549 * (local424 - local392) >> super.anInt9286);
								@Pc(728) int local728 = local402 + (local549 * (local414 - local402) >> super.anInt9286);
								local610 = local555 - local717 - ((local728 - local717) * local553 >> super.anInt9286);
							}
							if (local515 != -1) {
								@Pc(790) int local790 = (local515 & 0x7F) * local610 >> 7;
								if (local790 < 2) {
									local790 = 2;
								} else if (local790 > 126) {
									local790 = 126;
								}
								if ((this.anInt7529 & 0x7) == 0) {
									local559 = local612 * this.aClass5_Sub1_28.aFloatArray3[2] + local606 * this.aClass5_Sub1_28.aFloatArray3[0] + local614 * this.aClass5_Sub1_28.aFloatArray3[1];
									local559 = (local559 > 0.0F ? this.aClass5_Sub1_28.aFloat18 : this.aClass5_Sub1_28.aFloat11) * local559 + this.aClass5_Sub1_28.aFloat12;
								}
								local557 = Static376.anIntArray336[local790 | local515 & 0xFF80];
							}
							@Pc(862) Class6 local862 = null;
							if ((local491 & this.anInt7534 - 1) == 0 && (local501 & this.anInt7534 - 1) == 0) {
								local862 = local194.method8747(local545);
							}
							@Pc(901) int local901;
							@Pc(954) int local954;
							if (local862 == null) {
								if (local519 == local515) {
									local954 = local557;
								} else {
									@Pc(934) int local934 = (local519 & 0x7F) * local610 >> 7;
									if (local934 < 2) {
										local934 = 2;
									} else if (local934 > 126) {
										local934 = 126;
									}
									local954 = Static376.anIntArray336[local519 & 0xFF80 | local934];
									if ((this.anInt7529 & 0x7) == 0) {
										local647 = local614 * this.aClass5_Sub1_28.aFloatArray3[1] + this.aClass5_Sub1_28.aFloatArray3[0] * local606 + local612 * this.aClass5_Sub1_28.aFloatArray3[2];
										local647 = local559 * (local559 > 0.0F ? this.aClass5_Sub1_28.aFloat18 : this.aClass5_Sub1_28.aFloat11) + this.aClass5_Sub1_28.aFloat12;
										@Pc(1007) int local1007 = local954 >> 16 & 0xFF;
										@Pc(1013) int local1013 = local954 >> 8 & 0xFF;
										@Pc(1017) int local1017 = local954 & 0xFF;
										local1007 = (int) ((float) local1007 * local647);
										if (local1007 < 0) {
											local1007 = 0;
										} else if (local1007 > 255) {
											local1007 = 255;
										}
										local1013 = (int) ((float) local1013 * local647);
										local1017 = (int) ((float) local1017 * local647);
										if (local1013 < 0) {
											local1013 = 0;
										} else if (local1013 > 255) {
											local1013 = 255;
										}
										if (local1017 < 0) {
											local1017 = 0;
										} else if (local1017 > 255) {
											local1017 = 255;
										}
										local954 = local1007 << 16 | local1013 << 8 | local1017;
									}
								}
								if (this.aClass5_Sub1_28.aBoolean24) {
									local173.b((float) local491);
									local173.b((float) (local527 + this.method7580(local491, local501)));
									local173.b((float) local501);
									local173.e((byte) (local954 >> 16));
									local173.e((byte) (local954 >> 8));
									local173.e((byte) local954);
									local173.e(-1);
									local173.b((float) local491);
									local173.b((float) local501);
									if (this.anIntArrayArrayArray12 != null) {
										local173.b((float) (local272 == null ? 0 : local272[local436] - 1));
									}
									if ((this.anInt7529 & 0x7) != 0) {
										local173.b(local606);
										local173.b(local614);
										local173.b(local612);
									}
								} else {
									local173.a((float) local491);
									local173.a((float) (local527 + this.method7580(local491, local501)));
									local173.a((float) local501);
									local173.e((byte) (local954 >> 16));
									local173.e((byte) (local954 >> 8));
									local173.e((byte) local954);
									local173.e(-1);
									local173.a((float) local491);
									local173.a((float) local501);
									if (this.anIntArrayArrayArray12 != null) {
										local173.a((float) (local272 == null ? 0 : local272[local436] - 1));
									}
									if ((this.anInt7529 & 0x7) != 0) {
										local173.a(local606);
										local173.a(local614);
										local173.a(local612);
									}
								}
								local901 = this.anInt7530++;
								local478[local436] = (short) local901;
								if (local515 != -1) {
									local177[local901] = local220[local436];
								}
								local194.method8753(new Class6_Sub43(local478[local436]), local545);
							} else {
								local478[local436] = ((Class6_Sub43) local862).aShort97;
								local901 = local478[local436] & 0xFFFF;
								if (local515 != -1 && local177[local901].aLong278 > local220[local436].aLong278) {
									local177[local901] = local220[local436];
								}
							}
							for (local954 = 0; local954 < local426; local954++) {
								local198[local954].method4518(local610, local559, local557, local901);
							}
							this.anInt7542++;
						}
					}
				}
			}
			for (local204 = 0; local204 < this.anInt7530; local204++) {
				@Pc(1334) Class6_Sub28 local1334 = local177[local204];
				if (local1334 != null) {
					local1334.method4517(local204);
				}
			}
			@Pc(1367) int local1367;
			for (@Pc(1347) int local1347 = 0; super.anInt9289 > local1347; local1347++) {
				for (@Pc(1351) int local1351 = 0; super.anInt9290 > local1351; local1351++) {
					@Pc(1363) short[] local1363 = this.aShortArrayArray24[local1347 + super.anInt9289 * local1351];
					if (local1363 != null) {
						local1367 = 0;
						@Pc(1369) int local1369 = 0;
						while (local1369 < local1363.length) {
							@Pc(1378) int local1378 = local1363[local1369++] & 0xFFFF;
							@Pc(1385) int local1385 = local1363[local1369++] & 0xFFFF;
							@Pc(1392) int local1392 = local1363[local1369++] & 0xFFFF;
							@Pc(1396) Class6_Sub28 local1396 = local177[local1378];
							@Pc(1400) Class6_Sub28 local1400 = local177[local1385];
							@Pc(1404) Class6_Sub28 local1404 = local177[local1392];
							@Pc(1406) Class6_Sub28 local1406 = null;
							if (local1396 != null) {
								local1396.method4524(local1367, local1351, local1347);
								local1406 = local1396;
							}
							if (local1400 != null) {
								local1400.method4524(local1367, local1351, local1347);
								if (local1406 == null || local1400.aLong278 < local1406.aLong278) {
									local1406 = local1400;
								}
							}
							if (local1404 != null) {
								local1404.method4524(local1367, local1351, local1347);
								if (local1406 == null || local1406.aLong278 > local1404.aLong278) {
									local1406 = local1404;
								}
							}
							if (local1406 != null) {
								if (local1396 != null) {
									local1406.method4517(local1378);
								}
								if (local1400 != null) {
									local1406.method4517(local1385);
								}
								if (local1404 != null) {
									local1406.method4517(local1392);
								}
								local1406.method4524(local1367, local1351, local1347);
							}
							local1367++;
						}
					}
				}
			}
			local173.c();
			this.anInterface19_5 = this.aClass5_Sub1_28.method332(local148, local168, local173.b());
			this.aClass121_10 = new Class121(this.anInterface19_5, 5126, 3, 0);
			this.aClass121_9 = new Class121(this.anInterface19_5, 5121, 4, 12);
			@Pc(1549) byte local1549;
			if (this.anIntArrayArrayArray12 == null) {
				this.aClass121_11 = new Class121(this.anInterface19_5, 5126, 2, 16);
				local1549 = 24;
			} else {
				this.aClass121_11 = new Class121(this.anInterface19_5, 5126, 3, 16);
				local1549 = 28;
			}
			if ((this.anInt7529 & 0x7) != 0) {
				this.aClass121_8 = new Class121(this.anInterface19_5, 5126, 3, local1549);
			}
			@Pc(1586) long[] local1586 = new long[this.aClass6_Sub28Array1.length];
			for (local1367 = 0; local1367 < this.aClass6_Sub28Array1.length; local1367++) {
				@Pc(1595) Class6_Sub28 local1595 = this.aClass6_Sub28Array1[local1367];
				local1586[local1367] = local1595.aLong278;
				local1595.method4520(this.anInt7530);
			}
			Static95.method2328(this.aClass6_Sub28Array1, local1586);
			if (this.aClass47_2 != null) {
				this.aClass47_2.method2011();
			}
		}
		this.anIntArrayArrayArray13 = null;
		this.aByteArrayArray23 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass6_Sub28ArrayArrayArray1 = null;
		this.aClass380_28 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray9 = this.lb = null;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
	@Override
	public void method7588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ok", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface7 local9 = this.aClass5_Sub1_28.anInterface7_10;
		if (arg3 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt9289][super.anInt9290][];
		}
		if (arg5 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt9289][super.anInt9290][];
		}
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray10[arg0][arg1] = arg4;
		this.anIntArrayArrayArray13[arg0][arg1] = arg6;
		this.anIntArrayArrayArray11[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		}
		@Pc(92) Class6_Sub28[] local92 = this.aClass6_Sub28ArrayArrayArray1[arg0][arg1] = new Class6_Sub28[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt7529 & 0x20) != 0 && local100 != -1 && local9.method6931(local100).aBoolean618) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(146) long local146 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (local104 << 14) | (long) local100;
			@Pc(152) Class6 local152;
			for (local152 = this.aClass380_28.method8747(local146); local152 != null; local152 = this.aClass380_28.method8750()) {
				@Pc(157) Class6_Sub28 local157 = (Class6_Sub28) local152;
				if (local100 == local157.anInt5524 && local157.aFloat121 == (float) local104 && local157.anInt5526 == arg10 && arg11 == local157.anInt5531 && arg12 == local157.anInt5533) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class6_Sub28(this, local100, local104, arg10, arg11, arg12);
				this.aClass380_28.method8753(local92[local94], local146);
			} else {
				local92[local94] = (Class6_Sub28) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray22[arg0][arg1] = (byte) (this.aByteArrayArray22[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt7546) {
			this.anInt7546 = arg6.length;
		}
		this.anInt7547 += arg6.length;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method6367(arg5, -1, arg4, arg2, arg0, arg3, arg1);
	}
}
