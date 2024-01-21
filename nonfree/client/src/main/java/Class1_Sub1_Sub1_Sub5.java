import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MOPVFPSQ")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!MOPVFPSQ", name = "n", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!MOPVFPSQ", name = "o", descriptor = "I")
	public int anInt439;

	@OriginalMember(owner = "client!MOPVFPSQ", name = "m", descriptor = "I")
	private int anInt437 = -39282;

	@OriginalMember(owner = "client!MOPVFPSQ", name = "a", descriptor = "(I)Lclient!FUTAQMCE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method341() {
		try {
			@Pc(3) Class5 local3 = Class5.method23(this.anInt439);
			if (this.anInt437 != -39282) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			return local3.method25(this.anInt438);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("92148, " + -39282 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}
}
