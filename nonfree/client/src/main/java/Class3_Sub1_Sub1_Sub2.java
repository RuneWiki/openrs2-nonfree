import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HMUIJBAH")
public final class Class3_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!HMUIJBAH", name = "l", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!HMUIJBAH", name = "m", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!HMUIJBAH", name = "n", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!HMUIJBAH", name = "a", descriptor = "(Z)Lclient!OQIGXOFQ;")
	@Override
	protected Class3_Sub1_Sub1_Sub3 method506() {
		try {
			@Pc(3) Class50 local3 = Class50.method562(this.anInt299);
			return local3.method569(this.anInt300);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("25840, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
