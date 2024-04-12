import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public static int anInt1867;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBIIIIIIII)V", line = 30)
	public static void method1276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static99.method1665(arg2) || (arg1 > arg6 || arg0 < arg9 || arg6 >= arg3 || arg7 <= arg0)) {
			return;
		}
		@Pc(40) Class2_Sub2_Sub13[] local40 = Static46.aClass2_Sub2_Sub13ArrayArray1[arg2];
		for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
			@Pc(48) Class2_Sub2_Sub13 local48 = local40[local42];
			if (local48 != null && arg8 == local48.anInt1611) {
				@Pc(66) int local66 = local48.anInt1582 + arg1;
				@Pc(75) int local75 = local48.anInt1588 + arg9 - arg4;
				if (local48.anInt1613 == 8 && local66 <= arg6 && local75 <= arg0 && arg6 < local48.anInt1605 + local66 && local48.anInt1609 + local75 > arg0) {
					Class52.anInt1979 = local42;
				}
				if ((local48.anInt1594 >= 0 || local48.anInt1615 != 0) && local66 <= arg6 && arg0 >= local75 && arg6 < local66 + local48.anInt1605 && local48.anInt1609 + local75 > arg0) {
					if (local48.anInt1594 >= 0) {
						Class25.anInt982 = local48.anInt1594;
					} else {
						Class25.anInt982 = local42;
					}
				}
				if (local48.anInt1613 != 0) {
					if (local48.anInt1577 == 1 && local66 <= arg6 && local75 <= arg0 && arg6 < local48.anInt1605 + local66 && arg0 < local48.anInt1609 + local75) {
						@Pc(236) boolean local236 = false;
						if (local48.anInt1610 != 0) {
							local236 = Static31.method607(local48);
						}
						if (!local236) {
							Static20.method402(local48.aClass40_467, 54, local42 + (arg2 << 16), 0, 0);
						}
					}
					if (local48.anInt1577 == 2 && Class2_Sub2_Sub5.anInt641 == 0 && arg6 >= local66 && local75 <= arg0 && local48.anInt1605 + local66 > arg6 && local75 + local48.anInt1609 > arg0) {
						@Pc(300) Class40 local300 = local48.aClass40_471;
						if (local300.method1200(Class24.aClass40_716) != -1) {
							local300 = local300.method1180(local300.method1200(Class24.aClass40_716), 0);
						}
						Static20.method402(Static72.method1334(new Class40[] { local300, Class25.aClass40_292, local48.aClass40_464 }), 21, local42 + (arg2 << 16), 0, 0);
					}
					if (local48.anInt1577 == 3 && arg6 >= local66 && arg0 >= local75 && local66 + local48.anInt1605 > arg6 && local48.anInt1609 + local75 > arg0) {
						@Pc(385) byte local385;
						if (arg5 == 3) {
							local385 = 35;
						} else {
							local385 = 32;
						}
						Static20.method402(Class40.aClass40_509, local385, (arg2 << 16) + local42, 0, 0);
					}
					if (local48.anInt1577 == 4 && arg6 >= local66 && local75 <= arg0 && arg6 < local48.anInt1605 + local66 && local48.anInt1609 + local75 > arg0) {
						Static20.method402(local48.aClass40_467, 40, (arg2 << 16) + local42, 0, 0);
					}
					if (local48.anInt1577 == 5 && arg6 >= local66 && arg0 >= local75 && local66 + local48.anInt1605 > arg6 && local48.anInt1609 + local75 > arg0) {
						Static20.method402(local48.aClass40_467, 49, (arg2 << 16) + local42, 0, 0);
					}
					if (local48.anInt1577 == 6 && !Class18_Sub1.aBoolean40 && local66 <= arg6 && local75 <= arg0 && arg6 < local66 + local48.anInt1605 && arg0 < local48.anInt1609 + local75) {
						Static20.method402(local48.aClass40_467, 18, local42 + (arg2 << 16), 0, 0);
					}
					if (local48.anInt1613 == 2) {
						@Pc(551) int local551 = 0;
						for (@Pc(553) int local553 = 0; local553 < local48.anInt1609; local553++) {
							for (@Pc(557) int local557 = 0; local557 < local48.anInt1605; local557++) {
								@Pc(569) int local569 = local75 + (local48.anInt1580 + 32) * local553;
								@Pc(578) int local578 = local557 * (local48.anInt1572 + 32) + local66;
								if (local551 < 20) {
									local578 += local48.anIntArray328[local551];
									local569 += local48.anIntArray330[local551];
								}
								if (local578 <= arg6 && local569 <= arg0 && local578 + 32 > arg6 && arg0 < local569 + 32) {
									Class15.anInt434 = local551;
									Applet_Sub1.anInt390 = local42 + (arg2 << 16);
									if (local48.anIntArray331[local551] > 0) {
										@Pc(643) Class2_Sub2_Sub8 local643 = Static97.method1669(local48.anIntArray331[local551] - 1);
										if (Class18.anInt1874 == 1 && local48.aBoolean128) {
											if (Static97.anInt2526 != (arg2 << 16) + local42 || Static28.anInt724 != local551) {
												Static20.method402(Static72.method1334(new Class40[] { Class20.aClass40_193, Class2_Sub2_Sub14.aClass40_601, Class2_Sub2_Sub12_Sub5.aClass40_590, local643.aClass40_290 }), 19, (arg2 << 16) + local42, local551, local643.anInt954);
											}
										} else if (Class2_Sub2_Sub5.anInt641 != 1 || !local48.aBoolean128) {
											@Pc(662) Class40[] local662 = local643.aClass40Array16;
											if (Class23.aBoolean60) {
												local662 = Static79.method1404(local662);
											}
											@Pc(677) int local677;
											@Pc(694) byte local694;
											if (local48.aBoolean128) {
												for (local677 = 4; local677 >= 3; local677--) {
													if (local662 != null && local662[local677] != null) {
														if (local677 == 3) {
															local694 = 53;
														} else {
															local694 = 23;
														}
														Static20.method402(Static72.method1334(new Class40[] { local662[local677], Class53.aClass40_572, local643.aClass40_290 }), local694, local42 + (arg2 << 16), local551, local643.anInt954);
													} else if (local677 == 4) {
														Static20.method402(Static72.method1334(new Class40[] { Class2_Sub2_Sub4.aClass40_158, local643.aClass40_290 }), 23, local42 + (arg2 << 16), local551, local643.anInt954);
													}
												}
											}
											if (local48.aBoolean130) {
												Static20.method402(Static72.method1334(new Class40[] { Class34.aClass40_449, local643.aClass40_290 }), 1, local42 + (arg2 << 16), local551, local643.anInt954);
											}
											if (local48.aBoolean128 && local662 != null) {
												for (local677 = 2; local677 >= 0; local677--) {
													if (local662[local677] != null) {
														local694 = 0;
														if (local677 == 0) {
															local694 = 4;
														}
														if (local677 == 1) {
															local694 = 27;
														}
														if (local677 == 2) {
															local694 = 46;
														}
														Static20.method402(Static72.method1334(new Class40[] { local662[local677], Class53.aClass40_572, local643.aClass40_290 }), local694, (arg2 << 16) + local42, local551, local643.anInt954);
													}
												}
											}
											local662 = local48.aClass40Array29;
											if (Class23.aBoolean60) {
												local662 = Static79.method1404(local662);
											}
											if (local662 != null) {
												for (local677 = 4; local677 >= 0; local677--) {
													if (local662[local677] != null) {
														local694 = 0;
														if (local677 == 0) {
															local694 = 52;
														}
														if (local677 == 1) {
															local694 = 55;
														}
														if (local677 == 2) {
															local694 = 47;
														}
														if (local677 == 3) {
															local694 = 39;
														}
														if (local677 == 4) {
															local694 = 26;
														}
														Static20.method402(Static72.method1334(new Class40[] { local662[local677], Class53.aClass40_572, local643.aClass40_290 }), local694, (arg2 << 16) + local42, local551, local643.anInt954);
													}
												}
											}
											Static20.method402(Static72.method1334(new Class40[] { Class2_Sub2_Sub3.aClass40_81, local643.aClass40_290 }), 1002, local42 + (arg2 << 16), local551, local643.anInt954);
										} else if ((Static78.anInt2027 & 0x10) == 16) {
											Static20.method402(Static72.method1334(new Class40[] { Class51.aClass40_567, Class53.aClass40_572, local643.aClass40_290 }), 28, (arg2 << 16) + local42, local551, local643.anInt954);
										}
									}
								}
								local551++;
							}
						}
					}
				} else if (!local48.aBoolean125 || Static31.method614(arg5, local42) || Class40.aBoolean143) {
					method1276(arg0, local66, arg2, local66 + local48.anInt1605, local48.anInt1587, arg5, arg6, local75 + local48.anInt1609, local42, local75);
					if (local48.anInt1609 < local48.anInt1601) {
						Static49.method920(local48, local66 + local48.anInt1605, local48.anInt1601, local48.anInt1609, arg5, arg0, arg6, local75);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 377)
	public static void method1277() {
		if (Class1.aBoolean2 && Static1.anInt8 != Class2_Sub2_Sub7.anInt786) {
			Static74.method1343(Static51.anInt2327, Static1.anInt8, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], Static45.anInt2262);
		} else if (Class2_Sub3.anInt2590 != Static1.anInt8) {
			Class2_Sub3.anInt2590 = Static1.anInt8;
			Static18.method369(Static1.anInt8);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 410)
	public static void method1278() {
		anImage4 = null;
		Class18.aClass40_544 = null;
		Class18.aByteArrayArray9 = null;
		Class18.aClass20Array3 = null;
		Class18.aClass40_545 = null;
		Class18.aClass40_543 = null;
		Class18.anIntArray415 = null;
		Class18.anIntArray416 = null;
		Class18.aClass40_542 = null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 441)
	public static void method1279() {
		@Pc(1) Object local1 = Class5.anObject2;
		synchronized (Class5.anObject2) {
			if (Class41.anInt1801 != 0) {
				Class41.anInt1801 = 1;
				try {
					Class5.anObject2.wait();
				} catch (@Pc(11) InterruptedException local11) {
				}
			}
		}
	}
}
