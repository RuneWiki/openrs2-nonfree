import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public abstract class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	protected int anInt3485;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
	public int anInt3486;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
	public int anInt3489;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
	public int anInt3491;

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
	protected int anInt3492;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
	public int anInt3493;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	protected Class2_Sub2_Sub16() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
	public abstract void method2395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
	public abstract void method2396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method2397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZIIII)V")
	public final void method2398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anInt3486 << 3;
		@Pc(16) int local16 = (local8 & 0xF) + (arg0 << 4);
		@Pc(21) int local21 = this.anInt3489 << 3;
		@Pc(29) int local29 = (local21 & 0xF) + (arg1 << 4);
		this.method2397(local21, local8, local29, local16, arg3, arg2);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	public abstract void method2401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public abstract void method2404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIII)V")
	public abstract void method2406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V")
	public abstract void method2407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
