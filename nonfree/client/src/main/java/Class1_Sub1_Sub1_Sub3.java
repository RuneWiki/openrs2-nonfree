import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) Class15 local3 = Class15.method361(this.anInt191);
			return local3.method365(this.anInt192);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("87410, " + -47094 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
