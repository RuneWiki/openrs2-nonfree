import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	public static int anInt4065;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIB)V")
	public static void method3305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) String local39 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local39);
		Static120.method2685(true, false, local39);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method3306() {
		Static510.aClass3Array1 = null;
	}
}
