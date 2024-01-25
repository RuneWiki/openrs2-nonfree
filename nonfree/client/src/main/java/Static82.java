import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public static int anInt9165;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	public static int anInt9172 = 2;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z")
	public static boolean method7595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method7596(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static429.method6007();
		Static269.method4226();
		Static325.method7828();
		Static440.method6264(arg0, arg1);
		Static400.method7927();
		Static81.method1664(Static136.aClass12_8);
		Static338.method5051(Static136.aClass12_8);
		Static338.method5054(Static136.aClass12_8, Static141.aClass111_32);
		Static192.method3389();
		Static113.method1977(Static39.aClass10Array5);
		Static388.method5569();
		Static89.method1753();
		if (Static177.anInt2101 == 3) {
			Static243.method3970(4);
		} else if (Static177.anInt2101 == 7) {
			Static243.method3970(8);
		} else if (Static177.anInt2101 == 10) {
			Static243.method3970(11);
		} else if (Static177.anInt2101 == 1 || Static177.anInt2101 == 2) {
			Static530.method7227();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)V")
	public static void method7601(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(11, arg0);
		local8.method488();
	}
}
