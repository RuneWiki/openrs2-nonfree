import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!s", name = "U", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "[I")
	public int[] anIntArray355;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "I")
	public int anInt2308 = -1;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
	public int anInt2317 = 5;

	@OriginalMember(owner = "client!s", name = "mb", descriptor = "I")
	public int anInt2321 = -1;

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "I")
	public int anInt2318 = -1;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
	public int anInt2313 = -1;

	@OriginalMember(owner = "client!s", name = "qb", descriptor = "I")
	public int anInt2324 = 99;

	@OriginalMember(owner = "client!s", name = "wb", descriptor = "I")
	public int anInt2327 = -1;

	@OriginalMember(owner = "client!s", name = "tb", descriptor = "Z")
	public boolean aBoolean129 = false;

	@OriginalMember(owner = "client!s", name = "Gb", descriptor = "I")
	public int anInt2331 = 2;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!pc;I)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method1611(@OriginalArg(1) Class1_Sub1_Sub8_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anIntArray355[arg1];
		@Pc(20) Class1_Sub1_Sub5 local20 = Static101.method1766(local10 >> 16);
		@Pc(24) int local24 = local10 & 0xFFFF;
		if (local20 == null) {
			return arg0.method1380(true);
		} else {
			@Pc(41) Class1_Sub1_Sub8_Sub3 local41 = arg0.method1380(!local20.method443(local24));
			local41.method1386(local20, local24);
			return local41;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public void method1612() {
		if (this.anInt2327 == -1) {
			if (this.anIntArray354 == null) {
				this.anInt2327 = 0;
			} else {
				this.anInt2327 = 2;
			}
		}
		if (this.anInt2318 != -1) {
			return;
		}
		if (this.anIntArray354 == null) {
			this.anInt2318 = 0;
		} else {
			this.anInt2318 = 2;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!ka;)V")
	private void method1615(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(36) int local36;
		if (arg0 == 1) {
			local12 = arg1.method1186();
			this.anIntArray357 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray357[local18] = arg1.method1199();
			}
			this.anIntArray355 = new int[local12];
			for (local36 = 0; local36 < local12; local36++) {
				this.anIntArray355[local36] = arg1.method1199();
			}
			for (@Pc(50) int local50 = 0; local50 < local12; local50++) {
				this.anIntArray355[local50] = (arg1.method1199() << 16) + this.anIntArray355[local50];
			}
		} else if (arg0 == 2) {
			this.anInt2313 = arg1.method1199();
		} else if (arg0 == 3) {
			local12 = arg1.method1186();
			this.anIntArray354 = new int[local12 + 1];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray354[local18] = arg1.method1186();
			}
			this.anIntArray354[local12] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean129 = true;
		} else if (arg0 == 5) {
			this.anInt2317 = arg1.method1186();
		} else if (arg0 == 6) {
			this.anInt2308 = arg1.method1199();
		} else if (arg0 == 7) {
			this.anInt2321 = arg1.method1199();
		} else if (arg0 == 8) {
			this.anInt2324 = arg1.method1186();
		} else if (arg0 == 9) {
			this.anInt2318 = arg1.method1186();
		} else if (arg0 == 10) {
			this.anInt2327 = arg1.method1186();
		} else if (arg0 == 11) {
			this.anInt2331 = arg1.method1186();
		} else if (arg0 == 12) {
			local12 = arg1.method1186();
			this.anIntArray356 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray356[local18] = arg1.method1199();
			}
			for (local36 = 0; local36 < local12; local36++) {
				this.anIntArray356[local36] = (arg1.method1199() << 16) + this.anIntArray356[local36];
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBLclient!pc;)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method1618(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub8_Sub3 arg1) {
		@Pc(4) int local4 = this.anIntArray355[arg0];
		@Pc(10) Class1_Sub1_Sub5 local10 = Static101.method1766(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method1380(true);
		}
		@Pc(36) Class1_Sub1_Sub5 local36 = null;
		@Pc(38) int local38 = 0;
		if (this.anIntArray356 != null && arg0 < this.anIntArray356.length) {
			local38 = this.anIntArray356[arg0];
			local36 = Static101.method1766(local38 >> 16);
			local38 &= 0xFFFF;
		}
		@Pc(79) Class1_Sub1_Sub8_Sub3 local79;
		if (local36 == null || local38 == 65535) {
			local79 = arg1.method1380(!local10.method443(local14));
			local79.method1386(local10, local14);
			return local79;
		} else {
			local79 = arg1.method1380(!local10.method443(local14) & !local36.method443(local38));
			local79.method1386(local10, local14);
			local79.method1386(local36, local38);
			return local79;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZLclient!pc;I)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method1619(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub8_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray355[arg2];
		@Pc(16) Class1_Sub1_Sub5 local16 = Static101.method1766(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1380(true);
		}
		@Pc(35) int local35 = arg0 & 0x3;
		@Pc(46) Class1_Sub1_Sub8_Sub3 local46 = arg1.method1380(!local16.method443(local20));
		if (local35 == 1) {
			local46.method1376();
		} else if (local35 == 2) {
			local46.method1388();
		} else if (local35 == 3) {
			local46.method1390();
		}
		local46.method1386(local16, local20);
		if (local35 == 1) {
			local46.method1390();
		} else if (local35 == 2) {
			local46.method1388();
		} else if (local35 == 3) {
			local46.method1376();
		}
		return local46;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!s;ILclient!pc;IB)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method1620(@OriginalArg(0) Class1_Sub1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub8_Sub3 arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = this.anIntArray355[arg3];
		@Pc(19) Class1_Sub1_Sub5 local19 = Static101.method1766(local9 >> 16);
		@Pc(23) int local23 = local9 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1611(arg2, arg1);
		}
		@Pc(36) int local36 = arg0.anIntArray355[arg1];
		@Pc(42) Class1_Sub1_Sub5 local42 = Static101.method1766(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(61) Class1_Sub1_Sub8_Sub3 local61;
		if (local42 == null) {
			local61 = arg2.method1380(!local19.method443(local23));
			local61.method1386(local19, local23);
			return local61;
		} else {
			local61 = arg2.method1380(!local19.method443(local23) & !local42.method443(local46));
			local61.method1387(local19, local23, local42, local46, this.anIntArray354);
			return local61;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!ka;)V")
	public void method1621(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1186();
			if (local14 == 0) {
				return;
			}
			this.method1615(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!pc;)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method1623(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub8_Sub3 arg1) {
		@Pc(4) int local4 = this.anIntArray355[arg0];
		@Pc(19) Class1_Sub1_Sub5 local19 = Static101.method1766(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg1.method1368(true);
		} else {
			@Pc(40) Class1_Sub1_Sub8_Sub3 local40 = arg1.method1368(!local19.method443(local23));
			local40.method1386(local19, local23);
			return local40;
		}
	}
}
