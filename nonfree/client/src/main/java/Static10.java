import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!cb", name = "gd", descriptor = "Lclient!rc;")
	private static Class55 aClass55_242 = Static34.method846("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!cb", name = "nd", descriptor = "Lclient!rc;")
	private static Class55 aClass55_244 = Static34.method846("No reply from loginserver)3");

	@OriginalMember(owner = "client!cb", name = "jd", descriptor = "Lclient!rc;")
	public static Class55 aClass55_243 = aClass55_244;

	@OriginalMember(owner = "client!cb", name = "sd", descriptor = "[I")
	public static int[] anIntArray43 = new int[500];

	@OriginalMember(owner = "client!cb", name = "vd", descriptor = "Lclient!rc;")
	public static Class55 aClass55_246 = aClass55_242;

	@OriginalMember(owner = "client!cb", name = "zd", descriptor = "Lclient!rc;")
	private static Class55 aClass55_247 = Static34.method846("Prepared visibility map");

	@OriginalMember(owner = "client!cb", name = "Gd", descriptor = "Lclient!rc;")
	public static Class55 aClass55_248 = Static34.method846("(Y");

	@OriginalMember(owner = "client!cb", name = "Id", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!cb", name = "Md", descriptor = "Lclient!rc;")
	public static Class55 aClass55_249 = aClass55_247;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(I)V")
	public static void method444() {
		Static8.aClass19_1.method1168();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static49.aLongArray4[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static28.aLongArray2[local24] = 0L;
		}
		Static64.anInt1916 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
	public static void method445() {
		@Pc(5) Object local5 = Static3.anObject1;
		synchronized (Static3.anObject1) {
			if (Static24.anInt1065 == 0) {
				Static102.aClass20_4.method728(5, new Class49());
			}
			Static24.anInt1065 = 600;
		}
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(I)V")
	public static void method447() {
		if (Static59.aClass24_1 != null) {
			@Pc(12) Class24 local12 = Static59.aClass24_1;
			synchronized (Static59.aClass24_1) {
				Static59.aClass24_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZLclient!vc;)V")
	public static void method448(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class65 arg1) {
		if (Static57.aClass65_3 != null) {
			try {
				Static57.aClass65_3.method2012();
			} catch (@Pc(12) Exception local12) {
			}
			Static57.aClass65_3 = null;
		}
		Static57.aClass65_3 = arg1;
		Static32.method801(arg0);
		Static83.aClass6_Sub1_5.anInt2209 = 0;
		Static75.aClass6_Sub1_4 = null;
		Static3.aClass6_Sub2_Sub9_1 = null;
		Static78.anInt2241 = 0;
		while (true) {
			@Pc(37) Class6_Sub2_Sub9 local37 = (Class6_Sub2_Sub9) Static34.aClass38_17.method1180();
			if (local37 == null) {
				while (true) {
					local37 = (Class6_Sub2_Sub9) Static88.aClass38_36.method1180();
					if (local37 == null) {
						if (Static21.aByte1 != 0) {
							try {
								@Pc(92) Class6_Sub1 local92 = new Class6_Sub1(4);
								local92.method1501(4);
								local92.method1501(Static21.aByte1);
								local92.method1512(0);
								Static57.aClass65_3.method2009(local92.aByteArray11, 4);
							} catch (@Pc(113) IOException local113) {
								try {
									Static57.aClass65_3.method2012();
								} catch (@Pc(118) Exception local118) {
								}
								Static57.aClass65_3 = null;
								Static24.anInt1088++;
							}
						}
						Static79.anInt2294 = 0;
						Static88.aLong115 = Static1.method3();
						return;
					}
					Static57.aClass11_2.method459(local37);
					Static78.aClass38_24.method1184(local37, local37.aLong114);
					Static7.anInt286--;
					Static8.anInt376++;
				}
			}
			Static20.aClass38_11.method1184(local37, local37.aLong114);
			Static91.anInt2532++;
			Static47.anInt1513--;
		}
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(I)V")
	public static void method449() {
		anIntArray43 = null;
		aClass55_247 = null;
		aClass55_249 = null;
		aClass55_244 = null;
		aClass55_246 = null;
		aClass55_248 = null;
		aClass55_243 = null;
		aClass55_242 = null;
	}
}
