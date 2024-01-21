import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) Class15 local3 = Class15.method361(this.anInt179);
			return local3.method365(this.anInt180);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("84138, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
