import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
	private int anInt5886;

	@OriginalMember(owner = "client!ni", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
	private int anInt5891;

	@OriginalMember(owner = "client!ni", name = "X", descriptor = "Lclient!bca;")
	private Interface4 anInterface4_8;

	@OriginalMember(owner = "client!ni", name = "Y", descriptor = "Lclient!bca;")
	private Interface4 anInterface4_9;

	@OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
	private int anInt5895;

	@OriginalMember(owner = "client!ni", name = "ab", descriptor = "Lclient!rd;")
	public Class284 aClass284_13;

	@OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
	private int anInt5896;

	@OriginalMember(owner = "client!ni", name = "gb", descriptor = "[Lclient!qn;")
	private Class1_Sub43[] aClass1_Sub43Array1;

	@OriginalMember(owner = "client!ni", name = "L", descriptor = "F")
	private float aFloat134 = -3.4028235E38F;

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "F")
	private float aFloat133 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "Lclient!wba;")
	private final Class353 aClass353_40 = new Class353();

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!hea;")
	public final Class134_Sub1 aClass134_Sub1_14;

	@OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
	private final int anInt5889;

	@OriginalMember(owner = "client!ni", name = "U", descriptor = "[[B")
	private final byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
	public final int anInt5888;

	@OriginalMember(owner = "client!ni", name = "W", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ni", name = "S", descriptor = "[[[Lclient!qn;")
	private Class1_Sub43[][][] aClass1_Sub43ArrayArrayArray1;

	@OriginalMember(owner = "client!ni", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ni", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
	private final int anInt5884;

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ni", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ni", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!ni", name = "I", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ni", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!ni", name = "cb", descriptor = "Lclient!kea;")
	private Class187 aClass187_24;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Lclient!wp;")
	private Class361 aClass361_2;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!hea;IIII[[I[[II)V")
	public Class47_Sub2(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass134_Sub1_14 = arg0;
		this.anInt5889 = super.anInt9205 - 2;
		this.aByteArrayArray24 = new byte[arg3][arg4];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anInt5888 = arg2;
		this.aShortArrayArray3 = new short[arg4 * arg3][];
		this.aClass1_Sub43ArrayArrayArray1 = new Class1_Sub43[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt9209 + 1][super.anInt9210 + 1];
		this.anInt5884 = 0x1 << this.anInt5889;
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt9209 + 1][super.anInt9210 + 1];
		this.aFloatArrayArray5 = new float[super.anInt9209 + 1][super.anInt9210 + 1];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aByteArrayArray25 = new byte[arg3 + 1][arg4 + 1];
		for (@Pc(121) int local121 = 0; super.anInt9210 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9209; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray197[local125][local121];
				if (this.aFloat133 > (float) local134) {
					this.aFloat133 = local134;
				}
				if (this.aFloat134 < (float) local134) {
					this.aFloat134 = local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt9209 > local125 && local121 < super.anInt9210) {
					@Pc(193) int local193 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(210) int local210 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(229) float local229 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local193 * local193 + local210 * local210)));
					this.aFloatArrayArray7[local125][local121] = local229 * (float) local193;
					this.aFloatArrayArray6[local125][local121] = local229 * (float) (-arg7 * 2);
					this.aFloatArrayArray5[local125][local121] = (float) local210 * local229;
				}
			}
		}
		this.aFloat133--;
		this.aFloat134++;
		this.aClass187_24 = new Class187(128);
		if ((this.anInt5888 & 0x10) != 0) {
			this.aClass361_2 = new Class361(this.aClass134_Sub1_14, this);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!uj;III)V")
	private void method4829(@OriginalArg(0) Class1_Sub6_Sub5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray9[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray11[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (Static95.anIntArray179.length < local22) {
			Static483.anIntArray623 = new int[local22];
			Static95.anIntArray179 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static95.anIntArray179[local34] = local12[local34] >> this.aClass134_Sub1_14.anInt8441;
			Static483.anIntArray623[local34] = local19[local34] >> this.aClass134_Sub1_14.anInt8441;
		}
		@Pc(66) int local66 = 0;
		while (local22 > local66) {
			@Pc(72) int local72 = Static95.anIntArray179[local66];
			@Pc(77) int local77 = Static483.anIntArray623[local66++];
			@Pc(81) int local81 = Static95.anIntArray179[local66];
			@Pc(86) int local86 = Static483.anIntArray623[local66++];
			@Pc(90) int local90 = Static95.anIntArray179[local66];
			@Pc(95) int local95 = Static483.anIntArray623[local66++];
			if (-((local90 - local81) * (local86 + -local77)) + (local72 - local81) * (local86 - local95) > 0) {
				arg0.method7297(local90, local72, local86, local81, local95, local77);
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray25[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ni", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass361_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass134_Sub1_14.anInt8428 * arg2 >> 8) >> this.aClass134_Sub1_14.anInt8441;
			@Pc(37) int local37 = arg3 - (this.aClass134_Sub1_14.anInt8445 * arg2 >> 8) >> this.aClass134_Sub1_14.anInt8441;
			this.aClass361_2.method7825(local37, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7548(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5895 <= 0) {
			return;
		}
		@Pc(16) Interface20 local16 = this.aClass134_Sub1_14.method6828(this.anInt5886);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method7387();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass134_Sub1_14.method6846(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = local45 * super.anInt9209 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray3[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local41.c(local87);
										local18++;
										if (local20 > local87) {
											local20 = local87;
										}
										if (local22 < local87) {
											local22 = local87;
										}
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9209 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray3[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local87 > local22) {
											local22 = local87;
										}
										local41.a(local87);
										local18++;
										if (local87 < local20) {
											local20 = local87;
										}
									}
								}
							}
							local54++;
						}
					}
				}
				local41.a();
				if (local16.method7389()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass134_Sub1_14.method6849();
		this.aClass134_Sub1_14.method6782(false);
		this.aClass134_Sub1_14.method6735(false);
		this.aClass134_Sub1_14.method6731(false);
		this.aClass134_Sub1_14.method6827(false);
		this.aClass134_Sub1_14.method6746(0);
		this.aClass134_Sub1_14.method6857(false, false, -2);
		this.aClass134_Sub1_14.method6766(null);
		@Pc(277) Class113_Sub3 local277 = this.aClass134_Sub1_14.method6764();
		@Pc(282) float[] local282 = this.aClass134_Sub1_14.method6725();
		local282[2] = 0.0F;
		local282[5] = (float) 1024 / ((float) this.aClass134_Sub1_14.anInt8356 * (float) super.anInt9208 * 128.0F);
		local282[10] = 1.0F / (this.aFloat134 - this.aFloat133);
		local282[15] = 1.0F;
		local282[11] = 0.0F;
		local282[0] = (float) 1024 / ((float) super.anInt9208 * 128.0F * (float) this.aClass134_Sub1_14.anInt8399);
		local282[9] = 0.0F;
		local282[1] = 0.0F;
		local282[4] = 0.0F;
		local282[7] = 0.0F;
		local282[6] = 0.0F;
		local282[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass134_Sub1_14.anInt8356;
		local282[8] = 0.0F;
		local282[14] = -this.aFloat133 / (this.aFloat134 - this.aFloat133);
		local282[3] = 0.0F;
		local282[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass134_Sub1_14.anInt8399;
		local277.method6068(0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
		this.aClass134_Sub1_14.method6749();
		this.aClass134_Sub1_14.method6773();
		if ((this.anInt5888 & 0x7) == 0) {
			this.aClass134_Sub1_14.method6735(false);
		} else {
			this.aClass134_Sub1_14.method6735(true);
			this.aClass134_Sub1_14.method6755();
		}
		this.aClass134_Sub1_14.method6780(false);
		this.aClass134_Sub1_14.method6829(0, this.anInterface4_8);
		this.aClass134_Sub1_14.method6829(1, this.anInterface4_9);
		this.aClass134_Sub1_14.method6743(this.aClass284_13);
		this.aClass134_Sub1_14.method6765(Static470.aClass185_5, local18 / 3, local20, local16, local22 + 1 - local20, 0);
		this.aClass134_Sub1_14.method6780(true);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4831(arg5, arg3, arg4, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method4831(-1, arg3, arg4, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt5895 <= 0) {
			this.aClass361_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt9209 + 1][super.anInt9210 + 1];
			for (@Pc(21) int local21 = 1; super.anInt9209 > local21; local21++) {
				for (@Pc(25) int local25 = 1; local25 < super.anInt9210; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray25[local21][local25 + 1] >> 3) + (this.aByteArrayArray25[local21 - 1][local25] >> 2) + (this.aByteArrayArray25[local21 - -1][local25] >> 3) + (this.aByteArrayArray25[local21][local25 - 1] >> 2) + (this.aByteArrayArray25[local21][local25] >> 1));
				}
			}
			@Pc(109) Class1_Sub43[] local109 = new Class1_Sub43[this.aClass187_24.method3796()];
			this.aClass187_24.method3802(local109);
			for (@Pc(117) int local117 = 0; local117 < local109.length; local117++) {
				local109[local117].method6044(this.anInt5895);
			}
			@Pc(137) int local137 = 20;
			if (this.anIntArrayArrayArray12 != null) {
				local137 += 4;
			}
			if ((this.anInt5888 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass134_Sub1_14.aNativeHeap6.a(this.anInt5895 * 4, false);
			@Pc(170) NativeHeapBuffer local170 = this.aClass134_Sub1_14.aNativeHeap6.a(this.anInt5895 * local137, false);
			@Pc(175) Stream local175 = new Stream(local170);
			@Pc(180) Stream local180 = new Stream(local160);
			@Pc(184) Class1_Sub43[] local184 = new Class1_Sub43[this.anInt5895];
			@Pc(191) int local191 = Static558.method7589(this.anInt5895 / 4);
			if (local191 < 1) {
				local191 = 1;
			}
			@Pc(203) Class187 local203 = new Class187(local191);
			@Pc(207) Class1_Sub43[] local207 = new Class1_Sub43[this.anInt5896];
			@Pc(213) int local213;
			for (@Pc(209) int local209 = 0; local209 < super.anInt9209; local209++) {
				for (local213 = 0; super.anInt9210 > local213; local213++) {
					if (this.anIntArrayArrayArray8[local209][local213] != null) {
						@Pc(229) Class1_Sub43[] local229 = this.aClass1_Sub43ArrayArrayArray1[local209][local213];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray9[local209][local213];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray11[local209][local213];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray10[local209][local213];
						@Pc(257) int[] local257 = this.anIntArrayArrayArray8[local209][local213];
						@Pc(269) int[] local269 = this.anIntArrayArrayArray13 == null ? null : this.anIntArrayArrayArray13[local209][local213];
						@Pc(281) int[] local281 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local209][local213];
						if (local250 == null) {
							local250 = local257;
						}
						@Pc(292) float local292 = this.aFloatArrayArray7[local209][local213];
						@Pc(299) float local299 = this.aFloatArrayArray6[local209][local213];
						@Pc(306) float local306 = this.aFloatArrayArray5[local209][local213];
						@Pc(315) float local315 = this.aFloatArrayArray7[local209][local213 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray6[local209][local213 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray5[local209][local213 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray7[local209 + 1][local213 + 1];
						@Pc(355) float local355 = this.aFloatArrayArray6[local209 + 1][local213 + 1];
						@Pc(366) float local366 = this.aFloatArrayArray5[local209 + 1][local213 + 1];
						@Pc(375) float local375 = this.aFloatArrayArray7[local209 + 1][local213];
						@Pc(384) float local384 = this.aFloatArrayArray6[local209 + 1][local213];
						@Pc(393) float local393 = this.aFloatArrayArray5[local209 + 1][local213];
						@Pc(401) int local401 = local19[local209][local213] & 0xFF;
						@Pc(411) int local411 = local19[local209][local213 + 1] & 0xFF;
						@Pc(423) int local423 = local19[local209 + 1][local213 + 1] & 0xFF;
						@Pc(433) int local433 = local19[local209 + 1][local213] & 0xFF;
						@Pc(435) int local435 = 0;
						@Pc(445) int local445;
						label357: for (@Pc(437) int local437 = 0; local437 < local257.length; local437++) {
							@Pc(443) Class1_Sub43 local443 = local229[local437];
							for (local445 = 0; local445 < local435; local445++) {
								if (local207[local445] == local443) {
									continue label357;
								}
							}
							local207[local435++] = local443;
						}
						@Pc(490) short[] local490 = this.aShortArrayArray3[super.anInt9209 * local213 + local209] = new short[local257.length];
						for (local445 = 0; local445 < local257.length; local445++) {
							@Pc(503) int local503 = (local209 << super.anInt9205) + local236[local445];
							@Pc(512) int local512 = (local213 << super.anInt9205) + local243[local445];
							@Pc(517) int local517 = local503 >> this.anInt5889;
							@Pc(522) int local522 = local512 >> this.anInt5889;
							@Pc(526) int local526 = local257[local445];
							@Pc(530) int local530 = local250[local445];
							@Pc(538) int local538 = local269 == null ? 0 : local269[local445];
							@Pc(556) long local556 = (long) local526 << 32 | (long) local530 << 48 | (long) (local517 << 16) | (long) local522;
							@Pc(560) int local560 = local236[local445];
							@Pc(564) int local564 = local243[local445];
							@Pc(566) byte local566 = 74;
							@Pc(568) int local568 = 0;
							@Pc(570) float local570 = 1.0F;
							@Pc(582) float local582;
							@Pc(576) float local576;
							@Pc(584) float local584;
							@Pc(651) float local651;
							@Pc(580) int local580;
							if (local560 == 0 && local564 == 0) {
								local576 = local299;
								local580 = local566 - local401;
								local582 = local292;
								local584 = local306;
							} else if (local560 == 0 && local564 == super.anInt9208) {
								local582 = local315;
								local580 = local566 - local411;
								local576 = local324;
								local584 = local333;
							} else if (local560 == super.anInt9208 && super.anInt9208 == local564) {
								local582 = local344;
								local576 = local355;
								local580 = local566 - local423;
								local584 = local366;
							} else if (super.anInt9208 == local560 && local564 == 0) {
								local580 = local566 - local433;
								local582 = local375;
								local584 = local393;
								local576 = local384;
							} else {
								@Pc(628) float local628 = (float) local560 / (float) super.anInt9208;
								@Pc(635) float local635 = (float) local564 / (float) super.anInt9208;
								@Pc(643) float local643 = (local375 - local292) * local628 + local292;
								local651 = local628 * (local384 - local299) + local299;
								@Pc(659) float local659 = local306 + (local393 - local306) * local628;
								@Pc(668) float local668 = local628 * (local344 - local315) + local315;
								@Pc(677) float local677 = (local355 - local324) * local628 + local324;
								local582 = local643 + (local668 - local643) * local635;
								@Pc(693) float local693 = local333 + (local366 - local333) * local628;
								local576 = local651 + local635 * (local677 - local651);
								local584 = local659 + (local693 - local659) * local635;
								@Pc(722) int local722 = local401 + ((local433 - local401) * local560 >> super.anInt9205);
								@Pc(735) int local735 = local411 + (local560 * (local423 - local411) >> super.anInt9205);
								local580 = local566 - local722 - ((local735 - local722) * local564 >> super.anInt9205);
							}
							if (local526 != -1) {
								@Pc(797) int local797 = (local526 & 0x7F) * local580 >> 7;
								if (local797 < 2) {
									local797 = 2;
								} else if (local797 > 126) {
									local797 = 126;
								}
								if ((this.anInt5888 & 0x7) == 0) {
									local570 = local584 * this.aClass134_Sub1_14.aFloatArray47[2] + this.aClass134_Sub1_14.aFloatArray47[1] * local576 + this.aClass134_Sub1_14.aFloatArray47[0] * local582;
									local570 = this.aClass134_Sub1_14.aFloat196 + (local570 > 0.0F ? this.aClass134_Sub1_14.aFloat198 : this.aClass134_Sub1_14.aFloat190) * local570;
								}
								local568 = Static379.anIntArray506[local797 | local526 & 0xFF80];
							}
							@Pc(871) Class1 local871 = null;
							if ((this.anInt5884 - 1 & local503) == 0 && (local512 & this.anInt5884 - 1) == 0) {
								local871 = local203.method3797(local556);
							}
							@Pc(910) int local910;
							@Pc(974) int local974;
							if (local871 == null) {
								if (local530 == local526) {
									local974 = local568;
								} else {
									@Pc(950) int local950 = (local530 & 0x7F) * local580 >> 7;
									if (local950 < 2) {
										local950 = 2;
									} else if (local950 > 126) {
										local950 = 126;
									}
									local974 = Static379.anIntArray506[local530 & 0xFF80 | local950];
									if ((this.anInt5888 & 0x7) == 0) {
										local651 = local584 * this.aClass134_Sub1_14.aFloatArray47[2] + this.aClass134_Sub1_14.aFloatArray47[1] * local576 + this.aClass134_Sub1_14.aFloatArray47[0] * local582;
										local651 = this.aClass134_Sub1_14.aFloat196 + (local570 > 0.0F ? this.aClass134_Sub1_14.aFloat198 : this.aClass134_Sub1_14.aFloat190) * local570;
										@Pc(1030) int local1030 = local974 >> 16 & 0xFF;
										@Pc(1036) int local1036 = local974 >> 8 & 0xFF;
										@Pc(1040) int local1040 = local974 & 0xFF;
										local1030 = (int) ((float) local1030 * local651);
										if (local1030 < 0) {
											local1030 = 0;
										} else if (local1030 > 255) {
											local1030 = 255;
										}
										local1036 = (int) ((float) local1036 * local651);
										if (local1036 < 0) {
											local1036 = 0;
										} else if (local1036 > 255) {
											local1036 = 255;
										}
										local1040 = (int) ((float) local1040 * local651);
										if (local1040 < 0) {
											local1040 = 0;
										} else if (local1040 > 255) {
											local1040 = 255;
										}
										local974 = local1036 << 8 | local1030 << 16 | local1040;
									}
								}
								if (Stream.c()) {
									local175.a((float) local503);
									local175.a((float) (this.method7550(local503, local512) + local538));
									local175.a((float) local512);
									local175.a((float) local503);
									local175.a((float) local512);
									if (this.anIntArrayArrayArray12 != null) {
										local175.a((float) (local281 == null ? 0 : local281[local445] - 1));
									}
									if ((this.anInt5888 & 0x7) != 0) {
										local175.a(local582);
										local175.a(local576);
										local175.a(local584);
									}
								} else {
									local175.b((float) local503);
									local175.b((float) (local538 + this.method7550(local503, local512)));
									local175.b((float) local512);
									local175.b((float) local503);
									local175.b((float) local512);
									if (this.anIntArrayArrayArray12 != null) {
										local175.b((float) (local281 == null ? 0 : local281[local445] - 1));
									}
									if ((this.anInt5888 & 0x7) != 0) {
										local175.b(local582);
										local175.b(local576);
										local175.b(local584);
									}
								}
								if (this.aClass134_Sub1_14.anInt8438 == 0) {
									local180.e(local974 | 0xFF000000);
								} else {
									local180.d(local974 | 0xFF000000);
								}
								local910 = this.anInt5891++;
								local490[local445] = (short) local910;
								if (local526 != -1) {
									local184[local910] = local229[local445];
								}
								local203.method3795(new Class1_Sub24(local490[local445]), local556);
							} else {
								local490[local445] = ((Class1_Sub24) local871).aShort48;
								local910 = local490[local445] & 0xFFFF;
								if (local526 != -1 && local229[local445].aLong301 < local184[local910].aLong301) {
									local184[local910] = local229[local445];
								}
							}
							for (local974 = 0; local974 < local435; local974++) {
								local207[local974].method6043(local568, local580, local570, local910);
							}
							this.anInt5886++;
						}
					}
				}
			}
			for (local213 = 0; local213 < this.anInt5891; local213++) {
				@Pc(1332) Class1_Sub43 local1332 = local184[local213];
				if (local1332 != null) {
					local1332.method6040(local213);
				}
			}
			@Pc(1353) int local1353;
			@Pc(1371) int local1371;
			for (@Pc(1349) int local1349 = 0; local1349 < super.anInt9209; local1349++) {
				for (local1353 = 0; local1353 < super.anInt9210; local1353++) {
					@Pc(1365) short[] local1365 = this.aShortArrayArray3[super.anInt9209 * local1353 + local1349];
					if (local1365 != null) {
						@Pc(1369) int local1369 = 0;
						local1371 = 0;
						while (local1365.length > local1371) {
							@Pc(1380) int local1380 = local1365[local1371++] & 0xFFFF;
							@Pc(1387) int local1387 = local1365[local1371++] & 0xFFFF;
							@Pc(1394) int local1394 = local1365[local1371++] & 0xFFFF;
							@Pc(1398) Class1_Sub43 local1398 = local184[local1380];
							@Pc(1402) Class1_Sub43 local1402 = local184[local1387];
							@Pc(1406) Class1_Sub43 local1406 = local184[local1394];
							@Pc(1408) Class1_Sub43 local1408 = null;
							if (local1398 != null) {
								local1398.method6045(local1349, local1369, local1353);
								local1408 = local1398;
							}
							if (local1402 != null) {
								local1402.method6045(local1349, local1369, local1353);
								if (local1408 == null || local1408.aLong301 > local1402.aLong301) {
									local1408 = local1402;
								}
							}
							if (local1406 != null) {
								local1406.method6045(local1349, local1369, local1353);
								if (local1408 == null || local1408.aLong301 > local1406.aLong301) {
									local1408 = local1406;
								}
							}
							if (local1408 != null) {
								if (local1398 != null) {
									local1408.method6040(local1380);
								}
								if (local1402 != null) {
									local1408.method6040(local1387);
								}
								if (local1406 != null) {
									local1408.method6040(local1394);
								}
								local1408.method6045(local1349, local1369, local1353);
							}
							local1369++;
						}
					}
				}
			}
			local175.a();
			local180.a();
			this.anInterface4_9 = this.aClass134_Sub1_14.method6805(false);
			this.anInterface4_9.method2467(this.anInt5891 * 4, 4, local160);
			this.anInterface4_8 = this.aClass134_Sub1_14.method6805(false);
			this.anInterface4_8.method2467(local137 * this.anInt5891, local137, local170);
			if ((this.anInt5888 & 0x7) == 0) {
				if (this.anIntArrayArrayArray12 == null) {
					this.aClass284_13 = this.aClass134_Sub1_14.method6855(new Class7[] { new Class7(new Class198[] { Static282.aClass198_1, Static282.aClass198_5 }), new Class7(Static282.aClass198_3) });
				} else {
					this.aClass284_13 = this.aClass134_Sub1_14.method6855(new Class7[] { new Class7(new Class198[] { Static282.aClass198_1, Static282.aClass198_5, Static282.aClass198_4 }), new Class7(Static282.aClass198_3) });
				}
			} else if (this.anIntArrayArrayArray12 == null) {
				this.aClass284_13 = this.aClass134_Sub1_14.method6855(new Class7[] { new Class7(new Class198[] { Static282.aClass198_1, Static282.aClass198_5, Static282.aClass198_2 }), new Class7(Static282.aClass198_3) });
			} else {
				this.aClass284_13 = this.aClass134_Sub1_14.method6855(new Class7[] { new Class7(new Class198[] { Static282.aClass198_1, Static282.aClass198_5, Static282.aClass198_4, Static282.aClass198_2 }), new Class7(Static282.aClass198_3) });
			}
			local1353 = 0;
			for (@Pc(1700) int local1700 = 0; local1700 < local109.length; local1700++) {
				if (local109[local1700].anInt7597 > 0) {
					local109[local1353++] = local109[local1700];
				}
			}
			this.aClass1_Sub43Array1 = new Class1_Sub43[local1353];
			@Pc(1733) long[] local1733 = new long[local1353];
			for (local1371 = 0; local1371 < local1353; local1371++) {
				@Pc(1741) Class1_Sub43 local1741 = local109[local1371];
				local1733[local1371] = local1741.aLong301;
				this.aClass1_Sub43Array1[local1371] = local1741;
				local1741.method6041(this.anInt5891);
			}
			Static589.method7832(local1733, this.aClass1_Sub43Array1);
			if (this.aClass361_2 != null) {
				this.aClass361_2.method7827();
			}
		}
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray9 = this.anIntArrayArrayArray11 = null;
		this.aByteArrayArray25 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass187_24 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray6 = this.aFloatArrayArray5 = null;
		this.aClass1_Sub43ArrayArrayArray1 = null;
		this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub6_Sub5 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub6_Sub5 arg2) {
		if ((this.aByteArrayArray24[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9208 >> this.aClass134_Sub1_14.anInt8441;
		@Pc(24) Class1_Sub6_Sub5_Sub2 local24 = (Class1_Sub6_Sub5_Sub2) arg2;
		@Pc(40) Class1_Sub6_Sub5_Sub2 local40;
		if (local24 != null && local24.method7298(local21, local21)) {
			local40 = local24;
			local24.method7299();
		} else {
			local40 = new Class1_Sub6_Sub5_Sub2(this.aClass134_Sub1_14, local21, local21);
		}
		local40.method7294(0, 0, local21, local21);
		this.method4829(local40, arg1, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[[ZZIII)V")
	private void method4831(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass1_Sub43Array1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 + arg3 + 1;
		@Pc(19) int local19 = local15 * local15;
		if (local19 > Static387.anIntArray522.length) {
			Static387.anIntArray522 = new int[local19];
		}
		@Pc(31) int local31 = arg5 - arg3;
		@Pc(33) int local33 = local31;
		if (local31 < 0) {
			local31 = 0;
		}
		@Pc(42) int local42 = arg4 - arg3;
		@Pc(44) int local44 = local42;
		if (local42 < 0) {
			local42 = 0;
		}
		@Pc(55) int local55 = arg3 + arg5;
		if (super.anInt9209 - 1 < local55) {
			local55 = super.anInt9209 - 1;
		}
		@Pc(74) int local74 = arg3 + arg4;
		if (local74 > super.anInt9210 - 1) {
			local74 = super.anInt9210 - 1;
		}
		Static71.anInt1412 = 0;
		for (@Pc(93) int local93 = local31; local93 <= local55; local93++) {
			@Pc(102) boolean[] local102 = arg1[local93 - local33];
			for (@Pc(104) int local104 = local42; local104 <= local74; local104++) {
				if (local102[local104 - local44]) {
					Static387.anIntArray522[Static71.anInt1412++] = local93 + local104 * super.anInt9209;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass134_Sub1_14.method6775();
		} else {
			this.aClass134_Sub1_14.method6760((float) arg0);
			this.aClass134_Sub1_14.method6726();
		}
		this.aClass134_Sub1_14.method6839();
		this.aClass134_Sub1_14.method6735((this.anInt5888 & 0x7) != 0);
		this.aClass134_Sub1_14.method6857(false, false, -1);
		this.aClass134_Sub1_14.method6829(0, this.anInterface4_8);
		for (@Pc(195) int local195 = 0; local195 < this.aClass1_Sub43Array1.length; local195++) {
			this.aClass1_Sub43Array1[local195].method6038(Static387.anIntArray522, Static71.anInt1412);
		}
		@Pc(216) Class113_Sub3 local216 = this.aClass134_Sub1_14.method6764();
		local216.NA(0, -1, 0);
		this.aClass134_Sub1_14.method6773();
		if (!this.aClass353_40.method7686()) {
			@Pc(234) int local234 = this.aClass134_Sub1_14.anInt8460;
			@Pc(238) int local238 = this.aClass134_Sub1_14.anInt8430;
			this.aClass134_Sub1_14.pa(0, local238, this.aClass134_Sub1_14.anInt8437);
			this.aClass134_Sub1_14.method6735(false);
			this.aClass134_Sub1_14.method6827(false);
			this.aClass134_Sub1_14.method6746(128);
			this.aClass134_Sub1_14.method6857(false, false, -2);
			this.aClass134_Sub1_14.method6766(this.aClass134_Sub1_14.anInterface3_3);
			this.aClass134_Sub1_14.method6770(Static292.aClass82_4, Static447.aClass82_5);
			this.aClass134_Sub1_14.method6742(0, Static308.aClass192_1);
			this.aClass134_Sub1_14.method6816(0, Static468.aClass192_3);
			for (@Pc(300) Class1 local300 = this.aClass353_40.method7677(); local300 != null; local300 = this.aClass353_40.method7687()) {
				@Pc(305) Class1_Sub10 local305 = (Class1_Sub10) local300;
				local305.method1212(arg5, arg3, arg1, arg4);
			}
			this.aClass134_Sub1_14.method6742(0, Static430.aClass192_2);
			this.aClass134_Sub1_14.method6816(0, Static430.aClass192_2);
			this.aClass134_Sub1_14.method6766(null);
			this.aClass134_Sub1_14.pa(local234, local238, this.aClass134_Sub1_14.anInt8437);
		}
		if (this.aClass361_2 != null) {
			this.aClass134_Sub1_14.method6829(0, this.anInterface4_8);
			this.aClass134_Sub1_14.method6829(1, this.anInterface4_9);
			this.aClass134_Sub1_14.method6743(this.aClass284_13);
			this.aClass361_2.method7829(arg4, arg2, arg1, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	@Override
	public void method7549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7543(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass361_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass134_Sub1_14.anInt8428 * arg2 >> 8) >> this.aClass134_Sub1_14.anInt8441;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass134_Sub1_14.anInt8445 >> 8) >> this.aClass134_Sub1_14.anInt8441;
			return this.aClass361_2.method7824(local39, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!ni", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt9209][super.anInt9210][];
		}
		if (arg3 != null && this.anIntArrayArrayArray13 == null) {
			this.anIntArrayArrayArray13 = new int[super.anInt9209][super.anInt9210][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray11[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray10[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray13 != null) {
			this.anIntArrayArrayArray13[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub43[] local88 = this.aClass1_Sub43ArrayArrayArray1[arg0][arg1] = new Class1_Sub43[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class1 local125;
			for (local125 = this.aClass187_24.method3797(local119); local125 != null; local125 = this.aClass187_24.method3803()) {
				@Pc(130) Class1_Sub43 local130 = (Class1_Sub43) local125;
				if (arg8[local90] == local130.anInt7587 && local130.aFloat166 == (float) arg9[local90] && local130.anInt7589 == arg10 && local130.anInt7591 == arg11 && local130.anInt7598 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub43(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass187_24.method3795(local88[local90], local119);
			} else {
				local88[local90] = (Class1_Sub43) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray24[arg0][arg1] = (byte) (this.aByteArrayArray24[arg0][arg1] | 0x1);
		}
		if (this.anInt5896 < arg6.length) {
			this.anInt5896 = arg6.length;
		}
		this.anInt5895 += arg6.length;
	}

	@OriginalMember(owner = "client!ni", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass361_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass134_Sub1_14.anInt8428 >> 8) >> this.aClass134_Sub1_14.anInt8441;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass134_Sub1_14.anInt8445 >> 8) >> this.aClass134_Sub1_14.anInt8441;
			this.aClass361_2.method7831(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!rc;[I)V")
	@Override
	public void method7542(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass353_40.method7679(new Class1_Sub10(this.aClass134_Sub1_14, this, arg0, arg1));
	}
}
