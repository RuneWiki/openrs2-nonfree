import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Lclient!ek;")
	public static Class42 aClass42_16;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "I")
	public static int anInt1326 = -1;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString50 = "Started 3d Library";

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)I")
	public static int method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static13.aByteArrayArrayArray2[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static13.aByteArrayArrayArray2[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Lclient!cf;")
	public static Class26 method983() {
		try {
			return (Class26) Class.forName("Class26_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
	public static void method984() {
		@Pc(3) int local3 = 0;
		for (@Pc(9) int local9 = 0; local9 < 104; local9++) {
			for (@Pc(16) int local16 = 0; local16 < 104; local16++) {
				if (Static225.method4283(local3, Static52.aClass2_Sub13ArrayArrayArray1, local9, true, local16)) {
					local3++;
				}
				if (local3 >= 512) {
					return;
				}
			}
		}
	}
}
