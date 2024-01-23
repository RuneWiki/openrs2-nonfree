import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public abstract class Class2_Sub8_Sub1 extends Class2_Sub8 {

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
	public int anInt5514;

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
	public int anInt5516;

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
	public int anInt5517;

	@OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
	protected int anInt5519;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
	public int anInt5520;

	@OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
	protected int anInt5522;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	protected Class2_Sub8_Sub1() {
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
	public abstract void method4361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(IIIII)V")
	public abstract void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
	public abstract void method4364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V")
	public abstract void method4365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method4367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)V")
	public abstract void method4368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)V")
	public abstract void method4371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIB)V")
	public final void method4375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.anInt5520 << 3;
		@Pc(16) int local16 = (arg1 << 4) + (local8 & 0xF);
		@Pc(27) int local27 = this.anInt5516 << 3;
		@Pc(35) int local35 = (local27 & 0xF) + (arg2 << 4);
		this.method4367(local8, local27, local16, local35, arg3, arg0);
	}
}
