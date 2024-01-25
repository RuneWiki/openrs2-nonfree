import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!fp;")
	public static final Class91 aClass91_31 = new Class91(0);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V")
	public static void method7494() {
		Static444.method6416(Static305.aClass186_85);
		for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) Static484.aClass174_32.method4421(); local15 != null; local15 = (Class1_Sub5) Static484.aClass174_32.method4429()) {
			if (!local15.method7979()) {
				local15 = (Class1_Sub5) Static484.aClass174_32.method4421();
				if (local15 == null) {
					break;
				}
			}
			if (local15.anInt1387 == 0) {
				Static82.method2049(true, local15, true);
			}
		}
		if (Static531.aClass309_14 != null) {
			Static291.method4908(Static531.aClass309_14);
			Static531.aClass309_14 = null;
		}
	}
}
