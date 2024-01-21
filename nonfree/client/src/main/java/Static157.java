import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "[S")
	public static short[] aShortArray35;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!ch;")
	public static Class14 aClass14_176 = new Class14(260);

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static int anInt3496 = 0;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2046 = Static107.method1838("flash3:");

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2047 = aClass28_2046;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
	public static int anInt3497 = 0;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2048 = aClass28_2046;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!ff;")
	public static Class24 aClass24_11 = null;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method2409() {
		aClass28_2048 = null;
		aShortArray35 = null;
		aClass24_11 = null;
		aClass28_2046 = null;
		aClass14_176 = null;
		aClass28_2047 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub19 local7 = null;
		for (@Pc(12) Class2_Sub19 local12 = (Class2_Sub19) Static29.aClass65_2.method2115(); local12 != null; local12 = (Class2_Sub19) Static29.aClass65_2.method2117()) {
			if (local12.anInt2721 == arg4 && local12.anInt2708 == arg2 && local12.anInt2723 == arg5 && local12.anInt2720 == arg1) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub19();
			local7.anInt2721 = arg4;
			local7.anInt2708 = arg2;
			local7.anInt2720 = arg1;
			local7.anInt2723 = arg5;
			Static168.method2644(local7);
			Static29.aClass65_2.method2116(local7);
		}
		local7.anInt2722 = arg8;
		local7.anInt2714 = arg3;
		local7.anInt2712 = arg0;
		local7.anInt2707 = arg7;
		local7.anInt2711 = arg6;
	}
}
