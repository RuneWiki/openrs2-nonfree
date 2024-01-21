import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gg", name = "S", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!gg", name = "db", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!gg", name = "nb", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!gg", name = "ob", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!gg", name = "rb", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
	public int anInt1313 = -1;

	@OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
	public int anInt1311 = -1;

	@OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
	public int anInt1322 = 99;

	@OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
	public int anInt1316 = -1;

	@OriginalMember(owner = "client!gg", name = "gb", descriptor = "I")
	public int anInt1325 = 5;

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!gg", name = "pb", descriptor = "I")
	public int anInt1332 = -1;

	@OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
	public int anInt1318 = -1;

	@OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
	public int anInt1321 = 2;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!gg;ILclient!o;BI)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method984(@OriginalArg(0) Class3_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub4_Sub5 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray138[arg3];
		@Pc(14) Class3_Sub1_Sub14 local14 = Static150.method2596(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method993(arg1, arg2);
		}
		@Pc(31) int local31 = arg0.anIntArray138[arg1];
		@Pc(37) Class3_Sub1_Sub14 local37 = Static150.method2596(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class3_Sub1_Sub4_Sub5 local54;
		if (local37 == null) {
			local54 = arg2.method1886(!local14.method1933(local18));
			local54.method1891(local14, local18);
			return local54;
		} else {
			local54 = arg2.method1886(!local14.method1933(local18) & !local37.method1933(local41));
			local54.method1884(local14, local18, local37, local41, this.anIntArray139);
			return local54;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!o;II)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method985(@OriginalArg(0) Class3_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray138[arg1];
		@Pc(14) Class3_Sub1_Sub14 local14 = Static150.method2596(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1883(true);
		} else {
			@Pc(35) Class3_Sub1_Sub4_Sub5 local35 = arg0.method1883(!local14.method1933(local18));
			local35.method1891(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILclient!ff;)V")
	private void method987(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(37) int local37;
		if (arg0 == 1) {
			local12 = arg1.method1359();
			this.anIntArray136 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray136[local18] = arg1.method1359();
			}
			this.anIntArray138 = new int[local12];
			for (local37 = 0; local37 < local12; local37++) {
				this.anIntArray138[local37] = arg1.method1359();
			}
			for (@Pc(56) int local56 = 0; local56 < local12; local56++) {
				this.anIntArray138[local56] += arg1.method1359() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1316 = arg1.method1359();
		} else if (arg0 == 3) {
			local12 = arg1.method1354();
			this.anIntArray139 = new int[local12 + 1];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray139[local18] = arg1.method1354();
			}
			this.anIntArray139[local12] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean88 = true;
		} else if (arg0 == 5) {
			this.anInt1325 = arg1.method1354();
		} else if (arg0 == 6) {
			this.anInt1313 = arg1.method1359();
		} else if (arg0 == 7) {
			this.anInt1311 = arg1.method1359();
		} else if (arg0 == 8) {
			this.anInt1322 = arg1.method1354();
		} else if (arg0 == 9) {
			this.anInt1318 = arg1.method1354();
		} else if (arg0 == 10) {
			this.anInt1332 = arg1.method1354();
		} else if (arg0 == 11) {
			this.anInt1321 = arg1.method1354();
		} else if (arg0 == 12) {
			local12 = arg1.method1354();
			this.anIntArray141 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray141[local18] = arg1.method1359();
			}
			for (local37 = 0; local37 < local12; local37++) {
				this.anIntArray141[local37] += arg1.method1359() << 16;
			}
		} else if (arg0 == 13) {
			local12 = arg1.method1354();
			this.anIntArray140 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray140[local18] = arg1.method1376();
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!o;I)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method988(@OriginalArg(1) Class3_Sub1_Sub4_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anIntArray138[arg1];
		@Pc(21) Class3_Sub1_Sub14 local21 = Static150.method2596(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg0.method1886(true);
		}
		@Pc(33) Class3_Sub1_Sub14 local33 = null;
		@Pc(35) int local35 = 0;
		if (this.anIntArray141 != null && this.anIntArray141.length > arg1) {
			local35 = this.anIntArray141[arg1];
			local33 = Static150.method2596(local35 >> 16);
			local35 &= 0xFFFF;
		}
		@Pc(74) Class3_Sub1_Sub4_Sub5 local74;
		if (local33 == null || local35 == 65535) {
			local74 = arg0.method1886(!local21.method1933(local25));
			local74.method1891(local21, local25);
			return local74;
		} else {
			local74 = arg0.method1886(!local21.method1933(local25) & !local33.method1933(local35));
			local74.method1891(local21, local25);
			local74.method1891(local33, local35);
			return local74;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ff;I)V")
	public void method990(@OriginalArg(0) Class3_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1354();
			if (local5 == 0) {
				return;
			}
			this.method987(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	public void method991() {
		if (this.anInt1332 == -1) {
			if (this.anIntArray139 == null) {
				this.anInt1332 = 0;
			} else {
				this.anInt1332 = 2;
			}
		}
		if (this.anInt1318 != -1) {
			return;
		}
		if (this.anIntArray139 == null) {
			this.anInt1318 = 0;
		} else {
			this.anInt1318 = 2;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!o;II)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method992(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub5 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray138[arg0];
		@Pc(16) Class3_Sub1_Sub14 local16 = Static150.method2596(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1886(true);
		}
		@Pc(36) int local36 = arg2 & 0x3;
		@Pc(47) Class3_Sub1_Sub4_Sub5 local47 = arg1.method1886(!local16.method1933(local20));
		if (local36 == 1) {
			local47.method1890();
		} else if (local36 == 2) {
			local47.method1882();
		} else if (local36 == 3) {
			local47.method1892();
		}
		local47.method1891(local16, local20);
		if (local36 == 1) {
			local47.method1892();
		} else if (local36 == 2) {
			local47.method1882();
		} else if (local36 == 3) {
			local47.method1890();
		}
		return local47;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!o;B)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method993(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub5 arg1) {
		@Pc(4) int local4 = this.anIntArray138[arg0];
		@Pc(10) Class3_Sub1_Sub14 local10 = Static150.method2596(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method1886(true);
		} else {
			@Pc(35) Class3_Sub1_Sub4_Sub5 local35 = arg1.method1886(!local10.method1933(local14));
			local35.method1891(local10, local14);
			return local35;
		}
	}
}
