import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BINNTJRP")
public final class Class4_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!BINNTJRP", name = "m", descriptor = "I")
	public int anInt24;

	@OriginalMember(owner = "client!BINNTJRP", name = "o", descriptor = "I")
	public int anInt25;

	@OriginalMember(owner = "client!BINNTJRP", name = "n", descriptor = "Z")
	private boolean aBoolean15 = true;

	@OriginalMember(owner = "client!BINNTJRP", name = "a", descriptor = "(Z)Lclient!POJFANDE;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method559() {
		try {
			@Pc(13) Class17 local13 = Class17.method196(this.anInt25);
			return local13.method203(this.anInt24);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("5286, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
