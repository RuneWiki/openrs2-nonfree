import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CVTFWCOC")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!CVTFWCOC", name = "n", descriptor = "I")
	public int anInt200;

	@OriginalMember(owner = "client!CVTFWCOC", name = "o", descriptor = "I")
	public int anInt201;

	@OriginalMember(owner = "client!CVTFWCOC", name = "a", descriptor = "(I)Lclient!LFTMDGKK;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method448() {
		try {
			@Pc(3) Class23 local3 = Class23.method286(this.anInt200);
			return local3.method289(this.anInt201);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("3474, " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
