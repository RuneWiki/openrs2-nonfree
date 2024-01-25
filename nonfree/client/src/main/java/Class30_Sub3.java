import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
	private final int anInt6746;

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
	private final int anInt6743;

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
	private final int anInt6745;

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
	private final int anInt6741;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(IIIIII)V")
	public Class30_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6746 = arg3;
		this.anInt6743 = arg2;
		this.anInt6745 = arg1;
		this.anInt6741 = arg0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)V")
	@Override
	public void method7659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(III)V")
	@Override
	public void method7660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt6741 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt6743 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt6745 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt6746 * arg1 >> 12;
		Static320.method5003(local23, local37, super.anInt9988, local30, local16);
	}
}
