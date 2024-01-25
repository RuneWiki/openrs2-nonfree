import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!al", name = "s", descriptor = "I")
	public final int anInt3793;

	@OriginalMember(owner = "client!al", name = "u", descriptor = "I")
	public int anInt3794;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "I")
	public int anInt3791;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "I")
	public int anInt3787;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	public int anInt3789;

	@OriginalMember(owner = "client!al", name = "v", descriptor = "I")
	protected final int anInt3795;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	public final int anInt3790;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3793 = arg3;
		this.anInt3794 = arg5;
		this.anInt3791 = arg4;
		this.anInt3787 = arg0;
		this.anInt3789 = arg2;
		this.anInt3795 = arg1;
		this.anInt3790 = arg6;
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method5895() {
		return false;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	@Override
	public final void method5896() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public final void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)I")
	public abstract int method3426();
}
