import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
	public static int anInt10068;

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
	public static int anInt10073 = 0;

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
	public static int anInt10077 = 0;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)V")
	public static void method8510() {
		@Pc(1) Class10 local1 = Static569.aClass10_54;
		synchronized (Static569.aClass10_54) {
			Static569.aClass10_54.method369(5);
		}
		local1 = Static121.aClass10_7;
		synchronized (Static121.aClass10_7) {
			Static121.aClass10_7.method369(5);
		}
	}
}
