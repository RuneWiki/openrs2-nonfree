import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
	public int anInt5533;

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
	public int anInt5532;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
	public final int anInt5529;

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
	public int anInt5524;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
	public final int anInt5535;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	protected final int anInt5528;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
	public int anInt5526;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5533 = arg2;
		this.anInt5532 = arg0;
		this.anInt5529 = arg6;
		this.anInt5524 = arg4;
		this.anInt5535 = arg3;
		this.anInt5528 = arg1;
		this.anInt5526 = arg5;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5889() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public final void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)I")
	public abstract int method4502();
}
