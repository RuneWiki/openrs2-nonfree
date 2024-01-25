import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!mk;")
	public static Class155 aClass155_2;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_210 = new Class103(1, 2);

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public static int anInt5862 = 0;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!eo;")
	public static final Class67 aClass67_1 = Static239.method4560();

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4596(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static18.aStringArray4.length; local12++) {
			if (Static18.aStringArray4[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZI)Z")
	public static boolean method4597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static17.aBoolean39) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static87.aClass124ArrayArray7[local13] == null || Static87.aClass124ArrayArray7[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class124 local40 = Static87.aClass124ArrayArray7[local13][local17];
		@Pc(51) Class1_Sub19 local51;
		if (arg0 == -1 && local40.anInt3417 == 0) {
			for (local51 = (Class1_Sub19) Static202.aClass227_21.method4967(); local51 != null; local51 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
				if (local51.anInt2416 == 9 || local51.anInt2416 == 1012 || local51.anInt2416 == 18 || local51.anInt2416 == 44 || local51.anInt2416 == 16) {
					for (@Pc(86) Class124 local86 = Static412.method5315(local51.anInt2421); local86 != null; local86 = Static365.method4856(local86)) {
						if (local86.anInt3348 == local40.anInt3348) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class1_Sub19) Static202.aClass227_21.method4967(); local51 != null; local51 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
				if (arg0 == local51.anInt2419 && local51.anInt2421 == local40.anInt3348 && (local51.anInt2416 == 9 || local51.anInt2416 == 1012 || local51.anInt2416 == 18 || local51.anInt2416 == 44 || local51.anInt2416 == 16)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method4598() {
		if (Static453.aBoolean815) {
			return;
		}
		if (Static453.aClass136_Sub1_1.aBoolean495) {
			Static262.aFloat62 = (int) Static262.aFloat62 + 47 & 0xFFFFFFF0;
		} else {
			Static351.aFloat72 += (12.0F - Static351.aFloat72) / 2.0F;
		}
		Static453.aBoolean815 = true;
		Static297.aBoolean669 = true;
	}
}
