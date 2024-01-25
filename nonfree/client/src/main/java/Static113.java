import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!pda;")
	public static Class51 aClass51_3;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!as;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	public static int anInt2402 = 0;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)V")
	public static void method2018() {
		if (Static25.aClass39_4 != null) {
			Static25.aClass39_4.method4891();
		}
		if (Static16.aClass39_1 != null) {
			Static16.aClass39_1.method4891();
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZI)Z")
	public static boolean method2019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)I")
	public static int method2020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static250.method4183(arg1 - 1, arg0 - 1) + Static250.method4183(arg1 - 1, arg0 + 1) + Static250.method4183(arg1 + 1, arg0 + -1) + Static250.method4183(arg1 + 1, arg0 + 1);
		@Pc(70) int local70 = Static250.method4183(arg1, arg0 - 1) + Static250.method4183(arg1, arg0 + 1) + Static250.method4183(arg1 + -1, arg0) + Static250.method4183(arg1 + 1, arg0);
		@Pc(75) int local75 = Static250.method4183(arg1, arg0);
		return local75 / 4 + local70 / 8 + local41 / 16;
	}
}
