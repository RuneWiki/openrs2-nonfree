import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class5_Sub2_Sub17 extends Class5_Sub2 {

	@OriginalMember(owner = "client!w", name = "cb", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!w", name = "ib", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!w", name = "kb", descriptor = "[I")
	public int[] anIntArray391;

	@OriginalMember(owner = "client!w", name = "rb", descriptor = "[I")
	private int[] anIntArray395;

	@OriginalMember(owner = "client!w", name = "yb", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "I")
	public int anInt3228 = -1;

	@OriginalMember(owner = "client!w", name = "U", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!w", name = "T", descriptor = "I")
	public int anInt3232 = -1;

	@OriginalMember(owner = "client!w", name = "mb", descriptor = "I")
	public int anInt3243 = 2;

	@OriginalMember(owner = "client!w", name = "jb", descriptor = "I")
	public int anInt3242 = 99;

	@OriginalMember(owner = "client!w", name = "S", descriptor = "I")
	public int anInt3231 = -1;

	@OriginalMember(owner = "client!w", name = "sb", descriptor = "I")
	public int anInt3246 = 5;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "I")
	public int anInt3226 = -1;

	@OriginalMember(owner = "client!w", name = "Eb", descriptor = "I")
	public int anInt3253 = -1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILclient!wb;)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method2058(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub2_Sub2_Sub6 arg1) {
		@Pc(8) int local8 = this.anIntArray391[arg0];
		@Pc(20) Class5_Sub2_Sub10 local20 = Static72.method1289(local8 >> 16);
		@Pc(24) int local24 = local8 & 0xFFFF;
		if (local20 == null) {
			return arg1.method2152(true);
		} else {
			@Pc(41) Class5_Sub2_Sub2_Sub6 local41 = arg1.method2152(!local20.method1100(local24));
			local41.method2147(local20, local24);
			return local41;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!wb;IB)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method2059(@OriginalArg(0) Class5_Sub2_Sub2_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray391[arg1];
		@Pc(14) Class5_Sub2_Sub10 local14 = Static72.method1289(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2156(true);
		}
		@Pc(32) Class5_Sub2_Sub10 local32 = null;
		@Pc(34) int local34 = 0;
		if (this.anIntArray389 != null && arg1 < this.anIntArray389.length) {
			local34 = this.anIntArray389[arg1];
			local32 = Static72.method1289(local34 >> 16);
			local34 &= 0xFFFF;
		}
		@Pc(77) Class5_Sub2_Sub2_Sub6 local77;
		if (local32 == null || local34 == 65535) {
			local77 = arg0.method2156(!local14.method1100(local18));
			local77.method2147(local14, local18);
			return local77;
		} else {
			local77 = arg0.method2156(!local14.method1100(local18) & !local32.method1100(local34));
			local77.method2147(local14, local18);
			local77.method2147(local32, local34);
			return local77;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!wb;II)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method2061(@OriginalArg(0) Class5_Sub2_Sub2_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray391[arg1];
		@Pc(19) Class5_Sub2_Sub10 local19 = Static72.method1289(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg0.method2156(true);
		} else {
			@Pc(42) Class5_Sub2_Sub2_Sub6 local42 = arg0.method2156(!local19.method1100(local23));
			local42.method2147(local19, local23);
			return local42;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!wb;III)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method2062(@OriginalArg(0) Class5_Sub2_Sub2_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = this.anIntArray391[arg1];
		@Pc(16) Class5_Sub2_Sub10 local16 = Static72.method1289(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg0.method2156(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(41) Class5_Sub2_Sub2_Sub6 local41 = arg0.method2156(!local16.method1100(local20));
		if (local30 == 1) {
			local41.method2157();
		} else if (local30 == 2) {
			local41.method2145();
		} else if (local30 == 3) {
			local41.method2140();
		}
		local41.method2147(local16, local20);
		if (local30 == 1) {
			local41.method2140();
		} else if (local30 == 2) {
			local41.method2145();
		} else if (local30 == 3) {
			local41.method2157();
		}
		return local41;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!pa;II)V")
	private void method2063(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(166) int local166;
		if (arg1 == 1) {
			local14 = arg0.method1478();
			this.anIntArray396 = new int[local14];
			for (local22 = 0; local22 < local14; local22++) {
				this.anIntArray396[local22] = arg0.method1478();
			}
			this.anIntArray391 = new int[local14];
			for (local166 = 0; local166 < local14; local166++) {
				this.anIntArray391[local166] = arg0.method1478();
			}
			for (@Pc(276) int local276 = 0; local276 < local14; local276++) {
				this.anIntArray391[local276] += arg0.method1478() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3228 = arg0.method1478();
		} else if (arg1 == 3) {
			local14 = arg0.method1471();
			this.anIntArray395 = new int[local14 + 1];
			for (local22 = 0; local22 < local14; local22++) {
				this.anIntArray395[local22] = arg0.method1471();
			}
			this.anIntArray395[local14] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean117 = true;
		} else if (arg1 == 5) {
			this.anInt3246 = arg0.method1471();
		} else if (arg1 == 6) {
			this.anInt3231 = arg0.method1478();
		} else if (arg1 == 7) {
			this.anInt3253 = arg0.method1478();
		} else if (arg1 == 8) {
			this.anInt3242 = arg0.method1471();
		} else if (arg1 == 9) {
			this.anInt3232 = arg0.method1471();
		} else if (arg1 == 10) {
			this.anInt3226 = arg0.method1471();
		} else if (arg1 == 11) {
			this.anInt3243 = arg0.method1471();
		} else if (arg1 == 12) {
			local14 = arg0.method1471();
			this.anIntArray389 = new int[local14];
			for (local22 = 0; local22 < local14; local22++) {
				this.anIntArray389[local22] = arg0.method1478();
			}
			for (local166 = 0; local166 < local14; local166++) {
				this.anIntArray389[local166] = (arg0.method1478() << 16) + this.anIntArray389[local166];
			}
		} else if (arg1 == 13) {
			local14 = arg0.method1471();
			this.anIntArray390 = new int[local14];
			for (local22 = 0; local22 < local14; local22++) {
				this.anIntArray390[local22] = arg0.method1439();
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!pa;)V")
	public void method2064(@OriginalArg(1) Class5_Sub14 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1471();
			if (local10 == 0) {
				return;
			}
			this.method2063(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!wb;IIILclient!w;)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method2067(@OriginalArg(0) Class5_Sub2_Sub2_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub2_Sub17 arg3) {
		@Pc(8) int local8 = this.anIntArray391[arg2];
		@Pc(14) Class5_Sub2_Sub10 local14 = Static72.method1289(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg3.method2061(arg0, arg1);
		}
		@Pc(31) int local31 = arg3.anIntArray391[arg1];
		@Pc(37) Class5_Sub2_Sub10 local37 = Static72.method1289(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class5_Sub2_Sub2_Sub6 local54;
		if (local37 == null) {
			local54 = arg0.method2156(!local14.method1100(local18));
			local54.method2147(local14, local18);
			return local54;
		} else {
			local54 = arg0.method2156(!local14.method1100(local18) & !local37.method1100(local41));
			local54.method2143(local14, local18, local37, local41, this.anIntArray395);
			return local54;
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	public void method2068() {
		if (this.anInt3226 == -1) {
			if (this.anIntArray395 == null) {
				this.anInt3226 = 0;
			} else {
				this.anInt3226 = 2;
			}
		}
		if (this.anInt3232 != -1) {
			return;
		}
		if (this.anIntArray395 == null) {
			this.anInt3232 = 0;
		} else {
			this.anInt3232 = 2;
		}
	}
}
