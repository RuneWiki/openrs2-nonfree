import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
	public static int anInt6812;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
	public static void method5396() {
		Static59.method835();
		Static464.method5361(Static126.aClass19_Sub1_1.aBoolean380);
		Static114.aClass101_1 = Static154.method1924(Static259.aClass177_2, 22050, Static91.aCanvas2, 0);
		Static114.aClass101_1.method4846(Static170.aClass1_Sub9_Sub3_1);
		Static457.aClass101_2 = Static154.method1924(Static259.aClass177_2, 2048, Static91.aCanvas2, 1);
		Static457.aClass101_2.method4846(Static123.aClass1_Sub9_Sub1_1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!eq;")
	public static Class11_Sub1 method5398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class259 local14 = local7.aClass259_1; local14 != null; local14 = local14.aClass259_4) {
			@Pc(18) Class11_Sub1 local18 = local14.aClass11_Sub1_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort103 == arg1 && local18.aShort101 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Lclient!bd;")
	public static Class1_Sub3_Sub1 method5400() {
		@Pc(13) Class1_Sub3_Sub1 local13 = (Class1_Sub3_Sub1) Static190.aClass163_4.method3658();
		if (local13 != null) {
			local13.method5953();
			local13.method5941();
			return local13;
		}
		do {
			local13 = (Class1_Sub3_Sub1) Static156.aClass163_3.method3658();
			if (local13 == null) {
				return null;
			}
			if (local13.method386() > Static183.method2674()) {
				return null;
			}
			local13.method5953();
			local13.method5941();
		} while ((Long.MIN_VALUE & local13.aLong235) == 0L);
		return local13;
	}
}
