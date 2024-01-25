import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_48 = new Class179(54, 7);

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public static int anInt4004 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method3374() {
		Static80.aClass134_13.method3272();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ah;B)I")
	public static int method3375(@OriginalArg(0) Class1_Sub5_Sub1 arg0) {
		@Pc(18) int local18 = arg0.method316(2);
		@Pc(30) int local30;
		if (local18 == 0) {
			local30 = 0;
		} else if (local18 == 1) {
			local30 = arg0.method316(5);
		} else if (local18 == 2) {
			local30 = arg0.method316(8);
		} else {
			local30 = arg0.method316(11);
		}
		return local30;
	}
}
