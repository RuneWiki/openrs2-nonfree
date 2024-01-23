import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class68_Sub1 extends Class68 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
	private int anInt2369;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	private int anInt2374;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	private int anInt2368;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	private int anInt2370;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIII)V")
	public Class68_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2369 = arg2;
		this.anInt2374 = arg1;
		this.anInt2368 = arg0;
		this.anInt2370 = arg3;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt2368 * arg0 >> 12;
		@Pc(13) int local13 = arg1 * this.anInt2374 >> 12;
		@Pc(20) int local20 = this.anInt2370 * arg1 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt2369 >> 12;
		Static164.method3046(local13, local6, local20, local37, this.anInt6058);
	}
}
