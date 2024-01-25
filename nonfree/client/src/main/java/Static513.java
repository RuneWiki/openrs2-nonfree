import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
	public static final int anInt9220 = 4;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)V")
	public static void method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 9);
		local8.method7133();
		local8.anInt8738 = arg2;
		local8.anInt8736 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V")
	public static void method7506() {
		if (Static534.aBoolean671) {
			return;
		}
		if (Static214.aClass4_Sub19_Sub1_1.aBoolean255) {
			Static213.aFloat141 = (int) Static213.aFloat141 + 47 & 0xFFFFFFF0;
		} else {
			Static436.aFloat210 += (12.0F - Static436.aFloat210) / 2.0F;
		}
		Static65.aBoolean51 = true;
		Static534.aBoolean671 = true;
	}
}
