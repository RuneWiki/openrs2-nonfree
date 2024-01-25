import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class5_Sub15_Sub1 extends Class5_Sub15 {

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
	private int anInt1728 = -1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7394(this.anInt1728);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.anInt1728 = arg0.method7333();
	}
}
