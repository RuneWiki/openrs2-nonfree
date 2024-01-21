import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gd", name = "R", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "[I")
	private int[] anIntArray121;

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!gd", name = "nb", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!gd", name = "ob", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
	public int anInt1201 = -1;

	@OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
	public int anInt1207 = -1;

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
	public int anInt1194 = 5;

	@OriginalMember(owner = "client!gd", name = "mb", descriptor = "I")
	public int anInt1205 = -1;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
	public int anInt1198 = 99;

	@OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
	public int anInt1210 = -1;

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
	public int anInt1196 = -1;

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
	public int anInt1200 = 2;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!of;I)V")
	private void method715(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(147) int local147;
		if (arg0 == 1) {
			local24 = arg1.method2051();
			this.anIntArray120 = new int[local24];
			for (local32 = 0; local32 < local24; local32++) {
				this.anIntArray120[local32] = arg1.method2051();
			}
			this.anIntArray123 = new int[local24];
			for (local147 = 0; local147 < local24; local147++) {
				this.anIntArray123[local147] = arg1.method2051();
			}
			for (@Pc(278) int local278 = 0; local278 < local24; local278++) {
				this.anIntArray123[local278] = (arg1.method2051() << 16) + this.anIntArray123[local278];
			}
		} else if (arg0 == 2) {
			this.anInt1201 = arg1.method2051();
		} else if (arg0 == 3) {
			local24 = arg1.method2072();
			this.anIntArray122 = new int[local24 + 1];
			for (local32 = 0; local32 < local24; local32++) {
				this.anIntArray122[local32] = arg1.method2072();
			}
			this.anIntArray122[local24] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean69 = true;
		} else if (arg0 == 5) {
			this.anInt1194 = arg1.method2072();
		} else if (arg0 == 6) {
			this.anInt1210 = arg1.method2051();
		} else if (arg0 == 7) {
			this.anInt1207 = arg1.method2051();
		} else if (arg0 == 8) {
			this.anInt1198 = arg1.method2072();
		} else if (arg0 == 9) {
			this.anInt1196 = arg1.method2072();
			return;
		} else if (arg0 == 10) {
			this.anInt1205 = arg1.method2072();
			return;
		} else if (arg0 == 11) {
			this.anInt1200 = arg1.method2072();
			return;
		} else if (arg0 == 12) {
			local24 = arg1.method2072();
			this.anIntArray121 = new int[local24];
			for (local32 = 0; local32 < local24; local32++) {
				this.anIntArray121[local32] = arg1.method2051();
			}
			for (local147 = 0; local147 < local24; local147++) {
				this.anIntArray121[local147] = (arg1.method2051() << 16) + this.anIntArray121[local147];
			}
			return;
		} else if (arg0 == 13) {
			local24 = arg1.method2072();
			this.anIntArray124 = new int[local24];
			for (local32 = 0; local32 < local24; local32++) {
				this.anIntArray124[local32] = arg1.method2048();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!ka;)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method716(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray123[arg0];
		@Pc(14) Class1_Sub1_Sub7 local14 = Static34.method629(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1098(true);
		} else {
			@Pc(35) Class1_Sub1_Sub1_Sub2 local35 = arg1.method1098(!local14.method743(local18));
			local35.method1099(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!ka;I)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method719(@OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anIntArray123[arg1];
		@Pc(21) Class1_Sub1_Sub7 local21 = Static34.method629(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method1085(true);
		} else {
			@Pc(42) Class1_Sub1_Sub1_Sub2 local42 = arg0.method1085(!local21.method743(local25));
			local42.method1099(local21, local25);
			return local42;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ka;IIB)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method720(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.anIntArray123[arg2];
		@Pc(21) Class1_Sub1_Sub7 local21 = Static34.method629(local11 >> 16);
		@Pc(25) int local25 = local11 & 0xFFFF;
		if (local21 == null) {
			return arg0.method1098(true);
		}
		@Pc(35) int local35 = arg1 & 0x3;
		@Pc(46) Class1_Sub1_Sub1_Sub2 local46 = arg0.method1098(!local21.method743(local25));
		if (local35 == 1) {
			local46.method1089();
		} else if (local35 == 2) {
			local46.method1091();
		} else if (local35 == 3) {
			local46.method1081();
		}
		local46.method1099(local21, local25);
		if (local35 == 1) {
			local46.method1081();
		} else if (local35 == 2) {
			local46.method1091();
		} else if (local35 == 3) {
			local46.method1089();
		}
		return local46;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBLclient!ka;)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method721(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray123[arg0];
		@Pc(14) Class1_Sub1_Sub7 local14 = Static34.method629(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1098(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class1_Sub1_Sub7 local28 = null;
		if (this.anIntArray121 != null && this.anIntArray121.length > arg0) {
			local26 = this.anIntArray121[arg0];
			local28 = Static34.method629(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(77) Class1_Sub1_Sub1_Sub2 local77;
		if (local28 == null || local26 == 65535) {
			local77 = arg1.method1098(!local14.method743(local18));
			local77.method1099(local14, local18);
			return local77;
		} else {
			local77 = arg1.method1098(!local14.method743(local18) & !local28.method743(local26));
			local77.method1099(local14, local18);
			local77.method1099(local28, local26);
			return local77;
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
	public void method723() {
		if (this.anInt1196 == -1) {
			if (this.anIntArray122 == null) {
				this.anInt1196 = 0;
			} else {
				this.anInt1196 = 2;
			}
		}
		if (this.anInt1205 != -1) {
			return;
		}
		if (this.anIntArray122 == null) {
			this.anInt1205 = 0;
		} else {
			this.anInt1205 = 2;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBLclient!ka;Lclient!gd;)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) Class1_Sub1_Sub6 arg3) {
		@Pc(9) int local9 = this.anIntArray123[arg0];
		@Pc(19) Class1_Sub1_Sub7 local19 = Static34.method629(local9 >> 16);
		@Pc(23) int local23 = local9 & 0xFFFF;
		if (local19 == null) {
			return arg3.method716(arg1, arg2);
		}
		@Pc(36) int local36 = arg3.anIntArray123[arg1];
		@Pc(42) Class1_Sub1_Sub7 local42 = Static34.method629(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(59) Class1_Sub1_Sub1_Sub2 local59;
		if (local42 == null) {
			local59 = arg2.method1098(!local19.method743(local23));
			local59.method1099(local19, local23);
			return local59;
		} else {
			local59 = arg2.method1098(!local19.method743(local23) & !local42.method743(local46));
			local59.method1092(local19, local23, local42, local46, this.anIntArray122);
			return local59;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!of;)V")
	public void method726(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2072();
			if (local9 == 0) {
				return;
			}
			this.method715(local9, arg0);
		}
	}
}
