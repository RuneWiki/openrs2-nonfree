import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
	public static int anInt4685 = 0;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "Lclient!bfa;")
	public static final Class30 aClass30_3 = new Class30();

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!vj;B)V")
	public static void method3982(@OriginalArg(0) Class2_Sub22 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static620.anInt9962; local7++) {
			@Pc(15) int local15 = arg0.method8543();
			@Pc(21) int local21 = arg0.method8546();
			if (local21 == 65535) {
				local21 = -1;
			}
			if (Static363.aClass89_Sub1Array4[local15] != null) {
				Static363.aClass89_Sub1Array4[local15].anInt2234 = local21;
			}
		}
	}
}
