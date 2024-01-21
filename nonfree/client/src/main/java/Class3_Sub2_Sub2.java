import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!dg", name = "P", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!dg", name = "V", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!dg", name = "db", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
	public int anInt941 = 2;

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
	public int anInt946 = -1;

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
	public int anInt936 = -1;

	@OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
	public int anInt950 = -1;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
	public int anInt945 = -1;

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
	public int anInt948 = -1;

	@OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
	public int anInt953 = 99;

	@OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
	public int anInt943 = 5;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!fd;ILclient!dg;BI)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method596(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub2_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray74[arg3];
		@Pc(20) Class3_Sub2_Sub4 local20 = Static29.method488(local4 >> 16);
		@Pc(24) int local24 = local4 & 0xFFFF;
		if (local20 == null) {
			return arg2.method605(arg0, arg1);
		}
		@Pc(37) int local37 = arg2.anIntArray74[arg1];
		@Pc(43) Class3_Sub2_Sub4 local43 = Static29.method488(local37 >> 16);
		@Pc(47) int local47 = local37 & 0xFFFF;
		@Pc(62) Class3_Sub2_Sub1_Sub2 local62;
		if (local43 == null) {
			local62 = arg0.method1789(!local20.method842(local24));
			local62.method1795(local20, local24);
			return local62;
		} else {
			local62 = arg0.method1789(!local20.method842(local24) & !local43.method842(local47));
			local62.method1798(local20, local24, local43, local47, this.anIntArray72);
			return local62;
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
	public void method597() {
		if (this.anInt950 == -1) {
			if (this.anIntArray72 == null) {
				this.anInt950 = 0;
			} else {
				this.anInt950 = 2;
			}
		}
		if (this.anInt946 != -1) {
			return;
		}
		if (this.anIntArray72 == null) {
			this.anInt946 = 0;
		} else {
			this.anInt946 = 2;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLclient!fd;)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method598(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2_Sub1_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray74[arg0];
		@Pc(14) Class3_Sub2_Sub4 local14 = Static29.method488(local8 >> 16);
		@Pc(29) int local29 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1793(true);
		} else {
			@Pc(46) Class3_Sub2_Sub1_Sub2 local46 = arg1.method1793(!local14.method842(local29));
			local46.method1795(local14, local29);
			return local46;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!rd;Z)V")
	public void method599(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method191();
			if (local11 == 0) {
				return;
			}
			this.method603(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBLclient!fd;I)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method602(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray74[arg0];
		@Pc(12) Class3_Sub2_Sub4 local12 = Static29.method488(local6 >> 16);
		@Pc(16) int local16 = local6 & 0xFFFF;
		if (local12 == null) {
			return arg1.method1789(true);
		}
		@Pc(38) int local38 = arg2 & 0x3;
		@Pc(49) Class3_Sub2_Sub1_Sub2 local49 = arg1.method1789(!local12.method842(local16));
		if (local38 == 1) {
			local49.method1790();
		} else if (local38 == 2) {
			local49.method1797();
		} else if (local38 == 3) {
			local49.method1786();
		}
		local49.method1795(local12, local16);
		if (local38 == 1) {
			local49.method1786();
		} else if (local38 == 2) {
			local49.method1797();
		} else if (local38 == 3) {
			local49.method1790();
		}
		return local49;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!rd;)V")
	private void method603(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(142) int local142;
		if (arg0 == 1) {
			local27 = arg1.method208();
			this.anIntArray73 = new int[local27];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray73[local35] = arg1.method208();
			}
			this.anIntArray74 = new int[local27];
			for (local142 = 0; local142 < local27; local142++) {
				this.anIntArray74[local142] = arg1.method208();
			}
			for (@Pc(279) int local279 = 0; local279 < local27; local279++) {
				this.anIntArray74[local279] = (arg1.method208() << 16) + this.anIntArray74[local279];
			}
		} else if (arg0 == 2) {
			this.anInt945 = arg1.method208();
		} else if (arg0 == 3) {
			local27 = arg1.method191();
			this.anIntArray72 = new int[local27 + 1];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray72[local35] = arg1.method191();
			}
			this.anIntArray72[local27] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean30 = true;
		} else if (arg0 == 5) {
			this.anInt943 = arg1.method191();
		} else if (arg0 == 6) {
			this.anInt948 = arg1.method208();
		} else if (arg0 == 7) {
			this.anInt936 = arg1.method208();
		} else if (arg0 == 8) {
			this.anInt953 = arg1.method191();
		} else if (arg0 == 9) {
			this.anInt946 = arg1.method191();
		} else if (arg0 == 10) {
			this.anInt950 = arg1.method191();
		} else if (arg0 == 11) {
			this.anInt941 = arg1.method191();
		} else if (arg0 == 12) {
			local27 = arg1.method191();
			this.anIntArray75 = new int[local27];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray75[local35] = arg1.method208();
			}
			for (local142 = 0; local142 < local27; local142++) {
				this.anIntArray75[local142] += arg1.method208() << 16;
			}
		} else if (arg0 == 13) {
			local27 = arg1.method191();
			this.anIntArray77 = new int[local27];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray77[local35] = arg1.method197();
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!fd;B)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method604(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub1_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray74[arg0];
		@Pc(16) Class3_Sub2_Sub4 local16 = Static29.method488(local8 >> 16);
		@Pc(20) int local20 = local8 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1789(true);
		}
		@Pc(28) int local28 = 0;
		@Pc(30) Class3_Sub2_Sub4 local30 = null;
		if (this.anIntArray75 != null && this.anIntArray75.length > arg0) {
			local28 = this.anIntArray75[arg0];
			local30 = Static29.method488(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(82) Class3_Sub2_Sub1_Sub2 local82;
		if (local30 == null || local28 == 65535) {
			local82 = arg1.method1789(!local16.method842(local20));
			local82.method1795(local16, local20);
			return local82;
		} else {
			local82 = arg1.method1789(!local16.method842(local20) & !local30.method842(local28));
			local82.method1795(local16, local20);
			local82.method1795(local30, local28);
			return local82;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!fd;IB)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method605(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray74[arg1];
		@Pc(10) Class3_Sub2_Sub4 local10 = Static29.method488(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method1789(true);
		} else {
			@Pc(43) Class3_Sub2_Sub1_Sub2 local43 = arg0.method1789(!local10.method842(local14));
			local43.method1795(local10, local14);
			return local43;
		}
	}
}
