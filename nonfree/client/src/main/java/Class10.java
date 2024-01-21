import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "d", descriptor = "I")
	private static int anInt548;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Z")
	public static boolean aBoolean125;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "J")
	private static long aLong21;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	private static int anInt549;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "J")
	private static long aLong22;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private static int anInt550;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	private static int anInt551;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private static int anInt547 = 32319;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "B")
	private static byte aByte33 = 9;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Z")
	private static boolean aBoolean124 = true;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = null;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = null;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static synchronized void method266() {
		try {
			aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method485();
			aClass1_Sub1_Sub3_7 = null;
			aLong21 = System.currentTimeMillis();
			aBoolean125 = true;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("90429, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static synchronized void method267() {
		try {
			aBoolean125 = false;
			aClass1_Sub1_Sub3_6 = null;
			aClass1_Sub1_Sub3_7 = null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("7845, " + 86 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method268(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_7 != null && aBoolean125) {
				local1 = aClass1_Sub1_Sub3_7;
			}
			aClass1_Sub1_Sub3_7 = null;
			if (arg0 <= 0) {
				for (@Pc(13) int local13 = 1; local13 > 0; local13++) {
				}
			}
			return local1;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("87902, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method269() {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_6 != null && aClass1_Sub1_Sub3_6.anInt796 > 0 && aBoolean125) {
				local1 = aClass1_Sub1_Sub3_6;
			}
			method267();
			return local1;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("5338, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	private static synchronized void method270(@OriginalArg(0) int arg0) {
		try {
			if (aClass1_Sub1_Sub3_6.anInt796 + arg0 >= 500) {
				@Pc(16) Class1_Sub1_Sub3 local16 = aClass1_Sub1_Sub3_6;
				aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method485();
				aClass1_Sub1_Sub3_7 = local16;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("49581, " + arg0 + ", " + -106 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIB)V")
	public static synchronized void method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (aBoolean125 && (arg2 >= 0 && arg2 < 789 && arg0 >= 0 && arg0 < 532)) {
				anInt549++;
				@Pc(19) long local19 = System.currentTimeMillis();
				@Pc(34) long local34 = (local19 - aLong21) / 10L;
				if (local34 > 250L) {
					local34 = 250L;
				}
				aLong21 = local19;
				method270(5);
				if (arg1 == 1) {
					aClass1_Sub1_Sub3_6.method488(1);
				} else {
					aClass1_Sub1_Sub3_6.method488(2);
				}
				aClass1_Sub1_Sub3_6.method488((int) local34);
				aClass1_Sub1_Sub3_6.method491(arg2 + (arg0 << 10));
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("65481, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 118 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public static synchronized void method272(@OriginalArg(0) int arg0) {
		try {
			if (aBoolean125) {
				anInt549++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				method270(2);
				if (arg0 == 1) {
					aClass1_Sub1_Sub3_6.method488(3);
				} else {
					aClass1_Sub1_Sub3_6.method488(4);
				}
				aClass1_Sub1_Sub3_6.method488((int) local14);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("38478, " + arg0 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public static synchronized void method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (aBoolean125 && (arg2 >= 0 && arg2 < 789 && arg1 >= 0 && arg1 < 532)) {
				@Pc(17) long local17 = System.currentTimeMillis();
				if (arg0 != anInt547) {
					anInt548 = -260;
				}
				if (local17 - aLong22 >= 50L) {
					aLong22 = local17;
					anInt549++;
					@Pc(40) long local40 = (local17 - aLong21) / 10L;
					if (local40 > 250L) {
						local40 = 250L;
					}
					aLong21 = local17;
					if (arg2 - anInt550 < 8 && arg2 - anInt550 >= -8 && arg1 - anInt551 < 8 && arg1 - anInt551 >= -8) {
						method270(3);
						aClass1_Sub1_Sub3_6.method488(5);
						aClass1_Sub1_Sub3_6.method488((int) local40);
						aClass1_Sub1_Sub3_6.method488(arg2 + (arg1 - anInt551 + 8 << 4) + 8 - anInt550);
					} else if (arg2 - anInt550 < 128 && arg2 - anInt550 >= -128 && arg1 - anInt551 < 128 && arg1 - anInt551 >= -128) {
						method270(4);
						aClass1_Sub1_Sub3_6.method488(6);
						aClass1_Sub1_Sub3_6.method488((int) local40);
						aClass1_Sub1_Sub3_6.method488(arg2 + 128 - anInt550);
						aClass1_Sub1_Sub3_6.method488(arg1 + 128 - anInt551);
					} else {
						method270(5);
						aClass1_Sub1_Sub3_6.method488(7);
						aClass1_Sub1_Sub3_6.method488((int) local40);
						aClass1_Sub1_Sub3_6.method491(arg2 + (arg1 << 10));
					}
					anInt550 = arg2;
					anInt551 = arg1;
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("40150, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
	public static synchronized void method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aBoolean125) {
				anInt549++;
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
				method270(3);
				if (arg1 == -1837) {
					aClass1_Sub1_Sub3_6.method488(8);
					aClass1_Sub1_Sub3_6.method488((int) local14);
					aClass1_Sub1_Sub3_6.method488(arg0);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("81807, " + arg0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(II)V")
	public static synchronized void method275(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean125) {
				anInt549++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(17) long local17 = (local8 - aLong21) / 10L;
				if (local17 > 250L) {
					local17 = 250L;
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
				method270(3);
				aClass1_Sub1_Sub3_6.method488(9);
				aClass1_Sub1_Sub3_6.method488((int) local17);
				aClass1_Sub1_Sub3_6.method488(arg0);
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("83647, " + 0 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public static synchronized void method276(@OriginalArg(0) byte arg0) {
		try {
			if (aBoolean125) {
				anInt549++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				if (aByte33 == 9) {
					@Pc(27) boolean local27 = false;
					method270(2);
					aClass1_Sub1_Sub3_6.method488(10);
					aClass1_Sub1_Sub3_6.method488((int) local14);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("30392, " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public static synchronized void method277(@OriginalArg(0) int arg0) {
		try {
			if (aBoolean125) {
				anInt549++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				if (arg0 <= 0) {
					aBoolean124 = !aBoolean124;
				}
				method270(2);
				aClass1_Sub1_Sub3_6.method488(11);
				aClass1_Sub1_Sub3_6.method488((int) local14);
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("2313, " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public static synchronized void method278(@OriginalArg(0) int arg0) {
		try {
			if (aBoolean125) {
				anInt549++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(12);
				if (arg0 == 0) {
					aClass1_Sub1_Sub3_6.method488((int) local14);
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("2987, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public static synchronized void method279(@OriginalArg(0) int arg0) {
		try {
			if (aBoolean125) {
				anInt549++;
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(16) long local16 = (local10 - aLong21) / 10L;
				if (local16 > 250L) {
					local16 = 250L;
				}
				aLong21 = local10;
				method270(2);
				while (arg0 >= 0) {
					for (@Pc(31) int local31 = 1; local31 > 0; local31++) {
					}
				}
				aClass1_Sub1_Sub3_6.method488(13);
				aClass1_Sub1_Sub3_6.method488((int) local16);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("53230, " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
