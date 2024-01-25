import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class14_Sub11_Sub2 extends Class14_Sub11 {

	@OriginalMember(owner = "client!eca", name = "r", descriptor = "I")
	private int anInt2010;

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method347(this.anInt2010, this.aLong85);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		this.anInt2010 = arg0.method7748();
		this.aLong85 = arg0.method7729();
	}
}
