import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public int anInt6392;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public int anInt6386;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public int anInt6384;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
	protected final int anInt6397;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	public int anInt6394;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	public final int anInt6388;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public final int anInt6385;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6392 = arg0;
		this.anInt6386 = arg4;
		this.anInt6384 = arg2;
		this.anInt6397 = arg1;
		this.anInt6394 = arg5;
		this.anInt6388 = arg3;
		this.anInt6385 = arg6;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
	@Override
	public final void method5938() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)I")
	public abstract int method5319();

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method5942() {
		return false;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public final void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
		throw new IllegalStateException();
	}
}
