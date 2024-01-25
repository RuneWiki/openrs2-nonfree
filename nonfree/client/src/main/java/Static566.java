import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
	public static int anInt9474;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "Z")
	public static boolean aBoolean664 = false;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	public static int anInt9481 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)V")
	public static void method7759(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static487.anInt8139 != -1) {
				Static26.method400(Static487.anInt8139);
			}
			for (@Pc(19) Class6_Sub31 local19 = (Class6_Sub31) Static564.aClass212_39.method5099(); local19 != null; local19 = (Class6_Sub31) Static564.aClass212_39.method5103()) {
				if (!local19.method7848()) {
					local19 = (Class6_Sub31) Static564.aClass212_39.method5099();
					if (local19 == null) {
						break;
					}
				}
				Static160.method2336(true, false, local19);
			}
			Static487.anInt8139 = -1;
			Static564.aClass212_39 = new Class212(8);
			Static505.method6943();
			Static487.anInt8139 = Static379.anInt6551;
			Static59.method46(false);
			Static260.method3643();
			Static100.method1629(Static487.anInt8139);
		}
		Static466.aBoolean539 = true;
	}
}
