import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class4_Sub3_Sub10 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!ne", name = "mb", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
	public int anInt1862 = -1;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
	public int anInt1868 = -1;

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
	public int anInt1871 = 2;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
	public int anInt1873 = -1;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
	public int anInt1867 = 5;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
	public int anInt1872 = -1;

	@OriginalMember(owner = "client!ne", name = "nb", descriptor = "I")
	public int anInt1879 = 99;

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!ne", name = "ob", descriptor = "I")
	public int anInt1880 = -1;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!tf;II)V")
	private void method1257(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(85) int local85;
		@Pc(91) int local91;
		@Pc(106) int local106;
		if (arg1 == 1) {
			local85 = arg0.method816();
			this.anIntArray218 = new int[local85];
			for (local91 = 0; local91 < local85; local91++) {
				this.anIntArray218[local91] = arg0.method816();
			}
			this.anIntArray216 = new int[local85];
			for (local106 = 0; local106 < local85; local106++) {
				this.anIntArray216[local106] = arg0.method816();
			}
			for (@Pc(270) int local270 = 0; local270 < local85; local270++) {
				this.anIntArray216[local270] += arg0.method816() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt1873 = arg0.method816();
		} else if (arg1 == 3) {
			local85 = arg0.method773();
			this.anIntArray215 = new int[local85 + 1];
			for (local91 = 0; local91 < local85; local91++) {
				this.anIntArray215[local91] = arg0.method773();
			}
			this.anIntArray215[local85] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean66 = true;
		} else if (arg1 == 5) {
			this.anInt1867 = arg0.method773();
		} else if (arg1 == 6) {
			this.anInt1880 = arg0.method816();
		} else if (arg1 == 7) {
			this.anInt1862 = arg0.method816();
		} else if (arg1 == 8) {
			this.anInt1879 = arg0.method773();
		} else if (arg1 == 9) {
			this.anInt1868 = arg0.method773();
		} else if (arg1 == 10) {
			this.anInt1872 = arg0.method773();
		} else if (arg1 == 11) {
			this.anInt1871 = arg0.method773();
		} else if (arg1 == 12) {
			local85 = arg0.method773();
			this.anIntArray214 = new int[local85];
			for (local91 = 0; local91 < local85; local91++) {
				this.anIntArray214[local91] = arg0.method816();
			}
			for (local106 = 0; local106 < local85; local106++) {
				this.anIntArray214[local106] = (arg0.method816() << 16) + this.anIntArray214[local106];
			}
			return;
		} else if (arg1 == 13) {
			local85 = arg0.method773();
			this.anIntArray213 = new int[local85];
			for (local91 = 0; local91 < local85; local91++) {
				this.anIntArray213[local91] = arg0.method806();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!qb;)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1258(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub3_Sub1_Sub7 arg1) {
		@Pc(8) int local8 = this.anIntArray216[arg0];
		@Pc(14) Class4_Sub3_Sub15 local14 = Static87.method1398(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1500(true);
		}
		@Pc(26) Class4_Sub3_Sub15 local26 = null;
		@Pc(33) int local33 = 0;
		if (this.anIntArray214 != null && this.anIntArray214.length > arg0) {
			local33 = this.anIntArray214[arg0];
			local26 = Static87.method1398(local33 >> 16);
			local33 &= 0xFFFF;
		}
		@Pc(76) Class4_Sub3_Sub1_Sub7 local76;
		if (local26 == null || local33 == 65535) {
			local76 = arg1.method1500(!local14.method1919(local18));
			local76.method1508(local14, local18);
			return local76;
		} else {
			local76 = arg1.method1500(!local14.method1919(local18) & !local26.method1919(local33));
			local76.method1508(local14, local18);
			local76.method1508(local26, local33);
			return local76;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!qb;)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1259(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub3_Sub1_Sub7 arg1) {
		@Pc(4) int local4 = this.anIntArray216[arg0];
		@Pc(14) Class4_Sub3_Sub15 local14 = Static87.method1398(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1500(true);
		} else {
			@Pc(40) Class4_Sub3_Sub1_Sub7 local40 = arg1.method1500(!local14.method1919(local18));
			local40.method1508(local14, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!qb;I)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1260(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3_Sub1_Sub7 arg1) {
		@Pc(8) int local8 = this.anIntArray216[arg0];
		@Pc(14) Class4_Sub3_Sub15 local14 = Static87.method1398(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1503(true);
		} else {
			@Pc(35) Class4_Sub3_Sub1_Sub7 local35 = arg1.method1503(!local14.method1919(local18));
			local35.method1508(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!qb;I)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1261(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub3_Sub1_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray216[arg2];
		@Pc(16) Class4_Sub3_Sub15 local16 = Static87.method1398(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1500(true);
		}
		@Pc(30) int local30 = arg0 & 0x3;
		@Pc(41) Class4_Sub3_Sub1_Sub7 local41 = arg1.method1500(!local16.method1919(local20));
		if (local30 == 1) {
			local41.method1496();
		} else if (local30 == 2) {
			local41.method1490();
		} else if (local30 == 3) {
			local41.method1507();
		}
		local41.method1508(local16, local20);
		if (local30 == 1) {
			local41.method1507();
		} else if (local30 == 2) {
			local41.method1490();
		} else if (local30 == 3) {
			local41.method1496();
		}
		return local41;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!ne;IILclient!qb;)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1262(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub3_Sub1_Sub7 arg3) {
		@Pc(8) int local8 = this.anIntArray216[arg0];
		@Pc(14) Class4_Sub3_Sub15 local14 = Static87.method1398(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1259(arg2, arg3);
		}
		@Pc(31) int local31 = arg1.anIntArray216[arg2];
		@Pc(37) Class4_Sub3_Sub15 local37 = Static87.method1398(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class4_Sub3_Sub1_Sub7 local54;
		if (local37 == null) {
			local54 = arg3.method1500(!local14.method1919(local18));
			local54.method1508(local14, local18);
			return local54;
		} else {
			local54 = arg3.method1500(!local14.method1919(local18) & !local37.method1919(local41));
			local54.method1510(local14, local18, local37, local41, this.anIntArray215);
			return local54;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!tf;I)V")
	public void method1265(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method773();
			if (local9 == 0) {
				return;
			}
			this.method1257(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
	public void method1266() {
		if (this.anInt1868 == -1) {
			if (this.anIntArray215 == null) {
				this.anInt1868 = 0;
			} else {
				this.anInt1868 = 2;
			}
		}
		if (this.anInt1872 != -1) {
			return;
		}
		if (this.anIntArray215 == null) {
			this.anInt1872 = 0;
		} else {
			this.anInt1872 = 2;
		}
	}
}
