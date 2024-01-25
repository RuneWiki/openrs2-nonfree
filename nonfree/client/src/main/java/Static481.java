import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
	public static int anInt8098;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!qm;")
	public static Class276 aClass276_2;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!mw;Z)V")
	public static void method6522(@OriginalArg(0) Class8_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort132; local2 <= arg0.aShort133; local2++) {
			for (@Pc(6) int local6 = arg0.aShort131; local6 <= arg0.aShort130; local6++) {
				@Pc(16) Class39 local16 = Static292.aClass39ArrayArrayArray2[arg0.aByte123][local2][local6];
				if (local16 != null) {
					@Pc(21) Class111 local21 = local16.aClass111_1;
					@Pc(23) Class111 local23 = null;
					while (local21 != null) {
						if (local21.aClass8_Sub3_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass111_1 = local21.aClass111_2;
							} else {
								local23.aClass111_2 = local21.aClass111_2;
							}
							local21.method2191();
							break;
						}
						local23 = local21;
						local21 = local21.aClass111_2;
					}
				}
			}
		}
		if (!arg1) {
			Static395.method5455(arg0);
		}
	}
}
