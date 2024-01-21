import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!qc", name = "ib", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!qc", name = "nb", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
	public int anInt2244 = 99;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	public int anInt2246 = 2;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
	public int anInt2251 = -1;

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
	public int anInt2255 = -1;

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
	public int anInt2253 = -1;

	@OriginalMember(owner = "client!qc", name = "kb", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
	public int anInt2258 = -1;

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
	public int anInt2259 = 5;

	@OriginalMember(owner = "client!qc", name = "qb", descriptor = "I")
	public int anInt2263 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLclient!ua;)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1554(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub4_Sub7 arg1) {
		@Pc(4) int local4 = this.anIntArray306[arg0];
		@Pc(14) Class3_Sub1_Sub6 local14 = Static19.method1700(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1776(true);
		} else {
			@Pc(35) Class3_Sub1_Sub4_Sub7 local35 = arg1.method1776(!local14.method938(local18));
			local35.method1756(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ob;I)V")
	private void method1555(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		@Pc(89) int local89;
		@Pc(95) int local95;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local89 = arg1.method647();
			this.anIntArray305 = new int[local89];
			for (local95 = 0; local95 < local89; local95++) {
				this.anIntArray305[local95] = arg1.method602();
			}
			this.anIntArray306 = new int[local89];
			for (local143 = 0; local143 < local89; local143++) {
				this.anIntArray306[local143] = arg1.method602();
			}
			for (@Pc(284) int local284 = 0; local284 < local89; local284++) {
				this.anIntArray306[local284] += arg1.method602() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt2251 = arg1.method602();
		} else if (arg0 == 3) {
			local89 = arg1.method647();
			this.anIntArray303 = new int[local89 + 1];
			for (local95 = 0; local95 < local89; local95++) {
				this.anIntArray303[local95] = arg1.method647();
			}
			this.anIntArray303[local89] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean92 = true;
		} else if (arg0 == 5) {
			this.anInt2259 = arg1.method647();
		} else if (arg0 == 6) {
			this.anInt2255 = arg1.method602();
		} else if (arg0 == 7) {
			this.anInt2263 = arg1.method602();
		} else if (arg0 == 8) {
			this.anInt2244 = arg1.method647();
		} else if (arg0 == 9) {
			this.anInt2253 = arg1.method647();
		} else if (arg0 == 10) {
			this.anInt2258 = arg1.method647();
		} else if (arg0 == 11) {
			this.anInt2246 = arg1.method647();
		} else if (arg0 == 12) {
			local89 = arg1.method647();
			this.anIntArray307 = new int[local89];
			for (local95 = 0; local95 < local89; local95++) {
				this.anIntArray307[local95] = arg1.method602();
			}
			for (local143 = 0; local143 < local89; local143++) {
				this.anIntArray307[local143] = (arg1.method602() << 16) + this.anIntArray307[local143];
			}
		} else if (arg0 == 13) {
			local89 = arg1.method647();
			this.anIntArray304 = new int[local89];
			for (local95 = 0; local95 < local89; local95++) {
				this.anIntArray304[local95] = arg1.method639();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ob;B)V")
	public void method1558(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method647();
			if (local11 == 0) {
				return;
			}
			this.method1555(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ua;I)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1559(@OriginalArg(1) Class3_Sub1_Sub4_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray306[arg1];
		@Pc(15) Class3_Sub1_Sub6 local15 = Static19.method1700(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local15 == null) {
			return arg0.method1760(true);
		} else {
			@Pc(40) Class3_Sub1_Sub4_Sub7 local40 = arg0.method1760(!local15.method938(local23));
			local40.method1756(local15, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(ILclient!ua;I)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1560(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub7 arg1) {
		@Pc(4) int local4 = this.anIntArray306[arg0];
		@Pc(14) Class3_Sub1_Sub6 local14 = Static19.method1700(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1760(true);
		}
		@Pc(32) Class3_Sub1_Sub6 local32 = null;
		@Pc(34) int local34 = 0;
		if (this.anIntArray307 != null && arg0 < this.anIntArray307.length) {
			local34 = this.anIntArray307[arg0];
			local32 = Static19.method1700(local34 >> 16);
			local34 &= 0xFFFF;
		}
		@Pc(73) Class3_Sub1_Sub4_Sub7 local73;
		if (local32 == null || local34 == 65535) {
			local73 = arg1.method1760(!local14.method938(local18));
			local73.method1756(local14, local18);
			return local73;
		} else {
			local73 = arg1.method1760(!local14.method938(local18) & !local32.method938(local34));
			local73.method1756(local14, local18);
			local73.method1756(local32, local34);
			return local73;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILclient!ua;)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub4_Sub7 arg2) {
		@Pc(10) int local10 = this.anIntArray306[arg1];
		@Pc(16) Class3_Sub1_Sub6 local16 = Static19.method1700(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg2.method1760(true);
		}
		@Pc(30) int local30 = arg0 & 0x3;
		@Pc(41) Class3_Sub1_Sub4_Sub7 local41 = arg2.method1760(!local16.method938(local20));
		if (local30 == 1) {
			local41.method1757();
		} else if (local30 == 2) {
			local41.method1763();
		} else if (local30 == 3) {
			local41.method1769();
		}
		local41.method1756(local16, local20);
		if (local30 == 1) {
			local41.method1769();
		} else if (local30 == 2) {
			local41.method1763();
		} else if (local30 == 3) {
			local41.method1757();
		}
		return local41;
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V")
	public void method1563() {
		if (this.anInt2253 == -1) {
			if (this.anIntArray303 == null) {
				this.anInt2253 = 0;
			} else {
				this.anInt2253 = 2;
			}
		}
		if (this.anInt2258 != -1) {
			return;
		}
		if (this.anIntArray303 == null) {
			this.anInt2258 = 0;
		} else {
			this.anInt2258 = 2;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ua;ILclient!qc;I)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1564(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub7 arg1, @OriginalArg(3) Class3_Sub1_Sub11 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray306[arg3];
		@Pc(14) Class3_Sub1_Sub6 local14 = Static19.method1700(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg2.method1559(arg1, arg0);
		}
		@Pc(31) int local31 = arg2.anIntArray306[arg0];
		@Pc(39) Class3_Sub1_Sub6 local39 = Static19.method1700(local31 >> 16);
		@Pc(43) int local43 = local31 & 0xFFFF;
		@Pc(58) Class3_Sub1_Sub4_Sub7 local58;
		if (local39 == null) {
			local58 = arg1.method1760(!local14.method938(local18));
			local58.method1756(local14, local18);
			return local58;
		} else {
			local58 = arg1.method1760(!local14.method938(local18) & !local39.method938(local43));
			local58.method1770(local14, local18, local39, local43, this.anIntArray303);
			return local58;
		}
	}
}
