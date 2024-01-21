import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "bb", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!a", name = "eb", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!a", name = "rb", descriptor = "[I")
	public int[] anIntArray8;

	@OriginalMember(owner = "client!a", name = "Bb", descriptor = "I")
	public int anInt65;

	@OriginalMember(owner = "client!a", name = "Wb", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!a", name = "ec", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!a", name = "jb", descriptor = "I")
	public int anInt53 = -1;

	@OriginalMember(owner = "client!a", name = "pb", descriptor = "I")
	private int anInt57 = -1;

	@OriginalMember(owner = "client!a", name = "tb", descriptor = "I")
	private int anInt60 = 128;

	@OriginalMember(owner = "client!a", name = "yb", descriptor = "I")
	private int anInt63 = 128;

	@OriginalMember(owner = "client!a", name = "kb", descriptor = "I")
	private int anInt54 = -1;

	@OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
	private int anInt47 = -1;

	@OriginalMember(owner = "client!a", name = "sb", descriptor = "I")
	public int anInt59 = 0;

	@OriginalMember(owner = "client!a", name = "Fb", descriptor = "I")
	private int anInt69 = 0;

	@OriginalMember(owner = "client!a", name = "Kb", descriptor = "Lclient!gd;")
	public Class23 aClass23_58 = Static17.aClass23_260;

	@OriginalMember(owner = "client!a", name = "mb", descriptor = "I")
	public int anInt55 = 0;

	@OriginalMember(owner = "client!a", name = "vb", descriptor = "I")
	public int anInt62 = 0;

	@OriginalMember(owner = "client!a", name = "ib", descriptor = "I")
	public int anInt52 = 0;

	@OriginalMember(owner = "client!a", name = "xb", descriptor = "Z")
	public boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "Db", descriptor = "I")
	public int anInt67 = -1;

	@OriginalMember(owner = "client!a", name = "Yb", descriptor = "I")
	public int anInt84 = 0;

	@OriginalMember(owner = "client!a", name = "Nb", descriptor = "I")
	private int anInt76 = -1;

	@OriginalMember(owner = "client!a", name = "Hb", descriptor = "I")
	private int anInt71 = -1;

	@OriginalMember(owner = "client!a", name = "Mb", descriptor = "I")
	public int anInt75 = 0;

	@OriginalMember(owner = "client!a", name = "cb", descriptor = "[Lclient!gd;")
	public Class23[] aClass23Array1 = new Class23[] { null, null, Static64.aClass23_1095, null, null };

	@OriginalMember(owner = "client!a", name = "Gb", descriptor = "I")
	private int anInt70 = -1;

	@OriginalMember(owner = "client!a", name = "Jb", descriptor = "I")
	public int anInt73 = 0;

	@OriginalMember(owner = "client!a", name = "fb", descriptor = "I")
	private int anInt49 = -1;

	@OriginalMember(owner = "client!a", name = "Sb", descriptor = "I")
	private int anInt79 = 128;

	@OriginalMember(owner = "client!a", name = "fc", descriptor = "I")
	public int anInt87 = 0;

	@OriginalMember(owner = "client!a", name = "dc", descriptor = "I")
	private int anInt86 = -1;

	@OriginalMember(owner = "client!a", name = "ic", descriptor = "I")
	private int anInt89 = -1;

	@OriginalMember(owner = "client!a", name = "kc", descriptor = "I")
	public int anInt90 = 0;

	@OriginalMember(owner = "client!a", name = "hc", descriptor = "I")
	private int anInt88 = -1;

	@OriginalMember(owner = "client!a", name = "Pb", descriptor = "I")
	private int anInt77 = 0;

	@OriginalMember(owner = "client!a", name = "Cb", descriptor = "I")
	public int anInt66 = 1;

	@OriginalMember(owner = "client!a", name = "jc", descriptor = "[Lclient!gd;")
	public Class23[] aClass23Array2 = new Class23[] { null, null, null, null, Static40.aClass23_734 };

	@OriginalMember(owner = "client!a", name = "cc", descriptor = "I")
	public int anInt85 = 2000;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method30(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt47;
		@Pc(9) int local9 = this.anInt70;
		@Pc(12) int local12 = this.anInt57;
		if (arg0) {
			local9 = this.anInt86;
			local12 = this.anInt54;
			local2 = this.anInt88;
		}
		if (local2 == -1) {
			return null;
		}
		@Pc(34) Class1_Sub1_Sub2_Sub6 local34 = Static81.method1442(Static39.aClass55_20, local2);
		if (local12 != -1) {
			@Pc(43) Class1_Sub1_Sub2_Sub6 local43 = Static81.method1442(Static39.aClass55_20, local12);
			if (local9 == -1) {
				@Pc(85) Class1_Sub1_Sub2_Sub6[] local85 = new Class1_Sub1_Sub2_Sub6[] { local34, local43 };
				local34 = new Class1_Sub1_Sub2_Sub6(local85, 2);
			} else {
				@Pc(52) Class1_Sub1_Sub2_Sub6 local52 = Static81.method1442(Static39.aClass55_20, local9);
				@Pc(67) Class1_Sub1_Sub2_Sub6[] local67 = new Class1_Sub1_Sub2_Sub6[] { local34, local43, local52 };
				local34 = new Class1_Sub1_Sub2_Sub6(local67, 3);
			}
		}
		if (!arg0 && this.anInt77 != 0) {
			local34.method1424(0, this.anInt77, 0);
		}
		if (arg0 && this.anInt69 != 0) {
			local34.method1424(0, this.anInt69, 0);
		}
		if (this.anIntArray7 != null) {
			for (@Pc(129) int local129 = 0; local129 < this.anIntArray7.length; local129++) {
				local34.method1427(this.anIntArray7[local129], this.anIntArray6[local129]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(ZI)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method31(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt49;
		@Pc(16) int local16 = this.anInt89;
		if (arg0) {
			local6 = this.anInt76;
			local16 = this.anInt71;
		}
		if (local6 == -1) {
			return null;
		}
		@Pc(34) Class1_Sub1_Sub2_Sub6 local34 = Static81.method1442(Static39.aClass55_20, local6);
		if (local16 != -1) {
			@Pc(43) Class1_Sub1_Sub2_Sub6 local43 = Static81.method1442(Static39.aClass55_20, local16);
			@Pc(54) Class1_Sub1_Sub2_Sub6[] local54 = new Class1_Sub1_Sub2_Sub6[] { local34, local43 };
			local34 = new Class1_Sub1_Sub2_Sub6(local54, 2);
		}
		if (this.anIntArray7 != null) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArray7.length; local65++) {
				local34.method1427(this.anIntArray7[local65], this.anIntArray6[local65]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZ)Z")
	public boolean method32(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt70;
		@Pc(9) int local9 = this.anInt47;
		@Pc(12) int local12 = this.anInt57;
		if (arg0) {
			local12 = this.anInt54;
			local6 = this.anInt86;
			local9 = this.anInt88;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static39.aClass55_20.method1886(local9, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static39.aClass55_20.method1886(local12, 0)) {
			local30 = false;
		}
		if (local6 != -1 && !Static39.aClass55_20.method1886(local6, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	public void method33() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!a;Lclient!a;I)V")
	public void method34(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub1 arg1) {
		this.anInt55 = arg1.anInt55;
		this.anInt66 = arg0.anInt66;
		this.anInt90 = arg1.anInt90;
		this.anIntArray7 = arg1.anIntArray7;
		this.anInt73 = arg1.anInt73;
		this.anIntArray6 = arg1.anIntArray6;
		this.anInt75 = arg1.anInt75;
		this.anInt59 = arg1.anInt59;
		this.anInt85 = arg1.anInt85;
		this.anInt62 = 1;
		this.aClass23_58 = arg0.aClass23_58;
		this.anInt83 = arg1.anInt83;
		this.aBoolean1 = arg0.aBoolean1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!rc;ZI)V")
	private void method35(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt83 = arg0.method715();
		} else if (arg1 == 2) {
			this.aClass23_58 = arg0.method683();
		} else if (arg1 == 4) {
			this.anInt85 = arg0.method715();
		} else if (arg1 == 5) {
			this.anInt90 = arg0.method715();
		} else if (arg1 == 6) {
			this.anInt55 = arg0.method715();
		} else if (arg1 == 7) {
			this.anInt75 = arg0.method715();
			if (this.anInt75 > 32767) {
				this.anInt75 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt59 = arg0.method715();
			if (this.anInt59 > 32767) {
				this.anInt59 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt62 = 1;
		} else if (arg1 == 12) {
			this.anInt66 = arg0.method692();
		} else if (arg1 == 16) {
			this.aBoolean1 = true;
		} else if (arg1 == 23) {
			this.anInt47 = arg0.method715();
			this.anInt77 = arg0.method716();
		} else if (arg1 == 24) {
			this.anInt57 = arg0.method715();
		} else if (arg1 == 25) {
			this.anInt88 = arg0.method715();
			this.anInt69 = arg0.method716();
		} else if (arg1 == 26) {
			this.anInt54 = arg0.method715();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass23Array1[arg1 - 30] = arg0.method683();
			if (this.aClass23Array1[arg1 - 30].method530(Static76.aClass23_1220)) {
				this.aClass23Array1[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass23Array2[arg1 - 35] = arg0.method683();
		} else if (arg1 == 40) {
			@Pc(306) int local306 = arg0.method716();
			this.anIntArray6 = new int[local306];
			this.anIntArray7 = new int[local306];
			for (@Pc(316) int local316 = 0; local316 < local306; local316++) {
				this.anIntArray7[local316] = arg0.method715();
				this.anIntArray6[local316] = arg0.method715();
			}
		} else if (arg1 == 78) {
			this.anInt70 = arg0.method715();
		} else if (arg1 == 79) {
			this.anInt86 = arg0.method715();
		} else if (arg1 == 90) {
			this.anInt49 = arg0.method715();
		} else if (arg1 == 91) {
			this.anInt76 = arg0.method715();
		} else if (arg1 == 92) {
			this.anInt89 = arg0.method715();
		} else if (arg1 == 93) {
			this.anInt71 = arg0.method715();
		} else if (arg1 == 95) {
			this.anInt73 = arg0.method715();
		} else if (arg1 == 97) {
			this.anInt67 = arg0.method715();
		} else if (arg1 == 98) {
			this.anInt53 = arg0.method715();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray8 == null) {
				this.anIntArray8 = new int[10];
				this.anIntArray11 = new int[10];
			}
			this.anIntArray8[arg1 - 100] = arg0.method715();
			this.anIntArray11[arg1 - 100] = arg0.method715();
		} else if (arg1 == 110) {
			this.anInt63 = arg0.method715();
		} else if (arg1 == 111) {
			this.anInt79 = arg0.method715();
		} else if (arg1 == 112) {
			this.anInt60 = arg0.method715();
		} else if (arg1 == 113) {
			this.anInt52 = arg0.method699();
		} else if (arg1 == 114) {
			this.anInt84 = arg0.method699() * 5;
		} else if (arg1 == 115) {
			this.anInt87 = arg0.method716();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lclient!a;")
	public Class1_Sub1_Sub1 method36(@OriginalArg(1) int arg0) {
		if (this.anIntArray8 != null && arg0 > 1) {
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
				if (arg0 >= this.anIntArray11[local22] && this.anIntArray11[local22] != 0) {
					local20 = this.anIntArray8[local22];
				}
			}
			if (local20 != -1) {
				return Static111.method1907(local20);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZI)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method37(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) int local17;
		if (this.anIntArray8 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray11[local17] && this.anIntArray11[local17] != 0) {
					local15 = this.anIntArray8[local17];
				}
			}
			if (local15 != -1) {
				return Static111.method1907(local15).method37(1, arg1);
			}
		}
		@Pc(66) Class1_Sub1_Sub2_Sub6 local66;
		if (arg1) {
			local66 = (Class1_Sub1_Sub2_Sub6) Static33.aClass5_30.method98((long) this.anInt65);
			if (local66 != null) {
				return local66;
			}
		}
		local66 = Static81.method1442(Static39.aClass55_20, this.anInt83);
		if (local66 == null) {
			return null;
		}
		if (this.anInt63 != 128 || this.anInt79 != 128 || this.anInt60 != 128) {
			local66.method1428(this.anInt63, this.anInt79, this.anInt60);
		}
		if (this.anIntArray7 != null) {
			for (local17 = 0; local17 < this.anIntArray7.length; local17++) {
				local66.method1427(this.anIntArray7[local17], this.anIntArray6[local17]);
			}
		}
		if (arg1) {
			local66.method1437(this.anInt52 + 64, this.anInt84 + 768, -50, -10, -50, true);
			local66.aBoolean107 = true;
			Static33.aClass5_30.method97(local66, (long) this.anInt65);
		}
		return local66;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!rc;I)V")
	public void method38(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method716();
			if (local3 == 0) {
				return;
			}
			this.method35(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IZ)Z")
	public boolean method39(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt89;
		@Pc(9) int local9 = this.anInt49;
		if (arg0) {
			local6 = this.anInt71;
			local9 = this.anInt76;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(26) boolean local26 = true;
		if (!Static39.aClass55_20.method1886(local9, 0)) {
			local26 = false;
		}
		if (local6 != -1 && !Static39.aClass55_20.method1886(local6, 0)) {
			local26 = false;
		}
		return local26;
	}
}
