import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public static int anInt5375;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	public static int anInt5377;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ae;B)V")
	public static void method4481(@OriginalArg(0) Class6_Sub1 arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static63.anInt1715; local13++) {
			@Pc(19) int local19 = arg0.method6445();
			@Pc(23) int local23 = arg0.method6485();
			if (local23 == 65535) {
				local23 = -1;
			}
			if (Static175.aClass152_Sub1Array3[local19] != null) {
				Static175.aClass152_Sub1Array3[local19].anInt5622 = local23;
			}
		}
	}
}
