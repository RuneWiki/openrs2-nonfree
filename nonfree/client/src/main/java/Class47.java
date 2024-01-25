import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class47 {

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	public int anInt1534;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	public int anInt1536;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	private int anInt1537;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "I")
	public int anInt1539;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "Lclient!mj;")
	public Class170 aClass170_1;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "I")
	private int anInt1546;

	@OriginalMember(owner = "client!co", name = "E", descriptor = "I")
	private int anInt1549;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!co", name = "I", descriptor = "I")
	private int anInt1552;

	@OriginalMember(owner = "client!co", name = "L", descriptor = "I")
	public int anInt1555;

	@OriginalMember(owner = "client!co", name = "M", descriptor = "I")
	public int anInt1556;

	@OriginalMember(owner = "client!co", name = "R", descriptor = "Lclient!bu;")
	private Class38 aClass38_5;

	@OriginalMember(owner = "client!co", name = "S", descriptor = "I")
	public int anInt1561;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "I")
	public int anInt1531 = -1;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "Z")
	public boolean aBoolean100 = true;

	@OriginalMember(owner = "client!co", name = "t", descriptor = "I")
	public int anInt1542 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "I")
	public int anInt1533 = -1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public int anInt1529 = 0;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "Z")
	public boolean aBoolean99 = true;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "I")
	public int anInt1541 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!co", name = "F", descriptor = "I")
	private int anInt1550 = -1;

	@OriginalMember(owner = "client!co", name = "u", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray8 = new String[5];

	@OriginalMember(owner = "client!co", name = "z", descriptor = "Z")
	public boolean aBoolean101 = false;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	private int anInt1532 = -1;

	@OriginalMember(owner = "client!co", name = "J", descriptor = "I")
	public int anInt1553 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	private int anInt1544 = -1;

	@OriginalMember(owner = "client!co", name = "N", descriptor = "I")
	private int anInt1557 = -1;

	@OriginalMember(owner = "client!co", name = "v", descriptor = "I")
	public int anInt1543 = -1;

	@OriginalMember(owner = "client!co", name = "O", descriptor = "I")
	private int anInt1558 = -1;

	@OriginalMember(owner = "client!co", name = "P", descriptor = "I")
	public int anInt1559 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!co", name = "T", descriptor = "Z")
	public boolean aBoolean102 = true;

	@OriginalMember(owner = "client!co", name = "Q", descriptor = "I")
	public int anInt1560 = -1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZZLclient!za;)Lclient!o;")
	public Class137 method1078(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class106 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt1533 : this.anInt1560;
		@Pc(24) int local24 = arg1.anInt7745 << 29 | local11;
		@Pc(33) Class137 local33 = (Class137) this.aClass170_1.aClass91_67.method1988((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass170_1.aClass211_64.method4761(local11)) {
			@Pc(53) Class266 local53 = Static470.method6054(this.aClass170_1.aClass211_64, local11, 0);
			if (local53 != null) {
				local33 = arg1.method5938(local53);
				this.aClass170_1.aClass91_67.method1990(local33, (long) local24);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public void method1079() {
		if (this.anIntArray135 == null) {
			return;
		}
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray135.length; local8 += 2) {
			if (this.anIntArray135[local8] < this.anInt1541) {
				this.anInt1541 = this.anIntArray135[local8];
			} else if (this.anInt1542 < this.anIntArray135[local8]) {
				this.anInt1542 = this.anIntArray135[local8];
			}
			if (this.anInt1559 > this.anIntArray135[local8 + 1]) {
				this.anInt1559 = this.anIntArray135[local8 + 1];
			} else if (this.anInt1553 < this.anIntArray135[local8 + 1]) {
				this.anInt1553 = this.anIntArray135[local8 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method1080(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1171();
			if (local10 == 0) {
				return;
			}
			this.method1086(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!im;I)Z")
	public boolean method1081(@OriginalArg(0) Interface4 arg0) {
		@Pc(22) int local22;
		if (this.anInt1558 == -1) {
			if (this.anInt1532 == -1) {
				return true;
			}
			local22 = arg0.method4299(this.anInt1532);
		} else {
			local22 = arg0.method4300(this.anInt1558);
		}
		if (this.anInt1549 > local22 || this.anInt1552 < local22) {
			return false;
		}
		@Pc(68) int local68;
		if (this.anInt1557 == -1) {
			if (this.anInt1550 == -1) {
				return true;
			}
			local68 = arg0.method4299(this.anInt1550);
		} else {
			local68 = arg0.method4300(this.anInt1557);
		}
		return local68 >= this.anInt1546 && local68 <= this.anInt1537;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method1082(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass38_5 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub44 local16 = (Class1_Sub44) this.aClass38_5.method765((long) arg0);
			return local16 == null ? arg1 : local16.aString66;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!za;I)Lclient!o;")
	public Class137 method1085(@OriginalArg(0) Class106 arg0) {
		@Pc(20) Class137 local20 = (Class137) this.aClass170_1.aClass91_67.method1988((long) (this.anInt1544 | 0x20000 | arg0.anInt7745 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass170_1.aClass211_64.method4761(this.anInt1544);
		@Pc(47) Class266 local47 = Static470.method6054(this.aClass170_1.aClass211_64, this.anInt1544, 0);
		if (local47 != null) {
			local20 = arg0.method5938(local47);
			this.aClass170_1.aClass91_67.method1990(local20, (long) (arg0.anInt7745 << 29 | this.anInt1544 | 0x20000));
		}
		return local20;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!ia;)V")
	private void method1086(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt1560 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt1533 = arg1.method1177();
		} else if (arg0 == 3) {
			this.aString11 = arg1.method1201();
		} else if (arg0 == 4) {
			this.anInt1539 = arg1.method1226();
		} else if (arg0 == 5) {
			this.anInt1543 = arg1.method1226();
		} else if (arg0 == 6) {
			this.anInt1529 = arg1.method1171();
		} else {
			@Pc(56) int local56;
			if (arg0 == 7) {
				local56 = arg1.method1171();
				if ((local56 & 0x2) == 2) {
					this.aBoolean101 = true;
				}
				if ((local56 & 0x1) == 0) {
					this.aBoolean102 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean100 = arg1.method1171() == 1;
			} else if (arg0 == 9) {
				this.anInt1532 = arg1.method1177();
				if (this.anInt1532 == 65535) {
					this.anInt1532 = -1;
				}
				this.anInt1558 = arg1.method1177();
				if (this.anInt1558 == 65535) {
					this.anInt1558 = -1;
				}
				this.anInt1549 = arg1.method1188();
				this.anInt1552 = arg1.method1188();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray8[arg0 - 10] = arg1.method1201();
			} else {
				@Pc(150) int local150;
				if (arg0 == 15) {
					local56 = arg1.method1171();
					this.anIntArray135 = new int[local56 * 2];
					for (local150 = 0; local150 < local56 * 2; local150++) {
						this.anIntArray135[local150] = arg1.method1215();
					}
					this.anInt1556 = arg1.method1188();
					this.anInt1536 = arg1.method1188();
				} else if (arg0 == 16) {
					this.aBoolean99 = false;
				} else if (arg0 == 17) {
					this.aString12 = arg1.method1201();
				} else if (arg0 == 18) {
					this.anInt1544 = arg1.method1177();
				} else if (arg0 == 19) {
					this.anInt1531 = arg1.method1177();
				} else if (arg0 == 20) {
					this.anInt1550 = arg1.method1177();
					if (this.anInt1550 == 65535) {
						this.anInt1550 = -1;
					}
					this.anInt1557 = arg1.method1177();
					if (this.anInt1557 == 65535) {
						this.anInt1557 = -1;
					}
					this.anInt1546 = arg1.method1188();
					this.anInt1537 = arg1.method1188();
				} else if (arg0 == 21) {
					this.anInt1561 = arg1.method1188();
				} else if (arg0 == 22) {
					this.anInt1555 = arg1.method1188();
				} else if (arg0 == 249) {
					local56 = arg1.method1171();
					if (this.aClass38_5 == null) {
						local150 = Static427.method5762(local56);
						this.aClass38_5 = new Class38(local150);
					}
					for (local150 = 0; local150 < local56; local150++) {
						@Pc(262) boolean local262 = arg1.method1171() == 1;
						@Pc(266) int local266 = arg1.method1226();
						@Pc(275) Class1 local275;
						if (local262) {
							local275 = new Class1_Sub44(arg1.method1201());
						} else {
							local275 = new Class1_Sub33(arg1.method1188());
						}
						this.aClass38_5.method766(local275, (long) local266);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)I")
	public int method1087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass38_5 == null) {
			return arg1;
		} else {
			@Pc(24) Class1_Sub33 local24 = (Class1_Sub33) this.aClass38_5.method765((long) arg0);
			return local24 == null ? arg1 : local24.anInt5633;
		}
	}
}
