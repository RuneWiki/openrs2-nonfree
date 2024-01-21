import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public int anInt490;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public int anInt491;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method315() {
		try {
			@Pc(10) Class15 local10 = Class15.method343(this.anInt490);
			return local10.method347(this.anInt491);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("59596, " + -13634 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
