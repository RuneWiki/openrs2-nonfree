import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!rv", name = "S", descriptor = "Lclient!um;")
	public static Class238 aClass238_6;

	@OriginalMember(owner = "client!rv", name = "M", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_213 = new Class92(12, -1);

	@OriginalMember(owner = "client!rv", name = "R", descriptor = "[I")
	public static final int[] anIntArray461 = new int[14];

	@OriginalMember(owner = "client!rv", name = "T", descriptor = "I")
	public static int anInt6393 = 0;

	@OriginalMember(owner = "client!rv", name = "U", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_229 = new Class184(67, 6);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIB)V")
	public static void method5050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub3_Sub7 local15 = Static139.method2522(13, arg0);
		local15.method1570();
		local15.anInt1933 = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!wk;III)J")
	public static long method5051(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class128 local16 = Static55.aClass25_1.method855(arg0.method5847());
		@Pc(37) long local37 = (long) (arg1 | arg2 << 7 | arg0.method5848() << 14 | arg0.method5851() << 20 | 0x40000000);
		if (local16.anInt4009 == 0) {
			local37 |= local9;
		}
		if (local16.anInt4007 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean323) {
			local37 |= local7;
		}
		return local37 | (long) arg0.method5847() << 32;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZ)V")
	public static void method5052(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static266.aClass75_7 = Static318.method2582(Static295.aClass103_5, Static351.aCanvas6, Static239.anInterface7_8, Static123.aClass21_Sub1_1.anInt879 * 2, arg0);
		} else {
			if (arg1) {
				Static266.aClass75_7 = Static318.method2582(Static295.aClass103_5, Static351.aCanvas6, Static239.anInterface7_8, 0, 0);
				Static266.aClass75_7.M(0);
				@Pc(39) Class179 local39 = Static334.method4856(Static420.aClass56_87, Static126.anInt3503);
				@Pc(48) Class65 local48 = Static266.aClass75_7.method2601(local39, Static460.method3984(Static20.aClass56_10, Static126.anInt3503));
				Static373.method5170(local48, true, Static427.aClass175_237.method4201(Static216.anInt4257));
				Static266.aClass75_7.method2594();
				Static5.method103();
				Static266.aClass75_7.method2608();
			}
			try {
				Static266.aClass75_7 = Static318.method2582(Static295.aClass103_5, Static351.aCanvas6, Static239.anInterface7_8, Static123.aClass21_Sub1_1.anInt879 * 2, arg0);
				if (Static266.aClass75_7.method2612()) {
					@Pc(81) Class3_Sub27 local81 = Static266.aClass75_7.method2588();
					Static266.aClass75_7.method2576(local81);
				}
			} catch (@Pc(86) Throwable local86) {
				Static266.aClass75_7 = Static318.method2582(Static295.aClass103_5, Static351.aCanvas6, Static239.anInterface7_8, 0, 0);
				arg0 = 0;
			}
		}
		Static347.anInt6318 = arg0;
		Static160.method2754();
		if (!Static266.aClass75_7.method2623()) {
			Static180.anInt3696 = 1;
		}
		Static266.aClass75_7.method2634(Static180.anInt3696);
		Static266.aClass75_7.method2606(0);
		Static266.aClass75_7.na(8);
		Static203.aClass106_2 = Static266.aClass75_7.method2636();
		Static306.aClass106_5 = Static266.aClass75_7.method2636();
		Static158.method2737();
		Static266.aClass75_7.method2592(!Static123.aClass21_Sub1_1.aBoolean70);
		if (Static266.aClass75_7.method2593()) {
			Static115.method2112(Static123.aClass21_Sub1_1.aBoolean82);
		}
		Static322.method4688(Static266.aClass75_7, Static127.anInt2696 >> 3, Static399.anInt6923 >> 3);
		Static373.method5169();
		Static103.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(I)V")
	public static void method5054() {
		Static252.aClass22_12 = null;
		Static315.aClass22_17 = null;
		Static309.aClass22_15 = null;
		Static433.aClass22_20 = null;
		Static84.aClass22_3 = null;
		Static233.aClass22_10 = null;
		Static315.aClass22_16 = null;
		Static106.aClass22_4 = null;
	}
}
