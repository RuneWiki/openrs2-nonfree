import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RQFEYKNL")
public final class Class6_Sub2_Sub1_Sub5 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!RQFEYKNL", name = "n", descriptor = "I")
	public int anInt471;

	@OriginalMember(owner = "client!RQFEYKNL", name = "o", descriptor = "I")
	public int anInt472;

	@OriginalMember(owner = "client!RQFEYKNL", name = "a", descriptor = "(I)Lclient!JUQSYEMB;")
	@Override
	protected Class6_Sub2_Sub1_Sub3 method529(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class43 local3 = Class43.method464(this.anInt472);
			@Pc(7) boolean local7 = false;
			return local3.method459(this.anInt471);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("75532, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
