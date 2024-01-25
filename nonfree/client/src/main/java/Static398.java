import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method6413() {
		Static400.anInt7816 = -1;
		Static377.anInt7322 = 1;
		if (Static148.aString35 == null) {
			Static395.method3918(35);
		} else {
			@Pc(28) Class3_Sub7 local28 = new Class3_Sub7(Static491.method6667(Static208.method3661(Static148.aString35)));
			@Pc(32) long local32 = local28.method6519();
			Static490.aLong226 = local28.method6519();
			Static573.method8191(true, Static482.method7394(local32), "");
		}
	}
}
