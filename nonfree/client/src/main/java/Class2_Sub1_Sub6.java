import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!gd", name = "yb", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
	public int anInt1193 = -1;

	@OriginalMember(owner = "client!gd", name = "wb", descriptor = "I")
	public int anInt1197 = -1;

	@OriginalMember(owner = "client!gd", name = "xb", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!gd", name = "ib", descriptor = "I")
	public int anInt1186 = 2;

	@OriginalMember(owner = "client!gd", name = "Gb", descriptor = "I")
	public int anInt1203 = 99;

	@OriginalMember(owner = "client!gd", name = "Bb", descriptor = "I")
	public int anInt1199 = 5;

	@OriginalMember(owner = "client!gd", name = "nb", descriptor = "I")
	public int anInt1191 = -1;

	@OriginalMember(owner = "client!gd", name = "Kb", descriptor = "I")
	public int anInt1205 = -1;

	@OriginalMember(owner = "client!gd", name = "Mb", descriptor = "I")
	public int anInt1207 = -1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!r;)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method731(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub6 arg1) {
		@Pc(4) int local4 = this.anIntArray155[arg0];
		@Pc(14) Class2_Sub1_Sub9 local14 = Static110.method1841(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1522(true);
		}
		@Pc(31) int local31 = 0;
		@Pc(33) Class2_Sub1_Sub9 local33 = null;
		if (this.anIntArray158 != null && this.anIntArray158.length > arg0) {
			local31 = this.anIntArray158[arg0];
			local33 = Static110.method1841(local31 >> 16);
			local31 &= 0xFFFF;
		}
		@Pc(74) Class2_Sub1_Sub1_Sub6 local74;
		if (local33 == null || local31 == 65535) {
			local74 = arg1.method1522(!local14.method1211(local18));
			local74.method1540(local14, local18);
			return local74;
		} else {
			local74 = arg1.method1522(!local14.method1211(local18) & !local33.method1211(local31));
			local74.method1540(local14, local18);
			local74.method1540(local33, local31);
			return local74;
		}
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
	public void method732() {
		if (this.anInt1197 == -1) {
			if (this.anIntArray156 == null) {
				this.anInt1197 = 0;
			} else {
				this.anInt1197 = 2;
			}
		}
		if (this.anInt1191 != -1) {
			return;
		}
		if (this.anIntArray156 == null) {
			this.anInt1191 = 0;
		} else {
			this.anInt1191 = 2;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!r;IZ)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method733(@OriginalArg(0) Class2_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray155[arg1];
		@Pc(10) Class2_Sub1_Sub9 local10 = Static110.method1841(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method1522(true);
		} else {
			@Pc(40) Class2_Sub1_Sub1_Sub6 local40 = arg0.method1522(!local10.method1211(local18));
			local40.method1540(local10, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILclient!fe;)V")
	private void method735(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(44) int local44;
		if (arg0 == 1) {
			local19 = arg1.method1410();
			this.anIntArray157 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray157[local25] = arg1.method1396();
			}
			this.anIntArray155 = new int[local19];
			for (local44 = 0; local44 < local19; local44++) {
				this.anIntArray155[local44] = arg1.method1396();
			}
			for (@Pc(59) int local59 = 0; local59 < local19; local59++) {
				this.anIntArray155[local59] += arg1.method1396() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1205 = arg1.method1396();
		} else if (arg0 == 3) {
			local19 = arg1.method1410();
			this.anIntArray156 = new int[local19 + 1];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray156[local25] = arg1.method1410();
			}
			this.anIntArray156[local19] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean72 = true;
		} else if (arg0 == 5) {
			this.anInt1199 = arg1.method1410();
		} else if (arg0 == 6) {
			this.anInt1193 = arg1.method1396();
		} else if (arg0 == 7) {
			this.anInt1207 = arg1.method1396();
		} else if (arg0 == 8) {
			this.anInt1203 = arg1.method1410();
		} else if (arg0 == 9) {
			this.anInt1197 = arg1.method1410();
		} else if (arg0 == 10) {
			this.anInt1191 = arg1.method1410();
		} else if (arg0 == 11) {
			this.anInt1186 = arg1.method1410();
		} else if (arg0 == 12) {
			local19 = arg1.method1410();
			this.anIntArray158 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray158[local25] = arg1.method1396();
			}
			for (local44 = 0; local44 < local19; local44++) {
				this.anIntArray158[local44] = (arg1.method1396() << 16) + this.anIntArray158[local44];
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!gd;IILclient!r;)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method736(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub1_Sub1_Sub6 arg3) {
		@Pc(13) int local13 = this.anIntArray155[arg2];
		@Pc(19) Class2_Sub1_Sub9 local19 = Static110.method1841(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method733(arg3, arg0);
		}
		@Pc(36) int local36 = arg1.anIntArray155[arg0];
		@Pc(42) Class2_Sub1_Sub9 local42 = Static110.method1841(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(59) Class2_Sub1_Sub1_Sub6 local59;
		if (local42 == null) {
			local59 = arg3.method1522(!local19.method1211(local23));
			local59.method1540(local19, local23);
			return local59;
		} else {
			local59 = arg3.method1522(!local19.method1211(local23) & !local42.method1211(local46));
			local59.method1531(local19, local23, local42, local46, this.anIntArray156);
			return local59;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fe;Z)V")
	public void method738(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1410();
			if (local5 == 0) {
				return;
			}
			this.method735(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILclient!r;)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method739(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub6 arg1) {
		@Pc(4) int local4 = this.anIntArray155[arg0];
		@Pc(14) Class2_Sub1_Sub9 local14 = Static110.method1841(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1527(true);
		} else {
			@Pc(35) Class2_Sub1_Sub1_Sub6 local35 = arg1.method1527(!local14.method1211(local18));
			local35.method1540(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!r;II)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method740(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = this.anIntArray155[arg0];
		@Pc(18) Class2_Sub1_Sub9 local18 = Static110.method1841(local10 >> 16);
		@Pc(22) int local22 = local10 & 0xFFFF;
		if (local18 == null) {
			return arg1.method1522(true);
		}
		@Pc(32) int local32 = arg2 & 0x3;
		@Pc(43) Class2_Sub1_Sub1_Sub6 local43 = arg1.method1522(!local18.method1211(local22));
		if (local32 == 1) {
			local43.method1541();
		} else if (local32 == 2) {
			local43.method1529();
		} else if (local32 == 3) {
			local43.method1539();
		}
		local43.method1540(local18, local22);
		if (local32 == 1) {
			local43.method1539();
		} else if (local32 == 2) {
			local43.method1529();
		} else if (local32 == 3) {
			local43.method1541();
		}
		return local43;
	}
}
