import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public abstract class Class8_Sub1_Sub7 extends Class8_Sub1 {

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public int anInt3602;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
	public int anInt3603;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	protected int anInt3605;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	protected int anInt3607;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
	public int anInt3610;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
	public int anInt3611;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	protected Class8_Sub1_Sub7() {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public abstract void method2806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
	public abstract void method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
	public abstract void method2808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public abstract void method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	public abstract void method2811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
	public abstract void method2812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIII)V")
	public final void method2813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = this.anInt3611 << 3;
		@Pc(17) int local17 = (local9 & 0xF) + (arg1 << 4);
		@Pc(22) int local22 = this.anInt3610 << 3;
		@Pc(30) int local30 = (local22 & 0xF) + (arg0 << 4);
		this.method2814(local9, local22, local17, local30, arg2, arg3);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method2814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
