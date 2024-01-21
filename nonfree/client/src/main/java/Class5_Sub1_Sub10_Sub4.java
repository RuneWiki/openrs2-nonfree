import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class5_Sub1_Sub10_Sub4 extends Class5_Sub1_Sub10 {

	@OriginalMember(owner = "client!we", name = "ub", descriptor = "[[B")
	private byte[][] aByteArrayArray11 = new byte[256][];

	@OriginalMember(owner = "client!we", name = "mb", descriptor = "I")
	public int anInt3022 = 0;

	@OriginalMember(owner = "client!we", name = "db", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!we", name = "hb", descriptor = "[I")
	private int[] anIntArray311;

	@OriginalMember(owner = "client!we", name = "lb", descriptor = "[I")
	private final int[] anIntArray312;

	@OriginalMember(owner = "client!we", name = "gb", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!we", name = "wb", descriptor = "I")
	private int anInt3023;

	@OriginalMember(owner = "client!we", name = "xb", descriptor = "I")
	private int anInt3024;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class5_Sub1_Sub10_Sub4(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray311 = arg0;
		this.anIntArray312 = arg1;
		this.anIntArray310 = arg2;
		@Pc(24) byte local24 = 0;
		for (@Pc(26) int local26 = 1; local26 < arg3.length; local26++) {
			if (arg3[local26] == 1) {
				local24 = (byte) local26;
			}
		}
		this.aByteArrayArray11 = arg4;
		@Pc(45) int local45 = Integer.MAX_VALUE;
		@Pc(47) int local47 = Integer.MIN_VALUE;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			if (this.anIntArray311[local49] < local45 && this.anIntArray310[local49] != 0) {
				local45 = this.anIntArray311[local49];
			}
			if (this.anIntArray311[local49] + this.anIntArray310[local49] > local47) {
				local47 = this.anIntArray311[local49] + this.anIntArray310[local49];
			}
			@Pc(92) byte[] local92 = this.aByteArrayArray11[local49];
			@Pc(95) int local95 = local92.length;
			for (@Pc(97) int local97 = 0; local97 < local95; local97++) {
				local92[local97] = (byte) (local92[local97] == local24 ? 0 : 1);
			}
		}
		this.anInt3022 = this.anIntArray311[32] + this.anIntArray310[32];
		this.anInt3023 = this.anInt3022 - local45;
		this.anInt3024 = local47 - this.anInt3022;
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "([B)V")
	public Class5_Sub1_Sub10_Sub4(@OriginalArg(0) byte[] arg0) {
		this.anIntArray312 = new int[arg0.length];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray312.length; local20++) {
			this.anIntArray312[local20] = arg0[local20] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vc;IIIII)V")
	public void method2030(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method2032(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt3022;
		for (@Pc(30) int local30 = 0; local30 < arg0.method1784(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray28[local30] & 0xFF;
			if (local38 != 32) {
				Static121.method2029(this.aByteArrayArray11[local38], arg1, local28 + this.anIntArray311[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray312[local38], this.anIntArray310[local38], arg3);
			}
			arg1 += this.anIntArray312[local38];
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vc;)I")
	public int method2031(@OriginalArg(0) Class71 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2736; local7++) {
			if (arg0.aByteArray28[local7] == 64 && local7 + 4 < arg0.anInt2736 && arg0.aByteArray28[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray312[arg0.aByteArray28[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Lclient!vc;)I")
	public int method2032(@OriginalArg(0) Class71 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2736; local7++) {
			local5 += this.anIntArray312[arg0.aByteArray28[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vc;III)V")
	public void method2033(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt3022;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt2736; local9++) {
			@Pc(17) int local17 = arg0.aByteArray28[local9] & 0xFF;
			if (local17 != 32) {
				Static121.method2029(this.aByteArrayArray11[local17], arg1, local7 + this.anIntArray311[local17], this.anIntArray312[local17], this.anIntArray310[local17], arg3);
			}
			arg1 += this.anIntArray312[local17];
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vc;IIII)V")
	public void method2035(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method2032(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt3022;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2736; local17++) {
			@Pc(25) int local25 = arg0.aByteArray28[local17] & 0xFF;
			if (local25 != 32) {
				Static121.method2029(this.aByteArrayArray11[local25], arg1, local15 + this.anIntArray311[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray312[local25], this.anIntArray310[local25], arg3);
			}
			arg1 += this.anIntArray312[local25];
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vc;IIIIIZIII)V")
	public void method2036(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg9 == 0) {
			arg9 = this.anInt3022;
		}
		@Pc(9) boolean local9 = true;
		if (arg4 < this.anInt3023 + this.anInt3024 + arg9 && arg4 < arg9 + arg9) {
			local9 = false;
		}
		@Pc(31) int local31 = this.method2051(arg0, arg3, local9);
		if (arg8 == 3 && local31 == 1) {
			arg8 = 1;
		}
		@Pc(46) int local46;
		@Pc(107) int local107;
		if (arg8 == 0) {
			local46 = arg2 + this.anInt3023;
		} else if (arg8 == 1) {
			local46 = arg2 + this.anInt3023 + (arg4 - this.anInt3023 - this.anInt3024 - (local31 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local46 = arg2 + arg4 - this.anInt3024 - (local31 - 1) * arg9;
		} else {
			local107 = (arg4 - this.anInt3023 - this.anInt3024 - (local31 - 1) * arg9) / (local31 + 1);
			if (local107 < 0) {
				local107 = 0;
			}
			local46 = arg2 + this.anInt3023 + local107;
			arg9 += local107;
		}
		for (local107 = 0; local107 < local31; local107++) {
			if (arg7 == 0) {
				this.method2049(Static121.aClass71Array19[local107], arg1, local46, arg5, arg6);
			} else if (arg7 == 1) {
				this.method2040(Static121.aClass71Array19[local107], arg1 + arg3 / 2, local46, arg5, arg6);
			} else if (arg7 == 2) {
				this.method2042(Static121.aClass71Array19[local107], arg1 + arg3, local46, arg5, arg6);
			} else if (local107 == local31 - 1) {
				this.method2049(Static121.aClass71Array19[local107], arg1, local46, arg5, arg6);
			} else {
				this.method2041(Static121.aClass71Array19[local107], arg1, local46, arg5, arg6, arg3);
			}
			local46 += arg9;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Lclient!vc;III)V")
	public void method2037(@OriginalArg(0) Class71 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2033(arg0, 507 - this.method2032(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)I")
	public int method2038(@OriginalArg(0) int arg0) {
		return this.anIntArray312[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(Lclient!vc;)I")
	private int method2039(@OriginalArg(0) Class71 arg0) {
		if (arg0.method1813(Static121.aClass71_1444)) {
			return 16711680;
		} else if (arg0.method1813(Static121.aClass71_1441)) {
			return 65280;
		} else if (arg0.method1813(Static121.aClass71_1449)) {
			return 255;
		} else if (arg0.method1813(Static121.aClass71_1447)) {
			return 16776960;
		} else if (arg0.method1813(Static121.aClass71_1451)) {
			return 65535;
		} else if (arg0.method1813(Static121.aClass71_1446)) {
			return 16711935;
		} else if (arg0.method1813(Static121.aClass71_1450)) {
			return 16777215;
		} else if (arg0.method1813(Static121.aClass71_1437)) {
			return 0;
		} else if (arg0.method1813(Static121.aClass71_1434)) {
			return 16748608;
		} else if (arg0.method1813(Static121.aClass71_1452)) {
			return 8388608;
		} else if (arg0.method1813(Static121.aClass71_1438)) {
			return 128;
		} else if (arg0.method1813(Static121.aClass71_1435)) {
			return 16756736;
		} else if (arg0.method1813(Static121.aClass71_1436)) {
			return 16740352;
		} else if (arg0.method1813(Static121.aClass71_1439)) {
			return 16723968;
		} else if (arg0.method1813(Static121.aClass71_1443)) {
			return 12648192;
		} else if (arg0.method1813(Static121.aClass71_1440)) {
			return 8453888;
		} else if (arg0.method1813(Static121.aClass71_1445)) {
			return 4259584;
		} else {
			if (arg0.method1813(Static121.aClass71_1442)) {
				Static121.aBoolean131 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vc;IIIZ)V")
	public void method2040(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method2049(arg0, arg1 - this.method2031(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vc;IIIZI)V")
	private void method2041(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class71 local3 = arg0.method1821();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3.method1784(); local7++) {
			if (local3.method1804(local7) == 32) {
				local5++;
			}
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		if (local5 > 0) {
			local23 = (arg5 - this.method2031(local3)) * 256 / local5;
		}
		Static121.aBoolean131 = false;
		@Pc(41) int local41 = arg1;
		if (local3 == null) {
			return;
		}
		@Pc(49) int local49 = arg2 - this.anInt3022;
		for (@Pc(51) int local51 = 0; local51 < local3.anInt2736; local51++) {
			@Pc(84) int local84;
			if (local3.aByteArray28[local51] == 64 && local51 + 4 < local3.anInt2736 && local3.aByteArray28[local51 + 4] == 64) {
				local84 = this.method2039(local3.method1800(local51 + 4, local51 + 1));
				if (local84 != -1) {
					arg3 = local84;
				}
				local51 += 4;
			} else {
				local84 = local3.aByteArray28[local51] & 0xFF;
				if (local84 != 32) {
					if (arg4) {
						Static121.method2029(this.aByteArrayArray11[local84], arg1 + 1, local49 + this.anIntArray311[local84] + 1, this.anIntArray312[local84], this.anIntArray310[local84], 0);
					}
					Static121.method2029(this.aByteArrayArray11[local84], arg1, local49 + this.anIntArray311[local84], this.anIntArray312[local84], this.anIntArray310[local84], arg3);
				}
				arg1 += this.anIntArray312[local84];
				if (local84 == 32) {
					local25 += local23;
					arg1 += local25 / 256;
					local25 &= 0xFF;
				}
			}
		}
		if (Static121.aBoolean131) {
			Static52.method2023(local41, local49 + (int) ((double) this.anInt3022 * 0.7D), arg1 - local41, 8388608);
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Lclient!vc;IIIZ)V")
	public void method2042(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method2049(arg0, arg1 - this.method2031(arg0), arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Lclient!vc;IIII)V")
	public void method2044(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method2032(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt3022;
		for (@Pc(17) int local17 = 0; local17 < arg0.method1784(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray28[local17] & 0xFF;
			if (local25 != 32) {
				Static121.method2029(this.aByteArrayArray11[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray311[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray312[local25], this.anIntArray310[local25], arg3);
			}
			arg1 += this.anIntArray312[local25];
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Lclient!vc;IIIZI)V")
	public void method2045(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt3022;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt2736; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray28[local22] == 64 && local22 + 4 < arg0.anInt2736 && arg0.aByteArray28[local22 + 4] == 64) {
				local55 = this.method2039(arg0.method1800(local22 + 4, local22 + 1));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray28[local22] & 0xFF;
				if (local55 != 32) {
					Static121.method2043(this.aByteArrayArray11[local55], arg1 + 1, local20 + this.anIntArray311[local55] + 1, this.anIntArray312[local55], this.anIntArray310[local55], 0, 192);
					Static121.method2043(this.aByteArrayArray11[local55], arg1, local20 + this.anIntArray311[local55], this.anIntArray312[local55], this.anIntArray310[local55], arg2, local15);
				}
				arg1 += this.anIntArray312[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vc;I)I")
	public int method2046(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = this.method2051(arg0, arg1, true);
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < local5; local9++) {
			@Pc(16) int local16 = this.method2032(Static121.aClass71Array19[local9]);
			if (local16 > local7) {
				local7 = local16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(Lclient!vc;III)V")
	public void method2048(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method2033(arg0, arg1 - this.method2032(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(Lclient!vc;IIIZ)V")
	public void method2049(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		Static121.aBoolean131 = false;
		@Pc(3) int local3 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 - this.anInt3022;
		for (@Pc(13) int local13 = 0; local13 < arg0.anInt2736; local13++) {
			@Pc(46) int local46;
			if (arg0.aByteArray28[local13] == 64 && local13 + 4 < arg0.anInt2736 && arg0.aByteArray28[local13 + 4] == 64) {
				local46 = this.method2039(arg0.method1800(local13 + 4, local13 + 1));
				if (local46 != -1) {
					arg3 = local46;
				}
				local13 += 4;
			} else {
				local46 = arg0.aByteArray28[local13] & 0xFF;
				if (local46 != 32) {
					if (arg4) {
						Static121.method2029(this.aByteArrayArray11[local46], arg1 + 1, local11 + this.anIntArray311[local46] + 1, this.anIntArray312[local46], this.anIntArray310[local46], 0);
					}
					Static121.method2029(this.aByteArrayArray11[local46], arg1, local11 + this.anIntArray311[local46], this.anIntArray312[local46], this.anIntArray310[local46], arg3);
				}
				arg1 += this.anIntArray312[local46];
			}
		}
		if (Static121.aBoolean131) {
			Static52.method2023(local3, local11 + (int) ((double) this.anInt3022 * 0.7D), arg1 - local3, 8388608);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vc;IZ)I")
	private int method2051(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) Class71 local7 = Static68.method1149();
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) Class71 local13 = null;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method1784();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method1804(local27);
			if (local33 == 64 && local27 + 4 < local25 && arg0.method1804(local27 + 4) == 64) {
				@Pc(57) Class71 local57 = arg0.method1800(local27 + 5, local27);
				if (local57.method1813(Static121.aClass71_1442)) {
					local17 = true;
					local19 = local7.method1784();
				} else {
					local13 = local57;
					local15 = local7.method1784();
				}
				local7.method1814(local57);
				local27 += 4;
			} else if (local33 == 92 && local27 + 1 < local25 && arg0.method1804(local27 + 1) == 110) {
				Static121.aClass71Array19[local21++] = local7.method1800(local7.method1784(), local3).method1821();
				local3 = local7.method1784();
				local1 = 0;
				local9 = -1;
				local27++;
				local13 = null;
				local17 = false;
			} else {
				local7.method1811(local33);
				local1 += this.method2038(local33);
				if (local33 == 32 || local33 == 45) {
					local9 = local7.method1784();
					local11 = local1;
				}
				if (arg2 && local1 > arg1 && local9 >= 0) {
					Static121.aClass71Array19[local21++] = local7.method1800(local9, local3).method1821();
					local3 = local9;
					local9 = -1;
					local1 -= local11;
					if (local13 != null && local15 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1812(local3, local13);
					}
					if (local17 && local19 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1812(local3, Static121.aClass71_1448);
					}
				}
			}
		}
		if (local7.method1784() > local3) {
			Static121.aClass71Array19[local21++] = local7.method1800(local7.method1784(), local3).method1821();
		}
		return local21;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Lclient!vc;I)I")
	public int method2052(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		return this.method2051(arg0, arg1, true);
	}
}
