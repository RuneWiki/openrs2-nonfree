import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "[I")
	private int[] anIntArray33;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!ah", name = "Y", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!ah", name = "qb", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
	public int anInt474 = -1;

	@OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
	public int anInt480 = -1;

	@OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
	public int anInt479 = 5;

	@OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
	public int anInt481 = -1;

	@OriginalMember(owner = "client!ah", name = "mb", descriptor = "I")
	public int anInt486 = -1;

	@OriginalMember(owner = "client!ah", name = "lb", descriptor = "I")
	public int anInt485 = -1;

	@OriginalMember(owner = "client!ah", name = "rb", descriptor = "I")
	public int anInt489 = 2;

	@OriginalMember(owner = "client!ah", name = "sb", descriptor = "Z")
	public boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ah", name = "nb", descriptor = "I")
	public int anInt487 = 99;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BILclient!df;I)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method305(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub4_Sub1_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray37[arg2];
		@Pc(24) Class2_Sub4_Sub5 local24 = Static45.method878(local10 >> 16);
		@Pc(28) int local28 = local10 & 0xFFFF;
		if (local24 == null) {
			return arg1.method1201(true);
		}
		@Pc(38) int local38 = arg0 & 0x3;
		@Pc(49) Class2_Sub4_Sub1_Sub3 local49 = arg1.method1201(!local24.method659(local28));
		if (local38 == 1) {
			local49.method1190();
		} else if (local38 == 2) {
			local49.method1197();
		} else if (local38 == 3) {
			local49.method1195();
		}
		local49.method1196(local24, local28);
		if (local38 == 1) {
			local49.method1195();
		} else if (local38 == 2) {
			local49.method1197();
		} else if (local38 == 3) {
			local49.method1190();
		}
		return local49;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ah;IILclient!df;I)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method306(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub4_Sub1_Sub3 arg3) {
		@Pc(4) int local4 = this.anIntArray37[arg2];
		@Pc(14) Class2_Sub4_Sub5 local14 = Static45.method878(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method315(arg1, arg3);
		}
		@Pc(31) int local31 = arg0.anIntArray37[arg1];
		@Pc(37) Class2_Sub4_Sub5 local37 = Static45.method878(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class2_Sub4_Sub1_Sub3 local54;
		if (local37 == null) {
			local54 = arg3.method1201(!local14.method659(local18));
			local54.method1196(local14, local18);
			return local54;
		} else {
			local54 = arg3.method1201(!local14.method659(local18) & !local37.method659(local41));
			local54.method1198(local14, local18, local37, local41, this.anIntArray35);
			return local54;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!ab;)V")
	public void method309(@OriginalArg(1) Class2_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1698();
			if (local9 == 0) {
				return;
			}
			this.method310(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZILclient!ab;)V")
	private void method310(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(43) int local43;
		if (arg0 == 1) {
			local14 = arg1.method1680();
			this.anIntArray36 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray36[local20] = arg1.method1680();
			}
			this.anIntArray37 = new int[local14];
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray37[local43] = arg1.method1680();
			}
			for (@Pc(58) int local58 = 0; local58 < local14; local58++) {
				this.anIntArray37[local58] = (arg1.method1680() << 16) + this.anIntArray37[local58];
			}
		} else if (arg0 == 2) {
			this.anInt486 = arg1.method1680();
		} else if (arg0 == 3) {
			local14 = arg1.method1698();
			this.anIntArray35 = new int[local14 + 1];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray35[local20] = arg1.method1698();
			}
			this.anIntArray35[local14] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean14 = true;
		} else if (arg0 == 5) {
			this.anInt479 = arg1.method1698();
		} else if (arg0 == 6) {
			this.anInt485 = arg1.method1680();
		} else if (arg0 == 7) {
			this.anInt481 = arg1.method1680();
		} else if (arg0 == 8) {
			this.anInt487 = arg1.method1698();
		} else if (arg0 == 9) {
			this.anInt474 = arg1.method1698();
		} else if (arg0 == 10) {
			this.anInt480 = arg1.method1698();
		} else if (arg0 == 11) {
			this.anInt489 = arg1.method1698();
		} else if (arg0 == 12) {
			local14 = arg1.method1698();
			this.anIntArray33 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray33[local20] = arg1.method1680();
			}
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray33[local43] += arg1.method1680() << 16;
			}
		} else if (arg0 == 13) {
			local14 = arg1.method1698();
			this.anIntArray34 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray34[local20] = arg1.method1654();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILclient!df;)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method311(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub4_Sub1_Sub3 arg1) {
		@Pc(4) int local4 = this.anIntArray37[arg0];
		@Pc(14) Class2_Sub4_Sub5 local14 = Static45.method878(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1201(true);
		}
		@Pc(26) Class2_Sub4_Sub5 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray33 != null && arg0 < this.anIntArray33.length) {
			local28 = this.anIntArray33[arg0];
			local26 = Static45.method878(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(73) Class2_Sub4_Sub1_Sub3 local73;
		if (local26 == null || local28 == 65535) {
			local73 = arg1.method1201(!local14.method659(local18));
			local73.method1196(local14, local18);
			return local73;
		} else {
			local73 = arg1.method1201(!local14.method659(local18) & !local26.method659(local28));
			local73.method1196(local14, local18);
			local73.method1196(local26, local28);
			return local73;
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
	public void method313() {
		if (this.anInt474 == -1) {
			if (this.anIntArray35 == null) {
				this.anInt474 = 0;
			} else {
				this.anInt474 = 2;
			}
		}
		if (this.anInt480 != -1) {
			return;
		}
		if (this.anIntArray35 == null) {
			this.anInt480 = 0;
		} else {
			this.anInt480 = 2;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!df;I)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method315(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4_Sub1_Sub3 arg1) {
		@Pc(13) int local13 = this.anIntArray37[arg0];
		@Pc(19) Class2_Sub4_Sub5 local19 = Static45.method878(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method1201(true);
		} else {
			@Pc(40) Class2_Sub4_Sub1_Sub3 local40 = arg1.method1201(!local19.method659(local23));
			local40.method1196(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!df;II)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method316(@OriginalArg(0) Class2_Sub4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray37[arg1];
		@Pc(14) Class2_Sub4_Sub5 local14 = Static45.method878(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1194(true);
		} else {
			@Pc(40) Class2_Sub4_Sub1_Sub3 local40 = arg0.method1194(!local14.method659(local18));
			local40.method1196(local14, local18);
			return local40;
		}
	}
}
