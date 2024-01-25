import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static279 {

	@OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
	public static int anInt5105;

	@OriginalMember(owner = "client!oi", name = "W", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
	public static int anInt5101 = 0;

	@OriginalMember(owner = "client!oi", name = "N", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_65 = new Class44(65, 1);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLclient!ge;Lclient!ge;)V")
	public static void method4127(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg1.aClass2_Sub2_57 != null) {
			arg1.method5934();
		}
		arg1.aClass2_Sub2_58 = arg0.aClass2_Sub2_58;
		arg1.aClass2_Sub2_57 = arg0;
		arg1.aClass2_Sub2_57.aClass2_Sub2_58 = arg1;
		arg1.aClass2_Sub2_58.aClass2_Sub2_57 = arg1;
	}
}
