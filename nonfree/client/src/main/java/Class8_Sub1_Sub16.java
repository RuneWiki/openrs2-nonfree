import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class8_Sub1_Sub16 extends Class8_Sub1 {

	@OriginalMember(owner = "client!s", name = "U", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
	public int anInt2428;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!s", name = "nb", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!s", name = "rb", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!s", name = "zb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!s", name = "Cb", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!s", name = "Jb", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "Z")
	public boolean aBoolean93 = true;

	@OriginalMember(owner = "client!s", name = "X", descriptor = "I")
	public int anInt2426 = -1;

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
	public int anInt2430 = -1;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
	public int anInt2429 = 32;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
	public int anInt2433 = -1;

	@OriginalMember(owner = "client!s", name = "ob", descriptor = "I")
	public int anInt2438 = -1;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
	private int anInt2435 = 128;

	@OriginalMember(owner = "client!s", name = "wb", descriptor = "I")
	public int anInt2444 = -1;

	@OriginalMember(owner = "client!s", name = "Db", descriptor = "I")
	private int anInt2447 = 0;

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "Z")
	public boolean aBoolean94 = false;

	@OriginalMember(owner = "client!s", name = "ub", descriptor = "I")
	public int anInt2443 = -1;

	@OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
	private int anInt2441 = -1;

	@OriginalMember(owner = "client!s", name = "Fb", descriptor = "I")
	private int anInt2449 = -1;

	@OriginalMember(owner = "client!s", name = "Kb", descriptor = "I")
	private int anInt2452 = 0;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
	public int anInt2427 = -1;

	@OriginalMember(owner = "client!s", name = "Lb", descriptor = "I")
	public int anInt2453 = -1;

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "Lclient!ic;")
	public Class34 aClass34_1142 = Static40.aClass34_521;

	@OriginalMember(owner = "client!s", name = "Pb", descriptor = "Z")
	public boolean aBoolean96 = true;

	@OriginalMember(owner = "client!s", name = "Ib", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!s", name = "Hb", descriptor = "I")
	private int anInt2451 = 128;

	@OriginalMember(owner = "client!s", name = "yb", descriptor = "[Lclient!ic;")
	public final Class34[] aClass34Array17 = new Class34[5];

	@OriginalMember(owner = "client!s", name = "Xb", descriptor = "I")
	public int anInt2458 = -1;

	@OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
	public int anInt2439 = 1;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public void method1498() {
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(B)Lclient!df;")
	public Class8_Sub1_Sub1_Sub3 method1500() {
		if (this.anIntArray331 != null) {
			@Pc(14) Class8_Sub1_Sub16 local14 = this.method1503();
			return local14 == null ? null : local14.method1500();
		} else if (this.anIntArray333 == null) {
			return null;
		} else {
			@Pc(29) boolean local29 = false;
			for (@Pc(31) int local31 = 0; local31 < this.anIntArray333.length; local31++) {
				if (!Static42.aClass14_16.method1145(this.anIntArray333[local31], 0)) {
					local29 = true;
				}
			}
			if (local29) {
				return null;
			}
			@Pc(59) Class8_Sub1_Sub1_Sub3[] local59 = new Class8_Sub1_Sub1_Sub3[this.anIntArray333.length];
			for (@Pc(61) int local61 = 0; local61 < this.anIntArray333.length; local61++) {
				local59[local61] = Static26.method472(Static42.aClass14_16, this.anIntArray333[local61]);
			}
			@Pc(99) Class8_Sub1_Sub1_Sub3 local99;
			if (local59.length == 1) {
				local99 = local59[0];
			} else {
				local99 = new Class8_Sub1_Sub1_Sub3(local59, local59.length);
			}
			@Pc(113) int local113;
			if (this.aShortArray36 != null) {
				for (local113 = 0; local113 < this.aShortArray36.length; local113++) {
					local99.method490(this.aShortArray36[local113], this.aShortArray35[local113]);
				}
			}
			if (this.aShortArray38 != null) {
				for (local113 = 0; local113 < this.aShortArray38.length; local113++) {
					local99.method485(this.aShortArray38[local113], this.aShortArray37[local113]);
				}
			}
			return local99;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!wd;B)V")
	public void method1502(@OriginalArg(0) Class8_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1872();
			if (local5 == 0) {
				return;
			}
			this.method1506(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)Lclient!s;")
	public Class8_Sub1_Sub16 method1503() {
		@Pc(13) int local13 = -1;
		if (this.anInt2449 != -1) {
			local13 = Static23.method423(this.anInt2449);
		} else if (this.anInt2441 != -1) {
			local13 = Static78.anIntArray238[this.anInt2441];
		}
		return local13 < 0 || this.anIntArray331.length <= local13 || this.anIntArray331[local13] == -1 ? null : Static18.method308(this.anIntArray331[local13]);
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(B)Z")
	public boolean method1504() {
		if (this.anIntArray331 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2449 != -1) {
			local10 = Static23.method423(this.anInt2449);
		} else if (this.anInt2441 != -1) {
			local10 = Static78.anIntArray238[this.anInt2441];
		}
		return local10 >= 0 && this.anIntArray331.length > local10 && this.anIntArray331[local10] != -1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!wd;II)V")
	private void method1506(@OriginalArg(0) Class8_Sub20 arg0, @OriginalArg(1) int arg1) {
		@Pc(114) int local114;
		@Pc(124) int local124;
		if (arg1 == 1) {
			local114 = arg0.method1872();
			this.anIntArray332 = new int[local114];
			for (local124 = 0; local124 < local114; local124++) {
				this.anIntArray332[local124] = arg0.method1839();
			}
		} else if (arg1 == 2) {
			this.aClass34_1142 = arg0.method1892();
		} else if (arg1 == 12) {
			this.anInt2439 = arg0.method1872();
		} else if (arg1 == 13) {
			this.anInt2438 = arg0.method1839();
		} else if (arg1 == 14) {
			this.anInt2458 = arg0.method1839();
		} else if (arg1 == 15) {
			this.anInt2443 = arg0.method1839();
		} else if (arg1 == 16) {
			this.anInt2444 = arg0.method1839();
		} else if (arg1 == 17) {
			this.anInt2458 = arg0.method1839();
			this.anInt2430 = arg0.method1839();
			this.anInt2453 = arg0.method1839();
			this.anInt2433 = arg0.method1839();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass34Array17[arg1 - 30] = arg0.method1892();
			if (this.aClass34Array17[arg1 - 30].method806(Static97.aClass34_1059)) {
				this.aClass34Array17[arg1 - 30] = null;
				return;
			}
		} else if (arg1 == 40) {
			local114 = arg0.method1872();
			this.aShortArray36 = new short[local114];
			this.aShortArray35 = new short[local114];
			for (local124 = 0; local124 < local114; local124++) {
				this.aShortArray36[local124] = (short) arg0.method1839();
				this.aShortArray35[local124] = (short) arg0.method1839();
			}
			return;
		} else if (arg1 == 41) {
			local114 = arg0.method1872();
			this.aShortArray38 = new short[local114];
			this.aShortArray37 = new short[local114];
			for (local124 = 0; local124 < local114; local124++) {
				this.aShortArray38[local124] = (short) arg0.method1839();
				this.aShortArray37[local124] = (short) arg0.method1839();
			}
			return;
		} else if (arg1 == 60) {
			local114 = arg0.method1872();
			this.anIntArray333 = new int[local114];
			for (local124 = 0; local124 < local114; local124++) {
				this.anIntArray333[local124] = arg0.method1839();
			}
		} else if (arg1 == 93) {
			this.aBoolean93 = false;
			return;
		} else if (arg1 == 95) {
			this.anInt2426 = arg0.method1839();
			return;
		} else if (arg1 == 97) {
			this.anInt2435 = arg0.method1839();
			return;
		} else if (arg1 == 98) {
			this.anInt2451 = arg0.method1839();
			return;
		} else if (arg1 == 99) {
			this.aBoolean94 = true;
			return;
		} else if (arg1 == 100) {
			this.anInt2447 = arg0.method1847();
			return;
		} else if (arg1 == 101) {
			this.anInt2452 = arg0.method1847() * 5;
			return;
		} else if (arg1 == 102) {
			this.anInt2427 = arg0.method1839();
			return;
		} else if (arg1 == 103) {
			this.anInt2429 = arg0.method1839();
			return;
		} else if (arg1 == 106) {
			this.anInt2449 = arg0.method1839();
			if (this.anInt2449 == 65535) {
				this.anInt2449 = -1;
			}
			this.anInt2441 = arg0.method1839();
			if (this.anInt2441 == 65535) {
				this.anInt2441 = -1;
			}
			local114 = arg0.method1872();
			this.anIntArray331 = new int[local114 + 1];
			for (local124 = 0; local124 <= local114; local124++) {
				this.anIntArray331[local124] = arg0.method1839();
				if (this.anIntArray331[local124] == 65535) {
					this.anIntArray331[local124] = -1;
				}
			}
			return;
		} else {
			if (arg1 == 107) {
				this.aBoolean95 = false;
			} else if (arg1 == 109) {
				this.aBoolean96 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!dc;ILclient!dc;IB)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method1508(@OriginalArg(0) Class8_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub6 arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray331 != null) {
			@Pc(12) Class8_Sub1_Sub16 local12 = this.method1503();
			return local12 == null ? null : local12.method1508(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class8_Sub1_Sub1_Sub6 local32 = (Class8_Sub1_Sub1_Sub6) Static40.aClass48_21.method1100((long) this.anInt2428);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray332.length; local38++) {
				if (!Static42.aClass14_16.method1145(this.anIntArray332[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class8_Sub1_Sub1_Sub3[] local70 = new Class8_Sub1_Sub1_Sub3[this.anIntArray332.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray332.length; local72++) {
				local70[local72] = Static26.method472(Static42.aClass14_16, this.anIntArray332[local72]);
			}
			@Pc(98) Class8_Sub1_Sub1_Sub3 local98;
			if (local70.length == 1) {
				local98 = local70[0];
			} else {
				local98 = new Class8_Sub1_Sub1_Sub3(local70, local70.length);
			}
			@Pc(112) int local112;
			if (this.aShortArray36 != null) {
				for (local112 = 0; local112 < this.aShortArray36.length; local112++) {
					local98.method490(this.aShortArray36[local112], this.aShortArray35[local112]);
				}
			}
			if (this.aShortArray38 != null) {
				for (local112 = 0; local112 < this.aShortArray38.length; local112++) {
					local98.method485(this.aShortArray38[local112], this.aShortArray37[local112]);
				}
			}
			local32 = local98.method479(this.anInt2447 + 64, 850 - -this.anInt2452, -30, -50, -30);
			Static40.aClass48_21.method1097(local32, (long) this.anInt2428);
		}
		@Pc(191) Class8_Sub1_Sub1_Sub6 local191;
		if (arg0 != null && arg2 != null) {
			local191 = arg0.method425(arg1, arg2, arg3, local32);
		} else if (arg0 != null) {
			local191 = arg0.method421(arg3, local32);
		} else if (arg2 == null) {
			local191 = local32.method1274(true);
		} else {
			local191 = arg2.method421(arg1, local32);
		}
		if (this.anInt2435 != 128 || this.anInt2451 != 128) {
			local191.method1290(this.anInt2435, this.anInt2451, this.anInt2435);
		}
		return local191;
	}
}
