import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub5_Sub1 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!gb", name = "zb", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!gb", name = "Fb", descriptor = "I")
	public int anInt873 = 0;

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gb", name = "qb", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!gb", name = "mb", descriptor = "[I")
	private final int[] anIntArray132;

	@OriginalMember(owner = "client!gb", name = "vb", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!gb", name = "Gb", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!gb", name = "Hb", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class1_Sub1_Sub5_Sub1(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray133 = arg0;
		this.anIntArray132 = arg1;
		this.anIntArray134 = arg2;
		@Pc(24) byte local24 = 0;
		for (@Pc(26) int local26 = 1; local26 < arg3.length; local26++) {
			if (arg3[local26] == 1) {
				local24 = (byte) local26;
			}
		}
		this.aByteArrayArray3 = arg4;
		@Pc(45) int local45 = Integer.MAX_VALUE;
		@Pc(47) int local47 = Integer.MIN_VALUE;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			if (this.anIntArray133[local49] < local45 && this.anIntArray134[local49] != 0) {
				local45 = this.anIntArray133[local49];
			}
			if (this.anIntArray133[local49] + this.anIntArray134[local49] > local47) {
				local47 = this.anIntArray133[local49] + this.anIntArray134[local49];
			}
			@Pc(92) byte[] local92 = this.aByteArrayArray3[local49];
			@Pc(95) int local95 = local92.length;
			for (@Pc(97) int local97 = 0; local97 < local95; local97++) {
				local92[local97] = (byte) (local92[local97] == local24 ? 0 : 1);
			}
		}
		this.anInt873 = this.anIntArray133[32] + this.anIntArray134[32];
		this.anInt874 = this.anInt873 - local45;
		this.anInt875 = local47 - this.anInt873;
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub5_Sub1(@OriginalArg(0) byte[] arg0) {
		this.anIntArray132 = new int[arg0.length];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray132.length; local20++) {
			this.anIntArray132[local20] = arg0[local20] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rd;IIIZI)V")
	private void method643(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class64 local3 = arg0.method1477();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3.method1469(); local7++) {
			if (local3.method1476(local7) == 32) {
				local5++;
			}
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		if (local5 > 0) {
			local23 = (arg5 - this.method653(local3)) * 256 / local5;
		}
		Static36.aBoolean58 = false;
		@Pc(41) int local41 = arg1;
		if (local3 == null) {
			return;
		}
		@Pc(49) int local49 = arg2 - this.anInt873;
		for (@Pc(51) int local51 = 0; local51 < local3.anInt2086; local51++) {
			@Pc(84) int local84;
			if (local3.aByteArray24[local51] == 64 && local51 + 4 < local3.anInt2086 && local3.aByteArray24[local51 + 4] == 64) {
				local84 = this.method660(local3.method1475(local51 + 4, local51 + 1));
				if (local84 != -1) {
					arg3 = local84;
				}
				local51 += 4;
			} else {
				local84 = local3.aByteArray24[local51] & 0xFF;
				if (local84 != 32) {
					if (arg4) {
						Static36.method651(this.aByteArrayArray3[local84], arg1 + 1, local49 + this.anIntArray133[local84] + 1, this.anIntArray132[local84], this.anIntArray134[local84], 0);
					}
					Static36.method651(this.aByteArrayArray3[local84], arg1, local49 + this.anIntArray133[local84], this.anIntArray132[local84], this.anIntArray134[local84], arg3);
				}
				arg1 += this.anIntArray132[local84];
				if (local84 == 32) {
					local25 += local23;
					arg1 += local25 / 256;
					local25 &= 0xFF;
				}
			}
		}
		if (Static36.aBoolean58) {
			Static47.method1955(local41, local49 + (int) ((double) this.anInt873 * 0.7D), arg1 - local41, 8388608);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rd;I)I")
	public int method644(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = this.method662(arg0, arg1, true);
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < local5; local9++) {
			@Pc(16) int local16 = this.method654(Static36.aClass64Array9[local9]);
			if (local16 > local7) {
				local7 = local16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rd;III)V")
	public void method645(@OriginalArg(0) Class64 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method661(arg0, 507 - this.method654(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!rd;IIIZI)V")
	public void method646(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt873;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt2086; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray24[local22] == 64 && local22 + 4 < arg0.anInt2086 && arg0.aByteArray24[local22 + 4] == 64) {
				local55 = this.method660(arg0.method1475(local22 + 4, local22 + 1));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray24[local22] & 0xFF;
				if (local55 != 32) {
					Static36.method657(this.aByteArrayArray3[local55], arg1 + 1, local20 + this.anIntArray133[local55] + 1, this.anIntArray132[local55], this.anIntArray134[local55], 0, 192);
					Static36.method657(this.aByteArrayArray3[local55], arg1, local20 + this.anIntArray133[local55], this.anIntArray132[local55], this.anIntArray134[local55], arg2, local15);
				}
				arg1 += this.anIntArray132[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rd;IIII)V")
	public void method647(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method654(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt873;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2086; local17++) {
			@Pc(25) int local25 = arg0.aByteArray24[local17] & 0xFF;
			if (local25 != 32) {
				Static36.method651(this.aByteArrayArray3[local25], arg1, local15 + this.anIntArray133[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray132[local25], this.anIntArray134[local25], arg3);
			}
			arg1 += this.anIntArray132[local25];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rd;IIIZ)V")
	public void method648(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method666(arg0, arg1 - this.method653(arg0), arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!rd;IIII)V")
	public void method652(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method654(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt873;
		for (@Pc(17) int local17 = 0; local17 < arg0.method1469(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray24[local17] & 0xFF;
			if (local25 != 32) {
				Static36.method651(this.aByteArrayArray3[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray133[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray132[local25], this.anIntArray134[local25], arg3);
			}
			arg1 += this.anIntArray132[local25];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rd;)I")
	public int method653(@OriginalArg(0) Class64 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2086; local7++) {
			if (arg0.aByteArray24[local7] == 64 && local7 + 4 < arg0.anInt2086 && arg0.aByteArray24[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray132[arg0.aByteArray24[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!rd;)I")
	public int method654(@OriginalArg(0) Class64 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2086; local7++) {
			local5 += this.anIntArray132[arg0.aByteArray24[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)I")
	public int method655(@OriginalArg(0) int arg0) {
		return this.anIntArray132[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!rd;I)I")
	public int method656(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		return this.method662(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rd;IIIIIZIII)V")
	public void method658(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg9 == 0) {
			arg9 = this.anInt873;
		}
		@Pc(9) boolean local9 = true;
		if (arg4 < this.anInt874 + this.anInt875 + arg9 && arg4 < arg9 + arg9) {
			local9 = false;
		}
		@Pc(31) int local31 = this.method662(arg0, arg3, local9);
		if (arg8 == 3 && local31 == 1) {
			arg8 = 1;
		}
		@Pc(46) int local46;
		@Pc(107) int local107;
		if (arg8 == 0) {
			local46 = arg2 + this.anInt874;
		} else if (arg8 == 1) {
			local46 = arg2 + this.anInt874 + (arg4 - this.anInt874 - this.anInt875 - (local31 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local46 = arg2 + arg4 - this.anInt875 - (local31 - 1) * arg9;
		} else {
			local107 = (arg4 - this.anInt874 - this.anInt875 - (local31 - 1) * arg9) / (local31 + 1);
			if (local107 < 0) {
				local107 = 0;
			}
			local46 = arg2 + this.anInt874 + local107;
			arg9 += local107;
		}
		for (local107 = 0; local107 < local31; local107++) {
			if (arg7 == 0) {
				this.method666(Static36.aClass64Array9[local107], arg1, local46, arg5, arg6);
			} else if (arg7 == 1) {
				this.method663(Static36.aClass64Array9[local107], arg1 + arg3 / 2, local46, arg5, arg6);
			} else if (arg7 == 2) {
				this.method648(Static36.aClass64Array9[local107], arg1 + arg3, local46, arg5, arg6);
			} else if (local107 == local31 - 1) {
				this.method666(Static36.aClass64Array9[local107], arg1, local46, arg5, arg6);
			} else {
				this.method643(Static36.aClass64Array9[local107], arg1, local46, arg5, arg6, arg3);
			}
			local46 += arg9;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rd;IIIII)V")
	public void method659(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method654(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt873;
		for (@Pc(30) int local30 = 0; local30 < arg0.method1469(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray24[local30] & 0xFF;
			if (local38 != 32) {
				Static36.method651(this.aByteArrayArray3[local38], arg1, local28 + this.anIntArray133[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray132[local38], this.anIntArray134[local38], arg3);
			}
			arg1 += this.anIntArray132[local38];
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lclient!rd;)I")
	private int method660(@OriginalArg(0) Class64 arg0) {
		if (arg0.method1496(Static36.aClass64_556)) {
			return 16711680;
		} else if (arg0.method1496(Static36.aClass64_560)) {
			return 65280;
		} else if (arg0.method1496(Static36.aClass64_553)) {
			return 255;
		} else if (arg0.method1496(Static36.aClass64_559)) {
			return 16776960;
		} else if (arg0.method1496(Static36.aClass64_564)) {
			return 65535;
		} else if (arg0.method1496(Static36.aClass64_568)) {
			return 16711935;
		} else if (arg0.method1496(Static36.aClass64_567)) {
			return 16777215;
		} else if (arg0.method1496(Static36.aClass64_557)) {
			return 0;
		} else if (arg0.method1496(Static36.aClass64_561)) {
			return 16748608;
		} else if (arg0.method1496(Static36.aClass64_550)) {
			return 8388608;
		} else if (arg0.method1496(Static36.aClass64_558)) {
			return 128;
		} else if (arg0.method1496(Static36.aClass64_563)) {
			return 16756736;
		} else if (arg0.method1496(Static36.aClass64_551)) {
			return 16740352;
		} else if (arg0.method1496(Static36.aClass64_562)) {
			return 16723968;
		} else if (arg0.method1496(Static36.aClass64_565)) {
			return 12648192;
		} else if (arg0.method1496(Static36.aClass64_566)) {
			return 8453888;
		} else if (arg0.method1496(Static36.aClass64_552)) {
			return 4259584;
		} else {
			if (arg0.method1496(Static36.aClass64_555)) {
				Static36.aBoolean58 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!rd;III)V")
	public void method661(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt873;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt2086; local9++) {
			@Pc(17) int local17 = arg0.aByteArray24[local9] & 0xFF;
			if (local17 != 32) {
				Static36.method651(this.aByteArrayArray3[local17], arg1, local7 + this.anIntArray133[local17], this.anIntArray132[local17], this.anIntArray134[local17], arg3);
			}
			arg1 += this.anIntArray132[local17];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rd;IZ)I")
	private int method662(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) Class64 local7 = Static89.method1447();
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) Class64 local13 = null;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method1469();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method1476(local27);
			if (local33 == 64 && local27 + 4 < local25 && arg0.method1476(local27 + 4) == 64) {
				@Pc(57) Class64 local57 = arg0.method1475(local27 + 5, local27);
				if (local57.method1496(Static36.aClass64_555)) {
					local17 = true;
					local19 = local7.method1469();
				} else {
					local13 = local57;
					local15 = local7.method1469();
				}
				local7.method1498(local57);
				local27 += 4;
			} else if (local33 == 92 && local27 + 1 < local25 && arg0.method1476(local27 + 1) == 110) {
				Static36.aClass64Array9[local21++] = local7.method1475(local7.method1469(), local3).method1477();
				local3 = local7.method1469();
				local1 = 0;
				local9 = -1;
				local27++;
				local13 = null;
				local17 = false;
			} else {
				local7.method1486(local33);
				local1 += this.method655(local33);
				if (local33 == 32 || local33 == 45) {
					local9 = local7.method1469();
					local11 = local1;
				}
				if (arg2 && local1 > arg1 && local9 >= 0) {
					Static36.aClass64Array9[local21++] = local7.method1475(local9, local3).method1477();
					local3 = local9;
					local9 = -1;
					local1 -= local11;
					if (local13 != null && local15 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1468(local3, local13);
					}
					if (local17 && local19 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1468(local3, Static36.aClass64_554);
					}
				}
			}
		}
		if (local7.method1469() > local3) {
			Static36.aClass64Array9[local21++] = local7.method1475(local7.method1469(), local3).method1477();
		}
		return local21;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!rd;IIIZ)V")
	public void method663(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method666(arg0, arg1 - this.method653(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lclient!rd;III)V")
	public void method665(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method661(arg0, arg1 - this.method654(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lclient!rd;IIIZ)V")
	public void method666(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		Static36.aBoolean58 = false;
		@Pc(3) int local3 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 - this.anInt873;
		for (@Pc(13) int local13 = 0; local13 < arg0.anInt2086; local13++) {
			@Pc(46) int local46;
			if (arg0.aByteArray24[local13] == 64 && local13 + 4 < arg0.anInt2086 && arg0.aByteArray24[local13 + 4] == 64) {
				local46 = this.method660(arg0.method1475(local13 + 4, local13 + 1));
				if (local46 != -1) {
					arg3 = local46;
				}
				local13 += 4;
			} else {
				local46 = arg0.aByteArray24[local13] & 0xFF;
				if (local46 != 32) {
					if (arg4) {
						Static36.method651(this.aByteArrayArray3[local46], arg1 + 1, local11 + this.anIntArray133[local46] + 1, this.anIntArray132[local46], this.anIntArray134[local46], 0);
					}
					Static36.method651(this.aByteArrayArray3[local46], arg1, local11 + this.anIntArray133[local46], this.anIntArray132[local46], this.anIntArray134[local46], arg3);
				}
				arg1 += this.anIntArray132[local46];
			}
		}
		if (Static36.aBoolean58) {
			Static47.method1955(local3, local11 + (int) ((double) this.anInt873 * 0.7D), arg1 - local3, 8388608);
		}
	}
}
