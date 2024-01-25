import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "[[Lclient!jda;")
	private Class175[][] aClass175ArrayArray1;

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "[[Lclient!kca;")
	private Class190[][] aClass190ArrayArray1;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "F")
	private float aFloat18;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "F")
	private float aFloat19;

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "[[Lclient!sha;")
	private Class330[][] aClass330ArrayArray1;

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "[[Lclient!oe;")
	private Class263[][] aClass263ArrayArray1;

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "F")
	private float aFloat20;

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "F")
	private float aFloat21;

	@OriginalMember(owner = "client!cq", name = "x", descriptor = "[[Lclient!uha;")
	private Class364[][] aClass364ArrayArray1;

	@OriginalMember(owner = "client!cq", name = "y", descriptor = "F")
	private float aFloat22;

	@OriginalMember(owner = "client!cq", name = "z", descriptor = "F")
	private float aFloat23;

	@OriginalMember(owner = "client!cq", name = "A", descriptor = "F")
	private float aFloat24;

	@OriginalMember(owner = "client!cq", name = "D", descriptor = "F")
	private float aFloat25;

	@OriginalMember(owner = "client!cq", name = "E", descriptor = "F")
	private float aFloat26;

	@OriginalMember(owner = "client!cq", name = "F", descriptor = "F")
	private float aFloat27;

	@OriginalMember(owner = "client!cq", name = "G", descriptor = "F")
	private float aFloat28;

	@OriginalMember(owner = "client!cq", name = "H", descriptor = "F")
	private float aFloat29;

	@OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
	private int anInt1655 = -1;

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "Lclient!bs;")
	private final Class33_Sub1 aClass33_Sub1_4;

	@OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
	private final int anInt1656;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!bs;IIII[[I[[II)V")
	public Class42_Sub2(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass33_Sub1_4 = arg0;
		this.anInt1656 = arg2;
		this.aByteArrayArray6 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass33_Sub1_4.anInt1169 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass33_Sub1_4.anInt1174 * local90 + this.aClass33_Sub1_4.anInt1168 * local96 + this.aClass33_Sub1_4.anInt1154 * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray6[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass263ArrayArray1 == null) {
			this.aClass263ArrayArray1 = new Class263[super.anInt8638][super.anInt8630];
			this.aClass175ArrayArray1 = new Class175[super.anInt8638][super.anInt8630];
		} else if (this.aClass190ArrayArray1 != null || this.aClass364ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(29) boolean local29 = false;
		@Pc(67) int local67;
		@Pc(73) int local73;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local29 = true;
			for (@Pc(60) int local60 = 1; local60 < 2; local60++) {
				local67 = arg2[arg6[local60]];
				local73 = arg4[arg6[local60]];
				if (local67 != 0 && local67 != super.anInt8631 || local73 != 0 && local73 != super.anInt8631) {
					local29 = false;
					break;
				}
			}
		}
		if (!local29) {
			@Pc(98) Class175 local98 = new Class175();
			@Pc(102) short local102 = (short) arg2.length;
			@Pc(106) short local106 = (short) arg9.length;
			local98.aShort67 = local102;
			local98.aShortArray50 = new short[local102];
			local98.aShortArray48 = new short[local102];
			local98.aShortArray49 = new short[local102];
			local98.aShortArray45 = new short[local102];
			@Pc(136) int local136;
			@Pc(291) int local291;
			@Pc(338) int local338;
			for (@Pc(127) int local127 = 0; local127 < local102; local127++) {
				@Pc(132) int local132 = arg2[local127];
				local136 = arg4[local127];
				if (local132 == 0 && local136 == 0) {
					local98.aShortArray50[local127] = (short) (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				} else if (local132 == 0 && local136 == super.anInt8631) {
					local98.aShortArray50[local127] = (short) (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]);
				} else if (local132 == super.anInt8631 && local136 == super.anInt8631) {
					local98.aShortArray50[local127] = (short) (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]);
				} else if (local132 == super.anInt8631 && local136 == 0) {
					local98.aShortArray50[local127] = (short) (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]);
				} else {
					local291 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) * (super.anInt8631 - local132) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) * local132;
					local338 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) * (super.anInt8631 - local132) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) * local132;
					local98.aShortArray50[local127] = (short) (local291 * (super.anInt8631 - local136) + local338 * local136 >> super.anInt8635 * 2);
				}
				local291 = (arg0 << super.anInt8635) + local132;
				local338 = (arg1 << super.anInt8635) + local136;
				local98.aShortArray48[local127] = (short) local132;
				local98.aShortArray45[local127] = (short) local136;
				local98.aShortArray49[local127] = (short) (this.method7453(local291, local338) + (arg3 == null ? 0 : arg3[local127]));
				if (local98.aShortArray50[local127] < 2) {
					local98.aShortArray50[local127] = 2;
				}
			}
			@Pc(419) boolean local419 = false;
			local136 = 0;
			for (local291 = 0; local291 < local106; local291++) {
				if (arg9[local291] >= 0 || arg10 != null && arg10[local291] >= 0) {
					local136++;
				}
				local338 = arg11[local291];
				if (local338 != -1) {
					@Pc(449) Class130 local449 = this.aClass33_Sub1_4.anInterface9_12.method1558(local338);
					if (!local449.aBoolean241) {
						local419 = true;
						if (this.method1650(local449.aByte39) || local449.aByte34 != 0 || local449.aByte36 != 0) {
							local98.aByte72 = (byte) (local98.aByte72 | 0x4);
						}
					}
				}
			}
			local98.anIntArray319 = new int[local136];
			if (arg10 != null) {
				local98.anIntArray318 = new int[local136];
			}
			local98.aShortArray46 = new short[local136];
			local98.aShortArray51 = new short[local136];
			local98.aShortArray47 = new short[local136];
			if (local419) {
				local98.aShortArray44 = new short[local136];
				local98.aShortArray52 = new short[local136];
			}
			for (local338 = 0; local338 < local106; local338++) {
				if (arg9[local338] >= 0 || arg10 != null && arg10[local338] >= 0) {
					if (arg9[local338] >= 0) {
						local98.anIntArray319[local98.aShort66] = Static391.method5048(arg9[local338]);
					} else {
						local98.anIntArray319[local98.aShort66] = -1;
					}
					if (arg10 != null) {
						if (arg10[local338] == -1) {
							local98.anIntArray318[local98.aShort66] = -1;
						} else {
							local98.anIntArray318[local98.aShort66] = Static391.method5048(arg10[local338]);
						}
					}
					local98.aShortArray46[local98.aShort66] = (short) arg6[local338];
					local98.aShortArray51[local98.aShort66] = (short) arg7[local338];
					local98.aShortArray47[local98.aShort66] = (short) arg8[local338];
					if (local419) {
						if (arg11[local338] == -1 || this.aClass33_Sub1_4.anInterface9_12.method1558(arg11[local338]).aBoolean241) {
							local98.aShortArray44[local98.aShort66] = -1;
						} else {
							local98.aShortArray44[local98.aShort66] = (short) arg11[local338];
							local98.aShortArray52[local98.aShort66] = (short) arg12[local338];
						}
					}
					local98.aShort66++;
				}
			}
			this.aClass175ArrayArray1[arg0][arg1] = local98;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(668) Class263 local668 = new Class263();
			local67 = arg9[0];
			local73 = arg11[0];
			if (arg10 != null) {
				local668.anInt6745 = Static328.method4515(this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1], Static391.method5048(arg10[0]));
				if (local67 == -1) {
					local668.aByte92 = (byte) (local668.aByte92 | 0x2);
				}
			}
			if (super.anIntArrayArray55[arg0][arg1] == super.anIntArrayArray55[arg0 + 1][arg1] && super.anIntArrayArray55[arg0][arg1] == super.anIntArrayArray55[arg0 + 1][arg1 + 1] && super.anIntArrayArray55[arg0][arg1] == super.anIntArrayArray55[arg0][arg1 + 1]) {
				local668.aByte92 = (byte) (local668.aByte92 | 0x1);
			}
			@Pc(766) Class130 local766 = null;
			if (local73 != -1) {
				local766 = this.aClass33_Sub1_4.anInterface9_12.method1558(local73);
			}
			if (local766 == null || (local668.aByte92 & 0x2) != 0 || local766.aBoolean241) {
				@Pc(893) short local893 = Static391.method5048(local67);
				local668.aShort92 = (short) Static328.method4515(this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1], local893);
				local668.aShort91 = (short) Static328.method4515(this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1], local893);
				local668.aShort94 = (short) Static328.method4515(this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1], local893);
				local668.aShort95 = (short) Static328.method4515(this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1], local893);
				local668.aShort93 = -1;
			} else {
				local668.aShort92 = (short) (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				local668.aShort91 = (short) (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]);
				local668.aShort94 = (short) (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]);
				local668.aShort95 = (short) (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]);
				local668.aShort93 = (short) local73;
				if (this.method1650(local766.aByte39) || local766.aByte34 != 0 || local766.aByte36 != 0) {
					local668.aByte92 = (byte) (local668.aByte92 | 0x4);
				}
			}
			this.aClass263ArrayArray1[arg0][arg1] = local668;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7461(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!cq", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!cq", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		this.aByteArrayArray6 = null;
		this.aByteArrayArray7 = null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class92_Sub3 local3 = this.aClass33_Sub1_4.aClass92_Sub3_1;
		this.anInt1655 = -1;
		this.aFloat29 = local3.aFloat96;
		this.aFloat18 = local3.aFloat94;
		this.aFloat21 = local3.aFloat95;
		this.aFloat22 = local3.aFloat91;
		this.aFloat19 = local3.aFloat101;
		this.aFloat23 = local3.aFloat97;
		this.aFloat28 = local3.aFloat98;
		this.aFloat20 = local3.aFloat102;
		this.aFloat25 = local3.aFloat92;
		this.aFloat24 = local3.aFloat93;
		this.aFloat26 = local3.aFloat100;
		this.aFloat27 = local3.aFloat103;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt8638 && local78 >= 0 && local78 < super.anInt8630) {
						this.method1644(local72, local78, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(III)V")
	private void method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class101 local4 = this.aClass33_Sub1_4.method1217(Thread.currentThread());
		local4.aClass77_1.anInt2157 = 0;
		if (this.aClass190ArrayArray1 != null) {
			this.method1647(arg0, arg1, local4.aBoolean185, local4, local4.aClass77_1, local4.anIntArray192, local4.anIntArray191, local4.anIntArray177, local4.anIntArray172, arg2);
		} else if (this.aClass263ArrayArray1 != null) {
			this.method1649(arg0, arg1, local4.aClass77_1, local4.anIntArray192, local4.anIntArray191, local4.anIntArray177, local4.anIntArray172, arg2);
		} else if (this.aClass364ArrayArray1 != null) {
			this.method1648(arg0, arg1, local4.aBoolean185, local4, local4.aClass77_1, local4.anIntArray192, local4.anIntArray191, local4.anIntArray177, local4.anIntArray172, arg2);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
	@Override
	public void method7449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1644(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!cq", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class4_Sub5_Sub9 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub5_Sub9 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII[[ZLclient!eu;Lclient!du;[I[I)V")
	private void method1645(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class101 arg5, @OriginalArg(9) Class77 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean186;
		this.aClass33_Sub1_4.C(false);
		arg6.aBoolean144 = false;
		arg6.aBoolean143 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(81) int local81;
					@Pc(370) int local370;
					@Pc(375) int local375;
					@Pc(379) int local379;
					@Pc(383) int local383;
					@Pc(387) int local387;
					@Pc(391) int local391;
					@Pc(395) int local395;
					@Pc(399) int local399;
					@Pc(403) int local403;
					@Pc(407) int local407;
					@Pc(432) int local432;
					if (this.aClass190ArrayArray1 == null) {
						if (this.aClass364ArrayArray1[local32][local35] != null) {
							@Pc(573) Class364 local573 = this.aClass364ArrayArray1[local32][local35];
							for (local81 = 0; local81 < local573.aShort116; local81++) {
								arg7[local81] = local26 + local573.aShortArray152[local81] * 4 / super.anInt8631;
								arg8[local81] = local30 - local573.aShortArray150[local81] * 4 / super.anInt8631;
							}
							for (local370 = 0; local370 < local573.aShort117; local370++) {
								local375 = local370 * 3;
								local379 = local375 + 1;
								local383 = local379 + 1;
								local387 = arg7[local375];
								local391 = arg7[local379];
								local395 = arg7[local383];
								local399 = arg8[local375];
								local403 = arg8[local379];
								local407 = arg8[local383];
								if (local573.anIntArray654 == null || local573.anIntArray654[local370] == 0) {
									arg6.method2102((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local573.anIntArray655[local375], local573.anIntArray655[local379], local573.anIntArray655[local383]);
								} else {
									local432 = local573.anIntArray654[local370];
									arg6.method2102((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local432, local432, local432);
								}
							}
						}
					} else if (this.aClass190ArrayArray1[local32][local35] != null) {
						@Pc(63) Class190 local63 = this.aClass190ArrayArray1[local32][local35];
						if (local63.aShort78 != -1 && (local63.aByte75 & 0x2) == 0 && local63.anInt4778 == 0) {
							local81 = this.aClass33_Sub1_4.method1219(local63.aShort78);
							arg6.method2095((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static328.method4515(local63.anInt4777, local81), (float) Static328.method4515(local63.anInt4779, local81), (float) Static328.method4515(local63.anInt4776, local81));
							arg6.method2095((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static328.method4515(local63.anInt4775, local81), (float) Static328.method4515(local63.anInt4776, local81), (float) Static328.method4515(local63.anInt4779, local81));
						} else if (local63.anInt4778 == 0) {
							arg6.method2102((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, local63.anInt4777, local63.anInt4779, local63.anInt4776);
							arg6.method2102((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, local63.anInt4775, local63.anInt4776, local63.anInt4779);
						} else {
							local81 = local63.anInt4778;
							arg6.method2102((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, Static460.method6419(local63.anInt4777 & 0xFF000000, local81), Static460.method6419(local63.anInt4779 & 0xFF000000, local81), Static460.method6419(local63.anInt4776 & 0xFF000000, local81));
							arg6.method2102((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, Static460.method6419(local63.anInt4775 & 0xFF000000, local81), Static460.method6419(local63.anInt4776 & 0xFF000000, local81), Static460.method6419(local63.anInt4779 & 0xFF000000, local81));
						}
					} else if (this.aClass330ArrayArray1[local32][local35] != null) {
						@Pc(332) Class330 local332 = this.aClass330ArrayArray1[local32][local35];
						for (local81 = 0; local81 < local332.aShort110; local81++) {
							arg7[local81] = local26 + local332.aShortArray105[local81] * 4 / super.anInt8631;
							arg8[local81] = local30 - local332.aShortArray109[local81] * 4 / super.anInt8631;
						}
						for (local370 = 0; local370 < local332.aShort109; local370++) {
							local375 = local370 * 3;
							local379 = local375 + 1;
							local383 = local379 + 1;
							local387 = arg7[local375];
							local391 = arg7[local379];
							local395 = arg7[local383];
							local399 = arg8[local375];
							local403 = arg8[local379];
							local407 = arg8[local383];
							if (local332.anIntArray577 != null && local332.anIntArray577[local370] != 0 && (local332.aShortArray108 == null || local332.aShortArray108 != null && local332.aShortArray108[local370] == -1)) {
								local432 = local332.anIntArray577[local370];
								arg6.method2102((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, Static460.method6419(-(local332.anIntArray578[local375] & -16777216) - 16777216, local432), Static460.method6419(-(local332.anIntArray578[local379] & -16777216) - 16777216, local432), Static460.method6419(-(local332.anIntArray578[local383] & -16777216) - 16777216, local432));
							} else if (local332.aShortArray108 == null || local332.aShortArray108[local370] == -1) {
								arg6.method2102((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local332.anIntArray578[local375], local332.anIntArray578[local379], local332.anIntArray578[local383]);
							} else {
								local432 = this.aClass33_Sub1_4.method1219(local332.aShortArray108[local370]);
								arg6.method2095((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, (float) local432, (float) local432, (float) local432);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean144 = true;
		this.aClass33_Sub1_4.C(local14);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!kp;[I)V")
	@Override
	public void method7451(@OriginalArg(0) Class4_Sub29 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIIIIII[[ZLclient!eu;Lclient!du;[I[I)V")
	private void method1646(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class101 arg5, @OriginalArg(9) Class77 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean186;
		this.aClass33_Sub1_4.C(false);
		arg6.aBoolean144 = false;
		arg6.aBoolean143 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(79) int local79;
					if (this.aClass263ArrayArray1[local32][local35] != null) {
						@Pc(60) Class263 local60 = this.aClass263ArrayArray1[local32][local35];
						if (local60.aShort93 != -1 && (local60.aByte92 & 0x2) == 0 && local60.anInt6745 == -1) {
							local79 = this.aClass33_Sub1_4.method1219(local60.aShort93);
							arg6.method2095((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static328.method4515(local60.aShort94 & 0xFFFF, local79), (float) Static328.method4515(local60.aShort95 & 0xFFFF, local79), (float) Static328.method4515(local60.aShort91 & 0xFFFF, local79));
							arg6.method2095((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static328.method4515(local60.aShort92 & 0xFFFF, local79), (float) Static328.method4515(local60.aShort91 & 0xFFFF, local79), (float) Static328.method4515(local60.aShort95 & 0xFFFF, local79));
						} else if (local60.anInt6745 == -1) {
							arg6.method2095((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) (local60.aShort94 & 0xFFFF), (float) (local60.aShort95 & 0xFFFF), (float) (local60.aShort91 & 0xFFFF));
							arg6.method2095((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local60.aShort92 & 0xFFFF), (float) (local60.aShort91 & 0xFFFF), (float) (local60.aShort95 & 0xFFFF));
						} else {
							local79 = local60.anInt6745;
							arg6.method2095((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) local79, (float) local79, (float) local79);
							arg6.method2095((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) local79, (float) local79, (float) local79);
						}
					} else if (this.aClass175ArrayArray1[local32][local35] != null) {
						@Pc(331) Class175 local331 = this.aClass175ArrayArray1[local32][local35];
						for (local79 = 0; local79 < local331.aShort67; local79++) {
							arg7[local79] = local26 + local331.aShortArray48[local79] * 4 / super.anInt8631;
							arg8[local79] = local30 - local331.aShortArray45[local79] * 4 / super.anInt8631;
						}
						for (@Pc(369) int local369 = 0; local369 < local331.aShort66; local369++) {
							@Pc(375) short local375 = local331.aShortArray46[local369];
							@Pc(380) short local380 = local331.aShortArray51[local369];
							@Pc(385) short local385 = local331.aShortArray47[local369];
							@Pc(389) int local389 = arg7[local375];
							@Pc(393) int local393 = arg7[local380];
							@Pc(397) int local397 = arg7[local385];
							@Pc(401) int local401 = arg8[local375];
							@Pc(405) int local405 = arg8[local380];
							@Pc(409) int local409 = arg8[local385];
							@Pc(423) int local423;
							if (local331.anIntArray318 != null && local331.anIntArray318[local369] != -1) {
								local423 = local331.anIntArray318[local369];
								arg6.method2095((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static328.method4515(local331.aShortArray50[local375], local423), (float) Static328.method4515(local331.aShortArray50[local380], local423), (float) Static328.method4515(local331.aShortArray50[local385], local423));
							} else if (local331.aShortArray44 == null || local331.aShortArray44[local369] == -1) {
								local423 = local331.anIntArray319[local369];
								arg6.method2095((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static328.method4515(local331.aShortArray50[local375], local423), (float) Static328.method4515(local331.aShortArray50[local380], local423), (float) Static328.method4515(local331.aShortArray50[local385], local423));
							} else {
								local423 = this.aClass33_Sub1_4.method1219(local331.aShortArray44[local369]);
								arg6.method2095((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static328.method4515(local331.aShortArray50[local375], local423), (float) Static328.method4515(local331.aShortArray50[local380], local423), (float) Static328.method4515(local331.aShortArray50[local385], local423));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean144 = true;
		this.aClass33_Sub1_4.C(local14);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7454(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class101 local4 = this.aClass33_Sub1_4.method1217(Thread.currentThread());
		@Pc(7) Class77 local7 = local4.aClass77_1;
		local7.anInt2157 = 0;
		local7.aBoolean145 = true;
		this.aClass33_Sub1_4.ya();
		if (this.aClass190ArrayArray1 != null || this.aClass364ArrayArray1 != null) {
			this.method1645(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray192, local4.anIntArray191);
		} else if (this.aClass263ArrayArray1 != null) {
			this.method1646(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray192, local4.anIntArray191);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIZLclient!eu;Lclient!du;[I[I[I[II)V")
	private void method1647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class101 arg3, @OriginalArg(4) Class77 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class190 local6 = this.aClass190ArrayArray1[arg0][arg1];
		@Pc(41) int local41;
		@Pc(46) int local46;
		@Pc(51) int local51;
		@Pc(544) int local544;
		@Pc(394) int local394;
		@Pc(454) int local454;
		@Pc(514) int local514;
		@Pc(574) int local574;
		if (local6 == null) {
			@Pc(3030) Class330 local3030 = this.aClass330ArrayArray1[arg0][arg1];
			if (local3030 != null) {
				if (arg9 != 0) {
					if ((local3030.aByte119 & 0x4) == 0) {
						if ((arg9 & 0x2) != 0) {
							return;
						}
					} else if ((arg9 & 0x1) != 0) {
						return;
					}
				}
				@Pc(3196) float local3196;
				@Pc(3217) float local3217;
				@Pc(3102) float local3102;
				if (this.anInt1655 == -1) {
					for (local544 = 0; local544 < local3030.aShort110; local544++) {
						local41 = local3030.aShortArray105[local544] + (arg0 << super.anInt8635);
						local46 = local3030.aShortArray106[local544];
						local51 = local3030.aShortArray109[local544] + (arg1 << super.anInt8635);
						local3102 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local46 + this.aFloat26 * (float) local51;
						if (local3102 <= (float) this.aClass33_Sub1_4.anInt1164) {
							return;
						}
						arg8[local544] = 0;
						if (arg2) {
							local394 = (int) (local3102 - (float) arg3.anInt2572);
							if (local394 > 255) {
								local394 = 255;
							}
							if (local394 > 0) {
								arg8[local544] = local394;
								local454 = local3030.aShortArray110[local544] * local394 / 255;
								if (local454 > 0) {
									local46 -= local454;
								}
							}
						} else if (arg3.aBoolean184) {
							local394 = (int) (local3102 - (float) arg3.anInt2572);
							if (local394 > 0) {
								arg8[local544] = local394;
								if (arg8[local544] > 255) {
									arg8[local544] = 255;
								}
							}
						}
						local3196 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local46 + this.aFloat21 * (float) local51;
						local3217 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local46 + this.aFloat28 * (float) local51;
						arg5[local544] = arg4.anInt2161 + (int) (local3196 * (float) this.aClass33_Sub1_4.lb / local3102);
						arg6[local544] = arg4.anInt2158 + (int) (local3217 * (float) this.aClass33_Sub1_4.anInt1167 / local3102);
						arg7[local544] = (int) local3102;
					}
				} else {
					for (local544 = 0; local544 < local3030.aShort110; local544++) {
						local41 = local3030.aShortArray105[local544] + (arg0 << super.anInt8635);
						local46 = local3030.aShortArray106[local544];
						local51 = local3030.aShortArray109[local544] + (arg1 << super.anInt8635);
						local3102 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local46 + this.aFloat26 * (float) local51;
						arg8[local544] = 0;
						if (arg2) {
							local394 = this.anInt1655 - arg3.anInt2572;
							if (local394 > 255) {
								local394 = 255;
							}
							if (local394 > 0) {
								arg8[local544] = local394;
								local454 = local3030.aShortArray110[local544] * local394 / 255;
								if (local454 > 0) {
									local46 -= local454;
								}
							}
						} else if (arg3.aBoolean184) {
							local394 = this.anInt1655 - arg3.anInt2572;
							if (local394 > 0) {
								arg8[local544] = local394;
								if (arg8[local544] > 255) {
									arg8[local544] = 255;
								}
							}
						}
						local3196 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local46 + this.aFloat21 * (float) local51;
						local3217 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local46 + this.aFloat28 * (float) local51;
						arg5[local544] = arg4.anInt2161 + (int) (local3196 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
						arg6[local544] = arg4.anInt2158 + (int) (local3217 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
						arg7[local544] = (int) local3102;
					}
				}
				@Pc(3486) int local3486;
				@Pc(3490) int local3490;
				@Pc(3494) int local3494;
				@Pc(3498) int local3498;
				@Pc(3502) int local3502;
				@Pc(3514) int local3514;
				if (local3030.aShortArray108 != null) {
					@Pc(3558) short local3558;
					@Pc(3568) int local3568;
					if (this.anInt1655 == -1) {
						for (local544 = 0; local544 < local3030.aShort109; local544++) {
							local394 = local544 * 3;
							local454 = local394 + 1;
							local514 = local454 + 1;
							local574 = arg5[local394];
							local3486 = arg5[local454];
							local3490 = arg5[local514];
							local3494 = arg6[local394];
							local3498 = arg6[local454];
							local3502 = arg6[local514];
							local3514 = arg8[local394] + arg8[local454] + arg8[local514];
							if ((local574 - local3486) * (local3502 - local3498) - (local3494 - local3498) * (local3490 - local3486) > 0) {
								arg4.aBoolean145 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt2160 || local3486 > arg4.anInt2160 || local3490 > arg4.anInt2160;
								local3558 = local3030.aShortArray108[local544];
								if (local3514 >= 765) {
									arg4.method2101((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt2575);
								} else if (local3514 > 0) {
									if (local3558 != -1) {
										local3568 = -16777216;
										if (local3558 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local3558).aByte39)) {
											local3568 = -1694498816;
										}
										arg4.method2091((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray105[local394] / (float) super.anInt8631, (float) local3030.aShortArray105[local454] / (float) super.anInt8631, (float) local3030.aShortArray105[local514] / (float) super.anInt8631, (float) local3030.aShortArray109[local394] / (float) super.anInt8631, (float) local3030.aShortArray109[local454] / (float) super.anInt8631, (float) local3030.aShortArray109[local514] / (float) super.anInt8631, local3568 | local3030.anIntArray578[local394] & 0xFFFFFF, local3568 | local3030.anIntArray578[local454] & 0xFFFFFF, local3568 | local3030.anIntArray578[local514] & 0xFFFFFF, arg3.anInt2575, arg8[local394], arg8[local454], arg8[local514], local3558);
									} else if ((local3030.anIntArray578[local394] & 0xFFFFFF) != 0) {
										if (local3558 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local3558).aByte39)) {
											arg4.anInt2157 = -1694498816;
										}
										arg4.method2102((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static460.method6419(arg8[local394] << 24 | arg3.anInt2575, local3030.anIntArray578[local394]), Static460.method6419(arg8[local454] << 24 | arg3.anInt2575, local3030.anIntArray578[local454]), Static460.method6419(arg8[local514] << 24 | arg3.anInt2575, local3030.anIntArray578[local514]));
										arg4.anInt2157 = 0;
									}
								} else if (local3558 != -1) {
									local3568 = -16777216;
									if (local3558 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local3558).aByte39)) {
										local3568 = -1694498816;
									}
									arg4.method2091((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray105[local394] / (float) super.anInt8631, (float) local3030.aShortArray105[local454] / (float) super.anInt8631, (float) local3030.aShortArray105[local514] / (float) super.anInt8631, (float) local3030.aShortArray109[local394] / (float) super.anInt8631, (float) local3030.aShortArray109[local454] / (float) super.anInt8631, (float) local3030.aShortArray109[local514] / (float) super.anInt8631, local3568 | local3030.anIntArray578[local394] & 0xFFFFFF, local3568 | local3030.anIntArray578[local454] & 0xFFFFFF, local3568 | local3030.anIntArray578[local514] & 0xFFFFFF, 0, 0, 0, 0, local3558);
								} else if ((local3030.anIntArray578[local394] & 0xFFFFFF) != 0) {
									if (local3558 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local3558).aByte39)) {
										arg4.anInt2157 = -1694498816;
									}
									arg4.method2102((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray578[local394], local3030.anIntArray578[local454], local3030.anIntArray578[local514]);
									arg4.anInt2157 = 0;
								}
							}
						}
						return;
					}
					for (local544 = 0; local544 < local3030.aShort109; local544++) {
						local394 = local544 * 3;
						local454 = local394 + 1;
						local514 = local454 + 1;
						local574 = arg5[local394];
						local3486 = arg5[local454];
						local3490 = arg5[local514];
						local3494 = arg6[local394];
						local3498 = arg6[local454];
						local3502 = arg6[local514];
						local3514 = arg8[local394] + arg8[local454] + arg8[local514];
						if ((local574 - local3486) * (local3502 - local3498) - (local3494 - local3498) * (local3490 - local3486) > 0) {
							arg4.aBoolean145 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt2160 || local3486 > arg4.anInt2160 || local3490 > arg4.anInt2160;
							local3558 = local3030.aShortArray108[local544];
							if (local3514 < 765) {
								if (local3558 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local3558).aByte39)) {
									arg4.anInt2157 = -1694498816;
								}
								if (local3514 > 0) {
									if (local3558 != -1) {
										local3568 = -16777216;
										if (local3558 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local3558).aByte39)) {
											local3568 = -1694498816;
										}
										arg4.method2091((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray105[local394] / (float) super.anInt8631, (float) local3030.aShortArray105[local454] / (float) super.anInt8631, (float) local3030.aShortArray105[local514] / (float) super.anInt8631, (float) local3030.aShortArray109[local394] / (float) super.anInt8631, (float) local3030.aShortArray109[local454] / (float) super.anInt8631, (float) local3030.aShortArray109[local514] / (float) super.anInt8631, local3568 | local3030.anIntArray578[local394] & 0xFFFFFF, local3568 | local3030.anIntArray578[local454] & 0xFFFFFF, local3568 | local3030.anIntArray578[local514] & 0xFFFFFF, arg3.anInt2575, arg8[local394], arg8[local454], arg8[local514], local3558);
									} else if ((local3030.anIntArray578[local394] & 0xFFFFFF) != 0) {
										if (local3558 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local3558).aByte39)) {
											arg4.anInt2157 = -1694498816;
										}
										arg4.method2102((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static460.method6419(arg8[local394] << 24 | arg3.anInt2575, local3030.anIntArray578[local394]), Static460.method6419(arg8[local454] << 24 | arg3.anInt2575, local3030.anIntArray578[local454]), Static460.method6419(arg8[local514] << 24 | arg3.anInt2575, local3030.anIntArray578[local514]));
										arg4.anInt2157 = 0;
									}
								} else if (local3558 != -1) {
									local3568 = -16777216;
									if (local3558 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local3558).aByte39)) {
										local3568 = -1694498816;
									}
									arg4.method2091((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray105[local394] / (float) super.anInt8631, (float) local3030.aShortArray105[local454] / (float) super.anInt8631, (float) local3030.aShortArray105[local514] / (float) super.anInt8631, (float) local3030.aShortArray109[local394] / (float) super.anInt8631, (float) local3030.aShortArray109[local454] / (float) super.anInt8631, (float) local3030.aShortArray109[local514] / (float) super.anInt8631, local3568 | local3030.anIntArray578[local394] & 0xFFFFFF, local3568 | local3030.anIntArray578[local454] & 0xFFFFFF, local3568 | local3030.anIntArray578[local514] & 0xFFFFFF, 0, 0, 0, 0, local3558);
								} else if ((local3030.anIntArray578[local394] & 0xFFFFFF) != 0) {
									if (local3558 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local3558).aByte39)) {
										arg4.anInt2157 = -1694498816;
									}
									arg4.method2102((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray578[local394], local3030.anIntArray578[local454], local3030.anIntArray578[local514]);
									arg4.anInt2157 = 0;
								}
								arg4.anInt2157 = 0;
							} else {
								arg4.method2101((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt2575);
							}
						}
					}
					return;
				}
				for (local544 = 0; local544 < local3030.aShort109; local544++) {
					local394 = local544 * 3;
					local454 = local394 + 1;
					local514 = local454 + 1;
					local574 = arg5[local394];
					local3486 = arg5[local454];
					local3490 = arg5[local514];
					local3494 = arg6[local394];
					local3498 = arg6[local454];
					local3502 = arg6[local514];
					local3514 = arg8[local394] + arg8[local454] + arg8[local514];
					if ((local574 - local3486) * (local3502 - local3498) - (local3494 - local3498) * (local3490 - local3486) > 0) {
						arg4.aBoolean145 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt2160 || local3486 > arg4.anInt2160 || local3490 > arg4.anInt2160;
						if (local3514 >= 765) {
							arg4.method2101((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt2575);
						} else if (local3514 > 0) {
							if ((local3030.anIntArray578[local394] & 0xFFFFFF) != 0) {
								arg4.method2102((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static6.method116(arg8[local394], arg3.anInt2575, local3030.anIntArray578[local394]), Static6.method116(arg8[local454], arg3.anInt2575, local3030.anIntArray578[local454]), Static6.method116(arg8[local514], arg3.anInt2575, local3030.anIntArray578[local514]));
							}
						} else if ((local3030.anIntArray578[local394] & 0xFFFFFF) != 0) {
							arg4.method2102((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray578[local394], local3030.anIntArray578[local454], local3030.anIntArray578[local514]);
						}
					}
				}
			}
		} else if ((local6.aByte75 & 0x2) == 0) {
			if (arg9 != 0) {
				if ((local6.aByte75 & 0x4) == 0) {
					if ((arg9 & 0x2) != 0) {
						return;
					}
				} else if ((arg9 & 0x1) != 0) {
					return;
				}
			}
			@Pc(36) int local36 = arg0 * super.anInt8631;
			local41 = local36 + super.anInt8631;
			local46 = arg1 * super.anInt8631;
			local51 = local46 + super.anInt8631;
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			@Pc(100) float local100;
			@Pc(125) float local125;
			@Pc(150) float local150;
			@Pc(175) float local175;
			@Pc(261) int local261;
			@Pc(73) int local73;
			@Pc(848) int local848;
			@Pc(859) int local859;
			@Pc(364) int local364;
			@Pc(424) int local424;
			@Pc(484) int local484;
			@Pc(351) float local351;
			@Pc(411) float local411;
			@Pc(471) float local471;
			@Pc(531) float local531;
			@Pc(381) float local381;
			@Pc(441) float local441;
			@Pc(501) float local501;
			@Pc(561) float local561;
			if ((local6.aByte75 & 0x1) == 0 || arg2) {
				local73 = super.anIntArrayArray55[arg0][arg1];
				local848 = super.anIntArrayArray55[arg0 + 1][arg1];
				local859 = super.anIntArrayArray55[arg0 + 1][arg1 + 1];
				@Pc(868) int local868 = super.anIntArrayArray55[arg0][arg1 + 1];
				if (this.anInt1655 == -1) {
					local100 = this.aFloat27 + this.aFloat25 * (float) local36 + this.aFloat24 * (float) local73 + this.aFloat26 * (float) local46;
					if (local100 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local125 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local848 + this.aFloat26 * (float) local46;
					if (local125 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local150 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local859 + this.aFloat26 * (float) local51;
					if (local150 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local175 = this.aFloat27 + this.aFloat25 * (float) local36 + this.aFloat24 * (float) local868 + this.aFloat26 * (float) local51;
					if (local175 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
				} else {
					local100 = this.aFloat27 + this.aFloat25 * (float) local36 + this.aFloat24 * (float) local73 + this.aFloat26 * (float) local46;
					local125 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local848 + this.aFloat26 * (float) local46;
					local150 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local859 + this.aFloat26 * (float) local51;
					local175 = this.aFloat27 + this.aFloat25 * (float) local36 + this.aFloat24 * (float) local868 + this.aFloat26 * (float) local51;
				}
				if (arg2) {
					local261 = (int) (local100 - (float) arg3.anInt2572);
					if (local261 > 255) {
						local261 = 255;
					}
					@Pc(1097) int local1097;
					if (local261 > 0) {
						local53 = local261;
						local1097 = local6.aShort75 * local261 / 255;
						if (local1097 > 0) {
							local73 -= local1097;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt2572);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local55 = local261;
						local1097 = local6.aShort79 * local261 / 255;
						if (local1097 > 0) {
							local848 -= local1097;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt2572);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local57 = local261;
						local1097 = local6.aShort77 * local261 / 255;
						if (local1097 > 0) {
							local859 -= local1097;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt2572);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local59 = local261;
						local1097 = local6.aShort76 * local261 / 255;
						if (local1097 > 0) {
							local868 -= local1097;
						}
					}
				} else if (arg3.aBoolean184) {
					local261 = (int) (local100 - (float) arg3.anInt2572);
					if (local261 > 0) {
						local53 = local261;
						if (local261 > 255) {
							local53 = 255;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt2572);
					if (local261 > 0) {
						local55 = local261;
						if (local261 > 255) {
							local55 = 255;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt2572);
					if (local261 > 0) {
						local57 = local261;
						if (local261 > 255) {
							local57 = 255;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt2572);
					if (local261 > 0) {
						local59 = local261;
						if (local261 > 255) {
							local59 = 255;
						}
					}
				}
				if (this.anInt1655 == -1) {
					local351 = this.aFloat22 + this.aFloat29 * (float) local36 + this.aFloat18 * (float) local73 + this.aFloat21 * (float) local46;
					local364 = arg4.anInt2161 + (int) (local351 * (float) this.aClass33_Sub1_4.lb / local100);
					local381 = this.aFloat20 + this.aFloat19 * (float) local36 + this.aFloat23 * (float) local73 + this.aFloat28 * (float) local46;
					local394 = arg4.anInt2158 + (int) (local381 * (float) this.aClass33_Sub1_4.anInt1167 / local100);
					local411 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local848 + this.aFloat21 * (float) local46;
					local424 = arg4.anInt2161 + (int) (local411 * (float) this.aClass33_Sub1_4.lb / local125);
					local441 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local848 + this.aFloat28 * (float) local46;
					local454 = arg4.anInt2158 + (int) (local441 * (float) this.aClass33_Sub1_4.anInt1167 / local125);
					local471 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local859 + this.aFloat21 * (float) local51;
					local484 = arg4.anInt2161 + (int) (local471 * (float) this.aClass33_Sub1_4.lb / local150);
					local501 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local859 + this.aFloat28 * (float) local51;
					local514 = arg4.anInt2158 + (int) (local501 * (float) this.aClass33_Sub1_4.anInt1167 / local150);
					local531 = this.aFloat22 + this.aFloat29 * (float) local36 + this.aFloat18 * (float) local868 + this.aFloat21 * (float) local51;
					local544 = arg4.anInt2161 + (int) (local531 * (float) this.aClass33_Sub1_4.lb / local175);
					local561 = this.aFloat20 + this.aFloat19 * (float) local36 + this.aFloat23 * (float) local868 + this.aFloat28 * (float) local51;
					local574 = arg4.anInt2158 + (int) (local561 * (float) this.aClass33_Sub1_4.anInt1167 / local175);
				} else {
					local351 = this.aFloat22 + this.aFloat29 * (float) local36 + this.aFloat18 * (float) local73 + this.aFloat21 * (float) local46;
					local364 = arg4.anInt2161 + (int) (local351 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local381 = this.aFloat20 + this.aFloat19 * (float) local36 + this.aFloat23 * (float) local73 + this.aFloat28 * (float) local46;
					local394 = arg4.anInt2158 + (int) (local381 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local411 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local848 + this.aFloat21 * (float) local46;
					local424 = arg4.anInt2161 + (int) (local411 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local441 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local848 + this.aFloat28 * (float) local46;
					local454 = arg4.anInt2158 + (int) (local441 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local471 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local859 + this.aFloat21 * (float) local51;
					local484 = arg4.anInt2161 + (int) (local471 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local501 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local859 + this.aFloat28 * (float) local51;
					local514 = arg4.anInt2158 + (int) (local501 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local531 = this.aFloat22 + this.aFloat29 * (float) local36 + this.aFloat18 * (float) local868 + this.aFloat21 * (float) local51;
					local544 = arg4.anInt2161 + (int) (local531 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local561 = this.aFloat20 + this.aFloat19 * (float) local36 + this.aFloat23 * (float) local868 + this.aFloat28 * (float) local51;
					local574 = arg4.anInt2158 + (int) (local561 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
				}
			} else {
				local73 = super.anIntArrayArray55[arg0][arg1];
				@Pc(79) float local79 = this.aFloat24 * (float) local73;
				if (this.anInt1655 == -1) {
					local100 = this.aFloat27 + this.aFloat25 * (float) local36 + local79 + this.aFloat26 * (float) local46;
					if (local100 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local125 = this.aFloat27 + this.aFloat25 * (float) local41 + local79 + this.aFloat26 * (float) local46;
					if (local125 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local150 = this.aFloat27 + this.aFloat25 * (float) local41 + local79 + this.aFloat26 * (float) local51;
					if (local150 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local175 = this.aFloat27 + this.aFloat25 * (float) local36 + local79 + this.aFloat26 * (float) local51;
					if (local175 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
				} else {
					local100 = this.aFloat27 + this.aFloat25 * (float) local36 + local79 + this.aFloat26 * (float) local46;
					local125 = this.aFloat27 + this.aFloat25 * (float) local41 + local79 + this.aFloat26 * (float) local46;
					local150 = this.aFloat27 + this.aFloat25 * (float) local41 + local79 + this.aFloat26 * (float) local51;
					local175 = this.aFloat27 + this.aFloat25 * (float) local36 + local79 + this.aFloat26 * (float) local51;
				}
				if (arg3.aBoolean184) {
					local261 = (int) (local100 - (float) arg3.anInt2572);
					if (local261 > 0) {
						local53 = local261;
						if (local261 > 255) {
							local53 = 255;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt2572);
					if (local261 > 0) {
						local55 = local261;
						if (local261 > 255) {
							local55 = 255;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt2572);
					if (local261 > 0) {
						local57 = local261;
						if (local261 > 255) {
							local57 = 255;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt2572);
					if (local261 > 0) {
						local59 = local261;
						if (local261 > 255) {
							local59 = 255;
						}
					}
				}
				@Pc(324) float local324 = this.aFloat18 * (float) local73;
				@Pc(330) float local330 = this.aFloat23 * (float) local73;
				if (this.anInt1655 == -1) {
					local351 = this.aFloat22 + this.aFloat29 * (float) local36 + local324 + this.aFloat21 * (float) local46;
					local364 = arg4.anInt2161 + (int) (local351 * (float) this.aClass33_Sub1_4.lb / local100);
					local381 = this.aFloat20 + this.aFloat19 * (float) local36 + local330 + this.aFloat28 * (float) local46;
					local394 = arg4.anInt2158 + (int) (local381 * (float) this.aClass33_Sub1_4.anInt1167 / local100);
					local411 = this.aFloat22 + this.aFloat29 * (float) local41 + local324 + this.aFloat21 * (float) local46;
					local424 = arg4.anInt2161 + (int) (local411 * (float) this.aClass33_Sub1_4.lb / local125);
					local441 = this.aFloat20 + this.aFloat19 * (float) local41 + local330 + this.aFloat28 * (float) local46;
					local454 = arg4.anInt2158 + (int) (local441 * (float) this.aClass33_Sub1_4.anInt1167 / local125);
					local471 = this.aFloat22 + this.aFloat29 * (float) local41 + local324 + this.aFloat21 * (float) local51;
					local484 = arg4.anInt2161 + (int) (local471 * (float) this.aClass33_Sub1_4.lb / local150);
					local501 = this.aFloat20 + this.aFloat19 * (float) local41 + local330 + this.aFloat28 * (float) local51;
					local514 = arg4.anInt2158 + (int) (local501 * (float) this.aClass33_Sub1_4.anInt1167 / local150);
					local531 = this.aFloat22 + this.aFloat29 * (float) local36 + local324 + this.aFloat21 * (float) local51;
					local544 = arg4.anInt2161 + (int) (local531 * (float) this.aClass33_Sub1_4.lb / local175);
					local561 = this.aFloat20 + this.aFloat19 * (float) local36 + local330 + this.aFloat28 * (float) local51;
					local574 = arg4.anInt2158 + (int) (local561 * (float) this.aClass33_Sub1_4.anInt1167 / local175);
				} else {
					local351 = this.aFloat22 + this.aFloat29 * (float) local36 + local324 + this.aFloat21 * (float) local46;
					local364 = arg4.anInt2161 + (int) (local351 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local381 = this.aFloat20 + this.aFloat19 * (float) local36 + local330 + this.aFloat28 * (float) local46;
					local394 = arg4.anInt2158 + (int) (local381 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local411 = this.aFloat22 + this.aFloat29 * (float) local41 + local324 + this.aFloat21 * (float) local46;
					local424 = arg4.anInt2161 + (int) (local411 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local441 = this.aFloat20 + this.aFloat19 * (float) local41 + local330 + this.aFloat28 * (float) local46;
					local454 = arg4.anInt2158 + (int) (local441 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local471 = this.aFloat22 + this.aFloat29 * (float) local41 + local324 + this.aFloat21 * (float) local51;
					local484 = arg4.anInt2161 + (int) (local471 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local501 = this.aFloat20 + this.aFloat19 * (float) local41 + local330 + this.aFloat28 * (float) local51;
					local514 = arg4.anInt2158 + (int) (local501 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local531 = this.aFloat22 + this.aFloat29 * (float) local36 + local324 + this.aFloat21 * (float) local51;
					local544 = arg4.anInt2161 + (int) (local531 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local561 = this.aFloat20 + this.aFloat19 * (float) local36 + local330 + this.aFloat28 * (float) local51;
					local574 = arg4.anInt2158 + (int) (local561 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
				}
			}
			@Pc(1842) boolean local1842 = local6.aShort78 != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(local6.aShort78).aByte39);
			if (this.anInt1655 == -1) {
				local848 = local55 + local57 + local59;
				if ((local484 - local544) * (local454 - local574) - (local514 - local574) * (local424 - local544) > 0) {
					arg4.aBoolean145 = local484 < 0 || local544 < 0 || local424 < 0 || local484 > arg4.anInt2160 || local544 > arg4.anInt2160 || local424 > arg4.anInt2160;
					if (local848 >= 765) {
						arg4.method2101((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, arg3.anInt2575);
					} else if (local848 > 0) {
						if (local6.aShort78 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method2091((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt4777 & 0xFFFFFF, local859 | local6.anInt4779 & 0xFFFFFF, local859 | local6.anInt4776 & 0xFFFFFF, arg3.anInt2575, local57, local59, local55, local6.aShort78);
						} else {
							if (local1842) {
								arg4.anInt2157 = 100;
							}
							arg4.method2102((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, Static460.method6419(local57 << 24 | arg3.anInt2575, local6.anInt4777), Static460.method6419(local59 << 24 | arg3.anInt2575, local6.anInt4779), Static460.method6419(local55 << 24 | arg3.anInt2575, local6.anInt4776));
							arg4.anInt2157 = 0;
						}
					} else if (local6.aShort78 >= 0) {
						local859 = -16777216;
						if (local1842) {
							local859 = -1694498816;
						}
						arg4.method2091((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt4777 & 0xFFFFFF, local859 | local6.anInt4779 & 0xFFFFFF, local859 | local6.anInt4776 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort78);
					} else {
						if (local1842) {
							arg4.anInt2157 = 100;
						}
						arg4.method2102((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, local6.anInt4777, local6.anInt4779, local6.anInt4776);
						arg4.anInt2157 = 0;
					}
				}
				local848 = local53 + local55 + local59;
				if ((local364 - local424) * (local574 - local454) - (local394 - local454) * (local544 - local424) > 0) {
					arg4.aBoolean145 = local364 < 0 || local424 < 0 || local544 < 0 || local364 > arg4.anInt2160 || local424 > arg4.anInt2160 || local544 > arg4.anInt2160;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt2157 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort78 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method2091((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt4775 & 0xFFFFFF, local859 | local6.anInt4776 & 0xFFFFFF, local859 | local6.anInt4779 & 0xFFFFFF, arg3.anInt2575, local53, local55, local59, local6.aShort78);
								return;
							}
							if (local1842) {
								arg4.anInt2157 = 100;
							}
							arg4.method2102((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, Static460.method6419(local53 << 24 | arg3.anInt2575, local6.anInt4775), Static460.method6419(local55 << 24 | arg3.anInt2575, local6.anInt4776), Static460.method6419(local59 << 24 | arg3.anInt2575, local6.anInt4779));
							arg4.anInt2157 = 0;
							return;
						}
						if (local6.aShort78 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method2091((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt4775 & 0xFFFFFF, local859 | local6.anInt4776 & 0xFFFFFF, local859 | local6.anInt4779 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort78);
							return;
						}
						if (local1842) {
							arg4.anInt2157 = 100;
						}
						arg4.method2102((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, local6.anInt4775, local6.anInt4776, local6.anInt4779);
						arg4.anInt2157 = 0;
						return;
					}
					arg4.method2101((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, arg3.anInt2575);
					return;
				}
			} else {
				local848 = local55 + local57 + local59;
				if ((local484 - local544) * (local454 - local574) - (local514 - local574) * (local424 - local544) > 0) {
					arg4.aBoolean145 = local484 < 0 || local544 < 0 || local424 < 0 || local484 > arg4.anInt2160 || local544 > arg4.anInt2160 || local424 > arg4.anInt2160;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt2157 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort78 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method2091((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt4777 & 0xFFFFFF, local859 | local6.anInt4779 & 0xFFFFFF, local859 | local6.anInt4776 & 0xFFFFFF, arg3.anInt2575, local57, local59, local55, local6.aShort78);
							} else {
								if (local1842) {
									arg4.anInt2157 = 100;
								}
								arg4.method2102((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, Static460.method6419(local57 << 24 | arg3.anInt2575, local6.anInt4777), Static460.method6419(local59 << 24 | arg3.anInt2575, local6.anInt4779), Static460.method6419(local55 << 24 | arg3.anInt2575, local6.anInt4776));
								arg4.anInt2157 = 0;
							}
						} else if (local6.aShort78 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method2091((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt4777 & 0xFFFFFF, local859 | local6.anInt4779 & 0xFFFFFF, local859 | local6.anInt4776 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort78);
						} else {
							if (local1842) {
								arg4.anInt2157 = 100;
							}
							arg4.method2102((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, local6.anInt4777, local6.anInt4779, local6.anInt4776);
							arg4.anInt2157 = 0;
						}
					} else {
						arg4.method2101((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, arg3.anInt2575);
					}
				}
				local848 = local53 + local55 + local59;
				if ((local364 - local424) * (local574 - local454) - (local394 - local454) * (local544 - local424) > 0) {
					arg4.aBoolean145 = local364 < 0 || local424 < 0 || local544 < 0 || local364 > arg4.anInt2160 || local424 > arg4.anInt2160 || local544 > arg4.anInt2160;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt2157 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort78 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method2091((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt4775 & 0xFFFFFF, local859 | local6.anInt4776 & 0xFFFFFF, local859 | local6.anInt4779 & 0xFFFFFF, arg3.anInt2575, local53, local55, local59, local6.aShort78);
								return;
							}
							if (local1842) {
								arg4.anInt2157 = 100;
							}
							arg4.method2102((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, Static460.method6419(local53 << 24 | arg3.anInt2575, local6.anInt4775), Static460.method6419(local55 << 24 | arg3.anInt2575, local6.anInt4776), Static460.method6419(local59 << 24 | arg3.anInt2575, local6.anInt4779));
							arg4.anInt2157 = 0;
							return;
						}
						if (local6.aShort78 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method2091((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt4775 & 0xFFFFFF, local859 | local6.anInt4776 & 0xFFFFFF, local859 | local6.anInt4779 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort78);
							return;
						}
						if (local1842) {
							arg4.anInt2157 = 100;
						}
						arg4.method2102((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, local6.anInt4775, local6.anInt4776, local6.anInt4779);
						arg4.anInt2157 = 0;
						return;
					}
					arg4.method2101((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, arg3.anInt2575);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(8) boolean local8 = (this.anInt1656 & 0x20) == 0;
		if (this.aClass190ArrayArray1 == null && !local8) {
			this.aClass190ArrayArray1 = new Class190[super.anInt8638][super.anInt8630];
			this.aClass330ArrayArray1 = new Class330[super.anInt8638][super.anInt8630];
		} else if (this.aClass364ArrayArray1 == null && local8) {
			this.aClass364ArrayArray1 = new Class364[super.anInt8638][super.anInt8630];
		} else if (this.aClass263ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < arg6.length; local56++) {
			if (arg6[local56] == -1) {
				arg6[local56] = 0;
			} else {
				arg6[local56] = Static84.anIntArray114[Static391.method5048(arg6[local56]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(92) int local92 = 0; local92 < arg7.length; local92++) {
				if (arg7[local92] == -1) {
					arg7[local92] = 0;
				} else {
					arg7[local92] = Static84.anIntArray114[Static391.method5048(arg7[local92]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(186) int local186;
		@Pc(191) int local191;
		@Pc(195) int local195;
		@Pc(215) int local215;
		@Pc(336) int local336;
		@Pc(383) int local383;
		@Pc(467) int local467;
		@Pc(499) int local499;
		if (local8) {
			@Pc(130) Class364 local130 = new Class364();
			local130.aShort116 = (short) arg2.length;
			local130.aShort117 = (short) (arg2.length / 3);
			local130.aShortArray152 = new short[local130.aShort116];
			local130.aShortArray148 = new short[local130.aShort116];
			local130.aShortArray150 = new short[local130.aShort116];
			local130.anIntArray655 = new int[local130.aShort116];
			local130.aShortArray151 = new short[local130.aShort116];
			local130.aShortArray149 = new short[local130.aShort116];
			local130.aByteArray97 = new byte[local130.aShort116];
			if (arg5 != null) {
				local130.aShortArray153 = new short[local130.aShort116];
			}
			for (local186 = 0; local186 < local130.aShort116; local186++) {
				local191 = arg2[local186];
				local195 = arg4[local186];
				if (local191 == 0 && local195 == 0) {
					local215 = this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1];
				} else if (local191 == 0 && local195 == super.anInt8631) {
					local215 = this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1];
				} else if (local191 == super.anInt8631 && local195 == super.anInt8631) {
					local215 = this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1];
				} else if (local191 == super.anInt8631 && local195 == 0) {
					local215 = this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1];
				} else {
					local336 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) * (super.anInt8631 - local191) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) * local191;
					local383 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) * (super.anInt8631 - local191) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) * local191;
					local215 = local336 * (super.anInt8631 - local195) + local383 * local195 >> super.anInt8635 * 2;
				}
				local336 = (arg0 << super.anInt8635) + local191;
				local383 = (arg1 << super.anInt8635) + local195;
				local130.aShortArray152[local186] = (short) local191;
				local130.aShortArray150[local186] = (short) local195;
				local130.aShortArray148[local186] = (short) (this.method7453(local336, local383) + (arg3 == null ? 0 : arg3[local186]));
				if (local215 < 0) {
					local215 = 0;
				}
				if (arg6[local186] == 0) {
					local130.anIntArray655[local186] = 0;
					if (arg7 != null) {
						local130.aByteArray97[local186] = (byte) local215;
					}
				} else {
					local467 = 0;
					if (arg5 != null) {
						@Pc(479) short local479 = local130.aShortArray153[local186] = (short) arg5[local186];
						if (arg11 != 0) {
							local467 = local479 * 255 / arg11;
							if (local467 < 0) {
								local467 = 0;
							} else if (local467 > 255) {
								local467 = 255;
							}
						}
					}
					local499 = -16777216;
					if (arg8[local186] != -1 && this.method1650(this.aClass33_Sub1_4.anInterface9_12.method1558(arg8[local186]).aByte39)) {
						local499 = -1694498816;
					}
					local130.anIntArray655[local186] = local499 | Static6.method116(local467, arg10, Static681.method1643(arg6[local186] >> 8, local215));
					if (arg7 != null) {
						local130.aByteArray97[local186] = (byte) local215;
					}
				}
				local130.aShortArray151[local186] = (short) arg8[local186];
				local130.aShortArray149[local186] = (short) arg9[local186];
			}
			if (arg7 != null) {
				local130.anIntArray654 = new int[local130.aShort117];
			}
			for (local191 = 0; local191 < local130.aShort117; local191++) {
				local195 = local191 * 3;
				if (arg7 != null && arg7[local195] != 0) {
					local130.anIntArray654[local191] = arg7[local195] >> 8 | 0xFF000000;
				}
			}
			this.aClass364ArrayArray1[arg0][arg1] = local130;
			return;
		}
		@Pc(610) boolean local610 = true;
		local186 = -1;
		local191 = -1;
		local195 = -1;
		local215 = -1;
		if (arg2.length == 6) {
			for (local336 = 0; local336 < 6; local336++) {
				if (arg2[local336] == 0 && arg4[local336] == 0) {
					if (local186 != -1 && arg6[local186] != arg6[local336]) {
						local610 = false;
						break;
					}
					local186 = local336;
				} else if (arg2[local336] == super.anInt8631 && arg4[local336] == 0) {
					if (local191 != -1 && arg6[local191] != arg6[local336]) {
						local610 = false;
						break;
					}
					local191 = local336;
				} else if (arg2[local336] == super.anInt8631 && arg4[local336] == super.anInt8631) {
					if (local195 != -1 && arg6[local195] != arg6[local336]) {
						local610 = false;
						break;
					}
					local195 = local336;
				} else if (arg2[local336] == 0 && arg4[local336] == super.anInt8631) {
					if (local215 != -1 && arg6[local215] != arg6[local336]) {
						local610 = false;
						break;
					}
					local215 = local336;
				}
			}
			if (local186 == -1 || local191 == -1 || local195 == -1 || local215 == -1) {
				local610 = false;
			}
			if (local610) {
				if (arg3 != null) {
					for (local383 = 0; local383 < 4; local383++) {
						if (arg3[local383] != 0) {
							local610 = false;
							break;
						}
					}
				}
				if (local610) {
					for (local383 = 1; local383 < 4; local383++) {
						if (arg2[local383] != arg2[0] && arg2[local383] != arg2[0] + super.anInt8631 && arg2[local383] != arg2[0] - super.anInt8631) {
							local610 = false;
							break;
						}
						if (arg4[local383] != arg4[0] && arg4[local383] != arg4[0] + super.anInt8631 && arg4[local383] != arg4[0] - super.anInt8631) {
							local610 = false;
							break;
						}
					}
				}
			}
		} else {
			local610 = false;
		}
		if (!local610) {
			@Pc(1623) Class330 local1623 = new Class330();
			local1623.aShort110 = (short) arg2.length;
			local1623.aShort109 = (short) (arg2.length / 3);
			local1623.aShortArray105 = new short[local1623.aShort110];
			local1623.aShortArray106 = new short[local1623.aShort110];
			local1623.aShortArray109 = new short[local1623.aShort110];
			local1623.anIntArray578 = new int[local1623.aShort110];
			if (arg5 != null) {
				local1623.aShortArray110 = new short[local1623.aShort110];
			}
			@Pc(1693) int local1693;
			@Pc(1814) int local1814;
			@Pc(1861) int local1861;
			@Pc(1947) int local1947;
			for (local383 = 0; local383 < local1623.aShort110; local383++) {
				local467 = arg2[local383];
				local499 = arg4[local383];
				if (local467 == 0 && local499 == 0) {
					local1693 = this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1];
				} else if (local467 == 0 && local499 == super.anInt8631) {
					local1693 = this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1];
				} else if (local467 == super.anInt8631 && local499 == super.anInt8631) {
					local1693 = this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1];
				} else if (local467 == super.anInt8631 && local499 == 0) {
					local1693 = this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1];
				} else {
					local1814 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) * (super.anInt8631 - local467) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) * local467;
					local1861 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) * (super.anInt8631 - local467) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) * local467;
					local1693 = local1814 * (super.anInt8631 - local499) + local1861 * local499 >> super.anInt8635 * 2;
				}
				local1814 = (arg0 << super.anInt8635) + local467;
				local1861 = (arg1 << super.anInt8635) + local499;
				local1623.aShortArray105[local383] = (short) local467;
				local1623.aShortArray109[local383] = (short) local499;
				local1623.aShortArray106[local383] = (short) (this.method7453(local1814, local1861) + (arg3 == null ? 0 : arg3[local383]));
				if (local1693 < 0) {
					local1693 = 0;
				}
				if (arg6[local383] != 0) {
					local1947 = 0;
					if (arg5 != null) {
						@Pc(1959) short local1959 = local1623.aShortArray110[local383] = (short) arg5[local383];
						if (arg11 != 0) {
							local1947 = local1959 * 255 / arg11;
							if (local1947 < 0) {
								local1947 = 0;
							} else if (local1947 > 255) {
								local1947 = 255;
							}
						}
					}
					local1623.anIntArray578[local383] = Static6.method116(local1947, arg10, Static681.method1643(arg6[local383] >> 8, local1693));
					if (arg7 != null) {
						local1623.anIntArray578[local383] |= local1693 << 25;
					}
				} else if (arg7 == null) {
					local1623.anIntArray578[local383] = 0;
				} else {
					local1623.anIntArray578[local383] = local1693 << 25;
				}
			}
			@Pc(2011) boolean local2011 = false;
			for (local499 = 0; local499 < local1623.aShort109; local499++) {
				if (arg8[local499 * 3] != -1 && !this.aClass33_Sub1_4.anInterface9_12.method1558(arg8[local499 * 3]).aBoolean241) {
					local2011 = true;
				}
			}
			if (arg7 != null) {
				local1623.anIntArray577 = new int[local1623.aShort109];
			}
			if (local2011) {
				local1623.aShortArray108 = new short[local1623.aShort109];
				local1623.aShortArray107 = new short[local1623.aShort109];
			}
			for (local1693 = 0; local1693 < local1623.aShort109; local1693++) {
				local1814 = local1693 * 3;
				if (arg7 != null && arg7[local1814] != 0) {
					local1623.anIntArray577[local1693] = arg7[local1814] >> 8;
				}
				if (local2011) {
					local1861 = local1814 + 1;
					local1947 = local1861 + 1;
					@Pc(2093) boolean local2093 = false;
					@Pc(2095) boolean local2095 = true;
					@Pc(2099) int local2099 = arg8[local1814];
					if (local2099 == -1 || this.aClass33_Sub1_4.anInterface9_12.method1558(local2099).aBoolean241) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					local2099 = arg8[local1861];
					if (local2099 == -1 || this.aClass33_Sub1_4.anInterface9_12.method1558(local2099).aBoolean241) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					local2099 = arg8[local1947];
					if (local2099 == -1 || this.aClass33_Sub1_4.anInterface9_12.method1558(local2099).aBoolean241) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					if (local2095) {
						local1623.aShortArray108[local1693] = (short) local2099;
						local1623.aShortArray107[local1693] = (short) arg9[local1814];
					} else {
						if (local2093) {
							local2099 = arg8[local1814];
							if (local2099 != -1 && !this.aClass33_Sub1_4.anInterface9_12.method1558(local2099).aBoolean241) {
								local1623.anIntArray578[local1814] = Static84.anIntArray114[Static391.method5048(this.aClass33_Sub1_4.anInterface9_12.method1558(local2099).aShort49 & 0xFFFF) & 0xFFFF];
							}
							local2099 = arg8[local1861];
							if (local2099 != -1 && !this.aClass33_Sub1_4.anInterface9_12.method1558(local2099).aBoolean241) {
								local1623.anIntArray578[local1861] = Static84.anIntArray114[Static391.method5048(this.aClass33_Sub1_4.anInterface9_12.method1558(local2099).aShort49 & 0xFFFF) & 0xFFFF];
							}
							local2099 = arg8[local1947];
							if (local2099 != -1 && !this.aClass33_Sub1_4.anInterface9_12.method1558(local2099).aBoolean241) {
								local1623.anIntArray578[local1947] = Static84.anIntArray114[Static391.method5048(this.aClass33_Sub1_4.anInterface9_12.method1558(local2099).aShort49 & 0xFFFF) & 0xFFFF];
							}
						}
						local1623.aShortArray108[local1693] = -1;
					}
				}
			}
			this.aClass330ArrayArray1[arg0][arg1] = local1623;
			return;
		}
		@Pc(842) Class190 local842 = new Class190();
		local383 = arg6[0];
		local467 = arg8[0];
		if (arg7 != null) {
			local842.anInt4778 = arg7[0] >> 8;
			if (local383 == 0) {
				local842.aByte75 = (byte) (local842.aByte75 | 0x2);
			}
		} else if (local383 == 0) {
			return;
		}
		if (super.anIntArrayArray55[arg0][arg1] == super.anIntArrayArray55[arg0 + 1][arg1] && super.anIntArrayArray55[arg0][arg1] == super.anIntArrayArray55[arg0 + 1][arg1 + 1] && super.anIntArrayArray55[arg0][arg1] == super.anIntArrayArray55[arg0][arg1 + 1]) {
			local842.aByte75 = (byte) (local842.aByte75 | 0x1);
		}
		if (local467 == -1 || (local842.aByte75 & 0x2) != 0 || this.aClass33_Sub1_4.anInterface9_12.method1558(local467).aBoolean241) {
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local186] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt4775 = Static6.method116(local499, arg10, Static681.method1643(arg6[local186] >> 8, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]));
			if (local842.anInt4778 != 0) {
				local842.anInt4775 |= this.aByteArrayArray7[arg0][arg1] + 255 - this.aByteArrayArray6[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local191] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt4776 = Static6.method116(local499, arg10, Static681.method1643(arg6[local191] >> 8, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]));
			if (local842.anInt4778 != 0) {
				local842.anInt4776 |= this.aByteArrayArray7[arg0 + 1][arg1] + 255 - this.aByteArrayArray6[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local195] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt4777 = Static6.method116(local499, arg10, Static681.method1643(arg6[local195] >> 8, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]));
			if (local842.anInt4778 != 0) {
				local842.anInt4777 |= this.aByteArrayArray7[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray6[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local215] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt4779 = Static6.method116(local499, arg10, Static681.method1643(arg6[local215] >> 8, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]));
			if (local842.anInt4778 != 0) {
				local842.anInt4779 |= this.aByteArrayArray7[arg0][arg1 + 1] + 255 - this.aByteArrayArray6[arg0][arg1 + 1] << 25;
			}
			local842.aShort78 = -1;
		} else {
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local186] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt4775 = Static6.method116(local499, arg10, Static681.method1643(arg6[local186] >> 8, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]));
			if (local842.anInt4778 != 0) {
				local842.anInt4775 |= this.aByteArrayArray7[arg0][arg1] + 255 - this.aByteArrayArray6[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local191] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt4776 = Static6.method116(local499, arg10, Static681.method1643(arg6[local191] >> 8, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]));
			if (local842.anInt4778 != 0) {
				local842.anInt4776 |= this.aByteArrayArray7[arg0 + 1][arg1] + 255 - this.aByteArrayArray6[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local195] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt4777 = Static6.method116(local499, arg10, Static681.method1643(arg6[local195] >> 8, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]));
			if (local842.anInt4778 != 0) {
				local842.anInt4777 |= this.aByteArrayArray7[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray6[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local215] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt4779 = Static6.method116(local499, arg10, Static681.method1643(arg6[local215] >> 8, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]));
			local842.aShort78 = (short) local467;
		}
		if (arg5 != null) {
			local842.aShort77 = (short) arg5[local195];
			local842.aShort76 = (short) arg5[local215];
			local842.aShort79 = (short) arg5[local191];
			local842.aShort75 = (short) arg5[local186];
		}
		this.aClass190ArrayArray1[arg0][arg1] = local842;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIZLclient!eu;Lclient!du;[I[I[I[II)V")
	private void method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class101 arg3, @OriginalArg(4) Class77 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class364 local6 = this.aClass364ArrayArray1[arg0][arg1];
		if (arg9 != 0 && (arg9 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(47) int local47;
		@Pc(162) float local162;
		@Pc(183) float local183;
		@Pc(68) float local68;
		@Pc(21) int local21;
		@Pc(89) int local89;
		@Pc(109) int local109;
		if (this.anInt1655 == -1) {
			for (local21 = 0; local21 < local6.aShort116; local21++) {
				local32 = local6.aShortArray152[local21] + (arg0 << super.anInt8635);
				local37 = local6.aShortArray148[local21];
				local47 = local6.aShortArray150[local21] + (arg1 << super.anInt8635);
				local68 = this.aFloat27 + this.aFloat25 * (float) local32 + this.aFloat24 * (float) local37 + this.aFloat26 * (float) local47;
				if (local68 <= (float) this.aClass33_Sub1_4.anInt1164) {
					return;
				}
				arg8[local21] = 0;
				if (arg2) {
					local89 = (int) (local68 - (float) arg3.anInt2572);
					if (local89 > 255) {
						local89 = 255;
					}
					if (local89 > 0) {
						arg8[local21] = local89;
						local109 = local6.aShortArray153[local21] * local89 / 255;
						if (local109 > 0) {
							local37 -= local109;
						}
					}
				} else if (arg3.aBoolean184) {
					local89 = (int) (local68 - (float) arg3.anInt2572);
					if (local89 > 0) {
						arg8[local21] = local89;
						if (arg8[local21] > 255) {
							arg8[local21] = 255;
						}
					}
				}
				local162 = this.aFloat22 + this.aFloat29 * (float) local32 + this.aFloat18 * (float) local37 + this.aFloat21 * (float) local47;
				local183 = this.aFloat20 + this.aFloat19 * (float) local32 + this.aFloat23 * (float) local37 + this.aFloat28 * (float) local47;
				arg5[local21] = arg4.anInt2161 + (int) (local162 * (float) this.aClass33_Sub1_4.lb / local68);
				arg6[local21] = arg4.anInt2158 + (int) (local183 * (float) this.aClass33_Sub1_4.anInt1167 / local68);
				arg7[local21] = (int) local68;
			}
		} else {
			for (local21 = 0; local21 < local6.aShort116; local21++) {
				local32 = local6.aShortArray152[local21] + (arg0 << super.anInt8635);
				local37 = local6.aShortArray148[local21];
				local47 = local6.aShortArray150[local21] + (arg1 << super.anInt8635);
				local68 = this.aFloat27 + this.aFloat25 * (float) local32 + this.aFloat24 * (float) local37 + this.aFloat26 * (float) local47;
				arg8[local21] = 0;
				if (arg2) {
					local89 = this.anInt1655 - arg3.anInt2572;
					if (local89 > 255) {
						local89 = 255;
					}
					if (local89 > 0) {
						arg8[local21] = local89;
						local109 = local6.aShortArray153[local21] * local89 / 255;
						if (local109 > 0) {
							local37 -= local109;
						}
					}
				} else if (arg3.aBoolean184) {
					local89 = this.anInt1655 - arg3.anInt2572;
					if (local89 > 0) {
						arg8[local21] = local89;
						if (arg8[local21] > 255) {
							arg8[local21] = 255;
						}
					}
				}
				local162 = this.aFloat22 + this.aFloat29 * (float) local32 + this.aFloat18 * (float) local37 + this.aFloat21 * (float) local47;
				local183 = this.aFloat20 + this.aFloat19 * (float) local32 + this.aFloat23 * (float) local37 + this.aFloat28 * (float) local47;
				arg5[local21] = arg4.anInt2161 + (int) (local162 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
				arg6[local21] = arg4.anInt2158 + (int) (local183 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
				arg7[local21] = (int) local68;
			}
		}
		@Pc(426) float local426 = (float) super.anInt8631;
		for (local89 = 0; local89 < local6.aShort117; local89++) {
			local109 = local89 * 3;
			@Pc(437) int local437 = local109 + 1;
			@Pc(441) int local441 = local437 + 1;
			@Pc(445) int local445 = arg5[local109];
			@Pc(449) int local449 = arg5[local437];
			@Pc(453) int local453 = arg5[local441];
			@Pc(457) int local457 = arg6[local109];
			@Pc(461) int local461 = arg6[local437];
			@Pc(465) int local465 = arg6[local441];
			if ((local445 - local449) * (local465 - local461) - (local457 - local461) * (local453 - local449) > 0) {
				arg4.aBoolean145 = local445 < 0 || local449 < 0 || local453 < 0 || local445 > arg4.anInt2160 || local449 > arg4.anInt2160 || local453 > arg4.anInt2160;
				if (arg8[local109] + arg8[local437] + arg8[local441] < 765) {
					@Pc(522) int local522 = arg0 << super.anInt8635;
					@Pc(527) int local527 = arg1 << super.anInt8635;
					if ((local6.anIntArray655[local109] & 0xFFFFFF) != 0) {
						if (local6.aShortArray151[local109] == local6.aShortArray151[local437] && local6.aShortArray151[local109] == local6.aShortArray151[local441] && local6.aShortArray149[local109] == local6.aShortArray149[local437] && local6.aShortArray149[local109] == local6.aShortArray149[local441]) {
							arg4.method2091((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], (float) (local522 + local6.aShortArray152[local109]) / (float) local6.aShortArray149[local109], (float) (local522 + local6.aShortArray152[local437]) / (float) local6.aShortArray149[local437], (float) (local522 + local6.aShortArray152[local441]) / (float) local6.aShortArray149[local441], (float) (local527 + local6.aShortArray150[local109]) / (float) local6.aShortArray149[local109], (float) (local527 + local6.aShortArray150[local437]) / (float) local6.aShortArray149[local437], (float) (local527 + local6.aShortArray150[local441]) / (float) local6.aShortArray149[local441], local6.anIntArray655[local109], local6.anIntArray655[local437], local6.anIntArray655[local441], arg3.anInt2575, arg8[local109], arg8[local437], arg8[local441], local6.aShortArray151[local109]);
						} else {
							arg4.method2093((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], (float) (local522 + local6.aShortArray152[local109]) / local426, (float) (local522 + local6.aShortArray152[local437]) / local426, (float) (local522 + local6.aShortArray152[local441]) / local426, (float) (local527 + local6.aShortArray150[local109]) / local426, (float) (local527 + local6.aShortArray150[local437]) / local426, (float) (local527 + local6.aShortArray150[local441]) / local426, local6.anIntArray655[local109], local6.anIntArray655[local437], local6.anIntArray655[local441], arg3.anInt2575, arg8[local109], arg8[local437], arg8[local441], local6.aShortArray151[local109], local426 / (float) local6.aShortArray149[local109], local6.aShortArray151[local437], local426 / (float) local6.aShortArray149[local437], local6.aShortArray151[local441], local426 / (float) local6.aShortArray149[local441]);
						}
					}
				} else {
					arg4.method2101((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], arg3.anInt2575);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILclient!du;[I[I[I[II)V")
	private void method1649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class263 local6 = this.aClass263ArrayArray1[arg0][arg1];
		@Pc(41) int local41;
		@Pc(51) int local51;
		@Pc(467) int local467;
		@Pc(497) int local497;
		if (local6 == null) {
			@Pc(2129) Class175 local2129 = this.aClass175ArrayArray1[arg0][arg1];
			if (local2129 != null) {
				if (arg7 != 0) {
					if ((local2129.aByte72 & 0x4) == 0) {
						if ((arg7 & 0x2) != 0) {
							return;
						}
					} else if ((arg7 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2170) short local2170;
				@Pc(2230) float local2230;
				@Pc(2251) float local2251;
				@Pc(2201) float local2201;
				if (this.anInt1655 == -1) {
					for (local467 = 0; local467 < local2129.aShort67; local467++) {
						local41 = local2129.aShortArray48[local467] + (arg0 << super.anInt8635);
						local2170 = local2129.aShortArray49[local467];
						local51 = local2129.aShortArray45[local467] + (arg1 << super.anInt8635);
						local2201 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local2170 + this.aFloat26 * (float) local51;
						if (local2201 <= (float) this.aClass33_Sub1_4.anInt1164) {
							return;
						}
						local2230 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local2170 + this.aFloat21 * (float) local51;
						local2251 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local2170 + this.aFloat28 * (float) local51;
						arg3[local467] = arg2.anInt2161 + (int) (local2230 * (float) this.aClass33_Sub1_4.lb / local2201);
						arg4[local467] = arg2.anInt2158 + (int) (local2251 * (float) this.aClass33_Sub1_4.anInt1167 / local2201);
						arg5[local467] = (int) local2201;
					}
				} else {
					for (local467 = 0; local467 < local2129.aShort67; local467++) {
						local41 = local2129.aShortArray48[local467] + (arg0 << super.anInt8635);
						local2170 = local2129.aShortArray49[local467];
						local51 = local2129.aShortArray45[local467] + (arg1 << super.anInt8635);
						local2201 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local2170 + this.aFloat26 * (float) local51;
						local2230 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local2170 + this.aFloat21 * (float) local51;
						local2251 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local2170 + this.aFloat28 * (float) local51;
						arg3[local467] = arg2.anInt2161 + (int) (local2230 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
						arg4[local467] = arg2.anInt2158 + (int) (local2251 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
						arg5[local467] = (int) local2201;
					}
				}
				@Pc(2442) short local2442;
				@Pc(2447) short local2447;
				@Pc(2452) short local2452;
				@Pc(2460) int local2460;
				@Pc(2464) int local2464;
				@Pc(2468) int local2468;
				@Pc(2472) int local2472;
				@Pc(2476) int local2476;
				if (local2129.aShortArray44 != null) {
					@Pc(2650) int local2650;
					@Pc(2520) short local2520;
					if (this.anInt1655 == -1) {
						for (local467 = 0; local467 < local2129.aShort66; local467++) {
							local2442 = local2129.aShortArray46[local467];
							local2447 = local2129.aShortArray51[local467];
							local2452 = local2129.aShortArray47[local467];
							local497 = arg3[local2442];
							local2460 = arg3[local2447];
							local2464 = arg3[local2452];
							local2468 = arg4[local2442];
							local2472 = arg4[local2447];
							local2476 = arg4[local2452];
							if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
								arg2.aBoolean145 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt2160 || local2460 > arg2.anInt2160 || local2464 > arg2.anInt2160;
								local2520 = local2129.aShortArray44[local467];
								if (local2520 == -1) {
									local2650 = local2129.anIntArray319[local467];
									if (local2650 != -1) {
										arg2.method2095((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static328.method4515(local2129.aShortArray50[local2442], local2650), (float) Static328.method4515(local2129.aShortArray50[local2447], local2650), (float) Static328.method4515(local2129.aShortArray50[local2452], local2650));
									}
								} else {
									arg2.method2091((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) local2129.aShortArray48[local2442] / (float) super.anInt8631, (float) local2129.aShortArray48[local2447] / (float) super.anInt8631, (float) local2129.aShortArray48[local2452] / (float) super.anInt8631, (float) local2129.aShortArray45[local2442] / (float) super.anInt8631, (float) local2129.aShortArray45[local2447] / (float) super.anInt8631, (float) local2129.aShortArray45[local2452] / (float) super.anInt8631, Static84.anIntArray114[local2129.aShortArray50[local2442] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local2129.aShortArray50[local2447] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local2129.aShortArray50[local2452] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2520);
								}
							}
						}
						return;
					}
					for (local467 = 0; local467 < local2129.aShort66; local467++) {
						local2442 = local2129.aShortArray46[local467];
						local2447 = local2129.aShortArray51[local467];
						local2452 = local2129.aShortArray47[local467];
						local497 = arg3[local2442];
						local2460 = arg3[local2447];
						local2464 = arg3[local2452];
						local2468 = arg4[local2442];
						local2472 = arg4[local2447];
						local2476 = arg4[local2452];
						if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
							arg2.aBoolean145 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt2160 || local2460 > arg2.anInt2160 || local2464 > arg2.anInt2160;
							local2520 = local2129.aShortArray44[local467];
							if (local2520 == -1) {
								local2650 = local2129.anIntArray319[local467];
								if (local2650 != -1) {
									arg2.method2095((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static328.method4515(local2129.aShortArray50[local2442], local2650), (float) Static328.method4515(local2129.aShortArray50[local2447], local2650), (float) Static328.method4515(local2129.aShortArray50[local2452], local2650));
								}
							} else {
								arg2.method2091((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) local2129.aShortArray48[local2442] / (float) super.anInt8631, (float) local2129.aShortArray48[local2447] / (float) super.anInt8631, (float) local2129.aShortArray48[local2452] / (float) super.anInt8631, (float) local2129.aShortArray45[local2442] / (float) super.anInt8631, (float) local2129.aShortArray45[local2447] / (float) super.anInt8631, (float) local2129.aShortArray45[local2452] / (float) super.anInt8631, Static84.anIntArray114[local2129.aShortArray50[local2442] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local2129.aShortArray50[local2447] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local2129.aShortArray50[local2452] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2520);
							}
						}
					}
					return;
				}
				for (local467 = 0; local467 < local2129.aShort66; local467++) {
					local2442 = local2129.aShortArray46[local467];
					local2447 = local2129.aShortArray51[local467];
					local2452 = local2129.aShortArray47[local467];
					local497 = arg3[local2442];
					local2460 = arg3[local2447];
					local2464 = arg3[local2452];
					local2468 = arg4[local2442];
					local2472 = arg4[local2447];
					local2476 = arg4[local2452];
					if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
						@Pc(3047) int local3047 = local2129.anIntArray319[local467];
						if (local3047 != -1) {
							arg2.aBoolean145 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt2160 || local2460 > arg2.anInt2160 || local2464 > arg2.anInt2160;
							arg2.method2095((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static328.method4515(local2129.aShortArray50[local2442], local3047), (float) Static328.method4515(local2129.aShortArray50[local2447], local3047), (float) Static328.method4515(local2129.aShortArray50[local2452], local3047));
						}
					}
				}
			}
		} else if ((local6.aByte92 & 0x2) == 0) {
			if (arg7 != 0) {
				if ((local6.aByte92 & 0x4) == 0) {
					if ((arg7 & 0x2) != 0) {
						return;
					}
				} else if ((arg7 & 0x1) != 0) {
					return;
				}
			}
			@Pc(36) int local36 = arg0 * super.anInt8631;
			local41 = local36 + super.anInt8631;
			@Pc(46) int local46 = arg1 * super.anInt8631;
			local51 = local46 + super.anInt8631;
			@Pc(484) float local484;
			@Pc(90) float local90;
			@Pc(115) float local115;
			@Pc(140) float local140;
			@Pc(165) float local165;
			@Pc(63) int local63;
			@Pc(287) int local287;
			@Pc(347) int local347;
			@Pc(407) int local407;
			@Pc(317) int local317;
			@Pc(377) int local377;
			@Pc(437) int local437;
			@Pc(274) float local274;
			@Pc(334) float local334;
			@Pc(394) float local394;
			@Pc(454) float local454;
			@Pc(304) float local304;
			@Pc(364) float local364;
			@Pc(424) float local424;
			if ((local6.aByte92 & 0x1) == 0) {
				local63 = super.anIntArrayArray55[arg0][arg1];
				@Pc(771) int local771 = super.anIntArrayArray55[arg0 + 1][arg1];
				@Pc(782) int local782 = super.anIntArrayArray55[arg0 + 1][arg1 + 1];
				@Pc(791) int local791 = super.anIntArrayArray55[arg0][arg1 + 1];
				if (this.anInt1655 == -1) {
					local90 = this.aFloat27 + this.aFloat25 * (float) local36 + this.aFloat24 * (float) local63 + this.aFloat26 * (float) local46;
					if (local90 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local115 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local771 + this.aFloat26 * (float) local46;
					if (local115 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local140 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local782 + this.aFloat26 * (float) local51;
					if (local140 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local165 = this.aFloat27 + this.aFloat25 * (float) local36 + this.aFloat24 * (float) local791 + this.aFloat26 * (float) local51;
					if (local165 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local274 = this.aFloat22 + this.aFloat29 * (float) local36 + this.aFloat18 * (float) local63 + this.aFloat21 * (float) local46;
					local287 = arg2.anInt2161 + (int) (local274 * (float) this.aClass33_Sub1_4.lb / local90);
					local304 = this.aFloat20 + this.aFloat19 * (float) local36 + this.aFloat23 * (float) local63 + this.aFloat28 * (float) local46;
					local317 = arg2.anInt2158 + (int) (local304 * (float) this.aClass33_Sub1_4.anInt1167 / local90);
					local334 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local771 + this.aFloat21 * (float) local46;
					local347 = arg2.anInt2161 + (int) (local334 * (float) this.aClass33_Sub1_4.lb / local115);
					local364 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local771 + this.aFloat28 * (float) local46;
					local377 = arg2.anInt2158 + (int) (local364 * (float) this.aClass33_Sub1_4.anInt1167 / local115);
					local394 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local782 + this.aFloat21 * (float) local51;
					local407 = arg2.anInt2161 + (int) (local394 * (float) this.aClass33_Sub1_4.lb / local140);
					local424 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local782 + this.aFloat28 * (float) local51;
					local437 = arg2.anInt2158 + (int) (local424 * (float) this.aClass33_Sub1_4.anInt1167 / local140);
					local454 = this.aFloat22 + this.aFloat29 * (float) local36 + this.aFloat18 * (float) local791 + this.aFloat21 * (float) local51;
					local467 = arg2.anInt2161 + (int) (local454 * (float) this.aClass33_Sub1_4.lb / local165);
					local484 = this.aFloat20 + this.aFloat19 * (float) local36 + this.aFloat23 * (float) local791 + this.aFloat28 * (float) local51;
					local497 = arg2.anInt2158 + (int) (local484 * (float) this.aClass33_Sub1_4.anInt1167 / local165);
				} else {
					local90 = this.aFloat27 + this.aFloat25 * (float) local36 + this.aFloat24 * (float) local63 + this.aFloat26 * (float) local46;
					local115 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local771 + this.aFloat26 * (float) local46;
					local140 = this.aFloat27 + this.aFloat25 * (float) local41 + this.aFloat24 * (float) local782 + this.aFloat26 * (float) local51;
					local165 = this.aFloat27 + this.aFloat25 * (float) local36 + this.aFloat24 * (float) local791 + this.aFloat26 * (float) local51;
					local274 = this.aFloat22 + this.aFloat29 * (float) local36 + this.aFloat18 * (float) local63 + this.aFloat21 * (float) local46;
					local287 = arg2.anInt2161 + (int) (local274 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local304 = this.aFloat20 + this.aFloat19 * (float) local36 + this.aFloat23 * (float) local63 + this.aFloat28 * (float) local46;
					local317 = arg2.anInt2158 + (int) (local304 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local334 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local771 + this.aFloat21 * (float) local46;
					local347 = arg2.anInt2161 + (int) (local334 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local364 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local771 + this.aFloat28 * (float) local46;
					local377 = arg2.anInt2158 + (int) (local364 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local394 = this.aFloat22 + this.aFloat29 * (float) local41 + this.aFloat18 * (float) local782 + this.aFloat21 * (float) local51;
					local407 = arg2.anInt2161 + (int) (local394 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local424 = this.aFloat20 + this.aFloat19 * (float) local41 + this.aFloat23 * (float) local782 + this.aFloat28 * (float) local51;
					local437 = arg2.anInt2158 + (int) (local424 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local454 = this.aFloat22 + this.aFloat29 * (float) local36 + this.aFloat18 * (float) local791 + this.aFloat21 * (float) local51;
					local467 = arg2.anInt2161 + (int) (local454 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local484 = this.aFloat20 + this.aFloat19 * (float) local36 + this.aFloat23 * (float) local791 + this.aFloat28 * (float) local51;
					local497 = arg2.anInt2158 + (int) (local484 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
				}
			} else {
				local63 = super.anIntArrayArray55[arg0][arg1];
				@Pc(69) float local69 = this.aFloat24 * (float) local63;
				if (this.anInt1655 == -1) {
					local90 = this.aFloat27 + this.aFloat25 * (float) local36 + local69 + this.aFloat26 * (float) local46;
					if (local90 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local115 = this.aFloat27 + this.aFloat25 * (float) local41 + local69 + this.aFloat26 * (float) local46;
					if (local115 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local140 = this.aFloat27 + this.aFloat25 * (float) local41 + local69 + this.aFloat26 * (float) local51;
					if (local140 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
					local165 = this.aFloat27 + this.aFloat25 * (float) local36 + local69 + this.aFloat26 * (float) local51;
					if (local165 <= (float) this.aClass33_Sub1_4.anInt1164) {
						return;
					}
				} else {
					local90 = this.aFloat27 + this.aFloat25 * (float) local36 + local69 + this.aFloat26 * (float) local46;
					local115 = this.aFloat27 + this.aFloat25 * (float) local41 + local69 + this.aFloat26 * (float) local46;
					local140 = this.aFloat27 + this.aFloat25 * (float) local41 + local69 + this.aFloat26 * (float) local51;
					local165 = this.aFloat27 + this.aFloat25 * (float) local36 + local69 + this.aFloat26 * (float) local51;
				}
				@Pc(247) float local247 = this.aFloat18 * (float) local63;
				@Pc(253) float local253 = this.aFloat23 * (float) local63;
				if (this.anInt1655 == -1) {
					local274 = this.aFloat22 + this.aFloat29 * (float) local36 + local247 + this.aFloat21 * (float) local46;
					local287 = arg2.anInt2161 + (int) (local274 * (float) this.aClass33_Sub1_4.lb / local90);
					local304 = this.aFloat20 + this.aFloat19 * (float) local36 + local253 + this.aFloat28 * (float) local46;
					local317 = arg2.anInt2158 + (int) (local304 * (float) this.aClass33_Sub1_4.anInt1167 / local90);
					local334 = this.aFloat22 + this.aFloat29 * (float) local41 + local247 + this.aFloat21 * (float) local46;
					local347 = arg2.anInt2161 + (int) (local334 * (float) this.aClass33_Sub1_4.lb / local115);
					local364 = this.aFloat20 + this.aFloat19 * (float) local41 + local253 + this.aFloat28 * (float) local46;
					local377 = arg2.anInt2158 + (int) (local364 * (float) this.aClass33_Sub1_4.anInt1167 / local115);
					local394 = this.aFloat22 + this.aFloat29 * (float) local41 + local247 + this.aFloat21 * (float) local51;
					local407 = arg2.anInt2161 + (int) (local394 * (float) this.aClass33_Sub1_4.lb / local140);
					local424 = this.aFloat20 + this.aFloat19 * (float) local41 + local253 + this.aFloat28 * (float) local51;
					local437 = arg2.anInt2158 + (int) (local424 * (float) this.aClass33_Sub1_4.anInt1167 / local140);
					local454 = this.aFloat22 + this.aFloat29 * (float) local36 + local247 + this.aFloat21 * (float) local51;
					local467 = arg2.anInt2161 + (int) (local454 * (float) this.aClass33_Sub1_4.lb / local165);
					local484 = this.aFloat20 + this.aFloat19 * (float) local36 + local253 + this.aFloat28 * (float) local51;
					local497 = arg2.anInt2158 + (int) (local484 * (float) this.aClass33_Sub1_4.anInt1167 / local165);
				} else {
					local274 = this.aFloat22 + this.aFloat29 * (float) local36 + local247 + this.aFloat21 * (float) local46;
					local287 = arg2.anInt2161 + (int) (local274 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local304 = this.aFloat20 + this.aFloat19 * (float) local36 + local253 + this.aFloat28 * (float) local46;
					local317 = arg2.anInt2158 + (int) (local304 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local334 = this.aFloat22 + this.aFloat29 * (float) local41 + local247 + this.aFloat21 * (float) local46;
					local347 = arg2.anInt2161 + (int) (local334 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local364 = this.aFloat20 + this.aFloat19 * (float) local41 + local253 + this.aFloat28 * (float) local46;
					local377 = arg2.anInt2158 + (int) (local364 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local394 = this.aFloat22 + this.aFloat29 * (float) local41 + local247 + this.aFloat21 * (float) local51;
					local407 = arg2.anInt2161 + (int) (local394 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local424 = this.aFloat20 + this.aFloat19 * (float) local41 + local253 + this.aFloat28 * (float) local51;
					local437 = arg2.anInt2158 + (int) (local424 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
					local454 = this.aFloat22 + this.aFloat29 * (float) local36 + local247 + this.aFloat21 * (float) local51;
					local467 = arg2.anInt2161 + (int) (local454 * (float) this.aClass33_Sub1_4.lb / (float) this.anInt1655);
					local484 = this.aFloat20 + this.aFloat19 * (float) local36 + local253 + this.aFloat28 * (float) local51;
					local497 = arg2.anInt2158 + (int) (local484 * (float) this.aClass33_Sub1_4.anInt1167 / (float) this.anInt1655);
				}
			}
			if (this.anInt1655 == -1) {
				if ((local407 - local467) * (local377 - local497) - (local437 - local497) * (local347 - local467) > 0) {
					arg2.aBoolean145 = local407 < 0 || local467 < 0 || local347 < 0 || local407 > arg2.anInt2160 || local467 > arg2.anInt2160 || local347 > arg2.anInt2160;
					if (local6.aShort93 >= 0) {
						arg2.method2091((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, local140, local165, local115, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static84.anIntArray114[local6.aShort94 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local6.aShort95 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local6.aShort91 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort93);
					} else {
						arg2.method2095((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, (float) (int) local140, (float) (int) local165, (float) (int) local115, (float) (local6.aShort94 & 0xFFFF), (float) (local6.aShort95 & 0xFFFF), (float) (local6.aShort91 & 0xFFFF));
					}
				}
				if ((local287 - local347) * (local497 - local377) - (local317 - local377) * (local467 - local347) > 0) {
					arg2.aBoolean145 = local287 < 0 || local347 < 0 || local467 < 0 || local287 > arg2.anInt2160 || local347 > arg2.anInt2160 || local467 > arg2.anInt2160;
					if (local6.aShort93 >= 0) {
						arg2.method2091((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, local90, local115, local165, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static84.anIntArray114[local6.aShort92 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local6.aShort91 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local6.aShort95 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort93);
						return;
					}
					arg2.method2095((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, (float) (int) local90, (float) (int) local115, (float) (int) local165, (float) (local6.aShort92 & 0xFFFF), (float) (local6.aShort91 & 0xFFFF), (float) (local6.aShort95 & 0xFFFF));
					return;
				}
			} else {
				if ((local407 - local467) * (local377 - local497) - (local437 - local497) * (local347 - local467) > 0) {
					arg2.aBoolean145 = local407 < 0 || local467 < 0 || local347 < 0 || local407 > arg2.anInt2160 || local467 > arg2.anInt2160 || local347 > arg2.anInt2160;
					if (local6.aShort93 >= 0) {
						arg2.method2091((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, local140, local165, local115, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static84.anIntArray114[local6.aShort94 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local6.aShort95 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local6.aShort91 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort93);
					} else {
						arg2.method2095((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, (float) (int) local140, (float) (int) local165, (float) (int) local115, (float) (local6.aShort94 & 0xFFFF), (float) (local6.aShort95 & 0xFFFF), (float) (local6.aShort91 & 0xFFFF));
					}
				}
				if ((local287 - local347) * (local497 - local377) - (local317 - local377) * (local467 - local347) > 0) {
					arg2.aBoolean145 = local287 < 0 || local347 < 0 || local467 < 0 || local287 > arg2.anInt2160 || local347 > arg2.anInt2160 || local467 > arg2.anInt2160;
					if (local6.aShort93 >= 0) {
						arg2.method2091((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, local90, local115, local165, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static84.anIntArray114[local6.aShort92 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local6.aShort91 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static84.anIntArray114[local6.aShort95 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort93);
						return;
					}
					arg2.method2095((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, (float) (int) local90, (float) (int) local115, (float) (int) local165, (float) (local6.aShort92 & 0xFFFF), (float) (local6.aShort91 & 0xFFFF), (float) (local6.aShort95 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class92_Sub3 local3 = this.aClass33_Sub1_4.aClass92_Sub3_1;
		this.anInt1655 = arg5;
		this.aFloat29 = local3.aFloat96;
		this.aFloat18 = local3.aFloat94;
		this.aFloat21 = local3.aFloat95;
		this.aFloat22 = local3.aFloat91;
		this.aFloat19 = local3.aFloat101;
		this.aFloat23 = local3.aFloat97;
		this.aFloat28 = local3.aFloat98;
		this.aFloat20 = local3.aFloat102;
		this.aFloat25 = local3.aFloat92;
		this.aFloat24 = local3.aFloat93;
		this.aFloat26 = local3.aFloat100;
		this.aFloat27 = local3.aFloat103;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt8638 && local78 >= 0 && local78 < super.anInt8630) {
						this.method1644(local72, local78, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray7[arg0][arg1] < arg2) {
			this.aByteArrayArray7[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z")
	private boolean method1650(@OriginalArg(0) int arg0) {
		if ((this.anInt1656 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!cq", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}
}
