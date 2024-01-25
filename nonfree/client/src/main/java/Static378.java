import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!oba", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	@OriginalMember(owner = "client!oba", name = "K", descriptor = "Lclient!q;")
	public static Class42 aClass42_4;

	@OriginalMember(owner = "client!oba", name = "N", descriptor = "I")
	public static int anInt6564;

	@OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
	public static int anInt6559 = 0;

	@OriginalMember(owner = "client!oba", name = "M", descriptor = "I")
	public static int anInt6563 = 0;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)V")
	public static void method5279(@OriginalArg(0) int arg0) {
		Static403.anInt7291 = 2;
		Static314.anInt5779 = arg0;
		if (Static148.aString76 == null) {
			Static483.method6567(35);
		} else {
			@Pc(28) Class3_Sub26 local28 = new Class3_Sub26(Static522.method7234(Static399.method5602(Static148.aString76)));
			@Pc(32) long local32 = local28.method6813();
			Static284.aLong140 = local28.method6813();
			Static81.method1893("", true, Static517.method6954(local32));
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZB)V")
	public static void method5281(@OriginalArg(1) byte arg0) {
		if (Static435.aByteArrayArrayArray11 == null) {
			Static435.aByteArrayArrayArray11 = new byte[4][Static345.anInt6228][Static535.anInt9341];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(24) int local24 = 0; local24 < Static345.anInt6228; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static535.anInt9341; local28++) {
					Static435.aByteArrayArrayArray11[local20][local24][local28] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(B)J")
	public static long method5282() {
		return Static83.aClass125_1.method8182();
	}
}
