import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QXUWKDGL")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!QXUWKDGL", name = "m", descriptor = "I")
	public int anInt565;

	@OriginalMember(owner = "client!QXUWKDGL", name = "n", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!QXUWKDGL", name = "a", descriptor = "(Z)Lclient!GCSAWSJV;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method555() {
		try {
			@Pc(3) Class23 local3 = Class23.method248(this.anInt565);
			return local3.method252(this.anInt566);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("92167, " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
