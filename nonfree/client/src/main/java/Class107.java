import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class107 {

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "[Lclient!du;")
	public static final Class56[] aClass56Array1;

	static {
		new Class221("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
		aClass56Array1 = new Class56[5];
		for (@Pc(36) int local36 = 0; local36 < aClass56Array1.length; local36++) {
			aClass56Array1[local36] = new Class56();
		}
	}
}
