import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "Lclient!qf;")
	public static Class60 aClass60_290 = Static59.method1195(":  ");

	@OriginalMember(owner = "client!da", name = "N", descriptor = "Lclient!qf;")
	private static Class60 aClass60_291 = Static59.method1195("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!da", name = "O", descriptor = "Lclient!qf;")
	public static Class60 aClass60_292 = aClass60_291;

	@OriginalMember(owner = "client!da", name = "S", descriptor = "Lclient!qf;")
	private static Class60 aClass60_293 = Static59.method1195("Connecting to update server");

	@OriginalMember(owner = "client!da", name = "T", descriptor = "Lclient!qf;")
	private static Class60 aClass60_294 = Static59.method1195("Friends");

	@OriginalMember(owner = "client!da", name = "U", descriptor = "Lclient!qf;")
	public static Class60 aClass60_295 = aClass60_293;

	@OriginalMember(owner = "client!da", name = "X", descriptor = "Lclient!qf;")
	public static Class60 aClass60_296 = aClass60_294;

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "Lclient!qf;")
	public static Class60 aClass60_297 = Static59.method1195("Name eingeben:");

	@OriginalMember(owner = "client!da", name = "cb", descriptor = "[I")
	public static int[] anIntArray78 = new int[128];

	@OriginalMember(owner = "client!da", name = "db", descriptor = "Lclient!qf;")
	public static Class60 aClass60_298 = Static59.method1195("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "[I")
	public static int[] anIntArray80 = new int[2000];

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)Lclient!ve;")
	public static Class3_Sub1_Sub17 method517(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub17 local10 = (Class3_Sub1_Sub17) Static77.aClass17_38.method643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static117.aClass25_31.method931(arg0, 6);
		local10 = new Class3_Sub1_Sub17();
		local10.anInt3412 = arg0;
		if (local25 != null) {
			local10.method2276(new Class3_Sub12(local25));
		}
		local10.method2286();
		if (local10.aBoolean126) {
			local10.anInt3436 = 0;
			local10.aBoolean130 = false;
		}
		Static77.aClass17_38.method644((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!qf;Lclient!mf;)Lclient!qf;")
	public static Class60 method518(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0.method1847(Static35.aClass60_463) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(17) int local17 = arg0.method1847(Static111.aClass60_1309);
			if (local17 == -1) {
				while (true) {
					local17 = arg0.method1847(Static12.aClass60_162);
					if (local17 == -1) {
						while (true) {
							local17 = arg0.method1847(Static78.aClass60_1032);
							if (local17 == -1) {
								while (true) {
									local17 = arg0.method1847(Static129.aClass60_1435);
									if (local17 == -1) {
										while (true) {
											local17 = arg0.method1847(Static14.aClass60_192);
											if (local17 == -1) {
												while (true) {
													local17 = arg0.method1847(Static63.aClass60_1226);
													if (local17 == -1) {
														return arg0;
													}
													@Pc(238) Class60 local238 = Static120.aClass60_1369;
													if (Static64.aClass7_5 != null) {
														local238 = Static62.method1254(Static64.aClass7_5.anInt147);
														try {
															if (Static64.aClass7_5.anObject1 != null) {
																@Pc(254) byte[] local254 = ((String) Static64.aClass7_5.anObject1).getBytes("ISO-8859-1");
																local238 = Static19.method2271(0, local254, local254.length);
															}
														} catch (@Pc(265) UnsupportedEncodingException local265) {
														}
													}
													arg0 = Static60.method1211(new Class60[] { arg0.method1864(0, local17), local238, arg0.method1829(local17 + 4) });
												}
											}
											arg0 = Static60.method1211(new Class60[] { arg0.method1864(0, local17), Static109.method2055(Static122.method476(4, arg1)), arg0.method1829(local17 + 2) });
										}
									}
									arg0 = Static60.method1211(new Class60[] { arg0.method1864(0, local17), Static109.method2055(Static122.method476(3, arg1)), arg0.method1829(local17 + 2) });
								}
							}
							arg0 = Static60.method1211(new Class60[] { arg0.method1864(0, local17), Static109.method2055(Static122.method476(2, arg1)), arg0.method1829(local17 + 2) });
						}
					}
					arg0 = Static60.method1211(new Class60[] { arg0.method1864(0, local17), Static109.method2055(Static122.method476(1, arg1)), arg0.method1829(local17 + 2) });
				}
			}
			arg0 = Static60.method1211(new Class60[] { arg0.method1864(0, local17), Static109.method2055(Static122.method476(0, arg1)), arg0.method1829(local17 + 2) });
		}
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	public static void method519() {
		anIntArray80 = null;
		aClass60_295 = null;
		aClass60_298 = null;
		aClass60_291 = null;
		aClass60_294 = null;
		aClass60_296 = null;
		anIntArray79 = null;
		aClass60_293 = null;
		anIntArray78 = null;
		aClass60_292 = null;
		aClass60_297 = null;
		aClass60_290 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([BB)V")
	public static void method520(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub12 local10 = new Class3_Sub12(arg0);
		local10.anInt2886 = arg0.length - 2;
		Static119.anInt3239 = local10.method1963();
		Static32.anIntArray133 = new int[Static119.anInt3239];
		Static33.anIntArray138 = new int[Static119.anInt3239];
		Static97.anIntArray302 = new int[Static119.anInt3239];
		Static2.aByteArrayArray3 = new byte[Static119.anInt3239][];
		Static15.anIntArray74 = new int[Static119.anInt3239];
		local10.anInt2886 = arg0.length - Static119.anInt3239 * 8 - 7;
		Static111.anInt3100 = local10.method1963();
		Static81.anInt2533 = local10.method1963();
		@Pc(62) int local62 = (local10.method1936() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static119.anInt3239; local64++) {
			Static97.anIntArray302[local64] = local10.method1963();
		}
		for (@Pc(86) int local86 = 0; local86 < Static119.anInt3239; local86++) {
			Static32.anIntArray133[local86] = local10.method1963();
		}
		for (@Pc(104) int local104 = 0; local104 < Static119.anInt3239; local104++) {
			Static15.anIntArray74[local104] = local10.method1963();
		}
		for (@Pc(122) int local122 = 0; local122 < Static119.anInt3239; local122++) {
			Static33.anIntArray138[local122] = local10.method1963();
		}
		local10.anInt2886 = arg0.length - Static119.anInt3239 * 8 - (local62 + -1) * 3 - 7;
		Static123.anIntArray378 = new int[local62];
		for (@Pc(157) int local157 = 1; local157 < local62; local157++) {
			Static123.anIntArray378[local157] = local10.method1923();
			if (Static123.anIntArray378[local157] == 0) {
				Static123.anIntArray378[local157] = 1;
			}
		}
		local10.anInt2886 = 0;
		for (@Pc(189) int local189 = 0; local189 < Static119.anInt3239; local189++) {
			@Pc(195) int local195 = Static15.anIntArray74[local189];
			@Pc(199) int local199 = Static33.anIntArray138[local189];
			@Pc(203) int local203 = local199 * local195;
			@Pc(206) byte[] local206 = new byte[local203];
			Static2.aByteArrayArray3[local189] = local206;
			@Pc(214) int local214 = local10.method1936();
			@Pc(221) int local221;
			if (local214 == 0) {
				for (local221 = 0; local221 < local203; local221++) {
					local206[local221] = local10.method1958();
				}
			} else if (local214 == 1) {
				for (local221 = 0; local221 < local195; local221++) {
					for (@Pc(225) int local225 = 0; local225 < local199; local225++) {
						local206[local221 + local195 * local225] = local10.method1958();
					}
				}
			}
		}
	}
}
