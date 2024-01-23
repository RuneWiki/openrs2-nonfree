import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public abstract class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
	protected int anInt4866;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
	protected int anInt4868;

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
	public int anInt4869;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
	public int anInt4871;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
	public int anInt4874;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
	public int anInt4875;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub11() {
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
	public abstract void method3770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method3773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)V")
	public abstract void method3775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
	public final void method3776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anInt4871 << 3;
		@Pc(17) int local17 = (arg1 << 4) + (local8 & 0xF);
		@Pc(28) int local28 = this.anInt4875 << 3;
		@Pc(36) int local36 = (local28 & 0xF) + (arg2 << 4);
		this.method3773(local8, local28, local17, local36, arg0, arg3);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIII)V")
	public abstract void method3778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	public abstract void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIIII)V")
	public abstract void method3780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(II)V")
	public abstract void method3781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
