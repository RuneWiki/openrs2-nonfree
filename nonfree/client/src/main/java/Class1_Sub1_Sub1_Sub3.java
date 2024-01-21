import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public int anInt498;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class15 local3 = Class15.method345(this.anInt497);
			@Pc(8) boolean local8 = false;
			return local3.method349(this.anInt498);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("87463, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}
}
