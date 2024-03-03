import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt3742;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 4)
	public static void method3700() {
		if (!Class2_Sub2_Sub10_Sub2.aBoolean419) {
			return;
		}
		@Pc(11) Class161 local11 = method3706(Static314.anInt6305, InputStream_Sub1.anInt3788);
		if (local11 != null && local11.anObjectArray32 != null) {
			@Pc(20) Class2_Sub13 local20 = new Class2_Sub13();
			local20.aClass161_3 = local11;
			local20.anObjectArray4 = local11.anObjectArray32;
			Static185.method3592(local20);
		}
		Class2_Sub2_Sub10_Sub2.aBoolean419 = false;
		Class77.anInt2216 = -1;
		Class119.anInt3313 = -1;
		if (local11 != null) {
			Static187.method3646(local11);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/lang/String;)V", line = 45)
	public static void method3701(@OriginalArg(1) String arg0) {
		Static32.method4201("", 0, arg0, 0, "");
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!nk;B)Lclient!nk;", line = 86)
	public static Class161 method3704(@OriginalArg(0) Class161 arg0) {
		@Pc(11) Class161 local11 = Static42.method1415(arg0);
		if (local11 == null) {
			local11 = arg0.aClass161_12;
		}
		return local11;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)[Lclient!oj;", line = 102)
	public static Class170[] method3705() {
		return new Class170[] { Class2_Sub3_Sub18.aClass170_3, Class2_Sub3_Sub34.aClass170_4, Class9.aClass170_1 };
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Lclient!nk;", line = 113)
	public static Class161 method3706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class161 local7 = Static6.method140(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass161Array2 == null || arg1 >= local7.aClass161Array2.length) {
			return null;
		} else {
			return local7.aClass161Array2[arg1];
		}
	}
}
