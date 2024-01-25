import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class6_Sub4_Sub8 extends Class6_Sub4 {

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	private int anInt7072;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!wfa;)V")
	@Override
	public void method8698(@OriginalArg(1) Class391 arg0) {
		arg0.method8903(this.aLong234, this.anInt7072);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8699(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt7072 = arg0.method3015();
		this.aLong234 = arg0.method3049();
	}
}
