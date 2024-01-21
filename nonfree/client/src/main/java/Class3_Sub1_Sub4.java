import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ed", name = "gb", descriptor = "[I")
	public int[] anIntArray54;

	@OriginalMember(owner = "client!ed", name = "ib", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!ed", name = "lb", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!ed", name = "mb", descriptor = "[I")
	public int[] anIntArray57;

	@OriginalMember(owner = "client!ed", name = "tb", descriptor = "[I")
	public int[] anIntArray58;

	@OriginalMember(owner = "client!ed", name = "Qb", descriptor = "I")
	public int anInt870 = 99;

	@OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
	public int anInt860 = -1;

	@OriginalMember(owner = "client!ed", name = "Ub", descriptor = "I")
	public int anInt871 = -1;

	@OriginalMember(owner = "client!ed", name = "Kb", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ed", name = "Db", descriptor = "I")
	public int anInt866 = -1;

	@OriginalMember(owner = "client!ed", name = "wb", descriptor = "I")
	public int anInt865 = -1;

	@OriginalMember(owner = "client!ed", name = "rb", descriptor = "I")
	public int anInt864 = 2;

	@OriginalMember(owner = "client!ed", name = "oc", descriptor = "I")
	public int anInt878 = 5;

	@OriginalMember(owner = "client!ed", name = "mc", descriptor = "I")
	public int anInt877 = -1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!t;BI)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method590(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray58[arg0];
		@Pc(12) Class3_Sub1_Sub5 local12 = Static38.method692(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local12 == null) {
			return arg1.method1796(true);
		}
		@Pc(35) int local35 = arg2 & 0x3;
		@Pc(48) Class3_Sub1_Sub2_Sub6 local48 = arg1.method1796(!local12.method669(local20));
		if (local35 == 1) {
			local48.method1787();
		} else if (local35 == 2) {
			local48.method1802();
		} else if (local35 == 3) {
			local48.method1784();
		}
		local48.method1799(local12, local20);
		if (local35 == 1) {
			local48.method1784();
		} else if (local35 == 2) {
			local48.method1802();
		} else if (local35 == 3) {
			local48.method1787();
		}
		return local48;
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)V")
	public void method592() {
		if (this.anInt860 == -1) {
			if (this.anIntArray55 == null) {
				this.anInt860 = 0;
			} else {
				this.anInt860 = 2;
			}
		}
		if (this.anInt865 != -1) {
			return;
		}
		if (this.anIntArray55 == null) {
			this.anInt865 = 0;
		} else {
			this.anInt865 = 2;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILclient!t;Lclient!ed;I)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method594(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub2_Sub6 arg1, @OriginalArg(3) Class3_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray58[arg0];
		@Pc(14) Class3_Sub1_Sub5 local14 = Static38.method692(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg2.method597(arg3, arg1);
		}
		@Pc(40) int local40 = arg2.anIntArray58[arg3];
		@Pc(46) Class3_Sub1_Sub5 local46 = Static38.method692(local40 >> 16);
		@Pc(50) int local50 = local40 & 0xFFFF;
		@Pc(63) Class3_Sub1_Sub2_Sub6 local63;
		if (local46 == null) {
			local63 = arg1.method1796(!local14.method669(local18));
			local63.method1799(local14, local18);
			return local63;
		} else {
			local63 = arg1.method1796(!local14.method669(local18) & !local46.method669(local50));
			local63.method1788(local14, local18, local46, local50, this.anIntArray55);
			return local63;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!t;BI)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method595(@OriginalArg(0) Class3_Sub1_Sub2_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray58[arg1];
		@Pc(19) Class3_Sub1_Sub5 local19 = Static38.method692(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1792(true);
		} else {
			@Pc(40) Class3_Sub1_Sub2_Sub6 local40 = arg0.method1792(!local19.method669(local23));
			local40.method1799(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!b;)V")
	public void method596(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method270();
			if (local13 == 0) {
				return;
			}
			this.method598(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!t;I)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method597(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub6 arg1) {
		@Pc(4) int local4 = this.anIntArray58[arg0];
		@Pc(14) Class3_Sub1_Sub5 local14 = Static38.method692(local4 >> 16);
		@Pc(27) int local27 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1796(true);
		} else {
			@Pc(46) Class3_Sub1_Sub2_Sub6 local46 = arg1.method1796(!local14.method669(local27));
			local46.method1799(local14, local27);
			return local46;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!b;IB)V")
	private void method598(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(43) int local43;
		if (arg1 == 1) {
			local18 = arg0.method270();
			this.anIntArray54 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray54[local24] = arg0.method276();
			}
			this.anIntArray58 = new int[local18];
			for (local43 = 0; local43 < local18; local43++) {
				this.anIntArray58[local43] = arg0.method276();
			}
			for (@Pc(58) int local58 = 0; local58 < local18; local58++) {
				this.anIntArray58[local58] = (arg0.method276() << 16) + this.anIntArray58[local58];
			}
		} else if (arg1 == 2) {
			this.anInt871 = arg0.method276();
		} else if (arg1 == 3) {
			local18 = arg0.method270();
			this.anIntArray55 = new int[local18 + 1];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray55[local24] = arg0.method270();
			}
			this.anIntArray55[local18] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean47 = true;
		} else if (arg1 == 5) {
			this.anInt878 = arg0.method270();
		} else if (arg1 == 6) {
			this.anInt866 = arg0.method276();
		} else if (arg1 == 7) {
			this.anInt877 = arg0.method276();
		} else if (arg1 == 8) {
			this.anInt870 = arg0.method270();
		} else if (arg1 == 9) {
			this.anInt860 = arg0.method270();
		} else if (arg1 == 10) {
			this.anInt865 = arg0.method270();
		} else if (arg1 == 11) {
			this.anInt864 = arg0.method270();
			return;
		} else if (arg1 == 12) {
			local18 = arg0.method270();
			this.anIntArray56 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray56[local24] = arg0.method276();
			}
			for (local43 = 0; local43 < local18; local43++) {
				this.anIntArray56[local43] += arg0.method276() << 16;
			}
			return;
		} else if (arg1 == 13) {
			local18 = arg0.method270();
			this.anIntArray57 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray57[local24] = arg0.method264();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!t;Z)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method599(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub6 arg1) {
		@Pc(8) int local8 = this.anIntArray58[arg0];
		@Pc(14) Class3_Sub1_Sub5 local14 = Static38.method692(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1796(true);
		}
		@Pc(31) int local31 = 0;
		@Pc(33) Class3_Sub1_Sub5 local33 = null;
		if (this.anIntArray56 != null && arg0 < this.anIntArray56.length) {
			local31 = this.anIntArray56[arg0];
			local33 = Static38.method692(local31 >> 16);
			local31 &= 0xFFFF;
		}
		@Pc(72) Class3_Sub1_Sub2_Sub6 local72;
		if (local33 == null || local31 == 65535) {
			local72 = arg1.method1796(!local14.method669(local18));
			local72.method1799(local14, local18);
			return local72;
		} else {
			local72 = arg1.method1796(!local14.method669(local18) & !local33.method669(local31));
			local72.method1799(local14, local18);
			local72.method1799(local33, local31);
			return local72;
		}
	}
}
