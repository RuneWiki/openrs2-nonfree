import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
	public static int[] anIntArray22 = new int[5];

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!rd;")
	private static Class63 aClass63_71 = Static80.method1463("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_70 = aClass63_71;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!rd;")
	private static Class63 aClass63_72 = Static80.method1463("Hide");

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
	public static int anInt129 = 0;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!rd;")
	private static Class63 aClass63_73 = Static80.method1463(" is already on your friend list");

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!rd;")
	private static Class63 aClass63_74 = Static80.method1463("(U4");

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "Lclient!rd;")
	public static Class63 aClass63_75 = aClass63_73;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
	public static int anInt140 = 0;

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "Lclient!rd;")
	public static Class63 aClass63_76 = aClass63_72;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public static void method95() {
		try {
			@Pc(10) Graphics local10 = Static38.aCanvas1.getGraphics();
			Static86.aClass29_17.method1428(4, 550, local10);
		} catch (@Pc(18) Exception local18) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
	public static void method102() {
		@Pc(10) int local10 = Static88.aClass6_Sub4_Sub1_5.method1349(8);
		@Pc(19) int local19;
		if (Static81.anInt2219 > local10) {
			for (local19 = local10; local19 < Static81.anInt2219; local19++) {
				Static89.anIntArray282[Static69.anInt2002++] = Static114.anIntArray356[local19];
			}
		}
		if (local10 > Static81.anInt2219) {
			throw new RuntimeException("gppov1");
		}
		Static81.anInt2219 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(62) int local62 = Static114.anIntArray356[local19];
			@Pc(66) Class6_Sub3_Sub1_Sub2_Sub2 local66 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local62];
			@Pc(71) int local71 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
			if (local71 == 0) {
				Static114.anIntArray356[Static81.anInt2219++] = local62;
				local66.anInt2324 = Static73.anInt2064;
			} else {
				@Pc(91) int local91 = Static88.aClass6_Sub4_Sub1_5.method1349(2);
				if (local91 == 0) {
					Static114.anIntArray356[Static81.anInt2219++] = local62;
					local66.anInt2324 = Static73.anInt2064;
					Static112.anIntArray355[anInt129++] = local62;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local91 == 1) {
						Static114.anIntArray356[Static81.anInt2219++] = local62;
						local66.anInt2324 = Static73.anInt2064;
						local135 = Static88.aClass6_Sub4_Sub1_5.method1349(3);
						local66.method1548(local135, false);
						local145 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
						if (local145 == 1) {
							Static112.anIntArray355[anInt129++] = local62;
						}
					} else if (local91 == 2) {
						Static114.anIntArray356[Static81.anInt2219++] = local62;
						local66.anInt2324 = Static73.anInt2064;
						local135 = Static88.aClass6_Sub4_Sub1_5.method1349(3);
						local66.method1548(local135, true);
						local145 = Static88.aClass6_Sub4_Sub1_5.method1349(3);
						local66.method1548(local145, true);
						@Pc(199) int local199 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
						if (local199 == 1) {
							Static112.anIntArray355[anInt129++] = local62;
						}
					} else if (local91 == 3) {
						Static89.anIntArray282[Static69.anInt2002++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!wa;ILclient!rd;)Lclient!rd;")
	public static Class63 method108(@OriginalArg(0) Class6_Sub3_Sub17 arg0, @OriginalArg(2) Class63 arg1) {
		if (arg1.method1805(Static19.aClass63_406) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(13) int local13 = arg1.method1805(Static118.aClass63_1738);
			if (local13 == -1) {
				while (true) {
					local13 = arg1.method1805(Static69.aClass63_1046);
					if (local13 == -1) {
						while (true) {
							local13 = arg1.method1805(Static47.aClass63_781);
							if (local13 == -1) {
								while (true) {
									local13 = arg1.method1805(aClass63_74);
									if (local13 == -1) {
										while (true) {
											local13 = arg1.method1805(Static82.aClass63_1193);
											if (local13 == -1) {
												while (true) {
													local13 = arg1.method1805(Static76.aClass63_1117);
													if (local13 == -1) {
														return arg1;
													}
													@Pc(236) Class63 local236 = Static111.aClass63_1661;
													if (Static5.aClass20_1 != null) {
														local236 = Static23.method1546(Static5.aClass20_1.anInt932);
														try {
															if (Static5.aClass20_1.anObject2 != null) {
																@Pc(252) byte[] local252 = ((String) Static5.aClass20_1.anObject2).getBytes("ISO-8859-1");
																local236 = Static31.method803(0, local252.length, local252);
															}
														} catch (@Pc(261) UnsupportedEncodingException local261) {
														}
													}
													arg1 = Static15.method374(new Class63[] { arg1.method1820(local13, 0), local236, arg1.method1806(local13 + 4) });
												}
											}
											arg1 = Static15.method374(new Class63[] { arg1.method1820(local13, 0), Static15.method378(Static67.method1210(arg0, 4)), arg1.method1806(local13 + 2) });
										}
									}
									arg1 = Static15.method374(new Class63[] { arg1.method1820(local13, 0), Static15.method378(Static67.method1210(arg0, 3)), arg1.method1806(local13 + 2) });
								}
							}
							arg1 = Static15.method374(new Class63[] { arg1.method1820(local13, 0), Static15.method378(Static67.method1210(arg0, 2)), arg1.method1806(local13 + 2) });
						}
					}
					arg1 = Static15.method374(new Class63[] { arg1.method1820(local13, 0), Static15.method378(Static67.method1210(arg0, 1)), arg1.method1806(local13 + 2) });
				}
			}
			arg1 = Static15.method374(new Class63[] { arg1.method1820(local13, 0), Static15.method378(Static67.method1210(arg0, 0)), arg1.method1806(local13 + 2) });
		}
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	public static void method112() {
		anIntArray22 = null;
		aClass63_75 = null;
		aClass63_71 = null;
		aClass63_76 = null;
		aClass63_70 = null;
		aClass63_74 = null;
		aClass63_72 = null;
		aClass63_73 = null;
	}
}
