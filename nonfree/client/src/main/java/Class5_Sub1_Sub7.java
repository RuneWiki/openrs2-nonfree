import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class5_Sub1_Sub7 extends Class5_Sub1 {

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "Ljava/lang/String;")
	private String aString42 = null;

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "J")
	private long aLong132 = -1L;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		if (arg0.method7816() != 255) {
			arg0.anInt9230--;
			this.aLong132 = arg0.method7823();
		}
		this.aString42 = arg0.method7815();
		if (Static118.aBoolean228) {
			System.out.println("memberhash:" + this.aLong132 + " membername:" + this.aString42);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.method4091(this.aString42, this.aLong132);
	}
}
