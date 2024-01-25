import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
	private final int anInt903;

	@OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
	private final int anInt909;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
	private final int anInt902;

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
	private final int anInt904;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIII)V")
	public Class31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt903 = arg1;
		this.anInt909 = arg0;
		this.anInt902 = arg3;
		this.anInt904 = arg2;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt909 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt904 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt903 >> 12;
		@Pc(35) int local35 = this.anInt902 * arg0 >> 12;
		Static78.method1654(local14, super.anInt3955, local35, local28, local21);
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(IIB)V")
	@Override
	public void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt909 * arg0 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt904 >> 12;
		@Pc(31) int local31 = this.anInt903 * arg1 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt902 >> 12;
		Static379.method5369(local31, super.anInt3958, local38, super.anInt3955, local24, local10, super.anInt3954);
	}
}
