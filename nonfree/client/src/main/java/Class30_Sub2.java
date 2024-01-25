import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!f", name = "n", descriptor = "I")
	public final int anInt7382;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	protected final int anInt7379;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "I")
	public int anInt7385;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	public int anInt7380;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "I")
	public int anInt7381;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "I")
	public int anInt7376;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	public final int anInt7377;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7382 = arg3;
		this.anInt7379 = arg1;
		this.anInt7385 = arg2;
		this.anInt7380 = arg4;
		this.anInt7381 = arg5;
		this.anInt7376 = arg0;
		this.anInt7377 = arg6;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
	@Override
	public final void method5721() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public final void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method5719() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)I")
	public abstract int method5620();
}
