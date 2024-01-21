import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bg", name = "ab", descriptor = "Lclient!ea;")
	public static Class18 aClass18_143 = Static8.method128("null");

	@OriginalMember(owner = "client!bg", name = "bb", descriptor = "Lclient!rc;")
	public static Class66 aClass66_2 = new Class66(64);

	@OriginalMember(owner = "client!bg", name = "hb", descriptor = "I")
	public static int anInt430 = 0;

	@OriginalMember(owner = "client!bg", name = "kb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_144 = Static8.method128(")2");

	@OriginalMember(owner = "client!bg", name = "pb", descriptor = "I")
	public static int anInt437 = 1;

	@OriginalMember(owner = "client!bg", name = "qb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_145 = Static8.method128("leuchten2:");

	@OriginalMember(owner = "client!bg", name = "rb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_146 = Static8.method128("<br>(X100(U(Y");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method266(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static23.method427(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static97.aClass53_2.anApplet1 != null) {
				@Pc(101) Class26 local101 = Static97.aClass53_2.method2274(new URL(Static97.aClass53_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static172.anInt4635 + "&u=" + Static164.aLong130 + "&v1=" + Static112.aString5 + "&v2=" + Static112.aString4 + "&e=" + local7));
				while (local101.anInt1788 == 0) {
					Static114.method2304(1L);
				}
				if (local101.anInt1788 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local101.anObject2;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "(I)V")
	public static void method267() {
		aClass18_144 = null;
		aClass66_2 = null;
		aClass18_146 = null;
		aClass18_143 = null;
		aClass18_145 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!dd;IBLclient!dd;I)Lclient!m;")
	public static Class1_Sub1_Sub8_Sub2_Sub1 method268(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) int arg3) {
		return Static65.method1300(arg1, arg0, arg3) ? Static21.method369(arg2.method2254(arg1, arg3)) : null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!c;I)V")
	public static void method269(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub5_Sub1 arg1) {
		if (Static41.anInt1322 < arg1.anInt3563) {
			Static114.method2310(arg1);
		} else if (arg1.anInt3580 >= Static41.anInt1322) {
			Static20.method350(arg1);
		} else {
			Static29.method645(arg1);
		}
		if (arg1.anInt3579 < 128 || arg1.anInt3558 < 128 || arg1.anInt3579 >= 13184 || arg1.anInt3558 >= 13184) {
			arg1.anInt3580 = 0;
			arg1.anInt3552 = -1;
			arg1.anInt3568 = -1;
			arg1.anInt3579 = arg1.anIntArray314[0] * 128 + arg1.anInt3591 * 64;
			arg1.anInt3558 = arg1.anInt3591 * 64 + arg1.anIntArray315[0] * 128;
			arg1.anInt3563 = 0;
			arg1.method2483();
		}
		if (arg1 == Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1 && (arg1.anInt3579 < 1536 || arg1.anInt3558 < 1536 || arg1.anInt3579 >= 11776 || arg1.anInt3558 >= 11776)) {
			arg1.anInt3579 = arg1.anInt3591 * 64 + arg1.anIntArray314[0] * 128;
			arg1.anInt3552 = -1;
			arg1.anInt3568 = -1;
			arg1.anInt3563 = 0;
			arg1.anInt3580 = 0;
			arg1.anInt3558 = arg1.anInt3591 * 64 + arg1.anIntArray315[0] * 128;
			arg1.method2483();
		}
		Static89.method1929(arg1);
		Static51.method1104(arg1);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!hc;Z)Lclient!fe;")
	public static Class1_Sub4 method270(@OriginalArg(0) Class1_Sub6 arg0) {
		@Pc(9) int local9 = arg0.method544();
		@Pc(13) int local13 = arg0.method544();
		@Pc(21) Class local21 = Static45.method1023(local13);
		try {
			@Pc(25) Class1_Sub4 local25 = (Class1_Sub4) local21.getDeclaredConstructor().newInstance();
			if (local25 != null) {
				local25.anInt4761 = local9;
				local25.anInt4757 = arg0.method544();
				@Pc(44) int local44 = arg0.method544();
				for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
					@Pc(52) int local52 = arg0.method544();
					local25.method3205(arg0, local52);
				}
			}
			local25.method3207();
			return local25;
		} catch (@Pc(71) IllegalAccessException local71) {
			throw new RuntimeException();
		} catch (@Pc(76) InstantiationException local76) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIIILclient!qa;)V")
	public static void method271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub5_Sub1_Sub2 arg3) {
		if (arg3 == Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1 || Static80.anInt2478 >= 400) {
			return;
		}
		@Pc(54) Class18 local54;
		if (arg3.anInt3608 == 0) {
			local54 = Static144.method2735(new Class18[] { arg3.aClass18_908, Static113.method2976(arg3.anInt3621, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3621), Static132.aClass18_948, Static161.aClass18_1137, Static132.method2564(arg3.anInt3621), Static57.aClass18_444 });
		} else {
			local54 = Static144.method2735(new Class18[] { arg3.aClass18_908, Static132.aClass18_948, Static40.aClass18_310, Static132.method2564(arg3.anInt3608), Static57.aClass18_444 });
		}
		@Pc(94) int local94;
		if (Static98.anInt3018 == 1) {
			method272(22, arg2, Static144.aClass18_1016, arg0, Static144.method2735(new Class18[] { Static135.aClass18_967, Static115.aClass18_834, local54 }), arg1);
		} else if (!Static21.aBoolean19) {
			for (local94 = 7; local94 >= 0; local94--) {
				if (Static153.aClass18Array22[local94] != null) {
					@Pc(106) short local106 = 0;
					if (Static153.aClass18Array22[local94].method734(Static39.aClass18_291)) {
						if (arg3.anInt3621 > Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3621) {
							local106 = 2000;
						}
						if (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3627 != 0 && arg3.anInt3627 != 0) {
							if (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3627 == arg3.anInt3627) {
								local106 = 2000;
							} else {
								local106 = 0;
							}
						}
					} else if (Static115.aBooleanArray12[local94]) {
						local106 = 2000;
					}
					@Pc(158) int local158 = Static93.anIntArray261[local94] + local106;
					method272(local158, arg2, Static153.aClass18Array22[local94], arg0, Static144.method2735(new Class18[] { Static57.aClass18_440, local54 }), arg1);
				}
			}
		} else if ((Static122.anInt3449 & 0x8) == 8) {
			method272(34, arg2, Static9.aClass18_106, arg0, Static144.method2735(new Class18[] { Static127.aClass18_912, Static115.aClass18_834, local54 }), arg1);
		}
		for (local94 = 0; local94 < Static80.anInt2478; local94++) {
			if (Static114.anIntArray288[local94] == 2) {
				Static180.aClass18Array25[local94] = Static144.method2735(new Class18[] { Static57.aClass18_440, local54 });
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!ea;IZLclient!ea;I)V")
	public static void method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class18 arg4, @OriginalArg(6) int arg5) {
		if (Static149.aBoolean185 || Static80.anInt2478 >= 500) {
			return;
		}
		Static84.aClass18Array13[Static80.anInt2478] = arg2;
		Static180.aClass18Array25[Static80.anInt2478] = arg4;
		Static114.anIntArray288[Static80.anInt2478] = arg0;
		Static131.anIntArray334[Static80.anInt2478] = arg5;
		Static123.anIntArray311[Static80.anInt2478] = arg3;
		Static130.anIntArray332[Static80.anInt2478] = arg1;
		Static80.anInt2478++;
	}
}
