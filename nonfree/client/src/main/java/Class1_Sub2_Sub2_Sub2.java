import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EOQVVIAH")
public final class Class1_Sub2_Sub2_Sub2 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!EOQVVIAH", name = "k", descriptor = "I")
	public int anInt223;

	@OriginalMember(owner = "client!EOQVVIAH", name = "l", descriptor = "I")
	public int anInt224;

	@OriginalMember(owner = "client!EOQVVIAH", name = "a", descriptor = "(I)Lclient!IRLTEWJP;")
	@Override
	protected Class1_Sub2_Sub2_Sub3 method574() {
		try {
			@Pc(11) Class38 local11 = Class38.method409(this.anInt224);
			return local11.method403(this.anInt223);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("42960, " + -840 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
