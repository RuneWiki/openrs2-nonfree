import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class5_Sub15_Sub10 extends Class5_Sub15 {

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "B")
	private byte aByte140;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "B")
	private byte aByte141;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "Z")
	private boolean aBoolean747;

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "B")
	private byte aByte142;

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "B")
	private byte aByte143;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.aByte121 = this.aByte141;
		arg0.aByte120 = this.aByte142;
		arg0.aByte119 = this.aByte140;
		arg0.aByte122 = this.aByte143;
		arg0.aBoolean564 = this.aBoolean747;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.aBoolean747 = arg0.method7291() == 1;
		this.aByte140 = arg0.method7318();
		this.aByte142 = arg0.method7318();
		this.aByte141 = arg0.method7318();
		this.aByte143 = arg0.method7318();
	}
}
