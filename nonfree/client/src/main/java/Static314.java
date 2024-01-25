import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public static int anInt5576;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[128][128];

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!mg;")
	public static final Class222 aClass222_2 = new Class222();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)Z")
	public static boolean method4856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method4857() {
		Static185.aClass221_1.method8052();
		Static186.aClass358_1.method8728();
		Static509.aClient1.method1718();
		Static150.aCanvas4.setBackground(Color.black);
		Static21.anInt454 = -1;
		Static185.aClass221_1 = Static252.method4191(Static150.aCanvas4);
		Static186.aClass358_1 = Static129.method2293(Static150.aCanvas4);
	}
}
