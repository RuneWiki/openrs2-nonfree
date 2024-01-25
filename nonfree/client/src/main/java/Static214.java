import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!wo;")
	public static Class216 aClass216_73;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method4111() {
		Static172.aClass62_1.method3920();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static256.aLongArray8[local15] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static199.aLongArray6[local27] = 0L;
		}
		Static3.anInt79 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public static void method4112() {
		Static133.aClass87_27.method2477();
		Static237.aClass87_41.method2477();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)I")
	public static int method4113(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
