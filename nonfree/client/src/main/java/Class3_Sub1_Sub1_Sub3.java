import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FIJVWXBZ")
public final class Class3_Sub1_Sub1_Sub3 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!FIJVWXBZ", name = "l", descriptor = "I")
	public int anInt114;

	@OriginalMember(owner = "client!FIJVWXBZ", name = "m", descriptor = "I")
	public int anInt115;

	@OriginalMember(owner = "client!FIJVWXBZ", name = "a", descriptor = "(Z)Lclient!CSGBDGDY;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method535() {
		try {
			@Pc(9) Class12 local9 = Class12.method179(this.anInt115);
			return local9.method183(this.anInt114);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("85672, " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
