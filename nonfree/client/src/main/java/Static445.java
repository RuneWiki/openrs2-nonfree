import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)V")
	public static void method7195(@OriginalArg(0) int arg0) {
		Static672.anInt11434 = arg0;
		@Pc(11) Class22 local11 = Static522.aClass22_48;
		synchronized (Static522.aClass22_48) {
			Static522.aClass22_48.method461();
		}
		local11 = Static68.aClass22_7;
		synchronized (Static68.aClass22_7) {
			Static68.aClass22_7.method461();
		}
	}
}
