import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class2_Sub1_Sub3_Sub3 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
	public int anInt1392 = 0;

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray7 = new byte[256][];

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!hc", name = "zb", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!hc", name = "yb", descriptor = "[I")
	private final int[] anIntArray220;

	@OriginalMember(owner = "client!hc", name = "ob", descriptor = "[I")
	private final int[] anIntArray219;

	@OriginalMember(owner = "client!hc", name = "bb", descriptor = "[I")
	private final int[] anIntArray218;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class2_Sub1_Sub3_Sub3(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray220 = arg0;
		this.anIntArray219 = arg1;
		this.anIntArray218 = arg2;
		@Pc(27) byte local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < arg3.length; local29++) {
			if (arg3[local29] == 1) {
				local27 = (byte) local29;
			}
		}
		this.aByteArrayArray7 = arg4;
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			@Pc(54) byte[] local54 = this.aByteArrayArray7[local48];
			@Pc(57) int local57 = local54.length;
			for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
				local54[local59] = (byte) (local54[local59] == local27 ? 0 : 1);
			}
		}
		this.anInt1392 = this.anIntArray220[32] + this.anIntArray218[32];
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!lc;)I")
	private int method951(@OriginalArg(0) Class31 arg0) {
		if (arg0.method1199(Static36.aClass31_481)) {
			return 16711680;
		} else if (arg0.method1199(Static36.aClass31_490)) {
			return 65280;
		} else if (arg0.method1199(Static36.aClass31_493)) {
			return 255;
		} else if (arg0.method1199(Static36.aClass31_484)) {
			return 16776960;
		} else if (arg0.method1199(Static36.aClass31_494)) {
			return 65535;
		} else if (arg0.method1199(Static36.aClass31_485)) {
			return 16711935;
		} else if (arg0.method1199(Static36.aClass31_486)) {
			return 16777215;
		} else if (arg0.method1199(Static36.aClass31_489)) {
			return 0;
		} else if (arg0.method1199(Static36.aClass31_483)) {
			return 16748608;
		} else if (arg0.method1199(Static36.aClass31_479)) {
			return 8388608;
		} else if (arg0.method1199(Static36.aClass31_478)) {
			return 128;
		} else if (arg0.method1199(Static36.aClass31_488)) {
			return 16756736;
		} else if (arg0.method1199(Static36.aClass31_487)) {
			return 16740352;
		} else if (arg0.method1199(Static36.aClass31_491)) {
			return 16723968;
		} else if (arg0.method1199(Static36.aClass31_492)) {
			return 12648192;
		} else if (arg0.method1199(Static36.aClass31_480)) {
			return 8453888;
		} else if (arg0.method1199(Static36.aClass31_482)) {
			return 4259584;
		} else {
			if (arg0.method1199(Static36.aClass31_477)) {
				this.aBoolean77 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!lc;III)V")
	public void method952(@OriginalArg(0) Class31 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method954(arg0, 507 - this.method961(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!lc;IIII)V")
	public void method953(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method961(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt1392;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt1901; local17++) {
			@Pc(25) int local25 = arg0.aByteArray17[local17] & 0xFF;
			if (local25 != 32) {
				this.method957(this.aByteArrayArray7[local25], arg1, local15 + this.anIntArray220[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray219[local25], this.anIntArray218[local25], arg3);
			}
			arg1 += this.anIntArray219[local25];
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Lclient!lc;III)V")
	public void method954(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt1392;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt1901; local9++) {
			@Pc(17) int local17 = arg0.aByteArray17[local9] & 0xFF;
			if (local17 != 32) {
				this.method957(this.aByteArrayArray7[local17], arg1, local7 + this.anIntArray220[local17], this.anIntArray219[local17], this.anIntArray218[local17], arg3);
			}
			arg1 += this.anIntArray219[local17];
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!lc;IIIZI)V")
	public void method955(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt1392;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt1901; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray17[local22] == 64 && local22 + 4 < arg0.anInt1901 && arg0.aByteArray17[local22 + 4] == 64) {
				local55 = this.method951(arg0.method1213(local22 + 4, local22 + 1));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray17[local22] & 0xFF;
				if (local55 != 32) {
					this.method956(this.aByteArrayArray7[local55], arg1 + 1, local20 + this.anIntArray220[local55] + 1, this.anIntArray219[local55], this.anIntArray218[local55], 0, 192);
					this.method956(this.aByteArrayArray7[local55], arg1, local20 + this.anIntArray220[local55], this.anIntArray219[local55], this.anIntArray218[local55], arg2, local15);
				}
				arg1 += this.anIntArray219[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIIIII)V")
	private void method956(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static81.anInt2634;
		@Pc(9) int local9 = Static81.anInt2634 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static81.anInt2632) {
			local20 = Static81.anInt2632 - arg2;
			arg4 -= local20;
			arg2 = Static81.anInt2632;
			local13 = local20 * arg3;
			local5 += local20 * Static81.anInt2634;
		}
		if (arg2 + arg4 > Static81.anInt2633) {
			arg4 -= arg2 + arg4 - Static81.anInt2633;
		}
		if (arg1 < Static81.anInt2635) {
			local20 = Static81.anInt2635 - arg1;
			arg3 -= local20;
			arg1 = Static81.anInt2635;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static81.anInt2637) {
			local20 = arg1 + arg3 - Static81.anInt2637;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method966(Static81.anIntArray373, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIIII)V")
	private void method957(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static81.anInt2634;
		@Pc(9) int local9 = Static81.anInt2634 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static81.anInt2632) {
			local20 = Static81.anInt2632 - arg2;
			arg4 -= local20;
			arg2 = Static81.anInt2632;
			local13 = local20 * arg3;
			local5 += local20 * Static81.anInt2634;
		}
		if (arg2 + arg4 > Static81.anInt2633) {
			arg4 -= arg2 + arg4 - Static81.anInt2633;
		}
		if (arg1 < Static81.anInt2635) {
			local20 = Static81.anInt2635 - arg1;
			arg3 -= local20;
			arg1 = Static81.anInt2635;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static81.anInt2637) {
			local20 = arg1 + arg3 - Static81.anInt2637;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method958(Static81.anIntArray373, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method958(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!lc;IIIZ)V")
	public void method959(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean77 = false;
		@Pc(4) int local4 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 - this.anInt1392;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt1901; local14++) {
			@Pc(47) int local47;
			if (arg0.aByteArray17[local14] == 64 && local14 + 4 < arg0.anInt1901 && arg0.aByteArray17[local14 + 4] == 64) {
				local47 = this.method951(arg0.method1213(local14 + 4, local14 + 1));
				if (local47 != -1) {
					arg3 = local47;
				}
				local14 += 4;
			} else {
				local47 = arg0.aByteArray17[local14] & 0xFF;
				if (local47 != 32) {
					if (arg4) {
						this.method957(this.aByteArrayArray7[local47], arg1 + 1, local12 + this.anIntArray220[local47] + 1, this.anIntArray219[local47], this.anIntArray218[local47], 0);
					}
					this.method957(this.aByteArrayArray7[local47], arg1, local12 + this.anIntArray220[local47], this.anIntArray219[local47], this.anIntArray218[local47], arg3);
				}
				arg1 += this.anIntArray219[local47];
			}
		}
		if (this.aBoolean77) {
			Static81.method1643(local4, local12 + (int) ((double) this.anInt1392 * 0.7D), arg1 - local4, 8388608);
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Lclient!lc;)I")
	public int method961(@OriginalArg(0) Class31 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt1901; local7++) {
			local5 += this.anIntArray219[arg0.aByteArray17[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(Lclient!lc;III)V")
	public void method962(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method954(arg0, arg1 - this.method961(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Lclient!lc;IIII)V")
	public void method963(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method961(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt1392;
		for (@Pc(17) int local17 = 0; local17 < arg0.method1223(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray17[local17] & 0xFF;
			if (local25 != 32) {
				this.method957(this.aByteArrayArray7[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray220[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray219[local25], this.anIntArray218[local25], arg3);
			}
			arg1 += this.anIntArray219[local25];
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Lclient!lc;IIIZ)V")
	public void method964(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method959(arg0, arg1 - this.method967(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!lc;IIIII)V")
	public void method965(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method961(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt1392;
		for (@Pc(30) int local30 = 0; local30 < arg0.method1223(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray17[local30] & 0xFF;
			if (local38 != 32) {
				this.method957(this.aByteArrayArray7[local38], arg1, local28 + this.anIntArray220[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray219[local38], this.anIntArray218[local38], arg3);
			}
			arg1 += this.anIntArray219[local38];
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([I[BIIIIIIII)V")
	private void method966(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(Lclient!lc;)I")
	public int method967(@OriginalArg(0) Class31 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt1901; local7++) {
			if (arg0.aByteArray17[local7] == 64 && local7 + 4 < arg0.anInt1901 && arg0.aByteArray17[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray219[arg0.aByteArray17[local7] & 0xFF];
			}
		}
		return local5;
	}
}
