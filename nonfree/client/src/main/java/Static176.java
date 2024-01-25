import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public static int anInt2649;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "Lclient!ps;")
	public static Class273 aClass273_5;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
	public static int anInt2654 = 0;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "[I")
	public static final int[] anIntArray220 = new int[50];

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public static void method2279() {
		Static484.anInt7716 = -1;
		Static449.anInt7189 = 0;
		Static143.anInt7433 = -1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIB)V")
	public static void method2282(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class2_Sub16 local10 = Static261.method3663(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray215.length; local15++) {
				local10.anIntArray215[local15] = -1;
				local10.anIntArray214[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z")
	public static boolean method2283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
