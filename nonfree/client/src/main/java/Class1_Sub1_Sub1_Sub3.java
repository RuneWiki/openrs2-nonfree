import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public int anInt171;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt172;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method672() {
		try {
			@Pc(3) Class15 local3 = Class15.method358(this.anInt171);
			return local3.method362(this.anInt172);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("51746, " + -37770 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}
}
