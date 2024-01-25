import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt5764;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_60 = new Class144(27, 7);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	public static int anInt5765 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public static void method5076() {
		for (@Pc(3) int local3 = 0; local3 < Static250.anInt3897; local3++) {
			@Pc(24) int local24 = Static639.method8418(Static250.anInt3897, Static406.anInt10703 + local3) * Static268.anInt4147;
			for (@Pc(26) int local26 = 0; local26 < Static268.anInt4147; local26++) {
				@Pc(37) int local37 = Static639.method8418(Static268.anInt4147, Static614.anInt9291 + local26) + local24;
				if (Static683.anInt10656 == Static705.anIntArray783[local37]) {
					Static559.anInterface25Array1[local37].method9262(0, 0, Static91.anInt2080, Static703.anInt10979, Static91.anInt2080 * local26, local3 * Static703.anInt10979);
				}
			}
		}
		anInt5764++;
	}
}
