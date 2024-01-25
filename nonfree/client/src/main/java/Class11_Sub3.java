import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public final int anInt8623;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	protected final int anInt8619;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	public final int anInt8622;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
	public int anInt8625;

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
	public int anInt8627;

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
	public int anInt8628;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	public int anInt8617;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class11_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8623 = arg6;
		this.anInt8619 = arg1;
		this.anInt8622 = arg3;
		this.anInt8625 = arg0;
		this.anInt8627 = arg5;
		this.anInt8628 = arg4;
		this.anInt8617 = arg2;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public final void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8105() {
		return false;
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
	@Override
	public final void method8107() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)I")
	public abstract int method7208();
}
