import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
	private int anInt2347;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt2354;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	private int anInt2343;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	private int anInt2342;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIII)V")
	public Class35_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2347 = arg1;
		this.anInt2354 = arg3;
		this.anInt2343 = arg2;
		this.anInt2342 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	@Override
	public void method4139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2342 >> 12;
		@Pc(17) int local17 = this.anInt2343 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2347 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt2354 * arg1 >> 12;
		Static205.method3213(local10, local35, local17, this.anInt5399, local24);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	@Override
	public void method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
