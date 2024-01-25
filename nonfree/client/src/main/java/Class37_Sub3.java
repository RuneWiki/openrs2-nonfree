import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class37_Sub3 extends Class37 {

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
	private final int anInt4034;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
	private final int anInt4035;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	private final int anInt4039;

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
	private final int anInt4044;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class37_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4034 = arg3;
		this.anInt4035 = arg2;
		this.anInt4039 = arg0;
		this.anInt4044 = arg1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4039 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4035 >> 12;
		@Pc(24) int local24 = this.anInt4044 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt4034 * arg1 >> 12;
		Static176.method3609(local24, super.anInt5257, super.anInt5259, local10, local17, local31, super.anInt5256);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)V")
	@Override
	public void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4039 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4035 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4044 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt4034 >> 12;
		Static45.method1111(local17, local10, local31, local24, super.anInt5256, super.anInt5259);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt4039 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt4035 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt4044 >> 12;
		@Pc(37) int local37 = this.anInt4034 * arg1 >> 12;
		Static346.method5896(local16, local30, local37, super.anInt5257, local23);
	}
}
