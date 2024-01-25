import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	private final int anInt3289;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	private final int anInt3292;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	private final int anInt3285;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	private final int anInt3284;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIII)V")
	public Class38_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3289 = arg3;
		this.anInt3292 = arg2;
		this.anInt3285 = arg1;
		this.anInt3284 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	@Override
	public void method5171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3284 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt3292 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt3285 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt3289 * arg0 >> 12;
		Static517.method6762(local24, local10, local17, local35, super.anInt6088);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V")
	@Override
	public void method5175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
