import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!jr", name = "B", descriptor = "Lclient!dp;")
	public static Class53 aClass53_87;

	@OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
	public static int anInt2914;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/String;Lclient!mb;I)Ljava/lang/String;")
	public static String method3110(@OriginalArg(0) String arg0, @OriginalArg(1) Class132 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(14) int local14 = arg0.indexOf("%1");
			if (local14 == -1) {
				while (true) {
					local14 = arg0.indexOf("%2");
					if (local14 == -1) {
						while (true) {
							local14 = arg0.indexOf("%3");
							if (local14 == -1) {
								while (true) {
									local14 = arg0.indexOf("%4");
									if (local14 == -1) {
										while (true) {
											local14 = arg0.indexOf("%5");
											if (local14 == -1) {
												while (true) {
													local14 = arg0.indexOf("%dns");
													if (local14 == -1) {
														return arg0;
													}
													@Pc(181) String local181 = "";
													if (Static232.aClass196_5 != null) {
														if (Static232.aClass196_5.anObject8 == null) {
															local181 = Static160.method3160(Static232.aClass196_5.anInt5853);
														} else {
															local181 = (String) Static232.aClass196_5.anObject8;
														}
													}
													arg0 = arg0.substring(0, local14) + local181 + arg0.substring(local14 + 4);
												}
											}
											arg0 = arg0.substring(0, local14) + Static94.method1711(Static191.method3587(4, arg1)) + arg0.substring(local14 + 2);
										}
									}
									arg0 = arg0.substring(0, local14) + Static94.method1711(Static191.method3587(3, arg1)) + arg0.substring(local14 + 2);
								}
							}
							arg0 = arg0.substring(0, local14) + Static94.method1711(Static191.method3587(2, arg1)) + arg0.substring(local14 + 2);
						}
					}
					arg0 = arg0.substring(0, local14) + Static94.method1711(Static191.method3587(1, arg1)) + arg0.substring(local14 + 2);
				}
			}
			arg0 = arg0.substring(0, local14) + Static94.method1711(Static191.method3587(0, arg1)) + arg0.substring(local14 + 2);
		}
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)I")
	public static int method3112() {
		return Static225.anInt4135;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ec;)Lclient!ti;")
	public static Class43_Sub4 method3113(@OriginalArg(1) Class6_Sub10 arg0) {
		return new Class43_Sub4(arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method3996(), arg0.method3996(), arg0.method3972());
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)S")
	public static short method3114(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(26) int local26 = arg0 & 0x7F;
		@Pc(46) int local46 = local26 <= 64 ? local15 * local26 >> 7 : (127 - local26) * local15 >> 7;
		@Pc(50) int local50 = local46 + local26;
		@Pc(59) int local59;
		if (local50 == 0) {
			local59 = local46 << 1;
		} else {
			local59 = (local46 << 8) / local50;
		}
		return (short) (local50 | local9 << 10 | local59 >> 4 << 7);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIII)Z")
	public static boolean method3115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static198.method3634(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static151.method3070(local10 + 1, Static203.aClass106Array3[arg0].method5720(arg1, arg2) + arg3, local14 + 1) && Static151.method3070(local10 + 128 - 1, Static203.aClass106Array3[arg0].method5720(arg1 + 1, arg2) + arg3, local14 + 1) && Static151.method3070(local10 + 128 - 1, Static203.aClass106Array3[arg0].method5720(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static151.method3070(local10 + 1, Static203.aClass106Array3[arg0].method5720(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
