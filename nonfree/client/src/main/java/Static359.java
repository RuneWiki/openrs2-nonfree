import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!p", name = "f", descriptor = "[I")
	public static int[] anIntArray520;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!gu;")
	public static final Class107 aClass107_6 = new Class107();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5799(@OriginalArg(0) String arg0) {
		return Static523.method7571(arg0, 10);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIB)Z")
	public static boolean method5800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static452.aBoolean600) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static235.aClass310ArrayArray2[local13] == null || Static235.aClass310ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class310 local35 = Static235.aClass310ArrayArray2[local13][local17];
		@Pc(46) Class2_Sub44 local46;
		if (arg1 == -1 && local35.anInt9220 == 0) {
			for (local46 = (Class2_Sub44) Static448.aClass249_63.method6527(); local46 != null; local46 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
				if (local46.anInt8460 == 15 || local46.anInt8460 == 1001 || local46.anInt8460 == 18 || local46.anInt8460 == 2 || local46.anInt8460 == 13) {
					for (@Pc(136) Class310 local136 = Static111.method2143(local46.anInt8461); local136 != null; local136 = Static448.method6843(local136)) {
						if (local35.anInt9226 == local136.anInt9226) {
							return true;
						}
					}
				}
			}
		} else {
			for (local46 = (Class2_Sub44) Static448.aClass249_63.method6527(); local46 != null; local46 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
				if (local46.anInt8463 == arg1 && local46.anInt8461 == local35.anInt9226 && (local46.anInt8460 == 15 || local46.anInt8460 == 1001 || local46.anInt8460 == 18 || local46.anInt8460 == 2 || local46.anInt8460 == 13)) {
					return true;
				}
			}
		}
		return false;
	}
}
