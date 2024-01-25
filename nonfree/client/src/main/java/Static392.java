import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "Lclient!vu;")
	public static final Class349 aClass349_11 = new Class349();

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!ov", name = "A", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_130 = new Class319(15, 3);

	@OriginalMember(owner = "client!ov", name = "B", descriptor = "Z")
	public static boolean aBoolean493 = true;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!cv;Lclient!cv;Z)V")
	public static void method5596(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		if (arg0.aClass20_68 != null) {
			arg0.method7704();
		}
		arg0.aClass20_67 = arg1;
		arg0.aClass20_68 = arg1.aClass20_68;
		arg0.aClass20_68.aClass20_67 = arg0;
		arg0.aClass20_67.aClass20_68 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V")
	public static void method5598(@OriginalArg(1) int arg0) {
		Static325.method7831();
		@Pc(11) int local11 = Static189.aClass39_1.method1243(arg0).anInt9073;
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static121.aClass148_1.anIntArray240[arg0];
		if (local11 == 5) {
			Static54.anInt1401 = local22;
		}
		if (local11 == 6) {
			Static365.anInt6483 = local22;
		}
	}
}
