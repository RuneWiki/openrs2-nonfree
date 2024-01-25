import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class74_Sub3 extends Class74 {

	@OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
	private final int anInt3514;

	@OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
	private final int anInt3522;

	@OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
	private final int anInt3515;

	@OriginalMember(owner = "client!gha", name = "k", descriptor = "I")
	private final int anInt3520;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(IIIIIII)V")
	public Class74_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3514 = arg1;
		this.anInt3522 = arg0;
		this.anInt3515 = arg2;
		this.anInt3520 = arg3;
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(IBI)V")
	@Override
	public void method8219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3522 * arg0 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt3515 >> 12;
		@Pc(32) int local32 = this.anInt3514 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt3520 * arg1 >> 12;
		Static12.method130(super.anInt9644, local32, local25, local10, local39);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3522 >> 12;
		@Pc(21) int local21 = this.anInt3515 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt3514 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt3520 * arg1 >> 12;
		Static606.method8038(local21, local35, super.anInt9645, local10, local28, super.anInt9644, super.anInt9646);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)V")
	@Override
	public void method8221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3522 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt3515 >> 12;
		@Pc(28) int local28 = this.anInt3514 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt3520 >> 12;
		Static558.method7628(local28, super.anInt9645, local10, local35, local21, super.anInt9646);
	}
}
