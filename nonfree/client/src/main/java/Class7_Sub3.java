import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
	public int anInt3660;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
	protected final int anInt3663;

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
	public int anInt3664;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
	public int anInt3665;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
	public final int anInt3658;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
	public int anInt3661;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
	public final int anInt3662;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class7_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3660 = arg5;
		this.anInt3663 = arg1;
		this.anInt3664 = arg4;
		this.anInt3665 = arg2;
		this.anInt3658 = arg6;
		this.anInt3661 = arg0;
		this.anInt3662 = arg3;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I")
	public abstract int method2922();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public final void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
	@Override
	public final void method5268() {
		throw new IllegalStateException();
	}
}
