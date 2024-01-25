import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!sr", name = "Rc", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!sr", name = "Sc", descriptor = "I")
	public static int anInt6085;

	@OriginalMember(owner = "client!sr", name = "Vc", descriptor = "I")
	public static int anInt6088;

	@OriginalMember(owner = "client!sr", name = "Tc", descriptor = "I")
	public static int anInt6086 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLclient!la;Ljava/lang/String;Z)V")
	public static void method4823(@OriginalArg(1) Class63 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(21) int local21 = Static112.aClass57_6.method1390(250, null, arg1);
		@Pc(30) int local30 = Static112.aClass57_6.method1393(250, null, arg1) * 13;
		Static269.aClass51_9.O(6, 6, local21 + 8, local30 + 4 + 4, -16777216, 0);
		Static269.aClass51_9.method5287(6, 6, local21 + 4 + 4, local30 + 4 + 4, -1, 0);
		arg0.method4587(null, -1, 0, local30, 1, -1, 0, 10, null, local21, null, 10, arg1);
		Static136.method2147(local30 + 8, 6, local21 + 4 + 4, 6);
		if (arg2) {
			Static269.aClass51_9.method5353();
		}
	}
}
