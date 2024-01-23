import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	private int anInt2418;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
	private int anInt2412;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	private int anInt2414;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	private int anInt2411;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIII)V")
	public Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2418 = arg2;
		this.anInt2412 = arg0;
		this.anInt2414 = arg3;
		this.anInt2411 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
	@Override
	public void method3667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(III)V")
	@Override
	public void method3668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	@Override
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2412 >> 12;
		@Pc(25) int local25 = this.anInt2418 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt2414 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt2411 * arg1 >> 12;
		Static257.method3874(local10, local39, this.anInt4886, local25, local32);
	}
}
