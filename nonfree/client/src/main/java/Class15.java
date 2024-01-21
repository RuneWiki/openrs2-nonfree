import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hc")
public final class Class15 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public static int anInt603;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
	private static int[] anIntArray175;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "[Lclient!hc;")
	private static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	private static int anInt604;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Z")
	private static boolean aBoolean145 = true;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Z")
	public static boolean aBoolean146 = true;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "Lclient!t;")
	public static Class42 aClass42_7 = new Class42(0, 50);

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "Lclient!t;")
	public static Class42 aClass42_8 = new Class42(0, 100);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public int anInt607;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
	private int anInt613;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "Z")
	public boolean aBoolean147;

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "Z")
	public boolean aBoolean148;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray10;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
	private int anInt616;

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "B")
	private byte aByte24;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
	private int anInt617;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "B")
	private byte aByte25;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
	private int anInt619;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
	private int anInt620;

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
	private int anInt621;

	@OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
	private int anInt622;

	@OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
	private int anInt623;

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
	private int anInt624;

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
	private int anInt625;

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public int anInt605 = -1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method343(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_9 = new Class1_Sub1_Sub3(arg0.method678("obj.dat", null), 337);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("obj.idx", null), 337);
		anInt603 = local19.method500();
		anIntArray175 = new int[anInt603];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt603; local29++) {
			anIntArray175[local29] = local27;
			local27 += local19.method500();
		}
		aClass15Array1 = new Class15[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass15Array1[local49] = new Class15();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	public static void method344() {
		try {
			aClass42_7 = null;
			aClass42_8 = null;
			anIntArray175 = null;
			aClass15Array1 = null;
			aClass1_Sub1_Sub3_9 = null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("63954, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lclient!hc;")
	public static Class15 method345(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass15Array1[local1].anInt605 == arg0) {
				return aClass15Array1[local1];
			}
		}
		anInt604 = (anInt604 + 1) % 10;
		@Pc(27) Class15 local27 = aClass15Array1[anInt604];
		aClass1_Sub1_Sub3_9.anInt768 = anIntArray175[arg0];
		local27.anInt605 = arg0;
		local27.method346();
		local27.method347(aClass1_Sub1_Sub3_9);
		if (local27.anInt626 != -1) {
			local27.method348();
		}
		if (!aBoolean146 && local27.aBoolean148) {
			local27.aString26 = "Members Object";
			local27.aByteArray6 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray9 = null;
			local27.aStringArray10 = null;
		}
		return local27;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)Lclient!jb;")
	public static Class1_Sub1_Sub2_Sub2 method351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(9) Class1_Sub1_Sub2_Sub2 local9;
			if (arg0 == 0) {
				local9 = (Class1_Sub1_Sub2_Sub2) aClass42_8.method641((long) arg2);
				if (local9 != null && local9.anInt684 != arg1 && local9.anInt684 != -1) {
					local9.method669();
					local9 = null;
				}
				if (local9 != null) {
					return local9;
				}
			}
			@Pc(30) Class15 local30 = method345(arg2);
			if (local30.anIntArray178 == null) {
				arg1 = -1;
			}
			if (arg1 > 1) {
				@Pc(40) int local40 = -1;
				for (@Pc(42) int local42 = 0; local42 < 10; local42++) {
					if (arg1 >= local30.anIntArray179[local42] && local30.anIntArray179[local42] != 0) {
						local40 = local30.anIntArray178[local42];
					}
				}
				if (local40 != -1) {
					local30 = method345(local40);
				}
			}
			@Pc(74) Class1_Sub1_Sub1_Sub5 local74 = local30.method349(1);
			if (local74 == null) {
				return null;
			}
			@Pc(80) Class1_Sub1_Sub2_Sub2 local80 = null;
			if (local30.anInt626 != -1) {
				local80 = method351(-1, 10, local30.anInt625);
				if (local80 == null) {
					return null;
				}
			}
			local9 = new Class1_Sub1_Sub2_Sub2(32, 32);
			@Pc(103) int local103 = Class1_Sub1_Sub2_Sub1.anInt654;
			@Pc(105) int local105 = Class1_Sub1_Sub2_Sub1.anInt655;
			@Pc(107) int[] local107 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			@Pc(109) int[] local109 = Class1_Sub1_Sub2.anIntArray213;
			@Pc(111) int local111 = Class1_Sub1_Sub2.anInt734;
			@Pc(113) int local113 = Class1_Sub1_Sub2.anInt735;
			@Pc(115) int local115 = Class1_Sub1_Sub2.anInt738;
			@Pc(117) int local117 = Class1_Sub1_Sub2.anInt739;
			@Pc(119) int local119 = Class1_Sub1_Sub2.anInt736;
			@Pc(121) int local121 = Class1_Sub1_Sub2.anInt737;
			Class1_Sub1_Sub2_Sub1.aBoolean157 = false;
			Class1_Sub1_Sub2.method453(local9.anIntArray210, 32, 32);
			Class1_Sub1_Sub2.method458(32, 0, 0, 32, 0);
			Class1_Sub1_Sub2_Sub1.method371();
			@Pc(141) int local141 = local30.anInt607;
			if (arg0 == -1) {
				local141 = (int) ((double) local141 * 1.5D);
			}
			if (arg0 > 0) {
				local141 = (int) ((double) local141 * 1.04D);
			}
			@Pc(167) int local167 = Class1_Sub1_Sub2_Sub1.anIntArray183[local30.anInt608] * local141 >> 16;
			@Pc(176) int local176 = Class1_Sub1_Sub2_Sub1.anIntArray184[local30.anInt608] * local141 >> 16;
			local74.method308(local30.anInt609, local30.anInt610, local30.anInt608, local30.anInt611, local167 + local74.anInt560 / 2 + local30.anInt612, local176 + local30.anInt612);
			for (@Pc(202) int local202 = 31; local202 >= 0; local202--) {
				for (local176 = 31; local176 >= 0; local176--) {
					if (local9.anIntArray210[local202 + local176 * 32] == 0) {
						if (local202 > 0 && local9.anIntArray210[local202 + local176 * 32 - 1] > 1) {
							local9.anIntArray210[local202 + local176 * 32] = 1;
						} else if (local176 > 0 && local9.anIntArray210[local202 + (local176 - 1) * 32] > 1) {
							local9.anIntArray210[local202 + local176 * 32] = 1;
						} else if (local202 < 31 && local9.anIntArray210[local202 + local176 * 32 + 1] > 1) {
							local9.anIntArray210[local202 + local176 * 32] = 1;
						} else if (local176 < 31 && local9.anIntArray210[local202 + (local176 + 1) * 32] > 1) {
							local9.anIntArray210[local202 + local176 * 32] = 1;
						}
					}
				}
			}
			@Pc(327) int local327;
			if (arg0 > 0) {
				for (local327 = 31; local327 >= 0; local327--) {
					for (local176 = 31; local176 >= 0; local176--) {
						if (local9.anIntArray210[local327 + local176 * 32] == 0) {
							if (local327 > 0 && local9.anIntArray210[local327 + local176 * 32 - 1] == 1) {
								local9.anIntArray210[local327 + local176 * 32] = arg0;
							} else if (local176 > 0 && local9.anIntArray210[local327 + (local176 - 1) * 32] == 1) {
								local9.anIntArray210[local327 + local176 * 32] = arg0;
							} else if (local327 < 31 && local9.anIntArray210[local327 + local176 * 32 + 1] == 1) {
								local9.anIntArray210[local327 + local176 * 32] = arg0;
							} else if (local176 < 31 && local9.anIntArray210[local327 + (local176 + 1) * 32] == 1) {
								local9.anIntArray210[local327 + local176 * 32] = arg0;
							}
						}
					}
				}
			} else if (arg0 == 0) {
				for (local327 = 31; local327 >= 0; local327--) {
					for (local176 = 31; local176 >= 0; local176--) {
						if (local9.anIntArray210[local327 + local176 * 32] == 0 && local327 > 0 && local176 > 0 && local9.anIntArray210[local327 + (local176 - 1) * 32 - 1] > 0) {
							local9.anIntArray210[local327 + local176 * 32] = 3153952;
						}
					}
				}
			}
			if (local30.anInt626 != -1) {
				local327 = local80.anInt683;
				@Pc(511) int local511 = local80.anInt684;
				local80.anInt683 = 32;
				local80.anInt684 = 32;
				local80.method406(0, 0);
				local80.anInt683 = local327;
				local80.anInt684 = local511;
			}
			if (arg0 == 0) {
				aClass42_8.method642((long) arg2, local9);
			}
			Class1_Sub1_Sub2.method453(local109, local111, local113);
			Class1_Sub1_Sub2.method455(local115, local117, local121, local119, aBoolean145);
			Class1_Sub1_Sub2_Sub1.anInt654 = local103;
			Class1_Sub1_Sub2_Sub1.anInt655 = local105;
			Class1_Sub1_Sub2_Sub1.anIntArray185 = local107;
			Class1_Sub1_Sub2_Sub1.aBoolean157 = true;
			if (local30.aBoolean147) {
				local9.anInt683 = 33;
			} else {
				local9.anInt683 = 32;
			}
			local9.anInt684 = arg1;
			return local9;
		} catch (@Pc(581) RuntimeException local581) {
			signlink.reporterror("99523, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local581.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
	private void method346() {
		this.anInt606 = 0;
		this.aString26 = null;
		this.aByteArray6 = null;
		this.anIntArray176 = null;
		this.anIntArray177 = null;
		this.anInt607 = 2000;
		this.anInt608 = 0;
		this.anInt609 = 0;
		this.anInt610 = 0;
		this.anInt611 = 0;
		this.anInt612 = 0;
		this.anInt613 = -1;
		this.aBoolean147 = false;
		this.anInt614 = 1;
		this.aBoolean148 = false;
		this.aStringArray9 = null;
		this.aStringArray10 = null;
		this.anInt615 = -1;
		this.anInt616 = -1;
		this.aByte24 = 0;
		this.anInt617 = -1;
		this.anInt618 = -1;
		this.aByte25 = 0;
		this.anInt619 = -1;
		this.anInt620 = -1;
		this.anInt621 = -1;
		this.anInt622 = -1;
		this.anInt623 = -1;
		this.anInt624 = -1;
		this.anIntArray178 = null;
		this.anIntArray179 = null;
		this.anInt625 = -1;
		this.anInt626 = -1;
		this.anInt627 = 128;
		this.anInt628 = 128;
		this.anInt629 = 128;
		this.anInt630 = 0;
		this.anInt631 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method347(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method498();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt606 = arg0.method500();
				} else if (local10 == 2) {
					this.aString26 = arg0.method505();
				} else if (local10 == 3) {
					this.aByteArray6 = arg0.method506();
				} else if (local10 == 4) {
					this.anInt607 = arg0.method500();
				} else if (local10 == 5) {
					this.anInt608 = arg0.method500();
				} else if (local10 == 6) {
					this.anInt609 = arg0.method500();
				} else if (local10 == 7) {
					this.anInt611 = arg0.method500();
					if (this.anInt611 > 32767) {
						this.anInt611 -= 65536;
					}
				} else if (local10 == 8) {
					this.anInt612 = arg0.method500();
					if (this.anInt612 > 32767) {
						this.anInt612 -= 65536;
					}
				} else if (local10 == 10) {
					this.anInt613 = arg0.method500();
				} else if (local10 == 11) {
					this.aBoolean147 = true;
				} else if (local10 == 12) {
					this.anInt614 = arg0.method503();
				} else if (local10 == 16) {
					this.aBoolean148 = true;
				} else if (local10 == 23) {
					this.anInt615 = arg0.method500();
					this.aByte24 = arg0.method499();
				} else if (local10 == 24) {
					this.anInt616 = arg0.method500();
				} else if (local10 == 25) {
					this.anInt617 = arg0.method500();
					this.aByte25 = arg0.method499();
				} else if (local10 == 26) {
					this.anInt618 = arg0.method500();
				} else if (local10 >= 30 && local10 < 35) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local10 - 30] = arg0.method505();
					if (this.aStringArray9[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local10 - 30] = null;
					}
				} else if (local10 >= 35 && local10 < 40) {
					if (this.aStringArray10 == null) {
						this.aStringArray10 = new String[5];
					}
					this.aStringArray10[local10 - 35] = arg0.method505();
				} else if (local10 == 40) {
					@Pc(252) int local252 = arg0.method498();
					this.anIntArray176 = new int[local252];
					this.anIntArray177 = new int[local252];
					for (@Pc(262) int local262 = 0; local262 < local252; local262++) {
						this.anIntArray176[local262] = arg0.method500();
						this.anIntArray177[local262] = arg0.method500();
					}
				} else if (local10 == 78) {
					this.anInt619 = arg0.method500();
				} else if (local10 == 79) {
					this.anInt620 = arg0.method500();
				} else if (local10 == 90) {
					this.anInt621 = arg0.method500();
				} else if (local10 == 91) {
					this.anInt623 = arg0.method500();
				} else if (local10 == 92) {
					this.anInt622 = arg0.method500();
				} else if (local10 == 93) {
					this.anInt624 = arg0.method500();
				} else if (local10 == 95) {
					this.anInt610 = arg0.method500();
				} else if (local10 == 97) {
					this.anInt625 = arg0.method500();
				} else if (local10 == 98) {
					this.anInt626 = arg0.method500();
				} else if (local10 >= 100 && local10 < 110) {
					if (this.anIntArray178 == null) {
						this.anIntArray178 = new int[10];
						this.anIntArray179 = new int[10];
					}
					this.anIntArray178[local10 - 100] = arg0.method500();
					this.anIntArray179[local10 - 100] = arg0.method500();
				} else if (local10 == 110) {
					this.anInt627 = arg0.method500();
				} else if (local10 == 111) {
					this.anInt628 = arg0.method500();
				} else if (local10 == 112) {
					this.anInt629 = arg0.method500();
				} else if (local10 == 113) {
					this.anInt630 = arg0.method499();
				} else if (local10 == 114) {
					this.anInt631 = arg0.method499() * 5;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("14503, " + 0 + ", " + arg0 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
	private void method348() {
		try {
			@Pc(3) Class15 local3 = method345(this.anInt626);
			this.anInt606 = local3.anInt606;
			this.anInt607 = local3.anInt607;
			this.anInt608 = local3.anInt608;
			this.anInt609 = local3.anInt609;
			this.anInt610 = local3.anInt610;
			this.anInt611 = local3.anInt611;
			this.anInt612 = local3.anInt612;
			this.anIntArray176 = local3.anIntArray176;
			this.anIntArray177 = local3.anIntArray177;
			@Pc(52) Class15 local52 = method345(this.anInt625);
			this.aString26 = local52.aString26;
			this.aBoolean148 = local52.aBoolean148;
			this.anInt614 = local52.anInt614;
			@Pc(66) String local66 = "a";
			@Pc(71) char local71 = local52.aString26.charAt(0);
			if (local71 == 'A' || local71 == 'E' || local71 == 'I' || local71 == 'O' || local71 == 'U') {
				local66 = "an";
			}
			this.aByteArray6 = ("Swap this note at any bank for " + local66 + " " + local52.aString26 + ".").getBytes();
			this.aBoolean147 = true;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("73732, " + true + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method349(@OriginalArg(0) int arg0) {
		@Pc(11) int local11;
		if (this.anIntArray178 != null && arg0 > 1) {
			@Pc(9) int local9 = -1;
			for (local11 = 0; local11 < 10; local11++) {
				if (arg0 >= this.anIntArray179[local11] && this.anIntArray179[local11] != 0) {
					local9 = this.anIntArray178[local11];
				}
			}
			if (local9 != -1) {
				return method345(local9).method349(1);
			}
		}
		@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = (Class1_Sub1_Sub1_Sub5) aClass42_7.method641((long) this.anInt605);
		if (local48 != null) {
			return local48;
		}
		local48 = Class1_Sub1_Sub1_Sub5.method288(this.anInt606);
		if (local48 == null) {
			return null;
		}
		if (this.anInt627 != 128 || this.anInt628 != 128 || this.anInt629 != 128) {
			local48.method304(this.anInt629, this.anInt628, this.anInt627);
		}
		if (this.anIntArray176 != null) {
			for (local11 = 0; local11 < this.anIntArray176.length; local11++) {
				local48.method302(this.anIntArray176[local11], this.anIntArray177[local11]);
			}
		}
		local48.method305(this.anInt630 + 64, this.anInt631 + 768, -50, -10, -50, true);
		local48.aBoolean130 = true;
		aClass42_7.method642((long) this.anInt605, local48);
		return local48;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method350(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int local11;
			if (this.anIntArray178 != null && arg0 > 1) {
				@Pc(9) int local9 = -1;
				for (local11 = 0; local11 < 10; local11++) {
					if (arg0 >= this.anIntArray179[local11] && this.anIntArray179[local11] != 0) {
						local9 = this.anIntArray178[local11];
					}
				}
				if (local9 != -1) {
					return method345(local9).method350(1);
				}
			}
			@Pc(47) Class1_Sub1_Sub1_Sub5 local47 = Class1_Sub1_Sub1_Sub5.method288(this.anInt606);
			if (local47 == null) {
				return null;
			}
			if (this.anIntArray176 != null) {
				for (local11 = 0; local11 < this.anIntArray176.length; local11++) {
					local47.method302(this.anIntArray176[local11], this.anIntArray177[local11]);
				}
			}
			return local47;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("20988, " + arg0 + ", " + 414 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)Z")
	public boolean method352(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt615;
			@Pc(5) int local5 = this.anInt616;
			@Pc(8) int local8 = this.anInt619;
			if (arg0 == 1) {
				local2 = this.anInt617;
				local5 = this.anInt618;
				local8 = this.anInt620;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(33) boolean local33 = true;
			if (!Class1_Sub1_Sub1_Sub5.method289(local2)) {
				local33 = false;
			}
			if (local5 != -1 && !Class1_Sub1_Sub1_Sub5.method289(local5)) {
				local33 = false;
			}
			if (local8 != -1 && !Class1_Sub1_Sub1_Sub5.method289(local8)) {
				local33 = false;
			}
			return local33;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("1854, " + 0 + ", " + arg0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method353(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) int local10 = this.anInt615;
			@Pc(13) int local13 = this.anInt616;
			@Pc(16) int local16 = this.anInt619;
			if (arg0 == 1) {
				local10 = this.anInt617;
				local13 = this.anInt618;
				local16 = this.anInt620;
			}
			if (local10 == -1) {
				return null;
			}
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = Class1_Sub1_Sub1_Sub5.method288(local10);
			if (local13 != -1) {
				@Pc(47) Class1_Sub1_Sub1_Sub5 local47;
				if (local16 == -1) {
					local47 = Class1_Sub1_Sub1_Sub5.method288(local13);
					@Pc(90) Class1_Sub1_Sub1_Sub5[] local90 = new Class1_Sub1_Sub1_Sub5[] { local37, local47 };
					local37 = new Class1_Sub1_Sub1_Sub5((byte) 1, 2, local90);
				} else {
					local47 = Class1_Sub1_Sub1_Sub5.method288(local13);
					@Pc(51) Class1_Sub1_Sub1_Sub5 local51 = Class1_Sub1_Sub1_Sub5.method288(local16);
					@Pc(66) Class1_Sub1_Sub1_Sub5[] local66 = new Class1_Sub1_Sub1_Sub5[] { local37, local47, local51 };
					local37 = new Class1_Sub1_Sub1_Sub5((byte) 1, 3, local66);
				}
			}
			if (arg0 == 0 && this.aByte24 != 0) {
				local37.method301(0, this.aByte24, 0);
			}
			if (arg0 == 1 && this.aByte25 != 0) {
				local37.method301(0, this.aByte25, 0);
			}
			if (this.anIntArray176 != null) {
				for (@Pc(127) int local127 = 0; local127 < this.anIntArray176.length; local127++) {
					local37.method302(this.anIntArray176[local127], this.anIntArray177[local127]);
				}
			}
			return local37;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("35223, " + arg0 + ", " + 0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Z")
	public boolean method354(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(2) int local2 = this.anInt621;
			@Pc(5) int local5 = this.anInt622;
			@Pc(10) boolean local10 = false;
			if (arg0 == 1) {
				local2 = this.anInt623;
				local5 = this.anInt624;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(32) boolean local32 = true;
			if (!Class1_Sub1_Sub1_Sub5.method289(local2)) {
				local32 = false;
			}
			if (local5 != -1 && !Class1_Sub1_Sub1_Sub5.method289(local5)) {
				local32 = false;
			}
			return local32;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("51638, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method355(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt621;
			@Pc(5) int local5 = this.anInt622;
			if (arg0 == 1) {
				local2 = this.anInt623;
				local5 = this.anInt624;
			}
			if (local2 == -1) {
				return null;
			}
			@Pc(29) Class1_Sub1_Sub1_Sub5 local29 = Class1_Sub1_Sub1_Sub5.method288(local2);
			if (local5 != -1) {
				@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = Class1_Sub1_Sub1_Sub5.method288(local5);
				@Pc(47) Class1_Sub1_Sub1_Sub5[] local47 = new Class1_Sub1_Sub1_Sub5[] { local29, local36 };
				local29 = new Class1_Sub1_Sub1_Sub5((byte) 1, 2, local47);
			}
			if (this.anIntArray176 != null) {
				for (@Pc(59) int local59 = 0; local59 < this.anIntArray176.length; local59++) {
					local29.method302(this.anIntArray176[local59], this.anIntArray177[local59]);
				}
			}
			return local29;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("93409, " + -40349 + ", " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}
}
