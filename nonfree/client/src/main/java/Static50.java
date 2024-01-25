import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bi", name = "od", descriptor = "I")
	public static int anInt814;

	@OriginalMember(owner = "client!bi", name = "xd", descriptor = "I")
	public static int anInt823;

	@OriginalMember(owner = "client!bi", name = "Lc", descriptor = "Lclient!nca;")
	public static Class254 aClass254_29;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	public static void method740() {
		if (Static396.aClass145_6.method9648()) {
			Static396.aClass145_6.method9640(Static316.aCanvas1);
			Static142.method4100();
			if (Static392.aBoolean549) {
				Static438.method6361(Static316.aCanvas1);
			} else {
				@Pc(16) Dimension local16 = Static316.aCanvas1.getSize();
				Static396.aClass145_6.method9631(Static316.aCanvas1, local16.width, local16.height);
			}
			Static396.aClass145_6.method9689(Static316.aCanvas1);
		} else {
			Static213.method2982(false, Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863());
		}
		Static668.method9110(-88);
		Static415.aBoolean615 = true;
	}
}
