import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!e")
public final class Class8 {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
	public static boolean aBoolean86;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "J")
	private static long aLong11;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "J")
	private static long aLong12;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	private static int anInt332;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private static int anInt333;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private static int anInt334;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Z")
	private static boolean aBoolean85 = true;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private static int anInt331 = 339;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_7 = null;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_8 = null;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static synchronized void method197(@OriginalArg(0) int arg0) {
		try {
			aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method359();
			aLong12 = System.currentTimeMillis();
			@Pc(9) boolean local9 = false;
			aBoolean86 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("58098, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZ)V")
	public static synchronized void method198(@OriginalArg(1) boolean arg0) {
		try {
			aBoolean86 = false;
			if (arg0) {
				method200(499);
			} else {
				if (aClass1_Sub3_Sub3_7 != null) {
					aClass1_Sub3_Sub3_7.anInt539 = 0;
				}
				aClass1_Sub3_Sub3_8 = null;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("6744, " + true + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Lclient!kb;")
	public static synchronized Class1_Sub3_Sub3 method199() {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = null;
			if (aClass1_Sub3_Sub3_8 != null) {
				local11 = aClass1_Sub3_Sub3_8;
				aClass1_Sub3_Sub3_8 = null;
			}
			return local11;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("79568, " + 38238 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	private static synchronized void method200(@OriginalArg(0) int arg0) {
		try {
			if (aClass1_Sub3_Sub3_7.anInt539 + arg0 >= 500) {
				@Pc(20) Class1_Sub3_Sub3 local20 = aClass1_Sub3_Sub3_7;
				aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method359();
				aClass1_Sub3_Sub3_8 = local20;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("18661, " + arg0 + ", " + -604 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZ)V")
	public static synchronized void method201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532) {
				anInt332++;
				@Pc(20) long local20 = System.currentTimeMillis();
				@Pc(26) long local26 = (local20 - aLong12) / 10L;
				if (local26 > 250L) {
					local26 = 250L;
				}
				aLong12 = local20;
				method200(5);
				if (arg2 == 1) {
					aClass1_Sub3_Sub3_7.method362(1);
				} else {
					aClass1_Sub3_Sub3_7.method362(2);
				}
				aClass1_Sub3_Sub3_7.method362((int) local26);
				aClass1_Sub3_Sub3_7.method365(arg0 + (arg1 << 10));
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("59152, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
	public static synchronized void method202(@OriginalArg(0) int arg0) {
		try {
			anInt332++;
			@Pc(17) long local17 = System.currentTimeMillis();
			@Pc(23) long local23 = (local17 - aLong12) / 10L;
			if (local23 > 250L) {
				local23 = 250L;
			}
			aLong12 = local17;
			method200(2);
			if (arg0 == 1) {
				aClass1_Sub3_Sub3_7.method362(3);
			} else {
				aClass1_Sub3_Sub3_7.method362(4);
			}
			aClass1_Sub3_Sub3_7.method362((int) local23);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("56496, " + arg0 + ", " + 1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public static synchronized void method203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
				@Pc(14) long local14 = System.currentTimeMillis();
				if (local14 - aLong11 >= 50L) {
					aLong11 = local14;
					anInt332++;
					@Pc(41) long local41 = (local14 - aLong12) / 10L;
					if (local41 > 250L) {
						local41 = 250L;
					}
					aLong12 = local14;
					if (arg1 - anInt333 < 8 && arg1 - anInt333 >= -8 && arg0 - anInt334 < 8 && arg0 - anInt334 >= -8) {
						method200(3);
						aClass1_Sub3_Sub3_7.method362(5);
						aClass1_Sub3_Sub3_7.method362((int) local41);
						aClass1_Sub3_Sub3_7.method362(arg1 + (arg0 - anInt334 + 8 << 4) + 8 - anInt333);
					} else if (arg1 - anInt333 < 128 && arg1 - anInt333 >= -128 && arg0 - anInt334 < 128 && arg0 - anInt334 >= -128) {
						method200(4);
						aClass1_Sub3_Sub3_7.method362(6);
						aClass1_Sub3_Sub3_7.method362((int) local41);
						aClass1_Sub3_Sub3_7.method362(arg1 + 128 - anInt333);
						aClass1_Sub3_Sub3_7.method362(arg0 + 128 - anInt334);
					} else {
						method200(5);
						aClass1_Sub3_Sub3_7.method362(7);
						aClass1_Sub3_Sub3_7.method362((int) local41);
						aClass1_Sub3_Sub3_7.method365(arg1 + (arg0 << 10));
					}
					anInt333 = arg1;
					anInt334 = arg0;
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("42622, " + ", " + arg0 + ", " + arg1 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V")
	public static synchronized void method204(@OriginalArg(0) int arg0) {
		try {
			anInt332++;
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
			method200(3);
			aClass1_Sub3_Sub3_7.method362(8);
			aClass1_Sub3_Sub3_7.method362((int) local14);
			aClass1_Sub3_Sub3_7.method362(arg0);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("89878, " + arg0 + ", " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
	public static synchronized void method205(@OriginalArg(1) int arg0) {
		try {
			anInt332++;
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
			method200(3);
			aClass1_Sub3_Sub3_7.method362(9);
			aClass1_Sub3_Sub3_7.method362((int) local11);
			aClass1_Sub3_Sub3_7.method362(arg0);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("71830, " + -11 + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static synchronized void method206() {
		try {
			anInt332++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(15) long local15 = (local5 - aLong12) / 10L;
			if (local15 > 250L) {
				local15 = 250L;
			}
			aLong12 = local5;
			method200(2);
			aClass1_Sub3_Sub3_7.method362(10);
			aClass1_Sub3_Sub3_7.method362((int) local15);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("5870, " + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static synchronized void method207() {
		try {
			anInt332++;
			@Pc(9) long local9 = System.currentTimeMillis();
			@Pc(15) long local15 = (local9 - aLong12) / 10L;
			if (local15 > 250L) {
				local15 = 250L;
			}
			aLong12 = local9;
			method200(2);
			aClass1_Sub3_Sub3_7.method362(11);
			aClass1_Sub3_Sub3_7.method362((int) local15);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("88238, " + 3 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static synchronized void method208() {
		try {
			anInt332++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(20) long local20 = (local5 - aLong12) / 10L;
			if (local20 > 250L) {
				local20 = 250L;
			}
			aLong12 = local5;
			method200(2);
			aClass1_Sub3_Sub3_7.method362(12);
			aClass1_Sub3_Sub3_7.method362((int) local20);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("64767, " + -27585 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public static synchronized void method209() {
		try {
			anInt332++;
			@Pc(5) long local5 = System.currentTimeMillis();
			@Pc(11) long local11 = (local5 - aLong12) / 10L;
			if (local11 > 250L) {
				local11 = 250L;
			}
			aLong12 = local5;
			method200(2);
			aClass1_Sub3_Sub3_7.method362(13);
			aClass1_Sub3_Sub3_7.method362((int) local11);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("62938, " + -124 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
