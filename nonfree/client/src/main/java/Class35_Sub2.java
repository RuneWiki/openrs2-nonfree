import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private final int anInt2420;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	private final int anInt2427;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
	private final int anInt2428;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
	private final int anInt2430;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIII)V")
	public Class35_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2420 = arg2;
		this.anInt2427 = arg0;
		this.anInt2428 = arg1;
		this.anInt2430 = arg3;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZII)V")
	@Override
	public void method3114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt2427 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt2420 >> 12;
		@Pc(32) int local32 = this.anInt2428 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt2430 * arg0 >> 12;
		Static44.method907(local18, local25, local32, super.anInt4071, local39);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	@Override
	public void method3115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
