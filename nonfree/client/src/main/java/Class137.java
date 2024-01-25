import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class137 {

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "[Lclient!re;")
	public static final Class320[] aClass320Array1 = new Class320[5];

	static {
		for (@Pc(80) int local80 = 0; local80 < aClass320Array1.length; local80++) {
			aClass320Array1[local80] = new Class320();
		}
	}
}
