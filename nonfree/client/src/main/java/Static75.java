import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Lclient!mn;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
	public static int anInt1848;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "Lclient!tl;")
	public static Class155 aClass155_11 = new Class155(64);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)V")
	public static void method1380(@OriginalArg(0) int arg0) {
		Static96.method1647();
		Static78.method1415();
		@Pc(14) int local14 = Static193.method3435(arg0).anInt493;
		if (local14 == 0) {
			return;
		}
		@Pc(33) int local33 = Static170.anIntArray601[arg0];
		if (local14 == 5) {
			Static82.anInt1966 = local33;
		}
		if (local14 == 9) {
			Static148.anInt3503 = local33;
		}
		if (local14 == 6) {
			Static32.anInt823 = local33;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1381(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static83.anInt1978 > 0) {
			local18 = Static245.aByteArrayArray123[--Static83.anInt1978];
			Static245.aByteArrayArray123[Static83.anInt1978] = null;
			return local18;
		} else if (arg0 == 5000 && Static269.anInt5836 > 0) {
			local18 = Static143.aByteArrayArray76[--Static269.anInt5836];
			Static143.aByteArrayArray76[Static269.anInt5836] = null;
			return local18;
		} else if (arg0 == 30000 && Static84.anInt1984 > 0) {
			local18 = Static94.aByteArrayArray139[--Static84.anInt1984];
			Static94.aByteArrayArray139[Static84.anInt1984] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!pi;")
	public static RuntimeException_Sub1 method1383(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString145 = local12.aString145 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)Lclient!pn;")
	public static Class126 method1384(@OriginalArg(0) int arg0) {
		@Pc(10) Class126 local10 = (Class126) Static125.aClass155_22.method4358((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static293.aClass83_202.method2306(34, arg0);
		local10 = new Class126();
		if (local29 != null) {
			local10.method3677(new Class1_Sub16(local29), arg0);
		}
		Static125.aClass155_22.method4360((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;Lclient!ok;)Ljava/lang/String;")
	public static String method1385(@OriginalArg(1) String arg0, @OriginalArg(2) Class116 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(23) int local23 = arg0.indexOf("%1");
			if (local23 == -1) {
				while (true) {
					local23 = arg0.indexOf("%2");
					if (local23 == -1) {
						while (true) {
							local23 = arg0.indexOf("%3");
							if (local23 == -1) {
								while (true) {
									local23 = arg0.indexOf("%4");
									if (local23 == -1) {
										while (true) {
											local23 = arg0.indexOf("%5");
											if (local23 == -1) {
												while (true) {
													local23 = arg0.indexOf("%dns");
													if (local23 == -1) {
														return arg0;
													}
													@Pc(199) String local199 = "";
													if (Static272.aClass43_8 != null) {
														if (Static272.aClass43_8.anObject3 == null) {
															local199 = Static147.method2779(Static272.aClass43_8.anInt1458);
														} else {
															local199 = (String) Static272.aClass43_8.anObject3;
														}
													}
													arg0 = arg0.substring(0, local23) + local199 + arg0.substring(local23 + 4);
												}
											}
											arg0 = arg0.substring(0, local23) + Static172.method3178(Static127.method2178(arg1, 4)) + arg0.substring(local23 + 2);
										}
									}
									arg0 = arg0.substring(0, local23) + Static172.method3178(Static127.method2178(arg1, 3)) + arg0.substring(local23 + 2);
								}
							}
							arg0 = arg0.substring(0, local23) + Static172.method3178(Static127.method2178(arg1, 2)) + arg0.substring(local23 + 2);
						}
					}
					arg0 = arg0.substring(0, local23) + Static172.method3178(Static127.method2178(arg1, 1)) + arg0.substring(local23 + 2);
				}
			}
			arg0 = arg0.substring(0, local23) + Static172.method3178(Static127.method2178(arg1, 0)) + arg0.substring(local23 + 2);
		}
	}
}
