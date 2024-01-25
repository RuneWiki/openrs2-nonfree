import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	private final int anInt6246;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	private final int anInt6249;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	private final int anInt6244;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	private final int anInt6247;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class35_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6246 = arg3;
		this.anInt6249 = arg1;
		this.anInt6244 = arg2;
		this.anInt6247 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V")
	@Override
	public void method7551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt6247 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt6244 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt6249 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt6246 >> 12;
		Static220.method7550(super.anInt9246, local39, local25, local18, local32);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BII)V")
	@Override
	public void method7552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt6247 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt6244 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt6249 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt6246 >> 12;
		Static481.method7101(super.anInt9243, local25, super.anInt9245, local18, local32, local39);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	@Override
	public void method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6247 >> 12;
		@Pc(21) int local21 = this.anInt6244 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt6249 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt6246 >> 12;
		Static312.method5242(local21, super.anInt9246, local10, super.anInt9243, local35, super.anInt9245, local28);
	}
}
