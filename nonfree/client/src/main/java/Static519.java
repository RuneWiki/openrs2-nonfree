import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	public static int anInt1794;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Z")
	public static boolean method1518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static301.method4359(arg0, arg1) | (arg0 & 0x60000) != 0 || Static377.method5258(arg0, arg1);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)V")
	public static void method1521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub2_Sub18 local10 = Static508.method6607(0, 15);
		local10.method6227();
		local10.anInt7693 = arg1;
		local10.anInt7701 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	public static void method1522() {
		Static484.anInt7715 = 0;
		Static411.aClass70_43.method1265();
		Static411.aClass70_43.method1269(Static304.aClass2_Sub27_2);
		Static484.anInt7715++;
	}
}
