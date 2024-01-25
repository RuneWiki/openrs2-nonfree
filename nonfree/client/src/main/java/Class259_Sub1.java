import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class259_Sub1 extends Class259 {

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
	private int anInt6614;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
	private int anInt6616;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	private int anInt6618;

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "Lclient!lq;")
	private Interface14 anInterface14_7;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
	private int anInt6619;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!lq;")
	private Interface14 anInterface14_8;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "[Lclient!ria;")
	private Class3_Sub51[] aClass3_Sub51Array1;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "Lclient!wh;")
	public Class36 aClass36_8;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "F")
	private float aFloat105 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "F")
	private float aFloat104 = -3.4028235E38F;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "Lclient!sja;")
	private final Class342 aClass342_51 = new Class342();

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!jca;")
	public final Class22_Sub2 aClass22_Sub2_12;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	private final int anInt6612;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
	private final int anInt6609;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
	public final int anInt6613;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "[[B")
	private final byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "[[[Lclient!ria;")
	private Class3_Sub51[][][] aClass3_Sub51ArrayArrayArray1;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "Lclient!qn;")
	private Class313 aClass313_35;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "Lclient!pja;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!jca;IIII[[I[[II)V")
	public Class259_Sub1(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass22_Sub2_12 = arg0;
		this.anInt6612 = super.anInt10943 - 2;
		this.anInt6609 = 0x1 << this.anInt6612;
		this.aByteArrayArray10 = new byte[arg3 + 1][arg4 + 1];
		this.anInt6613 = arg2;
		this.aByteArrayArray9 = new byte[arg3][arg4];
		this.aShortArrayArray3 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aClass3_Sub51ArrayArrayArray1 = new Class3_Sub51[arg3][arg4][];
		this.aFloatArrayArray13 = new float[super.anInt10949 + 1][super.anInt10946 + 1];
		this.aFloatArrayArray12 = new float[super.anInt10949 + 1][super.anInt10946 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aFloatArrayArray11 = new float[super.anInt10949 + 1][super.anInt10946 + 1];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt10946; local121++) {
			for (@Pc(127) int local127 = 0; super.anInt10949 >= local127; local127++) {
				@Pc(136) int local136 = super.anIntArrayArray68[local127][local121];
				if (this.aFloat104 < (float) local136) {
					this.aFloat104 = (float) local136;
				}
				if (this.aFloat105 > (float) local136) {
					this.aFloat105 = (float) local136;
				}
				if (local127 > 0 && local121 > 0 && super.anInt10949 > local127 && local121 < super.anInt10946) {
					@Pc(206) int local206 = arg6[local127 + 1][local121] - arg6[local127 - 1][local121];
					@Pc(223) int local223 = arg6[local127][local121 + 1] - arg6[local127][local121 - 1];
					@Pc(243) float local243 = (float) (1.0D / Math.sqrt((double) (local206 * local206 + arg7 * 4 * arg7 + local223 * local223)));
					this.aFloatArrayArray12[local127][local121] = (float) local206 * local243;
					this.aFloatArrayArray13[local127][local121] = (float) (-arg7 * 2) * local243;
					this.aFloatArrayArray11[local127][local121] = (float) local223 * local243;
				}
			}
		}
		this.aFloat105--;
		this.aFloat104++;
		this.aClass313_35 = new Class313(128);
		if ((this.anInt6613 & 0x10) != 0) {
			this.aClass291_1 = new Class291(this.aClass22_Sub2_12, this);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIIBI[[ZI)V")
	private void method5740(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[][] arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub51Array1 == null) {
			return;
		}
		@Pc(22) int local22 = arg6 + arg6 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (Static5.anIntArray7.length < local26) {
			Static5.anIntArray7 = new int[local26];
		}
		@Pc(40) int local40 = arg2 - arg6;
		@Pc(42) int local42 = local40;
		if (local40 < 0) {
			local40 = 0;
		}
		@Pc(51) int local51 = arg0 - arg6;
		@Pc(53) int local53 = local51;
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(61) int local61 = arg6 + arg2;
		if (local61 > super.anInt10949 - 1) {
			local61 = super.anInt10949 - 1;
		}
		@Pc(81) int local81 = arg0 + arg6;
		if (super.anInt10946 - 1 < local81) {
			local81 = super.anInt10946 - 1;
		}
		Static49.anInt1326 = 0;
		for (@Pc(100) int local100 = local40; local100 <= local61; local100++) {
			@Pc(109) boolean[] local109 = arg5[local100 - local42];
			for (@Pc(111) int local111 = local51; local111 <= local81; local111++) {
				if (local109[local111 - local53]) {
					Static5.anIntArray7[Static49.anInt1326++] = local100 + local111 * super.anInt10949;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass22_Sub2_12.method8923();
		} else {
			this.aClass22_Sub2_12.method8909((float) arg3);
			this.aClass22_Sub2_12.method8887();
		}
		this.aClass22_Sub2_12.method8905();
		this.aClass22_Sub2_12.method8927((this.anInt6613 & 0x7) != 0);
		this.aClass22_Sub2_12.method8979(false, false, -1);
		this.aClass22_Sub2_12.method8912(this.anInterface14_7, 0);
		for (@Pc(207) int local207 = 0; local207 < this.aClass3_Sub51Array1.length; local207++) {
			this.aClass3_Sub51Array1[local207].method7340(Static5.anIntArray7, Static49.anInt1326);
		}
		@Pc(230) Class58_Sub2 local230 = this.aClass22_Sub2_12.method8965();
		local230.method9524(0, -1, 0);
		this.aClass22_Sub2_12.method8926();
		if (!this.aClass342_51.method7652()) {
			@Pc(250) int local250 = this.aClass22_Sub2_12.anInt10487;
			@Pc(254) int local254 = this.aClass22_Sub2_12.anInt10480;
			this.aClass22_Sub2_12.L(0, local254, this.aClass22_Sub2_12.anInt10458);
			this.aClass22_Sub2_12.method8927(false);
			this.aClass22_Sub2_12.method8902(false);
			this.aClass22_Sub2_12.method8978(128);
			this.aClass22_Sub2_12.method8979(false, false, -2);
			this.aClass22_Sub2_12.method8976(this.aClass22_Sub2_12.anInterface21_3);
			this.aClass22_Sub2_12.method8914(Static468.aClass372_3, Static503.aClass372_4);
			this.aClass22_Sub2_12.method8962(Static547.aClass392_3, 0);
			this.aClass22_Sub2_12.method8897(Static407.aClass392_2, 0);
			for (@Pc(314) Class3 local314 = this.aClass342_51.method7644(); local314 != null; local314 = this.aClass342_51.method7650()) {
				@Pc(319) Class3_Sub21 local319 = (Class3_Sub21) local314;
				local319.method2293(arg5, arg2, arg0, arg6);
			}
			this.aClass22_Sub2_12.method8962(Static358.aClass392_1, 0);
			this.aClass22_Sub2_12.method8897(Static358.aClass392_1, 0);
			this.aClass22_Sub2_12.method8976((Interface21) null);
			this.aClass22_Sub2_12.L(local250, local254, this.aClass22_Sub2_12.anInt10458);
		}
		if (this.aClass291_1 == null) {
			return;
		}
		this.aClass22_Sub2_12.method8912(this.anInterface14_7, 0);
		this.aClass22_Sub2_12.method8912(this.anInterface14_8, 1);
		this.aClass22_Sub2_12.method8894(this.aClass36_8);
		this.aClass291_1.method6843(arg5, arg6, arg0, arg1, arg2);
		return;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method9293(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6618 <= 0) {
			return;
		}
		@Pc(20) Interface11 local20 = this.aClass22_Sub2_12.method8971(this.anInt6616);
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 32767;
		@Pc(26) int local26 = -32768;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			local22 = 0;
			@Pc(39) Buffer local39 = local20.method5367();
			if (local39 != null) {
				@Pc(47) Stream local47 = this.aClass22_Sub2_12.method8918(local39);
				@Pc(51) int local51;
				@Pc(60) int local60;
				@Pc(62) int local62;
				@Pc(83) short[] local83;
				@Pc(87) int local87;
				@Pc(95) int local95;
				if (Stream.c()) {
					for (local51 = arg1; local51 < arg3; local51++) {
						local60 = local51 * super.anInt10949 + arg0;
						for (local62 = arg0; local62 < arg2; local62++) {
							if (arg4[local62 - arg0][local51 - arg1]) {
								local83 = this.aShortArrayArray3[local60];
								if (local83 != null) {
									for (local87 = 0; local87 < local83.length; local87++) {
										local95 = local83[local87] & 0xFFFF;
										if (local95 < local24) {
											local24 = local95;
										}
										local47.d(local95);
										if (local95 > local26) {
											local26 = local95;
										}
										local22++;
									}
								}
							}
							local60++;
						}
					}
				} else {
					for (local51 = arg1; local51 < arg3; local51++) {
						local60 = arg0 + local51 * super.anInt10949;
						for (local62 = arg0; local62 < arg2; local62++) {
							if (arg4[local62 - arg0][local51 - arg1]) {
								local83 = this.aShortArrayArray3[local60];
								if (local83 != null) {
									for (local87 = 0; local87 < local83.length; local87++) {
										local95 = local83[local87] & 0xFFFF;
										local22++;
										if (local26 < local95) {
											local26 = local95;
										}
										if (local95 < local24) {
											local24 = local95;
										}
										local47.a(local95);
									}
								}
							}
							local60++;
						}
					}
				}
				local47.b();
				if (local20.method5366()) {
					break;
				}
			}
		}
		if (local22 <= 0) {
			return;
		}
		this.aClass22_Sub2_12.method8892();
		this.aClass22_Sub2_12.method8898(false);
		this.aClass22_Sub2_12.method8927(false);
		this.aClass22_Sub2_12.method8862(false);
		this.aClass22_Sub2_12.method8902(false);
		this.aClass22_Sub2_12.method8978(0);
		this.aClass22_Sub2_12.method8979(false, false, -2);
		this.aClass22_Sub2_12.method8976((Interface21) null);
		@Pc(311) Class58_Sub2 local311 = this.aClass22_Sub2_12.method8965();
		@Pc(316) float[] local316 = this.aClass22_Sub2_12.method8952();
		local316[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass22_Sub2_12.anInt10377;
		local316[1] = 0.0F;
		local316[2] = 0.0F;
		local316[5] = (float) 1024 / ((float) this.aClass22_Sub2_12.anInt10377 * (float) super.anInt10947 * 128.0F);
		local316[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass22_Sub2_12.anInt10347) - 1.0F;
		local316[15] = 1.0F;
		local316[14] = -this.aFloat105 / (this.aFloat104 - this.aFloat105);
		local316[4] = 0.0F;
		local316[6] = 0.0F;
		local316[7] = 0.0F;
		local316[9] = 0.0F;
		local316[11] = 0.0F;
		local316[10] = 1.0F / (this.aFloat104 - this.aFloat105);
		local316[0] = (float) 1024 / ((float) super.anInt10947 * 128.0F * (float) this.aClass22_Sub2_12.anInt10347);
		local316[8] = 0.0F;
		local316[3] = 0.0F;
		local311.method6113(1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		this.aClass22_Sub2_12.method8949();
		this.aClass22_Sub2_12.method8926();
		if ((this.anInt6613 & 0x7) == 0) {
			this.aClass22_Sub2_12.method8927(false);
		} else {
			this.aClass22_Sub2_12.method8927(true);
			this.aClass22_Sub2_12.method8928();
		}
		this.aClass22_Sub2_12.method8933(false);
		this.aClass22_Sub2_12.method8912(this.anInterface14_7, 0);
		this.aClass22_Sub2_12.method8912(this.anInterface14_8, 1);
		this.aClass22_Sub2_12.method8894(this.aClass36_8);
		this.aClass22_Sub2_12.method8861(Static492.aClass234_6, local24, local22 / 3, local26 + 1 - local24, 0, local20);
		this.aClass22_Sub2_12.method8933(true);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!oja;I)V")
	private void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub17_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray11[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray8[arg1][arg0];
		@Pc(30) int local30 = local12.length;
		if (Static618.anIntArray800.length < local30) {
			Static558.anIntArray622 = new int[local30];
			Static618.anIntArray800 = new int[local30];
		}
		for (@Pc(48) int local48 = 0; local48 < local30; local48++) {
			Static618.anIntArray800[local48] = local12[local48] >> this.aClass22_Sub2_12.anInt10462;
			Static558.anIntArray622[local48] = local19[local48] >> this.aClass22_Sub2_12.anInt10462;
		}
		@Pc(78) int local78 = 0;
		while (local30 > local78) {
			@Pc(86) int local86 = Static618.anIntArray800[local78];
			@Pc(91) int local91 = Static558.anIntArray622[local78++];
			@Pc(95) int local95 = Static618.anIntArray800[local78];
			@Pc(100) int local100 = Static558.anIntArray622[local78++];
			@Pc(104) int local104 = Static618.anIntArray800[local78];
			@Pc(109) int local109 = Static558.anIntArray622[local78++];
			if (-((local100 - local91) * (local104 + -local95)) + (local100 - local109) * (-local95 + local86) > 0) {
				arg2.method6366(local91, local95, local104, local109, local86, local100);
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass291_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass22_Sub2_12.anInt10490 >> 8) >> this.aClass22_Sub2_12.anInt10462;
			@Pc(42) int local42 = arg3 - (this.aClass22_Sub2_12.anInt10486 * arg2 >> 8) >> this.aClass22_Sub2_12.anInt10462;
			this.aClass291_1.method6850(local27, arg0, local42);
		}
	}

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt10949][super.anInt10946][];
		}
		@Pc(25) Interface4 local25 = this.aClass22_Sub2_12.anInterface4_14;
		if (arg5 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt10949][super.anInt10946][];
		}
		this.anIntArrayArrayArray11[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg6;
		this.anIntArrayArrayArray6[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg3;
		}
		@Pc(104) Class3_Sub51[] local104 = this.aClass3_Sub51ArrayArrayArray1[arg0][arg1] = new Class3_Sub51[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt6613 & 0x20) != 0 && local114 != -1 && local25.method5761(local114).aBoolean761) {
				local118 = 128;
				local114 = -1;
			}
			@Pc(164) long local164 = (long) (local118 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) local114;
			@Pc(170) Class3 local170;
			for (local170 = this.aClass313_35.method7104(local164); local170 != null; local170 = this.aClass313_35.method7106()) {
				@Pc(177) Class3_Sub51 local177 = (Class3_Sub51) local170;
				if (local114 == local177.anInt8584 && (float) local118 == local177.aFloat133 && arg10 == local177.anInt8579 && arg11 == local177.anInt8590 && local177.anInt8585 == arg12) {
					break;
				}
			}
			if (local170 == null) {
				local104[local106] = new Class3_Sub51(this, local114, local118, arg10, arg11, arg12);
				this.aClass313_35.method7107(local164, local104[local106]);
			} else {
				local104[local106] = (Class3_Sub51) local170;
			}
		}
		if (arg13) {
			this.aByteArrayArray9[arg0][arg1] = (byte) (this.aByteArrayArray9[arg0][arg1] | 0x1);
		}
		if (this.anInt6619 < arg6.length) {
			this.anInt6619 = arg6.length;
		}
		this.anInt6618 += arg6.length;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!jw;[I)V")
	@Override
	public void method9296(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass342_51.method7654(new Class3_Sub21(this.aClass22_Sub2_12, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ne", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt6618 <= 0) {
			this.aClass291_1 = null;
		} else {
			@Pc(28) byte[][] local28 = new byte[super.anInt10949 + 1][super.anInt10946 + 1];
			for (@Pc(30) int local30 = 1; super.anInt10949 > local30; local30++) {
				for (@Pc(36) int local36 = 1; local36 < super.anInt10946; local36++) {
					local28[local30][local36] = (byte) ((this.aByteArrayArray10[local30][local36] >> 1) + (this.aByteArrayArray10[local30][local36 + 1] >> 3) + (this.aByteArrayArray10[local30 + -1][local36] >> 2) + (this.aByteArrayArray10[local30 + 1][local36] >> 3) + (this.aByteArrayArray10[local30][local36 + -1] >> 2));
				}
			}
			@Pc(122) Class3_Sub51[] local122 = new Class3_Sub51[this.aClass313_35.method7108()];
			this.aClass313_35.method7105(local122);
			for (@Pc(132) int local132 = 0; local132 < local122.length; local132++) {
				local122[local132].method7337(this.anInt6618);
			}
			@Pc(154) int local154 = 20;
			if (this.anIntArrayArrayArray10 != null) {
				local154 += 4;
			}
			if ((this.anInt6613 & 0x7) != 0) {
				local154 += 12;
			}
			@Pc(180) NativeHeapBuffer local180 = this.aClass22_Sub2_12.aNativeHeap6.a(this.anInt6618 * 4, false);
			@Pc(190) NativeHeapBuffer local190 = this.aClass22_Sub2_12.aNativeHeap6.a(local154 * this.anInt6618, false);
			@Pc(195) Stream local195 = new Stream(local190);
			@Pc(200) Stream local200 = new Stream(local180);
			@Pc(204) Class3_Sub51[] local204 = new Class3_Sub51[this.anInt6618];
			@Pc(211) int local211 = Static70.method3137(this.anInt6618 / 4);
			if (local211 < 1) {
				local211 = 1;
			}
			@Pc(221) Class313 local221 = new Class313(local211);
			@Pc(225) Class3_Sub51[] local225 = new Class3_Sub51[this.anInt6619];
			@Pc(231) int local231;
			for (@Pc(227) int local227 = 0; local227 < super.anInt10949; local227++) {
				for (local231 = 0; local231 < super.anInt10946; local231++) {
					if (this.anIntArrayArrayArray9[local227][local231] != null) {
						@Pc(249) Class3_Sub51[] local249 = this.aClass3_Sub51ArrayArrayArray1[local227][local231];
						@Pc(256) int[] local256 = this.anIntArrayArrayArray11[local227][local231];
						@Pc(263) int[] local263 = this.anIntArrayArrayArray8[local227][local231];
						@Pc(270) int[] local270 = this.anIntArrayArrayArray6[local227][local231];
						@Pc(277) int[] local277 = this.anIntArrayArrayArray9[local227][local231];
						@Pc(290) int[] local290 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local227][local231];
						@Pc(303) int[] local303 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local227][local231];
						if (local270 == null) {
							local270 = local277;
						}
						@Pc(314) float local314 = this.aFloatArrayArray12[local227][local231];
						@Pc(321) float local321 = this.aFloatArrayArray13[local227][local231];
						@Pc(328) float local328 = this.aFloatArrayArray11[local227][local231];
						@Pc(337) float local337 = this.aFloatArrayArray12[local227][local231 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray13[local227][local231 + 1];
						@Pc(355) float local355 = this.aFloatArrayArray11[local227][local231 + 1];
						@Pc(366) float local366 = this.aFloatArrayArray12[local227 + 1][local231 + 1];
						@Pc(377) float local377 = this.aFloatArrayArray13[local227 + 1][local231 + 1];
						@Pc(388) float local388 = this.aFloatArrayArray11[local227 + 1][local231 + 1];
						@Pc(397) float local397 = this.aFloatArrayArray12[local227 + 1][local231];
						@Pc(406) float local406 = this.aFloatArrayArray13[local227 + 1][local231];
						@Pc(415) float local415 = this.aFloatArrayArray11[local227 + 1][local231];
						@Pc(423) int local423 = local28[local227][local231] & 0xFF;
						@Pc(433) int local433 = local28[local227][local231 + 1] & 0xFF;
						@Pc(445) int local445 = local28[local227 + 1][local231 + 1] & 0xFF;
						@Pc(455) int local455 = local28[local227 + 1][local231] & 0xFF;
						@Pc(457) int local457 = 0;
						@Pc(467) int local467;
						label355: for (@Pc(459) int local459 = 0; local459 < local277.length; local459++) {
							@Pc(465) Class3_Sub51 local465 = local249[local459];
							for (local467 = 0; local467 < local457; local467++) {
								if (local225[local467] == local465) {
									continue label355;
								}
							}
							local225[local457++] = local465;
						}
						@Pc(522) short[] local522 = this.aShortArrayArray3[local227 + local231 * super.anInt10949] = new short[local277.length];
						for (local467 = 0; local467 < local277.length; local467++) {
							@Pc(536) int local536 = (local227 << super.anInt10943) + local256[local467];
							@Pc(546) int local546 = (local231 << super.anInt10943) + local263[local467];
							@Pc(551) int local551 = local536 >> this.anInt6612;
							@Pc(556) int local556 = local546 >> this.anInt6612;
							@Pc(560) int local560 = local277[local467];
							@Pc(564) int local564 = local270[local467];
							@Pc(573) int local573 = local290 == null ? 0 : local290[local467];
							@Pc(591) long local591 = (long) (local551 << 16) | (long) local564 << 48 | (long) local560 << 32 | (long) local556;
							@Pc(595) int local595 = local256[local467];
							@Pc(599) int local599 = local263[local467];
							@Pc(601) byte local601 = 74;
							@Pc(603) int local603 = 0;
							@Pc(664) float local664;
							@Pc(658) float local658;
							@Pc(666) float local666;
							@Pc(700) float local700;
							@Pc(662) int local662;
							if (local595 == 0 && local599 == 0) {
								local666 = local328;
								local662 = local601 - local423;
								local664 = local314;
								local658 = local321;
							} else if (local595 == 0 && super.anInt10947 == local599) {
								local662 = local601 - local433;
								local658 = local346;
								local666 = local355;
								local664 = local337;
							} else if (super.anInt10947 == local595 && super.anInt10947 == local599) {
								local662 = local601 - local445;
								local658 = local377;
								local666 = local388;
								local664 = local366;
							} else if (local595 == super.anInt10947 && local599 == 0) {
								local658 = local406;
								local662 = local601 - local455;
								local664 = local397;
								local666 = local415;
							} else {
								@Pc(675) float local675 = (float) local595 / (float) super.anInt10947;
								@Pc(682) float local682 = (float) local599 / (float) super.anInt10947;
								@Pc(691) float local691 = (local397 - local314) * local675 + local314;
								local700 = (local406 - local321) * local675 + local321;
								@Pc(708) float local708 = local328 + (local415 - local328) * local675;
								@Pc(717) float local717 = local337 + local675 * (local366 - local337);
								@Pc(725) float local725 = local346 + (local377 - local346) * local675;
								local658 = local700 + (local725 - local700) * local682;
								@Pc(742) float local742 = (local388 - local355) * local675 + local355;
								local664 = (local717 - local691) * local682 + local691;
								local666 = local682 * (local742 - local708) + local708;
								@Pc(770) int local770 = (local595 * (local455 - local423) >> super.anInt10943) + local423;
								@Pc(783) int local783 = local433 + ((local445 - local433) * local595 >> super.anInt10943);
								local662 = local601 - local770 - (local599 * (local783 - local770) >> super.anInt10943);
							}
							@Pc(835) float local835 = 1.0F;
							if (local560 != -1) {
								@Pc(846) int local846 = (local560 & 0x7F) * local662 >> 7;
								if (local846 < 2) {
									local846 = 2;
								} else if (local846 > 126) {
									local846 = 126;
								}
								local603 = Static537.anIntArray601[local560 & 0xFF80 | local846];
								if ((this.anInt6613 & 0x7) == 0) {
									local835 = local666 * this.aClass22_Sub2_12.aFloatArray72[2] + this.aClass22_Sub2_12.aFloatArray72[1] * local658 + this.aClass22_Sub2_12.aFloatArray72[0] * local664;
									local835 = this.aClass22_Sub2_12.aFloat182 + (local835 > 0.0F ? this.aClass22_Sub2_12.aFloat188 : this.aClass22_Sub2_12.aFloat190) * local835;
								}
							}
							@Pc(923) Class3 local923 = null;
							if ((this.anInt6609 - 1 & local536) == 0 && (this.anInt6609 - 1 & local546) == 0) {
								local923 = local221.method7104(local591);
							}
							@Pc(964) int local964;
							@Pc(1028) int local1028;
							if (local923 == null) {
								if (local564 == local560) {
									local1028 = local603;
								} else {
									@Pc(1002) int local1002 = local662 * (local564 & 0x7F) >> 7;
									if (local1002 < 2) {
										local1002 = 2;
									} else if (local1002 > 126) {
										local1002 = 126;
									}
									local1028 = Static537.anIntArray601[local1002 | local564 & 0xFF80];
									if ((this.anInt6613 & 0x7) == 0) {
										local700 = this.aClass22_Sub2_12.aFloatArray72[2] * local666 + this.aClass22_Sub2_12.aFloatArray72[0] * local664 + local658 * this.aClass22_Sub2_12.aFloatArray72[1];
										local700 = (local835 > 0.0F ? this.aClass22_Sub2_12.aFloat188 : this.aClass22_Sub2_12.aFloat190) * local835 + this.aClass22_Sub2_12.aFloat182;
										@Pc(1085) int local1085 = local1028 >> 16 & 0xFF;
										@Pc(1091) int local1091 = local1028 >> 8 & 0xFF;
										@Pc(1095) int local1095 = local1028 & 0xFF;
										local1085 = (int) ((float) local1085 * local700);
										local1091 = (int) ((float) local1091 * local700);
										if (local1085 < 0) {
											local1085 = 0;
										} else if (local1085 > 255) {
											local1085 = 255;
										}
										local1095 = (int) ((float) local1095 * local700);
										if (local1091 < 0) {
											local1091 = 0;
										} else if (local1091 > 255) {
											local1091 = 255;
										}
										if (local1095 < 0) {
											local1095 = 0;
										} else if (local1095 > 255) {
											local1095 = 255;
										}
										local1028 = local1085 << 16 | local1091 << 8 | local1095;
									}
								}
								if (Stream.c()) {
									local195.a((float) local536);
									local195.a((float) (local573 + this.method9294(local546, local536)));
									local195.a((float) local546);
									local195.a((float) local536);
									local195.a((float) local546);
									if (this.anIntArrayArrayArray10 != null) {
										local195.a((float) (local303 == null ? 0 : local303[local467] - 1));
									}
									if ((this.anInt6613 & 0x7) != 0) {
										local195.a(local664);
										local195.a(local658);
										local195.a(local666);
									}
								} else {
									local195.b((float) local536);
									local195.b((float) (this.method9294(local546, local536) + local573));
									local195.b((float) local546);
									local195.b((float) local536);
									local195.b((float) local546);
									if (this.anIntArrayArrayArray10 != null) {
										local195.b((float) (local303 == null ? 0 : local303[local467] - 1));
									}
									if ((this.anInt6613 & 0x7) != 0) {
										local195.b(local664);
										local195.b(local658);
										local195.b(local666);
									}
								}
								if (this.aClass22_Sub2_12.anInt10482 == 0) {
									local200.e(local1028 | 0xFF000000);
								} else {
									local200.c(local1028 | 0xFF000000);
								}
								local964 = this.anInt6614++;
								local522[local467] = (short) local964;
								if (local560 != -1) {
									local204[local964] = local249[local467];
								}
								local221.method7107(local591, new Class3_Sub11(local522[local467]));
							} else {
								local522[local467] = ((Class3_Sub11) local923).aShort25;
								local964 = local522[local467] & 0xFFFF;
								if (local560 != -1 && local204[local964].aLong345 > local249[local467].aLong345) {
									local204[local964] = local249[local467];
								}
							}
							for (local1028 = 0; local1028 < local457; local1028++) {
								local225[local1028].method7333(local603, local835, local662, local964);
							}
							this.anInt6616++;
						}
					}
				}
			}
			for (local231 = 0; local231 < this.anInt6614; local231++) {
				@Pc(1436) Class3_Sub51 local1436 = local204[local231];
				if (local1436 != null) {
					local1436.method7335(local231);
				}
			}
			@Pc(1457) int local1457;
			@Pc(1475) int local1475;
			for (@Pc(1451) int local1451 = 0; super.anInt10949 > local1451; local1451++) {
				for (local1457 = 0; local1457 < super.anInt10946; local1457++) {
					@Pc(1469) short[] local1469 = this.aShortArrayArray3[local1451 + local1457 * super.anInt10949];
					if (local1469 != null) {
						@Pc(1473) int local1473 = 0;
						local1475 = 0;
						while (local1475 < local1469.length) {
							@Pc(1484) int local1484 = local1469[local1475++] & 0xFFFF;
							@Pc(1491) int local1491 = local1469[local1475++] & 0xFFFF;
							@Pc(1498) int local1498 = local1469[local1475++] & 0xFFFF;
							@Pc(1502) Class3_Sub51 local1502 = local204[local1484];
							@Pc(1506) Class3_Sub51 local1506 = local204[local1491];
							@Pc(1510) Class3_Sub51 local1510 = local204[local1498];
							@Pc(1512) Class3_Sub51 local1512 = null;
							if (local1502 != null) {
								local1512 = local1502;
								local1502.method7339(local1457, local1473, local1451);
							}
							if (local1506 != null) {
								local1506.method7339(local1457, local1473, local1451);
								if (local1512 == null || local1512.aLong345 > local1506.aLong345) {
									local1512 = local1506;
								}
							}
							if (local1510 != null) {
								local1510.method7339(local1457, local1473, local1451);
								if (local1512 == null || local1512.aLong345 > local1510.aLong345) {
									local1512 = local1510;
								}
							}
							if (local1512 != null) {
								if (local1502 != null) {
									local1512.method7335(local1484);
								}
								if (local1506 != null) {
									local1512.method7335(local1491);
								}
								if (local1510 != null) {
									local1512.method7335(local1498);
								}
								local1512.method7339(local1457, local1473, local1451);
							}
							local1473++;
						}
					}
				}
			}
			local195.b();
			local200.b();
			this.anInterface14_8 = this.aClass22_Sub2_12.method8937(false);
			this.anInterface14_8.method6765(4, this.anInt6614 * 4, local180);
			this.anInterface14_7 = this.aClass22_Sub2_12.method8937(false);
			this.anInterface14_7.method6765(local154, local154 * this.anInt6614, local190);
			if ((this.anInt6613 & 0x7) == 0) {
				if (this.anIntArrayArrayArray10 == null) {
					this.aClass36_8 = this.aClass22_Sub2_12.method8944(new Class95[] { new Class95(new Class278[] { Static469.aClass278_1, Static469.aClass278_5 }), new Class95(Static469.aClass278_3) });
				} else {
					this.aClass36_8 = this.aClass22_Sub2_12.method8944(new Class95[] { new Class95(new Class278[] { Static469.aClass278_1, Static469.aClass278_5, Static469.aClass278_4 }), new Class95(Static469.aClass278_3) });
				}
			} else if (this.anIntArrayArrayArray10 == null) {
				this.aClass36_8 = this.aClass22_Sub2_12.method8944(new Class95[] { new Class95(new Class278[] { Static469.aClass278_1, Static469.aClass278_5, Static469.aClass278_2 }), new Class95(Static469.aClass278_3) });
			} else {
				this.aClass36_8 = this.aClass22_Sub2_12.method8944(new Class95[] { new Class95(new Class278[] { Static469.aClass278_1, Static469.aClass278_5, Static469.aClass278_4, Static469.aClass278_2 }), new Class95(Static469.aClass278_3) });
			}
			local1457 = 0;
			for (@Pc(1848) int local1848 = 0; local1848 < local122.length; local1848++) {
				if (local122[local1848].anInt8580 > 0) {
					local122[local1457++] = local122[local1848];
				}
			}
			this.aClass3_Sub51Array1 = new Class3_Sub51[local1457];
			@Pc(1885) long[] local1885 = new long[local1457];
			for (local1475 = 0; local1475 < local1457; local1475++) {
				@Pc(1897) Class3_Sub51 local1897 = local122[local1475];
				local1885[local1475] = local1897.aLong345;
				this.aClass3_Sub51Array1[local1475] = local1897;
				local1897.method7338(this.anInt6614);
			}
			Static191.method2978(this.aClass3_Sub51Array1, local1885);
			if (this.aClass291_1 != null) {
				this.aClass291_1.method6848();
			}
		}
		this.aClass3_Sub51ArrayArrayArray1 = null;
		this.aClass313_35 = null;
		this.anIntArrayArrayArray11 = this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray9 = null;
		this.aByteArrayArray10 = null;
		this.anIntArrayArrayArray7 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray13 = this.aFloatArrayArray11 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method9297(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass291_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (this.aClass22_Sub2_12.anInt10490 * arg2 >> 8) >> this.aClass22_Sub2_12.anInt10462;
			@Pc(43) int local43 = arg3 - (this.aClass22_Sub2_12.anInt10486 * arg2 >> 8) >> this.aClass22_Sub2_12.anInt10462;
			return this.aClass291_1.method6847(local43, local28, arg0);
		}
	}

	@OriginalMember(owner = "client!ne", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray10[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray10[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method9300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5740(arg1, arg4, arg0, arg5, arg6, arg3, arg2);
	}

	@OriginalMember(owner = "client!ne", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass291_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (this.aClass22_Sub2_12.anInt10490 * arg2 >> 8) >> this.aClass22_Sub2_12.anInt10462;
			@Pc(42) int local42 = arg3 - (this.aClass22_Sub2_12.anInt10486 * arg2 >> 8) >> this.aClass22_Sub2_12.anInt10462;
			this.aClass291_1.method6845(arg0, local42, local27);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	@Override
	public void method9298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ne", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub17 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(25) int local25 = super.anInt10947 >> this.aClass22_Sub2_12.anInt10462;
		@Pc(28) Class3_Sub7_Sub17_Sub1 local28 = (Class3_Sub7_Sub17_Sub1) arg2;
		@Pc(40) Class3_Sub7_Sub17_Sub1 local40;
		if (local28 != null && local28.method6364(local25, local25)) {
			local40 = local28;
			local28.method6368();
		} else {
			local40 = new Class3_Sub7_Sub17_Sub1(this.aClass22_Sub2_12, local25, local25);
		}
		local40.method6363(0, 0, local25, local25);
		this.method5742(arg1, arg0, local40);
		return local40;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method9292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method9301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5740(arg1, arg4, arg0, -1, arg5, arg3, arg2);
	}
}
