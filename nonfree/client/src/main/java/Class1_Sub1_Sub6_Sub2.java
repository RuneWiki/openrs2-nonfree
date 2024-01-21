import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class1_Sub1_Sub6_Sub2 extends Class1_Sub1_Sub6 {

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
	public int anInt1358 = 0;

	@OriginalMember(owner = "client!he", name = "ib", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[256][];

	@OriginalMember(owner = "client!he", name = "fb", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!he", name = "Fb", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!he", name = "pb", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!he", name = "kb", descriptor = "[I")
	private final int[] anIntArray159;

	@OriginalMember(owner = "client!he", name = "qb", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!he", name = "Cb", descriptor = "I")
	private int anInt1359;

	@OriginalMember(owner = "client!he", name = "Db", descriptor = "I")
	private int anInt1360;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class1_Sub1_Sub6_Sub2(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray160 = arg0;
		this.anIntArray159 = arg1;
		this.anIntArray161 = arg2;
		@Pc(27) byte local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < arg3.length; local29++) {
			if (arg3[local29] == 1) {
				local27 = (byte) local29;
			}
		}
		this.aByteArrayArray2 = arg4;
		@Pc(48) int local48 = Integer.MAX_VALUE;
		@Pc(50) int local50 = Integer.MIN_VALUE;
		for (@Pc(52) int local52 = 0; local52 < 256; local52++) {
			if (this.anIntArray160[local52] < local48) {
				local48 = this.anIntArray160[local52];
			}
			if (this.anIntArray160[local52] + this.anIntArray161[local52] > local50) {
				local50 = this.anIntArray160[local52] + this.anIntArray161[local52];
			}
			@Pc(90) byte[] local90 = this.aByteArrayArray2[local52];
			@Pc(93) int local93 = local90.length;
			for (@Pc(95) int local95 = 0; local95 < local93; local95++) {
				local90[local95] = (byte) (local90[local95] == local27 ? 0 : 1);
			}
		}
		this.anInt1358 = this.anIntArray160[32] + this.anIntArray161[32];
		this.anInt1359 = this.anInt1358 - local48;
		this.anInt1360 = local50 - this.anInt1358;
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub6_Sub2(@OriginalArg(0) byte[] arg0) {
		this.anIntArray159 = new int[arg0.length];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArray159.length; local23++) {
			this.anIntArray159[local23] = arg0[local23] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([I[BIIIIIIII)V")
	private void method828(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gd;)I")
	private int method829(@OriginalArg(0) Class23 arg0) {
		if (arg0.method539(Static38.aClass23_693)) {
			return 16711680;
		} else if (arg0.method539(Static38.aClass23_685)) {
			return 65280;
		} else if (arg0.method539(Static38.aClass23_689)) {
			return 255;
		} else if (arg0.method539(Static38.aClass23_702)) {
			return 16776960;
		} else if (arg0.method539(Static38.aClass23_687)) {
			return 65535;
		} else if (arg0.method539(Static38.aClass23_690)) {
			return 16711935;
		} else if (arg0.method539(Static38.aClass23_695)) {
			return 16777215;
		} else if (arg0.method539(Static38.aClass23_698)) {
			return 0;
		} else if (arg0.method539(Static38.aClass23_691)) {
			return 16748608;
		} else if (arg0.method539(Static38.aClass23_694)) {
			return 8388608;
		} else if (arg0.method539(Static38.aClass23_692)) {
			return 128;
		} else if (arg0.method539(Static38.aClass23_701)) {
			return 16756736;
		} else if (arg0.method539(Static38.aClass23_684)) {
			return 16740352;
		} else if (arg0.method539(Static38.aClass23_700)) {
			return 16723968;
		} else if (arg0.method539(Static38.aClass23_699)) {
			return 12648192;
		} else if (arg0.method539(Static38.aClass23_688)) {
			return 8453888;
		} else if (arg0.method539(Static38.aClass23_697)) {
			return 4259584;
		} else {
			if (arg0.method539(Static38.aClass23_686)) {
				this.aBoolean69 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gd;I)I")
	public int method830(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		return this.method844(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gd;III)V")
	public void method831(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method836(arg0, 507 - this.method850(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!gd;III)V")
	public void method832(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method836(arg0, arg1 - this.method850(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
	public int method833(@OriginalArg(0) int arg0) {
		return this.anIntArray159[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gd;IIIZ)V")
	public void method834(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method841(arg0, arg1 - this.method845(arg0), arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gd;IIIZI)V")
	private void method835(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class23 local3 = arg0.method529();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3.method525(); local7++) {
			if (local3.method519(local7) == 32) {
				local5++;
			}
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		if (local5 > 0) {
			local23 = (arg5 - this.method845(local3)) * 256 / local5;
		}
		this.aBoolean69 = false;
		@Pc(42) int local42 = arg1;
		if (local3 == null) {
			return;
		}
		@Pc(50) int local50 = arg2 - this.anInt1358;
		for (@Pc(52) int local52 = 0; local52 < local3.anInt965; local52++) {
			@Pc(85) int local85;
			if (local3.aByteArray4[local52] == 64 && local52 + 4 < local3.anInt965 && local3.aByteArray4[local52 + 4] == 64) {
				local85 = this.method829(local3.method512(local52 + 1, local52 + 4));
				if (local85 != -1) {
					arg3 = local85;
				}
				local52 += 4;
			} else {
				local85 = local3.aByteArray4[local52] & 0xFF;
				if (local85 != 32) {
					if (arg4) {
						this.method846(this.aByteArrayArray2[local85], arg1 + 1, local50 + this.anIntArray160[local85] + 1, this.anIntArray159[local85], this.anIntArray161[local85], 0);
					}
					this.method846(this.aByteArrayArray2[local85], arg1, local50 + this.anIntArray160[local85], this.anIntArray159[local85], this.anIntArray161[local85], arg3);
				}
				arg1 += this.anIntArray159[local85];
				if (local85 == 32) {
					local25 += local23;
					arg1 += local25 / 256;
					local25 &= 0xFF;
				}
			}
		}
		if (this.aBoolean69) {
			Static24.method1585(local42, local50 + (int) ((double) this.anInt1358 * 0.7D), arg1 - local42, 8388608);
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!gd;III)V")
	public void method836(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt1358;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt965; local9++) {
			@Pc(17) int local17 = arg0.aByteArray4[local9] & 0xFF;
			if (local17 != 32) {
				this.method846(this.aByteArrayArray2[local17], arg1, local7 + this.anIntArray160[local17], this.anIntArray159[local17], this.anIntArray161[local17], arg3);
			}
			arg1 += this.anIntArray159[local17];
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!gd;IIIZI)V")
	public void method837(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt1358;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt965; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray4[local22] == 64 && local22 + 4 < arg0.anInt965 && arg0.aByteArray4[local22 + 4] == 64) {
				local55 = this.method829(arg0.method512(local22 + 1, local22 + 4));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray4[local22] & 0xFF;
				if (local55 != 32) {
					this.method848(this.aByteArrayArray2[local55], arg1 + 1, local20 + this.anIntArray160[local55] + 1, this.anIntArray159[local55], this.anIntArray161[local55], 0, 192);
					this.method848(this.aByteArrayArray2[local55], arg1, local20 + this.anIntArray160[local55], this.anIntArray159[local55], this.anIntArray161[local55], arg2, local15);
				}
				arg1 += this.anIntArray159[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gd;IIII)V")
	public void method838(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method850(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt1358;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt965; local17++) {
			@Pc(25) int local25 = arg0.aByteArray4[local17] & 0xFF;
			if (local25 != 32) {
				this.method846(this.aByteArrayArray2[local25], arg1, local15 + this.anIntArray160[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray159[local25], this.anIntArray161[local25], arg3);
			}
			arg1 += this.anIntArray159[local25];
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!gd;I)I")
	public int method839(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = this.method844(arg0, arg1, true);
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < local5; local9++) {
			@Pc(16) int local16 = this.method850(Static38.aClass23Array12[local9]);
			if (local16 > local7) {
				local7 = local16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method840(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!gd;IIIZ)V")
	public void method841(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean69 = false;
		@Pc(4) int local4 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 - this.anInt1358;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt965; local14++) {
			@Pc(47) int local47;
			if (arg0.aByteArray4[local14] == 64 && local14 + 4 < arg0.anInt965 && arg0.aByteArray4[local14 + 4] == 64) {
				local47 = this.method829(arg0.method512(local14 + 1, local14 + 4));
				if (local47 != -1) {
					arg3 = local47;
				}
				local14 += 4;
			} else {
				local47 = arg0.aByteArray4[local14] & 0xFF;
				if (local47 != 32) {
					if (arg4) {
						this.method846(this.aByteArrayArray2[local47], arg1 + 1, local12 + this.anIntArray160[local47] + 1, this.anIntArray159[local47], this.anIntArray161[local47], 0);
					}
					this.method846(this.aByteArrayArray2[local47], arg1, local12 + this.anIntArray160[local47], this.anIntArray159[local47], this.anIntArray161[local47], arg3);
				}
				arg1 += this.anIntArray159[local47];
			}
		}
		if (this.aBoolean69) {
			Static24.method1585(local4, local12 + (int) ((double) this.anInt1358 * 0.7D), arg1 - local4, 8388608);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!gd;IIII)V")
	public void method842(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method850(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt1358;
		for (@Pc(17) int local17 = 0; local17 < arg0.method525(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray4[local17] & 0xFF;
			if (local25 != 32) {
				this.method846(this.aByteArrayArray2[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray160[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray159[local25], this.anIntArray161[local25], arg3);
			}
			arg1 += this.anIntArray159[local25];
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gd;IIIII)V")
	public void method843(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method850(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt1358;
		for (@Pc(30) int local30 = 0; local30 < arg0.method525(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray4[local30] & 0xFF;
			if (local38 != 32) {
				this.method846(this.aByteArrayArray2[local38], arg1, local28 + this.anIntArray160[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray159[local38], this.anIntArray161[local38], arg3);
			}
			arg1 += this.anIntArray159[local38];
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gd;IZ)I")
	private int method844(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) Class23 local7 = Static40.method866();
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) Class23 local13 = null;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method525();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method519(local27);
			if (local33 == 64 && local27 + 4 < local25 && arg0.method519(local27 + 4) == 64) {
				@Pc(57) Class23 local57 = arg0.method512(local27, local27 + 5);
				if (local57.method539(Static38.aClass23_686)) {
					local17 = true;
					local19 = local7.method525();
				} else {
					local13 = local57;
					local15 = local7.method525();
				}
				local7.method518(local57);
				local27 += 4;
			} else if (local33 == 92 && local27 + 1 < local25 && arg0.method519(local27 + 1) == 110) {
				Static38.aClass23Array12[local21++] = local7.method512(local3, local7.method525()).method529();
				local3 = local7.method525();
				local1 = 0;
				local9 = -1;
				local27++;
				local13 = null;
				local17 = false;
			} else {
				local7.method534(local33);
				local1 += this.method833(local33);
				if (local33 == 32 || local33 == 45) {
					local9 = local7.method525();
					local11 = local1;
				}
				if (arg2 && local1 > arg1 && local9 >= 0) {
					Static38.aClass23Array12[local21++] = local7.method512(local3, local9).method529();
					local3 = local9;
					local9 = -1;
					local1 -= local11;
					if (local13 != null && local15 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method542(local3, local13);
					}
					if (local17 && local19 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method542(local3, Static38.aClass23_696);
					}
				}
			}
		}
		if (local7.method525() > local3) {
			Static38.aClass23Array12[local21++] = local7.method512(local3, local7.method525()).method529();
		}
		return local21;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!gd;)I")
	public int method845(@OriginalArg(0) Class23 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt965; local7++) {
			if (arg0.aByteArray4[local7] == 64 && local7 + 4 < arg0.anInt965 && arg0.aByteArray4[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray159[arg0.aByteArray4[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([BIIIII)V")
	private void method846(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static24.anInt2465;
		@Pc(9) int local9 = Static24.anInt2465 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static24.anInt2466) {
			local20 = Static24.anInt2466 - arg2;
			arg4 -= local20;
			arg2 = Static24.anInt2466;
			local13 = local20 * arg3;
			local5 += local20 * Static24.anInt2465;
		}
		if (arg2 + arg4 > Static24.anInt2467) {
			arg4 -= arg2 + arg4 - Static24.anInt2467;
		}
		if (arg1 < Static24.anInt2468) {
			local20 = Static24.anInt2468 - arg1;
			arg3 -= local20;
			arg1 = Static24.anInt2468;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static24.anInt2464) {
			local20 = arg1 + arg3 - Static24.anInt2464;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method840(Static24.anIntArray333, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!gd;IIIZ)V")
	public void method847(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method841(arg0, arg1 - this.method845(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([BIIIIII)V")
	private void method848(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static24.anInt2465;
		@Pc(9) int local9 = Static24.anInt2465 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static24.anInt2466) {
			local20 = Static24.anInt2466 - arg2;
			arg4 -= local20;
			arg2 = Static24.anInt2466;
			local13 = local20 * arg3;
			local5 += local20 * Static24.anInt2465;
		}
		if (arg2 + arg4 > Static24.anInt2467) {
			arg4 -= arg2 + arg4 - Static24.anInt2467;
		}
		if (arg1 < Static24.anInt2468) {
			local20 = Static24.anInt2468 - arg1;
			arg3 -= local20;
			arg1 = Static24.anInt2468;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static24.anInt2464) {
			local20 = arg1 + arg3 - Static24.anInt2464;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method828(Static24.anIntArray333, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gd;IIIIIZIII)V")
	public void method849(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg9 == 0) {
			arg9 = this.anInt1359;
		}
		@Pc(9) boolean local9 = true;
		if (arg4 < this.anInt1359 + this.anInt1360 + arg9 && arg4 < arg9 + arg9) {
			local9 = false;
		}
		@Pc(31) int local31 = this.method844(arg0, arg3, local9);
		if (arg8 == 3 && local31 == 1) {
			arg8 = 1;
		}
		@Pc(46) int local46;
		@Pc(107) int local107;
		if (arg8 == 0) {
			local46 = arg2 + this.anInt1359;
		} else if (arg8 == 1) {
			local46 = arg2 + this.anInt1359 + (arg4 - this.anInt1359 - this.anInt1360 - (local31 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local46 = arg2 + arg4 - this.anInt1360 - (local31 - 1) * arg9;
		} else {
			local107 = (arg4 - this.anInt1359 - this.anInt1360 - (local31 - 1) * arg9) / (local31 + 1);
			if (local107 < 0) {
				local107 = 0;
			}
			local46 = arg2 + this.anInt1359 + local107;
			arg9 += local107;
		}
		for (local107 = 0; local107 < local31; local107++) {
			if (arg7 == 0) {
				this.method841(Static38.aClass23Array12[local107], arg1, local46, arg5, arg6);
			} else if (arg7 == 1) {
				this.method847(Static38.aClass23Array12[local107], arg1 + arg3 / 2, local46, arg5, arg6);
			} else if (arg7 == 2) {
				this.method834(Static38.aClass23Array12[local107], arg1 + arg3, local46, arg5, arg6);
			} else if (local107 == local31 - 1) {
				this.method841(Static38.aClass23Array12[local107], arg1, local46, arg5, arg6);
			} else {
				this.method835(Static38.aClass23Array12[local107], arg1, local46, arg5, arg6, arg3);
			}
			local46 += arg9;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!gd;)I")
	public int method850(@OriginalArg(0) Class23 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt965; local7++) {
			local5 += this.anIntArray159[arg0.aByteArray4[local7] & 0xFF];
		}
		return local5;
	}
}
