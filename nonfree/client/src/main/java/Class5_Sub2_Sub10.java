import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public abstract class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
	public int anInt3209;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
	protected int anInt3210;

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
	public int anInt3212;

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
	protected int anInt3214;

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
	public int anInt3216;

	@OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
	public int anInt3219;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	protected Class5_Sub2_Sub10() {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	public abstract void method2403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
	public abstract void method2404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
	public abstract void method2405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V")
	public final void method2406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = this.anInt3216 << 3;
		@Pc(21) int local21 = (arg2 << 4) + (local13 & 0xF);
		@Pc(26) int local26 = this.anInt3219 << 3;
		@Pc(35) int local35 = (arg1 << 4) + (local26 & 0xF);
		this.method2410(local13, local26, local21, local35, arg3, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
	public abstract void method2407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIII)V")
	public abstract void method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V")
	public abstract void method2414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
