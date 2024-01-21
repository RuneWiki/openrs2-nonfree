import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BOFPAALI")
public final class Class2_Sub1_Sub2_Sub1 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!BOFPAALI", name = "n", descriptor = "I")
	public int anInt68;

	@OriginalMember(owner = "client!BOFPAALI", name = "o", descriptor = "I")
	public int anInt69;

	@OriginalMember(owner = "client!BOFPAALI", name = "a", descriptor = "(I)Lclient!IEHKDFMR;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method469() {
		try {
			@Pc(3) Class38 local3 = Class38.method391(this.anInt69);
			return local3.method400(this.anInt68);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("50717, " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
