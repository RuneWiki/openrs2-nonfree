import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!vea", name = "q", descriptor = "I")
	public static int anInt9711;

	@OriginalMember(owner = "client!vea", name = "r", descriptor = "Z")
	public static boolean aBoolean736 = false;

	@OriginalMember(owner = "client!vea", name = "t", descriptor = "[I")
	public static final int[] anIntArray612 = new int[32];

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "(I)V")
	public static void method8246() {
		for (@Pc(10) Class3_Sub40 local10 = (Class3_Sub40) Static580.aClass25_45.method435(); local10 != null; local10 = (Class3_Sub40) Static580.aClass25_45.method432()) {
			if (local10.aBoolean534) {
				local10.aBoolean534 = false;
			} else {
				Static558.method7939(local10.anInt7435);
			}
		}
	}
}
