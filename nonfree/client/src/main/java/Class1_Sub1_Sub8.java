import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public abstract class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
	public int anInt2984;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
	public int anInt2985;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
	public int anInt2986;

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
	protected int anInt2991;

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
	public int anInt2992;

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
	protected int anInt2995;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub8() {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	public abstract void method2417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)V")
	public abstract void method2420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
	public final void method2421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anInt2986 << 3;
		@Pc(26) int local26 = (local8 & 0xF) + (arg0 << 4);
		@Pc(31) int local31 = this.anInt2992 << 3;
		@Pc(40) int local40 = (arg1 << 4) + (local31 & 0xF);
		this.method2427(local8, local31, local26, local40, arg3, arg2);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIII)V")
	public abstract void method2423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)V")
	public abstract void method2424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
	public abstract void method2425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method2427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIII)V")
	public abstract void method2428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
