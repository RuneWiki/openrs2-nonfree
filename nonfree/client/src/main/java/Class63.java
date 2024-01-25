import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public class Class63 {

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "[Lclient!um;")
	public static final Class204[] aClass204Array6 = new Class204[5];

	static {
		for (@Pc(15) int local15 = 0; local15 < aClass204Array6.length; local15++) {
			aClass204Array6[local15] = new Class204();
		}
	}
}
