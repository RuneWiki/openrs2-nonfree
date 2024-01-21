import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class6_Sub3_Sub7 extends Class6_Sub3 {

	@OriginalMember(owner = "client!gd", name = "ib", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!gd", name = "jb", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!gd", name = "rb", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!gd", name = "Jb", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!gd", name = "Kb", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!gd", name = "ob", descriptor = "I")
	public int anInt1308 = -1;

	@OriginalMember(owner = "client!gd", name = "xb", descriptor = "I")
	public int anInt1312 = -1;

	@OriginalMember(owner = "client!gd", name = "Cb", descriptor = "I")
	public int anInt1317 = 99;

	@OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
	public int anInt1310 = -1;

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
	public int anInt1302 = 2;

	@OriginalMember(owner = "client!gd", name = "Ab", descriptor = "I")
	public int anInt1315 = 5;

	@OriginalMember(owner = "client!gd", name = "Mb", descriptor = "I")
	public int anInt1324 = -1;

	@OriginalMember(owner = "client!gd", name = "Ob", descriptor = "I")
	public int anInt1325 = -1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!df;IIILclient!gd;)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method921(@OriginalArg(0) Class6_Sub3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub3_Sub7 arg3) {
		@Pc(8) int local8 = this.anIntArray152[arg1];
		@Pc(14) Class6_Sub3_Sub11 local14 = Static87.method1565(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg3.method930(arg2, arg0);
		}
		@Pc(31) int local31 = arg3.anIntArray152[arg2];
		@Pc(37) Class6_Sub3_Sub11 local37 = Static87.method1565(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(56) Class6_Sub3_Sub1_Sub3 local56;
		if (local37 == null) {
			local56 = arg0.method626(!local14.method1161(local18));
			local56.method621(local14, local18);
			return local56;
		} else {
			local56 = arg0.method626(!local14.method1161(local18) & !local37.method1161(local41));
			local56.method639(local14, local18, local37, local41, this.anIntArray150);
			return local56;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!bf;I)V")
	private void method923(@OriginalArg(1) Class6_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(43) int local43;
		if (arg1 == 1) {
			local14 = arg0.method1321();
			this.anIntArray149 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray149[local20] = arg0.method1306();
			}
			this.anIntArray152 = new int[local14];
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray152[local43] = arg0.method1306();
			}
			for (@Pc(62) int local62 = 0; local62 < local14; local62++) {
				this.anIntArray152[local62] = (arg0.method1306() << 16) + this.anIntArray152[local62];
			}
		} else if (arg1 == 2) {
			this.anInt1310 = arg0.method1306();
		} else if (arg1 == 3) {
			local14 = arg0.method1321();
			this.anIntArray150 = new int[local14 + 1];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray150[local20] = arg0.method1321();
			}
			this.anIntArray150[local14] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean62 = true;
		} else if (arg1 == 5) {
			this.anInt1315 = arg0.method1321();
		} else if (arg1 == 6) {
			this.anInt1324 = arg0.method1306();
		} else if (arg1 == 7) {
			this.anInt1308 = arg0.method1306();
		} else if (arg1 == 8) {
			this.anInt1317 = arg0.method1321();
		} else if (arg1 == 9) {
			this.anInt1325 = arg0.method1321();
		} else if (arg1 == 10) {
			this.anInt1312 = arg0.method1321();
		} else if (arg1 == 11) {
			this.anInt1302 = arg0.method1321();
		} else if (arg1 == 12) {
			local14 = arg0.method1321();
			this.anIntArray153 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray153[local20] = arg0.method1306();
			}
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray153[local43] += arg0.method1306() << 16;
			}
		} else if (arg1 == 13) {
			local14 = arg0.method1321();
			this.anIntArray151 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray151[local20] = arg0.method1290();
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
	public void method924() {
		if (this.anInt1325 == -1) {
			if (this.anIntArray150 == null) {
				this.anInt1325 = 0;
			} else {
				this.anInt1325 = 2;
			}
		}
		if (this.anInt1312 != -1) {
			return;
		}
		if (this.anIntArray150 == null) {
			this.anInt1312 = 0;
		} else {
			this.anInt1312 = 2;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!df;III)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method928(@OriginalArg(0) Class6_Sub3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray152[arg2];
		@Pc(16) Class6_Sub3_Sub11 local16 = Static87.method1565(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg0.method626(true);
		}
		@Pc(30) int local30 = arg1 & 0x3;
		@Pc(41) Class6_Sub3_Sub1_Sub3 local41 = arg0.method626(!local16.method1161(local20));
		if (local30 == 1) {
			local41.method620();
		} else if (local30 == 2) {
			local41.method635();
		} else if (local30 == 3) {
			local41.method640();
		}
		local41.method621(local16, local20);
		if (local30 == 1) {
			local41.method640();
		} else if (local30 == 2) {
			local41.method635();
		} else if (local30 == 3) {
			local41.method620();
		}
		return local41;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!df;I)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method930(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub3_Sub1_Sub3 arg1) {
		@Pc(4) int local4 = this.anIntArray152[arg0];
		@Pc(19) Class6_Sub3_Sub11 local19 = Static87.method1565(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg1.method626(true);
		} else {
			@Pc(40) Class6_Sub3_Sub1_Sub3 local40 = arg1.method626(!local19.method1161(local23));
			local40.method621(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!df;)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method931(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub3_Sub1_Sub3 arg1) {
		@Pc(8) int local8 = this.anIntArray152[arg0];
		@Pc(14) Class6_Sub3_Sub11 local14 = Static87.method1565(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method626(true);
		}
		@Pc(35) int local35 = 0;
		@Pc(37) Class6_Sub3_Sub11 local37 = null;
		if (this.anIntArray153 != null && this.anIntArray153.length > arg0) {
			local35 = this.anIntArray153[arg0];
			local37 = Static87.method1565(local35 >> 16);
			local35 &= 0xFFFF;
		}
		@Pc(82) Class6_Sub3_Sub1_Sub3 local82;
		if (local37 == null || local35 == 65535) {
			local82 = arg1.method626(!local14.method1161(local18));
			local82.method621(local14, local18);
			return local82;
		} else {
			local82 = arg1.method626(!local14.method1161(local18) & !local37.method1161(local35));
			local82.method621(local14, local18);
			local82.method621(local37, local35);
			return local82;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(ILclient!df;I)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method933(@OriginalArg(1) Class6_Sub3_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray152[arg1];
		@Pc(10) Class6_Sub3_Sub11 local10 = Static87.method1565(local4 >> 1272007632);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method629(true);
		} else {
			@Pc(37) Class6_Sub3_Sub1_Sub3 local37 = arg0.method629(!local10.method1161(local14));
			local37.method621(local10, local14);
			return local37;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!bf;)V")
	public void method934(@OriginalArg(1) Class6_Sub4 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method1321();
			if (local18 == 0) {
				return;
			}
			this.method923(arg0, local18);
		}
	}
}
