import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!q", name = "B", descriptor = "I")
	private int anInt4163;

	@OriginalMember(owner = "client!q", name = "x", descriptor = "I")
	private int anInt4160;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "I")
	private int anInt4157;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "I")
	private int anInt4158;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIII)V")
	public Class44_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4163 = arg1;
		this.anInt4160 = arg2;
		this.anInt4157 = arg3;
		this.anInt4158 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
	@Override
	public void method4279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4158 >> 12;
		@Pc(23) int local23 = this.anInt4163 * arg0 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt4157 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt4160 >> 12;
		Static176.method2946(this.anInt4984, local37, local30, local10, local23);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(BII)V")
	@Override
	public void method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BII)V")
	@Override
	public void method4277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
