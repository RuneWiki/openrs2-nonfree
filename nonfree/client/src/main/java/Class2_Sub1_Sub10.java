import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "[I")
	public int[] anIntArray292;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "[I")
	public int[] anIntArray293;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!mb", name = "vb", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
	public int anInt2088 = 2;

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
	public int anInt2092 = -1;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
	public int anInt2094 = -1;

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
	public int anInt2097 = 99;

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
	public int anInt2096 = -1;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "I")
	public int anInt2101 = 5;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
	public int anInt2095 = -1;

	@OriginalMember(owner = "client!mb", name = "tb", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "client!mb", name = "xb", descriptor = "I")
	public int anInt2106 = -1;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIILclient!hb;)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub4_Sub5 arg2) {
		@Pc(15) int local15 = this.anIntArray292[arg1];
		@Pc(21) Class2_Sub1_Sub6 local21 = Static75.method1405(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg2.method902(true);
		}
		@Pc(42) Class2_Sub1_Sub4_Sub5 local42 = arg2.method902(!local21.method1007(local25));
		@Pc(46) int local46 = arg0 & 0x3;
		if (local46 == 1) {
			local42.method903();
		} else if (local46 == 2) {
			local42.method908();
		} else if (local46 == 3) {
			local42.method901();
		}
		local42.method913(local21, local25);
		if (local46 == 1) {
			local42.method901();
		} else if (local46 == 2) {
			local42.method908();
		} else if (local46 == 3) {
			local42.method903();
		}
		return local42;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!hb;II)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1304(@OriginalArg(0) Class2_Sub1_Sub4_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray292[arg1];
		@Pc(14) Class2_Sub1_Sub6 local14 = Static75.method1405(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method902(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class2_Sub1_Sub6 local28 = null;
		if (this.anIntArray295 != null && this.anIntArray295.length > arg1) {
			local26 = this.anIntArray295[arg1];
			local28 = Static75.method1405(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(73) Class2_Sub1_Sub4_Sub5 local73;
		if (local28 == null || local26 == 65535) {
			local73 = arg0.method902(!local14.method1007(local18));
			local73.method913(local14, local18);
			return local73;
		} else {
			local73 = arg0.method902(!local14.method1007(local18) & !local28.method1007(local26));
			local73.method913(local14, local18);
			local73.method913(local28, local26);
			return local73;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!pd;)V")
	public void method1305(@OriginalArg(1) Class2_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method665();
			if (local5 == 0) {
				return;
			}
			this.method1312(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!hb;IB)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1306(@OriginalArg(0) Class2_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anIntArray292[arg1];
		@Pc(20) Class2_Sub1_Sub6 local20 = Static75.method1405(local14 >> 16);
		@Pc(24) int local24 = local14 & 0xFFFF;
		if (local20 == null) {
			return arg0.method906(true);
		} else {
			@Pc(43) Class2_Sub1_Sub4_Sub5 local43 = arg0.method906(!local20.method1007(local24));
			local43.method913(local20, local24);
			return local43;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLclient!hb;)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1309(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub4_Sub5 arg1) {
		@Pc(4) int local4 = this.anIntArray292[arg0];
		@Pc(19) Class2_Sub1_Sub6 local19 = Static75.method1405(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg1.method902(true);
		} else {
			@Pc(40) Class2_Sub1_Sub4_Sub5 local40 = arg1.method902(!local19.method1007(local23));
			local40.method913(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mb;ILclient!hb;IB)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1310(@OriginalArg(0) Class2_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub4_Sub5 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = this.anIntArray292[arg3];
		@Pc(19) Class2_Sub1_Sub6 local19 = Static75.method1405(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1309(arg1, arg2);
		}
		@Pc(36) int local36 = arg0.anIntArray292[arg1];
		@Pc(42) Class2_Sub1_Sub6 local42 = Static75.method1405(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(61) Class2_Sub1_Sub4_Sub5 local61;
		if (local42 == null) {
			local61 = arg2.method902(!local19.method1007(local23));
			local61.method913(local19, local23);
			return local61;
		} else {
			local61 = arg2.method902(!local19.method1007(local23) & !local42.method1007(local46));
			local61.method898(local19, local23, local42, local46, this.anIntArray294);
			return local61;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
	public void method1311() {
		if (this.anInt2106 == -1) {
			if (this.anIntArray294 == null) {
				this.anInt2106 = 0;
			} else {
				this.anInt2106 = 2;
			}
		}
		if (this.anInt2096 != -1) {
			return;
		}
		if (this.anIntArray294 == null) {
			this.anInt2096 = 0;
		} else {
			this.anInt2096 = 2;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!pd;)V")
	private void method1312(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6 arg1) {
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(46) int local46;
		if (arg0 == 1) {
			local21 = arg1.method665();
			this.anIntArray293 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray293[local27] = arg1.method627();
			}
			this.anIntArray292 = new int[local21];
			for (local46 = 0; local46 < local21; local46++) {
				this.anIntArray292[local46] = arg1.method627();
			}
			for (@Pc(61) int local61 = 0; local61 < local21; local61++) {
				this.anIntArray292[local61] = (arg1.method627() << 16) + this.anIntArray292[local61];
			}
		} else if (arg0 == 2) {
			this.anInt2094 = arg1.method627();
		} else if (arg0 == 3) {
			local21 = arg1.method665();
			this.anIntArray294 = new int[local21 + 1];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray294[local27] = arg1.method665();
			}
			this.anIntArray294[local21] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean107 = true;
		} else if (arg0 == 5) {
			this.anInt2101 = arg1.method665();
		} else if (arg0 == 6) {
			this.anInt2092 = arg1.method627();
		} else if (arg0 == 7) {
			this.anInt2095 = arg1.method627();
		} else if (arg0 == 8) {
			this.anInt2097 = arg1.method665();
		} else if (arg0 == 9) {
			this.anInt2096 = arg1.method665();
		} else if (arg0 == 10) {
			this.anInt2106 = arg1.method665();
		} else if (arg0 == 11) {
			this.anInt2088 = arg1.method665();
			return;
		} else if (arg0 == 12) {
			local21 = arg1.method665();
			this.anIntArray295 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray295[local27] = arg1.method627();
			}
			for (local46 = 0; local46 < local21; local46++) {
				this.anIntArray295[local46] += arg1.method627() << 16;
			}
			return;
		}
	}
}
