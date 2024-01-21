import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	private int anInt177 = 2;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method693() {
		try {
			@Pc(9) Class17 local9 = Class17.method385(this.anInt178);
			return local9.method389(this.anInt179);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("85421, " + -21173 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
