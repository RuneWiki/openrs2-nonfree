import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub2_Sub1_Sub3 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
	public int anInt382 = 0;

	@OriginalMember(owner = "client!cc", name = "pb", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[256][];

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!cc", name = "sb", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!cc", name = "qb", descriptor = "[I")
	private final int[] anIntArray43;

	@OriginalMember(owner = "client!cc", name = "Db", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!cc", name = "Gb", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!cc", name = "Fb", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class2_Sub2_Sub1_Sub3(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray44 = arg0;
		this.anIntArray43 = arg1;
		this.anIntArray45 = arg2;
		@Pc(24) byte local24 = 0;
		for (@Pc(26) int local26 = 1; local26 < arg3.length; local26++) {
			if (arg3[local26] == 1) {
				local24 = (byte) local26;
			}
		}
		this.aByteArrayArray2 = arg4;
		@Pc(45) int local45 = Integer.MAX_VALUE;
		@Pc(47) int local47 = Integer.MIN_VALUE;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			if (this.anIntArray44[local49] < local45 && this.anIntArray45[local49] != 0) {
				local45 = this.anIntArray44[local49];
			}
			if (this.anIntArray44[local49] + this.anIntArray45[local49] > local47) {
				local47 = this.anIntArray44[local49] + this.anIntArray45[local49];
			}
			@Pc(92) byte[] local92 = this.aByteArrayArray2[local49];
			@Pc(95) int local95 = local92.length;
			for (@Pc(97) int local97 = 0; local97 < local95; local97++) {
				local92[local97] = (byte) (local92[local97] == local24 ? 0 : 1);
			}
		}
		this.anInt382 = this.anIntArray44[32] + this.anIntArray45[32];
		this.anInt384 = this.anInt382 - local45;
		this.anInt383 = local47 - this.anInt382;
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub1_Sub3(@OriginalArg(0) byte[] arg0) {
		this.anIntArray43 = new int[arg0.length];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray43.length; local20++) {
			this.anIntArray43[local20] = arg0[local20] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;)I")
	public int method302(@OriginalArg(0) Class74 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2481; local7++) {
			local5 += this.anIntArray43[arg0.aByteArray38[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;III)V")
	public void method303(@OriginalArg(0) Class74 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method308(arg0, 507 - this.method302(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;IIIZ)V")
	public void method304(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method324(arg0, arg1 - this.method307(arg0), arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;I)I")
	public int method306(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1) {
		return this.method313(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!u;)I")
	public int method307(@OriginalArg(0) Class74 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2481; local7++) {
			if (arg0.aByteArray38[local7] == 64 && local7 + 4 < arg0.anInt2481 && arg0.aByteArray38[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray43[arg0.aByteArray38[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!u;III)V")
	public void method308(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt382;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt2481; local9++) {
			@Pc(17) int local17 = arg0.aByteArray38[local9] & 0xFF;
			if (local17 != 32) {
				Static13.method309(this.aByteArrayArray2[local17], arg1, local7 + this.anIntArray44[local17], this.anIntArray43[local17], this.anIntArray45[local17], arg3);
			}
			arg1 += this.anIntArray43[local17];
		}
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I")
	public int method310(@OriginalArg(0) int arg0) {
		return this.anIntArray43[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;IIIIIZIII)V")
	public void method311(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg9 == 0) {
			arg9 = this.anInt382;
		}
		@Pc(9) boolean local9 = true;
		if (arg4 < this.anInt384 + this.anInt383 + arg9 && arg4 < arg9 + arg9) {
			local9 = false;
		}
		@Pc(31) int local31 = this.method313(arg0, arg3, local9);
		if (arg8 == 3 && local31 == 1) {
			arg8 = 1;
		}
		@Pc(46) int local46;
		@Pc(107) int local107;
		if (arg8 == 0) {
			local46 = arg2 + this.anInt384;
		} else if (arg8 == 1) {
			local46 = arg2 + this.anInt384 + (arg4 - this.anInt384 - this.anInt383 - (local31 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local46 = arg2 + arg4 - this.anInt383 - (local31 - 1) * arg9;
		} else {
			local107 = (arg4 - this.anInt384 - this.anInt383 - (local31 - 1) * arg9) / (local31 + 1);
			if (local107 < 0) {
				local107 = 0;
			}
			local46 = arg2 + this.anInt384 + local107;
			arg9 += local107;
		}
		for (local107 = 0; local107 < local31; local107++) {
			if (arg7 == 0) {
				this.method324(Static13.aClass74Array1[local107], arg1, local46, arg5, arg6);
			} else if (arg7 == 1) {
				this.method317(Static13.aClass74Array1[local107], arg1 + arg3 / 2, local46, arg5, arg6);
			} else if (arg7 == 2) {
				this.method304(Static13.aClass74Array1[local107], arg1 + arg3, local46, arg5, arg6);
			} else if (local107 == local31 - 1) {
				this.method324(Static13.aClass74Array1[local107], arg1, local46, arg5, arg6);
			} else {
				this.method322(Static13.aClass74Array1[local107], arg1, local46, arg5, arg6, arg3);
			}
			local46 += arg9;
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lclient!u;)I")
	private int method312(@OriginalArg(0) Class74 arg0) {
		if (arg0.method1733(Static13.aClass74_373)) {
			return 16711680;
		} else if (arg0.method1733(Static13.aClass74_356)) {
			return 65280;
		} else if (arg0.method1733(Static13.aClass74_364)) {
			return 255;
		} else if (arg0.method1733(Static13.aClass74_369)) {
			return 16776960;
		} else if (arg0.method1733(Static13.aClass74_362)) {
			return 65535;
		} else if (arg0.method1733(Static13.aClass74_363)) {
			return 16711935;
		} else if (arg0.method1733(Static13.aClass74_358)) {
			return 16777215;
		} else if (arg0.method1733(Static13.aClass74_370)) {
			return 0;
		} else if (arg0.method1733(Static13.aClass74_374)) {
			return 8388608;
		} else if (arg0.method1733(Static13.aClass74_365)) {
			return 128;
		} else if (arg0.method1733(Static13.aClass74_375)) {
			return 8388736;
		} else if (arg0.method1733(Static13.aClass74_371)) {
			return 16748608;
		} else if (arg0.method1733(Static13.aClass74_360)) {
			return 16756736;
		} else if (arg0.method1733(Static13.aClass74_367)) {
			return 16740352;
		} else if (arg0.method1733(Static13.aClass74_357)) {
			return 16723968;
		} else if (arg0.method1733(Static13.aClass74_368)) {
			return 12648192;
		} else if (arg0.method1733(Static13.aClass74_359)) {
			return 8453888;
		} else if (arg0.method1733(Static13.aClass74_361)) {
			return 4259584;
		} else {
			if (arg0.method1733(Static13.aClass74_366)) {
				Static13.aBoolean12 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;IZ)I")
	private int method313(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) Class74 local7 = Static17.method403();
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) Class74 local13 = null;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method1695();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method1703(local27);
			if (local33 == 64 && local27 + 4 < local25 && arg0.method1703(local27 + 4) == 64) {
				@Pc(57) Class74 local57 = arg0.method1706(local27, local27 + 5);
				if (local57.method1733(Static13.aClass74_366)) {
					local17 = true;
					local19 = local7.method1695();
				} else {
					local13 = local57;
					local15 = local7.method1695();
				}
				local7.method1707(local57);
				local27 += 4;
			} else if (local33 == 92 && local27 + 1 < local25 && arg0.method1703(local27 + 1) == 110) {
				Static13.aClass74Array1[local21++] = local7.method1706(local3, local7.method1695()).method1718();
				local3 = local7.method1695();
				local1 = 0;
				local9 = -1;
				local27++;
				local13 = null;
				local17 = false;
			} else {
				local7.method1698(local33);
				local1 += this.method310(local33);
				if (local33 == 32 || local33 == 45) {
					local9 = local7.method1695();
					local11 = local1;
				}
				if (arg2 && local1 > arg1 && local9 >= 0) {
					Static13.aClass74Array1[local21++] = local7.method1706(local3, local9).method1718();
					local3 = local9;
					local9 = -1;
					local1 -= local11;
					if (local13 != null && local15 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1705(local13, local3);
					}
					if (local17 && local19 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1705(Static13.aClass74_372, local3);
					}
				}
			}
		}
		if (local7.method1695() > local3) {
			Static13.aClass74Array1[local21++] = local7.method1706(local3, local7.method1695()).method1718();
		}
		return local21;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lclient!u;III)V")
	public void method314(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method308(arg0, arg1 - this.method302(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;IIII)V")
	public void method316(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method302(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt382;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2481; local17++) {
			@Pc(25) int local25 = arg0.aByteArray38[local17] & 0xFF;
			if (local25 != 32) {
				Static13.method309(this.aByteArrayArray2[local25], arg1, local15 + this.anIntArray44[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray43[local25], this.anIntArray45[local25], arg3);
			}
			arg1 += this.anIntArray43[local25];
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!u;IIIZ)V")
	public void method317(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method324(arg0, arg1 - this.method307(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!u;I)I")
	public int method318(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = this.method313(arg0, arg1, true);
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < local5; local9++) {
			@Pc(16) int local16 = this.method307(Static13.aClass74Array1[local9]);
			if (local16 > local7) {
				local7 = local16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;IIIII)V")
	public void method319(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method302(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt382;
		for (@Pc(30) int local30 = 0; local30 < arg0.method1695(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray38[local30] & 0xFF;
			if (local38 != 32) {
				Static13.method309(this.aByteArrayArray2[local38], arg1, local28 + this.anIntArray44[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray43[local38], this.anIntArray45[local38], arg3);
			}
			arg1 += this.anIntArray43[local38];
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!u;IIII)V")
	public void method320(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method302(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt382;
		for (@Pc(17) int local17 = 0; local17 < arg0.method1695(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray38[local17] & 0xFF;
			if (local25 != 32) {
				Static13.method309(this.aByteArrayArray2[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray44[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray43[local25], this.anIntArray45[local25], arg3);
			}
			arg1 += this.anIntArray43[local25];
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;IIIZI)V")
	private void method322(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class74 local3 = arg0.method1718();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3.method1695(); local7++) {
			if (local3.method1703(local7) == 32) {
				local5++;
			}
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		if (local5 > 0) {
			local23 = (arg5 - this.method307(local3)) * 256 / local5;
		}
		Static13.aBoolean12 = false;
		@Pc(41) int local41 = arg1;
		if (local3 == null) {
			return;
		}
		@Pc(49) int local49 = arg2 - this.anInt382;
		for (@Pc(51) int local51 = 0; local51 < local3.anInt2481; local51++) {
			@Pc(84) int local84;
			if (local3.aByteArray38[local51] == 64 && local51 + 4 < local3.anInt2481 && local3.aByteArray38[local51 + 4] == 64) {
				local84 = this.method312(local3.method1706(local51 + 1, local51 + 4));
				if (local84 != -1) {
					arg3 = local84;
				}
				local51 += 4;
			} else {
				local84 = local3.aByteArray38[local51] & 0xFF;
				if (local84 != 32) {
					if (arg4) {
						Static13.method309(this.aByteArrayArray2[local84], arg1 + 1, local49 + this.anIntArray44[local84] + 1, this.anIntArray43[local84], this.anIntArray45[local84], 0);
					}
					Static13.method309(this.aByteArrayArray2[local84], arg1, local49 + this.anIntArray44[local84], this.anIntArray43[local84], this.anIntArray45[local84], arg3);
				}
				arg1 += this.anIntArray43[local84];
				if (local84 == 32) {
					local25 += local23;
					arg1 += local25 / 256;
					local25 &= 0xFF;
				}
			}
		}
		if (Static13.aBoolean12) {
			Static58.method706(local41, local49 + (int) ((double) this.anInt382 * 0.7D), arg1 - local41, 8388608);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!u;IIIZI)V")
	public void method323(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt382;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt2481; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray38[local22] == 64 && local22 + 4 < arg0.anInt2481 && arg0.aByteArray38[local22 + 4] == 64) {
				local55 = this.method312(arg0.method1706(local22 + 1, local22 + 4));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray38[local22] & 0xFF;
				if (local55 != 32) {
					Static13.method315(this.aByteArrayArray2[local55], arg1 + 1, local20 + this.anIntArray44[local55] + 1, this.anIntArray43[local55], this.anIntArray45[local55], 0, 192);
					Static13.method315(this.aByteArrayArray2[local55], arg1, local20 + this.anIntArray44[local55], this.anIntArray43[local55], this.anIntArray45[local55], arg2, local15);
				}
				arg1 += this.anIntArray43[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lclient!u;IIIZ)V")
	public void method324(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		Static13.aBoolean12 = false;
		@Pc(3) int local3 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 - this.anInt382;
		for (@Pc(13) int local13 = 0; local13 < arg0.anInt2481; local13++) {
			@Pc(46) int local46;
			if (arg0.aByteArray38[local13] == 64 && local13 + 4 < arg0.anInt2481 && arg0.aByteArray38[local13 + 4] == 64) {
				local46 = this.method312(arg0.method1706(local13 + 1, local13 + 4));
				if (local46 != -1) {
					arg3 = local46;
				}
				local13 += 4;
			} else {
				local46 = arg0.aByteArray38[local13] & 0xFF;
				if (local46 != 32) {
					if (arg4) {
						Static13.method309(this.aByteArrayArray2[local46], arg1 + 1, local11 + this.anIntArray44[local46] + 1, this.anIntArray43[local46], this.anIntArray45[local46], 0);
					}
					Static13.method309(this.aByteArrayArray2[local46], arg1, local11 + this.anIntArray44[local46], this.anIntArray43[local46], this.anIntArray45[local46], arg3);
				}
				arg1 += this.anIntArray43[local46];
			}
		}
		if (Static13.aBoolean12) {
			Static58.method706(local3, local11 + (int) ((double) this.anInt382 * 0.7D), arg1 - local3, 8388608);
		}
	}
}
