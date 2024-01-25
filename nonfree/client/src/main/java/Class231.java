import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class231 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[Lclient!wc;")
	public static final Class387[] aClass387Array1 = new Class387[5];

	static {
		for (@Pc(37) int local37 = 0; local37 < aClass387Array1.length; local37++) {
			aClass387Array1[local37] = new Class387();
		}
	}
}
