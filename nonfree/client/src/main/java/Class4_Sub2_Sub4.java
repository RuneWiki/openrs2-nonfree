import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public abstract class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	public int anInt5185;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	protected int anInt5186;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
	protected int anInt5190;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	public int anInt5191;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	public int anInt5193;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
	public int anInt5195;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	protected Class4_Sub2_Sub4() {
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
	public abstract void method4135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIII)V")
	public abstract void method4136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method4137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIBI)V")
	public final void method4138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = this.anInt5185 << 3;
		@Pc(22) int local22 = (arg2 << 4) + (local9 & 0xF);
		@Pc(27) int local27 = this.anInt5195 << 3;
		@Pc(35) int local35 = (arg0 << 4) + (local27 & 0xF);
		this.method4137(local9, local27, local22, local35, arg3, arg1);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)V")
	public abstract void method4139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
	public abstract void method4141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(II)V")
	public abstract void method4142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public abstract void method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
