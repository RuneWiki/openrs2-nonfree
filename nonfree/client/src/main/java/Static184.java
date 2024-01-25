import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static184 {

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!ifa;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Z")
	public static boolean aBoolean327 = true;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method3594() {
		Static315.aClass93Array3 = null;
		Static204.method3799(0, 0, 0, -1, Static180.anInt4051, Static6.anInt302, 0, Static228.anInt4744);
		if (Static315.aClass93Array3 != null) {
			Static325.method5246(Static315.aClass93Array3, Static162.anInt3683, Static376.anInt7066, 0, 0, Static228.anInt4744, -1412584499, Static180.anInt4051, Static371.aClass93_12.anInt2764);
			Static315.aClass93Array3 = null;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Lclient!gi;")
	public static Class116_Sub1 method3595() {
		return Static199.aClass116_Sub1Array1.length > Static294.anInt5608 ? Static199.aClass116_Sub1Array1[Static294.anInt5608++] : null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Z")
	public static boolean method3598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
