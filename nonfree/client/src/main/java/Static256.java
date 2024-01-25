import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!iw", name = "q", descriptor = "[Lclient!jha;")
	public static Class67_Sub1[] aClass67_Sub1Array2;

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
	public static void method4521() {
		Static275.aClass268_3 = new Class268(8);
		Static579.anInt9861 = 0;
		for (@Pc(17) Class9_Sub5 local17 = (Class9_Sub5) Static470.aClass234_11.method6092(); local17 != null; local17 = (Class9_Sub5) Static470.aClass234_11.method6098()) {
			local17.method5235();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BII)Z")
	public static boolean method4522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static141.method2792(arg0, arg1) || Static487.method7138(arg0, arg1);
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	public static void method4523() {
		if (!Static479.method7089()) {
			return;
		}
		if (Static363.aStringArray36 == null) {
			Static466.method6960();
		}
		Static182.aBoolean328 = true;
		Static234.anInt5224 = 0;
	}
}
