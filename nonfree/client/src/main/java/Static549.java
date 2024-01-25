import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
	public static int anInt9105;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BLclient!ee;)Lclient!rw;")
	public static Class129 method7770(@OriginalArg(1) Class5_Sub12 arg0) {
		@Pc(12) int local12 = arg0.method8631();
		@Pc(19) Class204 local19 = Static194.method3068()[arg0.method8645()];
		@Pc(28) Class288 local28 = Static609.method8474()[arg0.method8645()];
		@Pc(32) int local32 = arg0.method8595();
		@Pc(36) int local36 = arg0.method8595();
		return new Class129(local12, local19, local28, local32, local36);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BLclient!vfa;)V")
	public static void method7772(@OriginalArg(1) Class357 arg0) {
		if (arg0.anInt9828 == 5 && arg0.anInt9871 != -1) {
			Static136.method8517(arg0, Static485.aClass126_17);
		}
	}
}
