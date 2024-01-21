import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			@Pc(9) Class15 local9 = Class15.method361(this.anInt189);
			return local9.method365(this.anInt190);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("30234, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
