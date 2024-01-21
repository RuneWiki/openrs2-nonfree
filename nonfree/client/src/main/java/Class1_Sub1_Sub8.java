import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!h", name = "mb", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!h", name = "yb", descriptor = "[I")
	private int[] anIntArray146;

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "I")
	public int anInt1069 = 99;

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
	public int anInt1067 = 5;

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
	public int anInt1072 = -1;

	@OriginalMember(owner = "client!h", name = "sb", descriptor = "I")
	public int anInt1074 = -1;

	@OriginalMember(owner = "client!h", name = "db", descriptor = "I")
	public int anInt1068 = -1;

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "I")
	public int anInt1080 = -1;

	@OriginalMember(owner = "client!h", name = "Ab", descriptor = "Z")
	public boolean aBoolean61 = false;

	@OriginalMember(owner = "client!h", name = "Ib", descriptor = "I")
	public int anInt1085 = -1;

	@OriginalMember(owner = "client!h", name = "Jb", descriptor = "I")
	public int anInt1086 = 2;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!qb;I)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub6 arg2) {
		@Pc(8) int local8 = this.anIntArray147[arg0];
		@Pc(14) Class1_Sub1_Sub18 local14 = Static40.method871(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg2.method1439(true);
		}
		@Pc(28) int local28 = arg1 & 0x3;
		@Pc(44) Class1_Sub1_Sub2_Sub6 local44 = arg2.method1439(!local14.method1860(local18));
		if (local28 == 1) {
			local44.method1444();
		} else if (local28 == 2) {
			local44.method1429();
		} else if (local28 == 3) {
			local44.method1450();
		}
		local44.method1423(local14, local18);
		if (local28 == 1) {
			local44.method1450();
		} else if (local28 == 2) {
			local44.method1429();
		} else if (local28 == 3) {
			local44.method1444();
		}
		return local44;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!h;ILclient!qb;I)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method586(@OriginalArg(1) Class1_Sub1_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub6 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray147[arg1];
		@Pc(14) Class1_Sub1_Sub18 local14 = Static40.method871(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method587(arg2, arg3);
		}
		@Pc(31) int local31 = arg0.anIntArray147[arg3];
		@Pc(37) Class1_Sub1_Sub18 local37 = Static40.method871(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(60) Class1_Sub1_Sub2_Sub6 local60;
		if (local37 == null) {
			local60 = arg2.method1439(!local14.method1860(local18));
			local60.method1423(local14, local18);
			return local60;
		} else {
			local60 = arg2.method1439(!local14.method1860(local18) & !local37.method1860(local41));
			local60.method1438(local14, local18, local37, local41, this.anIntArray144);
			return local60;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!qb;II)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method587(@OriginalArg(0) Class1_Sub1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray147[arg1];
		@Pc(19) Class1_Sub1_Sub18 local19 = Static40.method871(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1439(true);
		} else {
			@Pc(40) Class1_Sub1_Sub2_Sub6 local40 = arg0.method1439(!local19.method1860(local23));
			local40.method1423(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	public void method588() {
		if (this.anInt1068 == -1) {
			if (this.anIntArray144 == null) {
				this.anInt1068 = 0;
			} else {
				this.anInt1068 = 2;
			}
		}
		if (this.anInt1085 != -1) {
			return;
		}
		if (this.anIntArray144 == null) {
			this.anInt1085 = 0;
		} else {
			this.anInt1085 = 2;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!qb;B)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method589(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub6 arg1) {
		@Pc(8) int local8 = this.anIntArray147[arg0];
		@Pc(14) Class1_Sub1_Sub18 local14 = Static40.method871(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1439(true);
		}
		@Pc(31) Class1_Sub1_Sub18 local31 = null;
		@Pc(33) int local33 = 0;
		if (this.anIntArray146 != null && arg0 < this.anIntArray146.length) {
			local33 = this.anIntArray146[arg0];
			local31 = Static40.method871(local33 >> 16);
			local33 &= 0xFFFF;
		}
		@Pc(72) Class1_Sub1_Sub2_Sub6 local72;
		if (local31 == null || local33 == 65535) {
			local72 = arg1.method1439(!local14.method1860(local18));
			local72.method1423(local14, local18);
			return local72;
		} else {
			local72 = arg1.method1439(!local14.method1860(local18) & !local31.method1860(local33));
			local72.method1423(local14, local18);
			local72.method1423(local31, local33);
			return local72;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!rc;BI)V")
	private void method590(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(131) int local131;
		if (arg1 == 1) {
			local22 = arg0.method716();
			this.anIntArray143 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray143[local30] = arg0.method715();
			}
			this.anIntArray147 = new int[local22];
			for (local131 = 0; local131 < local22; local131++) {
				this.anIntArray147[local131] = arg0.method715();
			}
			for (@Pc(229) int local229 = 0; local229 < local22; local229++) {
				this.anIntArray147[local229] += arg0.method715() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt1074 = arg0.method715();
		} else if (arg1 == 3) {
			local22 = arg0.method716();
			this.anIntArray144 = new int[local22 + 1];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray144[local30] = arg0.method716();
			}
			this.anIntArray144[local22] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean61 = true;
		} else if (arg1 == 5) {
			this.anInt1067 = arg0.method716();
		} else if (arg1 == 6) {
			this.anInt1080 = arg0.method715();
		} else if (arg1 == 7) {
			this.anInt1072 = arg0.method715();
		} else if (arg1 == 8) {
			this.anInt1069 = arg0.method716();
		} else if (arg1 == 9) {
			this.anInt1068 = arg0.method716();
		} else if (arg1 == 10) {
			this.anInt1085 = arg0.method716();
		} else if (arg1 == 11) {
			this.anInt1086 = arg0.method716();
		} else if (arg1 == 12) {
			local22 = arg0.method716();
			this.anIntArray146 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray146[local30] = arg0.method715();
			}
			for (local131 = 0; local131 < local22; local131++) {
				this.anIntArray146[local131] += arg0.method715() << 16;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!rc;)V")
	public void method591(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method716();
			if (local11 == 0) {
				return;
			}
			this.method590(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!qb;IZ)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method592(@OriginalArg(0) Class1_Sub1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anIntArray147[arg1];
		@Pc(19) Class1_Sub1_Sub18 local19 = Static40.method871(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1447(true);
		} else {
			@Pc(40) Class1_Sub1_Sub2_Sub6 local40 = arg0.method1447(!local19.method1860(local23));
			local40.method1423(local19, local23);
			return local40;
		}
	}
}
