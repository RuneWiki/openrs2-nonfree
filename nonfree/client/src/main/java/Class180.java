import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class180 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "[Lclient!bn;")
	public static final Class24[] aClass24Array1 = new Class24[5];

	static {
		for (@Pc(8) int local8 = 0; local8 < aClass24Array1.length; local8++) {
			aClass24Array1[local8] = new Class24();
		}
	}
}
