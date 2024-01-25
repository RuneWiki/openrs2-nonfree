import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class6_Sub4_Sub12 extends Class6_Sub4 {

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "J")
	private long aLong292 = -1L;

	@OriginalMember(owner = "client!sw", name = "n", descriptor = "Ljava/lang/String;")
	private String aString112 = null;

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
	private int anInt9188 = 0;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8892(this.anInt9188, this.aLong292, this.aString112);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		if (arg0.method3030() != 255) {
			arg0.anInt3174--;
			this.aLong292 = arg0.method3049();
		}
		this.aString112 = arg0.method2986();
		this.anInt9188 = arg0.method3018();
		if (Static682.aBoolean770) {
			System.out.println("memberhash:" + this.aLong292 + " membername:" + this.aString112);
		}
	}
}
