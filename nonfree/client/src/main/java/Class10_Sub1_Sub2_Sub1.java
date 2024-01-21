import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HRIUIFAV")
public final class Class10_Sub1_Sub2_Sub1 extends Class10_Sub1_Sub2 {

	@OriginalMember(owner = "client!HRIUIFAV", name = "m", descriptor = "I")
	public int anInt211;

	@OriginalMember(owner = "client!HRIUIFAV", name = "n", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!HRIUIFAV", name = "o", descriptor = "I")
	public int anInt213;

	@OriginalMember(owner = "client!HRIUIFAV", name = "a", descriptor = "(B)Lclient!LZYQDKJV;")
	@Override
	protected Class10_Sub1_Sub2_Sub4 method537(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 3) {
				this.anInt212 = -358;
			}
			@Pc(9) Class17 local9 = Class17.method104(this.anInt211);
			return local9.method112(this.anInt213);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("1325, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
