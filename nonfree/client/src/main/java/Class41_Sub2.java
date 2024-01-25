import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "[Lclient!ik;")
	public static final Class117[] aClass117Array1 = new Class117[5];

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
	public int anInt2750;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "I")
	public int anInt2752;

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "Lclient!ou;")
	public Class30_Sub1_Sub1 aClass30_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
	public int anInt2753;

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
	public int anInt2754;

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass117Array1.length; local6++) {
			aClass117Array1[local6] = new Class117();
		}
	}
}
