import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
	public static boolean aBoolean328;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array12;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
	public static void method3389() {
		Static244.aClass10_16 = null;
		Static425.aClass10_35 = null;
		Static356.aClass10_33 = null;
		Static402.aClass10_31 = null;
		Static428.aClass10_17 = null;
		Static206.aClass10Array13 = null;
		Static371.aClass10_28 = null;
		Static382.aClass10_29 = null;
		Static404.aClass10_32 = null;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZI)Z")
	public static boolean method3391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
