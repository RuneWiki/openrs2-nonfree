import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!m", name = "mb", descriptor = "[I")
	public int[] anIntArray220;

	@OriginalMember(owner = "client!m", name = "tb", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!m", name = "vb", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!m", name = "Bb", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
	public int anInt1588 = -1;

	@OriginalMember(owner = "client!m", name = "lb", descriptor = "I")
	public int anInt1590 = 5;

	@OriginalMember(owner = "client!m", name = "db", descriptor = "I")
	public int anInt1584 = -1;

	@OriginalMember(owner = "client!m", name = "wb", descriptor = "I")
	public int anInt1596 = 2;

	@OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
	public int anInt1593 = -1;

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
	public int anInt1587 = 99;

	@OriginalMember(owner = "client!m", name = "Db", descriptor = "I")
	public int anInt1601 = -1;

	@OriginalMember(owner = "client!m", name = "xb", descriptor = "I")
	public int anInt1597 = -1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIILclient!hc;)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub1_Sub4 arg2) {
		@Pc(6) int local6 = this.anIntArray220[arg0];
		@Pc(16) Class3_Sub1_Sub12 local16 = Static5.method152(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg2.method788(true);
		}
		@Pc(37) Class3_Sub1_Sub1_Sub4 local37 = arg2.method788(!local16.method1368(local20));
		@Pc(41) int local41 = arg1 & 0x3;
		if (local41 == 1) {
			local37.method767();
		} else if (local41 == 2) {
			local37.method772();
		} else if (local41 == 3) {
			local37.method770();
		}
		local37.method778(local16, local20);
		if (local41 == 1) {
			local37.method770();
		} else if (local41 == 2) {
			local37.method772();
		} else if (local41 == 3) {
			local37.method767();
		}
		return local37;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
	public void method1074() {
		if (this.anInt1588 == -1) {
			if (this.anIntArray222 == null) {
				this.anInt1588 = 0;
			} else {
				this.anInt1588 = 2;
			}
		}
		if (this.anInt1601 != -1) {
			return;
		}
		if (this.anIntArray222 == null) {
			this.anInt1601 = 0;
		} else {
			this.anInt1601 = 2;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!hc;I)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1075(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray220[arg1];
		@Pc(14) Class3_Sub1_Sub12 local14 = Static5.method152(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method788(true);
		} else {
			@Pc(35) Class3_Sub1_Sub1_Sub4 local35 = arg0.method788(!local14.method1368(local18));
			local35.method778(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!hc;)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1076(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub4 arg1) {
		@Pc(8) int local8 = this.anIntArray220[arg0];
		@Pc(14) Class3_Sub1_Sub12 local14 = Static5.method152(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method788(true);
		}
		@Pc(34) Class3_Sub1_Sub12 local34 = null;
		@Pc(36) int local36 = 0;
		if (this.anIntArray223 != null && arg0 < this.anIntArray223.length) {
			local36 = this.anIntArray223[arg0];
			local34 = Static5.method152(local36 >> 16);
			local36 &= 0xFFFF;
		}
		@Pc(81) Class3_Sub1_Sub1_Sub4 local81;
		if (local34 == null || local36 == 65535) {
			local81 = arg1.method788(!local14.method1368(local18));
			local81.method778(local14, local18);
			return local81;
		} else {
			local81 = arg1.method788(!local14.method1368(local18) & !local34.method1368(local36));
			local81.method778(local14, local18);
			local81.method778(local34, local36);
			return local81;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZILclient!gb;)V")
	private void method1077(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		@Pc(90) int local90;
		@Pc(96) int local96;
		@Pc(115) int local115;
		if (arg0 == 1) {
			local90 = arg1.method446();
			this.anIntArray224 = new int[local90];
			for (local96 = 0; local96 < local90; local96++) {
				this.anIntArray224[local96] = arg1.method459();
			}
			this.anIntArray220 = new int[local90];
			for (local115 = 0; local115 < local90; local115++) {
				this.anIntArray220[local115] = arg1.method459();
			}
			for (@Pc(247) int local247 = 0; local247 < local90; local247++) {
				this.anIntArray220[local247] += arg1.method459() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1593 = arg1.method459();
		} else if (arg0 == 3) {
			local90 = arg1.method446();
			this.anIntArray222 = new int[local90 + 1];
			for (local96 = 0; local96 < local90; local96++) {
				this.anIntArray222[local96] = arg1.method446();
			}
			this.anIntArray222[local90] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean125 = true;
		} else if (arg0 == 5) {
			this.anInt1590 = arg1.method446();
		} else if (arg0 == 6) {
			this.anInt1584 = arg1.method459();
		} else if (arg0 == 7) {
			this.anInt1597 = arg1.method459();
		} else if (arg0 == 8) {
			this.anInt1587 = arg1.method446();
		} else if (arg0 == 9) {
			this.anInt1588 = arg1.method446();
		} else if (arg0 == 10) {
			this.anInt1601 = arg1.method446();
		} else if (arg0 == 11) {
			this.anInt1596 = arg1.method446();
		} else if (arg0 == 12) {
			local90 = arg1.method446();
			this.anIntArray223 = new int[local90];
			for (local96 = 0; local96 < local90; local96++) {
				this.anIntArray223[local96] = arg1.method459();
			}
			for (local115 = 0; local115 < local90; local115++) {
				this.anIntArray223[local115] += arg1.method459() << 16;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!hc;I)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1078(@OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anIntArray220[arg1];
		@Pc(24) Class3_Sub1_Sub12 local24 = Static5.method152(local18 >> 16);
		@Pc(28) int local28 = local18 & 0xFFFF;
		if (local24 == null) {
			return arg0.method775(true);
		} else {
			@Pc(45) Class3_Sub1_Sub1_Sub4 local45 = arg0.method775(!local24.method1368(local28));
			local45.method778(local24, local28);
			return local45;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BILclient!m;Lclient!hc;I)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1080(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub6 arg1, @OriginalArg(3) Class3_Sub1_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19 = this.anIntArray220[arg3];
		@Pc(25) Class3_Sub1_Sub12 local25 = Static5.method152(local19 >> 16);
		@Pc(29) int local29 = local19 & 0xFFFF;
		if (local25 == null) {
			return arg1.method1075(arg2, arg0);
		}
		@Pc(42) int local42 = arg1.anIntArray220[arg0];
		@Pc(48) Class3_Sub1_Sub12 local48 = Static5.method152(local42 >> 16);
		@Pc(52) int local52 = local42 & 0xFFFF;
		@Pc(65) Class3_Sub1_Sub1_Sub4 local65;
		if (local48 == null) {
			local65 = arg2.method788(!local25.method1368(local29));
			local65.method778(local25, local29);
			return local65;
		} else {
			local65 = arg2.method788(!local25.method1368(local29) & !local48.method1368(local52));
			local65.method762(local25, local29, local48, local52, this.anIntArray222);
			return local65;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!gb;)V")
	public void method1081(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method446();
			if (local9 == 0) {
				return;
			}
			this.method1077(local9, arg0);
		}
	}
}
