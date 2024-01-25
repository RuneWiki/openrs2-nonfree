import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array17;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	public static int anInt2441;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_78 = new Class62("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZII)I")
	public static int method1985(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub32 local10 = Static76.method1317(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local10.anIntArray471.length; local31++) {
				if (arg0 == local10.anIntArray470[local31]) {
					local29 += local10.anIntArray471[local31];
				}
			}
			return local29;
		}
	}
}
