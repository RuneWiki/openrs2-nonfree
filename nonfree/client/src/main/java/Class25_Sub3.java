import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	private int anInt3702;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	private int anInt3703;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	private int anInt3711;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	private int anInt3701;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class25_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3702 = arg2;
		this.anInt3703 = arg1;
		this.anInt3711 = arg3;
		this.anInt3701 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZI)V")
	@Override
	public void method3013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3701 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3702 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt3711 >> 12;
		@Pc(37) int local37 = this.anInt3703 * arg1 >> 12;
		Static252.method4079(super.anInt4038, local10, local17, super.anInt4035, local30, local37);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
	@Override
	public void method3008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3701 >> 12;
		@Pc(17) int local17 = this.anInt3703 * arg1 >> 12;
		@Pc(30) int local30 = this.anInt3702 * arg0 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt3711 >> 12;
		Static255.method4133(super.anInt4034, local30, local10, local17, local37);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
	@Override
	public void method3012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3701 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3702 >> 12;
		@Pc(28) int local28 = this.anInt3711 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt3703 * arg1 >> 12;
		Static53.method1022(local10, super.anInt4038, super.anInt4035, local35, super.anInt4034, local17, local28);
	}
}
