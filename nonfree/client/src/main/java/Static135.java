import java.io.UnsupportedEncodingException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!wa;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1714 = Static122.method531("World");

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1712 = aClass73_1714;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean209 = true;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1713 = aClass73_1714;

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
	public static int anInt3086 = 10;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BJ)V")
	public static void method2228(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static166.anInt3619 >= 100 && Static12.anInt292 != 1 || Static166.anInt3619 >= 200) {
			method2234(0, Static141.aClass73_1789, Static173.aClass73_2030);
			return;
		}
		@Pc(42) Class73 local42 = Static168.method2643(arg0).method2451();
		for (@Pc(44) int local44 = 0; local44 < Static166.anInt3619; local44++) {
			if (Static138.aLongArray5[local44] == arg0) {
				method2234(0, Static19.method372(new Class73[] { local42, Static31.aClass73_468 }), Static173.aClass73_2030);
				return;
			}
		}
		for (@Pc(79) int local79 = 0; local79 < Static107.anInt2468; local79++) {
			if (Static63.aLongArray1[local79] == arg0) {
				method2234(0, Static19.method372(new Class73[] { Static122.aClass73_392, local42, Static37.aClass73_531 }), Static173.aClass73_2030);
				return;
			}
		}
		if (local42.method2430(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass73_1521)) {
			method2234(0, Static172.aClass73_2025, Static173.aClass73_2030);
			return;
		}
		Static115.aClass73Array17[Static166.anInt3619] = local42;
		Static138.aLongArray5[Static166.anInt3619] = arg0;
		Static109.anIntArray283[Static166.anInt3619] = 0;
		Static85.anIntArray199[Static166.anInt3619] = 0;
		Static166.anInt3619++;
		Static116.anInt2760 = Static84.anInt1893;
		Static139.aClass3_Sub12_Sub1_3.method1400(92);
		Static139.aClass3_Sub12_Sub1_3.method1382(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method2232() {
		aClass73_1714 = null;
		aClass87_1 = null;
		aClass73_1712 = null;
		aCRC32_3 = null;
		aClass73_1713 = null;
		aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public static void method2233() {
		Static142.aClass7_24.method190();
		Static25.aClass7_6.method190();
		Static179.aClass7_28.method190();
		Static3.aClass7_1.method190();
		Static134.aClass7_22.method190();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BILclient!sd;Lclient!sd;)V")
	public static void method2234(@OriginalArg(1) int arg0, @OriginalArg(2) Class73 arg1, @OriginalArg(3) Class73 arg2) {
		Static50.method910(arg0, arg2, arg1, null);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!vd;Lclient!sd;B)Lclient!sd;")
	public static Class73 method2235(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class73 arg1) {
		if (arg1.method2429(Static30.aClass73_446) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(12) int local12 = arg1.method2429(Static133.aClass73_1695);
			if (local12 == -1) {
				while (true) {
					local12 = arg1.method2429(Static30.aClass73_445);
					if (local12 == -1) {
						while (true) {
							local12 = arg1.method2429(Static165.aClass73_199);
							if (local12 == -1) {
								while (true) {
									local12 = arg1.method2429(Static59.aClass73_1526);
									if (local12 == -1) {
										while (true) {
											local12 = arg1.method2429(Static105.aClass73_1364);
											if (local12 == -1) {
												while (true) {
													local12 = arg1.method2429(Static24.aClass73_378);
													if (local12 == -1) {
														return arg1;
													}
													@Pc(223) Class73 local223 = Static173.aClass73_2030;
													if (Static100.aClass29_8 != null) {
														local223 = Static43.method782(Static100.aClass29_8.anInt1373);
														try {
															if (Static100.aClass29_8.anObject2 != null) {
																@Pc(239) byte[] local239 = ((String) Static100.aClass29_8.anObject2).getBytes("ISO-8859-1");
																local223 = Static40.method771(local239.length, 0, local239);
															}
														} catch (@Pc(248) UnsupportedEncodingException local248) {
														}
													}
													arg1 = Static19.method372(new Class73[] { arg1.method2413(local12, 0), local223, arg1.method2447(local12 + 4) });
												}
											}
											arg1 = Static19.method372(new Class73[] { arg1.method2413(local12, 0), Static81.method1408(Static33.method613(arg0, 4)), arg1.method2447(local12 + 2) });
										}
									}
									arg1 = Static19.method372(new Class73[] { arg1.method2413(local12, 0), Static81.method1408(Static33.method613(arg0, 3)), arg1.method2447(local12 + 2) });
								}
							}
							arg1 = Static19.method372(new Class73[] { arg1.method2413(local12, 0), Static81.method1408(Static33.method613(arg0, 2)), arg1.method2447(local12 + 2) });
						}
					}
					arg1 = Static19.method372(new Class73[] { arg1.method2413(local12, 0), Static81.method1408(Static33.method613(arg0, 1)), arg1.method2447(local12 + 2) });
				}
			}
			arg1 = Static19.method372(new Class73[] { arg1.method2413(local12, 0), Static81.method1408(Static33.method613(arg0, 0)), arg1.method2447(local12 + 2) });
		}
	}
}
