import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_21 = new Class237(14, 4);

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Z")
	public static boolean aBoolean509 = false;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	public static int anInt7402 = 0;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public static void method6005() {
		for (@Pc(8) Class1_Sub3 local8 = (Class1_Sub3) Static55.aClass181_63.method4112(); local8 != null; local8 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
			if (Static149.method5332(local8.anInt117)) {
				Static269.method3956(local8);
			}
		}
		if (Static217.anInt4004 == 1) {
			Static310.method4414();
			return;
		}
		Static17.method466(Static315.anInt5432, Static270.anInt4802, Static280.anInt4913, Static389.anInt6274);
		@Pc(52) int local52 = Static3.aClass151_6.method3475(Static39.aClass7_17.method331(Static341.anInt5770));
		for (@Pc(57) Class1_Sub3 local57 = (Class1_Sub3) Static55.aClass181_63.method4112(); local57 != null; local57 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
			@Pc(62) int local62 = Static77.method1517(local57);
			if (local52 < local62) {
				local52 = local62;
			}
		}
		Static270.anInt4802 = local52 + 8;
		Static389.anInt6274 = (Static297.aBoolean374 ? 26 : 22) + Static217.anInt4004 * 16;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Z")
	public static boolean method6006(@OriginalArg(1) int arg0) {
		Static16.anInt474 = arg0 + 1 & 0xFFFF;
		Static193.aBoolean209 = true;
		return true;
	}
}
