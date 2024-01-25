import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class5_Sub5_Sub10 extends Class5_Sub5 {

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "B")
	private byte aByte124;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	private int anInt9393 = -1;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5425(this.aByte124, this.anInt9393);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt9393 = arg0.method3698();
		this.aByte124 = arg0.method3677();
	}
}
