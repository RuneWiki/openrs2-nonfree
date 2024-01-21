import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YSIOSDRV")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!YSIOSDRV", name = "n", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!YSIOSDRV", name = "o", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!YSIOSDRV", name = "m", descriptor = "I")
	private int anInt767 = 5;

	@OriginalMember(owner = "client!YSIOSDRV", name = "a", descriptor = "(I)Lclient!JLNSJQDR;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method509(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class23 local3 = Class23.method320(this.anInt768);
			if (arg0 < this.anInt767 || arg0 > this.anInt767) {
				throw new NullPointerException();
			}
			return local3.method331(this.anInt769);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("81748, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}
}
