import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
	public static int anInt5604;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
	public static int anInt5608;

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
	public static int anInt5611;

	@OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
	public static int anInt5616;

	@OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
	public static int anInt5617;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "[I")
	public static int[] anIntArray506 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "[I")
	public static int[] anIntArray507 = new int[2000];

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString397 = "K";

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "[I")
	public static int[] anIntArray508 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!qm;)Lclient!nc;")
	public static Class1_Sub3_Sub15 method4258(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		@Pc(35) Class1_Sub3_Sub15 local35 = new Class1_Sub3_Sub15(arg0, arg1.method2237(), arg1.method2237(), arg1.method2194(), arg1.method2194(), arg1.method2199() == 1, arg1.method2199());
		@Pc(39) int local39 = arg1.method2199();
		for (@Pc(51) int local51 = 0; local51 < local39; local51++) {
			local35.aClass26_37.method668(new Class1_Sub9(arg1.method2199(), arg1.method2199(), arg1.method2244(), arg1.method2244(), arg1.method2244(), arg1.method2244(), arg1.method2244(), arg1.method2244(), arg1.method2244(), arg1.method2244()));
		}
		local35.method2930();
		return local35;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method4259(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < Static16.anInt461; local5++) {
			@Pc(18) Class2_Sub4_Sub2 local18 = Static155.aClass2_Sub4_Sub2Array1[Static304.anIntArray533[local5]];
			if (local18 != null && local18.aString182 != null && local18.aString182.equalsIgnoreCase(arg1)) {
				local3 = true;
				if (arg0 == 1) {
					Static2.aClass1_Sub14_Sub1_1.method2252(136);
					Static2.aClass1_Sub14_Sub1_1.method2246(0);
					Static2.aClass1_Sub14_Sub1_1.method2210(Static304.anIntArray533[local5]);
				} else if (arg0 == 4) {
					Static2.aClass1_Sub14_Sub1_1.method2252(126);
					Static2.aClass1_Sub14_Sub1_1.method2191(0);
					Static2.aClass1_Sub14_Sub1_1.method2208(Static304.anIntArray533[local5]);
				} else if (arg0 == 5) {
					Static2.aClass1_Sub14_Sub1_1.method2252(12);
					Static2.aClass1_Sub14_Sub1_1.method2210(Static304.anIntArray533[local5]);
					Static2.aClass1_Sub14_Sub1_1.method2207(0);
				} else if (arg0 == 6) {
					Static2.aClass1_Sub14_Sub1_1.method2252(101);
					Static2.aClass1_Sub14_Sub1_1.method2200(0);
					Static2.aClass1_Sub14_Sub1_1.method2240(Static304.anIntArray533[local5]);
				} else if (arg0 == 7) {
					Static2.aClass1_Sub14_Sub1_1.method2252(100);
					Static2.aClass1_Sub14_Sub1_1.method2207(0);
					Static2.aClass1_Sub14_Sub1_1.method2198(Static304.anIntArray533[local5]);
				}
				break;
			}
		}
		if (!local3) {
			Static116.method1877(Static118.aString160 + arg1);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)I")
	public static int method4260(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(18) Class1_Sub7 local18 = (Class1_Sub7) Static111.aClass186_7.method4570((long) arg0);
		if (local18 == null) {
			return Static1.method4722(arg0).anInt2758;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local18.anIntArray164.length; local31++) {
			if (local18.anIntArray164[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static1.method4722(arg0).anInt2758 - local18.anIntArray164.length;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ILclient!wf;)Ljava/lang/String;")
	public static String method4261(@OriginalArg(0) String arg0, @OriginalArg(2) Class191 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(23) int local23 = arg0.indexOf("%1");
			if (local23 == -1) {
				while (true) {
					local23 = arg0.indexOf("%2");
					if (local23 == -1) {
						while (true) {
							local23 = arg0.indexOf("%3");
							if (local23 == -1) {
								while (true) {
									local23 = arg0.indexOf("%4");
									if (local23 == -1) {
										while (true) {
											local23 = arg0.indexOf("%5");
											if (local23 == -1) {
												while (true) {
													local23 = arg0.indexOf("%dns");
													if (local23 == -1) {
														return arg0;
													}
													@Pc(196) String local196 = "";
													if (Static248.aClass47_6 != null) {
														if (Static248.aClass47_6.anObject2 == null) {
															local196 = Static199.method4759(Static248.aClass47_6.anInt1416);
														} else {
															local196 = (String) Static248.aClass47_6.anObject2;
														}
													}
													arg0 = arg0.substring(0, local23) + local196 + arg0.substring(local23 + 4);
												}
											}
											arg0 = arg0.substring(0, local23) + Static198.method3185(Static261.method3998(4, arg1)) + arg0.substring(local23 + 2);
										}
									}
									arg0 = arg0.substring(0, local23) + Static198.method3185(Static261.method3998(3, arg1)) + arg0.substring(local23 + 2);
								}
							}
							arg0 = arg0.substring(0, local23) + Static198.method3185(Static261.method3998(2, arg1)) + arg0.substring(local23 + 2);
						}
					}
					arg0 = arg0.substring(0, local23) + Static198.method3185(Static261.method3998(1, arg1)) + arg0.substring(local23 + 2);
				}
			}
			arg0 = arg0.substring(0, local23) + Static198.method3185(Static261.method3998(0, arg1)) + arg0.substring(local23 + 2);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!th;ZLclient!th;Z)V")
	public static void method4262(@OriginalArg(0) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		Static87.aClass168_67 = arg0;
		Static121.aBoolean159 = true;
		Static80.aClass168_60 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)Lclient!i;")
	public static Class1_Sub3_Sub7 method4264(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub3_Sub7 local16 = (Class1_Sub3_Sub7) Static296.aClass162_9.method4003((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Static214.aClass168_159.method4058(arg0, 11);
		local16 = new Class1_Sub3_Sub7();
		if (local28 != null) {
			local16.method1796(new Class1_Sub14(local28));
		}
		Static296.aClass162_9.method4005(local16, (long) arg0);
		return local16;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method4265(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static65.aBoolean94) {
			try {
				@Pc(29) Class52 local29 = (Class52) Class.forName("Class52_Sub1").getDeclaredConstructor().newInstance();
				local29.method1278(arg0);
				return local29;
			} catch (@Pc(36) Throwable local36) {
				Static65.aBoolean94 = true;
			}
		}
		return arg0;
	}
}
