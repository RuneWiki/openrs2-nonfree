import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HNKCWGJM")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!HNKCWGJM", name = "m", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!HNKCWGJM", name = "n", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!HNKCWGJM", name = "a", descriptor = "(I)Lclient!ZKARKDQW;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method529() {
		try {
			@Pc(3) Class9 local3 = Class9.method118(this.anInt390);
			return local3.method121(this.anInt391);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("2596, " + 4016 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
