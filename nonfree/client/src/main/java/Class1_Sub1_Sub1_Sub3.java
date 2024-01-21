import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method669() {
		try {
			@Pc(3) Class15 local3 = Class15.method357(this.anInt167);
			return local3.method361(this.anInt168);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("11961, " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
