import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!we", name = "z", descriptor = "Lclient!jg;")
	public static Class44 aClass44_35;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "I")
	public static int anInt3953;

	@OriginalMember(owner = "client!we", name = "Q", descriptor = "[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] aClass3_Sub2_Sub3_Sub3Array10;

	@OriginalMember(owner = "client!we", name = "R", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_17;

	@OriginalMember(owner = "client!we", name = "S", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!we", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray21 = new boolean[8];

	@OriginalMember(owner = "client!we", name = "L", descriptor = "[I")
	public static int[] anIntArray438 = new int[1000];

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	public static int anInt3950 = 1;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method2870() {
		aClass44_Sub1_17 = null;
		aClass44_35 = null;
		aClass3_Sub2_Sub3_Sub3Array10 = null;
		aBooleanArray21 = null;
		anIntArray438 = null;
		anIntArray439 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Component;BII)Lclient!ug;")
	public static Class8 method2871(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class8_Sub2");
			@Pc(10) Class8 local10 = (Class8) local6.getDeclaredConstructor().newInstance();
			local10.method519(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class8_Sub1 local28 = new Class8_Sub1();
			local28.method519(arg0, arg1, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!h;")
	public static Class33 method2873(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(11) int local11 = arg0 >> 16;
		if (Static26.aClass33ArrayArray1[local11] == null || Static26.aClass33ArrayArray1[local11][local7] == null) {
			@Pc(25) boolean local25 = Static57.method1063(local11);
			if (!local25) {
				return null;
			}
		}
		return Static26.aClass33ArrayArray1[local11][local7];
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	public static void method2874() {
		@Pc(10) int local10 = Static49.aClass3_Sub4_Sub1_2.method228(8);
		@Pc(15) int local15;
		if (Static180.anInt3971 > local10) {
			for (local15 = local10; local15 < Static180.anInt3971; local15++) {
				Static150.anIntArray393[Static143.anInt3279++] = Static127.anIntArray338[local15];
			}
		}
		if (local10 > Static180.anInt3971) {
			throw new RuntimeException("gppov1");
		}
		Static180.anInt3971 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(64) int local64 = Static127.anIntArray338[local15];
			@Pc(68) Class3_Sub2_Sub1_Sub1_Sub1 local68 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local64];
			@Pc(75) int local75 = Static49.aClass3_Sub4_Sub1_2.method228(1);
			if (local75 == 0) {
				Static127.anIntArray338[Static180.anInt3971++] = local64;
				local68.anInt1734 = Static20.anInt512;
			} else {
				@Pc(98) int local98 = Static49.aClass3_Sub4_Sub1_2.method228(2);
				if (local98 == 0) {
					Static127.anIntArray338[Static180.anInt3971++] = local64;
					local68.anInt1734 = Static20.anInt512;
					Static14.anIntArray25[Static108.anInt2585++] = local64;
				} else {
					@Pc(140) int local140;
					@Pc(152) int local152;
					if (local98 == 1) {
						Static127.anIntArray338[Static180.anInt3971++] = local64;
						local68.anInt1734 = Static20.anInt512;
						local140 = Static49.aClass3_Sub4_Sub1_2.method228(3);
						local68.method1163(false, local140);
						local152 = Static49.aClass3_Sub4_Sub1_2.method228(1);
						if (local152 == 1) {
							Static14.anIntArray25[Static108.anInt2585++] = local64;
						}
					} else if (local98 == 2) {
						Static127.anIntArray338[Static180.anInt3971++] = local64;
						local68.anInt1734 = Static20.anInt512;
						local140 = Static49.aClass3_Sub4_Sub1_2.method228(3);
						local68.method1163(true, local140);
						local152 = Static49.aClass3_Sub4_Sub1_2.method228(3);
						local68.method1163(true, local152);
						@Pc(208) int local208 = Static49.aClass3_Sub4_Sub1_2.method228(1);
						if (local208 == 1) {
							Static14.anIntArray25[Static108.anInt2585++] = local64;
						}
					} else if (local98 == 3) {
						Static150.anIntArray393[Static143.anInt3279++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public static void method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(18) Class3_Sub2_Sub13 local18 = (Class3_Sub2_Sub13) Static40.aClass54_4.method1602(local10);
		if (local18 != null) {
			Static80.aClass7_1.method299(local18);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([BB)Lclient!ef;")
	public static Class3_Sub2_Sub3_Sub1_Sub1 method2876(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class3_Sub2_Sub3_Sub1_Sub1 local23 = new Class3_Sub2_Sub3_Sub1_Sub1(arg0, Static135.anIntArray363, Static71.anIntArray172, Static54.anIntArray131, Static87.anIntArray219, Static90.anIntArray226, Static32.aByteArrayArray4);
			Static181.method2896();
			return local23;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!jg;Lclient!jg;ILclient!jg;Lclient!jg;)V")
	public static void method2877(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(3) Class44 arg2, @OriginalArg(4) Class44 arg3) {
		Static174.aClass44_31 = arg3;
		Static15.aClass44_3 = arg0;
		Static104.aClass44_20 = arg2;
		Static18.aClass44_4 = arg1;
		Static26.aClass33ArrayArray1 = new Class33[Static18.aClass44_4.method1625()][];
		Static123.aBooleanArray16 = new boolean[Static18.aClass44_4.method1625()];
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
	public static void method2878() {
		@Pc(5) Class70 local5 = Static156.aClass70_1;
		synchronized (Static156.aClass70_1) {
			Static56.anInt1508 = Static55.anInt1456;
			Static85.anInt676 = Static147.anInt3357;
			Static149.anInt3582 = Static6.anInt138;
			Static127.anInt3013 = Static130.anInt3068;
			Static77.anInt1923 = Static180.anInt3973;
			Static48.anInt1329 = Static180.anInt3970;
			Static53.aLong54 = Static148.aLong125;
			Static130.anInt3068 = 0;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IIII)V")
	public static void method2879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class33 local6 = Static98.method1607(arg0, arg1);
		if (local6 != null && local6.anObjectArray20 != null) {
			@Pc(15) Class3_Sub14 local15 = new Class3_Sub14();
			local15.anObjectArray28 = local6.anObjectArray20;
			local15.aClass33_10 = local6;
			Static71.method1217(local15);
		}
		Static90.aBoolean94 = true;
		Static130.anInt3069 = arg1;
		Static64.anInt1664 = arg2;
		Static167.anInt740 = arg0;
		Static142.method2373(local6);
	}
}
