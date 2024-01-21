import java.awt.Font;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2 aClass1_Sub2_Sub8_Sub2_1;

	@OriginalMember(owner = "client!ge", name = "Z", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "[I")
	public static final int[] anIntArray141 = new int[100];

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_459 = Static81.method1507("Please enter your username)3");

	@OriginalMember(owner = "client!ge", name = "fb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_463 = Static81.method1507("Loaded sprites");

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "Lclient!dj;")
	public static Class24 aClass24_460 = aClass24_463;

	@OriginalMember(owner = "client!ge", name = "ab", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_461 = Static81.method1507("T");

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "I")
	public static int anInt1643 = 0;

	@OriginalMember(owner = "client!ge", name = "eb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_462 = aClass24_459;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
	public static void method1304() {
		if (Static134.anIntArray243 != null && Static189.anIntArray364 != null) {
			return;
		}
		Static189.anIntArray364 = new int[256];
		Static134.anIntArray243 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static134.anIntArray243[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static189.anIntArray364[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!vc;BLclient!dj;)Lclient!dj;")
	public static Class24 method1305(@OriginalArg(0) Class98 arg0, @OriginalArg(2) Class24 arg1) {
		if (arg1.method738(Static77.aClass24_560) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(18) int local18 = arg1.method738(Static165.aClass24_1064);
			if (local18 == -1) {
				while (true) {
					local18 = arg1.method738(Static186.aClass24_209);
					if (local18 == -1) {
						while (true) {
							local18 = arg1.method738(Static102.aClass24_683);
							if (local18 == -1) {
								while (true) {
									local18 = arg1.method738(Static53.aClass24_375);
									if (local18 == -1) {
										while (true) {
											local18 = arg1.method738(Static187.aClass24_1200);
											if (local18 == -1) {
												while (true) {
													local18 = arg1.method738(Static14.aClass24_97);
													if (local18 == -1) {
														return arg1;
													}
													@Pc(239) Class24 local239 = Static85.aClass24_1000;
													if (Static194.aClass82_6 != null) {
														local239 = Static58.method1104(Static194.aClass82_6.anInt3420);
														try {
															if (Static194.aClass82_6.anObject2 != null) {
																@Pc(255) byte[] local255 = ((String) Static194.aClass82_6.anObject2).getBytes("ISO-8859-1");
																local239 = Static84.method1555(local255.length, local255, 0);
															}
														} catch (@Pc(264) UnsupportedEncodingException local264) {
														}
													}
													arg1 = Static63.method1281(new Class24[] { arg1.method759(local18, 0), local239, arg1.method773(local18 + 4) });
												}
											}
											arg1 = Static63.method1281(new Class24[] { arg1.method759(local18, 0), Static77.method1424(Static150.method2584(4, arg0)), arg1.method773(local18 + 2) });
										}
									}
									arg1 = Static63.method1281(new Class24[] { arg1.method759(local18, 0), Static77.method1424(Static150.method2584(3, arg0)), arg1.method773(local18 + 2) });
								}
							}
							arg1 = Static63.method1281(new Class24[] { arg1.method759(local18, 0), Static77.method1424(Static150.method2584(2, arg0)), arg1.method773(local18 + 2) });
						}
					}
					arg1 = Static63.method1281(new Class24[] { arg1.method759(local18, 0), Static77.method1424(Static150.method2584(1, arg0)), arg1.method773(local18 + 2) });
				}
			}
			arg1 = Static63.method1281(new Class24[] { arg1.method759(local18, 0), Static77.method1424(Static150.method2584(0, arg0)), arg1.method773(local18 + 2) });
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)V")
	public static void method1306(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static34.anInt921; local14++) {
			if (arg0 == Static135.aLongArray25[local14]) {
				Static34.anInt921--;
				for (@Pc(31) int local31 = local14; local31 < Static34.anInt921; local31++) {
					Static135.aLongArray25[local31] = Static135.aLongArray25[local31 + 1];
					Static137.aClass24Array19[local31] = Static137.aClass24Array19[local31 + 1];
				}
				Static127.anInt2781 = Static60.anInt3643;
				Static176.aClass1_Sub7_Sub1_34.method2808(79);
				Static176.aClass1_Sub7_Sub1_34.method2801(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIB)V")
	public static void method1308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static146.method2424(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(22) int local22 = -arg3;
		@Pc(29) int local29 = arg3;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(59) int local59;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (Static13.anInt308 <= arg0 && Static52.anInt1338 >= arg0) {
			@Pc(50) int[] local50 = Static98.anIntArrayArray16[arg0];
			local59 = Static177.method3022(Static63.anInt1608, arg5 - arg3, Static63.anInt1595);
			local68 = Static177.method3022(Static63.anInt1608, arg5 + arg3, Static63.anInt1595);
			local76 = Static177.method3022(Static63.anInt1608, arg5 - local15, Static63.anInt1595);
			local84 = Static177.method3022(Static63.anInt1608, local15 + arg5, Static63.anInt1595);
			Static39.method731(local50, local59, local76, arg4);
			Static39.method731(local50, local76, local84, arg2);
			Static39.method731(local50, local84, local68, arg4);
		}
		@Pc(104) int local104 = local15;
		while (local29 > local10) {
			local36 += 2;
			local34 += 2;
			local22 += local34;
			local32 += local36;
			if (local32 >= 0 && local104 >= 1) {
				local104--;
				local32 -= local104 << 1;
				Static193.anIntArray378[local104] = local10;
			}
			local10++;
			@Pc(241) int local241;
			@Pc(250) int local250;
			@Pc(257) int[] local257;
			@Pc(150) int local150;
			if (local22 >= 0) {
				local29--;
				local22 -= local29 << 1;
				local150 = arg0 - local29;
				local59 = arg0 + local29;
				if (Static13.anInt308 <= local59 && local150 <= Static52.anInt1338) {
					if (local15 <= local29) {
						local68 = Static177.method3022(Static63.anInt1608, arg5 + local10, Static63.anInt1595);
						local76 = Static177.method3022(Static63.anInt1608, arg5 - local10, Static63.anInt1595);
						if (Static52.anInt1338 >= local59) {
							Static39.method731(Static98.anIntArrayArray16[local59], local76, local68, arg4);
						}
						if (Static13.anInt308 <= local150) {
							Static39.method731(Static98.anIntArrayArray16[local150], local76, local68, arg4);
						}
					} else {
						local68 = Static193.anIntArray378[local29];
						local76 = Static177.method3022(Static63.anInt1608, local10 + arg5, Static63.anInt1595);
						local84 = Static177.method3022(Static63.anInt1608, arg5 - local10, Static63.anInt1595);
						local241 = Static177.method3022(Static63.anInt1608, arg5 + local68, Static63.anInt1595);
						local250 = Static177.method3022(Static63.anInt1608, arg5 - local68, Static63.anInt1595);
						if (Static52.anInt1338 >= local59) {
							local257 = Static98.anIntArrayArray16[local59];
							Static39.method731(local257, local84, local250, arg4);
							Static39.method731(local257, local250, local241, arg2);
							Static39.method731(local257, local241, local76, arg4);
						}
						if (Static13.anInt308 <= local150) {
							local257 = Static98.anIntArrayArray16[local150];
							Static39.method731(local257, local84, local250, arg4);
							Static39.method731(local257, local250, local241, arg2);
							Static39.method731(local257, local241, local76, arg4);
						}
					}
				}
			}
			local150 = arg0 - local10;
			local59 = local10 + arg0;
			if (local59 >= Static13.anInt308 && local150 <= Static52.anInt1338) {
				local68 = local29 + arg5;
				local76 = arg5 - local29;
				if (Static63.anInt1608 <= local68 && local76 <= Static63.anInt1595) {
					local68 = Static177.method3022(Static63.anInt1608, local68, Static63.anInt1595);
					local76 = Static177.method3022(Static63.anInt1608, local76, Static63.anInt1595);
					if (local10 >= local15) {
						if (Static52.anInt1338 >= local59) {
							Static39.method731(Static98.anIntArrayArray16[local59], local76, local68, arg4);
						}
						if (local150 >= Static13.anInt308) {
							Static39.method731(Static98.anIntArrayArray16[local150], local76, local68, arg4);
						}
					} else {
						local84 = local104 < local10 ? Static193.anIntArray378[local10] : local104;
						local241 = Static177.method3022(Static63.anInt1608, arg5 + local84, Static63.anInt1595);
						local250 = Static177.method3022(Static63.anInt1608, arg5 - local84, Static63.anInt1595);
						if (local59 <= Static52.anInt1338) {
							local257 = Static98.anIntArrayArray16[local59];
							Static39.method731(local257, local76, local250, arg4);
							Static39.method731(local257, local250, local241, arg2);
							Static39.method731(local257, local241, local68, arg4);
						}
						if (local150 >= Static13.anInt308) {
							local257 = Static98.anIntArrayArray16[local150];
							Static39.method731(local257, local76, local250, arg4);
							Static39.method731(local257, local250, local241, arg2);
							Static39.method731(local257, local241, local68, arg4);
						}
					}
				}
			}
		}
	}
}
