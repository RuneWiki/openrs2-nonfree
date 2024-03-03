import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class173_Sub3 extends Class173 {

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
	private final int anInt5705;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
	private final int anInt5711;

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
	private final int anInt5710;

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
	private final int anInt5707;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIII)V", line = 173)
	public Class173_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5705 = arg3;
		this.anInt5711 = arg1;
		this.anInt5710 = arg0;
		this.anInt5707 = arg2;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 74)
	@Override
	public void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5710 >> 12;
		@Pc(17) int local17 = this.anInt5707 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt5711 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt5705 * arg0 >> 12;
		Static112.method2379(local10, local31, local17, super.anInt6985, super.anInt6983, local24);
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)V", line = 151)
	@Override
	public void method6252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5710 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt5707 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt5711 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt5705 >> 12;
		Static169.method3373(super.anInt6985, local37, local30, super.anInt6983, local10, local23, super.anInt6984);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V", line = 186)
	@Override
	public void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5710 >> 12;
		@Pc(17) int local17 = this.anInt5707 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt5711 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5705 >> 12;
		Static53.method1624(local31, local17, local24, super.anInt6984, local10);
	}
}
