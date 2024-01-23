import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public abstract class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
	public int anInt5453;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
	protected int anInt5454;

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
	public int anInt5457;

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
	public int anInt5462;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
	protected int anInt5465;

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
	public int anInt5466;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	protected Class2_Sub3_Sub1() {
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)V")
	public abstract void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
	public abstract void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
	public abstract void method4363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method4365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)V")
	public abstract void method4367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIIII)V")
	public final void method4368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anInt5466 << 3;
		@Pc(17) int local17 = (arg3 << 4) + (local8 & 0xF);
		@Pc(22) int local22 = this.anInt5457 << 3;
		@Pc(30) int local30 = (arg0 << 4) + (local22 & 0xF);
		this.method4365(local8, local22, local17, local30, arg1, arg2);
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(II)V")
	public abstract void method4369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(IIIII)V")
	public abstract void method4371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
