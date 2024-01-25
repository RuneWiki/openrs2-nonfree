import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class216 {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "[Lclient!jl;")
	public static final Class109[] aClass109Array1 = new Class109[5];

	static {
		for (@Pc(9) int local9 = 0; local9 < aClass109Array1.length; local9++) {
			aClass109Array1[local9] = new Class109();
		}
	}
}
