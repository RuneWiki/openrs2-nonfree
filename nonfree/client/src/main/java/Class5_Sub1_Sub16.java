import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class5_Sub1_Sub16 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ve", name = "cb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!ve", name = "ib", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!ve", name = "ub", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!ve", name = "Mb", descriptor = "I")
	public int anInt2823;

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "Lclient!vc;")
	public Class71 aClass71_1333 = Static94.aClass71_1102;

	@OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
	private int anInt2795 = -1;

	@OriginalMember(owner = "client!ve", name = "nb", descriptor = "I")
	public int anInt2806 = -1;

	@OriginalMember(owner = "client!ve", name = "wb", descriptor = "I")
	private int anInt2811 = 0;

	@OriginalMember(owner = "client!ve", name = "ob", descriptor = "Z")
	public boolean aBoolean125 = true;

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "I")
	public int anInt2802 = -1;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
	public int anInt2794 = -1;

	@OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
	private int anInt2800 = -1;

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "Z")
	public boolean aBoolean122 = true;

	@OriginalMember(owner = "client!ve", name = "rb", descriptor = "[Lclient!vc;")
	public final Class71[] aClass71Array16 = new Class71[5];

	@OriginalMember(owner = "client!ve", name = "Lb", descriptor = "I")
	public int anInt2822 = -1;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "Z")
	public boolean aBoolean123 = true;

	@OriginalMember(owner = "client!ve", name = "Fb", descriptor = "I")
	public int anInt2818 = 32;

	@OriginalMember(owner = "client!ve", name = "Db", descriptor = "I")
	public int anInt2817 = -1;

	@OriginalMember(owner = "client!ve", name = "mb", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!ve", name = "Qb", descriptor = "I")
	public int anInt2827 = -1;

	@OriginalMember(owner = "client!ve", name = "Kb", descriptor = "I")
	public int anInt2821 = -1;

	@OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
	public int anInt2803 = -1;

	@OriginalMember(owner = "client!ve", name = "Nb", descriptor = "I")
	private int anInt2824 = 0;

	@OriginalMember(owner = "client!ve", name = "Pb", descriptor = "I")
	private int anInt2826 = 128;

	@OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
	public int anInt2798 = -1;

	@OriginalMember(owner = "client!ve", name = "Tb", descriptor = "I")
	private int anInt2830 = 128;

	@OriginalMember(owner = "client!ve", name = "Hb", descriptor = "I")
	public int anInt2819 = 1;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)Lclient!wd;")
	public Class5_Sub1_Sub1_Sub7 method1887() {
		if (this.anIntArray284 != null) {
			@Pc(20) Class5_Sub1_Sub16 local20 = this.method1891();
			return local20 == null ? null : local20.method1887();
		} else if (this.anIntArray283 == null) {
			return null;
		} else {
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < this.anIntArray283.length; local37++) {
				if (!Static28.aClass24_8.method656(this.anIntArray283[local37], 0)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(65) Class5_Sub1_Sub1_Sub7[] local65 = new Class5_Sub1_Sub1_Sub7[this.anIntArray283.length];
			for (@Pc(67) int local67 = 0; local67 < this.anIntArray283.length; local67++) {
				local65[local67] = Static120.method1985(Static28.aClass24_8, this.anIntArray283[local67]);
			}
			@Pc(95) Class5_Sub1_Sub1_Sub7 local95;
			if (local65.length == 1) {
				local95 = local65[0];
			} else {
				local95 = new Class5_Sub1_Sub1_Sub7(local65, local65.length);
			}
			if (this.aShortArray9 != null) {
				for (@Pc(109) int local109 = 0; local109 < this.aShortArray9.length; local109++) {
					local95.method1988(this.aShortArray9[local109], this.aShortArray10[local109]);
				}
			}
			return local95;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!wc;ILclient!wc;II)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1888(@OriginalArg(0) Class5_Sub1_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub18 arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray284 != null) {
			@Pc(12) Class5_Sub1_Sub16 local12 = this.method1891();
			return local12 == null ? null : local12.method1888(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class5_Sub1_Sub1_Sub2 local32 = (Class5_Sub1_Sub1_Sub2) Static2.aClass54_30.method1397((long) this.anInt2823);
		if (local32 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray282.length; local43++) {
				if (!Static28.aClass24_8.method656(this.anIntArray282[local43], 0)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(75) Class5_Sub1_Sub1_Sub7[] local75 = new Class5_Sub1_Sub1_Sub7[this.anIntArray282.length];
			for (@Pc(77) int local77 = 0; local77 < this.anIntArray282.length; local77++) {
				local75[local77] = Static120.method1985(Static28.aClass24_8, this.anIntArray282[local77]);
			}
			@Pc(108) Class5_Sub1_Sub1_Sub7 local108;
			if (local75.length == 1) {
				local108 = local75[0];
			} else {
				local108 = new Class5_Sub1_Sub1_Sub7(local75, local75.length);
			}
			if (this.aShortArray9 != null) {
				for (@Pc(119) int local119 = 0; local119 < this.aShortArray9.length; local119++) {
					local108.method1988(this.aShortArray9[local119], this.aShortArray10[local119]);
				}
			}
			local32 = local108.method1987(this.anInt2811 + 64, this.anInt2824 + 850, -30, -50, -30);
			Static2.aClass54_30.method1399(local32, (long) this.anInt2823);
		}
		@Pc(174) Class5_Sub1_Sub1_Sub2 local174;
		if (arg2 != null && arg0 != null) {
			local174 = arg2.method1954(arg1, arg3, arg0, local32);
		} else if (arg2 != null) {
			local174 = arg2.method1958(arg1, local32);
		} else if (arg0 == null) {
			local174 = local32.method243(true);
		} else {
			local174 = arg0.method1958(arg3, local32);
		}
		if (this.anInt2826 != 128 || this.anInt2830 != 128) {
			local174.method236(this.anInt2826, this.anInt2830, this.anInt2826);
		}
		return local174;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(Z)Lclient!ve;")
	public Class5_Sub1_Sub16 method1891() {
		@Pc(5) int local5 = -1;
		if (this.anInt2800 != -1) {
			local5 = Static104.method2007(this.anInt2800);
		} else if (this.anInt2795 != -1) {
			local5 = Static23.anIntArray87[this.anInt2795];
		}
		return local5 < 0 || this.anIntArray284.length <= local5 || this.anIntArray284[local5] == -1 ? null : Static56.method994(this.anIntArray284[local5]);
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	public void method1894() {
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)Z")
	public boolean method1895() {
		if (this.anIntArray284 == null) {
			return true;
		}
		@Pc(14) int local14 = -1;
		if (this.anInt2800 != -1) {
			local14 = Static104.method2007(this.anInt2800);
		} else if (this.anInt2795 != -1) {
			local14 = Static23.anIntArray87[this.anInt2795];
		}
		return local14 >= 0 && local14 < this.anIntArray284.length && this.anIntArray284[local14] != -1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILclient!qe;)V")
	private void method1897(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub11 arg1) {
		@Pc(215) int local215;
		@Pc(223) int local223;
		if (arg0 == 1) {
			local215 = arg1.method1546();
			this.anIntArray282 = new int[local215];
			for (local223 = 0; local223 < local215; local223++) {
				this.anIntArray282[local223] = arg1.method1543();
			}
		} else if (arg0 == 2) {
			this.aClass71_1333 = arg1.method1541();
		} else if (arg0 == 12) {
			this.anInt2819 = arg1.method1546();
		} else if (arg0 == 13) {
			this.anInt2822 = arg1.method1543();
		} else if (arg0 == 14) {
			this.anInt2802 = arg1.method1543();
		} else if (arg0 == 15) {
			this.anInt2803 = arg1.method1543();
		} else if (arg0 == 16) {
			this.anInt2794 = arg1.method1543();
		} else if (arg0 == 17) {
			this.anInt2802 = arg1.method1543();
			this.anInt2817 = arg1.method1543();
			this.anInt2821 = arg1.method1543();
			this.anInt2806 = arg1.method1543();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass71Array16[arg0 - 30] = arg1.method1541();
			if (this.aClass71Array16[arg0 - 30].method1785(Static23.aClass71_420)) {
				this.aClass71Array16[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local215 = arg1.method1546();
			this.aShortArray9 = new short[local215];
			this.aShortArray10 = new short[local215];
			for (local223 = 0; local223 < local215; local223++) {
				this.aShortArray9[local223] = (short) arg1.method1543();
				this.aShortArray10[local223] = (short) arg1.method1543();
			}
		} else if (arg0 == 60) {
			local215 = arg1.method1546();
			this.anIntArray283 = new int[local215];
			for (local223 = 0; local223 < local215; local223++) {
				this.anIntArray283[local223] = arg1.method1543();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean122 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt2827 = arg1.method1543();
			return;
		} else if (arg0 == 97) {
			this.anInt2826 = arg1.method1543();
			return;
		} else if (arg0 == 98) {
			this.anInt2830 = arg1.method1543();
			return;
		} else if (arg0 == 99) {
			this.aBoolean124 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt2811 = arg1.method1524();
			return;
		} else if (arg0 == 101) {
			this.anInt2824 = arg1.method1524() * 5;
			return;
		} else {
			if (arg0 == 102) {
				this.anInt2798 = arg1.method1543();
			} else if (arg0 == 103) {
				this.anInt2818 = arg1.method1543();
				return;
			} else if (arg0 == 106) {
				this.anInt2800 = arg1.method1543();
				if (this.anInt2800 == 65535) {
					this.anInt2800 = -1;
				}
				this.anInt2795 = arg1.method1543();
				if (this.anInt2795 == 65535) {
					this.anInt2795 = -1;
				}
				local215 = arg1.method1546();
				this.anIntArray284 = new int[local215 + 1];
				for (local223 = 0; local223 <= local215; local223++) {
					this.anIntArray284[local223] = arg1.method1543();
					if (this.anIntArray284[local223] == 65535) {
						this.anIntArray284[local223] = -1;
					}
				}
				return;
			} else if (arg0 == 107) {
				this.aBoolean123 = false;
				return;
			} else if (arg0 == 109) {
				this.aBoolean125 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!qe;B)V")
	public void method1899(@OriginalArg(0) Class5_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1546();
			if (local9 == 0) {
				return;
			}
			this.method1897(local9, arg0);
		}
	}
}
