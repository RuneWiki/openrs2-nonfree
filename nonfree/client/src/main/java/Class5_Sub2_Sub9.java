import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!ka", name = "db", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!ka", name = "gb", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!ka", name = "ib", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
	public int anInt1658 = -1;

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
	public int anInt1662 = -1;

	@OriginalMember(owner = "client!ka", name = "pb", descriptor = "I")
	public int anInt1667 = -1;

	@OriginalMember(owner = "client!ka", name = "vb", descriptor = "I")
	public int anInt1672 = -1;

	@OriginalMember(owner = "client!ka", name = "xb", descriptor = "I")
	public int anInt1674 = 5;

	@OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
	public int anInt1664 = 2;

	@OriginalMember(owner = "client!ka", name = "qb", descriptor = "I")
	public int anInt1668 = 99;

	@OriginalMember(owner = "client!ka", name = "Ab", descriptor = "I")
	public int anInt1676 = -1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILclient!dd;Lclient!ka;I)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method1147(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub2_Sub4_Sub2 arg1, @OriginalArg(3) Class5_Sub2_Sub9 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray249[arg3];
		@Pc(14) Class5_Sub2_Sub12 local14 = Static50.method1110(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg2.method1151(arg0, arg1);
		}
		@Pc(31) int local31 = arg2.anIntArray249[arg0];
		@Pc(37) Class5_Sub2_Sub12 local37 = Static50.method1110(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class5_Sub2_Sub4_Sub2 local54;
		if (local37 == null) {
			local54 = arg1.method436(!local14.method1725(local18));
			local54.method417(local14, local18);
			return local54;
		} else {
			local54 = arg1.method436(!local14.method1725(local18) & !local37.method1725(local41));
			local54.method432(local14, local18, local37, local41, this.anIntArray250);
			return local54;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!hb;BI)V")
	private void method1148(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(43) int local43;
		if (arg1 == 1) {
			local19 = arg0.method1408();
			this.anIntArray252 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray252[local25] = arg0.method1418();
			}
			this.anIntArray249 = new int[local19];
			for (local43 = 0; local43 < local19; local43++) {
				this.anIntArray249[local43] = arg0.method1418();
			}
			for (@Pc(61) int local61 = 0; local61 < local19; local61++) {
				this.anIntArray249[local61] = (arg0.method1418() << 16) + this.anIntArray249[local61];
			}
		} else if (arg1 == 2) {
			this.anInt1672 = arg0.method1418();
		} else if (arg1 == 3) {
			local19 = arg0.method1408();
			this.anIntArray250 = new int[local19 + 1];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray250[local25] = arg0.method1408();
			}
			this.anIntArray250[local19] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean82 = true;
		} else if (arg1 == 5) {
			this.anInt1674 = arg0.method1408();
		} else if (arg1 == 6) {
			this.anInt1676 = arg0.method1418();
		} else if (arg1 == 7) {
			this.anInt1667 = arg0.method1418();
		} else if (arg1 == 8) {
			this.anInt1668 = arg0.method1408();
		} else if (arg1 == 9) {
			this.anInt1658 = arg0.method1408();
		} else if (arg1 == 10) {
			this.anInt1662 = arg0.method1408();
		} else if (arg1 == 11) {
			this.anInt1664 = arg0.method1408();
		} else if (arg1 == 12) {
			local19 = arg0.method1408();
			this.anIntArray248 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray248[local25] = arg0.method1418();
			}
			for (local43 = 0; local43 < local19; local43++) {
				this.anIntArray248[local43] = (arg0.method1418() << 16) + this.anIntArray248[local43];
			}
		} else if (arg1 == 13) {
			local19 = arg0.method1408();
			this.anIntArray251 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray251[local25] = arg0.method1409();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	public void method1149() {
		if (this.anInt1658 == -1) {
			if (this.anIntArray250 == null) {
				this.anInt1658 = 0;
			} else {
				this.anInt1658 = 2;
			}
		}
		if (this.anInt1662 != -1) {
			return;
		}
		if (this.anIntArray250 == null) {
			this.anInt1662 = 0;
		} else {
			this.anInt1662 = 2;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLclient!dd;)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method1151(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub2_Sub4_Sub2 arg1) {
		@Pc(4) int local4 = this.anIntArray249[arg0];
		@Pc(14) Class5_Sub2_Sub12 local14 = Static50.method1110(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method436(true);
		} else {
			@Pc(35) Class5_Sub2_Sub4_Sub2 local35 = arg1.method436(!local14.method1725(local18));
			local35.method417(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!hb;B)V")
	public void method1153(@OriginalArg(0) Class5_Sub9 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1408();
			if (local11 == 0) {
				return;
			}
			this.method1148(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dd;II)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method1156(@OriginalArg(0) Class5_Sub2_Sub4_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray249[arg1];
		@Pc(14) Class5_Sub2_Sub12 local14 = Static50.method1110(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method436(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class5_Sub2_Sub12 local28 = null;
		if (this.anIntArray248 != null && this.anIntArray248.length > arg1) {
			local26 = this.anIntArray248[arg1];
			local28 = Static50.method1110(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(73) Class5_Sub2_Sub4_Sub2 local73;
		if (local28 == null || local26 == 65535) {
			local73 = arg0.method436(!local14.method1725(local18));
			local73.method417(local14, local18);
			return local73;
		} else {
			local73 = arg0.method436(!local14.method1725(local18) & !local28.method1725(local26));
			local73.method417(local14, local18);
			local73.method417(local28, local26);
			return local73;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!dd;II)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method1157(@OriginalArg(1) Class5_Sub2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4 = this.anIntArray249[arg1];
		@Pc(10) Class5_Sub2_Sub12 local10 = Static50.method1110(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method436(true);
		}
		@Pc(28) int local28 = arg2 & 0x3;
		@Pc(47) Class5_Sub2_Sub4_Sub2 local47 = arg0.method436(!local10.method1725(local18));
		if (local28 == 1) {
			local47.method423();
		} else if (local28 == 2) {
			local47.method424();
		} else if (local28 == 3) {
			local47.method428();
		}
		local47.method417(local10, local18);
		if (local28 == 1) {
			local47.method428();
		} else if (local28 == 2) {
			local47.method424();
		} else if (local28 == 3) {
			local47.method423();
		}
		return local47;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!dd;I)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method1158(@OriginalArg(1) Class5_Sub2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray249[arg1];
		@Pc(14) Class5_Sub2_Sub12 local14 = Static50.method1110(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method434(true);
		} else {
			@Pc(35) Class5_Sub2_Sub4_Sub2 local35 = arg0.method434(!local14.method1725(local18));
			local35.method417(local14, local18);
			return local35;
		}
	}
}
