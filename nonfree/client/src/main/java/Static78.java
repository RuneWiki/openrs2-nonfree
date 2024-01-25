import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "[Lclient!faa;")
	public static Class97[] aClass97Array1;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[8];

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZZ)V")
	public static void method1115(@OriginalArg(0) boolean arg0) {
		Static113.anInt1926 = 0;
		Static314.anInt6059 = 0;
		Static260.method3991();
		Static478.method6622(arg0);
		Static317.method4953();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static113.anInt1926; local20++) {
			local26 = Static464.anIntArray570[local20];
			@Pc(33) Class6_Sub49 local33 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local26);
			@Pc(36) Class15_Sub2_Sub4_Sub1 local36 = local33.aClass15_Sub2_Sub4_Sub1_2;
			if (Static266.aBoolean351 && Static555.method7724(local26)) {
				Static286.method4360();
			}
			if (Static363.anInt6671 != local36.anInt8966) {
				if (local36.aClass88_1.method1942()) {
					Static32.method512(local36);
				}
				local36.method4297(null);
				local18 = true;
				local33.method7948();
			}
		}
		if (local18) {
			Static192.anInt3744 = Static251.aClass234_29.method5460();
			Static251.aClass234_29.method5462(Static324.aClass6_Sub49Array1);
		}
		if (Static207.anInt3929 != Static429.aClass6_Sub12_Sub2_2.anInt7556) {
			throw new RuntimeException("gnp1 pos:" + Static429.aClass6_Sub12_Sub2_2.anInt7556 + " psize:" + Static207.anInt3929);
		}
		for (local26 = 0; local26 < Static429.anInt7650; local26++) {
			if (Static251.aClass234_29.method5464((long) Static46.anIntArray36[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static429.anInt7650);
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIILclient!oa;)V")
	public static void method1116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class90 arg7) {
		@Pc(16) Interface22 local16 = (Interface22) Static556.method7726(arg4, arg5, arg0);
		@Pc(25) Class192 local25;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (local16 != null) {
			local25 = Static85.aClass27_1.method516(local16.method7171());
			local33 = local16.method7175() & 0x3;
			local37 = local16.method7176();
			if (local25.anInt5573 == -1) {
				local54 = arg3;
				if (local25.anInt5582 > 0) {
					local54 = arg1;
				}
				if (local37 == 0 || local37 == 2) {
					if (local33 == 0) {
						arg7.method7495(arg2, local54, 4, arg6);
					} else if (local33 == 1) {
						arg7.method7463(arg2, 4, arg6, local54);
					} else if (local33 == 2) {
						arg7.method7495(arg2, local54, 4, arg6 + 3);
					} else if (local33 == 3) {
						arg7.method7463(arg2 + 3, 4, arg6, local54);
					}
				}
				if (local37 == 3) {
					if (local33 == 0) {
						arg7.method7482(arg2, local54, 1, 1, arg6);
					} else if (local33 == 1) {
						arg7.method7482(arg2, local54, 1, 1, arg6 + 3);
					} else if (local33 == 2) {
						arg7.method7482(arg2 + 3, local54, 1, 1, arg6 + 3);
					} else if (local33 == 3) {
						arg7.method7482(arg2 + 3, local54, 1, 1, arg6);
					}
				}
				if (local37 == 2) {
					if (local33 == 0) {
						arg7.method7463(arg2, 4, arg6, local54);
					} else if (local33 == 1) {
						arg7.method7495(arg2, local54, 4, arg6 + 3);
					} else if (local33 == 2) {
						arg7.method7463(arg2 + 3, 4, arg6, local54);
					} else if (local33 == 3) {
						arg7.method7495(arg2, local54, 4, arg6);
					}
				}
			} else {
				Static291.method4406(arg7, arg6, arg2, local33, local25);
			}
		}
		local16 = (Interface22) Static406.method5850(arg4, arg5, arg0, uq.class);
		if (local16 != null) {
			local25 = Static85.aClass27_1.method516(local16.method7171());
			local33 = local16.method7175() & 0x3;
			local37 = local16.method7176();
			if (local25.anInt5573 != -1) {
				Static291.method4406(arg7, arg6, arg2, local33, local25);
			} else if (local37 == 9) {
				local54 = -1118482;
				if (local25.anInt5582 > 0) {
					local54 = -1179648;
				}
				if (local33 == 0 || local33 == 2) {
					arg7.method7481(arg6 + 3, local54, arg6, arg2 + 3, arg2);
				} else {
					arg7.method7481(arg6 + 3, local54, arg6, arg2, arg2 + 3);
				}
			}
		}
		local16 = (Interface22) Static361.method5373(arg4, arg5, arg0);
		if (local16 == null) {
			return;
		}
		local25 = Static85.aClass27_1.method516(local16.method7171());
		local33 = local16.method7175() & 0x3;
		if (local25.anInt5573 != -1) {
			Static291.method4406(arg7, arg6, arg2, local33, local25);
			return;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZII)V")
	public static void method1117(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub46 local8 = Static378.method5549(arg0, arg1);
		if (local8 != null) {
			local8.method7948();
		}
	}
}
