import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public static int anInt7045;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	public static int anInt7046;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_173 = new Class25(6, 8);

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Z")
	public static boolean aBoolean468 = false;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method5652() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static333.aBooleanArray21[local3] = false;
		}
		Static220.anInt3722 = -1;
		Static25.anInt7273 = 1;
		Static419.anInt7190 = 0;
		Static385.anInt6689 = 0;
		Static273.anInt4956 = -1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)Z")
	public static boolean method5653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static50.method775(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static146.anInt2674;
			@Pc(14) int local14 = arg2 << Static146.anInt2674;
			return Static238.method3232(local10 + 1, Static241.aClass22Array3[arg0].ua(arg1, arg2) + arg3, local14 + 1) && Static238.method3232(local10 + Static327.anInt5862 - 1, Static241.aClass22Array3[arg0].ua(arg1 + 1, arg2) + arg3, local14 + 1) && Static238.method3232(local10 + Static327.anInt5862 - 1, Static241.aClass22Array3[arg0].ua(arg1 + 1, arg2 + 1) + arg3, local14 + Static327.anInt5862 - 1) && Static238.method3232(local10 + 1, Static241.aClass22Array3[arg0].ua(arg1, arg2 + 1) + arg3, local14 + Static327.anInt5862 - 1);
		} else {
			return false;
		}
	}
}
