import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lclient!kb;")
	public static Class3_Sub18 aClass3_Sub18_1;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_29 = new Class85(64);

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "[I")
	public static final int[] anIntArray194 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!nd", name = "db", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1285 = Static193.method3027("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIZ)V")
	public static void method1921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(16) int local16 = arg4 + 1;
		Static16.method302(arg0, arg2, arg1, Static157.anIntArrayArray24[arg4]);
		@Pc(25) int local25 = arg3 - 1;
		Static16.method302(arg0, arg2, arg1, Static157.anIntArrayArray24[arg3]);
		for (@Pc(30) int local30 = local16; local30 <= local25; local30++) {
			@Pc(36) int[] local36 = Static157.anIntArrayArray24[local30];
			local36[arg2] = local36[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)I")
	public static int method1922(@OriginalArg(1) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local1 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local1 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method1929(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static170.aBoolean70) {
			try {
				@Pc(23) Class72 local23 = (Class72) Class.forName("Class72_Sub1").getDeclaredConstructor().newInstance();
				local23.method2096(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static170.aBoolean70 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIIIIZ)V")
	public static void method1931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static119.anInt2428 <= arg3 && arg4 <= Static200.anInt4074 && arg2 >= Static26.anInt554 && Static52.anInt1117 >= arg0) {
			Static61.method943(arg4, arg3, arg2, arg0, arg1);
		} else {
			Static96.method1399(arg4, arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1932(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		@Pc(22) int local22 = local8.method1278();
		@Pc(26) int local26 = local8.method1245();
		if (local26 < 0 || Static169.anInt3432 != 0 && Static169.anInt3432 < local26) {
			throw new RuntimeException();
		} else if (local22 == 0) {
			@Pc(94) byte[] local94 = new byte[local26];
			local8.method1268(local94, local26);
			return local94;
		} else {
			@Pc(52) int local52 = local8.method1245();
			if (local52 < 0 || Static169.anInt3432 != 0 && Static169.anInt3432 < local52) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local52];
			if (local22 == 1) {
				Static140.method1984(local73, local52, arg0, local26);
			} else {
				Static192.aClass17_1.method464(local8, local73);
			}
			return local73;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!oc;BILclient!oc;)V")
	public static void method1934(@OriginalArg(0) Class70 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class70 arg2) {
		Static199.method3159(arg0, arg1, -1, arg2, null);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!oc;ILclient!b;)Lclient!oc;")
	public static Class70 method1935(@OriginalArg(0) Class70 arg0, @OriginalArg(2) Class6 arg1) {
		if (arg0.method2036(Static61.aClass70_595) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(14) int local14 = arg0.method2036(Static112.aClass70_1106);
			if (local14 == -1) {
				while (true) {
					local14 = arg0.method2036(Static161.aClass70_1588);
					if (local14 == -1) {
						while (true) {
							local14 = arg0.method2036(Static119.aClass70_1145);
							if (local14 == -1) {
								while (true) {
									local14 = arg0.method2036(Static203.aClass70_2063);
									if (local14 == -1) {
										while (true) {
											local14 = arg0.method2036(Static184.aClass70_1807);
											if (local14 == -1) {
												while (true) {
													local14 = arg0.method2036(Static153.aClass70_1511);
													if (local14 == -1) {
														return arg0;
													}
													@Pc(229) Class70 local229 = Static61.aClass70_596;
													if (Static112.aClass29_7 != null) {
														local229 = Static178.method2792(Static112.aClass29_7.anInt975);
														try {
															if (Static112.aClass29_7.anObject2 != null) {
																@Pc(245) byte[] local245 = ((String) Static112.aClass29_7.anObject2).getBytes("ISO-8859-1");
																local229 = Static12.method263(local245.length, 0, local245);
															}
														} catch (@Pc(254) UnsupportedEncodingException local254) {
														}
													}
													arg0 = Static207.method3296(new Class70[] { arg0.method2023(local14, 0), local229, arg0.method2019(local14 + 4) });
												}
											}
											arg0 = Static207.method3296(new Class70[] { arg0.method2023(local14, 0), Static25.method461(Static183.method2099(4, arg1)), arg0.method2019(local14 + 2) });
										}
									}
									arg0 = Static207.method3296(new Class70[] { arg0.method2023(local14, 0), Static25.method461(Static183.method2099(3, arg1)), arg0.method2019(local14 + 2) });
								}
							}
							arg0 = Static207.method3296(new Class70[] { arg0.method2023(local14, 0), Static25.method461(Static183.method2099(2, arg1)), arg0.method2019(local14 + 2) });
						}
					}
					arg0 = Static207.method3296(new Class70[] { arg0.method2023(local14, 0), Static25.method461(Static183.method2099(1, arg1)), arg0.method2019(local14 + 2) });
				}
			}
			arg0 = Static207.method3296(new Class70[] { arg0.method2023(local14, 0), Static25.method461(Static183.method2099(0, arg1)), arg0.method2019(local14 + 2) });
		}
	}
}
