import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!td", name = "X", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
	public int anInt3771;

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!td", name = "nb", descriptor = "[I")
	private int[] anIntArray553;

	@OriginalMember(owner = "client!td", name = "rb", descriptor = "[I")
	private int[] anIntArray554;

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!td", name = "Hb", descriptor = "[I")
	public int[] anIntArray555;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "Z")
	public boolean aBoolean152 = true;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "Z")
	public boolean aBoolean153 = true;

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "Lclient!sg;")
	public Class77 aClass77_1302 = Static7.aClass77_111;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
	public int anInt3767 = -1;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "I")
	private int anInt3761 = 128;

	@OriginalMember(owner = "client!td", name = "ob", descriptor = "I")
	private int anInt3776 = -1;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "I")
	private int anInt3763 = 0;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "[Lclient!sg;")
	public final Class77[] aClass77Array21 = new Class77[5];

	@OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
	public int anInt3781 = 32;

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
	public int anInt3768 = -1;

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "I")
	private int anInt3777 = -1;

	@OriginalMember(owner = "client!td", name = "sb", descriptor = "I")
	private int anInt3779 = 0;

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
	private int anInt3775 = 128;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "I")
	public int anInt3764 = -1;

	@OriginalMember(owner = "client!td", name = "Bb", descriptor = "I")
	public int anInt3787 = -1;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
	public int anInt3769 = -1;

	@OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
	public int anInt3783 = -1;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "I")
	public int anInt3766 = 1;

	@OriginalMember(owner = "client!td", name = "Fb", descriptor = "I")
	public int anInt3789 = -1;

	@OriginalMember(owner = "client!td", name = "Eb", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!td", name = "qb", descriptor = "I")
	public int anInt3778 = -1;

	@OriginalMember(owner = "client!td", name = "Ib", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!td", name = "zb", descriptor = "I")
	public int anInt3785 = -1;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public void method2609() {
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)Z")
	public boolean method2611() {
		if (this.anIntArray555 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt3777 != -1) {
			local10 = Static53.method1023(this.anInt3777);
		} else if (this.anInt3776 != -1) {
			local10 = Static6.anIntArray24[this.anInt3776];
		}
		return local10 >= 0 && this.anIntArray555.length > local10 && this.anIntArray555[local10] != -1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!tc;IIILclient!tc;)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method2612(@OriginalArg(0) Class2_Sub2_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub2_Sub15 arg3) {
		if (this.anIntArray555 != null) {
			@Pc(10) Class2_Sub2_Sub16 local10 = this.method2613();
			return local10 == null ? null : local10.method2612(arg0, arg1, arg2, arg3);
		}
		@Pc(30) Class2_Sub2_Sub1_Sub2 local30 = (Class2_Sub2_Sub1_Sub2) Static84.aClass82_46.method2699((long) this.anInt3771);
		if (local30 == null) {
			@Pc(39) boolean local39 = false;
			for (@Pc(41) int local41 = 0; local41 < this.anIntArray554.length; local41++) {
				if (!Static177.aClass43_44.method2220(0, this.anIntArray554[local41])) {
					local39 = true;
				}
			}
			if (local39) {
				return null;
			}
			@Pc(72) Class2_Sub2_Sub1_Sub3[] local72 = new Class2_Sub2_Sub1_Sub3[this.anIntArray554.length];
			for (@Pc(74) int local74 = 0; local74 < this.anIntArray554.length; local74++) {
				local72[local74] = Static47.method877(Static177.aClass43_44, this.anIntArray554[local74]);
			}
			@Pc(101) Class2_Sub2_Sub1_Sub3 local101;
			if (local72.length == 1) {
				local101 = local72[0];
			} else {
				local101 = new Class2_Sub2_Sub1_Sub3(local72, local72.length);
			}
			@Pc(114) int local114;
			if (this.aShortArray113 != null) {
				for (local114 = 0; local114 < this.aShortArray113.length; local114++) {
					local101.method864(this.aShortArray113[local114], this.aShortArray115[local114]);
				}
			}
			if (this.aShortArray114 != null) {
				for (local114 = 0; local114 < this.aShortArray114.length; local114++) {
					local101.method880(this.aShortArray114[local114], this.aShortArray116[local114]);
				}
			}
			local30 = local101.method865(this.anInt3763 + 64, this.anInt3779 + 850, -30, -50, -30, true);
			Static84.aClass82_46.method2701((long) this.anInt3771, local30);
		}
		@Pc(188) Class2_Sub2_Sub1_Sub2 local188;
		if (arg0 != null && arg3 != null) {
			local188 = arg0.method2589(local30, arg2, arg3, arg1);
		} else if (arg0 != null) {
			local188 = arg0.method2596(arg1, local30);
		} else if (arg3 == null) {
			local188 = local30.method582(true);
		} else {
			local188 = arg3.method2596(arg2, local30);
		}
		if (this.anInt3761 != 128 || this.anInt3775 != 128) {
			local188.method597(this.anInt3761, this.anInt3775, this.anInt3761);
		}
		return local188;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Lclient!td;")
	public Class2_Sub2_Sub16 method2613() {
		@Pc(11) int local11 = -1;
		if (this.anInt3777 != -1) {
			local11 = Static53.method1023(this.anInt3777);
		} else if (this.anInt3776 != -1) {
			local11 = Static6.anIntArray24[this.anInt3776];
		}
		return local11 < 0 || this.anIntArray555.length <= local11 || this.anIntArray555[local11] == -1 ? null : Static131.method2901(this.anIntArray555[local11]);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!oa;B)V")
	public void method2614(@OriginalArg(0) Class2_Sub18 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2387();
			if (local3 == 0) {
				return;
			}
			this.method2615(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!oa;I)V")
	private void method2615(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		if (arg1 == 1) {
			local16 = arg0.method2387();
			this.anIntArray554 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray554[local22] = arg0.method2353();
			}
		} else if (arg1 == 2) {
			this.aClass77_1302 = arg0.method2361();
		} else if (arg1 == 12) {
			this.anInt3766 = arg0.method2387();
		} else if (arg1 == 13) {
			this.anInt3778 = arg0.method2353();
		} else if (arg1 == 14) {
			this.anInt3768 = arg0.method2353();
		} else if (arg1 == 15) {
			this.anInt3769 = arg0.method2353();
		} else if (arg1 == 16) {
			this.anInt3785 = arg0.method2353();
		} else if (arg1 == 17) {
			this.anInt3768 = arg0.method2353();
			this.anInt3767 = arg0.method2353();
			this.anInt3764 = arg0.method2353();
			this.anInt3783 = arg0.method2353();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass77Array21[arg1 - 30] = arg0.method2361();
			if (this.aClass77Array21[arg1 - 30].method2508(Static119.aClass77_1104)) {
				this.aClass77Array21[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local16 = arg0.method2387();
			this.aShortArray113 = new short[local16];
			this.aShortArray115 = new short[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.aShortArray113[local22] = (short) arg0.method2353();
				this.aShortArray115[local22] = (short) arg0.method2353();
			}
		} else if (arg1 == 41) {
			local16 = arg0.method2387();
			this.aShortArray116 = new short[local16];
			this.aShortArray114 = new short[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.aShortArray114[local22] = (short) arg0.method2353();
				this.aShortArray116[local22] = (short) arg0.method2353();
			}
		} else if (arg1 == 60) {
			local16 = arg0.method2387();
			this.anIntArray553 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray553[local22] = arg0.method2353();
			}
		} else if (arg1 == 93) {
			this.aBoolean152 = false;
		} else if (arg1 == 95) {
			this.anInt3789 = arg0.method2353();
		} else if (arg1 == 97) {
			this.anInt3761 = arg0.method2353();
		} else if (arg1 == 98) {
			this.anInt3775 = arg0.method2353();
		} else if (arg1 == 99) {
			this.aBoolean156 = true;
		} else if (arg1 == 100) {
			this.anInt3763 = arg0.method2392();
		} else if (arg1 == 101) {
			this.anInt3779 = arg0.method2392() * 5;
		} else if (arg1 == 102) {
			this.anInt3787 = arg0.method2353();
		} else if (arg1 == 103) {
			this.anInt3781 = arg0.method2353();
		} else if (arg1 == 106) {
			this.anInt3777 = arg0.method2353();
			if (this.anInt3777 == 65535) {
				this.anInt3777 = -1;
			}
			this.anInt3776 = arg0.method2353();
			if (this.anInt3776 == 65535) {
				this.anInt3776 = -1;
			}
			local16 = arg0.method2387();
			this.anIntArray555 = new int[local16 + 1];
			for (local22 = 0; local22 <= local16; local22++) {
				this.anIntArray555[local22] = arg0.method2353();
				if (this.anIntArray555[local22] == 65535) {
					this.anIntArray555[local22] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean155 = false;
		} else if (arg1 == 109) {
			this.aBoolean153 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILclient!tc;)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method2617(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2_Sub15 arg1) {
		if (this.anIntArray555 != null) {
			@Pc(12) Class2_Sub2_Sub16 local12 = this.method2613();
			return local12 == null ? null : local12.method2617(arg0, arg1);
		} else if (this.anIntArray553 == null) {
			return null;
		} else {
			@Pc(42) Class2_Sub2_Sub1_Sub2 local42 = (Class2_Sub2_Sub1_Sub2) Static6.aClass82_3.method2699((long) this.anInt3771);
			if (local42 == null) {
				@Pc(46) boolean local46 = false;
				for (@Pc(48) int local48 = 0; local48 < this.anIntArray553.length; local48++) {
					if (!Static177.aClass43_44.method2220(0, this.anIntArray553[local48])) {
						local46 = true;
					}
				}
				if (local46) {
					return null;
				}
				@Pc(76) Class2_Sub2_Sub1_Sub3[] local76 = new Class2_Sub2_Sub1_Sub3[this.anIntArray553.length];
				for (@Pc(78) int local78 = 0; local78 < this.anIntArray553.length; local78++) {
					local76[local78] = Static47.method877(Static177.aClass43_44, this.anIntArray553[local78]);
				}
				@Pc(108) Class2_Sub2_Sub1_Sub3 local108;
				if (local76.length == 1) {
					local108 = local76[0];
				} else {
					local108 = new Class2_Sub2_Sub1_Sub3(local76, local76.length);
				}
				@Pc(122) int local122;
				if (this.aShortArray113 != null) {
					for (local122 = 0; local122 < this.aShortArray113.length; local122++) {
						local108.method864(this.aShortArray113[local122], this.aShortArray115[local122]);
					}
				}
				if (this.aShortArray114 != null) {
					for (local122 = 0; local122 < this.aShortArray114.length; local122++) {
						local108.method880(this.aShortArray114[local122], this.aShortArray116[local122]);
					}
				}
				local42 = local108.method865(64, 768, -50, -10, -50, true);
				Static6.aClass82_3.method2701((long) this.anInt3771, local42);
			}
			if (arg1 != null) {
				local42 = arg1.method2587(arg0, local42);
			}
			return local42;
		}
	}
}
