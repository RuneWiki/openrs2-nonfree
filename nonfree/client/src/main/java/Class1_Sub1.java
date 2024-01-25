import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
	public int anInt5368;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
	public final int anInt5374;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	public int anInt5370;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	protected final int anInt5363;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
	public int anInt5372;

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
	public int anInt5367;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
	public final int anInt5371;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5368 = arg0;
		this.anInt5374 = arg3;
		this.anInt5370 = arg2;
		this.anInt5363 = arg1;
		this.anInt5372 = arg4;
		this.anInt5367 = arg5;
		this.anInt5371 = arg6;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)I")
	public abstract int method4302();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public final void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	@Override
	public final void method5838() {
		throw new IllegalStateException();
	}
}
