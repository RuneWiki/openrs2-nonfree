import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!da", name = "A", descriptor = "Z")
	public boolean aBoolean425;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
	public abstract void method4893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
	public abstract boolean method4894();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
	public abstract boolean method4897();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)I")
	public final int method4898() {
		return 1;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	public abstract void method4899();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	public abstract void method4900(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Z")
	public final boolean method4901() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
	public abstract void method4902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Z")
	public final boolean method4903() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()I")
	public int method4905() {
		return 0;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(B)Z")
	public final boolean method4907() {
		return this.aBoolean425;
	}
}
