import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SXUWJAYK")
public final class Class2_Sub1_Sub1_Sub6 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!SXUWJAYK", name = "k", descriptor = "I")
	public int anInt600;

	@OriginalMember(owner = "client!SXUWJAYK", name = "l", descriptor = "I")
	public int anInt601;

	@OriginalMember(owner = "client!SXUWJAYK", name = "a", descriptor = "(B)Lclient!CYPZUKMB;")
	@Override
	protected Class2_Sub1_Sub1_Sub2 method455() {
		try {
			@Pc(3) Class41 local3 = Class41.method495(this.anInt600);
			return local3.method492(this.anInt601);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("4099, " + -99 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
