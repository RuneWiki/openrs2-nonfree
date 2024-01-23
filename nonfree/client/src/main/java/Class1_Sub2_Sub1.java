import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public abstract class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
	public int anInt4444;

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
	public int anInt4446;

	@OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
	public int anInt4447;

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
	protected int anInt4450;

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
	protected int anInt4451;

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
	public int anInt4454;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBIII)V")
	public final void method3838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anInt4447 << 3;
		@Pc(26) int local26 = (local8 & 0xF) + (arg2 << 4);
		@Pc(31) int local31 = this.anInt4446 << 3;
		@Pc(39) int local39 = (arg0 << 4) + (local31 & 0xF);
		this.method3844(local8, local31, local26, local39, arg3, arg1);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V")
	public abstract void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public abstract void method3841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method3844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)V")
	public abstract void method3845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(II)V")
	public abstract void method3846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V")
	public abstract void method3847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V")
	public abstract void method3848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
