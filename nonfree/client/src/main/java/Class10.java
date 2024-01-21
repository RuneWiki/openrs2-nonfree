import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Z")
	public static boolean aBoolean99;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "J")
	private static long aLong15;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	private static int anInt535;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "J")
	private static long aLong16;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	private static int anInt536;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private static int anInt537;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Z")
	private static boolean aBoolean98 = true;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private static int anInt533 = 353;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	private static int anInt534 = 668;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = null;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = null;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public static synchronized void method256() {
		try {
			aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method454();
			aClass1_Sub1_Sub3_7 = null;
			aLong15 = System.currentTimeMillis();
			aBoolean99 = true;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("83261, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static synchronized void method257() {
		try {
			aBoolean99 = false;
			aClass1_Sub1_Sub3_6 = null;
			aClass1_Sub1_Sub3_7 = null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("86582, " + 49423 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method258() {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_7 != null && aBoolean99) {
				local1 = aClass1_Sub1_Sub3_7;
			}
			aClass1_Sub1_Sub3_7 = null;
			return local1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("65370, " + 451 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method259() {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_6 != null && aClass1_Sub1_Sub3_6.anInt771 > 0 && aBoolean99) {
				local1 = aClass1_Sub1_Sub3_6;
			}
			method257();
			return local1;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("62743, " + 106 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
	private static synchronized void method260(@OriginalArg(0) int arg0) {
		try {
			if (aClass1_Sub1_Sub3_6.anInt771 + arg0 >= 500) {
				@Pc(15) Class1_Sub1_Sub3 local15 = aClass1_Sub1_Sub3_6;
				aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method454();
				aClass1_Sub1_Sub3_7 = local15;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("31163, " + arg0 + ", " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	public static synchronized void method261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (aBoolean99 && (arg0 >= 0 && arg0 < 789 && arg2 >= 0 && arg2 < 532)) {
				anInt535++;
				@Pc(19) long local19 = System.currentTimeMillis();
				@Pc(25) long local25 = (local19 - aLong15) / 10L;
				if (local25 > 250L) {
					local25 = 250L;
				}
				aLong15 = local19;
				method260(5);
				if (arg1 == 1) {
					aClass1_Sub1_Sub3_6.method457(1);
				} else {
					aClass1_Sub1_Sub3_6.method457(2);
				}
				aClass1_Sub1_Sub3_6.method457((int) local25);
				aClass1_Sub1_Sub3_6.method460(arg0 + (arg2 << 10));
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("31635, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
	public static synchronized void method262(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean99) {
				anInt535++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong15) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong15 = local8;
				method260(2);
				if (arg0 == 1) {
					aClass1_Sub1_Sub3_6.method457(3);
				} else {
					aClass1_Sub1_Sub3_6.method457(4);
				}
				aClass1_Sub1_Sub3_6.method457((int) local14);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("17144, " + false + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZ)V")
	public static synchronized void method263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aBoolean99 && (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532)) {
				@Pc(20) long local20 = System.currentTimeMillis();
				if (local20 - aLong16 >= 50L) {
					aLong16 = local20;
					anInt535++;
					@Pc(38) long local38 = (local20 - aLong15) / 10L;
					if (local38 > 250L) {
						local38 = 250L;
					}
					aLong15 = local20;
					if (arg1 - anInt536 < 8 && arg1 - anInt536 >= -8 && arg0 - anInt537 < 8 && arg0 - anInt537 >= -8) {
						method260(3);
						aClass1_Sub1_Sub3_6.method457(5);
						aClass1_Sub1_Sub3_6.method457((int) local38);
						aClass1_Sub1_Sub3_6.method457(arg1 + (arg0 - anInt537 + 8 << 4) + 8 - anInt536);
					} else if (arg1 - anInt536 < 128 && arg1 - anInt536 >= -128 && arg0 - anInt537 < 128 && arg0 - anInt537 >= -128) {
						method260(4);
						aClass1_Sub1_Sub3_6.method457(6);
						aClass1_Sub1_Sub3_6.method457((int) local38);
						aClass1_Sub1_Sub3_6.method457(arg1 + 128 - anInt536);
						aClass1_Sub1_Sub3_6.method457(arg0 + 128 - anInt537);
					} else {
						method260(5);
						aClass1_Sub1_Sub3_6.method457(7);
						aClass1_Sub1_Sub3_6.method457((int) local38);
						aClass1_Sub1_Sub3_6.method460(arg1 + (arg0 << 10));
					}
					anInt536 = arg1;
					anInt537 = arg0;
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("70226, " + arg0 + ", " + arg1 + ", " + false + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public static synchronized void method264(@OriginalArg(0) int arg0) {
		try {
			if (aBoolean99) {
				anInt535++;
				@Pc(13) long local13 = System.currentTimeMillis();
				@Pc(19) long local19 = (local13 - aLong15) / 10L;
				if (local19 > 250L) {
					local19 = 250L;
				}
				aLong15 = local13;
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
				method260(3);
				aClass1_Sub1_Sub3_6.method457(8);
				aClass1_Sub1_Sub3_6.method457((int) local19);
				aClass1_Sub1_Sub3_6.method457(arg0);
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("5554, " + arg0 + ", " + 1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(ZI)V")
	public static synchronized void method265(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean99) {
				anInt535++;
				@Pc(17) long local17 = System.currentTimeMillis();
				@Pc(23) long local23 = (local17 - aLong15) / 10L;
				if (local23 > 250L) {
					local23 = 250L;
				}
				aLong15 = local17;
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
				method260(3);
				aClass1_Sub1_Sub3_6.method457(9);
				aClass1_Sub1_Sub3_6.method457((int) local23);
				aClass1_Sub1_Sub3_6.method457(arg0);
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("48671, " + false + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public static synchronized void method266() {
		try {
			if (aBoolean99) {
				anInt535++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong15) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong15 = local8;
				method260(2);
				aClass1_Sub1_Sub3_6.method457(10);
				aClass1_Sub1_Sub3_6.method457((int) local14);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("36617, " + -35 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public static synchronized void method267(@OriginalArg(0) int arg0) {
		try {
			if (aBoolean99) {
				anInt535++;
				@Pc(10) boolean local10 = false;
				@Pc(12) long local12 = System.currentTimeMillis();
				@Pc(18) long local18 = (local12 - aLong15) / 10L;
				if (local18 > 250L) {
					local18 = 250L;
				}
				aLong15 = local12;
				method260(2);
				aClass1_Sub1_Sub3_6.method457(11);
				aClass1_Sub1_Sub3_6.method457((int) local18);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("17622, " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
	public static synchronized void method268() {
		try {
			if (aBoolean99) {
				anInt535++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong15) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong15 = local8;
				method260(2);
				aClass1_Sub1_Sub3_6.method457(12);
				aClass1_Sub1_Sub3_6.method457((int) local14);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("23319, " + true + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public static synchronized void method269() {
		try {
			if (aBoolean99) {
				anInt535++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong15) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong15 = local8;
				method260(2);
				aClass1_Sub1_Sub3_6.method457(13);
				aClass1_Sub1_Sub3_6.method457((int) local14);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("69652, " + -348 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
