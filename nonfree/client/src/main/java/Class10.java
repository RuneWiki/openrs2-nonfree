import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Z")
	public static boolean aBoolean105;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "J")
	private static long aLong16;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	private static int anInt532;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "J")
	private static long aLong17;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	private static int anInt533;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private static int anInt534;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private static int anInt530;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	private static int anInt531;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7;

	static {
		aBoolean104 = true;
		anInt530 = 800;
		anInt531 = -884;
		aClass1_Sub1_Sub3_6 = null;
		aClass1_Sub1_Sub3_7 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public static synchronized void method257() {
		try {
			aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method455();
			aClass1_Sub1_Sub3_7 = null;
			aLong16 = System.currentTimeMillis();
			aBoolean105 = true;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("27, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static synchronized void method258(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			aBoolean105 = false;
			aClass1_Sub1_Sub3_6 = null;
			aClass1_Sub1_Sub3_7 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("37464, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method259() {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_7 != null && aBoolean105) {
				local1 = aClass1_Sub1_Sub3_7;
			}
			aClass1_Sub1_Sub3_7 = null;
			return local1;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("8002, " + -7 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method260() {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_6 != null && aClass1_Sub1_Sub3_6.anInt777 > 0 && aBoolean105) {
				local1 = aClass1_Sub1_Sub3_6;
			}
			method258((byte) 3);
			return local1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("31095, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
	private static synchronized void method261(@OriginalArg(1) int arg0) {
		try {
			if (aClass1_Sub1_Sub3_6.anInt777 + arg0 >= 500) {
				@Pc(11) Class1_Sub1_Sub3 local11 = aClass1_Sub1_Sub3_6;
				aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method455();
				aClass1_Sub1_Sub3_7 = local11;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("53855, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBII)V")
	public static synchronized void method262(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (aBoolean105 && (arg2 >= 0 && arg2 < 789 && arg3 >= 0 && arg3 < 532)) {
				anInt532++;
				@Pc(19) long local19 = System.currentTimeMillis();
				@Pc(25) long local25 = (local19 - aLong16) / 10L;
				if (local25 > 250L) {
					local25 = 250L;
				}
				aLong16 = local19;
				method261(5);
				if (arg0 == 1) {
					aClass1_Sub1_Sub3_6.method458(1);
				} else {
					aClass1_Sub1_Sub3_6.method458(2);
				}
				aClass1_Sub1_Sub3_6.method458((int) local25);
				aClass1_Sub1_Sub3_6.method461(arg2 + (arg3 << 10));
				@Pc(63) boolean local63 = false;
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("76236, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(ZI)V")
	public static synchronized void method263(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean105) {
				anInt532++;
				@Pc(16) long local16 = System.currentTimeMillis();
				@Pc(22) long local22 = (local16 - aLong16) / 10L;
				if (local22 > 250L) {
					local22 = 250L;
				}
				aLong16 = local16;
				method261(2);
				if (arg0 == 1) {
					aClass1_Sub1_Sub3_6.method458(3);
				} else {
					aClass1_Sub1_Sub3_6.method458(4);
				}
				aClass1_Sub1_Sub3_6.method458((int) local22);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("20436, " + false + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZII)V")
	public static synchronized void method264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aBoolean105 && (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532)) {
				@Pc(17) long local17 = System.currentTimeMillis();
				if (local17 - aLong17 >= 50L) {
					aLong17 = local17;
					anInt532++;
					@Pc(38) long local38 = (local17 - aLong16) / 10L;
					if (local38 > 250L) {
						local38 = 250L;
					}
					aLong16 = local17;
					if (arg1 - anInt533 < 8 && arg1 - anInt533 >= -8 && arg0 - anInt534 < 8 && arg0 - anInt534 >= -8) {
						method261(3);
						aClass1_Sub1_Sub3_6.method458(5);
						aClass1_Sub1_Sub3_6.method458((int) local38);
						aClass1_Sub1_Sub3_6.method458(arg1 + (arg0 - anInt534 + 8 << 4) + 8 - anInt533);
					} else if (arg1 - anInt533 < 128 && arg1 - anInt533 >= -128 && arg0 - anInt534 < 128 && arg0 - anInt534 >= -128) {
						method261(4);
						aClass1_Sub1_Sub3_6.method458(6);
						aClass1_Sub1_Sub3_6.method458((int) local38);
						aClass1_Sub1_Sub3_6.method458(arg1 + 128 - anInt533);
						aClass1_Sub1_Sub3_6.method458(arg0 + 128 - anInt534);
					} else {
						method261(5);
						aClass1_Sub1_Sub3_6.method458(7);
						aClass1_Sub1_Sub3_6.method458((int) local38);
						aClass1_Sub1_Sub3_6.method461(arg1 + (arg0 << 10));
					}
					anInt533 = arg1;
					anInt534 = arg0;
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("13401, " + true + ", " + arg0 + ", " + arg1 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public static synchronized void method265(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (aBoolean105) {
				anInt532++;
				@Pc(16) long local16 = System.currentTimeMillis();
				@Pc(22) long local22 = (local16 - aLong16) / 10L;
				if (local22 > 250L) {
					local22 = 250L;
				}
				aLong16 = local16;
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
				method261(3);
				aClass1_Sub1_Sub3_6.method458(8);
				aClass1_Sub1_Sub3_6.method458((int) local22);
				aClass1_Sub1_Sub3_6.method458(arg0);
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("38684, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public static synchronized void method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aBoolean105) {
				anInt532++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong16) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong16 = local8;
				if (arg1 == 1000) {
					arg1 = 11;
				}
				if (arg1 == 1001) {
					arg1 = 12;
				}
				if (arg1 == 1002) {
					arg1 = 14;
				}
				if (arg1 == 1003) {
					arg1 = 15;
				}
				if (arg1 >= 1008) {
					arg1 -= 992;
				}
				method261(3);
				aClass1_Sub1_Sub3_6.method458(9);
				if (arg0 > 0) {
					aClass1_Sub1_Sub3_6.method458((int) local14);
					aClass1_Sub1_Sub3_6.method458(arg1);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("84683, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
	public static synchronized void method267(@OriginalArg(0) byte arg0) {
		try {
			if (aBoolean105) {
				anInt532++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(13) boolean local13 = false;
				@Pc(27) long local27 = (local8 - aLong16) / 10L;
				if (local27 > 250L) {
					local27 = 250L;
				}
				aLong16 = local8;
				method261(2);
				aClass1_Sub1_Sub3_6.method458(10);
				aClass1_Sub1_Sub3_6.method458((int) local27);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("83220, " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
	public static synchronized void method268() {
		try {
			if (aBoolean105) {
				anInt532++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(18) long local18 = (local8 - aLong16) / 10L;
				if (local18 > 250L) {
					local18 = 250L;
				}
				aLong16 = local8;
				method261(2);
				aClass1_Sub1_Sub3_6.method458(11);
				aClass1_Sub1_Sub3_6.method458((int) local18);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("65747, " + -91 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static synchronized void method269() {
		try {
			if (aBoolean105) {
				anInt532++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(21) long local21 = (local8 - aLong16) / 10L;
				if (local21 > 250L) {
					local21 = 250L;
				}
				aLong16 = local8;
				method261(2);
				aClass1_Sub1_Sub3_6.method458(12);
				aClass1_Sub1_Sub3_6.method458((int) local21);
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("49341, " + 6 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(Z)V")
	public static synchronized void method270() {
		try {
			if (aBoolean105) {
				anInt532++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(18) long local18 = (local8 - aLong16) / 10L;
				if (local18 > 250L) {
					local18 = 250L;
				}
				aLong16 = local8;
				method261(2);
				aClass1_Sub1_Sub3_6.method458(13);
				aClass1_Sub1_Sub3_6.method458((int) local18);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("10990, " + true + ", " + local38.toString());
			throw new RuntimeException();
		}
	}
}
