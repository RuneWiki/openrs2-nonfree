import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public abstract class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	protected int anInt4299;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	public int anInt4300;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
	public int anInt4301;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
	protected int anInt4302;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	public int anInt4305;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
	public int anInt4308;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	protected Class4_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V")
	public abstract void method3454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
	public final void method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.anInt4300 << 3;
		@Pc(16) int local16 = (local8 & 0xF) + (arg0 << 4);
		@Pc(21) int local21 = this.anInt4305 << 3;
		@Pc(35) int local35 = (arg1 << 4) + (local21 & 0xF);
		this.method3466(local8, local21, local16, local35, arg3, arg2);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
	public abstract void method3460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V")
	public abstract void method3461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
	public abstract void method3462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)V")
	public abstract void method3463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIIII)V")
	public abstract void method3464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method3466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
