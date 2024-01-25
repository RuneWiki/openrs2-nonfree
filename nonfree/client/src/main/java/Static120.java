import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
	public static int anInt2772;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_62 = new Class56(52, 2);

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
	public static int anInt2777 = -1;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z")
	public static boolean method2484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public static void method2485() {
		for (@Pc(10) Class3_Sub26 local10 = (Class3_Sub26) Static469.aClass112_27.method3088(); local10 != null; local10 = (Class3_Sub26) Static469.aClass112_27.method3084()) {
			if (local10.anInt3734 == -1) {
				local10.anInt3739 = 0;
				if (local10.anInt3738 >= 0 && local10.anInt3735 >= 0 && local10.anInt3738 < Static54.anInt1038 && Static140.anInt3026 > local10.anInt3735) {
					Static133.method2620(local10);
				}
			} else {
				local10.method7825();
			}
		}
	}
}
