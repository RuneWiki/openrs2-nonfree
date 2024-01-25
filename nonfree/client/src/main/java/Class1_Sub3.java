import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public int anInt2733;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	public final int anInt2740;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
	protected final int anInt2738;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public final int anInt2741;

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	public int anInt2744;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
	public int anInt2743;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public int anInt2737;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2733 = arg5;
		this.anInt2740 = arg6;
		this.anInt2738 = arg1;
		this.anInt2741 = arg3;
		this.anInt2744 = arg4;
		this.anInt2743 = arg0;
		this.anInt2737 = arg2;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	@Override
	public final void method7675() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public final void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)I")
	public abstract int method2595();
}
