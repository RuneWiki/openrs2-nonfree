import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class3_Sub3_Sub2_Sub1 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!ee", name = "vb", descriptor = "I")
	public int anInt742 = 0;

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ee", name = "Ab", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "[I")
	private final int[] anIntArray144;

	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "[I")
	private final int[] anIntArray143;

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "[I")
	private final int[] anIntArray145;

	@OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
	private final int anInt743;

	@OriginalMember(owner = "client!ee", name = "Bb", descriptor = "I")
	private final int anInt744;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class3_Sub3_Sub2_Sub1(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray144 = arg0;
		this.anIntArray143 = arg1;
		this.anIntArray145 = arg2;
		@Pc(27) byte local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < arg3.length; local29++) {
			if (arg3[local29] == 1) {
				local27 = (byte) local29;
			}
		}
		this.aByteArrayArray5 = arg4;
		@Pc(48) int local48 = Integer.MAX_VALUE;
		@Pc(50) int local50 = Integer.MIN_VALUE;
		for (@Pc(52) int local52 = 0; local52 < 256; local52++) {
			if (this.anIntArray144[local52] < local48) {
				local48 = this.anIntArray144[local52];
			}
			if (this.anIntArray144[local52] + this.anIntArray145[local52] > local50) {
				local50 = this.anIntArray144[local52] + this.anIntArray145[local52];
			}
			@Pc(90) byte[] local90 = this.aByteArrayArray5[local52];
			@Pc(93) int local93 = local90.length;
			for (@Pc(95) int local95 = 0; local95 < local93; local95++) {
				local90[local95] = (byte) (local90[local95] == local27 ? 0 : 1);
			}
		}
		this.anInt742 = this.anIntArray144[32] + this.anIntArray145[32];
		this.anInt743 = this.anInt742 - local48;
		this.anInt744 = local50 - this.anInt742;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!hb;IIIZI)V")
	public void method595(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt742;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt963; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray9[local22] == 64 && local22 + 4 < arg0.anInt963 && arg0.aByteArray9[local22 + 4] == 64) {
				local55 = this.method597(arg0.method747(local22 + 1, local22 + 4));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray9[local22] & 0xFF;
				if (local55 != 32) {
					this.method605(this.aByteArrayArray5[local55], arg1 + 1, local20 + this.anIntArray144[local55] + 1, this.anIntArray143[local55], this.anIntArray145[local55], 0, 192);
					this.method605(this.aByteArrayArray5[local55], arg1, local20 + this.anIntArray144[local55], this.anIntArray143[local55], this.anIntArray145[local55], arg2, local15);
				}
				arg1 += this.anIntArray143[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!hb;IIIIIZIII)V")
	public void method596(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = 0;
		@Pc(10) Class27 local10 = Static76.method1510();
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		@Pc(16) Class27 local16 = null;
		if (arg9 == 0) {
			arg9 = this.anInt743;
		}
		@Pc(23) boolean local23 = true;
		if (arg4 < this.anInt743 + this.anInt744 + arg9 && arg4 < arg9 + arg9) {
			local23 = false;
		}
		@Pc(41) int local41 = 0;
		@Pc(45) int local45 = arg0.method765();
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			local53 = arg0.method736(local47);
			if (local53 == 64 && local47 + 4 < local45 && arg0.method736(local47 + 4) == 64) {
				local16 = arg0.method747(local47, local47 + 5);
				local10.method741(local16);
				local47 += 4;
			} else if (local53 == 92 && local47 + 1 < local45 && arg0.method736(local47 + 1) == 110) {
				local16 = null;
				Static27.aClass27Array1[local41++] = local10.method747(local6, local10.method765()).method735();
				local6 = local10.method765();
				local4 = 0;
				local12 = -1;
				local47++;
			} else {
				local10.method761(local53);
				local4 += this.method602(local53);
				if (local53 == 32 || local53 == 45) {
					local12 = local10.method765();
					local14 = local4;
				}
				if (local23 && local4 > arg3 && local12 >= 0) {
					Static27.aClass27Array1[local41++] = local10.method747(local6, local12).method735();
					local6 = local12;
					local12 = -1;
					local4 -= local14;
					if (local16 != null && local6 > 4) {
						local6 -= 5;
						local10.method762(local6, local16);
					}
				}
			}
		}
		if (local10.method765() > local6) {
			Static27.aClass27Array1[local41++] = local10.method747(local6, local10.method765()).method735();
		}
		if (arg8 == 3 && local41 == 1) {
			arg8 = 1;
		}
		@Pc(284) int local284;
		if (arg8 == 0) {
			local53 = arg2 + this.anInt743;
		} else if (arg8 == 1) {
			local53 = arg2 + this.anInt743 + (arg4 - this.anInt743 - this.anInt744 - (local41 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local53 = arg2 + arg4 - this.anInt744 - (local41 - 1) * arg9;
		} else {
			local284 = (arg4 - this.anInt743 - this.anInt744 - (local41 - 1) * arg9) / (local41 + 1);
			if (local284 < 0) {
				local284 = 0;
			}
			local53 = arg2 + this.anInt743 + local284;
			arg9 += local284;
		}
		for (local284 = 0; local284 < local41; local284++) {
			if (arg7 == 0) {
				this.method604(Static27.aClass27Array1[local284], arg1, local53, arg5, arg6);
			} else if (arg7 == 1) {
				this.method598(Static27.aClass27Array1[local284], arg1 + arg3 / 2, local53, arg5, arg6);
			} else if (arg7 == 2) {
				this.method612(Static27.aClass27Array1[local284], arg1 + arg3, local53, arg5, arg6);
			} else if (local284 == local41 - 1) {
				this.method604(Static27.aClass27Array1[local284], arg1, local53, arg5, arg6);
			} else {
				this.method615(Static27.aClass27Array1[local284], arg1, local53, arg5, arg6, arg3);
			}
			local53 += arg9;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!hb;)I")
	private int method597(@OriginalArg(0) Class27 arg0) {
		if (arg0.method733(Static27.aClass27_361)) {
			return 16711680;
		} else if (arg0.method733(Static27.aClass27_367)) {
			return 65280;
		} else if (arg0.method733(Static27.aClass27_366)) {
			return 255;
		} else if (arg0.method733(Static27.aClass27_370)) {
			return 16776960;
		} else if (arg0.method733(Static27.aClass27_365)) {
			return 65535;
		} else if (arg0.method733(Static27.aClass27_369)) {
			return 16711935;
		} else if (arg0.method733(Static27.aClass27_357)) {
			return 16777215;
		} else if (arg0.method733(Static27.aClass27_363)) {
			return 0;
		} else if (arg0.method733(Static27.aClass27_356)) {
			return 16748608;
		} else if (arg0.method733(Static27.aClass27_359)) {
			return 8388608;
		} else if (arg0.method733(Static27.aClass27_371)) {
			return 128;
		} else if (arg0.method733(Static27.aClass27_364)) {
			return 16756736;
		} else if (arg0.method733(Static27.aClass27_360)) {
			return 16740352;
		} else if (arg0.method733(Static27.aClass27_355)) {
			return 16723968;
		} else if (arg0.method733(Static27.aClass27_358)) {
			return 12648192;
		} else if (arg0.method733(Static27.aClass27_362)) {
			return 8453888;
		} else if (arg0.method733(Static27.aClass27_368)) {
			return 4259584;
		} else {
			if (arg0.method733(Static27.aClass27_372)) {
				this.aBoolean39 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!hb;IIIZ)V")
	public void method598(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method604(arg0, arg1 - this.method613(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIIIII)V")
	private void method599(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static95.anInt1897;
		@Pc(9) int local9 = Static95.anInt1897 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static95.anInt1899) {
			local20 = Static95.anInt1899 - arg2;
			arg4 -= local20;
			arg2 = Static95.anInt1899;
			local13 = local20 * arg3;
			local5 += local20 * Static95.anInt1897;
		}
		if (arg2 + arg4 > Static95.anInt1895) {
			arg4 -= arg2 + arg4 - Static95.anInt1895;
		}
		if (arg1 < Static95.anInt1896) {
			local20 = Static95.anInt1896 - arg1;
			arg3 -= local20;
			arg1 = Static95.anInt1896;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static95.anInt1898) {
			local20 = arg1 + arg3 - Static95.anInt1898;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method601(Static95.anIntArray314, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[BIIIIIIII)V")
	private void method600(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		@Pc(21) int local21 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(28) int local28 = -arg5; local28 < 0; local28++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(38) int local38 = arg0[arg4];
					arg0[arg4++] = (((local38 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local38 & 0xFF00) * local21 & 0xFF0000) >> 8) + local17;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method601(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(69) int local69 = local9; local69 < 0; local69++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)I")
	public int method602(@OriginalArg(0) int arg0) {
		return this.anIntArray143[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!hb;III)V")
	public void method603(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method610(arg0, arg1 - this.method606(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!hb;IIIZ)V")
	public void method604(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean39 = false;
		@Pc(4) int local4 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 - this.anInt742;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt963; local14++) {
			@Pc(47) int local47;
			if (arg0.aByteArray9[local14] == 64 && local14 + 4 < arg0.anInt963 && arg0.aByteArray9[local14 + 4] == 64) {
				local47 = this.method597(arg0.method747(local14 + 1, local14 + 4));
				if (local47 != -1) {
					arg3 = local47;
				}
				local14 += 4;
			} else {
				local47 = arg0.aByteArray9[local14] & 0xFF;
				if (local47 != 32) {
					if (arg4) {
						this.method599(this.aByteArrayArray5[local47], arg1 + 1, local12 + this.anIntArray144[local47] + 1, this.anIntArray143[local47], this.anIntArray145[local47], 0);
					}
					this.method599(this.aByteArrayArray5[local47], arg1, local12 + this.anIntArray144[local47], this.anIntArray143[local47], this.anIntArray145[local47], arg3);
				}
				arg1 += this.anIntArray143[local47];
			}
		}
		if (this.aBoolean39) {
			Static95.method1326(local4, local12 + (int) ((double) this.anInt742 * 0.7D), arg1 - local4, 8388608);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIIIIII)V")
	private void method605(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static95.anInt1897;
		@Pc(9) int local9 = Static95.anInt1897 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static95.anInt1899) {
			local20 = Static95.anInt1899 - arg2;
			arg4 -= local20;
			arg2 = Static95.anInt1899;
			local13 = local20 * arg3;
			local5 += local20 * Static95.anInt1897;
		}
		if (arg2 + arg4 > Static95.anInt1895) {
			arg4 -= arg2 + arg4 - Static95.anInt1895;
		}
		if (arg1 < Static95.anInt1896) {
			local20 = Static95.anInt1896 - arg1;
			arg3 -= local20;
			arg1 = Static95.anInt1896;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static95.anInt1898) {
			local20 = arg1 + arg3 - Static95.anInt1898;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method600(Static95.anIntArray314, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!hb;)I")
	public int method606(@OriginalArg(0) Class27 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt963; local7++) {
			local5 += this.anIntArray143[arg0.aByteArray9[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!hb;III)V")
	public void method608(@OriginalArg(0) Class27 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method610(arg0, 507 - this.method606(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!hb;IIII)V")
	public void method609(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method606(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt742;
		for (@Pc(17) int local17 = 0; local17 < arg0.method765(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray9[local17] & 0xFF;
			if (local25 != 32) {
				this.method599(this.aByteArrayArray5[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray144[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray143[local25], this.anIntArray145[local25], arg3);
			}
			arg1 += this.anIntArray143[local25];
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(Lclient!hb;III)V")
	public void method610(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt742;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt963; local9++) {
			@Pc(17) int local17 = arg0.aByteArray9[local9] & 0xFF;
			if (local17 != 32) {
				this.method599(this.aByteArrayArray5[local17], arg1, local7 + this.anIntArray144[local17], this.anIntArray143[local17], this.anIntArray145[local17], arg3);
			}
			arg1 += this.anIntArray143[local17];
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!hb;IIII)V")
	public void method611(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method606(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt742;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt963; local17++) {
			@Pc(25) int local25 = arg0.aByteArray9[local17] & 0xFF;
			if (local25 != 32) {
				this.method599(this.aByteArrayArray5[local25], arg1, local15 + this.anIntArray144[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray143[local25], this.anIntArray145[local25], arg3);
			}
			arg1 += this.anIntArray143[local25];
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(Lclient!hb;IIIZ)V")
	public void method612(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method604(arg0, arg1 - this.method613(arg0), arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(Lclient!hb;)I")
	public int method613(@OriginalArg(0) Class27 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt963; local7++) {
			if (arg0.aByteArray9[local7] == 64 && local7 + 4 < arg0.anInt963 && arg0.aByteArray9[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray143[arg0.aByteArray9[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!hb;IIIII)V")
	public void method614(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method606(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt742;
		for (@Pc(30) int local30 = 0; local30 < arg0.method765(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray9[local30] & 0xFF;
			if (local38 != 32) {
				this.method599(this.aByteArrayArray5[local38], arg1, local28 + this.anIntArray144[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray143[local38], this.anIntArray145[local38], arg3);
			}
			arg1 += this.anIntArray143[local38];
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!hb;IIIZI)V")
	private void method615(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class27 local3 = arg0.method735();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3.method765(); local7++) {
			if (local3.method736(local7) == 32) {
				local5++;
			}
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		if (local5 > 0) {
			local23 = (arg5 - this.method613(local3)) * 256 / local5;
		}
		this.aBoolean39 = false;
		@Pc(42) int local42 = arg1;
		if (local3 == null) {
			return;
		}
		@Pc(50) int local50 = arg2 - this.anInt742;
		for (@Pc(52) int local52 = 0; local52 < local3.anInt963; local52++) {
			@Pc(85) int local85;
			if (local3.aByteArray9[local52] == 64 && local52 + 4 < local3.anInt963 && local3.aByteArray9[local52 + 4] == 64) {
				local85 = this.method597(local3.method747(local52 + 1, local52 + 4));
				if (local85 != -1) {
					arg3 = local85;
				}
				local52 += 4;
			} else {
				local85 = local3.aByteArray9[local52] & 0xFF;
				if (local85 != 32) {
					if (arg4) {
						this.method599(this.aByteArrayArray5[local85], arg1 + 1, local50 + this.anIntArray144[local85] + 1, this.anIntArray143[local85], this.anIntArray145[local85], 0);
					}
					this.method599(this.aByteArrayArray5[local85], arg1, local50 + this.anIntArray144[local85], this.anIntArray143[local85], this.anIntArray145[local85], arg3);
				}
				arg1 += this.anIntArray143[local85];
				if (local85 == 32) {
					local25 += local23;
					arg1 += local25 / 256;
					local25 &= 0xFF;
				}
			}
		}
		if (this.aBoolean39) {
			Static95.method1326(local42, local50 + (int) ((double) this.anInt742 * 0.7D), arg1 - local42, 8388608);
		}
	}
}
