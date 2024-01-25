import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!an", name = "s", descriptor = "I")
	public static int anInt722 = 0;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
	public static void method770() {
		for (@Pc(1) int local1 = 0; local1 < Static49.aClass392Array1.length; local1++) {
			Static49.aClass392Array1[local1].method8687();
		}
		Static49.aClass392Array1 = null;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
	public static void method771(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class3 local9 = Static382.aClass62_30.method1680(); local9 != null; local9 = Static382.aClass62_30.method1681()) {
			if ((long) arg0 == (local9.aLong309 >> 48 & 0xFFFFL)) {
				local9.method8770();
			}
		}
	}
}
