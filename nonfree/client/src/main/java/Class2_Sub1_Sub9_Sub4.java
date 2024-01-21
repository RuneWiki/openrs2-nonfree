import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub1_Sub9_Sub4 extends Class2_Sub1_Sub9 {

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[[B")
	private byte[][] aByteArrayArray9 = new byte[256][];

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
	public int anInt2980 = 0;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "Ljava/util/Random;")
	private final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!v", name = "wb", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!v", name = "ob", descriptor = "[I")
	private final int[] anIntArray390;

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!v", name = "xb", descriptor = "I")
	private int anInt2981;

	@OriginalMember(owner = "client!v", name = "yb", descriptor = "I")
	private int anInt2982;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class2_Sub1_Sub9_Sub4(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray391 = arg0;
		this.anIntArray390 = arg1;
		this.anIntArray389 = arg2;
		@Pc(24) byte local24 = 0;
		for (@Pc(26) int local26 = 1; local26 < arg3.length; local26++) {
			if (arg3[local26] == 1) {
				local24 = (byte) local26;
			}
		}
		this.aByteArrayArray9 = arg4;
		@Pc(45) int local45 = Integer.MAX_VALUE;
		@Pc(47) int local47 = Integer.MIN_VALUE;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			if (this.anIntArray391[local49] < local45 && this.anIntArray389[local49] != 0) {
				local45 = this.anIntArray391[local49];
			}
			if (this.anIntArray391[local49] + this.anIntArray389[local49] > local47) {
				local47 = this.anIntArray391[local49] + this.anIntArray389[local49];
			}
			@Pc(92) byte[] local92 = this.aByteArrayArray9[local49];
			@Pc(95) int local95 = local92.length;
			for (@Pc(97) int local97 = 0; local97 < local95; local97++) {
				local92[local97] = (byte) (local92[local97] == local24 ? 0 : 1);
			}
		}
		this.anInt2980 = this.anIntArray391[32] + this.anIntArray389[32];
		this.anInt2981 = this.anInt2980 - local45;
		this.anInt2982 = local47 - this.anInt2980;
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub9_Sub4(@OriginalArg(0) byte[] arg0) {
		this.anIntArray390 = new int[arg0.length];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray390.length; local20++) {
			this.anIntArray390[local20] = arg0[local20] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wd;III)V")
	public void method1906(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1925(arg0, 507 - this.method1910(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wd;IIIZI)V")
	public void method1907(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.aRandom1.setSeed((long) arg3);
		@Pc(15) int local15 = (this.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(20) int local20 = 15 - this.anInt2980;
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt3200; local22++) {
			@Pc(55) int local55;
			if (arg0.aByteArray40[local22] == 64 && local22 + 4 < arg0.anInt3200 && arg0.aByteArray40[local22 + 4] == 64) {
				local55 = this.method1916(arg0.method2027(local22 + 1, local22 + 4));
				if (local55 != -1) {
					arg2 = local55;
				}
				local22 += 4;
			} else {
				local55 = arg0.aByteArray40[local22] & 0xFF;
				if (local55 != 32) {
					Static117.method1920(this.aByteArrayArray9[local55], arg1 + 1, local20 + this.anIntArray391[local55] + 1, this.anIntArray390[local55], this.anIntArray389[local55], 0, 192);
					Static117.method1920(this.aByteArrayArray9[local55], arg1, local20 + this.anIntArray391[local55], this.anIntArray390[local55], this.anIntArray389[local55], arg2, local15);
				}
				arg1 += this.anIntArray390[local55];
				if ((this.aRandom1.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I")
	public int method1908(@OriginalArg(0) int arg0) {
		return this.anIntArray390[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wd;IIII)V")
	public void method1909(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method1910(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt2980;
		for (@Pc(17) int local17 = 0; local17 < arg0.method1999(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray40[local17] & 0xFF;
			if (local25 != 32) {
				Static117.method1917(this.aByteArrayArray9[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.anIntArray391[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray390[local25], this.anIntArray389[local25], arg3);
			}
			arg1 += this.anIntArray390[local25];
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wd;)I")
	public int method1910(@OriginalArg(0) Class80 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt3200; local7++) {
			local5 += this.anIntArray390[arg0.aByteArray40[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wd;I)I")
	public int method1911(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1) {
		return this.method1913(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wd;IIIIIZIII)V")
	public void method1912(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg9 == 0) {
			arg9 = this.anInt2980;
		}
		@Pc(9) boolean local9 = true;
		if (arg4 < this.anInt2981 + this.anInt2982 + arg9 && arg4 < arg9 + arg9) {
			local9 = false;
		}
		@Pc(31) int local31 = this.method1913(arg0, arg3, local9);
		if (arg8 == 3 && local31 == 1) {
			arg8 = 1;
		}
		@Pc(46) int local46;
		@Pc(107) int local107;
		if (arg8 == 0) {
			local46 = arg2 + this.anInt2981;
		} else if (arg8 == 1) {
			local46 = arg2 + this.anInt2981 + (arg4 - this.anInt2981 - this.anInt2982 - (local31 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local46 = arg2 + arg4 - this.anInt2982 - (local31 - 1) * arg9;
		} else {
			local107 = (arg4 - this.anInt2981 - this.anInt2982 - (local31 - 1) * arg9) / (local31 + 1);
			if (local107 < 0) {
				local107 = 0;
			}
			local46 = arg2 + this.anInt2981 + local107;
			arg9 += local107;
		}
		for (local107 = 0; local107 < local31; local107++) {
			if (arg7 == 0) {
				this.method1919(Static117.aClass80Array17[local107], arg1, local46, arg5, arg6);
			} else if (arg7 == 1) {
				this.method1927(Static117.aClass80Array17[local107], arg1 + arg3 / 2, local46, arg5, arg6);
			} else if (arg7 == 2) {
				this.method1922(Static117.aClass80Array17[local107], arg1 + arg3, local46, arg5, arg6);
			} else if (local107 == local31 - 1) {
				this.method1919(Static117.aClass80Array17[local107], arg1, local46, arg5, arg6);
			} else {
				this.method1918(Static117.aClass80Array17[local107], arg1, local46, arg5, arg6, arg3);
			}
			local46 += arg9;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wd;IZ)I")
	private int method1913(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) Class80 local7 = Static106.method1804();
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) Class80 local13 = null;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method1999();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method2031(local27);
			if (local33 == 64 && local27 + 4 < local25 && arg0.method2031(local27 + 4) == 64) {
				@Pc(57) Class80 local57 = arg0.method2027(local27, local27 + 5);
				if (local57.method2017(Static117.aClass80_1133)) {
					local17 = true;
					local19 = local7.method1999();
				} else {
					local13 = local57;
					local15 = local7.method1999();
				}
				local7.method2008(local57);
				local27 += 4;
			} else if (local33 == 92 && local27 + 1 < local25 && arg0.method2031(local27 + 1) == 110) {
				Static117.aClass80Array17[local21++] = local7.method2027(local3, local7.method1999()).method2026();
				local3 = local7.method1999();
				local1 = 0;
				local9 = -1;
				local27++;
				local13 = null;
				local17 = false;
			} else {
				local7.method2019(local33);
				local1 += this.method1908(local33);
				if (local33 == 32 || local33 == 45) {
					local9 = local7.method1999();
					local11 = local1;
				}
				if (arg2 && local1 > arg1 && local9 >= 0) {
					Static117.aClass80Array17[local21++] = local7.method2027(local3, local9).method2026();
					local3 = local9;
					local9 = -1;
					local1 -= local11;
					if (local13 != null && local15 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method2029(local3, local13);
					}
					if (local17 && local19 < local3 && local3 > 4) {
						local3 -= 5;
						local7.method2029(local3, Static117.aClass80_1132);
					}
				}
			}
		}
		if (local7.method1999() > local3) {
			Static117.aClass80Array17[local21++] = local7.method2027(local3, local7.method1999()).method2026();
		}
		return local21;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wd;IIIII)V")
	public void method1914(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method1910(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.anInt2980;
		for (@Pc(30) int local30 = 0; local30 < arg0.method1999(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray40[local30] & 0xFF;
			if (local38 != 32) {
				Static117.method1917(this.aByteArrayArray9[local38], arg1, local28 + this.anIntArray391[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray390[local38], this.anIntArray389[local38], arg3);
			}
			arg1 += this.anIntArray390[local38];
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!wd;)I")
	public int method1915(@OriginalArg(0) Class80 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt3200; local7++) {
			if (arg0.aByteArray40[local7] == 64 && local7 + 4 < arg0.anInt3200 && arg0.aByteArray40[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray390[arg0.aByteArray40[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(Lclient!wd;)I")
	private int method1916(@OriginalArg(0) Class80 arg0) {
		if (arg0.method2017(Static117.aClass80_1143)) {
			return 16711680;
		} else if (arg0.method2017(Static117.aClass80_1142)) {
			return 65280;
		} else if (arg0.method2017(Static117.aClass80_1147)) {
			return 255;
		} else if (arg0.method2017(Static117.aClass80_1148)) {
			return 16776960;
		} else if (arg0.method2017(Static117.aClass80_1138)) {
			return 65535;
		} else if (arg0.method2017(Static117.aClass80_1135)) {
			return 16711935;
		} else if (arg0.method2017(Static117.aClass80_1145)) {
			return 16777215;
		} else if (arg0.method2017(Static117.aClass80_1137)) {
			return 0;
		} else if (arg0.method2017(Static117.aClass80_1134)) {
			return 16748608;
		} else if (arg0.method2017(Static117.aClass80_1141)) {
			return 8388608;
		} else if (arg0.method2017(Static117.aClass80_1144)) {
			return 128;
		} else if (arg0.method2017(Static117.aClass80_1149)) {
			return 16756736;
		} else if (arg0.method2017(Static117.aClass80_1136)) {
			return 16740352;
		} else if (arg0.method2017(Static117.aClass80_1140)) {
			return 16723968;
		} else if (arg0.method2017(Static117.aClass80_1139)) {
			return 12648192;
		} else if (arg0.method2017(Static117.aClass80_1146)) {
			return 8453888;
		} else if (arg0.method2017(Static117.aClass80_1150)) {
			return 4259584;
		} else {
			if (arg0.method2017(Static117.aClass80_1133)) {
				Static117.aBoolean221 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!wd;IIIZI)V")
	private void method1918(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class80 local3 = arg0.method2026();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3.method1999(); local7++) {
			if (local3.method2031(local7) == 32) {
				local5++;
			}
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		if (local5 > 0) {
			local23 = (arg5 - this.method1915(local3)) * 256 / local5;
		}
		Static117.aBoolean221 = false;
		@Pc(41) int local41 = arg1;
		if (local3 == null) {
			return;
		}
		@Pc(49) int local49 = arg2 - this.anInt2980;
		for (@Pc(51) int local51 = 0; local51 < local3.anInt3200; local51++) {
			@Pc(84) int local84;
			if (local3.aByteArray40[local51] == 64 && local51 + 4 < local3.anInt3200 && local3.aByteArray40[local51 + 4] == 64) {
				local84 = this.method1916(local3.method2027(local51 + 1, local51 + 4));
				if (local84 != -1) {
					arg3 = local84;
				}
				local51 += 4;
			} else {
				local84 = local3.aByteArray40[local51] & 0xFF;
				if (local84 != 32) {
					if (arg4) {
						Static117.method1917(this.aByteArrayArray9[local84], arg1 + 1, local49 + this.anIntArray391[local84] + 1, this.anIntArray390[local84], this.anIntArray389[local84], 0);
					}
					Static117.method1917(this.aByteArrayArray9[local84], arg1, local49 + this.anIntArray391[local84], this.anIntArray390[local84], this.anIntArray389[local84], arg3);
				}
				arg1 += this.anIntArray390[local84];
				if (local84 == 32) {
					local25 += local23;
					arg1 += local25 / 256;
					local25 &= 0xFF;
				}
			}
		}
		if (Static117.aBoolean221) {
			Static99.method1889(local41, local49 + (int) ((double) this.anInt2980 * 0.7D), arg1 - local41, 8388608);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wd;IIIZ)V")
	public void method1919(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		Static117.aBoolean221 = false;
		@Pc(3) int local3 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 - this.anInt2980;
		for (@Pc(13) int local13 = 0; local13 < arg0.anInt3200; local13++) {
			@Pc(46) int local46;
			if (arg0.aByteArray40[local13] == 64 && local13 + 4 < arg0.anInt3200 && arg0.aByteArray40[local13 + 4] == 64) {
				local46 = this.method1916(arg0.method2027(local13 + 1, local13 + 4));
				if (local46 != -1) {
					arg3 = local46;
				}
				local13 += 4;
			} else {
				local46 = arg0.aByteArray40[local13] & 0xFF;
				if (local46 != 32) {
					if (arg4) {
						Static117.method1917(this.aByteArrayArray9[local46], arg1 + 1, local11 + this.anIntArray391[local46] + 1, this.anIntArray390[local46], this.anIntArray389[local46], 0);
					}
					Static117.method1917(this.aByteArrayArray9[local46], arg1, local11 + this.anIntArray391[local46], this.anIntArray390[local46], this.anIntArray389[local46], arg3);
				}
				arg1 += this.anIntArray390[local46];
			}
		}
		if (Static117.aBoolean221) {
			Static99.method1889(local3, local11 + (int) ((double) this.anInt2980 * 0.7D), arg1 - local3, 8388608);
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!wd;IIII)V")
	public void method1921(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method1910(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.anInt2980;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt3200; local17++) {
			@Pc(25) int local25 = arg0.aByteArray40[local17] & 0xFF;
			if (local25 != 32) {
				Static117.method1917(this.aByteArrayArray9[local25], arg1, local15 + this.anIntArray391[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray390[local25], this.anIntArray389[local25], arg3);
			}
			arg1 += this.anIntArray390[local25];
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!wd;IIIZ)V")
	public void method1922(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method1919(arg0, arg1 - this.method1915(arg0), arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!wd;III)V")
	public void method1924(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method1925(arg0, arg1 - this.method1910(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(Lclient!wd;III)V")
	public void method1925(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) int local7 = arg2 - this.anInt2980;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt3200; local9++) {
			@Pc(17) int local17 = arg0.aByteArray40[local9] & 0xFF;
			if (local17 != 32) {
				Static117.method1917(this.aByteArrayArray9[local17], arg1, local7 + this.anIntArray391[local17], this.anIntArray390[local17], this.anIntArray389[local17], arg3);
			}
			arg1 += this.anIntArray390[local17];
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!wd;I)I")
	public int method1926(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = this.method1913(arg0, arg1, true);
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < local5; local9++) {
			@Pc(16) int local16 = this.method1910(Static117.aClass80Array17[local9]);
			if (local16 > local7) {
				local7 = local16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(Lclient!wd;IIIZ)V")
	public void method1927(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method1919(arg0, arg1 - this.method1915(arg0) / 2, arg2, arg3, arg4);
	}
}
