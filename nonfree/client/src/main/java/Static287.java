import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
	public static int[] anIntArray413;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
	public static int[] anIntArray415;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!jf;")
	public static Class96 aClass96_17;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_96 = new Class66(5);

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!jf;")
	public static Class96 aClass96_16 = null;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
	public static final int[] anIntArray414 = new int[50];

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString321 = "Loading textures - ";

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "J")
	public static long aLong190 = -1L;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!am;)V")
	public static void method4908(@OriginalArg(1) Class10 arg0) {
		@Pc(7) Class117 local7 = null;
		try {
			@Pc(11) Class60 local11 = arg0.method328();
			while (local11.anInt1838 == 0) {
				Static105.method2138(1L);
			}
			if (local11.anInt1838 == 1) {
				local7 = (Class117) local11.anObject2;
				@Pc(39) Class5_Sub1 local39 = Static278.method4729();
				local7.method3256(local39.anInt2029, 0, local39.aByteArray18);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local7 != null) {
				local7.method3260();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIII)V")
	public static void method4909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class5_Sub27 local6 = (Class5_Sub27) Static82.aClass211_6.method5608(); local6 != null; local6 = (Class5_Sub27) Static82.aClass211_6.method5603()) {
			Static147.method2738(arg2, arg1, arg0, local6, arg3);
		}
		for (@Pc(39) Class5_Sub27 local39 = (Class5_Sub27) Static16.aClass211_1.method5608(); local39 != null; local39 = (Class5_Sub27) Static16.aClass211_1.method5603()) {
			@Pc(43) byte local43 = 1;
			@Pc(48) Class33 local48 = local39.aClass25_Sub1_Sub1_Sub2_1.method4659();
			if (local39.aClass25_Sub1_Sub1_Sub2_1.aBoolean405) {
				local43 = 0;
			} else if (local48.anInt950 == local39.aClass25_Sub1_Sub1_Sub2_1.anInt5276 || local48.anInt965 == local39.aClass25_Sub1_Sub1_Sub2_1.anInt5276 || local39.aClass25_Sub1_Sub1_Sub2_1.anInt5276 == local48.anInt982 || local39.aClass25_Sub1_Sub1_Sub2_1.anInt5276 == local48.anInt971) {
				local43 = 2;
			} else if (local48.anInt973 == local39.aClass25_Sub1_Sub1_Sub2_1.anInt5276 || local39.aClass25_Sub1_Sub1_Sub2_1.anInt5276 == local48.anInt961 || local48.anInt954 == local39.aClass25_Sub1_Sub1_Sub2_1.anInt5276 || local39.aClass25_Sub1_Sub1_Sub2_1.anInt5276 == local48.anInt952) {
				local43 = 3;
			}
			if (local43 != local39.anInt3741) {
				@Pc(147) int local147 = Static118.method2321(local39.aClass25_Sub1_Sub1_Sub2_1);
				if (local39.anInt3737 != local147) {
					if (local39.aClass5_Sub17_Sub1_1 != null) {
						Static5.aClass5_Sub17_Sub3_1.method3544(local39.aClass5_Sub17_Sub1_1);
						local39.aClass5_Sub17_Sub1_1 = null;
					}
					local39.anInt3737 = local147;
				}
				local39.anInt3741 = local43;
			}
			local39.anInt3735 = local39.aClass25_Sub1_Sub1_Sub2_1.anInt5769;
			local39.anInt3738 = local39.aClass25_Sub1_Sub1_Sub2_1.anInt5769 + local39.aClass25_Sub1_Sub1_Sub2_1.method4646() * 64;
			local39.anInt3730 = local39.aClass25_Sub1_Sub1_Sub2_1.anInt5773;
			local39.anInt3731 = local39.aClass25_Sub1_Sub1_Sub2_1.anInt5773 + local39.aClass25_Sub1_Sub1_Sub2_1.method4646() * 64;
			Static147.method2738(arg2, arg1, arg0, local39, arg3);
		}
		for (@Pc(225) Class5_Sub27 local225 = (Class5_Sub27) Static331.aClass42_55.method1060(); local225 != null; local225 = (Class5_Sub27) Static331.aClass42_55.method1055()) {
			@Pc(229) byte local229 = 1;
			@Pc(234) Class33 local234 = local225.aClass25_Sub1_Sub1_Sub1_2.method4659();
			if (local225.aClass25_Sub1_Sub1_Sub1_2.aBoolean405) {
				local229 = 0;
			} else if (local225.aClass25_Sub1_Sub1_Sub1_2.anInt5276 == local234.anInt950 || local234.anInt965 == local225.aClass25_Sub1_Sub1_Sub1_2.anInt5276 || local234.anInt982 == local225.aClass25_Sub1_Sub1_Sub1_2.anInt5276 || local234.anInt971 == local225.aClass25_Sub1_Sub1_Sub1_2.anInt5276) {
				local229 = 2;
			} else if (local225.aClass25_Sub1_Sub1_Sub1_2.anInt5276 == local234.anInt973 || local225.aClass25_Sub1_Sub1_Sub1_2.anInt5276 == local234.anInt961 || local234.anInt954 == local225.aClass25_Sub1_Sub1_Sub1_2.anInt5276 || local225.aClass25_Sub1_Sub1_Sub1_2.anInt5276 == local234.anInt952) {
				local229 = 3;
			}
			if (local225.anInt3741 != local229) {
				@Pc(329) int local329 = Static139.method5471(local225.aClass25_Sub1_Sub1_Sub1_2);
				if (local225.anInt3737 != local329) {
					if (local225.aClass5_Sub17_Sub1_1 != null) {
						Static5.aClass5_Sub17_Sub3_1.method3544(local225.aClass5_Sub17_Sub1_1);
						local225.aClass5_Sub17_Sub1_1 = null;
					}
					local225.anInt3737 = local329;
				}
				local225.anInt3741 = local229;
			}
			local225.anInt3735 = local225.aClass25_Sub1_Sub1_Sub1_2.anInt5769;
			local225.anInt3738 = local225.aClass25_Sub1_Sub1_Sub1_2.anInt5769 + local225.aClass25_Sub1_Sub1_Sub1_2.method4646() * 64;
			local225.anInt3730 = local225.aClass25_Sub1_Sub1_Sub1_2.anInt5773;
			local225.anInt3731 = local225.aClass25_Sub1_Sub1_Sub1_2.anInt5773 + local225.aClass25_Sub1_Sub1_Sub1_2.method4646() * 64;
			Static147.method2738(arg2, arg1, arg0, local225, arg3);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!bo;IIII)V")
	public static void method4910(@OriginalArg(2) Class25_Sub1_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static78.method1746(arg0.anInt5773, arg3, arg0.anInt5769, 0, arg2, arg1);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)I")
	public static int method4911(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local15 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local15;
		} else {
			return local15;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static void method4912(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static186.aClass5_Sub9_Sub8_3 != null) {
			Static256.anInt4994 = Static186.aClass5_Sub9_Sub8_3.anInt2233;
		} else {
			Static256.anInt4994 = -1;
		}
		Static17.aClass96_19 = null;
		Static203.anInt3932 = 0;
		Static186.aClass5_Sub9_Sub8_3 = null;
		Static99.aClass211_8 = null;
		Static186.method5345();
		Static186.aClass211_36.method5600();
		Static172.aClass75_5 = null;
		Static228.aClass75_8 = null;
		Static106.aClass75_1 = null;
		Static161.aClass75_4 = null;
		Static302.aClass75_9 = null;
		Static321.anInt6091 = -1;
		Static55.anInt1337 = -1;
		Static232.aClass54_13 = null;
		Static225.aClass75_7 = null;
		Static188.aClass75_6 = null;
		Static191.aClass75_10 = null;
		Static186.aClass194_2 = null;
		Static306.method5233();
		Static102.aClass191_1 = null;
		Static270.method4560(128, 64);
		Static178.method3306(64, 64);
		Static206.method3685(64);
		Static117.method2313(64);
	}
}
