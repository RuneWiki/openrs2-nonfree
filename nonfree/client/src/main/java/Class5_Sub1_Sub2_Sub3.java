import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LCFGLQPE")
public final class Class5_Sub1_Sub2_Sub3 extends Class5_Sub1_Sub2 {

	@OriginalMember(owner = "client!LCFGLQPE", name = "l", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!LCFGLQPE", name = "m", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!LCFGLQPE", name = "n", descriptor = "I")
	private int anInt258 = 7;

	@OriginalMember(owner = "client!LCFGLQPE", name = "a", descriptor = "(I)Lclient!PSGMMDJS;")
	@Override
	protected Class5_Sub1_Sub2_Sub5 method422() {
		try {
			@Pc(9) Class18 local9 = Class18.method117(this.anInt257);
			return local9.method124(this.anInt256);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("94718, " + 27243 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
