import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
	private int anInt456;

	@OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
	private int anInt455;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIIIII)V")
	public Class15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt456 = arg2;
		this.anInt455 = arg3;
		this.anInt449 = arg1;
		this.anInt452 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(III)V")
	@Override
	public void method4465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt456 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt452 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt449 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt455 >> 12;
		Static227.method3561(this.anInt5624, local23, local16, local37, local30);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)V")
	@Override
	public void method4464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt449 >> 12;
		@Pc(17) int local17 = this.anInt452 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt455 >> 12;
		@Pc(31) int local31 = this.anInt456 * arg0 >> 12;
		Static180.method3032(local17, local24, local31, this.anInt5625, local10, this.anInt5626);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
	@Override
	public void method4463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt452 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt449 >> 12;
		@Pc(28) int local28 = this.anInt455 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt456 * arg1 >> 12;
		Static128.method2194(local35, this.anInt5624, this.anInt5626, local17, local10, local28, this.anInt5625);
	}
}
