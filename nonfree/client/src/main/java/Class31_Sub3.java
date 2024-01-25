import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
	private final int anInt3805;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
	private final int anInt3812;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	private final int anInt3804;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
	private final int anInt3808;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class31_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3805 = arg3;
		this.anInt3812 = arg1;
		this.anInt3804 = arg2;
		this.anInt3808 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3808 >> 12;
		@Pc(17) int local17 = this.anInt3804 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt3812 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt3805 >> 12;
		Static365.method5224(local24, super.anInt3958, local39, local10, super.anInt3954, local17);
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIB)V")
	@Override
	public void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3808 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3804 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3812 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt3805 >> 12;
		Static393.method5530(super.anInt3955, local24, local17, local10, local35, super.anInt3954, super.anInt3958);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3808 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt3804 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt3812 >> 12;
		@Pc(31) int local31 = this.anInt3805 * arg0 >> 12;
		Static262.method4242(local17, super.anInt3955, local31, local24, local10);
	}
}
