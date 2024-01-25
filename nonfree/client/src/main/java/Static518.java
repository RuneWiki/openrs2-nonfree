import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
	public static int anInt8266 = 0;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method7347() {
		Static268.anInt4162 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static388.aClass2_Sub20Array1[local14] = null;
			Static192.aByteArray37[local14] = 1;
			Static701.aClass361Array2[local14] = null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIII)I")
	public static int method7348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(14) int local14 = arg1;
			arg1 = arg0;
			arg0 = local14;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return 7 + 1 - arg2 - arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return arg2;
		}
	}
}
