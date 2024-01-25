import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
	public static int anInt4335;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "[Lclient!lq;")
	public static Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
	public static int anInt4343 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)V")
	public static void method3604(@OriginalArg(0) int arg0) {
		Static165.method3058();
		@Pc(16) int local16 = Static18.aClass244_1.method6259(arg0).anInt2980;
		if (local16 == 0) {
			return;
		}
		@Pc(27) int local27 = Static438.aClass198_1.anIntArray386[arg0];
		if (local16 == 5) {
			Static163.anInt3666 = local27;
		}
		if (local16 == 6) {
			Static21.anInt690 = local27;
		}
	}
}
