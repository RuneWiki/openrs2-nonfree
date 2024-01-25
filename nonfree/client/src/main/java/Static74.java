import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
	public static int anInt1648;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)V")
	public static void method1179() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static536.aBooleanArray39[local3] = false;
		}
		Static94.anInt2006 = -1;
		Static238.anInt4482 = -1;
		Static408.anInt7104 = -1;
		Static309.anInt5528 = 0;
		Static332.anInt6122 = -1;
		Static311.anInt5570 = 1;
		Static204.anInt3987 = 0;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIB)I")
	public static int method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static585.anIntArray684[arg0 & 0x3] : Static226.anIntArray339[arg0 & 0x3];
	}
}
