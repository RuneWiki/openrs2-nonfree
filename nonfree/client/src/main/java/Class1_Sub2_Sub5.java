import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!ea", name = "eb", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!ea", name = "lb", descriptor = "I")
	public int anInt1016;

	@OriginalMember(owner = "client!ea", name = "rb", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "Lclient!tg;")
	public Class81 aClass81_352 = Static136.aClass81_1048;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "S")
	public short aShort5 = 0;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
	private int anInt997 = 128;

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
	public int anInt996 = -1;

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "[Lclient!tg;")
	public final Class81[] aClass81Array4 = new Class81[5];

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
	public int anInt1001 = -1;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
	private int anInt1002 = 128;

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
	public int anInt1004 = -1;

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
	private int anInt998 = -1;

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "I")
	public int anInt1008 = -1;

	@OriginalMember(owner = "client!ea", name = "db", descriptor = "I")
	public int anInt1010 = 1;

	@OriginalMember(owner = "client!ea", name = "W", descriptor = "Z")
	public boolean aBoolean35 = true;

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "Z")
	public boolean aBoolean34 = true;

	@OriginalMember(owner = "client!ea", name = "gb", descriptor = "S")
	public short aShort6 = 0;

	@OriginalMember(owner = "client!ea", name = "fb", descriptor = "I")
	private int anInt1011 = -1;

	@OriginalMember(owner = "client!ea", name = "ib", descriptor = "I")
	private int anInt1013 = 0;

	@OriginalMember(owner = "client!ea", name = "Y", descriptor = "Z")
	public boolean aBoolean36 = true;

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
	public int anInt1009 = -1;

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
	public int anInt1006 = 32;

	@OriginalMember(owner = "client!ea", name = "nb", descriptor = "I")
	public int anInt1018 = -1;

	@OriginalMember(owner = "client!ea", name = "ob", descriptor = "I")
	public int anInt1019 = -1;

	@OriginalMember(owner = "client!ea", name = "mb", descriptor = "I")
	public int anInt1017 = -1;

	@OriginalMember(owner = "client!ea", name = "qb", descriptor = "I")
	public int anInt1021 = -1;

	@OriginalMember(owner = "client!ea", name = "kb", descriptor = "I")
	private int anInt1015 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILclient!ub;Lclient!ub;I)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method758(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub18 arg1, @OriginalArg(3) Class1_Sub2_Sub18 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray81 != null) {
			@Pc(12) Class1_Sub2_Sub5 local12 = this.method766();
			return local12 == null ? null : local12.method758(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class1_Sub2_Sub1_Sub4 local32 = (Class1_Sub2_Sub1_Sub4) Static47.aClass59_9.method1970((long) this.anInt1016);
		if (local32 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray82.length; local43++) {
				if (!Static12.aClass82_73.method2944(0, this.anIntArray82[local43])) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(75) Class1_Sub2_Sub1_Sub6[] local75 = new Class1_Sub2_Sub1_Sub6[this.anIntArray82.length];
			for (@Pc(77) int local77 = 0; local77 < this.anIntArray82.length; local77++) {
				local75[local77] = Static159.method2767(Static12.aClass82_73, this.anIntArray82[local77]);
			}
			@Pc(105) Class1_Sub2_Sub1_Sub6 local105;
			if (local75.length == 1) {
				local105 = local75[0];
			} else {
				local105 = new Class1_Sub2_Sub1_Sub6(local75, local75.length);
			}
			@Pc(119) int local119;
			if (this.aShortArray8 != null) {
				for (local119 = 0; local119 < this.aShortArray8.length; local119++) {
					local105.method2752(this.aShortArray8[local119], this.aShortArray6[local119]);
				}
			}
			if (this.aShortArray5 != null) {
				for (local119 = 0; local119 < this.aShortArray5.length; local119++) {
					local105.method2756(this.aShortArray5[local119], this.aShortArray7[local119]);
				}
			}
			local32 = local105.method2745(this.anInt1015 + 64, this.anInt1013 + 850, -30, -50, -30, true);
			Static47.aClass59_9.method1973(local32, (long) this.anInt1016);
		}
		@Pc(206) Class1_Sub2_Sub1_Sub4 local206;
		if (arg2 != null && arg1 != null) {
			local206 = arg2.method2899(local32, arg0, arg3, arg1);
		} else if (arg2 != null) {
			local206 = arg2.method2887(arg0, local32);
		} else if (arg1 == null) {
			local206 = local32.method1446(true);
		} else {
			local206 = arg1.method2887(arg3, local32);
		}
		if (this.anInt997 != 128 || this.anInt1002 != 128) {
			local206.method1457(this.anInt997, this.anInt1002, this.anInt997);
		}
		return local206;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Z")
	public boolean method759() {
		if (this.anIntArray81 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt1011 != -1) {
			local15 = Static103.method1704(this.anInt1011);
		} else if (this.anInt998 != -1) {
			local15 = Static83.anIntArray178[this.anInt998];
		}
		return local15 >= 0 && local15 < this.anIntArray81.length && this.anIntArray81[local15] != -1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ka;B)V")
	public void method760(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method336();
			if (local15 == 0) {
				return;
			}
			this.method761(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBLclient!ka;)V")
	private void method761(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local8 = arg1.method336();
			this.anIntArray82 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray82[local14] = arg1.method359();
			}
		} else if (arg0 == 2) {
			this.aClass81_352 = arg1.method344();
		} else if (arg0 == 12) {
			this.anInt1010 = arg1.method336();
		} else if (arg0 == 13) {
			this.anInt1019 = arg1.method359();
		} else if (arg0 == 14) {
			this.anInt1001 = arg1.method359();
		} else if (arg0 == 15) {
			this.anInt1008 = arg1.method359();
		} else if (arg0 == 16) {
			this.anInt1004 = arg1.method359();
		} else if (arg0 == 17) {
			this.anInt1001 = arg1.method359();
			this.anInt1018 = arg1.method359();
			this.anInt996 = arg1.method359();
			this.anInt1021 = arg1.method359();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass81Array4[arg0 - 30] = arg1.method344();
			if (this.aClass81Array4[arg0 - 30].method2811(Static129.aClass81_1022)) {
				this.aClass81Array4[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local8 = arg1.method336();
			this.aShortArray8 = new short[local8];
			this.aShortArray6 = new short[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.aShortArray8[local14] = (short) arg1.method359();
				this.aShortArray6[local14] = (short) arg1.method359();
			}
		} else if (arg0 == 41) {
			local8 = arg1.method336();
			this.aShortArray7 = new short[local8];
			this.aShortArray5 = new short[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.aShortArray5[local14] = (short) arg1.method359();
				this.aShortArray7[local14] = (short) arg1.method359();
			}
		} else if (arg0 == 60) {
			local8 = arg1.method336();
			this.anIntArray80 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray80[local14] = arg1.method359();
			}
		} else if (arg0 == 93) {
			this.aBoolean35 = false;
		} else if (arg0 == 95) {
			this.anInt1017 = arg1.method359();
		} else if (arg0 == 97) {
			this.anInt997 = arg1.method359();
		} else if (arg0 == 98) {
			this.anInt1002 = arg1.method359();
		} else if (arg0 == 99) {
			this.aBoolean33 = true;
		} else if (arg0 == 100) {
			this.anInt1015 = arg1.method339();
		} else if (arg0 == 101) {
			this.anInt1013 = arg1.method339() * 5;
		} else if (arg0 == 102) {
			this.anInt1009 = arg1.method359();
		} else if (arg0 == 103) {
			this.anInt1006 = arg1.method359();
		} else if (arg0 == 106) {
			this.anInt1011 = arg1.method359();
			if (this.anInt1011 == 65535) {
				this.anInt1011 = -1;
			}
			this.anInt998 = arg1.method359();
			if (this.anInt998 == 65535) {
				this.anInt998 = -1;
			}
			local8 = arg1.method336();
			this.anIntArray81 = new int[local8 + 1];
			for (local14 = 0; local14 <= local8; local14++) {
				this.anIntArray81[local14] = arg1.method359();
				if (this.anIntArray81[local14] == 65535) {
					this.anIntArray81[local14] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean36 = false;
		} else if (arg0 == 109) {
			this.aBoolean34 = false;
		} else if (arg0 != 111) {
			if (arg0 == 113) {
				arg1.method359();
				arg1.method359();
			} else if (arg0 == 114) {
				arg1.method339();
				arg1.method339();
			} else if (arg0 == 115) {
				this.aShort6 = (short) (arg1.method336() * 4);
				this.aShort5 = (short) (arg1.method336() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZILclient!ub;)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method762(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub18 arg1) {
		if (this.anIntArray81 != null) {
			@Pc(17) Class1_Sub2_Sub5 local17 = this.method766();
			return local17 == null ? null : local17.method762(arg0, arg1);
		} else if (this.anIntArray80 == null) {
			return null;
		} else {
			@Pc(40) Class1_Sub2_Sub1_Sub4 local40 = (Class1_Sub2_Sub1_Sub4) Static177.aClass59_30.method1970((long) this.anInt1016);
			if (local40 == null) {
				@Pc(44) boolean local44 = false;
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray80.length; local46++) {
					if (!Static12.aClass82_73.method2944(0, this.anIntArray80[local46])) {
						local44 = true;
					}
				}
				if (local44) {
					return null;
				}
				@Pc(78) Class1_Sub2_Sub1_Sub6[] local78 = new Class1_Sub2_Sub1_Sub6[this.anIntArray80.length];
				for (@Pc(80) int local80 = 0; local80 < this.anIntArray80.length; local80++) {
					local78[local80] = Static159.method2767(Static12.aClass82_73, this.anIntArray80[local80]);
				}
				@Pc(115) Class1_Sub2_Sub1_Sub6 local115;
				if (local78.length == 1) {
					local115 = local78[0];
				} else {
					local115 = new Class1_Sub2_Sub1_Sub6(local78, local78.length);
				}
				@Pc(126) int local126;
				if (this.aShortArray8 != null) {
					for (local126 = 0; local126 < this.aShortArray8.length; local126++) {
						local115.method2752(this.aShortArray8[local126], this.aShortArray6[local126]);
					}
				}
				if (this.aShortArray5 != null) {
					for (local126 = 0; local126 < this.aShortArray5.length; local126++) {
						local115.method2756(this.aShortArray5[local126], this.aShortArray7[local126]);
					}
				}
				local40 = local115.method2745(64, 768, -50, -10, -50, true);
				Static177.aClass59_30.method1973(local40, (long) this.anInt1016);
			}
			if (arg1 != null) {
				local40 = arg1.method2889(local40, arg0);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public void method765() {
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lclient!ea;")
	public Class1_Sub2_Sub5 method766() {
		@Pc(11) int local11 = -1;
		if (this.anInt1011 != -1) {
			local11 = Static103.method1704(this.anInt1011);
		} else if (this.anInt998 != -1) {
			local11 = Static83.anIntArray178[this.anInt998];
		}
		return local11 < 0 || this.anIntArray81.length <= local11 || this.anIntArray81[local11] == -1 ? null : Static171.method3011(this.anIntArray81[local11]);
	}
}
