import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!h", name = "W", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "[I")
	public int[] anIntArray176;

	@OriginalMember(owner = "client!h", name = "sb", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "I")
	public int anInt1338 = -1;

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "I")
	public int anInt1352 = -1;

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "I")
	public int anInt1347 = -1;

	@OriginalMember(owner = "client!h", name = "db", descriptor = "I")
	public int anInt1346 = 2;

	@OriginalMember(owner = "client!h", name = "nb", descriptor = "I")
	public int anInt1351 = 99;

	@OriginalMember(owner = "client!h", name = "wb", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!h", name = "Ab", descriptor = "I")
	public int anInt1357 = -1;

	@OriginalMember(owner = "client!h", name = "zb", descriptor = "I")
	public int anInt1356 = 5;

	@OriginalMember(owner = "client!h", name = "Eb", descriptor = "I")
	public int anInt1360 = -1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!wb;)V")
	public void method730(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1780();
			if (local9 == 0) {
				return;
			}
			this.method731(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!wb;II)V")
	private void method731(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(39) int local39;
		if (arg1 == 1) {
			local14 = arg0.method1780();
			this.anIntArray174 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray174[local20] = arg0.method1783();
			}
			this.anIntArray176 = new int[local14];
			for (local39 = 0; local39 < local14; local39++) {
				this.anIntArray176[local39] = arg0.method1783();
			}
			for (@Pc(54) int local54 = 0; local54 < local14; local54++) {
				this.anIntArray176[local54] += arg0.method1783() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt1352 = arg0.method1783();
		} else if (arg1 == 3) {
			local14 = arg0.method1780();
			this.anIntArray177 = new int[local14 + 1];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray177[local20] = arg0.method1780();
			}
			this.anIntArray177[local14] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean83 = true;
		} else if (arg1 == 5) {
			this.anInt1356 = arg0.method1780();
		} else if (arg1 == 6) {
			this.anInt1357 = arg0.method1783();
		} else if (arg1 == 7) {
			this.anInt1338 = arg0.method1783();
		} else if (arg1 == 8) {
			this.anInt1351 = arg0.method1780();
		} else if (arg1 == 9) {
			this.anInt1347 = arg0.method1780();
		} else if (arg1 == 10) {
			this.anInt1360 = arg0.method1780();
		} else if (arg1 == 11) {
			this.anInt1346 = arg0.method1780();
		} else if (arg1 == 12) {
			local14 = arg0.method1780();
			this.anIntArray175 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray175[local20] = arg0.method1783();
			}
			for (local39 = 0; local39 < local14; local39++) {
				this.anIntArray175[local39] += arg0.method1783() << 16;
			}
		} else if (arg1 == 13) {
			local14 = arg0.method1780();
			this.anIntArray172 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray172[local20] = arg0.method1795();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!be;III)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method732(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = this.anIntArray176[arg2];
		@Pc(21) Class2_Sub1_Sub16 local21 = Static5.method103(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg0.method212(true);
		}
		@Pc(35) int local35 = arg1 & 0x3;
		@Pc(46) Class2_Sub1_Sub1_Sub2 local46 = arg0.method212(!local21.method1845(local25));
		if (local35 == 1) {
			local46.method211();
		} else if (local35 == 2) {
			local46.method208();
		} else if (local35 == 3) {
			local46.method215();
		}
		local46.method219(local21, local25);
		if (local35 == 1) {
			local46.method215();
		} else if (local35 == 2) {
			local46.method208();
		} else if (local35 == 3) {
			local46.method211();
		}
		return local46;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	public void method733() {
		if (this.anInt1360 == -1) {
			if (this.anIntArray177 == null) {
				this.anInt1360 = 0;
			} else {
				this.anInt1360 = 2;
			}
		}
		if (this.anInt1347 != -1) {
			return;
		}
		if (this.anIntArray177 == null) {
			this.anInt1347 = 0;
		} else {
			this.anInt1347 = 2;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!be;)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method735(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray176[arg0];
		@Pc(14) Class2_Sub1_Sub16 local14 = Static5.method103(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method212(true);
		}
		@Pc(31) Class2_Sub1_Sub16 local31 = null;
		@Pc(33) int local33 = 0;
		if (this.anIntArray175 != null && this.anIntArray175.length > arg0) {
			local33 = this.anIntArray175[arg0];
			local31 = Static5.method103(local33 >> 16);
			local33 &= 0xFFFF;
		}
		@Pc(78) Class2_Sub1_Sub1_Sub2 local78;
		if (local31 == null || local33 == 65535) {
			local78 = arg1.method212(!local14.method1845(local18));
			local78.method219(local14, local18);
			return local78;
		} else {
			local78 = arg1.method212(!local14.method1845(local18) & !local31.method1845(local33));
			local78.method219(local14, local18);
			local78.method219(local31, local33);
			return local78;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!be;BI)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method737(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anIntArray176[arg1];
		@Pc(18) Class2_Sub1_Sub16 local18 = Static5.method103(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local18 == null) {
			return arg0.method212(true);
		} else {
			@Pc(43) Class2_Sub1_Sub1_Sub2 local43 = arg0.method212(!local18.method1845(local26));
			local43.method219(local18, local26);
			return local43;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!be;IB)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method738(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray176[arg1];
		@Pc(14) Class2_Sub1_Sub16 local14 = Static5.method103(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method204(true);
		} else {
			@Pc(43) Class2_Sub1_Sub1_Sub2 local43 = arg0.method204(!local14.method1845(local18));
			local43.method219(local14, local18);
			return local43;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!be;ILclient!h;)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method741(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub8 arg3) {
		@Pc(8) int local8 = this.anIntArray176[arg2];
		@Pc(14) Class2_Sub1_Sub16 local14 = Static5.method103(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg3.method737(arg1, arg0);
		}
		@Pc(31) int local31 = arg3.anIntArray176[arg0];
		@Pc(37) Class2_Sub1_Sub16 local37 = Static5.method103(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(59) Class2_Sub1_Sub1_Sub2 local59;
		if (local37 == null) {
			local59 = arg1.method212(!local14.method1845(local18));
			local59.method219(local14, local18);
			return local59;
		} else {
			local59 = arg1.method212(!local14.method1845(local18) & !local37.method1845(local41));
			local59.method220(local14, local18, local37, local41, this.anIntArray177);
			return local59;
		}
	}
}
