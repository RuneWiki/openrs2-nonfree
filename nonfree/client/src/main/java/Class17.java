import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ic")
public final class Class17 {

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt623;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
	private static int[] anIntArray201;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "[Lclient!ic;")
	private static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	private static int anInt624;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	private static int anInt621 = -24;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Z")
	private static boolean aBoolean153 = true;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Z")
	public static boolean aBoolean154 = true;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!s;")
	public static Class39 aClass39_7 = new Class39(50, false);

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "Lclient!s;")
	public static Class39 aClass39_8 = new Class39(100, false);

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
	private int anInt632;

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
	private int anInt633;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "Z")
	public boolean aBoolean156;

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray10;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray11;

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "B")
	private byte aByte27;

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
	private int anInt637;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "B")
	private byte aByte28;

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	private int anInt646;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
	private int anInt650;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
	private int anInt651;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	private int anInt622 = 5;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	public int anInt625 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method383(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_7 = new Class1_Sub1_Sub3(arg0.method689("obj.dat", null), true);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method689("obj.idx", null), true);
		anInt623 = local19.method505();
		anIntArray201 = new int[anInt623];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt623; local29++) {
			anIntArray201[local29] = local27;
			local27 += local19.method505();
		}
		aClass17Array1 = new Class17[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass17Array1[local49] = new Class17();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method384() {
		try {
			aClass39_7 = null;
			aClass39_8 = null;
			anIntArray201 = null;
			aClass17Array1 = null;
			aClass1_Sub1_Sub3_7 = null;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("55141, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Lclient!ic;")
	public static Class17 method385(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass17Array1[local1].anInt625 == arg0) {
				return aClass17Array1[local1];
			}
		}
		anInt624 = (anInt624 + 1) % 10;
		@Pc(27) Class17 local27 = aClass17Array1[anInt624];
		aClass1_Sub1_Sub3_7.anInt766 = anIntArray201[arg0];
		local27.anInt625 = arg0;
		local27.method386();
		local27.method387(aClass1_Sub1_Sub3_7);
		if (local27.anInt646 != -1) {
			local27.method388();
		}
		if (!aBoolean154 && local27.aBoolean156) {
			local27.aString25 = "Members Object";
			local27.aByteArray6 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray10 = null;
			local27.aStringArray11 = null;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIII)Lclient!ib;")
	public static Class1_Sub1_Sub2_Sub2 method391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) Class1_Sub1_Sub2_Sub2 local9;
			if (arg0 == 0) {
				local9 = (Class1_Sub1_Sub2_Sub2) aClass39_8.method604((long) arg1);
				if (local9 != null && local9.anInt620 != arg2 && local9.anInt620 != -1) {
					local9.method690();
					local9 = null;
				}
				if (local9 != null) {
					return local9;
				}
			}
			@Pc(30) Class17 local30 = method385(arg1);
			if (local30.anIntArray204 == null) {
				arg2 = -1;
			}
			if (arg2 > 1) {
				@Pc(40) int local40 = -1;
				for (@Pc(42) int local42 = 0; local42 < 10; local42++) {
					if (arg2 >= local30.anIntArray205[local42] && local30.anIntArray205[local42] != 0) {
						local40 = local30.anIntArray204[local42];
					}
				}
				if (local40 != -1) {
					local30 = method385(local40);
				}
			}
			@Pc(74) Class1_Sub1_Sub1_Sub5 local74 = local30.method389(1);
			if (local74 == null) {
				return null;
			}
			@Pc(80) Class1_Sub1_Sub2_Sub2 local80 = null;
			if (local30.anInt646 != -1) {
				local80 = method391(-1, local30.anInt645, 10);
				if (local80 == null) {
					return null;
				}
			}
			local9 = new Class1_Sub1_Sub2_Sub2(32, 32);
			@Pc(113) int local113 = Class1_Sub1_Sub2_Sub1.anInt572;
			@Pc(115) int local115 = Class1_Sub1_Sub2_Sub1.anInt573;
			@Pc(117) int[] local117 = Class1_Sub1_Sub2_Sub1.anIntArray172;
			@Pc(119) int[] local119 = Class1_Sub1_Sub2.anIntArray218;
			@Pc(121) int local121 = Class1_Sub1_Sub2.anInt721;
			@Pc(123) int local123 = Class1_Sub1_Sub2.anInt722;
			@Pc(125) int local125 = Class1_Sub1_Sub2.anInt725;
			@Pc(127) int local127 = Class1_Sub1_Sub2.anInt726;
			@Pc(129) int local129 = Class1_Sub1_Sub2.anInt723;
			@Pc(131) int local131 = Class1_Sub1_Sub2.anInt724;
			Class1_Sub1_Sub2_Sub1.aBoolean144 = false;
			Class1_Sub1_Sub2.method457(anInt621, local9.anIntArray200, 32, 32);
			Class1_Sub1_Sub2.method462(32, 0, 0, 32, 0);
			Class1_Sub1_Sub2_Sub1.method334();
			@Pc(151) int local151 = local30.anInt627;
			if (arg0 == -1) {
				local151 = (int) ((double) local151 * 1.5D);
			}
			if (arg0 > 0) {
				local151 = (int) ((double) local151 * 1.04D);
			}
			@Pc(177) int local177 = Class1_Sub1_Sub2_Sub1.anIntArray170[local30.anInt628] * local151 >> 16;
			@Pc(186) int local186 = Class1_Sub1_Sub2_Sub1.anIntArray171[local30.anInt628] * local151 >> 16;
			local74.method276(local30.anInt629, local30.anInt630, local30.anInt628, local30.anInt631, local177 + local74.anInt992 / 2 + local30.anInt632, local186 + local30.anInt632);
			for (@Pc(212) int local212 = 31; local212 >= 0; local212--) {
				for (local186 = 31; local186 >= 0; local186--) {
					if (local9.anIntArray200[local212 + local186 * 32] == 0) {
						if (local212 > 0 && local9.anIntArray200[local212 + local186 * 32 - 1] > 1) {
							local9.anIntArray200[local212 + local186 * 32] = 1;
						} else if (local186 > 0 && local9.anIntArray200[local212 + (local186 - 1) * 32] > 1) {
							local9.anIntArray200[local212 + local186 * 32] = 1;
						} else if (local212 < 31 && local9.anIntArray200[local212 + local186 * 32 + 1] > 1) {
							local9.anIntArray200[local212 + local186 * 32] = 1;
						} else if (local186 < 31 && local9.anIntArray200[local212 + (local186 + 1) * 32] > 1) {
							local9.anIntArray200[local212 + local186 * 32] = 1;
						}
					}
				}
			}
			@Pc(337) int local337;
			if (arg0 > 0) {
				for (local337 = 31; local337 >= 0; local337--) {
					for (local186 = 31; local186 >= 0; local186--) {
						if (local9.anIntArray200[local337 + local186 * 32] == 0) {
							if (local337 > 0 && local9.anIntArray200[local337 + local186 * 32 - 1] == 1) {
								local9.anIntArray200[local337 + local186 * 32] = arg0;
							} else if (local186 > 0 && local9.anIntArray200[local337 + (local186 - 1) * 32] == 1) {
								local9.anIntArray200[local337 + local186 * 32] = arg0;
							} else if (local337 < 31 && local9.anIntArray200[local337 + local186 * 32 + 1] == 1) {
								local9.anIntArray200[local337 + local186 * 32] = arg0;
							} else if (local186 < 31 && local9.anIntArray200[local337 + (local186 + 1) * 32] == 1) {
								local9.anIntArray200[local337 + local186 * 32] = arg0;
							}
						}
					}
				}
			} else if (arg0 == 0) {
				for (local337 = 31; local337 >= 0; local337--) {
					for (local186 = 31; local186 >= 0; local186--) {
						if (local9.anIntArray200[local337 + local186 * 32] == 0 && local337 > 0 && local186 > 0 && local9.anIntArray200[local337 + (local186 - 1) * 32 - 1] > 0) {
							local9.anIntArray200[local337 + local186 * 32] = 3153952;
						}
					}
				}
			}
			if (local30.anInt646 != -1) {
				local337 = local80.anInt619;
				@Pc(521) int local521 = local80.anInt620;
				local80.anInt619 = 32;
				local80.anInt620 = 32;
				local80.method375(0, 0);
				local80.anInt619 = local337;
				local80.anInt620 = local521;
			}
			if (arg0 == 0) {
				aClass39_8.method605(local9, (long) arg1);
			}
			Class1_Sub1_Sub2.method457(anInt621, local119, local121, local123);
			Class1_Sub1_Sub2.method459(local131, local129, local125, local127);
			Class1_Sub1_Sub2_Sub1.anInt572 = local113;
			Class1_Sub1_Sub2_Sub1.anInt573 = local115;
			Class1_Sub1_Sub2_Sub1.anIntArray172 = local117;
			Class1_Sub1_Sub2_Sub1.aBoolean144 = true;
			if (local30.aBoolean155) {
				local9.anInt619 = 33;
			} else {
				local9.anInt619 = 32;
			}
			local9.anInt620 = arg2;
			return local9;
		} catch (@Pc(582) RuntimeException local582) {
			signlink.reporterror("86874, " + -7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local582.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	private Class17() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	private void method386() {
		this.anInt626 = 0;
		this.aString25 = null;
		this.aByteArray6 = null;
		this.anIntArray202 = null;
		this.anIntArray203 = null;
		this.anInt627 = 2000;
		this.anInt628 = 0;
		this.anInt629 = 0;
		this.anInt630 = 0;
		this.anInt631 = 0;
		this.anInt632 = 0;
		this.anInt633 = -1;
		this.aBoolean155 = false;
		this.anInt634 = 1;
		this.aBoolean156 = false;
		this.aStringArray10 = null;
		this.aStringArray11 = null;
		this.anInt635 = -1;
		this.anInt636 = -1;
		this.aByte27 = 0;
		this.anInt637 = -1;
		this.anInt638 = -1;
		this.aByte28 = 0;
		this.anInt639 = -1;
		this.anInt640 = -1;
		this.anInt641 = -1;
		this.anInt642 = -1;
		this.anInt643 = -1;
		this.anInt644 = -1;
		this.anIntArray204 = null;
		this.anIntArray205 = null;
		this.anInt645 = -1;
		this.anInt646 = -1;
		this.anInt647 = 128;
		this.anInt648 = 128;
		this.anInt649 = 128;
		this.anInt650 = 0;
		this.anInt651 = 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!mb;)V")
	private void method387(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method503();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt626 = arg0.method505();
				} else if (local14 == 2) {
					this.aString25 = arg0.method510();
				} else if (local14 == 3) {
					this.aByteArray6 = arg0.method511();
				} else if (local14 == 4) {
					this.anInt627 = arg0.method505();
				} else if (local14 == 5) {
					this.anInt628 = arg0.method505();
				} else if (local14 == 6) {
					this.anInt629 = arg0.method505();
				} else if (local14 == 7) {
					this.anInt631 = arg0.method505();
					if (this.anInt631 > 32767) {
						this.anInt631 -= 65536;
					}
				} else if (local14 == 8) {
					this.anInt632 = arg0.method505();
					if (this.anInt632 > 32767) {
						this.anInt632 -= 65536;
					}
				} else if (local14 == 10) {
					this.anInt633 = arg0.method505();
				} else if (local14 == 11) {
					this.aBoolean155 = true;
				} else if (local14 == 12) {
					this.anInt634 = arg0.method508();
				} else if (local14 == 16) {
					this.aBoolean156 = true;
				} else if (local14 == 23) {
					this.anInt635 = arg0.method505();
					this.aByte27 = arg0.method504();
				} else if (local14 == 24) {
					this.anInt636 = arg0.method505();
				} else if (local14 == 25) {
					this.anInt637 = arg0.method505();
					this.aByte28 = arg0.method504();
				} else if (local14 == 26) {
					this.anInt638 = arg0.method505();
				} else if (local14 >= 30 && local14 < 35) {
					if (this.aStringArray10 == null) {
						this.aStringArray10 = new String[5];
					}
					this.aStringArray10[local14 - 30] = arg0.method510();
					if (this.aStringArray10[local14 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray10[local14 - 30] = null;
					}
				} else if (local14 >= 35 && local14 < 40) {
					if (this.aStringArray11 == null) {
						this.aStringArray11 = new String[5];
					}
					this.aStringArray11[local14 - 35] = arg0.method510();
				} else if (local14 == 40) {
					@Pc(256) int local256 = arg0.method503();
					this.anIntArray202 = new int[local256];
					this.anIntArray203 = new int[local256];
					for (@Pc(266) int local266 = 0; local266 < local256; local266++) {
						this.anIntArray202[local266] = arg0.method505();
						this.anIntArray203[local266] = arg0.method505();
					}
				} else if (local14 == 78) {
					this.anInt639 = arg0.method505();
				} else if (local14 == 79) {
					this.anInt640 = arg0.method505();
				} else if (local14 == 90) {
					this.anInt641 = arg0.method505();
				} else if (local14 == 91) {
					this.anInt643 = arg0.method505();
				} else if (local14 == 92) {
					this.anInt642 = arg0.method505();
				} else if (local14 == 93) {
					this.anInt644 = arg0.method505();
				} else if (local14 == 95) {
					this.anInt630 = arg0.method505();
				} else if (local14 == 97) {
					this.anInt645 = arg0.method505();
				} else if (local14 == 98) {
					this.anInt646 = arg0.method505();
				} else if (local14 >= 100 && local14 < 110) {
					if (this.anIntArray204 == null) {
						this.anIntArray204 = new int[10];
						this.anIntArray205 = new int[10];
					}
					this.anIntArray204[local14 - 100] = arg0.method505();
					this.anIntArray205[local14 - 100] = arg0.method505();
				} else if (local14 == 110) {
					this.anInt647 = arg0.method505();
				} else if (local14 == 111) {
					this.anInt648 = arg0.method505();
				} else if (local14 == 112) {
					this.anInt649 = arg0.method505();
				} else if (local14 == 113) {
					this.anInt650 = arg0.method504();
				} else if (local14 == 114) {
					this.anInt651 = arg0.method504() * 5;
				}
			}
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("79136, " + 44 + ", " + arg0 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	private void method388() {
		try {
			@Pc(3) Class17 local3 = method385(this.anInt646);
			this.anInt626 = local3.anInt626;
			this.anInt627 = local3.anInt627;
			this.anInt628 = local3.anInt628;
			this.anInt629 = local3.anInt629;
			this.anInt630 = local3.anInt630;
			this.anInt631 = local3.anInt631;
			this.anInt632 = local3.anInt632;
			this.anIntArray202 = local3.anIntArray202;
			this.anIntArray203 = local3.anIntArray203;
			@Pc(43) Class17 local43 = method385(this.anInt645);
			this.aString25 = local43.aString25;
			this.aBoolean156 = local43.aBoolean156;
			this.anInt634 = local43.anInt634;
			@Pc(57) String local57 = "a";
			@Pc(68) char local68 = local43.aString25.charAt(0);
			if (local68 == 'A' || local68 == 'E' || local68 == 'I' || local68 == 'O' || local68 == 'U') {
				local57 = "an";
			}
			this.aByteArray6 = ("Swap this note at any bank for " + local57 + " " + local43.aString25 + ".").getBytes();
			this.aBoolean155 = true;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("72626, " + 6 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method389(@OriginalArg(0) int arg0) {
		@Pc(11) int local11;
		if (this.anIntArray204 != null && arg0 > 1) {
			@Pc(9) int local9 = -1;
			for (local11 = 0; local11 < 10; local11++) {
				if (arg0 >= this.anIntArray205[local11] && this.anIntArray205[local11] != 0) {
					local9 = this.anIntArray204[local11];
				}
			}
			if (local9 != -1) {
				return method385(local9).method389(1);
			}
		}
		@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = (Class1_Sub1_Sub1_Sub5) aClass39_7.method604((long) this.anInt625);
		if (local48 != null) {
			return local48;
		}
		local48 = Class1_Sub1_Sub1_Sub5.method256(this.anInt626, 196);
		if (local48 == null) {
			return null;
		}
		if (this.anInt647 != 128 || this.anInt648 != 128 || this.anInt649 != 128) {
			local48.method272(this.anInt647, this.anInt649, this.anInt648);
		}
		if (this.anIntArray202 != null) {
			for (local11 = 0; local11 < this.anIntArray202.length; local11++) {
				local48.method270(this.anIntArray202[local11], this.anIntArray203[local11]);
			}
		}
		local48.method273(this.anInt650 + 64, this.anInt651 + 768, -50, -10, -50, true);
		local48.aBoolean109 = true;
		aClass39_7.method605(local48, (long) this.anInt625);
		return local48;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method390(@OriginalArg(1) int arg0) {
		try {
			@Pc(11) int local11;
			if (this.anIntArray204 != null && arg0 > 1) {
				@Pc(9) int local9 = -1;
				for (local11 = 0; local11 < 10; local11++) {
					if (arg0 >= this.anIntArray205[local11] && this.anIntArray205[local11] != 0) {
						local9 = this.anIntArray204[local11];
					}
				}
				if (local9 != -1) {
					return method385(local9).method390(1);
				}
			}
			@Pc(47) Class1_Sub1_Sub1_Sub5 local47 = Class1_Sub1_Sub1_Sub5.method256(this.anInt626, 196);
			if (local47 == null) {
				return null;
			}
			if (this.anIntArray202 != null) {
				for (local11 = 0; local11 < this.anIntArray202.length; local11++) {
					local47.method270(this.anIntArray202[local11], this.anIntArray203[local11]);
				}
			}
			return local47;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("50395, " + -280 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Z")
	public boolean method392(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt635;
			@Pc(5) int local5 = this.anInt636;
			@Pc(8) int local8 = this.anInt639;
			if (arg0 == 1) {
				local2 = this.anInt637;
				local5 = this.anInt638;
				local8 = this.anInt640;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(39) boolean local39 = true;
			if (!Class1_Sub1_Sub1_Sub5.method257(local2)) {
				local39 = false;
			}
			if (local5 != -1 && !Class1_Sub1_Sub1_Sub5.method257(local5)) {
				local39 = false;
			}
			if (local8 != -1 && !Class1_Sub1_Sub1_Sub5.method257(local8)) {
				local39 = false;
			}
			return local39;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("55637, " + 2 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method393(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt635;
			@Pc(7) int local7 = this.anInt636;
			@Pc(10) int local10 = this.anInt639;
			if (arg0 == 1) {
				local4 = this.anInt637;
				local7 = this.anInt638;
				local10 = this.anInt640;
			}
			if (local4 == -1) {
				return null;
			}
			@Pc(40) Class1_Sub1_Sub1_Sub5 local40 = Class1_Sub1_Sub1_Sub5.method256(local4, 196);
			if (local7 != -1) {
				@Pc(50) Class1_Sub1_Sub1_Sub5 local50;
				if (local10 == -1) {
					local50 = Class1_Sub1_Sub1_Sub5.method256(local7, 196);
					@Pc(93) Class1_Sub1_Sub1_Sub5[] local93 = new Class1_Sub1_Sub1_Sub5[] { local40, local50 };
					local40 = new Class1_Sub1_Sub1_Sub5(172, local93, 2);
				} else {
					local50 = Class1_Sub1_Sub1_Sub5.method256(local7, 196);
					@Pc(54) Class1_Sub1_Sub1_Sub5 local54 = Class1_Sub1_Sub1_Sub5.method256(local10, 196);
					@Pc(69) Class1_Sub1_Sub1_Sub5[] local69 = new Class1_Sub1_Sub1_Sub5[] { local40, local50, local54 };
					local40 = new Class1_Sub1_Sub1_Sub5(172, local69, 3);
				}
			}
			if (arg0 == 0 && this.aByte27 != 0) {
				local40.method269(this.aByte27, 0, 0);
			}
			if (arg0 == 1 && this.aByte28 != 0) {
				local40.method269(this.aByte28, 0, 0);
			}
			if (this.anIntArray202 != null) {
				for (@Pc(130) int local130 = 0; local130 < this.anIntArray202.length; local130++) {
					local40.method270(this.anIntArray202[local130], this.anIntArray203[local130]);
				}
			}
			return local40;
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("79212, " + arg0 + ", " + 0 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)Z")
	public boolean method394(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt641;
			@Pc(5) int local5 = this.anInt642;
			if (arg0 == 1) {
				local2 = this.anInt643;
				local5 = this.anInt644;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(31) boolean local31 = true;
			if (!Class1_Sub1_Sub1_Sub5.method257(local2)) {
				local31 = false;
			}
			if (local5 != -1 && !Class1_Sub1_Sub1_Sub5.method257(local5)) {
				local31 = false;
			}
			return local31;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("18349, " + arg0 + ", " + 1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(II)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method395(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt641;
			@Pc(7) int local7 = this.anInt642;
			if (arg0 == 1) {
				local4 = this.anInt643;
				local7 = this.anInt644;
			}
			if (local4 == -1) {
				return null;
			}
			@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = Class1_Sub1_Sub1_Sub5.method256(local4, 196);
			if (local7 != -1) {
				@Pc(43) Class1_Sub1_Sub1_Sub5 local43 = Class1_Sub1_Sub1_Sub5.method256(local7, 196);
				@Pc(54) Class1_Sub1_Sub1_Sub5[] local54 = new Class1_Sub1_Sub1_Sub5[] { local36, local43 };
				local36 = new Class1_Sub1_Sub1_Sub5(172, local54, 2);
			}
			if (this.anIntArray202 != null) {
				for (@Pc(66) int local66 = 0; local66 < this.anIntArray202.length; local66++) {
					local36.method270(this.anIntArray202[local66], this.anIntArray203[local66]);
				}
			}
			return local36;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("49447, " + 0 + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
