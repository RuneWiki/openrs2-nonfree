import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
	private final int anInt9189;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
	private final int anInt9193;

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
	private final int anInt9196;

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
	private final int anInt9191;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(IIIIIII)V")
	public Class22_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt9189 = arg3;
		this.anInt9193 = arg1;
		this.anInt9196 = arg0;
		this.anInt9191 = arg2;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt9196 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt9191 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt9193 >> 12;
		@Pc(37) int local37 = this.anInt9189 * arg0 >> 12;
		Static143.method2648(local30, local37, super.anInt9186, local10, local23);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)V")
	@Override
	public void method7937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BII)V")
	@Override
	public void method7939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt9196 >> 12;
		@Pc(17) int local17 = this.anInt9191 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt9193 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt9189 * arg0 >> 12;
		Static5.method367(local32, local17, super.anInt9186, local39, super.anInt9188, super.anInt9185, local10);
	}
}
