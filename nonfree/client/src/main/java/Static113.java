import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!dq", name = "P", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array2;

	@OriginalMember(owner = "client!dq", name = "R", descriptor = "Lclient!qda;")
	public static Class59 aClass59_3;

	@OriginalMember(owner = "client!dq", name = "V", descriptor = "I")
	public static int anInt2020;

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
	public static int anInt2004 = -60;

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "[I")
	public static final int[] anIntArray105 = new int[8];

	@OriginalMember(owner = "client!dq", name = "K", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_79 = new Class196(65, 10);

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
	public static void method1829() {
		Static176.aClass157_1.method3301();
		Static178.aClass111_1.method8694();
		Static437.aClient1.method1263();
		Static105.aCanvas2.setBackground(Color.black);
		Static318.anInt2325 = -1;
		Static176.aClass157_1 = Static10.method171(Static105.aCanvas2);
		Static178.aClass111_1 = Static498.method7219(Static105.aCanvas2);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIZI)V")
	public static void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static90.method1397();
		Static398.aLong207 = (long) 0;
		@Pc(11) int local11 = Static581.method7952();
		if (arg1 == 3 || local11 == 3) {
			arg3 = true;
		}
		if (!Static563.aClass143_13.method6214()) {
			arg3 = true;
		}
		Static80.method1224(arg2, local11, arg1, arg0, arg3);
	}
}
