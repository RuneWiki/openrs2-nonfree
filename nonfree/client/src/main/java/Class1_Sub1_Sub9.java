import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
	public int anInt1518;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
	public int anInt1511 = -1;

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	public int anInt1520 = -1;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
	private int anInt1522 = 128;

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
	private int anInt1516 = 128;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
	public int anInt1517 = -1;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
	private int anInt1513 = -1;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
	public int anInt1512 = -1;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "Z")
	public boolean aBoolean66 = true;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	private int anInt1514 = -1;

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "I")
	public int anInt1531 = -1;

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "Lclient!ed;")
	public Class23 aClass23_544 = Static72.aClass23_718;

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
	public int anInt1526 = -1;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "I")
	public int anInt1528 = -1;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "Z")
	public boolean aBoolean67 = true;

	@OriginalMember(owner = "client!gb", name = "mb", descriptor = "I")
	private int anInt1532 = 0;

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "Z")
	public boolean aBoolean68 = true;

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "I")
	public int anInt1533 = -1;

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
	public int anInt1527 = 32;

	@OriginalMember(owner = "client!gb", name = "wb", descriptor = "[Lclient!ed;")
	public final Class23[] aClass23Array5 = new Class23[5];

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "S")
	public short aShort6 = 0;

	@OriginalMember(owner = "client!gb", name = "Bb", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!gb", name = "Db", descriptor = "S")
	public short aShort7 = 0;

	@OriginalMember(owner = "client!gb", name = "sb", descriptor = "I")
	private int anInt1536 = 0;

	@OriginalMember(owner = "client!gb", name = "zb", descriptor = "I")
	public int anInt1540 = 1;

	@OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
	public int anInt1541 = -1;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
	public void method982() {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIILclient!wf;Lclient!wf;)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method984(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub18 arg2, @OriginalArg(4) Class1_Sub1_Sub18 arg3) {
		if (this.anIntArray174 != null) {
			@Pc(12) Class1_Sub1_Sub9 local12 = this.method986();
			return local12 == null ? null : local12.method984(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class1_Sub1_Sub1_Sub2 local32 = (Class1_Sub1_Sub1_Sub2) Static115.aClass79_18.method2657((long) this.anInt1518);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray172.length; local38++) {
				if (!Static30.aClass30_40.method1284(this.anIntArray172[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class1_Sub1_Sub1_Sub6[] local70 = new Class1_Sub1_Sub1_Sub6[this.anIntArray172.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray172.length; local72++) {
				local70[local72] = Static151.method2610(Static30.aClass30_40, this.anIntArray172[local72]);
			}
			@Pc(100) Class1_Sub1_Sub1_Sub6 local100;
			if (local70.length == 1) {
				local100 = local70[0];
			} else {
				local100 = new Class1_Sub1_Sub1_Sub6(local70, local70.length);
			}
			@Pc(114) int local114;
			if (this.aShortArray22 != null) {
				for (local114 = 0; local114 < this.aShortArray22.length; local114++) {
					local100.method2593(this.aShortArray22[local114], this.aShortArray23[local114]);
				}
			}
			if (this.aShortArray21 != null) {
				for (local114 = 0; local114 < this.aShortArray21.length; local114++) {
					local100.method2603(this.aShortArray21[local114], this.aShortArray24[local114]);
				}
			}
			local32 = local100.method2609(this.anInt1536 + 64, this.anInt1532 + 850, -30, -50, -30, true);
			Static115.aClass79_18.method2658((long) this.anInt1518, local32);
		}
		@Pc(194) Class1_Sub1_Sub1_Sub2 local194;
		if (arg2 != null && arg3 != null) {
			local194 = arg2.method3101(arg3, arg0, arg1, local32);
		} else if (arg2 != null) {
			local194 = arg2.method3102(local32, arg1);
		} else if (arg3 == null) {
			local194 = local32.method1083(true);
		} else {
			local194 = arg3.method3102(local32, arg0);
		}
		if (this.anInt1516 != 128 || this.anInt1522 != 128) {
			local194.method1078(this.anInt1516, this.anInt1522, this.anInt1516);
		}
		return local194;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Lclient!gb;")
	public Class1_Sub1_Sub9 method986() {
		@Pc(11) int local11 = -1;
		if (this.anInt1513 != -1) {
			local11 = Static108.method1225(this.anInt1513);
		} else if (this.anInt1514 != -1) {
			local11 = Static27.anIntArray108[this.anInt1514];
		}
		return local11 < 0 || local11 >= this.anIntArray174.length || this.anIntArray174[local11] == -1 ? null : Static2.method111(this.anIntArray174[local11]);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)Z")
	public boolean method987() {
		if (this.anIntArray174 == null) {
			return true;
		}
		@Pc(16) int local16 = -1;
		if (this.anInt1513 != -1) {
			local16 = Static108.method1225(this.anInt1513);
		} else if (this.anInt1514 != -1) {
			local16 = Static27.anIntArray108[this.anInt1514];
		}
		return local16 >= 0 && local16 < this.anIntArray174.length && this.anIntArray174[local16] != -1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!wf;)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method988(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub18 arg1) {
		if (this.anIntArray174 != null) {
			@Pc(20) Class1_Sub1_Sub9 local20 = this.method986();
			return local20 == null ? null : local20.method988(arg0, arg1);
		} else if (this.anIntArray173 == null) {
			return null;
		} else {
			@Pc(45) Class1_Sub1_Sub1_Sub2 local45 = (Class1_Sub1_Sub1_Sub2) Static114.aClass79_17.method2657((long) this.anInt1518);
			if (local45 == null) {
				@Pc(49) boolean local49 = false;
				for (@Pc(51) int local51 = 0; local51 < this.anIntArray173.length; local51++) {
					if (!Static30.aClass30_40.method1284(this.anIntArray173[local51], 0)) {
						local49 = true;
					}
				}
				if (local49) {
					return null;
				}
				@Pc(83) Class1_Sub1_Sub1_Sub6[] local83 = new Class1_Sub1_Sub1_Sub6[this.anIntArray173.length];
				for (@Pc(85) int local85 = 0; local85 < this.anIntArray173.length; local85++) {
					local83[local85] = Static151.method2610(Static30.aClass30_40, this.anIntArray173[local85]);
				}
				@Pc(111) Class1_Sub1_Sub1_Sub6 local111;
				if (local83.length == 1) {
					local111 = local83[0];
				} else {
					local111 = new Class1_Sub1_Sub1_Sub6(local83, local83.length);
				}
				@Pc(125) int local125;
				if (this.aShortArray22 != null) {
					for (local125 = 0; local125 < this.aShortArray22.length; local125++) {
						local111.method2593(this.aShortArray22[local125], this.aShortArray23[local125]);
					}
				}
				if (this.aShortArray21 != null) {
					for (local125 = 0; local125 < this.aShortArray21.length; local125++) {
						local111.method2603(this.aShortArray21[local125], this.aShortArray24[local125]);
					}
				}
				local45 = local111.method2609(64, 768, -50, -10, -50, true);
				Static114.aClass79_17.method2658((long) this.anInt1518, local45);
			}
			if (arg1 != null) {
				local45 = arg1.method3100(local45, arg0);
			}
			return local45;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLclient!jg;)V")
	public void method990(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method861();
			if (local16 == 0) {
				return;
			}
			this.method991(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLclient!jg;)V")
	private void method991(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		if (arg0 == 1) {
			local12 = arg1.method861();
			this.anIntArray172 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray172[local18] = arg1.method878();
			}
		} else if (arg0 == 2) {
			this.aClass23_544 = arg1.method864();
		} else if (arg0 == 12) {
			this.anInt1540 = arg1.method861();
		} else if (arg0 == 13) {
			this.anInt1511 = arg1.method878();
		} else if (arg0 == 14) {
			this.anInt1541 = arg1.method878();
		} else if (arg0 == 15) {
			this.anInt1517 = arg1.method878();
		} else if (arg0 == 16) {
			this.anInt1526 = arg1.method878();
		} else if (arg0 == 17) {
			this.anInt1541 = arg1.method878();
			this.anInt1520 = arg1.method878();
			this.anInt1533 = arg1.method878();
			this.anInt1528 = arg1.method878();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass23Array5[arg0 - 30] = arg1.method864();
			if (this.aClass23Array5[arg0 - 30].method644(Static103.aClass23_1015)) {
				this.aClass23Array5[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local12 = arg1.method861();
			this.aShortArray22 = new short[local12];
			this.aShortArray23 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray22[local18] = (short) arg1.method878();
				this.aShortArray23[local18] = (short) arg1.method878();
			}
		} else if (arg0 == 41) {
			local12 = arg1.method861();
			this.aShortArray21 = new short[local12];
			this.aShortArray24 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray21[local18] = (short) arg1.method878();
				this.aShortArray24[local18] = (short) arg1.method878();
			}
		} else if (arg0 == 60) {
			local12 = arg1.method861();
			this.anIntArray173 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray173[local18] = arg1.method878();
			}
		} else if (arg0 == 93) {
			this.aBoolean68 = false;
		} else if (arg0 == 95) {
			this.anInt1512 = arg1.method878();
		} else if (arg0 == 97) {
			this.anInt1516 = arg1.method878();
		} else if (arg0 == 98) {
			this.anInt1522 = arg1.method878();
		} else if (arg0 == 99) {
			this.aBoolean69 = true;
		} else if (arg0 == 100) {
			this.anInt1536 = arg1.method900();
		} else if (arg0 == 101) {
			this.anInt1532 = arg1.method900() * 5;
		} else if (arg0 == 102) {
			this.anInt1531 = arg1.method878();
		} else if (arg0 == 103) {
			this.anInt1527 = arg1.method878();
		} else if (arg0 == 106) {
			this.anInt1513 = arg1.method878();
			if (this.anInt1513 == 65535) {
				this.anInt1513 = -1;
			}
			this.anInt1514 = arg1.method878();
			if (this.anInt1514 == 65535) {
				this.anInt1514 = -1;
			}
			local12 = arg1.method861();
			this.anIntArray174 = new int[local12 + 1];
			for (local18 = 0; local18 <= local12; local18++) {
				this.anIntArray174[local18] = arg1.method878();
				if (this.anIntArray174[local18] == 65535) {
					this.anIntArray174[local18] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean66 = false;
		} else if (arg0 == 109) {
			this.aBoolean67 = false;
		} else if (arg0 != 111) {
			if (arg0 == 113) {
				arg1.method878();
				arg1.method878();
			} else if (arg0 == 114) {
				arg1.method900();
				arg1.method900();
			} else if (arg0 == 115) {
				this.aShort7 = (short) (arg1.method861() * 4);
				this.aShort6 = (short) (arg1.method861() * 4);
			}
		}
	}
}
