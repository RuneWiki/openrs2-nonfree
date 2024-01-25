import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class169 {

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "[Lclient!jia;")
	public static final Class171[] aClass171Array1 = new Class171[5];

	static {
		for (@Pc(7) int local7 = 0; local7 < aClass171Array1.length; local7++) {
			aClass171Array1[local7] = new Class171();
		}
	}
}
