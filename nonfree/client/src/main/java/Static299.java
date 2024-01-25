import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	public static int anInt4664;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
	public static int anInt4672;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
	public static int anInt4665 = 0;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)J")
	public static long method3708() {
		return Static329.aClass21_1.method5371();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIIZI)Lclient!um;")
	public static Class243 method3709(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class35 local10 = null;
		if (Static253.aClass10_4 != null) {
			local10 = new Class35(arg1, Static253.aClass10_4, Static109.aClass10Array1[arg1], 1000000);
		}
		Static198.aClass104_Sub1Array1[arg1] = Static19.aClass160_1.method3319(local10, arg1, Static274.aClass35_4);
		if (arg2) {
			Static198.aClass104_Sub1Array1[arg1].method2267();
		}
		return new Class243(Static198.aClass104_Sub1Array1[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method3710() {
		Static289.method3592(Static216.aClass1_Sub1_1.aBoolean305);
		Static293.aClass5_Sub22_Sub1_2 = new Class5_Sub22_Sub1();
		Static293.aClass5_Sub22_Sub1_2.method2738();
		Static80.aClass191_1 = Static334.method4156(Static7.aClass93_1, 22050, 0, Static246.aCanvas2);
		Static80.aClass191_1.method5001(Static293.aClass5_Sub22_Sub1_2);
		Static6.method93(Static293.aClass5_Sub22_Sub1_2, Static318.aClass243_176, Static107.aClass243_62, Static448.aClass243_248);
		Static152.aClass191_2 = Static334.method4156(Static7.aClass93_1, 2048, 1, Static246.aCanvas2);
		Static119.aClass5_Sub22_Sub3_3 = new Class5_Sub22_Sub3();
		Static152.aClass191_2.method5001(Static119.aClass5_Sub22_Sub3_3);
		Static202.aClass251_1 = new Class251(22050, Static193.anInt3215);
		Static75.anInt1373 = Static451.aClass243_252.method5461("scape main");
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public static void method3711() {
		@Pc(7) Class139 local7 = null;
		try {
			@Pc(13) Class268 local13 = Static7.aClass93_1.method2100("2", true);
			while (local13.anInt7420 == 0) {
				Static140.method2004(1L);
			}
			if (local13.anInt7420 == 1) {
				local7 = (Class139) local13.anObject10;
				@Pc(39) Class5_Sub15 local39 = new Class5_Sub15(Static238.anInt3883 * 6 + 3);
				local39.method5583(1);
				local39.method5566(Static238.anInt3883);
				for (@Pc(49) int local49 = 0; local49 < Static174.anIntArray171.length; local49++) {
					if (Static14.aBooleanArray2[local49]) {
						local39.method5566(local49);
						local39.method5550(Static174.anIntArray171[local49]);
					}
				}
				local7.method2902(local39.aByteArray93, 0, local39.anInt7013);
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local7 != null) {
				local7.method2897();
			}
		} catch (@Pc(87) Exception local87) {
		}
		Static458.aLong236 = Static446.method5903();
		Static264.aBoolean278 = false;
	}
}
