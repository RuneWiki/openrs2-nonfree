import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "Lclient!iu;")
	public static Class111 aClass111_4;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 309)
	public static void method5695() {
		if (Static177.aClass19_8 == null) {
			return;
		}
		Class2_Sub4.aClass36_6.method1418();
		Static233.method4367();
		Static228.method4300();
		Static177.method3503();
		Static316.method5760();
		Static363.method4491();
		if (Static343.aClass43_1 != null) {
			Static343.aClass43_1.method1620();
		}
		Static367.method6462();
		Static197.method3722();
		Static146.method2792();
		Static224.method4193(false);
		Static63.method1774();
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class11_Sub5_Sub2_Sub1 local47 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local41];
			if (local47 != null) {
				local47.aClass2_Sub6_3 = null;
				for (@Pc(54) int local54 = 0; local54 < local47.aClass31Array3.length; local54++) {
					local47.aClass31Array3[local54] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1.length; local73++) {
			@Pc(79) Class11_Sub5_Sub2_Sub2 local79 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < local79.aClass31Array3.length; local83++) {
					local79.aClass31Array3[local83] = null;
				}
			}
		}
		Static177.aClass19_8.method2827();
		Static177.aClass19_8 = null;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)Lclient!oj;", line = 440)
	public static Class170 method5696(@OriginalArg(1) int arg0) {
		@Pc(13) Class170[] local13 = Static193.method3705();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class170 local21 = local13[local15];
			if (local21.anInt4681 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
