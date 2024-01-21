import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "[I")
	public int[] anIntArray243;

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "[I")
	public int[] anIntArray246;

	@OriginalMember(owner = "client!nf", name = "rb", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
	public int anInt2466 = -1;

	@OriginalMember(owner = "client!nf", name = "ob", descriptor = "I")
	public int anInt2478 = -1;

	@OriginalMember(owner = "client!nf", name = "qb", descriptor = "I")
	public int anInt2480 = -1;

	@OriginalMember(owner = "client!nf", name = "wb", descriptor = "I")
	public int anInt2482 = 99;

	@OriginalMember(owner = "client!nf", name = "mb", descriptor = "I")
	public int anInt2476 = -1;

	@OriginalMember(owner = "client!nf", name = "xb", descriptor = "I")
	public int anInt2483 = -1;

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
	public int anInt2469 = 2;

	@OriginalMember(owner = "client!nf", name = "zb", descriptor = "I")
	public int anInt2484 = 5;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZILclient!ea;)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method1591(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub4 arg1) {
		@Pc(13) int local13 = this.anIntArray243[arg0];
		@Pc(19) Class3_Sub1_Sub7 local19 = Static39.method881(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method629(true);
		} else {
			@Pc(40) Class3_Sub1_Sub1_Sub4 local40 = arg1.method629(!local19.method775(local23));
			local40.method636(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	public void method1593() {
		if (this.anInt2466 == -1) {
			if (this.anIntArray245 == null) {
				this.anInt2466 = 0;
			} else {
				this.anInt2466 = 2;
			}
		}
		if (this.anInt2476 != -1) {
			return;
		}
		if (this.anIntArray245 == null) {
			this.anInt2476 = 0;
		} else {
			this.anInt2476 = 2;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZILclient!ea;I)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method1596(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray243[arg0];
		@Pc(16) Class3_Sub1_Sub7 local16 = Static39.method881(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg1.method627(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(46) Class3_Sub1_Sub1_Sub4 local46 = arg1.method627(!local16.method775(local20));
		if (local30 == 1) {
			local46.method634();
		} else if (local30 == 2) {
			local46.method637();
		} else if (local30 == 3) {
			local46.method633();
		}
		local46.method636(local16, local20);
		if (local30 == 1) {
			local46.method633();
		} else if (local30 == 2) {
			local46.method637();
		} else if (local30 == 3) {
			local46.method634();
		}
		return local46;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ea;IB)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method1597(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray243[arg1];
		@Pc(14) Class3_Sub1_Sub7 local14 = Static39.method881(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method627(true);
		} else {
			@Pc(35) Class3_Sub1_Sub1_Sub4 local35 = arg0.method627(!local14.method775(local18));
			local35.method636(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!la;IB)V")
	private void method1598(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(39) int local39;
		if (arg1 == 1) {
			local10 = arg0.method1963();
			this.anIntArray247 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray247[local16] = arg0.method1963();
			}
			this.anIntArray243 = new int[local10];
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray243[local39] = arg0.method1963();
			}
			for (@Pc(54) int local54 = 0; local54 < local10; local54++) {
				this.anIntArray243[local54] += arg0.method1963() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt2478 = arg0.method1963();
		} else if (arg1 == 3) {
			local10 = arg0.method1936();
			this.anIntArray245 = new int[local10 + 1];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray245[local16] = arg0.method1936();
			}
			this.anIntArray245[local10] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean89 = true;
		} else if (arg1 == 5) {
			this.anInt2484 = arg0.method1936();
		} else if (arg1 == 6) {
			this.anInt2483 = arg0.method1963();
		} else if (arg1 == 7) {
			this.anInt2480 = arg0.method1963();
		} else if (arg1 == 8) {
			this.anInt2482 = arg0.method1936();
		} else if (arg1 == 9) {
			this.anInt2476 = arg0.method1936();
		} else if (arg1 == 10) {
			this.anInt2466 = arg0.method1936();
		} else if (arg1 == 11) {
			this.anInt2469 = arg0.method1936();
		} else if (arg1 == 12) {
			local10 = arg0.method1936();
			this.anIntArray244 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray244[local16] = arg0.method1963();
			}
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray244[local39] = (arg0.method1963() << 16) + this.anIntArray244[local39];
			}
		} else if (arg1 == 13) {
			local10 = arg0.method1936();
			this.anIntArray246 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray246[local16] = arg0.method1923();
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLclient!la;)V")
	public void method1599(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1936();
			if (local15 == 0) {
				return;
			}
			this.method1598(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILclient!ea;)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method1601(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub4 arg1) {
		@Pc(4) int local4 = this.anIntArray243[arg0];
		@Pc(14) Class3_Sub1_Sub7 local14 = Static39.method881(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method627(true);
		}
		@Pc(35) Class3_Sub1_Sub7 local35 = null;
		@Pc(37) int local37 = 0;
		if (this.anIntArray244 != null && this.anIntArray244.length > arg0) {
			local37 = this.anIntArray244[arg0];
			local35 = Static39.method881(local37 >> 16);
			local37 &= 0xFFFF;
		}
		@Pc(84) Class3_Sub1_Sub1_Sub4 local84;
		if (local35 == null || local37 == 65535) {
			local84 = arg1.method627(!local14.method775(local18));
			local84.method636(local14, local18);
			return local84;
		} else {
			local84 = arg1.method627(!local14.method775(local18) & !local35.method775(local37));
			local84.method636(local14, local18);
			local84.method636(local35, local37);
			return local84;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!nf;ILclient!ea;II)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method1603(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray243[arg3];
		@Pc(14) Class3_Sub1_Sub7 local14 = Static39.method881(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1597(arg2, arg1);
		}
		@Pc(37) int local37 = arg0.anIntArray243[arg1];
		@Pc(43) Class3_Sub1_Sub7 local43 = Static39.method881(local37 >> 16);
		@Pc(47) int local47 = local37 & 0xFFFF;
		@Pc(60) Class3_Sub1_Sub1_Sub4 local60;
		if (local43 == null) {
			local60 = arg2.method627(!local14.method775(local18));
			local60.method636(local14, local18);
			return local60;
		} else {
			local60 = arg2.method627(!local14.method775(local18) & !local43.method775(local47));
			local60.method625(local14, local18, local43, local47, this.anIntArray245);
			return local60;
		}
	}
}
