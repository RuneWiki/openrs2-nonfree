import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class59 {

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "[Lclient!mb;")
	public static final Class154[] aClass154Array1 = new Class154[5];

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass154Array1.length; local6++) {
			aClass154Array1[local6] = new Class154();
		}
	}
}
