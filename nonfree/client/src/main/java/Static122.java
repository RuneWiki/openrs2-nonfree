import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "S")
	public static short aShort23 = 256;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!ib;B)Ljava/lang/String;")
	public static String method1708(@OriginalArg(0) Class5_Sub23 arg0) {
		return Static454.method6684(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public static void method1709() {
		if (Static622.anInt10186 < 0) {
			Static652.anInt10539 = -1;
			Static436.anInt7489 = -1;
			Static622.anInt10186 = 0;
		}
		if (Static629.anInt9767 < Static622.anInt10186) {
			Static436.anInt7489 = -1;
			Static622.anInt10186 = Static629.anInt9767;
			Static652.anInt10539 = -1;
		}
		if (Static448.anInt7716 < 0) {
			Static652.anInt10539 = -1;
			Static436.anInt7489 = -1;
			Static448.anInt7716 = 0;
		}
		if (Static448.anInt7716 > Static629.anInt9766) {
			Static652.anInt10539 = -1;
			Static436.anInt7489 = -1;
			Static448.anInt7716 = Static629.anInt9766;
		}
	}
}
