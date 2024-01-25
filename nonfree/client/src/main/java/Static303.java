import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
	public static int anInt7069;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
	public static int anInt7065 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z")
	public static boolean method6084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static214.aBoolean313) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static272.aClass3ArrayArray1[local13] == null || Static272.aClass3ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class3 local40 = Static272.aClass3ArrayArray1[local13][local17];
		@Pc(55) Class2_Sub43 local55;
		if (arg0 == -1 && local40.anInt91 == 0) {
			for (local55 = (Class2_Sub43) Static262.aClass238_29.method5795(); local55 != null; local55 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
				if (local55.anInt7126 == 22 || local55.anInt7126 == 1010 || local55.anInt7126 == 18 || local55.anInt7126 == 15 || local55.anInt7126 == 49) {
					for (@Pc(86) Class3 local86 = Static380.method5987(local55.anInt7120); local86 != null; local86 = Static280.method4693(local86)) {
						if (local86.anInt94 == local40.anInt94) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class2_Sub43) Static262.aClass238_29.method5795(); local55 != null; local55 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
				if (local55.anInt7122 == arg0 && local55.anInt7120 == local40.anInt94 && (local55.anInt7126 == 22 || local55.anInt7126 == 1010 || local55.anInt7126 == 18 || local55.anInt7126 == 15 || local55.anInt7126 == 49)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)I")
	public static int method6086(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(32) int local32 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local32;
		}
		return arg0;
	}
}
