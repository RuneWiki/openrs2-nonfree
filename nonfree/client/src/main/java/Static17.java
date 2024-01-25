import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!au", name = "f", descriptor = "I")
	public static int anInt290 = 0;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZZIII)V")
	public static void method325(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static413.method5689(arg3, 0, Static121.aClass41_Sub1Array1.length - 1, arg0, arg2, arg1);
		Static276.anInt4607 = 0;
		Static367.aClass3_Sub23_2 = null;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BII)Z")
	public static boolean method328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static359.method5020(arg0, arg1) | (arg1 & 0x2000) != 0 | Static327.method4523(arg0, arg1)) & Static97.method1674(arg0, arg1);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class114 local13 = local7.aClass114_2; local13 != null; local13 = local13.aClass114_1) {
			@Pc(17) Class1_Sub2 local17 = local13.aClass1_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort108 == arg1 && local17.aShort107 == arg2) {
				Static429.method5842(local17);
				return;
			}
		}
	}
}
