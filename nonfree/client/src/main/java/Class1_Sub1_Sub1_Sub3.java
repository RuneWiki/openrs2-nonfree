import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public int anInt177;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(13) Class15 local13 = Class15.method361(this.anInt177);
			return local13.method365(this.anInt178);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("99498, " + -59 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
