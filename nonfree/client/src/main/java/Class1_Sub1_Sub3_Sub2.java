import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!z", name = "Bb", descriptor = "Lclient!s;")
	public static Class32 aClass32_7 = new Class32(-24094, 200);

	@OriginalMember(owner = "client!z", name = "fb", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!z", name = "hb", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!z", name = "jb", descriptor = "I")
	private int anInt791;

	@OriginalMember(owner = "client!z", name = "kb", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!z", name = "nb", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!z", name = "ob", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!z", name = "pb", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "I")
	public int anInt795;

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "I")
	public int anInt796;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "I")
	public int anInt798;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!z", name = "vb", descriptor = "Lclient!eb;")
	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_11;

	@OriginalMember(owner = "client!z", name = "wb", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!z", name = "xb", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!z", name = "yb", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!z", name = "zb", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!z", name = "gb", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!z", name = "ib", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!z", name = "lb", descriptor = "[I")
	private int[] anIntArray215 = new int[13];

	@OriginalMember(owner = "client!z", name = "mb", descriptor = "[I")
	private int[] anIntArray216 = new int[5];

	@OriginalMember(owner = "client!z", name = "Ab", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Lclient!kb;Z)V")
	public void method517(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			arg0.anInt433 = 0;
			this.anInt791 = arg0.method380();
			this.anInt792 = arg0.method380();
			@Pc(19) int local19;
			@Pc(31) int local31;
			for (@Pc(14) int local14 = 0; local14 < 13; local14++) {
				local19 = arg0.method380();
				if (local19 == 0) {
					this.anIntArray215[local14] = 0;
				} else {
					local31 = arg0.method380();
					this.anIntArray215[local14] = (local19 << 8) + local31;
				}
			}
			for (local19 = 0; local19 < 5; local19++) {
				local31 = arg0.method380();
				if (local31 < 0 || local31 >= client.anIntArrayArray6[local19].length) {
					local31 = 0;
				}
				this.anIntArray216[local19] = local31;
			}
			super.anInt747 = arg0.method382();
			if (super.anInt747 == 65535) {
				super.anInt747 = -1;
			}
			super.anInt748 = arg0.method382();
			if (super.anInt748 == 65535) {
				super.anInt748 = -1;
			}
			super.anInt749 = arg0.method382();
			if (super.anInt749 == 65535) {
				super.anInt749 = -1;
			}
			super.anInt750 = arg0.method382();
			if (super.anInt750 == 65535) {
				super.anInt750 = -1;
			}
			super.anInt751 = arg0.method382();
			if (super.anInt751 == 65535) {
				super.anInt751 = -1;
			}
			super.anInt752 = arg0.method382();
			if (super.anInt752 == 65535) {
				super.anInt752 = -1;
			}
			super.anInt753 = arg0.method382();
			if (super.anInt753 == 65535) {
				super.anInt753 = -1;
			}
			this.aString27 = Class37.method484(Class37.method482(arg0.method386()));
			this.anInt793 = arg0.method380();
			this.aBoolean161 = true;
			this.aLong24 = 0L;
			for (local31 = 0; local31 < 12; local31++) {
				this.aLong24 <<= 0x4;
				if (this.anIntArray215[local31] >= 256) {
					this.aLong24 += this.anIntArray215[local31] - 256;
				}
			}
			if (this.anIntArray215[0] >= 256) {
				this.aLong24 += this.anIntArray215[0] - 256 >> 4;
			}
			if (this.anIntArray215[1] >= 256) {
				this.aLong24 += this.anIntArray215[1] - 256 >> 8;
			}
			for (@Pc(245) int local245 = 0; local245 < 5; local245++) {
				this.aLong24 <<= 0x3;
				this.aLong24 += this.anIntArray216[local245];
			}
			this.aLong24 <<= 0x1;
			this.aLong24 += this.anInt791;
		} catch (@Pc(283) RuntimeException local283) {
			signlink.reporterror("10419, " + arg0 + ", " + true + ", " + local283.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method513() {
		try {
			if (!this.aBoolean161) {
				return null;
			}
			@Pc(10) Class1_Sub3_Sub1 local10 = this.method518();
			super.anInt786 = local10.anInt258;
			local10.aBoolean69 = true;
			if (this.aBoolean162) {
				return local10;
			}
			if (super.anInt773 != -1 && super.anInt774 != -1) {
				@Pc(45) Class15 local45 = Class15.aClass15Array1[super.anInt773];
				@Pc(61) Class1_Sub3_Sub1 local61 = new Class1_Sub3_Sub1(-428, true, local45.method292(), true, false, !local45.aBoolean102);
				local61.method212(0, 0, -super.anInt777);
				local61.method206();
				local61.method207(local45.aClass13_1.anIntArray130[super.anInt774]);
				local61.anIntArrayArray8 = null;
				local61.anIntArrayArray7 = null;
				local61.method216(64, 850, -30, -50, -30, true);
				@Pc(106) Class1_Sub3_Sub1[] local106 = new Class1_Sub3_Sub1[] { local10, local61 };
				local10 = new Class1_Sub3_Sub1(true, true, local106, 2);
			}
			if (this.aClass1_Sub3_Sub1_11 != null) {
				if (client.anInt132 >= this.anInt796) {
					this.aClass1_Sub3_Sub1_11 = null;
				}
				if (client.anInt132 >= this.anInt795 && client.anInt132 < this.anInt796) {
					@Pc(135) Class1_Sub3_Sub1 local135 = this.aClass1_Sub3_Sub1_11;
					local135.method212(this.anInt799 - super.anInt743, this.anInt797 - super.anInt742, this.anInt798 - this.anInt794);
					if (super.anInt787 == 512) {
						local135.method210();
						local135.method210();
						local135.method210();
					} else if (super.anInt787 == 1024) {
						local135.method210();
						local135.method210();
					} else if (super.anInt787 == 1536) {
						local135.method210();
					}
					@Pc(198) Class1_Sub3_Sub1[] local198 = new Class1_Sub3_Sub1[] { local10, local135 };
					local10 = new Class1_Sub3_Sub1(true, true, local198, 2);
					if (super.anInt787 == 512) {
						local135.method210();
					} else if (super.anInt787 == 1024) {
						local135.method210();
						local135.method210();
					} else if (super.anInt787 == 1536) {
						local135.method210();
						local135.method210();
						local135.method210();
					}
					local135.method212(super.anInt743 - this.anInt799, super.anInt742 - this.anInt797, this.anInt794 - this.anInt798);
				}
			}
			local10.aBoolean69 = true;
			return local10;
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("55673, " + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "c", descriptor = "(I)Lclient!eb;")
	private Class1_Sub3_Sub1 method518() {
		try {
			@Pc(4) long local4 = this.aLong24;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = -1;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = -1;
			if (super.anInt768 >= 0 && super.anInt771 == 0) {
				@Pc(33) Class13 local33 = Class13.aClass13Array1[super.anInt768];
				local6 = local33.anIntArray130[super.anInt769];
				if (super.anInt765 >= 0 && super.anInt765 != super.anInt747) {
					local8 = Class13.aClass13Array1[super.anInt765].anIntArray130[super.anInt766];
				}
				if (local33.anInt336 >= 0) {
					local10 = local33.anInt336;
					local4 += local10 - this.anIntArray215[5] << 8;
				}
				if (local33.anInt337 >= 0) {
					local12 = local33.anInt337;
					local4 += local12 - this.anIntArray215[3] << 16;
				}
			} else if (super.anInt765 >= 0) {
				local6 = Class13.aClass13Array1[super.anInt765].anIntArray130[super.anInt766];
			}
			@Pc(111) Class1_Sub3_Sub1 local111 = (Class1_Sub3_Sub1) aClass32_7.method470(local4);
			if (local111 == null) {
				@Pc(116) Class1_Sub3_Sub1[] local116 = new Class1_Sub3_Sub1[13];
				@Pc(118) int local118 = 0;
				@Pc(127) int local127;
				for (@Pc(120) int local120 = 0; local120 < 13; local120++) {
					local127 = this.anIntArray215[local120];
					if (local12 >= 0 && local120 == 3) {
						local127 = local12;
					}
					if (local10 >= 0 && local120 == 5) {
						local127 = local10;
					}
					if (local127 >= 256 && local127 < 512) {
						local116[local118++] = Class7.aClass7Array1[local127 - 256].method183();
					}
					if (local127 >= 512) {
						@Pc(165) Class41 local165 = Class41.method522(local127 - 512);
						@Pc(171) Class1_Sub3_Sub1 local171 = local165.method527(92, this.anInt791);
						if (local171 != null) {
							local116[local118++] = local171;
						}
					}
				}
				local111 = new Class1_Sub3_Sub1(false, local118, local116);
				for (local127 = 0; local127 < 5; local127++) {
					if (this.anIntArray216[local127] != 0) {
						local111.method213(client.anIntArrayArray6[local127][0], client.anIntArrayArray6[local127][this.anIntArray216[local127]]);
						if (local127 == 1) {
							local111.method213(client.anIntArray18[0], client.anIntArray18[this.anIntArray216[local127]]);
						}
					}
				}
				local111.method206();
				local111.method216(64, 850, -30, -50, -30, true);
				aClass32_7.method471(local4, 7, local111);
			}
			if (this.aBoolean162) {
				return local111;
			}
			@Pc(259) Class1_Sub3_Sub1 local259 = new Class1_Sub3_Sub1(false, true, local111);
			if (local6 != -1 && local8 != -1) {
				local259.method208(local6, Class13.aClass13Array1[super.anInt768].anIntArray133, local8);
			} else if (local6 != -1) {
				local259.method207(local6);
			}
			local259.method204();
			local259.anIntArrayArray8 = null;
			local259.anIntArrayArray7 = null;
			return local259;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("91890, " + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub3_Sub1 method519() {
		try {
			if (!this.aBoolean161) {
				return null;
			}
			@Pc(9) Class1_Sub3_Sub1[] local9 = new Class1_Sub3_Sub1[13];
			@Pc(11) int local11 = 0;
			for (@Pc(19) int local19 = 0; local19 < 13; local19++) {
				@Pc(26) int local26 = this.anIntArray215[local19];
				if (local26 >= 256 && local26 < 512) {
					local9[local11++] = Class7.aClass7Array1[local26 - 256].method184();
				}
				if (local26 >= 512) {
					@Pc(55) Class1_Sub3_Sub1 local55 = Class41.method522(local26 - 512).method528(this.anInt791);
					if (local55 != null) {
						local9[local11++] = local55;
					}
				}
			}
			@Pc(73) Class1_Sub3_Sub1 local73 = new Class1_Sub3_Sub1(false, local11, local9);
			for (@Pc(75) int local75 = 0; local75 < 5; local75++) {
				if (this.anIntArray216[local75] != 0) {
					local73.method213(client.anIntArrayArray6[local75][0], client.anIntArrayArray6[local75][this.anIntArray216[local75]]);
					if (local75 == 1) {
						local73.method213(client.anIntArray18[0], client.anIntArray18[this.anIntArray216[local75]]);
					}
				}
			}
			return local73;
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("46672, " + true + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method516() {
		try {
			return this.aBoolean161;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("53893, " + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
