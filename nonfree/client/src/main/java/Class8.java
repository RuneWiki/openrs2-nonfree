import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!e")
public final class Class8 {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Z")
	private static boolean aBoolean79;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	private static boolean aBoolean80;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
	public static boolean aBoolean81;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "J")
	private static long aLong11;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private static int anInt350;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "J")
	private static long aLong12;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	private static int anInt351;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	private static int anInt352;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private static int anInt348 = 505;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private static int anInt349 = 3;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_7 = null;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_8 = null;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static synchronized void method208() {
		try {
			aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method378();
			aClass1_Sub3_Sub3_8 = null;
			aLong11 = System.currentTimeMillis();
			aBoolean81 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("93667, " + -42259 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static synchronized void method209() {
		try {
			aBoolean81 = false;
			aClass1_Sub3_Sub3_7 = null;
			aClass1_Sub3_Sub3_8 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("4275, " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)Lclient!kb;")
	public static synchronized Class1_Sub3_Sub3 method210(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) Class1_Sub3_Sub3 local1 = null;
			if (aClass1_Sub3_Sub3_8 != null && aBoolean81) {
				local1 = aClass1_Sub3_Sub3_8;
			}
			aClass1_Sub3_Sub3_8 = null;
			@Pc(13) boolean local13 = false;
			return local1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("11853, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Lclient!kb;")
	public static synchronized Class1_Sub3_Sub3 method211() {
		try {
			@Pc(10) Class1_Sub3_Sub3 local10 = null;
			if (aClass1_Sub3_Sub3_7 != null && aClass1_Sub3_Sub3_7.anInt554 > 0 && aBoolean81) {
				local10 = aClass1_Sub3_Sub3_7;
			}
			method209();
			return local10;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("55545, " + 29 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	private static synchronized void method212(@OriginalArg(1) int arg0) {
		try {
			if (aClass1_Sub3_Sub3_7.anInt554 + arg0 >= 500) {
				@Pc(13) Class1_Sub3_Sub3 local13 = aClass1_Sub3_Sub3_7;
				aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method378();
				aClass1_Sub3_Sub3_8 = local13;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("34399, " + -490 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZ)V")
	public static synchronized void method213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (aBoolean81 && (arg2 >= 0 && arg2 < 789 && arg1 >= 0 && arg1 < 532)) {
				anInt350++;
				@Pc(22) long local22 = System.currentTimeMillis();
				@Pc(28) long local28 = (local22 - aLong11) / 10L;
				if (local28 > 250L) {
					local28 = 250L;
				}
				aLong11 = local22;
				method212(5);
				if (arg0 == 1) {
					aClass1_Sub3_Sub3_7.method381(1);
				} else {
					aClass1_Sub3_Sub3_7.method381(2);
				}
				aClass1_Sub3_Sub3_7.method381((int) local28);
				aClass1_Sub3_Sub3_7.method384(arg2 + (arg1 << 10));
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("11912, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
	public static synchronized void method214(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean81) {
				anInt350++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong11) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong11 = local8;
				method212(2);
				if (arg0 == 1) {
					aClass1_Sub3_Sub3_7.method381(3);
				} else {
					aClass1_Sub3_Sub3_7.method381(4);
				}
				aClass1_Sub3_Sub3_7.method381((int) local14);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("76963, " + -8 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public static synchronized void method215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aBoolean81 && (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532)) {
				@Pc(17) long local17 = System.currentTimeMillis();
				if (local17 - aLong12 >= 50L) {
					aLong12 = local17;
					anInt350++;
					@Pc(40) long local40 = (local17 - aLong11) / 10L;
					if (local40 > 250L) {
						local40 = 250L;
					}
					aLong11 = local17;
					if (arg0 - anInt351 < 8 && arg0 - anInt351 >= -8 && arg1 - anInt352 < 8 && arg1 - anInt352 >= -8) {
						method212(3);
						aClass1_Sub3_Sub3_7.method381(5);
						aClass1_Sub3_Sub3_7.method381((int) local40);
						aClass1_Sub3_Sub3_7.method381(arg0 + (arg1 - anInt352 + 8 << 4) + 8 - anInt351);
					} else if (arg0 - anInt351 < 128 && arg0 - anInt351 >= -128 && arg1 - anInt352 < 128 && arg1 - anInt352 >= -128) {
						method212(4);
						aClass1_Sub3_Sub3_7.method381(6);
						aClass1_Sub3_Sub3_7.method381((int) local40);
						aClass1_Sub3_Sub3_7.method381(arg0 + 128 - anInt351);
						aClass1_Sub3_Sub3_7.method381(arg1 + 128 - anInt352);
					} else {
						method212(5);
						aClass1_Sub3_Sub3_7.method381(7);
						aClass1_Sub3_Sub3_7.method381((int) local40);
						aClass1_Sub3_Sub3_7.method384(arg0 + (arg1 << 10));
					}
					anInt351 = arg0;
					anInt352 = arg1;
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("73308, " + -649 + ", " + arg0 + ", " + arg1 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
	public static synchronized void method216(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean81) {
				anInt350++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong11) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong11 = local8;
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
				method212(3);
				aClass1_Sub3_Sub3_7.method381(8);
				aClass1_Sub3_Sub3_7.method381((int) local14);
				aClass1_Sub3_Sub3_7.method381(arg0);
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("58401, " + 11306 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(II)V")
	public static synchronized void method217(@OriginalArg(0) int arg0) {
		try {
			if (aBoolean81) {
				anInt350++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong11) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong11 = local8;
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
				method212(3);
				aClass1_Sub3_Sub3_7.method381(9);
				aClass1_Sub3_Sub3_7.method381((int) local14);
				aClass1_Sub3_Sub3_7.method381(arg0);
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("2544, " + arg0 + ", " + 6 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static synchronized void method218() {
		try {
			if (aBoolean81) {
				anInt350++;
				@Pc(8) long local8 = System.currentTimeMillis();
				if (anInt349 > 3 || anInt349 < 3) {
					anInt348 = 77;
				}
				@Pc(22) long local22 = (local8 - aLong11) / 10L;
				if (local22 > 250L) {
					local22 = 250L;
				}
				aLong11 = local8;
				method212(2);
				aClass1_Sub3_Sub3_7.method381(10);
				aClass1_Sub3_Sub3_7.method381((int) local22);
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("53093, " + 3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public static synchronized void method219(@OriginalArg(0) byte arg0) {
		try {
			if (aBoolean81) {
				anInt350++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong11) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong11 = local8;
				if (arg0 != 125) {
					aBoolean78 = !aBoolean78;
				}
				method212(2);
				aClass1_Sub3_Sub3_7.method381(11);
				aClass1_Sub3_Sub3_7.method381((int) local14);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("11542, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public static synchronized void method220() {
		try {
			if (aBoolean81) {
				anInt350++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong11) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong11 = local8;
				method212(2);
				aClass1_Sub3_Sub3_7.method381(12);
				aClass1_Sub3_Sub3_7.method381((int) local14);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("26611, " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
	public static synchronized void method221() {
		try {
			if (aBoolean81) {
				anInt350++;
				@Pc(17) long local17 = System.currentTimeMillis();
				@Pc(23) long local23 = (local17 - aLong11) / 10L;
				if (local23 > 250L) {
					local23 = 250L;
				}
				aLong11 = local17;
				method212(2);
				aClass1_Sub3_Sub3_7.method381(13);
				aClass1_Sub3_Sub3_7.method381((int) local23);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("80670, " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}
}
