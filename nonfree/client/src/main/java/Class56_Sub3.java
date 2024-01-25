import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class56_Sub3 extends Class56 {

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
	private final int anInt3891;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
	private final int anInt3899;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
	private final int anInt3898;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
	private final int anInt3895;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(IIIIII)V")
	public Class56_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3891 = arg3;
		this.anInt3899 = arg1;
		this.anInt3898 = arg2;
		this.anInt3895 = arg0;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt3895 * arg1 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt3898 >> 12;
		@Pc(30) int local30 = this.anInt3899 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt3891 * arg0 >> 12;
		Static556.method8104(local23, local16, super.anInt5408, local37, local30);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)V")
	@Override
	public void method4856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
