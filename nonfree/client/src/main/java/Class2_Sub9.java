import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!br", name = "k", descriptor = "[Lclient!gu;")
	public static final Class107[] aClass107Array1 = new Class107[5];

	@OriginalMember(owner = "client!br", name = "i", descriptor = "I")
	public int anInt832;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "I")
	public int anInt833;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass107Array1.length; local4++) {
			aClass107Array1[local4] = new Class107();
		}
	}
}
