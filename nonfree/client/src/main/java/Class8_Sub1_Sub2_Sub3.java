import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NOAOCJCI")
public final class Class8_Sub1_Sub2_Sub3 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!NOAOCJCI", name = "l", descriptor = "I")
	public int anInt401;

	@OriginalMember(owner = "client!NOAOCJCI", name = "m", descriptor = "I")
	public int anInt402;

	@OriginalMember(owner = "client!NOAOCJCI", name = "a", descriptor = "(I)Lclient!VHYCWIPJ;")
	@Override
	protected Class8_Sub1_Sub2_Sub5 method557() {
		try {
			@Pc(9) Class2 local9 = Class2.method4(this.anInt402);
			return local9.method1(this.anInt401);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("65056, " + -650 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
