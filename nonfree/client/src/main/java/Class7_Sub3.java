import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
	private final int anInt6679;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	private final int anInt6669;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	private final int anInt6676;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	private final int anInt6675;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIII)V")
	public Class7_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6679 = arg0;
		this.anInt6669 = arg3;
		this.anInt6676 = arg1;
		this.anInt6675 = arg2;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	@Override
	public void method6053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt6679 >> 12;
		@Pc(21) int local21 = this.anInt6675 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt6676 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt6669 * arg0 >> 12;
		Static284.method4948(local28, local21, local35, local14, super.anInt6830);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V")
	@Override
	public void method6054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
