import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class6_Sub3_Sub2 extends Class6_Sub3 {

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!cb", name = "Db", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!cb", name = "Lb", descriptor = "I")
	public int anInt478;

	@OriginalMember(owner = "client!cb", name = "Nb", descriptor = "[I")
	public int[] anIntArray54;

	@OriginalMember(owner = "client!cb", name = "bc", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "Z")
	public boolean aBoolean25 = true;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
	public int anInt466 = 1;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
	public int anInt461 = -1;

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
	private int anInt458 = 0;

	@OriginalMember(owner = "client!cb", name = "vb", descriptor = "I")
	private int anInt472 = -1;

	@OriginalMember(owner = "client!cb", name = "Bb", descriptor = "I")
	public int anInt475 = -1;

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
	public int anInt459 = -1;

	@OriginalMember(owner = "client!cb", name = "sb", descriptor = "I")
	public int anInt470 = -1;

	@OriginalMember(owner = "client!cb", name = "yb", descriptor = "I")
	private int anInt474 = 0;

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
	public int anInt460 = -1;

	@OriginalMember(owner = "client!cb", name = "Gb", descriptor = "Z")
	public boolean aBoolean28 = true;

	@OriginalMember(owner = "client!cb", name = "Ib", descriptor = "[Lclient!rd;")
	public final Class63[] aClass63Array3 = new Class63[5];

	@OriginalMember(owner = "client!cb", name = "xb", descriptor = "Lclient!rd;")
	public Class63 aClass63_319 = Static14.aClass63_323;

	@OriginalMember(owner = "client!cb", name = "Mb", descriptor = "I")
	private int anInt479 = 128;

	@OriginalMember(owner = "client!cb", name = "Fb", descriptor = "I")
	public int anInt476 = -1;

	@OriginalMember(owner = "client!cb", name = "Qb", descriptor = "I")
	private int anInt481 = -1;

	@OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
	public int anInt469 = -1;

	@OriginalMember(owner = "client!cb", name = "Yb", descriptor = "I")
	public int anInt486 = 32;

	@OriginalMember(owner = "client!cb", name = "zb", descriptor = "Z")
	public boolean aBoolean27 = true;

	@OriginalMember(owner = "client!cb", name = "Ub", descriptor = "I")
	private int anInt484 = 128;

	@OriginalMember(owner = "client!cb", name = "Sb", descriptor = "I")
	public int anInt482 = -1;

	@OriginalMember(owner = "client!cb", name = "Zb", descriptor = "I")
	public int anInt487 = -1;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)Z")
	public boolean method366() {
		if (this.anIntArray54 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt481 != -1) {
			local10 = Static89.method1599(this.anInt481);
		} else if (this.anInt472 != -1) {
			local10 = Static89.anIntArray283[this.anInt472];
		}
		return local10 >= 0 && this.anIntArray54.length > local10 && this.anIntArray54[local10] != -1;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
	public void method367() {
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)Lclient!cb;")
	public Class6_Sub3_Sub2 method369() {
		@Pc(10) int local10 = -1;
		if (this.anInt481 != -1) {
			local10 = Static89.method1599(this.anInt481);
		} else if (this.anInt472 != -1) {
			local10 = Static89.anIntArray283[this.anInt472];
		}
		return local10 < 0 || this.anIntArray54.length <= local10 || this.anIntArray54[local10] == -1 ? null : Static41.method904(this.anIntArray54[local10]);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!gd;Lclient!gd;I)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method370(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub3_Sub7 arg1, @OriginalArg(3) Class6_Sub3_Sub7 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray54 != null) {
			@Pc(12) Class6_Sub3_Sub2 local12 = this.method369();
			return local12 == null ? null : local12.method370(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class6_Sub3_Sub1_Sub3 local32 = (Class6_Sub3_Sub1_Sub3) Static87.aClass49_22.method1397((long) this.anInt478);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray52.length; local38++) {
				if (!Static103.aClass7_59.method109(this.anIntArray52[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class6_Sub3_Sub1_Sub1[] local70 = new Class6_Sub3_Sub1_Sub1[this.anIntArray52.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray52.length; local72++) {
				local70[local72] = Static9.method212(Static103.aClass7_59, this.anIntArray52[local72]);
			}
			@Pc(101) Class6_Sub3_Sub1_Sub1 local101;
			if (local70.length == 1) {
				local101 = local70[0];
			} else {
				local101 = new Class6_Sub3_Sub1_Sub1(local70, local70.length);
			}
			if (this.aShortArray3 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.aShortArray3.length; local112++) {
					local101.method229(this.aShortArray3[local112], this.aShortArray2[local112]);
				}
			}
			local32 = local101.method211(this.anInt458 + 64, this.anInt474 + 850, -30, -50, -30);
			Static87.aClass49_22.method1396((long) this.anInt478, local32);
		}
		@Pc(166) Class6_Sub3_Sub1_Sub3 local166;
		if (arg2 != null && arg1 != null) {
			local166 = arg2.method921(local32, arg3, arg0, arg1);
		} else if (arg2 != null) {
			local166 = arg2.method930(arg3, local32);
		} else if (arg1 == null) {
			local166 = local32.method626(true);
		} else {
			local166 = arg1.method930(arg0, local32);
		}
		if (this.anInt479 != 128 || this.anInt484 != 128) {
			local166.method622(this.anInt479, this.anInt484, this.anInt479);
		}
		return local166;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!bf;BI)V")
	private void method371(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(94) int local94;
		@Pc(100) int local100;
		if (arg1 == 1) {
			local94 = arg0.method1321();
			this.anIntArray52 = new int[local94];
			for (local100 = 0; local100 < local94; local100++) {
				this.anIntArray52[local100] = arg0.method1306();
			}
		} else if (arg1 == 2) {
			this.aClass63_319 = arg0.method1339();
		} else if (arg1 == 12) {
			this.anInt466 = arg0.method1321();
		} else if (arg1 == 13) {
			this.anInt459 = arg0.method1306();
		} else if (arg1 == 14) {
			this.anInt461 = arg0.method1306();
		} else if (arg1 == 15) {
			this.anInt469 = arg0.method1306();
		} else if (arg1 == 16) {
			this.anInt475 = arg0.method1306();
		} else if (arg1 == 17) {
			this.anInt461 = arg0.method1306();
			this.anInt470 = arg0.method1306();
			this.anInt482 = arg0.method1306();
			this.anInt476 = arg0.method1306();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass63Array3[arg1 - 30] = arg0.method1339();
			if (this.aClass63Array3[arg1 - 30].method1822(Static58.aClass63_907)) {
				this.aClass63Array3[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local94 = arg0.method1321();
			this.aShortArray2 = new short[local94];
			this.aShortArray3 = new short[local94];
			for (local100 = 0; local100 < local94; local100++) {
				this.aShortArray3[local100] = (short) arg0.method1306();
				this.aShortArray2[local100] = (short) arg0.method1306();
			}
		} else if (arg1 == 60) {
			local94 = arg0.method1321();
			this.anIntArray53 = new int[local94];
			for (local100 = 0; local100 < local94; local100++) {
				this.anIntArray53[local100] = arg0.method1306();
			}
		} else if (arg1 == 93) {
			this.aBoolean25 = false;
		} else if (arg1 == 95) {
			this.anInt460 = arg0.method1306();
		} else if (arg1 == 97) {
			this.anInt479 = arg0.method1306();
		} else if (arg1 == 98) {
			this.anInt484 = arg0.method1306();
		} else if (arg1 == 99) {
			this.aBoolean26 = true;
		} else if (arg1 == 100) {
			this.anInt458 = arg0.method1297();
		} else if (arg1 == 101) {
			this.anInt474 = arg0.method1297() * 5;
		} else if (arg1 == 102) {
			this.anInt487 = arg0.method1306();
		} else if (arg1 == 103) {
			this.anInt486 = arg0.method1306();
		} else if (arg1 == 106) {
			this.anInt481 = arg0.method1306();
			if (this.anInt481 == 65535) {
				this.anInt481 = -1;
			}
			this.anInt472 = arg0.method1306();
			if (this.anInt472 == 65535) {
				this.anInt472 = -1;
			}
			local94 = arg0.method1321();
			this.anIntArray54 = new int[local94 + 1];
			for (local100 = 0; local100 <= local94; local100++) {
				this.anIntArray54[local100] = arg0.method1306();
				if (this.anIntArray54[local100] == 65535) {
					this.anIntArray54[local100] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean28 = false;
		} else if (arg1 == 109) {
			this.aBoolean27 = false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!bf;)V")
	public void method372(@OriginalArg(1) Class6_Sub4 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1321();
			if (local16 == 0) {
				return;
			}
			this.method371(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)Lclient!bc;")
	public Class6_Sub3_Sub1_Sub1 method373() {
		if (this.anIntArray54 != null) {
			@Pc(12) Class6_Sub3_Sub2 local12 = this.method369();
			return local12 == null ? null : local12.method373();
		} else if (this.anIntArray53 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray53.length; local29++) {
				if (!Static103.aClass7_59.method109(this.anIntArray53[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(61) Class6_Sub3_Sub1_Sub1[] local61 = new Class6_Sub3_Sub1_Sub1[this.anIntArray53.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray53.length; local68++) {
				local61[local68] = Static9.method212(Static103.aClass7_59, this.anIntArray53[local68]);
			}
			@Pc(101) Class6_Sub3_Sub1_Sub1 local101;
			if (local61.length == 1) {
				local101 = local61[0];
			} else {
				local101 = new Class6_Sub3_Sub1_Sub1(local61, local61.length);
			}
			if (this.aShortArray3 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.aShortArray3.length; local112++) {
					local101.method229(this.aShortArray3[local112], this.aShortArray2[local112]);
				}
			}
			return local101;
		}
	}
}
