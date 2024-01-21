import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!id", name = "lb", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!id", name = "sb", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!id", name = "Cb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!id", name = "Fb", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!id", name = "Hb", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!id", name = "Ob", descriptor = "I")
	public int anInt1488;

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
	public int anInt1468 = -1;

	@OriginalMember(owner = "client!id", name = "W", descriptor = "I")
	private int anInt1462 = 0;

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "Z")
	public boolean aBoolean61 = false;

	@OriginalMember(owner = "client!id", name = "nb", descriptor = "I")
	public int anInt1470 = -1;

	@OriginalMember(owner = "client!id", name = "tb", descriptor = "I")
	public int anInt1474 = 1;

	@OriginalMember(owner = "client!id", name = "ub", descriptor = "I")
	private int anInt1475 = 128;

	@OriginalMember(owner = "client!id", name = "ob", descriptor = "I")
	public int anInt1471 = 32;

	@OriginalMember(owner = "client!id", name = "Ab", descriptor = "I")
	public int anInt1479 = -1;

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
	public int anInt1463 = -1;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
	private int anInt1466 = -1;

	@OriginalMember(owner = "client!id", name = "Db", descriptor = "I")
	private int anInt1481 = 0;

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
	private int anInt1467 = -1;

	@OriginalMember(owner = "client!id", name = "X", descriptor = "Z")
	public boolean aBoolean59 = true;

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "Z")
	public boolean aBoolean60 = true;

	@OriginalMember(owner = "client!id", name = "Jb", descriptor = "[Lclient!sc;")
	public final Class66[] aClass66Array7 = new Class66[5];

	@OriginalMember(owner = "client!id", name = "Kb", descriptor = "I")
	public int anInt1484 = -1;

	@OriginalMember(owner = "client!id", name = "Mb", descriptor = "I")
	public int anInt1486 = -1;

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
	private int anInt1464 = 128;

	@OriginalMember(owner = "client!id", name = "Gb", descriptor = "I")
	public int anInt1482 = -1;

	@OriginalMember(owner = "client!id", name = "wb", descriptor = "I")
	public int anInt1477 = -1;

	@OriginalMember(owner = "client!id", name = "Qb", descriptor = "Z")
	public boolean aBoolean62 = true;

	@OriginalMember(owner = "client!id", name = "Lb", descriptor = "I")
	public int anInt1485 = -1;

	@OriginalMember(owner = "client!id", name = "db", descriptor = "Lclient!sc;")
	public Class66 aClass66_794 = Static124.aClass66_1681;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)Lclient!id;")
	public Class1_Sub1_Sub5 method1040() {
		@Pc(5) int local5 = -1;
		if (this.anInt1466 != -1) {
			local5 = Static52.method1096(this.anInt1466);
		} else if (this.anInt1467 != -1) {
			local5 = Static103.anIntArray429[this.anInt1467];
		}
		return local5 < 0 || local5 >= this.anIntArray222.length || this.anIntArray222[local5] == -1 ? null : Static55.method1238(this.anIntArray222[local5]);
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)Lclient!td;")
	public Class1_Sub1_Sub1_Sub7 method1041() {
		if (this.anIntArray222 != null) {
			@Pc(12) Class1_Sub1_Sub5 local12 = this.method1040();
			return local12 == null ? null : local12.method1041();
		} else if (this.anIntArray224 == null) {
			return null;
		} else {
			@Pc(32) boolean local32 = false;
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray224.length; local34++) {
				if (!Static51.aClass5_45.method119(this.anIntArray224[local34], 0)) {
					local32 = true;
				}
			}
			if (local32) {
				return null;
			}
			@Pc(66) Class1_Sub1_Sub1_Sub7[] local66 = new Class1_Sub1_Sub1_Sub7[this.anIntArray224.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray224.length; local68++) {
				local66[local68] = Static113.method1911(Static51.aClass5_45, this.anIntArray224[local68]);
			}
			@Pc(99) Class1_Sub1_Sub1_Sub7 local99;
			if (local66.length == 1) {
				local99 = local66[0];
			} else {
				local99 = new Class1_Sub1_Sub1_Sub7(local66, local66.length);
			}
			@Pc(110) int local110;
			if (this.aShortArray39 != null) {
				for (local110 = 0; local110 < this.aShortArray39.length; local110++) {
					local99.method1914(this.aShortArray39[local110], this.aShortArray38[local110]);
				}
			}
			if (this.aShortArray37 != null) {
				for (local110 = 0; local110 < this.aShortArray37.length; local110++) {
					local99.method1915(this.aShortArray37[local110], this.aShortArray36[local110]);
				}
			}
			return local99;
		}
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public void method1042() {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!mc;)V")
	private void method1044(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		@Pc(93) int local93;
		@Pc(103) int local103;
		if (arg0 == 1) {
			local93 = arg1.method1190();
			this.anIntArray223 = new int[local93];
			for (local103 = 0; local103 < local93; local103++) {
				this.anIntArray223[local103] = arg1.method1176();
			}
		} else if (arg0 == 2) {
			this.aClass66_794 = arg1.method1214();
		} else if (arg0 == 12) {
			this.anInt1474 = arg1.method1190();
		} else if (arg0 == 13) {
			this.anInt1470 = arg1.method1176();
		} else if (arg0 == 14) {
			this.anInt1463 = arg1.method1176();
		} else if (arg0 == 15) {
			this.anInt1477 = arg1.method1176();
		} else if (arg0 == 16) {
			this.anInt1486 = arg1.method1176();
		} else if (arg0 == 17) {
			this.anInt1463 = arg1.method1176();
			this.anInt1468 = arg1.method1176();
			this.anInt1479 = arg1.method1176();
			this.anInt1484 = arg1.method1176();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass66Array7[arg0 - 30] = arg1.method1214();
			if (this.aClass66Array7[arg0 - 30].method1843(Static39.aClass66_615)) {
				this.aClass66Array7[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local93 = arg1.method1190();
			this.aShortArray38 = new short[local93];
			this.aShortArray39 = new short[local93];
			for (local103 = 0; local103 < local93; local103++) {
				this.aShortArray39[local103] = (short) arg1.method1176();
				this.aShortArray38[local103] = (short) arg1.method1176();
			}
			return;
		} else if (arg0 == 41) {
			local93 = arg1.method1190();
			this.aShortArray36 = new short[local93];
			this.aShortArray37 = new short[local93];
			for (local103 = 0; local103 < local93; local103++) {
				this.aShortArray37[local103] = (short) arg1.method1176();
				this.aShortArray36[local103] = (short) arg1.method1176();
			}
			return;
		} else if (arg0 == 60) {
			local93 = arg1.method1190();
			this.anIntArray224 = new int[local93];
			for (local103 = 0; local103 < local93; local103++) {
				this.anIntArray224[local103] = arg1.method1176();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean60 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt1485 = arg1.method1176();
			return;
		} else if (arg0 == 97) {
			this.anInt1464 = arg1.method1176();
			return;
		} else if (arg0 == 98) {
			this.anInt1475 = arg1.method1176();
			return;
		} else if (arg0 == 99) {
			this.aBoolean61 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt1481 = arg1.method1211();
			return;
		} else if (arg0 == 101) {
			this.anInt1462 = arg1.method1211() * 5;
			return;
		} else if (arg0 == 102) {
			this.anInt1482 = arg1.method1176();
			return;
		} else if (arg0 == 103) {
			this.anInt1471 = arg1.method1176();
			return;
		} else if (arg0 == 106) {
			this.anInt1466 = arg1.method1176();
			if (this.anInt1466 == 65535) {
				this.anInt1466 = -1;
			}
			this.anInt1467 = arg1.method1176();
			if (this.anInt1467 == 65535) {
				this.anInt1467 = -1;
			}
			local93 = arg1.method1190();
			this.anIntArray222 = new int[local93 + 1];
			for (local103 = 0; local103 <= local93; local103++) {
				this.anIntArray222[local103] = arg1.method1176();
				if (this.anIntArray222[local103] == 65535) {
					this.anIntArray222[local103] = -1;
				}
			}
			return;
		} else {
			if (arg0 == 107) {
				this.aBoolean59 = false;
			} else if (arg0 == 109) {
				this.aBoolean62 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)Z")
	public boolean method1046() {
		if (this.anIntArray222 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt1466 != -1) {
			local10 = Static52.method1096(this.anInt1466);
		} else if (this.anInt1467 != -1) {
			local10 = Static103.anIntArray429[this.anInt1467];
		}
		return local10 >= 0 && this.anIntArray222.length > local10 && this.anIntArray222[local10] != -1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method1047(@OriginalArg(0) Class1_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1190();
			if (local5 == 0) {
				return;
			}
			this.method1044(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!tb;IIILclient!tb;)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1048(@OriginalArg(0) Class1_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub15 arg3) {
		if (this.anIntArray222 != null) {
			@Pc(14) Class1_Sub1_Sub5 local14 = this.method1040();
			return local14 == null ? null : local14.method1048(arg0, arg1, arg2, arg3);
		}
		@Pc(34) Class1_Sub1_Sub1_Sub6 local34 = (Class1_Sub1_Sub1_Sub6) Static102.aClass60_79.method1745((long) this.anInt1488);
		if (local34 == null) {
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < this.anIntArray223.length; local40++) {
				if (!Static51.aClass5_45.method119(this.anIntArray223[local40], 0)) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(72) Class1_Sub1_Sub1_Sub7[] local72 = new Class1_Sub1_Sub1_Sub7[this.anIntArray223.length];
			for (@Pc(74) int local74 = 0; local74 < this.anIntArray223.length; local74++) {
				local72[local74] = Static113.method1911(Static51.aClass5_45, this.anIntArray223[local74]);
			}
			@Pc(105) Class1_Sub1_Sub1_Sub7 local105;
			if (local72.length == 1) {
				local105 = local72[0];
			} else {
				local105 = new Class1_Sub1_Sub1_Sub7(local72, local72.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray39 != null) {
				for (local116 = 0; local116 < this.aShortArray39.length; local116++) {
					local105.method1914(this.aShortArray39[local116], this.aShortArray38[local116]);
				}
			}
			if (this.aShortArray37 != null) {
				for (local116 = 0; local116 < this.aShortArray37.length; local116++) {
					local105.method1915(this.aShortArray37[local116], this.aShortArray36[local116]);
				}
			}
			local34 = local105.method1899(this.anInt1481 + 64, this.anInt1462 + 850, -30, -50, -30);
			Static102.aClass60_79.method1741((long) this.anInt1488, local34);
		}
		@Pc(196) Class1_Sub1_Sub1_Sub6 local196;
		if (arg0 != null && arg3 != null) {
			local196 = arg0.method1869(arg1, arg3, local34, arg2);
		} else if (arg0 != null) {
			local196 = arg0.method1872(local34, arg2);
		} else if (arg3 == null) {
			local196 = local34.method1325(true);
		} else {
			local196 = arg3.method1872(local34, arg1);
		}
		if (this.anInt1464 != 128 || this.anInt1475 != 128) {
			local196.method1329(this.anInt1464, this.anInt1475, this.anInt1464);
		}
		return local196;
	}
}
