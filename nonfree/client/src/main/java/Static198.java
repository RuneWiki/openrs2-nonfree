import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Lclient!sd;")
	public static Class208 aClass208_113;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	public static int anInt4108;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_114 = new Class208(49, 3);

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	public static int anInt4111 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ve;I)V")
	public static void method3600(@OriginalArg(0) Class2_Sub24_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static70.anInt1556; local7++) {
			@Pc(13) int local13 = Static374.anIntArray578[local7];
			@Pc(17) Class1_Sub2_Sub1_Sub1 local17 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local13];
			@Pc(21) int local21 = arg0.method5732();
			if ((local21 & 0x4) != 0) {
				local21 += arg0.method5732() << 8;
			}
			Static227.method4130(local21, arg0, local13, local17);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3601(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static77.method1332(Static335.aClass183_98);
			Static76.aClass2_Sub24_Sub2_7.method5746(Static305.method6026(arg0));
			Static76.aClass2_Sub24_Sub2_7.method5772(arg0);
		}
	}
}
