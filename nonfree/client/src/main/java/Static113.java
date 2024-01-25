import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	public static int anInt2286 = 0;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_46 = new Class319(42, 3);

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "([Lclient!f;I)V")
	public static void method1977(@OriginalArg(0) Class10[] arg0) {
		Static151.anInt2848 = arg0.length;
		Static206.aClass10Array13 = new Class10[Static151.anInt2848 + 10];
		Static415.anIntArray486 = new int[Static151.anInt2848 + 10];
		Static600.method3766(arg0, 0, Static206.aClass10Array13, 0, Static151.anInt2848);
		for (@Pc(26) int local26 = 0; local26 < Static151.anInt2848; local26++) {
			Static415.anIntArray486[local26] = Static206.aClass10Array13[local26].ca();
		}
		for (@Pc(45) int local45 = Static151.anInt2848; local45 < Static206.aClass10Array13.length; local45++) {
			Static415.anIntArray486[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZZ)V")
	public static void method1979(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static98.anInt2069++;
			Static476.method6701();
		}
		if (arg0) {
			Static212.anInt4156++;
			Static336.method5019();
		}
	}
}
