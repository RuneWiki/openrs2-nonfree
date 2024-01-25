import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public final int anInt6728;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	public int anInt6734;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	public final int anInt6740;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
	public int anInt6733;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
	public int anInt6739;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
	public int anInt6738;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	protected final int anInt6729;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class11_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6728 = arg3;
		this.anInt6734 = arg0;
		this.anInt6740 = arg6;
		this.anInt6733 = arg2;
		this.anInt6739 = arg5;
		this.anInt6738 = arg4;
		this.anInt6729 = arg1;
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)I")
	public abstract int method5439();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public final void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6307() {
		throw new IllegalStateException();
	}
}
