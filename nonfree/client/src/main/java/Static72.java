import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
	public static boolean method1582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(27) boolean local27 = (arg1 & 0x37) == 0 ? Static148.method2490(arg1, arg0) : Static280.method3949(arg0, arg1);
		return local27 | Static47.method1236(arg0, arg1) | (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	public static void method1584() {
		Static692.aClass307_92.method7006();
	}
}
