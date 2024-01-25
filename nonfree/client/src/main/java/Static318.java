import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(III)Z")
	public static boolean method5387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static433.aBoolean672) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static85.aClass108ArrayArray2[local13] == null || Static85.aClass108ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class108 local35 = Static85.aClass108ArrayArray2[local13][local17];
		@Pc(47) Class3_Sub1_Sub4 local47;
		if (arg0 == -1 && local35.anInt4018 == 0) {
			for (local47 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local47 != null; local47 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
				if (local47.anInt3485 == 11 || local47.anInt3485 == 1011 || local47.anInt3485 == 30 || local47.anInt3485 == 21 || local47.anInt3485 == 59) {
					for (@Pc(80) Class108 local80 = Static113.method8285(local47.anInt3483); local80 != null; local80 = Static200.method3945(local80)) {
						if (local35.anInt4043 == local80.anInt4043) {
							return true;
						}
					}
				}
			}
		} else {
			for (local47 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local47 != null; local47 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
				if (arg0 == local47.anInt3487 && local35.anInt4043 == local47.anInt3483 && (local47.anInt3485 == 11 || local47.anInt3485 == 1011 || local47.anInt3485 == 30 || local47.anInt3485 == 21 || local47.anInt3485 == 59)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5388(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg0 < 512 || arg3 < 512 || Static394.anInt7540 * 512 - 1024 < arg0 || arg3 > Static462.anInt8391 * 512 - 1024) {
			Static379.anIntArray437[0] = Static379.anIntArray437[1] = -1;
			return;
		}
		@Pc(50) int local50 = Static202.method3958(arg3, arg5, arg0) - arg6;
		if (Static349.aBoolean590) {
			Static182.method3695(true);
		} else {
			Static39.aClass47_1.method7876(arg2, 0, 0);
			Static47.aClass33_3.method6233(Static39.aClass47_1);
		}
		if (Static216.aBoolean440) {
			Static47.aClass33_3.HA(arg0, local50, arg3, Static467.anInt8440, Static379.anIntArray437);
		} else {
			Static47.aClass33_3.da(arg0, local50, arg3, Static379.anIntArray437);
		}
		if (Static349.aBoolean590) {
			Static287.method4988();
		} else {
			Static39.aClass47_1.method7876(-arg2, 0, 0);
			Static47.aClass33_3.method6233(Static39.aClass47_1);
		}
	}
}
