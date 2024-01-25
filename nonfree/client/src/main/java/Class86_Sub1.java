import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	private final int anInt2488;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	private final int anInt2487;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	private final int anInt2491;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	private final int anInt2494;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIII)V")
	public Class86_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2488 = arg0;
		this.anInt2487 = arg1;
		this.anInt2491 = arg3;
		this.anInt2494 = arg2;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)V")
	@Override
	public void method9265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	@Override
	public void method9263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2488 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt2494 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2487 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt2491 * arg0 >> 12;
		Static265.method3856(super.anInt11131, local10, local17, local39, local24);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
	@Override
	public void method9264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
