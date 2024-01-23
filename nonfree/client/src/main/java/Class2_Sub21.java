import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "Z")
	public boolean aBoolean400;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "()Z")
	public abstract boolean method4722();

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "()I")
	public int method4726() {
		return 0;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "()Z")
	public abstract boolean method4731();

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)Z")
	public final boolean method4732() {
		return false;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(IIIII)V")
	public abstract void method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "()V")
	public abstract void method4734();

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)Z")
	public final boolean method4735() {
		return false;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
	public abstract void method4736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)I")
	public final int method4737() {
		return 1;
	}

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "(I)Z")
	public final boolean method4738() {
		return this.aBoolean400;
	}

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "(I)V")
	public abstract void method4739(@OriginalArg(0) int arg0);
}
