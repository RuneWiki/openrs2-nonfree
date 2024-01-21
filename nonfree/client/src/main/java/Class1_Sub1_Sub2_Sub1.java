import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CTXDUSNR")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!CTXDUSNR", name = "m", descriptor = "I")
	public int anInt83;

	@OriginalMember(owner = "client!CTXDUSNR", name = "n", descriptor = "I")
	public int anInt84;

	@OriginalMember(owner = "client!CTXDUSNR", name = "l", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!CTXDUSNR", name = "a", descriptor = "(I)Lclient!RTQSBWRH;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method410() {
		try {
			@Pc(3) Class27 local3 = Class27.method308(this.anInt84);
			return local3.method305(this.anInt83);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("36204, " + -704 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
