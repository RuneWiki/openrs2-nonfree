import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class4_Sub4_Sub14 extends Class4_Sub4 {

	@OriginalMember(owner = "client!t", name = "S", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!t", name = "T", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!t", name = "eb", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!t", name = "hb", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!t", name = "K", descriptor = "I")
	public int anInt2710 = -1;

	@OriginalMember(owner = "client!t", name = "R", descriptor = "I")
	public int anInt2715 = 2;

	@OriginalMember(owner = "client!t", name = "O", descriptor = "I")
	public int anInt2713 = -1;

	@OriginalMember(owner = "client!t", name = "U", descriptor = "I")
	public int anInt2716 = 99;

	@OriginalMember(owner = "client!t", name = "W", descriptor = "I")
	public int anInt2718 = -1;

	@OriginalMember(owner = "client!t", name = "J", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
	public int anInt2724 = 5;

	@OriginalMember(owner = "client!t", name = "db", descriptor = "I")
	public int anInt2722 = -1;

	@OriginalMember(owner = "client!t", name = "I", descriptor = "I")
	public int anInt2709 = -1;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!rb;ZILclient!t;)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1915(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub1_Sub6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub4_Sub14 arg3) {
		@Pc(4) int local4 = this.anIntArray295[arg0];
		@Pc(10) Class4_Sub4_Sub10 local10 = Static3.method13(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg3.method1917(arg1, arg2);
		}
		@Pc(31) int local31 = arg3.anIntArray295[arg2];
		@Pc(37) Class4_Sub4_Sub10 local37 = Static3.method13(local31 >> 16);
		@Pc(47) int local47 = local31 & 0xFFFF;
		@Pc(60) Class4_Sub4_Sub1_Sub6 local60;
		if (local37 == null) {
			local60 = arg1.method1798(!local10.method1380(local18));
			local60.method1804(local10, local18);
			return local60;
		} else {
			local60 = arg1.method1798(!local10.method1380(local18) & !local37.method1380(local47));
			local60.method1784(local10, local18, local37, local47, this.anIntArray293);
			return local60;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!rb;I)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1916(@OriginalArg(1) Class4_Sub4_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray295[arg1];
		@Pc(19) Class4_Sub4_Sub10 local19 = Static3.method13(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1791(true);
		} else {
			@Pc(40) Class4_Sub4_Sub1_Sub6 local40 = arg0.method1791(!local19.method1380(local23));
			local40.method1804(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!rb;II)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1917(@OriginalArg(0) Class4_Sub4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray295[arg1];
		@Pc(14) Class4_Sub4_Sub10 local14 = Static3.method13(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1798(true);
		} else {
			@Pc(41) Class4_Sub4_Sub1_Sub6 local41 = arg0.method1798(!local14.method1380(local18));
			local41.method1804(local14, local18);
			return local41;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!rb;B)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1918(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub1_Sub6 arg1) {
		@Pc(8) int local8 = this.anIntArray295[arg0];
		@Pc(14) Class4_Sub4_Sub10 local14 = Static3.method13(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1798(true);
		}
		@Pc(32) int local32 = 0;
		@Pc(34) Class4_Sub4_Sub10 local34 = null;
		if (this.anIntArray296 != null && this.anIntArray296.length > arg0) {
			local32 = this.anIntArray296[arg0];
			local34 = Static3.method13(local32 >> 16);
			local32 &= 0xFFFF;
		}
		@Pc(79) Class4_Sub4_Sub1_Sub6 local79;
		if (local34 == null || local32 == 65535) {
			local79 = arg1.method1798(!local14.method1380(local18));
			local79.method1804(local14, local18);
			return local79;
		} else {
			local79 = arg1.method1798(!local14.method1380(local18) & !local34.method1380(local32));
			local79.method1804(local14, local18);
			local79.method1804(local34, local32);
			return local79;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public void method1921() {
		if (this.anInt2709 == -1) {
			if (this.anIntArray293 == null) {
				this.anInt2709 = 0;
			} else {
				this.anInt2709 = 2;
			}
		}
		if (this.anInt2722 != -1) {
			return;
		}
		if (this.anIntArray293 == null) {
			this.anInt2722 = 0;
		} else {
			this.anInt2722 = 2;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BILclient!re;)V")
	private void method1922(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		@Pc(15) int local15;
		@Pc(21) int local21;
		@Pc(40) int local40;
		if (arg0 == 1) {
			local15 = arg1.method1244();
			this.anIntArray294 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray294[local21] = arg1.method1244();
			}
			this.anIntArray295 = new int[local15];
			for (local40 = 0; local40 < local15; local40++) {
				this.anIntArray295[local40] = arg1.method1244();
			}
			for (@Pc(55) int local55 = 0; local55 < local15; local55++) {
				this.anIntArray295[local55] = (arg1.method1244() << 16) + this.anIntArray295[local55];
			}
		} else if (arg0 == 2) {
			this.anInt2710 = arg1.method1244();
		} else if (arg0 == 3) {
			local15 = arg1.method1223();
			this.anIntArray293 = new int[local15 + 1];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray293[local21] = arg1.method1223();
			}
			this.anIntArray293[local15] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean116 = true;
		} else if (arg0 == 5) {
			this.anInt2724 = arg1.method1223();
		} else if (arg0 == 6) {
			this.anInt2713 = arg1.method1244();
		} else if (arg0 == 7) {
			this.anInt2718 = arg1.method1244();
		} else if (arg0 == 8) {
			this.anInt2716 = arg1.method1223();
		} else if (arg0 == 9) {
			this.anInt2709 = arg1.method1223();
		} else if (arg0 == 10) {
			this.anInt2722 = arg1.method1223();
		} else if (arg0 == 11) {
			this.anInt2715 = arg1.method1223();
		} else if (arg0 == 12) {
			local15 = arg1.method1223();
			this.anIntArray296 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray296[local21] = arg1.method1244();
			}
			for (local40 = 0; local40 < local15; local40++) {
				this.anIntArray296[local40] = (arg1.method1244() << 16) + this.anIntArray296[local40];
			}
		} else if (arg0 == 13) {
			local15 = arg1.method1223();
			this.anIntArray297 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray297[local21] = arg1.method1241();
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLclient!re;)V")
	public void method1923(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1223();
			if (local5 == 0) {
				return;
			}
			this.method1922(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!rb;IIB)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1924(@OriginalArg(0) Class4_Sub4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anIntArray295[arg1];
		@Pc(16) Class4_Sub4_Sub10 local16 = Static3.method13(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg0.method1798(true);
		}
		@Pc(48) Class4_Sub4_Sub1_Sub6 local48 = arg0.method1798(!local16.method1380(local20));
		@Pc(52) int local52 = arg2 & 0x3;
		if (local52 == 1) {
			local48.method1785();
		} else if (local52 == 2) {
			local48.method1789();
		} else if (local52 == 3) {
			local48.method1786();
		}
		local48.method1804(local16, local20);
		if (local52 == 1) {
			local48.method1786();
		} else if (local52 == 2) {
			local48.method1789();
		} else if (local52 == 3) {
			local48.method1785();
		}
		return local48;
	}
}
