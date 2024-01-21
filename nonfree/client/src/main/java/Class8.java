import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!e")
public final class Class8 {

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Z")
	private static boolean aBoolean83;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	public static boolean aBoolean84;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "J")
	private static long aLong11;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "J")
	private static long aLong12;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private static int anInt346;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	private static int anInt347;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	private static int anInt348;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private static int anInt344 = 7007;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "B")
	private static byte aByte26 = 7;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	private static int anInt345 = -514;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_7 = null;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_8 = null;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static synchronized void method208() {
		try {
			aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method370();
			aLong12 = System.currentTimeMillis();
			aBoolean84 = true;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("73497, " + 40470 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V")
	public static synchronized void method209(@OriginalArg(1) boolean arg0) {
		try {
			aBoolean84 = false;
			if (arg0) {
				method211(499);
			} else {
				if (aClass1_Sub3_Sub3_7 != null) {
					aClass1_Sub3_Sub3_7.anInt548 = 0;
				}
				aClass1_Sub3_Sub3_8 = null;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("27592, " + 0 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)Lclient!kb;")
	public static synchronized Class1_Sub3_Sub3 method210() {
		try {
			@Pc(1) Class1_Sub3_Sub3 local1 = null;
			if (aClass1_Sub3_Sub3_8 != null) {
				local1 = aClass1_Sub3_Sub3_8;
				aClass1_Sub3_Sub3_8 = null;
			}
			return local1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("61627, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	private static synchronized void method211(@OriginalArg(0) int arg0) {
		try {
			if (7007 == anInt344 && aClass1_Sub3_Sub3_7.anInt548 + arg0 >= 500) {
				@Pc(11) Class1_Sub3_Sub3 local11 = aClass1_Sub3_Sub3_7;
				aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method370();
				aClass1_Sub3_Sub3_8 = local11;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("12692, " + arg0 + ", " + 7007 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZ)V")
	public static synchronized void method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 >= 0 && arg0 < 789 && arg2 >= 0 && arg2 < 532) {
				anInt346++;
				@Pc(16) long local16 = System.currentTimeMillis();
				@Pc(25) long local25 = (local16 - aLong12) / 10L;
				if (local25 > 250L) {
					local25 = 250L;
				}
				aLong12 = local16;
				method211(5);
				if (arg1 == 1) {
					aClass1_Sub3_Sub3_7.method373(1);
				} else {
					aClass1_Sub3_Sub3_7.method373(2);
				}
				aClass1_Sub3_Sub3_7.method373((int) local25);
				aClass1_Sub3_Sub3_7.method376(arg0 + (arg2 << 10));
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("69354, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
	public static synchronized void method213(@OriginalArg(1) int arg0) {
		try {
			anInt346++;
			@Pc(7) long local7 = System.currentTimeMillis();
			@Pc(13) long local13 = (local7 - aLong12) / 10L;
			if (local13 > 250L) {
				local13 = 250L;
			}
			aLong12 = local7;
			method211(2);
			if (arg0 == 1) {
				aClass1_Sub3_Sub3_7.method373(3);
			} else {
				aClass1_Sub3_Sub3_7.method373(4);
			}
			aClass1_Sub3_Sub3_7.method373((int) local13);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("16838, " + -955 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB)V")
	public static synchronized void method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
				@Pc(14) long local14 = System.currentTimeMillis();
				if (local14 - aLong11 >= 50L) {
					aLong11 = local14;
					anInt346++;
					@Pc(41) long local41 = (local14 - aLong12) / 10L;
					if (local41 > 250L) {
						local41 = 250L;
					}
					aLong12 = local14;
					if (arg1 - anInt347 < 8 && arg1 - anInt347 >= -8 && arg0 - anInt348 < 8 && arg0 - anInt348 >= -8) {
						method211(3);
						aClass1_Sub3_Sub3_7.method373(5);
						aClass1_Sub3_Sub3_7.method373((int) local41);
						aClass1_Sub3_Sub3_7.method373(arg1 + (arg0 - anInt348 + 8 << 4) + 8 - anInt347);
					} else if (arg1 - anInt347 < 128 && arg1 - anInt347 >= -128 && arg0 - anInt348 < 128 && arg0 - anInt348 >= -128) {
						method211(4);
						aClass1_Sub3_Sub3_7.method373(6);
						aClass1_Sub3_Sub3_7.method373((int) local41);
						aClass1_Sub3_Sub3_7.method373(arg1 + 128 - anInt347);
						aClass1_Sub3_Sub3_7.method373(arg0 + 128 - anInt348);
					} else {
						method211(5);
						aClass1_Sub3_Sub3_7.method373(7);
						aClass1_Sub3_Sub3_7.method373((int) local41);
						aClass1_Sub3_Sub3_7.method376(arg1 + (arg0 << 10));
					}
					anInt347 = arg1;
					anInt348 = arg0;
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("25586, " + arg0 + ", " + arg1 + ", " + 37 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(II)V")
	public static synchronized void method215(@OriginalArg(0) int arg0) {
		try {
			anInt346++;
			@Pc(8) long local8 = System.currentTimeMillis();
			@Pc(14) long local14 = (local8 - aLong12) / 10L;
			if (local14 > 250L) {
				local14 = 250L;
			}
			aLong12 = local8;
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
			method211(3);
			aClass1_Sub3_Sub3_7.method373(8);
			aClass1_Sub3_Sub3_7.method373((int) local14);
			aClass1_Sub3_Sub3_7.method373(arg0);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("64032, " + arg0 + ", " + -461 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
	public static synchronized void method216(@OriginalArg(0) int arg0) {
		try {
			anInt346++;
			@Pc(15) long local15 = System.currentTimeMillis();
			@Pc(21) long local21 = (local15 - aLong12) / 10L;
			if (local21 > 250L) {
				local21 = 250L;
			}
			aLong12 = local15;
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
			method211(3);
			aClass1_Sub3_Sub3_7.method373(9);
			aClass1_Sub3_Sub3_7.method373((int) local21);
			aClass1_Sub3_Sub3_7.method373(arg0);
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("44323, " + arg0 + ", " + 18 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static synchronized void method217(@OriginalArg(0) byte arg0) {
		try {
			anInt346++;
			@Pc(5) long local5 = System.currentTimeMillis();
			if (arg0 != aByte26) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			@Pc(21) long local21 = (local5 - aLong12) / 10L;
			if (local21 > 250L) {
				local21 = 250L;
			}
			aLong12 = local5;
			method211(2);
			aClass1_Sub3_Sub3_7.method373(10);
			aClass1_Sub3_Sub3_7.method373((int) local21);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("80194, " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public static synchronized void method218() {
		try {
			anInt346++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(15) long local15 = (local5 - aLong12) / 10L;
			if (local15 > 250L) {
				local15 = 250L;
			}
			aLong12 = local5;
			method211(2);
			aClass1_Sub3_Sub3_7.method373(11);
			aClass1_Sub3_Sub3_7.method373((int) local15);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("73965, " + -19 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V")
	public static synchronized void method219(@OriginalArg(0) byte arg0) {
		try {
			anInt346++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(10) boolean local10 = false;
			@Pc(19) long local19 = (local5 - aLong12) / 10L;
			if (local19 > 250L) {
				local19 = 250L;
			}
			aLong12 = local5;
			method211(2);
			aClass1_Sub3_Sub3_7.method373(12);
			aClass1_Sub3_Sub3_7.method373((int) local19);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("90430, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
	public static synchronized void method220() {
		try {
			anInt346++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(11) long local11 = (local5 - aLong12) / 10L;
			if (local11 > 250L) {
				local11 = 250L;
			}
			aLong12 = local5;
			method211(2);
			aClass1_Sub3_Sub3_7.method373(13);
			aClass1_Sub3_Sub3_7.method373((int) local11);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("17140, " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}
}
