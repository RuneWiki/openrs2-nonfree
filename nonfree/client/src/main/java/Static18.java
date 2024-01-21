import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_5;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_2;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "Lclient!oc;")
	public static Class34 aClass34_14;

	@OriginalMember(owner = "client!d", name = "Cb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_289 = Static15.method178("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "Lclient!gd;")
	public static Class23 aClass23_282 = aClass23_289;

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "[I")
	public static int[] anIntArray66 = new int[500];

	@OriginalMember(owner = "client!d", name = "zb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_287 = Static15.method178("Loading game screen )2 ");

	@OriginalMember(owner = "client!d", name = "lb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_283 = aClass23_287;

	@OriginalMember(owner = "client!d", name = "mb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_284 = Static15.method178("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!d", name = "pb", descriptor = "J")
	public static volatile long aLong10 = 0L;

	@OriginalMember(owner = "client!d", name = "rb", descriptor = "I")
	public static int anInt458 = 0;

	@OriginalMember(owner = "client!d", name = "wb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_286 = Static15.method178("wishes to trade with you)3");

	@OriginalMember(owner = "client!d", name = "ub", descriptor = "Lclient!gd;")
	public static Class23 aClass23_285 = aClass23_286;

	@OriginalMember(owner = "client!d", name = "Ab", descriptor = "Lclient!gd;")
	public static Class23 aClass23_288 = Static15.method178("");

	@OriginalMember(owner = "client!d", name = "Db", descriptor = "Lclient!gd;")
	public static Class23 aClass23_290 = Static15.method178("@or3@");

	@OriginalMember(owner = "client!d", name = "Fb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_291 = Static15.method178("(Z");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
	public static void method248(@OriginalArg(1) int arg0) {
		Static99.method1661();
		@Pc(17) int local17 = Static87.method1882(arg0).anInt2530;
		if (local17 == 0) {
			return;
		}
		@Pc(27) int local27 = Static40.anIntArray164[arg0];
		if (local17 == 1) {
			if (local27 == 1) {
				Static93.method1593(0.9D);
				((Class47) Static93.anInterface2_1).method1336(0.9D);
			}
			if (local27 == 2) {
				Static93.method1593(0.8D);
				((Class47) Static93.anInterface2_1).method1336(0.8D);
			}
			if (local27 == 3) {
				Static93.method1593(0.7D);
				((Class47) Static93.anInterface2_1).method1336(0.7D);
			}
			if (local27 == 4) {
				Static93.method1593(0.6D);
				((Class47) Static93.anInterface2_1).method1336(0.6D);
			}
			Static95.method1616();
			Static54.aBoolean86 = true;
		}
		if (local17 == 3) {
			@Pc(85) short local85 = 0;
			if (local27 == 0) {
				local85 = 255;
			}
			if (local27 == 1) {
				local85 = 192;
			}
			if (local27 == 2) {
				local85 = 128;
			}
			if (local27 == 3) {
				local85 = 64;
			}
			if (local27 == 4) {
				local85 = 0;
			}
			if (local85 != Static13.anInt232) {
				if (Static13.anInt232 == 0 && Static115.anInt2966 != -1) {
					Static77.method1350(local85, Static115.anInt2966, 0, Static42.aClass55_Sub1_7);
					Static77.anInt2108 = 0;
				} else if (local85 == 0) {
					Static77.method1345();
					Static77.anInt2108 = 0;
				} else {
					Static52.method994(local85);
				}
				Static13.anInt232 = local85;
			}
		}
		if (local17 == 4) {
			if (local27 == 0) {
				Static97.anInt2526 = 127;
			}
			if (local27 == 1) {
				Static97.anInt2526 = 96;
			}
			if (local27 == 2) {
				Static97.anInt2526 = 64;
			}
			if (local27 == 3) {
				Static97.anInt2526 = 32;
			}
			if (local27 == 4) {
				Static97.anInt2526 = 0;
			}
		}
		if (local17 == 6) {
			Static9.anInt195 = local27;
		}
		if (local17 == 8) {
			Static102.aBoolean123 = true;
			Static61.anInt1884 = local27;
		}
		if (local17 == 5) {
			Static104.anInt2687 = local27;
		}
		if (local17 == 9) {
			Static47.anInt1596 = local27;
		}
		if (local17 != 10) {
			return;
		}
		if (local27 == 0) {
			Static104.anInt2679 = 127;
		}
		if (local27 == 1) {
			Static104.anInt2679 = 96;
		}
		if (local27 == 2) {
			Static104.anInt2679 = 64;
		}
		if (local27 == 3) {
			Static104.anInt2679 = 32;
		}
		if (local27 == 4) {
			Static104.anInt2679 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(BI)Lclient!h;")
	public static Class1_Sub1_Sub8 method249(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub8 local10 = (Class1_Sub1_Sub8) Static17.aClass5_13.method98((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static9.aClass55_2.method1867(arg0, 12);
		local10 = new Class1_Sub1_Sub8();
		if (local20 != null) {
			local10.method591(new Class1_Sub5(local20));
		}
		local10.method588();
		Static17.aClass5_13.method97(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	public static void method251() {
		anIntArray66 = null;
		aClass34_14 = null;
		aClass23_284 = null;
		aClass55_Sub1_2 = null;
		aClass23_288 = null;
		aClass23_286 = null;
		aClass23_282 = null;
		aClass23_287 = null;
		aClass23_289 = null;
		aClass23_285 = null;
		aClass23_290 = null;
		aClass23_291 = null;
		aClass23_283 = null;
		aClass1_Sub1_Sub6_Sub3_5 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!rb;Z)V")
	public static void method253(@OriginalArg(0) Class55 arg0) {
		Static13.aClass55_7 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([Lclient!ee;IIIIZIIII)V")
	public static void method254(@OriginalArg(0) Class1_Sub1_Sub7[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class1_Sub1_Sub7 local9 = arg0[local3];
			if (local9 != null && (local9.anInt802 == 0 || local9.aBoolean41) && local9 != null && arg2 == local9.anInt833 && (!local9.aBoolean36 || Static82.aBoolean109)) {
				@Pc(45) int local45 = local9.anInt816 + arg8 - arg1;
				@Pc(53) int local53 = arg4 + local9.anInt820 - arg5;
				@Pc(59) int local59 = local53 + local9.anInt817;
				@Pc(70) int local70 = local45 <= arg8 ? arg8 : local45;
				@Pc(77) int local77 = arg4 >= local53 ? arg4 : local53;
				@Pc(88) int local88 = local59 >= arg3 ? arg3 : local59;
				@Pc(93) int local93 = local9.anInt823 + local45;
				@Pc(100) int local100 = local93 >= arg6 ? arg6 : local93;
				if (local9.anInt802 == 0) {
					method254(arg0, local9.anInt832, local9.anInt826, local88, local77, local9.anInt822, local100, arg7, local70);
					if (local9.aClass1_Sub1_Sub7Array1 != null) {
						method254(local9.aClass1_Sub1_Sub7Array1, local9.anInt832, local9.anInt826, local88, local77, local9.anInt822, local100, arg7, local70);
					}
				}
				if (local9.aBoolean41) {
					@Pc(167) boolean local167;
					if (Static32.anInt1007 >= local70 && local77 <= Static110.anInt2872 && Static32.anInt1007 < local100 && local88 > Static110.anInt2872) {
						local167 = true;
					} else {
						local167 = false;
					}
					@Pc(173) boolean local173 = false;
					if (Static89.anInt2389 == 1 && local167) {
						local173 = true;
					}
					@Pc(182) boolean local182 = false;
					if (Static65.anInt1963 == 1 && Static111.anInt2890 >= local70 && local77 <= Static74.anInt1803 && local100 > Static111.anInt2890 && local88 > Static74.anInt1803) {
						local182 = true;
					}
					if (local9.anInt850 != -1 && local182 && Static72.aClass1_Sub1_Sub7_5 == null && (arg7 & 0x200) != 0 && !Static74.aBoolean90) {
						Static63.anInt1928 = 0;
						Static61.aBoolean94 = false;
						Static72.aClass1_Sub1_Sub7_5 = local9;
						Static58.anInt2821 = Static110.anInt2872;
						Static92.anInt2922 = Static32.anInt1007;
					}
					if (Static72.aClass1_Sub1_Sub7_5 != null || Static74.aBoolean90) {
						local173 = false;
						local182 = false;
						local167 = false;
					}
					if (!local9.aBoolean37 && local182 && (arg7 & 0x1) != 0) {
						local9.aBoolean37 = true;
						if (local9.anObjectArray4 != null) {
							Static34.method585(local9.anObjectArray4, Static74.anInt1803 - local53, -local45 + Static111.anInt2890, local9, 0);
						}
					}
					if (local9.aBoolean37 && local173 && (arg7 & 0x4) != 0 && local9.anObjectArray15 != null) {
						Static34.method585(local9.anObjectArray15, Static110.anInt2872 - local53, -local45 + Static32.anInt1007, local9, 0);
					}
					if (local9.aBoolean37 && !local173 && (arg7 & 0x2) != 0) {
						local9.aBoolean37 = false;
						if (local9.anObjectArray12 != null) {
							Static34.method585(local9.anObjectArray12, Static110.anInt2872 - local53, Static32.anInt1007 - local45, local9, 0);
						}
					}
					if (local173 && (arg7 & 0x8) != 0 && local9.anObjectArray17 != null) {
						Static34.method585(local9.anObjectArray17, Static110.anInt2872 - local53, Static32.anInt1007 + -local45, local9, 0);
					}
					if (!local9.aBoolean38 && local167 && (arg7 & 0x10) != 0) {
						local9.aBoolean38 = true;
						if (local9.anObjectArray8 != null) {
							Static34.method585(local9.anObjectArray8, Static110.anInt2872 - local53, Static32.anInt1007 - local45, local9, 0);
						}
					}
					if (local9.aBoolean38 && local167 && (arg7 & 0x40) != 0 && local9.anObjectArray16 != null) {
						Static34.method585(local9.anObjectArray16, Static110.anInt2872 - local53, Static32.anInt1007 + -local45, local9, 0);
					}
					if (local9.aBoolean38 && !local167 && (arg7 & 0x20) != 0) {
						local9.aBoolean38 = false;
						if (local9.anObjectArray3 != null) {
							Static34.method585(local9.anObjectArray3, Static110.anInt2872 - local53, -local45 + Static32.anInt1007, local9, 0);
						}
					}
					if (local9.anObjectArray9 != null && (arg7 & 0x80) != 0) {
						Static34.method585(local9.anObjectArray9, 0, 0, local9, 0);
					}
					if ((arg7 & 0x100) != 0) {
						if (local9.anInt813 < Static108.anInt2794 && local9.anObjectArray1 != null) {
							Static34.method585(local9.anObjectArray1, 0, 0, local9, 0);
						}
						if (Static28.anInt2227 > local9.anInt813 && local9.anObjectArray5 != null) {
							Static34.method585(local9.anObjectArray5, 0, 0, local9, 0);
						}
						if (local9.anInt813 < Static61.anInt1890 && local9.anObjectArray6 != null) {
							Static34.method585(local9.anObjectArray6, 0, 0, local9, 0);
						}
						local9.anInt813 = Static7.anInt176;
					}
				}
			}
		}
	}
}
