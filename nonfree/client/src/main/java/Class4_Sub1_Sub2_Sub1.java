import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CCYSOVSO")
public final class Class4_Sub1_Sub2_Sub1 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!CCYSOVSO", name = "l", descriptor = "I")
	public int anInt40;

	@OriginalMember(owner = "client!CCYSOVSO", name = "m", descriptor = "I")
	public int anInt41;

	@OriginalMember(owner = "client!CCYSOVSO", name = "a", descriptor = "(B)Lclient!KUGNQTGL;")
	@Override
	protected Class4_Sub1_Sub2_Sub3 method575() {
		try {
			@Pc(13) Class24 local13 = Class24.method315(this.anInt40);
			return local13.method306(this.anInt41);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("27242, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
