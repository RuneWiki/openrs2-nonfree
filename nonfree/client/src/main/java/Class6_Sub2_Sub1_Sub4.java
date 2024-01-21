import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KWSTKWPH")
public final class Class6_Sub2_Sub1_Sub4 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!KWSTKWPH", name = "l", descriptor = "I")
	public int anInt347;

	@OriginalMember(owner = "client!KWSTKWPH", name = "m", descriptor = "I")
	public int anInt348;

	@OriginalMember(owner = "client!KWSTKWPH", name = "a", descriptor = "(Z)Lclient!WEVRTBOZ;")
	@Override
	protected Class6_Sub2_Sub1_Sub6 method482() {
		try {
			@Pc(9) Class19 local9 = Class19.method281(this.anInt347);
			return local9.method279(this.anInt348);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("28325, " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
