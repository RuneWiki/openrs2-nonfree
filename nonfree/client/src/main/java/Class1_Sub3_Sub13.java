import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public abstract class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
	public int anInt5571;

	@OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
	public int anInt5572;

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
	public int anInt5573;

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
	protected int anInt5574;

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
	public int anInt5575;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
	protected int anInt5577;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	protected Class1_Sub3_Sub13() {
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public abstract void method4204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
	public abstract void method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	public abstract void method4207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
	public abstract void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
	public abstract void method4209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)V")
	public abstract void method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method4211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBII)V")
	public final void method4213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = this.anInt5572 << 3;
		@Pc(20) int local20 = (local12 & 0xF) + (arg2 << 4);
		@Pc(25) int local25 = this.anInt5575 << 3;
		@Pc(33) int local33 = (arg0 << 4) + (local25 & 0xF);
		this.method4211(local12, local25, local20, local33, arg1, arg3);
	}
}
