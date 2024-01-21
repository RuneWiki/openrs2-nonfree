import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class6_Sub3_Sub3_Sub1 extends Class6_Sub3_Sub3 {

	@OriginalMember(owner = "client!cd", name = "Ab", descriptor = "I")
	public int anInt555 = 0;

	@OriginalMember(owner = "client!cd", name = "jb", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!cd", name = "fb", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!cd", name = "sb", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!cd", name = "xb", descriptor = "[I")
	private final int[] anIntArray60;

	@OriginalMember(owner = "client!cd", name = "yb", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!cd", name = "Fb", descriptor = "I")
	private int anInt556;

	@OriginalMember(owner = "client!cd", name = "Hb", descriptor = "I")
	private int anInt557;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class6_Sub3_Sub3_Sub1(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray59 = arg0;
		this.anIntArray60 = arg1;
		this.anIntArray61 = arg2;
		@Pc(24) byte local24 = 0;
		for (@Pc(26) int local26 = 1; local26 < arg3.length; local26++) {
			if (arg3[local26] == 1) {
				local24 = (byte) local26;
			}
		}
		this.aByteArrayArray1 = arg4;
		@Pc(45) int local45 = Integer.MAX_VALUE;
		@Pc(47) int local47 = Integer.MIN_VALUE;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			if (this.anIntArray59[local49] < local45 && this.anIntArray61[local49] != 0) {
				local45 = this.anIntArray59[local49];
			}
			if (this.anIntArray59[local49] + this.anIntArray61[local49] > local47) {
				local47 = this.anIntArray59[local49] + this.anIntArray61[local49];
			}
			@Pc(92) byte[] local92 = this.aByteArrayArray1[local49];
			@Pc(95) int local95 = local92.length;
			for (@Pc(97) int local97 = 0; local97 < local95; local97++) {
				local92[local97] = (byte) (local92[local97] == local24 ? 0 : 1);
			}
		}
		this.anInt555 = this.anIntArray59[32] + this.anIntArray61[32];
		this.anInt556 = this.anInt555 - local45;
		this.anInt557 = local47 - this.anInt555;
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V")
	public Class6_Sub3_Sub3_Sub1(@OriginalArg(0) byte[] arg0) {
		this.anIntArray60 = new int[arg0.length];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray60.length; local20++) {
			this.anIntArray60[local20] = arg0[local20] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rd;IIIII)V")
	public void method439(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method450(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt555;
		for (@Pc(30) int local30 = 0; local30 < arg0.method1811(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray33[local30] & 0xFF;
			if (local38 != 32) {
				Static16.method448(this.aByteArrayArray1[local38], arg1, local28 + this.anIntArray59[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray60[local38], this.anIntArray61[local38], arg3);
			}
			arg1 += this.anIntArray60[local38];
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rd;IIIZ)V")
	public void method440(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		Static16.aBoolean32 = false;
		@Pc(3) int local3 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 - this.anInt555;
		for (@Pc(13) int local13 = 0; local13 < arg0.anInt2746; local13++) {
			@Pc(46) int local46;
			if (arg0.aByteArray33[local13] == 64 && local13 + 4 < arg0.anInt2746 && arg0.aByteArray33[local13 + 4] == 64) {
				local46 = this.method459(arg0.method1820(local13 + 4, local13 + 1));
				if (local46 != -1) {
					arg3 = local46;
				}
				local13 += 4;
			} else {
				local46 = arg0.aByteArray33[local13] & 0xFF;
				if (local46 != 32) {
					if (arg4) {
						Static16.method448(this.aByteArrayArray1[local46], arg1 + 1, local11 + this.anIntArray59[local46] + 1, this.anIntArray60[local46], this.anIntArray61[local46], 0);
					}
					Static16.method448(this.aByteArrayArray1[local46], arg1, local11 + this.anIntArray59[local46], this.anIntArray60[local46], this.anIntArray61[local46], arg3);
				}
				arg1 += this.anIntArray60[local46];
			}
		}
		if (Static16.aBoolean32) {
			Static121.method1975(local3, local11 + (int) ((double) this.anInt555 * 0.7D), arg1 - local3, 8388608);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rd;IIIZI)V")
	public void method441(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt555;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt2746; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray33[local22] == 64 && local22 + 4 < arg0.anInt2746 && arg0.aByteArray33[local22 + 4] == 64) {
				local55 = this.method459(arg0.method1820(local22 + 4, local22 + 1));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray33[local22] & 0xFF;
				if (local55 != 32) {
					Static16.method453(this.aByteArrayArray1[local55], arg1 + 1, local20 + this.anIntArray59[local55] + 1, this.anIntArray60[local55], this.anIntArray61[local55], 0, 192);
					Static16.method453(this.aByteArrayArray1[local55], arg1, local20 + this.anIntArray59[local55], this.anIntArray60[local55], this.anIntArray61[local55], arg2, local15);
				}
				arg1 += this.anIntArray60[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)I")
	public int method442(@OriginalArg(0) int arg0) {
		return this.anIntArray60[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rd;I)I")
	public int method443(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = this.method451(arg0, arg1, true);
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < local5; local9++) {
			@Pc(16) int local16 = this.method450(Static16.aClass63Array4[local9]);
			if (local16 > local7) {
				local7 = local16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rd;)I")
	public int method444(@OriginalArg(0) Class63 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2746; local7++) {
			if (arg0.aByteArray33[local7] == 64 && local7 + 4 < arg0.anInt2746 && arg0.aByteArray33[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray60[arg0.aByteArray33[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rd;IIIIIZIII)V")
	public void method445(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg9 == 0) {
			arg9 = this.anInt555;
		}
		@Pc(9) boolean local9 = true;
		if (arg4 < this.anInt556 + this.anInt557 + arg9 && arg4 < arg9 + arg9) {
			local9 = false;
		}
		@Pc(31) int local31 = this.method451(arg0, arg3, local9);
		if (arg8 == 3 && local31 == 1) {
			arg8 = 1;
		}
		@Pc(46) int local46;
		@Pc(107) int local107;
		if (arg8 == 0) {
			local46 = arg2 + this.anInt556;
		} else if (arg8 == 1) {
			local46 = arg2 + this.anInt556 + (arg4 - this.anInt556 - this.anInt557 - (local31 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local46 = arg2 + arg4 - this.anInt557 - (local31 - 1) * arg9;
		} else {
			local107 = (arg4 - this.anInt556 - this.anInt557 - (local31 - 1) * arg9) / (local31 + 1);
			if (local107 < 0) {
				local107 = 0;
			}
			local46 = arg2 + this.anInt556 + local107;
			arg9 += local107;
		}
		for (local107 = 0; local107 < local31; local107++) {
			if (arg7 == 0) {
				this.method440(Static16.aClass63Array4[local107], arg1, local46, arg5, arg6);
			} else if (arg7 == 1) {
				this.method460(Static16.aClass63Array4[local107], arg1 + arg3 / 2, local46, arg5, arg6);
			} else if (arg7 == 2) {
				this.method462(Static16.aClass63Array4[local107], arg1 + arg3, local46, arg5, arg6);
			} else if (local107 == local31 - 1) {
				this.method440(Static16.aClass63Array4[local107], arg1, local46, arg5, arg6);
			} else {
				this.method458(Static16.aClass63Array4[local107], arg1, local46, arg5, arg6, arg3);
			}
			local46 += arg9;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!rd;I)I")
	public int method446(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return this.method451(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!rd;)I")
	public int method450(@OriginalArg(0) Class63 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt2746; local7++) {
			local5 += this.anIntArray60[arg0.aByteArray33[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rd;IZ)I")
	private int method451(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) Class63 local7 = Static64.method1203();
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) Class63 local13 = null;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method1811();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method1810(local27);
			if (local33 == 64 && local27 + 4 < local25 && arg0.method1810(local27 + 4) == 64) {
				@Pc(57) Class63 local57 = arg0.method1820(local27 + 5, local27);
				if (local57.method1819(Static16.aClass63_379)) {
					local17 = true;
					local19 = local7.method1811();
				} else {
					local13 = local57;
					local15 = local7.method1811();
				}
				local7.method1813(local57);
				local27 += 4;
			} else if (local33 == 92 && local27 + 1 < local25 && arg0.method1810(local27 + 1) == 110) {
				Static16.aClass63Array4[local21++] = local7.method1820(local7.method1811(), local3).method1833();
				local3 = local7.method1811();
				local1 = 0;
				local9 = -1;
				local27++;
				local13 = null;
				local17 = false;
			} else {
				local7.method1815(local33);
				local1 += this.method442(local33);
				if (local33 == 32 || local33 == 45) {
					local9 = local7.method1811();
					local11 = local1;
				}
				if (arg2 && local1 > arg1 && local9 >= 0) {
					Static16.aClass63Array4[local21++] = local7.method1820(local9, local3).method1833();
					local3 = local9;
					local9 = -1;
					local1 -= local11;
					if (local13 != null && local15 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1817(local3, local13);
					}
					if (local17 && local19 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method1817(local3, Static16.aClass63_378);
					}
				}
			}
		}
		if (local7.method1811() > local3) {
			Static16.aClass63Array4[local21++] = local7.method1820(local7.method1811(), local3).method1833();
		}
		return local21;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rd;IIII)V")
	public void method452(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method450(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt555;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2746; local17++) {
			@Pc(25) int local25 = arg0.aByteArray33[local17] & 0xFF;
			if (local25 != 32) {
				Static16.method448(this.aByteArrayArray1[local25], arg1, local15 + this.anIntArray59[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray60[local25], this.anIntArray61[local25], arg3);
			}
			arg1 += this.anIntArray60[local25];
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!rd;IIII)V")
	public void method454(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method450(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt555;
		for (@Pc(17) int local17 = 0; local17 < arg0.method1811(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray33[local17] & 0xFF;
			if (local25 != 32) {
				Static16.method448(this.aByteArrayArray1[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray59[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray60[local25], this.anIntArray61[local25], arg3);
			}
			arg1 += this.anIntArray60[local25];
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rd;III)V")
	public void method455(@OriginalArg(0) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method456(arg0, 507 - this.method450(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!rd;III)V")
	public void method456(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt555;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt2746; local9++) {
			@Pc(17) int local17 = arg0.aByteArray33[local9] & 0xFF;
			if (local17 != 32) {
				Static16.method448(this.aByteArrayArray1[local17], arg1, local7 + this.anIntArray59[local17], this.anIntArray60[local17], this.anIntArray61[local17], arg3);
			}
			arg1 += this.anIntArray60[local17];
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lclient!rd;III)V")
	public void method457(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method456(arg0, arg1 - this.method450(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!rd;IIIZI)V")
	private void method458(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class63 local3 = arg0.method1833();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3.method1811(); local7++) {
			if (local3.method1810(local7) == 32) {
				local5++;
			}
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		if (local5 > 0) {
			local23 = (arg5 - this.method444(local3)) * 256 / local5;
		}
		Static16.aBoolean32 = false;
		@Pc(41) int local41 = arg1;
		if (local3 == null) {
			return;
		}
		@Pc(49) int local49 = arg2 - this.anInt555;
		for (@Pc(51) int local51 = 0; local51 < local3.anInt2746; local51++) {
			@Pc(84) int local84;
			if (local3.aByteArray33[local51] == 64 && local51 + 4 < local3.anInt2746 && local3.aByteArray33[local51 + 4] == 64) {
				local84 = this.method459(local3.method1820(local51 + 4, local51 + 1));
				if (local84 != -1) {
					arg3 = local84;
				}
				local51 += 4;
			} else {
				local84 = local3.aByteArray33[local51] & 0xFF;
				if (local84 != 32) {
					if (arg4) {
						Static16.method448(this.aByteArrayArray1[local84], arg1 + 1, local49 + this.anIntArray59[local84] + 1, this.anIntArray60[local84], this.anIntArray61[local84], 0);
					}
					Static16.method448(this.aByteArrayArray1[local84], arg1, local49 + this.anIntArray59[local84], this.anIntArray60[local84], this.anIntArray61[local84], arg3);
				}
				arg1 += this.anIntArray60[local84];
				if (local84 == 32) {
					local25 += local23;
					arg1 += local25 / 256;
					local25 &= 0xFF;
				}
			}
		}
		if (Static16.aBoolean32) {
			Static121.method1975(local41, local49 + (int) ((double) this.anInt555 * 0.7D), arg1 - local41, 8388608);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lclient!rd;)I")
	private int method459(@OriginalArg(0) Class63 arg0) {
		if (arg0.method1819(Static16.aClass63_372)) {
			return 16711680;
		} else if (arg0.method1819(Static16.aClass63_367)) {
			return 65280;
		} else if (arg0.method1819(Static16.aClass63_366)) {
			return 255;
		} else if (arg0.method1819(Static16.aClass63_368)) {
			return 16776960;
		} else if (arg0.method1819(Static16.aClass63_380)) {
			return 65535;
		} else if (arg0.method1819(Static16.aClass63_384)) {
			return 16711935;
		} else if (arg0.method1819(Static16.aClass63_377)) {
			return 16777215;
		} else if (arg0.method1819(Static16.aClass63_375)) {
			return 0;
		} else if (arg0.method1819(Static16.aClass63_369)) {
			return 16748608;
		} else if (arg0.method1819(Static16.aClass63_383)) {
			return 8388608;
		} else if (arg0.method1819(Static16.aClass63_374)) {
			return 128;
		} else if (arg0.method1819(Static16.aClass63_370)) {
			return 16756736;
		} else if (arg0.method1819(Static16.aClass63_376)) {
			return 16740352;
		} else if (arg0.method1819(Static16.aClass63_371)) {
			return 16723968;
		} else if (arg0.method1819(Static16.aClass63_373)) {
			return 12648192;
		} else if (arg0.method1819(Static16.aClass63_381)) {
			return 8453888;
		} else if (arg0.method1819(Static16.aClass63_382)) {
			return 4259584;
		} else {
			if (arg0.method1819(Static16.aClass63_379)) {
				Static16.aBoolean32 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!rd;IIIZ)V")
	public void method460(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method440(arg0, arg1 - this.method444(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lclient!rd;IIIZ)V")
	public void method462(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method440(arg0, arg1 - this.method444(arg0), arg2, arg3, arg4);
	}
}
