import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public abstract class Class4_Sub3_Sub14 extends Class4_Sub3 {

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
	public int anInt5603;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
	protected int anInt5605;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
	protected int anInt5607;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
	public int anInt5609;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	public int anInt5610;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
	public int anInt5613;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	protected Class4_Sub3_Sub14() {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public abstract void method4541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	public abstract void method4543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
	public abstract void method4544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIII)V")
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anInt5603 << 3;
		@Pc(16) int local16 = (local4 & 0xF) + (arg2 << 4);
		@Pc(21) int local21 = this.anInt5613 << 3;
		@Pc(29) int local29 = (local21 & 0xF) + (arg0 << 4);
		this.method4545(local4, local21, local16, local29, arg1, arg3);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
	public abstract void method4547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)V")
	public abstract void method4548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
	public abstract void method4550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
