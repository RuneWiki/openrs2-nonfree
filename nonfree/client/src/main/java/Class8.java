import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!e")
public final class Class8 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private static int anInt347;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	public static boolean aBoolean79;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "J")
	private static long aLong11;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "J")
	private static long aLong12;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private static int anInt349;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	private static int anInt350;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	private static int anInt351;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "B")
	private static byte aByte28 = 5;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	private static int anInt348 = -366;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_7 = null;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_8 = null;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static synchronized void method208() {
		try {
			aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method370((byte) 2);
			aLong12 = System.currentTimeMillis();
			aBoolean79 = true;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("21382, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZ)V")
	public static synchronized void method209(@OriginalArg(0) boolean arg0) {
		try {
			aBoolean79 = false;
			if (arg0) {
				method211(aByte28, 499);
			} else {
				if (aClass1_Sub3_Sub3_7 != null) {
					aClass1_Sub3_Sub3_7.anInt566 = 0;
				}
				aClass1_Sub3_Sub3_8 = null;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("47791, " + arg0 + ", " + true + ", " + local19.toString());
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
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("53498, " + true + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
	private static synchronized void method211(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == aByte28 && aClass1_Sub3_Sub3_7.anInt566 + arg1 >= 500) {
				@Pc(11) Class1_Sub3_Sub3 local11 = aClass1_Sub3_Sub3_7;
				aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method370((byte) 2);
				aClass1_Sub3_Sub3_8 = local11;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("15123, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public static synchronized void method212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
				anInt349++;
				@Pc(16) long local16 = System.currentTimeMillis();
				@Pc(22) long local22 = (local16 - aLong12) / 10L;
				if (local22 > 250L) {
					local22 = 250L;
				}
				aLong12 = local16;
				method211(aByte28, 5);
				if (arg2 == 1) {
					aClass1_Sub3_Sub3_7.method373(1);
				} else {
					aClass1_Sub3_Sub3_7.method373(2);
				}
				aClass1_Sub3_Sub3_7.method373((int) local22);
				aClass1_Sub3_Sub3_7.method376(arg1 + (arg0 << 10));
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("77814, " + arg0 + ", " + -427 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V")
	public static synchronized void method213(@OriginalArg(0) int arg0) {
		try {
			anInt349++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(11) long local11 = (local5 - aLong12) / 10L;
			if (local11 > 250L) {
				local11 = 250L;
			}
			aLong12 = local5;
			method211(aByte28, 2);
			if (arg0 == 1) {
				aClass1_Sub3_Sub3_7.method373(3);
			} else {
				aClass1_Sub3_Sub3_7.method373(4);
			}
			aClass1_Sub3_Sub3_7.method373((int) local11);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("24777, " + arg0 + ", " + true + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public static synchronized void method214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
				@Pc(14) long local14 = System.currentTimeMillis();
				if (local14 - aLong11 >= 50L) {
					aLong11 = local14;
					anInt349++;
					@Pc(42) long local42 = (local14 - aLong12) / 10L;
					if (local42 > 250L) {
						local42 = 250L;
					}
					aLong12 = local14;
					if (arg1 - anInt350 < 8 && arg1 - anInt350 >= -8 && arg0 - anInt351 < 8 && arg0 - anInt351 >= -8) {
						method211(aByte28, 3);
						aClass1_Sub3_Sub3_7.method373(5);
						aClass1_Sub3_Sub3_7.method373((int) local42);
						aClass1_Sub3_Sub3_7.method373(arg1 + (arg0 - anInt351 + 8 << 4) + 8 - anInt350);
					} else if (arg1 - anInt350 < 128 && arg1 - anInt350 >= -128 && arg0 - anInt351 < 128 && arg0 - anInt351 >= -128) {
						method211(aByte28, 4);
						aClass1_Sub3_Sub3_7.method373(6);
						aClass1_Sub3_Sub3_7.method373((int) local42);
						aClass1_Sub3_Sub3_7.method373(arg1 + 128 - anInt350);
						aClass1_Sub3_Sub3_7.method373(arg0 + 128 - anInt351);
					} else {
						method211(aByte28, 5);
						aClass1_Sub3_Sub3_7.method373(7);
						aClass1_Sub3_Sub3_7.method373((int) local42);
						aClass1_Sub3_Sub3_7.method376(arg1 + (arg0 << 10));
					}
					anInt350 = arg1;
					anInt351 = arg0;
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("2397, " + -449 + ", " + arg0 + ", " + arg1 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)V")
	public static synchronized void method215(@OriginalArg(1) int arg0) {
		try {
			anInt349++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(11) long local11 = (local5 - aLong12) / 10L;
			if (local11 > 250L) {
				local11 = 250L;
			}
			aLong12 = local5;
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
			method211(aByte28, 3);
			aClass1_Sub3_Sub3_7.method373(8);
			aClass1_Sub3_Sub3_7.method373((int) local11);
			aClass1_Sub3_Sub3_7.method373(arg0);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("78324, " + false + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
	public static synchronized void method216(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			anInt349++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(11) long local11 = (local5 - aLong12) / 10L;
			if (local11 > 250L) {
				local11 = 250L;
			}
			aLong12 = local5;
			if (arg1 == 5) {
				@Pc(24) boolean local24 = false;
			} else {
				anInt347 = 203;
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
			method211(aByte28, 3);
			aClass1_Sub3_Sub3_7.method373(9);
			aClass1_Sub3_Sub3_7.method373((int) local11);
			aClass1_Sub3_Sub3_7.method373(arg0);
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("33785, " + arg0 + ", " + arg1 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static synchronized void method217() {
		try {
			anInt349++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(11) long local11 = (local5 - aLong12) / 10L;
			if (local11 > 250L) {
				local11 = 250L;
			}
			aLong12 = local5;
			method211(aByte28, 2);
			aClass1_Sub3_Sub3_7.method373(10);
			aClass1_Sub3_Sub3_7.method373((int) local11);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("37430, " + -861 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static synchronized void method218() {
		try {
			anInt349++;
			@Pc(13) long local13 = System.currentTimeMillis();
			@Pc(19) long local19 = (local13 - aLong12) / 10L;
			if (local19 > 250L) {
				local19 = 250L;
			}
			aLong12 = local13;
			method211(aByte28, 2);
			aClass1_Sub3_Sub3_7.method373(11);
			aClass1_Sub3_Sub3_7.method373((int) local19);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("48600, " + -366 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static synchronized void method219() {
		try {
			anInt349++;
			@Pc(18) long local18 = System.currentTimeMillis();
			@Pc(24) long local24 = (local18 - aLong12) / 10L;
			if (local24 > 250L) {
				local24 = 250L;
			}
			aLong12 = local18;
			method211(aByte28, 2);
			aClass1_Sub3_Sub3_7.method373(12);
			aClass1_Sub3_Sub3_7.method373((int) local24);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("51497, " + 4 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public static synchronized void method220() {
		try {
			anInt349++;
			@Pc(15) long local15 = System.currentTimeMillis();
			@Pc(21) long local21 = (local15 - aLong12) / 10L;
			if (local21 > 250L) {
				local21 = 250L;
			}
			aLong12 = local15;
			method211(aByte28, 2);
			aClass1_Sub3_Sub3_7.method373(13);
			aClass1_Sub3_Sub3_7.method373((int) local21);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("70377, " + 45508 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
