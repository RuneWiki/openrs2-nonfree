import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class221 {

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "[Lclient!qba;")
	private static final Class243[] aClass243Array1 = new Class243[32];

	static {
		@Pc(93) Class243[] local93 = Static428.method6115();
		for (@Pc(95) int local95 = 0; local95 < local93.length; local95++) {
			aClass243Array1[local93[local95].anInt7052] = local93[local95];
		}
	}
}
