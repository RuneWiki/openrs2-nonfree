import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
	public static int anInt3755 = 0;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[5];

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean276 = true;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Z")
	public static boolean aBoolean277 = false;

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
	public static int anInt3762 = 0;

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	public static void method2957() {
		for (@Pc(15) Class4_Sub51 local15 = (Class4_Sub51) Static322.aClass22_43.method895(); local15 != null; local15 = (Class4_Sub51) Static322.aClass22_43.method889()) {
			if (local15.anInt10470 > 0) {
				local15.anInt10470--;
			}
			if (local15.anInt10470 != 0) {
				if (local15.anInt10466 > 0) {
					local15.anInt10466--;
				}
				if (local15.anInt10466 == 0 && local15.anInt10463 >= 1 && local15.anInt10474 >= 1 && Static338.anInt6508 - 2 >= local15.anInt10463 && Static390.anInt7654 - 2 >= local15.anInt10474 && (local15.anInt10465 < 0 || Static383.method5933(local15.anInt10472, local15.anInt10465))) {
					Static235.method3838(local15.anInt10472, local15.anInt10463, local15.anInt10465, local15.anInt10469, local15.anInt10464, local15.anInt10473, local15.anInt10474, -1);
					local15.anInt10466 = -1;
					if (local15.anInt10465 == local15.anInt10468 && local15.anInt10468 == -1) {
						local15.method8193();
					} else if (local15.anInt10468 == local15.anInt10465 && local15.anInt10462 == local15.anInt10473 && local15.anInt10467 == local15.anInt10472) {
						local15.method8193();
					}
				}
			} else if (local15.anInt10468 < 0 || Static383.method5933(local15.anInt10467, local15.anInt10468)) {
				Static235.method3838(local15.anInt10467, local15.anInt10463, local15.anInt10468, local15.anInt10469, local15.anInt10464, local15.anInt10462, local15.anInt10474, -1);
				local15.method8193();
			}
		}
	}
}
