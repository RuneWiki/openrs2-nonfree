import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class76_Sub3 extends Class76 {

	@OriginalMember(owner = "client!sba", name = "v", descriptor = "I")
	private int anInt8496;

	@OriginalMember(owner = "client!sba", name = "w", descriptor = "I")
	private int anInt8497;

	@OriginalMember(owner = "client!sba", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!sba", name = "W", descriptor = "Lclient!dha;")
	public Class72 aClass72_23;

	@OriginalMember(owner = "client!sba", name = "X", descriptor = "I")
	private int anInt8511;

	@OriginalMember(owner = "client!sba", name = "Y", descriptor = "[Lclient!uo;")
	private Class2_Sub49[] aClass2_Sub49Array1;

	@OriginalMember(owner = "client!sba", name = "bb", descriptor = "I")
	private int anInt8512;

	@OriginalMember(owner = "client!sba", name = "cb", descriptor = "Lclient!lk;")
	private Interface16 anInterface16_16;

	@OriginalMember(owner = "client!sba", name = "eb", descriptor = "Lclient!lk;")
	private Interface16 anInterface16_17;

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "F")
	private float aFloat189 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!sba", name = "F", descriptor = "F")
	private float aFloat190 = -3.4028235E38F;

	@OriginalMember(owner = "client!sba", name = "J", descriptor = "Lclient!fha;")
	private final Class109 aClass109_60 = new Class109();

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "Lclient!pga;")
	public final Class95_Sub3 aClass95_Sub3_20;

	@OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
	private final int anInt8495;

	@OriginalMember(owner = "client!sba", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!sba", name = "Q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!sba", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!sba", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!sba", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!sba", name = "U", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!sba", name = "R", descriptor = "I")
	private final int anInt8510;

	@OriginalMember(owner = "client!sba", name = "N", descriptor = "[[S")
	public final short[][] aShortArrayArray26;

	@OriginalMember(owner = "client!sba", name = "y", descriptor = "I")
	public final int anInt8499;

	@OriginalMember(owner = "client!sba", name = "L", descriptor = "[[[Lclient!uo;")
	private Class2_Sub49[][][] aClass2_Sub49ArrayArrayArray1;

	@OriginalMember(owner = "client!sba", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!sba", name = "t", descriptor = "[[B")
	private final byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!sba", name = "ab", descriptor = "[[B")
	private byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!sba", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!sba", name = "db", descriptor = "Lclient!gca;")
	private Class118 aClass118_44;

	@OriginalMember(owner = "client!sba", name = "T", descriptor = "Lclient!gf;")
	private Class122 aClass122_2;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!pga;IIII[[I[[II)V")
	public Class76_Sub3(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass95_Sub3_20 = arg0;
		this.anInt8495 = super.anInt8795 - 2;
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aFloatArrayArray17 = new float[super.anInt8791 + 1][super.anInt8794 + 1];
		this.aFloatArrayArray16 = new float[super.anInt8791 + 1][super.anInt8794 + 1];
		this.anInt8510 = 0x1 << this.anInt8495;
		this.aShortArrayArray26 = new short[arg3 * arg4][];
		this.anInt8499 = arg2;
		this.aClass2_Sub49ArrayArrayArray1 = new Class2_Sub49[arg3][arg4][];
		this.aFloatArrayArray18 = new float[super.anInt8791 + 1][super.anInt8794 + 1];
		this.aByteArrayArray27 = new byte[arg3][arg4];
		this.aByteArrayArray28 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt8794 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt8791 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray56[local125][local121];
				if ((float) local134 < this.aFloat189) {
					this.aFloat189 = local134;
				}
				if ((float) local134 > this.aFloat190) {
					this.aFloat190 = local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt8791 > local125 && local121 < super.anInt8794) {
					@Pc(191) int local191 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(207) int local207 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(226) float local226 = (float) (1.0D / Math.sqrt((double) (local207 * local207 + arg7 * arg7 * 4 + local191 * local191)));
					this.aFloatArrayArray17[local125][local121] = local226 * (float) local191;
					this.aFloatArrayArray16[local125][local121] = local226 * (float) (-arg7 * 2);
					this.aFloatArrayArray18[local125][local121] = (float) local207 * local226;
				}
			}
		}
		this.aFloat190++;
		this.aFloat189--;
		this.aClass118_44 = new Class118(128);
		if ((this.anInt8499 & 0x10) != 0) {
			this.aClass122_2 = new Class122(this.aClass95_Sub3_20, this);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7391(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8512 <= 0) {
			return;
		}
		@Pc(16) Interface10 local16 = this.aClass95_Sub3_20.method7075(this.anInt8497);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method7385();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass95_Sub3_20.method7086(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(74) short[] local74;
				@Pc(78) int local78;
				@Pc(86) int local86;
				if (Stream.a()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = super.anInt8791 * local45 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray26[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										if (local20 > local86) {
											local20 = local86;
										}
										local41.e(local86);
										if (local22 < local86) {
											local22 = local86;
										}
										local18++;
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt8791 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray26[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										if (local20 > local86) {
											local20 = local86;
										}
										local18++;
										local41.b(local86);
										if (local22 < local86) {
											local22 = local86;
										}
									}
								}
							}
							local54++;
						}
					}
				}
				local41.c();
				if (local16.method7384()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass95_Sub3_20.method7088();
		this.aClass95_Sub3_20.method7065(false);
		this.aClass95_Sub3_20.method7076(false);
		this.aClass95_Sub3_20.method7013(false);
		this.aClass95_Sub3_20.method7033(false);
		this.aClass95_Sub3_20.method7137(0);
		this.aClass95_Sub3_20.method7148(false, false, -2);
		this.aClass95_Sub3_20.method7112(null);
		@Pc(277) Class177_Sub1 local277 = this.aClass95_Sub3_20.method7041();
		@Pc(282) float[] local282 = this.aClass95_Sub3_20.method7061();
		local282[6] = 0.0F;
		local282[2] = 0.0F;
		local282[10] = 1.0F / (this.aFloat190 - this.aFloat189);
		local282[8] = 0.0F;
		local282[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass95_Sub3_20.anInt8286;
		local282[4] = 0.0F;
		local282[7] = 0.0F;
		local282[5] = (float) 1024 / ((float) super.anInt8792 * 128.0F * (float) this.aClass95_Sub3_20.anInt8286);
		local282[3] = 0.0F;
		local282[11] = 0.0F;
		local282[0] = (float) 1024 / ((float) this.aClass95_Sub3_20.anInt8288 * 128.0F * (float) super.anInt8792);
		local282[14] = -this.aFloat189 / (this.aFloat190 - this.aFloat189);
		local282[9] = 0.0F;
		local282[1] = 0.0F;
		local282[15] = 1.0F;
		local282[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass95_Sub3_20.anInt8288;
		local277.method3829(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
		this.aClass95_Sub3_20.method7035();
		this.aClass95_Sub3_20.method7062();
		if ((this.anInt8499 & 0x7) == 0) {
			this.aClass95_Sub3_20.method7076(false);
		} else {
			this.aClass95_Sub3_20.method7076(true);
			this.aClass95_Sub3_20.method7047();
		}
		this.aClass95_Sub3_20.method7126(false);
		this.aClass95_Sub3_20.method7054(0, this.anInterface16_16);
		this.aClass95_Sub3_20.method7054(1, this.anInterface16_17);
		this.aClass95_Sub3_20.method7059(this.aClass72_23);
		this.aClass95_Sub3_20.method7060(Static286.aClass30_3, 0, local20, local22 + 1 - local20, local16, local18 / 3);
		this.aClass95_Sub3_20.method7126(true);
	}

	@OriginalMember(owner = "client!sba", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub2_Sub19 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub19 arg2) {
		if ((this.aByteArrayArray27[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8792 >> this.aClass95_Sub3_20.anInt8351;
		@Pc(27) Class2_Sub2_Sub19_Sub2 local27 = (Class2_Sub2_Sub19_Sub2) arg2;
		@Pc(43) Class2_Sub2_Sub19_Sub2 local43;
		if (local27 != null && local27.method8284(local24, local24)) {
			local43 = local27;
			local27.method8277();
		} else {
			local43 = new Class2_Sub2_Sub19_Sub2(this.aClass95_Sub3_20, local24, local24);
		}
		local43.method8280(local24, 0, 0, local24);
		this.method7169(local43, arg0, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!sba", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass122_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass95_Sub3_20.anInt8384 * arg2 >> 8) >> this.aClass95_Sub3_20.anInt8351;
			@Pc(37) int local37 = arg3 - (arg2 * this.aClass95_Sub3_20.anInt8370 >> 8) >> this.aClass95_Sub3_20.anInt8351;
			this.aClass122_2.method2629(arg0, local23, local37);
		}
	}

	@OriginalMember(owner = "client!sba", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray28[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray28[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!sba", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt8791][super.anInt8794][];
		}
		@Pc(21) Interface6 local21 = this.aClass95_Sub3_20.anInterface6_27;
		if (arg3 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt8791][super.anInt8794][];
		}
		this.anIntArrayArrayArray17[arg0][arg1] = arg2;
		this.anIntArrayArrayArray18[arg0][arg1] = arg4;
		this.anIntArrayArrayArray13[arg0][arg1] = arg6;
		this.anIntArrayArrayArray15[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub49[] local92 = this.aClass2_Sub49ArrayArrayArray1[arg0][arg1] = new Class2_Sub49[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt8499 & 0x20) != 0 && local100 != -1 && local21.method1492(local100).aBoolean308) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(145) long local145 = (long) (local104 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) local100;
			@Pc(151) Class2 local151;
			for (local151 = this.aClass118_44.method2595(local145); local151 != null; local151 = this.aClass118_44.method2605()) {
				@Pc(156) Class2_Sub49 local156 = (Class2_Sub49) local151;
				if (local100 == local156.anInt9456 && local156.aFloat213 == (float) local104 && local156.anInt9462 == arg10 && arg11 == local156.anInt9450 && arg12 == local156.anInt9458) {
					break;
				}
			}
			if (local151 == null) {
				local92[local94] = new Class2_Sub49(this, local100, local104, arg10, arg11, arg12);
				this.aClass118_44.method2601(local92[local94], local145);
			} else {
				local92[local94] = (Class2_Sub49) local151;
			}
		}
		if (arg13) {
			this.aByteArrayArray27[arg0][arg1] = (byte) (this.aByteArrayArray27[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8511) {
			this.anInt8511 = arg6.length;
		}
		this.anInt8512 += arg6.length;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7168(arg1, arg3, arg2, arg6, arg5, arg0, arg4);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7168(arg1, arg3, arg2, arg5, -1, arg0, arg4);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I[[ZIIIIIZ)V")
	private void method7168(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (this.aClass2_Sub49Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg2 + arg2 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > Static252.anIntArray275.length) {
			Static252.anIntArray275 = new int[local14];
		}
		@Pc(30) int local30 = arg5 - arg2;
		@Pc(32) int local32 = local30;
		if (local30 < 0) {
			local30 = 0;
		}
		@Pc(41) int local41 = arg0 - arg2;
		@Pc(43) int local43 = local41;
		if (local41 < 0) {
			local41 = 0;
		}
		@Pc(51) int local51 = arg5 + arg2;
		if (local51 > super.anInt8791 - 1) {
			local51 = super.anInt8791 - 1;
		}
		@Pc(66) int local66 = arg2 + arg0;
		Static150.anInt2693 = 0;
		if (local66 > super.anInt8794 - 1) {
			local66 = super.anInt8794 - 1;
		}
		for (@Pc(81) int local81 = local30; local81 <= local51; local81++) {
			@Pc(90) boolean[] local90 = arg1[local81 - local32];
			for (@Pc(92) int local92 = local41; local92 <= local66; local92++) {
				if (local90[local92 - local43]) {
					Static252.anIntArray275[Static150.anInt2693++] = local81 + local92 * super.anInt8791;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass95_Sub3_20.method7083();
		} else {
			this.aClass95_Sub3_20.method7111((float) arg4);
			this.aClass95_Sub3_20.method7149();
		}
		this.aClass95_Sub3_20.method7034();
		this.aClass95_Sub3_20.method7076((this.anInt8499 & 0x7) != 0);
		this.aClass95_Sub3_20.method7148(false, false, -1);
		this.aClass95_Sub3_20.method7054(0, this.anInterface16_16);
		for (@Pc(177) int local177 = 0; local177 < this.aClass2_Sub49Array1.length; local177++) {
			this.aClass2_Sub49Array1[local177].method7921(Static252.anIntArray275, Static150.anInt2693);
		}
		@Pc(202) Class177_Sub1 local202 = this.aClass95_Sub3_20.method7041();
		local202.method7869(0, -1, 0);
		this.aClass95_Sub3_20.method7062();
		if (!this.aClass109_60.method2328()) {
			@Pc(220) int local220 = this.aClass95_Sub3_20.anInt8359;
			@Pc(224) int local224 = this.aClass95_Sub3_20.anInt8382;
			this.aClass95_Sub3_20.L(0, local224, this.aClass95_Sub3_20.anInt8366);
			this.aClass95_Sub3_20.method7076(false);
			this.aClass95_Sub3_20.method7033(false);
			this.aClass95_Sub3_20.method7137(128);
			this.aClass95_Sub3_20.method7148(false, false, -2);
			this.aClass95_Sub3_20.method7112(this.aClass95_Sub3_20.anInterface17_3);
			this.aClass95_Sub3_20.method7023(Static225.aClass136_3, Static483.aClass136_6);
			this.aClass95_Sub3_20.method7139(0, Static185.aClass291_3);
			this.aClass95_Sub3_20.method7095(0, Static113.aClass291_2);
			for (@Pc(284) Class2 local284 = this.aClass109_60.method2325(); local284 != null; local284 = this.aClass109_60.method2318()) {
				@Pc(289) Class2_Sub19 local289 = (Class2_Sub19) local284;
				local289.method2988(arg2, arg5, arg0, arg1);
			}
			this.aClass95_Sub3_20.method7139(0, Static634.aClass291_4);
			this.aClass95_Sub3_20.method7095(0, Static634.aClass291_4);
			this.aClass95_Sub3_20.method7112(null);
			this.aClass95_Sub3_20.L(local220, local224, this.aClass95_Sub3_20.anInt8366);
		}
		if (this.aClass122_2 != null) {
			this.aClass95_Sub3_20.method7054(0, this.anInterface16_16);
			this.aClass95_Sub3_20.method7054(1, this.anInterface16_17);
			this.aClass95_Sub3_20.method7059(this.aClass72_23);
			this.aClass122_2.method2628(arg2, arg1, arg0, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!kb;[I)V")
	@Override
	public void method7400(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass109_60.method2323(new Class2_Sub19(this.aClass95_Sub3_20, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BLclient!w;II)V")
	private void method7169(@OriginalArg(1) Class2_Sub2_Sub19_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray17[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray18[arg1][arg2];
		@Pc(27) int local27 = local12.length;
		if (Static442.anIntArray505.length < local27) {
			Static272.anIntArray291 = new int[local27];
			Static442.anIntArray505 = new int[local27];
		}
		for (@Pc(43) int local43 = 0; local43 < local27; local43++) {
			Static442.anIntArray505[local43] = local12[local43] >> this.aClass95_Sub3_20.anInt8351;
			Static272.anIntArray291[local43] = local19[local43] >> this.aClass95_Sub3_20.anInt8351;
		}
		@Pc(75) int local75 = 0;
		while (local75 < local27) {
			@Pc(81) int local81 = Static442.anIntArray505[local75];
			@Pc(86) int local86 = Static272.anIntArray291[local75++];
			@Pc(90) int local90 = Static442.anIntArray505[local75];
			@Pc(95) int local95 = Static272.anIntArray291[local75++];
			@Pc(99) int local99 = Static442.anIntArray505[local75];
			@Pc(104) int local104 = Static272.anIntArray291[local75++];
			if (-((local95 - local86) * (local99 - local90)) + (local95 - local104) * (local81 - local90) > 0) {
				arg0.method8279(local99, local86, local95, local81, local90, local104);
			}
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7397(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass122_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass95_Sub3_20.anInt8384 >> 8) >> this.aClass95_Sub3_20.anInt8351;
			@Pc(40) int local40 = arg3 - (this.aClass95_Sub3_20.anInt8370 * arg2 >> 8) >> this.aClass95_Sub3_20.anInt8351;
			return this.aClass122_2.method2631(arg0, local25, local40);
		}
	}

	@OriginalMember(owner = "client!sba", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass122_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass95_Sub3_20.anInt8384 >> 8) >> this.aClass95_Sub3_20.anInt8351;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass95_Sub3_20.anInt8370 >> 8) >> this.aClass95_Sub3_20.anInt8351;
			this.aClass122_2.method2626(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)V")
	@Override
	public void method7394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sba", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt8512 <= 0) {
			this.aClass122_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt8791 + 1][super.anInt8794 + 1];
			for (@Pc(21) int local21 = 1; local21 < super.anInt8791; local21++) {
				for (@Pc(25) int local25 = 1; local25 < super.anInt8794; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray28[local21][local25 + 1] >> 3) + (this.aByteArrayArray28[local21][local25 - 1] >> 2) + (this.aByteArrayArray28[local21 + -1][local25] >> 2) + (this.aByteArrayArray28[local21 + 1][local25] >> 3) + (this.aByteArrayArray28[local21][local25] >> 1));
				}
			}
			@Pc(105) Class2_Sub49[] local105 = new Class2_Sub49[this.aClass118_44.method2602()];
			this.aClass118_44.method2598(local105);
			for (@Pc(113) int local113 = 0; local113 < local105.length; local113++) {
				local105[local113].method7925(this.anInt8512);
			}
			@Pc(129) int local129 = 20;
			if (this.anIntArrayArrayArray14 != null) {
				local129 += 4;
			}
			if ((this.anInt8499 & 0x7) != 0) {
				local129 += 12;
			}
			@Pc(152) NativeHeapBuffer local152 = this.aClass95_Sub3_20.aNativeHeap5.a(this.anInt8512 * 4, false);
			@Pc(162) NativeHeapBuffer local162 = this.aClass95_Sub3_20.aNativeHeap5.a(this.anInt8512 * local129, false);
			@Pc(167) Stream local167 = new Stream(local162);
			@Pc(172) Stream local172 = new Stream(local152);
			@Pc(176) Class2_Sub49[] local176 = new Class2_Sub49[this.anInt8512];
			@Pc(183) int local183 = Static285.method3974(this.anInt8512 / 4);
			if (local183 < 1) {
				local183 = 1;
			}
			@Pc(193) Class118 local193 = new Class118(local183);
			@Pc(197) Class2_Sub49[] local197 = new Class2_Sub49[this.anInt8511];
			@Pc(203) int local203;
			for (@Pc(199) int local199 = 0; local199 < super.anInt8791; local199++) {
				for (local203 = 0; local203 < super.anInt8794; local203++) {
					if (this.anIntArrayArrayArray13[local199][local203] != null) {
						@Pc(219) Class2_Sub49[] local219 = this.aClass2_Sub49ArrayArrayArray1[local199][local203];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray17[local199][local203];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray18[local199][local203];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray15[local199][local203];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray13[local199][local203];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local199][local203];
						if (local240 == null) {
							local240 = local247;
						}
						@Pc(275) int[] local275 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local199][local203];
						@Pc(282) float local282 = this.aFloatArrayArray17[local199][local203];
						@Pc(289) float local289 = this.aFloatArrayArray16[local199][local203];
						@Pc(296) float local296 = this.aFloatArrayArray18[local199][local203];
						@Pc(305) float local305 = this.aFloatArrayArray17[local199][local203 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray16[local199][local203 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray18[local199][local203 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray17[local199 + 1][local203 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray16[local199 + 1][local203 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray18[local199 + 1][local203 + 1];
						@Pc(365) float local365 = this.aFloatArrayArray17[local199 + 1][local203];
						@Pc(374) float local374 = this.aFloatArrayArray16[local199 + 1][local203];
						@Pc(383) float local383 = this.aFloatArrayArray18[local199 + 1][local203];
						@Pc(391) int local391 = local19[local199][local203] & 0xFF;
						@Pc(401) int local401 = local19[local199][local203 + 1] & 0xFF;
						@Pc(413) int local413 = local19[local199 + 1][local203 + 1] & 0xFF;
						@Pc(423) int local423 = local19[local199 + 1][local203] & 0xFF;
						@Pc(425) int local425 = 0;
						@Pc(435) int local435;
						label357: for (@Pc(427) int local427 = 0; local427 < local247.length; local427++) {
							@Pc(433) Class2_Sub49 local433 = local219[local427];
							for (local435 = 0; local435 < local425; local435++) {
								if (local197[local435] == local433) {
									continue label357;
								}
							}
							local197[local425++] = local433;
						}
						@Pc(480) short[] local480 = this.aShortArrayArray26[local199 + local203 * super.anInt8791] = new short[local247.length];
						for (local435 = 0; local435 < local247.length; local435++) {
							@Pc(493) int local493 = (local199 << super.anInt8795) + local226[local435];
							@Pc(502) int local502 = (local203 << super.anInt8795) + local233[local435];
							@Pc(507) int local507 = local493 >> this.anInt8495;
							@Pc(512) int local512 = local502 >> this.anInt8495;
							@Pc(516) int local516 = local247[local435];
							@Pc(520) int local520 = local240[local435];
							@Pc(528) int local528 = local259 == null ? 0 : local259[local435];
							@Pc(546) long local546 = (long) (local507 << 16) | (long) local516 << 32 | (long) local520 << 48 | (long) local512;
							@Pc(550) int local550 = local226[local435];
							@Pc(554) int local554 = local233[local435];
							@Pc(556) byte local556 = 74;
							@Pc(558) int local558 = 0;
							@Pc(560) float local560 = 1.0F;
							@Pc(575) float local575;
							@Pc(577) float local577;
							@Pc(583) float local583;
							@Pc(665) float local665;
							@Pc(581) int local581;
							if (local550 == 0 && local554 == 0) {
								local575 = local282;
								local581 = local556 - local391;
								local577 = local289;
								local583 = local296;
							} else if (local550 == 0 && local554 == super.anInt8792) {
								local575 = local305;
								local577 = local314;
								local581 = local556 - local401;
								local583 = local323;
							} else if (super.anInt8792 == local550 && local554 == super.anInt8792) {
								local577 = local345;
								local583 = local356;
								local581 = local556 - local413;
								local575 = local334;
							} else if (super.anInt8792 == local550 && local554 == 0) {
								local581 = local556 - local423;
								local583 = local383;
								local575 = local365;
								local577 = local374;
							} else {
								@Pc(641) float local641 = (float) local550 / (float) super.anInt8792;
								@Pc(648) float local648 = (float) local554 / (float) super.anInt8792;
								@Pc(656) float local656 = local282 + (local365 - local282) * local641;
								local665 = local641 * (local374 - local289) + local289;
								@Pc(674) float local674 = local296 + local641 * (local383 - local296);
								@Pc(683) float local683 = local305 + local641 * (local334 - local305);
								@Pc(692) float local692 = local314 + local641 * (local345 - local314);
								local577 = (local692 - local665) * local648 + local665;
								@Pc(709) float local709 = local323 + local641 * (local356 - local323);
								local575 = local656 + (local683 - local656) * local648;
								local583 = local648 * (local709 - local674) + local674;
								@Pc(739) int local739 = local391 + (local550 * (local423 - local391) >> super.anInt8795);
								@Pc(751) int local751 = ((local413 - local401) * local550 >> super.anInt8795) + local401;
								local581 = local556 - local739 - (local554 * (local751 - local739) >> super.anInt8795);
							}
							if (local516 != -1) {
								@Pc(789) int local789 = (local516 & 0x7F) * local581 >> 7;
								if (local789 < 2) {
									local789 = 2;
								} else if (local789 > 126) {
									local789 = 126;
								}
								if ((this.anInt8499 & 0x7) == 0) {
									local560 = this.aClass95_Sub3_20.aFloatArray72[2] * local583 + this.aClass95_Sub3_20.aFloatArray72[0] * local575 + this.aClass95_Sub3_20.aFloatArray72[1] * local577;
									local560 = this.aClass95_Sub3_20.aFloat178 + local560 * (local560 > 0.0F ? this.aClass95_Sub3_20.aFloat174 : this.aClass95_Sub3_20.aFloat188);
								}
								local558 = Static343.anIntArray359[local789 | local516 & 0xFF80];
							}
							@Pc(862) Class2 local862 = null;
							if ((local493 & this.anInt8510 - 1) == 0 && (local502 & this.anInt8510 - 1) == 0) {
								local862 = local193.method2595(local546);
							}
							@Pc(1203) int local1203;
							@Pc(920) int local920;
							if (local862 == null) {
								if (local520 == local516) {
									local920 = local558;
								} else {
									@Pc(898) int local898 = local581 * (local520 & 0x7F) >> 7;
									if (local898 < 2) {
										local898 = 2;
									} else if (local898 > 126) {
										local898 = 126;
									}
									local920 = Static343.anIntArray359[local898 | local520 & 0xFF80];
									if ((this.anInt8499 & 0x7) == 0) {
										local665 = this.aClass95_Sub3_20.aFloatArray72[0] * local575 + local577 * this.aClass95_Sub3_20.aFloatArray72[1] + local583 * this.aClass95_Sub3_20.aFloatArray72[2];
										local665 = this.aClass95_Sub3_20.aFloat178 + local560 * (local560 > 0.0F ? this.aClass95_Sub3_20.aFloat174 : this.aClass95_Sub3_20.aFloat188);
										@Pc(973) int local973 = local920 >> 16 & 0xFF;
										@Pc(979) int local979 = local920 >> 8 & 0xFF;
										local973 = (int) ((float) local973 * local665);
										@Pc(989) int local989 = local920 & 0xFF;
										local979 = (int) ((float) local979 * local665);
										if (local973 < 0) {
											local973 = 0;
										} else if (local973 > 255) {
											local973 = 255;
										}
										local989 = (int) ((float) local989 * local665);
										if (local979 < 0) {
											local979 = 0;
										} else if (local979 > 255) {
											local979 = 255;
										}
										if (local989 < 0) {
											local989 = 0;
										} else if (local989 > 255) {
											local989 = 255;
										}
										local920 = local989 | local979 << 8 | local973 << 16;
									}
								}
								if (Stream.a()) {
									local167.b((float) local493);
									local167.b((float) (this.method7398(local493, local502) + local528));
									local167.b((float) local502);
									local167.b((float) local493);
									local167.b((float) local502);
									if (this.anIntArrayArrayArray14 != null) {
										local167.b((float) (local275 == null ? 0 : local275[local435] - 1));
									}
									if ((this.anInt8499 & 0x7) != 0) {
										local167.b(local575);
										local167.b(local577);
										local167.b(local583);
									}
								} else {
									local167.a((float) local493);
									local167.a((float) (local528 + this.method7398(local493, local502)));
									local167.a((float) local502);
									local167.a((float) local493);
									local167.a((float) local502);
									if (this.anIntArrayArrayArray14 != null) {
										local167.a((float) (local275 == null ? 0 : local275[local435] - 1));
									}
									if ((this.anInt8499 & 0x7) != 0) {
										local167.a(local575);
										local167.a(local577);
										local167.a(local583);
									}
								}
								if (this.aClass95_Sub3_20.anInt8380 == 0) {
									local172.c(local920 | 0xFF000000);
								} else {
									local172.d(local920 | 0xFF000000);
								}
								local1203 = this.anInt8496++;
								local480[local435] = (short) local1203;
								if (local516 != -1) {
									local176[local1203] = local219[local435];
								}
								local193.method2601(new Class2_Sub16(local480[local435]), local546);
							} else {
								local480[local435] = ((Class2_Sub16) local862).aShort33;
								local1203 = local480[local435] & 0xFFFF;
								if (local516 != -1 && local219[local435].aLong280 < local176[local1203].aLong280) {
									local176[local1203] = local219[local435];
								}
							}
							for (local920 = 0; local920 < local425; local920++) {
								local197[local920].method7924(local558, local581, local560, local1203);
							}
							this.anInt8497++;
						}
					}
				}
			}
			for (local203 = 0; local203 < this.anInt8496; local203++) {
				@Pc(1315) Class2_Sub49 local1315 = local176[local203];
				if (local1315 != null) {
					local1315.method7923(local203);
				}
			}
			@Pc(1332) int local1332;
			@Pc(1351) int local1351;
			for (@Pc(1328) int local1328 = 0; local1328 < super.anInt8791; local1328++) {
				for (local1332 = 0; super.anInt8794 > local1332; local1332++) {
					@Pc(1345) short[] local1345 = this.aShortArrayArray26[super.anInt8791 * local1332 + local1328];
					if (local1345 != null) {
						@Pc(1349) int local1349 = 0;
						local1351 = 0;
						while (local1345.length > local1351) {
							@Pc(1360) int local1360 = local1345[local1351++] & 0xFFFF;
							@Pc(1367) int local1367 = local1345[local1351++] & 0xFFFF;
							@Pc(1374) int local1374 = local1345[local1351++] & 0xFFFF;
							@Pc(1378) Class2_Sub49 local1378 = local176[local1360];
							@Pc(1382) Class2_Sub49 local1382 = local176[local1367];
							@Pc(1386) Class2_Sub49 local1386 = local176[local1374];
							@Pc(1388) Class2_Sub49 local1388 = null;
							if (local1378 != null) {
								local1378.method7922(local1349, local1332, local1328);
								local1388 = local1378;
							}
							if (local1382 != null) {
								local1382.method7922(local1349, local1332, local1328);
								if (local1388 == null || local1382.aLong280 < local1388.aLong280) {
									local1388 = local1382;
								}
							}
							if (local1386 != null) {
								local1386.method7922(local1349, local1332, local1328);
								if (local1388 == null || local1386.aLong280 < local1388.aLong280) {
									local1388 = local1386;
								}
							}
							if (local1388 != null) {
								if (local1378 != null) {
									local1388.method7923(local1360);
								}
								if (local1382 != null) {
									local1388.method7923(local1367);
								}
								if (local1386 != null) {
									local1388.method7923(local1374);
								}
								local1388.method7922(local1349, local1332, local1328);
							}
							local1349++;
						}
					}
				}
			}
			local167.c();
			local172.c();
			this.anInterface16_17 = this.aClass95_Sub3_20.method7122(false);
			this.anInterface16_17.method7460(local152, 4, this.anInt8496 * 4);
			this.anInterface16_16 = this.aClass95_Sub3_20.method7122(false);
			this.anInterface16_16.method7460(local162, local129, local129 * this.anInt8496);
			if ((this.anInt8499 & 0x7) == 0) {
				if (this.anIntArrayArrayArray14 == null) {
					this.aClass72_23 = this.aClass95_Sub3_20.method7056(new Class258[] { new Class258(new Class202[] { Static312.aClass202_1, Static312.aClass202_5 }), new Class258(Static312.aClass202_3) });
				} else {
					this.aClass72_23 = this.aClass95_Sub3_20.method7056(new Class258[] { new Class258(new Class202[] { Static312.aClass202_1, Static312.aClass202_5, Static312.aClass202_4 }), new Class258(Static312.aClass202_3) });
				}
			} else if (this.anIntArrayArrayArray14 == null) {
				this.aClass72_23 = this.aClass95_Sub3_20.method7056(new Class258[] { new Class258(new Class202[] { Static312.aClass202_1, Static312.aClass202_5, Static312.aClass202_2 }), new Class258(Static312.aClass202_3) });
			} else {
				this.aClass72_23 = this.aClass95_Sub3_20.method7056(new Class258[] { new Class258(new Class202[] { Static312.aClass202_1, Static312.aClass202_5, Static312.aClass202_4, Static312.aClass202_2 }), new Class258(Static312.aClass202_3) });
			}
			local1332 = 0;
			for (@Pc(1695) int local1695 = 0; local1695 < local105.length; local1695++) {
				if (local105[local1695].anInt9455 > 0) {
					local105[local1332++] = local105[local1695];
				}
			}
			this.aClass2_Sub49Array1 = new Class2_Sub49[local1332];
			@Pc(1721) long[] local1721 = new long[local1332];
			for (local1351 = 0; local1351 < local1332; local1351++) {
				@Pc(1729) Class2_Sub49 local1729 = local105[local1351];
				local1721[local1351] = local1729.aLong280;
				this.aClass2_Sub49Array1[local1351] = local1729;
				local1729.method7920(this.anInt8496);
			}
			Static72.method1003(local1721, this.aClass2_Sub49Array1);
			if (this.aClass122_2 != null) {
				this.aClass122_2.method2633();
			}
		}
		this.aClass118_44 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray15 = null;
		this.aFloatArrayArray17 = this.aFloatArrayArray16 = this.aFloatArrayArray18 = null;
		this.aClass2_Sub49ArrayArrayArray1 = null;
		this.aByteArrayArray28 = null;
		this.anIntArrayArrayArray17 = this.anIntArrayArrayArray18 = null;
		this.anIntArrayArrayArray14 = null;
	}
}
