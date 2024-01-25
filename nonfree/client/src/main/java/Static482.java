import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!qda", name = "j", descriptor = "Lclient!eca;")
	public static Class84 aClass84_2;

	@OriginalMember(owner = "client!qda", name = "g", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_122 = new Class216(31, -1);

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
	public static int anInt7595 = 0;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V")
	public static void method6603() {
		for (@Pc(7) int local7 = 0; local7 < Static105.anInt2131; local7++) {
			@Pc(13) int local13 = Static526.anIntArray558[local7];
			@Pc(20) Class4_Sub45 local20 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local13);
			if (local20 != null) {
				@Pc(25) Class3_Sub1_Sub2_Sub2_Sub2 local25 = local20.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				Static519.method7022(local25, local25.aClass345_1.anInt8812);
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
	public static void method6606() {
		Static44.anInt898 = Static641.aClass31_10.anInt1095 + Static641.aClass31_10.anInt1098 + 2;
		Static548.anInt8426 = Static636.aClass31_14.anInt1095 + Static636.aClass31_14.anInt1098 + 2;
		Static489.aStringArray40 = new String[500];
		for (@Pc(30) int local30 = 0; local30 < Static489.aStringArray40.length; local30++) {
			Static489.aStringArray40[local30] = "";
		}
		Static383.method8457(Static279.aClass179_1.method4066(Static164.anInt2984));
	}
}
