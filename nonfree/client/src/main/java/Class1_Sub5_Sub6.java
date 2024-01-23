import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public abstract class Class1_Sub5_Sub6 extends Class1_Sub5 {

	@OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
	public int anInt3617;

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
	protected int anInt3618;

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
	protected int anInt3619;

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
	public int anInt3620;

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
	public int anInt3625;

	@OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
	public int anInt3626;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	protected Class1_Sub5_Sub6() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	public abstract void method3195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIIII)V")
	public final void method3196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anInt3620 << 3;
		@Pc(16) int local16 = (local8 & 0xF) + (arg2 << 4);
		@Pc(21) int local21 = this.anInt3626 << 3;
		@Pc(30) int local30 = (arg0 << 4) + (local21 & 0xF);
		this.method3204(local8, local21, local16, local30, arg1, arg3);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
	public abstract void method3200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)V")
	public abstract void method3201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
	public abstract void method3202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method3204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)V")
	public abstract void method3205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)V")
	public abstract void method3206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
