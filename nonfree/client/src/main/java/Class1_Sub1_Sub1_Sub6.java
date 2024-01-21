import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XMCAJXJH")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!XMCAJXJH", name = "m", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!XMCAJXJH", name = "n", descriptor = "I")
	public int anInt790;

	@OriginalMember(owner = "client!XMCAJXJH", name = "a", descriptor = "(I)Lclient!HEQROJXW;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method547() {
		try {
			@Pc(10) Class21 local10 = Class21.method335(this.anInt789);
			return local10.method336(this.anInt790);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("30531, " + 8 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
