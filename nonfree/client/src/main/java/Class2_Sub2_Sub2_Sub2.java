import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class2_Sub2_Sub2_Sub2 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!fc", name = "nb", descriptor = "I")
	public int anInt715 = 0;

	@OriginalMember(owner = "client!fc", name = "mb", descriptor = "[[B")
	private byte[][] aByteArrayArray7 = new byte[256][];

	@OriginalMember(owner = "client!fc", name = "ib", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!fc", name = "tb", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!fc", name = "Y", descriptor = "[I")
	private final int[] anIntArray139;

	@OriginalMember(owner = "client!fc", name = "sb", descriptor = "[I")
	private final int[] anIntArray141;

	@OriginalMember(owner = "client!fc", name = "eb", descriptor = "[I")
	private final int[] anIntArray140;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class2_Sub2_Sub2_Sub2(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray139 = arg0;
		this.anIntArray141 = arg1;
		this.anIntArray140 = arg2;
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
		this.anInt715 = this.anIntArray139[32] + this.anIntArray140[32];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;IIII)V")
	public void method564(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method568(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt715;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt1783; local17++) {
			@Pc(25) int local25 = arg0.aByteArray14[local17] & 0xFF;
			if (local25 != 32) {
				this.method569(this.aByteArrayArray7[local25], arg1, local15 + this.anIntArray139[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray141[local25], this.anIntArray140[local25], arg3);
			}
			arg1 += this.anIntArray141[local25];
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method565(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;III)V")
	public void method566(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method575(arg0, arg1 - this.method568(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([I[BIIIIIIII)V")
	private void method567(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;)I")
	public int method568(@OriginalArg(0) Class40 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt1783; local7++) {
			local5 += this.anIntArray141[arg0.aByteArray14[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIIIII)V")
	private void method569(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static26.anInt2440;
		@Pc(9) int local9 = Static26.anInt2440 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static26.anInt2439) {
			local20 = Static26.anInt2439 - arg2;
			arg4 -= local20;
			arg2 = Static26.anInt2439;
			local13 = local20 * arg3;
			local5 += local20 * Static26.anInt2440;
		}
		if (arg2 + arg4 > Static26.anInt2438) {
			arg4 -= arg2 + arg4 - Static26.anInt2438;
		}
		if (arg1 < Static26.anInt2437) {
			local20 = Static26.anInt2437 - arg1;
			arg3 -= local20;
			arg1 = Static26.anInt2437;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static26.anInt2436) {
			local20 = arg1 + arg3 - Static26.anInt2436;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method565(Static26.anIntArray533, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!o;IIII)V")
	public void method570(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method568(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt715;
		for (@Pc(17) int local17 = 0; local17 < arg0.method1169(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray14[local17] & 0xFF;
			if (local25 != 32) {
				this.method569(this.aByteArrayArray7[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray139[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray141[local25], this.anIntArray140[local25], arg3);
			}
			arg1 += this.anIntArray141[local25];
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!o;III)V")
	public void method572(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method575(arg0, 507 - this.method568(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIIIIII)V")
	private void method573(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static26.anInt2440;
		@Pc(9) int local9 = Static26.anInt2440 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static26.anInt2439) {
			local20 = Static26.anInt2439 - arg2;
			arg4 -= local20;
			arg2 = Static26.anInt2439;
			local13 = local20 * arg3;
			local5 += local20 * Static26.anInt2440;
		}
		if (arg2 + arg4 > Static26.anInt2438) {
			arg4 -= arg2 + arg4 - Static26.anInt2438;
		}
		if (arg1 < Static26.anInt2437) {
			local20 = Static26.anInt2437 - arg1;
			arg3 -= local20;
			arg1 = Static26.anInt2437;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static26.anInt2436) {
			local20 = arg1 + arg3 - Static26.anInt2436;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method567(Static26.anIntArray533, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;IIIZ)V")
	public void method574(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean53 = false;
		@Pc(4) int local4 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 - this.anInt715;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt1783; local14++) {
			@Pc(47) int local47;
			if (arg0.aByteArray14[local14] == 64 && local14 + 4 < arg0.anInt1783 && arg0.aByteArray14[local14 + 4] == 64) {
				local47 = this.method579(arg0.method1180(local14 + 4, local14 + 1));
				if (local47 != -1) {
					arg3 = local47;
				}
				local14 += 4;
			} else {
				local47 = arg0.aByteArray14[local14] & 0xFF;
				if (local47 != 32) {
					if (arg4) {
						this.method569(this.aByteArrayArray7[local47], arg1 + 1, local12 + this.anIntArray139[local47] + 1, this.anIntArray141[local47], this.anIntArray140[local47], 0);
					}
					this.method569(this.aByteArrayArray7[local47], arg1, local12 + this.anIntArray139[local47], this.anIntArray141[local47], this.anIntArray140[local47], arg3);
				}
				arg1 += this.anIntArray141[local47];
			}
		}
		if (this.aBoolean53) {
			Static26.method1603(local4, local12 + (int) ((double) this.anInt715 * 0.7D), arg1 - local4, 8388608);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lclient!o;III)V")
	public void method575(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt715;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt1783; local9++) {
			@Pc(17) int local17 = arg0.aByteArray14[local9] & 0xFF;
			if (local17 != 32) {
				this.method569(this.aByteArrayArray7[local17], arg1, local7 + this.anIntArray139[local17], this.anIntArray141[local17], this.anIntArray140[local17], arg3);
			}
			arg1 += this.anIntArray141[local17];
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!o;)I")
	public int method576(@OriginalArg(0) Class40 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt1783; local7++) {
			if (arg0.aByteArray14[local7] == 64 && local7 + 4 < arg0.anInt1783 && arg0.aByteArray14[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray141[arg0.aByteArray14[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;IIIII)V")
	public void method577(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method568(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt715;
		for (@Pc(30) int local30 = 0; local30 < arg0.method1169(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray14[local30] & 0xFF;
			if (local38 != 32) {
				this.method569(this.aByteArrayArray7[local38], arg1, local28 + this.anIntArray139[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray141[local38], this.anIntArray140[local38], arg3);
			}
			arg1 += this.anIntArray141[local38];
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!o;IIIZ)V")
	public void method578(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method574(arg0, arg1 - this.method576(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lclient!o;)I")
	private int method579(@OriginalArg(0) Class40 arg0) {
		if (arg0.method1184(Static28.aClass40_208)) {
			return 16711680;
		} else if (arg0.method1184(Static28.aClass40_201)) {
			return 65280;
		} else if (arg0.method1184(Static28.aClass40_211)) {
			return 255;
		} else if (arg0.method1184(Static28.aClass40_202)) {
			return 16776960;
		} else if (arg0.method1184(Static28.aClass40_207)) {
			return 65535;
		} else if (arg0.method1184(Static28.aClass40_209)) {
			return 16711935;
		} else if (arg0.method1184(Static28.aClass40_217)) {
			return 16777215;
		} else if (arg0.method1184(Static28.aClass40_214)) {
			return 0;
		} else if (arg0.method1184(Static28.aClass40_212)) {
			return 16748608;
		} else if (arg0.method1184(Static28.aClass40_203)) {
			return 8388608;
		} else if (arg0.method1184(Static28.aClass40_215)) {
			return 128;
		} else if (arg0.method1184(Static28.aClass40_213)) {
			return 16756736;
		} else if (arg0.method1184(Static28.aClass40_205)) {
			return 16740352;
		} else if (arg0.method1184(Static28.aClass40_206)) {
			return 16723968;
		} else if (arg0.method1184(Static28.aClass40_216)) {
			return 12648192;
		} else if (arg0.method1184(Static28.aClass40_204)) {
			return 8453888;
		} else if (arg0.method1184(Static28.aClass40_210)) {
			return 4259584;
		} else {
			if (arg0.method1184(Static28.aClass40_200)) {
				this.aBoolean53 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;IIIZI)V")
	public void method580(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt715;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt1783; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray14[local22] == 64 && local22 + 4 < arg0.anInt1783 && arg0.aByteArray14[local22 + 4] == 64) {
				local55 = this.method579(arg0.method1180(local22 + 4, local22 + 1));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray14[local22] & 0xFF;
				if (local55 != 32) {
					this.method573(this.aByteArrayArray7[local55], arg1 + 1, local20 + this.anIntArray139[local55] + 1, this.anIntArray141[local55], this.anIntArray140[local55], 0, 192);
					this.method573(this.aByteArrayArray7[local55], arg1, local20 + this.anIntArray139[local55], this.anIntArray141[local55], this.anIntArray140[local55], arg2, local15);
				}
				arg1 += this.anIntArray141[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}
}
