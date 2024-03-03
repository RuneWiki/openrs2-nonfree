import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bt", name = "F", descriptor = "Lclient!r;")
	public static Class197 aClass197_67;

	@OriginalMember(owner = "client!bt", name = "xb", descriptor = "Lclient!ih;")
	public static Class103 aClass103_3;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!wm;)V", line = 227)
	public static void method4811(@OriginalArg(1) Class19 arg0) {
		if (Class179.aBoolean371) {
			Static110.method2369(arg0);
		} else {
			Static336.method6056(arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIIII)V", line = 402)
	public static void method4821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(14) int local14 = arg2 + arg5;
		for (@Pc(24) int local24 = arg5; local24 < local14; local24++) {
			Static94.method2165(arg3, Static332.anIntArrayArray58[local24], arg6, arg1);
		}
		@Pc(47) int local47 = arg3 - arg2;
		@Pc(51) int local51 = arg1 + arg2;
		for (@Pc(53) int local53 = arg0; local53 > local10; local53--) {
			Static94.method2165(arg3, Static332.anIntArrayArray58[local53], arg6, arg1);
		}
		for (@Pc(73) int local73 = local14; local73 <= local10; local73++) {
			@Pc(79) int[] local79 = Static332.anIntArrayArray58[local73];
			Static94.method2165(local51, local79, arg6, arg1);
			Static94.method2165(local47, local79, arg4, local51);
			Static94.method2165(arg3, local79, arg6, local47);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)V", line = 599)
	public static void method4829(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(26) String local26 = Static126.method2539(arg0);
		if (local26 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Class2_Sub43.anInt7165; local31++) {
			@Pc(37) String local37 = Class12_Sub1_Sub1.aStringArray43[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static126.method2539(local37);
			if (local37 != null && local37.equals(local26)) {
				Class2_Sub43.anInt7165--;
				for (@Pc(61) int local61 = local31; local61 < Class2_Sub43.anInt7165; local61++) {
					Class12_Sub1_Sub1.aStringArray43[local61] = Class12_Sub1_Sub1.aStringArray43[local61 + 1];
					Class214.aStringArray54[local61] = Class214.aStringArray54[local61 + 1];
					Class173_Sub2.anIntArray333[local61] = Class173_Sub2.anIntArray333[local61 + 1];
					Class147.aStringArray32[local61] = Class147.aStringArray32[local61 + 1];
					Class83.anIntArray148[local61] = Class83.anIntArray148[local61 + 1];
					Class37.aBooleanArray13[local61] = Class37.aBooleanArray13[local61 + 1];
				}
				Class11_Sub4.anInt3966 = Class65.anInt1874;
				Static85.method1962(Class2_Sub1.aClass145_3);
				Class14.aClass2_Sub4_Sub2_4.method4843(Static26.method872(arg0));
				Class14.aClass2_Sub4_Sub2_4.method4823(arg0);
				return;
			}
		}
	}
}
