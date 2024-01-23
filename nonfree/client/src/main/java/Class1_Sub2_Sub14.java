import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public abstract class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
	public int anInt3427;

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
	public int anInt3428;

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	public int anInt3430;

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
	protected int anInt3432;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
	protected int anInt3436;

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
	public int anInt3438;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub14() {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public abstract void method2719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)V")
	public abstract void method2720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
	public abstract void method2721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)V")
	public abstract void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)V")
	public abstract void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IIIII)V")
	public final void method2730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.anInt3428 << 3;
		@Pc(9) int local9 = this.anInt3427 << 3;
		@Pc(18) int local18 = (arg0 << 4) + (local4 & 0xF);
		@Pc(30) int local30 = (local9 & 0xF) + (arg2 << 4);
		this.method2729(local4, local9, local18, local30, arg1, arg3);
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(II)V")
	public abstract void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
