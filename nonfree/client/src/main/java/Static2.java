import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)I")
	public static int method21() {
		@Pc(5) Class352 local5 = Static511.aClass352_58;
		synchronized (Static511.aClass352_58) {
			return Static511.aClass352_58.method7660();
		}
	}
}
