import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aq", name = "J", descriptor = "[S")
	public static short[] aShortArray110;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_3 = new Class62(100);

	@OriginalMember(owner = "client!aq", name = "G", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[112];

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!bi;ZLjava/lang/String;)Ljava/lang/String;")
	public static String method4456(@OriginalArg(0) Class26 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(20) int local20 = arg1.indexOf("%1");
			if (local20 == -1) {
				while (true) {
					local20 = arg1.indexOf("%2");
					if (local20 == -1) {
						while (true) {
							local20 = arg1.indexOf("%3");
							if (local20 == -1) {
								while (true) {
									local20 = arg1.indexOf("%4");
									if (local20 == -1) {
										while (true) {
											local20 = arg1.indexOf("%5");
											if (local20 == -1) {
												while (true) {
													local20 = arg1.indexOf("%dns");
													if (local20 == -1) {
														return arg1;
													}
													@Pc(183) String local183 = "";
													if (Static166.aClass99_7 != null) {
														if (Static166.aClass99_7.anObject2 == null) {
															local183 = Static37.method836(Static166.aClass99_7.anInt2834);
														} else {
															local183 = (String) Static166.aClass99_7.anObject2;
														}
													}
													arg1 = arg1.substring(0, local20) + local183 + arg1.substring(local20 + 4);
												}
											}
											arg1 = arg1.substring(0, local20) + Static133.method2669(Static164.method3152(4, arg0)) + arg1.substring(local20 + 2);
										}
									}
									arg1 = arg1.substring(0, local20) + Static133.method2669(Static164.method3152(3, arg0)) + arg1.substring(local20 + 2);
								}
							}
							arg1 = arg1.substring(0, local20) + Static133.method2669(Static164.method3152(2, arg0)) + arg1.substring(local20 + 2);
						}
					}
					arg1 = arg1.substring(0, local20) + Static133.method2669(Static164.method3152(1, arg0)) + arg1.substring(local20 + 2);
				}
			}
			arg1 = arg1.substring(0, local20) + Static133.method2669(Static164.method3152(0, arg0)) + arg1.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)V")
	public static void method4464(@OriginalArg(0) int arg0) {
		Static291.anInt5670 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)Lclient!ml;")
	public static Class138 method4472(@OriginalArg(1) int arg0) {
		@Pc(5) Class103 local5 = Static325.aClass103_64;
		@Pc(16) Class138 local16;
		synchronized (Static325.aClass103_64) {
			local16 = (Class138) Static325.aClass103_64.method2682((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = Static291.aClass180_83.method4560(Static28.method500(arg0), Static350.method5620(arg0));
		local16 = new Class138();
		local16.anInt3978 = arg0;
		if (local41 != null) {
			local16.method3587(new Class7_Sub3(local41));
		}
		local16.method3590();
		if (local16.anInt3962 != -1) {
			local16.method3586(method4472(local16.anInt4003), method4472(local16.anInt3962));
		}
		if (local16.anInt4007 != -1) {
			local16.method3598(method4472(local16.anInt4007), method4472(local16.anInt4001));
		}
		if (!Static114.aBoolean180 && local16.aBoolean311) {
			local16.anIntArray552 = null;
			local16.aStringArray35 = Static54.aStringArray11;
			local16.anInt3999 = 0;
			local16.aStringArray36 = Static28.aStringArray7;
			local16.aBoolean312 = false;
			local16.aString261 = Static263.aString327;
		}
		@Pc(117) Class103 local117 = Static325.aClass103_64;
		synchronized (Static325.aClass103_64) {
			Static325.aClass103_64.method2687(local16, (long) arg0);
			return local16;
		}
	}
}
