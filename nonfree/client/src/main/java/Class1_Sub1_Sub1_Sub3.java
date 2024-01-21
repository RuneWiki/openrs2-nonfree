import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public int anInt483;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	private int anInt481 = 650;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class15 local7 = Class15.method345(this.anInt482);
			return local7.method349(this.anInt483);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("37291, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
