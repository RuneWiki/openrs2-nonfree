import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class4_Sub3_Sub13 extends Class4_Sub3 {

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
	public int anInt2203;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!qd", name = "jb", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!qd", name = "pb", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!qd", name = "qb", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!qd", name = "rb", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!qd", name = "vb", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "Z")
	public boolean aBoolean78 = true;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
	private int anInt2207 = -1;

	@OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
	private int anInt2218 = 128;

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
	public int anInt2211 = -1;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "[Lclient!od;")
	public final Class60[] aClass60Array16 = new Class60[5];

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
	public int anInt2212 = -1;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
	public int anInt2204 = -1;

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
	private int anInt2209 = 128;

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "Z")
	public boolean aBoolean79 = false;

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "Z")
	public boolean aBoolean80 = true;

	@OriginalMember(owner = "client!qd", name = "sb", descriptor = "Lclient!od;")
	public Class60 aClass60_908 = Static10.aClass60_100;

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
	public int anInt2206 = -1;

	@OriginalMember(owner = "client!qd", name = "nb", descriptor = "I")
	private int anInt2222 = 0;

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
	public int anInt2208 = -1;

	@OriginalMember(owner = "client!qd", name = "xb", descriptor = "I")
	private int anInt2227 = -1;

	@OriginalMember(owner = "client!qd", name = "wb", descriptor = "I")
	public int anInt2226 = -1;

	@OriginalMember(owner = "client!qd", name = "mb", descriptor = "I")
	public int anInt2221 = 32;

	@OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
	public int anInt2219 = -1;

	@OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
	public int anInt2217 = -1;

	@OriginalMember(owner = "client!qd", name = "ob", descriptor = "I")
	private int anInt2223 = 0;

	@OriginalMember(owner = "client!qd", name = "Cb", descriptor = "Z")
	public boolean aBoolean81 = true;

	@OriginalMember(owner = "client!qd", name = "Ab", descriptor = "I")
	public int anInt2228 = -1;

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
	public int anInt2214 = 1;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)Lclient!pf;")
	public Class4_Sub3_Sub1_Sub5 method1520() {
		if (this.anIntArray282 != null) {
			@Pc(12) Class4_Sub3_Sub13 local12 = this.method1526();
			return local12 == null ? null : local12.method1520();
		} else if (this.anIntArray280 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray280.length; local29++) {
				if (!Static8.aClass10_6.method1778(this.anIntArray280[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Class4_Sub3_Sub1_Sub5[] local57 = new Class4_Sub3_Sub1_Sub5[this.anIntArray280.length];
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray280.length; local59++) {
				local57[local59] = Static89.method1445(Static8.aClass10_6, this.anIntArray280[local59]);
			}
			@Pc(88) Class4_Sub3_Sub1_Sub5 local88;
			if (local57.length == 1) {
				local88 = local57[0];
			} else {
				local88 = new Class4_Sub3_Sub1_Sub5(local57, local57.length);
			}
			@Pc(99) int local99;
			if (this.aShortArray33 != null) {
				for (local99 = 0; local99 < this.aShortArray33.length; local99++) {
					local88.method1433(this.aShortArray33[local99], this.aShortArray31[local99]);
				}
			}
			if (this.aShortArray32 != null) {
				for (local99 = 0; local99 < this.aShortArray32.length; local99++) {
					local88.method1439(this.aShortArray32[local99], this.aShortArray34[local99]);
				}
			}
			return local88;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ne;Lclient!ne;ZII)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1521(@OriginalArg(0) Class4_Sub3_Sub10 arg0, @OriginalArg(1) Class4_Sub3_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray282 != null) {
			@Pc(12) Class4_Sub3_Sub13 local12 = this.method1526();
			return local12 == null ? null : local12.method1521(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class4_Sub3_Sub1_Sub7 local32 = (Class4_Sub3_Sub1_Sub7) Static80.aClass12_15.method289((long) this.anInt2203);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray281.length; local38++) {
				if (!Static8.aClass10_6.method1778(this.anIntArray281[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(66) Class4_Sub3_Sub1_Sub5[] local66 = new Class4_Sub3_Sub1_Sub5[this.anIntArray281.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray281.length; local68++) {
				local66[local68] = Static89.method1445(Static8.aClass10_6, this.anIntArray281[local68]);
			}
			@Pc(99) Class4_Sub3_Sub1_Sub5 local99;
			if (local66.length == 1) {
				local99 = local66[0];
			} else {
				local99 = new Class4_Sub3_Sub1_Sub5(local66, local66.length);
			}
			@Pc(110) int local110;
			if (this.aShortArray33 != null) {
				for (local110 = 0; local110 < this.aShortArray33.length; local110++) {
					local99.method1433(this.aShortArray33[local110], this.aShortArray31[local110]);
				}
			}
			if (this.aShortArray32 != null) {
				for (local110 = 0; local110 < this.aShortArray32.length; local110++) {
					local99.method1439(this.aShortArray32[local110], this.aShortArray34[local110]);
				}
			}
			local32 = local99.method1444(this.anInt2222 + 64, this.anInt2223 + 850, -30, -50, -30);
			Static80.aClass12_15.method290(local32, (long) this.anInt2203);
		}
		@Pc(198) Class4_Sub3_Sub1_Sub7 local198;
		if (arg0 != null && arg1 != null) {
			local198 = arg0.method1262(arg2, arg1, arg3, local32);
		} else if (arg0 != null) {
			local198 = arg0.method1259(arg2, local32);
		} else if (arg1 == null) {
			local198 = local32.method1500(true);
		} else {
			local198 = arg1.method1259(arg3, local32);
		}
		if (this.anInt2209 != 128 || this.anInt2218 != 128) {
			local198.method1509(this.anInt2209, this.anInt2218, this.anInt2209);
		}
		return local198;
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)Z")
	public boolean method1522() {
		if (this.anIntArray282 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2227 != -1) {
			local10 = Static59.method973(this.anInt2227);
		} else if (this.anInt2207 != -1) {
			local10 = Static53.anIntArray141[this.anInt2207];
		}
		return local10 >= 0 && local10 < this.anIntArray282.length && this.anIntArray282[local10] != -1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!tf;)V")
	public void method1523(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method773();
			if (local9 == 0) {
				return;
			}
			this.method1524(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZLclient!tf;)V")
	private void method1524(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		@Pc(87) int local87;
		@Pc(97) int local97;
		if (arg0 == 1) {
			local87 = arg1.method773();
			this.anIntArray281 = new int[local87];
			for (local97 = 0; local97 < local87; local97++) {
				this.anIntArray281[local97] = arg1.method816();
			}
		} else if (arg0 == 2) {
			this.aClass60_908 = arg1.method776();
		} else if (arg0 == 12) {
			this.anInt2214 = arg1.method773();
		} else if (arg0 == 13) {
			this.anInt2206 = arg1.method816();
		} else if (arg0 == 14) {
			this.anInt2212 = arg1.method816();
		} else if (arg0 == 15) {
			this.anInt2204 = arg1.method816();
		} else if (arg0 == 16) {
			this.anInt2217 = arg1.method816();
		} else if (arg0 == 17) {
			this.anInt2212 = arg1.method816();
			this.anInt2226 = arg1.method816();
			this.anInt2228 = arg1.method816();
			this.anInt2208 = arg1.method816();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass60Array16[arg0 - 30] = arg1.method776();
			if (this.aClass60Array16[arg0 - 30].method1318(Static98.aClass60_929)) {
				this.aClass60Array16[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local87 = arg1.method773();
			this.aShortArray33 = new short[local87];
			this.aShortArray31 = new short[local87];
			for (local97 = 0; local97 < local87; local97++) {
				this.aShortArray33[local97] = (short) arg1.method816();
				this.aShortArray31[local97] = (short) arg1.method816();
			}
			return;
		} else if (arg0 == 41) {
			local87 = arg1.method773();
			this.aShortArray32 = new short[local87];
			this.aShortArray34 = new short[local87];
			for (local97 = 0; local97 < local87; local97++) {
				this.aShortArray32[local97] = (short) arg1.method816();
				this.aShortArray34[local97] = (short) arg1.method816();
			}
			return;
		} else if (arg0 == 60) {
			local87 = arg1.method773();
			this.anIntArray280 = new int[local87];
			for (local97 = 0; local97 < local87; local97++) {
				this.anIntArray280[local97] = arg1.method816();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean80 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt2219 = arg1.method816();
			return;
		} else if (arg0 == 97) {
			this.anInt2209 = arg1.method816();
			return;
		} else if (arg0 == 98) {
			this.anInt2218 = arg1.method816();
			return;
		} else if (arg0 == 99) {
			this.aBoolean79 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt2222 = arg1.method797();
			return;
		} else if (arg0 == 101) {
			this.anInt2223 = arg1.method797() * 5;
			return;
		} else if (arg0 == 102) {
			this.anInt2211 = arg1.method816();
			return;
		} else if (arg0 == 103) {
			this.anInt2221 = arg1.method816();
			return;
		} else if (arg0 == 106) {
			this.anInt2227 = arg1.method816();
			if (this.anInt2227 == 65535) {
				this.anInt2227 = -1;
			}
			this.anInt2207 = arg1.method816();
			if (this.anInt2207 == 65535) {
				this.anInt2207 = -1;
			}
			local87 = arg1.method773();
			this.anIntArray282 = new int[local87 + 1];
			for (local97 = 0; local97 <= local87; local97++) {
				this.anIntArray282[local97] = arg1.method816();
				if (this.anIntArray282[local97] == 65535) {
					this.anIntArray282[local97] = -1;
				}
			}
			return;
		} else {
			if (arg0 == 107) {
				this.aBoolean78 = false;
			} else if (arg0 == 109) {
				this.aBoolean81 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)Lclient!qd;")
	public Class4_Sub3_Sub13 method1526() {
		@Pc(10) int local10 = -1;
		if (this.anInt2227 != -1) {
			local10 = Static59.method973(this.anInt2227);
		} else if (this.anInt2207 != -1) {
			local10 = Static53.anIntArray141[this.anInt2207];
		}
		return local10 < 0 || local10 >= this.anIntArray282.length || this.anIntArray282[local10] == -1 ? null : Static110.method1820(this.anIntArray282[local10]);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public void method1527() {
	}
}
