import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString8 = "purple:";

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	public static int anInt230 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!qf;Ljava/lang/String;)Ljava/lang/String;")
	public static String method203(@OriginalArg(1) Class146 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(18) int local18 = arg1.indexOf("%1");
			if (local18 == -1) {
				while (true) {
					local18 = arg1.indexOf("%2");
					if (local18 == -1) {
						while (true) {
							local18 = arg1.indexOf("%3");
							if (local18 == -1) {
								while (true) {
									local18 = arg1.indexOf("%4");
									if (local18 == -1) {
										while (true) {
											local18 = arg1.indexOf("%5");
											if (local18 == -1) {
												while (true) {
													local18 = arg1.indexOf("%dns");
													if (local18 == -1) {
														return arg1;
													}
													@Pc(197) String local197 = "";
													if (Static268.aClass10_12 != null) {
														if (Static268.aClass10_12.anObject1 == null) {
															local197 = Static132.method2160(Static268.aClass10_12.anInt152);
														} else {
															local197 = (String) Static268.aClass10_12.anObject1;
														}
													}
													arg1 = arg1.substring(0, local18) + local197 + arg1.substring(local18 + 4);
												}
											}
											arg1 = arg1.substring(0, local18) + Static212.method3347(Static147.method2367(4, arg0)) + arg1.substring(local18 + 2);
										}
									}
									arg1 = arg1.substring(0, local18) + Static212.method3347(Static147.method2367(3, arg0)) + arg1.substring(local18 + 2);
								}
							}
							arg1 = arg1.substring(0, local18) + Static212.method3347(Static147.method2367(2, arg0)) + arg1.substring(local18 + 2);
						}
					}
					arg1 = arg1.substring(0, local18) + Static212.method3347(Static147.method2367(1, arg0)) + arg1.substring(local18 + 2);
				}
			}
			arg1 = arg1.substring(0, local18) + Static212.method3347(Static147.method2367(0, arg0)) + arg1.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
	public static void method204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(20) int local20 = -1;
		@Pc(28) int local28 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg3 + arg1);
		@Pc(37) int local37 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg3 - arg1);
		Static109.method1795(local37, Static51.anIntArrayArray1[arg2], local28, arg0);
		while (local9 > local3) {
			local20 += 2;
			local12 += local20;
			@Pc(78) int local78;
			@Pc(73) int local73;
			@Pc(97) int local97;
			@Pc(106) int local106;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local73 = local9 + arg2;
				local78 = arg2 - local9;
				if (local73 >= Static240.anInt1319 && Static59.anInt1155 >= local78) {
					local97 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg3 + local3);
					local106 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg3 - local3);
					if (local73 <= Static59.anInt1155) {
						Static109.method1795(local106, Static51.anIntArrayArray1[local73], local97, arg0);
					}
					if (Static240.anInt1319 <= local78) {
						Static109.method1795(local106, Static51.anIntArrayArray1[local78], local97, arg0);
					}
				}
			}
			local3++;
			local78 = arg2 - local3;
			local73 = local3 + arg2;
			if (Static240.anInt1319 <= local73 && Static59.anInt1155 >= local78) {
				local97 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, local9 + arg3);
				local106 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg3 - local9);
				if (local73 <= Static59.anInt1155) {
					Static109.method1795(local106, Static51.anIntArrayArray1[local73], local97, arg0);
				}
				if (Static240.anInt1319 <= local78) {
					Static109.method1795(local106, Static51.anIntArrayArray1[local78], local97, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!no;[I[IB[I)V")
	public static void method206(@OriginalArg(0) Class22_Sub3_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(19) int local19 = arg1[local7];
			@Pc(23) int local23 = arg2[local7];
			@Pc(27) int local27 = arg3[local7];
			for (@Pc(29) int local29 = 0; local23 != 0 && local29 < arg0.aClass53Array3.length; local29++) {
				if ((local23 & 0x1) != 0) {
					if (local19 == -1) {
						arg0.aClass53Array3[local29] = null;
					} else {
						@Pc(59) Class167 local59 = Static313.method4648(local19);
						@Pc(64) Class53 local64 = arg0.aClass53Array3[local29];
						@Pc(67) int local67 = local59.anInt5131;
						if (local64 != null) {
							if (local19 == local64.anInt1420) {
								if (local67 == 0) {
									local64 = arg0.aClass53Array3[local29] = null;
								} else if (local67 == 1) {
									local64.anInt1423 = 0;
									local64.anInt1425 = local27;
									local64.anInt1422 = 0;
									local64.anInt1421 = 1;
									local64.anInt1424 = 0;
									Static212.method3338(arg0.anInt4601, false, 0, local59, arg0.anInt4623);
								} else if (local67 == 2) {
									local64.anInt1423 = 0;
								}
							} else if (local59.anInt5114 >= Static313.method4648(local64.anInt1420).anInt5114) {
								local64 = arg0.aClass53Array3[local29] = null;
							}
						}
						if (local64 == null) {
							local64 = arg0.aClass53Array3[local29] = new Class53();
							local64.anInt1425 = local27;
							local64.anInt1423 = 0;
							local64.anInt1424 = 0;
							local64.anInt1422 = 0;
							local64.anInt1421 = 1;
							local64.anInt1420 = local19;
							Static212.method3338(arg0.anInt4601, false, 0, local59, arg0.anInt4623);
						}
					}
				}
				local23 >>>= 0x1;
			}
		}
	}
}
