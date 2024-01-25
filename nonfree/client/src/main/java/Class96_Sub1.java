import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!eh", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
	private int anInt2571;

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
	private int anInt2577;

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
	private int anInt2588;

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "[Lclient!nfa;")
	private Class6_Sub39[] aClass6_Sub39Array1;

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "Lclient!bl;")
	private Interface6 anInterface6_7;

	@OriginalMember(owner = "client!eh", name = "fb", descriptor = "Lclient!ot;")
	public Class207 aClass207_15;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
	private int anInt2589;

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "Lclient!bl;")
	private Interface6 anInterface6_8;

	@OriginalMember(owner = "client!eh", name = "R", descriptor = "F")
	private float aFloat49 = -3.4028235E38F;

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "F")
	private float aFloat50 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "Lclient!tf;")
	private final Class340 aClass340_19 = new Class340();

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "Lclient!jj;")
	public final Class75_Sub1 aClass75_Sub1_8;

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
	private final int anInt2574;

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
	private final int anInt2568;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!eh", name = "jb", descriptor = "[[B")
	private final byte[][] aByteArrayArray42;

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "[[[Lclient!nfa;")
	private Class6_Sub39[][][] aClass6_Sub39ArrayArrayArray1;

	@OriginalMember(owner = "client!eh", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "[[B")
	private byte[][] aByteArrayArray43;

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!eh", name = "hb", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
	public final int anInt2585;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!eh", name = "W", descriptor = "Lclient!dfa;")
	private Class74 aClass74_13;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "Lclient!bd;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!jj;IIII[[I[[II)V")
	public Class96_Sub1(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass75_Sub1_8 = arg0;
		this.anInt2574 = super.anInt9248 - 2;
		this.anInt2568 = 0x1 << this.anInt2574;
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aByteArrayArray42 = new byte[arg3][arg4];
		this.aClass6_Sub39ArrayArrayArray1 = new Class6_Sub39[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt9255 + 1][super.anInt9257 + 1];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aByteArrayArray43 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray5 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anInt2585 = arg2;
		this.aFloatArrayArray2 = new float[super.anInt9255 + 1][super.anInt9257 + 1];
		this.aFloatArrayArray3 = new float[super.anInt9255 + 1][super.anInt9257 + 1];
		for (@Pc(121) int local121 = 0; super.anInt9257 >= local121; local121++) {
			for (@Pc(127) int local127 = 0; super.anInt9255 >= local127; local127++) {
				@Pc(136) int local136 = super.anIntArrayArray51[local127][local121];
				if ((float) local136 > this.aFloat49) {
					this.aFloat49 = (float) local136;
				}
				if (this.aFloat50 > (float) local136) {
					this.aFloat50 = (float) local136;
				}
				if (local127 > 0 && local121 > 0 && local127 < super.anInt9255 && local121 < super.anInt9257) {
					@Pc(202) int local202 = arg6[local127 + 1][local121] - arg6[local127 - 1][local121];
					@Pc(219) int local219 = arg6[local127][local121 + 1] - arg6[local127][local121 - 1];
					@Pc(238) float local238 = (float) (1.0D / Math.sqrt((double) (local219 * local219 + local202 * local202 + arg7 * 4 * arg7)));
					this.aFloatArrayArray3[local127][local121] = (float) local202 * local238;
					this.aFloatArrayArray2[local127][local121] = (float) (-arg7 * 2) * local238;
					this.aFloatArrayArray4[local127][local121] = local238 * (float) local219;
				}
			}
		}
		this.aFloat50--;
		this.aFloat49++;
		this.aClass74_13 = new Class74(128);
		if ((this.anInt2585 & 0x10) != 0) {
			this.aClass33_2 = new Class33(this.aClass75_Sub1_8, this);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ta;[I)V")
	@Override
	public void method8075(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass340_19.method8131(new Class6_Sub30(this.aClass75_Sub1_8, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!ug;I)V")
	private void method2525(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub18_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray3[arg2][arg0];
		@Pc(24) int[] local24 = this.anIntArrayArrayArray6[arg2][arg0];
		@Pc(27) int local27 = local12.length;
		if (Static166.anIntArray187.length < local27) {
			Static166.anIntArray187 = new int[local27];
			Static579.anIntArray601 = new int[local27];
		}
		for (@Pc(45) int local45 = 0; local45 < local27; local45++) {
			Static166.anIntArray187[local45] = local12[local45] >> this.aClass75_Sub1_8.anInt7672;
			Static579.anIntArray601[local45] = local24[local45] >> this.aClass75_Sub1_8.anInt7672;
		}
		@Pc(75) int local75 = 0;
		while (local75 < local27) {
			@Pc(83) int local83 = Static166.anIntArray187[local75];
			@Pc(88) int local88 = Static579.anIntArray601[local75++];
			@Pc(92) int local92 = Static166.anIntArray187[local75];
			@Pc(97) int local97 = Static579.anIntArray601[local75++];
			@Pc(101) int local101 = Static166.anIntArray187[local75];
			@Pc(106) int local106 = Static579.anIntArray601[local75++];
			if (-((local101 - local92) * (local97 + -local88)) + (local97 - local106) * (local83 - local92) > 0) {
				arg1.method8478(local88, local101, local83, local97, local92, local106);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8069(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2588 <= 0) {
			return;
		}
		@Pc(20) Interface25 local20 = this.aClass75_Sub1_8.method6852(this.anInt2571);
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 32767;
		@Pc(26) int local26 = -32768;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			local22 = 0;
			@Pc(39) Buffer local39 = local20.method8677();
			if (local39 != null) {
				@Pc(47) Stream local47 = this.aClass75_Sub1_8.method6788(local39);
				@Pc(51) int local51;
				@Pc(60) int local60;
				@Pc(62) int local62;
				@Pc(82) short[] local82;
				@Pc(86) int local86;
				@Pc(94) int local94;
				if (Stream.b()) {
					for (local51 = arg1; local51 < arg3; local51++) {
						local60 = local51 * super.anInt9255 + arg0;
						for (local62 = arg0; local62 < arg2; local62++) {
							if (arg4[local62 - arg0][local51 - arg1]) {
								local82 = this.aShortArrayArray5[local60];
								if (local82 != null) {
									for (local86 = 0; local86 < local82.length; local86++) {
										local94 = local82[local86] & 0xFFFF;
										local47.b(local94);
										if (local94 < local24) {
											local24 = local94;
										}
										local22++;
										if (local94 > local26) {
											local26 = local94;
										}
									}
								}
							}
							local60++;
						}
					}
				} else {
					for (local51 = arg1; local51 < arg3; local51++) {
						local60 = super.anInt9255 * local51 + arg0;
						for (local62 = arg0; local62 < arg2; local62++) {
							if (arg4[local62 - arg0][local51 - arg1]) {
								local82 = this.aShortArrayArray5[local60];
								if (local82 != null) {
									for (local86 = 0; local86 < local82.length; local86++) {
										local94 = local82[local86] & 0xFFFF;
										if (local94 < local24) {
											local24 = local94;
										}
										local22++;
										local47.a(local94);
										if (local26 < local94) {
											local26 = local94;
										}
									}
								}
							}
							local60++;
						}
					}
				}
				local47.a();
				if (local20.method8676()) {
					break;
				}
			}
		}
		if (local22 <= 0) {
			return;
		}
		this.aClass75_Sub1_8.method6850();
		this.aClass75_Sub1_8.method6846(false);
		this.aClass75_Sub1_8.method6780(false);
		this.aClass75_Sub1_8.method6815(false);
		this.aClass75_Sub1_8.method6752(false);
		this.aClass75_Sub1_8.method6736(0);
		this.aClass75_Sub1_8.method6809(false, false, -2);
		this.aClass75_Sub1_8.method6814((Interface1) null);
		@Pc(301) Class109_Sub3 local301 = this.aClass75_Sub1_8.method6734();
		@Pc(306) float[] local306 = this.aClass75_Sub1_8.method6840();
		local306[0] = (float) 1024 / ((float) this.aClass75_Sub1_8.anInt7597 * (float) super.anInt9246 * 128.0F);
		local306[14] = -this.aFloat50 / (this.aFloat49 - this.aFloat50);
		local306[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass75_Sub1_8.anInt7597;
		local306[6] = 0.0F;
		local306[3] = 0.0F;
		local306[5] = (float) 1024 / ((float) this.aClass75_Sub1_8.anInt7590 * 128.0F * (float) super.anInt9246);
		local306[11] = 0.0F;
		local306[7] = 0.0F;
		local306[4] = 0.0F;
		local306[9] = 0.0F;
		local306[1] = 0.0F;
		local306[15] = 1.0F;
		local306[2] = 0.0F;
		local306[10] = 1.0F / (this.aFloat49 - this.aFloat50);
		local306[8] = 0.0F;
		local306[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass75_Sub1_8.anInt7590;
		local301.method4361(0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
		this.aClass75_Sub1_8.method6728();
		this.aClass75_Sub1_8.method6820();
		if ((this.anInt2585 & 0x7) == 0) {
			this.aClass75_Sub1_8.method6780(false);
		} else {
			this.aClass75_Sub1_8.method6780(true);
			this.aClass75_Sub1_8.method6821();
		}
		this.aClass75_Sub1_8.method6797(false);
		this.aClass75_Sub1_8.method6827(this.anInterface6_8, 0);
		this.aClass75_Sub1_8.method6827(this.anInterface6_7, 1);
		this.aClass75_Sub1_8.method6753(this.aClass207_15);
		this.aClass75_Sub1_8.method6746(Static118.aClass51_4, local24, local26 + 1 - local24, local20, 0, local22 / 3);
		this.aClass75_Sub1_8.method6797(true);
	}

	@OriginalMember(owner = "client!eh", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray43[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray43[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BII[[ZIZII)V")
	private void method2526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass6_Sub39Array1 == null) {
			return;
		}
		@Pc(25) int local25 = arg5 + arg5 + 1;
		@Pc(29) int local29 = local25 * local25;
		if (Static616.anIntArray640.length < local29) {
			Static616.anIntArray640 = new int[local29];
		}
		@Pc(42) int local42 = arg6 - arg5;
		@Pc(44) int local44 = local42;
		if (local42 < 0) {
			local42 = 0;
		}
		@Pc(53) int local53 = arg1 - arg5;
		@Pc(55) int local55 = local53;
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(63) int local63 = arg6 + arg5;
		if (super.anInt9255 - 1 < local63) {
			local63 = super.anInt9255 - 1;
		}
		@Pc(82) int local82 = arg5 + arg1;
		if (super.anInt9257 - 1 < local82) {
			local82 = super.anInt9257 - 1;
		}
		Static64.anInt781 = 0;
		for (@Pc(97) int local97 = local42; local97 <= local63; local97++) {
			@Pc(106) boolean[] local106 = arg2[local97 - local44];
			for (@Pc(108) int local108 = local53; local108 <= local82; local108++) {
				if (local106[local108 - local55]) {
					Static616.anIntArray640[Static64.anInt781++] = super.anInt9255 * local108 + local97;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass75_Sub1_8.method6791();
		} else {
			this.aClass75_Sub1_8.method6749((float) arg0);
			this.aClass75_Sub1_8.method6761();
		}
		this.aClass75_Sub1_8.method6777();
		this.aClass75_Sub1_8.method6780((this.anInt2585 & 0x7) != 0);
		this.aClass75_Sub1_8.method6809(false, false, -1);
		this.aClass75_Sub1_8.method6827(this.anInterface6_8, 0);
		for (@Pc(213) int local213 = 0; local213 < this.aClass6_Sub39Array1.length; local213++) {
			this.aClass6_Sub39Array1[local213].method6042(Static616.anIntArray640, Static64.anInt781);
		}
		@Pc(240) Class109_Sub3 local240 = this.aClass75_Sub1_8.method6734();
		local240.method4606(0, -1, 0);
		this.aClass75_Sub1_8.method6820();
		if (!this.aClass340_19.method8121()) {
			@Pc(260) int local260 = this.aClass75_Sub1_8.anInt7670;
			@Pc(264) int local264 = this.aClass75_Sub1_8.anInt7657;
			this.aClass75_Sub1_8.L(0, local264, this.aClass75_Sub1_8.anInt7675);
			this.aClass75_Sub1_8.method6780(false);
			this.aClass75_Sub1_8.method6752(false);
			this.aClass75_Sub1_8.method6736(128);
			this.aClass75_Sub1_8.method6809(false, false, -2);
			this.aClass75_Sub1_8.method6814(this.aClass75_Sub1_8.anInterface1_3);
			this.aClass75_Sub1_8.method6743(Static257.aClass344_2, Static571.aClass344_5);
			this.aClass75_Sub1_8.method6795(0, Static389.aClass261_8);
			this.aClass75_Sub1_8.method6816(0, Static51.aClass261_2);
			for (@Pc(324) Class6 local324 = this.aClass340_19.method8124(); local324 != null; local324 = this.aClass340_19.method8134()) {
				@Pc(329) Class6_Sub30 local329 = (Class6_Sub30) local324;
				local329.method5087(arg1, arg6, arg5, arg2);
			}
			this.aClass75_Sub1_8.method6795(0, Static24.aClass261_1);
			this.aClass75_Sub1_8.method6816(0, Static24.aClass261_1);
			this.aClass75_Sub1_8.method6814((Interface1) null);
			this.aClass75_Sub1_8.L(local260, local264, this.aClass75_Sub1_8.anInt7675);
		}
		if (this.aClass33_2 != null) {
			this.aClass75_Sub1_8.method6827(this.anInterface6_8, 0);
			this.aClass75_Sub1_8.method6827(this.anInterface6_7, 1);
			this.aClass75_Sub1_8.method6753(this.aClass207_15);
			this.aClass33_2.method449(arg2, arg5, arg6, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!eh", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class6_Sub2_Sub18 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub18 arg2) {
		if ((this.aByteArrayArray42[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(22) int local22 = super.anInt9246 >> this.aClass75_Sub1_8.anInt7672;
		@Pc(25) Class6_Sub2_Sub18_Sub2 local25 = (Class6_Sub2_Sub18_Sub2) arg2;
		@Pc(37) Class6_Sub2_Sub18_Sub2 local37;
		if (local25 != null && local25.method8476(local22, local22)) {
			local37 = local25;
			local25.method8477();
		} else {
			local37 = new Class6_Sub2_Sub18_Sub2(this.aClass75_Sub1_8, local22, local22);
		}
		local37.method8474(local22, 0, 0, local22);
		this.method2525(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!eh", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass33_2 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (this.aClass75_Sub1_8.anInt7662 * arg2 >> 8) >> this.aClass75_Sub1_8.anInt7672;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass75_Sub1_8.anInt7666 >> 8) >> this.aClass75_Sub1_8.anInt7672;
			this.aClass33_2.method451(local42, arg0, local27);
		}
	}

	@OriginalMember(owner = "client!eh", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass33_2 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass75_Sub1_8.anInt7662 >> 8) >> this.aClass75_Sub1_8.anInt7672;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass75_Sub1_8.anInt7666 >> 8) >> this.aClass75_Sub1_8.anInt7672;
			this.aClass33_2.method448(arg0, local27, local42);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2526(-1, arg1, arg3, arg5, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!eh", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt2588 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt9255 + 1][super.anInt9257 + 1];
			for (@Pc(16) int local16 = 1; super.anInt9255 > local16; local16++) {
				for (@Pc(22) int local22 = 1; super.anInt9257 > local22; local22++) {
					local14[local16][local22] = (byte) ((this.aByteArrayArray43[local16 - 1][local22] >> 2) + (this.aByteArrayArray43[local16 + 1][local22] >> 3) + (this.aByteArrayArray43[local16][local22 + -1] >> 2) + (this.aByteArrayArray43[local16][local22 + 1] >> 3) + (this.aByteArrayArray43[local16][local22] >> 1));
				}
			}
			@Pc(108) Class6_Sub39[] local108 = new Class6_Sub39[this.aClass74_13.method1400()];
			this.aClass74_13.method1402(local108);
			for (@Pc(118) int local118 = 0; local118 < local108.length; local118++) {
				local108[local118].method6045(this.anInt2588);
			}
			@Pc(140) int local140 = 20;
			if (this.anIntArrayArrayArray2 != null) {
				local140 += 4;
			}
			if ((this.anInt2585 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(169) NativeHeapBuffer local169 = this.aClass75_Sub1_8.aNativeHeap5.a(this.anInt2588 * 4, false);
			@Pc(179) NativeHeapBuffer local179 = this.aClass75_Sub1_8.aNativeHeap5.a(this.anInt2588 * local140, false);
			@Pc(184) Stream local184 = new Stream(local179);
			@Pc(189) Stream local189 = new Stream(local169);
			@Pc(193) Class6_Sub39[] local193 = new Class6_Sub39[this.anInt2588];
			@Pc(200) int local200 = Static468.method7064(this.anInt2588 / 4);
			if (local200 < 1) {
				local200 = 1;
			}
			@Pc(212) Class74 local212 = new Class74(local200);
			@Pc(216) Class6_Sub39[] local216 = new Class6_Sub39[this.anInt2589];
			@Pc(222) int local222;
			for (@Pc(218) int local218 = 0; super.anInt9255 > local218; local218++) {
				for (local222 = 0; super.anInt9257 > local222; local222++) {
					if (this.anIntArrayArrayArray4[local218][local222] != null) {
						@Pc(240) Class6_Sub39[] local240 = this.aClass6_Sub39ArrayArrayArray1[local218][local222];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray3[local218][local222];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray6[local218][local222];
						@Pc(261) int[] local261 = this.anIntArrayArrayArray7[local218][local222];
						@Pc(268) int[] local268 = this.anIntArrayArrayArray4[local218][local222];
						@Pc(281) int[] local281 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local218][local222];
						@Pc(294) int[] local294 = this.anIntArrayArrayArray2 == null ? null : this.anIntArrayArrayArray2[local218][local222];
						if (local261 == null) {
							local261 = local268;
						}
						@Pc(305) float local305 = this.aFloatArrayArray3[local218][local222];
						@Pc(312) float local312 = this.aFloatArrayArray2[local218][local222];
						@Pc(319) float local319 = this.aFloatArrayArray4[local218][local222];
						@Pc(328) float local328 = this.aFloatArrayArray3[local218][local222 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray2[local218][local222 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray4[local218][local222 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray3[local218 + 1][local222 + 1];
						@Pc(368) float local368 = this.aFloatArrayArray2[local218 + 1][local222 + 1];
						@Pc(379) float local379 = this.aFloatArrayArray4[local218 + 1][local222 + 1];
						@Pc(388) float local388 = this.aFloatArrayArray3[local218 + 1][local222];
						@Pc(397) float local397 = this.aFloatArrayArray2[local218 + 1][local222];
						@Pc(406) float local406 = this.aFloatArrayArray4[local218 + 1][local222];
						@Pc(414) int local414 = local14[local218][local222] & 0xFF;
						@Pc(424) int local424 = local14[local218][local222 + 1] & 0xFF;
						@Pc(436) int local436 = local14[local218 + 1][local222 + 1] & 0xFF;
						@Pc(446) int local446 = local14[local218 + 1][local222] & 0xFF;
						@Pc(448) int local448 = 0;
						@Pc(458) int local458;
						label355: for (@Pc(450) int local450 = 0; local450 < local268.length; local450++) {
							@Pc(456) Class6_Sub39 local456 = local240[local450];
							for (local458 = 0; local458 < local448; local458++) {
								if (local216[local458] == local456) {
									continue label355;
								}
							}
							local216[local448++] = local456;
						}
						@Pc(509) short[] local509 = this.aShortArrayArray5[local218 + super.anInt9255 * local222] = new short[local268.length];
						for (local458 = 0; local458 < local268.length; local458++) {
							@Pc(523) int local523 = (local218 << super.anInt9248) + local247[local458];
							@Pc(533) int local533 = (local222 << super.anInt9248) + local254[local458];
							@Pc(538) int local538 = local523 >> this.anInt2574;
							@Pc(543) int local543 = local533 >> this.anInt2574;
							@Pc(547) int local547 = local268[local458];
							@Pc(551) int local551 = local261[local458];
							@Pc(560) int local560 = local281 == null ? 0 : local281[local458];
							@Pc(578) long local578 = (long) local543 | (long) local547 << 32 | (long) local551 << 48 | (long) (local538 << 16);
							@Pc(582) int local582 = local247[local458];
							@Pc(586) int local586 = local254[local458];
							@Pc(588) byte local588 = 74;
							@Pc(590) int local590 = 0;
							@Pc(607) float local607;
							@Pc(601) float local601;
							@Pc(609) float local609;
							@Pc(717) float local717;
							@Pc(605) int local605;
							if (local582 == 0 && local586 == 0) {
								local601 = local312;
								local605 = local588 - local414;
								local607 = local305;
								local609 = local319;
							} else if (local582 == 0 && local586 == super.anInt9246) {
								local605 = local588 - local424;
								local607 = local328;
								local601 = local337;
								local609 = local346;
							} else if (local582 == super.anInt9246 && super.anInt9246 == local586) {
								local607 = local357;
								local605 = local588 - local436;
								local609 = local379;
								local601 = local368;
							} else if (super.anInt9246 == local582 && local586 == 0) {
								local609 = local406;
								local601 = local397;
								local605 = local588 - local446;
								local607 = local388;
							} else {
								@Pc(693) float local693 = (float) local582 / (float) super.anInt9246;
								@Pc(700) float local700 = (float) local586 / (float) super.anInt9246;
								@Pc(709) float local709 = local693 * (local388 - local305) + local305;
								local717 = local312 + local693 * (local397 - local312);
								@Pc(726) float local726 = local319 + local693 * (local406 - local319);
								@Pc(735) float local735 = (local357 - local328) * local693 + local328;
								@Pc(743) float local743 = (local368 - local337) * local693 + local337;
								local607 = local700 * (local735 - local709) + local709;
								@Pc(760) float local760 = (local379 - local346) * local693 + local346;
								local601 = (local743 - local717) * local700 + local717;
								local609 = (local760 - local726) * local700 + local726;
								@Pc(789) int local789 = local414 + (local582 * (local446 - local414) >> super.anInt9248);
								@Pc(802) int local802 = local424 + (local582 * (local436 - local424) >> super.anInt9248);
								local605 = local588 - local789 - (local586 * (local802 - local789) >> super.anInt9248);
							}
							@Pc(831) float local831 = 1.0F;
							if (local547 != -1) {
								@Pc(842) int local842 = (local547 & 0x7F) * local605 >> 7;
								if (local842 < 2) {
									local842 = 2;
								} else if (local842 > 126) {
									local842 = 126;
								}
								local590 = Static229.anIntArray228[local547 & 0xFF80 | local842];
								if ((this.anInt2585 & 0x7) == 0) {
									local831 = local607 * this.aClass75_Sub1_8.aFloatArray62[0] + local601 * this.aClass75_Sub1_8.aFloatArray62[1] + this.aClass75_Sub1_8.aFloatArray62[2] * local609;
									local831 = this.aClass75_Sub1_8.aFloat152 + (local831 > 0.0F ? this.aClass75_Sub1_8.aFloat145 : this.aClass75_Sub1_8.aFloat144) * local831;
								}
							}
							@Pc(916) Class6 local916 = null;
							if ((this.anInt2568 - 1 & local523) == 0 && (local533 & this.anInt2568 - 1) == 0) {
								local916 = local212.method1401(local578);
							}
							@Pc(957) int local957;
							@Pc(1021) int local1021;
							if (local916 == null) {
								if (local547 == local551) {
									local1021 = local590;
								} else {
									@Pc(995) int local995 = (local551 & 0x7F) * local605 >> 7;
									if (local995 < 2) {
										local995 = 2;
									} else if (local995 > 126) {
										local995 = 126;
									}
									local1021 = Static229.anIntArray228[local995 | local551 & 0xFF80];
									if ((this.anInt2585 & 0x7) == 0) {
										@Pc(1052) float local1052 = this.aClass75_Sub1_8.aFloatArray62[1] * local601 + this.aClass75_Sub1_8.aFloatArray62[0] * local607 + this.aClass75_Sub1_8.aFloatArray62[2] * local609;
										local717 = local831 * (local831 > 0.0F ? this.aClass75_Sub1_8.aFloat145 : this.aClass75_Sub1_8.aFloat144) + this.aClass75_Sub1_8.aFloat152;
										@Pc(1078) int local1078 = local1021 >> 16 & 0xFF;
										@Pc(1084) int local1084 = local1021 >> 8 & 0xFF;
										@Pc(1088) int local1088 = local1021 & 0xFF;
										local1078 = (int) ((float) local1078 * local717);
										if (local1078 < 0) {
											local1078 = 0;
										} else if (local1078 > 255) {
											local1078 = 255;
										}
										local1084 = (int) ((float) local1084 * local717);
										if (local1084 < 0) {
											local1084 = 0;
										} else if (local1084 > 255) {
											local1084 = 255;
										}
										local1088 = (int) ((float) local1088 * local717);
										if (local1088 < 0) {
											local1088 = 0;
										} else if (local1088 > 255) {
											local1088 = 255;
										}
										local1021 = local1084 << 8 | local1078 << 16 | local1088;
									}
								}
								if (Stream.b()) {
									local184.a((float) local523);
									local184.a((float) (local560 + this.method8077(local523, local533)));
									local184.a((float) local533);
									local184.a((float) local523);
									local184.a((float) local533);
									if (this.anIntArrayArrayArray2 != null) {
										local184.a((float) (local294 == null ? 0 : local294[local458] - 1));
									}
									if ((this.anInt2585 & 0x7) != 0) {
										local184.a(local607);
										local184.a(local601);
										local184.a(local609);
									}
								} else {
									local184.b((float) local523);
									local184.b((float) (local560 + this.method8077(local523, local533)));
									local184.b((float) local533);
									local184.b((float) local523);
									local184.b((float) local533);
									if (this.anIntArrayArrayArray2 != null) {
										local184.b((float) (local294 == null ? 0 : local294[local458] - 1));
									}
									if ((this.anInt2585 & 0x7) != 0) {
										local184.b(local607);
										local184.b(local601);
										local184.b(local609);
									}
								}
								if (this.aClass75_Sub1_8.anInt7674 == 0) {
									local189.f(local1021 | 0xFF000000);
								} else {
									local189.e(local1021 | 0xFF000000);
								}
								local957 = this.anInt2577++;
								local509[local458] = (short) local957;
								if (local547 != -1) {
									local193[local957] = local240[local458];
								}
								local212.method1399(new Class6_Sub52(local509[local458]), local578);
							} else {
								local509[local458] = ((Class6_Sub52) local916).aShort130;
								local957 = local509[local458] & 0xFFFF;
								if (local547 != -1 && local193[local957].aLong346 > local240[local458].aLong346) {
									local193[local957] = local240[local458];
								}
							}
							for (local1021 = 0; local1021 < local448; local1021++) {
								local216[local1021].method6046(local605, local590, local957, local831);
							}
							this.anInt2571++;
						}
					}
				}
			}
			for (local222 = 0; local222 < this.anInt2577; local222++) {
				@Pc(1419) Class6_Sub39 local1419 = local193[local222];
				if (local1419 != null) {
					local1419.method6043(local222);
				}
			}
			@Pc(1440) int local1440;
			@Pc(1459) int local1459;
			for (@Pc(1434) int local1434 = 0; super.anInt9255 > local1434; local1434++) {
				for (local1440 = 0; local1440 < super.anInt9257; local1440++) {
					@Pc(1453) short[] local1453 = this.aShortArrayArray5[super.anInt9255 * local1440 + local1434];
					if (local1453 != null) {
						@Pc(1457) int local1457 = 0;
						local1459 = 0;
						while (local1459 < local1453.length) {
							@Pc(1468) int local1468 = local1453[local1459++] & 0xFFFF;
							@Pc(1475) int local1475 = local1453[local1459++] & 0xFFFF;
							@Pc(1482) int local1482 = local1453[local1459++] & 0xFFFF;
							@Pc(1486) Class6_Sub39 local1486 = local193[local1468];
							@Pc(1490) Class6_Sub39 local1490 = local193[local1475];
							@Pc(1494) Class6_Sub39 local1494 = local193[local1482];
							@Pc(1496) Class6_Sub39 local1496 = null;
							if (local1486 != null) {
								local1496 = local1486;
								local1486.method6044(local1457, local1434, local1440);
							}
							if (local1490 != null) {
								local1490.method6044(local1457, local1434, local1440);
								if (local1496 == null || local1496.aLong346 > local1490.aLong346) {
									local1496 = local1490;
								}
							}
							if (local1494 != null) {
								local1494.method6044(local1457, local1434, local1440);
								if (local1496 == null || local1496.aLong346 > local1494.aLong346) {
									local1496 = local1494;
								}
							}
							if (local1496 != null) {
								if (local1486 != null) {
									local1496.method6043(local1468);
								}
								if (local1490 != null) {
									local1496.method6043(local1475);
								}
								if (local1494 != null) {
									local1496.method6043(local1482);
								}
								local1496.method6044(local1457, local1434, local1440);
							}
							local1457++;
						}
					}
				}
			}
			local184.a();
			local189.a();
			this.anInterface6_7 = this.aClass75_Sub1_8.method6768(false);
			this.anInterface6_7.method3660(local169, 4, this.anInt2577 * 4);
			this.anInterface6_8 = this.aClass75_Sub1_8.method6768(false);
			this.anInterface6_8.method3660(local179, local140, local140 * this.anInt2577);
			if ((this.anInt2585 & 0x7) == 0) {
				if (this.anIntArrayArrayArray2 == null) {
					this.aClass207_15 = this.aClass75_Sub1_8.method6803(new Class355[] { new Class355(new Class70[] { Static93.aClass70_1, Static93.aClass70_5 }), new Class355(Static93.aClass70_3) });
				} else {
					this.aClass207_15 = this.aClass75_Sub1_8.method6803(new Class355[] { new Class355(new Class70[] { Static93.aClass70_1, Static93.aClass70_5, Static93.aClass70_4 }), new Class355(Static93.aClass70_3) });
				}
			} else if (this.anIntArrayArrayArray2 == null) {
				this.aClass207_15 = this.aClass75_Sub1_8.method6803(new Class355[] { new Class355(new Class70[] { Static93.aClass70_1, Static93.aClass70_5, Static93.aClass70_2 }), new Class355(Static93.aClass70_3) });
			} else {
				this.aClass207_15 = this.aClass75_Sub1_8.method6803(new Class355[] { new Class355(new Class70[] { Static93.aClass70_1, Static93.aClass70_5, Static93.aClass70_4, Static93.aClass70_2 }), new Class355(Static93.aClass70_3) });
			}
			local1440 = 0;
			for (@Pc(1831) int local1831 = 0; local1831 < local108.length; local1831++) {
				if (local108[local1831].anInt6797 > 0) {
					local108[local1440++] = local108[local1831];
				}
			}
			this.aClass6_Sub39Array1 = new Class6_Sub39[local1440];
			@Pc(1864) long[] local1864 = new long[local1440];
			for (local1459 = 0; local1459 < local1440; local1459++) {
				@Pc(1874) Class6_Sub39 local1874 = local108[local1459];
				local1864[local1459] = local1874.aLong346;
				this.aClass6_Sub39Array1[local1459] = local1874;
				local1874.method6041(this.anInt2577);
			}
			Static487.method8938(this.aClass6_Sub39Array1, local1864);
			if (this.aClass33_2 != null) {
				this.aClass33_2.method450();
			}
		} else {
			this.aClass33_2 = null;
		}
		this.anIntArrayArrayArray2 = null;
		this.aClass74_13 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray4 = null;
		this.anIntArrayArrayArray3 = this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray4 = null;
		this.aByteArrayArray43 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass6_Sub39ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	@Override
	public void method8071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2526(arg5, arg1, arg3, arg6, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt9255][super.anInt9257][];
		}
		@Pc(25) Interface11 local25 = this.aClass75_Sub1_8.anInterface11_10;
		if (arg5 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[super.anInt9255][super.anInt9257][];
		}
		this.anIntArrayArrayArray3[arg0][arg1] = arg2;
		this.anIntArrayArrayArray6[arg0][arg1] = arg4;
		this.anIntArrayArrayArray4[arg0][arg1] = arg6;
		this.anIntArrayArrayArray7[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg3;
		}
		@Pc(104) Class6_Sub39[] local104 = this.aClass6_Sub39ArrayArrayArray1[arg0][arg1] = new Class6_Sub39[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt2585 & 0x20) != 0 && local114 != -1 && local25.method6027(local114).aBoolean625) {
				local118 = 128;
				local114 = -1;
			}
			@Pc(167) long local167 = (long) local114 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (local118 << 14);
			@Pc(173) Class6 local173;
			for (local173 = this.aClass74_13.method1401(local167); local173 != null; local173 = this.aClass74_13.method1407()) {
				@Pc(180) Class6_Sub39 local180 = (Class6_Sub39) local173;
				if (local114 == local180.anInt6799 && (float) local118 == local180.aFloat133 && local180.anInt6804 == arg10 && local180.anInt6809 == arg11 && local180.anInt6803 == arg12) {
					break;
				}
			}
			if (local173 == null) {
				local104[local106] = new Class6_Sub39(this, local114, local118, arg10, arg11, arg12);
				this.aClass74_13.method1399(local104[local106], local167);
			} else {
				local104[local106] = (Class6_Sub39) local173;
			}
		}
		if (arg13) {
			this.aByteArrayArray42[arg0][arg1] = (byte) (this.aByteArrayArray42[arg0][arg1] | 0x1);
		}
		if (this.anInt2589 < arg6.length) {
			this.anInt2589 = arg6.length;
		}
		this.anInt2588 += arg6.length;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8072(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass33_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (this.aClass75_Sub1_8.anInt7662 * arg2 >> 8) >> this.aClass75_Sub1_8.anInt7672;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass75_Sub1_8.anInt7666 >> 8) >> this.aClass75_Sub1_8.anInt7672;
			return this.aClass33_2.method453(local28, local42, arg0);
		}
	}
}
