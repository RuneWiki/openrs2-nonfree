import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class Class10_Sub5 extends Class10 {

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
	public int anInt2761;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public int anInt2762;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Z")
	public boolean aBoolean226;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
	public int anInt2766;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5824() {
		return false;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5819() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public final void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
