import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!w")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method513() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("4479, " + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}
