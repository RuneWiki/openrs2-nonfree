import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public abstract class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
	public int anInt2519;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	protected int anInt2523;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	public int anInt2524;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
	public int anInt2525;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
	public int anInt2527;

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
	protected int anInt2529;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	protected Class2_Sub2_Sub17() {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
	public abstract void method1905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	public abstract void method1907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)V")
	public abstract void method1909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public abstract void method1910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
	public abstract void method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIIII)V")
	public final void method1912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anInt2519 << 3;
		@Pc(24) int local24 = this.anInt2525 << 3;
		@Pc(32) int local32 = (local24 & 0xF) + (arg3 << 4);
		@Pc(41) int local41 = (arg0 << 4) + (local4 & 0xF);
		this.method1915(local24, local4, local32, local41, arg2, arg1);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIII)V")
	public abstract void method1914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method1915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
