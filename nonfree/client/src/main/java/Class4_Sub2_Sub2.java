import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!bd", name = "V", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "[I")
	private int[] anIntArray32;

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!bd", name = "cb", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!bd", name = "pb", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
	public int anInt313 = 5;

	@OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
	public int anInt316 = -1;

	@OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
	public int anInt319 = 2;

	@OriginalMember(owner = "client!bd", name = "fb", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
	public int anInt318 = -1;

	@OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
	public int anInt320 = -1;

	@OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
	public int anInt315 = 99;

	@OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
	public int anInt317 = -1;

	@OriginalMember(owner = "client!bd", name = "qb", descriptor = "I")
	public int anInt327 = -1;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
	public void method208() {
		if (this.anInt318 == -1) {
			if (this.anIntArray31 == null) {
				this.anInt318 = 0;
			} else {
				this.anInt318 = 2;
			}
		}
		if (this.anInt317 != -1) {
			return;
		}
		if (this.anIntArray31 == null) {
			this.anInt317 = 0;
		} else {
			this.anInt317 = 2;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILclient!vb;)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub2_Sub1_Sub6 arg2) {
		@Pc(6) int local6 = this.anIntArray33[arg0];
		@Pc(12) Class4_Sub2_Sub4 local12 = Static101.method1821(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local12 == null) {
			return arg2.method2133(true);
		}
		@Pc(37) Class4_Sub2_Sub1_Sub6 local37 = arg2.method2133(!local12.method381(local20));
		@Pc(41) int local41 = arg1 & 0x3;
		if (local41 == 1) {
			local37.method2130();
		} else if (local41 == 2) {
			local37.method2135();
		} else if (local41 == 3) {
			local37.method2137();
		}
		local37.method2143(local12, local20);
		if (local41 == 1) {
			local37.method2137();
		} else if (local41 == 2) {
			local37.method2135();
		} else if (local41 == 3) {
			local37.method2130();
		}
		return local37;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILclient!vb;)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method210(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub2_Sub1_Sub6 arg1) {
		@Pc(8) int local8 = this.anIntArray33[arg0];
		@Pc(14) Class4_Sub2_Sub4 local14 = Static101.method1821(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method2133(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class4_Sub2_Sub4 local28 = null;
		if (this.anIntArray32 != null && arg0 < this.anIntArray32.length) {
			local26 = this.anIntArray32[arg0];
			local28 = Static101.method1821(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(67) Class4_Sub2_Sub1_Sub6 local67;
		if (local28 == null || local26 == 65535) {
			local67 = arg1.method2133(!local14.method381(local18));
			local67.method2143(local14, local18);
			return local67;
		} else {
			local67 = arg1.method2133(!local14.method381(local18) & !local28.method381(local26));
			local67.method2143(local14, local18);
			local67.method2143(local28, local26);
			return local67;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!vb;I)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method211(@OriginalArg(1) Class4_Sub2_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray33[arg1];
		@Pc(14) Class4_Sub2_Sub4 local14 = Static101.method1821(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2138(true);
		} else {
			@Pc(42) Class4_Sub2_Sub1_Sub6 local42 = arg0.method2138(!local14.method381(local18));
			local42.method2143(local14, local18);
			return local42;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!s;I)V")
	public void method213(@OriginalArg(0) Class4_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1474();
			if (local9 == 0) {
				return;
			}
			this.method216(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!vb;IILclient!bd;)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method214(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub2_Sub2 arg3) {
		@Pc(8) int local8 = this.anIntArray33[arg2];
		@Pc(14) Class4_Sub2_Sub4 local14 = Static101.method1821(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg3.method215(arg1, arg0);
		}
		@Pc(33) int local33 = arg3.anIntArray33[arg0];
		@Pc(39) Class4_Sub2_Sub4 local39 = Static101.method1821(local33 >> 16);
		@Pc(43) int local43 = local33 & 0xFFFF;
		@Pc(56) Class4_Sub2_Sub1_Sub6 local56;
		if (local39 == null) {
			local56 = arg1.method2133(!local14.method381(local18));
			local56.method2143(local14, local18);
			return local56;
		} else {
			local56 = arg1.method2133(!local14.method381(local18) & !local39.method381(local43));
			local56.method2139(local14, local18, local39, local43, this.anIntArray31);
			return local56;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!vb;II)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method215(@OriginalArg(0) Class4_Sub2_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray33[arg1];
		@Pc(10) Class4_Sub2_Sub4 local10 = Static101.method1821(local4 >> 16);
		@Pc(26) int local26 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method2133(true);
		} else {
			@Pc(43) Class4_Sub2_Sub1_Sub6 local43 = arg0.method2133(!local10.method381(local26));
			local43.method2143(local10, local26);
			return local43;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!s;I)V")
	private void method216(@OriginalArg(1) Class4_Sub16 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(33) int local33;
		if (arg1 == 1) {
			local8 = arg0.method1490();
			this.anIntArray35 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray35[local14] = arg0.method1490();
			}
			this.anIntArray33 = new int[local8];
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray33[local33] = arg0.method1490();
			}
			for (@Pc(48) int local48 = 0; local48 < local8; local48++) {
				this.anIntArray33[local48] = (arg0.method1490() << 16) + this.anIntArray33[local48];
			}
		} else if (arg1 == 2) {
			this.anInt320 = arg0.method1490();
		} else if (arg1 == 3) {
			local8 = arg0.method1474();
			this.anIntArray31 = new int[local8 + 1];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray31[local14] = arg0.method1474();
			}
			this.anIntArray31[local8] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean11 = true;
		} else if (arg1 == 5) {
			this.anInt313 = arg0.method1474();
		} else if (arg1 == 6) {
			this.anInt316 = arg0.method1490();
		} else if (arg1 == 7) {
			this.anInt327 = arg0.method1490();
		} else if (arg1 == 8) {
			this.anInt315 = arg0.method1474();
		} else if (arg1 == 9) {
			this.anInt318 = arg0.method1474();
		} else if (arg1 == 10) {
			this.anInt317 = arg0.method1474();
		} else if (arg1 == 11) {
			this.anInt319 = arg0.method1474();
		} else if (arg1 == 12) {
			local8 = arg0.method1474();
			this.anIntArray32 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray32[local14] = arg0.method1490();
			}
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray32[local33] += arg0.method1490() << 16;
			}
		} else if (arg1 == 13) {
			local8 = arg0.method1474();
			this.anIntArray34 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray34[local14] = arg0.method1475();
			}
		}
	}
}
