import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Z")
	public boolean aBoolean83;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "()V")
	public abstract void method905();

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
	public final int method907() {
		return 1;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "()I")
	public int method908() {
		return 0;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
	public abstract void method909(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	public abstract void method911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "()Z")
	public abstract boolean method912();

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V")
	public abstract void method913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)Z")
	public final boolean method915() {
		return this.aBoolean83;
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)Z")
	public final boolean method916() {
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)Z")
	public final boolean method918() {
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "()Z")
	public abstract boolean method919();
}
