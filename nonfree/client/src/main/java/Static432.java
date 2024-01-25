import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
	public static int anInt5804;

	@OriginalMember(owner = "client!qm", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString62 = null;

	@OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
	public static int anInt5801 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!pca;I)V")
	public static void method4773(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0) {
		for (@Pc(12) Class3_Sub37 local12 = (Class3_Sub37) Static22.aClass183_1.method4795(); local12 != null; local12 = (Class3_Sub37) Static22.aClass183_1.method4793()) {
			if (local12.aClass2_Sub2_Sub1_Sub2_1 == arg0) {
				if (local12.aClass3_Sub14_Sub2_4 != null) {
					Static485.aClass3_Sub14_Sub1_2.method2816(local12.aClass3_Sub14_Sub2_4);
					local12.aClass3_Sub14_Sub2_4 = null;
				}
				local12.method8412();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIII)V")
	public static void method4774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local40);
		Static150.method2949(local40, true, false);
	}
}
