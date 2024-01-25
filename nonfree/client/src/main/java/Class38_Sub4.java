import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class38_Sub4 extends Class38 {

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
	private final int anInt6093;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
	private final int anInt6097;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	private final int anInt6098;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	private final int anInt6096;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIIII)V")
	public Class38_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6093 = arg3;
		this.anInt6097 = arg2;
		this.anInt6098 = arg0;
		this.anInt6096 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)V")
	@Override
	public void method5175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6098 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6097 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt6096 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt6093 * arg1 >> 12;
		Static285.method4046(local10, local24, super.anInt6088, super.anInt6090, local36, super.anInt6087, local17);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
	@Override
	public void method5171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6098 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6097 >> 12;
		@Pc(24) int local24 = this.anInt6096 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt6093 >> 12;
		Static82.method1312(local10, super.anInt6090, local17, super.anInt6088, local24, local31);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6098 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6097 >> 12;
		@Pc(24) int local24 = this.anInt6096 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt6093 >> 12;
		Static316.method4905(local17, local24, local37, super.anInt6087, local10);
	}
}
