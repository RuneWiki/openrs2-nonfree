import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!n", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray79;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array19;

	@OriginalMember(owner = "client!n", name = "I", descriptor = "[Lclient!un;")
	public static final Class1_Sub6_Sub15[] aClass1_Sub6_Sub15Array7 = new Class1_Sub6_Sub15[14];

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)I")
	public static int method4900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!sk;)V")
	public static void method4901(@OriginalArg(1) Class25_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class25_Sub1_Sub1_Sub2) {
			@Pc(30) Class25_Sub1_Sub1_Sub2 local30 = (Class25_Sub1_Sub1_Sub2) arg0;
			if (local30.aClass59_1 != null) {
				Static123.method4614(local30, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 != local30.aByte70);
			}
		} else if (arg0 instanceof Class25_Sub1_Sub1_Sub1) {
			@Pc(8) Class25_Sub1_Sub1_Sub1 local8 = (Class25_Sub1_Sub1_Sub1) arg0;
			Static359.method5476(local8, local8.aByte70 != Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70);
		}
	}
}
