import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	public int anInt4478;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "I")
	public int anInt4487;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "I")
	public final int anInt4483;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "I")
	public int anInt4485;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public int anInt4475;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "I")
	public final int anInt4488;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "I")
	protected final int anInt4479;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4478 = arg4;
		this.anInt4487 = arg2;
		this.anInt4483 = arg6;
		this.anInt4485 = arg0;
		this.anInt4475 = arg5;
		this.anInt4488 = arg3;
		this.anInt4479 = arg1;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public final void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)I")
	public abstract int method3586();

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	@Override
	public final void method6208() {
		throw new IllegalStateException();
	}
}
