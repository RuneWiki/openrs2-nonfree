import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!gl;")
	public static Class4_Sub3_Sub5 aClass4_Sub3_Sub5_1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt528 = -1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[I")
	public static int[] anIntArray47 = new int[14];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!fh;ILclient!fh;)V")
	public static void method514(@OriginalArg(0) Class58 arg0, @OriginalArg(2) Class58 arg1) {
		Static129.aClass58_58 = arg1;
		Static6.aClass58_3 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method516() {
		Static281.method4347();
		Static245.method3163();
		Static170.method2710();
		Static116.aClass40_11.method893();
		Static125.aClass97_1 = new Class97();
		((Class24_Sub1) Static158.anInterface5_1).method460();
		Static64.method1027();
		Static196.aClass50Array1 = new Class50[255];
		Static196.anInt3736 = 0;
		Static247.method3913();
		Static74.method1211();
		Static89.method1556();
		Static27.method384(false);
		Static150.method2418();
		Static125.method1930();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(51) Class53_Sub1_Sub1 local51 = Static182.aClass53_Sub1_Sub1Array1[local42];
			if (local51 != null) {
				local51.anObject5 = null;
			}
		}
		if (Static94.aBoolean138) {
			Static74.method1205();
			Static22.method300(Static300.aBoolean391);
			Static184.method2982();
		}
		Static8.method113(Static7.aClass58_4, Static152.aClass58_67);
		Static280.method667(Static7.aClass58_4);
		Static254.aClass4_Sub3_Sub14_5 = null;
		Static266.aClass4_Sub3_Sub14_8 = null;
		Static82.aClass4_Sub3_Sub14_2 = null;
		Static281.aClass4_Sub3_Sub14_9 = null;
		Static24.aClass4_Sub3_Sub14_1 = null;
		if (Static169.anInt3304 == 5) {
			Static165.method2688(Static7.aClass58_4);
		}
		if (Static169.anInt3304 == 10) {
			Static39.method605(false);
		}
		if (Static169.anInt3304 == 30) {
			Static15.method233(25);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!io;ZI)V")
	public static void method519(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray2;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class4_Sub3_Sub13 local18 = Static44.method718(local14);
		if (local18 == null) {
			return;
		}
		Static150.aStringArray21 = new String[local18.anInt2660];
		@Pc(29) int local29 = 0;
		Static154.anIntArray272 = new int[local18.anInt2662];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = 1; local37 < local8.length; local37++) {
			if (local8[local37] instanceof Integer) {
				@Pc(56) int local56 = (Integer) local8[local37];
				if (local56 == -2147483647) {
					local56 = arg0.anInt2495;
				}
				if (local56 == -2147483646) {
					local56 = arg0.anInt2492;
				}
				if (local56 == -2147483645) {
					local56 = arg0.aClass189_7 == null ? -1 : arg0.aClass189_7.anInt5918;
				}
				if (local56 == -2147483644) {
					local56 = arg0.anInt2494;
				}
				if (local56 == -2147483643) {
					local56 = arg0.aClass189_7 == null ? -1 : arg0.aClass189_7.anInt5972;
				}
				if (local56 == -2147483642) {
					local56 = arg0.aClass189_6 == null ? -1 : arg0.aClass189_6.anInt5918;
				}
				if (local56 == -2147483641) {
					local56 = arg0.aClass189_6 == null ? -1 : arg0.aClass189_6.anInt5972;
				}
				if (local56 == -2147483640) {
					local56 = arg0.anInt2488;
				}
				if (local56 == -2147483639) {
					local56 = arg0.anInt2490;
				}
				Static154.anIntArray272[local29++] = local56;
			} else if (local8[local37] instanceof String) {
				@Pc(168) String local168 = (String) local8[local37];
				if (local168.equals("event_opbase")) {
					local168 = arg0.aString143;
				}
				Static150.aStringArray21[local35++] = local168;
			}
		}
		Static88.method1551(arg1, local18);
	}
}
