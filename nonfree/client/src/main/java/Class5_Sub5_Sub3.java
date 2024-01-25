import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class5_Sub5_Sub3 extends Class5_Sub5 {

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
	private int anInt2680;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
	private int anInt2682;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
	private int anInt2684;

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
	private int anInt2687;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5430(this.anInt2684, this.anInt2687, this.anInt2680, this.anInt2682);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt2684 = arg0.method3671();
		this.anInt2687 = arg0.method3671();
		this.anInt2682 = arg0.method3642();
		this.anInt2680 = arg0.method3642();
	}
}
