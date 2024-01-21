import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private static int anInt536;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Z")
	private static boolean aBoolean115;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "I")
	private static int anInt537;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Z")
	public static boolean aBoolean116;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "J")
	private static long aLong21;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	private static int anInt538;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "J")
	private static long aLong22;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private static int anInt539;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	private static int anInt540;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Z")
	private static boolean aBoolean114 = true;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = null;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = null;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static synchronized void method265() {
		try {
			aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method483();
			aClass1_Sub1_Sub3_7 = null;
			aLong21 = System.currentTimeMillis();
			aBoolean116 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("21777, " + 7 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public static synchronized void method266() {
		try {
			aBoolean116 = false;
			aClass1_Sub1_Sub3_6 = null;
			aClass1_Sub1_Sub3_7 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("77241, " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method267(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_7 != null && aBoolean116) {
				local1 = aClass1_Sub1_Sub3_7;
			}
			aClass1_Sub1_Sub3_7 = null;
			if (arg0 != 43763) {
				throw new NullPointerException();
			}
			return local1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("88264, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method268() {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_6 != null && aClass1_Sub1_Sub3_6.anInt778 > 0 && aBoolean116) {
				local1 = aClass1_Sub1_Sub3_6;
			}
			method266();
			return local1;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("70342, " + -689 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
	private static synchronized void method269(@OriginalArg(0) int arg0) {
		try {
			if (aClass1_Sub1_Sub3_6.anInt778 + arg0 >= 500) {
				@Pc(16) Class1_Sub1_Sub3 local16 = aClass1_Sub1_Sub3_6;
				aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method483();
				aClass1_Sub1_Sub3_7 = local16;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("20104, " + arg0 + ", " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	public static synchronized void method270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (aBoolean116 && (arg2 >= 0 && arg2 < 789 && arg0 >= 0 && arg0 < 532)) {
				anInt538++;
				@Pc(19) long local19 = System.currentTimeMillis();
				@Pc(25) long local25 = (local19 - aLong21) / 10L;
				if (local25 > 250L) {
					local25 = 250L;
				}
				aLong21 = local19;
				method269(5);
				if (arg1 == 1) {
					aClass1_Sub1_Sub3_6.method486(1);
				} else {
					aClass1_Sub1_Sub3_6.method486(2);
				}
				aClass1_Sub1_Sub3_6.method486((int) local25);
				aClass1_Sub1_Sub3_6.method489(arg2 + (arg0 << 10));
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("31689, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -241 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public static synchronized void method271(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean116) {
				anInt538++;
				@Pc(11) long local11 = System.currentTimeMillis();
				@Pc(17) long local17 = (local11 - aLong21) / 10L;
				if (local17 > 250L) {
					local17 = 250L;
				}
				aLong21 = local11;
				method269(2);
				if (arg0 == 1) {
					aClass1_Sub1_Sub3_6.method486(3);
				} else {
					aClass1_Sub1_Sub3_6.method486(4);
				}
				aClass1_Sub1_Sub3_6.method486((int) local17);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("65099, " + 0 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZII)V")
	public static synchronized void method272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aBoolean116 && (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532)) {
				@Pc(17) long local17 = System.currentTimeMillis();
				if (local17 - aLong22 >= 50L) {
					aLong22 = local17;
					anInt538++;
					@Pc(39) long local39 = (local17 - aLong21) / 10L;
					if (local39 > 250L) {
						local39 = 250L;
					}
					aLong21 = local17;
					if (arg0 - anInt539 < 8 && arg0 - anInt539 >= -8 && arg1 - anInt540 < 8 && arg1 - anInt540 >= -8) {
						method269(3);
						aClass1_Sub1_Sub3_6.method486(5);
						aClass1_Sub1_Sub3_6.method486((int) local39);
						aClass1_Sub1_Sub3_6.method486(arg0 + (arg1 - anInt540 + 8 << 4) + 8 - anInt539);
					} else if (arg0 - anInt539 < 128 && arg0 - anInt539 >= -128 && arg1 - anInt540 < 128 && arg1 - anInt540 >= -128) {
						method269(4);
						aClass1_Sub1_Sub3_6.method486(6);
						aClass1_Sub1_Sub3_6.method486((int) local39);
						aClass1_Sub1_Sub3_6.method486(arg0 + 128 - anInt539);
						aClass1_Sub1_Sub3_6.method486(arg1 + 128 - anInt540);
					} else {
						method269(5);
						aClass1_Sub1_Sub3_6.method486(7);
						aClass1_Sub1_Sub3_6.method486((int) local39);
						aClass1_Sub1_Sub3_6.method489(arg0 + (arg1 << 10));
					}
					anInt539 = arg0;
					anInt540 = arg1;
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("52361, " + true + ", " + arg0 + ", " + arg1 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IZ)V")
	public static synchronized void method273(@OriginalArg(0) int arg0) {
		try {
			if (aBoolean116) {
				anInt538++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
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
				method269(3);
				aClass1_Sub1_Sub3_6.method486(8);
				aClass1_Sub1_Sub3_6.method486((int) local14);
				aClass1_Sub1_Sub3_6.method486(arg0);
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("96124, " + arg0 + ", " + false + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
	public static synchronized void method274(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean116) {
				anInt538++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
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
				method269(3);
				aClass1_Sub1_Sub3_6.method486(9);
				aClass1_Sub1_Sub3_6.method486((int) local14);
				aClass1_Sub1_Sub3_6.method486(arg0);
				if (anInt536 > 0 || anInt536 < 0) {
					for (@Pc(67) int local67 = 1; local67 > 0; local67++) {
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("32430, " + 0 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public static synchronized void method275() {
		try {
			if (aBoolean116) {
				anInt538++;
				@Pc(11) long local11 = System.currentTimeMillis();
				@Pc(17) long local17 = (local11 - aLong21) / 10L;
				if (local17 > 250L) {
					local17 = 250L;
				}
				aLong21 = local11;
				method269(2);
				aClass1_Sub1_Sub3_6.method486(10);
				aClass1_Sub1_Sub3_6.method486((int) local17);
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("49381, " + -657 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
	public static synchronized void method276() {
		try {
			if (aBoolean116) {
				anInt538++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				method269(2);
				aClass1_Sub1_Sub3_6.method486(11);
				aClass1_Sub1_Sub3_6.method486((int) local14);
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("17559, " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static synchronized void method277() {
		try {
			if (aBoolean116) {
				anInt538++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				method269(2);
				aClass1_Sub1_Sub3_6.method486(12);
				aClass1_Sub1_Sub3_6.method486((int) local14);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("82378, " + 73 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public static synchronized void method278() {
		try {
			if (aBoolean116) {
				anInt538++;
				@Pc(11) long local11 = System.currentTimeMillis();
				@Pc(17) long local17 = (local11 - aLong21) / 10L;
				if (local17 > 250L) {
					local17 = 250L;
				}
				aLong21 = local11;
				method269(2);
				aClass1_Sub1_Sub3_6.method486(13);
				aClass1_Sub1_Sub3_6.method486((int) local17);
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("1962, " + -745 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
