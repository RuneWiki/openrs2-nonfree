import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(11) Class15 local11 = Class15.method361(this.anInt179);
			return local11.method365(this.anInt180);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("71492, " + -20 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
