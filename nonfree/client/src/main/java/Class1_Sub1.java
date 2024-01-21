import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!w")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method548() {
		try {
			return null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("92296, " + 7 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
