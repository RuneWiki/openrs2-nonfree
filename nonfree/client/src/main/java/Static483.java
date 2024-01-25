import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static483 {

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array16;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
	public static void method6629() {
		if (Static264.aBoolean359) {
			return;
		}
		Static282.aBoolean555 = true;
		if (Static544.aClass1_Sub22_Sub1_1.aBoolean389) {
			Static50.aFloat13 = (int) Static50.aFloat13 + 47 & 0xFFFFFFF0;
		} else {
			Static285.aFloat109 += (12.0F - Static285.aFloat109) / 2.0F;
		}
		Static264.aBoolean359 = true;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)Z")
	public static boolean method6631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
