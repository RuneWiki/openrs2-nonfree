import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public abstract class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!in", name = "y", descriptor = "I")
	public int anInt5875;

	@OriginalMember(owner = "client!in", name = "z", descriptor = "I")
	protected int anInt5876;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "I")
	protected int anInt5882;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "I")
	public int anInt5884;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "I")
	public int anInt5887;

	@OriginalMember(owner = "client!in", name = "R", descriptor = "I")
	public int anInt5889;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub3() {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method4627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
	public abstract void method4628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIII)V")
	public abstract void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IIII)V")
	public abstract void method4631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
	public abstract void method4632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
	public abstract void method4635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IIIII)V")
	public final void method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = this.anInt5884 << 3;
		@Pc(17) int local17 = this.anInt5889 << 3;
		@Pc(26) int local26 = (arg2 << 4) + (local12 & 0xF);
		@Pc(34) int local34 = (local17 & 0xF) + (arg1 << 4);
		this.method4627(local17, local12, local34, local26, arg3, arg0);
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(II)V")
	public abstract void method4637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
