import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public final class Class5_Sub15_Sub11 extends Class5_Sub15 {

	@OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
	private int anInt10660 = -1;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.anInt10660 = arg0.method7333();
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7389(this.anInt10660);
	}
}
