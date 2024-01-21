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
			if (arg0 != 1) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("55762, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
