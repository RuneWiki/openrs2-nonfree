import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!e")
public final class Class8 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Z")
	private static boolean aBoolean65;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	private static int anInt243;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Z")
	public static boolean aBoolean66;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "J")
	private static long aLong8;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	private static int anInt244;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private static int anInt245;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private static int anInt242 = -992;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_4 = null;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_5 = null;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method185() {
		try {
			aClass1_Sub3_Sub3_4 = Class1_Sub3_Sub3.method369();
			aLong8 = System.currentTimeMillis();
			aBoolean66 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("61082, " + -282 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method186() {
		try {
			aBoolean66 = false;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("22512, " + 6 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)Lclient!kb;")
	public static Class1_Sub3_Sub3 method187() {
		try {
			@Pc(1) Class1_Sub3_Sub3 local1 = null;
			if (aClass1_Sub3_Sub3_5 != null) {
				local1 = aClass1_Sub3_Sub3_5;
				aClass1_Sub3_Sub3_5 = null;
			}
			return local1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("60284, " + -800 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBI)V")
	public static void method188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
				@Pc(13) int local13 = method197();
				method198(5);
				aClass1_Sub3_Sub3_4.method372(1);
				aClass1_Sub3_Sub3_4.method372(local13);
				aClass1_Sub3_Sub3_4.method374(arg1 + (arg0 << 10));
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("97155, " + arg0 + ", " + -58 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
	public static void method189(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(2) int local2 = method197();
			method198(2);
			if (!arg0) {
				anInt242 = -325;
			}
			aClass1_Sub3_Sub3_4.method372(3);
			aClass1_Sub3_Sub3_4.method372(local2);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("62943, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZII)V")
	public static void method190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532) {
				@Pc(17) int local17 = method197();
				if (anInt244 - arg1 < 8 && anInt244 - arg1 >= -8 && anInt245 - arg0 < 8 && anInt245 - arg0 >= -8) {
					method198(3);
					aClass1_Sub3_Sub3_4.method372(5);
					aClass1_Sub3_Sub3_4.method372(local17);
					aClass1_Sub3_Sub3_4.method372(anInt244 + (anInt245 - arg0 + 8 << 4) + 8 - arg1);
				} else if (anInt244 - arg1 < 128 && anInt244 - arg1 >= -128 && anInt245 - arg0 < 128 && anInt245 - arg0 >= -128) {
					method198(4);
					aClass1_Sub3_Sub3_4.method372(6);
					aClass1_Sub3_Sub3_4.method372(local17);
					aClass1_Sub3_Sub3_4.method372(anInt244 + 128 - arg1);
					aClass1_Sub3_Sub3_4.method372(anInt245 + 128 - arg0);
				} else {
					method198(5);
					aClass1_Sub3_Sub3_4.method372(7);
					aClass1_Sub3_Sub3_4.method372(local17);
					aClass1_Sub3_Sub3_4.method374(arg1 + (arg0 << 10));
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("71993, " + true + ", " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V")
	public static void method191(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = method197();
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
			method198(3);
			aClass1_Sub3_Sub3_4.method372(8);
			aClass1_Sub3_Sub3_4.method372(local2);
			aClass1_Sub3_Sub3_4.method372(arg0);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("72017, " + arg0 + ", " + true + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
	public static void method192(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = method197();
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
			method198(3);
			if (arg0 == -63) {
				aClass1_Sub3_Sub3_4.method372(9);
				aClass1_Sub3_Sub3_4.method372(local2);
				aClass1_Sub3_Sub3_4.method372(arg1);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("76337, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
	public static void method193(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(2) int local2 = method197();
			method198(2);
			aClass1_Sub3_Sub3_4.method372(10);
			if (arg0) {
				aBoolean65 = !aBoolean65;
			}
			aClass1_Sub3_Sub3_4.method372(local2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("7995, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method194(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(11) int local11 = method197();
			method198(2);
			aClass1_Sub3_Sub3_4.method372(11);
			aClass1_Sub3_Sub3_4.method372(local11);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("30270, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static void method195() {
		try {
			@Pc(5) int local5 = method197();
			method198(2);
			aClass1_Sub3_Sub3_4.method372(12);
			aClass1_Sub3_Sub3_4.method372(local5);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("21009, " + -611 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public static void method196() {
		try {
			@Pc(2) int local2 = method197();
			method198(2);
			aClass1_Sub3_Sub3_4.method372(13);
			aClass1_Sub3_Sub3_4.method372(local2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("72049, " + 66 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)I")
	private static int method197() {
		try {
			@Pc(1) long local1 = System.currentTimeMillis();
			@Pc(12) long local12 = (local1 - aLong8) / 10L;
			if (local12 > 250L) {
				local12 = 250L;
			}
			aLong8 = local1;
			return (int) local12;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("28076, " + 34564 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	private static void method198(@OriginalArg(1) int arg0) {
		try {
			if (aClass1_Sub3_Sub3_4.anInt433 + arg0 >= 500) {
				@Pc(12) Class1_Sub3_Sub3 local12 = aClass1_Sub3_Sub3_4;
				aClass1_Sub3_Sub3_4 = Class1_Sub3_Sub3.method369();
				aClass1_Sub3_Sub3_5 = local12;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("64706, " + -178 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}
}
