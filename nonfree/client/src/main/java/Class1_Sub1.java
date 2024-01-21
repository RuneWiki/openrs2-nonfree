import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!w")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method568() {
		try {
			if (this.anInt887 != 0) {
				throw new NullPointerException();
			}
			return null;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("61843, " + 0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}
}
