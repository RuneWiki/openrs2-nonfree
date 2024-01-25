import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!kja", name = "e", descriptor = "I")
	public static int anInt5852;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(Z)V")
	public static void method4990() {
		for (@Pc(3) int local3 = 0; local3 < Static643.anInt10383; local3++) {
			@Pc(17) int local17 = Static119.method2060(Static481.anInt8379 + local3, Static643.anInt10383) * Static310.anInt5521;
			for (@Pc(19) int local19 = 0; local19 < Static310.anInt5521; local19++) {
				@Pc(32) int local32 = local17 + Static119.method2060(local19 + Static179.anInt3232, Static310.anInt5521);
				if (Static277.anIntArray289[local32] == Static686.anInt7557) {
					Static76.anInterface20Array1[local32].method9154(0, 0, Static299.anInt6879, Static523.anInt8898, Static299.anInt6879 * local19, Static523.anInt8898 * local3);
				}
			}
		}
		anInt5852++;
	}
}
