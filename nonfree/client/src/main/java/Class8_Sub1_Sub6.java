import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class8_Sub1_Sub6 extends Class8_Sub1 {

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "[I")
	public int[] anIntArray78;

	@OriginalMember(owner = "client!dc", name = "kb", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!dc", name = "zb", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
	public int anInt707 = -1;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
	public int anInt708 = -1;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
	public int anInt704 = 99;

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
	public int anInt711 = 2;

	@OriginalMember(owner = "client!dc", name = "sb", descriptor = "I")
	public int anInt718 = -1;

	@OriginalMember(owner = "client!dc", name = "xb", descriptor = "I")
	public int anInt723 = 5;

	@OriginalMember(owner = "client!dc", name = "yb", descriptor = "I")
	public int anInt724 = -1;

	@OriginalMember(owner = "client!dc", name = "tb", descriptor = "I")
	public int anInt719 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!nb;)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method416(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub1_Sub6 arg1) {
		@Pc(8) int local8 = this.anIntArray79[arg0];
		@Pc(20) Class8_Sub1_Sub11 local20 = Static84.method1244(local8 >> 16);
		@Pc(24) int local24 = local8 & 0xFFFF;
		if (local20 == null) {
			return arg1.method1273(true);
		} else {
			@Pc(41) Class8_Sub1_Sub1_Sub6 local41 = arg1.method1273(!local20.method768(local24));
			local41.method1283(local20, local24);
			return local41;
		}
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	public void method417() {
		if (this.anInt708 == -1) {
			if (this.anIntArray77 == null) {
				this.anInt708 = 0;
			} else {
				this.anInt708 = 2;
			}
		}
		if (this.anInt718 != -1) {
			return;
		}
		if (this.anIntArray77 == null) {
			this.anInt718 = 0;
		} else {
			this.anInt718 = 2;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!nb;IBI)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method418(@OriginalArg(0) Class8_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray79[arg1];
		@Pc(20) Class8_Sub1_Sub11 local20 = Static84.method1244(local6 >> 16);
		@Pc(28) int local28 = local6 & 0xFFFF;
		if (local20 == null) {
			return arg0.method1274(true);
		}
		@Pc(45) Class8_Sub1_Sub1_Sub6 local45 = arg0.method1274(!local20.method768(local28));
		@Pc(49) int local49 = arg2 & 0x3;
		if (local49 == 1) {
			local45.method1287();
		} else if (local49 == 2) {
			local45.method1278();
		} else if (local49 == 3) {
			local45.method1281();
		}
		local45.method1283(local20, local28);
		if (local49 == 1) {
			local45.method1281();
		} else if (local49 == 2) {
			local45.method1278();
		} else if (local49 == 3) {
			local45.method1287();
		}
		return local45;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method419(@OriginalArg(0) Class8_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1872();
			if (local9 == 0) {
				return;
			}
			this.method426(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!nb;B)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method421(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub1_Sub6 arg1) {
		@Pc(4) int local4 = this.anIntArray79[arg0];
		@Pc(14) Class8_Sub1_Sub11 local14 = Static84.method1244(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1274(true);
		} else {
			@Pc(35) Class8_Sub1_Sub1_Sub6 local35 = arg1.method1274(!local14.method768(local18));
			local35.method1283(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!nb;II)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method422(@OriginalArg(0) Class8_Sub1_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray79[arg1];
		@Pc(14) Class8_Sub1_Sub11 local14 = Static84.method1244(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1274(true);
		}
		@Pc(26) Class8_Sub1_Sub11 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray80 != null && this.anIntArray80.length > arg1) {
			local28 = this.anIntArray80[arg1];
			local26 = Static84.method1244(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(73) Class8_Sub1_Sub1_Sub6 local73;
		if (local26 == null || local28 == 65535) {
			local73 = arg0.method1274(!local14.method768(local18));
			local73.method1283(local14, local18);
			return local73;
		} else {
			local73 = arg0.method1274(!local14.method768(local18) & !local26.method768(local28));
			local73.method1283(local14, local18);
			local73.method1283(local26, local28);
			return local73;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!dc;ZILclient!nb;)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method425(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8_Sub1_Sub1_Sub6 arg3) {
		@Pc(4) int local4 = this.anIntArray79[arg2];
		@Pc(10) Class8_Sub1_Sub11 local10 = Static84.method1244(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method421(arg0, arg3);
		}
		@Pc(39) int local39 = arg1.anIntArray79[arg0];
		@Pc(45) Class8_Sub1_Sub11 local45 = Static84.method1244(local39 >> 16);
		@Pc(49) int local49 = local39 & 0xFFFF;
		@Pc(62) Class8_Sub1_Sub1_Sub6 local62;
		if (local45 == null) {
			local62 = arg3.method1274(!local10.method768(local14));
			local62.method1283(local10, local14);
			return local62;
		} else {
			local62 = arg3.method1274(!local10.method768(local14) & !local45.method768(local49));
			local62.method1270(local10, local14, local45, local49, this.anIntArray77);
			return local62;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!wd;I)V")
	private void method426(@OriginalArg(1) Class8_Sub20 arg0, @OriginalArg(2) int arg1) {
		@Pc(26) int local26;
		@Pc(34) int local34;
		@Pc(133) int local133;
		if (arg1 == 1) {
			local26 = arg0.method1839();
			this.anIntArray76 = new int[local26];
			for (local34 = 0; local34 < local26; local34++) {
				this.anIntArray76[local34] = arg0.method1839();
			}
			this.anIntArray79 = new int[local26];
			for (local133 = 0; local133 < local26; local133++) {
				this.anIntArray79[local133] = arg0.method1839();
			}
			for (@Pc(264) int local264 = 0; local264 < local26; local264++) {
				this.anIntArray79[local264] += arg0.method1839() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt724 = arg0.method1839();
		} else if (arg1 == 3) {
			local26 = arg0.method1872();
			this.anIntArray77 = new int[local26 + 1];
			for (local34 = 0; local34 < local26; local34++) {
				this.anIntArray77[local34] = arg0.method1872();
			}
			this.anIntArray77[local26] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean33 = true;
		} else if (arg1 == 5) {
			this.anInt723 = arg0.method1872();
		} else if (arg1 == 6) {
			this.anInt707 = arg0.method1839();
		} else if (arg1 == 7) {
			this.anInt719 = arg0.method1839();
		} else if (arg1 == 8) {
			this.anInt704 = arg0.method1872();
		} else if (arg1 == 9) {
			this.anInt718 = arg0.method1872();
		} else if (arg1 == 10) {
			this.anInt708 = arg0.method1872();
		} else if (arg1 == 11) {
			this.anInt711 = arg0.method1872();
			return;
		} else if (arg1 == 12) {
			local26 = arg0.method1872();
			this.anIntArray80 = new int[local26];
			for (local34 = 0; local34 < local26; local34++) {
				this.anIntArray80[local34] = arg0.method1839();
			}
			for (local133 = 0; local133 < local26; local133++) {
				this.anIntArray80[local133] = (arg0.method1839() << 16) + this.anIntArray80[local133];
			}
			return;
		} else if (arg1 == 13) {
			local26 = arg0.method1872();
			this.anIntArray78 = new int[local26];
			for (local34 = 0; local34 < local26; local34++) {
				this.anIntArray78[local34] = arg0.method1885();
			}
			return;
		}
	}
}
