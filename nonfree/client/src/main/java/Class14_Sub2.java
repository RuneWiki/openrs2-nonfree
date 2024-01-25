import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
	private final int anInt5567;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
	private final int anInt5560;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
	private final int anInt5564;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
	private final int anInt5565;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(IIIIII)V")
	public Class14_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5567 = arg1;
		this.anInt5560 = arg0;
		this.anInt5564 = arg2;
		this.anInt5565 = arg3;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
	@Override
	public void method5440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5560 >> 12;
		@Pc(17) int local17 = this.anInt5564 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5567 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt5565 >> 12;
		Static182.method3597(local10, local24, super.anInt6450, local39, local17);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)V")
	@Override
	public void method5442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
