import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class114 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[Lclient!fk;")
	public static final Class67[] aClass67Array1 = new Class67[5];

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass67Array1.length; local4++) {
			aClass67Array1[local4] = new Class67();
		}
	}
}
