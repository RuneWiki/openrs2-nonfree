import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Z")
	private static boolean aBoolean125;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	private static int anInt534;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Z")
	private static boolean aBoolean126;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Z")
	public static boolean aBoolean127;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "J")
	private static long aLong21;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	private static int anInt535;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "J")
	private static long aLong22;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private static int anInt536;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	private static int anInt537;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private static int anInt533 = -106;

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
			aBoolean127 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("14487, " + -591 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public static synchronized void method267() {
		try {
			aBoolean127 = false;
			aClass1_Sub1_Sub3_6 = null;
			aClass1_Sub1_Sub3_7 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("47650, " + 32268 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method268() {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = null;
			if (aClass1_Sub1_Sub3_7 != null && aBoolean127) {
				local8 = aClass1_Sub1_Sub3_7;
			}
			aClass1_Sub1_Sub3_7 = null;
			return local8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("5279, " + -9917 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Lclient!mb;")
	public static synchronized Class1_Sub1_Sub3 method269() {
		try {
			@Pc(1) Class1_Sub1_Sub3 local1 = null;
			if (aClass1_Sub1_Sub3_6 != null && aClass1_Sub1_Sub3_6.anInt777 > 0 && aBoolean127) {
				local1 = aClass1_Sub1_Sub3_6;
			}
			method267();
			return local1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("30577, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	private static synchronized void method270(@OriginalArg(1) int arg0) {
		try {
			if (aClass1_Sub1_Sub3_6.anInt777 + arg0 >= 500) {
				@Pc(16) Class1_Sub1_Sub3 local16 = aClass1_Sub1_Sub3_6;
				aClass1_Sub1_Sub3_6 = Class1_Sub1_Sub3.method485();
				aClass1_Sub1_Sub3_7 = local16;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("73109, " + 44660 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBII)V")
	public static synchronized void method271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (aBoolean127 && (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532)) {
				anInt535++;
				@Pc(19) long local19 = System.currentTimeMillis();
				@Pc(25) long local25 = (local19 - aLong21) / 10L;
				if (local25 > 250L) {
					local25 = 250L;
				}
				aLong21 = local19;
				method270(5);
				if (arg2 == 1) {
					aClass1_Sub1_Sub3_6.method488(1);
				} else {
					aClass1_Sub1_Sub3_6.method488(2);
				}
				aClass1_Sub1_Sub3_6.method488((int) local25);
				aClass1_Sub1_Sub3_6.method491(arg0 + (arg1 << 10));
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("23882, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public static synchronized void method272(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (aBoolean127) {
				anInt535++;
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(16) long local16 = (local10 - aLong21) / 10L;
				if (local16 > 250L) {
					local16 = 250L;
				}
				aLong21 = local10;
				method270(2);
				@Pc(32) boolean local32 = false;
				if (arg0 == 1) {
					aClass1_Sub1_Sub3_6.method488(3);
				} else {
					aClass1_Sub1_Sub3_6.method488(4);
				}
				aClass1_Sub1_Sub3_6.method488((int) local16);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("59308, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public static synchronized void method273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aBoolean127 && (arg0 >= 0 && arg0 < 789 && arg1 >= 0 && arg1 < 532)) {
				@Pc(26) long local26 = System.currentTimeMillis();
				if (local26 - aLong22 >= 50L) {
					aLong22 = local26;
					anInt535++;
					@Pc(44) long local44 = (local26 - aLong21) / 10L;
					if (local44 > 250L) {
						local44 = 250L;
					}
					aLong21 = local26;
					if (arg0 - anInt536 < 8 && arg0 - anInt536 >= -8 && arg1 - anInt537 < 8 && arg1 - anInt537 >= -8) {
						method270(3);
						aClass1_Sub1_Sub3_6.method488(5);
						aClass1_Sub1_Sub3_6.method488((int) local44);
						aClass1_Sub1_Sub3_6.method488(arg0 + (arg1 - anInt537 + 8 << 4) + 8 - anInt536);
					} else if (arg0 - anInt536 < 128 && arg0 - anInt536 >= -128 && arg1 - anInt537 < 128 && arg1 - anInt537 >= -128) {
						method270(4);
						aClass1_Sub1_Sub3_6.method488(6);
						aClass1_Sub1_Sub3_6.method488((int) local44);
						aClass1_Sub1_Sub3_6.method488(arg0 + 128 - anInt536);
						aClass1_Sub1_Sub3_6.method488(arg1 + 128 - anInt537);
					} else {
						method270(5);
						aClass1_Sub1_Sub3_6.method488(7);
						aClass1_Sub1_Sub3_6.method488((int) local44);
						aClass1_Sub1_Sub3_6.method491(arg0 + (arg1 << 10));
					}
					anInt536 = arg0;
					anInt537 = arg1;
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("52392, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
	public static synchronized void method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aBoolean127) {
				anInt535++;
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
				aClass1_Sub1_Sub3_6.method488(8);
				@Pc(56) boolean local56 = false;
				aClass1_Sub1_Sub3_6.method488((int) local14);
				aClass1_Sub1_Sub3_6.method488(arg0);
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("62672, " + arg0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(II)V")
	public static synchronized void method275(@OriginalArg(1) int arg0) {
		try {
			if (aBoolean127) {
				anInt535++;
				@Pc(12) long local12 = System.currentTimeMillis();
				@Pc(18) long local18 = (local12 - aLong21) / 10L;
				if (local18 > 250L) {
					local18 = 250L;
				}
				aLong21 = local12;
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
				aClass1_Sub1_Sub3_6.method488((int) local18);
				aClass1_Sub1_Sub3_6.method488(arg0);
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("49771, " + -10167 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static synchronized void method276(@OriginalArg(0) byte arg0) {
		try {
			if (aBoolean127) {
				anInt535++;
				@Pc(11) boolean local11 = false;
				@Pc(17) long local17 = System.currentTimeMillis();
				@Pc(23) long local23 = (local17 - aLong21) / 10L;
				if (local23 > 250L) {
					local23 = 250L;
				}
				aLong21 = local17;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(10);
				aClass1_Sub1_Sub3_6.method488((int) local23);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("23718, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public static synchronized void method277() {
		try {
			if (aBoolean127) {
				anInt535++;
				@Pc(12) long local12 = System.currentTimeMillis();
				@Pc(18) long local18 = (local12 - aLong21) / 10L;
				if (local18 > 250L) {
					local18 = 250L;
				}
				aLong21 = local12;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(11);
				aClass1_Sub1_Sub3_6.method488((int) local18);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("51255, " + 8 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
	public static synchronized void method278() {
		try {
			if (aBoolean127) {
				anInt535++;
				@Pc(8) long local8 = System.currentTimeMillis();
				@Pc(22) long local22 = (local8 - aLong21) / 10L;
				if (local22 > 250L) {
					local22 = 250L;
				}
				aLong21 = local8;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(12);
				aClass1_Sub1_Sub3_6.method488((int) local22);
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("20674, " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public static synchronized void method279(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (aBoolean127) {
				anInt535++;
				@Pc(12) long local12 = System.currentTimeMillis();
				@Pc(18) long local18 = (local12 - aLong21) / 10L;
				if (local18 > 250L) {
					local18 = 250L;
				}
				aLong21 = local12;
				method270(2);
				aClass1_Sub1_Sub3_6.method488(13);
				aClass1_Sub1_Sub3_6.method488((int) local18);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("26992, " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}
}
