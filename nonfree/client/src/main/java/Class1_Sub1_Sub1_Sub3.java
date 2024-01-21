import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method670() {
		try {
			@Pc(13) Class15 local13 = Class15.method358(this.anInt180);
			return local13.method362(this.anInt181);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("59052, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
