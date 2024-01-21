import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private static int anInt529;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Z")
	private static boolean aBoolean122;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Z")
	public static boolean aBoolean123;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "J")
	private static long aLong21;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	private static int anInt530;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "J")
	private static long aLong22;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	private static int anInt531;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private static int anInt532;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6 = null;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7 = null;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static synchronized void method266() {
		try {
			aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method485();
			aClass1_Sub1_Sub3_7 = null;
			aLong21 = System.currentTimeMillis();
			aBoolean123 = true;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("30925, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public static synchronized void method267(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				aBoolean123 = false;
				aClass1_Sub1_Sub3_6 = null;
				aClass1_Sub1_Sub3_7 = null;
			}
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("63443, " + arg0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method268() {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_7 != null && aBoolean123) {
				local1 = aClass1_Sub1_Sub3_7;
			}
			aClass1_Sub1_Sub3_7 = null;
			return local1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("64098, " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method269() {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_6 != null && aClass1_Sub1_Sub3_6.anInt768 > 0 && aBoolean123) {
				local1 = aClass1_Sub1_Sub3_6;
			}
			method267(aBoolean121);
			return local1;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("67130, " + 589 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	private static synchronized void method270(@OriginalArg(1) int arg0) {
		try {
			if (aClass1_Sub1_Sub3_6.anInt768 + arg0 >= 500) {
				@Pc(10) Class1_Sub1_Sub3 local10 = aClass1_Sub1_Sub3_6;
				aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method485();
				aClass1_Sub1_Sub3_7 = local10;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("30981, " + 479 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	public static synchronized void method271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (aBoolean123 && (arg2 >= 0 && arg2 < 789 && arg1 >= 0 && arg1 < 532)) {
				anInt530++;
				@Pc(21) long local21 = System.currentTimeMillis();
				@Pc(27) long local27 = (local21 - aLong21) / 10L;
				if (local27 > 250L) {
					local27 = 250L;
				}
				aLong21 = local21;
				method270(5);
				if (arg0 == 1) {
					aClass1_Sub1_Sub3_6.method488(1);
				} else {
					aClass1_Sub1_Sub3_6.method488(2);
				}
				aClass1_Sub1_Sub3_6.method488((int) local27);
				aClass1_Sub1_Sub3_6.method491(arg2 + (arg1 << 10));
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("47287, " + arg0 + ", " + 39216 + ", " + arg1 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
	public static synchronized void method272(@OriginalArg(0) int arg0) {
		try {
			if (aBoolean123) {
				anInt530++;
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
			signlink.reporterror("95014, " + arg0 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public static synchronized void method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aBoolean123 && (arg1 >= 0 && arg1 < 789 && arg0 >= 0 && arg0 < 532)) {
				@Pc(26) long local26 = System.currentTimeMillis();
				if (local26 - aLong22 >= 50L) {
					aLong22 = local26;
					anInt530++;
					@Pc(44) long local44 = (local26 - aLong21) / 10L;
					if (local44 > 250L) {
						local44 = 250L;
					}
					aLong21 = local26;
					if (arg1 - anInt531 < 8 && arg1 - anInt531 >= -8 && arg0 - anInt532 < 8 && arg0 - anInt532 >= -8) {
						method270(3);
						aClass1_Sub1_Sub3_6.method488(5);
						aClass1_Sub1_Sub3_6.method488((int) local44);
						aClass1_Sub1_Sub3_6.method488(arg1 + (arg0 - anInt532 + 8 << 4) + 8 - anInt531);
					} else if (arg1 - anInt531 < 128 && arg1 - anInt531 >= -128 && arg0 - anInt532 < 128 && arg0 - anInt532 >= -128) {
						method270(4);
						aClass1_Sub1_Sub3_6.method488(6);
						aClass1_Sub1_Sub3_6.method488((int) local44);
						aClass1_Sub1_Sub3_6.method488(arg1 + 128 - anInt531);
						aClass1_Sub1_Sub3_6.method488(arg0 + 128 - anInt532);
					} else {
						method270(5);
						aClass1_Sub1_Sub3_6.method488(7);
						aClass1_Sub1_Sub3_6.method488((int) local44);
						aClass1_Sub1_Sub3_6.method491(arg1 + (arg0 << 10));
					}
					anInt531 = arg1;
					anInt532 = arg0;
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("30265, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(II)V")
	public static synchronized void method274(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean123) {
				anInt530++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(23) long local23 = (local8 - aLong21) / 10L;
				if (local23 > 250L) {
					local23 = 250L;
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
				aClass1_Sub1_Sub3_6.method488(8);
				aClass1_Sub1_Sub3_6.method488((int) local23);
				aClass1_Sub1_Sub3_6.method488(arg0);
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("73747, " + 878 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(II)V")
	public static synchronized void method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aBoolean123) {
				anInt530++;
				@Pc(8) long local8 = System.currentTimeMillis();
				if (arg1 >= 0) {
					for (@Pc(12) int local12 = 1; local12 > 0; local12++) {
					}
				}
				@Pc(23) long local23 = (local8 - aLong21) / 10L;
				if (local23 > 250L) {
					local23 = 250L;
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
				aClass1_Sub1_Sub3_6.method488((int) local23);
				aClass1_Sub1_Sub3_6.method488(arg0);
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("88471, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public static synchronized void method276() {
		try {
			if (aBoolean123) {
				anInt530++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(24) long local24 = (local8 - aLong21) / 10L;
				if (local24 > 250L) {
					local24 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(10);
				aClass1_Sub1_Sub3_6.method488((int) local24);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("90937, " + -839 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public static synchronized void method277() {
		try {
			if (aBoolean123) {
				anInt530++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(14) long local14 = (local8 - aLong21) / 10L;
				if (local14 > 250L) {
					local14 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(11);
				aClass1_Sub1_Sub3_6.method488((int) local14);
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("6924, " + -89 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(Z)V")
	public static synchronized void method278() {
		try {
			if (aBoolean123) {
				anInt530++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(17) long local17 = (local8 - aLong21) / 10L;
				if (local17 > 250L) {
					local17 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(12);
				aClass1_Sub1_Sub3_6.method488((int) local17);
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("45571, " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public static synchronized void method279() {
		try {
			if (aBoolean123) {
				anInt530++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(23) long local23 = (local8 - aLong21) / 10L;
				if (local23 > 250L) {
					local23 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(13);
				aClass1_Sub1_Sub3_6.method488((int) local23);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("43593, " + 201 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}
}
