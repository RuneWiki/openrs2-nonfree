import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class74_Sub4 extends Class74 {

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	private int anInt6039;

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
	private int anInt6042;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	private int anInt6036;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
	private int anInt6041;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIIII)V")
	public Class74_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6039 = arg2;
		this.anInt6042 = arg3;
		this.anInt6036 = arg0;
		this.anInt6041 = arg1;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)V")
	@Override
	public void method4818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(III)V")
	@Override
	public void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	@Override
	public void method4816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6036 >> 12;
		@Pc(17) int local17 = this.anInt6041 * arg1 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6042 >> 12;
		@Pc(31) int local31 = this.anInt6039 * arg0 >> 12;
		Static261.method4341(local31, local17, local10, local24, this.anInt6030);
	}
}
