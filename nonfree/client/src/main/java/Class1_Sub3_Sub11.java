import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!nc", name = "fb", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!nc", name = "kb", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!nc", name = "qb", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
	public int anInt2034 = -1;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	public int anInt2033 = -1;

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
	public int anInt2039 = -1;

	@OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
	public int anInt2043 = 2;

	@OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
	public int anInt2045 = -1;

	@OriginalMember(owner = "client!nc", name = "bb", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!nc", name = "rb", descriptor = "I")
	public int anInt2051 = -1;

	@OriginalMember(owner = "client!nc", name = "pb", descriptor = "I")
	public int anInt2050 = 99;

	@OriginalMember(owner = "client!nc", name = "wb", descriptor = "I")
	public int anInt2052 = 5;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!eb;IB)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method1429(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub4_Sub4 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anIntArray315[arg0];
		@Pc(16) Class1_Sub3_Sub8 local16 = Static38.method695(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg1.method652(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(46) Class1_Sub3_Sub4_Sub4 local46 = arg1.method652(!local16.method826(local20));
		if (local30 == 1) {
			local46.method650();
		} else if (local30 == 2) {
			local46.method641();
		} else if (local30 == 3) {
			local46.method632();
		}
		local46.method646(local16, local20);
		if (local30 == 1) {
			local46.method632();
		} else if (local30 == 2) {
			local46.method641();
		} else if (local30 == 3) {
			local46.method650();
		}
		return local46;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!eb;I)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method1430(@OriginalArg(1) Class1_Sub3_Sub4_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray315[arg1];
		@Pc(14) Class1_Sub3_Sub8 local14 = Static38.method695(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method652(true);
		} else {
			@Pc(40) Class1_Sub3_Sub4_Sub4 local40 = arg0.method652(!local14.method826(local18));
			local40.method646(local14, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!nc;Lclient!eb;III)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method1434(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) Class1_Sub3_Sub4_Sub4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray315[arg3];
		@Pc(14) Class1_Sub3_Sub8 local14 = Static38.method695(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1430(arg1, arg2);
		}
		@Pc(31) int local31 = arg0.anIntArray315[arg2];
		@Pc(43) Class1_Sub3_Sub8 local43 = Static38.method695(local31 >> 16);
		@Pc(47) int local47 = local31 & 0xFFFF;
		@Pc(60) Class1_Sub3_Sub4_Sub4 local60;
		if (local43 == null) {
			local60 = arg1.method652(!local14.method826(local18));
			local60.method646(local14, local18);
			return local60;
		} else {
			local60 = arg1.method652(!local14.method826(local18) & !local43.method826(local47));
			local60.method642(local14, local18, local43, local47, this.anIntArray319);
			return local60;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!eb;)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method1437(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub4_Sub4 arg1) {
		@Pc(4) int local4 = this.anIntArray315[arg0];
		@Pc(14) Class1_Sub3_Sub8 local14 = Static38.method695(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method639(true);
		} else {
			@Pc(40) Class1_Sub3_Sub4_Sub4 local40 = arg1.method639(!local14.method826(local23));
			local40.method646(local14, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public void method1438() {
		if (this.anInt2033 == -1) {
			if (this.anIntArray319 == null) {
				this.anInt2033 = 0;
			} else {
				this.anInt2033 = 2;
			}
		}
		if (this.anInt2039 != -1) {
			return;
		}
		if (this.anIntArray319 == null) {
			this.anInt2039 = 0;
		} else {
			this.anInt2039 = 2;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!eb;II)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method1439(@OriginalArg(0) Class1_Sub3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray315[arg1];
		@Pc(14) Class1_Sub3_Sub8 local14 = Static38.method695(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method652(true);
		}
		@Pc(26) Class1_Sub3_Sub8 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray317 != null && arg1 < this.anIntArray317.length) {
			local28 = this.anIntArray317[arg1];
			local26 = Static38.method695(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(71) Class1_Sub3_Sub4_Sub4 local71;
		if (local26 == null || local28 == 65535) {
			local71 = arg0.method652(!local14.method826(local18));
			local71.method646(local14, local18);
			return local71;
		} else {
			local71 = arg0.method652(!local14.method826(local18) & !local26.method826(local28));
			local71.method646(local14, local18);
			local71.method646(local26, local28);
			return local71;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!rd;Z)V")
	public void method1440(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2053();
			if (local13 == 0) {
				return;
			}
			this.method1441(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!rd;II)V")
	private void method1441(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(43) int local43;
		if (arg1 == 1) {
			local14 = arg0.method2087();
			this.anIntArray318 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray318[local20] = arg0.method2087();
			}
			this.anIntArray315 = new int[local14];
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray315[local43] = arg0.method2087();
			}
			for (@Pc(58) int local58 = 0; local58 < local14; local58++) {
				this.anIntArray315[local58] = (arg0.method2087() << 16) + this.anIntArray315[local58];
			}
		} else if (arg1 == 2) {
			this.anInt2051 = arg0.method2087();
		} else if (arg1 == 3) {
			local14 = arg0.method2053();
			this.anIntArray319 = new int[local14 + 1];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray319[local20] = arg0.method2053();
			}
			this.anIntArray319[local14] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean68 = true;
		} else if (arg1 == 5) {
			this.anInt2052 = arg0.method2053();
		} else if (arg1 == 6) {
			this.anInt2034 = arg0.method2087();
		} else if (arg1 == 7) {
			this.anInt2045 = arg0.method2087();
		} else if (arg1 == 8) {
			this.anInt2050 = arg0.method2053();
		} else if (arg1 == 9) {
			this.anInt2033 = arg0.method2053();
		} else if (arg1 == 10) {
			this.anInt2039 = arg0.method2053();
		} else if (arg1 == 11) {
			this.anInt2043 = arg0.method2053();
		} else if (arg1 == 12) {
			local14 = arg0.method2053();
			this.anIntArray317 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray317[local20] = arg0.method2087();
			}
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray317[local43] = (arg0.method2087() << 16) + this.anIntArray317[local43];
			}
		} else if (arg1 == 13) {
			local14 = arg0.method2053();
			this.anIntArray316 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray316[local20] = arg0.method2075();
			}
		}
	}
}
