import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	public static int anInt4615;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "Lclient!oj;")
	public static final Class234 aClass234_29 = new Class234(64);

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	public static int anInt4609 = 0;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
	public static final int anInt4618 = 4;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "[I")
	public static final int[] anIntArray384 = new int[1];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
	public static void method3924() {
		if (Static562.aClass22Array2 == null) {
			Static562.aClass22Array2 = Static26.method359();
			Static312.aClass22_32 = Static562.aClass22Array2[0];
		}
		@Pc(21) Class22 local21 = Static312.aClass22_32;
		@Pc(24) int local24 = Static181.method3011();
		if (Static312.aClass22_32 == local21) {
			Static546.aString86 = Static312.aClass22_32.aClass103_1.method2355(Static188.anInt28);
			Static473.anInt8332 = Static312.aClass22_32.anInt436;
			if (Static312.aClass22_32.aBoolean25) {
				Static546.aString86 = Static546.aString86 + local24 + "%";
			}
		} else if (Static312.aClass22_32 == Static26.aClass22_31) {
			Static436.method6188(3);
		} else {
			Static546.aString86 = local21.aClass103_2.method2355(Static188.anInt28);
			Static473.anInt8332 = local21.anInt438;
		}
		if (Static309.anInterface6Array1 == null) {
			return;
		}
		for (@Pc(75) int local75 = Static3.anInt7080 + 1; local75 < Static309.anInterface6Array1.length; local75++) {
			if (Static309.anInterface6Array1[local75].method3966() >= 100 && local75 - 1 == Static3.anInt7080 && Static375.anInt9162 >= 1 && Static309.anInterface6Array1[local75].method3967()) {
				Static309.anInterface6Array1[local75].method3969();
				Static209.method3406(Static309.anInterface6Array1[local75]);
				Static3.anInt7080++;
			}
		}
	}
}
