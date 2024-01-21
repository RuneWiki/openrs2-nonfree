import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_698 = Static187.method3089("mapfunction");

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "[Lclient!vd;")
	public static final Class92[] aClass92Array13 = new Class92[100];

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
	public static void method1138() {
		@Pc(10) int local10;
		for (@Pc(3) int local3 = -1; local3 < Static35.anInt992; local3++) {
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static111.anIntArray181[local3];
			}
			@Pc(20) Class8_Sub3_Sub1 local20 = Static47.aClass8_Sub3_Sub1Array1[local10];
			if (local20 != null && local20.anInt3621 > 0) {
				local20.anInt3621--;
				if (local20.anInt3621 == 0) {
					local20.aClass92_1718 = null;
				}
			}
		}
		for (local10 = 0; local10 < Static153.anInt3186; local10++) {
			@Pc(56) int local56 = Static103.anIntArray167[local10];
			@Pc(60) Class8_Sub3_Sub2 local60 = Static177.aClass8_Sub3_Sub2Array1[local56];
			if (local60 != null && local60.anInt3621 > 0) {
				local60.anInt3621--;
				if (local60.anInt3621 == 0) {
					local60.aClass92_1718 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIBI)V")
	public static void method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static102.anInt2207 && arg3 <= Static116.anInt2488 && arg4 >= Static118.anInt2521 && Static204.anInt2389 >= arg1) {
			Static192.method3135(arg4, arg0, arg1, arg3, arg2);
		} else {
			Static170.method2666(arg0, arg3, arg1, arg4, arg2);
		}
	}
}
