import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_4;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
	public static int anInt1204;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_528 = Static2.method66("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "Lclient!ke;")
	private static Class39 aClass39_538 = Static2.method66("Please try using a different world)3");

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!ke;")
	public static Class39 aClass39_529 = aClass39_538;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!ke;")
	public static Class39 aClass39_530 = aClass39_538;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!ke;")
	public static Class39 aClass39_531 = aClass39_538;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!ke;")
	public static Class39 aClass39_532 = aClass39_538;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_533 = aClass39_538;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[50][];

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "[Lclient!ke;")
	public static Class39[] aClass39Array8 = new Class39[100];

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!ke;")
	public static Class39 aClass39_534 = aClass39_538;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Lclient!ke;")
	private static Class39 aClass39_539 = Static2.method66("Attack");

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_535 = aClass39_539;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_536 = Static2.method66("@gre@");

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_537 = Static2.method66("invback");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZI)Z")
	public static boolean method833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static77.aClass43_1.method1189(Static18.anInt560, arg1, arg2, arg0);
		@Pc(18) int local18 = arg0 >> 14 & 0x7FFF;
		if (local12 == -1) {
			return false;
		}
		@Pc(35) int local35 = local12 >> 6 & 0x3;
		@Pc(39) int local39 = local12 & 0x1F;
		if (local39 == 10 || local39 == 11 || local39 == 22) {
			@Pc(76) Class2_Sub1_Sub5 local76 = Static48.method916(local18);
			@Pc(84) int local84;
			@Pc(87) int local87;
			if (local35 == 0 || local35 == 2) {
				local84 = local76.anInt528;
				local87 = local76.anInt537;
			} else {
				local84 = local76.anInt537;
				local87 = local76.anInt528;
			}
			@Pc(98) int local98 = local76.anInt530;
			if (local35 != 0) {
				local98 = (local98 << local35 & 0xF) + (local98 >> 4 - local35);
			}
			Static22.method440(local98, local84, 0, arg2, 2, local87, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], arg1, true, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
		} else {
			Static22.method440(0, 0, local35, arg2, 2, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], arg1, true, local39 + 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
		}
		Static105.anInt2801 = Static93.anInt2442;
		Static41.anInt1189 = 2;
		Static53.anInt1469 = 0;
		Static57.anInt1654 = Static2.anInt91;
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method834() {
		aByteArrayArray5 = null;
		aClass39_532 = null;
		aClass39_533 = null;
		aClass39_528 = null;
		aClass39Array8 = null;
		aClass39_534 = null;
		aClass39_531 = null;
		aClass39_539 = null;
		aClass2_Sub1_Sub4_Sub2_4 = null;
		aClass39_537 = null;
		aClass39_530 = null;
		aClass39_536 = null;
		aClass39_538 = null;
		aClass39_529 = null;
		aClass39_535 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!jb;IIIB)V")
	public static void method835(@OriginalArg(0) Class2_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static101.anInt2753 >= 400) {
			return;
		}
		if (arg0.anIntArray190 != null) {
			arg0 = arg0.method941();
		}
		if (arg0 == null || !arg0.aBoolean72) {
			return;
		}
		@Pc(28) Class39 local28 = arg0.aClass39_619;
		if (arg0.anInt1387 != 0) {
			local28 = Static20.method431(new Class39[] { local28, Static48.method913(Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2628, arg0.anInt1387), Static19.aClass39_284, Static41.aClass39_524, Static31.method1267(arg0.anInt1387), Static38.aClass39_497 });
		}
		if (Static16.anInt461 == 1) {
			Static84.method2048(arg2, Static76.aClass39_936, Static20.method431(new Class39[] { Static87.aClass39_1062, Static71.aClass39_901, local28 }), 37, arg3, arg1);
		} else if (Static87.anInt2324 != 1) {
			@Pc(153) Class39[] local153 = arg0.aClass39Array11;
			if (Static29.aBoolean51) {
				local153 = Static12.method253(local153);
			}
			@Pc(165) int local165;
			if (local153 != null) {
				for (local165 = 4; local165 >= 0; local165--) {
					if (local153[local165] != null && !local153[local165].method1106(aClass39_535)) {
						@Pc(184) byte local184 = 0;
						if (local165 == 0) {
							local184 = 52;
						}
						if (local165 == 1) {
							local184 = 35;
						}
						if (local165 == 2) {
							local184 = 13;
						}
						if (local165 == 3) {
							local184 = 40;
						}
						if (local165 == 4) {
							local184 = 34;
						}
						Static84.method2048(arg2, local153[local165], Static20.method431(new Class39[] { Static44.aClass39_547, local28 }), local184, arg3, arg1);
					}
				}
			}
			if (local153 != null) {
				for (local165 = 4; local165 >= 0; local165--) {
					if (local153[local165] != null && local153[local165].method1106(aClass39_535)) {
						@Pc(259) short local259 = 0;
						if (arg0.anInt1387 > Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2628) {
							local259 = 2000;
						}
						@Pc(272) int local272 = 0;
						if (local165 == 0) {
							local272 = local259 + 52;
						}
						if (local165 == 1) {
							local272 = local259 + 35;
						}
						if (local165 == 2) {
							local272 = local259 + 13;
						}
						if (local165 == 3) {
							local272 = local259 + 40;
						}
						if (local165 == 4) {
							local272 = local259 + 34;
						}
						Static84.method2048(arg2, local153[local165], Static20.method431(new Class39[] { Static44.aClass39_547, local28 }), local272, arg3, arg1);
					}
				}
			}
			Static84.method2048(arg2, Static107.aClass39_1192, Static20.method431(new Class39[] { Static44.aClass39_547, local28 }), 1005, arg3, arg1);
		} else if ((Static39.anInt1170 & 0x2) == 2) {
			Static84.method2048(arg2, Static23.aClass39_304, Static20.method431(new Class39[] { Static41.aClass39_516, Static71.aClass39_901, local28 }), 42, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method836() {
		Static65.aClass54_21.method1635();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BB)[B")
	public static byte[] method837(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub5 local8 = new Class2_Sub5(arg0);
		@Pc(12) int local12 = local8.method1281();
		@Pc(16) int local16 = local8.method1276();
		if (local16 < 0 || Static6.anInt2873 != 0 && Static6.anInt2873 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(110) byte[] local110 = new byte[local16];
			local8.method1285(local110, local16);
			return local110;
		} else {
			@Pc(51) int local51 = local8.method1276();
			if (local51 < 0 || Static6.anInt2873 != 0 && Static6.anInt2873 < local51) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local51];
			if (local12 == 1) {
				Static34.method731(local72, local51, arg0, local16);
			} else {
				try {
					@Pc(90) DataInputStream local90 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local16)));
					local90.readFully(local72);
					local90.close();
				} catch (@Pc(97) IOException local97) {
				}
			}
			return local72;
		}
	}
}
