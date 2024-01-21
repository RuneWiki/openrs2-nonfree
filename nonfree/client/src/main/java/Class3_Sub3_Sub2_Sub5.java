import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RLKSHOQT")
public final class Class3_Sub3_Sub2_Sub5 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!RLKSHOQT", name = "m", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!RLKSHOQT", name = "n", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!RLKSHOQT", name = "a", descriptor = "(I)Lclient!FCIDIKVY;")
	@Override
	protected Class3_Sub3_Sub2_Sub3 method525() {
		try {
			@Pc(3) Class1 local3 = Class1.method7(this.anInt622);
			return local3.method1(this.anInt621);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("99512, " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
