import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qka")
public final class Class6_Sub4_Sub11 extends Class6_Sub4 {

	@OriginalMember(owner = "client!qka", name = "s", descriptor = "J")
	private long aLong268 = -1L;

	@OriginalMember(owner = "client!qka", name = "t", descriptor = "Ljava/lang/String;")
	private String aString95 = null;

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		if (arg0.method3030() != 255) {
			arg0.anInt3174--;
			this.aLong268 = arg0.method3049();
		}
		this.aString95 = arg0.method2986();
		if (Static682.aBoolean770) {
			System.out.println("memberhash:" + this.aLong268 + " membername:" + this.aString95);
		}
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8892(0, this.aLong268, this.aString95);
	}
}
