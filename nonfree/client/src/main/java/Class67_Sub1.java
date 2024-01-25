import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!es", name = "t", descriptor = "I")
	public final int anInt5251;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "I")
	public int anInt5252;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "I")
	public int anInt5247;

	@OriginalMember(owner = "client!es", name = "k", descriptor = "I")
	protected final int anInt5243;

	@OriginalMember(owner = "client!es", name = "n", descriptor = "I")
	public final int anInt5246;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "I")
	public int anInt5255;

	@OriginalMember(owner = "client!es", name = "z", descriptor = "I")
	public int anInt5256;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class67_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5251 = arg6;
		this.anInt5252 = arg0;
		this.anInt5247 = arg5;
		this.anInt5243 = arg1;
		this.anInt5246 = arg3;
		this.anInt5255 = arg4;
		this.anInt5256 = arg2;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(I)I")
	public abstract int method4498();

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(B)V")
	@Override
	public final void method5403() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public final void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method5399() {
		return false;
	}
}
