import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!so", name = "x", descriptor = "I")
	protected final int anInt4393;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "I")
	public int anInt4377;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "I")
	public int anInt4391;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "I")
	public int anInt4386;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "I")
	public int anInt4381;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "I")
	public final int anInt4382;

	@OriginalMember(owner = "client!so", name = "w", descriptor = "I")
	public final int anInt4392;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4393 = arg1;
		this.anInt4377 = arg2;
		this.anInt4391 = arg4;
		this.anInt4386 = arg0;
		this.anInt4381 = arg5;
		this.anInt4382 = arg6;
		this.anInt4392 = arg3;
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V")
	@Override
	public final void method6022() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(B)I")
	public abstract int method3486();

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public final void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
