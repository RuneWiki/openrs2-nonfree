import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt177 = -241;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
	private boolean aBoolean51 = true;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method671() {
		try {
			@Pc(3) Class15 local3 = Class15.method358(this.anInt178);
			return local3.method362(this.anInt179);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("83568, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
