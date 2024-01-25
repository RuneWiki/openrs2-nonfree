import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
	public static int anInt8804;

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
	public static void method7792() {
		@Pc(20) Class2_Sub33 local20 = Static592.method8154(Static517.aClass349_122, Static487.aClass221_2.aClass48_1);
		local20.aClass2_Sub20_Sub2_1.method8577(Static84.anInt1420);
		Static487.aClass221_2.method5173(local20);
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)V")
	public static void method7794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static72.anInt1263 = arg1;
		Static482.anInt7726 = arg0;
		if (Static240.anInt10701 == 0) {
			Static501.anInt5842 = Static482.anInt7726 + Static511.anInt8135 * 2;
			Static23.anInt6817 = Static72.anInt1263 + Static581.anInt9169 * 2;
		} else if (Static240.anInt10701 == 1) {
			Static331.anInt5059 = Static72.anInt1263 / Static136.anInt2255 + Static11.anInt182 + 2;
			Static59.anInt1029 = Static523.anInt6606 + Static482.anInt7726 / Static405.anInt6687 + 2;
			Static23.anInt6817 = Static331.anInt5059 * Static136.anInt2255;
			Static501.anInt5842 = Static405.anInt6687 * Static59.anInt1029;
			Static511.anInt8135 = Static501.anInt5842 - Static482.anInt7726 >> 1;
			Static581.anInt9169 = Static23.anInt6817 - Static72.anInt1263 >> 1;
		} else if (Static240.anInt10701 == 2) {
			Static23.anInt6817 = Static72.anInt1263;
			Static501.anInt5842 = Static482.anInt7726;
		}
	}
}
