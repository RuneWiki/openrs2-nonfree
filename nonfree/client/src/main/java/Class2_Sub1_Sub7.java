import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!nc", name = "eb", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!nc", name = "gb", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
	public int anInt1965 = -1;

	@OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
	public int anInt1970 = 5;

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
	public int anInt1969 = -1;

	@OriginalMember(owner = "client!nc", name = "ob", descriptor = "I")
	public int anInt1980 = -1;

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
	public int anInt1975 = 99;

	@OriginalMember(owner = "client!nc", name = "pb", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
	public int anInt1971 = -1;

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
	public int anInt1972 = 2;

	@OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
	public int anInt1974 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!na;B)V")
	private void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(33) int local33;
		if (arg0 == 1) {
			local8 = arg1.method632();
			this.anIntArray210 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray210[local14] = arg1.method632();
			}
			this.anIntArray212 = new int[local8];
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray212[local33] = arg1.method632();
			}
			for (@Pc(48) int local48 = 0; local48 < local8; local48++) {
				this.anIntArray212[local48] += arg1.method632() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1974 = arg1.method632();
		} else if (arg0 == 3) {
			local8 = arg1.method640();
			this.anIntArray214 = new int[local8 + 1];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray214[local14] = arg1.method640();
			}
			this.anIntArray214[local8] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean146 = true;
		} else if (arg0 == 5) {
			this.anInt1970 = arg1.method640();
		} else if (arg0 == 6) {
			this.anInt1969 = arg1.method632();
		} else if (arg0 == 7) {
			this.anInt1965 = arg1.method632();
		} else if (arg0 == 8) {
			this.anInt1975 = arg1.method640();
		} else if (arg0 == 9) {
			this.anInt1980 = arg1.method640();
		} else if (arg0 == 10) {
			this.anInt1971 = arg1.method640();
		} else if (arg0 == 11) {
			this.anInt1972 = arg1.method640();
		} else if (arg0 == 12) {
			local8 = arg1.method640();
			this.anIntArray211 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray211[local14] = arg1.method632();
			}
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray211[local33] = (arg1.method632() << 16) + this.anIntArray211[local33];
			}
		} else if (arg0 == 13) {
			local8 = arg1.method640();
			this.anIntArray213 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray213[local14] = arg1.method628();
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZILclient!ad;)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method1265(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray212[arg0];
		@Pc(14) Class2_Sub1_Sub6 local14 = Static60.method1108(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method118(true);
		} else {
			@Pc(46) Class2_Sub1_Sub1_Sub2 local46 = arg1.method118(!local14.method1214(local18));
			local46.method105(local14, local18);
			return local46;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!na;Z)V")
	public void method1266(@OriginalArg(0) Class2_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method640();
			if (local9 == 0) {
				return;
			}
			this.method1262(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	public void method1268() {
		if (this.anInt1980 == -1) {
			if (this.anIntArray214 == null) {
				this.anInt1980 = 0;
			} else {
				this.anInt1980 = 2;
			}
		}
		if (this.anInt1971 != -1) {
			return;
		}
		if (this.anIntArray214 == null) {
			this.anInt1971 = 0;
		} else {
			this.anInt1971 = 2;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLclient!ad;)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method1269(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub2 arg1) {
		@Pc(4) int local4 = this.anIntArray212[arg0];
		@Pc(19) Class2_Sub1_Sub6 local19 = Static60.method1108(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg1.method116(true);
		}
		@Pc(31) Class2_Sub1_Sub6 local31 = null;
		@Pc(33) int local33 = 0;
		if (this.anIntArray211 != null && arg0 < this.anIntArray211.length) {
			local33 = this.anIntArray211[arg0];
			local31 = Static60.method1108(local33 >> 16);
			local33 &= 0xFFFF;
		}
		@Pc(74) Class2_Sub1_Sub1_Sub2 local74;
		if (local31 == null || local33 == 65535) {
			local74 = arg1.method116(!local19.method1214(local23));
			local74.method105(local19, local23);
			return local74;
		} else {
			local74 = arg1.method116(!local19.method1214(local23) & !local31.method1214(local33));
			local74.method105(local19, local23);
			local74.method105(local31, local33);
			return local74;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBILclient!ad;)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method1270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub2 arg2) {
		@Pc(6) int local6 = this.anIntArray212[arg0];
		@Pc(12) Class2_Sub1_Sub6 local12 = Static60.method1108(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local12 == null) {
			return arg2.method116(true);
		}
		@Pc(30) int local30 = arg1 & 0x3;
		@Pc(41) Class2_Sub1_Sub1_Sub2 local41 = arg2.method116(!local12.method1214(local20));
		if (local30 == 1) {
			local41.method124();
		} else if (local30 == 2) {
			local41.method119();
		} else if (local30 == 3) {
			local41.method111();
		}
		local41.method105(local12, local20);
		if (local30 == 1) {
			local41.method111();
		} else if (local30 == 2) {
			local41.method119();
		} else if (local30 == 3) {
			local41.method124();
		}
		return local41;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ad;ZI)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method1271(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray212[arg1];
		@Pc(20) Class2_Sub1_Sub6 local20 = Static60.method1108(local4 >> 16);
		@Pc(24) int local24 = local4 & 0xFFFF;
		if (local20 == null) {
			return arg0.method116(true);
		} else {
			@Pc(41) Class2_Sub1_Sub1_Sub2 local41 = arg0.method116(!local20.method1214(local24));
			local41.method105(local20, local24);
			return local41;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!nc;ILclient!ad;)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method1272(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub1_Sub2 arg3) {
		@Pc(4) int local4 = this.anIntArray212[arg2];
		@Pc(14) Class2_Sub1_Sub6 local14 = Static60.method1108(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1271(arg3, arg0);
		}
		@Pc(31) int local31 = arg1.anIntArray212[arg0];
		@Pc(37) Class2_Sub1_Sub6 local37 = Static60.method1108(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class2_Sub1_Sub1_Sub2 local54;
		if (local37 == null) {
			local54 = arg3.method116(!local14.method1214(local18));
			local54.method105(local14, local18);
			return local54;
		} else {
			local54 = arg3.method116(!local14.method1214(local18) & !local37.method1214(local41));
			local54.method106(local14, local18, local37, local41, this.anIntArray214);
			return local54;
		}
	}
}
