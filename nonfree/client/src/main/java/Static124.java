import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	public static int anInt2958;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "Lclient!lm;")
	public static final Class124 aClass124_4 = new Class124(128);

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	public static int anInt2956 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!hl;)V")
	public static void method2574(@OriginalArg(1) Class8_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class8_Sub1_Sub2_Sub2) {
			@Pc(22) Class8_Sub1_Sub2_Sub2 local22 = (Class8_Sub1_Sub2_Sub2) arg0;
			if (local22.aClass141_1 != null) {
				Static93.method2210(local22);
			}
		} else if (arg0 instanceof Class8_Sub1_Sub2_Sub1) {
			Static201.method3773((Class8_Sub1_Sub2_Sub1) arg0);
		}
	}
}
