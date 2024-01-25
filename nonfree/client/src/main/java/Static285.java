import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "[Lclient!hu;")
	public static Class44[] aClass44Array9;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method4274(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static80.method1257(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBIII)V")
	public static void method4275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg3, 4);
		local8.method4140();
		local8.anInt4504 = arg2;
		local8.anInt4507 = arg0;
		local8.anInt4508 = arg1;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIILclient!jg;)V")
	public static void method4276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14_Sub1_Sub4 arg4) {
		@Pc(4) Class156 local4 = Static503.method3567(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9317 = (arg1 << Static162.anInt2830) + Static617.anInt10032;
		arg4.anInt9321 = arg3;
		arg4.anInt9315 = (arg2 << Static162.anInt2830) + Static617.anInt10032;
		local4.aClass14_Sub1_Sub4_1 = arg4;
		@Pc(33) int local33 = Static299.aClass40Array1 == Static327.aClass40Array2 ? 1 : 0;
		if (arg4.method7998()) {
			if (arg4.method7987()) {
				arg4.aClass14_Sub1_22 = Static151.aClass14_Sub1Array1[local33];
				Static151.aClass14_Sub1Array1[local33] = arg4;
				return;
			}
			arg4.aClass14_Sub1_22 = Static250.aClass14_Sub1Array2[local33];
			Static250.aClass14_Sub1Array2[local33] = arg4;
			Static367.aBoolean541 = true;
			return;
		}
		arg4.aClass14_Sub1_22 = Static469.aClass14_Sub1Array5[local33];
		Static469.aClass14_Sub1Array5[local33] = arg4;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZIILclient!og;I)Z")
	public static boolean method4277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub1_Sub3 arg2, @OriginalArg(4) int arg3) {
		if (!Static592.aBoolean843 || !Static157.aBoolean242) {
			return false;
		} else if (Static525.anInt8753 < 100) {
			return false;
		} else if (Static422.method6374(arg0, arg3, arg1)) {
			@Pc(33) int local33 = arg3 << Static162.anInt2830;
			@Pc(37) int local37 = arg1 << Static162.anInt2830;
			@Pc(47) int local47 = Static299.aClass40Array1[arg0].method8442(arg3, arg1) - 1;
			@Pc(54) int local54 = local47 + arg2.method8004();
			if (arg2.aShort115 == 1) {
				if (!Static275.method7486(local33, local33, local47, local33, local54, Static407.anInt7012 + local37, local54, local37, local37)) {
					return false;
				} else if (Static275.method7486(local33, local33, local47, local33, local47, Static407.anInt7012 + local37, local54, Static407.anInt7012 + local37, local37)) {
					Static434.anInt7350++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort115 == 2) {
				if (!Static275.method7486(local33, local33 + Static407.anInt7012, local47, local33, local54, Static407.anInt7012 + local37, local54, Static407.anInt7012 + local37, Static407.anInt7012 + local37)) {
					return false;
				} else if (Static275.method7486(local33, local33 + Static407.anInt7012, local47, Static407.anInt7012 + local33, local54, Static407.anInt7012 + local37, local47, local37 + Static407.anInt7012, local37 + Static407.anInt7012)) {
					Static434.anInt7350++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort115 == 4) {
				if (!Static275.method7486(Static407.anInt7012 + local33, Static407.anInt7012 + local33, local47, local33 + Static407.anInt7012, local54, local37 + Static407.anInt7012, local54, local37, local37)) {
					return false;
				} else if (Static275.method7486(local33 + Static407.anInt7012, Static407.anInt7012 + local33, local47, Static407.anInt7012 + local33, local47, Static407.anInt7012 + local37, local54, local37 + Static407.anInt7012, local37)) {
					Static434.anInt7350++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort115 == 8) {
				if (!Static275.method7486(local33, Static407.anInt7012 + local33, local47, local33, local54, local37, local54, local37, local37)) {
					return false;
				} else if (Static275.method7486(local33, local33 + Static407.anInt7012, local47, local33 + Static407.anInt7012, local54, local37, local47, local37, local37)) {
					Static434.anInt7350++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort115 == 16) {
				if (Static382.method8495(Static617.anInt10032, local54, local47, Static617.anInt10032 + local37, local33, Static617.anInt10032)) {
					Static434.anInt7350++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort115 == 32) {
				if (Static382.method8495(Static617.anInt10032, local54, local47, local37 + Static617.anInt10032, local33 + Static617.anInt10032, Static617.anInt10032)) {
					Static434.anInt7350++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort115 == 64) {
				if (Static382.method8495(Static617.anInt10032, local54, local47, local37, Static617.anInt10032 + local33, Static617.anInt10032)) {
					Static434.anInt7350++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort115 != 128) {
				return true;
			} else if (Static382.method8495(Static617.anInt10032, local54, local47, local37, local33, Static617.anInt10032)) {
				Static434.anInt7350++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
