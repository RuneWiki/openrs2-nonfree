import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!w")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method560(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 2 / arg0;
			return null;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("75237, " + arg0 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}
}
