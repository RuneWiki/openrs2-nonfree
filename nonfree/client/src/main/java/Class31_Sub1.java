import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
	private final int anInt1207;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	private final int anInt1211;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	private final int anInt1213;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
	private final int anInt1209;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIII)V")
	public Class31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1207 = arg1;
		this.anInt1211 = arg2;
		this.anInt1213 = arg0;
		this.anInt1209 = arg3;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
	@Override
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt1213 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1211 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt1207 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt1209 >> 12;
		Static67.method1000(local17, local35, super.anInt3936, local28, local6);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
	@Override
	public void method2819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
