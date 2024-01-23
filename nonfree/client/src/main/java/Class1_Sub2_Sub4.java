import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public abstract class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
	protected int anInt1279;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
	public int anInt1280;

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
	protected int anInt1285;

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
	public int anInt1289;

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
	public int anInt1291;

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
	public int anInt1292;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub4() {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	public abstract void method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)V")
	public abstract void method887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
	public abstract void method888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	public abstract void method889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
	public final void method890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = this.anInt1289 << 3;
		@Pc(20) int local20 = (local12 & 0xF) + (arg0 << 4);
		@Pc(25) int local25 = this.anInt1280 << 3;
		@Pc(33) int local33 = (local25 & 0xF) + (arg2 << 4);
		this.method893(local12, local25, local20, local33, arg3, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	public abstract void method892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(IIIII)V")
	public abstract void method894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
