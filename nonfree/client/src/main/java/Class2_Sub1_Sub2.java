import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public abstract class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
	protected int anInt396;

	@OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
	protected int anInt399;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
	public int anInt401;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
	public int anInt402;

	@OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
	public int anInt403;

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	protected Class2_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIIII)V")
	public abstract void method270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V")
	public abstract void method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(IIIII)V")
	public final void method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anInt402 << 3;
		@Pc(16) int local16 = (local8 & 0xF) + (arg0 << 4);
		@Pc(21) int local21 = this.anInt405 << 3;
		@Pc(40) int local40 = (local21 & 0xF) + (arg3 << 4);
		this.method273(local21, local8, local40, local16, arg1, arg2);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
	public abstract void method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII)V")
	public abstract void method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIII)V")
	public abstract void method276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(II)V")
	public abstract void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
