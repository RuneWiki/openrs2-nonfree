import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class5_Sub1_Sub15 extends Class5_Sub1 {

	@OriginalMember(owner = "client!td", name = "db", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!td", name = "tb", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!td", name = "yb", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!td", name = "Nb", descriptor = "I")
	public int anInt2568;

	@OriginalMember(owner = "client!td", name = "Pb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "Z")
	public boolean aBoolean111 = true;

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
	private int anInt2547 = 128;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "I")
	private int anInt2543 = -1;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
	public int anInt2544 = 16;

	@OriginalMember(owner = "client!td", name = "rb", descriptor = "I")
	public int anInt2554 = -1;

	@OriginalMember(owner = "client!td", name = "nb", descriptor = "I")
	public int anInt2551 = -1;

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "I")
	public int anInt2549 = 0;

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
	private int anInt2546 = 0;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
	public int anInt2545 = -1;

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!td", name = "Ab", descriptor = "I")
	public int anInt2560 = -1;

	@OriginalMember(owner = "client!td", name = "zb", descriptor = "I")
	public int anInt2559 = 1;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!td", name = "Fb", descriptor = "I")
	public int anInt2565 = 0;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "Z")
	public boolean aBoolean112 = false;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "I")
	public int anInt2541 = 0;

	@OriginalMember(owner = "client!td", name = "Ib", descriptor = "Z")
	public boolean aBoolean115 = false;

	@OriginalMember(owner = "client!td", name = "Ub", descriptor = "I")
	public int anInt2574 = -1;

	@OriginalMember(owner = "client!td", name = "Gb", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!td", name = "Cb", descriptor = "I")
	private int anInt2562 = 0;

	@OriginalMember(owner = "client!td", name = "Ob", descriptor = "I")
	private int anInt2569 = 0;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "Z")
	public boolean aBoolean109 = true;

	@OriginalMember(owner = "client!td", name = "ob", descriptor = "I")
	private int anInt2552 = 128;

	@OriginalMember(owner = "client!td", name = "Vb", descriptor = "I")
	private int anInt2575 = 0;

	@OriginalMember(owner = "client!td", name = "Sb", descriptor = "I")
	public int anInt2572 = 1;

	@OriginalMember(owner = "client!td", name = "Wb", descriptor = "Z")
	public boolean aBoolean116 = true;

	@OriginalMember(owner = "client!td", name = "cc", descriptor = "I")
	private int anInt2580 = 128;

	@OriginalMember(owner = "client!td", name = "Yb", descriptor = "I")
	public int anInt2576 = -1;

	@OriginalMember(owner = "client!td", name = "Lb", descriptor = "Lclient!vc;")
	public Class71 aClass71_1255 = Static16.aClass71_327;

	@OriginalMember(owner = "client!td", name = "bc", descriptor = "I")
	private int anInt2579 = -1;

	@OriginalMember(owner = "client!td", name = "ac", descriptor = "I")
	public int anInt2578 = 0;

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "[Lclient!vc;")
	public final Class71[] aClass71Array14 = new Class71[5];

	@OriginalMember(owner = "client!td", name = "dc", descriptor = "I")
	private int anInt2581 = 0;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(B)Z")
	public boolean method1704() {
		if (this.anIntArray268 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray268.length; local14++) {
			local12 &= Static23.aClass24_5.method656(this.anIntArray268[local14] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!qe;)V")
	public void method1705(@OriginalArg(1) Class5_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1546();
			if (local5 == 0) {
				return;
			}
			this.method1716(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)Z")
	public boolean method1707(@OriginalArg(1) int arg0) {
		if (this.anIntArray266 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.anIntArray266.length; local53++) {
				if (arg0 == this.anIntArray266[local53]) {
					return Static23.aClass24_5.method656(this.anIntArray268[local53] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray268 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(26) boolean local26 = true;
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray268.length; local28++) {
				local26 &= Static23.aClass24_5.method656(this.anIntArray268[local28] & 0xFFFF, 0);
			}
			return local26;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(B)Z")
	public boolean method1708() {
		if (this.anIntArray267 == null) {
			return this.anInt2554 != -1 || this.anIntArray269 != null;
		}
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray267.length; local30++) {
			if (this.anIntArray267[local30] != -1) {
				@Pc(46) Class5_Sub1_Sub15 local46 = Static97.method1606(this.anIntArray267[local30]);
				if (local46.anInt2554 != -1 || local46.anIntArray269 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIBI)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18;
		if (this.anIntArray266 == null) {
			local18 = arg4 + (this.anInt2568 << 10);
		} else {
			local18 = (arg0 << 3) + (this.anInt2568 << 10) + arg4;
		}
		@Pc(34) Class5_Sub1_Sub1_Sub2 local34 = (Class5_Sub1_Sub1_Sub2) Static98.aClass54_33.method1397(local18);
		if (local34 == null) {
			@Pc(42) Class5_Sub1_Sub1_Sub7 local42 = this.method1715(arg0, arg4);
			if (local42 == null) {
				return null;
			}
			local34 = local42.method1987(this.anInt2581 + 64, this.anInt2575 * 5 + 768, -50, -10, -50);
			Static98.aClass54_33.method1399(local34, local18);
		}
		if (this.aBoolean114) {
			local34 = local34.method235(arg1, arg3, arg5, arg2, true);
		}
		return local34;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIILclient!wc;II)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub1_Sub18 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) long local13;
		if (this.anIntArray266 == null) {
			local13 = (this.anInt2568 << 10) + arg2;
		} else {
			local13 = (arg4 << 3) + (this.anInt2568 << 10) + arg2;
		}
		@Pc(38) Class5_Sub1_Sub1_Sub2 local38 = (Class5_Sub1_Sub1_Sub2) Static98.aClass54_33.method1397(local13);
		if (local38 == null) {
			@Pc(52) Class5_Sub1_Sub1_Sub7 local52 = this.method1715(arg4, arg2);
			if (local52 == null) {
				return null;
			}
			local38 = local52.method1987(this.anInt2581 + 64, 768 - -(this.anInt2575 * 5), -50, -10, -50);
			Static98.aClass54_33.method1399(local38, local13);
		}
		if (arg5 == null && !this.aBoolean114) {
			return local38;
		}
		if (arg5 == null) {
			local38 = local38.method243(true);
		} else {
			local38 = arg5.method1951(arg0, local38, arg2);
		}
		if (this.aBoolean114) {
			local38.method235(arg7, arg3, arg1, arg6, false);
		}
		return local38;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Lclient!td;")
	public Class5_Sub1_Sub15 method1712() {
		@Pc(18) int local18 = -1;
		if (this.anInt2579 != -1) {
			local18 = Static104.method2007(this.anInt2579);
		} else if (this.anInt2543 != -1) {
			local18 = Static23.anIntArray87[this.anInt2543];
		}
		return local18 < 0 || local18 >= this.anIntArray267.length || this.anIntArray267[local18] == -1 ? null : Static97.method1606(this.anIntArray267[local18]);
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	public void method1713() {
		if (this.anInt2576 == -1) {
			this.anInt2576 = 0;
			if (this.anIntArray268 != null && (this.anIntArray266 == null || this.anIntArray266[0] == 10)) {
				this.anInt2576 = 1;
			}
			for (@Pc(33) int local33 = 0; local33 < 5; local33++) {
				if (this.aClass71Array14[local33] != null) {
					this.anInt2576 = 1;
				}
			}
		}
		if (this.anInt2551 == -1) {
			this.anInt2551 = this.aBoolean111 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BII)Lclient!wd;")
	private Class5_Sub1_Sub1_Sub7 method1715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class5_Sub1_Sub1_Sub7 local7 = null;
		@Pc(30) boolean local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (this.anIntArray266 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray268 == null) {
				return null;
			}
			local30 = arg1 > 3 ^ this.aBoolean113;
			local34 = this.anIntArray268.length;
			for (local36 = 0; local36 < local34; local36++) {
				local42 = this.anIntArray268[local36];
				if (local30) {
					local42 += 65536;
				}
				local7 = (Class5_Sub1_Sub1_Sub7) Static48.aClass54_23.method1397((long) local42);
				if (local7 == null) {
					local7 = Static120.method1985(Static23.aClass24_5, local42 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local30) {
						local7.method1997();
					}
					Static48.aClass54_23.method1399(local7, (long) local42);
				}
				if (local34 > 1) {
					Static50.aClass5_Sub1_Sub1_Sub7Array1[local36] = local7;
				}
			}
			if (local34 > 1) {
				local7 = new Class5_Sub1_Sub1_Sub7(Static50.aClass5_Sub1_Sub1_Sub7Array1, local34);
			}
		} else {
			@Pc(103) int local103 = -1;
			for (local34 = 0; local34 < this.anIntArray266.length; local34++) {
				if (this.anIntArray266[local34] == arg0) {
					local103 = local34;
					break;
				}
			}
			if (local103 == -1) {
				return null;
			}
			local36 = this.anIntArray268[local103];
			@Pc(151) boolean local151 = arg1 > 3 ^ this.aBoolean113;
			if (local151) {
				local36 += 65536;
			}
			local7 = (Class5_Sub1_Sub1_Sub7) Static48.aClass54_23.method1397((long) local36);
			if (local7 == null) {
				local7 = Static120.method1985(Static23.aClass24_5, local36 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local151) {
					local7.method1997();
				}
				Static48.aClass54_23.method1399(local7, (long) local36);
			}
		}
		if (this.anInt2580 == 128 && this.anInt2547 == 128 && this.anInt2552 == 128) {
			local30 = false;
		} else {
			local30 = true;
		}
		@Pc(227) boolean local227;
		if (this.anInt2562 == 0 && this.anInt2569 == 0 && this.anInt2546 == 0) {
			local227 = false;
		} else {
			local227 = true;
		}
		@Pc(255) Class5_Sub1_Sub1_Sub7 local255 = new Class5_Sub1_Sub1_Sub7(local7, arg1 == 0 && !local30 && !local227, this.aShortArray8 == null, true);
		@Pc(259) int local259 = arg1 & 0x3;
		if (local259 == 1) {
			local255.method1998();
		} else if (local259 == 2) {
			local255.method1992();
		} else if (local259 == 3) {
			local255.method1991();
		}
		if (this.aShortArray8 != null) {
			for (local42 = 0; local42 < this.aShortArray8.length; local42++) {
				local255.method1988(this.aShortArray8[local42], this.aShortArray7[local42]);
			}
		}
		if (local30) {
			local255.method1982(this.anInt2580, this.anInt2547, this.anInt2552);
		}
		if (local227) {
			local255.method1994(this.anInt2562, this.anInt2569, this.anInt2546);
		}
		return local255;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!qe;ZI)V")
	private void method1716(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(26) int local26;
		@Pc(55) int local55;
		if (arg1 == 1) {
			local26 = arg0.method1546();
			if (local26 > 0) {
				if (this.anIntArray268 == null || Static20.aBoolean27) {
					this.anIntArray268 = new int[local26];
					this.anIntArray266 = new int[local26];
					for (local55 = 0; local55 < local26; local55++) {
						this.anIntArray268[local55] = arg0.method1543();
						this.anIntArray266[local55] = arg0.method1546();
					}
				} else {
					arg0.anInt2233 += local26 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass71_1255 = arg0.method1541();
		} else if (arg1 == 5) {
			local26 = arg0.method1546();
			if (local26 > 0) {
				if (this.anIntArray268 == null || Static20.aBoolean27) {
					this.anIntArray266 = null;
					this.anIntArray268 = new int[local26];
					for (local55 = 0; local55 < local26; local55++) {
						this.anIntArray268[local55] = arg0.method1543();
					}
				} else {
					arg0.anInt2233 += local26 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt2559 = arg0.method1546();
		} else if (arg1 == 15) {
			this.anInt2572 = arg0.method1546();
		} else if (arg1 == 17) {
			this.aBoolean111 = false;
		} else if (arg1 == 18) {
			this.aBoolean109 = false;
		} else if (arg1 == 19) {
			this.anInt2576 = arg0.method1546();
		} else if (arg1 == 21) {
			this.aBoolean114 = true;
		} else if (arg1 == 22) {
			this.aBoolean108 = true;
		} else if (arg1 == 23) {
			this.aBoolean110 = true;
		} else if (arg1 == 24) {
			this.anInt2574 = arg0.method1543();
			if (this.anInt2574 == 65535) {
				this.anInt2574 = -1;
			}
		} else if (arg1 == 28) {
			this.anInt2544 = arg0.method1546();
		} else if (arg1 == 29) {
			this.anInt2581 = arg0.method1524();
		} else if (arg1 == 39) {
			this.anInt2575 = arg0.method1524() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass71Array14[arg1 - 30] = arg0.method1541();
			if (this.aClass71Array14[arg1 - 30].method1785(Static23.aClass71_420)) {
				this.aClass71Array14[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local26 = arg0.method1546();
			this.aShortArray8 = new short[local26];
			this.aShortArray7 = new short[local26];
			for (local55 = 0; local55 < local26; local55++) {
				this.aShortArray8[local55] = (short) arg0.method1543();
				this.aShortArray7[local55] = (short) arg0.method1543();
			}
		} else if (arg1 == 60) {
			this.anInt2545 = arg0.method1543();
		} else if (arg1 == 62) {
			this.aBoolean113 = true;
		} else if (arg1 == 64) {
			this.aBoolean116 = false;
		} else if (arg1 == 65) {
			this.anInt2580 = arg0.method1543();
		} else if (arg1 == 66) {
			this.anInt2547 = arg0.method1543();
		} else if (arg1 == 67) {
			this.anInt2552 = arg0.method1543();
		} else if (arg1 == 68) {
			this.anInt2560 = arg0.method1543();
		} else if (arg1 == 69) {
			this.anInt2541 = arg0.method1546();
		} else if (arg1 == 70) {
			this.anInt2562 = arg0.method1544();
		} else if (arg1 == 71) {
			this.anInt2569 = arg0.method1544();
		} else if (arg1 == 72) {
			this.anInt2546 = arg0.method1544();
		} else if (arg1 == 73) {
			this.aBoolean112 = true;
		} else if (arg1 == 74) {
			this.aBoolean115 = true;
		} else if (arg1 == 75) {
			this.anInt2551 = arg0.method1546();
		} else if (arg1 == 77) {
			this.anInt2579 = arg0.method1543();
			if (this.anInt2579 == 65535) {
				this.anInt2579 = -1;
			}
			this.anInt2543 = arg0.method1543();
			if (this.anInt2543 == 65535) {
				this.anInt2543 = -1;
			}
			local26 = arg0.method1546();
			this.anIntArray267 = new int[local26 + 1];
			for (local55 = 0; local55 <= local26; local55++) {
				this.anIntArray267[local55] = arg0.method1543();
				if (this.anIntArray267[local55] == 65535) {
					this.anIntArray267[local55] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt2554 = arg0.method1543();
			this.anInt2549 = arg0.method1546();
		} else if (arg1 == 79) {
			this.anInt2565 = arg0.method1543();
			this.anInt2578 = arg0.method1543();
			this.anInt2549 = arg0.method1546();
			local26 = arg0.method1546();
			this.anIntArray269 = new int[local26];
			for (local55 = 0; local55 < local26; local55++) {
				this.anIntArray269[local55] = arg0.method1543();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)Lclient!pe;")
	public Class5_Sub1_Sub1 method1717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray266 == null) {
			local20 = (this.anInt2568 << 10) + arg1;
		} else {
			local20 = (arg0 << 3) + (this.anInt2568 << 10) + arg1;
		}
		@Pc(37) Class5_Sub1_Sub1 local37 = (Class5_Sub1_Sub1) Static109.aClass54_37.method1397(local20);
		if (local37 == null) {
			@Pc(45) Class5_Sub1_Sub1_Sub7 local45 = this.method1715(arg0, arg1);
			if (local45 == null) {
				return null;
			}
			if (this.aBoolean108) {
				local45.aShort2 = (short) (this.anInt2581 + 64);
				local37 = local45;
				local45.aShort1 = (short) (this.anInt2575 * 5 + 768);
				local45.method1984();
			} else {
				local37 = local45.method1987(this.anInt2581 + 64, 768 - -(this.anInt2575 * 5), -50, -10, -50);
			}
			Static109.aClass54_37.method1399(local37, local20);
		}
		if (this.aBoolean108) {
			local37 = ((Class5_Sub1_Sub1_Sub7) local37).method1983();
		}
		if (this.aBoolean114) {
			if (local37 instanceof Class5_Sub1_Sub1_Sub2) {
				local37 = ((Class5_Sub1_Sub1_Sub2) local37).method235(arg3, arg4, arg5, arg2, true);
			} else if (local37 instanceof Class5_Sub1_Sub1_Sub7) {
				local37 = ((Class5_Sub1_Sub1_Sub7) local37).method1989(arg3, arg4, arg5, arg2);
			}
		}
		return local37;
	}
}
