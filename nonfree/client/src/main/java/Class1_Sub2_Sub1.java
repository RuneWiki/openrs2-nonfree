import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public abstract class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!te", name = "G", descriptor = "I")
	public int anInt2634;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!te", name = "J", descriptor = "I")
	protected int anInt2636;

	@OriginalMember(owner = "client!te", name = "K", descriptor = "I")
	protected int anInt2637;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "I")
	public int anInt2638;

	@OriginalMember(owner = "client!te", name = "R", descriptor = "I")
	public int anInt2641;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(II)V")
	public abstract void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(IIIII)V")
	public abstract void method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
	public abstract void method2066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(II)V")
	public abstract void method2067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIII)V")
	public final void method2068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anInt2635 << 3;
		@Pc(12) int local12 = (local4 & 0xF) + (arg2 << 4);
		@Pc(21) int local21 = this.anInt2638 << 3;
		@Pc(29) int local29 = (arg3 << 4) + (local21 & 0xF);
		this.method2070(local4, local21, local12, local29, arg0, arg1);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)V")
	public abstract void method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method2070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	public abstract void method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
