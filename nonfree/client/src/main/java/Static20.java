import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_28 = new Class159("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method334() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static350.anInt6637; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static105.anInt2647; local13++) {
				if (Static127.method2627(local9, Static273.aClass128ArrayArrayArray4, local13, local7, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
