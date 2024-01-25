import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static702 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_158 = new Class349(25, 4);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()V")
	public static void method9409() {
		for (@Pc(1) int local1 = 0; local1 < Static240.anInt10693; local1++) {
			@Pc(6) Class4_Sub2_Sub1 local6 = Static505.aClass4_Sub2_Sub1Array1[local1];
			Static678.method9188(local6, true);
			Static505.aClass4_Sub2_Sub1Array1[local1] = null;
		}
		Static240.anInt10693 = 0;
	}
}
