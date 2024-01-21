import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!db", name = "W", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!db", name = "kb", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!db", name = "qb", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
	public int anInt660;

	@OriginalMember(owner = "client!db", name = "Eb", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!db", name = "Kb", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
	public int anInt648 = 1;

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
	public int anInt653 = -1;

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
	private int anInt655 = 0;

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "[Lclient!v;")
	public final Class62[] aClass62Array5 = new Class62[5];

	@OriginalMember(owner = "client!db", name = "R", descriptor = "I")
	public int anInt640 = -1;

	@OriginalMember(owner = "client!db", name = "U", descriptor = "I")
	private int anInt642 = -1;

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!db", name = "ub", descriptor = "I")
	public int anInt657 = -1;

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
	public int anInt652 = -1;

	@OriginalMember(owner = "client!db", name = "wb", descriptor = "I")
	public int anInt658 = -1;

	@OriginalMember(owner = "client!db", name = "Db", descriptor = "Lclient!v;")
	public Class62 aClass62_267 = Static68.aClass62_818;

	@OriginalMember(owner = "client!db", name = "xb", descriptor = "I")
	private int anInt659 = 128;

	@OriginalMember(owner = "client!db", name = "Cb", descriptor = "I")
	private int anInt664 = 128;

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
	private int anInt647 = 0;

	@OriginalMember(owner = "client!db", name = "Fb", descriptor = "I")
	public int anInt665 = 32;

	@OriginalMember(owner = "client!db", name = "vb", descriptor = "Z")
	public boolean aBoolean33 = true;

	@OriginalMember(owner = "client!db", name = "Mb", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!db", name = "Ab", descriptor = "I")
	public int anInt662 = -1;

	@OriginalMember(owner = "client!db", name = "Bb", descriptor = "I")
	public int anInt663 = -1;

	@OriginalMember(owner = "client!db", name = "db", descriptor = "I")
	private int anInt649 = -1;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method436() {
		if (this.anIntArray49 != null) {
			@Pc(12) Class3_Sub1_Sub4 local12 = this.method443();
			return local12 == null ? null : local12.method436();
		} else if (this.anIntArray51 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray51.length; local29++) {
				if (!Static19.aClass42_75.method1493(0, this.anIntArray51[local29])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(61) Class3_Sub1_Sub3_Sub3[] local61 = new Class3_Sub1_Sub3_Sub3[this.anIntArray51.length];
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray51.length; local63++) {
				local61[local63] = Static57.method949(Static19.aClass42_75, this.anIntArray51[local63]);
			}
			@Pc(97) Class3_Sub1_Sub3_Sub3 local97;
			if (local61.length == 1) {
				local97 = local61[0];
			} else {
				local97 = new Class3_Sub1_Sub3_Sub3(local61, local61.length);
			}
			if (this.anIntArray48 != null) {
				for (@Pc(111) int local111 = 0; local111 < this.anIntArray48.length; local111++) {
					local97.method965(this.anIntArray48[local111], this.anIntArray47[local111]);
				}
			}
			return local97;
		}
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	public void method437() {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Z")
	public boolean method438() {
		if (this.anIntArray49 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt642 != -1) {
			local15 = Static100.method1585(this.anInt642);
		} else if (this.anInt649 != -1) {
			local15 = Static62.anIntArray174[this.anInt649];
		}
		return local15 >= 0 && this.anIntArray49.length > local15 && this.anIntArray49[local15] != -1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!kd;)V")
	public void method439(@OriginalArg(1) Class3_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1803();
			if (local11 == 0) {
				return;
			}
			this.method440(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!kd;BI)V")
	private void method440(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(180) int local180;
		@Pc(188) int local188;
		if (arg1 == 1) {
			local180 = arg0.method1803();
			this.anIntArray50 = new int[local180];
			for (local188 = 0; local188 < local180; local188++) {
				this.anIntArray50[local188] = arg0.method1789();
			}
		} else if (arg1 == 2) {
			this.aClass62_267 = arg0.method1773();
		} else if (arg1 == 12) {
			this.anInt648 = arg0.method1803();
		} else if (arg1 == 13) {
			this.anInt653 = arg0.method1789();
		} else if (arg1 == 14) {
			this.anInt658 = arg0.method1789();
		} else if (arg1 == 17) {
			this.anInt658 = arg0.method1789();
			this.anInt640 = arg0.method1789();
			this.anInt662 = arg0.method1789();
			this.anInt657 = arg0.method1789();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass62Array5[arg1 - 30] = arg0.method1773();
			if (this.aClass62Array5[arg1 - 30].method1680(Static72.aClass62_861)) {
				this.aClass62Array5[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local180 = arg0.method1803();
			this.anIntArray48 = new int[local180];
			this.anIntArray47 = new int[local180];
			for (local188 = 0; local188 < local180; local188++) {
				this.anIntArray48[local188] = arg0.method1789();
				this.anIntArray47[local188] = arg0.method1789();
			}
		} else if (arg1 == 60) {
			local180 = arg0.method1803();
			this.anIntArray51 = new int[local180];
			for (local188 = 0; local188 < local180; local188++) {
				this.anIntArray51[local188] = arg0.method1789();
			}
		} else if (arg1 == 93) {
			this.aBoolean32 = false;
		} else if (arg1 == 95) {
			this.anInt652 = arg0.method1789();
		} else if (arg1 == 97) {
			this.anInt659 = arg0.method1789();
		} else if (arg1 == 98) {
			this.anInt664 = arg0.method1789();
		} else if (arg1 == 99) {
			this.aBoolean34 = true;
		} else if (arg1 == 100) {
			this.anInt655 = arg0.method1765();
		} else if (arg1 == 101) {
			this.anInt647 = arg0.method1765() * 5;
		} else if (arg1 == 102) {
			this.anInt663 = arg0.method1789();
		} else if (arg1 == 103) {
			this.anInt665 = arg0.method1789();
		} else if (arg1 == 106) {
			this.anInt642 = arg0.method1789();
			if (this.anInt642 == 65535) {
				this.anInt642 = -1;
			}
			this.anInt649 = arg0.method1789();
			if (this.anInt649 == 65535) {
				this.anInt649 = -1;
			}
			local180 = arg0.method1803();
			this.anIntArray49 = new int[local180 + 1];
			for (local188 = 0; local188 <= local180; local188++) {
				this.anIntArray49[local188] = arg0.method1789();
				if (this.anIntArray49[local188] == 65535) {
					this.anIntArray49[local188] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean33 = false;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!oe;IIILclient!oe;)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method441(@OriginalArg(0) Class3_Sub1_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub11 arg3) {
		if (this.anIntArray49 != null) {
			@Pc(12) Class3_Sub1_Sub4 local12 = this.method443();
			return local12 == null ? null : local12.method441(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class3_Sub1_Sub3_Sub3 local37 = (Class3_Sub1_Sub3_Sub3) Static46.aClass34_18.method764((long) this.anInt660);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray50.length; local43++) {
				if (!Static19.aClass42_75.method1493(0, this.anIntArray50[local43])) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(75) Class3_Sub1_Sub3_Sub3[] local75 = new Class3_Sub1_Sub3_Sub3[this.anIntArray50.length];
			for (@Pc(77) int local77 = 0; local77 < this.anIntArray50.length; local77++) {
				local75[local77] = Static57.method949(Static19.aClass42_75, this.anIntArray50[local77]);
			}
			if (local75.length == 1) {
				local37 = local75[0];
			} else {
				local37 = new Class3_Sub1_Sub3_Sub3(local75, local75.length);
			}
			if (this.anIntArray48 != null) {
				for (@Pc(121) int local121 = 0; local121 < this.anIntArray48.length; local121++) {
					local37.method965(this.anIntArray48[local121], this.anIntArray47[local121]);
				}
			}
			local37.method945();
			local37.method953(this.anInt655 + 64, this.anInt647 + 850, -30, -50, -30, true);
			Static46.aClass34_18.method765((long) this.anInt660, local37);
		}
		@Pc(178) Class3_Sub1_Sub3_Sub3 local178;
		if (arg0 != null && arg3 != null) {
			local178 = arg0.method1225(arg1, arg2, arg3, local37);
		} else if (arg0 != null) {
			local178 = arg0.method1228(local37, arg1);
		} else if (arg3 == null) {
			local178 = local37.method950(true);
		} else {
			local178 = arg3.method1228(local37, arg2);
		}
		if (this.anInt659 != 128 || this.anInt664 != 128) {
			local178.method957(this.anInt659, this.anInt664, this.anInt659);
		}
		return local178;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(B)Lclient!db;")
	public Class3_Sub1_Sub4 method443() {
		@Pc(5) int local5 = -1;
		if (this.anInt642 != -1) {
			local5 = Static100.method1585(this.anInt642);
		} else if (this.anInt649 != -1) {
			local5 = Static62.anIntArray174[this.anInt649];
		}
		return local5 < 0 || local5 >= this.anIntArray49.length || this.anIntArray49[local5] == -1 ? null : Static92.method1547(this.anIntArray49[local5]);
	}
}
