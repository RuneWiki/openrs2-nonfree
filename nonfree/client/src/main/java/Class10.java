import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Z")
	private static boolean aBoolean128;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Z")
	private static boolean aBoolean129;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Z")
	public static boolean aBoolean130;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "J")
	private static long aLong21;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private static int anInt538;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "J")
	private static long aLong22;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "I")
	private static int anInt539;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "I")
	private static int anInt540;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private static int anInt534 = -258;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	private static int anInt535 = 164;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "I")
	private static int anInt536 = 1;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	private static int anInt537 = 7;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = null;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = null;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static synchronized void method266() {
		try {
			aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method485();
			aClass1_Sub1_Sub3_7 = null;
			aLong21 = System.currentTimeMillis();
			aBoolean130 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("72008, " + 5 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static synchronized void method267() {
		try {
			aBoolean130 = false;
			aClass1_Sub1_Sub3_6 = null;
			aClass1_Sub1_Sub3_7 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("10435, " + 2 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method268() {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = null;
			if (aClass1_Sub1_Sub3_7 != null && aBoolean130) {
				local7 = aClass1_Sub1_Sub3_7;
			}
			aClass1_Sub1_Sub3_7 = null;
			return local7;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("70074, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method269(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				aBoolean128 = !aBoolean128;
			}
			@Pc(9) Class1_Sub1_Sub3 local9 = null;
			if (aClass1_Sub1_Sub3_6 != null && aClass1_Sub1_Sub3_6.anInt776 > 0 && aBoolean130) {
				local9 = aClass1_Sub1_Sub3_6;
			}
			method267();
			return local9;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("15434, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
	private static synchronized void method270(@OriginalArg(1) int arg0) {
		try {
			if (aClass1_Sub1_Sub3_6.anInt776 + arg0 >= 500) {
				@Pc(11) Class1_Sub1_Sub3 local11 = aClass1_Sub1_Sub3_6;
				aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method485();
				aClass1_Sub1_Sub3_7 = local11;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("70347, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	public static synchronized void method271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (aBoolean130 && (arg0 >= 0 && arg0 < 789 && arg2 >= 0 && arg2 < 532)) {
				anInt538++;
				@Pc(23) long local23 = System.currentTimeMillis();
				@Pc(29) long local29 = (local23 - aLong21) / 10L;
				if (local29 > 250L) {
					local29 = 250L;
				}
				aLong21 = local23;
				method270(5);
				if (arg1 == 1) {
					aClass1_Sub1_Sub3_6.method488(1);
				} else {
					aClass1_Sub1_Sub3_6.method488(2);
				}
				aClass1_Sub1_Sub3_6.method488((int) local29);
				aClass1_Sub1_Sub3_6.method491(arg0 + (arg2 << 10));
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("12137, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public static synchronized void method272(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (aBoolean130) {
				anInt538++;
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(15) boolean local15 = false;
				@Pc(25) long local25 = (local10 - aLong21) / 10L;
				if (local25 > 250L) {
					local25 = 250L;
				}
				aLong21 = local10;
				method270(2);
				if (arg0 == 1) {
					aClass1_Sub1_Sub3_6.method488(3);
				} else {
					aClass1_Sub1_Sub3_6.method488(4);
				}
				aClass1_Sub1_Sub3_6.method488((int) local25);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("43019, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)V")
	public static synchronized void method273(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (aBoolean130 && (arg1 >= 0 && arg1 < 789 && arg2 >= 0 && arg2 < 532)) {
				@Pc(17) long local17 = System.currentTimeMillis();
				@Pc(22) boolean local22 = false;
				if (local17 - aLong22 >= 50L) {
					aLong22 = local17;
					anInt538++;
					@Pc(43) long local43 = (local17 - aLong21) / 10L;
					if (local43 > 250L) {
						local43 = 250L;
					}
					aLong21 = local17;
					if (arg1 - anInt539 < 8 && arg1 - anInt539 >= -8 && arg2 - anInt540 < 8 && arg2 - anInt540 >= -8) {
						method270(3);
						aClass1_Sub1_Sub3_6.method488(5);
						aClass1_Sub1_Sub3_6.method488((int) local43);
						aClass1_Sub1_Sub3_6.method488(arg1 + (arg2 - anInt540 + 8 << 4) + 8 - anInt539);
					} else if (arg1 - anInt539 < 128 && arg1 - anInt539 >= -128 && arg2 - anInt540 < 128 && arg2 - anInt540 >= -128) {
						method270(4);
						aClass1_Sub1_Sub3_6.method488(6);
						aClass1_Sub1_Sub3_6.method488((int) local43);
						aClass1_Sub1_Sub3_6.method488(arg1 + 128 - anInt539);
						aClass1_Sub1_Sub3_6.method488(arg2 + 128 - anInt540);
					} else {
						method270(5);
						aClass1_Sub1_Sub3_6.method488(7);
						aClass1_Sub1_Sub3_6.method488((int) local43);
						aClass1_Sub1_Sub3_6.method491(arg1 + (arg2 << 10));
					}
					anInt539 = arg1;
					anInt540 = arg2;
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("48640, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public static synchronized void method274(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean130) {
				anInt538++;
				@Pc(13) long local13 = System.currentTimeMillis();
				@Pc(19) long local19 = (local13 - aLong21) / 10L;
				if (local19 > 250L) {
					local19 = 250L;
				}
				aLong21 = local13;
				if (arg0 == 1000) {
					arg0 = 11;
				}
				if (arg0 == 1001) {
					arg0 = 12;
				}
				if (arg0 == 1002) {
					arg0 = 14;
				}
				if (arg0 == 1003) {
					arg0 = 15;
				}
				if (arg0 >= 1008) {
					arg0 -= 992;
				}
				method270(3);
				aClass1_Sub1_Sub3_6.method488(8);
				aClass1_Sub1_Sub3_6.method488((int) local19);
				aClass1_Sub1_Sub3_6.method488(arg0);
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("33055, " + 344 + ", " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
	public static synchronized void method275(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean130) {
				anInt538++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				if (anInt536 > 1 || anInt536 < 1) {
					aBoolean129 = !aBoolean129;
				}
				if (arg0 == 1000) {
					arg0 = 11;
				}
				if (arg0 == 1001) {
					arg0 = 12;
				}
				if (arg0 == 1002) {
					arg0 = 14;
				}
				if (arg0 == 1003) {
					arg0 = 15;
				}
				if (arg0 >= 1008) {
					arg0 -= 992;
				}
				method270(3);
				aClass1_Sub1_Sub3_6.method488(9);
				aClass1_Sub1_Sub3_6.method488((int) local14);
				aClass1_Sub1_Sub3_6.method488(arg0);
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("39187, " + 1 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public static synchronized void method276(@OriginalArg(0) byte arg0) {
		try {
			if (aBoolean130) {
				anInt538++;
				@Pc(8) long local8 = System.currentTimeMillis();
				if (arg0 != 60) {
					anInt534 = 162;
				}
				@Pc(19) long local19 = (local8 - aLong21) / 10L;
				if (local19 > 250L) {
					local19 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(10);
				aClass1_Sub1_Sub3_6.method488((int) local19);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("72841, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public static synchronized void method277() {
		try {
			if (aBoolean130) {
				anInt538++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(18) long local18 = (local8 - aLong21) / 10L;
				if (local18 > 250L) {
					local18 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(11);
				aClass1_Sub1_Sub3_6.method488((int) local18);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("52439, " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
	public static synchronized void method278() {
		try {
			if (aBoolean130) {
				anInt538++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(12);
				aClass1_Sub1_Sub3_6.method488((int) local14);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("47758, " + 9 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
	public static synchronized void method279() {
		try {
			if (aBoolean130) {
				anInt538++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(13);
				aClass1_Sub1_Sub3_6.method488((int) local14);
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("49983, " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}
}
