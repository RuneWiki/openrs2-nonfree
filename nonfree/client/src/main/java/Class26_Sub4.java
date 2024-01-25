import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class26_Sub4 extends Class26 {

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
	private final int anInt6423;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
	private final int anInt6419;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
	private final int anInt6421;

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
	private final int anInt6422;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class26_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6423 = arg3;
		this.anInt6419 = arg0;
		this.anInt6421 = arg2;
		this.anInt6422 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V")
	@Override
	public void method5412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6419 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6421 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt6422 >> 12;
		@Pc(35) int local35 = this.anInt6423 * arg0 >> 12;
		Static251.method4446(local24, local10, local35, local17, super.anInt6410, super.anInt6415, super.anInt6412);
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(III)V")
	@Override
	public void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6419 * arg0 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt6421 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt6422 >> 12;
		@Pc(37) int local37 = this.anInt6423 * arg1 >> 12;
		Static105.method2337(local23, local37, local10, local30, super.anInt6410);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
	@Override
	public void method5411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6419 >> 12;
		@Pc(17) int local17 = this.anInt6421 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt6422 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt6423 >> 12;
		Static47.method952(super.anInt6412, local39, local10, local24, local17, super.anInt6415);
	}
}
