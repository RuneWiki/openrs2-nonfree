import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!nga", name = "r", descriptor = "I")
	private final int anInt6410;

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
	private final int anInt6401;

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
	private final int anInt6403;

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
	private final int anInt6409;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(IIIIIII)V")
	public Class62_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6410 = arg0;
		this.anInt6401 = arg3;
		this.anInt6403 = arg2;
		this.anInt6409 = arg1;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6410 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt6403 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt6409 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt6401 >> 12;
		Static251.method3684(local10, local21, super.anInt8333, local35, super.anInt8329, super.anInt8330, local28);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)V")
	@Override
	public void method6729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6410 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6403 >> 12;
		@Pc(29) int local29 = this.anInt6409 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt6401 >> 12;
		Static475.method6622(super.anInt8329, local17, super.anInt8330, local36, local10, local29);
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(III)V")
	@Override
	public void method6731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6410 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6403 >> 12;
		@Pc(28) int local28 = this.anInt6409 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt6401 >> 12;
		Static195.method5287(super.anInt8333, local35, local10, local17, local28);
	}
}
