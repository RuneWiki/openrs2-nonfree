import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public static int anInt3833;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V", line = 16)
	public static void method3810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1008) {
			Static185.method3597(Class2_Sub3_Sub14.aClass16_3, arg0, arg2);
		} else if (arg1 == 1002) {
			Static185.method3597(Class133.aClass16_5, arg0, arg2);
		} else if (arg1 == 1012) {
			Static185.method3597(Class168.aClass16_6, arg0, arg2);
		} else if (arg1 == 1003) {
			Static185.method3597(Class2_Sub35.aClass16_8, arg0, arg2);
		} else if (arg1 == 1007) {
			Static185.method3597(Class2_Sub3_Sub13.aClass16_2, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Lclient!jg;", line = 229)
	public static Class2_Sub20 method3830() {
		if (Class216.aClass135_36 == null || Class84.aClass75_1 == null) {
			return null;
		}
		for (@Pc(16) Class2_Sub20 local16 = (Class2_Sub20) Class84.aClass75_1.method2180(); local16 != null; local16 = (Class2_Sub20) Class84.aClass75_1.method2180()) {
			@Pc(24) Class164 local24 = Static321.aClass125_4.method3380(local16.anInt2944);
			if (local24 != null && local24.aBoolean302 && local24.method4181(Static321.anInterface11_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 275)
	public static void method3842(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static85.method1962(Class11_Sub1_Sub1.aClass145_18);
			Class14.aClass2_Sub4_Sub2_4.method4843(Static26.method872(arg0));
			Class14.aClass2_Sub4_Sub2_4.method4823(arg0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[Lclient!nk;I)V", line = 410)
	public static void method3848(@OriginalArg(0) int arg0, @OriginalArg(1) Class161[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class161 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt4265 == 0) {
					if (local9.aClass161Array2 != null) {
						method3848(arg0, local9.aClass161Array2);
					}
					@Pc(30) Class2_Sub7 local30 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local9.anInt4310);
					if (local30 != null) {
						Static366.method6461(local30.anInt1368, arg0);
					}
				}
				@Pc(49) Class2_Sub13 local49;
				if (arg0 == 0 && local9.anObjectArray34 != null) {
					local49 = new Class2_Sub13();
					local49.aClass161_3 = local9;
					local49.anObjectArray4 = local9.anObjectArray34;
					Static185.method3592(local49);
				}
				if (arg0 == 1 && local9.anObjectArray11 != null) {
					if (local9.anInt4290 >= 0) {
						@Pc(75) Class161 local75 = Static6.method140(local9.anInt4310);
						if (local75 == null || local75.aClass161Array2 == null || local75.aClass161Array2.length <= local9.anInt4290 || local75.aClass161Array2[local9.anInt4290] != local9) {
							continue;
						}
					}
					local49 = new Class2_Sub13();
					local49.anObjectArray4 = local9.anObjectArray11;
					local49.aClass161_3 = local9;
					Static185.method3592(local49);
				}
			}
		}
	}
}
