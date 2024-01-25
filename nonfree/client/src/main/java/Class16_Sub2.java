import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public int anInt4551;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
	public int anInt4566;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public final int anInt4562;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public int anInt4550;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public int anInt4552;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	protected final int anInt4559;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
	public final int anInt4556;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class16_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4551 = arg5;
		this.anInt4566 = arg0;
		this.anInt4562 = arg3;
		this.anInt4550 = arg4;
		this.anInt4552 = arg2;
		this.anInt4559 = arg1;
		this.anInt4556 = arg6;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method5338() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)I")
	public abstract int method3583();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public final void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
	@Override
	public final void method5333() {
		throw new IllegalStateException();
	}
}
