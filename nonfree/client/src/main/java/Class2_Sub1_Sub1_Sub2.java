import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FGBEUODV")
public final class Class2_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!FGBEUODV", name = "l", descriptor = "I")
	public int anInt226;

	@OriginalMember(owner = "client!FGBEUODV", name = "m", descriptor = "I")
	public int anInt227;

	@OriginalMember(owner = "client!FGBEUODV", name = "n", descriptor = "I")
	private int anInt228 = 2;

	@OriginalMember(owner = "client!FGBEUODV", name = "a", descriptor = "(B)Lclient!XBVYIDUH;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method507(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class28 local3 = Class28.method410(this.anInt226);
			@Pc(8) boolean local8 = false;
			return local3.method408(this.anInt227);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("49197, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
