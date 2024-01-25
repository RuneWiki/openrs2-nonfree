import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
	public int anInt9342;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
	public int anInt9336;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	protected final int anInt9337;

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
	public final int anInt9345;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
	public final int anInt9344;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	public int anInt9340;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	public int anInt9335;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9342 = arg2;
		this.anInt9336 = arg0;
		this.anInt9337 = arg1;
		this.anInt9345 = arg6;
		this.anInt9344 = arg3;
		this.anInt9340 = arg4;
		this.anInt9335 = arg5;
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)I")
	public abstract int method7720();

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public final void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7743() {
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	@Override
	public final void method7752() {
		throw new IllegalStateException();
	}
}
