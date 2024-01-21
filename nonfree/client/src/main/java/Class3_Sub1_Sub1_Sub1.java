import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class3_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
	public int anInt1057 = 0;

	@OriginalMember(owner = "client!gb", name = "vb", descriptor = "[[B")
	private byte[][] aByteArrayArray6 = new byte[256][];

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gb", name = "Bb", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!gb", name = "tb", descriptor = "[I")
	private final int[] anIntArray67;

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!gb", name = "Fb", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!gb", name = "Gb", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class3_Sub1_Sub1_Sub1(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray68 = arg0;
		this.anIntArray67 = arg1;
		this.anIntArray66 = arg2;
		@Pc(24) byte local24 = 0;
		for (@Pc(26) int local26 = 1; local26 < arg3.length; local26++) {
			if (arg3[local26] == 1) {
				local24 = (byte) local26;
			}
		}
		this.aByteArrayArray6 = arg4;
		@Pc(45) int local45 = Integer.MAX_VALUE;
		@Pc(47) int local47 = Integer.MIN_VALUE;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			if (this.anIntArray68[local49] < local45 && this.anIntArray66[local49] != 0) {
				local45 = this.anIntArray68[local49];
			}
			if (this.anIntArray68[local49] + this.anIntArray66[local49] > local47) {
				local47 = this.anIntArray68[local49] + this.anIntArray66[local49];
			}
			@Pc(92) byte[] local92 = this.aByteArrayArray6[local49];
			@Pc(95) int local95 = local92.length;
			for (@Pc(97) int local97 = 0; local97 < local95; local97++) {
				local92[local97] = (byte) (local92[local97] == local24 ? 0 : 1);
			}
		}
		this.anInt1057 = this.anIntArray68[32] + this.anIntArray66[32];
		this.anInt1058 = this.anInt1057 - local45;
		this.anInt1059 = local47 - this.anInt1057;
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		this.anIntArray67 = new int[arg0.length];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray67.length; local20++) {
			this.anIntArray67[local20] = arg0[local20] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oa;IIIZ)V")
	public void method728(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method733(arg0, arg1 - this.method731(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!oa;IIIZ)V")
	public void method729(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method733(arg0, arg1 - this.method731(arg0), arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oa;III)V")
	public void method730(@OriginalArg(0) Class56 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method738(arg0, 507 - this.method745(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oa;)I")
	public int method731(@OriginalArg(0) Class56 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2171; local7++) {
			if (arg0.aByteArray29[local7] == 64 && local7 + 4 < arg0.anInt2171 && arg0.aByteArray29[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray67[arg0.aByteArray29[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lclient!oa;IIIZ)V")
	public void method733(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		Static39.aBoolean51 = false;
		@Pc(3) int local3 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 - this.anInt1057;
		for (@Pc(13) int local13 = 0; local13 < arg0.anInt2171; local13++) {
			@Pc(46) int local46;
			if (arg0.aByteArray29[local13] == 64 && local13 + 4 < arg0.anInt2171 && arg0.aByteArray29[local13 + 4] == 64) {
				local46 = this.method748(arg0.method1451(local13 + 4, local13 + 1));
				if (local46 != -1) {
					arg3 = local46;
				}
				local13 += 4;
			} else {
				local46 = arg0.aByteArray29[local13] & 0xFF;
				if (local46 != 32) {
					if (arg4) {
						Static39.method732(this.aByteArrayArray6[local46], arg1 + 1, local11 + this.anIntArray68[local46] + 1, this.anIntArray67[local46], this.anIntArray66[local46], 0);
					}
					Static39.method732(this.aByteArrayArray6[local46], arg1, local11 + this.anIntArray68[local46], this.anIntArray67[local46], this.anIntArray66[local46], arg3);
				}
				arg1 += this.anIntArray67[local46];
			}
		}
		if (Static39.aBoolean51) {
			Static6.method1489(local3, local11 + (int) ((double) this.anInt1057 * 0.7D), arg1 - local3, 8388608);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oa;IIIIIZIII)V")
	public void method734(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg9 == 0) {
			arg9 = this.anInt1057;
		}
		@Pc(9) boolean local9 = true;
		if (arg4 < this.anInt1058 + this.anInt1059 + arg9 && arg4 < arg9 + arg9) {
			local9 = false;
		}
		@Pc(31) int local31 = this.method741(arg0, arg3, local9);
		if (arg8 == 3 && local31 == 1) {
			arg8 = 1;
		}
		@Pc(46) int local46;
		@Pc(107) int local107;
		if (arg8 == 0) {
			local46 = arg2 + this.anInt1058;
		} else if (arg8 == 1) {
			local46 = arg2 + this.anInt1058 + (arg4 - this.anInt1058 - this.anInt1059 - (local31 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local46 = arg2 + arg4 - this.anInt1059 - (local31 - 1) * arg9;
		} else {
			local107 = (arg4 - this.anInt1058 - this.anInt1059 - (local31 - 1) * arg9) / (local31 + 1);
			if (local107 < 0) {
				local107 = 0;
			}
			local46 = arg2 + this.anInt1058 + local107;
			arg9 += local107;
		}
		for (local107 = 0; local107 < local31; local107++) {
			if (arg7 == 0) {
				this.method733(Static39.aClass56Array3[local107], arg1, local46, arg5, arg6);
			} else if (arg7 == 1) {
				this.method728(Static39.aClass56Array3[local107], arg1 + arg3 / 2, local46, arg5, arg6);
			} else if (arg7 == 2) {
				this.method729(Static39.aClass56Array3[local107], arg1 + arg3, local46, arg5, arg6);
			} else if (local107 == local31 - 1) {
				this.method733(Static39.aClass56Array3[local107], arg1, local46, arg5, arg6);
			} else {
				this.method742(Static39.aClass56Array3[local107], arg1, local46, arg5, arg6, arg3);
			}
			local46 += arg9;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!oa;III)V")
	public void method735(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method738(arg0, arg1 - this.method745(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oa;IIII)V")
	public void method736(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method745(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt1057;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2171; local17++) {
			@Pc(25) int local25 = arg0.aByteArray29[local17] & 0xFF;
			if (local25 != 32) {
				Static39.method732(this.aByteArrayArray6[local25], arg1, local15 + this.anIntArray68[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray67[local25], this.anIntArray66[local25], arg3);
			}
			arg1 += this.anIntArray67[local25];
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!oa;IIII)V")
	public void method737(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method745(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt1057;
		for (@Pc(17) int local17 = 0; local17 < arg0.method1426(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray29[local17] & 0xFF;
			if (local25 != 32) {
				Static39.method732(this.aByteArrayArray6[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray68[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray67[local25], this.anIntArray66[local25], arg3);
			}
			arg1 += this.anIntArray67[local25];
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lclient!oa;III)V")
	public void method738(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt1057;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt2171; local9++) {
			@Pc(17) int local17 = arg0.aByteArray29[local9] & 0xFF;
			if (local17 != 32) {
				Static39.method732(this.aByteArrayArray6[local17], arg1, local7 + this.anIntArray68[local17], this.anIntArray67[local17], this.anIntArray66[local17], arg3);
			}
			arg1 += this.anIntArray67[local17];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oa;I)I")
	public int method739(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1) {
		return this.method741(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oa;IIIII)V")
	public void method740(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method745(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt1057;
		for (@Pc(30) int local30 = 0; local30 < arg0.method1426(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray29[local30] & 0xFF;
			if (local38 != 32) {
				Static39.method732(this.aByteArrayArray6[local38], arg1, local28 + this.anIntArray68[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray67[local38], this.anIntArray66[local38], arg3);
			}
			arg1 += this.anIntArray67[local38];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oa;IZ)I")
	private int method741(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) Class56 local7 = Static73.method1333();
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) Class56 local13 = null;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method1426();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method1449(local27);
			if (local33 == 64 && local27 + 4 < local25 && arg0.method1449(local27 + 4) == 64) {
				@Pc(57) Class56 local57 = arg0.method1451(local27 + 5, local27);
				if (local57.method1437(Static39.aClass56_602)) {
					local17 = true;
					local19 = local7.method1426();
				} else {
					local13 = local57;
					local15 = local7.method1426();
				}
				local7.method1434(local57);
				local27 += 4;
			} else if (local33 == 92 && local27 + 1 < local25 && arg0.method1449(local27 + 1) == 110) {
				Static39.aClass56Array3[local21++] = local7.method1451(local7.method1426(), local3).method1425();
				local3 = local7.method1426();
				local1 = 0;
				local9 = -1;
				local27++;
				local13 = null;
				local17 = false;
			} else {
				local7.method1415(local33);
				local1 += this.method743(local33);
				if (local33 == 32 || local33 == 45) {
					local9 = local7.method1426();
					local11 = local1;
				}
				if (arg2 && local1 > arg1 && local9 >= 0) {
					Static39.aClass56Array3[local21++] = local7.method1451(local9, local3).method1425();
					local3 = local9;
					local9 = -1;
					local1 -= local11;
					if (local13 != null && local15 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1436(local13, local3);
					}
					if (local17 && local19 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1436(Static39.aClass56_614, local3);
					}
				}
			}
		}
		if (local7.method1426() > local3) {
			Static39.aClass56Array3[local21++] = local7.method1451(local7.method1426(), local3).method1425();
		}
		return local21;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oa;IIIZI)V")
	private void method742(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class56 local3 = arg0.method1425();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3.method1426(); local7++) {
			if (local3.method1449(local7) == 32) {
				local5++;
			}
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		if (local5 > 0) {
			local23 = (arg5 - this.method731(local3)) * 256 / local5;
		}
		Static39.aBoolean51 = false;
		@Pc(41) int local41 = arg1;
		if (local3 == null) {
			return;
		}
		@Pc(49) int local49 = arg2 - this.anInt1057;
		for (@Pc(51) int local51 = 0; local51 < local3.anInt2171; local51++) {
			@Pc(84) int local84;
			if (local3.aByteArray29[local51] == 64 && local51 + 4 < local3.anInt2171 && local3.aByteArray29[local51 + 4] == 64) {
				local84 = this.method748(local3.method1451(local51 + 4, local51 + 1));
				if (local84 != -1) {
					arg3 = local84;
				}
				local51 += 4;
			} else {
				local84 = local3.aByteArray29[local51] & 0xFF;
				if (local84 != 32) {
					if (arg4) {
						Static39.method732(this.aByteArrayArray6[local84], arg1 + 1, local49 + this.anIntArray68[local84] + 1, this.anIntArray67[local84], this.anIntArray66[local84], 0);
					}
					Static39.method732(this.aByteArrayArray6[local84], arg1, local49 + this.anIntArray68[local84], this.anIntArray67[local84], this.anIntArray66[local84], arg3);
				}
				arg1 += this.anIntArray67[local84];
				if (local84 == 32) {
					local25 += local23;
					arg1 += local25 / 256;
					local25 &= 0xFF;
				}
			}
		}
		if (Static39.aBoolean51) {
			Static6.method1489(local41, local49 + (int) ((double) this.anInt1057 * 0.7D), arg1 - local41, 8388608);
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)I")
	public int method743(@OriginalArg(0) int arg0) {
		return this.anIntArray67[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!oa;)I")
	public int method745(@OriginalArg(0) Class56 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2171; local7++) {
			local5 += this.anIntArray67[arg0.aByteArray29[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!oa;IIIZI)V")
	public void method746(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt1057;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt2171; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray29[local22] == 64 && local22 + 4 < arg0.anInt2171 && arg0.aByteArray29[local22 + 4] == 64) {
				local55 = this.method748(arg0.method1451(local22 + 4, local22 + 1));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray29[local22] & 0xFF;
				if (local55 != 32) {
					Static39.method726(this.aByteArrayArray6[local55], arg1 + 1, local20 + this.anIntArray68[local55] + 1, this.anIntArray67[local55], this.anIntArray66[local55], 0, 192);
					Static39.method726(this.aByteArrayArray6[local55], arg1, local20 + this.anIntArray68[local55], this.anIntArray67[local55], this.anIntArray66[local55], arg2, local15);
				}
				arg1 += this.anIntArray67[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lclient!oa;)I")
	private int method748(@OriginalArg(0) Class56 arg0) {
		if (arg0.method1437(Static39.aClass56_608)) {
			return 16711680;
		} else if (arg0.method1437(Static39.aClass56_609)) {
			return 65280;
		} else if (arg0.method1437(Static39.aClass56_610)) {
			return 255;
		} else if (arg0.method1437(Static39.aClass56_599)) {
			return 16776960;
		} else if (arg0.method1437(Static39.aClass56_611)) {
			return 65535;
		} else if (arg0.method1437(Static39.aClass56_601)) {
			return 16711935;
		} else if (arg0.method1437(Static39.aClass56_612)) {
			return 16777215;
		} else if (arg0.method1437(Static39.aClass56_596)) {
			return 0;
		} else if (arg0.method1437(Static39.aClass56_600)) {
			return 16748608;
		} else if (arg0.method1437(Static39.aClass56_607)) {
			return 8388608;
		} else if (arg0.method1437(Static39.aClass56_597)) {
			return 128;
		} else if (arg0.method1437(Static39.aClass56_604)) {
			return 16756736;
		} else if (arg0.method1437(Static39.aClass56_603)) {
			return 16740352;
		} else if (arg0.method1437(Static39.aClass56_613)) {
			return 16723968;
		} else if (arg0.method1437(Static39.aClass56_598)) {
			return 12648192;
		} else if (arg0.method1437(Static39.aClass56_606)) {
			return 8453888;
		} else if (arg0.method1437(Static39.aClass56_605)) {
			return 4259584;
		} else {
			if (arg0.method1437(Static39.aClass56_602)) {
				Static39.aBoolean51 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!oa;I)I")
	public int method749(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = this.method741(arg0, arg1, true);
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < local5; local9++) {
			@Pc(16) int local16 = this.method745(Static39.aClass56Array3[local9]);
			if (local16 > local7) {
				local7 = local16;
			}
		}
		return local7;
	}
}
