import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public int anInt169;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(12) Class15 local12 = Class15.method361(this.anInt168);
			return local12.method365(this.anInt169);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("10412, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}
}
