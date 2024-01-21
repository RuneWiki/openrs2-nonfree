import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JRQYDGTL")
public final class Class2_Sub1_Sub3_Sub3 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!JRQYDGTL", name = "m", descriptor = "I")
	public int anInt327;

	@OriginalMember(owner = "client!JRQYDGTL", name = "n", descriptor = "I")
	public int anInt328;

	@OriginalMember(owner = "client!JRQYDGTL", name = "l", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!JRQYDGTL", name = "a", descriptor = "(Z)Lclient!WRJMHIDY;")
	@Override
	protected Class2_Sub1_Sub3_Sub5 method510() {
		try {
			@Pc(13) Class34 local13 = Class34.method385(this.anInt327);
			return local13.method379(this.anInt328);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("26878, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
