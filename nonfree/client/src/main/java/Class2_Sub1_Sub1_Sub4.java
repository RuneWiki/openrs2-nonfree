import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ETOKKIHH")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ETOKKIHH", name = "l", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!ETOKKIHH", name = "m", descriptor = "I")
	public int anInt161;

	@OriginalMember(owner = "client!ETOKKIHH", name = "n", descriptor = "I")
	public int anInt162;

	@OriginalMember(owner = "client!ETOKKIHH", name = "a", descriptor = "(I)Lclient!OGORHYVW;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method565() {
		try {
			@Pc(8) Class36 local8 = Class36.method434(this.anInt161);
			return local8.method438(this.anInt162);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("15641, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
