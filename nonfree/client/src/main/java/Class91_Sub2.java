import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class91_Sub2 extends Class91 {

	@OriginalMember(owner = "client!lp", name = "A", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
	private int anInt5818;

	@OriginalMember(owner = "client!lp", name = "Z", descriptor = "I")
	private int anInt5832;

	@OriginalMember(owner = "client!lp", name = "ab", descriptor = "Lclient!ri;")
	public Class258 aClass258_9;

	@OriginalMember(owner = "client!lp", name = "eb", descriptor = "Lclient!ia;")
	private Interface10 anInterface10_10;

	@OriginalMember(owner = "client!lp", name = "jb", descriptor = "Lclient!ia;")
	private Interface10 anInterface10_11;

	@OriginalMember(owner = "client!lp", name = "kb", descriptor = "I")
	private int anInt5835;

	@OriginalMember(owner = "client!lp", name = "lb", descriptor = "[Lclient!io;")
	private Class2_Sub25[] lb;

	@OriginalMember(owner = "client!lp", name = "mb", descriptor = "I")
	private int anInt5836;

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "F")
	private float aFloat115 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "F")
	private float aFloat116 = -3.4028235E38F;

	@OriginalMember(owner = "client!lp", name = "P", descriptor = "Lclient!fh;")
	private final Class114 aClass114_29 = new Class114();

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "Lclient!ij;")
	public final Class13_Sub3 aClass13_Sub3_12;

	@OriginalMember(owner = "client!lp", name = "W", descriptor = "I")
	private final int anInt5829;

	@OriginalMember(owner = "client!lp", name = "V", descriptor = "I")
	private final int anInt5828;

	@OriginalMember(owner = "client!lp", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!lp", name = "N", descriptor = "[[B")
	private final byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!lp", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
	public final int anInt5821;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!lp", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!lp", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!lp", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!lp", name = "Q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "[[[Lclient!io;")
	private Class2_Sub25[][][] aClass2_Sub25ArrayArrayArray1;

	@OriginalMember(owner = "client!lp", name = "fb", descriptor = "Lclient!tba;")
	private Class323 aClass323_20;

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "Lclient!oo;")
	private Class262 aClass262_2;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!ij;IIII[[I[[II)V")
	public Class91_Sub2(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass13_Sub3_12 = arg0;
		this.anInt5829 = super.anInt8641 - 2;
		this.anInt5828 = 0x1 << this.anInt5829;
		this.aFloatArrayArray6 = new float[super.anInt8650 + 1][super.anInt8645 + 1];
		this.aByteArrayArray15 = new byte[arg3][arg4];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anInt5821 = arg2;
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt8650 + 1][super.anInt8645 + 1];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aShortArrayArray4 = new short[arg4 * arg3][];
		this.aFloatArrayArray4 = new float[super.anInt8650 + 1][super.anInt8645 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aClass2_Sub25ArrayArrayArray1 = new Class2_Sub25[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt8645 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt8650; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray104[local125][local121];
				if (this.aFloat116 < (float) local134) {
					this.aFloat116 = (float) local134;
				}
				if ((float) local134 < this.aFloat115) {
					this.aFloat115 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt8650 > local125 && local121 < super.anInt8645) {
					@Pc(187) int local187 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(203) int local203 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(223) float local223 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local187 * local187 + local203 * local203)));
					this.aFloatArrayArray5[local125][local121] = (float) local187 * local223;
					this.aFloatArrayArray6[local125][local121] = (float) (-arg7 * 2) * local223;
					this.aFloatArrayArray4[local125][local121] = local223 * (float) local203;
				}
			}
		}
		this.aFloat116++;
		this.aFloat115--;
		this.aClass323_20 = new Class323(128);
		if ((this.anInt5821 & 0x10) != 0) {
			this.aClass262_2 = new Class262(this.aClass13_Sub3_12, this);
		}
	}

	@OriginalMember(owner = "client!lp", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass262_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass13_Sub3_12.anInt9753 * arg2 >> 8) >> this.aClass13_Sub3_12.anInt9738;
			@Pc(39) int local39 = arg3 - (this.aClass13_Sub3_12.anInt9741 * arg2 >> 8) >> this.aClass13_Sub3_12.anInt9738;
			this.aClass262_2.method6101(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!lp", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass262_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass13_Sub3_12.anInt9753 >> 8) >> this.aClass13_Sub3_12.anInt9738;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass13_Sub3_12.anInt9741 >> 8) >> this.aClass13_Sub3_12.anInt9738;
			this.aClass262_2.method6104(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
	@Override
	public void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!vca;IBI)V")
	private void method5060(@OriginalArg(0) Class2_Sub7_Sub17_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray15[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray11[arg2][arg1];
		@Pc(35) int local35 = local12.length;
		if (local35 > Static86.anIntArray152.length) {
			Static1.anIntArray614 = new int[local35];
			Static86.anIntArray152 = new int[local35];
		}
		for (@Pc(47) int local47 = 0; local47 < local35; local47++) {
			Static86.anIntArray152[local47] = local12[local47] >> this.aClass13_Sub3_12.anInt9738;
			Static1.anIntArray614[local47] = local19[local47] >> this.aClass13_Sub3_12.anInt9738;
		}
		@Pc(79) int local79 = 0;
		while (local35 > local79) {
			@Pc(85) int local85 = Static86.anIntArray152[local79];
			@Pc(90) int local90 = Static1.anIntArray614[local79++];
			@Pc(94) int local94 = Static86.anIntArray152[local79];
			@Pc(99) int local99 = Static1.anIntArray614[local79++];
			@Pc(103) int local103 = Static86.anIntArray152[local79];
			@Pc(108) int local108 = Static1.anIntArray614[local79++];
			if (-((local103 - local94) * (-local90 + local99)) + (local99 - local108) * (local85 - local94) > 0) {
				arg0.method8467(local90, local103, local85, local94, local99, local108);
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub7_Sub17 arg2) {
		if ((this.aByteArrayArray15[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8647 >> this.aClass13_Sub3_12.anInt9738;
		@Pc(27) Class2_Sub7_Sub17_Sub2 local27 = (Class2_Sub7_Sub17_Sub2) arg2;
		@Pc(37) Class2_Sub7_Sub17_Sub2 local37;
		if (local27 != null && local27.method8462(local24, local24)) {
			local37 = local27;
			local27.method8466();
		} else {
			local37 = new Class2_Sub7_Sub17_Sub2(this.aClass13_Sub3_12, local24, local24);
		}
		local37.method8463(local24, local24, 0, 0);
		this.method5060(local37, arg1, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!lp", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface2 local9 = this.aClass13_Sub3_12.anInterface2_12;
		if (arg3 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt8650][super.anInt8645][];
		}
		if (arg5 != null && this.anIntArrayArrayArray13 == null) {
			this.anIntArrayArrayArray13 = new int[super.anInt8650][super.anInt8645][];
		}
		this.anIntArrayArrayArray15[arg0][arg1] = arg2;
		this.anIntArrayArrayArray11[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray10[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray13 != null) {
			this.anIntArrayArrayArray13[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub25[] local92 = this.aClass2_Sub25ArrayArrayArray1[arg0][arg1] = new Class2_Sub25[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt5821 & 0x20) != 0 && local100 != -1 && local9.method6027(local100).aBoolean514) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(148) long local148 = (long) (local104 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) local100;
			@Pc(154) Class2 local154;
			for (local154 = this.aClass323_20.method7484(local148); local154 != null; local154 = this.aClass323_20.method7486()) {
				@Pc(159) Class2_Sub25 local159 = (Class2_Sub25) local154;
				if (local100 == local159.anInt4746 && (float) local104 == local159.aFloat103 && local159.anInt4748 == arg10 && local159.anInt4739 == arg11 && arg12 == local159.anInt4740) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class2_Sub25(this, local100, local104, arg10, arg11, arg12);
				this.aClass323_20.method7477(local92[local94], local148);
			} else {
				local92[local94] = (Class2_Sub25) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray15[arg0][arg1] = (byte) (this.aByteArrayArray15[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt5835) {
			this.anInt5835 = arg6.length;
		}
		this.anInt5836 += arg6.length;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5062(arg1, arg5, arg3, arg6, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7445(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass262_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass13_Sub3_12.anInt9753 >> 8) >> this.aClass13_Sub3_12.anInt9738;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass13_Sub3_12.anInt9741 >> 8) >> this.aClass13_Sub3_12.anInt9738;
			return this.aClass262_2.method6105(arg0, local25, local39);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7456(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5836 <= 0) {
			return;
		}
		@Pc(19) Interface11 local19 = this.aClass13_Sub3_12.method8287(this.anInt5832);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7405();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass13_Sub3_12.method8260(local36);
				@Pc(48) int local48;
				@Pc(58) int local58;
				@Pc(60) int local60;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = super.anInt8650 * local48 + arg0;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray4[local58];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local44.b(local90);
										local21++;
										if (local23 > local90) {
											local23 = local90;
										}
										if (local90 > local25) {
											local25 = local90;
										}
									}
								}
							}
							local58++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = arg0 + local48 * super.anInt8650;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray4[local58];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 > local25) {
											local25 = local90;
										}
										local21++;
										if (local90 < local23) {
											local23 = local90;
										}
										local44.e(local90);
									}
								}
							}
							local58++;
						}
					}
				}
				local44.b();
				if (local19.method7409()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass13_Sub3_12.method8307();
		this.aClass13_Sub3_12.method8184(false);
		this.aClass13_Sub3_12.method8302(false);
		this.aClass13_Sub3_12.method8194(false);
		this.aClass13_Sub3_12.method8218(false);
		this.aClass13_Sub3_12.method8306(0);
		this.aClass13_Sub3_12.method8261(false, false, -2);
		this.aClass13_Sub3_12.method8234((Interface6) null);
		@Pc(270) Class51_Sub2 local270 = this.aClass13_Sub3_12.method8193();
		@Pc(275) float[] local275 = this.aClass13_Sub3_12.method8187();
		local275[0] = (float) 1024 / ((float) this.aClass13_Sub3_12.anInt9598 * (float) super.anInt8647 * 128.0F);
		local275[6] = 0.0F;
		local275[11] = 0.0F;
		local275[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass13_Sub3_12.anInt9644;
		local275[15] = 1.0F;
		local275[7] = 0.0F;
		local275[1] = 0.0F;
		local275[8] = 0.0F;
		local275[3] = 0.0F;
		local275[5] = (float) 1024 / ((float) this.aClass13_Sub3_12.anInt9644 * (float) super.anInt8647 * 128.0F);
		local275[4] = 0.0F;
		local275[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass13_Sub3_12.anInt9598) - 1.0F;
		local275[9] = 0.0F;
		local275[2] = 0.0F;
		local275[14] = -this.aFloat115 / (this.aFloat116 - this.aFloat115);
		local275[10] = 1.0F / (this.aFloat116 - this.aFloat115);
		local270.method3233(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F);
		this.aClass13_Sub3_12.method8284();
		this.aClass13_Sub3_12.method8290();
		if ((this.anInt5821 & 0x7) == 0) {
			this.aClass13_Sub3_12.method8302(false);
		} else {
			this.aClass13_Sub3_12.method8302(true);
			this.aClass13_Sub3_12.method8280();
		}
		this.aClass13_Sub3_12.method8247(false);
		this.aClass13_Sub3_12.method8192(0, this.anInterface10_11);
		this.aClass13_Sub3_12.method8192(1, this.anInterface10_10);
		this.aClass13_Sub3_12.method8243(this.aClass258_9);
		this.aClass13_Sub3_12.method8188(local23, local25 + 1 - local23, Static339.aClass191_4, local19, local21 / 3, 0);
		this.aClass13_Sub3_12.method8247(true);
	}

	@OriginalMember(owner = "client!lp", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt5836 <= 0) {
			this.aClass262_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt8650 + 1][super.anInt8645 + 1];
			for (@Pc(28) int local28 = 1; super.anInt8650 > local28; local28++) {
				for (@Pc(32) int local32 = 1; super.anInt8645 > local32; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray16[local28][local32 - 1] >> 2) + (this.aByteArrayArray16[local28 + 1][local32] >> 3) + (this.aByteArrayArray16[local28 + -1][local32] >> 2) + (this.aByteArrayArray16[local28][local32 + 1] >> 3) + (this.aByteArrayArray16[local28][local32] >> 1));
				}
			}
			@Pc(112) Class2_Sub25[] local112 = new Class2_Sub25[this.aClass323_20.method7483()];
			this.aClass323_20.method7476(local112);
			for (@Pc(120) int local120 = 0; local120 < local112.length; local120++) {
				local112[local120].method4159(this.anInt5836);
			}
			@Pc(136) int local136 = 20;
			if (this.anIntArrayArrayArray13 != null) {
				local136 += 4;
			}
			if ((this.anInt5821 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(159) NativeHeapBuffer local159 = this.aClass13_Sub3_12.aNativeHeap5.a(this.anInt5836 * 4, false);
			@Pc(169) NativeHeapBuffer local169 = this.aClass13_Sub3_12.aNativeHeap5.a(this.anInt5836 * local136, false);
			@Pc(174) Stream local174 = new Stream(local169);
			@Pc(179) Stream local179 = new Stream(local159);
			@Pc(183) Class2_Sub25[] local183 = new Class2_Sub25[this.anInt5836];
			@Pc(190) int local190 = Static276.method7580(this.anInt5836 / 4);
			if (local190 < 1) {
				local190 = 1;
			}
			@Pc(202) Class323 local202 = new Class323(local190);
			@Pc(206) Class2_Sub25[] local206 = new Class2_Sub25[this.anInt5835];
			@Pc(212) int local212;
			for (@Pc(208) int local208 = 0; super.anInt8650 > local208; local208++) {
				for (local212 = 0; local212 < super.anInt8645; local212++) {
					if (this.anIntArrayArrayArray12[local208][local212] != null) {
						@Pc(228) Class2_Sub25[] local228 = this.aClass2_Sub25ArrayArrayArray1[local208][local212];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray15[local208][local212];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray11[local208][local212];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray10[local208][local212];
						@Pc(256) int[] local256 = this.anIntArrayArrayArray12[local208][local212];
						@Pc(268) int[] local268 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local208][local212];
						if (local249 == null) {
							local249 = local256;
						}
						@Pc(284) int[] local284 = this.anIntArrayArrayArray13 == null ? null : this.anIntArrayArrayArray13[local208][local212];
						@Pc(291) float local291 = this.aFloatArrayArray5[local208][local212];
						@Pc(298) float local298 = this.aFloatArrayArray6[local208][local212];
						@Pc(305) float local305 = this.aFloatArrayArray4[local208][local212];
						@Pc(314) float local314 = this.aFloatArrayArray5[local208][local212 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray6[local208][local212 + 1];
						@Pc(332) float local332 = this.aFloatArrayArray4[local208][local212 + 1];
						@Pc(343) float local343 = this.aFloatArrayArray5[local208 + 1][local212 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray6[local208 + 1][local212 + 1];
						@Pc(365) float local365 = this.aFloatArrayArray4[local208 + 1][local212 + 1];
						@Pc(374) float local374 = this.aFloatArrayArray5[local208 + 1][local212];
						@Pc(383) float local383 = this.aFloatArrayArray6[local208 + 1][local212];
						@Pc(392) float local392 = this.aFloatArrayArray4[local208 + 1][local212];
						@Pc(400) int local400 = local26[local208][local212] & 0xFF;
						@Pc(410) int local410 = local26[local208][local212 + 1] & 0xFF;
						@Pc(422) int local422 = local26[local208 + 1][local212 + 1] & 0xFF;
						@Pc(432) int local432 = local26[local208 + 1][local212] & 0xFF;
						@Pc(434) int local434 = 0;
						@Pc(444) int local444;
						label355: for (@Pc(436) int local436 = 0; local436 < local256.length; local436++) {
							@Pc(442) Class2_Sub25 local442 = local228[local436];
							for (local444 = 0; local444 < local434; local444++) {
								if (local442 == local206[local444]) {
									continue label355;
								}
							}
							local206[local434++] = local442;
						}
						@Pc(485) short[] local485 = this.aShortArrayArray4[local212 * super.anInt8650 + local208] = new short[local256.length];
						for (local444 = 0; local444 < local256.length; local444++) {
							@Pc(499) int local499 = (local208 << super.anInt8641) + local235[local444];
							@Pc(509) int local509 = (local212 << super.anInt8641) + local242[local444];
							@Pc(514) int local514 = local499 >> this.anInt5829;
							@Pc(519) int local519 = local509 >> this.anInt5829;
							@Pc(523) int local523 = local256[local444];
							@Pc(527) int local527 = local249[local444];
							@Pc(535) int local535 = local268 == null ? 0 : local268[local444];
							@Pc(553) long local553 = (long) local519 | (long) (local514 << 16) | (long) local527 << 48 | (long) local523 << 32;
							@Pc(557) int local557 = local235[local444];
							@Pc(561) int local561 = local242[local444];
							@Pc(563) byte local563 = 74;
							@Pc(565) int local565 = 0;
							@Pc(567) float local567 = 1.0F;
							@Pc(583) float local583;
							@Pc(587) float local587;
							@Pc(585) float local585;
							@Pc(672) float local672;
							@Pc(581) int local581;
							if (local557 == 0 && local561 == 0) {
								local581 = local563 - local400;
								local583 = local291;
								local585 = local305;
								local587 = local298;
							} else if (local557 == 0 && super.anInt8647 == local561) {
								local581 = local563 - local410;
								local583 = local314;
								local587 = local323;
								local585 = local332;
							} else if (super.anInt8647 == local557 && super.anInt8647 == local561) {
								local587 = local354;
								local583 = local343;
								local581 = local563 - local422;
								local585 = local365;
							} else if (super.anInt8647 == local557 && local561 == 0) {
								local583 = local374;
								local587 = local383;
								local585 = local392;
								local581 = local563 - local432;
							} else {
								@Pc(647) float local647 = (float) local557 / (float) super.anInt8647;
								@Pc(654) float local654 = (float) local561 / (float) super.anInt8647;
								@Pc(663) float local663 = local291 + (local374 - local291) * local647;
								local672 = (local383 - local298) * local647 + local298;
								@Pc(681) float local681 = local305 + (local392 - local305) * local647;
								@Pc(689) float local689 = local314 + local647 * (local343 - local314);
								@Pc(697) float local697 = (local354 - local323) * local647 + local323;
								local587 = (local697 - local672) * local654 + local672;
								@Pc(714) float local714 = local332 + local647 * (local365 - local332);
								local583 = local663 + local654 * (local689 - local663);
								local585 = local681 + (local714 - local681) * local654;
								@Pc(745) int local745 = local400 + (local557 * (local432 - local400) >> super.anInt8641);
								@Pc(757) int local757 = ((local422 - local410) * local557 >> super.anInt8641) + local410;
								local581 = local563 - (local561 * (local757 - local745) >> super.anInt8641) - local745;
							}
							if (local523 != -1) {
								@Pc(806) int local806 = local581 * (local523 & 0x7F) >> 7;
								if (local806 < 2) {
									local806 = 2;
								} else if (local806 > 126) {
									local806 = 126;
								}
								local565 = Static347.anIntArray701[local523 & 0xFF80 | local806];
								if ((this.anInt5821 & 0x7) == 0) {
									local567 = this.aClass13_Sub3_12.aFloatArray91[1] * local587 + local583 * this.aClass13_Sub3_12.aFloatArray91[0] + local585 * this.aClass13_Sub3_12.aFloatArray91[2];
									local567 = local567 * (local567 > 0.0F ? this.aClass13_Sub3_12.aFloat197 : this.aClass13_Sub3_12.aFloat204) + this.aClass13_Sub3_12.aFloat202;
								}
							}
							@Pc(880) Class2 local880 = null;
							if ((this.anInt5828 - 1 & local499) == 0 && (this.anInt5828 - 1 & local509) == 0) {
								local880 = local202.method7484(local553);
							}
							@Pc(1220) int local1220;
							@Pc(941) int local941;
							if (local880 == null) {
								if (local523 == local527) {
									local941 = local565;
								} else {
									@Pc(919) int local919 = local581 * (local527 & 0x7F) >> 7;
									if (local919 < 2) {
										local919 = 2;
									} else if (local919 > 126) {
										local919 = 126;
									}
									local941 = Static347.anIntArray701[local527 & 0xFF80 | local919];
									if ((this.anInt5821 & 0x7) == 0) {
										local672 = local585 * this.aClass13_Sub3_12.aFloatArray91[2] + this.aClass13_Sub3_12.aFloatArray91[1] * local587 + local583 * this.aClass13_Sub3_12.aFloatArray91[0];
										local672 = (local567 > 0.0F ? this.aClass13_Sub3_12.aFloat197 : this.aClass13_Sub3_12.aFloat204) * local567 + this.aClass13_Sub3_12.aFloat202;
										@Pc(994) int local994 = local941 >> 16 & 0xFF;
										@Pc(1000) int local1000 = local941 >> 8 & 0xFF;
										@Pc(1004) int local1004 = local941 & 0xFF;
										local994 = (int) ((float) local994 * local672);
										local1000 = (int) ((float) local1000 * local672);
										if (local994 < 0) {
											local994 = 0;
										} else if (local994 > 255) {
											local994 = 255;
										}
										if (local1000 < 0) {
											local1000 = 0;
										} else if (local1000 > 255) {
											local1000 = 255;
										}
										local1004 = (int) ((float) local1004 * local672);
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										local941 = local1000 << 8 | local994 << 16 | local1004;
									}
								}
								if (Stream.c()) {
									local174.b((float) local499);
									local174.b((float) (this.method7446(local499, local509) + local535));
									local174.b((float) local509);
									local174.b((float) local499);
									local174.b((float) local509);
									if (this.anIntArrayArrayArray13 != null) {
										local174.b((float) (local284 == null ? 0 : local284[local444] - 1));
									}
									if ((this.anInt5821 & 0x7) != 0) {
										local174.b(local583);
										local174.b(local587);
										local174.b(local585);
									}
								} else {
									local174.a((float) local499);
									local174.a((float) (local535 + this.method7446(local499, local509)));
									local174.a((float) local509);
									local174.a((float) local499);
									local174.a((float) local509);
									if (this.anIntArrayArrayArray13 != null) {
										local174.a((float) (local284 == null ? 0 : local284[local444] - 1));
									}
									if ((this.anInt5821 & 0x7) != 0) {
										local174.a(local583);
										local174.a(local587);
										local174.a(local585);
									}
								}
								if (this.aClass13_Sub3_12.anInt9759 == 0) {
									local179.c(local941 | 0xFF000000);
								} else {
									local179.a(local941 | 0xFF000000);
								}
								local1220 = this.anInt5818++;
								local485[local444] = (short) local1220;
								if (local523 != -1) {
									local183[local1220] = local228[local444];
								}
								local202.method7477(new Class2_Sub22(local485[local444]), local553);
							} else {
								local485[local444] = ((Class2_Sub22) local880).aShort63;
								local1220 = local485[local444] & 0xFFFF;
								if (local523 != -1 && local228[local444].aLong278 < local183[local1220].aLong278) {
									local183[local1220] = local228[local444];
								}
							}
							for (local941 = 0; local941 < local434; local941++) {
								local206[local941].method4153(local581, local565, local567, local1220);
							}
							this.anInt5832++;
						}
					}
				}
			}
			for (local212 = 0; local212 < this.anInt5818; local212++) {
				@Pc(1336) Class2_Sub25 local1336 = local183[local212];
				if (local1336 != null) {
					local1336.method4161(local212);
				}
			}
			@Pc(1353) int local1353;
			@Pc(1371) int local1371;
			for (@Pc(1349) int local1349 = 0; local1349 < super.anInt8650; local1349++) {
				for (local1353 = 0; super.anInt8645 > local1353; local1353++) {
					@Pc(1365) short[] local1365 = this.aShortArrayArray4[super.anInt8650 * local1353 + local1349];
					if (local1365 != null) {
						@Pc(1369) int local1369 = 0;
						local1371 = 0;
						while (local1365.length > local1371) {
							@Pc(1380) int local1380 = local1365[local1371++] & 0xFFFF;
							@Pc(1387) int local1387 = local1365[local1371++] & 0xFFFF;
							@Pc(1394) int local1394 = local1365[local1371++] & 0xFFFF;
							@Pc(1398) Class2_Sub25 local1398 = local183[local1380];
							@Pc(1402) Class2_Sub25 local1402 = local183[local1387];
							@Pc(1406) Class2_Sub25 local1406 = local183[local1394];
							@Pc(1408) Class2_Sub25 local1408 = null;
							if (local1398 != null) {
								local1398.method4158(local1349, local1353, local1369);
								local1408 = local1398;
							}
							if (local1402 != null) {
								local1402.method4158(local1349, local1353, local1369);
								if (local1408 == null || local1402.aLong278 < local1408.aLong278) {
									local1408 = local1402;
								}
							}
							if (local1406 != null) {
								local1406.method4158(local1349, local1353, local1369);
								if (local1408 == null || local1406.aLong278 < local1408.aLong278) {
									local1408 = local1406;
								}
							}
							if (local1408 != null) {
								if (local1398 != null) {
									local1408.method4161(local1380);
								}
								if (local1402 != null) {
									local1408.method4161(local1387);
								}
								if (local1406 != null) {
									local1408.method4161(local1394);
								}
								local1408.method4158(local1349, local1353, local1369);
							}
							local1369++;
						}
					}
				}
			}
			local174.b();
			local179.b();
			this.anInterface10_10 = this.aClass13_Sub3_12.method8200(false);
			this.anInterface10_10.method8447(4, this.anInt5818 * 4, local159);
			this.anInterface10_11 = this.aClass13_Sub3_12.method8200(false);
			this.anInterface10_11.method8447(local136, local136 * this.anInt5818, local169);
			if ((this.anInt5821 & 0x7) == 0) {
				if (this.anIntArrayArrayArray13 == null) {
					this.aClass258_9 = this.aClass13_Sub3_12.method8292(new Class118[] { new Class118(new Class371[] { Static622.aClass371_1, Static622.aClass371_5 }), new Class118(Static622.aClass371_3) });
				} else {
					this.aClass258_9 = this.aClass13_Sub3_12.method8292(new Class118[] { new Class118(new Class371[] { Static622.aClass371_1, Static622.aClass371_5, Static622.aClass371_4 }), new Class118(Static622.aClass371_3) });
				}
			} else if (this.anIntArrayArrayArray13 == null) {
				this.aClass258_9 = this.aClass13_Sub3_12.method8292(new Class118[] { new Class118(new Class371[] { Static622.aClass371_1, Static622.aClass371_5, Static622.aClass371_2 }), new Class118(Static622.aClass371_3) });
			} else {
				this.aClass258_9 = this.aClass13_Sub3_12.method8292(new Class118[] { new Class118(new Class371[] { Static622.aClass371_1, Static622.aClass371_5, Static622.aClass371_4, Static622.aClass371_2 }), new Class118(Static622.aClass371_3) });
			}
			local1353 = 0;
			for (@Pc(1708) int local1708 = 0; local1708 < local112.length; local1708++) {
				if (local112[local1708].anInt4741 > 0) {
					local112[local1353++] = local112[local1708];
				}
			}
			this.lb = new Class2_Sub25[local1353];
			@Pc(1737) long[] local1737 = new long[local1353];
			for (local1371 = 0; local1371 < local1353; local1371++) {
				@Pc(1745) Class2_Sub25 local1745 = local112[local1371];
				local1737[local1371] = local1745.aLong278;
				this.lb[local1371] = local1745;
				local1745.method4157(this.anInt5818);
			}
			Static92.method1886(local1737, this.lb);
			if (this.aClass262_2 != null) {
				this.aClass262_2.method6103();
			}
		}
		this.aClass323_20 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray4 = null;
		this.aByteArrayArray16 = null;
		this.aClass2_Sub25ArrayArrayArray1 = null;
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray15 = this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5062(arg1, -1, arg3, arg5, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!lp", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray16[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray16[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!laa;[I)V")
	@Override
	public void method7455(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass114_29.method2771(new Class2_Sub45(this.aClass13_Sub3_12, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[[ZIIIZI)V")
	private void method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		if (this.lb == null) {
			return;
		}
		@Pc(20) int local20 = arg4 + arg4 + 1;
		@Pc(24) int local24 = local20 * local20;
		if (Static551.anIntArray659.length < local24) {
			Static551.anIntArray659 = new int[local24];
		}
		@Pc(40) int local40 = arg6 - arg4;
		@Pc(42) int local42 = local40;
		if (local40 < 0) {
			local40 = 0;
		}
		@Pc(51) int local51 = arg0 - arg4;
		@Pc(53) int local53 = local51;
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(61) int local61 = arg4 + arg6;
		if (super.anInt8650 - 1 < local61) {
			local61 = super.anInt8650 - 1;
		}
		@Pc(81) int local81 = arg0 + arg4;
		Static226.anInt4172 = 0;
		if (local81 > super.anInt8645 - 1) {
			local81 = super.anInt8645 - 1;
		}
		for (@Pc(96) int local96 = local40; local96 <= local61; local96++) {
			@Pc(105) boolean[] local105 = arg2[local96 - local42];
			for (@Pc(107) int local107 = local51; local107 <= local81; local107++) {
				if (local105[local107 - local53]) {
					Static551.anIntArray659[Static226.anInt4172++] = local107 * super.anInt8650 + local96;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass13_Sub3_12.method8223();
		} else {
			this.aClass13_Sub3_12.method8263((float) arg1);
			this.aClass13_Sub3_12.method8295();
		}
		this.aClass13_Sub3_12.method8241();
		this.aClass13_Sub3_12.method8302((this.anInt5821 & 0x7) != 0);
		this.aClass13_Sub3_12.method8261(false, false, -1);
		this.aClass13_Sub3_12.method8192(0, this.anInterface10_11);
		for (@Pc(202) int local202 = 0; local202 < this.lb.length; local202++) {
			this.lb[local202].method4154(Static226.anInt4172, Static551.anIntArray659);
		}
		@Pc(223) Class51_Sub2 local223 = this.aClass13_Sub3_12.method8193();
		local223.method6705(0, -1, 0);
		this.aClass13_Sub3_12.method8290();
		if (!this.aClass114_29.method2767()) {
			@Pc(241) int local241 = this.aClass13_Sub3_12.anInt9743;
			@Pc(245) int local245 = this.aClass13_Sub3_12.anInt9726;
			this.aClass13_Sub3_12.L(0, local245, this.aClass13_Sub3_12.anInt9747);
			this.aClass13_Sub3_12.method8302(false);
			this.aClass13_Sub3_12.method8218(false);
			this.aClass13_Sub3_12.method8306(128);
			this.aClass13_Sub3_12.method8261(false, false, -2);
			this.aClass13_Sub3_12.method8234(this.aClass13_Sub3_12.anInterface6_3);
			this.aClass13_Sub3_12.method8235(Static259.aClass269_4, Static408.aClass269_3);
			this.aClass13_Sub3_12.method8231(Static470.aClass43_5, 0);
			this.aClass13_Sub3_12.method8279(Static23.aClass43_1, 0);
			for (@Pc(305) Class2 local305 = this.aClass114_29.method2772(); local305 != null; local305 = this.aClass114_29.method2762()) {
				@Pc(310) Class2_Sub45 local310 = (Class2_Sub45) local305;
				local310.method8496(arg6, arg0, arg4, arg2);
			}
			this.aClass13_Sub3_12.method8231(Static338.aClass43_3, 0);
			this.aClass13_Sub3_12.method8279(Static338.aClass43_3, 0);
			this.aClass13_Sub3_12.method8234((Interface6) null);
			this.aClass13_Sub3_12.L(local241, local245, this.aClass13_Sub3_12.anInt9747);
		}
		if (this.aClass262_2 == null) {
			return;
		}
		this.aClass13_Sub3_12.method8192(0, this.anInterface10_11);
		this.aClass13_Sub3_12.method8192(1, this.anInterface10_10);
		this.aClass13_Sub3_12.method8243(this.aClass258_9);
		this.aClass262_2.method6100(arg5, arg6, arg4, arg2, arg0);
		return;
	}
}
