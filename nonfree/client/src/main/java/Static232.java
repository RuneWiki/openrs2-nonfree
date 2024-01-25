import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public static int anInt4266;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public static int anInt4268;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public static int anInt4267 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!lk;B)V")
	public static void method3810(@OriginalArg(0) Class2_Sub13 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static151.anInt2710; local3++) {
			@Pc(15) int local15 = arg0.method4211();
			@Pc(19) int local19 = arg0.method4245();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static22.aClass141_Sub1Array1[local15] != null) {
				Static22.aClass141_Sub1Array1[local15].anInt6662 = local19;
			}
		}
	}
}
