import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kg", name = "V", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!kg", name = "W", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!kg", name = "Y", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!kg", name = "bb", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!kg", name = "ib", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
	public int anInt2491 = -1;

	@OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
	public int anInt2497 = -1;

	@OriginalMember(owner = "client!kg", name = "fb", descriptor = "Z")
	public boolean aBoolean102 = false;

	@OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
	public int anInt2493 = 2;

	@OriginalMember(owner = "client!kg", name = "nb", descriptor = "I")
	public int anInt2505 = -1;

	@OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
	public int anInt2501 = 5;

	@OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
	public int anInt2496 = 99;

	@OriginalMember(owner = "client!kg", name = "pb", descriptor = "I")
	public int anInt2506 = -1;

	@OriginalMember(owner = "client!kg", name = "sb", descriptor = "I")
	public int anInt2508 = -1;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)V")
	public void method1879() {
		if (this.anInt2491 == -1) {
			if (this.anIntArray285 == null) {
				this.anInt2491 = 0;
			} else {
				this.anInt2491 = 2;
			}
		}
		if (this.anInt2508 != -1) {
			return;
		}
		if (this.anIntArray285 == null) {
			this.anInt2508 = 0;
		} else {
			this.anInt2508 = 2;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BILclient!bf;)Lclient!bf;")
	public Class6_Sub3 method1881(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub3 arg1) {
		@Pc(8) int local8 = this.anIntArray284[arg0];
		@Pc(14) Class1_Sub2_Sub22 local14 = Static118.method2246(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1183(true);
		}
		@Pc(26) Class1_Sub2_Sub22 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray281 != null && this.anIntArray281.length > arg0) {
			local28 = this.anIntArray281[arg0];
			local26 = Static118.method2246(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(77) Class6_Sub3 local77;
		if (local26 == null || local28 == 65535) {
			local77 = arg1.method1183(!local14.method2892(local18));
			local77.method1173(local14, local18);
			return local77;
		} else {
			local77 = arg1.method1183(!local14.method2892(local18) & !local26.method2892(local28));
			local77.method1173(local14, local18);
			local77.method1173(local26, local28);
			return local77;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBLclient!bf;)Lclient!bf;")
	public Class6_Sub3 method1882(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub3 arg1) {
		@Pc(4) int local4 = this.anIntArray284[arg0];
		@Pc(14) Class1_Sub2_Sub22 local14 = Static118.method2246(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1169(true);
		} else {
			@Pc(40) Class6_Sub3 local40 = arg1.method1169(!local14.method2892(local18));
			local40.method1173(local14, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BILclient!wa;)V")
	private void method1883(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		@Pc(23) int local23;
		@Pc(31) int local31;
		@Pc(170) int local170;
		if (arg0 == 1) {
			local23 = arg1.method1753();
			this.anIntArray282 = new int[local23];
			for (local31 = 0; local31 < local23; local31++) {
				this.anIntArray282[local31] = arg1.method1753();
			}
			this.anIntArray284 = new int[local23];
			for (local170 = 0; local170 < local23; local170++) {
				this.anIntArray284[local170] = arg1.method1753();
			}
			for (@Pc(259) int local259 = 0; local259 < local23; local259++) {
				this.anIntArray284[local259] = (arg1.method1753() << 16) + this.anIntArray284[local259];
			}
		} else if (arg0 == 2) {
			this.anInt2497 = arg1.method1753();
		} else if (arg0 == 3) {
			local23 = arg1.method1738();
			this.anIntArray285 = new int[local23 + 1];
			for (local31 = 0; local31 < local23; local31++) {
				this.anIntArray285[local31] = arg1.method1738();
			}
			this.anIntArray285[local23] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean102 = true;
		} else if (arg0 == 5) {
			this.anInt2501 = arg1.method1738();
		} else if (arg0 == 6) {
			this.anInt2505 = arg1.method1753();
		} else if (arg0 == 7) {
			this.anInt2506 = arg1.method1753();
		} else if (arg0 == 8) {
			this.anInt2496 = arg1.method1738();
		} else if (arg0 == 9) {
			this.anInt2508 = arg1.method1738();
		} else if (arg0 == 10) {
			this.anInt2491 = arg1.method1738();
		} else if (arg0 == 11) {
			this.anInt2493 = arg1.method1738();
		} else if (arg0 == 12) {
			local23 = arg1.method1738();
			this.anIntArray281 = new int[local23];
			for (local31 = 0; local31 < local23; local31++) {
				this.anIntArray281[local31] = arg1.method1753();
			}
			for (local170 = 0; local170 < local23; local170++) {
				this.anIntArray281[local170] = (arg1.method1753() << 16) + this.anIntArray281[local170];
			}
		} else if (arg0 == 13) {
			local23 = arg1.method1738();
			this.anIntArray283 = new int[local23];
			for (local31 = 0; local31 < local23; local31++) {
				this.anIntArray283[local31] = arg1.method1713();
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!bf;BILclient!kg;I)Lclient!bf;")
	public Class6_Sub3 method1884(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub14 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray284[arg1];
		@Pc(10) Class1_Sub2_Sub22 local10 = Static118.method2246(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg2.method1886(arg0, arg3);
		}
		@Pc(36) int local36 = arg2.anIntArray284[arg3];
		@Pc(42) Class1_Sub2_Sub22 local42 = Static118.method2246(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(59) Class6_Sub3 local59;
		if (local42 == null) {
			local59 = arg0.method1183(!local10.method2892(local18));
			local59.method1173(local10, local18);
			return local59;
		} else {
			local59 = arg0.method1183(!local10.method2892(local18) & !local42.method2892(local46));
			local59.method1179(local10, local18, local42, local46, this.anIntArray285);
			return local59;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!bf;II)Lclient!bf;")
	public Class6_Sub3 method1886(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray284[arg1];
		@Pc(14) Class1_Sub2_Sub22 local14 = Static118.method2246(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1183(true);
		} else {
			@Pc(35) Class6_Sub3 local35 = arg0.method1183(!local14.method2892(local18));
			local35.method1173(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!bf;IIB)Lclient!bf;")
	public Class6_Sub3 method1888(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anIntArray284[arg1];
		@Pc(14) Class1_Sub2_Sub22 local14 = Static118.method2246(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1183(true);
		}
		@Pc(28) int local28 = arg2 & 0x3;
		@Pc(39) Class6_Sub3 local39 = arg0.method1183(!local14.method2892(local18));
		if (local28 == 1) {
			local39.method1178();
		} else if (local28 == 2) {
			local39.method1174();
		} else if (local28 == 3) {
			local39.method1177();
		}
		local39.method1173(local14, local18);
		if (local28 == 1) {
			local39.method1177();
		} else if (local28 == 2) {
			local39.method1174();
		} else if (local28 == 3) {
			local39.method1178();
		}
		return local39;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!wa;)V")
	public void method1892(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1738();
			if (local3 == 0) {
				return;
			}
			this.method1883(local3, arg0);
		}
	}
}
