import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!es", name = "M", descriptor = "Lclient!ni;")
	public static Class217 aClass217_1;

	@OriginalMember(owner = "client!es", name = "H", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_26 = new Class77(4, -1);

	@OriginalMember(owner = "client!es", name = "O", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!es", name = "R", descriptor = "I")
	public static int anInt2825 = -1;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BIIII)V")
	public static void method2531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static242.anInt4984 = arg1;
		Static181.anInt4090 = arg3;
		Static131.anInt2993 = arg0;
		Static389.anInt7391 = arg2;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IBI)Z")
	public static boolean method2532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)Z")
	public static boolean method2533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
