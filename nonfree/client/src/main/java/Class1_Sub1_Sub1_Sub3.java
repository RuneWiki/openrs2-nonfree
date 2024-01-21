import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public int anInt483;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public int anInt484;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method313() {
		try {
			@Pc(3) Class13 local3 = Class13.method317(this.anInt483);
			return local3.method321(this.anInt484);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("78360, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
