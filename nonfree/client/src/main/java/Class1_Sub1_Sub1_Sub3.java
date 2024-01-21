import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public int anInt485;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method312(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class13 local3 = Class13.method316(this.anInt485);
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			return local3.method320(this.anInt486);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("13098, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
