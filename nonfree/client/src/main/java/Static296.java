import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static296 {

	@OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
	public static int anInt5188;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "Lclient!ew;")
	public static final Class98 aClass98_24 = new Class98("", 16);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZZ)V")
	public static void method4645(@OriginalArg(0) boolean arg0) {
		if (Static299.aClass347_1 == null) {
			Static633.method8957();
		}
		if (arg0) {
			Static299.aClass347_1.method8230();
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!fu;BLclient!fu;)V")
	public static void method4647(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg0.aClass4_67 != null) {
			arg0.method8713();
		}
		arg0.aClass4_67 = arg1.aClass4_67;
		arg0.aClass4_68 = arg1;
		arg0.aClass4_67.aClass4_68 = arg0;
		arg0.aClass4_68.aClass4_67 = arg0;
	}
}
