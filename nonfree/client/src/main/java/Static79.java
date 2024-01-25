import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
	public static int anInt5729;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_120 = new Class119(59, 7);

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_34 = new Class243();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)V")
	public static void method4479(@OriginalArg(0) byte arg0) {
		if (Static229.aByteArrayArrayArray16 == null) {
			Static229.aByteArrayArrayArray16 = new byte[4][Static40.anInt1089][Static44.anInt7276];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(23) int local23 = 0; local23 < Static40.anInt1089; local23++) {
				for (@Pc(26) int local26 = 0; local26 < Static44.anInt7276; local26++) {
					Static229.aByteArrayArrayArray16[local20][local23][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)Lclient!jq;")
	public static Class3_Sub26 method4480() {
		if (Static144.aClass243_33 == null || Static55.aClass40_1 == null) {
			return null;
		}
		Static55.aClass40_1.method1129(Static144.aClass243_33);
		@Pc(27) Class3_Sub26 local27 = (Class3_Sub26) Static55.aClass40_1.method1127();
		if (local27 == null) {
			return null;
		} else {
			@Pc(37) Class90 local37 = Static144.aClass171_4.method3940(local27.anInt3892);
			return local37 != null && local37.aBoolean239 && local37.method2034(Static144.anInterface9_2) ? local27 : Static155.method2516();
		}
	}
}
