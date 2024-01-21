import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OFYTUJCE")
public final class Class5_Sub1_Sub1_Sub5 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!OFYTUJCE", name = "l", descriptor = "I")
	public int anInt556;

	@OriginalMember(owner = "client!OFYTUJCE", name = "m", descriptor = "I")
	public int anInt557;

	@OriginalMember(owner = "client!OFYTUJCE", name = "a", descriptor = "(I)Lclient!VYUQHOMO;")
	@Override
	protected Class5_Sub1_Sub1_Sub6 method372(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class17 local3 = Class17.method130(this.anInt557);
			@Pc(7) boolean local7 = false;
			return local3.method129(this.anInt556);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("62621, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
