import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!ce", name = "Z", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!ce", name = "gb", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
	public int anInt786 = 5;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
	public int anInt790 = -1;

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
	public int anInt796 = -1;

	@OriginalMember(owner = "client!ce", name = "cb", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
	public int anInt795 = -1;

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
	public int anInt801 = 99;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
	public int anInt794 = 2;

	@OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
	public int anInt788 = -1;

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
	public int anInt798 = -1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!og;)V")
	public void method636(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method218();
			if (local10 == 0) {
				return;
			}
			this.method644(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBILclient!fe;)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub4 arg2) {
		@Pc(10) int local10 = this.anIntArray84[arg1];
		@Pc(16) Class2_Sub1_Sub12 local16 = Static136.method2779(local10 >> 16);
		@Pc(28) int local28 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg2.method1615(true);
		}
		@Pc(38) int local38 = arg0 & 0x3;
		@Pc(49) Class2_Sub1_Sub1_Sub4 local49 = arg2.method1615(!local16.method1657(local28));
		if (local38 == 1) {
			local49.method1612();
		} else if (local38 == 2) {
			local49.method1620();
		} else if (local38 == 3) {
			local49.method1617();
		}
		local49.method1613(local16, local28);
		if (local38 == 1) {
			local49.method1617();
		} else if (local38 == 2) {
			local49.method1620();
		} else if (local38 == 3) {
			local49.method1612();
		}
		return local49;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
	public void method640() {
		if (this.anInt796 == -1) {
			if (this.anIntArray85 == null) {
				this.anInt796 = 0;
			} else {
				this.anInt796 = 2;
			}
		}
		if (this.anInt798 != -1) {
			return;
		}
		if (this.anIntArray85 == null) {
			this.anInt798 = 0;
		} else {
			this.anInt798 = 2;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!fe;BI)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method643(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.anIntArray84[arg1];
		@Pc(19) Class2_Sub1_Sub12 local19 = Static136.method2779(local9 >> 16);
		@Pc(23) int local23 = local9 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1619(true);
		} else {
			@Pc(40) Class2_Sub1_Sub1_Sub4 local40 = arg0.method1619(!local19.method1657(local23));
			local40.method1613(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!og;II)V")
	private void method644(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(189) int local189;
		if (arg1 == 1) {
			local18 = arg0.method234();
			this.anIntArray83 = new int[local18];
			for (local26 = 0; local26 < local18; local26++) {
				this.anIntArray83[local26] = arg0.method234();
			}
			this.anIntArray84 = new int[local18];
			for (local189 = 0; local189 < local18; local189++) {
				this.anIntArray84[local189] = arg0.method234();
			}
			for (@Pc(273) int local273 = 0; local273 < local18; local273++) {
				this.anIntArray84[local273] = (arg0.method234() << 16) + this.anIntArray84[local273];
			}
		} else if (arg1 == 2) {
			this.anInt795 = arg0.method234();
		} else if (arg1 == 3) {
			local18 = arg0.method218();
			this.anIntArray85 = new int[local18 + 1];
			for (local26 = 0; local26 < local18; local26++) {
				this.anIntArray85[local26] = arg0.method218();
			}
			this.anIntArray85[local18] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean28 = true;
		} else if (arg1 == 5) {
			this.anInt786 = arg0.method218();
		} else if (arg1 == 6) {
			this.anInt788 = arg0.method234();
		} else if (arg1 == 7) {
			this.anInt790 = arg0.method234();
		} else if (arg1 == 8) {
			this.anInt801 = arg0.method218();
		} else if (arg1 == 9) {
			this.anInt796 = arg0.method218();
		} else if (arg1 == 10) {
			this.anInt798 = arg0.method218();
		} else if (arg1 == 11) {
			this.anInt794 = arg0.method218();
		} else if (arg1 == 12) {
			local18 = arg0.method218();
			this.anIntArray81 = new int[local18];
			for (local26 = 0; local26 < local18; local26++) {
				this.anIntArray81[local26] = arg0.method234();
			}
			for (local189 = 0; local189 < local18; local189++) {
				this.anIntArray81[local189] += arg0.method234() << 16;
			}
		} else if (arg1 == 13) {
			local18 = arg0.method218();
			this.anIntArray82 = new int[local18];
			for (local26 = 0; local26 < local18; local26++) {
				this.anIntArray82[local26] = arg0.method239();
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!fe;II)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method645(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray84[arg1];
		@Pc(14) Class2_Sub1_Sub12 local14 = Static136.method2779(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1615(true);
		} else {
			@Pc(43) Class2_Sub1_Sub1_Sub4 local43 = arg0.method1615(!local14.method1657(local18));
			local43.method1613(local14, local18);
			return local43;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!fe;IZ)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method646(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray84[arg1];
		@Pc(14) Class2_Sub1_Sub12 local14 = Static136.method2779(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1615(true);
		}
		@Pc(26) Class2_Sub1_Sub12 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray81 != null && this.anIntArray81.length > arg1) {
			local28 = this.anIntArray81[arg1];
			local26 = Static136.method2779(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(74) Class2_Sub1_Sub1_Sub4 local74;
		if (local26 == null || local28 == 65535) {
			local74 = arg0.method1615(!local14.method1657(local18));
			local74.method1613(local14, local18);
			return local74;
		} else {
			local74 = arg0.method1615(!local14.method1657(local18) & !local26.method1657(local28));
			local74.method1613(local14, local18);
			local74.method1613(local26, local28);
			return local74;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!fe;ILclient!ce;II)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method647(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) Class2_Sub1_Sub5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray84[arg3];
		@Pc(16) Class2_Sub1_Sub12 local16 = Static136.method2779(local4 >> 16);
		@Pc(20) int local20 = local4 & 0xFFFF;
		if (local16 == null) {
			return arg1.method645(arg0, arg2);
		}
		@Pc(33) int local33 = arg1.anIntArray84[arg2];
		@Pc(39) Class2_Sub1_Sub12 local39 = Static136.method2779(local33 >> 16);
		@Pc(43) int local43 = local33 & 0xFFFF;
		@Pc(64) Class2_Sub1_Sub1_Sub4 local64;
		if (local39 == null) {
			local64 = arg0.method1615(!local16.method1657(local20));
			local64.method1613(local16, local20);
			return local64;
		} else {
			local64 = arg0.method1615(!local16.method1657(local20) & !local39.method1657(local43));
			local64.method1623(local16, local20, local39, local43, this.anIntArray85);
			return local64;
		}
	}
}
